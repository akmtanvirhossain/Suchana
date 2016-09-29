package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Illness1" android:label="Illness1" />

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

//import android.support.v4.view.accessibility.AccessibilityRecordCompatIcs;

public class Illness1 extends Activity {
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
    LinearLayout seclbH17;
    LinearLayout secH171;
    View lineH171;
    TextView VlblH171;
    RadioGroup rdogrpH171;
    RadioButton rdoH1711;
    RadioButton rdoH1712;
    LinearLayout secSlNo;
    View lineSlNo;
    TextView VlblSlNo;
    EditText txtSlNo;
    LinearLayout secMSlNo;
    View lineMSlNo;
    TextView VlblMSlNo;
    Spinner spnMSlNo;
    LinearLayout secH171a;
    View lineH171a;
    TextView VlblH171a;
    Spinner spnH171a;
    LinearLayout secH171aX;
    View lineH171aX;
    TextView VlblH171aX;
    EditText txtH171aX;
    LinearLayout secH171b;
    View lineH171b;
    TextView VlblH171b;
    Spinner spnH171b;
    LinearLayout secH171bX;
    View lineH171bX;
    TextView VlblH171bX;
    EditText txtH171bX;
    LinearLayout secH171c;
    View lineH171c;
    TextView VlblH171c;
    EditText txtH171c;
    LinearLayout secH171d;
    View lineH171d;
    TextView VlblH171d;
    EditText txtH171d;
    LinearLayout seclblH17v;
    LinearLayout secH171VCost;
    View lineH171VCost;
    TextView VlblH171VCost;
    EditText txtH171VCost;
    LinearLayout secH171TCost;
    View lineH171TCost;
    TextView VlblH171TCost;
    EditText txtH171TCost;
    LinearLayout secH171TrCost;
    View lineH171TrCost;
    TextView VlblH171TrCost;
    EditText txtH171TrCost;
    LinearLayout secH171f;
    View lineH171f;
    TextView VlblH171f;
    RadioGroup rdogrpH171f;
    RadioButton rdoH171f1;
    RadioButton rdoH171f2;
    RadioButton rdoH171f3;
    LinearLayout secH171g;
    View lineH171g;
    TextView VlblH171g;
    EditText txtH171g;
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
            setContentView(R.layout.illness1);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();

            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");
            SlNo = IDbundle.getString("SlNo");

            TableName = "Illness1";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Illness1.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Illness1_list.class);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(Illness1.this);
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
            seclbH17 = (LinearLayout) findViewById(R.id.seclbH17);
            secH171 = (LinearLayout) findViewById(R.id.secH171);
            lineH171 = (View) findViewById(R.id.lineH171);
            VlblH171 = (TextView) findViewById(R.id.VlblH171);
            rdogrpH171 = (RadioGroup) findViewById(R.id.rdogrpH171);

            rdoH1711 = (RadioButton) findViewById(R.id.rdoH1711);
            rdoH1712 = (RadioButton) findViewById(R.id.rdoH1712);
            rdogrpH171.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH171 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH171.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH171.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH171[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secSlNo.setVisibility(View.GONE);
                        lineSlNo.setVisibility(View.GONE);
                        //txtSlNo.setText("");
                        secH171a.setVisibility(View.GONE);
                        lineH171a.setVisibility(View.GONE);
                        spnH171a.setSelection(0);
                        secH171aX.setVisibility(View.GONE);
                        lineH171aX.setVisibility(View.GONE);
                        txtH171aX.setText("");
                        secH171b.setVisibility(View.GONE);
                        lineH171b.setVisibility(View.GONE);
                        spnH171b.setSelection(0);
                        secH171bX.setVisibility(View.GONE);
                        lineH171bX.setVisibility(View.GONE);
                        txtH171bX.setText("");
                        secH171c.setVisibility(View.GONE);
                        lineH171c.setVisibility(View.GONE);
                        txtH171c.setText("");
                        secH171d.setVisibility(View.GONE);
                        lineH171d.setVisibility(View.GONE);
                        txtH171d.setText("");
                        secH171VCost.setVisibility(View.GONE);
                        lineH171VCost.setVisibility(View.GONE);
                        txtH171VCost.setText("");
                        secH171TCost.setVisibility(View.GONE);
                        lineH171TCost.setVisibility(View.GONE);
                        txtH171TCost.setText("");
                        secH171TrCost.setVisibility(View.GONE);
                        lineH171TrCost.setVisibility(View.GONE);
                        txtH171TrCost.setText("");
                        secMSlNo.setVisibility(View.GONE);

                        seclblH17v.setVisibility(View.GONE);
                        secH171f.setVisibility(View.GONE);
                        rdogrpH171f.clearCheck();
                        secH171g.setVisibility(View.GONE);
                        txtH171g.setText(null);

                    } else {
                        secSlNo.setVisibility(View.VISIBLE);
                        lineSlNo.setVisibility(View.VISIBLE);
                        secH171a.setVisibility(View.VISIBLE);
                        lineH171a.setVisibility(View.VISIBLE);
                       // secH171aX.setVisibility(View.VISIBLE);
                       // lineH171aX.setVisibility(View.VISIBLE);
                        secH171b.setVisibility(View.VISIBLE);
                        lineH171b.setVisibility(View.VISIBLE);
                       // secH171bX.setVisibility(View.VISIBLE);
                       // lineH171bX.setVisibility(View.VISIBLE);
                        secH171c.setVisibility(View.VISIBLE);
                        lineH171c.setVisibility(View.VISIBLE);
                        secH171d.setVisibility(View.VISIBLE);
                        lineH171d.setVisibility(View.VISIBLE);
                        secH171VCost.setVisibility(View.VISIBLE);
                        lineH171VCost.setVisibility(View.VISIBLE);
                        secH171TCost.setVisibility(View.VISIBLE);
                        lineH171TCost.setVisibility(View.VISIBLE);
                        secH171TrCost.setVisibility(View.VISIBLE);
                        lineH171TrCost.setVisibility(View.VISIBLE);

                        secMSlNo.setVisibility(View.VISIBLE);

                        seclblH17v.setVisibility(View.VISIBLE);
                        secH171f.setVisibility(View.VISIBLE);
                        secH171g.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secSlNo = (LinearLayout) findViewById(R.id.secSlNo);
            lineSlNo = (View) findViewById(R.id.lineSlNo);
            VlblSlNo = (TextView) findViewById(R.id.VlblSlNo);
            txtSlNo = (EditText) findViewById(R.id.txtSlNo);
            secMSlNo = (LinearLayout) findViewById(R.id.secMSlNo);
            lineMSlNo = (View) findViewById(R.id.lineMSlNo);
            VlblMSlNo = (TextView) findViewById(R.id.VlblMSlNo);
            spnMSlNo = (Spinner) findViewById(R.id.spnMSlNo);
            spnMSlNo.setAdapter(C.getArrayAdapter("select H21 ||'-'||H22 from member"));
            secH171a = (LinearLayout) findViewById(R.id.secH171a);
            lineH171a = (View) findViewById(R.id.lineH171a);
            VlblH171a = (TextView) findViewById(R.id.VlblH171a);
            spnH171a = (Spinner) findViewById(R.id.spnH171a);
            List<String> listH171a = new ArrayList<String>();

            listH171a.add("");
            listH171a.add("1-জ্বর");
            listH171a.add("2-ব্যথা ");
            listH171a.add("3-দুর্বলতা");
            listH171a.add("4-ঠান্ডা/কাশি");
            listH171a.add("5-ত্বকেগুটি");
            listH171a.add("6-পাতলাপায়খানা");
            listH171a.add("7-ঝিমুনি");
            listH171a.add("8-বমিহওয়া বমিভাব");
            listH171a.add("9-ক্ষুদামন্দা");
            listH171a.add("10-অনিদ্রা");
            listH171a.add("11-রাতকানা ছানি");
            listH171a.add("12-কর্ণশূল শুনতেঅসুবিধা");
            listH171a.add("13-গর্ভাবস্থাজনিতসমস্যা");
            listH171a.add("14-প্রজননঅঙ্গজনিতসমস্যা লিউকোরিয়া");
            listH171a.add("15-রক্তাল্পতা");
            listH171a.add("16-ডায়বেটিস");
            listH171a.add("17-উচ্চরক্তচাপ");
            listH171a.add("18-গলগন্ড");
            listH171a.add("19-বেরিবেরি");
            listH171a.add("20-স্কার্ভি");
            listH171a.add("21-রিকেটস");
            listH171a.add("22-অন্যান্য");
            ArrayAdapter<String> adptrH171a = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH171a);
            spnH171a.setAdapter(adptrH171a);

            secH171aX = (LinearLayout) findViewById(R.id.secH171aX);
            lineH171aX = (View) findViewById(R.id.lineH171aX);
            VlblH171aX = (TextView) findViewById(R.id.VlblH171aX);
            txtH171aX = (EditText) findViewById(R.id.txtH171aX);
            secH171b = (LinearLayout) findViewById(R.id.secH171b);
            lineH171b = (View) findViewById(R.id.lineH171b);
            VlblH171b = (TextView) findViewById(R.id.VlblH171b);
            spnH171b = (Spinner) findViewById(R.id.spnH171b);
            List<String> listH171b = new ArrayList<String>();

            listH171b.add("");
            listH171b.add("1-কোনো চিকিৎসা নেয়া হয়নি");
            listH171b.add("2-বাড়তেই সাধারণ চিকিৎসা");
            listH171b.add("3-গ্রাম ডাক্তার");
            listH171b.add("4-প্যারামেডিক PC/CHCP/FWV/CHW/SS/HA/MA   5-এলোপ্যাথিক ঔষুধ বিক্রেতা (রোগ  বুঝে চিকিৎসা দেয়)");
            listH171b.add("6-যোগ্যতাসম্পন্ন সরকারী/বেসরকারী MBBS ডাক্তার");
            listH171b.add("7-প্যানেল ডাক্তার (BRAC)");
            listH171b.add("8-কবিরাজ হেকিম  বিশ্বাস বৈদ্য");
            listH171b.add("9-হোমিওপ্যাথি");
            listH171b.add("10-অন্যান্য");
            ArrayAdapter<String> adptrH171b = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH171b);
            spnH171b.setAdapter(adptrH171b);

            secH171bX = (LinearLayout) findViewById(R.id.secH171bX);
            lineH171bX = (View) findViewById(R.id.lineH171bX);
            VlblH171bX = (TextView) findViewById(R.id.VlblH171bX);
            txtH171bX = (EditText) findViewById(R.id.txtH171bX);
            secH171c = (LinearLayout) findViewById(R.id.secH171c);
            lineH171c = (View) findViewById(R.id.lineH171c);
            VlblH171c = (TextView) findViewById(R.id.VlblH171c);
            txtH171c = (EditText) findViewById(R.id.txtH171c);
            secH171d = (LinearLayout) findViewById(R.id.secH171d);
            lineH171d = (View) findViewById(R.id.lineH171d);
            VlblH171d = (TextView) findViewById(R.id.VlblH171d);
            txtH171d = (EditText) findViewById(R.id.txtH171d);
            seclblH17v = (LinearLayout) findViewById(R.id.seclblH17v);
            secH171VCost = (LinearLayout) findViewById(R.id.secH171VCost);
            lineH171VCost = (View) findViewById(R.id.lineH171VCost);
            VlblH171VCost = (TextView) findViewById(R.id.VlblH171VCost);
            txtH171VCost = (EditText) findViewById(R.id.txtH171VCost);
            secH171TCost = (LinearLayout) findViewById(R.id.secH171TCost);
            lineH171TCost = (View) findViewById(R.id.lineH171TCost);
            VlblH171TCost = (TextView) findViewById(R.id.VlblH171TCost);
            txtH171TCost = (EditText) findViewById(R.id.txtH171TCost);
            secH171TrCost = (LinearLayout) findViewById(R.id.secH171TrCost);
            lineH171TrCost = (View) findViewById(R.id.lineH171TrCost);
            VlblH171TrCost = (TextView) findViewById(R.id.VlblH171TrCost);
            txtH171TrCost = (EditText) findViewById(R.id.txtH171TrCost);
            secH171f = (LinearLayout) findViewById(R.id.secH171f);
            lineH171f = (View) findViewById(R.id.lineH171f);
            VlblH171f = (TextView) findViewById(R.id.VlblH171f);
            rdogrpH171f = (RadioGroup) findViewById(R.id.rdogrpH171f);

            rdoH171f1 = (RadioButton) findViewById(R.id.rdoH171f1);
            rdoH171f2 = (RadioButton) findViewById(R.id.rdoH171f2);
            rdoH171f3 = (RadioButton) findViewById(R.id.rdoH171f3);
            secH171g = (LinearLayout) findViewById(R.id.secH171g);
            lineH171g = (View) findViewById(R.id.lineH171g);
            VlblH171g = (TextView) findViewById(R.id.VlblH171g);
            txtH171g = (EditText) findViewById(R.id.txtH171g);

            txtRnd.setText(RND);
            txtRnd.setEnabled(false);
            txtSuchanaID.setText(SUCHANAID);
            txtSuchanaID.setEnabled(false);
            txtSlNo.setText(SlNo);
            txtSlNo.setEnabled(false);

            secH171aX.setVisibility(View.GONE);
            spnH171a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH171a.getSelectedItem().toString(), "-").equals("22"))
                        {
                            secH171aX.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH171aX.setVisibility(View.GONE);
                            txtH171aX.setText(null);
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
            secH171bX.setVisibility(View.GONE);
            spnH171b.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                       if(spnH171b.getSelectedItemPosition()==1 || spnH171b.getSelectedItemPosition()==2)
                       {
                           secH171c.setVisibility(view.GONE);
                           txtH171c.setText(null);
                           secH171bX.setVisibility(View.GONE);
                       }
                       else if(Connection.SelectedSpinnerValue(spnH171b.getSelectedItem().toString(), "-").equals("10"))
                       {
                           secH171c.setVisibility(View.VISIBLE);
                           secH171bX.setVisibility(View.VISIBLE);
                       }
                       else
                       {
                           secH171c.setVisibility(view.VISIBLE);
                           secH171bX.setVisibility(View.GONE);
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




            rdogrpH171f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH171f = new String[]{"1", "0","8"};
                    for (int i = 0; i < rdogrpH171f.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH171f.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH171f[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {

                        secH171g.setVisibility(View.GONE);
                        txtH171g.setText("");

                    } else {
                        secH171g.setVisibility(View.VISIBLE);

                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            DataSearch(RND,SUCHANAID,SlNo);
            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(Illness1.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(Illness1.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(Illness1.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(Illness1.this, "Required field: উপকারভোগী সদস্য আইডি সুচনা  নম্বর অনুসারে.");
                txtSuchanaID.requestFocus();
                return;
            } else if (!rdoH1711.isChecked() & !rdoH1712.isChecked() & secH171.isShown()) {
                Connection.MessageBox(Illness1.this, "Select anyone options from (গত ১৫ দিনে  খানার কোন  সদস্য অসুস্থ হয়েছে).");
                rdoH1711.requestFocus();
                return;
            } else if (txtSlNo.getText().toString().length() == 0 & secSlNo.isShown()) {
                Connection.MessageBox(Illness1.this, "Required field: লাইন নং.");
                txtSlNo.requestFocus();
                return;
            }
            else if (spnMSlNo.getSelectedItem().toString().length() == 0 & secMSlNo.isShown()) {
                Connection.MessageBox(Illness1.this, "Required field: তথ্যদানে সহায়তাকারীর লাইন নম্বর #.");
                // txtMSlNo.requestFocus();
                return;
            }
            else if (Integer.valueOf(txtSlNo.getText().toString().length() == 0 ? "01" : txtSlNo.getText().toString()) < 01 || Integer.valueOf(txtSlNo.getText().toString().length() == 0 ? "30" : txtSlNo.getText().toString()) > 30) {
                Connection.MessageBox(Illness1.this, "Value should be between 01 and 30(লাইন নং).");
                txtSlNo.requestFocus();
                return;
            } else if (spnH171a.getSelectedItemPosition() == 0 & secH171a.isShown()) {
                Connection.MessageBox(Illness1.this, "Required field: বিগত 15 দিনের মধ্যে অসুস্থতার ধরন.");
                spnH171a.requestFocus();
                return;
            } else if (txtH171aX.getText().toString().length() == 0 & secH171aX.isShown()) {
                Connection.MessageBox(Illness1.this, "Required field: অন্যান্য.");
                txtH171aX.requestFocus();
                return;
            } else if (spnH171b.getSelectedItemPosition() == 0 & secH171b.isShown()) {
                Connection.MessageBox(Illness1.this, "Required field: প্রথম কোন চিকিৎসা নেয়া হয়েছিল.");
                spnH171b.requestFocus();
                return;
            } else if (txtH171bX.getText().toString().length() == 0 & secH171bX.isShown()) {
                Connection.MessageBox(Illness1.this, "Required field: অন্যান্য.");
                txtH171bX.requestFocus();
                return;
            } else if (txtH171c.getText().toString().length() == 0 & secH171c.isShown()) {
                Connection.MessageBox(Illness1.this, "Required field: যদি প্রথম চিকিৎসা HCP হয়, তবে অসুস্থতা শুরুর কত দিন পরে গিয়েছিলেন.");
                txtH171c.requestFocus();
                return;
            } else if (Integer.valueOf(txtH171c.getText().toString().length() == 0 ? "0" : txtH171c.getText().toString()) < 0 || Integer.valueOf(txtH171c.getText().toString().length() == 0 ? "999" : txtH171c.getText().toString()) > 999) {
                Connection.MessageBox(Illness1.this, "Value should be between 0 and 999(যদি প্রথম চিকিৎসা HCP হয়, তবে অসুস্থতা শুরুর কত দিন পরে গিয়েছিলেন).");
                txtH171c.requestFocus();
                return;
            } else if (txtH171d.getText().toString().length() == 0 & secH171d.isShown()) {
                Connection.MessageBox(Illness1.this, "Required field: অসুস্থতার মোট সময়কাল (শুরু থেকে সুস্থ হওয়া পর্যন্ত) (দিন).");
                txtH171d.requestFocus();
                return;
            } else if (Integer.valueOf(txtH171d.getText().toString().length() == 0 ? "000" : txtH171d.getText().toString()) < 000 || Integer.valueOf(txtH171d.getText().toString().length() == 0 ? "999" : txtH171d.getText().toString()) > 999) {
                Connection.MessageBox(Illness1.this, "Value should be between 000 and 999(অসুস্থতার মোট সময়কাল (শুরু থেকে সুস্থ হওয়া পর্যন্ত) (দিন)).");
                txtH171d.requestFocus();
                return;
            } else if (txtH171VCost.getText().toString().length() == 0 & secH171VCost.isShown()) {
                Connection.MessageBox(Illness1.this, "Required field: চিকিৎসার জন্য খরচ: ভিজিট.");
                txtH171VCost.requestFocus();
                return;
            } else if (Integer.valueOf(txtH171VCost.getText().toString().length() == 0 ? "0" : txtH171VCost.getText().toString()) < 0 || Integer.valueOf(txtH171VCost.getText().toString().length() == 0 ? "9999" : txtH171VCost.getText().toString()) > 9999) {
                Connection.MessageBox(Illness1.this, "Value should be between 0 and 9999(চিকিৎসার জন্য খরচ: ভিজিট).");
                txtH171VCost.requestFocus();
                return;
            } else if (txtH171TCost.getText().toString().length() == 0 & secH171TCost.isShown()) {
                Connection.MessageBox(Illness1.this, "Required field: চিকিৎসার জন্য খরচ: পরীক্ষা.");
                txtH171TCost.requestFocus();
                return;
            } else if (Integer.valueOf(txtH171TCost.getText().toString().length() == 0 ? "0" : txtH171TCost.getText().toString()) < 0 || Integer.valueOf(txtH171TCost.getText().toString().length() == 0 ? "99999" : txtH171TCost.getText().toString()) > 99999) {
                Connection.MessageBox(Illness1.this, "Value should be between 0 and 99999(চিকিৎসার জন্য খরচ: পরীক্ষা).");
                txtH171TCost.requestFocus();
                return;
            } else if (txtH171TrCost.getText().toString().length() == 0 & secH171TrCost.isShown()) {
                Connection.MessageBox(Illness1.this, "Required field: চিকিৎসার জন্য খরচ: যাতায়াত.");
                txtH171TrCost.requestFocus();
                return;
            } else if (Integer.valueOf(txtH171TrCost.getText().toString().length() == 0 ? "0" : txtH171TrCost.getText().toString()) < 0 || Integer.valueOf(txtH171TrCost.getText().toString().length() == 0 ? "99999" : txtH171TrCost.getText().toString()) > 99999) {
                Connection.MessageBox(Illness1.this, "Value should be between 0 and 99999(চিকিৎসার জন্য খরচ: যাতায়াত).");
                txtH171TrCost.requestFocus();
                return;
            } else if (!rdoH171f1.isChecked() & !rdoH171f2.isChecked() & !rdoH171f3.isChecked() & secH171f.isShown()) {
                Connection.MessageBox(Illness1.this, "Select anyone options from (আয়মূলক কর্মকান্ডে কি এই অসুস্থতা কি কোনো প্রভাব  ফেলেছিল? (>10 বছর)).");
                rdoH171f1.requestFocus();
                return;
            } else if (txtH171g.getText().toString().length() == 0 & secH171g.isShown()) {
                Connection.MessageBox(Illness1.this, "Required field: হ্যাঁ হলে কত দিনের জন্যে?.");
                txtH171g.requestFocus();
                return;
            } else if (Integer.valueOf(txtH171g.getText().toString().length() == 0 ? "1" : txtH171g.getText().toString()) < 1 || Integer.valueOf(txtH171g.getText().toString().length() == 0 ? "999" : txtH171g.getText().toString()) > 999) {
                Connection.MessageBox(Illness1.this, "Value should be between 1 and 999(হ্যাঁ হলে কত দিনের জন্যে?).");
                txtH171g.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            Illness1_DataModel objSave = new Illness1_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            String[] d_rdogrpH171 = new String[]{"1", "0"};
            objSave.setH171("");
            for (int i = 0; i < rdogrpH171.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH171.getChildAt(i);
                if (rb.isChecked()) objSave.setH171(d_rdogrpH171[i]);
            }

            objSave.setSlNo(txtSlNo.getText().toString());
            objSave.setMSlNo(Connection.SelectedSpinnerValue(spnMSlNo.getSelectedItem().toString(), "-"));
            objSave.setH171a((spnH171a.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH171a.getSelectedItem().toString(), "-")));
            objSave.setH171aX(txtH171aX.getText().toString());
            objSave.setH171b((spnH171b.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH171b.getSelectedItem().toString(), "-")));
            objSave.setH171bX(txtH171bX.getText().toString());
            objSave.setH171c(txtH171c.getText().toString());
            objSave.setH171d(txtH171d.getText().toString());
            objSave.setH171VCost(txtH171VCost.getText().toString());
            objSave.setH171TCost(txtH171TCost.getText().toString());
            objSave.setH171TrCost(txtH171TrCost.getText().toString());
            String[] d_rdogrpH171f = new String[]{"1", "0", "8"};
            objSave.setH171f("");
            for (int i = 0; i < rdogrpH171f.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH171f.getChildAt(i);
                if (rb.isChecked()) objSave.setH171f(d_rdogrpH171f[i]);
            }

            objSave.setH171g(txtH171g.getText().toString());
            objSave.setStartTime(StartTime);
            objSave.setEndTime(g.CurrentTime24());
            objSave.setUserId(g.getUserId());
            objSave.setEntryUser(g.getUserId()); //from data entry user list
            //objSave.setLat(Double.toString(currentLatitude));
            //objSave.setLon(Double.toString(currentLongitude));

            String status = objSave.SaveUpdateData(this);
            if (status.length() == 0) {
                Bundle IDBundle = new Bundle();
                IDBundle.putString("Rnd", txtRnd.getText().toString());
                IDBundle.putString("SuchanaID", txtSuchanaID.getText().toString());
                startActivity(new Intent(Illness1.this, Illness1_list.class).putExtras(IDBundle));

            } else {
                Connection.MessageBox(Illness1.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(Illness1.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID,String Slno) {
        try {

            RadioButton rb;
            Illness1_DataModel d = new Illness1_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "' and SlNo='" + Slno +"'";
            List<Illness1_DataModel> data = d.SelectAll(this, SQL);
            for (Illness1_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                String[] d_rdogrpH171 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH171.length; i++) {
                    if (item.getH171().equals(String.valueOf(d_rdogrpH171[i]))) {
                        rb = (RadioButton) rdogrpH171.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtSlNo.setText(item.getSlNo());
                spnH171a.setSelection(Global.SpinnerItemPositionAnyLength(spnH171a, item.getH171a()));
                txtH171aX.setText(item.getH171aX());
                spnH171b.setSelection(Global.SpinnerItemPositionAnyLength(spnH171b, item.getH171b()));
                txtH171bX.setText(item.getH171bX());
                txtH171c.setText(item.getH171c());
                txtH171d.setText(item.getH171d());
                txtH171VCost.setText(item.getH171VCost());
                txtH171TCost.setText(item.getH171TCost());
                txtH171TrCost.setText(item.getH171TrCost());
                String[] d_rdogrpH171f = new String[]{"1", "2", "9"};
                for (int i = 0; i < d_rdogrpH171f.length; i++) {
                    if (item.getH171f().equals(String.valueOf(d_rdogrpH171f[i]))) {
                        rb = (RadioButton) rdogrpH171f.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH171g.setText(item.getH171g());
            }
        } catch (Exception e) {
            Connection.MessageBox(Illness1.this, e.getMessage());
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