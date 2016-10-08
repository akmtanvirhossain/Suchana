package org.icddrb.suchana;


//Android Manifest Code
//<activity android:name=".Father_list" android:label="Father: List" />
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

public class Father_list extends Activity {
    boolean networkAvailable=false;
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
    static String RND = "";
    static String SUCHANAID = "";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            setContentView(R.layout.father_list);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();

            TableName = "Father";
            lblHeading = (TextView)findViewById(R.id.lblHeading);
            lblHeading.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    final int DRAWABLE_RIGHT  = 2;
                    if(event.getAction() == MotionEvent.ACTION_DOWN) {
                        if(event.getRawX() >= (lblHeading.getRight() - lblHeading.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                            AlertDialog.Builder adb = new AlertDialog.Builder(Father_list.this);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(Father_list.this);
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
                    DataSearch(RND, SUCHANAID);

                }});

            btnAdd   = (Button) findViewById(R.id.btnAdd);
            btnAdd.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", "");
                    IDbundle.putString("SuchanaID", "");
                    Intent intent = new Intent(getApplicationContext(), Father.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtras(IDbundle);
                    getApplicationContext().startActivity(intent);

                }});


            DataSearch(RND, SUCHANAID);


        }
        catch(Exception  e)
        {
            Connection.MessageBox(Father_list.this, e.getMessage());
            return;
        }
    }
    private void DataSearch(String Rnd, String SuchanaID)
    {
        try
        {

            Father_DataModel d = new Father_DataModel();
            String SQL = "Select * from "+ TableName +"  Where Rnd='"+ Rnd +"' and SuchanaID='"+ SuchanaID +"'";
            List<Father_DataModel> data = d.SelectAll(this, SQL);
            dataList.clear();

            dataAdapter = null;

            ListView list = (ListView)findViewById(R.id.lstData);
            HashMap<String, String> map;

            for(Father_DataModel item : data){
                map = new HashMap<String, String>();
                map.put("Rnd", item.getRnd());
                map.put("SuchanaID", item.getSuchanaID());
                map.put("F211", item.getF211());
                map.put("F212a", item.getF212a());
                map.put("F212b", item.getF212b());
                map.put("F213", item.getF213());
                map.put("F214", item.getF214());
                map.put("F215a", item.getF215a());
                map.put("F215b", item.getF215b());
                map.put("F215c", item.getF215c());
                map.put("F215d", item.getF215d());
                map.put("F215e", item.getF215e());
                map.put("F215f", item.getF215f());
                map.put("F215g", item.getF215g());
                map.put("F215h", item.getF215h());
                map.put("F215i", item.getF215i());
                map.put("F215j", item.getF215j());
                map.put("F216a", item.getF216a());
                map.put("F216b", item.getF216b());
                map.put("F216c", item.getF216c());
                map.put("F216d", item.getF216d());
                map.put("F216e", item.getF216e());
                map.put("F216x", item.getF216x());
                map.put("F216X1", item.getF216X1());
                map.put("F216X2", item.getF216X2());
                map.put("F216X3", item.getF216X3());
                map.put("F217", item.getF217());
                map.put("F218a", item.getF218a());
                map.put("F218b", item.getF218b());
                map.put("F218c", item.getF218c());
                map.put("F218d", item.getF218d());
                map.put("F218e", item.getF218e());
                map.put("F218f", item.getF218f());
                map.put("F218g", item.getF218g());
                map.put("F219", item.getF219());
                map.put("F2110", item.getF2110());
                map.put("F2111", item.getF2111());
                map.put("F2112", item.getF2112());
                dataList.add(map);
            }
            dataAdapter = new SimpleAdapter(Father_list.this, dataList, R.layout.father_list,new String[] {"rowsec"},
                    new int[] {R.id.secListRow});
            list.setAdapter(new DataListAdapter(this, dataAdapter));
        }
        catch(Exception  e)
        {
            Connection.MessageBox(Father_list.this, e.getMessage());
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
                convertView = inflater.inflate(R.layout.father_row, null);
            }
            LinearLayout   secListRow = (LinearLayout)convertView.findViewById(R.id.secListRow);

            final TextView Rnd = (TextView)convertView.findViewById(R.id.Rnd);
            final TextView SuchanaID = (TextView)convertView.findViewById(R.id.SuchanaID);
            final TextView F211 = (TextView)convertView.findViewById(R.id.F211);
            final TextView F212a = (TextView)convertView.findViewById(R.id.F212a);
            final TextView F212b = (TextView)convertView.findViewById(R.id.F212b);
            final TextView F213 = (TextView)convertView.findViewById(R.id.F213);
            final TextView F214 = (TextView)convertView.findViewById(R.id.F214);
            final TextView F215a = (TextView)convertView.findViewById(R.id.F215a);
            final TextView F215b = (TextView)convertView.findViewById(R.id.F215b);
            final TextView F215c = (TextView)convertView.findViewById(R.id.F215c);
            final TextView F215d = (TextView)convertView.findViewById(R.id.F215d);
            final TextView F215e = (TextView)convertView.findViewById(R.id.F215e);
            final TextView F215f = (TextView)convertView.findViewById(R.id.F215f);
            final TextView F215g = (TextView)convertView.findViewById(R.id.F215g);
            final TextView F215h = (TextView)convertView.findViewById(R.id.F215h);
            final TextView F215i = (TextView)convertView.findViewById(R.id.F215i);
            final TextView F215j = (TextView)convertView.findViewById(R.id.F215j);
            final TextView F216a = (TextView)convertView.findViewById(R.id.F216a);
            final TextView F216b = (TextView)convertView.findViewById(R.id.F216b);
            final TextView F216c = (TextView)convertView.findViewById(R.id.F216c);
            final TextView F216d = (TextView)convertView.findViewById(R.id.F216d);
            final TextView F216e = (TextView)convertView.findViewById(R.id.F216e);
            final TextView F216x = (TextView)convertView.findViewById(R.id.F216x);
            final TextView F216X1 = (TextView)convertView.findViewById(R.id.F216X1);
            final TextView F216X2 = (TextView)convertView.findViewById(R.id.F216X2);
            final TextView F216X3 = (TextView)convertView.findViewById(R.id.F216X3);
            final TextView F217 = (TextView)convertView.findViewById(R.id.F217);
            final TextView F218a = (TextView)convertView.findViewById(R.id.F218a);
            final TextView F218b = (TextView)convertView.findViewById(R.id.F218b);
            final TextView F218c = (TextView)convertView.findViewById(R.id.F218c);
            final TextView F218d = (TextView)convertView.findViewById(R.id.F218d);
            final TextView F218e = (TextView)convertView.findViewById(R.id.F218e);
            final TextView F218f = (TextView)convertView.findViewById(R.id.F218f);
            final TextView F218g = (TextView)convertView.findViewById(R.id.F218g);
            final TextView F219 = (TextView)convertView.findViewById(R.id.F219);
            final TextView F2110 = (TextView)convertView.findViewById(R.id.F2110);
            final TextView F2111 = (TextView)convertView.findViewById(R.id.F2111);
            final TextView F2112 = (TextView)convertView.findViewById(R.id.F2112);

            final HashMap<String, String> o = (HashMap<String, String>) dataAdap.getItem(position);
            Rnd.setText(o.get("Rnd"));
            SuchanaID.setText(o.get("SuchanaID"));
            F211.setText(o.get("F211"));
            F212a.setText(o.get("F212a"));
            F212b.setText(o.get("F212b"));
            F213.setText(o.get("F213"));
            F214.setText(o.get("F214"));
            F215a.setText(o.get("F215a"));
            F215b.setText(o.get("F215b"));
            F215c.setText(o.get("F215c"));
            F215d.setText(o.get("F215d"));
            F215e.setText(o.get("F215e"));
            F215f.setText(o.get("F215f"));
            F215g.setText(o.get("F215g"));
            F215h.setText(o.get("F215h"));
            F215i.setText(o.get("F215i"));
            F215j.setText(o.get("F215j"));
            F216a.setText(o.get("F216a"));
            F216b.setText(o.get("F216b"));
            F216c.setText(o.get("F216c"));
            F216d.setText(o.get("F216d"));
            F216e.setText(o.get("F216e"));
            F216x.setText(o.get("F216x"));
            F216X1.setText(o.get("F216X1"));
            F216X2.setText(o.get("F216X2"));
            F216X3.setText(o.get("F216X3"));
            F217.setText(o.get("F217"));
            F218a.setText(o.get("F218a"));
            F218b.setText(o.get("F218b"));
            F218c.setText(o.get("F218c"));
            F218d.setText(o.get("F218d"));
            F218e.setText(o.get("F218e"));
            F218f.setText(o.get("F218f"));
            F218g.setText(o.get("F218g"));
            F219.setText(o.get("F219"));
            F2110.setText(o.get("F2110"));
            F2111.setText(o.get("F2111"));
            F2112.setText(o.get("F2112"));

            secListRow.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    //Write your code here
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", o.get("Rnd"));
                    IDbundle.putString("SuchanaID", o.get("SuchanaID"));
                    Intent f1;
                    f1 = new Intent(getApplicationContext(), Father.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);
                }
            });


            return convertView;
        }
    }


}