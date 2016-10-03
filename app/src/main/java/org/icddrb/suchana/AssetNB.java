package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".AssetNB" android:label="AssetNB" />

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
import android.graphics.Color;
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
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
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

public class AssetNB extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    static String H42A = "";
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
    LinearLayout seclblH42;
    LinearLayout secH42a;
    View lineH42a;
    TextView VlblH42a;
    Spinner spnH42a;
    LinearLayout secH42aX;
    View lineH42aX;
    TextView VlblH42aX;
    EditText txtH42aX;
    LinearLayout secH42b;
    View lineH42b;
    TextView VlblH42b;
    EditText txtH42b;
    LinearLayout secH42c;
    View lineH42c;
    TextView VlblH42c;
    EditText txtH42c;
    LinearLayout seclblH42a;
    LinearLayout secH42d1;
    View lineH42d1;
    TextView VlblH42d1;
    CheckBox chkH42d1;
    LinearLayout secH42d2;
    View lineH42d2;
    TextView VlblH42d2;
    CheckBox chkH42d2;
    LinearLayout secH42d3;
    View lineH42d3;
    TextView VlblH42d3;
    CheckBox chkH42d3;
    LinearLayout secH42d4;
    View lineH42d4;
    TextView VlblH42d4;
    CheckBox chkH42d4;
    LinearLayout secH42d4X;
    View lineH42d4X;
    TextView VlblH42d4X;
    EditText txtH42d4X;
    LinearLayout secH42d4X1;
    View lineH42d4X1;
    TextView VlblH42d4X1;
    EditText txtH42d4X1;
    LinearLayout secH42d4X2;
    View lineH42d4X2;
    TextView VlblH42d4X2;
    EditText txtH42d4X2;
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
    boolean allItemsCompleted = false;
    Button cmdSave;
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
            setContentView(R.layout.assetnb);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");
            TableName = "AssetNB";

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
                    AlertDialog.Builder adb = new AlertDialog.Builder(AssetNB.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), AssetB.class);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(AssetNB.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to start Land [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDBundle = new Bundle();
                            IDBundle.putString("Rnd", RND);
                            IDBundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Land_list.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDBundle);
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
            spnMSlNo = (Spinner) findViewById(R.id.spnMSlNo);
            spnMSlNo.setAdapter(C.getArrayAdapter("Select '' union Select H21||'-'||H22 from Member where Rnd='" + RND + "' and SuchanaId='" + SUCHANAID + "'"));

            txtRnd.setText(RND);
            txtSuchanaID.setText(SUCHANAID);

            txtRnd.setEnabled(false);
            txtSuchanaID.setEnabled(false);
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

            buttonColor();

            buttonAssetType01.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    spnH42a.setSelection(Integer.valueOf((((Button) v).getText().toString())));


                }
            });
            buttonAssetType02.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH42a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType03.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH42a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType04.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH42a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType05.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH42a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType06.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH42a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType07.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH42a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType08.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH42a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType09.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH42a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH42a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH42a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH42a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH42a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH42a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });
            buttonAssetType15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonColor();
                    (v).setBackgroundColor(Color.CYAN);
                    ;
                    spnH42a.setSelection(Integer.valueOf((((Button) v).getText().toString())));
                }
            });

            
            seclblH42 = (LinearLayout) findViewById(R.id.seclblH42);
            secH42a = (LinearLayout) findViewById(R.id.secH42a);
            lineH42a = (View) findViewById(R.id.lineH42a);
            VlblH42a = (TextView) findViewById(R.id.VlblH42a);
            spnH42a = (Spinner) findViewById(R.id.spnH42a);
            List<String> listH42a = new ArrayList<String>();

            listH42a.add("");
            listH42a.add("01-রেডিও / ক্যাসেট প্লেয়া / ডিভিডি / সিডি প্লেয়ার");
            listH42a.add("02-টিভি");
            listH42a.add("03-বৈদ্যুতিক পাখা");
            listH42a.add("04-মোবাইল ফোন");
            listH42a.add("05-বাই  সাইকেল");
            listH42a.add("06-মোটর সাইকেল");
            listH42a.add("07-চেয়ার");
            listH42a.add("08-টেবিল");
            listH42a.add("09-চৌকি/খাট/পালঙ্ক");
            listH42a.add("10-সোফা (যেকোন ধরনের)");
            listH42a.add("11-মশারি");
            listH42a.add("12-অলঙ্কার");
            listH42a.add("13-বিয়ে বা পালা পর্বনের জন্য দামি শাড়ি");
            listH42a.add("14- অন্যান্য");
            listH42a.add("15- অন্যান্য");
            ArrayAdapter<String> adptrH42a = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH42a);
            spnH42a.setAdapter(adptrH42a);
            spnH42a.setClickable(false);
            spnH42a.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    if (event.getAction() == MotionEvent.ACTION_UP) {
                        // Toast.makeText(SpinnerActivity.this, "Catch it!", Toast.LENGTH_SHORT).show();
                    }
                    return true;
                }
            });
            spnH42a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH42a.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH42a.getSelectedItem().toString(), "-");
                    DataSearchPartial(txtRnd.getText().toString(), txtSuchanaID.getText().toString(), spnData);

                    if (spnData.equalsIgnoreCase("14")) {
                        secH42aX.setVisibility(View.VISIBLE);
                    } else if (spnData.equalsIgnoreCase("15")) {
                        secH42aX.setVisibility(View.VISIBLE);

                    } else {
                        txtH42aX.setText("");
                        secH42aX.setVisibility(View.GONE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH42aX = (LinearLayout) findViewById(R.id.secH42aX);
            secH42aX.setVisibility(View.GONE);
            lineH42aX = (View) findViewById(R.id.lineH42aX);
            VlblH42aX = (TextView) findViewById(R.id.VlblH42aX);
            txtH42aX = (EditText) findViewById(R.id.txtH42aX);
            secH42b = (LinearLayout) findViewById(R.id.secH42b);
            lineH42b = (View) findViewById(R.id.lineH42b);
            VlblH42b = (TextView) findViewById(R.id.VlblH42b);
            txtH42b = (EditText) findViewById(R.id.txtH42b);
            txtH42b.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {

                    if (txtH42b.getText().toString().equals("0") || txtH42b.getText().toString().equals("00")) {
                        secH42c.setVisibility(View.GONE);
                        seclblH42a.setVisibility(View.GONE);
                        secH42d1.setVisibility(View.GONE);
                        secH42d2.setVisibility(View.GONE);
                        secH42d3.setVisibility(View.GONE);
                        secH42d4.setVisibility(View.GONE);
                        secH42d4X.setVisibility(View.GONE);
                        secH42d4X1.setVisibility(View.GONE);
                        secH42d4X2.setVisibility(View.GONE);

                    } else {
                        secH42c.setVisibility(View.VISIBLE);
                        seclblH42a.setVisibility(View.VISIBLE);
                        secH42d1.setVisibility(View.VISIBLE);
                        secH42d2.setVisibility(View.VISIBLE);
                        secH42d3.setVisibility(View.VISIBLE);
                        secH42d4.setVisibility(View.VISIBLE);

                    }
                }
            });
            secH42c = (LinearLayout) findViewById(R.id.secH42c);
            lineH42c = (View) findViewById(R.id.lineH42c);
            VlblH42c = (TextView) findViewById(R.id.VlblH42c);
            txtH42c = (EditText) findViewById(R.id.txtH42c);
            seclblH42a = (LinearLayout) findViewById(R.id.seclblH42a);
            secH42d1 = (LinearLayout) findViewById(R.id.secH42d1);
            lineH42d1 = (View) findViewById(R.id.lineH42d1);
            VlblH42d1 = (TextView) findViewById(R.id.VlblH42d1);
            chkH42d1 = (CheckBox) findViewById(R.id.chkH42d1);
            secH42d2 = (LinearLayout) findViewById(R.id.secH42d2);
            lineH42d2 = (View) findViewById(R.id.lineH42d2);
            VlblH42d2 = (TextView) findViewById(R.id.VlblH42d2);
            chkH42d2 = (CheckBox) findViewById(R.id.chkH42d2);
            secH42d3 = (LinearLayout) findViewById(R.id.secH42d3);
            lineH42d3 = (View) findViewById(R.id.lineH42d3);
            VlblH42d3 = (TextView) findViewById(R.id.VlblH42d3);
            chkH42d3 = (CheckBox) findViewById(R.id.chkH42d3);
            secH42d4 = (LinearLayout) findViewById(R.id.secH42d4);
            lineH42d4 = (View) findViewById(R.id.lineH42d4);
            VlblH42d4 = (TextView) findViewById(R.id.VlblH42d4);
            chkH42d4 = (CheckBox) findViewById(R.id.chkH42d4);

            chkH42d4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        secH42d4X.setVisibility(View.VISIBLE);
                        secH42d4X1.setVisibility(View.VISIBLE);
                        secH42d4X2.setVisibility(View.VISIBLE);

                    } else {
                        txtH42d4X.setText("");
                        txtH42d4X1.setText("");
                        txtH42d4X2.setText("");

                        secH42d4X.setVisibility(View.GONE);
                        secH42d4X1.setVisibility(View.GONE);
                        secH42d4X2.setVisibility(View.GONE);


                    }
                }
            });
            
            secH42d4X = (LinearLayout) findViewById(R.id.secH42d4X);
            lineH42d4X = (View) findViewById(R.id.lineH42d4X);
            VlblH42d4X = (TextView) findViewById(R.id.VlblH42d4X);
            txtH42d4X = (EditText) findViewById(R.id.txtH42d4X);
            secH42d4X1 = (LinearLayout) findViewById(R.id.secH42d4X1);
            lineH42d4X1 = (View) findViewById(R.id.lineH42d4X1);
            VlblH42d4X1 = (TextView) findViewById(R.id.VlblH42d4X1);
            txtH42d4X1 = (EditText) findViewById(R.id.txtH42d4X1);
            secH42d4X2 = (LinearLayout) findViewById(R.id.secH42d4X2);
            lineH42d4X2 = (View) findViewById(R.id.lineH42d4X2);
            VlblH42d4X2 = (TextView) findViewById(R.id.VlblH42d4X2);
            txtH42d4X2 = (EditText) findViewById(R.id.txtH42d4X2);

            secH42d4X.setVisibility(View.GONE);
            secH42d4X1.setVisibility(View.GONE);
            secH42d4X2.setVisibility(View.GONE);


            DataSearch(RND, SUCHANAID, H42A);


            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(AssetNB.this, e.getMessage());
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

        AssetNB_DataModel d = new AssetNB_DataModel();
        String SQL = "Select H42a from " + TableName + "  Where Rnd='" + txtRnd.getText().toString() + "' and SuchanaID='" + txtSuchanaID.getText().toString() + "'";
        List<AssetNB_DataModel> data = d.SelectH42a(this, SQL);
        if (data.size() == 0) {
            return;
        }
        if (data.size() == 15) {
            allItemsCompleted = true;
        } else if (data.size() == 14) {
            cmdSave.setText("Save -> Continue");
        } else {
            cmdSave.setText("SAVE");
        }

        for (AssetNB_DataModel item : data) {

            int code = Integer.valueOf(item.getH42a());
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

        }

        // ((Button)pressedButton).setBackgroundColor(Color.CYAN);

    }
    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(AssetNB.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(AssetNB.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(AssetNB.this, "Required field: উপকারভোগী সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (spnMSlNo.getSelectedItemPosition() == 0 & secMSlNo.isShown()) {
                Connection.MessageBox(AssetNB.this, "Required field: তথ্যদানে সহায়তাকারীর লাইন নম্বর #.");
                spnMSlNo.requestFocus();
                return;
            } else if (spnH42a.getSelectedItemPosition() == 0 & secH42a.isShown()) {
                Connection.MessageBox(AssetNB.this, "Required field: সম্পদ.");
                spnH42a.requestFocus();
                return;
            } else if (txtH42aX.getText().toString().length() == 0 & secH42aX.isShown()) {
                Connection.MessageBox(AssetNB.this, "Required field: অন্যান্য সম্পদ.");
                txtH42aX.requestFocus();
                return;
            } else if (txtH42b.getText().toString().length() == 0 & secH42b.isShown()) {
                Connection.MessageBox(AssetNB.this, "Required field: সংখ্যা.");
                txtH42b.requestFocus();
                return;
            } else if (Integer.valueOf(txtH42b.getText().toString().length() == 0 ? "0" : txtH42b.getText().toString()) < 0 || Integer.valueOf(txtH42b.getText().toString().length() == 0 ? "99" : txtH42b.getText().toString()) > 99) {
                Connection.MessageBox(AssetNB.this, "Value should be between 0 and 99(সংখ্যা).");
                txtH42b.requestFocus();
                return;
            } else if (txtH42c.getText().toString().length() == 0 & secH42c.isShown()) {
                Connection.MessageBox(AssetNB.this, "Required field: সম্পদের বর্তমান মূল্য.");
                txtH42c.requestFocus();
                return;
            } else if (Integer.valueOf(txtH42c.getText().toString().length() == 0 ? "0" : txtH42c.getText().toString()) < 0 || Integer.valueOf(txtH42c.getText().toString().length() == 0 ? "999999" : txtH42c.getText().toString()) > 999999) {
                Connection.MessageBox(AssetNB.this, "Value should be between 0 and 999999(সম্পদের বর্তমান মূল্য).");
                txtH42c.requestFocus();
                return;
            } else if (!chkH42d1.isChecked() && !chkH42d2.isChecked() && !chkH42d3.isChecked() && !chkH42d4.isChecked() && secH42d1.isShown()) {
                Connection.MessageBox(AssetNB.this, "Required field: কিভাবে বদলি করেছেন ");
                chkH42d1.requestFocus();
                return;
            } else if (txtH42d4X.getText().toString().length() == 0 & secH42d4X.isShown()) {
                Connection.MessageBox(AssetNB.this, "Required field: অনান্য উল্লেখ করুন.");
                txtH42d4X.requestFocus();
                return;
            } /*else if (txtH42d4X1.getText().toString().length() == 0 & secH42d4X1.isShown()) {
                Connection.MessageBox(AssetNB.this, "Required field: অনান্য উল্লেখ করুন.");
                txtH42d4X1.requestFocus();
                return;
            } else if (txtH42d4X2.getText().toString().length() == 0 & secH42d4X2.isShown()) {
                Connection.MessageBox(AssetNB.this, "Required field: অনান্য উল্লেখ করুন.");
                txtH42d4X2.requestFocus();
                return;
            }*/

            String SQL = "";
            RadioButton rb;

            AssetNB_DataModel objSave = new AssetNB_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setMSlNo((spnMSlNo.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnMSlNo.getSelectedItem().toString(), "-")));
            objSave.setH42a((spnH42a.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH42a.getSelectedItem().toString(), "-")));
            objSave.setH42aX(txtH42aX.getText().toString());
            objSave.setH42b(txtH42b.getText().toString());
            objSave.setH42c(txtH42c.getText().toString());
            objSave.setH42d1((chkH42d1.isChecked() ? "1" : "2"));
            objSave.setH42d2((chkH42d2.isChecked() ? "1" : "2"));
            objSave.setH42d3((chkH42d3.isChecked() ? "1" : "2"));
            objSave.setH42d4((chkH42d4.isChecked() ? "1" : "2"));
            objSave.setH42d4X(txtH42d4X.getText().toString());
            objSave.setH42d4X1(txtH42d4X1.getText().toString());
            objSave.setH42d4X2(txtH42d4X2.getText().toString());
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
                    IDBundle.putString("H41a", "");
                    startActivity(new Intent(AssetNB.this, Land.class).putExtras(IDBundle));
                    // Connection.MessageBox(AssetB.this, "Saved Successfully");
                }
            } else {
                Connection.MessageBox(AssetNB.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(AssetNB.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID, String H42a) {
        try {

            RadioButton rb;
            AssetNB_DataModel d = new AssetNB_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<AssetNB_DataModel> data = d.SelectAll(this, SQL);
            for (AssetNB_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                spnMSlNo.setSelection(Global.SpinnerItemPositionAnyLength(spnMSlNo, item.getMSlNo()));
                spnH42a.setSelection(Global.SpinnerItemPositionAnyLength(spnH42a, item.getH42a()));
                txtH42aX.setText(item.getH42aX());
                txtH42b.setText(item.getH42b());
                txtH42c.setText(item.getH42c());
                if (item.getH42d1().equals("1")) {
                    chkH42d1.setChecked(true);
                } else if (item.getH42d1().equals("2")) {
                    chkH42d1.setChecked(false);
                }
                if (item.getH42d2().equals("1")) {
                    chkH42d2.setChecked(true);
                } else if (item.getH42d2().equals("2")) {
                    chkH42d2.setChecked(false);
                }
                if (item.getH42d3().equals("1")) {
                    chkH42d3.setChecked(true);
                } else if (item.getH42d3().equals("2")) {
                    chkH42d3.setChecked(false);
                }
                if (item.getH42d4().equals("1")) {
                    chkH42d4.setChecked(true);
                } else if (item.getH42d4().equals("2")) {
                    chkH42d4.setChecked(false);
                }
                txtH42d4X.setText(item.getH42d4X());
                txtH42d4X1.setText(item.getH42d4X1());
                txtH42d4X2.setText(item.getH42d4X2());
            }
        } catch (Exception e) {
            Connection.MessageBox(AssetNB.this, e.getMessage());
            return;
        }
    }

    private void DataSearchPartial(String Rnd, String SuchanaID, String H42a) {
        try {

            RadioButton rb;
            AssetNB_DataModel d = new AssetNB_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "' and H42a='" + H42a + "'";
            List<AssetNB_DataModel> data = d.SelectAll(this, SQL);
            for (AssetNB_DataModel item : data) {
                //txtRnd.setText(item.getRnd());
                //  txtSuchanaID.setText(item.getSuchanaID());
                spnH42a.setSelection(Global.SpinnerItemPositionAnyLength(spnH42a, item.getH42a()));
                txtH42aX.setText(item.getH42aX());
                txtH42b.setText(item.getH42b());
                txtH42c.setText(item.getH42c());
                if (item.getH42d1().equals("1")) {
                    chkH42d1.setChecked(true);
                } else if (item.getH42d1().equals("2")) {
                    chkH42d1.setChecked(false);
                }
                if (item.getH42d2().equals("1")) {
                    chkH42d2.setChecked(true);
                } else if (item.getH42d2().equals("2")) {
                    chkH42d2.setChecked(false);
                }
                if (item.getH42d3().equals("1")) {
                    chkH42d3.setChecked(true);
                } else if (item.getH42d3().equals("2")) {
                    chkH42d3.setChecked(false);
                }
                if (item.getH42d4().equals("1")) {
                    chkH42d4.setChecked(true);
                } else if (item.getH42d4().equals("2")) {
                    chkH42d4.setChecked(true);
                    chkH42d4.setChecked(false);
                }
                txtH42d4X.setText(item.getH42d4X());
                txtH42d4X1.setText(item.getH42d4X1());
                txtH42d4X2.setText(item.getH42d4X2());
            }
            if (data.size() == 0) {

                txtH42aX.setText("");
                txtH42b.setText("");
                txtH42c.setText("");
                chkH42d1.setChecked(false);

                chkH42d2.setChecked(false);
                chkH42d3.setChecked(false);
                chkH42d4.setChecked(true);
                chkH42d4.setChecked(false);

                txtH42d4X.setText("");
                txtH42d4X1.setText("");
                txtH42d4X2.setText("");
            }
        } catch (Exception e) {
            Connection.MessageBox(AssetNB.this, e.getMessage());
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