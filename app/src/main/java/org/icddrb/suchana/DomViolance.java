package org.icddrb.suchana;

/**
 * Created by TanvirHossain on 05/10/2016.
 */


//Android Manifest Code
//<activity android:name=".DomViolance" android:label="DomViolance" />

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

public class DomViolance extends Activity {
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
    LinearLayout secLbM42;
    LinearLayout secM421;
    View lineM421;
    TextView VlblM421;
    RadioGroup rdogrpM421;
    RadioButton rdoM4211;
    RadioButton rdoM4212;
    RadioButton rdoM4213;
    LinearLayout secM422;
    View lineM422;
    TextView VlblM422;
    RadioGroup rdogrpM422;
    RadioButton rdoM4221;
    RadioButton rdoM4222;
    RadioButton rdoM4223;
    LinearLayout secMLb423;
    LinearLayout secM4231;
    View lineM4231;
    TextView VlblM4231;
    RadioGroup rdogrpM4231;
    RadioButton rdoM42311;
    RadioButton rdoM42312;
    LinearLayout secM4232;
    View lineM4232;
    TextView VlblM4232;
    RadioGroup rdogrpM4232;
    RadioButton rdoM42321;
    RadioButton rdoM42322;
    LinearLayout secM4233;
    View lineM4233;
    TextView VlblM4233;
    RadioGroup rdogrpM4233;
    RadioButton rdoM42331;
    RadioButton rdoM42332;
    LinearLayout secM4234;
    View lineM4234;
    TextView VlblM4234;
    RadioGroup rdogrpM4234;
    RadioButton rdoM42341;
    RadioButton rdoM42342;
    LinearLayout secM4235;
    View lineM4235;
    TextView VlblM4235;
    RadioGroup rdogrpM4235;
    RadioButton rdoM42351;
    RadioButton rdoM42352;
    LinearLayout secM4236;
    View lineM4236;
    TextView VlblM4236;
    RadioGroup rdogrpM4236;
    RadioButton rdoM42361;
    RadioButton rdoM42362;
    LinearLayout secM4237;
    View lineM4237;
    TextView VlblM4237;
    RadioGroup rdogrpM4237;
    RadioButton rdoM42371;
    RadioButton rdoM42372;
    LinearLayout secM4238;
    View lineM4238;
    TextView VlblM4238;
    RadioGroup rdogrpM4238;
    RadioButton rdoM42381;
    RadioButton rdoM42382;
    LinearLayout secM4239;
    View lineM4239;
    TextView VlblM4239;
    RadioGroup rdogrpM4239;
    RadioButton rdoM42391;
    RadioButton rdoM42392;
    LinearLayout secLbM424;
    LinearLayout secM424a;
    View lineM424a;
    TextView VlblM424a;
    RadioGroup rdogrpM424a;
    RadioButton rdoM424a1;
    RadioButton rdoM424a2;
    RadioButton rdoM424a3;
    LinearLayout secM424b;
    View lineM424b;
    TextView VlblM424b;
    RadioGroup rdogrpM424b;
    RadioButton rdoM424b1;
    RadioButton rdoM424b2;
    RadioButton rdoM424b3;
    LinearLayout secM424c;
    View lineM424c;
    TextView VlblM424c;
    RadioGroup rdogrpM424c;
    RadioButton rdoM424c1;
    RadioButton rdoM424c2;
    RadioButton rdoM424c3;
    LinearLayout secM424d;
    View lineM424d;
    TextView VlblM424d;
    RadioGroup rdogrpM424d;
    RadioButton rdoM424d1;
    RadioButton rdoM424d2;
    RadioButton rdoM424d3;
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


           /* dtpDate.setText(new StringBuilder()
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
            setContentView(R.layout.domviolance);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TableName = "DomViolance";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(DomViolance.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), WomenEmp.class);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(DomViolance.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to start AssetB [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDBundle = new Bundle();
                            IDBundle.putString("Rnd", RND);
                            IDBundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), FoodDiversity.class);
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

            secLbM42 = (LinearLayout) findViewById(R.id.secLbM42);
            secM421 = (LinearLayout) findViewById(R.id.secM421);
            lineM421 = (View) findViewById(R.id.lineM421);
            VlblM421 = (TextView) findViewById(R.id.VlblM421);
            rdogrpM421 = (RadioGroup) findViewById(R.id.rdogrpM421);

            rdoM4211 = (RadioButton) findViewById(R.id.rdoM4211);
            rdoM4212 = (RadioButton) findViewById(R.id.rdoM4212);
            rdoM4213 = (RadioButton) findViewById(R.id.rdoM4213);
            secM422 = (LinearLayout) findViewById(R.id.secM422);
            lineM422 = (View) findViewById(R.id.lineM422);
            VlblM422 = (TextView) findViewById(R.id.VlblM422);
            rdogrpM422 = (RadioGroup) findViewById(R.id.rdogrpM422);

            rdoM4221 = (RadioButton) findViewById(R.id.rdoM4221);
            rdoM4222 = (RadioButton) findViewById(R.id.rdoM4222);
            rdoM4223 = (RadioButton) findViewById(R.id.rdoM4223);
            secMLb423 = (LinearLayout) findViewById(R.id.secMLb423);
            secM4231 = (LinearLayout) findViewById(R.id.secM4231);
            lineM4231 = (View) findViewById(R.id.lineM4231);
            VlblM4231 = (TextView) findViewById(R.id.VlblM4231);
            rdogrpM4231 = (RadioGroup) findViewById(R.id.rdogrpM4231);

            rdoM42311 = (RadioButton) findViewById(R.id.rdoM42311);
            rdoM42312 = (RadioButton) findViewById(R.id.rdoM42312);
            secM4232 = (LinearLayout) findViewById(R.id.secM4232);
            lineM4232 = (View) findViewById(R.id.lineM4232);
            VlblM4232 = (TextView) findViewById(R.id.VlblM4232);
            rdogrpM4232 = (RadioGroup) findViewById(R.id.rdogrpM4232);

            rdoM42321 = (RadioButton) findViewById(R.id.rdoM42321);
            rdoM42322 = (RadioButton) findViewById(R.id.rdoM42322);
            secM4233 = (LinearLayout) findViewById(R.id.secM4233);
            lineM4233 = (View) findViewById(R.id.lineM4233);
            VlblM4233 = (TextView) findViewById(R.id.VlblM4233);
            rdogrpM4233 = (RadioGroup) findViewById(R.id.rdogrpM4233);

            rdoM42331 = (RadioButton) findViewById(R.id.rdoM42331);
            rdoM42332 = (RadioButton) findViewById(R.id.rdoM42332);
            secM4234 = (LinearLayout) findViewById(R.id.secM4234);
            lineM4234 = (View) findViewById(R.id.lineM4234);
            VlblM4234 = (TextView) findViewById(R.id.VlblM4234);
            rdogrpM4234 = (RadioGroup) findViewById(R.id.rdogrpM4234);

            rdoM42341 = (RadioButton) findViewById(R.id.rdoM42341);
            rdoM42342 = (RadioButton) findViewById(R.id.rdoM42342);
            secM4235 = (LinearLayout) findViewById(R.id.secM4235);
            lineM4235 = (View) findViewById(R.id.lineM4235);
            VlblM4235 = (TextView) findViewById(R.id.VlblM4235);
            rdogrpM4235 = (RadioGroup) findViewById(R.id.rdogrpM4235);

            rdoM42351 = (RadioButton) findViewById(R.id.rdoM42351);
            rdoM42352 = (RadioButton) findViewById(R.id.rdoM42352);
            secM4236 = (LinearLayout) findViewById(R.id.secM4236);
            lineM4236 = (View) findViewById(R.id.lineM4236);
            VlblM4236 = (TextView) findViewById(R.id.VlblM4236);
            rdogrpM4236 = (RadioGroup) findViewById(R.id.rdogrpM4236);

            rdoM42361 = (RadioButton) findViewById(R.id.rdoM42361);
            rdoM42362 = (RadioButton) findViewById(R.id.rdoM42362);
            secM4237 = (LinearLayout) findViewById(R.id.secM4237);
            lineM4237 = (View) findViewById(R.id.lineM4237);
            VlblM4237 = (TextView) findViewById(R.id.VlblM4237);
            rdogrpM4237 = (RadioGroup) findViewById(R.id.rdogrpM4237);

            rdoM42371 = (RadioButton) findViewById(R.id.rdoM42371);
            rdoM42372 = (RadioButton) findViewById(R.id.rdoM42372);
            secM4238 = (LinearLayout) findViewById(R.id.secM4238);
            lineM4238 = (View) findViewById(R.id.lineM4238);
            VlblM4238 = (TextView) findViewById(R.id.VlblM4238);
            rdogrpM4238 = (RadioGroup) findViewById(R.id.rdogrpM4238);

            rdoM42381 = (RadioButton) findViewById(R.id.rdoM42381);
            rdoM42382 = (RadioButton) findViewById(R.id.rdoM42382);
            secM4239 = (LinearLayout) findViewById(R.id.secM4239);
            lineM4239 = (View) findViewById(R.id.lineM4239);
            VlblM4239 = (TextView) findViewById(R.id.VlblM4239);
            rdogrpM4239 = (RadioGroup) findViewById(R.id.rdogrpM4239);

            rdoM42391 = (RadioButton) findViewById(R.id.rdoM42391);
            rdoM42392 = (RadioButton) findViewById(R.id.rdoM42392);
            secLbM424 = (LinearLayout) findViewById(R.id.secLbM424);
            secM424a = (LinearLayout) findViewById(R.id.secM424a);
            lineM424a = (View) findViewById(R.id.lineM424a);
            VlblM424a = (TextView) findViewById(R.id.VlblM424a);
            rdogrpM424a = (RadioGroup) findViewById(R.id.rdogrpM424a);

            rdoM424a1 = (RadioButton) findViewById(R.id.rdoM424a1);
            rdoM424a2 = (RadioButton) findViewById(R.id.rdoM424a2);
            rdoM424a3 = (RadioButton) findViewById(R.id.rdoM424a3);
            secM424b = (LinearLayout) findViewById(R.id.secM424b);
            lineM424b = (View) findViewById(R.id.lineM424b);
            VlblM424b = (TextView) findViewById(R.id.VlblM424b);
            rdogrpM424b = (RadioGroup) findViewById(R.id.rdogrpM424b);

            rdoM424b1 = (RadioButton) findViewById(R.id.rdoM424b1);
            rdoM424b2 = (RadioButton) findViewById(R.id.rdoM424b2);
            rdoM424b3 = (RadioButton) findViewById(R.id.rdoM424b3);
            secM424c = (LinearLayout) findViewById(R.id.secM424c);
            lineM424c = (View) findViewById(R.id.lineM424c);
            VlblM424c = (TextView) findViewById(R.id.VlblM424c);
            rdogrpM424c = (RadioGroup) findViewById(R.id.rdogrpM424c);

            rdoM424c1 = (RadioButton) findViewById(R.id.rdoM424c1);
            rdoM424c2 = (RadioButton) findViewById(R.id.rdoM424c2);
            rdoM424c3 = (RadioButton) findViewById(R.id.rdoM424c3);
            secM424d = (LinearLayout) findViewById(R.id.secM424d);
            lineM424d = (View) findViewById(R.id.lineM424d);
            VlblM424d = (TextView) findViewById(R.id.VlblM424d);
            rdogrpM424d = (RadioGroup) findViewById(R.id.rdogrpM424d);

            rdoM424d1 = (RadioButton) findViewById(R.id.rdoM424d1);
            rdoM424d2 = (RadioButton) findViewById(R.id.rdoM424d2);
            rdoM424d3 = (RadioButton) findViewById(R.id.rdoM424d3);


            //Hide all skip variables

            DataSearch(RND, SUCHANAID);

            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(DomViolance.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(DomViolance.this, "Required field: রাউন্ড নম্বর.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(DomViolance.this, "Value should be between 1 and 5(রাউন্ড নম্বর).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(DomViolance.this, "Required field: উপকারভোগী সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (!rdoM4211.isChecked() & !rdoM4212.isChecked() & !rdoM4213.isChecked() & secM421.isShown()) {
                Connection.MessageBox(DomViolance.this, "Select anyone options from (আপনি কি সন্তুষ্ট যে, খানায় আপনার অবদান কে বাড়ির পুরুষ সদস্যরা সম্মান করেন?).");
                rdoM4211.requestFocus();
                return;
            } else if (!rdoM4221.isChecked() & !rdoM4222.isChecked() & !rdoM4223.isChecked() & secM422.isShown()) {
                Connection.MessageBox(DomViolance.this, "Select anyone options from (আপনি কি সন্তুষ্ট যে খানায় আপনার অবদান কে  প্রতিবেশী অন্য সদস্যরা সম্মান করেন?).");
                rdoM4221.requestFocus();
                return;
            } else if (!rdoM42311.isChecked() & !rdoM42312.isChecked() & secM4231.isShown()) {
                Connection.MessageBox(DomViolance.this, "Select anyone options from (1) রান্নাবান্না ).");
                rdoM42311.requestFocus();
                return;
            } else if (!rdoM42321.isChecked() & !rdoM42322.isChecked() & secM4232.isShown()) {
                Connection.MessageBox(DomViolance.this, "Select anyone options from (2) পানি অথবা লাকড়ি আনা ).");
                rdoM42321.requestFocus();
                return;
            } else if (!rdoM42331.isChecked() & !rdoM42332.isChecked() & secM4233.isShown()) {
                Connection.MessageBox(DomViolance.this, "Select anyone options from (3) ধোয়ামোছা করা ).");
                rdoM42331.requestFocus();
                return;
            } else if (!rdoM42341.isChecked() & !rdoM42342.isChecked() & secM4234.isShown()) {
                Connection.MessageBox(DomViolance.this, "Select anyone options from (4) সন্তানের যত্ন নেয়া ).");
                rdoM42341.requestFocus();
                return;
            } else if (!rdoM42351.isChecked() & !rdoM42352.isChecked() & secM4235.isShown()) {
                Connection.MessageBox(DomViolance.this, "Select anyone options from (5) কৃষিকাজে ).");
                rdoM42351.requestFocus();
                return;
            } else if (!rdoM42361.isChecked() & !rdoM42362.isChecked() & secM4236.isShown()) {
                Connection.MessageBox(DomViolance.this, "Select anyone options from (6) বাজারে/হাটে যাওয়া ).");
                rdoM42361.requestFocus();
                return;
            } else if (!rdoM42371.isChecked() & !rdoM42372.isChecked() & secM4237.isShown()) {
                Connection.MessageBox(DomViolance.this, "Select anyone options from (7) ভিটামাটিতে উৎপাদিত পণ্য যেমন ফল, শাক ইত্যাদি ).");
                rdoM42371.requestFocus();
                return;
            } else if (!rdoM42381.isChecked() & !rdoM42382.isChecked() & secM4238.isShown()) {
                Connection.MessageBox(DomViolance.this, "Select anyone options from (8) ভিটামাটিতে বাগান/ ফসল করা ).");
                rdoM42381.requestFocus();
                return;
            } else if (!rdoM42391.isChecked() & !rdoM42392.isChecked() & secM4239.isShown()) {
                Connection.MessageBox(DomViolance.this, "Select anyone options from (9) ভিটামাটিতে হাঁস/মুরগি পালা ).");
                rdoM42391.requestFocus();
                return;
            } else if (!rdoM424a1.isChecked() & !rdoM424a2.isChecked() & !rdoM424a3.isChecked() & secM424a.isShown()) {
                Connection.MessageBox(DomViolance.this, "Select anyone options from (a) আপনার স্বামী কি আপনাকে তালাক দেয়ার হুমকি দিয়েছিল).");
                rdoM424a1.requestFocus();
                return;
            } else if (!rdoM424b1.isChecked() & !rdoM424b2.isChecked() & !rdoM424b3.isChecked() & secM424b.isShown()) {
                Connection.MessageBox(DomViolance.this, "Select anyone options from (b) আপনার স্বামী কি আপনাকে অন্য আরেকটি বিয়ে করবে বলে  হুমকি দিয়েছিল).");
                rdoM424b1.requestFocus();
                return;
            } else if (!rdoM424c1.isChecked() & !rdoM424c2.isChecked() & !rdoM424c3.isChecked() & secM424c.isShown()) {
                Connection.MessageBox(DomViolance.this, "Select anyone options from (c) স্বামী, পরিবারের অন্য সদস্য, অথবা খানার বাসিন্দা আপনাকে কি গালমন্দ করেছে).");
                rdoM424c1.requestFocus();
                return;
            } else if (!rdoM424d1.isChecked() & !rdoM424d2.isChecked() & !rdoM424d3.isChecked() & secM424d.isShown()) {
                Connection.MessageBox(DomViolance.this, "Select anyone options from (d) স্বামী, পরিবারের অন্য সদস্য, অথবা খানার বাসিন্দা আপনাকে কি শারীরিকভাবে নির্যাতন করেছে).");
                rdoM424d1.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            DomViolance_DataModel objSave = new DomViolance_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            String[] d_rdogrpM421 = new String[]{"1", "0", "3"};
            objSave.setM421("");
            for (int i = 0; i < rdogrpM421.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM421.getChildAt(i);
                if (rb.isChecked()) objSave.setM421(d_rdogrpM421[i]);
            }

            String[] d_rdogrpM422 = new String[]{"1", "0", "3"};
            objSave.setM422("");
            for (int i = 0; i < rdogrpM422.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM422.getChildAt(i);
                if (rb.isChecked()) objSave.setM422(d_rdogrpM422[i]);
            }

            String[] d_rdogrpM4231 = new String[]{"1", "0"};
            objSave.setM4231("");
            for (int i = 0; i < rdogrpM4231.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM4231.getChildAt(i);
                if (rb.isChecked()) objSave.setM4231(d_rdogrpM4231[i]);
            }

            String[] d_rdogrpM4232 = new String[]{"1", "0"};
            objSave.setM4232("");
            for (int i = 0; i < rdogrpM4232.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM4232.getChildAt(i);
                if (rb.isChecked()) objSave.setM4232(d_rdogrpM4232[i]);
            }

            String[] d_rdogrpM4233 = new String[]{"1", "0"};
            objSave.setM4233("");
            for (int i = 0; i < rdogrpM4233.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM4233.getChildAt(i);
                if (rb.isChecked()) objSave.setM4233(d_rdogrpM4233[i]);
            }

            String[] d_rdogrpM4234 = new String[]{"1", "0"};
            objSave.setM4234("");
            for (int i = 0; i < rdogrpM4234.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM4234.getChildAt(i);
                if (rb.isChecked()) objSave.setM4234(d_rdogrpM4234[i]);
            }

            String[] d_rdogrpM4235 = new String[]{"1", "0"};
            objSave.setM4235("");
            for (int i = 0; i < rdogrpM4235.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM4235.getChildAt(i);
                if (rb.isChecked()) objSave.setM4235(d_rdogrpM4235[i]);
            }

            String[] d_rdogrpM4236 = new String[]{"1", "0"};
            objSave.setM4236("");
            for (int i = 0; i < rdogrpM4236.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM4236.getChildAt(i);
                if (rb.isChecked()) objSave.setM4236(d_rdogrpM4236[i]);
            }

            String[] d_rdogrpM4237 = new String[]{"1", "0"};
            objSave.setM4237("");
            for (int i = 0; i < rdogrpM4237.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM4237.getChildAt(i);
                if (rb.isChecked()) objSave.setM4237(d_rdogrpM4237[i]);
            }

            String[] d_rdogrpM4238 = new String[]{"1", "0"};
            objSave.setM4238("");
            for (int i = 0; i < rdogrpM4238.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM4238.getChildAt(i);
                if (rb.isChecked()) objSave.setM4238(d_rdogrpM4238[i]);
            }

            String[] d_rdogrpM4239 = new String[]{"1", "0"};
            objSave.setM4239("");
            for (int i = 0; i < rdogrpM4239.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM4239.getChildAt(i);
                if (rb.isChecked()) objSave.setM4239(d_rdogrpM4239[i]);
            }

            String[] d_rdogrpM424a = new String[]{"1", "2", "0"};
            objSave.setM424a("");
            for (int i = 0; i < rdogrpM424a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM424a.getChildAt(i);
                if (rb.isChecked()) objSave.setM424a(d_rdogrpM424a[i]);
            }

            String[] d_rdogrpM424b = new String[]{"1", "2", "0"};
            objSave.setM424b("");
            for (int i = 0; i < rdogrpM424b.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM424b.getChildAt(i);
                if (rb.isChecked()) objSave.setM424b(d_rdogrpM424b[i]);
            }

            String[] d_rdogrpM424c = new String[]{"1", "2", "0"};
            objSave.setM424c("");
            for (int i = 0; i < rdogrpM424c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM424c.getChildAt(i);
                if (rb.isChecked()) objSave.setM424c(d_rdogrpM424c[i]);
            }

            String[] d_rdogrpM424d = new String[]{"1", "2", "0"};
            objSave.setM424d("");
            for (int i = 0; i < rdogrpM424d.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM424d.getChildAt(i);
                if (rb.isChecked()) objSave.setM424d(d_rdogrpM424d[i]);
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
                Connection.MessageBox(DomViolance.this, "Saved Successfully");
            } else {
                Connection.MessageBox(DomViolance.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(DomViolance.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            DomViolance_DataModel d = new DomViolance_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<DomViolance_DataModel> data = d.SelectAll(this, SQL);
            for (DomViolance_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                String[] d_rdogrpM421 = new String[]{"1", "0", "3"};
                for (int i = 0; i < d_rdogrpM421.length; i++) {
                    if (item.getM421().equals(String.valueOf(d_rdogrpM421[i]))) {
                        rb = (RadioButton) rdogrpM421.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM422 = new String[]{"1", "0", "3"};
                for (int i = 0; i < d_rdogrpM422.length; i++) {
                    if (item.getM422().equals(String.valueOf(d_rdogrpM422[i]))) {
                        rb = (RadioButton) rdogrpM422.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM4231 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM4231.length; i++) {
                    if (item.getM4231().equals(String.valueOf(d_rdogrpM4231[i]))) {
                        rb = (RadioButton) rdogrpM4231.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM4232 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM4232.length; i++) {
                    if (item.getM4232().equals(String.valueOf(d_rdogrpM4232[i]))) {
                        rb = (RadioButton) rdogrpM4232.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM4233 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM4233.length; i++) {
                    if (item.getM4233().equals(String.valueOf(d_rdogrpM4233[i]))) {
                        rb = (RadioButton) rdogrpM4233.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM4234 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM4234.length; i++) {
                    if (item.getM4234().equals(String.valueOf(d_rdogrpM4234[i]))) {
                        rb = (RadioButton) rdogrpM4234.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM4235 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM4235.length; i++) {
                    if (item.getM4235().equals(String.valueOf(d_rdogrpM4235[i]))) {
                        rb = (RadioButton) rdogrpM4235.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM4236 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM4236.length; i++) {
                    if (item.getM4236().equals(String.valueOf(d_rdogrpM4236[i]))) {
                        rb = (RadioButton) rdogrpM4236.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM4237 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM4237.length; i++) {
                    if (item.getM4237().equals(String.valueOf(d_rdogrpM4237[i]))) {
                        rb = (RadioButton) rdogrpM4237.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM4238 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM4238.length; i++) {
                    if (item.getM4238().equals(String.valueOf(d_rdogrpM4238[i]))) {
                        rb = (RadioButton) rdogrpM4238.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM4239 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM4239.length; i++) {
                    if (item.getM4239().equals(String.valueOf(d_rdogrpM4239[i]))) {
                        rb = (RadioButton) rdogrpM4239.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM424a = new String[]{"1", "2", "0"};
                for (int i = 0; i < d_rdogrpM424a.length; i++) {
                    if (item.getM424a().equals(String.valueOf(d_rdogrpM424a[i]))) {
                        rb = (RadioButton) rdogrpM424a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM424b = new String[]{"1", "2", "0"};
                for (int i = 0; i < d_rdogrpM424b.length; i++) {
                    if (item.getM424b().equals(String.valueOf(d_rdogrpM424b[i]))) {
                        rb = (RadioButton) rdogrpM424b.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM424c = new String[]{"1", "2", "0"};
                for (int i = 0; i < d_rdogrpM424c.length; i++) {
                    if (item.getM424c().equals(String.valueOf(d_rdogrpM424c[i]))) {
                        rb = (RadioButton) rdogrpM424c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM424d = new String[]{"1", "2", "0"};
                for (int i = 0; i < d_rdogrpM424d.length; i++) {
                    if (item.getM424d().equals(String.valueOf(d_rdogrpM424d[i]))) {
                        rb = (RadioButton) rdogrpM424d.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
            }
        } catch (Exception e) {
            Connection.MessageBox(DomViolance.this, e.getMessage());
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