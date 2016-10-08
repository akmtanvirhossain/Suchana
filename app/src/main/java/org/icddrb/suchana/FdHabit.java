package org.icddrb.suchana;
//Android Manifest Code
//<activity android:name=".FdHabit" android:label="FdHabit" />

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

public class FdHabit extends Activity {
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
    LinearLayout secM4;
    LinearLayout secRnd;
    View lineRnd;
    TextView VlblRnd;
    EditText txtRnd;
    LinearLayout secSuchanaID;
    View lineSuchanaID;
    TextView VlblSuchanaID;
    EditText txtSuchanaID;
    LinearLayout secC11;
    View lineC11;
    TextView VlblC11;
    Spinner spnCHSLNo;
    LinearLayout secC12;
    View lineC12;
    TextView VlblC12;
    Spinner spnMSlNo;
    LinearLayout secC13;
    View lineC13;
    TextView VlblC13;
    EditText txtC13;
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
    LinearLayout secC17;
    View lineC17;
    TextView VlblC17;
    EditText txtC17;
    LinearLayout secC18;
    View lineC18;
    TextView VlblC18;
    RadioGroup rdogrpC18;
    RadioButton rdoC181;
    RadioButton rdoC182;
    LinearLayout secC19a;
    View lineC19a;
    TextView VlblC19a;
    Spinner spnC19a;
    EditText txtC19b;
    LinearLayout secC110;
    View lineC110;
    TextView VlblC110;
    RadioGroup rdogrpC110;
    RadioButton rdoC1101;
    RadioButton rdoC1102;
    LinearLayout secC111;
    View lineC111;
    TextView VlblC111;
    RadioGroup rdogrpC111;
    RadioButton rdoC1111;
    RadioButton rdoC1112;
    RadioButton rdoC1113;
    LinearLayout secC112;
    View lineC112;
    TextView VlblC112;
    RadioGroup rdogrpC112;
    RadioButton rdoC1121;
    RadioButton rdoC1122;
    RadioButton rdoC1123;
    LinearLayout secC113;
    View lineC113;
    TextView VlblC113;
    RadioGroup rdogrpC113;
    RadioButton rdoC1131;
    RadioButton rdoC1132;
    RadioButton rdoC1133;
    LinearLayout secC114d;
    View lineC114d;
    TextView VlblC114d;
    EditText txtC114d;
    LinearLayout secC114m;
    View lineC114m;
    TextView VlblC114m;
    EditText txtC114m;
    LinearLayout secC115;
    View lineC115;
    TextView VlblC115;
    RadioGroup rdogrpC115;
    RadioButton rdoC1151;
    RadioButton rdoC1152;
    LinearLayout secC116;
    View lineC116;
    TextView VlblC116;
    EditText txtC116;
    LinearLayout seclblC117;
    LinearLayout secC117a;
    View lineC117a;
    TextView VlblC117a;
    CheckBox chkC117a;
    LinearLayout secC117b;
    View lineC117b;
    TextView VlblC117b;
    CheckBox chkC117b;
    LinearLayout secC117c;
    View lineC117c;
    TextView VlblC117c;
    CheckBox chkC117c;
    LinearLayout secC117d;
    View lineC117d;
    TextView VlblC117d;
    CheckBox chkC117d;
    LinearLayout secC117e;
    View lineC117e;
    TextView VlblC117e;
    CheckBox chkC117e;
    LinearLayout secC117eX;
    View lineC117eX;
    TextView VlblC117eX;
    EditText txtC117eX;
    LinearLayout secC117f;
    View lineC117f;
    TextView VlblC117f;
    CheckBox chkC117f;
    LinearLayout secC118d;
    View lineC118d;
    TextView VlblC118d;
    EditText txtC118d;
    LinearLayout secC118m;
    View lineC118m;
    TextView VlblC118m;
    EditText txtC118m;
    LinearLayout seclblC119;
    LinearLayout secC119;
    View lineC119;
    TextView VlblC119;
    RadioGroup rdogrpC119;
    RadioButton rdoC1191;
    RadioButton rdoC1192;
    RadioButton rdoC1193;
    LinearLayout seclblC120;
    LinearLayout secC120;
    View lineC120;
    TextView VlblC120;
    RadioGroup rdogrpC120;
    RadioButton rdoC1201;
    RadioButton rdoC1202;
    RadioButton rdoC1203;
    LinearLayout seclblC121;
    LinearLayout secC121a;
    View lineC121a;
    TextView VlblC121a;
    RadioGroup rdogrpC121a;
    RadioButton rdoC121a1;
    RadioButton rdoC121a2;
    RadioButton rdoC121a3;
    LinearLayout secC121b;
    View lineC121b;
    TextView VlblC121b;
    RadioGroup rdogrpC121b;
    RadioButton rdoC121b1;
    RadioButton rdoC121b2;
    RadioButton rdoC121b3;
    LinearLayout secC121b1;
    View lineC121b1;
    TextView VlblC121b1;
    EditText txtC121b1;
    LinearLayout secC121c;
    View lineC121c;
    TextView VlblC121c;
    RadioGroup rdogrpC121c;
    RadioButton rdoC121c1;
    RadioButton rdoC121c2;
    RadioButton rdoC121c3;
    LinearLayout secC121c1;
    View lineC121c1;
    TextView VlblC121c1;
    EditText txtC121c1;
    LinearLayout secC121d;
    View lineC121d;
    TextView VlblC121d;
    RadioGroup rdogrpC121d;
    RadioButton rdoC121d1;
    RadioButton rdoC121d2;
    RadioButton rdoC121d3;
    LinearLayout secC121e;
    View lineC121e;
    TextView VlblC121e;
    RadioGroup rdogrpC121e;
    RadioButton rdoC121e1;
    RadioButton rdoC121e2;
    RadioButton rdoC121e3;
    LinearLayout secC121f;
    View lineC121f;
    TextView VlblC121f;
    RadioGroup rdogrpC121f;
    RadioButton rdoC121f1;
    RadioButton rdoC121f2;
    RadioButton rdoC121f3;
    LinearLayout secC121f1;
    View lineC121f1;
    TextView VlblC121f1;
    EditText txtC121f1;
    LinearLayout secC121g;
    View lineC121g;
    TextView VlblC121g;
    RadioGroup rdogrpC121g;
    RadioButton rdoC121g1;
    RadioButton rdoC121g2;
    RadioButton rdoC121g3;
    LinearLayout secC121h;
    View lineC121h;
    TextView VlblC121h;
    RadioGroup rdogrpC121h;
    RadioButton rdoC121h1;
    RadioButton rdoC121h2;
    RadioButton rdoC121h3;
    LinearLayout secC121i;
    View lineC121i;
    TextView VlblC121i;
    RadioGroup rdogrpC121i;
    RadioButton rdoC121i1;
    RadioButton rdoC121i2;
    RadioButton rdoC121i3;
    LinearLayout secC121iX;
    View lineC121iX;
    TextView VlblC121iX;
    EditText txtC121iX;
    LinearLayout secC122;
    View lineC122;
    TextView VlblC122;
    RadioGroup rdogrpC122;
    RadioButton rdoC1221;
    RadioButton rdoC1222;
    RadioButton rdoC1223;
    LinearLayout secC123;
    View lineC123;
    TextView VlblC123;
    RadioGroup rdogrpC123;
    RadioButton rdoC1231;
    RadioButton rdoC1232;
    RadioButton rdoC1233;
    LinearLayout secC124;
    View lineC124;
    TextView VlblC124;
    RadioGroup rdogrpC124;
    RadioButton rdoC1241;
    RadioButton rdoC1242;
    LinearLayout secC125;
    View lineC125;
    TextView VlblC125;
    EditText txtC125;
    LinearLayout seclblC126;
    LinearLayout seclblC126a;
    LinearLayout secC126a;
    View lineC126a;
    TextView VlblC126a;
    RadioGroup rdogrpC126a;
    RadioButton rdoC126a1;
    RadioButton rdoC126a2;
    RadioButton rdoC126a3;
    LinearLayout secC126b;
    View lineC126b;
    TextView VlblC126b;
    RadioGroup rdogrpC126b;
    RadioButton rdoC126b1;
    RadioButton rdoC126b2;
    RadioButton rdoC126b3;
    LinearLayout secC126c;
    View lineC126c;
    TextView VlblC126c;
    RadioGroup rdogrpC126c;
    RadioButton rdoC126c1;
    RadioButton rdoC126c2;
    RadioButton rdoC126c3;
    LinearLayout secC126d;
    View lineC126d;
    TextView VlblC126d;
    RadioGroup rdogrpC126d;
    RadioButton rdoC126d1;
    RadioButton rdoC126d2;
    RadioButton rdoC126d3;
    LinearLayout secC126e;
    View lineC126e;
    TextView VlblC126e;
    RadioGroup rdogrpC126e;
    RadioButton rdoC126e1;
    RadioButton rdoC126e2;
    RadioButton rdoC126e3;
    LinearLayout secC126f;
    View lineC126f;
    TextView VlblC126f;
    RadioGroup rdogrpC126f;
    RadioButton rdoC126f1;
    RadioButton rdoC126f2;
    RadioButton rdoC126f3;
    LinearLayout secC126g;
    View lineC126g;
    TextView VlblC126g;
    RadioGroup rdogrpC126g;
    RadioButton rdoC126g1;
    RadioButton rdoC126g2;
    RadioButton rdoC126g3;
    LinearLayout secC126h;
    View lineC126h;
    TextView VlblC126h;
    RadioGroup rdogrpC126h;
    RadioButton rdoC126h1;
    RadioButton rdoC126h2;
    RadioButton rdoC126h3;
    LinearLayout secC126i;
    View lineC126i;
    TextView VlblC126i;
    RadioGroup rdogrpC126i;
    RadioButton rdoC126i1;
    RadioButton rdoC126i2;
    RadioButton rdoC126i3;
    LinearLayout secC126j;
    View lineC126j;
    TextView VlblC126j;
    RadioGroup rdogrpC126j;
    RadioButton rdoC126j1;
    RadioButton rdoC126j2;
    RadioButton rdoC126j3;
    LinearLayout secC126k;
    View lineC126k;
    TextView VlblC126k;
    RadioGroup rdogrpC126k;
    RadioButton rdoC126k1;
    RadioButton rdoC126k2;
    RadioButton rdoC126k3;
    LinearLayout secC126l;
    View lineC126l;
    TextView VlblC126l;
    RadioGroup rdogrpC126l;
    RadioButton rdoC126l1;
    RadioButton rdoC126l2;
    RadioButton rdoC126l3;
    LinearLayout secC126m;
    View lineC126m;
    TextView VlblC126m;
    RadioGroup rdogrpC126m;
    RadioButton rdoC126m1;
    RadioButton rdoC126m2;
    RadioButton rdoC126m3;
    LinearLayout secC126n;
    View lineC126n;
    TextView VlblC126n;
    RadioGroup rdogrpC126n;
    RadioButton rdoC126n1;
    RadioButton rdoC126n2;
    RadioButton rdoC126n3;
    LinearLayout secC126o;
    View lineC126o;
    TextView VlblC126o;
    RadioGroup rdogrpC126o;
    RadioButton rdoC126o1;
    RadioButton rdoC126o2;
    RadioButton rdoC126o3;
    LinearLayout secC126q;
    View lineC126q;
    TextView VlblC126q;
    RadioGroup rdogrpC126q;
    RadioButton rdoC126q1;
    RadioButton rdoC126q2;
    RadioButton rdoC126q3;
    LinearLayout secC126r;
    View lineC126r;
    TextView VlblC126r;
    RadioGroup rdogrpC126r;
    RadioButton rdoC126r1;
    RadioButton rdoC126r2;
    RadioButton rdoC126r3;
    LinearLayout secC129;
    View lineC129;
    TextView VlblC129;
    RadioGroup rdogrpC129;
    RadioButton rdoC1291;
    RadioButton rdoC1292;
    RadioButton rdoC1293;
    LinearLayout secC130;
    View lineC130;
    TextView VlblC130;
    RadioGroup rdogrpC130;
    RadioButton rdoC1301;
    RadioButton rdoC1302;
    LinearLayout secC131;
    View lineC131;
    TextView VlblC131;
    RadioGroup rdogrpC131;
    RadioButton rdoC1311;
    RadioButton rdoC1312;
    LinearLayout secC134;
    View lineC134;
    TextView VlblC134;
    RadioGroup rdogrpC134;
    RadioButton rdoC1341;
    RadioButton rdoC1342;
    LinearLayout secC135a;
    View lineC135a;
    TextView VlblC135a;
    CheckBox chkC135a;
    LinearLayout secC135b;
    View lineC135b;
    TextView VlblC135b;
    CheckBox chkC135b;
    LinearLayout secC135c;
    View lineC135c;
    TextView VlblC135c;
    CheckBox chkC135c;
    LinearLayout secC135d;
    View lineC135d;
    TextView VlblC135d;
    CheckBox chkC135d;
    LinearLayout secC135e;
    View lineC135e;
    TextView VlblC135e;
    CheckBox chkC135e;
    LinearLayout secC135eX;
    View lineC135eX;
    TextView VlblC135eX;
    EditText txtC135eX;
    LinearLayout secC136;
    View lineC136;
    TextView VlblC136;
    RadioGroup rdogrpC136;
    RadioButton rdoC1361;
    RadioButton rdoC1362;
    RadioButton rdoC1363;
    LinearLayout seclblC137;
    LinearLayout secC137a;
    View lineC137a;
    TextView VlblC137a;
    CheckBox chkC137a;
    LinearLayout secC137b;
    View lineC137b;
    TextView VlblC137b;
    CheckBox chkC137b;
    LinearLayout secC137c;
    View lineC137c;
    TextView VlblC137c;
    CheckBox chkC137c;
    LinearLayout secC137d;
    View lineC137d;
    TextView VlblC137d;
    CheckBox chkC137d;
    LinearLayout secC137e;
    View lineC137e;
    TextView VlblC137e;
    CheckBox chkC137e;
    LinearLayout secC137f;
    View lineC137f;
    TextView VlblC137f;
    CheckBox chkC137f;
    LinearLayout secC137g;
    View lineC137g;
    TextView VlblC137g;
    CheckBox chkC137g;
    LinearLayout secC137h;
    View lineC137h;
    TextView VlblC137h;
    CheckBox chkC137h;
    LinearLayout secC137i;
    View lineC137i;
    TextView VlblC137i;
    CheckBox chkC137i;
    LinearLayout secC137j;
    View lineC137j;
    TextView VlblC137j;
    CheckBox chkC137j;
    LinearLayout secC137k;
    View lineC137k;
    TextView VlblC137k;
    CheckBox chkC137k;
    LinearLayout secC137l;
    View lineC137l;
    TextView VlblC137l;
    CheckBox chkC137l;
    LinearLayout secC137m;
    View lineC137m;
    TextView VlblC137m;
    CheckBox chkC137m;
    LinearLayout secC137mX;
    View lineC137mX;
    TextView VlblC137mX;
    EditText txtC137mX;
    LinearLayout secC138;
    View lineC138;
    TextView VlblC138;
    RadioGroup rdogrpC138;
    RadioButton rdoC1381;
    RadioButton rdoC1382;
    LinearLayout secC139;
    View lineC139;
    TextView VlblC139;
    RadioGroup rdogrpC139;
    RadioButton rdoC1391;
    RadioButton rdoC1392;
    RadioButton rdoC1393;
    LinearLayout secBCG1;
    View lineBCG1;
    TextView VlblBCG1;
    RadioGroup rdogrpBCG1;
    RadioButton rdoBCG11;
    RadioButton rdoBCG12;
    RadioButton rdoBCG13;
    LinearLayout secBCG2;
    View lineBCG2;
    TextView VlblBCG2;
    RadioGroup rdogrpBCG2;
    RadioButton rdoBCG21;
    RadioButton rdoBCG22;
    RadioButton rdoBCG23;
    LinearLayout secPenta1;
    View linePenta1;
    TextView VlblPenta1;
    RadioGroup rdogrpPenta1;
    RadioButton rdoPenta11;
    RadioButton rdoPenta12;
    RadioButton rdoPenta13;
    LinearLayout secPenta2;
    View linePenta2;
    TextView VlblPenta2;
    RadioGroup rdogrpPenta2;
    RadioButton rdoPenta21;
    RadioButton rdoPenta22;
    RadioButton rdoPenta23;
    LinearLayout secPenta3;
    View linePenta3;
    TextView VlblPenta3;
    RadioGroup rdogrpPenta3;
    RadioButton rdoPenta31;
    RadioButton rdoPenta32;
    RadioButton rdoPenta33;
    LinearLayout secOPV1;
    View lineOPV1;
    TextView VlblOPV1;
    RadioGroup rdogrpOPV1;
    RadioButton rdoOPV11;
    RadioButton rdoOPV12;
    RadioButton rdoOPV13;
    LinearLayout secOPV2;
    View lineOPV2;
    TextView VlblOPV2;
    RadioGroup rdogrpOPV2;
    RadioButton rdoOPV21;
    RadioButton rdoOPV22;
    RadioButton rdoOPV23;
    LinearLayout secOPV3;
    View lineOPV3;
    TextView VlblOPV3;
    RadioGroup rdogrpOPV3;
    RadioButton rdoOPV31;
    RadioButton rdoOPV32;
    RadioButton rdoOPV33;
    LinearLayout secPCV1;
    View linePCV1;
    TextView VlblPCV1;
    RadioGroup rdogrpPCV1;
    RadioButton rdoPCV11;
    RadioButton rdoPCV12;
    RadioButton rdoPCV13;
    LinearLayout secPCV2;
    View linePCV2;
    TextView VlblPCV2;
    RadioGroup rdogrpPCV2;
    RadioButton rdoPCV21;
    RadioButton rdoPCV22;
    RadioButton rdoPCV23;
    LinearLayout secPCV3;
    View linePCV3;
    TextView VlblPCV3;
    RadioGroup rdogrpPCV3;
    RadioButton rdoPCV31;
    RadioButton rdoPCV32;
    RadioButton rdoPCV33;
    LinearLayout secIPV;
    View lineIPV;
    TextView VlblIPV;
    RadioGroup rdogrpIPV;
    RadioButton rdoIPV1;
    RadioButton rdoIPV2;
    RadioButton rdoIPV3;
    LinearLayout secMR1;
    View lineMR1;
    TextView VlblMR1;
    RadioGroup rdogrpMR1;
    RadioButton rdoMR11;
    RadioButton rdoMR12;
    RadioButton rdoMR13;
    LinearLayout secMR2;
    View lineMR2;
    TextView VlblMR2;
    RadioGroup rdogrpMR2;
    RadioButton rdoMR21;
    RadioButton rdoMR22;
    RadioButton rdoMR23;
    LinearLayout secC140;
    View lineC140;
    TextView VlblC140;
    RadioGroup rdogrpC140;
    RadioButton rdoC1401;
    RadioButton rdoC1402;
    RadioButton rdoC1403;
    LinearLayout secC141;
    View lineC141;
    TextView VlblC141;
    Spinner spnC141;
    LinearLayout secC141X;
    View lineC141X;
    TextView VlblC141X;
    EditText txtC141X;
    LinearLayout secC142;
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


            //    tpTime.setText(new StringBuilder().append(Global.Right("00"+hour,2)).append(":").append(Global.Right("00"+minute,2)));

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
            setContentView(R.layout.fdhabit);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TableName = "FdHabit";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(FdHabit.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), FoodDiversity.class);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(FdHabit.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to go to next form [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Anthro.class);
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


            secM4 = (LinearLayout) findViewById(R.id.secM4);
            secRnd = (LinearLayout) findViewById(R.id.secRnd);
            lineRnd = (View) findViewById(R.id.lineRnd);
            VlblRnd = (TextView) findViewById(R.id.VlblRnd);
            txtRnd = (EditText) findViewById(R.id.txtRnd);
            secSuchanaID = (LinearLayout) findViewById(R.id.secSuchanaID);
            lineSuchanaID = (View) findViewById(R.id.lineSuchanaID);
            VlblSuchanaID = (TextView) findViewById(R.id.VlblSuchanaID);
            txtSuchanaID = (EditText) findViewById(R.id.txtSuchanaID);

            txtRnd.setText(RND);
            txtRnd.setEnabled(false);
            txtSuchanaID.setText(SUCHANAID);
            txtSuchanaID.setEnabled(false);

            secC11 = (LinearLayout) findViewById(R.id.secC11);
            lineC11 = (View) findViewById(R.id.lineC11);
            VlblC11 = (TextView) findViewById(R.id.VlblC11);
            spnCHSLNo = (Spinner) findViewById(R.id.spnCHSLNo);
           // txtC11 = (EditText) findViewById(R.id.txtC11);
            secC12 = (LinearLayout) findViewById(R.id.secC12);
            lineC12 = (View) findViewById(R.id.lineC12);
            VlblC12 = (TextView) findViewById(R.id.VlblC12);
            spnMSlNo = (Spinner) findViewById(R.id.spnMSlNo);
            spnMSlNo.setAdapter(C.getArrayAdapter("select H21 ||'-'||H22 from member where Rnd='" + RND + "' and suchanaId='" + SUCHANAID + "' and H21=(select H221 from member where Rnd='" + RND + "' and suchanaId='" + SUCHANAID + "' and H220='1')"));
            secC13 = (LinearLayout) findViewById(R.id.secC13);
            lineC13 = (View) findViewById(R.id.lineC13);
            VlblC13 = (TextView) findViewById(R.id.VlblC13);
            txtC13 = (EditText) findViewById(R.id.txtC13);
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
            secC17 = (LinearLayout) findViewById(R.id.secC17);
            lineC17 = (View) findViewById(R.id.lineC17);
            VlblC17 = (TextView) findViewById(R.id.VlblC17);
            txtC17 = (EditText) findViewById(R.id.txtC17);
            secC18 = (LinearLayout) findViewById(R.id.secC18);
            lineC18 = (View) findViewById(R.id.lineC18);
            VlblC18 = (TextView) findViewById(R.id.VlblC18);
            rdogrpC18 = (RadioGroup) findViewById(R.id.rdogrpC18);

            rdoC181 = (RadioButton) findViewById(R.id.rdoC181);
            rdoC182 = (RadioButton) findViewById(R.id.rdoC182);
            secC19a = (LinearLayout) findViewById(R.id.secC19a);
            lineC19a = (View) findViewById(R.id.lineC19a);
            VlblC19a = (TextView) findViewById(R.id.VlblC19a);

            spnC19a = (Spinner) findViewById(R.id.spnC19a);
            List<String> listH114a = new ArrayList<String>();

            listH114a.add("");
            listH114a.add("01-সাথে সাথেই");
            listH114a.add("02-ঘণ্টা");
            listH114a.add("03-দিন");
            ArrayAdapter<String> adptrH114a = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH114a);
            spnC19a.setAdapter(adptrH114a);

            spnC19a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnC19a.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnC19a.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("01")) {
                        txtC19b.setText("");
                        txtC19b.setVisibility(View.GONE);

                    } else {
                        txtC19b.setVisibility(View.VISIBLE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });


            txtC19b = (EditText) findViewById(R.id.txtC19b);
            txtC19b.setVisibility(View.GONE);
            secC110 = (LinearLayout) findViewById(R.id.secC110);
            lineC110 = (View) findViewById(R.id.lineC110);
            VlblC110 = (TextView) findViewById(R.id.VlblC110);
            rdogrpC110 = (RadioGroup) findViewById(R.id.rdogrpC110);

            rdoC1101 = (RadioButton) findViewById(R.id.rdoC1101);
            rdoC1102 = (RadioButton) findViewById(R.id.rdoC1102);
            secC111 = (LinearLayout) findViewById(R.id.secC111);
            lineC111 = (View) findViewById(R.id.lineC111);
            VlblC111 = (TextView) findViewById(R.id.VlblC111);
            rdogrpC111 = (RadioGroup) findViewById(R.id.rdogrpC111);

            rdoC1111 = (RadioButton) findViewById(R.id.rdoC1111);
            rdoC1112 = (RadioButton) findViewById(R.id.rdoC1112);
            rdoC1113 = (RadioButton) findViewById(R.id.rdoC1113);


            rdogrpC18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpC18 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpC18.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpC18.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpC18[i];
                    }


                    if (rbData.equalsIgnoreCase("0")) {

                        secC19a.setVisibility(View.GONE);
                        lineC19a.setVisibility(View.GONE);
                        spnC19a.setSelection(0);
                        txtC19b.setText(null);
                        secC110.setVisibility(View.GONE);
                        rdogrpC110.clearCheck();
                        secC111.setVisibility(View.GONE);
                        rdogrpC111.clearCheck();

                    } else {
                        secC19a.setVisibility(View.VISIBLE);
                        lineC19a.setVisibility(View.VISIBLE);
                        secC110.setVisibility(View.VISIBLE);
                        secC111.setVisibility(View.VISIBLE);

                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secC112 = (LinearLayout) findViewById(R.id.secC112);
            lineC112 = (View) findViewById(R.id.lineC112);
            VlblC112 = (TextView) findViewById(R.id.VlblC112);
            rdogrpC112 = (RadioGroup) findViewById(R.id.rdogrpC112);

            rdoC1121 = (RadioButton) findViewById(R.id.rdoC1121);
            rdoC1122 = (RadioButton) findViewById(R.id.rdoC1122);
            rdoC1123 = (RadioButton) findViewById(R.id.rdoC1123);
            secC113 = (LinearLayout) findViewById(R.id.secC113);
            lineC113 = (View) findViewById(R.id.lineC113);
            VlblC113 = (TextView) findViewById(R.id.VlblC113);
            rdogrpC113 = (RadioGroup) findViewById(R.id.rdogrpC113);

            rdoC1131 = (RadioButton) findViewById(R.id.rdoC1131);
            rdoC1132 = (RadioButton) findViewById(R.id.rdoC1132);
            rdoC1133 = (RadioButton) findViewById(R.id.rdoC1133);
            secC114d = (LinearLayout) findViewById(R.id.secC114d);
            lineC114d = (View) findViewById(R.id.lineC114d);
            VlblC114d = (TextView) findViewById(R.id.VlblC114d);
            txtC114d = (EditText) findViewById(R.id.txtC114d);
            secC114m = (LinearLayout) findViewById(R.id.secC114m);
            lineC114m = (View) findViewById(R.id.lineC114m);
            VlblC114m = (TextView) findViewById(R.id.VlblC114m);
            txtC114m = (EditText) findViewById(R.id.txtC114m);
            secC115 = (LinearLayout) findViewById(R.id.secC115);
            lineC115 = (View) findViewById(R.id.lineC115);
            VlblC115 = (TextView) findViewById(R.id.VlblC115);
            rdogrpC115 = (RadioGroup) findViewById(R.id.rdogrpC115);

            rdoC1151 = (RadioButton) findViewById(R.id.rdoC1151);
            rdoC1152 = (RadioButton) findViewById(R.id.rdoC1152);
            rdogrpC115.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpC115 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpC115.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpC115.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpC115[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {

                        secC116.setVisibility(View.GONE);
                        lineC116.setVisibility(View.GONE);
                        txtC116.setText("");
                        seclblC117.setVisibility(View.GONE);
                        secC117a.setVisibility(View.GONE);
                        lineC117a.setVisibility(View.GONE);
                        chkC117a.setChecked(false);
                        secC117b.setVisibility(View.GONE);
                        lineC117b.setVisibility(View.GONE);
                        chkC117b.setChecked(false);
                        secC117c.setVisibility(View.GONE);
                        lineC117c.setVisibility(View.GONE);
                        chkC117c.setChecked(false);
                        secC117d.setVisibility(View.GONE);
                        lineC117d.setVisibility(View.GONE);
                        chkC117d.setChecked(false);
                        secC117e.setVisibility(View.GONE);
                        lineC117e.setVisibility(View.GONE);
                        chkC117e.setChecked(false);
                        secC117eX.setVisibility(View.GONE);
                        lineC117eX.setVisibility(View.GONE);
                        txtC117eX.setText("");
                        secC117f.setVisibility(View.GONE);
                        lineC117f.setVisibility(View.GONE);
                        chkC117f.setChecked(false);
                        secC118d.setVisibility(View.GONE);
                        lineC118d.setVisibility(View.GONE);
                        txtC118d.setText("");
                        secC118m.setVisibility(View.GONE);
                        lineC118m.setVisibility(View.GONE);
                        txtC118m.setText("");
                    } else {
                        secC116.setVisibility(View.VISIBLE);
                        lineC116.setVisibility(View.VISIBLE);
                        seclblC117.setVisibility(View.VISIBLE);
                        secC117a.setVisibility(View.VISIBLE);
                        lineC117a.setVisibility(View.VISIBLE);
                        secC117b.setVisibility(View.VISIBLE);
                        lineC117b.setVisibility(View.VISIBLE);
                        secC117c.setVisibility(View.VISIBLE);
                        lineC117c.setVisibility(View.VISIBLE);
                        secC117d.setVisibility(View.VISIBLE);
                        lineC117d.setVisibility(View.VISIBLE);
                        secC117e.setVisibility(View.VISIBLE);
                        lineC117e.setVisibility(View.VISIBLE);
                      //  secC117eX.setVisibility(View.VISIBLE);
                      //  lineC117eX.setVisibility(View.VISIBLE);
                        secC117f.setVisibility(View.VISIBLE);
                        lineC117f.setVisibility(View.VISIBLE);
                        secC118d.setVisibility(View.VISIBLE);
                        lineC118d.setVisibility(View.VISIBLE);
                        secC118m.setVisibility(View.VISIBLE);
                        lineC118m.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secC116 = (LinearLayout) findViewById(R.id.secC116);
            lineC116 = (View) findViewById(R.id.lineC116);
            VlblC116 = (TextView) findViewById(R.id.VlblC116);
            txtC116 = (EditText) findViewById(R.id.txtC116);

            seclblC117 = (LinearLayout) findViewById(R.id.seclblC117);
            seclblC117.setVisibility(View.GONE);
            secC117a = (LinearLayout) findViewById(R.id.secC117a);
            lineC117a = (View) findViewById(R.id.lineC117a);
            VlblC117a = (TextView) findViewById(R.id.VlblC117a);
            chkC117a = (CheckBox) findViewById(R.id.chkC117a);
            secC117b = (LinearLayout) findViewById(R.id.secC117b);
            lineC117b = (View) findViewById(R.id.lineC117b);
            VlblC117b = (TextView) findViewById(R.id.VlblC117b);
            chkC117b = (CheckBox) findViewById(R.id.chkC117b);
            secC117c = (LinearLayout) findViewById(R.id.secC117c);
            lineC117c = (View) findViewById(R.id.lineC117c);
            VlblC117c = (TextView) findViewById(R.id.VlblC117c);
            chkC117c = (CheckBox) findViewById(R.id.chkC117c);
            secC117d = (LinearLayout) findViewById(R.id.secC117d);
            lineC117d = (View) findViewById(R.id.lineC117d);
            VlblC117d = (TextView) findViewById(R.id.VlblC117d);
            chkC117d = (CheckBox) findViewById(R.id.chkC117d);
            secC117e = (LinearLayout) findViewById(R.id.secC117e);
            lineC117e = (View) findViewById(R.id.lineC117e);
            VlblC117e = (TextView) findViewById(R.id.VlblC117e);
            chkC117e = (CheckBox) findViewById(R.id.chkC117e);
            chkC117e.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {
                        secC117eX.setVisibility(View.GONE);
                        lineC117eX.setVisibility(View.GONE);
                        txtC117eX.setText("");

                    }
                    else
                    {
                        secC117eX.setVisibility(View.VISIBLE);
                        lineC117eX.setVisibility(View.VISIBLE);
                    }
                }
            });
            secC117eX = (LinearLayout) findViewById(R.id.secC117eX);
            lineC117eX = (View) findViewById(R.id.lineC117eX);
            VlblC117eX = (TextView) findViewById(R.id.VlblC117eX);
            txtC117eX = (EditText) findViewById(R.id.txtC117eX);
            secC117f = (LinearLayout) findViewById(R.id.secC117f);
            lineC117f = (View) findViewById(R.id.lineC117f);
            VlblC117f = (TextView) findViewById(R.id.VlblC117f);
            chkC117f = (CheckBox) findViewById(R.id.chkC117f);
            secC118d = (LinearLayout) findViewById(R.id.secC118d);
            lineC118d = (View) findViewById(R.id.lineC118d);
            VlblC118d = (TextView) findViewById(R.id.VlblC118d);
            txtC118d = (EditText) findViewById(R.id.txtC118d);
            secC118m = (LinearLayout) findViewById(R.id.secC118m);
            lineC118m = (View) findViewById(R.id.lineC118m);
            VlblC118m = (TextView) findViewById(R.id.VlblC118m);
            txtC118m = (EditText) findViewById(R.id.txtC118m);
            seclblC119 = (LinearLayout) findViewById(R.id.seclblC119);
            secC119 = (LinearLayout) findViewById(R.id.secC119);
            lineC119 = (View) findViewById(R.id.lineC119);
            VlblC119 = (TextView) findViewById(R.id.VlblC119);
            rdogrpC119 = (RadioGroup) findViewById(R.id.rdogrpC119);

            rdoC1191 = (RadioButton) findViewById(R.id.rdoC1191);
            rdoC1192 = (RadioButton) findViewById(R.id.rdoC1192);
            rdoC1193 = (RadioButton) findViewById(R.id.rdoC1193);
            seclblC120 = (LinearLayout) findViewById(R.id.seclblC120);
            secC120 = (LinearLayout) findViewById(R.id.secC120);
            lineC120 = (View) findViewById(R.id.lineC120);
            VlblC120 = (TextView) findViewById(R.id.VlblC120);
            rdogrpC120 = (RadioGroup) findViewById(R.id.rdogrpC120);

            rdoC1201 = (RadioButton) findViewById(R.id.rdoC1201);
            rdoC1202 = (RadioButton) findViewById(R.id.rdoC1202);
            rdoC1203 = (RadioButton) findViewById(R.id.rdoC1203);
            seclblC121 = (LinearLayout) findViewById(R.id.seclblC121);
            secC121a = (LinearLayout) findViewById(R.id.secC121a);
            lineC121a = (View) findViewById(R.id.lineC121a);
            VlblC121a = (TextView) findViewById(R.id.VlblC121a);
            rdogrpC121a = (RadioGroup) findViewById(R.id.rdogrpC121a);

            rdoC121a1 = (RadioButton) findViewById(R.id.rdoC121a1);
            rdoC121a2 = (RadioButton) findViewById(R.id.rdoC121a2);
            rdoC121a3 = (RadioButton) findViewById(R.id.rdoC121a3);
            secC121b = (LinearLayout) findViewById(R.id.secC121b);
            lineC121b = (View) findViewById(R.id.lineC121b);
            VlblC121b = (TextView) findViewById(R.id.VlblC121b);
            rdogrpC121b = (RadioGroup) findViewById(R.id.rdogrpC121b);

            rdoC121b1 = (RadioButton) findViewById(R.id.rdoC121b1);
            rdoC121b2 = (RadioButton) findViewById(R.id.rdoC121b2);
            rdoC121b3 = (RadioButton) findViewById(R.id.rdoC121b3);
            rdogrpC121b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpC121b = new String[]{"1", "0", "8"};
                    for (int i = 0; i < rdogrpC121b.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpC121b.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpC121b[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secC121b1.setVisibility(View.GONE);
                        lineC121b1.setVisibility(View.GONE);
                        txtC121b1.setText("");
                    } else if (rbData.equalsIgnoreCase("8")) {
                        secC121b1.setVisibility(View.GONE);
                        lineC121b1.setVisibility(View.GONE);
                        txtC121b1.setText("");
                    } else {
                        secC121b1.setVisibility(View.VISIBLE);
                        lineC121b1.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secC121b1 = (LinearLayout) findViewById(R.id.secC121b1);
            lineC121b1 = (View) findViewById(R.id.lineC121b1);
            VlblC121b1 = (TextView) findViewById(R.id.VlblC121b1);
            txtC121b1 = (EditText) findViewById(R.id.txtC121b1);
            secC121c = (LinearLayout) findViewById(R.id.secC121c);
            lineC121c = (View) findViewById(R.id.lineC121c);
            VlblC121c = (TextView) findViewById(R.id.VlblC121c);
            rdogrpC121c = (RadioGroup) findViewById(R.id.rdogrpC121c);

            rdoC121c1 = (RadioButton) findViewById(R.id.rdoC121c1);
            rdoC121c2 = (RadioButton) findViewById(R.id.rdoC121c2);
            rdoC121c3 = (RadioButton) findViewById(R.id.rdoC121c3);
            rdogrpC121c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpC121c = new String[]{"1", "0", "8"};
                    for (int i = 0; i < rdogrpC121c.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpC121c.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpC121c[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secC121c1.setVisibility(View.GONE);
                        lineC121c1.setVisibility(View.GONE);
                        txtC121c1.setText("");
                    } else if (rbData.equalsIgnoreCase("8")) {
                        secC121c1.setVisibility(View.GONE);
                        lineC121c1.setVisibility(View.GONE);
                        txtC121c1.setText("");
                    } else {
                        secC121c1.setVisibility(View.VISIBLE);
                        lineC121c1.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secC121c1 = (LinearLayout) findViewById(R.id.secC121c1);
            lineC121c1 = (View) findViewById(R.id.lineC121c1);
            VlblC121c1 = (TextView) findViewById(R.id.VlblC121c1);
            txtC121c1 = (EditText) findViewById(R.id.txtC121c1);
            secC121d = (LinearLayout) findViewById(R.id.secC121d);
            lineC121d = (View) findViewById(R.id.lineC121d);
            VlblC121d = (TextView) findViewById(R.id.VlblC121d);
            rdogrpC121d = (RadioGroup) findViewById(R.id.rdogrpC121d);

            rdoC121d1 = (RadioButton) findViewById(R.id.rdoC121d1);
            rdoC121d2 = (RadioButton) findViewById(R.id.rdoC121d2);
            rdoC121d3 = (RadioButton) findViewById(R.id.rdoC121d3);
            secC121e = (LinearLayout) findViewById(R.id.secC121e);
            lineC121e = (View) findViewById(R.id.lineC121e);
            VlblC121e = (TextView) findViewById(R.id.VlblC121e);
            rdogrpC121e = (RadioGroup) findViewById(R.id.rdogrpC121e);

            rdoC121e1 = (RadioButton) findViewById(R.id.rdoC121e1);
            rdoC121e2 = (RadioButton) findViewById(R.id.rdoC121e2);
            rdoC121e3 = (RadioButton) findViewById(R.id.rdoC121e3);
            secC121f = (LinearLayout) findViewById(R.id.secC121f);
            lineC121f = (View) findViewById(R.id.lineC121f);
            VlblC121f = (TextView) findViewById(R.id.VlblC121f);
            rdogrpC121f = (RadioGroup) findViewById(R.id.rdogrpC121f);

            rdoC121f1 = (RadioButton) findViewById(R.id.rdoC121f1);
            rdoC121f2 = (RadioButton) findViewById(R.id.rdoC121f2);
            rdoC121f3 = (RadioButton) findViewById(R.id.rdoC121f3);
            rdogrpC121f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpC121f = new String[]{"1", "0", "8"};
                    for (int i = 0; i < rdogrpC121f.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpC121f.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpC121f[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secC121f1.setVisibility(View.GONE);
                        lineC121f1.setVisibility(View.GONE);
                        txtC121f1.setText("");
                    } else if (rbData.equalsIgnoreCase("8")) {
                        secC121f1.setVisibility(View.GONE);
                        lineC121f1.setVisibility(View.GONE);
                        txtC121f1.setText("");
                    } else {
                        secC121f1.setVisibility(View.VISIBLE);
                        lineC121f1.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secC121f1 = (LinearLayout) findViewById(R.id.secC121f1);
            lineC121f1 = (View) findViewById(R.id.lineC121f1);
            VlblC121f1 = (TextView) findViewById(R.id.VlblC121f1);
            txtC121f1 = (EditText) findViewById(R.id.txtC121f1);
            secC121g = (LinearLayout) findViewById(R.id.secC121g);
            lineC121g = (View) findViewById(R.id.lineC121g);
            VlblC121g = (TextView) findViewById(R.id.VlblC121g);
            rdogrpC121g = (RadioGroup) findViewById(R.id.rdogrpC121g);

            rdoC121g1 = (RadioButton) findViewById(R.id.rdoC121g1);
            rdoC121g2 = (RadioButton) findViewById(R.id.rdoC121g2);
            rdoC121g3 = (RadioButton) findViewById(R.id.rdoC121g3);
            secC121h = (LinearLayout) findViewById(R.id.secC121h);
            lineC121h = (View) findViewById(R.id.lineC121h);
            VlblC121h = (TextView) findViewById(R.id.VlblC121h);
            rdogrpC121h = (RadioGroup) findViewById(R.id.rdogrpC121h);

            rdoC121h1 = (RadioButton) findViewById(R.id.rdoC121h1);
            rdoC121h2 = (RadioButton) findViewById(R.id.rdoC121h2);
            rdoC121h3 = (RadioButton) findViewById(R.id.rdoC121h3);
            secC121i = (LinearLayout) findViewById(R.id.secC121i);
            lineC121i = (View) findViewById(R.id.lineC121i);
            VlblC121i = (TextView) findViewById(R.id.VlblC121i);
            rdogrpC121i = (RadioGroup) findViewById(R.id.rdogrpC121i);

            rdoC121i1 = (RadioButton) findViewById(R.id.rdoC121i1);
            rdoC121i2 = (RadioButton) findViewById(R.id.rdoC121i2);
            rdoC121i3 = (RadioButton) findViewById(R.id.rdoC121i3);
            rdogrpC121i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpC121i = new String[]{"1", "0", "8"};
                    for (int i = 0; i < rdogrpC121i.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpC121i.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpC121i[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secC121iX.setVisibility(View.GONE);
                        lineC121iX.setVisibility(View.GONE);
                        txtC121iX.setText("");
                    } else if (rbData.equalsIgnoreCase("8")) {
                        secC121iX.setVisibility(View.GONE);
                        lineC121iX.setVisibility(View.GONE);
                        txtC121iX.setText("");
                    } else {
                        secC121iX.setVisibility(View.VISIBLE);
                        lineC121iX.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secC121iX = (LinearLayout) findViewById(R.id.secC121iX);
            lineC121iX = (View) findViewById(R.id.lineC121iX);
            VlblC121iX = (TextView) findViewById(R.id.VlblC121iX);
            txtC121iX = (EditText) findViewById(R.id.txtC121iX);
            secC122 = (LinearLayout) findViewById(R.id.secC122);
            lineC122 = (View) findViewById(R.id.lineC122);
            VlblC122 = (TextView) findViewById(R.id.VlblC122);
            rdogrpC122 = (RadioGroup) findViewById(R.id.rdogrpC122);

            rdoC1221 = (RadioButton) findViewById(R.id.rdoC1221);
            rdoC1222 = (RadioButton) findViewById(R.id.rdoC1222);
            rdoC1223 = (RadioButton) findViewById(R.id.rdoC1223);
            secC123 = (LinearLayout) findViewById(R.id.secC123);
            lineC123 = (View) findViewById(R.id.lineC123);
            VlblC123 = (TextView) findViewById(R.id.VlblC123);
            rdogrpC123 = (RadioGroup) findViewById(R.id.rdogrpC123);

            rdoC1231 = (RadioButton) findViewById(R.id.rdoC1231);
            rdoC1232 = (RadioButton) findViewById(R.id.rdoC1232);
            rdoC1233 = (RadioButton) findViewById(R.id.rdoC1233);
            secC124 = (LinearLayout) findViewById(R.id.secC124);
            lineC124 = (View) findViewById(R.id.lineC124);
            VlblC124 = (TextView) findViewById(R.id.VlblC124);
            rdogrpC124 = (RadioGroup) findViewById(R.id.rdogrpC124);

            rdoC1241 = (RadioButton) findViewById(R.id.rdoC1241);
            rdoC1242 = (RadioButton) findViewById(R.id.rdoC1242);
            rdogrpC124.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpC124 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpC124.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpC124.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpC124[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secC125.setVisibility(View.GONE);
                        lineC125.setVisibility(View.GONE);
                        txtC125.setText("");
                        seclblC126.setVisibility(View.GONE);
                        seclblC126a.setVisibility(View.GONE);
                        secC126a.setVisibility(View.GONE);
                        lineC126a.setVisibility(View.GONE);
                        rdogrpC126a.clearCheck();
                        secC126b.setVisibility(View.GONE);
                        lineC126b.setVisibility(View.GONE);
                        rdogrpC126b.clearCheck();
                        secC126c.setVisibility(View.GONE);
                        lineC126c.setVisibility(View.GONE);
                        rdogrpC126c.clearCheck();
                        secC126d.setVisibility(View.GONE);
                        lineC126d.setVisibility(View.GONE);
                        rdogrpC126d.clearCheck();
                        secC126e.setVisibility(View.GONE);
                        lineC126e.setVisibility(View.GONE);
                        rdogrpC126e.clearCheck();
                        secC126f.setVisibility(View.GONE);
                        lineC126f.setVisibility(View.GONE);
                        rdogrpC126f.clearCheck();
                        secC126g.setVisibility(View.GONE);
                        lineC126g.setVisibility(View.GONE);
                        rdogrpC126g.clearCheck();
                        secC126h.setVisibility(View.GONE);
                        lineC126h.setVisibility(View.GONE);
                        rdogrpC126h.clearCheck();
                        secC126i.setVisibility(View.GONE);
                        lineC126i.setVisibility(View.GONE);
                        rdogrpC126i.clearCheck();
                        secC126j.setVisibility(View.GONE);
                        lineC126j.setVisibility(View.GONE);
                        rdogrpC126j.clearCheck();
                        secC126k.setVisibility(View.GONE);
                        lineC126k.setVisibility(View.GONE);
                        rdogrpC126k.clearCheck();
                        secC126l.setVisibility(View.GONE);
                        lineC126l.setVisibility(View.GONE);
                        rdogrpC126l.clearCheck();
                        secC126m.setVisibility(View.GONE);
                        lineC126m.setVisibility(View.GONE);
                        rdogrpC126m.clearCheck();
                        secC126n.setVisibility(View.GONE);
                        lineC126n.setVisibility(View.GONE);
                        rdogrpC126n.clearCheck();
                        secC126o.setVisibility(View.GONE);
                        lineC126o.setVisibility(View.GONE);
                        rdogrpC126o.clearCheck();
                        secC126q.setVisibility(View.GONE);
                        lineC126q.setVisibility(View.GONE);
                        rdogrpC126q.clearCheck();
                        secC126r.setVisibility(View.GONE);
                        lineC126r.setVisibility(View.GONE);
                        rdogrpC126r.clearCheck();
                    /*    secC129.setVisibility(View.GONE);
                        lineC129.setVisibility(View.GONE);
                        rdogrpC129.clearCheck();
                        secC130.setVisibility(View.GONE);
                        lineC130.setVisibility(View.GONE);
                        rdogrpC130.clearCheck();
                        secC131.setVisibility(View.GONE);
                        lineC131.setVisibility(View.GONE);
                        rdogrpC131.clearCheck();
                        secC134.setVisibility(View.GONE);
                        lineC134.setVisibility(View.GONE);
                        rdogrpC134.clearCheck();
                        secC135a.setVisibility(View.GONE);
                        lineC135a.setVisibility(View.GONE);
                        chkC135a.setChecked(false);
                        secC135b.setVisibility(View.GONE);
                        lineC135b.setVisibility(View.GONE);
                        chkC135b.setChecked(false);
                        secC135c.setVisibility(View.GONE);
                        lineC135c.setVisibility(View.GONE);
                        chkC135c.setChecked(false);
                        secC135d.setVisibility(View.GONE);
                        lineC135d.setVisibility(View.GONE);
                        chkC135d.setChecked(false);
                        secC135e.setVisibility(View.GONE);
                        lineC135e.setVisibility(View.GONE);
                        chkC135e.setChecked(false);
                        secC135eX.setVisibility(View.GONE);
                        lineC135eX.setVisibility(View.GONE);
                        txtC135eX.setText("");
                        secC136.setVisibility(View.GONE);
                        lineC136.setVisibility(View.GONE);
                        rdogrpC136.clearCheck();
                        secC137a.setVisibility(View.GONE);
                        lineC137a.setVisibility(View.GONE);
                        chkC137a.setChecked(false);
                        secC137b.setVisibility(View.GONE);
                        lineC137b.setVisibility(View.GONE);
                        chkC137b.setChecked(false);
                        secC137c.setVisibility(View.GONE);
                        lineC137c.setVisibility(View.GONE);
                        chkC137c.setChecked(false);
                        secC137d.setVisibility(View.GONE);
                        lineC137d.setVisibility(View.GONE);
                        chkC137d.setChecked(false);
                        secC137e.setVisibility(View.GONE);
                        lineC137e.setVisibility(View.GONE);
                        chkC137e.setChecked(false);
                        secC137f.setVisibility(View.GONE);
                        lineC137f.setVisibility(View.GONE);
                        chkC137f.setChecked(false);
                        secC137g.setVisibility(View.GONE);
                        lineC137g.setVisibility(View.GONE);
                        chkC137g.setChecked(false);
                        secC137h.setVisibility(View.GONE);
                        lineC137h.setVisibility(View.GONE);
                        chkC137h.setChecked(false);
                        secC137i.setVisibility(View.GONE);
                        lineC137i.setVisibility(View.GONE);
                        chkC137i.setChecked(false);
                        secC137j.setVisibility(View.GONE);
                        lineC137j.setVisibility(View.GONE);
                        chkC137j.setChecked(false);
                        secC137k.setVisibility(View.GONE);
                        lineC137k.setVisibility(View.GONE);
                        chkC137k.setChecked(false);
                        secC137l.setVisibility(View.GONE);
                        lineC137l.setVisibility(View.GONE);
                        chkC137l.setChecked(false);
                        secC137m.setVisibility(View.GONE);
                        lineC137m.setVisibility(View.GONE);
                        chkC137m.setChecked(false);
                        secC137mX.setVisibility(View.GONE);
                        lineC137mX.setVisibility(View.GONE);
                        txtC137mX.setText("");
                        secC138.setVisibility(View.GONE);
                        lineC138.setVisibility(View.GONE);
                        rdogrpC138.clearCheck();
                        secC139.setVisibility(View.GONE);
                        lineC139.setVisibility(View.GONE);
                        rdogrpC139.clearCheck();
                        secBCG1.setVisibility(View.GONE);
                        lineBCG1.setVisibility(View.GONE);
                        rdogrpBCG1.clearCheck();
                        secBCG2.setVisibility(View.GONE);
                        lineBCG2.setVisibility(View.GONE);
                        rdogrpBCG2.clearCheck();
                        secPenta1.setVisibility(View.GONE);
                        linePenta1.setVisibility(View.GONE);
                        rdogrpPenta1.clearCheck();
                        secPenta2.setVisibility(View.GONE);
                        linePenta2.setVisibility(View.GONE);
                        rdogrpPenta2.clearCheck();
                        secPenta3.setVisibility(View.GONE);
                        linePenta3.setVisibility(View.GONE);
                        rdogrpPenta3.clearCheck();
                        secOPV1.setVisibility(View.GONE);
                        lineOPV1.setVisibility(View.GONE);
                        rdogrpOPV1.clearCheck();
                        secOPV2.setVisibility(View.GONE);
                        lineOPV2.setVisibility(View.GONE);
                        rdogrpOPV2.clearCheck();
                        secOPV3.setVisibility(View.GONE);
                        lineOPV3.setVisibility(View.GONE);
                        rdogrpOPV3.clearCheck();
                        secPCV1.setVisibility(View.GONE);
                        linePCV1.setVisibility(View.GONE);
                        rdogrpPCV1.clearCheck();
                        secPCV2.setVisibility(View.GONE);
                        linePCV2.setVisibility(View.GONE);
                        rdogrpPCV2.clearCheck();
                        secPCV3.setVisibility(View.GONE);
                        linePCV3.setVisibility(View.GONE);
                        rdogrpPCV3.clearCheck();
                        secIPV.setVisibility(View.GONE);
                        lineIPV.setVisibility(View.GONE);
                        rdogrpIPV.clearCheck();
                        secMR1.setVisibility(View.GONE);
                        lineMR1.setVisibility(View.GONE);
                        rdogrpMR1.clearCheck();
                        secMR2.setVisibility(View.GONE);
                        lineMR2.setVisibility(View.GONE);
                        rdogrpMR2.clearCheck();
                        secC140.setVisibility(View.GONE);
                        lineC140.setVisibility(View.GONE);
                        rdogrpC140.clearCheck();
                        secC141.setVisibility(View.GONE);
                        lineC141.setVisibility(View.GONE);
                        spnC141.setSelection(0);
                        secC141X.setVisibility(View.GONE);
                        lineC141X.setVisibility(View.GONE);
                        txtC141X.setText("");
                        secC142a.setVisibility(View.GONE);
                        lineC142a.setVisibility(View.GONE);
                        chkC142a.setChecked(false);
                        secC142b.setVisibility(View.GONE);
                        lineC142b.setVisibility(View.GONE);
                        chkC142b.setChecked(false);
                        secC142c.setVisibility(View.GONE);
                        lineC142c.setVisibility(View.GONE);
                        chkC142c.setChecked(false);
                        secC142d.setVisibility(View.GONE);
                        lineC142d.setVisibility(View.GONE);
                        chkC142d.setChecked(false);
                        secC142e.setVisibility(View.GONE);
                        lineC142e.setVisibility(View.GONE);
                        chkC142e.setChecked(false);*/
                    } else {
                        secC125.setVisibility(View.VISIBLE);
                        lineC125.setVisibility(View.VISIBLE);
                        secC126a.setVisibility(View.VISIBLE);
                        lineC126a.setVisibility(View.VISIBLE);
                        secC126b.setVisibility(View.VISIBLE);
                        lineC126b.setVisibility(View.VISIBLE);
                        secC126c.setVisibility(View.VISIBLE);
                        lineC126c.setVisibility(View.VISIBLE);
                        secC126d.setVisibility(View.VISIBLE);
                        lineC126d.setVisibility(View.VISIBLE);
                        secC126e.setVisibility(View.VISIBLE);
                        lineC126e.setVisibility(View.VISIBLE);
                        secC126f.setVisibility(View.VISIBLE);
                        lineC126f.setVisibility(View.VISIBLE);
                        secC126g.setVisibility(View.VISIBLE);
                        lineC126g.setVisibility(View.VISIBLE);
                        secC126h.setVisibility(View.VISIBLE);
                        lineC126h.setVisibility(View.VISIBLE);
                        secC126i.setVisibility(View.VISIBLE);
                        lineC126i.setVisibility(View.VISIBLE);
                        secC126j.setVisibility(View.VISIBLE);
                        lineC126j.setVisibility(View.VISIBLE);
                        secC126k.setVisibility(View.VISIBLE);
                        lineC126k.setVisibility(View.VISIBLE);
                        secC126l.setVisibility(View.VISIBLE);
                        lineC126l.setVisibility(View.VISIBLE);
                        secC126m.setVisibility(View.VISIBLE);
                        lineC126m.setVisibility(View.VISIBLE);
                        secC126n.setVisibility(View.VISIBLE);
                        lineC126n.setVisibility(View.VISIBLE);
                        secC126o.setVisibility(View.VISIBLE);
                        lineC126o.setVisibility(View.VISIBLE);
                        secC126q.setVisibility(View.VISIBLE);
                        lineC126q.setVisibility(View.VISIBLE);
                        secC126r.setVisibility(View.VISIBLE);
                        lineC126r.setVisibility(View.VISIBLE);
                      /*  secC129.setVisibility(View.VISIBLE);
                        lineC129.setVisibility(View.VISIBLE);
                        secC130.setVisibility(View.VISIBLE);
                        lineC130.setVisibility(View.VISIBLE);
                        secC131.setVisibility(View.VISIBLE);
                        lineC131.setVisibility(View.VISIBLE);
                        secC134.setVisibility(View.VISIBLE);
                        lineC134.setVisibility(View.VISIBLE);
                        secC135a.setVisibility(View.VISIBLE);
                        lineC135a.setVisibility(View.VISIBLE);
                        secC135b.setVisibility(View.VISIBLE);
                        lineC135b.setVisibility(View.VISIBLE);
                        secC135c.setVisibility(View.VISIBLE);
                        lineC135c.setVisibility(View.VISIBLE);
                        secC135d.setVisibility(View.VISIBLE);
                        lineC135d.setVisibility(View.VISIBLE);
                        secC135e.setVisibility(View.VISIBLE);
                        lineC135e.setVisibility(View.VISIBLE);
                        secC135eX.setVisibility(View.VISIBLE);
                        lineC135eX.setVisibility(View.VISIBLE);
                        secC136.setVisibility(View.VISIBLE);
                        lineC136.setVisibility(View.VISIBLE);
                        secC137a.setVisibility(View.VISIBLE);
                        lineC137a.setVisibility(View.VISIBLE);
                        secC137b.setVisibility(View.VISIBLE);
                        lineC137b.setVisibility(View.VISIBLE);
                        secC137c.setVisibility(View.VISIBLE);
                        lineC137c.setVisibility(View.VISIBLE);
                        secC137d.setVisibility(View.VISIBLE);
                        lineC137d.setVisibility(View.VISIBLE);
                        secC137e.setVisibility(View.VISIBLE);
                        lineC137e.setVisibility(View.VISIBLE);
                        secC137f.setVisibility(View.VISIBLE);
                        lineC137f.setVisibility(View.VISIBLE);
                        secC137g.setVisibility(View.VISIBLE);
                        lineC137g.setVisibility(View.VISIBLE);
                        secC137h.setVisibility(View.VISIBLE);
                        lineC137h.setVisibility(View.VISIBLE);
                        secC137i.setVisibility(View.VISIBLE);
                        lineC137i.setVisibility(View.VISIBLE);
                        secC137j.setVisibility(View.VISIBLE);
                        lineC137j.setVisibility(View.VISIBLE);
                        secC137k.setVisibility(View.VISIBLE);
                        lineC137k.setVisibility(View.VISIBLE);
                        secC137l.setVisibility(View.VISIBLE);
                        lineC137l.setVisibility(View.VISIBLE);
                        secC137m.setVisibility(View.VISIBLE);
                        lineC137m.setVisibility(View.VISIBLE);
                        secC137mX.setVisibility(View.VISIBLE);
                        lineC137mX.setVisibility(View.VISIBLE);
                        secC138.setVisibility(View.VISIBLE);
                        lineC138.setVisibility(View.VISIBLE);
                        secC139.setVisibility(View.VISIBLE);
                        lineC139.setVisibility(View.VISIBLE);
                        secBCG1.setVisibility(View.VISIBLE);
                        lineBCG1.setVisibility(View.VISIBLE);
                        secBCG2.setVisibility(View.VISIBLE);
                        lineBCG2.setVisibility(View.VISIBLE);
                        secPenta1.setVisibility(View.VISIBLE);
                        linePenta1.setVisibility(View.VISIBLE);
                        secPenta2.setVisibility(View.VISIBLE);
                        linePenta2.setVisibility(View.VISIBLE);
                        secPenta3.setVisibility(View.VISIBLE);
                        linePenta3.setVisibility(View.VISIBLE);
                        secOPV1.setVisibility(View.VISIBLE);
                        lineOPV1.setVisibility(View.VISIBLE);
                        secOPV2.setVisibility(View.VISIBLE);
                        lineOPV2.setVisibility(View.VISIBLE);
                        secOPV3.setVisibility(View.VISIBLE);
                        lineOPV3.setVisibility(View.VISIBLE);
                        secPCV1.setVisibility(View.VISIBLE);
                        linePCV1.setVisibility(View.VISIBLE);
                        secPCV2.setVisibility(View.VISIBLE);
                        linePCV2.setVisibility(View.VISIBLE);
                        secPCV3.setVisibility(View.VISIBLE);
                        linePCV3.setVisibility(View.VISIBLE);
                        secIPV.setVisibility(View.VISIBLE);
                        lineIPV.setVisibility(View.VISIBLE);
                        secMR1.setVisibility(View.VISIBLE);
                        lineMR1.setVisibility(View.VISIBLE);
                        secMR2.setVisibility(View.VISIBLE);
                        lineMR2.setVisibility(View.VISIBLE);
                        secC140.setVisibility(View.VISIBLE);
                        lineC140.setVisibility(View.VISIBLE);
                        secC141.setVisibility(View.VISIBLE);
                        lineC141.setVisibility(View.VISIBLE);
                        secC141X.setVisibility(View.VISIBLE);
                        lineC141X.setVisibility(View.VISIBLE);
                        secC142a.setVisibility(View.VISIBLE);
                        lineC142a.setVisibility(View.VISIBLE);
                        secC142b.setVisibility(View.VISIBLE);
                        lineC142b.setVisibility(View.VISIBLE);
                        secC142c.setVisibility(View.VISIBLE);
                        lineC142c.setVisibility(View.VISIBLE);
                        secC142d.setVisibility(View.VISIBLE);
                        lineC142d.setVisibility(View.VISIBLE);
                        secC142e.setVisibility(View.VISIBLE);
                        lineC142e.setVisibility(View.VISIBLE);*/
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secC125 = (LinearLayout) findViewById(R.id.secC125);
            lineC125 = (View) findViewById(R.id.lineC125);
            VlblC125 = (TextView) findViewById(R.id.VlblC125);
            txtC125 = (EditText) findViewById(R.id.txtC125);
            seclblC126 = (LinearLayout) findViewById(R.id.seclblC126);
            seclblC126.setVisibility(View.GONE);

            seclblC126a = (LinearLayout) findViewById(R.id.seclblC126a);
            seclblC126a.setVisibility(View.GONE);
            secC126a = (LinearLayout) findViewById(R.id.secC126a);
            lineC126a = (View) findViewById(R.id.lineC126a);
            VlblC126a = (TextView) findViewById(R.id.VlblC126a);
            rdogrpC126a = (RadioGroup) findViewById(R.id.rdogrpC126a);

            rdoC126a1 = (RadioButton) findViewById(R.id.rdoC126a1);
            rdoC126a2 = (RadioButton) findViewById(R.id.rdoC126a2);
            rdoC126a3 = (RadioButton) findViewById(R.id.rdoC126a3);
            secC126b = (LinearLayout) findViewById(R.id.secC126b);
            lineC126b = (View) findViewById(R.id.lineC126b);
            VlblC126b = (TextView) findViewById(R.id.VlblC126b);
            rdogrpC126b = (RadioGroup) findViewById(R.id.rdogrpC126b);

            rdoC126b1 = (RadioButton) findViewById(R.id.rdoC126b1);
            rdoC126b2 = (RadioButton) findViewById(R.id.rdoC126b2);
            rdoC126b3 = (RadioButton) findViewById(R.id.rdoC126b3);
            secC126c = (LinearLayout) findViewById(R.id.secC126c);
            lineC126c = (View) findViewById(R.id.lineC126c);
            VlblC126c = (TextView) findViewById(R.id.VlblC126c);
            rdogrpC126c = (RadioGroup) findViewById(R.id.rdogrpC126c);

            rdoC126c1 = (RadioButton) findViewById(R.id.rdoC126c1);
            rdoC126c2 = (RadioButton) findViewById(R.id.rdoC126c2);
            rdoC126c3 = (RadioButton) findViewById(R.id.rdoC126c3);
            secC126d = (LinearLayout) findViewById(R.id.secC126d);
            lineC126d = (View) findViewById(R.id.lineC126d);
            VlblC126d = (TextView) findViewById(R.id.VlblC126d);
            rdogrpC126d = (RadioGroup) findViewById(R.id.rdogrpC126d);

            rdoC126d1 = (RadioButton) findViewById(R.id.rdoC126d1);
            rdoC126d2 = (RadioButton) findViewById(R.id.rdoC126d2);
            rdoC126d3 = (RadioButton) findViewById(R.id.rdoC126d3);
            secC126e = (LinearLayout) findViewById(R.id.secC126e);
            lineC126e = (View) findViewById(R.id.lineC126e);
            VlblC126e = (TextView) findViewById(R.id.VlblC126e);
            rdogrpC126e = (RadioGroup) findViewById(R.id.rdogrpC126e);

            rdoC126e1 = (RadioButton) findViewById(R.id.rdoC126e1);
            rdoC126e2 = (RadioButton) findViewById(R.id.rdoC126e2);
            rdoC126e3 = (RadioButton) findViewById(R.id.rdoC126e3);
            secC126f = (LinearLayout) findViewById(R.id.secC126f);
            lineC126f = (View) findViewById(R.id.lineC126f);
            VlblC126f = (TextView) findViewById(R.id.VlblC126f);
            rdogrpC126f = (RadioGroup) findViewById(R.id.rdogrpC126f);

            rdoC126f1 = (RadioButton) findViewById(R.id.rdoC126f1);
            rdoC126f2 = (RadioButton) findViewById(R.id.rdoC126f2);
            rdoC126f3 = (RadioButton) findViewById(R.id.rdoC126f3);
            secC126g = (LinearLayout) findViewById(R.id.secC126g);
            lineC126g = (View) findViewById(R.id.lineC126g);
            VlblC126g = (TextView) findViewById(R.id.VlblC126g);
            rdogrpC126g = (RadioGroup) findViewById(R.id.rdogrpC126g);

            rdoC126g1 = (RadioButton) findViewById(R.id.rdoC126g1);
            rdoC126g2 = (RadioButton) findViewById(R.id.rdoC126g2);
            rdoC126g3 = (RadioButton) findViewById(R.id.rdoC126g3);
            secC126h = (LinearLayout) findViewById(R.id.secC126h);
            lineC126h = (View) findViewById(R.id.lineC126h);
            VlblC126h = (TextView) findViewById(R.id.VlblC126h);
            rdogrpC126h = (RadioGroup) findViewById(R.id.rdogrpC126h);

            rdoC126h1 = (RadioButton) findViewById(R.id.rdoC126h1);
            rdoC126h2 = (RadioButton) findViewById(R.id.rdoC126h2);
            rdoC126h3 = (RadioButton) findViewById(R.id.rdoC126h3);
            secC126i = (LinearLayout) findViewById(R.id.secC126i);
            lineC126i = (View) findViewById(R.id.lineC126i);
            VlblC126i = (TextView) findViewById(R.id.VlblC126i);
            rdogrpC126i = (RadioGroup) findViewById(R.id.rdogrpC126i);

            rdoC126i1 = (RadioButton) findViewById(R.id.rdoC126i1);
            rdoC126i2 = (RadioButton) findViewById(R.id.rdoC126i2);
            rdoC126i3 = (RadioButton) findViewById(R.id.rdoC126i3);
            secC126j = (LinearLayout) findViewById(R.id.secC126j);
            lineC126j = (View) findViewById(R.id.lineC126j);
            VlblC126j = (TextView) findViewById(R.id.VlblC126j);
            rdogrpC126j = (RadioGroup) findViewById(R.id.rdogrpC126j);

            rdoC126j1 = (RadioButton) findViewById(R.id.rdoC126j1);
            rdoC126j2 = (RadioButton) findViewById(R.id.rdoC126j2);
            rdoC126j3 = (RadioButton) findViewById(R.id.rdoC126j3);
            secC126k = (LinearLayout) findViewById(R.id.secC126k);
            lineC126k = (View) findViewById(R.id.lineC126k);
            VlblC126k = (TextView) findViewById(R.id.VlblC126k);
            rdogrpC126k = (RadioGroup) findViewById(R.id.rdogrpC126k);

            rdoC126k1 = (RadioButton) findViewById(R.id.rdoC126k1);
            rdoC126k2 = (RadioButton) findViewById(R.id.rdoC126k2);
            rdoC126k3 = (RadioButton) findViewById(R.id.rdoC126k3);
            secC126l = (LinearLayout) findViewById(R.id.secC126l);
            lineC126l = (View) findViewById(R.id.lineC126l);
            VlblC126l = (TextView) findViewById(R.id.VlblC126l);
            rdogrpC126l = (RadioGroup) findViewById(R.id.rdogrpC126l);

            rdoC126l1 = (RadioButton) findViewById(R.id.rdoC126l1);
            rdoC126l2 = (RadioButton) findViewById(R.id.rdoC126l2);
            rdoC126l3 = (RadioButton) findViewById(R.id.rdoC126l3);
            secC126m = (LinearLayout) findViewById(R.id.secC126m);
            lineC126m = (View) findViewById(R.id.lineC126m);
            VlblC126m = (TextView) findViewById(R.id.VlblC126m);
            rdogrpC126m = (RadioGroup) findViewById(R.id.rdogrpC126m);

            rdoC126m1 = (RadioButton) findViewById(R.id.rdoC126m1);
            rdoC126m2 = (RadioButton) findViewById(R.id.rdoC126m2);
            rdoC126m3 = (RadioButton) findViewById(R.id.rdoC126m3);
            secC126n = (LinearLayout) findViewById(R.id.secC126n);
            lineC126n = (View) findViewById(R.id.lineC126n);
            VlblC126n = (TextView) findViewById(R.id.VlblC126n);
            rdogrpC126n = (RadioGroup) findViewById(R.id.rdogrpC126n);

            rdoC126n1 = (RadioButton) findViewById(R.id.rdoC126n1);
            rdoC126n2 = (RadioButton) findViewById(R.id.rdoC126n2);
            rdoC126n3 = (RadioButton) findViewById(R.id.rdoC126n3);
            secC126o = (LinearLayout) findViewById(R.id.secC126o);
            lineC126o = (View) findViewById(R.id.lineC126o);
            VlblC126o = (TextView) findViewById(R.id.VlblC126o);
            rdogrpC126o = (RadioGroup) findViewById(R.id.rdogrpC126o);

            rdoC126o1 = (RadioButton) findViewById(R.id.rdoC126o1);
            rdoC126o2 = (RadioButton) findViewById(R.id.rdoC126o2);
            rdoC126o3 = (RadioButton) findViewById(R.id.rdoC126o3);
            secC126q = (LinearLayout) findViewById(R.id.secC126q);
            lineC126q = (View) findViewById(R.id.lineC126q);
            VlblC126q = (TextView) findViewById(R.id.VlblC126q);
            rdogrpC126q = (RadioGroup) findViewById(R.id.rdogrpC126q);

            rdoC126q1 = (RadioButton) findViewById(R.id.rdoC126q1);
            rdoC126q2 = (RadioButton) findViewById(R.id.rdoC126q2);
            rdoC126q3 = (RadioButton) findViewById(R.id.rdoC126q3);
            secC126r = (LinearLayout) findViewById(R.id.secC126r);
            lineC126r = (View) findViewById(R.id.lineC126r);
            VlblC126r = (TextView) findViewById(R.id.VlblC126r);
            rdogrpC126r = (RadioGroup) findViewById(R.id.rdogrpC126r);

            rdoC126r1 = (RadioButton) findViewById(R.id.rdoC126r1);
            rdoC126r2 = (RadioButton) findViewById(R.id.rdoC126r2);
            rdoC126r3 = (RadioButton) findViewById(R.id.rdoC126r3);
            secC129 = (LinearLayout) findViewById(R.id.secC129);
            lineC129 = (View) findViewById(R.id.lineC129);
            VlblC129 = (TextView) findViewById(R.id.VlblC129);
            rdogrpC129 = (RadioGroup) findViewById(R.id.rdogrpC129);

            rdoC1291 = (RadioButton) findViewById(R.id.rdoC1291);
            rdoC1292 = (RadioButton) findViewById(R.id.rdoC1292);
            rdoC1293 = (RadioButton) findViewById(R.id.rdoC1293);
            secC130 = (LinearLayout) findViewById(R.id.secC130);
            lineC130 = (View) findViewById(R.id.lineC130);
            VlblC130 = (TextView) findViewById(R.id.VlblC130);
            rdogrpC130 = (RadioGroup) findViewById(R.id.rdogrpC130);

            rdoC1301 = (RadioButton) findViewById(R.id.rdoC1301);
            rdoC1302 = (RadioButton) findViewById(R.id.rdoC1302);
            secC131 = (LinearLayout) findViewById(R.id.secC131);
            lineC131 = (View) findViewById(R.id.lineC131);
            VlblC131 = (TextView) findViewById(R.id.VlblC131);
            rdogrpC131 = (RadioGroup) findViewById(R.id.rdogrpC131);

            rdoC1311 = (RadioButton) findViewById(R.id.rdoC1311);
            rdoC1312 = (RadioButton) findViewById(R.id.rdoC1312);
            secC134 = (LinearLayout) findViewById(R.id.secC134);
            lineC134 = (View) findViewById(R.id.lineC134);
            VlblC134 = (TextView) findViewById(R.id.VlblC134);
            rdogrpC134 = (RadioGroup) findViewById(R.id.rdogrpC134);

            rdoC1341 = (RadioButton) findViewById(R.id.rdoC1341);
            rdoC1342 = (RadioButton) findViewById(R.id.rdoC1342);
            rdogrpC134.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpC134 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpC134.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpC134.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpC134[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secC135a.setVisibility(View.GONE);
                        lineC135a.setVisibility(View.GONE);
                        chkC135a.setChecked(false);
                        secC135b.setVisibility(View.GONE);
                        lineC135b.setVisibility(View.GONE);
                        chkC135b.setChecked(false);
                        secC135c.setVisibility(View.GONE);
                        lineC135c.setVisibility(View.GONE);
                        chkC135c.setChecked(false);
                        secC135d.setVisibility(View.GONE);
                        lineC135d.setVisibility(View.GONE);
                        chkC135d.setChecked(false);
                        secC135e.setVisibility(View.GONE);
                        lineC135e.setVisibility(View.GONE);
                        chkC135e.setChecked(false);
                        secC135eX.setVisibility(View.GONE);
                        lineC135eX.setVisibility(View.GONE);
                        txtC135eX.setText("");
                    } else {
                        secC135a.setVisibility(View.VISIBLE);
                        lineC135a.setVisibility(View.VISIBLE);
                        secC135b.setVisibility(View.VISIBLE);
                        lineC135b.setVisibility(View.VISIBLE);
                        secC135c.setVisibility(View.VISIBLE);
                        lineC135c.setVisibility(View.VISIBLE);
                        secC135d.setVisibility(View.VISIBLE);
                        lineC135d.setVisibility(View.VISIBLE);
                        secC135e.setVisibility(View.VISIBLE);
                        lineC135e.setVisibility(View.VISIBLE);
                      //  secC135eX.setVisibility(View.VISIBLE);
                      //  lineC135eX.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secC135a = (LinearLayout) findViewById(R.id.secC135a);
            lineC135a = (View) findViewById(R.id.lineC135a);
            VlblC135a = (TextView) findViewById(R.id.VlblC135a);
            chkC135a = (CheckBox) findViewById(R.id.chkC135a);
            secC135b = (LinearLayout) findViewById(R.id.secC135b);
            lineC135b = (View) findViewById(R.id.lineC135b);
            VlblC135b = (TextView) findViewById(R.id.VlblC135b);
            chkC135b = (CheckBox) findViewById(R.id.chkC135b);
            secC135c = (LinearLayout) findViewById(R.id.secC135c);
            lineC135c = (View) findViewById(R.id.lineC135c);
            VlblC135c = (TextView) findViewById(R.id.VlblC135c);
            chkC135c = (CheckBox) findViewById(R.id.chkC135c);
            secC135d = (LinearLayout) findViewById(R.id.secC135d);
            lineC135d = (View) findViewById(R.id.lineC135d);
            VlblC135d = (TextView) findViewById(R.id.VlblC135d);
            chkC135d = (CheckBox) findViewById(R.id.chkC135d);
            secC135e = (LinearLayout) findViewById(R.id.secC135e);
            lineC135e = (View) findViewById(R.id.lineC135e);
            VlblC135e = (TextView) findViewById(R.id.VlblC135e);
            chkC135e = (CheckBox) findViewById(R.id.chkC135e);
            chkC135e.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {
                        secC135eX.setVisibility(View.GONE);
                        lineC135eX.setVisibility(View.GONE);
                        txtC135eX.setText("");

                    }
                    else
                    {
                        secC135eX.setVisibility(View.VISIBLE);
                        lineC135eX.setVisibility(View.VISIBLE);
                    }
                }
            });
            secC135eX = (LinearLayout) findViewById(R.id.secC135eX);
            lineC135eX = (View) findViewById(R.id.lineC135eX);
            VlblC135eX = (TextView) findViewById(R.id.VlblC135eX);
            txtC135eX = (EditText) findViewById(R.id.txtC135eX);
            secC136 = (LinearLayout) findViewById(R.id.secC136);
            lineC136 = (View) findViewById(R.id.lineC136);
            VlblC136 = (TextView) findViewById(R.id.VlblC136);
            rdogrpC136 = (RadioGroup) findViewById(R.id.rdogrpC136);

            rdoC1361 = (RadioButton) findViewById(R.id.rdoC1361);
            rdoC1362 = (RadioButton) findViewById(R.id.rdoC1362);
            rdoC1363 = (RadioButton) findViewById(R.id.rdoC1363);
            rdogrpC136.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpC136 = new String[]{"1", "0", "8"};
                    for (int i = 0; i < rdogrpC136.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpC136.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpC136[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        seclblC137.setVisibility(View.GONE);
                        secC137a.setVisibility(View.GONE);
                        lineC137a.setVisibility(View.GONE);
                        chkC137a.setChecked(false);
                        secC137b.setVisibility(View.GONE);
                        lineC137b.setVisibility(View.GONE);
                        chkC137b.setChecked(false);
                        secC137c.setVisibility(View.GONE);
                        lineC137c.setVisibility(View.GONE);
                        chkC137c.setChecked(false);
                        secC137d.setVisibility(View.GONE);
                        lineC137d.setVisibility(View.GONE);
                        chkC137d.setChecked(false);
                        secC137e.setVisibility(View.GONE);
                        lineC137e.setVisibility(View.GONE);
                        chkC137e.setChecked(false);
                        secC137f.setVisibility(View.GONE);
                        lineC137f.setVisibility(View.GONE);
                        chkC137f.setChecked(false);
                        secC137g.setVisibility(View.GONE);
                        lineC137g.setVisibility(View.GONE);
                        chkC137g.setChecked(false);
                        secC137h.setVisibility(View.GONE);
                        lineC137h.setVisibility(View.GONE);
                        chkC137h.setChecked(false);
                        secC137i.setVisibility(View.GONE);
                        lineC137i.setVisibility(View.GONE);
                        chkC137i.setChecked(false);
                        secC137j.setVisibility(View.GONE);
                        lineC137j.setVisibility(View.GONE);
                        chkC137j.setChecked(false);
                        secC137k.setVisibility(View.GONE);
                        lineC137k.setVisibility(View.GONE);
                        chkC137k.setChecked(false);
                        secC137l.setVisibility(View.GONE);
                        lineC137l.setVisibility(View.GONE);
                        chkC137l.setChecked(false);
                        secC137m.setVisibility(View.GONE);
                        lineC137m.setVisibility(View.GONE);
                        chkC137m.setChecked(false);
                        secC137mX.setVisibility(View.GONE);
                        lineC137mX.setVisibility(View.GONE);
                        txtC137mX.setText("");
                    } else if (rbData.equalsIgnoreCase("8")) {
                        seclblC137.setVisibility(View.GONE);
                        secC137a.setVisibility(View.GONE);
                        lineC137a.setVisibility(View.GONE);
                        chkC137a.setChecked(false);
                        secC137b.setVisibility(View.GONE);
                        lineC137b.setVisibility(View.GONE);
                        chkC137b.setChecked(false);
                        secC137c.setVisibility(View.GONE);
                        lineC137c.setVisibility(View.GONE);
                        chkC137c.setChecked(false);
                        secC137d.setVisibility(View.GONE);
                        lineC137d.setVisibility(View.GONE);
                        chkC137d.setChecked(false);
                        secC137e.setVisibility(View.GONE);
                        lineC137e.setVisibility(View.GONE);
                        chkC137e.setChecked(false);
                        secC137f.setVisibility(View.GONE);
                        lineC137f.setVisibility(View.GONE);
                        chkC137f.setChecked(false);
                        secC137g.setVisibility(View.GONE);
                        lineC137g.setVisibility(View.GONE);
                        chkC137g.setChecked(false);
                        secC137h.setVisibility(View.GONE);
                        lineC137h.setVisibility(View.GONE);
                        chkC137h.setChecked(false);
                        secC137i.setVisibility(View.GONE);
                        lineC137i.setVisibility(View.GONE);
                        chkC137i.setChecked(false);
                        secC137j.setVisibility(View.GONE);
                        lineC137j.setVisibility(View.GONE);
                        chkC137j.setChecked(false);
                        secC137k.setVisibility(View.GONE);
                        lineC137k.setVisibility(View.GONE);
                        chkC137k.setChecked(false);
                        secC137l.setVisibility(View.GONE);
                        lineC137l.setVisibility(View.GONE);
                        chkC137l.setChecked(false);
                        secC137m.setVisibility(View.GONE);
                        lineC137m.setVisibility(View.GONE);
                        chkC137m.setChecked(false);
                        secC137mX.setVisibility(View.GONE);
                        lineC137mX.setVisibility(View.GONE);
                        txtC137mX.setText("");
                    } else {
                        seclblC137.setVisibility(View.VISIBLE);
                        secC137a.setVisibility(View.VISIBLE);
                        lineC137a.setVisibility(View.VISIBLE);
                        secC137b.setVisibility(View.VISIBLE);
                        lineC137b.setVisibility(View.VISIBLE);
                        secC137c.setVisibility(View.VISIBLE);
                        lineC137c.setVisibility(View.VISIBLE);
                        secC137d.setVisibility(View.VISIBLE);
                        lineC137d.setVisibility(View.VISIBLE);
                        secC137e.setVisibility(View.VISIBLE);
                        lineC137e.setVisibility(View.VISIBLE);
                        secC137f.setVisibility(View.VISIBLE);
                        lineC137f.setVisibility(View.VISIBLE);
                        secC137g.setVisibility(View.VISIBLE);
                        lineC137g.setVisibility(View.VISIBLE);
                        secC137h.setVisibility(View.VISIBLE);
                        lineC137h.setVisibility(View.VISIBLE);
                        secC137i.setVisibility(View.VISIBLE);
                        lineC137i.setVisibility(View.VISIBLE);
                        secC137j.setVisibility(View.VISIBLE);
                        lineC137j.setVisibility(View.VISIBLE);
                        secC137k.setVisibility(View.VISIBLE);
                        lineC137k.setVisibility(View.VISIBLE);
                        secC137l.setVisibility(View.VISIBLE);
                        lineC137l.setVisibility(View.VISIBLE);
                        secC137m.setVisibility(View.VISIBLE);
                        lineC137m.setVisibility(View.VISIBLE);
                       // secC137mX.setVisibility(View.VISIBLE);
                       // lineC137mX.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            seclblC137 = (LinearLayout) findViewById(R.id.seclblC137);
            seclblC137.setVisibility(View.GONE);
            secC137a = (LinearLayout) findViewById(R.id.secC137a);
            lineC137a = (View) findViewById(R.id.lineC137a);
            VlblC137a = (TextView) findViewById(R.id.VlblC137a);
            chkC137a = (CheckBox) findViewById(R.id.chkC137a);
            secC137b = (LinearLayout) findViewById(R.id.secC137b);
            lineC137b = (View) findViewById(R.id.lineC137b);
            VlblC137b = (TextView) findViewById(R.id.VlblC137b);
            chkC137b = (CheckBox) findViewById(R.id.chkC137b);
            secC137c = (LinearLayout) findViewById(R.id.secC137c);
            lineC137c = (View) findViewById(R.id.lineC137c);
            VlblC137c = (TextView) findViewById(R.id.VlblC137c);
            chkC137c = (CheckBox) findViewById(R.id.chkC137c);
            secC137d = (LinearLayout) findViewById(R.id.secC137d);
            lineC137d = (View) findViewById(R.id.lineC137d);
            VlblC137d = (TextView) findViewById(R.id.VlblC137d);
            chkC137d = (CheckBox) findViewById(R.id.chkC137d);
            secC137e = (LinearLayout) findViewById(R.id.secC137e);
            lineC137e = (View) findViewById(R.id.lineC137e);
            VlblC137e = (TextView) findViewById(R.id.VlblC137e);
            chkC137e = (CheckBox) findViewById(R.id.chkC137e);
            secC137f = (LinearLayout) findViewById(R.id.secC137f);
            lineC137f = (View) findViewById(R.id.lineC137f);
            VlblC137f = (TextView) findViewById(R.id.VlblC137f);
            chkC137f = (CheckBox) findViewById(R.id.chkC137f);
            secC137g = (LinearLayout) findViewById(R.id.secC137g);
            lineC137g = (View) findViewById(R.id.lineC137g);
            VlblC137g = (TextView) findViewById(R.id.VlblC137g);
            chkC137g = (CheckBox) findViewById(R.id.chkC137g);
            secC137h = (LinearLayout) findViewById(R.id.secC137h);
            lineC137h = (View) findViewById(R.id.lineC137h);
            VlblC137h = (TextView) findViewById(R.id.VlblC137h);
            chkC137h = (CheckBox) findViewById(R.id.chkC137h);
            secC137i = (LinearLayout) findViewById(R.id.secC137i);
            lineC137i = (View) findViewById(R.id.lineC137i);
            VlblC137i = (TextView) findViewById(R.id.VlblC137i);
            chkC137i = (CheckBox) findViewById(R.id.chkC137i);
            secC137j = (LinearLayout) findViewById(R.id.secC137j);
            lineC137j = (View) findViewById(R.id.lineC137j);
            VlblC137j = (TextView) findViewById(R.id.VlblC137j);
            chkC137j = (CheckBox) findViewById(R.id.chkC137j);
            secC137k = (LinearLayout) findViewById(R.id.secC137k);
            lineC137k = (View) findViewById(R.id.lineC137k);
            VlblC137k = (TextView) findViewById(R.id.VlblC137k);
            chkC137k = (CheckBox) findViewById(R.id.chkC137k);
            secC137l = (LinearLayout) findViewById(R.id.secC137l);
            lineC137l = (View) findViewById(R.id.lineC137l);
            VlblC137l = (TextView) findViewById(R.id.VlblC137l);
            chkC137l = (CheckBox) findViewById(R.id.chkC137l);
            secC137m = (LinearLayout) findViewById(R.id.secC137m);
            lineC137m = (View) findViewById(R.id.lineC137m);
            VlblC137m = (TextView) findViewById(R.id.VlblC137m);
            chkC137m = (CheckBox) findViewById(R.id.chkC137m);
            chkC137m.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {
                        secC137mX.setVisibility(View.GONE);
                        lineC137mX.setVisibility(View.GONE);
                        txtC137mX.setText("");

                    }
                    else
                    {
                        secC137mX.setVisibility(View.VISIBLE);
                        lineC137mX.setVisibility(View.VISIBLE);
                    }
                }
            });
            secC137mX = (LinearLayout) findViewById(R.id.secC137mX);
            lineC137mX = (View) findViewById(R.id.lineC137mX);
            VlblC137mX = (TextView) findViewById(R.id.VlblC137mX);
            txtC137mX = (EditText) findViewById(R.id.txtC137mX);
            secC138 = (LinearLayout) findViewById(R.id.secC138);
            lineC138 = (View) findViewById(R.id.lineC138);
            VlblC138 = (TextView) findViewById(R.id.VlblC138);
            rdogrpC138 = (RadioGroup) findViewById(R.id.rdogrpC138);

            rdoC1381 = (RadioButton) findViewById(R.id.rdoC1381);
            rdoC1382 = (RadioButton) findViewById(R.id.rdoC1382);
            secC139 = (LinearLayout) findViewById(R.id.secC139);
            lineC139 = (View) findViewById(R.id.lineC139);
            VlblC139 = (TextView) findViewById(R.id.VlblC139);
            rdogrpC139 = (RadioGroup) findViewById(R.id.rdogrpC139);

            rdoC1391 = (RadioButton) findViewById(R.id.rdoC1391);
            rdoC1392 = (RadioButton) findViewById(R.id.rdoC1392);
            rdoC1393 = (RadioButton) findViewById(R.id.rdoC1393);
            rdogrpC139.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpC139 = new String[]{"1", "2", "3"};
                    for (int i = 0; i < rdogrpC139.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpC139.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpC139[i];
                    }

                    if (rbData.equalsIgnoreCase("2")) {
                     /*   secBCG1.setVisibility(View.GONE);
                        lineBCG1.setVisibility(View.GONE);
                        rdogrpBCG1.clearCheck();
                        secBCG2.setVisibility(View.GONE);
                        lineBCG2.setVisibility(View.GONE);
                        rdogrpBCG2.clearCheck();
                        secPenta1.setVisibility(View.GONE);
                        linePenta1.setVisibility(View.GONE);
                        rdogrpPenta1.clearCheck();
                        secPenta2.setVisibility(View.GONE);
                        linePenta2.setVisibility(View.GONE);
                        rdogrpPenta2.clearCheck();
                        secPenta3.setVisibility(View.GONE);
                        linePenta3.setVisibility(View.GONE);
                        rdogrpPenta3.clearCheck();
                        secOPV1.setVisibility(View.GONE);
                        lineOPV1.setVisibility(View.GONE);
                        rdogrpOPV1.clearCheck();
                        secOPV2.setVisibility(View.GONE);
                        lineOPV2.setVisibility(View.GONE);
                        rdogrpOPV2.clearCheck();
                        secOPV3.setVisibility(View.GONE);
                        lineOPV3.setVisibility(View.GONE);
                        rdogrpOPV3.clearCheck();
                        secPCV1.setVisibility(View.GONE);
                        linePCV1.setVisibility(View.GONE);
                        rdogrpPCV1.clearCheck();
                        secPCV2.setVisibility(View.GONE);
                        linePCV2.setVisibility(View.GONE);
                        rdogrpPCV2.clearCheck();
                        secPCV3.setVisibility(View.GONE);
                        linePCV3.setVisibility(View.GONE);
                        rdogrpPCV3.clearCheck();
                        secIPV.setVisibility(View.GONE);
                        lineIPV.setVisibility(View.GONE);
                        rdogrpIPV.clearCheck();
                        secMR1.setVisibility(View.GONE);
                        lineMR1.setVisibility(View.GONE);
                        rdogrpMR1.clearCheck();
                        secMR2.setVisibility(View.GONE);
                        lineMR2.setVisibility(View.GONE);
                        rdogrpMR2.clearCheck();*/
                    } else if (rbData.equalsIgnoreCase("3")) {
                        secBCG1.setVisibility(View.GONE);
                        lineBCG1.setVisibility(View.GONE);
                        rdogrpBCG1.clearCheck();
                        secBCG2.setVisibility(View.GONE);
                        lineBCG2.setVisibility(View.GONE);
                        rdogrpBCG2.clearCheck();
                        secPenta1.setVisibility(View.GONE);
                        linePenta1.setVisibility(View.GONE);
                        rdogrpPenta1.clearCheck();
                        secPenta2.setVisibility(View.GONE);
                        linePenta2.setVisibility(View.GONE);
                        rdogrpPenta2.clearCheck();
                        secPenta3.setVisibility(View.GONE);
                        linePenta3.setVisibility(View.GONE);
                        rdogrpPenta3.clearCheck();
                        secOPV1.setVisibility(View.GONE);
                        lineOPV1.setVisibility(View.GONE);
                        rdogrpOPV1.clearCheck();
                        secOPV2.setVisibility(View.GONE);
                        lineOPV2.setVisibility(View.GONE);
                        rdogrpOPV2.clearCheck();
                        secOPV3.setVisibility(View.GONE);
                        lineOPV3.setVisibility(View.GONE);
                        rdogrpOPV3.clearCheck();
                        secPCV1.setVisibility(View.GONE);
                        linePCV1.setVisibility(View.GONE);
                        rdogrpPCV1.clearCheck();
                        secPCV2.setVisibility(View.GONE);
                        linePCV2.setVisibility(View.GONE);
                        rdogrpPCV2.clearCheck();
                        secPCV3.setVisibility(View.GONE);
                        linePCV3.setVisibility(View.GONE);
                        rdogrpPCV3.clearCheck();
                        secIPV.setVisibility(View.GONE);
                        lineIPV.setVisibility(View.GONE);
                        rdogrpIPV.clearCheck();
                        secMR1.setVisibility(View.GONE);
                        lineMR1.setVisibility(View.GONE);
                        rdogrpMR1.clearCheck();
                        secMR2.setVisibility(View.GONE);
                        lineMR2.setVisibility(View.GONE);
                        rdogrpMR2.clearCheck();
                    } else {
                        secBCG1.setVisibility(View.VISIBLE);
                        lineBCG1.setVisibility(View.VISIBLE);
                        secBCG2.setVisibility(View.VISIBLE);
                        lineBCG2.setVisibility(View.VISIBLE);
                        secPenta1.setVisibility(View.VISIBLE);
                        linePenta1.setVisibility(View.VISIBLE);
                        secPenta2.setVisibility(View.VISIBLE);
                        linePenta2.setVisibility(View.VISIBLE);
                        secPenta3.setVisibility(View.VISIBLE);
                        linePenta3.setVisibility(View.VISIBLE);
                        secOPV1.setVisibility(View.VISIBLE);
                        lineOPV1.setVisibility(View.VISIBLE);
                        secOPV2.setVisibility(View.VISIBLE);
                        lineOPV2.setVisibility(View.VISIBLE);
                        secOPV3.setVisibility(View.VISIBLE);
                        lineOPV3.setVisibility(View.VISIBLE);
                        secPCV1.setVisibility(View.VISIBLE);
                        linePCV1.setVisibility(View.VISIBLE);
                        secPCV2.setVisibility(View.VISIBLE);
                        linePCV2.setVisibility(View.VISIBLE);
                        secPCV3.setVisibility(View.VISIBLE);
                        linePCV3.setVisibility(View.VISIBLE);
                        secIPV.setVisibility(View.VISIBLE);
                        lineIPV.setVisibility(View.VISIBLE);
                        secMR1.setVisibility(View.VISIBLE);
                        lineMR1.setVisibility(View.VISIBLE);
                        secMR2.setVisibility(View.VISIBLE);
                        lineMR2.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secBCG1 = (LinearLayout) findViewById(R.id.secBCG1);
            lineBCG1 = (View) findViewById(R.id.lineBCG1);
            VlblBCG1 = (TextView) findViewById(R.id.VlblBCG1);
            rdogrpBCG1 = (RadioGroup) findViewById(R.id.rdogrpBCG1);

            rdoBCG11 = (RadioButton) findViewById(R.id.rdoBCG11);
            rdoBCG12 = (RadioButton) findViewById(R.id.rdoBCG12);
            rdoBCG13 = (RadioButton) findViewById(R.id.rdoBCG13);
            secBCG2 = (LinearLayout) findViewById(R.id.secBCG2);
            lineBCG2 = (View) findViewById(R.id.lineBCG2);
            VlblBCG2 = (TextView) findViewById(R.id.VlblBCG2);
            rdogrpBCG2 = (RadioGroup) findViewById(R.id.rdogrpBCG2);

            rdoBCG21 = (RadioButton) findViewById(R.id.rdoBCG21);
            rdoBCG22 = (RadioButton) findViewById(R.id.rdoBCG22);
            rdoBCG23 = (RadioButton) findViewById(R.id.rdoBCG23);
            secPenta1 = (LinearLayout) findViewById(R.id.secPenta1);
            linePenta1 = (View) findViewById(R.id.linePenta1);
            VlblPenta1 = (TextView) findViewById(R.id.VlblPenta1);
            rdogrpPenta1 = (RadioGroup) findViewById(R.id.rdogrpPenta1);

            rdoPenta11 = (RadioButton) findViewById(R.id.rdoPenta11);
            rdoPenta12 = (RadioButton) findViewById(R.id.rdoPenta12);
            rdoPenta13 = (RadioButton) findViewById(R.id.rdoPenta13);
            secPenta2 = (LinearLayout) findViewById(R.id.secPenta2);
            linePenta2 = (View) findViewById(R.id.linePenta2);
            VlblPenta2 = (TextView) findViewById(R.id.VlblPenta2);
            rdogrpPenta2 = (RadioGroup) findViewById(R.id.rdogrpPenta2);

            rdoPenta21 = (RadioButton) findViewById(R.id.rdoPenta21);
            rdoPenta22 = (RadioButton) findViewById(R.id.rdoPenta22);
            rdoPenta23 = (RadioButton) findViewById(R.id.rdoPenta23);
            secPenta3 = (LinearLayout) findViewById(R.id.secPenta3);
            linePenta3 = (View) findViewById(R.id.linePenta3);
            VlblPenta3 = (TextView) findViewById(R.id.VlblPenta3);
            rdogrpPenta3 = (RadioGroup) findViewById(R.id.rdogrpPenta3);

            rdoPenta31 = (RadioButton) findViewById(R.id.rdoPenta31);
            rdoPenta32 = (RadioButton) findViewById(R.id.rdoPenta32);
            rdoPenta33 = (RadioButton) findViewById(R.id.rdoPenta33);
            secOPV1 = (LinearLayout) findViewById(R.id.secOPV1);
            lineOPV1 = (View) findViewById(R.id.lineOPV1);
            VlblOPV1 = (TextView) findViewById(R.id.VlblOPV1);
            rdogrpOPV1 = (RadioGroup) findViewById(R.id.rdogrpOPV1);

            rdoOPV11 = (RadioButton) findViewById(R.id.rdoOPV11);
            rdoOPV12 = (RadioButton) findViewById(R.id.rdoOPV12);
            rdoOPV13 = (RadioButton) findViewById(R.id.rdoOPV13);
            secOPV2 = (LinearLayout) findViewById(R.id.secOPV2);
            lineOPV2 = (View) findViewById(R.id.lineOPV2);
            VlblOPV2 = (TextView) findViewById(R.id.VlblOPV2);
            rdogrpOPV2 = (RadioGroup) findViewById(R.id.rdogrpOPV2);

            rdoOPV21 = (RadioButton) findViewById(R.id.rdoOPV21);
            rdoOPV22 = (RadioButton) findViewById(R.id.rdoOPV22);
            rdoOPV23 = (RadioButton) findViewById(R.id.rdoOPV23);
            secOPV3 = (LinearLayout) findViewById(R.id.secOPV3);
            lineOPV3 = (View) findViewById(R.id.lineOPV3);
            VlblOPV3 = (TextView) findViewById(R.id.VlblOPV3);
            rdogrpOPV3 = (RadioGroup) findViewById(R.id.rdogrpOPV3);

            rdoOPV31 = (RadioButton) findViewById(R.id.rdoOPV31);
            rdoOPV32 = (RadioButton) findViewById(R.id.rdoOPV32);
            rdoOPV33 = (RadioButton) findViewById(R.id.rdoOPV33);
            secPCV1 = (LinearLayout) findViewById(R.id.secPCV1);
            linePCV1 = (View) findViewById(R.id.linePCV1);
            VlblPCV1 = (TextView) findViewById(R.id.VlblPCV1);
            rdogrpPCV1 = (RadioGroup) findViewById(R.id.rdogrpPCV1);

            rdoPCV11 = (RadioButton) findViewById(R.id.rdoPCV11);
            rdoPCV12 = (RadioButton) findViewById(R.id.rdoPCV12);
            rdoPCV13 = (RadioButton) findViewById(R.id.rdoPCV13);
            secPCV2 = (LinearLayout) findViewById(R.id.secPCV2);
            linePCV2 = (View) findViewById(R.id.linePCV2);
            VlblPCV2 = (TextView) findViewById(R.id.VlblPCV2);
            rdogrpPCV2 = (RadioGroup) findViewById(R.id.rdogrpPCV2);

            rdoPCV21 = (RadioButton) findViewById(R.id.rdoPCV21);
            rdoPCV22 = (RadioButton) findViewById(R.id.rdoPCV22);
            rdoPCV23 = (RadioButton) findViewById(R.id.rdoPCV23);
            secPCV3 = (LinearLayout) findViewById(R.id.secPCV3);
            linePCV3 = (View) findViewById(R.id.linePCV3);
            VlblPCV3 = (TextView) findViewById(R.id.VlblPCV3);
            rdogrpPCV3 = (RadioGroup) findViewById(R.id.rdogrpPCV3);

            rdoPCV31 = (RadioButton) findViewById(R.id.rdoPCV31);
            rdoPCV32 = (RadioButton) findViewById(R.id.rdoPCV32);
            rdoPCV33 = (RadioButton) findViewById(R.id.rdoPCV33);
            secIPV = (LinearLayout) findViewById(R.id.secIPV);
            lineIPV = (View) findViewById(R.id.lineIPV);
            VlblIPV = (TextView) findViewById(R.id.VlblIPV);
            rdogrpIPV = (RadioGroup) findViewById(R.id.rdogrpIPV);

            rdoIPV1 = (RadioButton) findViewById(R.id.rdoIPV1);
            rdoIPV2 = (RadioButton) findViewById(R.id.rdoIPV2);
            rdoIPV3 = (RadioButton) findViewById(R.id.rdoIPV3);
            secMR1 = (LinearLayout) findViewById(R.id.secMR1);
            lineMR1 = (View) findViewById(R.id.lineMR1);
            VlblMR1 = (TextView) findViewById(R.id.VlblMR1);
            rdogrpMR1 = (RadioGroup) findViewById(R.id.rdogrpMR1);

            rdoMR11 = (RadioButton) findViewById(R.id.rdoMR11);
            rdoMR12 = (RadioButton) findViewById(R.id.rdoMR12);
            rdoMR13 = (RadioButton) findViewById(R.id.rdoMR13);
            secMR2 = (LinearLayout) findViewById(R.id.secMR2);
            lineMR2 = (View) findViewById(R.id.lineMR2);
            VlblMR2 = (TextView) findViewById(R.id.VlblMR2);
            rdogrpMR2 = (RadioGroup) findViewById(R.id.rdogrpMR2);

            rdoMR21 = (RadioButton) findViewById(R.id.rdoMR21);
            rdoMR22 = (RadioButton) findViewById(R.id.rdoMR22);
            rdoMR23 = (RadioButton) findViewById(R.id.rdoMR23);
            secC140 = (LinearLayout) findViewById(R.id.secC140);
            lineC140 = (View) findViewById(R.id.lineC140);
            VlblC140 = (TextView) findViewById(R.id.VlblC140);
            rdogrpC140 = (RadioGroup) findViewById(R.id.rdogrpC140);

            rdoC1401 = (RadioButton) findViewById(R.id.rdoC1401);
            rdoC1402 = (RadioButton) findViewById(R.id.rdoC1402);
            rdoC1403 = (RadioButton) findViewById(R.id.rdoC1403);
            rdogrpC140.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpC140 = new String[]{"1", "0", "8"};
                    for (int i = 0; i < rdogrpC140.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpC140.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpC140[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secC141.setVisibility(View.GONE);
                        lineC141.setVisibility(View.GONE);
                        spnC141.setSelection(0);
                        secC141X.setVisibility(View.GONE);
                        lineC141X.setVisibility(View.GONE);
                        txtC141X.setText("");

                    } else if (rbData.equalsIgnoreCase("8")) {
                        secC141.setVisibility(View.GONE);
                        lineC141.setVisibility(View.GONE);
                        spnC141.setSelection(0);
                        secC141X.setVisibility(View.GONE);
                        lineC141X.setVisibility(View.GONE);
                        txtC141X.setText("");

                    } else {
                        secC141.setVisibility(View.VISIBLE);
                        lineC141.setVisibility(View.VISIBLE);
                       // secC141X.setVisibility(View.VISIBLE);
                      //  lineC141X.setVisibility(View.VISIBLE);

                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secC141 = (LinearLayout) findViewById(R.id.secC141);
            lineC141 = (View) findViewById(R.id.lineC141);
            VlblC141 = (TextView) findViewById(R.id.VlblC141);
            spnC141 = (Spinner) findViewById(R.id.spnC141);
            List<String> listC141 = new ArrayList<String>();

            listC141.add("");
            listC141.add("1-ই,পি,আই সেশন");
            listC141.add("2-ভিটামিন এ ক্যাম্পেইন");
            listC141.add("3-অন্যান্য");
            listC141.add("8-জানা নেই ");
            ArrayAdapter<String> adptrC141 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listC141);
            spnC141.setAdapter(adptrC141);

            spnC141.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnC141.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnC141.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("1")) {
                        secC141X.setVisibility(View.GONE);
                        lineC141X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("2")) {
                        secC141X.setVisibility(View.GONE);
                        lineC141X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("8")) {
                        secC141X.setVisibility(View.GONE);
                        lineC141X.setVisibility(View.GONE);
                    } else {
                     //   secC141X.setVisibility(View.VISIBLE);
                      //  lineC141X.setVisibility(View.VISIBLE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secC141X = (LinearLayout) findViewById(R.id.secC141X);
            lineC141X = (View) findViewById(R.id.lineC141X);
            VlblC141X = (TextView) findViewById(R.id.VlblC141X);
            txtC141X = (EditText) findViewById(R.id.txtC141X);
            secC141X.setVisibility(View.GONE);
            lineC141X.setVisibility(View.GONE);
            secC142 = (LinearLayout) findViewById(R.id.secC142);
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
           // secC19b.setVisibility(View.GONE);
          //  secC19c.setVisibility(View.GONE);
          //  secC110.setVisibility(View.GONE);
            secC116.setVisibility(View.GONE);
            secC117a.setVisibility(View.GONE);
            secC117b.setVisibility(View.GONE);
            secC117c.setVisibility(View.GONE);
            secC117d.setVisibility(View.GONE);
            secC117e.setVisibility(View.GONE);
            secC117eX.setVisibility(View.GONE);
            secC117f.setVisibility(View.GONE);
            secC118d.setVisibility(View.GONE);
            secC118m.setVisibility(View.GONE);
            secC117eX.setVisibility(View.GONE);
            secC117f.setVisibility(View.GONE);
            secC121b1.setVisibility(View.GONE);
            secC121b1.setVisibility(View.GONE);
            secC121c1.setVisibility(View.GONE);
            secC121c1.setVisibility(View.GONE);
            secC121f1.setVisibility(View.GONE);
            secC121f1.setVisibility(View.GONE);
            secC121iX.setVisibility(View.GONE);
            secC121iX.setVisibility(View.GONE);
            secC125.setVisibility(View.GONE);
            secC126a.setVisibility(View.GONE);
            secC126b.setVisibility(View.GONE);
            secC126c.setVisibility(View.GONE);
            secC126d.setVisibility(View.GONE);
            secC126e.setVisibility(View.GONE);
            secC126f.setVisibility(View.GONE);
            secC126g.setVisibility(View.GONE);
            secC126h.setVisibility(View.GONE);
            secC126i.setVisibility(View.GONE);
            secC126j.setVisibility(View.GONE);
            secC126k.setVisibility(View.GONE);
            secC126l.setVisibility(View.GONE);
            secC126m.setVisibility(View.GONE);
            secC126n.setVisibility(View.GONE);
            secC126o.setVisibility(View.GONE);
            secC126q.setVisibility(View.GONE);
            secC126r.setVisibility(View.GONE);
          /*  secC129.setVisibility(View.GONE);
            secC130.setVisibility(View.GONE);
            secC131.setVisibility(View.GONE);
            secC134.setVisibility(View.GONE);*/
            secC135a.setVisibility(View.GONE);
            secC135b.setVisibility(View.GONE);
            secC135c.setVisibility(View.GONE);
            secC135d.setVisibility(View.GONE);
            secC135e.setVisibility(View.GONE);
            secC135eX.setVisibility(View.GONE);
           // secC136.setVisibility(View.GONE);
            secC137a.setVisibility(View.GONE);
            secC137b.setVisibility(View.GONE);
            secC137c.setVisibility(View.GONE);
            secC137d.setVisibility(View.GONE);
            secC137e.setVisibility(View.GONE);
            secC137f.setVisibility(View.GONE);
            secC137g.setVisibility(View.GONE);
            secC137h.setVisibility(View.GONE);
            secC137i.setVisibility(View.GONE);
            secC137j.setVisibility(View.GONE);
            secC137k.setVisibility(View.GONE);
            secC137l.setVisibility(View.GONE);
            secC137m.setVisibility(View.GONE);
            secC137mX.setVisibility(View.GONE);
           /* secC138.setVisibility(View.GONE);
            secC139.setVisibility(View.GONE);
            secBCG1.setVisibility(View.GONE);
            secBCG2.setVisibility(View.GONE);
            secPenta1.setVisibility(View.GONE);
            secPenta2.setVisibility(View.GONE);
            secPenta3.setVisibility(View.GONE);
            secOPV1.setVisibility(View.GONE);
            secOPV2.setVisibility(View.GONE);
            secOPV3.setVisibility(View.GONE);
            secPCV1.setVisibility(View.GONE);
            secPCV2.setVisibility(View.GONE);
            secPCV3.setVisibility(View.GONE);
            secIPV.setVisibility(View.GONE);
            secMR1.setVisibility(View.GONE);
            secMR2.setVisibility(View.GONE);
            secC140.setVisibility(View.GONE);*/
            secC141.setVisibility(View.GONE);
            secC141X.setVisibility(View.GONE);
          /*  secC142a.setVisibility(View.GONE);
            secC142b.setVisibility(View.GONE);
            secC142c.setVisibility(View.GONE);
            secC142d.setVisibility(View.GONE);
            secC142e.setVisibility(View.GONE);*/
            secC135a.setVisibility(View.GONE);
            secC135b.setVisibility(View.GONE);
            secC135c.setVisibility(View.GONE);
            secC135d.setVisibility(View.GONE);
            secC135e.setVisibility(View.GONE);
            secC135eX.setVisibility(View.GONE);
            secC135eX.setVisibility(View.GONE);
           // secC136.setVisibility(View.GONE);
            secC137a.setVisibility(View.GONE);
            secC137b.setVisibility(View.GONE);
            secC137c.setVisibility(View.GONE);
            secC137d.setVisibility(View.GONE);
            secC137e.setVisibility(View.GONE);
            secC137f.setVisibility(View.GONE);
            secC137g.setVisibility(View.GONE);
            secC137h.setVisibility(View.GONE);
            secC137i.setVisibility(View.GONE);
            secC137j.setVisibility(View.GONE);
            secC137k.setVisibility(View.GONE);
            secC137l.setVisibility(View.GONE);
            secC137m.setVisibility(View.GONE);
            secC137mX.setVisibility(View.GONE);
            secC137a.setVisibility(View.GONE);
            secC137b.setVisibility(View.GONE);
            secC137c.setVisibility(View.GONE);
            secC137d.setVisibility(View.GONE);
            secC137e.setVisibility(View.GONE);
            secC137f.setVisibility(View.GONE);
            secC137g.setVisibility(View.GONE);
            secC137h.setVisibility(View.GONE);
            secC137i.setVisibility(View.GONE);
            secC137j.setVisibility(View.GONE);
            secC137k.setVisibility(View.GONE);
            secC137l.setVisibility(View.GONE);
            secC137m.setVisibility(View.GONE);
            secC137mX.setVisibility(View.GONE);
            secC137mX.setVisibility(View.GONE);
           /* secC138.setVisibility(View.GONE);
            secBCG1.setVisibility(View.GONE);
            secBCG2.setVisibility(View.GONE);
            secPenta1.setVisibility(View.GONE);
            secPenta2.setVisibility(View.GONE);
            secPenta3.setVisibility(View.GONE);
            secOPV1.setVisibility(View.GONE);
            secOPV2.setVisibility(View.GONE);
            secOPV3.setVisibility(View.GONE);
            secPCV1.setVisibility(View.GONE);
            secPCV2.setVisibility(View.GONE);
            secPCV3.setVisibility(View.GONE);
            secIPV.setVisibility(View.GONE);
            secMR1.setVisibility(View.GONE);
            secMR2.setVisibility(View.GONE);
            secBCG1.setVisibility(View.GONE);
            secBCG2.setVisibility(View.GONE);
            secPenta1.setVisibility(View.GONE);
            secPenta2.setVisibility(View.GONE);
            secPenta3.setVisibility(View.GONE);
            secOPV1.setVisibility(View.GONE);
            secOPV2.setVisibility(View.GONE);
            secOPV3.setVisibility(View.GONE);
            secPCV1.setVisibility(View.GONE);
            secPCV2.setVisibility(View.GONE);
            secPCV3.setVisibility(View.GONE);
            secIPV.setVisibility(View.GONE);
            secMR1.setVisibility(View.GONE);
            secMR2.setVisibility(View.GONE);*/
            secC141.setVisibility(View.GONE);
            secC141X.setVisibility(View.GONE);
           /* secC142a.setVisibility(View.GONE);
            secC142b.setVisibility(View.GONE);
            secC142c.setVisibility(View.GONE);
            secC142d.setVisibility(View.GONE);
            secC142e.setVisibility(View.GONE);
            secC141.setVisibility(View.GONE);
            secC141X.setVisibility(View.GONE);
            secC142a.setVisibility(View.GONE);
            secC142b.setVisibility(View.GONE);
            secC142c.setVisibility(View.GONE);
            secC142d.setVisibility(View.GONE);
            secC142e.setVisibility(View.GONE);
            secC141X.setVisibility(View.GONE);
            secC141X.setVisibility(View.GONE);
            secC141X.setVisibility(View.GONE);
*/



            spnCHSLNo.setAdapter(C.getArrayAdapter("select H21 ||'-'||H22 from member where RND='" + RND + "' and SuchanaID='" + SUCHANAID + "' and H220='1'"));
            spnCHSLNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnC141.getSelectedItem().toString().length() == 0) return;
                    // String spnData = Connection.SelectedSpinnerValue(spnC141.getSelectedItem().toString(), "-");

                    String spnData = C.ReturnSingleValue("select H23 from member where H21 ||'-'||H22='" + spnCHSLNo.getSelectedItem() + "'");
                    if (spnData.equalsIgnoreCase("1")) {
                        rdoC141.setChecked(true);
                    } else if (spnData.equalsIgnoreCase("2")) {
                        rdoC142.setChecked(true);
                    }

                    txtC13.setText(C.ReturnSingleValue("select H22 from member where H21 ||'-'||H22='" + spnCHSLNo.getSelectedItem() + "'"));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });

            if(spnCHSLNo.getCount()==1)
            {
                String spnData = C.ReturnSingleValue("select H23 from member where H21 ||'-'||H22='" + spnCHSLNo.getSelectedItem() + "'");
                if (spnData.equalsIgnoreCase("1")) {
                    rdoC141.setChecked(true);
                } else if (spnData.equalsIgnoreCase("2")) {
                    rdoC142.setChecked(true);
                }

                txtC13.setText(C.ReturnSingleValue("select H22 from member where H21 ||'-'||H22='" + spnCHSLNo.getSelectedItem() + "'"));

            }
            DataSearch(RND,SUCHANAID);
            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(FdHabit.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(FdHabit.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(FdHabit.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(FdHabit.this, "Required field: উপকারভোগী সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0) {
                Connection.MessageBox(FdHabit.this, "Value should be between 1 and 999999999999(উপকারভোগী সদস্য আইডি).");
                txtSuchanaID.requestFocus();
                return;
            }
           /* else if (txtC11.getText().toString().length() == 0 & secC11.isShown()) {
                Connection.MessageBox(FdHabit.this, "Required field: শিশুর লাইন নম্বর.");
                txtC11.requestFocus();
                return;
            } else if (Integer.valueOf(txtC11.getText().toString().length() == 0 ? "1" : txtC11.getText().toString()) < 1 || Integer.valueOf(txtC11.getText().toString().length() == 0 ? "30" : txtC11.getText().toString()) > 30) {
                Connection.MessageBox(FdHabit.this, "Value should be between 1 and 30(শিশুর লাইন নম্বর).");
                txtC11.requestFocus();
                return;
            }

            else if (txtC12.getText().toString().length() == 0 & secC12.isShown()) {
                Connection.MessageBox(FdHabit.this, "Required field: মায়ের লাইন নম্বর.");
                txtC12.requestFocus();
                return;
            } else if (Integer.valueOf(txtC12.getText().toString().length() == 0 ? "0" : txtC12.getText().toString()) < 0 || Integer.valueOf(txtC12.getText().toString().length() == 0 ? "30" : txtC12.getText().toString()) > 30) {
                Connection.MessageBox(FdHabit.this, "Value should be between 0 and 30(মায়ের লাইন নম্বর).");
                txtC12.requestFocus();
                return;
            }
            */
            else if (txtC13.getText().toString().length() == 0 & secC13.isShown()) {
                Connection.MessageBox(FdHabit.this, "Required field: আপনার শিশুর নাম কি?.");
                txtC13.requestFocus();
                return;
            } else if (!rdoC141.isChecked() & !rdoC142.isChecked() & secC14.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (শিশুর লিঙ্গ ).");
                rdoC141.requestFocus();
                return;
            }
            DV = Global.DateValidate(dtpC15.getText().toString());
            if (DV.length() != 0 & secC15.isShown()) {
                Connection.MessageBox(FdHabit.this, DV);
                dtpC15.requestFocus();
                return;
            } else if (txtC16.getText().toString().length() == 0 & secC16.isShown()) {
                Connection.MessageBox(FdHabit.this, "Required field: শিশুর জন্মক্রম.");
                txtC16.requestFocus();
                return;
            } else if (Integer.valueOf(txtC16.getText().toString().length() == 0 ? "0" : txtC16.getText().toString()) < 0 || Integer.valueOf(txtC16.getText().toString().length() == 0 ? "20" : txtC16.getText().toString()) > 20) {
                Connection.MessageBox(FdHabit.this, "Value should be between 0 and 20(শিশুর জন্মক্রম).");
                txtC16.requestFocus();
                return;
            } else if (txtC17.getText().toString().length() == 0 & secC17.isShown()) {
                Connection.MessageBox(FdHabit.this, "Required field: জন্ম ওজন.");
                txtC17.requestFocus();
                return;
            } else if (Double.valueOf(txtC17.getText().toString().length() == 0 ? "1" : txtC17.getText().toString()) < 1 || Double.valueOf(txtC17.getText().toString().length() == 0 ? "99" : txtC17.getText().toString()) > 99) {
                Connection.MessageBox(FdHabit.this, "Value should be between 1 and 99(জন্ম ওজন).");
                txtC17.requestFocus();
                return;
            } else if (!rdoC181.isChecked() & !rdoC182.isChecked() & secC18.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (আপনি কখনো (নাম) কে বুকের দুধ পান করিয়েছেন? ).");
                rdoC181.requestFocus();
                return;
            }

            else if ((spnC19a.getSelectedItemPosition()==3 || spnC19a.getSelectedItemPosition()==4) && txtC19b.getText().toString().length() == 0 ) {
                Connection.MessageBox(FdHabit.this, "Required field: ঘণ্টা.");
                txtC19b.requestFocus();
                return;
            }  else if (!rdoC1101.isChecked() & !rdoC1102.isChecked() & secC110.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (আপনি কি এই শিশুকে শালদুধ দিয়েছিলেন? ).");
                rdoC1101.requestFocus();
                return;
            } else if (!rdoC1111.isChecked() & !rdoC1112.isChecked() & !rdoC1113.isChecked() & secC111.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (শিশুকে (নাম) বুকের প্রথম দুধ পান করানোর পূর্বে কি অন্য কিছু মুখে দিয়েছিলেন? (যেমন চিনি অথবা মধু)? ).");
                rdoC1111.requestFocus();
                return;
            } else if (!rdoC1121.isChecked() & !rdoC1122.isChecked() & !rdoC1123.isChecked() & secC112.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (শিশুকে (নাম) জন্মের 3 Days এর ভেতর কি অন্য কিছু মুখে দিয়েছিলেন? ).");
                rdoC1121.requestFocus();
                return;
            } else if (!rdoC1131.isChecked() & !rdoC1132.isChecked() & !rdoC1133.isChecked() & secC113.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (শিশুকে (নাম) জন্মের 6 months এর ভেতর কি কোনো খাবার অথবা পানীয় মুখে দিয়েছিলেন? (পানির কথা জানতে চান) ).");
                rdoC1131.requestFocus();
                return;
            } else if (txtC114d.getText().toString().length() == 0 & secC114d.isShown()) {
                Connection.MessageBox(FdHabit.this, "Required field: সর্বপ্রথম কোন বয়সে শিশুকে (নাম) বুকের দুধ বাদে অন্য কোনো কিছু (খাবার অথবা পানীয়) মুখে দিয়েছিলেন? Days.");
                txtC114d.requestFocus();
                return;
            } else if (Integer.valueOf(txtC114d.getText().toString().length() == 0 ? "0" : txtC114d.getText().toString()) < 0 || Integer.valueOf(txtC114d.getText().toString().length() == 0 ? "29" : txtC114d.getText().toString()) > 29) {
                Connection.MessageBox(FdHabit.this, "Value should be between 0 and 29(সর্বপ্রথম কোন বয়সে শিশুকে (নাম) বুকের দুধ বাদে অন্য কোনো কিছু (খাবার অথবা পানীয়) মুখে দিয়েছিলেন? Days).");
                txtC114d.requestFocus();
                return;
            } else if (txtC114m.getText().toString().length() == 0 & secC114m.isShown()) {
                Connection.MessageBox(FdHabit.this, "Required field: সর্বপ্রথম কোন বয়সে শিশুকে (নাম) বুকের দুধ বাদে অন্য কোনো কিছু (খাবার অথবা পানীয়) মুখে দিয়েছিলেন? Months.");
                txtC114m.requestFocus();
                return;
            } else if (Integer.valueOf(txtC114m.getText().toString().length() == 0 ? "0" : txtC114m.getText().toString()) < 0 || Integer.valueOf(txtC114m.getText().toString().length() == 0 ? "50" : txtC114m.getText().toString()) > 50) {
                Connection.MessageBox(FdHabit.this, "Value should be between 0 and 50(সর্বপ্রথম কোন বয়সে শিশুকে (নাম) বুকের দুধ বাদে অন্য কোনো কিছু (খাবার অথবা পানীয়) মুখে দিয়েছিলেন? Months).");
                txtC114m.requestFocus();
                return;
            } else if (!rdoC1151.isChecked() & !rdoC1152.isChecked() & secC115.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (শিশুটি কি এখনো বুকের দুধ খায়? ).");
                rdoC1151.requestFocus();
                return;
            } else if (txtC116.getText().toString().length() == 0 & secC116.isShown()) {
                Connection.MessageBox(FdHabit.this, "Required field: যদি না খায়, কোন বয়সে বুকের দুধ খাওয়ানো বন্ধ করেছিলেন? (দিন).");
                txtC116.requestFocus();
                return;
            } else if (Integer.valueOf(txtC116.getText().toString().length() == 0 ? "0" : txtC116.getText().toString()) < 0 || Integer.valueOf(txtC116.getText().toString().length() == 0 ? "999" : txtC116.getText().toString()) > 999) {
                Connection.MessageBox(FdHabit.this, "Value should be between 0 and 999(যদি না খায়, কোন বয়সে বুকের দুধ খাওয়ানো বন্ধ করেছিলেন? (দিন)).");
                txtC116.requestFocus();
                return;
            } else if (txtC117eX.getText().toString().length() == 0 & secC117eX.isShown()) {
                Connection.MessageBox(FdHabit.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtC117eX.requestFocus();
                return;
            } else if (txtC118d.getText().toString().length() == 0 & secC118d.isShown()) {
                Connection.MessageBox(FdHabit.this, "Required field: শিশুটিকে কত দিন/মাস যাবৎ বুকের দুধ খাইয়েছেন? Days.");
                txtC118d.requestFocus();
                return;
            } else if (Integer.valueOf(txtC118d.getText().toString().length() == 0 ? "0" : txtC118d.getText().toString()) < 0 || Integer.valueOf(txtC118d.getText().toString().length() == 0 ? "29" : txtC118d.getText().toString()) > 29) {
                Connection.MessageBox(FdHabit.this, "Value should be between 0 and 29(শিশুটিকে কত দিন/মাস যাবৎ বুকের দুধ খাইয়েছেন? Days).");
                txtC118d.requestFocus();
                return;
            } else if (txtC118m.getText().toString().length() == 0 & secC118m.isShown()) {
                Connection.MessageBox(FdHabit.this, "Required field: শিশুটিকে কত দিন/মাস যাবৎ বুকের দুধ খাইয়েছেন? Months.");
                txtC118m.requestFocus();
                return;
            } else if (Integer.valueOf(txtC118m.getText().toString().length() == 0 ? "0" : txtC118m.getText().toString()) < 0 || Integer.valueOf(txtC118m.getText().toString().length() == 0 ? "99" : txtC118m.getText().toString()) > 99) {
                Connection.MessageBox(FdHabit.this, "Value should be between 0 and 99(শিশুটিকে কত দিন/মাস যাবৎ বুকের দুধ খাইয়েছেন? Months).");
                txtC118m.requestFocus();
                return;
            } else if (!rdoC1191.isChecked() & !rdoC1192.isChecked() & !rdoC1193.isChecked() & secC119.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (শিশুটি (নাম) গতকাল, দিনে অথবা রাতে বুকের দুধ খেয়েছিল?  ).");
                rdoC1191.requestFocus();
                return;
            } else if (!rdoC1201.isChecked() & !rdoC1202.isChecked() & !rdoC1203.isChecked() & secC120.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (শিশুটি (নাম) গতকাল, দিনে অথবা রাতে এই রকম কোনো উপায়ে বুকের দুধ খেয়েছিল কি?  ).");
                rdoC1201.requestFocus();
                return;
            } else if (!rdoC121a1.isChecked() & !rdoC121a2.isChecked() & !rdoC121a3.isChecked() & secC121a.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (পানি).");
                rdoC121a1.requestFocus();
                return;
            } else if (!rdoC121b1.isChecked() & !rdoC121b2.isChecked() & !rdoC121b3.isChecked() & secC121b.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (শিশু ফর্মুলা যেমন [স্থানীয় কিছু উদাহরণ দিন]? ).");
                rdoC121b1.requestFocus();
                return;
            } else if (txtC121b1.getText().toString().length() == 0 & secC121b1.isShown()) {
                Connection.MessageBox(FdHabit.this, "Required field: বার.");
                txtC121b1.requestFocus();
                return;
            } else if (Integer.valueOf(txtC121b1.getText().toString().length() == 0 ? "1" : txtC121b1.getText().toString()) < 1 || Integer.valueOf(txtC121b1.getText().toString().length() == 0 ? "99" : txtC121b1.getText().toString()) > 99) {
                Connection.MessageBox(FdHabit.this, "Value should be between 1 and 99(বার).");
                txtC121b1.requestFocus();
                return;
            } else if (!rdoC121c1.isChecked() & !rdoC121c2.isChecked() & !rdoC121c3.isChecked() & secC121c.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (দুধ, যেমন টিনজাত, গুড়ো অথবা টাটকা দুধ ? ).");
                rdoC121c1.requestFocus();
                return;
            } else if (txtC121c1.getText().toString().length() == 0 & secC121c1.isShown()) {
                Connection.MessageBox(FdHabit.this, "Required field: বার.");
                txtC121c1.requestFocus();
                return;
            } else if (Integer.valueOf(txtC121c1.getText().toString().length() == 0 ? "1" : txtC121c1.getText().toString()) < 1 || Integer.valueOf(txtC121c1.getText().toString().length() == 0 ? "99" : txtC121c1.getText().toString()) > 99) {
                Connection.MessageBox(FdHabit.this, "Value should be between 1 and 99(বার).");
                txtC121c1.requestFocus();
                return;
            } else if (!rdoC121d1.isChecked() & !rdoC121d2.isChecked() & !rdoC121d3.isChecked() & secC121d.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (ফলের রস? ).");
                rdoC121d1.requestFocus();
                return;
            } else if (!rdoC121e1.isChecked() & !rdoC121e2.isChecked() & !rdoC121e3.isChecked() & secC121e.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (পাতলা ঝোল/সুপ? ).");
                rdoC121e1.requestFocus();
                return;
            } else if (!rdoC121f1.isChecked() & !rdoC121f2.isChecked() & !rdoC121f3.isChecked() & secC121f.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (দই ? ).");
                rdoC121f1.requestFocus();
                return;
            } else if (txtC121f1.getText().toString().length() == 0 & secC121f1.isShown()) {
                Connection.MessageBox(FdHabit.this, "Required field: বার.");
                txtC121f1.requestFocus();
                return;
            } else if (Integer.valueOf(txtC121f1.getText().toString().length() == 0 ? "1" : txtC121f1.getText().toString()) < 1 || Integer.valueOf(txtC121f1.getText().toString().length() == 0 ? "99" : txtC121f1.getText().toString()) > 99) {
                Connection.MessageBox(FdHabit.this, "Value should be between 1 and 99(বার).");
                txtC121f1.requestFocus();
                return;
            } else if (!rdoC121g1.isChecked() & !rdoC121g2.isChecked() & !rdoC121g3.isChecked() & secC121g.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (পাতলা জাউ? ).");
                rdoC121g1.requestFocus();
                return;
            } else if (!rdoC121h1.isChecked() & !rdoC121h2.isChecked() & !rdoC121h3.isChecked() & secC121h.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (অন্য কোন পানীয় যেমন [স্থানীয়ভাবে সহজলভ্য কোন তরল খাবার]? ).");
                rdoC121h1.requestFocus();
                return;
            } else if (!rdoC121i1.isChecked() & !rdoC121i2.isChecked() & !rdoC121i3.isChecked() & secC121i.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (অন্যান্য কোন পানীয়? ).");
                rdoC121i1.requestFocus();
                return;
            } else if (txtC121iX.getText().toString().length() == 0 & secC121iX.isShown()) {
                Connection.MessageBox(FdHabit.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtC121iX.requestFocus();
                return;
            } else if (!rdoC1221.isChecked() & !rdoC1222.isChecked() & !rdoC1223.isChecked() & secC122.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (শিশুটি (নাম) গতকাল, দিনে অথবা রাতে ORS [স্থানীয়নাম ব্যবহার করুন] খাওয়ানো হয়েছিল? ).");
                rdoC1221.requestFocus();
                return;
            } else if (!rdoC1231.isChecked() & !rdoC1232.isChecked() & !rdoC1233.isChecked() & secC123.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (শিশুটিকে (নাম) গতকাল, দিনে অথবা রাতে কোন ভিটামিন অথবা ওষুধ ড্রপ আকারে খাওয়ানো হয়েছিল?     ).");
                rdoC1231.requestFocus();
                return;
            } else if (!rdoC1241.isChecked() & !rdoC1242.isChecked() & secC124.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (শিশুটি (নাম) গতকাল, দিনে অথবা রাতে শক্ত, আধা-শক্ত অথবা নরম খাবার খেয়েছিল ?).");
                rdoC1241.requestFocus();
                return;
            } else if (txtC125.getText().toString().length() == 0 & secC125.isShown()) {
                Connection.MessageBox(FdHabit.this, "Required field: শিশুটি (নাম) গতকাল, দিনে অথবা রাতে পানীয় ব্যাতিত কতবার শক্ত, আধা-শক্ত অথবা নরম খাবার খেয়েছিলো?.");
                txtC125.requestFocus();
                return;
            } else if (Integer.valueOf(txtC125.getText().toString().length() == 0 ? "1" : txtC125.getText().toString()) < 1 || Integer.valueOf(txtC125.getText().toString().length() == 0 ? "99" : txtC125.getText().toString()) > 99) {
                Connection.MessageBox(FdHabit.this, "Value should be between 1 and 99(শিশুটি (নাম) গতকাল, দিনে অথবা রাতে পানীয় ব্যাতিত কতবার শক্ত, আধা-শক্ত অথবা নরম খাবার খেয়েছিলো?).");
                txtC125.requestFocus();
                return;
            } else if (!rdoC126a1.isChecked() & !rdoC126a2.isChecked() & !rdoC126a3.isChecked() & secC126a.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (পাউরুটি, ভাত অথবা শষ্য হতে তৈরী খাবার ).");
                rdoC126a1.requestFocus();
                return;
            } else if (!rdoC126b1.isChecked() & !rdoC126b2.isChecked() & !rdoC126b3.isChecked() & secC126b.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (কুমড়া, গাজর, স্কোয়াশ অথবা মিষ্টি আলু যা ভেতরে হলুদ অথবা কমলা রঙের ).");
                rdoC126b1.requestFocus();
                return;
            } else if (!rdoC126c1.isChecked() & !rdoC126c2.isChecked() & !rdoC126c3.isChecked() & secC126c.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (আলু অথবা মূল হতে তৈরী খাবার ).");
                rdoC126c1.requestFocus();
                return;
            } else if (!rdoC126d1.isChecked() & !rdoC126d2.isChecked() & !rdoC126d3.isChecked() & secC126d.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (গাঢ় সবুজ পাতা সবজি ).");
                rdoC126d1.requestFocus();
                return;
            } else if (!rdoC126e1.isChecked() & !rdoC126e2.isChecked() & !rdoC126e3.isChecked() & secC126e.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (পাকা আম, পাকা পেঁপে অথবা (ভিটামিন এ সমৃদ্ধ স্থানীয় কিছু ফলের নাম  বলুন) ).");
                rdoC126e1.requestFocus();
                return;
            } else if (!rdoC126f1.isChecked() & !rdoC126f2.isChecked() & !rdoC126f3.isChecked() & secC126f.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (অন্যান্য যেকোন ফল অথবা সবজি ).");
                rdoC126f1.requestFocus();
                return;
            } else if (!rdoC126g1.isChecked() & !rdoC126g2.isChecked() & !rdoC126g3.isChecked() & secC126g.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (কলিজা অথবা যেকোন অঙ্গের মাংস ).");
                rdoC126g1.requestFocus();
                return;
            } else if (!rdoC126h1.isChecked() & !rdoC126h2.isChecked() & !rdoC126h3.isChecked() & secC126h.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (যেকোন মাংস (যেমন যেকোন গরু, ভেড়া, ছাগল, মুরগি অথবা হাঁস) ).");
                rdoC126h1.requestFocus();
                return;
            } else if (!rdoC126i1.isChecked() & !rdoC126i2.isChecked() & !rdoC126i3.isChecked() & secC126i.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (ডিম ).");
                rdoC126i1.requestFocus();
                return;
            } else if (!rdoC126j1.isChecked() & !rdoC126j2.isChecked() & !rdoC126j3.isChecked() & secC126j.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (তাজা অথবা শুকনো মাছ, খোলসওয়ালা মাছ (shellfish) অথবা সামুদ্রিক মাছ ).");
                rdoC126j1.requestFocus();
                return;
            } else if (!rdoC126k1.isChecked() & !rdoC126k2.isChecked() & !rdoC126k3.isChecked() & secC126k.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (সিম, মটর, ডাল, বাদাম অথবা বিচি দ্বারা তৈরী খাবার ).");
                rdoC126k1.requestFocus();
                return;
            } else if (!rdoC126l1.isChecked() & !rdoC126l2.isChecked() & !rdoC126l3.isChecked() & secC126l.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (পনির, দই অথবা অন্যান্য দুগ্ধ জাতীয় খাবার  ).");
                rdoC126l1.requestFocus();
                return;
            } else if (!rdoC126m1.isChecked() & !rdoC126m2.isChecked() & !rdoC126m3.isChecked() & secC126m.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (যেকোন তেল, চর্বি অথবা এর থেকে তৈরী খাদ্য ).");
                rdoC126m1.requestFocus();
                return;
            } else if (!rdoC126n1.isChecked() & !rdoC126n2.isChecked() & !rdoC126n3.isChecked() & secC126n.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (চিনি জাতীয় খাদ্য যেমন চকলেট, মিষ্টি, লজেন্স, কেক, বিস্কুট ).");
                rdoC126n1.requestFocus();
                return;
            } else if (!rdoC126o1.isChecked() & !rdoC126o2.isChecked() & !rdoC126o3.isChecked() & secC126o.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (মশলা যেমন মরিচ,সুগন্ধির জন্যে ভেষজ উপাদান).");
                rdoC126o1.requestFocus();
                return;
            } else if (!rdoC126q1.isChecked() & !rdoC126q2.isChecked() & !rdoC126q3.isChecked() & secC126q.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (স্নাক্স অথবা ফাস্ট ফুড যেমন চিপস ).");
                rdoC126q1.requestFocus();
                return;
            } else if (!rdoC126r1.isChecked() & !rdoC126r2.isChecked() & !rdoC126r3.isChecked() & secC126r.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (অন্যান্য: চা, কোমল পানীয়/ফলের রস ).");
                rdoC126r1.requestFocus();
                return;
            } else if (!rdoC1291.isChecked() & !rdoC1292.isChecked() & !rdoC1293.isChecked() & secC129.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (শিশুটি (নাম) কি গতকাল, দিনে অথবা রাতে নিপল যুক্ত বোতল হতে কিছু পান করেছিল?  ).");
                rdoC1291.requestFocus();
                return;
            } else if (!rdoC1301.isChecked() & !rdoC1302.isChecked() & secC130.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (আপনি কি কখনো পাউডার/স্প্রিংকেল এর সম্পর্কে শুনেছেন যা খাবারে যোগ করা যায়? (স্থানীয় ভাবে প্রাপ্ত পন্যের নাম ব্যবহার করুন) ).");
                rdoC1301.requestFocus();
                return;
            } else if (!rdoC1311.isChecked() & !rdoC1312.isChecked() & secC131.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (গতকাল, দিনে অথবা রাতে শিশুটি (নাম) কি কোনো খাবার খেয়েছে যাতে আপনি পাউডার অথবা স্প্রিংকেল যোগ করে দিয়েছিলেন? ).");
                rdoC1311.requestFocus();
                return;
            } else if (!rdoC1341.isChecked() & !rdoC1342.isChecked() & secC134.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (আপনার সাথে কি কেউ কখনো শিশুকে কিভাবে খাওয়াবেন এই নিয়ে কথা বলেছে).");
                rdoC1341.requestFocus();
                return;
            } else if (txtC135eX.getText().toString().length() == 0 & secC135eX.isShown()) {
                Connection.MessageBox(FdHabit.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtC135eX.requestFocus();
                return;
            } else if (!rdoC1361.isChecked() & !rdoC1362.isChecked() & !rdoC1363.isChecked() & secC136.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (আপনি কি বুকের দুধ/পরিপূরক খাবার সম্পর্কে কোনো তথ্য শুনেছেন/দেখেছেন/পড়েছেন ).");
                rdoC1361.requestFocus();
                return;
            } else if (txtC137mX.getText().toString().length() == 0 & secC137mX.isShown()) {
                Connection.MessageBox(FdHabit.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtC137mX.requestFocus();
                return;
            } else if (!rdoC1381.isChecked() & !rdoC1382.isChecked() & secC138.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (আপনি কি সাধারণত (অন্তত সপ্তাহে 1 বার) রেডিও শুনেন এবং টেলিভিশন দেখেন (অন্য কারোর বাড়িতে হলেও)).");
                rdoC1381.requestFocus();
                return;
            } else if (!rdoC1391.isChecked() & !rdoC1392.isChecked() & !rdoC1393.isChecked() & secC139.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (শিশুটি কি কোন টিকা EPI এর মাধ্যমে পেয়েছিল ).");
                rdoC1391.requestFocus();
                return;
            } else if (!rdoBCG11.isChecked() & !rdoBCG12.isChecked() & !rdoBCG13.isChecked() & secBCG1.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (বিসিজি (১ম ডোজ)).");
                rdoBCG11.requestFocus();
                return;
            } else if (!rdoBCG21.isChecked() & !rdoBCG22.isChecked() & !rdoBCG23.isChecked() & secBCG2.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (বিসিজি (২য় ডোজ)).");
                rdoBCG21.requestFocus();
                return;
            } else if (!rdoPenta11.isChecked() & !rdoPenta12.isChecked() & !rdoPenta13.isChecked() & secPenta1.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (পেনটা (১ম ডোজ)).");
                rdoPenta11.requestFocus();
                return;
            } else if (!rdoPenta21.isChecked() & !rdoPenta22.isChecked() & !rdoPenta23.isChecked() & secPenta2.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (পেনটা (২য় ডোজ)).");
                rdoPenta21.requestFocus();
                return;
            } else if (!rdoPenta31.isChecked() & !rdoPenta32.isChecked() & !rdoPenta33.isChecked() & secPenta3.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (পেনটা (৩য় ডোজ)).");
                rdoPenta31.requestFocus();
                return;
            } else if (!rdoOPV11.isChecked() & !rdoOPV12.isChecked() & !rdoOPV13.isChecked() & secOPV1.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (ওপিভি (১ম ডোজ)).");
                rdoOPV11.requestFocus();
                return;
            } else if (!rdoOPV21.isChecked() & !rdoOPV22.isChecked() & !rdoOPV23.isChecked() & secOPV2.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (ওপিভি (২য় ডোজ)).");
                rdoOPV21.requestFocus();
                return;
            } else if (!rdoOPV31.isChecked() & !rdoOPV32.isChecked() & !rdoOPV33.isChecked() & secOPV3.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (ওপিভি (৩য় ডোজ)).");
                rdoOPV31.requestFocus();
                return;
            } else if (!rdoPCV11.isChecked() & !rdoPCV12.isChecked() & !rdoPCV13.isChecked() & secPCV1.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (পিসিভি (১ম ডোজ)).");
                rdoPCV11.requestFocus();
                return;
            } else if (!rdoPCV21.isChecked() & !rdoPCV22.isChecked() & !rdoPCV23.isChecked() & secPCV2.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (পিসিভি (২য় ডোজ)).");
                rdoPCV21.requestFocus();
                return;
            } else if (!rdoPCV31.isChecked() & !rdoPCV32.isChecked() & !rdoPCV33.isChecked() & secPCV3.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (পিসিভি (৩য় ডোজ)).");
                rdoPCV31.requestFocus();
                return;
            } else if (!rdoIPV1.isChecked() & !rdoIPV2.isChecked() & !rdoIPV3.isChecked() & secIPV.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (আই পি ভি).");
                rdoIPV1.requestFocus();
                return;
            } else if (!rdoMR11.isChecked() & !rdoMR12.isChecked() & !rdoMR13.isChecked() & secMR1.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (হাম ও রুবেলা (১ম ডোজ)).");
                rdoMR11.requestFocus();
                return;
            } else if (!rdoMR21.isChecked() & !rdoMR22.isChecked() & !rdoMR23.isChecked() & secMR2.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (হাম (২য় ডোজ)).");
                rdoMR21.requestFocus();
                return;
            } else if (!rdoC1401.isChecked() & !rdoC1402.isChecked() & !rdoC1403.isChecked() & secC140.isShown()) {
                Connection.MessageBox(FdHabit.this, "Select anyone options from (শিশুটি কি গত ছয় মাসে উচ্চমাত্রার ভিটামিন এ ক্যাপসুল পেয়েছিল/খেয়েছিল ).");
                rdoC1401.requestFocus();
                return;
            } else if (spnC141.getSelectedItemPosition() == 0 & secC141.isShown()) {
                Connection.MessageBox(FdHabit.this, "Required field: শিশুটি কোথা থেকে ভিটামিন এ ক্যাপসুল পেয়েছিল/খেয়েছিল.");
                spnC141.requestFocus();
                return;
            } else if (txtC141X.getText().toString().length() == 0 & secC141X.isShown()) {
                Connection.MessageBox(FdHabit.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtC141X.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            FdHabit_DataModel objSave = new FdHabit_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
           // objSave.setC11(txtC11.getText().toString());
           // objSave.setC12(txtC12.getText().toString());
            objSave.setC13(txtC13.getText().toString());
            String[] d_rdogrpC14 = new String[]{"1", "0"};
            objSave.setC14("");
            for (int i = 0; i < rdogrpC14.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC14.getChildAt(i);
                if (rb.isChecked()) objSave.setC14(d_rdogrpC14[i]);
            }

            objSave.setC15(dtpC15.getText().toString().length() > 0 ? Global.DateConvertYMD(dtpC15.getText().toString()) : dtpC15.getText().toString());
            objSave.setC16(txtC16.getText().toString());
            objSave.setC17(txtC17.getText().toString());
            String[] d_rdogrpC18 = new String[]{"1", "0"};
            objSave.setC18("");
            for (int i = 0; i < rdogrpC18.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC18.getChildAt(i);
                if (rb.isChecked()) objSave.setC18(d_rdogrpC18[i]);
            }
            objSave.setC19a((spnC19a.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnC19a.getSelectedItem().toString(), "-")));
            objSave.setC19b(txtC19b.getText().toString());

            String[] d_rdogrpC110 = new String[]{"1", "0"};
            objSave.setC110("");
            for (int i = 0; i < rdogrpC110.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC110.getChildAt(i);
                if (rb.isChecked()) objSave.setC110(d_rdogrpC110[i]);
            }

            String[] d_rdogrpC111 = new String[]{"1", "0", "8"};
            objSave.setC111("");
            for (int i = 0; i < rdogrpC111.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC111.getChildAt(i);
                if (rb.isChecked()) objSave.setC111(d_rdogrpC111[i]);
            }

            String[] d_rdogrpC112 = new String[]{"1", "0", "8"};
            objSave.setC112("");
            for (int i = 0; i < rdogrpC112.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC112.getChildAt(i);
                if (rb.isChecked()) objSave.setC112(d_rdogrpC112[i]);
            }

            String[] d_rdogrpC113 = new String[]{"1", "0", "8"};
            objSave.setC113("");
            for (int i = 0; i < rdogrpC113.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC113.getChildAt(i);
                if (rb.isChecked()) objSave.setC113(d_rdogrpC113[i]);
            }

            objSave.setC114d(txtC114d.getText().toString());
            objSave.setC114m(txtC114m.getText().toString());
            String[] d_rdogrpC115 = new String[]{"1", "0"};
            objSave.setC115("");
            for (int i = 0; i < rdogrpC115.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC115.getChildAt(i);
                if (rb.isChecked()) objSave.setC115(d_rdogrpC115[i]);
            }

            objSave.setC116(txtC116.getText().toString());
            objSave.setC117a((chkC117a.isChecked() ? "1" : "2"));
            objSave.setC117b((chkC117b.isChecked() ? "1" : "2"));
            objSave.setC117c((chkC117c.isChecked() ? "1" : "2"));
            objSave.setC117d((chkC117d.isChecked() ? "1" : "2"));
            objSave.setC117e((chkC117e.isChecked() ? "1" : "2"));
            objSave.setC117eX(txtC117eX.getText().toString());
            objSave.setC117f((chkC117f.isChecked() ? "1" : "2"));
            objSave.setC118d(txtC118d.getText().toString());
            objSave.setC118m(txtC118m.getText().toString());
            String[] d_rdogrpC119 = new String[]{"1", "0", "8"};
            objSave.setC119("");
            for (int i = 0; i < rdogrpC119.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC119.getChildAt(i);
                if (rb.isChecked()) objSave.setC119(d_rdogrpC119[i]);
            }

            String[] d_rdogrpC120 = new String[]{"1", "0", "8"};
            objSave.setC120("");
            for (int i = 0; i < rdogrpC120.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC120.getChildAt(i);
                if (rb.isChecked()) objSave.setC120(d_rdogrpC120[i]);
            }

            String[] d_rdogrpC121a = new String[]{"1", "0", "8"};
            objSave.setC121a("");
            for (int i = 0; i < rdogrpC121a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC121a.getChildAt(i);
                if (rb.isChecked()) objSave.setC121a(d_rdogrpC121a[i]);
            }

            String[] d_rdogrpC121b = new String[]{"1", "0", "8"};
            objSave.setC121b("");
            for (int i = 0; i < rdogrpC121b.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC121b.getChildAt(i);
                if (rb.isChecked()) objSave.setC121b(d_rdogrpC121b[i]);
            }

            objSave.setC121b1(txtC121b1.getText().toString());
            String[] d_rdogrpC121c = new String[]{"1", "0", "8"};
            objSave.setC121c("");
            for (int i = 0; i < rdogrpC121c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC121c.getChildAt(i);
                if (rb.isChecked()) objSave.setC121c(d_rdogrpC121c[i]);
            }

            objSave.setC121c1(txtC121c1.getText().toString());
            String[] d_rdogrpC121d = new String[]{"1", "0", "8"};
            objSave.setC121d("");
            for (int i = 0; i < rdogrpC121d.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC121d.getChildAt(i);
                if (rb.isChecked()) objSave.setC121d(d_rdogrpC121d[i]);
            }

            String[] d_rdogrpC121e = new String[]{"1", "0", "8"};
            objSave.setC121e("");
            for (int i = 0; i < rdogrpC121e.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC121e.getChildAt(i);
                if (rb.isChecked()) objSave.setC121e(d_rdogrpC121e[i]);
            }

            String[] d_rdogrpC121f = new String[]{"1", "0", "8"};
            objSave.setC121f("");
            for (int i = 0; i < rdogrpC121f.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC121f.getChildAt(i);
                if (rb.isChecked()) objSave.setC121f(d_rdogrpC121f[i]);
            }

            objSave.setC121f1(txtC121f1.getText().toString());
            String[] d_rdogrpC121g = new String[]{"1", "0", "8"};
            objSave.setC121g("");
            for (int i = 0; i < rdogrpC121g.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC121g.getChildAt(i);
                if (rb.isChecked()) objSave.setC121g(d_rdogrpC121g[i]);
            }

            String[] d_rdogrpC121h = new String[]{"1", "0", "8"};
            objSave.setC121h("");
            for (int i = 0; i < rdogrpC121h.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC121h.getChildAt(i);
                if (rb.isChecked()) objSave.setC121h(d_rdogrpC121h[i]);
            }

            String[] d_rdogrpC121i = new String[]{"1", "0", "8"};
            objSave.setC121i("");
            for (int i = 0; i < rdogrpC121i.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC121i.getChildAt(i);
                if (rb.isChecked()) objSave.setC121i(d_rdogrpC121i[i]);
            }

            objSave.setC121iX(txtC121iX.getText().toString());
            String[] d_rdogrpC122 = new String[]{"1", "0", "8"};
            objSave.setC122("");
            for (int i = 0; i < rdogrpC122.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC122.getChildAt(i);
                if (rb.isChecked()) objSave.setC122(d_rdogrpC122[i]);
            }

            String[] d_rdogrpC123 = new String[]{"1", "0", "8"};
            objSave.setC123("");
            for (int i = 0; i < rdogrpC123.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC123.getChildAt(i);
                if (rb.isChecked()) objSave.setC123(d_rdogrpC123[i]);
            }

            String[] d_rdogrpC124 = new String[]{"1", "0"};
            objSave.setC124("");
            for (int i = 0; i < rdogrpC124.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC124.getChildAt(i);
                if (rb.isChecked()) objSave.setC124(d_rdogrpC124[i]);
            }

            objSave.setC125(txtC125.getText().toString());
            String[] d_rdogrpC126a = new String[]{"1", "0", "8"};
            objSave.setC126a("");
            for (int i = 0; i < rdogrpC126a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC126a.getChildAt(i);
                if (rb.isChecked()) objSave.setC126a(d_rdogrpC126a[i]);
            }

            String[] d_rdogrpC126b = new String[]{"1", "0", "8"};
            objSave.setC126b("");
            for (int i = 0; i < rdogrpC126b.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC126b.getChildAt(i);
                if (rb.isChecked()) objSave.setC126b(d_rdogrpC126b[i]);
            }

            String[] d_rdogrpC126c = new String[]{"1", "0", "8"};
            objSave.setC126c("");
            for (int i = 0; i < rdogrpC126c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC126c.getChildAt(i);
                if (rb.isChecked()) objSave.setC126c(d_rdogrpC126c[i]);
            }

            String[] d_rdogrpC126d = new String[]{"1", "0", "8"};
            objSave.setC126d("");
            for (int i = 0; i < rdogrpC126d.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC126d.getChildAt(i);
                if (rb.isChecked()) objSave.setC126d(d_rdogrpC126d[i]);
            }

            String[] d_rdogrpC126e = new String[]{"1", "0", "8"};
            objSave.setC126e("");
            for (int i = 0; i < rdogrpC126e.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC126e.getChildAt(i);
                if (rb.isChecked()) objSave.setC126e(d_rdogrpC126e[i]);
            }

            String[] d_rdogrpC126f = new String[]{"1", "0", "8"};
            objSave.setC126f("");
            for (int i = 0; i < rdogrpC126f.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC126f.getChildAt(i);
                if (rb.isChecked()) objSave.setC126f(d_rdogrpC126f[i]);
            }

            String[] d_rdogrpC126g = new String[]{"1", "0", "8"};
            objSave.setC126g("");
            for (int i = 0; i < rdogrpC126g.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC126g.getChildAt(i);
                if (rb.isChecked()) objSave.setC126g(d_rdogrpC126g[i]);
            }

            String[] d_rdogrpC126h = new String[]{"1", "0", "8"};
            objSave.setC126h("");
            for (int i = 0; i < rdogrpC126h.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC126h.getChildAt(i);
                if (rb.isChecked()) objSave.setC126h(d_rdogrpC126h[i]);
            }

            String[] d_rdogrpC126i = new String[]{"1", "0", "8"};
            objSave.setC126i("");
            for (int i = 0; i < rdogrpC126i.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC126i.getChildAt(i);
                if (rb.isChecked()) objSave.setC126i(d_rdogrpC126i[i]);
            }

            String[] d_rdogrpC126j = new String[]{"1", "0", "8"};
            objSave.setC126j("");
            for (int i = 0; i < rdogrpC126j.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC126j.getChildAt(i);
                if (rb.isChecked()) objSave.setC126j(d_rdogrpC126j[i]);
            }

            String[] d_rdogrpC126k = new String[]{"1", "0", "8"};
            objSave.setC126k("");
            for (int i = 0; i < rdogrpC126k.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC126k.getChildAt(i);
                if (rb.isChecked()) objSave.setC126k(d_rdogrpC126k[i]);
            }

            String[] d_rdogrpC126l = new String[]{"1", "0", "8"};
            objSave.setC126l("");
            for (int i = 0; i < rdogrpC126l.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC126l.getChildAt(i);
                if (rb.isChecked()) objSave.setC126l(d_rdogrpC126l[i]);
            }

            String[] d_rdogrpC126m = new String[]{"1", "0", "8"};
            objSave.setC126m("");
            for (int i = 0; i < rdogrpC126m.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC126m.getChildAt(i);
                if (rb.isChecked()) objSave.setC126m(d_rdogrpC126m[i]);
            }

            String[] d_rdogrpC126n = new String[]{"1", "0", "8"};
            objSave.setC126n("");
            for (int i = 0; i < rdogrpC126n.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC126n.getChildAt(i);
                if (rb.isChecked()) objSave.setC126n(d_rdogrpC126n[i]);
            }

            String[] d_rdogrpC126o = new String[]{"1", "0", "8"};
            objSave.setC126o("");
            for (int i = 0; i < rdogrpC126o.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC126o.getChildAt(i);
                if (rb.isChecked()) objSave.setC126o(d_rdogrpC126o[i]);
            }

            String[] d_rdogrpC126q = new String[]{"1", "0", "8"};
            objSave.setC126q("");
            for (int i = 0; i < rdogrpC126q.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC126q.getChildAt(i);
                if (rb.isChecked()) objSave.setC126q(d_rdogrpC126q[i]);
            }

            String[] d_rdogrpC126r = new String[]{"1", "0", "8"};
            objSave.setC126r("");
            for (int i = 0; i < rdogrpC126r.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC126r.getChildAt(i);
                if (rb.isChecked()) objSave.setC126r(d_rdogrpC126r[i]);
            }

            String[] d_rdogrpC129 = new String[]{"1", "0", "8"};
            objSave.setC129("");
            for (int i = 0; i < rdogrpC129.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC129.getChildAt(i);
                if (rb.isChecked()) objSave.setC129(d_rdogrpC129[i]);
            }

            String[] d_rdogrpC130 = new String[]{"1", "0"};
            objSave.setC130("");
            for (int i = 0; i < rdogrpC130.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC130.getChildAt(i);
                if (rb.isChecked()) objSave.setC130(d_rdogrpC130[i]);
            }

            String[] d_rdogrpC131 = new String[]{"1", "0"};
            objSave.setC131("");
            for (int i = 0; i < rdogrpC131.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC131.getChildAt(i);
                if (rb.isChecked()) objSave.setC131(d_rdogrpC131[i]);
            }

            String[] d_rdogrpC134 = new String[]{"1", "0"};
            objSave.setC134("");
            for (int i = 0; i < rdogrpC134.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC134.getChildAt(i);
                if (rb.isChecked()) objSave.setC134(d_rdogrpC134[i]);
            }

            objSave.setC135a((chkC135a.isChecked() ? "1" : "2"));
            objSave.setC135b((chkC135b.isChecked() ? "1" : "2"));
            objSave.setC135c((chkC135c.isChecked() ? "1" : "2"));
            objSave.setC135d((chkC135d.isChecked() ? "1" : "2"));
            objSave.setC135e((chkC135e.isChecked() ? "1" : "2"));
            objSave.setC135eX(txtC135eX.getText().toString());
            String[] d_rdogrpC136 = new String[]{"1", "0", "8"};
            objSave.setC136("");
            for (int i = 0; i < rdogrpC136.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC136.getChildAt(i);
                if (rb.isChecked()) objSave.setC136(d_rdogrpC136[i]);
            }

            objSave.setC137a((chkC137a.isChecked() ? "1" : "2"));
            objSave.setC137b((chkC137b.isChecked() ? "1" : "2"));
            objSave.setC137c((chkC137c.isChecked() ? "1" : "2"));
            objSave.setC137d((chkC137d.isChecked() ? "1" : "2"));
            objSave.setC137e((chkC137e.isChecked() ? "1" : "2"));
            objSave.setC137f((chkC137f.isChecked() ? "1" : "2"));
            objSave.setC137g((chkC137g.isChecked() ? "1" : "2"));
            objSave.setC137h((chkC137h.isChecked() ? "1" : "2"));
            objSave.setC137i((chkC137i.isChecked() ? "1" : "2"));
            objSave.setC137j((chkC137j.isChecked() ? "1" : "2"));
            objSave.setC137k((chkC137k.isChecked() ? "1" : "2"));
            objSave.setC137l((chkC137l.isChecked() ? "1" : "2"));
            objSave.setC137m((chkC137m.isChecked() ? "1" : "2"));
            objSave.setC137mX(txtC137mX.getText().toString());
            String[] d_rdogrpC138 = new String[]{"1", "0"};
            objSave.setC138("");
            for (int i = 0; i < rdogrpC138.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC138.getChildAt(i);
                if (rb.isChecked()) objSave.setC138(d_rdogrpC138[i]);
            }

            String[] d_rdogrpC139 = new String[]{"1", "2", "3"};
            objSave.setC139("");
            for (int i = 0; i < rdogrpC139.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC139.getChildAt(i);
                if (rb.isChecked()) objSave.setC139(d_rdogrpC139[i]);
            }

            String[] d_rdogrpBCG1 = new String[]{"1", "0", "8"};
            objSave.setBCG1("");
            for (int i = 0; i < rdogrpBCG1.getChildCount(); i++) {
                rb = (RadioButton) rdogrpBCG1.getChildAt(i);
                if (rb.isChecked()) objSave.setBCG1(d_rdogrpBCG1[i]);
            }

            String[] d_rdogrpBCG2 = new String[]{"1", "0", "8"};
            objSave.setBCG2("");
            for (int i = 0; i < rdogrpBCG2.getChildCount(); i++) {
                rb = (RadioButton) rdogrpBCG2.getChildAt(i);
                if (rb.isChecked()) objSave.setBCG2(d_rdogrpBCG2[i]);
            }

            String[] d_rdogrpPenta1 = new String[]{"1", "0", "8"};
            objSave.setPenta1("");
            for (int i = 0; i < rdogrpPenta1.getChildCount(); i++) {
                rb = (RadioButton) rdogrpPenta1.getChildAt(i);
                if (rb.isChecked()) objSave.setPenta1(d_rdogrpPenta1[i]);
            }

            String[] d_rdogrpPenta2 = new String[]{"1", "0", "8"};
            objSave.setPenta2("");
            for (int i = 0; i < rdogrpPenta2.getChildCount(); i++) {
                rb = (RadioButton) rdogrpPenta2.getChildAt(i);
                if (rb.isChecked()) objSave.setPenta2(d_rdogrpPenta2[i]);
            }

            String[] d_rdogrpPenta3 = new String[]{"1", "0", "8"};
            objSave.setPenta3("");
            for (int i = 0; i < rdogrpPenta3.getChildCount(); i++) {
                rb = (RadioButton) rdogrpPenta3.getChildAt(i);
                if (rb.isChecked()) objSave.setPenta3(d_rdogrpPenta3[i]);
            }

            String[] d_rdogrpOPV1 = new String[]{"1", "0", "8"};
            objSave.setOPV1("");
            for (int i = 0; i < rdogrpOPV1.getChildCount(); i++) {
                rb = (RadioButton) rdogrpOPV1.getChildAt(i);
                if (rb.isChecked()) objSave.setOPV1(d_rdogrpOPV1[i]);
            }

            String[] d_rdogrpOPV2 = new String[]{"1", "0", "8"};
            objSave.setOPV2("");
            for (int i = 0; i < rdogrpOPV2.getChildCount(); i++) {
                rb = (RadioButton) rdogrpOPV2.getChildAt(i);
                if (rb.isChecked()) objSave.setOPV2(d_rdogrpOPV2[i]);
            }

            String[] d_rdogrpOPV3 = new String[]{"1", "0", "8"};
            objSave.setOPV3("");
            for (int i = 0; i < rdogrpOPV3.getChildCount(); i++) {
                rb = (RadioButton) rdogrpOPV3.getChildAt(i);
                if (rb.isChecked()) objSave.setOPV3(d_rdogrpOPV3[i]);
            }

            String[] d_rdogrpPCV1 = new String[]{"1", "0", "8"};
            objSave.setPCV1("");
            for (int i = 0; i < rdogrpPCV1.getChildCount(); i++) {
                rb = (RadioButton) rdogrpPCV1.getChildAt(i);
                if (rb.isChecked()) objSave.setPCV1(d_rdogrpPCV1[i]);
            }

            String[] d_rdogrpPCV2 = new String[]{"1", "0", "8"};
            objSave.setPCV2("");
            for (int i = 0; i < rdogrpPCV2.getChildCount(); i++) {
                rb = (RadioButton) rdogrpPCV2.getChildAt(i);
                if (rb.isChecked()) objSave.setPCV2(d_rdogrpPCV2[i]);
            }

            String[] d_rdogrpPCV3 = new String[]{"1", "0", "8"};
            objSave.setPCV3("");
            for (int i = 0; i < rdogrpPCV3.getChildCount(); i++) {
                rb = (RadioButton) rdogrpPCV3.getChildAt(i);
                if (rb.isChecked()) objSave.setPCV3(d_rdogrpPCV3[i]);
            }

            String[] d_rdogrpIPV = new String[]{"1", "0", "8"};
            objSave.setIPV("");
            for (int i = 0; i < rdogrpIPV.getChildCount(); i++) {
                rb = (RadioButton) rdogrpIPV.getChildAt(i);
                if (rb.isChecked()) objSave.setIPV(d_rdogrpIPV[i]);
            }

            String[] d_rdogrpMR1 = new String[]{"1", "0", "8"};
            objSave.setMR1("");
            for (int i = 0; i < rdogrpMR1.getChildCount(); i++) {
                rb = (RadioButton) rdogrpMR1.getChildAt(i);
                if (rb.isChecked()) objSave.setMR1(d_rdogrpMR1[i]);
            }

            String[] d_rdogrpMR2 = new String[]{"1", "0", "8"};
            objSave.setMR2("");
            for (int i = 0; i < rdogrpMR2.getChildCount(); i++) {
                rb = (RadioButton) rdogrpMR2.getChildAt(i);
                if (rb.isChecked()) objSave.setMR2(d_rdogrpMR2[i]);
            }

            String[] d_rdogrpC140 = new String[]{"1", "0", "8"};
            objSave.setC140("");
            for (int i = 0; i < rdogrpC140.getChildCount(); i++) {
                rb = (RadioButton) rdogrpC140.getChildAt(i);
                if (rb.isChecked()) objSave.setC140(d_rdogrpC140[i]);
            }

            objSave.setC141((spnC141.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnC141.getSelectedItem().toString(), "-")));
            objSave.setC141X(txtC141X.getText().toString());
            objSave.setC142a((chkC142a.isChecked() ? "1" : "2"));
            objSave.setC142b((chkC142b.isChecked() ? "1" : "2"));
            objSave.setC142c((chkC142c.isChecked() ? "1" : "2"));
            objSave.setC142d((chkC142d.isChecked() ? "1" : "2"));
            objSave.setC142e((chkC142e.isChecked() ? "1" : "2"));
            objSave.setC142f((chkC142f.isChecked() ? "1" : "2"));
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
                startActivity(new Intent(FdHabit.this, Anthro.class).putExtras(IDBundle));

            } else {
                Connection.MessageBox(FdHabit.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(FdHabit.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            FdHabit_DataModel d = new FdHabit_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<FdHabit_DataModel> data = d.SelectAll(this, SQL);
            for (FdHabit_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
               // txtC11.setText(item.getC11());
              //  txtC12.setText(item.getC12());
                txtC13.setText(item.getC13());
                String[] d_rdogrpC14 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpC14.length; i++) {
                    if (item.getC14().equals(String.valueOf(d_rdogrpC14[i]))) {
                        rb = (RadioButton) rdogrpC14.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                dtpC15.setText(item.getC15().toString().length() == 0 ? "" : Global.DateConvertDMY(item.getC15()));
                txtC16.setText(item.getC16());
                txtC17.setText(item.getC17());
                String[] d_rdogrpC18 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpC18.length; i++) {
                    if (item.getC18().equals(String.valueOf(d_rdogrpC18[i]))) {
                        rb = (RadioButton) rdogrpC18.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnC19a.setSelection(Global.SpinnerItemPositionAnyLength(spnC19a, item.getC19a()));
                txtC19b.setText(item.getC19b());

                String[] d_rdogrpC110 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpC110.length; i++) {
                    if (item.getC110().equals(String.valueOf(d_rdogrpC110[i]))) {
                        rb = (RadioButton) rdogrpC110.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC111 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC111.length; i++) {
                    if (item.getC111().equals(String.valueOf(d_rdogrpC111[i]))) {
                        rb = (RadioButton) rdogrpC111.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC112 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC112.length; i++) {
                    if (item.getC112().equals(String.valueOf(d_rdogrpC112[i]))) {
                        rb = (RadioButton) rdogrpC112.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC113 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC113.length; i++) {
                    if (item.getC113().equals(String.valueOf(d_rdogrpC113[i]))) {
                        rb = (RadioButton) rdogrpC113.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtC114d.setText(item.getC114d());
                txtC114m.setText(item.getC114m());
                String[] d_rdogrpC115 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpC115.length; i++) {
                    if (item.getC115().equals(String.valueOf(d_rdogrpC115[i]))) {
                        rb = (RadioButton) rdogrpC115.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtC116.setText(item.getC116());
                if (item.getC117a().equals("1")) {
                    chkC117a.setChecked(true);
                } else if (item.getC117a().equals("2")) {
                    chkC117a.setChecked(false);
                }
                if (item.getC117b().equals("1")) {
                    chkC117b.setChecked(true);
                } else if (item.getC117b().equals("2")) {
                    chkC117b.setChecked(false);
                }
                if (item.getC117c().equals("1")) {
                    chkC117c.setChecked(true);
                } else if (item.getC117c().equals("2")) {
                    chkC117c.setChecked(false);
                }
                if (item.getC117d().equals("1")) {
                    chkC117d.setChecked(true);
                } else if (item.getC117d().equals("2")) {
                    chkC117d.setChecked(false);
                }
                if (item.getC117e().equals("1")) {
                    chkC117e.setChecked(true);
                } else if (item.getC117e().equals("2")) {
                    chkC117e.setChecked(false);
                }
                txtC117eX.setText(item.getC117eX());
                if (item.getC117f().equals("1")) {
                    chkC117f.setChecked(true);
                } else if (item.getC117f().equals("2")) {
                    chkC117f.setChecked(false);
                }
                txtC118d.setText(item.getC118d());
                txtC118m.setText(item.getC118m());
                String[] d_rdogrpC119 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC119.length; i++) {
                    if (item.getC119().equals(String.valueOf(d_rdogrpC119[i]))) {
                        rb = (RadioButton) rdogrpC119.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC120 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC120.length; i++) {
                    if (item.getC120().equals(String.valueOf(d_rdogrpC120[i]))) {
                        rb = (RadioButton) rdogrpC120.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC121a = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC121a.length; i++) {
                    if (item.getC121a().equals(String.valueOf(d_rdogrpC121a[i]))) {
                        rb = (RadioButton) rdogrpC121a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC121b = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC121b.length; i++) {
                    if (item.getC121b().equals(String.valueOf(d_rdogrpC121b[i]))) {
                        rb = (RadioButton) rdogrpC121b.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtC121b1.setText(item.getC121b1());
                String[] d_rdogrpC121c = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC121c.length; i++) {
                    if (item.getC121c().equals(String.valueOf(d_rdogrpC121c[i]))) {
                        rb = (RadioButton) rdogrpC121c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtC121c1.setText(item.getC121c1());
                String[] d_rdogrpC121d = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC121d.length; i++) {
                    if (item.getC121d().equals(String.valueOf(d_rdogrpC121d[i]))) {
                        rb = (RadioButton) rdogrpC121d.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC121e = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC121e.length; i++) {
                    if (item.getC121e().equals(String.valueOf(d_rdogrpC121e[i]))) {
                        rb = (RadioButton) rdogrpC121e.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC121f = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC121f.length; i++) {
                    if (item.getC121f().equals(String.valueOf(d_rdogrpC121f[i]))) {
                        rb = (RadioButton) rdogrpC121f.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtC121f1.setText(item.getC121f1());
                String[] d_rdogrpC121g = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC121g.length; i++) {
                    if (item.getC121g().equals(String.valueOf(d_rdogrpC121g[i]))) {
                        rb = (RadioButton) rdogrpC121g.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC121h = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC121h.length; i++) {
                    if (item.getC121h().equals(String.valueOf(d_rdogrpC121h[i]))) {
                        rb = (RadioButton) rdogrpC121h.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC121i = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC121i.length; i++) {
                    if (item.getC121i().equals(String.valueOf(d_rdogrpC121i[i]))) {
                        rb = (RadioButton) rdogrpC121i.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtC121iX.setText(item.getC121iX());
                String[] d_rdogrpC122 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC122.length; i++) {
                    if (item.getC122().equals(String.valueOf(d_rdogrpC122[i]))) {
                        rb = (RadioButton) rdogrpC122.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC123 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC123.length; i++) {
                    if (item.getC123().equals(String.valueOf(d_rdogrpC123[i]))) {
                        rb = (RadioButton) rdogrpC123.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC124 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpC124.length; i++) {
                    if (item.getC124().equals(String.valueOf(d_rdogrpC124[i]))) {
                        rb = (RadioButton) rdogrpC124.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtC125.setText(item.getC125());
                String[] d_rdogrpC126a = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC126a.length; i++) {
                    if (item.getC126a().equals(String.valueOf(d_rdogrpC126a[i]))) {
                        rb = (RadioButton) rdogrpC126a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC126b = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC126b.length; i++) {
                    if (item.getC126b().equals(String.valueOf(d_rdogrpC126b[i]))) {
                        rb = (RadioButton) rdogrpC126b.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC126c = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC126c.length; i++) {
                    if (item.getC126c().equals(String.valueOf(d_rdogrpC126c[i]))) {
                        rb = (RadioButton) rdogrpC126c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC126d = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC126d.length; i++) {
                    if (item.getC126d().equals(String.valueOf(d_rdogrpC126d[i]))) {
                        rb = (RadioButton) rdogrpC126d.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC126e = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC126e.length; i++) {
                    if (item.getC126e().equals(String.valueOf(d_rdogrpC126e[i]))) {
                        rb = (RadioButton) rdogrpC126e.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC126f = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC126f.length; i++) {
                    if (item.getC126f().equals(String.valueOf(d_rdogrpC126f[i]))) {
                        rb = (RadioButton) rdogrpC126f.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC126g = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC126g.length; i++) {
                    if (item.getC126g().equals(String.valueOf(d_rdogrpC126g[i]))) {
                        rb = (RadioButton) rdogrpC126g.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC126h = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC126h.length; i++) {
                    if (item.getC126h().equals(String.valueOf(d_rdogrpC126h[i]))) {
                        rb = (RadioButton) rdogrpC126h.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC126i = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC126i.length; i++) {
                    if (item.getC126i().equals(String.valueOf(d_rdogrpC126i[i]))) {
                        rb = (RadioButton) rdogrpC126i.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC126j = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC126j.length; i++) {
                    if (item.getC126j().equals(String.valueOf(d_rdogrpC126j[i]))) {
                        rb = (RadioButton) rdogrpC126j.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC126k = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC126k.length; i++) {
                    if (item.getC126k().equals(String.valueOf(d_rdogrpC126k[i]))) {
                        rb = (RadioButton) rdogrpC126k.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC126l = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC126l.length; i++) {
                    if (item.getC126l().equals(String.valueOf(d_rdogrpC126l[i]))) {
                        rb = (RadioButton) rdogrpC126l.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC126m = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC126m.length; i++) {
                    if (item.getC126m().equals(String.valueOf(d_rdogrpC126m[i]))) {
                        rb = (RadioButton) rdogrpC126m.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC126n = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC126n.length; i++) {
                    if (item.getC126n().equals(String.valueOf(d_rdogrpC126n[i]))) {
                        rb = (RadioButton) rdogrpC126n.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC126o = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC126o.length; i++) {
                    if (item.getC126o().equals(String.valueOf(d_rdogrpC126o[i]))) {
                        rb = (RadioButton) rdogrpC126o.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC126q = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC126q.length; i++) {
                    if (item.getC126q().equals(String.valueOf(d_rdogrpC126q[i]))) {
                        rb = (RadioButton) rdogrpC126q.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC126r = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC126r.length; i++) {
                    if (item.getC126r().equals(String.valueOf(d_rdogrpC126r[i]))) {
                        rb = (RadioButton) rdogrpC126r.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC129 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC129.length; i++) {
                    if (item.getC129().equals(String.valueOf(d_rdogrpC129[i]))) {
                        rb = (RadioButton) rdogrpC129.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC130 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpC130.length; i++) {
                    if (item.getC130().equals(String.valueOf(d_rdogrpC130[i]))) {
                        rb = (RadioButton) rdogrpC130.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC131 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpC131.length; i++) {
                    if (item.getC131().equals(String.valueOf(d_rdogrpC131[i]))) {
                        rb = (RadioButton) rdogrpC131.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC134 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpC134.length; i++) {
                    if (item.getC134().equals(String.valueOf(d_rdogrpC134[i]))) {
                        rb = (RadioButton) rdogrpC134.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getC135a().equals("1")) {
                    chkC135a.setChecked(true);
                } else if (item.getC135a().equals("2")) {
                    chkC135a.setChecked(false);
                }
                if (item.getC135b().equals("1")) {
                    chkC135b.setChecked(true);
                } else if (item.getC135b().equals("2")) {
                    chkC135b.setChecked(false);
                }
                if (item.getC135c().equals("1")) {
                    chkC135c.setChecked(true);
                } else if (item.getC135c().equals("2")) {
                    chkC135c.setChecked(false);
                }
                if (item.getC135d().equals("1")) {
                    chkC135d.setChecked(true);
                } else if (item.getC135d().equals("2")) {
                    chkC135d.setChecked(false);
                }
                if (item.getC135e().equals("1")) {
                    chkC135e.setChecked(true);
                } else if (item.getC135e().equals("2")) {
                    chkC135e.setChecked(false);
                }
                txtC135eX.setText(item.getC135eX());
                String[] d_rdogrpC136 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpC136.length; i++) {
                    if (item.getC136().equals(String.valueOf(d_rdogrpC136[i]))) {
                        rb = (RadioButton) rdogrpC136.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getC137a().equals("1")) {
                    chkC137a.setChecked(true);
                } else if (item.getC137a().equals("2")) {
                    chkC137a.setChecked(false);
                }
                if (item.getC137b().equals("1")) {
                    chkC137b.setChecked(true);
                } else if (item.getC137b().equals("2")) {
                    chkC137b.setChecked(false);
                }
                if (item.getC137c().equals("1")) {
                    chkC137c.setChecked(true);
                } else if (item.getC137c().equals("2")) {
                    chkC137c.setChecked(false);
                }
                if (item.getC137d().equals("1")) {
                    chkC137d.setChecked(true);
                } else if (item.getC137d().equals("2")) {
                    chkC137d.setChecked(false);
                }
                if (item.getC137e().equals("1")) {
                    chkC137e.setChecked(true);
                } else if (item.getC137e().equals("2")) {
                    chkC137e.setChecked(false);
                }
                if (item.getC137f().equals("1")) {
                    chkC137f.setChecked(true);
                } else if (item.getC137f().equals("2")) {
                    chkC137f.setChecked(false);
                }
                if (item.getC137g().equals("1")) {
                    chkC137g.setChecked(true);
                } else if (item.getC137g().equals("2")) {
                    chkC137g.setChecked(false);
                }
                if (item.getC137h().equals("1")) {
                    chkC137h.setChecked(true);
                } else if (item.getC137h().equals("2")) {
                    chkC137h.setChecked(false);
                }
                if (item.getC137i().equals("1")) {
                    chkC137i.setChecked(true);
                } else if (item.getC137i().equals("2")) {
                    chkC137i.setChecked(false);
                }
                if (item.getC137j().equals("1")) {
                    chkC137j.setChecked(true);
                } else if (item.getC137j().equals("2")) {
                    chkC137j.setChecked(false);
                }
                if (item.getC137k().equals("1")) {
                    chkC137k.setChecked(true);
                } else if (item.getC137k().equals("2")) {
                    chkC137k.setChecked(false);
                }
                if (item.getC137l().equals("1")) {
                    chkC137l.setChecked(true);
                } else if (item.getC137l().equals("2")) {
                    chkC137l.setChecked(false);
                }
                if (item.getC137m().equals("1")) {
                    chkC137m.setChecked(true);
                } else if (item.getC137m().equals("2")) {
                    chkC137m.setChecked(false);
                }
                txtC137mX.setText(item.getC137mX());
                String[] d_rdogrpC138 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpC138.length; i++) {
                    if (item.getC138().equals(String.valueOf(d_rdogrpC138[i]))) {
                        rb = (RadioButton) rdogrpC138.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpC139 = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpC139.length; i++) {
                    if (item.getC139().equals(String.valueOf(d_rdogrpC139[i]))) {
                        rb = (RadioButton) rdogrpC139.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpBCG1 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpBCG1.length; i++) {
                    if (item.getBCG1().equals(String.valueOf(d_rdogrpBCG1[i]))) {
                        rb = (RadioButton) rdogrpBCG1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpBCG2 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpBCG2.length; i++) {
                    if (item.getBCG2().equals(String.valueOf(d_rdogrpBCG2[i]))) {
                        rb = (RadioButton) rdogrpBCG2.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpPenta1 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpPenta1.length; i++) {
                    if (item.getPenta1().equals(String.valueOf(d_rdogrpPenta1[i]))) {
                        rb = (RadioButton) rdogrpPenta1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpPenta2 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpPenta2.length; i++) {
                    if (item.getPenta2().equals(String.valueOf(d_rdogrpPenta2[i]))) {
                        rb = (RadioButton) rdogrpPenta2.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpPenta3 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpPenta3.length; i++) {
                    if (item.getPenta3().equals(String.valueOf(d_rdogrpPenta3[i]))) {
                        rb = (RadioButton) rdogrpPenta3.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpOPV1 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpOPV1.length; i++) {
                    if (item.getOPV1().equals(String.valueOf(d_rdogrpOPV1[i]))) {
                        rb = (RadioButton) rdogrpOPV1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpOPV2 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpOPV2.length; i++) {
                    if (item.getOPV2().equals(String.valueOf(d_rdogrpOPV2[i]))) {
                        rb = (RadioButton) rdogrpOPV2.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpOPV3 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpOPV3.length; i++) {
                    if (item.getOPV3().equals(String.valueOf(d_rdogrpOPV3[i]))) {
                        rb = (RadioButton) rdogrpOPV3.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpPCV1 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpPCV1.length; i++) {
                    if (item.getPCV1().equals(String.valueOf(d_rdogrpPCV1[i]))) {
                        rb = (RadioButton) rdogrpPCV1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpPCV2 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpPCV2.length; i++) {
                    if (item.getPCV2().equals(String.valueOf(d_rdogrpPCV2[i]))) {
                        rb = (RadioButton) rdogrpPCV2.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpPCV3 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpPCV3.length; i++) {
                    if (item.getPCV3().equals(String.valueOf(d_rdogrpPCV3[i]))) {
                        rb = (RadioButton) rdogrpPCV3.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpIPV = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpIPV.length; i++) {
                    if (item.getIPV().equals(String.valueOf(d_rdogrpIPV[i]))) {
                        rb = (RadioButton) rdogrpIPV.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpMR1 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpMR1.length; i++) {
                    if (item.getMR1().equals(String.valueOf(d_rdogrpMR1[i]))) {
                        rb = (RadioButton) rdogrpMR1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpMR2 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpMR2.length; i++) {
                    if (item.getMR2().equals(String.valueOf(d_rdogrpMR2[i]))) {
                        rb = (RadioButton) rdogrpMR2.getChildAt(i);
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
                spnC141.setSelection(Global.SpinnerItemPositionAnyLength(spnC141, item.getC141()));
                txtC141X.setText(item.getC141X());
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
            }
        } catch (Exception e) {
            Connection.MessageBox(FdHabit.this, e.getMessage());
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
        currentLocation  = location;
        currentLatitude  = currentLocation.getLatitude();
        currentLongitude = currentLocation.getLongitude();
    }


    // Method to turn on GPS
    public void turnGPSOn(){
        try
        {
            String provider = Settings.Secure.getString(getContentResolver(), Settings.Secure.LOCATION_PROVIDERS_ALLOWED);
            if(!provider.contains("gps")){ //if gps is disabled
                final Intent poke = new Intent();
                poke.setClassName("com.android.settings", "com.android.settings.widget.SettingsAppWidgetProvider");
                poke.addCategory(Intent.CATEGORY_ALTERNATIVE);
                poke.setData(Uri.parse("3"));
                sendBroadcast(poke);
            }
        }
        catch (Exception e) {
        }
    }

    // Method to turn off the GPS
    public void turnGPSOff(){
        String provider = Settings.Secure.getString(getContentResolver(), Settings.Secure.LOCATION_PROVIDERS_ALLOWED);

        if(provider.contains("gps")){ //if gps is enabled
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