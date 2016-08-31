package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Identity_list" android:label="Identity: List" />
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.*;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.location.Location;
import android.view.KeyEvent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Button;
import Common.*;

public class Identity_list extends Activity {
    boolean netwoekAvailable=false;
    Location currentLocation;
    double currentLatitude,currentLongitude;
    //Disabled Back/Home key
    //--------------------------------------------------------------------------------------------------
    @Override
    public boolean onKeyDown(int iKeyCode, KeyEvent event)
    {
        if(iKeyCode == KeyEvent.KEYCODE_BACK || iKeyCode == KeyEvent.KEYCODE_HOME)
        { return false; }
        else { return true;  }
    }
    String VariableID;
    private int hour;
    private int minute;
    private int mDay;
    private int mMonth;
    private int mYear;
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;

    Connection C;
    Global g;
    SimpleAdapter dataAdapter;
    ArrayList<HashMap<String, String>> dataList = new ArrayList<HashMap<String, String>>();
    static String TableName;

    TextView lblHeading;
    Button btnAdd;
    Button btnRefresh;

    String StartTime;
    static String SHUCHONAID = "";
    static String RND = "";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            setContentView(R.layout.identity_list);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();

            TableName = "Identity";
            lblHeading = (TextView)findViewById(R.id.lblHeading);
            lblHeading.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    final int DRAWABLE_RIGHT  = 2;
                    if(event.getAction() == MotionEvent.ACTION_DOWN) {
                        if(event.getRawX() >= (lblHeading.getRight() - lblHeading.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                            AlertDialog.Builder adb = new AlertDialog.Builder(Identity_list.this);
                            adb.setTitle("Close");
                            adb.setMessage("Do you want to close this form[Yes/No]?");
                            adb.setNegativeButton("No", null);
                            adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                }});
                            adb.show();
                            return true;
                        }
                    }
                    return false;
                }
            });

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Identity_list.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }});
                    adb.show();
                }});

            btnRefresh = (Button) findViewById(R.id.btnRefresh);
            btnRefresh.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    //write your code here
                    DataSearch(SHUCHONAID, RND);

                }});

            btnAdd   = (Button) findViewById(R.id.btnAdd);
            btnAdd.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("ShuchonaID", "");
                    IDbundle.putString("Rnd", "");
                    Intent intent = new Intent(getApplicationContext(), Identity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtras(IDbundle);
                    getApplicationContext().startActivity(intent);

                }});


            DataSearch(SHUCHONAID, RND);


        }
        catch(Exception  e)
        {
            Connection.MessageBox(Identity_list.this, e.getMessage());
            return;
        }
    }
    private void DataSearch(String ShuchonaID, String Rnd)
    {
        try
        {

            Identity_DataModel d = new Identity_DataModel();
            String SQL = "Select * from "+ TableName +"  Where ShuchonaID='"+ ShuchonaID +"' and Rnd='"+ Rnd +"'";
            List<Identity_DataModel> data = d.SelectAll(this, SQL);
            dataList.clear();

            dataAdapter = null;

            ListView list = (ListView)findViewById(R.id.lstData);
            HashMap<String, String> map;

            for(Identity_DataModel item : data){
                map = new HashMap<String, String>();
                map.put("AgeGroup", item.getAgeGroup());
                map.put("Result", item.getResult());
                map.put("OthResult", item.getOthResult());
                map.put("H01", item.getH01());
                map.put("H02", item.getH02());
                map.put("H03", item.getH03());
                map.put("H04", item.getH04());
                map.put("H05", item.getH05());
                map.put("H06", item.getH06());
                map.put("H07", item.getH07());
                map.put("H07a", item.getH07a());
                map.put("Dist", item.getDist());
                map.put("Upz", item.getUpz());
                map.put("Un", item.getUn());
                map.put("Vill", item.getVill());
                map.put("H11", item.getH11());
                map.put("H12", item.getH12());
                map.put("H12x", item.getH12x());
                map.put("ShuchonaID", item.getShuchonaID());
                map.put("H14", item.getH14().toString().length()==0 ? "" : Global.DateConvertDMY(item.getH14()));
                map.put("H15", item.getH15());
                map.put("H17", item.getH17());
                map.put("Rnd", item.getRnd());
                dataList.add(map);
            }
            dataAdapter = new SimpleAdapter(Identity_list.this, dataList, R.layout.identity_list,new String[] {"rowsec"},
                    new int[] {R.id.secListRow});
            list.setAdapter(new DataListAdapter(this, dataAdapter));
        }
        catch(Exception  e)
        {
            Connection.MessageBox(Identity_list.this, e.getMessage());
            return;
        }
    }


    public class DataListAdapter extends BaseAdapter
    {
        private Context context;
        private SimpleAdapter dataAdap;

        public DataListAdapter(Context c, SimpleAdapter da){ context = c;  dataAdap = da; }
        public int getCount() {  return dataAdap.getCount();  }
        public Object getItem(int position) {  return position;  }
        public long getItemId(int position) {  return position;  }
        public View getView(final int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            if (convertView == null) {
                convertView = inflater.inflate(R.layout.identity_row, null);
            }
            LinearLayout   secListRow = (LinearLayout)convertView.findViewById(R.id.secListRow);

            final TextView AgeGroup = (TextView)convertView.findViewById(R.id.AgeGroup);
            final TextView Result = (TextView)convertView.findViewById(R.id.Result);
            final TextView OthResult = (TextView)convertView.findViewById(R.id.OthResult);
            final TextView H01 = (TextView)convertView.findViewById(R.id.H01);
            final TextView H02 = (TextView)convertView.findViewById(R.id.H02);
            final TextView H03 = (TextView)convertView.findViewById(R.id.H03);
            final TextView H04 = (TextView)convertView.findViewById(R.id.H04);
            final TextView H05 = (TextView)convertView.findViewById(R.id.H05);
            final TextView H06 = (TextView)convertView.findViewById(R.id.H06);
            final TextView H07 = (TextView)convertView.findViewById(R.id.H07);
            final TextView H07a = (TextView)convertView.findViewById(R.id.H07a);
            final TextView Dist = (TextView)convertView.findViewById(R.id.Dist);
            final TextView Upz = (TextView)convertView.findViewById(R.id.Upz);
            final TextView Un = (TextView)convertView.findViewById(R.id.Un);
            final TextView Vill = (TextView)convertView.findViewById(R.id.Vill);
            final TextView H11 = (TextView)convertView.findViewById(R.id.H11);
            final TextView H12 = (TextView)convertView.findViewById(R.id.H12);
            final TextView H12x = (TextView)convertView.findViewById(R.id.H12x);
            final TextView ShuchonaID = (TextView)convertView.findViewById(R.id.ShuchonaID);
            final TextView H14 = (TextView)convertView.findViewById(R.id.H14);
            final TextView H15 = (TextView)convertView.findViewById(R.id.H15);
            final TextView H17 = (TextView)convertView.findViewById(R.id.H17);
            final TextView Rnd = (TextView)convertView.findViewById(R.id.Rnd);

            final HashMap<String, String> o = (HashMap<String, String>) dataAdap.getItem(position);
            AgeGroup.setText(o.get("AgeGroup"));
            Result.setText(o.get("Result"));
            OthResult.setText(o.get("OthResult"));
            H01.setText(o.get("H01"));
            H02.setText(o.get("H02"));
            H03.setText(o.get("H03"));
            H04.setText(o.get("H04"));
            H05.setText(o.get("H05"));
            H06.setText(o.get("H06"));
            H07.setText(o.get("H07"));
            H07a.setText(o.get("H07a"));
            Dist.setText(o.get("Dist"));
            Upz.setText(o.get("Upz"));
            Un.setText(o.get("Un"));
            Vill.setText(o.get("Vill"));
            H11.setText(o.get("H11"));
            H12.setText(o.get("H12"));
            H12x.setText(o.get("H12x"));
            ShuchonaID.setText(o.get("ShuchonaID"));
            H14.setText(o.get("H14"));
            H15.setText(o.get("H15"));
            H17.setText(o.get("H17"));
            Rnd.setText(o.get("Rnd"));

            secListRow.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    //Write your code here
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("ShuchonaID", o.get("ShuchonaID"));
                    IDbundle.putString("Rnd", o.get("Rnd"));
                    Intent f1;
                    f1 = new Intent(getApplicationContext(), Identity.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);
                }
            });


            return convertView;
        }
    }


}