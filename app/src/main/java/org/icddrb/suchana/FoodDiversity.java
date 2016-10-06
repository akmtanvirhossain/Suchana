package org.icddrb.suchana;

/**
 * Created by TanvirHossain on 05/10/2016.
 */


//Android Manifest Code
//<activity android:name=".FoodDiversity" android:label="FoodDiversity" />

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
import android.widget.Button;
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

public class FoodDiversity extends Activity {
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
    LinearLayout secM5;
    LinearLayout seclblM5;
    LinearLayout secM5a;
    View lineM5a;
    TextView VlblM5a;
    RadioGroup rdogrpM5a;
    RadioButton rdoM5a1;
    RadioButton rdoM5a2;
    LinearLayout secM5b;
    View lineM5b;
    TextView VlblM5b;
    RadioGroup rdogrpM5b;
    RadioButton rdoM5b1;
    RadioButton rdoM5b2;
    LinearLayout secM5C;
    View lineM5C;
    TextView VlblM5C;
    RadioGroup rdogrpM5C;
    RadioButton rdoM5C1;
    RadioButton rdoM5C2;
    LinearLayout secM5D;
    View lineM5D;
    TextView VlblM5D;
    RadioGroup rdogrpM5D;
    RadioButton rdoM5D1;
    RadioButton rdoM5D2;
    LinearLayout secM5E;
    View lineM5E;
    TextView VlblM5E;
    RadioGroup rdogrpM5E;
    RadioButton rdoM5E1;
    RadioButton rdoM5E2;
    LinearLayout secM5F;
    View lineM5F;
    TextView VlblM5F;
    RadioGroup rdogrpM5F;
    RadioButton rdoM5F1;
    RadioButton rdoM5F2;
    LinearLayout secM5G1;
    View lineM5G1;
    TextView VlblM5G1;
    RadioGroup rdogrpM5G1;
    RadioButton rdoM5G11;
    RadioButton rdoM5G12;
    LinearLayout secM5G2;
    View lineM5G2;
    TextView VlblM5G2;
    RadioGroup rdogrpM5G2;
    RadioButton rdoM5G21;
    RadioButton rdoM5G22;
    LinearLayout secM5G3;
    View lineM5G3;
    TextView VlblM5G3;
    RadioGroup rdogrpM5G3;
    RadioButton rdoM5G31;
    RadioButton rdoM5G32;
    LinearLayout secM5G4;
    View lineM5G4;
    TextView VlblM5G4;
    RadioGroup rdogrpM5G4;
    RadioButton rdoM5G41;
    RadioButton rdoM5G42;
    LinearLayout secM5H;
    View lineM5H;
    TextView VlblM5H;
    RadioGroup rdogrpM5H;
    RadioButton rdoM5H1;
    RadioButton rdoM5H2;
    LinearLayout secM5I;
    View lineM5I;
    TextView VlblM5I;
    RadioGroup rdogrpM5I;
    RadioButton rdoM5I1;
    RadioButton rdoM5I2;
    LinearLayout secM5J;
    View lineM5J;
    TextView VlblM5J;
    RadioGroup rdogrpM5J;
    RadioButton rdoM5J1;
    RadioButton rdoM5J2;
    LinearLayout secM5K;
    View lineM5K;
    TextView VlblM5K;
    RadioGroup rdogrpM5K;
    RadioButton rdoM5K1;
    RadioButton rdoM5K2;
    LinearLayout secM5L;
    View lineM5L;
    TextView VlblM5L;
    RadioGroup rdogrpM5L;
    RadioButton rdoM5L1;
    RadioButton rdoM5L2;
    LinearLayout secM5M;
    View lineM5M;
    TextView VlblM5M;
    RadioGroup rdogrpM5M;
    RadioButton rdoM5M1;
    RadioButton rdoM5M2;
    LinearLayout secM5N;
    View lineM5N;
    TextView VlblM5N;
    RadioGroup rdogrpM5N;
    RadioButton rdoM5N1;
    RadioButton rdoM5N2;
    LinearLayout secM5O;
    View lineM5O;
    TextView VlblM5O;
    RadioGroup rdogrpM5O;
    RadioButton rdoM5O1;
    RadioButton rdoM5O2;
    LinearLayout secM5P;
    View lineM5P;
    TextView VlblM5P;
    RadioGroup rdogrpM5P;
    RadioButton rdoM5P1;
    RadioButton rdoM5P2;
    String StartTime;
    Bundle IDbundle;
    ImageButton cmdForward;
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
            setContentView(R.layout.fooddiversity);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TableName = "FoodDiversity";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(FoodDiversity.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), DomViolance.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDbundle);
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
            cmdForward = (ImageButton) findViewById(R.id.cmdForward);
            cmdForward.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(FoodDiversity.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to start AssetB [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDBundle = new Bundle();
                            IDBundle.putString("Rnd", RND);
                            IDBundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), FdHabit.class);
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

            secM5 = (LinearLayout) findViewById(R.id.secM5);
            seclblM5 = (LinearLayout) findViewById(R.id.seclblM5);
            secM5a = (LinearLayout) findViewById(R.id.secM5a);
            lineM5a = (View) findViewById(R.id.lineM5a);
            VlblM5a = (TextView) findViewById(R.id.VlblM5a);
            rdogrpM5a = (RadioGroup) findViewById(R.id.rdogrpM5a);

            rdoM5a1 = (RadioButton) findViewById(R.id.rdoM5a1);
            rdoM5a2 = (RadioButton) findViewById(R.id.rdoM5a2);
            secM5b = (LinearLayout) findViewById(R.id.secM5b);
            lineM5b = (View) findViewById(R.id.lineM5b);
            VlblM5b = (TextView) findViewById(R.id.VlblM5b);
            rdogrpM5b = (RadioGroup) findViewById(R.id.rdogrpM5b);

            rdoM5b1 = (RadioButton) findViewById(R.id.rdoM5b1);
            rdoM5b2 = (RadioButton) findViewById(R.id.rdoM5b2);
            secM5C = (LinearLayout) findViewById(R.id.secM5C);
            lineM5C = (View) findViewById(R.id.lineM5C);
            VlblM5C = (TextView) findViewById(R.id.VlblM5C);
            rdogrpM5C = (RadioGroup) findViewById(R.id.rdogrpM5C);

            rdoM5C1 = (RadioButton) findViewById(R.id.rdoM5C1);
            rdoM5C2 = (RadioButton) findViewById(R.id.rdoM5C2);
            secM5D = (LinearLayout) findViewById(R.id.secM5D);
            lineM5D = (View) findViewById(R.id.lineM5D);
            VlblM5D = (TextView) findViewById(R.id.VlblM5D);
            rdogrpM5D = (RadioGroup) findViewById(R.id.rdogrpM5D);

            rdoM5D1 = (RadioButton) findViewById(R.id.rdoM5D1);
            rdoM5D2 = (RadioButton) findViewById(R.id.rdoM5D2);
            secM5E = (LinearLayout) findViewById(R.id.secM5E);
            lineM5E = (View) findViewById(R.id.lineM5E);
            VlblM5E = (TextView) findViewById(R.id.VlblM5E);
            rdogrpM5E = (RadioGroup) findViewById(R.id.rdogrpM5E);

            rdoM5E1 = (RadioButton) findViewById(R.id.rdoM5E1);
            rdoM5E2 = (RadioButton) findViewById(R.id.rdoM5E2);
            secM5F = (LinearLayout) findViewById(R.id.secM5F);
            lineM5F = (View) findViewById(R.id.lineM5F);
            VlblM5F = (TextView) findViewById(R.id.VlblM5F);
            rdogrpM5F = (RadioGroup) findViewById(R.id.rdogrpM5F);

            rdoM5F1 = (RadioButton) findViewById(R.id.rdoM5F1);
            rdoM5F2 = (RadioButton) findViewById(R.id.rdoM5F2);
            secM5G1 = (LinearLayout) findViewById(R.id.secM5G1);
            lineM5G1 = (View) findViewById(R.id.lineM5G1);
            VlblM5G1 = (TextView) findViewById(R.id.VlblM5G1);
            rdogrpM5G1 = (RadioGroup) findViewById(R.id.rdogrpM5G1);

            rdoM5G11 = (RadioButton) findViewById(R.id.rdoM5G11);
            rdoM5G12 = (RadioButton) findViewById(R.id.rdoM5G12);
            secM5G2 = (LinearLayout) findViewById(R.id.secM5G2);
            lineM5G2 = (View) findViewById(R.id.lineM5G2);
            VlblM5G2 = (TextView) findViewById(R.id.VlblM5G2);
            rdogrpM5G2 = (RadioGroup) findViewById(R.id.rdogrpM5G2);

            rdoM5G21 = (RadioButton) findViewById(R.id.rdoM5G21);
            rdoM5G22 = (RadioButton) findViewById(R.id.rdoM5G22);
            secM5G3 = (LinearLayout) findViewById(R.id.secM5G3);
            lineM5G3 = (View) findViewById(R.id.lineM5G3);
            VlblM5G3 = (TextView) findViewById(R.id.VlblM5G3);
            rdogrpM5G3 = (RadioGroup) findViewById(R.id.rdogrpM5G3);

            rdoM5G31 = (RadioButton) findViewById(R.id.rdoM5G31);
            rdoM5G32 = (RadioButton) findViewById(R.id.rdoM5G32);
            secM5G4 = (LinearLayout) findViewById(R.id.secM5G4);
            lineM5G4 = (View) findViewById(R.id.lineM5G4);
            VlblM5G4 = (TextView) findViewById(R.id.VlblM5G4);
            rdogrpM5G4 = (RadioGroup) findViewById(R.id.rdogrpM5G4);

            rdoM5G41 = (RadioButton) findViewById(R.id.rdoM5G41);
            rdoM5G42 = (RadioButton) findViewById(R.id.rdoM5G42);
            secM5H = (LinearLayout) findViewById(R.id.secM5H);
            lineM5H = (View) findViewById(R.id.lineM5H);
            VlblM5H = (TextView) findViewById(R.id.VlblM5H);
            rdogrpM5H = (RadioGroup) findViewById(R.id.rdogrpM5H);

            rdoM5H1 = (RadioButton) findViewById(R.id.rdoM5H1);
            rdoM5H2 = (RadioButton) findViewById(R.id.rdoM5H2);
            secM5I = (LinearLayout) findViewById(R.id.secM5I);
            lineM5I = (View) findViewById(R.id.lineM5I);
            VlblM5I = (TextView) findViewById(R.id.VlblM5I);
            rdogrpM5I = (RadioGroup) findViewById(R.id.rdogrpM5I);

            rdoM5I1 = (RadioButton) findViewById(R.id.rdoM5I1);
            rdoM5I2 = (RadioButton) findViewById(R.id.rdoM5I2);
            secM5J = (LinearLayout) findViewById(R.id.secM5J);
            lineM5J = (View) findViewById(R.id.lineM5J);
            VlblM5J = (TextView) findViewById(R.id.VlblM5J);
            rdogrpM5J = (RadioGroup) findViewById(R.id.rdogrpM5J);

            rdoM5J1 = (RadioButton) findViewById(R.id.rdoM5J1);
            rdoM5J2 = (RadioButton) findViewById(R.id.rdoM5J2);
            secM5K = (LinearLayout) findViewById(R.id.secM5K);
            lineM5K = (View) findViewById(R.id.lineM5K);
            VlblM5K = (TextView) findViewById(R.id.VlblM5K);
            rdogrpM5K = (RadioGroup) findViewById(R.id.rdogrpM5K);

            rdoM5K1 = (RadioButton) findViewById(R.id.rdoM5K1);
            rdoM5K2 = (RadioButton) findViewById(R.id.rdoM5K2);
            secM5L = (LinearLayout) findViewById(R.id.secM5L);
            lineM5L = (View) findViewById(R.id.lineM5L);
            VlblM5L = (TextView) findViewById(R.id.VlblM5L);
            rdogrpM5L = (RadioGroup) findViewById(R.id.rdogrpM5L);

            rdoM5L1 = (RadioButton) findViewById(R.id.rdoM5L1);
            rdoM5L2 = (RadioButton) findViewById(R.id.rdoM5L2);
            secM5M = (LinearLayout) findViewById(R.id.secM5M);
            lineM5M = (View) findViewById(R.id.lineM5M);
            VlblM5M = (TextView) findViewById(R.id.VlblM5M);
            rdogrpM5M = (RadioGroup) findViewById(R.id.rdogrpM5M);

            rdoM5M1 = (RadioButton) findViewById(R.id.rdoM5M1);
            rdoM5M2 = (RadioButton) findViewById(R.id.rdoM5M2);
            secM5N = (LinearLayout) findViewById(R.id.secM5N);
            lineM5N = (View) findViewById(R.id.lineM5N);
            VlblM5N = (TextView) findViewById(R.id.VlblM5N);
            rdogrpM5N = (RadioGroup) findViewById(R.id.rdogrpM5N);

            rdoM5N1 = (RadioButton) findViewById(R.id.rdoM5N1);
            rdoM5N2 = (RadioButton) findViewById(R.id.rdoM5N2);
            secM5O = (LinearLayout) findViewById(R.id.secM5O);
            lineM5O = (View) findViewById(R.id.lineM5O);
            VlblM5O = (TextView) findViewById(R.id.VlblM5O);
            rdogrpM5O = (RadioGroup) findViewById(R.id.rdogrpM5O);

            rdoM5O1 = (RadioButton) findViewById(R.id.rdoM5O1);
            rdoM5O2 = (RadioButton) findViewById(R.id.rdoM5O2);
            secM5P = (LinearLayout) findViewById(R.id.secM5P);
            lineM5P = (View) findViewById(R.id.lineM5P);
            VlblM5P = (TextView) findViewById(R.id.VlblM5P);
            rdogrpM5P = (RadioGroup) findViewById(R.id.rdogrpM5P);

            rdoM5P1 = (RadioButton) findViewById(R.id.rdoM5P1);
            rdoM5P2 = (RadioButton) findViewById(R.id.rdoM5P2);


            //Hide all skip variables
            DataSearch(RND, SUCHANAID);

            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(FoodDiversity.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(FoodDiversity.this, "Required field: রাউন্ড নম্বর.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(FoodDiversity.this, "Value should be between 1 and 5(রাউন্ড নম্বর).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(FoodDiversity.this, "Required field: উপকারভোগী সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (!rdoM5a1.isChecked() & !rdoM5a2.isChecked() & secM5a.isShown()) {
                Connection.MessageBox(FoodDiversity.this, "Select anyone options from (ভাত, রুটি, পাউরুটি, বিস্কিট অথবা শস্য হতে তৈরী খাবার ).");
                rdoM5a1.requestFocus();
                return;
            } else if (!rdoM5b1.isChecked() & !rdoM5b2.isChecked() & secM5b.isShown()) {
                Connection.MessageBox(FoodDiversity.this, "Select anyone options from (আলু অথবা মূল ও কন্দ থেকে তৈরী খাবার).");
                rdoM5b1.requestFocus();
                return;
            } else if (!rdoM5C1.isChecked() & !rdoM5C2.isChecked() & secM5C.isShown()) {
                Connection.MessageBox(FoodDiversity.this, "Select anyone options from (সিম, মটর, ডাল দ্বারা তৈরী খাবার ).");
                rdoM5C1.requestFocus();
                return;
            } else if (!rdoM5D1.isChecked() & !rdoM5D2.isChecked() & secM5D.isShown()) {
                Connection.MessageBox(FoodDiversity.this, "Select anyone options from (বাদাম অথবা বিচি দ্বারা তৈরী খাবার ).");
                rdoM5D1.requestFocus();
                return;
            } else if (!rdoM5E1.isChecked() & !rdoM5E2.isChecked() & secM5E.isShown()) {
                Connection.MessageBox(FoodDiversity.this, "Select anyone options from (দুধ, পনির, দই অথবা অন্যান্য দুগ্ধ জাতীয় খাবার ).");
                rdoM5E1.requestFocus();
                return;
            } else if (!rdoM5F1.isChecked() & !rdoM5F2.isChecked() & secM5F.isShown()) {
                Connection.MessageBox(FoodDiversity.this, "Select anyone options from (যে কোন  মাংস, যেমন যে কোন গরু, ভেড়া, ছাগল, মুরগি, হাঁস, খরগোশ, বুনো ছোট  প্রানী  অথবা অন্যান্য পাখি, কলিজা অথবা যেকোন অঙ্গের মাংস ).");
                rdoM5F1.requestFocus();
                return;
            } else if (!rdoM5G11.isChecked() & !rdoM5G12.isChecked() & secM5G1.isShown()) {
                Connection.MessageBox(FoodDiversity.this, "Select anyone options from (1) যে কোন ছোট  মাছ ).");
                rdoM5G11.requestFocus();
                return;
            } else if (!rdoM5G21.isChecked() & !rdoM5G22.isChecked() & secM5G2.isShown()) {
                Connection.MessageBox(FoodDiversity.this, "Select anyone options from (2) যে কোন বড় মাছ).");
                rdoM5G21.requestFocus();
                return;
            } else if (!rdoM5G31.isChecked() & !rdoM5G32.isChecked() & secM5G3.isShown()) {
                Connection.MessageBox(FoodDiversity.this, "Select anyone options from (3) শুটকি মাছ ).");
                rdoM5G31.requestFocus();
                return;
            } else if (!rdoM5G41.isChecked() & !rdoM5G42.isChecked() & secM5G4.isShown()) {
                Connection.MessageBox(FoodDiversity.this, "Select anyone options from (4) খোলস ত্তয়ালা মাছ ).");
                rdoM5G41.requestFocus();
                return;
            } else if (!rdoM5H1.isChecked() & !rdoM5H2.isChecked() & secM5H.isShown()) {
                Connection.MessageBox(FoodDiversity.this, "Select anyone options from (ডিম ).");
                rdoM5H1.requestFocus();
                return;
            } else if (!rdoM5I1.isChecked() & !rdoM5I2.isChecked() & secM5I.isShown()) {
                Connection.MessageBox(FoodDiversity.this, "Select anyone options from (ভিটামিন এ সমৃদ্ধ ফল যেমন আম ও পেপে ).");
                rdoM5I1.requestFocus();
                return;
            } else if (!rdoM5J1.isChecked() & !rdoM5J2.isChecked() & secM5J.isShown()) {
                Connection.MessageBox(FoodDiversity.this, "Select anyone options from (ভিটামিন এ সমৃদ্ধ সবজি যেমন গাজর ও মিষ্টি আলু).");
                rdoM5J1.requestFocus();
                return;
            } else if (!rdoM5K1.isChecked() & !rdoM5K2.isChecked() & secM5K.isShown()) {
                Connection.MessageBox(FoodDiversity.this, "Select anyone options from (গাঢ় সবুজ শাক সবজি ).");
                rdoM5K1.requestFocus();
                return;
            } else if (!rdoM5L1.isChecked() & !rdoM5L2.isChecked() & secM5L.isShown()) {
                Connection.MessageBox(FoodDiversity.this, "Select anyone options from (অন্যান্য কোন সবজি ).");
                rdoM5L1.requestFocus();
                return;
            } else if (!rdoM5M1.isChecked() & !rdoM5M2.isChecked() & secM5M.isShown()) {
                Connection.MessageBox(FoodDiversity.this, "Select anyone options from (অন্যান্য কোন ফল ).");
                rdoM5M1.requestFocus();
                return;
            } else if (!rdoM5N1.isChecked() & !rdoM5N2.isChecked() & secM5N.isShown()) {
                Connection.MessageBox(FoodDiversity.this, "Select anyone options from (তেল, চর্বি অথবা এর দ্বারা তৈরী খাদ্য ).");
                rdoM5N1.requestFocus();
                return;
            } else if (!rdoM5O1.isChecked() & !rdoM5O2.isChecked() & secM5O.isShown()) {
                Connection.MessageBox(FoodDiversity.this, "Select anyone options from (চিনি অথবা মধু).");
                rdoM5O1.requestFocus();
                return;
            } else if (!rdoM5P1.isChecked() & !rdoM5P2.isChecked() & secM5P.isShown()) {
                Connection.MessageBox(FoodDiversity.this, "Select anyone options from (অন্যান্য খাবার যেমন মশলা, চা).");
                rdoM5P1.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            FoodDiversity_DataModel objSave = new FoodDiversity_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            String[] d_rdogrpM5a = new String[]{"1", "0"};
            objSave.setM5a("");
            for (int i = 0; i < rdogrpM5a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM5a.getChildAt(i);
                if (rb.isChecked()) objSave.setM5a(d_rdogrpM5a[i]);
            }

            String[] d_rdogrpM5b = new String[]{"1", "0"};
            objSave.setM5b("");
            for (int i = 0; i < rdogrpM5b.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM5b.getChildAt(i);
                if (rb.isChecked()) objSave.setM5b(d_rdogrpM5b[i]);
            }

            String[] d_rdogrpM5C = new String[]{"1", "0"};
            objSave.setM5C("");
            for (int i = 0; i < rdogrpM5C.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM5C.getChildAt(i);
                if (rb.isChecked()) objSave.setM5C(d_rdogrpM5C[i]);
            }

            String[] d_rdogrpM5D = new String[]{"1", "0"};
            objSave.setM5D("");
            for (int i = 0; i < rdogrpM5D.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM5D.getChildAt(i);
                if (rb.isChecked()) objSave.setM5D(d_rdogrpM5D[i]);
            }

            String[] d_rdogrpM5E = new String[]{"1", "0"};
            objSave.setM5E("");
            for (int i = 0; i < rdogrpM5E.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM5E.getChildAt(i);
                if (rb.isChecked()) objSave.setM5E(d_rdogrpM5E[i]);
            }

            String[] d_rdogrpM5F = new String[]{"1", "0"};
            objSave.setM5F("");
            for (int i = 0; i < rdogrpM5F.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM5F.getChildAt(i);
                if (rb.isChecked()) objSave.setM5F(d_rdogrpM5F[i]);
            }

            String[] d_rdogrpM5G1 = new String[]{"1", "0"};
            objSave.setM5G1("");
            for (int i = 0; i < rdogrpM5G1.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM5G1.getChildAt(i);
                if (rb.isChecked()) objSave.setM5G1(d_rdogrpM5G1[i]);
            }

            String[] d_rdogrpM5G2 = new String[]{"1", "0"};
            objSave.setM5G2("");
            for (int i = 0; i < rdogrpM5G2.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM5G2.getChildAt(i);
                if (rb.isChecked()) objSave.setM5G2(d_rdogrpM5G2[i]);
            }

            String[] d_rdogrpM5G3 = new String[]{"1", "0"};
            objSave.setM5G3("");
            for (int i = 0; i < rdogrpM5G3.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM5G3.getChildAt(i);
                if (rb.isChecked()) objSave.setM5G3(d_rdogrpM5G3[i]);
            }

            String[] d_rdogrpM5G4 = new String[]{"1", "0"};
            objSave.setM5G4("");
            for (int i = 0; i < rdogrpM5G4.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM5G4.getChildAt(i);
                if (rb.isChecked()) objSave.setM5G4(d_rdogrpM5G4[i]);
            }

            String[] d_rdogrpM5H = new String[]{"1", "0"};
            objSave.setM5H("");
            for (int i = 0; i < rdogrpM5H.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM5H.getChildAt(i);
                if (rb.isChecked()) objSave.setM5H(d_rdogrpM5H[i]);
            }

            String[] d_rdogrpM5I = new String[]{"1", "0"};
            objSave.setM5I("");
            for (int i = 0; i < rdogrpM5I.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM5I.getChildAt(i);
                if (rb.isChecked()) objSave.setM5I(d_rdogrpM5I[i]);
            }

            String[] d_rdogrpM5J = new String[]{"1", "0"};
            objSave.setM5J("");
            for (int i = 0; i < rdogrpM5J.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM5J.getChildAt(i);
                if (rb.isChecked()) objSave.setM5J(d_rdogrpM5J[i]);
            }

            String[] d_rdogrpM5K = new String[]{"1", "0"};
            objSave.setM5K("");
            for (int i = 0; i < rdogrpM5K.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM5K.getChildAt(i);
                if (rb.isChecked()) objSave.setM5K(d_rdogrpM5K[i]);
            }

            String[] d_rdogrpM5L = new String[]{"1", "0"};
            objSave.setM5L("");
            for (int i = 0; i < rdogrpM5L.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM5L.getChildAt(i);
                if (rb.isChecked()) objSave.setM5L(d_rdogrpM5L[i]);
            }

            String[] d_rdogrpM5M = new String[]{"1", "0"};
            objSave.setM5M("");
            for (int i = 0; i < rdogrpM5M.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM5M.getChildAt(i);
                if (rb.isChecked()) objSave.setM5M(d_rdogrpM5M[i]);
            }

            String[] d_rdogrpM5N = new String[]{"1", "0"};
            objSave.setM5N("");
            for (int i = 0; i < rdogrpM5N.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM5N.getChildAt(i);
                if (rb.isChecked()) objSave.setM5N(d_rdogrpM5N[i]);
            }

            String[] d_rdogrpM5O = new String[]{"1", "0"};
            objSave.setM5O("");
            for (int i = 0; i < rdogrpM5O.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM5O.getChildAt(i);
                if (rb.isChecked()) objSave.setM5O(d_rdogrpM5O[i]);
            }

            String[] d_rdogrpM5P = new String[]{"1", "0"};
            objSave.setM5P("");
            for (int i = 0; i < rdogrpM5P.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM5P.getChildAt(i);
                if (rb.isChecked()) objSave.setM5P(d_rdogrpM5P[i]);
            }

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
                startActivity(new Intent(FoodDiversity.this, FdHabit.class).putExtras(IDBundle));

            } else {
                Connection.MessageBox(FoodDiversity.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(FoodDiversity.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            FoodDiversity_DataModel d = new FoodDiversity_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<FoodDiversity_DataModel> data = d.SelectAll(this, SQL);
            for (FoodDiversity_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                String[] d_rdogrpM5a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM5a.length; i++) {
                    if (item.getM5a().equals(String.valueOf(d_rdogrpM5a[i]))) {
                        rb = (RadioButton) rdogrpM5a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM5b = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM5b.length; i++) {
                    if (item.getM5b().equals(String.valueOf(d_rdogrpM5b[i]))) {
                        rb = (RadioButton) rdogrpM5b.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM5C = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM5C.length; i++) {
                    if (item.getM5C().equals(String.valueOf(d_rdogrpM5C[i]))) {
                        rb = (RadioButton) rdogrpM5C.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM5D = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM5D.length; i++) {
                    if (item.getM5D().equals(String.valueOf(d_rdogrpM5D[i]))) {
                        rb = (RadioButton) rdogrpM5D.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM5E = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM5E.length; i++) {
                    if (item.getM5E().equals(String.valueOf(d_rdogrpM5E[i]))) {
                        rb = (RadioButton) rdogrpM5E.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM5F = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM5F.length; i++) {
                    if (item.getM5F().equals(String.valueOf(d_rdogrpM5F[i]))) {
                        rb = (RadioButton) rdogrpM5F.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM5G1 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM5G1.length; i++) {
                    if (item.getM5G1().equals(String.valueOf(d_rdogrpM5G1[i]))) {
                        rb = (RadioButton) rdogrpM5G1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM5G2 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM5G2.length; i++) {
                    if (item.getM5G2().equals(String.valueOf(d_rdogrpM5G2[i]))) {
                        rb = (RadioButton) rdogrpM5G2.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM5G3 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM5G3.length; i++) {
                    if (item.getM5G3().equals(String.valueOf(d_rdogrpM5G3[i]))) {
                        rb = (RadioButton) rdogrpM5G3.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM5G4 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM5G4.length; i++) {
                    if (item.getM5G4().equals(String.valueOf(d_rdogrpM5G4[i]))) {
                        rb = (RadioButton) rdogrpM5G4.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM5H = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM5H.length; i++) {
                    if (item.getM5H().equals(String.valueOf(d_rdogrpM5H[i]))) {
                        rb = (RadioButton) rdogrpM5H.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM5I = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM5I.length; i++) {
                    if (item.getM5I().equals(String.valueOf(d_rdogrpM5I[i]))) {
                        rb = (RadioButton) rdogrpM5I.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM5J = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM5J.length; i++) {
                    if (item.getM5J().equals(String.valueOf(d_rdogrpM5J[i]))) {
                        rb = (RadioButton) rdogrpM5J.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM5K = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM5K.length; i++) {
                    if (item.getM5K().equals(String.valueOf(d_rdogrpM5K[i]))) {
                        rb = (RadioButton) rdogrpM5K.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM5L = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM5L.length; i++) {
                    if (item.getM5L().equals(String.valueOf(d_rdogrpM5L[i]))) {
                        rb = (RadioButton) rdogrpM5L.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM5M = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM5M.length; i++) {
                    if (item.getM5M().equals(String.valueOf(d_rdogrpM5M[i]))) {
                        rb = (RadioButton) rdogrpM5M.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM5N = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM5N.length; i++) {
                    if (item.getM5N().equals(String.valueOf(d_rdogrpM5N[i]))) {
                        rb = (RadioButton) rdogrpM5N.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM5O = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM5O.length; i++) {
                    if (item.getM5O().equals(String.valueOf(d_rdogrpM5O[i]))) {
                        rb = (RadioButton) rdogrpM5O.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM5P = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM5P.length; i++) {
                    if (item.getM5P().equals(String.valueOf(d_rdogrpM5P[i]))) {
                        rb = (RadioButton) rdogrpM5P.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
            }
        } catch (Exception e) {
            Connection.MessageBox(FoodDiversity.this, e.getMessage());
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