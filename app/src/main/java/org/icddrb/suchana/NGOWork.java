package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".NGOWork" android:label="NGOWork" />

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Common.Connection;
import Common.Global;

public class NGOWork extends Activity {
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
    LinearLayout seclbH16;
    LinearLayout secH161;
    View lineH161;
    TextView VlblH161;
    RadioGroup rdogrpH161;
    RadioButton rdoH1611;
    RadioButton rdoH1612;
    LinearLayout secH162;
    View lineH162;
    TextView VlblH162;
    RadioGroup rdogrpH162;
    RadioButton rdoH1621;
    RadioButton rdoH1622;
    LinearLayout seclbH163;
    LinearLayout secH163a;
    View lineH163a;
    TextView VlblH163a;
    CheckBox chkH163a;
    LinearLayout secH163b;
    View lineH163b;
    TextView VlblH163b;
    CheckBox chkH163b;
    LinearLayout secH163c;
    View lineH163c;
    TextView VlblH163c;
    CheckBox chkH163c;
    LinearLayout secH163d;
    View lineH163d;
    TextView VlblH163d;
    CheckBox chkH163d;
    LinearLayout secH163e;
    View lineH163e;
    TextView VlblH163e;
    CheckBox chkH163e;
    LinearLayout secH163f;
    View lineH163f;
    TextView VlblH163f;
    CheckBox chkH163f;
    LinearLayout secH163g;
    View lineH163g;
    TextView VlblH163g;
    CheckBox chkH163g;
    LinearLayout secH163h;
    View lineH163h;
    TextView VlblH163h;
    CheckBox chkH163h;
    LinearLayout secH163i;
    View lineH163i;
    TextView VlblH163i;
    CheckBox chkH163i;
    LinearLayout secH163x;
    View lineH163x;
    TextView VlblH163x;
    CheckBox chkH163x;
    LinearLayout secH163oth;
    View lineH163oth;
    TextView VlblH163oth;
    EditText txtH163oth;
    LinearLayout secH164;
    View lineH164;
    TextView VlblH164;
    EditText txtH164;
    LinearLayout seclbH165;
    LinearLayout secH165a;
    View lineH165a;
    TextView VlblH165a;
    CheckBox chkH165a;
    LinearLayout secH165b;
    View lineH165b;
    TextView VlblH165b;
    CheckBox chkH165b;
    LinearLayout secH165c;
    View lineH165c;
    TextView VlblH165c;
    CheckBox chkH165c;
    LinearLayout secH165d;
    View lineH165d;
    TextView VlblH165d;
    CheckBox chkH165d;
    LinearLayout secH165e;
    View lineH165e;
    TextView VlblH165e;
    CheckBox chkH165e;
    LinearLayout secH165f;
    View lineH165f;
    TextView VlblH165f;
    CheckBox chkH165f;
    LinearLayout secH165g;
    View lineH165g;
    TextView VlblH165g;
    CheckBox chkH165g;
    LinearLayout secH165h;
    View lineH165h;
    TextView VlblH165h;
    CheckBox chkH165h;
    LinearLayout secH165x;
    View lineH165x;
    TextView VlblH165x;
    CheckBox chkH165x;
    LinearLayout secH16x1;
    View lineH16x1;
    TextView VlblH16x1;
    EditText txtH16x1;
    LinearLayout secH165i;
    View lineH165i;
    TextView VlblH165i;
    CheckBox chkH165i;
    LinearLayout secH166;
    View lineH166;
    TextView VlblH166;
    RadioGroup rdogrpH166;
    RadioButton rdoH1661;
    RadioButton rdoH1662;
    LinearLayout seclbH167;
    LinearLayout secH167a;
    View lineH167a;
    TextView VlblH167a;
    CheckBox chkH167a;
    LinearLayout secH167b;
    View lineH167b;
    TextView VlblH167b;
    CheckBox chkH167b;
    LinearLayout secH167c;
    View lineH167c;
    TextView VlblH167c;
    CheckBox chkH167c;
    LinearLayout secH167d;
    View lineH167d;
    TextView VlblH167d;
    CheckBox chkH167d;
    LinearLayout secH167e;
    View lineH167e;
    TextView VlblH167e;
    CheckBox chkH167e;
    LinearLayout secH167f;
    View lineH167f;
    TextView VlblH167f;
    CheckBox chkH167f;
    LinearLayout secH167g;
    View lineH167g;
    TextView VlblH167g;
    CheckBox chkH167g;
    LinearLayout secH167i;
    View lineH167i;
    TextView VlblH167i;
    CheckBox chkH167i;
    LinearLayout secH167x;
    View lineH167x;
    TextView VlblH167x;
    CheckBox chkH167x;
    LinearLayout secH167x1;
    View lineH167x1;
    TextView VlblH167x1;
    EditText txtH167x1;
    LinearLayout secH168;
    View lineH168;
    TextView VlblH168;
    EditText txtH168;
    LinearLayout secH169;
    View lineH169;
    TextView VlblH169;
    RadioGroup rdogrpH169;
    RadioButton rdoH1691;
    RadioButton rdoH1692;
    LinearLayout secH1610;
    View lineH1610;
    TextView VlblH1610;
    EditText txtH1610;
    LinearLayout secH1611;
    View lineH1611;
    TextView VlblH1611;
    RadioGroup rdogrpH1611;
    RadioButton rdoH16111;
    RadioButton rdoH16112;
    LinearLayout seclb1612;
    LinearLayout secH1612a;
    View lineH1612a;
    TextView VlblH1612a;
    CheckBox chkH1612a;
    LinearLayout secH1612b;
    View lineH1612b;
    TextView VlblH1612b;
    CheckBox chkH1612b;
    LinearLayout secH1612c;
    View lineH1612c;
    TextView VlblH1612c;
    CheckBox chkH1612c;
    LinearLayout secH1612d;
    View lineH1612d;
    TextView VlblH1612d;
    CheckBox chkH1612d;
    LinearLayout secH1612e;
    View lineH1612e;
    TextView VlblH1612e;
    CheckBox chkH1612e;
    LinearLayout secH1612f;
    View lineH1612f;
    TextView VlblH1612f;
    CheckBox chkH1612f;
    LinearLayout secH1612g;
    View lineH1612g;
    TextView VlblH1612g;
    CheckBox chkH1612g;
    LinearLayout secH1612h;
    View lineH1612h;
    TextView VlblH1612h;
    CheckBox chkH1612h;
    LinearLayout secH1612i;
    View lineH1612i;
    TextView VlblH1612i;
    CheckBox chkH1612i;
    LinearLayout secH1612j;
    View lineH1612j;
    TextView VlblH1612j;
    CheckBox chkH1612j;
    LinearLayout secH1612x;
    View lineH1612x;
    TextView VlblH1612x;
    CheckBox chkH1612x;
    LinearLayout secH1612x1;
    View lineH1612x1;
    TextView VlblH1612x1;
    EditText txtH1612x1;
    LinearLayout secH1613;
    View lineH1613;
    TextView VlblH1613;
    RadioGroup rdogrpH1613;
    RadioButton rdoH16131;
    RadioButton rdoH16132;
    LinearLayout secH1614;
    LinearLayout secH1614a;
    View lineH1614a;
    TextView VlblH1614a;
    CheckBox chkH1614a;
    LinearLayout secH1614b;
    View lineH1614b;
    TextView VlblH1614b;
    CheckBox chkH1614b;
    LinearLayout secH1614c;
    View lineH1614c;
    TextView VlblH1614c;
    CheckBox chkH1614c;
    LinearLayout secH1614d;
    View lineH1614d;
    TextView VlblH1614d;
    CheckBox chkH1614d;
    LinearLayout secH1614e;
    View lineH1614e;
    TextView VlblH1614e;
    CheckBox chkH1614e;
    LinearLayout secH1614f;
    View lineH1614f;
    TextView VlblH1614f;
    CheckBox chkH1614f;
    LinearLayout secH1614x;
    View lineH1614x;
    TextView VlblH1614x;
    CheckBox chkH1614x;
    LinearLayout secH1614x1;
    View lineH1614x1;
    TextView VlblH1614x1;
    EditText txtH1614x1;
    LinearLayout secH1615;
    View lineH1615;
    TextView VlblH1615;
    RadioGroup rdogrpH1615;
    RadioButton rdoH16151;
    RadioButton rdoH16152;
    LinearLayout secH1616;
    LinearLayout secH1616a;
    View lineH1616a;
    TextView VlblH1616a;
    CheckBox chkH1616a;
    LinearLayout secH1616b;
    View lineH1616b;
    TextView VlblH1616b;
    CheckBox chkH1616b;
    LinearLayout secH1616c;
    View lineH1616c;
    TextView VlblH1616c;
    CheckBox chkH1616c;
    LinearLayout secH1616d;
    View lineH1616d;
    TextView VlblH1616d;
    CheckBox chkH1616d;
    LinearLayout secH1616e;
    View lineH1616e;
    TextView VlblH1616e;
    CheckBox chkH1616e;
    LinearLayout secH1616f;
    View lineH1616f;
    TextView VlblH1616f;
    CheckBox chkH1616f;
    LinearLayout secH1616g;
    View lineH1616g;
    TextView VlblH1616g;
    CheckBox chkH1616g;
    LinearLayout secH1616h;
    View lineH1616h;
    TextView VlblH1616h;
    CheckBox chkH1616h;
    LinearLayout secH1616i;
    View lineH1616i;
    TextView VlblH1616i;
    CheckBox chkH1616i;
    LinearLayout secH1616x;
    View lineH1616x;
    TextView VlblH1616x;
    CheckBox chkH1616x;
    LinearLayout secH1616x1;
    View lineH1616x1;
    TextView VlblH1616x1;
    EditText txtH1616x1;
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
            setContentView(R.layout.ngowork);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TableName = "NGOWork";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(NGOWork.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
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
            txtRnd.setText(RND);
            txtRnd.setEnabled(false);
            txtSuchanaID.setText(SUCHANAID);
            txtSuchanaID.setEnabled(false);
            seclbH16 = (LinearLayout) findViewById(R.id.seclbH16);
            secH161 = (LinearLayout) findViewById(R.id.secH161);
            lineH161 = (View) findViewById(R.id.lineH161);
            VlblH161 = (TextView) findViewById(R.id.VlblH161);
            rdogrpH161 = (RadioGroup) findViewById(R.id.rdogrpH161);

            rdoH1611 = (RadioButton) findViewById(R.id.rdoH1611);
            rdoH1612 = (RadioButton) findViewById(R.id.rdoH1612);
            rdogrpH161.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH161 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH161.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH161.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH161[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH162.setVisibility(View.GONE);
                        lineH162.setVisibility(View.GONE);
                        rdogrpH162.clearCheck();
                        secH163a.setVisibility(View.GONE);
                        lineH163a.setVisibility(View.GONE);
                        chkH163a.setChecked(false);
                        secH163b.setVisibility(View.GONE);
                        lineH163b.setVisibility(View.GONE);
                        chkH163b.setChecked(false);
                        secH163c.setVisibility(View.GONE);
                        lineH163c.setVisibility(View.GONE);
                        chkH163c.setChecked(false);
                        secH163d.setVisibility(View.GONE);
                        lineH163d.setVisibility(View.GONE);
                        chkH163d.setChecked(false);
                        secH163e.setVisibility(View.GONE);
                        lineH163e.setVisibility(View.GONE);
                        chkH163e.setChecked(false);
                        secH163f.setVisibility(View.GONE);
                        lineH163f.setVisibility(View.GONE);
                        chkH163f.setChecked(false);
                        secH163g.setVisibility(View.GONE);
                        lineH163g.setVisibility(View.GONE);
                        chkH163g.setChecked(false);
                        secH163h.setVisibility(View.GONE);
                        lineH163h.setVisibility(View.GONE);
                        chkH163h.setChecked(false);
                        secH163i.setVisibility(View.GONE);
                        lineH163i.setVisibility(View.GONE);
                        chkH163i.setChecked(false);
                        secH163x.setVisibility(View.GONE);
                        lineH163x.setVisibility(View.GONE);
                        chkH163x.setChecked(false);
                        secH163oth.setVisibility(View.GONE);
                        lineH163oth.setVisibility(View.GONE);
                        txtH163oth.setText("");
                        secH164.setVisibility(View.GONE);
                        lineH164.setVisibility(View.GONE);
                        txtH164.setText("");
                        secH165a.setVisibility(View.GONE);
                        lineH165a.setVisibility(View.GONE);
                        chkH165a.setChecked(false);
                        secH165b.setVisibility(View.GONE);
                        lineH165b.setVisibility(View.GONE);
                        chkH165b.setChecked(false);
                        secH165c.setVisibility(View.GONE);
                        lineH165c.setVisibility(View.GONE);
                        chkH165c.setChecked(false);
                        secH165d.setVisibility(View.GONE);
                        lineH165d.setVisibility(View.GONE);
                        chkH165d.setChecked(false);
                        secH165e.setVisibility(View.GONE);
                        lineH165e.setVisibility(View.GONE);
                        chkH165e.setChecked(false);
                        secH165f.setVisibility(View.GONE);
                        lineH165f.setVisibility(View.GONE);
                        chkH165f.setChecked(false);
                        secH165g.setVisibility(View.GONE);
                        lineH165g.setVisibility(View.GONE);
                        chkH165g.setChecked(false);
                        secH165h.setVisibility(View.GONE);
                        lineH165h.setVisibility(View.GONE);
                        chkH165h.setChecked(false);
                        secH165x.setVisibility(View.GONE);
                        lineH165x.setVisibility(View.GONE);
                        chkH165x.setChecked(false);
                        secH16x1.setVisibility(View.GONE);
                        lineH16x1.setVisibility(View.GONE);
                        txtH16x1.setText("");
                        secH165i.setVisibility(View.GONE);
                        lineH165i.setVisibility(View.GONE);
                        chkH165i.setChecked(false);
                        secH166.setVisibility(View.GONE);
                        lineH166.setVisibility(View.GONE);
                        rdogrpH166.clearCheck();
                        secH167a.setVisibility(View.GONE);
                        lineH167a.setVisibility(View.GONE);
                        chkH167a.setChecked(false);
                        secH167b.setVisibility(View.GONE);
                        lineH167b.setVisibility(View.GONE);
                        chkH167b.setChecked(false);
                        secH167c.setVisibility(View.GONE);
                        lineH167c.setVisibility(View.GONE);
                        chkH167c.setChecked(false);
                        secH167d.setVisibility(View.GONE);
                        lineH167d.setVisibility(View.GONE);
                        chkH167d.setChecked(false);
                        secH167e.setVisibility(View.GONE);
                        lineH167e.setVisibility(View.GONE);
                        chkH167e.setChecked(false);
                        secH167f.setVisibility(View.GONE);
                        lineH167f.setVisibility(View.GONE);
                        chkH167f.setChecked(false);
                        secH167g.setVisibility(View.GONE);
                        lineH167g.setVisibility(View.GONE);
                        chkH167g.setChecked(false);
                        secH167i.setVisibility(View.GONE);
                        lineH167i.setVisibility(View.GONE);
                        chkH167i.setChecked(false);
                        secH167x.setVisibility(View.GONE);
                        lineH167x.setVisibility(View.GONE);
                        chkH167x.setChecked(false);
                        secH167x1.setVisibility(View.GONE);
                        lineH167x1.setVisibility(View.GONE);
                        txtH167x1.setText("");
                        secH168.setVisibility(View.GONE);
                        lineH168.setVisibility(View.GONE);
                        txtH168.setText("");
                        secH169.setVisibility(View.GONE);
                        lineH169.setVisibility(View.GONE);
                        rdogrpH169.clearCheck();
                        secH1610.setVisibility(View.GONE);
                        lineH1610.setVisibility(View.GONE);
                        txtH1610.setText("");

                        seclbH163.setVisibility(View.GONE);
                        seclbH165.setVisibility(View.GONE);
                        seclbH167.setVisibility(View.GONE);
                    } else {
                        secH162.setVisibility(View.VISIBLE);
                        lineH162.setVisibility(View.VISIBLE);
                        secH163a.setVisibility(View.VISIBLE);
                        lineH163a.setVisibility(View.VISIBLE);
                        secH163b.setVisibility(View.VISIBLE);
                        lineH163b.setVisibility(View.VISIBLE);
                        secH163c.setVisibility(View.VISIBLE);
                        lineH163c.setVisibility(View.VISIBLE);
                        secH163d.setVisibility(View.VISIBLE);
                        lineH163d.setVisibility(View.VISIBLE);
                        secH163e.setVisibility(View.VISIBLE);
                        lineH163e.setVisibility(View.VISIBLE);
                        secH163f.setVisibility(View.VISIBLE);
                        lineH163f.setVisibility(View.VISIBLE);
                        secH163g.setVisibility(View.VISIBLE);
                        lineH163g.setVisibility(View.VISIBLE);
                        secH163h.setVisibility(View.VISIBLE);
                        lineH163h.setVisibility(View.VISIBLE);
                        secH163i.setVisibility(View.VISIBLE);
                        lineH163i.setVisibility(View.VISIBLE);
                        secH163x.setVisibility(View.VISIBLE);
                        lineH163x.setVisibility(View.VISIBLE);
                        secH163oth.setVisibility(View.VISIBLE);
                        lineH163oth.setVisibility(View.VISIBLE);
                        secH164.setVisibility(View.VISIBLE);
                        lineH164.setVisibility(View.VISIBLE);
                        secH165a.setVisibility(View.VISIBLE);
                        lineH165a.setVisibility(View.VISIBLE);
                        secH165b.setVisibility(View.VISIBLE);
                        lineH165b.setVisibility(View.VISIBLE);
                        secH165c.setVisibility(View.VISIBLE);
                        lineH165c.setVisibility(View.VISIBLE);
                        secH165d.setVisibility(View.VISIBLE);
                        lineH165d.setVisibility(View.VISIBLE);
                        secH165e.setVisibility(View.VISIBLE);
                        lineH165e.setVisibility(View.VISIBLE);
                        secH165f.setVisibility(View.VISIBLE);
                        lineH165f.setVisibility(View.VISIBLE);
                        secH165g.setVisibility(View.VISIBLE);
                        lineH165g.setVisibility(View.VISIBLE);
                        secH165h.setVisibility(View.VISIBLE);
                        lineH165h.setVisibility(View.VISIBLE);
                        secH165x.setVisibility(View.VISIBLE);
                        lineH165x.setVisibility(View.VISIBLE);
                        secH16x1.setVisibility(View.VISIBLE);
                        lineH16x1.setVisibility(View.VISIBLE);
                        secH165i.setVisibility(View.VISIBLE);
                        lineH165i.setVisibility(View.VISIBLE);
                        secH166.setVisibility(View.VISIBLE);
                        lineH166.setVisibility(View.VISIBLE);
                        secH167a.setVisibility(View.VISIBLE);
                        lineH167a.setVisibility(View.VISIBLE);
                        secH167b.setVisibility(View.VISIBLE);
                        lineH167b.setVisibility(View.VISIBLE);
                        secH167c.setVisibility(View.VISIBLE);
                        lineH167c.setVisibility(View.VISIBLE);
                        secH167d.setVisibility(View.VISIBLE);
                        lineH167d.setVisibility(View.VISIBLE);
                        secH167e.setVisibility(View.VISIBLE);
                        lineH167e.setVisibility(View.VISIBLE);
                        secH167f.setVisibility(View.VISIBLE);
                        lineH167f.setVisibility(View.VISIBLE);
                        secH167g.setVisibility(View.VISIBLE);
                        lineH167g.setVisibility(View.VISIBLE);
                        secH167i.setVisibility(View.VISIBLE);
                        lineH167i.setVisibility(View.VISIBLE);
                        secH167x.setVisibility(View.VISIBLE);
                        lineH167x.setVisibility(View.VISIBLE);
                        secH167x1.setVisibility(View.VISIBLE);
                        lineH167x1.setVisibility(View.VISIBLE);
                        secH168.setVisibility(View.VISIBLE);
                        lineH168.setVisibility(View.VISIBLE);
                        secH169.setVisibility(View.VISIBLE);
                        lineH169.setVisibility(View.VISIBLE);
                        secH1610.setVisibility(View.VISIBLE);
                        lineH1610.setVisibility(View.VISIBLE);

                        seclbH163.setVisibility(View.VISIBLE);
                        seclbH165.setVisibility(View.VISIBLE);
                        seclbH167.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH162 = (LinearLayout) findViewById(R.id.secH162);
            lineH162 = (View) findViewById(R.id.lineH162);
            VlblH162 = (TextView) findViewById(R.id.VlblH162);
            rdogrpH162 = (RadioGroup) findViewById(R.id.rdogrpH162);

            rdoH1621 = (RadioButton) findViewById(R.id.rdoH1621);
            rdoH1622 = (RadioButton) findViewById(R.id.rdoH1622);
            rdogrpH162.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH162 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH162.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH162.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH162[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH163a.setVisibility(View.GONE);
                        lineH163a.setVisibility(View.GONE);
                        chkH163a.setChecked(false);
                        secH163b.setVisibility(View.GONE);
                        lineH163b.setVisibility(View.GONE);
                        chkH163b.setChecked(false);
                        secH163c.setVisibility(View.GONE);
                        lineH163c.setVisibility(View.GONE);
                        chkH163c.setChecked(false);
                        secH163d.setVisibility(View.GONE);
                        lineH163d.setVisibility(View.GONE);
                        chkH163d.setChecked(false);
                        secH163e.setVisibility(View.GONE);
                        lineH163e.setVisibility(View.GONE);
                        chkH163e.setChecked(false);
                        secH163f.setVisibility(View.GONE);
                        lineH163f.setVisibility(View.GONE);
                        chkH163f.setChecked(false);
                        secH163g.setVisibility(View.GONE);
                        lineH163g.setVisibility(View.GONE);
                        chkH163g.setChecked(false);
                        secH163h.setVisibility(View.GONE);
                        lineH163h.setVisibility(View.GONE);
                        chkH163h.setChecked(false);
                        secH163i.setVisibility(View.GONE);
                        lineH163i.setVisibility(View.GONE);
                        chkH163i.setChecked(false);
                        secH163x.setVisibility(View.GONE);
                        lineH163x.setVisibility(View.GONE);
                        chkH163x.setChecked(false);
                        secH163oth.setVisibility(View.GONE);
                        lineH163oth.setVisibility(View.GONE);
                        txtH163oth.setText("");
                        secH164.setVisibility(View.GONE);
                        lineH164.setVisibility(View.GONE);
                        txtH164.setText("");
                        secH165a.setVisibility(View.GONE);
                        lineH165a.setVisibility(View.GONE);
                        chkH165a.setChecked(false);
                        secH165b.setVisibility(View.GONE);
                        lineH165b.setVisibility(View.GONE);
                        chkH165b.setChecked(false);
                        secH165c.setVisibility(View.GONE);
                        lineH165c.setVisibility(View.GONE);
                        chkH165c.setChecked(false);
                        secH165d.setVisibility(View.GONE);
                        lineH165d.setVisibility(View.GONE);
                        chkH165d.setChecked(false);
                        secH165e.setVisibility(View.GONE);
                        lineH165e.setVisibility(View.GONE);
                        chkH165e.setChecked(false);
                        secH165f.setVisibility(View.GONE);
                        lineH165f.setVisibility(View.GONE);
                        chkH165f.setChecked(false);
                        secH165g.setVisibility(View.GONE);
                        lineH165g.setVisibility(View.GONE);
                        chkH165g.setChecked(false);
                        secH165h.setVisibility(View.GONE);
                        lineH165h.setVisibility(View.GONE);
                        chkH165h.setChecked(false);
                        secH165x.setVisibility(View.GONE);
                        lineH165x.setVisibility(View.GONE);
                        chkH165x.setChecked(false);
                        secH16x1.setVisibility(View.GONE);
                        lineH16x1.setVisibility(View.GONE);
                        txtH16x1.setText("");
                        secH165i.setVisibility(View.GONE);
                        lineH165i.setVisibility(View.GONE);
                        chkH165i.setChecked(false);

                        seclbH163.setVisibility(View.GONE);
                        seclbH165.setVisibility(View.GONE);
                    } else {
                        secH163a.setVisibility(View.VISIBLE);
                        lineH163a.setVisibility(View.VISIBLE);
                        secH163b.setVisibility(View.VISIBLE);
                        lineH163b.setVisibility(View.VISIBLE);
                        secH163c.setVisibility(View.VISIBLE);
                        lineH163c.setVisibility(View.VISIBLE);
                        secH163d.setVisibility(View.VISIBLE);
                        lineH163d.setVisibility(View.VISIBLE);
                        secH163e.setVisibility(View.VISIBLE);
                        lineH163e.setVisibility(View.VISIBLE);
                        secH163f.setVisibility(View.VISIBLE);
                        lineH163f.setVisibility(View.VISIBLE);
                        secH163g.setVisibility(View.VISIBLE);
                        lineH163g.setVisibility(View.VISIBLE);
                        secH163h.setVisibility(View.VISIBLE);
                        lineH163h.setVisibility(View.VISIBLE);
                        secH163i.setVisibility(View.VISIBLE);
                        lineH163i.setVisibility(View.VISIBLE);
                        secH163x.setVisibility(View.VISIBLE);
                        lineH163x.setVisibility(View.VISIBLE);
                        secH163oth.setVisibility(View.VISIBLE);
                        lineH163oth.setVisibility(View.VISIBLE);
                        secH164.setVisibility(View.VISIBLE);
                        lineH164.setVisibility(View.VISIBLE);
                        secH165a.setVisibility(View.VISIBLE);
                        lineH165a.setVisibility(View.VISIBLE);
                        secH165b.setVisibility(View.VISIBLE);
                        lineH165b.setVisibility(View.VISIBLE);
                        secH165c.setVisibility(View.VISIBLE);
                        lineH165c.setVisibility(View.VISIBLE);
                        secH165d.setVisibility(View.VISIBLE);
                        lineH165d.setVisibility(View.VISIBLE);
                        secH165e.setVisibility(View.VISIBLE);
                        lineH165e.setVisibility(View.VISIBLE);
                        secH165f.setVisibility(View.VISIBLE);
                        lineH165f.setVisibility(View.VISIBLE);
                        secH165g.setVisibility(View.VISIBLE);
                        lineH165g.setVisibility(View.VISIBLE);
                        secH165h.setVisibility(View.VISIBLE);
                        lineH165h.setVisibility(View.VISIBLE);
                        secH165x.setVisibility(View.VISIBLE);
                        lineH165x.setVisibility(View.VISIBLE);
                        secH16x1.setVisibility(View.VISIBLE);
                        lineH16x1.setVisibility(View.VISIBLE);
                        secH165i.setVisibility(View.VISIBLE);
                        lineH165i.setVisibility(View.VISIBLE);

                        seclbH163.setVisibility(View.VISIBLE);
                        seclbH165.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            seclbH163 = (LinearLayout) findViewById(R.id.seclbH163);
            secH163a = (LinearLayout) findViewById(R.id.secH163a);
            lineH163a = (View) findViewById(R.id.lineH163a);
            VlblH163a = (TextView) findViewById(R.id.VlblH163a);
            chkH163a = (CheckBox) findViewById(R.id.chkH163a);
            secH163b = (LinearLayout) findViewById(R.id.secH163b);
            lineH163b = (View) findViewById(R.id.lineH163b);
            VlblH163b = (TextView) findViewById(R.id.VlblH163b);
            chkH163b = (CheckBox) findViewById(R.id.chkH163b);
            secH163c = (LinearLayout) findViewById(R.id.secH163c);
            lineH163c = (View) findViewById(R.id.lineH163c);
            VlblH163c = (TextView) findViewById(R.id.VlblH163c);
            chkH163c = (CheckBox) findViewById(R.id.chkH163c);
            secH163d = (LinearLayout) findViewById(R.id.secH163d);
            lineH163d = (View) findViewById(R.id.lineH163d);
            VlblH163d = (TextView) findViewById(R.id.VlblH163d);
            chkH163d = (CheckBox) findViewById(R.id.chkH163d);
            secH163e = (LinearLayout) findViewById(R.id.secH163e);
            lineH163e = (View) findViewById(R.id.lineH163e);
            VlblH163e = (TextView) findViewById(R.id.VlblH163e);
            chkH163e = (CheckBox) findViewById(R.id.chkH163e);
            secH163f = (LinearLayout) findViewById(R.id.secH163f);
            lineH163f = (View) findViewById(R.id.lineH163f);
            VlblH163f = (TextView) findViewById(R.id.VlblH163f);
            chkH163f = (CheckBox) findViewById(R.id.chkH163f);
            secH163g = (LinearLayout) findViewById(R.id.secH163g);
            lineH163g = (View) findViewById(R.id.lineH163g);
            VlblH163g = (TextView) findViewById(R.id.VlblH163g);
            chkH163g = (CheckBox) findViewById(R.id.chkH163g);
            secH163h = (LinearLayout) findViewById(R.id.secH163h);
            lineH163h = (View) findViewById(R.id.lineH163h);
            VlblH163h = (TextView) findViewById(R.id.VlblH163h);
            chkH163h = (CheckBox) findViewById(R.id.chkH163h);
            secH163i = (LinearLayout) findViewById(R.id.secH163i);
            lineH163i = (View) findViewById(R.id.lineH163i);
            VlblH163i = (TextView) findViewById(R.id.VlblH163i);
            chkH163i = (CheckBox) findViewById(R.id.chkH163i);
            secH163x = (LinearLayout) findViewById(R.id.secH163x);
            lineH163x = (View) findViewById(R.id.lineH163x);
            VlblH163x = (TextView) findViewById(R.id.VlblH163x);
            chkH163x = (CheckBox) findViewById(R.id.chkH163x);
            secH163oth = (LinearLayout) findViewById(R.id.secH163oth);
            lineH163oth = (View) findViewById(R.id.lineH163oth);
            VlblH163oth = (TextView) findViewById(R.id.VlblH163oth);
            txtH163oth = (EditText) findViewById(R.id.txtH163oth);
            secH164 = (LinearLayout) findViewById(R.id.secH164);
            lineH164 = (View) findViewById(R.id.lineH164);
            VlblH164 = (TextView) findViewById(R.id.VlblH164);
            txtH164 = (EditText) findViewById(R.id.txtH164);
            seclbH165 = (LinearLayout) findViewById(R.id.seclbH165);
            secH165a = (LinearLayout) findViewById(R.id.secH165a);
            lineH165a = (View) findViewById(R.id.lineH165a);
            VlblH165a = (TextView) findViewById(R.id.VlblH165a);
            chkH165a = (CheckBox) findViewById(R.id.chkH165a);
            secH165b = (LinearLayout) findViewById(R.id.secH165b);
            lineH165b = (View) findViewById(R.id.lineH165b);
            VlblH165b = (TextView) findViewById(R.id.VlblH165b);
            chkH165b = (CheckBox) findViewById(R.id.chkH165b);
            secH165c = (LinearLayout) findViewById(R.id.secH165c);
            lineH165c = (View) findViewById(R.id.lineH165c);
            VlblH165c = (TextView) findViewById(R.id.VlblH165c);
            chkH165c = (CheckBox) findViewById(R.id.chkH165c);
            secH165d = (LinearLayout) findViewById(R.id.secH165d);
            lineH165d = (View) findViewById(R.id.lineH165d);
            VlblH165d = (TextView) findViewById(R.id.VlblH165d);
            chkH165d = (CheckBox) findViewById(R.id.chkH165d);
            secH165e = (LinearLayout) findViewById(R.id.secH165e);
            lineH165e = (View) findViewById(R.id.lineH165e);
            VlblH165e = (TextView) findViewById(R.id.VlblH165e);
            chkH165e = (CheckBox) findViewById(R.id.chkH165e);
            secH165f = (LinearLayout) findViewById(R.id.secH165f);
            lineH165f = (View) findViewById(R.id.lineH165f);
            VlblH165f = (TextView) findViewById(R.id.VlblH165f);
            chkH165f = (CheckBox) findViewById(R.id.chkH165f);
            secH165g = (LinearLayout) findViewById(R.id.secH165g);
            lineH165g = (View) findViewById(R.id.lineH165g);
            VlblH165g = (TextView) findViewById(R.id.VlblH165g);
            chkH165g = (CheckBox) findViewById(R.id.chkH165g);
            secH165h = (LinearLayout) findViewById(R.id.secH165h);
            lineH165h = (View) findViewById(R.id.lineH165h);
            VlblH165h = (TextView) findViewById(R.id.VlblH165h);
            chkH165h = (CheckBox) findViewById(R.id.chkH165h);
            secH165x = (LinearLayout) findViewById(R.id.secH165x);
            lineH165x = (View) findViewById(R.id.lineH165x);
            VlblH165x = (TextView) findViewById(R.id.VlblH165x);
            chkH165x = (CheckBox) findViewById(R.id.chkH165x);
            secH16x1 = (LinearLayout) findViewById(R.id.secH16x1);
            lineH16x1 = (View) findViewById(R.id.lineH16x1);
            VlblH16x1 = (TextView) findViewById(R.id.VlblH16x1);
            txtH16x1 = (EditText) findViewById(R.id.txtH16x1);
            secH165i = (LinearLayout) findViewById(R.id.secH165i);
            lineH165i = (View) findViewById(R.id.lineH165i);
            VlblH165i = (TextView) findViewById(R.id.VlblH165i);
            chkH165i = (CheckBox) findViewById(R.id.chkH165i);
            secH166 = (LinearLayout) findViewById(R.id.secH166);
            lineH166 = (View) findViewById(R.id.lineH166);
            VlblH166 = (TextView) findViewById(R.id.VlblH166);
            rdogrpH166 = (RadioGroup) findViewById(R.id.rdogrpH166);

            rdoH1661 = (RadioButton) findViewById(R.id.rdoH1661);
            rdoH1662 = (RadioButton) findViewById(R.id.rdoH1662);
            rdogrpH166.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH166 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH166.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH166.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH166[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        seclbH167.setVisibility(View.GONE);
                        secH167a.setVisibility(View.GONE);
                        lineH167a.setVisibility(View.GONE);
                        chkH167a.setChecked(false);
                        secH167b.setVisibility(View.GONE);
                        lineH167b.setVisibility(View.GONE);
                        chkH167b.setChecked(false);
                        secH167c.setVisibility(View.GONE);
                        lineH167c.setVisibility(View.GONE);
                        chkH167c.setChecked(false);
                        secH167d.setVisibility(View.GONE);
                        lineH167d.setVisibility(View.GONE);
                        chkH167d.setChecked(false);
                        secH167e.setVisibility(View.GONE);
                        lineH167e.setVisibility(View.GONE);
                        chkH167e.setChecked(false);
                        secH167f.setVisibility(View.GONE);
                        lineH167f.setVisibility(View.GONE);
                        chkH167f.setChecked(false);
                        secH167g.setVisibility(View.GONE);
                        lineH167g.setVisibility(View.GONE);
                        chkH167g.setChecked(false);
                        secH167i.setVisibility(View.GONE);
                        lineH167i.setVisibility(View.GONE);
                        chkH167i.setChecked(false);
                        secH167x.setVisibility(View.GONE);
                        lineH167x.setVisibility(View.GONE);
                        chkH167x.setChecked(false);
                        secH167x1.setVisibility(View.GONE);
                        lineH167x1.setVisibility(View.GONE);
                        txtH167x1.setText("");
                        secH168.setVisibility(View.GONE);
                        lineH168.setVisibility(View.GONE);
                        txtH168.setText("");
                    } else {
                        seclbH167.setVisibility(View.VISIBLE);
                        secH167a.setVisibility(View.VISIBLE);
                        lineH167a.setVisibility(View.VISIBLE);
                        secH167b.setVisibility(View.VISIBLE);
                        lineH167b.setVisibility(View.VISIBLE);
                        secH167c.setVisibility(View.VISIBLE);
                        lineH167c.setVisibility(View.VISIBLE);
                        secH167d.setVisibility(View.VISIBLE);
                        lineH167d.setVisibility(View.VISIBLE);
                        secH167e.setVisibility(View.VISIBLE);
                        lineH167e.setVisibility(View.VISIBLE);
                        secH167f.setVisibility(View.VISIBLE);
                        lineH167f.setVisibility(View.VISIBLE);
                        secH167g.setVisibility(View.VISIBLE);
                        lineH167g.setVisibility(View.VISIBLE);
                        secH167i.setVisibility(View.VISIBLE);
                        lineH167i.setVisibility(View.VISIBLE);
                        secH167x.setVisibility(View.VISIBLE);
                        lineH167x.setVisibility(View.VISIBLE);
                        secH167x1.setVisibility(View.VISIBLE);
                        lineH167x1.setVisibility(View.VISIBLE);
                        secH168.setVisibility(View.VISIBLE);
                        lineH168.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            seclbH167 = (LinearLayout) findViewById(R.id.seclbH167);
            secH167a = (LinearLayout) findViewById(R.id.secH167a);
            lineH167a = (View) findViewById(R.id.lineH167a);
            VlblH167a = (TextView) findViewById(R.id.VlblH167a);
            chkH167a = (CheckBox) findViewById(R.id.chkH167a);
            secH167b = (LinearLayout) findViewById(R.id.secH167b);
            lineH167b = (View) findViewById(R.id.lineH167b);
            VlblH167b = (TextView) findViewById(R.id.VlblH167b);
            chkH167b = (CheckBox) findViewById(R.id.chkH167b);
            secH167c = (LinearLayout) findViewById(R.id.secH167c);
            lineH167c = (View) findViewById(R.id.lineH167c);
            VlblH167c = (TextView) findViewById(R.id.VlblH167c);
            chkH167c = (CheckBox) findViewById(R.id.chkH167c);
            secH167d = (LinearLayout) findViewById(R.id.secH167d);
            lineH167d = (View) findViewById(R.id.lineH167d);
            VlblH167d = (TextView) findViewById(R.id.VlblH167d);
            chkH167d = (CheckBox) findViewById(R.id.chkH167d);
            secH167e = (LinearLayout) findViewById(R.id.secH167e);
            lineH167e = (View) findViewById(R.id.lineH167e);
            VlblH167e = (TextView) findViewById(R.id.VlblH167e);
            chkH167e = (CheckBox) findViewById(R.id.chkH167e);
            secH167f = (LinearLayout) findViewById(R.id.secH167f);
            lineH167f = (View) findViewById(R.id.lineH167f);
            VlblH167f = (TextView) findViewById(R.id.VlblH167f);
            chkH167f = (CheckBox) findViewById(R.id.chkH167f);
            secH167g = (LinearLayout) findViewById(R.id.secH167g);
            lineH167g = (View) findViewById(R.id.lineH167g);
            VlblH167g = (TextView) findViewById(R.id.VlblH167g);
            chkH167g = (CheckBox) findViewById(R.id.chkH167g);
            secH167i = (LinearLayout) findViewById(R.id.secH167i);
            lineH167i = (View) findViewById(R.id.lineH167i);
            VlblH167i = (TextView) findViewById(R.id.VlblH167i);
            chkH167i = (CheckBox) findViewById(R.id.chkH167i);
            secH167x = (LinearLayout) findViewById(R.id.secH167x);
            lineH167x = (View) findViewById(R.id.lineH167x);
            VlblH167x = (TextView) findViewById(R.id.VlblH167x);
            chkH167x = (CheckBox) findViewById(R.id.chkH167x);
            secH167x1 = (LinearLayout) findViewById(R.id.secH167x1);
            lineH167x1 = (View) findViewById(R.id.lineH167x1);
            VlblH167x1 = (TextView) findViewById(R.id.VlblH167x1);
            txtH167x1 = (EditText) findViewById(R.id.txtH167x1);
            secH168 = (LinearLayout) findViewById(R.id.secH168);
            lineH168 = (View) findViewById(R.id.lineH168);
            VlblH168 = (TextView) findViewById(R.id.VlblH168);
            txtH168 = (EditText) findViewById(R.id.txtH168);
            secH169 = (LinearLayout) findViewById(R.id.secH169);
            lineH169 = (View) findViewById(R.id.lineH169);
            VlblH169 = (TextView) findViewById(R.id.VlblH169);
            rdogrpH169 = (RadioGroup) findViewById(R.id.rdogrpH169);

            rdoH1691 = (RadioButton) findViewById(R.id.rdoH1691);
            rdoH1692 = (RadioButton) findViewById(R.id.rdoH1692);
            rdogrpH169.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH169 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH169.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH169.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH169[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH1610.setVisibility(View.GONE);
                        lineH1610.setVisibility(View.GONE);
                        txtH1610.setText("");
                    } else {
                        secH1610.setVisibility(View.VISIBLE);
                        lineH1610.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH1610 = (LinearLayout) findViewById(R.id.secH1610);
            lineH1610 = (View) findViewById(R.id.lineH1610);
            VlblH1610 = (TextView) findViewById(R.id.VlblH1610);
            txtH1610 = (EditText) findViewById(R.id.txtH1610);
            secH1611 = (LinearLayout) findViewById(R.id.secH1611);
            lineH1611 = (View) findViewById(R.id.lineH1611);
            VlblH1611 = (TextView) findViewById(R.id.VlblH1611);
            rdogrpH1611 = (RadioGroup) findViewById(R.id.rdogrpH1611);

            rdoH16111 = (RadioButton) findViewById(R.id.rdoH16111);
            rdoH16112 = (RadioButton) findViewById(R.id.rdoH16112);
            rdogrpH1611.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH1611 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH1611.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH1611.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH1611[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH1612a.setVisibility(View.GONE);
                        lineH1612a.setVisibility(View.GONE);
                        chkH1612a.setChecked(false);
                        secH1612b.setVisibility(View.GONE);
                        lineH1612b.setVisibility(View.GONE);
                        chkH1612b.setChecked(false);
                        secH1612c.setVisibility(View.GONE);
                        lineH1612c.setVisibility(View.GONE);
                        chkH1612c.setChecked(false);
                        secH1612d.setVisibility(View.GONE);
                        lineH1612d.setVisibility(View.GONE);
                        chkH1612d.setChecked(false);
                        secH1612e.setVisibility(View.GONE);
                        lineH1612e.setVisibility(View.GONE);
                        chkH1612e.setChecked(false);
                        secH1612f.setVisibility(View.GONE);
                        lineH1612f.setVisibility(View.GONE);
                        chkH1612f.setChecked(false);
                        secH1612g.setVisibility(View.GONE);
                        lineH1612g.setVisibility(View.GONE);
                        chkH1612g.setChecked(false);
                        secH1612h.setVisibility(View.GONE);
                        lineH1612h.setVisibility(View.GONE);
                        chkH1612h.setChecked(false);
                        secH1612i.setVisibility(View.GONE);
                        lineH1612i.setVisibility(View.GONE);
                        chkH1612i.setChecked(false);
                        secH1612j.setVisibility(View.GONE);
                        lineH1612j.setVisibility(View.GONE);
                        chkH1612j.setChecked(false);
                        secH1612x.setVisibility(View.GONE);
                        lineH1612x.setVisibility(View.GONE);
                        chkH1612x.setChecked(false);
                        secH1612x1.setVisibility(View.GONE);
                        lineH1612x1.setVisibility(View.GONE);
                        txtH1612x1.setText("");
                        secH1613.setVisibility(View.GONE);
                        lineH1613.setVisibility(View.GONE);
                        rdogrpH1613.clearCheck();
                        secH1614a.setVisibility(View.GONE);
                        lineH1614a.setVisibility(View.GONE);
                        chkH1614a.setChecked(false);
                        secH1614b.setVisibility(View.GONE);
                        lineH1614b.setVisibility(View.GONE);
                        chkH1614b.setChecked(false);
                        secH1614c.setVisibility(View.GONE);
                        lineH1614c.setVisibility(View.GONE);
                        chkH1614c.setChecked(false);
                        secH1614d.setVisibility(View.GONE);
                        lineH1614d.setVisibility(View.GONE);
                        chkH1614d.setChecked(false);
                        secH1614e.setVisibility(View.GONE);
                        lineH1614e.setVisibility(View.GONE);
                        chkH1614e.setChecked(false);
                        secH1614f.setVisibility(View.GONE);
                        lineH1614f.setVisibility(View.GONE);
                        chkH1614f.setChecked(false);
                        secH1614x.setVisibility(View.GONE);
                        lineH1614x.setVisibility(View.GONE);
                        chkH1614x.setChecked(false);
                        secH1614x1.setVisibility(View.GONE);
                        lineH1614x1.setVisibility(View.GONE);
                        txtH1614x1.setText("");
                        secH1615.setVisibility(View.GONE);
                        lineH1615.setVisibility(View.GONE);
                        rdogrpH1615.clearCheck();
                        secH1616a.setVisibility(View.GONE);
                        lineH1616a.setVisibility(View.GONE);
                        chkH1616a.setChecked(false);
                        secH1616b.setVisibility(View.GONE);
                        lineH1616b.setVisibility(View.GONE);
                        chkH1616b.setChecked(false);
                        secH1616c.setVisibility(View.GONE);
                        lineH1616c.setVisibility(View.GONE);
                        chkH1616c.setChecked(false);
                        secH1616d.setVisibility(View.GONE);
                        lineH1616d.setVisibility(View.GONE);
                        chkH1616d.setChecked(false);
                        secH1616e.setVisibility(View.GONE);
                        lineH1616e.setVisibility(View.GONE);
                        chkH1616e.setChecked(false);
                        secH1616f.setVisibility(View.GONE);
                        lineH1616f.setVisibility(View.GONE);
                        chkH1616f.setChecked(false);
                        secH1616g.setVisibility(View.GONE);
                        lineH1616g.setVisibility(View.GONE);
                        chkH1616g.setChecked(false);
                        secH1616h.setVisibility(View.GONE);
                        lineH1616h.setVisibility(View.GONE);
                        chkH1616h.setChecked(false);
                        secH1616i.setVisibility(View.GONE);
                        lineH1616i.setVisibility(View.GONE);
                        chkH1616i.setChecked(false);
                        secH1616x.setVisibility(View.GONE);
                        lineH1616x.setVisibility(View.GONE);
                        chkH1616x.setChecked(false);

                        seclb1612.setVisibility(View.GONE);
                        secH1614.setVisibility(View.GONE);
                        secH1616.setVisibility(View.GONE);
                        secH1616x1.setVisibility(View.GONE);
                        txtH1616x1.setText(null);
                    } else {
                        secH1612a.setVisibility(View.VISIBLE);
                        lineH1612a.setVisibility(View.VISIBLE);
                        secH1612b.setVisibility(View.VISIBLE);
                        lineH1612b.setVisibility(View.VISIBLE);
                        secH1612c.setVisibility(View.VISIBLE);
                        lineH1612c.setVisibility(View.VISIBLE);
                        secH1612d.setVisibility(View.VISIBLE);
                        lineH1612d.setVisibility(View.VISIBLE);
                        secH1612e.setVisibility(View.VISIBLE);
                        lineH1612e.setVisibility(View.VISIBLE);
                        secH1612f.setVisibility(View.VISIBLE);
                        lineH1612f.setVisibility(View.VISIBLE);
                        secH1612g.setVisibility(View.VISIBLE);
                        lineH1612g.setVisibility(View.VISIBLE);
                        secH1612h.setVisibility(View.VISIBLE);
                        lineH1612h.setVisibility(View.VISIBLE);
                        secH1612i.setVisibility(View.VISIBLE);
                        lineH1612i.setVisibility(View.VISIBLE);
                        secH1612j.setVisibility(View.VISIBLE);
                        lineH1612j.setVisibility(View.VISIBLE);
                        secH1612x.setVisibility(View.VISIBLE);
                        lineH1612x.setVisibility(View.VISIBLE);
                        secH1612x1.setVisibility(View.VISIBLE);
                        lineH1612x1.setVisibility(View.VISIBLE);
                        secH1613.setVisibility(View.VISIBLE);
                        lineH1613.setVisibility(View.VISIBLE);
                        secH1614a.setVisibility(View.VISIBLE);
                        lineH1614a.setVisibility(View.VISIBLE);
                        secH1614b.setVisibility(View.VISIBLE);
                        lineH1614b.setVisibility(View.VISIBLE);
                        secH1614c.setVisibility(View.VISIBLE);
                        lineH1614c.setVisibility(View.VISIBLE);
                        secH1614d.setVisibility(View.VISIBLE);
                        lineH1614d.setVisibility(View.VISIBLE);
                        secH1614e.setVisibility(View.VISIBLE);
                        lineH1614e.setVisibility(View.VISIBLE);
                        secH1614f.setVisibility(View.VISIBLE);
                        lineH1614f.setVisibility(View.VISIBLE);
                        secH1614x.setVisibility(View.VISIBLE);
                        lineH1614x.setVisibility(View.VISIBLE);
                        secH1614x1.setVisibility(View.VISIBLE);
                        lineH1614x1.setVisibility(View.VISIBLE);
                        secH1615.setVisibility(View.VISIBLE);
                        lineH1615.setVisibility(View.VISIBLE);
                        secH1616a.setVisibility(View.VISIBLE);
                        lineH1616a.setVisibility(View.VISIBLE);
                        secH1616b.setVisibility(View.VISIBLE);
                        lineH1616b.setVisibility(View.VISIBLE);
                        secH1616c.setVisibility(View.VISIBLE);
                        lineH1616c.setVisibility(View.VISIBLE);
                        secH1616d.setVisibility(View.VISIBLE);
                        lineH1616d.setVisibility(View.VISIBLE);
                        secH1616e.setVisibility(View.VISIBLE);
                        lineH1616e.setVisibility(View.VISIBLE);
                        secH1616f.setVisibility(View.VISIBLE);
                        lineH1616f.setVisibility(View.VISIBLE);
                        secH1616g.setVisibility(View.VISIBLE);
                        lineH1616g.setVisibility(View.VISIBLE);
                        secH1616h.setVisibility(View.VISIBLE);
                        lineH1616h.setVisibility(View.VISIBLE);
                        secH1616i.setVisibility(View.VISIBLE);
                        lineH1616i.setVisibility(View.VISIBLE);
                        secH1616x.setVisibility(View.VISIBLE);
                        lineH1616x.setVisibility(View.VISIBLE);

                        seclb1612.setVisibility(View.VISIBLE);
                        secH1614.setVisibility(View.VISIBLE);
                        secH1616.setVisibility(View.VISIBLE);
                        secH1616x1.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            seclb1612 = (LinearLayout) findViewById(R.id.seclb1612);
            secH1612a = (LinearLayout) findViewById(R.id.secH1612a);
            lineH1612a = (View) findViewById(R.id.lineH1612a);
            VlblH1612a = (TextView) findViewById(R.id.VlblH1612a);
            chkH1612a = (CheckBox) findViewById(R.id.chkH1612a);
            secH1612b = (LinearLayout) findViewById(R.id.secH1612b);
            lineH1612b = (View) findViewById(R.id.lineH1612b);
            VlblH1612b = (TextView) findViewById(R.id.VlblH1612b);
            chkH1612b = (CheckBox) findViewById(R.id.chkH1612b);
            secH1612c = (LinearLayout) findViewById(R.id.secH1612c);
            lineH1612c = (View) findViewById(R.id.lineH1612c);
            VlblH1612c = (TextView) findViewById(R.id.VlblH1612c);
            chkH1612c = (CheckBox) findViewById(R.id.chkH1612c);
            secH1612d = (LinearLayout) findViewById(R.id.secH1612d);
            lineH1612d = (View) findViewById(R.id.lineH1612d);
            VlblH1612d = (TextView) findViewById(R.id.VlblH1612d);
            chkH1612d = (CheckBox) findViewById(R.id.chkH1612d);
            secH1612e = (LinearLayout) findViewById(R.id.secH1612e);
            lineH1612e = (View) findViewById(R.id.lineH1612e);
            VlblH1612e = (TextView) findViewById(R.id.VlblH1612e);
            chkH1612e = (CheckBox) findViewById(R.id.chkH1612e);
            secH1612f = (LinearLayout) findViewById(R.id.secH1612f);
            lineH1612f = (View) findViewById(R.id.lineH1612f);
            VlblH1612f = (TextView) findViewById(R.id.VlblH1612f);
            chkH1612f = (CheckBox) findViewById(R.id.chkH1612f);
            secH1612g = (LinearLayout) findViewById(R.id.secH1612g);
            lineH1612g = (View) findViewById(R.id.lineH1612g);
            VlblH1612g = (TextView) findViewById(R.id.VlblH1612g);
            chkH1612g = (CheckBox) findViewById(R.id.chkH1612g);
            secH1612h = (LinearLayout) findViewById(R.id.secH1612h);
            lineH1612h = (View) findViewById(R.id.lineH1612h);
            VlblH1612h = (TextView) findViewById(R.id.VlblH1612h);
            chkH1612h = (CheckBox) findViewById(R.id.chkH1612h);
            secH1612i = (LinearLayout) findViewById(R.id.secH1612i);
            lineH1612i = (View) findViewById(R.id.lineH1612i);
            VlblH1612i = (TextView) findViewById(R.id.VlblH1612i);
            chkH1612i = (CheckBox) findViewById(R.id.chkH1612i);
            secH1612j = (LinearLayout) findViewById(R.id.secH1612j);
            lineH1612j = (View) findViewById(R.id.lineH1612j);
            VlblH1612j = (TextView) findViewById(R.id.VlblH1612j);
            chkH1612j = (CheckBox) findViewById(R.id.chkH1612j);
            secH1612x = (LinearLayout) findViewById(R.id.secH1612x);
            lineH1612x = (View) findViewById(R.id.lineH1612x);
            VlblH1612x = (TextView) findViewById(R.id.VlblH1612x);
            chkH1612x = (CheckBox) findViewById(R.id.chkH1612x);
            secH1612x1 = (LinearLayout) findViewById(R.id.secH1612x1);
            lineH1612x1 = (View) findViewById(R.id.lineH1612x1);
            VlblH1612x1 = (TextView) findViewById(R.id.VlblH1612x1);
            txtH1612x1 = (EditText) findViewById(R.id.txtH1612x1);
            secH1613 = (LinearLayout) findViewById(R.id.secH1613);
            lineH1613 = (View) findViewById(R.id.lineH1613);
            VlblH1613 = (TextView) findViewById(R.id.VlblH1613);
            rdogrpH1613 = (RadioGroup) findViewById(R.id.rdogrpH1613);

            rdoH16131 = (RadioButton) findViewById(R.id.rdoH16131);
            rdoH16132 = (RadioButton) findViewById(R.id.rdoH16132);

            rdogrpH1613.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH1613 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH1613.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH1613.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH1613[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {

                        secH1614a.setVisibility(View.GONE);
                        lineH1614a.setVisibility(View.GONE);
                        chkH1614a.setChecked(false);
                        secH1614b.setVisibility(View.GONE);
                        lineH1614b.setVisibility(View.GONE);
                        chkH1614b.setChecked(false);
                        secH1614c.setVisibility(View.GONE);
                        lineH1614c.setVisibility(View.GONE);
                        chkH1614c.setChecked(false);
                        secH1614d.setVisibility(View.GONE);
                        lineH1614d.setVisibility(View.GONE);
                        chkH1614d.setChecked(false);
                        secH1614e.setVisibility(View.GONE);
                        lineH1614e.setVisibility(View.GONE);
                        chkH1614e.setChecked(false);
                        secH1614f.setVisibility(View.GONE);
                        lineH1614f.setVisibility(View.GONE);
                        chkH1614f.setChecked(false);
                        secH1614x.setVisibility(View.GONE);
                        lineH1614x.setVisibility(View.GONE);
                        chkH1614x.setChecked(false);
                        secH1614x1.setVisibility(View.GONE);
                        lineH1614x1.setVisibility(View.GONE);
                        txtH1614x1.setText("");

                    } else {

                        secH1614a.setVisibility(View.VISIBLE);
                        lineH1614a.setVisibility(View.VISIBLE);
                        secH1614b.setVisibility(View.VISIBLE);
                        lineH1614b.setVisibility(View.VISIBLE);
                        secH1614c.setVisibility(View.VISIBLE);
                        lineH1614c.setVisibility(View.VISIBLE);
                        secH1614d.setVisibility(View.VISIBLE);
                        lineH1614d.setVisibility(View.VISIBLE);
                        secH1614e.setVisibility(View.VISIBLE);
                        lineH1614e.setVisibility(View.VISIBLE);
                        secH1614f.setVisibility(View.VISIBLE);
                        lineH1614f.setVisibility(View.VISIBLE);
                        secH1614x.setVisibility(View.VISIBLE);
                        lineH1614x.setVisibility(View.VISIBLE);
                        secH1614x1.setVisibility(View.VISIBLE);
                        lineH1614x1.setVisibility(View.VISIBLE);

                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH1614 = (LinearLayout) findViewById(R.id.secH1614);
            secH1614a = (LinearLayout) findViewById(R.id.secH1614a);
            lineH1614a = (View) findViewById(R.id.lineH1614a);
            VlblH1614a = (TextView) findViewById(R.id.VlblH1614a);
            chkH1614a = (CheckBox) findViewById(R.id.chkH1614a);
            secH1614b = (LinearLayout) findViewById(R.id.secH1614b);
            lineH1614b = (View) findViewById(R.id.lineH1614b);
            VlblH1614b = (TextView) findViewById(R.id.VlblH1614b);
            chkH1614b = (CheckBox) findViewById(R.id.chkH1614b);
            secH1614c = (LinearLayout) findViewById(R.id.secH1614c);
            lineH1614c = (View) findViewById(R.id.lineH1614c);
            VlblH1614c = (TextView) findViewById(R.id.VlblH1614c);
            chkH1614c = (CheckBox) findViewById(R.id.chkH1614c);
            secH1614d = (LinearLayout) findViewById(R.id.secH1614d);
            lineH1614d = (View) findViewById(R.id.lineH1614d);
            VlblH1614d = (TextView) findViewById(R.id.VlblH1614d);
            chkH1614d = (CheckBox) findViewById(R.id.chkH1614d);
            secH1614e = (LinearLayout) findViewById(R.id.secH1614e);
            lineH1614e = (View) findViewById(R.id.lineH1614e);
            VlblH1614e = (TextView) findViewById(R.id.VlblH1614e);
            chkH1614e = (CheckBox) findViewById(R.id.chkH1614e);
            secH1614f = (LinearLayout) findViewById(R.id.secH1614f);
            lineH1614f = (View) findViewById(R.id.lineH1614f);
            VlblH1614f = (TextView) findViewById(R.id.VlblH1614f);
            chkH1614f = (CheckBox) findViewById(R.id.chkH1614f);
            secH1614x = (LinearLayout) findViewById(R.id.secH1614x);
            lineH1614x = (View) findViewById(R.id.lineH1614x);
            VlblH1614x = (TextView) findViewById(R.id.VlblH1614x);
            chkH1614x = (CheckBox) findViewById(R.id.chkH1614x);
            secH1614x1 = (LinearLayout) findViewById(R.id.secH1614x1);
            lineH1614x1 = (View) findViewById(R.id.lineH1614x1);
            VlblH1614x1 = (TextView) findViewById(R.id.VlblH1614x1);
            txtH1614x1 = (EditText) findViewById(R.id.txtH1614x1);
            secH1615 = (LinearLayout) findViewById(R.id.secH1615);
            lineH1615 = (View) findViewById(R.id.lineH1615);
            VlblH1615 = (TextView) findViewById(R.id.VlblH1615);
            rdogrpH1615 = (RadioGroup) findViewById(R.id.rdogrpH1615);

            rdoH16151 = (RadioButton) findViewById(R.id.rdoH16151);
            rdoH16152 = (RadioButton) findViewById(R.id.rdoH16152);
            rdogrpH1615.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH1615 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH1615.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH1615.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH1615[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {

                        rdogrpH1615.clearCheck();
                        secH1616a.setVisibility(View.GONE);
                        lineH1616a.setVisibility(View.GONE);
                        chkH1616a.setChecked(false);
                        secH1616b.setVisibility(View.GONE);
                        lineH1616b.setVisibility(View.GONE);
                        chkH1616b.setChecked(false);
                        secH1616c.setVisibility(View.GONE);
                        lineH1616c.setVisibility(View.GONE);
                        chkH1616c.setChecked(false);
                        secH1616d.setVisibility(View.GONE);
                        lineH1616d.setVisibility(View.GONE);
                        chkH1616d.setChecked(false);
                        secH1616e.setVisibility(View.GONE);
                        lineH1616e.setVisibility(View.GONE);
                        chkH1616e.setChecked(false);
                        secH1616f.setVisibility(View.GONE);
                        lineH1616f.setVisibility(View.GONE);
                        chkH1616f.setChecked(false);
                        secH1616g.setVisibility(View.GONE);
                        lineH1616g.setVisibility(View.GONE);
                        chkH1616g.setChecked(false);
                        secH1616h.setVisibility(View.GONE);
                        lineH1616h.setVisibility(View.GONE);
                        chkH1616h.setChecked(false);
                        secH1616i.setVisibility(View.GONE);
                        lineH1616i.setVisibility(View.GONE);
                        chkH1616i.setChecked(false);
                        secH1616x.setVisibility(View.GONE);
                        lineH1616x.setVisibility(View.GONE);
                        chkH1616x.setChecked(false);

                        secH1616.setVisibility(View.GONE);
                        secH1616x1.setVisibility(View.GONE);
                        txtH1616x1.setText(null);
                    } else {

                        secH1616a.setVisibility(View.VISIBLE);
                        lineH1616a.setVisibility(View.VISIBLE);
                        secH1616b.setVisibility(View.VISIBLE);
                        lineH1616b.setVisibility(View.VISIBLE);
                        secH1616c.setVisibility(View.VISIBLE);
                        lineH1616c.setVisibility(View.VISIBLE);
                        secH1616d.setVisibility(View.VISIBLE);
                        lineH1616d.setVisibility(View.VISIBLE);
                        secH1616e.setVisibility(View.VISIBLE);
                        lineH1616e.setVisibility(View.VISIBLE);
                        secH1616f.setVisibility(View.VISIBLE);
                        lineH1616f.setVisibility(View.VISIBLE);
                        secH1616g.setVisibility(View.VISIBLE);
                        lineH1616g.setVisibility(View.VISIBLE);
                        secH1616h.setVisibility(View.VISIBLE);
                        lineH1616h.setVisibility(View.VISIBLE);
                        secH1616i.setVisibility(View.VISIBLE);
                        lineH1616i.setVisibility(View.VISIBLE);
                        secH1616x.setVisibility(View.VISIBLE);
                        lineH1616x.setVisibility(View.VISIBLE);

                        secH1616.setVisibility(View.VISIBLE);
                        secH1616x1.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH1616 = (LinearLayout) findViewById(R.id.secH1616);
            secH1616a = (LinearLayout) findViewById(R.id.secH1616a);
            lineH1616a = (View) findViewById(R.id.lineH1616a);
            VlblH1616a = (TextView) findViewById(R.id.VlblH1616a);
            chkH1616a = (CheckBox) findViewById(R.id.chkH1616a);
            secH1616b = (LinearLayout) findViewById(R.id.secH1616b);
            lineH1616b = (View) findViewById(R.id.lineH1616b);
            VlblH1616b = (TextView) findViewById(R.id.VlblH1616b);
            chkH1616b = (CheckBox) findViewById(R.id.chkH1616b);
            secH1616c = (LinearLayout) findViewById(R.id.secH1616c);
            lineH1616c = (View) findViewById(R.id.lineH1616c);
            VlblH1616c = (TextView) findViewById(R.id.VlblH1616c);
            chkH1616c = (CheckBox) findViewById(R.id.chkH1616c);
            secH1616d = (LinearLayout) findViewById(R.id.secH1616d);
            lineH1616d = (View) findViewById(R.id.lineH1616d);
            VlblH1616d = (TextView) findViewById(R.id.VlblH1616d);
            chkH1616d = (CheckBox) findViewById(R.id.chkH1616d);
            secH1616e = (LinearLayout) findViewById(R.id.secH1616e);
            lineH1616e = (View) findViewById(R.id.lineH1616e);
            VlblH1616e = (TextView) findViewById(R.id.VlblH1616e);
            chkH1616e = (CheckBox) findViewById(R.id.chkH1616e);
            secH1616f = (LinearLayout) findViewById(R.id.secH1616f);
            lineH1616f = (View) findViewById(R.id.lineH1616f);
            VlblH1616f = (TextView) findViewById(R.id.VlblH1616f);
            chkH1616f = (CheckBox) findViewById(R.id.chkH1616f);
            secH1616g = (LinearLayout) findViewById(R.id.secH1616g);
            lineH1616g = (View) findViewById(R.id.lineH1616g);
            VlblH1616g = (TextView) findViewById(R.id.VlblH1616g);
            chkH1616g = (CheckBox) findViewById(R.id.chkH1616g);
            secH1616h = (LinearLayout) findViewById(R.id.secH1616h);
            lineH1616h = (View) findViewById(R.id.lineH1616h);
            VlblH1616h = (TextView) findViewById(R.id.VlblH1616h);
            chkH1616h = (CheckBox) findViewById(R.id.chkH1616h);
            secH1616i = (LinearLayout) findViewById(R.id.secH1616i);
            lineH1616i = (View) findViewById(R.id.lineH1616i);
            VlblH1616i = (TextView) findViewById(R.id.VlblH1616i);
            chkH1616i = (CheckBox) findViewById(R.id.chkH1616i);
            secH1616x = (LinearLayout) findViewById(R.id.secH1616x);
            lineH1616x = (View) findViewById(R.id.lineH1616x);
            VlblH1616x = (TextView) findViewById(R.id.VlblH1616x);
            chkH1616x = (CheckBox) findViewById(R.id.chkH1616x);
            secH1616x1 = (LinearLayout) findViewById(R.id.secH1616x1);
            lineH1616x1 = (View) findViewById(R.id.lineH1616x1);
            VlblH1616x1 = (TextView) findViewById(R.id.VlblH1616x1);
            txtH1616x1 = (EditText) findViewById(R.id.txtH1616x1);


            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });

            DataSearch(RND,SUCHANAID);
        } catch (Exception e) {
            Connection.MessageBox(NGOWork.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(NGOWork.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(NGOWork.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(NGOWork.this, "Required field: উপকারভোগী/সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (!rdoH1611.isChecked() & !rdoH1612.isChecked() & secH161.isShown()) {
                Connection.MessageBox(NGOWork.this, "Select anyone options from (আপনি/আপনার পরিবারের কেউ কি ‘সূচনা’ কর্মসূচির গ্রুপের সদস্য).");
                rdoH1611.requestFocus();
                return;
            } else if (!rdoH1621.isChecked() & !rdoH1622.isChecked() & secH162.isShown()) {
                Connection.MessageBox(NGOWork.this, "Select anyone options from (সুচনা কর্মসূচি আওতায় কোন ‘কোর’ গ্রুপের সদস্য হওয়াতে আপনি কি কোন ট্রেনিং পেয়েছেন).");
                rdoH1621.requestFocus();
                return;
            } else if (txtH163oth.getText().toString().length() == 0 & secH163oth.isShown()) {
                Connection.MessageBox(NGOWork.this, "Required field: উল্লেখ কর.");
                txtH163oth.requestFocus();
                return;
            } else if (txtH164.getText().toString().length() == 0 & secH164.isShown()) {
                Connection.MessageBox(NGOWork.this, "Required field: আপনি সুচনা ‘কোর’ গ্রুপের সদস্য হবার পর গত 6 months এ কতগুলো ট্রেনিং সেশনে উপস্থিত ছিলেন.");
                txtH164.requestFocus();
                return;
            } else if (txtH16x1.getText().toString().length() == 0 & secH16x1.isShown()) {
                Connection.MessageBox(NGOWork.this, "Required field: উল্লেখ কর.");
                txtH16x1.requestFocus();
                return;
            } else if (!rdoH1661.isChecked() & !rdoH1662.isChecked() & secH166.isShown()) {
                Connection.MessageBox(NGOWork.this, "Select anyone options from (সুচনা কর্মসূচি থেকে আপনি কি কোনো গ্রান্ট/অনুদান পেয়েছেন).");
                rdoH1661.requestFocus();
                return;
            } else if (txtH167x1.getText().toString().length() == 0 & secH167x1.isShown()) {
                Connection.MessageBox(NGOWork.this, "Required field: উল্লেখ কর.");
                txtH167x1.requestFocus();
                return;
            } else if (txtH168.getText().toString().length() == 0 & secH168.isShown()) {
                Connection.MessageBox(NGOWork.this, "Required field: গ্রান্ট/অনুদানগুলি কবে পেয়েছিলেন.");
                txtH168.requestFocus();
                return;
            } else if (Integer.valueOf(txtH168.getText().toString().length() == 0 ? "1" : txtH168.getText().toString()) < 1 || Integer.valueOf(txtH168.getText().toString().length() == 0 ? "50" : txtH168.getText().toString()) > 50) {
                Connection.MessageBox(NGOWork.this, "Value should be between 1 and 50(গ্রান্ট/অনুদানগুলি কবে পেয়েছিলেন).");
                txtH168.requestFocus();
                return;
            } else if (!rdoH1691.isChecked() & !rdoH1692.isChecked() & secH169.isShown()) {
                Connection.MessageBox(NGOWork.this, "Select anyone options from (সুচনা কর্মসূচির  গ্রান্ট/অনুদান পাবার পর আপনি কি কোনো ‘কোচিং’ পেয়েছেন).");
                rdoH1691.requestFocus();
                return;
            } else if (txtH1610.getText().toString().length() == 0 & secH1610.isShown()) {
                Connection.MessageBox(NGOWork.this, "Required field: সুচনা কর্মসূচির  গ্রান্ট/অনুদান পাবার পর আপনি গত 6 months এ কয়েটি কোচিং সেশন পেয়েছেন.");
                txtH1610.requestFocus();
                return;
            } else if (Integer.valueOf(txtH1610.getText().toString().length() == 0 ? "1" : txtH1610.getText().toString()) < 1 || Integer.valueOf(txtH1610.getText().toString().length() == 0 ? "6" : txtH1610.getText().toString()) > 6) {
                Connection.MessageBox(NGOWork.this, "Value should be between 1 and 6(সুচনা কর্মসূচির  গ্রান্ট/অনুদান পাবার পর আপনি গত 6 months এ কয়েটি কোচিং সেশন পেয়েছেন).");
                txtH1610.requestFocus();
                return;
            } else if (!rdoH16111.isChecked() & !rdoH16112.isChecked() & secH1611.isShown()) {
                Connection.MessageBox(NGOWork.this, "Select anyone options from (? (সুচনা বহির্ভূত) গত 1 year এর ভেতর আপনি/আপনার পরিবারের কেউ কি কোন এন,জি,ও কর্মসূচির).");
                rdoH16111.requestFocus();
                return;
            } else if (txtH1612x1.getText().toString().length() == 0 & secH1612x1.isShown()) {
                Connection.MessageBox(NGOWork.this, "Required field: (উল্লেখ কর.");
                txtH1612x1.requestFocus();
                return;
            } else if (!rdoH16131.isChecked() & !rdoH16132.isChecked() & secH1613.isShown()) {
                Connection.MessageBox(NGOWork.this, "Select anyone options from (এন,জি,ও কর্মসূচির আওতায় কি কোন ট্রনিং পেয়েছেন).");
                rdoH16131.requestFocus();
                return;
            } else if (txtH1614x1.getText().toString().length() == 0 & secH1614x1.isShown()) {
                Connection.MessageBox(NGOWork.this, "Required field: উল্লেখ কর.");
                txtH1614x1.requestFocus();
                return;
            } else if (!rdoH16151.isChecked() & !rdoH16152.isChecked() & secH1615.isShown()) {
                Connection.MessageBox(NGOWork.this, "Select anyone options from (এন,জি,ও কর্মসূচির আওতায় কোনো গ্রান্ট/অনুদান পেয়েছেন).");
                rdoH16151.requestFocus();
                return;
            } else if (txtH1616x1.getText().toString().length() == 0 & secH1616x1.isShown()) {
                Connection.MessageBox(NGOWork.this, "Required field: উল্লেখ কর.");
                txtH1616x1.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            NGOWork_DataModel objSave = new NGOWork_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            String[] d_rdogrpH161 = new String[]{"1", "0"};
            objSave.setH161("");
            for (int i = 0; i < rdogrpH161.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH161.getChildAt(i);
                if (rb.isChecked()) objSave.setH161(d_rdogrpH161[i]);
            }

            String[] d_rdogrpH162 = new String[]{"1", "0"};
            objSave.setH162("");
            for (int i = 0; i < rdogrpH162.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH162.getChildAt(i);
                if (rb.isChecked()) objSave.setH162(d_rdogrpH162[i]);
            }

            objSave.setH163a((chkH163a.isChecked() ? "1" : "2"));
            objSave.setH163b((chkH163b.isChecked() ? "1" : "2"));
            objSave.setH163c((chkH163c.isChecked() ? "1" : "2"));
            objSave.setH163d((chkH163d.isChecked() ? "1" : "2"));
            objSave.setH163e((chkH163e.isChecked() ? "1" : "2"));
            objSave.setH163f((chkH163f.isChecked() ? "1" : "2"));
            objSave.setH163g((chkH163g.isChecked() ? "1" : "2"));
            objSave.setH163h((chkH163h.isChecked() ? "1" : "2"));
            objSave.setH163i((chkH163i.isChecked() ? "1" : "2"));
            objSave.setH163x((chkH163x.isChecked() ? "1" : "2"));
            objSave.setH163oth(txtH163oth.getText().toString());
            objSave.setH164(txtH164.getText().toString());
            objSave.setH165a((chkH165a.isChecked() ? "1" : "2"));
            objSave.setH165b((chkH165b.isChecked() ? "1" : "2"));
            objSave.setH165c((chkH165c.isChecked() ? "1" : "2"));
            objSave.setH165d((chkH165d.isChecked() ? "1" : "2"));
            objSave.setH165e((chkH165e.isChecked() ? "1" : "2"));
            objSave.setH165f((chkH165f.isChecked() ? "1" : "2"));
            objSave.setH165g((chkH165g.isChecked() ? "1" : "2"));
            objSave.setH165h((chkH165h.isChecked() ? "1" : "2"));
            objSave.setH165x((chkH165x.isChecked() ? "1" : "2"));
            objSave.setH16x1(txtH16x1.getText().toString());
            objSave.setH165i((chkH165i.isChecked() ? "1" : "2"));
            String[] d_rdogrpH166 = new String[]{"1", "0"};
            objSave.setH166("");
            for (int i = 0; i < rdogrpH166.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH166.getChildAt(i);
                if (rb.isChecked()) objSave.setH166(d_rdogrpH166[i]);
            }

            objSave.setH167a((chkH167a.isChecked() ? "1" : "2"));
            objSave.setH167b((chkH167b.isChecked() ? "1" : "2"));
            objSave.setH167c((chkH167c.isChecked() ? "1" : "2"));
            objSave.setH167d((chkH167d.isChecked() ? "1" : "2"));
            objSave.setH167e((chkH167e.isChecked() ? "1" : "2"));
            objSave.setH167f((chkH167f.isChecked() ? "1" : "2"));
            objSave.setH167g((chkH167g.isChecked() ? "1" : "2"));
            objSave.setH167i((chkH167i.isChecked() ? "1" : "2"));
            objSave.setH167x((chkH167x.isChecked() ? "1" : "2"));
            objSave.setH167x1(txtH167x1.getText().toString());
            objSave.setH168(txtH168.getText().toString());
            String[] d_rdogrpH169 = new String[]{"1", "0"};
            objSave.setH169("");
            for (int i = 0; i < rdogrpH169.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH169.getChildAt(i);
                if (rb.isChecked()) objSave.setH169(d_rdogrpH169[i]);
            }

            objSave.setH1610(txtH1610.getText().toString());
            String[] d_rdogrpH1611 = new String[]{"1", "0"};
            objSave.setH1611("");
            for (int i = 0; i < rdogrpH1611.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH1611.getChildAt(i);
                if (rb.isChecked()) objSave.setH1611(d_rdogrpH1611[i]);
            }

            objSave.setH1612a((chkH1612a.isChecked() ? "1" : "2"));
            objSave.setH1612b((chkH1612b.isChecked() ? "1" : "2"));
            objSave.setH1612c((chkH1612c.isChecked() ? "1" : "2"));
            objSave.setH1612d((chkH1612d.isChecked() ? "1" : "2"));
            objSave.setH1612e((chkH1612e.isChecked() ? "1" : "2"));
            objSave.setH1612f((chkH1612f.isChecked() ? "1" : "2"));
            objSave.setH1612g((chkH1612g.isChecked() ? "1" : "2"));
            objSave.setH1612h((chkH1612h.isChecked() ? "1" : "2"));
            objSave.setH1612i((chkH1612i.isChecked() ? "1" : "2"));
            objSave.setH1612j((chkH1612j.isChecked() ? "1" : "2"));
            objSave.setH1612x((chkH1612x.isChecked() ? "1" : "2"));
            objSave.setH1612x1(txtH1612x1.getText().toString());
            String[] d_rdogrpH1613 = new String[]{"1", "0"};
            objSave.setH1613("");
            for (int i = 0; i < rdogrpH1613.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH1613.getChildAt(i);
                if (rb.isChecked()) objSave.setH1613(d_rdogrpH1613[i]);
            }

            objSave.setH1614a((chkH1614a.isChecked() ? "1" : "2"));
            objSave.setH1614b((chkH1614b.isChecked() ? "1" : "2"));
            objSave.setH1614c((chkH1614c.isChecked() ? "1" : "2"));
            objSave.setH1614d((chkH1614d.isChecked() ? "1" : "2"));
            objSave.setH1614e((chkH1614e.isChecked() ? "1" : "2"));
            objSave.setH1614f((chkH1614f.isChecked() ? "1" : "2"));
            objSave.setH1614x((chkH1614x.isChecked() ? "1" : "2"));
            objSave.setH1614x1(txtH1614x1.getText().toString());
            String[] d_rdogrpH1615 = new String[]{"1", "0"};
            objSave.setH1615("");
            for (int i = 0; i < rdogrpH1615.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH1615.getChildAt(i);
                if (rb.isChecked()) objSave.setH1615(d_rdogrpH1615[i]);
            }

            objSave.setH1616a((chkH1616a.isChecked() ? "1" : "2"));
            objSave.setH1616b((chkH1616b.isChecked() ? "1" : "2"));
            objSave.setH1616c((chkH1616c.isChecked() ? "1" : "2"));
            objSave.setH1616d((chkH1616d.isChecked() ? "1" : "2"));
            objSave.setH1616e((chkH1616e.isChecked() ? "1" : "2"));
            objSave.setH1616f((chkH1616f.isChecked() ? "1" : "2"));
            objSave.setH1616g((chkH1616g.isChecked() ? "1" : "2"));
            objSave.setH1616h((chkH1616h.isChecked() ? "1" : "2"));
            objSave.setH1616i((chkH1616i.isChecked() ? "1" : "2"));
            objSave.setH1616x((chkH1616x.isChecked() ? "1" : "2"));
            objSave.setH1616x1(txtH1616x1.getText().toString());
            objSave.setStartTime(StartTime);
            objSave.setEndTime(g.CurrentTime24());
            objSave.setUserId(g.getUserId());
            objSave.setEntryUser(g.getUserId()); //from data entry user list
            //objSave.setLat(Double.toString(currentLatitude));
            //objSave.setLon(Double.toString(currentLongitude));

            String status = objSave.SaveUpdateData(this);
            if (status.length() == 0) {
                Connection.MessageBox(NGOWork.this, "Saved Successfully");
            } else {
                Connection.MessageBox(NGOWork.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(NGOWork.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            NGOWork_DataModel d = new NGOWork_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<NGOWork_DataModel> data = d.SelectAll(this, SQL);
            for (NGOWork_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                String[] d_rdogrpH161 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH161.length; i++) {
                    if (item.getH161().equals(String.valueOf(d_rdogrpH161[i]))) {
                        rb = (RadioButton) rdogrpH161.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH162 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH162.length; i++) {
                    if (item.getH162().equals(String.valueOf(d_rdogrpH162[i]))) {
                        rb = (RadioButton) rdogrpH162.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH163a().equals("1")) {
                    chkH163a.setChecked(true);
                } else if (item.getH163a().equals("2")) {
                    chkH163a.setChecked(false);
                }
                if (item.getH163b().equals("1")) {
                    chkH163b.setChecked(true);
                } else if (item.getH163b().equals("2")) {
                    chkH163b.setChecked(false);
                }
                if (item.getH163c().equals("1")) {
                    chkH163c.setChecked(true);
                } else if (item.getH163c().equals("2")) {
                    chkH163c.setChecked(false);
                }
                if (item.getH163d().equals("1")) {
                    chkH163d.setChecked(true);
                } else if (item.getH163d().equals("2")) {
                    chkH163d.setChecked(false);
                }
                if (item.getH163e().equals("1")) {
                    chkH163e.setChecked(true);
                } else if (item.getH163e().equals("2")) {
                    chkH163e.setChecked(false);
                }
                if (item.getH163f().equals("1")) {
                    chkH163f.setChecked(true);
                } else if (item.getH163f().equals("2")) {
                    chkH163f.setChecked(false);
                }
                if (item.getH163g().equals("1")) {
                    chkH163g.setChecked(true);
                } else if (item.getH163g().equals("2")) {
                    chkH163g.setChecked(false);
                }
                if (item.getH163h().equals("1")) {
                    chkH163h.setChecked(true);
                } else if (item.getH163h().equals("2")) {
                    chkH163h.setChecked(false);
                }
                if (item.getH163i().equals("1")) {
                    chkH163i.setChecked(true);
                } else if (item.getH163i().equals("2")) {
                    chkH163i.setChecked(false);
                }
                if (item.getH163x().equals("1")) {
                    chkH163x.setChecked(true);
                } else if (item.getH163x().equals("2")) {
                    chkH163x.setChecked(false);
                }
                txtH163oth.setText(item.getH163oth());
                txtH164.setText(item.getH164());
                if (item.getH165a().equals("1")) {
                    chkH165a.setChecked(true);
                } else if (item.getH165a().equals("2")) {
                    chkH165a.setChecked(false);
                }
                if (item.getH165b().equals("1")) {
                    chkH165b.setChecked(true);
                } else if (item.getH165b().equals("2")) {
                    chkH165b.setChecked(false);
                }
                if (item.getH165c().equals("1")) {
                    chkH165c.setChecked(true);
                } else if (item.getH165c().equals("2")) {
                    chkH165c.setChecked(false);
                }
                if (item.getH165d().equals("1")) {
                    chkH165d.setChecked(true);
                } else if (item.getH165d().equals("2")) {
                    chkH165d.setChecked(false);
                }
                if (item.getH165e().equals("1")) {
                    chkH165e.setChecked(true);
                } else if (item.getH165e().equals("2")) {
                    chkH165e.setChecked(false);
                }
                if (item.getH165f().equals("1")) {
                    chkH165f.setChecked(true);
                } else if (item.getH165f().equals("2")) {
                    chkH165f.setChecked(false);
                }
                if (item.getH165g().equals("1")) {
                    chkH165g.setChecked(true);
                } else if (item.getH165g().equals("2")) {
                    chkH165g.setChecked(false);
                }
                if (item.getH165h().equals("1")) {
                    chkH165h.setChecked(true);
                } else if (item.getH165h().equals("2")) {
                    chkH165h.setChecked(false);
                }
                if (item.getH165x().equals("1")) {
                    chkH165x.setChecked(true);
                } else if (item.getH165x().equals("2")) {
                    chkH165x.setChecked(false);
                }
                txtH16x1.setText(item.getH16x1());
                if (item.getH165i().equals("1")) {
                    chkH165i.setChecked(true);
                } else if (item.getH165i().equals("2")) {
                    chkH165i.setChecked(false);
                }
                String[] d_rdogrpH166 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH166.length; i++) {
                    if (item.getH166().equals(String.valueOf(d_rdogrpH166[i]))) {
                        rb = (RadioButton) rdogrpH166.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH167a().equals("1")) {
                    chkH167a.setChecked(true);
                } else if (item.getH167a().equals("2")) {
                    chkH167a.setChecked(false);
                }
                if (item.getH167b().equals("1")) {
                    chkH167b.setChecked(true);
                } else if (item.getH167b().equals("2")) {
                    chkH167b.setChecked(false);
                }
                if (item.getH167c().equals("1")) {
                    chkH167c.setChecked(true);
                } else if (item.getH167c().equals("2")) {
                    chkH167c.setChecked(false);
                }
                if (item.getH167d().equals("1")) {
                    chkH167d.setChecked(true);
                } else if (item.getH167d().equals("2")) {
                    chkH167d.setChecked(false);
                }
                if (item.getH167e().equals("1")) {
                    chkH167e.setChecked(true);
                } else if (item.getH167e().equals("2")) {
                    chkH167e.setChecked(false);
                }
                if (item.getH167f().equals("1")) {
                    chkH167f.setChecked(true);
                } else if (item.getH167f().equals("2")) {
                    chkH167f.setChecked(false);
                }
                if (item.getH167g().equals("1")) {
                    chkH167g.setChecked(true);
                } else if (item.getH167g().equals("2")) {
                    chkH167g.setChecked(false);
                }
                if (item.getH167i().equals("1")) {
                    chkH167i.setChecked(true);
                } else if (item.getH167i().equals("2")) {
                    chkH167i.setChecked(false);
                }
                if (item.getH167x().equals("1")) {
                    chkH167x.setChecked(true);
                } else if (item.getH167x().equals("2")) {
                    chkH167x.setChecked(false);
                }
                txtH167x1.setText(item.getH167x1());
                txtH168.setText(item.getH168());
                String[] d_rdogrpH169 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH169.length; i++) {
                    if (item.getH169().equals(String.valueOf(d_rdogrpH169[i]))) {
                        rb = (RadioButton) rdogrpH169.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH1610.setText(item.getH1610());
                String[] d_rdogrpH1611 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH1611.length; i++) {
                    if (item.getH1611().equals(String.valueOf(d_rdogrpH1611[i]))) {
                        rb = (RadioButton) rdogrpH1611.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH1612a().equals("1")) {
                    chkH1612a.setChecked(true);
                } else if (item.getH1612a().equals("2")) {
                    chkH1612a.setChecked(false);
                }
                if (item.getH1612b().equals("1")) {
                    chkH1612b.setChecked(true);
                } else if (item.getH1612b().equals("2")) {
                    chkH1612b.setChecked(false);
                }
                if (item.getH1612c().equals("1")) {
                    chkH1612c.setChecked(true);
                } else if (item.getH1612c().equals("2")) {
                    chkH1612c.setChecked(false);
                }
                if (item.getH1612d().equals("1")) {
                    chkH1612d.setChecked(true);
                } else if (item.getH1612d().equals("2")) {
                    chkH1612d.setChecked(false);
                }
                if (item.getH1612e().equals("1")) {
                    chkH1612e.setChecked(true);
                } else if (item.getH1612e().equals("2")) {
                    chkH1612e.setChecked(false);
                }
                if (item.getH1612f().equals("1")) {
                    chkH1612f.setChecked(true);
                } else if (item.getH1612f().equals("2")) {
                    chkH1612f.setChecked(false);
                }
                if (item.getH1612g().equals("1")) {
                    chkH1612g.setChecked(true);
                } else if (item.getH1612g().equals("2")) {
                    chkH1612g.setChecked(false);
                }
                if (item.getH1612h().equals("1")) {
                    chkH1612h.setChecked(true);
                } else if (item.getH1612h().equals("2")) {
                    chkH1612h.setChecked(false);
                }
                if (item.getH1612i().equals("1")) {
                    chkH1612i.setChecked(true);
                } else if (item.getH1612i().equals("2")) {
                    chkH1612i.setChecked(false);
                }
                if (item.getH1612j().equals("1")) {
                    chkH1612j.setChecked(true);
                } else if (item.getH1612j().equals("2")) {
                    chkH1612j.setChecked(false);
                }
                if (item.getH1612x().equals("1")) {
                    chkH1612x.setChecked(true);
                } else if (item.getH1612x().equals("2")) {
                    chkH1612x.setChecked(false);
                }
                txtH1612x1.setText(item.getH1612x1());
                String[] d_rdogrpH1613 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH1613.length; i++) {
                    if (item.getH1613().equals(String.valueOf(d_rdogrpH1613[i]))) {
                        rb = (RadioButton) rdogrpH1613.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH1614a().equals("1")) {
                    chkH1614a.setChecked(true);
                } else if (item.getH1614a().equals("2")) {
                    chkH1614a.setChecked(false);
                }
                if (item.getH1614b().equals("1")) {
                    chkH1614b.setChecked(true);
                } else if (item.getH1614b().equals("2")) {
                    chkH1614b.setChecked(false);
                }
                if (item.getH1614c().equals("1")) {
                    chkH1614c.setChecked(true);
                } else if (item.getH1614c().equals("2")) {
                    chkH1614c.setChecked(false);
                }
                if (item.getH1614d().equals("1")) {
                    chkH1614d.setChecked(true);
                } else if (item.getH1614d().equals("2")) {
                    chkH1614d.setChecked(false);
                }
                if (item.getH1614e().equals("1")) {
                    chkH1614e.setChecked(true);
                } else if (item.getH1614e().equals("2")) {
                    chkH1614e.setChecked(false);
                }
                if (item.getH1614f().equals("1")) {
                    chkH1614f.setChecked(true);
                } else if (item.getH1614f().equals("2")) {
                    chkH1614f.setChecked(false);
                }
                if (item.getH1614x().equals("1")) {
                    chkH1614x.setChecked(true);
                } else if (item.getH1614x().equals("2")) {
                    chkH1614x.setChecked(false);
                }
                txtH1614x1.setText(item.getH1614x1());
                String[] d_rdogrpH1615 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH1615.length; i++) {
                    if (item.getH1615().equals(String.valueOf(d_rdogrpH1615[i]))) {
                        rb = (RadioButton) rdogrpH1615.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH1616a().equals("1")) {
                    chkH1616a.setChecked(true);
                } else if (item.getH1616a().equals("2")) {
                    chkH1616a.setChecked(false);
                }
                if (item.getH1616b().equals("1")) {
                    chkH1616b.setChecked(true);
                } else if (item.getH1616b().equals("2")) {
                    chkH1616b.setChecked(false);
                }
                if (item.getH1616c().equals("1")) {
                    chkH1616c.setChecked(true);
                } else if (item.getH1616c().equals("2")) {
                    chkH1616c.setChecked(false);
                }
                if (item.getH1616d().equals("1")) {
                    chkH1616d.setChecked(true);
                } else if (item.getH1616d().equals("2")) {
                    chkH1616d.setChecked(false);
                }
                if (item.getH1616e().equals("1")) {
                    chkH1616e.setChecked(true);
                } else if (item.getH1616e().equals("2")) {
                    chkH1616e.setChecked(false);
                }
                if (item.getH1616f().equals("1")) {
                    chkH1616f.setChecked(true);
                } else if (item.getH1616f().equals("2")) {
                    chkH1616f.setChecked(false);
                }
                if (item.getH1616g().equals("1")) {
                    chkH1616g.setChecked(true);
                } else if (item.getH1616g().equals("2")) {
                    chkH1616g.setChecked(false);
                }
                if (item.getH1616h().equals("1")) {
                    chkH1616h.setChecked(true);
                } else if (item.getH1616h().equals("2")) {
                    chkH1616h.setChecked(false);
                }
                if (item.getH1616i().equals("1")) {
                    chkH1616i.setChecked(true);
                } else if (item.getH1616i().equals("2")) {
                    chkH1616i.setChecked(false);
                }
                if (item.getH1616x().equals("1")) {
                    chkH1616x.setChecked(true);
                } else if (item.getH1616x().equals("2")) {
                    chkH1616x.setChecked(false);
                }
                txtH1616x1.setText(item.getH1616x1());
            }
        } catch (Exception e) {
            Connection.MessageBox(NGOWork.this, e.getMessage());
            return;
        }
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