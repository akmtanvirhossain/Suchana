package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Savings" android:label="Savings" />

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

public class Savings extends Activity {
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
    LinearLayout secH101;
    TextView VlblH101;
    RadioGroup rdogrpH101;
    RadioButton rdoH1011;
    RadioButton rdoH1012;
    LinearLayout secH102;
    TextView VlblH102;
    RadioGroup rdogrpH102;
    RadioButton rdoH1021;
    RadioButton rdoH1022;
    LinearLayout secH103;
    TextView VlblH103;
    RadioGroup rdogrpH103;
    RadioButton rdoH1031;
    RadioButton rdoH1032;
    LinearLayout secH1031;
    TextView VlblH1031;
    EditText txtH1031;
    LinearLayout secH1032;
    TextView VlblH1032;
    EditText txtH1032;
    LinearLayout secH1033;
    TextView VlblH1033;
    EditText txtH1033;
    LinearLayout secH1034a;
    TextView VlblH1034a;
    EditText txtH1034a;
    LinearLayout secH1034b;
    TextView VlblH1034b;
    EditText txtH1034b;
    LinearLayout secH1034c;
    TextView VlblH1034c;
    EditText txtH1034c;
    LinearLayout secH1035a;
    TextView VlblH1035a;
    Spinner spnH1035a;
    LinearLayout secH1035b;
    TextView VlblH1035b;
    Spinner spnH1035b;
    LinearLayout secH1035c;
    TextView VlblH1035c;
    Spinner spnH1035c;
    LinearLayout secH1035X;
    TextView VlblH1035X;
    EditText txtH1035X;
    LinearLayout secH1036a;
    TextView VlblH1036a;
    Spinner spnH1036a;
    LinearLayout secH1036b;
    TextView VlblH1036b;
    Spinner spnH1036b;
    LinearLayout secH1036c;
    TextView VlblH1036c;
    Spinner spnH1036c;
    LinearLayout secH1036X;
    TextView VlblH1036X;
    EditText txtH1036X;
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
            setContentView(R.layout.savings);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TableName = "Savings";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Savings.this);
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
            secH101 = (LinearLayout) findViewById(R.id.secH101);
            VlblH101 = (TextView) findViewById(R.id.VlblH101);
            rdogrpH101 = (RadioGroup) findViewById(R.id.rdogrpH101);

            rdoH1011 = (RadioButton) findViewById(R.id.rdoH1011);
            rdoH1012 = (RadioButton) findViewById(R.id.rdoH1012);
            secH102 = (LinearLayout) findViewById(R.id.secH102);
            VlblH102 = (TextView) findViewById(R.id.VlblH102);
            rdogrpH102 = (RadioGroup) findViewById(R.id.rdogrpH102);

            rdoH1021 = (RadioButton) findViewById(R.id.rdoH1021);
            rdoH1022 = (RadioButton) findViewById(R.id.rdoH1022);
            secH103 = (LinearLayout) findViewById(R.id.secH103);
            VlblH103 = (TextView) findViewById(R.id.VlblH103);
            rdogrpH103 = (RadioGroup) findViewById(R.id.rdogrpH103);

            rdoH1031 = (RadioButton) findViewById(R.id.rdoH1031);
            rdoH1032 = (RadioButton) findViewById(R.id.rdoH1032);
            rdogrpH103.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH103 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH103.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH103.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH103[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH1031.setVisibility(View.GONE);
                        txtH1031.setText("");
                        secH1032.setVisibility(View.GONE);
                        txtH1032.setText("");
                        secH1033.setVisibility(View.GONE);
                        txtH1033.setText("");
                        secH1034a.setVisibility(View.GONE);
                        txtH1034a.setText("");
                        secH1034b.setVisibility(View.GONE);
                        txtH1034b.setText("");
                        secH1034c.setVisibility(View.GONE);
                        txtH1034c.setText("");
                        secH1035a.setVisibility(View.GONE);
                        spnH1035a.setSelection(0);
                        secH1035b.setVisibility(View.GONE);
                        spnH1035b.setSelection(0);
                        secH1035c.setVisibility(View.GONE);
                        spnH1035c.setSelection(0);
                        secH1035X.setVisibility(View.GONE);
                        txtH1035X.setText("");
                        secH1036a.setVisibility(View.GONE);
                        spnH1036a.setSelection(0);
                        secH1036b.setVisibility(View.GONE);
                        spnH1036b.setSelection(0);
                        secH1036c.setVisibility(View.GONE);
                        spnH1036c.setSelection(0);
                    } else {
                        secH1031.setVisibility(View.VISIBLE);
                        secH1032.setVisibility(View.VISIBLE);
                        secH1033.setVisibility(View.VISIBLE);
                        secH1034a.setVisibility(View.VISIBLE);
                        secH1034b.setVisibility(View.VISIBLE);
                        secH1034c.setVisibility(View.VISIBLE);
                        secH1035a.setVisibility(View.VISIBLE);
                        secH1035b.setVisibility(View.VISIBLE);
                        secH1035c.setVisibility(View.VISIBLE);
                        secH1035X.setVisibility(View.VISIBLE);
                        secH1036a.setVisibility(View.VISIBLE);
                        secH1036b.setVisibility(View.VISIBLE);
                        secH1036c.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH1031 = (LinearLayout) findViewById(R.id.secH1031);
            VlblH1031 = (TextView) findViewById(R.id.VlblH1031);
            txtH1031 = (EditText) findViewById(R.id.txtH1031);
            secH1032 = (LinearLayout) findViewById(R.id.secH1032);
            VlblH1032 = (TextView) findViewById(R.id.VlblH1032);
            txtH1032 = (EditText) findViewById(R.id.txtH1032);
            secH1033 = (LinearLayout) findViewById(R.id.secH1033);
            VlblH1033 = (TextView) findViewById(R.id.VlblH1033);
            txtH1033 = (EditText) findViewById(R.id.txtH1033);
            secH1034a = (LinearLayout) findViewById(R.id.secH1034a);
            VlblH1034a = (TextView) findViewById(R.id.VlblH1034a);
            txtH1034a = (EditText) findViewById(R.id.txtH1034a);
            secH1034b = (LinearLayout) findViewById(R.id.secH1034b);
            VlblH1034b = (TextView) findViewById(R.id.VlblH1034b);
            txtH1034b = (EditText) findViewById(R.id.txtH1034b);
            secH1034c = (LinearLayout) findViewById(R.id.secH1034c);
            VlblH1034c = (TextView) findViewById(R.id.VlblH1034c);
            txtH1034c = (EditText) findViewById(R.id.txtH1034c);
            secH1035a = (LinearLayout) findViewById(R.id.secH1035a);
            VlblH1035a = (TextView) findViewById(R.id.VlblH1035a);
            spnH1035a = (Spinner) findViewById(R.id.spnH1035a);
            List<String> listH1035a = new ArrayList<String>();

            listH1035a.add("");
            listH1035a.add("1-খানার পণ্য কেনার জন্য");
            listH1035a.add("2-কৃষি উৎপাদনশীল সম্পদ কিনতে");
            listH1035a.add("3-অন্যান্য উৎপাদনশীল সম্পদ কিনতে");
            listH1035a.add("4-কোন ব্যবসা শুরু করতে/চালাতে");
            listH1035a.add("5-জমি বাড়ী কিনতে");
            listH1035a.add("6-শিক্ষা প্রশিক্ষণ জন্য");
            listH1035a.add("7-বিয়ে যৌতুকের জন্য");
            listH1035a.add("8-ঘর মেরামত/তৈরী করতে");
            listH1035a.add("9-ঋণ পেতে");
            listH1035a.add("10-অন্য কাউকে ধার দিতে");
            listH1035a.add("11-কঠিন সময়ের বিপদের জন্য");
            listH1035a.add("12-কাজের জন্য কেউকে বিদেশে পাঠাত");
            listH1035a.add("13-ছেলেমেয়েদের ভবিষ্যত জন্য");
            listH1035a.add("14-মেডিকেল বা অন্য জরুরী সময়ের জন্য");
            listH1035a.add("15-জানিনা কোনো বিশেষ কারণে নয়");
            listH1035a.add("16-অনান্য");
            listH1035a.add("99-N/A");
            ArrayAdapter<String> adptrH1035a = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH1035a);
            spnH1035a.setAdapter(adptrH1035a);

            secH1035b = (LinearLayout) findViewById(R.id.secH1035b);
            VlblH1035b = (TextView) findViewById(R.id.VlblH1035b);
            spnH1035b = (Spinner) findViewById(R.id.spnH1035b);
            List<String> listH1035b = new ArrayList<String>();

            listH1035b.add("");
            listH1035b.add("1-খানার পণ্য কেনার জন্য");
            listH1035b.add("2-কৃষি উৎপাদনশীল সম্পদ কিনতে");
            listH1035b.add("3-অন্যান্য উৎপাদনশীল সম্পদ কিনতে");
            listH1035b.add("4-কোন ব্যবসা শুরু করতে/চালাতে");
            listH1035b.add("5-জমি বাড়ী কিনতে");
            listH1035b.add("6-শিক্ষা প্রশিক্ষণ জন্য");
            listH1035b.add("7-বিয়ে যৌতুকের জন্য");
            listH1035b.add("8-ঘর মেরামত/তৈরী করতে");
            listH1035b.add("9-ঋণ পেতে");
            listH1035b.add("10-অন্য কাউকে ধার দিতে");
            listH1035b.add("11-কঠিন সময়ের বিপদের জন্য");
            listH1035b.add("12-কাজের জন্য কেউকে বিদেশে পাঠাত");
            listH1035b.add("13-ছেলেমেয়েদের ভবিষ্যত জন্য");
            listH1035b.add("14-মেডিকেল বা অন্য জরুরী সময়ের জন্য");
            listH1035b.add("15-জানিনা কোনো বিশেষ কারণে নয়");
            listH1035b.add("16-অনান্য");
            listH1035b.add("99-N/A");
            ArrayAdapter<String> adptrH1035b = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH1035b);
            spnH1035b.setAdapter(adptrH1035b);

            secH1035c = (LinearLayout) findViewById(R.id.secH1035c);
            VlblH1035c = (TextView) findViewById(R.id.VlblH1035c);
            spnH1035c = (Spinner) findViewById(R.id.spnH1035c);
            List<String> listH1035c = new ArrayList<String>();

            listH1035c.add("");
            listH1035c.add("1-খানার পণ্য কেনার জন্য");
            listH1035c.add("2-কৃষি উৎপাদনশীল সম্পদ কিনতে");
            listH1035c.add("3-অন্যান্য উৎপাদনশীল সম্পদ কিনতে");
            listH1035c.add("4-কোন ব্যবসা শুরু করতে/চালাতে");
            listH1035c.add("5-জমি বাড়ী কিনতে");
            listH1035c.add("6-শিক্ষা প্রশিক্ষণ জন্য");
            listH1035c.add("7-বিয়ে যৌতুকের জন্য");
            listH1035c.add("8-ঘর মেরামত/তৈরী করতে");
            listH1035c.add("9-ঋণ পেতে");
            listH1035c.add("10-অন্য কাউকে ধার দিতে");
            listH1035c.add("11-কঠিন সময়ের বিপদের জন্য");
            listH1035c.add("12-কাজের জন্য কেউকে বিদেশে পাঠাত");
            listH1035c.add("13-ছেলেমেয়েদের ভবিষ্যত জন্য");
            listH1035c.add("14-মেডিকেল বা অন্য জরুরী সময়ের জন্য");
            listH1035c.add("15-জানিনা কোনো বিশেষ কারণে নয়");
            listH1035c.add("16-অনান্য");
            listH1035c.add("99-N/A");
            ArrayAdapter<String> adptrH1035c = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH1035c);
            spnH1035c.setAdapter(adptrH1035c);

            secH1035X = (LinearLayout) findViewById(R.id.secH1035X);
            VlblH1035X = (TextView) findViewById(R.id.VlblH1035X);
            txtH1035X = (EditText) findViewById(R.id.txtH1035X);
            secH1036a = (LinearLayout) findViewById(R.id.secH1036a);
            VlblH1036a = (TextView) findViewById(R.id.VlblH1036a);
            spnH1036a = (Spinner) findViewById(R.id.spnH1036a);
            List<String> listH1036a = new ArrayList<String>();

            listH1036a.add("");
            listH1036a.add("1-গ্রামীণ");
            listH1036a.add("2-আশা");
            listH1036a.add("3-সি এন আর এস");
            listH1036a.add("4-আরডিআরএস");
            listH1036a.add("5-প্রশিখা");
            listH1036a.add("7-পদক্ষেপ");
            listH1036a.add("8-স্বনির্ভর");
            listH1036a.add("9-এফআইভিডিবি");
            listH1036a.add("10-টিএমএসএস ");
            listH1036a.add("11-ব্রাক");
            listH1036a.add("12-অনান্য ");
            listH1036a.add("99-NA");
            ArrayAdapter<String> adptrH1036a = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH1036a);
            spnH1036a.setAdapter(adptrH1036a);

            secH1036b = (LinearLayout) findViewById(R.id.secH1036b);
            VlblH1036b = (TextView) findViewById(R.id.VlblH1036b);
            spnH1036b = (Spinner) findViewById(R.id.spnH1036b);
            List<String> listH1036b = new ArrayList<String>();

            listH1036b.add("");
            listH1036b.add("1-গ্রামীণ");
            listH1036b.add("2-আশা");
            listH1036b.add("3-সি এন আর এস");
            listH1036b.add("4-আরডিআরএস");
            listH1036b.add("5-প্রশিখা");
            listH1036b.add("7-পদক্ষেপ");
            listH1036b.add("8-স্বনির্ভর");
            listH1036b.add("9-এফআইভিডিবি");
            listH1036b.add("10-টিএমএসএস ");
            listH1036b.add("11-ব্রাক");
            listH1036b.add("12-অনান্য ");
            listH1036b.add("99-NA");
            ArrayAdapter<String> adptrH1036b = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH1036b);
            spnH1036b.setAdapter(adptrH1036b);

            secH1036c = (LinearLayout) findViewById(R.id.secH1036c);
            VlblH1036c = (TextView) findViewById(R.id.VlblH1036c);
            spnH1036c = (Spinner) findViewById(R.id.spnH1036c);
            List<String> listH1036c = new ArrayList<String>();

            listH1036c.add("");
            listH1036c.add("1-গ্রামীণ");
            listH1036c.add("2-আশা");
            listH1036c.add("3-সি এন আর এস");
            listH1036c.add("4-আরডিআরএস");
            listH1036c.add("5-প্রশিখা");
            listH1036c.add("7-পদক্ষেপ");
            listH1036c.add("8-স্বনির্ভর");
            listH1036c.add("9-এফআইভিডিবি");
            listH1036c.add("10-টিএমএসএস ");
            listH1036c.add("11-ব্রাক");
            listH1036c.add("12-অনান্য ");
            listH1036c.add("99-NA");
            ArrayAdapter<String> adptrH1036c = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH1036c);
            spnH1036c.setAdapter(adptrH1036c);

            secH1036X = (LinearLayout) findViewById(R.id.secH1036X);
            VlblH1036X = (TextView) findViewById(R.id.VlblH1036X);
            txtH1036X = (EditText) findViewById(R.id.txtH1036X);


            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(Savings.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(Savings.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: উপকারভোগী সদস্য আইডি সুচনা নম্বর অনুসারে.");
                txtSuchanaID.requestFocus();
                return;
            } else if (!rdoH1011.isChecked() & !rdoH1012.isChecked() & secH101.isShown()) {
                Connection.MessageBox(Savings.this, "Select anyone options from (আপনি  বা আপনার স্ত্রী বা পরিবারেরঅন্যান্যসদস্য কি কোন সমব্যয় সমিতি  বা এলাকার সঞ্চয়ীকমিটিরসদস্য  সুচনা বহির্ভূত ).");
                rdoH1011.requestFocus();
                return;
            } else if (!rdoH1021.isChecked() & !rdoH1022.isChecked() & secH102.isShown()) {
                Connection.MessageBox(Savings.this, "Select anyone options from (আপনি কি সুচনা সঞ্চয়ী গ্রুপের সদস্য	 ).");
                rdoH1021.requestFocus();
                return;
            } else if (!rdoH1031.isChecked() & !rdoH1032.isChecked() & secH103.isShown()) {
                Connection.MessageBox(Savings.this, "Select anyone options from (আপনার এবং / অথবা আপনার স্ত্রী কোন সঞ্চয় আছে).");
                rdoH1031.requestFocus();
                return;
            } else if (txtH1031.getText().toString().length() == 0 & secH1031.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: ঘরে সঞ্চয়.");
                txtH1031.requestFocus();
                return;
            } else if (Integer.valueOf(txtH1031.getText().toString().length() == 0 ? "000000" : txtH1031.getText().toString()) < 000000 || Integer.valueOf(txtH1031.getText().toString().length() == 0 ? "999999" : txtH1031.getText().toString()) > 999999) {
                Connection.MessageBox(Savings.this, "Value should be between 000000 and 999999(ঘরে সঞ্চয়).");
                txtH1031.requestFocus();
                return;
            } else if (txtH1032.getText().toString().length() == 0 & secH1032.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: মাটির ব্যাঙ্ক সিন্দুকে সঞ্চয়.");
                txtH1032.requestFocus();
                return;
            } else if (Integer.valueOf(txtH1032.getText().toString().length() == 0 ? "000000" : txtH1032.getText().toString()) < 000000 || Integer.valueOf(txtH1032.getText().toString().length() == 0 ? "999999" : txtH1032.getText().toString()) > 999999) {
                Connection.MessageBox(Savings.this, "Value should be between 000000 and 999999(মাটির ব্যাঙ্ক সিন্দুকে সঞ্চয়).");
                txtH1032.requestFocus();
                return;
            } else if (txtH1033.getText().toString().length() == 0 & secH1033.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: ব্যাংক  পোস্ট অফিস.");
                txtH1033.requestFocus();
                return;
            } else if (Integer.valueOf(txtH1033.getText().toString().length() == 0 ? "000000" : txtH1033.getText().toString()) < 000000 || Integer.valueOf(txtH1033.getText().toString().length() == 0 ? "999999" : txtH1033.getText().toString()) > 999999) {
                Connection.MessageBox(Savings.this, "Value should be between 000000 and 999999(ব্যাংক  পোস্ট অফিস).");
                txtH1033.requestFocus();
                return;
            } else if (txtH1034a.getText().toString().length() == 0 & secH1034a.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: অন্যান্য এনজিও.");
                txtH1034a.requestFocus();
                return;
            } else if (Integer.valueOf(txtH1034a.getText().toString().length() == 0 ? "000000" : txtH1034a.getText().toString()) < 000000 || Integer.valueOf(txtH1034a.getText().toString().length() == 0 ? "999999" : txtH1034a.getText().toString()) > 999999) {
                Connection.MessageBox(Savings.this, "Value should be between 000000 and 999999(অন্যান্য এনজিও).");
                txtH1034a.requestFocus();
                return;
            } else if (txtH1034b.getText().toString().length() == 0 & secH1034b.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: ক্ষুদ্রঋণ দানকারী প্রতিষ্ঠান.");
                txtH1034b.requestFocus();
                return;
            } else if (Integer.valueOf(txtH1034b.getText().toString().length() == 0 ? "000000" : txtH1034b.getText().toString()) < 000000 || Integer.valueOf(txtH1034b.getText().toString().length() == 0 ? "999999" : txtH1034b.getText().toString()) > 999999) {
                Connection.MessageBox(Savings.this, "Value should be between 000000 and 999999(ক্ষুদ্রঋণ দানকারী প্রতিষ্ঠান).");
                txtH1034b.requestFocus();
                return;
            } else if (txtH1034c.getText().toString().length() == 0 & secH1034c.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: সুচনা সঞ্চয়ী গ্রুপ.");
                txtH1034c.requestFocus();
                return;
            } else if (Integer.valueOf(txtH1034c.getText().toString().length() == 0 ? "000000" : txtH1034c.getText().toString()) < 000000 || Integer.valueOf(txtH1034c.getText().toString().length() == 0 ? "999999" : txtH1034c.getText().toString()) > 999999) {
                Connection.MessageBox(Savings.this, "Value should be between 000000 and 999999(সুচনা সঞ্চয়ী গ্রুপ).");
                txtH1034c.requestFocus();
                return;
            } else if (spnH1035a.getSelectedItemPosition() == 0 & secH1035a.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: 1. কিসের জন্য সঞ্চয় করছেন.");
                spnH1035a.requestFocus();
                return;
            } else if (spnH1035b.getSelectedItemPosition() == 0 & secH1035b.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: 2.কিসের জন্য সঞ্চয় করছেন.");
                spnH1035b.requestFocus();
                return;
            } else if (spnH1035c.getSelectedItemPosition() == 0 & secH1035c.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: 3. কিসের জন্য সঞ্চয় করছেন.");
                spnH1035c.requestFocus();
                return;
            } else if (txtH1035X.getText().toString().length() == 0 & secH1035X.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: উল্লেখ করুন.");
                txtH1035X.requestFocus();
                return;
            } else if (spnH1036a.getSelectedItemPosition() == 0 & secH1036a.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: 1. অন্য কোন এনজিও তে সঞ্চয় থাকলে তার নাম লিখুন.");
                spnH1036a.requestFocus();
                return;
            } else if (spnH1036b.getSelectedItemPosition() == 0 & secH1036b.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: 2. অন্য কোন এনজিও তে সঞ্চয় থাকলে তার নাম লিখুন.");
                spnH1036b.requestFocus();
                return;
            } else if (spnH1036c.getSelectedItemPosition() == 0 & secH1036c.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: 3. অন্য কোন এনজিও তে সঞ্চয় থাকলে তার নাম লিখুন.");
                spnH1036c.requestFocus();
                return;
            } else if (txtH1036X.getText().toString().length() == 0 & secH1036X.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: উল্লেখ করুন.");
                txtH1036X.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            Savings_DataModel objSave = new Savings_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            String[] d_rdogrpH101 = new String[]{"1", "0"};
            objSave.setH101("");
            for (int i = 0; i < rdogrpH101.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH101.getChildAt(i);
                if (rb.isChecked()) objSave.setH101(d_rdogrpH101[i]);
            }

            String[] d_rdogrpH102 = new String[]{"1", "0"};
            objSave.setH102("");
            for (int i = 0; i < rdogrpH102.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH102.getChildAt(i);
                if (rb.isChecked()) objSave.setH102(d_rdogrpH102[i]);
            }

            String[] d_rdogrpH103 = new String[]{"1", "0"};
            objSave.setH103("");
            for (int i = 0; i < rdogrpH103.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH103.getChildAt(i);
                if (rb.isChecked()) objSave.setH103(d_rdogrpH103[i]);
            }

            objSave.setH1031(txtH1031.getText().toString());
            objSave.setH1032(txtH1032.getText().toString());
            objSave.setH1033(txtH1033.getText().toString());
            objSave.setH1034a(txtH1034a.getText().toString());
            objSave.setH1034b(txtH1034b.getText().toString());
            objSave.setH1034c(txtH1034c.getText().toString());
            objSave.setH1035a((spnH1035a.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH1035a.getSelectedItem().toString(), "-")));
            objSave.setH1035b((spnH1035b.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH1035b.getSelectedItem().toString(), "-")));
            objSave.setH1035c((spnH1035c.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH1035c.getSelectedItem().toString(), "-")));
            objSave.setH1035X(txtH1035X.getText().toString());
            objSave.setH1036a((spnH1036a.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH1036a.getSelectedItem().toString(), "-")));
            objSave.setH1036b((spnH1036b.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH1036b.getSelectedItem().toString(), "-")));
            objSave.setH1036c((spnH1036c.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH1036c.getSelectedItem().toString(), "-")));
            objSave.setH1036X(txtH1036X.getText().toString());
            objSave.setStartTime(StartTime);
            objSave.setEndTime(g.CurrentTime24());
            objSave.setUserId(g.getUserId());
            objSave.setEntryUser(g.getUserId()); //from data entry user list
            //objSave.setLat(Double.toString(currentLatitude));
            //objSave.setLon(Double.toString(currentLongitude));

            String status = objSave.SaveUpdateData(this);
            if (status.length() == 0) {
                Connection.MessageBox(Savings.this, "Saved Successfully");
            } else {
                Connection.MessageBox(Savings.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(Savings.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            Savings_DataModel d = new Savings_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<Savings_DataModel> data = d.SelectAll(this, SQL);
            for (Savings_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                String[] d_rdogrpH101 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH101.length; i++) {
                    if (item.getH101().equals(String.valueOf(d_rdogrpH101[i]))) {
                        rb = (RadioButton) rdogrpH101.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH102 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH102.length; i++) {
                    if (item.getH102().equals(String.valueOf(d_rdogrpH102[i]))) {
                        rb = (RadioButton) rdogrpH102.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH103 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH103.length; i++) {
                    if (item.getH103().equals(String.valueOf(d_rdogrpH103[i]))) {
                        rb = (RadioButton) rdogrpH103.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH1031.setText(item.getH1031());
                txtH1032.setText(item.getH1032());
                txtH1033.setText(item.getH1033());
                txtH1034a.setText(item.getH1034a());
                txtH1034b.setText(item.getH1034b());
                txtH1034c.setText(item.getH1034c());
                spnH1035a.setSelection(Global.SpinnerItemPositionAnyLength(spnH1035a, item.getH1035a()));
                spnH1035b.setSelection(Global.SpinnerItemPositionAnyLength(spnH1035b, item.getH1035b()));
                spnH1035c.setSelection(Global.SpinnerItemPositionAnyLength(spnH1035c, item.getH1035c()));
                txtH1035X.setText(item.getH1035X());
                spnH1036a.setSelection(Global.SpinnerItemPositionAnyLength(spnH1036a, item.getH1036a()));
                spnH1036b.setSelection(Global.SpinnerItemPositionAnyLength(spnH1036b, item.getH1036b()));
                spnH1036c.setSelection(Global.SpinnerItemPositionAnyLength(spnH1036c, item.getH1036c()));
                txtH1036X.setText(item.getH1036X());
            }
        } catch (Exception e) {
            Connection.MessageBox(Savings.this, e.getMessage());
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