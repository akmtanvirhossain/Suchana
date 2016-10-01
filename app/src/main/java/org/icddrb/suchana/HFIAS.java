package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".HFIAS" android:label="HFIAS" />

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
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

public class HFIAS extends Activity {
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
    LinearLayout seclbl12;
    LinearLayout secH121a;
    View lineH121a;
    TextView VlblH121a;
    RadioGroup rdogrpH121a;
    RadioButton rdoH121a1;
    RadioButton rdoH121a2;
    LinearLayout secH121b;
    View lineH121b;
    TextView VlblH121b;
    RadioGroup rdogrpH121b;
    RadioButton rdoH121b1;
    RadioButton rdoH121b2;
    RadioButton rdoH121b3;
    RadioButton rdoH121b4;
    LinearLayout secH122a;
    View lineH122a;
    TextView VlblH122a;
    RadioGroup rdogrpH122a;
    RadioButton rdoH122a1;
    RadioButton rdoH122a2;
    LinearLayout secH122b;
    View lineH122b;
    TextView VlblH122b;
    RadioGroup rdogrpH122b;
    RadioButton rdoH122b1;
    RadioButton rdoH122b2;
    RadioButton rdoH122b3;
    RadioButton rdoH122b4;
    LinearLayout secH123a;
    View lineH123a;
    TextView VlblH123a;
    RadioGroup rdogrpH123a;
    RadioButton rdoH123a1;
    RadioButton rdoH123a2;
    LinearLayout secH123b;
    View lineH123b;
    TextView VlblH123b;
    RadioGroup rdogrpH123b;
    RadioButton rdoH123b1;
    RadioButton rdoH123b2;
    RadioButton rdoH123b3;
    RadioButton rdoH123b4;
    LinearLayout secH124a;
    View lineH124a;
    TextView VlblH124a;
    RadioGroup rdogrpH124a;
    RadioButton rdoH124a1;
    RadioButton rdoH124a2;
    LinearLayout secH124b;
    View lineH124b;
    TextView VlblH124b;
    RadioGroup rdogrpH124b;
    RadioButton rdoH124b1;
    RadioButton rdoH124b2;
    RadioButton rdoH124b3;
    RadioButton rdoH124b4;
    LinearLayout secH125a;
    View lineH125a;
    TextView VlblH125a;
    RadioGroup rdogrpH125a;
    RadioButton rdoH125a1;
    RadioButton rdoH125a2;
    LinearLayout secH125b;
    View lineH125b;
    TextView VlblH125b;
    RadioGroup rdogrpH125b;
    RadioButton rdoH125b1;
    RadioButton rdoH125b2;
    RadioButton rdoH125b3;
    RadioButton rdoH125b4;
    LinearLayout secH126a;
    View lineH126a;
    TextView VlblH126a;
    RadioGroup rdogrpH126a;
    RadioButton rdoH126a1;
    RadioButton rdoH126a2;
    LinearLayout secH126b;
    View lineH126b;
    TextView VlblH126b;
    RadioGroup rdogrpH126b;
    RadioButton rdoH126b1;
    RadioButton rdoH126b2;
    RadioButton rdoH126b3;
    RadioButton rdoH126b4;
    LinearLayout secH127a;
    View lineH127a;
    TextView VlblH127a;
    RadioGroup rdogrpH127a;
    RadioButton rdoH127a1;
    RadioButton rdoH127a2;
    LinearLayout secH127b;
    View lineH127b;
    TextView VlblH127b;
    RadioGroup rdogrpH127b;
    RadioButton rdoH127b1;
    RadioButton rdoH127b2;
    RadioButton rdoH127b3;
    RadioButton rdoH127b4;
    LinearLayout secH128a;
    View lineH128a;
    TextView VlblH128a;
    RadioGroup rdogrpH128a;
    RadioButton rdoH128a1;
    RadioButton rdoH128a2;
    LinearLayout secH128b;
    View lineH128b;
    TextView VlblH128b;
    RadioGroup rdogrpH128b;
    RadioButton rdoH128b1;
    RadioButton rdoH128b2;
    RadioButton rdoH128b3;
    RadioButton rdoH128b4;
    LinearLayout secH129a;
    View lineH129a;
    TextView VlblH129a;
    RadioGroup rdogrpH129a;
    RadioButton rdoH129a1;
    RadioButton rdoH129a2;
    LinearLayout secH129b;
    View lineH129b;
    TextView VlblH129b;
    RadioGroup rdogrpH129b;
    RadioButton rdoH129b1;
    RadioButton rdoH129b2;
    RadioButton rdoH129b3;
    RadioButton rdoH129b4;
    LinearLayout secLb13;
    String StartTime;
    Bundle IDbundle;
    private int hour;
    private int minute;
    private int mDay;
    private int mMonth;
    private int mYear;

    ImageButton cmdForward;
    TextView lblNext;

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
            setContentView(R.layout.hfias);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TableName = "HFIAS";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(HFIAS.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Loan_list.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDbundle);
                            getApplicationContext().startActivity(intent);

                        }
                    });
                    adb.show();
                }
            });

            cmdForward = (ImageButton) findViewById(R.id.cmdForward);
            cmdForward.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(HFIAS.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to return to Home [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            IDbundle.putString("H14a", "");
                            Intent intent = new Intent(getApplicationContext(), Destruction1.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDbundle);
                            getApplicationContext().startActivity(intent);

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

            seclbl12 = (LinearLayout) findViewById(R.id.seclbl12);
            secH121a = (LinearLayout) findViewById(R.id.secH121a);
            lineH121a = (View) findViewById(R.id.lineH121a);
            VlblH121a = (TextView) findViewById(R.id.VlblH121a);
            rdogrpH121a = (RadioGroup) findViewById(R.id.rdogrpH121a);

            rdoH121a1 = (RadioButton) findViewById(R.id.rdoH121a1);
            rdoH121a2 = (RadioButton) findViewById(R.id.rdoH121a2);
            rdogrpH121a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH121a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH121a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH121a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH121a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH121b.setVisibility(View.GONE);
                        lineH121b.setVisibility(View.GONE);
                        rdogrpH121b.clearCheck();
                    } else {
                        secH121b.setVisibility(View.VISIBLE);
                        lineH121b.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH121b = (LinearLayout) findViewById(R.id.secH121b);
            lineH121b = (View) findViewById(R.id.lineH121b);
            VlblH121b = (TextView) findViewById(R.id.VlblH121b);
            rdogrpH121b = (RadioGroup) findViewById(R.id.rdogrpH121b);

            rdoH121b1 = (RadioButton) findViewById(R.id.rdoH121b1);
            rdoH121b2 = (RadioButton) findViewById(R.id.rdoH121b2);
            rdoH121b3 = (RadioButton) findViewById(R.id.rdoH121b3);

            secH122a = (LinearLayout) findViewById(R.id.secH122a);
            lineH122a = (View) findViewById(R.id.lineH122a);
            VlblH122a = (TextView) findViewById(R.id.VlblH122a);
            rdogrpH122a = (RadioGroup) findViewById(R.id.rdogrpH122a);

            rdoH122a1 = (RadioButton) findViewById(R.id.rdoH122a1);
            rdoH122a2 = (RadioButton) findViewById(R.id.rdoH122a2);
            rdogrpH122a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH122a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH122a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH122a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH122a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH122b.setVisibility(View.GONE);
                        lineH122b.setVisibility(View.GONE);
                        rdogrpH122b.clearCheck();
                    } else {
                        secH122b.setVisibility(View.VISIBLE);
                        lineH122b.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH122b = (LinearLayout) findViewById(R.id.secH122b);
            lineH122b = (View) findViewById(R.id.lineH122b);
            VlblH122b = (TextView) findViewById(R.id.VlblH122b);
            rdogrpH122b = (RadioGroup) findViewById(R.id.rdogrpH122b);

            rdoH122b1 = (RadioButton) findViewById(R.id.rdoH122b1);
            rdoH122b2 = (RadioButton) findViewById(R.id.rdoH122b2);
            rdoH122b3 = (RadioButton) findViewById(R.id.rdoH122b3);

            secH123a = (LinearLayout) findViewById(R.id.secH123a);
            lineH123a = (View) findViewById(R.id.lineH123a);
            VlblH123a = (TextView) findViewById(R.id.VlblH123a);
            rdogrpH123a = (RadioGroup) findViewById(R.id.rdogrpH123a);

            rdoH123a1 = (RadioButton) findViewById(R.id.rdoH123a1);
            rdoH123a2 = (RadioButton) findViewById(R.id.rdoH123a2);
            rdogrpH123a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH123a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH123a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH123a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH123a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH123b.setVisibility(View.GONE);
                        lineH123b.setVisibility(View.GONE);
                        rdogrpH123b.clearCheck();
                    } else {
                        secH123b.setVisibility(View.VISIBLE);
                        lineH123b.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH123b = (LinearLayout) findViewById(R.id.secH123b);
            lineH123b = (View) findViewById(R.id.lineH123b);
            VlblH123b = (TextView) findViewById(R.id.VlblH123b);
            rdogrpH123b = (RadioGroup) findViewById(R.id.rdogrpH123b);

            rdoH123b1 = (RadioButton) findViewById(R.id.rdoH123b1);
            rdoH123b2 = (RadioButton) findViewById(R.id.rdoH123b2);
            rdoH123b3 = (RadioButton) findViewById(R.id.rdoH123b3);

            secH124a = (LinearLayout) findViewById(R.id.secH124a);
            lineH124a = (View) findViewById(R.id.lineH124a);
            VlblH124a = (TextView) findViewById(R.id.VlblH124a);
            rdogrpH124a = (RadioGroup) findViewById(R.id.rdogrpH124a);

            rdoH124a1 = (RadioButton) findViewById(R.id.rdoH124a1);
            rdoH124a2 = (RadioButton) findViewById(R.id.rdoH124a2);
            rdogrpH124a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH124a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH124a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH124a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH124a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH124b.setVisibility(View.GONE);
                        lineH124b.setVisibility(View.GONE);
                        rdogrpH124b.clearCheck();
                    } else {
                        secH124b.setVisibility(View.VISIBLE);
                        lineH124b.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH124b = (LinearLayout) findViewById(R.id.secH124b);
            lineH124b = (View) findViewById(R.id.lineH124b);
            VlblH124b = (TextView) findViewById(R.id.VlblH124b);
            rdogrpH124b = (RadioGroup) findViewById(R.id.rdogrpH124b);

            rdoH124b1 = (RadioButton) findViewById(R.id.rdoH124b1);
            rdoH124b2 = (RadioButton) findViewById(R.id.rdoH124b2);
            rdoH124b3 = (RadioButton) findViewById(R.id.rdoH124b3);

            secH125a = (LinearLayout) findViewById(R.id.secH125a);
            lineH125a = (View) findViewById(R.id.lineH125a);
            VlblH125a = (TextView) findViewById(R.id.VlblH125a);
            rdogrpH125a = (RadioGroup) findViewById(R.id.rdogrpH125a);

            rdoH125a1 = (RadioButton) findViewById(R.id.rdoH125a1);
            rdoH125a2 = (RadioButton) findViewById(R.id.rdoH125a2);
            rdogrpH125a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH125a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH125a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH125a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH125a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH125b.setVisibility(View.GONE);
                        lineH125b.setVisibility(View.GONE);
                        rdogrpH125b.clearCheck();
                    } else {
                        secH125b.setVisibility(View.VISIBLE);
                        lineH125b.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH125b = (LinearLayout) findViewById(R.id.secH125b);
            lineH125b = (View) findViewById(R.id.lineH125b);
            VlblH125b = (TextView) findViewById(R.id.VlblH125b);
            rdogrpH125b = (RadioGroup) findViewById(R.id.rdogrpH125b);

            rdoH125b1 = (RadioButton) findViewById(R.id.rdoH125b1);
            rdoH125b2 = (RadioButton) findViewById(R.id.rdoH125b2);
            rdoH125b3 = (RadioButton) findViewById(R.id.rdoH125b3);

            secH126a = (LinearLayout) findViewById(R.id.secH126a);
            lineH126a = (View) findViewById(R.id.lineH126a);
            VlblH126a = (TextView) findViewById(R.id.VlblH126a);
            rdogrpH126a = (RadioGroup) findViewById(R.id.rdogrpH126a);

            rdoH126a1 = (RadioButton) findViewById(R.id.rdoH126a1);
            rdoH126a2 = (RadioButton) findViewById(R.id.rdoH126a2);
            rdogrpH126a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH126a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH126a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH126a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH126a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH126b.setVisibility(View.GONE);
                        lineH126b.setVisibility(View.GONE);
                        rdogrpH126b.clearCheck();
                    } else {
                        secH126b.setVisibility(View.VISIBLE);
                        lineH126b.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH126b = (LinearLayout) findViewById(R.id.secH126b);
            lineH126b = (View) findViewById(R.id.lineH126b);
            VlblH126b = (TextView) findViewById(R.id.VlblH126b);
            rdogrpH126b = (RadioGroup) findViewById(R.id.rdogrpH126b);

            rdoH126b1 = (RadioButton) findViewById(R.id.rdoH126b1);
            rdoH126b2 = (RadioButton) findViewById(R.id.rdoH126b2);
            rdoH126b3 = (RadioButton) findViewById(R.id.rdoH126b3);

            secH127a = (LinearLayout) findViewById(R.id.secH127a);
            lineH127a = (View) findViewById(R.id.lineH127a);
            VlblH127a = (TextView) findViewById(R.id.VlblH127a);
            rdogrpH127a = (RadioGroup) findViewById(R.id.rdogrpH127a);

            rdoH127a1 = (RadioButton) findViewById(R.id.rdoH127a1);
            rdoH127a2 = (RadioButton) findViewById(R.id.rdoH127a2);
            rdogrpH127a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH127a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH127a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH127a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH127a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH127b.setVisibility(View.GONE);
                        lineH127b.setVisibility(View.GONE);
                        rdogrpH127b.clearCheck();
                    } else {
                        secH127b.setVisibility(View.VISIBLE);
                        lineH127b.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH127b = (LinearLayout) findViewById(R.id.secH127b);
            lineH127b = (View) findViewById(R.id.lineH127b);
            VlblH127b = (TextView) findViewById(R.id.VlblH127b);
            rdogrpH127b = (RadioGroup) findViewById(R.id.rdogrpH127b);

            rdoH127b1 = (RadioButton) findViewById(R.id.rdoH127b1);
            rdoH127b2 = (RadioButton) findViewById(R.id.rdoH127b2);
            rdoH127b3 = (RadioButton) findViewById(R.id.rdoH127b3);

            secH128a = (LinearLayout) findViewById(R.id.secH128a);
            lineH128a = (View) findViewById(R.id.lineH128a);
            VlblH128a = (TextView) findViewById(R.id.VlblH128a);
            rdogrpH128a = (RadioGroup) findViewById(R.id.rdogrpH128a);

            rdoH128a1 = (RadioButton) findViewById(R.id.rdoH128a1);
            rdoH128a2 = (RadioButton) findViewById(R.id.rdoH128a2);
            rdogrpH128a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH128a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH128a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH128a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH128a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH128b.setVisibility(View.GONE);
                        lineH128b.setVisibility(View.GONE);
                        rdogrpH128b.clearCheck();
                    } else {
                        secH128b.setVisibility(View.VISIBLE);
                        lineH128b.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH128b = (LinearLayout) findViewById(R.id.secH128b);
            lineH128b = (View) findViewById(R.id.lineH128b);
            VlblH128b = (TextView) findViewById(R.id.VlblH128b);
            rdogrpH128b = (RadioGroup) findViewById(R.id.rdogrpH128b);

            rdoH128b1 = (RadioButton) findViewById(R.id.rdoH128b1);
            rdoH128b2 = (RadioButton) findViewById(R.id.rdoH128b2);
            rdoH128b3 = (RadioButton) findViewById(R.id.rdoH128b3);

            secH129a = (LinearLayout) findViewById(R.id.secH129a);
            lineH129a = (View) findViewById(R.id.lineH129a);
            VlblH129a = (TextView) findViewById(R.id.VlblH129a);
            rdogrpH129a = (RadioGroup) findViewById(R.id.rdogrpH129a);

            rdoH129a1 = (RadioButton) findViewById(R.id.rdoH129a1);
            rdoH129a2 = (RadioButton) findViewById(R.id.rdoH129a2);
            rdogrpH129a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH129a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH129a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH129a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH129a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH129b.setVisibility(View.GONE);
                        lineH129b.setVisibility(View.GONE);
                        rdogrpH129b.clearCheck();
                    } else {
                        secH129b.setVisibility(View.VISIBLE);
                        lineH129b.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH129b = (LinearLayout) findViewById(R.id.secH129b);
            lineH129b = (View) findViewById(R.id.lineH129b);
            VlblH129b = (TextView) findViewById(R.id.VlblH129b);
            rdogrpH129b = (RadioGroup) findViewById(R.id.rdogrpH129b);

            rdoH129b1 = (RadioButton) findViewById(R.id.rdoH129b1);
            rdoH129b2 = (RadioButton) findViewById(R.id.rdoH129b2);
            rdoH129b3 = (RadioButton) findViewById(R.id.rdoH129b3);

            secLb13 = (LinearLayout) findViewById(R.id.secLb13);

            lblNext= (TextView) findViewById(R.id.lblNext);
            lblNext.setEnabled(false);
            cmdForward.setEnabled(false);

            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
            DataSearch(RND,SUCHANAID);

        } catch (Exception e) {
            Connection.MessageBox(HFIAS.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(HFIAS.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(HFIAS.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(HFIAS.this, "Required field: উপকারভোগী সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (!rdoH121a1.isChecked() & !rdoH121a2.isChecked() & secH121a.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (আপনাদের খানায় যথেষ্ট খাবার থাকবে না, বিগত ৪ সপ্তাহে এরকম কোন দুশ্চিন্তা হয়েছিল কী (উত্তর )).");
                rdoH121a1.requestFocus();
                return;
            } else if (!rdoH121b1.isChecked() & !rdoH121b2.isChecked() & !rdoH121b3.isChecked() & secH121b.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (কত ঘন ঘন এইরূপ ঘটেছে).");
                rdoH121b1.requestFocus();
                return;
            } else if (!rdoH122a1.isChecked() & !rdoH122a2.isChecked() & secH122a.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (আপনারা সাধারণত যে ধরনের খাবার খেয়ে থাকেন, গত ৪ সপ্তাহে অভাবের কারনে আপনি বা আপনাদের খানার কোন সদস্য কি  সে ধরনের খাবার খেতে পারেন নি ).");
                rdoH122a1.requestFocus();
                return;
            } else if (!rdoH122b1.isChecked() & !rdoH122b2.isChecked() & !rdoH122b3.isChecked()  & secH122b.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (কত ঘন ঘন এইরূপ ঘটেছে).");
                rdoH122b1.requestFocus();
                return;
            } else if (!rdoH123a1.isChecked() & !rdoH123a2.isChecked() & secH123a.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (গত ৪ সপ্তাহে আপনি বা আপনাদের খানার কোন সদস্য কি অভাবের কারনে সীমিত রকমের (Variety) খাবার খেতে হয়েছে, অর্থাৎ আগে যত পদ খেতেন গত ৪ সপ্তাহে অভাবের কারনে তার চেয়ে কম পদ খেতে হয়েছে ).");
                rdoH123a1.requestFocus();
                return;
            } else if (!rdoH123b1.isChecked() & !rdoH123b2.isChecked() & !rdoH123b3.isChecked() & secH123b.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (কত ঘন ঘন এইরূপ ঘটেছে).");
                rdoH123b1.requestFocus();
                return;
            } else if (!rdoH124a1.isChecked() & !rdoH124a2.isChecked() & secH124a.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (গত ৪ সপ্তাহে আপনাকে বা আপনার খানার কোন সদস্যকে, যে খাবার আপনারা খান না, অভাবের কারনে তা খেয়ে থাকতে হয়েছে কি).");
                rdoH124a1.requestFocus();
                return;
            } else if (!rdoH124b1.isChecked() & !rdoH124b2.isChecked() & !rdoH124b3.isChecked() & secH124b.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (কত ঘন ঘন এইরূপ ঘটেছে).");
                rdoH124b1.requestFocus();
                return;
            } else if (!rdoH125a1.isChecked() & !rdoH125a2.isChecked() & secH125a.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (গত ৪ সপ্তাহে আপনাকে বা আপনার খানার কোন সদস্যকে কি সাধারণত যে খাবার খান, অভাবের কারনে তার থেকে কম খেয়ে থাকতে হয়েছে).");
                rdoH125a1.requestFocus();
                return;
            } else if (!rdoH125b1.isChecked() & !rdoH125b2.isChecked() & !rdoH125b3.isChecked()  & secH125b.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (কত ঘন ঘন এইরূপ ঘটেছে).");
                rdoH125b1.requestFocus();
                return;
            } else if (!rdoH126a1.isChecked() & !rdoH126a2.isChecked() & secH126a.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (গত ৪ সপ্তাহে আপনাকে বা আপনার খানার কোন সদস্যকে, অভাবের কারনে কোন বেলা না খেয়ে থাকতে হয়েছে কি).");
                rdoH126a1.requestFocus();
                return;
            } else if (!rdoH126b1.isChecked() & !rdoH126b2.isChecked() & !rdoH126b3.isChecked()  & secH126b.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (কত ঘন ঘন এইরূপ ঘটেছে).");
                rdoH126b1.requestFocus();
                return;
            } else if (!rdoH127a1.isChecked() & !rdoH127a2.isChecked() & secH127a.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (গত ৪ সপ্তাহে এমনকি হয়েছে যে আপনার খানায় অভাবের কারনে খাওয়ার জন্য কোন খাবার ছিল না).");
                rdoH127a1.requestFocus();
                return;
            } else if (!rdoH127b1.isChecked() & !rdoH127b2.isChecked() & !rdoH127b3.isChecked() & secH127b.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (কত ঘন ঘন এইরূপ ঘটেছে).");
                rdoH127b1.requestFocus();
                return;
            } else if (!rdoH128a1.isChecked() & !rdoH128a2.isChecked() & secH128a.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (গত ৪ সপ্তাহে আপনাকে বা আপনার খানার অন্য কোন সদস্যকে কি ঘরে যথেষ্ঠ খাবার না থাকার কারণে ক্ষুধার্থ অবস্থায় রাতে ঘুমাতে হয়েছে).");
                rdoH128a1.requestFocus();
                return;
            } else if (!rdoH128b1.isChecked() & !rdoH128b2.isChecked() & !rdoH128b3.isChecked()  & secH128b.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (কত ঘন ঘন এইরূপ ঘটেছে).");
                rdoH128b1.requestFocus();
                return;
            } else if (!rdoH129a1.isChecked() & !rdoH129a2.isChecked() & secH129a.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (গত ৪ সপ্তাহে আপনাকে বা আপনার খানার অন্য কোন সদস্যকে কি ঘরে যথেষ্ঠ খাবার না থাকার কারণে ক্ষুধার্থ অবস্থায় রাতে ঘুমাতে হয়েছে).");
                rdoH129a1.requestFocus();
                return;
            } else if (!rdoH129b1.isChecked() & !rdoH129b2.isChecked() & !rdoH129b3.isChecked()  & secH129b.isShown()) {
                Connection.MessageBox(HFIAS.this, "Select anyone options from (কত ঘন ঘন এইরূপ ঘটেছে).");
                rdoH129b1.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            HFIAS_DataModel objSave = new HFIAS_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            String[] d_rdogrpH121a = new String[]{"1", "0"};
            objSave.setH121a("");
            for (int i = 0; i < rdogrpH121a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH121a.getChildAt(i);
                if (rb.isChecked()) objSave.setH121a(d_rdogrpH121a[i]);
            }

            String[] d_rdogrpH121b = new String[]{"1", "2", "3"};
            objSave.setH121b("");
            for (int i = 0; i < rdogrpH121b.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH121b.getChildAt(i);
                if (rb.isChecked()) objSave.setH121b(d_rdogrpH121b[i]);
            }

            String[] d_rdogrpH122a = new String[]{"1", "0"};
            objSave.setH122a("");
            for (int i = 0; i < rdogrpH122a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH122a.getChildAt(i);
                if (rb.isChecked()) objSave.setH122a(d_rdogrpH122a[i]);
            }

            String[] d_rdogrpH122b = new String[]{"1", "2", "3"};
            objSave.setH122b("");
            for (int i = 0; i < rdogrpH122b.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH122b.getChildAt(i);
                if (rb.isChecked()) objSave.setH122b(d_rdogrpH122b[i]);
            }

            String[] d_rdogrpH123a = new String[]{"1", "0"};
            objSave.setH123a("");
            for (int i = 0; i < rdogrpH123a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH123a.getChildAt(i);
                if (rb.isChecked()) objSave.setH123a(d_rdogrpH123a[i]);
            }

            String[] d_rdogrpH123b = new String[]{"1", "2", "3"};
            objSave.setH123b("");
            for (int i = 0; i < rdogrpH123b.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH123b.getChildAt(i);
                if (rb.isChecked()) objSave.setH123b(d_rdogrpH123b[i]);
            }

            String[] d_rdogrpH124a = new String[]{"1", "0"};
            objSave.setH124a("");
            for (int i = 0; i < rdogrpH124a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH124a.getChildAt(i);
                if (rb.isChecked()) objSave.setH124a(d_rdogrpH124a[i]);
            }

            String[] d_rdogrpH124b = new String[]{"1", "2", "3"};
            objSave.setH124b("");
            for (int i = 0; i < rdogrpH124b.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH124b.getChildAt(i);
                if (rb.isChecked()) objSave.setH124b(d_rdogrpH124b[i]);
            }

            String[] d_rdogrpH125a = new String[]{"1", "0"};
            objSave.setH125a("");
            for (int i = 0; i < rdogrpH125a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH125a.getChildAt(i);
                if (rb.isChecked()) objSave.setH125a(d_rdogrpH125a[i]);
            }

            String[] d_rdogrpH125b = new String[]{"1", "2", "3"};
            objSave.setH125b("");
            for (int i = 0; i < rdogrpH125b.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH125b.getChildAt(i);
                if (rb.isChecked()) objSave.setH125b(d_rdogrpH125b[i]);
            }

            String[] d_rdogrpH126a = new String[]{"1", "0"};
            objSave.setH126a("");
            for (int i = 0; i < rdogrpH126a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH126a.getChildAt(i);
                if (rb.isChecked()) objSave.setH126a(d_rdogrpH126a[i]);
            }

            String[] d_rdogrpH126b = new String[]{"1", "2", "3"};
            objSave.setH126b("");
            for (int i = 0; i < rdogrpH126b.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH126b.getChildAt(i);
                if (rb.isChecked()) objSave.setH126b(d_rdogrpH126b[i]);
            }

            String[] d_rdogrpH127a = new String[]{"1", "0"};
            objSave.setH127a("");
            for (int i = 0; i < rdogrpH127a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH127a.getChildAt(i);
                if (rb.isChecked()) objSave.setH127a(d_rdogrpH127a[i]);
            }

            String[] d_rdogrpH127b = new String[]{"1", "2", "3"};
            objSave.setH127b("");
            for (int i = 0; i < rdogrpH127b.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH127b.getChildAt(i);
                if (rb.isChecked()) objSave.setH127b(d_rdogrpH127b[i]);
            }

            String[] d_rdogrpH128a = new String[]{"1", "0"};
            objSave.setH128a("");
            for (int i = 0; i < rdogrpH128a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH128a.getChildAt(i);
                if (rb.isChecked()) objSave.setH128a(d_rdogrpH128a[i]);
            }

            String[] d_rdogrpH128b = new String[]{"1", "2", "3"};
            objSave.setH128b("");
            for (int i = 0; i < rdogrpH128b.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH128b.getChildAt(i);
                if (rb.isChecked()) objSave.setH128b(d_rdogrpH128b[i]);
            }

            String[] d_rdogrpH129a = new String[]{"1", "0"};
            objSave.setH129a("");
            for (int i = 0; i < rdogrpH129a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH129a.getChildAt(i);
                if (rb.isChecked()) objSave.setH129a(d_rdogrpH129a[i]);
            }

            String[] d_rdogrpH129b = new String[]{"1", "2", "3"};
            objSave.setH129b("");
            for (int i = 0; i < rdogrpH129b.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH129b.getChildAt(i);
                if (rb.isChecked()) objSave.setH129b(d_rdogrpH129b[i]);
            }

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
                Bundle IDBundle = new Bundle();
                IDBundle.putString("Rnd", txtRnd.getText().toString());
                IDBundle.putString("SuchanaID", txtSuchanaID.getText().toString());
                IDBundle.putString("H41a", "");
                startActivity(new Intent(HFIAS.this, Destruction1.class).putExtras(IDBundle));

            } else {
                Connection.MessageBox(HFIAS.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(HFIAS.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            HFIAS_DataModel d = new HFIAS_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<HFIAS_DataModel> data = d.SelectAll(this, SQL);
            for (HFIAS_DataModel item : data) {

                cmdForward.setEnabled(true);
                lblNext.setEnabled(true);

                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                String[] d_rdogrpH121a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH121a.length; i++) {
                    if (item.getH121a().equals(String.valueOf(d_rdogrpH121a[i]))) {
                        rb = (RadioButton) rdogrpH121a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH121b = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH121b.length; i++) {
                    if (item.getH121b().equals(String.valueOf(d_rdogrpH121b[i]))) {
                        rb = (RadioButton) rdogrpH121b.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH122a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH122a.length; i++) {
                    if (item.getH122a().equals(String.valueOf(d_rdogrpH122a[i]))) {
                        rb = (RadioButton) rdogrpH122a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH122b = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH122b.length; i++) {
                    if (item.getH122b().equals(String.valueOf(d_rdogrpH122b[i]))) {
                        rb = (RadioButton) rdogrpH122b.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH123a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH123a.length; i++) {
                    if (item.getH123a().equals(String.valueOf(d_rdogrpH123a[i]))) {
                        rb = (RadioButton) rdogrpH123a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH123b = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH123b.length; i++) {
                    if (item.getH123b().equals(String.valueOf(d_rdogrpH123b[i]))) {
                        rb = (RadioButton) rdogrpH123b.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH124a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH124a.length; i++) {
                    if (item.getH124a().equals(String.valueOf(d_rdogrpH124a[i]))) {
                        rb = (RadioButton) rdogrpH124a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH124b = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH124b.length; i++) {
                    if (item.getH124b().equals(String.valueOf(d_rdogrpH124b[i]))) {
                        rb = (RadioButton) rdogrpH124b.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH125a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH125a.length; i++) {
                    if (item.getH125a().equals(String.valueOf(d_rdogrpH125a[i]))) {
                        rb = (RadioButton) rdogrpH125a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH125b = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH125b.length; i++) {
                    if (item.getH125b().equals(String.valueOf(d_rdogrpH125b[i]))) {
                        rb = (RadioButton) rdogrpH125b.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH126a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH126a.length; i++) {
                    if (item.getH126a().equals(String.valueOf(d_rdogrpH126a[i]))) {
                        rb = (RadioButton) rdogrpH126a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH126b = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH126b.length; i++) {
                    if (item.getH126b().equals(String.valueOf(d_rdogrpH126b[i]))) {
                        rb = (RadioButton) rdogrpH126b.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH127a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH127a.length; i++) {
                    if (item.getH127a().equals(String.valueOf(d_rdogrpH127a[i]))) {
                        rb = (RadioButton) rdogrpH127a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH127b = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH127b.length; i++) {
                    if (item.getH127b().equals(String.valueOf(d_rdogrpH127b[i]))) {
                        rb = (RadioButton) rdogrpH127b.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH128a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH128a.length; i++) {
                    if (item.getH128a().equals(String.valueOf(d_rdogrpH128a[i]))) {
                        rb = (RadioButton) rdogrpH128a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH128b = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH128b.length; i++) {
                    if (item.getH128b().equals(String.valueOf(d_rdogrpH128b[i]))) {
                        rb = (RadioButton) rdogrpH128b.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH129a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH129a.length; i++) {
                    if (item.getH129a().equals(String.valueOf(d_rdogrpH129a[i]))) {
                        rb = (RadioButton) rdogrpH129a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH129b = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH129b.length; i++) {
                    if (item.getH129b().equals(String.valueOf(d_rdogrpH129b[i]))) {
                        rb = (RadioButton) rdogrpH129b.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
            }
        } catch (Exception e) {
            Connection.MessageBox(HFIAS.this, e.getMessage());
            return;
        }
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