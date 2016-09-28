package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".HDDS" android:label="HDDS" />

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
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
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Common.Connection;
import Common.Global;

public class HDDS extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    static String H7 = "";
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
    LinearLayout seclblH7;
    LinearLayout seclblH71;
    LinearLayout secH7;
    View lineH7;
    TextView VlblH7;
    Spinner spnH7;
    LinearLayout secH7a;
    View lineH7a;
    TextView VlblH7a;
    RadioGroup rdogrpH7a;
    RadioButton rdoH7a1;
    RadioButton rdoH7a2;
    LinearLayout secH7b1;
    View lineH7b1;
    TextView VlblH7b1;
    CheckBox chkH7b1;
    LinearLayout secH7b2;
    View lineH7b2;
    TextView VlblH7b2;
    CheckBox chkH7b2;
    LinearLayout secH7b3;
    View lineH7b3;
    TextView VlblH7b3;
    CheckBox chkH7b3;
    LinearLayout secH7b4;
    View lineH7b4;
    TextView VlblH7b4;
    CheckBox chkH7b4;
    LinearLayout secH7c;
    View lineH7c;
    TextView VlblH7c;
    RadioGroup rdogrpH7c;
    RadioButton rdoH7c1;
    RadioButton rdoH7c2;
    String StartTime;
    Bundle IDbundle;
    Button buttonAssetType01;
    Button buttonAssetType02;
    Button buttonAssetType03;
    Button buttonAssetType04;
    Button buttonAssetType05;
    Button buttonAssetType06;
    Button buttonAssetType07;
    Button buttonAssetType08;
    Button buttonAssetType09;
    Button buttonAssetType10;
    Button buttonAssetType11;
    Button buttonAssetType12;
    Button buttonAssetType13;
    Button buttonAssetType14;
    Button buttonAssetType15;
    Button buttonAssetType16;
    Button buttonAssetType17;
    Button buttonAssetType18;
    Button buttonAssetType19;
    Button buttonAssetType20;
    Button cmdSave;
    private int hour;
    private int minute;
    private int mDay;
    private int mMonth;
    private int mYear;
    private boolean allItemsCompleted = false;
    private View pressedButton;
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
            setContentView(R.layout.hdds);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");
            //  H7 = IDbundle.getString("H7");

            TableName = "HDDS";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Bundle IDBundle = new Bundle();
                    IDBundle.putString("Rnd", txtRnd.getText().toString());
                    IDBundle.putString("SuchanaID", txtSuchanaID.getText().toString());

                    startActivity(new Intent(HDDS.this, Land.class).putExtras(IDBundle));
                }
            });
            ImageButton cmdForward = (ImageButton) findViewById(R.id.cmdForward);
            cmdForward.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                    if (allItemsCompleted) {
                        Bundle IDBundle = new Bundle();
                        IDBundle.putString("Rnd", txtRnd.getText().toString());
                        IDBundle.putString("SuchanaID", txtSuchanaID.getText().toString());
                        //  IDBundle.putString("H41a", "");
                        startActivity(new Intent(HDDS.this, HDDS.class).putExtras(IDBundle));
                    }
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


            seclblH7 = (LinearLayout) findViewById(R.id.seclblH7);
            seclblH71 = (LinearLayout) findViewById(R.id.seclblH71);

            buttonAssetType01 = (Button) findViewById(R.id.buttonAssetType01);
            buttonAssetType02 = (Button) findViewById(R.id.buttonAssetType02);
            buttonAssetType03 = (Button) findViewById(R.id.buttonAssetType03);
            buttonAssetType04 = (Button) findViewById(R.id.buttonAssetType04);
            buttonAssetType05 = (Button) findViewById(R.id.buttonAssetType05);
            buttonAssetType06 = (Button) findViewById(R.id.buttonAssetType06);
            buttonAssetType07 = (Button) findViewById(R.id.buttonAssetType07);
            buttonAssetType08 = (Button) findViewById(R.id.buttonAssetType08);
            buttonAssetType09 = (Button) findViewById(R.id.buttonAssetType09);
            buttonAssetType10 = (Button) findViewById(R.id.buttonAssetType10);
            buttonAssetType11 = (Button) findViewById(R.id.buttonAssetType11);
            buttonAssetType12 = (Button) findViewById(R.id.buttonAssetType12);
            buttonAssetType13 = (Button) findViewById(R.id.buttonAssetType13);
            buttonAssetType14 = (Button) findViewById(R.id.buttonAssetType14);
            buttonAssetType15 = (Button) findViewById(R.id.buttonAssetType15);
            buttonAssetType16 = (Button) findViewById(R.id.buttonAssetType16);
            buttonAssetType17 = (Button) findViewById(R.id.buttonAssetType17);
            buttonAssetType18 = (Button) findViewById(R.id.buttonAssetType18);
            buttonAssetType19 = (Button) findViewById(R.id.buttonAssetType19);
            buttonAssetType20 = (Button) findViewById(R.id.buttonAssetType20);
            buttonColor();

            buttonAssetType01.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    spnH7.setSelection(Integer.valueOf((((Button) v).getText().toString())));


                }
            });
            buttonAssetType02.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH7.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType03.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH7.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType04.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH7.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType05.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH7.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType06.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH7.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType07.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH7.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType08.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH7.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType09.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH7.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH7.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH7.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH7.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH7.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH7.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH7.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH7.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH7.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH7.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH7.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH7.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            
            secH7 = (LinearLayout) findViewById(R.id.secH7);
            lineH7 = (View) findViewById(R.id.lineH7);
            VlblH7 = (TextView) findViewById(R.id.VlblH7);
            spnH7 = (Spinner) findViewById(R.id.spnH7);
            List<String> listH7 = new ArrayList<String>();

            listH7.add("");
            listH7.add("01-শ্বেতসার/সিরিয়াল");
            listH7.add("02-সাদা শেকড় বা কন্দ");
            listH7.add("03-ভিটামিন এ সমৃদ্ধ সবজি ও কন্দ");
            listH7.add("04-গাঢ় সবুজ শাক শাক সবজি");
            listH7.add("05-অন্যান্য সবজি");
            listH7.add("06-ভিটামিন এ সমৃদ্ধ ফল");
            listH7.add("07-অন্য ফল");
            listH7.add("08-অঙ্গ জাতীয় মাংশ");
            listH7.add("09-প্রাণী দেহের মাংস");
            listH7.add("10-ডিম");
            listH7.add("11-তাজা ছোট মাছ");
            listH7.add("12-তাজা মাঝারি ও বৃহৎ মাছ");
            listH7.add("13-শুঁটকি মাছ");
            listH7.add("14-খোলশওয়ালা মাছ (যেমন কাকড়া)");
            listH7.add("15-শিম জাতীয়, বাদাম এবং বীজ");
            listH7.add("16-দুধ এবং দুগ্ধজাত খাদ্য");
            listH7.add("17-তেল এবং চর্বি");
            listH7.add("18-মিষ্টান্ন্য");
            listH7.add("19-মশলা, আচার/সস জাতিও খাবার");
            listH7.add("20-বিবিধ (পানীয়)");

            List<String> listH7L = new ArrayList<String>();

            listH7L.add("01-ভুট্টা,চাল,গম বা এই সব শস্য দ্বারা অন্য কোন খাবার তৈরী হয়েছে (যেমন:রুটি,নুডলস,সুজি বা অন্যান্য শস্য পণ্য)");
            listH7L.add("02-সাদা আলু, সাদা মিষ্টি আলু, বা অন্য শিকড় থেকে তৈরি খাবার");
            listH7L.add("03-কুমড়া,গাজর বা মিষ্টি আলু যার রং ভিতরে কমলা ও স্থানীয় ভিটামিন এ সমৃদ্ধ শাক সবজি");
            listH7L.add("04-গাঢ় সবুজ শাক শাক সবজি ও স্থানীয় ভাবে পাওয়া ভিটামিন এ সমৃদ্ধ শাক যেমন পালং শাক");
            listH7L.add("05-অন্যান্য সবজি যেমন টমেটো,পেঁয়াজ,বেগুন) ও স্থানীয় ভাবে পাওয়া অন্যান্য সহজ লভ্য শাকসবজি");
            listH7L.add("06-পাকা আম, পাকা পেঁপে এবং তাদের 100% ফলের রস + অন্যান্য স্থানীয় ভাবে পাওয়া ভিটামিন এ সমৃদ্ধ ফল");
            listH7L.add("07-বন্য ফলসহ অনান্য ফল এবং তাদের 100% ফলের রস");
            listH7L.add("08-কলিজা, কিডনি এবং অন্যান্য অঙ্গের মাংস");
            listH7L.add("09-গরুর মাংস,ভেড়ার মাংস,ছাগল,খরগোশ,খেলা,মুরগি,হাঁস,অন্যান্য পাখির মাংস");
            listH7L.add("10-মুরগি,হাঁস,কোয়েল ডিম বা অন্য কোন ডিম");
            listH7L.add("11-তাজা ছোট মাছ");
            listH7L.add("12-তাজা মাঝারি ও বৃহৎ মাছ");
            listH7L.add("13-শুঁটকি মাছ");
            listH7L.add("14-খোলশওয়ালা মাছ (যেমন কাকড়া)");
            listH7L.add("15-প্যাকেটজাত শুকনো মটর শুটি ও শুকনো ডাল,গম,মসুরি,বাদাম,বীজ বা এই থেকে তৈরি খাবার (যেমন চীন বাদাম ও বাদামের মাখন)");
            listH7L.add("16-দুধ,পনির,দই বা অন্যান্য দুগ্ধজাত খাবার");
            listH7L.add("17-খাবারে যোগ করা বা রান্নার জন্য তেল, চর্বি বা মাখন খাদ্য যোগ");
            listH7L.add("18-চিনি,মধু,মিষ্টি যুক্ত সোডা বা মিষ্টি যুক্ত রসের পানীয় বা চিনি যুক্ত খাবার যেমন চকলেট,ক্যান্ডি,কুকিজ এবং কেক");
            listH7L.add("19-মশলা,কালো মরিচ,আচার/সস জাতীয় খাবার যেমন সয়া সস");
            listH7L.add("20-চা,বোতল জাত জুস,কোল্ড ড্রিংস,কফি ");
            
            
            ArrayAdapter<String> adptrH7 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH7);
            spnH7.setAdapter(adptrH7);
            spnH7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH7.getSelectedItem().toString().length() == 0) return;

                    String spnData = Connection.SelectedSpinnerValue(spnH7.getSelectedItem().toString(), "-");
                    DataSearchPartial(txtRnd.getText().toString(), txtSuchanaID.getText().toString(), spnData);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });

            spnH7.setClickable(false);
            spnH7.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    if (event.getAction() == MotionEvent.ACTION_UP) {
                        // Toast.makeText(SpinnerActivity.this, "Catch it!", Toast.LENGTH_SHORT).show();
                    }
                    return true;
                }
            });
            secH7a = (LinearLayout) findViewById(R.id.secH7a);
            lineH7a = (View) findViewById(R.id.lineH7a);
            VlblH7a = (TextView) findViewById(R.id.VlblH7a);
            rdogrpH7a = (RadioGroup) findViewById(R.id.rdogrpH7a);

            rdoH7a1 = (RadioButton) findViewById(R.id.rdoH7a1);
            rdoH7a2 = (RadioButton) findViewById(R.id.rdoH7a2);
            rdogrpH7a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH7a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH7a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH7a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH7a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH7b1.setVisibility(View.GONE);
                        lineH7b1.setVisibility(View.GONE);
                        chkH7b1.setChecked(false);
                        secH7b2.setVisibility(View.GONE);
                        lineH7b2.setVisibility(View.GONE);
                        chkH7b2.setChecked(false);
                        secH7b3.setVisibility(View.GONE);
                        lineH7b3.setVisibility(View.GONE);
                        chkH7b3.setChecked(false);
                        secH7b4.setVisibility(View.GONE);
                        lineH7b4.setVisibility(View.GONE);
                        chkH7b4.setChecked(false);

                    } else {
                        secH7b1.setVisibility(View.VISIBLE);
                        lineH7b1.setVisibility(View.VISIBLE);
                        secH7b2.setVisibility(View.VISIBLE);
                        lineH7b2.setVisibility(View.VISIBLE);
                        secH7b3.setVisibility(View.VISIBLE);
                        lineH7b3.setVisibility(View.VISIBLE);
                        secH7b4.setVisibility(View.VISIBLE);
                        lineH7b4.setVisibility(View.VISIBLE);

                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH7b1 = (LinearLayout) findViewById(R.id.secH7b1);
            lineH7b1 = (View) findViewById(R.id.lineH7b1);
            VlblH7b1 = (TextView) findViewById(R.id.VlblH7b1);
            chkH7b1 = (CheckBox) findViewById(R.id.chkH7b1);
            secH7b2 = (LinearLayout) findViewById(R.id.secH7b2);
            lineH7b2 = (View) findViewById(R.id.lineH7b2);
            VlblH7b2 = (TextView) findViewById(R.id.VlblH7b2);
            chkH7b2 = (CheckBox) findViewById(R.id.chkH7b2);
            secH7b3 = (LinearLayout) findViewById(R.id.secH7b3);
            lineH7b3 = (View) findViewById(R.id.lineH7b3);
            VlblH7b3 = (TextView) findViewById(R.id.VlblH7b3);
            chkH7b3 = (CheckBox) findViewById(R.id.chkH7b3);
            secH7b4 = (LinearLayout) findViewById(R.id.secH7b4);
            lineH7b4 = (View) findViewById(R.id.lineH7b4);
            VlblH7b4 = (TextView) findViewById(R.id.VlblH7b4);
            chkH7b4 = (CheckBox) findViewById(R.id.chkH7b4);
            secH7c = (LinearLayout) findViewById(R.id.secH7c);
            lineH7c = (View) findViewById(R.id.lineH7c);
            VlblH7c = (TextView) findViewById(R.id.VlblH7c);
            rdogrpH7c = (RadioGroup) findViewById(R.id.rdogrpH7c);

            rdoH7c1 = (RadioButton) findViewById(R.id.rdoH7c1);
            rdoH7c2 = (RadioButton) findViewById(R.id.rdoH7c2);

            DataSearch(RND, SUCHANAID, H7);

            cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {

            throw e;
            // Connection.MessageBox(HDDS.this, e.getMessage());
            //return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(HDDS.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(HDDS.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() != 12 & secSuchanaID.isShown()) {
                Connection.MessageBox(HDDS.this, "Required field: উপকারভোগী/সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (spnH7.getSelectedItemPosition() == 0 & secH7.isShown()) {
                Connection.MessageBox(HDDS.this, "Required field: খাদ্য গ্রুপ.");
                spnH7.requestFocus();
                return;
            } else if (!rdoH7a1.isChecked() & !rdoH7a2.isChecked() & secH7a.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (গত ২৪ ঘন্টায় খেয়েছেন).");
                rdoH7a1.requestFocus();
                return;
            } else if (chkH7b1.isShown() && !chkH7b1.isChecked() && !chkH7b2.isChecked() && !chkH7b3.isChecked() && !chkH7b4.isChecked()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from checklist");
                chkH7b1.requestFocus();
                return;

            } else if (!rdoH7c1.isChecked() & !rdoH7c2.isChecked() & secH7c.isShown()) {
                Connection.MessageBox(HDDS.this, "Select anyone options from (বিগত 7 দিনে এই খাবার সমূহ খাওয়া হয়েছিল).");
                rdoH7c1.requestFocus();
                return;
            } else if (rdoH7a1.isChecked() & rdoH7c2.isChecked()) {
                Connection.MessageBox(HDDS.this, "২৪ ঘন্টায় খাওয়া হয়েছে ! বিগত 7 দিনে এই খাবার সমূহ খাওয়া হয়েছিল কিনা ? উত্তর না হবেনা ! ");
                rdoH7c1.requestFocus();
                return;
            }



            String SQL = "";
            RadioButton rb;

            HDDS_DataModel objSave = new HDDS_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setH7((spnH7.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH7.getSelectedItem().toString(), "-")));
            String[] d_rdogrpH7a = new String[]{"1", "0"};
            objSave.setH7a("");
            for (int i = 0; i < rdogrpH7a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH7a.getChildAt(i);
                if (rb.isChecked()) objSave.setH7a(d_rdogrpH7a[i]);
            }

            objSave.setH7b1((chkH7b1.isChecked() ? "1" : "2"));
            objSave.setH7b2((chkH7b2.isChecked() ? "1" : "2"));
            objSave.setH7b3((chkH7b3.isChecked() ? "1" : "2"));
            objSave.setH7b4((chkH7b4.isChecked() ? "1" : "2"));
            String[] d_rdogrpH7c = new String[]{"1", "0"};
            objSave.setH7c("");
            for (int i = 0; i < rdogrpH7c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH7c.getChildAt(i);
                if (rb.isChecked()) objSave.setH7c(d_rdogrpH7c[i]);
            }

            objSave.setStartTime(StartTime);
            objSave.setEndTime(g.CurrentTime24());
            objSave.setUserId(g.getUserId());
            objSave.setEntryUser(g.getUserId()); //from data entry user list
            //objSave.setLat(Double.toString(currentLatitude));
            //objSave.setLon(Double.toString(currentLongitude));


            String status = objSave.SaveUpdateData(this);
            if (status.length() == 0) {
                buttonColor();
                if (allItemsCompleted) {
                    Bundle IDBundle = new Bundle();
                    IDBundle.putString("Rnd", txtRnd.getText().toString());
                    IDBundle.putString("SuchanaID", txtSuchanaID.getText().toString());
                    // IDBundle.putString("H41a", "");
                    startActivity(new Intent(HDDS.this, HDDS.class).putExtras(IDBundle));
                    // Connection.MessageBox(AssetB.this, "Saved Successfully");
                }
            } else {
                Connection.MessageBox(HDDS.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(HDDS.this, e.getMessage());
            return;
        }
    }

    private void buttonColor() {
        buttonAssetType01.setBackgroundColor(Color.LTGRAY);
        buttonAssetType02.setBackgroundColor(Color.LTGRAY);
        buttonAssetType03.setBackgroundColor(Color.LTGRAY);
        buttonAssetType04.setBackgroundColor(Color.LTGRAY);
        buttonAssetType05.setBackgroundColor(Color.LTGRAY);
        buttonAssetType06.setBackgroundColor(Color.LTGRAY);
        buttonAssetType07.setBackgroundColor(Color.LTGRAY);
        buttonAssetType08.setBackgroundColor(Color.LTGRAY);
        buttonAssetType09.setBackgroundColor(Color.LTGRAY);
        buttonAssetType10.setBackgroundColor(Color.LTGRAY);
        buttonAssetType11.setBackgroundColor(Color.LTGRAY);
        buttonAssetType12.setBackgroundColor(Color.LTGRAY);
        buttonAssetType13.setBackgroundColor(Color.LTGRAY);
        buttonAssetType14.setBackgroundColor(Color.LTGRAY);
        buttonAssetType15.setBackgroundColor(Color.LTGRAY);
        buttonAssetType16.setBackgroundColor(Color.LTGRAY);
        buttonAssetType17.setBackgroundColor(Color.LTGRAY);
        buttonAssetType18.setBackgroundColor(Color.LTGRAY);
        buttonAssetType19.setBackgroundColor(Color.LTGRAY);
        buttonAssetType20.setBackgroundColor(Color.LTGRAY);

        HDDS_DataModel d = new HDDS_DataModel();
        String SQL = "Select H7 from " + TableName + "  Where Rnd='" + txtRnd.getText().toString() + "' and SuchanaID='" + txtSuchanaID.getText().toString() + "'";
        List<HDDS_DataModel> data = d.SelectH7(this, SQL);
        if (data.size() == 0) {
            return;
        }
        if (data.size() == 20) {
            allItemsCompleted = true;
        } else if (data.size() == 19) {
            cmdSave.setText("Save -> Continue");
        } else {
            cmdSave.setText("SAVE");
        }

        for (HDDS_DataModel item : data) {

            int code = Integer.valueOf(item.getH7());
            int color = Color.GREEN;

            if (code == 1) {
                buttonAssetType01.setBackgroundColor(color);
            }

            if (code == 2) {
                buttonAssetType02.setBackgroundColor(color);
            }
            if (code == 3) {
                buttonAssetType03.setBackgroundColor(color);
            }
            if (code == 4) {
                buttonAssetType04.setBackgroundColor(color);
            }
            if (code == 5) {
                buttonAssetType05.setBackgroundColor(color);
            }
            if (code == 6) {
                buttonAssetType06.setBackgroundColor(color);
            }
            if (code == 7) {
                buttonAssetType07.setBackgroundColor(color);
            }
            if (code == 8) {
                buttonAssetType08.setBackgroundColor(color);
            }
            if (code == 9) {
                buttonAssetType09.setBackgroundColor(color);
            }
            if (code == 10) {
                buttonAssetType10.setBackgroundColor(color);
            }
            if (code == 11) {
                buttonAssetType11.setBackgroundColor(color);
            }
            if (code == 12) {
                buttonAssetType12.setBackgroundColor(color);
            }
            if (code == 13) {
                buttonAssetType13.setBackgroundColor(color);
            }
            if (code == 14) {
                buttonAssetType14.setBackgroundColor(color);
            }
            if (code == 15) {
                buttonAssetType15.setBackgroundColor(color);
            }
            if (code == 16) {
                buttonAssetType16.setBackgroundColor(color);
            }
            if (code == 17) {
                buttonAssetType17.setBackgroundColor(color);
            }
            if (code == 18) {
                buttonAssetType18.setBackgroundColor(color);
            }
            if (code == 19) {
                buttonAssetType19.setBackgroundColor(color);
            }
            if (code == 20) {
                buttonAssetType20.setBackgroundColor(color);
            }

        }
    }
    private void DataSearch(String Rnd, String SuchanaID, String H7) {
        try {

            RadioButton rb;
            HDDS_DataModel d = new HDDS_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<HDDS_DataModel> data = d.SelectAll(this, SQL);
            for (HDDS_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                spnH7.setSelection(Global.SpinnerItemPositionAnyLength(spnH7, item.getH7()));
                String[] d_rdogrpH7a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH7a.length; i++) {
                    if (item.getH7a().equals(String.valueOf(d_rdogrpH7a[i]))) {
                        rb = (RadioButton) rdogrpH7a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH7b1().equals("1")) {
                    chkH7b1.setChecked(true);
                } else if (item.getH7b1().equals("2")) {
                    chkH7b1.setChecked(false);
                }
                if (item.getH7b2().equals("1")) {
                    chkH7b2.setChecked(true);
                } else if (item.getH7b2().equals("2")) {
                    chkH7b2.setChecked(false);
                }
                if (item.getH7b3().equals("1")) {
                    chkH7b3.setChecked(true);
                } else if (item.getH7b3().equals("2")) {
                    chkH7b3.setChecked(false);
                }
                if (item.getH7b4().equals("1")) {
                    chkH7b4.setChecked(true);
                } else if (item.getH7b4().equals("2")) {
                    chkH7b4.setChecked(false);
                }
                String[] d_rdogrpH7c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH7c.length; i++) {
                    if (item.getH7c().equals(String.valueOf(d_rdogrpH7c[i]))) {
                        rb = (RadioButton) rdogrpH7c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
            }
        } catch (Exception e) {
            Connection.MessageBox(HDDS.this, e.getMessage());
            return;
        }
    }

    private void DataSearchPartial(String Rnd, String SuchanaID, String H7) {
        try {

            RadioButton rb;
            HDDS_DataModel d = new HDDS_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "' and H7='" + H7 + "'";
            List<HDDS_DataModel> data = d.SelectAll(this, SQL);
            for (HDDS_DataModel item : data) {
                // txtRnd.setText(item.getRnd());
                //   txtSuchanaID.setText(item.getSuchanaID());+
                //   spnH7.setSelection(Global.SpinnerItemPositionAnyLength(spnH7, item.getH7()));
                String[] d_rdogrpH7a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH7a.length; i++) {
                    if (item.getH7a().equals(String.valueOf(d_rdogrpH7a[i]))) {
                        rb = (RadioButton) rdogrpH7a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH7b1().equals("1")) {
                    chkH7b1.setChecked(true);
                } else if (item.getH7b1().equals("2")) {
                    chkH7b1.setChecked(false);
                }
                if (item.getH7b2().equals("1")) {
                    chkH7b2.setChecked(true);
                } else if (item.getH7b2().equals("2")) {
                    chkH7b2.setChecked(false);
                }
                if (item.getH7b3().equals("1")) {
                    chkH7b3.setChecked(true);
                } else if (item.getH7b3().equals("2")) {
                    chkH7b3.setChecked(false);
                }
                if (item.getH7b4().equals("1")) {
                    chkH7b4.setChecked(true);
                } else if (item.getH7b4().equals("2")) {
                    chkH7b4.setChecked(false);
                }
                String[] d_rdogrpH7c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH7c.length; i++) {
                    if (item.getH7c().equals(String.valueOf(d_rdogrpH7c[i]))) {
                        rb = (RadioButton) rdogrpH7c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
            }
                if (data.size() == 0) {
                    rdogrpH7a.clearCheck();
                    chkH7b1.setChecked(false);
                    chkH7b2.setChecked(false);
                    chkH7b3.setChecked(false);
                    chkH7b4.setChecked(false);
                    rdogrpH7c.clearCheck();
                }

        } catch (Exception e) {
            throw e;
//            Connection.MessageBox(HDDS.this, e.getMessage());
            //          return;
        }
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