package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".QC" android:label="QC" />

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import android.Manifest;
import android.app.*;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.view.KeyEvent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.MotionEvent;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;

import Common.*;


public class QC extends Activity {
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
    LinearLayout seclbl1;
    View linelbl1;
    LinearLayout secRnd;
    View lineRnd;
    TextView VlblRnd;
    EditText txtRnd;
    LinearLayout secSuchanaID;
    View lineSuchanaID;
    TextView VlblSuchanaID;
    EditText txtSuchanaID;
    LinearLayout seclbl2;
    View linelbl2;
    LinearLayout secH311;
    View lineH311;
    TextView VlblH311;
    Spinner spnH311;
    LinearLayout secH312;
    View lineH312;
    TextView VlblH312;
    EditText txtH312;
    LinearLayout secH313;
    View lineH313;
    TextView VlblH313;
    EditText txtH313;
    LinearLayout secH61;
    View lineH61;
    TextView VlblH61;
    RadioGroup rdogrpH61;
    RadioButton rdoH611;
    RadioButton rdoH612;
    RadioButton rdoH613;
    LinearLayout secH14c1;
    View lineH14c1;
    TextView VlblH14c1;
    RadioGroup rdogrpH14c1;
    RadioButton rdoH14c11;
    RadioButton rdoH14c12;
    LinearLayout seclb14b;
    View linelb14b;
    LinearLayout secH14b1;
    View lineH14b1;
    TextView VlblH14b1;
    RadioGroup rdogrpH14b1;
    RadioButton rdoH14b11;
    RadioButton rdoH14b12;
    LinearLayout secH14b2;
    View lineH14b2;
    TextView VlblH14b2;
    RadioGroup rdogrpH14b2;
    RadioButton rdoH14b21;
    RadioButton rdoH14b22;
    LinearLayout secH14b3;
    View lineH14b3;
    TextView VlblH14b3;
    RadioGroup rdogrpH14b3;
    RadioButton rdoH14b31;
    RadioButton rdoH14b32;
    LinearLayout secH14b4;
    View lineH14b4;
    TextView VlblH14b4;
    RadioGroup rdogrpH14b4;
    RadioButton rdoH14b41;
    RadioButton rdoH14b42;
    LinearLayout secH14b5;
    View lineH14b5;
    TextView VlblH14b5;
    RadioGroup rdogrpH14b5;
    RadioButton rdoH14b51;
    RadioButton rdoH14b52;
    LinearLayout secH14b6;
    View lineH14b6;
    TextView VlblH14b6;
    RadioGroup rdogrpH14b6;
    RadioButton rdoH14b61;
    RadioButton rdoH14b62;
    LinearLayout secH14b7;
    View lineH14b7;
    TextView VlblH14b7;
    RadioGroup rdogrpH14b7;
    RadioButton rdoH14b71;
    RadioButton rdoH14b72;
    LinearLayout secH14b8;
    View lineH14b8;
    TextView VlblH14b8;
    RadioGroup rdogrpH14b8;
    RadioButton rdoH14b81;
    RadioButton rdoH14b82;
    LinearLayout secH14b9;
    View lineH14b9;
    TextView VlblH14b9;
    RadioGroup rdogrpH14b9;
    RadioButton rdoH14b91;
    RadioButton rdoH14b92;
    LinearLayout secH14b9X;
    View lineH14b9X;
    TextView VlblH14b9X;
    EditText txtH14b9X;
    LinearLayout seclblM11;
    View linelblM11;
    LinearLayout secM11;
    View lineM11;
    TextView VlblM11;
    EditText txtM11;
    LinearLayout secM12;
    View lineM12;
    TextView VlblM12;
    EditText txtM12;
    LinearLayout secM13;
    View lineM13;
    TextView VlblM13;
    EditText txtM13;
    LinearLayout secM19;
    View lineM19;
    TextView VlblM19;
    RadioGroup rdogrpM19;
    RadioButton rdoM191;
    RadioButton rdoM192;
    LinearLayout secM115;
    View lineM115;
    TextView VlblM115;
    RadioGroup rdogrpM115;
    RadioButton rdoM1151;
    RadioButton rdoM1152;
    RadioButton rdoM1153;
    LinearLayout secM116;
    View lineM116;
    TextView VlblM116;
    EditText txtM116;
    LinearLayout secM120;
    View lineM120;
    TextView VlblM120;
    RadioGroup rdogrpM120;
    RadioButton rdoM1201;
    RadioButton rdoM1202;
    RadioButton rdoM1203;
    LinearLayout secM121;
    View lineM121;
    TextView VlblM121;
    RadioGroup rdogrpM121;
    RadioButton rdoM1211;
    RadioButton rdoM1212;
    RadioButton rdoM1213;
    LinearLayout seclblC14;
    View linelblC14;
    LinearLayout secC14;
    View lineC14;
    TextView VlblC14;
    RadioGroup rdogrpC14;
    RadioButton rdoC141;
    RadioButton rdoC142;
    LinearLayout secC15;
    View lineC15;
    TextView VlblC15;
    EditText dtpC15;
    LinearLayout secC16;
    View lineC16;
    TextView VlblC16;
    EditText txtC16;
    LinearLayout secC110;
    View lineC110;
    TextView VlblC110;
    RadioGroup rdogrpC110;
    RadioButton rdoC1101;
    RadioButton rdoC1102;
    LinearLayout secC115;
    View lineC115;
    TextView VlblC115;
    RadioGroup rdogrpC115;
    RadioButton rdoC1151;
    RadioButton rdoC1152;
    LinearLayout secC140;
    View lineC140;
    TextView VlblC140;
    RadioGroup rdogrpC140;
    RadioButton rdoC1401;
    RadioButton rdoC1402;
    RadioButton rdoC1403;
    LinearLayout secC142;
    View lineC142;
    LinearLayout secC142a;
    View lineC142a;
    TextView VlblC142a;
    CheckBox chkC142a;
    LinearLayout secC142b;
    View lineC142b;
    TextView VlblC142b;
    CheckBox chkC142b;
    LinearLayout secC142c;
    View lineC142c;
    TextView VlblC142c;
    CheckBox chkC142c;
    LinearLayout secC142d;
    View lineC142d;
    TextView VlblC142d;
    CheckBox chkC142d;
    LinearLayout secC142e;
    View lineC142e;
    TextView VlblC142e;
    CheckBox chkC142e;
    LinearLayout secC142f;
    View lineC142f;
    TextView VlblC142f;
    CheckBox chkC142f;
    LinearLayout secC142g;
    View lineC142g;
    TextView VlblC142g;
    CheckBox chkC142g;
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


            dtpDate = (EditText) findViewById(R.id.dtpC15);
            if (VariableID.equals("btnC15")) {
                dtpDate = (EditText) findViewById(R.id.dtpC15);
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
            setContentView(R.layout.qc);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TableName = "QC";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(QC.this);
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


            seclbl1 = (LinearLayout) findViewById(R.id.seclbl1);
            linelbl1 = (View) findViewById(R.id.linelbl1);
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

            seclbl2 = (LinearLayout) findViewById(R.id.seclbl2);
            linelbl2 = (View) findViewById(R.id.linelbl2);
            secH311 = (LinearLayout) findViewById(R.id.secH311);
            lineH311 = (View) findViewById(R.id.lineH311);
            VlblH311 = (TextView) findViewById(R.id.VlblH311);
            spnH311 = (Spinner) findViewById(R.id.spnH311);
            List<String> listH311 = new ArrayList<String>();

            listH311.add("");
            listH311.add("1-নিজস্ব");
            listH311.add("2-ভাড়াটে");
            listH311.add("3-অন্যের অনুগ্রহে প্রাপ্ত জায়গা/খাস জমি");
            listH311.add("4-অবৈধভাবে বাস");
            ArrayAdapter<String> adptrH311 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH311);
            spnH311.setAdapter(adptrH311);

            secH312 = (LinearLayout) findViewById(R.id.secH312);
            lineH312 = (View) findViewById(R.id.lineH312);
            VlblH312 = (TextView) findViewById(R.id.VlblH312);
            txtH312 = (EditText) findViewById(R.id.txtH312);
            secH313 = (LinearLayout) findViewById(R.id.secH313);
            lineH313 = (View) findViewById(R.id.lineH313);
            VlblH313 = (TextView) findViewById(R.id.VlblH313);
            txtH313 = (EditText) findViewById(R.id.txtH313);
            secH61 = (LinearLayout) findViewById(R.id.secH61);
            lineH61 = (View) findViewById(R.id.lineH61);
            VlblH61 = (TextView) findViewById(R.id.VlblH61);
            rdogrpH61 = (RadioGroup) findViewById(R.id.rdogrpH61);

            rdoH611 = (RadioButton) findViewById(R.id.rdoH611);
            rdoH612 = (RadioButton) findViewById(R.id.rdoH612);
            rdoH613 = (RadioButton) findViewById(R.id.rdoH613);
            secH14c1 = (LinearLayout) findViewById(R.id.secH14c1);
            lineH14c1 = (View) findViewById(R.id.lineH14c1);
            VlblH14c1 = (TextView) findViewById(R.id.VlblH14c1);
            rdogrpH14c1 = (RadioGroup) findViewById(R.id.rdogrpH14c1);

            rdoH14c11 = (RadioButton) findViewById(R.id.rdoH14c11);
            rdoH14c12 = (RadioButton) findViewById(R.id.rdoH14c12);
            seclb14b = (LinearLayout) findViewById(R.id.seclb14b);
            linelb14b = (View) findViewById(R.id.linelb14b);
            secH14b1 = (LinearLayout) findViewById(R.id.secH14b1);
            lineH14b1 = (View) findViewById(R.id.lineH14b1);
            VlblH14b1 = (TextView) findViewById(R.id.VlblH14b1);
            rdogrpH14b1 = (RadioGroup) findViewById(R.id.rdogrpH14b1);

            rdoH14b11 = (RadioButton) findViewById(R.id.rdoH14b11);
            rdoH14b12 = (RadioButton) findViewById(R.id.rdoH14b12);
            secH14b2 = (LinearLayout) findViewById(R.id.secH14b2);
            lineH14b2 = (View) findViewById(R.id.lineH14b2);
            VlblH14b2 = (TextView) findViewById(R.id.VlblH14b2);
            rdogrpH14b2 = (RadioGroup) findViewById(R.id.rdogrpH14b2);

            rdoH14b21 = (RadioButton) findViewById(R.id.rdoH14b21);
            rdoH14b22 = (RadioButton) findViewById(R.id.rdoH14b22);
            secH14b3 = (LinearLayout) findViewById(R.id.secH14b3);
            lineH14b3 = (View) findViewById(R.id.lineH14b3);
            VlblH14b3 = (TextView) findViewById(R.id.VlblH14b3);
            rdogrpH14b3 = (RadioGroup) findViewById(R.id.rdogrpH14b3);

            rdoH14b31 = (RadioButton) findViewById(R.id.rdoH14b31);
            rdoH14b32 = (RadioButton) findViewById(R.id.rdoH14b32);
            secH14b4 = (LinearLayout) findViewById(R.id.secH14b4);
            lineH14b4 = (View) findViewById(R.id.lineH14b4);
            VlblH14b4 = (TextView) findViewById(R.id.VlblH14b4);
            rdogrpH14b4 = (RadioGroup) findViewById(R.id.rdogrpH14b4);

            rdoH14b41 = (RadioButton) findViewById(R.id.rdoH14b41);
            rdoH14b42 = (RadioButton) findViewById(R.id.rdoH14b42);
            secH14b5 = (LinearLayout) findViewById(R.id.secH14b5);
            lineH14b5 = (View) findViewById(R.id.lineH14b5);
            VlblH14b5 = (TextView) findViewById(R.id.VlblH14b5);
            rdogrpH14b5 = (RadioGroup) findViewById(R.id.rdogrpH14b5);

            rdoH14b51 = (RadioButton) findViewById(R.id.rdoH14b51);
            rdoH14b52 = (RadioButton) findViewById(R.id.rdoH14b52);
            secH14b6 = (LinearLayout) findViewById(R.id.secH14b6);
            lineH14b6 = (View) findViewById(R.id.lineH14b6);
            VlblH14b6 = (TextView) findViewById(R.id.VlblH14b6);
            rdogrpH14b6 = (RadioGroup) findViewById(R.id.rdogrpH14b6);

            rdoH14b61 = (RadioButton) findViewById(R.id.rdoH14b61);
            rdoH14b62 = (RadioButton) findViewById(R.id.rdoH14b62);
            secH14b7 = (LinearLayout) findViewById(R.id.secH14b7);
            lineH14b7 = (View) findViewById(R.id.lineH14b7);
            VlblH14b7 = (TextView) findViewById(R.id.VlblH14b7);
            rdogrpH14b7 = (RadioGroup) findViewById(R.id.rdogrpH14b7);

            rdoH14b71 = (RadioButton) findViewById(R.id.rdoH14b71);
            rdoH14b72 = (RadioButton) findViewById(R.id.rdoH14b72);
            secH14b8 = (LinearLayout) findViewById(R.id.secH14b8);
            lineH14b8 = (View) findViewById(R.id.lineH14b8);
            VlblH14b8 = (TextView) findViewById(R.id.VlblH14b8);
            rdogrpH14b8 = (RadioGroup) findViewById(R.id.rdogrpH14b8);

            rdoH14b81 = (RadioButton) findViewById(R.id.rdoH14b81);
            rdoH14b82 = (RadioButton) findViewById(R.id.rdoH14b82);
            secH14b9 = (LinearLayout) findViewById(R.id.secH14b9);
            lineH14b9 = (View) findViewById(R.id.lineH14b9);
            VlblH14b9 = (TextView) findViewById(R.id.VlblH14b9);
            rdogrpH14b9 = (RadioGroup) findViewById(R.id.rdogrpH14b9);

            rdoH14b91 = (RadioButton) findViewById(R.id.rdoH14b91);
            rdoH14b92 = (RadioButton) findViewById(R.id.rdoH14b92);
            rdogrpH14b9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH14b9 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH14b9.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH14b9.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH14b9[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH14b9X.setVisibility(View.GONE);
                        lineH14b9X.setVisibility(View.GONE);
                        txtH14b9X.setText("");
                        seclblM11.setVisibility(View.GONE);
                        linelblM11.setVisibility(View.GONE);
                    } else {
                        secH14b9X.setVisibility(View.VISIBLE);
                        lineH14b9X.setVisibility(View.VISIBLE);
                        seclblM11.setVisibility(View.VISIBLE);
                        linelblM11.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH14b9X = (LinearLayout) findViewById(R.id.secH14b9X);
            lineH14b9X = (View) findViewById(R.id.lineH14b9X);
            VlblH14b9X = (TextView) findViewById(R.id.VlblH14b9X);
            txtH14b9X = (EditText) findViewById(R.id.txtH14b9X);
            seclblM11 = (LinearLayout) findViewById(R.id.seclblM11);
            linelblM11 = (View) findViewById(R.id.linelblM11);
            secM11 = (LinearLayout) findViewById(R.id.secM11);
            lineM11 = (View) findViewById(R.id.lineM11);
            VlblM11 = (TextView) findViewById(R.id.VlblM11);
            txtM11 = (EditText) findViewById(R.id.txtM11);
            secM12 = (LinearLayout) findViewById(R.id.secM12);
            lineM12 = (View) findViewById(R.id.lineM12);
            VlblM12 = (TextView) findViewById(R.id.VlblM12);
            txtM12 = (EditText) findViewById(R.id.txtM12);
            secM13 = (LinearLayout) findViewById(R.id.secM13);
            lineM13 = (View) findViewById(R.id.lineM13);
            VlblM13 = (TextView) findViewById(R.id.VlblM13);
            txtM13 = (EditText) findViewById(R.id.txtM13);
            secM19 = (LinearLayout) findViewById(R.id.secM19);
            lineM19 = (View) findViewById(R.id.lineM19);
            VlblM19 = (TextView) findViewById(R.id.VlblM19);
            rdogrpM19 = (RadioGroup) findViewById(R.id.rdogrpM19);

            rdoM191 = (RadioButton) findViewById(R.id.rdoM191);
            rdoM192 = (RadioButton) findViewById(R.id.rdoM192);
            secM115 = (LinearLayout) findViewById(R.id.secM115);
            lineM115 = (View) findViewById(R.id.lineM115);
            VlblM115 = (TextView) findViewById(R.id.VlblM115);
            rdogrpM115 = (RadioGroup) findViewById(R.id.rdogrpM115);

            rdoM1151 = (RadioButton) findViewById(R.id.rdoM1151);
            rdoM1152 = (RadioButton) findViewById(R.id.rdoM1152);
            rdoM1153 = (RadioButton) findViewById(R.id.rdoM1153);
            secM116 = (LinearLayout) findViewById(R.id.secM116);
            lineM116 = (View) findViewById(R.id.lineM116);
            VlblM116 = (TextView) findViewById(R.id.VlblM116);
            txtM116 = (EditText) findViewById(R.id.txtM116);
            secM120 = (LinearLayout) findViewById(R.id.secM120);
            lineM120 = (View) findViewById(R.id.lineM120);
            VlblM120 = (TextView) findViewById(R.id.VlblM120);
            rdogrpM120 = (RadioGroup) findViewById(R.id.rdogrpM120);

            rdoM1201 = (RadioButton) findViewById(R.id.rdoM1201);
            rdoM1202 = (RadioButton) findViewById(R.id.rdoM1202);
            rdoM1203 = (RadioButton) findViewById(R.id.rdoM1203);
            secM121 = (LinearLayout) findViewById(R.id.secM121);
            lineM121 = (View) findViewById(R.id.lineM121);
            VlblM121 = (TextView) findViewById(R.id.VlblM121);
            rdogrpM121 = (RadioGroup) findViewById(R.id.rdogrpM121);

            rdoM1211 = (RadioButton) findViewById(R.id.rdoM1211);
            rdoM1212 = (RadioButton) findViewById(R.id.rdoM1212);
            rdoM1213 = (RadioButton) findViewById(R.id.rdoM1213);
            seclblC14 = (LinearLayout) findViewById(R.id.seclblC14);
            linelblC14 = (View) findViewById(R.id.linelblC14);
            secC14 = (LinearLayout) findViewById(R.id.secC14);
            lineC14 = (View) findViewById(R.id.lineC14);
            VlblC14 = (TextView) findViewById(R.id.VlblC14);
            rdogrpC14 = (RadioGroup) findViewById(R.id.rdogrpC14);

            rdoC141 = (RadioButton) findViewById(R.id.rdoC141);
            rdoC142 = (RadioButton) findViewById(R.id.rdoC142);
            secC15 = (LinearLayout) findViewById(R.id.secC15);
            lineC15 = (View) findViewById(R.id.lineC15);
            VlblC15 = (TextView) findViewById(R.id.VlblC15);
            dtpC15 = (EditText) findViewById(R.id.dtpC15);
            secC16 = (LinearLayout) findViewById(R.id.secC16);
            lineC16 = (View) findViewById(R.id.lineC16);
            VlblC16 = (TextView) findViewById(R.id.VlblC16);
            txtC16 = (EditText) findViewById(R.id.txtC16);
            secC110 = (LinearLayout) findViewById(R.id.secC110);
            lineC110 = (View) findViewById(R.id.lineC110);
            VlblC110 = (TextView) findViewById(R.id.VlblC110);
            rdogrpC110 = (RadioGroup) findViewById(R.id.rdogrpC110);

            rdoC1101 = (RadioButton) findViewById(R.id.rdoC1101);
            rdoC1102 = (RadioButton) findViewById(R.id.rdoC1102);
            secC115 = (LinearLayout) findViewById(R.id.secC115);
            lineC115 = (View) findViewById(R.id.lineC115);
            VlblC115 = (TextView) findViewById(R.id.VlblC115);
            rdogrpC115 = (RadioGroup) findViewById(R.id.rdogrpC115);

            rdoC1151 = (RadioButton) findViewById(R.id.rdoC1151);
            rdoC1152 = (RadioButton) findViewById(R.id.rdoC1152);
            secC140 = (LinearLayout) findViewById(R.id.secC140);
            lineC140 = (View) findViewById(R.id.lineC140);
            VlblC140 = (TextView) findViewById(R.id.VlblC140);
            rdogrpC140 = (RadioGroup) findViewById(R.id.rdogrpC140);

            rdoC1401 = (RadioButton) findViewById(R.id.rdoC1401);
            rdoC1402 = (RadioButton) findViewById(R.id.rdoC1402);
            rdoC1403 = (RadioButton) findViewById(R.id.rdoC1403);
            secC142 = (LinearLayout) findViewById(R.id.secC142);
            lineC142 = (View) findViewById(R.id.lineC142);
            secC142a = (LinearLayout) findViewById(R.id.secC142a);
            lineC142a = (View) findViewById(R.id.lineC142a);
            VlblC142a = (TextView) findViewById(R.id.VlblC142a);
            chkC142a = (CheckBox) findViewById(R.id.chkC142a);
            secC142b = (LinearLayout) findViewById(R.id.secC142b);
            lineC142b = (View) findViewById(R.id.lineC142b);
            VlblC142b = (TextView) findViewById(R.id.VlblC142b);
            chkC142b = (CheckBox) findViewById(R.id.chkC142b);
            secC142c = (LinearLayout) findViewById(R.id.secC142c);
            lineC142c = (View) findViewById(R.id.lineC142c);
            VlblC142c = (TextView) findViewById(R.id.VlblC142c);
            chkC142c = (CheckBox) findViewById(R.id.chkC142c);
            secC142d = (LinearLayout) findViewById(R.id.secC142d);
            lineC142d = (View) findViewById(R.id.lineC142d);
            VlblC142d = (TextView) findViewById(R.id.VlblC142d);
            chkC142d = (CheckBox) findViewById(R.id.chkC142d);
            secC142e = (LinearLayout) findViewById(R.id.secC142e);
            lineC142e = (View) findViewById(R.id.lineC142e);
            VlblC142e = (TextView) findViewById(R.id.VlblC142e);
            chkC142e = (CheckBox) findViewById(R.id.chkC142e);
            secC142f = (LinearLayout) findViewById(R.id.secC142f);
            lineC142f = (View) findViewById(R.id.lineC142f);
            VlblC142f = (TextView) findViewById(R.id.VlblC142f);
            chkC142f = (CheckBox) findViewById(R.id.chkC142f);
            secC142g = (LinearLayout) findViewById(R.id.secC142g);
            lineC142g = (View) findViewById(R.id.lineC142g);
            VlblC142g = (TextView) findViewById(R.id.VlblC142g);
            chkC142g = (CheckBox) findViewById(R.id.chkC142g);

            chkC142g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkC142a.setChecked(false);
                        chkC142b.setChecked(false);
                        chkC142c.setChecked(false);
                        chkC142d.setChecked(false);
                        chkC142e.setChecked(false);
                        chkC142f.setChecked(false);
                    }
                }
            });
            chkC142a.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkC142g.setChecked(false);
                    }
                }
            });
            chkC142b.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkC142g.setChecked(false);
                    }
                }
            });
            chkC142c.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkC142g.setChecked(false);
                    }
                }
            });
            chkC142d.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkC142g.setChecked(false);
                    }
                }
            });
            chkC142e.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkC142g.setChecked(false);
                    }
                }
            });
            chkC142f.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkC142g.setChecked(false);
                    }
                }
            });

            dtpC15.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    final int DRAWABLE_RIGHT = 2;
                    if (event.getAction() == MotionEvent.ACTION_UP) {
                        if (event.getRawX() >= (dtpC15.getRight() - dtpC15.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                            VariableID = "btnC15";
                            showDialog(DATE_DIALOG);
                            return true;
                        }
                    }
                    return false;
                }
            });


            //Hide all skip variables
            secH14b9X.setVisibility(View.GONE);
            lineH14b9X.setVisibility(View.GONE);
            seclblM11.setVisibility(View.GONE);
            linelblM11.setVisibility(View.GONE);

            DataSearch(RND, SUCHANAID);

            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(QC.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(QC.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(QC.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(QC.this, "Required field: উপকারভোগী/সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (spnH311.getSelectedItemPosition() == 0 & secH311.isShown()) {
                Connection.MessageBox(QC.this, "Required field: খানার মালিকানা.");
                spnH311.requestFocus();
                return;
            } else if (txtH312.getText().toString().length() == 0 & secH312.isShown()) {
                Connection.MessageBox(QC.this, "Required field:H312 এই খানায়ে কয়টি কক্ষ আছে.");
                txtH312.requestFocus();
                return;
            } else if (Integer.valueOf(txtH312.getText().toString().length() == 0 ? "00" : txtH312.getText().toString()) < 00 || Integer.valueOf(txtH312.getText().toString().length() == 0 ? "20" : txtH312.getText().toString()) > 20) {
                Connection.MessageBox(QC.this, "Value should be between 00 and 20(H312 এই খানায়ে কয়টি কক্ষ আছে).");
                txtH312.requestFocus();
                return;
            } else if (txtH313.getText().toString().length() == 0 & secH313.isShown()) {
                Connection.MessageBox(QC.this, "Required field:H313 ঘুমের জন্য কয়টি কক্ষ ব্যবহার করা হয়.");
                txtH313.requestFocus();
                return;
            } else if (Integer.valueOf(txtH313.getText().toString().length() == 0 ? "00" : txtH313.getText().toString()) < 00 || Integer.valueOf(txtH313.getText().toString().length() == 0 ? "10" : txtH313.getText().toString()) > 10) {
                Connection.MessageBox(QC.this, "Value should be between 00 and 10( H313 ঘুমের জন্য কয়টি কক্ষ ব্যবহার করা হয়).");
                txtH313.requestFocus();
                return;
            } else if ((Integer.parseInt(txtH313.getText().toString()) > Integer.parseInt(txtH312.getText().toString()))) {
                Connection.MessageBox(QC.this, "Error: H313 এর সংখ্যা  H312 এর চেয়ে বড় হবেনা");
                txtH313.requestFocus();
                return;
            } else if (!rdoH611.isChecked() & !rdoH612.isChecked() & !rdoH613.isChecked() & secH61.isShown()) {
                Connection.MessageBox(QC.this, "Select anyone options from H611(আপনাদের কি কোন শৌচাগার/পায়খানা আছে).");
                rdoH611.requestFocus();
                return;
            } else if (!rdoH14c11.isChecked() & !rdoH14c12.isChecked() & secH14c1.isShown()) {
                Connection.MessageBox(QC.this, "Select anyone options from H14c1(আপনি অথবা আপনার পরিবারের কোনো সদস্য সরকারের তরফ থেকে কোনো ভাতা /বৃত্তি / ক্ষুদ্র ঋণ পেয়েছেন).");
                rdoH14c11.requestFocus();
                return;
            } else if (!rdoH14b11.isChecked() & !rdoH14b12.isChecked() & secH14b1.isShown()) {
                Connection.MessageBox(QC.this, "Select anyone options from H14b(1) আগাম চাশাবাদ করা).");
                rdoH14b11.requestFocus();
                return;
            } else if (!rdoH14b21.isChecked() & !rdoH14b22.isChecked() & secH14b2.isShown()) {
                Connection.MessageBox(QC.this, "Select anyone options from H14b(2)  খাঁচায় মাছ চাষ).");
                rdoH14b21.requestFocus();
                return;
            } else if (!rdoH14b31.isChecked() & !rdoH14b32.isChecked() & secH14b3.isShown()) {
                Connection.MessageBox(QC.this, "Select anyone options from H14b(3) উচু জায়গায় বাগান করা).");
                rdoH14b31.requestFocus();
                return;
            } else if (!rdoH14b41.isChecked() & !rdoH14b42.isChecked() & secH14b4.isShown()) {
                Connection.MessageBox(QC.this, "Select anyone options from H14b(4) পানি সহিষ্ণু প্রজাতি আবাদ ).");
                rdoH14b41.requestFocus();
                return;
            } else if (!rdoH14b51.isChecked() & !rdoH14b52.isChecked() & secH14b5.isShown()) {
                Connection.MessageBox(QC.this, "Select anyone options from H14b(5) উলম্ব বাগান করা).");
                rdoH14b51.requestFocus();
                return;
            } else if (!rdoH14b61.isChecked() & !rdoH14b62.isChecked() & secH14b6.isShown()) {
                Connection.MessageBox(QC.this, "Select anyone options from H14b(6) বস্তায় চাষ করা).");
                rdoH14b61.requestFocus();
                return;
            } else if (!rdoH14b71.isChecked() & !rdoH14b72.isChecked() & secH14b7.isShown()) {
                Connection.MessageBox(QC.this, "Select anyone options from H14b(7) বিকল্প জীবিকানির্বাহ কার্যক্রম).");
                rdoH14b71.requestFocus();
                return;
            } else if (!rdoH14b81.isChecked() & !rdoH14b82.isChecked() & secH14b8.isShown()) {
                Connection.MessageBox(QC.this, "Select anyone options from H14b(8) বিলম্বিত চাষাবাদ করা).");
                rdoH14b81.requestFocus();
                return;
            } else if (!rdoH14b91.isChecked() & !rdoH14b92.isChecked() & secH14b9.isShown()) {
                Connection.MessageBox(QC.this, "Select anyone options from H14b(9) অনান্য).");
                rdoH14b91.requestFocus();
                return;
            } else if (txtH14b9X.getText().toString().length() == 0 & secH14b9X.isShown()) {
                Connection.MessageBox(QC.this, "Required field:H14b উল্লেখ করুন.");
                txtH14b9X.requestFocus();
                return;
            } else if (txtM11.getText().toString().length() == 0 & secM11.isShown()) {
                Connection.MessageBox(QC.this, "Required field:M11 প্রথমবার বিয়ের সময় আপনার বয়স কত ছিল?.");
                txtM11.requestFocus();
                return;
            } else if (Integer.valueOf(txtM11.getText().toString().length() == 0 ? "10" : txtM11.getText().toString()) < 10 || Integer.valueOf(txtM11.getText().toString().length() == 0 ? "80" : txtM11.getText().toString()) > 80) {
                Connection.MessageBox(QC.this, "Value should be between 10 and 80(M11 প্রথমবার বিয়ের সময় আপনার বয়স কত ছিল?).");
                txtM11.requestFocus();
                return;
            } else if (txtM12.getText().toString().length() == 0 & secM12.isShown()) {
                Connection.MessageBox(QC.this, "Required field:M12 প্রথম গর্ভধারণের সময় আপনার বয়স কত ছিল?.");
                txtM12.requestFocus();
                return;
            } else if (Integer.valueOf(txtM12.getText().toString().length() == 0 ? "12" : txtM12.getText().toString()) < 12 || Integer.valueOf(txtM12.getText().toString().length() == 0 ? "60" : txtM12.getText().toString()) > 60) {
                Connection.MessageBox(QC.this, "Value should be between 12 and 60(M12 প্রথম গর্ভধারণের সময় আপনার বয়স কত ছিল?).");
                txtM12.requestFocus();
                return;
            } else if (txtM13.getText().toString().length() == 0 & secM13.isShown()) {
                Connection.MessageBox(QC.this, "Required field:M13 আপনি সর্বমোট কতবার গর্ভধারণ করেছেন?  (সর্বমোট গর্ভধারণের সংখ্যা, গর্ভপাত/MR এবং গর্ভধারণ সহ).");
                txtM13.requestFocus();
                return;
            } else if (Integer.valueOf(txtM13.getText().toString().length() == 0 ? "1" : txtM13.getText().toString()) < 1 || Integer.valueOf(txtM13.getText().toString().length() == 0 ? "30" : txtM13.getText().toString()) > 30) {
                Connection.MessageBox(QC.this, "Value should be between 1 and 30(M13 আপনি সর্বমোট কতবার গর্ভধারণ করেছেন?  (সর্বমোট গর্ভধারণের সংখ্যা, গর্ভপাত/MR এবং গর্ভধারণ সহ)).");
                txtM13.requestFocus();
                return;
            } else if (!rdoM191.isChecked() & !rdoM192.isChecked() & secM19.isShown()) {
                Connection.MessageBox(QC.this, "Select anyone options from (M19 আপনার ছোট শিশুটির ক্ষেত্রে গর্ভাবস্তার সময় আপনি কতবার স্বাস্থ্য পরীক্ষার জন্য গিয়েছিলেন ? (ANC)).");
                rdoM191.requestFocus();
                return;
            } else if (!rdoM1151.isChecked() & !rdoM1152.isChecked() & !rdoM1153.isChecked() & secM115.isShown()) {
                Connection.MessageBox(QC.this, "Select anyone options from (M115 সর্বশেষ শিশুর ক্ষেত্রে আপনি কি কোনো গর্ভ পরবর্তী সেবা (PNC) পেয়েছিলেন? ).");
                rdoM1151.requestFocus();
                return;
            } else if (txtM116.getText().toString().length() == 0 & secM116.isShown()) {
                Connection.MessageBox(QC.this, "Required field:M116 কতবার পেয়েছিলেন?.");
                txtM116.requestFocus();
                return;
            } else if (Integer.valueOf(txtM116.getText().toString().length() == 0 ? "1" : txtM116.getText().toString()) < 1 || Integer.valueOf(txtM116.getText().toString().length() == 0 ? "50" : txtM116.getText().toString()) > 50) {
                Connection.MessageBox(QC.this, "Value should be between 1 and 50(M116 কতবার পেয়েছিলেন?).");
                txtM116.requestFocus();
                return;
            } else if (!rdoM1201.isChecked() & !rdoM1202.isChecked() & !rdoM1203.isChecked() & secM120.isShown()) {
                Connection.MessageBox(QC.this, "Select anyone options from (M120 আপনি কি আপনার শেষ গর্ভাবস্থার সময় সাধারণ সময়ের তুলনায় বেশি, একই রকম অথবা কম খেয়েছেন?   ).");
                rdoM1201.requestFocus();
                return;
            } else if (!rdoM1211.isChecked() & !rdoM1212.isChecked() & !rdoM1213.isChecked() & secM121.isShown()) {
                Connection.MessageBox(QC.this, "Select anyone options from (M121 আপনি কি আপনার শেষ গর্ভাবস্থার সময় দিনের বেলায় সাধারণ সময়ের তুলনায় বেশি, একই রকম অথবা কম বিশ্রাম নিয়েছেন?   ).");
                rdoM1211.requestFocus();
                return;
            } else if (!rdoC141.isChecked() & !rdoC142.isChecked() & secC14.isShown()) {
                Connection.MessageBox(QC.this, "Select anyone options from (C14 শিশুর লিঙ্গ ).");
                rdoC141.requestFocus();
                return;
            }
            DV = Global.DateValidate(dtpC15.getText().toString());
            if (DV.length() != 0 & secC15.isShown()) {
                Connection.MessageBox(QC.this, DV);
                dtpC15.requestFocus();
                return;
            } else if (txtC16.getText().toString().length() == 0 & secC16.isShown()) {
                Connection.MessageBox(QC.this, "Required field:C16 শিশুর জন্মক্রম.");
                txtC16.requestFocus();
                return;
            } else if (Integer.valueOf(txtC16.getText().toString().length() == 0 ? "0" : txtC16.getText().toString()) < 0 || Integer.valueOf(txtC16.getText().toString().length() == 0 ? "20" : txtC16.getText().toString()) > 20) {
                Connection.MessageBox(QC.this, "Value should be between 0 and 20(C16 শিশুর জন্মক্রম).");
                txtC16.requestFocus();
                return;
            } else if (!rdoC1101.isChecked() & !rdoC1102.isChecked() & secC110.isShown()) {
                Connection.MessageBox(QC.this, "Select anyone options from (C110 আপনি কি এই শিশুকে শালদুধ দিয়েছিলেন? ).");
                rdoC1101.requestFocus();
                return;
            } else if (!rdoC1151.isChecked() & !rdoC1152.isChecked() & secC115.isShown()) {
                Connection.MessageBox(QC.this, "Select anyone options from (C115 শিশুটি কি এখনো বুকের দুধ খায়? ).");
                rdoC1151.requestFocus();
                return;
            } else if (!rdoC1401.isChecked() & !rdoC1402.isChecked() & !rdoC1403.isChecked() & secC140.isShown()) {
                Connection.MessageBox(QC.this, "Select anyone options from (C140 শিশুটি কি গত ছয় মাসে উচ্চমাত্রার ভিটামিন এ ক্যাপসুল পেয়েছিল/খেয়েছিল ).");
                rdoC1401.requestFocus();
                return;
            } else if (secC142a.isShown() & (!chkC142a.isChecked() &
                    !chkC142b.isChecked() &
                    !chkC142c.isChecked() &
                    !chkC142d.isChecked() &
                    !chkC142e.isChecked() &
                    !chkC142f.isChecked() &
                    !chkC142g.isChecked())) {
                Connection.MessageBox(QC.this, "Required field: C142 CheckList থেকে কমপক্ষে একটি অপশন সিলেক্ট করুন");
                chkC142a.requestFocus();
                return;
            } else if ((chkC142g.isChecked()) && (chkC142a.isChecked() || chkC142b.isChecked() || chkC142c.isChecked() || chkC142d.isChecked() || chkC142e.isChecked() || chkC142f.isChecked())) {
                Connection.MessageBox(QC.this, "Inconsistent value between C142 A-G");
                return;
            }
            String SQL = "";
            RadioButton rb;

            QC_DataModel objSave = new QC_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setH311((spnH311.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH311.getSelectedItem().toString(), "-")));
            objSave.setH312(txtH312.getText().toString());
            objSave.setH313(txtH313.getText().toString());
            String[] d_rdogrpH61 = new String[]{"1", "0", "3"};
            objSave.setH61("");
            for (int i = 0; i < rdogrpH61.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH61.getChildAt(i);
                if (rb.isChecked()) objSave.setH61(d_rdogrpH61[i]);
            }

            String[] d_rdogrpH14c1 = new String[]{"1", "0"};
            objSave.setH14c1("");
            for (int i = 0; i < rdogrpH14c1.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH14c1.getChildAt(i);
                if (rb.isChecked()) objSave.setH14c1(d_rdogrpH14c1[i]);
            }

            String[] d_rdogrpH14b1 = new String[]{"1", "0"};
            objSave.setH14b1("");
            for (int i = 0; i < rdogrpH14b1.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH14b1.getChildAt(i);
                if (rb.isChecked()) objSave.setH14b1(d_rdogrpH14b1[i]);
            }

            String[] d_rdogrpH14b2 = new String[]{"1", "0"};
            objSave.setH14b2("");
            for (int i = 0; i < rdogrpH14b2.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH14b2.getChildAt(i);
                if (rb.isChecked()) objSave.setH14b2(d_rdogrpH14b2[i]);
            }

            String[] d_rdogrpH14b3 = new String[]{"1", "0"};
            objSave.setH14b3("");
            for (int i = 0; i < rdogrpH14b3.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH14b3.getChildAt(i);
                if (rb.isChecked()) objSave.setH14b3(d_rdogrpH14b3[i]);
            }

            String[] d_rdogrpH14b4 = new String[]{"1", "0"};
            objSave.setH14b4("");
            for (int i = 0; i < rdogrpH14b4.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH14b4.getChildAt(i);
                if (rb.isChecked()) objSave.setH14b4(d_rdogrpH14b4[i]);
            }

            String[] d_rdogrpH14b5 = new String[]{"1", "0"};
            objSave.setH14b5("");
            for (int i = 0; i < rdogrpH14b5.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH14b5.getChildAt(i);
                if (rb.isChecked()) objSave.setH14b5(d_rdogrpH14b5[i]);
            }

            String[] d_rdogrpH14b6 = new String[]{"1", "0"};
            objSave.setH14b6("");
            for (int i = 0; i < rdogrpH14b6.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH14b6.getChildAt(i);
                if (rb.isChecked()) objSave.setH14b6(d_rdogrpH14b6[i]);
            }

            String[] d_rdogrpH14b7 = new String[]{"1", "0"};
            objSave.setH14b7("");
            for (int i = 0; i < rdogrpH14b7.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH14b7.getChildAt(i);
                if (rb.isChecked()) objSave.setH14b7(d_rdogrpH14b7[i]);
            }

            String[] d_rdogrpH14b8 = new String[]{"1", "0"};
            objSave.setH14b8("");
            for (int i = 0; i < rdogrpH14b8.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH14b8.getChildAt(i);
                if (rb.isChecked()) objSave.setH14b8(d_rdogrpH14b8[i]);
            }

            String[] d_rdogrpH14b9 = new String[]{"1", "0"};
            objSave.setH14b9("");
            for (int i = 0; i < rdogrpH14b9.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH14b9.getChildAt(i);
                if (rb.isChecked()) objSave.setH14b9(d_rdogrpH14b9[i]);
            }

            objSave.setH14b9X(txtH14b9X.getText().toString());
            objSave.setM11(txtM11.getText().toString());
            objSave.setM12(txtM12.getText().toString());
            objSave.setM13(txtM13.getText().toString());
            String[] d_rdogrpM19 = new String[]{"1", "0"};
            objSave.setM19("");
            for (int i = 0; i < rdogrpM19.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM19.getChildAt(i);
                if (rb.isChecked()) objSave.setM19(d_rdogrpM19[i]);
            }

            String[] d_rdogrpM115 = new String[]{"1", "2", "0"};
            objSave.setM115("");
            for (int i = 0; i < rdogrpM115.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM115.getChildAt(i);
                if (rb.isChecked()) objSave.setM115(d_rdogrpM115[i]);
            }

            objSave.setM116(txtM116.getText().toString());
            String[] d_rdogrpM120 = new String[]{"1", "2", "3"};
            objSave.setM120("");
            for (int i = 0; i < rdogrpM120.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM120.getChildAt(i);
                if (rb.isChecked()) objSave.setM120(d_rdogrpM120[i]);
            }

            String[] d_rdogrpM121 = new String[]{"1", "2", "3"};
            objSave.setM121("");
            for (int i = 0; i < rdogrpM121.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM121.getChildAt(i);
                if (rb.isChecked()) objSave.setM121(d_rdogrpM121[i]);
            }

            String[] d_rdogrpC14 = new String[]{"1", "2"};
            objSave.setC14("");
            for (int i = 0; i < rdogrpC14.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC14.getChildAt(i);
                if (rb.isChecked()) objSave.setC14(d_rdogrpC14[i]);
            }

            objSave.setC15(dtpC15.getText().toString().length() > 0 ? Global.DateConvertYMD(dtpC15.getText().toString()) : dtpC15.getText().toString());
            objSave.setC16(txtC16.getText().toString());
            String[] d_rdogrpC110 = new String[]{"1", "0"};
            objSave.setC110("");
            for (int i = 0; i < rdogrpC110.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC110.getChildAt(i);
                if (rb.isChecked()) objSave.setC110(d_rdogrpC110[i]);
            }

            String[] d_rdogrpC115 = new String[]{"1", "0"};
            objSave.setC115("");
            for (int i = 0; i < rdogrpC115.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC115.getChildAt(i);
                if (rb.isChecked()) objSave.setC115(d_rdogrpC115[i]);
            }

            String[] d_rdogrpC140 = new String[]{"1", "0", "8"};
            objSave.setC140("");
            for (int i = 0; i < rdogrpC140.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC140.getChildAt(i);
                if (rb.isChecked()) objSave.setC140(d_rdogrpC140[i]);
            }

            objSave.setC142a((chkC142a.isChecked() ? "1" : (secC142a.isShown() ? "2" : "")));
            objSave.setC142b((chkC142b.isChecked() ? "1" : (secC142b.isShown() ? "2" : "")));
            objSave.setC142c((chkC142c.isChecked() ? "1" : (secC142c.isShown() ? "2" : "")));
            objSave.setC142d((chkC142d.isChecked() ? "1" : (secC142d.isShown() ? "2" : "")));
            objSave.setC142e((chkC142e.isChecked() ? "1" : (secC142e.isShown() ? "2" : "")));
            objSave.setC142f((chkC142f.isChecked() ? "1" : (secC142f.isShown() ? "2" : "")));
            objSave.setC142g((chkC142g.isChecked() ? "1" : (secC142g.isShown() ? "2" : "")));
            objSave.setEnDt(Global.DateTimeNowYMDHMS());
            objSave.setStartTime(StartTime);
            objSave.setEndTime(g.CurrentTime24());
            objSave.setUserId(g.getUserId());
            objSave.setEntryUser(g.getUserId()); //from data entry user list
            //objSave.setLat(Double.toString(currentLatitude));
            //objSave.setLon(Double.toString(currentLongitude));

            String status = objSave.SaveUpdateData(this);
            if (status.length() == 0) {
                Connection.MessageBox(QC.this, "Saved Successfully");
            } else {
                Connection.MessageBox(QC.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(QC.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {
            RadioButton rb;
            QC_DataModel d = new QC_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<QC_DataModel> data = d.SelectAll(this, SQL);
            for (QC_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                spnH311.setSelection(Global.SpinnerItemPositionAnyLength(spnH311, item.getH311()));
                txtH312.setText(item.getH312());
                txtH313.setText(item.getH313());
                String[] d_rdogrpH61 = new String[]{"1", "0", "3"};
                for (int i = 0; i < d_rdogrpH61.length; i++) {
                    if (item.getH61().equals(String.valueOf(d_rdogrpH61[i]))) {
                        rb = (RadioButton) rdogrpH61.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH14c1 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH14c1.length; i++) {
                    if (item.getH14c1().equals(String.valueOf(d_rdogrpH14c1[i]))) {
                        rb = (RadioButton) rdogrpH14c1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH14b1 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH14b1.length; i++) {
                    if (item.getH14b1().equals(String.valueOf(d_rdogrpH14b1[i]))) {
                        rb = (RadioButton) rdogrpH14b1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH14b2 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH14b2.length; i++) {
                    if (item.getH14b2().equals(String.valueOf(d_rdogrpH14b2[i]))) {
                        rb = (RadioButton) rdogrpH14b2.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH14b3 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH14b3.length; i++) {
                    if (item.getH14b3().equals(String.valueOf(d_rdogrpH14b3[i]))) {
                        rb = (RadioButton) rdogrpH14b3.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH14b4 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH14b4.length; i++) {
                    if (item.getH14b4().equals(String.valueOf(d_rdogrpH14b4[i]))) {
                        rb = (RadioButton) rdogrpH14b4.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH14b5 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH14b5.length; i++) {
                    if (item.getH14b5().equals(String.valueOf(d_rdogrpH14b5[i]))) {
                        rb = (RadioButton) rdogrpH14b5.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH14b6 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH14b6.length; i++) {
                    if (item.getH14b6().equals(String.valueOf(d_rdogrpH14b6[i]))) {
                        rb = (RadioButton) rdogrpH14b6.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH14b7 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH14b7.length; i++) {
                    if (item.getH14b7().equals(String.valueOf(d_rdogrpH14b7[i]))) {
                        rb = (RadioButton) rdogrpH14b7.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH14b8 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH14b8.length; i++) {
                    if (item.getH14b8().equals(String.valueOf(d_rdogrpH14b8[i]))) {
                        rb = (RadioButton) rdogrpH14b8.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH14b9 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH14b9.length; i++) {
                    if (item.getH14b9().equals(String.valueOf(d_rdogrpH14b9[i]))) {
                        rb = (RadioButton) rdogrpH14b9.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH14b9X.setText(item.getH14b9X());
                txtM11.setText(item.getM11());
                txtM12.setText(item.getM12());
                txtM13.setText(item.getM13());
                String[] d_rdogrpM19 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM19.length; i++) {
                    if (item.getM19().equals(String.valueOf(d_rdogrpM19[i]))) {
                        rb = (RadioButton) rdogrpM19.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM115 = new String[]{"1", "2", "0"};
                for (int i = 0; i < d_rdogrpM115.length; i++) {
                    if (item.getM115().equals(String.valueOf(d_rdogrpM115[i]))) {
                        rb = (RadioButton) rdogrpM115.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtM116.setText(item.getM116());
                String[] d_rdogrpM120 = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpM120.length; i++) {
                    if (item.getM120().equals(String.valueOf(d_rdogrpM120[i]))) {
                        rb = (RadioButton) rdogrpM120.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM121 = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpM121.length; i++) {
                    if (item.getM121().equals(String.valueOf(d_rdogrpM121[i]))) {
                        rb = (RadioButton) rdogrpM121.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC14 = new String[]{"1", "2"};
                for (int i = 0; i < d_rdogrpC14.length; i++) {
                    if (item.getC14().equals(String.valueOf(d_rdogrpC14[i]))) {
                        rb = (RadioButton) rdogrpC14.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                dtpC15.setText(item.getC15().toString().length() == 0 ? "" : Global.DateConvertDMY(item.getC15()));
                txtC16.setText(item.getC16());
                String[] d_rdogrpC110 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpC110.length; i++) {
                    if (item.getC110().equals(String.valueOf(d_rdogrpC110[i]))) {
                        rb = (RadioButton) rdogrpC110.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC115 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpC115.length; i++) {
                    if (item.getC115().equals(String.valueOf(d_rdogrpC115[i]))) {
                        rb = (RadioButton) rdogrpC115.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC140 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC140.length; i++) {
                    if (item.getC140().equals(String.valueOf(d_rdogrpC140[i]))) {
                        rb = (RadioButton) rdogrpC140.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getC142a().equals("1")) {
                    chkC142a.setChecked(true);
                } else if (item.getC142a().equals("2")) {
                    chkC142a.setChecked(false);
                }
                if (item.getC142b().equals("1")) {
                    chkC142b.setChecked(true);
                } else if (item.getC142b().equals("2")) {
                    chkC142b.setChecked(false);
                }
                if (item.getC142c().equals("1")) {
                    chkC142c.setChecked(true);
                } else if (item.getC142c().equals("2")) {
                    chkC142c.setChecked(false);
                }
                if (item.getC142d().equals("1")) {
                    chkC142d.setChecked(true);
                } else if (item.getC142d().equals("2")) {
                    chkC142d.setChecked(false);
                }
                if (item.getC142e().equals("1")) {
                    chkC142e.setChecked(true);
                } else if (item.getC142e().equals("2")) {
                    chkC142e.setChecked(false);
                }
                if (item.getC142f().equals("1")) {
                    chkC142f.setChecked(true);
                } else if (item.getC142f().equals("2")) {
                    chkC142f.setChecked(false);
                }
                if (item.getC142g().equals("1")) {
                    chkC142g.setChecked(true);
                } else if (item.getC142g().equals("2")) {
                    chkC142g.setChecked(false);
                }
            }
        } catch (Exception e) {
            Connection.MessageBox(QC.this, e.getMessage());
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