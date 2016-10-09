package org.icddrb.suchana;
//Android Manifest Code
//<activity android:name=".Knowledge" android:label="Knowledge" />

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
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

public class Knowledge extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    static String MSLNUMBER = "";
    static String MSL = "";
    boolean networkAvailable=false;
    Location currentLocation;
    double currentLatitude,currentLongitude;
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
    LinearLayout secSuchanaId;
    View lineSuchanaId;
    TextView VlblSuchanaId;
    EditText txtSuchanaId;
    LinearLayout secMSLNumber;
    View lineMSLNumber;
    TextView VlblMSLNumber;
    Spinner spnMSlNo;
    LinearLayout secLbM2;
    LinearLayout secM212;
    View lineM212;
    TextView VlblM212;
    RadioGroup rdogrpM212;
    RadioButton rdoM2121;
    RadioButton rdoM2122;
    LinearLayout secLbM213;
    LinearLayout secM213a;
    View lineM213a;
    TextView VlblM213a;
    CheckBox chkM213a;
    LinearLayout secM213b;
    View lineM213b;
    TextView VlblM213b;
    CheckBox chkM213b;
    LinearLayout secM213c;
    View lineM213c;
    TextView VlblM213c;
    CheckBox chkM213c;
    LinearLayout secM213x;
    View lineM213x;
    TextView VlblM213x;
    CheckBox chkM213x;
    LinearLayout secM213x1;
    View lineM213x1;
    TextView VlblM213x1;
    EditText txtM213x1;
    LinearLayout secM214;
    View lineM214;
    TextView VlblM214;
    RadioGroup rdogrpM214;
    RadioButton rdoM2141;
    RadioButton rdoM2142;
    LinearLayout secM215;
    View lineM215;
    TextView VlblM215;
    RadioGroup rdogrpM215;
    RadioButton rdoM2151;
    RadioButton rdoM2152;
    LinearLayout secM216;
    View lineM216;
    TextView VlblM216;
    EditText txtM216;
    LinearLayout secM217;
    LinearLayout secM217a;
    View lineM217a;
    TextView VlblM217a;
    CheckBox chkM217a;
    LinearLayout secM217b;
    View lineM217b;
    TextView VlblM217b;
    CheckBox chkM217b;
    LinearLayout secM217c;
    View lineM217c;
    TextView VlblM217c;
    CheckBox chkM217c;
    LinearLayout secM217d;
    View lineM217d;
    TextView VlblM217d;
    CheckBox chkM217d;
    LinearLayout secM217x;
    View lineM217x;
    TextView VlblM217x;
    CheckBox chkM217x;
    LinearLayout secM217x1;
    View lineM217x1;
    TextView VlblM217x1;
    EditText txtM217x1;
    LinearLayout secLbM218;
    LinearLayout secM218a;
    View lineM218a;
    TextView VlblM218a;
    CheckBox chkM218a;
    LinearLayout secM218b;
    View lineM218b;
    TextView VlblM218b;
    CheckBox chkM218b;
    LinearLayout secM218c;
    View lineM218c;
    TextView VlblM218c;
    CheckBox chkM218c;
    LinearLayout secM218x;
    View lineM218x;
    TextView VlblM218x;
    CheckBox chkM218x;
    LinearLayout secM218x1;
    View lineM218x1;
    TextView VlblM218x1;
    EditText txtM218x1;
    LinearLayout secLb219;
    LinearLayout secM219a;
    View lineM219a;
    TextView VlblM219a;
    CheckBox chkM219a;
    LinearLayout secM219b;
    View lineM219b;
    TextView VlblM219b;
    CheckBox chkM219b;
    LinearLayout secM219c;
    View lineM219c;
    TextView VlblM219c;
    CheckBox chkM219c;
    LinearLayout secM219d;
    View lineM219d;
    TextView VlblM219d;
    CheckBox chkM219d;
    LinearLayout secM219e;
    View lineM219e;
    TextView VlblM219e;
    CheckBox chkM219e;
    LinearLayout secM219f;
    View lineM219f;
    TextView VlblM219f;
    CheckBox chkM219f;
    LinearLayout secM2110;
    View lineM2110;
    TextView VlblM2110;
    EditText txtM2110;
    LinearLayout seclblM2111;
    LinearLayout secM2111a;
    View lineM2111a;
    TextView VlblM2111a;
    CheckBox chkM2111a;
    LinearLayout secM2111b;
    View lineM2111b;
    TextView VlblM2111b;
    CheckBox chkM2111b;
    LinearLayout secM2111c;
    View lineM2111c;
    TextView VlblM2111c;
    CheckBox chkM2111c;
    LinearLayout secM2111d;
    View lineM2111d;
    TextView VlblM2111d;
    CheckBox chkM2111d;
    LinearLayout secM2111e;
    View lineM2111e;
    TextView VlblM2111e;
    CheckBox chkM2111e;
    LinearLayout secM2111f;
    View lineM2111f;
    TextView VlblM2111f;
    CheckBox chkM2111f;
    LinearLayout secM2111g;
    View lineM2111g;
    TextView VlblM2111g;
    CheckBox chkM2111g;
    LinearLayout secM2111h;
    View lineM2111h;
    TextView VlblM2111h;
    CheckBox chkM2111h;
    LinearLayout secM2111i;
    View lineM2111i;
    TextView VlblM2111i;
    CheckBox chkM2111i;
    LinearLayout secM2111x;
    View lineM2111x;
    TextView VlblM2111x;
    CheckBox chkM2111x;
    LinearLayout secM2111x1;
    View lineM2111x1;
    TextView VlblM2111x1;
    EditText txtM2111x1;
    LinearLayout seclbl2112;
    LinearLayout secM2112a;
    View lineM2112a;
    TextView VlblM2112a;
    CheckBox chkM2112a;
    LinearLayout secM2112b;
    View lineM2112b;
    TextView VlblM2112b;
    CheckBox chkM2112b;
    LinearLayout secM2112c;
    View lineM2112c;
    TextView VlblM2112c;
    CheckBox chkM2112c;
    LinearLayout secM2112d;
    View lineM2112d;
    TextView VlblM2112d;
    CheckBox chkM2112d;
    LinearLayout secM2112e;
    View lineM2112e;
    TextView VlblM2112e;
    CheckBox chkM2112e;
    LinearLayout secM2112f;
    View lineM2112f;
    TextView VlblM2112f;
    CheckBox chkM2112f;
    LinearLayout secM2112g;
    View lineM2112g;
    TextView VlblM2112g;
    CheckBox chkM2112g;
    LinearLayout secM2112x;
    View lineM2112x;
    TextView VlblM2112x;
    CheckBox chkM2112x;
    LinearLayout secM2112x1;
    View lineM2112x1;
    TextView VlblM2112x1;
    EditText txtM2112x1;
    LinearLayout secLbM2113;
    LinearLayout secM2113a;
    View lineM2113a;
    TextView VlblM2113a;
    CheckBox chkM2113a;
    LinearLayout secM2113b;
    View lineM2113b;
    TextView VlblM2113b;
    CheckBox chkM2113b;
    LinearLayout secM2113c;
    View lineM2113c;
    TextView VlblM2113c;
    CheckBox chkM2113c;
    LinearLayout secM2113d;
    View lineM2113d;
    TextView VlblM2113d;
    CheckBox chkM2113d;
    LinearLayout secM2113e;
    View lineM2113e;
    TextView VlblM2113e;
    CheckBox chkM2113e;
    LinearLayout secM2113f;
    View lineM2113f;
    TextView VlblM2113f;
    CheckBox chkM2113f;
    LinearLayout secM2113g;
    View lineM2113g;
    TextView VlblM2113g;
    CheckBox chkM2113g;
    LinearLayout secM2113h;
    View lineM2113h;
    TextView VlblM2113h;
    CheckBox chkM2113h;
    LinearLayout secM2113i;
    View lineM2113i;
    TextView VlblM2113i;
    CheckBox chkM2113i;
    LinearLayout secM2113j;
    View lineM2113j;
    TextView VlblM2113j;
    CheckBox chkM2113j;
    LinearLayout secM2113k;
    View lineM2113k;
    TextView VlblM2113k;
    CheckBox chkM2113k;
    LinearLayout secM2113l;
    View lineM2113l;
    TextView VlblM2113l;
    CheckBox chkM2113l;
    LinearLayout secM2113M;
    View lineM2113M;
    TextView VlblM2113M;
    CheckBox chkM2113M;
    LinearLayout secM2113x;
    View lineM2113x;
    TextView VlblM2113x;
    CheckBox chkM2113x;
    LinearLayout secM2113x1;
    View lineM2113x1;
    TextView VlblM2113x1;
    EditText txtM2113x1;
    LinearLayout secM2114;
    View lineM2114;
    TextView VlblM2114;
    EditText txtM2114;
    LinearLayout secM2115;
    View lineM2115;
    TextView VlblM2115;
    RadioGroup rdogrpM2115;
    RadioButton rdoM21151;
    RadioButton rdoM21152;
    RadioButton rdoM21153;
    LinearLayout secM2116;
    View lineM2116;
    TextView VlblM2116;
    RadioGroup rdogrpM2116;
    RadioButton rdoM21161;
    RadioButton rdoM21162;
    RadioButton rdoM21163;
    LinearLayout secM2117;
    View lineM2117;
    TextView VlblM2117;
    Spinner spnM2117;
    LinearLayout seclblM22;
    LinearLayout secM221a;
    View lineM221a;
    TextView VlblM221a;
    Spinner spnM221a;
    LinearLayout secM221b;
    View lineM221b;
    TextView VlblM221b;
    Spinner spnM221b;
    LinearLayout secM221c;
    View lineM221c;
    TextView VlblM221c;
    Spinner spnM221c;
    LinearLayout secM221x1;
    View lineM221x1;
    TextView VlblM221x1;
    EditText txtM221x1;
    LinearLayout seclblM222;
    LinearLayout secM222a;
    View lineM222a;
    TextView VlblM222a;
    CheckBox chkM222a;
    LinearLayout secM222b;
    View lineM222b;
    TextView VlblM222b;
    CheckBox chkM222b;
    LinearLayout secM222c;
    View lineM222c;
    TextView VlblM222c;
    CheckBox chkM222c;
    LinearLayout secM222d;
    View lineM222d;
    TextView VlblM222d;
    CheckBox chkM222d;
    LinearLayout secM222e;
    View lineM222e;
    TextView VlblM222e;
    CheckBox chkM222e;
    LinearLayout secM222f;
    View lineM222f;
    TextView VlblM222f;
    CheckBox chkM222f;
    LinearLayout secM222g;
    View lineM222g;
    TextView VlblM222g;
    CheckBox chkM222g;
    LinearLayout secM222h;
    View lineM222h;
    TextView VlblM222h;
    CheckBox chkM222h;
    LinearLayout secM222i;
    View lineM222i;
    TextView VlblM222i;
    CheckBox chkM222i;
    LinearLayout secM222x;
    View lineM222x;
    TextView VlblM222x;
    CheckBox chkM222x;
    LinearLayout secM222x1;
    View lineM222x1;
    TextView VlblM222x1;
    EditText txtM222x1;
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
            //        .append(Global.Right("00"+mDay,2)).append("/")
            //        .append(Global.Right("00"+mMonth,2)).append("/")
            //        .append(mYear));
        }
    };
    private TimePickerDialog.OnTimeSetListener timePickerListener = new TimePickerDialog.OnTimeSetListener() {
        public void onTimeSet(TimePicker view, int selectedHour, int selectedMinute) {
            hour = selectedHour;
            minute = selectedMinute;
            EditText tpTime;


            //     tpTime.setText(new StringBuilder().append(Global.Right("00"+hour,2)).append(":").append(Global.Right("00"+minute,2)));

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
        try
        {
            setContentView(R.layout.knowledge);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");
          //  MSLNUMBER = IDbundle.getString("MSLNumber");

            TableName = "Knowledge";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView)findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Knowledge.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), PregHis.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDbundle);
                            getApplicationContext().startActivity(intent);
                            finish();
                        }});
                    adb.show();
                }});

            ImageButton cmdForward = (ImageButton) findViewById(R.id.cmdForward);
            cmdForward.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Knowledge.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to return to Home [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), FdHabitKnow.class);
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
            secRnd=(LinearLayout)findViewById(R.id.secRnd);
            lineRnd=(View)findViewById(R.id.lineRnd);
            VlblRnd=(TextView) findViewById(R.id.VlblRnd);
            txtRnd=(EditText) findViewById(R.id.txtRnd);
            secSuchanaId=(LinearLayout)findViewById(R.id.secSuchanaId);
            lineSuchanaId=(View)findViewById(R.id.lineSuchanaId);
            VlblSuchanaId=(TextView) findViewById(R.id.VlblSuchanaId);
            txtSuchanaId=(EditText) findViewById(R.id.txtSuchanaId);
            secMSLNumber=(LinearLayout)findViewById(R.id.secMSLNumber);
            lineMSLNumber=(View)findViewById(R.id.lineMSLNumber);
            VlblMSLNumber=(TextView) findViewById(R.id.VlblMSLNumber);
            spnMSlNo = (Spinner) findViewById(R.id.spnMSlNo);
            spnMSlNo.setAdapter(C.getArrayAdapter("Select '' union select H21 ||'-'||H22 from member where Rnd='" + RND + "' and suchanaId='" + SUCHANAID + "' and H21=(select H221 from member where Rnd='" + RND + "' and suchanaId='" + SUCHANAID + "' and H220='1')"));
            secLbM2=(LinearLayout)findViewById(R.id.secLbM2);
            secM212=(LinearLayout)findViewById(R.id.secM212);
            lineM212=(View)findViewById(R.id.lineM212);
            VlblM212 = (TextView) findViewById(R.id.VlblM212);
            rdogrpM212 = (RadioGroup) findViewById(R.id.rdogrpM212);

            rdoM2121 = (RadioButton) findViewById(R.id.rdoM2121);
            rdoM2122 = (RadioButton) findViewById(R.id.rdoM2122);
            rdogrpM212.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpM212 = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpM212.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpM212.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpM212[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secLbM213.setVisibility(View.GONE);
                        secM213a.setVisibility(View.GONE);
                        lineM213a.setVisibility(View.GONE);
                        chkM213a.setChecked(false);
                        secM213b.setVisibility(View.GONE);
                        lineM213b.setVisibility(View.GONE);
                        chkM213b.setChecked(false);
                        secM213c.setVisibility(View.GONE);
                        lineM213c.setVisibility(View.GONE);
                        chkM213c.setChecked(false);
                        secM213x.setVisibility(View.GONE);
                        lineM213x.setVisibility(View.GONE);
                        chkM213x.setChecked(false);
                        secM213x1.setVisibility(View.GONE);
                        lineM213x1.setVisibility(View.GONE);
                        txtM213x1.setText("");
                    }
                    else
                    {
                        secLbM213.setVisibility(View.VISIBLE);
                        secM213a.setVisibility(View.VISIBLE);
                        lineM213a.setVisibility(View.VISIBLE);
                        secM213b.setVisibility(View.VISIBLE);
                        lineM213b.setVisibility(View.VISIBLE);
                        secM213c.setVisibility(View.VISIBLE);
                        lineM213c.setVisibility(View.VISIBLE);
                        secM213x.setVisibility(View.VISIBLE);
                        lineM213x.setVisibility(View.VISIBLE);
                      //  secM213x1.setVisibility(View.VISIBLE);
                     //   lineM213x1.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secLbM213=(LinearLayout)findViewById(R.id.secLbM213);
            secM213a=(LinearLayout)findViewById(R.id.secM213a);
            secLbM213.setVisibility(View.GONE);
            lineM213a=(View)findViewById(R.id.lineM213a);
            VlblM213a=(TextView) findViewById(R.id.VlblM213a);
            chkM213a=(CheckBox) findViewById(R.id.chkM213a);
            secM213b=(LinearLayout)findViewById(R.id.secM213b);
            lineM213b=(View)findViewById(R.id.lineM213b);
            VlblM213b=(TextView) findViewById(R.id.VlblM213b);
            chkM213b=(CheckBox) findViewById(R.id.chkM213b);
            secM213c=(LinearLayout)findViewById(R.id.secM213c);
            lineM213c=(View)findViewById(R.id.lineM213c);
            VlblM213c=(TextView) findViewById(R.id.VlblM213c);
            chkM213c=(CheckBox) findViewById(R.id.chkM213c);
            secM213x=(LinearLayout)findViewById(R.id.secM213x);
            lineM213x=(View)findViewById(R.id.lineM213x);
            VlblM213x=(TextView) findViewById(R.id.VlblM213x);
            chkM213x=(CheckBox) findViewById(R.id.chkM213x);
            chkM213x.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    if(!((CheckBox) v).isChecked())
                    {
                        secM213x1.setVisibility(View.GONE);
                        lineM213x1.setVisibility(View.GONE);
                        txtM213x1.setText("");
                    }
                    else
                    {
                        secM213x1.setVisibility(View.VISIBLE);
                        lineM213x1.setVisibility(View.VISIBLE);
                    }
                }
            });

            chkM213c.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkM213a.setChecked(false);
                        chkM213b.setChecked(false);
                        chkM213x.setChecked(false);
                        txtM213x1.setText("");
                    }

                }
            });
            secM213x1=(LinearLayout)findViewById(R.id.secM213x1);
            lineM213x1=(View)findViewById(R.id.lineM213x1);
            VlblM213x1=(TextView) findViewById(R.id.VlblM213x1);
            txtM213x1=(EditText) findViewById(R.id.txtM213x1);
            secM213x1.setVisibility(View.GONE);
            lineM213x1.setVisibility(View.GONE);
            secM214=(LinearLayout)findViewById(R.id.secM214);
            lineM214=(View)findViewById(R.id.lineM214);
            VlblM214 = (TextView) findViewById(R.id.VlblM214);
            rdogrpM214 = (RadioGroup) findViewById(R.id.rdogrpM214);

            rdoM2141 = (RadioButton) findViewById(R.id.rdoM2141);
            rdoM2142 = (RadioButton) findViewById(R.id.rdoM2142);
            secM215=(LinearLayout)findViewById(R.id.secM215);
            lineM215=(View)findViewById(R.id.lineM215);
            VlblM215 = (TextView) findViewById(R.id.VlblM215);
            rdogrpM215 = (RadioGroup) findViewById(R.id.rdogrpM215);

            rdoM2151 = (RadioButton) findViewById(R.id.rdoM2151);
            rdoM2152 = (RadioButton) findViewById(R.id.rdoM2152);
            rdogrpM215.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpM215 = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpM215.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpM215.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpM215[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secM216.setVisibility(View.GONE);
                        lineM216.setVisibility(View.GONE);
                        txtM216.setText("");
                        secM217.setVisibility(View.GONE);
                        secM217a.setVisibility(View.GONE);
                        lineM217a.setVisibility(View.GONE);
                        chkM217a.setChecked(false);
                        secM217b.setVisibility(View.GONE);
                        lineM217b.setVisibility(View.GONE);
                        chkM217b.setChecked(false);
                        secM217c.setVisibility(View.GONE);
                        lineM217c.setVisibility(View.GONE);
                        chkM217c.setChecked(false);
                        secM217d.setVisibility(View.GONE);
                        lineM217d.setVisibility(View.GONE);
                        chkM217d.setChecked(false);
                        secM217x.setVisibility(View.GONE);
                        lineM217x.setVisibility(View.GONE);
                        chkM217x.setChecked(false);
                        secM217x1.setVisibility(View.GONE);
                        lineM217x1.setVisibility(View.GONE);
                        txtM217x1.setText("");
                    }
                    else
                    {
                        secM216.setVisibility(View.VISIBLE);
                        lineM216.setVisibility(View.VISIBLE);
                        secM217.setVisibility(View.VISIBLE);
                        secM217a.setVisibility(View.VISIBLE);
                        lineM217a.setVisibility(View.VISIBLE);
                        secM217b.setVisibility(View.VISIBLE);
                        lineM217b.setVisibility(View.VISIBLE);
                        secM217c.setVisibility(View.VISIBLE);
                        lineM217c.setVisibility(View.VISIBLE);
                        secM217d.setVisibility(View.VISIBLE);
                        lineM217d.setVisibility(View.VISIBLE);
                        secM217x.setVisibility(View.VISIBLE);
                        lineM217x.setVisibility(View.VISIBLE);
                     //   secM217x1.setVisibility(View.VISIBLE);
                     //   lineM217x1.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secM216=(LinearLayout)findViewById(R.id.secM216);
            lineM216=(View)findViewById(R.id.lineM216);
            VlblM216=(TextView) findViewById(R.id.VlblM216);
            txtM216=(EditText) findViewById(R.id.txtM216);
            secM217=(LinearLayout)findViewById(R.id.secM217);
            secM217.setVisibility(View.GONE);
            secM217a=(LinearLayout)findViewById(R.id.secM217a);
            lineM217a=(View)findViewById(R.id.lineM217a);
            VlblM217a=(TextView) findViewById(R.id.VlblM217a);
            chkM217a=(CheckBox) findViewById(R.id.chkM217a);
            secM217b=(LinearLayout)findViewById(R.id.secM217b);
            lineM217b=(View)findViewById(R.id.lineM217b);
            VlblM217b=(TextView) findViewById(R.id.VlblM217b);
            chkM217b=(CheckBox) findViewById(R.id.chkM217b);
            secM217c=(LinearLayout)findViewById(R.id.secM217c);
            lineM217c=(View)findViewById(R.id.lineM217c);
            VlblM217c=(TextView) findViewById(R.id.VlblM217c);
            chkM217c=(CheckBox) findViewById(R.id.chkM217c);
            secM217d=(LinearLayout)findViewById(R.id.secM217d);
            lineM217d=(View)findViewById(R.id.lineM217d);
            VlblM217d=(TextView) findViewById(R.id.VlblM217d);
            chkM217d=(CheckBox) findViewById(R.id.chkM217d);
            secM217x=(LinearLayout)findViewById(R.id.secM217x);
            lineM217x=(View)findViewById(R.id.lineM217x);
            VlblM217x=(TextView) findViewById(R.id.VlblM217x);
            chkM217x=(CheckBox) findViewById(R.id.chkM217x);
            chkM217x.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    if(!((CheckBox) v).isChecked())
                    {
                        secM217x1.setVisibility(View.GONE);
                        lineM217x1.setVisibility(View.GONE);
                        txtM217x1.setText("");
                    }
                    else
                    {
                        secM217x1.setVisibility(View.VISIBLE);
                        lineM217x1.setVisibility(View.VISIBLE);
                    }
                }
            });

            chkM217d.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkM217a.setChecked(false);
                        chkM217b.setChecked(false);
                        chkM217c.setChecked(false);
                        chkM217x.setChecked(false);
                        txtM217x1.setText("");
                    }

                }
            });
            secM217x1=(LinearLayout)findViewById(R.id.secM217x1);
            lineM217x1=(View)findViewById(R.id.lineM217x1);
            VlblM217x1=(TextView) findViewById(R.id.VlblM217x1);
            txtM217x1=(EditText) findViewById(R.id.txtM217x1);
            secM217x1.setVisibility(View.GONE);
            lineM217x1.setVisibility(View.GONE);
            secLbM218=(LinearLayout)findViewById(R.id.secLbM218);
            secM218a=(LinearLayout)findViewById(R.id.secM218a);
            lineM218a=(View)findViewById(R.id.lineM218a);
            VlblM218a=(TextView) findViewById(R.id.VlblM218a);
            chkM218a=(CheckBox) findViewById(R.id.chkM218a);
            secM218b=(LinearLayout)findViewById(R.id.secM218b);
            lineM218b=(View)findViewById(R.id.lineM218b);
            VlblM218b=(TextView) findViewById(R.id.VlblM218b);
            chkM218b=(CheckBox) findViewById(R.id.chkM218b);
            secM218c=(LinearLayout)findViewById(R.id.secM218c);
            lineM218c=(View)findViewById(R.id.lineM218c);
            VlblM218c=(TextView) findViewById(R.id.VlblM218c);
            chkM218c=(CheckBox) findViewById(R.id.chkM218c);
            secM218x=(LinearLayout)findViewById(R.id.secM218x);
            lineM218x=(View)findViewById(R.id.lineM218x);
            VlblM218x=(TextView) findViewById(R.id.VlblM218x);
            chkM218x=(CheckBox) findViewById(R.id.chkM218x);
            chkM218x.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {
                        secM218x1.setVisibility(View.GONE);
                        lineM218x1.setVisibility(View.GONE);
                        txtM218x1.setText("");
                    } else
                    {
                        secM218x1.setVisibility(View.VISIBLE);
                        lineM218x1.setVisibility(View.VISIBLE);
                    }

                }
            });

            chkM218c.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkM218a.setChecked(false);
                        chkM218b.setChecked(false);
                        chkM218x.setChecked(false);
                        txtM218x1.setText("");
                    }

                }
            });
            secM218x1=(LinearLayout)findViewById(R.id.secM218x1);
            lineM218x1=(View)findViewById(R.id.lineM218x1);
            VlblM218x1=(TextView) findViewById(R.id.VlblM218x1);
            txtM218x1=(EditText) findViewById(R.id.txtM218x1);
            secM218x1.setVisibility(View.GONE);
            lineM218x1.setVisibility(View.GONE);
            secLb219=(LinearLayout)findViewById(R.id.secLb219);
            secM219a=(LinearLayout)findViewById(R.id.secM219a);
            lineM219a=(View)findViewById(R.id.lineM219a);
            VlblM219a=(TextView) findViewById(R.id.VlblM219a);
            chkM219a=(CheckBox) findViewById(R.id.chkM219a);
            secM219b=(LinearLayout)findViewById(R.id.secM219b);
            lineM219b=(View)findViewById(R.id.lineM219b);
            VlblM219b=(TextView) findViewById(R.id.VlblM219b);
            chkM219b=(CheckBox) findViewById(R.id.chkM219b);
            secM219c=(LinearLayout)findViewById(R.id.secM219c);
            lineM219c=(View)findViewById(R.id.lineM219c);
            VlblM219c=(TextView) findViewById(R.id.VlblM219c);
            chkM219c=(CheckBox) findViewById(R.id.chkM219c);
            secM219d=(LinearLayout)findViewById(R.id.secM219d);
            lineM219d=(View)findViewById(R.id.lineM219d);
            VlblM219d=(TextView) findViewById(R.id.VlblM219d);
            chkM219d=(CheckBox) findViewById(R.id.chkM219d);
            secM219e=(LinearLayout)findViewById(R.id.secM219e);
            lineM219e=(View)findViewById(R.id.lineM219e);
            VlblM219e=(TextView) findViewById(R.id.VlblM219e);
            chkM219e=(CheckBox) findViewById(R.id.chkM219e);
            secM219f=(LinearLayout)findViewById(R.id.secM219f);
            lineM219f=(View)findViewById(R.id.lineM219f);
            VlblM219f=(TextView) findViewById(R.id.VlblM219f);
            chkM219f=(CheckBox) findViewById(R.id.chkM219f);
            secM2110=(LinearLayout)findViewById(R.id.secM2110);
            lineM2110=(View)findViewById(R.id.lineM2110);
            VlblM2110=(TextView) findViewById(R.id.VlblM2110);
            txtM2110=(EditText) findViewById(R.id.txtM2110);
            seclblM2111=(LinearLayout)findViewById(R.id.seclblM2111);
            secM2111a=(LinearLayout)findViewById(R.id.secM2111a);
            lineM2111a=(View)findViewById(R.id.lineM2111a);
            VlblM2111a=(TextView) findViewById(R.id.VlblM2111a);
            chkM2111a=(CheckBox) findViewById(R.id.chkM2111a);
            secM2111b=(LinearLayout)findViewById(R.id.secM2111b);
            lineM2111b=(View)findViewById(R.id.lineM2111b);
            VlblM2111b=(TextView) findViewById(R.id.VlblM2111b);
            chkM2111b=(CheckBox) findViewById(R.id.chkM2111b);
            secM2111c=(LinearLayout)findViewById(R.id.secM2111c);
            lineM2111c=(View)findViewById(R.id.lineM2111c);
            VlblM2111c=(TextView) findViewById(R.id.VlblM2111c);
            chkM2111c=(CheckBox) findViewById(R.id.chkM2111c);
            secM2111d=(LinearLayout)findViewById(R.id.secM2111d);
            lineM2111d=(View)findViewById(R.id.lineM2111d);
            VlblM2111d=(TextView) findViewById(R.id.VlblM2111d);
            chkM2111d=(CheckBox) findViewById(R.id.chkM2111d);
            secM2111e=(LinearLayout)findViewById(R.id.secM2111e);
            lineM2111e=(View)findViewById(R.id.lineM2111e);
            VlblM2111e=(TextView) findViewById(R.id.VlblM2111e);
            chkM2111e=(CheckBox) findViewById(R.id.chkM2111e);
            secM2111f=(LinearLayout)findViewById(R.id.secM2111f);
            lineM2111f=(View)findViewById(R.id.lineM2111f);
            VlblM2111f=(TextView) findViewById(R.id.VlblM2111f);
            chkM2111f=(CheckBox) findViewById(R.id.chkM2111f);
            secM2111g=(LinearLayout)findViewById(R.id.secM2111g);
            lineM2111g=(View)findViewById(R.id.lineM2111g);
            VlblM2111g=(TextView) findViewById(R.id.VlblM2111g);
            chkM2111g=(CheckBox) findViewById(R.id.chkM2111g);

            secM2111h=(LinearLayout)findViewById(R.id.secM2111h);
            lineM2111h=(View)findViewById(R.id.lineM2111h);
            VlblM2111h=(TextView) findViewById(R.id.VlblM2111h);
            chkM2111h=(CheckBox) findViewById(R.id.chkM2111h);
            secM2111i=(LinearLayout)findViewById(R.id.secM2111i);
            lineM2111i=(View)findViewById(R.id.lineM2111i);
            VlblM2111i=(TextView) findViewById(R.id.VlblM2111i);
            chkM2111i=(CheckBox) findViewById(R.id.chkM2111i);
            secM2111x=(LinearLayout)findViewById(R.id.secM2111x);
            lineM2111x=(View)findViewById(R.id.lineM2111x);
            VlblM2111x=(TextView) findViewById(R.id.VlblM2111x);
            chkM2111x=(CheckBox) findViewById(R.id.chkM2111x);
            chkM2111x.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    if(!((CheckBox) v).isChecked())
                    {
                        secM2111x1.setVisibility(View.GONE);
                        lineM2111x1.setVisibility(View.GONE);
                        txtM2111x1.setText("");

                    }
                    else
                    {
                        secM2111x1.setVisibility(View.VISIBLE);
                        lineM2111x1.setVisibility(View.VISIBLE);
                    }
                }
            });

            chkM2111i.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    if(((CheckBox) v).isChecked())
                    {
                        chkM2111a.setChecked(false);
                        chkM2111b.setChecked(false);
                        chkM2111c.setChecked(false);
                        chkM2111d.setChecked(false);
                        chkM2111e.setChecked(false);
                        chkM2111f.setChecked(false);
                        chkM2111g.setChecked(false);
                        chkM2111h.setChecked(false);
                        chkM2111x.setChecked(false);
                    }

                }
            });
            secM2111x1=(LinearLayout)findViewById(R.id.secM2111x1);
            lineM2111x1=(View)findViewById(R.id.lineM2111x1);
            VlblM2111x1=(TextView) findViewById(R.id.VlblM2111x1);
            txtM2111x1=(EditText) findViewById(R.id.txtM2111x1);
            secM2111x1.setVisibility(View.GONE);
            lineM2111x1.setVisibility(View.GONE);
            seclbl2112=(LinearLayout)findViewById(R.id.seclbl2112);
            secM2112a=(LinearLayout)findViewById(R.id.secM2112a);
            lineM2112a=(View)findViewById(R.id.lineM2112a);
            VlblM2112a=(TextView) findViewById(R.id.VlblM2112a);
            chkM2112a=(CheckBox) findViewById(R.id.chkM2112a);
            secM2112b=(LinearLayout)findViewById(R.id.secM2112b);
            lineM2112b=(View)findViewById(R.id.lineM2112b);
            VlblM2112b=(TextView) findViewById(R.id.VlblM2112b);
            chkM2112b=(CheckBox) findViewById(R.id.chkM2112b);
            secM2112c=(LinearLayout)findViewById(R.id.secM2112c);
            lineM2112c=(View)findViewById(R.id.lineM2112c);
            VlblM2112c=(TextView) findViewById(R.id.VlblM2112c);
            chkM2112c=(CheckBox) findViewById(R.id.chkM2112c);
            secM2112d=(LinearLayout)findViewById(R.id.secM2112d);
            lineM2112d=(View)findViewById(R.id.lineM2112d);
            VlblM2112d=(TextView) findViewById(R.id.VlblM2112d);
            chkM2112d=(CheckBox) findViewById(R.id.chkM2112d);
            secM2112e=(LinearLayout)findViewById(R.id.secM2112e);
            lineM2112e=(View)findViewById(R.id.lineM2112e);
            VlblM2112e=(TextView) findViewById(R.id.VlblM2112e);
            chkM2112e=(CheckBox) findViewById(R.id.chkM2112e);
            secM2112f=(LinearLayout)findViewById(R.id.secM2112f);
            lineM2112f=(View)findViewById(R.id.lineM2112f);
            VlblM2112f=(TextView) findViewById(R.id.VlblM2112f);
            chkM2112f=(CheckBox) findViewById(R.id.chkM2112f);
            secM2112g=(LinearLayout)findViewById(R.id.secM2112g);
            lineM2112g=(View)findViewById(R.id.lineM2112g);
            VlblM2112g=(TextView) findViewById(R.id.VlblM2112g);
            chkM2112g=(CheckBox) findViewById(R.id.chkM2112g);
            secM2112x=(LinearLayout)findViewById(R.id.secM2112x);
            lineM2112x=(View)findViewById(R.id.lineM2112x);
            VlblM2112x=(TextView) findViewById(R.id.VlblM2112x);
            chkM2112x=(CheckBox) findViewById(R.id.chkM2112x);
            chkM2112x.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    if(!((CheckBox) v).isChecked())
                    {
                        secM2112x1.setVisibility(View.GONE);
                        lineM2112x1.setVisibility(View.GONE);
                        txtM2112x1.setText("");

                    }
                    else
                    {
                        secM2112x1.setVisibility(View.VISIBLE);
                        lineM2112x1.setVisibility(View.VISIBLE);
                    }
                }
            });

            chkM2112g.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    if(((CheckBox) v).isChecked())
                    {
                        chkM2112a.setChecked(false);
                        chkM2112b.setChecked(false);
                        chkM2112c.setChecked(false);
                        chkM2112d.setChecked(false);
                        chkM2112e.setChecked(false);
                        chkM2112f.setChecked(false);
                        chkM2112x.setChecked(false);
                    }

                }
            });
            secM2112x1=(LinearLayout)findViewById(R.id.secM2112x1);
            lineM2112x1=(View)findViewById(R.id.lineM2112x1);
            VlblM2112x1=(TextView) findViewById(R.id.VlblM2112x1);
            txtM2112x1=(EditText) findViewById(R.id.txtM2112x1);
            secM2112x1.setVisibility(View.GONE);
            lineM2112x1.setVisibility(View.GONE);
            secLbM2113=(LinearLayout)findViewById(R.id.secLbM2113);
            secM2113a=(LinearLayout)findViewById(R.id.secM2113a);
            lineM2113a=(View)findViewById(R.id.lineM2113a);
            VlblM2113a=(TextView) findViewById(R.id.VlblM2113a);
            chkM2113a=(CheckBox) findViewById(R.id.chkM2113a);
            secM2113b=(LinearLayout)findViewById(R.id.secM2113b);
            lineM2113b=(View)findViewById(R.id.lineM2113b);
            VlblM2113b=(TextView) findViewById(R.id.VlblM2113b);
            chkM2113b=(CheckBox) findViewById(R.id.chkM2113b);
            secM2113c=(LinearLayout)findViewById(R.id.secM2113c);
            lineM2113c=(View)findViewById(R.id.lineM2113c);
            VlblM2113c=(TextView) findViewById(R.id.VlblM2113c);
            chkM2113c=(CheckBox) findViewById(R.id.chkM2113c);
            secM2113d=(LinearLayout)findViewById(R.id.secM2113d);
            lineM2113d=(View)findViewById(R.id.lineM2113d);
            VlblM2113d=(TextView) findViewById(R.id.VlblM2113d);
            chkM2113d=(CheckBox) findViewById(R.id.chkM2113d);
            secM2113e=(LinearLayout)findViewById(R.id.secM2113e);
            lineM2113e=(View)findViewById(R.id.lineM2113e);
            VlblM2113e=(TextView) findViewById(R.id.VlblM2113e);
            chkM2113e=(CheckBox) findViewById(R.id.chkM2113e);
            secM2113f=(LinearLayout)findViewById(R.id.secM2113f);
            lineM2113f=(View)findViewById(R.id.lineM2113f);
            VlblM2113f=(TextView) findViewById(R.id.VlblM2113f);
            chkM2113f=(CheckBox) findViewById(R.id.chkM2113f);
            secM2113g=(LinearLayout)findViewById(R.id.secM2113g);
            lineM2113g=(View)findViewById(R.id.lineM2113g);
            VlblM2113g=(TextView) findViewById(R.id.VlblM2113g);
            chkM2113g=(CheckBox) findViewById(R.id.chkM2113g);
            secM2113h=(LinearLayout)findViewById(R.id.secM2113h);
            lineM2113h=(View)findViewById(R.id.lineM2113h);
            VlblM2113h=(TextView) findViewById(R.id.VlblM2113h);
            chkM2113h=(CheckBox) findViewById(R.id.chkM2113h);
            secM2113i=(LinearLayout)findViewById(R.id.secM2113i);
            lineM2113i=(View)findViewById(R.id.lineM2113i);
            VlblM2113i=(TextView) findViewById(R.id.VlblM2113i);
            chkM2113i=(CheckBox) findViewById(R.id.chkM2113i);
            secM2113j=(LinearLayout)findViewById(R.id.secM2113j);
            lineM2113j=(View)findViewById(R.id.lineM2113j);
            VlblM2113j=(TextView) findViewById(R.id.VlblM2113j);
            chkM2113j=(CheckBox) findViewById(R.id.chkM2113j);
            secM2113k=(LinearLayout)findViewById(R.id.secM2113k);
            lineM2113k=(View)findViewById(R.id.lineM2113k);
            VlblM2113k=(TextView) findViewById(R.id.VlblM2113k);
            chkM2113k=(CheckBox) findViewById(R.id.chkM2113k);
            secM2113l=(LinearLayout)findViewById(R.id.secM2113l);
            lineM2113l=(View)findViewById(R.id.lineM2113l);
            VlblM2113l=(TextView) findViewById(R.id.VlblM2113l);
            chkM2113l=(CheckBox) findViewById(R.id.chkM2113l);
            secM2113M=(LinearLayout)findViewById(R.id.secM2113M);
            lineM2113M=(View)findViewById(R.id.lineM2113M);
            VlblM2113M=(TextView) findViewById(R.id.VlblM2113M);
            chkM2113M=(CheckBox) findViewById(R.id.chkM2113M);
            secM2113x=(LinearLayout)findViewById(R.id.secM2113x);
            lineM2113x=(View)findViewById(R.id.lineM2113x);
            VlblM2113x=(TextView) findViewById(R.id.VlblM2113x);
            chkM2113x=(CheckBox) findViewById(R.id.chkM2113x);
            chkM2113x.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    if(!((CheckBox) v).isChecked())
                    {
                        secM2113x1.setVisibility(View.GONE);
                        lineM2113x1.setVisibility(View.GONE);
                        txtM2113x1.setText("");

                    }
                    else
                    {
                        secM2113x1.setVisibility(View.VISIBLE);
                        lineM2113x1.setVisibility(View.VISIBLE);
                    }
                }
            });
            secM2113x1=(LinearLayout)findViewById(R.id.secM2113x1);
            lineM2113x1=(View)findViewById(R.id.lineM2113x1);
            VlblM2113x1=(TextView) findViewById(R.id.VlblM2113x1);
            txtM2113x1=(EditText) findViewById(R.id.txtM2113x1);
            secM2113x1.setVisibility(View.GONE);
            lineM2113x1.setVisibility(View.GONE);
            secM2114=(LinearLayout)findViewById(R.id.secM2114);
            lineM2114=(View)findViewById(R.id.lineM2114);
            VlblM2114=(TextView) findViewById(R.id.VlblM2114);
            txtM2114=(EditText) findViewById(R.id.txtM2114);
            secM2115=(LinearLayout)findViewById(R.id.secM2115);
            lineM2115=(View)findViewById(R.id.lineM2115);
            VlblM2115 = (TextView) findViewById(R.id.VlblM2115);
            rdogrpM2115 = (RadioGroup) findViewById(R.id.rdogrpM2115);

            rdoM21151 = (RadioButton) findViewById(R.id.rdoM21151);
            rdoM21152 = (RadioButton) findViewById(R.id.rdoM21152);
            rdoM21153 = (RadioButton) findViewById(R.id.rdoM21153);

            secM2116=(LinearLayout)findViewById(R.id.secM2116);
            lineM2116=(View)findViewById(R.id.lineM2116);
            VlblM2116 = (TextView) findViewById(R.id.VlblM2116);
            rdogrpM2116 = (RadioGroup) findViewById(R.id.rdogrpM2116);

            rdoM21161 = (RadioButton) findViewById(R.id.rdoM21161);
            rdoM21162 = (RadioButton) findViewById(R.id.rdoM21162);
            rdoM21163 = (RadioButton) findViewById(R.id.rdoM21163);

            secM2117=(LinearLayout)findViewById(R.id.secM2117);
            lineM2117=(View)findViewById(R.id.lineM2117);
            VlblM2117=(TextView) findViewById(R.id.VlblM2117);
            spnM2117=(Spinner) findViewById(R.id.spnM2117);
            List<String> listM2117 = new ArrayList<String>();

            listM2117.add("");
            listM2117.add("1-অপরিশোধিত লবণ ");
            listM2117.add("2-প্যাকেটজাত লবণ");
            listM2117.add("3-; আয়োডিন যুক্ত লবণ ");
            listM2117.add("4- খোলা লবণ");
            listM2117.add("5- প্যাকেটজাত লবণ কিন্তু খোলা ");
            ArrayAdapter<String> adptrM2117= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM2117);
            spnM2117.setAdapter(adptrM2117);

            seclblM22=(LinearLayout)findViewById(R.id.seclblM22);
            secM221a=(LinearLayout)findViewById(R.id.secM221a);
            lineM221a=(View)findViewById(R.id.lineM221a);
            VlblM221a=(TextView) findViewById(R.id.VlblM221a);
            spnM221a=(Spinner) findViewById(R.id.spnM221a);
            List<String> listM221a = new ArrayList<String>();

            listM221a.add("");
            listM221a.add("01-মাঠপর্যায়ের স্বাস্থ্যকর্মী ");
            listM221a.add("02-স্বাস্থ্য ও পরিবার পরিকল্পনা কেন্দ্র");
            listM221a.add("03-উপজেলা/সরকারী মেডিকেল স্বাস্থ্য কমপ্লেক্স ");
            listM221a.add("04-মেডিকেল কলেজ হাসপাতাল");
            listM221a.add("05-জেলা হাসপাতাল");
            listM221a.add("06-স্থানীয় এনজিও ");
            listM221a.add("07-বেসরকারী ক্লিনিক");
            listM221a.add("08-ঔষধের দোকান");
            listM221a.add("09-MBBS ডাক্তার");
            listM221a.add("10-পীর ফকির");
            listM221a.add("11-কবিরাজ/পল্লী ডাক্তার  ");
            listM221a.add("12-হোমিত্তপ্যাথি ");
            listM221a.add("13-কমিউনিটি ক্লিনিক");
            listM221a.add("88-জানি না");
            listM221a.add("14-অন্যান্য উল্লেখ করুন");
            ArrayAdapter<String> adptrM221a= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM221a);
            spnM221a.setAdapter(adptrM221a);


            spnM221a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnM221a.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnM221a.getSelectedItem().toString(),"-");
                    if(spnData.equalsIgnoreCase("88"))
                    {
                        secM221b.setVisibility(View.GONE);
                        secM221c.setVisibility(View.GONE);
                        spnM221b.setSelection(0);
                        spnM221c.setSelection(0);
                        seclblM222.setVisibility(View.GONE);
                        secM222a.setVisibility(View.GONE);
                        secM222b.setVisibility(View.GONE);
                        secM222c.setVisibility(View.GONE);
                        secM222d.setVisibility(View.GONE);
                        secM222e.setVisibility(View.GONE);
                        secM222f.setVisibility(View.GONE);
                        secM222g.setVisibility(View.GONE);
                        secM222h.setVisibility(View.GONE);
                        secM222i.setVisibility(View.GONE);
                        secM222x.setVisibility(View.GONE);
                        secM222x1.setVisibility(View.GONE);
                        chkM222a.setChecked(false);
                        chkM222b.setChecked(false);
                        chkM222c.setChecked(false);
                        chkM222d.setChecked(false);
                        chkM222e.setChecked(false);
                        chkM222f.setChecked(false);
                        chkM222g.setChecked(false);
                        chkM222h.setChecked(false);
                        chkM222i.setChecked(false);
                        chkM222x.setChecked(false);
                        txtM222x1.setText(null);

                    }
                    else
                    {
                        secM221b.setVisibility(View.VISIBLE);
                        secM221c.setVisibility(View.VISIBLE);
                        seclblM222.setVisibility(View.VISIBLE);
                        secM222a.setVisibility(View.VISIBLE);
                        secM222b.setVisibility(View.VISIBLE);
                        secM222c.setVisibility(View.VISIBLE);
                        secM222d.setVisibility(View.VISIBLE);
                        secM222e.setVisibility(View.VISIBLE);
                        secM222f.setVisibility(View.VISIBLE);
                        secM222g.setVisibility(View.VISIBLE);
                        secM222h.setVisibility(View.VISIBLE);
                        secM222i.setVisibility(View.VISIBLE);
                        secM222x.setVisibility(View.VISIBLE);
                       // secM222x1.setVisibility(View.VISIBLE);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secM221b=(LinearLayout)findViewById(R.id.secM221b);
            lineM221b=(View)findViewById(R.id.lineM221b);
            VlblM221b=(TextView) findViewById(R.id.VlblM221b);
            spnM221b=(Spinner) findViewById(R.id.spnM221b);
            List<String> listM221b = new ArrayList<String>();

            listM221b.add("");
            listM221b.add("01-মাঠপর্যায়ের স্বাস্থ্যকর্মী ");
            listM221b.add("02-স্বাস্থ্য ও পরিবার পরিকল্পনা কেন্দ্র");
            listM221b.add("03-উপজেলা/সরকারী মেডিকেল স্বাস্থ্য কমপ্লেক্স ");
            listM221b.add("04-মেডিকেল কলেজ হাসপাতাল");
            listM221b.add("05-জেলা হাসপাতাল");
            listM221b.add("06-স্থানীয় এনজিও ");
            listM221b.add("07-বেসরকারী ক্লিনিক");
            listM221b.add("08-ঔষধের দোকান");
            listM221b.add("09-MBBS ডাক্তার");
            listM221b.add("10-পীর ফকির");
            listM221b.add("11-কবিরাজ/পল্লী ডাক্তার  ");
            listM221b.add("12-হোমিত্তপ্যাথি ");
            listM221b.add("13-কমিউনিটি ক্লিনিক");
            listM221b.add("88-জানি না");
            listM221b.add("14-অন্যান্য উল্লেখ করুন");
            ArrayAdapter<String> adptrM221b= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM221b);
            spnM221b.setAdapter(adptrM221b);

            secM221c=(LinearLayout)findViewById(R.id.secM221c);
            lineM221c=(View)findViewById(R.id.lineM221c);
            VlblM221c=(TextView) findViewById(R.id.VlblM221c);
            spnM221c=(Spinner) findViewById(R.id.spnM221c);
            List<String> listM221c = new ArrayList<String>();

            listM221c.add("");
            listM221c.add("01-মাঠপর্যায়ের স্বাস্থ্যকর্মী ");
            listM221c.add("02-স্বাস্থ্য ও পরিবার পরিকল্পনা কেন্দ্র");
            listM221c.add("03-উপজেলা/সরকারী মেডিকেল স্বাস্থ্য কমপ্লেক্স ");
            listM221c.add("04-মেডিকেল কলেজ হাসপাতাল");
            listM221c.add("05-জেলা হাসপাতাল");
            listM221c.add("06-স্থানীয় এনজিও ");
            listM221c.add("07-বেসরকারী ক্লিনিক");
            listM221c.add("08-ঔষধের দোকান");
            listM221c.add("09-MBBS ডাক্তার");
            listM221c.add("10-পীর ফকির");
            listM221c.add("11-কবিরাজ/পল্লী ডাক্তার  ");
            listM221c.add("12-হোমিত্তপ্যাথি ");
            listM221c.add("13-কমিউনিটি ক্লিনিক");
            listM221c.add("88-জানি না");
            listM221c.add("14-অন্যান্য উল্লেখ করুন");
            ArrayAdapter<String> adptrM221c= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM221c);
            spnM221c.setAdapter(adptrM221c);

            spnM221c.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnM221c.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnM221c.getSelectedItem().toString(),"-");
                    if(spnData.equalsIgnoreCase("14"))
                    {
                        secM221x1.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        secM221x1.setVisibility(View.GONE);
                        txtM221x1.setText(null);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });


            secM221x1=(LinearLayout)findViewById(R.id.secM221x1);
            lineM221x1=(View)findViewById(R.id.lineM221x1);
            VlblM221x1=(TextView) findViewById(R.id.VlblM221x1);
            txtM221x1=(EditText) findViewById(R.id.txtM221x1);
            secM221x1.setVisibility(View.GONE);
            seclblM222=(LinearLayout)findViewById(R.id.seclblM222);
            secM222a=(LinearLayout)findViewById(R.id.secM222a);
            lineM222a=(View)findViewById(R.id.lineM222a);
            VlblM222a=(TextView) findViewById(R.id.VlblM222a);
            chkM222a=(CheckBox) findViewById(R.id.chkM222a);
            secM222b=(LinearLayout)findViewById(R.id.secM222b);
            lineM222b=(View)findViewById(R.id.lineM222b);
            VlblM222b=(TextView) findViewById(R.id.VlblM222b);
            chkM222b=(CheckBox) findViewById(R.id.chkM222b);
            secM222c=(LinearLayout)findViewById(R.id.secM222c);
            lineM222c=(View)findViewById(R.id.lineM222c);
            VlblM222c=(TextView) findViewById(R.id.VlblM222c);
            chkM222c=(CheckBox) findViewById(R.id.chkM222c);
            secM222d=(LinearLayout)findViewById(R.id.secM222d);
            lineM222d=(View)findViewById(R.id.lineM222d);
            VlblM222d=(TextView) findViewById(R.id.VlblM222d);
            chkM222d=(CheckBox) findViewById(R.id.chkM222d);
            secM222e=(LinearLayout)findViewById(R.id.secM222e);
            lineM222e=(View)findViewById(R.id.lineM222e);
            VlblM222e=(TextView) findViewById(R.id.VlblM222e);
            chkM222e=(CheckBox) findViewById(R.id.chkM222e);
            secM222f=(LinearLayout)findViewById(R.id.secM222f);
            lineM222f=(View)findViewById(R.id.lineM222f);
            VlblM222f=(TextView) findViewById(R.id.VlblM222f);
            chkM222f=(CheckBox) findViewById(R.id.chkM222f);
            secM222g=(LinearLayout)findViewById(R.id.secM222g);
            lineM222g=(View)findViewById(R.id.lineM222g);
            VlblM222g=(TextView) findViewById(R.id.VlblM222g);
            chkM222g=(CheckBox) findViewById(R.id.chkM222g);
            secM222h=(LinearLayout)findViewById(R.id.secM222h);
            lineM222h=(View)findViewById(R.id.lineM222h);
            VlblM222h=(TextView) findViewById(R.id.VlblM222h);
            chkM222h=(CheckBox) findViewById(R.id.chkM222h);
            secM222i=(LinearLayout)findViewById(R.id.secM222i);
            lineM222i=(View)findViewById(R.id.lineM222i);
            VlblM222i=(TextView) findViewById(R.id.VlblM222i);
            chkM222i=(CheckBox) findViewById(R.id.chkM222i);
            secM222x=(LinearLayout)findViewById(R.id.secM222x);
            lineM222x=(View)findViewById(R.id.lineM222x);
            VlblM222x=(TextView) findViewById(R.id.VlblM222x);
            chkM222x=(CheckBox) findViewById(R.id.chkM222x);
            chkM222x.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    if(!((CheckBox) v).isChecked())
                    {
                        secM222x1.setVisibility(View.GONE);
                        lineM222x1.setVisibility(View.GONE);
                        txtM222x1.setText("");
                    }
                    else
                    {
                        secM222x1.setVisibility(View.VISIBLE);
                        lineM222x1.setVisibility(View.VISIBLE);
                    }
                }
            });
            secM222x1=(LinearLayout)findViewById(R.id.secM222x1);
            lineM222x1=(View)findViewById(R.id.lineM222x1);
            VlblM222x1=(TextView) findViewById(R.id.VlblM222x1);
            txtM222x1=(EditText) findViewById(R.id.txtM222x1);

            secM222x1.setVisibility(View.GONE);
            lineM222x1.setVisibility(View.GONE);



            //Hide all skip variables
            secM213a.setVisibility(View.GONE);
            secM213b.setVisibility(View.GONE);
            secM213c.setVisibility(View.GONE);
            secM213x.setVisibility(View.GONE);
            secM213x1.setVisibility(View.GONE);
            secM213x1.setVisibility(View.GONE);

            secM216.setVisibility(View.GONE);
            secM217a.setVisibility(View.GONE);
            secM217b.setVisibility(View.GONE);
            secM217c.setVisibility(View.GONE);
            secM217d.setVisibility(View.GONE);
            secM217x.setVisibility(View.GONE);
            secM217x1.setVisibility(View.GONE);
            secM217x1.setVisibility(View.GONE);

            secM218x1.setVisibility(View.GONE);

            secM2111x1.setVisibility(View.GONE);

            secM2112x1.setVisibility(View.GONE);

            secM2113x1.setVisibility(View.GONE);

            secM222x1.setVisibility(View.GONE);

            txtRnd.setText(RND);
            txtSuchanaId.setText(SUCHANAID);
            txtRnd.setEnabled(false);
            txtSuchanaId.setEnabled(false);


            spnMSlNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnMSlNo.getSelectedItem().toString().length() == 0) return;
                  else
                    {
                        DataSearch(RND,SUCHANAID);
                      //  spnMSlNo.setSelection(Global.SpinnerItemPositionAnyLength(spnMSlNo, MSL));
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });

            DataSearch(RND, SUCHANAID);
            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }});
        }
        catch(Exception  e)
        {
            Connection.MessageBox(Knowledge.this, e.getMessage());
            return;
        }
    }

    private void DataSave()
    {
        try
        {

            String DV="";

            if(txtRnd.getText().toString().length()==0 & secRnd.isShown())
            {
                Connection.MessageBox(Knowledge.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtRnd.getText().toString().length()==0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length()==0 ? "5" : txtRnd.getText().toString()) > 5)
            {
                Connection.MessageBox(Knowledge.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            }
            else if(txtSuchanaId.getText().toString().length()==0 & secSuchanaId.isShown())
            {
                Connection.MessageBox(Knowledge.this, "Required field: উপকারভোগী সদস্য আইডি সুচনা  নম্বর অনুসারে.");
                txtSuchanaId.requestFocus();
                return;
            }

            else if (spnMSlNo.getSelectedItem().toString().length() == 0 & secMSLNumber.isShown()) {
                Connection.MessageBox(Knowledge.this, "Required field: তথ্যদানে সহায়তাকারীর লাইন নম্বর #.");
                // txtMSlNo.requestFocus();
                return;
            }

            else if(!rdoM2121.isChecked() & !rdoM2122.isChecked() & secM212.isShown())
            {
                Connection.MessageBox(Knowledge.this, "Select anyone options from (সন্তান প্রসবের পর ভিটামিন এ ক্যাপসুল গ্রহণ সম্পর্কে শুনেছেন).");
                rdoM2121.requestFocus();
                return;
            }
            else if(txtM213x1.getText().toString().length()==0 & secM213x1.isShown())
            {
                Connection.MessageBox(Knowledge.this, "Required field: উল্লেখ করুন.");
                txtM213x1.requestFocus();
                return;
            }

            else if(!rdoM2141.isChecked() & !rdoM2142.isChecked() & secM214.isShown())
            {
                Connection.MessageBox(Knowledge.this, "Select anyone options from (শিশুকে ভিটামিন এ ক্যাপসুল খাওয়ানোর ব্যপারে শুনেছেন কি).");
                rdoM2141.requestFocus();
                return;
            }

            else if(!rdoM2151.isChecked() & !rdoM2152.isChecked() & secM215.isShown())
            {
                Connection.MessageBox(Knowledge.this, "Select anyone options from (আপনি গর্ভাবস্থায় আয়রন ট্যাবলেট খাওয়ার সম্পর্কে শুনেছেন).");
                rdoM2151.requestFocus();
                return;
            }
            else if(txtM216.getText().toString().length()==0 & secM216.isShown())
            {
                Connection.MessageBox(Knowledge.this, "Required field: গর্ভাবস্থায় কয়টি  আয়রন ট্যাবলেট খাওয়া উচিত.");
                txtM216.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtM216.getText().toString().length() == 0 ? "1" : txtM216.getText().toString()) < 1 || Integer.valueOf(txtM216.getText().toString().length()==0 ? "888" : txtM216.getText().toString()) > 888)
            {
                Connection.MessageBox(Knowledge.this, "Value should be between 1 and 888(গর্ভাবস্থায় কয়টি  আয়রন ট্যাবলেট খাওয়া উচিত).");
                txtM216.requestFocus();
                return;
            }
            else if(txtM217x1.getText().toString().length()==0 & secM217x1.isShown())
            {
                Connection.MessageBox(Knowledge.this, "Required field: উল্লেখ করুন.");
                txtM217x1.requestFocus();
                return;
            }
            else if(txtM218x1.getText().toString().length()==0 & secM218x1.isShown())
            {
                Connection.MessageBox(Knowledge.this, "Required field: উল্লেখ করুন.");
                txtM218x1.requestFocus();
                return;
            }
            else if(txtM2110.getText().toString().length()==0 & secM2110.isShown())
            {
                Connection.MessageBox(Knowledge.this, "Required field: একটি মেয়ে / মহিলার জন্য বিয়ের ন্যূনতম বয়স কত হওয়া উচিত.");
                txtM2110.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtM2110.getText().toString().length() == 0 ? "1" : txtM2110.getText().toString()) < 1 || Integer.valueOf(txtM2110.getText().toString().length()==0 ? "88" : txtM2110.getText().toString()) > 88)
            {
                Connection.MessageBox(Knowledge.this, "Value should be between 1 and 88(একটি মেয়ে / মহিলার জন্য বিয়ের ন্যূনতম বয়স কত হওয়া উচিত).");
                txtM2110.requestFocus();
                return;
            }
            else if(txtM2111x1.getText().toString().length()==0 & secM2111x1.isShown())
            {
                Connection.MessageBox(Knowledge.this, "Required field: উল্লেখ করুন.");
                txtM2111x1.requestFocus();
                return;
            }
            else if(txtM2112x1.getText().toString().length()==0 & secM2112x1.isShown())
            {
                Connection.MessageBox(Knowledge.this, "Required field: উল্লেখ করুন.");
                txtM2112x1.requestFocus();
                return;
            }
            else if(txtM2113x1.getText().toString().length()==0 & secM2113x1.isShown())
            {
                Connection.MessageBox(Knowledge.this, "Required field: নির্দিষ্ট করুন.");
                txtM2113x1.requestFocus();
                return;
            }
            else if(txtM2114.getText().toString().length()==0 & secM2114.isShown())
            {
                Connection.MessageBox(Knowledge.this, "Required field: গর্ভাবস্থায়  অন্তত কতবার  (স্বাস্থ্য পরীক্ষা) (ANC) করা উচিত.");
                txtM2114.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtM2114.getText().toString().length() == 0 ? "1" : txtM2114.getText().toString()) < 1 || Integer.valueOf(txtM2114.getText().toString().length()==0 ? "88" : txtM2114.getText().toString()) > 88)
            {
                Connection.MessageBox(Knowledge.this, "Value should be between 1 and 88(গর্ভাবস্থায়  অন্তত কতবার  (স্বাস্থ্য পরীক্ষা) (ANC) করা উচিত).");
                txtM2114.requestFocus();
                return;
            }

            else if(!rdoM21151.isChecked() & !rdoM21152.isChecked() & !rdoM21153.isChecked()  & secM2115.isShown())
            {
                Connection.MessageBox(Knowledge.this, "Select anyone options from (গর্ভাবস্থায়   অন্য সময়ের তুলনায় দিনের বেলায় কতটুকু ঘুমানো উচিত).");
                rdoM21151.requestFocus();
                return;
            }

            else if(!rdoM21161.isChecked() & !rdoM21162.isChecked() & !rdoM21163.isChecked() & secM2116.isShown())
            {
                Connection.MessageBox(Knowledge.this, "Select anyone options from (গর্ভাবস্থায় অন্য সময়ের তুলনায় কতটুকু খাওয়া উচিত ).");
                rdoM21161.requestFocus();
                return;
            }
            else if(spnM2117.getSelectedItemPosition()==0  & secM2117.isShown())
            {
                Connection.MessageBox(Knowledge.this, "Required field: আপনি কি ধরনের লবণ ব্যবহার করেন? প্যাকেট ((যদি থাকে দেখে নিশ্চিত হন আয়োডিনযুক্ত কিনা.");
                spnM2117.requestFocus();
                return;
            }
            else if(spnM221a.getSelectedItemPosition()==0  & secM221a.isShown())
            {
                Connection.MessageBox(Knowledge.this, "Required field: আপনি কি জানেন আপনার কমিউনিটিতে সাধারণ  চিকিৎসা সেবা কোথা থেকে পেতে পারেন.");
                spnM221a.requestFocus();
                return;
            }
           /* else if(spnM221b.getSelectedItemPosition()==0  & secM221b.isShown())
            {
                Connection.MessageBox(Knowledge.this, "Required field: আপনি কি জানেন আপনার কমিউনিটিতে সাধারণ  চিকিৎসা সেবা কোথা থেকে পেতে পারেন.");
                spnM221b.requestFocus();
                return;
            }*/
            /*else if(spnM221c.getSelectedItemPosition()==0  & secM221c.isShown())
            {
                Connection.MessageBox(Knowledge.this, "Required field: আপনি কি জানেন আপনার কমিউনিটিতে সাধারণ  চিকিৎসা সেবা কোথা থেকে পেতে পারেন.");
                spnM221c.requestFocus();
                return;
            }*/
            else if(txtM221x1.getText().toString().length()==0 & secM221x1.isShown())
            {
                Connection.MessageBox(Knowledge.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtM221x1.requestFocus();
                return;
            }
            else if(txtM222x1.getText().toString().length()==0 & secM222x1.isShown())
            {
                Connection.MessageBox(Knowledge.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtM222x1.requestFocus();
                return;
            }
            if((chkM213a.isChecked()==true || chkM213b.isChecked()==true || chkM213x.isChecked()==true) && chkM213c.isChecked()==true)
            {
                Connection.MessageBox(Knowledge.this, "Inconsistent value in M213");
                return;
            }
            else if((chkM217a.isChecked()==true || chkM217b.isChecked()==true || chkM217c.isChecked()==true || chkM217x.isChecked()==true) && chkM217d.isChecked()==true)
            {
                Connection.MessageBox(Knowledge.this, "Inconsistent value in M217");
                return;
            }
            else  if((chkM218a.isChecked()==true || chkM218b.isChecked()==true || chkM218x.isChecked()==true) && chkM218c.isChecked()==true)
            {
                Connection.MessageBox(Knowledge.this, "Inconsistent value in M218");
                return;
            }
            else if((chkM2111a.isChecked()==true || chkM2111b.isChecked()==true || chkM2111c.isChecked()==true || chkM2111d.isChecked()==true || chkM2111e.isChecked()==true || chkM2111f.isChecked()==true || chkM2111g.isChecked()==true || chkM2111h.isChecked()==true || chkM2111x.isChecked()==true) && chkM2111i.isChecked()==true)
            {
                Connection.MessageBox(Knowledge.this, "Inconsistent value in M2111");
                return;
            }
            else if((chkM2112a.isChecked()==true || chkM2112b.isChecked()==true || chkM2112c.isChecked()==true || chkM2112d.isChecked()==true || chkM2112e.isChecked()==true || chkM2112f.isChecked()==true || chkM2112x.isChecked()==true) && chkM2112g.isChecked()==true)
            {
                Connection.MessageBox(Knowledge.this, "Inconsistent value in M2112");
                return;
            }
            String SQL = "";
            RadioButton rb;

            Knowledge_DataModel objSave = new Knowledge_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaId(txtSuchanaId.getText().toString());
            objSave.setMSLNumber(Connection.SelectedSpinnerValue(spnMSlNo.getSelectedItem().toString(), "-"));
            String[] d_rdogrpM212 = new String[] {"1","0"};
            objSave.setM212("");
            for (int i = 0; i < rdogrpM212.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpM212.getChildAt(i);
                if (rb.isChecked()) objSave.setM212(d_rdogrpM212[i]);
            }

            objSave.setM213a((chkM213a.isChecked()?"1":"2"));
            objSave.setM213b((chkM213b.isChecked()?"1":"2"));
            objSave.setM213c((chkM213c.isChecked()?"1":"2"));
            objSave.setM213x((chkM213x.isChecked()?"1":"2"));
            objSave.setM213x1(txtM213x1.getText().toString());
            String[] d_rdogrpM214 = new String[] {"1","0"};
            objSave.setM214("");
            for (int i = 0; i < rdogrpM214.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpM214.getChildAt(i);
                if (rb.isChecked()) objSave.setM214(d_rdogrpM214[i]);
            }

            String[] d_rdogrpM215 = new String[] {"1","0"};
            objSave.setM215("");
            for (int i = 0; i < rdogrpM215.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpM215.getChildAt(i);
                if (rb.isChecked()) objSave.setM215(d_rdogrpM215[i]);
            }

            objSave.setM216(txtM216.getText().toString());
            objSave.setM217a((chkM217a.isChecked()?"1":"2"));
            objSave.setM217b((chkM217b.isChecked()?"1":"2"));
            objSave.setM217c((chkM217c.isChecked()?"1":"2"));
            objSave.setM217d((chkM217d.isChecked()?"1":"2"));
            objSave.setM217x((chkM217x.isChecked()?"1":"2"));
            objSave.setM217x1(txtM217x1.getText().toString());
            objSave.setM218a((chkM218a.isChecked()?"1":"2"));
            objSave.setM218b((chkM218b.isChecked()?"1":"2"));
            objSave.setM218c((chkM218c.isChecked()?"1":"2"));
            objSave.setM218x((chkM218x.isChecked()?"1":"2"));
            objSave.setM218x1(txtM218x1.getText().toString());
            objSave.setM219a((chkM219a.isChecked()?"1":"2"));
            objSave.setM219b((chkM219b.isChecked()?"1":"2"));
            objSave.setM219c((chkM219c.isChecked()?"1":"2"));
            objSave.setM219d((chkM219d.isChecked()?"1":"2"));
            objSave.setM219e((chkM219e.isChecked()?"1":"2"));
            objSave.setM219f((chkM219f.isChecked()?"1":"2"));
            objSave.setM2110(txtM2110.getText().toString());
            objSave.setM2111a((chkM2111a.isChecked()?"1":"2"));
            objSave.setM2111b((chkM2111b.isChecked()?"1":"2"));
            objSave.setM2111c((chkM2111c.isChecked()?"1":"2"));
            objSave.setM2111d((chkM2111d.isChecked()?"1":"2"));
            objSave.setM2111e((chkM2111e.isChecked()?"1":"2"));
            objSave.setM2111f((chkM2111f.isChecked()?"1":"2"));
            objSave.setM2111g((chkM2111g.isChecked()?"1":"2"));
            objSave.setM2111h((chkM2111h.isChecked()?"1":"2"));
            objSave.setM2111i((chkM2111i.isChecked()?"1":"2"));
            objSave.setM2111x((chkM2111x.isChecked()?"1":"2"));
            objSave.setM2111x1(txtM2111x1.getText().toString());
            objSave.setM2112a((chkM2112a.isChecked()?"1":"2"));
            objSave.setM2112b((chkM2112b.isChecked()?"1":"2"));
            objSave.setM2112c((chkM2112c.isChecked()?"1":"2"));
            objSave.setM2112d((chkM2112d.isChecked()?"1":"2"));
            objSave.setM2112e((chkM2112e.isChecked()?"1":"2"));
            objSave.setM2112f((chkM2112f.isChecked()?"1":"2"));
            objSave.setM2112g((chkM2112g.isChecked()?"1":"2"));
            objSave.setM2112x((chkM2112x.isChecked()?"1":"2"));
            objSave.setM2112x1(txtM2112x1.getText().toString());
            objSave.setM2113a((chkM2113a.isChecked()?"1":"2"));
            objSave.setM2113b((chkM2113b.isChecked()?"1":"2"));
            objSave.setM2113c((chkM2113c.isChecked()?"1":"2"));
            objSave.setM2113d((chkM2113d.isChecked()?"1":"2"));
            objSave.setM2113e((chkM2113e.isChecked()?"1":"2"));
            objSave.setM2113f((chkM2113f.isChecked()?"1":"2"));
            objSave.setM2113g((chkM2113g.isChecked()?"1":"2"));
            objSave.setM2113h((chkM2113h.isChecked()?"1":"2"));
            objSave.setM2113i((chkM2113i.isChecked()?"1":"2"));
            objSave.setM2113j((chkM2113j.isChecked()?"1":"2"));
            objSave.setM2113k((chkM2113k.isChecked()?"1":"2"));
            objSave.setM2113l((chkM2113l.isChecked()?"1":"2"));
            objSave.setM2113M((chkM2113M.isChecked()?"1":"2"));
            objSave.setM2113x((chkM2113x.isChecked()?"1":"2"));
            objSave.setM2113x1(txtM2113x1.getText().toString());
            objSave.setM2114(txtM2114.getText().toString());
            String[] d_rdogrpM2115 = new String[] {"1","2","3"};
            objSave.setM2115("");
            for (int i = 0; i < rdogrpM2115.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpM2115.getChildAt(i);
                if (rb.isChecked()) objSave.setM2115(d_rdogrpM2115[i]);
            }

            String[] d_rdogrpM2116 = new String[] {"1","2","3"};
            objSave.setM2116("");
            for (int i = 0; i < rdogrpM2116.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpM2116.getChildAt(i);
                if (rb.isChecked()) objSave.setM2116(d_rdogrpM2116[i]);
            }

            objSave.setM2117((spnM2117.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM2117.getSelectedItem().toString(), "-")));
            objSave.setM221a((spnM221a.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM221a.getSelectedItem().toString(), "-")));
            objSave.setM221b((spnM221b.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM221b.getSelectedItem().toString(), "-")));
            objSave.setM221c((spnM221c.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM221c.getSelectedItem().toString(), "-")));
            objSave.setM221x1(txtM221x1.getText().toString());
            objSave.setM222a((chkM222a.isChecked()?"1":"2"));
            objSave.setM222b((chkM222b.isChecked()?"1":"2"));
            objSave.setM222c((chkM222c.isChecked()?"1":"2"));
            objSave.setM222d((chkM222d.isChecked()?"1":"2"));
            objSave.setM222e((chkM222e.isChecked()?"1":"2"));
            objSave.setM222f((chkM222f.isChecked()?"1":"2"));
            objSave.setM222g((chkM222g.isChecked()?"1":"2"));
            objSave.setM222h((chkM222h.isChecked()?"1":"2"));
            objSave.setM222i((chkM222i.isChecked()?"1":"2"));
            objSave.setM222x((chkM222x.isChecked()?"1":"2"));
            objSave.setM222x1(txtM222x1.getText().toString());
            objSave.setEnDt(Global.DateTimeNowYMDHMS());
            objSave.setStartTime(StartTime);
            objSave.setEndTime(g.CurrentTime24());
            objSave.setUserId(g.getUserId());
            objSave.setEntryUser(g.getUserId()); //from data entry user list
            //objSave.setLat(Double.toString(currentLatitude));
            //objSave.setLon(Double.toString(currentLongitude));

            String status = objSave.SaveUpdateData(this);
            if(status.length()==0) {
                EntryStatus_DataModel e = new EntryStatus_DataModel(TableName, RND, SUCHANAID);
                e.SaveUpdateData(this);
                Bundle IDBundle = new Bundle();
                finish();
                IDBundle.putString("Rnd", txtRnd.getText().toString());
                IDBundle.putString("SuchanaID", txtSuchanaId.getText().toString());
                startActivity(new Intent(Knowledge.this, FdHabitKnow.class).putExtras(IDBundle));

            }
            else{
                Connection.MessageBox(Knowledge.this, status);
                return;
            }
        }
        catch(Exception  e)
        {
            Connection.MessageBox(Knowledge.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaId)
    {
        try
        {

            RadioButton rb;
            Knowledge_DataModel d = new Knowledge_DataModel();
            String SQL = "Select * from "+ TableName +"  Where Rnd='"+ Rnd +"' and SuchanaId='"+ SuchanaId +"'";
            List<Knowledge_DataModel> data = d.SelectAll(this, SQL);
            for(Knowledge_DataModel item : data){
                txtRnd.setText(item.getRnd());
                txtSuchanaId.setText(item.getSuchanaId());
                //txtMSLNumber.setText(item.getMSLNumber());
                spnMSlNo.setSelection(Global.SpinnerItemPositionAnyLength(spnMSlNo, item.getMSLNumber()));
                MSL = item.getMSLNumber();

                String[] d_rdogrpM212 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpM212.length; i++)
                {
                    if (item.getM212().equals(String.valueOf(d_rdogrpM212[i])))
                    {
                        rb = (RadioButton)rdogrpM212.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if(item.getM213a().equals("1"))
                {
                    chkM213a.setChecked(true);
                }
                else if(item.getM213a().equals("2"))
                {
                    chkM213a.setChecked(false);
                }
                if(item.getM213b().equals("1"))
                {
                    chkM213b.setChecked(true);
                }
                else if(item.getM213b().equals("2"))
                {
                    chkM213b.setChecked(false);
                }
                if(item.getM213c().equals("1"))
                {
                    chkM213c.setChecked(true);
                }
                else if(item.getM213c().equals("2"))
                {
                    chkM213c.setChecked(false);
                }
                if(item.getM213x().equals("1"))
                {
                    chkM213x.setChecked(true);
                }
                else if(item.getM213x().equals("2"))
                {
                    chkM213x.setChecked(false);
                }
                txtM213x1.setText(item.getM213x1());
                String[] d_rdogrpM214 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpM214.length; i++)
                {
                    if (item.getM214().equals(String.valueOf(d_rdogrpM214[i])))
                    {
                        rb = (RadioButton)rdogrpM214.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM215 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpM215.length; i++)
                {
                    if (item.getM215().equals(String.valueOf(d_rdogrpM215[i])))
                    {
                        rb = (RadioButton)rdogrpM215.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtM216.setText(item.getM216());
                if(item.getM217a().equals("1"))
                {
                    chkM217a.setChecked(true);
                }
                else if(item.getM217a().equals("2"))
                {
                    chkM217a.setChecked(false);
                }
                if(item.getM217b().equals("1"))
                {
                    chkM217b.setChecked(true);
                }
                else if(item.getM217b().equals("2"))
                {
                    chkM217b.setChecked(false);
                }
                if(item.getM217c().equals("1"))
                {
                    chkM217c.setChecked(true);
                }
                else if(item.getM217c().equals("2"))
                {
                    chkM217c.setChecked(false);
                }
                if(item.getM217d().equals("1"))
                {
                    chkM217d.setChecked(true);
                }
                else if(item.getM217d().equals("2"))
                {
                    chkM217d.setChecked(false);
                }
                if(item.getM217x().equals("1"))
                {
                    chkM217x.setChecked(true);
                }
                else if(item.getM217x().equals("2"))
                {
                    chkM217x.setChecked(false);
                }
                txtM217x1.setText(item.getM217x1());
                if(item.getM218a().equals("1"))
                {
                    chkM218a.setChecked(true);
                }
                else if(item.getM218a().equals("2"))
                {
                    chkM218a.setChecked(false);
                }
                if(item.getM218b().equals("1"))
                {
                    chkM218b.setChecked(true);
                }
                else if(item.getM218b().equals("2"))
                {
                    chkM218b.setChecked(false);
                }
                if(item.getM218c().equals("1"))
                {
                    chkM218c.setChecked(true);
                }
                else if(item.getM218c().equals("2"))
                {
                    chkM218c.setChecked(false);
                }
                if(item.getM218x().equals("1"))
                {
                    chkM218x.setChecked(true);
                }
                else if(item.getM218x().equals("2"))
                {
                    chkM218x.setChecked(false);
                }
                txtM218x1.setText(item.getM218x1());
                if(item.getM219a().equals("1"))
                {
                    chkM219a.setChecked(true);
                }
                else if(item.getM219a().equals("2"))
                {
                    chkM219a.setChecked(false);
                }
                if(item.getM219b().equals("1"))
                {
                    chkM219b.setChecked(true);
                }
                else if(item.getM219b().equals("2"))
                {
                    chkM219b.setChecked(false);
                }
                if(item.getM219c().equals("1"))
                {
                    chkM219c.setChecked(true);
                }
                else if(item.getM219c().equals("2"))
                {
                    chkM219c.setChecked(false);
                }
                if(item.getM219d().equals("1"))
                {
                    chkM219d.setChecked(true);
                }
                else if(item.getM219d().equals("2"))
                {
                    chkM219d.setChecked(false);
                }
                if(item.getM219e().equals("1"))
                {
                    chkM219e.setChecked(true);
                }
                else if(item.getM219e().equals("2"))
                {
                    chkM219e.setChecked(false);
                }
                if(item.getM219f().equals("1"))
                {
                    chkM219f.setChecked(true);
                }
                else if(item.getM219f().equals("2"))
                {
                    chkM219f.setChecked(false);
                }
                txtM2110.setText(item.getM2110());
                if(item.getM2111a().equals("1"))
                {
                    chkM2111a.setChecked(true);
                }
                else if(item.getM2111a().equals("2"))
                {
                    chkM2111a.setChecked(false);
                }
                if(item.getM2111b().equals("1"))
                {
                    chkM2111b.setChecked(true);
                }
                else if(item.getM2111b().equals("2"))
                {
                    chkM2111b.setChecked(false);
                }
                if(item.getM2111c().equals("1"))
                {
                    chkM2111c.setChecked(true);
                }
                else if(item.getM2111c().equals("2"))
                {
                    chkM2111c.setChecked(false);
                }
                if(item.getM2111d().equals("1"))
                {
                    chkM2111d.setChecked(true);
                }
                else if(item.getM2111d().equals("2"))
                {
                    chkM2111d.setChecked(false);
                }
                if(item.getM2111e().equals("1"))
                {
                    chkM2111e.setChecked(true);
                }
                else if(item.getM2111e().equals("2"))
                {
                    chkM2111e.setChecked(false);
                }
                if(item.getM2111f().equals("1"))
                {
                    chkM2111f.setChecked(true);
                }
                else if(item.getM2111f().equals("2"))
                {
                    chkM2111f.setChecked(false);
                }
                if(item.getM2111g().equals("1"))
                {
                    chkM2111g.setChecked(true);
                }
                else if(item.getM2111g().equals("2"))
                {
                    chkM2111g.setChecked(false);
                }

                if(item.getM2111h().equals("1"))
                {
                    chkM2111h.setChecked(true);
                }
                else if(item.getM2111h().equals("2"))
                {
                    chkM2111h.setChecked(false);
                }

                if(item.getM2111i().equals("1"))
                {
                    chkM2111i.setChecked(true);
                }
                else if(item.getM2111i().equals("2"))
                {
                    chkM2111i.setChecked(false);
                }

                if(item.getM2111x().equals("1"))
                {
                    chkM2111x.setChecked(true);
                }
                else if(item.getM2111x().equals("2"))
                {
                    chkM2111x.setChecked(false);
                }
                txtM2111x1.setText(item.getM2111x1());
                if(item.getM2112a().equals("1"))
                {
                    chkM2112a.setChecked(true);
                }
                else if(item.getM2112a().equals("2"))
                {
                    chkM2112a.setChecked(false);
                }
                if(item.getM2112b().equals("1"))
                {
                    chkM2112b.setChecked(true);
                }
                else if(item.getM2112b().equals("2"))
                {
                    chkM2112b.setChecked(false);
                }
                if(item.getM2112c().equals("1"))
                {
                    chkM2112c.setChecked(true);
                }
                else if(item.getM2112c().equals("2"))
                {
                    chkM2112c.setChecked(false);
                }
                if(item.getM2112d().equals("1"))
                {
                    chkM2112d.setChecked(true);
                }
                else if(item.getM2112d().equals("2"))
                {
                    chkM2112d.setChecked(false);
                }
                if(item.getM2112e().equals("1"))
                {
                    chkM2112e.setChecked(true);
                }
                else if(item.getM2112e().equals("2"))
                {
                    chkM2112e.setChecked(false);
                }
                if(item.getM2112f().equals("1"))
                {
                    chkM2112f.setChecked(true);
                }
                else if(item.getM2112f().equals("2"))
                {
                    chkM2112f.setChecked(false);
                }
                if(item.getM2112g().equals("1"))
                {
                    chkM2112g.setChecked(true);
                }
                else if(item.getM2112g().equals("2"))
                {
                    chkM2112g.setChecked(false);
                }
                if(item.getM2112x().equals("1"))
                {
                    chkM2112x.setChecked(true);
                }
                else if(item.getM2112x().equals("2"))
                {
                    chkM2112x.setChecked(false);
                }
                txtM2112x1.setText(item.getM2112x1());
                if(item.getM2113a().equals("1"))
                {
                    chkM2113a.setChecked(true);
                }
                else if(item.getM2113a().equals("2"))
                {
                    chkM2113a.setChecked(false);
                }
                if(item.getM2113b().equals("1"))
                {
                    chkM2113b.setChecked(true);
                }
                else if(item.getM2113b().equals("2"))
                {
                    chkM2113b.setChecked(false);
                }
                if(item.getM2113c().equals("1"))
                {
                    chkM2113c.setChecked(true);
                }
                else if(item.getM2113c().equals("2"))
                {
                    chkM2113c.setChecked(false);
                }
                if(item.getM2113d().equals("1"))
                {
                    chkM2113d.setChecked(true);
                }
                else if(item.getM2113d().equals("2"))
                {
                    chkM2113d.setChecked(false);
                }
                if(item.getM2113e().equals("1"))
                {
                    chkM2113e.setChecked(true);
                }
                else if(item.getM2113e().equals("2"))
                {
                    chkM2113e.setChecked(false);
                }
                if(item.getM2113f().equals("1"))
                {
                    chkM2113f.setChecked(true);
                }
                else if(item.getM2113f().equals("2"))
                {
                    chkM2113f.setChecked(false);
                }
                if(item.getM2113g().equals("1"))
                {
                    chkM2113g.setChecked(true);
                }
                else if(item.getM2113g().equals("2"))
                {
                    chkM2113g.setChecked(false);
                }
                if(item.getM2113h().equals("1"))
                {
                    chkM2113h.setChecked(true);
                }
                else if(item.getM2113h().equals("2"))
                {
                    chkM2113h.setChecked(false);
                }
                if(item.getM2113i().equals("1"))
                {
                    chkM2113i.setChecked(true);
                }
                else if(item.getM2113i().equals("2"))
                {
                    chkM2113i.setChecked(false);
                }
                if(item.getM2113j().equals("1"))
                {
                    chkM2113j.setChecked(true);
                }
                else if(item.getM2113j().equals("2"))
                {
                    chkM2113j.setChecked(false);
                }
                if(item.getM2113k().equals("1"))
                {
                    chkM2113k.setChecked(true);
                }
                else if(item.getM2113k().equals("2"))
                {
                    chkM2113k.setChecked(false);
                }
                if(item.getM2113l().equals("1"))
                {
                    chkM2113l.setChecked(true);
                }
                else if(item.getM2113l().equals("2"))
                {
                    chkM2113l.setChecked(false);
                }
                if(item.getM2113M().equals("1"))
                {
                    chkM2113M.setChecked(true);
                }
                else if(item.getM2113M().equals("2"))
                {
                    chkM2113M.setChecked(false);
                }
                if(item.getM2113x().equals("1"))
                {
                    chkM2113x.setChecked(true);
                }
                else if(item.getM2113x().equals("2"))
                {
                    chkM2113x.setChecked(false);
                }
                txtM2113x1.setText(item.getM2113x1());
                txtM2114.setText(item.getM2114());
                String[] d_rdogrpM2115 = new String[] {"1","2","3"};
                for (int i = 0; i < d_rdogrpM2115.length; i++)
                {
                    if (item.getM2115().equals(String.valueOf(d_rdogrpM2115[i])))
                    {
                        rb = (RadioButton)rdogrpM2115.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpM2116 = new String[] {"1","2","3"};
                for (int i = 0; i < d_rdogrpM2116.length; i++)
                {
                    if (item.getM2116().equals(String.valueOf(d_rdogrpM2116[i])))
                    {
                        rb = (RadioButton)rdogrpM2116.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnM2117.setSelection(Global.SpinnerItemPositionAnyLength(spnM2117, item.getM2117()));
                spnM221a.setSelection(Global.SpinnerItemPositionAnyLength(spnM221a, item.getM221a()));
                spnM221b.setSelection(Global.SpinnerItemPositionAnyLength(spnM221b, item.getM221b()));
                spnM221c.setSelection(Global.SpinnerItemPositionAnyLength(spnM221c, item.getM221c()));
                txtM221x1.setText(item.getM221x1());
                if(item.getM222a().equals("1"))
                {
                    chkM222a.setChecked(true);
                }
                else if(item.getM222a().equals("2"))
                {
                    chkM222a.setChecked(false);
                }
                if(item.getM222b().equals("1"))
                {
                    chkM222b.setChecked(true);
                }
                else if(item.getM222b().equals("2"))
                {
                    chkM222b.setChecked(false);
                }
                if(item.getM222c().equals("1"))
                {
                    chkM222c.setChecked(true);
                }
                else if(item.getM222c().equals("2"))
                {
                    chkM222c.setChecked(false);
                }
                if(item.getM222d().equals("1"))
                {
                    chkM222d.setChecked(true);
                }
                else if(item.getM222d().equals("2"))
                {
                    chkM222d.setChecked(false);
                }
                if(item.getM222e().equals("1"))
                {
                    chkM222e.setChecked(true);
                }
                else if(item.getM222e().equals("2"))
                {
                    chkM222e.setChecked(false);
                }
                if(item.getM222f().equals("1"))
                {
                    chkM222f.setChecked(true);
                }
                else if(item.getM222f().equals("2"))
                {
                    chkM222f.setChecked(false);
                }
                if(item.getM222g().equals("1"))
                {
                    chkM222g.setChecked(true);
                }
                else if(item.getM222g().equals("2"))
                {
                    chkM222g.setChecked(false);
                }
                if(item.getM222h().equals("1"))
                {
                    chkM222h.setChecked(true);
                }
                else if(item.getM222h().equals("2"))
                {
                    chkM222h.setChecked(false);
                }
                if(item.getM222i().equals("1"))
                {
                    chkM222i.setChecked(true);
                }
                else if(item.getM222i().equals("2"))
                {
                    chkM222i.setChecked(false);
                }
                if(item.getM222x().equals("1"))
                {
                    chkM222x.setChecked(true);
                }
                else if(item.getM222x().equals("2"))
                {
                    chkM222x.setChecked(false);
                }
                txtM222x1.setText(item.getM222x1());
            }
        }
        catch(Exception  e)
        {
            Connection.MessageBox(Knowledge.this, e.getMessage());
            return;
        }
    }

    protected Dialog onCreateDialog(int id) {
        final Calendar c = Calendar.getInstance();
        hour = c.get(Calendar.HOUR_OF_DAY);
        minute = c.get(Calendar.MINUTE);
        switch (id) {
            case DATE_DIALOG:
                return new DatePickerDialog(this, mDateSetListener,g.mYear,g.mMonth-1,g.mDay);
            case TIME_DIALOG:
                return new TimePickerDialog(this, timePickerListener, hour, minute,false);
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