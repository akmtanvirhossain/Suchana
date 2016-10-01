package org.icddrb.suchana;
//Android Manifest Code
//<activity android:name=".Cost3" android:label="Cost3" />

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
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

public class Cost3 extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    static String MSLNO = "";
    boolean networkAvailable=false;
    Location currentLocation;
    double currentLatitude,currentLongitude;
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
    LinearLayout secMSlNo;
    View lineMSlNo;
    TextView VlblMSlNo;
    Spinner spnMSlNo;
    LinearLayout secLBH811;
    LinearLayout secH8111a;
    View lineH8111a;
    TextView VlblH8111a;
    RadioGroup rdogrpH8111a;
    RadioButton rdoH8111a1;
    RadioButton rdoH8111a2;
    LinearLayout secH8111b;
    View lineH8111b;
    TextView VlblH8111b;
    EditText txtH8111b;
    LinearLayout secH8111c;
    View lineH8111c;
    TextView VlblH8111c;
    RadioGroup rdogrpH8111c;
    RadioButton rdoH8111c1;
    RadioButton rdoH8111c2;
    RadioButton rdoH8111c3;
    LinearLayout secH8111d;
    View lineH8111d;
    TextView VlblH8111d;
    EditText txtH8111d;
    LinearLayout seclbH121;
    LinearLayout secH121a;
    View lineH121a;
    TextView VlblH121a;
    RadioGroup rdogrpH121a;
    RadioButton rdoH121a1;
    RadioButton rdoH121a2;
    LinearLayout secH8121x1;
    View lineH8121x1;
    TextView VlblH8121x1;
    EditText txtH8121x1;
    LinearLayout secH8121b;
    View lineH8121b;
    TextView VlblH8121b;
    EditText txtH8121b;
    LinearLayout secH8121c;
    View lineH8121c;
    TextView VlblH8121c;
    RadioGroup rdogrpH8121c;
    RadioButton rdoH8121c1;
    RadioButton rdoH8121c2;
    RadioButton rdoH8121c3;
    LinearLayout secH8121d;
    View lineH8121d;
    TextView VlblH8121d;
    EditText txtH8121d;
    LinearLayout secLBH8112;
    LinearLayout secH8112a;
    View lineH8112a;
    TextView VlblH8112a;
    RadioGroup rdogrpH8112a;
    RadioButton rdoH8112a1;
    RadioButton rdoH8112a2;
    LinearLayout secH8112x1;
    View lineH8112x1;
    TextView VlblH8112x1;
    EditText txtH8112x1;
    LinearLayout secH8112b;
    View lineH8112b;
    TextView VlblH8112b;
    EditText txtH8112b;
    LinearLayout secH8112c;
    View lineH8112c;
    TextView VlblH8112c;
    RadioGroup rdogrpH8112c;
    RadioButton rdoH8112c1;
    RadioButton rdoH8112c2;
    RadioButton rdoH8112c3;
    LinearLayout secH8112d;
    View lineH8112d;
    TextView VlblH8112d;
    EditText txtH8112d;
    LinearLayout secLBH9a;
    LinearLayout secH9a1a;
    View lineH9a1a;
    TextView VlblH9a1a;
    RadioGroup rdogrpH9a1a;
    RadioButton rdoH9a1a1;
    RadioButton rdoH9a1a2;
    LinearLayout secH9a1b;
    View lineH9a1b;
    TextView VlblH9a1b;
    EditText txtH9a1b;
    LinearLayout secH9a1c;
    View lineH9a1c;
    TextView VlblH9a1c;
    EditText txtH9a1c;
    LinearLayout secLBH9a2;
    LinearLayout secH9a2a;
    View lineH9a2a;
    TextView VlblH9a2a;
    RadioGroup rdogrpH9a2a;
    RadioButton rdoH9a2a1;
    RadioButton rdoH9a2a2;
    LinearLayout secH9a2b;
    View lineH9a2b;
    TextView VlblH9a2b;
    EditText txtH9a2b;
    LinearLayout secH9a2c;
    View lineH9a2c;
    TextView VlblH9a2c;
    EditText txtH9a2c;
    LinearLayout secLBH9a3;
    LinearLayout secH9a3a;
    View lineH9a3a;
    TextView VlblH9a3a;
    RadioGroup rdogrpH9a3a;
    RadioButton rdoH9a3a1;
    RadioButton rdoH9a3a2;
    LinearLayout secH9a3b;
    View lineH9a3b;
    TextView VlblH9a3b;
    EditText txtH9a3b;
    LinearLayout secH9a3c;
    View lineH9a3c;
    TextView VlblH9a3c;
    EditText txtH9a3c;
    LinearLayout secLBH9a4;
    LinearLayout secH9a4a;
    View lineH9a4a;
    TextView VlblH9a4a;
    RadioGroup rdogrpH9a4a;
    RadioButton rdoH9a4a1;
    RadioButton rdoH9a4a2;
    LinearLayout secH9a4b;
    View lineH9a4b;
    TextView VlblH9a4b;
    EditText txtH9a4b;
    LinearLayout secH9a4c;
    View lineH9a4c;
    TextView VlblH9a4c;
    EditText txtH9a4c;
    LinearLayout secLBH9a5;
    LinearLayout secH9a5a;
    View lineH9a5a;
    TextView VlblH9a5a;
    RadioGroup rdogrpH9a5a;
    RadioButton rdoH9a5a1;
    RadioButton rdoH9a5a2;
    LinearLayout secH9a5b;
    View lineH9a5b;
    TextView VlblH9a5b;
    EditText txtH9a5b;
    LinearLayout secH9a5c;
    View lineH9a5c;
    TextView VlblH9a5c;
    EditText txtH9a5c;
    LinearLayout secLBH9b;
    LinearLayout secH9b1a;
    View lineH9b1a;
    TextView VlblH9b1a;
    RadioGroup rdogrpH9b1a;
    RadioButton rdoH9b1a1;
    RadioButton rdoH9b1a2;
    LinearLayout secH9b1b;
    View lineH9b1b;
    TextView VlblH9b1b;
    EditText txtH9b1b;
    LinearLayout secH9b1c;
    View lineH9b1c;
    TextView VlblH9b1c;
    EditText txtH9b1c;
    LinearLayout secLBH9b2;
    LinearLayout secH9b2a;
    View lineH9b2a;
    TextView VlblH9b2a;
    RadioGroup rdogrpH9b2a;
    RadioButton rdoH9b2a1;
    RadioButton rdoH9b2a2;
    LinearLayout secH9b2b;
    View lineH9b2b;
    TextView VlblH9b2b;
    EditText txtH9b2b;
    LinearLayout secH9b2c;
    View lineH9b2c;
    TextView VlblH9b2c;
    EditText txtH9b2c;
    LinearLayout secLBH9b3;
    LinearLayout secH9b3a;
    View lineH9b3a;
    TextView VlblH9b3a;
    RadioGroup rdogrpH9b3a;
    RadioButton rdoH9b3a1;
    RadioButton rdoH9b3a2;
    LinearLayout secH9b3b;
    View lineH9b3b;
    TextView VlblH9b3b;
    EditText txtH9b3b;
    LinearLayout secH9b3c;
    View lineH9b3c;
    TextView VlblH9b3c;
    EditText txtH9b3c;
    LinearLayout secLBH9b4;
    LinearLayout secH9b4a;
    View lineH9b4a;
    TextView VlblH9b4a;
    RadioGroup rdogrpH9b4a;
    RadioButton rdoH9b4a1;
    RadioButton rdoH9b4a2;
    LinearLayout secH9b4b;
    View lineH9b4b;
    TextView VlblH9b4b;
    EditText txtH9b4b;
    LinearLayout secH9b4c;
    View lineH9b4c;
    TextView VlblH9b4c;
    EditText txtH9b4c;
    LinearLayout secLBH9b5;
    LinearLayout secH9b5a;
    View lineH9b5a;
    TextView VlblH9b5a;
    RadioGroup rdogrpH9b5a;
    RadioButton rdoH9b5a1;
    RadioButton rdoH9b5a2;
    LinearLayout secH9b5b;
    View lineH9b5b;
    TextView VlblH9b5b;
    EditText txtH9b5b;
    LinearLayout secH9b5c;
    View lineH9b5c;
    TextView VlblH9b5c;
    EditText txtH9b5c;
    LinearLayout secLBH9b6;
    LinearLayout secH9b6a;
    View lineH9b6a;
    TextView VlblH9b6a;
    RadioGroup rdogrpH9b6a;
    RadioButton rdoH9b6a1;
    RadioButton rdoH9b6a2;
    LinearLayout secH9b6b;
    View lineH9b6b;
    TextView VlblH9b6b;
    EditText txtH9b6b;
    LinearLayout secH9b6c;
    View lineH9b6c;
    TextView VlblH9b6c;
    EditText txtH9b6c;
    LinearLayout secLBH9b7;
    LinearLayout secH9b7a;
    View lineH9b7a;
    TextView VlblH9b7a;
    RadioGroup rdogrpH9b7a;
    RadioButton rdoH9b7a1;
    RadioButton rdoH9b7a2;
    LinearLayout secH9b7b;
    View lineH9b7b;
    TextView VlblH9b7b;
    EditText txtH9b7b;
    LinearLayout secH9b7c;
    View lineH9b7c;
    TextView VlblH9b7c;
    EditText txtH9b7c;
    LinearLayout secLBH9b8;
    LinearLayout secH9b8a;
    View lineH9b8a;
    TextView VlblH9b8a;
    RadioGroup rdogrpH9b8a;
    RadioButton rdoH9b8a1;
    RadioButton rdoH9b8a2;
    LinearLayout secH9b8b;
    View lineH9b8b;
    TextView VlblH9b8b;
    EditText txtH9b8b;
    LinearLayout secH9b8c;
    View lineH9b8c;
    TextView VlblH9b8c;
    EditText txtH9b8c;
    LinearLayout secLBH9b9;
    LinearLayout secH9b9a;
    View lineH9b9a;
    TextView VlblH9b9a;
    RadioGroup rdogrpH9b9a;
    RadioButton rdoH9b9a1;
    RadioButton rdoH9b9a2;
    LinearLayout secH9b9b;
    View lineH9b9b;
    TextView VlblH9b9b;
    EditText txtH9b9b;
    LinearLayout secH9b9c;
    View lineH9b9c;
    TextView VlblH9b9c;
    EditText txtH9b9c;
    LinearLayout secLBH9b10;
    LinearLayout secH9b10a;
    View lineH9b10a;
    TextView VlblH9b10a;
    RadioGroup rdogrpH9b10a;
    RadioButton rdoH9b10a1;
    RadioButton rdoH9b10a2;
    LinearLayout secH9b10b;
    View lineH9b10b;
    TextView VlblH9b10b;
    EditText txtH9b10b;
    LinearLayout secH9b10c;
    View lineH9b10c;
    TextView VlblH9b10c;
    EditText txtH9b10c;
    LinearLayout secLBH9b11;
    LinearLayout secH9b11a;
    View lineH9b11a;
    TextView VlblH9b11a;
    RadioGroup rdogrpH9b11a;
    RadioButton rdoH9b11a1;
    RadioButton rdoH9b11a2;
    LinearLayout secH9b11b;
    View lineH9b11b;
    TextView VlblH9b11b;
    EditText txtH9b11b;
    LinearLayout secH9b11c;
    View lineH9b11c;
    TextView VlblH9b11c;
    EditText txtH9b11c;
    LinearLayout secLBH9b12;
    LinearLayout secH9b12;
    View lineH9b12;
    TextView VlblH9b12;
    RadioGroup rdogrpH9b12;
    RadioButton rdoH9b121;
    RadioButton rdoH9b122;
    LinearLayout secH9b12a1;
    View lineH9b12a1;
    TextView VlblH9b12a1;
    RadioGroup rdogrpH9b12a1;
    RadioButton rdoH9b12a11;
    RadioButton rdoH9b12a12;
    LinearLayout secH9b12a2;
    View lineH9b12a2;
    TextView VlblH9b12a2;
    EditText txtH9b12a2;
    LinearLayout secH9b12a3;
    View lineH9b12a3;
    TextView VlblH9b12a3;
    EditText txtH9b12a3;
    LinearLayout secH9b12b1;
    View lineH9b12b1;
    TextView VlblH9b12b1;
    RadioGroup rdogrpH9b12b1;
    RadioButton rdoH9b12b11;
    RadioButton rdoH9b12b12;
    LinearLayout secH9b12b2;
    View lineH9b12b2;
    TextView VlblH9b12b2;
    EditText txtH9b12b2;
    LinearLayout secH9b12b3;
    View lineH9b12b3;
    TextView VlblH9b12b3;
    EditText txtH9b12b3;
    LinearLayout secH9b12c1;
    View lineH9b12c1;
    TextView VlblH9b12c1;
    RadioGroup rdogrpH9b12c1;
    RadioButton rdoH9b12c11;
    RadioButton rdoH9b12c12;
    LinearLayout secH9b12c2;
    View lineH9b12c2;
    TextView VlblH9b12c2;
    EditText txtH9b12c2;
    LinearLayout secH9b12c3;
    View lineH9b12c3;
    TextView VlblH9b12c3;
    EditText txtH9b12c3;
    LinearLayout secH9b12d1;
    View lineH9b12d1;
    TextView VlblH9b12d1;
    RadioGroup rdogrpH9b12d1;
    RadioButton rdoH9b12d11;
    RadioButton rdoH9b12d12;
    LinearLayout secH9b12d2;
    View lineH9b12d2;
    TextView VlblH9b12d2;
    EditText txtH9b12d2;
    LinearLayout secH9b12d3;
    View lineH9b12d3;
    TextView VlblH9b12d3;
    EditText txtH9b12d3;
    LinearLayout secH9b12e1;
    View lineH9b12e1;
    TextView VlblH9b12e1;
    RadioGroup rdogrpH9b12e1;
    RadioButton rdoH9b12e11;
    RadioButton rdoH9b12e12;
    LinearLayout secH9b12e2;
    View lineH9b12e2;
    TextView VlblH9b12e2;
    EditText txtH9b12e2;
    LinearLayout secH9b12e3;
    View lineH9b12e3;
    TextView VlblH9b12e3;
    EditText txtH9b12e3;
    LinearLayout secH9b12f1;
    View lineH9b12f1;
    TextView VlblH9b12f1;
    RadioGroup rdogrpH9b12f1;
    RadioButton rdoH9b12f11;
    RadioButton rdoH9b12f12;
    LinearLayout secH9b12f2;
    View lineH9b12f2;
    TextView VlblH9b12f2;
    EditText txtH9b12f2;
    LinearLayout secH9b12f3;
    View lineH9b12f3;
    TextView VlblH9b12f3;
    EditText txtH9b12f3;
    LinearLayout secH9b12g1;
    View lineH9b12g1;
    TextView VlblH9b12g1;
    RadioGroup rdogrpH9b12g1;
    RadioButton rdoH9b12g11;
    RadioButton rdoH9b12g12;
    LinearLayout secH9b12g2;
    View lineH9b12g2;
    TextView VlblH9b12g2;
    EditText txtH9b12g2;
    LinearLayout secH9b12g3;
    View lineH9b12g3;
    TextView VlblH9b12g3;
    EditText txtH9b12g3;
    LinearLayout secH9b12h1;
    View lineH9b12h1;
    TextView VlblH9b12h1;
    RadioGroup rdogrpH9b12h1;
    RadioButton rdoH9b12h11;
    RadioButton rdoH9b12h12;
    LinearLayout secH9b12h2;
    View lineH9b12h2;
    TextView VlblH9b12h2;
    EditText txtH9b12h2;
    LinearLayout secH9b12h3;
    View lineH9b12h3;
    TextView VlblH9b12h3;
    EditText txtH9b12h3;
    LinearLayout secH9b12i1;
    View lineH9b12i1;
    TextView VlblH9b12i1;
    RadioGroup rdogrpH9b12i1;
    RadioButton rdoH9b12i11;
    RadioButton rdoH9b12i12;
    LinearLayout secH9b12i2;
    View lineH9b12i2;
    TextView VlblH9b12i2;
    EditText txtH9b12i2;
    LinearLayout secH9b12i3;
    View lineH9b12i3;
    TextView VlblH9b12i3;
    EditText txtH9b12i3;
    LinearLayout secH9b12j1;
    View lineH9b12j1;
    TextView VlblH9b12j1;
    RadioGroup rdogrpH9b12j1;
    RadioButton rdoH9b12j11;
    RadioButton rdoH9b12j12;
    LinearLayout secH9b12j2;
    View lineH9b12j2;
    TextView VlblH9b12j2;
    EditText txtH9b12j2;
    LinearLayout secH9b12j3;
    View lineH9b12j3;
    TextView VlblH9b12j3;
    EditText txtH9b12j3;
    LinearLayout secH9b12k1;
    View lineH9b12k1;
    TextView VlblH9b12k1;
    RadioGroup rdogrpH9b12k1;
    RadioButton rdoH9b12k11;
    RadioButton rdoH9b12k12;
    LinearLayout secH9b12k2;
    View lineH9b12k2;
    TextView VlblH9b12k2;
    EditText txtH9b12k2;
    LinearLayout secH9b12k3;
    View lineH9b12k3;
    TextView VlblH9b12k3;
    EditText txtH9b12k3;
    LinearLayout secH9b12l1;
    View lineH9b12l1;
    TextView VlblH9b12l1;
    RadioGroup rdogrpH9b12l1;
    RadioButton rdoH9b12l11;
    RadioButton rdoH9b12l12;
    LinearLayout secH9b12l2;
    View lineH9b12l2;
    TextView VlblH9b12l2;
    EditText txtH9b12l2;
    LinearLayout secH9b12l3;
    View lineH9b12l3;
    TextView VlblH9b12l3;
    EditText txtH9b12l3;
    LinearLayout secH9b12m1;
    View lineH9b12m1;
    TextView VlblH9b12m1;
    RadioGroup rdogrpH9b12m1;
    RadioButton rdoH9b12m11;
    RadioButton rdoH9b12m12;
    LinearLayout secH9b12m2;
    View lineH9b12m2;
    TextView VlblH9b12m2;
    EditText txtH9b12m2;
    LinearLayout secH9b12m3;
    View lineH9b12m3;
    TextView VlblH9b12m3;
    EditText txtH9b12m3;
    LinearLayout secLBH9b13;
    LinearLayout secH9b13a;
    View lineH9b13a;
    TextView VlblH9b13a;
    RadioGroup rdogrpH9b13a;
    RadioButton rdoH9b13a1;
    RadioButton rdoH9b13a2;
    LinearLayout secH9b13b;
    View lineH9b13b;
    TextView VlblH9b13b;
    EditText txtH9b13b;
    LinearLayout secH9b13c;
    View lineH9b13c;
    TextView VlblH9b13c;
    EditText txtH9b13c;
    LinearLayout secH9b14a;
    View lineH9b14a;
    TextView VlblH9b14a;
    RadioGroup rdogrpH9b14a;
    RadioButton rdoH9b14a1;
    RadioButton rdoH9b14a2;
    LinearLayout secH9b14x1;
    View lineH9b14x1;
    TextView VlblH9b14x1;
    EditText txtH9b14x1;
    LinearLayout secH9b14b;
    View lineH9b14b;
    TextView VlblH9b14b;
    EditText txtH9b14b;
    LinearLayout secH9b14c;
    View lineH9b14c;
    TextView VlblH9b14c;
    EditText txtH9b14c;
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


            //dtpDate.setText(new StringBuilder()
            //          .append(Global.Right("00"+mDay,2)).append("/")
            //        .append(Global.Right("00"+mMonth,2)).append("/")
            //        .append(mYear));
        }
    };
    private TimePickerDialog.OnTimeSetListener timePickerListener = new TimePickerDialog.OnTimeSetListener() {
        public void onTimeSet(TimePicker view, int selectedHour, int selectedMinute) {
            hour = selectedHour;
            minute = selectedMinute;
            EditText tpTime;


            //  tpTime.setText(new StringBuilder().append(Global.Right("00"+hour,2)).append(":").append(Global.Right("00"+minute,2)));

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
        try
        {
            setContentView(R.layout.cost3);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");
            MSLNO = IDbundle.getString("MSlNo");

            TableName = "Cost";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView)findViewById(R.id.lblHeading);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(Cost3.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Cost2.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDbundle);
                            getApplicationContext().startActivity(intent);
                            finish();
                        }
                    });
                    adb.show();
                }
            });
            ImageButton cmdForward = (ImageButton) findViewById(R.id.cmdForward);
            cmdForward.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Cost3.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to start Savings [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Savings.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDbundle);
                            getApplicationContext().startActivity(intent);

                        }
                    });
                    adb.show();
                }
            });

            secRnd=(LinearLayout)findViewById(R.id.secRnd);
            lineRnd=(View)findViewById(R.id.lineRnd);
            VlblRnd=(TextView) findViewById(R.id.VlblRnd);
            txtRnd=(EditText) findViewById(R.id.txtRnd);
            secSuchanaID=(LinearLayout)findViewById(R.id.secSuchanaID);
            lineSuchanaID=(View)findViewById(R.id.lineSuchanaID);
            VlblSuchanaID=(TextView) findViewById(R.id.VlblSuchanaID);
            txtSuchanaID=(EditText) findViewById(R.id.txtSuchanaID);
            secMSlNo=(LinearLayout)findViewById(R.id.secMSlNo);
            lineMSlNo=(View)findViewById(R.id.lineMSlNo);
            VlblMSlNo=(TextView) findViewById(R.id.VlblMSlNo);
            spnMSlNo = (Spinner) findViewById(R.id.spnMSlNo);
            spnMSlNo.setAdapter(C.getArrayAdapter("select H21 ||'-'||H22 from member"));
            secLBH811=(LinearLayout)findViewById(R.id.secLBH811);
            secH8111a=(LinearLayout)findViewById(R.id.secH8111a);
            lineH8111a=(View)findViewById(R.id.lineH8111a);
            VlblH8111a = (TextView) findViewById(R.id.VlblH8111a);
            rdogrpH8111a = (RadioGroup) findViewById(R.id.rdogrpH8111a);

            rdoH8111a1 = (RadioButton) findViewById(R.id.rdoH8111a1);
            rdoH8111a2 = (RadioButton) findViewById(R.id.rdoH8111a2);
            rdogrpH8111a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH8111a = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH8111a.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH8111a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH8111a[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH8111b.setVisibility(View.GONE);
                        lineH8111b.setVisibility(View.GONE);
                        txtH8111b.setText("");
                        secH8111c.setVisibility(View.GONE);
                        lineH8111c.setVisibility(View.GONE);
                        rdogrpH8111c.clearCheck();
                        secH8111d.setVisibility(View.GONE);
                        lineH8111d.setVisibility(View.GONE);
                        txtH8111d.setText("");
                    }
                    else
                    {
                        secH8111b.setVisibility(View.VISIBLE);
                        lineH8111b.setVisibility(View.VISIBLE);
                        secH8111c.setVisibility(View.VISIBLE);
                        lineH8111c.setVisibility(View.VISIBLE);
                        secH8111d.setVisibility(View.VISIBLE);
                        lineH8111d.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH8111b=(LinearLayout)findViewById(R.id.secH8111b);
            lineH8111b=(View)findViewById(R.id.lineH8111b);
            VlblH8111b=(TextView) findViewById(R.id.VlblH8111b);
            txtH8111b=(EditText) findViewById(R.id.txtH8111b);
            secH8111c=(LinearLayout)findViewById(R.id.secH8111c);
            lineH8111c=(View)findViewById(R.id.lineH8111c);
            VlblH8111c = (TextView) findViewById(R.id.VlblH8111c);
            rdogrpH8111c = (RadioGroup) findViewById(R.id.rdogrpH8111c);

            rdoH8111c1 = (RadioButton) findViewById(R.id.rdoH8111c1);
            rdoH8111c2 = (RadioButton) findViewById(R.id.rdoH8111c2);
            rdoH8111c3 = (RadioButton) findViewById(R.id.rdoH8111c3);
            secH8111d=(LinearLayout)findViewById(R.id.secH8111d);
            lineH8111d=(View)findViewById(R.id.lineH8111d);
            VlblH8111d=(TextView) findViewById(R.id.VlblH8111d);
            txtH8111d=(EditText) findViewById(R.id.txtH8111d);
            seclbH121=(LinearLayout)findViewById(R.id.seclbH121);
            secH121a=(LinearLayout)findViewById(R.id.secH121a);
            lineH121a=(View)findViewById(R.id.lineH121a);
            VlblH121a = (TextView) findViewById(R.id.VlblH121a);
            rdogrpH121a = (RadioGroup) findViewById(R.id.rdogrpH121a);

            rdoH121a1 = (RadioButton) findViewById(R.id.rdoH121a1);
            rdoH121a2 = (RadioButton) findViewById(R.id.rdoH121a2);
            rdogrpH121a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH121a = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH121a.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH121a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH121a[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH8121x1.setVisibility(View.GONE);
                        lineH8121x1.setVisibility(View.GONE);
                        txtH8121x1.setText("");
                        secH8121b.setVisibility(View.GONE);
                        lineH8121b.setVisibility(View.GONE);
                        txtH8121b.setText("");
                        secH8121c.setVisibility(View.GONE);
                        lineH8121c.setVisibility(View.GONE);
                        rdogrpH8121c.clearCheck();
                        secH8121d.setVisibility(View.GONE);
                        lineH8121d.setVisibility(View.GONE);
                        txtH8121d.setText("");
                    }
                    else
                    {
                        secH8121x1.setVisibility(View.VISIBLE);
                        lineH8121x1.setVisibility(View.VISIBLE);
                        secH8121b.setVisibility(View.VISIBLE);
                        lineH8121b.setVisibility(View.VISIBLE);
                        secH8121c.setVisibility(View.VISIBLE);
                        lineH8121c.setVisibility(View.VISIBLE);
                        secH8121d.setVisibility(View.VISIBLE);
                        lineH8121d.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH8121x1=(LinearLayout)findViewById(R.id.secH8121x1);
            lineH8121x1=(View)findViewById(R.id.lineH8121x1);
            VlblH8121x1=(TextView) findViewById(R.id.VlblH8121x1);
            txtH8121x1=(EditText) findViewById(R.id.txtH8121x1);
            secH8121b=(LinearLayout)findViewById(R.id.secH8121b);
            lineH8121b=(View)findViewById(R.id.lineH8121b);
            VlblH8121b=(TextView) findViewById(R.id.VlblH8121b);
            txtH8121b=(EditText) findViewById(R.id.txtH8121b);
            secH8121c=(LinearLayout)findViewById(R.id.secH8121c);
            lineH8121c=(View)findViewById(R.id.lineH8121c);
            VlblH8121c = (TextView) findViewById(R.id.VlblH8121c);
            rdogrpH8121c = (RadioGroup) findViewById(R.id.rdogrpH8121c);

            rdoH8121c1 = (RadioButton) findViewById(R.id.rdoH8121c1);
            rdoH8121c2 = (RadioButton) findViewById(R.id.rdoH8121c2);
            rdoH8121c3 = (RadioButton) findViewById(R.id.rdoH8121c3);
            secH8121d=(LinearLayout)findViewById(R.id.secH8121d);
            lineH8121d=(View)findViewById(R.id.lineH8121d);
            VlblH8121d=(TextView) findViewById(R.id.VlblH8121d);
            txtH8121d=(EditText) findViewById(R.id.txtH8121d);
            secLBH8112=(LinearLayout)findViewById(R.id.secLBH8112);
            secH8112a=(LinearLayout)findViewById(R.id.secH8112a);
            lineH8112a=(View)findViewById(R.id.lineH8112a);
            VlblH8112a = (TextView) findViewById(R.id.VlblH8112a);
            rdogrpH8112a = (RadioGroup) findViewById(R.id.rdogrpH8112a);

            rdoH8112a1 = (RadioButton) findViewById(R.id.rdoH8112a1);
            rdoH8112a2 = (RadioButton) findViewById(R.id.rdoH8112a2);
            rdogrpH8112a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH8112a = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH8112a.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH8112a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH8112a[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH8112x1.setVisibility(View.GONE);
                        lineH8112x1.setVisibility(View.GONE);
                        txtH8112x1.setText("");
                        secH8112b.setVisibility(View.GONE);
                        lineH8112b.setVisibility(View.GONE);
                        txtH8112b.setText("");
                        secH8112c.setVisibility(View.GONE);
                        lineH8112c.setVisibility(View.GONE);
                        rdogrpH8112c.clearCheck();
                        secH8112d.setVisibility(View.GONE);
                        lineH8112d.setVisibility(View.GONE);
                        txtH8112d.setText("");
                    }
                    else
                    {
                        secH8112x1.setVisibility(View.VISIBLE);
                        lineH8112x1.setVisibility(View.VISIBLE);
                        secH8112b.setVisibility(View.VISIBLE);
                        lineH8112b.setVisibility(View.VISIBLE);
                        secH8112c.setVisibility(View.VISIBLE);
                        lineH8112c.setVisibility(View.VISIBLE);
                        secH8112d.setVisibility(View.VISIBLE);
                        lineH8112d.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH8112x1=(LinearLayout)findViewById(R.id.secH8112x1);
            lineH8112x1=(View)findViewById(R.id.lineH8112x1);
            VlblH8112x1=(TextView) findViewById(R.id.VlblH8112x1);
            txtH8112x1=(EditText) findViewById(R.id.txtH8112x1);
            secH8112b=(LinearLayout)findViewById(R.id.secH8112b);
            lineH8112b=(View)findViewById(R.id.lineH8112b);
            VlblH8112b=(TextView) findViewById(R.id.VlblH8112b);
            txtH8112b=(EditText) findViewById(R.id.txtH8112b);
            secH8112c=(LinearLayout)findViewById(R.id.secH8112c);
            lineH8112c=(View)findViewById(R.id.lineH8112c);
            VlblH8112c = (TextView) findViewById(R.id.VlblH8112c);
            rdogrpH8112c = (RadioGroup) findViewById(R.id.rdogrpH8112c);

            rdoH8112c1 = (RadioButton) findViewById(R.id.rdoH8112c1);
            rdoH8112c2 = (RadioButton) findViewById(R.id.rdoH8112c2);
            rdoH8112c3 = (RadioButton) findViewById(R.id.rdoH8112c3);
            secH8112d=(LinearLayout)findViewById(R.id.secH8112d);
            lineH8112d=(View)findViewById(R.id.lineH8112d);
            VlblH8112d=(TextView) findViewById(R.id.VlblH8112d);
            txtH8112d=(EditText) findViewById(R.id.txtH8112d);
            secLBH9a=(LinearLayout)findViewById(R.id.secLBH9a);
            secH9a1a=(LinearLayout)findViewById(R.id.secH9a1a);
            lineH9a1a=(View)findViewById(R.id.lineH9a1a);
            VlblH9a1a = (TextView) findViewById(R.id.VlblH9a1a);
            rdogrpH9a1a = (RadioGroup) findViewById(R.id.rdogrpH9a1a);

            rdoH9a1a1 = (RadioButton) findViewById(R.id.rdoH9a1a1);
            rdoH9a1a2 = (RadioButton) findViewById(R.id.rdoH9a1a2);
            rdogrpH9a1a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9a1a = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9a1a.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9a1a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9a1a[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9a1b.setVisibility(View.GONE);
                        lineH9a1b.setVisibility(View.GONE);
                        txtH9a1b.setText("");
                        secH9a1c.setVisibility(View.GONE);
                        lineH9a1c.setVisibility(View.GONE);
                        txtH9a1c.setText("");
                    }
                    else
                    {
                        secH9a1b.setVisibility(View.VISIBLE);
                        lineH9a1b.setVisibility(View.VISIBLE);
                        secH9a1c.setVisibility(View.VISIBLE);
                        lineH9a1c.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9a1b=(LinearLayout)findViewById(R.id.secH9a1b);
            lineH9a1b=(View)findViewById(R.id.lineH9a1b);
            VlblH9a1b=(TextView) findViewById(R.id.VlblH9a1b);
            txtH9a1b=(EditText) findViewById(R.id.txtH9a1b);
            secH9a1c=(LinearLayout)findViewById(R.id.secH9a1c);
            lineH9a1c=(View)findViewById(R.id.lineH9a1c);
            VlblH9a1c=(TextView) findViewById(R.id.VlblH9a1c);
            txtH9a1c=(EditText) findViewById(R.id.txtH9a1c);
            secLBH9a2=(LinearLayout)findViewById(R.id.secLBH9a2);
            secH9a2a=(LinearLayout)findViewById(R.id.secH9a2a);
            lineH9a2a=(View)findViewById(R.id.lineH9a2a);
            VlblH9a2a = (TextView) findViewById(R.id.VlblH9a2a);
            rdogrpH9a2a = (RadioGroup) findViewById(R.id.rdogrpH9a2a);

            rdoH9a2a1 = (RadioButton) findViewById(R.id.rdoH9a2a1);
            rdoH9a2a2 = (RadioButton) findViewById(R.id.rdoH9a2a2);
            rdogrpH9a2a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9a2a = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9a2a.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9a2a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9a2a[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9a2b.setVisibility(View.GONE);
                        lineH9a2b.setVisibility(View.GONE);
                        txtH9a2b.setText("");
                        secH9a2c.setVisibility(View.GONE);
                        lineH9a2c.setVisibility(View.GONE);
                        txtH9a2c.setText("");
                    }
                    else
                    {
                        secH9a2b.setVisibility(View.VISIBLE);
                        lineH9a2b.setVisibility(View.VISIBLE);
                        secH9a2c.setVisibility(View.VISIBLE);
                        lineH9a2c.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9a2b=(LinearLayout)findViewById(R.id.secH9a2b);
            lineH9a2b=(View)findViewById(R.id.lineH9a2b);
            VlblH9a2b=(TextView) findViewById(R.id.VlblH9a2b);
            txtH9a2b=(EditText) findViewById(R.id.txtH9a2b);
            secH9a2c=(LinearLayout)findViewById(R.id.secH9a2c);
            lineH9a2c=(View)findViewById(R.id.lineH9a2c);
            VlblH9a2c=(TextView) findViewById(R.id.VlblH9a2c);
            txtH9a2c=(EditText) findViewById(R.id.txtH9a2c);
            secLBH9a3=(LinearLayout)findViewById(R.id.secLBH9a3);
            secH9a3a=(LinearLayout)findViewById(R.id.secH9a3a);
            lineH9a3a=(View)findViewById(R.id.lineH9a3a);
            VlblH9a3a = (TextView) findViewById(R.id.VlblH9a3a);
            rdogrpH9a3a = (RadioGroup) findViewById(R.id.rdogrpH9a3a);

            rdoH9a3a1 = (RadioButton) findViewById(R.id.rdoH9a3a1);
            rdoH9a3a2 = (RadioButton) findViewById(R.id.rdoH9a3a2);
            rdogrpH9a3a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9a3a = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9a3a.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9a3a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9a3a[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9a3b.setVisibility(View.GONE);
                        lineH9a3b.setVisibility(View.GONE);
                        txtH9a3b.setText("");
                        secH9a3c.setVisibility(View.GONE);
                        lineH9a3c.setVisibility(View.GONE);
                        txtH9a3c.setText("");
                    }
                    else
                    {
                        secH9a3b.setVisibility(View.VISIBLE);
                        lineH9a3b.setVisibility(View.VISIBLE);
                        secH9a3c.setVisibility(View.VISIBLE);
                        lineH9a3c.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9a3b=(LinearLayout)findViewById(R.id.secH9a3b);
            lineH9a3b=(View)findViewById(R.id.lineH9a3b);
            VlblH9a3b=(TextView) findViewById(R.id.VlblH9a3b);
            txtH9a3b=(EditText) findViewById(R.id.txtH9a3b);
            secH9a3c=(LinearLayout)findViewById(R.id.secH9a3c);
            lineH9a3c=(View)findViewById(R.id.lineH9a3c);
            VlblH9a3c=(TextView) findViewById(R.id.VlblH9a3c);
            txtH9a3c=(EditText) findViewById(R.id.txtH9a3c);
            secLBH9a4=(LinearLayout)findViewById(R.id.secLBH9a4);
            secH9a4a=(LinearLayout)findViewById(R.id.secH9a4a);
            lineH9a4a=(View)findViewById(R.id.lineH9a4a);
            VlblH9a4a = (TextView) findViewById(R.id.VlblH9a4a);
            rdogrpH9a4a = (RadioGroup) findViewById(R.id.rdogrpH9a4a);

            rdoH9a4a1 = (RadioButton) findViewById(R.id.rdoH9a4a1);
            rdoH9a4a2 = (RadioButton) findViewById(R.id.rdoH9a4a2);
            rdogrpH9a4a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9a4a = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9a4a.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9a4a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9a4a[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9a4b.setVisibility(View.GONE);
                        lineH9a4b.setVisibility(View.GONE);
                        txtH9a4b.setText("");
                        secH9a4c.setVisibility(View.GONE);
                        lineH9a4c.setVisibility(View.GONE);
                        txtH9a4c.setText("");
                    }
                    else
                    {
                        secH9a4b.setVisibility(View.VISIBLE);
                        lineH9a4b.setVisibility(View.VISIBLE);
                        secH9a4c.setVisibility(View.VISIBLE);
                        lineH9a4c.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9a4b=(LinearLayout)findViewById(R.id.secH9a4b);
            lineH9a4b=(View)findViewById(R.id.lineH9a4b);
            VlblH9a4b=(TextView) findViewById(R.id.VlblH9a4b);
            txtH9a4b=(EditText) findViewById(R.id.txtH9a4b);
            secH9a4c=(LinearLayout)findViewById(R.id.secH9a4c);
            lineH9a4c=(View)findViewById(R.id.lineH9a4c);
            VlblH9a4c=(TextView) findViewById(R.id.VlblH9a4c);
            txtH9a4c=(EditText) findViewById(R.id.txtH9a4c);
            secLBH9a5=(LinearLayout)findViewById(R.id.secLBH9a5);
            secH9a5a=(LinearLayout)findViewById(R.id.secH9a5a);
            lineH9a5a=(View)findViewById(R.id.lineH9a5a);
            VlblH9a5a = (TextView) findViewById(R.id.VlblH9a5a);
            rdogrpH9a5a = (RadioGroup) findViewById(R.id.rdogrpH9a5a);

            rdoH9a5a1 = (RadioButton) findViewById(R.id.rdoH9a5a1);
            rdoH9a5a2 = (RadioButton) findViewById(R.id.rdoH9a5a2);
            rdogrpH9a5a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9a5a = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9a5a.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9a5a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9a5a[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9a5b.setVisibility(View.GONE);
                        lineH9a5b.setVisibility(View.GONE);
                        txtH9a5b.setText("");
                        secH9a5c.setVisibility(View.GONE);
                        lineH9a5c.setVisibility(View.GONE);
                        txtH9a5c.setText("");
                    }
                    else
                    {
                        secH9a5b.setVisibility(View.VISIBLE);
                        lineH9a5b.setVisibility(View.VISIBLE);
                        secH9a5c.setVisibility(View.VISIBLE);
                        lineH9a5c.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9a5b=(LinearLayout)findViewById(R.id.secH9a5b);
            lineH9a5b=(View)findViewById(R.id.lineH9a5b);
            VlblH9a5b=(TextView) findViewById(R.id.VlblH9a5b);
            txtH9a5b=(EditText) findViewById(R.id.txtH9a5b);
            secH9a5c=(LinearLayout)findViewById(R.id.secH9a5c);
            lineH9a5c=(View)findViewById(R.id.lineH9a5c);
            VlblH9a5c=(TextView) findViewById(R.id.VlblH9a5c);
            txtH9a5c=(EditText) findViewById(R.id.txtH9a5c);
            secLBH9b=(LinearLayout)findViewById(R.id.secLBH9b);
            secH9b1a=(LinearLayout)findViewById(R.id.secH9b1a);
            lineH9b1a=(View)findViewById(R.id.lineH9b1a);
            VlblH9b1a = (TextView) findViewById(R.id.VlblH9b1a);
            rdogrpH9b1a = (RadioGroup) findViewById(R.id.rdogrpH9b1a);

            rdoH9b1a1 = (RadioButton) findViewById(R.id.rdoH9b1a1);
            rdoH9b1a2 = (RadioButton) findViewById(R.id.rdoH9b1a2);
            rdogrpH9b1a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b1a = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b1a.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b1a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b1a[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b1b.setVisibility(View.GONE);
                        lineH9b1b.setVisibility(View.GONE);
                        txtH9b1b.setText("");
                        secH9b1c.setVisibility(View.GONE);
                        lineH9b1c.setVisibility(View.GONE);
                        txtH9b1c.setText("");
                    }
                    else
                    {
                        secH9b1b.setVisibility(View.VISIBLE);
                        lineH9b1b.setVisibility(View.VISIBLE);
                        secH9b1c.setVisibility(View.VISIBLE);
                        lineH9b1c.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b1b=(LinearLayout)findViewById(R.id.secH9b1b);
            lineH9b1b=(View)findViewById(R.id.lineH9b1b);
            VlblH9b1b=(TextView) findViewById(R.id.VlblH9b1b);
            txtH9b1b=(EditText) findViewById(R.id.txtH9b1b);
            secH9b1c=(LinearLayout)findViewById(R.id.secH9b1c);
            lineH9b1c=(View)findViewById(R.id.lineH9b1c);
            VlblH9b1c=(TextView) findViewById(R.id.VlblH9b1c);
            txtH9b1c=(EditText) findViewById(R.id.txtH9b1c);
            secLBH9b2=(LinearLayout)findViewById(R.id.secLBH9b2);
            secH9b2a=(LinearLayout)findViewById(R.id.secH9b2a);
            lineH9b2a=(View)findViewById(R.id.lineH9b2a);
            VlblH9b2a = (TextView) findViewById(R.id.VlblH9b2a);
            rdogrpH9b2a = (RadioGroup) findViewById(R.id.rdogrpH9b2a);

            rdoH9b2a1 = (RadioButton) findViewById(R.id.rdoH9b2a1);
            rdoH9b2a2 = (RadioButton) findViewById(R.id.rdoH9b2a2);
            rdogrpH9b2a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b2a = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b2a.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b2a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b2a[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b2b.setVisibility(View.GONE);
                        lineH9b2b.setVisibility(View.GONE);
                        txtH9b2b.setText("");
                        secH9b2c.setVisibility(View.GONE);
                        lineH9b2c.setVisibility(View.GONE);
                        txtH9b2c.setText("");
                    }
                    else
                    {
                        secH9b2b.setVisibility(View.VISIBLE);
                        lineH9b2b.setVisibility(View.VISIBLE);
                        secH9b2c.setVisibility(View.VISIBLE);
                        lineH9b2c.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b2b=(LinearLayout)findViewById(R.id.secH9b2b);
            lineH9b2b=(View)findViewById(R.id.lineH9b2b);
            VlblH9b2b=(TextView) findViewById(R.id.VlblH9b2b);
            txtH9b2b=(EditText) findViewById(R.id.txtH9b2b);
            secH9b2c=(LinearLayout)findViewById(R.id.secH9b2c);
            lineH9b2c=(View)findViewById(R.id.lineH9b2c);
            VlblH9b2c=(TextView) findViewById(R.id.VlblH9b2c);
            txtH9b2c=(EditText) findViewById(R.id.txtH9b2c);
            secLBH9b3=(LinearLayout)findViewById(R.id.secLBH9b3);
            secH9b3a=(LinearLayout)findViewById(R.id.secH9b3a);
            lineH9b3a=(View)findViewById(R.id.lineH9b3a);
            VlblH9b3a = (TextView) findViewById(R.id.VlblH9b3a);
            rdogrpH9b3a = (RadioGroup) findViewById(R.id.rdogrpH9b3a);

            rdoH9b3a1 = (RadioButton) findViewById(R.id.rdoH9b3a1);
            rdoH9b3a2 = (RadioButton) findViewById(R.id.rdoH9b3a2);
            rdogrpH9b3a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b3a = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b3a.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b3a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b3a[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b3b.setVisibility(View.GONE);
                        lineH9b3b.setVisibility(View.GONE);
                        txtH9b3b.setText("");
                        secH9b3c.setVisibility(View.GONE);
                        lineH9b3c.setVisibility(View.GONE);
                        txtH9b3c.setText("");
                    }
                    else
                    {
                        secH9b3b.setVisibility(View.VISIBLE);
                        lineH9b3b.setVisibility(View.VISIBLE);
                        secH9b3c.setVisibility(View.VISIBLE);
                        lineH9b3c.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b3b=(LinearLayout)findViewById(R.id.secH9b3b);
            lineH9b3b=(View)findViewById(R.id.lineH9b3b);
            VlblH9b3b=(TextView) findViewById(R.id.VlblH9b3b);
            txtH9b3b=(EditText) findViewById(R.id.txtH9b3b);
            secH9b3c=(LinearLayout)findViewById(R.id.secH9b3c);
            lineH9b3c=(View)findViewById(R.id.lineH9b3c);
            VlblH9b3c=(TextView) findViewById(R.id.VlblH9b3c);
            txtH9b3c=(EditText) findViewById(R.id.txtH9b3c);
            secLBH9b4=(LinearLayout)findViewById(R.id.secLBH9b4);
            secH9b4a=(LinearLayout)findViewById(R.id.secH9b4a);
            lineH9b4a=(View)findViewById(R.id.lineH9b4a);
            VlblH9b4a = (TextView) findViewById(R.id.VlblH9b4a);
            rdogrpH9b4a = (RadioGroup) findViewById(R.id.rdogrpH9b4a);

            rdoH9b4a1 = (RadioButton) findViewById(R.id.rdoH9b4a1);
            rdoH9b4a2 = (RadioButton) findViewById(R.id.rdoH9b4a2);
            rdogrpH9b4a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b4a = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b4a.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b4a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b4a[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b4b.setVisibility(View.GONE);
                        lineH9b4b.setVisibility(View.GONE);
                        txtH9b4b.setText("");
                        secH9b4c.setVisibility(View.GONE);
                        lineH9b4c.setVisibility(View.GONE);
                        txtH9b4c.setText("");
                    }
                    else
                    {
                        secH9b4b.setVisibility(View.VISIBLE);
                        lineH9b4b.setVisibility(View.VISIBLE);
                        secH9b4c.setVisibility(View.VISIBLE);
                        lineH9b4c.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b4b=(LinearLayout)findViewById(R.id.secH9b4b);
            lineH9b4b=(View)findViewById(R.id.lineH9b4b);
            VlblH9b4b=(TextView) findViewById(R.id.VlblH9b4b);
            txtH9b4b=(EditText) findViewById(R.id.txtH9b4b);
            secH9b4c=(LinearLayout)findViewById(R.id.secH9b4c);
            lineH9b4c=(View)findViewById(R.id.lineH9b4c);
            VlblH9b4c=(TextView) findViewById(R.id.VlblH9b4c);
            txtH9b4c=(EditText) findViewById(R.id.txtH9b4c);
            secLBH9b5=(LinearLayout)findViewById(R.id.secLBH9b5);
            secH9b5a=(LinearLayout)findViewById(R.id.secH9b5a);
            lineH9b5a=(View)findViewById(R.id.lineH9b5a);
            VlblH9b5a = (TextView) findViewById(R.id.VlblH9b5a);
            rdogrpH9b5a = (RadioGroup) findViewById(R.id.rdogrpH9b5a);

            rdoH9b5a1 = (RadioButton) findViewById(R.id.rdoH9b5a1);
            rdoH9b5a2 = (RadioButton) findViewById(R.id.rdoH9b5a2);
            rdogrpH9b5a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b5a = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b5a.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b5a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b5a[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b5b.setVisibility(View.GONE);
                        lineH9b5b.setVisibility(View.GONE);
                        txtH9b5b.setText("");
                        secH9b5c.setVisibility(View.GONE);
                        lineH9b5c.setVisibility(View.GONE);
                        txtH9b5c.setText("");
                    }
                    else
                    {
                        secH9b5b.setVisibility(View.VISIBLE);
                        lineH9b5b.setVisibility(View.VISIBLE);
                        secH9b5c.setVisibility(View.VISIBLE);
                        lineH9b5c.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b5b=(LinearLayout)findViewById(R.id.secH9b5b);
            lineH9b5b=(View)findViewById(R.id.lineH9b5b);
            VlblH9b5b=(TextView) findViewById(R.id.VlblH9b5b);
            txtH9b5b=(EditText) findViewById(R.id.txtH9b5b);
            secH9b5c=(LinearLayout)findViewById(R.id.secH9b5c);
            lineH9b5c=(View)findViewById(R.id.lineH9b5c);
            VlblH9b5c=(TextView) findViewById(R.id.VlblH9b5c);
            txtH9b5c=(EditText) findViewById(R.id.txtH9b5c);
            secLBH9b6=(LinearLayout)findViewById(R.id.secLBH9b6);
            secH9b6a=(LinearLayout)findViewById(R.id.secH9b6a);
            lineH9b6a=(View)findViewById(R.id.lineH9b6a);
            VlblH9b6a = (TextView) findViewById(R.id.VlblH9b6a);
            rdogrpH9b6a = (RadioGroup) findViewById(R.id.rdogrpH9b6a);

            rdoH9b6a1 = (RadioButton) findViewById(R.id.rdoH9b6a1);
            rdoH9b6a2 = (RadioButton) findViewById(R.id.rdoH9b6a2);
            rdogrpH9b6a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b6a = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b6a.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b6a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b6a[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b6b.setVisibility(View.GONE);
                        lineH9b6b.setVisibility(View.GONE);
                        txtH9b6b.setText("");
                        secH9b6c.setVisibility(View.GONE);
                        lineH9b6c.setVisibility(View.GONE);
                        txtH9b6c.setText("");
                    }
                    else
                    {
                        secH9b6b.setVisibility(View.VISIBLE);
                        lineH9b6b.setVisibility(View.VISIBLE);
                        secH9b6c.setVisibility(View.VISIBLE);
                        lineH9b6c.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b6b=(LinearLayout)findViewById(R.id.secH9b6b);
            lineH9b6b=(View)findViewById(R.id.lineH9b6b);
            VlblH9b6b=(TextView) findViewById(R.id.VlblH9b6b);
            txtH9b6b=(EditText) findViewById(R.id.txtH9b6b);
            secH9b6c=(LinearLayout)findViewById(R.id.secH9b6c);
            lineH9b6c=(View)findViewById(R.id.lineH9b6c);
            VlblH9b6c=(TextView) findViewById(R.id.VlblH9b6c);
            txtH9b6c=(EditText) findViewById(R.id.txtH9b6c);
            secLBH9b7=(LinearLayout)findViewById(R.id.secLBH9b7);
            secH9b7a=(LinearLayout)findViewById(R.id.secH9b7a);
            lineH9b7a=(View)findViewById(R.id.lineH9b7a);
            VlblH9b7a = (TextView) findViewById(R.id.VlblH9b7a);
            rdogrpH9b7a = (RadioGroup) findViewById(R.id.rdogrpH9b7a);

            rdoH9b7a1 = (RadioButton) findViewById(R.id.rdoH9b7a1);
            rdoH9b7a2 = (RadioButton) findViewById(R.id.rdoH9b7a2);
            rdogrpH9b7a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b7a = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b7a.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b7a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b7a[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b7b.setVisibility(View.GONE);
                        lineH9b7b.setVisibility(View.GONE);
                        txtH9b7b.setText("");
                        secH9b7c.setVisibility(View.GONE);
                        lineH9b7c.setVisibility(View.GONE);
                        txtH9b7c.setText("");
                    }
                    else
                    {
                        secH9b7b.setVisibility(View.VISIBLE);
                        lineH9b7b.setVisibility(View.VISIBLE);
                        secH9b7c.setVisibility(View.VISIBLE);
                        lineH9b7c.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b7b=(LinearLayout)findViewById(R.id.secH9b7b);
            lineH9b7b=(View)findViewById(R.id.lineH9b7b);
            VlblH9b7b=(TextView) findViewById(R.id.VlblH9b7b);
            txtH9b7b=(EditText) findViewById(R.id.txtH9b7b);
            secH9b7c=(LinearLayout)findViewById(R.id.secH9b7c);
            lineH9b7c=(View)findViewById(R.id.lineH9b7c);
            VlblH9b7c=(TextView) findViewById(R.id.VlblH9b7c);
            txtH9b7c=(EditText) findViewById(R.id.txtH9b7c);
            secLBH9b8=(LinearLayout)findViewById(R.id.secLBH9b8);
            secH9b8a=(LinearLayout)findViewById(R.id.secH9b8a);
            lineH9b8a=(View)findViewById(R.id.lineH9b8a);
            VlblH9b8a = (TextView) findViewById(R.id.VlblH9b8a);
            rdogrpH9b8a = (RadioGroup) findViewById(R.id.rdogrpH9b8a);

            rdoH9b8a1 = (RadioButton) findViewById(R.id.rdoH9b8a1);
            rdoH9b8a2 = (RadioButton) findViewById(R.id.rdoH9b8a2);
            rdogrpH9b8a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b8a = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b8a.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b8a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b8a[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b8b.setVisibility(View.GONE);
                        lineH9b8b.setVisibility(View.GONE);
                        txtH9b8b.setText("");
                        secH9b8c.setVisibility(View.GONE);
                        lineH9b8c.setVisibility(View.GONE);
                        txtH9b8c.setText("");
                    }
                    else
                    {
                        secH9b8b.setVisibility(View.VISIBLE);
                        lineH9b8b.setVisibility(View.VISIBLE);
                        secH9b8c.setVisibility(View.VISIBLE);
                        lineH9b8c.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b8b=(LinearLayout)findViewById(R.id.secH9b8b);
            lineH9b8b=(View)findViewById(R.id.lineH9b8b);
            VlblH9b8b=(TextView) findViewById(R.id.VlblH9b8b);
            txtH9b8b=(EditText) findViewById(R.id.txtH9b8b);
            secH9b8c=(LinearLayout)findViewById(R.id.secH9b8c);
            lineH9b8c=(View)findViewById(R.id.lineH9b8c);
            VlblH9b8c=(TextView) findViewById(R.id.VlblH9b8c);
            txtH9b8c=(EditText) findViewById(R.id.txtH9b8c);
            secLBH9b9=(LinearLayout)findViewById(R.id.secLBH9b9);
            secH9b9a=(LinearLayout)findViewById(R.id.secH9b9a);
            lineH9b9a=(View)findViewById(R.id.lineH9b9a);
            VlblH9b9a = (TextView) findViewById(R.id.VlblH9b9a);
            rdogrpH9b9a = (RadioGroup) findViewById(R.id.rdogrpH9b9a);

            rdoH9b9a1 = (RadioButton) findViewById(R.id.rdoH9b9a1);
            rdoH9b9a2 = (RadioButton) findViewById(R.id.rdoH9b9a2);
            rdogrpH9b9a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b9a = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b9a.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b9a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b9a[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b9b.setVisibility(View.GONE);
                        lineH9b9b.setVisibility(View.GONE);
                        txtH9b9b.setText("");
                        secH9b9c.setVisibility(View.GONE);
                        lineH9b9c.setVisibility(View.GONE);
                        txtH9b9c.setText("");
                    }
                    else
                    {
                        secH9b9b.setVisibility(View.VISIBLE);
                        lineH9b9b.setVisibility(View.VISIBLE);
                        secH9b9c.setVisibility(View.VISIBLE);
                        lineH9b9c.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b9b=(LinearLayout)findViewById(R.id.secH9b9b);
            lineH9b9b=(View)findViewById(R.id.lineH9b9b);
            VlblH9b9b=(TextView) findViewById(R.id.VlblH9b9b);
            txtH9b9b=(EditText) findViewById(R.id.txtH9b9b);
            secH9b9c=(LinearLayout)findViewById(R.id.secH9b9c);
            lineH9b9c=(View)findViewById(R.id.lineH9b9c);
            VlblH9b9c=(TextView) findViewById(R.id.VlblH9b9c);
            txtH9b9c=(EditText) findViewById(R.id.txtH9b9c);
            secLBH9b10=(LinearLayout)findViewById(R.id.secLBH9b10);
            secH9b10a=(LinearLayout)findViewById(R.id.secH9b10a);
            lineH9b10a=(View)findViewById(R.id.lineH9b10a);
            VlblH9b10a = (TextView) findViewById(R.id.VlblH9b10a);
            rdogrpH9b10a = (RadioGroup) findViewById(R.id.rdogrpH9b10a);

            rdoH9b10a1 = (RadioButton) findViewById(R.id.rdoH9b10a1);
            rdoH9b10a2 = (RadioButton) findViewById(R.id.rdoH9b10a2);
            rdogrpH9b10a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b10a = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b10a.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b10a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b10a[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b10b.setVisibility(View.GONE);
                        lineH9b10b.setVisibility(View.GONE);
                        txtH9b10b.setText("");
                        secH9b10c.setVisibility(View.GONE);
                        lineH9b10c.setVisibility(View.GONE);
                        txtH9b10c.setText("");
                    }
                    else
                    {
                        secH9b10b.setVisibility(View.VISIBLE);
                        lineH9b10b.setVisibility(View.VISIBLE);
                        secH9b10c.setVisibility(View.VISIBLE);
                        lineH9b10c.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b10b=(LinearLayout)findViewById(R.id.secH9b10b);
            lineH9b10b=(View)findViewById(R.id.lineH9b10b);
            VlblH9b10b=(TextView) findViewById(R.id.VlblH9b10b);
            txtH9b10b=(EditText) findViewById(R.id.txtH9b10b);
            secH9b10c=(LinearLayout)findViewById(R.id.secH9b10c);
            lineH9b10c=(View)findViewById(R.id.lineH9b10c);
            VlblH9b10c=(TextView) findViewById(R.id.VlblH9b10c);
            txtH9b10c=(EditText) findViewById(R.id.txtH9b10c);
            secLBH9b11=(LinearLayout)findViewById(R.id.secLBH9b11);
            secH9b11a=(LinearLayout)findViewById(R.id.secH9b11a);
            lineH9b11a=(View)findViewById(R.id.lineH9b11a);
            VlblH9b11a = (TextView) findViewById(R.id.VlblH9b11a);
            rdogrpH9b11a = (RadioGroup) findViewById(R.id.rdogrpH9b11a);

            rdoH9b11a1 = (RadioButton) findViewById(R.id.rdoH9b11a1);
            rdoH9b11a2 = (RadioButton) findViewById(R.id.rdoH9b11a2);
            rdogrpH9b11a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b11a = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b11a.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b11a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b11a[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b11b.setVisibility(View.GONE);
                        lineH9b11b.setVisibility(View.GONE);
                        txtH9b11b.setText("");
                        secH9b11c.setVisibility(View.GONE);
                        lineH9b11c.setVisibility(View.GONE);
                        txtH9b11c.setText("");
                        secH9b12.setVisibility(View.GONE);
                        lineH9b12.setVisibility(View.GONE);
                        rdogrpH9b12.clearCheck();
                    }
                    else
                    {
                        secH9b11b.setVisibility(View.VISIBLE);
                        lineH9b11b.setVisibility(View.VISIBLE);
                        secH9b11c.setVisibility(View.VISIBLE);
                        lineH9b11c.setVisibility(View.VISIBLE);
                        secH9b12.setVisibility(View.VISIBLE);
                        lineH9b12.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b11b=(LinearLayout)findViewById(R.id.secH9b11b);
            lineH9b11b=(View)findViewById(R.id.lineH9b11b);
            VlblH9b11b=(TextView) findViewById(R.id.VlblH9b11b);
            txtH9b11b=(EditText) findViewById(R.id.txtH9b11b);
            secH9b11c=(LinearLayout)findViewById(R.id.secH9b11c);
            lineH9b11c=(View)findViewById(R.id.lineH9b11c);
            VlblH9b11c=(TextView) findViewById(R.id.VlblH9b11c);
            txtH9b11c=(EditText) findViewById(R.id.txtH9b11c);
            secLBH9b12=(LinearLayout)findViewById(R.id.secLBH9b12);
            secH9b12=(LinearLayout)findViewById(R.id.secH9b12);
            lineH9b12=(View)findViewById(R.id.lineH9b12);
            VlblH9b12 = (TextView) findViewById(R.id.VlblH9b12);
            rdogrpH9b12 = (RadioGroup) findViewById(R.id.rdogrpH9b12);

            rdoH9b121 = (RadioButton) findViewById(R.id.rdoH9b121);
            rdoH9b122 = (RadioButton) findViewById(R.id.rdoH9b122);
            rdogrpH9b12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b12 = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b12.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b12.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b12[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b12a1.setVisibility(View.GONE);
                        lineH9b12a1.setVisibility(View.GONE);
                        rdogrpH9b12a1.clearCheck();
                        secH9b12a2.setVisibility(View.GONE);
                        lineH9b12a2.setVisibility(View.GONE);
                        txtH9b12a2.setText("");
                        secH9b12a3.setVisibility(View.GONE);
                        lineH9b12a3.setVisibility(View.GONE);
                        txtH9b12a3.setText("");
                        secH9b12b1.setVisibility(View.GONE);
                        lineH9b12b1.setVisibility(View.GONE);
                        rdogrpH9b12b1.clearCheck();
                        secH9b12b2.setVisibility(View.GONE);
                        lineH9b12b2.setVisibility(View.GONE);
                        txtH9b12b2.setText("");
                        secH9b12b3.setVisibility(View.GONE);
                        lineH9b12b3.setVisibility(View.GONE);
                        txtH9b12b3.setText("");
                        secH9b12c1.setVisibility(View.GONE);
                        lineH9b12c1.setVisibility(View.GONE);
                        rdogrpH9b12c1.clearCheck();
                        secH9b12c2.setVisibility(View.GONE);
                        lineH9b12c2.setVisibility(View.GONE);
                        txtH9b12c2.setText("");
                        secH9b12c3.setVisibility(View.GONE);
                        lineH9b12c3.setVisibility(View.GONE);
                        txtH9b12c3.setText("");
                        secH9b12d1.setVisibility(View.GONE);
                        lineH9b12d1.setVisibility(View.GONE);
                        rdogrpH9b12d1.clearCheck();
                        secH9b12d2.setVisibility(View.GONE);
                        lineH9b12d2.setVisibility(View.GONE);
                        txtH9b12d2.setText("");
                        secH9b12d3.setVisibility(View.GONE);
                        lineH9b12d3.setVisibility(View.GONE);
                        txtH9b12d3.setText("");
                        secH9b12e1.setVisibility(View.GONE);
                        lineH9b12e1.setVisibility(View.GONE);
                        rdogrpH9b12e1.clearCheck();
                        secH9b12e2.setVisibility(View.GONE);
                        lineH9b12e2.setVisibility(View.GONE);
                        txtH9b12e2.setText("");
                        secH9b12e3.setVisibility(View.GONE);
                        lineH9b12e3.setVisibility(View.GONE);
                        txtH9b12e3.setText("");
                        secH9b12f1.setVisibility(View.GONE);
                        lineH9b12f1.setVisibility(View.GONE);
                        rdogrpH9b12f1.clearCheck();
                        secH9b12f2.setVisibility(View.GONE);
                        lineH9b12f2.setVisibility(View.GONE);
                        txtH9b12f2.setText("");
                        secH9b12f3.setVisibility(View.GONE);
                        lineH9b12f3.setVisibility(View.GONE);
                        txtH9b12f3.setText("");
                        secH9b12g1.setVisibility(View.GONE);
                        lineH9b12g1.setVisibility(View.GONE);
                        rdogrpH9b12g1.clearCheck();
                        secH9b12g2.setVisibility(View.GONE);
                        lineH9b12g2.setVisibility(View.GONE);
                        txtH9b12g2.setText("");
                        secH9b12g3.setVisibility(View.GONE);
                        lineH9b12g3.setVisibility(View.GONE);
                        txtH9b12g3.setText("");
                        secH9b12h1.setVisibility(View.GONE);
                        lineH9b12h1.setVisibility(View.GONE);
                        rdogrpH9b12h1.clearCheck();
                        secH9b12h2.setVisibility(View.GONE);
                        lineH9b12h2.setVisibility(View.GONE);
                        txtH9b12h2.setText("");
                        secH9b12h3.setVisibility(View.GONE);
                        lineH9b12h3.setVisibility(View.GONE);
                        txtH9b12h3.setText("");
                        secH9b12i1.setVisibility(View.GONE);
                        lineH9b12i1.setVisibility(View.GONE);
                        rdogrpH9b12i1.clearCheck();
                        secH9b12i2.setVisibility(View.GONE);
                        lineH9b12i2.setVisibility(View.GONE);
                        txtH9b12i2.setText("");
                        secH9b12i3.setVisibility(View.GONE);
                        lineH9b12i3.setVisibility(View.GONE);
                        txtH9b12i3.setText("");
                        secH9b12j1.setVisibility(View.GONE);
                        lineH9b12j1.setVisibility(View.GONE);
                        rdogrpH9b12j1.clearCheck();
                        secH9b12j2.setVisibility(View.GONE);
                        lineH9b12j2.setVisibility(View.GONE);
                        txtH9b12j2.setText("");
                        secH9b12j3.setVisibility(View.GONE);
                        lineH9b12j3.setVisibility(View.GONE);
                        txtH9b12j3.setText("");
                        secH9b12k1.setVisibility(View.GONE);
                        lineH9b12k1.setVisibility(View.GONE);
                        rdogrpH9b12k1.clearCheck();
                        secH9b12k2.setVisibility(View.GONE);
                        lineH9b12k2.setVisibility(View.GONE);
                        txtH9b12k2.setText("");
                        secH9b12k3.setVisibility(View.GONE);
                        lineH9b12k3.setVisibility(View.GONE);
                        txtH9b12k3.setText("");
                        secH9b12l1.setVisibility(View.GONE);
                        lineH9b12l1.setVisibility(View.GONE);
                        rdogrpH9b12l1.clearCheck();
                        secH9b12l2.setVisibility(View.GONE);
                        lineH9b12l2.setVisibility(View.GONE);
                        txtH9b12l2.setText("");
                        secH9b12l3.setVisibility(View.GONE);
                        lineH9b12l3.setVisibility(View.GONE);
                        txtH9b12l3.setText("");
                        secH9b12m1.setVisibility(View.GONE);
                        lineH9b12m1.setVisibility(View.GONE);
                        rdogrpH9b12m1.clearCheck();
                        secH9b12m2.setVisibility(View.GONE);
                        lineH9b12m2.setVisibility(View.GONE);
                        txtH9b12m2.setText("");
                        secH9b12m3.setVisibility(View.GONE);
                        lineH9b12m3.setVisibility(View.GONE);
                        txtH9b12m3.setText("");
                    }
                    else
                    {
                        secH9b12a1.setVisibility(View.VISIBLE);
                        lineH9b12a1.setVisibility(View.VISIBLE);
                        secH9b12a2.setVisibility(View.VISIBLE);
                        lineH9b12a2.setVisibility(View.VISIBLE);
                        secH9b12a3.setVisibility(View.VISIBLE);
                        lineH9b12a3.setVisibility(View.VISIBLE);
                        secH9b12b1.setVisibility(View.VISIBLE);
                        lineH9b12b1.setVisibility(View.VISIBLE);
                        secH9b12b2.setVisibility(View.VISIBLE);
                        lineH9b12b2.setVisibility(View.VISIBLE);
                        secH9b12b3.setVisibility(View.VISIBLE);
                        lineH9b12b3.setVisibility(View.VISIBLE);
                        secH9b12c1.setVisibility(View.VISIBLE);
                        lineH9b12c1.setVisibility(View.VISIBLE);
                        secH9b12c2.setVisibility(View.VISIBLE);
                        lineH9b12c2.setVisibility(View.VISIBLE);
                        secH9b12c3.setVisibility(View.VISIBLE);
                        lineH9b12c3.setVisibility(View.VISIBLE);
                        secH9b12d1.setVisibility(View.VISIBLE);
                        lineH9b12d1.setVisibility(View.VISIBLE);
                        secH9b12d2.setVisibility(View.VISIBLE);
                        lineH9b12d2.setVisibility(View.VISIBLE);
                        secH9b12d3.setVisibility(View.VISIBLE);
                        lineH9b12d3.setVisibility(View.VISIBLE);
                        secH9b12e1.setVisibility(View.VISIBLE);
                        lineH9b12e1.setVisibility(View.VISIBLE);
                        secH9b12e2.setVisibility(View.VISIBLE);
                        lineH9b12e2.setVisibility(View.VISIBLE);
                        secH9b12e3.setVisibility(View.VISIBLE);
                        lineH9b12e3.setVisibility(View.VISIBLE);
                        secH9b12f1.setVisibility(View.VISIBLE);
                        lineH9b12f1.setVisibility(View.VISIBLE);
                        secH9b12f2.setVisibility(View.VISIBLE);
                        lineH9b12f2.setVisibility(View.VISIBLE);
                        secH9b12f3.setVisibility(View.VISIBLE);
                        lineH9b12f3.setVisibility(View.VISIBLE);
                        secH9b12g1.setVisibility(View.VISIBLE);
                        lineH9b12g1.setVisibility(View.VISIBLE);
                        secH9b12g2.setVisibility(View.VISIBLE);
                        lineH9b12g2.setVisibility(View.VISIBLE);
                        secH9b12g3.setVisibility(View.VISIBLE);
                        lineH9b12g3.setVisibility(View.VISIBLE);
                        secH9b12h1.setVisibility(View.VISIBLE);
                        lineH9b12h1.setVisibility(View.VISIBLE);
                        secH9b12h2.setVisibility(View.VISIBLE);
                        lineH9b12h2.setVisibility(View.VISIBLE);
                        secH9b12h3.setVisibility(View.VISIBLE);
                        lineH9b12h3.setVisibility(View.VISIBLE);
                        secH9b12i1.setVisibility(View.VISIBLE);
                        lineH9b12i1.setVisibility(View.VISIBLE);
                        secH9b12i2.setVisibility(View.VISIBLE);
                        lineH9b12i2.setVisibility(View.VISIBLE);
                        secH9b12i3.setVisibility(View.VISIBLE);
                        lineH9b12i3.setVisibility(View.VISIBLE);
                        secH9b12j1.setVisibility(View.VISIBLE);
                        lineH9b12j1.setVisibility(View.VISIBLE);
                        secH9b12j2.setVisibility(View.VISIBLE);
                        lineH9b12j2.setVisibility(View.VISIBLE);
                        secH9b12j3.setVisibility(View.VISIBLE);
                        lineH9b12j3.setVisibility(View.VISIBLE);
                        secH9b12k1.setVisibility(View.VISIBLE);
                        lineH9b12k1.setVisibility(View.VISIBLE);
                        secH9b12k2.setVisibility(View.VISIBLE);
                        lineH9b12k2.setVisibility(View.VISIBLE);
                        secH9b12k3.setVisibility(View.VISIBLE);
                        lineH9b12k3.setVisibility(View.VISIBLE);
                        secH9b12l1.setVisibility(View.VISIBLE);
                        lineH9b12l1.setVisibility(View.VISIBLE);
                        secH9b12l2.setVisibility(View.VISIBLE);
                        lineH9b12l2.setVisibility(View.VISIBLE);
                        secH9b12l3.setVisibility(View.VISIBLE);
                        lineH9b12l3.setVisibility(View.VISIBLE);
                        secH9b12m1.setVisibility(View.VISIBLE);
                        lineH9b12m1.setVisibility(View.VISIBLE);
                        secH9b12m2.setVisibility(View.VISIBLE);
                        lineH9b12m2.setVisibility(View.VISIBLE);
                        secH9b12m3.setVisibility(View.VISIBLE);
                        lineH9b12m3.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b12a1=(LinearLayout)findViewById(R.id.secH9b12a1);
            lineH9b12a1=(View)findViewById(R.id.lineH9b12a1);
            VlblH9b12a1 = (TextView) findViewById(R.id.VlblH9b12a1);
            rdogrpH9b12a1 = (RadioGroup) findViewById(R.id.rdogrpH9b12a1);

            rdoH9b12a11 = (RadioButton) findViewById(R.id.rdoH9b12a11);
            rdoH9b12a12 = (RadioButton) findViewById(R.id.rdoH9b12a12);
            rdogrpH9b12a1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b12a1 = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b12a1.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b12a1.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b12a1[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b12a2.setVisibility(View.GONE);
                        lineH9b12a2.setVisibility(View.GONE);
                        txtH9b12a2.setText("");
                        secH9b12a3.setVisibility(View.GONE);
                        lineH9b12a3.setVisibility(View.GONE);
                        txtH9b12a3.setText("");
                    }
                    else
                    {
                        secH9b12a2.setVisibility(View.VISIBLE);
                        lineH9b12a2.setVisibility(View.VISIBLE);
                        secH9b12a3.setVisibility(View.VISIBLE);
                        lineH9b12a3.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b12a2=(LinearLayout)findViewById(R.id.secH9b12a2);
            lineH9b12a2=(View)findViewById(R.id.lineH9b12a2);
            VlblH9b12a2=(TextView) findViewById(R.id.VlblH9b12a2);
            txtH9b12a2=(EditText) findViewById(R.id.txtH9b12a2);
            secH9b12a3=(LinearLayout)findViewById(R.id.secH9b12a3);
            lineH9b12a3=(View)findViewById(R.id.lineH9b12a3);
            VlblH9b12a3=(TextView) findViewById(R.id.VlblH9b12a3);
            txtH9b12a3=(EditText) findViewById(R.id.txtH9b12a3);
            secH9b12b1=(LinearLayout)findViewById(R.id.secH9b12b1);
            lineH9b12b1=(View)findViewById(R.id.lineH9b12b1);
            VlblH9b12b1 = (TextView) findViewById(R.id.VlblH9b12b1);
            rdogrpH9b12b1 = (RadioGroup) findViewById(R.id.rdogrpH9b12b1);

            rdoH9b12b11 = (RadioButton) findViewById(R.id.rdoH9b12b11);
            rdoH9b12b12 = (RadioButton) findViewById(R.id.rdoH9b12b12);
            rdogrpH9b12b1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b12b1 = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b12b1.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b12b1.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b12b1[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b12b2.setVisibility(View.GONE);
                        lineH9b12b2.setVisibility(View.GONE);
                        txtH9b12b2.setText("");
                        secH9b12b3.setVisibility(View.GONE);
                        lineH9b12b3.setVisibility(View.GONE);
                        txtH9b12b3.setText("");
                    }
                    else
                    {
                        secH9b12b2.setVisibility(View.VISIBLE);
                        lineH9b12b2.setVisibility(View.VISIBLE);
                        secH9b12b3.setVisibility(View.VISIBLE);
                        lineH9b12b3.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b12b2=(LinearLayout)findViewById(R.id.secH9b12b2);
            lineH9b12b2=(View)findViewById(R.id.lineH9b12b2);
            VlblH9b12b2=(TextView) findViewById(R.id.VlblH9b12b2);
            txtH9b12b2=(EditText) findViewById(R.id.txtH9b12b2);
            secH9b12b3=(LinearLayout)findViewById(R.id.secH9b12b3);
            lineH9b12b3=(View)findViewById(R.id.lineH9b12b3);
            VlblH9b12b3=(TextView) findViewById(R.id.VlblH9b12b3);
            txtH9b12b3=(EditText) findViewById(R.id.txtH9b12b3);
            secH9b12c1=(LinearLayout)findViewById(R.id.secH9b12c1);
            lineH9b12c1=(View)findViewById(R.id.lineH9b12c1);
            VlblH9b12c1 = (TextView) findViewById(R.id.VlblH9b12c1);
            rdogrpH9b12c1 = (RadioGroup) findViewById(R.id.rdogrpH9b12c1);

            rdoH9b12c11 = (RadioButton) findViewById(R.id.rdoH9b12c11);
            rdoH9b12c12 = (RadioButton) findViewById(R.id.rdoH9b12c12);
            rdogrpH9b12c1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b12c1 = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b12c1.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b12c1.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b12c1[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b12c2.setVisibility(View.GONE);
                        lineH9b12c2.setVisibility(View.GONE);
                        txtH9b12c2.setText("");
                        secH9b12c3.setVisibility(View.GONE);
                        lineH9b12c3.setVisibility(View.GONE);
                        txtH9b12c3.setText("");
                    }
                    else
                    {
                        secH9b12c2.setVisibility(View.VISIBLE);
                        lineH9b12c2.setVisibility(View.VISIBLE);
                        secH9b12c3.setVisibility(View.VISIBLE);
                        lineH9b12c3.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b12c2=(LinearLayout)findViewById(R.id.secH9b12c2);
            lineH9b12c2=(View)findViewById(R.id.lineH9b12c2);
            VlblH9b12c2=(TextView) findViewById(R.id.VlblH9b12c2);
            txtH9b12c2=(EditText) findViewById(R.id.txtH9b12c2);
            secH9b12c3=(LinearLayout)findViewById(R.id.secH9b12c3);
            lineH9b12c3=(View)findViewById(R.id.lineH9b12c3);
            VlblH9b12c3=(TextView) findViewById(R.id.VlblH9b12c3);
            txtH9b12c3=(EditText) findViewById(R.id.txtH9b12c3);
            secH9b12d1=(LinearLayout)findViewById(R.id.secH9b12d1);
            lineH9b12d1=(View)findViewById(R.id.lineH9b12d1);
            VlblH9b12d1 = (TextView) findViewById(R.id.VlblH9b12d1);
            rdogrpH9b12d1 = (RadioGroup) findViewById(R.id.rdogrpH9b12d1);

            rdoH9b12d11 = (RadioButton) findViewById(R.id.rdoH9b12d11);
            rdoH9b12d12 = (RadioButton) findViewById(R.id.rdoH9b12d12);
            rdogrpH9b12d1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b12d1 = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b12d1.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b12d1.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b12d1[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b12d2.setVisibility(View.GONE);
                        lineH9b12d2.setVisibility(View.GONE);
                        txtH9b12d2.setText("");
                        secH9b12d3.setVisibility(View.GONE);
                        lineH9b12d3.setVisibility(View.GONE);
                        txtH9b12d3.setText("");
                    }
                    else
                    {
                        secH9b12d2.setVisibility(View.VISIBLE);
                        lineH9b12d2.setVisibility(View.VISIBLE);
                        secH9b12d3.setVisibility(View.VISIBLE);
                        lineH9b12d3.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b12d2=(LinearLayout)findViewById(R.id.secH9b12d2);
            lineH9b12d2=(View)findViewById(R.id.lineH9b12d2);
            VlblH9b12d2=(TextView) findViewById(R.id.VlblH9b12d2);
            txtH9b12d2=(EditText) findViewById(R.id.txtH9b12d2);
            secH9b12d3=(LinearLayout)findViewById(R.id.secH9b12d3);
            lineH9b12d3=(View)findViewById(R.id.lineH9b12d3);
            VlblH9b12d3=(TextView) findViewById(R.id.VlblH9b12d3);
            txtH9b12d3=(EditText) findViewById(R.id.txtH9b12d3);
            secH9b12e1=(LinearLayout)findViewById(R.id.secH9b12e1);
            lineH9b12e1=(View)findViewById(R.id.lineH9b12e1);
            VlblH9b12e1 = (TextView) findViewById(R.id.VlblH9b12e1);
            rdogrpH9b12e1 = (RadioGroup) findViewById(R.id.rdogrpH9b12e1);

            rdoH9b12e11 = (RadioButton) findViewById(R.id.rdoH9b12e11);
            rdoH9b12e12 = (RadioButton) findViewById(R.id.rdoH9b12e12);
            rdogrpH9b12e1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b12e1 = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b12e1.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b12e1.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b12e1[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b12e2.setVisibility(View.GONE);
                        lineH9b12e2.setVisibility(View.GONE);
                        txtH9b12e2.setText("");
                        secH9b12e3.setVisibility(View.GONE);
                        lineH9b12e3.setVisibility(View.GONE);
                        txtH9b12e3.setText("");
                    }
                    else
                    {
                        secH9b12e2.setVisibility(View.VISIBLE);
                        lineH9b12e2.setVisibility(View.VISIBLE);
                        secH9b12e3.setVisibility(View.VISIBLE);
                        lineH9b12e3.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b12e2=(LinearLayout)findViewById(R.id.secH9b12e2);
            lineH9b12e2=(View)findViewById(R.id.lineH9b12e2);
            VlblH9b12e2=(TextView) findViewById(R.id.VlblH9b12e2);
            txtH9b12e2=(EditText) findViewById(R.id.txtH9b12e2);
            secH9b12e3=(LinearLayout)findViewById(R.id.secH9b12e3);
            lineH9b12e3=(View)findViewById(R.id.lineH9b12e3);
            VlblH9b12e3=(TextView) findViewById(R.id.VlblH9b12e3);
            txtH9b12e3=(EditText) findViewById(R.id.txtH9b12e3);
            secH9b12f1=(LinearLayout)findViewById(R.id.secH9b12f1);
            lineH9b12f1=(View)findViewById(R.id.lineH9b12f1);
            VlblH9b12f1 = (TextView) findViewById(R.id.VlblH9b12f1);
            rdogrpH9b12f1 = (RadioGroup) findViewById(R.id.rdogrpH9b12f1);

            rdoH9b12f11 = (RadioButton) findViewById(R.id.rdoH9b12f11);
            rdoH9b12f12 = (RadioButton) findViewById(R.id.rdoH9b12f12);
            rdogrpH9b12f1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b12f1 = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b12f1.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b12f1.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b12f1[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b12f2.setVisibility(View.GONE);
                        lineH9b12f2.setVisibility(View.GONE);
                        txtH9b12f2.setText("");
                        secH9b12f3.setVisibility(View.GONE);
                        lineH9b12f3.setVisibility(View.GONE);
                        txtH9b12f3.setText("");
                    }
                    else
                    {
                        secH9b12f2.setVisibility(View.VISIBLE);
                        lineH9b12f2.setVisibility(View.VISIBLE);
                        secH9b12f3.setVisibility(View.VISIBLE);
                        lineH9b12f3.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b12f2=(LinearLayout)findViewById(R.id.secH9b12f2);
            lineH9b12f2=(View)findViewById(R.id.lineH9b12f2);
            VlblH9b12f2=(TextView) findViewById(R.id.VlblH9b12f2);
            txtH9b12f2=(EditText) findViewById(R.id.txtH9b12f2);
            secH9b12f3=(LinearLayout)findViewById(R.id.secH9b12f3);
            lineH9b12f3=(View)findViewById(R.id.lineH9b12f3);
            VlblH9b12f3=(TextView) findViewById(R.id.VlblH9b12f3);
            txtH9b12f3=(EditText) findViewById(R.id.txtH9b12f3);
            secH9b12g1=(LinearLayout)findViewById(R.id.secH9b12g1);
            lineH9b12g1=(View)findViewById(R.id.lineH9b12g1);
            VlblH9b12g1 = (TextView) findViewById(R.id.VlblH9b12g1);
            rdogrpH9b12g1 = (RadioGroup) findViewById(R.id.rdogrpH9b12g1);

            rdoH9b12g11 = (RadioButton) findViewById(R.id.rdoH9b12g11);
            rdoH9b12g12 = (RadioButton) findViewById(R.id.rdoH9b12g12);
            rdogrpH9b12g1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b12g1 = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b12g1.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b12g1.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b12g1[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b12g2.setVisibility(View.GONE);
                        lineH9b12g2.setVisibility(View.GONE);
                        txtH9b12g2.setText("");
                        secH9b12g3.setVisibility(View.GONE);
                        lineH9b12g3.setVisibility(View.GONE);
                        txtH9b12g3.setText("");
                    }
                    else
                    {
                        secH9b12g2.setVisibility(View.VISIBLE);
                        lineH9b12g2.setVisibility(View.VISIBLE);
                        secH9b12g3.setVisibility(View.VISIBLE);
                        lineH9b12g3.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b12g2=(LinearLayout)findViewById(R.id.secH9b12g2);
            lineH9b12g2=(View)findViewById(R.id.lineH9b12g2);
            VlblH9b12g2=(TextView) findViewById(R.id.VlblH9b12g2);
            txtH9b12g2=(EditText) findViewById(R.id.txtH9b12g2);
            secH9b12g3=(LinearLayout)findViewById(R.id.secH9b12g3);
            lineH9b12g3=(View)findViewById(R.id.lineH9b12g3);
            VlblH9b12g3=(TextView) findViewById(R.id.VlblH9b12g3);
            txtH9b12g3=(EditText) findViewById(R.id.txtH9b12g3);
            secH9b12h1=(LinearLayout)findViewById(R.id.secH9b12h1);
            lineH9b12h1=(View)findViewById(R.id.lineH9b12h1);
            VlblH9b12h1 = (TextView) findViewById(R.id.VlblH9b12h1);
            rdogrpH9b12h1 = (RadioGroup) findViewById(R.id.rdogrpH9b12h1);

            rdoH9b12h11 = (RadioButton) findViewById(R.id.rdoH9b12h11);
            rdoH9b12h12 = (RadioButton) findViewById(R.id.rdoH9b12h12);
            rdogrpH9b12h1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b12h1 = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b12h1.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b12h1.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b12h1[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b12h2.setVisibility(View.GONE);
                        lineH9b12h2.setVisibility(View.GONE);
                        txtH9b12h2.setText("");
                        secH9b12h3.setVisibility(View.GONE);
                        lineH9b12h3.setVisibility(View.GONE);
                        txtH9b12h3.setText("");
                    }
                    else
                    {
                        secH9b12h2.setVisibility(View.VISIBLE);
                        lineH9b12h2.setVisibility(View.VISIBLE);
                        secH9b12h3.setVisibility(View.VISIBLE);
                        lineH9b12h3.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b12h2=(LinearLayout)findViewById(R.id.secH9b12h2);
            lineH9b12h2=(View)findViewById(R.id.lineH9b12h2);
            VlblH9b12h2=(TextView) findViewById(R.id.VlblH9b12h2);
            txtH9b12h2=(EditText) findViewById(R.id.txtH9b12h2);
            secH9b12h3=(LinearLayout)findViewById(R.id.secH9b12h3);
            lineH9b12h3=(View)findViewById(R.id.lineH9b12h3);
            VlblH9b12h3=(TextView) findViewById(R.id.VlblH9b12h3);
            txtH9b12h3=(EditText) findViewById(R.id.txtH9b12h3);
            secH9b12i1=(LinearLayout)findViewById(R.id.secH9b12i1);
            lineH9b12i1=(View)findViewById(R.id.lineH9b12i1);
            VlblH9b12i1 = (TextView) findViewById(R.id.VlblH9b12i1);
            rdogrpH9b12i1 = (RadioGroup) findViewById(R.id.rdogrpH9b12i1);

            rdoH9b12i11 = (RadioButton) findViewById(R.id.rdoH9b12i11);
            rdoH9b12i12 = (RadioButton) findViewById(R.id.rdoH9b12i12);
            rdogrpH9b12i1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b12i1 = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b12i1.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b12i1.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b12i1[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b12i2.setVisibility(View.GONE);
                        lineH9b12i2.setVisibility(View.GONE);
                        txtH9b12i2.setText("");
                        secH9b12i3.setVisibility(View.GONE);
                        lineH9b12i3.setVisibility(View.GONE);
                        txtH9b12i3.setText("");
                    }
                    else
                    {
                        secH9b12i2.setVisibility(View.VISIBLE);
                        lineH9b12i2.setVisibility(View.VISIBLE);
                        secH9b12i3.setVisibility(View.VISIBLE);
                        lineH9b12i3.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b12i2=(LinearLayout)findViewById(R.id.secH9b12i2);
            lineH9b12i2=(View)findViewById(R.id.lineH9b12i2);
            VlblH9b12i2=(TextView) findViewById(R.id.VlblH9b12i2);
            txtH9b12i2=(EditText) findViewById(R.id.txtH9b12i2);
            secH9b12i3=(LinearLayout)findViewById(R.id.secH9b12i3);
            lineH9b12i3=(View)findViewById(R.id.lineH9b12i3);
            VlblH9b12i3=(TextView) findViewById(R.id.VlblH9b12i3);
            txtH9b12i3=(EditText) findViewById(R.id.txtH9b12i3);
            secH9b12j1=(LinearLayout)findViewById(R.id.secH9b12j1);
            lineH9b12j1=(View)findViewById(R.id.lineH9b12j1);
            VlblH9b12j1 = (TextView) findViewById(R.id.VlblH9b12j1);
            rdogrpH9b12j1 = (RadioGroup) findViewById(R.id.rdogrpH9b12j1);

            rdoH9b12j11 = (RadioButton) findViewById(R.id.rdoH9b12j11);
            rdoH9b12j12 = (RadioButton) findViewById(R.id.rdoH9b12j12);
            rdogrpH9b12j1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b12j1 = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b12j1.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b12j1.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b12j1[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b12j2.setVisibility(View.GONE);
                        lineH9b12j2.setVisibility(View.GONE);
                        txtH9b12j2.setText("");
                        secH9b12j3.setVisibility(View.GONE);
                        lineH9b12j3.setVisibility(View.GONE);
                        txtH9b12j3.setText("");
                    }
                    else
                    {
                        secH9b12j2.setVisibility(View.VISIBLE);
                        lineH9b12j2.setVisibility(View.VISIBLE);
                        secH9b12j3.setVisibility(View.VISIBLE);
                        lineH9b12j3.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b12j2=(LinearLayout)findViewById(R.id.secH9b12j2);
            lineH9b12j2=(View)findViewById(R.id.lineH9b12j2);
            VlblH9b12j2=(TextView) findViewById(R.id.VlblH9b12j2);
            txtH9b12j2=(EditText) findViewById(R.id.txtH9b12j2);
            secH9b12j3=(LinearLayout)findViewById(R.id.secH9b12j3);
            lineH9b12j3=(View)findViewById(R.id.lineH9b12j3);
            VlblH9b12j3=(TextView) findViewById(R.id.VlblH9b12j3);
            txtH9b12j3=(EditText) findViewById(R.id.txtH9b12j3);
            secH9b12k1=(LinearLayout)findViewById(R.id.secH9b12k1);
            lineH9b12k1=(View)findViewById(R.id.lineH9b12k1);
            VlblH9b12k1 = (TextView) findViewById(R.id.VlblH9b12k1);
            rdogrpH9b12k1 = (RadioGroup) findViewById(R.id.rdogrpH9b12k1);

            rdoH9b12k11 = (RadioButton) findViewById(R.id.rdoH9b12k11);
            rdoH9b12k12 = (RadioButton) findViewById(R.id.rdoH9b12k12);
            rdogrpH9b12k1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b12k1 = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b12k1.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b12k1.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b12k1[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b12k2.setVisibility(View.GONE);
                        lineH9b12k2.setVisibility(View.GONE);
                        txtH9b12k2.setText("");
                        secH9b12k3.setVisibility(View.GONE);
                        lineH9b12k3.setVisibility(View.GONE);
                        txtH9b12k3.setText("");
                    }
                    else
                    {
                        secH9b12k2.setVisibility(View.VISIBLE);
                        lineH9b12k2.setVisibility(View.VISIBLE);
                        secH9b12k3.setVisibility(View.VISIBLE);
                        lineH9b12k3.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b12k2=(LinearLayout)findViewById(R.id.secH9b12k2);
            lineH9b12k2=(View)findViewById(R.id.lineH9b12k2);
            VlblH9b12k2=(TextView) findViewById(R.id.VlblH9b12k2);
            txtH9b12k2=(EditText) findViewById(R.id.txtH9b12k2);
            secH9b12k3=(LinearLayout)findViewById(R.id.secH9b12k3);
            lineH9b12k3=(View)findViewById(R.id.lineH9b12k3);
            VlblH9b12k3=(TextView) findViewById(R.id.VlblH9b12k3);
            txtH9b12k3=(EditText) findViewById(R.id.txtH9b12k3);
            secH9b12l1=(LinearLayout)findViewById(R.id.secH9b12l1);
            lineH9b12l1=(View)findViewById(R.id.lineH9b12l1);
            VlblH9b12l1 = (TextView) findViewById(R.id.VlblH9b12l1);
            rdogrpH9b12l1 = (RadioGroup) findViewById(R.id.rdogrpH9b12l1);

            rdoH9b12l11 = (RadioButton) findViewById(R.id.rdoH9b12l11);
            rdoH9b12l12 = (RadioButton) findViewById(R.id.rdoH9b12l12);
            rdogrpH9b12l1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b12l1 = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b12l1.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b12l1.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b12l1[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b12l2.setVisibility(View.GONE);
                        lineH9b12l2.setVisibility(View.GONE);
                        txtH9b12l2.setText("");
                        secH9b12l3.setVisibility(View.GONE);
                        lineH9b12l3.setVisibility(View.GONE);
                        txtH9b12l3.setText("");
                    }
                    else
                    {
                        secH9b12l2.setVisibility(View.VISIBLE);
                        lineH9b12l2.setVisibility(View.VISIBLE);
                        secH9b12l3.setVisibility(View.VISIBLE);
                        lineH9b12l3.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b12l2=(LinearLayout)findViewById(R.id.secH9b12l2);
            lineH9b12l2=(View)findViewById(R.id.lineH9b12l2);
            VlblH9b12l2=(TextView) findViewById(R.id.VlblH9b12l2);
            txtH9b12l2=(EditText) findViewById(R.id.txtH9b12l2);
            secH9b12l3=(LinearLayout)findViewById(R.id.secH9b12l3);
            lineH9b12l3=(View)findViewById(R.id.lineH9b12l3);
            VlblH9b12l3=(TextView) findViewById(R.id.VlblH9b12l3);
            txtH9b12l3=(EditText) findViewById(R.id.txtH9b12l3);
            secH9b12m1=(LinearLayout)findViewById(R.id.secH9b12m1);
            lineH9b12m1=(View)findViewById(R.id.lineH9b12m1);
            VlblH9b12m1 = (TextView) findViewById(R.id.VlblH9b12m1);
            rdogrpH9b12m1 = (RadioGroup) findViewById(R.id.rdogrpH9b12m1);

            rdoH9b12m11 = (RadioButton) findViewById(R.id.rdoH9b12m11);
            rdoH9b12m12 = (RadioButton) findViewById(R.id.rdoH9b12m12);
            rdogrpH9b12m1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b12m1 = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b12m1.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b12m1.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b12m1[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b12m2.setVisibility(View.GONE);
                        lineH9b12m2.setVisibility(View.GONE);
                        txtH9b12m2.setText("");
                        secH9b12m3.setVisibility(View.GONE);
                        lineH9b12m3.setVisibility(View.GONE);
                        txtH9b12m3.setText("");
                        secH9b13a.setVisibility(View.GONE);
                        lineH9b13a.setVisibility(View.GONE);
                        rdogrpH9b13a.clearCheck();
                        secH9b13b.setVisibility(View.GONE);
                        lineH9b13b.setVisibility(View.GONE);
                        txtH9b13b.setText("");
                        secH9b13c.setVisibility(View.GONE);
                        lineH9b13c.setVisibility(View.GONE);
                        txtH9b13c.setText("");
                        secH9b14a.setVisibility(View.GONE);
                        lineH9b14a.setVisibility(View.GONE);
                        rdogrpH9b14a.clearCheck();
                        secH9b14x1.setVisibility(View.GONE);
                        lineH9b14x1.setVisibility(View.GONE);
                        txtH9b14x1.setText("");
                        secH9b14b.setVisibility(View.GONE);
                        lineH9b14b.setVisibility(View.GONE);
                        txtH9b14b.setText("");
                    }
                    else
                    {
                        secH9b12m2.setVisibility(View.VISIBLE);
                        lineH9b12m2.setVisibility(View.VISIBLE);
                        secH9b12m3.setVisibility(View.VISIBLE);
                        lineH9b12m3.setVisibility(View.VISIBLE);
                        secH9b13a.setVisibility(View.VISIBLE);
                        lineH9b13a.setVisibility(View.VISIBLE);
                        secH9b13b.setVisibility(View.VISIBLE);
                        lineH9b13b.setVisibility(View.VISIBLE);
                        secH9b13c.setVisibility(View.VISIBLE);
                        lineH9b13c.setVisibility(View.VISIBLE);
                        secH9b14a.setVisibility(View.VISIBLE);
                        lineH9b14a.setVisibility(View.VISIBLE);
                        secH9b14x1.setVisibility(View.VISIBLE);
                        lineH9b14x1.setVisibility(View.VISIBLE);
                        secH9b14b.setVisibility(View.VISIBLE);
                        lineH9b14b.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b12m2=(LinearLayout)findViewById(R.id.secH9b12m2);
            lineH9b12m2=(View)findViewById(R.id.lineH9b12m2);
            VlblH9b12m2=(TextView) findViewById(R.id.VlblH9b12m2);
            txtH9b12m2=(EditText) findViewById(R.id.txtH9b12m2);
            secH9b12m3=(LinearLayout)findViewById(R.id.secH9b12m3);
            lineH9b12m3=(View)findViewById(R.id.lineH9b12m3);
            VlblH9b12m3=(TextView) findViewById(R.id.VlblH9b12m3);
            txtH9b12m3=(EditText) findViewById(R.id.txtH9b12m3);
            secLBH9b13=(LinearLayout)findViewById(R.id.secLBH9b13);
            secH9b13a=(LinearLayout)findViewById(R.id.secH9b13a);
            lineH9b13a=(View)findViewById(R.id.lineH9b13a);
            VlblH9b13a = (TextView) findViewById(R.id.VlblH9b13a);
            rdogrpH9b13a = (RadioGroup) findViewById(R.id.rdogrpH9b13a);

            rdoH9b13a1 = (RadioButton) findViewById(R.id.rdoH9b13a1);
            rdoH9b13a2 = (RadioButton) findViewById(R.id.rdoH9b13a2);
            rdogrpH9b13a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b13a = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b13a.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b13a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b13a[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secH9b13b.setVisibility(View.GONE);
                        lineH9b13b.setVisibility(View.GONE);
                        txtH9b13b.setText("");
                        secH9b13c.setVisibility(View.GONE);
                        lineH9b13c.setVisibility(View.GONE);
                        txtH9b13c.setText("");
                    }
                    else
                    {
                        secH9b13b.setVisibility(View.VISIBLE);
                        lineH9b13b.setVisibility(View.VISIBLE);
                        secH9b13c.setVisibility(View.VISIBLE);
                        lineH9b13c.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b13b=(LinearLayout)findViewById(R.id.secH9b13b);
            lineH9b13b=(View)findViewById(R.id.lineH9b13b);
            VlblH9b13b=(TextView) findViewById(R.id.VlblH9b13b);
            txtH9b13b=(EditText) findViewById(R.id.txtH9b13b);
            secH9b13c=(LinearLayout)findViewById(R.id.secH9b13c);
            lineH9b13c=(View)findViewById(R.id.lineH9b13c);
            VlblH9b13c=(TextView) findViewById(R.id.VlblH9b13c);
            txtH9b13c=(EditText) findViewById(R.id.txtH9b13c);
            secH9b14a=(LinearLayout)findViewById(R.id.secH9b14a);
            lineH9b14a=(View)findViewById(R.id.lineH9b14a);
            VlblH9b14a = (TextView) findViewById(R.id.VlblH9b14a);
            rdogrpH9b14a = (RadioGroup) findViewById(R.id.rdogrpH9b14a);

            rdoH9b14a1 = (RadioButton) findViewById(R.id.rdoH9b14a1);
            rdoH9b14a2 = (RadioButton) findViewById(R.id.rdoH9b14a2);
            rdogrpH9b14a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH9b14a = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpH9b14a.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpH9b14a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH9b14a[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                    }
                    else
                    {
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH9b14x1=(LinearLayout)findViewById(R.id.secH9b14x1);
            lineH9b14x1=(View)findViewById(R.id.lineH9b14x1);
            VlblH9b14x1=(TextView) findViewById(R.id.VlblH9b14x1);
            txtH9b14x1=(EditText) findViewById(R.id.txtH9b14x1);
            secH9b14b=(LinearLayout)findViewById(R.id.secH9b14b);
            lineH9b14b=(View)findViewById(R.id.lineH9b14b);
            VlblH9b14b=(TextView) findViewById(R.id.VlblH9b14b);
            txtH9b14b=(EditText) findViewById(R.id.txtH9b14b);
            secH9b14c=(LinearLayout)findViewById(R.id.secH9b14c);
            lineH9b14c=(View)findViewById(R.id.lineH9b14c);
            VlblH9b14c=(TextView) findViewById(R.id.VlblH9b14c);
            txtH9b14c=(EditText) findViewById(R.id.txtH9b14c);


            txtRnd.setText(RND);
            txtSuchanaID.setText(SUCHANAID);
            txtRnd.setEnabled(false);
            txtSuchanaID.setEnabled(false);

            secH8121x1.setVisibility(View.GONE);
            lineH8121x1.setVisibility(View.GONE);

            secH8112x1.setVisibility(View.GONE);
            lineH8112x1.setVisibility(View.GONE);

            DataSearch(RND,SUCHANAID);

            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }});
        }
        catch(Exception  e)
        {
            Connection.MessageBox(Cost3.this, e.getMessage());
            return;
        }
    }

    private void DataSave()
    {
        try
        {

            String DV="";

            if(txtRnd.getText().toString().length()==0 & secRnd.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtRnd.getText().toString().length()==0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length()==0 ? "5" : txtRnd.getText().toString()) > 5)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            }
            else if(txtSuchanaID.getText().toString().length()==0 & secSuchanaID.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: উপকারভোগী/সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            }
            else if (spnMSlNo.getSelectedItem().toString().length() == 0 & secMSlNo.isShown()) {
                Connection.MessageBox(Cost3.this, "Required field: তথ্যদানে সহায়তাকারীর লাইন নম্বর #.");
                // txtMSlNo.requestFocus();
                return;
            }

            else if(!rdoH8111a1.isChecked() & !rdoH8111a2.isChecked() & secH8111a.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (পান সুপারি কিনেছে).");
                rdoH8111a1.requestFocus();
                return;
            }
            else if(txtH8111b.getText().toString().length()==0 & secH8111b.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH8111b.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH8111b.getText().toString().length()==0 ? "1" : txtH8111b.getText().toString()) < 1 || Integer.valueOf(txtH8111b.getText().toString().length()==0 ? "999" : txtH8111b.getText().toString()) > 999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 999(পরিমাণ(সংখ্যা)).");
                txtH8111b.requestFocus();
                return;
            }

            else if(!rdoH8111c1.isChecked() & !rdoH8111c2.isChecked() & !rdoH8111c3.isChecked() & secH8111c.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (ইউনিট ).");
                rdoH8111c1.requestFocus();
                return;
            }
            else if(txtH8111d.getText().toString().length()==0 & secH8111d.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH8111d.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH8111d.getText().toString().length()==0 ? "1" : txtH8111d.getText().toString()) < 1 || Integer.valueOf(txtH8111d.getText().toString().length()==0 ? "999999" : txtH8111d.getText().toString()) > 999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH8111d.requestFocus();
                return;
            }

            else if(!rdoH121a1.isChecked() & !rdoH121a2.isChecked() & secH121a.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (অন্যান্য কিনেছে).");
                rdoH121a1.requestFocus();
                return;
            }
            else if(txtH8121x1.getText().toString().length()==0 & secH8121x1.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: অন্যান্য নির্দিষ্ট করুন.");
                txtH8121x1.requestFocus();
                return;
            }
            else if(txtH8121b.getText().toString().length()==0 & secH8121b.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH8121b.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH8121b.getText().toString().length()==0 ? "1" : txtH8121b.getText().toString()) < 1 || Integer.valueOf(txtH8121b.getText().toString().length()==0 ? "999" : txtH8121b.getText().toString()) > 999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 999(পরিমাণ(সংখ্যা)).");
                txtH8121b.requestFocus();
                return;
            }

            else if(!rdoH8121c1.isChecked() & !rdoH8121c2.isChecked() & !rdoH8121c3.isChecked() & secH8121c.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (ইউনিট ).");
                rdoH8121c1.requestFocus();
                return;
            }
            else if(txtH8121d.getText().toString().length()==0 & secH8121d.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH8121d.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH8121d.getText().toString().length()==0 ? "1" : txtH8121d.getText().toString()) < 1 || Integer.valueOf(txtH8121d.getText().toString().length()==0 ? "999999" : txtH8121d.getText().toString()) > 999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH8121d.requestFocus();
                return;
            }

            else if(!rdoH8112a1.isChecked() & !rdoH8112a2.isChecked() & secH8112a.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (অন্যান্য2  কিনেছে).");
                rdoH8112a1.requestFocus();
                return;
            }
            else if(txtH8112x1.getText().toString().length()==0 & secH8112x1.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: অন্যান্য নির্দিষ্ট করুন.");
                txtH8112x1.requestFocus();
                return;
            }
            else if(txtH8112b.getText().toString().length()==0 & secH8112b.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH8112b.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH8112b.getText().toString().length()==0 ? "1" : txtH8112b.getText().toString()) < 1 || Integer.valueOf(txtH8112b.getText().toString().length()==0 ? "999" : txtH8112b.getText().toString()) > 999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 999(পরিমাণ(সংখ্যা)).");
                txtH8112b.requestFocus();
                return;
            }

            else if(!rdoH8112c1.isChecked() & !rdoH8112c2.isChecked() & !rdoH8112c3.isChecked() & secH8112c.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (ইউনিট ).");
                rdoH8112c1.requestFocus();
                return;
            }
            else if(txtH8112d.getText().toString().length()==0 & secH8112d.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH8112d.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH8112d.getText().toString().length()==0 ? "1" : txtH8112d.getText().toString()) < 1 || Integer.valueOf(txtH8112d.getText().toString().length()==0 ? "999999" : txtH8112d.getText().toString()) > 999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH8112d.requestFocus();
                return;
            }

            else if(!rdoH9a1a1.isChecked() & !rdoH9a1a2.isChecked() & secH9a1a.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (গত ১ মাসে  এ  কোনো জ্বালানি অথবা ঘর আলোকিত করার উপকরণ ক্রয় করেছেন).");
                rdoH9a1a1.requestFocus();
                return;
            }
            else if(txtH9a1b.getText().toString().length()==0 & secH9a1b.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9a1b.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9a1b.getText().toString().length()==0 ? "1" : txtH9a1b.getText().toString()) < 1 || Integer.valueOf(txtH9a1b.getText().toString().length()==0 ? "9999999" : txtH9a1b.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9a1b.requestFocus();
                return;
            }
            else if(txtH9a1c.getText().toString().length()==0 & secH9a1c.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9a1c.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9a1c.getText().toString().length()==0 ? "1" : txtH9a1c.getText().toString()) < 1 || Integer.valueOf(txtH9a1c.getText().toString().length()==0 ? "9999999" : txtH9a1c.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9a1c.requestFocus();
                return;
            }

            else if(!rdoH9a2a1.isChecked() & !rdoH9a2a2.isChecked() & secH9a2a.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (গত ১ মাসে  এ  এ কোনো প্রসাধনী ক্রয় করেছেন).");
                rdoH9a2a1.requestFocus();
                return;
            }
            else if(txtH9a2b.getText().toString().length()==0 & secH9a2b.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9a2b.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9a2b.getText().toString().length()==0 ? "1" : txtH9a2b.getText().toString()) < 1 || Integer.valueOf(txtH9a2b.getText().toString().length()==0 ? "9999999" : txtH9a2b.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9a2b.requestFocus();
                return;
            }
            else if(txtH9a2c.getText().toString().length()==0 & secH9a2c.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9a2c.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9a2c.getText().toString().length()==0 ? "1" : txtH9a2c.getText().toString()) < 1 || Integer.valueOf(txtH9a2c.getText().toString().length()==0 ? "9999999" : txtH9a2c.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9a2c.requestFocus();
                return;
            }

            else if(!rdoH9a3a1.isChecked() & !rdoH9a3a2.isChecked() & secH9a3a.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (গত ১ মাসে  এ  কোন ধোয়া মোছা এবং ঘর পরিষ্কারের উপকরণ ক্রয় করেছেন).");
                rdoH9a3a1.requestFocus();
                return;
            }
            else if(txtH9a3b.getText().toString().length()==0 & secH9a3b.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9a3b.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9a3b.getText().toString().length()==0 ? "1" : txtH9a3b.getText().toString()) < 1 || Integer.valueOf(txtH9a3b.getText().toString().length()==0 ? "9999999" : txtH9a3b.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9a3b.requestFocus();
                return;
            }
            else if(txtH9a3c.getText().toString().length()==0 & secH9a3c.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9a3c.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9a3c.getText().toString().length()==0 ? "1" : txtH9a3c.getText().toString()) < 1 || Integer.valueOf(txtH9a3c.getText().toString().length()==0 ? "9999999" : txtH9a3c.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9a3c.requestFocus();
                return;
            }

            else if(!rdoH9a4a1.isChecked() & !rdoH9a4a2.isChecked() & secH9a4a.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (গত ১ মাসে  এ  পরিবহনের জন্য কোন ভাড়া দিয়েছেন).");
                rdoH9a4a1.requestFocus();
                return;
            }
            else if(txtH9a4b.getText().toString().length()==0 & secH9a4b.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9a4b.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9a4b.getText().toString().length()==0 ? "1" : txtH9a4b.getText().toString()) < 1 || Integer.valueOf(txtH9a4b.getText().toString().length()==0 ? "9999999" : txtH9a4b.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9a4b.requestFocus();
                return;
            }
            else if(txtH9a4c.getText().toString().length()==0 & secH9a4c.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9a4c.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9a4c.getText().toString().length()==0 ? "1" : txtH9a4c.getText().toString()) < 1 || Integer.valueOf(txtH9a4c.getText().toString().length()==0 ? "9999999" : txtH9a4c.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9a4c.requestFocus();
                return;
            }

            else if(!rdoH9a5a1.isChecked() & !rdoH9a5a2.isChecked() & secH9a5a.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (গত ১ মাসে  এ  কোনো বিল / বেতন দিয়েছেন  ).");
                rdoH9a5a1.requestFocus();
                return;
            }
            else if(txtH9a5b.getText().toString().length()==0 & secH9a5b.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9a5b.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9a5b.getText().toString().length()==0 ? "1" : txtH9a5b.getText().toString()) < 1 || Integer.valueOf(txtH9a5b.getText().toString().length()==0 ? "9999999" : txtH9a5b.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9a5b.requestFocus();
                return;
            }
            else if(txtH9a5c.getText().toString().length()==0 & secH9a5c.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9a5c.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9a5c.getText().toString().length()==0 ? "1" : txtH9a5c.getText().toString()) < 1 || Integer.valueOf(txtH9a5c.getText().toString().length()==0 ? "9999999" : txtH9a5c.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9a5c.requestFocus();
                return;
            }

            else if(!rdoH9b1a1.isChecked() & !rdoH9b1a2.isChecked() & secH9b1a.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (গত ১ বছর   এ এর মধ্যে কোনো তৈরি পোশাক ক্রয় করেছেন).");
                rdoH9b1a1.requestFocus();
                return;
            }
            else if(txtH9b1b.getText().toString().length()==0 & secH9b1b.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b1b.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b1b.getText().toString().length()==0 ? "1" : txtH9b1b.getText().toString()) < 1 || Integer.valueOf(txtH9b1b.getText().toString().length()==0 ? "9999999" : txtH9b1b.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b1b.requestFocus();
                return;
            }
            else if(txtH9b1c.getText().toString().length()==0 & secH9b1c.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b1c.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b1c.getText().toString().length()==0 ? "1" : txtH9b1c.getText().toString()) < 1 || Integer.valueOf(txtH9b1c.getText().toString().length()==0 ? "9999999" : txtH9b1c.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b1c.requestFocus();
                return;
            }

            else if(!rdoH9b2a1.isChecked() & !rdoH9b2a2.isChecked() & secH9b2a.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (আপনি গত 1 year এর মধ্যে খানার কোনো ভাড়া / চার্জ দিয়েছেন).");
                rdoH9b2a1.requestFocus();
                return;
            }
            else if(txtH9b2b.getText().toString().length()==0 & secH9b2b.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b2b.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b2b.getText().toString().length()==0 ? "1" : txtH9b2b.getText().toString()) < 1 || Integer.valueOf(txtH9b2b.getText().toString().length()==0 ? "9999999" : txtH9b2b.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b2b.requestFocus();
                return;
            }
            else if(txtH9b2c.getText().toString().length()==0 & secH9b2c.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b2c.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b2c.getText().toString().length()==0 ? "1" : txtH9b2c.getText().toString()) < 1 || Integer.valueOf(txtH9b2c.getText().toString().length()==0 ? "9999999" : txtH9b2c.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b2c.requestFocus();
                return;
            }

            else if(!rdoH9b3a1.isChecked() & !rdoH9b3a2.isChecked() & secH9b3a.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (আপনি গত 1 year ধরে চিকিৎসা সংক্রান্ত কোন খরচ করেছেন).");
                rdoH9b3a1.requestFocus();
                return;
            }
            else if(txtH9b3b.getText().toString().length()==0 & secH9b3b.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b3b.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b3b.getText().toString().length()==0 ? "1" : txtH9b3b.getText().toString()) < 1 || Integer.valueOf(txtH9b3b.getText().toString().length()==0 ? "9999999" : txtH9b3b.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b3b.requestFocus();
                return;
            }
            else if(txtH9b3c.getText().toString().length()==0 & secH9b3c.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b3c.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b3c.getText().toString().length()==0 ? "1" : txtH9b3c.getText().toString()) < 1 || Integer.valueOf(txtH9b3c.getText().toString().length()==0 ? "9999999" : txtH9b3c.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b3c.requestFocus();
                return;
            }

            else if(!rdoH9b4a1.isChecked() & !rdoH9b4a2.isChecked() & secH9b4a.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (আপনি গত 1 year এর মধ্যে লেখাপড়ার জন্য কোন খরচ করেছেন).");
                rdoH9b4a1.requestFocus();
                return;
            }
            else if(txtH9b4b.getText().toString().length()==0 & secH9b4b.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b4b.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b4b.getText().toString().length()==0 ? "1" : txtH9b4b.getText().toString()) < 1 || Integer.valueOf(txtH9b4b.getText().toString().length()==0 ? "9999999" : txtH9b4b.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b4b.requestFocus();
                return;
            }
            else if(txtH9b4c.getText().toString().length()==0 & secH9b4c.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b4c.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b4c.getText().toString().length()==0 ? "1" : txtH9b4c.getText().toString()) < 1 || Integer.valueOf(txtH9b4c.getText().toString().length()==0 ? "9999999" : txtH9b4c.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b4c.requestFocus();
                return;
            }

            else if(!rdoH9b5a1.isChecked() & !rdoH9b5a2.isChecked() & secH9b5a.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (আপনি গত 1 year এর মধ্যে কোনো পরিবাবের অন্য কোন সদস্য অথবা অন্য কাউকে টাকা পাঠিয়েছেন অথবা কোন অনুষ্ঠানের জন্য খরচ করেছেন  ).");
                rdoH9b5a1.requestFocus();
                return;
            }
            else if(txtH9b5b.getText().toString().length()==0 & secH9b5b.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b5b.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b5b.getText().toString().length()==0 ? "1" : txtH9b5b.getText().toString()) < 1 || Integer.valueOf(txtH9b5b.getText().toString().length()==0 ? "9999999" : txtH9b5b.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b5b.requestFocus();
                return;
            }
            else if(txtH9b5c.getText().toString().length()==0 & secH9b5c.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b5c.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b5c.getText().toString().length()==0 ? "1" : txtH9b5c.getText().toString()) < 1 || Integer.valueOf(txtH9b5c.getText().toString().length()==0 ? "9999999" : txtH9b5c.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b5c.requestFocus();
                return;
            }

            else if(!rdoH9b6a1.isChecked() & !rdoH9b6a2.isChecked() & secH9b6a.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (আপনি গত 1 year এর মধ্যে কোনো বিনোদনমূলক কার্যক্রমের জন্য খরচ করেছেন).");
                rdoH9b6a1.requestFocus();
                return;
            }
            else if(txtH9b6b.getText().toString().length()==0 & secH9b6b.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b6b.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b6b.getText().toString().length()==0 ? "1" : txtH9b6b.getText().toString()) < 1 || Integer.valueOf(txtH9b6b.getText().toString().length()==0 ? "9999999" : txtH9b6b.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b6b.requestFocus();
                return;
            }
            else if(txtH9b6c.getText().toString().length()==0 & secH9b6c.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b6c.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b6c.getText().toString().length()==0 ? "1" : txtH9b6c.getText().toString()) < 1 || Integer.valueOf(txtH9b6c.getText().toString().length()==0 ? "9999999" : txtH9b6c.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b6c.requestFocus();
                return;
            }

            else if(!rdoH9b7a1.isChecked() & !rdoH9b7a2.isChecked() & secH9b7a.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (আপনি গত 1 year এর মধ্যে কোনো করচার্জ দিয়েছেন?  ).");
                rdoH9b7a1.requestFocus();
                return;
            }
            else if(txtH9b7b.getText().toString().length()==0 & secH9b7b.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b7b.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b7b.getText().toString().length()==0 ? "1" : txtH9b7b.getText().toString()) < 1 || Integer.valueOf(txtH9b7b.getText().toString().length()==0 ? "9999999" : txtH9b7b.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b7b.requestFocus();
                return;
            }
            else if(txtH9b7c.getText().toString().length()==0 & secH9b7c.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b7c.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b7c.getText().toString().length()==0 ? "1" : txtH9b7c.getText().toString()) < 1 || Integer.valueOf(txtH9b7c.getText().toString().length()==0 ? "9999999" : txtH9b7c.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b7c.requestFocus();
                return;
            }

            else if(!rdoH9b8a1.isChecked() & !rdoH9b8a2.isChecked() & secH9b8a.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (আপনি গত 1 year এর মধ্যে কোনো রান্নার/রান্নাঘরের সরঞ্জাম ক্রয় করেছেন).");
                rdoH9b8a1.requestFocus();
                return;
            }
            else if(txtH9b8b.getText().toString().length()==0 & secH9b8b.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b8b.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b8b.getText().toString().length()==0 ? "1" : txtH9b8b.getText().toString()) < 1 || Integer.valueOf(txtH9b8b.getText().toString().length()==0 ? "9999999" : txtH9b8b.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b8b.requestFocus();
                return;
            }
            else if(txtH9b8c.getText().toString().length()==0 & secH9b8c.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b8c.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b8c.getText().toString().length()==0 ? "1" : txtH9b8c.getText().toString()) < 1 || Integer.valueOf(txtH9b8c.getText().toString().length()==0 ? "9999999" : txtH9b8c.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b8c.requestFocus();
                return;
            }

            else if(!rdoH9b9a1.isChecked() & !rdoH9b9a2.isChecked() & secH9b9a.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (আপনি গত 1 year এর মধ্যে কোনো ব্যক্তিগত সৌখিন জিনিসপত্র ক্রয় করেছেন).");
                rdoH9b9a1.requestFocus();
                return;
            }
            else if(txtH9b9b.getText().toString().length()==0 & secH9b9b.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b9b.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b9b.getText().toString().length()==0 ? "1" : txtH9b9b.getText().toString()) < 1 || Integer.valueOf(txtH9b9b.getText().toString().length()==0 ? "9999999" : txtH9b9b.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b9b.requestFocus();
                return;
            }
            else if(txtH9b9c.getText().toString().length()==0 & secH9b9c.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b9c.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b9c.getText().toString().length()==0 ? "1" : txtH9b9c.getText().toString()) < 1 || Integer.valueOf(txtH9b9c.getText().toString().length()==0 ? "9999999" : txtH9b9c.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b9c.requestFocus();
                return;
            }

            else if(!rdoH9b10a1.isChecked() & !rdoH9b10a2.isChecked() & secH9b10a.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (আপনি কোন বৈদ্যুতিক সামগ্রী / যন্ত্র গত 1 year এর মধ্যে ক্রয় করেছেন কি  ).");
                rdoH9b10a1.requestFocus();
                return;
            }
            else if(txtH9b10b.getText().toString().length()==0 & secH9b10b.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b10b.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b10b.getText().toString().length()==0 ? "1" : txtH9b10b.getText().toString()) < 1 || Integer.valueOf(txtH9b10b.getText().toString().length()==0 ? "9999999" : txtH9b10b.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b10b.requestFocus();
                return;
            }
            else if(txtH9b10c.getText().toString().length()==0 & secH9b10c.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b10c.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b10c.getText().toString().length()==0 ? "1" : txtH9b10c.getText().toString()) < 1 || Integer.valueOf(txtH9b10c.getText().toString().length()==0 ? "9999999" : txtH9b10c.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b10c.requestFocus();
                return;
            }

            else if(!rdoH9b11a1.isChecked() & !rdoH9b11a2.isChecked() & secH9b11a.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (আপনি গত 1 year এর মধ্যে কোনো বীমা জন্য খরচ করেছেন কি?  ).");
                rdoH9b11a1.requestFocus();
                return;
            }
            else if(txtH9b11b.getText().toString().length()==0 & secH9b11b.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b11b.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b11b.getText().toString().length()==0 ? "1" : txtH9b11b.getText().toString()) < 1 || Integer.valueOf(txtH9b11b.getText().toString().length()==0 ? "9999999" : txtH9b11b.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b11b.requestFocus();
                return;
            }
            else if(txtH9b11c.getText().toString().length()==0 & secH9b11c.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b11c.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b11c.getText().toString().length()==0 ? "1" : txtH9b11c.getText().toString()) < 1 || Integer.valueOf(txtH9b11c.getText().toString().length()==0 ? "9999999" : txtH9b11c.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b11c.requestFocus();
                return;
            }

            else if(!rdoH9b121.isChecked() & !rdoH9b122.isChecked() & secH9b12.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (আপনি 1 year এর মধ্যে চাষা বাদ অথবা মৎস্য আরোহনের জন্য কোন সরঞ্জাম ক্রয় করেছেন? ).");
                rdoH9b121.requestFocus();
                return;
            }

            else if(!rdoH9b12a11.isChecked() & !rdoH9b12a12.isChecked() & secH9b12a1.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from ( কোন বীজ  ক্রয় করেছেন).");
                rdoH9b12a11.requestFocus();
                return;
            }
            else if(txtH9b12a2.getText().toString().length()==0 & secH9b12a2.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b12a2.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12a2.getText().toString().length()==0 ? "1" : txtH9b12a2.getText().toString()) < 1 || Integer.valueOf(txtH9b12a2.getText().toString().length()==0 ? "9999999" : txtH9b12a2.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b12a2.requestFocus();
                return;
            }
            else if(txtH9b12a3.getText().toString().length()==0 & secH9b12a3.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b12a3.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12a3.getText().toString().length()==0 ? "1" : txtH9b12a3.getText().toString()) < 1 || Integer.valueOf(txtH9b12a3.getText().toString().length()==0 ? "9999999" : txtH9b12a3.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b12a3.requestFocus();
                return;
            }

            else if(!rdoH9b12b11.isChecked() & !rdoH9b12b12.isChecked() & secH9b12b1.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (চারা  ক্রয় করেছেন ).");
                rdoH9b12b11.requestFocus();
                return;
            }
            else if(txtH9b12b2.getText().toString().length()==0 & secH9b12b2.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b12b2.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12b2.getText().toString().length()==0 ? "1" : txtH9b12b2.getText().toString()) < 1 || Integer.valueOf(txtH9b12b2.getText().toString().length()==0 ? "9999999" : txtH9b12b2.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b12b2.requestFocus();
                return;
            }
            else if(txtH9b12b3.getText().toString().length()==0 & secH9b12b3.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b12b3.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12b3.getText().toString().length()==0 ? "1" : txtH9b12b3.getText().toString()) < 1 || Integer.valueOf(txtH9b12b3.getText().toString().length()==0 ? "9999999" : txtH9b12b3.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b12b3.requestFocus();
                return;
            }

            else if(!rdoH9b12c11.isChecked() & !rdoH9b12c12.isChecked() & secH9b12c1.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (কচি চারা গাছ ক্রয়  করেছেন ).");
                rdoH9b12c11.requestFocus();
                return;
            }
            else if(txtH9b12c2.getText().toString().length()==0 & secH9b12c2.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b12c2.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12c2.getText().toString().length()==0 ? "1" : txtH9b12c2.getText().toString()) < 1 || Integer.valueOf(txtH9b12c2.getText().toString().length()==0 ? "9999999" : txtH9b12c2.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b12c2.requestFocus();
                return;
            }
            else if(txtH9b12c3.getText().toString().length()==0 & secH9b12c3.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b12c3.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12c3.getText().toString().length()==0 ? "1" : txtH9b12c3.getText().toString()) < 1 || Integer.valueOf(txtH9b12c3.getText().toString().length()==0 ? "9999999" : txtH9b12c3.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b12c3.requestFocus();
                return;
            }

            else if(!rdoH9b12d11.isChecked() & !rdoH9b12d12.isChecked() & secH9b12d1.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (মাছের পোনা  ক্রয় করেছেন).");
                rdoH9b12d11.requestFocus();
                return;
            }
            else if(txtH9b12d2.getText().toString().length()==0 & secH9b12d2.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b12d2.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12d2.getText().toString().length()==0 ? "1" : txtH9b12d2.getText().toString()) < 1 || Integer.valueOf(txtH9b12d2.getText().toString().length()==0 ? "9999999" : txtH9b12d2.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b12d2.requestFocus();
                return;
            }
            else if(txtH9b12d3.getText().toString().length()==0 & secH9b12d3.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b12d3.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12d3.getText().toString().length()==0 ? "1" : txtH9b12d3.getText().toString()) < 1 || Integer.valueOf(txtH9b12d3.getText().toString().length()==0 ? "9999999" : txtH9b12d3.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b12d3.requestFocus();
                return;
            }

            else if(!rdoH9b12e11.isChecked() & !rdoH9b12e12.isChecked() & secH9b12e1.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (সার ক্রয় করেছেন).");
                rdoH9b12e11.requestFocus();
                return;
            }
            else if(txtH9b12e2.getText().toString().length()==0 & secH9b12e2.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b12e2.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12e2.getText().toString().length()==0 ? "1" : txtH9b12e2.getText().toString()) < 1 || Integer.valueOf(txtH9b12e2.getText().toString().length()==0 ? "9999999" : txtH9b12e2.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b12e2.requestFocus();
                return;
            }
            else if(txtH9b12e3.getText().toString().length()==0 & secH9b12e3.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b12e3.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12e3.getText().toString().length()==0 ? "1" : txtH9b12e3.getText().toString()) < 1 || Integer.valueOf(txtH9b12e3.getText().toString().length()==0 ? "9999999" : txtH9b12e3.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b12e3.requestFocus();
                return;
            }

            else if(!rdoH9b12f11.isChecked() & !rdoH9b12f12.isChecked() & secH9b12f1.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (চুন ক্রয় করেছেন).");
                rdoH9b12f11.requestFocus();
                return;
            }
            else if(txtH9b12f2.getText().toString().length()==0 & secH9b12f2.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b12f2.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12f2.getText().toString().length()==0 ? "1" : txtH9b12f2.getText().toString()) < 1 || Integer.valueOf(txtH9b12f2.getText().toString().length()==0 ? "9999999" : txtH9b12f2.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b12f2.requestFocus();
                return;
            }
            else if(txtH9b12f3.getText().toString().length()==0 & secH9b12f3.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b12f3.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12f3.getText().toString().length()==0 ? "1" : txtH9b12f3.getText().toString()) < 1 || Integer.valueOf(txtH9b12f3.getText().toString().length()==0 ? "9999999" : txtH9b12f3.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b12f3.requestFocus();
                return;
            }

            else if(!rdoH9b12g11.isChecked() & !rdoH9b12g12.isChecked() & secH9b12g1.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (মাছের খাবার ক্রয় করেছেন).");
                rdoH9b12g11.requestFocus();
                return;
            }
            else if(txtH9b12g2.getText().toString().length()==0 & secH9b12g2.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b12g2.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12g2.getText().toString().length()==0 ? "1" : txtH9b12g2.getText().toString()) < 1 || Integer.valueOf(txtH9b12g2.getText().toString().length()==0 ? "9999999" : txtH9b12g2.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b12g2.requestFocus();
                return;
            }
            else if(txtH9b12g3.getText().toString().length()==0 & secH9b12g3.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b12g3.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12g3.getText().toString().length()==0 ? "1" : txtH9b12g3.getText().toString()) < 1 || Integer.valueOf(txtH9b12g3.getText().toString().length()==0 ? "9999999" : txtH9b12g3.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b12g3.requestFocus();
                return;
            }

            else if(!rdoH9b12h11.isChecked() & !rdoH9b12h12.isChecked() & secH9b12h1.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (হাস-মুরগির খাবার ক্রয় করেছেন).");
                rdoH9b12h11.requestFocus();
                return;
            }
            else if(txtH9b12h2.getText().toString().length()==0 & secH9b12h2.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b12h2.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12h2.getText().toString().length()==0 ? "1" : txtH9b12h2.getText().toString()) < 1 || Integer.valueOf(txtH9b12h2.getText().toString().length()==0 ? "9999999" : txtH9b12h2.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b12h2.requestFocus();
                return;
            }
            else if(txtH9b12h3.getText().toString().length()==0 & secH9b12h3.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b12h3.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12h3.getText().toString().length()==0 ? "1" : txtH9b12h3.getText().toString()) < 1 || Integer.valueOf(txtH9b12h3.getText().toString().length()==0 ? "9999999" : txtH9b12h3.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b12h3.requestFocus();
                return;
            }

            else if(!rdoH9b12i11.isChecked() & !rdoH9b12i12.isChecked() & secH9b12i1.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (হাস/মুরগির বাচ্চা ক্রয় করেছেন).");
                rdoH9b12i11.requestFocus();
                return;
            }
            else if(txtH9b12i2.getText().toString().length()==0 & secH9b12i2.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b12i2.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12i2.getText().toString().length()==0 ? "1" : txtH9b12i2.getText().toString()) < 1 || Integer.valueOf(txtH9b12i2.getText().toString().length()==0 ? "9999999" : txtH9b12i2.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b12i2.requestFocus();
                return;
            }
            else if(txtH9b12i3.getText().toString().length()==0 & secH9b12i3.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b12i3.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12i3.getText().toString().length()==0 ? "1" : txtH9b12i3.getText().toString()) < 1 || Integer.valueOf(txtH9b12i3.getText().toString().length()==0 ? "9999999" : txtH9b12i3.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b12i3.requestFocus();
                return;
            }

            else if(!rdoH9b12j11.isChecked() & !rdoH9b12j12.isChecked() & secH9b12j1.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (টিকা ক্রয় করেছেন).");
                rdoH9b12j11.requestFocus();
                return;
            }
            else if(txtH9b12j2.getText().toString().length()==0 & secH9b12j2.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b12j2.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12j2.getText().toString().length()==0 ? "1" : txtH9b12j2.getText().toString()) < 1 || Integer.valueOf(txtH9b12j2.getText().toString().length()==0 ? "9999999" : txtH9b12j2.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b12j2.requestFocus();
                return;
            }
            else if(txtH9b12j3.getText().toString().length()==0 & secH9b12j3.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b12j3.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12j3.getText().toString().length()==0 ? "1" : txtH9b12j3.getText().toString()) < 1 || Integer.valueOf(txtH9b12j3.getText().toString().length()==0 ? "9999999" : txtH9b12j3.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b12j3.requestFocus();
                return;
            }

            else if(!rdoH9b12k11.isChecked() & !rdoH9b12k12.isChecked() & secH9b12k1.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (কোদাল / লাঙ্গল / নিড়ানি ক্রয় করেছেন).");
                rdoH9b12k11.requestFocus();
                return;
            }
            else if(txtH9b12k2.getText().toString().length()==0 & secH9b12k2.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b12k2.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12k2.getText().toString().length()==0 ? "1" : txtH9b12k2.getText().toString()) < 1 || Integer.valueOf(txtH9b12k2.getText().toString().length()==0 ? "9999999" : txtH9b12k2.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b12k2.requestFocus();
                return;
            }
            else if(txtH9b12k3.getText().toString().length()==0 & secH9b12k3.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b12k3.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12k3.getText().toString().length()==0 ? "1" : txtH9b12k3.getText().toString()) < 1 || Integer.valueOf(txtH9b12k3.getText().toString().length()==0 ? "9999999" : txtH9b12k3.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b12k3.requestFocus();
                return;
            }

            else if(!rdoH9b12l11.isChecked() & !rdoH9b12l12.isChecked() & secH9b12l1.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (মাছ ধরার জাল/ ছিপ ক্রয় করেছেন).");
                rdoH9b12l11.requestFocus();
                return;
            }
            else if(txtH9b12l2.getText().toString().length()==0 & secH9b12l2.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b12l2.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12l2.getText().toString().length()==0 ? "1" : txtH9b12l2.getText().toString()) < 1 || Integer.valueOf(txtH9b12l2.getText().toString().length()==0 ? "9999999" : txtH9b12l2.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b12l2.requestFocus();
                return;
            }
            else if(txtH9b12l3.getText().toString().length()==0 & secH9b12l3.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b12l3.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12l3.getText().toString().length()==0 ? "1" : txtH9b12l3.getText().toString()) < 1 || Integer.valueOf(txtH9b12l3.getText().toString().length()==0 ? "9999999" : txtH9b12l3.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b12l3.requestFocus();
                return;
            }

            else if(!rdoH9b12m11.isChecked() & !rdoH9b12m12.isChecked() & secH9b12m1.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (বেড়া দেয়ার সামগ্রী ক্রয় করেছেন).");
                rdoH9b12m11.requestFocus();
                return;
            }
            else if(txtH9b12m2.getText().toString().length()==0 & secH9b12m2.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b12m2.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12m2.getText().toString().length()==0 ? "1" : txtH9b12m2.getText().toString()) < 1 || Integer.valueOf(txtH9b12m2.getText().toString().length()==0 ? "9999999" : txtH9b12m2.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b12m2.requestFocus();
                return;
            }
            else if(txtH9b12m3.getText().toString().length()==0 & secH9b12m3.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b12m3.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b12m3.getText().toString().length()==0 ? "1" : txtH9b12m3.getText().toString()) < 1 || Integer.valueOf(txtH9b12m3.getText().toString().length()==0 ? "9999999" : txtH9b12m3.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b12m3.requestFocus();
                return;
            }

            else if(!rdoH9b13a1.isChecked() & !rdoH9b13a2.isChecked() & secH9b13a.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (আপনি 1 year এর মধ্যে কোনো বিড়ি/জর্ডা/সিগারেট ক্রয় করেছেন).");
                rdoH9b13a1.requestFocus();
                return;
            }
            else if(txtH9b13b.getText().toString().length()==0 & secH9b13b.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b13b.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b13b.getText().toString().length()==0 ? "1" : txtH9b13b.getText().toString()) < 1 || Integer.valueOf(txtH9b13b.getText().toString().length()==0 ? "9999999" : txtH9b13b.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b13b.requestFocus();
                return;
            }
            else if(txtH9b13c.getText().toString().length()==0 & secH9b13c.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b13c.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b13c.getText().toString().length()==0 ? "1" : txtH9b13c.getText().toString()) < 1 || Integer.valueOf(txtH9b13c.getText().toString().length()==0 ? "9999999" : txtH9b13c.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b13c.requestFocus();
                return;
            }

            else if(!rdoH9b14a1.isChecked() & !rdoH9b14a2.isChecked() & secH9b14a.isShown())
            {
                Connection.MessageBox(Cost3.this, "Select anyone options from (অনান্য).");
                rdoH9b14a1.requestFocus();
                return;
            }
            else if(txtH9b14x1.getText().toString().length()==0 & secH9b14x1.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: অনান্য উল্লেখ কর.");
                txtH9b14x1.requestFocus();
                return;
            }
            else if(txtH9b14b.getText().toString().length()==0 & secH9b14b.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: নগদ খরচ.");
                txtH9b14b.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b14b.getText().toString().length()==0 ? "1" : txtH9b14b.getText().toString()) < 1 || Integer.valueOf(txtH9b14b.getText().toString().length()==0 ? "9999999" : txtH9b14b.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(নগদ খরচ).");
                txtH9b14b.requestFocus();
                return;
            }
            else if(txtH9b14c.getText().toString().length()==0 & secH9b14c.isShown())
            {
                Connection.MessageBox(Cost3.this, "Required field: যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত.");
                txtH9b14c.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtH9b14c.getText().toString().length()==0 ? "1" : txtH9b14c.getText().toString()) < 1 || Integer.valueOf(txtH9b14c.getText().toString().length()==0 ? "9999999" : txtH9b14c.getText().toString()) > 9999999)
            {
                Connection.MessageBox(Cost3.this, "Value should be between 1 and 9999999(যদি নগদ খরচ না করে অন্য কোন ভাবে পেয়ে থাকেন মূল্য কত).");
                txtH9b14c.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            Cost3_DataModel objSave = new Cost3_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setMSlNo(Connection.SelectedSpinnerValue(spnMSlNo.getSelectedItem().toString(), "-"));
            String[] d_rdogrpH8111a = new String[] {"1","0"};
            objSave.setH8111a("");
            for (int i = 0; i < rdogrpH8111a.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH8111a.getChildAt(i);
                if (rb.isChecked()) objSave.setH8111a(d_rdogrpH8111a[i]);
            }

            objSave.setH8111b(txtH8111b.getText().toString());
            String[] d_rdogrpH8111c = new String[] {"1","2","3"};
            objSave.setH8111c("");
            for (int i = 0; i < rdogrpH8111c.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH8111c.getChildAt(i);
                if (rb.isChecked()) objSave.setH8111c(d_rdogrpH8111c[i]);
            }

            objSave.setH8111d(txtH8111d.getText().toString());
            String[] d_rdogrpH121a = new String[] {"1","0"};
            objSave.setH121a("");
            for (int i = 0; i < rdogrpH121a.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH121a.getChildAt(i);
                if (rb.isChecked()) objSave.setH121a(d_rdogrpH121a[i]);
            }

            objSave.setH8121x1(txtH8121x1.getText().toString());
            objSave.setH8121b(txtH8121b.getText().toString());
            String[] d_rdogrpH8121c = new String[] {"1","2","3"};
            objSave.setH8121c("");
            for (int i = 0; i < rdogrpH8121c.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH8121c.getChildAt(i);
                if (rb.isChecked()) objSave.setH8121c(d_rdogrpH8121c[i]);
            }

            objSave.setH8121d(txtH8121d.getText().toString());
            String[] d_rdogrpH8112a = new String[] {"1","0"};
            objSave.setH8112a("");
            for (int i = 0; i < rdogrpH8112a.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH8112a.getChildAt(i);
                if (rb.isChecked()) objSave.setH8112a(d_rdogrpH8112a[i]);
            }

            objSave.setH8112x1(txtH8112x1.getText().toString());
            objSave.setH8112b(txtH8112b.getText().toString());
            String[] d_rdogrpH8112c = new String[] {"1","2","3"};
            objSave.setH8112c("");
            for (int i = 0; i < rdogrpH8112c.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH8112c.getChildAt(i);
                if (rb.isChecked()) objSave.setH8112c(d_rdogrpH8112c[i]);
            }

            objSave.setH8112d(txtH8112d.getText().toString());
            String[] d_rdogrpH9a1a = new String[] {"1","0"};
            objSave.setH9a1a("");
            for (int i = 0; i < rdogrpH9a1a.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9a1a.getChildAt(i);
                if (rb.isChecked()) objSave.setH9a1a(d_rdogrpH9a1a[i]);
            }

            objSave.setH9a1b(txtH9a1b.getText().toString());
            objSave.setH9a1c(txtH9a1c.getText().toString());
            String[] d_rdogrpH9a2a = new String[] {"1","0"};
            objSave.setH9a2a("");
            for (int i = 0; i < rdogrpH9a2a.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9a2a.getChildAt(i);
                if (rb.isChecked()) objSave.setH9a2a(d_rdogrpH9a2a[i]);
            }

            objSave.setH9a2b(txtH9a2b.getText().toString());
            objSave.setH9a2c(txtH9a2c.getText().toString());
            String[] d_rdogrpH9a3a = new String[] {"1","0"};
            objSave.setH9a3a("");
            for (int i = 0; i < rdogrpH9a3a.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9a3a.getChildAt(i);
                if (rb.isChecked()) objSave.setH9a3a(d_rdogrpH9a3a[i]);
            }

            objSave.setH9a3b(txtH9a3b.getText().toString());
            objSave.setH9a3c(txtH9a3c.getText().toString());
            String[] d_rdogrpH9a4a = new String[] {"1","0"};
            objSave.setH9a4a("");
            for (int i = 0; i < rdogrpH9a4a.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9a4a.getChildAt(i);
                if (rb.isChecked()) objSave.setH9a4a(d_rdogrpH9a4a[i]);
            }

            objSave.setH9a4b(txtH9a4b.getText().toString());
            objSave.setH9a4c(txtH9a4c.getText().toString());
            String[] d_rdogrpH9a5a = new String[] {"1","0"};
            objSave.setH9a5a("");
            for (int i = 0; i < rdogrpH9a5a.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9a5a.getChildAt(i);
                if (rb.isChecked()) objSave.setH9a5a(d_rdogrpH9a5a[i]);
            }

            objSave.setH9a5b(txtH9a5b.getText().toString());
            objSave.setH9a5c(txtH9a5c.getText().toString());
            String[] d_rdogrpH9b1a = new String[] {"1","0"};
            objSave.setH9b1a("");
            for (int i = 0; i < rdogrpH9b1a.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b1a.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b1a(d_rdogrpH9b1a[i]);
            }

            objSave.setH9b1b(txtH9b1b.getText().toString());
            objSave.setH9b1c(txtH9b1c.getText().toString());
            String[] d_rdogrpH9b2a = new String[] {"1","0"};
            objSave.setH9b2a("");
            for (int i = 0; i < rdogrpH9b2a.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b2a.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b2a(d_rdogrpH9b2a[i]);
            }

            objSave.setH9b2b(txtH9b2b.getText().toString());
            objSave.setH9b2c(txtH9b2c.getText().toString());
            String[] d_rdogrpH9b3a = new String[] {"1","0"};
            objSave.setH9b3a("");
            for (int i = 0; i < rdogrpH9b3a.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b3a.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b3a(d_rdogrpH9b3a[i]);
            }

            objSave.setH9b3b(txtH9b3b.getText().toString());
            objSave.setH9b3c(txtH9b3c.getText().toString());
            String[] d_rdogrpH9b4a = new String[] {"1","0"};
            objSave.setH9b4a("");
            for (int i = 0; i < rdogrpH9b4a.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b4a.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b4a(d_rdogrpH9b4a[i]);
            }

            objSave.setH9b4b(txtH9b4b.getText().toString());
            objSave.setH9b4c(txtH9b4c.getText().toString());
            String[] d_rdogrpH9b5a = new String[] {"1","0"};
            objSave.setH9b5a("");
            for (int i = 0; i < rdogrpH9b5a.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b5a.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b5a(d_rdogrpH9b5a[i]);
            }

            objSave.setH9b5b(txtH9b5b.getText().toString());
            objSave.setH9b5c(txtH9b5c.getText().toString());
            String[] d_rdogrpH9b6a = new String[] {"1","0"};
            objSave.setH9b6a("");
            for (int i = 0; i < rdogrpH9b6a.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b6a.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b6a(d_rdogrpH9b6a[i]);
            }

            objSave.setH9b6b(txtH9b6b.getText().toString());
            objSave.setH9b6c(txtH9b6c.getText().toString());
            String[] d_rdogrpH9b7a = new String[] {"1","0"};
            objSave.setH9b7a("");
            for (int i = 0; i < rdogrpH9b7a.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b7a.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b7a(d_rdogrpH9b7a[i]);
            }

            objSave.setH9b7b(txtH9b7b.getText().toString());
            objSave.setH9b7c(txtH9b7c.getText().toString());
            String[] d_rdogrpH9b8a = new String[] {"1","0"};
            objSave.setH9b8a("");
            for (int i = 0; i < rdogrpH9b8a.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b8a.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b8a(d_rdogrpH9b8a[i]);
            }

            objSave.setH9b8b(txtH9b8b.getText().toString());
            objSave.setH9b8c(txtH9b8c.getText().toString());
            String[] d_rdogrpH9b9a = new String[] {"1","0"};
            objSave.setH9b9a("");
            for (int i = 0; i < rdogrpH9b9a.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b9a.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b9a(d_rdogrpH9b9a[i]);
            }

            objSave.setH9b9b(txtH9b9b.getText().toString());
            objSave.setH9b9c(txtH9b9c.getText().toString());
            String[] d_rdogrpH9b10a = new String[] {"1","0"};
            objSave.setH9b10a("");
            for (int i = 0; i < rdogrpH9b10a.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b10a.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b10a(d_rdogrpH9b10a[i]);
            }

            objSave.setH9b10b(txtH9b10b.getText().toString());
            objSave.setH9b10c(txtH9b10c.getText().toString());
            String[] d_rdogrpH9b11a = new String[] {"1","0"};
            objSave.setH9b11a("");
            for (int i = 0; i < rdogrpH9b11a.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b11a.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b11a(d_rdogrpH9b11a[i]);
            }

            objSave.setH9b11b(txtH9b11b.getText().toString());
            objSave.setH9b11c(txtH9b11c.getText().toString());
            String[] d_rdogrpH9b12 = new String[] {"1","0"};
            objSave.setH9b12("");
            for (int i = 0; i < rdogrpH9b12.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b12.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b12(d_rdogrpH9b12[i]);
            }

            String[] d_rdogrpH9b12a1 = new String[] {"1","0"};
            objSave.setH9b12a1("");
            for (int i = 0; i < rdogrpH9b12a1.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b12a1.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b12a1(d_rdogrpH9b12a1[i]);
            }

            objSave.setH9b12a2(txtH9b12a2.getText().toString());
            objSave.setH9b12a3(txtH9b12a3.getText().toString());
            String[] d_rdogrpH9b12b1 = new String[] {"1","0"};
            objSave.setH9b12b1("");
            for (int i = 0; i < rdogrpH9b12b1.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b12b1.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b12b1(d_rdogrpH9b12b1[i]);
            }

            objSave.setH9b12b2(txtH9b12b2.getText().toString());
            objSave.setH9b12b3(txtH9b12b3.getText().toString());
            String[] d_rdogrpH9b12c1 = new String[] {"1","0"};
            objSave.setH9b12c1("");
            for (int i = 0; i < rdogrpH9b12c1.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b12c1.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b12c1(d_rdogrpH9b12c1[i]);
            }

            objSave.setH9b12c2(txtH9b12c2.getText().toString());
            objSave.setH9b12c3(txtH9b12c3.getText().toString());
            String[] d_rdogrpH9b12d1 = new String[] {"1","0"};
            objSave.setH9b12d1("");
            for (int i = 0; i < rdogrpH9b12d1.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b12d1.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b12d1(d_rdogrpH9b12d1[i]);
            }

            objSave.setH9b12d2(txtH9b12d2.getText().toString());
            objSave.setH9b12d3(txtH9b12d3.getText().toString());
            String[] d_rdogrpH9b12e1 = new String[] {"1","0"};
            objSave.setH9b12e1("");
            for (int i = 0; i < rdogrpH9b12e1.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b12e1.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b12e1(d_rdogrpH9b12e1[i]);
            }

            objSave.setH9b12e2(txtH9b12e2.getText().toString());
            objSave.setH9b12e3(txtH9b12e3.getText().toString());
            String[] d_rdogrpH9b12f1 = new String[] {"1","0"};
            objSave.setH9b12f1("");
            for (int i = 0; i < rdogrpH9b12f1.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b12f1.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b12f1(d_rdogrpH9b12f1[i]);
            }

            objSave.setH9b12f2(txtH9b12f2.getText().toString());
            objSave.setH9b12f3(txtH9b12f3.getText().toString());
            String[] d_rdogrpH9b12g1 = new String[] {"1","0"};
            objSave.setH9b12g1("");
            for (int i = 0; i < rdogrpH9b12g1.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b12g1.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b12g1(d_rdogrpH9b12g1[i]);
            }

            objSave.setH9b12g2(txtH9b12g2.getText().toString());
            objSave.setH9b12g3(txtH9b12g3.getText().toString());
            String[] d_rdogrpH9b12h1 = new String[] {"1","0"};
            objSave.setH9b12h1("");
            for (int i = 0; i < rdogrpH9b12h1.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b12h1.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b12h1(d_rdogrpH9b12h1[i]);
            }

            objSave.setH9b12h2(txtH9b12h2.getText().toString());
            objSave.setH9b12h3(txtH9b12h3.getText().toString());
            String[] d_rdogrpH9b12i1 = new String[] {"1","0"};
            objSave.setH9b12i1("");
            for (int i = 0; i < rdogrpH9b12i1.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b12i1.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b12i1(d_rdogrpH9b12i1[i]);
            }

            objSave.setH9b12i2(txtH9b12i2.getText().toString());
            objSave.setH9b12i3(txtH9b12i3.getText().toString());
            String[] d_rdogrpH9b12j1 = new String[] {"1","0"};
            objSave.setH9b12j1("");
            for (int i = 0; i < rdogrpH9b12j1.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b12j1.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b12j1(d_rdogrpH9b12j1[i]);
            }

            objSave.setH9b12j2(txtH9b12j2.getText().toString());
            objSave.setH9b12j3(txtH9b12j3.getText().toString());
            String[] d_rdogrpH9b12k1 = new String[] {"1","0"};
            objSave.setH9b12k1("");
            for (int i = 0; i < rdogrpH9b12k1.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b12k1.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b12k1(d_rdogrpH9b12k1[i]);
            }

            objSave.setH9b12k2(txtH9b12k2.getText().toString());
            objSave.setH9b12k3(txtH9b12k3.getText().toString());
            String[] d_rdogrpH9b12l1 = new String[] {"1","0"};
            objSave.setH9b12l1("");
            for (int i = 0; i < rdogrpH9b12l1.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b12l1.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b12l1(d_rdogrpH9b12l1[i]);
            }

            objSave.setH9b12l2(txtH9b12l2.getText().toString());
            objSave.setH9b12l3(txtH9b12l3.getText().toString());
            String[] d_rdogrpH9b12m1 = new String[] {"1","0"};
            objSave.setH9b12m1("");
            for (int i = 0; i < rdogrpH9b12m1.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b12m1.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b12m1(d_rdogrpH9b12m1[i]);
            }

            objSave.setH9b12m2(txtH9b12m2.getText().toString());
            objSave.setH9b12m3(txtH9b12m3.getText().toString());
            String[] d_rdogrpH9b13a = new String[] {"1","0"};
            objSave.setH9b13a("");
            for (int i = 0; i < rdogrpH9b13a.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b13a.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b13a(d_rdogrpH9b13a[i]);
            }

            objSave.setH9b13b(txtH9b13b.getText().toString());
            objSave.setH9b13c(txtH9b13c.getText().toString());
            String[] d_rdogrpH9b14a = new String[] {"1","0"};
            objSave.setH9b14a("");
            for (int i = 0; i < rdogrpH9b14a.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpH9b14a.getChildAt(i);
                if (rb.isChecked()) objSave.setH9b14a(d_rdogrpH9b14a[i]);
            }

            objSave.setH9b14x1(txtH9b14x1.getText().toString());
            objSave.setH9b14b(txtH9b14b.getText().toString());
            objSave.setH9b14c(txtH9b14c.getText().toString());
            objSave.setStartTime(StartTime);
            objSave.setEndTime(g.CurrentTime24());
            objSave.setUserId(g.getUserId());
            objSave.setEntryUser(g.getUserId()); //from data entry user list
            //objSave.setLat(Double.toString(currentLatitude));
            //objSave.setLon(Double.toString(currentLongitude));
            objSave.setEnDt(Global.DateTimeNowYMDHMS());

            String status = objSave.SaveUpdateData(this);
            if(status.length()==0) {
                EntryStatus_DataModel e = new EntryStatus_DataModel(TableName, RND, SUCHANAID);
                e.SaveUpdateData(this);
                finish();
                Bundle IDBundle = new Bundle();
                IDBundle.putString("Rnd", txtRnd.getText().toString());
                IDBundle.putString("SuchanaID", txtSuchanaID.getText().toString());

                startActivity(new Intent(Cost3.this, Savings.class).putExtras(IDBundle));

            }
            else{
                Connection.MessageBox(Cost3.this, status);
                return;
            }
        }
        catch(Exception  e)
        {
            Connection.MessageBox(Cost3.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID)
    {
        try
        {

            RadioButton rb;
            Cost3_DataModel d = new Cost3_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "' and H8111a NOT NULL";
            List<Cost3_DataModel> data = d.SelectAll(this, SQL);
            for(Cost3_DataModel item : data){
                //   txtRnd.setText(item.getRnd());
                //    txtSuchanaID.setText(item.getSuchanaID());
                //txtMSlNo.setText(item.getMSlNo());
                String[] d_rdogrpH8111a = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH8111a.length; i++)
                {
                    if (item.getH8111a().equals(String.valueOf(d_rdogrpH8111a[i])))
                    {
                        rb = (RadioButton)rdogrpH8111a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH8111b.setText(item.getH8111b());
                String[] d_rdogrpH8111c = new String[] {"1","2","3"};
                for (int i = 0; i < d_rdogrpH8111c.length; i++)
                {
                    if (item.getH8111c().equals(String.valueOf(d_rdogrpH8111c[i])))
                    {
                        rb = (RadioButton)rdogrpH8111c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH8111d.setText(item.getH8111d());
                String[] d_rdogrpH121a = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH121a.length; i++)
                {
                    if (item.getH121a().equals(String.valueOf(d_rdogrpH121a[i])))
                    {
                        rb = (RadioButton)rdogrpH121a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH8121x1.setText(item.getH8121x1());
                txtH8121b.setText(item.getH8121b());
                String[] d_rdogrpH8121c = new String[] {"1","2","3"};
                for (int i = 0; i < d_rdogrpH8121c.length; i++)
                {
                    if (item.getH8121c().equals(String.valueOf(d_rdogrpH8121c[i])))
                    {
                        rb = (RadioButton)rdogrpH8121c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH8121d.setText(item.getH8121d());
                String[] d_rdogrpH8112a = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH8112a.length; i++)
                {
                    if (item.getH8112a().equals(String.valueOf(d_rdogrpH8112a[i])))
                    {
                        rb = (RadioButton)rdogrpH8112a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH8112x1.setText(item.getH8112x1());
                txtH8112b.setText(item.getH8112b());
                String[] d_rdogrpH8112c = new String[] {"1","2","3"};
                for (int i = 0; i < d_rdogrpH8112c.length; i++)
                {
                    if (item.getH8112c().equals(String.valueOf(d_rdogrpH8112c[i])))
                    {
                        rb = (RadioButton)rdogrpH8112c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH8112d.setText(item.getH8112d());
                String[] d_rdogrpH9a1a = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9a1a.length; i++)
                {
                    if (item.getH9a1a().equals(String.valueOf(d_rdogrpH9a1a[i])))
                    {
                        rb = (RadioButton)rdogrpH9a1a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9a1b.setText(item.getH9a1b());
                txtH9a1c.setText(item.getH9a1c());
                String[] d_rdogrpH9a2a = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9a2a.length; i++)
                {
                    if (item.getH9a2a().equals(String.valueOf(d_rdogrpH9a2a[i])))
                    {
                        rb = (RadioButton)rdogrpH9a2a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9a2b.setText(item.getH9a2b());
                txtH9a2c.setText(item.getH9a2c());
                String[] d_rdogrpH9a3a = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9a3a.length; i++)
                {
                    if (item.getH9a3a().equals(String.valueOf(d_rdogrpH9a3a[i])))
                    {
                        rb = (RadioButton)rdogrpH9a3a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9a3b.setText(item.getH9a3b());
                txtH9a3c.setText(item.getH9a3c());
                String[] d_rdogrpH9a4a = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9a4a.length; i++)
                {
                    if (item.getH9a4a().equals(String.valueOf(d_rdogrpH9a4a[i])))
                    {
                        rb = (RadioButton)rdogrpH9a4a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9a4b.setText(item.getH9a4b());
                txtH9a4c.setText(item.getH9a4c());
                String[] d_rdogrpH9a5a = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9a5a.length; i++)
                {
                    if (item.getH9a5a().equals(String.valueOf(d_rdogrpH9a5a[i])))
                    {
                        rb = (RadioButton)rdogrpH9a5a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9a5b.setText(item.getH9a5b());
                txtH9a5c.setText(item.getH9a5c());
                String[] d_rdogrpH9b1a = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b1a.length; i++)
                {
                    if (item.getH9b1a().equals(String.valueOf(d_rdogrpH9b1a[i])))
                    {
                        rb = (RadioButton)rdogrpH9b1a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b1b.setText(item.getH9b1b());
                txtH9b1c.setText(item.getH9b1c());
                String[] d_rdogrpH9b2a = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b2a.length; i++)
                {
                    if (item.getH9b2a().equals(String.valueOf(d_rdogrpH9b2a[i])))
                    {
                        rb = (RadioButton)rdogrpH9b2a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b2b.setText(item.getH9b2b());
                txtH9b2c.setText(item.getH9b2c());
                String[] d_rdogrpH9b3a = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b3a.length; i++)
                {
                    if (item.getH9b3a().equals(String.valueOf(d_rdogrpH9b3a[i])))
                    {
                        rb = (RadioButton)rdogrpH9b3a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b3b.setText(item.getH9b3b());
                txtH9b3c.setText(item.getH9b3c());
                String[] d_rdogrpH9b4a = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b4a.length; i++)
                {
                    if (item.getH9b4a().equals(String.valueOf(d_rdogrpH9b4a[i])))
                    {
                        rb = (RadioButton)rdogrpH9b4a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b4b.setText(item.getH9b4b());
                txtH9b4c.setText(item.getH9b4c());
                String[] d_rdogrpH9b5a = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b5a.length; i++)
                {
                    if (item.getH9b5a().equals(String.valueOf(d_rdogrpH9b5a[i])))
                    {
                        rb = (RadioButton)rdogrpH9b5a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b5b.setText(item.getH9b5b());
                txtH9b5c.setText(item.getH9b5c());
                String[] d_rdogrpH9b6a = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b6a.length; i++)
                {
                    if (item.getH9b6a().equals(String.valueOf(d_rdogrpH9b6a[i])))
                    {
                        rb = (RadioButton)rdogrpH9b6a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b6b.setText(item.getH9b6b());
                txtH9b6c.setText(item.getH9b6c());
                String[] d_rdogrpH9b7a = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b7a.length; i++)
                {
                    if (item.getH9b7a().equals(String.valueOf(d_rdogrpH9b7a[i])))
                    {
                        rb = (RadioButton)rdogrpH9b7a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b7b.setText(item.getH9b7b());
                txtH9b7c.setText(item.getH9b7c());
                String[] d_rdogrpH9b8a = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b8a.length; i++)
                {
                    if (item.getH9b8a().equals(String.valueOf(d_rdogrpH9b8a[i])))
                    {
                        rb = (RadioButton)rdogrpH9b8a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b8b.setText(item.getH9b8b());
                txtH9b8c.setText(item.getH9b8c());
                String[] d_rdogrpH9b9a = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b9a.length; i++)
                {
                    if (item.getH9b9a().equals(String.valueOf(d_rdogrpH9b9a[i])))
                    {
                        rb = (RadioButton)rdogrpH9b9a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b9b.setText(item.getH9b9b());
                txtH9b9c.setText(item.getH9b9c());
                String[] d_rdogrpH9b10a = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b10a.length; i++)
                {
                    if (item.getH9b10a().equals(String.valueOf(d_rdogrpH9b10a[i])))
                    {
                        rb = (RadioButton)rdogrpH9b10a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b10b.setText(item.getH9b10b());
                txtH9b10c.setText(item.getH9b10c());
                String[] d_rdogrpH9b11a = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b11a.length; i++)
                {
                    if (item.getH9b11a().equals(String.valueOf(d_rdogrpH9b11a[i])))
                    {
                        rb = (RadioButton)rdogrpH9b11a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b11b.setText(item.getH9b11b());
                txtH9b11c.setText(item.getH9b11c());
                String[] d_rdogrpH9b12 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b12.length; i++)
                {
                    if (item.getH9b12().equals(String.valueOf(d_rdogrpH9b12[i])))
                    {
                        rb = (RadioButton)rdogrpH9b12.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH9b12a1 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b12a1.length; i++)
                {
                    if (item.getH9b12a1().equals(String.valueOf(d_rdogrpH9b12a1[i])))
                    {
                        rb = (RadioButton)rdogrpH9b12a1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b12a2.setText(item.getH9b12a2());
                txtH9b12a3.setText(item.getH9b12a3());
                String[] d_rdogrpH9b12b1 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b12b1.length; i++)
                {
                    if (item.getH9b12b1().equals(String.valueOf(d_rdogrpH9b12b1[i])))
                    {
                        rb = (RadioButton)rdogrpH9b12b1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b12b2.setText(item.getH9b12b2());
                txtH9b12b3.setText(item.getH9b12b3());
                String[] d_rdogrpH9b12c1 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b12c1.length; i++)
                {
                    if (item.getH9b12c1().equals(String.valueOf(d_rdogrpH9b12c1[i])))
                    {
                        rb = (RadioButton)rdogrpH9b12c1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b12c2.setText(item.getH9b12c2());
                txtH9b12c3.setText(item.getH9b12c3());
                String[] d_rdogrpH9b12d1 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b12d1.length; i++)
                {
                    if (item.getH9b12d1().equals(String.valueOf(d_rdogrpH9b12d1[i])))
                    {
                        rb = (RadioButton)rdogrpH9b12d1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b12d2.setText(item.getH9b12d2());
                txtH9b12d3.setText(item.getH9b12d3());
                String[] d_rdogrpH9b12e1 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b12e1.length; i++)
                {
                    if (item.getH9b12e1().equals(String.valueOf(d_rdogrpH9b12e1[i])))
                    {
                        rb = (RadioButton)rdogrpH9b12e1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b12e2.setText(item.getH9b12e2());
                txtH9b12e3.setText(item.getH9b12e3());
                String[] d_rdogrpH9b12f1 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b12f1.length; i++)
                {
                    if (item.getH9b12f1().equals(String.valueOf(d_rdogrpH9b12f1[i])))
                    {
                        rb = (RadioButton)rdogrpH9b12f1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b12f2.setText(item.getH9b12f2());
                txtH9b12f3.setText(item.getH9b12f3());
                String[] d_rdogrpH9b12g1 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b12g1.length; i++)
                {
                    if (item.getH9b12g1().equals(String.valueOf(d_rdogrpH9b12g1[i])))
                    {
                        rb = (RadioButton)rdogrpH9b12g1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b12g2.setText(item.getH9b12g2());
                txtH9b12g3.setText(item.getH9b12g3());
                String[] d_rdogrpH9b12h1 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b12h1.length; i++)
                {
                    if (item.getH9b12h1().equals(String.valueOf(d_rdogrpH9b12h1[i])))
                    {
                        rb = (RadioButton)rdogrpH9b12h1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b12h2.setText(item.getH9b12h2());
                txtH9b12h3.setText(item.getH9b12h3());
                String[] d_rdogrpH9b12i1 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b12i1.length; i++)
                {
                    if (item.getH9b12i1().equals(String.valueOf(d_rdogrpH9b12i1[i])))
                    {
                        rb = (RadioButton)rdogrpH9b12i1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b12i2.setText(item.getH9b12i2());
                txtH9b12i3.setText(item.getH9b12i3());
                String[] d_rdogrpH9b12j1 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b12j1.length; i++)
                {
                    if (item.getH9b12j1().equals(String.valueOf(d_rdogrpH9b12j1[i])))
                    {
                        rb = (RadioButton)rdogrpH9b12j1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b12j2.setText(item.getH9b12j2());
                txtH9b12j3.setText(item.getH9b12j3());
                String[] d_rdogrpH9b12k1 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b12k1.length; i++)
                {
                    if (item.getH9b12k1().equals(String.valueOf(d_rdogrpH9b12k1[i])))
                    {
                        rb = (RadioButton)rdogrpH9b12k1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b12k2.setText(item.getH9b12k2());
                txtH9b12k3.setText(item.getH9b12k3());
                String[] d_rdogrpH9b12l1 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b12l1.length; i++)
                {
                    if (item.getH9b12l1().equals(String.valueOf(d_rdogrpH9b12l1[i])))
                    {
                        rb = (RadioButton)rdogrpH9b12l1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b12l2.setText(item.getH9b12l2());
                txtH9b12l3.setText(item.getH9b12l3());
                String[] d_rdogrpH9b12m1 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b12m1.length; i++)
                {
                    if (item.getH9b12m1().equals(String.valueOf(d_rdogrpH9b12m1[i])))
                    {
                        rb = (RadioButton)rdogrpH9b12m1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b12m2.setText(item.getH9b12m2());
                txtH9b12m3.setText(item.getH9b12m3());
                String[] d_rdogrpH9b13a = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b13a.length; i++)
                {
                    if (item.getH9b13a().equals(String.valueOf(d_rdogrpH9b13a[i])))
                    {
                        rb = (RadioButton)rdogrpH9b13a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b13b.setText(item.getH9b13b());
                txtH9b13c.setText(item.getH9b13c());
                String[] d_rdogrpH9b14a = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpH9b14a.length; i++)
                {
                    if (item.getH9b14a().equals(String.valueOf(d_rdogrpH9b14a[i])))
                    {
                        rb = (RadioButton)rdogrpH9b14a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH9b14x1.setText(item.getH9b14x1());
                txtH9b14b.setText(item.getH9b14b());
                txtH9b14c.setText(item.getH9b14c());
            }
        }
        catch(Exception  e)
        {
            Connection.MessageBox(Cost3.this, e.getMessage());
            return;
        }
    }

    protected Dialog onCreateDialog(int id) {
        final Calendar c = Calendar.getInstance();
        hour = c.get(Calendar.HOUR_OF_DAY);
        minute = c.get(Calendar.MINUTE);
        switch (id) {
            case DATE_DIALOG:
                return new DatePickerDialog(this, mDateSetListener,g.mYear,g.mMonth-1,g.mDay);
            case TIME_DIALOG:
                return new TimePickerDialog(this, timePickerListener, hour, minute,false);
        }
        return null;
    }

    // turning off the GPS if its in on state. to avoid the battery drain.
    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();

    }
}