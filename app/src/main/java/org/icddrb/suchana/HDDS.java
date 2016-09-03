package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".HDDS" android:label="HDDS" />

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

public class HDDS extends Activity {
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
    LinearLayout secSuchanaID;
    TextView VlblSuchanaID;
    EditText txtSuchanaID;
    LinearLayout seclblH7;
    LinearLayout seclblH71;
    LinearLayout secH71a;
    TextView VlblH71a;
    RadioGroup rdogrpH71a;
    RadioButton rdoH71a1;
    RadioButton rdoH71a2;
    LinearLayout secH71b1;
    TextView VlblH71b1;
    CheckBox chkH71b1;
    LinearLayout secH71b2;
    TextView VlblH71b2;
    CheckBox chkH71b2;
    LinearLayout secH71b3;
    TextView VlblH71b3;
    CheckBox chkH71b3;
    LinearLayout secH71b4;
    TextView VlblH71b4;
    CheckBox chkH71b4;
    LinearLayout secH71c;
    TextView VlblH71c;
    RadioGroup rdogrpH71c;
    RadioButton rdoH71c1;
    RadioButton rdoH71c2;
    LinearLayout secH72a;
    TextView VlblH72a;
    RadioGroup rdogrpH72a;
    RadioButton rdoH72a1;
    RadioButton rdoH72a2;
    LinearLayout secH72b1;
    TextView VlblH72b1;
    CheckBox chkH72b1;
    LinearLayout secH72b2;
    TextView VlblH72b2;
    CheckBox chkH72b2;
    LinearLayout secH72b3;
    TextView VlblH72b3;
    CheckBox chkH72b3;
    LinearLayout secH72b4;
    TextView VlblH72b4;
    CheckBox chkH72b4;
    LinearLayout secH72c;
    TextView VlblH72c;
    RadioGroup rdogrpH72c;
    RadioButton rdoH72c1;
    RadioButton rdoH72c2;
    LinearLayout secH73a;
    TextView VlblH73a;
    RadioGroup rdogrpH73a;
    RadioButton rdoH73a1;
    RadioButton rdoH73a2;
    LinearLayout secH73b1;
    TextView VlblH73b1;
    CheckBox chkH73b1;
    LinearLayout secH73b2;
    TextView VlblH73b2;
    CheckBox chkH73b2;
    LinearLayout secH73b3;
    TextView VlblH73b3;
    CheckBox chkH73b3;
    LinearLayout secH73b4;
    TextView VlblH73b4;
    CheckBox chkH73b4;
    LinearLayout secH73c;
    TextView VlblH73c;
    RadioGroup rdogrpH73c;
    RadioButton rdoH73c1;
    RadioButton rdoH73c2;
    LinearLayout secH74a;
    TextView VlblH74a;
    RadioGroup rdogrpH74a;
    RadioButton rdoH74a1;
    RadioButton rdoH74a2;
    LinearLayout secH74b1;
    TextView VlblH74b1;
    CheckBox chkH74b1;
    LinearLayout secH74b2;
    TextView VlblH74b2;
    CheckBox chkH74b2;
    LinearLayout secH74b3;
    TextView VlblH74b3;
    CheckBox chkH74b3;
    LinearLayout secH74b4;
    TextView VlblH74b4;
    CheckBox chkH74b4;
    LinearLayout secH74c;
    TextView VlblH74c;
    RadioGroup rdogrpH74c;
    RadioButton rdoH74c1;
    RadioButton rdoH74c2;
    LinearLayout secH75a;
    TextView VlblH75a;
    RadioGroup rdogrpH75a;
    RadioButton rdoH75a1;
    RadioButton rdoH75a2;
    LinearLayout secH75b1;
    TextView VlblH75b1;
    CheckBox chkH75b1;
    LinearLayout secH75b2;
    TextView VlblH75b2;
    CheckBox chkH75b2;
    LinearLayout secH75b3;
    TextView VlblH75b3;
    CheckBox chkH75b3;
    LinearLayout secH75b4;
    TextView VlblH75b4;
    CheckBox chkH75b4;
    LinearLayout secH75c;
    TextView VlblH75c;
    RadioGroup rdogrpH75c;
    RadioButton rdoH75c1;
    RadioButton rdoH75c2;
    LinearLayout secH76a;
    TextView VlblH76a;
    RadioGroup rdogrpH76a;
    RadioButton rdoH76a1;
    RadioButton rdoH76a2;
    LinearLayout secH76b1;
    TextView VlblH76b1;
    CheckBox chkH76b1;
    LinearLayout secH76b2;
    TextView VlblH76b2;
    CheckBox chkH76b2;
    LinearLayout secH76b3;
    TextView VlblH76b3;
    CheckBox chkH76b3;
    LinearLayout secH76b4;
    TextView VlblH76b4;
    CheckBox chkH76b4;
    LinearLayout secH76c;
    TextView VlblH76c;
    RadioGroup rdogrpH76c;
    RadioButton rdoH76c1;
    RadioButton rdoH76c2;
    LinearLayout secH77a;
    TextView VlblH77a;
    RadioGroup rdogrpH77a;
    RadioButton rdoH77a1;
    RadioButton rdoH77a2;
    LinearLayout secH77b1;
    TextView VlblH77b1;
    CheckBox chkH77b1;
    LinearLayout secH77b2;
    TextView VlblH77b2;
    CheckBox chkH77b2;
    LinearLayout secH77b3;
    TextView VlblH77b3;
    CheckBox chkH77b3;
    LinearLayout secH77b4;
    TextView VlblH77b4;
    CheckBox chkH77b4;
    LinearLayout secH77c;
    TextView VlblH77c;
    RadioGroup rdogrpH77c;
    RadioButton rdoH77c1;
    RadioButton rdoH77c2;
    LinearLayout secH78a;
    TextView VlblH78a;
    RadioGroup rdogrpH78a;
    RadioButton rdoH78a1;
    RadioButton rdoH78a2;
    LinearLayout secH78b1;
    TextView VlblH78b1;
    CheckBox chkH78b1;
    LinearLayout secH78b2;
    TextView VlblH78b2;
    CheckBox chkH78b2;
    LinearLayout secH78b3;
    TextView VlblH78b3;
    CheckBox chkH78b3;
    LinearLayout secH78b4;
    TextView VlblH78b4;
    CheckBox chkH78b4;
    LinearLayout secH78c;
    TextView VlblH78c;
    RadioGroup rdogrpH78c;
    RadioButton rdoH78c1;
    RadioButton rdoH78c2;
    LinearLayout secH79a;
    TextView VlblH79a;
    RadioGroup rdogrpH79a;
    RadioButton rdoH79a1;
    RadioButton rdoH79a2;
    LinearLayout secH79b1;
    TextView VlblH79b1;
    CheckBox chkH79b1;
    LinearLayout secH79b2;
    TextView VlblH79b2;
    CheckBox chkH79b2;
    LinearLayout secH79b3;
    TextView VlblH79b3;
    CheckBox chkH79b3;
    LinearLayout secH79b4;
    TextView VlblH79b4;
    CheckBox chkH79b4;
    LinearLayout secH79c;
    TextView VlblH79c;
    RadioGroup rdogrpH79c;
    RadioButton rdoH79c1;
    RadioButton rdoH79c2;
    LinearLayout secH710a;
    TextView VlblH710a;
    RadioGroup rdogrpH710a;
    RadioButton rdoH710a1;
    RadioButton rdoH710a2;
    LinearLayout secH710b1;
    TextView VlblH710b1;
    CheckBox chkH710b1;
    LinearLayout secH710b2;
    TextView VlblH710b2;
    CheckBox chkH710b2;
    LinearLayout secH710b3;
    TextView VlblH710b3;
    CheckBox chkH710b3;
    LinearLayout secH710b4;
    TextView VlblH710b4;
    CheckBox chkH710b4;
    LinearLayout secH710c;
    TextView VlblH710c;
    RadioGroup rdogrpH710c;
    RadioButton rdoH710c1;
    RadioButton rdoH710c2;
    LinearLayout secH7111a;
    TextView VlblH7111a;
    RadioGroup rdogrpH7111a;
    RadioButton rdoH7111a1;
    RadioButton rdoH7111a2;
    LinearLayout secH7111b1;
    TextView VlblH7111b1;
    CheckBox chkH7111b1;
    LinearLayout secH7111b2;
    TextView VlblH7111b2;
    CheckBox chkH7111b2;
    LinearLayout secH7111b3;
    TextView VlblH7111b3;
    CheckBox chkH7111b3;
    LinearLayout secH7111b4;
    TextView VlblH7111b4;
    CheckBox chkH7111b4;
    LinearLayout secH7111c1;
    TextView VlblH7111c1;
    RadioGroup rdogrpH7111c1;
    RadioButton rdoH7111c11;
    RadioButton rdoH7111c12;
    LinearLayout secH7112a;
    TextView VlblH7112a;
    RadioGroup rdogrpH7112a;
    RadioButton rdoH7112a1;
    RadioButton rdoH7112a2;
    LinearLayout secH7112b1;
    TextView VlblH7112b1;
    CheckBox chkH7112b1;
    LinearLayout secH7112b2;
    TextView VlblH7112b2;
    CheckBox chkH7112b2;
    LinearLayout secH7112b3;
    TextView VlblH7112b3;
    CheckBox chkH7112b3;
    LinearLayout secH7112b4;
    TextView VlblH7112b4;
    CheckBox chkH7112b4;
    LinearLayout secH7112c;
    TextView VlblH7112c;
    RadioGroup rdogrpH7112c;
    RadioButton rdoH7112c1;
    RadioButton rdoH7112c2;
    LinearLayout secH7113a;
    TextView VlblH7113a;
    RadioGroup rdogrpH7113a;
    RadioButton rdoH7113a1;
    RadioButton rdoH7113a2;
    LinearLayout secH7113b1;
    TextView VlblH7113b1;
    CheckBox chkH7113b1;
    LinearLayout secH7113b2;
    TextView VlblH7113b2;
    CheckBox chkH7113b2;
    LinearLayout secH7113b3;
    TextView VlblH7113b3;
    CheckBox chkH7113b3;
    LinearLayout secH7113b4;
    TextView VlblH7113b4;
    CheckBox chkH7113b4;
    LinearLayout secH7113c;
    TextView VlblH7113c;
    Spinner spnH7113c;
    LinearLayout secH7114a;
    TextView VlblH7114a;
    RadioGroup rdogrpH7114a;
    RadioButton rdoH7114a1;
    RadioButton rdoH7114a2;
    LinearLayout secH7114b1;
    TextView VlblH7114b1;
    CheckBox chkH7114b1;
    LinearLayout secH7114b2;
    TextView VlblH7114b2;
    EditText txtH7114b2;
    LinearLayout secH7114b3;
    TextView VlblH7114b3;
    CheckBox chkH7114b3;
    LinearLayout secH7114b4;
    TextView VlblH7114b4;
    CheckBox chkH7114b4;
    LinearLayout secH7114c;
    TextView VlblH7114c;
    RadioGroup rdogrpH7114c;
    RadioButton rdoH7114c1;
    RadioButton rdoH7114c2;
    LinearLayout secH712a;
    TextView VlblH712a;
    RadioGroup rdogrpH712a;
    RadioButton rdoH712a1;
    RadioButton rdoH712a2;
    LinearLayout secH712b1;
    TextView VlblH712b1;
    CheckBox chkH712b1;
    LinearLayout secH712b2;
    TextView VlblH712b2;
    CheckBox chkH712b2;
    LinearLayout secH712b3;
    TextView VlblH712b3;
    CheckBox chkH712b3;
    LinearLayout secH712b4;
    TextView VlblH712b4;
    CheckBox chkH712b4;
    LinearLayout secH712c;
    TextView VlblH712c;
    RadioGroup rdogrpH712c;
    RadioButton rdoH712c1;
    RadioButton rdoH712c2;
    LinearLayout secH713a;
    TextView VlblH713a;
    RadioGroup rdogrpH713a;
    RadioButton rdoH713a1;
    RadioButton rdoH713a2;
    LinearLayout secH713b1;
    TextView VlblH713b1;
    CheckBox chkH713b1;
    LinearLayout secH713b2;
    TextView VlblH713b2;
    CheckBox chkH713b2;
    LinearLayout secH713b3;
    TextView VlblH713b3;
    CheckBox chkH713b3;
    LinearLayout secH713b4;
    TextView VlblH713b4;
    CheckBox chkH713b4;
    LinearLayout secH713c;
    TextView VlblH713c;
    RadioGroup rdogrpH713c;
    RadioButton rdoH713c1;
    RadioButton rdoH713c2;
    LinearLayout secH714a;
    TextView VlblH714a;
    RadioGroup rdogrpH714a;
    RadioButton rdoH714a1;
    RadioButton rdoH714a2;
    LinearLayout secH714b1;
    TextView VlblH714b1;
    CheckBox chkH714b1;
    LinearLayout secH714b2;
    TextView VlblH714b2;
    CheckBox chkH714b2;
    LinearLayout secH714b3;
    TextView VlblH714b3;
    CheckBox chkH714b3;
    LinearLayout secH714b4;
    TextView VlblH714b4;
    CheckBox chkH714b4;
    LinearLayout secH714c;
    TextView VlblH714c;
    RadioGroup rdogrpH714c;
    RadioButton rdoH714c1;
    RadioButton rdoH714c2;
    LinearLayout secH715a;
    TextView VlblH715a;
    RadioGroup rdogrpH715a;
    RadioButton rdoH715a1;
    RadioButton rdoH715a2;
    LinearLayout secH715b1;
    TextView VlblH715b1;
    CheckBox chkH715b1;
    LinearLayout secH715b2;
    TextView VlblH715b2;
    CheckBox chkH715b2;
    LinearLayout secH715b3;
    TextView VlblH715b3;
    CheckBox chkH715b3;
    LinearLayout secH715b4;
    TextView VlblH715b4;
    CheckBox chkH715b4;
    LinearLayout secH715c;
    TextView VlblH715c;
    RadioGroup rdogrpH715c;
    RadioButton rdoH715c1;
    RadioButton rdoH715c2;
    LinearLayout secH716a;
    TextView VlblH716a;
    RadioGroup rdogrpH716a;
    RadioButton rdoH716a1;
    RadioButton rdoH716a2;
    LinearLayout secH716b1;
    TextView VlblH716b1;
    CheckBox chkH716b1;
    LinearLayout secH716b2;
    TextView VlblH716b2;
    CheckBox chkH716b2;
    LinearLayout secH716b3;
    TextView VlblH716b3;
    CheckBox chkH716b3;
    LinearLayout secH716b4;
    TextView VlblH716b4;
    CheckBox chkH716b4;
    LinearLayout secH716c;
    TextView VlblH716c;
    RadioGroup rdogrpH716c;
    RadioButton rdoH716c1;
    RadioButton rdoH716c2;
    LinearLayout secH717a;
    TextView VlblH717a;
    RadioGroup rdogrpH717a;
    RadioButton rdoH717a1;
    RadioButton rdoH717a2;
    LinearLayout secH717b1;
    TextView VlblH717b1;
    CheckBox chkH717b1;
    LinearLayout secH717b2;
    TextView VlblH717b2;
    CheckBox chkH717b2;
    LinearLayout secH717b3;
    TextView VlblH717b3;
    CheckBox chkH717b3;
    LinearLayout secH717b4;
    TextView VlblH717b4;
    CheckBox chkH717b4;
    LinearLayout secH717c;
    TextView VlblH717c;
    RadioGroup rdogrpH717c;
    RadioButton rdoH717c1;
    RadioButton rdoH717c2;
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
            setContentView(R.layout.hdds);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TableName = "HDDS";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(HDDS.this);
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
            secSuchanaID = (LinearLayout) findViewById(R.id.secSuchanaID);
            VlblSuchanaID = (TextView) findViewById(R.id.VlblSuchanaID);
            txtSuchanaID = (EditText) findViewById(R.id.txtSuchanaID);
            seclblH7 = (LinearLayout) findViewById(R.id.seclblH7);
            seclblH71 = (LinearLayout) findViewById(R.id.seclblH71);
            secH71a = (LinearLayout) findViewById(R.id.secH71a);
            VlblH71a = (TextView) findViewById(R.id.VlblH71a);
            rdogrpH71a = (RadioGroup) findViewById(R.id.rdogrpH71a);

            rdoH71a1 = (RadioButton) findViewById(R.id.rdoH71a1);
            rdoH71a2 = (RadioButton) findViewById(R.id.rdoH71a2);
            rdogrpH71a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH71a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH71a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH71a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH71a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH71b1.setVisibility(View.GONE);
                        chkH71b1.setChecked(false);
                        secH71b2.setVisibility(View.GONE);
                        chkH71b2.setChecked(false);
                        secH71b3.setVisibility(View.GONE);
                        chkH71b3.setChecked(false);
                        secH71b4.setVisibility(View.GONE);
                        chkH71b4.setChecked(false);
                        secH71c.setVisibility(View.GONE);
                        rdogrpH71c.clearCheck();
                    } else {
                        secH71b1.setVisibility(View.VISIBLE);
                        secH71b2.setVisibility(View.VISIBLE);
                        secH71b3.setVisibility(View.VISIBLE);
                        secH71b4.setVisibility(View.VISIBLE);
                        secH71c.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH71b1 = (LinearLayout) findViewById(R.id.secH71b1);
            VlblH71b1 = (TextView) findViewById(R.id.VlblH71b1);
            chkH71b1 = (CheckBox) findViewById(R.id.chkH71b1);
            secH71b2 = (LinearLayout) findViewById(R.id.secH71b2);
            VlblH71b2 = (TextView) findViewById(R.id.VlblH71b2);
            chkH71b2 = (CheckBox) findViewById(R.id.chkH71b2);
            secH71b3 = (LinearLayout) findViewById(R.id.secH71b3);
            VlblH71b3 = (TextView) findViewById(R.id.VlblH71b3);
            chkH71b3 = (CheckBox) findViewById(R.id.chkH71b3);
            secH71b4 = (LinearLayout) findViewById(R.id.secH71b4);
            VlblH71b4 = (TextView) findViewById(R.id.VlblH71b4);
            chkH71b4 = (CheckBox) findViewById(R.id.chkH71b4);
            secH71c = (LinearLayout) findViewById(R.id.secH71c);
            VlblH71c = (TextView) findViewById(R.id.VlblH71c);
            rdogrpH71c = (RadioGroup) findViewById(R.id.rdogrpH71c);

            rdoH71c1 = (RadioButton) findViewById(R.id.rdoH71c1);
            rdoH71c2 = (RadioButton) findViewById(R.id.rdoH71c2);
            secH72a = (LinearLayout) findViewById(R.id.secH72a);
            VlblH72a = (TextView) findViewById(R.id.VlblH72a);
            rdogrpH72a = (RadioGroup) findViewById(R.id.rdogrpH72a);

            rdoH72a1 = (RadioButton) findViewById(R.id.rdoH72a1);
            rdoH72a2 = (RadioButton) findViewById(R.id.rdoH72a2);
            rdogrpH72a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH72a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH72a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH72a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH72a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH72b1.setVisibility(View.GONE);
                        chkH72b1.setChecked(false);
                        secH72b2.setVisibility(View.GONE);
                        chkH72b2.setChecked(false);
                        secH72b3.setVisibility(View.GONE);
                        chkH72b3.setChecked(false);
                        secH72b4.setVisibility(View.GONE);
                        chkH72b4.setChecked(false);
                        secH72c.setVisibility(View.GONE);
                        rdogrpH72c.clearCheck();
                    } else {
                        secH72b1.setVisibility(View.VISIBLE);
                        secH72b2.setVisibility(View.VISIBLE);
                        secH72b3.setVisibility(View.VISIBLE);
                        secH72b4.setVisibility(View.VISIBLE);
                        secH72c.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH72b1 = (LinearLayout) findViewById(R.id.secH72b1);
            VlblH72b1 = (TextView) findViewById(R.id.VlblH72b1);
            chkH72b1 = (CheckBox) findViewById(R.id.chkH72b1);
            secH72b2 = (LinearLayout) findViewById(R.id.secH72b2);
            VlblH72b2 = (TextView) findViewById(R.id.VlblH72b2);
            chkH72b2 = (CheckBox) findViewById(R.id.chkH72b2);
            secH72b3 = (LinearLayout) findViewById(R.id.secH72b3);
            VlblH72b3 = (TextView) findViewById(R.id.VlblH72b3);
            chkH72b3 = (CheckBox) findViewById(R.id.chkH72b3);
            secH72b4 = (LinearLayout) findViewById(R.id.secH72b4);
            VlblH72b4 = (TextView) findViewById(R.id.VlblH72b4);
            chkH72b4 = (CheckBox) findViewById(R.id.chkH72b4);
            secH72c = (LinearLayout) findViewById(R.id.secH72c);
            VlblH72c = (TextView) findViewById(R.id.VlblH72c);
            rdogrpH72c = (RadioGroup) findViewById(R.id.rdogrpH72c);

            rdoH72c1 = (RadioButton) findViewById(R.id.rdoH72c1);
            rdoH72c2 = (RadioButton) findViewById(R.id.rdoH72c2);
            secH73a = (LinearLayout) findViewById(R.id.secH73a);
            VlblH73a = (TextView) findViewById(R.id.VlblH73a);
            rdogrpH73a = (RadioGroup) findViewById(R.id.rdogrpH73a);

            rdoH73a1 = (RadioButton) findViewById(R.id.rdoH73a1);
            rdoH73a2 = (RadioButton) findViewById(R.id.rdoH73a2);
            rdogrpH73a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH73a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH73a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH73a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH73a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH73b1.setVisibility(View.GONE);
                        chkH73b1.setChecked(false);
                        secH73b2.setVisibility(View.GONE);
                        chkH73b2.setChecked(false);
                        secH73b3.setVisibility(View.GONE);
                        chkH73b3.setChecked(false);
                        secH73b4.setVisibility(View.GONE);
                        chkH73b4.setChecked(false);
                        secH73c.setVisibility(View.GONE);
                        rdogrpH73c.clearCheck();
                    } else {
                        secH73b1.setVisibility(View.VISIBLE);
                        secH73b2.setVisibility(View.VISIBLE);
                        secH73b3.setVisibility(View.VISIBLE);
                        secH73b4.setVisibility(View.VISIBLE);
                        secH73c.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH73b1 = (LinearLayout) findViewById(R.id.secH73b1);
            VlblH73b1 = (TextView) findViewById(R.id.VlblH73b1);
            chkH73b1 = (CheckBox) findViewById(R.id.chkH73b1);
            secH73b2 = (LinearLayout) findViewById(R.id.secH73b2);
            VlblH73b2 = (TextView) findViewById(R.id.VlblH73b2);
            chkH73b2 = (CheckBox) findViewById(R.id.chkH73b2);
            secH73b3 = (LinearLayout) findViewById(R.id.secH73b3);
            VlblH73b3 = (TextView) findViewById(R.id.VlblH73b3);
            chkH73b3 = (CheckBox) findViewById(R.id.chkH73b3);
            secH73b4 = (LinearLayout) findViewById(R.id.secH73b4);
            VlblH73b4 = (TextView) findViewById(R.id.VlblH73b4);
            chkH73b4 = (CheckBox) findViewById(R.id.chkH73b4);
            secH73c = (LinearLayout) findViewById(R.id.secH73c);
            VlblH73c = (TextView) findViewById(R.id.VlblH73c);
            rdogrpH73c = (RadioGroup) findViewById(R.id.rdogrpH73c);

            rdoH73c1 = (RadioButton) findViewById(R.id.rdoH73c1);
            rdoH73c2 = (RadioButton) findViewById(R.id.rdoH73c2);
            secH74a = (LinearLayout) findViewById(R.id.secH74a);
            VlblH74a = (TextView) findViewById(R.id.VlblH74a);
            rdogrpH74a = (RadioGroup) findViewById(R.id.rdogrpH74a);

            rdoH74a1 = (RadioButton) findViewById(R.id.rdoH74a1);
            rdoH74a2 = (RadioButton) findViewById(R.id.rdoH74a2);
            rdogrpH74a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH74a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH74a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH74a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH74a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH74b1.setVisibility(View.GONE);
                        chkH74b1.setChecked(false);
                        secH74b2.setVisibility(View.GONE);
                        chkH74b2.setChecked(false);
                        secH74b3.setVisibility(View.GONE);
                        chkH74b3.setChecked(false);
                        secH74b4.setVisibility(View.GONE);
                        chkH74b4.setChecked(false);
                        secH74c.setVisibility(View.GONE);
                        rdogrpH74c.clearCheck();
                    } else {
                        secH74b1.setVisibility(View.VISIBLE);
                        secH74b2.setVisibility(View.VISIBLE);
                        secH74b3.setVisibility(View.VISIBLE);
                        secH74b4.setVisibility(View.VISIBLE);
                        secH74c.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH74b1 = (LinearLayout) findViewById(R.id.secH74b1);
            VlblH74b1 = (TextView) findViewById(R.id.VlblH74b1);
            chkH74b1 = (CheckBox) findViewById(R.id.chkH74b1);
            secH74b2 = (LinearLayout) findViewById(R.id.secH74b2);
            VlblH74b2 = (TextView) findViewById(R.id.VlblH74b2);
            chkH74b2 = (CheckBox) findViewById(R.id.chkH74b2);
            secH74b3 = (LinearLayout) findViewById(R.id.secH74b3);
            VlblH74b3 = (TextView) findViewById(R.id.VlblH74b3);
            chkH74b3 = (CheckBox) findViewById(R.id.chkH74b3);
            secH74b4 = (LinearLayout) findViewById(R.id.secH74b4);
            VlblH74b4 = (TextView) findViewById(R.id.VlblH74b4);
            chkH74b4 = (CheckBox) findViewById(R.id.chkH74b4);
            secH74c = (LinearLayout) findViewById(R.id.secH74c);
            VlblH74c = (TextView) findViewById(R.id.VlblH74c);
            rdogrpH74c = (RadioGroup) findViewById(R.id.rdogrpH74c);

            rdoH74c1 = (RadioButton) findViewById(R.id.rdoH74c1);
            rdoH74c2 = (RadioButton) findViewById(R.id.rdoH74c2);
            secH75a = (LinearLayout) findViewById(R.id.secH75a);
            VlblH75a = (TextView) findViewById(R.id.VlblH75a);
            rdogrpH75a = (RadioGroup) findViewById(R.id.rdogrpH75a);

            rdoH75a1 = (RadioButton) findViewById(R.id.rdoH75a1);
            rdoH75a2 = (RadioButton) findViewById(R.id.rdoH75a2);
            rdogrpH75a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH75a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH75a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH75a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH75a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH75b1.setVisibility(View.GONE);
                        chkH75b1.setChecked(false);
                        secH75b2.setVisibility(View.GONE);
                        chkH75b2.setChecked(false);
                        secH75b3.setVisibility(View.GONE);
                        chkH75b3.setChecked(false);
                        secH75b4.setVisibility(View.GONE);
                        chkH75b4.setChecked(false);
                        secH75c.setVisibility(View.GONE);
                        rdogrpH75c.clearCheck();
                    } else {
                        secH75b1.setVisibility(View.VISIBLE);
                        secH75b2.setVisibility(View.VISIBLE);
                        secH75b3.setVisibility(View.VISIBLE);
                        secH75b4.setVisibility(View.VISIBLE);
                        secH75c.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH75b1 = (LinearLayout) findViewById(R.id.secH75b1);
            VlblH75b1 = (TextView) findViewById(R.id.VlblH75b1);
            chkH75b1 = (CheckBox) findViewById(R.id.chkH75b1);
            secH75b2 = (LinearLayout) findViewById(R.id.secH75b2);
            VlblH75b2 = (TextView) findViewById(R.id.VlblH75b2);
            chkH75b2 = (CheckBox) findViewById(R.id.chkH75b2);
            secH75b3 = (LinearLayout) findViewById(R.id.secH75b3);
            VlblH75b3 = (TextView) findViewById(R.id.VlblH75b3);
            chkH75b3 = (CheckBox) findViewById(R.id.chkH75b3);
            secH75b4 = (LinearLayout) findViewById(R.id.secH75b4);
            VlblH75b4 = (TextView) findViewById(R.id.VlblH75b4);
            chkH75b4 = (CheckBox) findViewById(R.id.chkH75b4);
            secH75c = (LinearLayout) findViewById(R.id.secH75c);
            VlblH75c = (TextView) findViewById(R.id.VlblH75c);
            rdogrpH75c = (RadioGroup) findViewById(R.id.rdogrpH75c);

            rdoH75c1 = (RadioButton) findViewById(R.id.rdoH75c1);
            rdoH75c2 = (RadioButton) findViewById(R.id.rdoH75c2);
            secH76a = (LinearLayout) findViewById(R.id.secH76a);
            VlblH76a = (TextView) findViewById(R.id.VlblH76a);
            rdogrpH76a = (RadioGroup) findViewById(R.id.rdogrpH76a);

            rdoH76a1 = (RadioButton) findViewById(R.id.rdoH76a1);
            rdoH76a2 = (RadioButton) findViewById(R.id.rdoH76a2);
            rdogrpH76a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH76a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH76a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH76a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH76a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH76b1.setVisibility(View.GONE);
                        chkH76b1.setChecked(false);
                        secH76b2.setVisibility(View.GONE);
                        chkH76b2.setChecked(false);
                        secH76b3.setVisibility(View.GONE);
                        chkH76b3.setChecked(false);
                        secH76b4.setVisibility(View.GONE);
                        chkH76b4.setChecked(false);
                        secH76c.setVisibility(View.GONE);
                        rdogrpH76c.clearCheck();
                    } else {
                        secH76b1.setVisibility(View.VISIBLE);
                        secH76b2.setVisibility(View.VISIBLE);
                        secH76b3.setVisibility(View.VISIBLE);
                        secH76b4.setVisibility(View.VISIBLE);
                        secH76c.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH76b1 = (LinearLayout) findViewById(R.id.secH76b1);
            VlblH76b1 = (TextView) findViewById(R.id.VlblH76b1);
            chkH76b1 = (CheckBox) findViewById(R.id.chkH76b1);
            secH76b2 = (LinearLayout) findViewById(R.id.secH76b2);
            VlblH76b2 = (TextView) findViewById(R.id.VlblH76b2);
            chkH76b2 = (CheckBox) findViewById(R.id.chkH76b2);
            secH76b3 = (LinearLayout) findViewById(R.id.secH76b3);
            VlblH76b3 = (TextView) findViewById(R.id.VlblH76b3);
            chkH76b3 = (CheckBox) findViewById(R.id.chkH76b3);
            secH76b4 = (LinearLayout) findViewById(R.id.secH76b4);
            VlblH76b4 = (TextView) findViewById(R.id.VlblH76b4);
            chkH76b4 = (CheckBox) findViewById(R.id.chkH76b4);
            secH76c = (LinearLayout) findViewById(R.id.secH76c);
            VlblH76c = (TextView) findViewById(R.id.VlblH76c);
            rdogrpH76c = (RadioGroup) findViewById(R.id.rdogrpH76c);

            rdoH76c1 = (RadioButton) findViewById(R.id.rdoH76c1);
            rdoH76c2 = (RadioButton) findViewById(R.id.rdoH76c2);
            secH77a = (LinearLayout) findViewById(R.id.secH77a);
            VlblH77a = (TextView) findViewById(R.id.VlblH77a);
            rdogrpH77a = (RadioGroup) findViewById(R.id.rdogrpH77a);

            rdoH77a1 = (RadioButton) findViewById(R.id.rdoH77a1);
            rdoH77a2 = (RadioButton) findViewById(R.id.rdoH77a2);
            rdogrpH77a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH77a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH77a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH77a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH77a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH77b1.setVisibility(View.GONE);
                        chkH77b1.setChecked(false);
                        secH77b2.setVisibility(View.GONE);
                        chkH77b2.setChecked(false);
                        secH77b3.setVisibility(View.GONE);
                        chkH77b3.setChecked(false);
                        secH77b4.setVisibility(View.GONE);
                        chkH77b4.setChecked(false);
                        secH77c.setVisibility(View.GONE);
                        rdogrpH77c.clearCheck();
                    } else {
                        secH77b1.setVisibility(View.VISIBLE);
                        secH77b2.setVisibility(View.VISIBLE);
                        secH77b3.setVisibility(View.VISIBLE);
                        secH77b4.setVisibility(View.VISIBLE);
                        secH77c.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH77b1 = (LinearLayout) findViewById(R.id.secH77b1);
            VlblH77b1 = (TextView) findViewById(R.id.VlblH77b1);
            chkH77b1 = (CheckBox) findViewById(R.id.chkH77b1);
            secH77b2 = (LinearLayout) findViewById(R.id.secH77b2);
            VlblH77b2 = (TextView) findViewById(R.id.VlblH77b2);
            chkH77b2 = (CheckBox) findViewById(R.id.chkH77b2);
            secH77b3 = (LinearLayout) findViewById(R.id.secH77b3);
            VlblH77b3 = (TextView) findViewById(R.id.VlblH77b3);
            chkH77b3 = (CheckBox) findViewById(R.id.chkH77b3);
            secH77b4 = (LinearLayout) findViewById(R.id.secH77b4);
            VlblH77b4 = (TextView) findViewById(R.id.VlblH77b4);
            chkH77b4 = (CheckBox) findViewById(R.id.chkH77b4);
            secH77c = (LinearLayout) findViewById(R.id.secH77c);
            VlblH77c = (TextView) findViewById(R.id.VlblH77c);
            rdogrpH77c = (RadioGroup) findViewById(R.id.rdogrpH77c);

            rdoH77c1 = (RadioButton) findViewById(R.id.rdoH77c1);
            rdoH77c2 = (RadioButton) findViewById(R.id.rdoH77c2);
            secH78a = (LinearLayout) findViewById(R.id.secH78a);
            VlblH78a = (TextView) findViewById(R.id.VlblH78a);
            rdogrpH78a = (RadioGroup) findViewById(R.id.rdogrpH78a);

            rdoH78a1 = (RadioButton) findViewById(R.id.rdoH78a1);
            rdoH78a2 = (RadioButton) findViewById(R.id.rdoH78a2);
            rdogrpH78a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH78a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH78a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH78a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH78a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH78b1.setVisibility(View.GONE);
                        chkH78b1.setChecked(false);
                        secH78b2.setVisibility(View.GONE);
                        chkH78b2.setChecked(false);
                        secH78b3.setVisibility(View.GONE);
                        chkH78b3.setChecked(false);
                        secH78b4.setVisibility(View.GONE);
                        chkH78b4.setChecked(false);
                        secH78c.setVisibility(View.GONE);
                        rdogrpH78c.clearCheck();
                    } else {
                        secH78b1.setVisibility(View.VISIBLE);
                        secH78b2.setVisibility(View.VISIBLE);
                        secH78b3.setVisibility(View.VISIBLE);
                        secH78b4.setVisibility(View.VISIBLE);
                        secH78c.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH78b1 = (LinearLayout) findViewById(R.id.secH78b1);
            VlblH78b1 = (TextView) findViewById(R.id.VlblH78b1);
            chkH78b1 = (CheckBox) findViewById(R.id.chkH78b1);
            secH78b2 = (LinearLayout) findViewById(R.id.secH78b2);
            VlblH78b2 = (TextView) findViewById(R.id.VlblH78b2);
            chkH78b2 = (CheckBox) findViewById(R.id.chkH78b2);
            secH78b3 = (LinearLayout) findViewById(R.id.secH78b3);
            VlblH78b3 = (TextView) findViewById(R.id.VlblH78b3);
            chkH78b3 = (CheckBox) findViewById(R.id.chkH78b3);
            secH78b4 = (LinearLayout) findViewById(R.id.secH78b4);
            VlblH78b4 = (TextView) findViewById(R.id.VlblH78b4);
            chkH78b4 = (CheckBox) findViewById(R.id.chkH78b4);
            secH78c = (LinearLayout) findViewById(R.id.secH78c);
            VlblH78c = (TextView) findViewById(R.id.VlblH78c);
            rdogrpH78c = (RadioGroup) findViewById(R.id.rdogrpH78c);

            rdoH78c1 = (RadioButton) findViewById(R.id.rdoH78c1);
            rdoH78c2 = (RadioButton) findViewById(R.id.rdoH78c2);
            secH79a = (LinearLayout) findViewById(R.id.secH79a);
            VlblH79a = (TextView) findViewById(R.id.VlblH79a);
            rdogrpH79a = (RadioGroup) findViewById(R.id.rdogrpH79a);

            rdoH79a1 = (RadioButton) findViewById(R.id.rdoH79a1);
            rdoH79a2 = (RadioButton) findViewById(R.id.rdoH79a2);
            rdogrpH79a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH79a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH79a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH79a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH79a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH79b1.setVisibility(View.GONE);
                        chkH79b1.setChecked(false);
                        secH79b2.setVisibility(View.GONE);
                        chkH79b2.setChecked(false);
                        secH79b3.setVisibility(View.GONE);
                        chkH79b3.setChecked(false);
                        secH79b4.setVisibility(View.GONE);
                        chkH79b4.setChecked(false);
                        secH79c.setVisibility(View.GONE);
                        rdogrpH79c.clearCheck();
                    } else {
                        secH79b1.setVisibility(View.VISIBLE);
                        secH79b2.setVisibility(View.VISIBLE);
                        secH79b3.setVisibility(View.VISIBLE);
                        secH79b4.setVisibility(View.VISIBLE);
                        secH79c.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH79b1 = (LinearLayout) findViewById(R.id.secH79b1);
            VlblH79b1 = (TextView) findViewById(R.id.VlblH79b1);
            chkH79b1 = (CheckBox) findViewById(R.id.chkH79b1);
            secH79b2 = (LinearLayout) findViewById(R.id.secH79b2);
            VlblH79b2 = (TextView) findViewById(R.id.VlblH79b2);
            chkH79b2 = (CheckBox) findViewById(R.id.chkH79b2);
            secH79b3 = (LinearLayout) findViewById(R.id.secH79b3);
            VlblH79b3 = (TextView) findViewById(R.id.VlblH79b3);
            chkH79b3 = (CheckBox) findViewById(R.id.chkH79b3);
            secH79b4 = (LinearLayout) findViewById(R.id.secH79b4);
            VlblH79b4 = (TextView) findViewById(R.id.VlblH79b4);
            chkH79b4 = (CheckBox) findViewById(R.id.chkH79b4);
            secH79c = (LinearLayout) findViewById(R.id.secH79c);
            VlblH79c = (TextView) findViewById(R.id.VlblH79c);
            rdogrpH79c = (RadioGroup) findViewById(R.id.rdogrpH79c);

            rdoH79c1 = (RadioButton) findViewById(R.id.rdoH79c1);
            rdoH79c2 = (RadioButton) findViewById(R.id.rdoH79c2);
            secH710a = (LinearLayout) findViewById(R.id.secH710a);
            VlblH710a = (TextView) findViewById(R.id.VlblH710a);
            rdogrpH710a = (RadioGroup) findViewById(R.id.rdogrpH710a);

            rdoH710a1 = (RadioButton) findViewById(R.id.rdoH710a1);
            rdoH710a2 = (RadioButton) findViewById(R.id.rdoH710a2);
            rdogrpH710a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH710a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH710a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH710a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH710a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH710b1.setVisibility(View.GONE);
                        chkH710b1.setChecked(false);
                        secH710b2.setVisibility(View.GONE);
                        chkH710b2.setChecked(false);
                        secH710b3.setVisibility(View.GONE);
                        chkH710b3.setChecked(false);
                        secH710b4.setVisibility(View.GONE);
                        chkH710b4.setChecked(false);
                        secH710c.setVisibility(View.GONE);
                        rdogrpH710c.clearCheck();
                    } else {
                        secH710b1.setVisibility(View.VISIBLE);
                        secH710b2.setVisibility(View.VISIBLE);
                        secH710b3.setVisibility(View.VISIBLE);
                        secH710b4.setVisibility(View.VISIBLE);
                        secH710c.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH710b1 = (LinearLayout) findViewById(R.id.secH710b1);
            VlblH710b1 = (TextView) findViewById(R.id.VlblH710b1);
            chkH710b1 = (CheckBox) findViewById(R.id.chkH710b1);
            secH710b2 = (LinearLayout) findViewById(R.id.secH710b2);
            VlblH710b2 = (TextView) findViewById(R.id.VlblH710b2);
            chkH710b2 = (CheckBox) findViewById(R.id.chkH710b2);
            secH710b3 = (LinearLayout) findViewById(R.id.secH710b3);
            VlblH710b3 = (TextView) findViewById(R.id.VlblH710b3);
            chkH710b3 = (CheckBox) findViewById(R.id.chkH710b3);
            secH710b4 = (LinearLayout) findViewById(R.id.secH710b4);
            VlblH710b4 = (TextView) findViewById(R.id.VlblH710b4);
            chkH710b4 = (CheckBox) findViewById(R.id.chkH710b4);
            secH710c = (LinearLayout) findViewById(R.id.secH710c);
            VlblH710c = (TextView) findViewById(R.id.VlblH710c);
            rdogrpH710c = (RadioGroup) findViewById(R.id.rdogrpH710c);

            rdoH710c1 = (RadioButton) findViewById(R.id.rdoH710c1);
            rdoH710c2 = (RadioButton) findViewById(R.id.rdoH710c2);
            secH7111a = (LinearLayout) findViewById(R.id.secH7111a);
            VlblH7111a = (TextView) findViewById(R.id.VlblH7111a);
            rdogrpH7111a = (RadioGroup) findViewById(R.id.rdogrpH7111a);

            rdoH7111a1 = (RadioButton) findViewById(R.id.rdoH7111a1);
            rdoH7111a2 = (RadioButton) findViewById(R.id.rdoH7111a2);
            rdogrpH7111a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH7111a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH7111a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH7111a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH7111a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH7111b1.setVisibility(View.GONE);
                        chkH7111b1.setChecked(false);
                        secH7111b2.setVisibility(View.GONE);
                        chkH7111b2.setChecked(false);
                        secH7111b3.setVisibility(View.GONE);
                        chkH7111b3.setChecked(false);
                        secH7111b4.setVisibility(View.GONE);
                        chkH7111b4.setChecked(false);
                        secH7111c1.setVisibility(View.GONE);
                        rdogrpH7111c1.clearCheck();
                    } else {
                        secH7111b1.setVisibility(View.VISIBLE);
                        secH7111b2.setVisibility(View.VISIBLE);
                        secH7111b3.setVisibility(View.VISIBLE);
                        secH7111b4.setVisibility(View.VISIBLE);
                        secH7111c1.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH7111b1 = (LinearLayout) findViewById(R.id.secH7111b1);
            VlblH7111b1 = (TextView) findViewById(R.id.VlblH7111b1);
            chkH7111b1 = (CheckBox) findViewById(R.id.chkH7111b1);
            secH7111b2 = (LinearLayout) findViewById(R.id.secH7111b2);
            VlblH7111b2 = (TextView) findViewById(R.id.VlblH7111b2);
            chkH7111b2 = (CheckBox) findViewById(R.id.chkH7111b2);
            secH7111b3 = (LinearLayout) findViewById(R.id.secH7111b3);
            VlblH7111b3 = (TextView) findViewById(R.id.VlblH7111b3);
            chkH7111b3 = (CheckBox) findViewById(R.id.chkH7111b3);
            secH7111b4 = (LinearLayout) findViewById(R.id.secH7111b4);
            VlblH7111b4 = (TextView) findViewById(R.id.VlblH7111b4);
            chkH7111b4 = (CheckBox) findViewById(R.id.chkH7111b4);
            secH7111c1 = (LinearLayout) findViewById(R.id.secH7111c1);
            VlblH7111c1 = (TextView) findViewById(R.id.VlblH7111c1);
            rdogrpH7111c1 = (RadioGroup) findViewById(R.id.rdogrpH7111c1);

            rdoH7111c11 = (RadioButton) findViewById(R.id.rdoH7111c11);
            rdoH7111c12 = (RadioButton) findViewById(R.id.rdoH7111c12);
            secH7112a = (LinearLayout) findViewById(R.id.secH7112a);
            VlblH7112a = (TextView) findViewById(R.id.VlblH7112a);
            rdogrpH7112a = (RadioGroup) findViewById(R.id.rdogrpH7112a);

            rdoH7112a1 = (RadioButton) findViewById(R.id.rdoH7112a1);
            rdoH7112a2 = (RadioButton) findViewById(R.id.rdoH7112a2);
            rdogrpH7112a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH7112a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH7112a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH7112a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH7112a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH7112b1.setVisibility(View.GONE);
                        chkH7112b1.setChecked(false);
                        secH7112b2.setVisibility(View.GONE);
                        chkH7112b2.setChecked(false);
                        secH7112b3.setVisibility(View.GONE);
                        chkH7112b3.setChecked(false);
                        secH7112b4.setVisibility(View.GONE);
                        chkH7112b4.setChecked(false);
                        secH7112c.setVisibility(View.GONE);
                        rdogrpH7112c.clearCheck();
                    } else {
                        secH7112b1.setVisibility(View.VISIBLE);
                        secH7112b2.setVisibility(View.VISIBLE);
                        secH7112b3.setVisibility(View.VISIBLE);
                        secH7112b4.setVisibility(View.VISIBLE);
                        secH7112c.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH7112b1 = (LinearLayout) findViewById(R.id.secH7112b1);
            VlblH7112b1 = (TextView) findViewById(R.id.VlblH7112b1);
            chkH7112b1 = (CheckBox) findViewById(R.id.chkH7112b1);
            secH7112b2 = (LinearLayout) findViewById(R.id.secH7112b2);
            VlblH7112b2 = (TextView) findViewById(R.id.VlblH7112b2);
            chkH7112b2 = (CheckBox) findViewById(R.id.chkH7112b2);
            secH7112b3 = (LinearLayout) findViewById(R.id.secH7112b3);
            VlblH7112b3 = (TextView) findViewById(R.id.VlblH7112b3);
            chkH7112b3 = (CheckBox) findViewById(R.id.chkH7112b3);
            secH7112b4 = (LinearLayout) findViewById(R.id.secH7112b4);
            VlblH7112b4 = (TextView) findViewById(R.id.VlblH7112b4);
            chkH7112b4 = (CheckBox) findViewById(R.id.chkH7112b4);
            secH7112c = (LinearLayout) findViewById(R.id.secH7112c);
            VlblH7112c = (TextView) findViewById(R.id.VlblH7112c);
            rdogrpH7112c = (RadioGroup) findViewById(R.id.rdogrpH7112c);

            rdoH7112c1 = (RadioButton) findViewById(R.id.rdoH7112c1);
            rdoH7112c2 = (RadioButton) findViewById(R.id.rdoH7112c2);
            secH7113a = (LinearLayout) findViewById(R.id.secH7113a);
            VlblH7113a = (TextView) findViewById(R.id.VlblH7113a);
            rdogrpH7113a = (RadioGroup) findViewById(R.id.rdogrpH7113a);

            rdoH7113a1 = (RadioButton) findViewById(R.id.rdoH7113a1);
            rdoH7113a2 = (RadioButton) findViewById(R.id.rdoH7113a2);
            rdogrpH7113a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH7113a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH7113a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH7113a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH7113a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH7113b1.setVisibility(View.GONE);
                        chkH7113b1.setChecked(false);
                        secH7113b2.setVisibility(View.GONE);
                        chkH7113b2.setChecked(false);
                        secH7113b3.setVisibility(View.GONE);
                        chkH7113b3.setChecked(false);
                        secH7113b4.setVisibility(View.GONE);
                        chkH7113b4.setChecked(false);
                        secH7113c.setVisibility(View.GONE);
                        spnH7113c.setSelection(0);
                    } else {
                        secH7113b1.setVisibility(View.VISIBLE);
                        secH7113b2.setVisibility(View.VISIBLE);
                        secH7113b3.setVisibility(View.VISIBLE);
                        secH7113b4.setVisibility(View.VISIBLE);
                        secH7113c.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH7113b1 = (LinearLayout) findViewById(R.id.secH7113b1);
            VlblH7113b1 = (TextView) findViewById(R.id.VlblH7113b1);
            chkH7113b1 = (CheckBox) findViewById(R.id.chkH7113b1);
            secH7113b2 = (LinearLayout) findViewById(R.id.secH7113b2);
            VlblH7113b2 = (TextView) findViewById(R.id.VlblH7113b2);
            chkH7113b2 = (CheckBox) findViewById(R.id.chkH7113b2);
            secH7113b3 = (LinearLayout) findViewById(R.id.secH7113b3);
            VlblH7113b3 = (TextView) findViewById(R.id.VlblH7113b3);
            chkH7113b3 = (CheckBox) findViewById(R.id.chkH7113b3);
            secH7113b4 = (LinearLayout) findViewById(R.id.secH7113b4);
            VlblH7113b4 = (TextView) findViewById(R.id.VlblH7113b4);
            chkH7113b4 = (CheckBox) findViewById(R.id.chkH7113b4);
            secH7113c = (LinearLayout) findViewById(R.id.secH7113c);
            VlblH7113c = (TextView) findViewById(R.id.VlblH7113c);
            spnH7113c = (Spinner) findViewById(R.id.spnH7113c);
            List<String> listH7113c = new ArrayList<String>();

            listH7113c.add("");
            listH7113c.add("1-হ্যা");
            listH7113c.add("0-না");
            ArrayAdapter<String> adptrH7113c = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH7113c);
            spnH7113c.setAdapter(adptrH7113c);

            secH7114a = (LinearLayout) findViewById(R.id.secH7114a);
            VlblH7114a = (TextView) findViewById(R.id.VlblH7114a);
            rdogrpH7114a = (RadioGroup) findViewById(R.id.rdogrpH7114a);

            rdoH7114a1 = (RadioButton) findViewById(R.id.rdoH7114a1);
            rdoH7114a2 = (RadioButton) findViewById(R.id.rdoH7114a2);
            rdogrpH7114a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH7114a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH7114a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH7114a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH7114a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH7114b1.setVisibility(View.GONE);
                        chkH7114b1.setChecked(false);
                        secH7114b2.setVisibility(View.GONE);
                        txtH7114b2.setText("");
                        secH7114b3.setVisibility(View.GONE);
                        chkH7114b3.setChecked(false);
                        secH7114b4.setVisibility(View.GONE);
                        chkH7114b4.setChecked(false);
                        secH7114c.setVisibility(View.GONE);
                        rdogrpH7114c.clearCheck();
                    } else {
                        secH7114b1.setVisibility(View.VISIBLE);
                        secH7114b2.setVisibility(View.VISIBLE);
                        secH7114b3.setVisibility(View.VISIBLE);
                        secH7114b4.setVisibility(View.VISIBLE);
                        secH7114c.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH7114b1 = (LinearLayout) findViewById(R.id.secH7114b1);
            VlblH7114b1 = (TextView) findViewById(R.id.VlblH7114b1);
            chkH7114b1 = (CheckBox) findViewById(R.id.chkH7114b1);
            secH7114b2 = (LinearLayout) findViewById(R.id.secH7114b2);
            VlblH7114b2 = (TextView) findViewById(R.id.VlblH7114b2);
            txtH7114b2 = (EditText) findViewById(R.id.txtH7114b2);
            secH7114b3 = (LinearLayout) findViewById(R.id.secH7114b3);
            VlblH7114b3 = (TextView) findViewById(R.id.VlblH7114b3);
            chkH7114b3 = (CheckBox) findViewById(R.id.chkH7114b3);
            secH7114b4 = (LinearLayout) findViewById(R.id.secH7114b4);
            VlblH7114b4 = (TextView) findViewById(R.id.VlblH7114b4);
            chkH7114b4 = (CheckBox) findViewById(R.id.chkH7114b4);
            secH7114c = (LinearLayout) findViewById(R.id.secH7114c);
            VlblH7114c = (TextView) findViewById(R.id.VlblH7114c);
            rdogrpH7114c = (RadioGroup) findViewById(R.id.rdogrpH7114c);

            rdoH7114c1 = (RadioButton) findViewById(R.id.rdoH7114c1);
            rdoH7114c2 = (RadioButton) findViewById(R.id.rdoH7114c2);
            secH712a = (LinearLayout) findViewById(R.id.secH712a);
            VlblH712a = (TextView) findViewById(R.id.VlblH712a);
            rdogrpH712a = (RadioGroup) findViewById(R.id.rdogrpH712a);

            rdoH712a1 = (RadioButton) findViewById(R.id.rdoH712a1);
            rdoH712a2 = (RadioButton) findViewById(R.id.rdoH712a2);
            rdogrpH712a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH712a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH712a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH712a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH712a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH712b1.setVisibility(View.GONE);
                        chkH712b1.setChecked(false);
                        secH712b2.setVisibility(View.GONE);
                        chkH712b2.setChecked(false);
                        secH712b3.setVisibility(View.GONE);
                        chkH712b3.setChecked(false);
                        secH712b4.setVisibility(View.GONE);
                        chkH712b4.setChecked(false);
                        secH712c.setVisibility(View.GONE);
                        rdogrpH712c.clearCheck();
                    } else {
                        secH712b1.setVisibility(View.VISIBLE);
                        secH712b2.setVisibility(View.VISIBLE);
                        secH712b3.setVisibility(View.VISIBLE);
                        secH712b4.setVisibility(View.VISIBLE);
                        secH712c.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH712b1 = (LinearLayout) findViewById(R.id.secH712b1);
            VlblH712b1 = (TextView) findViewById(R.id.VlblH712b1);
            chkH712b1 = (CheckBox) findViewById(R.id.chkH712b1);
            secH712b2 = (LinearLayout) findViewById(R.id.secH712b2);
            VlblH712b2 = (TextView) findViewById(R.id.VlblH712b2);
            chkH712b2 = (CheckBox) findViewById(R.id.chkH712b2);
            secH712b3 = (LinearLayout) findViewById(R.id.secH712b3);
            VlblH712b3 = (TextView) findViewById(R.id.VlblH712b3);
            chkH712b3 = (CheckBox) findViewById(R.id.chkH712b3);
            secH712b4 = (LinearLayout) findViewById(R.id.secH712b4);
            VlblH712b4 = (TextView) findViewById(R.id.VlblH712b4);
            chkH712b4 = (CheckBox) findViewById(R.id.chkH712b4);
            secH712c = (LinearLayout) findViewById(R.id.secH712c);
            VlblH712c = (TextView) findViewById(R.id.VlblH712c);
            rdogrpH712c = (RadioGroup) findViewById(R.id.rdogrpH712c);

            rdoH712c1 = (RadioButton) findViewById(R.id.rdoH712c1);
            rdoH712c2 = (RadioButton) findViewById(R.id.rdoH712c2);
            secH713a = (LinearLayout) findViewById(R.id.secH713a);
            VlblH713a = (TextView) findViewById(R.id.VlblH713a);
            rdogrpH713a = (RadioGroup) findViewById(R.id.rdogrpH713a);

            rdoH713a1 = (RadioButton) findViewById(R.id.rdoH713a1);
            rdoH713a2 = (RadioButton) findViewById(R.id.rdoH713a2);
            rdogrpH713a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH713a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH713a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH713a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH713a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH713b1.setVisibility(View.GONE);
                        chkH713b1.setChecked(false);
                        secH713b2.setVisibility(View.GONE);
                        chkH713b2.setChecked(false);
                        secH713b3.setVisibility(View.GONE);
                        chkH713b3.setChecked(false);
                        secH713b4.setVisibility(View.GONE);
                        chkH713b4.setChecked(false);
                        secH713c.setVisibility(View.GONE);
                        rdogrpH713c.clearCheck();
                    } else {
                        secH713b1.setVisibility(View.VISIBLE);
                        secH713b2.setVisibility(View.VISIBLE);
                        secH713b3.setVisibility(View.VISIBLE);
                        secH713b4.setVisibility(View.VISIBLE);
                        secH713c.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH713b1 = (LinearLayout) findViewById(R.id.secH713b1);
            VlblH713b1 = (TextView) findViewById(R.id.VlblH713b1);
            chkH713b1 = (CheckBox) findViewById(R.id.chkH713b1);
            secH713b2 = (LinearLayout) findViewById(R.id.secH713b2);
            VlblH713b2 = (TextView) findViewById(R.id.VlblH713b2);
            chkH713b2 = (CheckBox) findViewById(R.id.chkH713b2);
            secH713b3 = (LinearLayout) findViewById(R.id.secH713b3);
            VlblH713b3 = (TextView) findViewById(R.id.VlblH713b3);
            chkH713b3 = (CheckBox) findViewById(R.id.chkH713b3);
            secH713b4 = (LinearLayout) findViewById(R.id.secH713b4);
            VlblH713b4 = (TextView) findViewById(R.id.VlblH713b4);
            chkH713b4 = (CheckBox) findViewById(R.id.chkH713b4);
            secH713c = (LinearLayout) findViewById(R.id.secH713c);
            VlblH713c = (TextView) findViewById(R.id.VlblH713c);
            rdogrpH713c = (RadioGroup) findViewById(R.id.rdogrpH713c);

            rdoH713c1 = (RadioButton) findViewById(R.id.rdoH713c1);
            rdoH713c2 = (RadioButton) findViewById(R.id.rdoH713c2);
            secH714a = (LinearLayout) findViewById(R.id.secH714a);
            VlblH714a = (TextView) findViewById(R.id.VlblH714a);
            rdogrpH714a = (RadioGroup) findViewById(R.id.rdogrpH714a);

            rdoH714a1 = (RadioButton) findViewById(R.id.rdoH714a1);
            rdoH714a2 = (RadioButton) findViewById(R.id.rdoH714a2);
            rdogrpH714a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH714a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH714a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH714a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH714a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH714b1.setVisibility(View.GONE);
                        chkH714b1.setChecked(false);
                        secH714b2.setVisibility(View.GONE);
                        chkH714b2.setChecked(false);
                        secH714b3.setVisibility(View.GONE);
                        chkH714b3.setChecked(false);
                        secH714b4.setVisibility(View.GONE);
                        chkH714b4.setChecked(false);
                        secH714c.setVisibility(View.GONE);
                        rdogrpH714c.clearCheck();
                    } else {
                        secH714b1.setVisibility(View.VISIBLE);
                        secH714b2.setVisibility(View.VISIBLE);
                        secH714b3.setVisibility(View.VISIBLE);
                        secH714b4.setVisibility(View.VISIBLE);
                        secH714c.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH714b1 = (LinearLayout) findViewById(R.id.secH714b1);
            VlblH714b1 = (TextView) findViewById(R.id.VlblH714b1);
            chkH714b1 = (CheckBox) findViewById(R.id.chkH714b1);
            secH714b2 = (LinearLayout) findViewById(R.id.secH714b2);
            VlblH714b2 = (TextView) findViewById(R.id.VlblH714b2);
            chkH714b2 = (CheckBox) findViewById(R.id.chkH714b2);
            secH714b3 = (LinearLayout) findViewById(R.id.secH714b3);
            VlblH714b3 = (TextView) findViewById(R.id.VlblH714b3);
            chkH714b3 = (CheckBox) findViewById(R.id.chkH714b3);
            secH714b4 = (LinearLayout) findViewById(R.id.secH714b4);
            VlblH714b4 = (TextView) findViewById(R.id.VlblH714b4);
            chkH714b4 = (CheckBox) findViewById(R.id.chkH714b4);
            secH714c = (LinearLayout) findViewById(R.id.secH714c);
            VlblH714c = (TextView) findViewById(R.id.VlblH714c);
            rdogrpH714c = (RadioGroup) findViewById(R.id.rdogrpH714c);

            rdoH714c1 = (RadioButton) findViewById(R.id.rdoH714c1);
            rdoH714c2 = (RadioButton) findViewById(R.id.rdoH714c2);
            secH715a = (LinearLayout) findViewById(R.id.secH715a);
            VlblH715a = (TextView) findViewById(R.id.VlblH715a);
            rdogrpH715a = (RadioGroup) findViewById(R.id.rdogrpH715a);

            rdoH715a1 = (RadioButton) findViewById(R.id.rdoH715a1);
            rdoH715a2 = (RadioButton) findViewById(R.id.rdoH715a2);
            rdogrpH715a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH715a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH715a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH715a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH715a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH715b1.setVisibility(View.GONE);
                        chkH715b1.setChecked(false);
                        secH715b2.setVisibility(View.GONE);
                        chkH715b2.setChecked(false);
                        secH715b3.setVisibility(View.GONE);
                        chkH715b3.setChecked(false);
                        secH715b4.setVisibility(View.GONE);
                        chkH715b4.setChecked(false);
                        secH715c.setVisibility(View.GONE);
                        rdogrpH715c.clearCheck();
                    } else {
                        secH715b1.setVisibility(View.VISIBLE);
                        secH715b2.setVisibility(View.VISIBLE);
                        secH715b3.setVisibility(View.VISIBLE);
                        secH715b4.setVisibility(View.VISIBLE);
                        secH715c.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH715b1 = (LinearLayout) findViewById(R.id.secH715b1);
            VlblH715b1 = (TextView) findViewById(R.id.VlblH715b1);
            chkH715b1 = (CheckBox) findViewById(R.id.chkH715b1);
            secH715b2 = (LinearLayout) findViewById(R.id.secH715b2);
            VlblH715b2 = (TextView) findViewById(R.id.VlblH715b2);
            chkH715b2 = (CheckBox) findViewById(R.id.chkH715b2);
            secH715b3 = (LinearLayout) findViewById(R.id.secH715b3);
            VlblH715b3 = (TextView) findViewById(R.id.VlblH715b3);
            chkH715b3 = (CheckBox) findViewById(R.id.chkH715b3);
            secH715b4 = (LinearLayout) findViewById(R.id.secH715b4);
            VlblH715b4 = (TextView) findViewById(R.id.VlblH715b4);
            chkH715b4 = (CheckBox) findViewById(R.id.chkH715b4);
            secH715c = (LinearLayout) findViewById(R.id.secH715c);
            VlblH715c = (TextView) findViewById(R.id.VlblH715c);
            rdogrpH715c = (RadioGroup) findViewById(R.id.rdogrpH715c);

            rdoH715c1 = (RadioButton) findViewById(R.id.rdoH715c1);
            rdoH715c2 = (RadioButton) findViewById(R.id.rdoH715c2);
            secH716a = (LinearLayout) findViewById(R.id.secH716a);
            VlblH716a = (TextView) findViewById(R.id.VlblH716a);
            rdogrpH716a = (RadioGroup) findViewById(R.id.rdogrpH716a);

            rdoH716a1 = (RadioButton) findViewById(R.id.rdoH716a1);
            rdoH716a2 = (RadioButton) findViewById(R.id.rdoH716a2);
            rdogrpH716a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH716a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH716a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH716a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH716a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH716b1.setVisibility(View.GONE);
                        chkH716b1.setChecked(false);
                        secH716b2.setVisibility(View.GONE);
                        chkH716b2.setChecked(false);
                        secH716b3.setVisibility(View.GONE);
                        chkH716b3.setChecked(false);
                        secH716b4.setVisibility(View.GONE);
                        chkH716b4.setChecked(false);
                        secH716c.setVisibility(View.GONE);
                        rdogrpH716c.clearCheck();
                    } else {
                        secH716b1.setVisibility(View.VISIBLE);
                        secH716b2.setVisibility(View.VISIBLE);
                        secH716b3.setVisibility(View.VISIBLE);
                        secH716b4.setVisibility(View.VISIBLE);
                        secH716c.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH716b1 = (LinearLayout) findViewById(R.id.secH716b1);
            VlblH716b1 = (TextView) findViewById(R.id.VlblH716b1);
            chkH716b1 = (CheckBox) findViewById(R.id.chkH716b1);
            secH716b2 = (LinearLayout) findViewById(R.id.secH716b2);
            VlblH716b2 = (TextView) findViewById(R.id.VlblH716b2);
            chkH716b2 = (CheckBox) findViewById(R.id.chkH716b2);
            secH716b3 = (LinearLayout) findViewById(R.id.secH716b3);
            VlblH716b3 = (TextView) findViewById(R.id.VlblH716b3);
            chkH716b3 = (CheckBox) findViewById(R.id.chkH716b3);
            secH716b4 = (LinearLayout) findViewById(R.id.secH716b4);
            VlblH716b4 = (TextView) findViewById(R.id.VlblH716b4);
            chkH716b4 = (CheckBox) findViewById(R.id.chkH716b4);
            secH716c = (LinearLayout) findViewById(R.id.secH716c);
            VlblH716c = (TextView) findViewById(R.id.VlblH716c);
            rdogrpH716c = (RadioGroup) findViewById(R.id.rdogrpH716c);

            rdoH716c1 = (RadioButton) findViewById(R.id.rdoH716c1);
            rdoH716c2 = (RadioButton) findViewById(R.id.rdoH716c2);
            secH717a = (LinearLayout) findViewById(R.id.secH717a);
            VlblH717a = (TextView) findViewById(R.id.VlblH717a);
            rdogrpH717a = (RadioGroup) findViewById(R.id.rdogrpH717a);

            rdoH717a1 = (RadioButton) findViewById(R.id.rdoH717a1);
            rdoH717a2 = (RadioButton) findViewById(R.id.rdoH717a2);
            rdogrpH717a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH717a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH717a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH717a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH717a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH717b1.setVisibility(View.GONE);
                        chkH717b1.setChecked(false);
                        secH717b2.setVisibility(View.GONE);
                        chkH717b2.setChecked(false);
                        secH717b3.setVisibility(View.GONE);
                        chkH717b3.setChecked(false);
                        secH717b4.setVisibility(View.GONE);
                        chkH717b4.setChecked(false);
                    } else {
                        secH717b1.setVisibility(View.VISIBLE);
                        secH717b2.setVisibility(View.VISIBLE);
                        secH717b3.setVisibility(View.VISIBLE);
                        secH717b4.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH717b1 = (LinearLayout) findViewById(R.id.secH717b1);
            VlblH717b1 = (TextView) findViewById(R.id.VlblH717b1);
            chkH717b1 = (CheckBox) findViewById(R.id.chkH717b1);
            secH717b2 = (LinearLayout) findViewById(R.id.secH717b2);
            VlblH717b2 = (TextView) findViewById(R.id.VlblH717b2);
            chkH717b2 = (CheckBox) findViewById(R.id.chkH717b2);
            secH717b3 = (LinearLayout) findViewById(R.id.secH717b3);
            VlblH717b3 = (TextView) findViewById(R.id.VlblH717b3);
            chkH717b3 = (CheckBox) findViewById(R.id.chkH717b3);
            secH717b4 = (LinearLayout) findViewById(R.id.secH717b4);
            VlblH717b4 = (TextView) findViewById(R.id.VlblH717b4);
            chkH717b4 = (CheckBox) findViewById(R.id.chkH717b4);
            secH717c = (LinearLayout) findViewById(R.id.secH717c);
            VlblH717c = (TextView) findViewById(R.id.VlblH717c);
            rdogrpH717c = (RadioGroup) findViewById(R.id.rdogrpH717c);

            rdoH717c1 = (RadioButton) findViewById(R.id.rdoH717c1);
            rdoH717c2 = (RadioButton) findViewById(R.id.rdoH717c2);


            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(HDDS.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(HDDS.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(HDDS.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(HDDS.this, "Required field: উপকারভোগী/সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (!rdoH71a1.isChecked() & !rdoH71a2.isChecked() & secH71a.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (শ্বেতসার/সিরিয়াল).");
                rdoH71a1.requestFocus();
                return;
            } else if (!rdoH71c1.isChecked() & !rdoH71c2.isChecked() & secH71c.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (বিগত 7 দিনে এই খাবার সমূহ খাওয়া হয়েছিল).");
                rdoH71c1.requestFocus();
                return;
            } else if (!rdoH72a1.isChecked() & !rdoH72a2.isChecked() & secH72a.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (সাদা শেকড় বা কন্দ ).");
                rdoH72a1.requestFocus();
                return;
            } else if (!rdoH72c1.isChecked() & !rdoH72c2.isChecked() & secH72c.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (বিগত 7 দিনে এই খাবার সমূহ খাওয়া হয়েছিল).");
                rdoH72c1.requestFocus();
                return;
            } else if (!rdoH73a1.isChecked() & !rdoH73a2.isChecked() & secH73a.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (ভিটামিন-এ সমৃদ্ধ সবজি এবং কন্দ).");
                rdoH73a1.requestFocus();
                return;
            } else if (!rdoH73c1.isChecked() & !rdoH73c2.isChecked() & secH73c.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (বিগত 7 দিনে এই খাবার সমূহ খাওয়া হয়েছিল).");
                rdoH73c1.requestFocus();
                return;
            } else if (!rdoH74a1.isChecked() & !rdoH74a2.isChecked() & secH74a.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (গাঢ় সবুজ শাক).");
                rdoH74a1.requestFocus();
                return;
            } else if (!rdoH74c1.isChecked() & !rdoH74c2.isChecked() & secH74c.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (বিগত 7 দিনে এই খাবার সমূহ খাওয়া হয়েছিল).");
                rdoH74c1.requestFocus();
                return;
            } else if (!rdoH75a1.isChecked() & !rdoH75a2.isChecked() & secH75a.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (অন্যান্য সবজি).");
                rdoH75a1.requestFocus();
                return;
            } else if (!rdoH75c1.isChecked() & !rdoH75c2.isChecked() & secH75c.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (বিগত 7 দিনে এই খাবার সমূহ খাওয়া হয়েছিল).");
                rdoH75c1.requestFocus();
                return;
            } else if (!rdoH76a1.isChecked() & !rdoH76a2.isChecked() & secH76a.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (ভিটামিন এ সমৃদ্ধ ফল  পাকা আম, পাকা পেঁপে).");
                rdoH76a1.requestFocus();
                return;
            } else if (!rdoH76c1.isChecked() & !rdoH76c2.isChecked() & secH76c.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (বিগত 7 দিনে এই খাবার সমূহ খাওয়া হয়েছিল).");
                rdoH76c1.requestFocus();
                return;
            } else if (!rdoH77a1.isChecked() & !rdoH77a2.isChecked() & secH77a.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (বন্য ফলসহ অনান্য ফল, এবং তাদের 100% ফলের রস).");
                rdoH77a1.requestFocus();
                return;
            } else if (!rdoH77c1.isChecked() & !rdoH77c2.isChecked() & secH77c.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (বিগত 7 দিনে এই খাবার সমূহ খাওয়া হয়েছিল ).");
                rdoH77c1.requestFocus();
                return;
            } else if (!rdoH78a1.isChecked() & !rdoH78a2.isChecked() & secH78a.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (অঙ্গ জাতীয় মাংশ  লিভার, কিডনি, হার্ট এবং অন্যান্য অঙ্গের মাংস ).");
                rdoH78a1.requestFocus();
                return;
            } else if (!rdoH78c1.isChecked() & !rdoH78c2.isChecked() & secH78c.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (বিগত 7 দিনে এই খাবার সমূহ খাওয়া হয়েছিল ).");
                rdoH78c1.requestFocus();
                return;
            } else if (!rdoH79a1.isChecked() & !rdoH79a2.isChecked() & secH79a.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (প্রাণী দেহের মাংস গরুর মাংস, শুয়োরের মাংস, ভেড়ার মাংস, ছাগল, খরগোশ, খেলা, মুরগি, হাঁস ).");
                rdoH79a1.requestFocus();
                return;
            } else if (!rdoH79c1.isChecked() & !rdoH79c2.isChecked() & secH79c.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (বিগত 7 দিনে এই খবর সমূহ খাওয়া হয়েছিল).");
                rdoH79c1.requestFocus();
                return;
            } else if (!rdoH710a1.isChecked() & !rdoH710a2.isChecked() & secH710a.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (ডিম  মুরগি, হাঁস, কোয়েল ).");
                rdoH710a1.requestFocus();
                return;
            } else if (!rdoH710c1.isChecked() & !rdoH710c2.isChecked() & secH710c.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (বিগত 7 দিনে এই খবর সমূহ খাওয়া হয়েছিল).");
                rdoH710c1.requestFocus();
                return;
            } else if (!rdoH7111a1.isChecked() & !rdoH7111a2.isChecked() & secH7111a.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (মাছ  সামুদ্রিকমাছসহ তাজা ছোট মাছ).");
                rdoH7111a1.requestFocus();
                return;
            } else if (!rdoH7111c11.isChecked() & !rdoH7111c12.isChecked() & secH7111c1.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (বিগত 7 দিনে এই খবর সমূহ খাওয়া হয়েছিল).");
                rdoH7111c11.requestFocus();
                return;
            } else if (!rdoH7112a1.isChecked() & !rdoH7112a2.isChecked() & secH7112a.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (মাছ সামুদ্রিকমাছসহ   তাজা মাঝারি ও বৃহৎ মাছ).");
                rdoH7112a1.requestFocus();
                return;
            } else if (!rdoH7112c1.isChecked() & !rdoH7112c2.isChecked() & secH7112c.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (বিগত 7 দিনে এই খবর সমূহ খাওয়া হয়েছিল).");
                rdoH7112c1.requestFocus();
                return;
            } else if (!rdoH7113a1.isChecked() & !rdoH7113a2.isChecked() & secH7113a.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (শুঁটকিমাছ).");
                rdoH7113a1.requestFocus();
                return;
            } else if (spnH7113c.getSelectedItemPosition() == 0 & secH7113c.isShown()) {
                Connection.MessageBox(HDDS.this, "Required field: বিগত 7 দিনে এই খবর সমূহ খাওয়া হয়েছিল.");
                spnH7113c.requestFocus();
                return;
            } else if (!rdoH7114a1.isChecked() & !rdoH7114a2.isChecked() & secH7114a.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (খোলশওয়ালা মাছ ).");
                rdoH7114a1.requestFocus();
                return;
            } else if (txtH7114b2.getText().toString().length() == 0 & secH7114b2.isShown()) {
                Connection.MessageBox(HDDS.this, "Required field: 2-ওয়াইল্ডক্যাচ / সংগৃহীত.");
                txtH7114b2.requestFocus();
                return;
            } else if (!rdoH7114c1.isChecked() & !rdoH7114c2.isChecked() & secH7114c.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (বিগত 7 দিনে এই খবর সমূহ খাওয়া হয়েছিল).");
                rdoH7114c1.requestFocus();
                return;
            } else if (!rdoH712a1.isChecked() & !rdoH712a2.isChecked() & secH712a.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (শিম জাতীয়  শুকনো মটর শুটি, শুকনো ডাল, গম, মসুরি, বাদাম, বীজ ).");
                rdoH712a1.requestFocus();
                return;
            } else if (!rdoH712c1.isChecked() & !rdoH712c2.isChecked() & secH712c.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (বিগত 7 দিনে এই খবর সমূহ খাওয়া হয়েছিল).");
                rdoH712c1.requestFocus();
                return;
            } else if (!rdoH713a1.isChecked() & !rdoH713a2.isChecked() & secH713a.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (দুগ্ধজাত খাদ্য দুধ, পনির, দই বা অন্যান্য   ).");
                rdoH713a1.requestFocus();
                return;
            } else if (!rdoH713c1.isChecked() & !rdoH713c2.isChecked() & secH713c.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (বিগত 7 দিনে এই খবর সমূহ খাওয়া হয়েছিল).");
                rdoH713c1.requestFocus();
                return;
            } else if (!rdoH714a1.isChecked() & !rdoH714a2.isChecked() & secH714a.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (তেল এবং চর্বি  খাবারে যোগ করা বা রান্নার জন্য তেল, চর্বি বা মাখন খাদ্য যোগ).");
                rdoH714a1.requestFocus();
                return;
            } else if (!rdoH714c1.isChecked() & !rdoH714c2.isChecked() & secH714c.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (বিগত 7 দিনে এই খবর সমূহ খাওয়া হয়েছিল).");
                rdoH714c1.requestFocus();
                return;
            } else if (!rdoH715a1.isChecked() & !rdoH715a2.isChecked() & secH715a.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (মিষ্টান্ন্য  চিনি, মধু, মিষ্টি যুক্ত সোডা বা মিষ্টি যুক্ত রসের পানীয়).");
                rdoH715a1.requestFocus();
                return;
            } else if (!rdoH715c1.isChecked() & !rdoH715c2.isChecked() & secH715c.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (বিগত 7 দিনে এই খবর সমূহ খাওয়া হয়েছিল).");
                rdoH715c1.requestFocus();
                return;
            } else if (!rdoH716a1.isChecked() & !rdoH716a2.isChecked() & secH716a.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (মশলা (কালো মরিচ, লবণ), আচার/সস জাতিও খাবার).");
                rdoH716a1.requestFocus();
                return;
            } else if (!rdoH716c1.isChecked() & !rdoH716c2.isChecked() & secH716c.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (বিগত 7 দিনে এই খবর সমূহ খাওয়া হয়েছিল).");
                rdoH716c1.requestFocus();
                return;
            } else if (!rdoH717a1.isChecked() & !rdoH717a2.isChecked() & secH717a.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (বিবিধ  চা, বোতল জাত জুস, কোল্ড ড্রিংস,কফি).");
                rdoH717a1.requestFocus();
                return;
            } else if (!rdoH717c1.isChecked() & !rdoH717c2.isChecked() & secH717c.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (বিগত 7 দিনে এই খবর সমূহ খাওয়া হয়েছিল).");
                rdoH717c1.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            HDDS_DataModel objSave = new HDDS_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            String[] d_rdogrpH71a = new String[]{"1", "0"};
            objSave.setH71a("");
            for (int i = 0; i < rdogrpH71a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH71a.getChildAt(i);
                if (rb.isChecked()) objSave.setH71a(d_rdogrpH71a[i]);
            }

            objSave.setH71b1((chkH71b1.isChecked() ? "1" : "2"));
            objSave.setH71b2((chkH71b2.isChecked() ? "1" : "2"));
            objSave.setH71b3((chkH71b3.isChecked() ? "1" : "2"));
            objSave.setH71b4((chkH71b4.isChecked() ? "1" : "2"));
            String[] d_rdogrpH71c = new String[]{"1", "0"};
            objSave.setH71c("");
            for (int i = 0; i < rdogrpH71c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH71c.getChildAt(i);
                if (rb.isChecked()) objSave.setH71c(d_rdogrpH71c[i]);
            }

            String[] d_rdogrpH72a = new String[]{"1", "0"};
            objSave.setH72a("");
            for (int i = 0; i < rdogrpH72a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH72a.getChildAt(i);
                if (rb.isChecked()) objSave.setH72a(d_rdogrpH72a[i]);
            }

            objSave.setH72b1((chkH72b1.isChecked() ? "1" : "2"));
            objSave.setH72b2((chkH72b2.isChecked() ? "1" : "2"));
            objSave.setH72b3((chkH72b3.isChecked() ? "1" : "2"));
            objSave.setH72b4((chkH72b4.isChecked() ? "1" : "2"));
            String[] d_rdogrpH72c = new String[]{"1", "0"};
            objSave.setH72c("");
            for (int i = 0; i < rdogrpH72c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH72c.getChildAt(i);
                if (rb.isChecked()) objSave.setH72c(d_rdogrpH72c[i]);
            }

            String[] d_rdogrpH73a = new String[]{"1", "0"};
            objSave.setH73a("");
            for (int i = 0; i < rdogrpH73a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH73a.getChildAt(i);
                if (rb.isChecked()) objSave.setH73a(d_rdogrpH73a[i]);
            }

            objSave.setH73b1((chkH73b1.isChecked() ? "1" : "2"));
            objSave.setH73b2((chkH73b2.isChecked() ? "1" : "2"));
            objSave.setH73b3((chkH73b3.isChecked() ? "1" : "2"));
            objSave.setH73b4((chkH73b4.isChecked() ? "1" : "2"));
            String[] d_rdogrpH73c = new String[]{"1", "0"};
            objSave.setH73c("");
            for (int i = 0; i < rdogrpH73c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH73c.getChildAt(i);
                if (rb.isChecked()) objSave.setH73c(d_rdogrpH73c[i]);
            }

            String[] d_rdogrpH74a = new String[]{"1", "0"};
            objSave.setH74a("");
            for (int i = 0; i < rdogrpH74a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH74a.getChildAt(i);
                if (rb.isChecked()) objSave.setH74a(d_rdogrpH74a[i]);
            }

            objSave.setH74b1((chkH74b1.isChecked() ? "1" : "2"));
            objSave.setH74b2((chkH74b2.isChecked() ? "1" : "2"));
            objSave.setH74b3((chkH74b3.isChecked() ? "1" : "2"));
            objSave.setH74b4((chkH74b4.isChecked() ? "1" : "2"));
            String[] d_rdogrpH74c = new String[]{"1", "0"};
            objSave.setH74c("");
            for (int i = 0; i < rdogrpH74c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH74c.getChildAt(i);
                if (rb.isChecked()) objSave.setH74c(d_rdogrpH74c[i]);
            }

            String[] d_rdogrpH75a = new String[]{"1", "0"};
            objSave.setH75a("");
            for (int i = 0; i < rdogrpH75a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH75a.getChildAt(i);
                if (rb.isChecked()) objSave.setH75a(d_rdogrpH75a[i]);
            }

            objSave.setH75b1((chkH75b1.isChecked() ? "1" : "2"));
            objSave.setH75b2((chkH75b2.isChecked() ? "1" : "2"));
            objSave.setH75b3((chkH75b3.isChecked() ? "1" : "2"));
            objSave.setH75b4((chkH75b4.isChecked() ? "1" : "2"));
            String[] d_rdogrpH75c = new String[]{"1", "0"};
            objSave.setH75c("");
            for (int i = 0; i < rdogrpH75c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH75c.getChildAt(i);
                if (rb.isChecked()) objSave.setH75c(d_rdogrpH75c[i]);
            }

            String[] d_rdogrpH76a = new String[]{"1", "0"};
            objSave.setH76a("");
            for (int i = 0; i < rdogrpH76a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH76a.getChildAt(i);
                if (rb.isChecked()) objSave.setH76a(d_rdogrpH76a[i]);
            }

            objSave.setH76b1((chkH76b1.isChecked() ? "1" : "2"));
            objSave.setH76b2((chkH76b2.isChecked() ? "1" : "2"));
            objSave.setH76b3((chkH76b3.isChecked() ? "1" : "2"));
            objSave.setH76b4((chkH76b4.isChecked() ? "1" : "2"));
            String[] d_rdogrpH76c = new String[]{"1", "0"};
            objSave.setH76c("");
            for (int i = 0; i < rdogrpH76c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH76c.getChildAt(i);
                if (rb.isChecked()) objSave.setH76c(d_rdogrpH76c[i]);
            }

            String[] d_rdogrpH77a = new String[]{"1", "0"};
            objSave.setH77a("");
            for (int i = 0; i < rdogrpH77a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH77a.getChildAt(i);
                if (rb.isChecked()) objSave.setH77a(d_rdogrpH77a[i]);
            }

            objSave.setH77b1((chkH77b1.isChecked() ? "1" : "2"));
            objSave.setH77b2((chkH77b2.isChecked() ? "1" : "2"));
            objSave.setH77b3((chkH77b3.isChecked() ? "1" : "2"));
            objSave.setH77b4((chkH77b4.isChecked() ? "1" : "2"));
            String[] d_rdogrpH77c = new String[]{"1", "0"};
            objSave.setH77c("");
            for (int i = 0; i < rdogrpH77c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH77c.getChildAt(i);
                if (rb.isChecked()) objSave.setH77c(d_rdogrpH77c[i]);
            }

            String[] d_rdogrpH78a = new String[]{"1", "0"};
            objSave.setH78a("");
            for (int i = 0; i < rdogrpH78a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH78a.getChildAt(i);
                if (rb.isChecked()) objSave.setH78a(d_rdogrpH78a[i]);
            }

            objSave.setH78b1((chkH78b1.isChecked() ? "1" : "2"));
            objSave.setH78b2((chkH78b2.isChecked() ? "1" : "2"));
            objSave.setH78b3((chkH78b3.isChecked() ? "1" : "2"));
            objSave.setH78b4((chkH78b4.isChecked() ? "1" : "2"));
            String[] d_rdogrpH78c = new String[]{"1", "0"};
            objSave.setH78c("");
            for (int i = 0; i < rdogrpH78c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH78c.getChildAt(i);
                if (rb.isChecked()) objSave.setH78c(d_rdogrpH78c[i]);
            }

            String[] d_rdogrpH79a = new String[]{"1", "0"};
            objSave.setH79a("");
            for (int i = 0; i < rdogrpH79a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH79a.getChildAt(i);
                if (rb.isChecked()) objSave.setH79a(d_rdogrpH79a[i]);
            }

            objSave.setH79b1((chkH79b1.isChecked() ? "1" : "2"));
            objSave.setH79b2((chkH79b2.isChecked() ? "1" : "2"));
            objSave.setH79b3((chkH79b3.isChecked() ? "1" : "2"));
            objSave.setH79b4((chkH79b4.isChecked() ? "1" : "2"));
            String[] d_rdogrpH79c = new String[]{"1", "0"};
            objSave.setH79c("");
            for (int i = 0; i < rdogrpH79c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH79c.getChildAt(i);
                if (rb.isChecked()) objSave.setH79c(d_rdogrpH79c[i]);
            }

            String[] d_rdogrpH710a = new String[]{"1", "0"};
            objSave.setH710a("");
            for (int i = 0; i < rdogrpH710a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH710a.getChildAt(i);
                if (rb.isChecked()) objSave.setH710a(d_rdogrpH710a[i]);
            }

            objSave.setH710b1((chkH710b1.isChecked() ? "1" : "2"));
            objSave.setH710b2((chkH710b2.isChecked() ? "1" : "2"));
            objSave.setH710b3((chkH710b3.isChecked() ? "1" : "2"));
            objSave.setH710b4((chkH710b4.isChecked() ? "1" : "2"));
            String[] d_rdogrpH710c = new String[]{"1", "0"};
            objSave.setH710c("");
            for (int i = 0; i < rdogrpH710c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH710c.getChildAt(i);
                if (rb.isChecked()) objSave.setH710c(d_rdogrpH710c[i]);
            }

            String[] d_rdogrpH7111a = new String[]{"1", "0"};
            objSave.setH7111a("");
            for (int i = 0; i < rdogrpH7111a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH7111a.getChildAt(i);
                if (rb.isChecked()) objSave.setH7111a(d_rdogrpH7111a[i]);
            }

            objSave.setH7111b1((chkH7111b1.isChecked() ? "1" : "2"));
            objSave.setH7111b2((chkH7111b2.isChecked() ? "1" : "2"));
            objSave.setH7111b3((chkH7111b3.isChecked() ? "1" : "2"));
            objSave.setH7111b4((chkH7111b4.isChecked() ? "1" : "2"));
            String[] d_rdogrpH7111c1 = new String[]{"1", "0"};
            objSave.setH7111c1("");
            for (int i = 0; i < rdogrpH7111c1.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH7111c1.getChildAt(i);
                if (rb.isChecked()) objSave.setH7111c1(d_rdogrpH7111c1[i]);
            }

            String[] d_rdogrpH7112a = new String[]{"1", "0"};
            objSave.setH7112a("");
            for (int i = 0; i < rdogrpH7112a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH7112a.getChildAt(i);
                if (rb.isChecked()) objSave.setH7112a(d_rdogrpH7112a[i]);
            }

            objSave.setH7112b1((chkH7112b1.isChecked() ? "1" : "2"));
            objSave.setH7112b2((chkH7112b2.isChecked() ? "1" : "2"));
            objSave.setH7112b3((chkH7112b3.isChecked() ? "1" : "2"));
            objSave.setH7112b4((chkH7112b4.isChecked() ? "1" : "2"));
            String[] d_rdogrpH7112c = new String[]{"1", "0"};
            objSave.setH7112c("");
            for (int i = 0; i < rdogrpH7112c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH7112c.getChildAt(i);
                if (rb.isChecked()) objSave.setH7112c(d_rdogrpH7112c[i]);
            }

            String[] d_rdogrpH7113a = new String[]{"1", "0"};
            objSave.setH7113a("");
            for (int i = 0; i < rdogrpH7113a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH7113a.getChildAt(i);
                if (rb.isChecked()) objSave.setH7113a(d_rdogrpH7113a[i]);
            }

            objSave.setH7113b1((chkH7113b1.isChecked() ? "1" : "2"));
            objSave.setH7113b2((chkH7113b2.isChecked() ? "1" : "2"));
            objSave.setH7113b3((chkH7113b3.isChecked() ? "1" : "2"));
            objSave.setH7113b4((chkH7113b4.isChecked() ? "1" : "2"));
            objSave.setH7113c((spnH7113c.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH7113c.getSelectedItem().toString(), "-")));
            String[] d_rdogrpH7114a = new String[]{"1", "0"};
            objSave.setH7114a("");
            for (int i = 0; i < rdogrpH7114a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH7114a.getChildAt(i);
                if (rb.isChecked()) objSave.setH7114a(d_rdogrpH7114a[i]);
            }

            objSave.setH7114b1((chkH7114b1.isChecked() ? "1" : "2"));
            objSave.setH7114b2(txtH7114b2.getText().toString());
            objSave.setH7114b3((chkH7114b3.isChecked() ? "1" : "2"));
            objSave.setH7114b4((chkH7114b4.isChecked() ? "1" : "2"));
            String[] d_rdogrpH7114c = new String[]{"1", "0"};
            objSave.setH7114c("");
            for (int i = 0; i < rdogrpH7114c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH7114c.getChildAt(i);
                if (rb.isChecked()) objSave.setH7114c(d_rdogrpH7114c[i]);
            }

            String[] d_rdogrpH712a = new String[]{"1", "0"};
            objSave.setH712a("");
            for (int i = 0; i < rdogrpH712a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH712a.getChildAt(i);
                if (rb.isChecked()) objSave.setH712a(d_rdogrpH712a[i]);
            }

            objSave.setH712b1((chkH712b1.isChecked() ? "1" : "2"));
            objSave.setH712b2((chkH712b2.isChecked() ? "1" : "2"));
            objSave.setH712b3((chkH712b3.isChecked() ? "1" : "2"));
            objSave.setH712b4((chkH712b4.isChecked() ? "1" : "2"));
            String[] d_rdogrpH712c = new String[]{"1", "0"};
            objSave.setH712c("");
            for (int i = 0; i < rdogrpH712c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH712c.getChildAt(i);
                if (rb.isChecked()) objSave.setH712c(d_rdogrpH712c[i]);
            }

            String[] d_rdogrpH713a = new String[]{"1", "0"};
            objSave.setH713a("");
            for (int i = 0; i < rdogrpH713a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH713a.getChildAt(i);
                if (rb.isChecked()) objSave.setH713a(d_rdogrpH713a[i]);
            }

            objSave.setH713b1((chkH713b1.isChecked() ? "1" : "2"));
            objSave.setH713b2((chkH713b2.isChecked() ? "1" : "2"));
            objSave.setH713b3((chkH713b3.isChecked() ? "1" : "2"));
            objSave.setH713b4((chkH713b4.isChecked() ? "1" : "2"));
            String[] d_rdogrpH713c = new String[]{"1", "0"};
            objSave.setH713c("");
            for (int i = 0; i < rdogrpH713c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH713c.getChildAt(i);
                if (rb.isChecked()) objSave.setH713c(d_rdogrpH713c[i]);
            }

            String[] d_rdogrpH714a = new String[]{"1", "0"};
            objSave.setH714a("");
            for (int i = 0; i < rdogrpH714a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH714a.getChildAt(i);
                if (rb.isChecked()) objSave.setH714a(d_rdogrpH714a[i]);
            }

            objSave.setH714b1((chkH714b1.isChecked() ? "1" : "2"));
            objSave.setH714b2((chkH714b2.isChecked() ? "1" : "2"));
            objSave.setH714b3((chkH714b3.isChecked() ? "1" : "2"));
            objSave.setH714b4((chkH714b4.isChecked() ? "1" : "2"));
            String[] d_rdogrpH714c = new String[]{"1", "0"};
            objSave.setH714c("");
            for (int i = 0; i < rdogrpH714c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH714c.getChildAt(i);
                if (rb.isChecked()) objSave.setH714c(d_rdogrpH714c[i]);
            }

            String[] d_rdogrpH715a = new String[]{"1", "0"};
            objSave.setH715a("");
            for (int i = 0; i < rdogrpH715a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH715a.getChildAt(i);
                if (rb.isChecked()) objSave.setH715a(d_rdogrpH715a[i]);
            }

            objSave.setH715b1((chkH715b1.isChecked() ? "1" : "2"));
            objSave.setH715b2((chkH715b2.isChecked() ? "1" : "2"));
            objSave.setH715b3((chkH715b3.isChecked() ? "1" : "2"));
            objSave.setH715b4((chkH715b4.isChecked() ? "1" : "2"));
            String[] d_rdogrpH715c = new String[]{"1", "0"};
            objSave.setH715c("");
            for (int i = 0; i < rdogrpH715c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH715c.getChildAt(i);
                if (rb.isChecked()) objSave.setH715c(d_rdogrpH715c[i]);
            }

            String[] d_rdogrpH716a = new String[]{"1", "0"};
            objSave.setH716a("");
            for (int i = 0; i < rdogrpH716a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH716a.getChildAt(i);
                if (rb.isChecked()) objSave.setH716a(d_rdogrpH716a[i]);
            }

            objSave.setH716b1((chkH716b1.isChecked() ? "1" : "2"));
            objSave.setH716b2((chkH716b2.isChecked() ? "1" : "2"));
            objSave.setH716b3((chkH716b3.isChecked() ? "1" : "2"));
            objSave.setH716b4((chkH716b4.isChecked() ? "1" : "2"));
            String[] d_rdogrpH716c = new String[]{"1", "0"};
            objSave.setH716c("");
            for (int i = 0; i < rdogrpH716c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH716c.getChildAt(i);
                if (rb.isChecked()) objSave.setH716c(d_rdogrpH716c[i]);
            }

            String[] d_rdogrpH717a = new String[]{"1", "0"};
            objSave.setH717a("");
            for (int i = 0; i < rdogrpH717a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH717a.getChildAt(i);
                if (rb.isChecked()) objSave.setH717a(d_rdogrpH717a[i]);
            }

            objSave.setH717b1((chkH717b1.isChecked() ? "1" : "2"));
            objSave.setH717b2((chkH717b2.isChecked() ? "1" : "2"));
            objSave.setH717b3((chkH717b3.isChecked() ? "1" : "2"));
            objSave.setH717b4((chkH717b4.isChecked() ? "1" : "2"));
            String[] d_rdogrpH717c = new String[]{"1", "0"};
            objSave.setH717c("");
            for (int i = 0; i < rdogrpH717c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH717c.getChildAt(i);
                if (rb.isChecked()) objSave.setH717c(d_rdogrpH717c[i]);
            }

            objSave.setStartTime(StartTime);
            objSave.setEndTime(g.CurrentTime24());
            objSave.setUserId(g.getUserId());
            objSave.setEntryUser(g.getUserId()); //from data entry user list
            //objSave.setLat(Double.toString(currentLatitude));
            //objSave.setLon(Double.toString(currentLongitude));

            String status = objSave.SaveUpdateData(this);
            if (status.length() == 0) {
                Connection.MessageBox(HDDS.this, "Saved Successfully");
            } else {
                Connection.MessageBox(HDDS.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(HDDS.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            HDDS_DataModel d = new HDDS_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<HDDS_DataModel> data = d.SelectAll(this, SQL);
            for (HDDS_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                String[] d_rdogrpH71a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH71a.length; i++) {
                    if (item.getH71a().equals(String.valueOf(d_rdogrpH71a[i]))) {
                        rb = (RadioButton) rdogrpH71a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH71b1().equals("1")) {
                    chkH71b1.setChecked(true);
                } else if (item.getH71b1().equals("2")) {
                    chkH71b1.setChecked(false);
                }
                if (item.getH71b2().equals("1")) {
                    chkH71b2.setChecked(true);
                } else if (item.getH71b2().equals("2")) {
                    chkH71b2.setChecked(false);
                }
                if (item.getH71b3().equals("1")) {
                    chkH71b3.setChecked(true);
                } else if (item.getH71b3().equals("2")) {
                    chkH71b3.setChecked(false);
                }
                if (item.getH71b4().equals("1")) {
                    chkH71b4.setChecked(true);
                } else if (item.getH71b4().equals("2")) {
                    chkH71b4.setChecked(false);
                }
                String[] d_rdogrpH71c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH71c.length; i++) {
                    if (item.getH71c().equals(String.valueOf(d_rdogrpH71c[i]))) {
                        rb = (RadioButton) rdogrpH71c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH72a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH72a.length; i++) {
                    if (item.getH72a().equals(String.valueOf(d_rdogrpH72a[i]))) {
                        rb = (RadioButton) rdogrpH72a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH72b1().equals("1")) {
                    chkH72b1.setChecked(true);
                } else if (item.getH72b1().equals("2")) {
                    chkH72b1.setChecked(false);
                }
                if (item.getH72b2().equals("1")) {
                    chkH72b2.setChecked(true);
                } else if (item.getH72b2().equals("2")) {
                    chkH72b2.setChecked(false);
                }
                if (item.getH72b3().equals("1")) {
                    chkH72b3.setChecked(true);
                } else if (item.getH72b3().equals("2")) {
                    chkH72b3.setChecked(false);
                }
                if (item.getH72b4().equals("1")) {
                    chkH72b4.setChecked(true);
                } else if (item.getH72b4().equals("2")) {
                    chkH72b4.setChecked(false);
                }
                String[] d_rdogrpH72c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH72c.length; i++) {
                    if (item.getH72c().equals(String.valueOf(d_rdogrpH72c[i]))) {
                        rb = (RadioButton) rdogrpH72c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH73a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH73a.length; i++) {
                    if (item.getH73a().equals(String.valueOf(d_rdogrpH73a[i]))) {
                        rb = (RadioButton) rdogrpH73a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH73b1().equals("1")) {
                    chkH73b1.setChecked(true);
                } else if (item.getH73b1().equals("2")) {
                    chkH73b1.setChecked(false);
                }
                if (item.getH73b2().equals("1")) {
                    chkH73b2.setChecked(true);
                } else if (item.getH73b2().equals("2")) {
                    chkH73b2.setChecked(false);
                }
                if (item.getH73b3().equals("1")) {
                    chkH73b3.setChecked(true);
                } else if (item.getH73b3().equals("2")) {
                    chkH73b3.setChecked(false);
                }
                if (item.getH73b4().equals("1")) {
                    chkH73b4.setChecked(true);
                } else if (item.getH73b4().equals("2")) {
                    chkH73b4.setChecked(false);
                }
                String[] d_rdogrpH73c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH73c.length; i++) {
                    if (item.getH73c().equals(String.valueOf(d_rdogrpH73c[i]))) {
                        rb = (RadioButton) rdogrpH73c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH74a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH74a.length; i++) {
                    if (item.getH74a().equals(String.valueOf(d_rdogrpH74a[i]))) {
                        rb = (RadioButton) rdogrpH74a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH74b1().equals("1")) {
                    chkH74b1.setChecked(true);
                } else if (item.getH74b1().equals("2")) {
                    chkH74b1.setChecked(false);
                }
                if (item.getH74b2().equals("1")) {
                    chkH74b2.setChecked(true);
                } else if (item.getH74b2().equals("2")) {
                    chkH74b2.setChecked(false);
                }
                if (item.getH74b3().equals("1")) {
                    chkH74b3.setChecked(true);
                } else if (item.getH74b3().equals("2")) {
                    chkH74b3.setChecked(false);
                }
                if (item.getH74b4().equals("1")) {
                    chkH74b4.setChecked(true);
                } else if (item.getH74b4().equals("2")) {
                    chkH74b4.setChecked(false);
                }
                String[] d_rdogrpH74c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH74c.length; i++) {
                    if (item.getH74c().equals(String.valueOf(d_rdogrpH74c[i]))) {
                        rb = (RadioButton) rdogrpH74c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH75a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH75a.length; i++) {
                    if (item.getH75a().equals(String.valueOf(d_rdogrpH75a[i]))) {
                        rb = (RadioButton) rdogrpH75a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH75b1().equals("1")) {
                    chkH75b1.setChecked(true);
                } else if (item.getH75b1().equals("2")) {
                    chkH75b1.setChecked(false);
                }
                if (item.getH75b2().equals("1")) {
                    chkH75b2.setChecked(true);
                } else if (item.getH75b2().equals("2")) {
                    chkH75b2.setChecked(false);
                }
                if (item.getH75b3().equals("1")) {
                    chkH75b3.setChecked(true);
                } else if (item.getH75b3().equals("2")) {
                    chkH75b3.setChecked(false);
                }
                if (item.getH75b4().equals("1")) {
                    chkH75b4.setChecked(true);
                } else if (item.getH75b4().equals("2")) {
                    chkH75b4.setChecked(false);
                }
                String[] d_rdogrpH75c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH75c.length; i++) {
                    if (item.getH75c().equals(String.valueOf(d_rdogrpH75c[i]))) {
                        rb = (RadioButton) rdogrpH75c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH76a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH76a.length; i++) {
                    if (item.getH76a().equals(String.valueOf(d_rdogrpH76a[i]))) {
                        rb = (RadioButton) rdogrpH76a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH76b1().equals("1")) {
                    chkH76b1.setChecked(true);
                } else if (item.getH76b1().equals("2")) {
                    chkH76b1.setChecked(false);
                }
                if (item.getH76b2().equals("1")) {
                    chkH76b2.setChecked(true);
                } else if (item.getH76b2().equals("2")) {
                    chkH76b2.setChecked(false);
                }
                if (item.getH76b3().equals("1")) {
                    chkH76b3.setChecked(true);
                } else if (item.getH76b3().equals("2")) {
                    chkH76b3.setChecked(false);
                }
                if (item.getH76b4().equals("1")) {
                    chkH76b4.setChecked(true);
                } else if (item.getH76b4().equals("2")) {
                    chkH76b4.setChecked(false);
                }
                String[] d_rdogrpH76c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH76c.length; i++) {
                    if (item.getH76c().equals(String.valueOf(d_rdogrpH76c[i]))) {
                        rb = (RadioButton) rdogrpH76c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH77a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH77a.length; i++) {
                    if (item.getH77a().equals(String.valueOf(d_rdogrpH77a[i]))) {
                        rb = (RadioButton) rdogrpH77a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH77b1().equals("1")) {
                    chkH77b1.setChecked(true);
                } else if (item.getH77b1().equals("2")) {
                    chkH77b1.setChecked(false);
                }
                if (item.getH77b2().equals("1")) {
                    chkH77b2.setChecked(true);
                } else if (item.getH77b2().equals("2")) {
                    chkH77b2.setChecked(false);
                }
                if (item.getH77b3().equals("1")) {
                    chkH77b3.setChecked(true);
                } else if (item.getH77b3().equals("2")) {
                    chkH77b3.setChecked(false);
                }
                if (item.getH77b4().equals("1")) {
                    chkH77b4.setChecked(true);
                } else if (item.getH77b4().equals("2")) {
                    chkH77b4.setChecked(false);
                }
                String[] d_rdogrpH77c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH77c.length; i++) {
                    if (item.getH77c().equals(String.valueOf(d_rdogrpH77c[i]))) {
                        rb = (RadioButton) rdogrpH77c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH78a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH78a.length; i++) {
                    if (item.getH78a().equals(String.valueOf(d_rdogrpH78a[i]))) {
                        rb = (RadioButton) rdogrpH78a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH78b1().equals("1")) {
                    chkH78b1.setChecked(true);
                } else if (item.getH78b1().equals("2")) {
                    chkH78b1.setChecked(false);
                }
                if (item.getH78b2().equals("1")) {
                    chkH78b2.setChecked(true);
                } else if (item.getH78b2().equals("2")) {
                    chkH78b2.setChecked(false);
                }
                if (item.getH78b3().equals("1")) {
                    chkH78b3.setChecked(true);
                } else if (item.getH78b3().equals("2")) {
                    chkH78b3.setChecked(false);
                }
                if (item.getH78b4().equals("1")) {
                    chkH78b4.setChecked(true);
                } else if (item.getH78b4().equals("2")) {
                    chkH78b4.setChecked(false);
                }
                String[] d_rdogrpH78c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH78c.length; i++) {
                    if (item.getH78c().equals(String.valueOf(d_rdogrpH78c[i]))) {
                        rb = (RadioButton) rdogrpH78c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH79a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH79a.length; i++) {
                    if (item.getH79a().equals(String.valueOf(d_rdogrpH79a[i]))) {
                        rb = (RadioButton) rdogrpH79a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH79b1().equals("1")) {
                    chkH79b1.setChecked(true);
                } else if (item.getH79b1().equals("2")) {
                    chkH79b1.setChecked(false);
                }
                if (item.getH79b2().equals("1")) {
                    chkH79b2.setChecked(true);
                } else if (item.getH79b2().equals("2")) {
                    chkH79b2.setChecked(false);
                }
                if (item.getH79b3().equals("1")) {
                    chkH79b3.setChecked(true);
                } else if (item.getH79b3().equals("2")) {
                    chkH79b3.setChecked(false);
                }
                if (item.getH79b4().equals("1")) {
                    chkH79b4.setChecked(true);
                } else if (item.getH79b4().equals("2")) {
                    chkH79b4.setChecked(false);
                }
                String[] d_rdogrpH79c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH79c.length; i++) {
                    if (item.getH79c().equals(String.valueOf(d_rdogrpH79c[i]))) {
                        rb = (RadioButton) rdogrpH79c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH710a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH710a.length; i++) {
                    if (item.getH710a().equals(String.valueOf(d_rdogrpH710a[i]))) {
                        rb = (RadioButton) rdogrpH710a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH710b1().equals("1")) {
                    chkH710b1.setChecked(true);
                } else if (item.getH710b1().equals("2")) {
                    chkH710b1.setChecked(false);
                }
                if (item.getH710b2().equals("1")) {
                    chkH710b2.setChecked(true);
                } else if (item.getH710b2().equals("2")) {
                    chkH710b2.setChecked(false);
                }
                if (item.getH710b3().equals("1")) {
                    chkH710b3.setChecked(true);
                } else if (item.getH710b3().equals("2")) {
                    chkH710b3.setChecked(false);
                }
                if (item.getH710b4().equals("1")) {
                    chkH710b4.setChecked(true);
                } else if (item.getH710b4().equals("2")) {
                    chkH710b4.setChecked(false);
                }
                String[] d_rdogrpH710c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH710c.length; i++) {
                    if (item.getH710c().equals(String.valueOf(d_rdogrpH710c[i]))) {
                        rb = (RadioButton) rdogrpH710c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH7111a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH7111a.length; i++) {
                    if (item.getH7111a().equals(String.valueOf(d_rdogrpH7111a[i]))) {
                        rb = (RadioButton) rdogrpH7111a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH7111b1().equals("1")) {
                    chkH7111b1.setChecked(true);
                } else if (item.getH7111b1().equals("2")) {
                    chkH7111b1.setChecked(false);
                }
                if (item.getH7111b2().equals("1")) {
                    chkH7111b2.setChecked(true);
                } else if (item.getH7111b2().equals("2")) {
                    chkH7111b2.setChecked(false);
                }
                if (item.getH7111b3().equals("1")) {
                    chkH7111b3.setChecked(true);
                } else if (item.getH7111b3().equals("2")) {
                    chkH7111b3.setChecked(false);
                }
                if (item.getH7111b4().equals("1")) {
                    chkH7111b4.setChecked(true);
                } else if (item.getH7111b4().equals("2")) {
                    chkH7111b4.setChecked(false);
                }
                String[] d_rdogrpH7111c1 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH7111c1.length; i++) {
                    if (item.getH7111c1().equals(String.valueOf(d_rdogrpH7111c1[i]))) {
                        rb = (RadioButton) rdogrpH7111c1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH7112a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH7112a.length; i++) {
                    if (item.getH7112a().equals(String.valueOf(d_rdogrpH7112a[i]))) {
                        rb = (RadioButton) rdogrpH7112a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH7112b1().equals("1")) {
                    chkH7112b1.setChecked(true);
                } else if (item.getH7112b1().equals("2")) {
                    chkH7112b1.setChecked(false);
                }
                if (item.getH7112b2().equals("1")) {
                    chkH7112b2.setChecked(true);
                } else if (item.getH7112b2().equals("2")) {
                    chkH7112b2.setChecked(false);
                }
                if (item.getH7112b3().equals("1")) {
                    chkH7112b3.setChecked(true);
                } else if (item.getH7112b3().equals("2")) {
                    chkH7112b3.setChecked(false);
                }
                if (item.getH7112b4().equals("1")) {
                    chkH7112b4.setChecked(true);
                } else if (item.getH7112b4().equals("2")) {
                    chkH7112b4.setChecked(false);
                }
                String[] d_rdogrpH7112c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH7112c.length; i++) {
                    if (item.getH7112c().equals(String.valueOf(d_rdogrpH7112c[i]))) {
                        rb = (RadioButton) rdogrpH7112c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH7113a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH7113a.length; i++) {
                    if (item.getH7113a().equals(String.valueOf(d_rdogrpH7113a[i]))) {
                        rb = (RadioButton) rdogrpH7113a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH7113b1().equals("1")) {
                    chkH7113b1.setChecked(true);
                } else if (item.getH7113b1().equals("2")) {
                    chkH7113b1.setChecked(false);
                }
                if (item.getH7113b2().equals("1")) {
                    chkH7113b2.setChecked(true);
                } else if (item.getH7113b2().equals("2")) {
                    chkH7113b2.setChecked(false);
                }
                if (item.getH7113b3().equals("1")) {
                    chkH7113b3.setChecked(true);
                } else if (item.getH7113b3().equals("2")) {
                    chkH7113b3.setChecked(false);
                }
                if (item.getH7113b4().equals("1")) {
                    chkH7113b4.setChecked(true);
                } else if (item.getH7113b4().equals("2")) {
                    chkH7113b4.setChecked(false);
                }
                spnH7113c.setSelection(Global.SpinnerItemPositionAnyLength(spnH7113c, item.getH7113c()));
                String[] d_rdogrpH7114a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH7114a.length; i++) {
                    if (item.getH7114a().equals(String.valueOf(d_rdogrpH7114a[i]))) {
                        rb = (RadioButton) rdogrpH7114a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH7114b1().equals("1")) {
                    chkH7114b1.setChecked(true);
                } else if (item.getH7114b1().equals("2")) {
                    chkH7114b1.setChecked(false);
                }
                txtH7114b2.setText(item.getH7114b2());
                if (item.getH7114b3().equals("1")) {
                    chkH7114b3.setChecked(true);
                } else if (item.getH7114b3().equals("2")) {
                    chkH7114b3.setChecked(false);
                }
                if (item.getH7114b4().equals("1")) {
                    chkH7114b4.setChecked(true);
                } else if (item.getH7114b4().equals("2")) {
                    chkH7114b4.setChecked(false);
                }
                String[] d_rdogrpH7114c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH7114c.length; i++) {
                    if (item.getH7114c().equals(String.valueOf(d_rdogrpH7114c[i]))) {
                        rb = (RadioButton) rdogrpH7114c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH712a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH712a.length; i++) {
                    if (item.getH712a().equals(String.valueOf(d_rdogrpH712a[i]))) {
                        rb = (RadioButton) rdogrpH712a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH712b1().equals("1")) {
                    chkH712b1.setChecked(true);
                } else if (item.getH712b1().equals("2")) {
                    chkH712b1.setChecked(false);
                }
                if (item.getH712b2().equals("1")) {
                    chkH712b2.setChecked(true);
                } else if (item.getH712b2().equals("2")) {
                    chkH712b2.setChecked(false);
                }
                if (item.getH712b3().equals("1")) {
                    chkH712b3.setChecked(true);
                } else if (item.getH712b3().equals("2")) {
                    chkH712b3.setChecked(false);
                }
                if (item.getH712b4().equals("1")) {
                    chkH712b4.setChecked(true);
                } else if (item.getH712b4().equals("2")) {
                    chkH712b4.setChecked(false);
                }
                String[] d_rdogrpH712c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH712c.length; i++) {
                    if (item.getH712c().equals(String.valueOf(d_rdogrpH712c[i]))) {
                        rb = (RadioButton) rdogrpH712c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH713a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH713a.length; i++) {
                    if (item.getH713a().equals(String.valueOf(d_rdogrpH713a[i]))) {
                        rb = (RadioButton) rdogrpH713a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH713b1().equals("1")) {
                    chkH713b1.setChecked(true);
                } else if (item.getH713b1().equals("2")) {
                    chkH713b1.setChecked(false);
                }
                if (item.getH713b2().equals("1")) {
                    chkH713b2.setChecked(true);
                } else if (item.getH713b2().equals("2")) {
                    chkH713b2.setChecked(false);
                }
                if (item.getH713b3().equals("1")) {
                    chkH713b3.setChecked(true);
                } else if (item.getH713b3().equals("2")) {
                    chkH713b3.setChecked(false);
                }
                if (item.getH713b4().equals("1")) {
                    chkH713b4.setChecked(true);
                } else if (item.getH713b4().equals("2")) {
                    chkH713b4.setChecked(false);
                }
                String[] d_rdogrpH713c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH713c.length; i++) {
                    if (item.getH713c().equals(String.valueOf(d_rdogrpH713c[i]))) {
                        rb = (RadioButton) rdogrpH713c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH714a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH714a.length; i++) {
                    if (item.getH714a().equals(String.valueOf(d_rdogrpH714a[i]))) {
                        rb = (RadioButton) rdogrpH714a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH714b1().equals("1")) {
                    chkH714b1.setChecked(true);
                } else if (item.getH714b1().equals("2")) {
                    chkH714b1.setChecked(false);
                }
                if (item.getH714b2().equals("1")) {
                    chkH714b2.setChecked(true);
                } else if (item.getH714b2().equals("2")) {
                    chkH714b2.setChecked(false);
                }
                if (item.getH714b3().equals("1")) {
                    chkH714b3.setChecked(true);
                } else if (item.getH714b3().equals("2")) {
                    chkH714b3.setChecked(false);
                }
                if (item.getH714b4().equals("1")) {
                    chkH714b4.setChecked(true);
                } else if (item.getH714b4().equals("2")) {
                    chkH714b4.setChecked(false);
                }
                String[] d_rdogrpH714c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH714c.length; i++) {
                    if (item.getH714c().equals(String.valueOf(d_rdogrpH714c[i]))) {
                        rb = (RadioButton) rdogrpH714c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH715a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH715a.length; i++) {
                    if (item.getH715a().equals(String.valueOf(d_rdogrpH715a[i]))) {
                        rb = (RadioButton) rdogrpH715a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH715b1().equals("1")) {
                    chkH715b1.setChecked(true);
                } else if (item.getH715b1().equals("2")) {
                    chkH715b1.setChecked(false);
                }
                if (item.getH715b2().equals("1")) {
                    chkH715b2.setChecked(true);
                } else if (item.getH715b2().equals("2")) {
                    chkH715b2.setChecked(false);
                }
                if (item.getH715b3().equals("1")) {
                    chkH715b3.setChecked(true);
                } else if (item.getH715b3().equals("2")) {
                    chkH715b3.setChecked(false);
                }
                if (item.getH715b4().equals("1")) {
                    chkH715b4.setChecked(true);
                } else if (item.getH715b4().equals("2")) {
                    chkH715b4.setChecked(false);
                }
                String[] d_rdogrpH715c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH715c.length; i++) {
                    if (item.getH715c().equals(String.valueOf(d_rdogrpH715c[i]))) {
                        rb = (RadioButton) rdogrpH715c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH716a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH716a.length; i++) {
                    if (item.getH716a().equals(String.valueOf(d_rdogrpH716a[i]))) {
                        rb = (RadioButton) rdogrpH716a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH716b1().equals("1")) {
                    chkH716b1.setChecked(true);
                } else if (item.getH716b1().equals("2")) {
                    chkH716b1.setChecked(false);
                }
                if (item.getH716b2().equals("1")) {
                    chkH716b2.setChecked(true);
                } else if (item.getH716b2().equals("2")) {
                    chkH716b2.setChecked(false);
                }
                if (item.getH716b3().equals("1")) {
                    chkH716b3.setChecked(true);
                } else if (item.getH716b3().equals("2")) {
                    chkH716b3.setChecked(false);
                }
                if (item.getH716b4().equals("1")) {
                    chkH716b4.setChecked(true);
                } else if (item.getH716b4().equals("2")) {
                    chkH716b4.setChecked(false);
                }
                String[] d_rdogrpH716c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH716c.length; i++) {
                    if (item.getH716c().equals(String.valueOf(d_rdogrpH716c[i]))) {
                        rb = (RadioButton) rdogrpH716c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH717a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH717a.length; i++) {
                    if (item.getH717a().equals(String.valueOf(d_rdogrpH717a[i]))) {
                        rb = (RadioButton) rdogrpH717a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH717b1().equals("1")) {
                    chkH717b1.setChecked(true);
                } else if (item.getH717b1().equals("2")) {
                    chkH717b1.setChecked(false);
                }
                if (item.getH717b2().equals("1")) {
                    chkH717b2.setChecked(true);
                } else if (item.getH717b2().equals("2")) {
                    chkH717b2.setChecked(false);
                }
                if (item.getH717b3().equals("1")) {
                    chkH717b3.setChecked(true);
                } else if (item.getH717b3().equals("2")) {
                    chkH717b3.setChecked(false);
                }
                if (item.getH717b4().equals("1")) {
                    chkH717b4.setChecked(true);
                } else if (item.getH717b4().equals("2")) {
                    chkH717b4.setChecked(false);
                }
                String[] d_rdogrpH717c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH717c.length; i++) {
                    if (item.getH717c().equals(String.valueOf(d_rdogrpH717c[i]))) {
                        rb = (RadioButton) rdogrpH717c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
            }
        } catch (Exception e) {
            Connection.MessageBox(HDDS.this, e.getMessage());
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