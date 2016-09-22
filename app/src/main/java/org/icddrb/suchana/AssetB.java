package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".AssetB" android:label="AssetB" />

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

public class AssetB extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    static String H41A = "";
    boolean networkAvailable = false;
    Location currentLocation;
    double currentLatitude, currentLongitude;
    String VariableID;
    Connection C;
    Global g;
    SimpleAdapter dataAdapter;
    ArrayList<HashMap<String, String>> dataList = new ArrayList<HashMap<String, String>>();
    TextView lblHeading;
    LinearLayout secRnd;
    View lineRnd;
    TextView VlblRnd;
    EditText txtRnd;
    LinearLayout secSuchanaID;
    View lineSuchanaID;
    TextView VlblSuchanaID;
    EditText txtSuchanaID;
    LinearLayout seclblH4;
    LinearLayout seclblH41;
    LinearLayout secH41a;
    View lineH41a;
    TextView VlblH41a;
    Spinner spnH41a;
    LinearLayout secH41aX;
    View lineH41aX;
    TextView VlblH41aX;
    EditText txtH41aX;
    LinearLayout secH41b;
    View lineH41b;
    TextView VlblH41b;
    EditText txtH41b;
    LinearLayout secH41c;
    View lineH41c;
    TextView VlblH41c;
    EditText txtH41c;
    LinearLayout secH41d;
    View lineH41d;
    TextView VlblH41d;
    EditText txtH41d;
    LinearLayout secH41e;
    View lineH41e;
    TextView VlblH41e;
    Spinner spnH41e;
    LinearLayout secH41eX;
    View lineH41eX;
    TextView VlblH41eX;
    EditText txtH41eX;
    LinearLayout secH41f;
    View lineH41f;
    TextView VlblH41f;
    Spinner spnH41f;
    LinearLayout secH41fX;
    View lineH41fX;
    TextView VlblH41fX;
    EditText txtH41fX;
    LinearLayout secH41g;
    View lineH41g;
    TextView VlblH41g;
    RadioGroup rdogrpH41g;
    RadioButton rdoH41g1;
    RadioButton rdoH41g2;
    LinearLayout secH41h;
    View lineH41h;
    TextView VlblH41h;
    EditText txtH41h;
    LinearLayout seclblH41a;
    LinearLayout secH41i;
    View lineH41i;
    TextView VlblH41i;
    EditText txtH41i;
    LinearLayout secH41j;
    View lineH41j;
    TextView VlblH41j;
    EditText txtH41j;
    LinearLayout secH41k;
    View lineH41k;
    TextView VlblH41k;
    Spinner spnH41k;
    LinearLayout secH41kX;
    View lineH41kX;
    TextView VlblH41kX;
    EditText txtH41kX;
    LinearLayout seclblH41b;
    LinearLayout secH41l;
    View lineH41l;
    TextView VlblH41l;
    EditText txtH41l;
    LinearLayout secH41m;
    View lineH41m;
    TextView VlblH41m;
    EditText txtH41m;
    LinearLayout secH41n;
    View lineH41n;
    TextView VlblH41n;
    EditText txtH41n;
    LinearLayout secH41o;
    View lineH41o;
    TextView VlblH41o;
    Spinner spnH41o;
    LinearLayout secH41oX;
    View lineH41oX;
    TextView VlblH41oX;
    EditText txtH41oX;
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
            EditText dtpDate = null;


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
            setContentView(R.layout.assetb);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");
            H41A = IDbundle.getString("H41a");

            TableName = "AssetB";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(AssetB.this);
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
            lineRnd = (View) findViewById(R.id.lineRnd);
            VlblRnd = (TextView) findViewById(R.id.VlblRnd);
            txtRnd = (EditText) findViewById(R.id.txtRnd);
            secSuchanaID = (LinearLayout) findViewById(R.id.secSuchanaID);
            lineSuchanaID = (View) findViewById(R.id.lineSuchanaID);
            VlblSuchanaID = (TextView) findViewById(R.id.VlblSuchanaID);
            txtSuchanaID = (EditText) findViewById(R.id.txtSuchanaID);
            seclblH4 = (LinearLayout) findViewById(R.id.seclblH4);
            seclblH41 = (LinearLayout) findViewById(R.id.seclblH41);
            secH41a = (LinearLayout) findViewById(R.id.secH41a);
            lineH41a = (View) findViewById(R.id.lineH41a);
            VlblH41a = (TextView) findViewById(R.id.VlblH41a);
            spnH41a = (Spinner) findViewById(R.id.spnH41a);
            List<String> listH41a = new ArrayList<String>();

            listH41a.add("");
            listH41a.add("01-গরু");
            listH41a.add("02-হাঁস ও মুরগী");
            listH41a.add("03-পাখি  যেমন কবুতর");
            listH41a.add("04-ছাগল / ভেড়া");
            listH41a.add("05-শূকর");
            listH41a.add("06-মাছ");
            listH41a.add("07-অন্যান্য পশুপাখি (উল্লেখ কর)");
            listH41a.add("08-লাঙ্গল");
            listH41a.add("09-মাড়াইয়ের যন্ত্র");
            listH41a.add("10-গোয়াল ঘর");
            listH41a.add("11-দোকানের জন্য প্রাঙ্গন");
            listH41a.add("12-শষ্য সংরক্ষনের চলা/গুদাম");
            listH41a.add("13-নৌকা");
            listH41a.add("14-মোটর চালিত নৌকা");
            listH41a.add("15-মাছ ধরার জাল");
            listH41a.add("16-রিক্সা/ভ্যান");
            listH41a.add("17-গাছ");
            listH41a.add("18-ঠেলা গাড়ী");
            listH41a.add("19-সেলাই মেশিন");
            listH41a.add("20-CNG/নসিমন");
            listH41a.add("21-অন্যান্য");
            listH41a.add("22-অন্যান্য");
            ArrayAdapter<String> adptrH41a = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH41a);
            spnH41a.setAdapter(adptrH41a);

            spnH41a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH41a.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH41a.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("21")) {
                    } else if (spnData.equalsIgnoreCase("22")) {
                    } else {
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH41aX = (LinearLayout) findViewById(R.id.secH41aX);
            lineH41aX = (View) findViewById(R.id.lineH41aX);
            VlblH41aX = (TextView) findViewById(R.id.VlblH41aX);
            txtH41aX = (EditText) findViewById(R.id.txtH41aX);
            secH41b = (LinearLayout) findViewById(R.id.secH41b);
            lineH41b = (View) findViewById(R.id.lineH41b);
            VlblH41b = (TextView) findViewById(R.id.VlblH41b);
            txtH41b = (EditText) findViewById(R.id.txtH41b);
            secH41c = (LinearLayout) findViewById(R.id.secH41c);
            lineH41c = (View) findViewById(R.id.lineH41c);
            VlblH41c = (TextView) findViewById(R.id.VlblH41c);
            txtH41c = (EditText) findViewById(R.id.txtH41c);
            secH41d = (LinearLayout) findViewById(R.id.secH41d);
            lineH41d = (View) findViewById(R.id.lineH41d);
            VlblH41d = (TextView) findViewById(R.id.VlblH41d);
            txtH41d = (EditText) findViewById(R.id.txtH41d);
            secH41e = (LinearLayout) findViewById(R.id.secH41e);
            lineH41e = (View) findViewById(R.id.lineH41e);
            VlblH41e = (TextView) findViewById(R.id.VlblH41e);
            spnH41e = (Spinner) findViewById(R.id.spnH41e);
            List<String> listH41e = new ArrayList<String>();

            listH41e.add("");
            listH41e.add("1-ক্রয়কৃত");
            listH41e.add("2-উত্তরাধিকারসূত্রে");
            listH41e.add("3-উপহার");
            listH41e.add("4-যৌতুক");
            listH41e.add("5-নিজে তৈরী করা");
            listH41e.add("6-সুচনা প্রজেক্ট");
            listH41e.add("7-অন্যান্য এনজিও");
            listH41e.add("8-সরকার");
            listH41e.add("9-যৌথ উৎপাদন থেকে প্রাপ্ত অংশ");
            listH41e.add("10-অন্যান্য");
            ArrayAdapter<String> adptrH41e = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH41e);
            spnH41e.setAdapter(adptrH41e);

            spnH41e.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH41e.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH41e.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("1")) {
                        secH41eX.setVisibility(View.GONE);
                        lineH41eX.setVisibility(View.GONE);
                        secH41f.setVisibility(View.GONE);
                        lineH41f.setVisibility(View.GONE);
                        secH41fX.setVisibility(View.GONE);
                        lineH41fX.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("10")) {
                        secH41eX.setVisibility(View.GONE);
                        lineH41eX.setVisibility(View.GONE);
                    } else {
                        secH41eX.setVisibility(View.VISIBLE);
                        lineH41eX.setVisibility(View.VISIBLE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH41eX = (LinearLayout) findViewById(R.id.secH41eX);
            lineH41eX = (View) findViewById(R.id.lineH41eX);
            VlblH41eX = (TextView) findViewById(R.id.VlblH41eX);
            txtH41eX = (EditText) findViewById(R.id.txtH41eX);
            secH41f = (LinearLayout) findViewById(R.id.secH41f);
            lineH41f = (View) findViewById(R.id.lineH41f);
            VlblH41f = (TextView) findViewById(R.id.VlblH41f);
            spnH41f = (Spinner) findViewById(R.id.spnH41f);
            List<String> listH41f = new ArrayList<String>();

            listH41f.add("");
            listH41f.add("1-নিজ স্বসঞ্চয়");
            listH41f.add("2-যৌতুকের অর্থ");
            listH41f.add("3-আত্মীয়স্বজনের কাছ থেকে ধার");
            listH41f.add("4-বন্ধু বা প্রতিবেশীর কাছ থেকে ধার স্থানীয়");
            listH41f.add("5-এনজিও থেকে ধার");
            listH41f.add("6-অন্যান্য এনজিও থেকে ধার");
            listH41f.add("7-ব্যাংক থেকে ধার");
            listH41f.add("8-মহাজনদের কাছ থেকে ধার");
            listH41f.add("9-সুচনা প্রজেক্ট");
            listH41f.add("10-অন্যান্য");
            ArrayAdapter<String> adptrH41f = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH41f);
            spnH41f.setAdapter(adptrH41f);

            spnH41f.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH41f.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH41f.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("10")) {
                        secH41fX.setVisibility(View.GONE);
                        lineH41fX.setVisibility(View.GONE);
                    } else {
                        secH41fX.setVisibility(View.VISIBLE);
                        lineH41fX.setVisibility(View.VISIBLE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH41fX = (LinearLayout) findViewById(R.id.secH41fX);
            lineH41fX = (View) findViewById(R.id.lineH41fX);
            VlblH41fX = (TextView) findViewById(R.id.VlblH41fX);
            txtH41fX = (EditText) findViewById(R.id.txtH41fX);
            secH41g = (LinearLayout) findViewById(R.id.secH41g);
            lineH41g = (View) findViewById(R.id.lineH41g);
            VlblH41g = (TextView) findViewById(R.id.VlblH41g);
            rdogrpH41g = (RadioGroup) findViewById(R.id.rdogrpH41g);

            rdoH41g1 = (RadioButton) findViewById(R.id.rdoH41g1);
            rdoH41g2 = (RadioButton) findViewById(R.id.rdoH41g2);
            rdogrpH41g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH41g = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH41g.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH41g.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH41g[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH41h.setVisibility(View.GONE);
                        lineH41h.setVisibility(View.GONE);
                        txtH41h.setText("");
                    } else {
                        secH41h.setVisibility(View.VISIBLE);
                        lineH41h.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH41h = (LinearLayout) findViewById(R.id.secH41h);
            lineH41h = (View) findViewById(R.id.lineH41h);
            VlblH41h = (TextView) findViewById(R.id.VlblH41h);
            txtH41h = (EditText) findViewById(R.id.txtH41h);
            seclblH41a = (LinearLayout) findViewById(R.id.seclblH41a);
            secH41i = (LinearLayout) findViewById(R.id.secH41i);
            lineH41i = (View) findViewById(R.id.lineH41i);
            VlblH41i = (TextView) findViewById(R.id.VlblH41i);
            txtH41i = (EditText) findViewById(R.id.txtH41i);
            secH41j = (LinearLayout) findViewById(R.id.secH41j);
            lineH41j = (View) findViewById(R.id.lineH41j);
            VlblH41j = (TextView) findViewById(R.id.VlblH41j);
            txtH41j = (EditText) findViewById(R.id.txtH41j);
            secH41k = (LinearLayout) findViewById(R.id.secH41k);
            lineH41k = (View) findViewById(R.id.lineH41k);
            VlblH41k = (TextView) findViewById(R.id.VlblH41k);
            spnH41k = (Spinner) findViewById(R.id.spnH41k);
            List<String> listH41k = new ArrayList<String>();

            listH41k.add("");
            listH41k.add("1-অনান্য এনজিও");
            listH41k.add("2-ভাই বোন");
            listH41k.add("3-আত্মীয়স্বজন");
            listH41k.add("4-বন্ধু প্রতিবেশীর");
            listH41k.add("5-সুচনা প্রজেক্ট");
            listH41k.add("6-অন্যান্য");
            ArrayAdapter<String> adptrH41k = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH41k);
            spnH41k.setAdapter(adptrH41k);

            spnH41k.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH41k.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH41k.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("6")) {
                        secH41kX.setVisibility(View.GONE);
                        lineH41kX.setVisibility(View.GONE);
                    } else {
                        secH41kX.setVisibility(View.VISIBLE);
                        lineH41kX.setVisibility(View.VISIBLE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH41kX = (LinearLayout) findViewById(R.id.secH41kX);
            lineH41kX = (View) findViewById(R.id.lineH41kX);
            VlblH41kX = (TextView) findViewById(R.id.VlblH41kX);
            txtH41kX = (EditText) findViewById(R.id.txtH41kX);
            seclblH41b = (LinearLayout) findViewById(R.id.seclblH41b);
            secH41l = (LinearLayout) findViewById(R.id.secH41l);
            lineH41l = (View) findViewById(R.id.lineH41l);
            VlblH41l = (TextView) findViewById(R.id.VlblH41l);
            txtH41l = (EditText) findViewById(R.id.txtH41l);
            secH41m = (LinearLayout) findViewById(R.id.secH41m);
            lineH41m = (View) findViewById(R.id.lineH41m);
            VlblH41m = (TextView) findViewById(R.id.VlblH41m);
            txtH41m = (EditText) findViewById(R.id.txtH41m);
            secH41n = (LinearLayout) findViewById(R.id.secH41n);
            lineH41n = (View) findViewById(R.id.lineH41n);
            VlblH41n = (TextView) findViewById(R.id.VlblH41n);
            txtH41n = (EditText) findViewById(R.id.txtH41n);
            secH41o = (LinearLayout) findViewById(R.id.secH41o);
            lineH41o = (View) findViewById(R.id.lineH41o);
            VlblH41o = (TextView) findViewById(R.id.VlblH41o);
            spnH41o = (Spinner) findViewById(R.id.spnH41o);
            List<String> listH41o = new ArrayList<String>();

            listH41o.add("");
            listH41o.add("1-বিক্রি");
            listH41o.add("2-যৌতুক");
            listH41o.add("3-উপহার");
            listH41o.add("4-অন্যান্য");
            ArrayAdapter<String> adptrH41o = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH41o);
            spnH41o.setAdapter(adptrH41o);

            secH41oX = (LinearLayout) findViewById(R.id.secH41oX);
            lineH41oX = (View) findViewById(R.id.lineH41oX);
            VlblH41oX = (TextView) findViewById(R.id.VlblH41oX);
            txtH41oX = (EditText) findViewById(R.id.txtH41oX);


            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(AssetB.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(AssetB.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(AssetB.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(AssetB.this, "Required field: উপকারভোগী সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (spnH41a.getSelectedItemPosition() == 0 & secH41a.isShown()) {
                Connection.MessageBox(AssetB.this, "Required field: সম্পদ.");
                spnH41a.requestFocus();
                return;
            } else if (txtH41aX.getText().toString().length() == 0 & secH41aX.isShown()) {
                Connection.MessageBox(AssetB.this, "Required field: অন্যান্য সম্পদ.");
                txtH41aX.requestFocus();
                return;
            } else if (txtH41b.getText().toString().length() == 0 & secH41b.isShown()) {
                Connection.MessageBox(AssetB.this, "Required field: সংখ্যা.");
                txtH41b.requestFocus();
                return;
            } else if (Integer.valueOf(txtH41b.getText().toString().length() == 0 ? "00" : txtH41b.getText().toString()) < 00 || Integer.valueOf(txtH41b.getText().toString().length() == 0 ? "999" : txtH41b.getText().toString()) > 999) {
                Connection.MessageBox(AssetB.this, "Value should be between 00 and 999(সংখ্যা).");
                txtH41b.requestFocus();
                return;
            } else if (txtH41c.getText().toString().length() == 0 & secH41c.isShown()) {
                Connection.MessageBox(AssetB.this, "Required field: এই সম্পদ কত মাস ধরে আছে (যে সম্পদটি সর্বোচ্চ সময় ধরে আছে, সেটার সময়কাল  উল্লেখ করুন).");
                txtH41c.requestFocus();
                return;
            } else if (Integer.valueOf(txtH41c.getText().toString().length() == 0 ? "00" : txtH41c.getText().toString()) < 00 || Integer.valueOf(txtH41c.getText().toString().length() == 0 ? "99" : txtH41c.getText().toString()) > 99) {
                Connection.MessageBox(AssetB.this, "Value should be between 00 and 99(এই সম্পদ কত মাস ধরে আছে (যে সম্পদটি সর্বোচ্চ সময় ধরে আছে, সেটার সময়কাল  উল্লেখ করুন)).");
                txtH41c.requestFocus();
                return;
            } else if (txtH41d.getText().toString().length() == 0 & secH41d.isShown()) {
                Connection.MessageBox(AssetB.this, "Required field: এই সম্পদের বর্তমান মূল্য.");
                txtH41d.requestFocus();
                return;
            } else if (Integer.valueOf(txtH41d.getText().toString().length() == 0 ? "00" : txtH41d.getText().toString()) < 00 || Integer.valueOf(txtH41d.getText().toString().length() == 0 ? "999999" : txtH41d.getText().toString()) > 999999) {
                Connection.MessageBox(AssetB.this, "Value should be between 00 and 999999(এই সম্পদের বর্তমান মূল্য).");
                txtH41d.requestFocus();
                return;
            } else if (spnH41e.getSelectedItemPosition() == 0 & secH41e.isShown()) {
                Connection.MessageBox(AssetB.this, "Required field: এই সম্পদ কিভাবে অর্জিত হয়েছে.");
                spnH41e.requestFocus();
                return;
            } else if (txtH41eX.getText().toString().length() == 0 & secH41eX.isShown()) {
                Connection.MessageBox(AssetB.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH41eX.requestFocus();
                return;
            } else if (spnH41f.getSelectedItemPosition() == 0 & secH41f.isShown()) {
                Connection.MessageBox(AssetB.this, "Required field: যদি ক্রয় করে থাকেন তাহলে অর্থায়ন কি ভাবে হয়েছিল.");
                spnH41f.requestFocus();
                return;
            } else if (txtH41fX.getText().toString().length() == 0 & secH41fX.isShown()) {
                Connection.MessageBox(AssetB.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH41fX.requestFocus();
                return;
            } else if (!rdoH41g1.isChecked() & !rdoH41g2.isChecked() & secH41g.isShown()) {
                Connection.MessageBox(AssetB.this, "Select anyone options from (এই সম্পদ কি কারোর সাথে ভাগাভাগি করেন).");
                rdoH41g1.requestFocus();
                return;
            } else if (txtH41h.getText().toString().length() == 0 & secH41h.isShown()) {
                Connection.MessageBox(AssetB.this, "Required field: সম্পদ কারো সাথে ভাগাভাগি করলে, কত শতাংশ আপনার নিজের?.");
                txtH41h.requestFocus();
                return;
            } else if (Integer.valueOf(txtH41h.getText().toString().length() == 0 ? "1" : txtH41h.getText().toString()) < 1 || Integer.valueOf(txtH41h.getText().toString().length() == 0 ? "100" : txtH41h.getText().toString()) > 100) {
                Connection.MessageBox(AssetB.this, "Value should be between 1 and 100(সম্পদ কারো সাথে ভাগাভাগি করলে, কত শতাংশ আপনার নিজের?).");
                txtH41h.requestFocus();
                return;
            } else if (txtH41i.getText().toString().length() == 0 & secH41i.isShown()) {
                Connection.MessageBox(AssetB.this, "Required field: সংখ্যা.");
                txtH41i.requestFocus();
                return;
            } else if (Integer.valueOf(txtH41i.getText().toString().length() == 0 ? "1" : txtH41i.getText().toString()) < 1 || Integer.valueOf(txtH41i.getText().toString().length() == 0 ? "999" : txtH41i.getText().toString()) > 999) {
                Connection.MessageBox(AssetB.this, "Value should be between 1 and 999(সংখ্যা).");
                txtH41i.requestFocus();
                return;
            } else if (txtH41j.getText().toString().length() == 0 & secH41j.isShown()) {
                Connection.MessageBox(AssetB.this, "Required field: কবে থেকে আছে (সর্বোচ্চ সময়কাল উল্লেখ করুন) (মাস).");
                txtH41j.requestFocus();
                return;
            } else if (Integer.valueOf(txtH41j.getText().toString().length() == 0 ? "1" : txtH41j.getText().toString()) < 1 || Integer.valueOf(txtH41j.getText().toString().length() == 0 ? "99" : txtH41j.getText().toString()) > 99) {
                Connection.MessageBox(AssetB.this, "Value should be between 1 and 99(কবে থেকে আছে (সর্বোচ্চ সময়কাল উল্লেখ করুন) (মাস)).");
                txtH41j.requestFocus();
                return;
            } else if (spnH41k.getSelectedItemPosition() == 0 & secH41k.isShown()) {
                Connection.MessageBox(AssetB.this, "Required field: কার কাছ থেকে কোথা থেকে পেয়েছেন.");
                spnH41k.requestFocus();
                return;
            } else if (txtH41kX.getText().toString().length() == 0 & secH41kX.isShown()) {
                Connection.MessageBox(AssetB.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH41kX.requestFocus();
                return;
            } else if (txtH41l.getText().toString().length() == 0 & secH41l.isShown()) {
                Connection.MessageBox(AssetB.this, "Required field: সংখ্যা.");
                txtH41l.requestFocus();
                return;
            } else if (Integer.valueOf(txtH41l.getText().toString().length() == 0 ? "0" : txtH41l.getText().toString()) < 0 || Integer.valueOf(txtH41l.getText().toString().length() == 0 ? "999" : txtH41l.getText().toString()) > 999) {
                Connection.MessageBox(AssetB.this, "Value should be between 0 and 999(সংখ্যা).");
                txtH41l.requestFocus();
                return;
            } else if (txtH41m.getText().toString().length() == 0 & secH41m.isShown()) {
                Connection.MessageBox(AssetB.this, "Required field: এই সম্পদ বিক্রী বা হস্তান্তরের সময় মূল্য কত ছিল.");
                txtH41m.requestFocus();
                return;
            } else if (Integer.valueOf(txtH41m.getText().toString().length() == 0 ? "0" : txtH41m.getText().toString()) < 0 || Integer.valueOf(txtH41m.getText().toString().length() == 0 ? "999999" : txtH41m.getText().toString()) > 999999) {
                Connection.MessageBox(AssetB.this, "Value should be between 0 and 999999(এই সম্পদ বিক্রী বা হস্তান্তরের সময় মূল্য কত ছিল).");
                txtH41m.requestFocus();
                return;
            } else if (txtH41n.getText().toString().length() == 0 & secH41n.isShown()) {
                Connection.MessageBox(AssetB.this, "Required field: এই সম্পদের বর্তমান মূল্য কত.");
                txtH41n.requestFocus();
                return;
            } else if (Integer.valueOf(txtH41n.getText().toString().length() == 0 ? "0" : txtH41n.getText().toString()) < 0 || Integer.valueOf(txtH41n.getText().toString().length() == 0 ? "999999" : txtH41n.getText().toString()) > 999999) {
                Connection.MessageBox(AssetB.this, "Value should be between 0 and 999999(এই সম্পদের বর্তমান মূল্য কত).");
                txtH41n.requestFocus();
                return;
            } else if (spnH41o.getSelectedItemPosition() == 0 & secH41o.isShown()) {
                Connection.MessageBox(AssetB.this, "Required field: এই সম্পদটি কি ভাবে বদলি করেছেন.");
                spnH41o.requestFocus();
                return;
            } else if (txtH41oX.getText().toString().length() == 0 & secH41oX.isShown()) {
                Connection.MessageBox(AssetB.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH41oX.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            AssetB_DataModel objSave = new AssetB_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setH41a((spnH41a.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH41a.getSelectedItem().toString(), "-")));
            objSave.setH41aX(txtH41aX.getText().toString());
            objSave.setH41b(txtH41b.getText().toString());
            objSave.setH41c(txtH41c.getText().toString());
            objSave.setH41d(txtH41d.getText().toString());
            objSave.setH41e((spnH41e.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH41e.getSelectedItem().toString(), "-")));
            objSave.setH41eX(txtH41eX.getText().toString());
            objSave.setH41f((spnH41f.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH41f.getSelectedItem().toString(), "-")));
            objSave.setH41fX(txtH41fX.getText().toString());
            String[] d_rdogrpH41g = new String[]{"1", "0"};
            objSave.setH41g("");
            for (int i = 0; i < rdogrpH41g.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH41g.getChildAt(i);
                if (rb.isChecked()) objSave.setH41g(d_rdogrpH41g[i]);
            }

            objSave.setH41h(txtH41h.getText().toString());
            objSave.setH41i(txtH41i.getText().toString());
            objSave.setH41j(txtH41j.getText().toString());
            objSave.setH41k((spnH41k.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH41k.getSelectedItem().toString(), "-")));
            objSave.setH41kX(txtH41kX.getText().toString());
            objSave.setH41l(txtH41l.getText().toString());
            objSave.setH41m(txtH41m.getText().toString());
            objSave.setH41n(txtH41n.getText().toString());
            objSave.setH41o((spnH41o.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH41o.getSelectedItem().toString(), "-")));
            objSave.setH41oX(txtH41oX.getText().toString());
            objSave.setStartTime(StartTime);
            objSave.setEndTime(g.CurrentTime24());
            objSave.setUserId(g.getUserId());
            objSave.setEntryUser(g.getUserId()); //from data entry user list
            //objSave.setLat(Double.toString(currentLatitude));
            //objSave.setLon(Double.toString(currentLongitude));

            String status = objSave.SaveUpdateData(this);
            if (status.length() == 0) {
                Connection.MessageBox(AssetB.this, "Saved Successfully");
            } else {
                Connection.MessageBox(AssetB.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(AssetB.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID, String H41a) {
        try {

            RadioButton rb;
            AssetB_DataModel d = new AssetB_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "' and H41a='" + H41a + "'";
            List<AssetB_DataModel> data = d.SelectAll(this, SQL);
            for (AssetB_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                spnH41a.setSelection(Global.SpinnerItemPositionAnyLength(spnH41a, item.getH41a()));
                txtH41aX.setText(item.getH41aX());
                txtH41b.setText(item.getH41b());
                txtH41c.setText(item.getH41c());
                txtH41d.setText(item.getH41d());
                spnH41e.setSelection(Global.SpinnerItemPositionAnyLength(spnH41e, item.getH41e()));
                txtH41eX.setText(item.getH41eX());
                spnH41f.setSelection(Global.SpinnerItemPositionAnyLength(spnH41f, item.getH41f()));
                txtH41fX.setText(item.getH41fX());
                String[] d_rdogrpH41g = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH41g.length; i++) {
                    if (item.getH41g().equals(String.valueOf(d_rdogrpH41g[i]))) {
                        rb = (RadioButton) rdogrpH41g.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH41h.setText(item.getH41h());
                txtH41i.setText(item.getH41i());
                txtH41j.setText(item.getH41j());
                spnH41k.setSelection(Global.SpinnerItemPositionAnyLength(spnH41k, item.getH41k()));
                txtH41kX.setText(item.getH41kX());
                txtH41l.setText(item.getH41l());
                txtH41m.setText(item.getH41m());
                txtH41n.setText(item.getH41n());
                spnH41o.setSelection(Global.SpinnerItemPositionAnyLength(spnH41o, item.getH41o()));
                txtH41oX.setText(item.getH41oX());
            }
        } catch (Exception e) {
            Connection.MessageBox(AssetB.this, e.getMessage());
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