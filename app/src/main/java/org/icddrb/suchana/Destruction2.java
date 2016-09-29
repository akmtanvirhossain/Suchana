package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Destruction2" android:label="Destruction2" />

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
import android.widget.CompoundButton;
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

public class Destruction2 extends Activity {
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
    LinearLayout seclb14b;
    LinearLayout secH14b1;
    View lineH14b1;
    TextView VlblH14b1;
    RadioGroup rdogrpH14b1;
    RadioButton rdoH14b11;
    RadioButton rdoH14b12;
    LinearLayout secH14b2;
    View lineH14b2;
    TextView VlblH14b2;
    RadioGroup rdogrpH14b2;
    RadioButton rdoH14b21;
    RadioButton rdoH14b22;
    LinearLayout secH14b3;
    View lineH14b3;
    TextView VlblH14b3;
    RadioGroup rdogrpH14b3;
    RadioButton rdoH14b31;
    RadioButton rdoH14b32;
    LinearLayout secH14b4;
    View lineH14b4;
    TextView VlblH14b4;
    RadioGroup rdogrpH14b4;
    RadioButton rdoH14b41;
    RadioButton rdoH14b42;
    LinearLayout secH14b5;
    View lineH14b5;
    TextView VlblH14b5;
    RadioGroup rdogrpH14b5;
    RadioButton rdoH14b51;
    RadioButton rdoH14b52;
    LinearLayout secH14b6;
    View lineH14b6;
    TextView VlblH14b6;
    RadioGroup rdogrpH14b6;
    RadioButton rdoH14b61;
    RadioButton rdoH14b62;
    LinearLayout secH14b7;
    View lineH14b7;
    TextView VlblH14b7;
    RadioGroup rdogrpH14b7;
    RadioButton rdoH14b71;
    RadioButton rdoH14b72;
    LinearLayout secH14b8;
    View lineH14b8;
    TextView VlblH14b8;
    RadioGroup rdogrpH14b8;
    RadioButton rdoH14b81;
    RadioButton rdoH14b82;
    LinearLayout secH14b8X;
    View lineH14b8X;
    TextView VlblH14b8X;
    EditText txtH14b8X;
    LinearLayout seclb14c;
    LinearLayout secH14c1;
    View lineH14c1;
    TextView VlblH14c1;
    RadioGroup rdogrpH14c1;
    RadioButton rdoH14c11;
    RadioButton rdoH14c12;
    LinearLayout secH14c1a;
    View lineH14c1a;
    TextView VlblH14c1a;
    CheckBox chkH14c1a;
    LinearLayout secH14c1b;
    View lineH14c1b;
    TextView VlblH14c1b;
    CheckBox chkH14c1b;
    LinearLayout secH14c1c;
    View lineH14c1c;
    TextView VlblH14c1c;
    CheckBox chkH14c1c;
    LinearLayout secH14c1d;
    View lineH14c1d;
    TextView VlblH14c1d;
    CheckBox chkH14c1d;
    LinearLayout secH14c1e;
    View lineH14c1e;
    TextView VlblH14c1e;
    CheckBox chkH14c1e;
    LinearLayout secH14c1f;
    View lineH14c1f;
    TextView VlblH14c1f;
    CheckBox chkH14c1f;
    LinearLayout secH14c1g;
    View lineH14c1g;
    TextView VlblH14c1g;
    CheckBox chkH14c1g;
    LinearLayout secH14c1h;
    View lineH14c1h;
    TextView VlblH14c1h;
    CheckBox chkH14c1h;
    LinearLayout secH14c1i;
    View lineH14c1i;
    TextView VlblH14c1i;
    CheckBox chkH14c1i;
    LinearLayout secH14c1j;
    View lineH14c1j;
    TextView VlblH14c1j;
    CheckBox chkH14c1j;
    LinearLayout secH14c1k;
    View lineH14c1k;
    TextView VlblH14c1k;
    CheckBox chkH14c1k;
    LinearLayout secH14c1l;
    View lineH14c1l;
    TextView VlblH14c1l;
    CheckBox chkH14c1l;
    LinearLayout secH14c1m;
    View lineH14c1m;
    TextView VlblH14c1m;
    CheckBox chkH14c1m;
    LinearLayout secH14c1n;
    View lineH14c1n;
    TextView VlblH14c1n;
    CheckBox chkH14c1n;
    LinearLayout secH14c1o;
    View lineH14c1o;
    TextView VlblH14c1o;
    CheckBox chkH14c1o;
    LinearLayout secH14c1p;
    View lineH14c1p;
    TextView VlblH14c1p;
    CheckBox chkH14c1p;
    LinearLayout secH14c1q;
    View lineH14c1q;
    TextView VlblH14c1q;
    CheckBox chkH14c1q;
    LinearLayout secH14c1r;
    View lineH14c1r;
    TextView VlblH14c1r;
    CheckBox chkH14c1r;
    LinearLayout secH14c1s;
    View lineH14c1s;
    TextView VlblH14c1s;
    CheckBox chkH14c1s;
    LinearLayout secH14c1t;
    View lineH14c1t;
    TextView VlblH14c1t;
    CheckBox chkH14c1t;
    LinearLayout secH14c1x;
    View lineH14c1x;
    TextView VlblH14c1x;
    CheckBox chkH14c1x;
    LinearLayout secH14c1x1;
    View lineH14c1x1;
    TextView VlblH14c1x1;
    EditText txtH14c1x1;
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
            setContentView(R.layout.destruction2);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TableName = "Destruction2";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Destruction2.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Destruction1.class);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(Destruction2.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to return to Home [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(), MainMenu.class);
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
            seclb14b = (LinearLayout) findViewById(R.id.seclb14b);
            secH14b1 = (LinearLayout) findViewById(R.id.secH14b1);
            lineH14b1 = (View) findViewById(R.id.lineH14b1);
            VlblH14b1 = (TextView) findViewById(R.id.VlblH14b1);
            rdogrpH14b1 = (RadioGroup) findViewById(R.id.rdogrpH14b1);

            rdoH14b11 = (RadioButton) findViewById(R.id.rdoH14b11);
            rdoH14b12 = (RadioButton) findViewById(R.id.rdoH14b12);
            secH14b2 = (LinearLayout) findViewById(R.id.secH14b2);
            lineH14b2 = (View) findViewById(R.id.lineH14b2);
            VlblH14b2 = (TextView) findViewById(R.id.VlblH14b2);
            rdogrpH14b2 = (RadioGroup) findViewById(R.id.rdogrpH14b2);

            rdoH14b21 = (RadioButton) findViewById(R.id.rdoH14b21);
            rdoH14b22 = (RadioButton) findViewById(R.id.rdoH14b22);
            secH14b3 = (LinearLayout) findViewById(R.id.secH14b3);
            lineH14b3 = (View) findViewById(R.id.lineH14b3);
            VlblH14b3 = (TextView) findViewById(R.id.VlblH14b3);
            rdogrpH14b3 = (RadioGroup) findViewById(R.id.rdogrpH14b3);

            rdoH14b31 = (RadioButton) findViewById(R.id.rdoH14b31);
            rdoH14b32 = (RadioButton) findViewById(R.id.rdoH14b32);
            secH14b4 = (LinearLayout) findViewById(R.id.secH14b4);
            lineH14b4 = (View) findViewById(R.id.lineH14b4);
            VlblH14b4 = (TextView) findViewById(R.id.VlblH14b4);
            rdogrpH14b4 = (RadioGroup) findViewById(R.id.rdogrpH14b4);

            rdoH14b41 = (RadioButton) findViewById(R.id.rdoH14b41);
            rdoH14b42 = (RadioButton) findViewById(R.id.rdoH14b42);
            secH14b5 = (LinearLayout) findViewById(R.id.secH14b5);
            lineH14b5 = (View) findViewById(R.id.lineH14b5);
            VlblH14b5 = (TextView) findViewById(R.id.VlblH14b5);
            rdogrpH14b5 = (RadioGroup) findViewById(R.id.rdogrpH14b5);

            rdoH14b51 = (RadioButton) findViewById(R.id.rdoH14b51);
            rdoH14b52 = (RadioButton) findViewById(R.id.rdoH14b52);
            secH14b6 = (LinearLayout) findViewById(R.id.secH14b6);
            lineH14b6 = (View) findViewById(R.id.lineH14b6);
            VlblH14b6 = (TextView) findViewById(R.id.VlblH14b6);
            rdogrpH14b6 = (RadioGroup) findViewById(R.id.rdogrpH14b6);

            rdoH14b61 = (RadioButton) findViewById(R.id.rdoH14b61);
            rdoH14b62 = (RadioButton) findViewById(R.id.rdoH14b62);
            secH14b7 = (LinearLayout) findViewById(R.id.secH14b7);
            lineH14b7 = (View) findViewById(R.id.lineH14b7);
            VlblH14b7 = (TextView) findViewById(R.id.VlblH14b7);
            rdogrpH14b7 = (RadioGroup) findViewById(R.id.rdogrpH14b7);

            rdoH14b71 = (RadioButton) findViewById(R.id.rdoH14b71);
            rdoH14b72 = (RadioButton) findViewById(R.id.rdoH14b72);
            secH14b8 = (LinearLayout) findViewById(R.id.secH14b8);
            lineH14b8 = (View) findViewById(R.id.lineH14b8);
            VlblH14b8 = (TextView) findViewById(R.id.VlblH14b8);
            rdogrpH14b8 = (RadioGroup) findViewById(R.id.rdogrpH14b8);

            rdoH14b81 = (RadioButton) findViewById(R.id.rdoH14b81);
            rdoH14b82 = (RadioButton) findViewById(R.id.rdoH14b82);
            rdogrpH14b8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH14b8 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH14b8.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH14b8.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH14b8[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        txtH14b8X.setText("");
                        secH14b8X.setVisibility(View.GONE);
                    } else {
                        secH14b8X.setVisibility(View.VISIBLE);
                    }

                }
            });
            secH14b8X = (LinearLayout) findViewById(R.id.secH14b8X);
            lineH14b8X = (View) findViewById(R.id.lineH14b8X);
            VlblH14b8X = (TextView) findViewById(R.id.VlblH14b8X);
            txtH14b8X = (EditText) findViewById(R.id.txtH14b8X);
            secH14b8X.setVisibility(View.GONE);
            seclb14c = (LinearLayout) findViewById(R.id.seclb14c);
            secH14c1 = (LinearLayout) findViewById(R.id.secH14c1);
            lineH14c1 = (View) findViewById(R.id.lineH14c1);
            VlblH14c1 = (TextView) findViewById(R.id.VlblH14c1);
            rdogrpH14c1 = (RadioGroup) findViewById(R.id.rdogrpH14c1);

            rdoH14c11 = (RadioButton) findViewById(R.id.rdoH14c11);
            rdoH14c12 = (RadioButton) findViewById(R.id.rdoH14c12);
            rdogrpH14c1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH14c1 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH14c1.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH14c1.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH14c1[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH14c1a.setVisibility(View.GONE);
                        lineH14c1a.setVisibility(View.GONE);
                        chkH14c1a.setChecked(false);
                        secH14c1b.setVisibility(View.GONE);
                        lineH14c1b.setVisibility(View.GONE);
                        chkH14c1b.setChecked(false);
                        secH14c1c.setVisibility(View.GONE);
                        lineH14c1c.setVisibility(View.GONE);
                        chkH14c1c.setChecked(false);
                        secH14c1d.setVisibility(View.GONE);
                        lineH14c1d.setVisibility(View.GONE);
                        chkH14c1d.setChecked(false);
                        secH14c1e.setVisibility(View.GONE);
                        lineH14c1e.setVisibility(View.GONE);
                        chkH14c1e.setChecked(false);
                        secH14c1f.setVisibility(View.GONE);
                        lineH14c1f.setVisibility(View.GONE);
                        chkH14c1f.setChecked(false);
                        secH14c1g.setVisibility(View.GONE);
                        lineH14c1g.setVisibility(View.GONE);
                        chkH14c1g.setChecked(false);
                        secH14c1h.setVisibility(View.GONE);
                        lineH14c1h.setVisibility(View.GONE);
                        chkH14c1h.setChecked(false);
                        secH14c1i.setVisibility(View.GONE);
                        lineH14c1i.setVisibility(View.GONE);
                        chkH14c1i.setChecked(false);
                        secH14c1j.setVisibility(View.GONE);
                        lineH14c1j.setVisibility(View.GONE);
                        chkH14c1j.setChecked(false);
                        secH14c1k.setVisibility(View.GONE);
                        lineH14c1k.setVisibility(View.GONE);
                        chkH14c1k.setChecked(false);
                        secH14c1l.setVisibility(View.GONE);
                        lineH14c1l.setVisibility(View.GONE);
                        chkH14c1l.setChecked(false);
                        secH14c1m.setVisibility(View.GONE);
                        lineH14c1m.setVisibility(View.GONE);
                        chkH14c1m.setChecked(false);
                        secH14c1n.setVisibility(View.GONE);
                        lineH14c1n.setVisibility(View.GONE);
                        chkH14c1n.setChecked(false);
                        secH14c1o.setVisibility(View.GONE);
                        lineH14c1o.setVisibility(View.GONE);
                        chkH14c1o.setChecked(false);
                        secH14c1p.setVisibility(View.GONE);
                        lineH14c1p.setVisibility(View.GONE);
                        chkH14c1p.setChecked(false);
                        secH14c1q.setVisibility(View.GONE);
                        lineH14c1q.setVisibility(View.GONE);
                        chkH14c1q.setChecked(false);
                        secH14c1r.setVisibility(View.GONE);
                        lineH14c1r.setVisibility(View.GONE);
                        chkH14c1r.setChecked(false);
                        secH14c1s.setVisibility(View.GONE);
                        lineH14c1s.setVisibility(View.GONE);
                        chkH14c1s.setChecked(false);
                        secH14c1t.setVisibility(View.GONE);
                        lineH14c1t.setVisibility(View.GONE);
                        chkH14c1t.setChecked(false);
                        secH14c1x.setVisibility(View.GONE);
                        lineH14c1x.setVisibility(View.GONE);
                        chkH14c1x.setChecked(true);
                        chkH14c1x.setChecked(false);
                    } else {
                        secH14c1a.setVisibility(View.VISIBLE);
                        lineH14c1a.setVisibility(View.VISIBLE);
                        secH14c1b.setVisibility(View.VISIBLE);
                        lineH14c1b.setVisibility(View.VISIBLE);
                        secH14c1c.setVisibility(View.VISIBLE);
                        lineH14c1c.setVisibility(View.VISIBLE);
                        secH14c1d.setVisibility(View.VISIBLE);
                        lineH14c1d.setVisibility(View.VISIBLE);
                        secH14c1e.setVisibility(View.VISIBLE);
                        lineH14c1e.setVisibility(View.VISIBLE);
                        secH14c1f.setVisibility(View.VISIBLE);
                        lineH14c1f.setVisibility(View.VISIBLE);
                        secH14c1g.setVisibility(View.VISIBLE);
                        lineH14c1g.setVisibility(View.VISIBLE);
                        secH14c1h.setVisibility(View.VISIBLE);
                        lineH14c1h.setVisibility(View.VISIBLE);
                        secH14c1i.setVisibility(View.VISIBLE);
                        lineH14c1i.setVisibility(View.VISIBLE);
                        secH14c1j.setVisibility(View.VISIBLE);
                        lineH14c1j.setVisibility(View.VISIBLE);
                        secH14c1k.setVisibility(View.VISIBLE);
                        lineH14c1k.setVisibility(View.VISIBLE);
                        secH14c1l.setVisibility(View.VISIBLE);
                        lineH14c1l.setVisibility(View.VISIBLE);
                        secH14c1m.setVisibility(View.VISIBLE);
                        lineH14c1m.setVisibility(View.VISIBLE);
                        secH14c1n.setVisibility(View.VISIBLE);
                        lineH14c1n.setVisibility(View.VISIBLE);
                        secH14c1o.setVisibility(View.VISIBLE);
                        lineH14c1o.setVisibility(View.VISIBLE);
                        secH14c1p.setVisibility(View.VISIBLE);
                        lineH14c1p.setVisibility(View.VISIBLE);
                        secH14c1q.setVisibility(View.VISIBLE);
                        lineH14c1q.setVisibility(View.VISIBLE);
                        secH14c1r.setVisibility(View.VISIBLE);
                        lineH14c1r.setVisibility(View.VISIBLE);
                        secH14c1s.setVisibility(View.VISIBLE);
                        lineH14c1s.setVisibility(View.VISIBLE);
                        secH14c1t.setVisibility(View.VISIBLE);
                        lineH14c1t.setVisibility(View.VISIBLE);
                        secH14c1x.setVisibility(View.VISIBLE);
                        lineH14c1x.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH14c1a = (LinearLayout) findViewById(R.id.secH14c1a);
            lineH14c1a = (View) findViewById(R.id.lineH14c1a);
            VlblH14c1a = (TextView) findViewById(R.id.VlblH14c1a);
            chkH14c1a = (CheckBox) findViewById(R.id.chkH14c1a);
            secH14c1b = (LinearLayout) findViewById(R.id.secH14c1b);
            lineH14c1b = (View) findViewById(R.id.lineH14c1b);
            VlblH14c1b = (TextView) findViewById(R.id.VlblH14c1b);
            chkH14c1b = (CheckBox) findViewById(R.id.chkH14c1b);
            secH14c1c = (LinearLayout) findViewById(R.id.secH14c1c);
            lineH14c1c = (View) findViewById(R.id.lineH14c1c);
            VlblH14c1c = (TextView) findViewById(R.id.VlblH14c1c);
            chkH14c1c = (CheckBox) findViewById(R.id.chkH14c1c);
            secH14c1d = (LinearLayout) findViewById(R.id.secH14c1d);
            lineH14c1d = (View) findViewById(R.id.lineH14c1d);
            VlblH14c1d = (TextView) findViewById(R.id.VlblH14c1d);
            chkH14c1d = (CheckBox) findViewById(R.id.chkH14c1d);
            secH14c1e = (LinearLayout) findViewById(R.id.secH14c1e);
            lineH14c1e = (View) findViewById(R.id.lineH14c1e);
            VlblH14c1e = (TextView) findViewById(R.id.VlblH14c1e);
            chkH14c1e = (CheckBox) findViewById(R.id.chkH14c1e);
            secH14c1f = (LinearLayout) findViewById(R.id.secH14c1f);
            lineH14c1f = (View) findViewById(R.id.lineH14c1f);
            VlblH14c1f = (TextView) findViewById(R.id.VlblH14c1f);
            chkH14c1f = (CheckBox) findViewById(R.id.chkH14c1f);
            secH14c1g = (LinearLayout) findViewById(R.id.secH14c1g);
            lineH14c1g = (View) findViewById(R.id.lineH14c1g);
            VlblH14c1g = (TextView) findViewById(R.id.VlblH14c1g);
            chkH14c1g = (CheckBox) findViewById(R.id.chkH14c1g);
            secH14c1h = (LinearLayout) findViewById(R.id.secH14c1h);
            lineH14c1h = (View) findViewById(R.id.lineH14c1h);
            VlblH14c1h = (TextView) findViewById(R.id.VlblH14c1h);
            chkH14c1h = (CheckBox) findViewById(R.id.chkH14c1h);
            secH14c1i = (LinearLayout) findViewById(R.id.secH14c1i);
            lineH14c1i = (View) findViewById(R.id.lineH14c1i);
            VlblH14c1i = (TextView) findViewById(R.id.VlblH14c1i);
            chkH14c1i = (CheckBox) findViewById(R.id.chkH14c1i);
            secH14c1j = (LinearLayout) findViewById(R.id.secH14c1j);
            lineH14c1j = (View) findViewById(R.id.lineH14c1j);
            VlblH14c1j = (TextView) findViewById(R.id.VlblH14c1j);
            chkH14c1j = (CheckBox) findViewById(R.id.chkH14c1j);
            secH14c1k = (LinearLayout) findViewById(R.id.secH14c1k);
            lineH14c1k = (View) findViewById(R.id.lineH14c1k);
            VlblH14c1k = (TextView) findViewById(R.id.VlblH14c1k);
            chkH14c1k = (CheckBox) findViewById(R.id.chkH14c1k);
            secH14c1l = (LinearLayout) findViewById(R.id.secH14c1l);
            lineH14c1l = (View) findViewById(R.id.lineH14c1l);
            VlblH14c1l = (TextView) findViewById(R.id.VlblH14c1l);
            chkH14c1l = (CheckBox) findViewById(R.id.chkH14c1l);
            secH14c1m = (LinearLayout) findViewById(R.id.secH14c1m);
            lineH14c1m = (View) findViewById(R.id.lineH14c1m);
            VlblH14c1m = (TextView) findViewById(R.id.VlblH14c1m);
            chkH14c1m = (CheckBox) findViewById(R.id.chkH14c1m);
            secH14c1n = (LinearLayout) findViewById(R.id.secH14c1n);
            lineH14c1n = (View) findViewById(R.id.lineH14c1n);
            VlblH14c1n = (TextView) findViewById(R.id.VlblH14c1n);
            chkH14c1n = (CheckBox) findViewById(R.id.chkH14c1n);
            secH14c1o = (LinearLayout) findViewById(R.id.secH14c1o);
            lineH14c1o = (View) findViewById(R.id.lineH14c1o);
            VlblH14c1o = (TextView) findViewById(R.id.VlblH14c1o);
            chkH14c1o = (CheckBox) findViewById(R.id.chkH14c1o);
            secH14c1p = (LinearLayout) findViewById(R.id.secH14c1p);
            lineH14c1p = (View) findViewById(R.id.lineH14c1p);
            VlblH14c1p = (TextView) findViewById(R.id.VlblH14c1p);
            chkH14c1p = (CheckBox) findViewById(R.id.chkH14c1p);
            secH14c1q = (LinearLayout) findViewById(R.id.secH14c1q);
            lineH14c1q = (View) findViewById(R.id.lineH14c1q);
            VlblH14c1q = (TextView) findViewById(R.id.VlblH14c1q);
            chkH14c1q = (CheckBox) findViewById(R.id.chkH14c1q);
            secH14c1r = (LinearLayout) findViewById(R.id.secH14c1r);
            lineH14c1r = (View) findViewById(R.id.lineH14c1r);
            VlblH14c1r = (TextView) findViewById(R.id.VlblH14c1r);
            chkH14c1r = (CheckBox) findViewById(R.id.chkH14c1r);
            secH14c1s = (LinearLayout) findViewById(R.id.secH14c1s);
            lineH14c1s = (View) findViewById(R.id.lineH14c1s);
            VlblH14c1s = (TextView) findViewById(R.id.VlblH14c1s);
            chkH14c1s = (CheckBox) findViewById(R.id.chkH14c1s);
            secH14c1t = (LinearLayout) findViewById(R.id.secH14c1t);
            lineH14c1t = (View) findViewById(R.id.lineH14c1t);
            VlblH14c1t = (TextView) findViewById(R.id.VlblH14c1t);
            chkH14c1t = (CheckBox) findViewById(R.id.chkH14c1t);
            secH14c1x = (LinearLayout) findViewById(R.id.secH14c1x);
            lineH14c1x = (View) findViewById(R.id.lineH14c1x);
            VlblH14c1x = (TextView) findViewById(R.id.VlblH14c1x);
            chkH14c1x = (CheckBox) findViewById(R.id.chkH14c1x);
            chkH14c1x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        secH14c1x1.setVisibility(View.VISIBLE);
                    } else {
                        txtH14c1x1.setText("");
                        secH14c1x1.setVisibility(View.GONE);
                    }
                }
            });
            secH14c1x1 = (LinearLayout) findViewById(R.id.secH14c1x1);
            lineH14c1x1 = (View) findViewById(R.id.lineH14c1x1);
            VlblH14c1x1 = (TextView) findViewById(R.id.VlblH14c1x1);
            txtH14c1x1 = (EditText) findViewById(R.id.txtH14c1x1);


            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(Destruction2.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(Destruction2.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(Destruction2.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(Destruction2.this, "Required field: উপকারভোগী সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (!rdoH14b11.isChecked() & !rdoH14b12.isChecked() & secH14b1.isShown()) {
                Connection.MessageBox(Destruction2.this, "Select anyone options from (আগাম চাশাবাদ করা).");
                rdoH14b11.requestFocus();
                return;
            } else if (!rdoH14b21.isChecked() & !rdoH14b22.isChecked() & secH14b2.isShown()) {
                Connection.MessageBox(Destruction2.this, "Select anyone options from (ঘেরা জাইগাই মাছ উৎপাদন করা).");
                rdoH14b21.requestFocus();
                return;
            } else if (!rdoH14b31.isChecked() & !rdoH14b32.isChecked() & secH14b3.isShown()) {
                Connection.MessageBox(Destruction2.this, "Select anyone options from (উচু জায়গায় বাগান করা).");
                rdoH14b31.requestFocus();
                return;
            } else if (!rdoH14b41.isChecked() & !rdoH14b42.isChecked() & secH14b4.isShown()) {
                Connection.MessageBox(Destruction2.this, "Select anyone options from (পানি সহিষ্ণু প্রজাতি আবাদ ).");
                rdoH14b41.requestFocus();
                return;
            } else if (!rdoH14b51.isChecked() & !rdoH14b52.isChecked() & secH14b5.isShown()) {
                Connection.MessageBox(Destruction2.this, "Select anyone options from (বহুস্তরী বাগান করা).");
                rdoH14b51.requestFocus();
                return;
            } else if (!rdoH14b61.isChecked() & !rdoH14b62.isChecked() & secH14b6.isShown()) {
                Connection.MessageBox(Destruction2.this, "Select anyone options from (বস্তায় চাষ করা).");
                rdoH14b61.requestFocus();
                return;
            } else if (!rdoH14b71.isChecked() & !rdoH14b72.isChecked() & secH14b7.isShown()) {
                Connection.MessageBox(Destruction2.this, "Select anyone options from (বিকল্প জীবিকানির্বাহ কার্যক্রম).");
                rdoH14b71.requestFocus();
                return;
            } else if (!rdoH14b81.isChecked() & !rdoH14b82.isChecked() & secH14b8.isShown()) {
                Connection.MessageBox(Destruction2.this, "Select anyone options from (অনান্য).");
                rdoH14b81.requestFocus();
                return;
            } else if (txtH14b8X.getText().toString().length() == 0 & secH14b8X.isShown()) {
                Connection.MessageBox(Destruction2.this, "Required field: উল্লেখ কর.");
                txtH14b8X.requestFocus();
                return;
            } else if (!rdoH14c11.isChecked() & !rdoH14c12.isChecked() & secH14c1.isShown()) {
                Connection.MessageBox(Destruction2.this, "Select anyone options from (আপনি অথবা আপনার পরিবারের কোনো সদস্য সরকারের তরফ থেকে কোনো ভাতা /বৃত্তি / ক্ষুদ্র ঋণ পেয়েছেন).");
                rdoH14c11.requestFocus();
                return;
            } else if (txtH14c1x1.getText().toString().length() == 0 & secH14c1x1.isShown()) {
                Connection.MessageBox(Destruction2.this, "Required field: উল্লেখ কর.");
                txtH14c1x1.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            Destruction2_DataModel objSave = new Destruction2_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            String[] d_rdogrpH14b1 = new String[]{"1", "0"};
            objSave.setH14b1("");
            for (int i = 0; i < rdogrpH14b1.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH14b1.getChildAt(i);
                if (rb.isChecked()) objSave.setH14b1(d_rdogrpH14b1[i]);
            }

            String[] d_rdogrpH14b2 = new String[]{"1", "0"};
            objSave.setH14b2("");
            for (int i = 0; i < rdogrpH14b2.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH14b2.getChildAt(i);
                if (rb.isChecked()) objSave.setH14b2(d_rdogrpH14b2[i]);
            }

            String[] d_rdogrpH14b3 = new String[]{"1", "0"};
            objSave.setH14b3("");
            for (int i = 0; i < rdogrpH14b3.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH14b3.getChildAt(i);
                if (rb.isChecked()) objSave.setH14b3(d_rdogrpH14b3[i]);
            }

            String[] d_rdogrpH14b4 = new String[]{"1", "0"};
            objSave.setH14b4("");
            for (int i = 0; i < rdogrpH14b4.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH14b4.getChildAt(i);
                if (rb.isChecked()) objSave.setH14b4(d_rdogrpH14b4[i]);
            }

            String[] d_rdogrpH14b5 = new String[]{"1", "0"};
            objSave.setH14b5("");
            for (int i = 0; i < rdogrpH14b5.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH14b5.getChildAt(i);
                if (rb.isChecked()) objSave.setH14b5(d_rdogrpH14b5[i]);
            }

            String[] d_rdogrpH14b6 = new String[]{"1", "0"};
            objSave.setH14b6("");
            for (int i = 0; i < rdogrpH14b6.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH14b6.getChildAt(i);
                if (rb.isChecked()) objSave.setH14b6(d_rdogrpH14b6[i]);
            }

            String[] d_rdogrpH14b7 = new String[]{"1", "0"};
            objSave.setH14b7("");
            for (int i = 0; i < rdogrpH14b7.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH14b7.getChildAt(i);
                if (rb.isChecked()) objSave.setH14b7(d_rdogrpH14b7[i]);
            }

            String[] d_rdogrpH14b8 = new String[]{"1", "0"};
            objSave.setH14b8("");
            for (int i = 0; i < rdogrpH14b8.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH14b8.getChildAt(i);
                if (rb.isChecked()) objSave.setH14b8(d_rdogrpH14b8[i]);
            }

            objSave.setH14b8X(txtH14b8X.getText().toString());
            String[] d_rdogrpH14c1 = new String[]{"1", "0"};
            objSave.setH14c1("");
            for (int i = 0; i < rdogrpH14c1.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH14c1.getChildAt(i);
                if (rb.isChecked()) objSave.setH14c1(d_rdogrpH14c1[i]);
            }

            objSave.setH14c1a((chkH14c1a.isChecked() ? "1" : "2"));
            objSave.setH14c1b((chkH14c1b.isChecked() ? "1" : "2"));
            objSave.setH14c1c((chkH14c1c.isChecked() ? "1" : "2"));
            objSave.setH14c1d((chkH14c1d.isChecked() ? "1" : "2"));
            objSave.setH14c1e((chkH14c1e.isChecked() ? "1" : "2"));
            objSave.setH14c1f((chkH14c1f.isChecked() ? "1" : "2"));
            objSave.setH14c1g((chkH14c1g.isChecked() ? "1" : "2"));
            objSave.setH14c1h((chkH14c1h.isChecked() ? "1" : "2"));
            objSave.setH14c1i((chkH14c1i.isChecked() ? "1" : "2"));
            objSave.setH14c1j((chkH14c1j.isChecked() ? "1" : "2"));
            objSave.setH14c1k((chkH14c1k.isChecked() ? "1" : "2"));
            objSave.setH14c1l((chkH14c1l.isChecked() ? "1" : "2"));
            objSave.setH14c1m((chkH14c1m.isChecked() ? "1" : "2"));
            objSave.setH14c1n((chkH14c1n.isChecked() ? "1" : "2"));
            objSave.setH14c1o((chkH14c1o.isChecked() ? "1" : "2"));
            objSave.setH14c1p((chkH14c1p.isChecked() ? "1" : "2"));
            objSave.setH14c1q((chkH14c1q.isChecked() ? "1" : "2"));
            objSave.setH14c1r((chkH14c1r.isChecked() ? "1" : "2"));
            objSave.setH14c1s((chkH14c1s.isChecked() ? "1" : "2"));
            objSave.setH14c1t((chkH14c1t.isChecked() ? "1" : "2"));
            objSave.setH14c1x((chkH14c1x.isChecked() ? "1" : "2"));
            objSave.setH14c1x1(txtH14c1x1.getText().toString());
            objSave.setStartTime(StartTime);
            objSave.setEndTime(g.CurrentTime24());
            objSave.setUserId(g.getUserId());
            objSave.setEntryUser(g.getUserId()); //from data entry user list
            //objSave.setLat(Double.toString(currentLatitude));
            //objSave.setLon(Double.toString(currentLongitude));

            String status = objSave.SaveUpdateData(this);
            if (status.length() == 0) {
                Bundle IDBundle = new Bundle();
                IDBundle.putString("Rnd", txtRnd.getText().toString());
                IDBundle.putString("SuchanaID", txtSuchanaID.getText().toString());
                IDBundle.putString("H41a", "");
                startActivity(new Intent(Destruction2.this, Agriculture_list.class).putExtras(IDBundle));

            } else {
                Connection.MessageBox(Destruction2.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(Destruction2.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            Destruction2_DataModel d = new Destruction2_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<Destruction2_DataModel> data = d.SelectAll(this, SQL);
            for (Destruction2_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                String[] d_rdogrpH14b1 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH14b1.length; i++) {
                    if (item.getH14b1().equals(String.valueOf(d_rdogrpH14b1[i]))) {
                        rb = (RadioButton) rdogrpH14b1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH14b2 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH14b2.length; i++) {
                    if (item.getH14b2().equals(String.valueOf(d_rdogrpH14b2[i]))) {
                        rb = (RadioButton) rdogrpH14b2.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH14b3 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH14b3.length; i++) {
                    if (item.getH14b3().equals(String.valueOf(d_rdogrpH14b3[i]))) {
                        rb = (RadioButton) rdogrpH14b3.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH14b4 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH14b4.length; i++) {
                    if (item.getH14b4().equals(String.valueOf(d_rdogrpH14b4[i]))) {
                        rb = (RadioButton) rdogrpH14b4.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH14b5 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH14b5.length; i++) {
                    if (item.getH14b5().equals(String.valueOf(d_rdogrpH14b5[i]))) {
                        rb = (RadioButton) rdogrpH14b5.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH14b6 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH14b6.length; i++) {
                    if (item.getH14b6().equals(String.valueOf(d_rdogrpH14b6[i]))) {
                        rb = (RadioButton) rdogrpH14b6.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH14b7 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH14b7.length; i++) {
                    if (item.getH14b7().equals(String.valueOf(d_rdogrpH14b7[i]))) {
                        rb = (RadioButton) rdogrpH14b7.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH14b8 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH14b8.length; i++) {
                    if (item.getH14b8().equals(String.valueOf(d_rdogrpH14b8[i]))) {
                        rb = (RadioButton) rdogrpH14b8.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH14b8X.setText(item.getH14b8X());
                String[] d_rdogrpH14c1 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH14c1.length; i++) {
                    if (item.getH14c1().equals(String.valueOf(d_rdogrpH14c1[i]))) {
                        rb = (RadioButton) rdogrpH14c1.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH14c1a().equals("1")) {
                    chkH14c1a.setChecked(true);
                } else if (item.getH14c1a().equals("2")) {
                    chkH14c1a.setChecked(false);
                }
                if (item.getH14c1b().equals("1")) {
                    chkH14c1b.setChecked(true);
                } else if (item.getH14c1b().equals("2")) {
                    chkH14c1b.setChecked(false);
                }
                if (item.getH14c1c().equals("1")) {
                    chkH14c1c.setChecked(true);
                } else if (item.getH14c1c().equals("2")) {
                    chkH14c1c.setChecked(false);
                }
                if (item.getH14c1d().equals("1")) {
                    chkH14c1d.setChecked(true);
                } else if (item.getH14c1d().equals("2")) {
                    chkH14c1d.setChecked(false);
                }
                if (item.getH14c1e().equals("1")) {
                    chkH14c1e.setChecked(true);
                } else if (item.getH14c1e().equals("2")) {
                    chkH14c1e.setChecked(false);
                }
                if (item.getH14c1f().equals("1")) {
                    chkH14c1f.setChecked(true);
                } else if (item.getH14c1f().equals("2")) {
                    chkH14c1f.setChecked(false);
                }
                if (item.getH14c1g().equals("1")) {
                    chkH14c1g.setChecked(true);
                } else if (item.getH14c1g().equals("2")) {
                    chkH14c1g.setChecked(false);
                }
                if (item.getH14c1h().equals("1")) {
                    chkH14c1h.setChecked(true);
                } else if (item.getH14c1h().equals("2")) {
                    chkH14c1h.setChecked(false);
                }
                if (item.getH14c1i().equals("1")) {
                    chkH14c1i.setChecked(true);
                } else if (item.getH14c1i().equals("2")) {
                    chkH14c1i.setChecked(false);
                }
                if (item.getH14c1j().equals("1")) {
                    chkH14c1j.setChecked(true);
                } else if (item.getH14c1j().equals("2")) {
                    chkH14c1j.setChecked(false);
                }
                if (item.getH14c1k().equals("1")) {
                    chkH14c1k.setChecked(true);
                } else if (item.getH14c1k().equals("2")) {
                    chkH14c1k.setChecked(false);
                }
                if (item.getH14c1l().equals("1")) {
                    chkH14c1l.setChecked(true);
                } else if (item.getH14c1l().equals("2")) {
                    chkH14c1l.setChecked(false);
                }
                if (item.getH14c1m().equals("1")) {
                    chkH14c1m.setChecked(true);
                } else if (item.getH14c1m().equals("2")) {
                    chkH14c1m.setChecked(false);
                }
                if (item.getH14c1n().equals("1")) {
                    chkH14c1n.setChecked(true);
                } else if (item.getH14c1n().equals("2")) {
                    chkH14c1n.setChecked(false);
                }
                if (item.getH14c1o().equals("1")) {
                    chkH14c1o.setChecked(true);
                } else if (item.getH14c1o().equals("2")) {
                    chkH14c1o.setChecked(false);
                }
                if (item.getH14c1p().equals("1")) {
                    chkH14c1p.setChecked(true);
                } else if (item.getH14c1p().equals("2")) {
                    chkH14c1p.setChecked(false);
                }
                if (item.getH14c1q().equals("1")) {
                    chkH14c1q.setChecked(true);
                } else if (item.getH14c1q().equals("2")) {
                    chkH14c1q.setChecked(false);
                }
                if (item.getH14c1r().equals("1")) {
                    chkH14c1r.setChecked(true);
                } else if (item.getH14c1r().equals("2")) {
                    chkH14c1r.setChecked(false);
                }
                if (item.getH14c1s().equals("1")) {
                    chkH14c1s.setChecked(true);
                } else if (item.getH14c1s().equals("2")) {
                    chkH14c1s.setChecked(false);
                }
                if (item.getH14c1t().equals("1")) {
                    chkH14c1t.setChecked(true);
                } else if (item.getH14c1t().equals("2")) {
                    chkH14c1t.setChecked(false);
                }
                if (item.getH14c1x().equals("1")) {
                    chkH14c1x.setChecked(true);
                } else if (item.getH14c1x().equals("2")) {
                    chkH14c1x.setChecked(false);
                }
                txtH14c1x1.setText(item.getH14c1x1());
            }
        } catch (Exception e) {
            Connection.MessageBox(Destruction2.this, e.getMessage());
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