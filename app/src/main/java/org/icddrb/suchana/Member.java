package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Member" android:label="Member" />

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

public class Member extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    static String H21 = "";
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
    LinearLayout secH21;
    TextView VlblH21;
    EditText txtH21;
    LinearLayout secH22;
    TextView VlblH22;
    EditText txtH22;
    LinearLayout secH23;
    TextView VlblH23;
    RadioGroup rdogrpH23;
    RadioButton rdoH231;
    RadioButton rdoH232;
    LinearLayout seclblH24;
    LinearLayout secH24Y;
    TextView VlblH24Y;
    EditText txtH24Y;
    LinearLayout secH24M;
    TextView VlblH24M;
    EditText txtH24M;
    LinearLayout secH25;
    TextView VlblH25;
    Spinner spnH25;
    LinearLayout secH26;
    TextView VlblH26;
    Spinner spnH26;
    LinearLayout secH27;
    TextView VlblH27;
    EditText txtH27;
    LinearLayout secH28;
    TextView VlblH28;
    Spinner spnH28;
    LinearLayout secH28X;
    TextView VlblH28X;
    EditText txtH28X;
    LinearLayout secH29;
    TextView VlblH29;
    RadioGroup rdogrpH29;
    RadioButton rdoH291;
    RadioButton rdoH292;
    LinearLayout secH210;
    TextView VlblH210;
    EditText txtH210;
    LinearLayout secH220;
    TextView VlblH220;
    EditText txtH220;
    LinearLayout secH221;
    TextView VlblH221;
    EditText txtH221;
    LinearLayout secH211;
    TextView VlblH211;
    Spinner spnH211;
    LinearLayout secH212;
    TextView VlblH212;
    Spinner spnH212;
    LinearLayout secH212X;
    TextView VlblH212X;
    EditText txtH212X;
    LinearLayout secH213;
    TextView VlblH213;
    Spinner spnH213;
    LinearLayout secH214;
    TextView VlblH214;
    RadioGroup rdogrpH214;
    RadioButton rdoH2141;
    RadioButton rdoH2142;
    LinearLayout secH215;
    TextView VlblH215;
    Spinner spnH215;
    LinearLayout secH215X;
    TextView VlblH215X;
    EditText txtH215X;
    LinearLayout secH216;
    TextView VlblH216;
    Spinner spnH216;
    LinearLayout secH216X;
    TextView VlblH216X;
    EditText txtH216X;
    LinearLayout secH217;
    TextView VlblH217;
    EditText txtH217;
    LinearLayout secH218;
    TextView VlblH218;
    EditText txtH218;
    LinearLayout secH219;
    TextView VlblH219;
    EditText txtH219;
    LinearLayout secH222;
    TextView VlblH222;
    EditText txtH222;
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
            setContentView(R.layout.member);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");
            H21 = IDbundle.getString("H21");

            TableName = "Member";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Member.this);
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
            secH21 = (LinearLayout) findViewById(R.id.secH21);
            VlblH21 = (TextView) findViewById(R.id.VlblH21);
            txtH21 = (EditText) findViewById(R.id.txtH21);
            secH22 = (LinearLayout) findViewById(R.id.secH22);
            VlblH22 = (TextView) findViewById(R.id.VlblH22);
            txtH22 = (EditText) findViewById(R.id.txtH22);
            secH23 = (LinearLayout) findViewById(R.id.secH23);
            VlblH23 = (TextView) findViewById(R.id.VlblH23);
            rdogrpH23 = (RadioGroup) findViewById(R.id.rdogrpH23);

            rdoH231 = (RadioButton) findViewById(R.id.rdoH231);
            rdoH232 = (RadioButton) findViewById(R.id.rdoH232);
            seclblH24 = (LinearLayout) findViewById(R.id.seclblH24);
            secH24Y = (LinearLayout) findViewById(R.id.secH24Y);
            VlblH24Y = (TextView) findViewById(R.id.VlblH24Y);
            txtH24Y = (EditText) findViewById(R.id.txtH24Y);
            secH24M = (LinearLayout) findViewById(R.id.secH24M);
            VlblH24M = (TextView) findViewById(R.id.VlblH24M);
            txtH24M = (EditText) findViewById(R.id.txtH24M);
            secH25 = (LinearLayout) findViewById(R.id.secH25);
            VlblH25 = (TextView) findViewById(R.id.VlblH25);
            spnH25 = (Spinner) findViewById(R.id.spnH25);
            List<String> listH25 = new ArrayList<String>();

            listH25.add("");
            listH25.add("1-খানা প্রধানের মা");
            listH25.add("2-খানা প্রধানের স্বামী অথবা স্ত্রী");
            listH25.add("3-পুত্র অথবা  কন্যা");
            listH25.add("4-পুত্রবধূ অথবা  জামাতা");
            listH25.add("5-নাতি অথবা  নাতনী");
            listH25.add("6-খানা প্রধানের বাবা");
            listH25.add("7-ভাই অথবা  বোন");
            listH25.add("8-ভাতিজি অথবা ভাতিজা অথবা ভাগ্নী অথবা ভাগিনা");
            listH25.add("9-খানা প্রধানের cousin");
            listH25.add("10-খানা প্রধান (নিজে)");
            listH25.add("11-শ্বশুর অথবা শাশুড়ী");
            listH25.add("12-দুলাভাই অথবা শালা অথবা শালী অথবা ননদ অথবা জা");
            listH25.add("13-স্বামীর ভাতিজি অথবা ভাতিজা অথবা ভাগ্নী অথবা ভাগিনা");
            listH25.add("14-স্বামীর cousin");
            listH25.add("15-অন্যান্য আত্মীয়");
            listH25.add("16-স্থায়ী গৃহকর্মী");
            listH25.add("17-অন্যান্য অনাত্মীয় অথবা বন্ধু");
            ArrayAdapter<String> adptrH25 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH25);
            spnH25.setAdapter(adptrH25);

            secH26 = (LinearLayout) findViewById(R.id.secH26);
            VlblH26 = (TextView) findViewById(R.id.VlblH26);
            spnH26 = (Spinner) findViewById(R.id.spnH26);
            List<String> listH26 = new ArrayList<String>();

            listH26.add("");
            listH26.add("1-অবিবাহিত চিরকুমার অথবা চিরকুমারী");
            listH26.add("2-বিবাহিত");
            listH26.add("3-বিধবা অথবা বিপত্নীক");
            listH26.add("4-তালাকপ্রাপ্ত");
            listH26.add("5-পৃথক থাকে অথবা পরিত্যক্তা");
            ArrayAdapter<String> adptrH26 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH26);
            spnH26.setAdapter(adptrH26);

            secH27 = (LinearLayout) findViewById(R.id.secH27);
            VlblH27 = (TextView) findViewById(R.id.VlblH27);
            txtH27 = (EditText) findViewById(R.id.txtH27);
            secH28 = (LinearLayout) findViewById(R.id.secH28);
            VlblH28 = (TextView) findViewById(R.id.VlblH28);
            spnH28 = (Spinner) findViewById(R.id.spnH28);
            secH28X = (LinearLayout) findViewById(R.id.secH28X);
            VlblH28X = (TextView) findViewById(R.id.VlblH28X);
            txtH28X = (EditText) findViewById(R.id.txtH28X);
            secH28X.setVisibility(View.GONE);
            List<String> listH28 = new ArrayList<String>();

            listH28.add("");
            listH28.add("1-মুসলিম ");
            listH28.add("2-হিন্দু");
            listH28.add("3-খ্রীষ্ট");
            listH28.add("4-বুদ্ধ");
            listH28.add("5-অন্যান্য (উল্লেখ কর)");
            ArrayAdapter<String> adptrH28 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH28);
            spnH28.setAdapter(adptrH28);
            spnH28.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 5) {
                        secH28X.setVisibility(View.VISIBLE);
                    } else {
                        txtH28X.setText("");
                        secH28X.setVisibility(View.GONE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            secH28X.setVisibility(View.GONE);
            secH29 = (LinearLayout) findViewById(R.id.secH29);
            VlblH29 = (TextView) findViewById(R.id.VlblH29);
            rdogrpH29 = (RadioGroup) findViewById(R.id.rdogrpH29);

            rdoH291 = (RadioButton) findViewById(R.id.rdoH291);
            rdoH292 = (RadioButton) findViewById(R.id.rdoH292);
            secH210 = (LinearLayout) findViewById(R.id.secH210);
            VlblH210 = (TextView) findViewById(R.id.VlblH210);
            txtH210 = (EditText) findViewById(R.id.txtH210);
            secH220 = (LinearLayout) findViewById(R.id.secH220);
            VlblH220 = (TextView) findViewById(R.id.VlblH220);
            txtH220 = (EditText) findViewById(R.id.txtH220);
            secH221 = (LinearLayout) findViewById(R.id.secH221);
            VlblH221 = (TextView) findViewById(R.id.VlblH221);
            txtH221 = (EditText) findViewById(R.id.txtH221);
            secH211 = (LinearLayout) findViewById(R.id.secH211);
            VlblH211 = (TextView) findViewById(R.id.VlblH211);
            spnH211 = (Spinner) findViewById(R.id.spnH211);
            List<String> listH211 = new ArrayList<String>();

            listH211.add("");
            listH211.add("1-পড়তে ও লিখতে পারেনা");
            listH211.add("2-শুধুমাত্র সই করতে পারে");
            listH211.add("3-শুধুমাত্র পড়তে পারে");
            listH211.add("4-পড়তে ও লিখতে পারে");
            ArrayAdapter<String> adptrH211 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH211);
            spnH211.setAdapter(adptrH211);

            secH212 = (LinearLayout) findViewById(R.id.secH212);
            VlblH212 = (TextView) findViewById(R.id.VlblH212);
            spnH212 = (Spinner) findViewById(R.id.spnH212);
            List<String> listH212 = new ArrayList<String>();

            listH212.add("");
            listH212.add("86-কখনও স্কুলে পড়াশোনা করে নাই");
            listH212.add("0-প্রথম শ্রেণীতে পড়াশোনা করে");
            listH212.add("1-প্রথম শ্রেণী সম্পন্ন করেছে");
            listH212.add("2-দ্বিতীয় শ্রেণী সম্পন্ন করেছে");
            listH212.add("3-তৃতীয় শ্রেণী সম্পন্ন");
            listH212.add("4-চতুর্থ  শ্রেণী সম্পন্ন");
            listH212.add("5-শ্রেণী সম্পন্ন");
            listH212.add("6-শ্রেণী সম্পন্ন");
            listH212.add("7-শ্রেণী সম্পন্ন");
            listH212.add("8-শ্রেণী সম্পন্ন");
            listH212.add("9-শ্রেণী সম্পন্ন");
            listH212.add("10-মাধ্যমিক শিক্ষা সমাপ্ত করেছে");
            listH212.add("12-উচ্চ মাধ্যমিক শিক্ষা সমাপ্ত করেছে");
            listH212.add("22-SSC পরীক্ষার প্রার্থী");
            listH212.add("33-HSC পরীক্ষার প্রার্থী");
            listH212.add("44-স্নাতক অথবা আরো ঊর্ধ শিক্ষা সমাপ্ত  করেছে");
            listH212.add("55-প্রাক-প্রাথমিক বিদ্যালয় (সাধারণ)");
            listH212.add("66-প্রাক-প্রাথমিক বিদ্যালয় (মসজিদ ভিত্তিক)");
            listH212.add("77-অন্যান্য");
            ArrayAdapter<String> adptrH212 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH212);
            spnH212.setAdapter(adptrH212);
            secH212X = (LinearLayout) findViewById(R.id.secH212X);
            VlblH212X = (TextView) findViewById(R.id.VlblH212X);
            txtH212X = (EditText) findViewById(R.id.txtH212X);
            spnH212.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 20) {
                        secH212X.setVisibility(View.VISIBLE);
                    } else {
                        txtH212X.setText("");
                        secH212X.setVisibility(View.GONE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            secH212X.setVisibility(View.GONE);
            secH213 = (LinearLayout) findViewById(R.id.secH213);
            VlblH213 = (TextView) findViewById(R.id.VlblH213);
            spnH213 = (Spinner) findViewById(R.id.spnH213);
            List<String> listH213 = new ArrayList<String>();

            listH213.add("");
            listH213.add("1-পাবলিক স্কুল/সরকারী স্কুল/কলেজ");
            listH213.add("2-আধা সরকারী স্কুল/কলেজ");
            listH213.add("3-বেসরকারীস্কুল/কলেজ");
            listH213.add("4-মাদ্রাসা বোর্ড পাঠ্যক্রম");
            listH213.add("5-মাদ্রাসা –কওমী/ শুধুমাত্র ধর্মীয় পাঠ্যক্রম");
            listH213.add("6-জানি না");
            ArrayAdapter<String> adptrH213 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH213);
            spnH213.setAdapter(adptrH213);

            secH214 = (LinearLayout) findViewById(R.id.secH214);
            VlblH214 = (TextView) findViewById(R.id.VlblH214);
            rdogrpH214 = (RadioGroup) findViewById(R.id.rdogrpH214);

            rdoH2141 = (RadioButton) findViewById(R.id.rdoH2141);
            rdoH2142 = (RadioButton) findViewById(R.id.rdoH2142);
            secH215 = (LinearLayout) findViewById(R.id.secH215);
            VlblH215 = (TextView) findViewById(R.id.VlblH215);
            spnH215 = (Spinner) findViewById(R.id.spnH215);
            List<String> listH215 = new ArrayList<String>();

            listH215.add("");
            listH215.add("1-কৃষিকাজ (ধান)");
            listH215.add("2-কৃষিকাজ (ধান ছাড়া অনান্য)");
            listH215.add("3-অদক্ষ দিনমজুর");
            listH215.add("4-দক্ষ দিনমজুর");
            listH215.add("5-গৃহকর্মী");
            listH215.add("6-রেস্টুরেন্ট / চা স্টলে কাজ করে");
            listH215.add("7-অন্যান্য (মেরামত্/নির্মাণ)");
            listH215.add("8-অন্যান্য (উল্লেখ কর)");
            listH215.add("9-রিক্সা/ভ্যান/ঠেলাগাড়ি চালক");
            listH215.add("10-সিএনজি/টেম্পু/মিনিবাস চালক");
            listH215.add("11-বাস/ট্রাক  চালক");
            listH215.add("12-ভিক্ষুক (পেশাদারী)");
            listH215.add("13-পরিবহন শ্রমিক");
            listH215.add("14- শিক্ষক");
            listH215.add("15-খাদ্য প্রক্রিয়াকরণ");
            listH215.add("16-ক্ষুদ্র শিল্প");
            listH215.add("17-হস্তশিল্প");
            listH215.add("18-ক্ষুদ্র ব্যবসায়ী (পথিপার্শ্বস্থ স্ট্যান্ড বা স্টল)");
            listH215.add("19-হাট/গ্রামের ছোট দোকানদার");
            listH215.add("20-ব্যবসায়ী (অন্যান্য)");
            listH215.add("21-ক্ষেত ফসল কৃষক");
            listH215.add("22-বসত ভিটায়ে কৃষিকাজ করে");
            listH215.add("23-মৎস চাষ");
            listH215.add("24-হাঁস মুরগি লালন পালন");
            listH215.add("25-গবাদিপশু লালন পালন");
            listH215.add("26-গৃহিনী");
            listH215.add("27-কিছু করে না");
            listH215.add("28-ছাত্র/ছাত্রী");
            listH215.add("29-শিশুর বয়স পাচ বছরের নিচে");
            ArrayAdapter<String> adptrH215 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH215);
            spnH215.setAdapter(adptrH215);

            secH215X = (LinearLayout) findViewById(R.id.secH215X);
            VlblH215X = (TextView) findViewById(R.id.VlblH215X);
            txtH215X = (EditText) findViewById(R.id.txtH215X);
            spnH215.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 8) {
                        secH215X.setVisibility(View.VISIBLE);
                    } else {
                        txtH215X.setText("");
                        secH215X.setVisibility(View.GONE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            secH215X.setVisibility(View.GONE);

            secH216 = (LinearLayout) findViewById(R.id.secH216);
            VlblH216 = (TextView) findViewById(R.id.VlblH216);
            spnH216 = (Spinner) findViewById(R.id.spnH216);
            List<String> listH216 = new ArrayList<String>();

            listH216.add("");
            listH216.add("1-কৃষিকাজ (ধান)");
            listH216.add("2-কৃষিকাজ (ধান ছাড়া অনান্য)");
            listH216.add("3-অদক্ষ দিনমজুর");
            listH216.add("4-দক্ষ দিনমজুর");
            listH216.add("5-গৃহকর্মী");
            listH216.add("6-রেস্টুরেন্ট / চা স্টলে কাজ করে");
            listH216.add("7-অন্যান্য (মেরামত্/নির্মাণ)");
            listH216.add("8-অন্যান্য (উল্লেখ কর)");
            listH216.add("9-রিক্সা/ভ্যান/ঠেলাগাড়ি চালক");
            listH216.add("10-সিএনজি/টেম্পু/মিনিবাস চালক");
            listH216.add("11-বাস/ট্রাক  চালক");
            listH216.add("12-ভিক্ষুক (পেশাদারী)");
            listH216.add("13-পরিবহন শ্রমিক");
            listH216.add("14- শিক্ষক");
            listH216.add("15-খাদ্য প্রক্রিয়াকরণ");
            listH216.add("16-ক্ষুদ্র শিল্প");
            listH216.add("17-হস্তশিল্প");
            listH216.add("18-ক্ষুদ্র ব্যবসায়ী (পথিপার্শ্বস্থ স্ট্যান্ড বা স্টল)");
            listH216.add("19-হাট/গ্রামের ছোট দোকানদার");
            listH216.add("20-ব্যবসায়ী (অন্যান্য)");
            listH216.add("21-ক্ষেত ফসল কৃষক");
            listH216.add("22-বসত ভিটায়ে কৃষিকাজ করে");
            listH216.add("23-মৎস চাষ");
            listH216.add("24-হাঁস মুরগি লালন পালন");
            listH216.add("25-গবাদিপশু লালন পালন");
            listH216.add("26-গৃহিনী");
            listH216.add("27-কিছু করে না");
            listH216.add("28-ছাত্র/ছাত্রী");
            listH216.add("29-শিশুর বয়স পাচ বছরের নিচে");
            ArrayAdapter<String> adptrH216 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH216);
            spnH216.setAdapter(adptrH216);

            secH216X = (LinearLayout) findViewById(R.id.secH216X);
            VlblH216X = (TextView) findViewById(R.id.VlblH216X);
            txtH216X = (EditText) findViewById(R.id.txtH216X);
            spnH216.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 8) {
                        secH216X.setVisibility(View.VISIBLE);
                    } else {
                        txtH216X.setText("");
                        secH216X.setVisibility(View.GONE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }

            });
            secH216X.setVisibility(View.GONE);
            secH217 = (LinearLayout) findViewById(R.id.secH217);
            VlblH217 = (TextView) findViewById(R.id.VlblH217);
            txtH217 = (EditText) findViewById(R.id.txtH217);
            secH218 = (LinearLayout) findViewById(R.id.secH218);
            VlblH218 = (TextView) findViewById(R.id.VlblH218);
            txtH218 = (EditText) findViewById(R.id.txtH218);
            secH219 = (LinearLayout) findViewById(R.id.secH219);
            VlblH219 = (TextView) findViewById(R.id.VlblH219);
            txtH219 = (EditText) findViewById(R.id.txtH219);
            secH222 = (LinearLayout) findViewById(R.id.secH222);
            VlblH222 = (TextView) findViewById(R.id.VlblH222);
            txtH222 = (EditText) findViewById(R.id.txtH222);


            DataSearch(RND, SUCHANAID, H21);
            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(Member.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(Member.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(Member.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(Member.this, "Required field: উপকারভোগী/সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (txtH21.getText().toString().length() == 0 & secH21.isShown()) {
                Connection.MessageBox(Member.this, "Required field: লাইন  #.");
                txtH21.requestFocus();
                return;
            } else if (Integer.valueOf(txtH21.getText().toString().length() == 0 ? "1" : txtH21.getText().toString()) < 1 || Integer.valueOf(txtH21.getText().toString().length() == 0 ? "25" : txtH21.getText().toString()) > 25) {
                Connection.MessageBox(Member.this, "Value should be between 1 and 25(লাইন  #).");
                txtH21.requestFocus();
                return;
            } else if (txtH22.getText().toString().length() == 0 & secH22.isShown()) {
                Connection.MessageBox(Member.this, "Required field: নাম  (জাতীয় পরিচয়পত্র  দেখে).");
                txtH22.requestFocus();
                return;
            } else if (!rdoH231.isChecked() & !rdoH232.isChecked() & secH23.isShown()) {
                Connection.MessageBox(Member.this, "Select anyone options from (লিঙ্গ ).");
                rdoH231.requestFocus();
                return;
            } else if (txtH24Y.getText().toString().length() == 0 & secH24Y.isShown()) {
                Connection.MessageBox(Member.this, "Required field: বছর.");
                txtH24Y.requestFocus();
                return;
            } else if (Integer.valueOf(txtH24Y.getText().toString().length() == 0 ? "1" : txtH24Y.getText().toString()) < 1 || Integer.valueOf(txtH24Y.getText().toString().length() == 0 ? "125" : txtH24Y.getText().toString()) > 125) {
                Connection.MessageBox(Member.this, "Value should be between 1 and 125(বছর).");
                txtH24Y.requestFocus();
                return;
            } else if (txtH24M.getText().toString().length() == 0 & secH24M.isShown()) {
                Connection.MessageBox(Member.this, "Required field: মাস.");
                txtH24M.requestFocus();
                return;
            } else if (Integer.valueOf(txtH24M.getText().toString().length() == 0 ? "1" : txtH24M.getText().toString()) < 1 || Integer.valueOf(txtH24M.getText().toString().length() == 0 ? "11" : txtH24M.getText().toString()) > 11) {
                Connection.MessageBox(Member.this, "Value should be between 1 and 11(মাস).");
                txtH24M.requestFocus();
                return;
            } else if (spnH25.getSelectedItemPosition() == 0 & secH25.isShown()) {
                Connection.MessageBox(Member.this, "Required field: খানা  প্রধানের সাথে সম্পর্ক.");
                spnH25.requestFocus();
                return;
            } else if (spnH26.getSelectedItemPosition() == 0 & secH26.isShown()) {
                Connection.MessageBox(Member.this, "Required field: বৈবাহিক অবস্থা.");
                spnH26.requestFocus();
                return;
            } else if (txtH27.getText().toString().length() == 0 & secH27.isShown()) {
                Connection.MessageBox(Member.this, "Required field: বিয়ের সময় বয়স.");
                txtH27.requestFocus();
                return;
            } else if (Integer.valueOf(txtH27.getText().toString().length() == 0 ? "12" : txtH27.getText().toString()) < 12 || Integer.valueOf(txtH27.getText().toString().length() == 0 ? "60" : txtH27.getText().toString()) > 60) {
                Connection.MessageBox(Member.this, "Value should be between 12 and 60(বিয়ের সময় বয়স).");
                txtH27.requestFocus();
                return;
            } else if (spnH28.getSelectedItemPosition() == 0 & secH28.isShown()) {
                Connection.MessageBox(Member.this, "Required field: ধর্ম.");
                spnH28.requestFocus();
                return;
            } else if (txtH28X.getText().toString().length() == 0 & secH28X.isShown()) {
                Connection.MessageBox(Member.this, "Required field: অন্যান্য.");
                txtH28X.requestFocus();
                return;
            } else if (!rdoH291.isChecked() & !rdoH292.isChecked() & secH29.isShown()) {
                Connection.MessageBox(Member.this, "Select anyone options from (ভাষা).");
                rdoH291.requestFocus();
                return;
            } else if (txtH210.getText().toString().length() == 0 & secH210.isShown()) {
                Connection.MessageBox(Member.this, "Required field: পিতা’র লাইন নম্বর.");
                txtH210.requestFocus();
                return;
            } else if (Integer.valueOf(txtH210.getText().toString().length() == 0 ? "0" : txtH210.getText().toString()) < 0 || Integer.valueOf(txtH210.getText().toString().length() == 0 ? "25" : txtH210.getText().toString()) > 25) {
                Connection.MessageBox(Member.this, "Value should be between 0 and 25(পিতা’র লাইন নম্বর).");
                txtH210.requestFocus();
                return;
            } else if (txtH220.getText().toString().length() == 0 & secH220.isShown()) {
                Connection.MessageBox(Member.this, "Required field: মায়ের লাইন নম্বর.");
                txtH220.requestFocus();
                return;
            } else if (Integer.valueOf(txtH220.getText().toString().length() == 0 ? "0" : txtH220.getText().toString()) < 0 || Integer.valueOf(txtH220.getText().toString().length() == 0 ? "25" : txtH220.getText().toString()) > 25) {
                Connection.MessageBox(Member.this, "Value should be between 0 and 25(মায়ের লাইন নম্বর).");
                txtH220.requestFocus();
                return;
            } else if (txtH221.getText().toString().length() == 0 & secH221.isShown()) {
                Connection.MessageBox(Member.this, "Required field: স্বামী অথবা স্ত্রী  লাইন নম্বর.");
                txtH221.requestFocus();
                return;
            } else if (Integer.valueOf(txtH221.getText().toString().length() == 0 ? "0" : txtH221.getText().toString()) < 0 || Integer.valueOf(txtH221.getText().toString().length() == 0 ? "25" : txtH221.getText().toString()) > 25) {
                Connection.MessageBox(Member.this, "Value should be between 0 and 25(স্বামী অথবা স্ত্রী  লাইন নম্বর).");
                txtH221.requestFocus();
                return;
            } else if (spnH211.getSelectedItemPosition() == 0 & secH211.isShown()) {
                Connection.MessageBox(Member.this, "Required field: শিক্ষাগত যোগ্যতা.");
                spnH211.requestFocus();
                return;
            } else if (spnH212.getSelectedItemPosition() == 0 & secH212.isShown()) {
                Connection.MessageBox(Member.this, "Required field: শিক্ষা (সর্বোচ্চ ক্লাস পাস).");
                spnH212.requestFocus();
                return;
            } else if (txtH212X.getText().toString().length() == 0 & secH212X.isShown()) {
                Connection.MessageBox(Member.this, "Required field: অন্যান্য.");
                txtH212X.requestFocus();
                return;
            } else if (spnH213.getSelectedItemPosition() == 0 & secH213.isShown()) {
                Connection.MessageBox(Member.this, "Required field: স্কুলের ধরন.");
                spnH213.requestFocus();
                return;
            } else if (!rdoH2141.isChecked() & !rdoH2142.isChecked() & secH214.isShown()) {
                Connection.MessageBox(Member.this, "Select anyone options from (এনজিও সদস্য).");
                rdoH2141.requestFocus();
                return;
            } else if (spnH215.getSelectedItemPosition() == 0 & secH215.isShown()) {
                Connection.MessageBox(Member.this, "Required field: পেশা  প্রধান.");
                spnH215.requestFocus();
                return;
            } else if (txtH215X.getText().toString().length() == 0 & secH215X.isShown()) {
                Connection.MessageBox(Member.this, "Required field: অন্যান্য.");
                txtH215X.requestFocus();
                return;
            } else if (spnH216.getSelectedItemPosition() == 0 & secH216.isShown()) {
                Connection.MessageBox(Member.this, "Required field: পেশা  দ্বিতীয়.");
                spnH216.requestFocus();
                return;
            } else if (txtH216X.getText().toString().length() == 0 & secH216X.isShown()) {
                Connection.MessageBox(Member.this, "Required field: অন্যান্য.");
                txtH216X.requestFocus();
                return;
            } else if (txtH217.getText().toString().length() == 0 & secH217.isShown()) {
                Connection.MessageBox(Member.this, "Required field: প্রধান পেশা থেকে গত মাসের আয়.");
                txtH217.requestFocus();
                return;
            } else if (Integer.valueOf(txtH217.getText().toString().length() == 0 ? "1" : txtH217.getText().toString()) < 1 || Integer.valueOf(txtH217.getText().toString().length() == 0 ? "999999999" : txtH217.getText().toString()) > 999999999) {
                Connection.MessageBox(Member.this, "Value should be between 1 and 999999999(প্রধান পেশা থেকে গত মাসের আয়).");
                txtH217.requestFocus();
                return;
            } else if (txtH218.getText().toString().length() == 0 & secH218.isShown()) {
                Connection.MessageBox(Member.this, "Required field: সকল উৎস থেকে গত মাসের আয়.");
                txtH218.requestFocus();
                return;
            } else if (Integer.valueOf(txtH218.getText().toString().length() == 0 ? "1" : txtH218.getText().toString()) < 1 || Integer.valueOf(txtH218.getText().toString().length() == 0 ? "999999999" : txtH218.getText().toString()) > 999999999) {
                Connection.MessageBox(Member.this, "Value should be between 1 and 999999999(সকল উৎস থেকে গত মাসের আয়).");
                txtH218.requestFocus();
                return;
            } else if (txtH219.getText().toString().length() == 0 & secH219.isShown()) {
                Connection.MessageBox(Member.this, "Required field: সকল উৎস থেকে গত বছরের আয়.");
                txtH219.requestFocus();
                return;
            } else if (Integer.valueOf(txtH219.getText().toString().length() == 0 ? "1" : txtH219.getText().toString()) < 1 || Integer.valueOf(txtH219.getText().toString().length() == 0 ? "999999999" : txtH219.getText().toString()) > 999999999) {
                Connection.MessageBox(Member.this, "Value should be between 1 and 999999999(সকল উৎস থেকে গত বছরের আয়).");
                txtH219.requestFocus();
                return;
            } else if (txtH222.getText().toString().length() == 0 & secH222.isShown()) {
                Connection.MessageBox(Member.this, "Required field: ইনডেক্স শিশু লাইন নম্বর.");
                txtH222.requestFocus();
                return;
            } else if (Integer.valueOf(txtH222.getText().toString().length() == 0 ? "1" : txtH222.getText().toString()) < 1 || Integer.valueOf(txtH222.getText().toString().length() == 0 ? "2" : txtH222.getText().toString()) > 2) {
                Connection.MessageBox(Member.this, "Value should be between 1 and 2(ইনডেক্স শিশু লাইন নম্বর).");
                txtH222.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            Member_DataModel objSave = new Member_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setH21(txtH21.getText().toString());
            objSave.setH22(txtH22.getText().toString());
            String[] d_rdogrpH23 = new String[]{"1", "2"};
            objSave.setH23("");
            for (int i = 0; i < rdogrpH23.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH23.getChildAt(i);
                if (rb.isChecked()) objSave.setH23(d_rdogrpH23[i]);
            }

            objSave.setH24Y(txtH24Y.getText().toString());
            objSave.setH24M(txtH24M.getText().toString());
            objSave.setH25((spnH25.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH25.getSelectedItem().toString(), "-")));
            objSave.setH26((spnH26.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH26.getSelectedItem().toString(), "-")));
            objSave.setH27(txtH27.getText().toString());
            objSave.setH28((spnH28.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH28.getSelectedItem().toString(), "-")));
            objSave.setH28X(txtH28X.getText().toString());
            String[] d_rdogrpH29 = new String[]{"1", "2"};
            objSave.setH29("");
            for (int i = 0; i < rdogrpH29.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH29.getChildAt(i);
                if (rb.isChecked()) objSave.setH29(d_rdogrpH29[i]);
            }

            objSave.setH210(txtH210.getText().toString());
            objSave.setH220(txtH220.getText().toString());
            objSave.setH221(txtH221.getText().toString());
            objSave.setH211((spnH211.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH211.getSelectedItem().toString(), "-")));
            objSave.setH212((spnH212.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH212.getSelectedItem().toString(), "-")));
            objSave.setH212X(txtH212X.getText().toString());
            objSave.setH213((spnH213.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH213.getSelectedItem().toString(), "-")));
            String[] d_rdogrpH214 = new String[]{"1", "0"};
            objSave.setH214("");
            for (int i = 0; i < rdogrpH214.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH214.getChildAt(i);
                if (rb.isChecked()) objSave.setH214(d_rdogrpH214[i]);
            }

            objSave.setH215((spnH215.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH215.getSelectedItem().toString(), "-")));
            objSave.setH215X(txtH215X.getText().toString());
            objSave.setH216((spnH216.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH216.getSelectedItem().toString(), "-")));
            objSave.setH216X(txtH216X.getText().toString());
            objSave.setH217(txtH217.getText().toString());
            objSave.setH218(txtH218.getText().toString());
            objSave.setH219(txtH219.getText().toString());
            objSave.setH222(txtH222.getText().toString());
            objSave.setStartTime(StartTime);
            objSave.setEndTime(g.CurrentTime24());
            objSave.setUserId(g.getUserId());
            objSave.setEntryUser(g.getUserId()); //from data entry user list
            //objSave.setLat(Double.toString(currentLatitude));
            //objSave.setLon(Double.toString(currentLongitude));

            String status = objSave.SaveUpdateData(this);
            if (status.length() == 0) {
                Connection.MessageBox(Member.this, "Saved Successfully");
            } else {
                Connection.MessageBox(Member.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(Member.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID, String H21) {
        try {

            RadioButton rb;
            Member_DataModel d = new Member_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "' and H21='" + H21 + "'";
            List<Member_DataModel> data = d.SelectAll(this, SQL);
            for (Member_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                txtH21.setText(item.getH21());
                txtH22.setText(item.getH22());
                String[] d_rdogrpH23 = new String[]{"1", "2"};
                for (int i = 0; i < d_rdogrpH23.length; i++) {
                    if (item.getH23().equals(String.valueOf(d_rdogrpH23[i]))) {
                        rb = (RadioButton) rdogrpH23.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH24Y.setText(item.getH24Y());
                txtH24M.setText(item.getH24M());
                spnH25.setSelection(Global.SpinnerItemPositionAnyLength(spnH25, item.getH25()));
                spnH26.setSelection(Global.SpinnerItemPositionAnyLength(spnH26, item.getH26()));
                txtH27.setText(item.getH27());
                spnH28.setSelection(Global.SpinnerItemPositionAnyLength(spnH28, item.getH28()));
                txtH28X.setText(item.getH28X());
                String[] d_rdogrpH29 = new String[]{"1", "2"};
                for (int i = 0; i < d_rdogrpH29.length; i++) {
                    if (item.getH29().equals(String.valueOf(d_rdogrpH29[i]))) {
                        rb = (RadioButton) rdogrpH29.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH210.setText(item.getH210());
                txtH220.setText(item.getH220());
                txtH221.setText(item.getH221());
                spnH211.setSelection(Global.SpinnerItemPositionAnyLength(spnH211, item.getH211()));
                spnH212.setSelection(Global.SpinnerItemPositionAnyLength(spnH212, item.getH212()));
                txtH212X.setText(item.getH212X());
                spnH213.setSelection(Global.SpinnerItemPositionAnyLength(spnH213, item.getH213()));
                String[] d_rdogrpH214 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH214.length; i++) {
                    if (item.getH214().equals(String.valueOf(d_rdogrpH214[i]))) {
                        rb = (RadioButton) rdogrpH214.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH215.setSelection(Global.SpinnerItemPositionAnyLength(spnH215, item.getH215()));
                txtH215X.setText(item.getH215X());
                spnH216.setSelection(Global.SpinnerItemPositionAnyLength(spnH216, item.getH216()));
                txtH216X.setText(item.getH216X());
                txtH217.setText(item.getH217());
                txtH218.setText(item.getH218());
                txtH219.setText(item.getH219());
                txtH222.setText(item.getH222());
            }
        } catch (Exception e) {
            Connection.MessageBox(Member.this, e.getMessage());
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