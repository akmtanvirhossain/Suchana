package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Loan" android:label="Loan" />

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
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

public class Loan extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    static String H112 = "";
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
    LinearLayout secMSlNo;
    View lineMSlNo;
    TextView VlblMSlNo;
    Spinner spnMSlNo;
    LinearLayout secH111;
    View lineH111;
    TextView VlblH111;
    RadioGroup rdogrpH111;
    RadioButton rdoH1111;
    RadioButton rdoH1112;
    LinearLayout secH112;
    View lineH112;
    TextView VlblH112;
    EditText txtH112;
    LinearLayout secH113;
    View lineH113;
    TextView VlblH113;
    Spinner spnH113;
    LinearLayout secH113X;
    View lineH113X;
    TextView VlblH113X;
    EditText txtH113X;
    LinearLayout secH114a;
    View lineH114a;
    TextView VlblH114a;
    Spinner spnH114a;
    LinearLayout secH114b;
    View lineH114b;
    TextView VlblH114b;
    Spinner spnH114b;
    LinearLayout secH114c;
    View lineH114c;
    TextView VlblH114c;
    Spinner spnH114c;
    LinearLayout secH114X;
    View lineH114X;
    TextView VlblH114X;
    EditText txtH114X;
    LinearLayout secH115;
    View lineH115;
    TextView VlblH115;
    RadioGroup rdogrpH115;
    RadioButton rdoH1151;
    RadioButton rdoH1152;
    LinearLayout secH116;
    View lineH116;
    TextView VlblH116;
    EditText txtH116;
    LinearLayout secH117;
    View lineH117;
    TextView VlblH117;
    RadioGroup rdogrpH117;
    RadioButton rdoH1171;
    RadioButton rdoH1172;
    LinearLayout secH118;
    View lineH118;
    TextView VlblH118;
    RadioGroup rdogrpH118;
    RadioButton rdoH1181;
    RadioButton rdoH1182;
    String StartTime;
    Bundle IDbundle;
    private int hour;
    private int minute;
    private int mDay;
    private int mMonth;
    private int mYear;

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
            H112 = IDbundle.getString("H112");

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
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Loan_list.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDbundle);
                            getApplicationContext().startActivity(intent);
                            finish();
                        }
                    });
                    adb.show();
                }
            });
/*
            ImageButton cmdForward = (ImageButton) findViewById(R.id.cmdForward);
            cmdForward.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Loan.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to return to Home [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(), MainMenu.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            getApplicationContext().startActivity(intent);
                            finish();
                        }
                    });
                    adb.show();
                }
            });*/
            secRnd = (LinearLayout) findViewById(R.id.secRnd);
            lineRnd = (View) findViewById(R.id.lineRnd);
            VlblRnd = (TextView) findViewById(R.id.VlblRnd);
            txtRnd = (EditText) findViewById(R.id.txtRnd);

            secSuchanaID = (LinearLayout) findViewById(R.id.secSuchanaID);
            lineSuchanaID = (View) findViewById(R.id.lineSuchanaID);
            VlblSuchanaID = (TextView) findViewById(R.id.VlblSuchanaID);
            txtSuchanaID = (EditText) findViewById(R.id.txtSuchanaID);


            secMSlNo = (LinearLayout) findViewById(R.id.secMSlNo);
            lineMSlNo = (View) findViewById(R.id.lineMSlNo);
            VlblMSlNo = (TextView) findViewById(R.id.VlblMSlNo);
            spnMSlNo = (Spinner) findViewById(R.id.spnMSlNo);
            spnMSlNo.setAdapter(C.getArrayAdapter("select H21 ||'-'||H22 from member where RND='" + RND + "' and SuchanaID='"+ SUCHANAID + "' and cast(H26Y as int)>15"));
            secH111 = (LinearLayout) findViewById(R.id.secH111);
            lineH111 = (View) findViewById(R.id.lineH111);
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
                        lineH112.setVisibility(View.GONE);
                        //txtH112.setText("");
                        secH113.setVisibility(View.GONE);
                        lineH113.setVisibility(View.GONE);
                        spnH113.setSelection(0);
                        secH113X.setVisibility(View.GONE);
                        lineH113X.setVisibility(View.GONE);
                        txtH113X.setText("");
                        secH114a.setVisibility(View.GONE);
                        lineH114a.setVisibility(View.GONE);
                        spnH114a.setSelection(0);
                        secH114b.setVisibility(View.GONE);
                        lineH114b.setVisibility(View.GONE);
                        spnH114b.setSelection(0);
                        secH114c.setVisibility(View.GONE);
                        lineH114c.setVisibility(View.GONE);
                        spnH114c.setSelection(0);
                        secH114X.setVisibility(View.GONE);
                        lineH114X.setVisibility(View.GONE);
                        txtH114X.setText("");
                        secH115.setVisibility(View.GONE);
                        lineH115.setVisibility(View.GONE);
                        rdogrpH115.clearCheck();
                        secH116.setVisibility(View.GONE);
                        lineH116.setVisibility(View.GONE);
                        txtH116.setText("");
                        secH117.setVisibility(View.GONE);
                        lineH117.setVisibility(View.GONE);
                        rdogrpH117.clearCheck();
                        secH118.setVisibility(View.GONE);
                        lineH118.setVisibility(View.GONE);
                        rdogrpH118.clearCheck();
                    } else {
                        secH112.setVisibility(View.VISIBLE);
                        lineH112.setVisibility(View.VISIBLE);
                        secH113.setVisibility(View.VISIBLE);
                        lineH113.setVisibility(View.VISIBLE);
                      //  secH113X.setVisibility(View.VISIBLE);
                     //   lineH113X.setVisibility(View.VISIBLE);
                        secH114a.setVisibility(View.VISIBLE);
                        lineH114a.setVisibility(View.VISIBLE);
                        secH114b.setVisibility(View.VISIBLE);
                        lineH114b.setVisibility(View.VISIBLE);
                        secH114c.setVisibility(View.VISIBLE);
                        lineH114c.setVisibility(View.VISIBLE);
                       // secH114X.setVisibility(View.VISIBLE);
                      //  lineH114X.setVisibility(View.VISIBLE);
                        secH115.setVisibility(View.VISIBLE);
                        lineH115.setVisibility(View.VISIBLE);
                        secH116.setVisibility(View.VISIBLE);
                        lineH116.setVisibility(View.VISIBLE);
                        secH117.setVisibility(View.VISIBLE);
                        lineH117.setVisibility(View.VISIBLE);
                        secH118.setVisibility(View.VISIBLE);
                        lineH118.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH112 = (LinearLayout) findViewById(R.id.secH112);
            lineH112 = (View) findViewById(R.id.lineH112);
            VlblH112 = (TextView) findViewById(R.id.VlblH112);
            txtH112 = (EditText) findViewById(R.id.txtH112);

            txtRnd.setText(RND);
            txtRnd.setEnabled(false);
            txtSuchanaID.setText(SUCHANAID);
            txtSuchanaID.setEnabled(false);
            txtH112.setText(H112);
            txtH112.setEnabled(false);

            secH113 = (LinearLayout) findViewById(R.id.secH113);
            lineH113 = (View) findViewById(R.id.lineH113);
            VlblH113 = (TextView) findViewById(R.id.VlblH113);
            spnH113 = (Spinner) findViewById(R.id.spnH113);
            List<String> listH113 = new ArrayList<String>();

            listH113.add("");
            listH113.add("01-ব্যাংক");
            listH113.add("02-মহাজন");
            listH113.add("03-দোকানদার");
            listH113.add("04-আত্মীয়");
            listH113.add("05-বন্ধু প্রতিবেশী");
            listH113.add("06-গ্রামীণ");
            listH113.add("07-আশা");
            listH113.add("08-টিএমএসএস");
            listH113.add("09-আরডিআরএস");
            listH113.add("10-প্রশিখা");
            listH113.add("11-পদক্ষেপ");
            listH113.add("12-স্বনির্ভর");
            listH113.add("13-সিএনআরএস");
            listH113.add("14-এফআইভিডিবি");
            listH113.add("15-অনান্য");
            ArrayAdapter<String> adptrH113 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH113);
            spnH113.setAdapter(adptrH113);

            spnH113.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH113.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH113.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("15")) {
                        //secH113X.setVisibility(View);
                        secH113X.setVisibility(View.VISIBLE);
                        lineH113X.setVisibility(View.VISIBLE);
                    } else {
                        secH113X.setVisibility(View.GONE);
                        lineH113X.setVisibility(View.GONE);
                        txtH113X.setText(null);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH113X = (LinearLayout) findViewById(R.id.secH113X);
            lineH113X = (View) findViewById(R.id.lineH113X);
            VlblH113X = (TextView) findViewById(R.id.VlblH113X);
            txtH113X = (EditText) findViewById(R.id.txtH113X);
            secH114a = (LinearLayout) findViewById(R.id.secH114a);
            lineH114a = (View) findViewById(R.id.lineH114a);
            VlblH114a = (TextView) findViewById(R.id.VlblH114a);
            spnH114a = (Spinner) findViewById(R.id.spnH114a);
            List<String> listH114a = new ArrayList<String>();

            listH114a.add("");
            listH114a.add("01-ব্যবসায়িক উদ্যোগ");
            listH114a.add("02-সার কিনতে");
            listH114a.add("03-বীজ কিনতে");
            listH114a.add("04-কীটনাশক কিনতে");
            listH114a.add("05-সেচ সরঞ্জাম কিনতে");
            listH114a.add("06-অন্যান্য কৃষি উপকরণ কিনতে");
            listH114a.add("07-সেচের জন্য পানি কিনতে");
            listH114a.add("08-কৃষির জন্য ডিজেল / বিদ্যুৎ খরচ");
            listH114a.add("09-কৃষি শ্রম মজুরি");
            listH114a.add("10-কৃষির জন্য ভাড়া করা মেশিন/ পশুদের খরচ");
            listH114a.add("11-কৃষি ছাড়া অন্য উদ্দেশ্যে উৎপাদনশীল সম্পদ কিনতে");
            listH114a.add("12-কৃষি জমি ইজারা জন্য (নগদ মাত্র)");
            listH114a.add("13-কৃষি ছাড়া অন্য (নগদ মাত্র উদ্দেশ্যে) জমি ইজারা জন্য");
            listH114a.add("14-জমি ক্রয়ের জন্য");
            listH114a.add("15-গরু ছাগল ক্রয়ের জন্য");
            listH114a.add("16-চিকিৎসার জন্য");
            listH114a.add("17-খানার খাবারের চাহিদা পূরণের জন্য");
            listH114a.add("18-খানা ভাড়া /ক্রয়/ উন্নয়নের জন্য");
            listH114a.add("19-শিক্ষার খরচের জন্য");
            listH114a.add("20-বিয়ের জন্য ব্যয়");
            listH114a.add("21-যৌতুক");
            listH114a.add("22-জানাজা অন্ত্যেষ্টিক্রিয়া");
            listH114a.add("23-উচ্চ সুদে ধার দেয়ার জন্য");
            listH114a.add("24-বিদেশে যাওয়ার জন্য");
            listH114a.add("25-অন্য লোন শোধ করার জন্য");
            listH114a.add("26-অনান্য");
            ArrayAdapter<String> adptrH114a = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH114a);
            spnH114a.setAdapter(adptrH114a);

            spnH114a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH114a.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH114a.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("26")) {
                        secH114b.setVisibility(View.GONE);
                        lineH114b.setVisibility(View.GONE);
                        secH114c.setVisibility(View.GONE);
                        lineH114c.setVisibility(View.GONE);
                        secH114X.setVisibility(View.VISIBLE);
                        lineH114X.setVisibility(View.VISIBLE);

                    } else {
                        secH114b.setVisibility(View.VISIBLE);
                        lineH114b.setVisibility(View.VISIBLE);
                        secH114c.setVisibility(View.VISIBLE);
                        lineH114c.setVisibility(View.VISIBLE);
                        secH114X.setVisibility(View.GONE);
                        lineH114X.setVisibility(View.GONE);
                       txtH114X.setText(null);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH114b = (LinearLayout) findViewById(R.id.secH114b);
            lineH114b = (View) findViewById(R.id.lineH114b);
            VlblH114b = (TextView) findViewById(R.id.VlblH114b);
            spnH114b = (Spinner) findViewById(R.id.spnH114b);
            List<String> listH114b = new ArrayList<String>();

            listH114b.add("");
            listH114b.add("01-ব্যবসায়িক উদ্যোগ");
            listH114b.add("02-সার কিনতে");
            listH114b.add("03-বীজ কিনতে");
            listH114b.add("04-কীটনাশক কিনতে");
            listH114b.add("05-সেচ সরঞ্জাম কিনতে");
            listH114b.add("06-অন্যান্য কৃষি উপকরণ কিনতে");
            listH114b.add("07-সেচের জন্য পানি কিনতে");
            listH114b.add("08-কৃষির জন্য ডিজেল / বিদ্যুৎ খরচ");
            listH114b.add("09-কৃষি শ্রম মজুরি");
            listH114b.add("10-কৃষির জন্য ভাড়া করা মেশিন/ পশুদের খরচ");
            listH114b.add("11-কৃষি ছাড়া অন্য উদ্দেশ্যে উৎপাদনশীল সম্পদ কিনতে");
            listH114b.add("12-কৃষি জমি ইজারা জন্য (নগদ মাত্র)");
            listH114b.add("13-কৃষি ছাড়া অন্য (নগদ মাত্র উদ্দেশ্যে) জমি ইজারা জন্য");
            listH114b.add("14-জমি ক্রয়ের জন্য");
            listH114b.add("15-গরু ছাগল ক্রয়ের জন্য");
            listH114b.add("16-চিকিৎসার জন্য");
            listH114b.add("17-খানার খাবারের চাহিদা পূরণের জন্য");
            listH114b.add("18-খানা ভাড়া /ক্রয/় উন্নয়নের জন্য");
            listH114b.add("19-শিক্ষার খরচের জন্য");
            listH114b.add("20-বিয়ের জন্য ব্যয়");
            listH114b.add("21-যৌতুক");
            listH114b.add("22-জানাজা অন্ত্যেষ্টিক্রিয়া");
            listH114b.add("23-উচ্চ সুদে ধার দেয়ার জন্য");
            listH114b.add("24-বিদেশে যাওয়ার জন্য");
            listH114b.add("25-অন্য লোন শোধ করার জন্য");
            listH114b.add("26-অনান্য");
            ArrayAdapter<String> adptrH114b = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH114b);
            spnH114b.setAdapter(adptrH114b);

            spnH114b.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH114b.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH114b.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("26")) {
                        secH114c.setVisibility(View.GONE);
                        lineH114c.setVisibility(View.GONE);
                        secH114X.setVisibility(View.VISIBLE);
                        lineH114X.setVisibility(View.VISIBLE);

                    } else {
                        secH114c.setVisibility(View.VISIBLE);
                        lineH114c.setVisibility(View.VISIBLE);

                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH114c = (LinearLayout) findViewById(R.id.secH114c);
            lineH114c = (View) findViewById(R.id.lineH114c);
            VlblH114c = (TextView) findViewById(R.id.VlblH114c);
            spnH114c = (Spinner) findViewById(R.id.spnH114c);
            List<String> listH114c = new ArrayList<String>();

            listH114c.add("");
            listH114c.add("01-ব্যবসায়িক উদ্যোগ");
            listH114c.add("02-সার কিনতে");
            listH114c.add("03-বীজ কিনতে");
            listH114c.add("04-কীটনাশক কিনতে");
            listH114c.add("05-সেচ সরঞ্জাম কিনতে");
            listH114c.add("06-অন্যান্য কৃষি উপকরণ কিনতে");
            listH114c.add("07-সেচের জন্য পানি কিনতে");
            listH114c.add("08-কৃষির জন্য ডিজেল / বিদ্যুৎ খরচ");
            listH114c.add("09-কৃষি শ্রম মজুরি");
            listH114c.add("10-কৃষির জন্য ভাড়া করা মেশিন /পশুদের খরচ");
            listH114c.add("11-কৃষি ছাড়া অন্য উদ্দেশ্যে উৎপাদনশীল সম্পদ কিনতে");
            listH114c.add("12-কৃষি জমি ইজারা জন্য (নগদ মাত্র)");
            listH114c.add("13-কৃষি ছাড়া অন্য (নগদ মাত্র উদ্দেশ্যে) জমি ইজারা জন্য");
            listH114c.add("14-জমি ক্রয়ের জন্য");
            listH114c.add("15-গরু ছাগল ক্রয়ের জন্য");
            listH114c.add("16-চিকিৎসার জন্য");
            listH114c.add("17-খানার খাবারের চাহিদা পূরণের জন্য");
            listH114c.add("18-খানা ভাড়া /ক্রয/় উন্নয়নের জন্য");
            listH114c.add("19-শিক্ষার খরচের জন্য");
            listH114c.add("20-বিয়ের জন্য ব্যয়");
            listH114c.add("21-যৌতুক");
            listH114c.add("22-জানাজা অন্ত্যেষ্টিক্রিয়া");
            listH114c.add("23-উচ্চ সুদে ধার দেয়ার জন্য");
            listH114c.add("24-বিদেশে যাওয়ার জন্য");
            listH114c.add("25-অন্য লোন শোধ করার জন্য");
            listH114c.add("26-অনান্য");
            ArrayAdapter<String> adptrH114c = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH114c);
            spnH114c.setAdapter(adptrH114c);

            spnH114c.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH114c.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH114c.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("26")) {
                        secH114X.setVisibility(View.VISIBLE);
                        lineH114X.setVisibility(View.VISIBLE);

                    } else {
                        secH114X.setVisibility(View.GONE);
                        lineH114X.setVisibility(View.GONE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH114X = (LinearLayout) findViewById(R.id.secH114X);
            lineH114X = (View) findViewById(R.id.lineH114X);
            VlblH114X = (TextView) findViewById(R.id.VlblH114X);
            txtH114X = (EditText) findViewById(R.id.txtH114X);
            secH115 = (LinearLayout) findViewById(R.id.secH115);
            lineH115 = (View) findViewById(R.id.lineH115);
            VlblH115 = (TextView) findViewById(R.id.VlblH115);
            rdogrpH115 = (RadioGroup) findViewById(R.id.rdogrpH115);

            rdoH1151 = (RadioButton) findViewById(R.id.rdoH1151);
            rdoH1152 = (RadioButton) findViewById(R.id.rdoH1152);
            secH116 = (LinearLayout) findViewById(R.id.secH116);
            lineH116 = (View) findViewById(R.id.lineH116);
            VlblH116 = (TextView) findViewById(R.id.VlblH116);
            txtH116 = (EditText) findViewById(R.id.txtH116);
            secH117 = (LinearLayout) findViewById(R.id.secH117);
            lineH117 = (View) findViewById(R.id.lineH117);
            VlblH117 = (TextView) findViewById(R.id.VlblH117);
            rdogrpH117 = (RadioGroup) findViewById(R.id.rdogrpH117);

            rdoH1171 = (RadioButton) findViewById(R.id.rdoH1171);
            rdoH1172 = (RadioButton) findViewById(R.id.rdoH1172);
            secH118 = (LinearLayout) findViewById(R.id.secH118);
            lineH118 = (View) findViewById(R.id.lineH118);
            VlblH118 = (TextView) findViewById(R.id.VlblH118);
            rdogrpH118 = (RadioGroup) findViewById(R.id.rdogrpH118);

            rdoH1181 = (RadioButton) findViewById(R.id.rdoH1181);
            rdoH1182 = (RadioButton) findViewById(R.id.rdoH1182);
            secH113X.setVisibility(View.GONE);
            lineH113X.setVisibility(View.GONE);
            secH114X.setVisibility(View.GONE);
            lineH114X.setVisibility(View.GONE);
            DataSearch(RND,SUCHANAID,H112);
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
            } else if (spnMSlNo.getSelectedItem().toString().length() == 0 & secMSlNo.isShown()) {
                Connection.MessageBox(Loan.this, "Required field: তথ্যদানে সহায়তাকারীর লাইন নম্বর #.");
               // txtMSlNo.requestFocus();
                return;
            }
            //else if (Integer.valueOf(txtMSlNo.getText().toString().length() == 0 ? "1" : txtMSlNo.getText().toString()) < 1 || Integer.valueOf(txtMSlNo.getText().toString().length() == 0 ? "99" : txtMSlNo.getText().toString()) > 99) {
             //   Connection.MessageBox(Loan.this, "Value should be between 1 and 99(তথ্যদানে সহায়তাকারীর লাইন নম্বর #).");
             //   txtMSlNo.requestFocus();
             //   return;
            //}
            else if (!rdoH1111.isChecked() & !rdoH1112.isChecked() & secH111.isShown()) {
                Connection.MessageBox(Loan.this, "Select anyone options from (আপনি অথবা আপনার স্বামীর কোনো ঋণ (নগদ অথবা পণ্য) আছে?).");
                rdoH1111.requestFocus();
                return;
            } else if (txtH112.getText().toString().length() == 0 & secH112.isShown()) {
                Connection.MessageBox(Loan.this, "Required field: লোন নম্বর.");
                txtH112.requestFocus();
                return;
            } else if (Integer.valueOf(txtH112.getText().toString().length() == 0 ? "1" : txtH112.getText().toString()) < 1 || Integer.valueOf(txtH112.getText().toString().length() == 0 ? "99" : txtH112.getText().toString()) > 99) {
                Connection.MessageBox(Loan.this, "Value should be between 1 and 99(লোন নম্বর).");
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
            } else if (spnH114a.getSelectedItemPosition() == 0 & secH114a.isShown()) {
                Connection.MessageBox(Loan.this, "Required field: লোনটি প্রধানত কি কাজের জন্য ব্যবহৃত হয়েছে.");
                spnH114a.requestFocus();
                return;
            } else if (spnH114b.getSelectedItemPosition() == 0 & secH114b.isShown()) {
                Connection.MessageBox(Loan.this, "Required field: লোনটি প্রধানত কি কাজের জন্য ব্যবহৃত হয়েছে.");
                spnH114b.requestFocus();
                return;
            } else if (spnH114c.getSelectedItemPosition() == 0 & secH114c.isShown()) {
                Connection.MessageBox(Loan.this, "Required field: লোনটি প্রধানত কি কাজের জন্য ব্যবহৃত হয়েছে.");
                spnH114c.requestFocus();
                return;
            } else if (txtH114X.getText().toString().length() == 0 & secH114X.isShown()) {
                Connection.MessageBox(Loan.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH114X.requestFocus();
                return;
            } else if (!rdoH1151.isChecked() & !rdoH1152.isChecked() & secH115.isShown()) {
                Connection.MessageBox(Loan.this, "Select anyone options from (ক্যাশ কিনা ?).");
                rdoH1151.requestFocus();
                return;
            } else if (txtH116.getText().toString().length() == 0 & secH116.isShown()) {
                Connection.MessageBox(Loan.this, "Required field: লোনের পরিমাণ (টাকা).");
                txtH116.requestFocus();
                return;
            } else if (Integer.valueOf(txtH116.getText().toString().length() == 0 ? "0" : txtH116.getText().toString()) < 0 || Integer.valueOf(txtH116.getText().toString().length() == 0 ? "999999" : txtH116.getText().toString()) > 999999) {
                Connection.MessageBox(Loan.this, "Value should be between 0 and 999999(লোনের পরিমাণ (টাকা)).");
                txtH116.requestFocus();
                return;
            } else if (!rdoH1171.isChecked() & !rdoH1172.isChecked() & secH117.isShown()) {
                Connection.MessageBox(Loan.this, "Select anyone options from (কার লোন ).");
                rdoH1171.requestFocus();
                return;
            } else if (!rdoH1181.isChecked() & !rdoH1182.isChecked() & secH118.isShown()) {
                Connection.MessageBox(Loan.this, "Select anyone options from (আপনি ঋণ শোধ করছেন ?).");
                rdoH1181.requestFocus();
                return;
            }
            if((Connection.SelectedSpinnerValue(spnH114a.getSelectedItem().toString(), "-").equals(Connection.SelectedSpinnerValue(spnH114b.getSelectedItem().toString(), "-"))) || (Connection.SelectedSpinnerValue(spnH114a.getSelectedItem().toString(), "-").equals(Connection.SelectedSpinnerValue(spnH114c.getSelectedItem().toString(), "-"))) || (Connection.SelectedSpinnerValue(spnH114b.getSelectedItem().toString(), "-").equals(Connection.SelectedSpinnerValue(spnH114c.getSelectedItem().toString(), "-"))))
            {
                Connection.MessageBox(Loan.this, "Duplicate in loan amount use");
                return;
            }

            String SQL = "";
            RadioButton rb;

            Loan_DataModel objSave = new Loan_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setMSlNo(Connection.SelectedSpinnerValue(spnMSlNo.getSelectedItem().toString(), "-"));
            String[] d_rdogrpH111 = new String[]{"1", "0"};
            objSave.setH111("");
            for (int i = 0; i < rdogrpH111.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH111.getChildAt(i);
                if (rb.isChecked()) objSave.setH111(d_rdogrpH111[i]);
            }

            objSave.setH112(txtH112.getText().toString());
            objSave.setH113((spnH113.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH113.getSelectedItem().toString(), "-")));
            objSave.setH113X(txtH113X.getText().toString());
            objSave.setH114a((spnH114a.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH114a.getSelectedItem().toString(), "-")));
            objSave.setH114b((spnH114b.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH114b.getSelectedItem().toString(), "-")));
            objSave.setH114c((spnH114c.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH114c.getSelectedItem().toString(), "-")));
            objSave.setH114X(txtH114X.getText().toString());
            String[] d_rdogrpH115 = new String[]{"1", "2"};
            objSave.setH115("");
            for (int i = 0; i < rdogrpH115.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH115.getChildAt(i);
                if (rb.isChecked()) objSave.setH115(d_rdogrpH115[i]);
            }

            objSave.setH116(txtH116.getText().toString());
            String[] d_rdogrpH117 = new String[]{"1", "2"};
            objSave.setH117("");
            for (int i = 0; i < rdogrpH117.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH117.getChildAt(i);
                if (rb.isChecked()) objSave.setH117(d_rdogrpH117[i]);
            }

            String[] d_rdogrpH118 = new String[]{"1", "0"};
            objSave.setH118("");
            for (int i = 0; i < rdogrpH118.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH118.getChildAt(i);
                if (rb.isChecked()) objSave.setH118(d_rdogrpH118[i]);
            }

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
                if(rdoH1112.isChecked()==true)
                {
                    Bundle IDBundle = new Bundle();
                    finish();
                    IDBundle.putString("Rnd", txtRnd.getText().toString());
                    IDBundle.putString("SuchanaID", txtSuchanaID.getText().toString());
                    IDBundle.putString("H41a", "");
                    startActivity(new Intent(Loan.this, HFIAS.class).putExtras(IDBundle));
                }
                else
                {
                    Bundle IDBundle = new Bundle();
                    finish();
                    IDBundle.putString("Rnd", txtRnd.getText().toString());
                    IDBundle.putString("SuchanaID", txtSuchanaID.getText().toString());
                    IDBundle.putString("H41a", "");
                    startActivity(new Intent(Loan.this, Loan_list.class).putExtras(IDBundle));
                }


            } else {
                Connection.MessageBox(Loan.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(Loan.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID, String H112) {
        try {

            RadioButton rb;
            Loan_DataModel d = new Loan_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "' and H112='" + H112 + "'";
            List<Loan_DataModel> data = d.SelectAll(this, SQL);
            for (Loan_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
              //  txtMSlNo.setText(item.getMSlNo());
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
                spnH114a.setSelection(Global.SpinnerItemPositionAnyLength(spnH114a, item.getH114a()));
                spnH114b.setSelection(Global.SpinnerItemPositionAnyLength(spnH114b, item.getH114b()));
                spnH114c.setSelection(Global.SpinnerItemPositionAnyLength(spnH114c, item.getH114c()));
                txtH114X.setText(item.getH114X());
                String[] d_rdogrpH115 = new String[]{"1", "2"};
                for (int i = 0; i < d_rdogrpH115.length; i++) {
                    if (item.getH115().equals(String.valueOf(d_rdogrpH115[i]))) {
                        rb = (RadioButton) rdogrpH115.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH116.setText(item.getH116());
                String[] d_rdogrpH117 = new String[]{"1", "2"};
                for (int i = 0; i < d_rdogrpH117.length; i++) {
                    if (item.getH117().equals(String.valueOf(d_rdogrpH117[i]))) {
                        rb = (RadioButton) rdogrpH117.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH118 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH118.length; i++) {
                    if (item.getH118().equals(String.valueOf(d_rdogrpH118[i]))) {
                        rb = (RadioButton) rdogrpH118.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
            }
        } catch (Exception e) {
            Connection.MessageBox(Loan.this, e.getMessage());
            return;
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