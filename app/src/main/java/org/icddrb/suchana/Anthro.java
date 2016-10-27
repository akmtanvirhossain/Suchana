package org.icddrb.suchana;

/**
 * Created by TanvirHossain on 05/10/2016.
 */


//Android Manifest Code
//<activity android:name=".Anthro" android:label="Anthro" />

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
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import Common.Connection;
import Common.Global;

public class Anthro extends Activity {
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
    LinearLayout seclblC2;
    LinearLayout seclblWeight1;
    LinearLayout secC2MCWeight1;
    View lineC2MCWeight1;
    TextView VlblC2MCWeight1;
    EditText txtC2MCWeight1;
    LinearLayout secC2MWeight1;
    View lineC2MWeight1;
    TextView VlblC2MWeight1;
    EditText txtC2MWeight1;
    LinearLayout secC2CWeight1;
    View lineC2CWeight1;
    TextView VlblC2CWeight1;
    EditText txtC2CWeight1;
    LinearLayout seclblWeight2;
    LinearLayout secC2MCWeight2;
    View lineC2MCWeight2;
    TextView VlblC2MCWeight2;
    EditText txtC2MCWeight2;
    LinearLayout secC2MWeight2;
    View lineC2MWeight2;
    TextView VlblC2MWeight2;
    EditText txtC2MWeight2;
    LinearLayout secC2CWeight2;
    View lineC2CWeight2;
    TextView VlblC2CWeight2;
    EditText txtC2CWeight2;
    LinearLayout seclblWeight3;
    LinearLayout secC2MCWeight3;
    View lineC2MCWeight3;
    TextView VlblC2MCWeight3;
    EditText txtC2MCWeight3;
    LinearLayout secC2MWeight3;
    View lineC2MWeight3;
    TextView VlblC2MWeight3;
    EditText txtC2MWeight3;
    LinearLayout secC2CWeight3;
    View lineC2CWeight3;
    TextView VlblC2CWeight3;
    EditText txtC2CWeight3;
    LinearLayout seclblHeight;
    LinearLayout seclblC2a;
    LinearLayout secC2CHeight1;
    View lineC2CHeight1;
    TextView VlblC2CHeight1;
    EditText txtC2CHeight1;
    LinearLayout secC2CHeight2;
    View lineC2CHeight2;
    TextView VlblC2CHeight2;
    EditText txtC2CHeight2;
    LinearLayout secC2CHeight3;
    View lineC2CHeight3;
    TextView VlblC2CHeight3;
    EditText txtC2CHeight3;
    LinearLayout seclblC2b;
    LinearLayout secC2MHeight1;
    View lineC2MHeight1;
    TextView VlblC2MHeight1;
    EditText txtC2MHeight1;
    LinearLayout secC2MHeight2;
    View lineC2MHeight2;
    TextView VlblC2MHeight2;
    EditText txtC2MHeight2;
    LinearLayout secC2MHeight3;
    View lineC2MHeight3;
    TextView VlblC2MHeight3;
    EditText txtC2MHeight3;
    LinearLayout seclblMuac;
    LinearLayout seclblC2c;
    LinearLayout secC2CMUAC1;
    View lineC2CMUAC1;
    TextView VlblC2CMUAC1;
    EditText txtC2CMUAC1;
    LinearLayout secC2CMUAC2;
    View lineC2CMUAC2;
    TextView VlblC2CMUAC2;
    EditText txtC2CMUAC2;
    LinearLayout secC2CMUAC3;
    View lineC2CMUAC3;
    TextView VlblC2CMUAC3;
    EditText txtC2CMUAC3;
    LinearLayout seclblC2d;
    LinearLayout secC2MMUAC1;
    View lineC2MMUAC1;
    TextView VlblC2MMUAC1;
    EditText txtC2MMUAC1;
    LinearLayout secC2MMUAC2;
    View lineC2MMUAC2;
    TextView VlblC2MMUAC2;
    EditText txtC2MMUAC2;
    LinearLayout secC2MMUAC3;
    View lineC2MMUAC3;
    TextView VlblC2MMUAC3;
    EditText txtC2MMUAC3;
    LinearLayout secC2Haemoglobin;
    View lineC2Haemoglobin;
    TextView VlblC2Haemoglobin;
    EditText txtC2Haemoglobin;
    String StartTime;
    Bundle IDbundle;
    ImageButton cmdForward;
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


            /*dtpDate.setText(new StringBuilder()
                    .append(Global.Right("00"+mDay,2)).append("/")
                    .append(Global.Right("00"+mMonth,2)).append("/")
                    .append(mYear));*/
        }
    };
    private TimePickerDialog.OnTimeSetListener timePickerListener = new TimePickerDialog.OnTimeSetListener() {
        public void onTimeSet(TimePicker view, int selectedHour, int selectedMinute) {
            hour = selectedHour;
            minute = selectedMinute;
            EditText tpTime;


            //tpTime.setText(new StringBuilder().append(Global.Right("00"+hour,2)).append(":").append(Global.Right("00"+minute,2)));

        }
    };

    //Disabled Back/Home key
    //--------------------------------------------------------------------------------------------------
    @Override
    public boolean onKeyDown(int iKeyCode, KeyEvent event) {
        return !(iKeyCode == KeyEvent.KEYCODE_BACK || iKeyCode == KeyEvent.KEYCODE_HOME);
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.anthro);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TableName = "Anthro";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Anthro.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), FdHabit.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDbundle);
                            getApplicationContext().startActivity(intent);
                            finish();
                        }
                    });
                    adb.show();
                }
            });


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
            cmdForward = (ImageButton) findViewById(R.id.cmdForward);
            cmdForward.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Anthro.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to start Father Form [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDBundle = new Bundle();
                            IDBundle.putString("Rnd", RND);
                            IDBundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Father.class);
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
            lineRnd = findViewById(R.id.lineRnd);
            VlblRnd = (TextView) findViewById(R.id.VlblRnd);
            txtRnd = (EditText) findViewById(R.id.txtRnd);
            txtRnd.setText(RND);
            txtRnd.setEnabled(false);

            secSuchanaID = (LinearLayout) findViewById(R.id.secSuchanaID);
            lineSuchanaID = findViewById(R.id.lineSuchanaID);
            VlblSuchanaID = (TextView) findViewById(R.id.VlblSuchanaID);
            txtSuchanaID = (EditText) findViewById(R.id.txtSuchanaID);
            txtSuchanaID.setText(SUCHANAID);
            txtSuchanaID.setEnabled(false);

            seclblC2 = (LinearLayout) findViewById(R.id.seclblC2);
            seclblWeight1 = (LinearLayout) findViewById(R.id.seclblWeight1);
            secC2MCWeight1 = (LinearLayout) findViewById(R.id.secC2MCWeight1);
            lineC2MCWeight1 = findViewById(R.id.lineC2MCWeight1);
            VlblC2MCWeight1 = (TextView) findViewById(R.id.VlblC2MCWeight1);
            txtC2MCWeight1 = (EditText) findViewById(R.id.txtC2MCWeight1);
            txtC2MCWeight1.addTextChangedListener(new TextWatcher() {
                public void afterTextChanged(Editable s) {
                }

                public void beforeTextChanged(CharSequence s, int start,
                                              int count, int after) {
                }

                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    txtC2CWeight1.setText(
                            String.valueOf(Double.parseDouble(txtC2MCWeight1.getText().toString().length() == 0 ? "0" : txtC2MCWeight1.getText().toString()) -
                                    Double.parseDouble(txtC2MWeight1.getText().toString().length() == 0 ? "0" : txtC2MWeight1.getText().toString())));
                }
            });

            secC2MWeight1 = (LinearLayout) findViewById(R.id.secC2MWeight1);
            lineC2MWeight1 = findViewById(R.id.lineC2MWeight1);
            VlblC2MWeight1 = (TextView) findViewById(R.id.VlblC2MWeight1);
            txtC2MWeight1 = (EditText) findViewById(R.id.txtC2MWeight1);
            txtC2MWeight1.addTextChangedListener(new TextWatcher() {
                public void afterTextChanged(Editable s) {
                }

                public void beforeTextChanged(CharSequence s, int start,
                                              int count, int after) {
                }

                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    txtC2CWeight1.setText(
                            String.valueOf(Double.parseDouble(txtC2MCWeight1.getText().toString().length() == 0 ? "0" : txtC2MCWeight1.getText().toString()) -
                                    Double.parseDouble(txtC2MWeight1.getText().toString().length() == 0 ? "0" : txtC2MWeight1.getText().toString())));
                }
            });

            secC2CWeight1 = (LinearLayout) findViewById(R.id.secC2CWeight1);
            lineC2CWeight1 = findViewById(R.id.lineC2CWeight1);
            VlblC2CWeight1 = (TextView) findViewById(R.id.VlblC2CWeight1);
            txtC2CWeight1 = (EditText) findViewById(R.id.txtC2CWeight1);

            seclblWeight2 = (LinearLayout) findViewById(R.id.seclblWeight2);
            secC2MCWeight2 = (LinearLayout) findViewById(R.id.secC2MCWeight2);
            lineC2MCWeight2 = findViewById(R.id.lineC2MCWeight2);
            VlblC2MCWeight2 = (TextView) findViewById(R.id.VlblC2MCWeight2);
            txtC2MCWeight2 = (EditText) findViewById(R.id.txtC2MCWeight2);
            txtC2MCWeight2.addTextChangedListener(new TextWatcher() {
                public void afterTextChanged(Editable s) {
                }

                public void beforeTextChanged(CharSequence s, int start,
                                              int count, int after) {
                }

                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    txtC2CWeight2.setText(
                            String.valueOf(Double.parseDouble(txtC2MCWeight2.getText().toString().length() == 0 ? "0" : txtC2MCWeight2.getText().toString()) -
                                    Double.parseDouble(txtC2MWeight2.getText().toString().length() == 0 ? "0" : txtC2MWeight2.getText().toString())));
                }
            });

            secC2MWeight2 = (LinearLayout) findViewById(R.id.secC2MWeight2);
            lineC2MWeight2 = findViewById(R.id.lineC2MWeight2);
            VlblC2MWeight2 = (TextView) findViewById(R.id.VlblC2MWeight2);
            txtC2MWeight2 = (EditText) findViewById(R.id.txtC2MWeight2);
            txtC2MWeight2.addTextChangedListener(new TextWatcher() {
                public void afterTextChanged(Editable s) {
                }

                public void beforeTextChanged(CharSequence s, int start,
                                              int count, int after) {
                }

                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    txtC2CWeight2.setText(
                            String.valueOf(Double.parseDouble(txtC2MCWeight2.getText().toString().length() == 0 ? "0" : txtC2MCWeight2.getText().toString()) -
                                    Double.parseDouble(txtC2MWeight2.getText().toString().length() == 0 ? "0" : txtC2MWeight2.getText().toString())));
                }
            });


            secC2CWeight2 = (LinearLayout) findViewById(R.id.secC2CWeight2);
            lineC2CWeight2 = findViewById(R.id.lineC2CWeight2);
            VlblC2CWeight2 = (TextView) findViewById(R.id.VlblC2CWeight2);
            txtC2CWeight2 = (EditText) findViewById(R.id.txtC2CWeight2);
            seclblWeight3 = (LinearLayout) findViewById(R.id.seclblWeight3);
            secC2MCWeight3 = (LinearLayout) findViewById(R.id.secC2MCWeight3);
            lineC2MCWeight3 = findViewById(R.id.lineC2MCWeight3);
            VlblC2MCWeight3 = (TextView) findViewById(R.id.VlblC2MCWeight3);
            txtC2MCWeight3 = (EditText) findViewById(R.id.txtC2MCWeight3);
            txtC2MCWeight3.addTextChangedListener(new TextWatcher() {
                public void afterTextChanged(Editable s) {
                }

                public void beforeTextChanged(CharSequence s, int start,
                                              int count, int after) {
                }

                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    txtC2CWeight3.setText(
                            String.valueOf(Double.parseDouble(txtC2MCWeight3.getText().toString().length() == 0 ? "0" : txtC2MCWeight3.getText().toString()) -
                                    Double.parseDouble(txtC2MWeight3.getText().toString().length() == 0 ? "0" : txtC2MWeight3.getText().toString())));
                }
            });


            secC2MWeight3 = (LinearLayout) findViewById(R.id.secC2MWeight3);
            lineC2MWeight3 = findViewById(R.id.lineC2MWeight3);
            VlblC2MWeight3 = (TextView) findViewById(R.id.VlblC2MWeight3);
            txtC2MWeight3 = (EditText) findViewById(R.id.txtC2MWeight3);
            txtC2MWeight3.addTextChangedListener(new TextWatcher() {
                public void afterTextChanged(Editable s) {
                }

                public void beforeTextChanged(CharSequence s, int start,
                                              int count, int after) {
                }

                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    txtC2CWeight3.setText(
                            String.valueOf(Double.parseDouble(txtC2MCWeight3.getText().toString().length() == 0 ? "0" : txtC2MCWeight3.getText().toString()) -
                                    Double.parseDouble(txtC2MWeight3.getText().toString().length() == 0 ? "0" : txtC2MWeight3.getText().toString())));
                }
            });

            secC2CWeight3 = (LinearLayout) findViewById(R.id.secC2CWeight3);
            lineC2CWeight3 = findViewById(R.id.lineC2CWeight3);
            VlblC2CWeight3 = (TextView) findViewById(R.id.VlblC2CWeight3);
            txtC2CWeight3 = (EditText) findViewById(R.id.txtC2CWeight3);
            seclblHeight = (LinearLayout) findViewById(R.id.seclblHeight);
            seclblC2a = (LinearLayout) findViewById(R.id.seclblC2a);
            secC2CHeight1 = (LinearLayout) findViewById(R.id.secC2CHeight1);
            lineC2CHeight1 = findViewById(R.id.lineC2CHeight1);
            VlblC2CHeight1 = (TextView) findViewById(R.id.VlblC2CHeight1);
            txtC2CHeight1 = (EditText) findViewById(R.id.txtC2CHeight1);
            secC2CHeight2 = (LinearLayout) findViewById(R.id.secC2CHeight2);
            lineC2CHeight2 = findViewById(R.id.lineC2CHeight2);
            VlblC2CHeight2 = (TextView) findViewById(R.id.VlblC2CHeight2);
            txtC2CHeight2 = (EditText) findViewById(R.id.txtC2CHeight2);
            secC2CHeight3 = (LinearLayout) findViewById(R.id.secC2CHeight3);
            lineC2CHeight3 = findViewById(R.id.lineC2CHeight3);
            VlblC2CHeight3 = (TextView) findViewById(R.id.VlblC2CHeight3);
            txtC2CHeight3 = (EditText) findViewById(R.id.txtC2CHeight3);
            seclblC2b = (LinearLayout) findViewById(R.id.seclblC2b);
            secC2MHeight1 = (LinearLayout) findViewById(R.id.secC2MHeight1);
            lineC2MHeight1 = findViewById(R.id.lineC2MHeight1);
            VlblC2MHeight1 = (TextView) findViewById(R.id.VlblC2MHeight1);
            txtC2MHeight1 = (EditText) findViewById(R.id.txtC2MHeight1);
            secC2MHeight2 = (LinearLayout) findViewById(R.id.secC2MHeight2);
            lineC2MHeight2 = findViewById(R.id.lineC2MHeight2);
            VlblC2MHeight2 = (TextView) findViewById(R.id.VlblC2MHeight2);
            txtC2MHeight2 = (EditText) findViewById(R.id.txtC2MHeight2);
            secC2MHeight3 = (LinearLayout) findViewById(R.id.secC2MHeight3);
            lineC2MHeight3 = findViewById(R.id.lineC2MHeight3);
            VlblC2MHeight3 = (TextView) findViewById(R.id.VlblC2MHeight3);
            txtC2MHeight3 = (EditText) findViewById(R.id.txtC2MHeight3);
            seclblMuac = (LinearLayout) findViewById(R.id.seclblMuac);
            seclblC2c = (LinearLayout) findViewById(R.id.seclblC2c);
            secC2CMUAC1 = (LinearLayout) findViewById(R.id.secC2CMUAC1);
            lineC2CMUAC1 = findViewById(R.id.lineC2CMUAC1);
            VlblC2CMUAC1 = (TextView) findViewById(R.id.VlblC2CMUAC1);
            txtC2CMUAC1 = (EditText) findViewById(R.id.txtC2CMUAC1);
            secC2CMUAC2 = (LinearLayout) findViewById(R.id.secC2CMUAC2);
            lineC2CMUAC2 = findViewById(R.id.lineC2CMUAC2);
            VlblC2CMUAC2 = (TextView) findViewById(R.id.VlblC2CMUAC2);
            txtC2CMUAC2 = (EditText) findViewById(R.id.txtC2CMUAC2);
            secC2CMUAC3 = (LinearLayout) findViewById(R.id.secC2CMUAC3);
            lineC2CMUAC3 = findViewById(R.id.lineC2CMUAC3);
            VlblC2CMUAC3 = (TextView) findViewById(R.id.VlblC2CMUAC3);
            txtC2CMUAC3 = (EditText) findViewById(R.id.txtC2CMUAC3);
            seclblC2d = (LinearLayout) findViewById(R.id.seclblC2d);
            secC2MMUAC1 = (LinearLayout) findViewById(R.id.secC2MMUAC1);
            lineC2MMUAC1 = findViewById(R.id.lineC2MMUAC1);
            VlblC2MMUAC1 = (TextView) findViewById(R.id.VlblC2MMUAC1);
            txtC2MMUAC1 = (EditText) findViewById(R.id.txtC2MMUAC1);
            secC2MMUAC2 = (LinearLayout) findViewById(R.id.secC2MMUAC2);
            lineC2MMUAC2 = findViewById(R.id.lineC2MMUAC2);
            VlblC2MMUAC2 = (TextView) findViewById(R.id.VlblC2MMUAC2);
            txtC2MMUAC2 = (EditText) findViewById(R.id.txtC2MMUAC2);
            secC2MMUAC3 = (LinearLayout) findViewById(R.id.secC2MMUAC3);
            lineC2MMUAC3 = findViewById(R.id.lineC2MMUAC3);
            VlblC2MMUAC3 = (TextView) findViewById(R.id.VlblC2MMUAC3);
            txtC2MMUAC3 = (EditText) findViewById(R.id.txtC2MMUAC3);
            secC2Haemoglobin = (LinearLayout) findViewById(R.id.secC2Haemoglobin);
            lineC2Haemoglobin = findViewById(R.id.lineC2Haemoglobin);
            VlblC2Haemoglobin = (TextView) findViewById(R.id.VlblC2Haemoglobin);
            txtC2Haemoglobin = (EditText) findViewById(R.id.txtC2Haemoglobin);


            if (C.Existence("select * from HHIdentity where Rnd='" + RND + "' and SuchanaId='" + SUCHANAID + "' and AgeGroup='3'")) {
                secC2Haemoglobin.setVisibility(View.VISIBLE);
                lineC2Haemoglobin.setVisibility(View.VISIBLE);
            } else {
                txtC2Haemoglobin.setText("");
                secC2Haemoglobin.setVisibility(View.GONE);
                lineC2Haemoglobin.setVisibility(View.GONE);
            }

            //Hide all skip variables
            DataSearch(RND, SUCHANAID);

            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(Anthro.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtC2MCWeight1.getText().toString().length() == 0 & secC2MCWeight1.isShown()) {
                Connection.MessageBox(Anthro.this, "Required field(ওজন): শিশু + মা.");
                txtC2MCWeight1.requestFocus();
                return;
            } else if (Double.valueOf(txtC2MCWeight1.getText().toString().length() == 0 ? "1" : txtC2MCWeight1.getText().toString()) < 1 || Double.valueOf(txtC2MCWeight1.getText().toString().length() == 0 ? "99999" : txtC2MCWeight1.getText().toString()) > 99999) {
                Connection.MessageBox(Anthro.this, "Value should be between 1 and 99999 ওজন-(শিশু + মা).");
                txtC2MCWeight1.requestFocus();
                return;
            } else if (txtC2MWeight1.getText().toString().length() == 0 & secC2MWeight1.isShown()) {
                Connection.MessageBox(Anthro.this, "Required field(ওজন): মা একা.");
                txtC2MWeight1.requestFocus();
                return;
            } else if (Double.valueOf(txtC2MWeight1.getText().toString().length() == 0 ? "1" : txtC2MWeight1.getText().toString()) < 1 || Double.valueOf(txtC2MWeight1.getText().toString().length() == 0 ? "99999" : txtC2MWeight1.getText().toString()) > 99999) {
                Connection.MessageBox(Anthro.this, "Value should be between 1 and 99999(মা একা).");
                txtC2MWeight1.requestFocus();
                return;
            } else if (txtC2CWeight1.getText().toString().length() == 0 & secC2CWeight1.isShown()) {
                Connection.MessageBox(Anthro.this, "Required field: শিশুর ওজন.");
                txtC2CWeight1.requestFocus();
                return;
            } else if (Double.valueOf(txtC2CWeight1.getText().toString().length() == 0 ? "1" : txtC2CWeight1.getText().toString()) < 1 || Double.valueOf(txtC2CWeight1.getText().toString().length() == 0 ? "99999" : txtC2CWeight1.getText().toString()) > 99999) {
                Connection.MessageBox(Anthro.this, "Value should be between 1 and 99999(শিশুর ওজন).");
                txtC2CWeight1.requestFocus();
                return;
            } else if (txtC2MCWeight2.getText().toString().length() == 0 & secC2MCWeight2.isShown()) {
                Connection.MessageBox(Anthro.this, "Required field(ওজন): শিশু + মা.");
                txtC2MCWeight2.requestFocus();
                return;
            } else if (Double.valueOf(txtC2MCWeight2.getText().toString().length() == 0 ? "1" : txtC2MCWeight2.getText().toString()) < 1 || Double.valueOf(txtC2MCWeight2.getText().toString().length() == 0 ? "99999" : txtC2MCWeight2.getText().toString()) > 99999) {
                Connection.MessageBox(Anthro.this, "Value should be between 1 and 99999(শিশু + মা).");
                txtC2MCWeight2.requestFocus();
                return;
            } else if (txtC2MWeight2.getText().toString().length() == 0 & secC2MWeight2.isShown()) {
                Connection.MessageBox(Anthro.this, "Required field(ওজন): মা একা.");
                txtC2MWeight2.requestFocus();
                return;
            } else if (Double.valueOf(txtC2MWeight2.getText().toString().length() == 0 ? "1" : txtC2MWeight2.getText().toString()) < 1 || Double.valueOf(txtC2MWeight2.getText().toString().length() == 0 ? "99999" : txtC2MWeight2.getText().toString()) > 99999) {
                Connection.MessageBox(Anthro.this, "Value should be between 1 and 99999(মা একা).");
                txtC2MWeight2.requestFocus();
                return;
            } else if (txtC2CWeight2.getText().toString().length() == 0 & secC2CWeight2.isShown()) {
                Connection.MessageBox(Anthro.this, "Required field(ওজন): শিশুর ওজন.");
                txtC2CWeight2.requestFocus();
                return;
            } else if (Double.valueOf(txtC2CWeight2.getText().toString().length() == 0 ? "1" : txtC2CWeight2.getText().toString()) < 1 || Double.valueOf(txtC2CWeight2.getText().toString().length() == 0 ? "99999" : txtC2CWeight2.getText().toString()) > 99999) {
                Connection.MessageBox(Anthro.this, "Value should be between 1 and 99999(শিশুর ওজন).");
                txtC2CWeight2.requestFocus();
                return;
            }

            //--------------------------------------------------------------------------------------
            Double weightDiff =
                    Double.parseDouble(txtC2CWeight1.getText().toString().length() == 0 ? "0" : txtC2CWeight1.getText().toString()) -
                            Double.parseDouble(txtC2CWeight2.getText().toString().length() == 0 ? "0" : txtC2CWeight2.getText().toString());

            if (weightDiff >= 0.5 | weightDiff <= -0.5) {
                if (Double.parseDouble(txtC2MCWeight3.getText().toString().length() == 0 ? "0" : txtC2MCWeight3.getText().toString()) < 1 & secC2MCWeight3.isShown()) {
                    Connection.MessageBox(Anthro.this, "Required field(ওজন): শিশু + মা.");
                    txtC2MCWeight3.requestFocus();
                    return;
                } else if (Double.valueOf(txtC2MCWeight3.getText().toString().length() == 0 ? "1" : txtC2MCWeight3.getText().toString()) < 1 || Double.valueOf(txtC2MCWeight3.getText().toString().length() == 0 ? "99999" : txtC2MCWeight3.getText().toString()) > 99999) {
                    Connection.MessageBox(Anthro.this, "Value should be between 1 and 99999(শিশু + মা).");
                    txtC2MCWeight3.requestFocus();
                    return;
                } else if (txtC2MWeight3.getText().toString().length() == 0 & secC2MWeight3.isShown()) {
                    Connection.MessageBox(Anthro.this, "Required field(ওজন): মা একা.");
                    txtC2MWeight3.requestFocus();
                    return;
                } else if (Double.valueOf(txtC2MWeight3.getText().toString().length() == 0 ? "1" : txtC2MWeight3.getText().toString()) < 1 || Double.valueOf(txtC2MWeight3.getText().toString().length() == 0 ? "99999" : txtC2MWeight3.getText().toString()) > 99999) {
                    Connection.MessageBox(Anthro.this, "Value should be between 1 and 99999(মা একা).");
                    txtC2MWeight3.requestFocus();
                    return;
                } else if (txtC2CWeight3.getText().toString().length() == 0 & secC2CWeight3.isShown()) {
                    Connection.MessageBox(Anthro.this, "Required field(ওজন): শিশুর ওজন.");
                    txtC2CWeight3.requestFocus();
                    return;
                } else if (Double.valueOf(txtC2CWeight3.getText().toString().length() == 0 ? "1" : txtC2CWeight3.getText().toString()) < 1 || Double.valueOf(txtC2CWeight3.getText().toString().length() == 0 ? "99999" : txtC2CWeight3.getText().toString()) > 99999) {
                    Connection.MessageBox(Anthro.this, "Value should be between 1 and 99999(শিশুর ওজন).");
                    txtC2CWeight3.requestFocus();
                    return;
                }
            }
            //--------------------------------------------------------------------------------------


            if (txtC2CHeight1.getText().toString().length() == 0 & secC2CHeight1.isShown()) {
                Connection.MessageBox(Anthro.this, "Required field (শিশু): ১ম উচ্চতা (সেমি).");
                txtC2CHeight1.requestFocus();
                return;
            } else if (Double.valueOf(txtC2CHeight1.getText().toString().length() == 0 ? "1" : txtC2CHeight1.getText().toString()) < 1 || Double.valueOf(txtC2CHeight1.getText().toString().length() == 0 ? "99999" : txtC2CHeight1.getText().toString()) > 99999) {
                Connection.MessageBox(Anthro.this, "Value should be between 1 and 99999((শিশু)১ম উচ্চতা (সেমি)).");
                txtC2CHeight1.requestFocus();
                return;
            } else if (txtC2CHeight2.getText().toString().length() == 0 & secC2CHeight2.isShown()) {
                Connection.MessageBox(Anthro.this, "Required field (শিশু): ২য় উচ্চতা (সেমি).");
                txtC2CHeight2.requestFocus();
                return;
            } else if (Double.valueOf(txtC2CHeight2.getText().toString().length() == 0 ? "1" : txtC2CHeight2.getText().toString()) < 1 || Double.valueOf(txtC2CHeight2.getText().toString().length() == 0 ? "99999" : txtC2CHeight2.getText().toString()) > 99999) {
                Connection.MessageBox(Anthro.this, "Value should be between 1 and 99999((শিশু)২য় উচ্চতা (সেমি)).");
                txtC2CHeight2.requestFocus();
                return;
            }

            //--------------------------------------------------------------------------------------
            Double heightDiff_C =
                    Double.parseDouble(txtC2CHeight1.getText().toString().length() == 0 ? "0" : txtC2CHeight1.getText().toString()) -
                            Double.parseDouble(txtC2CHeight2.getText().toString().length() == 0 ? "0" : txtC2CHeight2.getText().toString());

            if (heightDiff_C >= 0.5 | heightDiff_C <= -0.5) {
                if (txtC2CHeight3.getText().toString().length() == 0 & secC2CHeight3.isShown()) {
                    Connection.MessageBox(Anthro.this, "Required field (শিশু): ৩য় উচ্চতা (সেমি).");
                    txtC2CHeight3.requestFocus();
                    return;
                } else if (Double.valueOf(txtC2CHeight3.getText().toString().length() == 0 ? "1" : txtC2CHeight3.getText().toString()) < 1 || Double.valueOf(txtC2CHeight3.getText().toString().length() == 0 ? "99999" : txtC2CHeight3.getText().toString()) > 99999) {
                    Connection.MessageBox(Anthro.this, "Value should be between 1 and 99999((শিশু)৩য় উচ্চতা (সেমি)).");
                    txtC2CHeight3.requestFocus();
                    return;
                }
            }

            if (txtC2MHeight1.getText().toString().length() == 0 & secC2MHeight1.isShown()) {
                Connection.MessageBox(Anthro.this, "Required field (মা): ১ম উচ্চতা (সেমি).");
                txtC2MHeight1.requestFocus();
                return;
            } else if (Double.valueOf(txtC2MHeight1.getText().toString().length() == 0 ? "1" : txtC2MHeight1.getText().toString()) < 1 || Double.valueOf(txtC2MHeight1.getText().toString().length() == 0 ? "99999" : txtC2MHeight1.getText().toString()) > 99999) {
                Connection.MessageBox(Anthro.this, "Value should be between 1 and 99999((মা)১ম উচ্চতা (সেমি)).");
                txtC2MHeight1.requestFocus();
                return;
            } else if (txtC2MHeight2.getText().toString().length() == 0 & secC2MHeight2.isShown()) {
                Connection.MessageBox(Anthro.this, "Required field  (মা): ২য় উচ্চতা (সেমি).");
                txtC2MHeight2.requestFocus();
                return;
            } else if (Double.valueOf(txtC2MHeight2.getText().toString().length() == 0 ? "1" : txtC2MHeight2.getText().toString()) < 1 || Double.valueOf(txtC2MHeight2.getText().toString().length() == 0 ? "99999" : txtC2MHeight2.getText().toString()) > 99999) {
                Connection.MessageBox(Anthro.this, "Value should be between 1 and 99999((মা) ২য় উচ্চতা (সেমি)).");
                txtC2MHeight2.requestFocus();
                return;
            }

            //--------------------------------------------------------------------------------------
            Double heightDiff_M =
                    Double.parseDouble(txtC2MHeight1.getText().toString().length() == 0 ? "0" : txtC2MHeight1.getText().toString()) -
                            Double.parseDouble(txtC2MHeight2.getText().toString().length() == 0 ? "0" : txtC2MHeight2.getText().toString());

            if (heightDiff_M >= 0.5 | heightDiff_M <= -0.5) {

                if (txtC2MHeight3.getText().toString().length() == 0 & secC2MHeight3.isShown()) {
                    Connection.MessageBox(Anthro.this, "Required field (মা): ৩য়  উচ্চতা (সেমি).");
                    txtC2MHeight3.requestFocus();
                    return;
                } else if (Double.valueOf(txtC2MHeight3.getText().toString().length() == 0 ? "1" : txtC2MHeight3.getText().toString()) < 1 || Double.valueOf(txtC2MHeight3.getText().toString().length() == 0 ? "99999" : txtC2MHeight3.getText().toString()) > 99999) {
                    Connection.MessageBox(Anthro.this, "Value should be between 1 and 99999((মা) ৩য়  উচ্চতা (সেমি)).");
                    txtC2MHeight3.requestFocus();
                    return;
                }
            }


            if (txtC2CMUAC1.getText().toString().length() == 0 & secC2CMUAC1.isShown()) {
                Connection.MessageBox(Anthro.this, "Required field (শিশু): ১ম  MUAC (সেমি).");
                txtC2CMUAC1.requestFocus();
                return;
            } else if (Double.valueOf(txtC2CMUAC1.getText().toString().length() == 0 ? "1" : txtC2CMUAC1.getText().toString()) < 1 || Double.valueOf(txtC2CMUAC1.getText().toString().length() == 0 ? "99999" : txtC2CMUAC1.getText().toString()) > 99999) {
                Connection.MessageBox(Anthro.this, "Value should be between 1 and 99999((শিশু) ১ম  MUAC (সেমি)).");
                txtC2CMUAC1.requestFocus();
                return;
            } else if (txtC2CMUAC2.getText().toString().length() == 0 & secC2CMUAC2.isShown()) {
                Connection.MessageBox(Anthro.this, "Required field (শিশু): ২য় MUAC (সেমি).");
                txtC2CMUAC2.requestFocus();
                return;
            } else if (Double.valueOf(txtC2CMUAC2.getText().toString().length() == 0 ? "1" : txtC2CMUAC2.getText().toString()) < 1 || Double.valueOf(txtC2CMUAC2.getText().toString().length() == 0 ? "99999" : txtC2CMUAC2.getText().toString()) > 99999) {
                Connection.MessageBox(Anthro.this, "Value should be between 1 and 99999((শিশু) ২য় MUAC (সেমি)).");
                txtC2CMUAC2.requestFocus();
                return;
            }

            //--------------------------------------------------------------------------------------
            Double muacDiff_C =
                    Double.parseDouble(txtC2CMUAC1.getText().toString().length() == 0 ? "0" : txtC2CMUAC1.getText().toString()) -
                            Double.parseDouble(txtC2CMUAC2.getText().toString().length() == 0 ? "0" : txtC2CMUAC2.getText().toString());

            if (muacDiff_C >= 0.2 | muacDiff_C <= -0.2) {

                if (txtC2CMUAC3.getText().toString().length() == 0 & secC2CMUAC3.isShown()) {
                    Connection.MessageBox(Anthro.this, "Required field (শিশু): ৩য়  MUAC (সেমি).");
                    txtC2CMUAC3.requestFocus();
                    return;
                } else if (Double.valueOf(txtC2CMUAC3.getText().toString().length() == 0 ? "1" : txtC2CMUAC3.getText().toString()) < 1 || Double.valueOf(txtC2CMUAC3.getText().toString().length() == 0 ? "99999" : txtC2CMUAC3.getText().toString()) > 99999) {
                    Connection.MessageBox(Anthro.this, "Value should be between 1 and 99999((শিশু) ৩য়  MUAC (সেমি)).");
                    txtC2CMUAC3.requestFocus();
                    return;
                }
            }


            if (txtC2MMUAC1.getText().toString().length() == 0 & secC2MMUAC1.isShown()) {
                Connection.MessageBox(Anthro.this, "Required field (মা): ১ম  MUAC (সেমি).");
                txtC2MMUAC1.requestFocus();
                return;
            } else if (Double.valueOf(txtC2MMUAC1.getText().toString().length() == 0 ? "1" : txtC2MMUAC1.getText().toString()) < 1 || Double.valueOf(txtC2MMUAC1.getText().toString().length() == 0 ? "99999" : txtC2MMUAC1.getText().toString()) > 99999) {
                Connection.MessageBox(Anthro.this, "Value should be between 1 and 99999((মা) ১ম  MUAC (সেমি)).");
                txtC2MMUAC1.requestFocus();
                return;
            } else if (txtC2MMUAC2.getText().toString().length() == 0 & secC2MMUAC2.isShown()) {
                Connection.MessageBox(Anthro.this, "Required field (মা): ২য় MUAC (সেমি).");
                txtC2MMUAC2.requestFocus();
                return;
            } else if (Double.valueOf(txtC2MMUAC2.getText().toString().length() == 0 ? "1" : txtC2MMUAC2.getText().toString()) < 1 || Double.valueOf(txtC2MMUAC2.getText().toString().length() == 0 ? "99999" : txtC2MMUAC2.getText().toString()) > 99999) {
                Connection.MessageBox(Anthro.this, "Value should be between 1 and 99999((মা) ২য় MUAC (সেমি)).");
                txtC2MMUAC2.requestFocus();
                return;
            }

            //--------------------------------------------------------------------------------------
            Double muacDiff_M =
                    Double.parseDouble(txtC2MMUAC1.getText().toString().length() == 0 ? "0" : txtC2MMUAC1.getText().toString()) -
                            Double.parseDouble(txtC2MMUAC2.getText().toString().length() == 0 ? "0" : txtC2MMUAC2.getText().toString());

            if (muacDiff_M >= 0.2 | muacDiff_M <= -0.2) {

                if (txtC2MMUAC3.getText().toString().length() == 0 & secC2MMUAC3.isShown()) {
                    Connection.MessageBox(Anthro.this, "Required field (মা): ৩য়  MUAC (সেমি).");
                    txtC2MMUAC3.requestFocus();
                    return;
                } else if (Double.valueOf(txtC2MMUAC3.getText().toString().length() == 0 ? "1" : txtC2MMUAC3.getText().toString()) < 1 || Double.valueOf(txtC2MMUAC3.getText().toString().length() == 0 ? "99999" : txtC2MMUAC3.getText().toString()) > 99999) {
                    Connection.MessageBox(Anthro.this, "Value should be between 1 and 99999((মা) ৩য়  MUAC (সেমি)).");
                    txtC2MMUAC3.requestFocus();
                    return;
                }
            }


            if (txtC2Haemoglobin.getText().toString().length() == 0 & secC2Haemoglobin.isShown()) {
                Connection.MessageBox(Anthro.this, "Required field: ১২-২৩ মাসের শিশুর হিমোগ্লোবিন এর ঘনত্ব.");
                txtC2Haemoglobin.requestFocus();
                return;
            } else if (Double.valueOf(txtC2Haemoglobin.getText().toString().length() == 0 ? "1" : txtC2Haemoglobin.getText().toString()) < 1 || Double.valueOf(txtC2Haemoglobin.getText().toString().length() == 0 ? "9999" : txtC2Haemoglobin.getText().toString()) > 9999) {
                Connection.MessageBox(Anthro.this, "Value should be between 1 and 9999(১২-২৩ মাসের শিশুর হিমোগ্লোবিন এর ঘনত্ব).");
                txtC2Haemoglobin.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            Anthro_DataModel objSave = new Anthro_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setC2MCWeight1(txtC2MCWeight1.getText().toString());
            objSave.setC2MWeight1(txtC2MWeight1.getText().toString());
            objSave.setC2CWeight1(txtC2CWeight1.getText().toString());
            objSave.setC2MCWeight2(txtC2MCWeight2.getText().toString());
            objSave.setC2MWeight2(txtC2MWeight2.getText().toString());
            objSave.setC2CWeight2(txtC2CWeight2.getText().toString());
            objSave.setC2MCWeight3(txtC2MCWeight3.getText().toString());
            objSave.setC2MWeight3(txtC2MWeight3.getText().toString());
            objSave.setC2CWeight3(txtC2CWeight3.getText().toString());
            objSave.setC2CHeight1(txtC2CHeight1.getText().toString());
            objSave.setC2CHeight2(txtC2CHeight2.getText().toString());
            objSave.setC2CHeight3(txtC2CHeight3.getText().toString());
            objSave.setC2MHeight1(txtC2MHeight1.getText().toString());
            objSave.setC2MHeight2(txtC2MHeight2.getText().toString());
            objSave.setC2MHeight3(txtC2MHeight3.getText().toString());
            objSave.setC2CMUAC1(txtC2CMUAC1.getText().toString());
            objSave.setC2CMUAC2(txtC2CMUAC2.getText().toString());
            objSave.setC2CMUAC3(txtC2CMUAC3.getText().toString());
            objSave.setC2MMUAC1(txtC2MMUAC1.getText().toString());
            objSave.setC2MMUAC2(txtC2MMUAC2.getText().toString());
            objSave.setC2MMUAC3(txtC2MMUAC3.getText().toString());
            objSave.setC2Haemoglobin(txtC2Haemoglobin.getText().toString());
            objSave.setEnDt(Global.DateTimeNowYMDHMS());
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
                Bundle IDBundle = new Bundle();
                finish();
                IDBundle.putString("Rnd", txtRnd.getText().toString());
                IDBundle.putString("SuchanaID", txtSuchanaID.getText().toString());
                startActivity(new Intent(Anthro.this, Father.class).putExtras(IDBundle));

            } else {
                Connection.MessageBox(Anthro.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(Anthro.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            Anthro_DataModel d = new Anthro_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<Anthro_DataModel> data = d.SelectAll(this, SQL);
            for (Anthro_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                txtC2MCWeight1.setText(item.getC2MCWeight1());
                txtC2MWeight1.setText(item.getC2MWeight1());
                txtC2CWeight1.setText(item.getC2CWeight1());
                txtC2MCWeight2.setText(item.getC2MCWeight2());
                txtC2MWeight2.setText(item.getC2MWeight2());
                txtC2CWeight2.setText(item.getC2CWeight2());
                txtC2MCWeight3.setText(item.getC2MCWeight3());
                txtC2MWeight3.setText(item.getC2MWeight3());
                txtC2CWeight3.setText(item.getC2CWeight3());
                txtC2CHeight1.setText(item.getC2CHeight1());
                txtC2CHeight2.setText(item.getC2CHeight2());
                txtC2CHeight3.setText(item.getC2CHeight3());
                txtC2MHeight1.setText(item.getC2MHeight1());
                txtC2MHeight2.setText(item.getC2MHeight2());
                txtC2MHeight3.setText(item.getC2MHeight3());
                txtC2CMUAC1.setText(item.getC2CMUAC1());
                txtC2CMUAC2.setText(item.getC2CMUAC2());
                txtC2CMUAC3.setText(item.getC2CMUAC3());
                txtC2MMUAC1.setText(item.getC2MMUAC1());
                txtC2MMUAC2.setText(item.getC2MMUAC2());
                txtC2MMUAC3.setText(item.getC2MMUAC3());
                txtC2Haemoglobin.setText(item.getC2Haemoglobin());
            }
        } catch (Exception e) {
            Connection.MessageBox(Anthro.this, e.getMessage());
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
