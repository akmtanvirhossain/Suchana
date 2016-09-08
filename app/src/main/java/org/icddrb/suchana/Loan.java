package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Loan" android:label="Loan" />

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
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

public class Loan extends Activity {
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
    LinearLayout secH111;
    TextView VlblH111;
    RadioGroup rdogrpH111;
    RadioButton rdoH1111;
    RadioButton rdoH1112;
    LinearLayout secH112;
    TextView VlblH112;
    EditText txtH112;
    LinearLayout secH113;
    TextView VlblH113;
    Spinner spnH113;
    LinearLayout secH113X;
    TextView VlblH113X;
    EditText txtH113X;
    LinearLayout secH114;
    TextView VlblH114;
    Spinner spnH114;
    LinearLayout secH114X;
    TextView VlblH114X;
    EditText txtH114X;
    LinearLayout secH115;
    TextView VlblH115;
    RadioGroup rdogrpH115;
    RadioButton rdoH1151;
    RadioButton rdoH1152;
    RadioButton rdoH1153;
    LinearLayout secH116;
    TextView VlblH116;
    EditText txtH116;
    LinearLayout secH117;
    TextView VlblH117;
    RadioGroup rdogrpH117;
    RadioButton rdoH1171;
    RadioButton rdoH1172;
    RadioButton rdoH1173;
    LinearLayout secH118;
    TextView VlblH118;
    RadioGroup rdogrpH118;
    RadioButton rdoH1181;
    RadioButton rdoH1182;
    RadioButton rdoH1183;
    RadioButton rdoH1184;
    LinearLayout secH119;
    TextView VlblH119;
    RadioGroup rdogrpH119;
    RadioButton rdoH1191;
    RadioButton rdoH1192;
    RadioButton rdoH1193;
    LinearLayout secH1110;
    TextView VlblH1110;
    EditText txtH1110;
    LinearLayout secH1111;
    TextView VlblH1111;
    EditText txtH1111;
    LinearLayout secH1112;
    TextView VlblH1112;
    RadioGroup rdogrpH1112;
    RadioButton rdoH11121;
    RadioButton rdoH11122;
    RadioButton rdoH11123;
    RadioButton rdoH11124;
    LinearLayout secH1112X;
    TextView VlblH1112X;
    EditText txtH1112X;
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
            setContentView(R.layout.loan);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TableName = "Loan";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Loan.this);
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
            secH111 = (LinearLayout) findViewById(R.id.secH111);
            VlblH111 = (TextView) findViewById(R.id.VlblH111);
            rdogrpH111 = (RadioGroup) findViewById(R.id.rdogrpH111);

            rdoH1111 = (RadioButton) findViewById(R.id.rdoH1111);
            rdoH1112 = (RadioButton) findViewById(R.id.rdoH1112);
            rdogrpH111.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH111 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH111.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH111.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH111[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH112.setVisibility(View.GONE);
                        txtH112.setText("");
                        secH113.setVisibility(View.GONE);
                        spnH113.setSelection(0);
                        secH113X.setVisibility(View.GONE);
                        txtH113X.setText("");
                        secH114.setVisibility(View.GONE);
                        spnH114.setSelection(0);
                        secH114X.setVisibility(View.GONE);
                        txtH114X.setText("");
                        secH115.setVisibility(View.GONE);
                        rdogrpH115.clearCheck();
                        secH116.setVisibility(View.GONE);
                        txtH116.setText("");
                        secH117.setVisibility(View.GONE);
                        rdogrpH117.clearCheck();
                        secH118.setVisibility(View.GONE);
                        rdogrpH118.clearCheck();
                        secH119.setVisibility(View.GONE);
                        rdogrpH119.clearCheck();
                        secH1110.setVisibility(View.GONE);
                        txtH1110.setText("");
                        secH1111.setVisibility(View.GONE);
                        txtH1111.setText("");
                    } else {
                        secH112.setVisibility(View.VISIBLE);
                        secH113.setVisibility(View.VISIBLE);
                        secH113X.setVisibility(View.VISIBLE);
                        secH114.setVisibility(View.VISIBLE);
                        secH114X.setVisibility(View.VISIBLE);
                        secH115.setVisibility(View.VISIBLE);
                        secH116.setVisibility(View.VISIBLE);
                        secH117.setVisibility(View.VISIBLE);
                        secH118.setVisibility(View.VISIBLE);
                        secH119.setVisibility(View.VISIBLE);
                        secH1110.setVisibility(View.VISIBLE);
                        secH1111.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH112 = (LinearLayout) findViewById(R.id.secH112);
            VlblH112 = (TextView) findViewById(R.id.VlblH112);
            txtH112 = (EditText) findViewById(R.id.txtH112);
            secH113 = (LinearLayout) findViewById(R.id.secH113);
            VlblH113 = (TextView) findViewById(R.id.VlblH113);
            spnH113 = (Spinner) findViewById(R.id.spnH113);
            List<String> listH113 = new ArrayList<String>();

            listH113.add("");
            listH113.add("1-ব্যাংক 2-মহাজন");
            listH113.add("3-দোকানদার 4-আত্মীয়");
            listH113.add("5-বন্ধুপ্রতিবেশী");
            listH113.add("6-গ্রামীণ");
            listH113.add("7-আশা");
            listH113.add("8-টিএমএসএস");
            listH113.add("9-আরডিআরএস");
            listH113.add("10-প্রশিখা");
            listH113.add("11-পদক্ষেপ");
            listH113.add("12-স্বনির্ভর");
            listH113.add("13-সিএনআরএস");
            listH113.add("14-এফআইভিডিবি");
            listH113.add("15-অনান্য");
            listH113.add("99-NA");
            ArrayAdapter<String> adptrH113 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH113);
            spnH113.setAdapter(adptrH113);

            spnH113.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH113.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH113.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("1")) {
                        secH113X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("2")) {
                        secH113X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("3")) {
                        secH113X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("4")) {
                        secH113X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("5")) {
                        secH113X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("6")) {
                        secH113X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("7")) {
                        secH113X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("8")) {
                        secH113X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("9")) {
                        secH113X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("10")) {
                        secH113X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("11")) {
                        secH113X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("12")) {
                        secH113X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("13")) {
                        secH113X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("14")) {
                        secH113X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("99")) {
                        secH113X.setVisibility(View.GONE);
                    } else {
                        secH113X.setVisibility(View.VISIBLE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH113X = (LinearLayout) findViewById(R.id.secH113X);
            VlblH113X = (TextView) findViewById(R.id.VlblH113X);
            txtH113X = (EditText) findViewById(R.id.txtH113X);
            secH114 = (LinearLayout) findViewById(R.id.secH114);
            VlblH114 = (TextView) findViewById(R.id.VlblH114);
            spnH114 = (Spinner) findViewById(R.id.spnH114);
            List<String> listH114 = new ArrayList<String>();

            listH114.add("");
            listH114.add("1-ব্যবসায়িক উদ্যোগ");
            listH114.add("2-সার কিনতে");
            listH114.add("3-বীজ কিনতে");
            listH114.add("4-কীটনাশক কিনতে");
            listH114.add("5-সেচ সরঞ্জাম কিনতে");
            listH114.add("6-অন্যান্য কৃষি উপকরণ কিনতে");
            listH114.add("7-সেচের জন্য পানি কিনতে");
            listH114.add("8-কৃষির জন্য ডিজেল  বিদ্যুৎ খরচ");
            listH114.add("9-কৃষি শ্রম মজুরি");
            listH114.add("10-কৃষির জন্য ভাড়া করা মেশিন পশুদের খরচ");
            listH114.add("11-কৃষি ছাড়া অন্য উদ্দেশ্যে উৎপাদনশীল সম্পদ কিনতে");
            listH114.add("12-কৃষি জমি ইজারা জন্য (নগদ মাত্র)");
            listH114.add("13-কৃষি ছাড়া অন্য (নগদ মাত্র উদ্দেশ্যে) জমি ইজারা জন্য");
            listH114.add("14-জমি ক্রয়ের জন্য");
            listH114.add("15-গরু ছাগল ক্রয়ের জন্য");
            listH114.add("16-চিকিৎসার জন্য");
            listH114.add("17-খানার খাবারের চাহিদা পূরণের জন্য");
            listH114.add("18-খানা ভাড়া ক্রয় উন্নয়নের জন্য");
            listH114.add("19-শিক্ষার খরচের জন্য");
            listH114.add("20-বিয়ের জন্য ব্যয়");
            listH114.add("21-যৌতুক");
            listH114.add("22-জানাজা অন্ত্যেষ্টিক্রিয়া");
            listH114.add("23-উচ্চ সুদে ধার দেয়ার জন্য");
            listH114.add("24-বিদেশে যাওয়ার জন্য");
            listH114.add("25-অন্য লোন শোধ করার জন্য");
            listH114.add("26-অনান্য");
            listH114.add("99-NA");
            ArrayAdapter<String> adptrH114 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH114);
            spnH114.setAdapter(adptrH114);

            spnH114.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH114.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH114.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("1")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("2")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("3")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("4")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("5")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("6")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("7")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("8")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("9")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("10")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("11")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("12")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("13")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("14")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("15")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("16")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("17")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("18")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("19")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("20")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("21")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("22")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("23")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("24")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("25")) {
                        secH114X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("99")) {
                        secH114X.setVisibility(View.GONE);
                    } else {
                        secH114X.setVisibility(View.VISIBLE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH114X = (LinearLayout) findViewById(R.id.secH114X);
            VlblH114X = (TextView) findViewById(R.id.VlblH114X);
            txtH114X = (EditText) findViewById(R.id.txtH114X);
            secH115 = (LinearLayout) findViewById(R.id.secH115);
            VlblH115 = (TextView) findViewById(R.id.VlblH115);
            rdogrpH115 = (RadioGroup) findViewById(R.id.rdogrpH115);

            rdoH1151 = (RadioButton) findViewById(R.id.rdoH1151);
            rdoH1152 = (RadioButton) findViewById(R.id.rdoH1152);
            rdoH1153 = (RadioButton) findViewById(R.id.rdoH1153);
            secH116 = (LinearLayout) findViewById(R.id.secH116);
            VlblH116 = (TextView) findViewById(R.id.VlblH116);
            txtH116 = (EditText) findViewById(R.id.txtH116);
            secH117 = (LinearLayout) findViewById(R.id.secH117);
            VlblH117 = (TextView) findViewById(R.id.VlblH117);
            rdogrpH117 = (RadioGroup) findViewById(R.id.rdogrpH117);

            rdoH1171 = (RadioButton) findViewById(R.id.rdoH1171);
            rdoH1172 = (RadioButton) findViewById(R.id.rdoH1172);
            rdoH1173 = (RadioButton) findViewById(R.id.rdoH1173);
            secH118 = (LinearLayout) findViewById(R.id.secH118);
            VlblH118 = (TextView) findViewById(R.id.VlblH118);
            rdogrpH118 = (RadioGroup) findViewById(R.id.rdogrpH118);

            rdoH1181 = (RadioButton) findViewById(R.id.rdoH1181);
            rdoH1182 = (RadioButton) findViewById(R.id.rdoH1182);
            rdoH1183 = (RadioButton) findViewById(R.id.rdoH1183);
            rdoH1184 = (RadioButton) findViewById(R.id.rdoH1184);
            secH119 = (LinearLayout) findViewById(R.id.secH119);
            VlblH119 = (TextView) findViewById(R.id.VlblH119);
            rdogrpH119 = (RadioGroup) findViewById(R.id.rdogrpH119);

            rdoH1191 = (RadioButton) findViewById(R.id.rdoH1191);
            rdoH1192 = (RadioButton) findViewById(R.id.rdoH1192);
            rdoH1193 = (RadioButton) findViewById(R.id.rdoH1193);
            secH1110 = (LinearLayout) findViewById(R.id.secH1110);
            VlblH1110 = (TextView) findViewById(R.id.VlblH1110);
            txtH1110 = (EditText) findViewById(R.id.txtH1110);
            secH1111 = (LinearLayout) findViewById(R.id.secH1111);
            VlblH1111 = (TextView) findViewById(R.id.VlblH1111);
            txtH1111 = (EditText) findViewById(R.id.txtH1111);
            secH1112 = (LinearLayout) findViewById(R.id.secH1112);
            VlblH1112 = (TextView) findViewById(R.id.VlblH1112);
            rdogrpH1112 = (RadioGroup) findViewById(R.id.rdogrpH1112);

            rdoH11121 = (RadioButton) findViewById(R.id.rdoH11121);
            rdoH11122 = (RadioButton) findViewById(R.id.rdoH11122);
            rdoH11123 = (RadioButton) findViewById(R.id.rdoH11123);
            rdoH11124 = (RadioButton) findViewById(R.id.rdoH11124);
            secH1112X = (LinearLayout) findViewById(R.id.secH1112X);
            VlblH1112X = (TextView) findViewById(R.id.VlblH1112X);
            txtH1112X = (EditText) findViewById(R.id.txtH1112X);

            DataSearch(RND, SUCHANAID);

            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(Loan.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(Loan.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(Loan.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(Loan.this, "Required field: উপকারভোগী সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (!rdoH1111.isChecked() & !rdoH1112.isChecked() & secH111.isShown()) {
                Connection.MessageBox(Loan.this, "Select anyone options from (আপনি অথবা আপনার স্বামীর কোনো বকেয়া ঋণ আছে (পরিবাবের অন্যদের কথাও জিগ্যেস করুন)).");
                rdoH1111.requestFocus();
                return;
            } else if (txtH112.getText().toString().length() == 0 & secH112.isShown()) {
                Connection.MessageBox(Loan.this, "Required field: লোন নম্বর.");
                txtH112.requestFocus();
                return;
            } else if (Integer.valueOf(txtH112.getText().toString().length() == 0 ? "01" : txtH112.getText().toString()) < 01 || Integer.valueOf(txtH112.getText().toString().length() == 0 ? "99" : txtH112.getText().toString()) > 99) {
                Connection.MessageBox(Loan.this, "Value should be between 01 and 99(লোন নম্বর).");
                txtH112.requestFocus();
                return;
            } else if (spnH113.getSelectedItemPosition() == 0 & secH113.isShown()) {
                Connection.MessageBox(Loan.this, "Required field: কার কাছ থেকে.");
                spnH113.requestFocus();
                return;
            } else if (txtH113X.getText().toString().length() == 0 & secH113X.isShown()) {
                Connection.MessageBox(Loan.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH113X.requestFocus();
                return;
            } else if (spnH114.getSelectedItemPosition() == 0 & secH114.isShown()) {
                Connection.MessageBox(Loan.this, "Required field: লোনটি প্রধানত কি কাজের জন্য ব্যবহৃত হয়েছে.");
                spnH114.requestFocus();
                return;
            } else if (txtH114X.getText().toString().length() == 0 & secH114X.isShown()) {
                Connection.MessageBox(Loan.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH114X.requestFocus();
                return;
            } else if (!rdoH1151.isChecked() & !rdoH1152.isChecked() & !rdoH1153.isChecked() & secH115.isShown()) {
                Connection.MessageBox(Loan.this, "Select anyone options from (ক্যাশ কিনা).");
                rdoH1151.requestFocus();
                return;
            } else if (txtH116.getText().toString().length() == 0 & secH116.isShown()) {
                Connection.MessageBox(Loan.this, "Required field: লোনের পরিমাণ.");
                txtH116.requestFocus();
                return;
            } else if (Integer.valueOf(txtH116.getText().toString().length() == 0 ? "000000" : txtH116.getText().toString()) < 000000 || Integer.valueOf(txtH116.getText().toString().length() == 0 ? "999999" : txtH116.getText().toString()) > 999999) {
                Connection.MessageBox(Loan.this, "Value should be between 000000 and 999999(লোনের পরিমাণ).");
                txtH116.requestFocus();
                return;
            } else if (!rdoH1171.isChecked() & !rdoH1172.isChecked() & !rdoH1173.isChecked() & secH117.isShown()) {
                Connection.MessageBox(Loan.this, "Select anyone options from (কার লোন ).");
                rdoH1171.requestFocus();
                return;
            } else if (!rdoH1181.isChecked() & !rdoH1182.isChecked() & !rdoH1183.isChecked() & !rdoH1184.isChecked() & secH118.isShown()) {
                Connection.MessageBox(Loan.this, "Select anyone options from (আপনি ঋণ শোধ করছেন).");
                rdoH1181.requestFocus();
                return;
            } else if (!rdoH1191.isChecked() & !rdoH1192.isChecked() & !rdoH1193.isChecked() & secH119.isShown()) {
                Connection.MessageBox(Loan.this, "Select anyone options from (লোনের জন্য কোন সুধ দিতে হয় ).");
                rdoH1191.requestFocus();
                return;
            } else if (txtH1110.getText().toString().length() == 0 & secH1110.isShown()) {
                Connection.MessageBox(Loan.this, "Required field: কিস্তির সংখ্যা.");
                txtH1110.requestFocus();
                return;
            } else if (Integer.valueOf(txtH1110.getText().toString().length() == 0 ? "000" : txtH1110.getText().toString()) < 000 || Integer.valueOf(txtH1110.getText().toString().length() == 0 ? "999" : txtH1110.getText().toString()) > 999) {
                Connection.MessageBox(Loan.this, "Value should be between 000 and 999(কিস্তির সংখ্যা).");
                txtH1110.requestFocus();
                return;
            } else if (txtH1111.getText().toString().length() == 0 & secH1111.isShown()) {
                Connection.MessageBox(Loan.this, "Required field: প্রতিটি কিস্তির পরিমাণ.");
                txtH1111.requestFocus();
                return;
            } else if (Integer.valueOf(txtH1111.getText().toString().length() == 0 ? "00000" : txtH1111.getText().toString()) < 00000 || Integer.valueOf(txtH1111.getText().toString().length() == 0 ? "99999" : txtH1111.getText().toString()) > 99999) {
                Connection.MessageBox(Loan.this, "Value should be between 00000 and 99999(প্রতিটি কিস্তির পরিমাণ).");
                txtH1111.requestFocus();
                return;
            } else if (!rdoH11121.isChecked() & !rdoH11122.isChecked() & !rdoH11123.isChecked() & !rdoH11124.isChecked() & secH1112.isShown()) {
                Connection.MessageBox(Loan.this, "Select anyone options from (ঋণ যদি শোধ না করে থাকেন তাহলে কারণ কি).");
                rdoH11121.requestFocus();
                return;
            } else if (txtH1112X.getText().toString().length() == 0 & secH1112X.isShown()) {
                Connection.MessageBox(Loan.this, "Required field: অনান্য উল্লেখ করুন.");
                txtH1112X.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            Loan_DataModel objSave = new Loan_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            String[] d_rdogrpH111 = new String[]{"1", "0"};
            objSave.setH111("");
            for (int i = 0; i < rdogrpH111.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH111.getChildAt(i);
                if (rb.isChecked()) objSave.setH111(d_rdogrpH111[i]);
            }

            objSave.setH112(txtH112.getText().toString());
            objSave.setH113((spnH113.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH113.getSelectedItem().toString(), "-")));
            objSave.setH113X(txtH113X.getText().toString());
            objSave.setH114((spnH114.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH114.getSelectedItem().toString(), "-")));
            objSave.setH114X(txtH114X.getText().toString());
            String[] d_rdogrpH115 = new String[]{"1", "2", "9"};
            objSave.setH115("");
            for (int i = 0; i < rdogrpH115.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH115.getChildAt(i);
                if (rb.isChecked()) objSave.setH115(d_rdogrpH115[i]);
            }

            objSave.setH116(txtH116.getText().toString());
            String[] d_rdogrpH117 = new String[]{"1", "2", "9"};
            objSave.setH117("");
            for (int i = 0; i < rdogrpH117.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH117.getChildAt(i);
                if (rb.isChecked()) objSave.setH117(d_rdogrpH117[i]);
            }

            String[] d_rdogrpH118 = new String[]{"1", "2", "3", "9"};
            objSave.setH118("");
            for (int i = 0; i < rdogrpH118.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH118.getChildAt(i);
                if (rb.isChecked()) objSave.setH118(d_rdogrpH118[i]);
            }

            String[] d_rdogrpH119 = new String[]{"1", "0", "9"};
            objSave.setH119("");
            for (int i = 0; i < rdogrpH119.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH119.getChildAt(i);
                if (rb.isChecked()) objSave.setH119(d_rdogrpH119[i]);
            }

            objSave.setH1110(txtH1110.getText().toString());
            objSave.setH1111(txtH1111.getText().toString());
            String[] d_rdogrpH1112 = new String[]{"1", "2", "3", "9"};
            objSave.setH1112("");
            for (int i = 0; i < rdogrpH1112.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH1112.getChildAt(i);
                if (rb.isChecked()) objSave.setH1112(d_rdogrpH1112[i]);
            }

            objSave.setH1112X(txtH1112X.getText().toString());
            objSave.setStartTime(StartTime);
            objSave.setEndTime(g.CurrentTime24());
            objSave.setUserId(g.getUserId());
            objSave.setEntryUser(g.getUserId()); //from data entry user list
            //objSave.setLat(Double.toString(currentLatitude));
            //objSave.setLon(Double.toString(currentLongitude));

            String status = objSave.SaveUpdateData(this);
            if (status.length() == 0) {
                Connection.MessageBox(Loan.this, "Saved Successfully");
            } else {
                Connection.MessageBox(Loan.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(Loan.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            Loan_DataModel d = new Loan_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<Loan_DataModel> data = d.SelectAll(this, SQL);
            for (Loan_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                String[] d_rdogrpH111 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH111.length; i++) {
                    if (item.getH111().equals(String.valueOf(d_rdogrpH111[i]))) {
                        rb = (RadioButton) rdogrpH111.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH112.setText(item.getH112());
                spnH113.setSelection(Global.SpinnerItemPositionAnyLength(spnH113, item.getH113()));
                txtH113X.setText(item.getH113X());
                spnH114.setSelection(Global.SpinnerItemPositionAnyLength(spnH114, item.getH114()));
                txtH114X.setText(item.getH114X());
                String[] d_rdogrpH115 = new String[]{"1", "2", "9"};
                for (int i = 0; i < d_rdogrpH115.length; i++) {
                    if (item.getH115().equals(String.valueOf(d_rdogrpH115[i]))) {
                        rb = (RadioButton) rdogrpH115.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH116.setText(item.getH116());
                String[] d_rdogrpH117 = new String[]{"1", "2", "9"};
                for (int i = 0; i < d_rdogrpH117.length; i++) {
                    if (item.getH117().equals(String.valueOf(d_rdogrpH117[i]))) {
                        rb = (RadioButton) rdogrpH117.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH118 = new String[]{"1", "2", "3", "9"};
                for (int i = 0; i < d_rdogrpH118.length; i++) {
                    if (item.getH118().equals(String.valueOf(d_rdogrpH118[i]))) {
                        rb = (RadioButton) rdogrpH118.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH119 = new String[]{"1", "0", "9"};
                for (int i = 0; i < d_rdogrpH119.length; i++) {
                    if (item.getH119().equals(String.valueOf(d_rdogrpH119[i]))) {
                        rb = (RadioButton) rdogrpH119.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH1110.setText(item.getH1110());
                txtH1111.setText(item.getH1111());
                String[] d_rdogrpH1112 = new String[]{"1", "2", "3", "9"};
                for (int i = 0; i < d_rdogrpH1112.length; i++) {
                    if (item.getH1112().equals(String.valueOf(d_rdogrpH1112[i]))) {
                        rb = (RadioButton) rdogrpH1112.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH1112X.setText(item.getH1112X());
            }
        } catch (Exception e) {
            Connection.MessageBox(Loan.this, e.getMessage());
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