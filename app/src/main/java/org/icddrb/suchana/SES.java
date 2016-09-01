package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".SES" android:label="SES" />

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
import android.widget.CompoundButton;
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

public class SES extends Activity {
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
    LinearLayout seclb311;
    LinearLayout secH311;
    TextView VlblH311;
    Spinner spnH311;
    LinearLayout secH312;
    TextView VlblH312;
    EditText txtH312;
    LinearLayout secH313;
    TextView VlblH313;
    EditText txtH313;
    LinearLayout seclbl321;
    LinearLayout secH321;
    TextView VlblH321;
    Spinner spnH321;
    LinearLayout secH321X;
    TextView VlblH321X;
    EditText txtH321X;
    LinearLayout secH322;
    TextView VlblH322;
    Spinner spnH322;
    LinearLayout secH322X;
    TextView VlblH322X;
    EditText txtH322X;
    LinearLayout secH323;
    TextView VlblH323;
    Spinner spnH323;
    LinearLayout secH323X;
    TextView VlblH323X;
    EditText txtH323X;
    LinearLayout secH324;
    TextView VlblH324;
    Spinner spnH324;
    LinearLayout secH324X;
    TextView VlblH324X;
    EditText txtH324X;
    LinearLayout secH325;
    TextView VlblH325;
    Spinner spnH325;
    LinearLayout secH325X;
    TextView VlblH325X;
    EditText txtH325X;
    LinearLayout seclb331;
    LinearLayout secH331;
    TextView VlblH331;
    RadioGroup rdogrpH331;
    RadioButton rdoH3311;
    RadioButton rdoH3312;
    RadioButton rdoH3313;
    LinearLayout secH332A;
    TextView VlblH332A;
    EditText txtH332A;
    LinearLayout secH332B;
    TextView VlblH332B;
    EditText txtH332B;
    LinearLayout seclb341;
    LinearLayout secH341;
    TextView VlblH341;
    RadioGroup rdogrpH341;
    RadioButton rdoH3411;
    RadioButton rdoH3412;
    RadioButton rdoH3413;
    LinearLayout secH342;
    TextView VlblH342;
    EditText txtH342;
    LinearLayout seclb61;
    LinearLayout secH61;
    TextView VlblH61;
    RadioGroup rdogrpH61;
    RadioButton rdoH611;
    RadioButton rdoH612;
    LinearLayout secH62;
    TextView VlblH62;
    RadioGroup rdogrpH62;
    RadioButton rdoH621;
    RadioButton rdoH622;
    RadioButton rdoH623;
    LinearLayout secH63;
    TextView VlblH63;
    Spinner spnH63;
    LinearLayout seclb64;
    LinearLayout secH64A;
    TextView VlblH64A;
    Spinner spnH64A;
    LinearLayout secH64B;
    TextView VlblH64B;
    Spinner spnH64B;
    LinearLayout secH64C;
    TextView VlblH64C;
    Spinner spnH64C;
    LinearLayout secH64D;
    TextView VlblH64D;
    Spinner spnH64D;
    LinearLayout secH64E;
    TextView VlblH64E;
    Spinner spnH64E;
    LinearLayout secH64X;
    TextView VlblH64X;
    EditText txtH64X;
    LinearLayout secH65;
    TextView VlblH65;
    RadioGroup rdogrpH65;
    RadioButton rdoH651;
    RadioButton rdoH652;
    LinearLayout secH66;
    TextView VlblH66;
    Spinner spnH66;
    LinearLayout seclb67;
    LinearLayout secH67;
    TextView VlblH67;
    RadioGroup rdogrpH67;
    RadioButton rdoH671;
    RadioButton rdoH672;
    RadioButton rdoH673;
    RadioButton rdoH674;
    LinearLayout secH68;
    TextView VlblH68;
    RadioGroup rdogrpH68;
    RadioButton rdoH681;
    RadioButton rdoH682;
    RadioButton rdoH683;
    LinearLayout secH69;
    TextView VlblH69;
    RadioGroup rdogrpH69;
    RadioButton rdoH691;
    RadioButton rdoH692;
    RadioButton rdoH693;
    LinearLayout secH610;
    TextView VlblH610;
    RadioGroup rdogrpH610;
    RadioButton rdoH6101;
    RadioButton rdoH6102;
    RadioButton rdoH6103;
    LinearLayout secH611;
    TextView VlblH611;
    RadioGroup rdogrpH611;
    RadioButton rdoH6111;
    RadioButton rdoH6112;
    RadioButton rdoH6113;
    LinearLayout seclb612;
    LinearLayout secH612R;
    TextView VlblH612R;
    Spinner spnH612R;
    LinearLayout secH612RX;
    TextView VlblH612RX;
    EditText txtH612RX;
    LinearLayout secH612D;
    TextView VlblH612D;
    Spinner spnH612D;
    LinearLayout secH612DX;
    TextView VlblH612DX;
    EditText txtH612DX;
    LinearLayout secH612a;
    TextView VlblH612a;
    RadioGroup rdogrpH612a;
    RadioButton rdoH612a1;
    RadioButton rdoH612a2;
    RadioButton rdoH612a3;
    RadioButton rdoH612a4;
    LinearLayout secLBH612;
    LinearLayout secH612b1;
    TextView VlblH612b1;
    CheckBox chkH612b1;
    LinearLayout secH612b2;
    TextView VlblH612b2;
    CheckBox chkH612b2;
    LinearLayout secH612b3;
    TextView VlblH612b3;
    CheckBox chkH612b3;
    LinearLayout secH612b4;
    TextView VlblH612b4;
    CheckBox chkH612b4;
    LinearLayout secH612bX;
    TextView VlblH612bX;
    CheckBox chkH612bX;
    LinearLayout secH612X1;
    TextView VlblH612X1;
    EditText txtH612X1;
    LinearLayout secH612b5;
    TextView VlblH612b5;
    CheckBox chkH612b5;
    LinearLayout secH612c;
    TextView VlblH612c;
    RadioGroup rdogrpH612c;
    RadioButton rdoH612c1;
    RadioButton rdoH612c2;
    RadioButton rdoH612c3;
    LinearLayout secLBH613;
    LinearLayout secH613R;
    TextView VlblH613R;
    Spinner spnH613R;
    LinearLayout secH613RX;
    TextView VlblH613RX;
    EditText txtH613RX;
    LinearLayout secH613D;
    TextView VlblH613D;
    Spinner spnH613D;
    LinearLayout secH613DX;
    TextView VlblH613DX;
    EditText txtH613DX;
    LinearLayout secH613a;
    TextView VlblH613a;
    RadioGroup rdogrpH613a;
    RadioButton rdoH613a1;
    RadioButton rdoH613a2;
    RadioButton rdoH613a3;
    LinearLayout secLB613;
    LinearLayout secH613b1;
    TextView VlblH613b1;
    CheckBox chkH613b1;
    LinearLayout secH613b2;
    TextView VlblH613b2;
    CheckBox chkH613b2;
    LinearLayout secH613b3;
    TextView VlblH613b3;
    CheckBox chkH613b3;
    LinearLayout secH613b4;
    TextView VlblH613b4;
    CheckBox chkH613b4;
    LinearLayout secH613bX;
    TextView VlblH613bX;
    CheckBox chkH613bX;
    LinearLayout secH613bX1;
    TextView VlblH613bX1;
    EditText txtH613bX1;
    LinearLayout secH613b5;
    TextView VlblH613b5;
    CheckBox chkH613b5;
    LinearLayout secLBH614;
    LinearLayout secH614R;
    TextView VlblH614R;
    Spinner spnH614R;
    LinearLayout secH614RX;
    TextView VlblH614RX;
    EditText txtH614RX;
    LinearLayout secH614D;
    TextView VlblH614D;
    Spinner spnH614D;
    LinearLayout secH614DX;
    TextView VlblH614DX;
    EditText txtH614DX;
    LinearLayout secH614a;
    TextView VlblH614a;
    RadioGroup rdogrpH614a;
    RadioButton rdoH614a1;
    RadioButton rdoH614a2;
    RadioButton rdoH614a3;
    LinearLayout secLB614;
    LinearLayout secH614b1;
    TextView VlblH614b1;
    CheckBox chkH614b1;
    LinearLayout secH614b2;
    TextView VlblH614b2;
    CheckBox chkH614b2;
    LinearLayout secH614b3;
    TextView VlblH614b3;
    CheckBox chkH614b3;
    LinearLayout secH614b4;
    TextView VlblH614b4;
    CheckBox chkH614b4;
    LinearLayout secH614bX;
    TextView VlblH614bX;
    CheckBox chkH614bX;
    LinearLayout secH614bX1;
    TextView VlblH614bX1;
    EditText txtH614bX1;
    LinearLayout secH614b5;
    TextView VlblH614b5;
    CheckBox chkH614b5;
    LinearLayout secH614c;
    TextView VlblH614c;
    RadioGroup rdogrpH614c;
    RadioButton rdoH614c1;
    RadioButton rdoH614c2;
    RadioButton rdoH614c3;
    LinearLayout secLBH615;
    LinearLayout secH615R;
    TextView VlblH615R;
    Spinner spnH615R;
    LinearLayout secH615RX;
    TextView VlblH615RX;
    EditText txtH615RX;
    LinearLayout secH615D;
    TextView VlblH615D;
    Spinner spnH615D;
    LinearLayout secH615DX;
    TextView VlblH615DX;
    EditText txtH615DX;
    LinearLayout secH615a;
    TextView VlblH615a;
    RadioGroup rdogrpH615a;
    RadioButton rdoH615a1;
    RadioButton rdoH615a2;
    RadioButton rdoH615a3;
    LinearLayout secLB615;
    LinearLayout secH615b1;
    TextView VlblH615b1;
    CheckBox chkH615b1;
    LinearLayout secH615b2;
    TextView VlblH615b2;
    CheckBox chkH615b2;
    LinearLayout secH615b3;
    TextView VlblH615b3;
    CheckBox chkH615b3;
    LinearLayout secH615b4;
    TextView VlblH615b4;
    Spinner spnH615b4;
    LinearLayout secH615bX;
    TextView VlblH615bX;
    CheckBox chkH615bX;
    LinearLayout secH615X1;
    TextView VlblH615X1;
    EditText txtH615X1;
    LinearLayout secH615b5;
    TextView VlblH615b5;
    CheckBox chkH615b5;
    LinearLayout secLBH616;
    LinearLayout secH616R;
    TextView VlblH616R;
    Spinner spnH616R;
    LinearLayout secH616RX;
    TextView VlblH616RX;
    EditText txtH616RX;
    LinearLayout secH616D;
    TextView VlblH616D;
    Spinner spnH616D;
    LinearLayout secH616DX;
    TextView VlblH616DX;
    EditText txtH616DX;
    LinearLayout secH616a;
    TextView VlblH616a;
    RadioGroup rdogrpH616a;
    RadioButton rdoH616a1;
    RadioButton rdoH616a2;
    RadioButton rdoH616a3;
    LinearLayout secLB616;
    LinearLayout secH616b1;
    TextView VlblH616b1;
    CheckBox chkH616b1;
    LinearLayout secH616b2;
    TextView VlblH616b2;
    CheckBox chkH616b2;
    LinearLayout secH616b3;
    TextView VlblH616b3;
    CheckBox chkH616b3;
    LinearLayout secH616b4;
    TextView VlblH616b4;
    CheckBox chkH616b4;
    LinearLayout secH616bX;
    TextView VlblH616bX;
    CheckBox chkH616bX;
    LinearLayout secH616X1;
    TextView VlblH616X1;
    EditText txtH616X1;
    LinearLayout secH616b5;
    TextView VlblH616b5;
    CheckBox chkH616b5;
    LinearLayout secH616c;
    TextView VlblH616c;
    RadioGroup rdogrpH616c;
    RadioButton rdoH616c1;
    RadioButton rdoH616c2;
    RadioButton rdoH616c3;
    LinearLayout secH617;
    TextView VlblH617;
    EditText txtH617;
    LinearLayout secH618;
    TextView VlblH618;
    RadioGroup rdogrpH618;
    RadioButton rdoH6181;
    RadioButton rdoH6182;
    LinearLayout secH619;
    TextView VlblH619;
    RadioGroup rdogrpH619;
    RadioButton rdoH6191;
    RadioButton rdoH6192;
    LinearLayout secH620;
    TextView VlblH620;
    Spinner spnH620;
    LinearLayout secH620X;
    TextView VlblH620X;
    EditText txtH620X;
    LinearLayout secH621;
    TextView VlblH621;
    RadioGroup rdogrpH621;
    RadioButton rdoH6211;
    RadioButton rdoH6212;
    LinearLayout secH622;
    TextView VlblH622;
    RadioGroup rdogrpH622;
    RadioButton rdoH6221;
    RadioButton rdoH6222;
    RadioButton rdoH6223;
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
            setContentView(R.layout.ses);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TableName = "SES";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(SES.this);
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
            seclb311 = (LinearLayout) findViewById(R.id.seclb311);
            secH311 = (LinearLayout) findViewById(R.id.secH311);
            VlblH311 = (TextView) findViewById(R.id.VlblH311);
            spnH311 = (Spinner) findViewById(R.id.spnH311);
            List<String> listH311 = new ArrayList<String>();

            listH311.add("");
            listH311.add("1-নিজস্ব");
            listH311.add("2-ভাড়াটে");
            listH311.add("3-অন্যের অনুগ্রহে প্রাপ্ত জায়গা ");
            listH311.add("4-অবৈধভাবে বাস");

            ArrayAdapter<String> adptrH311 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH311);
            spnH311.setAdapter(adptrH311);
            secH312 = (LinearLayout) findViewById(R.id.secH312);
            VlblH312 = (TextView) findViewById(R.id.VlblH312);
            txtH312 = (EditText) findViewById(R.id.txtH312);
            secH313 = (LinearLayout) findViewById(R.id.secH313);
            VlblH313 = (TextView) findViewById(R.id.VlblH313);
            txtH313 = (EditText) findViewById(R.id.txtH313);
            seclbl321 = (LinearLayout) findViewById(R.id.seclbl321);
            secH321 = (LinearLayout) findViewById(R.id.secH321);
            VlblH321 = (TextView) findViewById(R.id.VlblH321);
            spnH321 = (Spinner) findViewById(R.id.spnH321);
            secH321X = (LinearLayout) findViewById(R.id.secH321X);
            VlblH321X = (TextView) findViewById(R.id.VlblH321X);
            txtH321X = (EditText) findViewById(R.id.txtH321X);

            List<String> listH321 = new ArrayList<String>();

            listH321.add("");
            listH321.add("1-প্রাকৃতিকউপাদানেরতৈরীমেঝে (কাদামাটি বালি) ");
            listH321.add("2-কাচামেঝে(কাঠের তক্তা তাল গাছ বাশ)");
            listH321.add("3-পাকা মেঝে (সিরামিক টাইলস ইট সিমেন্ট)");
            listH321.add("4-অনান্য ");

            ArrayAdapter<String> adptrH321 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH321);
            spnH321.setAdapter(adptrH321);
            spnH321.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 4) {
                        txtH321X.setVisibility(View.VISIBLE);
                    } else {
                        txtH321X.setVisibility(View.GONE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            secH321X = (LinearLayout) findViewById(R.id.secH321X);
            VlblH321X = (TextView) findViewById(R.id.VlblH321X);
            txtH321X = (EditText) findViewById(R.id.txtH321X);
            secH321X.setVisibility(View.GONE);

            secH322 = (LinearLayout) findViewById(R.id.secH322);
            VlblH322 = (TextView) findViewById(R.id.VlblH322);
            spnH322 = (Spinner) findViewById(R.id.spnH322);
            List<String> listH322 = new ArrayList<String>();

            listH322.add("");
            listH322.add("1- প্রাকৃতিক উপাদানেরতৈরীছাদ খড় অথবা তালপাতা অথবা নারিকেল পাতা প্রভৃতি");
            listH322.add("2-চাছাদ কাঠের তক্তা অথবা তাল গাছ অথবা বাশ অথবা বোর্ড অথবা পলিথিন অথবা চাটাই     ");
            listH322.add("3-পাকাছাদ টিন অথবা কাঠ অথবা টালি অথবা  ইট সিমেন্ট  সুরকি  ");
            listH322.add("4-অনান্");

            ArrayAdapter<String> adptrH322 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH322);
            spnH322.setAdapter(adptrH322);

            secH322X = (LinearLayout) findViewById(R.id.secH322X);
            VlblH322X = (TextView) findViewById(R.id.VlblH322X);
            txtH322X = (EditText) findViewById(R.id.txtH322X);
            secH322X.setVisibility(View.GONE);
            spnH322.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 4) {
                        txtH322X.setVisibility(View.VISIBLE);
                    } else {
                        txtH322X.setVisibility(View.GONE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            secH323 = (LinearLayout) findViewById(R.id.secH323);
            VlblH323 = (TextView) findViewById(R.id.VlblH323);
            spnH323 = (Spinner) findViewById(R.id.spnH323);
            List<String> listH323 = new ArrayList<String>();

            listH323.add("");
            listH323.add("1-প্রাকৃতিকউপাদানেরতৈরীদেয়াল দেয়াল নেই অথবা বেত অথবা ইক্ষু জাতীয় পাতা অথবা তাল পাতা অথবা গাছের গুড়িঅথবা কাদা মাটি             ");
            listH323.add("2-কাচাদেয়াল বাশ ও মাটি অথবা পাথর ও মাটি অথবা প্লাইউড অথবা  কার্ডবোর্ড অথবা পলিথিন অথবা চাটাই ");
            listH323.add("3-পাকাদেয়াল টিন অথবা  সিমেন্ট অথবা পাথর ও চুন অথবা সিমেন্ট ইট অথবা কাঠের তক্তা অথবা ফলক");
            listH323.add("4-অনান্য");

            ArrayAdapter<String> adptrH323 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH323);
            spnH323.setAdapter(adptrH323);

            secH323X = (LinearLayout) findViewById(R.id.secH323X);
            VlblH323X = (TextView) findViewById(R.id.VlblH323X);
            txtH323X = (EditText) findViewById(R.id.txtH323X);
            secH323X.setVisibility(View.GONE);
            spnH323.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 4) {
                        txtH323X.setVisibility(View.VISIBLE);
                    } else {
                        txtH323X.setVisibility(View.GONE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            secH324 = (LinearLayout) findViewById(R.id.secH324);
            VlblH324 = (TextView) findViewById(R.id.VlblH324);
            spnH324 = (Spinner) findViewById(R.id.spnH324);
            List<String> listH324 = new ArrayList<String>();

            listH324.add("");
            listH324.add("1-কেরোসিন ল্যাম্প অথবা লন্ঠন");
            listH324.add("2-বিদ্যুত");
            listH324.add("3-মোমবাতি ");
            listH324.add("4-গ্যাস ল্যাম্প অথবা বায়োগ্যাস");
            listH324.add("5-সোলার প্লেট ");
            listH324.add("6- অনান্য");
            ArrayAdapter<String> adptrH324 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH324);
            spnH324.setAdapter(adptrH324);

            secH324X = (LinearLayout) findViewById(R.id.secH324X);
            VlblH324X = (TextView) findViewById(R.id.VlblH324X);
            txtH324X = (EditText) findViewById(R.id.txtH324X);
            secH324X.setVisibility(View.GONE);
            spnH324.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6) {
                        txtH324X.setVisibility(View.VISIBLE);
                    } else {
                        txtH324X.setVisibility(View.GONE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            secH325 = (LinearLayout) findViewById(R.id.secH325);
            VlblH325 = (TextView) findViewById(R.id.VlblH325);
            spnH325 = (Spinner) findViewById(R.id.spnH325);
            List<String> listH325 = new ArrayList<String>();

            listH325.add("");
            listH325.add("1-বিদ্যুৎ");
            listH325.add("2-এল,পি,জি ");
            listH325.add("3-প্রাকৃতিক গ্যাস");
            listH325.add("4-বায়োগ্যাস");
            listH325.add("5-কেরোসিন");
            listH325.add("6-কয়লা");
            listH325.add("7-কাঠ ");
            listH325.add("8-পাঠখড়ি অথবা খড় অথবা নাড়া অথবা পাতা ");
            listH325.add("9-কৃষি ফসলের অবশিষ্টাংশ");
            listH325.add("10-গোবর ");
            listH325.add("11- অনান্য ");
            ArrayAdapter<String> adptrH325 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH325);
            spnH325.setAdapter(adptrH325);

            secH325X = (LinearLayout) findViewById(R.id.secH325X);
            VlblH325X = (TextView) findViewById(R.id.VlblH325X);
            txtH325X = (EditText) findViewById(R.id.txtH325X);
            secH325X.setVisibility(View.GONE);
            spnH325.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 11) {
                        txtH325X.setVisibility(View.VISIBLE);
                    } else {
                        txtH325X.setText("");
                        txtH325X.setVisibility(View.GONE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            seclb331 = (LinearLayout) findViewById(R.id.seclb331);
            secH331 = (LinearLayout) findViewById(R.id.secH331);
            VlblH331 = (TextView) findViewById(R.id.VlblH331);
            rdogrpH331 = (RadioGroup) findViewById(R.id.rdogrpH331);

            rdoH3311 = (RadioButton) findViewById(R.id.rdoH3311);
            rdoH3312 = (RadioButton) findViewById(R.id.rdoH3312);
            rdoH3313 = (RadioButton) findViewById(R.id.rdoH3313);
            rdogrpH331.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH331 = new String[]{"1", "0", "8"};
                    for (int i = 0; i < rdogrpH331.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH331.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH331[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH332A.setVisibility(View.GONE);
                        txtH332A.setText("");
                        secH332B.setVisibility(View.GONE);
                        txtH332B.setText("");
                    } else if (rbData.equalsIgnoreCase("8")) {
                        secH332A.setVisibility(View.GONE);
                        txtH332A.setText("");
                        secH332B.setVisibility(View.GONE);
                        txtH332B.setText("");
                    } else {
                        secH332A.setVisibility(View.VISIBLE);
                        secH332B.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH332A = (LinearLayout) findViewById(R.id.secH332A);
            VlblH332A = (TextView) findViewById(R.id.VlblH332A);
            txtH332A = (EditText) findViewById(R.id.txtH332A);
            secH332B = (LinearLayout) findViewById(R.id.secH332B);
            VlblH332B = (TextView) findViewById(R.id.VlblH332B);
            txtH332B = (EditText) findViewById(R.id.txtH332B);
            seclb341 = (LinearLayout) findViewById(R.id.seclb341);
            secH341 = (LinearLayout) findViewById(R.id.secH341);
            VlblH341 = (TextView) findViewById(R.id.VlblH341);
            rdogrpH341 = (RadioGroup) findViewById(R.id.rdogrpH341);

            rdoH3411 = (RadioButton) findViewById(R.id.rdoH3411);
            rdoH3412 = (RadioButton) findViewById(R.id.rdoH3412);
            rdoH3413 = (RadioButton) findViewById(R.id.rdoH3413);
            secH342 = (LinearLayout) findViewById(R.id.secH342);
            VlblH342 = (TextView) findViewById(R.id.VlblH342);
            txtH342 = (EditText) findViewById(R.id.txtH342);
            seclb61 = (LinearLayout) findViewById(R.id.seclb61);
            secH61 = (LinearLayout) findViewById(R.id.secH61);
            VlblH61 = (TextView) findViewById(R.id.VlblH61);
            rdogrpH61 = (RadioGroup) findViewById(R.id.rdogrpH61);

            rdoH611 = (RadioButton) findViewById(R.id.rdoH611);
            rdoH612 = (RadioButton) findViewById(R.id.rdoH612);
            secH62 = (LinearLayout) findViewById(R.id.secH62);
            VlblH62 = (TextView) findViewById(R.id.VlblH62);
            rdogrpH62 = (RadioGroup) findViewById(R.id.rdogrpH62);

            rdoH621 = (RadioButton) findViewById(R.id.rdoH621);
            rdoH622 = (RadioButton) findViewById(R.id.rdoH622);
            rdoH623 = (RadioButton) findViewById(R.id.rdoH623);
            secH63 = (LinearLayout) findViewById(R.id.secH63);
            VlblH63 = (TextView) findViewById(R.id.VlblH63);
            spnH63 = (Spinner) findViewById(R.id.spnH63);
            List<String> listH63 = new ArrayList<String>();

            listH63.add("");
            listH63.add("1-পাইপড সুয়ার সিস্টেম");
            listH63.add("2-সেপটিক ট্যাংক ");
            listH63.add("3-স্লাব সহ পিট টয়লেট ");
            listH63.add("4- স্লাব ছাড়া পিট টয়লেট ");
            listH63.add("5-পুওর ফ্ল্যাশ ");
            listH63.add("6-খোলা পিট");
            listH63.add("7-ঝুলন্ত শৌচাগার ");
            listH63.add("8-কোন শৌচাগার নেই");

            ArrayAdapter<String> adptrH63 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH63);
            spnH63.setAdapter(adptrH63);

            seclb64 = (LinearLayout) findViewById(R.id.seclb64);
            secH64A = (LinearLayout) findViewById(R.id.secH64A);
            VlblH64A = (TextView) findViewById(R.id.VlblH64A);
            spnH64A = (Spinner) findViewById(R.id.spnH64A);
            List<String> listH64A = new ArrayList<String>();

            listH64A.add("");
            listH64A.add("1-নির্দিষ্ট জায়গায় (বাড়ির উঠোনে অথবা বাইরে) ");
            listH64A.add("2-এখানে সেখানে ");
            listH64A.add("3-একটি নির্দিষ্ট ময়লা ফেলার যায়গায়");
            listH64A.add("7-অনান্য");
            ArrayAdapter<String> adptrH64A = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH64A);
            spnH64A.setAdapter(adptrH64A);

            secH64B = (LinearLayout) findViewById(R.id.secH64B);
            VlblH64B = (TextView) findViewById(R.id.VlblH64B);
            spnH64B = (Spinner) findViewById(R.id.spnH64B);
            List<String> listH64B = new ArrayList<String>();

            listH64B.add("");
            listH64B.add("1-নির্দিষ্ট জায়গায় (বাড়ির উঠোনে অথবা বাইরে) ");
            listH64B.add("2-এখানে সেখানে ");
            listH64B.add("3-একটি নির্দিষ্ট ময়লা ফেলার যায়গায়");
            listH64B.add("7-অনান্য");
            ArrayAdapter<String> adptrH64B = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH64B);
            spnH64B.setAdapter(adptrH64B);

            secH64C = (LinearLayout) findViewById(R.id.secH64C);
            VlblH64C = (TextView) findViewById(R.id.VlblH64C);
            spnH64C = (Spinner) findViewById(R.id.spnH64C);
            List<String> listH64C = new ArrayList<String>();

            listH64C.add("");
            listH64C.add("1-নির্দিষ্ট জায়গায় (বাড়ির উঠোনে অথবা বাইরে) ");
            listH64C.add("2-এখানে সেখানে ");
            listH64C.add("3-একটি নির্দিষ্ট ময়লা ফেলার যায়গায়");
            listH64C.add("7-অনান্য");
            ArrayAdapter<String> adptrH64C = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH64C);
            spnH64C.setAdapter(adptrH64C);

            secH64D = (LinearLayout) findViewById(R.id.secH64D);
            VlblH64D = (TextView) findViewById(R.id.VlblH64D);
            spnH64D = (Spinner) findViewById(R.id.spnH64D);
            List<String> listH64D = new ArrayList<String>();

            listH64D.add("");
            listH64D.add("1-নির্দিষ্ট জায়গায় (বাড়ির উঠোনে অথবা বাইরে) ");
            listH64D.add("2-এখানে সেখানে ");
            listH64D.add("3-একটি নির্দিষ্ট ময়লা ফেলার যায়গায়");
            listH64D.add("7-অনান্য");
            ArrayAdapter<String> adptrH64D = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH64D);
            spnH64D.setAdapter(adptrH64D);

            secH64E = (LinearLayout) findViewById(R.id.secH64E);
            VlblH64E = (TextView) findViewById(R.id.VlblH64E);
            spnH64E = (Spinner) findViewById(R.id.spnH64E);
            List<String> listH64E = new ArrayList<String>();

            listH64E.add("");
            listH64E.add("1-নির্দিষ্ট জায়গায় (বাড়ির উঠোনে অথবা বাইরে) ");
            listH64E.add("2-এখানে সেখানে ");
            listH64E.add("3-একটি নির্দিষ্ট ময়লা ফেলার যায়গায়");
            listH64E.add("7-অনান্য");
            ArrayAdapter<String> adptrH64E = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH64E);
            spnH64E.setAdapter(adptrH64E);

            secH64X = (LinearLayout) findViewById(R.id.secH64X);
            VlblH64X = (TextView) findViewById(R.id.VlblH64X);
            txtH64X = (EditText) findViewById(R.id.txtH64X);
            secH64X.setVisibility(View.GONE);
            spnH64E.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 4) {
                        txtH64X.setVisibility(View.VISIBLE);
                    } else {
                        txtH64X.setText("");
                        txtH64X.setVisibility(View.GONE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            secH65 = (LinearLayout) findViewById(R.id.secH65);
            VlblH65 = (TextView) findViewById(R.id.VlblH65);
            rdogrpH65 = (RadioGroup) findViewById(R.id.rdogrpH65);

            rdoH651 = (RadioButton) findViewById(R.id.rdoH651);
            rdoH652 = (RadioButton) findViewById(R.id.rdoH652);
            secH66 = (LinearLayout) findViewById(R.id.secH66);
            VlblH66 = (TextView) findViewById(R.id.VlblH66);
            spnH66 = (Spinner) findViewById(R.id.spnH66);
            List<String> listH66 = new ArrayList<String>();

            listH66.add("");
            listH66.add("1-গর্ত অথবা ড্রাম ");
            listH66.add("2-নদী বা খাল বা বিল বা পুকুর ");
            listH66.add("3-রাস্তার পাশে বা মাঠে বা ড্রেন");
            listH66.add("4-খানার বা রান্না ঘরেরআশেপাশে  ");
            ArrayAdapter<String> adptrH66 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH66);
            spnH66.setAdapter(adptrH66);

            seclb67 = (LinearLayout) findViewById(R.id.seclb67);
            secH67 = (LinearLayout) findViewById(R.id.secH67);
            VlblH67 = (TextView) findViewById(R.id.VlblH67);
            rdogrpH67 = (RadioGroup) findViewById(R.id.rdogrpH67);

            rdoH671 = (RadioButton) findViewById(R.id.rdoH671);
            rdoH672 = (RadioButton) findViewById(R.id.rdoH672);
            rdoH673 = (RadioButton) findViewById(R.id.rdoH673);
            rdoH674 = (RadioButton) findViewById(R.id.rdoH674);
            secH68 = (LinearLayout) findViewById(R.id.secH68);
            VlblH68 = (TextView) findViewById(R.id.VlblH68);
            rdogrpH68 = (RadioGroup) findViewById(R.id.rdogrpH68);

            rdoH681 = (RadioButton) findViewById(R.id.rdoH681);
            rdoH682 = (RadioButton) findViewById(R.id.rdoH682);
            rdoH683 = (RadioButton) findViewById(R.id.rdoH683);
            secH69 = (LinearLayout) findViewById(R.id.secH69);
            VlblH69 = (TextView) findViewById(R.id.VlblH69);
            rdogrpH69 = (RadioGroup) findViewById(R.id.rdogrpH69);

            rdoH691 = (RadioButton) findViewById(R.id.rdoH691);
            rdoH692 = (RadioButton) findViewById(R.id.rdoH692);
            rdoH693 = (RadioButton) findViewById(R.id.rdoH693);
            secH610 = (LinearLayout) findViewById(R.id.secH610);
            VlblH610 = (TextView) findViewById(R.id.VlblH610);
            rdogrpH610 = (RadioGroup) findViewById(R.id.rdogrpH610);

            rdoH6101 = (RadioButton) findViewById(R.id.rdoH6101);
            rdoH6102 = (RadioButton) findViewById(R.id.rdoH6102);
            rdoH6103 = (RadioButton) findViewById(R.id.rdoH6103);
            secH611 = (LinearLayout) findViewById(R.id.secH611);
            VlblH611 = (TextView) findViewById(R.id.VlblH611);
            rdogrpH611 = (RadioGroup) findViewById(R.id.rdogrpH611);

            rdoH6111 = (RadioButton) findViewById(R.id.rdoH6111);
            rdoH6112 = (RadioButton) findViewById(R.id.rdoH6112);
            rdoH6113 = (RadioButton) findViewById(R.id.rdoH6113);
            seclb612 = (LinearLayout) findViewById(R.id.seclb612);
            secH612R = (LinearLayout) findViewById(R.id.secH612R);
            VlblH612R = (TextView) findViewById(R.id.VlblH612R);
            spnH612R = (Spinner) findViewById(R.id.spnH612R);
            List<String> listH612R = new ArrayList<String>();

            listH612R.add("");
            listH612R.add("1-টিউবওয়েল");
            listH612R.add("2-নদী বা খাল পুকুর");
            listH612R.add("3-বৃষ্টির পানি ");
            listH612R.add("0-হাত ধোয়ে না          ");
            listH612R.add("7-অনান্য");
            ArrayAdapter<String> adptrH612R = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH612R);
            spnH612R.setAdapter(adptrH612R);

            secH612RX = (LinearLayout) findViewById(R.id.secH612RX);
            VlblH612RX = (TextView) findViewById(R.id.VlblH612RX);
            txtH612RX = (EditText) findViewById(R.id.txtH612RX);
            secH612D = (LinearLayout) findViewById(R.id.secH612D);
            VlblH612D = (TextView) findViewById(R.id.VlblH612D);
            spnH612D = (Spinner) findViewById(R.id.spnH612D);
            List<String> listH612D = new ArrayList<String>();

            listH612D.add("");
            listH612D.add("1-টিউবওয়েল");
            listH612D.add("2-নদী বা খাল পুকুর");
            listH612D.add("3-বৃষ্টির পানি ");
            listH612D.add("0-হাত ধোয়ে না          ");
            listH612D.add("7-অনান্য");
            ArrayAdapter<String> adptrH612D = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH612D);
            spnH612D.setAdapter(adptrH612D);

            secH612DX = (LinearLayout) findViewById(R.id.secH612DX);
            VlblH612DX = (TextView) findViewById(R.id.VlblH612DX);
            txtH612DX = (EditText) findViewById(R.id.txtH612DX);
            secH612a = (LinearLayout) findViewById(R.id.secH612a);
            VlblH612a = (TextView) findViewById(R.id.VlblH612a);
            rdogrpH612a = (RadioGroup) findViewById(R.id.rdogrpH612a);

            rdoH612a1 = (RadioButton) findViewById(R.id.rdoH612a1);
            rdoH612a2 = (RadioButton) findViewById(R.id.rdoH612a2);
            rdoH612a3 = (RadioButton) findViewById(R.id.rdoH612a3);
            rdoH612a4 = (RadioButton) findViewById(R.id.rdoH612a4);
            secLBH612 = (LinearLayout) findViewById(R.id.secLBH612);
            secH612b1 = (LinearLayout) findViewById(R.id.secH612b1);
            VlblH612b1 = (TextView) findViewById(R.id.VlblH612b1);
            chkH612b1 = (CheckBox) findViewById(R.id.chkH612b1);
            secH612b2 = (LinearLayout) findViewById(R.id.secH612b2);
            VlblH612b2 = (TextView) findViewById(R.id.VlblH612b2);
            chkH612b2 = (CheckBox) findViewById(R.id.chkH612b2);
            secH612b3 = (LinearLayout) findViewById(R.id.secH612b3);
            VlblH612b3 = (TextView) findViewById(R.id.VlblH612b3);
            chkH612b3 = (CheckBox) findViewById(R.id.chkH612b3);
            secH612b4 = (LinearLayout) findViewById(R.id.secH612b4);
            VlblH612b4 = (TextView) findViewById(R.id.VlblH612b4);
            chkH612b4 = (CheckBox) findViewById(R.id.chkH612b4);
            secH612bX = (LinearLayout) findViewById(R.id.secH612bX);
            VlblH612bX = (TextView) findViewById(R.id.VlblH612bX);
            chkH612bX = (CheckBox) findViewById(R.id.chkH612bX);
            secH612X1 = (LinearLayout) findViewById(R.id.secH612X1);
            VlblH612X1 = (TextView) findViewById(R.id.VlblH612X1);
            txtH612X1 = (EditText) findViewById(R.id.txtH612X1);
            chkH612bX.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        secH612X1.setVisibility(View.VISIBLE);
                    } else {
                        txtH612X1.setText("");
                        secH612X1.setVisibility(View.GONE);
                    }
                }

            });
            secH612X1.setVisibility(View.GONE);
            secH612b5 = (LinearLayout) findViewById(R.id.secH612b5);
            VlblH612b5 = (TextView) findViewById(R.id.VlblH612b5);
            chkH612b5 = (CheckBox) findViewById(R.id.chkH612b5);
            secH612c = (LinearLayout) findViewById(R.id.secH612c);
            VlblH612c = (TextView) findViewById(R.id.VlblH612c);
            rdogrpH612c = (RadioGroup) findViewById(R.id.rdogrpH612c);

            rdoH612c1 = (RadioButton) findViewById(R.id.rdoH612c1);
            rdoH612c2 = (RadioButton) findViewById(R.id.rdoH612c2);
            rdoH612c3 = (RadioButton) findViewById(R.id.rdoH612c3);
            secLBH613 = (LinearLayout) findViewById(R.id.secLBH613);
            secH613R = (LinearLayout) findViewById(R.id.secH613R);
            VlblH613R = (TextView) findViewById(R.id.VlblH613R);
            spnH613R = (Spinner) findViewById(R.id.spnH613R);
            List<String> listH613R = new ArrayList<String>();

            listH613R.add("");
            listH613R.add("1-টিউবওয়েল");
            listH613R.add("2-নদী বা খাল পুকুর");
            listH613R.add("3-বৃষ্টির পানি ");
            listH613R.add("0-হাত ধোয়ে না          ");
            listH613R.add("7-অনান্য");
            ArrayAdapter<String> adptrH613R = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH613R);
            spnH613R.setAdapter(adptrH613R);

            secH613RX = (LinearLayout) findViewById(R.id.secH613RX);
            VlblH613RX = (TextView) findViewById(R.id.VlblH613RX);
            txtH613RX = (EditText) findViewById(R.id.txtH613RX);
            secH613D = (LinearLayout) findViewById(R.id.secH613D);
            VlblH613D = (TextView) findViewById(R.id.VlblH613D);
            spnH613D = (Spinner) findViewById(R.id.spnH613D);
            List<String> listH613D = new ArrayList<String>();

            listH613D.add("");
            listH613D.add("1-টিউবওয়েল");
            listH613D.add("2-নদী বা খাল পুকুর");
            listH613D.add("3-বৃষ্টির পানি ");
            listH613D.add("0-হাত ধোয়ে না");
            listH613D.add("7-অনান্য");
            ArrayAdapter<String> adptrH613D = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH613D);
            spnH613D.setAdapter(adptrH613D);

            secH613DX = (LinearLayout) findViewById(R.id.secH613DX);
            VlblH613DX = (TextView) findViewById(R.id.VlblH613DX);
            txtH613DX = (EditText) findViewById(R.id.txtH613DX);
            secH613a = (LinearLayout) findViewById(R.id.secH613a);
            VlblH613a = (TextView) findViewById(R.id.VlblH613a);
            rdogrpH613a = (RadioGroup) findViewById(R.id.rdogrpH613a);

            rdoH613a1 = (RadioButton) findViewById(R.id.rdoH613a1);
            rdoH613a2 = (RadioButton) findViewById(R.id.rdoH613a2);
            rdoH613a3 = (RadioButton) findViewById(R.id.rdoH613a3);
            secLB613 = (LinearLayout) findViewById(R.id.secLB613);
            secH613b1 = (LinearLayout) findViewById(R.id.secH613b1);
            VlblH613b1 = (TextView) findViewById(R.id.VlblH613b1);
            chkH613b1 = (CheckBox) findViewById(R.id.chkH613b1);
            secH613b2 = (LinearLayout) findViewById(R.id.secH613b2);
            VlblH613b2 = (TextView) findViewById(R.id.VlblH613b2);
            chkH613b2 = (CheckBox) findViewById(R.id.chkH613b2);
            secH613b3 = (LinearLayout) findViewById(R.id.secH613b3);
            VlblH613b3 = (TextView) findViewById(R.id.VlblH613b3);
            chkH613b3 = (CheckBox) findViewById(R.id.chkH613b3);
            secH613b4 = (LinearLayout) findViewById(R.id.secH613b4);
            VlblH613b4 = (TextView) findViewById(R.id.VlblH613b4);
            chkH613b4 = (CheckBox) findViewById(R.id.chkH613b4);
            secH613bX = (LinearLayout) findViewById(R.id.secH613bX);
            VlblH613bX = (TextView) findViewById(R.id.VlblH613bX);
            chkH613bX = (CheckBox) findViewById(R.id.chkH613bX);
            secH613bX1 = (LinearLayout) findViewById(R.id.secH613bX1);
            VlblH613bX1 = (TextView) findViewById(R.id.VlblH613bX1);
            txtH613bX1 = (EditText) findViewById(R.id.txtH613bX1);

            chkH613bX.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        secH613bX1.setVisibility(View.VISIBLE);
                    } else {
                        txtH613bX1.setText("");
                        secH613bX1.setVisibility(View.GONE);
                    }
                }

            });
            secH613bX1.setVisibility(View.GONE);
            secH613b5 = (LinearLayout) findViewById(R.id.secH613b5);
            VlblH613b5 = (TextView) findViewById(R.id.VlblH613b5);
            chkH613b5 = (CheckBox) findViewById(R.id.chkH613b5);
            secLBH614 = (LinearLayout) findViewById(R.id.secLBH614);
            secH614R = (LinearLayout) findViewById(R.id.secH614R);
            VlblH614R = (TextView) findViewById(R.id.VlblH614R);
            spnH614R = (Spinner) findViewById(R.id.spnH614R);
            List<String> listH614R = new ArrayList<String>();

            listH614R.add("");
            listH614R.add("1-টিউবওয়েল");
            listH614R.add("2-নদী বা খাল পুকুর");
            listH614R.add("3-বৃষ্টির পানি ");
            listH614R.add("0-হাত ধোয়ে না          ");
            listH614R.add("7-অনান্য");
            ArrayAdapter<String> adptrH614R = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH614R);
            spnH614R.setAdapter(adptrH614R);

            secH614RX = (LinearLayout) findViewById(R.id.secH614RX);
            VlblH614RX = (TextView) findViewById(R.id.VlblH614RX);
            txtH614RX = (EditText) findViewById(R.id.txtH614RX);
            secH614D = (LinearLayout) findViewById(R.id.secH614D);
            VlblH614D = (TextView) findViewById(R.id.VlblH614D);
            spnH614D = (Spinner) findViewById(R.id.spnH614D);
            List<String> listH614D = new ArrayList<String>();

            listH614D.add("");
            listH614D.add("1-টিউবওয়েল");
            listH614D.add("2-নদী বা খাল পুকুর");
            listH614D.add("3-বৃষ্টির পানি ");
            listH614D.add("0-হাত ধোয়ে না          ");
            listH614D.add("7-অনান্য");
            ArrayAdapter<String> adptrH614D = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH614D);
            spnH614D.setAdapter(adptrH614D);

            secH614DX = (LinearLayout) findViewById(R.id.secH614DX);
            VlblH614DX = (TextView) findViewById(R.id.VlblH614DX);
            txtH614DX = (EditText) findViewById(R.id.txtH614DX);
            secH614a = (LinearLayout) findViewById(R.id.secH614a);
            VlblH614a = (TextView) findViewById(R.id.VlblH614a);
            rdogrpH614a = (RadioGroup) findViewById(R.id.rdogrpH614a);

            rdoH614a1 = (RadioButton) findViewById(R.id.rdoH614a1);
            rdoH614a2 = (RadioButton) findViewById(R.id.rdoH614a2);
            rdoH614a3 = (RadioButton) findViewById(R.id.rdoH614a3);
            secLB614 = (LinearLayout) findViewById(R.id.secLB614);
            secH614b1 = (LinearLayout) findViewById(R.id.secH614b1);
            VlblH614b1 = (TextView) findViewById(R.id.VlblH614b1);
            chkH614b1 = (CheckBox) findViewById(R.id.chkH614b1);
            secH614b2 = (LinearLayout) findViewById(R.id.secH614b2);
            VlblH614b2 = (TextView) findViewById(R.id.VlblH614b2);
            chkH614b2 = (CheckBox) findViewById(R.id.chkH614b2);
            secH614b3 = (LinearLayout) findViewById(R.id.secH614b3);
            VlblH614b3 = (TextView) findViewById(R.id.VlblH614b3);
            chkH614b3 = (CheckBox) findViewById(R.id.chkH614b3);
            secH614b4 = (LinearLayout) findViewById(R.id.secH614b4);
            VlblH614b4 = (TextView) findViewById(R.id.VlblH614b4);
            chkH614b4 = (CheckBox) findViewById(R.id.chkH614b4);
            secH614bX = (LinearLayout) findViewById(R.id.secH614bX);
            VlblH614bX = (TextView) findViewById(R.id.VlblH614bX);
            chkH614bX = (CheckBox) findViewById(R.id.chkH614bX);
            secH614bX1 = (LinearLayout) findViewById(R.id.secH614bX1);
            VlblH614bX1 = (TextView) findViewById(R.id.VlblH614bX1);
            txtH614bX1 = (EditText) findViewById(R.id.txtH614bX1);
            chkH614bX.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        secH614bX1.setVisibility(View.VISIBLE);
                    } else {
                        txtH614bX1.setText("");
                        secH614bX1.setVisibility(View.GONE);
                    }
                }

            });
            secH614bX1.setVisibility(View.GONE);
            secH614b5 = (LinearLayout) findViewById(R.id.secH614b5);
            VlblH614b5 = (TextView) findViewById(R.id.VlblH614b5);
            chkH614b5 = (CheckBox) findViewById(R.id.chkH614b5);
            secH614c = (LinearLayout) findViewById(R.id.secH614c);
            VlblH614c = (TextView) findViewById(R.id.VlblH614c);
            rdogrpH614c = (RadioGroup) findViewById(R.id.rdogrpH614c);

            rdoH614c1 = (RadioButton) findViewById(R.id.rdoH614c1);
            rdoH614c2 = (RadioButton) findViewById(R.id.rdoH614c2);
            rdoH614c3 = (RadioButton) findViewById(R.id.rdoH614c3);
            secLBH615 = (LinearLayout) findViewById(R.id.secLBH615);
            secH615R = (LinearLayout) findViewById(R.id.secH615R);
            VlblH615R = (TextView) findViewById(R.id.VlblH615R);
            spnH615R = (Spinner) findViewById(R.id.spnH615R);
            List<String> listH615R = new ArrayList<String>();

            listH615R.add("");
            listH615R.add("1-টিউবওয়েল");
            listH615R.add("2-নদী বা খাল পুকুর");
            listH615R.add("3-বৃষ্টির পানি ");
            listH615R.add("0-হাত ধোয়ে না          ");
            listH615R.add("7-অনান্য");
            ArrayAdapter<String> adptrH615R = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH615R);
            spnH615R.setAdapter(adptrH615R);

            secH615RX = (LinearLayout) findViewById(R.id.secH615RX);
            VlblH615RX = (TextView) findViewById(R.id.VlblH615RX);
            txtH615RX = (EditText) findViewById(R.id.txtH615RX);
            secH615D = (LinearLayout) findViewById(R.id.secH615D);
            VlblH615D = (TextView) findViewById(R.id.VlblH615D);
            spnH615D = (Spinner) findViewById(R.id.spnH615D);
            List<String> listH615D = new ArrayList<String>();

            listH615D.add("");
            listH615D.add("1-টিউবওয়েল");
            listH615D.add("2-নদী বা খাল পুকুর");
            listH615D.add("3-বৃষ্টির পানি ");
            listH615D.add("0-হাত ধোয়ে না          ");
            listH615D.add("7-অনান্য");
            ArrayAdapter<String> adptrH615D = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH615D);
            spnH615D.setAdapter(adptrH615D);

            secH615DX = (LinearLayout) findViewById(R.id.secH615DX);
            VlblH615DX = (TextView) findViewById(R.id.VlblH615DX);
            txtH615DX = (EditText) findViewById(R.id.txtH615DX);
            secH615a = (LinearLayout) findViewById(R.id.secH615a);
            VlblH615a = (TextView) findViewById(R.id.VlblH615a);
            rdogrpH615a = (RadioGroup) findViewById(R.id.rdogrpH615a);

            rdoH615a1 = (RadioButton) findViewById(R.id.rdoH615a1);
            rdoH615a2 = (RadioButton) findViewById(R.id.rdoH615a2);
            rdoH615a3 = (RadioButton) findViewById(R.id.rdoH615a3);
            secLB615 = (LinearLayout) findViewById(R.id.secLB615);
            secH615b1 = (LinearLayout) findViewById(R.id.secH615b1);
            VlblH615b1 = (TextView) findViewById(R.id.VlblH615b1);
            chkH615b1 = (CheckBox) findViewById(R.id.chkH615b1);
            secH615b2 = (LinearLayout) findViewById(R.id.secH615b2);
            VlblH615b2 = (TextView) findViewById(R.id.VlblH615b2);
            chkH615b2 = (CheckBox) findViewById(R.id.chkH615b2);
            secH615b3 = (LinearLayout) findViewById(R.id.secH615b3);
            VlblH615b3 = (TextView) findViewById(R.id.VlblH615b3);
            chkH615b3 = (CheckBox) findViewById(R.id.chkH615b3);
            secH615b4 = (LinearLayout) findViewById(R.id.secH615b4);
            VlblH615b4 = (TextView) findViewById(R.id.VlblH615b4);
            spnH615b4 = (Spinner) findViewById(R.id.spnH615b4);
            List<String> listH615b4 = new ArrayList<String>();

            listH615b4.add("");
            listH615b4.add("1-কলস  ");
            listH615b4.add("2-বালতি  ");
            listH615b4.add("3-জালা বা মটকা ");
            listH615b4.add("4-ড্রাম ");
            listH615b4.add("5-অনান্য");
            listH615b4.add("6-সংরক্ষণ করে না");
            ArrayAdapter<String> adptrH615b4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH615b4);
            spnH615b4.setAdapter(adptrH615b4);

            secH615bX = (LinearLayout) findViewById(R.id.secH615bX);
            VlblH615bX = (TextView) findViewById(R.id.VlblH615bX);
            chkH615bX = (CheckBox) findViewById(R.id.chkH615bX);
            secH615X1 = (LinearLayout) findViewById(R.id.secH615X1);
            VlblH615X1 = (TextView) findViewById(R.id.VlblH615X1);
            txtH615X1 = (EditText) findViewById(R.id.txtH615X1);

            chkH615bX.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        secH615X1.setVisibility(View.VISIBLE);
                    } else {
                        txtH615X1.setText("");
                        secH615X1.setVisibility(View.GONE);
                    }
                }

            });
            secH615X1.setVisibility(View.GONE);
            secH615b5 = (LinearLayout) findViewById(R.id.secH615b5);
            VlblH615b5 = (TextView) findViewById(R.id.VlblH615b5);
            chkH615b5 = (CheckBox) findViewById(R.id.chkH615b5);
            secLBH616 = (LinearLayout) findViewById(R.id.secLBH616);
            secH616R = (LinearLayout) findViewById(R.id.secH616R);
            VlblH616R = (TextView) findViewById(R.id.VlblH616R);
            spnH616R = (Spinner) findViewById(R.id.spnH616R);
            List<String> listH616R = new ArrayList<String>();

            listH616R.add("");
            listH616R.add("1-টিউবওয়েল");
            listH616R.add("2-নদী বা খাল পুকুর");
            listH616R.add("3-বৃষ্টির পানি ");
            listH616R.add("0-হাত ধোয়ে না          ");
            listH616R.add("7-অনান্য");
            ArrayAdapter<String> adptrH616R = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH616R);
            spnH616R.setAdapter(adptrH616R);

            secH616RX = (LinearLayout) findViewById(R.id.secH616RX);
            VlblH616RX = (TextView) findViewById(R.id.VlblH616RX);
            txtH616RX = (EditText) findViewById(R.id.txtH616RX);
            secH616D = (LinearLayout) findViewById(R.id.secH616D);
            VlblH616D = (TextView) findViewById(R.id.VlblH616D);
            spnH616D = (Spinner) findViewById(R.id.spnH616D);
            List<String> listH616D = new ArrayList<String>();

            listH616D.add("");
            listH616D.add("11-টিউবওয়েল");
            listH616D.add("2-নদী বা খাল পুকুর");
            listH616D.add("3-বৃষ্টির পানি ");
            listH616D.add("0-হাত ধোয়ে না          ");
            listH616D.add("7-অনান্য");
            ArrayAdapter<String> adptrH616D = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH616D);
            spnH616D.setAdapter(adptrH616D);

            secH616DX = (LinearLayout) findViewById(R.id.secH616DX);
            VlblH616DX = (TextView) findViewById(R.id.VlblH616DX);
            txtH616DX = (EditText) findViewById(R.id.txtH616DX);
            secH616a = (LinearLayout) findViewById(R.id.secH616a);
            VlblH616a = (TextView) findViewById(R.id.VlblH616a);
            rdogrpH616a = (RadioGroup) findViewById(R.id.rdogrpH616a);

            rdoH616a1 = (RadioButton) findViewById(R.id.rdoH616a1);
            rdoH616a2 = (RadioButton) findViewById(R.id.rdoH616a2);
            rdoH616a3 = (RadioButton) findViewById(R.id.rdoH616a3);
            secLB616 = (LinearLayout) findViewById(R.id.secLB616);
            secH616b1 = (LinearLayout) findViewById(R.id.secH616b1);
            VlblH616b1 = (TextView) findViewById(R.id.VlblH616b1);
            chkH616b1 = (CheckBox) findViewById(R.id.chkH616b1);
            secH616b2 = (LinearLayout) findViewById(R.id.secH616b2);
            VlblH616b2 = (TextView) findViewById(R.id.VlblH616b2);
            chkH616b2 = (CheckBox) findViewById(R.id.chkH616b2);
            secH616b3 = (LinearLayout) findViewById(R.id.secH616b3);
            VlblH616b3 = (TextView) findViewById(R.id.VlblH616b3);
            chkH616b3 = (CheckBox) findViewById(R.id.chkH616b3);
            secH616b4 = (LinearLayout) findViewById(R.id.secH616b4);
            VlblH616b4 = (TextView) findViewById(R.id.VlblH616b4);
            chkH616b4 = (CheckBox) findViewById(R.id.chkH616b4);
            secH616bX = (LinearLayout) findViewById(R.id.secH616bX);
            VlblH616bX = (TextView) findViewById(R.id.VlblH616bX);
            chkH616bX = (CheckBox) findViewById(R.id.chkH616bX);
            secH616X1 = (LinearLayout) findViewById(R.id.secH616X1);
            VlblH616X1 = (TextView) findViewById(R.id.VlblH616X1);
            txtH616X1 = (EditText) findViewById(R.id.txtH616X1);
            chkH616bX.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        secH616X1.setVisibility(View.VISIBLE);
                    } else {
                        txtH616X1.setText("");
                        secH616X1.setVisibility(View.GONE);
                    }
                }

            });
            secH616X1.setVisibility(View.GONE);
            secH616b5 = (LinearLayout) findViewById(R.id.secH616b5);
            VlblH616b5 = (TextView) findViewById(R.id.VlblH616b5);
            chkH616b5 = (CheckBox) findViewById(R.id.chkH616b5);
            secH616c = (LinearLayout) findViewById(R.id.secH616c);
            VlblH616c = (TextView) findViewById(R.id.VlblH616c);
            rdogrpH616c = (RadioGroup) findViewById(R.id.rdogrpH616c);

            rdoH616c1 = (RadioButton) findViewById(R.id.rdoH616c1);
            rdoH616c2 = (RadioButton) findViewById(R.id.rdoH616c2);
            rdoH616c3 = (RadioButton) findViewById(R.id.rdoH616c3);
            secH617 = (LinearLayout) findViewById(R.id.secH617);
            VlblH617 = (TextView) findViewById(R.id.VlblH617);
            txtH617 = (EditText) findViewById(R.id.txtH617);
            secH618 = (LinearLayout) findViewById(R.id.secH618);
            VlblH618 = (TextView) findViewById(R.id.VlblH618);
            rdogrpH618 = (RadioGroup) findViewById(R.id.rdogrpH618);

            rdoH6181 = (RadioButton) findViewById(R.id.rdoH6181);
            rdoH6182 = (RadioButton) findViewById(R.id.rdoH6182);
            secH619 = (LinearLayout) findViewById(R.id.secH619);
            VlblH619 = (TextView) findViewById(R.id.VlblH619);
            rdogrpH619 = (RadioGroup) findViewById(R.id.rdogrpH619);

            rdoH6191 = (RadioButton) findViewById(R.id.rdoH6191);
            rdoH6192 = (RadioButton) findViewById(R.id.rdoH6192);
            secH620 = (LinearLayout) findViewById(R.id.secH620);
            VlblH620 = (TextView) findViewById(R.id.VlblH620);
            spnH620 = (Spinner) findViewById(R.id.spnH620);
            List<String> listH620 = new ArrayList<String>();

            listH620.add("");
            listH620.add("1-পানি ফোটান ");
            listH620.add("2-ব্লিচিং পাউডার বা ক্লোরিন বা বিশুদ্ধকরণ ট্যাবলেট ");
            listH620.add("3-ছাকনি বা কাপড়ের ভেতর দিয়ে পানি ছাকেন ");
            listH620.add("4-পানি ফিল্টার ব্যবহার করেন সিরামিক বা বালি কম্পজিটইত্যাদি");
            listH620.add("5-পানিকে পাত্রের ভেতর অনেক্ষণ রেখে স্থির হতে দেন ");
            listH620.add("6-অনান্য উল্লেখ কর");
            listH620.add("8-জানিনা ");

            ArrayAdapter<String> adptrH620 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH620);
            spnH620.setAdapter(adptrH620);
            spnH620.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 6) {
                        secH620X.setVisibility(View.VISIBLE);
                    } else {
                        txtH620X.setText("");
                        secH620X.setVisibility(View.GONE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }

            });
            secH620X = (LinearLayout) findViewById(R.id.secH620X);
            secH620X.setVisibility(View.GONE);
            VlblH620X = (TextView) findViewById(R.id.VlblH620X);
            txtH620X = (EditText) findViewById(R.id.txtH620X);
            secH621 = (LinearLayout) findViewById(R.id.secH621);
            VlblH621 = (TextView) findViewById(R.id.VlblH621);
            rdogrpH621 = (RadioGroup) findViewById(R.id.rdogrpH621);

            rdoH6211 = (RadioButton) findViewById(R.id.rdoH6211);
            rdoH6212 = (RadioButton) findViewById(R.id.rdoH6212);
            secH622 = (LinearLayout) findViewById(R.id.secH622);
            VlblH622 = (TextView) findViewById(R.id.VlblH622);
            rdogrpH622 = (RadioGroup) findViewById(R.id.rdogrpH622);

            rdoH6221 = (RadioButton) findViewById(R.id.rdoH6221);
            rdoH6222 = (RadioButton) findViewById(R.id.rdoH6222);
            rdoH6223 = (RadioButton) findViewById(R.id.rdoH6223);


            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(SES.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(SES.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(SES.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(SES.this, "Required field: উপকারভোগী সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (spnH311.getSelectedItemPosition() == 0 & secH311.isShown()) {
                Connection.MessageBox(SES.this, "Required field: খানার মালিকানা.");
                spnH311.requestFocus();
                return;
            } else if (txtH312.getText().toString().length() == 0 & secH312.isShown()) {
                Connection.MessageBox(SES.this, "Required field: এই খানায়ে কয়টি কক্ষ আছে.");
                txtH312.requestFocus();
                return;
            } else if (Integer.valueOf(txtH312.getText().toString().length() == 0 ? "00" : txtH312.getText().toString()) < 00 || Integer.valueOf(txtH312.getText().toString().length() == 0 ? "20" : txtH312.getText().toString()) > 20) {
                Connection.MessageBox(SES.this, "Value should be between 00 and 20(এই খানায়ে কয়টি কক্ষ আছে).");
                txtH312.requestFocus();
                return;
            } else if (txtH313.getText().toString().length() == 0 & secH313.isShown()) {
                Connection.MessageBox(SES.this, "Required field: ঘুমের জন্য কয়টি কক্ষ ব্যবহার করা হয়.");
                txtH313.requestFocus();
                return;
            } else if (Integer.valueOf(txtH313.getText().toString().length() == 0 ? "00" : txtH313.getText().toString()) < 00 || Integer.valueOf(txtH313.getText().toString().length() == 0 ? "10" : txtH313.getText().toString()) > 10) {
                Connection.MessageBox(SES.this, "Value should be between 00 and 10(ঘুমের জন্য কয়টি কক্ষ ব্যবহার করা হয়).");
                txtH313.requestFocus();
                return;
            } else if (spnH321.getSelectedItemPosition() == 0 & secH321.isShown()) {
                Connection.MessageBox(SES.this, "Required field: ঘুমের জন্য কয়টি কক্ষ ব্যবহার করা হয়.");
                spnH321.requestFocus();
                return;
            } else if (txtH321X.getText().toString().length() == 0 & secH321X.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অনান্য উল্লেখ কর.");
                txtH321X.requestFocus();
                return;
            } else if (spnH322.getSelectedItemPosition() == 0 & secH322.isShown()) {
                Connection.MessageBox(SES.this, "Required field: বসত ঘরের ছাদ কি দিয়ে তৈরী.");
                spnH322.requestFocus();
                return;
            } else if (txtH322X.getText().toString().length() == 0 & secH322X.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অনান্য  উল্লেখ কর.");
                txtH322X.requestFocus();
                return;
            } else if (spnH323.getSelectedItemPosition() == 0 & secH323.isShown()) {
                Connection.MessageBox(SES.this, "Required field: বসত ঘরের দেয়াল কি দিয়ে তৈরী.");
                spnH323.requestFocus();
                return;
            } else if (txtH323X.getText().toString().length() == 0 & secH323X.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অনান্য  উল্লেখ কর.");
                txtH323X.requestFocus();
                return;
            } else if (spnH324.getSelectedItemPosition() == 0 & secH324.isShown()) {
                Connection.MessageBox(SES.this, "Required field: এই ঘরের আলোর বর্তমান প্রধান উৎস কী.");
                spnH324.requestFocus();
                return;
            } else if (txtH324X.getText().toString().length() == 0 & secH324X.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অনান্য উল্লেখ কর.");
                txtH324X.requestFocus();
                return;
            } else if (spnH325.getSelectedItemPosition() == 0 & secH325.isShown()) {
                Connection.MessageBox(SES.this, "Required field: আপনার খানার রান্নার কাজে প্রধানত কি জ্বালানী ব্যবহার করেন.");
                spnH325.requestFocus();
                return;
            } else if (txtH325X.getText().toString().length() == 0 & secH325X.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অনান্য  উল্লেখ কর.");
                txtH325X.requestFocus();
                return;
            } else if (!rdoH3311.isChecked() & !rdoH3312.isChecked() & !rdoH3313.isChecked() & secH331.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (এই খানার সদস্য নয় এমন কারো নিকট থেকে গত 1yearএ অর্থ পেয়েছেন কি).");
                rdoH3311.requestFocus();
                return;
            } else if (txtH332A.getText().toString().length() == 0 & secH332A.isShown()) {
                Connection.MessageBox(SES.this, "Required field: যদিএইঅর্থদেশের ভেতর বা বিদেশ থেকে পেয়ে থাকেন তো গত 1yearএ সর্বমোট কত TAKAপেয়েছেন উত্তরজানা না থাকলে উল্লেখ কর: 888888.");
                txtH332A.requestFocus();
                return;
            } else if (Integer.valueOf(txtH332A.getText().toString().length() == 0 ? "000000" : txtH332A.getText().toString()) < 000000 || Integer.valueOf(txtH332A.getText().toString().length() == 0 ? "999999" : txtH332A.getText().toString()) > 999999) {
                Connection.MessageBox(SES.this, "Value should be between 000000 and 999999(যদিএইঅর্থদেশের ভেতর বা বিদেশ থেকে পেয়ে থাকেন তো গত 1yearএ সর্বমোট কত TAKAপেয়েছেন উত্তরজানা না থাকলে উল্লেখ কর: 888888).");
                txtH332A.requestFocus();
                return;
            } else if (txtH332B.getText().toString().length() == 0 & secH332B.isShown()) {
                Connection.MessageBox(SES.this, "Required field: যদিএইঅর্থদেশের ভেতর বা বিদেশ থেকে পেয়ে থাকেন তো গত 1yearএ সর্বমোট কত TAKAপেয়েছেন উত্তরজানা না থাকলে উল্লেখ কর: 888888.");
                txtH332B.requestFocus();
                return;
            } else if (Integer.valueOf(txtH332B.getText().toString().length() == 0 ? "000000" : txtH332B.getText().toString()) < 000000 || Integer.valueOf(txtH332B.getText().toString().length() == 0 ? "999999" : txtH332B.getText().toString()) > 999999) {
                Connection.MessageBox(SES.this, "Value should be between 000000 and 999999(যদিএইঅর্থদেশের ভেতর বা বিদেশ থেকে পেয়ে থাকেন তো গত 1yearএ সর্বমোট কত TAKAপেয়েছেন উত্তরজানা না থাকলে উল্লেখ কর: 888888).");
                txtH332B.requestFocus();
                return;
            } else if (!rdoH3411.isChecked() & !rdoH3412.isChecked() & !rdoH3413.isChecked() & secH341.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (এই খানায় কি 5 বা 7 বছর বয়সী কোনো শিশু আছে যে গত 1yearএরভেতর স্কুল বা মাদ্রাসায় ভর্তি হয়েছে).");
                rdoH3411.requestFocus();
                return;
            } else if (txtH342.getText().toString().length() == 0 & secH342.isShown()) {
                Connection.MessageBox(SES.this, "Required field: যদি হ্যা হয় তবে কত জন.");
                txtH342.requestFocus();
                return;
            } else if (Integer.valueOf(txtH342.getText().toString().length() == 0 ? "00" : txtH342.getText().toString()) < 00 || Integer.valueOf(txtH342.getText().toString().length() == 0 ? "99" : txtH342.getText().toString()) > 99) {
                Connection.MessageBox(SES.this, "Value should be between 00 and 99(যদি হ্যা হয় তবে কত জন).");
                txtH342.requestFocus();
                return;
            } else if (!rdoH611.isChecked() & !rdoH612.isChecked() & secH61.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (আপনাদের কি কোন শৌচাগার আছে).");
                rdoH611.requestFocus();
                return;
            } else if (!rdoH621.isChecked() & !rdoH622.isChecked() & !rdoH623.isChecked() & secH62.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (আপনারা কি এটির মালিক).");
                rdoH621.requestFocus();
                return;
            } else if (spnH63.getSelectedItemPosition() == 0 & secH63.isShown()) {
                Connection.MessageBox(SES.this, "Required field: শৌচাগার কি ধরনের.");
                spnH63.requestFocus();
                return;
            } else if (spnH64A.getSelectedItemPosition() == 0 & secH64A.isShown()) {
                Connection.MessageBox(SES.this, "Required field: রান্নাঘরেরবর্জ্য.");
                spnH64A.requestFocus();
                return;
            } else if (spnH64B.getSelectedItemPosition() == 0 & secH64B.isShown()) {
                Connection.MessageBox(SES.this, "Required field: শিশুর পায়েখানা.");
                spnH64B.requestFocus();
                return;
            } else if (spnH64C.getSelectedItemPosition() == 0 & secH64C.isShown()) {
                Connection.MessageBox(SES.this, "Required field: হাস মুরগির বর্জ্য.");
                spnH64C.requestFocus();
                return;
            } else if (spnH64D.getSelectedItemPosition() == 0 & secH64D.isShown()) {
                Connection.MessageBox(SES.this, "Required field: গরু ছাগলের বর্জ্য.");
                spnH64D.requestFocus();
                return;
            } else if (spnH64E.getSelectedItemPosition() == 0 & secH64E.isShown()) {
                Connection.MessageBox(SES.this, "Required field: গৃহস্তলির বর্জ্য.");
                spnH64E.requestFocus();
                return;
            } else if (txtH64X.getText().toString().length() == 0 & secH64X.isShown()) {
                Connection.MessageBox(SES.this, "Required field:  উল্লেখ কর.");
                txtH64X.requestFocus();
                return;
            } else if (!rdoH651.isChecked() & !rdoH652.isChecked() & secH65.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (শিশুর পায়েখানা গর্তে মাটিচাপা টয়লেটে ফেলা হয়েছে কিনা স্পট চেক).");
                rdoH651.requestFocus();
                return;
            } else if (spnH66.getSelectedItemPosition() == 0 & secH66.isShown()) {
                Connection.MessageBox(SES.this, "Required field: খানার ময়লা ফেলার নির্দিষ্ট স্থান স্পট চেক.");
                spnH66.requestFocus();
                return;
            } else if (!rdoH671.isChecked() & !rdoH672.isChecked() & !rdoH673.isChecked() & !rdoH674.isChecked() & secH67.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (হাত ধোয়ার জন্য নির্দিষ্ট স্থান আছে যেখানে পানি ও সাবান  বা অন্যান্য জিনিস বা সাবানের বিকল্প আছে).");
                rdoH671.requestFocus();
                return;
            } else if (!rdoH681.isChecked() & !rdoH682.isChecked() & !rdoH683.isChecked() & secH68.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (টিপি-ট্যাপ আছে ).");
                rdoH681.requestFocus();
                return;
            } else if (!rdoH691.isChecked() & !rdoH692.isChecked() & !rdoH693.isChecked() & secH69.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (টয়লেট থেকে 30 feet এর মধ্যে হাত ধোয়ার জায়গা আছে).");
                rdoH691.requestFocus();
                return;
            } else if (!rdoH6101.isChecked() & !rdoH6102.isChecked() & !rdoH6103.isChecked() & secH610.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (টয়লেটের জায়গা থেকে 30 feet এরমধ্যে পানি সহ হাত ধোয়ার জায়গা আছে).");
                rdoH6101.requestFocus();
                return;
            } else if (!rdoH6111.isChecked() & !rdoH6112.isChecked() & !rdoH6113.isChecked() & secH611.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (টয়লেটের জায়গা থেকে 30 feet এরমধ্যে পানি ও সাবান/সাবানের বিকল্প সহ হাত ধোয়ার জায়গা আছে).");
                rdoH6111.requestFocus();
                return;
            } else if (spnH612R.getSelectedItemPosition() == 0 & secH612R.isShown()) {
                Connection.MessageBox(SES.this, "Required field: খাবার পানি বর্ষার মৌসুমে.");
                spnH612R.requestFocus();
                return;
            } else if (txtH612RX.getText().toString().length() == 0 & secH612RX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অনান্য উল্লেখ কর.");
                txtH612RX.requestFocus();
                return;
            } else if (spnH612D.getSelectedItemPosition() == 0 & secH612D.isShown()) {
                Connection.MessageBox(SES.this, "Required field: খাবার পানি  শুকনো মৌসুমে.");
                spnH612D.requestFocus();
                return;
            } else if (txtH612DX.getText().toString().length() == 0 & secH612DX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অনান্য উল্লেখ কর.");
                txtH612DX.requestFocus();
                return;
            } else if (!rdoH612a1.isChecked() & !rdoH612a2.isChecked() & !rdoH612a3.isChecked() & !rdoH612a4.isChecked() & secH612a.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (খানার কি কোনো নিজেস্য পানির উত্স্য আছে).");
                rdoH612a1.requestFocus();
                return;
            } else if (txtH612X1.getText().toString().length() == 0 & secH612X1.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অনান্য উল্লেখ কর.");
                txtH612X1.requestFocus();
                return;
            } else if (!rdoH612c1.isChecked() & !rdoH612c2.isChecked() & !rdoH612c3.isChecked() & secH612c.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (পানির কনটেইনার কি ঢেকে রাখা ).");
                rdoH612c1.requestFocus();
                return;
            } else if (spnH613R.getSelectedItemPosition() == 0 & secH613R.isShown()) {
                Connection.MessageBox(SES.this, "Required field: রান্না করার  বর্ষার মৌসুমে.");
                spnH613R.requestFocus();
                return;
            } else if (txtH613RX.getText().toString().length() == 0 & secH613RX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অনান্য.");
                txtH613RX.requestFocus();
                return;
            } else if (spnH613D.getSelectedItemPosition() == 0 & secH613D.isShown()) {
                Connection.MessageBox(SES.this, "Required field: রান্না করার পানি শুকনো মৌসুমে.");
                spnH613D.requestFocus();
                return;
            } else if (txtH613DX.getText().toString().length() == 0 & secH613DX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অনান্য.");
                txtH613DX.requestFocus();
                return;
            } else if (!rdoH613a1.isChecked() & !rdoH613a2.isChecked() & !rdoH613a3.isChecked() & secH613a.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (এই খানার কি কোনো নিজেস্য পানির উত্স্য আছে).");
                rdoH613a1.requestFocus();
                return;
            } else if (txtH613bX1.getText().toString().length() == 0 & secH613bX1.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অনান্য উল্লেখ কর.");
                txtH613bX1.requestFocus();
                return;
            } else if (spnH614R.getSelectedItemPosition() == 0 & secH614R.isShown()) {
                Connection.MessageBox(SES.this, "Required field: ধোয়া মোছার জন্য পানি বর্ষার মৌসুমে.");
                spnH614R.requestFocus();
                return;
            } else if (txtH614RX.getText().toString().length() == 0 & secH614RX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অনান্য.");
                txtH614RX.requestFocus();
                return;
            } else if (spnH614D.getSelectedItemPosition() == 0 & secH614D.isShown()) {
                Connection.MessageBox(SES.this, "Required field: ধোয়া মোছার জন্য পানি  শুকনো মৌসুমে.");
                spnH614D.requestFocus();
                return;
            } else if (txtH614DX.getText().toString().length() == 0 & secH614DX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অনান্য.");
                txtH614DX.requestFocus();
                return;
            } else if (!rdoH614a1.isChecked() & !rdoH614a2.isChecked() & !rdoH614a3.isChecked() & secH614a.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (এই খানার কি কোনো নিজেস্য পানির উত্স্য আছে).");
                rdoH614a1.requestFocus();
                return;
            } else if (txtH614bX1.getText().toString().length() == 0 & secH614bX1.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অনান্য উল্লেখ কর.");
                txtH614bX1.requestFocus();
                return;
            } else if (!rdoH614c1.isChecked() & !rdoH614c2.isChecked() & !rdoH614c3.isChecked() & secH614c.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (ধোয়া মোছার জন্য পানির কনটেইনার কি ঢেকে রাখা ).");
                rdoH614c1.requestFocus();
                return;
            } else if (spnH615R.getSelectedItemPosition() == 0 & secH615R.isShown()) {
                Connection.MessageBox(SES.this, "Required field: খাবার দেয়ার আগে হাত ধোয়ার জন্য পানি বর্ষার মৌসুমে.");
                spnH615R.requestFocus();
                return;
            } else if (txtH615RX.getText().toString().length() == 0 & secH615RX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অনান্য উল্লেখ কর.");
                txtH615RX.requestFocus();
                return;
            } else if (spnH615D.getSelectedItemPosition() == 0 & secH615D.isShown()) {
                Connection.MessageBox(SES.this, "Required field: খাবার দেয়ার আগে হাত ধোয়ার জন্য পানি  শুকনো মৌসুমে.");
                spnH615D.requestFocus();
                return;
            } else if (txtH615DX.getText().toString().length() == 0 & secH615DX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অনান্য উল্লেখ কর.");
                txtH615DX.requestFocus();
                return;
            } else if (!rdoH615a1.isChecked() & !rdoH615a2.isChecked() & !rdoH615a3.isChecked() & secH615a.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (খাবার দেয়ার আগে এই খানার কি কোনো নিজেস্য পানির উত্স্য আছে).");
                rdoH615a1.requestFocus();
                return;
            } else if (spnH615b4.getSelectedItemPosition() == 0 & secH615b4.isShown()) {
                Connection.MessageBox(SES.this, "Required field: ড্রাম.");
                spnH615b4.requestFocus();
                return;
            } else if (txtH615X1.getText().toString().length() == 0 & secH615X1.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অনান্য উল্লেখ কর.");
                txtH615X1.requestFocus();
                return;
            } else if (spnH616R.getSelectedItemPosition() == 0 & secH616R.isShown()) {
                Connection.MessageBox(SES.this, "Required field: খাবার খাওয়ার  আগে হাত ধোয়ার জন্য  বর্ষার মৌসুমে.");
                spnH616R.requestFocus();
                return;
            } else if (txtH616RX.getText().toString().length() == 0 & secH616RX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অনান্য উল্লেখ কর.");
                txtH616RX.requestFocus();
                return;
            } else if (spnH616D.getSelectedItemPosition() == 0 & secH616D.isShown()) {
                Connection.MessageBox(SES.this, "Required field: খাবার খাওয়ার  আগে হাত ধোয়ার জন্য পানি   শুকনো মৌসুমে.");
                spnH616D.requestFocus();
                return;
            } else if (txtH616DX.getText().toString().length() == 0 & secH616DX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অনান্য উল্লেখ কর.");
                txtH616DX.requestFocus();
                return;
            } else if (!rdoH616a1.isChecked() & !rdoH616a2.isChecked() & !rdoH616a3.isChecked() & secH616a.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (এই খানার কি কোনো নিজেস্য পানির উত্স্য আছে).");
                rdoH616a1.requestFocus();
                return;
            } else if (txtH616X1.getText().toString().length() == 0 & secH616X1.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অনান্য উল্লেখ কর.");
                txtH616X1.requestFocus();
                return;
            } else if (!rdoH616c1.isChecked() & !rdoH616c2.isChecked() & !rdoH616c3.isChecked() & secH616c.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (পানির কনটেইনার কি ঢেকে রাখা ).");
                rdoH616c1.requestFocus();
                return;
            } else if (txtH617.getText().toString().length() == 0 & secH617.isShown()) {
                Connection.MessageBox(SES.this, "Required field: খানা থেকে পানির উৎসের দূরত্ব কত.");
                txtH617.requestFocus();
                return;
            } else if (Integer.valueOf(txtH617.getText().toString().length() == 0 ? "000" : txtH617.getText().toString()) < 000 || Integer.valueOf(txtH617.getText().toString().length() == 0 ? "999" : txtH617.getText().toString()) > 999) {
                Connection.MessageBox(SES.this, "Value should be between 000 and 999(খানা থেকে পানির উৎসের দূরত্ব কত).");
                txtH617.requestFocus();
                return;
            } else if (!rdoH6181.isChecked() & !rdoH6182.isChecked() & secH618.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (আপনার ব্যবহৃত পানিতে গত এক বছরের মধ্যে আর্সেনিক এর জন্য টেস্ট করেছেন টিউবওয়েলের ক্ষেত্রে প্রযোজ্য).");
                rdoH6181.requestFocus();
                return;
            } else if (!rdoH6191.isChecked() & !rdoH6192.isChecked() & secH619.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (পানিকে বিশুদ্ধ করার জন্য আপনি কি কিছু করেন).");
                rdoH6191.requestFocus();
                return;
            } else if (spnH620.getSelectedItemPosition() == 0 & secH620.isShown()) {
                Connection.MessageBox(SES.this, "Required field: 1.1	পানিকে বিশুদ্ধ করার জন্য আপনি সাধারনত কি করেন.");
                spnH620.requestFocus();
                return;
            } else if (txtH620X.getText().toString().length() == 0 & secH620X.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অনান্য.");
                txtH620X.requestFocus();
                return;
            } else if (!rdoH6211.isChecked() & !rdoH6212.isChecked() & secH621.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (খানায় তৈরী  বা রান্না করা খাবার রেখে দেয় কিছুক্ষণ পর খাবার জন্য  ).");
                rdoH6211.requestFocus();
                return;
            } else if (!rdoH6221.isChecked() & !rdoH6222.isChecked() & !rdoH6223.isChecked() & secH622.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (খানায় তৈরী বা রান্না করা খাবার রেখে দেয় কিছুক্ষণ পর খাবার জন্য  ).");
                rdoH6221.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            SES_DataModel objSave = new SES_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setH311((spnH311.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH311.getSelectedItem().toString(), "-")));
            objSave.setH312(txtH312.getText().toString());
            objSave.setH313(txtH313.getText().toString());
            objSave.setH321((spnH321.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH321.getSelectedItem().toString(), "-")));
            objSave.setH321X(txtH321X.getText().toString());
            objSave.setH322((spnH322.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH322.getSelectedItem().toString(), "-")));
            objSave.setH322X(txtH322X.getText().toString());
            objSave.setH323((spnH323.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH323.getSelectedItem().toString(), "-")));
            objSave.setH323X(txtH323X.getText().toString());
            objSave.setH324((spnH324.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH324.getSelectedItem().toString(), "-")));
            objSave.setH324X(txtH324X.getText().toString());
            objSave.setH325((spnH325.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH325.getSelectedItem().toString(), "-")));
            objSave.setH325X(txtH325X.getText().toString());
            String[] d_rdogrpH331 = new String[]{"1", "0", "8"};
            objSave.setH331("");
            for (int i = 0; i < rdogrpH331.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH331.getChildAt(i);
                if (rb.isChecked()) objSave.setH331(d_rdogrpH331[i]);
            }

            objSave.setH332A(txtH332A.getText().toString());
            objSave.setH332B(txtH332B.getText().toString());
            String[] d_rdogrpH341 = new String[]{"1", "0", ""};
            objSave.setH341("");
            for (int i = 0; i < rdogrpH341.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH341.getChildAt(i);
                if (rb.isChecked()) objSave.setH341(d_rdogrpH341[i]);
            }

            objSave.setH342(txtH342.getText().toString());
            String[] d_rdogrpH61 = new String[]{"1", "0"};
            objSave.setH61("");
            for (int i = 0; i < rdogrpH61.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH61.getChildAt(i);
                if (rb.isChecked()) objSave.setH61(d_rdogrpH61[i]);
            }

            String[] d_rdogrpH62 = new String[]{"1", "0", "3"};
            objSave.setH62("");
            for (int i = 0; i < rdogrpH62.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH62.getChildAt(i);
                if (rb.isChecked()) objSave.setH62(d_rdogrpH62[i]);
            }

            objSave.setH63((spnH63.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH63.getSelectedItem().toString(), "-")));
            objSave.setH64A((spnH64A.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH64A.getSelectedItem().toString(), "-")));
            objSave.setH64B((spnH64B.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH64B.getSelectedItem().toString(), "-")));
            objSave.setH64C((spnH64C.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH64C.getSelectedItem().toString(), "-")));
            objSave.setH64D((spnH64D.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH64D.getSelectedItem().toString(), "-")));
            objSave.setH64E((spnH64E.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH64E.getSelectedItem().toString(), "-")));
            objSave.setH64X(txtH64X.getText().toString());
            String[] d_rdogrpH65 = new String[]{"1", "0"};
            objSave.setH65("");
            for (int i = 0; i < rdogrpH65.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH65.getChildAt(i);
                if (rb.isChecked()) objSave.setH65(d_rdogrpH65[i]);
            }

            objSave.setH66((spnH66.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH66.getSelectedItem().toString(), "-")));
            String[] d_rdogrpH67 = new String[]{"1", "0", "9", ""};
            objSave.setH67("");
            for (int i = 0; i < rdogrpH67.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH67.getChildAt(i);
                if (rb.isChecked()) objSave.setH67(d_rdogrpH67[i]);
            }

            String[] d_rdogrpH68 = new String[]{"1", "0", "9"};
            objSave.setH68("");
            for (int i = 0; i < rdogrpH68.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH68.getChildAt(i);
                if (rb.isChecked()) objSave.setH68(d_rdogrpH68[i]);
            }

            String[] d_rdogrpH69 = new String[]{"1", "0", "9"};
            objSave.setH69("");
            for (int i = 0; i < rdogrpH69.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH69.getChildAt(i);
                if (rb.isChecked()) objSave.setH69(d_rdogrpH69[i]);
            }

            String[] d_rdogrpH610 = new String[]{"1", "0", "9"};
            objSave.setH610("");
            for (int i = 0; i < rdogrpH610.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH610.getChildAt(i);
                if (rb.isChecked()) objSave.setH610(d_rdogrpH610[i]);
            }

            String[] d_rdogrpH611 = new String[]{"1", "0", "9"};
            objSave.setH611("");
            for (int i = 0; i < rdogrpH611.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH611.getChildAt(i);
                if (rb.isChecked()) objSave.setH611(d_rdogrpH611[i]);
            }

            objSave.setH612R((spnH612R.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH612R.getSelectedItem().toString(), "-")));
            objSave.setH612RX(txtH612RX.getText().toString());
            objSave.setH612D((spnH612D.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH612D.getSelectedItem().toString(), "-")));
            objSave.setH612DX(txtH612DX.getText().toString());
            String[] d_rdogrpH612a = new String[]{"1", "0", "3", ""};
            objSave.setH612a("");
            for (int i = 0; i < rdogrpH612a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH612a.getChildAt(i);
                if (rb.isChecked()) objSave.setH612a(d_rdogrpH612a[i]);
            }

            objSave.setH612b1((chkH612b1.isChecked() ? "1" : "2"));
            objSave.setH612b2((chkH612b2.isChecked() ? "1" : "2"));
            objSave.setH612b3((chkH612b3.isChecked() ? "1" : "2"));
            objSave.setH612b4((chkH612b4.isChecked() ? "1" : "2"));
            objSave.setH612bX((chkH612bX.isChecked() ? "1" : "2"));
            objSave.setH612X1(txtH612X1.getText().toString());
            objSave.setH612b5((chkH612b5.isChecked() ? "1" : "2"));
            String[] d_rdogrpH612c = new String[]{"1", "0", "9"};
            objSave.setH612c("");
            for (int i = 0; i < rdogrpH612c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH612c.getChildAt(i);
                if (rb.isChecked()) objSave.setH612c(d_rdogrpH612c[i]);
            }

            objSave.setH613R((spnH613R.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH613R.getSelectedItem().toString(), "-")));
            objSave.setH613RX(txtH613RX.getText().toString());
            objSave.setH613D((spnH613D.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH613D.getSelectedItem().toString(), "-")));
            objSave.setH613DX(txtH613DX.getText().toString());
            String[] d_rdogrpH613a = new String[]{"1", "0", "3"};
            objSave.setH613a("");
            for (int i = 0; i < rdogrpH613a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH613a.getChildAt(i);
                if (rb.isChecked()) objSave.setH613a(d_rdogrpH613a[i]);
            }

            objSave.setH613b1((chkH613b1.isChecked() ? "1" : "2"));
            objSave.setH613b2((chkH613b2.isChecked() ? "1" : "2"));
            objSave.setH613b3((chkH613b3.isChecked() ? "1" : "2"));
            objSave.setH613b4((chkH613b4.isChecked() ? "1" : "2"));
            objSave.setH613bX((chkH613bX.isChecked() ? "1" : "2"));
            objSave.setH613bX1(txtH613bX1.getText().toString());
            objSave.setH613b5((chkH613b5.isChecked() ? "1" : "2"));
            objSave.setH614R((spnH614R.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH614R.getSelectedItem().toString(), "-")));
            objSave.setH614RX(txtH614RX.getText().toString());
            objSave.setH614D((spnH614D.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH614D.getSelectedItem().toString(), "-")));
            objSave.setH614DX(txtH614DX.getText().toString());
            String[] d_rdogrpH614a = new String[]{"1", "0", "3"};
            objSave.setH614a("");
            for (int i = 0; i < rdogrpH614a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH614a.getChildAt(i);
                if (rb.isChecked()) objSave.setH614a(d_rdogrpH614a[i]);
            }

            objSave.setH614b1((chkH614b1.isChecked() ? "1" : "2"));
            objSave.setH614b2((chkH614b2.isChecked() ? "1" : "2"));
            objSave.setH614b3((chkH614b3.isChecked() ? "1" : "2"));
            objSave.setH614b4((chkH614b4.isChecked() ? "1" : "2"));
            objSave.setH614bX((chkH614bX.isChecked() ? "1" : "2"));
            objSave.setH614bX1(txtH614bX1.getText().toString());
            objSave.setH614b5((chkH614b5.isChecked() ? "1" : "2"));
            String[] d_rdogrpH614c = new String[]{"1", "0", "9"};
            objSave.setH614c("");
            for (int i = 0; i < rdogrpH614c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH614c.getChildAt(i);
                if (rb.isChecked()) objSave.setH614c(d_rdogrpH614c[i]);
            }

            objSave.setH615R((spnH615R.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH615R.getSelectedItem().toString(), "-")));
            objSave.setH615RX(txtH615RX.getText().toString());
            objSave.setH615D((spnH615D.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH615D.getSelectedItem().toString(), "-")));
            objSave.setH615DX(txtH615DX.getText().toString());
            String[] d_rdogrpH615a = new String[]{"1", "0", "3"};
            objSave.setH615a("");
            for (int i = 0; i < rdogrpH615a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH615a.getChildAt(i);
                if (rb.isChecked()) objSave.setH615a(d_rdogrpH615a[i]);
            }

            objSave.setH615b1((chkH615b1.isChecked() ? "1" : "2"));
            objSave.setH615b2((chkH615b2.isChecked() ? "1" : "2"));
            objSave.setH615b3((chkH615b3.isChecked() ? "1" : "2"));
            objSave.setH615b4((spnH615b4.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH615b4.getSelectedItem().toString(), "-")));
            objSave.setH615bX((chkH615bX.isChecked() ? "1" : "2"));
            objSave.setH615X1(txtH615X1.getText().toString());
            objSave.setH615b5((chkH615b5.isChecked() ? "1" : "2"));
            objSave.setH616R((spnH616R.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH616R.getSelectedItem().toString(), "-")));
            objSave.setH616RX(txtH616RX.getText().toString());
            objSave.setH616D((spnH616D.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH616D.getSelectedItem().toString(), "-")));
            objSave.setH616DX(txtH616DX.getText().toString());
            String[] d_rdogrpH616a = new String[]{"1", "2", "3"};
            objSave.setH616a("");
            for (int i = 0; i < rdogrpH616a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH616a.getChildAt(i);
                if (rb.isChecked()) objSave.setH616a(d_rdogrpH616a[i]);
            }

            objSave.setH616b1((chkH616b1.isChecked() ? "1" : "2"));
            objSave.setH616b2((chkH616b2.isChecked() ? "1" : "2"));
            objSave.setH616b3((chkH616b3.isChecked() ? "1" : "2"));
            objSave.setH616b4((chkH616b4.isChecked() ? "1" : "2"));
            objSave.setH616bX((chkH616bX.isChecked() ? "1" : "2"));
            objSave.setH616X1(txtH616X1.getText().toString());
            objSave.setH616b5((chkH616b5.isChecked() ? "1" : "2"));
            String[] d_rdogrpH616c = new String[]{"1", "0", "9"};
            objSave.setH616c("");
            for (int i = 0; i < rdogrpH616c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH616c.getChildAt(i);
                if (rb.isChecked()) objSave.setH616c(d_rdogrpH616c[i]);
            }

            objSave.setH617(txtH617.getText().toString());
            String[] d_rdogrpH618 = new String[]{"1", "0"};
            objSave.setH618("");
            for (int i = 0; i < rdogrpH618.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH618.getChildAt(i);
                if (rb.isChecked()) objSave.setH618(d_rdogrpH618[i]);
            }

            String[] d_rdogrpH619 = new String[]{"1", "0"};
            objSave.setH619("");
            for (int i = 0; i < rdogrpH619.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH619.getChildAt(i);
                if (rb.isChecked()) objSave.setH619(d_rdogrpH619[i]);
            }

            objSave.setH620((spnH620.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH620.getSelectedItem().toString(), "-")));
            objSave.setH620X(txtH620X.getText().toString());
            String[] d_rdogrpH621 = new String[]{"1", "0"};
            objSave.setH621("");
            for (int i = 0; i < rdogrpH621.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH621.getChildAt(i);
                if (rb.isChecked()) objSave.setH621(d_rdogrpH621[i]);
            }

            String[] d_rdogrpH622 = new String[]{"1", "0", "9"};
            objSave.setH622("");
            for (int i = 0; i < rdogrpH622.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH622.getChildAt(i);
                if (rb.isChecked()) objSave.setH622(d_rdogrpH622[i]);
            }

            objSave.setStartTime(StartTime);
            objSave.setEndTime(g.CurrentTime24());
            objSave.setUserId(g.getUserId());
            objSave.setEntryUser(g.getUserId()); //from data entry user list
            //objSave.setLat(Double.toString(currentLatitude));
            //objSave.setLon(Double.toString(currentLongitude));

            String status = objSave.SaveUpdateData(this);
            if (status.length() == 0) {
                Connection.MessageBox(SES.this, "Saved Successfully");
            } else {
                Connection.MessageBox(SES.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(SES.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            SES_DataModel d = new SES_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<SES_DataModel> data = d.SelectAll(this, SQL);
            for (SES_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                spnH311.setSelection(Global.SpinnerItemPositionAnyLength(spnH311, item.getH311()));
                txtH312.setText(item.getH312());
                txtH313.setText(item.getH313());
                spnH321.setSelection(Global.SpinnerItemPositionAnyLength(spnH321, item.getH321()));
                txtH321X.setText(item.getH321X());
                spnH322.setSelection(Global.SpinnerItemPositionAnyLength(spnH322, item.getH322()));
                txtH322X.setText(item.getH322X());
                spnH323.setSelection(Global.SpinnerItemPositionAnyLength(spnH323, item.getH323()));
                txtH323X.setText(item.getH323X());
                spnH324.setSelection(Global.SpinnerItemPositionAnyLength(spnH324, item.getH324()));
                txtH324X.setText(item.getH324X());
                spnH325.setSelection(Global.SpinnerItemPositionAnyLength(spnH325, item.getH325()));
                txtH325X.setText(item.getH325X());
                String[] d_rdogrpH331 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpH331.length; i++) {
                    if (item.getH331().equals(String.valueOf(d_rdogrpH331[i]))) {
                        rb = (RadioButton) rdogrpH331.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH332A.setText(item.getH332A());
                txtH332B.setText(item.getH332B());
                String[] d_rdogrpH341 = new String[]{"1", "0", ""};
                for (int i = 0; i < d_rdogrpH341.length; i++) {
                    if (item.getH341().equals(String.valueOf(d_rdogrpH341[i]))) {
                        rb = (RadioButton) rdogrpH341.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH342.setText(item.getH342());
                String[] d_rdogrpH61 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH61.length; i++) {
                    if (item.getH61().equals(String.valueOf(d_rdogrpH61[i]))) {
                        rb = (RadioButton) rdogrpH61.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH62 = new String[]{"1", "0", "3"};
                for (int i = 0; i < d_rdogrpH62.length; i++) {
                    if (item.getH62().equals(String.valueOf(d_rdogrpH62[i]))) {
                        rb = (RadioButton) rdogrpH62.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH63.setSelection(Global.SpinnerItemPositionAnyLength(spnH63, item.getH63()));
                spnH64A.setSelection(Global.SpinnerItemPositionAnyLength(spnH64A, item.getH64A()));
                spnH64B.setSelection(Global.SpinnerItemPositionAnyLength(spnH64B, item.getH64B()));
                spnH64C.setSelection(Global.SpinnerItemPositionAnyLength(spnH64C, item.getH64C()));
                spnH64D.setSelection(Global.SpinnerItemPositionAnyLength(spnH64D, item.getH64D()));
                spnH64E.setSelection(Global.SpinnerItemPositionAnyLength(spnH64E, item.getH64E()));
                txtH64X.setText(item.getH64X());
                String[] d_rdogrpH65 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH65.length; i++) {
                    if (item.getH65().equals(String.valueOf(d_rdogrpH65[i]))) {
                        rb = (RadioButton) rdogrpH65.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH66.setSelection(Global.SpinnerItemPositionAnyLength(spnH66, item.getH66()));
                String[] d_rdogrpH67 = new String[]{"1", "0", "9", ""};
                for (int i = 0; i < d_rdogrpH67.length; i++) {
                    if (item.getH67().equals(String.valueOf(d_rdogrpH67[i]))) {
                        rb = (RadioButton) rdogrpH67.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH68 = new String[]{"1", "0", "9"};
                for (int i = 0; i < d_rdogrpH68.length; i++) {
                    if (item.getH68().equals(String.valueOf(d_rdogrpH68[i]))) {
                        rb = (RadioButton) rdogrpH68.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH69 = new String[]{"1", "0", "9"};
                for (int i = 0; i < d_rdogrpH69.length; i++) {
                    if (item.getH69().equals(String.valueOf(d_rdogrpH69[i]))) {
                        rb = (RadioButton) rdogrpH69.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH610 = new String[]{"1", "0", "9"};
                for (int i = 0; i < d_rdogrpH610.length; i++) {
                    if (item.getH610().equals(String.valueOf(d_rdogrpH610[i]))) {
                        rb = (RadioButton) rdogrpH610.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH611 = new String[]{"1", "0", "9"};
                for (int i = 0; i < d_rdogrpH611.length; i++) {
                    if (item.getH611().equals(String.valueOf(d_rdogrpH611[i]))) {
                        rb = (RadioButton) rdogrpH611.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH612R.setSelection(Global.SpinnerItemPositionAnyLength(spnH612R, item.getH612R()));
                txtH612RX.setText(item.getH612RX());
                spnH612D.setSelection(Global.SpinnerItemPositionAnyLength(spnH612D, item.getH612D()));
                txtH612DX.setText(item.getH612DX());
                String[] d_rdogrpH612a = new String[]{"1", "0", "3", ""};
                for (int i = 0; i < d_rdogrpH612a.length; i++) {
                    if (item.getH612a().equals(String.valueOf(d_rdogrpH612a[i]))) {
                        rb = (RadioButton) rdogrpH612a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH612b1().equals("1")) {
                    chkH612b1.setChecked(true);
                } else if (item.getH612b1().equals("2")) {
                    chkH612b1.setChecked(false);
                }
                if (item.getH612b2().equals("1")) {
                    chkH612b2.setChecked(true);
                } else if (item.getH612b2().equals("2")) {
                    chkH612b2.setChecked(false);
                }
                if (item.getH612b3().equals("1")) {
                    chkH612b3.setChecked(true);
                } else if (item.getH612b3().equals("2")) {
                    chkH612b3.setChecked(false);
                }
                if (item.getH612b4().equals("1")) {
                    chkH612b4.setChecked(true);
                } else if (item.getH612b4().equals("2")) {
                    chkH612b4.setChecked(false);
                }
                if (item.getH612bX().equals("1")) {
                    chkH612bX.setChecked(true);
                } else if (item.getH612bX().equals("2")) {
                    chkH612bX.setChecked(false);
                }
                txtH612X1.setText(item.getH612X1());
                if (item.getH612b5().equals("1")) {
                    chkH612b5.setChecked(true);
                } else if (item.getH612b5().equals("2")) {
                    chkH612b5.setChecked(false);
                }
                String[] d_rdogrpH612c = new String[]{"1", "0", "9"};
                for (int i = 0; i < d_rdogrpH612c.length; i++) {
                    if (item.getH612c().equals(String.valueOf(d_rdogrpH612c[i]))) {
                        rb = (RadioButton) rdogrpH612c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH613R.setSelection(Global.SpinnerItemPositionAnyLength(spnH613R, item.getH613R()));
                txtH613RX.setText(item.getH613RX());
                spnH613D.setSelection(Global.SpinnerItemPositionAnyLength(spnH613D, item.getH613D()));
                txtH613DX.setText(item.getH613DX());
                String[] d_rdogrpH613a = new String[]{"1", "0", "3"};
                for (int i = 0; i < d_rdogrpH613a.length; i++) {
                    if (item.getH613a().equals(String.valueOf(d_rdogrpH613a[i]))) {
                        rb = (RadioButton) rdogrpH613a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH613b1().equals("1")) {
                    chkH613b1.setChecked(true);
                } else if (item.getH613b1().equals("2")) {
                    chkH613b1.setChecked(false);
                }
                if (item.getH613b2().equals("1")) {
                    chkH613b2.setChecked(true);
                } else if (item.getH613b2().equals("2")) {
                    chkH613b2.setChecked(false);
                }
                if (item.getH613b3().equals("1")) {
                    chkH613b3.setChecked(true);
                } else if (item.getH613b3().equals("2")) {
                    chkH613b3.setChecked(false);
                }
                if (item.getH613b4().equals("1")) {
                    chkH613b4.setChecked(true);
                } else if (item.getH613b4().equals("2")) {
                    chkH613b4.setChecked(false);
                }
                if (item.getH613bX().equals("1")) {
                    chkH613bX.setChecked(true);
                } else if (item.getH613bX().equals("2")) {
                    chkH613bX.setChecked(false);
                }
                txtH613bX1.setText(item.getH613bX1());
                if (item.getH613b5().equals("1")) {
                    chkH613b5.setChecked(true);
                } else if (item.getH613b5().equals("2")) {
                    chkH613b5.setChecked(false);
                }
                spnH614R.setSelection(Global.SpinnerItemPositionAnyLength(spnH614R, item.getH614R()));
                txtH614RX.setText(item.getH614RX());
                spnH614D.setSelection(Global.SpinnerItemPositionAnyLength(spnH614D, item.getH614D()));
                txtH614DX.setText(item.getH614DX());
                String[] d_rdogrpH614a = new String[]{"1", "0", "3"};
                for (int i = 0; i < d_rdogrpH614a.length; i++) {
                    if (item.getH614a().equals(String.valueOf(d_rdogrpH614a[i]))) {
                        rb = (RadioButton) rdogrpH614a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH614b1().equals("1")) {
                    chkH614b1.setChecked(true);
                } else if (item.getH614b1().equals("2")) {
                    chkH614b1.setChecked(false);
                }
                if (item.getH614b2().equals("1")) {
                    chkH614b2.setChecked(true);
                } else if (item.getH614b2().equals("2")) {
                    chkH614b2.setChecked(false);
                }
                if (item.getH614b3().equals("1")) {
                    chkH614b3.setChecked(true);
                } else if (item.getH614b3().equals("2")) {
                    chkH614b3.setChecked(false);
                }
                if (item.getH614b4().equals("1")) {
                    chkH614b4.setChecked(true);
                } else if (item.getH614b4().equals("2")) {
                    chkH614b4.setChecked(false);
                }
                if (item.getH614bX().equals("1")) {
                    chkH614bX.setChecked(true);
                } else if (item.getH614bX().equals("2")) {
                    chkH614bX.setChecked(false);
                }
                txtH614bX1.setText(item.getH614bX1());
                if (item.getH614b5().equals("1")) {
                    chkH614b5.setChecked(true);
                } else if (item.getH614b5().equals("2")) {
                    chkH614b5.setChecked(false);
                }
                String[] d_rdogrpH614c = new String[]{"1", "0", "9"};
                for (int i = 0; i < d_rdogrpH614c.length; i++) {
                    if (item.getH614c().equals(String.valueOf(d_rdogrpH614c[i]))) {
                        rb = (RadioButton) rdogrpH614c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH615R.setSelection(Global.SpinnerItemPositionAnyLength(spnH615R, item.getH615R()));
                txtH615RX.setText(item.getH615RX());
                spnH615D.setSelection(Global.SpinnerItemPositionAnyLength(spnH615D, item.getH615D()));
                txtH615DX.setText(item.getH615DX());
                String[] d_rdogrpH615a = new String[]{"1", "0", "3"};
                for (int i = 0; i < d_rdogrpH615a.length; i++) {
                    if (item.getH615a().equals(String.valueOf(d_rdogrpH615a[i]))) {
                        rb = (RadioButton) rdogrpH615a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH615b1().equals("1")) {
                    chkH615b1.setChecked(true);
                } else if (item.getH615b1().equals("2")) {
                    chkH615b1.setChecked(false);
                }
                if (item.getH615b2().equals("1")) {
                    chkH615b2.setChecked(true);
                } else if (item.getH615b2().equals("2")) {
                    chkH615b2.setChecked(false);
                }
                if (item.getH615b3().equals("1")) {
                    chkH615b3.setChecked(true);
                } else if (item.getH615b3().equals("2")) {
                    chkH615b3.setChecked(false);
                }
                spnH615b4.setSelection(Global.SpinnerItemPositionAnyLength(spnH615b4, item.getH615b4()));
                if (item.getH615bX().equals("1")) {
                    chkH615bX.setChecked(true);
                } else if (item.getH615bX().equals("2")) {
                    chkH615bX.setChecked(false);
                }
                txtH615X1.setText(item.getH615X1());
                if (item.getH615b5().equals("1")) {
                    chkH615b5.setChecked(true);
                } else if (item.getH615b5().equals("2")) {
                    chkH615b5.setChecked(false);
                }
                spnH616R.setSelection(Global.SpinnerItemPositionAnyLength(spnH616R, item.getH616R()));
                txtH616RX.setText(item.getH616RX());
                spnH616D.setSelection(Global.SpinnerItemPositionAnyLength(spnH616D, item.getH616D()));
                txtH616DX.setText(item.getH616DX());
                String[] d_rdogrpH616a = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH616a.length; i++) {
                    if (item.getH616a().equals(String.valueOf(d_rdogrpH616a[i]))) {
                        rb = (RadioButton) rdogrpH616a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH616b1().equals("1")) {
                    chkH616b1.setChecked(true);
                } else if (item.getH616b1().equals("2")) {
                    chkH616b1.setChecked(false);
                }
                if (item.getH616b2().equals("1")) {
                    chkH616b2.setChecked(true);
                } else if (item.getH616b2().equals("2")) {
                    chkH616b2.setChecked(false);
                }
                if (item.getH616b3().equals("1")) {
                    chkH616b3.setChecked(true);
                } else if (item.getH616b3().equals("2")) {
                    chkH616b3.setChecked(false);
                }
                if (item.getH616b4().equals("1")) {
                    chkH616b4.setChecked(true);
                } else if (item.getH616b4().equals("2")) {
                    chkH616b4.setChecked(false);
                }
                if (item.getH616bX().equals("1")) {
                    chkH616bX.setChecked(true);
                } else if (item.getH616bX().equals("2")) {
                    chkH616bX.setChecked(false);
                }
                txtH616X1.setText(item.getH616X1());
                if (item.getH616b5().equals("1")) {
                    chkH616b5.setChecked(true);
                } else if (item.getH616b5().equals("2")) {
                    chkH616b5.setChecked(false);
                }
                String[] d_rdogrpH616c = new String[]{"1", "0", "9"};
                for (int i = 0; i < d_rdogrpH616c.length; i++) {
                    if (item.getH616c().equals(String.valueOf(d_rdogrpH616c[i]))) {
                        rb = (RadioButton) rdogrpH616c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH617.setText(item.getH617());
                String[] d_rdogrpH618 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH618.length; i++) {
                    if (item.getH618().equals(String.valueOf(d_rdogrpH618[i]))) {
                        rb = (RadioButton) rdogrpH618.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH619 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH619.length; i++) {
                    if (item.getH619().equals(String.valueOf(d_rdogrpH619[i]))) {
                        rb = (RadioButton) rdogrpH619.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH620.setSelection(Global.SpinnerItemPositionAnyLength(spnH620, item.getH620()));
                txtH620X.setText(item.getH620X());
                String[] d_rdogrpH621 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH621.length; i++) {
                    if (item.getH621().equals(String.valueOf(d_rdogrpH621[i]))) {
                        rb = (RadioButton) rdogrpH621.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH622 = new String[]{"1", "0", "9"};
                for (int i = 0; i < d_rdogrpH622.length; i++) {
                    if (item.getH622().equals(String.valueOf(d_rdogrpH622[i]))) {
                        rb = (RadioButton) rdogrpH622.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
            }
        } catch (Exception e) {
            Connection.MessageBox(SES.this, e.getMessage());
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