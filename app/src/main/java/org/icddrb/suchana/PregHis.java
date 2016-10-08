package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".PregHis" android:label="PregHis" />

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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
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

public class PregHis extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    static String M116 = "";
    static String M117 = "";
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
    LinearLayout seclblM14;
    LinearLayout secM11;
    View lineM11;
    TextView VlblM11;
    EditText txtM11;
    LinearLayout secM12;
    View lineM12;
    TextView VlblM12;
    EditText txtM12;
    LinearLayout secM13;
    View lineM13;
    TextView VlblM13;
    EditText txtM13;
    LinearLayout seclblM14a;
    LinearLayout secM14a;
    View lineM14a;
    TextView VlblM14a;
    EditText txtM14a;
    LinearLayout secM14b;
    View lineM14b;
    TextView VlblM14b;
    EditText txtM14b;
    LinearLayout secM14c;
    View lineM14c;
    TextView VlblM14c;
    EditText txtM14c;
    LinearLayout secM14d;
    View lineM14d;
    TextView VlblM14d;
    EditText txtM14d;
    LinearLayout secM14e;
    View lineM14e;
    TextView VlblM14e;
    EditText txtM14e;
    LinearLayout seclblM15;
    LinearLayout secM15a;
    View lineM15a;
    TextView VlblM15a;
    CheckBox chkM15a;
    LinearLayout secM15b;
    View lineM15b;
    TextView VlblM15b;
    EditText txtM15b;
    LinearLayout secM15c;
    View lineM15c;
    TextView VlblM15c;
    EditText txtM15c;
    LinearLayout secM15d;
    View lineM15d;
    TextView VlblM15d;
    EditText txtM15d;
    LinearLayout secM15e;
    View lineM15e;
    TextView VlblM15e;
    EditText txtM15e;
    LinearLayout secM15f;
    View lineM15f;
    TextView VlblM15f;
    EditText txtM15f;
    LinearLayout secM16;
    View lineM16;
    TextView VlblM16;
    RadioGroup rdogrpM16;
    RadioButton rdoM161;
    RadioButton rdoM162;
    RadioButton rdoM163;
    LinearLayout secM17;
    View lineM17;
    TextView VlblM17;
    EditText txtM17;
    LinearLayout seclblM18;
    LinearLayout secM18a;
    View lineM18a;
    TextView VlblM18a;
    EditText txtM18a;
    LinearLayout secM18b;
    View lineM18b;
    TextView VlblM18b;
    EditText txtM18b;
    LinearLayout secM18c;
    View lineM18c;
    TextView VlblM18c;
    EditText txtM18c;
    LinearLayout secM19;
    View lineM19;
    TextView VlblM19;
    EditText txtM19;
    LinearLayout seclblM110;
    LinearLayout secM110a;
    View lineM110a;
    TextView VlblM110a;
    CheckBox chkM110a;
    LinearLayout secM110b;
    View lineM110b;
    TextView VlblM110b;
    CheckBox chkM110b;
    LinearLayout secM110c;
    View lineM110c;
    TextView VlblM110c;
    CheckBox chkM110c;
    LinearLayout secM110d;
    View lineM110d;
    TextView VlblM110d;
    CheckBox chkM110d;
    LinearLayout secM110e;
    View lineM110e;
    TextView VlblM110e;
    CheckBox chkM110e;
    LinearLayout secM110f;
    View lineM110f;
    TextView VlblM110f;
    CheckBox chkM110f;
    LinearLayout secM110g;
    View lineM110g;
    TextView VlblM110g;
    CheckBox chkM110g;
    LinearLayout secM110h;
    View lineM110h;
    TextView VlblM110h;
    CheckBox chkM110h;
    LinearLayout secM110i;
    View lineM110i;
    TextView VlblM110i;
    CheckBox chkM110i;
    LinearLayout secM110j;
    View lineM110j;
    TextView VlblM110j;
    CheckBox chkM110j;
    LinearLayout secM110k;
    View lineM110k;
    TextView VlblM110k;
    CheckBox chkM110k;
    LinearLayout secM110l;
    View lineM110l;
    TextView VlblM110l;
    CheckBox chkM110l;
    LinearLayout secM110m;
    View lineM110m;
    TextView VlblM110m;
    CheckBox chkM110m;
    LinearLayout secM110mX;
    View lineM110mX;
    TextView VlblM110mX;
    EditText txtM110mX;
    LinearLayout seclblM111;
    LinearLayout secM111a;
    View lineM111a;
    TextView VlblM111a;
    CheckBox chkM111a;
    LinearLayout secM111b;
    View lineM111b;
    TextView VlblM111b;
    CheckBox chkM111b;
    LinearLayout secM111c;
    View lineM111c;
    TextView VlblM111c;
    CheckBox chkM111c;
    LinearLayout secM111d;
    View lineM111d;
    TextView VlblM111d;
    CheckBox chkM111d;
    LinearLayout secM111e;
    View lineM111e;
    TextView VlblM111e;
    CheckBox chkM111e;
    LinearLayout secM111f;
    View lineM111f;
    TextView VlblM111f;
    CheckBox chkM111f;
    LinearLayout secM111g;
    View lineM111g;
    TextView VlblM111g;
    CheckBox chkM111g;
    LinearLayout secM111h;
    View lineM111h;
    TextView VlblM111h;
    CheckBox chkM111h;
    LinearLayout secM111i;
    View lineM111i;
    TextView VlblM111i;
    CheckBox chkM111i;
    LinearLayout secM111j;
    View lineM111j;
    TextView VlblM111j;
    CheckBox chkM111j;
    LinearLayout secM111k;
    View lineM111k;
    TextView VlblM111k;
    CheckBox chkM111k;
    LinearLayout secM111l;
    View lineM111l;
    TextView VlblM111l;
    CheckBox chkM111l;
    LinearLayout secM111m;
    View lineM111m;
    TextView VlblM111m;
    CheckBox chkM111m;
    LinearLayout secM111n;
    View lineM111n;
    TextView VlblM111n;
    CheckBox chkM111n;
    LinearLayout secM111nX;
    View lineM111nX;
    TextView VlblM111nX;
    EditText txtM111nX;
    LinearLayout secM112;
    View lineM112;
    TextView VlblM112;
    Spinner spnM112;
    LinearLayout secM112X;
    View lineM112X;
    TextView VlblM112X;
    EditText txtM112X;
    LinearLayout secM113;
    View lineM113;
    TextView VlblM113;
    Spinner spnM113;
    LinearLayout secM114;
    View lineM114;
    TextView VlblM114;
    Spinner spnM114;
    LinearLayout secM114X;
    View lineM114X;
    TextView VlblM114X;
    EditText txtM114X;
    LinearLayout secM115;
    View lineM115;
    TextView VlblM115;
    RadioGroup rdogrpM115;
    RadioButton rdoM1151;
    RadioButton rdoM1152;
    RadioButton rdoM1153;
    LinearLayout secM116;
    View lineM116;
    TextView VlblM116;
    EditText txtM116;
    LinearLayout secM117;
    View lineM117;
    TextView VlblM117;
    EditText txtM117;
    LinearLayout secM118;
    View lineM118;
    TextView VlblM118;
    RadioGroup rdogrpM118;
    RadioButton rdoM1181;
    RadioButton rdoM1182;
    RadioButton rdoM1183;
    LinearLayout secM119;
    View lineM119;
    TextView VlblM119;
    RadioGroup rdogrpM119;
    RadioButton rdoM1191;
    RadioButton rdoM1192;
    RadioButton rdoM1193;
    LinearLayout secM120;
    View lineM120;
    TextView VlblM120;
    RadioGroup rdogrpM120;
    RadioButton rdoM1201;
    RadioButton rdoM1202;
    RadioButton rdoM1203;
    LinearLayout secM121;
    View lineM121;
    TextView VlblM121;
    RadioGroup rdogrpM121;
    RadioButton rdoM1211;
    RadioButton rdoM1212;
    RadioButton rdoM1213;
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
            EditText dtpDate;


            //dtpDate.setText(new StringBuilder()
            //       .append(Global.Right("00"+mDay,2)).append("/")
            //        .append(Global.Right("00"+mMonth,2)).append("/")
            //        .append(mYear));
        }
    };
    private TimePickerDialog.OnTimeSetListener timePickerListener = new TimePickerDialog.OnTimeSetListener() {
        public void onTimeSet(TimePicker view, int selectedHour, int selectedMinute) {
            hour = selectedHour;
            minute = selectedMinute;
            EditText tpTime;


            // tpTime.setText(new StringBuilder().append(Global.Right("00"+hour,2)).append(":").append(Global.Right("00"+minute,2)));

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
            setContentView(R.layout.preghis);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");


            TableName = "PregHis";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(PregHis.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), IGA.class);
                            intent.putExtras(IDbundle);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(PregHis.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to return to Home [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Knowledge.class);
                            intent.putExtras(IDbundle);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
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
            secRnd = (LinearLayout) findViewById(R.id.secRnd);
            lineRnd = (View) findViewById(R.id.lineRnd);
            VlblRnd = (TextView) findViewById(R.id.VlblRnd);
            txtRnd = (EditText) findViewById(R.id.txtRnd);
            secSuchanaID = (LinearLayout) findViewById(R.id.secSuchanaID);
            lineSuchanaID = (View) findViewById(R.id.lineSuchanaID);
            VlblSuchanaID = (TextView) findViewById(R.id.VlblSuchanaID);
            txtSuchanaID = (EditText) findViewById(R.id.txtSuchanaID);
            seclblM14 = (LinearLayout) findViewById(R.id.seclblM14);
            secM11 = (LinearLayout) findViewById(R.id.secM11);
            lineM11 = (View) findViewById(R.id.lineM11);
            VlblM11 = (TextView) findViewById(R.id.VlblM11);
            txtM11 = (EditText) findViewById(R.id.txtM11);
            secM12 = (LinearLayout) findViewById(R.id.secM12);
            lineM12 = (View) findViewById(R.id.lineM12);
            VlblM12 = (TextView) findViewById(R.id.VlblM12);
            txtM12 = (EditText) findViewById(R.id.txtM12);
            secM13 = (LinearLayout) findViewById(R.id.secM13);
            lineM13 = (View) findViewById(R.id.lineM13);
            VlblM13 = (TextView) findViewById(R.id.VlblM13);
            txtM13 = (EditText) findViewById(R.id.txtM13);
            seclblM14a = (LinearLayout) findViewById(R.id.seclblM14a);
            secM14a = (LinearLayout) findViewById(R.id.secM14a);
            lineM14a = (View) findViewById(R.id.lineM14a);
            VlblM14a = (TextView) findViewById(R.id.VlblM14a);
            txtM14a = (EditText) findViewById(R.id.txtM14a);
            secM14b = (LinearLayout) findViewById(R.id.secM14b);
            lineM14b = (View) findViewById(R.id.lineM14b);
            VlblM14b = (TextView) findViewById(R.id.VlblM14b);
            txtM14b = (EditText) findViewById(R.id.txtM14b);
            secM14c = (LinearLayout) findViewById(R.id.secM14c);
            lineM14c = (View) findViewById(R.id.lineM14c);
            VlblM14c = (TextView) findViewById(R.id.VlblM14c);
            txtM14c = (EditText) findViewById(R.id.txtM14c);
            secM14d = (LinearLayout) findViewById(R.id.secM14d);
            lineM14d = (View) findViewById(R.id.lineM14d);
            VlblM14d = (TextView) findViewById(R.id.VlblM14d);
            txtM14d = (EditText) findViewById(R.id.txtM14d);
            secM14e = (LinearLayout) findViewById(R.id.secM14e);
            lineM14e = (View) findViewById(R.id.lineM14e);
            VlblM14e = (TextView) findViewById(R.id.VlblM14e);
            txtM14e = (EditText) findViewById(R.id.txtM14e);
            seclblM15 = (LinearLayout) findViewById(R.id.seclblM15);
            secM15a = (LinearLayout) findViewById(R.id.secM15a);
            lineM15a = (View) findViewById(R.id.lineM15a);
            VlblM15a = (TextView) findViewById(R.id.VlblM15a);
            chkM15a = (CheckBox) findViewById(R.id.chkM15a);

            chkM15a.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        secM15b.setVisibility(View.GONE);
                        lineM15b.setVisibility(View.GONE);
                        txtM15b.setText("");
                        secM15c.setVisibility(View.GONE);
                        lineM15c.setVisibility(View.GONE);
                        txtM15c.setText("");
                        secM15d.setVisibility(View.GONE);
                        lineM15d.setVisibility(View.GONE);
                        txtM15d.setText("");
                        secM15e.setVisibility(View.GONE);
                       // lineM15e.setVisibility(View.GONE);
                        txtM15e.setText("");
                        secM15f.setVisibility(View.GONE);
                        lineM15f.setVisibility(View.GONE);
                        txtM15f.setText("");

                    } else {
                        secM15b.setVisibility(View.VISIBLE);
                        lineM15b.setVisibility(View.VISIBLE);
                        secM15c.setVisibility(View.VISIBLE);
                        lineM15c.setVisibility(View.VISIBLE);
                        secM15d.setVisibility(View.VISIBLE);
                        lineM15d.setVisibility(View.VISIBLE);
                        secM15e.setVisibility(View.VISIBLE);
                       // lineM15e.setVisibility(View.VISIBLE);
                        secM15f.setVisibility(View.VISIBLE);
                        lineM15f.setVisibility(View.VISIBLE);

                    }
                }
            });
            secM15b = (LinearLayout) findViewById(R.id.secM15b);
            lineM15b = (View) findViewById(R.id.lineM15b);
            VlblM15b = (TextView) findViewById(R.id.VlblM15b);
            txtM15b = (EditText) findViewById(R.id.txtM15b);
            secM15c = (LinearLayout) findViewById(R.id.secM15c);
            lineM15c = (View) findViewById(R.id.lineM15c);
            VlblM15c = (TextView) findViewById(R.id.VlblM15c);
            txtM15c = (EditText) findViewById(R.id.txtM15c);
            secM15d = (LinearLayout) findViewById(R.id.secM15d);
            lineM15d = (View) findViewById(R.id.lineM15d);
            VlblM15d = (TextView) findViewById(R.id.VlblM15d);
            txtM15d = (EditText) findViewById(R.id.txtM15d);
            secM15e = (LinearLayout) findViewById(R.id.secM15e);
            // lineM15e=(View)findViewById(R.id.lineM15e);
            VlblM15e = (TextView) findViewById(R.id.VlblM15e);
            txtM15e = (EditText) findViewById(R.id.txtM15e);

            secM15f = (LinearLayout) findViewById(R.id.secM15f);
            lineM15f = (View) findViewById(R.id.lineM15f);
            VlblM15f = (TextView) findViewById(R.id.VlblM15f);
            txtM15f = (EditText) findViewById(R.id.txtM15f);
            secM16 = (LinearLayout) findViewById(R.id.secM16);
            lineM16 = (View) findViewById(R.id.lineM16);
            VlblM16 = (TextView) findViewById(R.id.VlblM16);
            rdogrpM16 = (RadioGroup) findViewById(R.id.rdogrpM16);

            rdoM161 = (RadioButton) findViewById(R.id.rdoM161);
            rdoM162 = (RadioButton) findViewById(R.id.rdoM162);
            rdoM163 = (RadioButton) findViewById(R.id.rdoM163);
            rdogrpM16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpM16 = new String[]{"1", "0", "8"};
                    for (int i = 0; i < rdogrpM16.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpM16.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpM16[i];
                    }

                    if (rbData.equalsIgnoreCase("0") || rbData.equalsIgnoreCase("8")) {
                        secM17.setVisibility(View.GONE);
                        lineM17.setVisibility(View.GONE);
                        txtM17.setText("");
                        secM18a.setVisibility(View.GONE);
                        lineM18a.setVisibility(View.GONE);
                        txtM18a.setText("");
                        secM18b.setVisibility(View.GONE);
                        lineM18b.setVisibility(View.GONE);
                        txtM18b.setText("");
                        secM18c.setVisibility(View.GONE);
                        lineM18c.setVisibility(View.GONE);
                        txtM18c.setText("");
                    } else {
                        secM17.setVisibility(View.VISIBLE);
                        lineM17.setVisibility(View.VISIBLE);
                        secM18a.setVisibility(View.VISIBLE);
                        lineM18a.setVisibility(View.VISIBLE);
                        secM18b.setVisibility(View.VISIBLE);
                        lineM18b.setVisibility(View.VISIBLE);
                        secM18c.setVisibility(View.VISIBLE);
                        lineM18c.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secM17 = (LinearLayout) findViewById(R.id.secM17);
            lineM17 = (View) findViewById(R.id.lineM17);
            VlblM17 = (TextView) findViewById(R.id.VlblM17);
            txtM17 = (EditText) findViewById(R.id.txtM17);
            seclblM18 = (LinearLayout) findViewById(R.id.seclblM18);
            secM18a = (LinearLayout) findViewById(R.id.secM18a);
            lineM18a = (View) findViewById(R.id.lineM18a);
            VlblM18a = (TextView) findViewById(R.id.VlblM18a);
            txtM18a = (EditText) findViewById(R.id.txtM18a);
            secM18b = (LinearLayout) findViewById(R.id.secM18b);
            lineM18b = (View) findViewById(R.id.lineM18b);
            VlblM18b = (TextView) findViewById(R.id.VlblM18b);
            txtM18b = (EditText) findViewById(R.id.txtM18b);
            secM18c = (LinearLayout) findViewById(R.id.secM18c);
            lineM18c = (View) findViewById(R.id.lineM18c);
            VlblM18c = (TextView) findViewById(R.id.VlblM18c);
            txtM18c = (EditText) findViewById(R.id.txtM18c);
            secM19 = (LinearLayout) findViewById(R.id.secM19);
            lineM19 = (View) findViewById(R.id.lineM19);
            VlblM19 = (TextView) findViewById(R.id.VlblM19);
            txtM19 = (EditText) findViewById(R.id.txtM19);
            txtM19.addTextChangedListener(new TextWatcher() {
                public void afterTextChanged(Editable s) {
                }

                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }

                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    if (txtM19.getText().toString().equals("0") | txtM19.getText().toString().equals("") | txtM19.getText().toString().equals("00")) {
                        secM110a.setVisibility(View.GONE);
                        lineM110a.setVisibility(View.GONE);
                        chkM110a.setChecked(false);
                        secM110b.setVisibility(View.GONE);
                        lineM110b.setVisibility(View.GONE);
                        chkM110b.setChecked(false);
                        secM110c.setVisibility(View.GONE);
                        lineM110c.setVisibility(View.GONE);
                        chkM110c.setChecked(false);
                        secM110d.setVisibility(View.GONE);
                        lineM110d.setVisibility(View.GONE);
                        chkM110d.setChecked(false);
                        secM110e.setVisibility(View.GONE);
                        lineM110e.setVisibility(View.GONE);
                        chkM110e.setChecked(false);
                        secM110f.setVisibility(View.GONE);
                        lineM110f.setVisibility(View.GONE);
                        chkM110f.setChecked(false);
                        secM110g.setVisibility(View.GONE);
                        lineM110g.setVisibility(View.GONE);
                        chkM110g.setChecked(false);
                        secM110h.setVisibility(View.GONE);
                        lineM110h.setVisibility(View.GONE);
                        chkM110h.setChecked(false);
                        secM110i.setVisibility(View.GONE);
                        lineM110i.setVisibility(View.GONE);
                        chkM110i.setChecked(false);
                        secM110j.setVisibility(View.GONE);
                        lineM110j.setVisibility(View.GONE);
                        chkM110j.setChecked(false);
                        secM110k.setVisibility(View.GONE);
                        lineM110k.setVisibility(View.GONE);
                        chkM110k.setChecked(false);
                        secM110l.setVisibility(View.GONE);
                        lineM110l.setVisibility(View.GONE);
                        chkM110l.setChecked(false);
                        secM110m.setVisibility(View.GONE);
                        lineM110m.setVisibility(View.GONE);
                        chkM110m.setChecked(false);
                        secM110mX.setVisibility(View.GONE);
                        lineM110mX.setVisibility(View.GONE);
                        txtM110mX.setText("");
                        secM111a.setVisibility(View.GONE);
                        lineM111a.setVisibility(View.GONE);
                        chkM111a.setChecked(false);
                        secM111b.setVisibility(View.GONE);
                        lineM111b.setVisibility(View.GONE);
                        chkM111b.setChecked(false);
                        secM111c.setVisibility(View.GONE);
                        lineM111c.setVisibility(View.GONE);
                        chkM111c.setChecked(false);
                        secM111d.setVisibility(View.GONE);
                        lineM111d.setVisibility(View.GONE);
                        chkM111d.setChecked(false);
                        secM111e.setVisibility(View.GONE);
                        lineM111e.setVisibility(View.GONE);
                        chkM111e.setChecked(false);
                        secM111f.setVisibility(View.GONE);
                        lineM111f.setVisibility(View.GONE);
                        chkM111f.setChecked(false);
                        secM111g.setVisibility(View.GONE);
                        lineM111g.setVisibility(View.GONE);
                        chkM111g.setChecked(false);
                        secM111h.setVisibility(View.GONE);
                        lineM111h.setVisibility(View.GONE);
                        chkM111h.setChecked(false);
                        secM111i.setVisibility(View.GONE);
                        lineM111i.setVisibility(View.GONE);
                        chkM111i.setChecked(false);
                        secM111j.setVisibility(View.GONE);
                        lineM111j.setVisibility(View.GONE);
                        chkM111j.setChecked(false);
                        secM111k.setVisibility(View.GONE);
                        lineM111k.setVisibility(View.GONE);
                        chkM111k.setChecked(false);
                        secM111l.setVisibility(View.GONE);
                        lineM111l.setVisibility(View.GONE);
                        chkM111l.setChecked(false);
                        secM111m.setVisibility(View.GONE);
                        lineM111m.setVisibility(View.GONE);
                        chkM111m.setChecked(false);
                        secM111n.setVisibility(View.GONE);
                        lineM111n.setVisibility(View.GONE);
                        chkM111n.setChecked(false);
                        secM111nX.setVisibility(View.GONE);
                        lineM111nX.setVisibility(View.GONE);
                        txtM111nX.setText("");
                        secM112.setVisibility(View.GONE);
                        lineM112.setVisibility(View.GONE);
                        spnM112.setSelection(0);
                        secM112X.setVisibility(View.GONE);
                        lineM112X.setVisibility(View.GONE);
                        txtM112X.setText("");
                        secM113.setVisibility(View.GONE);
                        lineM113.setVisibility(View.GONE);
                        spnM113.setSelection(0);
                        secM114.setVisibility(View.GONE);
                        lineM114.setVisibility(View.GONE);
                        spnM114.setSelection(0);
                        secM114X.setVisibility(View.GONE);
                        lineM114X.setVisibility(View.GONE);
                        txtM114X.setText("");
                        secM115.setVisibility(View.GONE);
                        lineM115.setVisibility(View.GONE);
                        rdogrpM115.clearCheck();
                        secM116.setVisibility(View.GONE);
                        lineM116.setVisibility(View.GONE);
                        txtM116.setText("");
                        secM117.setVisibility(View.GONE);
                        lineM117.setVisibility(View.GONE);
                        txtM117.setText("");
                        secM118.setVisibility(View.GONE);
                        lineM118.setVisibility(View.GONE);
                        rdogrpM118.clearCheck();
                        secM119.setVisibility(View.GONE);
                        lineM119.setVisibility(View.GONE);
                        rdogrpM119.clearCheck();
                        seclblM110.setVisibility(View.GONE);
                        seclblM111.setVisibility(View.GONE);
                    } else {
                        seclblM110.setVisibility(View.VISIBLE);
                        seclblM111.setVisibility(View.VISIBLE);

                        secM110a.setVisibility(View.VISIBLE);
                        lineM110a.setVisibility(View.VISIBLE);
                        secM110b.setVisibility(View.VISIBLE);
                        lineM110b.setVisibility(View.VISIBLE);
                        secM110c.setVisibility(View.VISIBLE);
                        lineM110c.setVisibility(View.VISIBLE);
                        secM110d.setVisibility(View.VISIBLE);
                        lineM110d.setVisibility(View.VISIBLE);
                        secM110e.setVisibility(View.VISIBLE);
                        lineM110e.setVisibility(View.VISIBLE);
                        secM110f.setVisibility(View.VISIBLE);
                        lineM110f.setVisibility(View.VISIBLE);
                        secM110g.setVisibility(View.VISIBLE);
                        lineM110g.setVisibility(View.VISIBLE);
                        secM110h.setVisibility(View.VISIBLE);
                        lineM110h.setVisibility(View.VISIBLE);
                        secM110i.setVisibility(View.VISIBLE);
                        lineM110i.setVisibility(View.VISIBLE);
                        secM110j.setVisibility(View.VISIBLE);
                        lineM110j.setVisibility(View.VISIBLE);
                        secM110k.setVisibility(View.VISIBLE);
                        lineM110k.setVisibility(View.VISIBLE);
                        secM110l.setVisibility(View.VISIBLE);
                        lineM110l.setVisibility(View.VISIBLE);
                        secM110m.setVisibility(View.VISIBLE);
                        lineM110m.setVisibility(View.VISIBLE);
                        //secM110mX.setVisibility(View.VISIBLE);
                        //lineM110mX.setVisibility(View.VISIBLE);
                        secM111a.setVisibility(View.VISIBLE);
                        lineM111a.setVisibility(View.VISIBLE);
                        secM111b.setVisibility(View.VISIBLE);
                        lineM111b.setVisibility(View.VISIBLE);
                        secM111c.setVisibility(View.VISIBLE);
                        lineM111c.setVisibility(View.VISIBLE);
                        secM111d.setVisibility(View.VISIBLE);
                        lineM111d.setVisibility(View.VISIBLE);
                        secM111e.setVisibility(View.VISIBLE);
                        lineM111e.setVisibility(View.VISIBLE);
                        secM111f.setVisibility(View.VISIBLE);
                        lineM111f.setVisibility(View.VISIBLE);
                        secM111g.setVisibility(View.VISIBLE);
                        lineM111g.setVisibility(View.VISIBLE);
                        secM111h.setVisibility(View.VISIBLE);
                        lineM111h.setVisibility(View.VISIBLE);
                        secM111i.setVisibility(View.VISIBLE);
                        lineM111i.setVisibility(View.VISIBLE);
                        secM111j.setVisibility(View.VISIBLE);
                        lineM111j.setVisibility(View.VISIBLE);
                        secM111k.setVisibility(View.VISIBLE);
                        lineM111k.setVisibility(View.VISIBLE);
                        secM111l.setVisibility(View.VISIBLE);
                        lineM111l.setVisibility(View.VISIBLE);
                        secM111m.setVisibility(View.VISIBLE);
                        lineM111m.setVisibility(View.VISIBLE);
                        secM111n.setVisibility(View.VISIBLE);
                        lineM111n.setVisibility(View.VISIBLE);
                        //secM111nX.setVisibility(View.VISIBLE);
                        //lineM111nX.setVisibility(View.VISIBLE);
                        secM112.setVisibility(View.VISIBLE);
                        lineM112.setVisibility(View.VISIBLE);
                        //secM112X.setVisibility(View.VISIBLE);
                        //lineM112X.setVisibility(View.VISIBLE);
                        secM113.setVisibility(View.VISIBLE);
                        lineM113.setVisibility(View.VISIBLE);
                        secM114.setVisibility(View.VISIBLE);
                        lineM114.setVisibility(View.VISIBLE);
                        //secM114X.setVisibility(View.VISIBLE);
                        //lineM114X.setVisibility(View.VISIBLE);
                        secM115.setVisibility(View.VISIBLE);
                        lineM115.setVisibility(View.VISIBLE);
                        secM116.setVisibility(View.VISIBLE);
                        lineM116.setVisibility(View.VISIBLE);
                        secM117.setVisibility(View.VISIBLE);
                        lineM117.setVisibility(View.VISIBLE);
                        secM118.setVisibility(View.VISIBLE);
                        lineM118.setVisibility(View.VISIBLE);
                        secM119.setVisibility(View.VISIBLE);
                        lineM119.setVisibility(View.VISIBLE);
                    }
                }
            });

            seclblM110 = (LinearLayout) findViewById(R.id.seclblM110);
            secM110a = (LinearLayout) findViewById(R.id.secM110a);
            lineM110a = (View) findViewById(R.id.lineM110a);
            VlblM110a = (TextView) findViewById(R.id.VlblM110a);
            chkM110a = (CheckBox) findViewById(R.id.chkM110a);
            secM110b = (LinearLayout) findViewById(R.id.secM110b);
            lineM110b = (View) findViewById(R.id.lineM110b);
            VlblM110b = (TextView) findViewById(R.id.VlblM110b);
            chkM110b = (CheckBox) findViewById(R.id.chkM110b);
            secM110c = (LinearLayout) findViewById(R.id.secM110c);
            lineM110c = (View) findViewById(R.id.lineM110c);
            VlblM110c = (TextView) findViewById(R.id.VlblM110c);
            chkM110c = (CheckBox) findViewById(R.id.chkM110c);
            secM110d = (LinearLayout) findViewById(R.id.secM110d);
            lineM110d = (View) findViewById(R.id.lineM110d);
            VlblM110d = (TextView) findViewById(R.id.VlblM110d);
            chkM110d = (CheckBox) findViewById(R.id.chkM110d);
            secM110e = (LinearLayout) findViewById(R.id.secM110e);
            lineM110e = (View) findViewById(R.id.lineM110e);
            VlblM110e = (TextView) findViewById(R.id.VlblM110e);
            chkM110e = (CheckBox) findViewById(R.id.chkM110e);
            secM110f = (LinearLayout) findViewById(R.id.secM110f);
            lineM110f = (View) findViewById(R.id.lineM110f);
            VlblM110f = (TextView) findViewById(R.id.VlblM110f);
            chkM110f = (CheckBox) findViewById(R.id.chkM110f);
            secM110g = (LinearLayout) findViewById(R.id.secM110g);
            lineM110g = (View) findViewById(R.id.lineM110g);
            VlblM110g = (TextView) findViewById(R.id.VlblM110g);
            chkM110g = (CheckBox) findViewById(R.id.chkM110g);
            secM110h = (LinearLayout) findViewById(R.id.secM110h);
            lineM110h = (View) findViewById(R.id.lineM110h);
            VlblM110h = (TextView) findViewById(R.id.VlblM110h);
            chkM110h = (CheckBox) findViewById(R.id.chkM110h);
            secM110i = (LinearLayout) findViewById(R.id.secM110i);
            lineM110i = (View) findViewById(R.id.lineM110i);
            VlblM110i = (TextView) findViewById(R.id.VlblM110i);
            chkM110i = (CheckBox) findViewById(R.id.chkM110i);
            secM110j = (LinearLayout) findViewById(R.id.secM110j);
            lineM110j = (View) findViewById(R.id.lineM110j);
            VlblM110j = (TextView) findViewById(R.id.VlblM110j);
            chkM110j = (CheckBox) findViewById(R.id.chkM110j);
            secM110k = (LinearLayout) findViewById(R.id.secM110k);
            lineM110k = (View) findViewById(R.id.lineM110k);
            VlblM110k = (TextView) findViewById(R.id.VlblM110k);
            chkM110k = (CheckBox) findViewById(R.id.chkM110k);
            secM110l = (LinearLayout) findViewById(R.id.secM110l);
            lineM110l = (View) findViewById(R.id.lineM110l);
            VlblM110l = (TextView) findViewById(R.id.VlblM110l);
            chkM110l = (CheckBox) findViewById(R.id.chkM110l);
            secM110m = (LinearLayout) findViewById(R.id.secM110m);
            lineM110m = (View) findViewById(R.id.lineM110m);
            VlblM110m = (TextView) findViewById(R.id.VlblM110m);
            chkM110m = (CheckBox) findViewById(R.id.chkM110m);
            chkM110m.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {
                        secM110mX.setVisibility(View.GONE);
                        lineM110mX.setVisibility(View.GONE);
                        txtM110mX.setText("");
                        secM111a.setVisibility(View.GONE);
                        lineM111a.setVisibility(View.GONE);
                        chkM111a.setChecked(false);
                    } else {
                        secM110mX.setVisibility(View.VISIBLE);
                        lineM110mX.setVisibility(View.VISIBLE);
                        secM111a.setVisibility(View.VISIBLE);
                        lineM111a.setVisibility(View.VISIBLE);

                    }
                }
            });
            secM110mX = (LinearLayout) findViewById(R.id.secM110mX);
            lineM110mX = (View) findViewById(R.id.lineM110mX);
            VlblM110mX = (TextView) findViewById(R.id.VlblM110mX);
            txtM110mX = (EditText) findViewById(R.id.txtM110mX);
            seclblM111 = (LinearLayout) findViewById(R.id.seclblM111);
            secM111a = (LinearLayout) findViewById(R.id.secM111a);
            lineM111a = (View) findViewById(R.id.lineM111a);
            VlblM111a = (TextView) findViewById(R.id.VlblM111a);
            chkM111a = (CheckBox) findViewById(R.id.chkM111a);

            secM110mX.setVisibility(View.GONE);
            lineM110mX.setVisibility(View.GONE);

            secM111a.setVisibility(View.GONE);
            lineM111a.setVisibility(View.GONE);


            secM111b = (LinearLayout) findViewById(R.id.secM111b);
            lineM111b = (View) findViewById(R.id.lineM111b);
            VlblM111b = (TextView) findViewById(R.id.VlblM111b);
            chkM111b = (CheckBox) findViewById(R.id.chkM111b);
            secM111c = (LinearLayout) findViewById(R.id.secM111c);
            lineM111c = (View) findViewById(R.id.lineM111c);
            VlblM111c = (TextView) findViewById(R.id.VlblM111c);
            chkM111c = (CheckBox) findViewById(R.id.chkM111c);
            secM111d = (LinearLayout) findViewById(R.id.secM111d);
            lineM111d = (View) findViewById(R.id.lineM111d);
            VlblM111d = (TextView) findViewById(R.id.VlblM111d);
            chkM111d = (CheckBox) findViewById(R.id.chkM111d);
            secM111e = (LinearLayout) findViewById(R.id.secM111e);
            lineM111e = (View) findViewById(R.id.lineM111e);
            VlblM111e = (TextView) findViewById(R.id.VlblM111e);
            chkM111e = (CheckBox) findViewById(R.id.chkM111e);
            secM111f = (LinearLayout) findViewById(R.id.secM111f);
            lineM111f = (View) findViewById(R.id.lineM111f);
            VlblM111f = (TextView) findViewById(R.id.VlblM111f);
            chkM111f = (CheckBox) findViewById(R.id.chkM111f);
            secM111g = (LinearLayout) findViewById(R.id.secM111g);
            lineM111g = (View) findViewById(R.id.lineM111g);
            VlblM111g = (TextView) findViewById(R.id.VlblM111g);
            chkM111g = (CheckBox) findViewById(R.id.chkM111g);
            secM111h = (LinearLayout) findViewById(R.id.secM111h);
            lineM111h = (View) findViewById(R.id.lineM111h);
            VlblM111h = (TextView) findViewById(R.id.VlblM111h);
            chkM111h = (CheckBox) findViewById(R.id.chkM111h);
            secM111i = (LinearLayout) findViewById(R.id.secM111i);
            lineM111i = (View) findViewById(R.id.lineM111i);
            VlblM111i = (TextView) findViewById(R.id.VlblM111i);
            chkM111i = (CheckBox) findViewById(R.id.chkM111i);
            secM111j = (LinearLayout) findViewById(R.id.secM111j);
            lineM111j = (View) findViewById(R.id.lineM111j);
            VlblM111j = (TextView) findViewById(R.id.VlblM111j);
            chkM111j = (CheckBox) findViewById(R.id.chkM111j);
            secM111k = (LinearLayout) findViewById(R.id.secM111k);
            lineM111k = (View) findViewById(R.id.lineM111k);
            VlblM111k = (TextView) findViewById(R.id.VlblM111k);
            chkM111k = (CheckBox) findViewById(R.id.chkM111k);
            secM111l = (LinearLayout) findViewById(R.id.secM111l);
            lineM111l = (View) findViewById(R.id.lineM111l);
            VlblM111l = (TextView) findViewById(R.id.VlblM111l);
            chkM111l = (CheckBox) findViewById(R.id.chkM111l);
            secM111m = (LinearLayout) findViewById(R.id.secM111m);
            lineM111m = (View) findViewById(R.id.lineM111m);
            VlblM111m = (TextView) findViewById(R.id.VlblM111m);
            chkM111m = (CheckBox) findViewById(R.id.chkM111m);
            secM111n = (LinearLayout) findViewById(R.id.secM111n);
            lineM111n = (View) findViewById(R.id.lineM111n);
            VlblM111n = (TextView) findViewById(R.id.VlblM111n);
            chkM111n = (CheckBox) findViewById(R.id.chkM111n);
            chkM111n.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {
                        secM111nX.setVisibility(View.GONE);
                        lineM111nX.setVisibility(View.GONE);
                        txtM111nX.setText("");

                    } else {
                        secM111nX.setVisibility(View.VISIBLE);
                        lineM111nX.setVisibility(View.VISIBLE);
                    }
                }
            });
            secM111nX = (LinearLayout) findViewById(R.id.secM111nX);
            lineM111nX = (View) findViewById(R.id.lineM111nX);
            VlblM111nX = (TextView) findViewById(R.id.VlblM111nX);
            txtM111nX = (EditText) findViewById(R.id.txtM111nX);

            secM111nX.setVisibility(View.GONE);
            lineM111nX.setVisibility(View.GONE);

            secM112 = (LinearLayout) findViewById(R.id.secM112);
            lineM112 = (View) findViewById(R.id.lineM112);
            VlblM112 = (TextView) findViewById(R.id.VlblM112);
            spnM112 = (Spinner) findViewById(R.id.spnM112);
            List<String> listM112 = new ArrayList<String>();

            listM112.add("");
            listM112.add("01-পরিবার কল্যাণ পরিদর্শক (FWV)");
            listM112.add("02-পরিবার কল্যাণ সহকারী (FWA)");
            listM112.add("03-দাই (TBA)");
            listM112.add("04-প্রশিক্ষণপ্রাপ্ত দাই CSBA");
            listM112.add("05-ব্রাক স্বাস্থ্য সেবিকা");
            listM112.add("06-নার্স/ধাত্রী");
            listM112.add("07-আত্বীয়/বন্ধু/ প্রতিবেশী");
            listM112.add("08-MBBS ডাক্তার");
            listM112.add("09-নিজে/কেউ না");
            listM112.add("10-অনান্য (উল্লেখ করুন)");
            ArrayAdapter<String> adptrM112 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM112);
            spnM112.setAdapter(adptrM112);

            spnM112.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnM112.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnM112.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("10")) {
                        secM112X.setVisibility(View.VISIBLE);
                        lineM112X.setVisibility(View.VISIBLE);
                    } else {

                        secM112X.setVisibility(View.GONE);
                        lineM112X.setVisibility(View.GONE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secM112X = (LinearLayout) findViewById(R.id.secM112X);
            lineM112X = (View) findViewById(R.id.lineM112X);
            VlblM112X = (TextView) findViewById(R.id.VlblM112X);
            txtM112X = (EditText) findViewById(R.id.txtM112X);

            secM112X.setVisibility(View.GONE);
            lineM112X.setVisibility(View.GONE);

            secM113 = (LinearLayout) findViewById(R.id.secM113);
            lineM113 = (View) findViewById(R.id.lineM113);
            VlblM113 = (TextView) findViewById(R.id.VlblM113);
            spnM113 = (Spinner) findViewById(R.id.spnM113);
            List<String> listM113 = new ArrayList<String>();

            listM113.add("");
            listM113.add("01-স্বাভাবিক");
            listM113.add("02-সাইড কেটে প্রসব (Episiotomy)");
            listM113.add("03-যন্ত্র ব্যবহার করে (Forcep/Vaccum)");
            listM113.add("04-সিজারিয়ান অপারেশন");
            ArrayAdapter<String> adptrM113 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM113);
            spnM113.setAdapter(adptrM113);

            secM114 = (LinearLayout) findViewById(R.id.secM114);
            lineM114 = (View) findViewById(R.id.lineM114);
            VlblM114 = (TextView) findViewById(R.id.VlblM114);
            spnM114 = (Spinner) findViewById(R.id.spnM114);
            List<String> listM114 = new ArrayList<String>();

            listM114.add("");
            listM114.add("01-বাড়ীতে");
            listM114.add("02-যাত্রাপথে");
            listM114.add("03-জেলা হাসপাতালে");
            listM114.add("04-উপজিলা/থানা স্বাস্থ্য কমপ্লেক্স");
            listM114.add("05-মাতৃসদন (MCWC)");
            listM114.add("06-পরিবার কল্যাণ কেন্দ্র (FWC)");
            listM114.add("07-ব্র্যাক সুস্বাস্থ্য");
            listM114.add("08-প্রাইভেট ক্লিনিক/হাসপাতাল");
            listM114.add("09-অন্যান্য NGO ক্লিনিক");
            listM114.add("10-অন্যান্য (উল্লেখ করুন)");
            ArrayAdapter<String> adptrM114 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM114);
            spnM114.setAdapter(adptrM114);

            spnM114.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnM114.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnM114.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("10")) {
                        secM114X.setVisibility(View.VISIBLE);
                        lineM114X.setVisibility(View.VISIBLE);

                    } else {
                        secM114X.setVisibility(View.GONE);
                        lineM114X.setVisibility(View.GONE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secM114X = (LinearLayout) findViewById(R.id.secM114X);
            lineM114X = (View) findViewById(R.id.lineM114X);
            VlblM114X = (TextView) findViewById(R.id.VlblM114X);
            txtM114X = (EditText) findViewById(R.id.txtM114X);

            secM114X.setVisibility(View.GONE);
            lineM114X.setVisibility(View.GONE);

            secM115 = (LinearLayout) findViewById(R.id.secM115);
            lineM115 = (View) findViewById(R.id.lineM115);
            VlblM115 = (TextView) findViewById(R.id.VlblM115);
            rdogrpM115 = (RadioGroup) findViewById(R.id.rdogrpM115);

            rdoM1151 = (RadioButton) findViewById(R.id.rdoM1151);
            rdoM1152 = (RadioButton) findViewById(R.id.rdoM1152);
            rdoM1153 = (RadioButton) findViewById(R.id.rdoM1153);
            rdogrpM115.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpM115 = new String[]{"1", "2", "0"};
                    for (int i = 0; i < rdogrpM115.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpM115.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpM115[i];
                    }

                    if (rbData.equalsIgnoreCase("0") || rbData.equalsIgnoreCase("2")) {
                        secM116.setVisibility(View.GONE);
                        lineM116.setVisibility(View.GONE);
                        txtM116.setText("");
                        secM117.setVisibility(View.GONE);
                        lineM117.setVisibility(View.GONE);
                        txtM117.setText("");
                    } else {
                        secM116.setVisibility(View.VISIBLE);
                        lineM116.setVisibility(View.VISIBLE);
                        secM117.setVisibility(View.VISIBLE);
                        lineM117.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secM116 = (LinearLayout) findViewById(R.id.secM116);
            lineM116 = (View) findViewById(R.id.lineM116);
            VlblM116 = (TextView) findViewById(R.id.VlblM116);
            txtM116 = (EditText) findViewById(R.id.txtM116);
            secM117 = (LinearLayout) findViewById(R.id.secM117);
            lineM117 = (View) findViewById(R.id.lineM117);
            VlblM117 = (TextView) findViewById(R.id.VlblM117);
            txtM117 = (EditText) findViewById(R.id.txtM117);
            secM118 = (LinearLayout) findViewById(R.id.secM118);
            lineM118 = (View) findViewById(R.id.lineM118);
            VlblM118 = (TextView) findViewById(R.id.VlblM118);
            rdogrpM118 = (RadioGroup) findViewById(R.id.rdogrpM118);

            rdoM1181 = (RadioButton) findViewById(R.id.rdoM1181);
            rdoM1182 = (RadioButton) findViewById(R.id.rdoM1182);
            rdoM1183 = (RadioButton) findViewById(R.id.rdoM1183);
            secM119 = (LinearLayout) findViewById(R.id.secM119);
            lineM119 = (View) findViewById(R.id.lineM119);
            VlblM119 = (TextView) findViewById(R.id.VlblM119);
            rdogrpM119 = (RadioGroup) findViewById(R.id.rdogrpM119);

            rdoM1191 = (RadioButton) findViewById(R.id.rdoM1191);
            rdoM1192 = (RadioButton) findViewById(R.id.rdoM1192);
            rdoM1193 = (RadioButton) findViewById(R.id.rdoM1193);
            secM120 = (LinearLayout) findViewById(R.id.secM120);
            lineM120 = (View) findViewById(R.id.lineM120);
            VlblM120 = (TextView) findViewById(R.id.VlblM120);
            rdogrpM120 = (RadioGroup) findViewById(R.id.rdogrpM120);

            rdoM1201 = (RadioButton) findViewById(R.id.rdoM1201);
            rdoM1202 = (RadioButton) findViewById(R.id.rdoM1202);
            rdoM1203 = (RadioButton) findViewById(R.id.rdoM1203);
            secM121 = (LinearLayout) findViewById(R.id.secM121);
            lineM121 = (View) findViewById(R.id.lineM121);
            VlblM121 = (TextView) findViewById(R.id.VlblM121);
            rdogrpM121 = (RadioGroup) findViewById(R.id.rdogrpM121);

            rdoM1211 = (RadioButton) findViewById(R.id.rdoM1211);
            rdoM1212 = (RadioButton) findViewById(R.id.rdoM1212);
            rdoM1213 = (RadioButton) findViewById(R.id.rdoM1213);


            //Hide all skip variables
            secM17.setVisibility(View.GONE);
            secM18a.setVisibility(View.GONE);
            secM18b.setVisibility(View.GONE);
            secM18c.setVisibility(View.GONE);
            secM110mX.setVisibility(View.GONE);
            secM111a.setVisibility(View.GONE);
            secM111nX.setVisibility(View.GONE);
            //  secM112.setVisibility(View.GONE);
            secM112X.setVisibility(View.GONE);
            secM114X.setVisibility(View.GONE);
            secM116.setVisibility(View.GONE);
            secM117.setVisibility(View.GONE);

            txtRnd.setText(RND);
            txtSuchanaID.setText(SUCHANAID);
            txtRnd.setEnabled(false);
            txtSuchanaID.setEnabled(false);

            DataSearch(RND, SUCHANAID);

            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(PregHis.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(PregHis.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: উপকারভোগী সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (txtM11.getText().toString().length() == 0 & secM11.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: প্রথমবার বিয়ের সময় আপনার বয়স কত ছিল?.");
                txtM11.requestFocus();
                return;
            } else if (Integer.valueOf(txtM11.getText().toString().length() == 0 ? "10" : txtM11.getText().toString()) < 10 || Integer.valueOf(txtM11.getText().toString().length() == 0 ? "80" : txtM11.getText().toString()) > 80) {
                Connection.MessageBox(PregHis.this, "Value should be between 10 and 80(প্রথমবার বিয়ের সময় আপনার বয়স কত ছিল?).");
                txtM11.requestFocus();
                return;
            } else if (txtM12.getText().toString().length() == 0 & secM12.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: প্রথম গর্ভধারণের সময় আপনার বয়স কত ছিল?.");
                txtM12.requestFocus();
                return;
            } else if (Integer.valueOf(txtM12.getText().toString().length() == 0 ? "1" : txtM12.getText().toString()) < 1 || Integer.valueOf(txtM12.getText().toString().length() == 0 ? "60" : txtM12.getText().toString()) > 60) {
                Connection.MessageBox(PregHis.this, "Value should be between 1 and 60(প্রথম গর্ভধারণের সময় আপনার বয়স কত ছিল?).");
                txtM12.requestFocus();
                return;
            } else if (txtM13.getText().toString().length() == 0 & secM13.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: আপনি সর্বমোট কতবার গর্ভধারণ করেছেন?  (সর্বমোট গর্ভধারণের সংখ্যা, গর্ভপাত/MR এবং গর্ভধারণ সহ).");
                txtM13.requestFocus();
                return;
            } else if (Integer.valueOf(txtM13.getText().toString().length() == 0 ? "1" : txtM13.getText().toString()) < 1 || Integer.valueOf(txtM13.getText().toString().length() == 0 ? "30" : txtM13.getText().toString()) > 30) {
                Connection.MessageBox(PregHis.this, "Value should be between 1 and 30(আপনি সর্বমোট কতবার গর্ভধারণ করেছেন?  (সর্বমোট গর্ভধারণের সংখ্যা, গর্ভপাত/MR এবং গর্ভধারণ সহ)).");
                txtM13.requestFocus();
                return;
            } else if (txtM14a.getText().toString().length() == 0 & secM14a.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: জীবিত প্রসব.");
                txtM14a.requestFocus();
                return;
            } else if (Integer.valueOf(txtM14a.getText().toString().length() == 0 ? "0" : txtM14a.getText().toString()) < 0 || Integer.valueOf(txtM14a.getText().toString().length() == 0 ? "30" : txtM14a.getText().toString()) > 30) {
                Connection.MessageBox(PregHis.this, "Value should be between 0 and 30(জীবিত প্রসব).");
                txtM14a.requestFocus();
                return;
            } else if (txtM14b.getText().toString().length() == 0 & secM14b.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: গর্ভপাত.");
                txtM14b.requestFocus();
                return;
            } else if (Integer.valueOf(txtM14b.getText().toString().length() == 0 ? "0" : txtM14b.getText().toString()) < 0 || Integer.valueOf(txtM14b.getText().toString().length() == 0 ? "10" : txtM14b.getText().toString()) > 10) {
                Connection.MessageBox(PregHis.this, "Value should be between 0 and 10(গর্ভপাত).");
                txtM14b.requestFocus();
                return;
            } else if (txtM14c.getText().toString().length() == 0 & secM14c.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: এম,আর (MR).");
                txtM14c.requestFocus();
                return;
            } else if (Integer.valueOf(txtM14c.getText().toString().length() == 0 ? "0" : txtM14c.getText().toString()) < 0 || Integer.valueOf(txtM14c.getText().toString().length() == 0 ? "10" : txtM14c.getText().toString()) > 10) {
                Connection.MessageBox(PregHis.this, "Value should be between 0 and 10(এম,আর (MR)).");
                txtM14c.requestFocus();
                return;
            } else if (txtM14d.getText().toString().length() == 0 & secM14d.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: মৃত প্রসব (still birth).");
                txtM14d.requestFocus();
                return;
            } else if (Integer.valueOf(txtM14d.getText().toString().length() == 0 ? "0" : txtM14d.getText().toString()) < 0 || Integer.valueOf(txtM14d.getText().toString().length() == 0 ? "10" : txtM14d.getText().toString()) > 10) {
                Connection.MessageBox(PregHis.this, "Value should be between 0 and 10(মৃত প্রসব (still birth)).");
                txtM14d.requestFocus();
                return;
            } else if (txtM14e.getText().toString().length() == 0 & secM14e.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: গর্ভে মৃত্যু (IUD).");
                txtM14e.requestFocus();
                return;
            } else if (Integer.valueOf(txtM14e.getText().toString().length() == 0 ? "0" : txtM14e.getText().toString()) < 0 || Integer.valueOf(txtM14e.getText().toString().length() == 0 ? "10" : txtM14e.getText().toString()) > 10) {
                Connection.MessageBox(PregHis.this, "Value should be between 0 and 10(গর্ভে মৃত্যু (IUD)).");
                txtM14e.requestFocus();
                return;
            }
          /*  else if (txtM15a.getText().toString().length() == 0 & secM15a.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: কেউ মারা যায়নি.");
                txtM15a.requestFocus();
                return;
            }
            else if (Integer.valueOf(txtM15a.getText().toString().length() == 0 ? "0" : txtM15a.getText().toString()) < 0 || Integer.valueOf(txtM15a.getText().toString().length() == 0 ? "10" : txtM15a.getText().toString()) > 10) {
                Connection.MessageBox(PregHis.this, "Value should be between 0 and 10(কেউ মারা যায়নি).");
                txtM15a.requestFocus();
                return;
            } */
            else if (txtM15b.getText().toString().length() == 0 & secM15b.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: 1 year এর মধ্যে.");
                txtM15b.requestFocus();
                return;
            } else if (Integer.valueOf(txtM15b.getText().toString().length() == 0 ? "0" : txtM15b.getText().toString()) < 0 || Integer.valueOf(txtM15b.getText().toString().length() == 0 ? "10" : txtM15b.getText().toString()) > 10) {
                Connection.MessageBox(PregHis.this, "Value should be between 0 and 10(1 year এর মধ্যে).");
                txtM15b.requestFocus();
                return;
            } else if (txtM15c.getText().toString().length() == 0 & secM15c.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: 2 year এর মধ্যে.");
                txtM15c.requestFocus();
                return;
            } else if (Integer.valueOf(txtM15c.getText().toString().length() == 0 ? "0" : txtM15c.getText().toString()) < 0 || Integer.valueOf(txtM15c.getText().toString().length() == 0 ? "10" : txtM15c.getText().toString()) > 10) {
                Connection.MessageBox(PregHis.this, "Value should be between 0 and 10(2 year এর মধ্যে).");
                txtM15c.requestFocus();
                return;
            } else if (txtM15d.getText().toString().length() == 0 & secM15d.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: 5 year এর মধ্যে.");
                txtM15d.requestFocus();
                return;
            } else if (Integer.valueOf(txtM15d.getText().toString().length() == 0 ? "0" : txtM15d.getText().toString()) < 0 || Integer.valueOf(txtM15d.getText().toString().length() == 0 ? "10" : txtM15d.getText().toString()) > 10) {
                Connection.MessageBox(PregHis.this, "Value should be between 0 and 10(5 year এর মধ্যে).");
                txtM15d.requestFocus();
                return;
            } else if (txtM15e.getText().toString().length() == 0 & secM15e.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: অনান্য.");
                txtM15e.requestFocus();
                return;
            } else if (Integer.valueOf(txtM15e.getText().toString().length() == 0 ? "0" : txtM15e.getText().toString()) < 0 || Integer.valueOf(txtM15e.getText().toString().length() == 0 ? "10" : txtM15e.getText().toString()) > 10) {
                Connection.MessageBox(PregHis.this, "Value should be between 0 and 10(অনান্য).");
                txtM15e.requestFocus();
                return;
            } else if (txtM15f.getText().toString().length() == 0 & secM15f.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: মোট সংখ্যা.");
                txtM15f.requestFocus();
                return;
            } else if (Integer.valueOf(txtM15f.getText().toString().length() == 0 ? "0" : txtM15f.getText().toString()) < 0 || Integer.valueOf(txtM15f.getText().toString().length() == 0 ? "99" : txtM15f.getText().toString()) > 99) {
                Connection.MessageBox(PregHis.this, "Value should be between 0 and 99(মোট সংখ্যা).");
                txtM15f.requestFocus();
                return;
            } else if (!rdoM161.isChecked() & !rdoM162.isChecked() & !rdoM163.isChecked() & secM16.isShown()) {
                Connection.MessageBox(PregHis.this, "Select anyone options from (আপনি কি সর্বশেষ গর্ভাবস্তায় আয়রন-ফলিক এসিড খেয়েছিলেন? ).");
                rdoM161.requestFocus();
                return;
            } else if (txtM17.getText().toString().length() == 0 & secM17.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: গর্ভাবস্তায় আয়রন-ফলিক এসিড খেয়ে থাকলে কবে শুরু করেছিলেন?.");
                txtM17.requestFocus();
                return;
            } else if (Integer.valueOf(txtM17.getText().toString().length() == 0 ? "1" : txtM17.getText().toString()) < 1 || Integer.valueOf(txtM17.getText().toString().length() == 0 ? "99" : txtM17.getText().toString()) > 99) {
                Connection.MessageBox(PregHis.this, "Value should be between 1 and 99(গর্ভাবস্তায় আয়রন-ফলিক এসিড খেয়ে থাকলে কবে শুরু করেছিলেন?).");
                txtM17.requestFocus();
                return;
            } else if (txtM18a.getText().toString().length() == 0 & secM18a.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: 1st ট্রাইমেস্টার.");
                txtM18a.requestFocus();
                return;
            } else if (Integer.valueOf(txtM18a.getText().toString().length() == 0 ? "0" : txtM18a.getText().toString()) < 0 || Integer.valueOf(txtM18a.getText().toString().length() == 0 ? "400" : txtM18a.getText().toString()) > 400) {
                Connection.MessageBox(PregHis.this, "Value should be between 0 and 400(1st ট্রাইমেস্টার).");
                txtM18a.requestFocus();
                return;
            } else if (txtM18b.getText().toString().length() == 0 & secM18b.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: 2nd ট্রাইমেস্টার.");
                txtM18b.requestFocus();
                return;
            } else if (Integer.valueOf(txtM18b.getText().toString().length() == 0 ? "0" : txtM18b.getText().toString()) < 0 || Integer.valueOf(txtM18b.getText().toString().length() == 0 ? "400" : txtM18b.getText().toString()) > 400) {
                Connection.MessageBox(PregHis.this, "Value should be between 0 and 400(2nd ট্রাইমেস্টার).");
                txtM18b.requestFocus();
                return;
            } else if (txtM18c.getText().toString().length() == 0 & secM18c.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: 3rd ট্রাইমেস্টার.");
                txtM18c.requestFocus();
                return;
            } else if (Integer.valueOf(txtM18c.getText().toString().length() == 0 ? "0" : txtM18c.getText().toString()) < 0 || Integer.valueOf(txtM18c.getText().toString().length() == 0 ? "400" : txtM18c.getText().toString()) > 400) {
                Connection.MessageBox(PregHis.this, "Value should be between 0 and 400(3rd ট্রাইমেস্টার).");
                txtM18c.requestFocus();
                return;
            } else if (txtM19.getText().toString().length() == 0 & secM19.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: আপনার ছোট শিশুটির ক্ষেত্রে গর্ভাবস্তার সময় আপনি কতবার স্বাস্থ্য পরীক্ষার জন্য গিয়েছিলেন ? (ANC).");
                txtM19.requestFocus();
                return;
            } else if (Integer.valueOf(txtM19.getText().toString().length() == 0 ? "0" : txtM19.getText().toString()) < 0 || Integer.valueOf(txtM19.getText().toString().length() == 0 ? "25" : txtM19.getText().toString()) > 25) {
                Connection.MessageBox(PregHis.this, "Value should be between 0 and 25(আপনার ছোট শিশুটির ক্ষেত্রে গর্ভাবস্তার সময় আপনি কতবার স্বাস্থ্য পরীক্ষার জন্য গিয়েছিলেন ? (ANC)).");
                txtM19.requestFocus();
                return;
            } else if (txtM110mX.getText().toString().length() == 0 & secM110mX.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtM110mX.requestFocus();
                return;
            } else if (txtM111nX.getText().toString().length() == 0 & secM111nX.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtM111nX.requestFocus();
                return;
            } else if (spnM112.getSelectedItemPosition() == 0 & secM112.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: সর্বশেষ শিশুর ডেলিভারি/প্রসব কে করিয়েছেন?.");
                spnM112.requestFocus();
                return;
            } else if (txtM112X.getText().toString().length() == 0 & secM112X.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtM112X.requestFocus();
                return;
            } else if (spnM113.getSelectedItemPosition() == 0 & secM113.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: কিভাবে প্রসবটি সম্পন্ন হয়েছিল?.");
                spnM113.requestFocus();
                return;
            } else if (spnM114.getSelectedItemPosition() == 0 & secM114.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: আপনার শেষ বাচ্চাটির প্রসব কোথায় হয়েছিল?.");
                spnM114.requestFocus();
                return;
            } else if (txtM114X.getText().toString().length() == 0 & secM114X.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtM114X.requestFocus();
                return;
            } else if (!rdoM1151.isChecked() & !rdoM1152.isChecked() & !rdoM1153.isChecked() & secM115.isShown()) {
                Connection.MessageBox(PregHis.this, "Select anyone options from (সর্বশেষ শিশুর ক্ষেত্রে আপনি কি কোনো গর্ভ পরবর্তী সেবা (PNC) পেয়েছিলেন? ).");
                rdoM1151.requestFocus();
                return;
            } else if (txtM116.getText().toString().length() == 0 & secM116.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: কতবার পেয়েছিলেন?.");
                txtM116.requestFocus();
                return;
            } else if (Integer.valueOf(txtM116.getText().toString().length() == 0 ? "1" : txtM116.getText().toString()) < 1 || Integer.valueOf(txtM116.getText().toString().length() == 0 ? "50" : txtM116.getText().toString()) > 50) {
                Connection.MessageBox(PregHis.this, "Value should be between 1 and 50(কতবার পেয়েছিলেন?).");
                txtM116.requestFocus();
                return;
            } else if (txtM117.getText().toString().length() == 0 & secM117.isShown()) {
                Connection.MessageBox(PregHis.this, "Required field: ডেলিভারির কতদিন পর আপনি গর্ভ পরবর্তী সেবা (PNC) পেয়েছিলেন?.");
                txtM117.requestFocus();
                return;
            } else if (Integer.valueOf(txtM117.getText().toString().length() == 0 ? "0" : txtM117.getText().toString()) < 0 || Integer.valueOf(txtM117.getText().toString().length() == 0 ? "999" : txtM117.getText().toString()) > 999) {
                Connection.MessageBox(PregHis.this, "Value should be between 0 and 999(ডেলিভারির কতদিন পর আপনি গর্ভ পরবর্তী সেবা (PNC) পেয়েছিলেন?).");
                txtM117.requestFocus();
                return;
            } else if (!rdoM1181.isChecked() & !rdoM1182.isChecked() & !rdoM1183.isChecked() & secM118.isShown()) {
                Connection.MessageBox(PregHis.this, "Select anyone options from (আপনাকে কি সর্বশেষ ডেলিভারির পর ভিটামিন এ ক্যাপসুল দেয়া  হয়েছিল? (ডেলিভারির 45 Days এর মধ্যে)? ).");
                rdoM1181.requestFocus();
                return;
            } else if (!rdoM1191.isChecked() & !rdoM1192.isChecked() & !rdoM1193.isChecked() & secM119.isShown()) {
                Connection.MessageBox(PregHis.this, "Select anyone options from (আপনি কি আপনার  শেষ গর্ভধারণের সময় কোনো ধনুষ্টঙ্কারের টিকা (TT vaccine) পেয়েছিলেন?).");
                rdoM1191.requestFocus();
                return;
            } else if (!rdoM1201.isChecked() & !rdoM1202.isChecked() & !rdoM1203.isChecked() & secM120.isShown()) {
                Connection.MessageBox(PregHis.this, "Select anyone options from (আপনি কি আপনার শেষ গর্ভাবস্থার সময় সাধারণ সময়ের তুলনায় বেশি, একই রকম অথবা কম খেয়েছেন?   ).");
                rdoM1201.requestFocus();
                return;
            } else if (!rdoM1211.isChecked() & !rdoM1212.isChecked() & !rdoM1213.isChecked() & secM121.isShown()) {
                Connection.MessageBox(PregHis.this, "Select anyone options from (আপনি কি আপনার শেষ গর্ভাবস্থার সময় দিনের বেলায় সাধারণ সময়ের তুলনায় বেশি, একই রকম অথবা কম বিশ্রাম নিয়েছেন?   ).");
                rdoM1211.requestFocus();
                return;
            }

            if((Integer.valueOf(Integer.valueOf(txtM15b.getText().toString().length() == 0 ? "0" : txtM15b.getText().toString())+Integer.valueOf(txtM15c.getText().toString().length() == 0 ? "0" : txtM15c.getText().toString())+Integer.valueOf(txtM15d.getText().toString().length() == 0 ? "0" : txtM15d.getText().toString())+Integer.valueOf(txtM15e.getText().toString().length() == 0 ? "0" : txtM15e.getText().toString())) != Integer.valueOf(txtM15f.getText().toString().length() == 0 ? "0" : txtM15f.getText().toString())))
            {
                Connection.MessageBox(PregHis.this, "Inconsistent in total value.M15");
                return;
            }

            String SQL = "";
            RadioButton rb;

            PregHis_DataModel objSave = new PregHis_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setM11(txtM11.getText().toString());
            objSave.setM12(txtM12.getText().toString());
            objSave.setM13(txtM13.getText().toString());
            objSave.setM14a(txtM14a.getText().toString());
            objSave.setM14b(txtM14b.getText().toString());
            objSave.setM14c(txtM14c.getText().toString());
            objSave.setM14d(txtM14d.getText().toString());
            objSave.setM14e(txtM14e.getText().toString());
            objSave.setM15a((chkM15a.isChecked() ? "1" : "2"));
            objSave.setM15b(txtM15b.getText().toString());
            objSave.setM15c(txtM15c.getText().toString());
            objSave.setM15d(txtM15d.getText().toString());
            objSave.setM15e(txtM15e.getText().toString());

            objSave.setM15f(txtM15f.getText().toString());
            String[] d_rdogrpM16 = new String[]{"1", "0", "8"};
            objSave.setM16("");
            for (int i = 0; i < rdogrpM16.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM16.getChildAt(i);
                if (rb.isChecked()) objSave.setM16(d_rdogrpM16[i]);
            }

            objSave.setM17(txtM17.getText().toString());
            objSave.setM18a(txtM18a.getText().toString());
            objSave.setM18b(txtM18b.getText().toString());
            objSave.setM18c(txtM18c.getText().toString());
            objSave.setM19(txtM19.getText().toString());
            objSave.setM110a((chkM110a.isChecked() ? "1" : "2"));
            objSave.setM110b((chkM110b.isChecked() ? "1" : "2"));
            objSave.setM110c((chkM110c.isChecked() ? "1" : "2"));
            objSave.setM110d((chkM110d.isChecked() ? "1" : "2"));
            objSave.setM110e((chkM110e.isChecked() ? "1" : "2"));
            objSave.setM110f((chkM110f.isChecked() ? "1" : "2"));
            objSave.setM110g((chkM110g.isChecked() ? "1" : "2"));
            objSave.setM110h((chkM110h.isChecked() ? "1" : "2"));
            objSave.setM110i((chkM110i.isChecked() ? "1" : "2"));
            objSave.setM110j((chkM110j.isChecked() ? "1" : "2"));
            objSave.setM110k((chkM110k.isChecked() ? "1" : "2"));
            objSave.setM110l((chkM110l.isChecked() ? "1" : "2"));
            objSave.setM110m((chkM110m.isChecked() ? "1" : "2"));
            objSave.setM110mX(txtM110mX.getText().toString());
            objSave.setM111a((chkM111a.isChecked() ? "1" : "2"));
            objSave.setM111b((chkM111b.isChecked() ? "1" : "2"));
            objSave.setM111c((chkM111c.isChecked() ? "1" : "2"));
            objSave.setM111d((chkM111d.isChecked() ? "1" : "2"));
            objSave.setM111e((chkM111e.isChecked() ? "1" : "2"));
            objSave.setM111f((chkM111f.isChecked() ? "1" : "2"));
            objSave.setM111g((chkM111g.isChecked() ? "1" : "2"));
            objSave.setM111h((chkM111h.isChecked() ? "1" : "2"));
            objSave.setM111i((chkM111i.isChecked() ? "1" : "2"));
            objSave.setM111j((chkM111j.isChecked() ? "1" : "2"));
            objSave.setM111k((chkM111k.isChecked() ? "1" : "2"));
            objSave.setM111l((chkM111l.isChecked() ? "1" : "2"));
            objSave.setM111m((chkM111m.isChecked() ? "1" : "2"));
            objSave.setM111n((chkM111n.isChecked() ? "1" : "2"));
            objSave.setM111nX(txtM111nX.getText().toString());
            objSave.setM112((spnM112.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM112.getSelectedItem().toString(), "-")));
            objSave.setM112X(txtM112X.getText().toString());
            objSave.setM113((spnM113.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM113.getSelectedItem().toString(), "-")));
            objSave.setM114((spnM114.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM114.getSelectedItem().toString(), "-")));
            objSave.setM114X(txtM114X.getText().toString());
            String[] d_rdogrpM115 = new String[]{"1", "2", "0"};
            objSave.setM115("");
            for (int i = 0; i < rdogrpM115.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM115.getChildAt(i);
                if (rb.isChecked()) objSave.setM115(d_rdogrpM115[i]);
            }

            objSave.setM116(txtM116.getText().toString());
            objSave.setM117(txtM117.getText().toString());
            String[] d_rdogrpM118 = new String[]{"1", "2", "0"};
            objSave.setM118("");
            for (int i = 0; i < rdogrpM118.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM118.getChildAt(i);
                if (rb.isChecked()) objSave.setM118(d_rdogrpM118[i]);
            }

            String[] d_rdogrpM119 = new String[]{"1", "0", "9"};
            objSave.setM119("");
            for (int i = 0; i < rdogrpM119.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM119.getChildAt(i);
                if (rb.isChecked()) objSave.setM119(d_rdogrpM119[i]);
            }

            String[] d_rdogrpM120 = new String[]{"1", "2", "3"};
            objSave.setM120("");
            for (int i = 0; i < rdogrpM120.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM120.getChildAt(i);
                if (rb.isChecked()) objSave.setM120(d_rdogrpM120[i]);
            }

            String[] d_rdogrpM121 = new String[]{"1", "2", "3"};
            objSave.setM121("");
            for (int i = 0; i < rdogrpM121.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM121.getChildAt(i);
                if (rb.isChecked()) objSave.setM121(d_rdogrpM121[i]);
            }
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
                startActivity(new Intent(PregHis.this, Knowledge.class).putExtras(IDBundle));

            } else {
                Connection.MessageBox(PregHis.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(PregHis.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            PregHis_DataModel d = new PregHis_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<PregHis_DataModel> data = d.SelectAll(this, SQL);
            for (PregHis_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                txtM11.setText(item.getM11());
                txtM12.setText(item.getM12());
                txtM13.setText(item.getM13());
                txtM14a.setText(item.getM14a());
                txtM14b.setText(item.getM14b());
                txtM14c.setText(item.getM14c());
                txtM14d.setText(item.getM14d());
                txtM14e.setText(item.getM14e());

                if (item.getM15a().equals("1")) {
                    chkM15a.setChecked(true);
                } else if (item.getM15a().equals("2")) {
                    chkM15a.setChecked(false);
                }

                txtM15b.setText(item.getM15b());
                txtM15c.setText(item.getM15c());
                txtM15d.setText(item.getM15d());
                txtM15e.setText(item.getM15e());

                txtM15f.setText(item.getM15f());
                String[] d_rdogrpM16 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpM16.length; i++) {
                    if (item.getM16().equals(String.valueOf(d_rdogrpM16[i]))) {
                        rb = (RadioButton) rdogrpM16.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtM17.setText(item.getM17());
                txtM18a.setText(item.getM18a());
                txtM18b.setText(item.getM18b());
                txtM18c.setText(item.getM18c());
                txtM19.setText(item.getM19());
                if (item.getM110a().equals("1")) {
                    chkM110a.setChecked(true);
                } else if (item.getM110a().equals("2")) {
                    chkM110a.setChecked(false);
                }
                if (item.getM110b().equals("1")) {
                    chkM110b.setChecked(true);
                } else if (item.getM110b().equals("2")) {
                    chkM110b.setChecked(false);
                }
                if (item.getM110c().equals("1")) {
                    chkM110c.setChecked(true);
                } else if (item.getM110c().equals("2")) {
                    chkM110c.setChecked(false);
                }
                if (item.getM110d().equals("1")) {
                    chkM110d.setChecked(true);
                } else if (item.getM110d().equals("2")) {
                    chkM110d.setChecked(false);
                }
                if (item.getM110e().equals("1")) {
                    chkM110e.setChecked(true);
                } else if (item.getM110e().equals("2")) {
                    chkM110e.setChecked(false);
                }
                if (item.getM110f().equals("1")) {
                    chkM110f.setChecked(true);
                } else if (item.getM110f().equals("2")) {
                    chkM110f.setChecked(false);
                }
                if (item.getM110g().equals("1")) {
                    chkM110g.setChecked(true);
                } else if (item.getM110g().equals("2")) {
                    chkM110g.setChecked(false);
                }
                if (item.getM110h().equals("1")) {
                    chkM110h.setChecked(true);
                } else if (item.getM110h().equals("2")) {
                    chkM110h.setChecked(false);
                }
                if (item.getM110i().equals("1")) {
                    chkM110i.setChecked(true);
                } else if (item.getM110i().equals("2")) {
                    chkM110i.setChecked(false);
                }
                if (item.getM110j().equals("1")) {
                    chkM110j.setChecked(true);
                } else if (item.getM110j().equals("2")) {
                    chkM110j.setChecked(false);
                }
                if (item.getM110k().equals("1")) {
                    chkM110k.setChecked(true);
                } else if (item.getM110k().equals("2")) {
                    chkM110k.setChecked(false);
                }
                if (item.getM110l().equals("1")) {
                    chkM110l.setChecked(true);
                } else if (item.getM110l().equals("2")) {
                    chkM110l.setChecked(false);
                }
                if (item.getM110m().equals("1")) {
                    chkM110m.setChecked(true);
                } else if (item.getM110m().equals("2")) {
                    chkM110m.setChecked(false);
                }
                txtM110mX.setText(item.getM110mX());
                if (item.getM111a().equals("1")) {
                    chkM111a.setChecked(true);
                } else if (item.getM111a().equals("2")) {
                    chkM111a.setChecked(false);
                }
                if (item.getM111b().equals("1")) {
                    chkM111b.setChecked(true);
                } else if (item.getM111b().equals("2")) {
                    chkM111b.setChecked(false);
                }
                if (item.getM111c().equals("1")) {
                    chkM111c.setChecked(true);
                } else if (item.getM111c().equals("2")) {
                    chkM111c.setChecked(false);
                }
                if (item.getM111d().equals("1")) {
                    chkM111d.setChecked(true);
                } else if (item.getM111d().equals("2")) {
                    chkM111d.setChecked(false);
                }
                if (item.getM111e().equals("1")) {
                    chkM111e.setChecked(true);
                } else if (item.getM111e().equals("2")) {
                    chkM111e.setChecked(false);
                }
                if (item.getM111f().equals("1")) {
                    chkM111f.setChecked(true);
                } else if (item.getM111f().equals("2")) {
                    chkM111f.setChecked(false);
                }
                if (item.getM111g().equals("1")) {
                    chkM111g.setChecked(true);
                } else if (item.getM111g().equals("2")) {
                    chkM111g.setChecked(false);
                }
                if (item.getM111h().equals("1")) {
                    chkM111h.setChecked(true);
                } else if (item.getM111h().equals("2")) {
                    chkM111h.setChecked(false);
                }
                if (item.getM111i().equals("1")) {
                    chkM111i.setChecked(true);
                } else if (item.getM111i().equals("2")) {
                    chkM111i.setChecked(false);
                }
                if (item.getM111j().equals("1")) {
                    chkM111j.setChecked(true);
                } else if (item.getM111j().equals("2")) {
                    chkM111j.setChecked(false);
                }
                if (item.getM111k().equals("1")) {
                    chkM111k.setChecked(true);
                } else if (item.getM111k().equals("2")) {
                    chkM111k.setChecked(false);
                }
                if (item.getM111l().equals("1")) {
                    chkM111l.setChecked(true);
                } else if (item.getM111l().equals("2")) {
                    chkM111l.setChecked(false);
                }
                if (item.getM111m().equals("1")) {
                    chkM111m.setChecked(true);
                } else if (item.getM111m().equals("2")) {
                    chkM111m.setChecked(false);
                }
                if (item.getM111n().equals("1")) {
                    chkM111n.setChecked(true);
                } else if (item.getM111n().equals("2")) {
                    chkM111n.setChecked(false);
                }
                txtM111nX.setText(item.getM111nX());
                spnM112.setSelection(Global.SpinnerItemPositionAnyLength(spnM112, item.getM112()));
                txtM112X.setText(item.getM112X());
                spnM113.setSelection(Global.SpinnerItemPositionAnyLength(spnM113, item.getM113()));
                spnM114.setSelection(Global.SpinnerItemPositionAnyLength(spnM114, item.getM114()));
                txtM114X.setText(item.getM114X());
                String[] d_rdogrpM115 = new String[]{"1", "2", "0"};
                for (int i = 0; i < d_rdogrpM115.length; i++) {
                    if (item.getM115().equals(String.valueOf(d_rdogrpM115[i]))) {
                        rb = (RadioButton) rdogrpM115.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtM116.setText(item.getM116());
                txtM117.setText(item.getM117());
                String[] d_rdogrpM118 = new String[]{"1", "2", "0"};
                for (int i = 0; i < d_rdogrpM118.length; i++) {
                    if (item.getM118().equals(String.valueOf(d_rdogrpM118[i]))) {
                        rb = (RadioButton) rdogrpM118.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM119 = new String[]{"1", "0", "9"};
                for (int i = 0; i < d_rdogrpM119.length; i++) {
                    if (item.getM119().equals(String.valueOf(d_rdogrpM119[i]))) {
                        rb = (RadioButton) rdogrpM119.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM120 = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpM120.length; i++) {
                    if (item.getM120().equals(String.valueOf(d_rdogrpM120[i]))) {
                        rb = (RadioButton) rdogrpM120.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM121 = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpM121.length; i++) {
                    if (item.getM121().equals(String.valueOf(d_rdogrpM121[i]))) {
                        rb = (RadioButton) rdogrpM121.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
            }
        } catch (Exception e) {
            Connection.MessageBox(PregHis.this, e.getMessage());
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
        currentLocation  = location;
        currentLatitude  = currentLocation.getLatitude();
        currentLongitude = currentLocation.getLongitude();
    }


    // Method to turn on GPS
    public void turnGPSOn(){
        try
        {
            String provider = Settings.Secure.getString(getContentResolver(), Settings.Secure.LOCATION_PROVIDERS_ALLOWED);
            if(!provider.contains("gps")){ //if gps is disabled
                final Intent poke = new Intent();
                poke.setClassName("com.android.settings", "com.android.settings.widget.SettingsAppWidgetProvider");
                poke.addCategory(Intent.CATEGORY_ALTERNATIVE);
                poke.setData(Uri.parse("3"));
                sendBroadcast(poke);
            }
        }
        catch (Exception e) {
        }
    }

    // Method to turn off the GPS
    public void turnGPSOff(){
        String provider = Settings.Secure.getString(getContentResolver(), Settings.Secure.LOCATION_PROVIDERS_ALLOWED);

        if(provider.contains("gps")){ //if gps is enabled
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