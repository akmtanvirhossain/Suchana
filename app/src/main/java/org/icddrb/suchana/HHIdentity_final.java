package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".HHIdentity" android:label="HHIdentity" />

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
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
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
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

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import Common.Connection;
import Common.Global;

public class HHIdentity_final extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    static String ScreeningID = "";
    private static String Status = "new";
    String[] SuchanaIdBuilder;
    boolean networkAvailable = false;
    Location currentLocation;
    double currentLatitude, currentLongitude;
    String VariableID;
    Connection C;
    Global g;
    SimpleAdapter dataAdapter;
    ArrayList<HashMap<String, String>> dataList = new ArrayList<HashMap<String, String>>();
    TextView lblHeading;
    LinearLayout seclblH1;
    LinearLayout secRnd;
    View lineRnd;
    TextView VlblRnd;
    EditText txtRnd;
    LinearLayout secDist;
    View lineDist;
    TextView VlblDist;
    Spinner spnDist;
    LinearLayout secUpz;
    View lineUpz;
    TextView VlblUpz;
    Spinner spnUpz;
    LinearLayout secUn;
    View lineUn;
    TextView VlblUn;
    Spinner spnUn;
    LinearLayout secVill;
    View lineVill;
    TextView VlblVill;
    Spinner spnVill;
    LinearLayout secH11;
    View lineH11;
    TextView VlblH11;
    EditText txtH11;
    LinearLayout secSuchanaID;
    View lineSuchanaID;
    TextView VlblSuchanaID;
    EditText txtSuchanaID;
    LinearLayout secAgeGroup;
    View lineAgeGroup;
    TextView VlblAgeGroup;
    Spinner spnAgeGroup;
    LinearLayout secH17;
    View lineH17;
    TextView VlblH17;
    EditText dtpH17;
    LinearLayout secResult;
    View lineResult;
    TextView VlblResult;
    Spinner spnResult;
    LinearLayout secResultX;
    View lineResultX;
    TextView VlblResultX;
    EditText txtResultX;
    LinearLayout secH16;
    View lineH16;
    TextView VlblH16;
    RadioGroup rdogrpH16;
    RadioButton rdoH161;
    RadioButton rdoH162;
    RadioButton rdoH163;
    LinearLayout secH16X;
    View lineH16X;
    TextView VlblH16X;
    EditText txtH16X;
    LinearLayout secH13;
    View lineH13;
    TextView VlblH13;
    EditText txtH13;
    LinearLayout secH14;
    //View lineH14;
    TextView VlblH14;
    Spinner spnH14;
    /*    LinearLayout seclblV1;
        LinearLayout secH01;
        View lineH01;
        TextView VlblH01;
        RadioGroup rdogrpH01;
        RadioButton rdoH011;
        RadioButton rdoH012;
        LinearLayout secH02;
        View lineH02;
        TextView VlblH02;
        RadioGroup rdogrpH02;
        RadioButton rdoH021;
        RadioButton rdoH022;
        LinearLayout secH03;
        View lineH03;
        TextView VlblH03;
        RadioGroup rdogrpH03;
        RadioButton rdoH031;
        RadioButton rdoH032;
        LinearLayout secH04;
        View lineH04;
        TextView VlblH04;
        RadioGroup rdogrpH04;
        RadioButton rdoH041;
        RadioButton rdoH042;
        LinearLayout secH05;
        View lineH05;
        TextView VlblH05;
        RadioGroup rdogrpH05;
        RadioButton rdoH051;
        RadioButton rdoH052;
        LinearLayout secH06;
        View lineH06;
        TextView VlblH06;
        RadioGroup rdogrpH06;
        RadioButton rdoH061;
        RadioButton rdoH062;
        LinearLayout secH07;
        View lineH07;
        TextView VlblH07;
        RadioGroup rdogrpH07;
        RadioButton rdoH071;
        RadioButton rdoH072;
        LinearLayout secH07a;
        View lineH07a;
        TextView VlblH07a;
        CheckBox chkH07a;
        LinearLayout secH07b;
        View lineH07b;
        TextView VlblH07b;
        CheckBox chkH07b;
        LinearLayout secH07c;
        View lineH07c;
        TextView VlblH07c;
        CheckBox chkH07c;
        LinearLayout secH07d;
        View lineH07d;
        TextView VlblH07d;
        CheckBox chkH07d;
        LinearLayout secH07e;
        View lineH07e;
        TextView VlblH07e;
        CheckBox chkH07e;
        LinearLayout secH07f;
        View lineH07f;
        TextView VlblH07f;
        CheckBox chkH07f;
        LinearLayout secH07g;
        View lineH07g;
        TextView VlblH07g;
        CheckBox chkH07g;
        LinearLayout secH07h;
        View lineH07h;
        TextView VlblH07h;
        CheckBox chkH07h;
        LinearLayout secH08;
        View lineH08;
        TextView VlblH08;
        RadioGroup rdogrpH08;
        RadioButton rdoH081;
        RadioButton rdoH082;*/
    String StartTime;
    Bundle IDbundle;
    String DIS = "";
    String UPZ = "";
    String UN = "";
    String VILL = "";
    ImageButton cmdForward;
    TextView lblNext;
    ImageButton cmdHome;
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


            dtpDate = (EditText) findViewById(R.id.dtpH17);
            if (VariableID.equals("dtpH17")) {
                dtpDate = (EditText) findViewById(R.id.dtpH17);
            }

            dtpDate.setText(new StringBuilder()
                    .append(Global.Right("00" + mDay, 2)).append("/")
                    .append(Global.Right("00" + mMonth, 2)).append("/")
                    .append(mYear));
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
            setContentView(R.layout.hhidentity_final);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            ScreeningID = IDbundle.getString("ScreeningID");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TableName = "HHIdentity";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(HHIdentity_final.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), HHIdentity_list.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDbundle);
                            getApplicationContext().startActivity(intent);
                            finish();
                        }
                    });
                    adb.show();

                }
            });
            cmdHome = (ImageButton) findViewById(R.id.cmdHome);
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
            cmdForward = (ImageButton) findViewById(R.id.cmdForward);
            cmdForward.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(HHIdentity_final.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to go to next form [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            Intent intent = new Intent(getApplicationContext(), Member_list.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            getApplicationContext().startActivity(intent);

                        }
                    });
                    adb.show();
                }
            });
            lblNext = (TextView) findViewById(R.id.lblNext);
            lblNext.setVisibility(View.INVISIBLE);
            cmdForward.setVisibility(View.INVISIBLE);

            seclblH1 = (LinearLayout) findViewById(R.id.seclblH1);
            secRnd = (LinearLayout) findViewById(R.id.secRnd);
            lineRnd = (View) findViewById(R.id.lineRnd);
            VlblRnd = (TextView) findViewById(R.id.VlblRnd);
            txtRnd = (EditText) findViewById(R.id.txtRnd);
            txtRnd.setEnabled(false);
            secDist = (LinearLayout) findViewById(R.id.secDist);
            lineDist = (View) findViewById(R.id.lineDist);
            VlblDist = (TextView) findViewById(R.id.VlblDist);
            spnDist = (Spinner) findViewById(R.id.spnDist);
            spnDist.setAdapter(C.getArrayAdapter("Select '' DistCode union select distinct DistCode||'-'||DistName from VillageList order by DistCode"));
            spnDist.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    //SuchanaIdBuilder[0] = String.valueOf(id);
                    GenerateSuchanaID();
                    String D = Connection.SelectedSpinnerValue(spnDist.getSelectedItem().toString(), "-");
                    spnUpz.setAdapter(C.getArrayAdapter("Select '' union Select distinct UPZCode||'-'||UPZName from VillageList where DistCode='" + D + "'"));
                    spnUpz.setSelection(Global.SpinnerItemPositionAnyLength(spnUpz, UPZ));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            secUpz = (LinearLayout) findViewById(R.id.secUpz);
            lineUpz = (View) findViewById(R.id.lineUpz);
            VlblUpz = (TextView) findViewById(R.id.VlblUpz);
            spnUpz = (Spinner) findViewById(R.id.spnUpz);

            spnUpz.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    GenerateSuchanaID();
                    //SuchanaIdBuilder[1] = String.valueOf(id);
                    String D = Connection.SelectedSpinnerValue(spnDist.getSelectedItem().toString(), "-");
                    String U = Connection.SelectedSpinnerValue(spnUpz.getSelectedItem().toString(), "-");
                    spnUn.setAdapter(C.getArrayAdapter("Select '' union Select distinct UNCode||'-'||UNName from VillageList where DistCode='" + D + "' and UpzCode='" + U + "'"));
                    spnUn.setSelection(Global.SpinnerItemPositionAnyLength(spnUn, UN));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            secUn = (LinearLayout) findViewById(R.id.secUn);
            lineUn = (View) findViewById(R.id.lineUn);
            VlblUn = (TextView) findViewById(R.id.VlblUn);
            spnUn = (Spinner) findViewById(R.id.spnUn);

            spnUn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    GenerateSuchanaID();
                    //SuchanaIdBuilder[2] = String.valueOf(id);
                    String D = Connection.SelectedSpinnerValue(spnDist.getSelectedItem().toString(), "-");
                    String U = Connection.SelectedSpinnerValue(spnUpz.getSelectedItem().toString(), "-");
                    String UN = Connection.SelectedSpinnerValue(spnUn.getSelectedItem().toString(), "-");
                    spnVill.setAdapter(C.getArrayAdapter("Select '' union Select distinct VillCode||'-'||VillName from VillageList where DistCode='" + D + "' and UpzCode='" + U + "' and UNCode='" + UN + "'"));
                    spnVill.setSelection(Global.SpinnerItemPositionAnyLength(spnVill, VILL));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            secVill = (LinearLayout) findViewById(R.id.secVill);
            lineVill = (View) findViewById(R.id.lineVill);
            VlblVill = (TextView) findViewById(R.id.VlblVill);
            spnVill = (Spinner) findViewById(R.id.spnVill);
            spnVill.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    GenerateSuchanaID();
                    //SuchanaIdBuilder[0] = String.valueOf(id);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            secH11 = (LinearLayout) findViewById(R.id.secH11);
            lineH11 = (View) findViewById(R.id.lineH11);
            VlblH11 = (TextView) findViewById(R.id.VlblH11);
            txtH11 = (EditText) findViewById(R.id.txtH11);
            txtH11.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    GenerateSuchanaID();
                    //SuchanaIdBuilder[4] = txtH11.getText().toString();
                }
            });
            secSuchanaID = (LinearLayout) findViewById(R.id.secSuchanaID);
            lineSuchanaID = (View) findViewById(R.id.lineSuchanaID);
            VlblSuchanaID = (TextView) findViewById(R.id.VlblSuchanaID);
            txtSuchanaID = (EditText) findViewById(R.id.txtSuchanaID);
            txtSuchanaID.setEnabled(false);

            secAgeGroup = (LinearLayout) findViewById(R.id.secAgeGroup);
            lineAgeGroup = (View) findViewById(R.id.lineAgeGroup);
            VlblAgeGroup = (TextView) findViewById(R.id.VlblAgeGroup);
            spnAgeGroup = (Spinner) findViewById(R.id.spnAgeGroup);
            List<String> listAgeGroup = new ArrayList<String>();

            listAgeGroup.add("");
            listAgeGroup.add("1-০-৫ মাস");
            listAgeGroup.add("2-৬-১১ মাস");
            listAgeGroup.add("3-১২-২৩ মাস");
            ArrayAdapter<String> adptrAgeGroup = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listAgeGroup);
            spnAgeGroup.setAdapter(adptrAgeGroup);

            secH17 = (LinearLayout) findViewById(R.id.secH17);
            lineH17 = (View) findViewById(R.id.lineH17);
            VlblH17 = (TextView) findViewById(R.id.VlblH17);
            dtpH17 = (EditText) findViewById(R.id.dtpH17);
            dtpH17.setText(Global.DateNowDMY());
            secResult = (LinearLayout) findViewById(R.id.secResult);
            lineResult = (View) findViewById(R.id.lineResult);
            VlblResult = (TextView) findViewById(R.id.VlblResult);
            spnResult = (Spinner) findViewById(R.id.spnResult);
            List<String> listResult = new ArrayList<String>();

            listResult.add("");
            listResult.add("1-ইন্টারভিউ সম্পন্ন");
            listResult.add("2-উত্তরদাত্রী/প্রধান মহিলা বাড়ি ছিলেন না");
            listResult.add("3-অংশগ্রহনে অসম্মতি");
            listResult.add("4-অন্যান্য");
            listResult.add("5-ইন্টারভিউ আংশিক সম্পন্ন");
            ArrayAdapter<String> adptrResult = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listResult);
            spnResult.setAdapter(adptrResult);

            spnResult.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnResult.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnResult.getSelectedItem().toString(), "-");

                    if (spnData.equals("4")) {
                        secResultX.setVisibility(View.VISIBLE);
                        lineResultX.setVisibility(View.VISIBLE);
                    } else {
                        txtResultX.setText("");
                        secResultX.setVisibility(View.GONE);
                        lineResultX.setVisibility(View.GONE);
                    }

                    if (!spnData.equalsIgnoreCase("1") & !spnData.equalsIgnoreCase("5")) {
                        txtResultX.setText("");
                        secH16.setVisibility(View.GONE);
                        rdogrpH16.clearCheck();
                        lineH16.setVisibility(View.GONE);
                        secH16X.setVisibility(View.GONE);
                        lineH16X.setVisibility(View.GONE);
                        secH13.setVisibility(View.GONE);
                        lineH13.setVisibility(View.GONE);
                        txtH13.setText("");
                        secH14.setVisibility(View.GONE);
                        //lineH14.setVisibility(View.GONE);
                        spnH14.setSelection(0);

                    } else {
                        secH16.setVisibility(View.VISIBLE);
                        lineH16.setVisibility(View.VISIBLE);
                        //secH16X.setVisibility(View.VISIBLE);
                        lineH16X.setVisibility(View.VISIBLE);
                        secH13.setVisibility(View.VISIBLE);
                        lineH13.setVisibility(View.VISIBLE);
                        secH14.setVisibility(View.GONE);
                        //lineH14.setVisibility(View.VISIBLE);

                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secResultX = (LinearLayout) findViewById(R.id.secResultX);
            lineResultX = (View) findViewById(R.id.lineResultX);
            VlblResultX = (TextView) findViewById(R.id.VlblResultX);
            txtResultX = (EditText) findViewById(R.id.txtResultX);
            secH16 = (LinearLayout) findViewById(R.id.secH16);
            lineH16 = (View) findViewById(R.id.lineH16);
            VlblH16 = (TextView) findViewById(R.id.VlblH16);
            rdogrpH16 = (RadioGroup) findViewById(R.id.rdogrpH16);

            rdoH161 = (RadioButton) findViewById(R.id.rdoH161);
            rdoH162 = (RadioButton) findViewById(R.id.rdoH162);
            rdoH163 = (RadioButton) findViewById(R.id.rdoH163);
            rdogrpH16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH16 = new String[]{"1", "2", "3"};
                    for (int i = 0; i < rdogrpH16.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH16.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH16[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                        secH16X.setVisibility(View.GONE);
                        lineH16X.setVisibility(View.GONE);
                        txtH16X.setText("");
                    /*} else if (rbData.equalsIgnoreCase("2")) {
                        secH16X.setVisibility(View.GONE);
                        lineH16X.setVisibility(View.GONE);
                        txtH16X.setText("");*/
                    } else {
                        secH16X.setVisibility(View.VISIBLE);
                        lineH16X.setVisibility(View.VISIBLE);
                        if (rbData.equals("2")) {
                            VlblH16X.setText("উপজাতীর নাম");
                        } else if (rbData.equals("3")) {
                            VlblH16X.setText("অন্যান্য ");
                        }
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH16X = (LinearLayout) findViewById(R.id.secH16X);
            lineH16X = (View) findViewById(R.id.lineH16X);
            VlblH16X = (TextView) findViewById(R.id.VlblH16X);
            txtH16X = (EditText) findViewById(R.id.txtH16X);
            secH13 = (LinearLayout) findViewById(R.id.secH13);
            lineH13 = (View) findViewById(R.id.lineH13);
            VlblH13 = (TextView) findViewById(R.id.VlblH13);
            txtH13 = (EditText) findViewById(R.id.txtH13);
            secH14 = (LinearLayout) findViewById(R.id.secH14);
            //lineH14 = (View) findViewById(R.id.lineH14);
            VlblH14 = (TextView) findViewById(R.id.VlblH14);
            spnH14 = (Spinner) findViewById(R.id.spnH14);
            List<String> listH14 = new ArrayList<String>();

            listH14.add("");
            listH14.add("1-ইন্টারভেনশন গ্রুপ");
            listH14.add("2-কন্ট্রোল গ্রুপ");
            listH14.add("3-সম্পদ হস্তান্তর গ্রুপ");
            listH14.add("4-সম্পদ না হস্তান্তর গ্রুপ");
            listH14.add("5-কন্ট্রোল গ্রুপ");
            ArrayAdapter<String> adptrH14 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH14);
            spnH14.setAdapter(adptrH14);

            dtpH17.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    final int DRAWABLE_RIGHT = 2;
                    if (event.getAction() == MotionEvent.ACTION_UP) {
                        if (event.getRawX() >= (dtpH17.getRight() - dtpH17.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                            VariableID = "btnH17";
                            showDialog(DATE_DIALOG);
                            return true;
                        }
                    }
                    return false;
                }
            });


            secResultX.setVisibility(View.GONE);
            secH16X.setVisibility(View.GONE);

            DataSearchScreening(RND, ScreeningID);
            DataSearch(RND, SUCHANAID);
            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();


                }
            });
        } catch (Exception e) {
            Connection.MessageBox(HHIdentity_final.this, e.getMessage());
            return;
        }
    }

    private void SpinnerItem(Spinner SpinnerName, String SQL) {
        List<String> listItem = new ArrayList<String>();
        listItem = C.DataListJSON(SQL);
        ArrayAdapter<String> adptrList = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listItem);
        SpinnerName.setAdapter(adptrList);
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(HHIdentity_final.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(HHIdentity_final.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            }

            if (txtSuchanaID.getText().toString().length() != 12) {
                Connection.MessageBox(HHIdentity_final.this, "Length of suchana ID should be 12 digit.");
                return;
            } else if (Status.equals("new") & C.Existence("Select * from HHIdentity where Rnd='" + txtRnd.getText().toString() + "' and SuchanaId='" + txtSuchanaID.getText().toString() + "'")) {
                Connection.MessageBox(HHIdentity_final.this, "Duplicate suchana ID.");
                return;
            }

            if (spnDist.getSelectedItemPosition() == 0 & secDist.isShown()) {
                Connection.MessageBox(HHIdentity_final.this, "Required field: District.");
                spnDist.requestFocus();
                return;
            } else if (spnUpz.getSelectedItemPosition() == 0 & secUpz.isShown()) {
                Connection.MessageBox(HHIdentity_final.this, "Required field: Upazila.");
                spnUpz.requestFocus();
                return;
            } else if (spnUn.getSelectedItemPosition() == 0 & secUn.isShown()) {
                Connection.MessageBox(HHIdentity_final.this, "Required field: Union.");
                spnUn.requestFocus();
                return;
            } else if (spnVill.getSelectedItemPosition() == 0 & secVill.isShown()) {
                Connection.MessageBox(HHIdentity_final.this, "Required field: Village.");
                spnVill.requestFocus();
                return;
            } else if (txtH11.getText().toString().length() == 0 & secH11.isShown()) {
                Connection.MessageBox(HHIdentity_final.this, "Required field: খানা সনাক্তকারী নম্বর.");
                txtH11.requestFocus();
                return;
            } else if (Integer.valueOf(txtH11.getText().toString().length() == 0 ? "1" : txtH11.getText().toString()) < 1 || Integer.valueOf(txtH11.getText().toString().length() == 0 ? "9999" : txtH11.getText().toString()) > 9999) {
                Connection.MessageBox(HHIdentity_final.this, "Value should be between 1 and 9999(খানা সনাক্তকারী নম্বর).");
                txtH11.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(HHIdentity_final.this, "Required field: উপকারভোগী/সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (spnAgeGroup.getSelectedItemPosition() == 0 & secAgeGroup.isShown()) {
                Connection.MessageBox(HHIdentity_final.this, "Required field: শিশুর বয়স.");
                spnAgeGroup.requestFocus();
                return;
            }
            DV = Global.DateValidate(dtpH17.getText().toString());
            if (DV.length() != 0 & secH17.isShown()) {
                Connection.MessageBox(HHIdentity_final.this, DV);
                dtpH17.requestFocus();
                return;
            } else if (spnResult.getSelectedItemPosition() == 0 & secResult.isShown()) {
                Connection.MessageBox(HHIdentity_final.this, "Required field: সাক্ষাৎকার এর ফলাফল.");
                spnResult.requestFocus();
                return;
            } else if (txtResultX.getText().toString().length() == 0 & secResultX.isShown()) {
                Connection.MessageBox(HHIdentity_final.this, "Required field: অন্যান্য নির্দিষ্ট করুন.");
                txtResultX.requestFocus();
                return;
            } else if (!rdoH161.isChecked() & !rdoH162.isChecked() & !rdoH163.isChecked() & secH16.isShown()) {
                Connection.MessageBox(HHIdentity_final.this, "Select anyone options from (খানা’র নৃতাত্ত্বিক  গোষ্ঠী).");
                rdoH161.requestFocus();
                return;
            } else if (txtH16X.getText().toString().length() == 0 & secH16X.isShown()) {
                Connection.MessageBox(HHIdentity_final.this, "Required field: অন্যান্য.");
                txtH16X.requestFocus();
                return;
            } else if (txtH13.getText().toString().length() == 0 & secH13.isShown()) {
                Connection.MessageBox(HHIdentity_final.this, "Required field: উপকারভোগীর ফোন নম্বর.");
                txtH13.requestFocus();
                return;
            } else if (spnH14.getSelectedItemPosition() == 0 & secH14.isShown()) {
                Connection.MessageBox(HHIdentity_final.this, "Required field: সুচনা অনুসরে খানা’র গ্রুপ.");
                spnH14.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            HHIdentity_DataModel_Final objSave = new HHIdentity_DataModel_Final();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setDist((spnDist.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnDist.getSelectedItem().toString(), "-")));
            objSave.setUpz((spnUpz.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnUpz.getSelectedItem().toString(), "-")));
            objSave.setUn((spnUn.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnUn.getSelectedItem().toString(), "-")));
            objSave.setVill((spnVill.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnVill.getSelectedItem().toString(), "-")));
            objSave.setH11(txtH11.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setAgeGroup((spnAgeGroup.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnAgeGroup.getSelectedItem().toString(), "-")));
            objSave.setH17(dtpH17.getText().toString().length() > 0 ? Global.DateConvertYMD(dtpH17.getText().toString()) : dtpH17.getText().toString());
            objSave.setResult((spnResult.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnResult.getSelectedItem().toString(), "-")));
            objSave.setResultX(txtResultX.getText().toString());
            String[] d_rdogrpH16 = new String[]{"1", "2", "3"};
            objSave.setH16("");
            for (int i = 0; i < rdogrpH16.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH16.getChildAt(i);
                if (rb.isChecked()) objSave.setH16(d_rdogrpH16[i]);
            }

            objSave.setH16X(txtH16X.getText().toString());
            objSave.setH13(txtH13.getText().toString());
            objSave.setH14((spnH14.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH14.getSelectedItem().toString(), "-")));

            objSave.setEnDt(Global.DateTimeNowYMDHMS());
            objSave.setStartTime(StartTime);
            objSave.setEndTime(g.CurrentTime24());
            objSave.setUserId(g.getDeviceNo());
            objSave.setEntryUser(g.getUserId()); //from data entry user list
            //objSave.setLat(Double.toString(currentLatitude));
            //objSave.setLon(Double.toString(currentLongitude));

            String status = objSave.SaveUpdateData(this);
            if (status.length() == 0) {

                EntryStatus_DataModel e = new EntryStatus_DataModel(TableName, RND, SUCHANAID);
                e.SaveUpdateData(this);

                Bundle IDBundle = new Bundle();
                IDBundle.putString("Rnd", txtRnd.getText().toString());
                IDBundle.putString("SuchanaID", txtSuchanaID.getText().toString());

                String[] Result = spnResult.getSelectedItem().toString().split("-");

                if (Result[0].equals("1") | Result[0].equals("5")) {
                    e.Eligible(this, "1");
                    finish();
                    startActivity(new Intent(HHIdentity_final.this, Member_list.class).putExtras(IDBundle));
                    /*
                    if (rdoH012.isChecked() & rdoH022.isChecked() & rdoH032.isChecked() & rdoH042.isChecked()) {
                        e.Eligible(this, "2");
                        finish();
                        startActivity(new Intent(HHIdentity_final.this, HHIdentity_list.class).putExtras(IDBundle));
                    } else if (rdoH051.isChecked() & rdoH061.isChecked() & rdoH072.isChecked()) {
                        e.Eligible(this, "2");
                        finish();
                        startActivity(new Intent(HHIdentity_final.this, HHIdentity_list.class).putExtras(IDBundle));
                    } else if (rdoH082.isChecked()) {
                        e.Eligible(this, "2");
                        finish();
                        startActivity(new Intent(HHIdentity_final.this, HHIdentity_list.class).putExtras(IDBundle));
                    } else {
                        e.Eligible(this, "1");
                        finish();
                        startActivity(new Intent(HHIdentity_final.this, Member_list.class).putExtras(IDBundle));
                    }*/

                } else {
                    e.Eligible(this, "2");
                    finish();
                    startActivity(new Intent(HHIdentity_final.this, HHIdentity_list.class).putExtras(IDBundle));
                }

            } else {
                Connection.MessageBox(HHIdentity_final.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(HHIdentity_final.this, e.getMessage());
            return;
        }
    }

    private void DataSearchScreening(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            Screening_DataModel d = new Screening_DataModel();
            String SQL = "Select * from Screening  Where Rnd='" + Rnd + "' and ScreeningID='" + ScreeningID + "'";
            List<Screening_DataModel> data = d.SelectAll(this, SQL);
            for (Screening_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                spnDist.setSelection(Global.SpinnerItemPositionAnyLength(spnDist, item.getDist()));
                DIS = item.getDist();
                spnUpz.setSelection(Global.SpinnerItemPositionAnyLength(spnUpz, item.getUpz()));
                UPZ = item.getUpz();
                spnUn.setSelection(Global.SpinnerItemPositionAnyLength(spnUn, item.getUn()));
                UN = item.getUn();
                spnVill.setSelection(Global.SpinnerItemPositionAnyLength(spnVill, item.getVill()));
                VILL = item.getVill();

                //for household interview
                txtH11.setText(item.getHHNo());
                txtH13.setText(item.getMobNo() + (item.getReqMobNo().length() > 0 ? "," + item.getReqMobNo() : ""));

                //for screening
                //txtH11.setText(item.getWRHHNo());
                txtSuchanaID.setText(item.getScreeningID());

                spnDist.setEnabled(false);
                spnUpz.setEnabled(false);
                spnUn.setEnabled(false);
                spnVill.setEnabled(false);
                txtH11.setEnabled(false);
                txtSuchanaID.setEnabled(false);
            }
        } catch (Exception e) {
            Connection.MessageBox(HHIdentity_final.this, e.getMessage());
            return;
        }
    }


    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            HHIdentity_DataModel_Final d = new HHIdentity_DataModel_Final();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<HHIdentity_DataModel_Final> data = d.SelectAll(this, SQL);
            for (HHIdentity_DataModel_Final item : data) {
                lblNext.setVisibility(View.GONE);
                cmdForward.setVisibility(View.GONE);
                cmdHome.setVisibility(View.VISIBLE);

                Status = "update";
                txtRnd.setText(item.getRnd());
                spnDist.setSelection(Global.SpinnerItemPositionAnyLength(spnDist, item.getDist()));
                DIS = item.getDist();
                spnUpz.setSelection(Global.SpinnerItemPositionAnyLength(spnUpz, item.getUpz()));
                UPZ = item.getUpz();
                spnUn.setSelection(Global.SpinnerItemPositionAnyLength(spnUn, item.getUn()));
                UN = item.getUn();
                spnVill.setSelection(Global.SpinnerItemPositionAnyLength(spnVill, item.getVill()));
                VILL = item.getVill();
                txtH11.setText(item.getH11());
                txtSuchanaID.setText(item.getSuchanaID());

                spnDist.setEnabled(false);
                spnUpz.setEnabled(false);
                spnUn.setEnabled(false);
                spnVill.setEnabled(false);
                txtH11.setEnabled(false);
                txtSuchanaID.setEnabled(false);

                spnAgeGroup.setSelection(Global.SpinnerItemPositionAnyLength(spnAgeGroup, item.getAgeGroup()));
                dtpH17.setText(item.getH17().toString().length() == 0 ? "" : Global.DateConvertDMY(item.getH17()));
                spnResult.setSelection(Global.SpinnerItemPositionAnyLength(spnResult, item.getResult()));
                txtResultX.setText(item.getResultX());
                String[] d_rdogrpH16 = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH16.length; i++) {
                    if (item.getH16().equals(String.valueOf(d_rdogrpH16[i]))) {
                        rb = (RadioButton) rdogrpH16.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH16X.setText(item.getH16X());
                txtH13.setText(item.getH13());
                spnH14.setSelection(Global.SpinnerItemPositionAnyLength(spnH14, item.getH14()));
            }
        } catch (Exception e) {
            Connection.MessageBox(HHIdentity_final.this, e.getMessage());
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

    private void GenerateSuchanaID() {
        String D = spnDist.getSelectedItemPosition() > 0 ? Connection.SelectedSpinnerValue(spnDist.getSelectedItem().toString(), "-") : "";
        String U = spnUpz.getSelectedItemPosition() > 0 ? Connection.SelectedSpinnerValue(spnUpz.getSelectedItem().toString(), "-") : "";
        String Un = spnUn.getSelectedItemPosition() > 0 ? Connection.SelectedSpinnerValue(spnUn.getSelectedItem().toString(), "-") : "";
        String Vil = spnVill.getSelectedItemPosition() > 0 ? Connection.SelectedSpinnerValue(spnVill.getSelectedItem().toString(), "-") : "";
        String SID = D + U + Un + Vil + txtH11.getText().toString();
        txtSuchanaID.setText(SID);
    }

    protected Dialog onCreateDialog(int id) {
        final Calendar c = Calendar.getInstance();
        hour = c.get(Calendar.HOUR_OF_DAY);
        minute = c.get(Calendar.MINUTE);
        switch (id) {
            case DATE_DIALOG:
                return new DatePickerDialog(this, mDateSetListener, g.mYear, g.mMonth - 1, g.mDay);
            //case TIME_DIALOG:
            //    return new TimePickerDialog(this, timePickerListener, hour, minute,false);
        }
        return null;
    }
}