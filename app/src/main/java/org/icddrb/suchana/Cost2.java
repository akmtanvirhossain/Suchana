package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Cost2" android:label="Cost2" />

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
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
    LinearLayout secH87;
    View lineH87;
    TextView VlblH87;
    RadioGroup rdogrpH87;
    RadioButton rdoH871;
    RadioButton rdoH872;
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
    LinearLayout secH88;
    View lineH88;
    TextView VlblH88;
    RadioGroup rdogrpH88;
    RadioButton rdoH881;
    RadioButton rdoH882;
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
    LinearLayout secH810;
    View lineH810;
    TextView VlblH810;
    RadioGroup rdogrpH810;
    RadioButton rdoH8101;
    RadioButton rdoH8102;
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
    LinearLayout secLBH811;
    LinearLayout secH8111a;
    View lineH8111a;
    TextView VlblH8111a;
    RadioGroup rdogrpH8111a;
    RadioButton rdoH8111a1;
    RadioButton rdoH8111a2;
    LinearLayout secH8111b;
    View lineH8111b;
    TextView VlblH8111b;
    EditText txtH8111b;
    LinearLayout secH8111c;
    View lineH8111c;
    TextView VlblH8111c;
    RadioGroup rdogrpH8111c;
    RadioButton rdoH8111c1;
    RadioButton rdoH8111c2;
    RadioButton rdoH8111c3;
    LinearLayout secH8111d;
    View lineH8111d;
    TextView VlblH8111d;
    EditText txtH8111d;
    LinearLayout seclbH121;
    LinearLayout secH8121a;
    View lineH8121a;
    TextView VlblH8121a;
    RadioGroup rdogrpH8121a;
    RadioButton rdoH8121a1;
    RadioButton rdoH8121a2;
    LinearLayout secH8121x1;
    View lineH8121x1;
    TextView VlblH8121x1;
    EditText txtH8121x1;
    LinearLayout secH8121b;
    View lineH8121b;
    TextView VlblH8121b;
    EditText txtH8121b;
    LinearLayout secH8121c;
    View lineH8121c;
    TextView VlblH8121c;
    RadioGroup rdogrpH8121c;
    RadioButton rdoH8121c1;
    RadioButton rdoH8121c2;
    RadioButton rdoH8121c3;
    LinearLayout secH8121d;
    View lineH8121d;
    TextView VlblH8121d;
    EditText txtH8121d;
    LinearLayout secLBH8122;
    LinearLayout secH8122a;
    View lineH8122a;
    TextView VlblH8122a;
    RadioGroup rdogrpH8122a;
    RadioButton rdoH8122a1;
    RadioButton rdoH8122a2;
    LinearLayout secH8122x1;
    View lineH8122x1;
    TextView VlblH8122x1;
    EditText txtH8122x1;
    LinearLayout secH8122b;
    View lineH8122b;
    TextView VlblH8122b;
    EditText txtH8122b;
    LinearLayout secH8122c;
    View lineH8122c;
    TextView VlblH8122c;
    RadioGroup rdogrpH8122c;
    RadioButton rdoH8122c1;
    RadioButton rdoH8122c2;
    RadioButton rdoH8122c3;
    LinearLayout secH8122d;
    View lineH8122d;
    TextView VlblH8122d;
    EditText txtH8122d;
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
                            finish();
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Cost1.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDbundle);
                            getApplicationContext().startActivity(intent);

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
            //spnMSlNo.setAdapter(C.getArrayAdapter("select H21 ||'-'||H22 from member"));
            spnMSlNo.setAdapter(C.getArrayAdapter("Select '' union select H21 ||'-'||H22 from member where Rnd='" + RND + "' and SuchanaId='" + SUCHANAID + "'"));
            secLBH87 = (LinearLayout) findViewById(R.id.secLBH87);
            secH87 = (LinearLayout) findViewById(R.id.secH87);
            lineH87 = (View) findViewById(R.id.lineH87);
            VlblH87 = (TextView) findViewById(R.id.VlblH87);
            rdogrpH87 = (RadioGroup) findViewById(R.id.rdogrpH87);

            rdoH871 = (RadioButton) findViewById(R.id.rdoH871);
            rdoH872 = (RadioButton) findViewById(R.id.rdoH872);
            rdogrpH87.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH87 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH87.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH87.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH87[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                        secH871a.setVisibility(View.VISIBLE);
                        lineH871a.setVisibility(View.VISIBLE);
                        secH872a.setVisibility(View.VISIBLE);
                        lineH872a.setVisibility(View.VISIBLE);
                        secH873a.setVisibility(View.VISIBLE);
                        lineH873a.setVisibility(View.VISIBLE);
                        secH874a.setVisibility(View.VISIBLE);
                        lineH874a.setVisibility(View.VISIBLE);
                        secH875a.setVisibility(View.VISIBLE);
                        lineH875a.setVisibility(View.VISIBLE);
                    } else {

                        secH871a.setVisibility(View.GONE);
                        lineH871a.setVisibility(View.GONE);
                        rdogrpH871a.clearCheck();
                        secH872a.setVisibility(View.GONE);
                        lineH872a.setVisibility(View.GONE);
                        rdogrpH872a.clearCheck();
                        secH873a.setVisibility(View.GONE);
                        lineH873a.setVisibility(View.GONE);
                        rdogrpH873a.clearCheck();
                        secH874a.setVisibility(View.GONE);
                        lineH874a.setVisibility(View.GONE);
                        rdogrpH874a.clearCheck();
                        secH875a.setVisibility(View.GONE);
                        lineH875a.setVisibility(View.GONE);
                        rdogrpH875a.clearCheck();
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
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

                    if (rbData.equalsIgnoreCase("1")) {
                        secH871b.setVisibility(View.VISIBLE);
                        lineH871b.setVisibility(View.VISIBLE);
                        secH871c.setVisibility(View.VISIBLE);
                        lineH871c.setVisibility(View.VISIBLE);
                        secH871d.setVisibility(View.VISIBLE);
                        lineH871d.setVisibility(View.VISIBLE);
                    } else {
                        secH871b.setVisibility(View.GONE);
                        lineH871b.setVisibility(View.GONE);
                        txtH871b.setText("");
                        secH871c.setVisibility(View.GONE);
                        lineH871c.setVisibility(View.GONE);
                        rdogrpH871c.clearCheck();
                        secH871d.setVisibility(View.GONE);
                        lineH871d.setVisibility(View.GONE);
                        txtH871d.setText("");
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

                    if (rbData.equalsIgnoreCase("1")) {
                        secH872b.setVisibility(View.VISIBLE);
                        lineH872b.setVisibility(View.VISIBLE);
                        secH872c.setVisibility(View.VISIBLE);
                        lineH872c.setVisibility(View.VISIBLE);
                        secH872d.setVisibility(View.VISIBLE);
                        lineH872d.setVisibility(View.VISIBLE);
                    } else {
                        secH872b.setVisibility(View.GONE);
                        lineH872b.setVisibility(View.GONE);
                        txtH872b.setText("");
                        secH872c.setVisibility(View.GONE);
                        lineH872c.setVisibility(View.GONE);
                        rdogrpH872c.clearCheck();
                        secH872d.setVisibility(View.GONE);
                        lineH872d.setVisibility(View.GONE);
                        txtH872d.setText("");
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

                    if (rbData.equalsIgnoreCase("1")) {
                        secH873b.setVisibility(View.VISIBLE);
                        lineH873b.setVisibility(View.VISIBLE);
                        secH873c.setVisibility(View.VISIBLE);
                        lineH873c.setVisibility(View.VISIBLE);
                        secH873d.setVisibility(View.VISIBLE);
                        lineH873d.setVisibility(View.VISIBLE);
                    } else {
                        secH873b.setVisibility(View.GONE);
                        lineH873b.setVisibility(View.GONE);
                        txtH873b.setText("");
                        secH873c.setVisibility(View.GONE);
                        lineH873c.setVisibility(View.GONE);
                        rdogrpH873c.clearCheck();
                        secH873d.setVisibility(View.GONE);
                        lineH873d.setVisibility(View.GONE);
                        txtH873d.setText("");
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

                    if (rbData.equalsIgnoreCase("1")) {
                        secH874b.setVisibility(View.VISIBLE);
                        lineH874b.setVisibility(View.VISIBLE);
                        secH874c.setVisibility(View.VISIBLE);
                        lineH874c.setVisibility(View.VISIBLE);
                        secH874d.setVisibility(View.VISIBLE);
                        lineH874d.setVisibility(View.VISIBLE);
                    } else {
                        secH874b.setVisibility(View.GONE);
                        lineH874b.setVisibility(View.GONE);
                        txtH874b.setText("");
                        secH874c.setVisibility(View.GONE);
                        lineH874c.setVisibility(View.GONE);
                        rdogrpH874c.clearCheck();
                        secH874d.setVisibility(View.GONE);
                        lineH874d.setVisibility(View.GONE);
                        txtH874d.setText("");
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

                    if (rbData.equalsIgnoreCase("1")) {
                        secH875b.setVisibility(View.VISIBLE);
                        lineH875b.setVisibility(View.VISIBLE);
                        secH875c.setVisibility(View.VISIBLE);
                        lineH875c.setVisibility(View.VISIBLE);
                        secH875d.setVisibility(View.VISIBLE);
                        lineH875d.setVisibility(View.VISIBLE);
                    } else {
                        secH875b.setVisibility(View.GONE);
                        lineH875b.setVisibility(View.GONE);
                        txtH875b.setText("");
                        secH875c.setVisibility(View.GONE);
                        lineH875c.setVisibility(View.GONE);
                        rdogrpH875c.clearCheck();
                        secH875d.setVisibility(View.GONE);
                        lineH875d.setVisibility(View.GONE);
                        txtH875d.setText("");
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
            secH88 = (LinearLayout) findViewById(R.id.secH88);
            lineH88 = (View) findViewById(R.id.lineH88);
            VlblH88 = (TextView) findViewById(R.id.VlblH88);
            rdogrpH88 = (RadioGroup) findViewById(R.id.rdogrpH88);

            rdoH881 = (RadioButton) findViewById(R.id.rdoH881);
            rdoH882 = (RadioButton) findViewById(R.id.rdoH882);
            rdogrpH88.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH88 = new String[]{"1", "2"};
                    for (int i = 0; i < rdogrpH88.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH88.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH88[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                        secH881a.setVisibility(View.VISIBLE);
                        lineH881a.setVisibility(View.VISIBLE);
                        secH882a.setVisibility(View.VISIBLE);
                        lineH882a.setVisibility(View.VISIBLE);
                        secH883a.setVisibility(View.VISIBLE);
                        lineH883a.setVisibility(View.VISIBLE);
                        secH884a.setVisibility(View.VISIBLE);
                        lineH884a.setVisibility(View.VISIBLE);
                        secH885a.setVisibility(View.VISIBLE);
                        lineH885a.setVisibility(View.VISIBLE);
                    } else {
                        secH881a.setVisibility(View.GONE);
                        lineH881a.setVisibility(View.GONE);
                        rdogrpH881a.clearCheck();
                        secH882a.setVisibility(View.GONE);
                        lineH882a.setVisibility(View.GONE);
                        rdogrpH882a.clearCheck();
                        secH883a.setVisibility(View.GONE);
                        lineH883a.setVisibility(View.GONE);
                        rdogrpH883a.clearCheck();
                        secH884a.setVisibility(View.GONE);
                        lineH884a.setVisibility(View.GONE);
                        rdogrpH884a.clearCheck();
                        secH885a.setVisibility(View.GONE);
                        lineH885a.setVisibility(View.GONE);
                        rdogrpH885a.clearCheck();
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
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

                    if (rbData.equalsIgnoreCase("1")) {
                        secH881b.setVisibility(View.VISIBLE);
                        lineH881b.setVisibility(View.VISIBLE);
                        secH881c.setVisibility(View.VISIBLE);
                        lineH881c.setVisibility(View.VISIBLE);
                        secH881d.setVisibility(View.VISIBLE);
                        lineH881d.setVisibility(View.VISIBLE);
                    } else {
                        secH881b.setVisibility(View.GONE);
                        lineH881b.setVisibility(View.GONE);
                        txtH881b.setText("");
                        secH881c.setVisibility(View.GONE);
                        lineH881c.setVisibility(View.GONE);
                        rdogrpH881c.clearCheck();
                        secH881d.setVisibility(View.GONE);
                        lineH881d.setVisibility(View.GONE);
                        txtH881d.setText("");
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

                    if (rbData.equalsIgnoreCase("1")) {
                        secH882b.setVisibility(View.VISIBLE);
                        lineH882b.setVisibility(View.VISIBLE);
                        secH882c.setVisibility(View.VISIBLE);
                        lineH882c.setVisibility(View.VISIBLE);
                        secH882d.setVisibility(View.VISIBLE);
                        lineH882d.setVisibility(View.VISIBLE);
                    } else {
                        secH882b.setVisibility(View.GONE);
                        lineH882b.setVisibility(View.GONE);
                        txtH882b.setText("");
                        secH882c.setVisibility(View.GONE);
                        lineH882c.setVisibility(View.GONE);
                        rdogrpH882c.clearCheck();
                        secH882d.setVisibility(View.GONE);
                        lineH882d.setVisibility(View.GONE);
                        txtH882d.setText("");
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

                    if (rbData.equalsIgnoreCase("1")) {
                        secH883b.setVisibility(View.VISIBLE);
                        lineH883b.setVisibility(View.VISIBLE);
                        secH883c.setVisibility(View.VISIBLE);
                        lineH883c.setVisibility(View.VISIBLE);
                        secH883d.setVisibility(View.VISIBLE);
                        lineH883d.setVisibility(View.VISIBLE);
                    } else {
                        secH883b.setVisibility(View.GONE);
                        lineH883b.setVisibility(View.GONE);
                        txtH883b.setText("");
                        secH883c.setVisibility(View.GONE);
                        lineH883c.setVisibility(View.GONE);
                        rdogrpH883c.clearCheck();
                        secH883d.setVisibility(View.GONE);
                        lineH883d.setVisibility(View.GONE);
                        txtH883d.setText("");
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

                    if (rbData.equalsIgnoreCase("1")) {
                        secH884b.setVisibility(View.VISIBLE);
                        lineH884b.setVisibility(View.VISIBLE);
                        secH884c.setVisibility(View.VISIBLE);
                        lineH884c.setVisibility(View.VISIBLE);
                        secH884d.setVisibility(View.VISIBLE);
                        lineH884d.setVisibility(View.VISIBLE);
                    } else {
                        secH884b.setVisibility(View.GONE);
                        lineH884b.setVisibility(View.GONE);
                        txtH884b.setText("");
                        secH884c.setVisibility(View.GONE);
                        lineH884c.setVisibility(View.GONE);
                        rdogrpH884c.clearCheck();
                        secH884d.setVisibility(View.GONE);
                        lineH884d.setVisibility(View.GONE);
                        txtH884d.setText("");
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

                    if (rbData.equalsIgnoreCase("1")) {
                        secH885b.setVisibility(View.VISIBLE);
                        lineH885b.setVisibility(View.VISIBLE);
                        secH885c.setVisibility(View.VISIBLE);
                        lineH885c.setVisibility(View.VISIBLE);
                        secH885d.setVisibility(View.VISIBLE);
                        lineH885d.setVisibility(View.VISIBLE);
                    } else {
                        secH885b.setVisibility(View.GONE);
                        lineH885b.setVisibility(View.GONE);
                        txtH885b.setText("");
                        secH885c.setVisibility(View.GONE);
                        lineH885c.setVisibility(View.GONE);
                        rdogrpH885c.clearCheck();
                        secH885d.setVisibility(View.GONE);
                        lineH885d.setVisibility(View.GONE);
                        txtH885d.setText("");
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

                    if (rbData.equalsIgnoreCase("1")) {
                        secH891b.setVisibility(View.VISIBLE);
                        lineH891b.setVisibility(View.VISIBLE);
                        secH891c.setVisibility(View.VISIBLE);
                        lineH891c.setVisibility(View.VISIBLE);
                        secH891d.setVisibility(View.VISIBLE);
                        lineH891d.setVisibility(View.VISIBLE);
                    } else {
                        secH891b.setVisibility(View.GONE);
                        lineH891b.setVisibility(View.GONE);
                        txtH891b.setText("");
                        secH891c.setVisibility(View.GONE);
                        lineH891c.setVisibility(View.GONE);
                        rdogrpH891c.clearCheck();
                        secH891d.setVisibility(View.GONE);
                        lineH891d.setVisibility(View.GONE);
                        txtH891d.setText("");
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
            secH810 = (LinearLayout) findViewById(R.id.secH810);
            lineH810 = (View) findViewById(R.id.lineH810);
            VlblH810 = (TextView) findViewById(R.id.VlblH810);
            rdogrpH810 = (RadioGroup) findViewById(R.id.rdogrpH810);

            rdoH8101 = (RadioButton) findViewById(R.id.rdoH8101);
            rdoH8102 = (RadioButton) findViewById(R.id.rdoH8102);
            rdogrpH810.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH810 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH810.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH810.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH810[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                        secH8101a.setVisibility(View.VISIBLE);
                        lineH8101a.setVisibility(View.VISIBLE);
                        secH8102a.setVisibility(View.VISIBLE);
                        lineH8102a.setVisibility(View.VISIBLE);
                        secH8103a.setVisibility(View.VISIBLE);
                        lineH8103a.setVisibility(View.VISIBLE);
                    } else {
                        secH8101a.setVisibility(View.GONE);
                        lineH8101a.setVisibility(View.GONE);
                        rdogrpH8101a.clearCheck();
                        secH8102a.setVisibility(View.GONE);
                        lineH8102a.setVisibility(View.GONE);
                        rdogrpH8102a.clearCheck();
                        secH8103a.setVisibility(View.GONE);
                        lineH8103a.setVisibility(View.GONE);
                        rdogrpH8103a.clearCheck();
                        txtH8103d.setText("");
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
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

                    if (rbData.equalsIgnoreCase("1")) {
                        secH8101b.setVisibility(View.VISIBLE);
                        lineH8101b.setVisibility(View.VISIBLE);
                        secH8101c.setVisibility(View.VISIBLE);
                        lineH8101c.setVisibility(View.VISIBLE);
                        secH8101d.setVisibility(View.VISIBLE);
                        lineH8101d.setVisibility(View.VISIBLE);
                    } else {
                        secH8101b.setVisibility(View.GONE);
                        lineH8101b.setVisibility(View.GONE);
                        txtH8101b.setText("");
                        secH8101c.setVisibility(View.GONE);
                        lineH8101c.setVisibility(View.GONE);
                        rdogrpH8101c.clearCheck();
                        secH8101d.setVisibility(View.GONE);
                        lineH8101d.setVisibility(View.GONE);
                        txtH8101d.setText("");
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

                    if (rbData.equalsIgnoreCase("1")) {
                        secH8102b.setVisibility(View.VISIBLE);
                        lineH8102b.setVisibility(View.VISIBLE);
                        secH8102c.setVisibility(View.VISIBLE);
                        lineH8102c.setVisibility(View.VISIBLE);
                        secH8102d.setVisibility(View.VISIBLE);
                        lineH8102d.setVisibility(View.VISIBLE);
                    } else {
                        secH8102b.setVisibility(View.GONE);
                        lineH8102b.setVisibility(View.GONE);
                        txtH8102b.setText("");
                        secH8102c.setVisibility(View.GONE);
                        lineH8102c.setVisibility(View.GONE);
                        rdogrpH8102c.clearCheck();
                        secH8102d.setVisibility(View.GONE);
                        lineH8102d.setVisibility(View.GONE);
                        txtH8102d.setText("");
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

                    if (rbData.equalsIgnoreCase("1")) {
                        secH8103b.setVisibility(View.VISIBLE);
                        lineH8103b.setVisibility(View.VISIBLE);
                        secH8103c.setVisibility(View.VISIBLE);
                        lineH8103c.setVisibility(View.VISIBLE);
                        secH8103d.setVisibility(View.VISIBLE);
                        lineH8103d.setVisibility(View.VISIBLE);
                    } else {
                        secH8103b.setVisibility(View.GONE);
                        lineH8103b.setVisibility(View.GONE);
                        txtH8103b.setText("");
                        secH8103c.setVisibility(View.GONE);
                        lineH8103c.setVisibility(View.GONE);
                        rdogrpH8103c.clearCheck();
                        secH8103d.setVisibility(View.GONE);
                        lineH8103d.setVisibility(View.GONE);
                        txtH8102d.setText("");
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
            secLBH811 = (LinearLayout) findViewById(R.id.secLBH811);
            secH8111a = (LinearLayout) findViewById(R.id.secH8111a);
            lineH8111a = (View) findViewById(R.id.lineH8111a);
            VlblH8111a = (TextView) findViewById(R.id.VlblH8111a);
            rdogrpH8111a = (RadioGroup) findViewById(R.id.rdogrpH8111a);

            rdoH8111a1 = (RadioButton) findViewById(R.id.rdoH8111a1);
            rdoH8111a2 = (RadioButton) findViewById(R.id.rdoH8111a2);
            rdogrpH8111a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH8111a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH8111a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH8111a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH8111a[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                        secH8111b.setVisibility(View.VISIBLE);
                        lineH8111b.setVisibility(View.VISIBLE);
                        secH8111c.setVisibility(View.VISIBLE);
                        lineH8111c.setVisibility(View.VISIBLE);
                        secH8111d.setVisibility(View.VISIBLE);
                    } else {
                        secH8111b.setVisibility(View.GONE);
                        lineH8111b.setVisibility(View.GONE);
                        txtH8111b.setText("");
                        secH8111c.setVisibility(View.GONE);
                        lineH8111c.setVisibility(View.GONE);
                        rdogrpH8111c.clearCheck();
                        secH8111d.setVisibility(View.GONE);
                        txtH8111d.setText("");
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH8111b = (LinearLayout) findViewById(R.id.secH8111b);
            lineH8111b = (View) findViewById(R.id.lineH8111b);
            VlblH8111b = (TextView) findViewById(R.id.VlblH8111b);
            txtH8111b = (EditText) findViewById(R.id.txtH8111b);
            secH8111c = (LinearLayout) findViewById(R.id.secH8111c);
            lineH8111c = (View) findViewById(R.id.lineH8111c);
            VlblH8111c = (TextView) findViewById(R.id.VlblH8111c);
            rdogrpH8111c = (RadioGroup) findViewById(R.id.rdogrpH8111c);

            rdoH8111c1 = (RadioButton) findViewById(R.id.rdoH8111c1);
            rdoH8111c2 = (RadioButton) findViewById(R.id.rdoH8111c2);
            rdoH8111c3 = (RadioButton) findViewById(R.id.rdoH8111c3);
            secH8111d = (LinearLayout) findViewById(R.id.secH8111d);
            lineH8111d = (View) findViewById(R.id.lineH8111d);
            VlblH8111d = (TextView) findViewById(R.id.VlblH8111d);
            txtH8111d = (EditText) findViewById(R.id.txtH8111d);
            seclbH121 = (LinearLayout) findViewById(R.id.seclbH121);
            secH8121a = (LinearLayout) findViewById(R.id.secH8121a);
            lineH8121a = (View) findViewById(R.id.lineH8121a);
            VlblH8121a = (TextView) findViewById(R.id.VlblH8121a);
            rdogrpH8121a = (RadioGroup) findViewById(R.id.rdogrpH8121a);

            rdoH8121a1 = (RadioButton) findViewById(R.id.rdoH8121a1);
            rdoH8121a2 = (RadioButton) findViewById(R.id.rdoH8121a2);
            rdogrpH8121a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH8121a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH8121a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH8121a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH8121a[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                        secH8121x1.setVisibility(View.VISIBLE);
                        lineH8121x1.setVisibility(View.VISIBLE);
                        secH8121b.setVisibility(View.VISIBLE);
                        lineH8121b.setVisibility(View.VISIBLE);
                        secH8121c.setVisibility(View.VISIBLE);
                        lineH8121c.setVisibility(View.VISIBLE);
                        secH8121d.setVisibility(View.VISIBLE);
                    } else {
                        secH8121x1.setVisibility(View.GONE);
                        lineH8121x1.setVisibility(View.GONE);
                        txtH8121x1.setText("");
                        secH8121b.setVisibility(View.GONE);
                        lineH8121b.setVisibility(View.GONE);
                        txtH8121b.setText("");
                        secH8121c.setVisibility(View.GONE);
                        lineH8121c.setVisibility(View.GONE);
                        rdogrpH8121c.clearCheck();
                        secH8121d.setVisibility(View.GONE);
                        txtH8121d.setText("");
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH8121x1 = (LinearLayout) findViewById(R.id.secH8121x1);
            lineH8121x1 = (View) findViewById(R.id.lineH8121x1);
            VlblH8121x1 = (TextView) findViewById(R.id.VlblH8121x1);
            txtH8121x1 = (EditText) findViewById(R.id.txtH8121x1);
            secH8121b = (LinearLayout) findViewById(R.id.secH8121b);
            lineH8121b = (View) findViewById(R.id.lineH8121b);
            VlblH8121b = (TextView) findViewById(R.id.VlblH8121b);
            txtH8121b = (EditText) findViewById(R.id.txtH8121b);
            secH8121c = (LinearLayout) findViewById(R.id.secH8121c);
            lineH8121c = (View) findViewById(R.id.lineH8121c);
            VlblH8121c = (TextView) findViewById(R.id.VlblH8121c);
            rdogrpH8121c = (RadioGroup) findViewById(R.id.rdogrpH8121c);

            rdoH8121c1 = (RadioButton) findViewById(R.id.rdoH8121c1);
            rdoH8121c2 = (RadioButton) findViewById(R.id.rdoH8121c2);
            rdoH8121c3 = (RadioButton) findViewById(R.id.rdoH8121c3);
            secH8121d = (LinearLayout) findViewById(R.id.secH8121d);
            lineH8121d = (View) findViewById(R.id.lineH8121d);
            VlblH8121d = (TextView) findViewById(R.id.VlblH8121d);
            txtH8121d = (EditText) findViewById(R.id.txtH8121d);
            secLBH8122 = (LinearLayout) findViewById(R.id.secLBH8122);
            secH8122a = (LinearLayout) findViewById(R.id.secH8122a);
            lineH8122a = (View) findViewById(R.id.lineH8122a);
            VlblH8122a = (TextView) findViewById(R.id.VlblH8122a);
            rdogrpH8122a = (RadioGroup) findViewById(R.id.rdogrpH8122a);

            rdoH8122a1 = (RadioButton) findViewById(R.id.rdoH8122a1);
            rdoH8122a2 = (RadioButton) findViewById(R.id.rdoH8122a2);
            rdogrpH8122a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH8122a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH8122a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH8122a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH8122a[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                        secH8122x1.setVisibility(View.VISIBLE);
                        lineH8122x1.setVisibility(View.VISIBLE);
                        secH8122b.setVisibility(View.VISIBLE);
                        lineH8122b.setVisibility(View.VISIBLE);
                        secH8122c.setVisibility(View.VISIBLE);
                        lineH8122c.setVisibility(View.VISIBLE);
                    } else {
                        secH8122x1.setVisibility(View.GONE);
                        lineH8122x1.setVisibility(View.GONE);
                        txtH8122x1.setText("");
                        secH8122b.setVisibility(View.GONE);
                        lineH8122b.setVisibility(View.GONE);
                        txtH8122b.setText("");
                        secH8122c.setVisibility(View.GONE);
                        lineH8122c.setVisibility(View.GONE);
                        rdogrpH8122c.clearCheck();
                        secH8122d.setVisibility(View.GONE);
                        txtH8122d.setVisibility(View.GONE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH8122x1 = (LinearLayout) findViewById(R.id.secH8122x1);
            lineH8122x1 = (View) findViewById(R.id.lineH8122x1);
            VlblH8122x1 = (TextView) findViewById(R.id.VlblH8122x1);
            txtH8122x1 = (EditText) findViewById(R.id.txtH8122x1);
            secH8122b = (LinearLayout) findViewById(R.id.secH8122b);
            lineH8122b = (View) findViewById(R.id.lineH8122b);
            VlblH8122b = (TextView) findViewById(R.id.VlblH8122b);
            txtH8122b = (EditText) findViewById(R.id.txtH8122b);
            secH8122c = (LinearLayout) findViewById(R.id.secH8122c);
            lineH8122c = (View) findViewById(R.id.lineH8122c);
            VlblH8122c = (TextView) findViewById(R.id.VlblH8122c);
            rdogrpH8122c = (RadioGroup) findViewById(R.id.rdogrpH8122c);

            rdoH8122c1 = (RadioButton) findViewById(R.id.rdoH8122c1);
            rdoH8122c2 = (RadioButton) findViewById(R.id.rdoH8122c2);
            rdoH8122c3 = (RadioButton) findViewById(R.id.rdoH8122c3);
            secH8122d = (LinearLayout) findViewById(R.id.secH8122d);
            lineH8122d = (View) findViewById(R.id.lineH8122d);
            VlblH8122d = (TextView) findViewById(R.id.VlblH8122d);
            txtH8122d = (EditText) findViewById(R.id.txtH8122d);


            //Hide all skip variables
            secH871a.setVisibility(View.GONE);
            lineH871a.setVisibility(View.GONE);
            secH872a.setVisibility(View.GONE);
            lineH872a.setVisibility(View.GONE);
            secH873a.setVisibility(View.GONE);
            lineH873a.setVisibility(View.GONE);
            secH874a.setVisibility(View.GONE);
            lineH874a.setVisibility(View.GONE);
            secH875a.setVisibility(View.GONE);
            lineH875a.setVisibility(View.GONE);
            secH871b.setVisibility(View.GONE);
            lineH871b.setVisibility(View.GONE);
            secH871c.setVisibility(View.GONE);
            lineH871c.setVisibility(View.GONE);
            secH871d.setVisibility(View.GONE);
            lineH871d.setVisibility(View.GONE);
            secH872b.setVisibility(View.GONE);
            lineH872b.setVisibility(View.GONE);
            secH872c.setVisibility(View.GONE);
            lineH872c.setVisibility(View.GONE);
            secH872d.setVisibility(View.GONE);
            lineH872d.setVisibility(View.GONE);
            secH873b.setVisibility(View.GONE);
            lineH873b.setVisibility(View.GONE);
            secH873c.setVisibility(View.GONE);
            lineH873c.setVisibility(View.GONE);
            secH873d.setVisibility(View.GONE);
            lineH873d.setVisibility(View.GONE);
            secH874b.setVisibility(View.GONE);
            lineH874b.setVisibility(View.GONE);
            secH874c.setVisibility(View.GONE);
            lineH874c.setVisibility(View.GONE);
            secH874d.setVisibility(View.GONE);
            lineH874d.setVisibility(View.GONE);
            secH875b.setVisibility(View.GONE);
            lineH875b.setVisibility(View.GONE);
            secH875c.setVisibility(View.GONE);
            lineH875c.setVisibility(View.GONE);
            secH875d.setVisibility(View.GONE);
            lineH875d.setVisibility(View.GONE);
            secH881a.setVisibility(View.GONE);
            lineH881a.setVisibility(View.GONE);
            secH882a.setVisibility(View.GONE);
            lineH882a.setVisibility(View.GONE);
            secH883a.setVisibility(View.GONE);
            lineH883a.setVisibility(View.GONE);
            secH884a.setVisibility(View.GONE);
            lineH884a.setVisibility(View.GONE);
            secH885a.setVisibility(View.GONE);
            lineH885a.setVisibility(View.GONE);
            secH881b.setVisibility(View.GONE);
            lineH881b.setVisibility(View.GONE);
            secH881c.setVisibility(View.GONE);
            lineH881c.setVisibility(View.GONE);
            secH881d.setVisibility(View.GONE);
            lineH881d.setVisibility(View.GONE);
            secH882b.setVisibility(View.GONE);
            lineH882b.setVisibility(View.GONE);
            secH882c.setVisibility(View.GONE);
            lineH882c.setVisibility(View.GONE);
            secH882d.setVisibility(View.GONE);
            lineH882d.setVisibility(View.GONE);
            secH883b.setVisibility(View.GONE);
            lineH883b.setVisibility(View.GONE);
            secH883c.setVisibility(View.GONE);
            lineH883c.setVisibility(View.GONE);
            secH883d.setVisibility(View.GONE);
            lineH883d.setVisibility(View.GONE);
            secH884b.setVisibility(View.GONE);
            lineH884b.setVisibility(View.GONE);
            secH884c.setVisibility(View.GONE);
            lineH884c.setVisibility(View.GONE);
            secH884d.setVisibility(View.GONE);
            lineH884d.setVisibility(View.GONE);
            secH885b.setVisibility(View.GONE);
            lineH885b.setVisibility(View.GONE);
            secH885c.setVisibility(View.GONE);
            lineH885c.setVisibility(View.GONE);
            secH885d.setVisibility(View.GONE);
            lineH885d.setVisibility(View.GONE);
            secH891b.setVisibility(View.GONE);
            lineH891b.setVisibility(View.GONE);
            secH891c.setVisibility(View.GONE);
            lineH891c.setVisibility(View.GONE);
            secH891d.setVisibility(View.GONE);
            lineH891d.setVisibility(View.GONE);
            secH8101a.setVisibility(View.GONE);
            lineH8101a.setVisibility(View.GONE);
            secH8102a.setVisibility(View.GONE);
            lineH8102a.setVisibility(View.GONE);
            secH8103a.setVisibility(View.GONE);
            lineH8103a.setVisibility(View.GONE);
            secH8101b.setVisibility(View.GONE);
            lineH8101b.setVisibility(View.GONE);
            secH8101c.setVisibility(View.GONE);
            lineH8101c.setVisibility(View.GONE);
            secH8101d.setVisibility(View.GONE);
            lineH8101d.setVisibility(View.GONE);
            secH8102b.setVisibility(View.GONE);
            lineH8102b.setVisibility(View.GONE);
            secH8102c.setVisibility(View.GONE);
            lineH8102c.setVisibility(View.GONE);
            secH8102d.setVisibility(View.GONE);
            lineH8102d.setVisibility(View.GONE);
            secH8103b.setVisibility(View.GONE);
            lineH8103b.setVisibility(View.GONE);
            secH8103c.setVisibility(View.GONE);
            lineH8103c.setVisibility(View.GONE);
            secH8103d.setVisibility(View.GONE);
            secH8111b.setVisibility(View.GONE);
            secH8111c.setVisibility(View.GONE);
            secH8121x1.setVisibility(View.GONE);
            secH8121b.setVisibility(View.GONE);
            secH8121c.setVisibility(View.GONE);
            secH8122x1.setVisibility(View.GONE);
            secH8122b.setVisibility(View.GONE);
            secH8122c.setVisibility(View.GONE);




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
//            Connection.MessageBox(Cost2.this, e.getMessage());
            //          return;
            throw e;
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
            } else if (spnMSlNo.getSelectedItemPosition() == 0 & secMSlNo.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: তথ্যদানে সহায়তাকারীর লাইন নম্বর.");
                spnMSlNo.requestFocus();
                return;
            } else if (!rdoH871.isChecked() & !rdoH872.isChecked() & secH87.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (আপনি গত মাসে সবজি/ফল ক্রয় করেছেন?).");
                rdoH871.requestFocus();
                return;
            } else if (!rdoH871a1.isChecked() & !rdoH871a2.isChecked() & secH871a.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (পাতাওয়ালা সবজি   কিনেছে).");
                rdoH871a1.requestFocus();
                return;
            } else if (txtH871b.getText().toString().length() == 0 & secH871b.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH871b.requestFocus();
                return;
            } else if (Double.valueOf(txtH871b.getText().toString().length() == 0 ? "0" : txtH871b.getText().toString()) < 0 || Double.valueOf(txtH871b.getText().toString().length() == 0 ? "999999" : txtH871b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
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
            } else if (Double.valueOf(txtH871d.getText().toString().length() == 0 ? "0" : txtH871d.getText().toString()) < 0 || Double.valueOf(txtH871d.getText().toString().length() == 0 ? "999999" : txtH871d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
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
            } else if (Double.valueOf(txtH872b.getText().toString().length() == 0 ? "0" : txtH872b.getText().toString()) < 0 || Double.valueOf(txtH872b.getText().toString().length() == 0 ? "999999" : txtH872b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
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
            } else if (Double.valueOf(txtH872d.getText().toString().length() == 0 ? "0" : txtH872d.getText().toString()) < 0 || Double.valueOf(txtH872d.getText().toString().length() == 0 ? "999999" : txtH872d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
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
            } else if (Double.valueOf(txtH873b.getText().toString().length() == 0 ? "0" : txtH873b.getText().toString()) < 0 || Double.valueOf(txtH873b.getText().toString().length() == 0 ? "999999" : txtH873b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
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
            } else if (Double.valueOf(txtH873d.getText().toString().length() == 0 ? "0" : txtH873d.getText().toString()) < 0 || Double.valueOf(txtH873d.getText().toString().length() == 0 ? "999999" : txtH873d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
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
            } else if (Double.valueOf(txtH874b.getText().toString().length() == 0 ? "0" : txtH874b.getText().toString()) < 0 || Double.valueOf(txtH874b.getText().toString().length() == 0 ? "999999" : txtH874b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
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
            } else if (Double.valueOf(txtH874d.getText().toString().length() == 0 ? "0" : txtH874d.getText().toString()) < 0 || Double.valueOf(txtH874d.getText().toString().length() == 0 ? "999999" : txtH874d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
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
            } else if (Double.valueOf(txtH875b.getText().toString().length() == 0 ? "0" : txtH875b.getText().toString()) < 0 || Double.valueOf(txtH875b.getText().toString().length() == 0 ? "999999" : txtH875b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
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
            } else if (Double.valueOf(txtH875d.getText().toString().length() == 0 ? "0" : txtH875d.getText().toString()) < 0 || Double.valueOf(txtH875d.getText().toString().length() == 0 ? "999999" : txtH875d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH875d.requestFocus();
                return;
            } else if (!rdoH881.isChecked() & !rdoH882.isChecked() & secH88.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (আপনি গত মাসে  গুড়া মশলা ক্রয় করেছেন).");
                rdoH881.requestFocus();
                return;
            } else if (!rdoH881a1.isChecked() & !rdoH881a2.isChecked() & secH881a.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from ( পেঁয়াজ  কিনেছে).");
                rdoH881a1.requestFocus();
                return;
            } else if (txtH881b.getText().toString().length() == 0 & secH881b.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH881b.requestFocus();
                return;
            } else if (Double.valueOf(txtH881b.getText().toString().length() == 0 ? "0" : txtH881b.getText().toString()) < 0 || Double.valueOf(txtH881b.getText().toString().length() == 0 ? "999999" : txtH881b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
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
            } else if (Double.valueOf(txtH881d.getText().toString().length() == 0 ? "0" : txtH881d.getText().toString()) < 0 || Double.valueOf(txtH881d.getText().toString().length() == 0 ? "999999" : txtH881d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
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
            } else if (Double.valueOf(txtH882b.getText().toString().length() == 0 ? "0" : txtH882b.getText().toString()) < 0 || Double.valueOf(txtH882b.getText().toString().length() == 0 ? "999999" : txtH882b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
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
            } else if (Double.valueOf(txtH882d.getText().toString().length() == 0 ? "0" : txtH882d.getText().toString()) < 0 || Double.valueOf(txtH882d.getText().toString().length() == 0 ? "999999" : txtH882d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
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
            } else if (Double.valueOf(txtH883b.getText().toString().length() == 0 ? "0" : txtH883b.getText().toString()) < 0 || Double.valueOf(txtH883b.getText().toString().length() == 0 ? "999999" : txtH883b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
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
            } else if (Double.valueOf(txtH883d.getText().toString().length() == 0 ? "0" : txtH883d.getText().toString()) < 0 || Double.valueOf(txtH883d.getText().toString().length() == 0 ? "999999" : txtH883d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
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
            } else if (Double.valueOf(txtH884b.getText().toString().length() == 0 ? "0" : txtH884b.getText().toString()) < 0 || Double.valueOf(txtH884b.getText().toString().length() == 0 ? "999999" : txtH884b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
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
            } else if (Double.valueOf(txtH884d.getText().toString().length() == 0 ? "0" : txtH884d.getText().toString()) < 0 || Double.valueOf(txtH884d.getText().toString().length() == 0 ? "999999" : txtH884d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
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
            } else if (Double.valueOf(txtH885b.getText().toString().length() == 0 ? "0" : txtH885b.getText().toString()) < 0 || Double.valueOf(txtH885b.getText().toString().length() == 0 ? "999999" : txtH885b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
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
            } else if (Double.valueOf(txtH885d.getText().toString().length() == 0 ? "0" : txtH885d.getText().toString()) < 0 || Double.valueOf(txtH885d.getText().toString().length() == 0 ? "999999" : txtH885d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
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
            } else if (Double.valueOf(txtH891b.getText().toString().length() == 0 ? "0" : txtH891b.getText().toString()) < 0 || Double.valueOf(txtH891b.getText().toString().length() == 0 ? "999999" : txtH891b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
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
            } else if (Double.valueOf(txtH891d.getText().toString().length() == 0 ? "0" : txtH891d.getText().toString()) < 0 || Double.valueOf(txtH891d.getText().toString().length() == 0 ? "999999" : txtH891d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH891d.requestFocus();
                return;
            } else if (!rdoH8101.isChecked() & !rdoH8102.isChecked() & secH810.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (আপনি গতমাসে কোনো চা/  চিনি ক্রয় করেছেন?).");
                rdoH8101.requestFocus();
                return;
            } else if (!rdoH8101a1.isChecked() & !rdoH8101a2.isChecked() & secH8101a.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (চা  কিনেছে).");
                rdoH8101a1.requestFocus();
                return;
            } else if (txtH8101b.getText().toString().length() == 0 & secH8101b.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH8101b.requestFocus();
                return;
            } else if (Double.valueOf(txtH8101b.getText().toString().length() == 0 ? "0" : txtH8101b.getText().toString()) < 0 || Double.valueOf(txtH8101b.getText().toString().length() == 0 ? "999999" : txtH8101b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
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
            } else if (Double.valueOf(txtH8101d.getText().toString().length() == 0 ? "0" : txtH8101d.getText().toString()) < 0 || Double.valueOf(txtH8101d.getText().toString().length() == 0 ? "999999" : txtH8101d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
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
            } else if (Double.valueOf(txtH8102b.getText().toString().length() == 0 ? "0" : txtH8102b.getText().toString()) < 0 || Double.valueOf(txtH8102b.getText().toString().length() == 0 ? "999999" : txtH8102b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
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
            } else if (Double.valueOf(txtH8102d.getText().toString().length() == 0 ? "0" : txtH8102d.getText().toString()) < 0 || Double.valueOf(txtH8102d.getText().toString().length() == 0 ? "999999" : txtH8102d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
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
            } else if (Double.valueOf(txtH8103b.getText().toString().length() == 0 ? "0" : txtH8103b.getText().toString()) < 0 || Double.valueOf(txtH8103b.getText().toString().length() == 0 ? "999999" : txtH8103b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
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
            } else if (Double.valueOf(txtH8103d.getText().toString().length() == 0 ? "0" : txtH8103d.getText().toString()) < 0 || Double.valueOf(txtH8103d.getText().toString().length() == 0 ? "999999" : txtH8103d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH8103d.requestFocus();
                return;
            } else if (!rdoH8111a1.isChecked() & !rdoH8111a2.isChecked() & secH8111a.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (পান সুপারি কিনেছে).");
                rdoH8111a1.requestFocus();
                return;
            } else if (txtH8111b.getText().toString().length() == 0 & secH8111b.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH8111b.requestFocus();
                return;
            } else if (Double.valueOf(txtH8111b.getText().toString().length() == 0 ? "0" : txtH8111b.getText().toString()) < 0 || Double.valueOf(txtH8111b.getText().toString().length() == 0 ? "999999" : txtH8111b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
                txtH8111b.requestFocus();
                return;
            } else if (!rdoH8111c1.isChecked() & !rdoH8111c2.isChecked() & !rdoH8111c3.isChecked() & secH8111c.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (ইউনিট ).");
                rdoH8111c1.requestFocus();
                return;
            } else if (txtH8111d.getText().toString().length() == 0 & secH8111d.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH8111d.requestFocus();
                return;
            } else if (Double.valueOf(txtH8111d.getText().toString().length() == 0 ? "0" : txtH8111d.getText().toString()) < 0 || Double.valueOf(txtH8111d.getText().toString().length() == 0 ? "999999" : txtH8111d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH8111d.requestFocus();
                return;
            } else if (!rdoH8121a1.isChecked() & !rdoH8121a2.isChecked() & secH8121a.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (অন্যান্য কিনেছে).");
                rdoH8121a1.requestFocus();
                return;
            } else if (txtH8121x1.getText().toString().length() == 0 & secH8121x1.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: অন্যান্য নির্দিষ্ট করুন.");
                txtH8121x1.requestFocus();
                return;
            } else if (txtH8121b.getText().toString().length() == 0 & secH8121b.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH8121b.requestFocus();
                return;
            } else if (Double.valueOf(txtH8121b.getText().toString().length() == 0 ? "0" : txtH8121b.getText().toString()) < 0 || Double.valueOf(txtH8121b.getText().toString().length() == 0 ? "999999" : txtH8121b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
                txtH8121b.requestFocus();
                return;
            } else if (!rdoH8121c1.isChecked() & !rdoH8121c2.isChecked() & !rdoH8121c3.isChecked() & secH8121c.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (ইউনিট ).");
                rdoH8121c1.requestFocus();
                return;
            } else if (txtH8121d.getText().toString().length() == 0 & secH8121d.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH8121d.requestFocus();
                return;
            } else if (Double.valueOf(txtH8121d.getText().toString().length() == 0 ? "0" : txtH8121d.getText().toString()) < 0 || Double.valueOf(txtH8121d.getText().toString().length() == 0 ? "999999" : txtH8121d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH8121d.requestFocus();
                return;
            } else if (!rdoH8122a1.isChecked() & !rdoH8122a2.isChecked() & secH8122a.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (অন্যান্য2  কিনেছে).");
                rdoH8122a1.requestFocus();
                return;
            } else if (txtH8122x1.getText().toString().length() == 0 & secH8122x1.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: অন্যান্য নির্দিষ্ট করুন.");
                txtH8122x1.requestFocus();
                return;
            } else if (txtH8122b.getText().toString().length() == 0 & secH8122b.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH8122b.requestFocus();
                return;
            } else if (Double.valueOf(txtH8122b.getText().toString().length() == 0 ? "0" : txtH8122b.getText().toString()) < 0 || Double.valueOf(txtH8122b.getText().toString().length() == 0 ? "999999" : txtH8122b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
                txtH8122b.requestFocus();
                return;
            } else if (!rdoH8122c1.isChecked() & !rdoH8122c2.isChecked() & !rdoH8122c3.isChecked() & secH8122c.isShown()) {
                Connection.MessageBox(Cost2.this, "Select anyone options from (ইউনিট ).");
                rdoH8122c1.requestFocus();
                return;
            } else if (txtH8122d.getText().toString().length() == 0 & secH8122d.isShown()) {
                Connection.MessageBox(Cost2.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH8122d.requestFocus();
                return;
            } else if (Double.valueOf(txtH8122d.getText().toString().length() == 0 ? "0" : txtH8122d.getText().toString()) < 0 || Double.valueOf(txtH8122d.getText().toString().length() == 0 ? "999999" : txtH8122d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost2.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH8122d.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            Cost2_DataModel objSave = new Cost2_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setMSlNo((spnMSlNo.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnMSlNo.getSelectedItem().toString(), "-")));
            String[] d_rdogrpH87 = new String[]{"1", "0"};
            objSave.setH87("");
            for (int i = 0; i < rdogrpH87.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH87.getChildAt(i);
                if (rb.isChecked()) objSave.setH87(d_rdogrpH87[i]);
            }

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
            String[] d_rdogrpH88 = new String[]{"1", "2"};
            objSave.setH88("");
            for (int i = 0; i < rdogrpH88.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH88.getChildAt(i);
                if (rb.isChecked()) objSave.setH88(d_rdogrpH88[i]);
            }

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
            String[] d_rdogrpH810 = new String[]{"1", "0"};
            objSave.setH810("");
            for (int i = 0; i < rdogrpH810.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH810.getChildAt(i);
                if (rb.isChecked()) objSave.setH810(d_rdogrpH810[i]);
            }

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
            String[] d_rdogrpH8111a = new String[]{"1", "0"};
            objSave.setH8111a("");
            for (int i = 0; i < rdogrpH8111a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH8111a.getChildAt(i);
                if (rb.isChecked()) objSave.setH8111a(d_rdogrpH8111a[i]);
            }

            objSave.setH8111b(txtH8111b.getText().toString());
            String[] d_rdogrpH8111c = new String[]{"1", "2", "3"};
            objSave.setH8111c("");
            for (int i = 0; i < rdogrpH8111c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH8111c.getChildAt(i);
                if (rb.isChecked()) objSave.setH8111c(d_rdogrpH8111c[i]);
            }

            objSave.setH8111d(txtH8111d.getText().toString());
            String[] d_rdogrpH8121a = new String[]{"1", "0"};
            objSave.setH8121a("");
            for (int i = 0; i < rdogrpH8121a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH8121a.getChildAt(i);
                if (rb.isChecked()) objSave.setH8121a(d_rdogrpH8121a[i]);
            }

            objSave.setH8121x1(txtH8121x1.getText().toString());
            objSave.setH8121b(txtH8121b.getText().toString());
            String[] d_rdogrpH8121c = new String[]{"1", "2", "3"};
            objSave.setH8121c("");
            for (int i = 0; i < rdogrpH8121c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH8121c.getChildAt(i);
                if (rb.isChecked()) objSave.setH8121c(d_rdogrpH8121c[i]);
            }

            objSave.setH8121d(txtH8121d.getText().toString());
            String[] d_rdogrpH8122a = new String[]{"1", "0"};
            objSave.setH8122a("");
            for (int i = 0; i < rdogrpH8122a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH8122a.getChildAt(i);
                if (rb.isChecked()) objSave.setH8122a(d_rdogrpH8122a[i]);
            }

            objSave.setH8122x1(txtH8122x1.getText().toString());
            objSave.setH8122b(txtH8122b.getText().toString());
            String[] d_rdogrpH8122c = new String[]{"1", "2", "3"};
            objSave.setH8122c("");
            for (int i = 0; i < rdogrpH8122c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH8122c.getChildAt(i);
                if (rb.isChecked()) objSave.setH8122c(d_rdogrpH8122c[i]);
            }

            objSave.setH8122d(txtH8122d.getText().toString());
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
                // txtSuchanaID.setText(item.getSuchanaID());
                spnMSlNo.setSelection(Global.SpinnerItemPositionAnyLength(spnMSlNo, item.getMSlNo()));
                String[] d_rdogrpH87 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH87.length; i++) {
                    if (item.getH87().equals(String.valueOf(d_rdogrpH87[i]))) {
                        rb = (RadioButton) rdogrpH87.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
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
                String[] d_rdogrpH88 = new String[]{"1", "2"};
                for (int i = 0; i < d_rdogrpH88.length; i++) {
                    if (item.getH88().equals(String.valueOf(d_rdogrpH88[i]))) {
                        rb = (RadioButton) rdogrpH88.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
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
                String[] d_rdogrpH810 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH810.length; i++) {
                    if (item.getH810().equals(String.valueOf(d_rdogrpH810[i]))) {
                        rb = (RadioButton) rdogrpH810.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
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
                String[] d_rdogrpH8111a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH8111a.length; i++) {
                    if (item.getH8111a().equals(String.valueOf(d_rdogrpH8111a[i]))) {
                        rb = (RadioButton) rdogrpH8111a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH8111b.setText(item.getH8111b());
                String[] d_rdogrpH8111c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH8111c.length; i++) {
                    if (item.getH8111c().equals(String.valueOf(d_rdogrpH8111c[i]))) {
                        rb = (RadioButton) rdogrpH8111c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH8111d.setText(item.getH8111d());
                String[] d_rdogrpH8121a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH8121a.length; i++) {
                    if (item.getH8121a().equals(String.valueOf(d_rdogrpH8121a[i]))) {
                        rb = (RadioButton) rdogrpH8121a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH8121x1.setText(item.getH8121x1());
                txtH8121b.setText(item.getH8121b());
                String[] d_rdogrpH8121c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH8121c.length; i++) {
                    if (item.getH8121c().equals(String.valueOf(d_rdogrpH8121c[i]))) {
                        rb = (RadioButton) rdogrpH8121c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH8121d.setText(item.getH8121d());
                String[] d_rdogrpH8122a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH8122a.length; i++) {
                    if (item.getH8122a().equals(String.valueOf(d_rdogrpH8122a[i]))) {
                        rb = (RadioButton) rdogrpH8122a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH8122x1.setText(item.getH8122x1());
                txtH8122b.setText(item.getH8122b());
                String[] d_rdogrpH8122c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH8122c.length; i++) {
                    if (item.getH8122c().equals(String.valueOf(d_rdogrpH8122c[i]))) {
                        rb = (RadioButton) rdogrpH8122c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH8122d.setText(item.getH8122d());
            }
        } catch (Exception e) {
            Connection.MessageBox(Cost2.this, e.getMessage());
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