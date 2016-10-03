package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Destruction1" android:label="Destruction1" />

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
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

public class Destruction1 extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    static String H14A = "";
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
    LinearLayout seclb14a1;
    LinearLayout secH14a;
    View lineH14a;
    TextView VlblH14a;
    Spinner spnH14a;
    LinearLayout secH14ax;
    View lineH14ax;
    TextView VlblH14ax;
    EditText txtH14ax;
    LinearLayout secH14a1;
    View lineH14a1;
    TextView VlblH14a1;
    RadioGroup rdogrpH14a1;
    RadioButton rdoH14a11;
    RadioButton rdoH14a12;
    LinearLayout secH14a2;
    View lineH14a2;
    TextView VlblH14a2;
    EditText txtH14a2;
    LinearLayout seclbH14a3;
    LinearLayout secH14a3a;
    View lineH14a3a;
    TextView VlblH14a3a;
    CheckBox chkH14a3a;
    LinearLayout secH14a3b;
    View lineH14a3b;
    TextView VlblH14a3b;
    CheckBox chkH14a3b;
    LinearLayout secH14a3c;
    View lineH14a3c;
    TextView VlblH14a3c;
    CheckBox chkH14a3c;
    LinearLayout secH14a3d;
    View lineH14a3d;
    TextView VlblH14a3d;
    CheckBox chkH14a3d;
    LinearLayout secH14a3e;
    View lineH14a3e;
    TextView VlblH14a3e;
    CheckBox chkH14a3e;
    LinearLayout secH14a3f;
    View lineH14a3f;
    TextView VlblH14a3f;
    CheckBox chkH14a3f;
    LinearLayout secH14a3g;
    View lineH14a3g;
    TextView VlblH14a3g;
    CheckBox chkH14a3g;
    LinearLayout secH14a3h;
    View lineH14a3h;
    TextView VlblH14a3h;
    CheckBox chkH14a3h;
    LinearLayout secH14a3i;
    View lineH14a3i;
    TextView VlblH14a3i;
    CheckBox chkH14a3i;
    LinearLayout secH14a3j;
    View lineH14a3j;
    TextView VlblH14a3j;
    CheckBox chkH14a3j;
    LinearLayout secH14a3k;
    View lineH14a3k;
    TextView VlblH14a3k;
    CheckBox chkH14a3k;
    LinearLayout secH14a3l;
    View lineH14a3l;
    TextView VlblH14a3l;
    CheckBox chkH14a3l;
    LinearLayout secH14a3m;
    View lineH14a3m;
    TextView VlblH14a3m;
    CheckBox chkH14a3m;
    LinearLayout secH14a3x;
    View lineH14a3x;
    TextView VlblH14a3x;
    CheckBox chkH14a3x;
    LinearLayout secH14a3x1;
    View lineH14a3x1;
    TextView VlblH14a3x1;
    EditText txtH14a3x1;
    LinearLayout secH14a3x2;
    View lineH14a3x2;
    TextView VlblH14a3x2;
    EditText txtH14a3x2;
    LinearLayout secH14a3x3;
    View lineH14a3x3;
    TextView VlblH14a3x3;
    EditText txtH14a3x3;
    LinearLayout seclbH14a4;
    LinearLayout secH14a4a;
    View lineH14a4a;
    TextView VlblH14a4a;
    CheckBox chkH14a4a;
    LinearLayout secH14a4b;
    View lineH14a4b;
    TextView VlblH14a4b;
    CheckBox chkH14a4b;
    LinearLayout secH14a4c;
    View lineH14a4c;
    TextView VlblH14a4c;
    CheckBox chkH14a4c;
    LinearLayout secH14a4d;
    View lineH14a4d;
    TextView VlblH14a4d;
    CheckBox chkH14a4d;
    LinearLayout secH14a4e;
    View lineH14a4e;
    TextView VlblH14a4e;
    CheckBox chkH14a4e;
    LinearLayout secH14a4f;
    View lineH14a4f;
    TextView VlblH14a4f;
    CheckBox chkH14a4f;
    LinearLayout secH14a4g;
    View lineH14a4g;
    TextView VlblH14a4g;
    CheckBox chkH14a4g;
    LinearLayout secH14a4h;
    View lineH14a4h;
    TextView VlblH14a4h;
    CheckBox chkH14a4h;
    LinearLayout secH14a4i;
    View lineH14a4i;
    TextView VlblH14a4i;
    CheckBox chkH14a4i;
    LinearLayout secH14a4j;
    View lineH14a4j;
    TextView VlblH14a4j;
    CheckBox chkH14a4j;
    LinearLayout secH14a4k;
    View lineH14a4k;
    TextView VlblH14a4k;
    CheckBox chkH14a4k;
    LinearLayout secH14a4l;
    View lineH14a4l;
    TextView VlblH14a4l;
    CheckBox chkH14a4l;
    LinearLayout secH14a4m;
    View lineH14a4m;
    TextView VlblH14a4m;
    CheckBox chkH14a4m;
    LinearLayout secH14a14n;
    View lineH14a14n;
    TextView VlblH14a14n;
    CheckBox chkH14a14n;
    LinearLayout secH14a4x;
    View lineH14a4x;
    TextView VlblH14a4x;
    CheckBox chkH14a4x;
    LinearLayout secH14a4x1;
    View lineH14a4x1;
    TextView VlblH14a4x1;
    EditText txtH14a4x1;
    LinearLayout secH14a4x2;
    View lineH14a4x2;
    TextView VlblH14a4x2;
    EditText txtH14a4x2;
    LinearLayout secH14a4x3;
    View lineH14a4x3;
    TextView VlblH14a4x3;
    EditText txtH14a4x3;
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
            setContentView(R.layout.destruction1);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");
            H14A = IDbundle.getString("H14a");

            TableName = "Destruction1";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);
            cmdSave = (Button) findViewById(R.id.cmdSave);
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

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Destruction1.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), HFIAS.class);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(Destruction1.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to start Destruction 2 [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Destruction2.class);
                            intent.putExtras(IDbundle);
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
            seclb14a1 = (LinearLayout) findViewById(R.id.seclb14a1);


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
                    spnH14a.setSelection(Integer.valueOf((((Button) v).getText().toString())));


                }
            });
            buttonAssetType02.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH14a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType03.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH14a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType04.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH14a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType05.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH14a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType06.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH14a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType07.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH14a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType08.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH14a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType09.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH14a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH14a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH14a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH14a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH14a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH14a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH14a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH14a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH14a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH14a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH14a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH14a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });

            secH14a = (LinearLayout) findViewById(R.id.secH14a);
            lineH14a = (View) findViewById(R.id.lineH14a);

            spnH14a = (Spinner) findViewById(R.id.spnH14a);
            List<String> listH14a = new ArrayList<String>();

            listH14a.add("");
            listH14a.add("01-প্রাকৃতিক দূর্যোগে ঘর সাংঘাতিক ভাবে ক্ষতিগ্রস্থ হয়েছে  ");
            listH14a.add("02-কোনো প্রাকৃতিক দূর্যোগে শস্যহানি ঘটেছে  ");
            listH14a.add("03-পরিবারের উপার্জনকারী সদস্যের মারাত্মক অসুস্থতা ");
            listH14a.add("04-পরিবারের অ-উপার্জনকারী  সদস্যের মারাত্মক অসুস্থতা ");
            listH14a.add("05-পরিবারের উপার্জনকারী  সদস্যের মৃত্যু ");
            listH14a.add("06-পরিবারের অ-উপার্জনকারী সদস্যের মৃত্যু  ");
            listH14a.add("07-খানার সদস্যের বিবাহ ");
            listH14a.add("08-বিবাহ বিচ্ছে ");
            listH14a.add("09- বিবাহ পরিত্যক্ত /পৃথক ");
            listH14a.add("10-পরিবারের উপার্জনকারী সদস্যের বিচ্ছেদ/পৃথক");
            listH14a.add("11-ভূমির ক্ষয়ক্ষতি ");
            listH14a.add("12-প্রাকৃতিক দূর্যোগে গবাদিপশু/হাস-মুরগির ক্ষয়ক্ষতি ");
            listH14a.add("13-অন্যের দ্বারা গবাদিপশুর ক্ষয়ক্ষতি/বিষ প্রয়োগ ");
            listH14a.add("14-মামলা মোকাদ্দমা /কলহ ");
            listH14a.add("15-চুরি ");
            listH14a.add("16-ছিনতাই/ ডাকাতি ");
            listH14a.add("17-চলাফেরায় সীমাবদ্ধতা আরোপ");
            listH14a.add("18-পারিবারিক নির্যাতন ");
            listH14a.add("19-একান্নবর্তী পরিবার ভেঙ্গে যাওয়া ");
            listH14a.add("20-অন্যান্য (নির্দিষ্ট করুন) ");
            ArrayAdapter<String> adptrH14a = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH14a);
            spnH14a.setAdapter(adptrH14a);
            spnH14a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH14a.getSelectedItem().toString().length() == 0) return;

                    String spnData = Connection.SelectedSpinnerValue(spnH14a.getSelectedItem().toString(), "-");
                    DataSearchPartial(txtRnd.getText().toString(), txtSuchanaID.getText().toString(), spnData);

                    if (spnData.equals("20")) {
                        secH14ax.setVisibility(View.VISIBLE);
                    } else {
                        txtH14ax.setText("");
                        secH14ax.setVisibility(View.GONE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });

            spnH14a.setClickable(false);
            spnH14a.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    if (event.getAction() == MotionEvent.ACTION_UP) {
                        // Toast.makeText(SpinnerActivity.this, "Catch it!", Toast.LENGTH_SHORT).show();
                    }
                    return true;
                }
            });

            secH14ax = (LinearLayout) findViewById(R.id.secH14ax);
            lineH14ax = (View) findViewById(R.id.lineH14ax);
            VlblH14ax = (TextView) findViewById(R.id.VlblH14ax);
            txtH14ax = (EditText) findViewById(R.id.txtH14ax);
            secH14ax.setVisibility(View.GONE);
            secH14a1 = (LinearLayout) findViewById(R.id.secH14a1);
            lineH14a1 = (View) findViewById(R.id.lineH14a1);
            VlblH14a1 = (TextView) findViewById(R.id.VlblH14a1);
            rdogrpH14a1 = (RadioGroup) findViewById(R.id.rdogrpH14a1);

            rdoH14a11 = (RadioButton) findViewById(R.id.rdoH14a11);
            rdoH14a12 = (RadioButton) findViewById(R.id.rdoH14a12);
            rdogrpH14a1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {

                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH14a1 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH14a1.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH14a1.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH14a1[i];
                    }


                    if (rbData.equalsIgnoreCase("0")) {
                        secH14a2.setVisibility(View.GONE);
                        lineH14a2.setVisibility(View.GONE);
                        txtH14a2.setText("");
                        secH14a3a.setVisibility(View.GONE);
                        lineH14a3a.setVisibility(View.GONE);
                        chkH14a3a.setChecked(false);
                        secH14a3b.setVisibility(View.GONE);
                        lineH14a3b.setVisibility(View.GONE);
                        chkH14a3b.setChecked(false);
                        secH14a3c.setVisibility(View.GONE);
                        lineH14a3c.setVisibility(View.GONE);
                        chkH14a3c.setChecked(false);
                        secH14a3d.setVisibility(View.GONE);
                        lineH14a3d.setVisibility(View.GONE);
                        chkH14a3d.setChecked(false);
                        secH14a3e.setVisibility(View.GONE);
                        lineH14a3e.setVisibility(View.GONE);
                        chkH14a3e.setChecked(false);
                        secH14a3f.setVisibility(View.GONE);
                        lineH14a3f.setVisibility(View.GONE);
                        chkH14a3f.setChecked(false);
                        secH14a3g.setVisibility(View.GONE);
                        lineH14a3g.setVisibility(View.GONE);
                        chkH14a3g.setChecked(false);
                        secH14a3h.setVisibility(View.GONE);
                        lineH14a3h.setVisibility(View.GONE);
                        chkH14a3h.setChecked(false);
                        secH14a3i.setVisibility(View.GONE);
                        lineH14a3i.setVisibility(View.GONE);
                        chkH14a3i.setChecked(false);
                        secH14a3j.setVisibility(View.GONE);
                        lineH14a3j.setVisibility(View.GONE);
                        chkH14a3j.setChecked(false);
                        secH14a3k.setVisibility(View.GONE);
                        lineH14a3k.setVisibility(View.GONE);
                        chkH14a3k.setChecked(false);
                        secH14a3l.setVisibility(View.GONE);
                        lineH14a3l.setVisibility(View.GONE);
                        chkH14a3l.setChecked(false);
                        secH14a3m.setVisibility(View.GONE);
                        lineH14a3m.setVisibility(View.GONE);
                        chkH14a3m.setChecked(false);
                        secH14a3x.setVisibility(View.GONE);
                        lineH14a3x.setVisibility(View.GONE);
                        chkH14a3x.setChecked(false);
                        secH14a3x1.setVisibility(View.GONE);
                        lineH14a3x1.setVisibility(View.GONE);
                        txtH14a3x1.setText("");
                        secH14a3x2.setVisibility(View.GONE);
                        lineH14a3x2.setVisibility(View.GONE);
                        txtH14a3x2.setText("");
                        secH14a3x3.setVisibility(View.GONE);
                        lineH14a3x3.setVisibility(View.GONE);
                        txtH14a3x3.setText("");
                        secH14a4a.setVisibility(View.GONE);
                        lineH14a4a.setVisibility(View.GONE);
                        chkH14a4a.setChecked(false);
                        secH14a4b.setVisibility(View.GONE);
                        lineH14a4b.setVisibility(View.GONE);
                        chkH14a4b.setChecked(false);
                        secH14a4c.setVisibility(View.GONE);
                        lineH14a4c.setVisibility(View.GONE);
                        chkH14a4c.setChecked(false);
                        secH14a4d.setVisibility(View.GONE);
                        lineH14a4d.setVisibility(View.GONE);
                        chkH14a4d.setChecked(false);
                        secH14a4e.setVisibility(View.GONE);
                        lineH14a4e.setVisibility(View.GONE);
                        chkH14a4e.setChecked(false);
                        secH14a4f.setVisibility(View.GONE);
                        lineH14a4f.setVisibility(View.GONE);
                        chkH14a4f.setChecked(false);
                        secH14a4g.setVisibility(View.GONE);
                        lineH14a4g.setVisibility(View.GONE);
                        chkH14a4g.setChecked(false);
                        secH14a4h.setVisibility(View.GONE);
                        lineH14a4h.setVisibility(View.GONE);
                        chkH14a4h.setChecked(false);
                        secH14a4i.setVisibility(View.GONE);
                        lineH14a4i.setVisibility(View.GONE);
                        chkH14a4i.setChecked(false);
                        secH14a4j.setVisibility(View.GONE);
                        lineH14a4j.setVisibility(View.GONE);
                        chkH14a4j.setChecked(false);
                        secH14a4k.setVisibility(View.GONE);
                        lineH14a4k.setVisibility(View.GONE);
                        chkH14a4k.setChecked(false);
                        secH14a4l.setVisibility(View.GONE);
                        lineH14a4l.setVisibility(View.GONE);
                        chkH14a4l.setChecked(false);
                        secH14a4m.setVisibility(View.GONE);
                        lineH14a4m.setVisibility(View.GONE);
                        chkH14a4m.setChecked(false);
                        secH14a14n.setVisibility(View.GONE);
                        lineH14a14n.setVisibility(View.GONE);
                        chkH14a14n.setChecked(false);
                        secH14a4x.setVisibility(View.GONE);
                        lineH14a4x.setVisibility(View.GONE);
                        chkH14a4x.setChecked(false);
                        secH14a4x1.setVisibility(View.GONE);
                        lineH14a4x1.setVisibility(View.GONE);
                        txtH14a4x1.setText("");
                        secH14a4x2.setVisibility(View.GONE);
                        lineH14a4x2.setVisibility(View.GONE);
                        txtH14a4x2.setText("");
                        secH14a4x3.setVisibility(View.GONE);
                        lineH14a4x3.setVisibility(View.GONE);
                        txtH14a4x3.setText("");
                        seclbH14a3.setVisibility(View.GONE);
                        seclbH14a4.setVisibility(View.GONE);
                    } else {
                        secH14a2.setVisibility(View.VISIBLE);
                        lineH14a2.setVisibility(View.VISIBLE);
                        secH14a3a.setVisibility(View.VISIBLE);
                        lineH14a3a.setVisibility(View.VISIBLE);
                        secH14a3b.setVisibility(View.VISIBLE);
                        lineH14a3b.setVisibility(View.VISIBLE);
                        secH14a3c.setVisibility(View.VISIBLE);
                        lineH14a3c.setVisibility(View.VISIBLE);
                        secH14a3d.setVisibility(View.VISIBLE);
                        lineH14a3d.setVisibility(View.VISIBLE);
                        secH14a3e.setVisibility(View.VISIBLE);
                        lineH14a3e.setVisibility(View.VISIBLE);
                        secH14a3f.setVisibility(View.VISIBLE);
                        lineH14a3f.setVisibility(View.VISIBLE);
                        secH14a3g.setVisibility(View.VISIBLE);
                        lineH14a3g.setVisibility(View.VISIBLE);
                        secH14a3h.setVisibility(View.VISIBLE);
                        lineH14a3h.setVisibility(View.VISIBLE);
                        secH14a3i.setVisibility(View.VISIBLE);
                        lineH14a3i.setVisibility(View.VISIBLE);
                        secH14a3j.setVisibility(View.VISIBLE);
                        lineH14a3j.setVisibility(View.VISIBLE);
                        secH14a3k.setVisibility(View.VISIBLE);
                        lineH14a3k.setVisibility(View.VISIBLE);
                        secH14a3l.setVisibility(View.VISIBLE);
                        lineH14a3l.setVisibility(View.VISIBLE);
                        secH14a3m.setVisibility(View.VISIBLE);
                        lineH14a3m.setVisibility(View.VISIBLE);
                        secH14a3x.setVisibility(View.VISIBLE);
                        lineH14a3x.setVisibility(View.VISIBLE);/*
                        secH14a3x1.setVisibility(View.VISIBLE);
                        lineH14a3x1.setVisibility(View.VISIBLE);
                        secH14a3x2.setVisibility(View.VISIBLE);
                        lineH14a3x2.setVisibility(View.VISIBLE);
                        secH14a3x3.setVisibility(View.VISIBLE);
                        lineH14a3x3.setVisibility(View.VISIBLE);*/
                        secH14a4a.setVisibility(View.VISIBLE);
                        lineH14a4a.setVisibility(View.VISIBLE);
                        secH14a4b.setVisibility(View.VISIBLE);
                        lineH14a4b.setVisibility(View.VISIBLE);
                        secH14a4c.setVisibility(View.VISIBLE);
                        lineH14a4c.setVisibility(View.VISIBLE);
                        secH14a4d.setVisibility(View.VISIBLE);
                        lineH14a4d.setVisibility(View.VISIBLE);
                        secH14a4e.setVisibility(View.VISIBLE);
                        lineH14a4e.setVisibility(View.VISIBLE);
                        secH14a4f.setVisibility(View.VISIBLE);
                        lineH14a4f.setVisibility(View.VISIBLE);
                        secH14a4g.setVisibility(View.VISIBLE);
                        lineH14a4g.setVisibility(View.VISIBLE);
                        secH14a4h.setVisibility(View.VISIBLE);
                        lineH14a4h.setVisibility(View.VISIBLE);
                        secH14a4i.setVisibility(View.VISIBLE);
                        lineH14a4i.setVisibility(View.VISIBLE);
                        secH14a4j.setVisibility(View.VISIBLE);
                        lineH14a4j.setVisibility(View.VISIBLE);
                        secH14a4k.setVisibility(View.VISIBLE);
                        lineH14a4k.setVisibility(View.VISIBLE);
                        secH14a4l.setVisibility(View.VISIBLE);
                        lineH14a4l.setVisibility(View.VISIBLE);
                        secH14a4m.setVisibility(View.VISIBLE);
                        lineH14a4m.setVisibility(View.VISIBLE);
                        secH14a14n.setVisibility(View.VISIBLE);
                        lineH14a14n.setVisibility(View.VISIBLE);
                        secH14a4x.setVisibility(View.VISIBLE);
                        lineH14a4x.setVisibility(View.VISIBLE);/*
                        secH14a4x1.setVisibility(View.VISIBLE);
                        lineH14a4x1.setVisibility(View.VISIBLE);
                        secH14a4x2.setVisibility(View.VISIBLE);
                        lineH14a4x2.setVisibility(View.VISIBLE);
                        secH14a4x3.setVisibility(View.VISIBLE);
                        lineH14a4x3.setVisibility(View.VISIBLE);*/

                        seclbH14a3.setVisibility(View.VISIBLE);
                        seclbH14a4.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH14a2 = (LinearLayout) findViewById(R.id.secH14a2);
            lineH14a2 = (View) findViewById(R.id.lineH14a2);
            VlblH14a2 = (TextView) findViewById(R.id.VlblH14a2);
            txtH14a2 = (EditText) findViewById(R.id.txtH14a2);
            seclbH14a3 = (LinearLayout) findViewById(R.id.seclbH14a3);
            secH14a3a = (LinearLayout) findViewById(R.id.secH14a3a);
            lineH14a3a = (View) findViewById(R.id.lineH14a3a);
            VlblH14a3a = (TextView) findViewById(R.id.VlblH14a3a);
            chkH14a3a = (CheckBox) findViewById(R.id.chkH14a3a);
            secH14a3b = (LinearLayout) findViewById(R.id.secH14a3b);
            lineH14a3b = (View) findViewById(R.id.lineH14a3b);
            VlblH14a3b = (TextView) findViewById(R.id.VlblH14a3b);
            chkH14a3b = (CheckBox) findViewById(R.id.chkH14a3b);
            secH14a3c = (LinearLayout) findViewById(R.id.secH14a3c);
            lineH14a3c = (View) findViewById(R.id.lineH14a3c);
            VlblH14a3c = (TextView) findViewById(R.id.VlblH14a3c);
            chkH14a3c = (CheckBox) findViewById(R.id.chkH14a3c);
            secH14a3d = (LinearLayout) findViewById(R.id.secH14a3d);
            lineH14a3d = (View) findViewById(R.id.lineH14a3d);
            VlblH14a3d = (TextView) findViewById(R.id.VlblH14a3d);
            chkH14a3d = (CheckBox) findViewById(R.id.chkH14a3d);
            secH14a3e = (LinearLayout) findViewById(R.id.secH14a3e);
            lineH14a3e = (View) findViewById(R.id.lineH14a3e);
            VlblH14a3e = (TextView) findViewById(R.id.VlblH14a3e);
            chkH14a3e = (CheckBox) findViewById(R.id.chkH14a3e);
            secH14a3f = (LinearLayout) findViewById(R.id.secH14a3f);
            lineH14a3f = (View) findViewById(R.id.lineH14a3f);
            VlblH14a3f = (TextView) findViewById(R.id.VlblH14a3f);
            chkH14a3f = (CheckBox) findViewById(R.id.chkH14a3f);
            secH14a3g = (LinearLayout) findViewById(R.id.secH14a3g);
            lineH14a3g = (View) findViewById(R.id.lineH14a3g);
            VlblH14a3g = (TextView) findViewById(R.id.VlblH14a3g);
            chkH14a3g = (CheckBox) findViewById(R.id.chkH14a3g);
            secH14a3h = (LinearLayout) findViewById(R.id.secH14a3h);
            lineH14a3h = (View) findViewById(R.id.lineH14a3h);
            VlblH14a3h = (TextView) findViewById(R.id.VlblH14a3h);
            chkH14a3h = (CheckBox) findViewById(R.id.chkH14a3h);
            secH14a3i = (LinearLayout) findViewById(R.id.secH14a3i);
            lineH14a3i = (View) findViewById(R.id.lineH14a3i);
            VlblH14a3i = (TextView) findViewById(R.id.VlblH14a3i);
            chkH14a3i = (CheckBox) findViewById(R.id.chkH14a3i);
            secH14a3j = (LinearLayout) findViewById(R.id.secH14a3j);
            lineH14a3j = (View) findViewById(R.id.lineH14a3j);
            VlblH14a3j = (TextView) findViewById(R.id.VlblH14a3j);
            chkH14a3j = (CheckBox) findViewById(R.id.chkH14a3j);
            secH14a3k = (LinearLayout) findViewById(R.id.secH14a3k);
            lineH14a3k = (View) findViewById(R.id.lineH14a3k);
            VlblH14a3k = (TextView) findViewById(R.id.VlblH14a3k);
            chkH14a3k = (CheckBox) findViewById(R.id.chkH14a3k);
            secH14a3l = (LinearLayout) findViewById(R.id.secH14a3l);
            lineH14a3l = (View) findViewById(R.id.lineH14a3l);
            VlblH14a3l = (TextView) findViewById(R.id.VlblH14a3l);
            chkH14a3l = (CheckBox) findViewById(R.id.chkH14a3l);
            secH14a3m = (LinearLayout) findViewById(R.id.secH14a3m);
            lineH14a3m = (View) findViewById(R.id.lineH14a3m);
            VlblH14a3m = (TextView) findViewById(R.id.VlblH14a3m);
            chkH14a3m = (CheckBox) findViewById(R.id.chkH14a3m);
            secH14a3x = (LinearLayout) findViewById(R.id.secH14a3x);
            lineH14a3x = (View) findViewById(R.id.lineH14a3x);
            VlblH14a3x = (TextView) findViewById(R.id.VlblH14a3x);
            chkH14a3x = (CheckBox) findViewById(R.id.chkH14a3x);
            chkH14a3x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        secH14a3x1.setVisibility(View.VISIBLE);
                        secH14a3x2.setVisibility(View.VISIBLE);
                        secH14a3x3.setVisibility(View.VISIBLE);

                        lineH14a3x1.setVisibility(View.VISIBLE);
                        lineH14a3x2.setVisibility(View.VISIBLE);
                        lineH14a3x3.setVisibility(View.VISIBLE);

                    } else {
                        txtH14a3x1.setText("");
                        txtH14a3x2.setText("");
                        txtH14a3x3.setText("");
                        secH14a3x1.setVisibility(View.GONE);
                        secH14a3x2.setVisibility(View.GONE);
                        secH14a3x3.setVisibility(View.GONE);
                        lineH14a3x1.setVisibility(View.GONE);
                        lineH14a3x2.setVisibility(View.GONE);
                        lineH14a3x3.setVisibility(View.GONE);

                    }
                }
            });
            secH14a3x1 = (LinearLayout) findViewById(R.id.secH14a3x1);
            lineH14a3x1 = (View) findViewById(R.id.lineH14a3x1);
            VlblH14a3x1 = (TextView) findViewById(R.id.VlblH14a3x1);
            txtH14a3x1 = (EditText) findViewById(R.id.txtH14a3x1);
            secH14a3x2 = (LinearLayout) findViewById(R.id.secH14a3x2);
            lineH14a3x2 = (View) findViewById(R.id.lineH14a3x2);
            VlblH14a3x2 = (TextView) findViewById(R.id.VlblH14a3x2);
            txtH14a3x2 = (EditText) findViewById(R.id.txtH14a3x2);
            secH14a3x3 = (LinearLayout) findViewById(R.id.secH14a3x3);
            lineH14a3x3 = (View) findViewById(R.id.lineH14a3x3);
            VlblH14a3x3 = (TextView) findViewById(R.id.VlblH14a3x3);
            txtH14a3x3 = (EditText) findViewById(R.id.txtH14a3x3);
            seclbH14a4 = (LinearLayout) findViewById(R.id.seclbH14a4);
            secH14a4a = (LinearLayout) findViewById(R.id.secH14a4a);
            lineH14a4a = (View) findViewById(R.id.lineH14a4a);
            VlblH14a4a = (TextView) findViewById(R.id.VlblH14a4a);
            chkH14a4a = (CheckBox) findViewById(R.id.chkH14a4a);
            secH14a4b = (LinearLayout) findViewById(R.id.secH14a4b);
            lineH14a4b = (View) findViewById(R.id.lineH14a4b);
            VlblH14a4b = (TextView) findViewById(R.id.VlblH14a4b);
            chkH14a4b = (CheckBox) findViewById(R.id.chkH14a4b);
            secH14a4c = (LinearLayout) findViewById(R.id.secH14a4c);
            lineH14a4c = (View) findViewById(R.id.lineH14a4c);
            VlblH14a4c = (TextView) findViewById(R.id.VlblH14a4c);
            chkH14a4c = (CheckBox) findViewById(R.id.chkH14a4c);
            secH14a4d = (LinearLayout) findViewById(R.id.secH14a4d);
            lineH14a4d = (View) findViewById(R.id.lineH14a4d);
            VlblH14a4d = (TextView) findViewById(R.id.VlblH14a4d);
            chkH14a4d = (CheckBox) findViewById(R.id.chkH14a4d);
            secH14a4e = (LinearLayout) findViewById(R.id.secH14a4e);
            lineH14a4e = (View) findViewById(R.id.lineH14a4e);
            VlblH14a4e = (TextView) findViewById(R.id.VlblH14a4e);
            chkH14a4e = (CheckBox) findViewById(R.id.chkH14a4e);
            secH14a4f = (LinearLayout) findViewById(R.id.secH14a4f);
            lineH14a4f = (View) findViewById(R.id.lineH14a4f);
            VlblH14a4f = (TextView) findViewById(R.id.VlblH14a4f);
            chkH14a4f = (CheckBox) findViewById(R.id.chkH14a4f);
            secH14a4g = (LinearLayout) findViewById(R.id.secH14a4g);
            lineH14a4g = (View) findViewById(R.id.lineH14a4g);
            VlblH14a4g = (TextView) findViewById(R.id.VlblH14a4g);
            chkH14a4g = (CheckBox) findViewById(R.id.chkH14a4g);
            secH14a4h = (LinearLayout) findViewById(R.id.secH14a4h);
            lineH14a4h = (View) findViewById(R.id.lineH14a4h);
            VlblH14a4h = (TextView) findViewById(R.id.VlblH14a4h);
            chkH14a4h = (CheckBox) findViewById(R.id.chkH14a4h);
            secH14a4i = (LinearLayout) findViewById(R.id.secH14a4i);
            lineH14a4i = (View) findViewById(R.id.lineH14a4i);
            VlblH14a4i = (TextView) findViewById(R.id.VlblH14a4i);
            chkH14a4i = (CheckBox) findViewById(R.id.chkH14a4i);
            secH14a4j = (LinearLayout) findViewById(R.id.secH14a4j);
            lineH14a4j = (View) findViewById(R.id.lineH14a4j);
            VlblH14a4j = (TextView) findViewById(R.id.VlblH14a4j);
            chkH14a4j = (CheckBox) findViewById(R.id.chkH14a4j);
            secH14a4k = (LinearLayout) findViewById(R.id.secH14a4k);
            lineH14a4k = (View) findViewById(R.id.lineH14a4k);
            VlblH14a4k = (TextView) findViewById(R.id.VlblH14a4k);
            chkH14a4k = (CheckBox) findViewById(R.id.chkH14a4k);
            secH14a4l = (LinearLayout) findViewById(R.id.secH14a4l);
            lineH14a4l = (View) findViewById(R.id.lineH14a4l);
            VlblH14a4l = (TextView) findViewById(R.id.VlblH14a4l);
            chkH14a4l = (CheckBox) findViewById(R.id.chkH14a4l);
            secH14a4m = (LinearLayout) findViewById(R.id.secH14a4m);
            lineH14a4m = (View) findViewById(R.id.lineH14a4m);
            VlblH14a4m = (TextView) findViewById(R.id.VlblH14a4m);
            chkH14a4m = (CheckBox) findViewById(R.id.chkH14a4m);
            secH14a14n = (LinearLayout) findViewById(R.id.secH14a14n);
            lineH14a14n = (View) findViewById(R.id.lineH14a14n);
            VlblH14a14n = (TextView) findViewById(R.id.VlblH14a14n);
            chkH14a14n = (CheckBox) findViewById(R.id.chkH14a14n);
            secH14a4x = (LinearLayout) findViewById(R.id.secH14a4x);
            lineH14a4x = (View) findViewById(R.id.lineH14a4x);
            VlblH14a4x = (TextView) findViewById(R.id.VlblH14a4x);
            chkH14a4x = (CheckBox) findViewById(R.id.chkH14a4x);
            chkH14a4x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        secH14a4x1.setVisibility(View.VISIBLE);
                        secH14a4x2.setVisibility(View.VISIBLE);
                        secH14a4x3.setVisibility(View.VISIBLE);
                        lineH14a4x1.setVisibility(View.VISIBLE);
                        lineH14a4x2.setVisibility(View.VISIBLE);
                        lineH14a4x3.setVisibility(View.VISIBLE);
                    } else {
                        txtH14a4x1.setText("");
                        txtH14a4x2.setText("");
                        txtH14a4x3.setText("");
                        secH14a4x1.setVisibility(View.GONE);
                        secH14a4x2.setVisibility(View.GONE);
                        secH14a4x3.setVisibility(View.GONE);
                        lineH14a4x1.setVisibility(View.GONE);
                        lineH14a4x2.setVisibility(View.GONE);
                        lineH14a4x3.setVisibility(View.GONE);

                    }
                }
            });
            secH14a4x1 = (LinearLayout) findViewById(R.id.secH14a4x1);
            lineH14a4x1 = (View) findViewById(R.id.lineH14a4x1);
            VlblH14a4x1 = (TextView) findViewById(R.id.VlblH14a4x1);
            txtH14a4x1 = (EditText) findViewById(R.id.txtH14a4x1);
            secH14a4x2 = (LinearLayout) findViewById(R.id.secH14a4x2);
            lineH14a4x2 = (View) findViewById(R.id.lineH14a4x2);
            VlblH14a4x2 = (TextView) findViewById(R.id.VlblH14a4x2);
            txtH14a4x2 = (EditText) findViewById(R.id.txtH14a4x2);
            secH14a4x3 = (LinearLayout) findViewById(R.id.secH14a4x3);
            lineH14a4x3 = (View) findViewById(R.id.lineH14a4x3);
            VlblH14a4x3 = (TextView) findViewById(R.id.VlblH14a4x3);
            txtH14a4x3 = (EditText) findViewById(R.id.txtH14a4x3);

            secH14a3x1.setVisibility(View.GONE);
            secH14a3x2.setVisibility(View.GONE);
            secH14a3x3.setVisibility(View.GONE);
            lineH14a3x1.setVisibility(View.GONE);
            lineH14a3x2.setVisibility(View.GONE);
            lineH14a3x3.setVisibility(View.GONE);

            secH14a4x1.setVisibility(View.GONE);
            secH14a4x2.setVisibility(View.GONE);
            secH14a4x3.setVisibility(View.GONE);
            lineH14a4x1.setVisibility(View.GONE);
            lineH14a4x2.setVisibility(View.GONE);
            lineH14a4x3.setVisibility(View.GONE);

            txtRnd.setText(RND);
            txtSuchanaID.setText(SUCHANAID);
            txtRnd.setEnabled(false);
            txtSuchanaID.setEnabled(false);
            secH14a3x1.setVisibility(View.GONE);
            lineH14a3x1.setVisibility(View.GONE);
            secH14a3x2.setVisibility(View.GONE);
            lineH14a3x2.setVisibility(View.GONE);
            secH14a3x3.setVisibility(View.GONE);
            lineH14a3x3.setVisibility(View.GONE);
            secH14a4x1.setVisibility(View.GONE);
            lineH14a4x1.setVisibility(View.GONE);
            secH14a4x2.setVisibility(View.GONE);
            lineH14a4x2.setVisibility(View.GONE);
            secH14a4x3.setVisibility(View.GONE);
            lineH14a4x3.setVisibility(View.GONE);


            DataSearch(RND, SUCHANAID, H14A);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(Destruction1.this, e.getMessage());
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

        Destruction1_DataModel d = new Destruction1_DataModel();
        String SQL = "Select H14a from " + TableName + "  Where Rnd='" + txtRnd.getText().toString() + "' and SuchanaID='" + txtSuchanaID.getText().toString() + "'";
        List<Destruction1_DataModel> data = d.SelectH14a(this, SQL);
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

        for (Destruction1_DataModel item : data) {

            int code = Integer.valueOf(item.getH14a());
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
    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(Destruction1.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(Destruction1.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(Destruction1.this, "Required field: উপকারভোগী সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (spnH14a.getSelectedItemPosition() == 0 & secH14a.isShown()) {
                Connection.MessageBox(Destruction1.this, "Required field: .");
                spnH14a.requestFocus();
                return;
            } else if (txtH14ax.getText().toString().length() == 0 & secH14ax.isShown()) {
                Connection.MessageBox(Destruction1.this, "Required field: উল্লেখ কর.");
                txtH14ax.requestFocus();
                return;
            } else if (!rdoH14a11.isChecked() & !rdoH14a12.isChecked() & secH14a1.isShown()) {
                Connection.MessageBox(Destruction1.this, "Select anyone options from (এই ঘটনাটি কি বিগত ১২ মাসে মধ্যে ঘটেছে).");
                rdoH14a11.requestFocus();
                return;
            } else if (txtH14a2.getText().toString().length() == 0 & secH14a2.isShown()) {
                Connection.MessageBox(Destruction1.this, "Required field: আপনি কত টাকা  খরচ করেছেন অথবা কত ক্ষতি হয়েছে.");
                txtH14a2.requestFocus();
                return;
            } else if (Integer.valueOf(txtH14a2.getText().toString().length() == 0 ? "1" : txtH14a2.getText().toString()) < 1 || Integer.valueOf(txtH14a2.getText().toString().length() == 0 ? "999999" : txtH14a2.getText().toString()) > 999999) {
                Connection.MessageBox(Destruction1.this, "Value should be between 1 and 999999(আপনি কত টাকা  খরচ করেছেন অথবা কত ক্ষতি হয়েছে).");
                txtH14a2.requestFocus();
                return;
            } else if (secH14a3a.isShown() & (!chkH14a3a.isChecked() &
                    !chkH14a3b.isChecked() &
                    !chkH14a3c.isChecked() &
                    !chkH14a3d.isChecked() &
                    !chkH14a3e.isChecked() &
                    !chkH14a3f.isChecked() &
                    !chkH14a3g.isChecked() &
                    !chkH14a3h.isChecked() &
                    !chkH14a3i.isChecked() &
                    !chkH14a3j.isChecked() &
                    !chkH14a3k.isChecked() &
                    !chkH14a3l.isChecked() &
                    !chkH14a3m.isChecked() &
                    !chkH14a3x.isChecked())) {
                Connection.MessageBox(Destruction1.this, "Required field: CheckList থেকে কমপক্ষে একটি অপশন সিলেক্ট করুন !");
                secH14a3a.requestFocus();
                return;
            } else if (txtH14a3x1.getText().toString().length() == 0 & secH14a3x1.isShown()) {
                Connection.MessageBox(Destruction1.this, "Required field: নির্দিষ্ট করুন.");
                txtH14a3x1.requestFocus();
                return;
            } /*else if (txtH14a3x2.getText().toString().length() == 0 & secH14a3x2.isShown()) {
                Connection.MessageBox(Destruction1.this, "Required field: উল্লেখ কর.");
                txtH14a3x2.requestFocus();
                return;
            } else if (txtH14a3x3.getText().toString().length() == 0 & secH14a3x3.isShown()) {
                Connection.MessageBox(Destruction1.this, "Required field: উল্লেখ কর.");
                txtH14a3x3.requestFocus();
                return;

            }*/ else if (secH14a4a.isShown() & (!chkH14a4a.isChecked() &
                    !chkH14a4b.isChecked() &
                    !chkH14a4c.isChecked() &
                    !chkH14a4d.isChecked() &
                    !chkH14a4e.isChecked() &
                    !chkH14a4f.isChecked() &
                    !chkH14a4g.isChecked() &
                    !chkH14a4h.isChecked() &
                    !chkH14a4i.isChecked() &
                    !chkH14a4j.isChecked() &
                    !chkH14a4k.isChecked() &
                    !chkH14a4l.isChecked() &
                    !chkH14a4m.isChecked() &
                    !chkH14a14n.isChecked() &
                    !chkH14a4x.isChecked())) {
                Connection.MessageBox(Destruction1.this, "Required field: CheckList থেকে কমপক্ষে একটি অপশন সিলেক্ট করুন !");
                secH14a4a.requestFocus();
                return;
            } else if (txtH14a4x1.getText().toString().length() == 0 & secH14a4x1.isShown()) {
                Connection.MessageBox(Destruction1.this, "Required field: নির্দিষ্ট করুন.");
                txtH14a4x1.requestFocus();
                return;
            } /*else if (txtH14a4x2.getText().toString().length() == 0 & secH14a4x2.isShown()) {
                Connection.MessageBox(Destruction1.this, "Required field: উল্লেখ কর.");
                txtH14a4x2.requestFocus();
                return;
            } else if (txtH14a4x3.getText().toString().length() == 0 & secH14a4x3.isShown()) {
                Connection.MessageBox(Destruction1.this, "Required field: উল্লেখ কর.");
                txtH14a4x3.requestFocus();
                return;
            }*/


            String SQL = "";
            RadioButton rb;

            Destruction1_DataModel objSave = new Destruction1_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setH14a((spnH14a.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH14a.getSelectedItem().toString(), "-")));
            objSave.setH14ax(txtH14ax.getText().toString());
            String[] d_rdogrpH14a1 = new String[]{"1", " 0"};
            objSave.setH14a1("");
            for (int i = 0; i < rdogrpH14a1.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH14a1.getChildAt(i);
                if (rb.isChecked()) objSave.setH14a1(d_rdogrpH14a1[i]);
            }

            objSave.setH14a2(txtH14a2.getText().toString());
            objSave.setH14a3a((chkH14a3a.isChecked() ? "1" : "2"));
            objSave.setH14a3b((chkH14a3b.isChecked() ? "1" : "2"));
            objSave.setH14a3c((chkH14a3c.isChecked() ? "1" : "2"));
            objSave.setH14a3d((chkH14a3d.isChecked() ? "1" : "2"));
            objSave.setH14a3e((chkH14a3e.isChecked() ? "1" : "2"));
            objSave.setH14a3f((chkH14a3f.isChecked() ? "1" : "2"));
            objSave.setH14a3g((chkH14a3g.isChecked() ? "1" : "2"));
            objSave.setH14a3h((chkH14a3h.isChecked() ? "1" : "2"));
            objSave.setH14a3i((chkH14a3i.isChecked() ? "1" : "2"));
            objSave.setH14a3j((chkH14a3j.isChecked() ? "1" : "2"));
            objSave.setH14a3k((chkH14a3k.isChecked() ? "1" : "2"));
            objSave.setH14a3l((chkH14a3l.isChecked() ? "1" : "2"));
            objSave.setH14a3m((chkH14a3m.isChecked() ? "1" : "2"));
            objSave.setH14a3x((chkH14a3x.isChecked() ? "1" : "2"));
            objSave.setH14a3x1(txtH14a3x1.getText().toString());
            objSave.setH14a3x2(txtH14a3x2.getText().toString());
            objSave.setH14a3x3(txtH14a3x3.getText().toString());
            objSave.setH14a4a((chkH14a4a.isChecked() ? "1" : "2"));
            objSave.setH14a4b((chkH14a4b.isChecked() ? "1" : "2"));
            objSave.setH14a4c((chkH14a4c.isChecked() ? "1" : "2"));
            objSave.setH14a4d((chkH14a4d.isChecked() ? "1" : "2"));
            objSave.setH14a4e((chkH14a4e.isChecked() ? "1" : "2"));
            objSave.setH14a4f((chkH14a4f.isChecked() ? "1" : "2"));
            objSave.setH14a4g((chkH14a4g.isChecked() ? "1" : "2"));
            objSave.setH14a4h((chkH14a4h.isChecked() ? "1" : "2"));
            objSave.setH14a4i((chkH14a4i.isChecked() ? "1" : "2"));
            objSave.setH14a4j((chkH14a4j.isChecked() ? "1" : "2"));
            objSave.setH14a4k((chkH14a4k.isChecked() ? "1" : "2"));
            objSave.setH14a4l((chkH14a4l.isChecked() ? "1" : "2"));
            objSave.setH14a4m((chkH14a4m.isChecked() ? "1" : "2"));
            objSave.setH14a14n((chkH14a14n.isChecked() ? "1" : "2"));
            objSave.setH14a4x((chkH14a4x.isChecked() ? "1" : "2"));
            objSave.setH14a4x1(txtH14a4x1.getText().toString());
            objSave.setH14a4x2(txtH14a4x2.getText().toString());
            objSave.setH14a4x3(txtH14a4x3.getText().toString());
            objSave.setStartTime(StartTime);
            objSave.setEndTime(g.CurrentTime24());
            objSave.setUserId(g.getUserId());
            objSave.setEntryUser(g.getUserId()); //from data entry user list
            //objSave.setLat(Double.toString(currentLatitude));
            //objSave.setLon(Double.toString(currentLongitude));
            objSave.setEnDt(Global.DateTimeNowYMDHMS());
            String status = objSave.SaveUpdateData(this);
            if (status.length() == 0) {
                buttonColor();
                if (allItemsCompleted) {
                    EntryStatus_DataModel e = new EntryStatus_DataModel(TableName, RND, SUCHANAID);
                    e.SaveUpdateData(this);
                    finish();
                    Bundle IDBundle = new Bundle();
                    IDBundle.putString("Rnd", txtRnd.getText().toString());
                    IDBundle.putString("SuchanaID", txtSuchanaID.getText().toString());
                    // IDBundle.putString("H41a", "");
                    startActivity(new Intent(Destruction1.this, Destruction2.class).putExtras(IDBundle));
                    // Connection.MessageBox(AssetB.this, "Saved Successfully");
                }
            } else {
                Connection.MessageBox(Destruction1.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(Destruction1.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID, String H14a) {
        try {

            RadioButton rb;
            Destruction1_DataModel d = new Destruction1_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<Destruction1_DataModel> data = d.SelectAll(this, SQL);
            for (Destruction1_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                spnH14a.setSelection(Global.SpinnerItemPositionAnyLength(spnH14a, item.getH14a()));
                txtH14ax.setText(item.getH14ax());
                String[] d_rdogrpH14a1 = new String[]{"1", " 0"};
                for (int i = 0; i < d_rdogrpH14a1.length; i++) {
                    if (item.getH14a1().equals(String.valueOf(d_rdogrpH14a1[i]))) {
                        rb = (RadioButton) rdogrpH14a1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH14a2.setText(item.getH14a2());
                if (item.getH14a3a().equals("1")) {
                    chkH14a3a.setChecked(true);
                } else if (item.getH14a3a().equals("2")) {
                    chkH14a3a.setChecked(false);
                }
                if (item.getH14a3b().equals("1")) {
                    chkH14a3b.setChecked(true);
                } else if (item.getH14a3b().equals("2")) {
                    chkH14a3b.setChecked(false);
                }
                if (item.getH14a3c().equals("1")) {
                    chkH14a3c.setChecked(true);
                } else if (item.getH14a3c().equals("2")) {
                    chkH14a3c.setChecked(false);
                }
                if (item.getH14a3d().equals("1")) {
                    chkH14a3d.setChecked(true);
                } else if (item.getH14a3d().equals("2")) {
                    chkH14a3d.setChecked(false);
                }
                if (item.getH14a3e().equals("1")) {
                    chkH14a3e.setChecked(true);
                } else if (item.getH14a3e().equals("2")) {
                    chkH14a3e.setChecked(false);
                }
                if (item.getH14a3f().equals("1")) {
                    chkH14a3f.setChecked(true);
                } else if (item.getH14a3f().equals("2")) {
                    chkH14a3f.setChecked(false);
                }
                if (item.getH14a3g().equals("1")) {
                    chkH14a3g.setChecked(true);
                } else if (item.getH14a3g().equals("2")) {
                    chkH14a3g.setChecked(false);
                }
                if (item.getH14a3h().equals("1")) {
                    chkH14a3h.setChecked(true);
                } else if (item.getH14a3h().equals("2")) {
                    chkH14a3h.setChecked(false);
                }
                if (item.getH14a3i().equals("1")) {
                    chkH14a3i.setChecked(true);
                } else if (item.getH14a3i().equals("2")) {
                    chkH14a3i.setChecked(false);
                }
                if (item.getH14a3j().equals("1")) {
                    chkH14a3j.setChecked(true);
                } else if (item.getH14a3j().equals("2")) {
                    chkH14a3j.setChecked(false);
                }
                if (item.getH14a3k().equals("1")) {
                    chkH14a3k.setChecked(true);
                } else if (item.getH14a3k().equals("2")) {
                    chkH14a3k.setChecked(false);
                }
                if (item.getH14a3l().equals("1")) {
                    chkH14a3l.setChecked(true);
                } else if (item.getH14a3l().equals("2")) {
                    chkH14a3l.setChecked(false);
                }
                if (item.getH14a3m().equals("1")) {
                    chkH14a3m.setChecked(true);
                } else if (item.getH14a3m().equals("2")) {
                    chkH14a3m.setChecked(false);
                }
                if (item.getH14a3x().equals("1")) {
                    chkH14a3x.setChecked(true);
                } else if (item.getH14a3x().equals("2")) {
                    chkH14a3x.setChecked(true);
                    chkH14a3x.setChecked(false);
                }
                txtH14a3x1.setText(item.getH14a3x1());
                txtH14a3x2.setText(item.getH14a3x2());
                txtH14a3x3.setText(item.getH14a3x3());
                if (item.getH14a4a().equals("1")) {
                    chkH14a4a.setChecked(true);
                } else if (item.getH14a4a().equals("2")) {
                    chkH14a4a.setChecked(false);
                }
                if (item.getH14a4b().equals("1")) {
                    chkH14a4b.setChecked(true);
                } else if (item.getH14a4b().equals("2")) {
                    chkH14a4b.setChecked(false);
                }
                if (item.getH14a4c().equals("1")) {
                    chkH14a4c.setChecked(true);
                } else if (item.getH14a4c().equals("2")) {
                    chkH14a4c.setChecked(false);
                }
                if (item.getH14a4d().equals("1")) {
                    chkH14a4d.setChecked(true);
                } else if (item.getH14a4d().equals("2")) {
                    chkH14a4d.setChecked(false);
                }
                if (item.getH14a4e().equals("1")) {
                    chkH14a4e.setChecked(true);
                } else if (item.getH14a4e().equals("2")) {
                    chkH14a4e.setChecked(false);
                }
                if (item.getH14a4f().equals("1")) {
                    chkH14a4f.setChecked(true);
                } else if (item.getH14a4f().equals("2")) {
                    chkH14a4f.setChecked(false);
                }
                if (item.getH14a4g().equals("1")) {
                    chkH14a4g.setChecked(true);
                } else if (item.getH14a4g().equals("2")) {
                    chkH14a4g.setChecked(false);
                }
                if (item.getH14a4h().equals("1")) {
                    chkH14a4h.setChecked(true);
                } else if (item.getH14a4h().equals("2")) {
                    chkH14a4h.setChecked(false);
                }
                if (item.getH14a4i().equals("1")) {
                    chkH14a4i.setChecked(true);
                } else if (item.getH14a4i().equals("2")) {
                    chkH14a4i.setChecked(false);
                }
                if (item.getH14a4j().equals("1")) {
                    chkH14a4j.setChecked(true);
                } else if (item.getH14a4j().equals("2")) {
                    chkH14a4j.setChecked(false);
                }
                if (item.getH14a4k().equals("1")) {
                    chkH14a4k.setChecked(true);
                } else if (item.getH14a4k().equals("2")) {
                    chkH14a4k.setChecked(false);
                }
                if (item.getH14a4l().equals("1")) {
                    chkH14a4l.setChecked(true);
                } else if (item.getH14a4l().equals("2")) {
                    chkH14a4l.setChecked(false);
                }
                if (item.getH14a4m().equals("1")) {
                    chkH14a4m.setChecked(true);
                } else if (item.getH14a4m().equals("2")) {
                    chkH14a4m.setChecked(false);
                }
                if (item.getH14a14n().equals("1")) {
                    chkH14a14n.setChecked(true);
                } else if (item.getH14a14n().equals("2")) {
                    chkH14a14n.setChecked(false);
                }
                if (item.getH14a4x().equals("1")) {
                    chkH14a4x.setChecked(true);
                } else if (item.getH14a4x().equals("2")) {
                    chkH14a4x.setChecked(true);
                    chkH14a4x.setChecked(false);
                }
                txtH14a4x1.setText(item.getH14a4x1());
                txtH14a4x2.setText(item.getH14a4x2());
                txtH14a4x3.setText(item.getH14a4x3());


                buttonColor();
            }
        } catch (Exception e) {
            Connection.MessageBox(Destruction1.this, e.getMessage());
            return;
        }
    }

    private void DataSearchPartial(String Rnd, String SuchanaID, String H14a) {
        try {

            RadioButton rb;
            Destruction1_DataModel d = new Destruction1_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "' and H14a='" + H14a + "'";
            List<Destruction1_DataModel> data = d.SelectAll(this, SQL);
            for (Destruction1_DataModel item : data) {
                //txtRnd.setText(item.getRnd());
                // txtSuchanaID.setText(item.getSuchanaID());
                // spnH14a.setSelection(Global.SpinnerItemPositionAnyLength(spnH14a, item.getH14a()));
                txtH14ax.setText(item.getH14ax());
                String[] d_rdogrpH14a1 = new String[]{"1", " 0"};
                for (int i = 0; i < d_rdogrpH14a1.length; i++) {
                    if (item.getH14a1().equals(String.valueOf(d_rdogrpH14a1[i]))) {
                        rb = (RadioButton) rdogrpH14a1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH14a2.setText(item.getH14a2());
                if (item.getH14a3a().equals("1")) {
                    chkH14a3a.setChecked(true);
                } else if (item.getH14a3a().equals("2")) {
                    chkH14a3a.setChecked(false);
                }
                if (item.getH14a3b().equals("1")) {
                    chkH14a3b.setChecked(true);
                } else if (item.getH14a3b().equals("2")) {
                    chkH14a3b.setChecked(false);
                }
                if (item.getH14a3c().equals("1")) {
                    chkH14a3c.setChecked(true);
                } else if (item.getH14a3c().equals("2")) {
                    chkH14a3c.setChecked(false);
                }
                if (item.getH14a3d().equals("1")) {
                    chkH14a3d.setChecked(true);
                } else if (item.getH14a3d().equals("2")) {
                    chkH14a3d.setChecked(false);
                }
                if (item.getH14a3e().equals("1")) {
                    chkH14a3e.setChecked(true);
                } else if (item.getH14a3e().equals("2")) {
                    chkH14a3e.setChecked(false);
                }
                if (item.getH14a3f().equals("1")) {
                    chkH14a3f.setChecked(true);
                } else if (item.getH14a3f().equals("2")) {
                    chkH14a3f.setChecked(false);
                }
                if (item.getH14a3g().equals("1")) {
                    chkH14a3g.setChecked(true);
                } else if (item.getH14a3g().equals("2")) {
                    chkH14a3g.setChecked(false);
                }
                if (item.getH14a3h().equals("1")) {
                    chkH14a3h.setChecked(true);
                } else if (item.getH14a3h().equals("2")) {
                    chkH14a3h.setChecked(false);
                }
                if (item.getH14a3i().equals("1")) {
                    chkH14a3i.setChecked(true);
                } else if (item.getH14a3i().equals("2")) {
                    chkH14a3i.setChecked(false);
                }
                if (item.getH14a3j().equals("1")) {
                    chkH14a3j.setChecked(true);
                } else if (item.getH14a3j().equals("2")) {
                    chkH14a3j.setChecked(false);
                }
                if (item.getH14a3k().equals("1")) {
                    chkH14a3k.setChecked(true);
                } else if (item.getH14a3k().equals("2")) {
                    chkH14a3k.setChecked(false);
                }
                if (item.getH14a3l().equals("1")) {
                    chkH14a3l.setChecked(true);
                } else if (item.getH14a3l().equals("2")) {
                    chkH14a3l.setChecked(false);
                }
                if (item.getH14a3m().equals("1")) {
                    chkH14a3m.setChecked(true);
                } else if (item.getH14a3m().equals("2")) {
                    chkH14a3m.setChecked(false);
                }
                if (item.getH14a3x().equals("1")) {
                    chkH14a3x.setChecked(true);
                } else if (item.getH14a3x().equals("2")) {
                    chkH14a3x.setChecked(true);
                    chkH14a3x.setChecked(false);
                }
                txtH14a3x1.setText(item.getH14a3x1());
                txtH14a3x2.setText(item.getH14a3x2());
                txtH14a3x3.setText(item.getH14a3x3());
                if (item.getH14a4a().equals("1")) {
                    chkH14a4a.setChecked(true);
                } else if (item.getH14a4a().equals("2")) {
                    chkH14a4a.setChecked(false);
                }
                if (item.getH14a4b().equals("1")) {
                    chkH14a4b.setChecked(true);
                } else if (item.getH14a4b().equals("2")) {
                    chkH14a4b.setChecked(false);
                }
                if (item.getH14a4c().equals("1")) {
                    chkH14a4c.setChecked(true);
                } else if (item.getH14a4c().equals("2")) {
                    chkH14a4c.setChecked(false);
                }
                if (item.getH14a4d().equals("1")) {
                    chkH14a4d.setChecked(true);
                } else if (item.getH14a4d().equals("2")) {
                    chkH14a4d.setChecked(false);
                }
                if (item.getH14a4e().equals("1")) {
                    chkH14a4e.setChecked(true);
                } else if (item.getH14a4e().equals("2")) {
                    chkH14a4e.setChecked(false);
                }
                if (item.getH14a4f().equals("1")) {
                    chkH14a4f.setChecked(true);
                } else if (item.getH14a4f().equals("2")) {
                    chkH14a4f.setChecked(false);
                }
                if (item.getH14a4g().equals("1")) {
                    chkH14a4g.setChecked(true);
                } else if (item.getH14a4g().equals("2")) {
                    chkH14a4g.setChecked(false);
                }
                if (item.getH14a4h().equals("1")) {
                    chkH14a4h.setChecked(true);
                } else if (item.getH14a4h().equals("2")) {
                    chkH14a4h.setChecked(false);
                }
                if (item.getH14a4i().equals("1")) {
                    chkH14a4i.setChecked(true);
                } else if (item.getH14a4i().equals("2")) {
                    chkH14a4i.setChecked(false);
                }
                if (item.getH14a4j().equals("1")) {
                    chkH14a4j.setChecked(true);
                } else if (item.getH14a4j().equals("2")) {
                    chkH14a4j.setChecked(false);
                }
                if (item.getH14a4k().equals("1")) {
                    chkH14a4k.setChecked(true);
                } else if (item.getH14a4k().equals("2")) {
                    chkH14a4k.setChecked(false);
                }
                if (item.getH14a4l().equals("1")) {
                    chkH14a4l.setChecked(true);
                } else if (item.getH14a4l().equals("2")) {
                    chkH14a4l.setChecked(false);
                }
                if (item.getH14a4m().equals("1")) {
                    chkH14a4m.setChecked(true);
                } else if (item.getH14a4m().equals("2")) {
                    chkH14a4m.setChecked(false);
                }
                if (item.getH14a14n().equals("1")) {
                    chkH14a14n.setChecked(true);
                } else if (item.getH14a14n().equals("2")) {
                    chkH14a14n.setChecked(false);
                }
                if (item.getH14a4x().equals("1")) {
                    chkH14a4x.setChecked(true);
                } else if (item.getH14a4x().equals("2")) {
                    chkH14a4x.setChecked(true);
                    chkH14a4x.setChecked(false);
                }
                txtH14a4x1.setText(item.getH14a4x1());
                txtH14a4x2.setText(item.getH14a4x2());
                txtH14a4x3.setText(item.getH14a4x3());

            }


            if (data.size() == 0) {
                txtH14ax.setText("");
                rdogrpH14a1.clearCheck();

                txtH14a2.setText("");
                chkH14a3a.setChecked(false);
                chkH14a3b.setChecked(false);
                chkH14a3c.setChecked(false);
                chkH14a3d.setChecked(false);
                chkH14a3e.setChecked(false);
                chkH14a3f.setChecked(false);
                chkH14a3g.setChecked(false);
                chkH14a3h.setChecked(false);

                chkH14a3i.setChecked(false);
                chkH14a3j.setChecked(false);
                chkH14a3k.setChecked(false);
                chkH14a3l.setChecked(false);
                chkH14a3m.setChecked(false);
                chkH14a3x.setChecked(true);
                chkH14a3x.setChecked(false);

                txtH14a3x1.setText("");
                txtH14a3x2.setText("");
                txtH14a3x3.setText("");
                chkH14a4a.setChecked(false);
                chkH14a4b.setChecked(false);

                chkH14a4c.setChecked(false);
                chkH14a4d.setChecked(false);
                chkH14a4e.setChecked(false);
                chkH14a4f.setChecked(false);
                chkH14a4g.setChecked(false);
                chkH14a4h.setChecked(false);
                chkH14a4i.setChecked(false);
                chkH14a4j.setChecked(false);
                chkH14a4k.setChecked(false);
                chkH14a4l.setChecked(false);
                chkH14a4m.setChecked(false);
                chkH14a14n.setChecked(false);
                chkH14a4x.setChecked(true);
                chkH14a4x.setChecked(false);

                txtH14a4x1.setText("");
                txtH14a4x2.setText("");
                txtH14a4x3.setText("");
            }

        } catch (Exception e) {
            Connection.MessageBox(Destruction1.this, e.getMessage());
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