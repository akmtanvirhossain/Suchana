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
    LinearLayout secH21;
    View lineH21;
    TextView VlblH21;
    EditText txtH21;
    LinearLayout secH22;
    View lineH22;
    TextView VlblH22;
    EditText txtH22;
    LinearLayout secH23;
    View lineH23;
    TextView VlblH23;
    RadioGroup rdogrpH23;
    RadioButton rdoH231;
    RadioButton rdoH232;
    LinearLayout secH24;
    View lineH24;
    TextView VlblH24;
    EditText txtH24;
    LinearLayout secH25;
    View lineH25;
    TextView VlblH25;
    Spinner spnH25;
    LinearLayout seclblH26;
    LinearLayout secH26Y;
    View lineH26Y;
    TextView VlblH26Y;
    EditText txtH26Y;
    LinearLayout secH26M;
    View lineH26M;
    TextView VlblH26M;
    EditText txtH26M;
    LinearLayout secH27;
    View lineH27;
    TextView VlblH27;
    Spinner spnH27;
    LinearLayout secH28;
    View lineH28;
    TextView VlblH28;
    EditText txtH28;
    LinearLayout secH29;
    View lineH29;
    TextView VlblH29;
    Spinner spnH29;
    LinearLayout secH29X;
    View lineH29X;
    TextView VlblH29X;
    EditText txtH29X;
    LinearLayout secH210;
    View lineH210;
    TextView VlblH210;
    RadioGroup rdogrpH210;
    RadioButton rdoH2101;
    RadioButton rdoH2102;
    LinearLayout secH211;
    View lineH211;
    TextView VlblH211;
    Spinner spnH211;
    LinearLayout secH212;
    View lineH212;
    TextView VlblH212;
    Spinner spnH212;
    LinearLayout secH212X;
    View lineH212X;
    TextView VlblH212X;
    EditText txtH212X;
    LinearLayout secH213;
    View lineH213;
    TextView VlblH213;
    Spinner spnH213;
    LinearLayout secH214;
    View lineH214;
    TextView VlblH214;
    RadioGroup rdogrpH214;
    RadioButton rdoH2141;
    RadioButton rdoH2142;
    LinearLayout secH215;
    View lineH215;
    TextView VlblH215;
    Spinner spnH215;
    LinearLayout secH215X;
    View lineH215X;
    TextView VlblH215X;
    EditText txtH215X;
    LinearLayout secH216;
    View lineH216;
    TextView VlblH216;
    Spinner spnH216;
    LinearLayout secH216X;
    View lineH216X;
    TextView VlblH216X;
    EditText txtH216X;
    LinearLayout secH217;
    View lineH217;
    TextView VlblH217;
    EditText txtH217;
    LinearLayout secH218;
    View lineH218;
    TextView VlblH218;
    EditText txtH218;
    LinearLayout secH219;
    View lineH219;
    TextView VlblH219;
    EditText txtH219;
    LinearLayout secH220;
    View lineH220;
    TextView VlblH220;
    EditText txtH220;
    LinearLayout secH221;
    View lineH221;
    TextView VlblH221;
    EditText txtH221;
    LinearLayout secH222;
    View lineH222;
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
            lineRnd = (View) findViewById(R.id.lineRnd);
            VlblRnd = (TextView) findViewById(R.id.VlblRnd);
            txtRnd = (EditText) findViewById(R.id.txtRnd);
            secSuchanaID = (LinearLayout) findViewById(R.id.secSuchanaID);
            lineSuchanaID = (View) findViewById(R.id.lineSuchanaID);
            VlblSuchanaID = (TextView) findViewById(R.id.VlblSuchanaID);
            txtSuchanaID = (EditText) findViewById(R.id.txtSuchanaID);
            secH21 = (LinearLayout) findViewById(R.id.secH21);
            lineH21 = (View) findViewById(R.id.lineH21);
            VlblH21 = (TextView) findViewById(R.id.VlblH21);
            txtH21 = (EditText) findViewById(R.id.txtH21);
            secH22 = (LinearLayout) findViewById(R.id.secH22);
            lineH22 = (View) findViewById(R.id.lineH22);
            VlblH22 = (TextView) findViewById(R.id.VlblH22);
            txtH22 = (EditText) findViewById(R.id.txtH22);
            secH23 = (LinearLayout) findViewById(R.id.secH23);
            lineH23 = (View) findViewById(R.id.lineH23);
            VlblH23 = (TextView) findViewById(R.id.VlblH23);
            rdogrpH23 = (RadioGroup) findViewById(R.id.rdogrpH23);

            rdoH231 = (RadioButton) findViewById(R.id.rdoH231);
            rdoH232 = (RadioButton) findViewById(R.id.rdoH232);
            secH24 = (LinearLayout) findViewById(R.id.secH24);
            lineH24 = (View) findViewById(R.id.lineH24);
            VlblH24 = (TextView) findViewById(R.id.VlblH24);
            txtH24 = (EditText) findViewById(R.id.txtH24);
            secH25 = (LinearLayout) findViewById(R.id.secH25);
            lineH25 = (View) findViewById(R.id.lineH25);
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

            seclblH26 = (LinearLayout) findViewById(R.id.seclblH26);
            secH26Y = (LinearLayout) findViewById(R.id.secH26Y);
            lineH26Y = (View) findViewById(R.id.lineH26Y);
            VlblH26Y = (TextView) findViewById(R.id.VlblH26Y);
            txtH26Y = (EditText) findViewById(R.id.txtH26Y);
            secH26M = (LinearLayout) findViewById(R.id.secH26M);
            lineH26M = (View) findViewById(R.id.lineH26M);
            VlblH26M = (TextView) findViewById(R.id.VlblH26M);
            txtH26M = (EditText) findViewById(R.id.txtH26M);
            secH27 = (LinearLayout) findViewById(R.id.secH27);
            lineH27 = (View) findViewById(R.id.lineH27);
            VlblH27 = (TextView) findViewById(R.id.VlblH27);
            spnH27 = (Spinner) findViewById(R.id.spnH27);
            List<String> listH27 = new ArrayList<String>();

            listH27.add("");
            listH27.add("1-অবিবাহিত (চিরকুমার অথবা চিরকুমারী)");
            listH27.add("2-বিবাহিত");
            listH27.add("3-বিধবা অথবা বিপত্নীক");
            listH27.add("4-তালাকপ্রাপ্ত");
            listH27.add("5-পৃথক থাকে অথবা পরিত্যক্তা");
            ArrayAdapter<String> adptrH27 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH27);
            spnH27.setAdapter(adptrH27);

            secH28 = (LinearLayout) findViewById(R.id.secH28);
            lineH28 = (View) findViewById(R.id.lineH28);
            VlblH28 = (TextView) findViewById(R.id.VlblH28);
            txtH28 = (EditText) findViewById(R.id.txtH28);
            secH29 = (LinearLayout) findViewById(R.id.secH29);
            lineH29 = (View) findViewById(R.id.lineH29);
            VlblH29 = (TextView) findViewById(R.id.VlblH29);
            spnH29 = (Spinner) findViewById(R.id.spnH29);
            List<String> listH29 = new ArrayList<String>();

            listH29.add("");
            listH29.add("1-মুসলিম");
            listH29.add("2-হিন্দু");
            listH29.add("3-খ্রীষ্ট");
            listH29.add("4-বুদ্ধ");
            listH29.add("5-অন্যান্য (উল্লেখ কর)");
            ArrayAdapter<String> adptrH29 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH29);
            spnH29.setAdapter(adptrH29);

            spnH29.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH29.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH29.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("1")) {
                        secH29X.setVisibility(View.GONE);
                        lineH29X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("2")) {
                        secH29X.setVisibility(View.GONE);
                        lineH29X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("3")) {
                        secH29X.setVisibility(View.GONE);
                        lineH29X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("4")) {
                        secH29X.setVisibility(View.GONE);
                        lineH29X.setVisibility(View.GONE);
                    } else {
                        secH29X.setVisibility(View.VISIBLE);
                        lineH29X.setVisibility(View.VISIBLE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH29X = (LinearLayout) findViewById(R.id.secH29X);
            lineH29X = (View) findViewById(R.id.lineH29X);
            VlblH29X = (TextView) findViewById(R.id.VlblH29X);
            txtH29X = (EditText) findViewById(R.id.txtH29X);
            secH210 = (LinearLayout) findViewById(R.id.secH210);
            lineH210 = (View) findViewById(R.id.lineH210);
            VlblH210 = (TextView) findViewById(R.id.VlblH210);
            rdogrpH210 = (RadioGroup) findViewById(R.id.rdogrpH210);

            rdoH2101 = (RadioButton) findViewById(R.id.rdoH2101);
            rdoH2102 = (RadioButton) findViewById(R.id.rdoH2102);
            secH211 = (LinearLayout) findViewById(R.id.secH211);
            lineH211 = (View) findViewById(R.id.lineH211);
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
            lineH212 = (View) findViewById(R.id.lineH212);
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

            spnH212.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH212.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH212.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("77")) {
                        secH212X.setVisibility(View.GONE);
                        lineH212X.setVisibility(View.GONE);
                    } else {
                        secH212X.setVisibility(View.VISIBLE);
                        lineH212X.setVisibility(View.VISIBLE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH212X = (LinearLayout) findViewById(R.id.secH212X);
            lineH212X = (View) findViewById(R.id.lineH212X);
            VlblH212X = (TextView) findViewById(R.id.VlblH212X);
            txtH212X = (EditText) findViewById(R.id.txtH212X);
            secH213 = (LinearLayout) findViewById(R.id.secH213);
            lineH213 = (View) findViewById(R.id.lineH213);
            VlblH213 = (TextView) findViewById(R.id.VlblH213);
            spnH213 = (Spinner) findViewById(R.id.spnH213);
            List<String> listH213 = new ArrayList<String>();

            listH213.add("");
            listH213.add("1-পাবলিক স্কুল/সরকারী স্কুল/কলেজ");
            listH213.add("2-আধা সরকারী স্কুল/কলেজ");
            listH213.add("3-বেসরকারীস্কুল/কলেজ");
            listH213.add("4-মাদ্রাসা বোর্ড পাঠ্যক্রম");
            listH213.add("5-মাদ্রাসা –কওমী/ শুধুমাত্র ধর্মীয় পাঠ্যক্রম");
            listH213.add("8-জানি না");
            ArrayAdapter<String> adptrH213 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH213);
            spnH213.setAdapter(adptrH213);

            secH214 = (LinearLayout) findViewById(R.id.secH214);
            lineH214 = (View) findViewById(R.id.lineH214);
            VlblH214 = (TextView) findViewById(R.id.VlblH214);
            rdogrpH214 = (RadioGroup) findViewById(R.id.rdogrpH214);

            rdoH2141 = (RadioButton) findViewById(R.id.rdoH2141);
            rdoH2142 = (RadioButton) findViewById(R.id.rdoH2142);
            secH215 = (LinearLayout) findViewById(R.id.secH215);
            lineH215 = (View) findViewById(R.id.lineH215);
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
            listH215.add("24-জেলে");
            listH215.add("25-হাঁস মুরগি লালন পালন");
            listH215.add("26-গবাদিপশু লালন পালন");
            listH215.add("27-গৃহিনী");
            listH215.add("28-কিছু করে না");
            listH215.add("29-ছাত্র/ছাত্রী");
            listH215.add("30-শিশুর বয়স পাচ বছরের নিচে");
            ArrayAdapter<String> adptrH215 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH215);
            spnH215.setAdapter(adptrH215);

            spnH215.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH215.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH215.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("8")) {
                        secH215X.setVisibility(View.GONE);
                        lineH215X.setVisibility(View.GONE);
                    } else {
                        secH215X.setVisibility(View.VISIBLE);
                        lineH215X.setVisibility(View.VISIBLE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH215X = (LinearLayout) findViewById(R.id.secH215X);
            lineH215X = (View) findViewById(R.id.lineH215X);
            VlblH215X = (TextView) findViewById(R.id.VlblH215X);
            txtH215X = (EditText) findViewById(R.id.txtH215X);
            secH216 = (LinearLayout) findViewById(R.id.secH216);
            lineH216 = (View) findViewById(R.id.lineH216);
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
            listH216.add("24-জেলে");
            listH216.add("25-হাঁস মুরগি লালন পালন");
            listH216.add("26-গবাদিপশু লালন পালন");
            listH216.add("27-গৃহিনী");
            listH216.add("28-কিছু করে না");
            listH216.add("29-ছাত্র/ছাত্রী");
            listH216.add("30-শিশুর বয়স পাচ বছরের নিচে");
            ArrayAdapter<String> adptrH216 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH216);
            spnH216.setAdapter(adptrH216);

            spnH216.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH216.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH216.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("8")) {
                        secH216X.setVisibility(View.GONE);
                        lineH216X.setVisibility(View.GONE);
                    } else {
                        secH216X.setVisibility(View.VISIBLE);
                        lineH216X.setVisibility(View.VISIBLE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH216X = (LinearLayout) findViewById(R.id.secH216X);
            lineH216X = (View) findViewById(R.id.lineH216X);
            VlblH216X = (TextView) findViewById(R.id.VlblH216X);
            txtH216X = (EditText) findViewById(R.id.txtH216X);
            secH217 = (LinearLayout) findViewById(R.id.secH217);
            lineH217 = (View) findViewById(R.id.lineH217);
            VlblH217 = (TextView) findViewById(R.id.VlblH217);
            txtH217 = (EditText) findViewById(R.id.txtH217);
            secH218 = (LinearLayout) findViewById(R.id.secH218);
            lineH218 = (View) findViewById(R.id.lineH218);
            VlblH218 = (TextView) findViewById(R.id.VlblH218);
            txtH218 = (EditText) findViewById(R.id.txtH218);
            secH219 = (LinearLayout) findViewById(R.id.secH219);
            lineH219 = (View) findViewById(R.id.lineH219);
            VlblH219 = (TextView) findViewById(R.id.VlblH219);
            txtH219 = (EditText) findViewById(R.id.txtH219);
            secH220 = (LinearLayout) findViewById(R.id.secH220);
            lineH220 = (View) findViewById(R.id.lineH220);
            VlblH220 = (TextView) findViewById(R.id.VlblH220);
            txtH220 = (EditText) findViewById(R.id.txtH220);
            secH221 = (LinearLayout) findViewById(R.id.secH221);
            lineH221 = (View) findViewById(R.id.lineH221);
            VlblH221 = (TextView) findViewById(R.id.VlblH221);
            txtH221 = (EditText) findViewById(R.id.txtH221);
            secH222 = (LinearLayout) findViewById(R.id.secH222);
            lineH222 = (View) findViewById(R.id.lineH222);
            VlblH222 = (TextView) findViewById(R.id.VlblH222);
            txtH222 = (EditText) findViewById(R.id.txtH222);


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
                Connection.MessageBox(Member.this, "Required field: নাম  (জাতীয় পরিচয়পত্র অথবা জন্মনিবন্ধন সনদ/ টিকা কার্ড   দেখে নিশ্চিত হোন).");
                txtH22.requestFocus();
                return;
            } else if (!rdoH231.isChecked() & !rdoH232.isChecked() & secH23.isShown()) {
                Connection.MessageBox(Member.this, "Select anyone options from (লিঙ্গ ).");
                rdoH231.requestFocus();
                return;
            } else if (txtH24.getText().toString().length() == 0 & secH24.isShown()) {
                Connection.MessageBox(Member.this, "Required field: পিতা’র লাইন নম্বর.");
                txtH24.requestFocus();
                return;
            } else if (Integer.valueOf(txtH24.getText().toString().length() == 0 ? "0" : txtH24.getText().toString()) < 0 || Integer.valueOf(txtH24.getText().toString().length() == 0 ? "25" : txtH24.getText().toString()) > 25) {
                Connection.MessageBox(Member.this, "Value should be between 0 and 25(পিতা’র লাইন নম্বর).");
                txtH24.requestFocus();
                return;
            } else if (spnH25.getSelectedItemPosition() == 0 & secH25.isShown()) {
                Connection.MessageBox(Member.this, "Required field: খানা প্রধানের সাথে সম্পর্ক.");
                spnH25.requestFocus();
                return;
            } else if (txtH26Y.getText().toString().length() == 0 & secH26Y.isShown()) {
                Connection.MessageBox(Member.this, "Required field: বছর.");
                txtH26Y.requestFocus();
                return;
            } else if (Integer.valueOf(txtH26Y.getText().toString().length() == 0 ? "1" : txtH26Y.getText().toString()) < 1 || Integer.valueOf(txtH26Y.getText().toString().length() == 0 ? "125" : txtH26Y.getText().toString()) > 125) {
                Connection.MessageBox(Member.this, "Value should be between 1 and 125(বছর).");
                txtH26Y.requestFocus();
                return;
            } else if (txtH26M.getText().toString().length() == 0 & secH26M.isShown()) {
                Connection.MessageBox(Member.this, "Required field: মাস.");
                txtH26M.requestFocus();
                return;
            } else if (Integer.valueOf(txtH26M.getText().toString().length() == 0 ? "1" : txtH26M.getText().toString()) < 1 || Integer.valueOf(txtH26M.getText().toString().length() == 0 ? "11" : txtH26M.getText().toString()) > 11) {
                Connection.MessageBox(Member.this, "Value should be between 1 and 11(মাস).");
                txtH26M.requestFocus();
                return;
            } else if (spnH27.getSelectedItemPosition() == 0 & secH27.isShown()) {
                Connection.MessageBox(Member.this, "Required field: বৈবাহিক অবস্থা.");
                spnH27.requestFocus();
                return;
            } else if (txtH28.getText().toString().length() == 0 & secH28.isShown()) {
                Connection.MessageBox(Member.this, "Required field: বিয়ের সময় বয়স (বছর).");
                txtH28.requestFocus();
                return;
            } else if (Integer.valueOf(txtH28.getText().toString().length() == 0 ? "12" : txtH28.getText().toString()) < 12 || Integer.valueOf(txtH28.getText().toString().length() == 0 ? "60" : txtH28.getText().toString()) > 60) {
                Connection.MessageBox(Member.this, "Value should be between 12 and 60(বিয়ের সময় বয়স (বছর)).");
                txtH28.requestFocus();
                return;
            } else if (spnH29.getSelectedItemPosition() == 0 & secH29.isShown()) {
                Connection.MessageBox(Member.this, "Required field: ধর্ম.");
                spnH29.requestFocus();
                return;
            } else if (txtH29X.getText().toString().length() == 0 & secH29X.isShown()) {
                Connection.MessageBox(Member.this, "Required field: অন্যান্য.");
                txtH29X.requestFocus();
                return;
            } else if (!rdoH2101.isChecked() & !rdoH2102.isChecked() & secH210.isShown()) {
                Connection.MessageBox(Member.this, "Select anyone options from (ভাষা).");
                rdoH2101.requestFocus();
                return;
            } else if (spnH211.getSelectedItemPosition() == 0 & secH211.isShown()) {
                Connection.MessageBox(Member.this, "Required field: সাক্ষর জ্ঞান.");
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
            } else if (Integer.valueOf(txtH217.getText().toString().length() == 0 ? "1" : txtH217.getText().toString()) < 1 || Integer.valueOf(txtH217.getText().toString().length() == 0 ? "999999" : txtH217.getText().toString()) > 999999) {
                Connection.MessageBox(Member.this, "Value should be between 1 and 999999(প্রধান পেশা থেকে গত মাসের আয়).");
                txtH217.requestFocus();
                return;
            } else if (txtH218.getText().toString().length() == 0 & secH218.isShown()) {
                Connection.MessageBox(Member.this, "Required field: সকল উৎস থেকে গত মাসের আয়.");
                txtH218.requestFocus();
                return;
            } else if (Integer.valueOf(txtH218.getText().toString().length() == 0 ? "1" : txtH218.getText().toString()) < 1 || Integer.valueOf(txtH218.getText().toString().length() == 0 ? "999999" : txtH218.getText().toString()) > 999999) {
                Connection.MessageBox(Member.this, "Value should be between 1 and 999999(সকল উৎস থেকে গত মাসের আয়).");
                txtH218.requestFocus();
                return;
            } else if (txtH219.getText().toString().length() == 0 & secH219.isShown()) {
                Connection.MessageBox(Member.this, "Required field: সকল উৎস থেকে গত বছরের আয়.");
                txtH219.requestFocus();
                return;
            } else if (Integer.valueOf(txtH219.getText().toString().length() == 0 ? "1" : txtH219.getText().toString()) < 1 || Integer.valueOf(txtH219.getText().toString().length() == 0 ? "999999" : txtH219.getText().toString()) > 999999) {
                Connection.MessageBox(Member.this, "Value should be between 1 and 999999(সকল উৎস থেকে গত বছরের আয়).");
                txtH219.requestFocus();
                return;
            } else if (txtH220.getText().toString().length() == 0 & secH220.isShown()) {
                Connection.MessageBox(Member.this, "Required field: ইনডেক্স শিশু লাইন নম্বর.");
                txtH220.requestFocus();
                return;
            } else if (Integer.valueOf(txtH220.getText().toString().length() == 0 ? "1" : txtH220.getText().toString()) < 1 || Integer.valueOf(txtH220.getText().toString().length() == 0 ? "2" : txtH220.getText().toString()) > 2) {
                Connection.MessageBox(Member.this, "Value should be between 1 and 2(ইনডেক্স শিশু লাইন নম্বর).");
                txtH220.requestFocus();
                return;
            } else if (txtH221.getText().toString().length() == 0 & secH221.isShown()) {
                Connection.MessageBox(Member.this, "Required field: মায়ের লাইন নম্বর.");
                txtH221.requestFocus();
                return;
            } else if (Integer.valueOf(txtH221.getText().toString().length() == 0 ? "0" : txtH221.getText().toString()) < 0 || Integer.valueOf(txtH221.getText().toString().length() == 0 ? "25" : txtH221.getText().toString()) > 25) {
                Connection.MessageBox(Member.this, "Value should be between 0 and 25(মায়ের লাইন নম্বর).");
                txtH221.requestFocus();
                return;
            } else if (txtH222.getText().toString().length() == 0 & secH222.isShown()) {
                Connection.MessageBox(Member.this, "Required field: স্বামী অথবা স্ত্রী  লাইন নম্বর.");
                txtH222.requestFocus();
                return;
            } else if (Integer.valueOf(txtH222.getText().toString().length() == 0 ? "0" : txtH222.getText().toString()) < 0 || Integer.valueOf(txtH222.getText().toString().length() == 0 ? "25" : txtH222.getText().toString()) > 25) {
                Connection.MessageBox(Member.this, "Value should be between 0 and 25(স্বামী অথবা স্ত্রী  লাইন নম্বর).");
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

            objSave.setH24(txtH24.getText().toString());
            objSave.setH25((spnH25.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH25.getSelectedItem().toString(), "-")));
            objSave.setH26Y(txtH26Y.getText().toString());
            objSave.setH26M(txtH26M.getText().toString());
            objSave.setH27((spnH27.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH27.getSelectedItem().toString(), "-")));
            objSave.setH28(txtH28.getText().toString());
            objSave.setH29((spnH29.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH29.getSelectedItem().toString(), "-")));
            objSave.setH29X(txtH29X.getText().toString());
            String[] d_rdogrpH210 = new String[]{"1", "2"};
            objSave.setH210("");
            for (int i = 0; i < rdogrpH210.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH210.getChildAt(i);
                if (rb.isChecked()) objSave.setH210(d_rdogrpH210[i]);
            }

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
            objSave.setH220(txtH220.getText().toString());
            objSave.setH221(txtH221.getText().toString());
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
                txtH24.setText(item.getH24());
                spnH25.setSelection(Global.SpinnerItemPositionAnyLength(spnH25, item.getH25()));
                txtH26Y.setText(item.getH26Y());
                txtH26M.setText(item.getH26M());
                spnH27.setSelection(Global.SpinnerItemPositionAnyLength(spnH27, item.getH27()));
                txtH28.setText(item.getH28());
                spnH29.setSelection(Global.SpinnerItemPositionAnyLength(spnH29, item.getH29()));
                txtH29X.setText(item.getH29X());
                String[] d_rdogrpH210 = new String[]{"1", "2"};
                for (int i = 0; i < d_rdogrpH210.length; i++) {
                    if (item.getH210().equals(String.valueOf(d_rdogrpH210[i]))) {
                        rb = (RadioButton) rdogrpH210.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
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
                txtH220.setText(item.getH220());
                txtH221.setText(item.getH221());
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