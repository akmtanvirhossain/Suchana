package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Illness2" android:label="Illness2" />

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

public class Illness2 extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    static String SlNo = "";
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
    LinearLayout secH172;
    View lineH172;
    TextView VlblH172;
    RadioGroup rdogrpH172;
    RadioButton rdoH1721;
    RadioButton rdoH1722;
    LinearLayout seclblH172;
    LinearLayout secSlNo;
    View lineSlNo;
    TextView VlblSlNo;
    EditText txtSlNo;
    LinearLayout secMSlNo;
    View lineMSlNo;
    TextView VlblMSlNo;
    Spinner spnMSlNo;
    LinearLayout secH172a;
    View lineH172a;
    TextView VlblH172a;
    Spinner spnH172a;
    LinearLayout secH172aX;
    View lineH172aX;
    TextView VlblH172aX;
    EditText txtH172aX;
    LinearLayout secH172b;
    View lineH172b;
    TextView VlblH172b;
    Spinner spnH172b;
    LinearLayout secH172cX;
    View lineH172cX;
    TextView VlblH172cX;
    EditText txtH172cX;
    LinearLayout secH172cY;
    View lineH172cY;
    TextView VlblH172cY;
    EditText txtH172cY;
    LinearLayout secH172cM;
    View lineH172cM;
    TextView VlblH172cM;
    EditText txtH172cM;

    LinearLayout secH172d;
    View lineH172d;
    TextView VlblH172d;
    RadioGroup rdogrpH172d;
    RadioButton rdoH172d1;
    RadioButton rdoH172d2;

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
            setContentView(R.layout.illness2);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");
            SlNo = IDbundle.getString("SlNo");
            TableName = "Illness2";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(getApplicationContext());
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Illness2_list.class);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(getApplicationContext());
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
            secH172 = (LinearLayout) findViewById(R.id.secH172);
            lineH172 = (View) findViewById(R.id.lineH172);
            VlblH172 = (TextView) findViewById(R.id.VlblH172);
            rdogrpH172 = (RadioGroup) findViewById(R.id.rdogrpH172);

            rdoH1721 = (RadioButton) findViewById(R.id.rdoH1721);
            rdoH1722 = (RadioButton) findViewById(R.id.rdoH1722);

            rdogrpH172.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH172 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH172.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH172.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH172[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secSlNo.setVisibility(View.GONE);
                        lineSlNo.setVisibility(View.GONE);
                        secMSlNo.setVisibility(View.GONE);
                        spnMSlNo.setSelection(0);
                        //txtSlNo.setText("");
                        seclblH172.setVisibility(View.GONE);
                        secH172a.setVisibility(View.GONE);
                        spnH172a.setSelection(0);
                        secH172aX.setVisibility(View.GONE);
                        txtH172aX.setText("");
                        secH172b.setVisibility(View.GONE);
                        spnH172b.setSelection(0);
                        secH172cX.setVisibility(View.GONE);
                        txtH172cX.setText("");
                        secH172cY.setVisibility(View.GONE);
                        txtH172cY.setText("");
                        secH172cM.setVisibility(View.GONE);
                        txtH172cM.setText("");
                        secH172d.setVisibility(View.GONE);
                        rdogrpH172d.clearCheck();;

                    } else {
                        secSlNo.setVisibility(View.VISIBLE);
                        lineSlNo.setVisibility(View.VISIBLE);
                        secMSlNo.setVisibility(View.VISIBLE);
                        seclblH172.setVisibility(View.VISIBLE);
                        secH172a.setVisibility(View.VISIBLE);
                        secH172aX.setVisibility(View.VISIBLE);
                        secH172b.setVisibility(View.VISIBLE);
                        secH172cX.setVisibility(View.VISIBLE);
                        secH172cY.setVisibility(View.VISIBLE);
                        secH172cM.setVisibility(View.VISIBLE);
                        secH172d.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });


            seclblH172 = (LinearLayout) findViewById(R.id.seclblH172);
            secSlNo = (LinearLayout) findViewById(R.id.secSlNo);
            lineSlNo = (View) findViewById(R.id.lineSlNo);
            VlblSlNo = (TextView) findViewById(R.id.VlblSlNo);
            txtSlNo = (EditText) findViewById(R.id.txtSlNo);
            secMSlNo = (LinearLayout) findViewById(R.id.secMSlNo);
            lineMSlNo = (View) findViewById(R.id.lineMSlNo);
            VlblMSlNo = (TextView) findViewById(R.id.VlblMSlNo);
            spnMSlNo = (Spinner) findViewById(R.id.spnMSlNo);
            spnMSlNo.setAdapter(C.getArrayAdapter("select H21 ||'-'||H22 from member"));
            secH172a = (LinearLayout) findViewById(R.id.secH172a);
            lineH172a = (View) findViewById(R.id.lineH172a);
            VlblH172a = (TextView) findViewById(R.id.VlblH172a);
            spnH172a = (Spinner) findViewById(R.id.spnH172a);
            List<String> listH172a = new ArrayList<String>();

            listH172a.add("");
            listH172a.add("1-জ্বর");
            listH172a.add("2-ব্যথা");
            listH172a.add("3-দুর্বলতা");
            listH172a.add("4-ঠান্ডা/কাশি");
            listH172a.add("5-ত্বকেগুটি");
            listH172a.add("6-পাতলাপায়খানা");
            listH172a.add("7-ঝিমুনি");
            listH172a.add("8-বমিহওয়া বমিভাব");
            listH172a.add("9-ক্ষুদামন্দা");
            listH172a.add("10-অনিদ্রা");
            listH172a.add("11-রাতকানা ছানি");
            listH172a.add("12-কর্ণশূল শুনতেঅসুবিধা");
            listH172a.add("13-গর্ভাবস্থাজনিতসমস্যা");
            listH172a.add("14-প্রজননঅঙ্গজনিতসমস্যা লিউকোরিয়া");
            listH172a.add("15-রক্তাল্পতা");
            listH172a.add("16-ডায়বেটিস");
            listH172a.add("17-উচ্চরক্তচাপ");
            listH172a.add("18-গলগন্ড");
            listH172a.add("19-বেরিবেরি");
            listH172a.add("20-স্কার্ভি");
            listH172a.add("21-রিকেটস");
            listH172a.add("22-অন্যান্য");
            ArrayAdapter<String> adptrH172a = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH172a);
            spnH172a.setAdapter(adptrH172a);

            secH172aX = (LinearLayout) findViewById(R.id.secH172aX);
            lineH172aX = (View) findViewById(R.id.lineH172aX);
            VlblH172aX = (TextView) findViewById(R.id.VlblH172aX);
            txtH172aX = (EditText) findViewById(R.id.txtH172aX);
            secH172b = (LinearLayout) findViewById(R.id.secH172b);
            lineH172b = (View) findViewById(R.id.lineH172b);
            VlblH172b = (TextView) findViewById(R.id.VlblH172b);
            spnH172b = (Spinner) findViewById(R.id.spnH172b);
            List<String> listH172b = new ArrayList<String>();

            listH172b.add("");
            listH172b.add("1-কোনো চিকিৎসা নেয়া হয়নি");
            listH172b.add("2-বাড়তেই সাধারণ চিকিৎসা");
            listH172b.add("3-গ্রাম ডাক্তার");
            listH172b.add("4-প্যারামেডিক PC/CHCP/FWV/CHW/SS/HA/MA");
            listH172b.add("5-এলোপ্যাথিক ঔষুধ বিক্রেতা/ফার্মেসিস্ট (রোগ  বুঝে চিকিৎসা দেয়)");
            listH172b.add("6-যোগ্যতাসম্পন্ন সরকারী/বেসরকারী MBBS ডাক্তার");
            listH172b.add("7-প্যানেল ডাক্তার (BRAC)");
            listH172b.add("8-কবিরাজ/হেকিম/বৈদ্য");
            listH172b.add("9-হোমিওপ্যাথি");
            listH172b.add("10-অন্যান্য (নির্দিষ্ট করুন)");
            ArrayAdapter<String> adptrH172b = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH172b);
            spnH172b.setAdapter(adptrH172b);

            secH172cX = (LinearLayout) findViewById(R.id.secH172cX);
            lineH172cX = (View) findViewById(R.id.lineH172cX);
            VlblH172cX = (TextView) findViewById(R.id.VlblH172cX);
            txtH172cX = (EditText) findViewById(R.id.txtH172cX);
            secH172cY = (LinearLayout) findViewById(R.id.secH172cY);
            lineH172cY = (View) findViewById(R.id.lineH172cY);
            VlblH172cY = (TextView) findViewById(R.id.VlblH172cY);
            txtH172cY = (EditText) findViewById(R.id.txtH172cY);
            secH172cM = (LinearLayout) findViewById(R.id.secH172cM);
            lineH172cM = (View) findViewById(R.id.lineH172cM);
            VlblH172cM = (TextView) findViewById(R.id.VlblH172cM);
            txtH172cM = (EditText) findViewById(R.id.txtH172cM);

             secH172d= (LinearLayout) findViewById(R.id.secH172d);
             lineH172d= (View) findViewById(R.id.lineH172d);
             VlblH172d= (TextView) findViewById(R.id.VlblH172d);
             rdogrpH172d= (RadioGroup) findViewById(R.id.rdogrpH172d);
             rdoH172d1= (RadioButton) findViewById(R.id.rdoH172d1);
             rdoH172d2= (RadioButton) findViewById(R.id.rdoH172d2);


            secH172aX.setVisibility(View.GONE);
            spnH172a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH172a.getSelectedItem().toString(), "-").equals("22"))
                        {
                            secH172aX.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH172aX.setVisibility(View.GONE);
                            txtH172aX.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH172cX.setVisibility(View.GONE);
            spnH172b.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH172b.getSelectedItem().toString(), "-").equals("10"))
                        {
                            secH172cX.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH172cX.setVisibility(View.GONE);
                            txtH172cX.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            txtRnd.setText(RND);
            txtRnd.setEnabled(false);
            txtSuchanaID.setText(SUCHANAID);
            txtSuchanaID.setEnabled(false);
            txtSlNo.setText(SlNo);
            txtSlNo.setEnabled(false);


            DataSearch(RND,SUCHANAID,SlNo);
            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });


        } catch (Exception e) {
            Connection.MessageBox(Illness2.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(Illness2.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(Illness2.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(Illness2.this, "Required field: উপকারভোগী সদস্য আইডি সুচনা  নম্বর অনুসারে.");
                txtSuchanaID.requestFocus();
                return;
            } else if (!rdoH1721.isChecked() & !rdoH1722.isChecked() & secH172.isShown()) {
                Connection.MessageBox(Illness2.this, "Select anyone options from (১ বছর এর বেশী সময় ধরে কোনো খানা সদস্য অসুস্থ রয়েছে?).");
                rdoH1721.requestFocus();
                return;
            } else if (txtSlNo.getText().toString().length() == 0 & secSlNo.isShown()) {
                Connection.MessageBox(Illness2.this, "Required field: লাইন নং.");
                txtSlNo.requestFocus();
                return;
            }
            else if (spnMSlNo.getSelectedItem().toString().length() == 0 & secMSlNo.isShown()) {
                Connection.MessageBox(Illness2.this, "Required field: তথ্যদানে সহায়তাকারীর লাইন নম্বর #.");
                // txtMSlNo.requestFocus();
                return;
            }else if (Integer.valueOf(txtSlNo.getText().toString().length() == 0 ? "1" : txtSlNo.getText().toString()) < 1 || Integer.valueOf(txtSlNo.getText().toString().length() == 0 ? "40" : txtSlNo.getText().toString()) > 40) {
                Connection.MessageBox(Illness2.this, "Value should be between 1 and 40(লাইন নং).");
                txtSlNo.requestFocus();
                return;
            } else if (spnH172a.getSelectedItemPosition() == 0 & secH172a.isShown()) {
                Connection.MessageBox(Illness2.this, "Required field: বিগত ১ বছর এর বেশী সময় এর মধ্যে অসুস্থতার ধরন.");
                spnH172a.requestFocus();
                return;
            } else if (txtH172aX.getText().toString().length() == 0 & secH172aX.isShown()) {
                Connection.MessageBox(Illness2.this, "Required field: অন্যান্য.");
                txtH172aX.requestFocus();
                return;
            } else if (spnH172b.getSelectedItemPosition() == 0 & secH172b.isShown()) {
                Connection.MessageBox(Illness2.this, "Required field: কোন চিকিৎসা নেয়া হয়েছিল.");
                spnH172b.requestFocus();
                return;
            } else if (txtH172cX.getText().toString().length() == 0 & secH172cX.isShown()) {
                Connection.MessageBox(Illness2.this, "Required field: অন্যান্য.");
                txtH172cX.requestFocus();
                return;
            } else if (txtH172cY.getText().toString().length() == 0 & secH172cY.isShown()) {
                Connection.MessageBox(Illness2.this, "Required field: অসুস্থতার মোট সময়কাল (বছর).");
                txtH172cY.requestFocus();
                return;
            } else if (Integer.valueOf(txtH172cY.getText().toString().length() == 0 ? "0" : txtH172cY.getText().toString()) < 0 || Integer.valueOf(txtH172cY.getText().toString().length() == 0 ? "99" : txtH172cY.getText().toString()) > 99) {
                Connection.MessageBox(Illness2.this, "Value should be between 0 and 99(অসুস্থতার মোট সময়কাল (বছর)).");
                txtH172cY.requestFocus();
                return;
            } else if (txtH172cM.getText().toString().length() == 0 & secH172cM.isShown()) {
                Connection.MessageBox(Illness2.this, "Required field: অসুস্থতার মোট সময়কাল (মাস).");
                txtH172cM.requestFocus();
                return;
            } else if (Integer.valueOf(txtH172cM.getText().toString().length() == 0 ? "0" : txtH172cM.getText().toString()) < 0 || Integer.valueOf(txtH172cM.getText().toString().length() == 0 ? "11" : txtH172cM.getText().toString()) > 11) {
                Connection.MessageBox(Illness2.this, "Value should be between 0 and 11(অসুস্থতার মোট সময়কাল (মাস)).");
                txtH172cM.requestFocus();
                return;
            }
            else if (!rdoH172d1.isChecked() & !rdoH172d2.isChecked() & secH172d.isShown()) {
                Connection.MessageBox(Illness2.this, "Select anyone options from (এই খানায় 5 years or below কোন জীবিত শিশুর মৃত্যু হয়েছে গত 5 years ).");
                rdoH172d1.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            Illness2_DataModel objSave = new Illness2_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            String[] d_rdogrpH172 = new String[]{"1", "0"};
            objSave.setH172("");
            for (int i = 0; i < rdogrpH172.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH172.getChildAt(i);
                if (rb.isChecked()) objSave.setH172(d_rdogrpH172[i]);
            }

            objSave.setSlNo(txtSlNo.getText().toString());
            objSave.setMSlNo(Connection.SelectedSpinnerValue(spnMSlNo.getSelectedItem().toString(), "-"));
            objSave.setH172a((spnH172a.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH172a.getSelectedItem().toString(), "-")));
            objSave.setH172aX(txtH172aX.getText().toString());
            objSave.setH172b((spnH172b.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH172b.getSelectedItem().toString(), "-")));
            objSave.setH172cX(txtH172cX.getText().toString());
            objSave.setH172cY(txtH172cY.getText().toString());
            objSave.setH172cM(txtH172cM.getText().toString());
            String[] d_rdogrpH172d = new String[]{"1", "0"};
            objSave.setH172d("");
            for (int i = 0; i < rdogrpH172d.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH172d.getChildAt(i);
                if (rb.isChecked()) objSave.setH172d(d_rdogrpH172d[i]);
            }
            objSave.setStartTime(StartTime);
            objSave.setEndTime(g.CurrentTime24());
            objSave.setUserId(g.getUserId());
            objSave.setEntryUser(g.getUserId()); //from data entry user list
            //objSave.setLat(Double.toString(currentLatitude));
            //objSave.setLon(Double.toString(currentLongitude));

            String status = objSave.SaveUpdateData(this);
            if (status.length() == 0) {
                Connection.MessageBox(Illness2.this, "Saved Successfully");
            } else {
                Connection.MessageBox(Illness2.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(Illness2.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID,String Slno) {
        try {

            RadioButton rb;
            Illness2_DataModel d = new Illness2_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "' and SlNo='" + Slno + "'";
            List<Illness2_DataModel> data = d.SelectAll(this, SQL);
            for (Illness2_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                String[] d_rdogrpH172 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH172.length; i++) {
                    if (item.getH172().equals(String.valueOf(d_rdogrpH172[i]))) {
                        rb = (RadioButton) rdogrpH172.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtSlNo.setText(item.getSlNo());
                spnH172a.setSelection(Global.SpinnerItemPositionAnyLength(spnH172a, item.getH172a()));
                txtH172aX.setText(item.getH172aX());
                spnH172b.setSelection(Global.SpinnerItemPositionAnyLength(spnH172b, item.getH172b()));
                txtH172cX.setText(item.getH172cX());
                txtH172cY.setText(item.getH172cY());
                txtH172cM.setText(item.getH172cM());
                String[] d_rdogrpH172d = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH172d.length; i++) {
                    if (item.getH172d().equals(String.valueOf(d_rdogrpH172d[i]))) {
                        rb = (RadioButton) rdogrpH172d.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
            }
        } catch (Exception e) {
            Connection.MessageBox(Illness2.this, e.getMessage());
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