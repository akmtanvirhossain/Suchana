package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".HFIAS" android:label="HFIAS" />

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

public class HFIAS extends Activity {
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
    LinearLayout seclbl12;
    LinearLayout secH121;
    TextView VlblH121;
    RadioGroup rdogrpH121;
    RadioButton rdoH1211;
    RadioButton rdoH1212;
    LinearLayout secH122;
    TextView VlblH122;
    RadioGroup rdogrpH122;
    RadioButton rdoH1221;
    RadioButton rdoH1222;
    RadioButton rdoH1223;
    LinearLayout secH123;
    TextView VlblH123;
    RadioGroup rdogrpH123;
    RadioButton rdoH1231;
    RadioButton rdoH1232;
    LinearLayout secH124;
    TextView VlblH124;
    RadioGroup rdogrpH124;
    RadioButton rdoH1241;
    RadioButton rdoH1242;
    LinearLayout secH125;
    TextView VlblH125;
    RadioGroup rdogrpH125;
    RadioButton rdoH1251;
    RadioButton rdoH1252;
    LinearLayout secH126;
    TextView VlblH126;
    RadioGroup rdogrpH126;
    RadioButton rdoH1261;
    RadioButton rdoH1262;
    RadioButton rdoH1263;
    LinearLayout secH127;
    TextView VlblH127;
    RadioGroup rdogrpH127;
    RadioButton rdoH1271;
    RadioButton rdoH1272;
    LinearLayout secH128;
    TextView VlblH128;
    RadioGroup rdogrpH128;
    RadioButton rdoH1281;
    RadioButton rdoH1282;
    RadioButton rdoH1283;
    LinearLayout secH129;
    TextView VlblH129;
    RadioGroup rdogrpH129;
    RadioButton rdoH1291;
    RadioButton rdoH1292;
    LinearLayout secH1210;
    TextView VlblH1210;
    RadioGroup rdogrpH1210;
    RadioButton rdoH12101;
    RadioButton rdoH12102;
    RadioButton rdoH12103;
    LinearLayout secH1211;
    TextView VlblH1211;
    RadioGroup rdogrpH1211;
    RadioButton rdoH12111;
    RadioButton rdoH12112;
    LinearLayout secH1212;
    TextView VlblH1212;
    RadioGroup rdogrpH1212;
    RadioButton rdoH12121;
    RadioButton rdoH12122;
    RadioButton rdoH12123;
    LinearLayout secH1213;
    TextView VlblH1213;
    RadioGroup rdogrpH1213;
    RadioButton rdoH12131;
    RadioButton rdoH12132;
    LinearLayout secH1214;
    TextView VlblH1214;
    RadioGroup rdogrpH1214;
    RadioButton rdoH12141;
    RadioButton rdoH12142;
    RadioButton rdoH12143;
    LinearLayout secH1215;
    TextView VlblH1215;
    RadioGroup rdogrpH1215;
    RadioButton rdoH12151;
    RadioButton rdoH12152;
    LinearLayout secH1216;
    TextView VlblH1216;
    RadioGroup rdogrpH1216;
    RadioButton rdoH12161;
    RadioButton rdoH12162;
    RadioButton rdoH12163;
    LinearLayout secH1217;
    TextView VlblH1217;
    RadioGroup rdogrpH1217;
    RadioButton rdoH12171;
    RadioButton rdoH12172;
    LinearLayout secH1218;
    TextView VlblH1218;
    RadioGroup rdogrpH1218;
    RadioButton rdoH12181;
    RadioButton rdoH12182;
    RadioButton rdoH12183;
    LinearLayout seclb13;
    LinearLayout secH131;
    TextView VlblH131;
    RadioGroup rdogrpH131;
    RadioButton rdoH1311;
    RadioButton rdoH1312;
    LinearLayout secH132A;
    TextView VlblH132A;
    CheckBox chkH132A;
    LinearLayout secH132B;
    TextView VlblH132B;
    CheckBox chkH132B;
    LinearLayout secH132C;
    TextView VlblH132C;
    CheckBox chkH132C;
    LinearLayout secH132D;
    TextView VlblH132D;
    CheckBox chkH132D;
    LinearLayout secH132E;
    TextView VlblH132E;
    CheckBox chkH132E;
    LinearLayout secH132F;
    TextView VlblH132F;
    CheckBox chkH132F;
    LinearLayout secH132G;
    TextView VlblH132G;
    CheckBox chkH132G;
    LinearLayout secH132H;
    TextView VlblH132H;
    CheckBox chkH132H;
    LinearLayout secH132I;
    TextView VlblH132I;
    CheckBox chkH132I;
    LinearLayout secH132J;
    TextView VlblH132J;
    CheckBox chkH132J;
    LinearLayout secH132K;
    TextView VlblH132K;
    CheckBox chkH132K;
    LinearLayout secH132L;
    TextView VlblH132L;
    CheckBox chkH132L;
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
            setContentView(R.layout.hfias);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TableName = "HFIAS";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(HFIAS.this);
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
            seclbl12 = (LinearLayout) findViewById(R.id.seclbl12);
            secH121 = (LinearLayout) findViewById(R.id.secH121);
            VlblH121 = (TextView) findViewById(R.id.VlblH121);
            rdogrpH121 = (RadioGroup) findViewById(R.id.rdogrpH121);

            rdoH1211 = (RadioButton) findViewById(R.id.rdoH1211);
            rdoH1212 = (RadioButton) findViewById(R.id.rdoH1212);
            rdogrpH121.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH121 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH121.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH121.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH121[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH122.setVisibility(View.GONE);
                        rdogrpH122.clearCheck();
                        secH123.setVisibility(View.GONE);
                        rdogrpH123.clearCheck();
                        secH124.setVisibility(View.GONE);
                        rdogrpH124.clearCheck();
                        secH125.setVisibility(View.GONE);
                        rdogrpH125.clearCheck();
                        secH126.setVisibility(View.GONE);
                        rdogrpH126.clearCheck();
                        secH127.setVisibility(View.GONE);
                        rdogrpH127.clearCheck();
                        secH128.setVisibility(View.GONE);
                        rdogrpH128.clearCheck();
                    } else {
                        secH122.setVisibility(View.VISIBLE);
                        secH123.setVisibility(View.VISIBLE);
                        secH124.setVisibility(View.VISIBLE);
                        secH125.setVisibility(View.VISIBLE);
                        secH126.setVisibility(View.VISIBLE);
                        secH127.setVisibility(View.VISIBLE);
                        secH128.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH122 = (LinearLayout) findViewById(R.id.secH122);
            VlblH122 = (TextView) findViewById(R.id.VlblH122);
            rdogrpH122 = (RadioGroup) findViewById(R.id.rdogrpH122);

            rdoH1221 = (RadioButton) findViewById(R.id.rdoH1221);
            rdoH1222 = (RadioButton) findViewById(R.id.rdoH1222);
            rdoH1223 = (RadioButton) findViewById(R.id.rdoH1223);
            secH123 = (LinearLayout) findViewById(R.id.secH123);
            VlblH123 = (TextView) findViewById(R.id.VlblH123);
            rdogrpH123 = (RadioGroup) findViewById(R.id.rdogrpH123);

            rdoH1231 = (RadioButton) findViewById(R.id.rdoH1231);
            rdoH1232 = (RadioButton) findViewById(R.id.rdoH1232);
            secH124 = (LinearLayout) findViewById(R.id.secH124);
            VlblH124 = (TextView) findViewById(R.id.VlblH124);
            rdogrpH124 = (RadioGroup) findViewById(R.id.rdogrpH124);

            rdoH1241 = (RadioButton) findViewById(R.id.rdoH1241);
            rdoH1242 = (RadioButton) findViewById(R.id.rdoH1242);
            secH125 = (LinearLayout) findViewById(R.id.secH125);
            VlblH125 = (TextView) findViewById(R.id.VlblH125);
            rdogrpH125 = (RadioGroup) findViewById(R.id.rdogrpH125);

            rdoH1251 = (RadioButton) findViewById(R.id.rdoH1251);
            rdoH1252 = (RadioButton) findViewById(R.id.rdoH1252);
            secH126 = (LinearLayout) findViewById(R.id.secH126);
            VlblH126 = (TextView) findViewById(R.id.VlblH126);
            rdogrpH126 = (RadioGroup) findViewById(R.id.rdogrpH126);

            rdoH1261 = (RadioButton) findViewById(R.id.rdoH1261);
            rdoH1262 = (RadioButton) findViewById(R.id.rdoH1262);
            rdoH1263 = (RadioButton) findViewById(R.id.rdoH1263);
            secH127 = (LinearLayout) findViewById(R.id.secH127);
            VlblH127 = (TextView) findViewById(R.id.VlblH127);
            rdogrpH127 = (RadioGroup) findViewById(R.id.rdogrpH127);

            rdoH1271 = (RadioButton) findViewById(R.id.rdoH1271);
            rdoH1272 = (RadioButton) findViewById(R.id.rdoH1272);
            secH128 = (LinearLayout) findViewById(R.id.secH128);
            VlblH128 = (TextView) findViewById(R.id.VlblH128);
            rdogrpH128 = (RadioGroup) findViewById(R.id.rdogrpH128);

            rdoH1281 = (RadioButton) findViewById(R.id.rdoH1281);
            rdoH1282 = (RadioButton) findViewById(R.id.rdoH1282);
            rdoH1283 = (RadioButton) findViewById(R.id.rdoH1283);
            secH129 = (LinearLayout) findViewById(R.id.secH129);
            VlblH129 = (TextView) findViewById(R.id.VlblH129);
            rdogrpH129 = (RadioGroup) findViewById(R.id.rdogrpH129);

            rdoH1291 = (RadioButton) findViewById(R.id.rdoH1291);
            rdoH1292 = (RadioButton) findViewById(R.id.rdoH1292);
            rdogrpH129.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH129 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH129.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH129.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH129[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH1210.setVisibility(View.GONE);
                        rdogrpH1210.clearCheck();
                        secH1211.setVisibility(View.GONE);
                        rdogrpH1211.clearCheck();
                        secH1212.setVisibility(View.GONE);
                        rdogrpH1212.clearCheck();
                        secH1213.setVisibility(View.GONE);
                        rdogrpH1213.clearCheck();
                        secH1214.setVisibility(View.GONE);
                        rdogrpH1214.clearCheck();
                        secH1215.setVisibility(View.GONE);
                        rdogrpH1215.clearCheck();
                        secH1216.setVisibility(View.GONE);
                        rdogrpH1216.clearCheck();
                        secH1217.setVisibility(View.GONE);
                        rdogrpH1217.clearCheck();
                        secH1218.setVisibility(View.GONE);
                        rdogrpH1218.clearCheck();
                    } else {
                        secH1210.setVisibility(View.VISIBLE);
                        secH1211.setVisibility(View.VISIBLE);
                        secH1212.setVisibility(View.VISIBLE);
                        secH1213.setVisibility(View.VISIBLE);
                        secH1214.setVisibility(View.VISIBLE);
                        secH1215.setVisibility(View.VISIBLE);
                        secH1216.setVisibility(View.VISIBLE);
                        secH1217.setVisibility(View.VISIBLE);
                        secH1218.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH1210 = (LinearLayout) findViewById(R.id.secH1210);
            VlblH1210 = (TextView) findViewById(R.id.VlblH1210);
            rdogrpH1210 = (RadioGroup) findViewById(R.id.rdogrpH1210);

            rdoH12101 = (RadioButton) findViewById(R.id.rdoH12101);
            rdoH12102 = (RadioButton) findViewById(R.id.rdoH12102);
            rdoH12103 = (RadioButton) findViewById(R.id.rdoH12103);
            secH1211 = (LinearLayout) findViewById(R.id.secH1211);
            VlblH1211 = (TextView) findViewById(R.id.VlblH1211);
            rdogrpH1211 = (RadioGroup) findViewById(R.id.rdogrpH1211);

            rdoH12111 = (RadioButton) findViewById(R.id.rdoH12111);
            rdoH12112 = (RadioButton) findViewById(R.id.rdoH12112);
            secH1212 = (LinearLayout) findViewById(R.id.secH1212);
            VlblH1212 = (TextView) findViewById(R.id.VlblH1212);
            rdogrpH1212 = (RadioGroup) findViewById(R.id.rdogrpH1212);

            rdoH12121 = (RadioButton) findViewById(R.id.rdoH12121);
            rdoH12122 = (RadioButton) findViewById(R.id.rdoH12122);
            rdoH12123 = (RadioButton) findViewById(R.id.rdoH12123);
            secH1213 = (LinearLayout) findViewById(R.id.secH1213);
            VlblH1213 = (TextView) findViewById(R.id.VlblH1213);
            rdogrpH1213 = (RadioGroup) findViewById(R.id.rdogrpH1213);

            rdoH12131 = (RadioButton) findViewById(R.id.rdoH12131);
            rdoH12132 = (RadioButton) findViewById(R.id.rdoH12132);
            secH1214 = (LinearLayout) findViewById(R.id.secH1214);
            VlblH1214 = (TextView) findViewById(R.id.VlblH1214);
            rdogrpH1214 = (RadioGroup) findViewById(R.id.rdogrpH1214);

            rdoH12141 = (RadioButton) findViewById(R.id.rdoH12141);
            rdoH12142 = (RadioButton) findViewById(R.id.rdoH12142);
            rdoH12143 = (RadioButton) findViewById(R.id.rdoH12143);
            secH1215 = (LinearLayout) findViewById(R.id.secH1215);
            VlblH1215 = (TextView) findViewById(R.id.VlblH1215);
            rdogrpH1215 = (RadioGroup) findViewById(R.id.rdogrpH1215);

            rdoH12151 = (RadioButton) findViewById(R.id.rdoH12151);
            rdoH12152 = (RadioButton) findViewById(R.id.rdoH12152);
            secH1216 = (LinearLayout) findViewById(R.id.secH1216);
            VlblH1216 = (TextView) findViewById(R.id.VlblH1216);
            rdogrpH1216 = (RadioGroup) findViewById(R.id.rdogrpH1216);

            rdoH12161 = (RadioButton) findViewById(R.id.rdoH12161);
            rdoH12162 = (RadioButton) findViewById(R.id.rdoH12162);
            rdoH12163 = (RadioButton) findViewById(R.id.rdoH12163);
            secH1217 = (LinearLayout) findViewById(R.id.secH1217);
            VlblH1217 = (TextView) findViewById(R.id.VlblH1217);
            rdogrpH1217 = (RadioGroup) findViewById(R.id.rdogrpH1217);

            rdoH12171 = (RadioButton) findViewById(R.id.rdoH12171);
            rdoH12172 = (RadioButton) findViewById(R.id.rdoH12172);
            secH1218 = (LinearLayout) findViewById(R.id.secH1218);
            VlblH1218 = (TextView) findViewById(R.id.VlblH1218);
            rdogrpH1218 = (RadioGroup) findViewById(R.id.rdogrpH1218);

            rdoH12181 = (RadioButton) findViewById(R.id.rdoH12181);
            rdoH12182 = (RadioButton) findViewById(R.id.rdoH12182);
            rdoH12183 = (RadioButton) findViewById(R.id.rdoH12183);
            seclb13 = (LinearLayout) findViewById(R.id.seclb13);
            secH131 = (LinearLayout) findViewById(R.id.secH131);
            VlblH131 = (TextView) findViewById(R.id.VlblH131);
            rdogrpH131 = (RadioGroup) findViewById(R.id.rdogrpH131);

            rdoH1311 = (RadioButton) findViewById(R.id.rdoH1311);
            rdoH1312 = (RadioButton) findViewById(R.id.rdoH1312);
            secH132A = (LinearLayout) findViewById(R.id.secH132A);
            VlblH132A = (TextView) findViewById(R.id.VlblH132A);
            chkH132A = (CheckBox) findViewById(R.id.chkH132A);
            secH132B = (LinearLayout) findViewById(R.id.secH132B);
            VlblH132B = (TextView) findViewById(R.id.VlblH132B);
            chkH132B = (CheckBox) findViewById(R.id.chkH132B);
            secH132C = (LinearLayout) findViewById(R.id.secH132C);
            VlblH132C = (TextView) findViewById(R.id.VlblH132C);
            chkH132C = (CheckBox) findViewById(R.id.chkH132C);
            secH132D = (LinearLayout) findViewById(R.id.secH132D);
            VlblH132D = (TextView) findViewById(R.id.VlblH132D);
            chkH132D = (CheckBox) findViewById(R.id.chkH132D);
            secH132E = (LinearLayout) findViewById(R.id.secH132E);
            VlblH132E = (TextView) findViewById(R.id.VlblH132E);
            chkH132E = (CheckBox) findViewById(R.id.chkH132E);
            secH132F = (LinearLayout) findViewById(R.id.secH132F);
            VlblH132F = (TextView) findViewById(R.id.VlblH132F);
            chkH132F = (CheckBox) findViewById(R.id.chkH132F);
            secH132G = (LinearLayout) findViewById(R.id.secH132G);
            VlblH132G = (TextView) findViewById(R.id.VlblH132G);
            chkH132G = (CheckBox) findViewById(R.id.chkH132G);
            secH132H = (LinearLayout) findViewById(R.id.secH132H);
            VlblH132H = (TextView) findViewById(R.id.VlblH132H);
            chkH132H = (CheckBox) findViewById(R.id.chkH132H);
            secH132I = (LinearLayout) findViewById(R.id.secH132I);
            VlblH132I = (TextView) findViewById(R.id.VlblH132I);
            chkH132I = (CheckBox) findViewById(R.id.chkH132I);
            secH132J = (LinearLayout) findViewById(R.id.secH132J);
            VlblH132J = (TextView) findViewById(R.id.VlblH132J);
            chkH132J = (CheckBox) findViewById(R.id.chkH132J);
            secH132K = (LinearLayout) findViewById(R.id.secH132K);
            VlblH132K = (TextView) findViewById(R.id.VlblH132K);
            chkH132K = (CheckBox) findViewById(R.id.chkH132K);
            secH132L = (LinearLayout) findViewById(R.id.secH132L);
            VlblH132L = (TextView) findViewById(R.id.VlblH132L);
            chkH132L = (CheckBox) findViewById(R.id.chkH132L);

            DataSearch(RND, SUCHANAID);

            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(HFIAS.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(HFIAS.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(HFIAS.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(HFIAS.this, "Required field: উপকারভোগী সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (!rdoH1211.isChecked() & !rdoH1212.isChecked() & secH121.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (গত চার সপ্তাহে আপনি আপনার খানায় পর্যাপ্ত খাদ্য থাকবেনা এই রকম দুশ্চিন্তায় ছিলেন কি  ).");
                rdoH1211.requestFocus();
                return;
            } else if (!rdoH1221.isChecked() & !rdoH1222.isChecked() & !rdoH1223.isChecked() & secH122.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (কতবার এইরূপ ঘটেছে).");
                rdoH1221.requestFocus();
                return;
            } else if (!rdoH1231.isChecked() & !rdoH1232.isChecked() & secH123.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (গত চার সপ্তাহে এমন হয়েছিল কি আপনি বা আপনার খানার কোনো সদস্যকে খাবার বা টাকার অভাবের কারণে যা খাবার সাধারণত খান তা খেতেপারেননি).");
                rdoH1231.requestFocus();
                return;
            } else if (!rdoH1241.isChecked() & !rdoH1242.isChecked() & secH124.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (কতবার এইরূপ ঘটেছে).");
                rdoH1241.requestFocus();
                return;
            } else if (!rdoH1251.isChecked() & !rdoH1252.isChecked() & secH125.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (গত চার সপ্তাহে এমন হয়েছিল কি  যা খাবার কেনার টাকা না থাকার কারণে সীমিত প্রকারের খাবার খেতে হয়েছে).");
                rdoH1251.requestFocus();
                return;
            } else if (!rdoH1261.isChecked() & !rdoH1262.isChecked() & !rdoH1263.isChecked() & secH126.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (কতবার এইরূপ ঘটেছে).");
                rdoH1261.requestFocus();
                return;
            } else if (!rdoH1271.isChecked() & !rdoH1272.isChecked() & secH127.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (গত চার সপ্তাহে এমন হয়েছিল কি আপনি বা আপনার খানার কোনো সদস্যকে খাবার কেনার টাকা না থাকার কারণে এমন কোনো খাবার খেতে হয়েছে যা আপনি সাধারণতখান না).");
                rdoH1271.requestFocus();
                return;
            } else if (!rdoH1281.isChecked() & !rdoH1282.isChecked() & !rdoH1283.isChecked() & secH128.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (কতবার এইরূপ ঘটেছে).");
                rdoH1281.requestFocus();
                return;
            } else if (!rdoH1291.isChecked() & !rdoH1292.isChecked() & secH129.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (খানায় পর্যাপ্ত খাবার বাখাবার কেনার টাকা না থাকার কারণে গত এক মাসে আপনি বা আপনার খানার কোনো সদস্যকে কি কোনো বেলা সাধারণত যতটুকু খান তার তুলনায় কম খেতে হয়েছিল).");
                rdoH1291.requestFocus();
                return;
            } else if (!rdoH12101.isChecked() & !rdoH12102.isChecked() & !rdoH12103.isChecked() & secH1210.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (কতবার এইরূপ ঘটেছে).");
                rdoH12101.requestFocus();
                return;
            } else if (!rdoH12111.isChecked() & !rdoH12112.isChecked() & secH1211.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (গত এক মাসে আপনি বা আপনার খানার কোনো সদস্যকে খাবারের অভাব বা খাবার কেনার টাকা না থাকার কারণে কি কোনো বেলা না খেয়ে থাকতে হয়েছিল ).");
                rdoH12111.requestFocus();
                return;
            } else if (!rdoH12121.isChecked() & !rdoH12122.isChecked() & !rdoH12123.isChecked() & secH1212.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (কতবার এইরূপ ঘটেছে).");
                rdoH12121.requestFocus();
                return;
            } else if (!rdoH12131.isChecked() & !rdoH12132.isChecked() & secH1213.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (গত এক মাসে কখনো কি আপনার ঘরের খাবার শেষ হয়ে গিয়েছিল এবং ঐদিন খাবার কেনার কোনো টাকাও ছিলনা ).");
                rdoH12131.requestFocus();
                return;
            } else if (!rdoH12141.isChecked() & !rdoH12142.isChecked() & !rdoH12143.isChecked() & secH1214.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (কতবার এইরূপ ঘটেছে).");
                rdoH12141.requestFocus();
                return;
            } else if (!rdoH12151.isChecked() & !rdoH12152.isChecked() & secH1215.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (গত এক মাসে কি কখনো এমন হয়েছিল যে আপনাকে অথবা খানার কোনো সদস্য কে অভাবের কারণে ক্ষুধার্ত অভুক্ত অবস্থায় রাতে ঘুমাতে যেতে হয়েছিল ).");
                rdoH12151.requestFocus();
                return;
            } else if (!rdoH12161.isChecked() & !rdoH12162.isChecked() & !rdoH12163.isChecked() & secH1216.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (কতবার এইরূপ ঘটেছে).");
                rdoH12161.requestFocus();
                return;
            } else if (!rdoH12171.isChecked() & !rdoH12172.isChecked() & secH1217.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (গত এক মাসেকি কখনো এমন হয়েছিল যে আপনি বা আপনার খানার কোনো সদস্যকে খাবারের অভাবের কারণে না খেয়ে সারাদিন রাতকাটাতেহয়েছিল ).");
                rdoH12171.requestFocus();
                return;
            } else if (!rdoH12181.isChecked() & !rdoH12182.isChecked() & !rdoH12183.isChecked() & secH1218.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (কতবার এইরূপ ঘটেছে).");
                rdoH12181.requestFocus();
                return;
            } else if (!rdoH1311.isChecked() & !rdoH1312.isChecked() & secH131.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (বিগত 1year এরমধ্যে এমন কি কোনো মাস ছিল যখন পরিবারের প্রয়োজন মিটাবার জন্যে পর্যাপ্ত খাদ্য আপনার ছিলনা উত্তরদাত্রী যদি হ্যাঁ বলেন বাক্স এ 1 বসান, যদিউত্তর না হয়তব 0 বসান).");
                rdoH1311.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            HFIAS_DataModel objSave = new HFIAS_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            String[] d_rdogrpH121 = new String[]{"1", "0"};
            objSave.setH121("");
            for (int i = 0; i < rdogrpH121.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH121.getChildAt(i);
                if (rb.isChecked()) objSave.setH121(d_rdogrpH121[i]);
            }

            String[] d_rdogrpH122 = new String[]{"1", "2", "3"};
            objSave.setH122("");
            for (int i = 0; i < rdogrpH122.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH122.getChildAt(i);
                if (rb.isChecked()) objSave.setH122(d_rdogrpH122[i]);
            }

            String[] d_rdogrpH123 = new String[]{"1", "0"};
            objSave.setH123("");
            for (int i = 0; i < rdogrpH123.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH123.getChildAt(i);
                if (rb.isChecked()) objSave.setH123(d_rdogrpH123[i]);
            }

            String[] d_rdogrpH124 = new String[]{"1", "0"};
            objSave.setH124("");
            for (int i = 0; i < rdogrpH124.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH124.getChildAt(i);
                if (rb.isChecked()) objSave.setH124(d_rdogrpH124[i]);
            }

            String[] d_rdogrpH125 = new String[]{"1", "0"};
            objSave.setH125("");
            for (int i = 0; i < rdogrpH125.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH125.getChildAt(i);
                if (rb.isChecked()) objSave.setH125(d_rdogrpH125[i]);
            }

            String[] d_rdogrpH126 = new String[]{"1", "2", "3"};
            objSave.setH126("");
            for (int i = 0; i < rdogrpH126.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH126.getChildAt(i);
                if (rb.isChecked()) objSave.setH126(d_rdogrpH126[i]);
            }

            String[] d_rdogrpH127 = new String[]{"1", "0"};
            objSave.setH127("");
            for (int i = 0; i < rdogrpH127.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH127.getChildAt(i);
                if (rb.isChecked()) objSave.setH127(d_rdogrpH127[i]);
            }

            String[] d_rdogrpH128 = new String[]{"1", "2", "3"};
            objSave.setH128("");
            for (int i = 0; i < rdogrpH128.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH128.getChildAt(i);
                if (rb.isChecked()) objSave.setH128(d_rdogrpH128[i]);
            }

            String[] d_rdogrpH129 = new String[]{"1", "0"};
            objSave.setH129("");
            for (int i = 0; i < rdogrpH129.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH129.getChildAt(i);
                if (rb.isChecked()) objSave.setH129(d_rdogrpH129[i]);
            }

            String[] d_rdogrpH1210 = new String[]{"1", "2", "3"};
            objSave.setH1210("");
            for (int i = 0; i < rdogrpH1210.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH1210.getChildAt(i);
                if (rb.isChecked()) objSave.setH1210(d_rdogrpH1210[i]);
            }

            String[] d_rdogrpH1211 = new String[]{"1", "0"};
            objSave.setH1211("");
            for (int i = 0; i < rdogrpH1211.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH1211.getChildAt(i);
                if (rb.isChecked()) objSave.setH1211(d_rdogrpH1211[i]);
            }

            String[] d_rdogrpH1212 = new String[]{"1", "2", "3"};
            objSave.setH1212("");
            for (int i = 0; i < rdogrpH1212.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH1212.getChildAt(i);
                if (rb.isChecked()) objSave.setH1212(d_rdogrpH1212[i]);
            }

            String[] d_rdogrpH1213 = new String[]{"1", "0"};
            objSave.setH1213("");
            for (int i = 0; i < rdogrpH1213.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH1213.getChildAt(i);
                if (rb.isChecked()) objSave.setH1213(d_rdogrpH1213[i]);
            }

            String[] d_rdogrpH1214 = new String[]{"1", "2", "3"};
            objSave.setH1214("");
            for (int i = 0; i < rdogrpH1214.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH1214.getChildAt(i);
                if (rb.isChecked()) objSave.setH1214(d_rdogrpH1214[i]);
            }

            String[] d_rdogrpH1215 = new String[]{"1", "0"};
            objSave.setH1215("");
            for (int i = 0; i < rdogrpH1215.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH1215.getChildAt(i);
                if (rb.isChecked()) objSave.setH1215(d_rdogrpH1215[i]);
            }

            String[] d_rdogrpH1216 = new String[]{"1", "2", "3"};
            objSave.setH1216("");
            for (int i = 0; i < rdogrpH1216.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH1216.getChildAt(i);
                if (rb.isChecked()) objSave.setH1216(d_rdogrpH1216[i]);
            }

            String[] d_rdogrpH1217 = new String[]{"1", "0"};
            objSave.setH1217("");
            for (int i = 0; i < rdogrpH1217.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH1217.getChildAt(i);
                if (rb.isChecked()) objSave.setH1217(d_rdogrpH1217[i]);
            }

            String[] d_rdogrpH1218 = new String[]{"1", "2", "3"};
            objSave.setH1218("");
            for (int i = 0; i < rdogrpH1218.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH1218.getChildAt(i);
                if (rb.isChecked()) objSave.setH1218(d_rdogrpH1218[i]);
            }

            String[] d_rdogrpH131 = new String[]{"1", "0"};
            objSave.setH131("");
            for (int i = 0; i < rdogrpH131.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH131.getChildAt(i);
                if (rb.isChecked()) objSave.setH131(d_rdogrpH131[i]);
            }

            objSave.setH132A((chkH132A.isChecked() ? "1" : "2"));
            objSave.setH132B((chkH132B.isChecked() ? "1" : "2"));
            objSave.setH132C((chkH132C.isChecked() ? "1" : "2"));
            objSave.setH132D((chkH132D.isChecked() ? "1" : "2"));
            objSave.setH132E((chkH132E.isChecked() ? "1" : "2"));
            objSave.setH132F((chkH132F.isChecked() ? "1" : "2"));
            objSave.setH132G((chkH132G.isChecked() ? "1" : "2"));
            objSave.setH132H((chkH132H.isChecked() ? "1" : "2"));
            objSave.setH132I((chkH132I.isChecked() ? "1" : "2"));
            objSave.setH132J((chkH132J.isChecked() ? "1" : "2"));
            objSave.setH132K((chkH132K.isChecked() ? "1" : "2"));
            objSave.setH132L((chkH132L.isChecked() ? "1" : "2"));
            objSave.setStartTime(StartTime);
            objSave.setEndTime(g.CurrentTime24());
            objSave.setUserId(g.getUserId());
            objSave.setEntryUser(g.getUserId()); //from data entry user list
            //objSave.setLat(Double.toString(currentLatitude));
            //objSave.setLon(Double.toString(currentLongitude));

            String status = objSave.SaveUpdateData(this);
            if (status.length() == 0) {
                Connection.MessageBox(HFIAS.this, "Saved Successfully");
            } else {
                Connection.MessageBox(HFIAS.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(HFIAS.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            HFIAS_DataModel d = new HFIAS_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<HFIAS_DataModel> data = d.SelectAll(this, SQL);
            for (HFIAS_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                String[] d_rdogrpH121 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH121.length; i++) {
                    if (item.getH121().equals(String.valueOf(d_rdogrpH121[i]))) {
                        rb = (RadioButton) rdogrpH121.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH122 = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH122.length; i++) {
                    if (item.getH122().equals(String.valueOf(d_rdogrpH122[i]))) {
                        rb = (RadioButton) rdogrpH122.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH123 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH123.length; i++) {
                    if (item.getH123().equals(String.valueOf(d_rdogrpH123[i]))) {
                        rb = (RadioButton) rdogrpH123.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH124 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH124.length; i++) {
                    if (item.getH124().equals(String.valueOf(d_rdogrpH124[i]))) {
                        rb = (RadioButton) rdogrpH124.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH125 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH125.length; i++) {
                    if (item.getH125().equals(String.valueOf(d_rdogrpH125[i]))) {
                        rb = (RadioButton) rdogrpH125.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH126 = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH126.length; i++) {
                    if (item.getH126().equals(String.valueOf(d_rdogrpH126[i]))) {
                        rb = (RadioButton) rdogrpH126.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH127 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH127.length; i++) {
                    if (item.getH127().equals(String.valueOf(d_rdogrpH127[i]))) {
                        rb = (RadioButton) rdogrpH127.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH128 = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH128.length; i++) {
                    if (item.getH128().equals(String.valueOf(d_rdogrpH128[i]))) {
                        rb = (RadioButton) rdogrpH128.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH129 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH129.length; i++) {
                    if (item.getH129().equals(String.valueOf(d_rdogrpH129[i]))) {
                        rb = (RadioButton) rdogrpH129.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH1210 = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH1210.length; i++) {
                    if (item.getH1210().equals(String.valueOf(d_rdogrpH1210[i]))) {
                        rb = (RadioButton) rdogrpH1210.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH1211 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH1211.length; i++) {
                    if (item.getH1211().equals(String.valueOf(d_rdogrpH1211[i]))) {
                        rb = (RadioButton) rdogrpH1211.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH1212 = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH1212.length; i++) {
                    if (item.getH1212().equals(String.valueOf(d_rdogrpH1212[i]))) {
                        rb = (RadioButton) rdogrpH1212.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH1213 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH1213.length; i++) {
                    if (item.getH1213().equals(String.valueOf(d_rdogrpH1213[i]))) {
                        rb = (RadioButton) rdogrpH1213.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH1214 = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH1214.length; i++) {
                    if (item.getH1214().equals(String.valueOf(d_rdogrpH1214[i]))) {
                        rb = (RadioButton) rdogrpH1214.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH1215 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH1215.length; i++) {
                    if (item.getH1215().equals(String.valueOf(d_rdogrpH1215[i]))) {
                        rb = (RadioButton) rdogrpH1215.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH1216 = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH1216.length; i++) {
                    if (item.getH1216().equals(String.valueOf(d_rdogrpH1216[i]))) {
                        rb = (RadioButton) rdogrpH1216.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH1217 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH1217.length; i++) {
                    if (item.getH1217().equals(String.valueOf(d_rdogrpH1217[i]))) {
                        rb = (RadioButton) rdogrpH1217.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH1218 = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH1218.length; i++) {
                    if (item.getH1218().equals(String.valueOf(d_rdogrpH1218[i]))) {
                        rb = (RadioButton) rdogrpH1218.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH131 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH131.length; i++) {
                    if (item.getH131().equals(String.valueOf(d_rdogrpH131[i]))) {
                        rb = (RadioButton) rdogrpH131.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH132A().equals("1")) {
                    chkH132A.setChecked(true);
                } else if (item.getH132A().equals("2")) {
                    chkH132A.setChecked(false);
                }
                if (item.getH132B().equals("1")) {
                    chkH132B.setChecked(true);
                } else if (item.getH132B().equals("2")) {
                    chkH132B.setChecked(false);
                }
                if (item.getH132C().equals("1")) {
                    chkH132C.setChecked(true);
                } else if (item.getH132C().equals("2")) {
                    chkH132C.setChecked(false);
                }
                if (item.getH132D().equals("1")) {
                    chkH132D.setChecked(true);
                } else if (item.getH132D().equals("2")) {
                    chkH132D.setChecked(false);
                }
                if (item.getH132E().equals("1")) {
                    chkH132E.setChecked(true);
                } else if (item.getH132E().equals("2")) {
                    chkH132E.setChecked(false);
                }
                if (item.getH132F().equals("1")) {
                    chkH132F.setChecked(true);
                } else if (item.getH132F().equals("2")) {
                    chkH132F.setChecked(false);
                }
                if (item.getH132G().equals("1")) {
                    chkH132G.setChecked(true);
                } else if (item.getH132G().equals("2")) {
                    chkH132G.setChecked(false);
                }
                if (item.getH132H().equals("1")) {
                    chkH132H.setChecked(true);
                } else if (item.getH132H().equals("2")) {
                    chkH132H.setChecked(false);
                }
                if (item.getH132I().equals("1")) {
                    chkH132I.setChecked(true);
                } else if (item.getH132I().equals("2")) {
                    chkH132I.setChecked(false);
                }
                if (item.getH132J().equals("1")) {
                    chkH132J.setChecked(true);
                } else if (item.getH132J().equals("2")) {
                    chkH132J.setChecked(false);
                }
                if (item.getH132K().equals("1")) {
                    chkH132K.setChecked(true);
                } else if (item.getH132K().equals("2")) {
                    chkH132K.setChecked(false);
                }
                if (item.getH132L().equals("1")) {
                    chkH132L.setChecked(true);
                } else if (item.getH132L().equals("2")) {
                    chkH132L.setChecked(false);
                }
            }
        } catch (Exception e) {
            Connection.MessageBox(HFIAS.this, e.getMessage());
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