package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Land" android:label="Land" />

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

public class Land extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    static String SLNO = "";
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
    LinearLayout seclb50;
    LinearLayout seclb501;
    LinearLayout secSlNo;
    TextView VlblSlNo;
    EditText txtSlNo;
    LinearLayout secH5a;
    TextView VlblH5a;
    Spinner spnH5a;
    LinearLayout secH5b;
    TextView VlblH5b;
    Spinner spnH5b;
    LinearLayout secH5bx;
    TextView VlblH5bx;
    EditText txtH5bx;
    LinearLayout secH5c;
    TextView VlblH5c;
    EditText txtH5c;
    LinearLayout secH5d;
    TextView VlblH5d;
    EditText txtH5d;
    LinearLayout secH5e;
    TextView VlblH5e;
    Spinner spnH5e;
    LinearLayout secH5f;
    TextView VlblH5f;
    Spinner spnH5f;
    LinearLayout secH5g;
    TextView VlblH5g;
    EditText txtH5g;
    LinearLayout secH5h;
    TextView VlblH5h;
    EditText txtH5h;
    LinearLayout secH5Year;
    TextView VlblH5Year;
    EditText txtH5Year;
    LinearLayout secH5Month;
    TextView VlblH5Month;
    EditText txtH5Month;
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
            setContentView(R.layout.land);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");
            SLNO = IDbundle.getString("SlNo");

            TableName = "Land";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Land.this);
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
            seclb50 = (LinearLayout) findViewById(R.id.seclb50);
            seclb501 = (LinearLayout) findViewById(R.id.seclb501);
            secSlNo = (LinearLayout) findViewById(R.id.secSlNo);
            VlblSlNo = (TextView) findViewById(R.id.VlblSlNo);
            txtSlNo = (EditText) findViewById(R.id.txtSlNo);
            secH5a = (LinearLayout) findViewById(R.id.secH5a);
            VlblH5a = (TextView) findViewById(R.id.VlblH5a);
            spnH5a = (Spinner) findViewById(R.id.spnH5a);
            List<String> listH5a = new ArrayList<String>();

            listH5a.add("");
            listH5a.add("1-ভিটেমাটি");
            listH5a.add("2-চাষযোগ্য বা আবাদী জমি");
            listH5a.add("3-গবাদি পশুর চারণের উপযোগী");
            listH5a.add("4-ভূমিঝোপ/জংলা জমি");
            listH5a.add("5-চাষযোগ্য পুকুর");
            listH5a.add("6-পরিত্যক্ত পুকুর");
            listH5a.add("7-বর্জ্য বা অনাবাদি জমি");
            listH5a.add("8-নদীগর্ভের বা হাওরের জমি");
            listH5a.add("9-অন্যান্য আবাসিক বা বাণিজ্যিক প্লট");
            ArrayAdapter<String> adptrH5a = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH5a);
            spnH5a.setAdapter(adptrH5a);

            secH5b = (LinearLayout) findViewById(R.id.secH5b);
            VlblH5b = (TextView) findViewById(R.id.VlblH5b);
            spnH5b = (Spinner) findViewById(R.id.spnH5b);

            secH5bx = (LinearLayout) findViewById(R.id.secH5bx);
            VlblH5bx = (TextView) findViewById(R.id.VlblH5bx);
            txtH5bx = (EditText) findViewById(R.id.txtH5bx);
            secH5bx.setVisibility(View.GONE);
            List<String> listH5b = new ArrayList<String>();

            listH5b.add("");
            listH5b.add("1-খাদ্যশষ্য");
            listH5b.add("2-শাকসবজি");
            listH5b.add("3-ফলমূল");
            listH5b.add("4-মাছ");
            listH5b.add("5-হাস/মুরগি");
            listH5b.add("6-গবাদিপশু");
            listH5b.add("7-অনান্য");
            listH5b.add("8-কিছু করা হয় না");
            ArrayAdapter<String> adptrH5b = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH5b);
            spnH5b.setAdapter(adptrH5b);

            spnH5b.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (position == 7) {
                        secH5bx.setVisibility(View.VISIBLE);
                    } else {
                        txtH5bx.setText("");
                        secH5bx.setVisibility(View.GONE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH5c = (LinearLayout) findViewById(R.id.secH5c);
            VlblH5c = (TextView) findViewById(R.id.VlblH5c);
            txtH5c = (EditText) findViewById(R.id.txtH5c);
            secH5d = (LinearLayout) findViewById(R.id.secH5d);
            VlblH5d = (TextView) findViewById(R.id.VlblH5d);
            txtH5d = (EditText) findViewById(R.id.txtH5d);
            secH5e = (LinearLayout) findViewById(R.id.secH5e);
            VlblH5e = (TextView) findViewById(R.id.VlblH5e);
            spnH5e = (Spinner) findViewById(R.id.spnH5e);
            List<String> listH5e = new ArrayList<String>();

            listH5e.add("");
            listH5e.add("1-পতিত জমি");
            listH5e.add("2-নিজপরিচালিত");
            listH5e.add("3-ভাড়া বা ইজারা নেয়া বা নগদ");
            listH5e.add("4-ভাড়া বা ইজারা নেয়া বা ফসল ভাগাভাগি");
            listH5e.add("5-বন্ধকনেয়া");
            listH5e.add("6-ভাড়া বা ইজারা দেয়া বা নগদ");
            listH5e.add("7-ভাড়া বা ইজারা দেয়া বা ফসল ভাগাভাগি");
            listH5e.add("8-বন্ধক দেয়া");
            ArrayAdapter<String> adptrH5e = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH5e);
            spnH5e.setAdapter(adptrH5e);

            secH5f = (LinearLayout) findViewById(R.id.secH5f);
            VlblH5f = (TextView) findViewById(R.id.VlblH5f);
            spnH5f = (Spinner) findViewById(R.id.spnH5f);
            List<String> listH5f = new ArrayList<String>();

            listH5f.add("");
            listH5f.add("1-পতিত জমি");
            listH5f.add("2-নিজপরিচালিত");
            listH5f.add("3-ভাড়া বা ইজারা নেয়া বা নগদ");
            listH5f.add("4-ভাড়া বা ইজারা নেয়া বা ফসল ভাগাভাগি");
            listH5f.add("5-বন্ধকনেয়া");
            listH5f.add("6-ভাড়া বা ইজারা দেয়া বা নগদ");
            listH5f.add("7-ভাড়া বা ইজারা দেয়া বা ফসল ভাগাভাগি");
            listH5f.add("8-বন্ধক দেয়া");
            ArrayAdapter<String> adptrH5f = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH5f);
            spnH5f.setAdapter(adptrH5f);

            secH5g = (LinearLayout) findViewById(R.id.secH5g);
            VlblH5g = (TextView) findViewById(R.id.VlblH5g);
            txtH5g = (EditText) findViewById(R.id.txtH5g);
            secH5h = (LinearLayout) findViewById(R.id.secH5h);
            VlblH5h = (TextView) findViewById(R.id.VlblH5h);
            txtH5h = (EditText) findViewById(R.id.txtH5h);
            secH5Year = (LinearLayout) findViewById(R.id.secH5Year);
            VlblH5Year = (TextView) findViewById(R.id.VlblH5Year);
            txtH5Year = (EditText) findViewById(R.id.txtH5Year);
            secH5Month = (LinearLayout) findViewById(R.id.secH5Month);
            VlblH5Month = (TextView) findViewById(R.id.VlblH5Month);
            txtH5Month = (EditText) findViewById(R.id.txtH5Month);


            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(Land.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(Land.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(Land.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(Land.this, "Required field: উপকারভোগী সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (txtSlNo.getText().toString().length() == 0 & secSlNo.isShown()) {
                Connection.MessageBox(Land.this, "Required field: Serial No.");
                txtSlNo.requestFocus();
                return;
            } else if (Integer.valueOf(txtSlNo.getText().toString().length() == 0 ? "01" : txtSlNo.getText().toString()) < 01 || Integer.valueOf(txtSlNo.getText().toString().length() == 0 ? "10" : txtSlNo.getText().toString()) > 10) {
                Connection.MessageBox(Land.this, "Value should be between 01 and 10(Serial No).");
                txtSlNo.requestFocus();
                return;
            } else if (spnH5a.getSelectedItemPosition() == 0 & secH5a.isShown()) {
                Connection.MessageBox(Land.this, "Required field: জমির  বিবরণ.");
                spnH5a.requestFocus();
                return;
            } else if (spnH5b.getSelectedItemPosition() == 0 & secH5b.isShown()) {
                Connection.MessageBox(Land.this, "Required field: এই সম্পদ দিয়ে কি উত্পাদন করা হয়.");
                spnH5b.requestFocus();
                return;
            } else if (txtH5bx.getText().toString().length() == 0 & secH5bx.isShown()) {
                Connection.MessageBox(Land.this, "Required field: অনান্য.");
                txtH5bx.requestFocus();
                return;
            } else if (txtH5c.getText().toString().length() == 0 & secH5c.isShown()) {
                Connection.MessageBox(Land.this, "Required field: মালিকানা.");
                txtH5c.requestFocus();
                return;
            } else if (Integer.valueOf(txtH5c.getText().toString().length() == 0 ? "01" : txtH5c.getText().toString()) < 01 || Integer.valueOf(txtH5c.getText().toString().length() == 0 ? "30" : txtH5c.getText().toString()) > 30) {
                Connection.MessageBox(Land.this, "Value should be between 01 and 30(মালিকানা).");
                txtH5c.requestFocus();
                return;
            } else if (txtH5d.getText().toString().length() == 0 & secH5d.isShown()) {
                Connection.MessageBox(Land.this, "Required field: আয়তন বা জমির পরিমান শতাংশ এ.");
                txtH5d.requestFocus();
                return;
            } else if (Integer.valueOf(txtH5d.getText().toString().length() == 0 ? "0001" : txtH5d.getText().toString()) < 0001 || Integer.valueOf(txtH5d.getText().toString().length() == 0 ? "9999" : txtH5d.getText().toString()) > 9999) {
                Connection.MessageBox(Land.this, "Value should be between 0001 and 9999(আয়তন বা জমির পরিমান শতাংশ এ).");
                txtH5d.requestFocus();
                return;
            } else if (spnH5e.getSelectedItemPosition() == 0 & secH5e.isShown()) {
                Connection.MessageBox(Land.this, "Required field: জমির বর্তমান ব্যবহারিকঅবস্থা.");
                spnH5e.requestFocus();
                return;
            } else if (spnH5f.getSelectedItemPosition() == 0 & secH5f.isShown()) {
                Connection.MessageBox(Land.this, "Required field: গত ঋতুতে জমির ব্যবহারিকঅবস্থা কি ছিল  (ফসল ক্যালেন্ডার অনুযায়ী).");
                spnH5f.requestFocus();
                return;
            } else if (txtH5g.getText().toString().length() == 0 & secH5g.isShown()) {
                Connection.MessageBox(Land.this, "Required field: জমিটি যদি টাকার বিনিময় ভাড়া বা ইজারা দেয়া হয়ে থাকে তাহলে গত ঋতুতে কত টাকা পেয়েছেন.");
                txtH5g.requestFocus();
                return;
            } else if (Integer.valueOf(txtH5g.getText().toString().length() == 0 ? "00000" : txtH5g.getText().toString()) < 00000 || Integer.valueOf(txtH5g.getText().toString().length() == 0 ? "99999" : txtH5g.getText().toString()) > 99999) {
                Connection.MessageBox(Land.this, "Value should be between 00000 and 99999(জমিটি যদি টাকার বিনিময় ভাড়া বা ইজারা দেয়া হয়ে থাকে তাহলে গত ঋতুতে কত টাকা পেয়েছেন).");
                txtH5g.requestFocus();
                return;
            } else if (txtH5h.getText().toString().length() == 0 & secH5h.isShown()) {
                Connection.MessageBox(Land.this, "Required field: জমির বর্তমান বাজার মূল্য বর্তমানে জমিটি কত টাকায় বিক্রি করতে পারবেন.");
                txtH5h.requestFocus();
                return;
            } else if (Integer.valueOf(txtH5h.getText().toString().length() == 0 ? "00000" : txtH5h.getText().toString()) < 00000 || Integer.valueOf(txtH5h.getText().toString().length() == 0 ? "99999" : txtH5h.getText().toString()) > 99999) {
                Connection.MessageBox(Land.this, "Value should be between 00000 and 99999(জমির বর্তমান বাজার মূল্য বর্তমানে জমিটি কত টাকায় বিক্রি করতে পারবেন).");
                txtH5h.requestFocus();
                return;
            } else if (txtH5Year.getText().toString().length() == 0 & secH5Year.isShown()) {
                Connection.MessageBox(Land.this, "Required field: আপনি জমিটির মালিকানা  কত বছর থেকে ভোগ করছেন.");
                txtH5Year.requestFocus();
                return;
            } else if (Integer.valueOf(txtH5Year.getText().toString().length() == 0 ? "00" : txtH5Year.getText().toString()) < 00 || Integer.valueOf(txtH5Year.getText().toString().length() == 0 ? "99" : txtH5Year.getText().toString()) > 99) {
                Connection.MessageBox(Land.this, "Value should be between 00 and 99(আপনি জমিটির মালিকানা  কত বছর থেকে ভোগ করছেন).");
                txtH5Year.requestFocus();
                return;
            } else if (txtH5Month.getText().toString().length() == 0 & secH5Month.isShown()) {
                Connection.MessageBox(Land.this, "Required field: আপনি জমিটির মালিকানা  কত মাস থেকে ভোগ করছেন.");
                txtH5Month.requestFocus();
                return;
            } else if (Integer.valueOf(txtH5Month.getText().toString().length() == 0 ? "00" : txtH5Month.getText().toString()) < 00 || Integer.valueOf(txtH5Month.getText().toString().length() == 0 ? "11" : txtH5Month.getText().toString()) > 11) {
                Connection.MessageBox(Land.this, "Value should be between 00 and 11(আপনি জমিটির মালিকানা  কত মাস থেকে ভোগ করছেন).");
                txtH5Month.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            Land_DataModel objSave = new Land_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setSlNo(txtSlNo.getText().toString());
            objSave.setH5a((spnH5a.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH5a.getSelectedItem().toString(), "-")));
            objSave.setH5b((spnH5b.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH5b.getSelectedItem().toString(), "-")));
            objSave.setH5bx(txtH5bx.getText().toString());
            objSave.setH5c(txtH5c.getText().toString());
            objSave.setH5d(txtH5d.getText().toString());
            objSave.setH5e((spnH5e.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH5e.getSelectedItem().toString(), "-")));
            objSave.setH5f((spnH5f.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH5f.getSelectedItem().toString(), "-")));
            objSave.setH5g(txtH5g.getText().toString());
            objSave.setH5h(txtH5h.getText().toString());
            objSave.setH5Year(txtH5Year.getText().toString());
            objSave.setH5Month(txtH5Month.getText().toString());
            objSave.setStartTime(StartTime);
            objSave.setEndTime(g.CurrentTime24());
            objSave.setUserId(g.getUserId());
            objSave.setEntryUser(g.getUserId()); //from data entry user list
            //objSave.setLat(Double.toString(currentLatitude));
            //objSave.setLon(Double.toString(currentLongitude));

            String status = objSave.SaveUpdateData(this);
            if (status.length() == 0) {
                Connection.MessageBox(Land.this, "Saved Successfully");
            } else {
                Connection.MessageBox(Land.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(Land.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID, String SlNo) {
        try {

            RadioButton rb;
            Land_DataModel d = new Land_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "' and SlNo='" + SlNo + "'";
            List<Land_DataModel> data = d.SelectAll(this, SQL);
            for (Land_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                txtSlNo.setText(item.getSlNo());
                spnH5a.setSelection(Global.SpinnerItemPositionAnyLength(spnH5a, item.getH5a()));
                spnH5b.setSelection(Global.SpinnerItemPositionAnyLength(spnH5b, item.getH5b()));
                txtH5bx.setText(item.getH5bx());
                txtH5c.setText(item.getH5c());
                txtH5d.setText(item.getH5d());
                spnH5e.setSelection(Global.SpinnerItemPositionAnyLength(spnH5e, item.getH5e()));
                spnH5f.setSelection(Global.SpinnerItemPositionAnyLength(spnH5f, item.getH5f()));
                txtH5g.setText(item.getH5g());
                txtH5h.setText(item.getH5h());
                txtH5Year.setText(item.getH5Year());
                txtH5Month.setText(item.getH5Month());
            }
        } catch (Exception e) {
            Connection.MessageBox(Land.this, e.getMessage());
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