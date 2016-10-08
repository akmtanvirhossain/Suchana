package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Father" android:label="Father" />

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import android.Manifest;
import android.app.*;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.view.KeyEvent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.MotionEvent;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.ArrayAdapter;

import Common.*;

public class Father extends Activity {
    boolean networkAvailable = false;
    Location currentLocation;
    double currentLatitude, currentLongitude;

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

    String VariableID;
    private int hour;
    private int minute;
    private int mDay;
    private int mMonth;
    private int mYear;
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;

    Connection C;
    Global g;
    SimpleAdapter dataAdapter;
    ArrayList<HashMap<String, String>> dataList = new ArrayList<HashMap<String, String>>();
    static String TableName;

    TextView lblHeading;
    LinearLayout seclbl211;
    LinearLayout secRnd;
    View lineRnd;
    TextView VlblRnd;
    EditText txtRnd;
    LinearLayout secSuchanaID;
    View lineSuchanaID;
    TextView VlblSuchanaID;
    EditText txtSuchanaID;
    LinearLayout secF211;
    View lineF211;
    TextView VlblF211;
    Spinner spnF211;
    LinearLayout seclbl212;
    LinearLayout secF212a;
    View lineF212a;
    TextView VlblF212a;
    RadioGroup rdogrpF212a;

    RadioButton rdoF212a1;
    RadioButton rdoF212a2;
    RadioButton rdoF212a3;
    LinearLayout secF212b;
    View lineF212b;
    TextView VlblF212b;
    EditText txtF212b;
    LinearLayout secF213;
    View lineF213;
    TextView VlblF213;
    EditText txtF213;
    LinearLayout secF214;
    View lineF214;
    TextView VlblF214;
    EditText txtF214;
    LinearLayout seclbl215;
    LinearLayout secF215a;
    View lineF215a;
    TextView VlblF215a;
    CheckBox chkF215a;
    LinearLayout secF215b;
    View lineF215b;
    TextView VlblF215b;
    CheckBox chkF215b;
    LinearLayout secF215c;
    View lineF215c;
    TextView VlblF215c;
    CheckBox chkF215c;
    LinearLayout secF215d;
    View lineF215d;
    TextView VlblF215d;
    CheckBox chkF215d;
    LinearLayout secF215e;
    View lineF215e;
    TextView VlblF215e;
    CheckBox chkF215e;
    LinearLayout secF215f;
    View lineF215f;
    TextView VlblF215f;
    CheckBox chkF215f;
    LinearLayout secF215g;
    View lineF215g;
    TextView VlblF215g;
    CheckBox chkF215g;
    LinearLayout secF215h;
    View lineF215h;
    TextView VlblF215h;
    CheckBox chkF215h;
    LinearLayout secF215i;
    View lineF215i;
    TextView VlblF215i;
    CheckBox chkF215i;
    LinearLayout secF215j;
    View lineF215j;
    TextView VlblF215j;
    CheckBox chkF215j;
    LinearLayout seclbl216;
    LinearLayout secF216a;
    View lineF216a;
    TextView VlblF216a;
    CheckBox chkF216a;
    LinearLayout secF216b;
    View lineF216b;
    TextView VlblF216b;
    CheckBox chkF216b;
    LinearLayout secF216c;
    View lineF216c;
    TextView VlblF216c;
    CheckBox chkF216c;
    LinearLayout secF216d;
    View lineF216d;
    TextView VlblF216d;
    CheckBox chkF216d;
    LinearLayout secF216e;
    View lineF216e;
    TextView VlblF216e;
    CheckBox chkF216e;
    LinearLayout secF216x;
    View lineF216x;
    TextView VlblF216x;
    CheckBox chkF216x;
    LinearLayout secF216X1;
    View lineF216X1;
    TextView VlblF216X1;
    EditText txtF216X1;
    LinearLayout secF216X2;
    View lineF216X2;
    TextView VlblF216X2;
    EditText txtF216X2;
    LinearLayout secF216X3;
    View lineF216X3;
    TextView VlblF216X3;
    EditText txtF216X3;
    LinearLayout secF217;
    View lineF217;
    TextView VlblF217;
    EditText txtF217;
    LinearLayout seclbl218;
    LinearLayout secF218a;
    View lineF218a;
    TextView VlblF218a;
    CheckBox chkF218a;
    LinearLayout secF218b;
    View lineF218b;
    TextView VlblF218b;
    CheckBox chkF218b;
    LinearLayout secF218c;
    View lineF218c;
    TextView VlblF218c;
    CheckBox chkF218c;
    LinearLayout secF218d;
    View lineF218d;
    TextView VlblF218d;
    CheckBox chkF218d;
    LinearLayout secF218e;
    View lineF218e;
    TextView VlblF218e;
    CheckBox chkF218e;
    LinearLayout secF218f;
    View lineF218f;
    TextView VlblF218f;
    CheckBox chkF218f;
    LinearLayout secF218g;
    View lineF218g;
    TextView VlblF218g;
    CheckBox chkF218g;
    LinearLayout secF219;
    View lineF219;
    TextView VlblF219;
    EditText txtF219;
    LinearLayout secF2110;
    View lineF2110;
    TextView VlblF2110;
    RadioGroup rdogrpF2110;

    RadioButton rdoF21101;
    RadioButton rdoF21102;
    RadioButton rdoF21103;
    LinearLayout secF2111;
    View lineF2111;
    TextView VlblF2111;
    RadioGroup rdogrpF2111;

    RadioButton rdoF21111;
    RadioButton rdoF21112;
    RadioButton rdoF21113;
    LinearLayout secF2112;
    View lineF2112;
    TextView VlblF2112;
    EditText txtF2112;

    String StartTime;
    Bundle IDbundle;
    static String RND = "";
    static String SUCHANAID = "";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.father);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TableName = "Father";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Father.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Anthro.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDbundle);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(Father.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to go to next form [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDBundle = new Bundle();
                            IDBundle.putString("Rnd", RND);
                            IDBundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), HHIdentity_list.class);
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
                    f1 = new Intent(getApplicationContext(), UpdateMenu.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);
                }
            });

            seclbl211 = (LinearLayout) findViewById(R.id.seclbl211);
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
            secF211 = (LinearLayout) findViewById(R.id.secF211);
            lineF211 = (View) findViewById(R.id.lineF211);
            VlblF211 = (TextView) findViewById(R.id.VlblF211);
            spnF211 = (Spinner) findViewById(R.id.spnF211);
            List<String> listF211 = new ArrayList<String>();

            spnF211 = (Spinner) findViewById(R.id.spnF211);
            spnF211.setAdapter(C.getArrayAdapter("select H21 ||'-'||H22 from member where RND='" + RND + "' and SuchanaID='" + SUCHANAID + "' and cast(H26Y as int)>=15"));


          //  ArrayAdapter<String> adptrF211 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listF211);
           // spnF211.setAdapter(adptrF211);

            seclbl212 = (LinearLayout) findViewById(R.id.seclbl212);
            secF212a = (LinearLayout) findViewById(R.id.secF212a);
            lineF212a = (View) findViewById(R.id.lineF212a);
            VlblF212a = (TextView) findViewById(R.id.VlblF212a);
            rdogrpF212a = (RadioGroup) findViewById(R.id.rdogrpF212a);

            rdoF212a1 = (RadioButton) findViewById(R.id.rdoF212a1);
            rdoF212a2 = (RadioButton) findViewById(R.id.rdoF212a2);
            rdoF212a3 = (RadioButton) findViewById(R.id.rdoF212a3);
            rdogrpF212a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpF212a = new String[]{"1", "2", "3"};
                    for (int i = 0; i < rdogrpF212a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpF212a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpF212a[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                        secF212b.setVisibility(View.GONE);
                        lineF212b.setVisibility(View.GONE);
                        txtF212b.setText("");
                    } else {
                        secF212b.setVisibility(View.VISIBLE);
                        lineF212b.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secF212b = (LinearLayout) findViewById(R.id.secF212b);
            lineF212b = (View) findViewById(R.id.lineF212b);
            VlblF212b = (TextView) findViewById(R.id.VlblF212b);
            txtF212b = (EditText) findViewById(R.id.txtF212b);
            secF213 = (LinearLayout) findViewById(R.id.secF213);
            lineF213 = (View) findViewById(R.id.lineF213);
            VlblF213 = (TextView) findViewById(R.id.VlblF213);
            txtF213 = (EditText) findViewById(R.id.txtF213);
            secF214 = (LinearLayout) findViewById(R.id.secF214);
            lineF214 = (View) findViewById(R.id.lineF214);
            VlblF214 = (TextView) findViewById(R.id.VlblF214);
            txtF214 = (EditText) findViewById(R.id.txtF214);
            seclbl215 = (LinearLayout) findViewById(R.id.seclbl215);
            secF215a = (LinearLayout) findViewById(R.id.secF215a);
            lineF215a = (View) findViewById(R.id.lineF215a);
            VlblF215a = (TextView) findViewById(R.id.VlblF215a);
            chkF215a = (CheckBox) findViewById(R.id.chkF215a);
            secF215b = (LinearLayout) findViewById(R.id.secF215b);
            lineF215b = (View) findViewById(R.id.lineF215b);
            VlblF215b = (TextView) findViewById(R.id.VlblF215b);
            chkF215b = (CheckBox) findViewById(R.id.chkF215b);
            secF215c = (LinearLayout) findViewById(R.id.secF215c);
            lineF215c = (View) findViewById(R.id.lineF215c);
            VlblF215c = (TextView) findViewById(R.id.VlblF215c);
            chkF215c = (CheckBox) findViewById(R.id.chkF215c);
            secF215d = (LinearLayout) findViewById(R.id.secF215d);
            lineF215d = (View) findViewById(R.id.lineF215d);
            VlblF215d = (TextView) findViewById(R.id.VlblF215d);
            chkF215d = (CheckBox) findViewById(R.id.chkF215d);
            secF215e = (LinearLayout) findViewById(R.id.secF215e);
            lineF215e = (View) findViewById(R.id.lineF215e);
            VlblF215e = (TextView) findViewById(R.id.VlblF215e);
            chkF215e = (CheckBox) findViewById(R.id.chkF215e);
            secF215f = (LinearLayout) findViewById(R.id.secF215f);
            lineF215f = (View) findViewById(R.id.lineF215f);
            VlblF215f = (TextView) findViewById(R.id.VlblF215f);
            chkF215f = (CheckBox) findViewById(R.id.chkF215f);
            secF215g = (LinearLayout) findViewById(R.id.secF215g);
            lineF215g = (View) findViewById(R.id.lineF215g);
            VlblF215g = (TextView) findViewById(R.id.VlblF215g);
            chkF215g = (CheckBox) findViewById(R.id.chkF215g);
            secF215h = (LinearLayout) findViewById(R.id.secF215h);
            lineF215h = (View) findViewById(R.id.lineF215h);
            VlblF215h = (TextView) findViewById(R.id.VlblF215h);
            chkF215h = (CheckBox) findViewById(R.id.chkF215h);
            secF215i = (LinearLayout) findViewById(R.id.secF215i);
            lineF215i = (View) findViewById(R.id.lineF215i);
            VlblF215i = (TextView) findViewById(R.id.VlblF215i);
            chkF215i = (CheckBox) findViewById(R.id.chkF215i);
            secF215j = (LinearLayout) findViewById(R.id.secF215j);
            lineF215j = (View) findViewById(R.id.lineF215j);
            VlblF215j = (TextView) findViewById(R.id.VlblF215j);
            chkF215j = (CheckBox) findViewById(R.id.chkF215j);
            seclbl216 = (LinearLayout) findViewById(R.id.seclbl216);
            secF216a = (LinearLayout) findViewById(R.id.secF216a);
            lineF216a = (View) findViewById(R.id.lineF216a);
            VlblF216a = (TextView) findViewById(R.id.VlblF216a);
            chkF216a = (CheckBox) findViewById(R.id.chkF216a);
            secF216b = (LinearLayout) findViewById(R.id.secF216b);
            lineF216b = (View) findViewById(R.id.lineF216b);
            VlblF216b = (TextView) findViewById(R.id.VlblF216b);
            chkF216b = (CheckBox) findViewById(R.id.chkF216b);
            secF216c = (LinearLayout) findViewById(R.id.secF216c);
            lineF216c = (View) findViewById(R.id.lineF216c);
            VlblF216c = (TextView) findViewById(R.id.VlblF216c);
            chkF216c = (CheckBox) findViewById(R.id.chkF216c);
            secF216d = (LinearLayout) findViewById(R.id.secF216d);
            lineF216d = (View) findViewById(R.id.lineF216d);
            VlblF216d = (TextView) findViewById(R.id.VlblF216d);
            chkF216d = (CheckBox) findViewById(R.id.chkF216d);
            secF216e = (LinearLayout) findViewById(R.id.secF216e);
            lineF216e = (View) findViewById(R.id.lineF216e);
            VlblF216e = (TextView) findViewById(R.id.VlblF216e);
            chkF216e = (CheckBox) findViewById(R.id.chkF216e);
            secF216x = (LinearLayout) findViewById(R.id.secF216x);
            lineF216x = (View) findViewById(R.id.lineF216x);
            VlblF216x = (TextView) findViewById(R.id.VlblF216x);

            chkF216x = (CheckBox) findViewById(R.id.chkF216x);

            chkF216x.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!((CheckBox) v).isChecked()) {
                        secF216X1.setVisibility(View.GONE);
                        lineF216X1.setVisibility(View.GONE);
                        txtF216X1.setText("");
                        secF216X2.setVisibility(View.GONE);
                        lineF216X2.setVisibility(View.GONE);
                        txtF216X2.setText("");
                        secF216X3.setVisibility(View.GONE);
                        lineF216X3.setVisibility(View.GONE);
                        txtF216X3.setText("");
                        secF217.setVisibility(View.GONE);
                        lineF217.setVisibility(View.GONE);
                        txtF217.setText("");
                    }else {
                        secF216X1.setVisibility(View.VISIBLE);
                        lineF216X1.setVisibility(View.VISIBLE);
                        secF216X2.setVisibility(View.VISIBLE);
                        lineF216X2.setVisibility(View.VISIBLE);
                        secF216X3.setVisibility(View.VISIBLE);
                        lineF216X3.setVisibility(View.VISIBLE);
                    }
                }
            });

            secF216X1 = (LinearLayout) findViewById(R.id.secF216X1);
            lineF216X1 = (View) findViewById(R.id.lineF216X1);
            VlblF216X1 = (TextView) findViewById(R.id.VlblF216X1);
            txtF216X1 = (EditText) findViewById(R.id.txtF216X1);
            secF216X2 = (LinearLayout) findViewById(R.id.secF216X2);
            lineF216X2 = (View) findViewById(R.id.lineF216X2);
            VlblF216X2 = (TextView) findViewById(R.id.VlblF216X2);
            txtF216X2 = (EditText) findViewById(R.id.txtF216X2);
            secF216X3 = (LinearLayout) findViewById(R.id.secF216X3);
            lineF216X3 = (View) findViewById(R.id.lineF216X3);
            VlblF216X3 = (TextView) findViewById(R.id.VlblF216X3);
            txtF216X3 = (EditText) findViewById(R.id.txtF216X3);

            secF217 = (LinearLayout) findViewById(R.id.secF217);
            lineF217 = (View) findViewById(R.id.lineF217);
            VlblF217 = (TextView) findViewById(R.id.VlblF217);
            txtF217 = (EditText) findViewById(R.id.txtF217);
            seclbl218 = (LinearLayout) findViewById(R.id.seclbl218);
            secF218a = (LinearLayout) findViewById(R.id.secF218a);
            lineF218a = (View) findViewById(R.id.lineF218a);
            VlblF218a = (TextView) findViewById(R.id.VlblF218a);
            chkF218a = (CheckBox) findViewById(R.id.chkF218a);
            secF218b = (LinearLayout) findViewById(R.id.secF218b);
            lineF218b = (View) findViewById(R.id.lineF218b);
            VlblF218b = (TextView) findViewById(R.id.VlblF218b);
            chkF218b = (CheckBox) findViewById(R.id.chkF218b);
            secF218c = (LinearLayout) findViewById(R.id.secF218c);
            lineF218c = (View) findViewById(R.id.lineF218c);
            VlblF218c = (TextView) findViewById(R.id.VlblF218c);
            chkF218c = (CheckBox) findViewById(R.id.chkF218c);
            secF218d = (LinearLayout) findViewById(R.id.secF218d);
            lineF218d = (View) findViewById(R.id.lineF218d);
            VlblF218d = (TextView) findViewById(R.id.VlblF218d);
            chkF218d = (CheckBox) findViewById(R.id.chkF218d);
            secF218e = (LinearLayout) findViewById(R.id.secF218e);
            lineF218e = (View) findViewById(R.id.lineF218e);
            VlblF218e = (TextView) findViewById(R.id.VlblF218e);
            chkF218e = (CheckBox) findViewById(R.id.chkF218e);
            secF218f = (LinearLayout) findViewById(R.id.secF218f);
            lineF218f = (View) findViewById(R.id.lineF218f);
            VlblF218f = (TextView) findViewById(R.id.VlblF218f);
            chkF218f = (CheckBox) findViewById(R.id.chkF218f);
            secF218g = (LinearLayout) findViewById(R.id.secF218g);
            lineF218g = (View) findViewById(R.id.lineF218g);
            VlblF218g = (TextView) findViewById(R.id.VlblF218g);
            chkF218g = (CheckBox) findViewById(R.id.chkF218g);
            secF219 = (LinearLayout) findViewById(R.id.secF219);
            lineF219 = (View) findViewById(R.id.lineF219);
            VlblF219 = (TextView) findViewById(R.id.VlblF219);
            txtF219 = (EditText) findViewById(R.id.txtF219);
            secF2110 = (LinearLayout) findViewById(R.id.secF2110);
            lineF2110 = (View) findViewById(R.id.lineF2110);
            VlblF2110 = (TextView) findViewById(R.id.VlblF2110);
            rdogrpF2110 = (RadioGroup) findViewById(R.id.rdogrpF2110);

            rdoF21101 = (RadioButton) findViewById(R.id.rdoF21101);
            rdoF21102 = (RadioButton) findViewById(R.id.rdoF21102);
            rdoF21103 = (RadioButton) findViewById(R.id.rdoF21103);
            secF2111 = (LinearLayout) findViewById(R.id.secF2111);
            lineF2111 = (View) findViewById(R.id.lineF2111);
            VlblF2111 = (TextView) findViewById(R.id.VlblF2111);
            rdogrpF2111 = (RadioGroup) findViewById(R.id.rdogrpF2111);

            rdoF21111 = (RadioButton) findViewById(R.id.rdoF21111);
            rdoF21112 = (RadioButton) findViewById(R.id.rdoF21112);
            rdoF21113 = (RadioButton) findViewById(R.id.rdoF21113);
            secF2112 = (LinearLayout) findViewById(R.id.secF2112);
            lineF2112 = (View) findViewById(R.id.lineF2112);
            VlblF2112 = (TextView) findViewById(R.id.VlblF2112);
            txtF2112 = (EditText) findViewById(R.id.txtF2112);


            //Hide all skip variables
            secF212b.setVisibility(View.GONE);
            secF216X1.setVisibility(View.GONE);
            secF216X2.setVisibility(View.GONE);
            secF216X3.setVisibility(View.GONE);
            secF217.setVisibility(View.GONE);

            DataSearch(RND, SUCHANAID);

            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(Father.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(Father.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(Father.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(Father.this, "Required field: উপকারভোগী সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            }
            /* else if (spnF211.getSelectedItemPosition() == 0 & secF211.isShown()) {
                Connection.MessageBox(Father.this, "Required field: পিতা’র লাইন নম্বর.");
                spnF211.requestFocus();
                return;

            } */
            else if (!rdoF212a1.isChecked() & !rdoF212a2.isChecked() & !rdoF212a3.isChecked() & secF212a.isShown()) {
                Connection.MessageBox(Father.this, "Select anyone options from (জন্মের পর শিশুকে কখন বুকের দুধ দেয়া শুরু করা উচিৎ? ).");
                rdoF212a1.requestFocus();
                return;
            } else if (txtF212b.getText().toString().length() == 0 & secF212b.isShown()) {
                Connection.MessageBox(Father.this, "Required field: Duration.");
                txtF212b.requestFocus();
                return;
            } else if (Integer.valueOf(txtF212b.getText().toString().length() == 0 ? "1" : txtF212b.getText().toString()) < 1 || Integer.valueOf(txtF212b.getText().toString().length() == 0 ? "99" : txtF212b.getText().toString()) > 99) {
                Connection.MessageBox(Father.this, "Value should be between 1 and 99(Duration).");
                txtF212b.requestFocus();
                return;
            } else if (txtF213.getText().toString().length() == 0 & secF213.isShown()) {
                Connection.MessageBox(Father.this, "Required field: কত বয়স পর্যন্ত  শিশুকে শুধু বুকের দুধ খাওয়াতে হয়? (দিন) (জানা নেই ৮৮ ).");
                txtF213.requestFocus();
                return;
            } else if (Integer.valueOf(txtF213.getText().toString().length() == 0 ? "0" : txtF213.getText().toString()) < 0 || Integer.valueOf(txtF213.getText().toString().length() == 0 ? "99" : txtF213.getText().toString()) > 99) {
                Connection.MessageBox(Father.this, "Value should be between 0 and 99(কত বয়স পর্যন্ত  শিশুকে শুধু বুকের দুধ খাওয়াতে হয়? (দিন) (জানা নেই ৮৮ )).");
                txtF213.requestFocus();
                return;
            } else if (txtF214.getText().toString().length() == 0 & secF214.isShown()) {
                Connection.MessageBox(Father.this, "Required field: কত বয়স পর্যন্ত  শিশুকে বুকের দুধ খাওয়াতে হয়? (বছর) (জানা নেই ৮৮ ).");
                txtF214.requestFocus();
                return;
            } else if (Integer.valueOf(txtF214.getText().toString().length() == 0 ? "0" : txtF214.getText().toString()) < 0 || Integer.valueOf(txtF214.getText().toString().length() == 0 ? "99" : txtF214.getText().toString()) > 99) {
                Connection.MessageBox(Father.this, "Value should be between 0 and 99(কত বয়স পর্যন্ত শিশুকে বুকের দুধ খাওয়াতে হয়? (বছর) (জানা নেই ৮৮ )).");
                txtF214.requestFocus();
                return;
            } else if (txtF216X1.getText().toString().length() == 0 & secF216X1.isShown()) {
                Connection.MessageBox(Father.this, "Required field: অন্যান্য উল্লেক করুণ ১.");
                txtF216X1.requestFocus();
                return;
            }
            /*else if (txtF216X2.getText().toString().length() == 0 & secF216X2.isShown()) {
                Connection.MessageBox(Father.this, "Required field: অন্যান্য উল্লেক করুণ ২.");
                txtF216X2.requestFocus();
                return;
            } else if (txtF216X3.getText().toString().length() == 0 & secF216X3.isShown()) {
                Connection.MessageBox(Father.this, "Required field: অন্যান্য উল্লেক করুণ ৩.");
                txtF216X3.requestFocus();
                return;
            }
            */
            else if (txtF217.getText().toString().length() == 0 & secF217.isShown()) {
                Connection.MessageBox(Father.this, "Required field: আপনার শিশুকে (নির্বাচিত শিশুর বয়স অনুযায়ী) দৈনিক কতবার খাওয়ানো উচিৎ (জানা নেই ৮৮).");
                txtF217.requestFocus();
                return;
            } else if (Integer.valueOf(txtF217.getText().toString().length() == 0 ? "0" : txtF217.getText().toString()) < 0 || Integer.valueOf(txtF217.getText().toString().length() == 0 ? "99" : txtF217.getText().toString()) > 99) {
                Connection.MessageBox(Father.this, "Value should be between 0 and 99(আপনার শিশুকে (নির্বাচিত শিশুর বয়স অনুযায়ী) দৈনিক কতবার খাওয়ানো উচিৎ (জানা নেই ৮৮)).");
                txtF217.requestFocus();
                return;
            } else if (txtF219.getText().toString().length() == 0 & secF219.isShown()) {
                Connection.MessageBox(Father.this, "Required field: গর্ভাবস্থায়  একটি মেয়ের/মহিলার অন্তত কতবার  (স্বাস্থ্য পরীক্ষা) (ANC) করা উচিৎ?  (জানা নেই ৮৮).");
                txtF219.requestFocus();
                return;
            } else if (Integer.valueOf(txtF219.getText().toString().length() == 0 ? "0" : txtF219.getText().toString()) < 0 || Integer.valueOf(txtF219.getText().toString().length() == 0 ? "99" : txtF219.getText().toString()) > 99) {
                Connection.MessageBox(Father.this, "Value should be between 0 and 99(গর্ভাবস্থায়  একটি মেয়ের/মহিলার অন্তত কতবার  (স্বাস্থ্য পরীক্ষা) (ANC) করা উচিৎ?  (জানা নেই ৮৮)).");
                txtF219.requestFocus();
                return;
            } else if (!rdoF21101.isChecked() & !rdoF21102.isChecked() & !rdoF21103.isChecked() & secF2110.isShown()) {
                Connection.MessageBox(Father.this, "Select anyone options from (গর্ভাবস্থায় একটি মেয়ের/মহিলার অন্য সময়ের তুলনায় দিনের বেলায় কতটুকু ঘুমানো উচিৎ?).");
                rdoF21101.requestFocus();
                return;
            } else if (!rdoF21111.isChecked() & !rdoF21112.isChecked() & !rdoF21113.isChecked() & secF2111.isShown()) {
                Connection.MessageBox(Father.this, "Select anyone options from (গর্ভাবস্থায় একটি মেয়ের/মহিলার অন্য সময়ের তুলনায় কতটুকু খাওয়া উচিৎ?).");
                rdoF21111.requestFocus();
                return;
            } else if (txtF2112.getText().toString().length() == 0 & secF2112.isShown()) {
                Connection.MessageBox(Father.this, "Required field: গর্ভাবস্থায় একটি মেয়ের/মহিলার কয়টি আয়রন ও ফলিক অ্যাসিড ট্যাবলেট খাওয়া উচিৎ? (জানা নেই ৮৮৮).");
                txtF2112.requestFocus();
                return;
            } else if (Integer.valueOf(txtF2112.getText().toString().length() == 0 ? "1" : txtF2112.getText().toString()) < 1 || Integer.valueOf(txtF2112.getText().toString().length() == 0 ? "999" : txtF2112.getText().toString()) > 999) {
                Connection.MessageBox(Father.this, "Value should be between 1 and 999(গর্ভাবস্থায় একটি মেয়ের/মহিলার কয়টি আয়রন ও ফলিক অ্যাসিড ট্যাবলেট খাওয়া উচিৎ? (জানা নেই ৮৮৮)).");
                txtF2112.requestFocus();
                return;
            }

            if((chkF218a.isChecked()==true || chkF218b.isChecked()==true || chkF218c.isChecked()==true  || chkF218d.isChecked()==true || chkF218e.isChecked()==true || chkF218f.isChecked()==true)   && chkF218g.isChecked()==true)
            {
                Connection.MessageBox(Father.this, "Inconsistent value in 2.1.8 G.জানিনা");
                return;
            }
            String SQL = "";
            RadioButton rb;

            Father_DataModel objSave = new Father_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setF211((spnF211.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnF211.getSelectedItem().toString(), "-")));
            String[] d_rdogrpF212a = new String[]{"1", "2", "3"};
            objSave.setF212a("");
            for (int i = 0; i < rdogrpF212a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpF212a.getChildAt(i);
                if (rb.isChecked()) objSave.setF212a(d_rdogrpF212a[i]);
            }

            objSave.setF212b(txtF212b.getText().toString());
            objSave.setF213(txtF213.getText().toString());
            objSave.setF214(txtF214.getText().toString());
            objSave.setF215a((chkF215a.isChecked() ? "1" : "2"));
            objSave.setF215b((chkF215b.isChecked() ? "1" : "2"));
            objSave.setF215c((chkF215c.isChecked() ? "1" : "2"));
            objSave.setF215d((chkF215d.isChecked() ? "1" : "2"));
            objSave.setF215e((chkF215e.isChecked() ? "1" : "2"));
            objSave.setF215f((chkF215f.isChecked() ? "1" : "2"));
            objSave.setF215g((chkF215g.isChecked() ? "1" : "2"));
            objSave.setF215h((chkF215h.isChecked() ? "1" : "2"));
            objSave.setF215i((chkF215i.isChecked() ? "1" : "2"));
            objSave.setF215j((chkF215j.isChecked() ? "1" : "2"));
            objSave.setF216a((chkF216a.isChecked() ? "1" : "2"));
            objSave.setF216b((chkF216b.isChecked() ? "1" : "2"));
            objSave.setF216c((chkF216c.isChecked() ? "1" : "2"));
            objSave.setF216d((chkF216d.isChecked() ? "1" : "2"));
            objSave.setF216e((chkF216e.isChecked() ? "1" : "2"));
            objSave.setF216x((chkF216x.isChecked() ? "1" : "2"));
            objSave.setF216X1(txtF216X1.getText().toString());
            objSave.setF216X2(txtF216X2.getText().toString());
            objSave.setF216X3(txtF216X3.getText().toString());
            objSave.setF217(txtF217.getText().toString());
            objSave.setF218a((chkF218a.isChecked() ? "1" : "2"));
            objSave.setF218b((chkF218b.isChecked() ? "1" : "2"));
            objSave.setF218c((chkF218c.isChecked() ? "1" : "2"));
            objSave.setF218d((chkF218d.isChecked() ? "1" : "2"));
            objSave.setF218e((chkF218e.isChecked() ? "1" : "2"));
            objSave.setF218f((chkF218f.isChecked() ? "1" : "2"));
            objSave.setF218g((chkF218g.isChecked() ? "1" : "2"));
            objSave.setF219(txtF219.getText().toString());
            String[] d_rdogrpF2110 = new String[]{"1", "2", "3"};
            objSave.setF2110("");
            for (int i = 0; i < rdogrpF2110.getChildCount(); i++) {
                rb = (RadioButton) rdogrpF2110.getChildAt(i);
                if (rb.isChecked()) objSave.setF2110(d_rdogrpF2110[i]);
            }

            String[] d_rdogrpF2111 = new String[]{"1", "2", "3"};
            objSave.setF2111("");
            for (int i = 0; i < rdogrpF2111.getChildCount(); i++) {
                rb = (RadioButton) rdogrpF2111.getChildAt(i);
                if (rb.isChecked()) objSave.setF2111(d_rdogrpF2111[i]);
            }

            objSave.setF2112(txtF2112.getText().toString());
            objSave.setEnDt(Global.DateTimeNowYMDHMS());
            objSave.setStartTime(StartTime);
            objSave.setEndTime(g.CurrentTime24());
            objSave.setUserId(g.getUserId());
            objSave.setEntryUser(g.getUserId()); //from data entry user list
            //objSave.setLat(Double.toString(currentLatitude));
            //objSave.setLon(Double.toString(currentLongitude));

            String status = objSave.SaveUpdateData(this);
            if (status.length() == 0) {
                Connection.MessageBox(Father.this, "Saved Successfully");
            } else {
                Connection.MessageBox(Father.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(Father.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            Father_DataModel d = new Father_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<Father_DataModel> data = d.SelectAll(this, SQL);
            for (Father_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                spnF211.setSelection(Global.SpinnerItemPositionAnyLength(spnF211, item.getF211()));
                String[] d_rdogrpF212a = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpF212a.length; i++) {
                    if (item.getF212a().equals(String.valueOf(d_rdogrpF212a[i]))) {
                        rb = (RadioButton) rdogrpF212a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtF212b.setText(item.getF212b());
                txtF213.setText(item.getF213());
                txtF214.setText(item.getF214());
                if (item.getF215a().equals("1")) {
                    chkF215a.setChecked(true);
                } else if (item.getF215a().equals("2")) {
                    chkF215a.setChecked(false);
                }
                if (item.getF215b().equals("1")) {
                    chkF215b.setChecked(true);
                } else if (item.getF215b().equals("2")) {
                    chkF215b.setChecked(false);
                }
                if (item.getF215c().equals("1")) {
                    chkF215c.setChecked(true);
                } else if (item.getF215c().equals("2")) {
                    chkF215c.setChecked(false);
                }
                if (item.getF215d().equals("1")) {
                    chkF215d.setChecked(true);
                } else if (item.getF215d().equals("2")) {
                    chkF215d.setChecked(false);
                }
                if (item.getF215e().equals("1")) {
                    chkF215e.setChecked(true);
                } else if (item.getF215e().equals("2")) {
                    chkF215e.setChecked(false);
                }
                if (item.getF215f().equals("1")) {
                    chkF215f.setChecked(true);
                } else if (item.getF215f().equals("2")) {
                    chkF215f.setChecked(false);
                }
                if (item.getF215g().equals("1")) {
                    chkF215g.setChecked(true);
                } else if (item.getF215g().equals("2")) {
                    chkF215g.setChecked(false);
                }
                if (item.getF215h().equals("1")) {
                    chkF215h.setChecked(true);
                } else if (item.getF215h().equals("2")) {
                    chkF215h.setChecked(false);
                }
                if (item.getF215i().equals("1")) {
                    chkF215i.setChecked(true);
                } else if (item.getF215i().equals("2")) {
                    chkF215i.setChecked(false);
                }
                if (item.getF215j().equals("1")) {
                    chkF215j.setChecked(true);
                } else if (item.getF215j().equals("2")) {
                    chkF215j.setChecked(false);
                }
                if (item.getF216a().equals("1")) {
                    chkF216a.setChecked(true);
                } else if (item.getF216a().equals("2")) {
                    chkF216a.setChecked(false);
                }
                if (item.getF216b().equals("1")) {
                    chkF216b.setChecked(true);
                } else if (item.getF216b().equals("2")) {
                    chkF216b.setChecked(false);
                }
                if (item.getF216c().equals("1")) {
                    chkF216c.setChecked(true);
                } else if (item.getF216c().equals("2")) {
                    chkF216c.setChecked(false);
                }
                if (item.getF216d().equals("1")) {
                    chkF216d.setChecked(true);
                } else if (item.getF216d().equals("2")) {
                    chkF216d.setChecked(false);
                }
                if (item.getF216e().equals("1")) {
                    chkF216e.setChecked(true);
                } else if (item.getF216e().equals("2")) {
                    chkF216e.setChecked(false);
                }
                if (item.getF216x().equals("1")) {
                    chkF216x.setChecked(false);
                    chkF216x.setChecked(true);
                } else if (item.getF216x().equals("2")) {
                    chkF216x.setChecked(false);
                }
                txtF216X1.setText(item.getF216X1());
                txtF216X2.setText(item.getF216X2());
                txtF216X3.setText(item.getF216X3());

                txtF217.setText(item.getF217());
                if (item.getF218a().equals("1")) {
                    chkF218a.setChecked(true);
                } else if (item.getF218a().equals("2")) {
                    chkF218a.setChecked(false);
                }
                if (item.getF218b().equals("1")) {
                    chkF218b.setChecked(true);
                } else if (item.getF218b().equals("2")) {
                    chkF218b.setChecked(false);
                }
                if (item.getF218c().equals("1")) {
                    chkF218c.setChecked(true);
                } else if (item.getF218c().equals("2")) {
                    chkF218c.setChecked(false);
                }
                if (item.getF218d().equals("1")) {
                    chkF218d.setChecked(true);
                } else if (item.getF218d().equals("2")) {
                    chkF218d.setChecked(false);
                }
                if (item.getF218e().equals("1")) {
                    chkF218e.setChecked(true);
                } else if (item.getF218e().equals("2")) {
                    chkF218e.setChecked(false);
                }
                if (item.getF218f().equals("1")) {
                    chkF218f.setChecked(true);
                } else if (item.getF218f().equals("2")) {
                    chkF218f.setChecked(false);
                }
                if (item.getF218g().equals("1")) {
                    chkF218g.setChecked(true);
                } else if (item.getF218g().equals("2")) {
                    chkF218g.setChecked(false);
                }
                txtF219.setText(item.getF219());
                String[] d_rdogrpF2110 = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpF2110.length; i++) {
                    if (item.getF2110().equals(String.valueOf(d_rdogrpF2110[i]))) {
                        rb = (RadioButton) rdogrpF2110.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpF2111 = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpF2111.length; i++) {
                    if (item.getF2111().equals(String.valueOf(d_rdogrpF2111[i]))) {
                        rb = (RadioButton) rdogrpF2111.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtF2112.setText(item.getF2112());
            }
        } catch (Exception e) {
            Connection.MessageBox(Father.this, e.getMessage());
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