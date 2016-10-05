package org.icddrb.suchana;

/**
 * Created by TanvirHossain on 05/10/2016.
 */


//Android Manifest Code
//<activity android:name=".NutHealth" android:label="NutHealth" />

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
import android.widget.CheckBox;
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

public class NutHealth extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
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
    LinearLayout seclblM31;
    LinearLayout secM31a;
    View lineM31a;
    TextView VlblM31a;
    CheckBox chkM31a;
    LinearLayout secM31b;
    View lineM31b;
    TextView VlblM31b;
    CheckBox chkM31b;
    LinearLayout secM31c;
    View lineM31c;
    TextView VlblM31c;
    CheckBox chkM31c;
    LinearLayout secM31d;
    View lineM31d;
    TextView VlblM31d;
    CheckBox chkM31d;
    LinearLayout secM31e;
    View lineM31e;
    TextView VlblM31e;
    CheckBox chkM31e;
    LinearLayout secM31f;
    View lineM31f;
    TextView VlblM31f;
    CheckBox chkM31f;
    LinearLayout secM31g;
    View lineM31g;
    TextView VlblM31g;
    CheckBox chkM31g;
    LinearLayout secM31h;
    View lineM31h;
    TextView VlblM31h;
    CheckBox chkM31h;
    LinearLayout secM31i;
    View lineM31i;
    TextView VlblM31i;
    CheckBox chkM31i;
    LinearLayout secM31x;
    View lineM31x;
    TextView VlblM31x;
    CheckBox chkM31x;
    LinearLayout secM31x1;
    View lineM31x1;
    TextView VlblM31x1;
    EditText txtM31x1;
    LinearLayout secM32;
    View lineM32;
    TextView VlblM32;
    RadioGroup rdogrpM32;
    RadioButton rdoM321;
    RadioButton rdoM322;
    RadioButton rdoM323;
    LinearLayout secM33;
    View lineM33;
    TextView VlblM33;
    Spinner spnM33;
    LinearLayout secM34;
    View lineM34;
    TextView VlblM34;
    RadioGroup rdogrpM34;
    RadioButton rdoM341;
    RadioButton rdoM342;
    LinearLayout secM35;
    View lineM35;
    TextView VlblM35;
    RadioGroup rdogrpM35;
    RadioButton rdoM351;
    RadioButton rdoM352;
    LinearLayout secM36;
    View lineM36;
    TextView VlblM36;
    Spinner spnM36;
    LinearLayout secM37;
    View lineM37;
    TextView VlblM37;
    RadioGroup rdogrpM37;
    RadioButton rdoM371;
    RadioButton rdoM372;
    LinearLayout secM38;
    View lineM38;
    TextView VlblM38;
    Spinner spnM38;
    LinearLayout secM38X1;
    View lineM38X1;
    TextView VlblM38X1;
    EditText txtM38X1;
    ImageButton cmdForward;
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


            /*dtpDate.setText(new StringBuilder()
                    .append(Global.Right("00"+mDay,2)).append("/")
                    .append(Global.Right("00"+mMonth,2)).append("/")
                    .append(mYear));*/
        }
    };
    private TimePickerDialog.OnTimeSetListener timePickerListener = new TimePickerDialog.OnTimeSetListener() {
        public void onTimeSet(TimePicker view, int selectedHour, int selectedMinute) {
            hour = selectedHour;
            minute = selectedMinute;
            EditText tpTime;


            //tpTime.setText(new StringBuilder().append(Global.Right("00"+hour,2)).append(":").append(Global.Right("00"+minute,2)));

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
            setContentView(R.layout.nuthealth);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TableName = "NutHealth";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);
            ImageButton cmdHome = (ImageButton) findViewById(R.id.cmdHome);
            cmdHome.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", RND);
                    IDbundle.putString("SuchanaID", SUCHANAID);
                    Intent f1;
                    f1 = new Intent(getApplicationContext(), UpdateMenu.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);
                }
            });
            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(NutHealth.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            /*Intent intent = new Intent(getApplicationContext(), HandWash.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDbundle);
                            getApplicationContext().startActivity(intent);
                            finish();*/
                        }
                    });
                    adb.show();
                }
            });

            cmdForward = (ImageButton) findViewById(R.id.cmdForward);
            cmdForward.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(NutHealth.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to start AssetB [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDBundle = new Bundle();
                            IDBundle.putString("Rnd", RND);
                            IDBundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), WomenEmp.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDBundle);
                            getApplicationContext().startActivity(intent);
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
            txtRnd.setText(RND);
            txtRnd.setEnabled(false);
            secSuchanaID = (LinearLayout) findViewById(R.id.secSuchanaID);
            lineSuchanaID = (View) findViewById(R.id.lineSuchanaID);
            VlblSuchanaID = (TextView) findViewById(R.id.VlblSuchanaID);
            txtSuchanaID = (EditText) findViewById(R.id.txtSuchanaID);
            txtSuchanaID.setText(SUCHANAID);
            txtSuchanaID.setEnabled(false);
            seclblM31 = (LinearLayout) findViewById(R.id.seclblM31);
            secM31a = (LinearLayout) findViewById(R.id.secM31a);
            lineM31a = (View) findViewById(R.id.lineM31a);
            VlblM31a = (TextView) findViewById(R.id.VlblM31a);
            chkM31a = (CheckBox) findViewById(R.id.chkM31a);
            secM31b = (LinearLayout) findViewById(R.id.secM31b);
            lineM31b = (View) findViewById(R.id.lineM31b);
            VlblM31b = (TextView) findViewById(R.id.VlblM31b);
            chkM31b = (CheckBox) findViewById(R.id.chkM31b);
            secM31c = (LinearLayout) findViewById(R.id.secM31c);
            lineM31c = (View) findViewById(R.id.lineM31c);
            VlblM31c = (TextView) findViewById(R.id.VlblM31c);
            chkM31c = (CheckBox) findViewById(R.id.chkM31c);
            secM31d = (LinearLayout) findViewById(R.id.secM31d);
            lineM31d = (View) findViewById(R.id.lineM31d);
            VlblM31d = (TextView) findViewById(R.id.VlblM31d);
            chkM31d = (CheckBox) findViewById(R.id.chkM31d);
            secM31e = (LinearLayout) findViewById(R.id.secM31e);
            lineM31e = (View) findViewById(R.id.lineM31e);
            VlblM31e = (TextView) findViewById(R.id.VlblM31e);
            chkM31e = (CheckBox) findViewById(R.id.chkM31e);
            secM31f = (LinearLayout) findViewById(R.id.secM31f);
            lineM31f = (View) findViewById(R.id.lineM31f);
            VlblM31f = (TextView) findViewById(R.id.VlblM31f);
            chkM31f = (CheckBox) findViewById(R.id.chkM31f);
            secM31g = (LinearLayout) findViewById(R.id.secM31g);
            lineM31g = (View) findViewById(R.id.lineM31g);
            VlblM31g = (TextView) findViewById(R.id.VlblM31g);
            chkM31g = (CheckBox) findViewById(R.id.chkM31g);
            secM31h = (LinearLayout) findViewById(R.id.secM31h);
            lineM31h = (View) findViewById(R.id.lineM31h);
            VlblM31h = (TextView) findViewById(R.id.VlblM31h);
            chkM31h = (CheckBox) findViewById(R.id.chkM31h);
            secM31i = (LinearLayout) findViewById(R.id.secM31i);
            lineM31i = (View) findViewById(R.id.lineM31i);
            VlblM31i = (TextView) findViewById(R.id.VlblM31i);
            chkM31i = (CheckBox) findViewById(R.id.chkM31i);
            secM31x = (LinearLayout) findViewById(R.id.secM31x);
            lineM31x = (View) findViewById(R.id.lineM31x);
            VlblM31x = (TextView) findViewById(R.id.VlblM31x);
            chkM31x = (CheckBox) findViewById(R.id.chkM31x);
            chkM31x.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {
                        secM31x1.setVisibility(View.GONE);
                        lineM31x1.setVisibility(View.GONE);
                        txtM31x1.setText("");
                    } else {
                        secM31x1.setVisibility(View.VISIBLE);
                        lineM31x1.setVisibility(View.VISIBLE);
                    }
                }
            });
            secM31x1 = (LinearLayout) findViewById(R.id.secM31x1);
            lineM31x1 = (View) findViewById(R.id.lineM31x1);
            VlblM31x1 = (TextView) findViewById(R.id.VlblM31x1);
            txtM31x1 = (EditText) findViewById(R.id.txtM31x1);
            secM32 = (LinearLayout) findViewById(R.id.secM32);
            lineM32 = (View) findViewById(R.id.lineM32);
            VlblM32 = (TextView) findViewById(R.id.VlblM32);
            rdogrpM32 = (RadioGroup) findViewById(R.id.rdogrpM32);

            rdoM321 = (RadioButton) findViewById(R.id.rdoM321);
            rdoM322 = (RadioButton) findViewById(R.id.rdoM322);
            rdoM323 = (RadioButton) findViewById(R.id.rdoM323);
            secM33 = (LinearLayout) findViewById(R.id.secM33);
            lineM33 = (View) findViewById(R.id.lineM33);
            VlblM33 = (TextView) findViewById(R.id.VlblM33);
            spnM33 = (Spinner) findViewById(R.id.spnM33);
            List<String> listM33 = new ArrayList<String>();

            listM33.add("");
            listM33.add("1-সপ্তাহে একবার ");
            listM33.add("2-মাসে দুইবার");
            listM33.add("3-মাসে একবার");
            listM33.add("4-কয়েকমাসে একবার ");
            listM33.add("5-আসে না");
            ArrayAdapter<String> adptrM33 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM33);
            spnM33.setAdapter(adptrM33);

            secM34 = (LinearLayout) findViewById(R.id.secM34);
            lineM34 = (View) findViewById(R.id.lineM34);
            VlblM34 = (TextView) findViewById(R.id.VlblM34);
            rdogrpM34 = (RadioGroup) findViewById(R.id.rdogrpM34);

            rdoM341 = (RadioButton) findViewById(R.id.rdoM341);
            rdoM342 = (RadioButton) findViewById(R.id.rdoM342);
            secM35 = (LinearLayout) findViewById(R.id.secM35);
            lineM35 = (View) findViewById(R.id.lineM35);
            VlblM35 = (TextView) findViewById(R.id.VlblM35);
            rdogrpM35 = (RadioGroup) findViewById(R.id.rdogrpM35);

            rdoM351 = (RadioButton) findViewById(R.id.rdoM351);
            rdoM352 = (RadioButton) findViewById(R.id.rdoM352);
            rdogrpM35.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpM35 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpM35.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpM35.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpM35[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secM36.setVisibility(View.GONE);
                        lineM36.setVisibility(View.GONE);
                        spnM36.setSelection(0);
                    } else {
                        secM36.setVisibility(View.VISIBLE);
                        lineM36.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secM36 = (LinearLayout) findViewById(R.id.secM36);
            lineM36 = (View) findViewById(R.id.lineM36);
            VlblM36 = (TextView) findViewById(R.id.VlblM36);
            spnM36 = (Spinner) findViewById(R.id.spnM36);
            List<String> listM36 = new ArrayList<String>();

            listM36.add("");
            listM36.add("1-জানিনা");
            listM36.add("2-সপ্তাহে অন্তত একবার ");
            listM36.add("3-মাসে অন্তত দুইবার 	");
            listM36.add("4-মাসে অন্তত একবার");
            listM36.add("5-কয়েক মাসে অন্তত একবার");
            ArrayAdapter<String> adptrM36 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM36);
            spnM36.setAdapter(adptrM36);

            secM37 = (LinearLayout) findViewById(R.id.secM37);
            lineM37 = (View) findViewById(R.id.lineM37);
            VlblM37 = (TextView) findViewById(R.id.VlblM37);
            rdogrpM37 = (RadioGroup) findViewById(R.id.rdogrpM37);

            rdoM371 = (RadioButton) findViewById(R.id.rdoM371);
            rdoM372 = (RadioButton) findViewById(R.id.rdoM372);
            rdogrpM37.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpM37 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpM37.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpM37.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpM37[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secM38.setVisibility(View.GONE);
                        lineM38.setVisibility(View.GONE);
                        spnM38.setSelection(0);
                        secM38X1.setVisibility(View.GONE);
                        txtM38X1.setText("");

                    } else {
                        secM38.setVisibility(View.VISIBLE);
                        lineM38.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secM38 = (LinearLayout) findViewById(R.id.secM38);
            lineM38 = (View) findViewById(R.id.lineM38);
            VlblM38 = (TextView) findViewById(R.id.VlblM38);
            spnM38 = (Spinner) findViewById(R.id.spnM38);
            List<String> listM38 = new ArrayList<String>();

            listM38.add("");
            listM38.add("1-কনডম");
            listM38.add("2-জন্মনিয়ন্ত্রন বড়ি");
            listM38.add("3-ইমপ্ল্যান্ট");
            listM38.add("4- কপার T");
            listM38.add("5-ইঞ্জেকশন ভিত্তিক গর্ভনিরোধক");
            listM38.add("6-ভ্যাসেকটমি ");
            listM38.add("7-টিউবেকটমি");
            listM38.add("8-সনাতন (আজল, নিরাপদ কাল)");
            listM38.add("9-অন্যান্য (নির্দিষ্ট করুন) ");
            ArrayAdapter<String> adptrM38 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM38);
            spnM38.setAdapter(adptrM38);

            spnM38.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnM38.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnM38.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("9")) {
                        secM38X1.setVisibility(View.VISIBLE);
                    } else {
                        secM38X1.setVisibility(View.GONE);
                        txtM38X1.setText("");
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secM38X1 = (LinearLayout) findViewById(R.id.secM38X1);
            lineM38X1 = (View) findViewById(R.id.lineM38X1);
            VlblM38X1 = (TextView) findViewById(R.id.VlblM38X1);
            txtM38X1 = (EditText) findViewById(R.id.txtM38X1);


            //Hide all skip variables
            secM31x1.setVisibility(View.GONE);
            secM32.setVisibility(View.GONE);
            secM36.setVisibility(View.GONE);
            secM38.setVisibility(View.GONE);
            secM38X1.setVisibility(View.GONE);

            DataSearch(RND, SUCHANAID);
            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(NutHealth.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(NutHealth.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(NutHealth.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(NutHealth.this, "Required field: উপকারভোগী/সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (txtM31x1.getText().toString().length() == 0 & secM31x1.isShown()) {
                Connection.MessageBox(NutHealth.this, "Required field: অন্যান্য (নির্দিষ্ট করুন).");
                txtM31x1.requestFocus();
                return;
            } else if (!rdoM321.isChecked() & !rdoM322.isChecked() & !rdoM323.isChecked() & secM32.isShown()) {
                Connection.MessageBox(NutHealth.this, "Select anyone options from (আপনি কি আপনার এলাকার EPI সেশন এর উঠান বৈঠক গুলোতে অংশগ্রহন করেন?).");
                rdoM321.requestFocus();
                return;
            } else if (spnM33.getSelectedItemPosition() == 0 & secM33.isShown()) {
                Connection.MessageBox(NutHealth.this, "Required field: সরকারী স্বাস্থ্যকর্মী কত ঘনঘন আপনাকে দেখতে আসে.");
                spnM33.requestFocus();
                return;
            } else if (!rdoM341.isChecked() & !rdoM342.isChecked() & secM34.isShown()) {
                Connection.MessageBox(NutHealth.this, "Select anyone options from (NGO র স্বাস্থ্যকর্মী কি আপনাকে দেখতে আসে? যেমন, BRAC স্বাস্থ্যসেবিকা?).");
                rdoM341.requestFocus();
                return;
            } else if (!rdoM351.isChecked() & !rdoM352.isChecked() & secM35.isShown()) {
                Connection.MessageBox(NutHealth.this, "Select anyone options from (আপনি কি কখনো কমিউনিটি ক্লিনিক হতে স্বাস্থ্য অথবা পরিবার পরিকল্পনা সেবা পেয়েছেন).");
                rdoM351.requestFocus();
                return;
            } else if (spnM36.getSelectedItemPosition() == 0 & secM36.isShown()) {
                Connection.MessageBox(NutHealth.this, "Required field: কমিউনিটি ক্লিনিকে আপনি কত ঘনঘন যান?.");
                spnM36.requestFocus();
                return;
            } else if (!rdoM371.isChecked() & !rdoM372.isChecked() & secM37.isShown()) {
                Connection.MessageBox(NutHealth.this, "Select anyone options from (আপনি/আপনার স্বামী কি বর্তমানে কোন জন্মবিরতিকরণ পদ্ধতি ব্যবহার করছেন?).");
                rdoM371.requestFocus();
                return;
            } else if (spnM38.getSelectedItemPosition() == 0 & secM38.isShown()) {
                Connection.MessageBox(NutHealth.this, "Required field: আপনি/আপনারা কোন পদ্ধতি ব্যবহার করছেন ?.");
                spnM38.requestFocus();
                return;
            } else if (txtM38X1.getText().toString().length() == 0 & secM38X1.isShown()) {
                Connection.MessageBox(NutHealth.this, "Required field: অন্যান্য (নির্দিষ্ট করুন).");
                txtM38X1.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            NutHealth_DataModel objSave = new NutHealth_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setM31a((chkM31a.isChecked() ? "1" : "2"));
            objSave.setM31b((chkM31b.isChecked() ? "1" : "2"));
            objSave.setM31c((chkM31c.isChecked() ? "1" : "2"));
            objSave.setM31d((chkM31d.isChecked() ? "1" : "2"));
            objSave.setM31e((chkM31e.isChecked() ? "1" : "2"));
            objSave.setM31f((chkM31f.isChecked() ? "1" : "2"));
            objSave.setM31g((chkM31g.isChecked() ? "1" : "2"));
            objSave.setM31h((chkM31h.isChecked() ? "1" : "2"));
            objSave.setM31i((chkM31i.isChecked() ? "1" : "2"));
            objSave.setM31x((chkM31x.isChecked() ? "1" : "2"));
            objSave.setM31x1(txtM31x1.getText().toString());
            String[] d_rdogrpM32 = new String[]{"1", "0", "3"};
            objSave.setM32("");
            for (int i = 0; i < rdogrpM32.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM32.getChildAt(i);
                if (rb.isChecked()) objSave.setM32(d_rdogrpM32[i]);
            }

            objSave.setM33((spnM33.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM33.getSelectedItem().toString(), "-")));
            String[] d_rdogrpM34 = new String[]{"1", "0"};
            objSave.setM34("");
            for (int i = 0; i < rdogrpM34.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM34.getChildAt(i);
                if (rb.isChecked()) objSave.setM34(d_rdogrpM34[i]);
            }

            String[] d_rdogrpM35 = new String[]{"1", "0"};
            objSave.setM35("");
            for (int i = 0; i < rdogrpM35.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM35.getChildAt(i);
                if (rb.isChecked()) objSave.setM35(d_rdogrpM35[i]);
            }

            objSave.setM36((spnM36.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM36.getSelectedItem().toString(), "-")));
            String[] d_rdogrpM37 = new String[]{"1", "0"};
            objSave.setM37("");
            for (int i = 0; i < rdogrpM37.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM37.getChildAt(i);
                if (rb.isChecked()) objSave.setM37(d_rdogrpM37[i]);
            }

            objSave.setM38((spnM38.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM38.getSelectedItem().toString(), "-")));
            objSave.setM38X1(txtM38X1.getText().toString());
            objSave.setEnDt(Global.DateTimeNowYMDHMS());
            objSave.setStartTime(StartTime);
            objSave.setEndTime(g.CurrentTime24());
            objSave.setUserId(g.getUserId());
            objSave.setEntryUser(g.getUserId()); //from data entry user list
            //objSave.setLat(Double.toString(currentLatitude));
            //objSave.setLon(Double.toString(currentLongitude));

            String status = objSave.SaveUpdateData(this);
            if (status.length() == 0) {
                EntryStatus_DataModel e = new EntryStatus_DataModel(TableName, RND, SUCHANAID);
                e.SaveUpdateData(this);
                Bundle IDBundle = new Bundle();
                finish();
                IDBundle.putString("Rnd", txtRnd.getText().toString());
                IDBundle.putString("SuchanaID", txtSuchanaID.getText().toString());
                startActivity(new Intent(NutHealth.this, WomenEmp.class).putExtras(IDBundle));

            } else {
                Connection.MessageBox(NutHealth.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(NutHealth.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            NutHealth_DataModel d = new NutHealth_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<NutHealth_DataModel> data = d.SelectAll(this, SQL);
            for (NutHealth_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                if (item.getM31a().equals("1")) {
                    chkM31a.setChecked(true);
                } else if (item.getM31a().equals("2")) {
                    chkM31a.setChecked(false);
                }
                if (item.getM31b().equals("1")) {
                    chkM31b.setChecked(true);
                } else if (item.getM31b().equals("2")) {
                    chkM31b.setChecked(false);
                }
                if (item.getM31c().equals("1")) {
                    chkM31c.setChecked(true);
                } else if (item.getM31c().equals("2")) {
                    chkM31c.setChecked(false);
                }
                if (item.getM31d().equals("1")) {
                    chkM31d.setChecked(true);
                } else if (item.getM31d().equals("2")) {
                    chkM31d.setChecked(false);
                }
                if (item.getM31e().equals("1")) {
                    chkM31e.setChecked(true);
                } else if (item.getM31e().equals("2")) {
                    chkM31e.setChecked(false);
                }
                if (item.getM31f().equals("1")) {
                    chkM31f.setChecked(true);
                } else if (item.getM31f().equals("2")) {
                    chkM31f.setChecked(false);
                }
                if (item.getM31g().equals("1")) {
                    chkM31g.setChecked(true);
                } else if (item.getM31g().equals("2")) {
                    chkM31g.setChecked(false);
                }
                if (item.getM31h().equals("1")) {
                    chkM31h.setChecked(true);
                } else if (item.getM31h().equals("2")) {
                    chkM31h.setChecked(false);
                }
                if (item.getM31i().equals("1")) {
                    chkM31i.setChecked(true);
                } else if (item.getM31i().equals("2")) {
                    chkM31i.setChecked(false);
                }
                if (item.getM31x().equals("1")) {
                    chkM31x.setChecked(true);
                } else if (item.getM31x().equals("2")) {
                    chkM31x.setChecked(false);
                }
                txtM31x1.setText(item.getM31x1());
                String[] d_rdogrpM32 = new String[]{"1", "0", "3"};
                for (int i = 0; i < d_rdogrpM32.length; i++) {
                    if (item.getM32().equals(String.valueOf(d_rdogrpM32[i]))) {
                        rb = (RadioButton) rdogrpM32.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnM33.setSelection(Global.SpinnerItemPositionAnyLength(spnM33, item.getM33()));
                String[] d_rdogrpM34 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM34.length; i++) {
                    if (item.getM34().equals(String.valueOf(d_rdogrpM34[i]))) {
                        rb = (RadioButton) rdogrpM34.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM35 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM35.length; i++) {
                    if (item.getM35().equals(String.valueOf(d_rdogrpM35[i]))) {
                        rb = (RadioButton) rdogrpM35.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnM36.setSelection(Global.SpinnerItemPositionAnyLength(spnM36, item.getM36()));
                String[] d_rdogrpM37 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM37.length; i++) {
                    if (item.getM37().equals(String.valueOf(d_rdogrpM37[i]))) {
                        rb = (RadioButton) rdogrpM37.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnM38.setSelection(Global.SpinnerItemPositionAnyLength(spnM38, item.getM38()));
                txtM38X1.setText(item.getM38X1());
            }
        } catch (Exception e) {
            Connection.MessageBox(NutHealth.this, e.getMessage());
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