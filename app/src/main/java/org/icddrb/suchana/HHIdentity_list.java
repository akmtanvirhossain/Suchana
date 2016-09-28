package org.icddrb.suchana;
//Android Manifest Code
//<activity android:name=".HHIdentity_list" android:label="HHIdentity: List" />

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import Common.Connection;
import Common.Global;

public class HHIdentity_list extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    boolean networkAvailable=false;
    Location currentLocation;
    double currentLatitude,currentLongitude;
    String VariableID;
    Connection C;
    Global g;
    SimpleAdapter dataAdapter;
    ArrayList<HashMap<String, String>> dataList = new ArrayList<HashMap<String, String>>();
    TextView lblHeading;
    Button btnAdd;
    Button btnRefresh;
    String StartTime;
    EditText dtpFDate;
    EditText dtpTDate;
    Button btnSearch;
    ImageButton dateSearch;
    LinearLayout secDateSearch;
    private int hour;
    private int minute;
    private int mDay;
    private int mMonth;
    private int mYear;
    private DatePickerDialog.OnDateSetListener mDateSetListener = new DatePickerDialog.OnDateSetListener() {
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            mYear = year;
            mMonth = monthOfYear + 1;
            mDay = dayOfMonth;
            EditText dtpDate;


            dtpDate = (EditText) findViewById(R.id.dtpFDate);
            if (VariableID.equals("dtpFDate")) {
                dtpDate = (EditText) findViewById(R.id.dtpFDate);
            } else if (VariableID.equals("dtpTDate")) {
                dtpDate = (EditText) findViewById(R.id.dtpTDate);
            }

            dtpDate.setText(new StringBuilder()
                    .append(Global.Right("00" + mDay, 2)).append("/")
                    .append(Global.Right("00" + mMonth, 2)).append("/")
                    .append(mYear));
        }
    };

    //Disabled Back/Home key
    //--------------------------------------------------------------------------------------------------
    @Override
    public boolean onKeyDown(int iKeyCode, KeyEvent event)
    {
        if(iKeyCode == KeyEvent.KEYCODE_BACK || iKeyCode == KeyEvent.KEYCODE_HOME)
        { return false; }
        else { return true;  }
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            setContentView(R.layout.hhidentity_list);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();

            TableName = "HHIdentity";
           /* lblHeading = (TextView)findViewById(R.id.lblHeading);
            lblHeading.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    final int DRAWABLE_RIGHT  = 2;
                    if(event.getAction() == MotionEvent.ACTION_DOWN) {
                        if(event.getRawX() >= (lblHeading.getRight() - lblHeading.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                            AlertDialog.Builder adb = new AlertDialog.Builder(HHIdentity_list.this);
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
            });*/

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(HHIdentity_list.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            startActivity(new Intent(HHIdentity_list.this, MainMenu.class));
                        }});
                    adb.show();
                }});


            btnRefresh = (Button) findViewById(R.id.btnRefresh);
            btnRefresh.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    //write your code here
                    DataSearch();

                }});

            btnAdd   = (Button) findViewById(R.id.btnAdd);
            btnAdd.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", "");
                    IDbundle.putString("SuchanaID", "");
                    Intent intent = new Intent(getApplicationContext(), HHIdentity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtras(IDbundle);
                    startActivityForResult(intent,1);

                }});


            dtpFDate = (EditText) findViewById(R.id.dtpFDate);
            dtpFDate.setText(Global.DateNowDMY());
            dtpTDate = (EditText) findViewById(R.id.dtpTDate);
            dtpTDate.setText(Global.DateNowDMY());

            dtpFDate.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    final int DRAWABLE_RIGHT = 2;
                    if (event.getAction() == MotionEvent.ACTION_UP) {
                        if (event.getRawX() >= (dtpFDate.getRight() - dtpFDate.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                            VariableID = "dtpFDate";
                            showDialog(DATE_DIALOG);
                            return true;
                        }
                    }
                    return false;
                }
            });
            dtpTDate.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    final int DRAWABLE_RIGHT = 2;
                    if (event.getAction() == MotionEvent.ACTION_UP) {
                        if (event.getRawX() >= (dtpTDate.getRight() - dtpTDate.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                            VariableID = "dtpTDate";
                            showDialog(DATE_DIALOG);
                            return true;
                        }
                    }
                    return false;
                }
            });


            btnSearch = (Button) findViewById(R.id.btnSearch);
            btnSearch.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSearch();
                }
            });

            DataSearch();


        }
        catch(Exception  e)
        {
            Connection.MessageBox(HHIdentity_list.this, e.getMessage());
            return;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 1){
            DataSearch();
        }
    }

    private void DataSearch()
    {
        try
        {

            HHIdentity_DataModel d = new HHIdentity_DataModel();
            String SQL = "";
            SQL = "Select Rnd, SuchanaID, Dist, Upz, Un, Vill, H11, AgeGroup, H17, Result,DistCode, DistName, UPZCode, UPZName, UNCode, UNName, VillCode, VillName,Upload from HHIdentity i";
            SQL += " left outer join VillageList v on i.Dist=v.DistCode and i.Upz=v.UPZCode and i.Un=v.UNCode and i.Vill=v.VillCode";
            SQL += " where date(H17) between '" + Global.DateConvertYMD(dtpFDate.getText().toString()) + "' and '" + Global.DateConvertYMD(dtpTDate.getText().toString()) + "'";

            List<HHIdentity_DataModel> data = d.SelectAllList(this, SQL);
            dataList.clear();

            dataAdapter = null;

            ListView list = (ListView)findViewById(R.id.lstData);
            HashMap<String, String> map;

            for(HHIdentity_DataModel item : data){
                map = new HashMap<String, String>();
                map.put("Rnd", item.getRnd());
                map.put("Dist", item.getdistName());
                map.put("Upz", item.getupzName());
                map.put("Un", item.getunName());
                map.put("Vill", item.getvillName());
                map.put("H11", item.getH11());
                map.put("SuchanaID", item.getSuchanaID());
                map.put("AgeGroup", item.getAgeGroup());
                map.put("H17", item.getH17().toString().length()==0 ? "" : Global.DateConvertDMY(item.getH17()));
                map.put("Result", item.getResult());

                map.put("Upload",item.getUpload());
                dataList.add(map);
            }
            dataAdapter = new SimpleAdapter(HHIdentity_list.this, dataList, R.layout.hhidentity_list,new String[] {"rowsec"},
                    new int[] {R.id.secListRow});
            list.setAdapter(new DataListAdapter(this, dataAdapter));
        }
        catch(Exception  e)
        {
            Connection.MessageBox(HHIdentity_list.this, e.getMessage());
            return;
        }
    }

    protected Dialog onCreateDialog(int id) {
        final Calendar c = Calendar.getInstance();
        hour = c.get(Calendar.HOUR_OF_DAY);
        minute = c.get(Calendar.MINUTE);
        switch (id) {
            case DATE_DIALOG:
                return new DatePickerDialog(this, mDateSetListener, g.mYear, g.mMonth - 1, g.mDay);
            //case TIME_DIALOG:
            //    return new TimePickerDialog(this, timePickerListener, hour, minute,false);
        }
        return null;
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
                convertView = inflater.inflate(R.layout.hhidentity_row1, null);
            }
            LinearLayout   secListRow = (LinearLayout)convertView.findViewById(R.id.secListRow);

            final TextView Rnd = (TextView)convertView.findViewById(R.id.Rnd);
            final TextView SuchanaID = (TextView)convertView.findViewById(R.id.SuchanaID);
            final TextView zilla = (TextView) convertView.findViewById(R.id.zilla);
            final TextView upazila = (TextView) convertView.findViewById(R.id.upazila);
            final TextView unions = (TextView) convertView.findViewById(R.id.unions);
            final TextView village = (TextView) convertView.findViewById(R.id.village);
            final TextView hhNo = (TextView) convertView.findViewById(R.id.hhNo);
            final TextView visitdate = (TextView) convertView.findViewById(R.id.visitdate);

            final HashMap<String, String> o = (HashMap<String, String>) dataAdap.getItem(position);
            Rnd.setText(o.get("Rnd"));
            SuchanaID.setText(": " + o.get("SuchanaID"));
            zilla.setText(": " + o.get("Dist"));
            upazila.setText(": " + o.get("Upz"));
            unions.setText(": " + o.get("Un"));
            village.setText(": " + o.get("Vill"));
            hhNo.setText(": " + o.get("H11"));
            visitdate.setText(": " + o.get("H17"));

          //  Upload.setText(o.get("Upload"));
            final TextView Upload = (TextView) convertView.findViewById(R.id.txtUploadStatus);
            if (o.get("Upload").equals("1")) {
                Upload.setText(": " + "Yes");
                Upload.setTextColor(Color.parseColor("#FF00C853"));
                //status.setImageResource(R.mipmap.uploaded);
            } else {
                Upload.setText(": " + "No");
                Upload.setTextColor(Color.RED);
                //status.setImageResource(R.mipmap.pending);
            }
            secListRow.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    //Write your code here
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", o.get("Rnd"));
                    IDbundle.putString("SuchanaID", o.get("SuchanaID"));
                    Intent f1;
                    f1 = new Intent(getApplicationContext(), HHIdentity.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);
                }
            });

            return convertView;
        }
    }

}