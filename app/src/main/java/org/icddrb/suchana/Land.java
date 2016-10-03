package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Land" android:label="Land" />

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.location.Location;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
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
    LinearLayout seclb50;
    LinearLayout seclb501;
    LinearLayout secSlNo;
    View lineSlNo;
    TextView VlblSlNo;
    EditText txtSlNo;
    LinearLayout secH5;
    View lineH5;
    TextView VlblH5;
    Spinner spnH5;
    LinearLayout secH5a;
    View lineH5a;
    TextView VlblH5a;
    Spinner spnH5a;
    LinearLayout secH5aX;
    View lineH5aX;
    TextView VlblH5aX;
    EditText txtH5aX;
    LinearLayout secH5b;
    View lineH5b;
    TextView VlblH5b;
    EditText txtH5b;
    LinearLayout secH5c;
    View lineH5c;
    TextView VlblH5c;
    EditText txtH5c;
    LinearLayout secH5d;
    View lineH5d;
    TextView VlblH5d;
    Spinner spnH5d;
    LinearLayout secH5e;
    View lineH5e;
    TextView VlblH5e;
    Spinner spnH5e;
    LinearLayout secH5f;
    View lineH5f;
    TextView VlblH5f;
    EditText txtH5f;
    LinearLayout secH5g;
    View lineH5g;
    TextView VlblH5g;
    EditText txtH5g;
    LinearLayout secH5hY;
    View lineH5hY;
    TextView VlblH5hY;
    EditText txtH5hY;
    LinearLayout secH5hM;
    View lineH5hM;
    TextView VlblH5hM;
    EditText txtH5hM;
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(Land.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Land_list.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDbundle);
                            getApplicationContext().startActivity(intent);
                            finish();
                        }
                    });
                    adb.show();
                }
            });
          /*  ImageButton cmdForward = (ImageButton) findViewById(R.id.cmdForward);
            cmdForward.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Land.this);
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
            txtRnd.setText(RND);
            txtSuchanaID.setText(SUCHANAID);
            txtRnd.setEnabled(false);
            txtSuchanaID.setEnabled(false);

            secMSlNo = (LinearLayout) findViewById(R.id.secMSlNo);
            lineMSlNo = (View) findViewById(R.id.lineMSlNo);
            VlblMSlNo = (TextView) findViewById(R.id.VlblMSlNo);
            spnMSlNo = (Spinner) findViewById(R.id.spnMSlNo);
            spnMSlNo.setAdapter(C.getArrayAdapter("Select '' union Select H21||'-'||H22 from Member where Rnd='" + RND + "' and SuchanaId='" + SUCHANAID + "'"));
            seclb50 = (LinearLayout) findViewById(R.id.seclb50);
            seclb501 = (LinearLayout) findViewById(R.id.seclb501);
            secSlNo = (LinearLayout) findViewById(R.id.secSlNo);
            lineSlNo = (View) findViewById(R.id.lineSlNo);
            VlblSlNo = (TextView) findViewById(R.id.VlblSlNo);
            txtSlNo = (EditText) findViewById(R.id.txtSlNo);

            //txtSlNo.setEnabled(false);
            int SlNo = 0;
            Cursor cursor = C.GetData("Land", "suchanaid", SUCHANAID);
            if (cursor.getCount() != 0) {
                SlNo = cursor.getCount() + 1;
            } else {
                SlNo = 1;
            }
            txtSlNo.setText(String.valueOf(SlNo));
            secH5 = (LinearLayout) findViewById(R.id.secH5);
            lineH5 = (View) findViewById(R.id.lineH5);
            VlblH5 = (TextView) findViewById(R.id.VlblH5);
            spnH5 = (Spinner) findViewById(R.id.spnH5);
            List<String> listH5 = new ArrayList<String>();

            listH5.add("");
            listH5.add("1-ভিটেমাটি");
            listH5.add("2-চাষযোগ্য আবাদী জমি");
            listH5.add("3-গবাদি পশুর চারণের উপযোগী");
            listH5.add("4-ভূমিঝোপ/জংলা জমি");
            listH5.add("5-চাষযোগ্য পুকুর");
            listH5.add("6-পরিত্যক্ত পুকুর");
            listH5.add("7-বর্জ্য বা অনাবাদি জমি");
            listH5.add("8-নদীগর্ভে/হাওরের জমি");
            listH5.add("9-অন্যান্য আবাসিক বা বাণিজ্যিক প্লট");
            ArrayAdapter<String> adptrH5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH5);
            spnH5.setAdapter(adptrH5);

            secH5a = (LinearLayout) findViewById(R.id.secH5a);
            lineH5a = (View) findViewById(R.id.lineH5a);
            VlblH5a = (TextView) findViewById(R.id.VlblH5a);
            spnH5a = (Spinner) findViewById(R.id.spnH5a);
            List<String> listH5a = new ArrayList<String>();

            listH5a.add("");
            listH5a.add("1-খাদ্যশস্য ");
            listH5a.add("2-শাকসবজি");
            listH5a.add("3-ফল ");
            listH5a.add("4-মাছ");
            listH5a.add("5-হাঁস/মুরগি");
            listH5a.add("6-গবাদিপশু");
            listH5a.add("7-অনান্য");
            listH5a.add("8-কিছুনা");
            ArrayAdapter<String> adptrH5a = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH5a);
            spnH5a.setAdapter(adptrH5a);

            spnH5a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH5a.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH5a.getSelectedItem().toString(), "-");
                    if (!spnData.equalsIgnoreCase("7")) {
                        secH5aX.setVisibility(View.GONE);
                        lineH5aX.setVisibility(View.GONE);
                    } else {
                        secH5aX.setVisibility(View.VISIBLE);
                        lineH5aX.setVisibility(View.VISIBLE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH5aX = (LinearLayout) findViewById(R.id.secH5aX);
            lineH5aX = (View) findViewById(R.id.lineH5aX);
            VlblH5aX = (TextView) findViewById(R.id.VlblH5aX);
            txtH5aX = (EditText) findViewById(R.id.txtH5aX);
            secH5b = (LinearLayout) findViewById(R.id.secH5b);
            lineH5b = (View) findViewById(R.id.lineH5b);
            VlblH5b = (TextView) findViewById(R.id.VlblH5b);
            txtH5b = (EditText) findViewById(R.id.txtH5b);
            secH5c = (LinearLayout) findViewById(R.id.secH5c);
            lineH5c = (View) findViewById(R.id.lineH5c);
            VlblH5c = (TextView) findViewById(R.id.VlblH5c);
            txtH5c = (EditText) findViewById(R.id.txtH5c);
            secH5d = (LinearLayout) findViewById(R.id.secH5d);
            lineH5d = (View) findViewById(R.id.lineH5d);
            VlblH5d = (TextView) findViewById(R.id.VlblH5d);
            spnH5d = (Spinner) findViewById(R.id.spnH5d);
            List<String> listH5d = new ArrayList<String>();

            listH5d.add("");
            listH5d.add("1-পতিত জমি");
            listH5d.add("2-নিজপরিচালিত");
            listH5d.add("3-ভাড়া বা ইজারা নেয়া (নগদ)");
            listH5d.add("4-ভাড়া বা ইজারা নেয়া (ফসল ভাগাভাগি)");
            listH5d.add("5-বন্ধকনেয়া");
            listH5d.add("6-ভাড়া বা ইজারা দেয়া (নগদ)");
            listH5d.add("7-ভাড়া বা ইজারা দেয়া (ফসল ভাগাভাগি)");
            listH5d.add("8-বন্ধক দেয়া");
            ArrayAdapter<String> adptrH5d = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH5d);
            spnH5d.setAdapter(adptrH5d);

            secH5e = (LinearLayout) findViewById(R.id.secH5e);
            lineH5e = (View) findViewById(R.id.lineH5e);
            VlblH5e = (TextView) findViewById(R.id.VlblH5e);
            spnH5e = (Spinner) findViewById(R.id.spnH5e);
            List<String> listH5e = new ArrayList<String>();

            listH5e.add("");
            listH5e.add("1-পতিত জমি");
            listH5e.add("2-নিজপরিচালিত");
            listH5e.add("3-ভাড়া/ইজারা নেয়া/নগদ");
            listH5e.add("4-ভাড়া/ইজারা নেয়া/ফসল ভাগাভাগি");
            listH5e.add("5-বন্ধকনেয়া");
            listH5e.add("6-ভাড়া/ইজারা দেয়া/নগদ");
            listH5e.add("7-ভাড়া/ইজারা দেয়া/ফসল ভাগাভাগি");
            listH5e.add("8-বন্ধক দেয়া");
            ArrayAdapter<String> adptrH5e = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH5e);
            spnH5e.setAdapter(adptrH5e);

            spnH5e.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH5e.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH5e.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("3")) {
                        secH5f.setVisibility(View.GONE);
                        lineH5f.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("6")) {
                        secH5f.setVisibility(View.GONE);
                        lineH5f.setVisibility(View.GONE);
                    } else {
                        secH5f.setVisibility(View.VISIBLE);
                        lineH5f.setVisibility(View.VISIBLE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH5f = (LinearLayout) findViewById(R.id.secH5f);
            lineH5f = (View) findViewById(R.id.lineH5f);
            VlblH5f = (TextView) findViewById(R.id.VlblH5f);
            txtH5f = (EditText) findViewById(R.id.txtH5f);
            secH5g = (LinearLayout) findViewById(R.id.secH5g);
            lineH5g = (View) findViewById(R.id.lineH5g);
            VlblH5g = (TextView) findViewById(R.id.VlblH5g);
            txtH5g = (EditText) findViewById(R.id.txtH5g);
            secH5hY = (LinearLayout) findViewById(R.id.secH5hY);
            lineH5hY = (View) findViewById(R.id.lineH5hY);
            VlblH5hY = (TextView) findViewById(R.id.VlblH5hY);
            txtH5hY = (EditText) findViewById(R.id.txtH5hY);
            secH5hM = (LinearLayout) findViewById(R.id.secH5hM);
            lineH5hM = (View) findViewById(R.id.lineH5hM);
            VlblH5hM = (TextView) findViewById(R.id.VlblH5hM);
            txtH5hM = (EditText) findViewById(R.id.txtH5hM);

            secH5aX.setVisibility(View.GONE);

            DataSearch(RND, SUCHANAID, SLNO);
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
            } else if (spnMSlNo.getSelectedItemPosition() == 0 & secMSlNo.isShown()) {
                Connection.MessageBox(Land.this, "Required field: তথ্যদানে সহায়তাকারীর লাইন নম্বর #.");
                spnMSlNo.requestFocus();
                return;
            } else if (txtSlNo.getText().toString().length() == 0 & secSlNo.isShown()) {
                Connection.MessageBox(Land.this, "Required field: Serial No.");
                txtSlNo.requestFocus();
                return;
            } else if (Integer.valueOf(txtSlNo.getText().toString().length() == 0 ? "01" : txtSlNo.getText().toString()) < 01 || Integer.valueOf(txtSlNo.getText().toString().length() == 0 ? "10" : txtSlNo.getText().toString()) > 10) {
                Connection.MessageBox(Land.this, "Value should be between 01 and 10(Serial No).");
                txtSlNo.requestFocus();
                return;
            } else if (spnH5.getSelectedItemPosition() == 0 & secH5.isShown()) {
                Connection.MessageBox(Land.this, "Required field: জমির  বিবরণ.");
                spnH5.requestFocus();
                return;
            } else if (spnH5a.getSelectedItemPosition() == 0 & secH5a.isShown()) {
                Connection.MessageBox(Land.this, "Required field: এই সম্পদ দিয়ে কি উত্পাদন করা হয়.");
                spnH5a.requestFocus();
                return;
            } else if (txtH5aX.getText().toString().length() == 0 & secH5aX.isShown()) {
                Connection.MessageBox(Land.this, "Required field: অনান্য উল্লেখ করুন.");
                txtH5aX.requestFocus();
                return;
            } else if (txtH5b.getText().toString().length() == 0 & secH5b.isShown()) {
                Connection.MessageBox(Land.this, "Required field: মালিকানা.");
                txtH5b.requestFocus();
                return;
            } else if (Integer.valueOf(txtH5b.getText().toString().length() == 0 ? "01" : txtH5b.getText().toString()) < 01 || Integer.valueOf(txtH5b.getText().toString().length() == 0 ? "30" : txtH5b.getText().toString()) > 30) {
                Connection.MessageBox(Land.this, "Value should be between 01 and 30(মালিকানা).");
                txtH5b.requestFocus();
                return;
            } else if (txtH5c.getText().toString().length() == 0 & secH5c.isShown()) {
                Connection.MessageBox(Land.this, "Required field: আয়তন/জমির পরিমান (শতাংশ).");
                txtH5c.requestFocus();
                return;
            } else if (Integer.valueOf(txtH5c.getText().toString().length() == 0 ? "1" : txtH5c.getText().toString()) < 1 || Integer.valueOf(txtH5c.getText().toString().length() == 0 ? "100" : txtH5c.getText().toString()) > 100) {
                Connection.MessageBox(Land.this, "Value should be between 1 and 100(আয়তন/জমির পরিমান (শতাংশ)).");
                txtH5c.requestFocus();
                return;
            } else if (spnH5d.getSelectedItemPosition() == 0 & secH5d.isShown()) {
                Connection.MessageBox(Land.this, "Required field: জমির বর্তমান ব্যবহারিকঅবস্থা.");
                spnH5d.requestFocus();
                return;
            } else if (spnH5e.getSelectedItemPosition() == 0 & secH5e.isShown()) {
                Connection.MessageBox(Land.this, "Required field: গত ঋতুতে জমির ব্যবহারিক অবস্থা কি ছিল(ফসল ক্যালেন্ডার অনুযায়ী).");
                spnH5e.requestFocus();
                return;
            } else if (txtH5f.getText().toString().length() == 0 & secH5f.isShown()) {
                Connection.MessageBox(Land.this, "Required field: জমিটি যদি টাকার বিনিময় ভাড়া/ইজারা দেয়া হয়ে থাকে তাহলেগত ঋতুতেকত টাকা পেয়েছেন.");
                txtH5f.requestFocus();
                return;
            } else if (Integer.valueOf(txtH5f.getText().toString().length() == 0 ? "000000" : txtH5f.getText().toString()) < 000000 || Integer.valueOf(txtH5f.getText().toString().length() == 0 ? "999999" : txtH5f.getText().toString()) > 999999) {
                Connection.MessageBox(Land.this, "Value should be between 000000 and 999999(জমিটি যদি টাকার বিনিময় ভাড়া/ইজারা দেয়া হয়ে থাকে তাহলেগত ঋতুতেকত টাকা পেয়েছেন).");
                txtH5f.requestFocus();
                return;
            } else if (txtH5g.getText().toString().length() == 0 & secH5g.isShown()) {
                Connection.MessageBox(Land.this, "Required field: জমির বর্তমান বাজার মূল্য.");
                txtH5g.requestFocus();
                return;
            } else if (Integer.valueOf(txtH5g.getText().toString().length() == 0 ? "000000" : txtH5g.getText().toString()) < 000000 || Integer.valueOf(txtH5g.getText().toString().length() == 0 ? "999999" : txtH5g.getText().toString()) > 999999) {
                Connection.MessageBox(Land.this, "Value should be between 000000 and 999999(জমির বর্তমান বাজার মূল্য).");
                txtH5g.requestFocus();
                return;
            } else if (txtH5hY.getText().toString().length() == 0 & secH5hY.isShown()) {
                Connection.MessageBox(Land.this, "Required field: আপনি জমিটির মালিকানা  কত বছর থেকে ভোগ করছেন.");
                txtH5hY.requestFocus();
                return;
            } else if (Integer.valueOf(txtH5hY.getText().toString().length() == 0 ? "00" : txtH5hY.getText().toString()) < 00 || Integer.valueOf(txtH5hY.getText().toString().length() == 0 ? "99" : txtH5hY.getText().toString()) > 99) {
                Connection.MessageBox(Land.this, "Value should be between 00 and 99(আপনি জমিটির মালিকানা  কত বছর থেকে ভোগ করছেন).");
                txtH5hY.requestFocus();
                return;
            } else if (txtH5hM.getText().toString().length() == 0 & secH5hM.isShown()) {
                Connection.MessageBox(Land.this, "Required field: আপনি জমিটির মালিকানা  কত মাস থেকে ভোগ করছেন.");
                txtH5hM.requestFocus();
                return;
            } else if (Integer.valueOf(txtH5hM.getText().toString().length() == 0 ? "00" : txtH5hM.getText().toString()) < 00 || Integer.valueOf(txtH5hM.getText().toString().length() == 0 ? "11" : txtH5hM.getText().toString()) > 11) {
                Connection.MessageBox(Land.this, "Value should be between 00 and 11(আপনি জমিটির মালিকানা  কত মাস থেকে ভোগ করছেন).");
                txtH5hM.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            Land_DataModel objSave = new Land_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setMSlNo((spnMSlNo.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnMSlNo.getSelectedItem().toString(), "-")));
            objSave.setSlNo(txtSlNo.getText().toString());
            objSave.setH5((spnH5.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH5.getSelectedItem().toString(), "-")));
            objSave.setH5a((spnH5a.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH5a.getSelectedItem().toString(), "-")));
            objSave.setH5aX(txtH5aX.getText().toString());
            objSave.setH5b(txtH5b.getText().toString());
            objSave.setH5c(txtH5c.getText().toString());
            objSave.setH5d((spnH5d.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH5d.getSelectedItem().toString(), "-")));
            objSave.setH5e((spnH5e.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH5e.getSelectedItem().toString(), "-")));
            objSave.setH5f(txtH5f.getText().toString());
            objSave.setH5g(txtH5g.getText().toString());
            objSave.setH5hY(txtH5hY.getText().toString());
            objSave.setH5hM(txtH5hM.getText().toString());
            objSave.setStartTime(StartTime);
            objSave.setEndTime(g.CurrentTime24());
            objSave.setUserId(g.getUserId());
            objSave.setEntryUser(g.getUserId()); //from data entry user list
            //objSave.setLat(Double.toString(currentLatitude));
            //objSave.setLon(Double.toString(currentLongitude));
            objSave.setEnDt(Global.DateTimeNowYMDHMS());

            String status = objSave.SaveUpdateData(this);
            if (status.length() == 0) {

                EntryStatus_DataModel e = new EntryStatus_DataModel(TableName, RND, SUCHANAID);
                e.SaveUpdateData(this);

                Bundle IDBundle = new Bundle();
                IDBundle.putString("Rnd", txtRnd.getText().toString());
                IDBundle.putString("SuchanaID", txtSuchanaID.getText().toString());
                IDBundle.putString("SlNo", txtSlNo.getText().toString());
                startActivity(new Intent(Land.this, Land_list.class).putExtras(IDBundle));
                //Connection.MessageBox(Land.this, "Saved Successfully");
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
                spnMSlNo.setSelection(Global.SpinnerItemPositionAnyLength(spnMSlNo, item.getMSlNo()));
                txtSlNo.setText(item.getSlNo());
                spnH5.setSelection(Global.SpinnerItemPositionAnyLength(spnH5, item.getH5()));
                spnH5a.setSelection(Global.SpinnerItemPositionAnyLength(spnH5a, item.getH5a()));
                txtH5aX.setText(item.getH5aX());
                txtH5b.setText(item.getH5b());
                txtH5c.setText(item.getH5c());
                spnH5d.setSelection(Global.SpinnerItemPositionAnyLength(spnH5d, item.getH5d()));
                spnH5e.setSelection(Global.SpinnerItemPositionAnyLength(spnH5e, item.getH5e()));
                txtH5f.setText(item.getH5f());
                txtH5g.setText(item.getH5g());
                txtH5hY.setText(item.getH5hY());
                txtH5hM.setText(item.getH5hM());
            }
        } catch (Exception e) {
            Connection.MessageBox(Land.this, e.getMessage());
            return;
        }
    }


    // turning off the GPS if its in on state. to avoid the battery drain.
    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();

    }
}