package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Savings" android:label="Savings" />

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
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

public class Savings extends Activity {
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
    LinearLayout secMSlNo;
    View lineMSlNo;
    TextView VlblMSlNo;
    EditText txtMSlNo;
    LinearLayout secH101;
    View lineH101;
    TextView VlblH101;
    RadioGroup rdogrpH101;
    RadioButton rdoH1011;
    RadioButton rdoH1012;
    LinearLayout secH102;
    View lineH102;
    TextView VlblH102;
    RadioGroup rdogrpH102;
    RadioButton rdoH1021;
    RadioButton rdoH1022;
    LinearLayout secH103;
    View lineH103;
    TextView VlblH103;
    RadioGroup rdogrpH103;
    RadioButton rdoH1031;
    RadioButton rdoH1032;
    LinearLayout secH1031;
    View lineH1031;
    TextView VlblH1031;
    EditText txtH1031;
    LinearLayout secH1032;
    View lineH1032;
    TextView VlblH1032;
    EditText txtH1032;
    LinearLayout secH1033;
    View lineH1033;
    TextView VlblH1033;
    EditText txtH1033;
    LinearLayout secH1034;
    View lineH1034;
    TextView VlblH1034;
    EditText txtH1034;
    LinearLayout secH1035;
    View lineH1035;
    TextView VlblH1035;
    EditText txtH1035;
    LinearLayout secH1036;
    View lineH1036;
    TextView VlblH1036;
    EditText txtH1036;
    LinearLayout secH1037a;
    View lineH1037a;
    TextView VlblH1037a;
    Spinner spnH1037a;
    LinearLayout secH1037b;
    View lineH1037b;
    TextView VlblH1037b;
    Spinner spnH1037b;
    LinearLayout secH1037c;
    View lineH1037c;
    TextView VlblH1037c;
    Spinner spnH1037c;
    LinearLayout secH1037d;
    View lineH1037d;
    TextView VlblH1037d;
    Spinner spnH1037d;
    LinearLayout secH1037X;
    View lineH1037X;
    TextView VlblH1037X;
    EditText txtH1037X;
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
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Cost1.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDbundle);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(Savings.this);
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
            });

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
            txtMSlNo = (EditText) findViewById(R.id.txtMSlNo);
            secH101 = (LinearLayout) findViewById(R.id.secH101);
            lineH101 = (View) findViewById(R.id.lineH101);
            VlblH101 = (TextView) findViewById(R.id.VlblH101);
            rdogrpH101 = (RadioGroup) findViewById(R.id.rdogrpH101);

            rdoH1011 = (RadioButton) findViewById(R.id.rdoH1011);
            rdoH1012 = (RadioButton) findViewById(R.id.rdoH1012);
            secH102 = (LinearLayout) findViewById(R.id.secH102);
            lineH102 = (View) findViewById(R.id.lineH102);
            VlblH102 = (TextView) findViewById(R.id.VlblH102);
            rdogrpH102 = (RadioGroup) findViewById(R.id.rdogrpH102);

            rdoH1021 = (RadioButton) findViewById(R.id.rdoH1021);
            rdoH1022 = (RadioButton) findViewById(R.id.rdoH1022);
            secH103 = (LinearLayout) findViewById(R.id.secH103);
            lineH103 = (View) findViewById(R.id.lineH103);
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
                        lineH1031.setVisibility(View.GONE);
                        txtH1031.setText("");
                        secH1032.setVisibility(View.GONE);
                        lineH1032.setVisibility(View.GONE);
                        txtH1032.setText("");
                        secH1033.setVisibility(View.GONE);
                        lineH1033.setVisibility(View.GONE);
                        txtH1033.setText("");
                        secH1034.setVisibility(View.GONE);
                        lineH1034.setVisibility(View.GONE);
                        txtH1034.setText("");
                        secH1035.setVisibility(View.GONE);
                        lineH1035.setVisibility(View.GONE);
                        txtH1035.setText("");
                        secH1036.setVisibility(View.GONE);
                        lineH1036.setVisibility(View.GONE);
                        txtH1036.setText("");
                        secH1037a.setVisibility(View.GONE);
                        lineH1037a.setVisibility(View.GONE);
                        spnH1037a.setSelection(0);
                        secH1037b.setVisibility(View.GONE);
                        lineH1037b.setVisibility(View.GONE);
                        spnH1037b.setSelection(0);
                        secH1037c.setVisibility(View.GONE);
                        lineH1037c.setVisibility(View.GONE);
                        spnH1037c.setSelection(0);
                        secH1037d.setVisibility(View.GONE);
                        lineH1037d.setVisibility(View.GONE);
                        spnH1037d.setSelection(0);
                    } else {
                        secH1031.setVisibility(View.VISIBLE);
                        lineH1031.setVisibility(View.VISIBLE);
                        secH1032.setVisibility(View.VISIBLE);
                        lineH1032.setVisibility(View.VISIBLE);
                        secH1033.setVisibility(View.VISIBLE);
                        lineH1033.setVisibility(View.VISIBLE);
                        secH1034.setVisibility(View.VISIBLE);
                        lineH1034.setVisibility(View.VISIBLE);
                        secH1035.setVisibility(View.VISIBLE);
                        lineH1035.setVisibility(View.VISIBLE);
                        secH1036.setVisibility(View.VISIBLE);
                        lineH1036.setVisibility(View.VISIBLE);
                        secH1037a.setVisibility(View.VISIBLE);
                        lineH1037a.setVisibility(View.VISIBLE);
                        secH1037b.setVisibility(View.VISIBLE);
                        lineH1037b.setVisibility(View.VISIBLE);
                        secH1037c.setVisibility(View.VISIBLE);
                        lineH1037c.setVisibility(View.VISIBLE);
                        secH1037d.setVisibility(View.VISIBLE);
                        lineH1037d.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH1031 = (LinearLayout) findViewById(R.id.secH1031);
            lineH1031 = (View) findViewById(R.id.lineH1031);
            VlblH1031 = (TextView) findViewById(R.id.VlblH1031);
            txtH1031 = (EditText) findViewById(R.id.txtH1031);
            secH1032 = (LinearLayout) findViewById(R.id.secH1032);
            lineH1032 = (View) findViewById(R.id.lineH1032);
            VlblH1032 = (TextView) findViewById(R.id.VlblH1032);
            txtH1032 = (EditText) findViewById(R.id.txtH1032);
            secH1033 = (LinearLayout) findViewById(R.id.secH1033);
            lineH1033 = (View) findViewById(R.id.lineH1033);
            VlblH1033 = (TextView) findViewById(R.id.VlblH1033);
            txtH1033 = (EditText) findViewById(R.id.txtH1033);
            secH1034 = (LinearLayout) findViewById(R.id.secH1034);
            lineH1034 = (View) findViewById(R.id.lineH1034);
            VlblH1034 = (TextView) findViewById(R.id.VlblH1034);
            txtH1034 = (EditText) findViewById(R.id.txtH1034);
            secH1035 = (LinearLayout) findViewById(R.id.secH1035);
            lineH1035 = (View) findViewById(R.id.lineH1035);
            VlblH1035 = (TextView) findViewById(R.id.VlblH1035);
            txtH1035 = (EditText) findViewById(R.id.txtH1035);
            secH1036 = (LinearLayout) findViewById(R.id.secH1036);
            lineH1036 = (View) findViewById(R.id.lineH1036);
            VlblH1036 = (TextView) findViewById(R.id.VlblH1036);
            txtH1036 = (EditText) findViewById(R.id.txtH1036);
            secH1037a = (LinearLayout) findViewById(R.id.secH1037a);
            lineH1037a = (View) findViewById(R.id.lineH1037a);
            VlblH1037a = (TextView) findViewById(R.id.VlblH1037a);
            spnH1037a = (Spinner) findViewById(R.id.spnH1037a);
            List<String> listH1037a = new ArrayList<String>();

            listH1037a.add("");
            listH1037a.add("01-খানার পণ্য কেনার জন্য");
            listH1037a.add("02-কৃষি উৎপাদনশীল সম্পদ কিনতে");
            listH1037a.add("03-অন্যান্য উৎপাদনশীল সম্পদ কিনতে");
            listH1037a.add("04-কোন ব্যবসা শুরু করতে/চালাতে");
            listH1037a.add("05-জমি বাড়ী কিনতে");
            listH1037a.add("06-শিক্ষা প্রশিক্ষণ জন্য");
            listH1037a.add("07-বিয়ে যৌতুকের জন্য");
            listH1037a.add("08-ঘর মেরামত/তৈরী করতে");
            listH1037a.add("09-ঋণ পেতে");
            listH1037a.add("10-অন্য কাউকে ধার দিতে");
            listH1037a.add("11-কঠিন সময়ের বিপদের জন্য");
            listH1037a.add("12-কাজের জন্য কেউকে বিদেশে পাঠাত");
            listH1037a.add("13-ছেলেমেয়েদের ভবিষ্যত জন্য");
            listH1037a.add("14-মেডিকেল বা অন্য জরুরী সময়ের জন্য");
            listH1037a.add("15-জানিনা কোনো বিশেষ কারণে নয়");
            listH1037a.add("16-অনান্য");
            ArrayAdapter<String> adptrH1037a = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH1037a);
            spnH1037a.setAdapter(adptrH1037a);

            spnH1037a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH1037a.getSelectedItemPosition() != 16 & spnH1037b.getSelectedItemPosition() != 16 &
                            spnH1037c.getSelectedItemPosition() != 16 & spnH1037d.getSelectedItemPosition() != 16) {
                        txtH1037X.setText("");
                        secH1037X.setVisibility(View.GONE);
                    } else {
                        secH1037X.setVisibility(View.VISIBLE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH1037b = (LinearLayout) findViewById(R.id.secH1037b);
            lineH1037b = (View) findViewById(R.id.lineH1037b);
            VlblH1037b = (TextView) findViewById(R.id.VlblH1037b);
            spnH1037b = (Spinner) findViewById(R.id.spnH1037b);
            List<String> listH1037b = new ArrayList<String>();

            listH1037b.add("");
            listH1037b.add("01-খানার পণ্য কেনার জন্য");
            listH1037b.add("02-কৃষি উৎপাদনশীল সম্পদ কিনতে");
            listH1037b.add("03-অন্যান্য উৎপাদনশীল সম্পদ কিনতে");
            listH1037b.add("04-কোন ব্যবসা শুরু করতে/চালাতে");
            listH1037b.add("05-জমি বাড়ী কিনতে");
            listH1037b.add("06-শিক্ষা প্রশিক্ষণ জন্য");
            listH1037b.add("07-বিয়ে যৌতুকের জন্য");
            listH1037b.add("08-ঘর মেরামত/তৈরী করতে");
            listH1037b.add("09-ঋণ পেতে");
            listH1037b.add("10-অন্য কাউকে ধার দিতে");
            listH1037b.add("11-কঠিন সময়ের বিপদের জন্য");
            listH1037b.add("12-কাজের জন্য কেউকে বিদেশে পাঠাত");
            listH1037b.add("13-ছেলেমেয়েদের ভবিষ্যত জন্য");
            listH1037b.add("14-মেডিকেল বা অন্য জরুরী সময়ের জন্য");
            listH1037b.add("15-জানিনা কোনো বিশেষ কারণে নয়");
            listH1037b.add("16-অনান্য");
            ArrayAdapter<String> adptrH1037b = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH1037b);
            spnH1037b.setAdapter(adptrH1037b);

            spnH1037b.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH1037a.getSelectedItemPosition() != 16 & spnH1037b.getSelectedItemPosition() != 16 &
                            spnH1037c.getSelectedItemPosition() != 16 & spnH1037d.getSelectedItemPosition() != 16) {
                        txtH1037X.setText("");
                        secH1037X.setVisibility(View.GONE);
                    } else {
                        secH1037X.setVisibility(View.VISIBLE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH1037c = (LinearLayout) findViewById(R.id.secH1037c);
            lineH1037c = (View) findViewById(R.id.lineH1037c);
            VlblH1037c = (TextView) findViewById(R.id.VlblH1037c);
            spnH1037c = (Spinner) findViewById(R.id.spnH1037c);
            List<String> listH1037c = new ArrayList<String>();

            listH1037c.add("");
            listH1037c.add("01-খানার পণ্য কেনার জন্য");
            listH1037c.add("02-কৃষি উৎপাদনশীল সম্পদ কিনতে");
            listH1037c.add("03-অন্যান্য উৎপাদনশীল সম্পদ কিনতে");
            listH1037c.add("04-কোন ব্যবসা শুরু করতে/চালাতে");
            listH1037c.add("05-জমি বাড়ী কিনতে");
            listH1037c.add("06-শিক্ষা প্রশিক্ষণ জন্য");
            listH1037c.add("07-বিয়ে যৌতুকের জন্য");
            listH1037c.add("08-ঘর মেরামত/তৈরী করতে");
            listH1037c.add("09-ঋণ পেতে");
            listH1037c.add("10-অন্য কাউকে ধার দিতে");
            listH1037c.add("11-কঠিন সময়ের বিপদের জন্য");
            listH1037c.add("12-কাজের জন্য কেউকে বিদেশে পাঠাত");
            listH1037c.add("13-ছেলেমেয়েদের ভবিষ্যত জন্য");
            listH1037c.add("14-মেডিকেল বা অন্য জরুরী সময়ের জন্য");
            listH1037c.add("15-জানিনা কোনো বিশেষ কারণে নয়");
            listH1037c.add("16-অনান্য");
            ArrayAdapter<String> adptrH1037c = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH1037c);
            spnH1037c.setAdapter(adptrH1037c);

            spnH1037c.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH1037a.getSelectedItemPosition() != 16 & spnH1037b.getSelectedItemPosition() != 16 &
                            spnH1037c.getSelectedItemPosition() != 16 & spnH1037d.getSelectedItemPosition() != 16) {
                        txtH1037X.setText("");
                        secH1037X.setVisibility(View.GONE);
                    } else {
                        secH1037X.setVisibility(View.VISIBLE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH1037d = (LinearLayout) findViewById(R.id.secH1037d);
            lineH1037d = (View) findViewById(R.id.lineH1037d);
            VlblH1037d = (TextView) findViewById(R.id.VlblH1037d);
            spnH1037d = (Spinner) findViewById(R.id.spnH1037d);
            List<String> listH1037d = new ArrayList<String>();

            listH1037d.add("");
            listH1037d.add("01-খানার পণ্য কেনার জন্য");
            listH1037d.add("02-কৃষি উৎপাদনশীল সম্পদ কিনতে");
            listH1037d.add("03-অন্যান্য উৎপাদনশীল সম্পদ কিনতে");
            listH1037d.add("04-কোন ব্যবসা শুরু করতে/চালাতে");
            listH1037d.add("05-জমি বাড়ী কিনতে");
            listH1037d.add("06-শিক্ষা প্রশিক্ষণ জন্য");
            listH1037d.add("07-বিয়ে যৌতুকের জন্য");
            listH1037d.add("08-ঘর মেরামত/তৈরী করতে");
            listH1037d.add("09-ঋণ পেতে");
            listH1037d.add("10-অন্য কাউকে ধার দিতে");
            listH1037d.add("11-কঠিন সময়ের বিপদের জন্য");
            listH1037d.add("12-কাজের জন্য কেউকে বিদেশে পাঠাত");
            listH1037d.add("13-ছেলেমেয়েদের ভবিষ্যত জন্য");
            listH1037d.add("14-মেডিকেল বা অন্য জরুরী সময়ের জন্য");
            listH1037d.add("15-জানিনা কোনো বিশেষ কারণে নয়");
            listH1037d.add("16-অনান্য");
            ArrayAdapter<String> adptrH1037d = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH1037d);
            spnH1037d.setAdapter(adptrH1037d);

            spnH1037d.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH1037a.getSelectedItemPosition() != 16 & spnH1037b.getSelectedItemPosition() != 16 &
                            spnH1037c.getSelectedItemPosition() != 16 & spnH1037d.getSelectedItemPosition() != 16) {
                        txtH1037X.setText("");
                        secH1037X.setVisibility(View.GONE);
                    } else {
                        secH1037X.setVisibility(View.VISIBLE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH1037X = (LinearLayout) findViewById(R.id.secH1037X);
            lineH1037X = (View) findViewById(R.id.lineH1037X);
            VlblH1037X = (TextView) findViewById(R.id.VlblH1037X);
            txtH1037X = (EditText) findViewById(R.id.txtH1037X);


            DataSearch(RND, SUCHANAID);
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
            } else if (txtMSlNo.getText().toString().length() == 0 & secMSlNo.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: তথ্যদানে সহায়তাকারীর লাইন নম্বর #.");
                txtMSlNo.requestFocus();
                return;
            } else if (Integer.valueOf(txtMSlNo.getText().toString().length() == 0 ? "1" : txtMSlNo.getText().toString()) < 1 || Integer.valueOf(txtMSlNo.getText().toString().length() == 0 ? "99" : txtMSlNo.getText().toString()) > 99) {
                Connection.MessageBox(Savings.this, "Value should be between 1 and 99(তথ্যদানে সহায়তাকারীর লাইন নম্বর #).");
                txtMSlNo.requestFocus();
                return;
            } else if (!rdoH1011.isChecked() & !rdoH1012.isChecked() & secH101.isShown()) {
                Connection.MessageBox(Savings.this, "Select anyone options from (আপনি  বা আপনার স্ত্রী বা পরিবারের অন্যান্য সদস্য কি কোন সমব্যয় সমিতি  বা এলাকার সঞ্চয়ী কমিটির সদস্য (সুচনা বহির্ভূত) ).");
                rdoH1011.requestFocus();
                return;
            } else if (!rdoH1021.isChecked() & !rdoH1022.isChecked() & secH102.isShown()) {
                Connection.MessageBox(Savings.this, "Select anyone options from (আপনি কি সুচনা সঞ্চয়ী গ্রুপের সদস্য  ).");
                rdoH1021.requestFocus();
                return;
            } else if (!rdoH1031.isChecked() & !rdoH1032.isChecked() & secH103.isShown()) {
                Connection.MessageBox(Savings.this, "Select anyone options from (আপনার এবং / অথবা আপনার স্ত্রী কোন সঞ্চয় আছে).");
                rdoH1031.requestFocus();
                return;
            } else if (txtH1031.getText().toString().length() == 0 & secH1031.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: ঘরে সঞ্চয়/ মাটির ব্যাঙ্ক/সিন্দুকে সঞ্চয় (টাকা).");
                txtH1031.requestFocus();
                return;
            } else if (Integer.valueOf(txtH1031.getText().toString().length() == 0 ? "0" : txtH1031.getText().toString()) < 0 || Integer.valueOf(txtH1031.getText().toString().length() == 0 ? "999999" : txtH1031.getText().toString()) > 999999) {
                Connection.MessageBox(Savings.this, "Value should be between 0 and 999999(ঘরে সঞ্চয়/ মাটির ব্যাঙ্ক/সিন্দুকে সঞ্চয় (টাকা)).");
                txtH1031.requestFocus();
                return;
            } else if (txtH1032.getText().toString().length() == 0 & secH1032.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: ব্যাংক / পোস্ট অফিস (টাকা).");
                txtH1032.requestFocus();
                return;
            } else if (Integer.valueOf(txtH1032.getText().toString().length() == 0 ? "0" : txtH1032.getText().toString()) < 0 || Integer.valueOf(txtH1032.getText().toString().length() == 0 ? "999999" : txtH1032.getText().toString()) > 999999) {
                Connection.MessageBox(Savings.this, "Value should be between 0 and 999999(ব্যাংক / পোস্ট অফিস (টাকা)).");
                txtH1032.requestFocus();
                return;
            } else if (txtH1033.getText().toString().length() == 0 & secH1033.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: এনজিও (টাকা).");
                txtH1033.requestFocus();
                return;
            } else if (Integer.valueOf(txtH1033.getText().toString().length() == 0 ? "0" : txtH1033.getText().toString()) < 0 || Integer.valueOf(txtH1033.getText().toString().length() == 0 ? "999999" : txtH1033.getText().toString()) > 999999) {
                Connection.MessageBox(Savings.this, "Value should be between 0 and 999999(এনজিও (টাকা)).");
                txtH1033.requestFocus();
                return;
            } else if (txtH1034.getText().toString().length() == 0 & secH1034.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: ক্ষুদ্রঋণ দানকারী প্রতিষ্ঠান (টাকা).");
                txtH1034.requestFocus();
                return;
            } else if (Integer.valueOf(txtH1034.getText().toString().length() == 0 ? "0" : txtH1034.getText().toString()) < 0 || Integer.valueOf(txtH1034.getText().toString().length() == 0 ? "999999" : txtH1034.getText().toString()) > 999999) {
                Connection.MessageBox(Savings.this, "Value should be between 0 and 999999(ক্ষুদ্রঋণ দানকারী প্রতিষ্ঠান (টাকা)).");
                txtH1034.requestFocus();
                return;
            } else if (txtH1035.getText().toString().length() == 0 & secH1035.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: সুচনা সঞ্চয়ী গ্রুপ (টাকা).");
                txtH1035.requestFocus();
                return;
            } else if (Integer.valueOf(txtH1035.getText().toString().length() == 0 ? "0" : txtH1035.getText().toString()) < 0 || Integer.valueOf(txtH1035.getText().toString().length() == 0 ? "999999" : txtH1035.getText().toString()) > 999999) {
                Connection.MessageBox(Savings.this, "Value should be between 0 and 999999(সুচনা সঞ্চয়ী গ্রুপ (টাকা)).");
                txtH1035.requestFocus();
                return;
            } else if (txtH1036.getText().toString().length() == 0 & secH1036.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: অন্যান্য (টাকা).");
                txtH1036.requestFocus();
                return;
            } else if (Integer.valueOf(txtH1036.getText().toString().length() == 0 ? "0" : txtH1036.getText().toString()) < 0 || Integer.valueOf(txtH1036.getText().toString().length() == 0 ? "999999" : txtH1036.getText().toString()) > 999999) {
                Connection.MessageBox(Savings.this, "Value should be between 0 and 999999(অন্যান্য (টাকা)).");
                txtH1036.requestFocus();
                return;
            } else if (spnH1037a.getSelectedItemPosition() == 0 & secH1037a.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: ১. কিসের জন্য সঞ্চয় করছেন.");
                spnH1037a.requestFocus();
                return;
            } else if (spnH1037b.getSelectedItemPosition() == 0 & secH1037b.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: ২.কিসের জন্য সঞ্চয় করছেন.");
                spnH1037b.requestFocus();
                return;
            } else if (spnH1037c.getSelectedItemPosition() == 0 & secH1037c.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: ৩. কিসের জন্য সঞ্চয় করছেন.");
                spnH1037c.requestFocus();
                return;
            } else if (spnH1037d.getSelectedItemPosition() == 0 & secH1037d.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: ৪. কিসের জন্য সঞ্চয় করছেন.");
                spnH1037d.requestFocus();
                return;
            } else if (txtH1037X.getText().toString().length() == 0 & secH1037X.isShown()) {
                Connection.MessageBox(Savings.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH1037X.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            Savings_DataModel objSave = new Savings_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setMSlNo(txtMSlNo.getText().toString());
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
            objSave.setH1034(txtH1034.getText().toString());
            objSave.setH1035(txtH1035.getText().toString());
            objSave.setH1036(txtH1036.getText().toString());
            objSave.setH1037a((spnH1037a.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH1037a.getSelectedItem().toString(), "-")));
            objSave.setH1037b((spnH1037b.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH1037b.getSelectedItem().toString(), "-")));
            objSave.setH1037c((spnH1037c.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH1037c.getSelectedItem().toString(), "-")));
            objSave.setH1037d((spnH1037d.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH1037d.getSelectedItem().toString(), "-")));
            objSave.setH1037X(txtH1037X.getText().toString());
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
                txtMSlNo.setText(item.getMSlNo());
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
                txtH1034.setText(item.getH1034());
                txtH1035.setText(item.getH1035());
                txtH1036.setText(item.getH1036());
                spnH1037a.setSelection(Global.SpinnerItemPositionAnyLength(spnH1037a, item.getH1037a()));
                spnH1037b.setSelection(Global.SpinnerItemPositionAnyLength(spnH1037b, item.getH1037b()));
                spnH1037c.setSelection(Global.SpinnerItemPositionAnyLength(spnH1037c, item.getH1037c()));
                spnH1037d.setSelection(Global.SpinnerItemPositionAnyLength(spnH1037d, item.getH1037d()));
                txtH1037X.setText(item.getH1037X());
            }
        } catch (Exception e) {
            Connection.MessageBox(Savings.this, e.getMessage());
            return;
        }
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