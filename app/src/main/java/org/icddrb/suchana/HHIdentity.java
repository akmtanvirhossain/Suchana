package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".HHIdentity" android:label="HHIdentity" />

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import Common.Connection;
import Common.Global;

public class HHIdentity extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    boolean netwoekAvailable = false;
    Location currentLocation;
    double currentLatitude, currentLongitude;
    String VariableID;
    Connection C;
    Global g;
    SimpleAdapter dataAdapter;
    ArrayList<HashMap<String, String>> dataList = new ArrayList<HashMap<String, String>>();
    TextView lblHeading;
    LinearLayout secRnd;
    TextView VlblRnd;
    EditText txtRnd;
    LinearLayout secDist;
    TextView VlblDist;
    Spinner spnDist;
    LinearLayout secUpz;
    TextView VlblUpz;
    Spinner spnUpz;
    LinearLayout secUn;
    TextView VlblUn;
    Spinner spnUn;
    LinearLayout secVill;
    TextView VlblVill;
    Spinner spnVill;
    LinearLayout secH11;
    TextView VlblH11;
    EditText txtH11;
    LinearLayout secSuchanaID;
    TextView VlblSuchanaID;
    EditText txtSuchanaID;
    LinearLayout secAgeGroup;
    TextView VlblAgeGroup;
    Spinner spnAgeGroup;
    LinearLayout secH14;
    TextView VlblH14;
    EditText dtpH14;
    LinearLayout secResult;
    TextView VlblResult;
    Spinner spnResult;
    LinearLayout secOthResult;
    TextView VlblOthResult;
    EditText txtOthResult;
    LinearLayout secH12;
    TextView VlblH12;
    RadioGroup rdogrpH12;
    RadioButton rdoH121;
    RadioButton rdoH122;
    RadioButton rdoH123;
    LinearLayout secH01;
    TextView VlblH01;
    RadioGroup rdogrpH01;
    RadioButton rdoH011;
    RadioButton rdoH012;
    LinearLayout secH02;
    TextView VlblH02;
    RadioGroup rdogrpH02;
    RadioButton rdoH021;
    RadioButton rdoH022;
    LinearLayout secH12x;
    TextView VlblH12x;
    EditText txtH12x;
    LinearLayout secH15;
    TextView VlblH15;
    EditText txtH15;
    LinearLayout secH03;
    TextView VlblH03;
    RadioGroup rdogrpH03;
    RadioButton rdoH031;
    RadioButton rdoH032;
    LinearLayout secH04;
    TextView VlblH04;
    RadioGroup rdogrpH04;
    RadioButton rdoH041;
    RadioButton rdoH042;
    LinearLayout secH17;
    TextView VlblH17;
    Spinner spnH17;
    LinearLayout secH05;
    TextView VlblH05;
    RadioGroup rdogrpH05;
    RadioButton rdoH051;
    RadioButton rdoH052;
    LinearLayout secH06;
    TextView VlblH06;
    RadioGroup rdogrpH06;
    RadioButton rdoH061;
    RadioButton rdoH062;
    LinearLayout secH07;
    TextView VlblH07;
    RadioGroup rdogrpH07;
    RadioButton rdoH071;
    RadioButton rdoH072;
    LinearLayout secH07a;
    TextView VlblH07a;
    Spinner spnH07a;
    String StartTime;
    Bundle IDbundle;
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


            dtpDate = (EditText) findViewById(R.id.dtpH14);
            if (VariableID.equals("btnH14")) {
                dtpDate = (EditText) findViewById(R.id.dtpH14);
            }
            dtpDate.setText(new StringBuilder()
                    .append(Global.Right("00" + mDay, 2)).append("/")
                    .append(Global.Right("00" + mMonth, 2)).append("/")
                    .append(mYear));
        }
    };
    private TimePickerDialog.OnTimeSetListener timePickerListener = new TimePickerDialog.OnTimeSetListener() {
        public void onTimeSet(TimePicker view, int selectedHour, int selectedMinute) {
            hour = selectedHour;
            minute = selectedMinute;
            EditText tpTime = null;


            tpTime.setText(new StringBuilder().append(Global.Right("00" + hour, 2)).append(":").append(Global.Right("00" + minute, 2)));

        }
    };

    //Disabled Back/Home key
    //--------------------------------------------------------------------------------------------------
    @Override
    public boolean onKeyDown(int iKeyCode, KeyEvent event) {
        if (iKeyCode == KeyEvent.KEYCODE_BACK || iKeyCode == KeyEvent.KEYCODE_HOME) {
            return false;
        } else {
            return true;
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.hhidentity);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TableName = "HHIdentity";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(HHIdentity.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
                    adb.show();
                }
            });


            secRnd = (LinearLayout) findViewById(R.id.secRnd);
            VlblRnd = (TextView) findViewById(R.id.VlblRnd);
            txtRnd = (EditText) findViewById(R.id.txtRnd);
            secDist = (LinearLayout) findViewById(R.id.secDist);
            VlblDist = (TextView) findViewById(R.id.VlblDist);
            spnDist = (Spinner) findViewById(R.id.spnDist);
            List<String> listDist = new ArrayList<String>();

            listDist.add("");
            listDist.add("01-AA");
            listDist.add("02-BB");
            ArrayAdapter<String> adptrDist = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listDist);
            spnDist.setAdapter(adptrDist);

            secUpz = (LinearLayout) findViewById(R.id.secUpz);
            VlblUpz = (TextView) findViewById(R.id.VlblUpz);
            spnUpz = (Spinner) findViewById(R.id.spnUpz);
            List<String> listUpz = new ArrayList<String>();

            listUpz.add("");
            listUpz.add("01-AA");
            listUpz.add("02-BB");
            ArrayAdapter<String> adptrUpz = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listUpz);
            spnUpz.setAdapter(adptrUpz);

            secUn = (LinearLayout) findViewById(R.id.secUn);
            VlblUn = (TextView) findViewById(R.id.VlblUn);
            spnUn = (Spinner) findViewById(R.id.spnUn);
            List<String> listUn = new ArrayList<String>();

            listUn.add("");
            listUn.add("01-AA");
            listUn.add("02-BB");
            ArrayAdapter<String> adptrUn = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listUn);
            spnUn.setAdapter(adptrUn);

            secVill = (LinearLayout) findViewById(R.id.secVill);
            VlblVill = (TextView) findViewById(R.id.VlblVill);
            spnVill = (Spinner) findViewById(R.id.spnVill);
            List<String> listVill = new ArrayList<String>();

            listVill.add("");
            listVill.add("01-AA");
            listVill.add("02-BB");
            ArrayAdapter<String> adptrVill = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listVill);
            spnVill.setAdapter(adptrVill);

            secH11 = (LinearLayout) findViewById(R.id.secH11);
            VlblH11 = (TextView) findViewById(R.id.VlblH11);
            txtH11 = (EditText) findViewById(R.id.txtH11);
            secSuchanaID = (LinearLayout) findViewById(R.id.secSuchanaID);
            VlblSuchanaID = (TextView) findViewById(R.id.VlblSuchanaID);
            txtSuchanaID = (EditText) findViewById(R.id.txtSuchanaID);
            secAgeGroup = (LinearLayout) findViewById(R.id.secAgeGroup);
            VlblAgeGroup = (TextView) findViewById(R.id.VlblAgeGroup);
            spnAgeGroup = (Spinner) findViewById(R.id.spnAgeGroup);
            List<String> listAgeGroup = new ArrayList<String>();

            listAgeGroup.add("");
            listAgeGroup.add("1-০-৫ মাস");
            listAgeGroup.add("2-৬-১১ মাস");
            listAgeGroup.add("3-১২-২৩ মাস");
            ArrayAdapter<String> adptrAgeGroup = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listAgeGroup);
            spnAgeGroup.setAdapter(adptrAgeGroup);

            secH14 = (LinearLayout) findViewById(R.id.secH14);
            VlblH14 = (TextView) findViewById(R.id.VlblH14);
            dtpH14 = (EditText) findViewById(R.id.dtpH14);
            secResult = (LinearLayout) findViewById(R.id.secResult);
            VlblResult = (TextView) findViewById(R.id.VlblResult);
            spnResult = (Spinner) findViewById(R.id.spnResult);
            List<String> listResult = new ArrayList<String>();

            listResult.add("");
            listResult.add("1-ইন্টারভিউ সম্পন্ন");
            listResult.add("2-উত্তরদাত্রী/প্রধান মহিলা বাড়ি ছিলেননা");
            listResult.add("3-অংশগ্রহনে অসম্মতি");
            listResult.add("4-অনান্ন");
            ArrayAdapter<String> adptrResult = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listResult);
            spnResult.setAdapter(adptrResult);

            spnResult.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnResult.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnResult.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("1")) {
                        secOthResult.setVisibility(View.GONE);
                        secH12.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("2")) {
                        secOthResult.setVisibility(View.GONE);
                        secH12.setVisibility(View.GONE);
                        secH01.setVisibility(View.GONE);
                        secH02.setVisibility(View.GONE);
                        secH12x.setVisibility(View.GONE);
                        secH15.setVisibility(View.GONE);
                        secH03.setVisibility(View.GONE);
                        secH04.setVisibility(View.GONE);
                        secH17.setVisibility(View.GONE);
                        secH05.setVisibility(View.GONE);
                        secH06.setVisibility(View.GONE);
                        secH07.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("3")) {
                        secOthResult.setVisibility(View.GONE);
                        secH12.setVisibility(View.GONE);
                        secH01.setVisibility(View.GONE);
                        secH02.setVisibility(View.GONE);
                        secH12x.setVisibility(View.GONE);
                        secH15.setVisibility(View.GONE);
                        secH03.setVisibility(View.GONE);
                        secH04.setVisibility(View.GONE);
                        secH17.setVisibility(View.GONE);
                        secH05.setVisibility(View.GONE);
                        secH06.setVisibility(View.GONE);
                        secH07.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("4")) {
                    } else {
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secOthResult = (LinearLayout) findViewById(R.id.secOthResult);
            VlblOthResult = (TextView) findViewById(R.id.VlblOthResult);
            txtOthResult = (EditText) findViewById(R.id.txtOthResult);
            secH12 = (LinearLayout) findViewById(R.id.secH12);
            VlblH12 = (TextView) findViewById(R.id.VlblH12);
            rdogrpH12 = (RadioGroup) findViewById(R.id.rdogrpH12);

            rdoH121 = (RadioButton) findViewById(R.id.rdoH121);
            rdoH122 = (RadioButton) findViewById(R.id.rdoH122);
            rdoH123 = (RadioButton) findViewById(R.id.rdoH123);
            secH12x = (LinearLayout) findViewById(R.id.secH12x);
            VlblH12x = (TextView) findViewById(R.id.VlblH12x);
            txtH12x = (EditText) findViewById(R.id.txtH12x);
            secH12x.setVisibility(View.GONE);
            rdogrpH12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    if (checkedId == R.id.rdoH123) {
                        secH12x.setVisibility(View.VISIBLE);
                    } else {
                        secH12x.setVisibility(View.GONE);
                    }
                }
            });
            secH01 = (LinearLayout) findViewById(R.id.secH01);
            VlblH01 = (TextView) findViewById(R.id.VlblH01);
            rdogrpH01 = (RadioGroup) findViewById(R.id.rdogrpH01);

            rdoH011 = (RadioButton) findViewById(R.id.rdoH011);
            rdoH012 = (RadioButton) findViewById(R.id.rdoH012);
            secH02 = (LinearLayout) findViewById(R.id.secH02);
            VlblH02 = (TextView) findViewById(R.id.VlblH02);
            rdogrpH02 = (RadioGroup) findViewById(R.id.rdogrpH02);

            rdoH021 = (RadioButton) findViewById(R.id.rdoH021);
            rdoH022 = (RadioButton) findViewById(R.id.rdoH022);

            secH15 = (LinearLayout) findViewById(R.id.secH15);
            VlblH15 = (TextView) findViewById(R.id.VlblH15);
            txtH15 = (EditText) findViewById(R.id.txtH15);
            secH03 = (LinearLayout) findViewById(R.id.secH03);
            VlblH03 = (TextView) findViewById(R.id.VlblH03);
            rdogrpH03 = (RadioGroup) findViewById(R.id.rdogrpH03);

            rdoH031 = (RadioButton) findViewById(R.id.rdoH031);
            rdoH032 = (RadioButton) findViewById(R.id.rdoH032);
            secH04 = (LinearLayout) findViewById(R.id.secH04);
            VlblH04 = (TextView) findViewById(R.id.VlblH04);
            rdogrpH04 = (RadioGroup) findViewById(R.id.rdogrpH04);

            rdoH041 = (RadioButton) findViewById(R.id.rdoH041);
            rdoH042 = (RadioButton) findViewById(R.id.rdoH042);
            secH17 = (LinearLayout) findViewById(R.id.secH17);
            VlblH17 = (TextView) findViewById(R.id.VlblH17);
            spnH17 = (Spinner) findViewById(R.id.spnH17);
            List<String> listH17 = new ArrayList<String>();

            listH17.add("");
            listH17.add("1-ইন্টারভেনশন গ্রুপ");
            listH17.add("2-কন্ট্রোল গ্রুপ");
            listH17.add("3-সম্পদ হস্তান্তর গ্রুপ");
            listH17.add("4-সম্পদ না হস্তান্তর গ্রুপ");
            listH17.add("5-কন্ট্রোল গ্রুপ");
            ArrayAdapter<String> adptrH17 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH17);
            spnH17.setAdapter(adptrH17);

            secH05 = (LinearLayout) findViewById(R.id.secH05);
            VlblH05 = (TextView) findViewById(R.id.VlblH05);
            rdogrpH05 = (RadioGroup) findViewById(R.id.rdogrpH05);

            rdoH051 = (RadioButton) findViewById(R.id.rdoH051);
            rdoH052 = (RadioButton) findViewById(R.id.rdoH052);
            secH06 = (LinearLayout) findViewById(R.id.secH06);
            VlblH06 = (TextView) findViewById(R.id.VlblH06);
            rdogrpH06 = (RadioGroup) findViewById(R.id.rdogrpH06);

            rdoH061 = (RadioButton) findViewById(R.id.rdoH061);
            rdoH062 = (RadioButton) findViewById(R.id.rdoH062);
            secH07 = (LinearLayout) findViewById(R.id.secH07);
            VlblH07 = (TextView) findViewById(R.id.VlblH07);
            rdogrpH07 = (RadioGroup) findViewById(R.id.rdogrpH07);

            rdoH071 = (RadioButton) findViewById(R.id.rdoH071);
            rdoH072 = (RadioButton) findViewById(R.id.rdoH072);
            rdogrpH07.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH07 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH07.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH07.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH07[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                    } else {
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH07a = (LinearLayout) findViewById(R.id.secH07a);
            VlblH07a = (TextView) findViewById(R.id.VlblH07a);
            spnH07a = (Spinner) findViewById(R.id.spnH07a);
            List<String> listH07a = new ArrayList<String>();

            listH07a.add("");
            listH07a.add("1-শিশুকে কাজে পাঠানো");
            listH07a.add("2-মূল্যবান উত্পাদনশীল সম্পদ বিক্রী");
            listH07a.add("3-উপশ করা");
            listH07a.add("4-অগ্রিম শ্রম বিক্রি");
            listH07a.add("5-অধিক সুদে ঋণ গ্রহণ");
            listH07a.add("6-মাইগ্রেশন/স্থানান্তর");
            listH07a.add("7-দোকান থেকে বাকি করা");
            listH07a.add("8-আত্তীয় স্বজন থেকে ধার করা");
            ArrayAdapter<String> adptrH07a = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH07a);
            spnH07a.setAdapter(adptrH07a);


            dtpH14.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    final int DRAWABLE_RIGHT = 2;
                    if (event.getAction() == MotionEvent.ACTION_UP) {
                        if (event.getRawX() >= (dtpH14.getRight() - dtpH14.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                            VariableID = "btnH14";
                            showDialog(DATE_DIALOG);
                            return true;
                        }
                    }
                    return false;
                }
            });

            DataSearch(RND, SUCHANAID);
            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(HHIdentity.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(HHIdentity.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(HHIdentity.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (spnDist.getSelectedItemPosition() == 0 & secDist.isShown()) {
                Connection.MessageBox(HHIdentity.this, "Required field: District.");
                spnDist.requestFocus();
                return;
            } else if (spnUpz.getSelectedItemPosition() == 0 & secUpz.isShown()) {
                Connection.MessageBox(HHIdentity.this, "Required field: Upazila.");
                spnUpz.requestFocus();
                return;
            } else if (spnUn.getSelectedItemPosition() == 0 & secUn.isShown()) {
                Connection.MessageBox(HHIdentity.this, "Required field: Union.");
                spnUn.requestFocus();
                return;
            } else if (spnVill.getSelectedItemPosition() == 0 & secVill.isShown()) {
                Connection.MessageBox(HHIdentity.this, "Required field: Village.");
                spnVill.requestFocus();
                return;
            } else if (txtH11.getText().toString().length() == 0 & secH11.isShown()) {
                Connection.MessageBox(HHIdentity.this, "Required field: খানা সনাক্তকারী নম্বর.");
                txtH11.requestFocus();
                return;
            } else if (Integer.valueOf(txtH11.getText().toString().length() == 0 ? "1" : txtH11.getText().toString()) < 1 || Integer.valueOf(txtH11.getText().toString().length() == 0 ? "9999" : txtH11.getText().toString()) > 9999) {
                Connection.MessageBox(HHIdentity.this, "Value should be between 1 and 9999(খানা সনাক্তকারী নম্বর).");
                txtH11.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(HHIdentity.this, "Required field: উপকারভোগী/সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (spnAgeGroup.getSelectedItemPosition() == 0 & secAgeGroup.isShown()) {
                Connection.MessageBox(HHIdentity.this, "Required field: শিশুর বয়স.");
                spnAgeGroup.requestFocus();
                return;
            }
            DV = Global.DateValidate(dtpH14.getText().toString());
            if (DV.length() != 0 & secH14.isShown()) {
                Connection.MessageBox(HHIdentity.this, DV);
                dtpH14.requestFocus();
                return;
            } else if (spnResult.getSelectedItemPosition() == 0 & secResult.isShown()) {
                Connection.MessageBox(HHIdentity.this, "Required field: সাক্ষাৎকার এর ফলাফল.");
                spnResult.requestFocus();
                return;
            } else if (txtOthResult.getText().toString().length() == 0 & secOthResult.isShown()) {
                Connection.MessageBox(HHIdentity.this, "Required field: সাক্ষাৎকার সম্পন্ন না হয়ে থাকলে তার কারণ কি?.");
                txtOthResult.requestFocus();
                return;
            } else if (!rdoH121.isChecked() & !rdoH122.isChecked() & !rdoH123.isChecked() & secH12.isShown()) {
                Connection.MessageBox(HHIdentity.this, "Select anyone options from (খানা’র নৃতাত্ত্বিক  গোষ্ঠী).");
                rdoH121.requestFocus();
                return;
            } else if (!rdoH011.isChecked() & !rdoH012.isChecked() & secH01.isShown()) {
                Connection.MessageBox(HHIdentity.this, "Select anyone options from (আপনার পরিবারে 15-40 বছর বয়সী বিবাহীত (বর্তমানে) নারী সদস্য রয়েছে কী? ).");
                rdoH011.requestFocus();
                return;
            } else if (!rdoH021.isChecked() & !rdoH022.isChecked() & secH02.isShown()) {
                Connection.MessageBox(HHIdentity.this, "Select anyone options from (আপনার পরিবারে 15-40 বছর বয়সী বিবাহীত (বর্তমানে) গর্ভবতী কিন্তু স্বামী পরিত্যাক্ত অথবা বিধবা নারী সদস্য রয়েছে কী?).");
                rdoH021.requestFocus();
                return;
            } else if (txtH12x.getText().toString().length() == 0 & secH12x.isShown()) {
                Connection.MessageBox(HHIdentity.this, "Required field: অন্যান্য.");
                txtH12x.requestFocus();
                return;
            } else if (txtH15.getText().toString().length() == 0 & secH15.isShown()) {
                Connection.MessageBox(HHIdentity.this, "Required field: উপকারভোগীর ফোন নম্বর.");
                txtH15.requestFocus();
                return;
            } else if (!rdoH031.isChecked() & !rdoH032.isChecked() & secH03.isShown()) {
                Connection.MessageBox(HHIdentity.this, "Select anyone options from (আপনার পরিবারে 0-23 months (under 2 years) শিশু সহ 15-40 বছর বয়সী স্বামী পরিত্যাক্ত অথবা বিধবা নারী সদস্য রয়েছে কী?).");
                rdoH031.requestFocus();
                return;
            } else if (!rdoH041.isChecked() & !rdoH042.isChecked() & secH04.isShown()) {
                Connection.MessageBox(HHIdentity.this, "Select anyone options from (আপনার পরিবারে 15-19 বছর বয়সী কিশোরী রয়েছে কী ?).");
                rdoH041.requestFocus();
                return;
            } else if (spnH17.getSelectedItemPosition() == 0 & secH17.isShown()) {
                Connection.MessageBox(HHIdentity.this, "Required field: সুচনা অনুসরে খানা’র গ্রুপ.");
                spnH17.requestFocus();
                return;
            } else if (!rdoH051.isChecked() & !rdoH052.isChecked() & secH05.isShown()) {
                Connection.MessageBox(HHIdentity.this, "Select anyone options from (আপনার পরিবারের মূল উপার্জনকারীর সারা বছরব্যাপী কাজের সুযোগ আছি কী ?).");
                rdoH051.requestFocus();
                return;
            } else if (!rdoH061.isChecked() & !rdoH062.isChecked() & secH06.isShown()) {
                Connection.MessageBox(HHIdentity.this, "Select anyone options from (সারা বছরব্যাপী পরিবারের সকল সদস্যের পর্যাপ্ত খাবারের (৩ বেলা পেট ভরে খাবারের) সুযোগ / নিশ্চয়তা আছে কী ? ).");
                rdoH061.requestFocus();
                return;
            } else if (!rdoH071.isChecked() & !rdoH072.isChecked() & secH07.isShown()) {
                Connection.MessageBox(HHIdentity.this, "Select anyone options from (দুর্দশার সময়/খারাপ সময় বেচে থাকার জন্য বিরূপ (নিজের জন্য ক্ষতিকর) কোনো ব্যবস্থা গ্রহন করেন কিনা? ).");
                rdoH071.requestFocus();
                return;
            } else if (spnH07a.getSelectedItemPosition() == 0 & secH07a.isShown()) {
                Connection.MessageBox(HHIdentity.this, "Required field: কি ব্যবস্থা গ্রহন করেন.");
                spnH07a.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            HHIdentity_DataModel objSave = new HHIdentity_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setDist((spnDist.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnDist.getSelectedItem().toString(), "-")));
            objSave.setUpz((spnUpz.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnUpz.getSelectedItem().toString(), "-")));
            objSave.setUn((spnUn.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnUn.getSelectedItem().toString(), "-")));
            objSave.setVill((spnVill.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnVill.getSelectedItem().toString(), "-")));
            objSave.setH11(txtH11.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setAgeGroup((spnAgeGroup.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnAgeGroup.getSelectedItem().toString(), "-")));
            objSave.setH14(dtpH14.getText().toString().length() > 0 ? Global.DateConvertYMD(dtpH14.getText().toString()) : dtpH14.getText().toString());
            objSave.setResult((spnResult.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnResult.getSelectedItem().toString(), "-")));
            objSave.setOthResult(txtOthResult.getText().toString());
            String[] d_rdogrpH12 = new String[]{"1", "2", "3"};
            objSave.setH12("");
            for (int i = 0; i < rdogrpH12.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH12.getChildAt(i);
                if (rb.isChecked()) objSave.setH12(d_rdogrpH12[i]);
            }

            String[] d_rdogrpH01 = new String[]{"1", "0"};
            objSave.setH01("");
            for (int i = 0; i < rdogrpH01.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH01.getChildAt(i);
                if (rb.isChecked()) objSave.setH01(d_rdogrpH01[i]);
            }

            String[] d_rdogrpH02 = new String[]{"1", "0"};
            objSave.setH02("");
            for (int i = 0; i < rdogrpH02.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH02.getChildAt(i);
                if (rb.isChecked()) objSave.setH02(d_rdogrpH02[i]);
            }

            objSave.setH12x(txtH12x.getText().toString());
            objSave.setH15(txtH15.getText().toString());
            String[] d_rdogrpH03 = new String[]{"1", "0"};
            objSave.setH03("");
            for (int i = 0; i < rdogrpH03.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH03.getChildAt(i);
                if (rb.isChecked()) objSave.setH03(d_rdogrpH03[i]);
            }

            String[] d_rdogrpH04 = new String[]{"1", "0"};
            objSave.setH04("");
            for (int i = 0; i < rdogrpH04.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH04.getChildAt(i);
                if (rb.isChecked()) objSave.setH04(d_rdogrpH04[i]);
            }

            objSave.setH17((spnH17.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH17.getSelectedItem().toString(), "-")));
            String[] d_rdogrpH05 = new String[]{"1", "0"};
            objSave.setH05("");
            for (int i = 0; i < rdogrpH05.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH05.getChildAt(i);
                if (rb.isChecked()) objSave.setH05(d_rdogrpH05[i]);
            }

            String[] d_rdogrpH06 = new String[]{"1", "0"};
            objSave.setH06("");
            for (int i = 0; i < rdogrpH06.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH06.getChildAt(i);
                if (rb.isChecked()) objSave.setH06(d_rdogrpH06[i]);
            }

            String[] d_rdogrpH07 = new String[]{"1", "0"};
            objSave.setH07("");
            for (int i = 0; i < rdogrpH07.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH07.getChildAt(i);
                if (rb.isChecked()) objSave.setH07(d_rdogrpH07[i]);
            }

            objSave.setH07a((spnH07a.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH07a.getSelectedItem().toString(), "-")));
            objSave.setStartTime(StartTime);
            objSave.setEndTime(g.CurrentTime24());
            objSave.setUserId(g.getUserId());
            objSave.setEntryUser(g.getUserId()); //from data entry user list
            //objSave.setLat(Double.toString(currentLatitude));
            //objSave.setLon(Double.toString(currentLongitude));

            String status = objSave.SaveUpdateData(this);
            if (status.length() == 0) {
                Connection.MessageBox(HHIdentity.this, "Saved Successfully");
            } else {
                Connection.MessageBox(HHIdentity.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(HHIdentity.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            HHIdentity_DataModel d = new HHIdentity_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<HHIdentity_DataModel> data = d.SelectAll(this, SQL);
            for (HHIdentity_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                spnDist.setSelection(Global.SpinnerItemPositionAnyLength(spnDist, item.getDist()));
                spnUpz.setSelection(Global.SpinnerItemPositionAnyLength(spnUpz, item.getUpz()));
                spnUn.setSelection(Global.SpinnerItemPositionAnyLength(spnUn, item.getUn()));
                spnVill.setSelection(Global.SpinnerItemPositionAnyLength(spnVill, item.getVill()));
                txtH11.setText(item.getH11());
                txtSuchanaID.setText(item.getSuchanaID());
                spnAgeGroup.setSelection(Global.SpinnerItemPositionAnyLength(spnAgeGroup, item.getAgeGroup()));
                dtpH14.setText(item.getH14().toString().length() == 0 ? "" : Global.DateConvertDMY(item.getH14()));
                spnResult.setSelection(Global.SpinnerItemPositionAnyLength(spnResult, item.getResult()));
                txtOthResult.setText(item.getOthResult());
                String[] d_rdogrpH12 = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH12.length; i++) {
                    if (item.getH12().equals(String.valueOf(d_rdogrpH12[i]))) {
                        rb = (RadioButton) rdogrpH12.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH01 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH01.length; i++) {
                    if (item.getH01().equals(String.valueOf(d_rdogrpH01[i]))) {
                        rb = (RadioButton) rdogrpH01.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH02 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH02.length; i++) {
                    if (item.getH02().equals(String.valueOf(d_rdogrpH02[i]))) {
                        rb = (RadioButton) rdogrpH02.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH12x.setText(item.getH12x());
                txtH15.setText(item.getH15());
                String[] d_rdogrpH03 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH03.length; i++) {
                    if (item.getH03().equals(String.valueOf(d_rdogrpH03[i]))) {
                        rb = (RadioButton) rdogrpH03.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH04 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH04.length; i++) {
                    if (item.getH04().equals(String.valueOf(d_rdogrpH04[i]))) {
                        rb = (RadioButton) rdogrpH04.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH17.setSelection(Global.SpinnerItemPositionAnyLength(spnH17, item.getH17()));
                String[] d_rdogrpH05 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH05.length; i++) {
                    if (item.getH05().equals(String.valueOf(d_rdogrpH05[i]))) {
                        rb = (RadioButton) rdogrpH05.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH06 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH06.length; i++) {
                    if (item.getH06().equals(String.valueOf(d_rdogrpH06[i]))) {
                        rb = (RadioButton) rdogrpH06.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH07 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH07.length; i++) {
                    if (item.getH07().equals(String.valueOf(d_rdogrpH07[i]))) {
                        rb = (RadioButton) rdogrpH07.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH07a.setSelection(Global.SpinnerItemPositionAnyLength(spnH07a, item.getH07a()));
            }
        } catch (Exception e) {
            Connection.MessageBox(HHIdentity.this, e.getMessage());
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
            case TIME_DIALOG:
                return new TimePickerDialog(this, timePickerListener, hour, minute, false);
        }
        return null;
    }

    //GPS Reading
    //.....................................................................................................
    public void FindLocation() {
        LocationManager locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);

        LocationListener locationListener = new LocationListener() {
            public void onLocationChanged(Location location) {
                updateLocation(location);
            }

            public void onStatusChanged(String provider, int status, Bundle extras) {
            }

            public void onProviderEnabled(String provider) {
            }

            public void onProviderDisabled(String provider) {
            }
        };
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
    }

    void updateLocation(Location location) {
        currentLocation = location;
        currentLatitude = currentLocation.getLatitude();
        currentLongitude = currentLocation.getLongitude();
    }


    // Method to turn on GPS
    public void turnGPSOn() {
        try {
            String provider = Settings.Secure.getString(getContentResolver(), Settings.Secure.LOCATION_PROVIDERS_ALLOWED);
            if (!provider.contains("gps")) { //if gps is disabled
                final Intent poke = new Intent();
                poke.setClassName("com.android.settings", "com.android.settings.widget.SettingsAppWidgetProvider");
                poke.addCategory(Intent.CATEGORY_ALTERNATIVE);
                poke.setData(Uri.parse("3"));
                sendBroadcast(poke);
            }
        } catch (Exception e) {
        }
    }

    // Method to turn off the GPS
    public void turnGPSOff() {
        String provider = Settings.Secure.getString(getContentResolver(), Settings.Secure.LOCATION_PROVIDERS_ALLOWED);

        if (provider.contains("gps")) { //if gps is enabled
            final Intent poke = new Intent();
            poke.setClassName("com.android.settings", "com.android.settings.widget.SettingsAppWidgetProvider");
            poke.addCategory(Intent.CATEGORY_ALTERNATIVE);
            poke.setData(Uri.parse("3"));
            sendBroadcast(poke);
        }
    }

    // turning off the GPS if its in on state. to avoid the battery drain.
    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        turnGPSOff();
    }
}