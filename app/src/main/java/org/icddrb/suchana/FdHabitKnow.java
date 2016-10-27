package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".FdHabitKnow" android:label="FdHabitKnow" />

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

public class FdHabitKnow extends Activity {
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
    LinearLayout seclblM23;
    LinearLayout secM231;
    View lineM231;
    TextView VlblM231;
    Spinner spnM231;
    LinearLayout secM231x1;
    View lineM231x1;
    TextView VlblM231x1;
    EditText txtM231x1;
    LinearLayout seclblM232;
    LinearLayout secM232a;
    View lineM232a;
    TextView VlblM232a;
    CheckBox chkM232a;
    LinearLayout secM232b;
    View lineM232b;
    TextView VlblM232b;
    EditText txtM232b;
    LinearLayout secM232c;
    View lineM232c;
    TextView VlblM232c;
    RadioGroup rdogrpM232b;
    RadioButton rdoM232b1;
    RadioButton rdoM232b2;
    LinearLayout secM233;
    View lineM233;
    TextView VlblM233;
    EditText txtM233;
    LinearLayout secM234;
    View lineM234;
    TextView VlblM234;
    EditText txtM234;
    LinearLayout secM235;
    View lineM235;
    TextView VlblM235;
    EditText txtM235;
    LinearLayout seclblM236;
    LinearLayout secM236a;
    View lineM236a;
    TextView VlblM236a;
    CheckBox chkM236a;
    LinearLayout secM236b;
    View lineM236b;
    TextView VlblM236b;
    CheckBox chkM236b;
    LinearLayout secM236c;
    View lineM236c;
    TextView VlblM236c;
    CheckBox chkM236c;
    LinearLayout secM236d;
    View lineM236d;
    TextView VlblM236d;
    CheckBox chkM236d;
    LinearLayout secM236e;
    View lineM236e;
    TextView VlblM236e;
    CheckBox chkM236e;
    LinearLayout secM236f;
    View lineM236f;
    TextView VlblM236f;
    CheckBox chkM236f;
    LinearLayout secM236g;
    View lineM236g;
    TextView VlblM236g;
    CheckBox chkM236g;
    LinearLayout secM236h;
    View lineM236h;
    TextView VlblM236h;
    CheckBox chkM236h;
    LinearLayout secM236i;
    View lineM236i;
    TextView VlblM236i;
    CheckBox chkM236i;
    LinearLayout secM236j;
    View lineM236j;
    TextView VlblM236j;
    CheckBox chkM236j;
    LinearLayout seclblM237;
    LinearLayout secM237a;
    View lineM237a;
    TextView VlblM237a;
    CheckBox chkM237a;
    LinearLayout secM237b;
    View lineM237b;
    TextView VlblM237b;
    CheckBox chkM237b;
    LinearLayout secM237c;
    View lineM237c;
    TextView VlblM237c;
    CheckBox chkM237c;
    LinearLayout secM237d;
    View lineM237d;
    TextView VlblM237d;
    CheckBox chkM237d;
    LinearLayout secM237e;
    View lineM237e;
    TextView VlblM237e;
    CheckBox chkM237e;
    LinearLayout secM237x;
    View lineM237x;
    TextView VlblM237x;
    CheckBox chkM237x;
    LinearLayout secM237x1;
    View lineM237x1;
    TextView VlblM237x1;
    EditText txtM237x1;
    LinearLayout secM238;
    View lineM238;
    TextView VlblM238;
    EditText txtM238;
    LinearLayout seclblM239;
    LinearLayout secM239a;
    View lineM239a;
    TextView VlblM239a;
    CheckBox chkM239a;
    LinearLayout secM239b;
    View lineM239b;
    TextView VlblM239b;
    CheckBox chkM239b;
    LinearLayout secM239c;
    View lineM239c;
    TextView VlblM239c;
    CheckBox chkM239c;
    LinearLayout secM239d;
    View lineM239d;
    TextView VlblM239d;
    CheckBox chkM239d;
    LinearLayout secM239e;
    View lineM239e;
    TextView VlblM239e;
    CheckBox chkM239e;
    LinearLayout secM239f;
    View lineM239f;
    TextView VlblM239f;
    CheckBox chkM239f;
    LinearLayout secM239g;
    View lineM239g;
    TextView VlblM239g;
    CheckBox chkM239g;
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


            //   dtpDate.setText(new StringBuilder()
            //          .append(Global.Right("00"+mDay,2)).append("/")
            //          .append(Global.Right("00"+mMonth,2)).append("/")
            //          .append(mYear));
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
            setContentView(R.layout.fdhabitknow);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TableName = "FdHabitKnow";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(FdHabitKnow.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Knowledge.class);
                            intent.putExtras(IDbundle);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(FdHabitKnow.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to return to Home [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), HandWash.class);
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
            secRnd = (LinearLayout) findViewById(R.id.secRnd);
            lineRnd = (View) findViewById(R.id.lineRnd);
            VlblRnd = (TextView) findViewById(R.id.VlblRnd);
            txtRnd = (EditText) findViewById(R.id.txtRnd);
            secSuchanaID = (LinearLayout) findViewById(R.id.secSuchanaID);
            lineSuchanaID = (View) findViewById(R.id.lineSuchanaID);
            VlblSuchanaID = (TextView) findViewById(R.id.VlblSuchanaID);
            txtSuchanaID = (EditText) findViewById(R.id.txtSuchanaID);
            seclblM23 = (LinearLayout) findViewById(R.id.seclblM23);
            secM231 = (LinearLayout) findViewById(R.id.secM231);
            lineM231 = (View) findViewById(R.id.lineM231);
            VlblM231 = (TextView) findViewById(R.id.VlblM231);
            spnM231 = (Spinner) findViewById(R.id.spnM231);
            List<String> listM231 = new ArrayList<String>();

            listM231.add("");
            listM231.add("01-শাল দুধ ");
            listM231.add("02-বুকের দুধ (শাল দুধ ছাড়া)");
            listM231.add("03-অন্যান্য দুধ");
            listM231.add("04-পানি");
            listM231.add("05-মধু /চিনির পানি ");
            listM231.add("06-অন্যান্য (নির্দিষ্ট করুন) ");
            listM231.add("88-জানা নেই ");
            listM231.add("");
            ArrayAdapter<String> adptrM231 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM231);
            spnM231.setAdapter(adptrM231);

            secM231x1 = (LinearLayout) findViewById(R.id.secM231x1);
            lineM231x1 = (View) findViewById(R.id.lineM231x1);
            VlblM231x1 = (TextView) findViewById(R.id.VlblM231x1);
            txtM231x1 = (EditText) findViewById(R.id.txtM231x1);
            seclblM232 = (LinearLayout) findViewById(R.id.seclblM232);
            secM232a = (LinearLayout) findViewById(R.id.secM232a);
            lineM232a = (View) findViewById(R.id.lineM232a);
            VlblM232a = (TextView) findViewById(R.id.VlblM232a);
            chkM232a = (CheckBox) findViewById(R.id.chkM232a);

            chkM232a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        secM232b.setVisibility(View.GONE);
                        // lineM232b.setVisibility(View.GONE);
                        txtM232b.setText("");
                        // secM232c.setVisibility(View.GONE);
                        //  lineM232c.setVisibility(View.GONE);
                        rdogrpM232b.clearCheck();

                    } else {
                        secM232b.setVisibility(View.VISIBLE);
                        //   lineM232b.setVisibility(View.VISIBLE);
                        txtM232b.setText("");
                        //  secM232c.setVisibility(View.GONE);
                        //  lineM232c.setVisibility(View.GONE);

                    }
                }
            });

            /*chkM232a.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        secM232b.setVisibility(View.GONE);
                        // lineM232b.setVisibility(View.GONE);
                        txtM232b.setText("");
                        // secM232c.setVisibility(View.GONE);
                        //  lineM232c.setVisibility(View.GONE);
                        rdogrpM232b.clearCheck();

                    } else {
                        secM232b.setVisibility(View.VISIBLE);
                        //   lineM232b.setVisibility(View.VISIBLE);
                        txtM232b.setText("");
                        //  secM232c.setVisibility(View.GONE);
                        //  lineM232c.setVisibility(View.GONE);


                    }
                }
            });*/


            secM232b = (LinearLayout) findViewById(R.id.secM232b);
            //  lineM232b=(View)findViewById(R.id.lineM232b);
            // VlblM232b=(TextView) findViewById(R.id.VlblM232b);
            txtM232b = (EditText) findViewById(R.id.txtM232b);
            // secM232c=(LinearLayout)findViewById(R.id.secM232c);
            lineM232c = (View) findViewById(R.id.lineM232c);
            // VlblM232c=(TextView) findViewById(R.id.VlblM232c);

            rdogrpM232b = (RadioGroup) findViewById(R.id.rdogrpM232b);

            rdoM232b1 = (RadioButton) findViewById(R.id.rdoM232b1);
            rdoM232b2 = (RadioButton) findViewById(R.id.rdoM232b2);

            secM233 = (LinearLayout) findViewById(R.id.secM233);
            lineM233 = (View) findViewById(R.id.lineM233);
            VlblM233 = (TextView) findViewById(R.id.VlblM233);
            txtM233 = (EditText) findViewById(R.id.txtM233);
            secM234 = (LinearLayout) findViewById(R.id.secM234);
            lineM234 = (View) findViewById(R.id.lineM234);
            VlblM234 = (TextView) findViewById(R.id.VlblM234);
            txtM234 = (EditText) findViewById(R.id.txtM234);
            secM235 = (LinearLayout) findViewById(R.id.secM235);
            lineM235 = (View) findViewById(R.id.lineM235);
            VlblM235 = (TextView) findViewById(R.id.VlblM235);
            txtM235 = (EditText) findViewById(R.id.txtM235);
            seclblM236 = (LinearLayout) findViewById(R.id.seclblM236);
            secM236a = (LinearLayout) findViewById(R.id.secM236a);
            lineM236a = (View) findViewById(R.id.lineM236a);
            VlblM236a = (TextView) findViewById(R.id.VlblM236a);
            chkM236a = (CheckBox) findViewById(R.id.chkM236a);
            secM236b = (LinearLayout) findViewById(R.id.secM236b);
            lineM236b = (View) findViewById(R.id.lineM236b);
            VlblM236b = (TextView) findViewById(R.id.VlblM236b);
            chkM236b = (CheckBox) findViewById(R.id.chkM236b);
            secM236c = (LinearLayout) findViewById(R.id.secM236c);
            lineM236c = (View) findViewById(R.id.lineM236c);
            VlblM236c = (TextView) findViewById(R.id.VlblM236c);
            chkM236c = (CheckBox) findViewById(R.id.chkM236c);
            secM236d = (LinearLayout) findViewById(R.id.secM236d);
            lineM236d = (View) findViewById(R.id.lineM236d);
            VlblM236d = (TextView) findViewById(R.id.VlblM236d);
            chkM236d = (CheckBox) findViewById(R.id.chkM236d);
            secM236e = (LinearLayout) findViewById(R.id.secM236e);
            lineM236e = (View) findViewById(R.id.lineM236e);
            VlblM236e = (TextView) findViewById(R.id.VlblM236e);
            chkM236e = (CheckBox) findViewById(R.id.chkM236e);
            secM236f = (LinearLayout) findViewById(R.id.secM236f);
            lineM236f = (View) findViewById(R.id.lineM236f);
            VlblM236f = (TextView) findViewById(R.id.VlblM236f);
            chkM236f = (CheckBox) findViewById(R.id.chkM236f);
            secM236g = (LinearLayout) findViewById(R.id.secM236g);
            lineM236g = (View) findViewById(R.id.lineM236g);
            VlblM236g = (TextView) findViewById(R.id.VlblM236g);
            chkM236g = (CheckBox) findViewById(R.id.chkM236g);
            secM236h = (LinearLayout) findViewById(R.id.secM236h);
            lineM236h = (View) findViewById(R.id.lineM236h);
            VlblM236h = (TextView) findViewById(R.id.VlblM236h);
            chkM236h = (CheckBox) findViewById(R.id.chkM236h);
            secM236i = (LinearLayout) findViewById(R.id.secM236i);
            lineM236i = (View) findViewById(R.id.lineM236i);
            VlblM236i = (TextView) findViewById(R.id.VlblM236i);
            chkM236i = (CheckBox) findViewById(R.id.chkM236i);
            secM236j = (LinearLayout) findViewById(R.id.secM236j);
            lineM236j = (View) findViewById(R.id.lineM236j);
            VlblM236j = (TextView) findViewById(R.id.VlblM236j);
            chkM236j = (CheckBox) findViewById(R.id.chkM236j);
            seclblM237 = (LinearLayout) findViewById(R.id.seclblM237);
            secM237a = (LinearLayout) findViewById(R.id.secM237a);
            lineM237a = (View) findViewById(R.id.lineM237a);
            VlblM237a = (TextView) findViewById(R.id.VlblM237a);
            chkM237a = (CheckBox) findViewById(R.id.chkM237a);
            secM237b = (LinearLayout) findViewById(R.id.secM237b);
            lineM237b = (View) findViewById(R.id.lineM237b);
            VlblM237b = (TextView) findViewById(R.id.VlblM237b);
            chkM237b = (CheckBox) findViewById(R.id.chkM237b);
            secM237c = (LinearLayout) findViewById(R.id.secM237c);
            lineM237c = (View) findViewById(R.id.lineM237c);
            VlblM237c = (TextView) findViewById(R.id.VlblM237c);
            chkM237c = (CheckBox) findViewById(R.id.chkM237c);
            secM237d = (LinearLayout) findViewById(R.id.secM237d);
            lineM237d = (View) findViewById(R.id.lineM237d);
            VlblM237d = (TextView) findViewById(R.id.VlblM237d);
            chkM237d = (CheckBox) findViewById(R.id.chkM237d);
            secM237e = (LinearLayout) findViewById(R.id.secM237e);
            lineM237e = (View) findViewById(R.id.lineM237e);
            VlblM237e = (TextView) findViewById(R.id.VlblM237e);
            chkM237e = (CheckBox) findViewById(R.id.chkM237e);
            secM237x = (LinearLayout) findViewById(R.id.secM237x);
            lineM237x = (View) findViewById(R.id.lineM237x);
            VlblM237x = (TextView) findViewById(R.id.VlblM237x);
            chkM237x = (CheckBox) findViewById(R.id.chkM237x);
            chkM237x.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {
                        secM237x1.setVisibility(View.GONE);
                        lineM237x1.setVisibility(View.GONE);
                        txtM237x1.setText("");

                    } else {
                        secM237x1.setVisibility(View.VISIBLE);
                        lineM237x1.setVisibility(View.VISIBLE);
                    }
                }
            });

            chkM237a.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        secM237b.setVisibility(View.GONE);
                        lineM237b.setVisibility(View.GONE);
                        chkM237b.setChecked(false);
                        secM237c.setVisibility(View.GONE);
                        lineM237c.setVisibility(View.GONE);
                        chkM237c.setChecked(false);
                        secM237d.setVisibility(View.GONE);
                        lineM237d.setVisibility(View.GONE);
                        chkM237d.setChecked(false);
                        secM237e.setVisibility(View.GONE);
                        lineM237e.setVisibility(View.GONE);
                        chkM237e.setChecked(false);
                        secM237x.setVisibility(View.GONE);
                        lineM237x.setVisibility(View.GONE);
                        chkM237x.setChecked(false);
                        secM237x1.setVisibility(View.GONE);
                        lineM237x1.setVisibility(View.GONE);
                        txtM237x1.setText("");

                    } else {
                        secM237b.setVisibility(View.VISIBLE);
                        lineM237b.setVisibility(View.VISIBLE);
                        secM237c.setVisibility(View.VISIBLE);
                        lineM237c.setVisibility(View.VISIBLE);
                        secM237d.setVisibility(View.VISIBLE);
                        lineM237d.setVisibility(View.VISIBLE);
                        secM237e.setVisibility(View.VISIBLE);
                        lineM237e.setVisibility(View.VISIBLE);
                        secM237x.setVisibility(View.VISIBLE);
                        lineM237x.setVisibility(View.VISIBLE);
                    }
                }
            });
            secM237x1 = (LinearLayout) findViewById(R.id.secM237x1);
            lineM237x1 = (View) findViewById(R.id.lineM237x1);
            VlblM237x1 = (TextView) findViewById(R.id.VlblM237x1);
            txtM237x1 = (EditText) findViewById(R.id.txtM237x1);
            secM238 = (LinearLayout) findViewById(R.id.secM238);
            lineM238 = (View) findViewById(R.id.lineM238);
            VlblM238 = (TextView) findViewById(R.id.VlblM238);
            txtM238 = (EditText) findViewById(R.id.txtM238);
            seclblM239 = (LinearLayout) findViewById(R.id.seclblM239);
            secM239a = (LinearLayout) findViewById(R.id.secM239a);
            lineM239a = (View) findViewById(R.id.lineM239a);
            VlblM239a = (TextView) findViewById(R.id.VlblM239a);
            chkM239a = (CheckBox) findViewById(R.id.chkM239a);
            secM239b = (LinearLayout) findViewById(R.id.secM239b);
            lineM239b = (View) findViewById(R.id.lineM239b);
            VlblM239b = (TextView) findViewById(R.id.VlblM239b);
            chkM239b = (CheckBox) findViewById(R.id.chkM239b);
            secM239c = (LinearLayout) findViewById(R.id.secM239c);
            lineM239c = (View) findViewById(R.id.lineM239c);
            VlblM239c = (TextView) findViewById(R.id.VlblM239c);
            chkM239c = (CheckBox) findViewById(R.id.chkM239c);
            secM239d = (LinearLayout) findViewById(R.id.secM239d);
            lineM239d = (View) findViewById(R.id.lineM239d);
            VlblM239d = (TextView) findViewById(R.id.VlblM239d);
            chkM239d = (CheckBox) findViewById(R.id.chkM239d);
            secM239e = (LinearLayout) findViewById(R.id.secM239e);
            lineM239e = (View) findViewById(R.id.lineM239e);
            VlblM239e = (TextView) findViewById(R.id.VlblM239e);
            chkM239e = (CheckBox) findViewById(R.id.chkM239e);
            secM239f = (LinearLayout) findViewById(R.id.secM239f);
            lineM239f = (View) findViewById(R.id.lineM239f);
            VlblM239f = (TextView) findViewById(R.id.VlblM239f);
            chkM239f = (CheckBox) findViewById(R.id.chkM239f);
            secM239g = (LinearLayout) findViewById(R.id.secM239g);
            lineM239g = (View) findViewById(R.id.lineM239g);
            VlblM239g = (TextView) findViewById(R.id.VlblM239g);
            chkM239g = (CheckBox) findViewById(R.id.chkM239g);

            chkM239g.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {

                        chkM239a.setChecked(false);
                        chkM239b.setChecked(false);
                        chkM239c.setChecked(false);
                        chkM239d.setChecked(false);
                        chkM239e.setChecked(false);
                        chkM239f.setChecked(false);

                    } else {

                    }
                }
            });
            txtRnd.setText(RND);
            txtSuchanaID.setText(SUCHANAID);
            txtRnd.setEnabled(false);
            txtSuchanaID.setEnabled(false);
            secM231x1.setVisibility(View.GONE);
            //Hide all skip variables
            //secM232b.setVisibility(View.GONE);
            // secM232c.setVisibility(View.GONE);
            // secM233.setVisibility(View.GONE);
            secM237x1.setVisibility(View.GONE);
            //secM238.setVisibility(View.GONE);


            spnM231.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnM231.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnM231.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("06")) {
                        secM231x1.setVisibility(View.VISIBLE);
                    } else {
                        secM231x1.setVisibility(View.GONE);
                        txtM231x1.setText(null);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });

            DataSearch(RND, SUCHANAID);
            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(FdHabitKnow.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(FdHabitKnow.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(FdHabitKnow.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(FdHabitKnow.this, "Required field: উপকারভোগী সদস্য আইডি সুচনা  নম্বর অনুসারে.");
                txtSuchanaID.requestFocus();
                return;
            } else if (spnM231.getSelectedItemPosition() == 0 & secM231.isShown()) {
                Connection.MessageBox(FdHabitKnow.this, "Required field: শিশুর জন্মের পর পর তাকে কি খাওয়ানো  উচিৎ.");
                spnM231.requestFocus();
                return;
            } else if (txtM231x1.getText().toString().length() == 0 & secM231x1.isShown()) {
                Connection.MessageBox(FdHabitKnow.this, "Required field: অন্যান্য (নির্দিষ্ট করুন).");
                txtM231x1.requestFocus();
                return;
            } else if (rdoM232b1.isChecked() == false & rdoM232b2.isChecked() == false & secM232b.isShown()) {
                Connection.MessageBox(FdHabitKnow.this, "Required field: M232");
                txtM232b.requestFocus();
                return;
            } else if (txtM232b.getText().toString().length() == 0 & secM232b.isShown()) {
                Connection.MessageBox(FdHabitKnow.this, "Required field: ঘণ্টা.");
                txtM232b.requestFocus();
                return;
            } else if (Integer.valueOf(txtM232b.getText().toString().length() == 0 ? "1" : txtM232b.getText().toString()) < 1 || Integer.valueOf(txtM232b.getText().toString().length() == 0 ? "23" : txtM232b.getText().toString()) > 23) {
                Connection.MessageBox(FdHabitKnow.this, "Value should be between 1 and 23(ঘণ্টা).");
                txtM232b.requestFocus();
                return;
            } else if (txtM233.getText().toString().length() == 0 & secM233.isShown()) {
                Connection.MessageBox(FdHabitKnow.this, "Required field: আপনি কি  জানেন শুধু মাত্র বুকের দুধ কতদিন খাওয়াতে হয়.");
                txtM233.requestFocus();
                return;
            } else if (Integer.valueOf(txtM233.getText().toString().length() == 0 ? "0" : txtM233.getText().toString()) < 0 || Integer.valueOf(txtM233.getText().toString().length() == 0 ? "888" : txtM233.getText().toString()) > 888) {
                Connection.MessageBox(FdHabitKnow.this, "Value should be between 0 and 888(আপনি কি  জানেন শুধু মাত্র বুকের দুধ কতদিন খাওয়াতে হয়).");
                txtM233.requestFocus();
                return;
            } else if (txtM234.getText().toString().length() == 0 & secM234.isShown()) {
                Connection.MessageBox(FdHabitKnow.this, "Required field: কত বয়স পর্যন্ত বচ্চাকে বুকের দুধ খাওয়াতে হয়.");
                txtM234.requestFocus();
                return;
            }
            else if( txtM234.getText().toString().equals("88"))
            {

            }
            else
            {
                if (Integer.valueOf(txtM234.getText().toString().length() == 0 ? "01" : txtM234.getText().toString()) < 01 || Integer.valueOf(txtM234.getText().toString().length() == 0 ? "60" : txtM234.getText().toString()) > 60) {
                    Connection.MessageBox(FdHabitKnow.this, "Value should be between 01 and 60(কত বয়স পর্যন্ত বচ্চাকে বুকের দুধ খাওয়াতে হয়).");
                    txtM234.requestFocus();
                    return;
                }
            }
             if (txtM235.getText().toString().length() == 0 & secM235.isShown()) {
                Connection.MessageBox(FdHabitKnow.this, "Required field: কত বয়সের সময় নরম খাবার খাওয়ানো শুরু করা উচিৎ.");
                txtM235.requestFocus();
                return;
            }
             else if( txtM235.getText().toString().equals("88"))
             {

             }
             else
             {
                 if (Integer.valueOf(txtM235.getText().toString().length() == 0 ? "1" : txtM235.getText().toString()) < 1 || Integer.valueOf(txtM235.getText().toString().length() == 0 ? "18" : txtM235.getText().toString()) > 18) {
                     Connection.MessageBox(FdHabitKnow.this, "Value should be between 1 and 18(কত বয়সের সময় নরম খাবার খাওয়ানো শুরু করা উচিৎ).");
                     txtM235.requestFocus();
                     return;
                 }
             }
            if (txtM237x1.getText().toString().length() == 0 & secM237x1.isShown()) {
                Connection.MessageBox(FdHabitKnow.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtM237x1.requestFocus();
                return;
            } else if (txtM238.getText().toString().length() == 0 & secM238.isShown()) {
                Connection.MessageBox(FdHabitKnow.this, "Required field: আপনার শিশুকে (বয়স অনুযায়ী) দৈনিক কতবার খাওয়ানো উচিৎ.");
                txtM238.requestFocus();
                return;
            } else if (Integer.valueOf(txtM238.getText().toString().length() == 0 ? "1" : txtM238.getText().toString()) < 1 || Integer.valueOf(txtM238.getText().toString().length() == 0 ? "25" : txtM238.getText().toString()) > 25) {
                Connection.MessageBox(FdHabitKnow.this, "Value should be between 1 and 25(আপনার শিশুকে (বয়স অনুযায়ী) দৈনিক কতবার খাওয়ানো উচিৎ).");
                txtM238.requestFocus();
                return;
            }

            if (chkM236a.isChecked() == false & chkM236b.isChecked() == false & chkM236c.isChecked() == false & chkM236d.isChecked() == false & chkM236e.isChecked() == false & chkM236f.isChecked() == false & chkM236g.isChecked() == false & chkM236h.isChecked() == false & chkM236i.isChecked() == false & chkM236j.isChecked() == false) {
                Connection.MessageBox(FdHabitKnow.this, "Inconsistent value in M236");
                return;
            }
            if (chkM237a.isChecked() == false & chkM237b.isChecked() == false & chkM237c.isChecked() == false & chkM237d.isChecked() == false & chkM237e.isChecked() == false & chkM237x.isChecked() == false) {
                Connection.MessageBox(FdHabitKnow.this, "Inconsistent value in M237");
                return;
            }
            if (chkM239a.isChecked() == false & chkM239b.isChecked() == false & chkM239c.isChecked() == false & chkM239d.isChecked() == false & chkM239e.isChecked() == false & chkM239f.isChecked() == false & chkM239g.isChecked() == false) {
                Connection.MessageBox(FdHabitKnow.this, "Inconsistent value in M239");
                return;
            }
            if((chkM239g.isChecked()==true) &&(chkM239a.isChecked()==true || chkM239b.isChecked()==true|| chkM239c.isChecked()==true|| chkM239d.isChecked()==true|| chkM239e.isChecked()==true|| chkM239f.isChecked()==true))
            {
                Connection.MessageBox(FdHabitKnow.this, "Inconsistent value in M239");
                return;
            }
            String SQL = "";
            RadioButton rb;

            FdHabitKnow_DataModel objSave = new FdHabitKnow_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setM231((spnM231.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM231.getSelectedItem().toString(), "-")));
            objSave.setM231x1(txtM231x1.getText().toString());
            objSave.setM232a((chkM232a.isChecked() ? "1" : "2"));
            objSave.setM232b(txtM232b.getText().toString());
            //objSave.setM232c(txtM232c.getText().toString());
            String[] d_rdogrpM232b = new String[]{"1", "2"};
            for (int i = 0; i < rdogrpM232b.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM232b.getChildAt(i);
                if (rb.isChecked()) objSave.setM232c(d_rdogrpM232b[i]);
            }

            objSave.setM233(txtM233.getText().toString());
            objSave.setM234(txtM234.getText().toString());
            objSave.setM235(txtM235.getText().toString());
            objSave.setM236a((chkM236a.isChecked() ? "1" : "2"));
            objSave.setM236b((chkM236b.isChecked() ? "1" : "2"));
            objSave.setM236c((chkM236c.isChecked() ? "1" : "2"));
            objSave.setM236d((chkM236d.isChecked() ? "1" : "2"));
            objSave.setM236e((chkM236e.isChecked() ? "1" : "2"));
            objSave.setM236f((chkM236f.isChecked() ? "1" : "2"));
            objSave.setM236g((chkM236g.isChecked() ? "1" : "2"));
            objSave.setM236h((chkM236h.isChecked() ? "1" : "2"));
            objSave.setM236i((chkM236i.isChecked() ? "1" : "2"));
            objSave.setM236j((chkM236j.isChecked() ? "1" : "2"));
            objSave.setM237a((chkM237a.isChecked() ? "1" : "2"));
            objSave.setM237b((chkM237b.isChecked() ? "1" : "2"));
            objSave.setM237c((chkM237c.isChecked() ? "1" : "2"));
            objSave.setM237d((chkM237d.isChecked() ? "1" : "2"));
            objSave.setM237e((chkM237e.isChecked() ? "1" : "2"));
            objSave.setM237x((chkM237x.isChecked() ? "1" : "2"));
            objSave.setM237x1(txtM237x1.getText().toString());
            objSave.setM238(txtM238.getText().toString());
            objSave.setM239a((chkM239a.isChecked() ? "1" : "2"));
            objSave.setM239b((chkM239b.isChecked() ? "1" : "2"));
            objSave.setM239c((chkM239c.isChecked() ? "1" : "2"));
            objSave.setM239d((chkM239d.isChecked() ? "1" : "2"));
            objSave.setM239e((chkM239e.isChecked() ? "1" : "2"));
            objSave.setM239f((chkM239f.isChecked() ? "1" : "2"));
            objSave.setM239g((chkM239g.isChecked() ? "1" : "2"));
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
                startActivity(new Intent(FdHabitKnow.this, HandWash.class).putExtras(IDBundle));

            } else {
                Connection.MessageBox(FdHabitKnow.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(FdHabitKnow.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            FdHabitKnow_DataModel d = new FdHabitKnow_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<FdHabitKnow_DataModel> data = d.SelectAll(this, SQL);
            for (FdHabitKnow_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                spnM231.setSelection(Global.SpinnerItemPositionAnyLength(spnM231, item.getM231()));
                txtM231x1.setText(item.getM231x1());
                if (item.getM232a().equals("1")) {
                    chkM232a.setChecked(true);
                    secM232b.setVisibility(View.GONE);
                    txtM232b.setText("");
                    rdogrpM232b.clearCheck();
                } else if (item.getM232a().equals("2")) {
                    chkM232a.setChecked(false);
                    secM232b.setVisibility(View.VISIBLE);
                    txtM232b.setText(item.getM232b());
                }
                txtM232b.setText(item.getM232b());
                //txtM232c.setText(item.getM232c());
                String[] d_rdogrpM232b = new String[]{"1", "2"};
                for (int i = 0; i < d_rdogrpM232b.length; i++) {
                    if (item.getM232c().equals(String.valueOf(d_rdogrpM232b[i]))) {
                        rb = (RadioButton) rdogrpM232b.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtM233.setText(item.getM233());
                txtM234.setText(item.getM234());
                txtM235.setText(item.getM235());
                if (item.getM236a().equals("1")) {
                    chkM236a.setChecked(true);
                } else if (item.getM236a().equals("2")) {
                    chkM236a.setChecked(false);
                }
                if (item.getM236b().equals("1")) {
                    chkM236b.setChecked(true);
                } else if (item.getM236b().equals("2")) {
                    chkM236b.setChecked(false);
                }
                if (item.getM236c().equals("1")) {
                    chkM236c.setChecked(true);
                } else if (item.getM236c().equals("2")) {
                    chkM236c.setChecked(false);
                }
                if (item.getM236d().equals("1")) {
                    chkM236d.setChecked(true);
                } else if (item.getM236d().equals("2")) {
                    chkM236d.setChecked(false);
                }
                if (item.getM236e().equals("1")) {
                    chkM236e.setChecked(true);
                } else if (item.getM236e().equals("2")) {
                    chkM236e.setChecked(false);
                }
                if (item.getM236f().equals("1")) {
                    chkM236f.setChecked(true);
                } else if (item.getM236f().equals("2")) {
                    chkM236f.setChecked(false);
                }
                if (item.getM236g().equals("1")) {
                    chkM236g.setChecked(true);
                } else if (item.getM236g().equals("2")) {
                    chkM236g.setChecked(false);
                }
                if (item.getM236h().equals("1")) {
                    chkM236h.setChecked(true);
                } else if (item.getM236h().equals("2")) {
                    chkM236h.setChecked(false);
                }
                if (item.getM236i().equals("1")) {
                    chkM236i.setChecked(true);
                } else if (item.getM236i().equals("2")) {
                    chkM236i.setChecked(false);
                }
                if (item.getM236j().equals("1")) {
                    chkM236j.setChecked(true);
                } else if (item.getM236j().equals("2")) {
                    chkM236j.setChecked(false);
                }
                if (item.getM237a().equals("1")) {
                    chkM237a.setChecked(true);
                } else if (item.getM237a().equals("2")) {
                    chkM237a.setChecked(false);
                }
                if (item.getM237b().equals("1")) {
                    chkM237b.setChecked(true);
                } else if (item.getM237b().equals("2")) {
                    chkM237b.setChecked(false);
                }
                if (item.getM237c().equals("1")) {
                    chkM237c.setChecked(true);
                } else if (item.getM237c().equals("2")) {
                    chkM237c.setChecked(false);
                }
                if (item.getM237d().equals("1")) {
                    chkM237d.setChecked(true);
                } else if (item.getM237d().equals("2")) {
                    chkM237d.setChecked(false);
                }
                if (item.getM237e().equals("1")) {
                    chkM237e.setChecked(true);
                } else if (item.getM237e().equals("2")) {
                    chkM237e.setChecked(false);
                }
                if (item.getM237x().equals("1")) {
                    chkM237x.setChecked(true);
                } else if (item.getM237x().equals("2")) {
                    chkM237x.setChecked(false);
                }
                txtM237x1.setText(item.getM237x1());
                txtM238.setText(item.getM238());
                if (item.getM239a().equals("1")) {
                    chkM239a.setChecked(true);
                } else if (item.getM239a().equals("2")) {
                    chkM239a.setChecked(false);
                }
                if (item.getM239b().equals("1")) {
                    chkM239b.setChecked(true);
                } else if (item.getM239b().equals("2")) {
                    chkM239b.setChecked(false);
                }
                if (item.getM239c().equals("1")) {
                    chkM239c.setChecked(true);
                } else if (item.getM239c().equals("2")) {
                    chkM239c.setChecked(false);
                }
                if (item.getM239d().equals("1")) {
                    chkM239d.setChecked(true);
                } else if (item.getM239d().equals("2")) {
                    chkM239d.setChecked(false);
                }
                if (item.getM239e().equals("1")) {
                    chkM239e.setChecked(true);
                } else if (item.getM239e().equals("2")) {
                    chkM239e.setChecked(false);
                }
                if (item.getM239f().equals("1")) {
                    chkM239f.setChecked(true);
                } else if (item.getM239f().equals("2")) {
                    chkM239f.setChecked(false);
                }
                if (item.getM239g().equals("1")) {
                    chkM239g.setChecked(true);
                } else if (item.getM239g().equals("2")) {
                    chkM239g.setChecked(false);
                }
            }
        } catch (Exception e) {
            Connection.MessageBox(FdHabitKnow.this, e.getMessage());
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
