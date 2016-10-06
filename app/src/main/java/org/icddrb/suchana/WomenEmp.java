package org.icddrb.suchana;

/**
 * Created by TanvirHossain on 05/10/2016.
 */


//Android Manifest Code
//<activity android:name=".WomenEmp" android:label="WomenEmp" />

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
import android.widget.ArrayAdapter;
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

public class WomenEmp extends Activity {
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
    LinearLayout secM4;
    LinearLayout secRnd;
    View lineRnd;
    TextView VlblRnd;
    EditText txtRnd;
    LinearLayout secSuchanaID;
    View lineSuchanaID;
    TextView VlblSuchanaID;
    EditText txtSuchanaID;
    LinearLayout secM4a;
    LinearLayout secM4b;
    LinearLayout secM4c;
    LinearLayout secM411a;
    View lineM411a;
    TextView VlblM411a;
    RadioGroup rdogrpM411a;
    RadioButton rdoM411a1;
    RadioButton rdoM411a2;
    LinearLayout secM411a1;
    View lineM411a1;
    TextView VlblM411a1;
    Spinner spnM411a1;
    LinearLayout secM411a2;
    View lineM411a2;
    TextView VlblM411a2;
    Spinner spnM411a2;
    LinearLayout secM411b;
    View lineM411b;
    TextView VlblM411b;
    RadioGroup rdogrpM411b;
    RadioButton rdoM411b1;
    RadioButton rdoM411b2;
    LinearLayout secM411b1;
    View lineM411b1;
    TextView VlblM411b1;
    Spinner spnM411b1;
    LinearLayout secM411b2;
    View lineM411b2;
    TextView VlblM411b2;
    Spinner spnM411b2;
    LinearLayout secM411c;
    View lineM411c;
    TextView VlblM411c;
    RadioGroup rdogrpM411c;
    RadioButton rdoM411c1;
    RadioButton rdoM411c2;
    LinearLayout secM411c1;
    View lineM411c1;
    TextView VlblM411c1;
    Spinner spnM411c1;
    LinearLayout secM411c2;
    View lineM411c2;
    TextView VlblM411c2;
    Spinner spnM411c2;
    LinearLayout secM411d;
    View lineM411d;
    TextView VlblM411d;
    RadioGroup rdogrpM411d;
    RadioButton rdoM411d1;
    RadioButton rdoM411d2;
    LinearLayout secM411d1;
    View lineM411d1;
    TextView VlblM411d1;
    Spinner spnM411d1;
    LinearLayout secM411d2;
    View lineM411d2;
    TextView VlblM411d2;
    Spinner spnM411d2;
    LinearLayout secM411e;
    View lineM411e;
    TextView VlblM411e;
    RadioGroup rdogrpM411e;
    RadioButton rdoM411e1;
    RadioButton rdoM411e2;
    LinearLayout secM411e1;
    View lineM411e1;
    TextView VlblM411e1;
    Spinner spnM411e1;
    LinearLayout secM411e2;
    View lineM411e2;
    TextView VlblM411e2;
    Spinner spnM411e2;
    LinearLayout secM411f;
    View lineM411f;
    TextView VlblM411f;
    RadioGroup rdogrpM411f;
    RadioButton rdoM411f1;
    RadioButton rdoM411f2;
    LinearLayout secM411f1;
    View lineM411f1;
    TextView VlblM411f1;
    Spinner spnM411f1;
    LinearLayout secM411f2;
    View lineM411f2;
    TextView VlblM411f2;
    Spinner spnM411f2;
    LinearLayout secM411g;
    View lineM411g;
    TextView VlblM411g;
    RadioGroup rdogrpM411g;
    RadioButton rdoM411g1;
    RadioButton rdoM411g2;
    LinearLayout secM411g1;
    View lineM411g1;
    TextView VlblM411g1;
    Spinner spnM411g1;
    LinearLayout secM411g2;
    View lineM411g2;
    TextView VlblM411g2;
    Spinner spnM411g2;
    LinearLayout secM412a;
    View lineM412a;
    TextView VlblM412a;
    RadioGroup rdogrpM412a;
    RadioButton rdoM412a1;
    RadioButton rdoM412a2;
    LinearLayout secM412a1;
    View lineM412a1;
    TextView VlblM412a1;
    Spinner spnM412a1;
    LinearLayout secM412a2;
    View lineM412a2;
    TextView VlblM412a2;
    Spinner spnM412a2;
    LinearLayout secM413a;
    View lineM413a;
    TextView VlblM413a;
    RadioGroup rdogrpM413a;
    RadioButton rdoM413a1;
    RadioButton rdoM413a2;
    LinearLayout secM413a1;
    View lineM413a1;
    TextView VlblM413a1;
    Spinner spnM413a1;
    LinearLayout secM413a2;
    View lineM413a2;
    TextView VlblM413a2;
    Spinner spnM413a2;
    LinearLayout secM414a;
    View lineM414a;
    TextView VlblM414a;
    RadioGroup rdogrpM414a;
    RadioButton rdoM414a1;
    RadioButton rdoM414a2;
    LinearLayout secM414a1;
    View lineM414a1;
    TextView VlblM414a1;
    Spinner spnM414a1;
    LinearLayout secM414a2;
    View lineM414a2;
    TextView VlblM414a2;
    Spinner spnM414a2;
    LinearLayout secM415a;
    View lineM415a;
    TextView VlblM415a;
    RadioGroup rdogrpM415a;
    RadioButton rdoM415a1;
    RadioButton rdoM415a2;
    LinearLayout secM415a1;
    View lineM415a1;
    TextView VlblM415a1;
    Spinner spnM415a1;
    LinearLayout secM415a2;
    View lineM415a2;
    TextView VlblM415a2;
    Spinner spnM415a2;
    LinearLayout secM416a;
    View lineM416a;
    TextView VlblM416a;
    RadioGroup rdogrpM416a;
    RadioButton rdoM416a1;
    RadioButton rdoM416a2;
    LinearLayout secM416a1;
    View lineM416a1;
    TextView VlblM416a1;
    Spinner spnM416a1;
    LinearLayout secM416a2;
    View lineM416a2;
    TextView VlblM416a2;
    Spinner spnM416a2;
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
        if (iKeyCode == KeyEvent.KEYCODE_BACK || iKeyCode == KeyEvent.KEYCODE_HOME) {
            return false;
        } else {
            return true;
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.womenemp);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TableName = "WomenEmp";

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
            cmdForward = (ImageButton) findViewById(R.id.cmdForward);
            cmdForward.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(WomenEmp.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to start AssetB [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDBundle = new Bundle();
                            IDBundle.putString("Rnd", RND);
                            IDBundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), DomViolance.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDBundle);
                            getApplicationContext().startActivity(intent);
                            finish();
                        }
                    });
                    adb.show();
                }
            });
            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(WomenEmp.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), NutHealth.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDbundle);
                            getApplicationContext().startActivity(intent);
                            finish();
                        }
                    });
                    adb.show();
                }
            });


            secM4 = (LinearLayout) findViewById(R.id.secM4);
            secRnd = (LinearLayout) findViewById(R.id.secRnd);
            lineRnd = (View) findViewById(R.id.lineRnd);
            VlblRnd = (TextView) findViewById(R.id.VlblRnd);
            txtRnd = (EditText) findViewById(R.id.txtRnd);
            txtRnd.setText(RND);
            txtRnd.setEnabled(false);

            secSuchanaID = (LinearLayout) findViewById(R.id.secSuchanaID);
            lineSuchanaID = (View) findViewById(R.id.lineSuchanaID);
            VlblSuchanaID = (TextView) findViewById(R.id.VlblSuchanaID);
            txtSuchanaID = (EditText) findViewById(R.id.txtSuchanaID);
            txtSuchanaID.setText(SUCHANAID);
            txtSuchanaID.setEnabled(false);

            secM4a = (LinearLayout) findViewById(R.id.secM4a);
            secM4b = (LinearLayout) findViewById(R.id.secM4b);
            secM4c = (LinearLayout) findViewById(R.id.secM4c);
            secM411a = (LinearLayout) findViewById(R.id.secM411a);
            lineM411a = (View) findViewById(R.id.lineM411a);
            VlblM411a = (TextView) findViewById(R.id.VlblM411a);
            rdogrpM411a = (RadioGroup) findViewById(R.id.rdogrpM411a);

            rdoM411a1 = (RadioButton) findViewById(R.id.rdoM411a1);
            rdoM411a2 = (RadioButton) findViewById(R.id.rdoM411a2);
            secM411a1 = (LinearLayout) findViewById(R.id.secM411a1);
            lineM411a1 = (View) findViewById(R.id.lineM411a1);
            VlblM411a1 = (TextView) findViewById(R.id.VlblM411a1);
            spnM411a1 = (Spinner) findViewById(R.id.spnM411a1);
            List<String> listM411a1 = new ArrayList<String>();

            listM411a1.add("");
            listM411a1.add("01-নিজে");
            listM411a1.add("02-স্বামী");
            listM411a1.add("03-খানার অন্য কেউ");
            listM411a1.add("04-খানায় থাকেনা এমন কেউ");
            listM411a1.add("05-যৌথ (স্বামী/স্ত্রী)");
            ArrayAdapter<String> adptrM411a1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM411a1);
            spnM411a1.setAdapter(adptrM411a1);

            secM411a2 = (LinearLayout) findViewById(R.id.secM411a2);
            lineM411a2 = (View) findViewById(R.id.lineM411a2);
            VlblM411a2 = (TextView) findViewById(R.id.VlblM411a2);
            spnM411a2 = (Spinner) findViewById(R.id.spnM411a2);
            List<String> listM411a2 = new ArrayList<String>();

            listM411a2.add("");
            listM411a2.add("01-মোটেও গুরুত্বপূর্ণ না");
            listM411a2.add("02-অল্প কিছু ব্যাপারে গুরুত্বপূর্ণ");
            listM411a2.add("03-কিছু কিছু ব্যাপারে গুরুত্বপূর্ণ");
            listM411a2.add("04- প্রায় সব ব্যাপারে গুরুত্বপূর্ণ");
            ArrayAdapter<String> adptrM411a2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM411a2);
            spnM411a2.setAdapter(adptrM411a2);

            secM411b = (LinearLayout) findViewById(R.id.secM411b);
            lineM411b = (View) findViewById(R.id.lineM411b);
            VlblM411b = (TextView) findViewById(R.id.VlblM411b);
            rdogrpM411b = (RadioGroup) findViewById(R.id.rdogrpM411b);

            rdoM411b1 = (RadioButton) findViewById(R.id.rdoM411b1);
            rdoM411b2 = (RadioButton) findViewById(R.id.rdoM411b2);
            secM411b1 = (LinearLayout) findViewById(R.id.secM411b1);
            lineM411b1 = (View) findViewById(R.id.lineM411b1);
            VlblM411b1 = (TextView) findViewById(R.id.VlblM411b1);
            spnM411b1 = (Spinner) findViewById(R.id.spnM411b1);
            List<String> listM411b1 = new ArrayList<String>();

            listM411b1.add("");
            listM411b1.add("01-নিজে");
            listM411b1.add("02-স্বামী");
            listM411b1.add("03-খানার অন্য কেউ");
            listM411b1.add("04-খানায় থাকেনা এমন কেউ");
            listM411b1.add("05-যৌথ (স্বামী/স্ত্রী)");
            ArrayAdapter<String> adptrM411b1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM411b1);
            spnM411b1.setAdapter(adptrM411b1);

            secM411b2 = (LinearLayout) findViewById(R.id.secM411b2);
            lineM411b2 = (View) findViewById(R.id.lineM411b2);
            VlblM411b2 = (TextView) findViewById(R.id.VlblM411b2);
            spnM411b2 = (Spinner) findViewById(R.id.spnM411b2);
            List<String> listM411b2 = new ArrayList<String>();

            listM411b2.add("");
            listM411b2.add("01-মোটেও গুরুত্বপূর্ণ না");
            listM411b2.add("02-অল্প কিছু ব্যাপারে গুরুত্বপূর্ণ");
            listM411b2.add("03-কিছু কিছু ব্যাপারে গুরুত্বপূর্ণ");
            listM411b2.add("04- প্রায় সব ব্যাপারে গুরুত্বপূর্ণ");
            ArrayAdapter<String> adptrM411b2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM411b2);
            spnM411b2.setAdapter(adptrM411b2);

            secM411c = (LinearLayout) findViewById(R.id.secM411c);
            lineM411c = (View) findViewById(R.id.lineM411c);
            VlblM411c = (TextView) findViewById(R.id.VlblM411c);
            rdogrpM411c = (RadioGroup) findViewById(R.id.rdogrpM411c);

            rdoM411c1 = (RadioButton) findViewById(R.id.rdoM411c1);
            rdoM411c2 = (RadioButton) findViewById(R.id.rdoM411c2);
            secM411c1 = (LinearLayout) findViewById(R.id.secM411c1);
            lineM411c1 = (View) findViewById(R.id.lineM411c1);
            VlblM411c1 = (TextView) findViewById(R.id.VlblM411c1);
            spnM411c1 = (Spinner) findViewById(R.id.spnM411c1);
            List<String> listM411c1 = new ArrayList<String>();

            listM411c1.add("");
            listM411c1.add("01-নিজে");
            listM411c1.add("02-স্বামী");
            listM411c1.add("03-খানার অন্য কেউ");
            listM411c1.add("04-খানায় থাকেনা এমন কেউ");
            listM411c1.add("05-যৌথ (স্বামী/স্ত্রী)");
            ArrayAdapter<String> adptrM411c1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM411c1);
            spnM411c1.setAdapter(adptrM411c1);

            secM411c2 = (LinearLayout) findViewById(R.id.secM411c2);
            lineM411c2 = (View) findViewById(R.id.lineM411c2);
            VlblM411c2 = (TextView) findViewById(R.id.VlblM411c2);
            spnM411c2 = (Spinner) findViewById(R.id.spnM411c2);
            List<String> listM411c2 = new ArrayList<String>();

            listM411c2.add("");
            listM411c2.add("01-মোটেও গুরুত্বপূর্ণ না");
            listM411c2.add("02-অল্প কিছু ব্যাপারে গুরুত্বপূর্ণ");
            listM411c2.add("03-কিছু কিছু ব্যাপারে গুরুত্বপূর্ণ");
            listM411c2.add("04- প্রায় সব ব্যাপারে গুরুত্বপূর্ণ");
            ArrayAdapter<String> adptrM411c2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM411c2);
            spnM411c2.setAdapter(adptrM411c2);

            secM411d = (LinearLayout) findViewById(R.id.secM411d);
            lineM411d = (View) findViewById(R.id.lineM411d);
            VlblM411d = (TextView) findViewById(R.id.VlblM411d);
            rdogrpM411d = (RadioGroup) findViewById(R.id.rdogrpM411d);

            rdoM411d1 = (RadioButton) findViewById(R.id.rdoM411d1);
            rdoM411d2 = (RadioButton) findViewById(R.id.rdoM411d2);
            secM411d1 = (LinearLayout) findViewById(R.id.secM411d1);
            lineM411d1 = (View) findViewById(R.id.lineM411d1);
            VlblM411d1 = (TextView) findViewById(R.id.VlblM411d1);
            spnM411d1 = (Spinner) findViewById(R.id.spnM411d1);
            List<String> listM411d1 = new ArrayList<String>();

            listM411d1.add("");
            listM411d1.add("01-নিজে");
            listM411d1.add("02-স্বামী");
            listM411d1.add("03-খানার অন্য কেউ");
            listM411d1.add("04-খানায় থাকেনা এমন কেউ");
            listM411d1.add("05-যৌথ (স্বামী/স্ত্রী)");
            ArrayAdapter<String> adptrM411d1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM411d1);
            spnM411d1.setAdapter(adptrM411d1);

            secM411d2 = (LinearLayout) findViewById(R.id.secM411d2);
            lineM411d2 = (View) findViewById(R.id.lineM411d2);
            VlblM411d2 = (TextView) findViewById(R.id.VlblM411d2);
            spnM411d2 = (Spinner) findViewById(R.id.spnM411d2);
            List<String> listM411d2 = new ArrayList<String>();

            listM411d2.add("");
            listM411d2.add("01-মোটেও গুরুত্বপূর্ণ না");
            listM411d2.add("02-অল্প কিছু ব্যাপারে গুরুত্বপূর্ণ");
            listM411d2.add("03-কিছু কিছু ব্যাপারে গুরুত্বপূর্ণ");
            listM411d2.add("04- প্রায় সব ব্যাপারে গুরুত্বপূর্ণ");
            ArrayAdapter<String> adptrM411d2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM411d2);
            spnM411d2.setAdapter(adptrM411d2);

            secM411e = (LinearLayout) findViewById(R.id.secM411e);
            lineM411e = (View) findViewById(R.id.lineM411e);
            VlblM411e = (TextView) findViewById(R.id.VlblM411e);
            rdogrpM411e = (RadioGroup) findViewById(R.id.rdogrpM411e);

            rdoM411e1 = (RadioButton) findViewById(R.id.rdoM411e1);
            rdoM411e2 = (RadioButton) findViewById(R.id.rdoM411e2);
            secM411e1 = (LinearLayout) findViewById(R.id.secM411e1);
            lineM411e1 = (View) findViewById(R.id.lineM411e1);
            VlblM411e1 = (TextView) findViewById(R.id.VlblM411e1);
            spnM411e1 = (Spinner) findViewById(R.id.spnM411e1);
            List<String> listM411e1 = new ArrayList<String>();

            listM411e1.add("");
            listM411e1.add("01-নিজে");
            listM411e1.add("02-স্বামী");
            listM411e1.add("03-খানার অন্য কেউ");
            listM411e1.add("04-খানায় থাকেনা এমন কেউ");
            listM411e1.add("05-যৌথ (স্বামী/স্ত্রী)");
            ArrayAdapter<String> adptrM411e1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM411e1);
            spnM411e1.setAdapter(adptrM411e1);

            secM411e2 = (LinearLayout) findViewById(R.id.secM411e2);
            lineM411e2 = (View) findViewById(R.id.lineM411e2);
            VlblM411e2 = (TextView) findViewById(R.id.VlblM411e2);
            spnM411e2 = (Spinner) findViewById(R.id.spnM411e2);
            List<String> listM411e2 = new ArrayList<String>();

            listM411e2.add("");
            listM411e2.add("01-মোটেও গুরুত্বপূর্ণ না");
            listM411e2.add("02-অল্প কিছু ব্যাপারে গুরুত্বপূর্ণ");
            listM411e2.add("03-কিছু কিছু ব্যাপারে গুরুত্বপূর্ণ");
            listM411e2.add("04- প্রায় সব ব্যাপারে গুরুত্বপূর্ণ");
            ArrayAdapter<String> adptrM411e2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM411e2);
            spnM411e2.setAdapter(adptrM411e2);

            secM411f = (LinearLayout) findViewById(R.id.secM411f);
            lineM411f = (View) findViewById(R.id.lineM411f);
            VlblM411f = (TextView) findViewById(R.id.VlblM411f);
            rdogrpM411f = (RadioGroup) findViewById(R.id.rdogrpM411f);

            rdoM411f1 = (RadioButton) findViewById(R.id.rdoM411f1);
            rdoM411f2 = (RadioButton) findViewById(R.id.rdoM411f2);
            secM411f1 = (LinearLayout) findViewById(R.id.secM411f1);
            lineM411f1 = (View) findViewById(R.id.lineM411f1);
            VlblM411f1 = (TextView) findViewById(R.id.VlblM411f1);
            spnM411f1 = (Spinner) findViewById(R.id.spnM411f1);
            List<String> listM411f1 = new ArrayList<String>();

            listM411f1.add("");
            listM411f1.add("01-নিজে");
            listM411f1.add("02-স্বামী");
            listM411f1.add("03-খানার অন্য কেউ");
            listM411f1.add("04-খানায় থাকেনা এমন কেউ");
            listM411f1.add("05-যৌথ (স্বামী/স্ত্রী)");
            ArrayAdapter<String> adptrM411f1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM411f1);
            spnM411f1.setAdapter(adptrM411f1);

            secM411f2 = (LinearLayout) findViewById(R.id.secM411f2);
            lineM411f2 = (View) findViewById(R.id.lineM411f2);
            VlblM411f2 = (TextView) findViewById(R.id.VlblM411f2);
            spnM411f2 = (Spinner) findViewById(R.id.spnM411f2);
            List<String> listM411f2 = new ArrayList<String>();

            listM411f2.add("");
            listM411f2.add("01-মোটেও গুরুত্বপূর্ণ না");
            listM411f2.add("02-অল্প কিছু ব্যাপারে গুরুত্বপূর্ণ");
            listM411f2.add("03-কিছু কিছু ব্যাপারে গুরুত্বপূর্ণ");
            listM411f2.add("04- প্রায় সব ব্যাপারে গুরুত্বপূর্ণ");
            ArrayAdapter<String> adptrM411f2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM411f2);
            spnM411f2.setAdapter(adptrM411f2);

            secM411g = (LinearLayout) findViewById(R.id.secM411g);
            lineM411g = (View) findViewById(R.id.lineM411g);
            VlblM411g = (TextView) findViewById(R.id.VlblM411g);
            rdogrpM411g = (RadioGroup) findViewById(R.id.rdogrpM411g);

            rdoM411g1 = (RadioButton) findViewById(R.id.rdoM411g1);
            rdoM411g2 = (RadioButton) findViewById(R.id.rdoM411g2);
            secM411g1 = (LinearLayout) findViewById(R.id.secM411g1);
            lineM411g1 = (View) findViewById(R.id.lineM411g1);
            VlblM411g1 = (TextView) findViewById(R.id.VlblM411g1);
            spnM411g1 = (Spinner) findViewById(R.id.spnM411g1);
            List<String> listM411g1 = new ArrayList<String>();

            listM411g1.add("");
            listM411g1.add("01-নিজে");
            listM411g1.add("02-স্বামী");
            listM411g1.add("03-খানার অন্য কেউ");
            listM411g1.add("04-খানায় থাকেনা এমন কেউ");
            listM411g1.add("05-যৌথ (স্বামী/স্ত্রী)");
            ArrayAdapter<String> adptrM411g1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM411g1);
            spnM411g1.setAdapter(adptrM411g1);

            secM411g2 = (LinearLayout) findViewById(R.id.secM411g2);
            lineM411g2 = (View) findViewById(R.id.lineM411g2);
            VlblM411g2 = (TextView) findViewById(R.id.VlblM411g2);
            spnM411g2 = (Spinner) findViewById(R.id.spnM411g2);
            List<String> listM411g2 = new ArrayList<String>();

            listM411g2.add("");
            listM411g2.add("01-মোটেও গুরুত্বপূর্ণ না");
            listM411g2.add("02-অল্প কিছু ব্যাপারে গুরুত্বপূর্ণ");
            listM411g2.add("03-কিছু কিছু ব্যাপারে গুরুত্বপূর্ণ");
            listM411g2.add("04- প্রায় সব ব্যাপারে গুরুত্বপূর্ণ");
            ArrayAdapter<String> adptrM411g2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM411g2);
            spnM411g2.setAdapter(adptrM411g2);

            secM412a = (LinearLayout) findViewById(R.id.secM412a);
            lineM412a = (View) findViewById(R.id.lineM412a);
            VlblM412a = (TextView) findViewById(R.id.VlblM412a);
            rdogrpM412a = (RadioGroup) findViewById(R.id.rdogrpM412a);

            rdoM412a1 = (RadioButton) findViewById(R.id.rdoM412a1);
            rdoM412a2 = (RadioButton) findViewById(R.id.rdoM412a2);
            secM412a1 = (LinearLayout) findViewById(R.id.secM412a1);
            lineM412a1 = (View) findViewById(R.id.lineM412a1);
            VlblM412a1 = (TextView) findViewById(R.id.VlblM412a1);
            spnM412a1 = (Spinner) findViewById(R.id.spnM412a1);
            List<String> listM412a1 = new ArrayList<String>();

            listM412a1.add("");
            listM412a1.add("01-নিজে");
            listM412a1.add("02-স্বামী");
            listM412a1.add("03-খানার অন্য কেউ");
            listM412a1.add("04-খানায় থাকেনা এমন কেউ");
            listM412a1.add("05-যৌথ (স্বামী/স্ত্রী)");
            ArrayAdapter<String> adptrM412a1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM412a1);
            spnM412a1.setAdapter(adptrM412a1);

            secM412a2 = (LinearLayout) findViewById(R.id.secM412a2);
            lineM412a2 = (View) findViewById(R.id.lineM412a2);
            VlblM412a2 = (TextView) findViewById(R.id.VlblM412a2);
            spnM412a2 = (Spinner) findViewById(R.id.spnM412a2);
            List<String> listM412a2 = new ArrayList<String>();

            listM412a2.add("");
            listM412a2.add("01-মোটেও গুরুত্বপূর্ণ না");
            listM412a2.add("02-অল্প কিছু ব্যাপারে গুরুত্বপূর্ণ");
            listM412a2.add("03-কিছু কিছু ব্যাপারে গুরুত্বপূর্ণ");
            listM412a2.add("04- প্রায় সব ব্যাপারে গুরুত্বপূর্ণ");
            ArrayAdapter<String> adptrM412a2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM412a2);
            spnM412a2.setAdapter(adptrM412a2);

            secM413a = (LinearLayout) findViewById(R.id.secM413a);
            lineM413a = (View) findViewById(R.id.lineM413a);
            VlblM413a = (TextView) findViewById(R.id.VlblM413a);
            rdogrpM413a = (RadioGroup) findViewById(R.id.rdogrpM413a);

            rdoM413a1 = (RadioButton) findViewById(R.id.rdoM413a1);
            rdoM413a2 = (RadioButton) findViewById(R.id.rdoM413a2);
            secM413a1 = (LinearLayout) findViewById(R.id.secM413a1);
            lineM413a1 = (View) findViewById(R.id.lineM413a1);
            VlblM413a1 = (TextView) findViewById(R.id.VlblM413a1);
            spnM413a1 = (Spinner) findViewById(R.id.spnM413a1);
            List<String> listM413a1 = new ArrayList<String>();

            listM413a1.add("");
            listM413a1.add("01-নিজে");
            listM413a1.add("02-স্বামী");
            listM413a1.add("03-খানার অন্য কেউ");
            listM413a1.add("04-খানায় থাকেনা এমন কেউ");
            listM413a1.add("05-যৌথ (স্বামী/স্ত্রী)");
            ArrayAdapter<String> adptrM413a1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM413a1);
            spnM413a1.setAdapter(adptrM413a1);

            secM413a2 = (LinearLayout) findViewById(R.id.secM413a2);
            lineM413a2 = (View) findViewById(R.id.lineM413a2);
            VlblM413a2 = (TextView) findViewById(R.id.VlblM413a2);
            spnM413a2 = (Spinner) findViewById(R.id.spnM413a2);
            List<String> listM413a2 = new ArrayList<String>();

            listM413a2.add("");
            listM413a2.add("01-মোটেও গুরুত্বপূর্ণ না");
            listM413a2.add("02-অল্প কিছু ব্যাপারে গুরুত্বপূর্ণ");
            listM413a2.add("03-কিছু কিছু ব্যাপারে গুরুত্বপূর্ণ");
            listM413a2.add("04- প্রায় সব ব্যাপারে গুরুত্বপূর্ণ");
            ArrayAdapter<String> adptrM413a2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM413a2);
            spnM413a2.setAdapter(adptrM413a2);

            secM414a = (LinearLayout) findViewById(R.id.secM414a);
            lineM414a = (View) findViewById(R.id.lineM414a);
            VlblM414a = (TextView) findViewById(R.id.VlblM414a);
            rdogrpM414a = (RadioGroup) findViewById(R.id.rdogrpM414a);

            rdoM414a1 = (RadioButton) findViewById(R.id.rdoM414a1);
            rdoM414a2 = (RadioButton) findViewById(R.id.rdoM414a2);
            secM414a1 = (LinearLayout) findViewById(R.id.secM414a1);
            lineM414a1 = (View) findViewById(R.id.lineM414a1);
            VlblM414a1 = (TextView) findViewById(R.id.VlblM414a1);
            spnM414a1 = (Spinner) findViewById(R.id.spnM414a1);
            List<String> listM414a1 = new ArrayList<String>();

            listM414a1.add("");
            listM414a1.add("01-নিজে");
            listM414a1.add("02-স্বামী");
            listM414a1.add("03-খানার অন্য কেউ");
            listM414a1.add("04-খানায় থাকেনা এমন কেউ");
            listM414a1.add("05-যৌথ (স্বামী/স্ত্রী)");
            ArrayAdapter<String> adptrM414a1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM414a1);
            spnM414a1.setAdapter(adptrM414a1);

            secM414a2 = (LinearLayout) findViewById(R.id.secM414a2);
            lineM414a2 = (View) findViewById(R.id.lineM414a2);
            VlblM414a2 = (TextView) findViewById(R.id.VlblM414a2);
            spnM414a2 = (Spinner) findViewById(R.id.spnM414a2);
            List<String> listM414a2 = new ArrayList<String>();

            listM414a2.add("");
            listM414a2.add("01-মোটেও গুরুত্বপূর্ণ না");
            listM414a2.add("02-অল্প কিছু ব্যাপারে গুরুত্বপূর্ণ");
            listM414a2.add("03-কিছু কিছু ব্যাপারে গুরুত্বপূর্ণ");
            listM414a2.add("04- প্রায় সব ব্যাপারে গুরুত্বপূর্ণ");
            ArrayAdapter<String> adptrM414a2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM414a2);
            spnM414a2.setAdapter(adptrM414a2);

            secM415a = (LinearLayout) findViewById(R.id.secM415a);
            lineM415a = (View) findViewById(R.id.lineM415a);
            VlblM415a = (TextView) findViewById(R.id.VlblM415a);
            rdogrpM415a = (RadioGroup) findViewById(R.id.rdogrpM415a);

            rdoM415a1 = (RadioButton) findViewById(R.id.rdoM415a1);
            rdoM415a2 = (RadioButton) findViewById(R.id.rdoM415a2);
            secM415a1 = (LinearLayout) findViewById(R.id.secM415a1);
            lineM415a1 = (View) findViewById(R.id.lineM415a1);
            VlblM415a1 = (TextView) findViewById(R.id.VlblM415a1);
            spnM415a1 = (Spinner) findViewById(R.id.spnM415a1);
            List<String> listM415a1 = new ArrayList<String>();

            listM415a1.add("");
            listM415a1.add("01-নিজে");
            listM415a1.add("02-স্বামী");
            listM415a1.add("03-খানার অন্য কেউ");
            listM415a1.add("04-খানায় থাকেনা এমন কেউ");
            listM415a1.add("05-যৌথ (স্বামী/স্ত্রী)");
            ArrayAdapter<String> adptrM415a1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM415a1);
            spnM415a1.setAdapter(adptrM415a1);

            secM415a2 = (LinearLayout) findViewById(R.id.secM415a2);
            lineM415a2 = (View) findViewById(R.id.lineM415a2);
            VlblM415a2 = (TextView) findViewById(R.id.VlblM415a2);
            spnM415a2 = (Spinner) findViewById(R.id.spnM415a2);
            List<String> listM415a2 = new ArrayList<String>();

            listM415a2.add("");
            listM415a2.add("01-মোটেও গুরুত্বপূর্ণ না");
            listM415a2.add("02-অল্প কিছু ব্যাপারে গুরুত্বপূর্ণ");
            listM415a2.add("03-কিছু কিছু ব্যাপারে গুরুত্বপূর্ণ");
            listM415a2.add("04- প্রায় সব ব্যাপারে গুরুত্বপূর্ণ");
            ArrayAdapter<String> adptrM415a2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM415a2);
            spnM415a2.setAdapter(adptrM415a2);

            secM416a = (LinearLayout) findViewById(R.id.secM416a);
            lineM416a = (View) findViewById(R.id.lineM416a);
            VlblM416a = (TextView) findViewById(R.id.VlblM416a);
            rdogrpM416a = (RadioGroup) findViewById(R.id.rdogrpM416a);

            rdoM416a1 = (RadioButton) findViewById(R.id.rdoM416a1);
            rdoM416a2 = (RadioButton) findViewById(R.id.rdoM416a2);
            secM416a1 = (LinearLayout) findViewById(R.id.secM416a1);
            lineM416a1 = (View) findViewById(R.id.lineM416a1);
            VlblM416a1 = (TextView) findViewById(R.id.VlblM416a1);
            spnM416a1 = (Spinner) findViewById(R.id.spnM416a1);
            List<String> listM416a1 = new ArrayList<String>();

            listM416a1.add("");
            listM416a1.add("01-নিজে");
            listM416a1.add("02-স্বামী");
            listM416a1.add("03-খানার অন্য কেউ");
            listM416a1.add("04-খানায় থাকেনা এমন কেউ");
            listM416a1.add("05-যৌথ (স্বামী/স্ত্রী)");
            ArrayAdapter<String> adptrM416a1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM416a1);
            spnM416a1.setAdapter(adptrM416a1);

            secM416a2 = (LinearLayout) findViewById(R.id.secM416a2);
            lineM416a2 = (View) findViewById(R.id.lineM416a2);
            VlblM416a2 = (TextView) findViewById(R.id.VlblM416a2);
            spnM416a2 = (Spinner) findViewById(R.id.spnM416a2);
            List<String> listM416a2 = new ArrayList<String>();

            listM416a2.add("");
            listM416a2.add("01-মোটেও গুরুত্বপূর্ণ না");
            listM416a2.add("02-অল্প কিছু ব্যাপারে গুরুত্বপূর্ণ");
            listM416a2.add("03-কিছু কিছু ব্যাপারে গুরুত্বপূর্ণ");
            listM416a2.add("04- প্রায় সব ব্যাপারে গুরুত্বপূর্ণ");
            ArrayAdapter<String> adptrM416a2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listM416a2);
            spnM416a2.setAdapter(adptrM416a2);


            //Hide all skip variables

            DataSearch(RND, SUCHANAID);

            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(WomenEmp.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: রাউন্ড নম্বর.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(WomenEmp.this, "Value should be between 1 and 5(রাউন্ড নম্বর).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: উপকারভোগী সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (!rdoM411a1.isChecked() & !rdoM411a2.isChecked() & secM411a.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Select anyone options from (a. গৃহপালিত পশু (যেমন গরু ছাগল, ইত্যাদি) ক্রয়  ).");
                rdoM411a1.requestFocus();
                return;
            } else if (spnM411a1.getSelectedItemPosition() == 0 & secM411a1.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: -> সিদ্ধান্ত সাধারণত কে নেয়?.");
                spnM411a1.requestFocus();
                return;
            } else if (spnM411a2.getSelectedItemPosition() == 0 & secM411a2.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: -> সিদ্ধান্ত নেবার সময় আপনার বিবেচনা/মতামত কতটুক গুরুত্বপূর্ণ.");
                spnM411a2.requestFocus();
                return;
            } else if (!rdoM411b1.isChecked() & !rdoM411b2.isChecked() & secM411b.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Select anyone options from (b. হাঁস/মুরগি প্রতিপালনের জন্য ক্রয় ).");
                rdoM411b1.requestFocus();
                return;
            } else if (spnM411b1.getSelectedItemPosition() == 0 & secM411b1.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: -> সিদ্ধান্ত সাধারণত কে নেয়?.");
                spnM411b1.requestFocus();
                return;
            } else if (spnM411b2.getSelectedItemPosition() == 0 & secM411b2.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: -> সিদ্ধান্ত নেবার সময় আপনার বিবেচনা/মতামত কতটুক গুরুত্বপূর্ণ.");
                spnM411b2.requestFocus();
                return;
            } else if (!rdoM411c1.isChecked() & !rdoM411c2.isChecked() & secM411c.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Select anyone options from (c. মাছ প্রতিপালনের জন্য ক্রয় ).");
                rdoM411c1.requestFocus();
                return;
            } else if (spnM411c1.getSelectedItemPosition() == 0 & secM411c1.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: -> সিদ্ধান্ত সাধারণত কে নেয়?.");
                spnM411c1.requestFocus();
                return;
            } else if (spnM411c2.getSelectedItemPosition() == 0 & secM411c2.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: -> সিদ্ধান্ত নেবার সময় আপনার বিবেচনা/মতামত কতটুক গুরুত্বপূর্ণ.");
                spnM411c2.requestFocus();
                return;
            } else if (!rdoM411d1.isChecked() & !rdoM411d2.isChecked() & secM411d.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Select anyone options from (d. ব্যবসায়িক সম্পদ (যেমনঃ রিক্সা, নৌকা, লাঙ্গল, ইত্যাদি)).");
                rdoM411d1.requestFocus();
                return;
            } else if (spnM411d1.getSelectedItemPosition() == 0 & secM411d1.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: -> সিদ্ধান্ত সাধারণত কে নেয়?.");
                spnM411d1.requestFocus();
                return;
            } else if (spnM411d2.getSelectedItemPosition() == 0 & secM411d2.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: -> সিদ্ধান্ত নেবার সময় আপনার বিবেচনা/মতামত কতটুক গুরুত্বপূর্ণ.");
                spnM411d2.requestFocus();
                return;
            } else if (!rdoM411e1.isChecked() & !rdoM411e2.isChecked() & secM411e.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Select anyone options from (e. জমি ক্রয়).");
                rdoM411e1.requestFocus();
                return;
            } else if (spnM411e1.getSelectedItemPosition() == 0 & secM411e1.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: -> সিদ্ধান্ত সাধারণত কে নেয়?.");
                spnM411e1.requestFocus();
                return;
            } else if (spnM411e2.getSelectedItemPosition() == 0 & secM411e2.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: -> সিদ্ধান্ত নেবার সময় আপনার বিবেচনা/মতামত কতটুক গুরুত্বপূর্ণ.");
                spnM411e2.requestFocus();
                return;
            } else if (!rdoM411f1.isChecked() & !rdoM411f2.isChecked() & secM411f.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Select anyone options from (f. অব্যবসায়িক সম্পদ (যেমন টিভি, চেয়ার, বৈদ্যুতিক পাখা ক্রয়)).");
                rdoM411f1.requestFocus();
                return;
            } else if (spnM411f1.getSelectedItemPosition() == 0 & secM411f1.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: -> সিদ্ধান্ত সাধারণত কে নেয়?.");
                spnM411f1.requestFocus();
                return;
            } else if (spnM411f2.getSelectedItemPosition() == 0 & secM411f2.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: -> সিদ্ধান্ত নেবার সময় আপনার বিবেচনা/মতামত কতটুক গুরুত্বপূর্ণ.");
                spnM411f2.requestFocus();
                return;
            } else if (!rdoM411g1.isChecked() & !rdoM411g2.isChecked() & secM411g.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Select anyone options from (g. রান্নাঘরের সামগ্রী (যেমন হাড়ি, তাওয়া, জগ ক্রয়) ).");
                rdoM411g1.requestFocus();
                return;
            } else if (spnM411g1.getSelectedItemPosition() == 0 & secM411g1.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: -> সিদ্ধান্ত সাধারণত কে নেয়?.");
                spnM411g1.requestFocus();
                return;
            } else if (spnM411g2.getSelectedItemPosition() == 0 & secM411g2.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: -> সিদ্ধান্ত নেবার সময় আপনার বিবেচনা/মতামত কতটুক গুরুত্বপূর্ণ.");
                spnM411g2.requestFocus();
                return;
            } else if (!rdoM412a1.isChecked() & !rdoM412a2.isChecked() & secM412a.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Select anyone options from (খাবার দাবার/বাজার সদাই সংক্রান্ত ).");
                rdoM412a1.requestFocus();
                return;
            } else if (spnM412a1.getSelectedItemPosition() == 0 & secM412a1.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: -> সিদ্ধান্ত সাধারণত কে নেয়?.");
                spnM412a1.requestFocus();
                return;
            } else if (spnM412a2.getSelectedItemPosition() == 0 & secM412a2.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: -> সিদ্ধান্ত নেবার সময় আপনার বিবেচনা/মতামত কতটুক গুরুত্বপূর্ণ.");
                spnM412a2.requestFocus();
                return;
            } else if (!rdoM413a1.isChecked() & !rdoM413a2.isChecked() & secM413a.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Select anyone options from (রান্নাবান্না সংক্রান্ত ).");
                rdoM413a1.requestFocus();
                return;
            } else if (spnM413a1.getSelectedItemPosition() == 0 & secM413a1.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: -> সিধান্ত সাধারণত কে নেয়?.");
                spnM413a1.requestFocus();
                return;
            } else if (spnM413a2.getSelectedItemPosition() == 0 & secM413a2.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: -> সিধান্ত নেবার সময় আপনার বিবেচনা/মতামত কতটুক গুরুত্বপূর্ণ.");
                spnM413a2.requestFocus();
                return;
            } else if (!rdoM414a1.isChecked() & !rdoM414a2.isChecked() & secM414a.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Select anyone options from (নিজের স্বাস্থ্য ও চিকিৎসা সংক্রান্ত ).");
                rdoM414a1.requestFocus();
                return;
            } else if (spnM414a1.getSelectedItemPosition() == 0 & secM414a1.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: -> সিদ্ধান্ত সাধারণত কে নেয়?.");
                spnM414a1.requestFocus();
                return;
            } else if (spnM414a2.getSelectedItemPosition() == 0 & secM414a2.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: -> সিদ্ধান্ত নেবার সময় আপনার বিবেচনা/মতামত কতটুক গুরুত্বপূর্ণ.");
                spnM414a2.requestFocus();
                return;
            } else if (!rdoM415a1.isChecked() & !rdoM415a2.isChecked() & secM415a.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Select anyone options from (সন্তানের  স্বাস্থ্য ও চিকিৎসা সংক্রান্ত ).");
                rdoM415a1.requestFocus();
                return;
            } else if (spnM415a1.getSelectedItemPosition() == 0 & secM415a1.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: -> সিদ্ধান্ত সাধারণত কে নেয়?.");
                spnM415a1.requestFocus();
                return;
            } else if (spnM415a2.getSelectedItemPosition() == 0 & secM415a2.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: -> সিদ্ধান্ত নেবার সময় আপনার বিবেচনা/মতামত কতটুক গুরুত্বপূর্ণ.");
                spnM415a2.requestFocus();
                return;
            } else if (!rdoM416a1.isChecked() & !rdoM416a2.isChecked() & secM416a.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Select anyone options from (বাপের বাড়ি অথবা আত্নীয়ের বাড়ী বেড়াতে যাওয়া সংক্রান্ত).");
                rdoM416a1.requestFocus();
                return;
            } else if (spnM416a1.getSelectedItemPosition() == 0 & secM416a1.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: -> সিদ্ধান্ত সাধারণত কে নেয়?.");
                spnM416a1.requestFocus();
                return;
            } else if (spnM416a2.getSelectedItemPosition() == 0 & secM416a2.isShown()) {
                Connection.MessageBox(WomenEmp.this, "Required field: -> সিদ্ধান্ত নেবার সময় আপনার বিবেচনা/মতামত কতটুক গুরুত্বপূর্ণ.");
                spnM416a2.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            WomenEmp_DataModel objSave = new WomenEmp_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            String[] d_rdogrpM411a = new String[]{"1", "0"};
            objSave.setM411a("");
            for (int i = 0; i < rdogrpM411a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM411a.getChildAt(i);
                if (rb.isChecked()) objSave.setM411a(d_rdogrpM411a[i]);
            }

            objSave.setM411a1((spnM411a1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM411a1.getSelectedItem().toString(), "-")));
            objSave.setM411a2((spnM411a2.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM411a2.getSelectedItem().toString(), "-")));
            String[] d_rdogrpM411b = new String[]{"1", "0"};
            objSave.setM411b("");
            for (int i = 0; i < rdogrpM411b.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM411b.getChildAt(i);
                if (rb.isChecked()) objSave.setM411b(d_rdogrpM411b[i]);
            }

            objSave.setM411b1((spnM411b1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM411b1.getSelectedItem().toString(), "-")));
            objSave.setM411b2((spnM411b2.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM411b2.getSelectedItem().toString(), "-")));
            String[] d_rdogrpM411c = new String[]{"1", "0"};
            objSave.setM411c("");
            for (int i = 0; i < rdogrpM411c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM411c.getChildAt(i);
                if (rb.isChecked()) objSave.setM411c(d_rdogrpM411c[i]);
            }

            objSave.setM411c1((spnM411c1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM411c1.getSelectedItem().toString(), "-")));
            objSave.setM411c2((spnM411c2.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM411c2.getSelectedItem().toString(), "-")));
            String[] d_rdogrpM411d = new String[]{"1", "0"};
            objSave.setM411d("");
            for (int i = 0; i < rdogrpM411d.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM411d.getChildAt(i);
                if (rb.isChecked()) objSave.setM411d(d_rdogrpM411d[i]);
            }

            objSave.setM411d1((spnM411d1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM411d1.getSelectedItem().toString(), "-")));
            objSave.setM411d2((spnM411d2.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM411d2.getSelectedItem().toString(), "-")));
            String[] d_rdogrpM411e = new String[]{"1", "0"};
            objSave.setM411e("");
            for (int i = 0; i < rdogrpM411e.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM411e.getChildAt(i);
                if (rb.isChecked()) objSave.setM411e(d_rdogrpM411e[i]);
            }

            objSave.setM411e1((spnM411e1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM411e1.getSelectedItem().toString(), "-")));
            objSave.setM411e2((spnM411e2.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM411e2.getSelectedItem().toString(), "-")));
            String[] d_rdogrpM411f = new String[]{"1", "0"};
            objSave.setM411f("");
            for (int i = 0; i < rdogrpM411f.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM411f.getChildAt(i);
                if (rb.isChecked()) objSave.setM411f(d_rdogrpM411f[i]);
            }

            objSave.setM411f1((spnM411f1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM411f1.getSelectedItem().toString(), "-")));
            objSave.setM411f2((spnM411f2.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM411f2.getSelectedItem().toString(), "-")));
            String[] d_rdogrpM411g = new String[]{"1", "0"};
            objSave.setM411g("");
            for (int i = 0; i < rdogrpM411g.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM411g.getChildAt(i);
                if (rb.isChecked()) objSave.setM411g(d_rdogrpM411g[i]);
            }

            objSave.setM411g1((spnM411g1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM411g1.getSelectedItem().toString(), "-")));
            objSave.setM411g2((spnM411g2.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM411g2.getSelectedItem().toString(), "-")));
            String[] d_rdogrpM412a = new String[]{"1", "0"};
            objSave.setM412a("");
            for (int i = 0; i < rdogrpM412a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM412a.getChildAt(i);
                if (rb.isChecked()) objSave.setM412a(d_rdogrpM412a[i]);
            }

            objSave.setM412a1((spnM412a1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM412a1.getSelectedItem().toString(), "-")));
            objSave.setM412a2((spnM412a2.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM412a2.getSelectedItem().toString(), "-")));
            String[] d_rdogrpM413a = new String[]{"1", "0"};
            objSave.setM413a("");
            for (int i = 0; i < rdogrpM413a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM413a.getChildAt(i);
                if (rb.isChecked()) objSave.setM413a(d_rdogrpM413a[i]);
            }

            objSave.setM413a1((spnM413a1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM413a1.getSelectedItem().toString(), "-")));
            objSave.setM413a2((spnM413a2.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM413a2.getSelectedItem().toString(), "-")));
            String[] d_rdogrpM414a = new String[]{"1", "0"};
            objSave.setM414a("");
            for (int i = 0; i < rdogrpM414a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM414a.getChildAt(i);
                if (rb.isChecked()) objSave.setM414a(d_rdogrpM414a[i]);
            }

            objSave.setM414a1((spnM414a1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM414a1.getSelectedItem().toString(), "-")));
            objSave.setM414a2((spnM414a2.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM414a2.getSelectedItem().toString(), "-")));
            String[] d_rdogrpM415a = new String[]{"1", "0"};
            objSave.setM415a("");
            for (int i = 0; i < rdogrpM415a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM415a.getChildAt(i);
                if (rb.isChecked()) objSave.setM415a(d_rdogrpM415a[i]);
            }

            objSave.setM415a1((spnM415a1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM415a1.getSelectedItem().toString(), "-")));
            objSave.setM415a2((spnM415a2.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM415a2.getSelectedItem().toString(), "-")));
            String[] d_rdogrpM416a = new String[]{"1", "0"};
            objSave.setM416a("");
            for (int i = 0; i < rdogrpM416a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpM416a.getChildAt(i);
                if (rb.isChecked()) objSave.setM416a(d_rdogrpM416a[i]);
            }

            objSave.setM416a1((spnM416a1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM416a1.getSelectedItem().toString(), "-")));
            objSave.setM416a2((spnM416a2.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnM416a2.getSelectedItem().toString(), "-")));

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
                startActivity(new Intent(WomenEmp.this, DomViolance.class).putExtras(IDBundle));

            } else {
                Connection.MessageBox(WomenEmp.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(WomenEmp.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            WomenEmp_DataModel d = new WomenEmp_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<WomenEmp_DataModel> data = d.SelectAll(this, SQL);
            for (WomenEmp_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                String[] d_rdogrpM411a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM411a.length; i++) {
                    if (item.getM411a().equals(String.valueOf(d_rdogrpM411a[i]))) {
                        rb = (RadioButton) rdogrpM411a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnM411a1.setSelection(Global.SpinnerItemPositionAnyLength(spnM411a1, item.getM411a1()));
                spnM411a2.setSelection(Global.SpinnerItemPositionAnyLength(spnM411a2, item.getM411a2()));
                String[] d_rdogrpM411b = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM411b.length; i++) {
                    if (item.getM411b().equals(String.valueOf(d_rdogrpM411b[i]))) {
                        rb = (RadioButton) rdogrpM411b.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnM411b1.setSelection(Global.SpinnerItemPositionAnyLength(spnM411b1, item.getM411b1()));
                spnM411b2.setSelection(Global.SpinnerItemPositionAnyLength(spnM411b2, item.getM411b2()));
                String[] d_rdogrpM411c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM411c.length; i++) {
                    if (item.getM411c().equals(String.valueOf(d_rdogrpM411c[i]))) {
                        rb = (RadioButton) rdogrpM411c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnM411c1.setSelection(Global.SpinnerItemPositionAnyLength(spnM411c1, item.getM411c1()));
                spnM411c2.setSelection(Global.SpinnerItemPositionAnyLength(spnM411c2, item.getM411c2()));
                String[] d_rdogrpM411d = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM411d.length; i++) {
                    if (item.getM411d().equals(String.valueOf(d_rdogrpM411d[i]))) {
                        rb = (RadioButton) rdogrpM411d.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnM411d1.setSelection(Global.SpinnerItemPositionAnyLength(spnM411d1, item.getM411d1()));
                spnM411d2.setSelection(Global.SpinnerItemPositionAnyLength(spnM411d2, item.getM411d2()));
                String[] d_rdogrpM411e = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM411e.length; i++) {
                    if (item.getM411e().equals(String.valueOf(d_rdogrpM411e[i]))) {
                        rb = (RadioButton) rdogrpM411e.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnM411e1.setSelection(Global.SpinnerItemPositionAnyLength(spnM411e1, item.getM411e1()));
                spnM411e2.setSelection(Global.SpinnerItemPositionAnyLength(spnM411e2, item.getM411e2()));
                String[] d_rdogrpM411f = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM411f.length; i++) {
                    if (item.getM411f().equals(String.valueOf(d_rdogrpM411f[i]))) {
                        rb = (RadioButton) rdogrpM411f.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnM411f1.setSelection(Global.SpinnerItemPositionAnyLength(spnM411f1, item.getM411f1()));
                spnM411f2.setSelection(Global.SpinnerItemPositionAnyLength(spnM411f2, item.getM411f2()));
                String[] d_rdogrpM411g = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM411g.length; i++) {
                    if (item.getM411g().equals(String.valueOf(d_rdogrpM411g[i]))) {
                        rb = (RadioButton) rdogrpM411g.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnM411g1.setSelection(Global.SpinnerItemPositionAnyLength(spnM411g1, item.getM411g1()));
                spnM411g2.setSelection(Global.SpinnerItemPositionAnyLength(spnM411g2, item.getM411g2()));
                String[] d_rdogrpM412a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM412a.length; i++) {
                    if (item.getM412a().equals(String.valueOf(d_rdogrpM412a[i]))) {
                        rb = (RadioButton) rdogrpM412a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnM412a1.setSelection(Global.SpinnerItemPositionAnyLength(spnM412a1, item.getM412a1()));
                spnM412a2.setSelection(Global.SpinnerItemPositionAnyLength(spnM412a2, item.getM412a2()));
                String[] d_rdogrpM413a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM413a.length; i++) {
                    if (item.getM413a().equals(String.valueOf(d_rdogrpM413a[i]))) {
                        rb = (RadioButton) rdogrpM413a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnM413a1.setSelection(Global.SpinnerItemPositionAnyLength(spnM413a1, item.getM413a1()));
                spnM413a2.setSelection(Global.SpinnerItemPositionAnyLength(spnM413a2, item.getM413a2()));
                String[] d_rdogrpM414a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM414a.length; i++) {
                    if (item.getM414a().equals(String.valueOf(d_rdogrpM414a[i]))) {
                        rb = (RadioButton) rdogrpM414a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnM414a1.setSelection(Global.SpinnerItemPositionAnyLength(spnM414a1, item.getM414a1()));
                spnM414a2.setSelection(Global.SpinnerItemPositionAnyLength(spnM414a2, item.getM414a2()));
                String[] d_rdogrpM415a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM415a.length; i++) {
                    if (item.getM415a().equals(String.valueOf(d_rdogrpM415a[i]))) {
                        rb = (RadioButton) rdogrpM415a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnM415a1.setSelection(Global.SpinnerItemPositionAnyLength(spnM415a1, item.getM415a1()));
                spnM415a2.setSelection(Global.SpinnerItemPositionAnyLength(spnM415a2, item.getM415a2()));
                String[] d_rdogrpM416a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpM416a.length; i++) {
                    if (item.getM416a().equals(String.valueOf(d_rdogrpM416a[i]))) {
                        rb = (RadioButton) rdogrpM416a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnM416a1.setSelection(Global.SpinnerItemPositionAnyLength(spnM416a1, item.getM416a1()));
                spnM416a2.setSelection(Global.SpinnerItemPositionAnyLength(spnM416a2, item.getM416a2()));
            }
        } catch (Exception e) {
            Connection.MessageBox(WomenEmp.this, e.getMessage());
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