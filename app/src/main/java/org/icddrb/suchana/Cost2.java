package org.icddrb.suchana;
//Android Manifest Code
//<activity android:name=".Cost2" android:label="Cost2" />

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

public class Cost2 extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    static String MSLNO = "";
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
    LinearLayout secLBH87;
    LinearLayout secH871a;
    View lineH871a;
    TextView VlblH871a;
    RadioGroup rdogrpH871a;
    RadioButton rdoH871a1;
    RadioButton rdoH871a2;
    LinearLayout secH871b;
    View lineH871b;
    TextView VlblH871b;
    EditText txtH871b;
    LinearLayout secH871c;
    View lineH871c;
    TextView VlblH871c;
    RadioGroup rdogrpH871c;
    RadioButton rdoH871c1;
    RadioButton rdoH871c2;
    RadioButton rdoH871c3;
    LinearLayout secH871d;
    View lineH871d;
    TextView VlblH871d;
    EditText txtH871d;
    LinearLayout secH872a;
    View lineH872a;
    TextView VlblH872a;
    RadioGroup rdogrpH872a;
    RadioButton rdoH872a1;
    RadioButton rdoH872a2;
    LinearLayout secH872b;
    View lineH872b;
    TextView VlblH872b;
    EditText txtH872b;
    LinearLayout secH872c;
    View lineH872c;
    TextView VlblH872c;
    RadioGroup rdogrpH872c;
    RadioButton rdoH872c1;
    RadioButton rdoH872c2;
    RadioButton rdoH872c3;
    LinearLayout secH872d;
    View lineH872d;
    TextView VlblH872d;
    EditText txtH872d;
    LinearLayout secH873a;
    View lineH873a;
    TextView VlblH873a;
    RadioGroup rdogrpH873a;
    RadioButton rdoH873a1;
    RadioButton rdoH873a2;
    LinearLayout secH873b;
    View lineH873b;
    TextView VlblH873b;
    EditText txtH873b;
    LinearLayout secH873c;
    View lineH873c;
    TextView VlblH873c;
    RadioGroup rdogrpH873c;
    RadioButton rdoH873c1;
    RadioButton rdoH873c2;
    RadioButton rdoH873c3;
    LinearLayout secH873d;
    View lineH873d;
    TextView VlblH873d;
    EditText txtH873d;
    LinearLayout secH874a;
    View lineH874a;
    TextView VlblH874a;
    RadioGroup rdogrpH874a;
    RadioButton rdoH874a1;
    RadioButton rdoH874a2;
    LinearLayout secH874b;
    View lineH874b;
    TextView VlblH874b;
    EditText txtH874b;
    LinearLayout secH874c;
    View lineH874c;
    TextView VlblH874c;
    RadioGroup rdogrpH874c;
    RadioButton rdoH874c1;
    RadioButton rdoH874c2;
    RadioButton rdoH874c3;
    LinearLayout secH874d;
    View lineH874d;
    TextView VlblH874d;
    EditText txtH874d;
    LinearLayout secH875a;
    View lineH875a;
    TextView VlblH875a;
    RadioGroup rdogrpH875a;
    RadioButton rdoH875a1;
    RadioButton rdoH875a2;
    LinearLayout secH875b;
    View lineH875b;
    TextView VlblH875b;
    EditText txtH875b;
    LinearLayout secH875c;
    View lineH875c;
    TextView VlblH875c;
    RadioGroup rdogrpH875c;
    RadioButton rdoH875c1;
    RadioButton rdoH875c2;
    RadioButton rdoH875c3;
    LinearLayout secH875d;
    View lineH875d;
    TextView VlblH875d;
    EditText txtH875d;
    LinearLayout secLBH88;
    LinearLayout secH881a;
    View lineH881a;
    TextView VlblH881a;
    RadioGroup rdogrpH881a;
    RadioButton rdoH881a1;
    RadioButton rdoH881a2;
    LinearLayout secH881b;
    View lineH881b;
    TextView VlblH881b;
    EditText txtH881b;
    LinearLayout secH881c;
    View lineH881c;
    TextView VlblH881c;
    RadioGroup rdogrpH881c;
    RadioButton rdoH881c1;
    RadioButton rdoH881c2;
    RadioButton rdoH881c3;
    LinearLayout secH881d;
    View lineH881d;
    TextView VlblH881d;
    EditText txtH881d;
    LinearLayout secH882a;
    View lineH882a;
    TextView VlblH882a;
    RadioGroup rdogrpH882a;
    RadioButton rdoH882a1;
    RadioButton rdoH882a2;
    LinearLayout secH882b;
    View lineH882b;
    TextView VlblH882b;
    EditText txtH882b;
    LinearLayout secH882c;
    View lineH882c;
    TextView VlblH882c;
    RadioGroup rdogrpH882c;
    RadioButton rdoH882c1;
    RadioButton rdoH882c2;
    RadioButton rdoH882c3;
    LinearLayout secH882d;
    View lineH882d;
    TextView VlblH882d;
    EditText txtH882d;
    LinearLayout secH883a;
    View lineH883a;
    TextView VlblH883a;
    RadioGroup rdogrpH883a;
    RadioButton rdoH883a1;
    RadioButton rdoH883a2;
    LinearLayout secH883b;
    View lineH883b;
    TextView VlblH883b;
    EditText txtH883b;
    LinearLayout secH883c;
    View lineH883c;
    TextView VlblH883c;
    RadioGroup rdogrpH883c;
    RadioButton rdoH883c1;
    RadioButton rdoH883c2;
    RadioButton rdoH883c3;
    LinearLayout secH883d;
    View lineH883d;
    TextView VlblH883d;
    EditText txtH883d;
    LinearLayout secH884a;
    View lineH884a;
    TextView VlblH884a;
    RadioGroup rdogrpH884a;
    RadioButton rdoH884a1;
    RadioButton rdoH884a2;
    LinearLayout secH884b;
    View lineH884b;
    TextView VlblH884b;
    EditText txtH884b;
    LinearLayout secH884c;
    View lineH884c;
    TextView VlblH884c;
    RadioGroup rdogrpH884c;
    RadioButton rdoH884c1;
    RadioButton rdoH884c2;
    RadioButton rdoH884c3;
    LinearLayout secH884d;
    View lineH884d;
    TextView VlblH884d;
    EditText txtH884d;
    LinearLayout secH885a;
    View lineH885a;
    TextView VlblH885a;
    RadioGroup rdogrpH885a;
    RadioButton rdoH885a1;
    RadioButton rdoH885a2;
    LinearLayout secH885b;
    View lineH885b;
    TextView VlblH885b;
    EditText txtH885b;
    LinearLayout secH885c;
    View lineH885c;
    TextView VlblH885c;
    RadioGroup rdogrpH885c;
    RadioButton rdoH885c1;
    RadioButton rdoH885c2;
    RadioButton rdoH885c3;
    LinearLayout secH885d;
    View lineH885d;
    TextView VlblH885d;
    EditText txtH885d;
    LinearLayout secLBH89;
    LinearLayout secH891a;
    View lineH891a;
    TextView VlblH891a;
    RadioGroup rdogrpH891a;
    RadioButton rdoH891a1;
    RadioButton rdoH891a2;
    LinearLayout secH891b;
    View lineH891b;
    TextView VlblH891b;
    EditText txtH891b;
    LinearLayout secH891c;
    View lineH891c;
    TextView VlblH891c;
    RadioGroup rdogrpH891c;
    RadioButton rdoH891c1;
    RadioButton rdoH891c2;
    RadioButton rdoH891c3;
    LinearLayout secH891d;
    View lineH891d;
    TextView VlblH891d;
    EditText txtH891d;
    LinearLayout secLBH810;
    LinearLayout secH8101a;
    View lineH8101a;
    TextView VlblH8101a;
    RadioGroup rdogrpH8101a;
    RadioButton rdoH8101a1;
    RadioButton rdoH8101a2;
    LinearLayout secH8101b;
    View lineH8101b;
    TextView VlblH8101b;
    EditText txtH8101b;
    LinearLayout secH8101c;
    View lineH8101c;
    TextView VlblH8101c;
    RadioGroup rdogrpH8101c;
    RadioButton rdoH8101c1;
    RadioButton rdoH8101c2;
    RadioButton rdoH8101c3;
    LinearLayout secH8101d;
    View lineH8101d;
    TextView VlblH8101d;
    EditText txtH8101d;
    LinearLayout secH8102a;
    View lineH8102a;
    TextView VlblH8102a;
    RadioGroup rdogrpH8102a;
    RadioButton rdoH8102a1;
    RadioButton rdoH8102a2;
    LinearLayout secH8102b;
    View lineH8102b;
    TextView VlblH8102b;
    EditText txtH8102b;
    LinearLayout secH8102c;
    View lineH8102c;
    TextView VlblH8102c;
    RadioGroup rdogrpH8102c;
    RadioButton rdoH8102c1;
    RadioButton rdoH8102c2;
    RadioButton rdoH8102c3;
    LinearLayout secH8102d;
    View lineH8102d;
    TextView VlblH8102d;
    EditText txtH8102d;
    LinearLayout secH8103a;
    View lineH8103a;
    TextView VlblH8103a;
    RadioGroup rdogrpH8103a;
    RadioButton rdoH8103a1;
    RadioButton rdoH8103a2;
    LinearLayout secH8103b;
    View lineH8103b;
    TextView VlblH8103b;
    EditText txtH8103b;
    LinearLayout secH8103c;
    View lineH8103c;
    TextView VlblH8103c;
    RadioGroup rdogrpH8103c;
    RadioButton rdoH8103c1;
    RadioButton rdoH8103c2;
    RadioButton rdoH8103c3;
    LinearLayout secH8103d;
    View lineH8103d;
    TextView VlblH8103d;
    EditText txtH8103d;
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


            //   dtpDate.setText(new StringBuilder()
            //           .append(Global.Right("00"+mDay,2)).append("/")
            //           .append(Global.Right("00"+mMonth,2)).append("/")
            //          .append(mYear));
        }
    };
    private TimePickerDialog.OnTimeSetListener timePickerListener = new TimePickerDialog.OnTimeSetListener() {
        public void onTimeSet(TimePicker view, int selectedHour, int selectedMinute) {
            hour = selectedHour;
            minute = selectedMinute;
            EditText tpTime;


            //  tpTime.setText(new StringBuilder().append(Global.Right("00"+hour,2)).append(":").append(Global.Right("00"+minute,2)));

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
            setContentView(R.layout.cost2);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");


            TableName = "Cost";

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
                    AlertDialog.Builder adb = new AlertDialog.Builder(Cost2.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                           /* finish();
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Cost1.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDbundle);
                            getApplicationContext().startActivity(intent);*/

                        }
                    });
                    adb.show();
                }
            });
            ImageButton cmdForward = (ImageButton) findViewById(R.id.cmdForward);
            cmdForward.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Cost2.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to return to Home [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Cost3.class);
                            intent.putExtras(IDbundle);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            getApplicationContext().startActivity(intent);
                            finish();
                        }
                    });
                    adb.show();
                }
            });

        //    ImageButton cmdHome = (ImageButton) findViewById(R.id.cmdHome);
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
            secMSlNo = (LinearLayout) findViewById(R.id.secMSlNo);
            lineMSlNo = (View) findViewById(R.id.lineMSlNo);
            VlblMSlNo = (TextView) findViewById(R.id.VlblMSlNo);
            spnMSlNo = (Spinner) findViewById(R.id.spnMSlNo);
            spnMSlNo.setAdapter(C.getArrayAdapter("select H21 ||'-'||H22 from member"));
            secLBH87 = (LinearLayout) findViewById(R.id.secLBH87);
            secH871a = (LinearLayout) findViewById(R.id.secH871a);
            lineH871a = (View) findViewById(R.id.lineH871a);
            VlblH871a = (TextView) findViewById(R.id.VlblH871a);
            rdogrpH871a = (RadioGroup) findViewById(R.id.rdogrpH871a);

            rdoH871a1 = (RadioButton) findViewById(R.id.rdoH871a1);
            rdoH871a2 = (RadioButton) findViewById(R.id.rdoH871a2);
            rdogrpH871a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH871a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH871a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH871a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH871a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH871b.setVisibility(View.GONE);
                        lineH871b.setVisibility(View.GONE);
                        txtH871b.setText("");
                        secH871c.setVisibility(View.GONE);
                        lineH871c.setVisibility(View.GONE);
                        rdogrpH871c.clearCheck();
                        secH871d.setVisibility(View.GONE);
                        lineH871d.setVisibility(View.GONE);
                        txtH871d.setText("");
                    } else {
                        secH871b.setVisibility(View.VISIBLE);
                        lineH871b.setVisibility(View.VISIBLE);
                        secH871c.setVisibility(View.VISIBLE);
                        lineH871c.setVisibility(View.VISIBLE);
                        secH871d.setVisibility(View.VISIBLE);
                        lineH871d.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH871b = (LinearLayout) findViewById(R.id.secH871b);
            lineH871b = (View) findViewById(R.id.lineH871b);
            VlblH871b = (TextView) findViewById(R.id.VlblH871b);
            txtH871b = (EditText) findViewById(R.id.txtH871b);
            secH871c = (LinearLayout) findViewById(R.id.secH871c);
            lineH871c = (View) findViewById(R.id.lineH871c);
            VlblH871c = (TextView) findViewById(R.id.VlblH871c);
            rdogrpH871c = (RadioGroup) findViewById(R.id.rdogrpH871c);

            rdoH871c1 = (RadioButton) findViewById(R.id.rdoH871c1);
            rdoH871c2 = (RadioButton) findViewById(R.id.rdoH871c2);
            rdoH871c3 = (RadioButton) findViewById(R.id.rdoH871c3);
            secH871d = (LinearLayout) findViewById(R.id.secH871d);
            lineH871d = (View) findViewById(R.id.lineH871d);
            VlblH871d = (TextView) findViewById(R.id.VlblH871d);
            txtH871d = (EditText) findViewById(R.id.txtH871d);
            secH872a = (LinearLayout) findViewById(R.id.secH872a);
            lineH872a = (View) findViewById(R.id.lineH872a);
            VlblH872a = (TextView) findViewById(R.id.VlblH872a);
            rdogrpH872a = (RadioGroup) findViewById(R.id.rdogrpH872a);

            rdoH872a1 = (RadioButton) findViewById(R.id.rdoH872a1);
            rdoH872a2 = (RadioButton) findViewById(R.id.rdoH872a2);
            rdogrpH872a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH872a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH872a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH872a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH872a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH872b.setVisibility(View.GONE);
                        lineH872b.setVisibility(View.GONE);
                        txtH872b.setText("");
                        secH872c.setVisibility(View.GONE);
                        lineH872c.setVisibility(View.GONE);
                        rdogrpH872c.clearCheck();
                        secH872d.setVisibility(View.GONE);
                        lineH872d.setVisibility(View.GONE);
                        txtH872d.setText("");
                    } else {
                        secH872b.setVisibility(View.VISIBLE);
                        lineH872b.setVisibility(View.VISIBLE);
                        secH872c.setVisibility(View.VISIBLE);
                        lineH872c.setVisibility(View.VISIBLE);
                        secH872d.setVisibility(View.VISIBLE);
                        lineH872d.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH872b = (LinearLayout) findViewById(R.id.secH872b);
            lineH872b = (View) findViewById(R.id.lineH872b);
            VlblH872b = (TextView) findViewById(R.id.VlblH872b);
            txtH872b = (EditText) findViewById(R.id.txtH872b);
            secH872c = (LinearLayout) findViewById(R.id.secH872c);
            lineH872c = (View) findViewById(R.id.lineH872c);
            VlblH872c = (TextView) findViewById(R.id.VlblH872c);
            rdogrpH872c = (RadioGroup) findViewById(R.id.rdogrpH872c);

            rdoH872c1 = (RadioButton) findViewById(R.id.rdoH872c1);
            rdoH872c2 = (RadioButton) findViewById(R.id.rdoH872c2);
            rdoH872c3 = (RadioButton) findViewById(R.id.rdoH872c3);
            secH872d = (LinearLayout) findViewById(R.id.secH872d);
            lineH872d = (View) findViewById(R.id.lineH872d);
            VlblH872d = (TextView) findViewById(R.id.VlblH872d);
            txtH872d = (EditText) findViewById(R.id.txtH872d);
            secH873a = (LinearLayout) findViewById(R.id.secH873a);
            lineH873a = (View) findViewById(R.id.lineH873a);
            VlblH873a = (TextView) findViewById(R.id.VlblH873a);
            rdogrpH873a = (RadioGroup) findViewById(R.id.rdogrpH873a);

            rdoH873a1 = (RadioButton) findViewById(R.id.rdoH873a1);
            rdoH873a2 = (RadioButton) findViewById(R.id.rdoH873a2);
            rdogrpH873a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH873a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH873a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH873a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH873a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH873b.setVisibility(View.GONE);
                        lineH873b.setVisibility(View.GONE);
                        txtH873b.setText("");
                        secH873c.setVisibility(View.GONE);
                        lineH873c.setVisibility(View.GONE);
                        rdogrpH873c.clearCheck();
                        secH873d.setVisibility(View.GONE);
                        lineH873d.setVisibility(View.GONE);
                        txtH873d.setText("");
                    } else {
                        secH873b.setVisibility(View.VISIBLE);
                        lineH873b.setVisibility(View.VISIBLE);
                        secH873c.setVisibility(View.VISIBLE);
                        lineH873c.setVisibility(View.VISIBLE);
                        secH873d.setVisibility(View.VISIBLE);
                        lineH873d.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH873b = (LinearLayout) findViewById(R.id.secH873b);
            lineH873b = (View) findViewById(R.id.lineH873b);
            VlblH873b = (TextView) findViewById(R.id.VlblH873b);
            txtH873b = (EditText) findViewById(R.id.txtH873b);
            secH873c = (LinearLayout) findViewById(R.id.secH873c);
            lineH873c = (View) findViewById(R.id.lineH873c);
            VlblH873c = (TextView) findViewById(R.id.VlblH873c);
            rdogrpH873c = (RadioGroup) findViewById(R.id.rdogrpH873c);

            rdoH873c1 = (RadioButton) findViewById(R.id.rdoH873c1);
            rdoH873c2 = (RadioButton) findViewById(R.id.rdoH873c2);
            rdoH873c3 = (RadioButton) findViewById(R.id.rdoH873c3);
            secH873d = (LinearLayout) findViewById(R.id.secH873d);
            lineH873d = (View) findViewById(R.id.lineH873d);
            VlblH873d = (TextView) findViewById(R.id.VlblH873d);
            txtH873d = (EditText) findViewById(R.id.txtH873d);
            secH874a = (LinearLayout) findViewById(R.id.secH874a);
            lineH874a = (View) findViewById(R.id.lineH874a);
            VlblH874a = (TextView) findViewById(R.id.VlblH874a);
            rdogrpH874a = (RadioGroup) findViewById(R.id.rdogrpH874a);

            rdoH874a1 = (RadioButton) findViewById(R.id.rdoH874a1);
            rdoH874a2 = (RadioButton) findViewById(R.id.rdoH874a2);
            rdogrpH874a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH874a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH874a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH874a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH874a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH874b.setVisibility(View.GONE);
                        lineH874b.setVisibility(View.GONE);
                        txtH874b.setText("");
                        secH874c.setVisibility(View.GONE);
                        lineH874c.setVisibility(View.GONE);
                        rdogrpH874c.clearCheck();
                        secH874d.setVisibility(View.GONE);
                        lineH874d.setVisibility(View.GONE);
                        txtH874d.setText("");
                    } else {
                        secH874b.setVisibility(View.VISIBLE);
                        lineH874b.setVisibility(View.VISIBLE);
                        secH874c.setVisibility(View.VISIBLE);
                        lineH874c.setVisibility(View.VISIBLE);
                        secH874d.setVisibility(View.VISIBLE);
                        lineH874d.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH874b = (LinearLayout) findViewById(R.id.secH874b);
            lineH874b = (View) findViewById(R.id.lineH874b);
            VlblH874b = (TextView) findViewById(R.id.VlblH874b);
            txtH874b = (EditText) findViewById(R.id.txtH874b);
            secH874c = (LinearLayout) findViewById(R.id.secH874c);
            lineH874c = (View) findViewById(R.id.lineH874c);
            VlblH874c = (TextView) findViewById(R.id.VlblH874c);
            rdogrpH874c = (RadioGroup) findViewById(R.id.rdogrpH874c);

            rdoH874c1 = (RadioButton) findViewById(R.id.rdoH874c1);
            rdoH874c2 = (RadioButton) findViewById(R.id.rdoH874c2);
            rdoH874c3 = (RadioButton) findViewById(R.id.rdoH874c3);
            secH874d = (LinearLayout) findViewById(R.id.secH874d);
            lineH874d = (View) findViewById(R.id.lineH874d);
            VlblH874d = (TextView) findViewById(R.id.VlblH874d);
            txtH874d = (EditText) findViewById(R.id.txtH874d);
            secH875a = (LinearLayout) findViewById(R.id.secH875a);
            lineH875a = (View) findViewById(R.id.lineH875a);
            VlblH875a = (TextView) findViewById(R.id.VlblH875a);
            rdogrpH875a = (RadioGroup) findViewById(R.id.rdogrpH875a);

            rdoH875a1 = (RadioButton) findViewById(R.id.rdoH875a1);
            rdoH875a2 = (RadioButton) findViewById(R.id.rdoH875a2);
            rdogrpH875a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH875a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH875a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH875a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH875a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH875b.setVisibility(View.GONE);
                        lineH875b.setVisibility(View.GONE);
                        txtH875b.setText("");
                        secH875c.setVisibility(View.GONE);
                        lineH875c.setVisibility(View.GONE);
                        rdogrpH875c.clearCheck();
                        secH875d.setVisibility(View.GONE);
                        lineH875d.setVisibility(View.GONE);
                        txtH875d.setText("");
                    } else {
                        secH875b.setVisibility(View.VISIBLE);
                        lineH875b.setVisibility(View.VISIBLE);
                        secH875c.setVisibility(View.VISIBLE);
                        lineH875c.setVisibility(View.VISIBLE);
                        secH875d.setVisibility(View.VISIBLE);
                        lineH875d.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH875b = (LinearLayout) findViewById(R.id.secH875b);
            lineH875b = (View) findViewById(R.id.lineH875b);
            VlblH875b = (TextView) findViewById(R.id.VlblH875b);
            txtH875b = (EditText) findViewById(R.id.txtH875b);
            secH875c = (LinearLayout) findViewById(R.id.secH875c);
            lineH875c = (View) findViewById(R.id.lineH875c);
            VlblH875c = (TextView) findViewById(R.id.VlblH875c);
            rdogrpH875c = (RadioGroup) findViewById(R.id.rdogrpH875c);

            rdoH875c1 = (RadioButton) findViewById(R.id.rdoH875c1);
            rdoH875c2 = (RadioButton) findViewById(R.id.rdoH875c2);
            rdoH875c3 = (RadioButton) findViewById(R.id.rdoH875c3);
            secH875d = (LinearLayout) findViewById(R.id.secH875d);
            lineH875d = (View) findViewById(R.id.lineH875d);
            VlblH875d = (TextView) findViewById(R.id.VlblH875d);
            txtH875d = (EditText) findViewById(R.id.txtH875d);
            secLBH88 = (LinearLayout) findViewById(R.id.secLBH88);
            secH881a = (LinearLayout) findViewById(R.id.secH881a);
            lineH881a = (View) findViewById(R.id.lineH881a);
            VlblH881a = (TextView) findViewById(R.id.VlblH881a);
            rdogrpH881a = (RadioGroup) findViewById(R.id.rdogrpH881a);

            rdoH881a1 = (RadioButton) findViewById(R.id.rdoH881a1);
            rdoH881a2 = (RadioButton) findViewById(R.id.rdoH881a2);
            rdogrpH881a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH881a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH881a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH881a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH881a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH881b.setVisibility(View.GONE);
                        lineH881b.setVisibility(View.GONE);
                        txtH881b.setText("");
                        secH881c.setVisibility(View.GONE);
                        lineH881c.setVisibility(View.GONE);
                        rdogrpH881c.clearCheck();
                        secH881d.setVisibility(View.GONE);
                        lineH881d.setVisibility(View.GONE);
                        txtH881d.setText("");
                    } else {
                        secH881b.setVisibility(View.VISIBLE);
                        lineH881b.setVisibility(View.VISIBLE);
                        secH881c.setVisibility(View.VISIBLE);
                        lineH881c.setVisibility(View.VISIBLE);
                        secH881d.setVisibility(View.VISIBLE);
                        lineH881d.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH881b = (LinearLayout) findViewById(R.id.secH881b);
            lineH881b = (View) findViewById(R.id.lineH881b);
            VlblH881b = (TextView) findViewById(R.id.VlblH881b);
            txtH881b = (EditText) findViewById(R.id.txtH881b);
            secH881c = (LinearLayout) findViewById(R.id.secH881c);
            lineH881c = (View) findViewById(R.id.lineH881c);
            VlblH881c = (TextView) findViewById(R.id.VlblH881c);
            rdogrpH881c = (RadioGroup) findViewById(R.id.rdogrpH881c);

            rdoH881c1 = (RadioButton) findViewById(R.id.rdoH881c1);
            rdoH881c2 = (RadioButton) findViewById(R.id.rdoH881c2);
            rdoH881c3 = (RadioButton) findViewById(R.id.rdoH881c3);
            secH881d = (LinearLayout) findViewById(R.id.secH881d);
            lineH881d = (View) findViewById(R.id.lineH881d);
            VlblH881d = (TextView) findViewById(R.id.VlblH881d);
            txtH881d = (EditText) findViewById(R.id.txtH881d);
            secH882a = (LinearLayout) findViewById(R.id.secH882a);
            lineH882a = (View) findViewById(R.id.lineH882a);
            VlblH882a = (TextView) findViewById(R.id.VlblH882a);
            rdogrpH882a = (RadioGroup) findViewById(R.id.rdogrpH882a);

            rdoH882a1 = (RadioButton) findViewById(R.id.rdoH882a1);
            rdoH882a2 = (RadioButton) findViewById(R.id.rdoH882a2);
            rdogrpH882a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH882a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH882a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH882a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH882a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH882b.setVisibility(View.GONE);
                        lineH882b.setVisibility(View.GONE);
                        txtH882b.setText("");
                        secH882c.setVisibility(View.GONE);
                        lineH882c.setVisibility(View.GONE);
                        rdogrpH882c.clearCheck();
                        secH882d.setVisibility(View.GONE);
                        lineH882d.setVisibility(View.GONE);
                        txtH882d.setText("");
                    } else {
                        secH882b.setVisibility(View.VISIBLE);
                        lineH882b.setVisibility(View.VISIBLE);
                        secH882c.setVisibility(View.VISIBLE);
                        lineH882c.setVisibility(View.VISIBLE);
                        secH882d.setVisibility(View.VISIBLE);
                        lineH882d.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH882b = (LinearLayout) findViewById(R.id.secH882b);
            lineH882b = (View) findViewById(R.id.lineH882b);
            VlblH882b = (TextView) findViewById(R.id.VlblH882b);
            txtH882b = (EditText) findViewById(R.id.txtH882b);
            secH882c = (LinearLayout) findViewById(R.id.secH882c);
            lineH882c = (View) findViewById(R.id.lineH882c);
            VlblH882c = (TextView) findViewById(R.id.VlblH882c);
            rdogrpH882c = (RadioGroup) findViewById(R.id.rdogrpH882c);

            rdoH882c1 = (RadioButton) findViewById(R.id.rdoH882c1);
            rdoH882c2 = (RadioButton) findViewById(R.id.rdoH882c2);
            rdoH882c3 = (RadioButton) findViewById(R.id.rdoH882c3);
            secH882d = (LinearLayout) findViewById(R.id.secH882d);
            lineH882d = (View) findViewById(R.id.lineH882d);
            VlblH882d = (TextView) findViewById(R.id.VlblH882d);
            txtH882d = (EditText) findViewById(R.id.txtH882d);
            secH883a = (LinearLayout) findViewById(R.id.secH883a);
            lineH883a = (View) findViewById(R.id.lineH883a);
            VlblH883a = (TextView) findViewById(R.id.VlblH883a);
            rdogrpH883a = (RadioGroup) findViewById(R.id.rdogrpH883a);

            rdoH883a1 = (RadioButton) findViewById(R.id.rdoH883a1);
            rdoH883a2 = (RadioButton) findViewById(R.id.rdoH883a2);
            rdogrpH883a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH883a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH883a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH883a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH883a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH883b.setVisibility(View.GONE);
                        lineH883b.setVisibility(View.GONE);
                        txtH883b.setText("");
                        secH883c.setVisibility(View.GONE);
                        lineH883c.setVisibility(View.GONE);
                        rdogrpH883c.clearCheck();
                        secH883d.setVisibility(View.GONE);
                        lineH883d.setVisibility(View.GONE);
                        txtH883d.setText("");
                    } else {
                        secH883b.setVisibility(View.VISIBLE);
                        lineH883b.setVisibility(View.VISIBLE);
                        secH883c.setVisibility(View.VISIBLE);
                        lineH883c.setVisibility(View.VISIBLE);
                        secH883d.setVisibility(View.VISIBLE);
                        lineH883d.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH883b = (LinearLayout) findViewById(R.id.secH883b);
            lineH883b = (View) findViewById(R.id.lineH883b);
            VlblH883b = (TextView) findViewById(R.id.VlblH883b);
            txtH883b = (EditText) findViewById(R.id.txtH883b);
            secH883c = (LinearLayout) findViewById(R.id.secH883c);
            lineH883c = (View) findViewById(R.id.lineH883c);
            VlblH883c = (TextView) findViewById(R.id.VlblH883c);
            rdogrpH883c = (RadioGroup) findViewById(R.id.rdogrpH883c);

            rdoH883c1 = (RadioButton) findViewById(R.id.rdoH883c1);
            rdoH883c2 = (RadioButton) findViewById(R.id.rdoH883c2);
            rdoH883c3 = (RadioButton) findViewById(R.id.rdoH883c3);
            secH883d = (LinearLayout) findViewById(R.id.secH883d);
            lineH883d = (View) findViewById(R.id.lineH883d);
            VlblH883d = (TextView) findViewById(R.id.VlblH883d);
            txtH883d = (EditText) findViewById(R.id.txtH883d);
            secH884a = (LinearLayout) findViewById(R.id.secH884a);
            lineH884a = (View) findViewById(R.id.lineH884a);
            VlblH884a = (TextView) findViewById(R.id.VlblH884a);
            rdogrpH884a = (RadioGroup) findViewById(R.id.rdogrpH884a);

            rdoH884a1 = (RadioButton) findViewById(R.id.rdoH884a1);
            rdoH884a2 = (RadioButton) findViewById(R.id.rdoH884a2);
            rdogrpH884a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH884a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH884a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH884a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH884a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH884b.setVisibility(View.GONE);
                        lineH884b.setVisibility(View.GONE);
                        txtH884b.setText("");
                        secH884c.setVisibility(View.GONE);
                        lineH884c.setVisibility(View.GONE);
                        rdogrpH884c.clearCheck();
                        secH884d.setVisibility(View.GONE);
                        lineH884d.setVisibility(View.GONE);
                        txtH884d.setText("");
                    } else {
                        secH884b.setVisibility(View.VISIBLE);
                        lineH884b.setVisibility(View.VISIBLE);
                        secH884c.setVisibility(View.VISIBLE);
                        lineH884c.setVisibility(View.VISIBLE);
                        secH884d.setVisibility(View.VISIBLE);
                        lineH884d.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH884b = (LinearLayout) findViewById(R.id.secH884b);
            lineH884b = (View) findViewById(R.id.lineH884b);
            VlblH884b = (TextView) findViewById(R.id.VlblH884b);
            txtH884b = (EditText) findViewById(R.id.txtH884b);
            secH884c = (LinearLayout) findViewById(R.id.secH884c);
            lineH884c = (View) findViewById(R.id.lineH884c);
            VlblH884c = (TextView) findViewById(R.id.VlblH884c);
            rdogrpH884c = (RadioGroup) findViewById(R.id.rdogrpH884c);

            rdoH884c1 = (RadioButton) findViewById(R.id.rdoH884c1);
            rdoH884c2 = (RadioButton) findViewById(R.id.rdoH884c2);
            rdoH884c3 = (RadioButton) findViewById(R.id.rdoH884c3);
            secH884d = (LinearLayout) findViewById(R.id.secH884d);
            lineH884d = (View) findViewById(R.id.lineH884d);
            VlblH884d = (TextView) findViewById(R.id.VlblH884d);
            txtH884d = (EditText) findViewById(R.id.txtH884d);
            secH885a = (LinearLayout) findViewById(R.id.secH885a);
            lineH885a = (View) findViewById(R.id.lineH885a);
            VlblH885a = (TextView) findViewById(R.id.VlblH885a);
            rdogrpH885a = (RadioGroup) findViewById(R.id.rdogrpH885a);

            rdoH885a1 = (RadioButton) findViewById(R.id.rdoH885a1);
            rdoH885a2 = (RadioButton) findViewById(R.id.rdoH885a2);
            rdogrpH885a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH885a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH885a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH885a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH885a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH885b.setVisibility(View.GONE);
                        lineH885b.setVisibility(View.GONE);
                        txtH885b.setText("");
                        secH885c.setVisibility(View.GONE);
                        lineH885c.setVisibility(View.GONE);
                        rdogrpH885c.clearCheck();
                        secH885d.setVisibility(View.GONE);
                        lineH885d.setVisibility(View.GONE);
                        txtH885d.setText("");
                    } else {
                        secH885b.setVisibility(View.VISIBLE);
                        lineH885b.setVisibility(View.VISIBLE);
                        secH885c.setVisibility(View.VISIBLE);
                        lineH885c.setVisibility(View.VISIBLE);
                        secH885d.setVisibility(View.VISIBLE);
                        lineH885d.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH885b = (LinearLayout) findViewById(R.id.secH885b);
            lineH885b = (View) findViewById(R.id.lineH885b);
            VlblH885b = (TextView) findViewById(R.id.VlblH885b);
            txtH885b = (EditText) findViewById(R.id.txtH885b);
            secH885c = (LinearLayout) findViewById(R.id.secH885c);
            lineH885c = (View) findViewById(R.id.lineH885c);
            VlblH885c = (TextView) findViewById(R.id.VlblH885c);
            rdogrpH885c = (RadioGroup) findViewById(R.id.rdogrpH885c);

            rdoH885c1 = (RadioButton) findViewById(R.id.rdoH885c1);
            rdoH885c2 = (RadioButton) findViewById(R.id.rdoH885c2);
            rdoH885c3 = (RadioButton) findViewById(R.id.rdoH885c3);
            secH885d = (LinearLayout) findViewById(R.id.secH885d);
            lineH885d = (View) findViewById(R.id.lineH885d);
            VlblH885d = (TextView) findViewById(R.id.VlblH885d);
            txtH885d = (EditText) findViewById(R.id.txtH885d);
            secLBH89 = (LinearLayout) findViewById(R.id.secLBH89);
            secH891a = (LinearLayout) findViewById(R.id.secH891a);
            lineH891a = (View) findViewById(R.id.lineH891a);
            VlblH891a = (TextView) findViewById(R.id.VlblH891a);
            rdogrpH891a = (RadioGroup) findViewById(R.id.rdogrpH891a);

            rdoH891a1 = (RadioButton) findViewById(R.id.rdoH891a1);
            rdoH891a2 = (RadioButton) findViewById(R.id.rdoH891a2);
            rdogrpH891a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH891a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH891a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH891a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH891a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH891b.setVisibility(View.GONE);
                        lineH891b.setVisibility(View.GONE);
                        txtH891b.setText("");
                        secH891c.setVisibility(View.GONE);
                        lineH891c.setVisibility(View.GONE);
                        rdogrpH891c.clearCheck();
                        secH891d.setVisibility(View.GONE);
                        lineH891d.setVisibility(View.GONE);
                        txtH891d.setText("");
                    } else {
                        secH891b.setVisibility(View.VISIBLE);
                        lineH891b.setVisibility(View.VISIBLE);
                        secH891c.setVisibility(View.VISIBLE);
                        lineH891c.setVisibility(View.VISIBLE);
                        secH891d.setVisibility(View.VISIBLE);
                        lineH891d.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH891b = (LinearLayout) findViewById(R.id.secH891b);
            lineH891b = (View) findViewById(R.id.lineH891b);
            VlblH891b = (TextView) findViewById(R.id.VlblH891b);
            txtH891b = (EditText) findViewById(R.id.txtH891b);
            secH891c = (LinearLayout) findViewById(R.id.secH891c);
            lineH891c = (View) findViewById(R.id.lineH891c);
            VlblH891c = (TextView) findViewById(R.id.VlblH891c);
            rdogrpH891c = (RadioGroup) findViewById(R.id.rdogrpH891c);

            rdoH891c1 = (RadioButton) findViewById(R.id.rdoH891c1);
            rdoH891c2 = (RadioButton) findViewById(R.id.rdoH891c2);
            rdoH891c3 = (RadioButton) findViewById(R.id.rdoH891c3);
            secH891d = (LinearLayout) findViewById(R.id.secH891d);
            lineH891d = (View) findViewById(R.id.lineH891d);
            VlblH891d = (TextView) findViewById(R.id.VlblH891d);
            txtH891d = (EditText) findViewById(R.id.txtH891d);
            secLBH810 = (LinearLayout) findViewById(R.id.secLBH810);
            secH8101a = (LinearLayout) findViewById(R.id.secH8101a);
            lineH8101a = (View) findViewById(R.id.lineH8101a);
            VlblH8101a = (TextView) findViewById(R.id.VlblH8101a);
            rdogrpH8101a = (RadioGroup) findViewById(R.id.rdogrpH8101a);

            rdoH8101a1 = (RadioButton) findViewById(R.id.rdoH8101a1);
            rdoH8101a2 = (RadioButton) findViewById(R.id.rdoH8101a2);
            rdogrpH8101a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH8101a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH8101a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH8101a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH8101a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH8101b.setVisibility(View.GONE);
                        lineH8101b.setVisibility(View.GONE);
                        txtH8101b.setText("");
                        secH8101c.setVisibility(View.GONE);
                        lineH8101c.setVisibility(View.GONE);
                        rdogrpH8101c.clearCheck();
                        secH8101d.setVisibility(View.GONE);
                        lineH8101d.setVisibility(View.GONE);
                        txtH8101d.setText("");
                    } else {
                        secH8101b.setVisibility(View.VISIBLE);
                        lineH8101b.setVisibility(View.VISIBLE);
                        secH8101c.setVisibility(View.VISIBLE);
                        lineH8101c.setVisibility(View.VISIBLE);
                        secH8101d.setVisibility(View.VISIBLE);
                        lineH8101d.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH8101b = (LinearLayout) findViewById(R.id.secH8101b);
            lineH8101b = (View) findViewById(R.id.lineH8101b);
            VlblH8101b = (TextView) findViewById(R.id.VlblH8101b);
            txtH8101b = (EditText) findViewById(R.id.txtH8101b);
            secH8101c = (LinearLayout) findViewById(R.id.secH8101c);
            lineH8101c = (View) findViewById(R.id.lineH8101c);
            VlblH8101c = (TextView) findViewById(R.id.VlblH8101c);
            rdogrpH8101c = (RadioGroup) findViewById(R.id.rdogrpH8101c);

            rdoH8101c1 = (RadioButton) findViewById(R.id.rdoH8101c1);
            rdoH8101c2 = (RadioButton) findViewById(R.id.rdoH8101c2);
            rdoH8101c3 = (RadioButton) findViewById(R.id.rdoH8101c3);
            secH8101d = (LinearLayout) findViewById(R.id.secH8101d);
            lineH8101d = (View) findViewById(R.id.lineH8101d);
            VlblH8101d = (TextView) findViewById(R.id.VlblH8101d);
            txtH8101d = (EditText) findViewById(R.id.txtH8101d);
            secH8102a = (LinearLayout) findViewById(R.id.secH8102a);
            lineH8102a = (View) findViewById(R.id.lineH8102a);
            VlblH8102a = (TextView) findViewById(R.id.VlblH8102a);
            rdogrpH8102a = (RadioGroup) findViewById(R.id.rdogrpH8102a);

            rdoH8102a1 = (RadioButton) findViewById(R.id.rdoH8102a1);
            rdoH8102a2 = (RadioButton) findViewById(R.id.rdoH8102a2);
            rdogrpH8102a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH8102a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH8102a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH8102a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH8102a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH8102b.setVisibility(View.GONE);
                        lineH8102b.setVisibility(View.GONE);
                        txtH8102b.setText("");
                        secH8102c.setVisibility(View.GONE);
                        lineH8102c.setVisibility(View.GONE);
                        rdogrpH8102c.clearCheck();
                        secH8102d.setVisibility(View.GONE);
                        lineH8102d.setVisibility(View.GONE);
                        txtH8102d.setText("");
                    } else {
                        secH8102b.setVisibility(View.VISIBLE);
                        lineH8102b.setVisibility(View.VISIBLE);
                        secH8102c.setVisibility(View.VISIBLE);
                        lineH8102c.setVisibility(View.VISIBLE);
                        secH8102d.setVisibility(View.VISIBLE);
                        lineH8102d.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH8102b = (LinearLayout) findViewById(R.id.secH8102b);
            lineH8102b = (View) findViewById(R.id.lineH8102b);
            VlblH8102b = (TextView) findViewById(R.id.VlblH8102b);
            txtH8102b = (EditText) findViewById(R.id.txtH8102b);
            secH8102c = (LinearLayout) findViewById(R.id.secH8102c);
            lineH8102c = (View) findViewById(R.id.lineH8102c);
            VlblH8102c = (TextView) findViewById(R.id.VlblH8102c);
            rdogrpH8102c = (RadioGroup) findViewById(R.id.rdogrpH8102c);

            rdoH8102c1 = (RadioButton) findViewById(R.id.rdoH8102c1);
            rdoH8102c2 = (RadioButton) findViewById(R.id.rdoH8102c2);
            rdoH8102c3 = (RadioButton) findViewById(R.id.rdoH8102c3);
            secH8102d = (LinearLayout) findViewById(R.id.secH8102d);
            lineH8102d = (View) findViewById(R.id.lineH8102d);
            VlblH8102d = (TextView) findViewById(R.id.VlblH8102d);
            txtH8102d = (EditText) findViewById(R.id.txtH8102d);
            secH8103a = (LinearLayout) findViewById(R.id.secH8103a);
            lineH8103a = (View) findViewById(R.id.lineH8103a);
            VlblH8103a = (TextView) findViewById(R.id.VlblH8103a);
            rdogrpH8103a = (RadioGroup) findViewById(R.id.rdogrpH8103a);

            rdoH8103a1 = (RadioButton) findViewById(R.id.rdoH8103a1);
            rdoH8103a2 = (RadioButton) findViewById(R.id.rdoH8103a2);
            rdogrpH8103a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH8103a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH8103a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH8103a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH8103a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH8103b.setVisibility(View.GONE);
                        lineH8103b.setVisibility(View.GONE);
                        txtH8103b.setText("");
                        secH8103c.setVisibility(View.GONE);
                        lineH8103c.setVisibility(View.GONE);
                        rdogrpH8103c.clearCheck();
                        secH8103d.setVisibility(View.GONE);
                        lineH8103d.setVisibility(View.GONE);
                        txtH8102d.setText("");
                    } else {
                        secH8103b.setVisibility(View.VISIBLE);
                        lineH8103b.setVisibility(View.VISIBLE);
                        secH8103c.setVisibility(View.VISIBLE);
                        lineH8103c.setVisibility(View.VISIBLE);
                        secH8103d.setVisibility(View.VISIBLE);
                        lineH8103d.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH8103b = (LinearLayout) findViewById(R.id.secH8103b);
            lineH8103b = (View) findViewById(R.id.lineH8103b);
            VlblH8103b = (TextView) findViewById(R.id.VlblH8103b);
            txtH8103b = (EditText) findViewById(R.id.txtH8103b);
            secH8103c = (LinearLayout) findViewById(R.id.secH8103c);
            lineH8103c = (View) findViewById(R.id.lineH8103c);
            VlblH8103c = (TextView) findViewById(R.id.VlblH8103c);
            rdogrpH8103c = (RadioGroup) findViewById(R.id.rdogrpH8103c);

            rdoH8103c1 = (RadioButton) findViewById(R.id.rdoH8103c1);
            rdoH8103c2 = (RadioButton) findViewById(R.id.rdoH8103c2);
            rdoH8103c3 = (RadioButton) findViewById(R.id.rdoH8103c3);
            secH8103d = (LinearLayout) findViewById(R.id.secH8103d);
            lineH8103d = (View) findViewById(R.id.lineH8103d);
            VlblH8103d = (TextView) findViewById(R.id.VlblH8103d);
            txtH8103d = (EditText) findViewById(R.id.txtH8103d);


            DataSearch(RND, SUCHANAID);
            txtRnd.setText(RND);
            txtSuchanaID.setText(SUCHANAID);
            txtRnd.setEnabled(false);
            txtSuchanaID.setEnabled(false);

            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            throw e;
            //Connection.MessageBox(Cost2.this, e.getMessage());
            // return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: উপকারভোগী/সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (spnMSlNo.getSelectedItem().toString().length() == 0 & secMSlNo.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: তথ্যদানে সহায়তাকারীর লাইন নম্বর #.");
                // txtMSlNo.requestFocus();
                return;
            } else if (!rdoH871a1.isChecked() & !rdoH871a2.isChecked() & secH871a.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (পাতাওয়ালা সবজি   কিনেছে).");
                rdoH871a1.requestFocus();
                return;
            } else if (txtH871b.getText().toString().length() == 0 & secH871b.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH871b.requestFocus();
                return;
            } else if (Integer.valueOf(txtH871b.getText().toString().length() == 0 ? "1" : txtH871b.getText().toString()) < 1 || Integer.valueOf(txtH871b.getText().toString().length() == 0 ? "999" : txtH871b.getText().toString()) > 999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999(পরিমাণ(সংখ্যা)).");
                txtH871b.requestFocus();
                return;
            } else if (!rdoH871c1.isChecked() & !rdoH871c2.isChecked() & !rdoH871c3.isChecked() & secH871c.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (ইউনিট ).");
                rdoH871c1.requestFocus();
                return;
            } else if (txtH871d.getText().toString().length() == 0 & secH871d.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH871d.requestFocus();
                return;
            } else if (Integer.valueOf(txtH871d.getText().toString().length() == 0 ? "1" : txtH871d.getText().toString()) < 1 || Integer.valueOf(txtH871d.getText().toString().length() == 0 ? "999999" : txtH871d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH871d.requestFocus();
                return;
            } else if (!rdoH872a1.isChecked() & !rdoH872a2.isChecked() & secH872a.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (পাতাছাড়া সবজি   কিনেছে).");
                rdoH872a1.requestFocus();
                return;
            } else if (txtH872b.getText().toString().length() == 0 & secH872b.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH872b.requestFocus();
                return;
            } else if (Integer.valueOf(txtH872b.getText().toString().length() == 0 ? "1" : txtH872b.getText().toString()) < 1 || Integer.valueOf(txtH872b.getText().toString().length() == 0 ? "999" : txtH872b.getText().toString()) > 999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999(পরিমাণ(সংখ্যা)).");
                txtH872b.requestFocus();
                return;
            } else if (!rdoH872c1.isChecked() & !rdoH872c2.isChecked() & !rdoH872c3.isChecked() & secH872c.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (ইউনিট ).");
                rdoH872c1.requestFocus();
                return;
            } else if (txtH872d.getText().toString().length() == 0 & secH872d.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH872d.requestFocus();
                return;
            } else if (Integer.valueOf(txtH872d.getText().toString().length() == 0 ? "1" : txtH872d.getText().toString()) < 1 || Integer.valueOf(txtH872d.getText().toString().length() == 0 ? "999999" : txtH872d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH872d.requestFocus();
                return;
            } else if (!rdoH873a1.isChecked() & !rdoH873a2.isChecked() & secH873a.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (শেকড়ওয়ালা সবজি  কিনেছে).");
                rdoH873a1.requestFocus();
                return;
            } else if (txtH873b.getText().toString().length() == 0 & secH873b.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH873b.requestFocus();
                return;
            } else if (Integer.valueOf(txtH873b.getText().toString().length() == 0 ? "1" : txtH873b.getText().toString()) < 1 || Integer.valueOf(txtH873b.getText().toString().length() == 0 ? "999" : txtH873b.getText().toString()) > 999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999(পরিমাণ(সংখ্যা)).");
                txtH873b.requestFocus();
                return;
            } else if (!rdoH873c1.isChecked() & !rdoH873c2.isChecked() & !rdoH873c3.isChecked() & secH873c.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (ইউনিট ).");
                rdoH873c1.requestFocus();
                return;
            } else if (txtH873d.getText().toString().length() == 0 & secH873d.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH873d.requestFocus();
                return;
            } else if (Integer.valueOf(txtH873d.getText().toString().length() == 0 ? "1" : txtH873d.getText().toString()) < 1 || Integer.valueOf(txtH873d.getText().toString().length() == 0 ? "999999" : txtH873d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH873d.requestFocus();
                return;
            } else if (!rdoH874a1.isChecked() & !rdoH874a2.isChecked() & secH874a.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (ফল  কিনেছে).");
                rdoH874a1.requestFocus();
                return;
            } else if (txtH874b.getText().toString().length() == 0 & secH874b.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH874b.requestFocus();
                return;
            } else if (Integer.valueOf(txtH874b.getText().toString().length() == 0 ? "1" : txtH874b.getText().toString()) < 1 || Integer.valueOf(txtH874b.getText().toString().length() == 0 ? "999" : txtH874b.getText().toString()) > 999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999(পরিমাণ(সংখ্যা)).");
                txtH874b.requestFocus();
                return;
            } else if (!rdoH874c1.isChecked() & !rdoH874c2.isChecked() & !rdoH874c3.isChecked() & secH874c.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (ইউনিট ).");
                rdoH874c1.requestFocus();
                return;
            } else if (txtH874d.getText().toString().length() == 0 & secH874d.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH874d.requestFocus();
                return;
            } else if (Integer.valueOf(txtH874d.getText().toString().length() == 0 ? "1" : txtH874d.getText().toString()) < 1 || Integer.valueOf(txtH874d.getText().toString().length() == 0 ? "999999" : txtH874d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH874d.requestFocus();
                return;
            } else if (!rdoH875a1.isChecked() & !rdoH875a2.isChecked() & secH875a.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (ফল শুধু কলা   কিনেছে).");
                rdoH875a1.requestFocus();
                return;
            } else if (txtH875b.getText().toString().length() == 0 & secH875b.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH875b.requestFocus();
                return;
            } else if (Integer.valueOf(txtH875b.getText().toString().length() == 0 ? "1" : txtH875b.getText().toString()) < 1 || Integer.valueOf(txtH875b.getText().toString().length() == 0 ? "999" : txtH875b.getText().toString()) > 999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999(পরিমাণ(সংখ্যা)).");
                txtH875b.requestFocus();
                return;
            } else if (!rdoH875c1.isChecked() & !rdoH875c2.isChecked() & !rdoH875c3.isChecked() & secH875c.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (ইউনিট ).");
                rdoH875c1.requestFocus();
                return;
            } else if (txtH875d.getText().toString().length() == 0 & secH875d.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH875d.requestFocus();
                return;
            } else if (Integer.valueOf(txtH875d.getText().toString().length() == 0 ? "1" : txtH875d.getText().toString()) < 1 || Integer.valueOf(txtH875d.getText().toString().length() == 0 ? "999999" : txtH875d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH875d.requestFocus();
                return;
            } else if (!rdoH881a1.isChecked() & !rdoH881a2.isChecked() & secH881a.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from ( পেঁয়াজ  কিনেছে).");
                rdoH881a1.requestFocus();
                return;
            } else if (txtH881b.getText().toString().length() == 0 & secH881b.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH881b.requestFocus();
                return;
            } else if (Integer.valueOf(txtH881b.getText().toString().length() == 0 ? "1" : txtH881b.getText().toString()) < 1 || Integer.valueOf(txtH881b.getText().toString().length() == 0 ? "999" : txtH881b.getText().toString()) > 999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999(পরিমাণ(সংখ্যা)).");
                txtH881b.requestFocus();
                return;
            } else if (!rdoH881c1.isChecked() & !rdoH881c2.isChecked() & !rdoH881c3.isChecked() & secH881c.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (ইউনিট ).");
                rdoH881c1.requestFocus();
                return;
            } else if (txtH881d.getText().toString().length() == 0 & secH881d.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH881d.requestFocus();
                return;
            } else if (Integer.valueOf(txtH881d.getText().toString().length() == 0 ? "1" : txtH881d.getText().toString()) < 1 || Integer.valueOf(txtH881d.getText().toString().length() == 0 ? "999999" : txtH881d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH881d.requestFocus();
                return;
            } else if (!rdoH882a1.isChecked() & !rdoH882a2.isChecked() & secH882a.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (রসুন  কিনেছে).");
                rdoH882a1.requestFocus();
                return;
            } else if (txtH882b.getText().toString().length() == 0 & secH882b.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH882b.requestFocus();
                return;
            } else if (Integer.valueOf(txtH882b.getText().toString().length() == 0 ? "1" : txtH882b.getText().toString()) < 1 || Integer.valueOf(txtH882b.getText().toString().length() == 0 ? "999" : txtH882b.getText().toString()) > 999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999(পরিমাণ(সংখ্যা)).");
                txtH882b.requestFocus();
                return;
            } else if (!rdoH882c1.isChecked() & !rdoH882c2.isChecked() & !rdoH882c3.isChecked() & secH882c.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (ইউনিট ).");
                rdoH882c1.requestFocus();
                return;
            } else if (txtH882d.getText().toString().length() == 0 & secH882d.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH882d.requestFocus();
                return;
            } else if (Integer.valueOf(txtH882d.getText().toString().length() == 0 ? "1" : txtH882d.getText().toString()) < 1 || Integer.valueOf(txtH882d.getText().toString().length() == 0 ? "999999" : txtH882d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH882d.requestFocus();
                return;
            } else if (!rdoH883a1.isChecked() & !rdoH883a2.isChecked() & secH883a.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (আদা  কিনেছে).");
                rdoH883a1.requestFocus();
                return;
            } else if (txtH883b.getText().toString().length() == 0 & secH883b.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH883b.requestFocus();
                return;
            } else if (Integer.valueOf(txtH883b.getText().toString().length() == 0 ? "1" : txtH883b.getText().toString()) < 1 || Integer.valueOf(txtH883b.getText().toString().length() == 0 ? "999" : txtH883b.getText().toString()) > 999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999(পরিমাণ(সংখ্যা)).");
                txtH883b.requestFocus();
                return;
            } else if (!rdoH883c1.isChecked() & !rdoH883c2.isChecked() & !rdoH883c3.isChecked() & secH883c.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (ইউনিট ).");
                rdoH883c1.requestFocus();
                return;
            } else if (txtH883d.getText().toString().length() == 0 & secH883d.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH883d.requestFocus();
                return;
            } else if (Integer.valueOf(txtH883d.getText().toString().length() == 0 ? "1" : txtH883d.getText().toString()) < 1 || Integer.valueOf(txtH883d.getText().toString().length() == 0 ? "999999" : txtH883d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH883d.requestFocus();
                return;
            } else if (!rdoH884a1.isChecked() & !rdoH884a2.isChecked() & secH884a.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (মরিচ  শুকনো মরিচ  কিনেছে).");
                rdoH884a1.requestFocus();
                return;
            } else if (txtH884b.getText().toString().length() == 0 & secH884b.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH884b.requestFocus();
                return;
            } else if (Integer.valueOf(txtH884b.getText().toString().length() == 0 ? "1" : txtH884b.getText().toString()) < 1 || Integer.valueOf(txtH884b.getText().toString().length() == 0 ? "999" : txtH884b.getText().toString()) > 999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999(পরিমাণ(সংখ্যা)).");
                txtH884b.requestFocus();
                return;
            } else if (!rdoH884c1.isChecked() & !rdoH884c2.isChecked() & !rdoH884c3.isChecked() & secH884c.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (ইউনিট ).");
                rdoH884c1.requestFocus();
                return;
            } else if (txtH884d.getText().toString().length() == 0 & secH884d.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH884d.requestFocus();
                return;
            } else if (Integer.valueOf(txtH884d.getText().toString().length() == 0 ? "1" : txtH884d.getText().toString()) < 1 || Integer.valueOf(txtH884d.getText().toString().length() == 0 ? "999999" : txtH884d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH884d.requestFocus();
                return;
            } else if (!rdoH885a1.isChecked() & !rdoH885a2.isChecked() & secH885a.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (জিরা  ধনে  কিনেছে).");
                rdoH885a1.requestFocus();
                return;
            } else if (txtH885b.getText().toString().length() == 0 & secH885b.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH885b.requestFocus();
                return;
            } else if (Integer.valueOf(txtH885b.getText().toString().length() == 0 ? "1" : txtH885b.getText().toString()) < 1 || Integer.valueOf(txtH885b.getText().toString().length() == 0 ? "999" : txtH885b.getText().toString()) > 999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999(পরিমাণ(সংখ্যা)).");
                txtH885b.requestFocus();
                return;
            } else if (!rdoH885c1.isChecked() & !rdoH885c2.isChecked() & !rdoH885c3.isChecked() & secH885c.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (ইউনিট ).");
                rdoH885c1.requestFocus();
                return;
            } else if (txtH885d.getText().toString().length() == 0 & secH885d.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH885d.requestFocus();
                return;
            } else if (Integer.valueOf(txtH885d.getText().toString().length() == 0 ? "1" : txtH885d.getText().toString()) < 1 || Integer.valueOf(txtH885d.getText().toString().length() == 0 ? "999999" : txtH885d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH885d.requestFocus();
                return;
            } else if (!rdoH891a1.isChecked() & !rdoH891a2.isChecked() & secH891a.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (ফাস্টফুড যেমন আলুর চিপস কেক চানাচুর   কিনেছে).");
                rdoH891a1.requestFocus();
                return;
            } else if (txtH891b.getText().toString().length() == 0 & secH891b.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH891b.requestFocus();
                return;
            } else if (Integer.valueOf(txtH891b.getText().toString().length() == 0 ? "1" : txtH891b.getText().toString()) < 1 || Integer.valueOf(txtH891b.getText().toString().length() == 0 ? "999" : txtH891b.getText().toString()) > 999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999(পরিমাণ(সংখ্যা)).");
                txtH891b.requestFocus();
                return;
            } else if (!rdoH891c1.isChecked() & !rdoH891c2.isChecked() & !rdoH891c3.isChecked() & secH891c.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (ইউনিট).");
                rdoH891c1.requestFocus();
                return;
            } else if (txtH891d.getText().toString().length() == 0 & secH891d.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH891d.requestFocus();
                return;
            } else if (Integer.valueOf(txtH891d.getText().toString().length() == 0 ? "1" : txtH891d.getText().toString()) < 1 || Integer.valueOf(txtH891d.getText().toString().length() == 0 ? "999999" : txtH891d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH891d.requestFocus();
                return;
            } else if (!rdoH8101a1.isChecked() & !rdoH8101a2.isChecked() & secH8101a.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (চা  কিনেছে).");
                rdoH8101a1.requestFocus();
                return;
            } else if (txtH8101b.getText().toString().length() == 0 & secH8101b.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH8101b.requestFocus();
                return;
            } else if (Integer.valueOf(txtH8101b.getText().toString().length() == 0 ? "1" : txtH8101b.getText().toString()) < 1 || Integer.valueOf(txtH8101b.getText().toString().length() == 0 ? "999" : txtH8101b.getText().toString()) > 999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999(পরিমাণ(সংখ্যা)).");
                txtH8101b.requestFocus();
                return;
            } else if (!rdoH8101c1.isChecked() & !rdoH8101c2.isChecked() & !rdoH8101c3.isChecked() & secH8101c.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (ইউনিট ).");
                rdoH8101c1.requestFocus();
                return;
            } else if (txtH8101d.getText().toString().length() == 0 & secH8101d.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH8101d.requestFocus();
                return;
            } else if (Integer.valueOf(txtH8101d.getText().toString().length() == 0 ? "1" : txtH8101d.getText().toString()) < 1 || Integer.valueOf(txtH8101d.getText().toString().length() == 0 ? "999999" : txtH8101d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH8101d.requestFocus();
                return;
            } else if (!rdoH8102a1.isChecked() & !rdoH8102a2.isChecked() & secH8102a.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (চিনি গুড়  কিনেছে).");
                rdoH8102a1.requestFocus();
                return;
            } else if (txtH8102b.getText().toString().length() == 0 & secH8102b.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH8102b.requestFocus();
                return;
            } else if (Integer.valueOf(txtH8102b.getText().toString().length() == 0 ? "1" : txtH8102b.getText().toString()) < 1 || Integer.valueOf(txtH8102b.getText().toString().length() == 0 ? "999" : txtH8102b.getText().toString()) > 999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999(পরিমাণ(সংখ্যা)).");
                txtH8102b.requestFocus();
                return;
            } else if (!rdoH8102c1.isChecked() & !rdoH8102c2.isChecked() & !rdoH8102c3.isChecked() & secH8102c.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (ইউনিট ).");
                rdoH8102c1.requestFocus();
                return;
            } else if (txtH8102d.getText().toString().length() == 0 & secH8102d.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH8102d.requestFocus();
                return;
            } else if (Integer.valueOf(txtH8102d.getText().toString().length() == 0 ? "1" : txtH8102d.getText().toString()) < 1 || Integer.valueOf(txtH8102d.getText().toString().length() == 0 ? "999999" : txtH8102d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH8102d.requestFocus();
                return;
            } else if (!rdoH8103a1.isChecked() & !rdoH8103a2.isChecked() & secH8103a.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (কনডেন্সড মিল্ক  কিনেছে).");
                rdoH8103a1.requestFocus();
                return;
            } else if (txtH8103b.getText().toString().length() == 0 & secH8103b.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH8103b.requestFocus();
                return;
            } else if (Integer.valueOf(txtH8103b.getText().toString().length() == 0 ? "1" : txtH8103b.getText().toString()) < 1 || Integer.valueOf(txtH8103b.getText().toString().length() == 0 ? "999" : txtH8103b.getText().toString()) > 999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999(পরিমাণ(সংখ্যা)).");
                txtH8103b.requestFocus();
                return;
            } else if (!rdoH8103c1.isChecked() & !rdoH8103c2.isChecked() & !rdoH8103c3.isChecked() & secH8103c.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (ইউনিট ).");
                rdoH8103c1.requestFocus();
                return;
            } else if (txtH8103d.getText().toString().length() == 0 & secH8103d.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH8103d.requestFocus();
                return;
            } else if (Integer.valueOf(txtH8103d.getText().toString().length() == 0 ? "1" : txtH8103d.getText().toString()) < 1 || Integer.valueOf(txtH8103d.getText().toString().length() == 0 ? "999999" : txtH8103d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 1 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH8103d.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            Cost2_DataModel objSave = new Cost2_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setMSlNo(Connection.SelectedSpinnerValue(spnMSlNo.getSelectedItem().toString(), "-"));
            String[] d_rdogrpH871a = new String[]{"1", "0"};
            objSave.setH871a("");
            for (int i = 0; i < rdogrpH871a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH871a.getChildAt(i);
                if (rb.isChecked()) objSave.setH871a(d_rdogrpH871a[i]);
            }

            objSave.setH871b(txtH871b.getText().toString());
            String[] d_rdogrpH871c = new String[]{"1", "2", "3"};
            objSave.setH871c("");
            for (int i = 0; i < rdogrpH871c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH871c.getChildAt(i);
                if (rb.isChecked()) objSave.setH871c(d_rdogrpH871c[i]);
            }

            objSave.setH871d(txtH871d.getText().toString());
            String[] d_rdogrpH872a = new String[]{"1", "0"};
            objSave.setH872a("");
            for (int i = 0; i < rdogrpH872a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH872a.getChildAt(i);
                if (rb.isChecked()) objSave.setH872a(d_rdogrpH872a[i]);
            }

            objSave.setH872b(txtH872b.getText().toString());
            String[] d_rdogrpH872c = new String[]{"1", "2", "3"};
            objSave.setH872c("");
            for (int i = 0; i < rdogrpH872c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH872c.getChildAt(i);
                if (rb.isChecked()) objSave.setH872c(d_rdogrpH872c[i]);
            }

            objSave.setH872d(txtH872d.getText().toString());
            String[] d_rdogrpH873a = new String[]{"1", "0"};
            objSave.setH873a("");
            for (int i = 0; i < rdogrpH873a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH873a.getChildAt(i);
                if (rb.isChecked()) objSave.setH873a(d_rdogrpH873a[i]);
            }

            objSave.setH873b(txtH873b.getText().toString());
            String[] d_rdogrpH873c = new String[]{"1", "2", "3"};
            objSave.setH873c("");
            for (int i = 0; i < rdogrpH873c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH873c.getChildAt(i);
                if (rb.isChecked()) objSave.setH873c(d_rdogrpH873c[i]);
            }

            objSave.setH873d(txtH873d.getText().toString());
            String[] d_rdogrpH874a = new String[]{"1", "0"};
            objSave.setH874a("");
            for (int i = 0; i < rdogrpH874a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH874a.getChildAt(i);
                if (rb.isChecked()) objSave.setH874a(d_rdogrpH874a[i]);
            }

            objSave.setH874b(txtH874b.getText().toString());
            String[] d_rdogrpH874c = new String[]{"1", "2", "3"};
            objSave.setH874c("");
            for (int i = 0; i < rdogrpH874c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH874c.getChildAt(i);
                if (rb.isChecked()) objSave.setH874c(d_rdogrpH874c[i]);
            }

            objSave.setH874d(txtH874d.getText().toString());
            String[] d_rdogrpH875a = new String[]{"1", "0"};
            objSave.setH875a("");
            for (int i = 0; i < rdogrpH875a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH875a.getChildAt(i);
                if (rb.isChecked()) objSave.setH875a(d_rdogrpH875a[i]);
            }

            objSave.setH875b(txtH875b.getText().toString());
            String[] d_rdogrpH875c = new String[]{"1", "2", "3"};
            objSave.setH875c("");
            for (int i = 0; i < rdogrpH875c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH875c.getChildAt(i);
                if (rb.isChecked()) objSave.setH875c(d_rdogrpH875c[i]);
            }

            objSave.setH875d(txtH875d.getText().toString());
            String[] d_rdogrpH881a = new String[]{"1", "0"};
            objSave.setH881a("");
            for (int i = 0; i < rdogrpH881a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH881a.getChildAt(i);
                if (rb.isChecked()) objSave.setH881a(d_rdogrpH881a[i]);
            }

            objSave.setH881b(txtH881b.getText().toString());
            String[] d_rdogrpH881c = new String[]{"1", "2", "3"};
            objSave.setH881c("");
            for (int i = 0; i < rdogrpH881c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH881c.getChildAt(i);
                if (rb.isChecked()) objSave.setH881c(d_rdogrpH881c[i]);
            }

            objSave.setH881d(txtH881d.getText().toString());
            String[] d_rdogrpH882a = new String[]{"1", "0"};
            objSave.setH882a("");
            for (int i = 0; i < rdogrpH882a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH882a.getChildAt(i);
                if (rb.isChecked()) objSave.setH882a(d_rdogrpH882a[i]);
            }

            objSave.setH882b(txtH882b.getText().toString());
            String[] d_rdogrpH882c = new String[]{"1", "2", "3"};
            objSave.setH882c("");
            for (int i = 0; i < rdogrpH882c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH882c.getChildAt(i);
                if (rb.isChecked()) objSave.setH882c(d_rdogrpH882c[i]);
            }

            objSave.setH882d(txtH882d.getText().toString());
            String[] d_rdogrpH883a = new String[]{"1", "0"};
            objSave.setH883a("");
            for (int i = 0; i < rdogrpH883a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH883a.getChildAt(i);
                if (rb.isChecked()) objSave.setH883a(d_rdogrpH883a[i]);
            }

            objSave.setH883b(txtH883b.getText().toString());
            String[] d_rdogrpH883c = new String[]{"1", "2", "3"};
            objSave.setH883c("");
            for (int i = 0; i < rdogrpH883c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH883c.getChildAt(i);
                if (rb.isChecked()) objSave.setH883c(d_rdogrpH883c[i]);
            }

            objSave.setH883d(txtH883d.getText().toString());
            String[] d_rdogrpH884a = new String[]{"1", "0"};
            objSave.setH884a("");
            for (int i = 0; i < rdogrpH884a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH884a.getChildAt(i);
                if (rb.isChecked()) objSave.setH884a(d_rdogrpH884a[i]);
            }

            objSave.setH884b(txtH884b.getText().toString());
            String[] d_rdogrpH884c = new String[]{"1", "2", "3"};
            objSave.setH884c("");
            for (int i = 0; i < rdogrpH884c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH884c.getChildAt(i);
                if (rb.isChecked()) objSave.setH884c(d_rdogrpH884c[i]);
            }

            objSave.setH884d(txtH884d.getText().toString());
            String[] d_rdogrpH885a = new String[]{"1", "0"};
            objSave.setH885a("");
            for (int i = 0; i < rdogrpH885a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH885a.getChildAt(i);
                if (rb.isChecked()) objSave.setH885a(d_rdogrpH885a[i]);
            }

            objSave.setH885b(txtH885b.getText().toString());
            String[] d_rdogrpH885c = new String[]{"1", "2", "3"};
            objSave.setH885c("");
            for (int i = 0; i < rdogrpH885c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH885c.getChildAt(i);
                if (rb.isChecked()) objSave.setH885c(d_rdogrpH885c[i]);
            }

            objSave.setH885d(txtH885d.getText().toString());
            String[] d_rdogrpH891a = new String[]{"1", "0"};
            objSave.setH891a("");
            for (int i = 0; i < rdogrpH891a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH891a.getChildAt(i);
                if (rb.isChecked()) objSave.setH891a(d_rdogrpH891a[i]);
            }

            objSave.setH891b(txtH891b.getText().toString());
            String[] d_rdogrpH891c = new String[]{"1", "2", "3"};
            objSave.setH891c("");
            for (int i = 0; i < rdogrpH891c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH891c.getChildAt(i);
                if (rb.isChecked()) objSave.setH891c(d_rdogrpH891c[i]);
            }

            objSave.setH891d(txtH891d.getText().toString());
            String[] d_rdogrpH8101a = new String[]{"1", "0"};
            objSave.setH8101a("");
            for (int i = 0; i < rdogrpH8101a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH8101a.getChildAt(i);
                if (rb.isChecked()) objSave.setH8101a(d_rdogrpH8101a[i]);
            }

            objSave.setH8101b(txtH8101b.getText().toString());
            String[] d_rdogrpH8101c = new String[]{"1", "2", "3"};
            objSave.setH8101c("");
            for (int i = 0; i < rdogrpH8101c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH8101c.getChildAt(i);
                if (rb.isChecked()) objSave.setH8101c(d_rdogrpH8101c[i]);
            }

            objSave.setH8101d(txtH8101d.getText().toString());
            String[] d_rdogrpH8102a = new String[]{"1", "0"};
            objSave.setH8102a("");
            for (int i = 0; i < rdogrpH8102a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH8102a.getChildAt(i);
                if (rb.isChecked()) objSave.setH8102a(d_rdogrpH8102a[i]);
            }

            objSave.setH8102b(txtH8102b.getText().toString());
            String[] d_rdogrpH8102c = new String[]{"1", "2", "3"};
            objSave.setH8102c("");
            for (int i = 0; i < rdogrpH8102c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH8102c.getChildAt(i);
                if (rb.isChecked()) objSave.setH8102c(d_rdogrpH8102c[i]);
            }

            objSave.setH8102d(txtH8102d.getText().toString());
            String[] d_rdogrpH8103a = new String[]{"1", "0"};
            objSave.setH8103a("");
            for (int i = 0; i < rdogrpH8103a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH8103a.getChildAt(i);
                if (rb.isChecked()) objSave.setH8103a(d_rdogrpH8103a[i]);
            }

            objSave.setH8103b(txtH8103b.getText().toString());
            String[] d_rdogrpH8103c = new String[]{"1", "2", "3"};
            objSave.setH8103c("");
            for (int i = 0; i < rdogrpH8103c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH8103c.getChildAt(i);
                if (rb.isChecked()) objSave.setH8103c(d_rdogrpH8103c[i]);
            }

            objSave.setH8103d(txtH8103d.getText().toString());
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

                finish();
                Bundle IDbundle1 = new Bundle();
                IDbundle1.putString("Rnd", RND);
                IDbundle1.putString("SuchanaID", SUCHANAID);
                Intent f1 = new Intent(getApplicationContext(), Cost3.class);
                f1.putExtras(IDbundle1);
                startActivity(f1);
            } else {
                Connection.MessageBox(Cost2.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(Cost2.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            Cost2_DataModel d = new Cost2_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "' and H871a NOT NULL";
            List<Cost2_DataModel> data = d.SelectAll(this, SQL);
            for (Cost2_DataModel item : data) {
                //txtRnd.setText(item.getRnd());
                //  txtSuchanaID.setText(item.getSuchanaID());
                // txtMSlNo.setText(item.getMSlNo());
                String[] d_rdogrpH871a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH871a.length; i++) {
                    if (item.getH871a().equals(String.valueOf(d_rdogrpH871a[i]))) {
                        rb = (RadioButton) rdogrpH871a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH871b.setText(item.getH871b());
                String[] d_rdogrpH871c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH871c.length; i++) {
                    if (item.getH871c().equals(String.valueOf(d_rdogrpH871c[i]))) {
                        rb = (RadioButton) rdogrpH871c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH871d.setText(item.getH871d());
                String[] d_rdogrpH872a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH872a.length; i++) {
                    if (item.getH872a().equals(String.valueOf(d_rdogrpH872a[i]))) {
                        rb = (RadioButton) rdogrpH872a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH872b.setText(item.getH872b());
                String[] d_rdogrpH872c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH872c.length; i++) {
                    if (item.getH872c().equals(String.valueOf(d_rdogrpH872c[i]))) {
                        rb = (RadioButton) rdogrpH872c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH872d.setText(item.getH872d());
                String[] d_rdogrpH873a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH873a.length; i++) {
                    if (item.getH873a().equals(String.valueOf(d_rdogrpH873a[i]))) {
                        rb = (RadioButton) rdogrpH873a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH873b.setText(item.getH873b());
                String[] d_rdogrpH873c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH873c.length; i++) {
                    if (item.getH873c().equals(String.valueOf(d_rdogrpH873c[i]))) {
                        rb = (RadioButton) rdogrpH873c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH873d.setText(item.getH873d());
                String[] d_rdogrpH874a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH874a.length; i++) {
                    if (item.getH874a().equals(String.valueOf(d_rdogrpH874a[i]))) {
                        rb = (RadioButton) rdogrpH874a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH874b.setText(item.getH874b());
                String[] d_rdogrpH874c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH874c.length; i++) {
                    if (item.getH874c().equals(String.valueOf(d_rdogrpH874c[i]))) {
                        rb = (RadioButton) rdogrpH874c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH874d.setText(item.getH874d());
                String[] d_rdogrpH875a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH875a.length; i++) {
                    if (item.getH875a().equals(String.valueOf(d_rdogrpH875a[i]))) {
                        rb = (RadioButton) rdogrpH875a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH875b.setText(item.getH875b());
                String[] d_rdogrpH875c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH875c.length; i++) {
                    if (item.getH875c().equals(String.valueOf(d_rdogrpH875c[i]))) {
                        rb = (RadioButton) rdogrpH875c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH875d.setText(item.getH875d());
                String[] d_rdogrpH881a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH881a.length; i++) {
                    if (item.getH881a().equals(String.valueOf(d_rdogrpH881a[i]))) {
                        rb = (RadioButton) rdogrpH881a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH881b.setText(item.getH881b());
                String[] d_rdogrpH881c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH881c.length; i++) {
                    if (item.getH881c().equals(String.valueOf(d_rdogrpH881c[i]))) {
                        rb = (RadioButton) rdogrpH881c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH881d.setText(item.getH881d());
                String[] d_rdogrpH882a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH882a.length; i++) {
                    if (item.getH882a().equals(String.valueOf(d_rdogrpH882a[i]))) {
                        rb = (RadioButton) rdogrpH882a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH882b.setText(item.getH882b());
                String[] d_rdogrpH882c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH882c.length; i++) {
                    if (item.getH882c().equals(String.valueOf(d_rdogrpH882c[i]))) {
                        rb = (RadioButton) rdogrpH882c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH882d.setText(item.getH882d());
                String[] d_rdogrpH883a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH883a.length; i++) {
                    if (item.getH883a().equals(String.valueOf(d_rdogrpH883a[i]))) {
                        rb = (RadioButton) rdogrpH883a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH883b.setText(item.getH883b());
                String[] d_rdogrpH883c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH883c.length; i++) {
                    if (item.getH883c().equals(String.valueOf(d_rdogrpH883c[i]))) {
                        rb = (RadioButton) rdogrpH883c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH883d.setText(item.getH883d());
                String[] d_rdogrpH884a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH884a.length; i++) {
                    if (item.getH884a().equals(String.valueOf(d_rdogrpH884a[i]))) {
                        rb = (RadioButton) rdogrpH884a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH884b.setText(item.getH884b());
                String[] d_rdogrpH884c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH884c.length; i++) {
                    if (item.getH884c().equals(String.valueOf(d_rdogrpH884c[i]))) {
                        rb = (RadioButton) rdogrpH884c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH884d.setText(item.getH884d());
                String[] d_rdogrpH885a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH885a.length; i++) {
                    if (item.getH885a().equals(String.valueOf(d_rdogrpH885a[i]))) {
                        rb = (RadioButton) rdogrpH885a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH885b.setText(item.getH885b());
                String[] d_rdogrpH885c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH885c.length; i++) {
                    if (item.getH885c().equals(String.valueOf(d_rdogrpH885c[i]))) {
                        rb = (RadioButton) rdogrpH885c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH885d.setText(item.getH885d());
                String[] d_rdogrpH891a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH891a.length; i++) {
                    if (item.getH891a().equals(String.valueOf(d_rdogrpH891a[i]))) {
                        rb = (RadioButton) rdogrpH891a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH891b.setText(item.getH891b());
                String[] d_rdogrpH891c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH891c.length; i++) {
                    if (item.getH891c().equals(String.valueOf(d_rdogrpH891c[i]))) {
                        rb = (RadioButton) rdogrpH891c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH891d.setText(item.getH891d());
                String[] d_rdogrpH8101a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH8101a.length; i++) {
                    if (item.getH8101a().equals(String.valueOf(d_rdogrpH8101a[i]))) {
                        rb = (RadioButton) rdogrpH8101a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH8101b.setText(item.getH8101b());
                String[] d_rdogrpH8101c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH8101c.length; i++) {
                    if (item.getH8101c().equals(String.valueOf(d_rdogrpH8101c[i]))) {
                        rb = (RadioButton) rdogrpH8101c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH8101d.setText(item.getH8101d());
                String[] d_rdogrpH8102a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH8102a.length; i++) {
                    if (item.getH8102a().equals(String.valueOf(d_rdogrpH8102a[i]))) {
                        rb = (RadioButton) rdogrpH8102a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH8102b.setText(item.getH8102b());
                String[] d_rdogrpH8102c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH8102c.length; i++) {
                    if (item.getH8102c().equals(String.valueOf(d_rdogrpH8102c[i]))) {
                        rb = (RadioButton) rdogrpH8102c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH8102d.setText(item.getH8102d());
                String[] d_rdogrpH8103a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH8103a.length; i++) {
                    if (item.getH8103a().equals(String.valueOf(d_rdogrpH8103a[i]))) {
                        rb = (RadioButton) rdogrpH8103a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH8103b.setText(item.getH8103b());
                String[] d_rdogrpH8103c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH8103c.length; i++) {
                    if (item.getH8103c().equals(String.valueOf(d_rdogrpH8103c[i]))) {
                        rb = (RadioButton) rdogrpH8103c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH8103d.setText(item.getH8103d());
            }
        } catch (Exception e) {
            throw e;
//            Connection.MessageBox(Cost2.this, e.getMessage());
            //          return;
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