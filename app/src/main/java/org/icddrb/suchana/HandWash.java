package org.icddrb.suchana;
//Android Manifest Code
//<activity android:name=".HandWash" android:label="HandWash" />

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

public class HandWash extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    boolean networkAvailable=false;
    Location currentLocation;
    double currentLatitude,currentLongitude;
    String VariableID;
    Connection C;
    Global g;
    SimpleAdapter dataAdapter;
    ArrayList<HashMap<String, String>> dataList = new ArrayList<HashMap<String, String>>();
    TextView lblHeading;
    LinearLayout secM24;
    LinearLayout secRnd;
    View lineRnd;
    TextView VlblRnd;
    EditText txtRnd;
    LinearLayout secSuchanaID;
    View lineSuchanaID;
    TextView VlblSuchanaID;
    EditText txtSuchanaID;
    LinearLayout secM241;
    LinearLayout seclblM24;
    View linelblM24;
    TextView VlbllblM24;
    EditText txtlblM24;
    LinearLayout secM241a;
    View lineM241a;
    TextView VlblM241a;
    CheckBox chkM241a;
    LinearLayout secM241b;
    View lineM241b;
    TextView VlblM241b;
    CheckBox chkM241b;
    LinearLayout secM241c;
    View lineM241c;
    TextView VlblM241c;
    CheckBox chkM241c;
    LinearLayout secM241d;
    View lineM241d;
    TextView VlblM241d;
    CheckBox chkM241d;
    LinearLayout secM241e;
    View lineM241e;
    TextView VlblM241e;
    CheckBox chkM241e;
    LinearLayout secM241f;
    View lineM241f;
    TextView VlblM241f;
    CheckBox chkM241f;
    LinearLayout secM241g;
    View lineM241g;
    TextView VlblM241g;
    CheckBox chkM241g;
    LinearLayout secM241gX;
    View lineM241gX;
    TextView VlblM241gX;
    EditText txtM241gX;
    LinearLayout secM241h;
    View lineM241h;
    TextView VlblM241h;
    CheckBox chkM241h;
    LinearLayout secM241i;
    View lineM241i;
    TextView VlblM241i;
    CheckBox chkM241i;
    LinearLayout secM242;
    LinearLayout secM242a;
    View lineM242a;
    TextView VlblM242a;
    RadioGroup rdogrpM242a;
    RadioButton rdoM242a1;
    RadioButton rdoM242a2;
    LinearLayout secM242a1;
    View lineM242a1;
    TextView VlblM242a1;
    Spinner spnM242a1;
    LinearLayout secM242a1X;
    View lineM242a1X;
    TextView VlblM242a1X;
    EditText txtM242a1X;
    LinearLayout secM242b;
    View lineM242b;
    TextView VlblM242b;
    RadioGroup rdogrpM242b;
    RadioButton rdoM242b1;
    RadioButton rdoM242b2;
    LinearLayout secM242b1;
    View lineM242b1;
    TextView VlblM242b1;
    Spinner spnM242b1;
    LinearLayout secM242b1X;
    View lineM242b1X;
    TextView VlblM242b1X;
    EditText txtM242b1X;
    LinearLayout secM242c;
    View lineM242c;
    TextView VlblM242c;
    RadioGroup rdogrpM242c;
    RadioButton rdoM242c1;
    RadioButton rdoM242c2;
    LinearLayout secM242c1;
    View lineM242c1;
    TextView VlblM242c1;
    Spinner spnM242c1;
    LinearLayout secM242c1X;
    View lineM242c1X;
    TextView VlblM242c1X;
    EditText txtM242c1X;
    LinearLayout secM242d;
    View lineM242d;
    TextView VlblM242d;
    RadioGroup rdogrpM242d;
    RadioButton rdoM242d1;
    RadioButton rdoM242d2;
    LinearLayout secM242d1;
    View lineM242d1;
    TextView VlblM242d1;
    Spinner spnM242d1;
    LinearLayout secM242d1X;
    View lineM242d1X;
    TextView VlblM242d1X;
    EditText txtM242d1X;
    LinearLayout secM242e;
    View lineM242e;
    TextView VlblM242e;
    RadioGroup rdogrpM242e;
    RadioButton rdoM242e1;
    RadioButton rdoM242e2;
    LinearLayout secM242e1;
    View lineM242e1;
    TextView VlblM242e1;
    Spinner spnM242e1;
    LinearLayout secM242e1X;
    View lineM242e1X;
    TextView VlblM242e1X;
    EditText txtM242e1X;
    LinearLayout secM242f;
    View lineM242f;
    TextView VlblM242f;
    RadioGroup rdogrpM242f;
    RadioButton rdoM242f1;
    RadioButton rdoM242f2;
    LinearLayout secM242f1;
    View lineM242f1;
    TextView VlblM242f1;
    Spinner spnM242f1;
    LinearLayout secM242f1X;
    View lineM242f1X;
    TextView VlblM242f1X;
    EditText txtM242f1X;
    LinearLayout secM242g;
    View lineM242g;
    TextView VlblM242g;
    RadioGroup rdogrpM242g;
    RadioButton rdoM242g1;
    RadioButton rdoM242g2;
    LinearLayout secM242g1;
    View lineM242g1;
    TextView VlblM242g1;
    Spinner spnM242g1;
    LinearLayout secM242g1X;
    View lineM242g1X;
    TextView VlblM242g1X;
    EditText txtM242g1X;
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
        try
        {
            setContentView(R.layout.handwash);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TableName = "HandWash";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView)findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(HandWash.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), FdHabitKnow.class);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(HandWash.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to return to Home [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), NutHealth.class);
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


            secM24=(LinearLayout)findViewById(R.id.secM24);
            secRnd=(LinearLayout)findViewById(R.id.secRnd);
            lineRnd=(View)findViewById(R.id.lineRnd);
            VlblRnd=(TextView) findViewById(R.id.VlblRnd);
            txtRnd=(EditText) findViewById(R.id.txtRnd);
            secSuchanaID=(LinearLayout)findViewById(R.id.secSuchanaID);
            lineSuchanaID=(View)findViewById(R.id.lineSuchanaID);
            VlblSuchanaID=(TextView) findViewById(R.id.VlblSuchanaID);
            txtSuchanaID=(EditText) findViewById(R.id.txtSuchanaID);
            secM241=(LinearLayout)findViewById(R.id.secM241);
            seclblM24=(LinearLayout)findViewById(R.id.seclblM24);
            linelblM24=(View)findViewById(R.id.linelblM24);
            VlbllblM24=(TextView) findViewById(R.id.VlbllblM24);
          //  txtlblM24=(EditText) findViewById(R.id.txtlblM24);
            secM241a=(LinearLayout)findViewById(R.id.secM241a);
            lineM241a=(View)findViewById(R.id.lineM241a);
            VlblM241a=(TextView) findViewById(R.id.VlblM241a);
            chkM241a=(CheckBox) findViewById(R.id.chkM241a);
            secM241b=(LinearLayout)findViewById(R.id.secM241b);
            lineM241b=(View)findViewById(R.id.lineM241b);
            VlblM241b=(TextView) findViewById(R.id.VlblM241b);
            chkM241b=(CheckBox) findViewById(R.id.chkM241b);
            secM241c=(LinearLayout)findViewById(R.id.secM241c);
            lineM241c=(View)findViewById(R.id.lineM241c);
            VlblM241c=(TextView) findViewById(R.id.VlblM241c);
            chkM241c=(CheckBox) findViewById(R.id.chkM241c);
            secM241d=(LinearLayout)findViewById(R.id.secM241d);
            lineM241d=(View)findViewById(R.id.lineM241d);
            VlblM241d=(TextView) findViewById(R.id.VlblM241d);
            chkM241d=(CheckBox) findViewById(R.id.chkM241d);
            secM241e=(LinearLayout)findViewById(R.id.secM241e);
            lineM241e=(View)findViewById(R.id.lineM241e);
            VlblM241e=(TextView) findViewById(R.id.VlblM241e);
            chkM241e=(CheckBox) findViewById(R.id.chkM241e);
            secM241f=(LinearLayout)findViewById(R.id.secM241f);
            lineM241f=(View)findViewById(R.id.lineM241f);
            VlblM241f=(TextView) findViewById(R.id.VlblM241f);
            chkM241f=(CheckBox) findViewById(R.id.chkM241f);
            secM241g=(LinearLayout)findViewById(R.id.secM241g);
            lineM241g=(View)findViewById(R.id.lineM241g);
            VlblM241g=(TextView) findViewById(R.id.VlblM241g);
            chkM241g=(CheckBox) findViewById(R.id.chkM241g);
            chkM241g.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    if(!((CheckBox) v).isChecked())
                    {
                        secM241gX.setVisibility(View.GONE);
                        lineM241gX.setVisibility(View.GONE);
                        txtM241gX.setText("");

                    }
                    else
                    {
                        secM241gX.setVisibility(View.VISIBLE);
                        lineM241gX.setVisibility(View.VISIBLE);
                    }
                }
            });
            secM241gX=(LinearLayout)findViewById(R.id.secM241gX);
            lineM241gX=(View)findViewById(R.id.lineM241gX);
            VlblM241gX=(TextView) findViewById(R.id.VlblM241gX);
            txtM241gX=(EditText) findViewById(R.id.txtM241gX);
            secM241h=(LinearLayout)findViewById(R.id.secM241h);
            lineM241h=(View)findViewById(R.id.lineM241h);
            VlblM241h=(TextView) findViewById(R.id.VlblM241h);
            chkM241h=(CheckBox) findViewById(R.id.chkM241h);
            secM241i=(LinearLayout)findViewById(R.id.secM241i);
            lineM241i=(View)findViewById(R.id.lineM241i);
            VlblM241i=(TextView) findViewById(R.id.VlblM241i);
            chkM241i=(CheckBox) findViewById(R.id.chkM241i);


            chkM241i.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    if(((CheckBox) v).isChecked())
                    {
                        chkM241a.setChecked(false);
                        chkM241b.setChecked(false);
                        chkM241c.setChecked(false);
                        chkM241d.setChecked(false);
                        chkM241e.setChecked(false);
                        chkM241f.setChecked(false);
                        chkM241g.setChecked(false);
                        txtM241gX.setText(null);
                        chkM241h.setChecked(false);
                    }

                }
            });

            secM242=(LinearLayout)findViewById(R.id.secM242);
            secM242a=(LinearLayout)findViewById(R.id.secM242a);
            lineM242a=(View)findViewById(R.id.lineM242a);
            VlblM242a = (TextView) findViewById(R.id.VlblM242a);
            rdogrpM242a = (RadioGroup) findViewById(R.id.rdogrpM242a);

            rdoM242a1 = (RadioButton) findViewById(R.id.rdoM242a1);
            rdoM242a2 = (RadioButton) findViewById(R.id.rdoM242a2);
            rdogrpM242a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpM242a = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpM242a.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpM242a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpM242a[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secM242a1.setVisibility(View.GONE);
                        lineM242a1.setVisibility(View.GONE);
                        spnM242a1.setSelection(0);
                        secM242a1X.setVisibility(View.GONE);
                        lineM242a1X.setVisibility(View.GONE);
                        txtM242a1X.setText("");
                    }
                    else
                    {
                        secM242a1.setVisibility(View.VISIBLE);
                        lineM242a1.setVisibility(View.VISIBLE);
                       // secM242a1X.setVisibility(View.VISIBLE);
                      //  lineM242a1X.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secM242a1=(LinearLayout)findViewById(R.id.secM242a1);
            lineM242a1=(View)findViewById(R.id.lineM242a1);
            VlblM242a1=(TextView) findViewById(R.id.VlblM242a1);
            spnM242a1=(Spinner) findViewById(R.id.spnM242a1);
            List<String> listM242a1 = new ArrayList<String>();

            listM242a1.add("");
            listM242a1.add("1-সাবান এবং পানি");
            listM242a1.add("2-ছাই এবং পানি");
            listM242a1.add("3-কাদা এবং পানি");
            listM242a1.add("4-শুধু মাত্র পানি");
            listM242a1.add("7-অন্যান্য");
            ArrayAdapter<String> adptrM242a1= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM242a1);
            spnM242a1.setAdapter(adptrM242a1);

            spnM242a1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnM242a1.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnM242a1.getSelectedItem().toString(),"-");
                    if(spnData.equalsIgnoreCase("7"))
                    {
                        secM242a1X.setVisibility(View.VISIBLE);
                        lineM242a1X.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        secM242a1X.setVisibility(View.GONE);
                        lineM242a1X.setVisibility(View.GONE);
                        txtM242a1X.setText(null);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secM242a1X=(LinearLayout)findViewById(R.id.secM242a1X);
            lineM242a1X=(View)findViewById(R.id.lineM242a1X);
            VlblM242a1X=(TextView) findViewById(R.id.VlblM242a1X);
            txtM242a1X=(EditText) findViewById(R.id.txtM242a1X);
            secM242b=(LinearLayout)findViewById(R.id.secM242b);
            lineM242b=(View)findViewById(R.id.lineM242b);
            VlblM242b = (TextView) findViewById(R.id.VlblM242b);
            rdogrpM242b = (RadioGroup) findViewById(R.id.rdogrpM242b);

            rdoM242b1 = (RadioButton) findViewById(R.id.rdoM242b1);
            rdoM242b2 = (RadioButton) findViewById(R.id.rdoM242b2);
            rdogrpM242b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpM242b = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpM242b.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpM242b.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpM242b[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secM242b1.setVisibility(View.GONE);
                        lineM242b1.setVisibility(View.GONE);
                        spnM242b1.setSelection(0);
                        secM242b1X.setVisibility(View.GONE);
                        lineM242b1X.setVisibility(View.GONE);
                        txtM242b1X.setText("");
                    }
                    else
                    {
                        secM242b1.setVisibility(View.VISIBLE);
                        lineM242b1.setVisibility(View.VISIBLE);
                     //   secM242b1X.setVisibility(View.VISIBLE);
                      //  lineM242b1X.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secM242b1=(LinearLayout)findViewById(R.id.secM242b1);
            lineM242b1=(View)findViewById(R.id.lineM242b1);
            VlblM242b1=(TextView) findViewById(R.id.VlblM242b1);
            spnM242b1=(Spinner) findViewById(R.id.spnM242b1);
            List<String> listM242b1 = new ArrayList<String>();

            listM242b1.add("");
            listM242b1.add("1-সাবান এবং পানি");
            listM242b1.add("2-ছাই এবং পানি");
            listM242b1.add("3-কাদা এবং পানি");
            listM242b1.add("4-শুধু মাত্র পানি");
            listM242b1.add("7-অন্যান্য");
            ArrayAdapter<String> adptrM242b1= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM242b1);
            spnM242b1.setAdapter(adptrM242b1);

            spnM242b1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnM242b1.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnM242b1.getSelectedItem().toString(),"-");
                    if(spnData.equalsIgnoreCase("7"))
                    {
                        secM242b1X.setVisibility(View.VISIBLE);
                        lineM242b1X.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        secM242b1X.setVisibility(View.GONE);
                        lineM242b1X.setVisibility(View.GONE);
                        txtM242b1X.setText(null);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secM242b1X=(LinearLayout)findViewById(R.id.secM242b1X);
            lineM242b1X=(View)findViewById(R.id.lineM242b1X);
            VlblM242b1X=(TextView) findViewById(R.id.VlblM242b1X);
            txtM242b1X=(EditText) findViewById(R.id.txtM242b1X);
            secM242c=(LinearLayout)findViewById(R.id.secM242c);
            lineM242c=(View)findViewById(R.id.lineM242c);
            VlblM242c = (TextView) findViewById(R.id.VlblM242c);
            rdogrpM242c = (RadioGroup) findViewById(R.id.rdogrpM242c);

            rdoM242c1 = (RadioButton) findViewById(R.id.rdoM242c1);
            rdoM242c2 = (RadioButton) findViewById(R.id.rdoM242c2);
            rdogrpM242c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpM242c = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpM242c.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpM242c.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpM242c[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secM242c1.setVisibility(View.GONE);
                        lineM242c1.setVisibility(View.GONE);
                        spnM242c1.setSelection(0);
                        secM242c1X.setVisibility(View.GONE);
                        lineM242c1X.setVisibility(View.GONE);
                        txtM242c1X.setText("");
                    }
                    else
                    {
                        secM242c1.setVisibility(View.VISIBLE);
                        lineM242c1.setVisibility(View.VISIBLE);
                      //  secM242c1X.setVisibility(View.VISIBLE);
                      //  lineM242c1X.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secM242c1=(LinearLayout)findViewById(R.id.secM242c1);
            lineM242c1=(View)findViewById(R.id.lineM242c1);
            VlblM242c1=(TextView) findViewById(R.id.VlblM242c1);
            spnM242c1=(Spinner) findViewById(R.id.spnM242c1);
            List<String> listM242c1 = new ArrayList<String>();

            listM242c1.add("");
            listM242c1.add("1-সাবান এবং পানি");
            listM242c1.add("2-ছাই এবং পানি");
            listM242c1.add("3-কাদা এবং পানি");
            listM242c1.add("4-শুধু মাত্র পানি");
            listM242c1.add("7-অন্যান্য");
            ArrayAdapter<String> adptrM242c1= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM242c1);
            spnM242c1.setAdapter(adptrM242c1);

            spnM242c1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnM242c1.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnM242c1.getSelectedItem().toString(),"-");
                    if(spnData.equalsIgnoreCase("7"))
                    {
                        secM242c1X.setVisibility(View.VISIBLE);
                        lineM242c1X.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        secM242c1X.setVisibility(View.GONE);
                        lineM242c1X.setVisibility(View.GONE);
                        txtM242c1X.setText(null);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secM242c1X=(LinearLayout)findViewById(R.id.secM242c1X);
            lineM242c1X=(View)findViewById(R.id.lineM242c1X);
            VlblM242c1X=(TextView) findViewById(R.id.VlblM242c1X);
            txtM242c1X=(EditText) findViewById(R.id.txtM242c1X);
            secM242d=(LinearLayout)findViewById(R.id.secM242d);
            lineM242d=(View)findViewById(R.id.lineM242d);
            VlblM242d = (TextView) findViewById(R.id.VlblM242d);
            rdogrpM242d = (RadioGroup) findViewById(R.id.rdogrpM242d);

            rdoM242d1 = (RadioButton) findViewById(R.id.rdoM242d1);
            rdoM242d2 = (RadioButton) findViewById(R.id.rdoM242d2);
            rdogrpM242d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpM242d = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpM242d.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpM242d.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpM242d[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secM242d1.setVisibility(View.GONE);
                        lineM242d1.setVisibility(View.GONE);
                        spnM242d1.setSelection(0);
                        secM242d1X.setVisibility(View.GONE);
                        lineM242d1X.setVisibility(View.GONE);
                        txtM242d1X.setText("");
                    }
                    else
                    {
                        secM242d1.setVisibility(View.VISIBLE);
                        lineM242d1.setVisibility(View.VISIBLE);
                     //   secM242d1X.setVisibility(View.VISIBLE);
                     //   lineM242d1X.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secM242d1=(LinearLayout)findViewById(R.id.secM242d1);
            lineM242d1=(View)findViewById(R.id.lineM242d1);
            VlblM242d1=(TextView) findViewById(R.id.VlblM242d1);
            spnM242d1=(Spinner) findViewById(R.id.spnM242d1);
            List<String> listM242d1 = new ArrayList<String>();

            listM242d1.add("");
            listM242d1.add("1-সাবান এবং পানি");
            listM242d1.add("2-ছাই এবং পানি");
            listM242d1.add("3-কাদা এবং পানি");
            listM242d1.add("4-শুধু মাত্র পানি");
            listM242d1.add("7-অন্যান্য");
            ArrayAdapter<String> adptrM242d1= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM242d1);
            spnM242d1.setAdapter(adptrM242d1);

            spnM242d1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnM242d1.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnM242d1.getSelectedItem().toString(),"-");
                    if(spnData.equalsIgnoreCase("7"))
                    {
                        secM242d1X.setVisibility(View.VISIBLE);
                        lineM242d1X.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        secM242d1X.setVisibility(View.GONE);
                        lineM242d1X.setVisibility(View.GONE);
                        txtM242d1X.setText(null);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secM242d1X=(LinearLayout)findViewById(R.id.secM242d1X);
            lineM242d1X=(View)findViewById(R.id.lineM242d1X);
            VlblM242d1X=(TextView) findViewById(R.id.VlblM242d1X);
            txtM242d1X=(EditText) findViewById(R.id.txtM242d1X);
            secM242e=(LinearLayout)findViewById(R.id.secM242e);
            lineM242e=(View)findViewById(R.id.lineM242e);
            VlblM242e = (TextView) findViewById(R.id.VlblM242e);
            rdogrpM242e = (RadioGroup) findViewById(R.id.rdogrpM242e);

            rdoM242e1 = (RadioButton) findViewById(R.id.rdoM242e1);
            rdoM242e2 = (RadioButton) findViewById(R.id.rdoM242e2);
            rdogrpM242e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpM242e = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpM242e.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpM242e.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpM242e[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secM242e1.setVisibility(View.GONE);
                        lineM242e1.setVisibility(View.GONE);
                        spnM242e1.setSelection(0);
                        secM242e1X.setVisibility(View.GONE);
                        lineM242e1X.setVisibility(View.GONE);
                        txtM242e1X.setText("");
                    }
                    else
                    {
                        secM242e1.setVisibility(View.VISIBLE);
                        lineM242e1.setVisibility(View.VISIBLE);
                       // secM242e1X.setVisibility(View.VISIBLE);
                       // lineM242e1X.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secM242e1=(LinearLayout)findViewById(R.id.secM242e1);
            lineM242e1=(View)findViewById(R.id.lineM242e1);
            VlblM242e1=(TextView) findViewById(R.id.VlblM242e1);
            spnM242e1=(Spinner) findViewById(R.id.spnM242e1);
            List<String> listM242e1 = new ArrayList<String>();

            listM242e1.add("");
            listM242e1.add("1-সাবান এবং পানি");
            listM242e1.add("2-ছাই এবং পানি");
            listM242e1.add("3-কাদা এবং পানি");
            listM242e1.add("4-শুধু মাত্র পানি");
            listM242e1.add("7-অন্যান্য");
            ArrayAdapter<String> adptrM242e1= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM242e1);
            spnM242e1.setAdapter(adptrM242e1);

            spnM242e1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnM242e1.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnM242e1.getSelectedItem().toString(),"-");
                    if(spnData.equalsIgnoreCase("7"))
                    {
                        secM242e1X.setVisibility(View.VISIBLE);
                        lineM242e1X.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        secM242e1X.setVisibility(View.GONE);
                        lineM242e1X.setVisibility(View.GONE);
                        txtM242e1X.setText(null);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secM242e1X=(LinearLayout)findViewById(R.id.secM242e1X);
            lineM242e1X=(View)findViewById(R.id.lineM242e1X);
            VlblM242e1X=(TextView) findViewById(R.id.VlblM242e1X);
            txtM242e1X=(EditText) findViewById(R.id.txtM242e1X);
            secM242f=(LinearLayout)findViewById(R.id.secM242f);
            lineM242f=(View)findViewById(R.id.lineM242f);
            VlblM242f = (TextView) findViewById(R.id.VlblM242f);
            rdogrpM242f = (RadioGroup) findViewById(R.id.rdogrpM242f);

            rdoM242f1 = (RadioButton) findViewById(R.id.rdoM242f1);
            rdoM242f2 = (RadioButton) findViewById(R.id.rdoM242f2);
            rdogrpM242f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpM242f = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpM242f.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpM242f.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpM242f[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secM242f1.setVisibility(View.GONE);
                        lineM242f1.setVisibility(View.GONE);
                        spnM242f1.setSelection(0);
                        secM242f1X.setVisibility(View.GONE);
                        lineM242f1X.setVisibility(View.GONE);
                        txtM242f1X.setText("");
                    }
                    else
                    {
                        secM242f1.setVisibility(View.VISIBLE);
                        lineM242f1.setVisibility(View.VISIBLE);
                     //   secM242f1X.setVisibility(View.VISIBLE);
                     //   lineM242f1X.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secM242f1=(LinearLayout)findViewById(R.id.secM242f1);
            lineM242f1=(View)findViewById(R.id.lineM242f1);
            VlblM242f1=(TextView) findViewById(R.id.VlblM242f1);
            spnM242f1=(Spinner) findViewById(R.id.spnM242f1);
            List<String> listM242f1 = new ArrayList<String>();

            listM242f1.add("");
            listM242f1.add("1-সাবান এবং পানি");
            listM242f1.add("2-ছাই এবং পানি");
            listM242f1.add("3-কাদা এবং পানি");
            listM242f1.add("4-শুধু মাত্র পানি");
            listM242f1.add("7-অন্যান্য");
            ArrayAdapter<String> adptrM242f1= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM242f1);
            spnM242f1.setAdapter(adptrM242f1);

            spnM242f1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnM242f1.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnM242f1.getSelectedItem().toString(),"-");
                    if(spnData.equalsIgnoreCase("7"))
                    {
                        secM242f1X.setVisibility(View.VISIBLE);
                        lineM242f1X.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        secM242f1X.setVisibility(View.GONE);
                        lineM242f1X.setVisibility(View.GONE);
                        txtM242f1X.setText(null);

                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secM242f1X=(LinearLayout)findViewById(R.id.secM242f1X);
            lineM242f1X=(View)findViewById(R.id.lineM242f1X);
            VlblM242f1X=(TextView) findViewById(R.id.VlblM242f1X);
            txtM242f1X=(EditText) findViewById(R.id.txtM242f1X);
            secM242g=(LinearLayout)findViewById(R.id.secM242g);
            lineM242g=(View)findViewById(R.id.lineM242g);
            VlblM242g = (TextView) findViewById(R.id.VlblM242g);
            rdogrpM242g = (RadioGroup) findViewById(R.id.rdogrpM242g);

            rdoM242g1 = (RadioButton) findViewById(R.id.rdoM242g1);
            rdoM242g2 = (RadioButton) findViewById(R.id.rdoM242g2);
            rdogrpM242g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup radioGroup,int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpM242g = new String[] {"1","0"};
                    for (int i = 0; i < rdogrpM242g.getChildCount(); i++)
                    {
                        rb = (RadioButton)rdogrpM242g.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpM242g[i];
                    }

                    if(rbData.equalsIgnoreCase("0"))
                    {
                        secM242g1.setVisibility(View.GONE);
                        lineM242g1.setVisibility(View.GONE);
                        spnM242g1.setSelection(0);
                        txtM242g1X.setText(null);
                    }
                    else
                    {
                        secM242g1.setVisibility(View.VISIBLE);
                        lineM242g1.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secM242g1=(LinearLayout)findViewById(R.id.secM242g1);
            lineM242g1=(View)findViewById(R.id.lineM242g1);
            VlblM242g1=(TextView) findViewById(R.id.VlblM242g1);
            spnM242g1=(Spinner) findViewById(R.id.spnM242g1);
            List<String> listM242g1 = new ArrayList<String>();

            listM242g1.add("");
            listM242g1.add("1-সাবান এবং পানি");
            listM242g1.add("2-ছাই এবং পানি");
            listM242g1.add("3-কাদা এবং পানি");
            listM242g1.add("4-শুধু মাত্র পানি");
            listM242g1.add("7-অন্যান্য");
            ArrayAdapter<String> adptrM242g1= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM242g1);
            spnM242g1.setAdapter(adptrM242g1);

            spnM242g1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnM242g1.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnM242g1.getSelectedItem().toString(),"-");
                    if(spnData.equalsIgnoreCase("7"))
                    {
                        secM242g1X.setVisibility(View.VISIBLE);
                        lineM242g1X.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        secM242g1X.setVisibility(View.GONE);
                        lineM242g1X.setVisibility(View.GONE);
                        //txtM242gX.setText(null);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secM242g1X=(LinearLayout)findViewById(R.id.secM242g1X);
            lineM242g1X=(View)findViewById(R.id.lineM242g1X);
            VlblM242g1X=(TextView) findViewById(R.id.VlblM242g1X);
            txtM242g1X=(EditText) findViewById(R.id.txtM242g1X);





            //Hide all skip variables
            secM241gX.setVisibility(View.GONE);
           // secM241h.setVisibility(View.GONE);
            secM242a1.setVisibility(View.GONE);
            secM242a1X.setVisibility(View.GONE);
            secM242a1X.setVisibility(View.GONE);
            secM242b1.setVisibility(View.GONE);
            secM242b1X.setVisibility(View.GONE);
            secM242b1X.setVisibility(View.GONE);
            secM242c1.setVisibility(View.GONE);
            secM242c1X.setVisibility(View.GONE);
            secM242c1X.setVisibility(View.GONE);
            secM242d1.setVisibility(View.GONE);
            secM242d1X.setVisibility(View.GONE);
            secM242d1X.setVisibility(View.GONE);
            secM242e1.setVisibility(View.GONE);
            secM242e1X.setVisibility(View.GONE);
            secM242e1X.setVisibility(View.GONE);
            secM242f1.setVisibility(View.GONE);
            secM242f1X.setVisibility(View.GONE);
            secM242f1X.setVisibility(View.GONE);
            secM242g1.setVisibility(View.GONE);
            secM242g1X.setVisibility(View.GONE);
            txtRnd.setText(RND);
            txtSuchanaID.setText(SUCHANAID);
            txtRnd.setEnabled(false);
            txtSuchanaID.setEnabled(false);

            DataSearch(RND,SUCHANAID);

            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }});
        }
        catch(Exception  e)
        {
            Connection.MessageBox(HandWash.this, e.getMessage());
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
                Connection.MessageBox(HandWash.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            }
            else if(Integer.valueOf(txtRnd.getText().toString().length()==0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length()==0 ? "5" : txtRnd.getText().toString()) > 5)
            {
                Connection.MessageBox(HandWash.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            }
            else if(txtSuchanaID.getText().toString().length()==0 & secSuchanaID.isShown())
            {
                Connection.MessageBox(HandWash.this, "Required field: উপকারভোগী সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            }
            else if(txtSuchanaID.getText().toString().length()==0)
            {
                Connection.MessageBox(HandWash.this, "Value should be between 1 and 999999999999(উপকারভোগী সদস্য আইডি).");
                txtSuchanaID.requestFocus();
                return;
            }

            else if(txtM241gX.getText().toString().length()==0 & secM241gX.isShown())
            {
                Connection.MessageBox(HandWash.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtM241gX.requestFocus();
                return;
            }

            else if(!rdoM242a1.isChecked() & !rdoM242a2.isChecked() & secM242a.isShown())
            {
                Connection.MessageBox(HandWash.this, "Select anyone options from (রান্নার পূর্বে হাত ধৌত করেন).");
                rdoM242a1.requestFocus();
                return;
            }
            else if(spnM242a1.getSelectedItemPosition()==0  & secM242a1.isShown())
            {
                Connection.MessageBox(HandWash.this, "Required field: আপনি কি ভাবে হাত ধৌত করেন.");
                spnM242a1.requestFocus();
                return;
            }
            else if(txtM242a1X.getText().toString().length()==0 & secM242a1X.isShown())
            {
                Connection.MessageBox(HandWash.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtM242a1X.requestFocus();
                return;
            }

            else if(!rdoM242b1.isChecked() & !rdoM242b2.isChecked() & secM242b.isShown())
            {
                Connection.MessageBox(HandWash.this, "Select anyone options from (শিশুকে খাওয়ানোর পূর্বে হাত ধৌত করেন).");
                rdoM242b1.requestFocus();
                return;
            }
            else if(spnM242b1.getSelectedItemPosition()==0  & secM242b1.isShown())
            {
                Connection.MessageBox(HandWash.this, "Required field: আপনি কি ভাবে হাত ধৌত করেন.");
                spnM242b1.requestFocus();
                return;
            }
            else if(txtM242b1X.getText().toString().length()==0 & secM242b1X.isShown())
            {
                Connection.MessageBox(HandWash.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtM242b1X.requestFocus();
                return;
            }

            else if(!rdoM242c1.isChecked() & !rdoM242c2.isChecked() & secM242c.isShown())
            {
                Connection.MessageBox(HandWash.this, "Select anyone options from (খাদ্য গ্রহনের পূর্বে হাত ধৌত করেন).");
                rdoM242c1.requestFocus();
                return;
            }
            else if(spnM242c1.getSelectedItemPosition()==0  & secM242c1.isShown())
            {
                Connection.MessageBox(HandWash.this, "Required field: আপনি কি ভাবে হাত ধৌত করেন.");
                spnM242c1.requestFocus();
                return;
            }
            else if(txtM242c1X.getText().toString().length()==0 & secM242c1X.isShown())
            {
                Connection.MessageBox(HandWash.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtM242c1X.requestFocus();
                return;
            }

            else if(!rdoM242d1.isChecked() & !rdoM242d2.isChecked() & secM242d.isShown())
            {
                Connection.MessageBox(HandWash.this, "Select anyone options from (শিশুর নিম্নাঙ্গ পরিষ্কার করার পর হাত ধৌত করেন).");
                rdoM242d1.requestFocus();
                return;
            }
            else if(spnM242d1.getSelectedItemPosition()==0  & secM242d1.isShown())
            {
                Connection.MessageBox(HandWash.this, "Required field: আপনি কি ভাবে হাত ধৌত করেন.");
                spnM242d1.requestFocus();
                return;
            }
            else if(txtM242d1X.getText().toString().length()==0 & secM242d1X.isShown())
            {
                Connection.MessageBox(HandWash.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtM242d1X.requestFocus();
                return;
            }

            else if(!rdoM242e1.isChecked() & !rdoM242e2.isChecked() & secM242e.isShown())
            {
                Connection.MessageBox(HandWash.this, "Select anyone options from (পায়খানা করার পর হাত ধৌত করেন).");
                rdoM242e1.requestFocus();
                return;
            }
            else if(spnM242e1.getSelectedItemPosition()==0  & secM242e1.isShown())
            {
                Connection.MessageBox(HandWash.this, "Required field: আপনি কি ভাবে হাত ধৌত করেন.");
                spnM242e1.requestFocus();
                return;
            }
            else if(txtM242e1X.getText().toString().length()==0 & secM242e1X.isShown())
            {
                Connection.MessageBox(HandWash.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtM242e1X.requestFocus();
                return;
            }

            else if(!rdoM242f1.isChecked() & !rdoM242f2.isChecked() & secM242f.isShown())
            {
                Connection.MessageBox(HandWash.this, "Select anyone options from (পশুপাখি ধরার পর অথবা তাদের মলমুত্র পরিষ্কারের পর হাত ধৌত করেন).");
                rdoM242f1.requestFocus();
                return;
            }
            else if(spnM242f1.getSelectedItemPosition()==0  & secM242f1.isShown())
            {
                Connection.MessageBox(HandWash.this, "Required field: আপনি কি ভাবে হাত ধৌত করেন.");
                spnM242f1.requestFocus();
                return;
            }
            else if(txtM242f1X.getText().toString().length()==0 & secM242f1X.isShown())
            {
                Connection.MessageBox(HandWash.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtM242f1X.requestFocus();
                return;
            }

            else if(!rdoM242g1.isChecked() & !rdoM242g2.isChecked() & secM242g.isShown())
            {
                Connection.MessageBox(HandWash.this, "Select anyone options from (খাবার পরিবেসনের পূর্বে হাত ধৌত করেন).");
                rdoM242g1.requestFocus();
                return;
            }
            else if(spnM242g1.getSelectedItemPosition()==0  & secM242g1.isShown())
            {
                Connection.MessageBox(HandWash.this, "Required field: আপনি কি ভাবে হাত ধৌত করেন.");
                spnM242g1.requestFocus();
                return;
            }
            else if(txtM242g1X.getText().toString().length()==0 & secM242g1X.isShown())
            {
                Connection.MessageBox(HandWash.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtM242g1X.requestFocus();
                return;
            }
            else if (secM241a.isShown() & (!chkM241a.isChecked() &
                    !chkM241b.isChecked() &
                    !chkM241c.isChecked() &
                    !chkM241d.isChecked() &
                    !chkM241e.isChecked() &
                    !chkM241f.isChecked() &
                    !chkM241g.isChecked() &
                    !chkM241h.isChecked() &
                    !chkM241i.isChecked())) {
                Connection.MessageBox(HandWash.this,"Required field: M2.4.1 CheckList থেকে কমপক্ষে একটি অপশন সিলেক্ট করুন ");
                chkM241a.requestFocus();
                return;
            }
            if((chkM241i.isChecked()==true) &&(chkM241a.isChecked()==true || chkM241b.isChecked()==true|| chkM241c.isChecked()==true|| chkM241d.isChecked()==true|| chkM241e.isChecked()==true|| chkM241f.isChecked()==true|| chkM241g.isChecked()==true))
            {
                Connection.MessageBox(HandWash.this, "Inconsistent value between M24.1A to I");
                return;
            }

            String SQL = "";
            RadioButton rb;

            HandWash_DataModel objSave = new HandWash_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());

            objSave.setM241a((chkM241a.isChecked()?"1":"2"));
            objSave.setM241b((chkM241b.isChecked()?"1":"2"));
            objSave.setM241c((chkM241c.isChecked()?"1":"2"));
            objSave.setM241d((chkM241d.isChecked()?"1":"2"));
            objSave.setM241e((chkM241e.isChecked()?"1":"2"));
            objSave.setM241f((chkM241f.isChecked()?"1":"2"));
            objSave.setM241g((chkM241g.isChecked()?"1":"2"));
            objSave.setM241gX(txtM241gX.getText().toString());
            objSave.setM241h((chkM241h.isChecked()?"1":"2"));
            objSave.setM241i((chkM241i.isChecked()?"1":"2"));
            String[] d_rdogrpM242a = new String[] {"1","0"};
            objSave.setM242a("");
            for (int i = 0; i < rdogrpM242a.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpM242a.getChildAt(i);
                if (rb.isChecked()) objSave.setM242a(d_rdogrpM242a[i]);
            }

            objSave.setM242a1((spnM242a1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM242a1.getSelectedItem().toString(), "-")));
            objSave.setM242a1X(txtM242a1X.getText().toString());
            String[] d_rdogrpM242b = new String[] {"1","0"};
            objSave.setM242b("");
            for (int i = 0; i < rdogrpM242b.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpM242b.getChildAt(i);
                if (rb.isChecked()) objSave.setM242b(d_rdogrpM242b[i]);
            }

            objSave.setM242b1((spnM242b1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM242b1.getSelectedItem().toString(), "-")));
            objSave.setM242b1X(txtM242b1X.getText().toString());
            String[] d_rdogrpM242c = new String[] {"1","0"};
            objSave.setM242c("");
            for (int i = 0; i < rdogrpM242c.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpM242c.getChildAt(i);
                if (rb.isChecked()) objSave.setM242c(d_rdogrpM242c[i]);
            }

            objSave.setM242c1((spnM242c1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM242c1.getSelectedItem().toString(), "-")));
            objSave.setM242c1X(txtM242c1X.getText().toString());
            String[] d_rdogrpM242d = new String[] {"1","0"};
            objSave.setM242d("");
            for (int i = 0; i < rdogrpM242d.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpM242d.getChildAt(i);
                if (rb.isChecked()) objSave.setM242d(d_rdogrpM242d[i]);
            }

            objSave.setM242d1((spnM242d1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM242d1.getSelectedItem().toString(), "-")));
            objSave.setM242d1X(txtM242d1X.getText().toString());
            String[] d_rdogrpM242e = new String[] {"1","0"};
            objSave.setM242e("");
            for (int i = 0; i < rdogrpM242e.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpM242e.getChildAt(i);
                if (rb.isChecked()) objSave.setM242e(d_rdogrpM242e[i]);
            }

            objSave.setM242e1((spnM242e1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM242e1.getSelectedItem().toString(), "-")));
            objSave.setM242e1X(txtM242e1X.getText().toString());
            String[] d_rdogrpM242f = new String[] {"1","0"};
            objSave.setM242f("");
            for (int i = 0; i < rdogrpM242f.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpM242f.getChildAt(i);
                if (rb.isChecked()) objSave.setM242f(d_rdogrpM242f[i]);
            }

            objSave.setM242f1((spnM242f1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM242f1.getSelectedItem().toString(), "-")));
            objSave.setM242f1X(txtM242f1X.getText().toString());
            String[] d_rdogrpM242g = new String[] {"1","0"};
            objSave.setM242g("");
            for (int i = 0; i < rdogrpM242g.getChildCount(); i++)
            {
                rb = (RadioButton)rdogrpM242g.getChildAt(i);
                if (rb.isChecked()) objSave.setM242g(d_rdogrpM242g[i]);
            }

            objSave.setM242g1((spnM242g1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM242g1.getSelectedItem().toString(), "-")));
            objSave.setM242g1X(txtM242g1X.getText().toString());
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
                IDBundle.putString("SuchanaID", txtSuchanaID.getText().toString());
                startActivity(new Intent(HandWash.this, NutHealth.class).putExtras(IDBundle));

            }
            else{
                Connection.MessageBox(HandWash.this, status);
                return;
            }
        }
        catch(Exception  e)
        {
            Connection.MessageBox(HandWash.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID)
    {
        try
        {

            RadioButton rb;
            HandWash_DataModel d = new HandWash_DataModel();
            String SQL = "Select * from "+ TableName +"  Where Rnd='"+ Rnd +"' and SuchanaID='"+ SuchanaID +"'";
            List<HandWash_DataModel> data = d.SelectAll(this, SQL);
            for(HandWash_DataModel item : data){
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());

                if(item.getM241a().equals("1"))
                {
                    chkM241a.setChecked(true);
                }
                else if(item.getM241a().equals("2"))
                {
                    chkM241a.setChecked(false);
                }
                if(item.getM241b().equals("1"))
                {
                    chkM241b.setChecked(true);
                }
                else if(item.getM241b().equals("2"))
                {
                    chkM241b.setChecked(false);
                }
                if(item.getM241c().equals("1"))
                {
                    chkM241c.setChecked(true);
                }
                else if(item.getM241c().equals("2"))
                {
                    chkM241c.setChecked(false);
                }
                if(item.getM241d().equals("1"))
                {
                    chkM241d.setChecked(true);
                }
                else if(item.getM241d().equals("2"))
                {
                    chkM241d.setChecked(false);
                }
                if(item.getM241e().equals("1"))
                {
                    chkM241e.setChecked(true);
                }
                else if(item.getM241e().equals("2"))
                {
                    chkM241e.setChecked(false);
                }
                if(item.getM241f().equals("1"))
                {
                    chkM241f.setChecked(true);
                }
                else if(item.getM241f().equals("2"))
                {
                    chkM241f.setChecked(false);
                }
                if(item.getM241g().equals("1"))
                {
                    chkM241g.setChecked(true);
                }
                else if(item.getM241g().equals("2"))
                {
                    chkM241g.setChecked(false);
                }
                txtM241gX.setText(item.getM241gX());
                if(item.getM241h().equals("1"))
                {
                    chkM241h.setChecked(true);
                }
                else if(item.getM241h().equals("2"))
                {
                    chkM241h.setChecked(false);
                }
                if(item.getM241i().equals("1"))
                {
                    chkM241i.setChecked(true);
                }
                else if(item.getM241i().equals("2"))
                {
                    chkM241i.setChecked(false);
                }
                String[] d_rdogrpM242a = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpM242a.length; i++)
                {
                    if (item.getM242a().equals(String.valueOf(d_rdogrpM242a[i])))
                    {
                        rb = (RadioButton)rdogrpM242a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnM242a1.setSelection(Global.SpinnerItemPositionAnyLength(spnM242a1, item.getM242a1()));
                txtM242a1X.setText(item.getM242a1X());
                String[] d_rdogrpM242b = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpM242b.length; i++)
                {
                    if (item.getM242b().equals(String.valueOf(d_rdogrpM242b[i])))
                    {
                        rb = (RadioButton)rdogrpM242b.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnM242b1.setSelection(Global.SpinnerItemPositionAnyLength(spnM242b1, item.getM242b1()));
                txtM242b1X.setText(item.getM242b1X());
                String[] d_rdogrpM242c = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpM242c.length; i++)
                {
                    if (item.getM242c().equals(String.valueOf(d_rdogrpM242c[i])))
                    {
                        rb = (RadioButton)rdogrpM242c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnM242c1.setSelection(Global.SpinnerItemPositionAnyLength(spnM242c1, item.getM242c1()));
                txtM242c1X.setText(item.getM242c1X());
                String[] d_rdogrpM242d = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpM242d.length; i++)
                {
                    if (item.getM242d().equals(String.valueOf(d_rdogrpM242d[i])))
                    {
                        rb = (RadioButton)rdogrpM242d.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnM242d1.setSelection(Global.SpinnerItemPositionAnyLength(spnM242d1, item.getM242d1()));
                txtM242d1X.setText(item.getM242d1X());
                String[] d_rdogrpM242e = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpM242e.length; i++)
                {
                    if (item.getM242e().equals(String.valueOf(d_rdogrpM242e[i])))
                    {
                        rb = (RadioButton)rdogrpM242e.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnM242e1.setSelection(Global.SpinnerItemPositionAnyLength(spnM242e1, item.getM242e1()));
                txtM242e1X.setText(item.getM242e1X());
                String[] d_rdogrpM242f = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpM242f.length; i++)
                {
                    if (item.getM242f().equals(String.valueOf(d_rdogrpM242f[i])))
                    {
                        rb = (RadioButton)rdogrpM242f.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnM242f1.setSelection(Global.SpinnerItemPositionAnyLength(spnM242f1, item.getM242f1()));
                txtM242f1X.setText(item.getM242f1X());
                String[] d_rdogrpM242g = new String[] {"1","0"};
                for (int i = 0; i < d_rdogrpM242g.length; i++)
                {
                    if (item.getM242g().equals(String.valueOf(d_rdogrpM242g[i])))
                    {
                        rb = (RadioButton)rdogrpM242g.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnM242g1.setSelection(Global.SpinnerItemPositionAnyLength(spnM242g1, item.getM242g1()));
                txtM242g1X.setText(item.getM242g1X());
            }
        }
        catch(Exception  e)
        {
            Connection.MessageBox(HandWash.this, e.getMessage());
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