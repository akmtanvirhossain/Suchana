package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Adolescent" android:label="Adolescent" />

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

public class Adolescent extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    private static String Status = "new";
    boolean networkAvailable=false;
    Location currentLocation;
    double currentLatitude,currentLongitude;
    String VariableID;
    Connection C;
    Global g;
    SimpleAdapter dataAdapter;
    ArrayList<HashMap<String, String>> dataList = new ArrayList<HashMap<String, String>>();
    TextView lblHeading;
    LinearLayout seclblHeading;
    LinearLayout secRnd;
    View lineRnd;
    TextView VlblRnd;
    EditText txtRnd;
    LinearLayout secDist;
    View lineDist;
    TextView VlblDist;
    Spinner spnDist;
    LinearLayout secUpz;
    View lineUpz;
    TextView VlblUpz;
    Spinner spnUpz;
    LinearLayout secUn;
    View lineUn;
    TextView VlblUn;
    Spinner spnUn;
    LinearLayout secVill;
    View lineVill;
    TextView VlblVill;
    Spinner spnVill;
    LinearLayout secHHNo;
    View lineHHNo;
    TextView VlblHHNo;
    EditText txtHHNo;
    LinearLayout secSuchanaID;
    View lineSuchanaID;
    TextView VlblSuchanaID;
    EditText txtSuchanaID;
    LinearLayout secMobNo;
    View lineMobNo;
    TextView VlblMobNo;
    EditText txtMobNo;
    LinearLayout secResName;
    View lineResName;
    TextView VlblResName;
    EditText txtResName;
    LinearLayout secHedName;
    View lineHedName;
    TextView VlblHedName;
    EditText txtHedName;
    LinearLayout secVDate;
    View lineVDate;
    TextView VlblVDate;
    EditText dtpVDate;
    LinearLayout secResult;
    View lineResult;
    TextView VlblResult;
    Spinner spnResult;
    LinearLayout secResultX;
    View lineResultX;
    TextView VlblResultX;
    EditText txtResultX;
    LinearLayout seclblQ1;
    LinearLayout secQ11;
    View lineQ11;
    TextView VlblQ11;
    RadioGroup rdogrpQ11;
    RadioButton rdoQ111;
    RadioButton rdoQ112;
    LinearLayout seclblQ12;
    LinearLayout secQ12Y;
    View lineQ12Y;
    TextView VlblQ12Y;
    EditText txtQ12Y;
    LinearLayout secQ12M;
    View lineQ12M;
    TextView VlblQ12M;
    EditText txtQ12M;
    LinearLayout secQ13;
    View lineQ13;
    TextView VlblQ13;
    Spinner spnQ13;
    LinearLayout secQ14;
    View lineQ14;
    TextView VlblQ14;
    Spinner spnQ14;
    LinearLayout secQ14X;
    View lineQ14X;
    TextView VlblQ14X;
    EditText txtQ14X;
    LinearLayout secQ15;
    View lineQ15;
    TextView VlblQ15;
    RadioGroup rdogrpQ15;
    RadioButton rdoQ151;
    RadioButton rdoQ152;
    LinearLayout secQ16;
    View lineQ16;
    TextView VlblQ16;
    EditText txtQ16;
    LinearLayout secQ17;
    View lineQ17;
    TextView VlblQ17;
    Spinner spnQ17;
    LinearLayout secQ18;
    View lineQ18;
    TextView VlblQ18;
    Spinner spnQ18;
    LinearLayout secQ18X;
    View lineQ18X;
    TextView VlblQ18X;
    EditText txtQ18X;
    LinearLayout secQ19;
    View lineQ19;
    TextView VlblQ19;
    Spinner spnQ19;
    LinearLayout secQ19X;
    View lineQ19X;
    TextView VlblQ19X;
    EditText txtQ19X;
    LinearLayout secQ110;
    View lineQ110;
    TextView VlblQ110;
    EditText txtQ110;
    LinearLayout secQ111;
    View lineQ111;
    TextView VlblQ111;
    RadioGroup rdogrpQ111;
    RadioButton rdoQ1111;
    RadioButton rdoQ1112;
    LinearLayout secQ112;
    View lineQ112;
    TextView VlblQ112;
    RadioGroup rdogrpQ112;
    RadioButton rdoQ1121;
    RadioButton rdoQ1122;
    LinearLayout seclblQ2;
    LinearLayout seclblQ2a;
    LinearLayout seclblQ211;
    LinearLayout secQ211a;
    View lineQ211a;
    TextView VlblQ211a;
    CheckBox chkQ211a;
    LinearLayout secQ211b;
    View lineQ211b;
    TextView VlblQ211b;
    CheckBox chkQ211b;
    LinearLayout secQ211c;
    View lineQ211c;
    TextView VlblQ211c;
    CheckBox chkQ211c;
    LinearLayout secQ211d;
    View lineQ211d;
    TextView VlblQ211d;
    CheckBox chkQ211d;
    LinearLayout secQ211e;
    View lineQ211e;
    TextView VlblQ211e;
    CheckBox chkQ211e;
    LinearLayout secQ211f;
    View lineQ211f;
    TextView VlblQ211f;
    CheckBox chkQ211f;
    LinearLayout secQ211g;
    View lineQ211g;
    TextView VlblQ211g;
    CheckBox chkQ211g;
    LinearLayout secQ211h;
    View lineQ211h;
    TextView VlblQ211h;
    CheckBox chkQ211h;
    LinearLayout secQ211i;
    View lineQ211i;
    TextView VlblQ211i;
    CheckBox chkQ211i;
    LinearLayout secQ211j;
    View lineQ211j;
    TextView VlblQ211j;
    CheckBox chkQ211j;
    LinearLayout secQ211k;
    View lineQ211k;
    TextView VlblQ211k;
    CheckBox chkQ211k;
    LinearLayout secQ211l;
    View lineQ211l;
    TextView VlblQ211l;
    CheckBox chkQ211l;
    LinearLayout secQ211m;
    View lineQ211m;
    TextView VlblQ211m;
    CheckBox chkQ211m;
    LinearLayout secQ211X;
    View lineQ211X;
    TextView VlblQ211X;
    CheckBox chkQ211X;
    LinearLayout secQ211X1;
    View lineQ211X1;
    TextView VlblQ211X1;
    EditText txtQ211X1;
    LinearLayout secQ211n;
    View lineQ211n;
    TextView VlblQ211n;
    CheckBox chkQ211n;
    LinearLayout secQ212;
    View lineQ212;
    TextView VlblQ212;
    EditText txtQ212;
    LinearLayout secQ213;
    View lineQ213;
    TextView VlblQ213;
    EditText txtQ213;
    LinearLayout seclblQ214;
    LinearLayout secQ214a;
    View lineQ214a;
    TextView VlblQ214a;
    CheckBox chkQ214a;
    LinearLayout secQ214b;
    View lineQ214b;
    TextView VlblQ214b;
    CheckBox chkQ214b;
    LinearLayout secQ214c;
    View lineQ214c;
    TextView VlblQ214c;
    CheckBox chkQ214c;
    LinearLayout secQ214d;
    View lineQ214d;
    TextView VlblQ214d;
    CheckBox chkQ214d;
    LinearLayout secQ214e;
    View lineQ214e;
    TextView VlblQ214e;
    CheckBox chkQ214e;
    LinearLayout secQ214f;
    View lineQ214f;
    TextView VlblQ214f;
    CheckBox chkQ214f;
    LinearLayout secQ214g;
    View lineQ214g;
    TextView VlblQ214g;
    CheckBox chkQ214g;
    LinearLayout secQ214h;
    View lineQ214h;
    TextView VlblQ214h;
    CheckBox chkQ214h;
    LinearLayout secQ214X;
    View lineQ214X;
    TextView VlblQ214X;
    CheckBox chkQ214X;
    LinearLayout secQ214X1;
    View lineQ214X1;
    TextView VlblQ214X1;
    EditText txtQ214X1;
    LinearLayout secQ214i;
    View lineQ214i;
    TextView VlblQ214i;
    CheckBox chkQ214i;
    LinearLayout seclblQ215;
    LinearLayout secQ215a;
    View lineQ215a;
    TextView VlblQ215a;
    CheckBox chkQ215a;
    LinearLayout secQ215b;
    View lineQ215b;
    TextView VlblQ215b;
    CheckBox chkQ215b;
    LinearLayout secQ215c;
    View lineQ215c;
    TextView VlblQ215c;
    CheckBox chkQ215c;
    LinearLayout secQ215d;
    View lineQ215d;
    TextView VlblQ215d;
    CheckBox chkQ215d;
    LinearLayout secQ215e;
    View lineQ215e;
    TextView VlblQ215e;
    CheckBox chkQ215e;
    LinearLayout secQ215f;
    View lineQ215f;
    TextView VlblQ215f;
    CheckBox chkQ215f;
    LinearLayout secQ215g;
    View lineQ215g;
    TextView VlblQ215g;
    CheckBox chkQ215g;
    LinearLayout secQ215X;
    View lineQ215X;
    TextView VlblQ215X;
    CheckBox chkQ215X;
    LinearLayout secQ215X1;
    View lineQ215X1;
    TextView VlblQ215X1;
    EditText txtQ215X1;
    LinearLayout secQ215h;
    View lineQ215h;
    TextView VlblQ215h;
    CheckBox chkQ215h;
    LinearLayout seclbl221;
    LinearLayout secQ221;
    View lineQ221;
    TextView VlblQ221;
    RadioGroup rdogrpQ221;
    RadioButton rdoQ2211;
    RadioButton rdoQ2212;
    LinearLayout secQ222;
    View lineQ222;
    TextView VlblQ222;
    RadioGroup rdogrpQ222;
    RadioButton rdoQ2221;
    RadioButton rdoQ2222;
    LinearLayout secQ223;
    View lineQ223;
    TextView VlblQ223;
    RadioGroup rdogrpQ223;
    RadioButton rdoQ2231;
    RadioButton rdoQ2232;
    LinearLayout secQ224;
    View lineQ224;
    TextView VlblQ224;
    RadioGroup rdogrpQ224;
    RadioButton rdoQ2241;
    RadioButton rdoQ2242;
    LinearLayout secQ225;
    View lineQ225;
    TextView VlblQ225;
    EditText txtQ225;
    LinearLayout seclbl3;
    LinearLayout secQ31;
    View lineQ31;
    TextView VlblQ31;
    RadioGroup rdogrpQ31;
    RadioButton rdoQ311;
    RadioButton rdoQ312;
    LinearLayout secQ32;
    View lineQ32;
    TextView VlblQ32;
    RadioGroup rdogrpQ32;
    RadioButton rdoQ321;
    RadioButton rdoQ322;
    LinearLayout secQ33;
    View lineQ33;
    TextView VlblQ33;
    RadioGroup rdogrpQ33;
    RadioButton rdoQ331;
    RadioButton rdoQ332;
    LinearLayout secQ34;
    View lineQ34;
    TextView VlblQ34;
    RadioGroup rdogrpQ34;
    RadioButton rdoQ341;
    RadioButton rdoQ342;
    LinearLayout secQ35;
    View lineQ35;
    TextView VlblQ35;
    RadioGroup rdogrpQ35;
    RadioButton rdoQ351;
    RadioButton rdoQ352;
    RadioButton rdoQ353;
    LinearLayout secQ36;
    View lineQ36;
    TextView VlblQ36;
    RadioGroup rdogrpQ36;
    RadioButton rdoQ361;
    RadioButton rdoQ362;
    RadioButton rdoQ363;
    LinearLayout secQ37;
    View lineQ37;
    TextView VlblQ37;
    RadioGroup rdogrpQ37;
    RadioButton rdoQ371;
    RadioButton rdoQ372;
    String StartTime;
    Bundle IDbundle;
    String DIS = "";
    String UPZ = "";
    String UN = "";
    String VILL = "";
    ImageButton cmdForward;
    TextView lblNext;
    ImageButton cmdHome;
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


            dtpDate = (EditText) findViewById(R.id.dtpVDate);
            if (VariableID.equals("btnVDate")) {
                dtpDate = (EditText) findViewById(R.id.dtpVDate);
            }
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
        try
        {
            setContentView(R.layout.adolescent);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TableName = "Adolescent";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView)findViewById(R.id.lblHeading);

            /*ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Adolescent.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Father.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDbundle);
                            getApplicationContext().startActivity(intent);
                            finish();
                        }
                    });
                    adb.show();
                }});*/
            ImageButton cmdForward = (ImageButton) findViewById(R.id.cmdForward);
            cmdForward.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Adolescent.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to go to Adolescent list [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDBundle = new Bundle();
                            IDBundle.putString("Rnd", RND);
                            IDBundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Adolescent_list.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDBundle);
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
                    f1 = new Intent(getApplicationContext(), MainMenu.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);
                }
            });

            seclblHeading=(LinearLayout)findViewById(R.id.seclblHeading);
            secRnd = (LinearLayout) findViewById(R.id.secRnd);
            lineRnd = (View) findViewById(R.id.lineRnd);
            VlblRnd = (TextView) findViewById(R.id.VlblRnd);
            txtRnd = (EditText) findViewById(R.id.txtRnd);
            txtRnd.setText(RND);
            txtRnd.setEnabled(false);

            secDist=(LinearLayout)findViewById(R.id.secDist);
            lineDist=(View)findViewById(R.id.lineDist);
            VlblDist=(TextView) findViewById(R.id.VlblDist);
            spnDist = (Spinner) findViewById(R.id.spnDist);
            spnDist.setAdapter(C.getArrayAdapter("Select '' DistCode union select distinct DistCode||'-'||DistName from VillageList order by DistCode"));
            spnDist.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    //SuchanaIdBuilder[0] = String.valueOf(id);
                    GenerateSuchanaID();
                    String D = Connection.SelectedSpinnerValue(spnDist.getSelectedItem().toString(), "-");
                    spnUpz.setAdapter(C.getArrayAdapter("Select '' union Select distinct UPZCode||'-'||UPZName from VillageList where DistCode='" + D + "'"));
                    spnUpz.setSelection(Global.SpinnerItemPositionAnyLength(spnUpz, UPZ));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            secUpz = (LinearLayout) findViewById(R.id.secUpz);
            lineUpz = (View) findViewById(R.id.lineUpz);
            VlblUpz = (TextView) findViewById(R.id.VlblUpz);
            spnUpz = (Spinner) findViewById(R.id.spnUpz);

            spnUpz.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    GenerateSuchanaID();
                    //SuchanaIdBuilder[1] = String.valueOf(id);
                    String D = Connection.SelectedSpinnerValue(spnDist.getSelectedItem().toString(), "-");
                    String U = Connection.SelectedSpinnerValue(spnUpz.getSelectedItem().toString(), "-");
                    spnUn.setAdapter(C.getArrayAdapter("Select '' union Select distinct UNCode||'-'||UNName from VillageList where DistCode='" + D + "' and UpzCode='" + U + "'"));
                    spnUn.setSelection(Global.SpinnerItemPositionAnyLength(spnUn, UN));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            secUn = (LinearLayout) findViewById(R.id.secUn);
            lineUn = (View) findViewById(R.id.lineUn);
            VlblUn = (TextView) findViewById(R.id.VlblUn);
            spnUn = (Spinner) findViewById(R.id.spnUn);

            spnUn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    GenerateSuchanaID();
                    //SuchanaIdBuilder[2] = String.valueOf(id);
                    String D = Connection.SelectedSpinnerValue(spnDist.getSelectedItem().toString(), "-");
                    String U = Connection.SelectedSpinnerValue(spnUpz.getSelectedItem().toString(), "-");
                    String UN = Connection.SelectedSpinnerValue(spnUn.getSelectedItem().toString(), "-");
                    spnVill.setAdapter(C.getArrayAdapter("Select '' union Select distinct VillCode||'-'||VillName from VillageList where DistCode='" + D + "' and UpzCode='" + U + "' and UNCode='" + UN + "'"));
                    spnVill.setSelection(Global.SpinnerItemPositionAnyLength(spnVill, VILL));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            secVill = (LinearLayout) findViewById(R.id.secVill);
            lineVill = (View) findViewById(R.id.lineVill);
            VlblVill = (TextView) findViewById(R.id.VlblVill);
            spnVill = (Spinner) findViewById(R.id.spnVill);
            spnVill.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    GenerateSuchanaID();
                    //SuchanaIdBuilder[0] = String.valueOf(id);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            secHHNo=(LinearLayout)findViewById(R.id.secHHNo);
            lineHHNo=(View)findViewById(R.id.lineHHNo);
            VlblHHNo=(TextView) findViewById(R.id.VlblHHNo);
            txtHHNo=(EditText) findViewById(R.id.txtHHNo);

            txtHHNo.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    GenerateSuchanaID();
                    //SuchanaIdBuilder[4] = txtH11.getText().toString();
                }
            });

            secSuchanaID = (LinearLayout) findViewById(R.id.secSuchanaID);
            lineSuchanaID = (View) findViewById(R.id.lineSuchanaID);
            VlblSuchanaID = (TextView) findViewById(R.id.VlblSuchanaID);
            txtSuchanaID = (EditText) findViewById(R.id.txtSuchanaID);
            txtSuchanaID.setEnabled(false);

            secMobNo=(LinearLayout)findViewById(R.id.secMobNo);
            lineMobNo=(View)findViewById(R.id.lineMobNo);
            VlblMobNo=(TextView) findViewById(R.id.VlblMobNo);
            txtMobNo=(EditText) findViewById(R.id.txtMobNo);

            secResName=(LinearLayout)findViewById(R.id.secResName);
            lineResName=(View)findViewById(R.id.lineResName);
            VlblResName=(TextView) findViewById(R.id.VlblResName);
            txtResName=(EditText) findViewById(R.id.txtResName);
            secHedName=(LinearLayout)findViewById(R.id.secHedName);
            lineHedName=(View)findViewById(R.id.lineHedName);
            VlblHedName=(TextView) findViewById(R.id.VlblHedName);
            txtHedName=(EditText) findViewById(R.id.txtHedName);

            //spnResName = (Spinner) findViewById(R.id.spnResName);
            //spnResName.setAdapter(C.getArrayAdapter("Select '' union Select H21 ||'-'||H22 from member where RND='" + RND + "' and SuchanaID='" + SUCHANAID + "' and cast(H26Y as int)>=15"));

            /*secResName=(LinearLayout)findViewById(R.id.secResName);
            lineResName=(View)findViewById(R.id.lineResName);
            VlblResName=(TextView) findViewById(R.id.VlblResName);
            spnResName=(Spinner) findViewById(R.id.spnResName);
            List<String> listResName = new ArrayList<String>();

            listResName.add("");
            listResName.add("1-aaa");
            listResName.add("2-aa");
            ArrayAdapter<String> adptrResName= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listResName);
            spnResName.setAdapter(adptrResName);*/

            //spnHedName = (Spinner) findViewById(R.id.spnHedName);
            //spnHedName.setAdapter(C.getArrayAdapter("Select '' union Select H21 ||'-'||H22 from member where RND='" + RND + "' and SuchanaID='" + SUCHANAID + "' and H25 =10"));

            /*secHedName=(LinearLayout)findViewById(R.id.secHedName);
            lineHedName=(View)findViewById(R.id.lineHedName);
            VlblHedName=(TextView) findViewById(R.id.VlblHedName);
            spnHedName=(Spinner) findViewById(R.id.spnHedName);
            List<String> listHedName = new ArrayList<String>();

            listHedName.add("");
            listHedName.add("1-aa");
            listHedName.add("2-aa");
            ArrayAdapter<String> adptrHedName= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listHedName);
            spnHedName.setAdapter(adptrHedName);*/

            secVDate=(LinearLayout)findViewById(R.id.secVDate);
            lineVDate=(View)findViewById(R.id.lineVDate);
            VlblVDate=(TextView) findViewById(R.id.VlblVDate);
            dtpVDate=(EditText) findViewById(R.id.dtpVDate);
            dtpVDate.setText(Global.DateNowDMY());

            secResult=(LinearLayout)findViewById(R.id.secResult);
            lineResult=(View)findViewById(R.id.lineResult);
            VlblResult=(TextView) findViewById(R.id.VlblResult);
            spnResult=(Spinner) findViewById(R.id.spnResult);
            List<String> listResult = new ArrayList<String>();

            listResult.add("");
            listResult.add("1-সম্পন্ন হয়েছে");
            listResult.add("2-সম্পন্ন হয়নি");

            ArrayAdapter<String> adptrResult= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listResult);
            spnResult.setAdapter(adptrResult);

            spnResult.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnResult.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnResult.getSelectedItem().toString(),"-");

                    if (spnData.equals("2")) {
                        secResultX.setVisibility(View.VISIBLE);
                        lineResultX.setVisibility(View.VISIBLE);
                    } else {
                        txtResultX.setText("");
                        secResultX.setVisibility(View.GONE);
                        lineResultX.setVisibility(View.GONE);
                    }
                    if (!spnData.equalsIgnoreCase("1") ) {
                        secQ11.setVisibility(View.GONE);
                        lineQ11.setVisibility(View.GONE);
                        seclblQ1.setVisibility(View.GONE);
                        rdogrpQ11.clearCheck();
                        secQ12Y.setVisibility(View.GONE);
                        lineQ12Y.setVisibility(View.GONE);
                        secQ12M.setVisibility(View.GONE);
                        lineQ12M.setVisibility(View.GONE);
                        txtQ12Y.setText("");
                        txtQ12M.setText("");
                        secQ13.setVisibility(View.GONE);
                        lineQ13.setVisibility(View.GONE);
                        spnQ13.setSelection(0);
                        secQ14.setVisibility(View.GONE);
                        lineQ14.setVisibility(View.GONE);
                        spnQ14.setSelection(0);
                        secQ14X.setVisibility(View.GONE);
                        lineQ14X.setVisibility(View.GONE);
                        txtQ14X.setText("");
                        secQ15.setVisibility(View.GONE);
                        lineQ15.setVisibility(View.GONE);
                        rdogrpQ15.clearCheck();
                        secQ16.setVisibility(View.GONE);
                        lineQ16.setVisibility(View.GONE);
                        txtQ16.setText("");
                        secQ17.setVisibility(View.GONE);
                        lineQ17.setVisibility(View.GONE);
                        spnQ17.setSelection(0);
                        secQ18.setVisibility(View.GONE);
                        lineQ18.setVisibility(View.GONE);
                        spnQ18.setSelection(0);
                        secQ18X.setVisibility(View.GONE);
                        lineQ18X.setVisibility(View.GONE);
                        txtQ18X.setText("");
                        secQ19.setVisibility(View.GONE);
                        lineQ19.setVisibility(View.GONE);
                        spnQ19.setSelection(0);
                        secQ19X.setVisibility(View.GONE);
                        lineQ19X.setVisibility(View.GONE);
                        txtQ19X.setText("");
                        secQ110.setVisibility(View.GONE);
                        lineQ110.setVisibility(View.GONE);
                        txtQ110.setText("");
                        secQ111.setVisibility(View.GONE);
                        lineQ111.setVisibility(View.GONE);
                        rdogrpQ111.clearCheck();
                        secQ112.setVisibility(View.GONE);
                        lineQ112.setVisibility(View.GONE);
                        rdogrpQ112.clearCheck();
                        secQ211a.setVisibility(View.GONE);
                        lineQ211a.setVisibility(View.GONE);
                        chkQ211a.setChecked(false);
                        secQ211b.setVisibility(View.GONE);
                        lineQ211b.setVisibility(View.GONE);
                        chkQ211b.setChecked(false);
                        secQ211c.setVisibility(View.GONE);
                        lineQ211c.setVisibility(View.GONE);
                        chkQ211c.setChecked(false);
                        secQ211d.setVisibility(View.GONE);
                        lineQ211d.setVisibility(View.GONE);
                        chkQ211d.setChecked(false);
                        secQ211e.setVisibility(View.GONE);
                        lineQ211e.setVisibility(View.GONE);
                        chkQ211e.setChecked(false);
                        secQ211f.setVisibility(View.GONE);
                        lineQ211f.setVisibility(View.GONE);
                        chkQ211f.setChecked(false);
                        secQ211g.setVisibility(View.GONE);
                        lineQ211g.setVisibility(View.GONE);
                        chkQ211g.setChecked(false);
                        secQ211h.setVisibility(View.GONE);
                        lineQ211h.setVisibility(View.GONE);
                        chkQ211h.setChecked(false);
                        secQ211i.setVisibility(View.GONE);
                        lineQ211i.setVisibility(View.GONE);
                        chkQ211i.setChecked(false);
                        secQ211j.setVisibility(View.GONE);
                        lineQ211j.setVisibility(View.GONE);
                        chkQ211j.setChecked(false);
                        secQ211k.setVisibility(View.GONE);
                        lineQ211k.setVisibility(View.GONE);
                        chkQ211k.setChecked(false);
                        secQ211l.setVisibility(View.GONE);
                        lineQ211l.setVisibility(View.GONE);
                        chkQ211l.setChecked(false);
                        secQ211m.setVisibility(View.GONE);
                        lineQ211m.setVisibility(View.GONE);
                        chkQ211m.setChecked(false);
                        secQ211X.setVisibility(View.GONE);
                        lineQ211X.setVisibility(View.GONE);
                        chkQ211X.setChecked(false);
                        secQ211X1.setVisibility(View.GONE);
                        lineQ211X1.setVisibility(View.GONE);
                        txtQ211X1.setText("");
                        secQ211n.setVisibility(View.GONE);
                        lineQ211n.setVisibility(View.GONE);
                        chkQ211n.setChecked(false);
                        secQ212.setVisibility(View.GONE);
                        lineQ212.setVisibility(View.GONE);
                        txtQ212.setText("");
                        secQ213.setVisibility(View.GONE);
                        lineQ213.setVisibility(View.GONE);
                        txtQ213.setText("");
                        secQ214a.setVisibility(View.GONE);
                        lineQ214a.setVisibility(View.GONE);
                        chkQ214a.setChecked(false);
                        secQ214b.setVisibility(View.GONE);
                        lineQ214b.setVisibility(View.GONE);
                        chkQ214b.setChecked(false);
                        secQ214c.setVisibility(View.GONE);
                        lineQ214c.setVisibility(View.GONE);
                        chkQ214c.setChecked(false);
                        secQ214d.setVisibility(View.GONE);
                        lineQ214d.setVisibility(View.GONE);
                        chkQ214d.setChecked(false);
                        secQ214e.setVisibility(View.GONE);
                        lineQ214e.setVisibility(View.GONE);
                        chkQ214e.setChecked(false);
                        secQ214f.setVisibility(View.GONE);
                        lineQ214f.setVisibility(View.GONE);
                        chkQ214f.setChecked(false);
                        secQ214g.setVisibility(View.GONE);
                        lineQ214g.setVisibility(View.GONE);
                        chkQ214g.setChecked(false);
                        secQ214h.setVisibility(View.GONE);
                        lineQ214h.setVisibility(View.GONE);
                        chkQ214h.setChecked(false);
                        secQ214X.setVisibility(View.GONE);
                        lineQ214X.setVisibility(View.GONE);
                        chkQ214X.setChecked(false);
                        secQ214X1.setVisibility(View.GONE);
                        lineQ214X1.setVisibility(View.GONE);
                        txtQ214X1.setText("");
                        secQ214i.setVisibility(View.GONE);
                        lineQ214i.setVisibility(View.GONE);
                        chkQ214i.setChecked(false);
                        secQ215a.setVisibility(View.GONE);
                        lineQ215a.setVisibility(View.GONE);
                        chkQ215a.setChecked(false);
                        secQ215b.setVisibility(View.GONE);
                        lineQ215b.setVisibility(View.GONE);
                        chkQ215b.setChecked(false);
                        secQ215c.setVisibility(View.GONE);
                        lineQ215c.setVisibility(View.GONE);
                        chkQ215c.setChecked(false);
                        secQ215d.setVisibility(View.GONE);
                        lineQ215d.setVisibility(View.GONE);
                        chkQ215d.setChecked(false);
                        secQ215e.setVisibility(View.GONE);
                        lineQ215e.setVisibility(View.GONE);
                        chkQ215e.setChecked(false);
                        secQ215f.setVisibility(View.GONE);
                        lineQ215f.setVisibility(View.GONE);
                        chkQ215f.setChecked(false);
                        secQ215g.setVisibility(View.GONE);
                        lineQ215g.setVisibility(View.GONE);
                        chkQ215g.setChecked(false);
                        secQ215X.setVisibility(View.GONE);
                        lineQ215X.setVisibility(View.GONE);
                        chkQ215X.setChecked(false);
                        secQ215X1.setVisibility(View.GONE);
                        lineQ215X1.setVisibility(View.GONE);
                        txtQ215X1.setText("");
                        secQ215h.setVisibility(View.GONE);
                        lineQ215h.setVisibility(View.GONE);
                        chkQ215h.setChecked(false);
                        secQ221.setVisibility(View.GONE);
                        lineQ221.setVisibility(View.GONE);
                        rdogrpQ221.clearCheck();
                        secQ222.setVisibility(View.GONE);
                        lineQ222.setVisibility(View.GONE);
                        rdogrpQ222.clearCheck();
                        secQ223.setVisibility(View.GONE);
                        lineQ223.setVisibility(View.GONE);
                        rdogrpQ223.clearCheck();
                        secQ224.setVisibility(View.GONE);
                        lineQ224.setVisibility(View.GONE);
                        rdogrpQ224.clearCheck();
                        secQ225.setVisibility(View.GONE);
                        lineQ225.setVisibility(View.GONE);
                        txtQ225.setText("");
                        secQ31.setVisibility(View.GONE);
                        lineQ31.setVisibility(View.GONE);
                        rdogrpQ31.clearCheck();
                        secQ32.setVisibility(View.GONE);
                        lineQ32.setVisibility(View.GONE);
                        rdogrpQ32.clearCheck();
                        secQ33.setVisibility(View.GONE);
                        lineQ33.setVisibility(View.GONE);
                        rdogrpQ33.clearCheck();
                        secQ34.setVisibility(View.GONE);
                        lineQ34.setVisibility(View.GONE);
                        rdogrpQ34.clearCheck();
                        secQ35.setVisibility(View.GONE);
                        lineQ35.setVisibility(View.GONE);
                        rdogrpQ35.clearCheck();
                        secQ36.setVisibility(View.GONE);
                        lineQ36.setVisibility(View.GONE);
                        rdogrpQ36.clearCheck();
                        secQ37.setVisibility(View.GONE);
                        lineQ37.setVisibility(View.GONE);
                        rdogrpQ37.clearCheck();

                        seclblQ12.setVisibility(View.GONE);
                        seclblQ2.setVisibility(View.GONE);
                        seclblQ2a.setVisibility(View.GONE);
                        seclblQ211.setVisibility(View.GONE);
                        seclbl221.setVisibility(View.GONE);
                        seclbl3.setVisibility(View.GONE);
                        seclblQ214.setVisibility(View.GONE);
                        seclblQ215.setVisibility(View.GONE);
                    }
                    else
                    {
                        seclblQ1.setVisibility(View.VISIBLE);
                        seclblQ12.setVisibility(View.VISIBLE);
                        seclblQ2.setVisibility(View.VISIBLE);
                        seclblQ2a.setVisibility(View.VISIBLE);
                        seclblQ211.setVisibility(View.VISIBLE);
                        seclbl221.setVisibility(View.VISIBLE);
                        seclbl3.setVisibility(View.VISIBLE);

                        secQ11.setVisibility(View.VISIBLE);
                        lineQ11.setVisibility(View.VISIBLE);
                        secQ12Y.setVisibility(View.VISIBLE);
                        lineQ12Y.setVisibility(View.VISIBLE);
                        secQ12M.setVisibility(View.VISIBLE);
                        lineQ12M.setVisibility(View.VISIBLE);
                        secQ13.setVisibility(View.VISIBLE);
                        lineQ13.setVisibility(View.VISIBLE);
                        secQ14.setVisibility(View.VISIBLE);
                        lineQ14.setVisibility(View.VISIBLE);
                        secQ15.setVisibility(View.VISIBLE);
                        lineQ15.setVisibility(View.VISIBLE);
                        secQ16.setVisibility(View.VISIBLE);
                        lineQ16.setVisibility(View.VISIBLE);
                        secQ17.setVisibility(View.VISIBLE);
                        lineQ17.setVisibility(View.VISIBLE);
                        secQ18.setVisibility(View.VISIBLE);
                        lineQ18.setVisibility(View.VISIBLE);
                        secQ19.setVisibility(View.VISIBLE);
                        lineQ19.setVisibility(View.VISIBLE);
                        secQ110.setVisibility(View.VISIBLE);
                        lineQ110.setVisibility(View.VISIBLE);
                        secQ111.setVisibility(View.VISIBLE);
                        lineQ111.setVisibility(View.VISIBLE);
                        secQ112.setVisibility(View.VISIBLE);
                        lineQ112.setVisibility(View.VISIBLE);
                        secQ211a.setVisibility(View.VISIBLE);
                        lineQ211a.setVisibility(View.VISIBLE);
                        secQ211b.setVisibility(View.VISIBLE);
                        lineQ211b.setVisibility(View.VISIBLE);
                        secQ211c.setVisibility(View.VISIBLE);
                        lineQ211c.setVisibility(View.VISIBLE);
                        secQ211d.setVisibility(View.VISIBLE);
                        lineQ211d.setVisibility(View.VISIBLE);
                        secQ211e.setVisibility(View.VISIBLE);
                        lineQ211e.setVisibility(View.VISIBLE);
                        secQ211f.setVisibility(View.VISIBLE);
                        lineQ211f.setVisibility(View.VISIBLE);
                        secQ211g.setVisibility(View.VISIBLE);
                        lineQ211g.setVisibility(View.VISIBLE);
                        secQ211h.setVisibility(View.VISIBLE);
                        lineQ211h.setVisibility(View.VISIBLE);
                        secQ211i.setVisibility(View.VISIBLE);
                        lineQ211i.setVisibility(View.VISIBLE);
                        secQ211j.setVisibility(View.VISIBLE);
                        lineQ211j.setVisibility(View.VISIBLE);
                        secQ211k.setVisibility(View.VISIBLE);
                        lineQ211k.setVisibility(View.VISIBLE);
                        secQ211l.setVisibility(View.VISIBLE);
                        lineQ211l.setVisibility(View.VISIBLE);
                        secQ211m.setVisibility(View.VISIBLE);
                        lineQ211m.setVisibility(View.VISIBLE);
                        secQ211X.setVisibility(View.VISIBLE);
                        lineQ211X.setVisibility(View.VISIBLE);
                        secQ211n.setVisibility(View.VISIBLE);
                        lineQ211n.setVisibility(View.VISIBLE);
                        secQ212.setVisibility(View.VISIBLE);
                        lineQ212.setVisibility(View.VISIBLE);
                        secQ213.setVisibility(View.VISIBLE);
                        lineQ213.setVisibility(View.VISIBLE);
                        secQ214a.setVisibility(View.VISIBLE);
                        lineQ214a.setVisibility(View.VISIBLE);
                        secQ214b.setVisibility(View.VISIBLE);
                        lineQ214b.setVisibility(View.VISIBLE);
                        secQ214c.setVisibility(View.VISIBLE);
                        lineQ214c.setVisibility(View.VISIBLE);
                        secQ214d.setVisibility(View.VISIBLE);
                        lineQ214d.setVisibility(View.VISIBLE);
                        secQ214e.setVisibility(View.VISIBLE);
                        lineQ214e.setVisibility(View.VISIBLE);
                        secQ214f.setVisibility(View.VISIBLE);
                        lineQ214f.setVisibility(View.VISIBLE);
                        secQ214g.setVisibility(View.VISIBLE);
                        lineQ214g.setVisibility(View.VISIBLE);
                        secQ214h.setVisibility(View.VISIBLE);
                        lineQ214h.setVisibility(View.VISIBLE);
                        secQ214X.setVisibility(View.VISIBLE);
                        lineQ214X.setVisibility(View.VISIBLE);
                        secQ214i.setVisibility(View.VISIBLE);
                        lineQ214i.setVisibility(View.VISIBLE);
                        secQ215a.setVisibility(View.VISIBLE);
                        lineQ215a.setVisibility(View.VISIBLE);
                        secQ215b.setVisibility(View.VISIBLE);
                        lineQ215b.setVisibility(View.VISIBLE);
                        secQ215c.setVisibility(View.VISIBLE);
                        lineQ215c.setVisibility(View.VISIBLE);
                        secQ215d.setVisibility(View.VISIBLE);
                        lineQ215d.setVisibility(View.VISIBLE);
                        secQ215e.setVisibility(View.VISIBLE);
                        lineQ215e.setVisibility(View.VISIBLE);
                        secQ215f.setVisibility(View.VISIBLE);
                        lineQ215f.setVisibility(View.VISIBLE);
                        secQ215g.setVisibility(View.VISIBLE);
                        lineQ215g.setVisibility(View.VISIBLE);
                        secQ215X.setVisibility(View.VISIBLE);
                        lineQ215X.setVisibility(View.VISIBLE);
                        secQ215h.setVisibility(View.VISIBLE);
                        lineQ215h.setVisibility(View.VISIBLE);
                        secQ221.setVisibility(View.VISIBLE);
                        lineQ221.setVisibility(View.VISIBLE);
                        secQ222.setVisibility(View.VISIBLE);
                        lineQ222.setVisibility(View.VISIBLE);
                        secQ223.setVisibility(View.VISIBLE);
                        lineQ223.setVisibility(View.VISIBLE);
                        //secQ224.setVisibility(View.VISIBLE);
                        //lineQ224.setVisibility(View.VISIBLE);
                        //secQ225.setVisibility(View.VISIBLE);
                        //lineQ225.setVisibility(View.VISIBLE);
                        secQ31.setVisibility(View.VISIBLE);
                        lineQ31.setVisibility(View.VISIBLE);
                        secQ32.setVisibility(View.VISIBLE);
                        lineQ32.setVisibility(View.VISIBLE);
                        secQ33.setVisibility(View.VISIBLE);
                        lineQ33.setVisibility(View.VISIBLE);
                        secQ34.setVisibility(View.VISIBLE);
                        lineQ34.setVisibility(View.VISIBLE);
                        secQ35.setVisibility(View.VISIBLE);
                        lineQ35.setVisibility(View.VISIBLE);
                        //secQ36.setVisibility(View.VISIBLE);
                        //lineQ36.setVisibility(View.VISIBLE);
                        secQ37.setVisibility(View.VISIBLE);
                        lineQ37.setVisibility(View.VISIBLE);
                        seclblQ214.setVisibility(View.VISIBLE);
                        seclblQ215.setVisibility(View.VISIBLE);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secResultX=(LinearLayout)findViewById(R.id.secResultX);
            lineResultX=(View)findViewById(R.id.lineResultX);
            VlblResultX=(TextView) findViewById(R.id.VlblResultX);
            txtResultX=(EditText) findViewById(R.id.txtResultX);
            seclblQ1=(LinearLayout)findViewById(R.id.seclblQ1);
            seclblQ214 = (LinearLayout) findViewById(R.id.seclblQ214);
            seclblQ215 = (LinearLayout) findViewById(R.id.seclblQ215);
            secQ11=(LinearLayout)findViewById(R.id.secQ11);
            lineQ11=(View)findViewById(R.id.lineQ11);
            VlblQ11 = (TextView) findViewById(R.id.VlblQ11);
            rdogrpQ11 = (RadioGroup) findViewById(R.id.rdogrpQ11);
            rdoQ111 = (RadioButton) findViewById(R.id.rdoQ111);
            rdoQ112 = (RadioButton) findViewById(R.id.rdoQ112);

            rdogrpQ11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH151 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpQ11.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpQ11.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH151[i];
                    }

                    if (rbData.equalsIgnoreCase("1"))
                    {
                        seclblQ214.setVisibility(View.GONE);
                        secQ214a.setVisibility(View.GONE);
                        secQ214b.setVisibility(View.GONE);
                        secQ214c.setVisibility(View.GONE);
                        secQ214d.setVisibility(View.GONE);
                        secQ214e.setVisibility(View.GONE);
                        secQ214f.setVisibility(View.GONE);
                        secQ214g.setVisibility(View.GONE);
                        secQ214h.setVisibility(View.GONE);
                        secQ214X.setVisibility(View.GONE);
                        secQ214X1.setVisibility(View.GONE);
                        secQ214i.setVisibility(View.GONE);
                        chkQ214a.setChecked(false);
                        chkQ214b.setChecked(false);
                        chkQ214c.setChecked(false);
                        chkQ214d.setChecked(false);
                        chkQ214e.setChecked(false);
                        chkQ214f.setChecked(false);
                        chkQ214g.setChecked(false);
                        chkQ214h.setChecked(false);
                        chkQ214X.setChecked(false);
                        chkQ214i.setChecked(false);
                        txtQ214X1.setText(null);

                        seclblQ215.setVisibility(View.GONE);
                        secQ215a.setVisibility(View.GONE);
                        secQ215b.setVisibility(View.GONE);
                        secQ215c.setVisibility(View.GONE);
                        secQ215d.setVisibility(View.GONE);
                        secQ215e.setVisibility(View.GONE);
                        secQ215f.setVisibility(View.GONE);
                        secQ215g.setVisibility(View.GONE);
                        secQ215h.setVisibility(View.GONE);
                        secQ215X.setVisibility(View.GONE);
                        secQ215X1.setVisibility(View.GONE);
                        chkQ215a.setChecked(false);
                        chkQ215b.setChecked(false);
                        chkQ215c.setChecked(false);
                        chkQ215d.setChecked(false);
                        chkQ215e.setChecked(false);
                        chkQ215f.setChecked(false);
                        chkQ215g.setChecked(false);
                        chkQ215h.setChecked(false);
                        chkQ215X.setChecked(false);
                        txtQ215X1.setText(null);

                    } else
                    {
                        seclblQ214.setVisibility(View.VISIBLE);
                        secQ214a.setVisibility(View.VISIBLE);
                        secQ214b.setVisibility(View.VISIBLE);
                        secQ214c.setVisibility(View.VISIBLE);
                        secQ214d.setVisibility(View.VISIBLE);
                        secQ214e.setVisibility(View.VISIBLE);
                        secQ214f.setVisibility(View.VISIBLE);
                        secQ214g.setVisibility(View.VISIBLE);
                        secQ214h.setVisibility(View.VISIBLE);
                        secQ214X.setVisibility(View.VISIBLE);
                        // secQ214X1.setVisibility(View.VISIBLE);
                        secQ214i.setVisibility(View.VISIBLE);

                        seclblQ215.setVisibility(View.VISIBLE);
                        secQ215a.setVisibility(View.VISIBLE);
                        secQ215b.setVisibility(View.VISIBLE);
                        secQ215c.setVisibility(View.VISIBLE);
                        secQ215d.setVisibility(View.VISIBLE);
                        secQ215e.setVisibility(View.VISIBLE);
                        secQ215f.setVisibility(View.VISIBLE);
                        secQ215g.setVisibility(View.VISIBLE);
                        secQ215h.setVisibility(View.VISIBLE);
                        secQ215X.setVisibility(View.VISIBLE);
                        //  secQ215X1.setVisibility(View.VISIBLE);



                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            seclblQ12=(LinearLayout)findViewById(R.id.seclblQ12);
            secQ12Y=(LinearLayout)findViewById(R.id.secQ12Y);
            lineQ12Y=(View)findViewById(R.id.lineQ12Y);
            VlblQ12Y=(TextView) findViewById(R.id.VlblQ12Y);
            txtQ12Y=(EditText) findViewById(R.id.txtQ12Y);
            secQ12M=(LinearLayout)findViewById(R.id.secQ12M);
            lineQ12M=(View)findViewById(R.id.lineQ12M);
            VlblQ12M=(TextView) findViewById(R.id.VlblQ12M);
            txtQ12M=(EditText) findViewById(R.id.txtQ12M);

            secQ13=(LinearLayout)findViewById(R.id.secQ13);
            lineQ13=(View)findViewById(R.id.lineQ13);
            VlblQ13=(TextView) findViewById(R.id.VlblQ13);
            spnQ13=(Spinner) findViewById(R.id.spnQ13);
            List<String> listQ13 = new ArrayList<String>();

            listQ13.add("");
            listQ13.add("1-পড়তে ও লিখতে পারেনা");
            listQ13.add("2-শুধুমাত্র সই করতে পারে");
            listQ13.add("3-শুধুমাত্র পড়তে পারে");
            listQ13.add("4-পড়তে ও লিখতে পারে");
            ArrayAdapter<String> adptrQ13= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listQ13);
            spnQ13.setAdapter(adptrQ13);

            secQ14=(LinearLayout)findViewById(R.id.secQ14);
            lineQ14=(View)findViewById(R.id.lineQ14);
            VlblQ14=(TextView) findViewById(R.id.VlblQ14);
            spnQ14=(Spinner) findViewById(R.id.spnQ14);
            List<String> listQ14 = new ArrayList<String>();

            listQ14.add("");
            listQ14.add("86-কখনও স্কুলে পড়াশোনা করে নাই");
            listQ14.add("00-প্রথম শ্রেণীতে পড়াশোনা করে");
            listQ14.add("01-প্রথম শ্রেণী সম্পন্ন করেছে");
            listQ14.add("02-দ্বিতীয় শ্রেণী সম্পন্ন করেছে");
            listQ14.add("03-তৃতীয় শ্রেণী সম্পন্ন");
            listQ14.add("04-চতুর্থ  শ্রেণী সম্পন্ন");
            listQ14.add("05-শ্রেণী সম্পন্ন");
            listQ14.add("06-শ্রেণী সম্পন্ন");
            listQ14.add("07-শ্রেণী সম্পন্ন");
            listQ14.add("08-শ্রেণী সম্পন্ন");
            listQ14.add("09-শ্রেণী সম্পন্ন");
            listQ14.add("10-মাধ্যমিক শিক্ষা সমাপ্ত করেছে");
            listQ14.add("12-উচ্চ মাধ্যমিক শিক্ষা সমাপ্ত করেছে");
            listQ14.add("22-SSC পরীক্ষার প্রার্থী");
            listQ14.add("33-HSC পরীক্ষার প্রার্থী");
            listQ14.add("44-স্নাতক অথবা আরো ঊর্ধ শিক্ষা সমাপ্ত  করেছে");
            listQ14.add("55-প্রাক-প্রাথমিক বিদ্যালয় (সাধারণ)");
            listQ14.add("66-প্রাক-প্রাথমিক বিদ্যালয় (মসজিদ ভিত্তিক)");
            listQ14.add("77-অন্যান্য");
            ArrayAdapter<String> adptrQ14= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listQ14);
            spnQ14.setAdapter(adptrQ14);

            spnQ14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnQ14.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnQ14.getSelectedItem().toString(),"-");
                    if(!spnData.equalsIgnoreCase("77") )
                    {
                        secQ14X.setVisibility(View.GONE);
                        lineQ14X.setVisibility(View.GONE);
                    }
                    else
                    {
                        secQ14X.setVisibility(View.VISIBLE);
                        lineQ14X.setVisibility(View.VISIBLE);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secQ14X=(LinearLayout)findViewById(R.id.secQ14X);
            lineQ14X=(View)findViewById(R.id.lineQ14X);
            VlblQ14X=(TextView) findViewById(R.id.VlblQ14X);
            txtQ14X=(EditText) findViewById(R.id.txtQ14X);
            secQ15=(LinearLayout)findViewById(R.id.secQ15);
            lineQ15=(View)findViewById(R.id.lineQ15);
            VlblQ15 = (TextView) findViewById(R.id.VlblQ15);
            rdogrpQ15 = (RadioGroup) findViewById(R.id.rdogrpQ15);

            rdoQ151 = (RadioButton) findViewById(R.id.rdoQ151);
            rdoQ152 = (RadioButton) findViewById(R.id.rdoQ152);
            secQ16=(LinearLayout)findViewById(R.id.secQ16);
            lineQ16=(View)findViewById(R.id.lineQ16);
            VlblQ16=(TextView) findViewById(R.id.VlblQ16);
            txtQ16=(EditText) findViewById(R.id.txtQ16);
            secQ17=(LinearLayout)findViewById(R.id.secQ17);
            lineQ17=(View)findViewById(R.id.lineQ17);
            VlblQ17=(TextView) findViewById(R.id.VlblQ17);
            spnQ17=(Spinner) findViewById(R.id.spnQ17);
            List<String> listQ17 = new ArrayList<String>();

            listQ17.add("");
            listQ17.add("1-বাবা");
            listQ17.add("2-মা");
            listQ17.add("3-সংসারের অন্য পুরুষ");
            listQ17.add("4-সংসারের অন্য মহিলা");
            ArrayAdapter<String> adptrQ17= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listQ17);
            spnQ17.setAdapter(adptrQ17);

            secQ18=(LinearLayout)findViewById(R.id.secQ18);
            lineQ18=(View)findViewById(R.id.lineQ18);
            VlblQ18=(TextView) findViewById(R.id.VlblQ18);
            spnQ18=(Spinner) findViewById(R.id.spnQ18);
            List<String> listQ18 = new ArrayList<String>();

            listQ18.add("");
            listQ18.add("01-কৃষিকাজ (ধান)");
            listQ18.add("02-কৃষিকাজ (ধান ছাড়া অনান্য)");
            listQ18.add("03-অদক্ষ শ্রমিক");
            listQ18.add("04-দক্ষ শ্রমিক");
            listQ18.add("05-গৃহকর্মী");
            listQ18.add("06-রেস্টুরেন্ট / চা স্টলে কাজ করে");
            listQ18.add("07-অন্যান্য (মেরামত্/নির্মাণ)");
            listQ18.add("08-অন্যান্য (উল্লেখ করুন)");
            listQ18.add("09-রিক্সা/ভ্যান/ঠেলাগাড়ি চালক");
            listQ18.add("10-সিএনজি/টেম্পু/মিনিবাস চালক");
            listQ18.add("11-বাস/ট্রাক  চালক");
            listQ18.add("12-ভিক্ষুক (পেশাদারী)");
            listQ18.add("13-পরিবহন শ্রমিক");
            listQ18.add("14- শিক্ষক");
            listQ18.add("15-খাদ্য প্রক্রিয়জাত করন");
            listQ18.add("16-ক্ষুদ্র শিল্প");
            listQ18.add("17-হস্তশিল্প");
            listQ18.add("18-ক্ষুদ্র ব্যবসায়ী (পথিপার্শ্বস্থ স্ট্যান্ড বা স্টল)");
            listQ18.add("19-হাট/গ্রামের ছোট দোকানদার");
            listQ18.add("20-ব্যবসায়ী (অন্যান্য)");
            listQ18.add("21-ক্ষেত ফসল কৃষক");
            listQ18.add("22-বসত ভিটায়ে কৃষিকাজ করে");
            listQ18.add("23-মৎস্য চাষ");
            listQ18.add("24-জেলে");
            listQ18.add("25-হাঁস মুরগি লালন পালন");
            listQ18.add("26-গবাদিপশু লালন পালন");
            listQ18.add("27-গৃহিনী");
            listQ18.add("28-কিছু করে না");
            listQ18.add("29-ছাত্র/ছাত্রী");
            listQ18.add("30-শিশুর বয়স পাঁচ বছরের নিচে");
            ArrayAdapter<String> adptrQ18= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listQ18);
            spnQ18.setAdapter(adptrQ18);

            spnQ18.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnQ18.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnQ18.getSelectedItem().toString(),"-");
                    if(!spnData.equalsIgnoreCase("08") )
                    {
                        secQ18X.setVisibility(View.GONE);
                        lineQ18X.setVisibility(View.GONE);
                    }
                    else
                    {
                        secQ18X.setVisibility(View.VISIBLE);
                        lineQ18X.setVisibility(View.VISIBLE);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secQ18X=(LinearLayout)findViewById(R.id.secQ18X);
            lineQ18X=(View)findViewById(R.id.lineQ18X);
            VlblQ18X=(TextView) findViewById(R.id.VlblQ18X);
            txtQ18X=(EditText) findViewById(R.id.txtQ18X);
            secQ19=(LinearLayout)findViewById(R.id.secQ19);
            lineQ19=(View)findViewById(R.id.lineQ19);
            VlblQ19=(TextView) findViewById(R.id.VlblQ19);
            spnQ19=(Spinner) findViewById(R.id.spnQ19);
            List<String> listQ19 = new ArrayList<String>();

            listQ19.add("");
            listQ19.add("1-ইসলাম");
            listQ19.add("2-হিন্দু");
            listQ19.add("3-খ্রিস্টান");
            listQ19.add("4-বৌদ্ধ");
            listQ19.add("5-অন্যান্য (উল্লেখ করুন)");
            ArrayAdapter<String> adptrQ19= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listQ19);
            spnQ19.setAdapter(adptrQ19);

            spnQ19.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnQ19.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnQ19.getSelectedItem().toString(),"-");
                    if(spnData.equalsIgnoreCase("1"))
                    {
                        secQ19X.setVisibility(View.GONE);
                        lineQ19X.setVisibility(View.GONE);
                    }
                    else if(spnData.equalsIgnoreCase("2"))
                    {
                        secQ19X.setVisibility(View.GONE);
                        lineQ19X.setVisibility(View.GONE);
                    }
                    else if(spnData.equalsIgnoreCase("3"))
                    {
                        secQ19X.setVisibility(View.GONE);
                        lineQ19X.setVisibility(View.GONE);
                    }
                    else if(spnData.equalsIgnoreCase("4"))
                    {
                        secQ19X.setVisibility(View.GONE);
                        lineQ19X.setVisibility(View.GONE);
                    }
                    else
                    {
                        secQ19X.setVisibility(View.VISIBLE);
                        lineQ19X.setVisibility(View.VISIBLE);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secQ19X=(LinearLayout)findViewById(R.id.secQ19X);
            lineQ19X=(View)findViewById(R.id.lineQ19X);
            VlblQ19X=(TextView) findViewById(R.id.VlblQ19X);
            txtQ19X=(EditText) findViewById(R.id.txtQ19X);
            secQ110=(LinearLayout)findViewById(R.id.secQ110);
            lineQ110=(View)findViewById(R.id.lineQ110);
            VlblQ110=(TextView) findViewById(R.id.VlblQ110);
            txtQ110=(EditText) findViewById(R.id.txtQ110);
            secQ111=(LinearLayout)findViewById(R.id.secQ111);
            lineQ111=(View)findViewById(R.id.lineQ111);
            VlblQ111 = (TextView) findViewById(R.id.VlblQ111);
            rdogrpQ111 = (RadioGroup) findViewById(R.id.rdogrpQ111);

            rdoQ1111 = (RadioButton) findViewById(R.id.rdoQ1111);
            rdoQ1112 = (RadioButton) findViewById(R.id.rdoQ1112);
            secQ112=(LinearLayout)findViewById(R.id.secQ112);
            lineQ112=(View)findViewById(R.id.lineQ112);
            VlblQ112 = (TextView) findViewById(R.id.VlblQ112);
            rdogrpQ112 = (RadioGroup) findViewById(R.id.rdogrpQ112);

            rdoQ1121 = (RadioButton) findViewById(R.id.rdoQ1121);
            rdoQ1122 = (RadioButton) findViewById(R.id.rdoQ1122);
            seclblQ2=(LinearLayout)findViewById(R.id.seclblQ2);
            seclblQ2a=(LinearLayout)findViewById(R.id.seclblQ2a);
            seclblQ211=(LinearLayout)findViewById(R.id.seclblQ211);
            secQ211a=(LinearLayout)findViewById(R.id.secQ211a);
            lineQ211a=(View)findViewById(R.id.lineQ211a);
            VlblQ211a=(TextView) findViewById(R.id.VlblQ211a);
            chkQ211a=(CheckBox) findViewById(R.id.chkQ211a);
            secQ211b=(LinearLayout)findViewById(R.id.secQ211b);
            lineQ211b=(View)findViewById(R.id.lineQ211b);
            VlblQ211b=(TextView) findViewById(R.id.VlblQ211b);
            chkQ211b=(CheckBox) findViewById(R.id.chkQ211b);
            secQ211c=(LinearLayout)findViewById(R.id.secQ211c);
            lineQ211c=(View)findViewById(R.id.lineQ211c);
            VlblQ211c=(TextView) findViewById(R.id.VlblQ211c);
            chkQ211c=(CheckBox) findViewById(R.id.chkQ211c);
            secQ211d=(LinearLayout)findViewById(R.id.secQ211d);
            lineQ211d=(View)findViewById(R.id.lineQ211d);
            VlblQ211d=(TextView) findViewById(R.id.VlblQ211d);
            chkQ211d=(CheckBox) findViewById(R.id.chkQ211d);
            secQ211e=(LinearLayout)findViewById(R.id.secQ211e);
            lineQ211e=(View)findViewById(R.id.lineQ211e);
            VlblQ211e=(TextView) findViewById(R.id.VlblQ211e);
            chkQ211e=(CheckBox) findViewById(R.id.chkQ211e);
            secQ211f=(LinearLayout)findViewById(R.id.secQ211f);
            lineQ211f=(View)findViewById(R.id.lineQ211f);
            VlblQ211f=(TextView) findViewById(R.id.VlblQ211f);
            chkQ211f=(CheckBox) findViewById(R.id.chkQ211f);
            secQ211g=(LinearLayout)findViewById(R.id.secQ211g);
            lineQ211g=(View)findViewById(R.id.lineQ211g);
            VlblQ211g=(TextView) findViewById(R.id.VlblQ211g);
            chkQ211g=(CheckBox) findViewById(R.id.chkQ211g);
            secQ211h=(LinearLayout)findViewById(R.id.secQ211h);
            lineQ211h=(View)findViewById(R.id.lineQ211h);
            VlblQ211h=(TextView) findViewById(R.id.VlblQ211h);
            chkQ211h=(CheckBox) findViewById(R.id.chkQ211h);
            secQ211i=(LinearLayout)findViewById(R.id.secQ211i);
            lineQ211i=(View)findViewById(R.id.lineQ211i);
            VlblQ211i=(TextView) findViewById(R.id.VlblQ211i);
            chkQ211i=(CheckBox) findViewById(R.id.chkQ211i);
            secQ211j=(LinearLayout)findViewById(R.id.secQ211j);
            lineQ211j=(View)findViewById(R.id.lineQ211j);
            VlblQ211j=(TextView) findViewById(R.id.VlblQ211j);
            chkQ211j=(CheckBox) findViewById(R.id.chkQ211j);
            secQ211k=(LinearLayout)findViewById(R.id.secQ211k);
            lineQ211k=(View)findViewById(R.id.lineQ211k);
            VlblQ211k=(TextView) findViewById(R.id.VlblQ211k);
            chkQ211k=(CheckBox) findViewById(R.id.chkQ211k);
            secQ211l=(LinearLayout)findViewById(R.id.secQ211l);
            lineQ211l=(View)findViewById(R.id.lineQ211l);
            VlblQ211l=(TextView) findViewById(R.id.VlblQ211l);
            chkQ211l=(CheckBox) findViewById(R.id.chkQ211l);
            secQ211m=(LinearLayout)findViewById(R.id.secQ211m);
            lineQ211m=(View)findViewById(R.id.lineQ211m);
            VlblQ211m=(TextView) findViewById(R.id.VlblQ211m);
            chkQ211m=(CheckBox) findViewById(R.id.chkQ211m);
            secQ211X=(LinearLayout)findViewById(R.id.secQ211X);
            lineQ211X=(View)findViewById(R.id.lineQ211X);
            VlblQ211X=(TextView) findViewById(R.id.VlblQ211X);
            chkQ211X=(CheckBox) findViewById(R.id.chkQ211X);

            chkQ211X.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (!isChecked) {
                        secQ211X1.setVisibility(View.GONE);
                        lineQ211X.setVisibility(View.GONE);
                        txtQ211X1.setText("");
                    } else {
                        secQ211X1.setVisibility(View.VISIBLE);
                        lineQ211X.setVisibility(View.VISIBLE);
                    }
                }
            });

            secQ211X1=(LinearLayout)findViewById(R.id.secQ211X1);
            lineQ211X1=(View)findViewById(R.id.lineQ211X1);
            VlblQ211X1=(TextView) findViewById(R.id.VlblQ211X1);
            txtQ211X1=(EditText) findViewById(R.id.txtQ211X1);
            secQ211n=(LinearLayout)findViewById(R.id.secQ211n);
            lineQ211n=(View)findViewById(R.id.lineQ211n);
            VlblQ211n=(TextView) findViewById(R.id.VlblQ211n);
            chkQ211n=(CheckBox) findViewById(R.id.chkQ211n);

            chkQ211n.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkQ211a.setChecked(false);
                        chkQ211b.setChecked(false);
                        chkQ211c.setChecked(false);
                        chkQ211d.setChecked(false);
                        chkQ211e.setChecked(false);
                        chkQ211f.setChecked(false);
                        chkQ211g.setChecked(false);
                        chkQ211h.setChecked(false);
                        chkQ211i.setChecked(false);
                        chkQ211j.setChecked(false);
                        chkQ211k.setChecked(false);
                        chkQ211l.setChecked(false);
                        chkQ211m.setChecked(false);
                        chkQ211X.setChecked(false);
                    }
                }
            });

            chkQ211a.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ211n.setChecked(false);
                    }
                }
            });
            chkQ211b.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ211n.setChecked(false);
                    }
                }
            });
            chkQ211c.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ211n.setChecked(false);
                    }
                }
            });
            chkQ211d.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ211n.setChecked(false);
                    }
                }
            });
            chkQ211e.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ211n.setChecked(false);
                    }
                }
            });
            chkQ211f.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ211n.setChecked(false);
                    }
                }
            });
            chkQ211g.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ211n.setChecked(false);
                    }
                }
            });
            chkQ211h.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ211n.setChecked(false);
                    }
                }
            });
            chkQ211i.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ211n.setChecked(false);
                    }
                }
            });
            chkQ211j.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ211n.setChecked(false);
                    }
                }
            });
            chkQ211k.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ211n.setChecked(false);
                    }
                }
            });
            chkQ211l.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ211n.setChecked(false);
                    }
                }
            });
            chkQ211m.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ211n.setChecked(false);
                    }
                }
            });
            chkQ211X.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ211n.setChecked(false);
                    }
                }
            });

            secQ212=(LinearLayout)findViewById(R.id.secQ212);
            lineQ212=(View)findViewById(R.id.lineQ212);
            VlblQ212=(TextView) findViewById(R.id.VlblQ212);
            txtQ212=(EditText) findViewById(R.id.txtQ212);
            secQ213=(LinearLayout)findViewById(R.id.secQ213);
            lineQ213=(View)findViewById(R.id.lineQ213);
            VlblQ213=(TextView) findViewById(R.id.VlblQ213);
            txtQ213=(EditText) findViewById(R.id.txtQ213);
            secQ214a=(LinearLayout)findViewById(R.id.secQ214a);
            lineQ214a=(View)findViewById(R.id.lineQ214a);
            VlblQ214a=(TextView) findViewById(R.id.VlblQ214a);
            chkQ214a=(CheckBox) findViewById(R.id.chkQ214a);
            secQ214b=(LinearLayout)findViewById(R.id.secQ214b);
            lineQ214b=(View)findViewById(R.id.lineQ214b);
            VlblQ214b=(TextView) findViewById(R.id.VlblQ214b);
            chkQ214b=(CheckBox) findViewById(R.id.chkQ214b);
            secQ214c=(LinearLayout)findViewById(R.id.secQ214c);
            lineQ214c=(View)findViewById(R.id.lineQ214c);
            VlblQ214c=(TextView) findViewById(R.id.VlblQ214c);
            chkQ214c=(CheckBox) findViewById(R.id.chkQ214c);
            secQ214d=(LinearLayout)findViewById(R.id.secQ214d);
            lineQ214d=(View)findViewById(R.id.lineQ214d);
            VlblQ214d=(TextView) findViewById(R.id.VlblQ214d);
            chkQ214d=(CheckBox) findViewById(R.id.chkQ214d);
            secQ214e=(LinearLayout)findViewById(R.id.secQ214e);
            lineQ214e=(View)findViewById(R.id.lineQ214e);
            VlblQ214e=(TextView) findViewById(R.id.VlblQ214e);
            chkQ214e=(CheckBox) findViewById(R.id.chkQ214e);
            secQ214f=(LinearLayout)findViewById(R.id.secQ214f);
            lineQ214f=(View)findViewById(R.id.lineQ214f);
            VlblQ214f=(TextView) findViewById(R.id.VlblQ214f);
            chkQ214f=(CheckBox) findViewById(R.id.chkQ214f);
            secQ214g=(LinearLayout)findViewById(R.id.secQ214g);
            lineQ214g=(View)findViewById(R.id.lineQ214g);
            VlblQ214g=(TextView) findViewById(R.id.VlblQ214g);
            chkQ214g=(CheckBox) findViewById(R.id.chkQ214g);
            secQ214h=(LinearLayout)findViewById(R.id.secQ214h);
            lineQ214h=(View)findViewById(R.id.lineQ214h);
            VlblQ214h=(TextView) findViewById(R.id.VlblQ214h);
            chkQ214h=(CheckBox) findViewById(R.id.chkQ214h);
            secQ214X=(LinearLayout)findViewById(R.id.secQ214X);
            lineQ214X=(View)findViewById(R.id.lineQ214X);
            VlblQ214X=(TextView) findViewById(R.id.VlblQ214X);
            chkQ214X=(CheckBox) findViewById(R.id.chkQ214X);

            chkQ214X.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (!isChecked) {
                        secQ214X1.setVisibility(View.GONE);
                        lineQ214X1.setVisibility(View.GONE);
                        txtQ214X1.setText("");
                    } else {
                        secQ214X1.setVisibility(View.VISIBLE);
                        secQ214X1.setVisibility(View.VISIBLE);
                    }
                }
            });

            secQ214X1=(LinearLayout)findViewById(R.id.secQ214X1);
            lineQ214X1=(View)findViewById(R.id.lineQ214X1);
            VlblQ214X1=(TextView) findViewById(R.id.VlblQ214X1);
            txtQ214X1=(EditText) findViewById(R.id.txtQ214X1);
            secQ214i=(LinearLayout)findViewById(R.id.secQ214i);
            lineQ214i=(View)findViewById(R.id.lineQ214i);
            VlblQ214i=(TextView) findViewById(R.id.VlblQ214i);
            chkQ214i=(CheckBox) findViewById(R.id.chkQ214i);

            chkQ214i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkQ214a.setChecked(false);
                        chkQ214b.setChecked(false);
                        chkQ214c.setChecked(false);
                        chkQ214d.setChecked(false);
                        chkQ214e.setChecked(false);
                        chkQ214f.setChecked(false);
                        chkQ214g.setChecked(false);
                        chkQ214h.setChecked(false);
                        chkQ214X.setChecked(false);
                    }
                }
            });

            chkQ214a.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ214i.setChecked(false);
                    }
                }
            });
            chkQ214a.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ214i.setChecked(false);
                    }
                }
            });
            chkQ214a.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ214i.setChecked(false);
                    }
                }
            });
            chkQ214d.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ214i.setChecked(false);
                    }
                }
            });
            chkQ214e.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ214i.setChecked(false);
                    }
                }
            });
            chkQ214f.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ214i.setChecked(false);
                    }
                }
            });
            chkQ214g.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ214i.setChecked(false);
                    }
                }
            });
            chkQ214h.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ214i.setChecked(false);
                    }
                }
            });
            chkQ214X.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ214i.setChecked(false);
                    }
                }
            });

            secQ215a=(LinearLayout)findViewById(R.id.secQ215a);
            lineQ215a=(View)findViewById(R.id.lineQ215a);
            VlblQ215a=(TextView) findViewById(R.id.VlblQ215a);
            chkQ215a=(CheckBox) findViewById(R.id.chkQ215a);
            secQ215b=(LinearLayout)findViewById(R.id.secQ215b);
            lineQ215b=(View)findViewById(R.id.lineQ215b);
            VlblQ215b=(TextView) findViewById(R.id.VlblQ215b);
            chkQ215b=(CheckBox) findViewById(R.id.chkQ215b);
            secQ215c=(LinearLayout)findViewById(R.id.secQ215c);
            lineQ215c=(View)findViewById(R.id.lineQ215c);
            VlblQ215c=(TextView) findViewById(R.id.VlblQ215c);
            chkQ215c=(CheckBox) findViewById(R.id.chkQ215c);
            secQ215d=(LinearLayout)findViewById(R.id.secQ215d);
            lineQ215d=(View)findViewById(R.id.lineQ215d);
            VlblQ215d=(TextView) findViewById(R.id.VlblQ215d);
            chkQ215d=(CheckBox) findViewById(R.id.chkQ215d);
            secQ215e=(LinearLayout)findViewById(R.id.secQ215e);
            lineQ215e=(View)findViewById(R.id.lineQ215e);
            VlblQ215e=(TextView) findViewById(R.id.VlblQ215e);
            chkQ215e=(CheckBox) findViewById(R.id.chkQ215e);
            secQ215f=(LinearLayout)findViewById(R.id.secQ215f);
            lineQ215f=(View)findViewById(R.id.lineQ215f);
            VlblQ215f=(TextView) findViewById(R.id.VlblQ215f);
            chkQ215f=(CheckBox) findViewById(R.id.chkQ215f);
            secQ215g=(LinearLayout)findViewById(R.id.secQ215g);
            lineQ215g=(View)findViewById(R.id.lineQ215g);
            VlblQ215g=(TextView) findViewById(R.id.VlblQ215g);
            chkQ215g=(CheckBox) findViewById(R.id.chkQ215g);
            secQ215X=(LinearLayout)findViewById(R.id.secQ215X);
            lineQ215X=(View)findViewById(R.id.lineQ215X);
            VlblQ215X=(TextView) findViewById(R.id.VlblQ215X);
            chkQ215X=(CheckBox) findViewById(R.id.chkQ215X);

            chkQ215X.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (!isChecked) {
                        secQ215X1.setVisibility(View.GONE);
                        lineQ215X1.setVisibility(View.GONE);
                        txtQ215X1.setText("");
                    } else {
                        secQ215X1.setVisibility(View.VISIBLE);
                        secQ215X1.setVisibility(View.VISIBLE);
                    }
                }
            });

            secQ215X1=(LinearLayout)findViewById(R.id.secQ215X1);
            lineQ215X1=(View)findViewById(R.id.lineQ215X1);
            VlblQ215X1=(TextView) findViewById(R.id.VlblQ215X1);
            txtQ215X1=(EditText) findViewById(R.id.txtQ215X1);
            secQ215h=(LinearLayout)findViewById(R.id.secQ215h);
            lineQ215h=(View)findViewById(R.id.lineQ215h);
            VlblQ215h=(TextView) findViewById(R.id.VlblQ215h);
            chkQ215h=(CheckBox) findViewById(R.id.chkQ215h);

            chkQ215h.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkQ215a.setChecked(false);
                        chkQ215b.setChecked(false);
                        chkQ215c.setChecked(false);
                        chkQ215d.setChecked(false);
                        chkQ215e.setChecked(false);
                        chkQ215f.setChecked(false);
                        chkQ215g.setChecked(false);
                        chkQ215X.setChecked(false);
                    }
                }
            });

            chkQ215a.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ215h.setChecked(false);
                    }
                }
            });
            chkQ215a.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ215h.setChecked(false);
                    }
                }
            });
            chkQ215a.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ215h.setChecked(false);
                    }
                }
            });
            chkQ215d.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ215h.setChecked(false);
                    }
                }
            });
            chkQ215e.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ215h.setChecked(false);
                    }
                }
            });
            chkQ215f.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ215h.setChecked(false);
                    }
                }
            });
            chkQ215g.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ215h.setChecked(false);
                    }
                }
            });
            chkQ215X.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((CheckBox) v).isChecked()) {
                        chkQ215h.setChecked(false);
                    }
                }
            });

            seclbl221=(LinearLayout)findViewById(R.id.seclbl221);
            secQ221=(LinearLayout)findViewById(R.id.secQ221);
            lineQ221=(View)findViewById(R.id.lineQ221);
            VlblQ221 = (TextView) findViewById(R.id.VlblQ221);
            rdogrpQ221 = (RadioGroup) findViewById(R.id.rdogrpQ221);

            rdoQ2211 = (RadioButton) findViewById(R.id.rdoQ2211);
            rdoQ2212 = (RadioButton) findViewById(R.id.rdoQ2212);
            secQ222=(LinearLayout)findViewById(R.id.secQ222);
            lineQ222=(View)findViewById(R.id.lineQ222);
            VlblQ222 = (TextView) findViewById(R.id.VlblQ222);
            rdogrpQ222 = (RadioGroup) findViewById(R.id.rdogrpQ222);

            rdoQ2221 = (RadioButton) findViewById(R.id.rdoQ2221);
            rdoQ2222 = (RadioButton) findViewById(R.id.rdoQ2222);
            secQ223=(LinearLayout)findViewById(R.id.secQ223);
            lineQ223=(View)findViewById(R.id.lineQ223);
            VlblQ223 = (TextView) findViewById(R.id.VlblQ223);
            rdogrpQ223 = (RadioGroup) findViewById(R.id.rdogrpQ223);

            rdoQ2231 = (RadioButton) findViewById(R.id.rdoQ2231);
            rdoQ2232 = (RadioButton) findViewById(R.id.rdoQ2232);
            rdogrpQ223.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpQ223 = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpQ223.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpQ223.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpQ223[i];
                    }

                    if(!rbData.equalsIgnoreCase("1"))
                    {
                        secQ224.setVisibility(View.GONE);
                        lineQ224.setVisibility(View.GONE);
                        rdogrpQ224.clearCheck();
                        secQ225.setVisibility(View.GONE);
                        lineQ225.setVisibility(View.GONE);
                        txtQ225.setText("");
                    }
                    else
                    {
                        secQ224.setVisibility(View.VISIBLE);
                        lineQ224.setVisibility(View.VISIBLE);
                        secQ225.setVisibility(View.VISIBLE);
                        lineQ225.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secQ224=(LinearLayout)findViewById(R.id.secQ224);
            lineQ224=(View)findViewById(R.id.lineQ224);
            VlblQ224 = (TextView) findViewById(R.id.VlblQ224);
            rdogrpQ224 = (RadioGroup) findViewById(R.id.rdogrpQ224);

            rdoQ2241 = (RadioButton) findViewById(R.id.rdoQ2241);
            rdoQ2242 = (RadioButton) findViewById(R.id.rdoQ2242);
            secQ225=(LinearLayout)findViewById(R.id.secQ225);
            lineQ225=(View)findViewById(R.id.lineQ225);
            VlblQ225=(TextView) findViewById(R.id.VlblQ225);
            txtQ225=(EditText) findViewById(R.id.txtQ225);
            seclbl3=(LinearLayout)findViewById(R.id.seclbl3);
            secQ31=(LinearLayout)findViewById(R.id.secQ31);
            lineQ31=(View)findViewById(R.id.lineQ31);
            VlblQ31 = (TextView) findViewById(R.id.VlblQ31);
            rdogrpQ31 = (RadioGroup) findViewById(R.id.rdogrpQ31);

            rdoQ311 = (RadioButton) findViewById(R.id.rdoQ311);
            rdoQ312 = (RadioButton) findViewById(R.id.rdoQ312);
          /*  rdogrpQ31.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpQ31 = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpQ31.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpQ31.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpQ31[i];
                    }
                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secQ32.setVisibility(View.VISIBLE);
                        lineQ32.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        secQ32.setVisibility(View.GONE);
                        lineQ32.setVisibility(View.GONE);
                        rdogrpQ32.clearCheck();
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });*/
            secQ32=(LinearLayout)findViewById(R.id.secQ32);
            lineQ32=(View)findViewById(R.id.lineQ32);
            VlblQ32 = (TextView) findViewById(R.id.VlblQ32);
            rdogrpQ32 = (RadioGroup) findViewById(R.id.rdogrpQ32);

            rdoQ321 = (RadioButton) findViewById(R.id.rdoQ321);
            rdoQ322 = (RadioButton) findViewById(R.id.rdoQ322);
            /*rdogrpQ32.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpQ32 = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpQ32.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpQ32.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpQ32[i];
                    }

                    if(rbData.equalsIgnoreCase("1"))
                    {
                        secQ33.setVisibility(View.GONE);
                        lineQ33.setVisibility(View.GONE);
                        rdogrpQ33.clearCheck();
                        secQ34.setVisibility(View.GONE);
                        lineQ34.setVisibility(View.GONE);
                        rdogrpQ34.clearCheck();
                    }
                    else {
                        secQ33.setVisibility(View.VISIBLE);
                        lineQ33.setVisibility(View.VISIBLE);
                        secQ34.setVisibility(View.VISIBLE);
                        lineQ34.setVisibility(View.VISIBLE);}
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });*/
            secQ33=(LinearLayout)findViewById(R.id.secQ33);
            lineQ33=(View)findViewById(R.id.lineQ33);
            VlblQ33 = (TextView) findViewById(R.id.VlblQ33);
            rdogrpQ33 = (RadioGroup) findViewById(R.id.rdogrpQ33);

            rdoQ331 = (RadioButton) findViewById(R.id.rdoQ331);
            rdoQ332 = (RadioButton) findViewById(R.id.rdoQ332);
            secQ34=(LinearLayout)findViewById(R.id.secQ34);
            lineQ34=(View)findViewById(R.id.lineQ34);
            VlblQ34 = (TextView) findViewById(R.id.VlblQ34);
            rdogrpQ34 = (RadioGroup) findViewById(R.id.rdogrpQ34);

            rdoQ341 = (RadioButton) findViewById(R.id.rdoQ341);
            rdoQ342 = (RadioButton) findViewById(R.id.rdoQ342);
            secQ35=(LinearLayout)findViewById(R.id.secQ35);
            lineQ35=(View)findViewById(R.id.lineQ35);
            VlblQ35 = (TextView) findViewById(R.id.VlblQ35);
            rdogrpQ35 = (RadioGroup) findViewById(R.id.rdogrpQ35);

            rdoQ351 = (RadioButton) findViewById(R.id.rdoQ351);
            rdoQ352 = (RadioButton) findViewById(R.id.rdoQ352);
            rdoQ353 = (RadioButton) findViewById(R.id.rdoQ353);
            rdogrpQ35.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpQ35 = new String[] {"1","0","2"};
                    for (int i = 0; i < rdogrpQ35.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpQ35.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpQ35[i];
                    }

                    if(rbData.equalsIgnoreCase("2"))
                    {
                        secQ36.setVisibility(View.GONE);
                        lineQ36.setVisibility(View.GONE);
                        rdogrpQ36.clearCheck();
                    }
                    else
                    {
                        secQ36.setVisibility(View.VISIBLE);
                        lineQ36.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secQ36=(LinearLayout)findViewById(R.id.secQ36);
            lineQ36=(View)findViewById(R.id.lineQ36);
            VlblQ36 = (TextView) findViewById(R.id.VlblQ36);
            rdogrpQ36 = (RadioGroup) findViewById(R.id.rdogrpQ36);

            rdoQ361 = (RadioButton) findViewById(R.id.rdoQ361);
            rdoQ362 = (RadioButton) findViewById(R.id.rdoQ362);
            rdoQ363 = (RadioButton) findViewById(R.id.rdoQ363);
            secQ37=(LinearLayout)findViewById(R.id.secQ37);
            lineQ37=(View)findViewById(R.id.lineQ37);
            VlblQ37 = (TextView) findViewById(R.id.VlblQ37);
            rdogrpQ37 = (RadioGroup) findViewById(R.id.rdogrpQ37);

            rdoQ371 = (RadioButton) findViewById(R.id.rdoQ371);
            rdoQ372 = (RadioButton) findViewById(R.id.rdoQ372);


            dtpVDate.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    final int DRAWABLE_RIGHT  = 2;
                    if(event.getAction() == MotionEvent.ACTION_UP) {
                        if(event.getRawX() >= (dtpVDate.getRight() - dtpVDate.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                            VariableID = "btnVDate"; showDialog(DATE_DIALOG);
                            return true;
                        }
                    }
                    return false;
                }
            });



            //Hide all skip variables
            secResultX.setVisibility(View.GONE);
            secResultX.setVisibility(View.GONE);
            secResultX.setVisibility(View.GONE);
            secResultX.setVisibility(View.GONE);
            secQ14X.setVisibility(View.GONE);
            secQ18X.setVisibility(View.GONE);
            secQ19X.setVisibility(View.GONE);
            secQ19X.setVisibility(View.GONE);
            secQ19X.setVisibility(View.GONE);
            secQ19X.setVisibility(View.GONE);
            secQ211X1.setVisibility(View.GONE);
            //secQ211n.setVisibility(View.GONE);
            //secQ212.setVisibility(View.GONE);
            secQ214X1.setVisibility(View.GONE);
            //secQ214i.setVisibility(View.GONE);
            //secQ215a.setVisibility(View.GONE);
            secQ215X1.setVisibility(View.GONE);
            //secQ215h.setVisibility(View.GONE);
            //secQ221.setVisibility(View.GONE);
            //secQ224.setVisibility(View.GONE);
            //secQ225.setVisibility(View.GONE);
            //secQ32.setVisibility(View.GONE);
            //secQ33.setVisibility(View.GONE);
            //secQ34.setVisibility(View.GONE);
            //secQ36.setVisibility(View.GONE);

            if(RND.length()==0)
            {
                RND="1";
            }
            txtRnd.setText(RND);
            txtSuchanaID.setText(SUCHANAID);
            dtpVDate.setText(Global.DateNowDMY());
            if(txtSuchanaID.getText().toString().trim().length()>=12)
            {
                spnDist.setEnabled(false);
                spnUpz.setEnabled(false);
                spnUn.setEnabled(false);
                spnVill.setEnabled(false);
                txtHHNo.setEnabled(false);
            }
            txtRnd.setEnabled(false);
            txtSuchanaID.setEnabled(false);

            DataSearchScreening(RND, SUCHANAID);
         //   DataSearchAdolescent(RND, SUCHANAID);
            DataSearch(RND, SUCHANAID);
            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();

                }
            });
        }
        catch(Exception  e)
        {
            Connection.MessageBox(Adolescent.this, e.getMessage());
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
                Connection.MessageBox(Adolescent.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtRnd.getText().toString().length()==0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length()==0 ? "5" : txtRnd.getText().toString()) > 5)
            {
                Connection.MessageBox(Adolescent.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            }
            else if(spnDist.getSelectedItemPosition()==0  & secDist.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field: District.");
                spnDist.requestFocus();
                return;
            }
            else if(spnUpz.getSelectedItemPosition()==0  & secUpz.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field: Upazila.");
                spnUpz.requestFocus();
                return;
            }
            else if(spnUn.getSelectedItemPosition()==0  & secUn.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field: Union.");
                spnUn.requestFocus();
                return;
            }
            else if(spnVill.getSelectedItemPosition()==0  & secVill.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field: Village.");
                spnVill.requestFocus();
                return;
            }
            else if(txtHHNo.getText().toString().length()==0 & secHHNo.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field: খানা সনাক্তকারী নম্বর.");
                txtHHNo.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtHHNo.getText().toString().length()==0 ? "1" : txtHHNo.getText().toString()) < 1 || Integer.valueOf(txtHHNo.getText().toString().length()==0 ? "9999" : txtHHNo.getText().toString()) > 9999)
            {
                Connection.MessageBox(Adolescent.this, "Value should be between 1 and 9999(খানা সনাক্তকারী নম্বর).");
                txtHHNo.requestFocus();
                return;
            }
            else if(txtSuchanaID.getText().toString().length()==0 & secSuchanaID.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field: উপকারভোগী সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            }
            else if(txtMobNo.getText().toString().length()==0 & secMobNo.isShown()& txtMobNo.getText().toString().length()==0 & txtMobNo.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field: মোবাইল নাম্বার.");
                txtMobNo.requestFocus();
                return;
            }
            else if(txtMobNo.getText().toString().length()>0 & txtMobNo.getText().toString().length()!=11)
            {
                Connection.MessageBox(Adolescent.this, "Invalid Mobile number");
                txtMobNo.requestFocus();
                return;
            }
            else if(txtMobNo.getText().toString().length()>0 & txtMobNo.getText().toString().length()!=11)
            {
                Connection.MessageBox(Adolescent.this, "Value should be 11 digit.");
                txtMobNo.requestFocus();
                return;
            }
            if(txtMobNo.getText().toString().length()>0)
            {
                if(txtMobNo.getText().toString().length()==11 &&(txtMobNo.getText().toString().substring(0,3).equals("015") || txtMobNo.getText().toString().substring(0,3).equals("016") || txtMobNo.getText().toString().substring(0,3).equals("017") || txtMobNo.getText().toString().substring(0,3).equals("018") || txtMobNo.getText().toString().substring(0,3).equals("019")))
                {

                }
                else
                {
                    Connection.MessageBox(Adolescent.this, "Invalid Mobile number");
                    txtMobNo.requestFocus();
                    return;
                }
            }

            /*else if(Integer.valueOf(txtMobNo.getText().toString().length()==0 ? "1" : txtMobNo.getText().toString()) < 1 || Integer.valueOf(txtMobNo.getText().toString().length()==0 ? "999" : txtMobNo.getText().toString()) > 999)
            {
                Connection.MessageBox(Adolescent.this, "Value should be between 1 and 99999999999(মোবাইল নম্বর).");
                txtMobNo.requestFocus();
                return;
            }*/
            /*else if(spnResName.getSelectedItemPosition()==0  & secResName.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field: উত্তর দাতা/দাত্রীর নাম.");
                spnResName.requestFocus();
                return;
            }
            else if(spnHedName.getSelectedItemPosition()==0  & secHedName.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field: খানা প্রধানের নাম.");
                spnHedName.requestFocus();
                return;
            }*/
            else if(txtResName.getText().toString().length()==0 & secResName.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field: উত্তর দাতা/দাত্রীর নাম.");
                txtResName.requestFocus();
                return;
            }
            else if(txtHedName.getText().toString().length()==0 & secHedName.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field: খানা প্রধানের নাম.");
                txtHedName.requestFocus();
                return;
            }
            DV = Global.DateValidate(dtpVDate.getText().toString());
            if(DV.length()!=0 & secVDate.isShown())
            {
                Connection.MessageBox(Adolescent.this, DV);
                dtpVDate.requestFocus();
                return;
            }
            else if(spnResult.getSelectedItemPosition()==0  & secResult.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field: সাক্ষাৎকার এর ফলাফল.");
                spnResult.requestFocus();
                return;
            }
            else if(txtResultX.getText().toString().length()==0 & secResultX.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field: যদি ‘না’ হয়, তবে কারণ.");
                txtResultX.requestFocus();
                return;
            }

            else if(!rdoQ111.isChecked() & !rdoQ112.isChecked() & secQ11.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Select anyone options from (লিঙ্গ ).");
                rdoQ111.requestFocus();
                return;
            }
            else if(txtQ12Y.getText().toString().length()==0 & secQ12Y.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field: বছর.");
                txtQ12Y.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtQ12Y.getText().toString().length()==0 ? "1" : txtQ12Y.getText().toString()) < 1 || Integer.valueOf(txtQ12Y.getText().toString().length()==0 ? "99" : txtQ12Y.getText().toString()) > 99)
            {
                Connection.MessageBox(Adolescent.this, "Value should be between 1 and 99(বছর).");
                txtQ12Y.requestFocus();
                return;
            }
            else if(txtQ12M.getText().toString().length()==0 & secQ12M.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field: মাস.");
                txtQ12M.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtQ12M.getText().toString().length()==0 ? "0" : txtQ12M.getText().toString()) < 0 || Integer.valueOf(txtQ12M.getText().toString().length()==0 ? "11" : txtQ12M.getText().toString()) > 11)
            {
                Connection.MessageBox(Adolescent.this, "Value should be between 0 and 11(মাস).");
                txtQ12M.requestFocus();
                return;
            }
            else if(spnQ13.getSelectedItemPosition()==0  & secQ13.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field: স্বাক্ষর জ্ঞান.");
                spnQ13.requestFocus();
                return;
            }
            else if(spnQ14.getSelectedItemPosition()==0  & secQ14.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field:Q14. শিক্ষাগত (শ্রেণী) যোগ্যতা.");
                spnQ14.requestFocus();
                return;
            }
            else if (spnQ13.getSelectedItemPosition() == 1 && spnQ14.getSelectedItemPosition() == 12) {
                Connection.MessageBox(Adolescent.this, "Q13- সাক্ষর জ্ঞ্যান এবং Q14-সর্বোচ্চ ক্লাস পাস তথ্য সামঞ্জস্যপূর্ণ নয়");
                spnQ14.requestFocus();
                return;
            }
            else if (spnQ13.getSelectedItemPosition() == 1 && spnQ14.getSelectedItemPosition() == 14) {
                Connection.MessageBox(Adolescent.this, "Q13- সাক্ষর জ্ঞ্যান এবং Q14-সর্বোচ্চ ক্লাস পাস তথ্য সামঞ্জস্যপূর্ণ নয়");
                spnQ14.requestFocus();
                return;
            }
            else if(txtQ14X.getText().toString().length()==0 & secQ14X.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field:Q14 অন্যান্য উল্লেখ করুন.");
                txtQ14X.requestFocus();
                return;
            }

            else if(!rdoQ151.isChecked() & !rdoQ152.isChecked() & secQ15.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Select anyone options from (Q15. আপনি বর্তমানে স্কুলে/কলেজে ভর্তি আছেন?).");
                rdoQ151.requestFocus();
                return;
            }
            else if(txtQ16.getText().toString().length()==0 & secQ16.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field:Q16 খানা’র বর্তমান সদস্য সংখ্যা.");
                txtQ16.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtQ16.getText().toString().length()==0 ? "1" : txtQ16.getText().toString()) < 1 || Integer.valueOf(txtQ16.getText().toString().length()==0 ? "30" : txtQ16.getText().toString()) > 30)
            {
                Connection.MessageBox(Adolescent.this, "Value should be between 1 and 30(Q16.খানা’র বর্তমান সদস্য সংখ্যা)");
                txtQ16.requestFocus();
                return;
            }
            else if(spnQ17.getSelectedItemPosition()==0  & secQ17.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field:Q17 খানা’র প্রধান কে?");
                spnQ17.requestFocus();
                return;
            }
            else if(spnQ18.getSelectedItemPosition()==0  & secQ18.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field:Q18 খানা প্রধানের বর্তমান পেশা কি?");
                spnQ18.requestFocus();
                return;
            }
            else if(txtQ18X.getText().toString().length()==0 & secQ18X.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field:Q18 অন্যান্য উল্লেখ করুণ");
                txtQ18X.requestFocus();
                return;
            }
            else if(spnQ19.getSelectedItemPosition()==0  & secQ19.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field:Q19 আপনি কোন ধর্ম পালন করেন?");
                spnQ19.requestFocus();
                return;
            }
            else if(txtQ19X.getText().toString().length()==0 & secQ19X.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field:Q19. অন্যান্য উল্লেখ করুণ");
                txtQ19X.requestFocus();
                return;
            }
            else if(txtQ110.getText().toString().length()==0 & secQ110.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field:Q110. এই খানায় বর্তমানে কতজন কিশোর/কিশোরী আছে?");
                txtQ110.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtQ110.getText().toString().length()==0 ? "0" : txtQ110.getText().toString()) < 0 || Integer.valueOf(txtQ110.getText().toString().length()==0 ? "20" : txtQ110.getText().toString()) > 20)
            {
                Connection.MessageBox(Adolescent.this, "Value should be between 0 and 20(Q110. এই খানায় বর্তমানে কতজন কিশোর/কিশোরী আছে?)");
                txtQ110.requestFocus();
                return;
            }

            else if(!rdoQ1111.isChecked() & !rdoQ1112.isChecked() & secQ111.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Select anyone options from (Q111. এই খানায় গত একবছরে আপনার বয়সী কোন কিশোরীর কি বিয়ে হয়েছে?( বয়স ১৫-১৯ বছর)).");
                rdoQ1111.requestFocus();
                return;
            }

            else if(!rdoQ1121.isChecked() & !rdoQ1122.isChecked() & secQ112.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Select anyone options from (Q112. আপনার খানা কি সরকার থেকে VGD প্রোগ্রামের মাধ্যমে/অধীনে কোন খাদ্য পেয়ে থাকেন ).");
                rdoQ1121.requestFocus();
                return;
            }
            else if(txtQ211X1.getText().toString().length()==0 & secQ211X1.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field:Q211. অন্যান্য উল্লেখ করুণ.");
                txtQ211X1.requestFocus();
                return;
            }
            else if(txtQ212.getText().toString().length()==0 & secQ212.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field:Q212. একজন মেয়ে/মহিলা জন্য বিয়ের ন্যূনতম বয়স কত হওয়া উচিত? (জানা নেই ৮৮ ).");
                txtQ212.requestFocus();
                return;
            }
            if (txtQ212.getText().toString().equals("88")) {

            }
            else if(Integer.valueOf(txtQ212.getText().toString().length()==0 ? "1" : txtQ212.getText().toString()) < 1 || Integer.valueOf(txtQ212.getText().toString().length()==0 ? "50" : txtQ212.getText().toString()) > 50)
            {
                Connection.MessageBox(Adolescent.this, "Value should be between 1 and 50 and 88(Q212. একজন মেয়ে/মহিলা জন্য বিয়ের ন্যূনতম বয়স কত হওয়া উচিত? (জানা নেই ৮৮ )).");
                txtQ212.requestFocus();
                return;
            }
            if (txtQ213.getText().toString().equals("88")) {

            }
            else if(txtQ213.getText().toString().length()==0 & secQ213.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field:Q213. একজন ছেলে/পুরুষের জন্য বিয়ের ন্যূনতম বয়স কত হওয়া উচিৎ? (জানা নেই ৮৮).");
                txtQ213.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtQ213.getText().toString().length()==0 ? "1" : txtQ213.getText().toString()) < 1 || Integer.valueOf(txtQ213.getText().toString().length()==0 ? "50" : txtQ213.getText().toString()) > 50)
            {
                Connection.MessageBox(Adolescent.this, "Value should be between 1 and 50(Q213. একজন ছেলে/পুরুষের জন্য বিয়ের ন্যূনতম বয়স কত হওয়া উচিৎ? (জানা নেই ৮৮)).");
                txtQ213.requestFocus();
                return;
            }
            else if(txtQ214X1.getText().toString().length()==0 & secQ214X1.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field:Q214. অন্যান্য উল্লেখ করুন.");
                txtQ214X1.requestFocus();
                return;
            }
            else if(txtQ215X1.getText().toString().length()==0 & secQ215X1.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field:Q215. অন্যান্য উল্লেখ করুন.");
                txtQ215X1.requestFocus();
                return;
            }

            else if(!rdoQ2211.isChecked() & !rdoQ2212.isChecked() & secQ221.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Select anyone options from (Q221. সন্তান প্রসবের পর মায়ের ভিটামিন এ ক্যাপসুল গ্রহণ সম্পর্কে শুনেছেন?).");
                rdoQ2211.requestFocus();
                return;
            }

            else if(!rdoQ2221.isChecked() & !rdoQ2222.isChecked() & secQ222.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Select anyone options from (Q222. শিশুদের ভিটামিন এ ক্যাপসুল গ্রহণ সম্পর্কে শুনেছেন?).");
                rdoQ2221.requestFocus();
                return;
            }

            else if(!rdoQ2231.isChecked() & !rdoQ2232.isChecked() & secQ223.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Select anyone options from (Q223. আপনি কি আয়রন ফলিক অ্যাসিড সম্পর্কে শুনেছেন?).");
                rdoQ2231.requestFocus();
                return;
            }

            else if(!rdoQ2241.isChecked() & !rdoQ2242.isChecked() & secQ224.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Select anyone options from (Q224. আপনি কি গর্ভাবস্থায় আয়রন গ্রহণ সম্পর্কে কখনো শুনেছেন?).");
                rdoQ2241.requestFocus();
                return;
            }
            else if(txtQ225.getText().toString().length()==0 & secQ225.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Required field: Q225. গর্ভাবস্থায় কয়টি আয়রন ফলিক অ্যাসিড ট্যাবলেট খাওয়া উচিৎ? (জানা নেই ৮৮৮).");
                txtQ225.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtQ225.getText().toString().length()==0 ? "1" : txtQ225.getText().toString()) < 1 || Integer.valueOf(txtQ225.getText().toString().length()==0 ? "888" : txtQ225.getText().toString()) > 888)
            {
                Connection.MessageBox(Adolescent.this, "Value should be between 1 and 888(Q225. গর্ভাবস্থায় কয়টি আয়রন ফলিক অ্যাসিড ট্যাবলেট খাওয়া উচিৎ? (জানা নেই ৮৮৮)).");
                txtQ225.requestFocus();
                return;
            }

            else if(!rdoQ311.isChecked() & !rdoQ312.isChecked() & secQ31.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Select anyone options from (Q31. আপনি কি মনে করেন পরিবারের বিভিন্ন সিদ্ধান্তের  ক্ষেত্রে আপনার মতামতের গুরুত্ব আছে?).");
                rdoQ311.requestFocus();
                return;
            }

            else if(!rdoQ321.isChecked() & !rdoQ322.isChecked() & secQ32.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Select anyone options from (Q32. আপনি কি মনে করেন বিয়ের সময় আপনার মতামতের গুরুত্ব আছে?).");
                rdoQ321.requestFocus();
                return;
            }

            else if(!rdoQ331.isChecked() & !rdoQ332.isChecked() & secQ33.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Select anyone options from (Q33. আপনি স্বাচ্ছন্দে স্কুল/কলেজে যেতে পারেন কিনা? ).");
                rdoQ331.requestFocus();
                return;
            }

            else if(!rdoQ341.isChecked() & !rdoQ342.isChecked() & secQ34.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Select anyone options from (Q34. আপনি স্বাচ্ছন্দে আত্মীয়ের বাড়ি যেতে পারেন কিনা?).");
                rdoQ341.requestFocus();
                return;
            }

            else if(!rdoQ351.isChecked() & !rdoQ352.isChecked() & !rdoQ353.isChecked() & secQ35.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Select anyone options from (Q35. আপনার খানা কি আপনার আয়ের উপর নির্ভরশীল?).");
                rdoQ351.requestFocus();
                return;
            }

            else if(!rdoQ361.isChecked() & !rdoQ362.isChecked() & !rdoQ363.isChecked() & secQ36.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Select anyone options from (Q36. আপনি যে অর্থ আয় করেন তা দিয়ে আপনি কি করেন?).");
                rdoQ361.requestFocus();
                return;
            }

            else if(!rdoQ371.isChecked() & !rdoQ372.isChecked() & secQ37.isShown())
            {
                Connection.MessageBox(Adolescent.this, "Select anyone options from (Q37. একটি বারের জন্যে ভাবুন যে আপনি কোনো কাজ বা ব্যবসার মাধ্যমে আয় করছেন, সেক্ষেত্রে আপনি কি মনে করেন যে আপনি আপনার ইচ্ছেনুযায়ী অর্থটি খরচ করতে পারবেন? ).");
                rdoQ371.requestFocus();
                return;
            }
            else if (secQ211a.isShown() & (!chkQ211a.isChecked() &
                    !chkQ211b.isChecked() &
                    !chkQ211c.isChecked() &
                    !chkQ211d.isChecked() &
                    !chkQ211e.isChecked() &
                    !chkQ211f.isChecked() &
                    !chkQ211g.isChecked() &
                    !chkQ211h.isChecked() &
                    !chkQ211i.isChecked() &
                    !chkQ211j.isChecked() &
                    !chkQ211k.isChecked() &
                    !chkQ211l.isChecked() &
                    !chkQ211m.isChecked() &
                    !chkQ211n.isChecked() &
                    !chkQ211X.isChecked())) {
                Connection.MessageBox(Adolescent.this,"Required field: 2.1.1 CheckList থেকে কমপক্ষে একটি অপশন সিলেক্ট করুন !");
                secQ215a.requestFocus();
                return;
            }
            else if(!chkQ214i.isChecked())
            {
                if (secQ214a.isShown() & (!chkQ214a.isChecked() &
                        !chkQ214b.isChecked() &
                        !chkQ214c.isChecked() &
                        !chkQ214d.isChecked() &
                        !chkQ214e.isChecked() &
                        !chkQ214f.isChecked() &
                        !chkQ214g.isChecked() &
                        !chkQ214h.isChecked() &
                        !chkQ211X.isChecked())) {
                    Connection.MessageBox(Adolescent.this,"Required field: 2.1.4 CheckList থেকে কমপক্ষে একটি অপশন সিলেক্ট করুন !");
                    secQ215a.requestFocus();
                    return;
                }
            }

            else if(!chkQ215h.isChecked())
            {
                if (secQ215a.isShown() & (!chkQ215a.isChecked() &
                        !chkQ215b.isChecked() &
                        !chkQ215c.isChecked() &
                        !chkQ215d.isChecked() &
                        !chkQ215e.isChecked() &
                        !chkQ215f.isChecked() &
                        !chkQ215g.isChecked() &
                        !chkQ215X.isChecked() &
                        !chkQ215h.isChecked())) {
                    Connection.MessageBox(Adolescent.this,"Required field: 2.1.5 CheckList থেকে কমপক্ষে একটি অপশন সিলেক্ট করুন !");
                    secQ215a.requestFocus();
                    return;
                }
            }



            String SQL = "";
            RadioButton rb;

            Adolescent_DataModel objSave = new Adolescent_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setDist((spnDist.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnDist.getSelectedItem().toString(), "-")));
            objSave.setUpz((spnUpz.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnUpz.getSelectedItem().toString(), "-")));
            objSave.setUn((spnUn.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnUn.getSelectedItem().toString(), "-")));
            objSave.setVill((spnVill.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnVill.getSelectedItem().toString(), "-")));
            objSave.setHHNo(txtHHNo.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setMobNo(txtMobNo.getText().toString());
            objSave.setResName(txtResName.getText().toString());
            objSave.setHedName(txtHedName.getText().toString());
            //objSave.setResName((spnResName.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnResName.getSelectedItem().toString(), "-")));
            //objSave.setHedName((spnHedName.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnHedName.getSelectedItem().toString(), "-")));
            objSave.setVDate(dtpVDate.getText().toString().length() > 0 ? Global.DateConvertYMD(dtpVDate.getText().toString()) : dtpVDate.getText().toString());
            objSave.setResult((spnResult.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnResult.getSelectedItem().toString(), "-")));
            objSave.setResultX(txtResultX.getText().toString());
            String[] d_rdogrpQ11 = new String[] {"1","2"};
            objSave.setQ11("");
            for (int i = 0; i < rdogrpQ11.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpQ11.getChildAt(i);
                if (rb.isChecked()) objSave.setQ11(d_rdogrpQ11[i]);
            }

            objSave.setQ12Y(txtQ12Y.getText().toString());
            objSave.setQ12M(txtQ12M.getText().toString());
            objSave.setQ13((spnQ13.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnQ13.getSelectedItem().toString(), "-")));
            objSave.setQ14((spnQ14.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnQ14.getSelectedItem().toString(), "-")));
            objSave.setQ14X(txtQ14X.getText().toString());
            String[] d_rdogrpQ15 = new String[] {"1","0"};
            objSave.setQ15("");
            for (int i = 0; i < rdogrpQ15.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpQ15.getChildAt(i);
                if (rb.isChecked()) objSave.setQ15(d_rdogrpQ15[i]);
            }

            objSave.setQ16(txtQ16.getText().toString());
            objSave.setQ17((spnQ17.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnQ17.getSelectedItem().toString(), "-")));
            objSave.setQ18((spnQ18.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnQ18.getSelectedItem().toString(), "-")));
            objSave.setQ18X(txtQ18X.getText().toString());
            objSave.setQ19((spnQ19.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnQ19.getSelectedItem().toString(), "-")));
            objSave.setQ19X(txtQ19X.getText().toString());
            objSave.setQ110(txtQ110.getText().toString());
            String[] d_rdogrpQ111 = new String[] {"1","0"};
            objSave.setQ111("");
            for (int i = 0; i < rdogrpQ111.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpQ111.getChildAt(i);
                if (rb.isChecked()) objSave.setQ111(d_rdogrpQ111[i]);
            }

            String[] d_rdogrpQ112 = new String[] {"1","0"};
            objSave.setQ112("");
            for (int i = 0; i < rdogrpQ112.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpQ112.getChildAt(i);
                if (rb.isChecked()) objSave.setQ112(d_rdogrpQ112[i]);
            }

            objSave.setQ211a((chkQ211a.isChecked()?"1":(secQ211a.isShown()? "2":"")));
            objSave.setQ211b((chkQ211b.isChecked()?"1":(secQ211b.isShown()? "2":"")));
            objSave.setQ211c((chkQ211c.isChecked()?"1":(secQ211c.isShown()? "2":"")));
            objSave.setQ211d((chkQ211d.isChecked()?"1":(secQ211d.isShown()? "2":"")));
            objSave.setQ211e((chkQ211e.isChecked()?"1":(secQ211e.isShown()? "2":"")));
            objSave.setQ211f((chkQ211f.isChecked()?"1":(secQ211f.isShown()? "2":"")));
            objSave.setQ211g((chkQ211g.isChecked()?"1":(secQ211g.isShown()? "2":"")));
            objSave.setQ211h((chkQ211h.isChecked()?"1":(secQ211h.isShown()? "2":"")));
            objSave.setQ211i((chkQ211i.isChecked()?"1":(secQ211i.isShown()? "2":"")));
            objSave.setQ211j((chkQ211j.isChecked()?"1":(secQ211j.isShown()? "2":"")));
            objSave.setQ211k((chkQ211k.isChecked()?"1":(secQ211k.isShown()? "2":"")));
            objSave.setQ211l((chkQ211l.isChecked()?"1":(secQ211l.isShown()? "2":"")));
            objSave.setQ211m((chkQ211m.isChecked()?"1":(secQ211m.isShown()? "2":"")));
            objSave.setQ211X((chkQ211X.isChecked()?"1":(secQ211X.isShown()? "2":"")));
            objSave.setQ211X1(txtQ211X1.getText().toString());
            objSave.setQ211n((chkQ211n.isChecked()?"1":(secQ211n.isShown()? "2":"")));

            objSave.setQ212(txtQ212.getText().toString());
            objSave.setQ213(txtQ213.getText().toString());

            objSave.setQ214a((chkQ214a.isChecked()?"1":(secQ214a.isShown()? "2":"")));
            objSave.setQ214b((chkQ214b.isChecked()?"1":(secQ214b.isShown()? "2":"")));
            objSave.setQ214c((chkQ214c.isChecked()?"1":(secQ214c.isShown()? "2":"")));
            objSave.setQ214d((chkQ214d.isChecked()?"1":(secQ214d.isShown()? "2":"")));
            objSave.setQ214e((chkQ214e.isChecked()?"1":(secQ214e.isShown()? "2":"")));
            objSave.setQ214f((chkQ214f.isChecked()?"1":(secQ214f.isShown()? "2":"")));
            objSave.setQ214g((chkQ214g.isChecked()?"1":(secQ214g.isShown()? "2":"")));
            objSave.setQ214h((chkQ214h.isChecked()?"1":(secQ214h.isShown()? "2":"")));
            objSave.setQ214X((chkQ214X.isChecked()?"1":(secQ214X.isShown()? "2":"")));
            objSave.setQ214X1(txtQ214X1.getText().toString());
            objSave.setQ214i((chkQ214i.isChecked()?"1":(secQ214i.isShown()? "2":"")));

            objSave.setQ215a((chkQ215a.isChecked()?"1":(secQ215a.isShown()? "2":"")));
            objSave.setQ215b((chkQ215b.isChecked()?"1":(secQ215b.isShown()? "2":"")));
            objSave.setQ215c((chkQ215c.isChecked()?"1":(secQ215c.isShown()? "2":"")));
            objSave.setQ215d((chkQ215d.isChecked()?"1":(secQ215d.isShown()? "2":"")));
            objSave.setQ215e((chkQ215e.isChecked()?"1":(secQ215e.isShown()? "2":"")));
            objSave.setQ215f((chkQ215f.isChecked()?"1":(secQ215f.isShown()? "2":"")));
            objSave.setQ215g((chkQ215g.isChecked()?"1":(secQ215g.isShown()? "2":"")));
            objSave.setQ215X((chkQ215X.isChecked()?"1":(secQ215X.isShown()? "2":"")));
            objSave.setQ215X1(txtQ215X1.getText().toString());
            objSave.setQ215h((chkQ215h.isChecked()?"1":(secQ215h.isShown()? "2":"")));

            String[] d_rdogrpQ221 = new String[] {"1","0"};
            objSave.setQ221("");
            for (int i = 0; i < rdogrpQ221.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpQ221.getChildAt(i);
                if (rb.isChecked()) objSave.setQ221(d_rdogrpQ221[i]);
            }

            String[] d_rdogrpQ222 = new String[] {"1","0"};
            objSave.setQ222("");
            for (int i = 0; i < rdogrpQ222.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpQ222.getChildAt(i);
                if (rb.isChecked()) objSave.setQ222(d_rdogrpQ222[i]);
            }

            String[] d_rdogrpQ223 = new String[] {"1","0"};
            objSave.setQ223("");
            for (int i = 0; i < rdogrpQ223.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpQ223.getChildAt(i);
                if (rb.isChecked()) objSave.setQ223(d_rdogrpQ223[i]);
            }

            String[] d_rdogrpQ224 = new String[] {"1","0"};
            objSave.setQ224("");
            for (int i = 0; i < rdogrpQ224.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpQ224.getChildAt(i);
                if (rb.isChecked()) objSave.setQ224(d_rdogrpQ224[i]);
            }

            objSave.setQ225(txtQ225.getText().toString());
            String[] d_rdogrpQ31 = new String[] {"1","0"};
            objSave.setQ31("");
            for (int i = 0; i < rdogrpQ31.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpQ31.getChildAt(i);
                if (rb.isChecked()) objSave.setQ31(d_rdogrpQ31[i]);
            }

            String[] d_rdogrpQ32 = new String[] {"1","0"};
            objSave.setQ32("");
            for (int i = 0; i < rdogrpQ32.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpQ32.getChildAt(i);
                if (rb.isChecked()) objSave.setQ32(d_rdogrpQ32[i]);
            }

            String[] d_rdogrpQ33 = new String[] {"1","0"};
            objSave.setQ33("");
            for (int i = 0; i < rdogrpQ33.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpQ33.getChildAt(i);
                if (rb.isChecked()) objSave.setQ33(d_rdogrpQ33[i]);
            }

            String[] d_rdogrpQ34 = new String[] {"1","0"};
            objSave.setQ34("");
            for (int i = 0; i < rdogrpQ34.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpQ34.getChildAt(i);
                if (rb.isChecked()) objSave.setQ34(d_rdogrpQ34[i]);
            }

            String[] d_rdogrpQ35 = new String[] {"1","0","2"};
            objSave.setQ35("");
            for (int i = 0; i < rdogrpQ35.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpQ35.getChildAt(i);
                if (rb.isChecked()) objSave.setQ35(d_rdogrpQ35[i]);
            }

            String[] d_rdogrpQ36 = new String[] {"1","2","3"};
            objSave.setQ36("");
            for (int i = 0; i < rdogrpQ36.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpQ36.getChildAt(i);
                if (rb.isChecked()) objSave.setQ36(d_rdogrpQ36[i]);
            }

            String[] d_rdogrpQ37 = new String[] {"1","0"};
            objSave.setQ37("");
            for (int i = 0; i < rdogrpQ37.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpQ37.getChildAt(i);
                if (rb.isChecked()) objSave.setQ37(d_rdogrpQ37[i]);
            }

            objSave.setEnDt(Global.DateTimeNowYMDHMS());
            objSave.setStartTime(StartTime);
            objSave.setEndTime(g.CurrentTime24());
            objSave.setUserId(g.getDeviceNo());
            objSave.setEntryUser(g.getUserId()); //from data entry user list
            //objSave.setLat(Double.toString(currentLatitude));
            //objSave.setLon(Double.toString(currentLongitude));

            String status = objSave.SaveUpdateData(this);
            if (status.length() == 0) {
                EntryStatus_DataModel e = new EntryStatus_DataModel(TableName, RND, SUCHANAID);
                e.SaveUpdateData(this);

                Bundle IDBundle = new Bundle();
                IDBundle.putString("Rnd", txtRnd.getText().toString());
                IDBundle.putString("SuchanaID", txtSuchanaID.getText().toString());
                finish();
                startActivity(new Intent(Adolescent.this, Adolescent_list.class).putExtras(IDBundle));

            } else {
                Connection.MessageBox(Adolescent.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(Adolescent.this, e.getMessage());
            return;
        }
    }

    private void DataSearchScreening(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            Screening_DataModel d = new Screening_DataModel();
            String SQL = "Select * from Screening  Where Rnd='" + Rnd + "' and suchanaid='" + SuchanaID + "'";
            List<Screening_DataModel> data = d.SelectAll(this, SQL);
            for (Screening_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                spnDist.setSelection(Global.SpinnerItemPositionAnyLength(spnDist, item.getDist()));
                DIS = item.getDist();
                spnUpz.setSelection(Global.SpinnerItemPositionAnyLength(spnUpz, item.getUpz()));
                UPZ = item.getUpz();
                spnUn.setSelection(Global.SpinnerItemPositionAnyLength(spnUn, item.getUn()));
                UN = item.getUn();
                spnVill.setSelection(Global.SpinnerItemPositionAnyLength(spnVill, item.getVill()));
                VILL = item.getVill();

                //for household interview
                txtHHNo.setText(item.getHHNo());
                txtMobNo.setText(item.getMobNo() + (item.getReqMobNo().length() > 0 ? "," + item.getReqMobNo() : ""));

                //for screening
                //txtH11.setText(item.getWRHHNo());
                txtSuchanaID.setText(item.getScreeningID());

                spnDist.setEnabled(false);
                spnUpz.setEnabled(false);
                spnUn.setEnabled(false);
                spnVill.setEnabled(false);
                txtHHNo.setEnabled(false);
                //txtMobNo.setEnabled(false);
                txtSuchanaID.setEnabled(false);
            }
        } catch (Exception e) {
            Connection.MessageBox(Adolescent.this, e.getMessage());
            return;
        }
    }

    private void DataSearchAdolescent(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            Adolescent_DataModel d = new Adolescent_DataModel();
            String SQL = "Select * from Adolescent  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<Adolescent_DataModel> data = d.SelectAll(this, SQL);
            for (Adolescent_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                spnDist.setSelection(Global.SpinnerItemPositionAnyLength(spnDist, item.getDist()));
                DIS = item.getDist();
                spnUpz.setSelection(Global.SpinnerItemPositionAnyLength(spnUpz, item.getUpz()));
                UPZ = item.getUpz();
                spnUn.setSelection(Global.SpinnerItemPositionAnyLength(spnUn, item.getUn()));
                UN = item.getUn();
                spnVill.setSelection(Global.SpinnerItemPositionAnyLength(spnVill, item.getVill()));
                VILL = item.getVill();
                txtHHNo.setText(item.getHHNo());
                txtSuchanaID.setText(item.getSuchanaID());

                spnDist.setEnabled(false);
                spnUpz.setEnabled(false);
                spnUn.setEnabled(false);
                spnVill.setEnabled(false);
                txtHHNo.setEnabled(false);
                txtSuchanaID.setEnabled(false);
            }
        } catch (Exception e) {
            Connection.MessageBox(Adolescent.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID)
    {
        try
        {
            RadioButton rb;
            Adolescent_DataModel d = new Adolescent_DataModel();
            String SQL = "Select * from "+ TableName +"  Where Rnd='"+ Rnd +"' and SuchanaID='"+ SuchanaID +"'";
            List<Adolescent_DataModel> data = d.SelectAll(this, SQL);
            for(Adolescent_DataModel item : data){

                Status = "update";
                txtRnd.setText(item.getRnd());
                spnDist.setSelection(Global.SpinnerItemPositionAnyLength(spnDist, item.getDist()));
                DIS = item.getDist();
                spnUpz.setSelection(Global.SpinnerItemPositionAnyLength(spnUpz, item.getUpz()));
                UPZ = item.getUpz();
                spnUn.setSelection(Global.SpinnerItemPositionAnyLength(spnUn, item.getUn()));
                UN = item.getUn();
                spnVill.setSelection(Global.SpinnerItemPositionAnyLength(spnVill, item.getVill()));
                VILL = item.getVill();
                txtHHNo.setText(item.getHHNo());
                txtSuchanaID.setText(item.getSuchanaID());

                spnDist.setEnabled(false);
                spnUpz.setEnabled(false);
                spnUn.setEnabled(false);
                spnVill.setEnabled(false);
                txtHHNo.setEnabled(false);
                txtSuchanaID.setEnabled(false);

                txtMobNo.setText(item.getMobNo());
                txtResName.setText(item.getResName());
                txtHedName.setText(item.getHedName());
                //spnResName.setSelection(Global.SpinnerItemPositionAnyLength(spnResName, item.getResName()));
                //spnHedName.setSelection(Global.SpinnerItemPositionAnyLength(spnHedName, item.getHedName()));
                dtpVDate.setText(item.getVDate().toString().length()==0 ? "" : Global.DateConvertDMY(item.getVDate()));
                spnResult.setSelection(Global.SpinnerItemPositionAnyLength(spnResult, item.getResult()));
                txtResultX.setText(item.getResultX());

                String[] d_rdogrpQ11 = new String[] {"1","2"};
                for (int i = 0; i < d_rdogrpQ11.length; i++)
                {
                    if (item.getQ11().equals(String.valueOf(d_rdogrpQ11[i])))
                    {
                        rb = (RadioButton)rdogrpQ11.getChildAt(i);
                        rb.setChecked(true);
                    }
                }

                txtQ12Y.setText(item.getQ12Y());
                txtQ12M.setText(item.getQ12M());
                spnQ13.setSelection(Global.SpinnerItemPositionAnyLength(spnQ13, item.getQ13()));
                spnQ14.setSelection(Global.SpinnerItemPositionAnyLength(spnQ14, item.getQ14()));
                txtQ14X.setText(item.getQ14X());
                String[] d_rdogrpQ15 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpQ15.length; i++)
                {
                    if (item.getQ15().equals(String.valueOf(d_rdogrpQ15[i])))
                    {
                        rb = (RadioButton)rdogrpQ15.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtQ16.setText(item.getQ16());
                spnQ17.setSelection(Global.SpinnerItemPositionAnyLength(spnQ17, item.getQ17()));
                spnQ18.setSelection(Global.SpinnerItemPositionAnyLength(spnQ18, item.getQ18()));
                txtQ18X.setText(item.getQ18X());
                spnQ19.setSelection(Global.SpinnerItemPositionAnyLength(spnQ19, item.getQ19()));
                txtQ19X.setText(item.getQ19X());
                txtQ110.setText(item.getQ110());
                String[] d_rdogrpQ111 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpQ111.length; i++)
                {
                    if (item.getQ111().equals(String.valueOf(d_rdogrpQ111[i])))
                    {
                        rb = (RadioButton)rdogrpQ111.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpQ112 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpQ112.length; i++)
                {
                    if (item.getQ112().equals(String.valueOf(d_rdogrpQ112[i])))
                    {
                        rb = (RadioButton)rdogrpQ112.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if(item.getQ211a().equals("1"))
                {
                    chkQ211a.setChecked(true);
                }
                else if(item.getQ211a().equals("2"))
                {
                    chkQ211a.setChecked(false);
                }
                if(item.getQ211b().equals("1"))
                {
                    chkQ211b.setChecked(true);
                }
                else if(item.getQ211b().equals("2"))
                {
                    chkQ211b.setChecked(false);
                }
                if(item.getQ211c().equals("1"))
                {
                    chkQ211c.setChecked(true);
                }
                else if(item.getQ211c().equals("2"))
                {
                    chkQ211c.setChecked(false);
                }
                if(item.getQ211d().equals("1"))
                {
                    chkQ211d.setChecked(true);
                }
                else if(item.getQ211d().equals("2"))
                {
                    chkQ211d.setChecked(false);
                }
                if(item.getQ211e().equals("1"))
                {
                    chkQ211e.setChecked(true);
                }
                else if(item.getQ211e().equals("2"))
                {
                    chkQ211e.setChecked(false);
                }
                if(item.getQ211f().equals("1"))
                {
                    chkQ211f.setChecked(true);
                }
                else if(item.getQ211f().equals("2"))
                {
                    chkQ211f.setChecked(false);
                }
                if(item.getQ211g().equals("1"))
                {
                    chkQ211g.setChecked(true);
                }
                else if(item.getQ211g().equals("2"))
                {
                    chkQ211g.setChecked(false);
                }
                if(item.getQ211h().equals("1"))
                {
                    chkQ211h.setChecked(true);
                }
                else if(item.getQ211h().equals("2"))
                {
                    chkQ211h.setChecked(false);
                }
                if(item.getQ211i().equals("1"))
                {
                    chkQ211i.setChecked(true);
                }
                else if(item.getQ211i().equals("2"))
                {
                    chkQ211i.setChecked(false);
                }
                if(item.getQ211j().equals("1"))
                {
                    chkQ211j.setChecked(true);
                }
                else if(item.getQ211j().equals("2"))
                {
                    chkQ211j.setChecked(false);
                }
                if(item.getQ211k().equals("1"))
                {
                    chkQ211k.setChecked(true);
                }
                else if(item.getQ211k().equals("2"))
                {
                    chkQ211k.setChecked(false);
                }
                if(item.getQ211l().equals("1"))
                {
                    chkQ211l.setChecked(true);
                }
                else if(item.getQ211l().equals("2"))
                {
                    chkQ211l.setChecked(false);
                }
                if(item.getQ211m().equals("1"))
                {
                    chkQ211m.setChecked(true);
                }
                else if(item.getQ211m().equals("2"))
                {
                    chkQ211m.setChecked(false);
                }
                if(item.getQ211X().equals("1"))
                {
                    chkQ211X.setChecked(true);
                }
                else if(item.getQ211X().equals("2"))
                {
                    chkQ211X.setChecked(false);
                }
                txtQ211X1.setText(item.getQ211X1());
                if(item.getQ211n().equals("1"))
                {
                    chkQ211n.setChecked(true);
                }
                else if(item.getQ211n().equals("2"))
                {
                    chkQ211n.setChecked(false);
                }
                txtQ212.setText(item.getQ212());
                txtQ213.setText(item.getQ213());
                if(item.getQ214a().equals("1"))
                {
                    chkQ214a.setChecked(true);
                }
                else if(item.getQ214a().equals("2"))
                {
                    chkQ214a.setChecked(false);
                }
                if(item.getQ214b().equals("1"))
                {
                    chkQ214b.setChecked(true);
                }
                else if(item.getQ214b().equals("2"))
                {
                    chkQ214b.setChecked(false);
                }
                if(item.getQ214c().equals("1"))
                {
                    chkQ214c.setChecked(true);
                }
                else if(item.getQ214c().equals("2"))
                {
                    chkQ214c.setChecked(false);
                }
                if(item.getQ214d().equals("1"))
                {
                    chkQ214d.setChecked(true);
                }
                else if(item.getQ214d().equals("2"))
                {
                    chkQ214d.setChecked(false);
                }
                if(item.getQ214e().equals("1"))
                {
                    chkQ214e.setChecked(true);
                }
                else if(item.getQ214e().equals("2"))
                {
                    chkQ214e.setChecked(false);
                }
                if(item.getQ214f().equals("1"))
                {
                    chkQ214f.setChecked(true);
                }
                else if(item.getQ214f().equals("2"))
                {
                    chkQ214f.setChecked(false);
                }
                if(item.getQ214g().equals("1"))
                {
                    chkQ214g.setChecked(true);
                }
                else if(item.getQ214g().equals("2"))
                {
                    chkQ214g.setChecked(false);
                }
                if(item.getQ214h().equals("1"))
                {
                    chkQ214h.setChecked(true);
                }
                else if(item.getQ214h().equals("2"))
                {
                    chkQ214h.setChecked(false);
                }
                if(item.getQ214X().equals("1"))
                {
                    chkQ214X.setChecked(true);
                }
                else if(item.getQ214X().equals("2"))
                {
                    chkQ214X.setChecked(false);
                }
                txtQ214X1.setText(item.getQ214X1());
                if(item.getQ214i().equals("1"))
                {
                    chkQ214i.setChecked(true);
                }
                else if(item.getQ214i().equals("2"))
                {
                    chkQ214i.setChecked(false);
                }
                if(item.getQ215a().equals("1"))
                {
                    chkQ215a.setChecked(true);
                }
                else if(item.getQ215a().equals("2"))
                {
                    chkQ215a.setChecked(false);
                }
                if(item.getQ215b().equals("1"))
                {
                    chkQ215b.setChecked(true);
                }
                else if(item.getQ215b().equals("2"))
                {
                    chkQ215b.setChecked(false);
                }
                if(item.getQ215c().equals("1"))
                {
                    chkQ215c.setChecked(true);
                }
                else if(item.getQ215c().equals("2"))
                {
                    chkQ215c.setChecked(false);
                }
                if(item.getQ215d().equals("1"))
                {
                    chkQ215d.setChecked(true);
                }
                else if(item.getQ215d().equals("2"))
                {
                    chkQ215d.setChecked(false);
                }
                if(item.getQ215e().equals("1"))
                {
                    chkQ215e.setChecked(true);
                }
                else if(item.getQ215e().equals("2"))
                {
                    chkQ215e.setChecked(false);
                }
                if(item.getQ215f().equals("1"))
                {
                    chkQ215f.setChecked(true);
                }
                else if(item.getQ215f().equals("2"))
                {
                    chkQ215f.setChecked(false);
                }
                if(item.getQ215g().equals("1"))
                {
                    chkQ215g.setChecked(true);
                }
                else if(item.getQ215g().equals("2"))
                {
                    chkQ215g.setChecked(false);
                }
                if(item.getQ215X().equals("1"))
                {
                    chkQ215X.setChecked(true);
                }
                else if(item.getQ215X().equals("2"))
                {
                    chkQ215X.setChecked(false);
                }
                txtQ215X1.setText(item.getQ215X1());
                if(item.getQ215h().equals("1"))
                {
                    chkQ215h.setChecked(true);
                }
                else if(item.getQ215h().equals("2"))
                {
                    chkQ215h.setChecked(false);
                }
                String[] d_rdogrpQ221 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpQ221.length; i++)
                {
                    if (item.getQ221().equals(String.valueOf(d_rdogrpQ221[i])))
                    {
                        rb = (RadioButton)rdogrpQ221.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpQ222 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpQ222.length; i++)
                {
                    if (item.getQ222().equals(String.valueOf(d_rdogrpQ222[i])))
                    {
                        rb = (RadioButton)rdogrpQ222.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpQ223 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpQ223.length; i++)
                {
                    if (item.getQ223().equals(String.valueOf(d_rdogrpQ223[i])))
                    {
                        rb = (RadioButton)rdogrpQ223.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpQ224 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpQ224.length; i++)
                {
                    if (item.getQ224().equals(String.valueOf(d_rdogrpQ224[i])))
                    {
                        rb = (RadioButton)rdogrpQ224.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtQ225.setText(item.getQ225());
                String[] d_rdogrpQ31 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpQ31.length; i++)
                {
                    if (item.getQ31().equals(String.valueOf(d_rdogrpQ31[i])))
                    {
                        rb = (RadioButton)rdogrpQ31.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpQ32 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpQ32.length; i++)
                {
                    if (item.getQ32().equals(String.valueOf(d_rdogrpQ32[i])))
                    {
                        rb = (RadioButton)rdogrpQ32.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpQ33 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpQ33.length; i++)
                {
                    if (item.getQ33().equals(String.valueOf(d_rdogrpQ33[i])))
                    {
                        rb = (RadioButton)rdogrpQ33.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpQ34 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpQ34.length; i++)
                {
                    if (item.getQ34().equals(String.valueOf(d_rdogrpQ34[i])))
                    {
                        rb = (RadioButton)rdogrpQ34.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpQ35 = new String[] {"1","0","2"};
                for (int i = 0; i < d_rdogrpQ35.length; i++)
                {
                    if (item.getQ35().equals(String.valueOf(d_rdogrpQ35[i])))
                    {
                        rb = (RadioButton)rdogrpQ35.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpQ36 = new String[] {"1","2","3"};
                for (int i = 0; i < d_rdogrpQ36.length; i++)
                {
                    if (item.getQ36().equals(String.valueOf(d_rdogrpQ36[i])))
                    {
                        rb = (RadioButton)rdogrpQ36.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpQ37 = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpQ37.length; i++)
                {
                    if (item.getQ37().equals(String.valueOf(d_rdogrpQ37[i])))
                    {
                        rb = (RadioButton)rdogrpQ37.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
            }
        }
        catch(Exception  e)
        {
            Connection.MessageBox(Adolescent.this, e.getMessage());
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
    private void GenerateSuchanaID() {
        String D = spnDist.getSelectedItemPosition() > 0 ? Connection.SelectedSpinnerValue(spnDist.getSelectedItem().toString(), "-") : "";
        String U = spnUpz.getSelectedItemPosition() > 0 ? Connection.SelectedSpinnerValue(spnUpz.getSelectedItem().toString(), "-") : "";
        String Un = spnUn.getSelectedItemPosition() > 0 ? Connection.SelectedSpinnerValue(spnUn.getSelectedItem().toString(), "-") : "";
        String Vil = spnVill.getSelectedItemPosition() > 0 ? Connection.SelectedSpinnerValue(spnVill.getSelectedItem().toString(), "-") : "";
        String SID = D + U + Un + Vil + txtHHNo.getText().toString();
        txtSuchanaID.setText(SID);
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