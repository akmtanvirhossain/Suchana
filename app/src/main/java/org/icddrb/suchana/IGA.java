package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".IGA" android:label="IGA" />

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
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import Common.Connection;
import Common.Global;

public class IGA extends Activity {
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
    LinearLayout secRND;
    View lineRND;
    TextView VlblRND;
    EditText txtRND;
    LinearLayout secSuchanaID;
    View lineSuchanaID;
    TextView VlblSuchanaID;
    EditText txtSuchanaID;
    LinearLayout secH18b1;
    LinearLayout seclb18b2;
    LinearLayout secH18b1a;
    View lineH18b1a;

    TextView VlblH18b1a;
    RadioGroup rdogrpH18b1a;
    RadioButton rdoH18b1a1;
    RadioButton rdoH18b1a2;

    LinearLayout secH18b2a0;
    CheckBox chkH18b2a0;

    LinearLayout secH18b2a1;
    View lineH18b2a1;
    TextView VlblH18b2a1;
    CheckBox chkH18b2a1;
    LinearLayout secH18b2a2;
    View lineH18b2a2;
    TextView VlblH18b2a2;
    CheckBox chkH18b2a2;
    LinearLayout secH18b2a3;
    View lineH18b2a3;
    TextView VlblH18b2a3;
    CheckBox chkH18b2a3;
    LinearLayout secH18b2a4;
    View lineH18b2a4;
    TextView VlblH18b2a4;
    CheckBox chkH18b2a4;
    LinearLayout secH18b2a5;
    View lineH18b2a5;
    TextView VlblH18b2a5;
    CheckBox chkH18b2a5;
    LinearLayout secH18b2a6;
    View lineH18b2a6;
    TextView VlblH18b2a6;
    CheckBox chkH18b2a6;
    LinearLayout secH18b2a7;
    View lineH18b2a7;
    TextView VlblH18b2a7;
    CheckBox chkH18b2a7;
    LinearLayout secH18b2a7X;
    View lineH18b2a7X;
    TextView VlblH18b2a7X;
    EditText txtH18b2a7X;
    LinearLayout secH18b1b;
    View lineH18b1b;
    TextView VlblH18b1b;
    RadioGroup rdogrpH18b1b;
    RadioButton rdoH18b1b1;
    RadioButton rdoH18b1b2;
    LinearLayout secH18b2b0;
    CheckBox chkH18b2b0;
    LinearLayout secH18b2b1;
    View lineH18b2b1;
    TextView VlblH18b2b1;
    CheckBox chkH18b2b1;
    LinearLayout secH18b2b2;
    View lineH18b2b2;
    TextView VlblH18b2b2;
    CheckBox chkH18b2b2;
    LinearLayout secH18b2b3;
    View lineH18b2b3;
    TextView VlblH18b2b3;
    CheckBox chkH18b2b3;
    LinearLayout secH18b2b4;
    View lineH18b2b4;
    TextView VlblH18b2b4;
    CheckBox chkH18b2b4;
    LinearLayout secH18b2b5;
    View lineH18b2b5;
    TextView VlblH18b2b5;
    CheckBox chkH18b2b5;
    LinearLayout secH18b2b6;
    View lineH18b2b6;
    TextView VlblH18b2b6;
    CheckBox chkH18b2b6;
    LinearLayout secH18b2b7;
    View lineH18b2b7;
    TextView VlblH18b2b7;
    CheckBox chkH18b2b7;
    LinearLayout secH18b2b8;
    View lineH18b2b8;
    TextView VlblH18b2b8;
    CheckBox chkH18b2b8;
    LinearLayout secH18b2b9;
    View lineH18b2b9;
    TextView VlblH18b2b9;
    CheckBox chkH18b2b9;
    LinearLayout secH18b2b9X;
    View lineH18b2b9X;
    TextView VlblH18b2b9X;
    EditText txtH18b2b9X;
    LinearLayout secH18b1c;
    View lineH18b1c;
    TextView VlblH18b1c;
    RadioGroup rdogrpH18b1c;
    RadioButton rdoH18b1c1;
    RadioButton rdoH18b1c2;
    LinearLayout secH18b2c0;
    CheckBox chkH18b2c0;
    LinearLayout secH18b2c1;
    View lineH18b2c1;
    TextView VlblH18b2c1;
    CheckBox chkH18b2c1;
    LinearLayout secH18b2c2;
    View lineH18b2c2;
    TextView VlblH18b2c2;
    CheckBox chkH18b2c2;
    LinearLayout secH18b2c3;
    View lineH18b2c3;
    TextView VlblH18b2c3;
    CheckBox chkH18b2c3;
    LinearLayout secH18b2c4;
    View lineH18b2c4;
    TextView VlblH18b2c4;
    CheckBox chkH18b2c4;
    LinearLayout secH18b2c5;
    View lineH18b2c5;
    TextView VlblH18b2c5;
    CheckBox chkH18b2c5;

    LinearLayout secH18b2c6;
    View lineH18b2c6;
    TextView VlblH18b2c6;
    CheckBox chkH18b2c6;
    LinearLayout secH18b2c6X;
    View lineH18b2c6X;
    TextView VlblH18b2c6X;
    EditText txtH18b2c6X;
    LinearLayout secH18b1d;
    View lineH18b1d;
    TextView VlblH18b1d;
    RadioGroup rdogrpH18b1d;
    RadioButton rdoH18b1d1;
    RadioButton rdoH18b1d2;

    LinearLayout secH18b2d0;
    CheckBox chkH18b2d0;

    LinearLayout secH18b2d1;
    View lineH18b2d1;
    TextView VlblH18b2d1;
    CheckBox chkH18b2d1;
    LinearLayout secH18b2d2;
    View lineH18b2d2;
    TextView VlblH18b2d2;
    CheckBox chkH18b2d2;
    LinearLayout secH18b2d3;
    View lineH18b2d3;
    TextView VlblH18b2d3;
    CheckBox chkH18b2d3;
    LinearLayout secH18b2d4;
    View lineH18b2d4;
    TextView VlblH18b2d4;
    CheckBox chkH18b2d4;
    LinearLayout secH18b2d5;
    View lineH18b2d5;
    TextView VlblH18b2d5;
    CheckBox chkH18b2d5;
    LinearLayout secH18b2d6;
    View lineH18b2d6;
    TextView VlblH18b2d6;
    CheckBox chkH18b2d6;
    LinearLayout secH18b2d7;
    View lineH18b2d7;
    TextView VlblH18b2d7;
    CheckBox chkH18b2d7;
    LinearLayout secH18b2d7X;
    View lineH18b2d7X;
    TextView VlblH18b2d7X;
    EditText txtH18b2d7X;
    LinearLayout secH18b1e;
    View lineH18b1e;
    TextView VlblH18b1e;
    RadioGroup rdogrpH18b1e;
    RadioButton rdoH18b1e1;
    RadioButton rdoH18b1e2;
    LinearLayout secH18b2e0;
    CheckBox chkH18b2e0;
    LinearLayout secH18b2e1;
    View lineH18b2e1;
    TextView VlblH18b2e1;
    CheckBox chkH18b2e1;
    LinearLayout secH18b2e2;
    View lineH18b2e2;
    TextView VlblH18b2e2;
    CheckBox chkH18b2e2;
    LinearLayout secH18b2e3;
    View lineH18b2e3;
    TextView VlblH18b2e3;
    CheckBox chkH18b2e3;
    LinearLayout secH18b2e4;
    View lineH18b2e4;
    TextView VlblH18b2e4;
    CheckBox chkH18b2e4;
    LinearLayout secH18b2e5;
    View lineH18b2e5;
    TextView VlblH18b2e5;
    CheckBox chkH18b2e5;

    LinearLayout secH18b2e6;
    View lineH18b2e6;
    TextView VlblH18b2e6;
    CheckBox chkH18b2e6;
    LinearLayout secH18b2e6X;
    View lineH18b2e6X;
    TextView VlblH18b2e6X;
    EditText txtH18b2e6X;
    LinearLayout secH18b1f;
    View lineH18b1f;
    TextView VlblH18b1f;
    RadioGroup rdogrpH18b1f;
    RadioButton rdoH18b1f1;
    RadioButton rdoH18b1f2;
    LinearLayout secH18b2f0;
    CheckBox chkH18b2f0;
    LinearLayout secH18b2f1;
    View lineH18b2f1;
    TextView VlblH18b2f1;
    CheckBox chkH18b2f1;
    LinearLayout secH18b2f2;
    View lineH18b2f2;
    TextView VlblH18b2f2;
    CheckBox chkH18b2f2;
    LinearLayout secH18b2f3;
    View lineH18b2f3;
    TextView VlblH18b2f3;
    CheckBox chkH18b2f3;
    LinearLayout secH18b2f4;
    View lineH18b2f4;
    TextView VlblH18b2f4;
    CheckBox chkH18b2f4;
    LinearLayout secH18b2f5;
    View lineH18b2f5;
    TextView VlblH18b2f5;
    CheckBox chkH18b2f5;
    LinearLayout secH18b2f6;
    View lineH18b2f6;
    TextView VlblH18b2f6;
    CheckBox chkH18b2f6;
    LinearLayout secH18b2f7;
    View lineH18b2f7;
    TextView VlblH18b2f7;
    CheckBox chkH18b2f7;
    LinearLayout secH18b2f7X;
    View lineH18b2f7X;
    TextView VlblH18b2f7X;
    EditText txtH18b2f7X;
    LinearLayout secH18b1g;
    View lineH18b1g;
    TextView VlblH18b1g;
    RadioGroup rdogrpH18b1g;
    RadioButton rdoH18b1g1;
    RadioButton rdoH18b1g2;
    LinearLayout secH18b2g0;
    CheckBox chkH18b2g0;
    LinearLayout secH18b2g1;
    View lineH18b2g1;
    TextView VlblH18b2g1;
    CheckBox chkH18b2g1;
    LinearLayout secH18b2g2;
    View lineH18b2g2;
    TextView VlblH18b2g2;
    CheckBox chkH18b2g2;
    LinearLayout secH18b2g3;
    View lineH18b2g3;
    TextView VlblH18b2g3;
    CheckBox chkH18b2g3;
    LinearLayout secH18b2g4;
    View lineH18b2g4;
    TextView VlblH18b2g4;
    CheckBox chkH18b2g4;
    LinearLayout secH18b2g5;
    View lineH18b2g5;
    TextView VlblH18b2g5;
    CheckBox chkH18b2g5;
    LinearLayout secH18b2g6;
    View lineH18b2g6;
    TextView VlblH18b2g6;
    CheckBox chkH18b2g6;
    LinearLayout secH18b2g7;
    View lineH18b2g7;
    TextView VlblH18b2g7;
    CheckBox chkH18b2g7;
    LinearLayout secH18b2g8;
    View lineH18b2g8;
    TextView VlblH18b2g8;
    CheckBox chkH18b2g8;
    LinearLayout secH18b2g9;
    View lineH18b2g9;
    TextView VlblH18b2g9;
    CheckBox chkH18b2g9;
    LinearLayout secH18b2g9X;
    View lineH18b2g9X;
    TextView VlblH18b2g9X;
    EditText txtH18b2g9X;
    LinearLayout secH18b1h;
    View lineH18b1h;
    TextView VlblH18b1h;
    RadioGroup rdogrpH18b1h;
    RadioButton rdoH18b1h1;
    RadioButton rdoH18b1h2;
    LinearLayout secH18b2h0;
    CheckBox chkH18b2h0;
    LinearLayout secH18b2h1;
    View lineH18b2h1;
    TextView VlblH18b2h1;
    CheckBox chkH18b2h1;
    LinearLayout secH18b2h2;
    View lineH18b2h2;
    TextView VlblH18b2h2;
    CheckBox chkH18b2h2;
    LinearLayout secH18b2h3;
    View lineH18b2h3;
    TextView VlblH18b2h3;
    CheckBox chkH18b2h3;
    LinearLayout secH18b2h4;
    View lineH18b2h4;
    TextView VlblH18b2h4;
    CheckBox chkH18b2h4;
    LinearLayout secH18b2h5;
    View lineH18b2h5;
    TextView VlblH18b2h5;
    CheckBox chkH18b2h5;
    LinearLayout secH18b2h6;
    View lineH18b2h6;
    TextView VlblH18b2h6;
    CheckBox chkH18b2h6;
    LinearLayout secH18b2h7;
    View lineH18b2h7;
    TextView VlblH18b2h7;
    CheckBox chkH18b2h7;
    LinearLayout secH18b2h8;
    View lineH18b2h8;
    TextView VlblH18b2h8;
    CheckBox chkH18b2h8;
    LinearLayout secH18b2h9;
    View lineH18b2h9;
    TextView VlblH18b2h9;
    CheckBox chkH18b2h9;
    LinearLayout secH18b2h9X;
    View lineH18b2h9X;
    TextView VlblH18b2h9X;
    EditText txtH18b2h9X;
    LinearLayout secH18b1i;
    View lineH18b1i;
    TextView VlblH18b1i;
    RadioGroup rdogrpH18b1i;
    RadioButton rdoH18b1i1;
    RadioButton rdoH18b1i2;
    LinearLayout secH18b2i0;
    CheckBox chkH18b2i0;
    LinearLayout secH18b2i1;
    View lineH18b2i1;
    TextView VlblH18b2i1;
    CheckBox chkH18b2i1;
    LinearLayout secH18b2i2;
    View lineH18b2i2;
    TextView VlblH18b2i2;
    CheckBox chkH18b2i2;
    LinearLayout secH18b2i3;
    View lineH18b2i3;
    TextView VlblH18b2i3;
    CheckBox chkH18b2i3;
    LinearLayout secH18b2i4;
    View lineH18b2i4;
    TextView VlblH18b2i4;
    CheckBox chkH18b2i4;
    LinearLayout secH18b2i5;
    View lineH18b2i5;
    TextView VlblH18b2i5;
    CheckBox chkH18b2i5;
    LinearLayout secH18b2i5X;
    View lineH18b2i5X;
    TextView VlblH18b2i5X;
    EditText txtH18b2i5X;
    LinearLayout secH18b1j;
    View lineH18b1j;
    TextView VlblH18b1j;
    RadioGroup rdogrpH18b1j;
    RadioButton rdoH18b1j1;
    RadioButton rdoH18b1j2;
    LinearLayout secH18b2j0;
    CheckBox chkH18b2j0;
    LinearLayout secH18b2j1;
    View lineH18b2j1;
    TextView VlblH18b2j1;
    CheckBox chkH18b2j1;
    LinearLayout secH18b2j2;
    View lineH18b2j2;
    TextView VlblH18b2j2;
    CheckBox chkH18b2j2;
    LinearLayout secH18b2j3;
    View lineH18b2j3;
    TextView VlblH18b2j3;
    CheckBox chkH18b2j3;
    LinearLayout secH18b2j4;
    View lineH18b2j4;
    TextView VlblH18b2j4;
    CheckBox chkH18b2j4;
    LinearLayout secH18b2j5;
    View lineH18b2j5;
    TextView VlblH18b2j5;
    CheckBox chkH18b2j5;
    LinearLayout secH18b2j5X;
    View lineH18b2j5X;
    TextView VlblH18b2j5X;
    EditText txtH18b2j5X;
    LinearLayout secH18b1k;
    View lineH18b1k;
    TextView VlblH18b1k;
    RadioGroup rdogrpH18b1k;
    RadioButton rdoH18b1k1;
    RadioButton rdoH18b1k2;
    LinearLayout secH18b2kX;
    View lineH18b2kX;
    TextView VlblH18b2kX;
    EditText txtH18b2kX;

    LinearLayout seclb18b2a;
    CheckBox chkHl8b2a;
    LinearLayout seclb18b2b;
    CheckBox chkHl8b2b;
    LinearLayout seclb18b2c;
    CheckBox chkHl8b2c;
    LinearLayout seclb18b2d;
    CheckBox chkHl8b2d;
    LinearLayout seclb18b2e;
    CheckBox chkHl8b2e;
    LinearLayout seclb18b2f;
    CheckBox chkHl8b2f;
    LinearLayout seclb18b2g;
    CheckBox chkHl8b2g;
    LinearLayout seclb18b2h;
    CheckBox chkHl8b2h;
    LinearLayout seclb18b2i;
    CheckBox chkHl8b2i;
    LinearLayout seclb18b2j;
    CheckBox chkHl8b2j;


    ImageButton cmdForward;
    TextView lblNext;


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
            setContentView(R.layout.iga);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TableName = "IGA";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);
            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(IGA.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Careseek.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDbundle);
                            getApplicationContext().startActivity(intent);
                            finish();
                        }
                    });
                    adb.show();
                }
            });
            cmdForward = (ImageButton) findViewById(R.id.cmdForward);
            cmdForward.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(IGA.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to return to Home [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), PregHis.class);
                            intent.putExtras(IDbundle);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            getApplicationContext().startActivity(intent);
                            finish();
                        }
                    });
                    adb.show();
                }
            });

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
            secRND = (LinearLayout) findViewById(R.id.secRND);
            lineRND = (View) findViewById(R.id.lineRND);
            VlblRND = (TextView) findViewById(R.id.VlblRND);
            txtRND = (EditText) findViewById(R.id.txtRND);
            secSuchanaID = (LinearLayout) findViewById(R.id.secSuchanaID);
            lineSuchanaID = (View) findViewById(R.id.lineSuchanaID);
            VlblSuchanaID = (TextView) findViewById(R.id.VlblSuchanaID);
            txtSuchanaID = (EditText) findViewById(R.id.txtSuchanaID);
            secH18b1 = (LinearLayout) findViewById(R.id.secH18b1);
            seclb18b2a = (LinearLayout) findViewById(R.id.seclb18b2a);
            chkHl8b2a = (CheckBox) findViewById(R.id.chkHl8b2a);

            chkHl8b2a.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {

                        secH18b2a0.setVisibility(View.VISIBLE);
                        secH18b2a1.setVisibility(View.VISIBLE);
                        lineH18b2a1.setVisibility(View.VISIBLE);
                        secH18b2a2.setVisibility(View.VISIBLE);
                        lineH18b2a2.setVisibility(View.VISIBLE);
                        secH18b2a3.setVisibility(View.VISIBLE);
                        lineH18b2a3.setVisibility(View.VISIBLE);
                        secH18b2a4.setVisibility(View.VISIBLE);
                        lineH18b2a4.setVisibility(View.VISIBLE);
                        secH18b2a5.setVisibility(View.VISIBLE);
                        lineH18b2a5.setVisibility(View.VISIBLE);
                        secH18b2a6.setVisibility(View.VISIBLE);
                        lineH18b2a6.setVisibility(View.VISIBLE);
                        secH18b2a7.setVisibility(View.VISIBLE);
                        lineH18b2a7.setVisibility(View.VISIBLE);
                        //secH18b2a7X.setVisibility(View.VISIBLE);
                       // lineH18b2a7X.setVisibility(View.VISIBLE);
                    }
                    else
                    {

                        secH18b2a1.setVisibility(View.GONE);
                        secH18b2a0.setVisibility(View.GONE);
                        chkH18b2a0.setChecked(false);
                        lineH18b2a1.setVisibility(View.GONE);
                        chkH18b2a1.setChecked(false);
                        secH18b2a2.setVisibility(View.GONE);
                        lineH18b2a2.setVisibility(View.GONE);
                        chkH18b2a2.setChecked(false);
                        secH18b2a3.setVisibility(View.GONE);
                        lineH18b2a3.setVisibility(View.GONE);
                        chkH18b2a3.setChecked(false);
                        secH18b2a4.setVisibility(View.GONE);
                        lineH18b2a4.setVisibility(View.GONE);
                        chkH18b2a4.setChecked(false);
                        secH18b2a5.setVisibility(View.GONE);
                        lineH18b2a5.setVisibility(View.GONE);
                        chkH18b2a5.setChecked(false);
                        secH18b2a6.setVisibility(View.GONE);
                        lineH18b2a6.setVisibility(View.GONE);
                        chkH18b2a6.setChecked(false);
                        secH18b2a7.setVisibility(View.GONE);
                        lineH18b2a7.setVisibility(View.GONE);
                        chkH18b2a7.setChecked(false);
                      secH18b2a7X.setVisibility(View.GONE);
                        lineH18b2a7X.setVisibility(View.GONE);
                        txtH18b2a7X.setText("");

                    }
                }
            });
            secH18b1a = (LinearLayout) findViewById(R.id.secH18b1a);
            lineH18b1a = (View) findViewById(R.id.lineH18b1a);
            VlblH18b1a = (TextView) findViewById(R.id.VlblH18b1a);
            rdogrpH18b1a = (RadioGroup) findViewById(R.id.rdogrpH18b1a);

            rdoH18b1a1 = (RadioButton) findViewById(R.id.rdoH18b1a1);
            rdoH18b1a2 = (RadioButton) findViewById(R.id.rdoH18b1a2);
            rdogrpH18b1a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH18b1a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH18b1a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH18b1a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH18b1a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {

                        seclb18b2a.setVisibility(View.GONE);
                        chkHl8b2a.setChecked(false);
                        secH18b2a0.setVisibility(View.GONE);
                        chkH18b2a0.setChecked(false);
                        secH18b2a1.setVisibility(View.GONE);
                        lineH18b2a1.setVisibility(View.GONE);
                        chkH18b2a1.setChecked(false);
                        secH18b2a2.setVisibility(View.GONE);
                        lineH18b2a2.setVisibility(View.GONE);
                        chkH18b2a2.setChecked(false);
                        secH18b2a3.setVisibility(View.GONE);
                        lineH18b2a3.setVisibility(View.GONE);
                        chkH18b2a3.setChecked(false);
                        secH18b2a4.setVisibility(View.GONE);
                        lineH18b2a4.setVisibility(View.GONE);
                        chkH18b2a4.setChecked(false);
                        secH18b2a5.setVisibility(View.GONE);
                        lineH18b2a5.setVisibility(View.GONE);
                        chkH18b2a5.setChecked(false);
                        secH18b2a6.setVisibility(View.GONE);
                        lineH18b2a6.setVisibility(View.GONE);
                        chkH18b2a6.setChecked(false);
                        secH18b2a7.setVisibility(View.GONE);
                        lineH18b2a7.setVisibility(View.GONE);
                        chkH18b2a7.setChecked(false);
                        secH18b2a7X.setVisibility(View.GONE);
                        lineH18b2a7X.setVisibility(View.GONE);
                        txtH18b2a7X.setText("");
                    } else {
                        seclb18b2a.setVisibility(View.VISIBLE);
                        secH18b2a0.setVisibility(View.VISIBLE);
                        secH18b2a1.setVisibility(View.VISIBLE);
                        lineH18b2a1.setVisibility(View.VISIBLE);
                        secH18b2a2.setVisibility(View.VISIBLE);
                        lineH18b2a2.setVisibility(View.VISIBLE);
                        secH18b2a3.setVisibility(View.VISIBLE);
                        lineH18b2a3.setVisibility(View.VISIBLE);
                        secH18b2a4.setVisibility(View.VISIBLE);
                        lineH18b2a4.setVisibility(View.VISIBLE);
                        secH18b2a5.setVisibility(View.VISIBLE);
                        lineH18b2a5.setVisibility(View.VISIBLE);
                        secH18b2a6.setVisibility(View.VISIBLE);
                        lineH18b2a6.setVisibility(View.VISIBLE);
                        secH18b2a7.setVisibility(View.VISIBLE);
                        lineH18b2a7.setVisibility(View.VISIBLE);
                      //  secH18b2a7X.setVisibility(View.VISIBLE);
                       // lineH18b2a7X.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH18b2a0 = (LinearLayout) findViewById(R.id.secH18b2a0);
            chkH18b2a0 = (CheckBox) findViewById(R.id.chkH18b2a0);
            secH18b2a1 = (LinearLayout) findViewById(R.id.secH18b2a1);
            lineH18b2a1 = (View) findViewById(R.id.lineH18b2a1);
            VlblH18b2a1 = (TextView) findViewById(R.id.VlblH18b2a1);
            chkH18b2a1 = (CheckBox) findViewById(R.id.chkH18b2a1);
            secH18b2a2 = (LinearLayout) findViewById(R.id.secH18b2a2);
            lineH18b2a2 = (View) findViewById(R.id.lineH18b2a2);
            VlblH18b2a2 = (TextView) findViewById(R.id.VlblH18b2a2);
            chkH18b2a2 = (CheckBox) findViewById(R.id.chkH18b2a2);
            secH18b2a3 = (LinearLayout) findViewById(R.id.secH18b2a3);
            lineH18b2a3 = (View) findViewById(R.id.lineH18b2a3);
            VlblH18b2a3 = (TextView) findViewById(R.id.VlblH18b2a3);
            chkH18b2a3 = (CheckBox) findViewById(R.id.chkH18b2a3);
            secH18b2a4 = (LinearLayout) findViewById(R.id.secH18b2a4);
            lineH18b2a4 = (View) findViewById(R.id.lineH18b2a4);
            VlblH18b2a4 = (TextView) findViewById(R.id.VlblH18b2a4);
            chkH18b2a4 = (CheckBox) findViewById(R.id.chkH18b2a4);
            secH18b2a5 = (LinearLayout) findViewById(R.id.secH18b2a5);
            lineH18b2a5 = (View) findViewById(R.id.lineH18b2a5);
            VlblH18b2a5 = (TextView) findViewById(R.id.VlblH18b2a5);
            chkH18b2a5 = (CheckBox) findViewById(R.id.chkH18b2a5);
            secH18b2a6 = (LinearLayout) findViewById(R.id.secH18b2a6);
            lineH18b2a6 = (View) findViewById(R.id.lineH18b2a6);
            VlblH18b2a6 = (TextView) findViewById(R.id.VlblH18b2a6);
            chkH18b2a6 = (CheckBox) findViewById(R.id.chkH18b2a6);
            secH18b2a7 = (LinearLayout) findViewById(R.id.secH18b2a7);
            lineH18b2a7 = (View) findViewById(R.id.lineH18b2a7);
            VlblH18b2a7 = (TextView) findViewById(R.id.VlblH18b2a7);
            chkH18b2a7 = (CheckBox) findViewById(R.id.chkH18b2a7);
            chkH18b2a7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {
                        secH18b2a7X.setVisibility(View.GONE);
                        lineH18b2a7X.setVisibility(View.GONE);
                        txtH18b2a7X.setText("");
                    //    secH18b1b.setVisibility(View.GONE);
                     //   lineH18b1b.setVisibility(View.GONE);
                     //   rdogrpH18b1b.clearCheck();
                    }
                    else
                    {
                        secH18b2a7X.setVisibility(View.VISIBLE);
                        lineH18b2a7X.setVisibility(View.VISIBLE);
                    }
                }
            });
            secH18b2a7X = (LinearLayout) findViewById(R.id.secH18b2a7X);
            lineH18b2a7X = (View) findViewById(R.id.lineH18b2a7X);
            VlblH18b2a7X = (TextView) findViewById(R.id.VlblH18b2a7X);
            txtH18b2a7X = (EditText) findViewById(R.id.txtH18b2a7X);

            secH18b2a7X.setVisibility(View.GONE);
            lineH18b2a7X.setVisibility(View.GONE);

            secH18b1b = (LinearLayout) findViewById(R.id.secH18b1b);
            lineH18b1b = (View) findViewById(R.id.lineH18b1b);
            VlblH18b1b = (TextView) findViewById(R.id.VlblH18b1b);
            rdogrpH18b1b = (RadioGroup) findViewById(R.id.rdogrpH18b1b);
            seclb18b2b = (LinearLayout) findViewById(R.id.seclb18b2b);
            chkHl8b2b = (CheckBox) findViewById(R.id.chkHl8b2b);

            chkHl8b2b.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {

                        secH18b2b0.setVisibility(View.VISIBLE);
                        secH18b2b1.setVisibility(View.VISIBLE);
                        lineH18b2b1.setVisibility(View.VISIBLE);
                        secH18b2b2.setVisibility(View.VISIBLE);
                        lineH18b2b2.setVisibility(View.VISIBLE);
                        secH18b2b3.setVisibility(View.VISIBLE);
                        lineH18b2b3.setVisibility(View.VISIBLE);
                        secH18b2b4.setVisibility(View.VISIBLE);
                        lineH18b2b4.setVisibility(View.VISIBLE);
                        secH18b2b5.setVisibility(View.VISIBLE);
                        lineH18b2b5.setVisibility(View.VISIBLE);
                        secH18b2b6.setVisibility(View.VISIBLE);
                        lineH18b2b6.setVisibility(View.VISIBLE);
                        secH18b2b7.setVisibility(View.VISIBLE);
                        lineH18b2b7.setVisibility(View.VISIBLE);
                        secH18b2b8.setVisibility(View.VISIBLE);
                        lineH18b2b8.setVisibility(View.VISIBLE);
                        secH18b2b9.setVisibility(View.VISIBLE);
                        lineH18b2b9.setVisibility(View.VISIBLE);
                       // secH18b2b7X.setVisibility(View.VISIBLE);
                      //  lineH18b2b7X.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        secH18b2b0.setVisibility(View.GONE);
                        chkH18b2b0.setChecked(false);
                        secH18b2b1.setVisibility(View.GONE);
                        lineH18b2b1.setVisibility(View.GONE);
                        chkH18b2b1.setChecked(false);
                        secH18b2b2.setVisibility(View.GONE);
                        lineH18b2b2.setVisibility(View.GONE);
                        chkH18b2b2.setChecked(false);
                        secH18b2b3.setVisibility(View.GONE);
                        lineH18b2b3.setVisibility(View.GONE);
                        chkH18b2b3.setChecked(false);
                        secH18b2b4.setVisibility(View.GONE);
                        lineH18b2b4.setVisibility(View.GONE);
                        chkH18b2b4.setChecked(false);
                        secH18b2b5.setVisibility(View.GONE);
                        lineH18b2b5.setVisibility(View.GONE);
                        chkH18b2b5.setChecked(false);
                        secH18b2b6.setVisibility(View.GONE);
                        lineH18b2b6.setVisibility(View.GONE);
                        chkH18b2b6.setChecked(false);
                        secH18b2b7.setVisibility(View.GONE);
                        lineH18b2b7.setVisibility(View.GONE);
                        chkH18b2b7.setChecked(false);
                        secH18b2b8.setVisibility(View.GONE);
                        lineH18b2b8.setVisibility(View.GONE);
                        chkH18b2b8.setChecked(false);
                        secH18b2b9.setVisibility(View.GONE);
                        lineH18b2b9.setVisibility(View.GONE);
                        chkH18b2b9.setChecked(false);
                        secH18b2b9X.setVisibility(View.GONE);
                        lineH18b2b9X.setVisibility(View.GONE);
                        txtH18b2b9X.setText("");
                    }
                }
            });

            rdoH18b1b1 = (RadioButton) findViewById(R.id.rdoH18b1b1);
            rdoH18b1b2 = (RadioButton) findViewById(R.id.rdoH18b1b2);
            rdogrpH18b1b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH18b1b = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH18b1b.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH18b1b.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH18b1b[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        seclb18b2b.setVisibility(View.GONE);
                        chkHl8b2b.setChecked(false);
                        secH18b2b0.setVisibility(View.GONE);
                        chkH18b2b0.setChecked(false);

                        secH18b2b1.setVisibility(View.GONE);
                        lineH18b2b1.setVisibility(View.GONE);
                        chkH18b2b1.setChecked(false);
                        secH18b2b2.setVisibility(View.GONE);
                        lineH18b2b2.setVisibility(View.GONE);
                        chkH18b2b2.setChecked(false);
                        secH18b2b3.setVisibility(View.GONE);
                        lineH18b2b3.setVisibility(View.GONE);
                        chkH18b2b3.setChecked(false);
                        secH18b2b4.setVisibility(View.GONE);
                        lineH18b2b4.setVisibility(View.GONE);
                        chkH18b2b4.setChecked(false);
                        secH18b2b5.setVisibility(View.GONE);
                        lineH18b2b5.setVisibility(View.GONE);
                        chkH18b2b5.setChecked(false);
                        secH18b2b6.setVisibility(View.GONE);
                        lineH18b2b6.setVisibility(View.GONE);
                        chkH18b2b6.setChecked(false);
                        secH18b2b7.setVisibility(View.GONE);
                        lineH18b2b7.setVisibility(View.GONE);
                        chkH18b2b7.setChecked(false);
                        secH18b2b8.setVisibility(View.GONE);
                        lineH18b2b8.setVisibility(View.GONE);
                        chkH18b2b8.setChecked(false);
                        secH18b2b9.setVisibility(View.GONE);
                        lineH18b2b9.setVisibility(View.GONE);
                        chkH18b2b9.setChecked(false);
                        secH18b2b9X.setVisibility(View.GONE);
                        lineH18b2b9X.setVisibility(View.GONE);
                        txtH18b2b9X.setText("");
                    } else {
                        seclb18b2b.setVisibility(View.VISIBLE);
                        secH18b2b0.setVisibility(View.VISIBLE);
                        secH18b2b1.setVisibility(View.VISIBLE);
                        lineH18b2b1.setVisibility(View.VISIBLE);
                        secH18b2b2.setVisibility(View.VISIBLE);
                        lineH18b2b2.setVisibility(View.VISIBLE);
                        secH18b2b3.setVisibility(View.VISIBLE);
                        lineH18b2b3.setVisibility(View.VISIBLE);
                        secH18b2b4.setVisibility(View.VISIBLE);
                        lineH18b2b4.setVisibility(View.VISIBLE);
                        secH18b2b5.setVisibility(View.VISIBLE);
                        lineH18b2b5.setVisibility(View.VISIBLE);
                        secH18b2b6.setVisibility(View.VISIBLE);
                        lineH18b2b6.setVisibility(View.VISIBLE);
                        secH18b2b7.setVisibility(View.VISIBLE);
                        lineH18b2b7.setVisibility(View.VISIBLE);
                        secH18b2b8.setVisibility(View.VISIBLE);
                        lineH18b2b8.setVisibility(View.VISIBLE);
                        secH18b2b9.setVisibility(View.VISIBLE);
                        lineH18b2b9.setVisibility(View.VISIBLE);
                      //  secH18b2b7X.setVisibility(View.VISIBLE);
                      //  lineH18b2b7X.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH18b2b0 = (LinearLayout) findViewById(R.id.secH18b2b0);
            chkH18b2b0 = (CheckBox) findViewById(R.id.chkH18b2b0);
            secH18b2b1 = (LinearLayout) findViewById(R.id.secH18b2b1);
            lineH18b2b1 = (View) findViewById(R.id.lineH18b2b1);
            VlblH18b2b1 = (TextView) findViewById(R.id.VlblH18b2b1);
            chkH18b2b1 = (CheckBox) findViewById(R.id.chkH18b2b1);
            secH18b2b2 = (LinearLayout) findViewById(R.id.secH18b2b2);
            lineH18b2b2 = (View) findViewById(R.id.lineH18b2b2);
            VlblH18b2b2 = (TextView) findViewById(R.id.VlblH18b2b2);
            chkH18b2b2 = (CheckBox) findViewById(R.id.chkH18b2b2);
            secH18b2b3 = (LinearLayout) findViewById(R.id.secH18b2b3);
            lineH18b2b3 = (View) findViewById(R.id.lineH18b2b3);
            VlblH18b2b3 = (TextView) findViewById(R.id.VlblH18b2b3);
            chkH18b2b3 = (CheckBox) findViewById(R.id.chkH18b2b3);
            secH18b2b4 = (LinearLayout) findViewById(R.id.secH18b2b4);
            lineH18b2b4 = (View) findViewById(R.id.lineH18b2b4);
            VlblH18b2b4 = (TextView) findViewById(R.id.VlblH18b2b4);
            chkH18b2b4 = (CheckBox) findViewById(R.id.chkH18b2b4);
            secH18b2b5 = (LinearLayout) findViewById(R.id.secH18b2b5);
            lineH18b2b5 = (View) findViewById(R.id.lineH18b2b5);
            VlblH18b2b5 = (TextView) findViewById(R.id.VlblH18b2b5);
            chkH18b2b5 = (CheckBox) findViewById(R.id.chkH18b2b5);
            secH18b2b6 = (LinearLayout) findViewById(R.id.secH18b2b6);
            lineH18b2b6 = (View) findViewById(R.id.lineH18b2b6);
            VlblH18b2b6 = (TextView) findViewById(R.id.VlblH18b2b6);
            chkH18b2b6 = (CheckBox) findViewById(R.id.chkH18b2b6);
            secH18b2b7 = (LinearLayout) findViewById(R.id.secH18b2b7);
            lineH18b2b7 = (View) findViewById(R.id.lineH18b2b7);
            VlblH18b2b7 = (TextView) findViewById(R.id.VlblH18b2b7);
            chkH18b2b7 = (CheckBox) findViewById(R.id.chkH18b2b7);
            secH18b2b8 = (LinearLayout) findViewById(R.id.secH18b2b8);
            lineH18b2b8 = (View) findViewById(R.id.lineH18b2b8);
            VlblH18b2b8 = (TextView) findViewById(R.id.VlblH18b2b8);
            chkH18b2b8 = (CheckBox) findViewById(R.id.chkH18b2b8);
            secH18b2b9 = (LinearLayout) findViewById(R.id.secH18b2b9);
            lineH18b2b9 = (View) findViewById(R.id.lineH18b2b9);
            VlblH18b2b9 = (TextView) findViewById(R.id.VlblH18b2b9);
            chkH18b2b9 = (CheckBox) findViewById(R.id.chkH18b2b9);
            chkH18b2b9.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {
                        secH18b2b9X.setVisibility(View.GONE);
                        lineH18b2b9X.setVisibility(View.GONE);
                        txtH18b2b9X.setText("");
                       // secH18b1c.setVisibility(View.GONE);
                      //  lineH18b1c.setVisibility(View.GONE);
                       // rdogrpH18b1c.clearCheck();
                    }
                    else
                    {
                        secH18b2b9X.setVisibility(View.VISIBLE);
                        lineH18b2b9X.setVisibility(View.VISIBLE);
                    }
                }
            });
            secH18b2b9X = (LinearLayout) findViewById(R.id.secH18b2b9X);
            lineH18b2b9X = (View) findViewById(R.id.lineH18b2b9X);
            VlblH18b2b9X = (TextView) findViewById(R.id.VlblH18b2b9X);
            txtH18b2b9X = (EditText) findViewById(R.id.txtH18b2b9X);

            secH18b2b9X.setVisibility(View.GONE);
            lineH18b2b9X.setVisibility(View.GONE);

            secH18b2c0 = (LinearLayout) findViewById(R.id.secH18b2c0);
            chkH18b2c0 = (CheckBox) findViewById(R.id.chkH18b2c0);
            secH18b2d0 = (LinearLayout) findViewById(R.id.secH18b2d0);
            chkH18b2d0 = (CheckBox) findViewById(R.id.chkH18b2d0);
            secH18b2e0 = (LinearLayout) findViewById(R.id.secH18b2e0);
            chkH18b2e0 = (CheckBox) findViewById(R.id.chkH18b2e0);
            secH18b2f0 = (LinearLayout) findViewById(R.id.secH18b2f0);
            chkH18b2f0 = (CheckBox) findViewById(R.id.chkH18b2f0);
            secH18b2g0 = (LinearLayout) findViewById(R.id.secH18b2g0);
            chkH18b2g0 = (CheckBox) findViewById(R.id.chkH18b2g0);
            secH18b2h0 = (LinearLayout) findViewById(R.id.secH18b2h0);
            chkH18b2h0 = (CheckBox) findViewById(R.id.chkH18b2h0);
            secH18b2i0 = (LinearLayout) findViewById(R.id.secH18b2i0);
            chkH18b2i0 = (CheckBox) findViewById(R.id.chkH18b2i0);
            secH18b2j0 = (LinearLayout) findViewById(R.id.secH18b2j0);
            chkH18b2j0 = (CheckBox) findViewById(R.id.chkH18b2j0);

            secH18b1c = (LinearLayout) findViewById(R.id.secH18b1c);
            lineH18b1c = (View) findViewById(R.id.lineH18b1c);
            VlblH18b1c = (TextView) findViewById(R.id.VlblH18b1c);
            rdogrpH18b1c = (RadioGroup) findViewById(R.id.rdogrpH18b1c);
            seclb18b2c = (LinearLayout) findViewById(R.id.seclb18b2c);
            chkHl8b2c = (CheckBox) findViewById(R.id.chkHl8b2c);

            chkHl8b2c.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {

                        secH18b2c1.setVisibility(View.VISIBLE);
                        lineH18b2c1.setVisibility(View.VISIBLE);
                        secH18b2c0.setVisibility(View.VISIBLE);
                        secH18b2c2.setVisibility(View.VISIBLE);
                        lineH18b2c2.setVisibility(View.VISIBLE);
                        secH18b2c3.setVisibility(View.VISIBLE);
                        lineH18b2c3.setVisibility(View.VISIBLE);
                        secH18b2c4.setVisibility(View.VISIBLE);
                        lineH18b2c4.setVisibility(View.VISIBLE);
                        secH18b2c5.setVisibility(View.VISIBLE);
                        lineH18b2c5.setVisibility(View.VISIBLE);
                        secH18b2c6.setVisibility(View.VISIBLE);
                        lineH18b2c6.setVisibility(View.VISIBLE);
                       // secH18b2c7.setVisibility(View.VISIBLE);
                       // lineH18b2c7.setVisibility(View.VISIBLE);
                    //    secH18b2c6X.setVisibility(View.VISIBLE);
                     //   lineH18b2c6X.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        secH18b2c0.setVisibility(View.GONE);

                        chkH18b2c0.setChecked(false);
                        secH18b2c1.setVisibility(View.GONE);
                        lineH18b2c1.setVisibility(View.GONE);
                        chkH18b2c1.setChecked(false);
                        secH18b2c2.setVisibility(View.GONE);
                        lineH18b2c2.setVisibility(View.GONE);
                        chkH18b2c2.setChecked(false);
                        secH18b2c3.setVisibility(View.GONE);
                        lineH18b2c3.setVisibility(View.GONE);
                        chkH18b2c3.setChecked(false);
                        secH18b2c4.setVisibility(View.GONE);
                        lineH18b2c4.setVisibility(View.GONE);
                        chkH18b2c4.setChecked(false);
                        secH18b2c5.setVisibility(View.GONE);
                        lineH18b2c5.setVisibility(View.GONE);
                        chkH18b2c5.setChecked(false);
                        secH18b2c6.setVisibility(View.GONE);
                        lineH18b2c6.setVisibility(View.GONE);
                        chkH18b2c6.setChecked(false);
                       // secH18b2c7.setVisibility(View.GONE);
                        //lineH18b2c7.setVisibility(View.GONE);
                       // chkH18b2c7.setChecked(false);
                        secH18b2c6X.setVisibility(View.GONE);
                        lineH18b2c6X.setVisibility(View.GONE);
                        txtH18b2c6X.setText("");
                    }
                }
            });

            rdoH18b1c1 = (RadioButton) findViewById(R.id.rdoH18b1c1);
            rdoH18b1c2 = (RadioButton) findViewById(R.id.rdoH18b1c2);
            rdogrpH18b1c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH18b1c = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH18b1c.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH18b1c.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH18b1c[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        seclb18b2c.setVisibility(View.GONE);
                        chkHl8b2c.setChecked(false);

                        secH18b2c0.setVisibility(View.GONE);

                        chkH18b2c0.setChecked(false);

                        secH18b2c1.setVisibility(View.GONE);
                        lineH18b2c1.setVisibility(View.GONE);
                        chkH18b2c1.setChecked(false);
                        secH18b2c2.setVisibility(View.GONE);
                        lineH18b2c2.setVisibility(View.GONE);
                        chkH18b2c2.setChecked(false);
                        secH18b2c3.setVisibility(View.GONE);
                        lineH18b2c3.setVisibility(View.GONE);
                        chkH18b2c3.setChecked(false);
                        secH18b2c4.setVisibility(View.GONE);
                        lineH18b2c4.setVisibility(View.GONE);
                        chkH18b2c4.setChecked(false);
                        secH18b2c5.setVisibility(View.GONE);
                        lineH18b2c5.setVisibility(View.GONE);
                        chkH18b2c5.setChecked(false);
                        secH18b2c6.setVisibility(View.GONE);
                        lineH18b2c6.setVisibility(View.GONE);
                        chkH18b2c6.setChecked(false);

                        secH18b2c6X.setVisibility(View.GONE);
                        lineH18b2c6X.setVisibility(View.GONE);
                        txtH18b2c6X.setText("");
                    } else {
                        seclb18b2c.setVisibility(View.VISIBLE);
                        secH18b2c0.setVisibility(View.VISIBLE);
                        secH18b2c1.setVisibility(View.VISIBLE);
                        lineH18b2c1.setVisibility(View.VISIBLE);
                        secH18b2c2.setVisibility(View.VISIBLE);
                        lineH18b2c2.setVisibility(View.VISIBLE);
                        secH18b2c3.setVisibility(View.VISIBLE);
                        lineH18b2c3.setVisibility(View.VISIBLE);
                        secH18b2c4.setVisibility(View.VISIBLE);
                        lineH18b2c4.setVisibility(View.VISIBLE);
                        secH18b2c5.setVisibility(View.VISIBLE);
                        lineH18b2c5.setVisibility(View.VISIBLE);
                        secH18b2c6.setVisibility(View.VISIBLE);
                        lineH18b2c6.setVisibility(View.VISIBLE);
                      //  secH18b2c7.setVisibility(View.VISIBLE);
                     //   lineH18b2c7.setVisibility(View.VISIBLE);
                      //  secH18b2c6X.setVisibility(View.VISIBLE);
                       // lineH18b2c6X.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH18b2c1 = (LinearLayout) findViewById(R.id.secH18b2c1);
            lineH18b2c1 = (View) findViewById(R.id.lineH18b2c1);
            VlblH18b2c1 = (TextView) findViewById(R.id.VlblH18b2c1);
            chkH18b2c1 = (CheckBox) findViewById(R.id.chkH18b2c1);
            secH18b2c2 = (LinearLayout) findViewById(R.id.secH18b2c2);
            lineH18b2c2 = (View) findViewById(R.id.lineH18b2c2);
            VlblH18b2c2 = (TextView) findViewById(R.id.VlblH18b2c2);
            chkH18b2c2 = (CheckBox) findViewById(R.id.chkH18b2c2);
            secH18b2c3 = (LinearLayout) findViewById(R.id.secH18b2c3);
            lineH18b2c3 = (View) findViewById(R.id.lineH18b2c3);
            VlblH18b2c3 = (TextView) findViewById(R.id.VlblH18b2c3);
            chkH18b2c3 = (CheckBox) findViewById(R.id.chkH18b2c3);
            secH18b2c4 = (LinearLayout) findViewById(R.id.secH18b2c4);
            lineH18b2c4 = (View) findViewById(R.id.lineH18b2c4);
            VlblH18b2c4 = (TextView) findViewById(R.id.VlblH18b2c4);
            chkH18b2c4 = (CheckBox) findViewById(R.id.chkH18b2c4);
            secH18b2c5 = (LinearLayout) findViewById(R.id.secH18b2c5);
            lineH18b2c5 = (View) findViewById(R.id.lineH18b2c5);
            VlblH18b2c5 = (TextView) findViewById(R.id.VlblH18b2c5);
            chkH18b2c5 = (CheckBox) findViewById(R.id.chkH18b2c5);
            secH18b2c6 = (LinearLayout) findViewById(R.id.secH18b2c6);
            lineH18b2c6 = (View) findViewById(R.id.lineH18b2c6);
            VlblH18b2c6 = (TextView) findViewById(R.id.VlblH18b2c6);
            chkH18b2c6 = (CheckBox) findViewById(R.id.chkH18b2c6);

            chkH18b2c6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {
                        secH18b2c6X.setVisibility(View.GONE);
                        lineH18b2c6X.setVisibility(View.GONE);
                        txtH18b2c6X.setText("");
                      //  secH18b1d.setVisibility(View.GONE);
                      //  lineH18b1d.setVisibility(View.GONE);
                      //  rdogrpH18b1d.clearCheck();
                    }
                    else
                    {
                        secH18b2c6X.setVisibility(View.VISIBLE);
                        lineH18b2c6X.setVisibility(View.VISIBLE);
                    }
                }
            });
            secH18b2c6X = (LinearLayout) findViewById(R.id.secH18b2c6X);
            lineH18b2c6X = (View) findViewById(R.id.lineH18b2c6X);
            VlblH18b2c6X = (TextView) findViewById(R.id.VlblH18b2c6X);
            txtH18b2c6X = (EditText) findViewById(R.id.txtH18b2c6X);

            secH18b2c6X.setVisibility(View.GONE);
            lineH18b2c6X.setVisibility(View.GONE);

            secH18b1d = (LinearLayout) findViewById(R.id.secH18b1d);
            lineH18b1d = (View) findViewById(R.id.lineH18b1d);
            VlblH18b1d = (TextView) findViewById(R.id.VlblH18b1d);
            rdogrpH18b1d = (RadioGroup) findViewById(R.id.rdogrpH18b1d);
            seclb18b2d = (LinearLayout) findViewById(R.id.seclb18b2d);
            chkHl8b2d = (CheckBox) findViewById(R.id.chkHl8b2d);

            chkHl8b2d.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {
                        secH18b2d0.setVisibility(View.VISIBLE);
                        secH18b2d1.setVisibility(View.VISIBLE);
                        lineH18b2d1.setVisibility(View.VISIBLE);
                        secH18b2d2.setVisibility(View.VISIBLE);
                        lineH18b2d2.setVisibility(View.VISIBLE);
                        secH18b2d3.setVisibility(View.VISIBLE);
                        lineH18b2d3.setVisibility(View.VISIBLE);
                        secH18b2d4.setVisibility(View.VISIBLE);
                        lineH18b2d4.setVisibility(View.VISIBLE);
                        secH18b2d5.setVisibility(View.VISIBLE);
                        lineH18b2d5.setVisibility(View.VISIBLE);
                        secH18b2d6.setVisibility(View.VISIBLE);
                        lineH18b2d6.setVisibility(View.VISIBLE);
                        secH18b2d7.setVisibility(View.VISIBLE);
                        lineH18b2d7.setVisibility(View.VISIBLE);
                    //    secH18b2d7X.setVisibility(View.VISIBLE);
                     //   lineH18b2d7X.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        secH18b2d0.setVisibility(View.GONE);
                        chkH18b2d0.setChecked(false);
                        secH18b2d1.setVisibility(View.GONE);
                        lineH18b2d1.setVisibility(View.GONE);
                        chkH18b2d1.setChecked(false);
                        secH18b2d2.setVisibility(View.GONE);
                        lineH18b2d2.setVisibility(View.GONE);
                        chkH18b2d2.setChecked(false);
                        secH18b2d3.setVisibility(View.GONE);
                        lineH18b2d3.setVisibility(View.GONE);
                        chkH18b2d3.setChecked(false);
                        secH18b2d4.setVisibility(View.GONE);
                        lineH18b2d4.setVisibility(View.GONE);
                        chkH18b2d4.setChecked(false);
                        secH18b2d5.setVisibility(View.GONE);
                        lineH18b2d5.setVisibility(View.GONE);
                        chkH18b2d5.setChecked(false);
                        secH18b2d6.setVisibility(View.GONE);
                        lineH18b2d6.setVisibility(View.GONE);
                        chkH18b2d6.setChecked(false);
                        secH18b2d7.setVisibility(View.GONE);
                        lineH18b2d7.setVisibility(View.GONE);
                        chkH18b2d7.setChecked(false);
                        secH18b2d7X.setVisibility(View.GONE);
                        lineH18b2d7X.setVisibility(View.GONE);
                        txtH18b2d7X.setText("");
                    }
                }
            });

            rdoH18b1d1 = (RadioButton) findViewById(R.id.rdoH18b1d1);
            rdoH18b1d2 = (RadioButton) findViewById(R.id.rdoH18b1d2);
            rdogrpH18b1d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH18b1d = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH18b1d.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH18b1d.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH18b1d[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        seclb18b2d.setVisibility(View.GONE);
                        chkHl8b2d.setChecked(false);

                        secH18b2d0.setVisibility(View.GONE);
                        chkH18b2d0.setChecked(false);

                        secH18b2d1.setVisibility(View.GONE);
                        lineH18b2d1.setVisibility(View.GONE);
                        chkH18b2d1.setChecked(false);
                        secH18b2d2.setVisibility(View.GONE);
                        lineH18b2d2.setVisibility(View.GONE);
                        chkH18b2d2.setChecked(false);
                        secH18b2d3.setVisibility(View.GONE);
                        lineH18b2d3.setVisibility(View.GONE);
                        chkH18b2d3.setChecked(false);
                        secH18b2d4.setVisibility(View.GONE);
                        lineH18b2d4.setVisibility(View.GONE);
                        chkH18b2d4.setChecked(false);
                        secH18b2d5.setVisibility(View.GONE);
                        lineH18b2d5.setVisibility(View.GONE);
                        chkH18b2d5.setChecked(false);
                        secH18b2d6.setVisibility(View.GONE);
                        lineH18b2d6.setVisibility(View.GONE);
                        chkH18b2d6.setChecked(false);
                        secH18b2d7.setVisibility(View.GONE);
                        lineH18b2d7.setVisibility(View.GONE);
                        chkH18b2d7.setChecked(false);
                        secH18b2d7X.setVisibility(View.GONE);
                        lineH18b2d7X.setVisibility(View.GONE);
                        txtH18b2d7X.setText("");
                    } else {
                        seclb18b2d.setVisibility(View.VISIBLE);
                        secH18b2d0.setVisibility(View.VISIBLE);
                        secH18b2d1.setVisibility(View.VISIBLE);
                        lineH18b2d1.setVisibility(View.VISIBLE);
                        secH18b2d2.setVisibility(View.VISIBLE);
                        lineH18b2d2.setVisibility(View.VISIBLE);
                        secH18b2d3.setVisibility(View.VISIBLE);
                        lineH18b2d3.setVisibility(View.VISIBLE);
                        secH18b2d4.setVisibility(View.VISIBLE);
                        lineH18b2d4.setVisibility(View.VISIBLE);
                        secH18b2d5.setVisibility(View.VISIBLE);
                        lineH18b2d5.setVisibility(View.VISIBLE);
                        secH18b2d6.setVisibility(View.VISIBLE);
                        lineH18b2d6.setVisibility(View.VISIBLE);
                        secH18b2d7.setVisibility(View.VISIBLE);
                        lineH18b2d7.setVisibility(View.VISIBLE);
                      //  secH18b2d7X.setVisibility(View.VISIBLE);
                      //  lineH18b2d7X.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH18b2d1 = (LinearLayout) findViewById(R.id.secH18b2d1);
            lineH18b2d1 = (View) findViewById(R.id.lineH18b2d1);
            VlblH18b2d1 = (TextView) findViewById(R.id.VlblH18b2d1);
            chkH18b2d1 = (CheckBox) findViewById(R.id.chkH18b2d1);
            secH18b2d2 = (LinearLayout) findViewById(R.id.secH18b2d2);
            lineH18b2d2 = (View) findViewById(R.id.lineH18b2d2);
            VlblH18b2d2 = (TextView) findViewById(R.id.VlblH18b2d2);
            chkH18b2d2 = (CheckBox) findViewById(R.id.chkH18b2d2);
            secH18b2d3 = (LinearLayout) findViewById(R.id.secH18b2d3);
            lineH18b2d3 = (View) findViewById(R.id.lineH18b2d3);
            VlblH18b2d3 = (TextView) findViewById(R.id.VlblH18b2d3);
            chkH18b2d3 = (CheckBox) findViewById(R.id.chkH18b2d3);
            secH18b2d4 = (LinearLayout) findViewById(R.id.secH18b2d4);
            lineH18b2d4 = (View) findViewById(R.id.lineH18b2d4);
            VlblH18b2d4 = (TextView) findViewById(R.id.VlblH18b2d4);
            chkH18b2d4 = (CheckBox) findViewById(R.id.chkH18b2d4);
            secH18b2d5 = (LinearLayout) findViewById(R.id.secH18b2d5);
            lineH18b2d5 = (View) findViewById(R.id.lineH18b2d5);
            VlblH18b2d5 = (TextView) findViewById(R.id.VlblH18b2d5);
            chkH18b2d5 = (CheckBox) findViewById(R.id.chkH18b2d5);
            secH18b2d6 = (LinearLayout) findViewById(R.id.secH18b2d6);
            lineH18b2d6 = (View) findViewById(R.id.lineH18b2d6);
            VlblH18b2d6 = (TextView) findViewById(R.id.VlblH18b2d6);
            chkH18b2d6 = (CheckBox) findViewById(R.id.chkH18b2d6);
            secH18b2d7 = (LinearLayout) findViewById(R.id.secH18b2d7);
            lineH18b2d7 = (View) findViewById(R.id.lineH18b2d7);
            VlblH18b2d7 = (TextView) findViewById(R.id.VlblH18b2d7);
            chkH18b2d7 = (CheckBox) findViewById(R.id.chkH18b2d7);
            chkH18b2d7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {
                        secH18b2d7X.setVisibility(View.GONE);
                        lineH18b2d7X.setVisibility(View.GONE);
                        txtH18b2d7X.setText("");
                       // secH18b1e.setVisibility(View.GONE);
                      //  lineH18b1e.setVisibility(View.GONE);
                       // rdogrpH18b1e.clearCheck();
                    }
                    else
                    {
                        secH18b2d7X.setVisibility(View.VISIBLE);
                        lineH18b2d7X.setVisibility(View.VISIBLE);
                    }
                }
            });
            secH18b2d7X = (LinearLayout) findViewById(R.id.secH18b2d7X);
            lineH18b2d7X = (View) findViewById(R.id.lineH18b2d7X);
            VlblH18b2d7X = (TextView) findViewById(R.id.VlblH18b2d7X);
            txtH18b2d7X = (EditText) findViewById(R.id.txtH18b2d7X);

            secH18b2d7X.setVisibility(View.GONE);
            lineH18b2d7X.setVisibility(View.GONE);

            secH18b1e = (LinearLayout) findViewById(R.id.secH18b1e);
            lineH18b1e = (View) findViewById(R.id.lineH18b1e);
            VlblH18b1e = (TextView) findViewById(R.id.VlblH18b1e);
            rdogrpH18b1e = (RadioGroup) findViewById(R.id.rdogrpH18b1e);
            seclb18b2e = (LinearLayout) findViewById(R.id.seclb18b2e);
            chkHl8b2e = (CheckBox) findViewById(R.id.chkHl8b2e);

            chkHl8b2e.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {

                        secH18b2e0.setVisibility(View.VISIBLE);
                        secH18b2e1.setVisibility(View.VISIBLE);
                        lineH18b2e1.setVisibility(View.VISIBLE);
                        secH18b2e2.setVisibility(View.VISIBLE);
                        lineH18b2e2.setVisibility(View.VISIBLE);
                        secH18b2e3.setVisibility(View.VISIBLE);
                        lineH18b2e3.setVisibility(View.VISIBLE);
                        secH18b2e4.setVisibility(View.VISIBLE);
                        lineH18b2e4.setVisibility(View.VISIBLE);
                        secH18b2e5.setVisibility(View.VISIBLE);
                        lineH18b2e5.setVisibility(View.VISIBLE);
                        secH18b2e6.setVisibility(View.VISIBLE);
                        lineH18b2e6.setVisibility(View.VISIBLE);
                      //  secH18b2e7.setVisibility(View.VISIBLE);
                      //  lineH18b2e7.setVisibility(View.VISIBLE);
                      //  secH18b2e7X.setVisibility(View.VISIBLE);
                     //   lineH18b2e7X.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        secH18b2e0.setVisibility(View.GONE);
                        chkH18b2e0.setChecked(false);

                        secH18b2e1.setVisibility(View.GONE);
                        lineH18b2e1.setVisibility(View.GONE);
                        chkH18b2e1.setChecked(false);
                        secH18b2e2.setVisibility(View.GONE);
                        lineH18b2e2.setVisibility(View.GONE);
                        chkH18b2e2.setChecked(false);
                        secH18b2e3.setVisibility(View.GONE);
                        lineH18b2e3.setVisibility(View.GONE);
                        chkH18b2e3.setChecked(false);
                        secH18b2e4.setVisibility(View.GONE);
                        lineH18b2e4.setVisibility(View.GONE);
                        chkH18b2e4.setChecked(false);
                        secH18b2e5.setVisibility(View.GONE);
                        lineH18b2e5.setVisibility(View.GONE);
                        chkH18b2e5.setChecked(false);
                        secH18b2e6.setVisibility(View.GONE);
                        lineH18b2e6.setVisibility(View.GONE);
                        chkH18b2e6.setChecked(false);
                      //  secH18b2e7.setVisibility(View.GONE);
                      //  lineH18b2e7.setVisibility(View.GONE);
                      //  chkH18b2e7.setChecked(false);
                        secH18b2e6X.setVisibility(View.GONE);
                        lineH18b2e6X.setVisibility(View.GONE);
                        txtH18b2e6X.setText("");
                    }
                }
            });

            rdoH18b1e1 = (RadioButton) findViewById(R.id.rdoH18b1e1);
            rdoH18b1e2 = (RadioButton) findViewById(R.id.rdoH18b1e2);
            rdogrpH18b1e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH18b1e = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH18b1e.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH18b1e.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH18b1e[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH18b2e0.setVisibility(View.GONE);
                        chkH18b2e0.setChecked(false);
                        seclb18b2e.setVisibility(View.GONE);
                        chkHl8b2e.setChecked(false);
                        secH18b2e1.setVisibility(View.GONE);
                        lineH18b2e1.setVisibility(View.GONE);
                        chkH18b2e1.setChecked(false);
                        secH18b2e2.setVisibility(View.GONE);
                        lineH18b2e2.setVisibility(View.GONE);
                        chkH18b2e2.setChecked(false);
                        secH18b2e3.setVisibility(View.GONE);
                        lineH18b2e3.setVisibility(View.GONE);
                        chkH18b2e3.setChecked(false);
                        secH18b2e4.setVisibility(View.GONE);
                        lineH18b2e4.setVisibility(View.GONE);
                        chkH18b2e4.setChecked(false);
                        secH18b2e5.setVisibility(View.GONE);
                        lineH18b2e5.setVisibility(View.GONE);
                        chkH18b2e5.setChecked(false);
                        secH18b2e6.setVisibility(View.GONE);
                        lineH18b2e6.setVisibility(View.GONE);
                        chkH18b2e6.setChecked(false);
                       // secH18b2e7.setVisibility(View.GONE);
                       // lineH18b2e7.setVisibility(View.GONE);
                       // chkH18b2e7.setChecked(false);
                        secH18b2e6X.setVisibility(View.GONE);
                        lineH18b2e6X.setVisibility(View.GONE);
                        txtH18b2e6X.setText("");
                    } else {
                        seclb18b2e.setVisibility(View.VISIBLE);
                        secH18b2e0.setVisibility(View.VISIBLE);
                        secH18b2e1.setVisibility(View.VISIBLE);
                        lineH18b2e1.setVisibility(View.VISIBLE);
                        secH18b2e2.setVisibility(View.VISIBLE);
                        lineH18b2e2.setVisibility(View.VISIBLE);
                        secH18b2e3.setVisibility(View.VISIBLE);
                        lineH18b2e3.setVisibility(View.VISIBLE);
                        secH18b2e4.setVisibility(View.VISIBLE);
                        lineH18b2e4.setVisibility(View.VISIBLE);
                        secH18b2e5.setVisibility(View.VISIBLE);
                        lineH18b2e5.setVisibility(View.VISIBLE);
                        secH18b2e6.setVisibility(View.VISIBLE);
                        lineH18b2e6.setVisibility(View.VISIBLE);
                   //     secH18b2e7.setVisibility(View.VISIBLE);
                     //   lineH18b2e7.setVisibility(View.VISIBLE);
                     //   secH18b2e7X.setVisibility(View.VISIBLE);
                     //   lineH18b2e7X.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH18b2e1 = (LinearLayout) findViewById(R.id.secH18b2e1);
            lineH18b2e1 = (View) findViewById(R.id.lineH18b2e1);
            VlblH18b2e1 = (TextView) findViewById(R.id.VlblH18b2e1);
            chkH18b2e1 = (CheckBox) findViewById(R.id.chkH18b2e1);
            secH18b2e2 = (LinearLayout) findViewById(R.id.secH18b2e2);
            lineH18b2e2 = (View) findViewById(R.id.lineH18b2e2);
            VlblH18b2e2 = (TextView) findViewById(R.id.VlblH18b2e2);
            chkH18b2e2 = (CheckBox) findViewById(R.id.chkH18b2e2);
            secH18b2e3 = (LinearLayout) findViewById(R.id.secH18b2e3);
            lineH18b2e3 = (View) findViewById(R.id.lineH18b2e3);
            VlblH18b2e3 = (TextView) findViewById(R.id.VlblH18b2e3);
            chkH18b2e3 = (CheckBox) findViewById(R.id.chkH18b2e3);
            secH18b2e4 = (LinearLayout) findViewById(R.id.secH18b2e4);
            lineH18b2e4 = (View) findViewById(R.id.lineH18b2e4);
            VlblH18b2e4 = (TextView) findViewById(R.id.VlblH18b2e4);
            chkH18b2e4 = (CheckBox) findViewById(R.id.chkH18b2e4);
            secH18b2e5 = (LinearLayout) findViewById(R.id.secH18b2e5);
            lineH18b2e5 = (View) findViewById(R.id.lineH18b2e5);
            VlblH18b2e5 = (TextView) findViewById(R.id.VlblH18b2e5);
            chkH18b2e5 = (CheckBox) findViewById(R.id.chkH18b2e5);
            secH18b2e6 = (LinearLayout) findViewById(R.id.secH18b2e6);
            lineH18b2e6 = (View) findViewById(R.id.lineH18b2e6);
            VlblH18b2e6 = (TextView) findViewById(R.id.VlblH18b2e6);
            chkH18b2e6 = (CheckBox) findViewById(R.id.chkH18b2e6);
         //   secH18b2e7 = (LinearLayout) findViewById(R.id.secH18b2e7);
          //  lineH18b2e7 = (View) findViewById(R.id.lineH18b2e7);
         //   VlblH18b2e7 = (TextView) findViewById(R.id.VlblH18b2e7);
            chkH18b2e6 = (CheckBox) findViewById(R.id.chkH18b2e6);
            chkH18b2e6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {
                        secH18b2e6X.setVisibility(View.GONE);
                        lineH18b2e6X.setVisibility(View.GONE);
                        txtH18b2e6X.setText("");
                       // secH18b1f.setVisibility(View.GONE);
                      //  lineH18b1f.setVisibility(View.GONE);
                      //  rdogrpH18b1f.clearCheck();
                    }
                    else
                    {
                        secH18b2e6X.setVisibility(View.VISIBLE);
                        lineH18b2e6X.setVisibility(View.VISIBLE);
                    }
                }
            });
            secH18b2e6X = (LinearLayout) findViewById(R.id.secH18b2e6X);
            lineH18b2e6X = (View) findViewById(R.id.lineH18b2e6X);
            VlblH18b2e6X = (TextView) findViewById(R.id.VlblH18b2e6X);
            txtH18b2e6X = (EditText) findViewById(R.id.txtH18b2e6X);

            secH18b2e6X.setVisibility(View.GONE);
            lineH18b2e6X.setVisibility(View.GONE);

            secH18b1f = (LinearLayout) findViewById(R.id.secH18b1f);
            lineH18b1f = (View) findViewById(R.id.lineH18b1f);
            VlblH18b1f = (TextView) findViewById(R.id.VlblH18b1f);
            rdogrpH18b1f = (RadioGroup) findViewById(R.id.rdogrpH18b1f);
            seclb18b2f = (LinearLayout) findViewById(R.id.seclb18b2f);
            chkHl8b2f = (CheckBox) findViewById(R.id.chkHl8b2f);

            chkHl8b2f.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {

                        secH18b2f0.setVisibility(View.VISIBLE);
                        secH18b2f1.setVisibility(View.VISIBLE);
                        lineH18b2f1.setVisibility(View.VISIBLE);
                        secH18b2f2.setVisibility(View.VISIBLE);
                        lineH18b2f2.setVisibility(View.VISIBLE);
                        secH18b2f3.setVisibility(View.VISIBLE);
                        lineH18b2f3.setVisibility(View.VISIBLE);
                        secH18b2f4.setVisibility(View.VISIBLE);
                        lineH18b2f4.setVisibility(View.VISIBLE);
                        secH18b2f5.setVisibility(View.VISIBLE);
                        lineH18b2f5.setVisibility(View.VISIBLE);
                        secH18b2f6.setVisibility(View.VISIBLE);
                        lineH18b2f6.setVisibility(View.VISIBLE);
                        secH18b2f7.setVisibility(View.VISIBLE);
                        lineH18b2f7.setVisibility(View.VISIBLE);
                      //  secH18b2f7X.setVisibility(View.VISIBLE);
                       // lineH18b2f7X.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        secH18b2f0.setVisibility(View.GONE);
                        chkH18b2f0.setChecked(false);

                        secH18b2f1.setVisibility(View.GONE);
                        lineH18b2f1.setVisibility(View.GONE);
                        chkH18b2f1.setChecked(false);
                        secH18b2f2.setVisibility(View.GONE);
                        lineH18b2f2.setVisibility(View.GONE);
                        chkH18b2f2.setChecked(false);
                        secH18b2f3.setVisibility(View.GONE);
                        lineH18b2f3.setVisibility(View.GONE);
                        chkH18b2f3.setChecked(false);
                        secH18b2f4.setVisibility(View.GONE);
                        lineH18b2f4.setVisibility(View.GONE);
                        chkH18b2f4.setChecked(false);
                        secH18b2f5.setVisibility(View.GONE);
                        lineH18b2f5.setVisibility(View.GONE);
                        chkH18b2f5.setChecked(false);
                        secH18b2f6.setVisibility(View.GONE);
                        lineH18b2f6.setVisibility(View.GONE);
                        chkH18b2f6.setChecked(false);
                        secH18b2f7.setVisibility(View.GONE);
                        lineH18b2f7.setVisibility(View.GONE);
                        chkH18b2f7.setChecked(false);
                        secH18b2f7X.setVisibility(View.GONE);
                        lineH18b2f7X.setVisibility(View.GONE);
                        txtH18b2f7X.setText("");
                    }
                }
            });

            rdoH18b1f1 = (RadioButton) findViewById(R.id.rdoH18b1f1);
            rdoH18b1f2 = (RadioButton) findViewById(R.id.rdoH18b1f2);
            rdogrpH18b1f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH18b1f = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH18b1f.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH18b1f.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH18b1f[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {

                        secH18b2f0.setVisibility(View.GONE);
                        chkH18b2f0.setChecked(false);
                        seclb18b2f.setVisibility(View.GONE);
                        chkHl8b2f.setChecked(false);
                        secH18b2f1.setVisibility(View.GONE);
                        lineH18b2f1.setVisibility(View.GONE);
                        chkH18b2f1.setChecked(false);
                        secH18b2f2.setVisibility(View.GONE);
                        lineH18b2f2.setVisibility(View.GONE);
                        chkH18b2f2.setChecked(false);
                        secH18b2f3.setVisibility(View.GONE);
                        lineH18b2f3.setVisibility(View.GONE);
                        chkH18b2f3.setChecked(false);
                        secH18b2f4.setVisibility(View.GONE);
                        lineH18b2f4.setVisibility(View.GONE);
                        chkH18b2f4.setChecked(false);
                        secH18b2f5.setVisibility(View.GONE);
                        lineH18b2f5.setVisibility(View.GONE);
                        chkH18b2f5.setChecked(false);
                        secH18b2f6.setVisibility(View.GONE);
                        lineH18b2f6.setVisibility(View.GONE);
                        chkH18b2f6.setChecked(false);
                        secH18b2f7.setVisibility(View.GONE);
                        lineH18b2f7.setVisibility(View.GONE);
                        chkH18b2f7.setChecked(false);
                        secH18b2f7X.setVisibility(View.GONE);
                        lineH18b2f7X.setVisibility(View.GONE);
                        txtH18b2f7X.setText("");
                    } else {
                        seclb18b2f.setVisibility(View.VISIBLE);
                        secH18b2f0.setVisibility(View.VISIBLE);
                        secH18b2f1.setVisibility(View.VISIBLE);
                        lineH18b2f1.setVisibility(View.VISIBLE);
                        secH18b2f2.setVisibility(View.VISIBLE);
                        lineH18b2f2.setVisibility(View.VISIBLE);
                        secH18b2f3.setVisibility(View.VISIBLE);
                        lineH18b2f3.setVisibility(View.VISIBLE);
                        secH18b2f4.setVisibility(View.VISIBLE);
                        lineH18b2f4.setVisibility(View.VISIBLE);
                        secH18b2f5.setVisibility(View.VISIBLE);
                        lineH18b2f5.setVisibility(View.VISIBLE);
                        secH18b2f6.setVisibility(View.VISIBLE);
                        lineH18b2f6.setVisibility(View.VISIBLE);
                        secH18b2f7.setVisibility(View.VISIBLE);
                        lineH18b2f7.setVisibility(View.VISIBLE);
                      //  secH18b2f7X.setVisibility(View.VISIBLE);
                      //  lineH18b2f7X.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH18b2f1 = (LinearLayout) findViewById(R.id.secH18b2f1);
            lineH18b2f1 = (View) findViewById(R.id.lineH18b2f1);
            VlblH18b2f1 = (TextView) findViewById(R.id.VlblH18b2f1);
            chkH18b2f1 = (CheckBox) findViewById(R.id.chkH18b2f1);
            secH18b2f2 = (LinearLayout) findViewById(R.id.secH18b2f2);
            lineH18b2f2 = (View) findViewById(R.id.lineH18b2f2);
            VlblH18b2f2 = (TextView) findViewById(R.id.VlblH18b2f2);
            chkH18b2f2 = (CheckBox) findViewById(R.id.chkH18b2f2);
            secH18b2f3 = (LinearLayout) findViewById(R.id.secH18b2f3);
            lineH18b2f3 = (View) findViewById(R.id.lineH18b2f3);
            VlblH18b2f3 = (TextView) findViewById(R.id.VlblH18b2f3);
            chkH18b2f3 = (CheckBox) findViewById(R.id.chkH18b2f3);
            secH18b2f4 = (LinearLayout) findViewById(R.id.secH18b2f4);
            lineH18b2f4 = (View) findViewById(R.id.lineH18b2f4);
            VlblH18b2f4 = (TextView) findViewById(R.id.VlblH18b2f4);
            chkH18b2f4 = (CheckBox) findViewById(R.id.chkH18b2f4);
            secH18b2f5 = (LinearLayout) findViewById(R.id.secH18b2f5);
            lineH18b2f5 = (View) findViewById(R.id.lineH18b2f5);
            VlblH18b2f5 = (TextView) findViewById(R.id.VlblH18b2f5);
            chkH18b2f5 = (CheckBox) findViewById(R.id.chkH18b2f5);
            secH18b2f6 = (LinearLayout) findViewById(R.id.secH18b2f6);
            lineH18b2f6 = (View) findViewById(R.id.lineH18b2f6);
            VlblH18b2f6 = (TextView) findViewById(R.id.VlblH18b2f6);
            chkH18b2f6 = (CheckBox) findViewById(R.id.chkH18b2f6);
            secH18b2f7 = (LinearLayout) findViewById(R.id.secH18b2f7);
            lineH18b2f7 = (View) findViewById(R.id.lineH18b2f7);
            VlblH18b2f7 = (TextView) findViewById(R.id.VlblH18b2f7);
            chkH18b2f7 = (CheckBox) findViewById(R.id.chkH18b2f7);
            chkH18b2f7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {
                        secH18b2f7X.setVisibility(View.GONE);
                        lineH18b2f7X.setVisibility(View.GONE);
                        txtH18b2f7X.setText("");
                       // secH18b1g.setVisibility(View.GONE);
                      //  lineH18b1g.setVisibility(View.GONE);
                      //  rdogrpH18b1g.clearCheck();
                    }
                    else
                    {
                        secH18b2f7X.setVisibility(View.VISIBLE);
                        lineH18b2f7X.setVisibility(View.VISIBLE);
                    }
                }
            });
            secH18b2f7X = (LinearLayout) findViewById(R.id.secH18b2f7X);
            lineH18b2f7X = (View) findViewById(R.id.lineH18b2f7X);
            VlblH18b2f7X = (TextView) findViewById(R.id.VlblH18b2f7X);
            txtH18b2f7X = (EditText) findViewById(R.id.txtH18b2f7X);

            secH18b2f7X.setVisibility(View.GONE);
            lineH18b2f7X.setVisibility(View.GONE);

            secH18b1g = (LinearLayout) findViewById(R.id.secH18b1g);
            lineH18b1g = (View) findViewById(R.id.lineH18b1g);
            VlblH18b1g = (TextView) findViewById(R.id.VlblH18b1g);
            rdogrpH18b1g = (RadioGroup) findViewById(R.id.rdogrpH18b1g);
            seclb18b2g = (LinearLayout) findViewById(R.id.seclb18b2g);
            chkHl8b2g = (CheckBox) findViewById(R.id.chkHl8b2g);

            chkHl8b2g.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {
                        secH18b2g0.setVisibility(View.VISIBLE);
                        secH18b2g1.setVisibility(View.VISIBLE);
                        lineH18b2g1.setVisibility(View.VISIBLE);
                        secH18b2g2.setVisibility(View.VISIBLE);
                        lineH18b2g2.setVisibility(View.VISIBLE);
                        secH18b2g3.setVisibility(View.VISIBLE);
                        lineH18b2g3.setVisibility(View.VISIBLE);
                        secH18b2g4.setVisibility(View.VISIBLE);
                        lineH18b2g4.setVisibility(View.VISIBLE);
                        secH18b2g5.setVisibility(View.VISIBLE);
                        lineH18b2g5.setVisibility(View.VISIBLE);
                        secH18b2g6.setVisibility(View.VISIBLE);
                        lineH18b2g6.setVisibility(View.VISIBLE);
                        secH18b2g7.setVisibility(View.VISIBLE);
                        lineH18b2g7.setVisibility(View.VISIBLE);
                        secH18b2g8.setVisibility(View.VISIBLE);
                        lineH18b2g8.setVisibility(View.VISIBLE);
                        secH18b2g9.setVisibility(View.VISIBLE);
                        lineH18b2g9.setVisibility(View.VISIBLE);
                     //   secH18b2g7X.setVisibility(View.VISIBLE);
                    //    lineH18b2g7X.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        secH18b2g0.setVisibility(View.GONE);
                        chkH18b2g0.setChecked(false);

                        secH18b2g1.setVisibility(View.GONE);
                        lineH18b2g1.setVisibility(View.GONE);
                        chkH18b2g1.setChecked(false);
                        secH18b2g2.setVisibility(View.GONE);
                        lineH18b2g2.setVisibility(View.GONE);
                        chkH18b2g2.setChecked(false);
                        secH18b2g3.setVisibility(View.GONE);
                        lineH18b2g3.setVisibility(View.GONE);
                        chkH18b2g3.setChecked(false);
                        secH18b2g4.setVisibility(View.GONE);
                        lineH18b2g4.setVisibility(View.GONE);
                        chkH18b2g4.setChecked(false);
                        secH18b2g5.setVisibility(View.GONE);
                        lineH18b2g5.setVisibility(View.GONE);
                        chkH18b2g5.setChecked(false);
                        secH18b2g6.setVisibility(View.GONE);
                        lineH18b2g6.setVisibility(View.GONE);
                        chkH18b2g6.setChecked(false);
                        secH18b2g7.setVisibility(View.GONE);
                        lineH18b2g7.setVisibility(View.GONE);
                        chkH18b2g7.setChecked(false);
                        secH18b2g8.setVisibility(View.GONE);
                        lineH18b2g8.setVisibility(View.GONE);
                        chkH18b2g8.setChecked(false);
                        secH18b2g9.setVisibility(View.GONE);
                        lineH18b2g9.setVisibility(View.GONE);
                        chkH18b2g9.setChecked(false);
                        secH18b2g9X.setVisibility(View.GONE);
                        lineH18b2g9X.setVisibility(View.GONE);
                        txtH18b2g9X.setText("");
                    }
                }
            });


            rdoH18b1g1 = (RadioButton) findViewById(R.id.rdoH18b1g1);
            rdoH18b1g2 = (RadioButton) findViewById(R.id.rdoH18b1g2);
            rdogrpH18b1g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH18b1g = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH18b1g.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH18b1g.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH18b1g[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        seclb18b2g.setVisibility(View.GONE);
                        chkHl8b2g.setChecked(false);
                        secH18b2g0.setVisibility(View.GONE);
                        chkH18b2g0.setChecked(false);
                        secH18b2g1.setVisibility(View.GONE);
                        lineH18b2g1.setVisibility(View.GONE);
                        chkH18b2g1.setChecked(false);
                        secH18b2g2.setVisibility(View.GONE);
                        lineH18b2g2.setVisibility(View.GONE);
                        chkH18b2g2.setChecked(false);
                        secH18b2g3.setVisibility(View.GONE);
                        lineH18b2g3.setVisibility(View.GONE);
                        chkH18b2g3.setChecked(false);
                        secH18b2g4.setVisibility(View.GONE);
                        lineH18b2g4.setVisibility(View.GONE);
                        chkH18b2g4.setChecked(false);
                        secH18b2g5.setVisibility(View.GONE);
                        lineH18b2g5.setVisibility(View.GONE);
                        chkH18b2g5.setChecked(false);
                        secH18b2g6.setVisibility(View.GONE);
                        lineH18b2g6.setVisibility(View.GONE);
                        chkH18b2g6.setChecked(false);
                        secH18b2g7.setVisibility(View.GONE);
                        lineH18b2g7.setVisibility(View.GONE);
                        chkH18b2g7.setChecked(false);
                        secH18b2g8.setVisibility(View.GONE);
                        lineH18b2g8.setVisibility(View.GONE);
                        chkH18b2g8.setChecked(false);
                        secH18b2g9.setVisibility(View.GONE);
                        lineH18b2g9.setVisibility(View.GONE);
                        chkH18b2g9.setChecked(false);
                        secH18b2g9X.setVisibility(View.GONE);
                        lineH18b2g9X.setVisibility(View.GONE);
                        txtH18b2g9X.setText("");
                    } else {
                        seclb18b2g.setVisibility(View.VISIBLE);
                        secH18b2g0.setVisibility(View.VISIBLE);
                        secH18b2g1.setVisibility(View.VISIBLE);
                        lineH18b2g1.setVisibility(View.VISIBLE);
                        secH18b2g2.setVisibility(View.VISIBLE);
                        lineH18b2g2.setVisibility(View.VISIBLE);
                        secH18b2g3.setVisibility(View.VISIBLE);
                        lineH18b2g3.setVisibility(View.VISIBLE);
                        secH18b2g4.setVisibility(View.VISIBLE);
                        lineH18b2g4.setVisibility(View.VISIBLE);
                        secH18b2g5.setVisibility(View.VISIBLE);
                        lineH18b2g5.setVisibility(View.VISIBLE);
                        secH18b2g6.setVisibility(View.VISIBLE);
                        lineH18b2g6.setVisibility(View.VISIBLE);
                        secH18b2g7.setVisibility(View.VISIBLE);
                        lineH18b2g7.setVisibility(View.VISIBLE);
                        secH18b2g8.setVisibility(View.VISIBLE);
                        lineH18b2g8.setVisibility(View.VISIBLE);
                        secH18b2g9.setVisibility(View.VISIBLE);
                        lineH18b2g9.setVisibility(View.VISIBLE);
                      //  secH18b2g7X.setVisibility(View.VISIBLE);
                    //    lineH18b2g7X.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH18b2g1 = (LinearLayout) findViewById(R.id.secH18b2g1);
            lineH18b2g1 = (View) findViewById(R.id.lineH18b2g1);
            VlblH18b2g1 = (TextView) findViewById(R.id.VlblH18b2g1);
            chkH18b2g1 = (CheckBox) findViewById(R.id.chkH18b2g1);
            secH18b2g2 = (LinearLayout) findViewById(R.id.secH18b2g2);
            lineH18b2g2 = (View) findViewById(R.id.lineH18b2g2);
            VlblH18b2g2 = (TextView) findViewById(R.id.VlblH18b2g2);
            chkH18b2g2 = (CheckBox) findViewById(R.id.chkH18b2g2);
            secH18b2g3 = (LinearLayout) findViewById(R.id.secH18b2g3);
            lineH18b2g3 = (View) findViewById(R.id.lineH18b2g3);
            VlblH18b2g3 = (TextView) findViewById(R.id.VlblH18b2g3);
            chkH18b2g3 = (CheckBox) findViewById(R.id.chkH18b2g3);
            secH18b2g4 = (LinearLayout) findViewById(R.id.secH18b2g4);
            lineH18b2g4 = (View) findViewById(R.id.lineH18b2g4);
            VlblH18b2g4 = (TextView) findViewById(R.id.VlblH18b2g4);
            chkH18b2g4 = (CheckBox) findViewById(R.id.chkH18b2g4);
            secH18b2g5 = (LinearLayout) findViewById(R.id.secH18b2g5);
            lineH18b2g5 = (View) findViewById(R.id.lineH18b2g5);
            VlblH18b2g5 = (TextView) findViewById(R.id.VlblH18b2g5);
            chkH18b2g5 = (CheckBox) findViewById(R.id.chkH18b2g5);
            secH18b2g6 = (LinearLayout) findViewById(R.id.secH18b2g6);
            lineH18b2g6 = (View) findViewById(R.id.lineH18b2g6);
            VlblH18b2g6 = (TextView) findViewById(R.id.VlblH18b2g6);
            chkH18b2g6 = (CheckBox) findViewById(R.id.chkH18b2g6);
            secH18b2g7 = (LinearLayout) findViewById(R.id.secH18b2g7);
            lineH18b2g7 = (View) findViewById(R.id.lineH18b2g7);
            VlblH18b2g7 = (TextView) findViewById(R.id.VlblH18b2g7);
            chkH18b2g7 = (CheckBox) findViewById(R.id.chkH18b2g7);
            secH18b2g8 = (LinearLayout) findViewById(R.id.secH18b2g8);
            lineH18b2g8 = (View) findViewById(R.id.lineH18b2g8);
            VlblH18b2g8 = (TextView) findViewById(R.id.VlblH18b2g8);
            chkH18b2g8 = (CheckBox) findViewById(R.id.chkH18b2g8);
            secH18b2g9 = (LinearLayout) findViewById(R.id.secH18b2g9);
            lineH18b2g9 = (View) findViewById(R.id.lineH18b2g9);
            VlblH18b2g9 = (TextView) findViewById(R.id.VlblH18b2g9);
            chkH18b2g9 = (CheckBox) findViewById(R.id.chkH18b2g9);
            chkH18b2g9.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {
                        secH18b2g9X.setVisibility(View.GONE);
                        lineH18b2g9X.setVisibility(View.GONE);
                        txtH18b2g9X.setText("");
                       // secH18b1h.setVisibility(View.GONE);
                      //  lineH18b1h.setVisibility(View.GONE);
                      //  rdogrpH18b1h.clearCheck();
                    }
                    else
                    {
                        secH18b2g9X.setVisibility(View.VISIBLE);
                        lineH18b2g9X.setVisibility(View.VISIBLE);
                    }
                }
            });
            secH18b2g9X = (LinearLayout) findViewById(R.id.secH18b2g9X);
            lineH18b2g9X = (View) findViewById(R.id.lineH18b2g9X);
            VlblH18b2g9X = (TextView) findViewById(R.id.VlblH18b2g9X);
            txtH18b2g9X = (EditText) findViewById(R.id.txtH18b2g9X);

            secH18b2g9X.setVisibility(View.GONE);
            lineH18b2g9X.setVisibility(View.GONE);

            secH18b1h = (LinearLayout) findViewById(R.id.secH18b1h);
            lineH18b1h = (View) findViewById(R.id.lineH18b1h);
            VlblH18b1h = (TextView) findViewById(R.id.VlblH18b1h);
            rdogrpH18b1h = (RadioGroup) findViewById(R.id.rdogrpH18b1h);
            seclb18b2h = (LinearLayout) findViewById(R.id.seclb18b2h);
            chkHl8b2h = (CheckBox) findViewById(R.id.chkHl8b2h);

            chkHl8b2h.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {
                        secH18b2h0.setVisibility(View.VISIBLE);
                        secH18b2h1.setVisibility(View.VISIBLE);
                        lineH18b2h1.setVisibility(View.VISIBLE);
                        secH18b2h2.setVisibility(View.VISIBLE);
                        lineH18b2h2.setVisibility(View.VISIBLE);
                        secH18b2h3.setVisibility(View.VISIBLE);
                        lineH18b2h3.setVisibility(View.VISIBLE);
                        secH18b2h4.setVisibility(View.VISIBLE);
                        lineH18b2h4.setVisibility(View.VISIBLE);
                        secH18b2h5.setVisibility(View.VISIBLE);
                        lineH18b2h5.setVisibility(View.VISIBLE);
                        secH18b2h6.setVisibility(View.VISIBLE);
                        lineH18b2h6.setVisibility(View.VISIBLE);
                        secH18b2h7.setVisibility(View.VISIBLE);
                        lineH18b2h7.setVisibility(View.VISIBLE);
                        secH18b2h8.setVisibility(View.VISIBLE);
                        lineH18b2h8.setVisibility(View.VISIBLE);
                        secH18b2h9.setVisibility(View.VISIBLE);
                        lineH18b2h9.setVisibility(View.VISIBLE);
                    //    secH18b2h7X.setVisibility(View.VISIBLE);
                    //    lineH18b2h7X.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        secH18b2h0.setVisibility(View.GONE);
                        chkH18b2h0.setChecked(false);

                        secH18b2h1.setVisibility(View.GONE);
                        lineH18b2h1.setVisibility(View.GONE);
                        chkH18b2h1.setChecked(false);
                        secH18b2h2.setVisibility(View.GONE);
                        lineH18b2h2.setVisibility(View.GONE);
                        chkH18b2h2.setChecked(false);
                        secH18b2h3.setVisibility(View.GONE);
                        lineH18b2h3.setVisibility(View.GONE);
                        chkH18b2h3.setChecked(false);
                        secH18b2h4.setVisibility(View.GONE);
                        lineH18b2h4.setVisibility(View.GONE);
                        chkH18b2h4.setChecked(false);
                        secH18b2h5.setVisibility(View.GONE);
                        lineH18b2h5.setVisibility(View.GONE);
                        chkH18b2h5.setChecked(false);
                        secH18b2h6.setVisibility(View.GONE);
                        lineH18b2h6.setVisibility(View.GONE);
                        chkH18b2h6.setChecked(false);
                        secH18b2h7.setVisibility(View.GONE);
                        lineH18b2h7.setVisibility(View.GONE);
                        chkH18b2h7.setChecked(false);
                        secH18b2h8.setVisibility(View.GONE);
                        lineH18b2h8.setVisibility(View.GONE);
                        chkH18b2h8.setChecked(false);
                        secH18b2h9.setVisibility(View.GONE);
                        lineH18b2h9.setVisibility(View.GONE);
                        chkH18b2h9.setChecked(false);
                        secH18b2h9X.setVisibility(View.GONE);
                        lineH18b2h9X.setVisibility(View.GONE);
                        txtH18b2h9X.setText("");
                    }
                }
            });

            rdoH18b1h1 = (RadioButton) findViewById(R.id.rdoH18b1h1);
            rdoH18b1h2 = (RadioButton) findViewById(R.id.rdoH18b1h2);
            rdogrpH18b1h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH18b1h = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH18b1h.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH18b1h.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH18b1h[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH18b2h0.setVisibility(View.GONE);
                        chkH18b2h0.setChecked(false);
                        seclb18b2h.setVisibility(View.GONE);
                        chkHl8b2h.setChecked(false);
                        secH18b2h1.setVisibility(View.GONE);
                        lineH18b2h1.setVisibility(View.GONE);
                        chkH18b2h1.setChecked(false);
                        secH18b2h2.setVisibility(View.GONE);
                        lineH18b2h2.setVisibility(View.GONE);
                        chkH18b2h2.setChecked(false);
                        secH18b2h3.setVisibility(View.GONE);
                        lineH18b2h3.setVisibility(View.GONE);
                        chkH18b2h3.setChecked(false);
                        secH18b2h4.setVisibility(View.GONE);
                        lineH18b2h4.setVisibility(View.GONE);
                        chkH18b2h4.setChecked(false);
                        secH18b2h5.setVisibility(View.GONE);
                        lineH18b2h5.setVisibility(View.GONE);
                        chkH18b2h5.setChecked(false);
                        secH18b2h6.setVisibility(View.GONE);
                        lineH18b2h6.setVisibility(View.GONE);
                        chkH18b2h6.setChecked(false);
                        secH18b2h7.setVisibility(View.GONE);
                        lineH18b2h7.setVisibility(View.GONE);
                        chkH18b2h7.setChecked(false);
                        secH18b2h8.setVisibility(View.GONE);
                        lineH18b2h8.setVisibility(View.GONE);
                        chkH18b2h8.setChecked(false);
                        secH18b2h9.setVisibility(View.GONE);
                        lineH18b2h9.setVisibility(View.GONE);
                        chkH18b2h9.setChecked(false);
                        secH18b2h9X.setVisibility(View.GONE);
                        lineH18b2h9X.setVisibility(View.GONE);
                        txtH18b2h9X.setText("");
                    } else {
                        seclb18b2h.setVisibility(View.VISIBLE);
                        secH18b2h0.setVisibility(View.VISIBLE);
                        secH18b2h1.setVisibility(View.VISIBLE);
                        lineH18b2h1.setVisibility(View.VISIBLE);
                        secH18b2h2.setVisibility(View.VISIBLE);
                        lineH18b2h2.setVisibility(View.VISIBLE);
                        secH18b2h3.setVisibility(View.VISIBLE);
                        lineH18b2h3.setVisibility(View.VISIBLE);
                        secH18b2h4.setVisibility(View.VISIBLE);
                        lineH18b2h4.setVisibility(View.VISIBLE);
                        secH18b2h5.setVisibility(View.VISIBLE);
                        lineH18b2h5.setVisibility(View.VISIBLE);
                        secH18b2h6.setVisibility(View.VISIBLE);
                        lineH18b2h6.setVisibility(View.VISIBLE);
                        secH18b2h7.setVisibility(View.VISIBLE);
                        lineH18b2h7.setVisibility(View.VISIBLE);
                        secH18b2h8.setVisibility(View.VISIBLE);
                        lineH18b2h8.setVisibility(View.VISIBLE);
                        secH18b2h9.setVisibility(View.VISIBLE);
                        lineH18b2h9.setVisibility(View.VISIBLE);
                     //   secH18b2h7X.setVisibility(View.VISIBLE);
                     //   lineH18b2h7X.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH18b2h1 = (LinearLayout) findViewById(R.id.secH18b2h1);
            lineH18b2h1 = (View) findViewById(R.id.lineH18b2h1);
            VlblH18b2h1 = (TextView) findViewById(R.id.VlblH18b2h1);
            chkH18b2h1 = (CheckBox) findViewById(R.id.chkH18b2h1);
            secH18b2h2 = (LinearLayout) findViewById(R.id.secH18b2h2);
            lineH18b2h2 = (View) findViewById(R.id.lineH18b2h2);
            VlblH18b2h2 = (TextView) findViewById(R.id.VlblH18b2h2);
            chkH18b2h2 = (CheckBox) findViewById(R.id.chkH18b2h2);
            secH18b2h3 = (LinearLayout) findViewById(R.id.secH18b2h3);
            lineH18b2h3 = (View) findViewById(R.id.lineH18b2h3);
            VlblH18b2h3 = (TextView) findViewById(R.id.VlblH18b2h3);
            chkH18b2h3 = (CheckBox) findViewById(R.id.chkH18b2h3);
            secH18b2h4 = (LinearLayout) findViewById(R.id.secH18b2h4);
            lineH18b2h4 = (View) findViewById(R.id.lineH18b2h4);
            VlblH18b2h4 = (TextView) findViewById(R.id.VlblH18b2h4);
            chkH18b2h4 = (CheckBox) findViewById(R.id.chkH18b2h4);
            secH18b2h5 = (LinearLayout) findViewById(R.id.secH18b2h5);
            lineH18b2h5 = (View) findViewById(R.id.lineH18b2h5);
            VlblH18b2h5 = (TextView) findViewById(R.id.VlblH18b2h5);
            chkH18b2h5 = (CheckBox) findViewById(R.id.chkH18b2h5);
            secH18b2h6 = (LinearLayout) findViewById(R.id.secH18b2h6);
            lineH18b2h6 = (View) findViewById(R.id.lineH18b2h6);
            VlblH18b2h6 = (TextView) findViewById(R.id.VlblH18b2h6);
            chkH18b2h6 = (CheckBox) findViewById(R.id.chkH18b2h6);
            secH18b2h7 = (LinearLayout) findViewById(R.id.secH18b2h7);
            lineH18b2h7 = (View) findViewById(R.id.lineH18b2h7);
            VlblH18b2h7 = (TextView) findViewById(R.id.VlblH18b2h7);
            chkH18b2h7 = (CheckBox) findViewById(R.id.chkH18b2h7);
            secH18b2h8 = (LinearLayout) findViewById(R.id.secH18b2h8);
            lineH18b2h8 = (View) findViewById(R.id.lineH18b2h8);
            VlblH18b2h8 = (TextView) findViewById(R.id.VlblH18b2h8);
            chkH18b2h8 = (CheckBox) findViewById(R.id.chkH18b2h8);
            secH18b2h9 = (LinearLayout) findViewById(R.id.secH18b2h9);
            lineH18b2h9 = (View) findViewById(R.id.lineH18b2h9);
            VlblH18b2h9 = (TextView) findViewById(R.id.VlblH18b2h9);
            chkH18b2h9 = (CheckBox) findViewById(R.id.chkH18b2h9);
            chkH18b2h9.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {
                        secH18b2h9X.setVisibility(View.GONE);
                        lineH18b2h9X.setVisibility(View.GONE);
                        txtH18b2h9X.setText("");
                      //  secH18b1i.setVisibility(View.GONE);
                      //  lineH18b1i.setVisibility(View.GONE);
                      //  rdogrpH18b1i.clearCheck();
                    }
                    else
                    {
                        secH18b2h9X.setVisibility(View.VISIBLE);
                        lineH18b2h9X.setVisibility(View.VISIBLE);
                    }
                }
            });
            secH18b2h9X = (LinearLayout) findViewById(R.id.secH18b2h9X);
            lineH18b2h9X = (View) findViewById(R.id.lineH18b2h9X);
            VlblH18b2h9X = (TextView) findViewById(R.id.VlblH18b2h9X);
            txtH18b2h9X = (EditText) findViewById(R.id.txtH18b2h9X);

            secH18b2h9X.setVisibility(View.GONE);
            lineH18b2h9X.setVisibility(View.GONE);

            secH18b1i = (LinearLayout) findViewById(R.id.secH18b1i);
            lineH18b1i = (View) findViewById(R.id.lineH18b1i);
            VlblH18b1i = (TextView) findViewById(R.id.VlblH18b1i);
            rdogrpH18b1i = (RadioGroup) findViewById(R.id.rdogrpH18b1i);
            seclb18b2i = (LinearLayout) findViewById(R.id.seclb18b2i);
            chkHl8b2i = (CheckBox) findViewById(R.id.chkHl8b2i);

            chkHl8b2i.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {
                        secH18b2i0.setVisibility(View.VISIBLE);
                        secH18b2i1.setVisibility(View.VISIBLE);
                        lineH18b2i1.setVisibility(View.VISIBLE);
                        secH18b2i2.setVisibility(View.VISIBLE);
                        lineH18b2i2.setVisibility(View.VISIBLE);
                        secH18b2i3.setVisibility(View.VISIBLE);
                        lineH18b2i3.setVisibility(View.VISIBLE);
                        secH18b2i4.setVisibility(View.VISIBLE);
                        lineH18b2i4.setVisibility(View.VISIBLE);
                        secH18b2i5.setVisibility(View.VISIBLE);
                        lineH18b2i5.setVisibility(View.VISIBLE);
                    //    secH18b2i5X.setVisibility(View.VISIBLE);
                    //    lineH18b2i5X.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        secH18b2i0.setVisibility(View.GONE);
                        chkH18b2i0.setChecked(false);

                        secH18b2i1.setVisibility(View.GONE);
                        lineH18b2i1.setVisibility(View.GONE);
                        chkH18b2i1.setChecked(false);
                        secH18b2i2.setVisibility(View.GONE);
                        lineH18b2i2.setVisibility(View.GONE);
                        chkH18b2i2.setChecked(false);
                        secH18b2i3.setVisibility(View.GONE);
                        lineH18b2i3.setVisibility(View.GONE);
                        chkH18b2i3.setChecked(false);
                        secH18b2i4.setVisibility(View.GONE);
                        lineH18b2i4.setVisibility(View.GONE);
                        chkH18b2i4.setChecked(false);
                        secH18b2i5.setVisibility(View.GONE);
                        lineH18b2i5.setVisibility(View.GONE);
                        chkH18b2i5.setChecked(false);
                        secH18b2i5X.setVisibility(View.GONE);
                        lineH18b2i5X.setVisibility(View.GONE);
                        txtH18b2i5X.setText("");
                    }
                }
            });

            rdoH18b1i1 = (RadioButton) findViewById(R.id.rdoH18b1i1);
            rdoH18b1i2 = (RadioButton) findViewById(R.id.rdoH18b1i2);
            rdogrpH18b1i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH18b1i = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH18b1i.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH18b1i.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH18b1i[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH18b2i0.setVisibility(View.GONE);
                        chkH18b2i0.setChecked(false);
                        seclb18b2i.setVisibility(View.GONE);
                        chkHl8b2i.setChecked(false);
                        secH18b2i1.setVisibility(View.GONE);
                        lineH18b2i1.setVisibility(View.GONE);
                        chkH18b2i1.setChecked(false);
                        secH18b2i2.setVisibility(View.GONE);
                        lineH18b2i2.setVisibility(View.GONE);
                        chkH18b2i2.setChecked(false);
                        secH18b2i3.setVisibility(View.GONE);
                        lineH18b2i3.setVisibility(View.GONE);
                        chkH18b2i3.setChecked(false);
                        secH18b2i4.setVisibility(View.GONE);
                        lineH18b2i4.setVisibility(View.GONE);
                        chkH18b2i4.setChecked(false);
                        secH18b2i5.setVisibility(View.GONE);
                        lineH18b2i5.setVisibility(View.GONE);
                        chkH18b2i5.setChecked(false);
                        secH18b2i5X.setVisibility(View.GONE);
                        lineH18b2i5X.setVisibility(View.GONE);
                        txtH18b2i5X.setText("");
                    } else {
                        seclb18b2i.setVisibility(View.VISIBLE);
                        secH18b2i0.setVisibility(View.VISIBLE);
                        secH18b2i1.setVisibility(View.VISIBLE);
                        lineH18b2i1.setVisibility(View.VISIBLE);
                        secH18b2i2.setVisibility(View.VISIBLE);
                        lineH18b2i2.setVisibility(View.VISIBLE);
                        secH18b2i3.setVisibility(View.VISIBLE);
                        lineH18b2i3.setVisibility(View.VISIBLE);
                        secH18b2i4.setVisibility(View.VISIBLE);
                        lineH18b2i4.setVisibility(View.VISIBLE);
                        secH18b2i5.setVisibility(View.VISIBLE);
                        lineH18b2i5.setVisibility(View.VISIBLE);
                     //   secH18b2i5X.setVisibility(View.VISIBLE);
                   //     lineH18b2i5X.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH18b2i1 = (LinearLayout) findViewById(R.id.secH18b2i1);
            lineH18b2i1 = (View) findViewById(R.id.lineH18b2i1);
            VlblH18b2i1 = (TextView) findViewById(R.id.VlblH18b2i1);
            chkH18b2i1 = (CheckBox) findViewById(R.id.chkH18b2i1);
            secH18b2i2 = (LinearLayout) findViewById(R.id.secH18b2i2);
            lineH18b2i2 = (View) findViewById(R.id.lineH18b2i2);
            VlblH18b2i2 = (TextView) findViewById(R.id.VlblH18b2i2);
            chkH18b2i2 = (CheckBox) findViewById(R.id.chkH18b2i2);
            secH18b2i3 = (LinearLayout) findViewById(R.id.secH18b2i3);
            lineH18b2i3 = (View) findViewById(R.id.lineH18b2i3);
            VlblH18b2i3 = (TextView) findViewById(R.id.VlblH18b2i3);
            chkH18b2i3 = (CheckBox) findViewById(R.id.chkH18b2i3);
            secH18b2i4 = (LinearLayout) findViewById(R.id.secH18b2i4);
            lineH18b2i4 = (View) findViewById(R.id.lineH18b2i4);
            VlblH18b2i4 = (TextView) findViewById(R.id.VlblH18b2i4);
            chkH18b2i4 = (CheckBox) findViewById(R.id.chkH18b2i4);
            secH18b2i5 = (LinearLayout) findViewById(R.id.secH18b2i5);
            lineH18b2i5 = (View) findViewById(R.id.lineH18b2i5);
            VlblH18b2i5 = (TextView) findViewById(R.id.VlblH18b2i5);
            chkH18b2i5 = (CheckBox) findViewById(R.id.chkH18b2i5);
            chkH18b2i5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {
                        secH18b2i5X.setVisibility(View.GONE);
                        lineH18b2i5X.setVisibility(View.GONE);
                        txtH18b2i5X.setText("");
                      //  secH18b1j.setVisibility(View.GONE);
                      //  lineH18b1j.setVisibility(View.GONE);
                      //  rdogrpH18b1j.clearCheck();
                    }
                    else
                    {
                        secH18b2i5X.setVisibility(View.VISIBLE);
                        lineH18b2i5X.setVisibility(View.VISIBLE);
                    }
                }
            });
            secH18b2i5X = (LinearLayout) findViewById(R.id.secH18b2i5X);
            lineH18b2i5X = (View) findViewById(R.id.lineH18b2i5X);
            VlblH18b2i5X = (TextView) findViewById(R.id.VlblH18b2i5X);
            txtH18b2i5X = (EditText) findViewById(R.id.txtH18b2i5X);

            secH18b2i5X.setVisibility(View.GONE);
            lineH18b2i5X.setVisibility(View.GONE);

            secH18b1j = (LinearLayout) findViewById(R.id.secH18b1j);
            lineH18b1j = (View) findViewById(R.id.lineH18b1j);
            VlblH18b1j = (TextView) findViewById(R.id.VlblH18b1j);
            rdogrpH18b1j = (RadioGroup) findViewById(R.id.rdogrpH18b1j);
            seclb18b2j = (LinearLayout) findViewById(R.id.seclb18b2j);
            chkHl8b2j = (CheckBox) findViewById(R.id.chkHl8b2j);

            chkHl8b2j.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {
                        secH18b2j0.setVisibility(View.VISIBLE);
                        secH18b2j1.setVisibility(View.VISIBLE);
                        lineH18b2j1.setVisibility(View.VISIBLE);
                        secH18b2j2.setVisibility(View.VISIBLE);
                        lineH18b2j2.setVisibility(View.VISIBLE);
                        secH18b2j3.setVisibility(View.VISIBLE);
                        lineH18b2j3.setVisibility(View.VISIBLE);
                        secH18b2j4.setVisibility(View.VISIBLE);
                        lineH18b2j4.setVisibility(View.VISIBLE);
                        secH18b2j5.setVisibility(View.VISIBLE);
                        lineH18b2j5.setVisibility(View.VISIBLE);
                    //    secH18b2j5X.setVisibility(View.VISIBLE);
                     //   lineH18b2j5X.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        secH18b2j0.setVisibility(View.GONE);
                        chkH18b2j0.setChecked(false);
                        secH18b2j1.setVisibility(View.GONE);
                        lineH18b2j1.setVisibility(View.GONE);
                        chkH18b2j1.setChecked(false);
                        secH18b2j2.setVisibility(View.GONE);
                        lineH18b2j2.setVisibility(View.GONE);
                        chkH18b2j2.setChecked(false);
                        secH18b2j3.setVisibility(View.GONE);
                        lineH18b2j3.setVisibility(View.GONE);
                        chkH18b2j3.setChecked(false);
                        secH18b2j4.setVisibility(View.GONE);
                        lineH18b2j4.setVisibility(View.GONE);
                        chkH18b2j4.setChecked(false);
                        secH18b2j5.setVisibility(View.GONE);
                        lineH18b2j5.setVisibility(View.GONE);
                        chkH18b2j5.setChecked(false);
                        secH18b2j5X.setVisibility(View.GONE);
                        lineH18b2j5X.setVisibility(View.GONE);
                        txtH18b2j5X.setText("");
                    }
                }
            });

            rdoH18b1j1 = (RadioButton) findViewById(R.id.rdoH18b1j1);
            rdoH18b1j2 = (RadioButton) findViewById(R.id.rdoH18b1j2);
            rdogrpH18b1j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH18b1j = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH18b1j.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH18b1j.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH18b1j[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH18b2j0.setVisibility(View.GONE);
                        chkH18b2j0.setChecked(false);
                        seclb18b2j.setVisibility(View.GONE);
                        chkHl8b2j.setChecked(false);
                        secH18b2j1.setVisibility(View.GONE);
                        lineH18b2j1.setVisibility(View.GONE);
                        chkH18b2j1.setChecked(false);
                        secH18b2j2.setVisibility(View.GONE);
                        lineH18b2j2.setVisibility(View.GONE);
                        chkH18b2j2.setChecked(false);
                        secH18b2j3.setVisibility(View.GONE);
                        lineH18b2j3.setVisibility(View.GONE);
                        chkH18b2j3.setChecked(false);
                        secH18b2j4.setVisibility(View.GONE);
                        lineH18b2j4.setVisibility(View.GONE);
                        chkH18b2j4.setChecked(false);
                        secH18b2j5.setVisibility(View.GONE);
                        lineH18b2j5.setVisibility(View.GONE);
                        chkH18b2j5.setChecked(false);
                        secH18b2j5X.setVisibility(View.GONE);
                        lineH18b2j5X.setVisibility(View.GONE);
                        txtH18b2j5X.setText("");
                    } else {
                        seclb18b2j.setVisibility(View.VISIBLE);
                        secH18b2j0.setVisibility(View.VISIBLE);
                        secH18b2j1.setVisibility(View.VISIBLE);
                        lineH18b2j1.setVisibility(View.VISIBLE);
                        secH18b2j2.setVisibility(View.VISIBLE);
                        lineH18b2j2.setVisibility(View.VISIBLE);
                        secH18b2j3.setVisibility(View.VISIBLE);
                        lineH18b2j3.setVisibility(View.VISIBLE);
                        secH18b2j4.setVisibility(View.VISIBLE);
                        lineH18b2j4.setVisibility(View.VISIBLE);
                        secH18b2j5.setVisibility(View.VISIBLE);
                        lineH18b2j5.setVisibility(View.VISIBLE);
                      //  secH18b2j5X.setVisibility(View.VISIBLE);
                      //  lineH18b2j5X.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH18b2j1 = (LinearLayout) findViewById(R.id.secH18b2j1);
            lineH18b2j1 = (View) findViewById(R.id.lineH18b2j1);
            VlblH18b2j1 = (TextView) findViewById(R.id.VlblH18b2j1);
            chkH18b2j1 = (CheckBox) findViewById(R.id.chkH18b2j1);
            secH18b2j2 = (LinearLayout) findViewById(R.id.secH18b2j2);
            lineH18b2j2 = (View) findViewById(R.id.lineH18b2j2);
            VlblH18b2j2 = (TextView) findViewById(R.id.VlblH18b2j2);
            chkH18b2j2 = (CheckBox) findViewById(R.id.chkH18b2j2);
            secH18b2j3 = (LinearLayout) findViewById(R.id.secH18b2j3);
            lineH18b2j3 = (View) findViewById(R.id.lineH18b2j3);
            VlblH18b2j3 = (TextView) findViewById(R.id.VlblH18b2j3);
            chkH18b2j3 = (CheckBox) findViewById(R.id.chkH18b2j3);
            secH18b2j4 = (LinearLayout) findViewById(R.id.secH18b2j4);
            lineH18b2j4 = (View) findViewById(R.id.lineH18b2j4);
            VlblH18b2j4 = (TextView) findViewById(R.id.VlblH18b2j4);
            chkH18b2j4 = (CheckBox) findViewById(R.id.chkH18b2j4);
            secH18b2j5 = (LinearLayout) findViewById(R.id.secH18b2j5);
            lineH18b2j5 = (View) findViewById(R.id.lineH18b2j5);
            VlblH18b2j5 = (TextView) findViewById(R.id.VlblH18b2j5);
            chkH18b2j5 = (CheckBox) findViewById(R.id.chkH18b2j5);
            chkH18b2j5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {
                        secH18b2j5X.setVisibility(View.GONE);
                        lineH18b2j5X.setVisibility(View.GONE);
                        txtH18b2j5X.setText("");
                       // secH18b1k.setVisibility(View.GONE);
                       // lineH18b1k.setVisibility(View.GONE);
                      //  rdogrpH18b1k.clearCheck();
                    }
                    else
                    {
                        secH18b2j5X.setVisibility(View.VISIBLE);
                        lineH18b2j5X.setVisibility(View.VISIBLE);
                    }
                }
            });
            secH18b2j5X = (LinearLayout) findViewById(R.id.secH18b2j5X);
            lineH18b2j5X = (View) findViewById(R.id.lineH18b2j5X);
            VlblH18b2j5X = (TextView) findViewById(R.id.VlblH18b2j5X);
            txtH18b2j5X = (EditText) findViewById(R.id.txtH18b2j5X);

            secH18b2j5X.setVisibility(View.GONE);
            lineH18b2j5X.setVisibility(View.GONE);
            /*
            secH18b1k = (LinearLayout) findViewById(R.id.secH18b1k);
            lineH18b1k = (View) findViewById(R.id.lineH18b1k);
            VlblH18b1k = (TextView) findViewById(R.id.VlblH18b1k);
            rdogrpH18b1k = (RadioGroup) findViewById(R.id.rdogrpH18b1k);

            rdoH18b1k1 = (RadioButton) findViewById(R.id.rdoH18b1k1);
            rdoH18b1k2 = (RadioButton) findViewById(R.id.rdoH18b1k2);
            rdogrpH18b1k.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH18b1k = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH18b1k.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH18b1k.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH18b1k[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH18b2kX.setVisibility(View.GONE);

                        txtH18b2kX.setText("");
                    } else {
                        secH18b2kX.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH18b2kX = (LinearLayout) findViewById(R.id.secH18b2kX);
            lineH18b2kX = (View) findViewById(R.id.lineH18b2kX);
            VlblH18b2kX = (TextView) findViewById(R.id.VlblH18b2kX);
            txtH18b2kX = (EditText) findViewById(R.id.txtH18b2kX);
            */
            txtRND.setText(RND);
            txtRND.setEnabled(false);
            txtSuchanaID.setText(SUCHANAID);
            txtSuchanaID.setEnabled(false);

            secH18b2a7X.setVisibility(View.GONE);
            lineH18b2a7X.setVisibility(View.GONE);
            secH18b2b9X.setVisibility(View.GONE);
            lineH18b2b9X.setVisibility(View.GONE);
            secH18b2c6X.setVisibility(View.GONE);
            lineH18b2c6X.setVisibility(View.GONE);
            secH18b2d7X.setVisibility(View.GONE);
            lineH18b2d7X.setVisibility(View.GONE);
            secH18b2e6X.setVisibility(View.GONE);
            lineH18b2e6X.setVisibility(View.GONE);
            secH18b2f7X.setVisibility(View.GONE);
            lineH18b2f7X.setVisibility(View.GONE);
            secH18b2g9X.setVisibility(View.GONE);
            lineH18b2g9X.setVisibility(View.GONE);
            secH18b2h9X.setVisibility(View.GONE);
            lineH18b2h9X.setVisibility(View.GONE);
            secH18b2i5X.setVisibility(View.GONE);
            lineH18b2i5X.setVisibility(View.GONE);
            secH18b2j5X.setVisibility(View.GONE);
            lineH18b2j5X.setVisibility(View.GONE);


            lblNext= (TextView) findViewById(R.id.lblNext);
            // lblNext.setEnabled(false);
            // cmdForward.setEnabled(false);

            DataSearch(RND,SUCHANAID);

            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(IGA.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRND.getText().toString().length() == 0 & secRND.isShown()) {
                Connection.MessageBox(IGA.this, "Required field: রাউন্ড নাম্বার.");
                txtRND.requestFocus();
                return;
            } else if (Integer.valueOf(txtRND.getText().toString().length() == 0 ? "1" : txtRND.getText().toString()) < 1 || Integer.valueOf(txtRND.getText().toString().length() == 0 ? "2" : txtRND.getText().toString()) > 2) {
                Connection.MessageBox(IGA.this, "Value should be between 1 and 2(রাউন্ড নাম্বার).");
                txtRND.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(IGA.this, "Required field: উপকারভোগী সদস্য আইডি সুচনা নম্বর অনুসারে.");
                txtSuchanaID.requestFocus();
                return;
            } else if (!rdoH18b1a1.isChecked() & !rdoH18b1a2.isChecked() & secH18b1a.isShown()) {
                Connection.MessageBox(IGA.this, "Select anyone options from (বীজ).");
                rdoH18b1a1.requestFocus();
                return;
            } else if (txtH18b2a7X.getText().toString().length() == 0 & secH18b2a7X.isShown()) {
                Connection.MessageBox(IGA.this, "Required field: উল্লেখ কর.");
                txtH18b2a7X.requestFocus();
                return;
            } else if (!rdoH18b1b1.isChecked() & !rdoH18b1b2.isChecked() & secH18b1b.isShown()) {
                Connection.MessageBox(IGA.this, "Select anyone options from (সার).");
                rdoH18b1b1.requestFocus();
                return;
            } else if (txtH18b2b9X.getText().toString().length() == 0 & secH18b2b9X.isShown()) {
                Connection.MessageBox(IGA.this, "Required field: উল্লেখ কর.");
                txtH18b2b9X.requestFocus();
                return;
            } else if (!rdoH18b1c1.isChecked() & !rdoH18b1c2.isChecked() & secH18b1c.isShown()) {
                Connection.MessageBox(IGA.this, "Select anyone options from (মাছেরপোনা).");
                rdoH18b1c1.requestFocus();
                return;
            } else if (txtH18b2c6X.getText().toString().length() == 0 & secH18b2c6X.isShown()) {
                Connection.MessageBox(IGA.this, "Required field: উল্লেখ কর.");
                txtH18b2c6X.requestFocus();
                return;
            } else if (!rdoH18b1d1.isChecked() & !rdoH18b1d2.isChecked() & secH18b1d.isShown()) {
                Connection.MessageBox(IGA.this, "Select anyone options from (চুন).");
                rdoH18b1d1.requestFocus();
                return;
            } else if (txtH18b2d7X.getText().toString().length() == 0 & secH18b2d7X.isShown()) {
                Connection.MessageBox(IGA.this, "Required field: উল্লেখ কর.");
                txtH18b2d7X.requestFocus();
                return;
            } else if (!rdoH18b1e1.isChecked() & !rdoH18b1e2.isChecked() & secH18b1e.isShown()) {
                Connection.MessageBox(IGA.this, "Select anyone options from (হাস/মুরগির বাচ্চা ).");
                rdoH18b1e1.requestFocus();
                return;
            } else if (txtH18b2e6X.getText().toString().length() == 0 & secH18b2e6X.isShown()) {
                Connection.MessageBox(IGA.this, "Required field: উল্লেখ কর.");
                txtH18b2e6X.requestFocus();
                return;
            } else if (!rdoH18b1f1.isChecked() & !rdoH18b1f2.isChecked() & secH18b1f.isShown()) {
                Connection.MessageBox(IGA.this, "Select anyone options from (টীকা).");
                rdoH18b1f1.requestFocus();
                return;
            } else if (txtH18b2f7X.getText().toString().length() == 0 & secH18b2f7X.isShown()) {
                Connection.MessageBox(IGA.this, "Required field: উল্লেখ কর.");
                txtH18b2f7X.requestFocus();
                return;
            } else if (!rdoH18b1g1.isChecked() & !rdoH18b1g2.isChecked() & secH18b1g.isShown()) {
                Connection.MessageBox(IGA.this, "Select anyone options from (হাস-মুরগির খাবার/পোল্ট্রিফিড).");
                rdoH18b1g1.requestFocus();
                return;
            } else if (txtH18b2g9X.getText().toString().length() == 0 & secH18b2g9X.isShown()) {
                Connection.MessageBox(IGA.this, "Required field: উল্লেখ কর.");
                txtH18b2g9X.requestFocus();
                return;
            } else if (!rdoH18b1h1.isChecked() & !rdoH18b1h2.isChecked() & secH18b1h.isShown()) {
                Connection.MessageBox(IGA.this, "Select anyone options from (মাছের খাবার).");
                rdoH18b1h1.requestFocus();
                return;
            } else if (txtH18b2h9X.getText().toString().length() == 0 & secH18b2h9X.isShown()) {
                Connection.MessageBox(IGA.this, "Required field: উল্লেখ কর.");
                txtH18b2h9X.requestFocus();
                return;
            } else if (!rdoH18b1i1.isChecked() & !rdoH18b1i2.isChecked() & secH18b1i.isShown()) {
                Connection.MessageBox(IGA.this, "Select anyone options from (কচি চারাগাছ).");
                rdoH18b1i1.requestFocus();
                return;
            } else if (txtH18b2i5X.getText().toString().length() == 0 & secH18b2i5X.isShown()) {
                Connection.MessageBox(IGA.this, "Required field: উল্লেখ কর.");
                txtH18b2i5X.requestFocus();
                return;
            } else if (!rdoH18b1j1.isChecked() & !rdoH18b1j2.isChecked() & secH18b1j.isShown()) {
                Connection.MessageBox(IGA.this, "Select anyone options from (চারা).");
                rdoH18b1j1.requestFocus();
                return;
            } else if (txtH18b2j5X.getText().toString().length() == 0 & secH18b2j5X.isShown()) {
                Connection.MessageBox(IGA.this, "Required field: উল্লেখ কর.");
                txtH18b2j5X.requestFocus();
                return;
            }

            if (rdoH18b1a1.isChecked() == true & chkHl8b2a.isChecked()==false) {
                if (chkH18b2a0.isChecked() == false && chkH18b2a1.isChecked() == false && chkH18b2a2.isChecked() == false && chkH18b2a3.isChecked() == false && chkH18b2a4.isChecked() == false && chkH18b2a5.isChecked() == false && chkH18b2a6.isChecked() == false && chkH18b2a7.isChecked() == false) {
                    Connection.MessageBox(IGA.this, "Required field:All the value can not be  empty H18b2A");
                    return;
                }
            } else if (rdoH18b1b1.isChecked() == true  & chkHl8b2b.isChecked()==false) {
                if (chkH18b2b0.isChecked() == false && chkH18b2b1.isChecked() == false && chkH18b2b2.isChecked() == false && chkH18b2b3.isChecked() == false && chkH18b2b4.isChecked() == false && chkH18b2b5.isChecked() == false && chkH18b2b6.isChecked() == false && chkH18b2b7.isChecked() == false && chkH18b2b8.isChecked() == false && chkH18b2b9.isChecked() == false) {
                    Connection.MessageBox(IGA.this, "Required field:All the value can not be  empty H18b2B");
                    return;
                }
            } else if (rdoH18b1c1.isChecked() == true  & chkHl8b2c.isChecked()==false) {
                if (chkH18b2c0.isChecked() == false && chkH18b2c1.isChecked() == false && chkH18b2c2.isChecked() == false && chkH18b2c3.isChecked() == false && chkH18b2c4.isChecked() == false && chkH18b2c5.isChecked() == false && chkH18b2c6.isChecked() == false) {
                    Connection.MessageBox(IGA.this, "Required field:All the value can not be  empty H18b2C");
                    return;
                }
            } else if (rdoH18b1d1.isChecked() == true  & chkHl8b2d.isChecked()==false) {
                if (chkH18b2d0.isChecked() == false && chkH18b2d1.isChecked() == false && chkH18b2d2.isChecked() == false && chkH18b2d3.isChecked() == false && chkH18b2d4.isChecked() == false && chkH18b2d5.isChecked() == false && chkH18b2d6.isChecked() == false && chkH18b2d7.isChecked() == false) {
                    Connection.MessageBox(IGA.this, "Required field:All the value can not be  empty H18b2D");
                    return;
                }
            } else if (rdoH18b1e1.isChecked() == true  & chkHl8b2e.isChecked()==false) {
                if (chkH18b2e0.isChecked() == false && chkH18b2e1.isChecked() == false && chkH18b2e2.isChecked() == false && chkH18b2e3.isChecked() == false && chkH18b2e4.isChecked() == false && chkH18b2e5.isChecked() == false && chkH18b2e6.isChecked() == false) {
                    Connection.MessageBox(IGA.this, "Required field:All the value can not be  empty H18b2E");
                    return;
                }
            } else if (rdoH18b1f1.isChecked() == true  & chkHl8b2f.isChecked()==false) {
                if (chkH18b2f0.isChecked() == false && chkH18b2f1.isChecked() == false && chkH18b2f2.isChecked() == false && chkH18b2f3.isChecked() == false && chkH18b2f4.isChecked() == false && chkH18b2f5.isChecked() == false && chkH18b2f6.isChecked() == false && chkH18b2f7.isChecked() == false) {
                    Connection.MessageBox(IGA.this, "Required field:All the value can not be  empty H18b2F");
                    return;
                }
            } else if (rdoH18b1g1.isChecked() == true & chkHl8b2g.isChecked()==false) {
                if (chkH18b2g0.isChecked() == false && chkH18b2g1.isChecked() == false && chkH18b2g2.isChecked() == false && chkH18b2g3.isChecked() == false && chkH18b2g4.isChecked() == false && chkH18b2g5.isChecked() == false && chkH18b2g6.isChecked() == false && chkH18b2g7.isChecked() == false && chkH18b2g8.isChecked() == false && chkH18b2g9.isChecked() == false) {
                    Connection.MessageBox(IGA.this, "Required field:All the value can not be  empty H18b2G");
                    return;
                }
            } else if (rdoH18b1h1.isChecked() == true & chkHl8b2h.isChecked()==false) {
                if (chkH18b2h0.isChecked() == false && chkH18b2h1.isChecked() == false && chkH18b2h2.isChecked() == false && chkH18b2h3.isChecked() == false && chkH18b2h4.isChecked() == false && chkH18b2h5.isChecked() == false && chkH18b2h6.isChecked() == false && chkH18b2h7.isChecked() == false && chkH18b2h8.isChecked() == false && chkH18b2h9.isChecked() == false) {
                    Connection.MessageBox(IGA.this, "Required field:All the value can not be  empty H18b2H");
                    return;
                }
            } else if (rdoH18b1i1.isChecked() == true & chkHl8b2i.isChecked()==false) {
                if (chkH18b2i0.isChecked() == false && chkH18b2i1.isChecked() == false && chkH18b2i2.isChecked() == false && chkH18b2i3.isChecked() == false && chkH18b2i4.isChecked() == false && chkH18b2i5.isChecked() == false) {
                    Connection.MessageBox(IGA.this, "Required field:All the value can not be  empty H18b2I");
                    return;
                }
            } else if (rdoH18b1j1.isChecked() == true & chkHl8b2j.isChecked()==false) {
                if (chkH18b2j0.isChecked() == false && chkH18b2j1.isChecked() == false && chkH18b2j2.isChecked() == false && chkH18b2j3.isChecked() == false && chkH18b2j4.isChecked() == false && chkH18b2j5.isChecked() == false) {
                    Connection.MessageBox(IGA.this, "Required field:All the value can not be  empty H18b2J");
                    return;
                }
            }
            /*else if (!rdoH18b1k1.isChecked() & !rdoH18b1k2.isChecked() & secH18b1k.isShown()) {
                Connection.MessageBox(IGA.this, "Select anyone options from (অনান্য).");
                rdoH18b1k1.requestFocus();
                return;
            } else if (txtH18b2kX.getText().toString().length() == 0 & secH18b2kX.isShown()) {
                Connection.MessageBox(IGA.this, "Required field: উল্লেখ কর.");
                txtH18b2kX.requestFocus();
                return;
            }*/

            String SQL = "";
            RadioButton rb;

            IGA_DataModel objSave = new IGA_DataModel();
            objSave.setRND(txtRND.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            String[] d_rdogrpH18b1a = new String[]{"1", "0"};
            objSave.setH18b1a("");
            for (int i = 0; i < rdogrpH18b1a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH18b1a.getChildAt(i);
                if (rb.isChecked()) objSave.setH18b1a(d_rdogrpH18b1a[i]);
            }
            objSave.setH18b2a((chkHl8b2a.isChecked() ? "1" :(chkHl8b2a.isShown()? "2":"")));
            objSave.setH18b2a0((chkH18b2a0.isChecked() ? "1" :(chkH18b2a0.isShown()? "2":"")));
            objSave.setH18b2a1((chkH18b2a1.isChecked() ? "1" :(chkH18b2a1.isShown()? "2":"")));
            objSave.setH18b2a2((chkH18b2a2.isChecked() ? "1" :(chkH18b2a2.isShown()? "2":"")));
            objSave.setH18b2a3((chkH18b2a3.isChecked() ? "1" :(chkH18b2a3.isShown()? "2":"")));
            objSave.setH18b2a4((chkH18b2a4.isChecked() ? "1" :(chkH18b2a4.isShown()? "2":"")));
            objSave.setH18b2a5((chkH18b2a5.isChecked() ? "1" :(chkH18b2a5.isShown()? "2":"")));
            objSave.setH18b2a6((chkH18b2a6.isChecked() ? "1" :(chkH18b2a6.isShown()? "2":"")));
            objSave.setH18b2a7((chkH18b2a7.isChecked() ? "1" :(chkH18b2a7.isShown()? "2":"")));
            objSave.setH18b2a7X(txtH18b2a7X.getText().toString());
            String[] d_rdogrpH18b1b = new String[]{"1", "0"};
            objSave.setH18b1b("");
            for (int i = 0; i < rdogrpH18b1b.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH18b1b.getChildAt(i);
                if (rb.isChecked()) objSave.setH18b1b(d_rdogrpH18b1b[i]);
            }
            objSave.setH18b2b((chkHl8b2b.isChecked() ? "1" :(chkHl8b2b.isShown()? "2":"")));
            objSave.setH18b2b0((chkH18b2b0.isChecked() ? "1" :(chkH18b2b0.isShown()? "2":"")));
            objSave.setH18b2b1((chkH18b2b1.isChecked() ? "1" :(chkH18b2b1.isShown()? "2":"")));
            objSave.setH18b2b2((chkH18b2b2.isChecked() ? "1" :(chkH18b2b2.isShown()? "2":"")));
            objSave.setH18b2b3((chkH18b2b3.isChecked() ? "1" :(chkH18b2b3.isShown()? "2":"")));
            objSave.setH18b2b4((chkH18b2b4.isChecked() ? "1" :(chkH18b2b4.isShown()? "2":"")));
            objSave.setH18b2b5((chkH18b2b5.isChecked() ? "1" :(chkH18b2b5.isShown()? "2":"")));
            objSave.setH18b2b6((chkH18b2b6.isChecked() ? "1" :(chkH18b2b6.isShown()? "2":"")));
            objSave.setH18b2b7((chkH18b2b7.isChecked() ? "1" :(chkH18b2b7.isShown()? "2":"")));
            objSave.setH18b2b8((chkH18b2b8.isChecked() ? "1" :(chkH18b2b8.isShown()? "2":"")));
            objSave.setH18b2b9((chkH18b2b9.isChecked() ? "1" :(chkH18b2b9.isShown()? "2":"")));
            objSave.setH18b2b9X(txtH18b2b9X.getText().toString());
            String[] d_rdogrpH18b1c = new String[]{"1", "0"};
            objSave.setH18b1c("");
            for (int i = 0; i < rdogrpH18b1c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH18b1c.getChildAt(i);
                if (rb.isChecked()) objSave.setH18b1c(d_rdogrpH18b1c[i]);
            }
            objSave.setH18b2c((chkHl8b2c.isChecked() ? "1" :(chkHl8b2c.isShown()? "2":"")));
            objSave.setH18b2c0((chkH18b2c0.isChecked() ? "1" :(chkH18b2c0.isShown()? "2":"")));
            objSave.setH18b2c1((chkH18b2c1.isChecked() ? "1" :(chkH18b2c1.isShown()? "2":"")));
            objSave.setH18b2c2((chkH18b2c2.isChecked() ? "1" :(chkH18b2c2.isShown()? "2":"")));
            objSave.setH18b2c3((chkH18b2c3.isChecked() ? "1" :(chkH18b2c3.isShown()? "2":"")));
            objSave.setH18b2c4((chkH18b2c4.isChecked() ? "1" :(chkH18b2c4.isShown()? "2":"")));
            objSave.setH18b2c5((chkH18b2c5.isChecked() ? "1" :(chkH18b2c5.isShown()? "2":"")));
            objSave.setH18b2c6((chkH18b2c6.isChecked() ? "1" :(chkH18b2c6.isShown()? "2":"")));
            objSave.setH18b2c6X(txtH18b2c6X.getText().toString());
            String[] d_rdogrpH18b1d = new String[]{"1", "0"};
            objSave.setH18b1d("");
            for (int i = 0; i < rdogrpH18b1d.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH18b1d.getChildAt(i);
                if (rb.isChecked()) objSave.setH18b1d(d_rdogrpH18b1d[i]);
            }
            objSave.setH18b2d((chkHl8b2d.isChecked() ? "1" :(chkHl8b2d.isShown()? "2":"")));
            objSave.setH18b2d0((chkH18b2d0.isChecked() ? "1" :(chkH18b2d0.isShown()? "2":"")));
            objSave.setH18b2d1((chkH18b2d1.isChecked() ? "1" :(chkH18b2d1.isShown()? "2":"")));
            objSave.setH18b2d2((chkH18b2d2.isChecked() ? "1" :(chkH18b2d2.isShown()? "2":"")));
            objSave.setH18b2d3((chkH18b2d3.isChecked() ? "1" :(chkH18b2d3.isShown()? "2":"")));
            objSave.setH18b2d4((chkH18b2d4.isChecked() ? "1" :(chkH18b2d4.isShown()? "2":"")));
            objSave.setH18b2d5((chkH18b2d5.isChecked() ? "1" :(chkH18b2d5.isShown()? "2":"")));
            objSave.setH18b2d6((chkH18b2d6.isChecked() ? "1" :(chkH18b2d6.isShown()? "2":"")));
            objSave.setH18b2d7((chkH18b2d7.isChecked() ? "1" :(chkH18b2d7.isShown()? "2":"")));
            objSave.setH18b2d7X(txtH18b2d7X.getText().toString());
            String[] d_rdogrpH18b1e = new String[]{"1", "0"};
            objSave.setH18b1e("");
            for (int i = 0; i < rdogrpH18b1e.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH18b1e.getChildAt(i);
                if (rb.isChecked()) objSave.setH18b1e(d_rdogrpH18b1e[i]);
            }
            objSave.setH18b2e((chkHl8b2e.isChecked() ? "1" :(chkHl8b2e.isShown()? "2":"")));
            objSave.setH18b2e0((chkH18b2e0.isChecked() ? "1" :(chkH18b2e0.isShown()? "2":"")));
            objSave.setH18b2e1((chkH18b2e1.isChecked() ? "1" :(chkH18b2e1.isShown()? "2":"")));
            objSave.setH18b2e2((chkH18b2e2.isChecked() ? "1" :(chkH18b2e2.isShown()? "2":"")));
            objSave.setH18b2e3((chkH18b2e3.isChecked() ? "1" :(chkH18b2e3.isShown()? "2":"")));
            objSave.setH18b2e4((chkH18b2e4.isChecked() ? "1" :(chkH18b2e4.isShown()? "2":"")));
            objSave.setH18b2e5((chkH18b2e5.isChecked() ? "1" :(chkH18b2e5.isShown()? "2":"")));
            objSave.setH18b2e6((chkH18b2e6.isChecked() ? "1" :(chkH18b2e6.isShown()? "2":"")));
            objSave.setH18b2e6X(txtH18b2e6X.getText().toString());
            String[] d_rdogrpH18b1f = new String[]{"1", "0"};
            objSave.setH18b1f("");
            for (int i = 0; i < rdogrpH18b1f.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH18b1f.getChildAt(i);
                if (rb.isChecked()) objSave.setH18b1f(d_rdogrpH18b1f[i]);
            }
            objSave.setH18b2f((chkHl8b2f.isChecked() ? "1" :(chkHl8b2f.isShown()? "2":"")));
            objSave.setH18b2f0((chkH18b2f0.isChecked() ? "1" :(chkH18b2f0.isShown()? "2":"")));
            objSave.setH18b2f1((chkH18b2f1.isChecked() ? "1" :(chkH18b2f1.isShown()? "2":"")));
            objSave.setH18b2f2((chkH18b2f2.isChecked() ? "1" :(chkH18b2f2.isShown()? "2":"")));
            objSave.setH18b2f3((chkH18b2f3.isChecked() ? "1" :(chkH18b2f3.isShown()? "2":"")));
            objSave.setH18b2f4((chkH18b2f4.isChecked() ? "1" :(chkH18b2f4.isShown()? "2":"")));
            objSave.setH18b2f5((chkH18b2f5.isChecked() ? "1" :(chkH18b2f5.isShown()? "2":"")));
            objSave.setH18b2f6((chkH18b2f6.isChecked() ? "1" :(chkH18b2f6.isShown()? "2":"")));
            objSave.setH18b2f7((chkH18b2f7.isChecked() ? "1" :(chkH18b2f7.isShown()? "2":"")));
            objSave.setH18b2f7X(txtH18b2f7X.getText().toString());
            String[] d_rdogrpH18b1g = new String[]{"1", "0"};
            objSave.setH18b1g("");
            for (int i = 0; i < rdogrpH18b1g.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH18b1g.getChildAt(i);
                if (rb.isChecked()) objSave.setH18b1g(d_rdogrpH18b1g[i]);
            }
            objSave.setH18b2g((chkHl8b2g.isChecked() ? "1" :(chkHl8b2g.isShown()? "2":"")));
            objSave.setH18b2g0((chkH18b2g0.isChecked() ? "1" :(chkH18b2g0.isShown()? "2":"")));
            objSave.setH18b2g1((chkH18b2g1.isChecked() ? "1" :(chkH18b2g1.isShown()? "2":"")));
            objSave.setH18b2g2((chkH18b2g2.isChecked() ? "1" :(chkH18b2g2.isShown()? "2":"")));
            objSave.setH18b2g3((chkH18b2g3.isChecked() ? "1" :(chkH18b2g3.isShown()? "2":"")));
            objSave.setH18b2g4((chkH18b2g4.isChecked() ? "1" :(chkH18b2g4.isShown()? "2":"")));
            objSave.setH18b2g5((chkH18b2g5.isChecked() ? "1" :(chkH18b2g5.isShown()? "2":"")));
            objSave.setH18b2g6((chkH18b2g6.isChecked() ? "1" :(chkH18b2g6.isShown()? "2":"")));
            objSave.setH18b2g7((chkH18b2g7.isChecked() ? "1" :(chkH18b2g7.isShown()? "2":"")));
            objSave.setH18b2g8((chkH18b2g8.isChecked() ? "1" :(chkH18b2g8.isShown()? "2":"")));
            objSave.setH18b2g9((chkH18b2g9.isChecked() ? "1" :(chkH18b2g9.isShown()? "2":"")));
            objSave.setH18b2g9X(txtH18b2g9X.getText().toString());
            String[] d_rdogrpH18b1h = new String[]{"1", "0"};
            objSave.setH18b1h("");
            for (int i = 0; i < rdogrpH18b1h.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH18b1h.getChildAt(i);
                if (rb.isChecked()) objSave.setH18b1h(d_rdogrpH18b1h[i]);
            }
            objSave.setH18b2h((chkHl8b2h.isChecked() ? "1" :(chkHl8b2h.isShown()? "2":"")));
            objSave.setH18b2h0((chkH18b2h0.isChecked() ? "1" :(chkH18b2h0.isShown()? "2":"")));
            objSave.setH18b2h1((chkH18b2h1.isChecked() ? "1" :(chkH18b2h1.isShown()? "2":"")));
            objSave.setH18b2h2((chkH18b2h2.isChecked() ? "1" :(chkH18b2h2.isShown()? "2":"")));
            objSave.setH18b2h3((chkH18b2h3.isChecked() ? "1" :(chkH18b2h3.isShown()? "2":"")));
            objSave.setH18b2h4((chkH18b2h4.isChecked() ? "1" :(chkH18b2h4.isShown()? "2":"")));
            objSave.setH18b2h5((chkH18b2h5.isChecked() ? "1" :(chkH18b2h5.isShown()? "2":"")));
            objSave.setH18b2h6((chkH18b2h6.isChecked() ? "1" :(chkH18b2h6.isShown()? "2":"")));
            objSave.setH18b2h7((chkH18b2h7.isChecked() ? "1" :(chkH18b2h7.isShown()? "2":"")));
            objSave.setH18b2h8((chkH18b2h8.isChecked() ? "1" :(chkH18b2h8.isShown()? "2":"")));
            objSave.setH18b2h9((chkH18b2h9.isChecked() ? "1" :(chkH18b2h9.isShown()? "2":"")));
            objSave.setH18b2h9X(txtH18b2h9X.getText().toString());
            String[] d_rdogrpH18b1i = new String[]{"1", "0"};
            objSave.setH18b1i("");
            for (int i = 0; i < rdogrpH18b1i.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH18b1i.getChildAt(i);
                if (rb.isChecked()) objSave.setH18b1i(d_rdogrpH18b1i[i]);
            }
            objSave.setH18b2i((chkHl8b2i.isChecked() ? "1" :(chkHl8b2i.isShown()? "2":"")));
            objSave.setH18b2i0((chkH18b2i0.isChecked() ? "1" :(chkH18b2i0.isShown()? "2":"")));
            objSave.setH18b2i1((chkH18b2i1.isChecked() ? "1" :(chkH18b2i1.isShown()? "2":"")));
            objSave.setH18b2i2((chkH18b2i2.isChecked() ? "1" :(chkH18b2i2.isShown()? "2":"")));
            objSave.setH18b2i3((chkH18b2i3.isChecked() ? "1" :(chkH18b2i3.isShown()? "2":"")));
            objSave.setH18b2i4((chkH18b2i4.isChecked() ? "1" :(chkH18b2i4.isShown()? "2":"")));
            objSave.setH18b2i5((chkH18b2i5.isChecked() ? "1" :(chkH18b2i5.isShown()? "2":"")));
            objSave.setH18b2i5X(txtH18b2i5X.getText().toString());
            String[] d_rdogrpH18b1j = new String[]{"1", "0"};
            objSave.setH18b1j("");
            for (int i = 0; i < rdogrpH18b1j.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH18b1j.getChildAt(i);
                if (rb.isChecked()) objSave.setH18b1j(d_rdogrpH18b1j[i]);
            }
            objSave.setH18b2j((chkHl8b2j.isChecked() ? "1" :(chkHl8b2j.isShown()? "2":"")));
            objSave.setH18b2j0((chkH18b2j0.isChecked() ? "1" :(chkH18b2j0.isShown()? "2":"")));
            objSave.setH18b2j1((chkH18b2j1.isChecked() ? "1" :(chkH18b2j1.isShown()? "2":"")));
            objSave.setH18b2j2((chkH18b2j2.isChecked() ? "1" :(chkH18b2j2.isShown()? "2":"")));
            objSave.setH18b2j3((chkH18b2j3.isChecked() ? "1" :(chkH18b2j3.isShown()? "2":"")));
            objSave.setH18b2j4((chkH18b2j4.isChecked() ? "1" :(chkH18b2j4.isShown()? "2":"")));
            objSave.setH18b2j5((chkH18b2j5.isChecked() ? "1" :(chkH18b2j5.isShown()? "2":"")));
            objSave.setH18b2j5X(txtH18b2j5X.getText().toString());
           /* String[] d_rdogrpH18b1k = new String[]{"1", "0"};
            objSave.setH18b1k("");
            for (int i = 0; i < rdogrpH18b1k.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH18b1k.getChildAt(i);
                if (rb.isChecked()) objSave.setH18b1k(d_rdogrpH18b1k[i]);
            }

            objSave.setH18b2kX(txtH18b2kX.getText().toString());*/
            objSave.setEnDt(Global.DateTimeNowYMDHMS());
            objSave.setStartTime(StartTime);
            objSave.setEndTime(g.CurrentTime24());
            objSave.setUserId(g.getDeviceNo());
            objSave.setEntryUser(g.getUserId()); //from data entry user list
            //objSave.setLat(Double.toString(currentLatitude));
            //objSave.setLon(Double.toString(currentLongitude));

            String status = objSave.SaveUpdateData(this);
            if (status.length() == 0) {
                EntryStatus_DataModel e = new EntryStatus_DataModel(TableName, RND, SUCHANAID);
                e.SaveUpdateData(this);
                finish();
                Bundle IDBundle = new Bundle();
                IDBundle.putString("Rnd", txtRND.getText().toString());
                IDBundle.putString("SuchanaID", txtSuchanaID.getText().toString());

                startActivity(new Intent(IGA.this, PregHis.class).putExtras(IDBundle));

            } else {
                Connection.MessageBox(IGA.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(IGA.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String RND, String SuchanaID) {
        try {

            RadioButton rb;
            IGA_DataModel d = new IGA_DataModel();
            String SQL = "Select * from " + TableName + "  Where RND='" + RND + "' and SuchanaID='" + SuchanaID + "'";
            List<IGA_DataModel> data = d.SelectAll(this, SQL);
            for (IGA_DataModel item : data) {

                cmdForward.setEnabled(true);
                lblNext.setEnabled(true);

                txtRND.setText(item.getRND());
                txtSuchanaID.setText(item.getSuchanaID());
                String[] d_rdogrpH18b1a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH18b1a.length; i++) {
                    if (item.getH18b1a().equals(String.valueOf(d_rdogrpH18b1a[i]))) {
                        rb = (RadioButton) rdogrpH18b1a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH18b2a().equals("1")) {
                    chkHl8b2a.setChecked(true);
                } else if (item.getH18b2a().equals("2")) {
                    chkHl8b2a.setChecked(false);
                }
                if (item.getH18b2a1().equals("1")) {
                    chkH18b2a1.setChecked(true);
                } else if (item.getH18b2a1().equals("2")) {
                    chkH18b2a1.setChecked(false);
                }
                if (item.getH18b2a0().equals("1")) {
                    chkH18b2a0.setChecked(true);
                } else if (item.getH18b2a0().equals("2")) {
                    chkH18b2a0.setChecked(false);
                }
                if (item.getH18b2a2().equals("1")) {
                    chkH18b2a2.setChecked(true);
                } else if (item.getH18b2a2().equals("2")) {
                    chkH18b2a2.setChecked(false);
                }
                if (item.getH18b2a3().equals("1")) {
                    chkH18b2a3.setChecked(true);
                } else if (item.getH18b2a3().equals("2")) {
                    chkH18b2a3.setChecked(false);
                }
                if (item.getH18b2a4().equals("1")) {
                    chkH18b2a4.setChecked(true);
                } else if (item.getH18b2a4().equals("2")) {
                    chkH18b2a4.setChecked(false);
                }
                if (item.getH18b2a5().equals("1")) {
                    chkH18b2a5.setChecked(true);
                } else if (item.getH18b2a5().equals("2")) {
                    chkH18b2a5.setChecked(false);
                }
                if (item.getH18b2a6().equals("1")) {
                    chkH18b2a6.setChecked(true);
                } else if (item.getH18b2a6().equals("2")) {
                    chkH18b2a6.setChecked(false);
                }
                if (item.getH18b2a7().equals("1")) {
                    chkH18b2a7.setChecked(true);
                } else if (item.getH18b2a7().equals("2")) {
                    chkH18b2a7.setChecked(false);
                }
                txtH18b2a7X.setText(item.getH18b2a7X());
                String[] d_rdogrpH18b1b = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH18b1b.length; i++) {
                    if (item.getH18b1b().equals(String.valueOf(d_rdogrpH18b1b[i]))) {
                        rb = (RadioButton) rdogrpH18b1b.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH18b2b().equals("1")) {
                    chkHl8b2b.setChecked(true);
                } else if (item.getH18b2b().equals("2")) {
                    chkHl8b2b.setChecked(false);
                }

                if (item.getH18b2b0().equals("1")) {
                    chkH18b2b0.setChecked(true);
                } else if (item.getH18b2b0().equals("2")) {
                    chkH18b2b0.setChecked(false);
                }

                if (item.getH18b2b1().equals("1")) {
                    chkH18b2b1.setChecked(true);
                } else if (item.getH18b2b1().equals("2")) {
                    chkH18b2b1.setChecked(false);
                }
                if (item.getH18b2b2().equals("1")) {
                    chkH18b2b2.setChecked(true);
                } else if (item.getH18b2b2().equals("2")) {
                    chkH18b2b2.setChecked(false);
                }
                if (item.getH18b2b3().equals("1")) {
                    chkH18b2b3.setChecked(true);
                } else if (item.getH18b2b3().equals("2")) {
                    chkH18b2b3.setChecked(false);
                }
                if (item.getH18b2b4().equals("1")) {
                    chkH18b2b4.setChecked(true);
                } else if (item.getH18b2b4().equals("2")) {
                    chkH18b2b4.setChecked(false);
                }
                if (item.getH18b2b5().equals("1")) {
                    chkH18b2b5.setChecked(true);
                } else if (item.getH18b2b5().equals("2")) {
                    chkH18b2b5.setChecked(false);
                }
                if (item.getH18b2b6().equals("1")) {
                    chkH18b2b6.setChecked(true);
                } else if (item.getH18b2b6().equals("2")) {
                    chkH18b2b6.setChecked(false);
                }
                if (item.getH18b2b7().equals("1")) {
                    chkH18b2b7.setChecked(true);
                } else if (item.getH18b2b7().equals("2")) {
                    chkH18b2b7.setChecked(false);
                }
                if (item.getH18b2b8().equals("1")) {
                    chkH18b2b8.setChecked(true);
                } else if (item.getH18b2b8().equals("2")) {
                    chkH18b2b8.setChecked(false);
                }
                if (item.getH18b2b9().equals("1")) {
                    chkH18b2b9.setChecked(true);
                } else if (item.getH18b2b9().equals("2")) {
                    chkH18b2b9.setChecked(false);
                }
                txtH18b2b9X.setText(item.getH18b2b9X());
                String[] d_rdogrpH18b1c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH18b1c.length; i++) {
                    if (item.getH18b1c().equals(String.valueOf(d_rdogrpH18b1c[i]))) {
                        rb = (RadioButton) rdogrpH18b1c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }

                if (item.getH18b2c().equals("1")) {
                    chkHl8b2c.setChecked(true);
                } else if (item.getH18b2c().equals("2")) {
                    chkHl8b2c.setChecked(false);
                }
                if (item.getH18b2c0().equals("1")) {
                    chkH18b2c0.setChecked(true);
                } else if (item.getH18b2c0().equals("2")) {
                    chkH18b2c0.setChecked(false);
                }

                if (item.getH18b2c1().equals("1")) {
                    chkH18b2c1.setChecked(true);
                } else if (item.getH18b2c1().equals("2")) {
                    chkH18b2c1.setChecked(false);
                }
                if (item.getH18b2c2().equals("1")) {
                    chkH18b2c2.setChecked(true);
                } else if (item.getH18b2c2().equals("2")) {
                    chkH18b2c2.setChecked(false);
                }
                if (item.getH18b2c3().equals("1")) {
                    chkH18b2c3.setChecked(true);
                } else if (item.getH18b2c3().equals("2")) {
                    chkH18b2c3.setChecked(false);
                }
                if (item.getH18b2c4().equals("1")) {
                    chkH18b2c4.setChecked(true);
                } else if (item.getH18b2c4().equals("2")) {
                    chkH18b2c4.setChecked(false);
                }
                if (item.getH18b2c5().equals("1")) {
                    chkH18b2c5.setChecked(true);
                } else if (item.getH18b2c5().equals("2")) {
                    chkH18b2c5.setChecked(false);
                }
                if (item.getH18b2c6().equals("1")) {
                    chkH18b2c6.setChecked(true);
                } else if (item.getH18b2c6().equals("2")) {
                    chkH18b2c6.setChecked(false);
                }

                txtH18b2c6X.setText(item.getH18b2c6X());
                String[] d_rdogrpH18b1d = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH18b1d.length; i++) {
                    if (item.getH18b1d().equals(String.valueOf(d_rdogrpH18b1d[i]))) {
                        rb = (RadioButton) rdogrpH18b1d.getChildAt(i);
                        rb.setChecked(true);
                    }
                }

                if (item.getH18b2d().equals("1")) {
                    chkHl8b2d.setChecked(true);
                } else if (item.getH18b2d().equals("2")) {
                    chkHl8b2d.setChecked(false);
                }
                if (item.getH18b2d0().equals("1")) {
                    chkH18b2d0.setChecked(true);
                } else if (item.getH18b2d0().equals("2")) {
                    chkH18b2d0.setChecked(false);
                }
                if (item.getH18b2d1().equals("1")) {
                    chkH18b2d1.setChecked(true);
                } else if (item.getH18b2d1().equals("2")) {
                    chkH18b2d1.setChecked(false);
                }
                if (item.getH18b2d2().equals("1")) {
                    chkH18b2d2.setChecked(true);
                } else if (item.getH18b2d2().equals("2")) {
                    chkH18b2d2.setChecked(false);
                }
                if (item.getH18b2d3().equals("1")) {
                    chkH18b2d3.setChecked(true);
                } else if (item.getH18b2d3().equals("2")) {
                    chkH18b2d3.setChecked(false);
                }
                if (item.getH18b2d4().equals("1")) {
                    chkH18b2d4.setChecked(true);
                } else if (item.getH18b2d4().equals("2")) {
                    chkH18b2d4.setChecked(false);
                }
                if (item.getH18b2d5().equals("1")) {
                    chkH18b2d5.setChecked(true);
                } else if (item.getH18b2d5().equals("2")) {
                    chkH18b2d5.setChecked(false);
                }
                if (item.getH18b2d6().equals("1")) {
                    chkH18b2d6.setChecked(true);
                } else if (item.getH18b2d6().equals("2")) {
                    chkH18b2d6.setChecked(false);
                }
                if (item.getH18b2d7().equals("1")) {
                    chkH18b2d7.setChecked(true);
                } else if (item.getH18b2d7().equals("2")) {
                    chkH18b2d7.setChecked(false);
                }
                txtH18b2d7X.setText(item.getH18b2d7X());
                String[] d_rdogrpH18b1e = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH18b1e.length; i++) {
                    if (item.getH18b1e().equals(String.valueOf(d_rdogrpH18b1e[i]))) {
                        rb = (RadioButton) rdogrpH18b1e.getChildAt(i);
                        rb.setChecked(true);
                    }
                }

                if (item.getH18b2e().equals("1")) {
                    chkHl8b2e.setChecked(true);
                } else if (item.getH18b2e().equals("2")) {
                    chkHl8b2e.setChecked(false);
                }
                if (item.getH18b2e0().equals("1")) {
                    chkH18b2e0.setChecked(true);
                } else if (item.getH18b2e0().equals("2")) {
                    chkH18b2e0.setChecked(false);
                }
                if (item.getH18b2e1().equals("1")) {
                    chkH18b2e1.setChecked(true);
                } else if (item.getH18b2e1().equals("2")) {
                    chkH18b2e1.setChecked(false);
                }
                if (item.getH18b2e2().equals("1")) {
                    chkH18b2e2.setChecked(true);
                } else if (item.getH18b2e2().equals("2")) {
                    chkH18b2e2.setChecked(false);
                }
                if (item.getH18b2e3().equals("1")) {
                    chkH18b2e3.setChecked(true);
                } else if (item.getH18b2e3().equals("2")) {
                    chkH18b2e3.setChecked(false);
                }
                if (item.getH18b2e4().equals("1")) {
                    chkH18b2e4.setChecked(true);
                } else if (item.getH18b2e4().equals("2")) {
                    chkH18b2e4.setChecked(false);
                }
                if (item.getH18b2e5().equals("1")) {
                    chkH18b2e5.setChecked(true);
                } else if (item.getH18b2e5().equals("2")) {
                    chkH18b2e5.setChecked(false);
                }
                if (item.getH18b2e6().equals("1")) {
                    chkH18b2e6.setChecked(true);
                } else if (item.getH18b2e6().equals("2")) {
                    chkH18b2e6.setChecked(false);
                }

                txtH18b2e6X.setText(item.getH18b2e6X());
                String[] d_rdogrpH18b1f = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH18b1f.length; i++) {
                    if (item.getH18b1f().equals(String.valueOf(d_rdogrpH18b1f[i]))) {
                        rb = (RadioButton) rdogrpH18b1f.getChildAt(i);
                        rb.setChecked(true);
                    }
                }

                if (item.getH18b2f().equals("1")) {
                    chkHl8b2f.setChecked(true);
                } else if (item.getH18b2f().equals("2")) {
                    chkHl8b2f.setChecked(false);
                }
                if (item.getH18b2f0().equals("1")) {
                    chkH18b2f0.setChecked(true);
                } else if (item.getH18b2f0().equals("2")) {
                    chkH18b2f0.setChecked(false);
                }
                if (item.getH18b2f1().equals("1")) {
                    chkH18b2f1.setChecked(true);
                } else if (item.getH18b2f1().equals("2")) {
                    chkH18b2f1.setChecked(false);
                }
                if (item.getH18b2f2().equals("1")) {
                    chkH18b2f2.setChecked(true);
                } else if (item.getH18b2f2().equals("2")) {
                    chkH18b2f2.setChecked(false);
                }
                if (item.getH18b2f3().equals("1")) {
                    chkH18b2f3.setChecked(true);
                } else if (item.getH18b2f3().equals("2")) {
                    chkH18b2f3.setChecked(false);
                }
                if (item.getH18b2f4().equals("1")) {
                    chkH18b2f4.setChecked(true);
                } else if (item.getH18b2f4().equals("2")) {
                    chkH18b2f4.setChecked(false);
                }
                if (item.getH18b2f5().equals("1")) {
                    chkH18b2f5.setChecked(true);
                } else if (item.getH18b2f5().equals("2")) {
                    chkH18b2f5.setChecked(false);
                }
                if (item.getH18b2f6().equals("1")) {
                    chkH18b2f6.setChecked(true);
                } else if (item.getH18b2f6().equals("2")) {
                    chkH18b2f6.setChecked(false);
                }
                if (item.getH18b2f7().equals("1")) {
                    chkH18b2f7.setChecked(true);
                } else if (item.getH18b2f7().equals("2")) {
                    chkH18b2f7.setChecked(false);
                }
                txtH18b2f7X.setText(item.getH18b2f7X());
                String[] d_rdogrpH18b1g = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH18b1g.length; i++) {
                    if (item.getH18b1g().equals(String.valueOf(d_rdogrpH18b1g[i]))) {
                        rb = (RadioButton) rdogrpH18b1g.getChildAt(i);
                        rb.setChecked(true);
                    }
                }

                if (item.getH18b2g().equals("1")) {
                    chkHl8b2g.setChecked(true);
                } else if (item.getH18b2g().equals("2")) {
                    chkHl8b2g.setChecked(false);
                }
                if (item.getH18b2g0().equals("1")) {
                    chkH18b2g0.setChecked(true);
                } else if (item.getH18b2g0().equals("2")) {
                    chkH18b2g0.setChecked(false);
                }
                if (item.getH18b2g1().equals("1")) {
                    chkH18b2g1.setChecked(true);
                } else if (item.getH18b2g1().equals("2")) {
                    chkH18b2g1.setChecked(false);
                }
                if (item.getH18b2g2().equals("1")) {
                    chkH18b2g2.setChecked(true);
                } else if (item.getH18b2g2().equals("2")) {
                    chkH18b2g2.setChecked(false);
                }
                if (item.getH18b2g3().equals("1")) {
                    chkH18b2g3.setChecked(true);
                } else if (item.getH18b2g3().equals("2")) {
                    chkH18b2g3.setChecked(false);
                }
                if (item.getH18b2g4().equals("1")) {
                    chkH18b2g4.setChecked(true);
                } else if (item.getH18b2g4().equals("2")) {
                    chkH18b2g4.setChecked(false);
                }
                if (item.getH18b2g5().equals("1")) {
                    chkH18b2g5.setChecked(true);
                } else if (item.getH18b2g5().equals("2")) {
                    chkH18b2g5.setChecked(false);
                }
                if (item.getH18b2g6().equals("1")) {
                    chkH18b2g6.setChecked(true);
                } else if (item.getH18b2g6().equals("2")) {
                    chkH18b2g6.setChecked(false);
                }
                if (item.getH18b2g7().equals("1")) {
                    chkH18b2g7.setChecked(true);
                } else if (item.getH18b2g7().equals("2")) {
                    chkH18b2g7.setChecked(false);
                }

                if (item.getH18b2g8().equals("1")) {
                    chkH18b2g8.setChecked(true);
                } else if (item.getH18b2g8().equals("2")) {
                    chkH18b2g8.setChecked(false);
                }

                if (item.getH18b2g9().equals("1")) {
                    chkH18b2g9.setChecked(true);
                } else if (item.getH18b2g9().equals("2")) {
                    chkH18b2g9.setChecked(false);
                }
                txtH18b2g9X.setText(item.getH18b2g9X());
                String[] d_rdogrpH18b1h = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH18b1h.length; i++) {
                    if (item.getH18b1h().equals(String.valueOf(d_rdogrpH18b1h[i]))) {
                        rb = (RadioButton) rdogrpH18b1h.getChildAt(i);
                        rb.setChecked(true);
                    }
                }

                if (item.getH18b2h().equals("1")) {
                    chkHl8b2h.setChecked(true);
                } else if (item.getH18b2h().equals("2")) {
                    chkHl8b2h.setChecked(false);
                }
                if (item.getH18b2h0().equals("1")) {
                    chkH18b2h0.setChecked(true);
                } else if (item.getH18b2h0().equals("2")) {
                    chkH18b2h0.setChecked(false);
                }
                if (item.getH18b2h1().equals("1")) {
                    chkH18b2h1.setChecked(true);
                } else if (item.getH18b2h1().equals("2")) {
                    chkH18b2h1.setChecked(false);
                }
                if (item.getH18b2h2().equals("1")) {
                    chkH18b2h2.setChecked(true);
                } else if (item.getH18b2h2().equals("2")) {
                    chkH18b2h2.setChecked(false);
                }
                if (item.getH18b2h3().equals("1")) {
                    chkH18b2h3.setChecked(true);
                } else if (item.getH18b2h3().equals("2")) {
                    chkH18b2h3.setChecked(false);
                }
                if (item.getH18b2h4().equals("1")) {
                    chkH18b2h4.setChecked(true);
                } else if (item.getH18b2h4().equals("2")) {
                    chkH18b2h4.setChecked(false);
                }
                if (item.getH18b2h5().equals("1")) {
                    chkH18b2h5.setChecked(true);
                } else if (item.getH18b2h5().equals("2")) {
                    chkH18b2h5.setChecked(false);
                }
                if (item.getH18b2h6().equals("1")) {
                    chkH18b2h6.setChecked(true);
                } else if (item.getH18b2h6().equals("2")) {
                    chkH18b2h6.setChecked(false);
                }
                if (item.getH18b2h7().equals("1")) {
                    chkH18b2h7.setChecked(true);
                } else if (item.getH18b2h7().equals("2")) {
                    chkH18b2h7.setChecked(false);
                }
                if (item.getH18b2h8().equals("1")) {
                    chkH18b2h8.setChecked(true);
                } else if (item.getH18b2h8().equals("2")) {
                    chkH18b2h8.setChecked(false);
                }
                if (item.getH18b2h9().equals("1")) {
                    chkH18b2h9.setChecked(true);
                } else if (item.getH18b2h9().equals("2")) {
                    chkH18b2h9.setChecked(false);
                }
                txtH18b2h9X.setText(item.getH18b2h9X());
                String[] d_rdogrpH18b1i = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH18b1i.length; i++) {
                    if (item.getH18b1i().equals(String.valueOf(d_rdogrpH18b1i[i]))) {
                        rb = (RadioButton) rdogrpH18b1i.getChildAt(i);
                        rb.setChecked(true);
                    }
                }

                if (item.getH18b2i().equals("1")) {
                    chkHl8b2i.setChecked(true);
                } else if (item.getH18b2i().equals("2")) {
                    chkHl8b2i.setChecked(false);
                }
                if (item.getH18b2i0().equals("1")) {
                    chkH18b2i0.setChecked(true);
                } else if (item.getH18b2i0().equals("2")) {
                    chkH18b2i0.setChecked(false);
                }
                if (item.getH18b2i1().equals("1")) {
                    chkH18b2i1.setChecked(true);
                } else if (item.getH18b2i1().equals("2")) {
                    chkH18b2i1.setChecked(false);
                }
                if (item.getH18b2i2().equals("1")) {
                    chkH18b2i2.setChecked(true);
                } else if (item.getH18b2i2().equals("2")) {
                    chkH18b2i2.setChecked(false);
                }
                if (item.getH18b2i3().equals("1")) {
                    chkH18b2i3.setChecked(true);
                } else if (item.getH18b2i3().equals("2")) {
                    chkH18b2i3.setChecked(false);
                }
                if (item.getH18b2i4().equals("1")) {
                    chkH18b2i4.setChecked(true);
                } else if (item.getH18b2i4().equals("2")) {
                    chkH18b2i4.setChecked(false);
                }
                if (item.getH18b2i5().equals("1")) {
                    chkH18b2i5.setChecked(true);
                } else if (item.getH18b2i5().equals("2")) {
                    chkH18b2i5.setChecked(false);
                }
                txtH18b2i5X.setText(item.getH18b2i5X());
                String[] d_rdogrpH18b1j = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH18b1j.length; i++) {
                    if (item.getH18b1j().equals(String.valueOf(d_rdogrpH18b1j[i]))) {
                        rb = (RadioButton) rdogrpH18b1j.getChildAt(i);
                        rb.setChecked(true);
                    }
                }

                if (item.getH18b2j().equals("1")) {
                    chkHl8b2j.setChecked(true);
                } else if (item.getH18b2j().equals("2")) {
                    chkHl8b2j.setChecked(false);
                }

                if (item.getH18b2j0().equals("1")) {
                    chkH18b2j0.setChecked(true);
                } else if (item.getH18b2j0().equals("2")) {
                    chkH18b2j0.setChecked(false);
                }
                if (item.getH18b2j1().equals("1")) {
                    chkH18b2j1.setChecked(true);
                } else if (item.getH18b2j1().equals("2")) {
                    chkH18b2j1.setChecked(false);
                }
                if (item.getH18b2j2().equals("1")) {
                    chkH18b2j2.setChecked(true);
                } else if (item.getH18b2j2().equals("2")) {
                    chkH18b2j2.setChecked(false);
                }
                if (item.getH18b2j3().equals("1")) {
                    chkH18b2j3.setChecked(true);
                } else if (item.getH18b2j3().equals("2")) {
                    chkH18b2j3.setChecked(false);
                }
                if (item.getH18b2j4().equals("1")) {
                    chkH18b2j4.setChecked(true);
                } else if (item.getH18b2j4().equals("2")) {
                    chkH18b2j4.setChecked(false);
                }
                if (item.getH18b2j5().equals("1")) {
                    chkH18b2j5.setChecked(true);
                } else if (item.getH18b2j5().equals("2")) {
                    chkH18b2j5.setChecked(false);
                }
                txtH18b2j5X.setText(item.getH18b2j5X());
                /*String[] d_rdogrpH18b1k = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH18b1k.length; i++) {
                    if (item.getH18b1k().equals(String.valueOf(d_rdogrpH18b1k[i]))) {
                        rb = (RadioButton) rdogrpH18b1k.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH18b2kX.setText(item.getH18b2kX());*/
            }
        } catch (Exception e) {
            Connection.MessageBox(IGA.this, e.getMessage());
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