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
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import Common.Connection;
import Common.Global;
import Common.Utility;

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
    Spinner spnDist;
    LinearLayout secUpz;
    View lineUpz;
    TextView VlblUpz;
    Spinner spnUpz;
    LinearLayout secUn;
    View lineUn;
    TextView VlblUn;
    Spinner spnUn;
    LinearLayout secVill;
    View lineVill;
    TextView VlblVill;
    Spinner spnVill;

    Spinner spnAgeGroup;

    RadioGroup rdogrpSampling;
    RadioButton rdoSampling1;
    RadioButton rdoSampling2;

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
            lblHeading = (TextView) findViewById(R.id.lblHeading);
            /*lblHeading.setOnTouchListener(new View.OnTouchListener() {
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
            spnAgeGroup = (Spinner) findViewById(R.id.spnAgeGroup);
            spnAgeGroup.setAdapter(C.getArrayAdapter("Select '.All Age' Agegp union Select '00-05' union Select '06-11' union Select '12-23' union Select 'Adolescent (Male)' union Select 'Adolescent (Female)' order by Agegp"));

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

            Button btnDataSearch = (Button) findViewById(R.id.btnDataSearch);
            btnDataSearch.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (spnUpz.getSelectedItemPosition() == 0) {
                        Connection.MessageBox(HHIdentity_list.this, "Select a valid upazila from list.");
                        spnUpz.requestFocus();
                        return;
                    } else if (spnUn.getSelectedItemPosition() == 0) {
                        Connection.MessageBox(HHIdentity_list.this, "Select a valid union from list.");
                        spnUn.requestFocus();
                        return;
                    } else {
                        DataSearch();
                    }
                    /*final ProgressDialog progDailog = ProgressDialog.show(HHIdentity_list.this, "", "Please Wait . . .", true);

                    new Thread() {
                        public void run() {
                            try {


                            } catch (Exception e) {

                            }
                            progDailog.dismiss();
                        }
                    }.start();*/
                }});


            rdogrpSampling = (RadioGroup) findViewById(R.id.rdogrpSampling);
            rdoSampling1 = (RadioButton) findViewById(R.id.rdoSampling1);
            rdoSampling2 = (RadioButton) findViewById(R.id.rdoSampling2);

            btnAdd   = (Button) findViewById(R.id.btnAdd);
            btnAdd.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", "");
                    IDbundle.putString("ScreeningID", "");
                    Intent intent = new Intent(getApplicationContext(), Screening.class);
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


            spnDist = (Spinner) findViewById(R.id.spnDist);
            secUpz = (LinearLayout) findViewById(R.id.secUpz);
            lineUpz = (View) findViewById(R.id.lineUpz);
            VlblUpz = (TextView) findViewById(R.id.VlblUpz);
            spnUpz = (Spinner) findViewById(R.id.spnUpz);
            secUn = (LinearLayout) findViewById(R.id.secUn);
            lineUn = (View) findViewById(R.id.lineUn);
            VlblUn = (TextView) findViewById(R.id.VlblUn);
            spnUn = (Spinner) findViewById(R.id.spnUn);
            secVill = (LinearLayout) findViewById(R.id.secVill);
            lineVill = (View) findViewById(R.id.lineVill);
            VlblVill = (TextView) findViewById(R.id.VlblVill);
            spnVill = (Spinner) findViewById(R.id.spnVill);

            //spnDist.setAdapter(C.getArrayAdapter("Select '' DistCode union select distinct DistCode||'-'||DistName from VillageList order by DistCode"));
            spnDist.setAdapter(C.getArrayAdapter("Select distinct DistCode||'-'||DistName from VillageList order by DistCode"));
            spnDist.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    String D = Connection.SelectedSpinnerValue(spnDist.getSelectedItem().toString(), "-");
                    spnUpz.setAdapter(C.getArrayAdapter("Select '' union Select distinct UPZCode||'-'||UPZName from VillageList where DistCode='" + D + "'"));
                    //DataSearch();
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            spnUpz.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    String D = Connection.SelectedSpinnerValue(spnDist.getSelectedItem().toString(), "-");
                    String U = Connection.SelectedSpinnerValue(spnUpz.getSelectedItem().toString(), "-");
                    spnUn.setAdapter(C.getArrayAdapter("Select '' union Select distinct UNCode||'-'||UNName from VillageList where DistCode='" + D + "' and UpzCode='" + U + "'"));
                    //DataSearch();
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });


            spnUn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    String D = Connection.SelectedSpinnerValue(spnDist.getSelectedItem().toString(), "-");
                    String U = Connection.SelectedSpinnerValue(spnUpz.getSelectedItem().toString(), "-");
                    String UN = Connection.SelectedSpinnerValue(spnUn.getSelectedItem().toString(), "-");
                    spnVill.setAdapter(C.getArrayAdapter("Select '' union Select distinct VillCode||'-'||VillName from VillageList where DistCode='" + D + "' and UpzCode='" + U + "' and UNCode='" + UN + "'"));
                    //DataSearch();
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            spnVill.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    //DataSearch();
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });


            //DataSearch();


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
            Integer i = 1;
            HHIdentity_DataModel d = new HHIdentity_DataModel();
            String SQL = "";
            //for screening
            /*SQL = "Select Rnd, ScreeningID, Dist||Upz||Un||Vill||HHNo SuchanaID,Dist, Upz, Un, Vill, WRHHNo, BenName, HeadName, HsuName,case when length(MobNo)=0 then ReqMobNo else MobNo end MobNo, DistCode, DistName, UPZCode, UPZName, UNCode, UNName, VillCode, VillName,Upload,VDate from Screening i";
            SQL += " left outer join VillageList v on i.Dist=v.DistCode and i.Upz=v.UPZCode and i.Un=v.UNCode and i.Vill=v.VillCode";
            SQL += " where date(VDate) between '" + Global.DateConvertYMD(dtpFDate.getText().toString()) + "' and '" + Global.DateConvertYMD(dtpTDate.getText().toString()) + "'";
            SQL += " order by date(VDate) desc, datetime(EnDt) desc";
            */

            String D = Connection.SelectedSpinnerValue(spnDist.getSelectedItem().toString(), "-");
            String U = spnUpz.getCount() > 0 ? spnUpz.getSelectedItemPosition() == 0 ? "%" : Connection.SelectedSpinnerValue(spnUpz.getSelectedItem().toString(), "-") : "";
            String UN = spnUn.getCount() > 0 ? spnUn.getSelectedItemPosition() == 0 ? "%" : Connection.SelectedSpinnerValue(spnUn.getSelectedItem().toString(), "-") : "";
            String V = spnVill.getCount() > 0 ? spnVill.getSelectedItemPosition() == 0 ? "%" : Connection.SelectedSpinnerValue(spnVill.getSelectedItem().toString(), "-") : "";

            //household interview
            SQL = "Select (case when i.Sampling is null then '2' else '1' end)Sampling, i.Rnd, i.ScreeningID, i.Dist||i.Upz||i.Un||i.Vill||i.HHNo SuchanaID,i.Dist, i.Upz, i.Un, i.Vill, i.WRHHNo, i.HHNo, i.BenName, i.HeadName, i.HsuName,case when length(i.MobNo)=0 then i.ReqMobNo else i.MobNo end MobNo, v.DistCode, v.DistName, v.UPZCode, v.UPZName, v.UNCode, v.UNName, v.VillCode, v.VillName,ifnull(h.Upload,'2')Upload, i.VDate ,ifnull(h.H17,'')H17,ifnull(i.QC,'2')QC,HHLocation, case when length(i.Lat)==0 or i.Lat is null then 0 else 1 end Lat from Screening i";
            SQL += " left outer join HHIdentity h on i.rnd=h.rnd and i.suchanaid=h.suchanaid";
            SQL += " left outer join VillageList v on i.Dist=v.DistCode and i.Upz=v.UPZCode and i.Un=v.UNCode and i.Vill=v.VillCode";
            SQL += " where";
            //SQL += " (case when i.Sampling is null then '2' else i.Sampling end)='" + (rdoSampling1.isChecked() ? "1" : "2") + "' and";
            //SQL += " (case when i.Sampling is null then '2' else '1' end)='" + (rdoSampling1.isChecked() ? "1" : "2") + "' and";
            SQL += " i.Dist like('" + D + "') and";
            SQL += " i.Upz like('" + U + "') and";
            SQL += " i.Un like('" + UN + "') and";
            SQL += " i.Vill like('" + V + "') ";
            if(spnAgeGroup.getSelectedItemPosition()==0 && rdoSampling1.isChecked()==true) { SQL += "and i.Sampling in('1','3','5') "; }
            else if(spnAgeGroup.getSelectedItemPosition()==0 && rdoSampling2.isChecked()==true) { SQL += "and i.Sampling in('2','4','6') "; }
            else if(spnAgeGroup.getSelectedItemPosition()==1 && rdoSampling1.isChecked()==true) { SQL += "and i.Sampling='1' "; }
            else if(spnAgeGroup.getSelectedItemPosition()==1 && rdoSampling2.isChecked()==true) { SQL += "and i.Sampling='2' "; }
            else if(spnAgeGroup.getSelectedItemPosition()==2 && rdoSampling1.isChecked()==true) { SQL += "and i.Sampling='3' "; }
            else if(spnAgeGroup.getSelectedItemPosition()==2 && rdoSampling2.isChecked()==true) { SQL += "and i.Sampling='4' "; }
            else if(spnAgeGroup.getSelectedItemPosition()==3 && rdoSampling1.isChecked()==true) { SQL += "and i.Sampling='5' "; }
            else if(spnAgeGroup.getSelectedItemPosition()==3 && rdoSampling2.isChecked()==true) { SQL += "and i.Sampling='6' "; }
            else if(spnAgeGroup.getSelectedItemPosition()==4 && rdoSampling1.isChecked()==true) { SQL += "and i.Adolescent='gp' "; }
            else if(spnAgeGroup.getSelectedItemPosition()==4 && rdoSampling2.isChecked()==true) { SQL += "and i.Adolescent='gs' "; }
            else if(spnAgeGroup.getSelectedItemPosition()==5 && rdoSampling1.isChecked()==true) { SQL += "and i.Adolescent='bp' "; }
            else if(spnAgeGroup.getSelectedItemPosition()==5 && rdoSampling2.isChecked()==true) { SQL += "and i.Adolescent='bs' "; }

            //SQL += " where date(VDate) between '" + Global.DateConvertYMD(dtpFDate.getText().toString()) + "' and '" + Global.DateConvertYMD(dtpTDate.getText().toString()) + "'";
            //SQL += " order by date(VDate) desc, datetime(EnDt) desc";

            List<HHIdentity_DataModel> data = d.SelectAllList(this, SQL);
            dataList.clear();

            dataAdapter = null;

            ListView list = (ListView)findViewById(R.id.lstData);
            HashMap<String, String> map;

            for(HHIdentity_DataModel item : data){
                map = new HashMap<String, String>();
                map.put("Sampling", item.getSampling());
                map.put("Rnd", item.getRnd());
                map.put("Dist", item.getdistName());
                map.put("Upz", item.getupzName());
                map.put("Un", item.getunName());
                map.put("Vill", item.getvillName());
                map.put("H11", item.getWRHHNo());
                map.put("SuchanaID", item.getSuchanaID());
                map.put("ScreeningID", item.getScreeningID());
                map.put("BenName", item.getBenName());
                map.put("HeadName", item.getHeadName());
                map.put("HsuName", item.getHsuName());
                map.put("MobNo", item.getMobNo());
                map.put("vdate", item.getvdate().toString().length()==0 ? "" : Global.DateConvertDMY(item.getvdate()));
                map.put("Upload",item.getUpload());
                map.put("QC", item.getQC());
                map.put("hhlocation", item.getHHLocation());
                map.put("Lat", item.getLat());
                map.put("H17", item.getH17());
                map.put("sl", i.toString());
                i += 1;
                dataList.add(map);
            }
            dataAdapter = new SimpleAdapter(HHIdentity_list.this, dataList, R.layout.hhidentity_list,new String[] {"rowsec"},
                    new int[] {R.id.secListRow});
            list.setAdapter(new DataListAdapter(this, dataAdapter));

            i = i - 1;
            lblHeading.setText("Suchana: Inteview List [Total: " + i.toString() + "]");
            Utility.setListViewHeightBasedOnChildren(list);
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
            final TextView BenName = (TextView) convertView.findViewById(R.id.BenName);
            final TextView HsuName = (TextView) convertView.findViewById(R.id.HsuName);
            final TextView HeadName = (TextView) convertView.findViewById(R.id.HeadName);
            final TextView MobNo = (TextView) convertView.findViewById(R.id.MobNo);
            final Button cmdQC = (Button) convertView.findViewById(R.id.cmdQC);
            final Button cmdGPS = (Button) convertView.findViewById(R.id.cmdGPS);
            final TextView hhLocation = (TextView) convertView.findViewById(R.id.hhLocation);

            final HashMap<String, String> o = (HashMap<String, String>) dataAdap.getItem(position);
            Rnd.setText(o.get("Rnd"));
            SuchanaID.setText(": " + o.get("ScreeningID"));
            zilla.setText(": " + o.get("Dist"));
            upazila.setText(": " + o.get("Upz"));
            unions.setText(": " + o.get("Un"));
            village.setText(": " + o.get("Vill"));
            hhNo.setText(": " + o.get("H11"));
            BenName.setText(": " + o.get("BenName"));
            HsuName.setText(": " + o.get("HsuName"));
            HeadName.setText(": " + o.get("HeadName"));
            MobNo.setText(": " + o.get("MobNo"));

            visitdate.setText(": " + o.get("vdate"));
            hhLocation.setText(": " + o.get("hhlocation"));

            Integer i = Integer.valueOf(o.get("sl"));

            if (i % 2 == 0)
                secListRow.setBackgroundColor(Color.parseColor("#F3F3F3"));
            else
                secListRow.setBackgroundColor(Color.parseColor("#FFFFFF"));

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

            if ( o.get("H17").length()>0 && o.get("Lat").equals("0"))
            {
                cmdGPS.setBackgroundColor(Color.RED);
            }
            else if ( o.get("H17").length()>0 && o.get("Lat").equals("1"))
            {
                cmdGPS.setBackgroundColor(Color.GREEN);
            }
            else
            {
               // cmdGPS.setBackgroundColor(Color.RED);
                cmdGPS.setVisibility(View.GONE);
            }
            //for household interview
            secListRow.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    //For Screening
                    /*Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", o.get("Rnd"));
                    IDbundle.putString("ScreeningID", o.get("ScreeningID"));
                    Intent f1;
                    f1 = new Intent(getApplicationContext(), Screening.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);*/

                    //QC Device
                    if (g.getDeviceNo().equals("385") | g.getDeviceNo().equals("382") | g.getDeviceNo().equals("380") | g.getDeviceNo().equals("383")) {

                    } else {
                        //For Household Interview
                        if(spnAgeGroup.getSelectedItemPosition()==4 || spnAgeGroup.getSelectedItemPosition()==5)
                        {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", o.get("Rnd"));
                            IDbundle.putString("ScreeningID", o.get("ScreeningID"));
                            IDbundle.putString("SuchanaID", o.get("SuchanaID"));
                            Intent f1;

                            f1 = new Intent(getApplicationContext(), Adolescent.class);
                            f1.putExtras(IDbundle);
                            startActivity(f1);
                        }
                        else
                        {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", o.get("Rnd"));
                            IDbundle.putString("ScreeningID", o.get("ScreeningID"));
                            IDbundle.putString("SuchanaID", o.get("SuchanaID"));
                            Intent f1;

                            f1 = new Intent(getApplicationContext(), HHIdentity_final.class);
                            f1.putExtras(IDbundle);
                            startActivity(f1);
                        }

                    }
                }
            });

            //QC Device
            if (g.getDeviceNo().equals("385") | g.getDeviceNo().equals("382") | g.getDeviceNo().equals("380") | g.getDeviceNo().equals("383")) {
                cmdQC.setVisibility(View.VISIBLE);
            } else {
                cmdQC.setVisibility(View.GONE);
            }

            //for QC
            cmdQC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", o.get("Rnd"));
                    IDbundle.putString("ScreeningID", o.get("ScreeningID"));
                    IDbundle.putString("SuchanaID", o.get("SuchanaID"));
                    Intent f1;

                    f1 = new Intent(getApplicationContext(), QC.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);
                }
            });

            cmdGPS.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", o.get("Rnd"));
                    IDbundle.putString("ScreeningID", o.get("ScreeningID"));
                    IDbundle.putString("SuchanaID", o.get("SuchanaID"));
                    Intent f1;

                    f1 = new Intent(getApplicationContext(), GPSDialogActivity.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);
                }
            });

            return convertView;
        }
    }

}