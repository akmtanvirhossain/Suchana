package org.icddrb.suchana;
//Android Manifest Code
//<activity android:name=".Cost1" android:label="Cost1" />

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Common.Connection;
import Common.Global;

public class Cost1 extends Activity {
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
    LinearLayout secMSlNo;
    View lineMSlNo;
    TextView VlblMSlNo;
    Spinner spnMSlNo;
    LinearLayout secLBH8;
    LinearLayout secH81;
    View lineH81;
    TextView VlblH81;
    RadioGroup rdogrpH81;
    RadioButton rdoH811;
    RadioButton rdoH812;
    LinearLayout secH811a;
    View lineH811a;
    TextView VlblH811a;
    RadioGroup rdogrpH811a;
    RadioButton rdoH811a1;
    RadioButton rdoH811a2;
    LinearLayout secH811b;
    View lineH811b;
    TextView VlblH811b;
    EditText txtH811b;
    LinearLayout secH811c;
    View lineH811c;
    TextView VlblH811c;
    RadioGroup rdogrpH811c;
    RadioButton rdoH811c1;
    RadioButton rdoH811c2;
    RadioButton rdoH811c3;
    LinearLayout secH811d;
    View lineH811d;
    TextView VlblH811d;
    EditText txtH811d;
    LinearLayout secH812a;
    View lineH812a;
    TextView VlblH812a;
    RadioGroup rdogrpH812a;
    RadioButton rdoH812a1;
    RadioButton rdoH812a2;
    LinearLayout secH812b;
    View lineH812b;
    TextView VlblH812b;
    EditText txtH812b;
    LinearLayout secH812c;
    View lineH812c;
    TextView VlblH812c;
    RadioGroup rdogrpH812c;
    RadioButton rdoH812c1;
    RadioButton rdoH812c2;
    RadioButton rdoH812c3;
    LinearLayout secH812d;
    View lineH812d;
    TextView VlblH812d;
    EditText txtH812d;
    LinearLayout secH813a;
    View lineH813a;
    TextView VlblH813a;
    RadioGroup rdogrpH813a;
    RadioButton rdoH813a1;
    RadioButton rdoH813a2;
    LinearLayout secH813b;
    View lineH813b;
    TextView VlblH813b;
    EditText txtH813b;
    LinearLayout secH813c;
    View lineH813c;
    TextView VlblH813c;
    RadioGroup rdogrpH813c;
    RadioButton rdoH813c1;
    RadioButton rdoH813c2;
    RadioButton rdoH813c3;
    LinearLayout secH813d;
    View lineH813d;
    TextView VlblH813d;
    EditText txtH813d;
    LinearLayout secH814a;
    View lineH814a;
    TextView VlblH814a;
    RadioGroup rdogrpH814a;
    RadioButton rdoH814a1;
    RadioButton rdoH814a2;
    LinearLayout secH814b;
    View lineH814b;
    TextView VlblH814b;
    EditText txtH814b;
    LinearLayout secH814c;
    View lineH814c;
    TextView VlblH814c;
    RadioGroup rdogrpH814c;
    RadioButton rdoH814c1;
    RadioButton rdoH814c2;
    RadioButton rdoH814c3;
    LinearLayout secH814d;
    View lineH814d;
    TextView VlblH814d;
    EditText txtH814d;
    LinearLayout secH815a;
    View lineH815a;
    TextView VlblH815a;
    RadioGroup rdogrpH815a;
    RadioButton rdoH815a1;
    RadioButton rdoH815a2;
    LinearLayout secH815b;
    View lineH815b;
    TextView VlblH815b;
    EditText txtH815b;
    LinearLayout secH815c;
    View lineH815c;
    TextView VlblH815c;
    RadioGroup rdogrpH815c;
    RadioButton rdoH815c1;
    RadioButton rdoH815c2;
    RadioButton rdoH815c3;
    LinearLayout secH815d;
    View lineH815d;
    TextView VlblH815d;
    EditText txtH815d;
    LinearLayout secH816a;
    View lineH816a;
    TextView VlblH816a;
    RadioGroup rdogrpH816a;
    RadioButton rdoH816a1;
    RadioButton rdoH816a2;
    LinearLayout secH816b;
    View lineH816b;
    TextView VlblH816b;
    EditText txtH816b;
    LinearLayout secH816c;
    View lineH816c;
    TextView VlblH816c;
    RadioGroup rdogrpH816c;
    RadioButton rdoH816c1;
    RadioButton rdoH816c2;
    RadioButton rdoH816c3;
    LinearLayout secH816d;
    View lineH816d;
    TextView VlblH816d;
    EditText txtH816d;
    LinearLayout secLBH82;
    LinearLayout secH821a;
    View lineH821a;
    TextView VlblH821a;
    RadioGroup rdogrpH821a;
    RadioButton rdoH821a1;
    RadioButton rdoH821a2;
    LinearLayout secH821b;
    View lineH821b;
    TextView VlblH821b;
    EditText txtH821b;
    LinearLayout secH821c;
    View lineH821c;
    TextView VlblH821c;
    RadioGroup rdogrpH821c;
    RadioButton rdoH821c1;
    RadioButton rdoH821c2;
    RadioButton rdoH821c3;
    LinearLayout secH821d;
    View lineH821d;
    TextView VlblH821d;
    EditText txtH821d;
    LinearLayout secLBH83;
    LinearLayout secH83;
    View lineH83;
    TextView VlblH83;
    RadioGroup rdogrpH83;
    RadioButton rdoH831;
    RadioButton rdoH832;
    LinearLayout secH831a;
    View lineH831a;
    TextView VlblH831a;
    RadioGroup rdogrpH831a;
    RadioButton rdoH831a1;
    RadioButton rdoH831a2;
    LinearLayout secH831b;
    View lineH831b;
    TextView VlblH831b;
    EditText txtH831b;
    LinearLayout secH831c;
    View lineH831c;
    TextView VlblH831c;
    RadioGroup rdogrpH831c;
    RadioButton rdoH831c1;
    RadioButton rdoH831c2;
    RadioButton rdoH831c3;
    LinearLayout secH831d;
    View lineH831d;
    TextView VlblH831d;
    EditText txtH831d;
    LinearLayout secH832a;
    View lineH832a;
    TextView VlblH832a;
    RadioGroup rdogrpH832a;
    RadioButton rdoH832a1;
    RadioButton rdoH832a2;
    LinearLayout secH832b;
    View lineH832b;
    TextView VlblH832b;
    EditText txtH832b;
    LinearLayout secH832c;
    View lineH832c;
    TextView VlblH832c;
    RadioGroup rdogrpH832c;
    RadioButton rdoH832c1;
    RadioButton rdoH832c2;
    RadioButton rdoH832c3;
    LinearLayout secH832d;
    View lineH832d;
    TextView VlblH832d;
    EditText txtH832d;
    LinearLayout secLBH84;
    LinearLayout secH84;
    View lineH84;
    TextView VlblH84;
    RadioGroup rdogrpH84;
    RadioButton rdoH841;
    RadioButton rdoH842;
    LinearLayout secH841a;
    View lineH841a;
    TextView VlblH841a;
    RadioGroup rdogrpH841a;
    RadioButton rdoH841a1;
    RadioButton rdoH841a2;
    LinearLayout secH841b;
    View lineH841b;
    TextView VlblH841b;
    EditText txtH841b;
    LinearLayout secH841c;
    View lineH841c;
    TextView VlblH841c;
    RadioGroup rdogrpH841c;
    RadioButton rdoH841c1;
    RadioButton rdoH841c2;
    RadioButton rdoH841c3;
    LinearLayout secH841d;
    View lineH841d;
    TextView VlblH841d;
    EditText txtH841d;
    LinearLayout secH842a;
    View lineH842a;
    TextView VlblH842a;
    RadioGroup rdogrpH842a;
    RadioButton rdoH842a1;
    RadioButton rdoH842a2;
    LinearLayout secH842b;
    View lineH842b;
    TextView VlblH842b;
    EditText txtH842b;
    LinearLayout secH842c;
    View lineH842c;
    TextView VlblH842c;
    RadioGroup rdogrpH842c;
    RadioButton rdoH842c1;
    RadioButton rdoH842c2;
    RadioButton rdoH842c3;
    LinearLayout secH842d;
    View lineH842d;
    TextView VlblH842d;
    EditText txtH842d;
    LinearLayout secLBH85;
    LinearLayout secH851a;
    View lineH851a;
    TextView VlblH851a;
    RadioGroup rdogrpH851a;
    RadioButton rdoH851a1;
    RadioButton rdoH851a2;
    LinearLayout secH851b;
    View lineH851b;
    TextView VlblH851b;
    EditText txtH851b;
    LinearLayout secH851c;
    View lineH851c;
    TextView VlblH851c;
    RadioGroup rdogrpH851c;
    RadioButton rdoH851c1;
    RadioButton rdoH851c2;
    RadioButton rdoH851c3;
    LinearLayout secH851d;
    View lineH851d;
    TextView VlblH851d;
    EditText txtH851d;
    LinearLayout secLBH86;
    LinearLayout secH86;
    View lineH86;
    TextView VlblH86;
    RadioGroup rdogrpH86;
    RadioButton rdoH861;
    RadioButton rdoH862;
    LinearLayout secH861a;
    View lineH861a;
    TextView VlblH861a;
    RadioGroup rdogrpH861a;
    RadioButton rdoH861a1;
    RadioButton rdoH861a2;
    LinearLayout secH861b;
    View lineH861b;
    TextView VlblH861b;
    EditText txtH861b;
    LinearLayout secH861c;
    View lineH861c;
    TextView VlblH861c;
    RadioGroup rdogrpH861c;
    RadioButton rdoH861c1;
    RadioButton rdoH861c2;
    RadioButton rdoH861c3;
    LinearLayout secH861d;
    View lineH861d;
    TextView VlblH861d;
    EditText txtH861d;
    LinearLayout secH862a;
    View lineH862a;
    TextView VlblH862a;
    RadioGroup rdogrpH862a;
    RadioButton rdoH862a1;
    RadioButton rdoH862a2;
    LinearLayout secH862b;
    View lineH862b;
    TextView VlblH862b;
    EditText txtH862b;
    LinearLayout secH862c;
    View lineH862c;
    TextView VlblH862c;
    RadioGroup rdogrpH862c;
    RadioButton rdoH862c1;
    RadioButton rdoH862c2;
    RadioButton rdoH862c3;
    LinearLayout secH862d;
    View lineH862d;
    TextView VlblH862d;
    EditText txtH862d;
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
            setContentView(R.layout.cost1);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(Cost1.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), HDDS.class);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(Cost1.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to start Cost 2 [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Cost2.class);
                            intent.putExtras(IDbundle);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            getApplicationContext().startActivity(intent);
                            finish();
                        }
                    });
                    adb.show();
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
            spnMSlNo.setAdapter(C.getArrayAdapter("Select '' union Select H21||'-'||H22 from Member where Rnd='" + RND + "' and SuchanaId='" + SUCHANAID + "'"));
            secLBH8 = (LinearLayout) findViewById(R.id.secLBH8);
            secH81 = (LinearLayout) findViewById(R.id.secH81);
            lineH81 = (View) findViewById(R.id.lineH81);
            VlblH81 = (TextView) findViewById(R.id.VlblH81);
            rdogrpH81 = (RadioGroup) findViewById(R.id.rdogrpH81);

            rdoH811 = (RadioButton) findViewById(R.id.rdoH811);
            rdoH812 = (RadioButton) findViewById(R.id.rdoH812);
            rdogrpH81.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH81 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH81.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH81.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH81[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {

                        secH811a.setVisibility(View.VISIBLE);
                        lineH811a.setVisibility(View.VISIBLE);

                        secH812a.setVisibility(View.VISIBLE);
                        lineH812a.setVisibility(View.VISIBLE);

                        secH813a.setVisibility(View.VISIBLE);
                        lineH813a.setVisibility(View.VISIBLE);

                        secH814a.setVisibility(View.VISIBLE);
                        lineH814a.setVisibility(View.VISIBLE);

                        secH815a.setVisibility(View.VISIBLE);
                        lineH815a.setVisibility(View.VISIBLE);

                        secH816a.setVisibility(View.VISIBLE);
                        lineH816a.setVisibility(View.VISIBLE);

                    } else {
                        secH811a.setVisibility(View.GONE);
                        lineH811a.setVisibility(View.GONE);
                        rdogrpH811a.clearCheck();
                        secH811b.setVisibility(View.GONE);
                        lineH811b.setVisibility(View.GONE);
                        txtH811b.setText("");
                        secH811c.setVisibility(View.GONE);
                        lineH811c.setVisibility(View.GONE);
                        rdogrpH811c.clearCheck();
                        secH811d.setVisibility(View.GONE);
                        lineH811d.setVisibility(View.GONE);
                        txtH811d.setText("");
                        secH812a.setVisibility(View.GONE);
                        lineH812a.setVisibility(View.GONE);
                        rdogrpH812a.clearCheck();
                        secH812b.setVisibility(View.GONE);
                        lineH812b.setVisibility(View.GONE);
                        txtH812b.setText("");
                        secH812c.setVisibility(View.GONE);
                        lineH812c.setVisibility(View.GONE);
                        rdogrpH812c.clearCheck();
                        secH812d.setVisibility(View.GONE);
                        lineH812d.setVisibility(View.GONE);
                        txtH812d.setText("");
                        secH813a.setVisibility(View.GONE);
                        lineH813a.setVisibility(View.GONE);
                        rdogrpH813a.clearCheck();
                        secH813b.setVisibility(View.GONE);
                        lineH813b.setVisibility(View.GONE);
                        txtH813b.setText("");
                        secH813c.setVisibility(View.GONE);
                        lineH813c.setVisibility(View.GONE);
                        rdogrpH813c.clearCheck();
                        secH813d.setVisibility(View.GONE);
                        lineH813d.setVisibility(View.GONE);
                        txtH813d.setText("");
                        secH814a.setVisibility(View.GONE);
                        lineH814a.setVisibility(View.GONE);
                        rdogrpH814a.clearCheck();
                        secH814b.setVisibility(View.GONE);
                        lineH814b.setVisibility(View.GONE);
                        txtH814b.setText("");
                        secH814c.setVisibility(View.GONE);
                        lineH814c.setVisibility(View.GONE);
                        rdogrpH814c.clearCheck();
                        secH814d.setVisibility(View.GONE);
                        lineH814d.setVisibility(View.GONE);
                        txtH814d.setText("");
                        secH815a.setVisibility(View.GONE);
                        lineH815a.setVisibility(View.GONE);
                        rdogrpH815a.clearCheck();
                        secH815b.setVisibility(View.GONE);
                        lineH815b.setVisibility(View.GONE);
                        txtH815b.setText("");
                        secH815c.setVisibility(View.GONE);
                        lineH815c.setVisibility(View.GONE);
                        rdogrpH815c.clearCheck();
                        secH815d.setVisibility(View.GONE);
                        lineH815d.setVisibility(View.GONE);
                        txtH815d.setText("");
                        secH816a.setVisibility(View.GONE);
                        lineH816a.setVisibility(View.GONE);
                        rdogrpH816a.clearCheck();
                        secH816b.setVisibility(View.GONE);
                        lineH816b.setVisibility(View.GONE);
                        txtH816b.setText("");
                        secH816c.setVisibility(View.GONE);
                        lineH816c.setVisibility(View.GONE);
                        rdogrpH816c.clearCheck();
                        secH816d.setVisibility(View.GONE);
                        lineH816d.setVisibility(View.GONE);
                        txtH816d.setText("");
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH811a = (LinearLayout) findViewById(R.id.secH811a);
            lineH811a = (View) findViewById(R.id.lineH811a);
            VlblH811a = (TextView) findViewById(R.id.VlblH811a);
            rdogrpH811a = (RadioGroup) findViewById(R.id.rdogrpH811a);

            rdoH811a1 = (RadioButton) findViewById(R.id.rdoH811a1);
            rdoH811a2 = (RadioButton) findViewById(R.id.rdoH811a2);
            rdogrpH811a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH811a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH811a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH811a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH811a[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                        secH811b.setVisibility(View.VISIBLE);
                        lineH811b.setVisibility(View.VISIBLE);
                        secH811c.setVisibility(View.VISIBLE);
                        lineH811c.setVisibility(View.VISIBLE);
                        secH811d.setVisibility(View.VISIBLE);
                        lineH811d.setVisibility(View.VISIBLE);
                    } else {
                        secH811b.setVisibility(View.GONE);
                        lineH811b.setVisibility(View.GONE);
                        txtH811b.setText("");
                        secH811c.setVisibility(View.GONE);
                        lineH811c.setVisibility(View.GONE);
                        rdogrpH811c.clearCheck();
                        secH811d.setVisibility(View.GONE);
                        lineH811d.setVisibility(View.GONE);
                        txtH811d.setText("");
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH811b = (LinearLayout) findViewById(R.id.secH811b);
            lineH811b = (View) findViewById(R.id.lineH811b);
            VlblH811b = (TextView) findViewById(R.id.VlblH811b);
            txtH811b = (EditText) findViewById(R.id.txtH811b);
            secH811c = (LinearLayout) findViewById(R.id.secH811c);
            lineH811c = (View) findViewById(R.id.lineH811c);
            VlblH811c = (TextView) findViewById(R.id.VlblH811c);
            rdogrpH811c = (RadioGroup) findViewById(R.id.rdogrpH811c);

            rdoH811c1 = (RadioButton) findViewById(R.id.rdoH811c1);
            rdoH811c2 = (RadioButton) findViewById(R.id.rdoH811c2);
            rdoH811c3 = (RadioButton) findViewById(R.id.rdoH811c3);
            secH811d = (LinearLayout) findViewById(R.id.secH811d);
            lineH811d = (View) findViewById(R.id.lineH811d);
            VlblH811d = (TextView) findViewById(R.id.VlblH811d);
            txtH811d = (EditText) findViewById(R.id.txtH811d);
            secH812a = (LinearLayout) findViewById(R.id.secH812a);
            lineH812a = (View) findViewById(R.id.lineH812a);
            VlblH812a = (TextView) findViewById(R.id.VlblH812a);
            rdogrpH812a = (RadioGroup) findViewById(R.id.rdogrpH812a);

            rdoH812a1 = (RadioButton) findViewById(R.id.rdoH812a1);
            rdoH812a2 = (RadioButton) findViewById(R.id.rdoH812a2);
            rdogrpH812a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH812a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH812a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH812a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH812a[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                        secH812b.setVisibility(View.VISIBLE);
                        lineH812b.setVisibility(View.VISIBLE);
                        secH812c.setVisibility(View.VISIBLE);
                        lineH812c.setVisibility(View.VISIBLE);
                        secH812d.setVisibility(View.VISIBLE);
                        lineH812d.setVisibility(View.VISIBLE);
                    } else {
                        secH812b.setVisibility(View.GONE);
                        lineH812b.setVisibility(View.GONE);
                        txtH812b.setText("");
                        secH812c.setVisibility(View.GONE);
                        lineH812c.setVisibility(View.GONE);
                        rdogrpH812c.clearCheck();
                        secH812d.setVisibility(View.GONE);
                        lineH812d.setVisibility(View.GONE);
                        txtH812d.setText("");
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH812b = (LinearLayout) findViewById(R.id.secH812b);
            lineH812b = (View) findViewById(R.id.lineH812b);
            VlblH812b = (TextView) findViewById(R.id.VlblH812b);
            txtH812b = (EditText) findViewById(R.id.txtH812b);
            secH812c = (LinearLayout) findViewById(R.id.secH812c);
            lineH812c = (View) findViewById(R.id.lineH812c);
            VlblH812c = (TextView) findViewById(R.id.VlblH812c);
            rdogrpH812c = (RadioGroup) findViewById(R.id.rdogrpH812c);

            rdoH812c1 = (RadioButton) findViewById(R.id.rdoH812c1);
            rdoH812c2 = (RadioButton) findViewById(R.id.rdoH812c2);
            rdoH812c3 = (RadioButton) findViewById(R.id.rdoH812c3);
            secH812d = (LinearLayout) findViewById(R.id.secH812d);
            lineH812d = (View) findViewById(R.id.lineH812d);
            VlblH812d = (TextView) findViewById(R.id.VlblH812d);
            txtH812d = (EditText) findViewById(R.id.txtH812d);
            secH813a = (LinearLayout) findViewById(R.id.secH813a);
            lineH813a = (View) findViewById(R.id.lineH813a);
            VlblH813a = (TextView) findViewById(R.id.VlblH813a);
            rdogrpH813a = (RadioGroup) findViewById(R.id.rdogrpH813a);

            rdoH813a1 = (RadioButton) findViewById(R.id.rdoH813a1);
            rdoH813a2 = (RadioButton) findViewById(R.id.rdoH813a2);
            rdogrpH813a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH813a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH813a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH813a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH813a[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                        secH813b.setVisibility(View.VISIBLE);
                        lineH813b.setVisibility(View.VISIBLE);
                        secH813c.setVisibility(View.VISIBLE);
                        lineH813c.setVisibility(View.VISIBLE);
                        secH813d.setVisibility(View.VISIBLE);
                        lineH813d.setVisibility(View.VISIBLE);
                    } else {
                        secH813b.setVisibility(View.GONE);
                        lineH813b.setVisibility(View.GONE);
                        txtH813b.setText("");
                        secH813c.setVisibility(View.GONE);
                        lineH813c.setVisibility(View.GONE);
                        rdogrpH813c.clearCheck();
                        secH813d.setVisibility(View.GONE);
                        lineH813d.setVisibility(View.GONE);
                        txtH813d.setText("");
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH813b = (LinearLayout) findViewById(R.id.secH813b);
            lineH813b = (View) findViewById(R.id.lineH813b);
            VlblH813b = (TextView) findViewById(R.id.VlblH813b);
            txtH813b = (EditText) findViewById(R.id.txtH813b);
            secH813c = (LinearLayout) findViewById(R.id.secH813c);
            lineH813c = (View) findViewById(R.id.lineH813c);
            VlblH813c = (TextView) findViewById(R.id.VlblH813c);
            rdogrpH813c = (RadioGroup) findViewById(R.id.rdogrpH813c);

            rdoH813c1 = (RadioButton) findViewById(R.id.rdoH813c1);
            rdoH813c2 = (RadioButton) findViewById(R.id.rdoH813c2);
            rdoH813c3 = (RadioButton) findViewById(R.id.rdoH813c3);
            secH813d = (LinearLayout) findViewById(R.id.secH813d);
            lineH813d = (View) findViewById(R.id.lineH813d);
            VlblH813d = (TextView) findViewById(R.id.VlblH813d);
            txtH813d = (EditText) findViewById(R.id.txtH813d);
            secH814a = (LinearLayout) findViewById(R.id.secH814a);
            lineH814a = (View) findViewById(R.id.lineH814a);
            VlblH814a = (TextView) findViewById(R.id.VlblH814a);
            rdogrpH814a = (RadioGroup) findViewById(R.id.rdogrpH814a);

            rdoH814a1 = (RadioButton) findViewById(R.id.rdoH814a1);
            rdoH814a2 = (RadioButton) findViewById(R.id.rdoH814a2);
            rdogrpH814a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH814a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH814a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH814a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH814a[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                        secH814b.setVisibility(View.VISIBLE);
                        lineH814b.setVisibility(View.VISIBLE);
                        secH814c.setVisibility(View.VISIBLE);
                        lineH814c.setVisibility(View.VISIBLE);
                        secH814d.setVisibility(View.VISIBLE);
                        lineH814d.setVisibility(View.VISIBLE);
                    } else {
                        secH814b.setVisibility(View.GONE);
                        lineH814b.setVisibility(View.GONE);
                        txtH814b.setText("");
                        secH814c.setVisibility(View.GONE);
                        lineH814c.setVisibility(View.GONE);
                        rdogrpH814c.clearCheck();
                        secH814d.setVisibility(View.GONE);
                        lineH814d.setVisibility(View.GONE);
                        txtH814d.setText("");
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH814b = (LinearLayout) findViewById(R.id.secH814b);
            lineH814b = (View) findViewById(R.id.lineH814b);
            VlblH814b = (TextView) findViewById(R.id.VlblH814b);
            txtH814b = (EditText) findViewById(R.id.txtH814b);
            secH814c = (LinearLayout) findViewById(R.id.secH814c);
            lineH814c = (View) findViewById(R.id.lineH814c);
            VlblH814c = (TextView) findViewById(R.id.VlblH814c);
            rdogrpH814c = (RadioGroup) findViewById(R.id.rdogrpH814c);

            rdoH814c1 = (RadioButton) findViewById(R.id.rdoH814c1);
            rdoH814c2 = (RadioButton) findViewById(R.id.rdoH814c2);
            rdoH814c3 = (RadioButton) findViewById(R.id.rdoH814c3);
            secH814d = (LinearLayout) findViewById(R.id.secH814d);
            lineH814d = (View) findViewById(R.id.lineH814d);
            VlblH814d = (TextView) findViewById(R.id.VlblH814d);
            txtH814d = (EditText) findViewById(R.id.txtH814d);
            secH815a = (LinearLayout) findViewById(R.id.secH815a);
            lineH815a = (View) findViewById(R.id.lineH815a);
            VlblH815a = (TextView) findViewById(R.id.VlblH815a);
            rdogrpH815a = (RadioGroup) findViewById(R.id.rdogrpH815a);

            rdoH815a1 = (RadioButton) findViewById(R.id.rdoH815a1);
            rdoH815a2 = (RadioButton) findViewById(R.id.rdoH815a2);
            rdogrpH815a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH815a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH815a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH815a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH815a[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                        secH815b.setVisibility(View.VISIBLE);
                        lineH815b.setVisibility(View.VISIBLE);
                        secH815c.setVisibility(View.VISIBLE);
                        lineH815c.setVisibility(View.VISIBLE);
                        secH815d.setVisibility(View.VISIBLE);
                        lineH815d.setVisibility(View.VISIBLE);
                    } else {
                        secH815b.setVisibility(View.GONE);
                        lineH815b.setVisibility(View.GONE);
                        txtH815b.setText("");
                        secH815c.setVisibility(View.GONE);
                        lineH815c.setVisibility(View.GONE);
                        rdogrpH815c.clearCheck();
                        secH815d.setVisibility(View.GONE);
                        lineH815d.setVisibility(View.GONE);
                        txtH815d.setText("");
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH815b = (LinearLayout) findViewById(R.id.secH815b);
            lineH815b = (View) findViewById(R.id.lineH815b);
            VlblH815b = (TextView) findViewById(R.id.VlblH815b);
            txtH815b = (EditText) findViewById(R.id.txtH815b);
            secH815c = (LinearLayout) findViewById(R.id.secH815c);
            lineH815c = (View) findViewById(R.id.lineH815c);
            VlblH815c = (TextView) findViewById(R.id.VlblH815c);
            rdogrpH815c = (RadioGroup) findViewById(R.id.rdogrpH815c);

            rdoH815c1 = (RadioButton) findViewById(R.id.rdoH815c1);
            rdoH815c2 = (RadioButton) findViewById(R.id.rdoH815c2);
            rdoH815c3 = (RadioButton) findViewById(R.id.rdoH815c3);
            secH815d = (LinearLayout) findViewById(R.id.secH815d);
            lineH815d = (View) findViewById(R.id.lineH815d);
            VlblH815d = (TextView) findViewById(R.id.VlblH815d);
            txtH815d = (EditText) findViewById(R.id.txtH815d);
            secH816a = (LinearLayout) findViewById(R.id.secH816a);
            lineH816a = (View) findViewById(R.id.lineH816a);
            VlblH816a = (TextView) findViewById(R.id.VlblH816a);
            rdogrpH816a = (RadioGroup) findViewById(R.id.rdogrpH816a);

            rdoH816a1 = (RadioButton) findViewById(R.id.rdoH816a1);
            rdoH816a2 = (RadioButton) findViewById(R.id.rdoH816a2);
            rdogrpH816a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH816a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH816a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH816a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH816a[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                        secH816b.setVisibility(View.VISIBLE);
                        lineH816b.setVisibility(View.VISIBLE);
                        secH816c.setVisibility(View.VISIBLE);
                        lineH816c.setVisibility(View.VISIBLE);
                        secH816d.setVisibility(View.VISIBLE);
                        lineH816d.setVisibility(View.VISIBLE);
                    } else {
                        secH816b.setVisibility(View.GONE);
                        lineH816b.setVisibility(View.GONE);
                        txtH816b.setText("");
                        secH816c.setVisibility(View.GONE);
                        lineH816c.setVisibility(View.GONE);
                        rdogrpH816c.clearCheck();
                        secH816d.setVisibility(View.GONE);
                        lineH816d.setVisibility(View.GONE);
                        txtH816d.setText("");
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH816b = (LinearLayout) findViewById(R.id.secH816b);
            lineH816b = (View) findViewById(R.id.lineH816b);
            VlblH816b = (TextView) findViewById(R.id.VlblH816b);
            txtH816b = (EditText) findViewById(R.id.txtH816b);
            secH816c = (LinearLayout) findViewById(R.id.secH816c);
            lineH816c = (View) findViewById(R.id.lineH816c);
            VlblH816c = (TextView) findViewById(R.id.VlblH816c);
            rdogrpH816c = (RadioGroup) findViewById(R.id.rdogrpH816c);

            rdoH816c1 = (RadioButton) findViewById(R.id.rdoH816c1);
            rdoH816c2 = (RadioButton) findViewById(R.id.rdoH816c2);
            rdoH816c3 = (RadioButton) findViewById(R.id.rdoH816c3);
            secH816d = (LinearLayout) findViewById(R.id.secH816d);
            lineH816d = (View) findViewById(R.id.lineH816d);
            VlblH816d = (TextView) findViewById(R.id.VlblH816d);
            txtH816d = (EditText) findViewById(R.id.txtH816d);


            secLBH82 = (LinearLayout) findViewById(R.id.secLBH82);
            secH821a = (LinearLayout) findViewById(R.id.secH821a);
            lineH821a = (View) findViewById(R.id.lineH821a);
            VlblH821a = (TextView) findViewById(R.id.VlblH821a);
            rdogrpH821a = (RadioGroup) findViewById(R.id.rdogrpH821a);

            rdoH821a1 = (RadioButton) findViewById(R.id.rdoH821a1);
            rdoH821a2 = (RadioButton) findViewById(R.id.rdoH821a2);
            rdogrpH821a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH821a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH821a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH821a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH821a[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                        secH821b.setVisibility(View.VISIBLE);
                        lineH821b.setVisibility(View.VISIBLE);
                        secH821c.setVisibility(View.VISIBLE);
                        lineH821c.setVisibility(View.VISIBLE);
                        secH821d.setVisibility(View.VISIBLE);
                        lineH821d.setVisibility(View.VISIBLE);
                    } else {
                        secH821b.setVisibility(View.GONE);
                        lineH821b.setVisibility(View.GONE);
                        txtH821b.setText("");
                        secH821c.setVisibility(View.GONE);
                        lineH821c.setVisibility(View.GONE);
                        rdogrpH821c.clearCheck();
                        secH821d.setVisibility(View.GONE);
                        lineH821d.setVisibility(View.GONE);
                        txtH821d.setText("");
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH821b = (LinearLayout) findViewById(R.id.secH821b);
            lineH821b = (View) findViewById(R.id.lineH821b);
            VlblH821b = (TextView) findViewById(R.id.VlblH821b);
            txtH821b = (EditText) findViewById(R.id.txtH821b);
            secH821c = (LinearLayout) findViewById(R.id.secH821c);
            lineH821c = (View) findViewById(R.id.lineH821c);
            VlblH821c = (TextView) findViewById(R.id.VlblH821c);
            rdogrpH821c = (RadioGroup) findViewById(R.id.rdogrpH821c);

            rdoH821c1 = (RadioButton) findViewById(R.id.rdoH821c1);
            rdoH821c2 = (RadioButton) findViewById(R.id.rdoH821c2);
            rdoH821c3 = (RadioButton) findViewById(R.id.rdoH821c3);
            secH821d = (LinearLayout) findViewById(R.id.secH821d);
            lineH821d = (View) findViewById(R.id.lineH821d);
            VlblH821d = (TextView) findViewById(R.id.VlblH821d);
            txtH821d = (EditText) findViewById(R.id.txtH821d);
            secLBH83 = (LinearLayout) findViewById(R.id.secLBH83);
            secH83 = (LinearLayout) findViewById(R.id.secH83);
            lineH83 = (View) findViewById(R.id.lineH83);
            VlblH83 = (TextView) findViewById(R.id.VlblH83);
            rdogrpH83 = (RadioGroup) findViewById(R.id.rdogrpH83);

            rdoH831 = (RadioButton) findViewById(R.id.rdoH831);
            rdoH832 = (RadioButton) findViewById(R.id.rdoH832);
            rdogrpH83.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH83 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH83.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH83.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH83[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {

                        secH831a.setVisibility(View.VISIBLE);
                        lineH831a.setVisibility(View.VISIBLE);

                        secH832a.setVisibility(View.VISIBLE);
                        lineH832a.setVisibility(View.VISIBLE);

                    } else {
                        secH831a.setVisibility(View.GONE);
                        lineH831a.setVisibility(View.GONE);
                        rdogrpH831a.clearCheck();
                        secH831b.setVisibility(View.GONE);
                        lineH831b.setVisibility(View.GONE);
                        txtH831b.setText("");
                        secH831c.setVisibility(View.GONE);
                        lineH831c.setVisibility(View.GONE);
                        rdogrpH831c.clearCheck();
                        secH831d.setVisibility(View.GONE);
                        lineH831d.setVisibility(View.GONE);
                        txtH831d.setText("");
                        secH832a.setVisibility(View.GONE);
                        lineH832a.setVisibility(View.GONE);
                        rdogrpH832a.clearCheck();
                        secH832b.setVisibility(View.GONE);
                        lineH832b.setVisibility(View.GONE);
                        txtH832b.setText("");
                        secH832c.setVisibility(View.GONE);
                        lineH832c.setVisibility(View.GONE);
                        rdogrpH832c.clearCheck();
                        secH832d.setVisibility(View.GONE);
                        lineH832d.setVisibility(View.GONE);
                        txtH832d.setText("");
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH831a = (LinearLayout) findViewById(R.id.secH831a);
            lineH831a = (View) findViewById(R.id.lineH831a);
            VlblH831a = (TextView) findViewById(R.id.VlblH831a);
            rdogrpH831a = (RadioGroup) findViewById(R.id.rdogrpH831a);

            rdoH831a1 = (RadioButton) findViewById(R.id.rdoH831a1);
            rdoH831a2 = (RadioButton) findViewById(R.id.rdoH831a2);
            rdogrpH831a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH831a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH831a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH831a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH831a[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                        secH831b.setVisibility(View.VISIBLE);
                        lineH831b.setVisibility(View.VISIBLE);
                        secH831c.setVisibility(View.VISIBLE);
                        lineH831c.setVisibility(View.VISIBLE);
                        secH831d.setVisibility(View.VISIBLE);
                        lineH831d.setVisibility(View.VISIBLE);
                    } else {
                        secH831b.setVisibility(View.GONE);
                        lineH831b.setVisibility(View.GONE);
                        txtH831b.setText("");
                        secH831c.setVisibility(View.GONE);
                        lineH831c.setVisibility(View.GONE);
                        rdogrpH831c.clearCheck();
                        secH831d.setVisibility(View.GONE);
                        lineH831d.setVisibility(View.GONE);
                        txtH831d.setText("");
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH831b = (LinearLayout) findViewById(R.id.secH831b);
            lineH831b = (View) findViewById(R.id.lineH831b);
            VlblH831b = (TextView) findViewById(R.id.VlblH831b);
            txtH831b = (EditText) findViewById(R.id.txtH831b);
            secH831c = (LinearLayout) findViewById(R.id.secH831c);
            lineH831c = (View) findViewById(R.id.lineH831c);
            VlblH831c = (TextView) findViewById(R.id.VlblH831c);
            rdogrpH831c = (RadioGroup) findViewById(R.id.rdogrpH831c);

            rdoH831c1 = (RadioButton) findViewById(R.id.rdoH831c1);
            rdoH831c2 = (RadioButton) findViewById(R.id.rdoH831c2);
            rdoH831c3 = (RadioButton) findViewById(R.id.rdoH831c3);
            secH831d = (LinearLayout) findViewById(R.id.secH831d);
            lineH831d = (View) findViewById(R.id.lineH831d);
            VlblH831d = (TextView) findViewById(R.id.VlblH831d);
            txtH831d = (EditText) findViewById(R.id.txtH831d);
            secH832a = (LinearLayout) findViewById(R.id.secH832a);
            lineH832a = (View) findViewById(R.id.lineH832a);
            VlblH832a = (TextView) findViewById(R.id.VlblH832a);
            rdogrpH832a = (RadioGroup) findViewById(R.id.rdogrpH832a);

            rdoH832a1 = (RadioButton) findViewById(R.id.rdoH832a1);
            rdoH832a2 = (RadioButton) findViewById(R.id.rdoH832a2);
            rdogrpH832a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH832a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH832a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH832a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH832a[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                        secH832b.setVisibility(View.VISIBLE);
                        lineH832b.setVisibility(View.VISIBLE);
                        secH832c.setVisibility(View.VISIBLE);
                        lineH832c.setVisibility(View.VISIBLE);
                        secH832d.setVisibility(View.VISIBLE);
                        lineH832d.setVisibility(View.VISIBLE);
                    } else {
                        secH832b.setVisibility(View.GONE);
                        lineH832b.setVisibility(View.GONE);
                        txtH832b.setText("");
                        secH832c.setVisibility(View.GONE);
                        lineH832c.setVisibility(View.GONE);
                        rdogrpH832c.clearCheck();
                        secH832d.setVisibility(View.GONE);
                        lineH832d.setVisibility(View.GONE);
                        txtH832d.setText("");
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH832b = (LinearLayout) findViewById(R.id.secH832b);
            lineH832b = (View) findViewById(R.id.lineH832b);
            VlblH832b = (TextView) findViewById(R.id.VlblH832b);
            txtH832b = (EditText) findViewById(R.id.txtH832b);
            secH832c = (LinearLayout) findViewById(R.id.secH832c);
            lineH832c = (View) findViewById(R.id.lineH832c);
            VlblH832c = (TextView) findViewById(R.id.VlblH832c);
            rdogrpH832c = (RadioGroup) findViewById(R.id.rdogrpH832c);

            rdoH832c1 = (RadioButton) findViewById(R.id.rdoH832c1);
            rdoH832c2 = (RadioButton) findViewById(R.id.rdoH832c2);
            rdoH832c3 = (RadioButton) findViewById(R.id.rdoH832c3);
            secH832d = (LinearLayout) findViewById(R.id.secH832d);
            lineH832d = (View) findViewById(R.id.lineH832d);
            VlblH832d = (TextView) findViewById(R.id.VlblH832d);
            txtH832d = (EditText) findViewById(R.id.txtH832d);
            secLBH84 = (LinearLayout) findViewById(R.id.secLBH84);
            secH84 = (LinearLayout) findViewById(R.id.secH84);
            lineH84 = (View) findViewById(R.id.lineH84);
            VlblH84 = (TextView) findViewById(R.id.VlblH84);
            rdogrpH84 = (RadioGroup) findViewById(R.id.rdogrpH84);

            rdoH841 = (RadioButton) findViewById(R.id.rdoH841);
            rdoH842 = (RadioButton) findViewById(R.id.rdoH842);
            rdogrpH84.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH84 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH84.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH84.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH84[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                        secH841a.setVisibility(View.VISIBLE);
                        lineH841a.setVisibility(View.VISIBLE);

                        secH842a.setVisibility(View.VISIBLE);
                        lineH842a.setVisibility(View.VISIBLE);

                    } else {
                        secH841a.setVisibility(View.GONE);
                        lineH841a.setVisibility(View.GONE);
                        rdogrpH841a.clearCheck();
                        secH841b.setVisibility(View.GONE);
                        lineH841b.setVisibility(View.GONE);
                        txtH841b.setText("");
                        secH841c.setVisibility(View.GONE);
                        lineH841c.setVisibility(View.GONE);
                        rdogrpH841c.clearCheck();
                        secH841d.setVisibility(View.GONE);
                        lineH841d.setVisibility(View.GONE);
                        txtH841d.setText("");
                        secH842a.setVisibility(View.GONE);
                        lineH842a.setVisibility(View.GONE);
                        rdogrpH842a.clearCheck();
                        secH842b.setVisibility(View.GONE);
                        lineH842b.setVisibility(View.GONE);
                        txtH842b.setText("");
                        secH842c.setVisibility(View.GONE);
                        lineH842c.setVisibility(View.GONE);
                        rdogrpH842c.clearCheck();
                        secH842d.setVisibility(View.GONE);
                        lineH842d.setVisibility(View.GONE);
                        txtH842d.setText("");
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH841a = (LinearLayout) findViewById(R.id.secH841a);
            lineH841a = (View) findViewById(R.id.lineH841a);
            VlblH841a = (TextView) findViewById(R.id.VlblH841a);
            rdogrpH841a = (RadioGroup) findViewById(R.id.rdogrpH841a);

            rdoH841a1 = (RadioButton) findViewById(R.id.rdoH841a1);
            rdoH841a2 = (RadioButton) findViewById(R.id.rdoH841a2);
            rdogrpH841a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH841a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH841a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH841a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH841a[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                        secH841b.setVisibility(View.VISIBLE);
                        lineH841b.setVisibility(View.VISIBLE);
                        secH841c.setVisibility(View.VISIBLE);
                        lineH841c.setVisibility(View.VISIBLE);
                        secH841d.setVisibility(View.VISIBLE);
                        lineH841d.setVisibility(View.VISIBLE);
                    } else {
                        secH841b.setVisibility(View.GONE);
                        lineH841b.setVisibility(View.GONE);
                        txtH841b.setText("");
                        secH841c.setVisibility(View.GONE);
                        lineH841c.setVisibility(View.GONE);
                        rdogrpH841c.clearCheck();
                        secH841d.setVisibility(View.GONE);
                        lineH841d.setVisibility(View.GONE);
                        txtH841d.setText("");
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH841b = (LinearLayout) findViewById(R.id.secH841b);
            lineH841b = (View) findViewById(R.id.lineH841b);
            VlblH841b = (TextView) findViewById(R.id.VlblH841b);
            txtH841b = (EditText) findViewById(R.id.txtH841b);
            secH841c = (LinearLayout) findViewById(R.id.secH841c);
            lineH841c = (View) findViewById(R.id.lineH841c);
            VlblH841c = (TextView) findViewById(R.id.VlblH841c);
            rdogrpH841c = (RadioGroup) findViewById(R.id.rdogrpH841c);

            rdoH841c1 = (RadioButton) findViewById(R.id.rdoH841c1);
            rdoH841c2 = (RadioButton) findViewById(R.id.rdoH841c2);
            rdoH841c3 = (RadioButton) findViewById(R.id.rdoH841c3);
            secH841d = (LinearLayout) findViewById(R.id.secH841d);
            lineH841d = (View) findViewById(R.id.lineH841d);
            VlblH841d = (TextView) findViewById(R.id.VlblH841d);
            txtH841d = (EditText) findViewById(R.id.txtH841d);
            secH842a = (LinearLayout) findViewById(R.id.secH842a);
            lineH842a = (View) findViewById(R.id.lineH842a);
            VlblH842a = (TextView) findViewById(R.id.VlblH842a);
            rdogrpH842a = (RadioGroup) findViewById(R.id.rdogrpH842a);

            rdoH842a1 = (RadioButton) findViewById(R.id.rdoH842a1);
            rdoH842a2 = (RadioButton) findViewById(R.id.rdoH842a2);
            rdogrpH842a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH842a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH842a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH842a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH842a[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                        secH842b.setVisibility(View.VISIBLE);
                        lineH842b.setVisibility(View.VISIBLE);
                        secH842c.setVisibility(View.VISIBLE);
                        lineH842c.setVisibility(View.VISIBLE);
                        secH842d.setVisibility(View.VISIBLE);
                        lineH842d.setVisibility(View.VISIBLE);
                    } else {
                        secH842b.setVisibility(View.GONE);
                        lineH842b.setVisibility(View.GONE);
                        txtH842b.setText("");
                        secH842c.setVisibility(View.GONE);
                        lineH842c.setVisibility(View.GONE);
                        rdogrpH842c.clearCheck();
                        secH842d.setVisibility(View.GONE);
                        lineH842d.setVisibility(View.GONE);
                        txtH842d.setText("");
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH842b = (LinearLayout) findViewById(R.id.secH842b);
            lineH842b = (View) findViewById(R.id.lineH842b);
            VlblH842b = (TextView) findViewById(R.id.VlblH842b);
            txtH842b = (EditText) findViewById(R.id.txtH842b);
            secH842c = (LinearLayout) findViewById(R.id.secH842c);
            lineH842c = (View) findViewById(R.id.lineH842c);
            VlblH842c = (TextView) findViewById(R.id.VlblH842c);
            rdogrpH842c = (RadioGroup) findViewById(R.id.rdogrpH842c);

            rdoH842c1 = (RadioButton) findViewById(R.id.rdoH842c1);
            rdoH842c2 = (RadioButton) findViewById(R.id.rdoH842c2);
            rdoH842c3 = (RadioButton) findViewById(R.id.rdoH842c3);
            secH842d = (LinearLayout) findViewById(R.id.secH842d);
            lineH842d = (View) findViewById(R.id.lineH842d);
            VlblH842d = (TextView) findViewById(R.id.VlblH842d);
            txtH842d = (EditText) findViewById(R.id.txtH842d);
            secLBH85 = (LinearLayout) findViewById(R.id.secLBH85);
            secH851a = (LinearLayout) findViewById(R.id.secH851a);
            lineH851a = (View) findViewById(R.id.lineH851a);
            VlblH851a = (TextView) findViewById(R.id.VlblH851a);
            rdogrpH851a = (RadioGroup) findViewById(R.id.rdogrpH851a);

            rdoH851a1 = (RadioButton) findViewById(R.id.rdoH851a1);
            rdoH851a2 = (RadioButton) findViewById(R.id.rdoH851a2);
            rdogrpH851a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH851a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH851a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH851a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH851a[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                        secH851b.setVisibility(View.VISIBLE);
                        lineH851b.setVisibility(View.VISIBLE);
                        secH851c.setVisibility(View.VISIBLE);
                        lineH851c.setVisibility(View.VISIBLE);
                        secH851d.setVisibility(View.VISIBLE);
                        lineH851d.setVisibility(View.VISIBLE);
                    } else {
                        secH851b.setVisibility(View.GONE);
                        lineH851b.setVisibility(View.GONE);
                        txtH851b.setText("");
                        secH851c.setVisibility(View.GONE);
                        lineH851c.setVisibility(View.GONE);
                        rdogrpH851c.clearCheck();
                        secH851d.setVisibility(View.GONE);
                        lineH851d.setVisibility(View.GONE);
                        txtH851d.setText("");
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH851b = (LinearLayout) findViewById(R.id.secH851b);
            lineH851b = (View) findViewById(R.id.lineH851b);
            VlblH851b = (TextView) findViewById(R.id.VlblH851b);
            txtH851b = (EditText) findViewById(R.id.txtH851b);
            secH851c = (LinearLayout) findViewById(R.id.secH851c);
            lineH851c = (View) findViewById(R.id.lineH851c);
            VlblH851c = (TextView) findViewById(R.id.VlblH851c);
            rdogrpH851c = (RadioGroup) findViewById(R.id.rdogrpH851c);

            rdoH851c1 = (RadioButton) findViewById(R.id.rdoH851c1);
            rdoH851c2 = (RadioButton) findViewById(R.id.rdoH851c2);
            rdoH851c3 = (RadioButton) findViewById(R.id.rdoH851c3);
            secH851d = (LinearLayout) findViewById(R.id.secH851d);
            lineH851d = (View) findViewById(R.id.lineH851d);
            VlblH851d = (TextView) findViewById(R.id.VlblH851d);
            txtH851d = (EditText) findViewById(R.id.txtH851d);
            secLBH86 = (LinearLayout) findViewById(R.id.secLBH86);
            secH86 = (LinearLayout) findViewById(R.id.secH86);
            lineH86 = (View) findViewById(R.id.lineH86);
            VlblH86 = (TextView) findViewById(R.id.VlblH86);
            rdogrpH86 = (RadioGroup) findViewById(R.id.rdogrpH86);

            rdoH861 = (RadioButton) findViewById(R.id.rdoH861);
            rdoH862 = (RadioButton) findViewById(R.id.rdoH862);
            rdogrpH86.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH86 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH86.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH86.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH86[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                        secH861a.setVisibility(View.VISIBLE);
                        lineH861a.setVisibility(View.VISIBLE);

                        secH862a.setVisibility(View.VISIBLE);
                        lineH862a.setVisibility(View.VISIBLE);

                    } else {
                        secH861a.setVisibility(View.GONE);
                        lineH861a.setVisibility(View.GONE);
                        rdogrpH861a.clearCheck();
                        secH861b.setVisibility(View.GONE);
                        lineH861b.setVisibility(View.GONE);
                        txtH861b.setText("");
                        secH861c.setVisibility(View.GONE);
                        lineH861c.setVisibility(View.GONE);
                        rdogrpH861c.clearCheck();
                        secH861d.setVisibility(View.GONE);
                        lineH861d.setVisibility(View.GONE);
                        txtH861d.setText("");
                        secH862a.setVisibility(View.GONE);
                        lineH862a.setVisibility(View.GONE);
                        rdogrpH862a.clearCheck();
                        secH862b.setVisibility(View.GONE);
                        lineH862b.setVisibility(View.GONE);
                        txtH862b.setText("");
                        secH862c.setVisibility(View.GONE);
                        lineH862c.setVisibility(View.GONE);
                        rdogrpH862c.clearCheck();
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH861a = (LinearLayout) findViewById(R.id.secH861a);
            lineH861a = (View) findViewById(R.id.lineH861a);
            VlblH861a = (TextView) findViewById(R.id.VlblH861a);
            rdogrpH861a = (RadioGroup) findViewById(R.id.rdogrpH861a);

            rdoH861a1 = (RadioButton) findViewById(R.id.rdoH861a1);
            rdoH861a2 = (RadioButton) findViewById(R.id.rdoH861a2);
            rdogrpH861a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH861a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH861a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH861a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH861a[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                        secH861b.setVisibility(View.VISIBLE);
                        lineH861b.setVisibility(View.VISIBLE);
                        secH861c.setVisibility(View.VISIBLE);
                        lineH861c.setVisibility(View.VISIBLE);
                        secH861d.setVisibility(View.VISIBLE);
                        lineH861d.setVisibility(View.VISIBLE);
                    } else {
                        secH861b.setVisibility(View.GONE);
                        lineH861b.setVisibility(View.GONE);
                        txtH861b.setText("");
                        secH861c.setVisibility(View.GONE);
                        lineH861c.setVisibility(View.GONE);
                        rdogrpH861c.clearCheck();
                        secH861d.setVisibility(View.GONE);
                        lineH861d.setVisibility(View.GONE);
                        txtH861d.setText("");
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH861b = (LinearLayout) findViewById(R.id.secH861b);
            lineH861b = (View) findViewById(R.id.lineH861b);
            VlblH861b = (TextView) findViewById(R.id.VlblH861b);
            txtH861b = (EditText) findViewById(R.id.txtH861b);
            secH861c = (LinearLayout) findViewById(R.id.secH861c);
            lineH861c = (View) findViewById(R.id.lineH861c);
            VlblH861c = (TextView) findViewById(R.id.VlblH861c);
            rdogrpH861c = (RadioGroup) findViewById(R.id.rdogrpH861c);

            rdoH861c1 = (RadioButton) findViewById(R.id.rdoH861c1);
            rdoH861c2 = (RadioButton) findViewById(R.id.rdoH861c2);
            rdoH861c3 = (RadioButton) findViewById(R.id.rdoH861c3);
            secH861d = (LinearLayout) findViewById(R.id.secH861d);
            lineH861d = (View) findViewById(R.id.lineH861d);
            VlblH861d = (TextView) findViewById(R.id.VlblH861d);
            txtH861d = (EditText) findViewById(R.id.txtH861d);
            secH862a = (LinearLayout) findViewById(R.id.secH862a);
            lineH862a = (View) findViewById(R.id.lineH862a);
            VlblH862a = (TextView) findViewById(R.id.VlblH862a);
            rdogrpH862a = (RadioGroup) findViewById(R.id.rdogrpH862a);

            rdoH862a1 = (RadioButton) findViewById(R.id.rdoH862a1);
            rdoH862a2 = (RadioButton) findViewById(R.id.rdoH862a2);
            rdogrpH862a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH862a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH862a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH862a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH862a[i];
                    }

                    if (rbData.equalsIgnoreCase("1")) {
                        secH862b.setVisibility(View.VISIBLE);
                        lineH862b.setVisibility(View.VISIBLE);
                        secH862c.setVisibility(View.VISIBLE);
                        lineH862c.setVisibility(View.VISIBLE);
                        secH862d.setVisibility(View.VISIBLE);
                        lineH862d.setVisibility(View.VISIBLE);

                    } else {
                        secH862b.setVisibility(View.GONE);
                        lineH862b.setVisibility(View.GONE);
                        txtH862b.setText("");
                        secH862c.setVisibility(View.GONE);
                        lineH862c.setVisibility(View.GONE);
                        rdogrpH862c.clearCheck();
                        secH862d.setVisibility(View.GONE);
                        lineH862d.setVisibility(View.GONE);
                        txtH862d.setText("");

                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH862b = (LinearLayout) findViewById(R.id.secH862b);
            lineH862b = (View) findViewById(R.id.lineH862b);
            VlblH862b = (TextView) findViewById(R.id.VlblH862b);
            txtH862b = (EditText) findViewById(R.id.txtH862b);
            secH862c = (LinearLayout) findViewById(R.id.secH862c);
            lineH862c = (View) findViewById(R.id.lineH862c);
            VlblH862c = (TextView) findViewById(R.id.VlblH862c);
            rdogrpH862c = (RadioGroup) findViewById(R.id.rdogrpH862c);

            rdoH862c1 = (RadioButton) findViewById(R.id.rdoH862c1);
            rdoH862c2 = (RadioButton) findViewById(R.id.rdoH862c2);
            rdoH862c3 = (RadioButton) findViewById(R.id.rdoH862c3);
            secH862d = (LinearLayout) findViewById(R.id.secH862d);
            lineH862d = (View) findViewById(R.id.lineH862d);
            VlblH862d = (TextView) findViewById(R.id.VlblH862d);
            txtH862d = (EditText) findViewById(R.id.txtH862d);

            //Hide all skip variables
            secH811a.setVisibility(View.GONE);
            secH811b.setVisibility(View.GONE);
            secH811c.setVisibility(View.GONE);
            secH811d.setVisibility(View.GONE);
            secH812a.setVisibility(View.GONE);
            secH812b.setVisibility(View.GONE);
            secH812c.setVisibility(View.GONE);
            secH812d.setVisibility(View.GONE);
            secH813a.setVisibility(View.GONE);
            secH813b.setVisibility(View.GONE);
            secH813c.setVisibility(View.GONE);
            secH813d.setVisibility(View.GONE);
            secH814a.setVisibility(View.GONE);
            secH814b.setVisibility(View.GONE);
            secH814c.setVisibility(View.GONE);
            secH814d.setVisibility(View.GONE);
            secH815a.setVisibility(View.GONE);
            secH815b.setVisibility(View.GONE);
            secH815c.setVisibility(View.GONE);
            secH815d.setVisibility(View.GONE);
            secH816a.setVisibility(View.GONE);
            secH816b.setVisibility(View.GONE);
            secH816c.setVisibility(View.GONE);
            secH816d.setVisibility(View.GONE);
            secH811b.setVisibility(View.GONE);
            secH811c.setVisibility(View.GONE);
            secH811d.setVisibility(View.GONE);
            secH812b.setVisibility(View.GONE);
            secH812c.setVisibility(View.GONE);
            secH812d.setVisibility(View.GONE);
            secH813b.setVisibility(View.GONE);
            secH813c.setVisibility(View.GONE);
            secH813d.setVisibility(View.GONE);
            secH814b.setVisibility(View.GONE);
            secH814c.setVisibility(View.GONE);
            secH814d.setVisibility(View.GONE);
            secH815b.setVisibility(View.GONE);
            secH815c.setVisibility(View.GONE);
            secH815d.setVisibility(View.GONE);
            secH816b.setVisibility(View.GONE);
            secH816c.setVisibility(View.GONE);
            secH816d.setVisibility(View.GONE);
            secH821b.setVisibility(View.GONE);
            secH821c.setVisibility(View.GONE);
            secH821d.setVisibility(View.GONE);
            //secH83.setVisibility(View.GONE);
            secH831a.setVisibility(View.GONE);
            secH831b.setVisibility(View.GONE);
            secH831c.setVisibility(View.GONE);
            secH831d.setVisibility(View.GONE);
            secH832a.setVisibility(View.GONE);
            secH832b.setVisibility(View.GONE);
            secH832c.setVisibility(View.GONE);
            secH832d.setVisibility(View.GONE);
            //secH84.setVisibility(View.GONE);
            secH831b.setVisibility(View.GONE);
            secH831c.setVisibility(View.GONE);
            secH831d.setVisibility(View.GONE);
            secH832b.setVisibility(View.GONE);
            secH832c.setVisibility(View.GONE);
            secH832d.setVisibility(View.GONE);
            // secH84.setVisibility(View.GONE);
            secH841a.setVisibility(View.GONE);
            secH841b.setVisibility(View.GONE);
            secH841c.setVisibility(View.GONE);
            secH841d.setVisibility(View.GONE);
            secH842a.setVisibility(View.GONE);
            secH842b.setVisibility(View.GONE);
            secH842c.setVisibility(View.GONE);
            secH842d.setVisibility(View.GONE);
            secH841b.setVisibility(View.GONE);
            secH841c.setVisibility(View.GONE);
            secH841d.setVisibility(View.GONE);
            secH842b.setVisibility(View.GONE);
            secH842c.setVisibility(View.GONE);
            secH842d.setVisibility(View.GONE);
            secH851b.setVisibility(View.GONE);
            secH851c.setVisibility(View.GONE);
            secH851d.setVisibility(View.GONE);
            // secH86.setVisibility(View.GONE);
            secH861a.setVisibility(View.GONE);
            secH861b.setVisibility(View.GONE);
            secH861c.setVisibility(View.GONE);
            secH861d.setVisibility(View.GONE);
            secH862a.setVisibility(View.GONE);
            secH862b.setVisibility(View.GONE);
            secH862c.setVisibility(View.GONE);
            secH861b.setVisibility(View.GONE);
            secH861c.setVisibility(View.GONE);
            secH861d.setVisibility(View.GONE);
            secH862b.setVisibility(View.GONE);
            secH862c.setVisibility(View.GONE);
            secH862d.setVisibility(View.GONE);


            lineH811a.setVisibility(View.GONE);
            lineH811b.setVisibility(View.GONE);
            lineH811c.setVisibility(View.GONE);
            lineH811d.setVisibility(View.GONE);
            lineH812a.setVisibility(View.GONE);
            lineH812b.setVisibility(View.GONE);
            lineH812c.setVisibility(View.GONE);
            lineH812d.setVisibility(View.GONE);
            lineH813a.setVisibility(View.GONE);
            lineH813b.setVisibility(View.GONE);
            lineH813c.setVisibility(View.GONE);
            lineH813d.setVisibility(View.GONE);
            lineH814a.setVisibility(View.GONE);
            lineH814b.setVisibility(View.GONE);
            lineH814c.setVisibility(View.GONE);
            lineH814d.setVisibility(View.GONE);
            lineH815a.setVisibility(View.GONE);
            lineH815b.setVisibility(View.GONE);
            lineH815c.setVisibility(View.GONE);
            lineH815d.setVisibility(View.GONE);
            lineH816a.setVisibility(View.GONE);
            lineH816b.setVisibility(View.GONE);
            lineH816c.setVisibility(View.GONE);
            lineH816d.setVisibility(View.GONE);
            lineH811b.setVisibility(View.GONE);
            lineH811c.setVisibility(View.GONE);
            lineH811d.setVisibility(View.GONE);
            lineH812b.setVisibility(View.GONE);
            lineH812c.setVisibility(View.GONE);
            lineH812d.setVisibility(View.GONE);
            lineH813b.setVisibility(View.GONE);
            lineH813c.setVisibility(View.GONE);
            lineH813d.setVisibility(View.GONE);
            lineH814b.setVisibility(View.GONE);
            lineH814c.setVisibility(View.GONE);
            lineH814d.setVisibility(View.GONE);
            lineH815b.setVisibility(View.GONE);
            lineH815c.setVisibility(View.GONE);
            lineH815d.setVisibility(View.GONE);
            lineH816b.setVisibility(View.GONE);
            lineH816c.setVisibility(View.GONE);
            lineH816d.setVisibility(View.GONE);
            lineH821b.setVisibility(View.GONE);
            lineH821c.setVisibility(View.GONE);
            lineH821d.setVisibility(View.GONE);
            //lineH83.setVisibility(View.GONE);
            lineH831a.setVisibility(View.GONE);
            lineH831b.setVisibility(View.GONE);
            lineH831c.setVisibility(View.GONE);
            lineH831d.setVisibility(View.GONE);
            lineH832a.setVisibility(View.GONE);
            lineH832b.setVisibility(View.GONE);
            lineH832c.setVisibility(View.GONE);
            lineH832d.setVisibility(View.GONE);
            // lineH84.setVisibility(View.GONE);
            lineH831b.setVisibility(View.GONE);
            lineH831c.setVisibility(View.GONE);
            lineH831d.setVisibility(View.GONE);
            lineH832b.setVisibility(View.GONE);
            lineH832c.setVisibility(View.GONE);
            lineH832d.setVisibility(View.GONE);
            //  lineH84.setVisibility(View.GONE);
            lineH841a.setVisibility(View.GONE);
            lineH841b.setVisibility(View.GONE);
            lineH841c.setVisibility(View.GONE);
            lineH841d.setVisibility(View.GONE);
            lineH842a.setVisibility(View.GONE);
            lineH842b.setVisibility(View.GONE);
            lineH842c.setVisibility(View.GONE);
            lineH842d.setVisibility(View.GONE);
            lineH841b.setVisibility(View.GONE);
            lineH841c.setVisibility(View.GONE);
            lineH841d.setVisibility(View.GONE);
            lineH842b.setVisibility(View.GONE);
            lineH842c.setVisibility(View.GONE);
            lineH842d.setVisibility(View.GONE);
            lineH851b.setVisibility(View.GONE);
            lineH851c.setVisibility(View.GONE);
            lineH851d.setVisibility(View.GONE);
            //  lineH86.setVisibility(View.GONE);
            lineH861a.setVisibility(View.GONE);
            lineH861b.setVisibility(View.GONE);
            lineH861c.setVisibility(View.GONE);
            lineH861d.setVisibility(View.GONE);
            lineH862a.setVisibility(View.GONE);
            lineH862b.setVisibility(View.GONE);
            lineH862c.setVisibility(View.GONE);
            lineH861b.setVisibility(View.GONE);
            lineH861c.setVisibility(View.GONE);
            lineH861d.setVisibility(View.GONE);
            lineH862b.setVisibility(View.GONE);
            lineH862c.setVisibility(View.GONE);
            lineH862d.setVisibility(View.GONE);

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
            Connection.MessageBox(Cost1.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(Cost1.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: উপকারভোগী/সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (spnMSlNo.getSelectedItemPosition() == 0 & secMSlNo.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: তথ্যদানে সহায়তাকারীর লাইন নম্বর.");
                spnMSlNo.requestFocus();
                return;
            } else if (!rdoH811.isChecked() & !rdoH812.isChecked() & secH81.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (আপনি গত মাসে চাল / গম / রুটি কিনেছেন?).");
                rdoH811.requestFocus();
                return;
            } else if (!rdoH811a1.isChecked() & !rdoH811a2.isChecked() & secH811a.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (চাল  কিনেছে).");
                rdoH811a1.requestFocus();
                return;
            } else if (txtH811b.getText().toString().length() == 0 & secH811b.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH811b.requestFocus();
                return;
            } else if (Double.valueOf(txtH811b.getText().toString().length() == 0 ? "0" : txtH811b.getText().toString()) < 0 || Double.valueOf(txtH811b.getText().toString().length() == 0 ? "999" : txtH811b.getText().toString()) > 999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999(পরিমাণ(সংখ্যা)).");
                txtH811b.requestFocus();
                return;
            } else if (!rdoH811c1.isChecked() & !rdoH811c2.isChecked() & !rdoH811c3.isChecked() & secH811c.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (ইউনিট ).");
                rdoH811c1.requestFocus();
                return;
            } else if (txtH811d.getText().toString().length() == 0 & secH811d.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH811d.requestFocus();
                return;
            } else if (Double.valueOf(txtH811d.getText().toString().length() == 0 ? "0" : txtH811d.getText().toString()) < 0 || Double.valueOf(txtH811d.getText().toString().length() == 0 ? "999999" : txtH811d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH811d.requestFocus();
                return;
            } else if (!rdoH812a1.isChecked() & !rdoH812a2.isChecked() & secH812a.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (গম  ময়দা সুজি  কিনেছে).");
                rdoH812a1.requestFocus();
                return;
            } else if (txtH812b.getText().toString().length() == 0 & secH812b.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH812b.requestFocus();
                return;
            } else if (Double.valueOf(txtH812b.getText().toString().length() == 0 ? "0" : txtH812b.getText().toString()) < 0 || Double.valueOf(txtH812b.getText().toString().length() == 0 ? "999999" : txtH812b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
                txtH812b.requestFocus();
                return;
            } else if (!rdoH812c1.isChecked() & !rdoH812c2.isChecked() & !rdoH812c3.isChecked() & secH812c.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (ইউনিট ).");
                rdoH812c1.requestFocus();
                return;
            } else if (txtH812d.getText().toString().length() == 0 & secH812d.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH812d.requestFocus();
                return;
            } else if (Double.valueOf(txtH812d.getText().toString().length() == 0 ? "0" : txtH812d.getText().toString()) < 0 || Double.valueOf(txtH812d.getText().toString().length() == 0 ? "999999" : txtH812d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH812d.requestFocus();
                return;
            } else if (!rdoH813a1.isChecked() & !rdoH813a2.isChecked() & secH813a.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (শেঁকা রুটি  কিনেছে).");
                rdoH813a1.requestFocus();
                return;
            } else if (txtH813b.getText().toString().length() == 0 & secH813b.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH813b.requestFocus();
                return;
            } else if (Double.valueOf(txtH813b.getText().toString().length() == 0 ? "0" : txtH813b.getText().toString()) < 0 || Double.valueOf(txtH813b.getText().toString().length() == 0 ? "999999" : txtH813b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
                txtH813b.requestFocus();
                return;
            } else if (!rdoH813c1.isChecked() & !rdoH813c2.isChecked() & !rdoH813c3.isChecked() & secH813c.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (ইউনিট ).");
                rdoH813c1.requestFocus();
                return;
            } else if (txtH813d.getText().toString().length() == 0 & secH813d.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH813d.requestFocus();
                return;
            } else if (Double.valueOf(txtH813d.getText().toString().length() == 0 ? "0" : txtH813d.getText().toString()) < 0 || Double.valueOf(txtH813d.getText().toString().length() == 0 ? "999999" : txtH813d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH813d.requestFocus();
                return;
            } else if (!rdoH814a1.isChecked() & !rdoH814a2.isChecked() & secH814a.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (চিড়া মুড়ি  কিনেছে).");
                rdoH814a1.requestFocus();
                return;
            } else if (txtH814b.getText().toString().length() == 0 & secH814b.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH814b.requestFocus();
                return;
            } else if (Double.valueOf(txtH814b.getText().toString().length() == 0 ? "0" : txtH814b.getText().toString()) < 0 || Double.valueOf(txtH814b.getText().toString().length() == 0 ? "999999" : txtH814b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
                txtH814b.requestFocus();
                return;
            } else if (!rdoH814c1.isChecked() & !rdoH814c2.isChecked() & !rdoH814c3.isChecked() & secH814c.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (ইউনিট ).");
                rdoH814c1.requestFocus();
                return;
            } else if (txtH814d.getText().toString().length() == 0 & secH814d.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH814d.requestFocus();
                return;
            } else if (Double.valueOf(txtH814d.getText().toString().length() == 0 ? "0" : txtH814d.getText().toString()) < 0 || Double.valueOf(txtH814d.getText().toString().length() == 0 ? "999999" : txtH814d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH814d.requestFocus();
                return;
            } else if (!rdoH815a1.isChecked() & !rdoH815a2.isChecked() & secH815a.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (সেমাই  কিনেছে).");
                rdoH815a1.requestFocus();
                return;
            } else if (txtH815b.getText().toString().length() == 0 & secH815b.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH815b.requestFocus();
                return;
            } else if (Double.valueOf(txtH815b.getText().toString().length() == 0 ? "0" : txtH815b.getText().toString()) < 0 || Double.valueOf(txtH815b.getText().toString().length() == 0 ? "999999" : txtH815b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
                txtH815b.requestFocus();
                return;
            } else if (!rdoH815c1.isChecked() & !rdoH815c2.isChecked() & !rdoH815c3.isChecked() & secH815c.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (ইউনিট ).");
                rdoH815c1.requestFocus();
                return;
            } else if (txtH815d.getText().toString().length() == 0 & secH815d.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH815d.requestFocus();
                return;
            } else if (Double.valueOf(txtH815d.getText().toString().length() == 0 ? "0" : txtH815d.getText().toString()) < 0 || Double.valueOf(txtH815d.getText().toString().length() == 0 ? "999999" : txtH815d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH815d.requestFocus();
                return;
            } else if (!rdoH816a1.isChecked() & !rdoH816a2.isChecked() & secH816a.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (বিস্কিট  কিনেছে).");
                rdoH816a1.requestFocus();
                return;
            } else if (txtH816b.getText().toString().length() == 0 & secH816b.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH816b.requestFocus();
                return;
            } else if (Double.valueOf(txtH816b.getText().toString().length() == 0 ? "0" : txtH816b.getText().toString()) < 0 || Double.valueOf(txtH816b.getText().toString().length() == 0 ? "999999" : txtH816b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
                txtH816b.requestFocus();
                return;
            } else if (!rdoH816c1.isChecked() & !rdoH816c2.isChecked() & !rdoH816c3.isChecked() & secH816c.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (ইউনিট ).");
                rdoH816c1.requestFocus();
                return;
            } else if (txtH816d.getText().toString().length() == 0 & secH816d.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH816d.requestFocus();
                return;
            } else if (Double.valueOf(txtH816d.getText().toString().length() == 0 ? "0" : txtH816d.getText().toString()) < 0 || Double.valueOf(txtH816d.getText().toString().length() == 0 ? "999999" : txtH816d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH816d.requestFocus();
                return;
            } else if (!rdoH821a1.isChecked() & !rdoH821a2.isChecked() & secH821a.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (আপনি গত মাসে ডাল ক্রয় করেছেন? ).");
                rdoH821a1.requestFocus();
                return;
            } else if (txtH821b.getText().toString().length() == 0 & secH821b.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH821b.requestFocus();
                return;
            } else if (Double.valueOf(txtH821b.getText().toString().length() == 0 ? "0" : txtH821b.getText().toString()) < 0 || Double.valueOf(txtH821b.getText().toString().length() == 0 ? "999999" : txtH821b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
                txtH821b.requestFocus();
                return;
            } else if (!rdoH821c1.isChecked() & !rdoH821c2.isChecked() & !rdoH821c3.isChecked() & secH821c.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (ইউনিট ).");
                rdoH821c1.requestFocus();
                return;
            } else if (txtH821d.getText().toString().length() == 0 & secH821d.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH821d.requestFocus();
                return;
            } else if (Double.valueOf(txtH821d.getText().toString().length() == 0 ? "0" : txtH821d.getText().toString()) < 0 || Double.valueOf(txtH821d.getText().toString().length() == 0 ? "999999" : txtH821d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH821d.requestFocus();
                return;
            } else if (!rdoH831.isChecked() & !rdoH832.isChecked() & secH83.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (আপনি গত মাসে ভোজ্য তেল ক্রয় করেছেন? ).");
                rdoH831.requestFocus();
                return;
            } else if (!rdoH831a1.isChecked() & !rdoH831a2.isChecked() & secH831a.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (সয়াবিন তেল  কিনেছে).");
                rdoH831a1.requestFocus();
                return;
            } else if (txtH831b.getText().toString().length() == 0 & secH831b.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH831b.requestFocus();
                return;
            } else if (Double.valueOf(txtH831b.getText().toString().length() == 0 ? "0" : txtH831b.getText().toString()) < 0 || Double.valueOf(txtH831b.getText().toString().length() == 0 ? "999999" : txtH831b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
                txtH831b.requestFocus();
                return;
            } else if (!rdoH831c1.isChecked() & !rdoH831c2.isChecked() & !rdoH831c3.isChecked() & secH831c.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (ইউনিট ).");
                rdoH831c1.requestFocus();
                return;
            } else if (txtH831d.getText().toString().length() == 0 & secH831d.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH831d.requestFocus();
                return;
            } else if (Double.valueOf(txtH831d.getText().toString().length() == 0 ? "0" : txtH831d.getText().toString()) < 0 || Double.valueOf(txtH831d.getText().toString().length() == 0 ? "999999" : txtH831d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH831d.requestFocus();
                return;
            } else if (!rdoH832a1.isChecked() & !rdoH832a2.isChecked() & secH832a.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (সরিষা তেল  কিনেছে).");
                rdoH832a1.requestFocus();
                return;
            } else if (txtH832b.getText().toString().length() == 0 & secH832b.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH832b.requestFocus();
                return;
            } else if (Double.valueOf(txtH832b.getText().toString().length() == 0 ? "0" : txtH832b.getText().toString()) < 0 || Double.valueOf(txtH832b.getText().toString().length() == 0 ? "999999" : txtH832b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
                txtH832b.requestFocus();
                return;
            } else if (!rdoH832c1.isChecked() & !rdoH832c2.isChecked() & !rdoH832c3.isChecked() & secH832c.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (ইউনিট).");
                rdoH832c1.requestFocus();
                return;
            } else if (txtH832d.getText().toString().length() == 0 & secH832d.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH832d.requestFocus();
                return;
            } else if (Double.valueOf(txtH832d.getText().toString().length() == 0 ? "0" : txtH832d.getText().toString()) < 0 || Double.valueOf(txtH832d.getText().toString().length() == 0 ? "999999" : txtH832d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH832d.requestFocus();
                return;
            } else if (!rdoH841.isChecked() & !rdoH842.isChecked() & secH84.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (আপনি গত মাসে মাংস/  মাছ ক্রয় করেছেন? ).");
                rdoH841.requestFocus();
                return;
            } else if (!rdoH841a1.isChecked() & !rdoH841a2.isChecked() & secH841a.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (মাছ  কিনেছে).");
                rdoH841a1.requestFocus();
                return;
            } else if (txtH841b.getText().toString().length() == 0 & secH841b.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH841b.requestFocus();
                return;
            } else if (Double.valueOf(txtH841b.getText().toString().length() == 0 ? "0" : txtH841b.getText().toString()) < 0 || Double.valueOf(txtH841b.getText().toString().length() == 0 ? "999999" : txtH841b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
                txtH841b.requestFocus();
                return;
            } else if (!rdoH841c1.isChecked() & !rdoH841c2.isChecked() & !rdoH841c3.isChecked() & secH841c.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (ইউনিট ).");
                rdoH841c1.requestFocus();
                return;
            } else if (txtH841d.getText().toString().length() == 0 & secH841d.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH841d.requestFocus();
                return;
            } else if (Double.valueOf(txtH841d.getText().toString().length() == 0 ? "0" : txtH841d.getText().toString()) < 0 || Double.valueOf(txtH841d.getText().toString().length() == 0 ? "999999" : txtH841d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH841d.requestFocus();
                return;
            } else if (!rdoH842a1.isChecked() & !rdoH842a2.isChecked() & secH842a.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (মাংস  কিনেছে).");
                rdoH842a1.requestFocus();
                return;
            } else if (txtH842b.getText().toString().length() == 0 & secH842b.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH842b.requestFocus();
                return;
            } else if (Double.valueOf(txtH842b.getText().toString().length() == 0 ? "0" : txtH842b.getText().toString()) < 0 || Double.valueOf(txtH842b.getText().toString().length() == 0 ? "999999" : txtH842b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
                txtH842b.requestFocus();
                return;
            } else if (!rdoH842c1.isChecked() & !rdoH842c2.isChecked() & !rdoH842c3.isChecked() & secH842c.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (ইউনিট ).");
                rdoH842c1.requestFocus();
                return;
            } else if (txtH842d.getText().toString().length() == 0 & secH842d.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH842d.requestFocus();
                return;
            } else if (Double.valueOf(txtH842d.getText().toString().length() == 0 ? "0" : txtH842d.getText().toString()) < 0 || Double.valueOf(txtH842d.getText().toString().length() == 0 ? "999999" : txtH842d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH842d.requestFocus();
                return;
            } else if (!rdoH851a1.isChecked() & !rdoH851a2.isChecked() & secH851a.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (আপনি গত মাসে ডিম ক্রয় করেছেন?).");
                rdoH851a1.requestFocus();
                return;
            } else if (txtH851b.getText().toString().length() == 0 & secH851b.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH851b.requestFocus();
                return;
            } else if (Double.valueOf(txtH851b.getText().toString().length() == 0 ? "0" : txtH851b.getText().toString()) < 0 || Double.valueOf(txtH851b.getText().toString().length() == 0 ? "999999" : txtH851b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
                txtH851b.requestFocus();
                return;
            } else if (!rdoH851c1.isChecked() & !rdoH851c2.isChecked() & !rdoH851c3.isChecked() & secH851c.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (ইউনিট ).");
                rdoH851c1.requestFocus();
                return;
            } else if (txtH851d.getText().toString().length() == 0 & secH851d.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH851d.requestFocus();
                return;
            } else if (Double.valueOf(txtH851d.getText().toString().length() == 0 ? "0" : txtH851d.getText().toString()) < 0 || Double.valueOf(txtH851d.getText().toString().length() == 0 ? "999999" : txtH851d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH851d.requestFocus();
                return;
            } else if (!rdoH861.isChecked() & !rdoH862.isChecked() & secH86.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (আপনি গত মাসে দুধ বা দুগ্ধজাত খাদ্য ক্রয় করেছেন? ).");
                rdoH861.requestFocus();
                return;
            } else if (!rdoH861a1.isChecked() & !rdoH861a2.isChecked() & secH861a.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (দুধ  কিনেছে).");
                rdoH861a1.requestFocus();
                return;
            } else if (txtH861b.getText().toString().length() == 0 & secH861b.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH861b.requestFocus();
                return;
            } else if (Double.valueOf(txtH861b.getText().toString().length() == 0 ? "0" : txtH861b.getText().toString()) < 0 || Double.valueOf(txtH861b.getText().toString().length() == 0 ? "999999" : txtH861b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
                txtH861b.requestFocus();
                return;
            } else if (!rdoH861c1.isChecked() & !rdoH861c2.isChecked() & !rdoH861c3.isChecked() & secH861c.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (ইউনিট ).");
                rdoH861c1.requestFocus();
                return;
            } else if (txtH861d.getText().toString().length() == 0 & secH861d.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH861d.requestFocus();
                return;
            } else if (Double.valueOf(txtH861d.getText().toString().length() == 0 ? "0" : txtH861d.getText().toString()) < 0 || Double.valueOf(txtH861d.getText().toString().length() == 0 ? "999999" : txtH861d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH861d.requestFocus();
                return;
            } else if (!rdoH862a1.isChecked() & !rdoH862a2.isChecked() & secH862a.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (দুদ্গজাত পন্য  কিনেছে).");
                rdoH862a1.requestFocus();
                return;
            } else if (txtH862b.getText().toString().length() == 0 & secH862b.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: পরিমাণ(সংখ্যা).");
                txtH862b.requestFocus();
                return;
            } else if (Double.valueOf(txtH862b.getText().toString().length() == 0 ? "0" : txtH862b.getText().toString()) < 0 || Double.valueOf(txtH862b.getText().toString().length() == 0 ? "999999" : txtH862b.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(পরিমাণ(সংখ্যা)).");
                txtH862b.requestFocus();
                return;
            } else if (!rdoH862c1.isChecked() & !rdoH862c2.isChecked() & !rdoH862c3.isChecked() & secH862c.isShown()) {
                Connection.MessageBox(Cost1.this, "Select anyone options from (ইউনিট ).");
                rdoH862c1.requestFocus();
                return;
            } else if (txtH862d.getText().toString().length() == 0 & secH862d.isShown()) {
                Connection.MessageBox(Cost1.this, "Required field: প্রতি ইউনিটের মূল্য কত.");
                txtH862d.requestFocus();
                return;
            } else if (Double.valueOf(txtH862d.getText().toString().length() == 0 ? "0" : txtH862d.getText().toString()) < 0 || Double.valueOf(txtH862d.getText().toString().length() == 0 ? "999999" : txtH862d.getText().toString()) > 999999) {
                Connection.MessageBox(Cost1.this, "Value should be between 0 and 999999(প্রতি ইউনিটের মূল্য কত).");
                txtH862d.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            Cost1_DataModel objSave = new Cost1_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setMSlNo((spnMSlNo.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnMSlNo.getSelectedItem().toString(), "-")));
            String[] d_rdogrpH81 = new String[]{"1", "0"};
            objSave.setH81("");
            for (int i = 0; i < rdogrpH81.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH81.getChildAt(i);
                if (rb.isChecked()) objSave.setH81(d_rdogrpH81[i]);
            }

            String[] d_rdogrpH811a = new String[]{"1", "0"};
            objSave.setH811a("");
            for (int i = 0; i < rdogrpH811a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH811a.getChildAt(i);
                if (rb.isChecked()) objSave.setH811a(d_rdogrpH811a[i]);
            }

            objSave.setH811b(txtH811b.getText().toString());
            String[] d_rdogrpH811c = new String[]{"1", "2", "3"};
            objSave.setH811c("");
            for (int i = 0; i < rdogrpH811c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH811c.getChildAt(i);
                if (rb.isChecked()) objSave.setH811c(d_rdogrpH811c[i]);
            }

            objSave.setH811d(txtH811d.getText().toString());
            String[] d_rdogrpH812a = new String[]{"1", "0"};
            objSave.setH812a("");
            for (int i = 0; i < rdogrpH812a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH812a.getChildAt(i);
                if (rb.isChecked()) objSave.setH812a(d_rdogrpH812a[i]);
            }

            objSave.setH812b(txtH812b.getText().toString());
            String[] d_rdogrpH812c = new String[]{"1", "2", "3"};
            objSave.setH812c("");
            for (int i = 0; i < rdogrpH812c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH812c.getChildAt(i);
                if (rb.isChecked()) objSave.setH812c(d_rdogrpH812c[i]);
            }

            objSave.setH812d(txtH812d.getText().toString());
            String[] d_rdogrpH813a = new String[]{"1", "0"};
            objSave.setH813a("");
            for (int i = 0; i < rdogrpH813a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH813a.getChildAt(i);
                if (rb.isChecked()) objSave.setH813a(d_rdogrpH813a[i]);
            }

            objSave.setH813b(txtH813b.getText().toString());
            String[] d_rdogrpH813c = new String[]{"1", "2", "3"};
            objSave.setH813c("");
            for (int i = 0; i < rdogrpH813c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH813c.getChildAt(i);
                if (rb.isChecked()) objSave.setH813c(d_rdogrpH813c[i]);
            }

            objSave.setH813d(txtH813d.getText().toString());
            String[] d_rdogrpH814a = new String[]{"1", "0"};
            objSave.setH814a("");
            for (int i = 0; i < rdogrpH814a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH814a.getChildAt(i);
                if (rb.isChecked()) objSave.setH814a(d_rdogrpH814a[i]);
            }

            objSave.setH814b(txtH814b.getText().toString());
            String[] d_rdogrpH814c = new String[]{"1", "2", "3"};
            objSave.setH814c("");
            for (int i = 0; i < rdogrpH814c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH814c.getChildAt(i);
                if (rb.isChecked()) objSave.setH814c(d_rdogrpH814c[i]);
            }

            objSave.setH814d(txtH814d.getText().toString());
            String[] d_rdogrpH815a = new String[]{"1", "0"};
            objSave.setH815a("");
            for (int i = 0; i < rdogrpH815a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH815a.getChildAt(i);
                if (rb.isChecked()) objSave.setH815a(d_rdogrpH815a[i]);
            }

            objSave.setH815b(txtH815b.getText().toString());
            String[] d_rdogrpH815c = new String[]{"1", "2", "3"};
            objSave.setH815c("");
            for (int i = 0; i < rdogrpH815c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH815c.getChildAt(i);
                if (rb.isChecked()) objSave.setH815c(d_rdogrpH815c[i]);
            }

            objSave.setH815d(txtH815d.getText().toString());
            String[] d_rdogrpH816a = new String[]{"1", "0"};
            objSave.setH816a("");
            for (int i = 0; i < rdogrpH816a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH816a.getChildAt(i);
                if (rb.isChecked()) objSave.setH816a(d_rdogrpH816a[i]);
            }

            objSave.setH816b(txtH816b.getText().toString());
            String[] d_rdogrpH816c = new String[]{"1", "2", "3"};
            objSave.setH816c("");
            for (int i = 0; i < rdogrpH816c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH816c.getChildAt(i);
                if (rb.isChecked()) objSave.setH816c(d_rdogrpH816c[i]);
            }

            objSave.setH816d(txtH816d.getText().toString());
            String[] d_rdogrpH821a = new String[]{"1", "0"};
            objSave.setH821a("");
            for (int i = 0; i < rdogrpH821a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH821a.getChildAt(i);
                if (rb.isChecked()) objSave.setH821a(d_rdogrpH821a[i]);
            }

            objSave.setH821b(txtH821b.getText().toString());
            String[] d_rdogrpH821c = new String[]{"1", "2", "3"};
            objSave.setH821c("");
            for (int i = 0; i < rdogrpH821c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH821c.getChildAt(i);
                if (rb.isChecked()) objSave.setH821c(d_rdogrpH821c[i]);
            }

            objSave.setH821d(txtH821d.getText().toString());
            String[] d_rdogrpH83 = new String[]{"1", "0"};
            objSave.setH83("");
            for (int i = 0; i < rdogrpH83.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH83.getChildAt(i);
                if (rb.isChecked()) objSave.setH83(d_rdogrpH83[i]);
            }

            String[] d_rdogrpH831a = new String[]{"1", "0"};
            objSave.setH831a("");
            for (int i = 0; i < rdogrpH831a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH831a.getChildAt(i);
                if (rb.isChecked()) objSave.setH831a(d_rdogrpH831a[i]);
            }

            objSave.setH831b(txtH831b.getText().toString());
            String[] d_rdogrpH831c = new String[]{"1", "2", "3"};
            objSave.setH831c("");
            for (int i = 0; i < rdogrpH831c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH831c.getChildAt(i);
                if (rb.isChecked()) objSave.setH831c(d_rdogrpH831c[i]);
            }

            objSave.setH831d(txtH831d.getText().toString());
            String[] d_rdogrpH832a = new String[]{"1", "0"};
            objSave.setH832a("");
            for (int i = 0; i < rdogrpH832a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH832a.getChildAt(i);
                if (rb.isChecked()) objSave.setH832a(d_rdogrpH832a[i]);
            }

            objSave.setH832b(txtH832b.getText().toString());
            String[] d_rdogrpH832c = new String[]{"1", "2", "3"};
            objSave.setH832c("");
            for (int i = 0; i < rdogrpH832c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH832c.getChildAt(i);
                if (rb.isChecked()) objSave.setH832c(d_rdogrpH832c[i]);
            }

            objSave.setH832d(txtH832d.getText().toString());
            String[] d_rdogrpH84 = new String[]{"1", "0"};
            objSave.setH84("");
            for (int i = 0; i < rdogrpH84.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH84.getChildAt(i);
                if (rb.isChecked()) objSave.setH84(d_rdogrpH84[i]);
            }

            String[] d_rdogrpH841a = new String[]{"1", "0"};
            objSave.setH841a("");
            for (int i = 0; i < rdogrpH841a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH841a.getChildAt(i);
                if (rb.isChecked()) objSave.setH841a(d_rdogrpH841a[i]);
            }

            objSave.setH841b(txtH841b.getText().toString());
            String[] d_rdogrpH841c = new String[]{"1", "2", "3"};
            objSave.setH841c("");
            for (int i = 0; i < rdogrpH841c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH841c.getChildAt(i);
                if (rb.isChecked()) objSave.setH841c(d_rdogrpH841c[i]);
            }

            objSave.setH841d(txtH841d.getText().toString());
            String[] d_rdogrpH842a = new String[]{"1", "0"};
            objSave.setH842a("");
            for (int i = 0; i < rdogrpH842a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH842a.getChildAt(i);
                if (rb.isChecked()) objSave.setH842a(d_rdogrpH842a[i]);
            }

            objSave.setH842b(txtH842b.getText().toString());
            String[] d_rdogrpH842c = new String[]{"1", "2", "3"};
            objSave.setH842c("");
            for (int i = 0; i < rdogrpH842c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH842c.getChildAt(i);
                if (rb.isChecked()) objSave.setH842c(d_rdogrpH842c[i]);
            }

            objSave.setH842d(txtH842d.getText().toString());
            String[] d_rdogrpH851a = new String[]{"1", "0"};
            objSave.setH851a("");
            for (int i = 0; i < rdogrpH851a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH851a.getChildAt(i);
                if (rb.isChecked()) objSave.setH851a(d_rdogrpH851a[i]);
            }

            objSave.setH851b(txtH851b.getText().toString());
            String[] d_rdogrpH851c = new String[]{"1", "2", "3"};
            objSave.setH851c("");
            for (int i = 0; i < rdogrpH851c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH851c.getChildAt(i);
                if (rb.isChecked()) objSave.setH851c(d_rdogrpH851c[i]);
            }

            objSave.setH851d(txtH851d.getText().toString());
            String[] d_rdogrpH86 = new String[]{"1", "0"};
            objSave.setH86("");
            for (int i = 0; i < rdogrpH86.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH86.getChildAt(i);
                if (rb.isChecked()) objSave.setH86(d_rdogrpH86[i]);
            }

            String[] d_rdogrpH861a = new String[]{"1", "0"};
            objSave.setH861a("");
            for (int i = 0; i < rdogrpH861a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH861a.getChildAt(i);
                if (rb.isChecked()) objSave.setH861a(d_rdogrpH861a[i]);
            }

            objSave.setH861b(txtH861b.getText().toString());
            String[] d_rdogrpH861c = new String[]{"1", "2", "3"};
            objSave.setH861c("");
            for (int i = 0; i < rdogrpH861c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH861c.getChildAt(i);
                if (rb.isChecked()) objSave.setH861c(d_rdogrpH861c[i]);
            }

            objSave.setH861d(txtH861d.getText().toString());
            String[] d_rdogrpH862a = new String[]{"1", "0"};
            objSave.setH862a("");
            for (int i = 0; i < rdogrpH862a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH862a.getChildAt(i);
                if (rb.isChecked()) objSave.setH862a(d_rdogrpH862a[i]);
            }

            objSave.setH862b(txtH862b.getText().toString());
            String[] d_rdogrpH862c = new String[]{"1", "2", "3"};
            objSave.setH862c("");
            for (int i = 0; i < rdogrpH862c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH862c.getChildAt(i);
                if (rb.isChecked()) objSave.setH862c(d_rdogrpH862c[i]);
            }

            objSave.setH862d(txtH862d.getText().toString());
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

                finish();
                Bundle IDbundle1 = new Bundle();
                IDbundle1.putString("Rnd", RND);
                IDbundle1.putString("SuchanaID", SUCHANAID);
                Intent f1 = new Intent(getApplicationContext(), Cost2.class);
                f1.putExtras(IDbundle1);
                startActivity(f1);
            } else {
                Connection.MessageBox(Cost1.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(Cost1.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            Cost1_DataModel d = new Cost1_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<Cost1_DataModel> data = d.SelectAll(this, SQL);
            for (Cost1_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                spnMSlNo.setSelection(Global.SpinnerItemPositionAnyLength(spnMSlNo, item.getMSlNo()));
                String[] d_rdogrpH81 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH81.length; i++) {
                    if (item.getH81().equals(String.valueOf(d_rdogrpH81[i]))) {
                        rb = (RadioButton) rdogrpH81.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH811a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH811a.length; i++) {
                    if (item.getH811a().equals(String.valueOf(d_rdogrpH811a[i]))) {
                        rb = (RadioButton) rdogrpH811a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH811b.setText(item.getH811b());
                String[] d_rdogrpH811c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH811c.length; i++) {
                    if (item.getH811c().equals(String.valueOf(d_rdogrpH811c[i]))) {
                        rb = (RadioButton) rdogrpH811c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH811d.setText(item.getH811d());
                String[] d_rdogrpH812a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH812a.length; i++) {
                    if (item.getH812a().equals(String.valueOf(d_rdogrpH812a[i]))) {
                        rb = (RadioButton) rdogrpH812a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH812b.setText(item.getH812b());
                String[] d_rdogrpH812c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH812c.length; i++) {
                    if (item.getH812c().equals(String.valueOf(d_rdogrpH812c[i]))) {
                        rb = (RadioButton) rdogrpH812c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH812d.setText(item.getH812d());
                String[] d_rdogrpH813a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH813a.length; i++) {
                    if (item.getH813a().equals(String.valueOf(d_rdogrpH813a[i]))) {
                        rb = (RadioButton) rdogrpH813a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH813b.setText(item.getH813b());
                String[] d_rdogrpH813c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH813c.length; i++) {
                    if (item.getH813c().equals(String.valueOf(d_rdogrpH813c[i]))) {
                        rb = (RadioButton) rdogrpH813c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH813d.setText(item.getH813d());
                String[] d_rdogrpH814a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH814a.length; i++) {
                    if (item.getH814a().equals(String.valueOf(d_rdogrpH814a[i]))) {
                        rb = (RadioButton) rdogrpH814a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH814b.setText(item.getH814b());
                String[] d_rdogrpH814c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH814c.length; i++) {
                    if (item.getH814c().equals(String.valueOf(d_rdogrpH814c[i]))) {
                        rb = (RadioButton) rdogrpH814c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH814d.setText(item.getH814d());
                String[] d_rdogrpH815a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH815a.length; i++) {
                    if (item.getH815a().equals(String.valueOf(d_rdogrpH815a[i]))) {
                        rb = (RadioButton) rdogrpH815a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH815b.setText(item.getH815b());
                String[] d_rdogrpH815c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH815c.length; i++) {
                    if (item.getH815c().equals(String.valueOf(d_rdogrpH815c[i]))) {
                        rb = (RadioButton) rdogrpH815c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH815d.setText(item.getH815d());
                String[] d_rdogrpH816a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH816a.length; i++) {
                    if (item.getH816a().equals(String.valueOf(d_rdogrpH816a[i]))) {
                        rb = (RadioButton) rdogrpH816a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH816b.setText(item.getH816b());
                String[] d_rdogrpH816c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH816c.length; i++) {
                    if (item.getH816c().equals(String.valueOf(d_rdogrpH816c[i]))) {
                        rb = (RadioButton) rdogrpH816c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH816d.setText(item.getH816d());
                String[] d_rdogrpH821a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH821a.length; i++) {
                    if (item.getH821a().equals(String.valueOf(d_rdogrpH821a[i]))) {
                        rb = (RadioButton) rdogrpH821a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH821b.setText(item.getH821b());
                String[] d_rdogrpH821c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH821c.length; i++) {
                    if (item.getH821c().equals(String.valueOf(d_rdogrpH821c[i]))) {
                        rb = (RadioButton) rdogrpH821c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH821d.setText(item.getH821d());
                String[] d_rdogrpH83 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH83.length; i++) {
                    if (item.getH83().equals(String.valueOf(d_rdogrpH83[i]))) {
                        rb = (RadioButton) rdogrpH83.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH831a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH831a.length; i++) {
                    if (item.getH831a().equals(String.valueOf(d_rdogrpH831a[i]))) {
                        rb = (RadioButton) rdogrpH831a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH831b.setText(item.getH831b());
                String[] d_rdogrpH831c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH831c.length; i++) {
                    if (item.getH831c().equals(String.valueOf(d_rdogrpH831c[i]))) {
                        rb = (RadioButton) rdogrpH831c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH831d.setText(item.getH831d());
                String[] d_rdogrpH832a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH832a.length; i++) {
                    if (item.getH832a().equals(String.valueOf(d_rdogrpH832a[i]))) {
                        rb = (RadioButton) rdogrpH832a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH832b.setText(item.getH832b());
                String[] d_rdogrpH832c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH832c.length; i++) {
                    if (item.getH832c().equals(String.valueOf(d_rdogrpH832c[i]))) {
                        rb = (RadioButton) rdogrpH832c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH832d.setText(item.getH832d());
                String[] d_rdogrpH84 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH84.length; i++) {
                    if (item.getH84().equals(String.valueOf(d_rdogrpH84[i]))) {
                        rb = (RadioButton) rdogrpH84.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH841a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH841a.length; i++) {
                    if (item.getH841a().equals(String.valueOf(d_rdogrpH841a[i]))) {
                        rb = (RadioButton) rdogrpH841a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH841b.setText(item.getH841b());
                String[] d_rdogrpH841c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH841c.length; i++) {
                    if (item.getH841c().equals(String.valueOf(d_rdogrpH841c[i]))) {
                        rb = (RadioButton) rdogrpH841c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH841d.setText(item.getH841d());
                String[] d_rdogrpH842a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH842a.length; i++) {
                    if (item.getH842a().equals(String.valueOf(d_rdogrpH842a[i]))) {
                        rb = (RadioButton) rdogrpH842a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH842b.setText(item.getH842b());
                String[] d_rdogrpH842c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH842c.length; i++) {
                    if (item.getH842c().equals(String.valueOf(d_rdogrpH842c[i]))) {
                        rb = (RadioButton) rdogrpH842c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH842d.setText(item.getH842d());
                String[] d_rdogrpH851a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH851a.length; i++) {
                    if (item.getH851a().equals(String.valueOf(d_rdogrpH851a[i]))) {
                        rb = (RadioButton) rdogrpH851a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH851b.setText(item.getH851b());
                String[] d_rdogrpH851c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH851c.length; i++) {
                    if (item.getH851c().equals(String.valueOf(d_rdogrpH851c[i]))) {
                        rb = (RadioButton) rdogrpH851c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH851d.setText(item.getH851d());
                String[] d_rdogrpH86 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH86.length; i++) {
                    if (item.getH86().equals(String.valueOf(d_rdogrpH86[i]))) {
                        rb = (RadioButton) rdogrpH86.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH861a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH861a.length; i++) {
                    if (item.getH861a().equals(String.valueOf(d_rdogrpH861a[i]))) {
                        rb = (RadioButton) rdogrpH861a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH861b.setText(item.getH861b());
                String[] d_rdogrpH861c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH861c.length; i++) {
                    if (item.getH861c().equals(String.valueOf(d_rdogrpH861c[i]))) {
                        rb = (RadioButton) rdogrpH861c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH861d.setText(item.getH861d());
                String[] d_rdogrpH862a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH862a.length; i++) {
                    if (item.getH862a().equals(String.valueOf(d_rdogrpH862a[i]))) {
                        rb = (RadioButton) rdogrpH862a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH862b.setText(item.getH862b());
                String[] d_rdogrpH862c = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH862c.length; i++) {
                    if (item.getH862c().equals(String.valueOf(d_rdogrpH862c[i]))) {
                        rb = (RadioButton) rdogrpH862c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH862d.setText(item.getH862d());
            }
        } catch (Exception e) {
            Connection.MessageBox(Cost1.this, e.getMessage());
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