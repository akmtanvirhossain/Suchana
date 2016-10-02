package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Careseek" android:label="Careseek" />

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
import android.widget.ArrayAdapter;
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

public class Careseek extends Activity {
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
    LinearLayout seclblH18a;
    LinearLayout secH181a;
    View lineH181a;
    TextView VlblH181a;
    RadioGroup rdogrpH181a;
    RadioButton rdoH181a1;
    RadioButton rdoH181a2;
    LinearLayout secH181a1;
    View lineH181a1;
    TextView VlblH181a1;
    Spinner spnH181a1;
    LinearLayout secH181a1X;
    View lineH181a1X;
    TextView VlblH181a1X;
    EditText txtH181a1X;
    LinearLayout secH181a2;
    View lineH181a2;
    TextView VlblH181a2;
    Spinner spnH181a2;
    LinearLayout secH181a2X;
    View lineH181a2X;
    TextView VlblH181a2X;
    EditText txtH181a2X;
    LinearLayout secH181a3;
    View lineH181a3;
    TextView VlblH181a3;
    Spinner spnH181a3;
    LinearLayout secH181a3X;
    View lineH181a3X;
    TextView VlblH181a3X;
    EditText txtH181a3X;
    LinearLayout secH181a4;
    View lineH181a4;
    TextView VlblH181a4;
    EditText txtH181a4;
    LinearLayout secH182a;
    View lineH182a;
    TextView VlblH182a;
    RadioGroup rdogrpH182a;
    RadioButton rdoH182a1;
    RadioButton rdoH182a2;
    LinearLayout secH182a1;
    View lineH182a1;
    TextView VlblH182a1;
    Spinner spnH182a1;
    LinearLayout secH182a1X;
    View lineH182a1X;
    TextView VlblH182a1X;
    EditText txtH182a1X;
    LinearLayout secH182a2;
    View lineH182a2;
    TextView VlblH182a2;
    Spinner spnH182a2;
    LinearLayout secH182a2X;
    View lineH182a2X;
    TextView VlblH182a2X;
    EditText txtH182a2X;
    LinearLayout secH182a3;
    View lineH182a3;
    TextView VlblH182a3;
    Spinner spnH182a3;
    LinearLayout secH182a3X;
    View lineH182a3X;
    TextView VlblH182a3X;
    EditText txtH182a3X;
    LinearLayout secH182a4;
    View lineH182a4;
    TextView VlblH182a4;
    EditText txtH182a4;
    LinearLayout secH183a;
    View lineH183a;
    TextView VlblH183a;
    RadioGroup rdogrpH183a;
    RadioButton rdoH183a1;
    RadioButton rdoH183a2;
    LinearLayout secH183a1;
    View lineH183a1;
    TextView VlblH183a1;
    Spinner spnH183a1;
    LinearLayout secH183a1X;
    View lineH183a1X;
    TextView VlblH183a1X;
    EditText txtH183a1X;
    LinearLayout secH183a2;
    View lineH183a2;
    TextView VlblH183a2;
    Spinner spnH183a2;
    LinearLayout secH183a2X;
    View lineH183a2X;
    TextView VlblH183a2X;
    EditText txtH183a2X;
    LinearLayout secH183a3;
    View lineH183a3;
    TextView VlblH183a3;
    Spinner spnH183a3;
    LinearLayout secH183a3X;
    View lineH183a3X;
    TextView VlblH183a3X;
    EditText txtH183a3X;
    LinearLayout secH183a4;
    View lineH183a4;
    TextView VlblH183a4;
    EditText txtH183a4;
    LinearLayout secH184a;
    View lineH184a;
    TextView VlblH184a;
    RadioGroup rdogrpH184a;
    RadioButton rdoH184a1;
    RadioButton rdoH184a2;
    LinearLayout secH184a1;
    View lineH184a1;
    TextView VlblH184a1;
    Spinner spnH184a1;
    LinearLayout secH184a1X;
    View lineH184a1X;
    TextView VlblH184a1X;
    EditText txtH184a1X;
    LinearLayout secH184a2;
    View lineH184a2;
    TextView VlblH184a2;
    Spinner spnH184a2;
    LinearLayout secH184a2X;
    View lineH184a2X;
    TextView VlblH184a2X;
    EditText txtH184a2X;
    LinearLayout secH184a3;
    View lineH184a3;
    TextView VlblH184a3;
    Spinner spnH184a3;
    LinearLayout secH184a3X;
    View lineH184a3X;
    TextView VlblH184a3X;
    EditText txtH184a3X;
    LinearLayout secH184a4;
    View lineH184a4;
    TextView VlblH184a4;
    EditText txtH184a4;
    LinearLayout secH185a;
    View lineH185a;
    TextView VlblH185a;
    RadioGroup rdogrpH185a;
    RadioButton rdoH185a1;
    RadioButton rdoH185a2;
    LinearLayout secH185a1;
    View lineH185a1;
    TextView VlblH185a1;
    Spinner spnH185a1;
    LinearLayout secH185a1X;
    View lineH185a1X;
    TextView VlblH185a1X;
    EditText txtH185a1X;
    LinearLayout secH185a2;
    View lineH185a2;
    TextView VlblH185a2;
    Spinner spnH185a2;
    LinearLayout secH185a2X;
    View lineH185a2X;
    TextView VlblH185a2X;
    EditText txtH185a2X;
    LinearLayout secH185a3;
    View lineH185a3;
    TextView VlblH185a3;
    Spinner spnH185a3;
    LinearLayout secH185a3X;
    View lineH185a3X;
    TextView VlblH185a3X;
    EditText txtH185a3X;
    LinearLayout secH185a4;
    View lineH185a4;
    TextView VlblH185a4;
    EditText txtH185a4;
    LinearLayout secH186a;
    View lineH186a;
    TextView VlblH186a;
    RadioGroup rdogrpH186a;
    RadioButton rdoH186a1;
    RadioButton rdoH186a2;
    LinearLayout secH186a1;
    View lineH186a1;
    TextView VlblH186a1;
    Spinner spnH186a1;
    LinearLayout secH186a1X;
    View lineH186a1X;
    TextView VlblH186a1X;
    EditText txtH186a1X;
    LinearLayout secH186a2;
    View lineH186a2;
    TextView VlblH186a2;
    Spinner spnH186a2;
    LinearLayout secH186a2X;
    View lineH186a2X;
    TextView VlblH186a2X;
    EditText txtH186a2X;
    LinearLayout secH186a3;
    View lineH186a3;
    TextView VlblH186a3;
    Spinner spnH186a3;
    LinearLayout secH186a3X;
    View lineH186a3X;
    TextView VlblH186a3X;
    EditText txtH186a3X;
    LinearLayout secH186a4;
    View lineH186a4;
    TextView VlblH186a4;
    EditText txtH186a4;
    LinearLayout secH187a;
    View lineH187a;
    TextView VlblH187a;
    RadioGroup rdogrpH187a;
    RadioButton rdoH187a1;
    RadioButton rdoH187a2;
    LinearLayout secH187a1;
    View lineH187a1;
    TextView VlblH187a1;
    Spinner spnH187a1;
    LinearLayout secH187a1X;
    View lineH187a1X;
    TextView VlblH187a1X;
    EditText txtH187a1X;
    LinearLayout secH187a2;
    View lineH187a2;
    TextView VlblH187a2;
    Spinner spnH187a2;
    LinearLayout secH187a2X;
    View lineH187a2X;
    TextView VlblH187a2X;
    EditText txtH187a2X;
    LinearLayout secH187a3;
    View lineH187a3;
    TextView VlblH187a3;
    Spinner spnH187a3;
    LinearLayout secH187a3X;
    View lineH187a3X;
    TextView VlblH187a3X;
    EditText txtH187a3X;
    LinearLayout secH187a4;
    View lineH187a4;
    TextView VlblH187a4;
    EditText txtH187a4;
    LinearLayout secH188a;
    View lineH188a;
    TextView VlblH188a;
    RadioGroup rdogrpH188a;
    RadioButton rdoH188a1;
    RadioButton rdoH188a2;
    LinearLayout secH188a1;
    View lineH188a1;
    TextView VlblH188a1;
    Spinner spnH188a1;
    LinearLayout secH188a1X;
    View lineH188a1X;
    TextView VlblH188a1X;
    EditText txtH188a1X;
    LinearLayout secH188a2;
    View lineH188a2;
    TextView VlblH188a2;
    Spinner spnH188a2;
    LinearLayout secH188a2X;
    View lineH188a2X;
    TextView VlblH188a2X;
    EditText txtH188a2X;
    LinearLayout secH188a3;
    View lineH188a3;
    TextView VlblH188a3;
    Spinner spnH188a3;
    LinearLayout secH1881a3X;
    View lineH1881a3X;
    TextView VlblH1881a3X;
    EditText txtH1881a3X;
    LinearLayout secH188a4;
    View lineH188a4;
    TextView VlblH188a4;
    EditText txtH188a4;
    LinearLayout secH189a;
    View lineH189a;
    TextView VlblH189a;
    RadioGroup rdogrpH189a;
    RadioButton rdoH189a1;
    RadioButton rdoH189a2;
    LinearLayout secH189a1;
    View lineH189a1;
    TextView VlblH189a1;
    Spinner spnH189a1;
    LinearLayout secH189a1X;
    View lineH189a1X;
    TextView VlblH189a1X;
    EditText txtH189a1X;
    LinearLayout secH189a2;
    View lineH189a2;
    TextView VlblH189a2;
    Spinner spnH189a2;
    LinearLayout secH189a2X;
    View lineH189a2X;
    TextView VlblH189a2X;
    EditText txtH189a2X;
    LinearLayout secH189a3;
    View lineH189a3;
    TextView VlblH189a3;
    Spinner spnH189a3;
    LinearLayout secH189a3X;
    View lineH189a3X;
    TextView VlblH189a3X;
    EditText txtH189a3X;
    LinearLayout secH189a4;
    View lineH189a4;
    TextView VlblH189a4;
    EditText txtH189a4;
    LinearLayout secH1810a;
    View lineH1810a;
    TextView VlblH1810a;
    RadioGroup rdogrpH1810a;
    RadioButton rdoH1810a1;
    RadioButton rdoH1810a2;
    LinearLayout secH1810a1;
    View lineH1810a1;
    TextView VlblH1810a1;
    Spinner spnH1810a1;
    LinearLayout secH1810a1X;
    View lineH1810a1X;
    TextView VlblH1810a1X;
    EditText txtH1810a1X;
    LinearLayout secH1810a2;
    View lineH1810a2;
    TextView VlblH1810a2;
    Spinner spnH1810a2;
    LinearLayout secH1810a2X;
    View lineH1810a2X;
    TextView VlblH1810a2X;
    EditText txtH1810a2X;
    LinearLayout secH1810a3;
    View lineH1810a3;
    TextView VlblH1810a3;
    Spinner spnH1810a3;
    LinearLayout secH1810a3X;
    View lineH1810a3X;
    TextView VlblH1810a3X;
    EditText txtH1810a3X;
    LinearLayout secH1810a4;
    View lineH1810a4;
    TextView VlblH1810a4;
    EditText txtH1810a4;
    LinearLayout secH1811a;
    View lineH1811a;
    TextView VlblH1811a;
    RadioGroup rdogrpH1811a;
    RadioButton rdoH1811a1;
    RadioButton rdoH1811a2;
    LinearLayout secH1811a1;
    View lineH1811a1;
    TextView VlblH1811a1;
    Spinner spnH1811a1;
    LinearLayout secH1811a1X;
    View lineH1811a1X;
    TextView VlblH1811a1X;
    EditText txtH1811a1X;
    LinearLayout secH1811a2;
    View lineH1811a2;
    TextView VlblH1811a2;
    Spinner spnH1811a2;
    LinearLayout secH1811a2X;
    View lineH1811a2X;
    TextView VlblH1811a2X;
    EditText txtH1811a2X;
    LinearLayout secH1811a3;
    View lineH1811a3;
    TextView VlblH1811a3;
    Spinner spnH1811a3;
    LinearLayout secH1811a3X;
    View lineH1811a3X;
    TextView VlblH1811a3X;
    EditText txtH1811a3X;
    LinearLayout secH1811a4;
    View lineH1811a4;
    TextView VlblH1811a4;
    EditText txtH1811a4;
    LinearLayout secH1812a;
    View lineH1812a;
    TextView VlblH1812a;
    RadioGroup rdogrpH1812a;
    RadioButton rdoH1812a1;
    RadioButton rdoH1812a2;
    LinearLayout secH1812a1;
    View lineH1812a1;
    TextView VlblH1812a1;
    Spinner spnH1812a1;
    LinearLayout secH1812a1X;
    View lineH1812a1X;
    TextView VlblH1812a1X;
    EditText txtH1812a1X;
    LinearLayout secH1812a2;
    View lineH1812a2;
    TextView VlblH1812a2;
    Spinner spnH1812a2;
    LinearLayout secH1812a2X;
    View lineH1812a2X;
    TextView VlblH1812a2X;
    EditText txtH1812a2X;
    LinearLayout secH1812a3;
    View lineH1812a3;
    TextView VlblH1812a3;
    Spinner spnH1812a3;
    LinearLayout secH1812a3X;
    View lineH1812a3X;
    TextView VlblH1812a3X;
    EditText txtH1812a3X;
    LinearLayout secH1812a4;
    View lineH1812a4;
    TextView VlblH1812a4;
    EditText txtH1812a4;
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
            setContentView(R.layout.careseek);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TableName = "Careseek";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Careseek.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Illness2_list.class);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(Careseek.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to return to Home [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), IGA.class);
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
            seclblH18a = (LinearLayout) findViewById(R.id.seclblH18a);
            secH181a = (LinearLayout) findViewById(R.id.secH181a);
            lineH181a = (View) findViewById(R.id.lineH181a);
            VlblH181a = (TextView) findViewById(R.id.VlblH181a);
            rdogrpH181a = (RadioGroup) findViewById(R.id.rdogrpH181a);

            rdoH181a1 = (RadioButton) findViewById(R.id.rdoH181a1);
            rdoH181a2 = (RadioButton) findViewById(R.id.rdoH181a2);
            rdogrpH181a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH181a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH181a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH181a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH181a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH181a1.setVisibility(View.GONE);
                        lineH181a1.setVisibility(View.GONE);
                        spnH181a1.setSelection(0);
                        secH181a1X.setVisibility(View.GONE);
                        lineH181a1X.setVisibility(View.GONE);
                        txtH181a1X.setText("");

                        secH181a2.setVisibility(View.GONE);
                        lineH181a2.setVisibility(View.GONE);
                        spnH181a2.setSelection(0);
                        secH181a2X.setVisibility(View.GONE);
                        lineH181a2X.setVisibility(View.GONE);
                        txtH181a2X.setText("");
                        secH181a3.setVisibility(View.GONE);
                        lineH181a3.setVisibility(View.GONE);
                        spnH181a3.setSelection(0);
                        secH181a3X.setVisibility(View.GONE);
                        lineH181a3X.setVisibility(View.GONE);
                        txtH181a3X.setText("");
                        secH181a4.setVisibility(View.GONE);
                        txtH181a4.setText("");

                    } else {
                        secH181a1.setVisibility(View.VISIBLE);
                        lineH181a1.setVisibility(View.VISIBLE);
                      //  secH181a1X.setVisibility(View.VISIBLE);
                      //  lineH181a1X.setVisibility(View.VISIBLE);

                        secH181a2.setVisibility(View.VISIBLE);
                        lineH181a2.setVisibility(View.VISIBLE);
                      //  secH181a2X.setVisibility(View.VISIBLE);
                      //  lineH181a2X.setVisibility(View.VISIBLE);
                        secH181a3.setVisibility(View.VISIBLE);
                        lineH181a3.setVisibility(View.VISIBLE);
                       // secH181a3X.setVisibility(View.VISIBLE);
                      //  lineH181a3X.setVisibility(View.VISIBLE);
                        secH181a4.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH181a1 = (LinearLayout) findViewById(R.id.secH181a1);
            lineH181a1 = (View) findViewById(R.id.lineH181a1);
            VlblH181a1 = (TextView) findViewById(R.id.VlblH181a1);
            spnH181a1 = (Spinner) findViewById(R.id.spnH181a1);
            List<String> listH181a1 = new ArrayList<String>();

            listH181a1.add("");
            listH181a1.add("1-পায়েহেঁটে");
            listH181a1.add("2-বাইসাইকেল");
            listH181a1.add("3-রিক্সা/ভ্যান");
            listH181a1.add("4-গরুরগাড়ি");
            listH181a1.add("5-নৌকা");
            listH181a1.add("6-ইঞ্জিন চালিত নৌকা");
            listH181a1.add("7-মোটরসাইকেল");
            listH181a1.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH181a1.add("9-বাস");
            listH181a1.add("10-ট্রেন");
            listH181a1.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH181a1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH181a1);
            spnH181a1.setAdapter(adptrH181a1);


            spnH181a1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH181a1.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH181a1X.setVisibility(View.VISIBLE);
                            lineH181a1X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH181a1X.setVisibility(View.GONE);
                            lineH181a1X.setVisibility(View.GONE);
                            txtH181a1X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });


            secH181a1X = (LinearLayout) findViewById(R.id.secH181a1X);
            lineH181a1X = (View) findViewById(R.id.lineH181a1X);
            VlblH181a1X = (TextView) findViewById(R.id.VlblH181a1X);
            txtH181a1X = (EditText) findViewById(R.id.txtH181a1X);
            secH181a2 = (LinearLayout) findViewById(R.id.secH181a2);
            lineH181a2 = (View) findViewById(R.id.lineH181a2);
            VlblH181a2 = (TextView) findViewById(R.id.VlblH181a2);
            spnH181a2 = (Spinner) findViewById(R.id.spnH181a2);
            List<String> listH181a2 = new ArrayList<String>();

            listH181a2.add("");
            listH181a2.add("1-পায়েহেঁটে");
            listH181a2.add("2-বাইসাইকেল");
            listH181a2.add("3-রিক্সা/ভ্যান");
            listH181a2.add("4-গরুরগাড়ি");
            listH181a2.add("5-নৌকা");
            listH181a2.add("6-ইঞ্জিন চালিত নৌকা");
            listH181a2.add("7-মোটরসাইকেল");
            listH181a2.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH181a2.add("9-বাস");
            listH181a2.add("10-ট্রেন");
            listH181a2.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH181a2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH181a2);
            spnH181a2.setAdapter(adptrH181a2);

            spnH181a2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH181a2.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH181a2X.setVisibility(View.VISIBLE);
                            lineH181a2X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH181a2X.setVisibility(View.GONE);
                            lineH181a2X.setVisibility(View.GONE);
                            txtH181a2X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH181a2X = (LinearLayout) findViewById(R.id.secH181a2X);
            lineH181a2X = (View) findViewById(R.id.lineH181a2X);
            VlblH181a2X = (TextView) findViewById(R.id.VlblH181a2X);
            txtH181a2X = (EditText) findViewById(R.id.txtH181a2X);
            secH181a3 = (LinearLayout) findViewById(R.id.secH181a3);
            lineH181a3 = (View) findViewById(R.id.lineH181a3);
            VlblH181a3 = (TextView) findViewById(R.id.VlblH181a3);
            spnH181a3 = (Spinner) findViewById(R.id.spnH181a3);
            List<String> listH181a3 = new ArrayList<String>();

            listH181a3.add("");
            listH181a3.add("1-পায়েহেঁটে");
            listH181a3.add("2-বাইসাইকেল");
            listH181a3.add("3-রিক্সা/ভ্যান");
            listH181a3.add("4-গরুরগাড়ি");
            listH181a3.add("5-নৌকা");
            listH181a3.add("6-ইঞ্জিন চালিত নৌকা");
            listH181a3.add("7-মোটরসাইকেল");
            listH181a3.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH181a3.add("9-বাস");
            listH181a3.add("10-ট্রেন");
            listH181a3.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH181a3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH181a3);
            spnH181a3.setAdapter(adptrH181a3);

            spnH181a3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH181a3.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH181a3X.setVisibility(View.VISIBLE);
                            lineH181a3X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH181a3X.setVisibility(View.GONE);
                            lineH181a3X.setVisibility(View.GONE);
                            txtH181a3X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });


            secH181a3X = (LinearLayout) findViewById(R.id.secH181a3X);
            lineH181a3X = (View) findViewById(R.id.lineH181a3X);
            VlblH181a3X = (TextView) findViewById(R.id.VlblH181a3X);
            txtH181a3X = (EditText) findViewById(R.id.txtH181a3X);
            secH181a4 = (LinearLayout) findViewById(R.id.secH181a4);
            lineH181a4 = (View) findViewById(R.id.lineH181a4);
            VlblH181a4 = (TextView) findViewById(R.id.VlblH181a4);
            txtH181a4 = (EditText) findViewById(R.id.txtH181a4);
            secH182a = (LinearLayout) findViewById(R.id.secH182a);
            lineH182a = (View) findViewById(R.id.lineH182a);
            VlblH182a = (TextView) findViewById(R.id.VlblH182a);
            rdogrpH182a = (RadioGroup) findViewById(R.id.rdogrpH182a);

            rdoH182a1 = (RadioButton) findViewById(R.id.rdoH182a1);
            rdoH182a2 = (RadioButton) findViewById(R.id.rdoH182a2);
            rdogrpH182a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH182a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH182a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH182a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH182a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH182a1.setVisibility(View.GONE);
                        lineH182a1.setVisibility(View.GONE);
                        spnH182a1.setSelection(0);
                        secH182a1X.setVisibility(View.GONE);
                        lineH182a1X.setVisibility(View.GONE);
                        txtH182a1X.setText("");
                        secH182a2.setVisibility(View.GONE);
                        lineH182a2.setVisibility(View.GONE);
                        spnH182a2.setSelection(0);
                        secH182a2X.setVisibility(View.GONE);
                        lineH182a2X.setVisibility(View.GONE);
                        txtH182a2X.setText("");
                        secH182a3.setVisibility(View.GONE);
                        lineH182a3.setVisibility(View.GONE);
                        spnH182a3.setSelection(0);
                        secH182a3X.setVisibility(View.GONE);
                        lineH182a3X.setVisibility(View.GONE);
                        txtH182a3X.setText("");
                        secH182a4.setVisibility(View.GONE);
                        lineH182a4.setVisibility(View.GONE);
                        txtH182a4.setText("");
                    } else {
                        secH182a1.setVisibility(View.VISIBLE);
                        lineH182a1.setVisibility(View.VISIBLE);
                      //  secH182a1X.setVisibility(View.VISIBLE);
                      //  lineH182a1X.setVisibility(View.VISIBLE);
                        secH182a2.setVisibility(View.VISIBLE);
                        lineH182a2.setVisibility(View.VISIBLE);
                      //  secH182a2X.setVisibility(View.VISIBLE);
                      //  lineH182a2X.setVisibility(View.VISIBLE);
                        secH182a3.setVisibility(View.VISIBLE);
                        lineH182a3.setVisibility(View.VISIBLE);
                     //   secH182a3X.setVisibility(View.VISIBLE);
                      //  lineH182a3X.setVisibility(View.VISIBLE);
                        secH182a4.setVisibility(View.VISIBLE);
                        lineH182a4.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH182a1 = (LinearLayout) findViewById(R.id.secH182a1);
            lineH182a1 = (View) findViewById(R.id.lineH182a1);
            VlblH182a1 = (TextView) findViewById(R.id.VlblH182a1);
            spnH182a1 = (Spinner) findViewById(R.id.spnH182a1);
            List<String> listH182a1 = new ArrayList<String>();

            listH182a1.add("");
            listH182a1.add("1-পায়েহেঁটে");
            listH182a1.add("2-বাইসাইকেল");
            listH182a1.add("3-রিক্সা/ভ্যান");
            listH182a1.add("4-গরুরগাড়ি");
            listH182a1.add("5-নৌকা");
            listH182a1.add("6-ইঞ্জিন চালিত নৌকা");
            listH182a1.add("7-মোটরসাইকেল");
            listH182a1.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH182a1.add("9-বাস");
            listH182a1.add("10-ট্রেন");
            listH182a1.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH182a1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH182a1);
            spnH182a1.setAdapter(adptrH182a1);

            spnH182a1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH182a1.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH182a1X.setVisibility(View.VISIBLE);
                            lineH182a1X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH182a1X.setVisibility(View.GONE);
                            lineH182a1X.setVisibility(View.GONE);
                            txtH182a1X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });


            secH182a1X = (LinearLayout) findViewById(R.id.secH182a1X);
            lineH182a1X = (View) findViewById(R.id.lineH182a1X);
            VlblH182a1X = (TextView) findViewById(R.id.VlblH182a1X);
            txtH182a1X = (EditText) findViewById(R.id.txtH182a1X);
            secH182a2 = (LinearLayout) findViewById(R.id.secH182a2);
            lineH182a2 = (View) findViewById(R.id.lineH182a2);
            VlblH182a2 = (TextView) findViewById(R.id.VlblH182a2);
            spnH182a2 = (Spinner) findViewById(R.id.spnH182a2);
            List<String> listH182a2 = new ArrayList<String>();

            listH182a2.add("");
            listH182a2.add("1-পায়েহেঁটে");
            listH182a2.add("2-বাইসাইকেল");
            listH182a2.add("3-রিক্সা/ভ্যান");
            listH182a2.add("4-গরুরগাড়ি");
            listH182a2.add("5-নৌকা");
            listH182a2.add("6-ইঞ্জিন চালিত নৌকা");
            listH182a2.add("7-মোটরসাইকেল");
            listH182a2.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH182a2.add("9-বাস");
            listH182a2.add("10-ট্রেন");
            listH182a2.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH182a2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH182a2);
            spnH182a2.setAdapter(adptrH182a2);

            spnH182a2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH182a2.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH182a2X.setVisibility(View.VISIBLE);
                            lineH182a2X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH182a2X.setVisibility(View.GONE);
                            lineH182a2X.setVisibility(View.GONE);
                            txtH182a2X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });


            secH182a2X = (LinearLayout) findViewById(R.id.secH182a2X);
            lineH182a2X = (View) findViewById(R.id.lineH182a2X);
            VlblH182a2X = (TextView) findViewById(R.id.VlblH182a2X);
            txtH182a2X = (EditText) findViewById(R.id.txtH182a2X);
            secH182a3 = (LinearLayout) findViewById(R.id.secH182a3);
            lineH182a3 = (View) findViewById(R.id.lineH182a3);
            VlblH182a3 = (TextView) findViewById(R.id.VlblH182a3);
            spnH182a3 = (Spinner) findViewById(R.id.spnH182a3);
            List<String> listH182a3 = new ArrayList<String>();

            listH182a3.add("");
            listH182a3.add("1-পায়েহেঁটে");
            listH182a3.add("2-বাইসাইকেল");
            listH182a3.add("3-রিক্সা/ভ্যান");
            listH182a3.add("4-গরুরগাড়ি");
            listH182a3.add("5-নৌকা");
            listH182a3.add("6-ইঞ্জিন চালিত নৌকা");
            listH182a3.add("7-মোটরসাইকেল");
            listH182a3.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH182a3.add("9-বাস");
            listH182a3.add("10-ট্রেন");
            listH182a3.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH182a3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH182a3);
            spnH182a3.setAdapter(adptrH182a3);

            spnH182a3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH182a3.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH182a3X.setVisibility(View.VISIBLE);
                            lineH182a3X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH182a3X.setVisibility(View.GONE);
                            lineH182a3X.setVisibility(View.GONE);
                            txtH182a3X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });


            secH182a3X = (LinearLayout) findViewById(R.id.secH182a3X);
            lineH182a3X = (View) findViewById(R.id.lineH182a3X);
            VlblH182a3X = (TextView) findViewById(R.id.VlblH182a3X);
            txtH182a3X = (EditText) findViewById(R.id.txtH182a3X);
            secH182a4 = (LinearLayout) findViewById(R.id.secH182a4);
            lineH182a4 = (View) findViewById(R.id.lineH182a4);
            VlblH182a4 = (TextView) findViewById(R.id.VlblH182a4);
            txtH182a4 = (EditText) findViewById(R.id.txtH182a4);
            secH183a = (LinearLayout) findViewById(R.id.secH183a);
            lineH183a = (View) findViewById(R.id.lineH183a);
            VlblH183a = (TextView) findViewById(R.id.VlblH183a);
            rdogrpH183a = (RadioGroup) findViewById(R.id.rdogrpH183a);

            rdoH183a1 = (RadioButton) findViewById(R.id.rdoH183a1);
            rdoH183a2 = (RadioButton) findViewById(R.id.rdoH183a2);
            rdogrpH183a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH183a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH183a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH183a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH183a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH183a1.setVisibility(View.GONE);
                        lineH183a1.setVisibility(View.GONE);
                        spnH183a1.setSelection(0);
                        secH183a1X.setVisibility(View.GONE);
                        lineH183a1X.setVisibility(View.GONE);
                        txtH183a1X.setText("");
                        secH183a2.setVisibility(View.GONE);
                        lineH183a2.setVisibility(View.GONE);
                        spnH183a2.setSelection(0);
                        secH183a2X.setVisibility(View.GONE);
                        lineH183a2X.setVisibility(View.GONE);
                        txtH183a2X.setText("");
                        secH183a3.setVisibility(View.GONE);
                        lineH183a3.setVisibility(View.GONE);
                        spnH183a3.setSelection(0);
                        secH183a3X.setVisibility(View.GONE);
                        lineH183a3X.setVisibility(View.GONE);
                        txtH183a3X.setText("");
                        secH183a4.setVisibility(View.GONE);
                        lineH183a4.setVisibility(View.GONE);
                        txtH183a4.setText("");
                    } else {
                        secH183a1.setVisibility(View.VISIBLE);
                        lineH183a1.setVisibility(View.VISIBLE);
                      //  secH183a1X.setVisibility(View.VISIBLE);
                      //  lineH183a1X.setVisibility(View.VISIBLE);
                        secH183a2.setVisibility(View.VISIBLE);
                        lineH183a2.setVisibility(View.VISIBLE);
                     //   secH183a2X.setVisibility(View.VISIBLE);
                     //   lineH183a2X.setVisibility(View.VISIBLE);
                        secH183a3.setVisibility(View.VISIBLE);
                        lineH183a3.setVisibility(View.VISIBLE);
                      //  secH183a3X.setVisibility(View.VISIBLE);
                      //  lineH183a3X.setVisibility(View.VISIBLE);
                        secH183a4.setVisibility(View.VISIBLE);
                        lineH183a4.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH183a1 = (LinearLayout) findViewById(R.id.secH183a1);
            lineH183a1 = (View) findViewById(R.id.lineH183a1);
            VlblH183a1 = (TextView) findViewById(R.id.VlblH183a1);
            spnH183a1 = (Spinner) findViewById(R.id.spnH183a1);
            List<String> listH183a1 = new ArrayList<String>();

            listH183a1.add("");
            listH183a1.add("1-পায়েহেঁটে");
            listH183a1.add("2-বাইসাইকেল");
            listH183a1.add("3-রিক্সা/ভ্যান");
            listH183a1.add("4-গরুরগাড়ি");
            listH183a1.add("5-নৌকা");
            listH183a1.add("6-ইঞ্জিন চালিত নৌকা");
            listH183a1.add("7-মোটরসাইকেল");
            listH183a1.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH183a1.add("9-বাস");
            listH183a1.add("10-ট্রেন");
            listH183a1.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH183a1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH183a1);
            spnH183a1.setAdapter(adptrH183a1);

            spnH183a1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH183a1.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH183a1X.setVisibility(View.VISIBLE);
                            lineH183a1X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH183a1X.setVisibility(View.GONE);
                            lineH183a1X.setVisibility(View.GONE);
                            txtH183a1X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH183a1X = (LinearLayout) findViewById(R.id.secH183a1X);
            lineH183a1X = (View) findViewById(R.id.lineH183a1X);
            VlblH183a1X = (TextView) findViewById(R.id.VlblH183a1X);
            txtH183a1X = (EditText) findViewById(R.id.txtH183a1X);
            secH183a2 = (LinearLayout) findViewById(R.id.secH183a2);
            lineH183a2 = (View) findViewById(R.id.lineH183a2);
            VlblH183a2 = (TextView) findViewById(R.id.VlblH183a2);
            spnH183a2 = (Spinner) findViewById(R.id.spnH183a2);
            List<String> listH183a2 = new ArrayList<String>();

            listH183a2.add("");
            listH183a2.add("11-পায়েহেঁটে");
            listH183a2.add("2-বাইসাইকেল");
            listH183a2.add("3-রিক্সা/ভ্যান");
            listH183a2.add("4-গরুরগাড়ি");
            listH183a2.add("5-নৌকা");
            listH183a2.add("6-ইঞ্জিন চালিত নৌকা");
            listH183a2.add("7-মোটরসাইকেল");
            listH183a2.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH183a2.add("9-বাস");
            listH183a2.add("10-ট্রেন");
            listH183a2.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH183a2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH183a2);
            spnH183a2.setAdapter(adptrH183a2);

            spnH183a2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH183a2.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH183a2X.setVisibility(View.VISIBLE);
                            lineH183a2X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH183a2X.setVisibility(View.GONE);
                            lineH183a2X.setVisibility(View.GONE);
                            txtH183a2X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH183a2X = (LinearLayout) findViewById(R.id.secH183a2X);
            lineH183a2X = (View) findViewById(R.id.lineH183a2X);
            VlblH183a2X = (TextView) findViewById(R.id.VlblH183a2X);
            txtH183a2X = (EditText) findViewById(R.id.txtH183a2X);
            secH183a3 = (LinearLayout) findViewById(R.id.secH183a3);
            lineH183a3 = (View) findViewById(R.id.lineH183a3);
            VlblH183a3 = (TextView) findViewById(R.id.VlblH183a3);
            spnH183a3 = (Spinner) findViewById(R.id.spnH183a3);
            List<String> listH183a3 = new ArrayList<String>();

            listH183a3.add("");
            listH183a3.add("1-পায়েহেঁটে");
            listH183a3.add("2-বাইসাইকেল");
            listH183a3.add("3-রিক্সা/ভ্যান");
            listH183a3.add("4-গরুরগাড়ি");
            listH183a3.add("5-নৌকা");
            listH183a3.add("6-ইঞ্জিন চালিত নৌকা");
            listH183a3.add("7-মোটরসাইকেল");
            listH183a3.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH183a3.add("9-বাস");
            listH183a3.add("10-ট্রেন");
            listH183a3.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH183a3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH183a3);
            spnH183a3.setAdapter(adptrH183a3);

            spnH183a3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH183a3.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH183a3X.setVisibility(View.VISIBLE);
                            lineH183a3X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH183a3X.setVisibility(View.GONE);
                            lineH183a3X.setVisibility(View.GONE);
                            txtH183a3X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH183a3X = (LinearLayout) findViewById(R.id.secH183a3X);
            lineH183a3X = (View) findViewById(R.id.lineH183a3X);
            VlblH183a3X = (TextView) findViewById(R.id.VlblH183a3X);
            txtH183a3X = (EditText) findViewById(R.id.txtH183a3X);
            secH183a4 = (LinearLayout) findViewById(R.id.secH183a4);
            lineH183a4 = (View) findViewById(R.id.lineH183a4);
            VlblH183a4 = (TextView) findViewById(R.id.VlblH183a4);
            txtH183a4 = (EditText) findViewById(R.id.txtH183a4);
            secH184a = (LinearLayout) findViewById(R.id.secH184a);
            lineH184a = (View) findViewById(R.id.lineH184a);
            VlblH184a = (TextView) findViewById(R.id.VlblH184a);
            rdogrpH184a = (RadioGroup) findViewById(R.id.rdogrpH184a);

            rdoH184a1 = (RadioButton) findViewById(R.id.rdoH184a1);
            rdoH184a2 = (RadioButton) findViewById(R.id.rdoH184a2);
            rdogrpH184a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH184a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH184a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH184a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH184a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH184a1.setVisibility(View.GONE);
                        lineH184a1.setVisibility(View.GONE);
                        spnH184a1.setSelection(0);
                        secH184a1X.setVisibility(View.GONE);
                        lineH184a1X.setVisibility(View.GONE);
                        txtH184a1X.setText("");
                        secH184a2.setVisibility(View.GONE);
                        lineH184a2.setVisibility(View.GONE);
                        spnH184a2.setSelection(0);
                        secH184a2X.setVisibility(View.GONE);
                        lineH184a2X.setVisibility(View.GONE);
                        txtH184a2X.setText("");
                        secH184a3.setVisibility(View.GONE);
                        lineH184a3.setVisibility(View.GONE);
                        spnH184a3.setSelection(0);
                        secH184a3X.setVisibility(View.GONE);
                        lineH184a3X.setVisibility(View.GONE);
                        txtH184a3X.setText("");
                        secH184a4.setVisibility(View.GONE);
                        lineH184a4.setVisibility(View.GONE);
                        txtH184a4.setText("");
                    } else {
                        secH184a1.setVisibility(View.VISIBLE);
                        lineH184a1.setVisibility(View.VISIBLE);
                      //  secH184a1X.setVisibility(View.VISIBLE);
                     //   lineH184a1X.setVisibility(View.VISIBLE);
                        secH184a2.setVisibility(View.VISIBLE);
                        lineH184a2.setVisibility(View.VISIBLE);
                     //   secH184a2X.setVisibility(View.VISIBLE);
                    //    lineH184a2X.setVisibility(View.VISIBLE);
                        secH184a3.setVisibility(View.VISIBLE);
                        lineH184a3.setVisibility(View.VISIBLE);
                   //     secH184a3X.setVisibility(View.VISIBLE);
                    //    lineH184a3X.setVisibility(View.VISIBLE);
                        secH184a4.setVisibility(View.VISIBLE);
                        lineH184a4.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH184a1 = (LinearLayout) findViewById(R.id.secH184a1);
            lineH184a1 = (View) findViewById(R.id.lineH184a1);
            VlblH184a1 = (TextView) findViewById(R.id.VlblH184a1);
            spnH184a1 = (Spinner) findViewById(R.id.spnH184a1);
            List<String> listH184a1 = new ArrayList<String>();

            listH184a1.add("");
            listH184a1.add("1-পায়েহেঁটে");
            listH184a1.add("2-বাইসাইকেল");
            listH184a1.add("3-রিক্সা/ভ্যান");
            listH184a1.add("4-গরুরগাড়ি");
            listH184a1.add("5-নৌকা");
            listH184a1.add("6-ইঞ্জিন চালিত নৌকা");
            listH184a1.add("7-মোটরসাইকেল");
            listH184a1.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH184a1.add("9-বাস");
            listH184a1.add("10-ট্রেন");
            listH184a1.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH184a1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH184a1);
            spnH184a1.setAdapter(adptrH184a1);

            spnH184a1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH184a1.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH184a1X.setVisibility(View.VISIBLE);
                            lineH184a1X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH184a1X.setVisibility(View.GONE);
                            lineH184a1X.setVisibility(View.GONE);
                            txtH184a1X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH184a1X = (LinearLayout) findViewById(R.id.secH184a1X);
            lineH184a1X = (View) findViewById(R.id.lineH184a1X);
            VlblH184a1X = (TextView) findViewById(R.id.VlblH184a1X);
            txtH184a1X = (EditText) findViewById(R.id.txtH184a1X);
            secH184a2 = (LinearLayout) findViewById(R.id.secH184a2);
            lineH184a2 = (View) findViewById(R.id.lineH184a2);
            VlblH184a2 = (TextView) findViewById(R.id.VlblH184a2);
            spnH184a2 = (Spinner) findViewById(R.id.spnH184a2);
            List<String> listH184a2 = new ArrayList<String>();

            listH184a2.add("");
            listH184a2.add("1-পায়েহেঁটে");
            listH184a2.add("2-বাইসাইকেল");
            listH184a2.add("3-রিক্সা/ভ্যান");
            listH184a2.add("4-গরুরগাড়ি");
            listH184a2.add("5-নৌকা");
            listH184a2.add("6-ইঞ্জিন চালিত নৌকা");
            listH184a2.add("7-মোটরসাইকেল");
            listH184a2.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH184a2.add("9-বাস");
            listH184a2.add("10-ট্রেন");
            listH184a2.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH184a2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH184a2);
            spnH184a2.setAdapter(adptrH184a2);

            spnH184a2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH184a2.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH184a2X.setVisibility(View.VISIBLE);
                            lineH184a2X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH184a2X.setVisibility(View.GONE);
                            lineH184a2X.setVisibility(View.GONE);
                            txtH184a2X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH184a2X = (LinearLayout) findViewById(R.id.secH184a2X);
            lineH184a2X = (View) findViewById(R.id.lineH184a2X);
            VlblH184a2X = (TextView) findViewById(R.id.VlblH184a2X);
            txtH184a2X = (EditText) findViewById(R.id.txtH184a2X);
            secH184a3 = (LinearLayout) findViewById(R.id.secH184a3);
            lineH184a3 = (View) findViewById(R.id.lineH184a3);
            VlblH184a3 = (TextView) findViewById(R.id.VlblH184a3);
            spnH184a3 = (Spinner) findViewById(R.id.spnH184a3);
            List<String> listH184a3 = new ArrayList<String>();

            listH184a3.add("");
            listH184a3.add("1-পায়েহেঁটে");
            listH184a3.add("2-বাইসাইকেল");
            listH184a3.add("3-রিক্সা/ভ্যান");
            listH184a3.add("4-গরুরগাড়ি");
            listH184a3.add("5-নৌকা");
            listH184a3.add("6-ইঞ্জিন চালিত নৌকা");
            listH184a3.add("7-মোটরসাইকেল");
            listH184a3.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH184a3.add("9-বাস");
            listH184a3.add("10-ট্রেন");
            listH184a3.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH184a3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH184a3);
            spnH184a3.setAdapter(adptrH184a3);

            spnH184a3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH184a3.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH184a3X.setVisibility(View.VISIBLE);
                            lineH184a3X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH184a3X.setVisibility(View.GONE);
                            lineH184a3X.setVisibility(View.GONE);
                            txtH184a3X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH184a3X = (LinearLayout) findViewById(R.id.secH184a3X);
            lineH184a3X = (View) findViewById(R.id.lineH184a3X);
            VlblH184a3X = (TextView) findViewById(R.id.VlblH184a3X);
            txtH184a3X = (EditText) findViewById(R.id.txtH184a3X);
            secH184a4 = (LinearLayout) findViewById(R.id.secH184a4);
            lineH184a4 = (View) findViewById(R.id.lineH184a4);
            VlblH184a4 = (TextView) findViewById(R.id.VlblH184a4);
            txtH184a4 = (EditText) findViewById(R.id.txtH184a4);
            secH185a = (LinearLayout) findViewById(R.id.secH185a);
            lineH185a = (View) findViewById(R.id.lineH185a);
            VlblH185a = (TextView) findViewById(R.id.VlblH185a);
            rdogrpH185a = (RadioGroup) findViewById(R.id.rdogrpH185a);

            rdoH185a1 = (RadioButton) findViewById(R.id.rdoH185a1);
            rdoH185a2 = (RadioButton) findViewById(R.id.rdoH185a2);
            rdogrpH185a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH185a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH185a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH185a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH185a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH185a1.setVisibility(View.GONE);
                        lineH185a1.setVisibility(View.GONE);
                        spnH185a1.setSelection(0);
                        secH185a1X.setVisibility(View.GONE);
                        lineH185a1X.setVisibility(View.GONE);
                        txtH185a1X.setText("");
                        secH185a2.setVisibility(View.GONE);
                        lineH185a2.setVisibility(View.GONE);
                        spnH185a2.setSelection(0);
                        secH185a2X.setVisibility(View.GONE);
                        lineH185a2X.setVisibility(View.GONE);
                        txtH185a2X.setText("");
                        secH185a3.setVisibility(View.GONE);
                        lineH185a3.setVisibility(View.GONE);
                        spnH185a3.setSelection(0);
                        secH185a3X.setVisibility(View.GONE);
                        lineH185a3X.setVisibility(View.GONE);
                        txtH185a3X.setText("");
                        secH185a4.setVisibility(View.GONE);
                        lineH185a4.setVisibility(View.GONE);
                        txtH185a4.setText("");
                    } else {
                        secH185a1.setVisibility(View.VISIBLE);
                        lineH185a1.setVisibility(View.VISIBLE);
                    //    secH185a1X.setVisibility(View.VISIBLE);
                    //    lineH185a1X.setVisibility(View.VISIBLE);
                        secH185a2.setVisibility(View.VISIBLE);
                        lineH185a2.setVisibility(View.VISIBLE);
                   //     secH185a2X.setVisibility(View.VISIBLE);
                   //     lineH185a2X.setVisibility(View.VISIBLE);
                        secH185a3.setVisibility(View.VISIBLE);
                        lineH185a3.setVisibility(View.VISIBLE);
                     //   secH185a3X.setVisibility(View.VISIBLE);
                    //    lineH185a3X.setVisibility(View.VISIBLE);
                        secH185a4.setVisibility(View.VISIBLE);
                        lineH185a4.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH185a1 = (LinearLayout) findViewById(R.id.secH185a1);
            lineH185a1 = (View) findViewById(R.id.lineH185a1);
            VlblH185a1 = (TextView) findViewById(R.id.VlblH185a1);
            spnH185a1 = (Spinner) findViewById(R.id.spnH185a1);
            List<String> listH185a1 = new ArrayList<String>();

            listH185a1.add("");
            listH185a1.add("1-পায়েহেঁটে");
            listH185a1.add("2-বাইসাইকেল");
            listH185a1.add("3-রিক্সা/ভ্যান");
            listH185a1.add("4-গরুরগাড়ি");
            listH185a1.add("5-নৌকা");
            listH185a1.add("6-ইঞ্জিন চালিত নৌকা");
            listH185a1.add("7-মোটরসাইকেল");
            listH185a1.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH185a1.add("9-বাস");
            listH185a1.add("10-ট্রেন");
            listH185a1.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH185a1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH185a1);
            spnH185a1.setAdapter(adptrH185a1);

            spnH185a1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH185a1.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH185a1X.setVisibility(View.VISIBLE);
                            lineH185a1X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH185a1X.setVisibility(View.GONE);
                            lineH185a1X.setVisibility(View.GONE);
                            txtH185a1X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH185a1X = (LinearLayout) findViewById(R.id.secH185a1X);
            lineH185a1X = (View) findViewById(R.id.lineH185a1X);
            VlblH185a1X = (TextView) findViewById(R.id.VlblH185a1X);
            txtH185a1X = (EditText) findViewById(R.id.txtH185a1X);
            secH185a2 = (LinearLayout) findViewById(R.id.secH185a2);
            lineH185a2 = (View) findViewById(R.id.lineH185a2);
            VlblH185a2 = (TextView) findViewById(R.id.VlblH185a2);
            spnH185a2 = (Spinner) findViewById(R.id.spnH185a2);
            List<String> listH185a2 = new ArrayList<String>();

            listH185a2.add("");
            listH185a2.add("1-পায়েহেঁটে");
            listH185a2.add("2-বাইসাইকেল");
            listH185a2.add("3-রিক্সা/ভ্যান");
            listH185a2.add("4-গরুরগাড়ি");
            listH185a2.add("5-নৌকা");
            listH185a2.add("6-ইঞ্জিন চালিত নৌকা ");
            listH185a2.add("7-মোটরসাইকেল");
            listH185a2.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH185a2.add("9-বাস");
            listH185a2.add("10-ট্রেন");
            listH185a2.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH185a2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH185a2);
            spnH185a2.setAdapter(adptrH185a2);

            spnH185a2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH185a2.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH185a2X.setVisibility(View.VISIBLE);
                            lineH185a2X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH185a2X.setVisibility(View.GONE);
                            lineH185a2X.setVisibility(View.GONE);
                            txtH185a2X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH185a2X = (LinearLayout) findViewById(R.id.secH185a2X);
            lineH185a2X = (View) findViewById(R.id.lineH185a2X);
            VlblH185a2X = (TextView) findViewById(R.id.VlblH185a2X);
            txtH185a2X = (EditText) findViewById(R.id.txtH185a2X);
            secH185a3 = (LinearLayout) findViewById(R.id.secH185a3);
            lineH185a3 = (View) findViewById(R.id.lineH185a3);
            VlblH185a3 = (TextView) findViewById(R.id.VlblH185a3);
            spnH185a3 = (Spinner) findViewById(R.id.spnH185a3);
            List<String> listH185a3 = new ArrayList<String>();

            listH185a3.add("");
            listH185a3.add("1-পায়েহেঁটে");
            listH185a3.add("2-বাইসাইকেল");
            listH185a3.add("3-রিক্সা/ভ্যান");
            listH185a3.add("4-গরুরগাড়ি");
            listH185a3.add("5-নৌকা");
            listH185a3.add("6-ইঞ্জিন চালিত নৌকা");
            listH185a3.add("7-মোটরসাইকেল");
            listH185a3.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH185a3.add("9-বাস");
            listH185a3.add("10-ট্রেন");
            listH185a3.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH185a3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH185a3);
            spnH185a3.setAdapter(adptrH185a3);

            spnH185a3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH185a3.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH185a3X.setVisibility(View.VISIBLE);
                            lineH185a3X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH185a3X.setVisibility(View.GONE);
                            lineH185a3X.setVisibility(View.GONE);
                            txtH185a3X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH185a3X = (LinearLayout) findViewById(R.id.secH185a3X);
            lineH185a3X = (View) findViewById(R.id.lineH185a3X);
            VlblH185a3X = (TextView) findViewById(R.id.VlblH185a3X);
            txtH185a3X = (EditText) findViewById(R.id.txtH185a3X);
            secH185a4 = (LinearLayout) findViewById(R.id.secH185a4);
            lineH185a4 = (View) findViewById(R.id.lineH185a4);
            VlblH185a4 = (TextView) findViewById(R.id.VlblH185a4);
            txtH185a4 = (EditText) findViewById(R.id.txtH185a4);
            secH186a = (LinearLayout) findViewById(R.id.secH186a);
            lineH186a = (View) findViewById(R.id.lineH186a);
            VlblH186a = (TextView) findViewById(R.id.VlblH186a);
            rdogrpH186a = (RadioGroup) findViewById(R.id.rdogrpH186a);

            rdoH186a1 = (RadioButton) findViewById(R.id.rdoH186a1);
            rdoH186a2 = (RadioButton) findViewById(R.id.rdoH186a2);
            rdogrpH186a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH186a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH186a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH186a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH186a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH186a1.setVisibility(View.GONE);
                        lineH186a1.setVisibility(View.GONE);
                        spnH186a1.setSelection(0);
                        secH186a1X.setVisibility(View.GONE);
                        lineH186a1X.setVisibility(View.GONE);
                        txtH186a1X.setText("");
                        secH186a2.setVisibility(View.GONE);
                        lineH186a2.setVisibility(View.GONE);
                        spnH186a2.setSelection(0);
                        secH186a2X.setVisibility(View.GONE);
                        lineH186a2X.setVisibility(View.GONE);
                        txtH186a2X.setText("");
                        secH186a3.setVisibility(View.GONE);
                        lineH186a3.setVisibility(View.GONE);
                        spnH186a3.setSelection(0);
                        secH186a3X.setVisibility(View.GONE);
                        lineH186a3X.setVisibility(View.GONE);
                        txtH186a3X.setText("");
                        secH186a4.setVisibility(View.GONE);
                        lineH186a4.setVisibility(View.GONE);
                        txtH186a4.setText("");
                    } else {
                        secH186a1.setVisibility(View.VISIBLE);
                        lineH186a1.setVisibility(View.VISIBLE);
                     //   secH186a1X.setVisibility(View.VISIBLE);
                    //    lineH186a1X.setVisibility(View.VISIBLE);
                        secH186a2.setVisibility(View.VISIBLE);
                        lineH186a2.setVisibility(View.VISIBLE);
                      //  secH186a2X.setVisibility(View.VISIBLE);
                    //    lineH186a2X.setVisibility(View.VISIBLE);
                        secH186a3.setVisibility(View.VISIBLE);
                        lineH186a3.setVisibility(View.VISIBLE);
                     //   secH186a3X.setVisibility(View.VISIBLE);
                     //   lineH186a3X.setVisibility(View.VISIBLE);
                        secH186a4.setVisibility(View.VISIBLE);
                        lineH186a4.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH186a1 = (LinearLayout) findViewById(R.id.secH186a1);
            lineH186a1 = (View) findViewById(R.id.lineH186a1);
            VlblH186a1 = (TextView) findViewById(R.id.VlblH186a1);
            spnH186a1 = (Spinner) findViewById(R.id.spnH186a1);
            List<String> listH186a1 = new ArrayList<String>();

            listH186a1.add("");
            listH186a1.add("1-পায়েহেঁটে");
            listH186a1.add("2-বাইসাইকেল");
            listH186a1.add("3-রিক্সা/ভ্যান");
            listH186a1.add("4-গরুরগাড়ি");
            listH186a1.add("5-নৌকা");
            listH186a1.add("6-ইঞ্জিন চালিত নৌকা");
            listH186a1.add("7-মোটরসাইকেল");
            listH186a1.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH186a1.add("9-বাস");
            listH186a1.add("10-ট্রেন");
            listH186a1.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH186a1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH186a1);
            spnH186a1.setAdapter(adptrH186a1);

            spnH186a1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH186a1.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH186a1X.setVisibility(View.VISIBLE);
                            lineH186a1X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH186a1X.setVisibility(View.GONE);
                            lineH186a1X.setVisibility(View.GONE);
                            txtH186a1X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH186a1X = (LinearLayout) findViewById(R.id.secH186a1X);
            lineH186a1X = (View) findViewById(R.id.lineH186a1X);
            VlblH186a1X = (TextView) findViewById(R.id.VlblH186a1X);
            txtH186a1X = (EditText) findViewById(R.id.txtH186a1X);
            secH186a2 = (LinearLayout) findViewById(R.id.secH186a2);
            lineH186a2 = (View) findViewById(R.id.lineH186a2);
            VlblH186a2 = (TextView) findViewById(R.id.VlblH186a2);
            spnH186a2 = (Spinner) findViewById(R.id.spnH186a2);
            List<String> listH186a2 = new ArrayList<String>();

            listH186a2.add("");
            listH186a2.add("1-পায়েহেঁটে");
            listH186a2.add("2-বাইসাইকেল");
            listH186a2.add("3-রিক্সা/ভ্যান");
            listH186a2.add("4-গরুরগাড়ি");
            listH186a2.add("5-নৌকা");
            listH186a2.add("6-ইঞ্জিন চালিত নৌকা");
            listH186a2.add("7-মোটরসাইকেল");
            listH186a2.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH186a2.add("9-বাস");
            listH186a2.add("10-ট্রেন");
            listH186a2.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH186a2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH186a2);
            spnH186a2.setAdapter(adptrH186a2);

            spnH186a2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH186a2.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH186a2X.setVisibility(View.VISIBLE);
                            lineH186a2X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH186a2X.setVisibility(View.GONE);
                            lineH186a2X.setVisibility(View.GONE);
                            txtH186a2X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH186a2X = (LinearLayout) findViewById(R.id.secH186a2X);
            lineH186a2X = (View) findViewById(R.id.lineH186a2X);
            VlblH186a2X = (TextView) findViewById(R.id.VlblH186a2X);
            txtH186a2X = (EditText) findViewById(R.id.txtH186a2X);
            secH186a3 = (LinearLayout) findViewById(R.id.secH186a3);
            lineH186a3 = (View) findViewById(R.id.lineH186a3);
            VlblH186a3 = (TextView) findViewById(R.id.VlblH186a3);
            spnH186a3 = (Spinner) findViewById(R.id.spnH186a3);
            List<String> listH186a3 = new ArrayList<String>();

            listH186a3.add("");
            listH186a3.add("1-পায়েহেঁটে");
            listH186a3.add("2-বাইসাইকেল");
            listH186a3.add("3-রিক্সা/ভ্যান");
            listH186a3.add("4-গরুরগাড়ি");
            listH186a3.add("5-নৌকা");
            listH186a3.add("6-ইঞ্জিন চালিত নৌকা");
            listH186a3.add("7-মোটরসাইকেল");
            listH186a3.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH186a3.add("9-বাস");
            listH186a3.add("10-ট্রেন");
            listH186a3.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH186a3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH186a3);
            spnH186a3.setAdapter(adptrH186a3);

            spnH186a3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH186a3.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH186a3X.setVisibility(View.VISIBLE);
                            lineH186a3X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH186a3X.setVisibility(View.GONE);
                            lineH186a3X.setVisibility(View.GONE);
                            txtH186a3X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH186a3X = (LinearLayout) findViewById(R.id.secH186a3X);
            lineH186a3X = (View) findViewById(R.id.lineH186a3X);
            VlblH186a3X = (TextView) findViewById(R.id.VlblH186a3X);
            txtH186a3X = (EditText) findViewById(R.id.txtH186a3X);
            secH186a4 = (LinearLayout) findViewById(R.id.secH186a4);
            lineH186a4 = (View) findViewById(R.id.lineH186a4);
            VlblH186a4 = (TextView) findViewById(R.id.VlblH186a4);
            txtH186a4 = (EditText) findViewById(R.id.txtH186a4);
            secH187a = (LinearLayout) findViewById(R.id.secH187a);
            lineH187a = (View) findViewById(R.id.lineH187a);
            VlblH187a = (TextView) findViewById(R.id.VlblH187a);
            rdogrpH187a = (RadioGroup) findViewById(R.id.rdogrpH187a);

            rdoH187a1 = (RadioButton) findViewById(R.id.rdoH187a1);
            rdoH187a2 = (RadioButton) findViewById(R.id.rdoH187a2);
            rdogrpH187a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH187a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH187a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH187a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH187a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH187a1.setVisibility(View.GONE);
                        lineH187a1.setVisibility(View.GONE);
                        spnH187a1.setSelection(0);
                        secH187a1X.setVisibility(View.GONE);
                        lineH187a1X.setVisibility(View.GONE);
                        txtH187a1X.setText("");
                        secH187a2.setVisibility(View.GONE);
                        lineH187a2.setVisibility(View.GONE);
                        spnH187a2.setSelection(0);
                        secH187a2X.setVisibility(View.GONE);
                        lineH187a2X.setVisibility(View.GONE);
                        txtH187a2X.setText("");
                        secH187a3.setVisibility(View.GONE);
                        lineH187a3.setVisibility(View.GONE);
                        spnH187a3.setSelection(0);
                        secH187a3X.setVisibility(View.GONE);
                        lineH187a3X.setVisibility(View.GONE);
                        txtH187a3X.setText("");
                        secH187a4.setVisibility(View.GONE);
                        lineH187a4.setVisibility(View.GONE);
                        txtH187a4.setText("");
                    } else {
                        secH187a1.setVisibility(View.VISIBLE);
                        lineH187a1.setVisibility(View.VISIBLE);
                     //   secH187a1X.setVisibility(View.VISIBLE);
                     //   lineH187a1X.setVisibility(View.VISIBLE);
                        secH187a2.setVisibility(View.VISIBLE);
                        lineH187a2.setVisibility(View.VISIBLE);
                     //   secH187a2X.setVisibility(View.VISIBLE);
                     //   lineH187a2X.setVisibility(View.VISIBLE);
                        secH187a3.setVisibility(View.VISIBLE);
                        lineH187a3.setVisibility(View.VISIBLE);
                      //  secH187a3X.setVisibility(View.VISIBLE);
                      //  lineH187a3X.setVisibility(View.VISIBLE);
                        secH187a4.setVisibility(View.VISIBLE);
                        lineH187a4.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH187a1 = (LinearLayout) findViewById(R.id.secH187a1);
            lineH187a1 = (View) findViewById(R.id.lineH187a1);
            VlblH187a1 = (TextView) findViewById(R.id.VlblH187a1);
            spnH187a1 = (Spinner) findViewById(R.id.spnH187a1);
            List<String> listH187a1 = new ArrayList<String>();

            listH187a1.add("");
            listH187a1.add("1-পায়েহেঁটে");
            listH187a1.add("2-বাইসাইকেল");
            listH187a1.add("3-রিক্সা/ভ্যান");
            listH187a1.add("4-গরুরগাড়ি");
            listH187a1.add("5-নৌকা");
            listH187a1.add("6-ইঞ্জিন চালিত নৌকা");
            listH187a1.add("7-মোটরসাইকেল");
            listH187a1.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH187a1.add("9-বাস");
            listH187a1.add("10-ট্রেন");
            listH187a1.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH187a1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH187a1);
            spnH187a1.setAdapter(adptrH187a1);

            spnH187a1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH187a1.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH187a1X.setVisibility(View.VISIBLE);
                            lineH187a1X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH187a1X.setVisibility(View.GONE);
                            lineH187a1X.setVisibility(View.GONE);
                            txtH187a1X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH187a1X = (LinearLayout) findViewById(R.id.secH187a1X);
            lineH187a1X = (View) findViewById(R.id.lineH187a1X);
            VlblH187a1X = (TextView) findViewById(R.id.VlblH187a1X);
            txtH187a1X = (EditText) findViewById(R.id.txtH187a1X);
            secH187a2 = (LinearLayout) findViewById(R.id.secH187a2);
            lineH187a2 = (View) findViewById(R.id.lineH187a2);
            VlblH187a2 = (TextView) findViewById(R.id.VlblH187a2);
            spnH187a2 = (Spinner) findViewById(R.id.spnH187a2);
            List<String> listH187a2 = new ArrayList<String>();

            listH187a2.add("");
            listH187a2.add("1-পায়েহেঁটে");
            listH187a2.add("2-বাইসাইকেল");
            listH187a2.add("3-রিক্সা/ভ্যান");
            listH187a2.add("4-গরুরগাড়ি");
            listH187a2.add("5-নৌকা");
            listH187a2.add("6-ইঞ্জিন চালিত নৌকা");
            listH187a2.add("7-মোটরসাইকেল");
            listH187a2.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH187a2.add("9-বাস");
            listH187a2.add("10-ট্রেন");
            listH187a2.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH187a2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH187a2);
            spnH187a2.setAdapter(adptrH187a2);

            spnH187a2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH187a2.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH187a2X.setVisibility(View.VISIBLE);
                            lineH187a2X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH187a2X.setVisibility(View.GONE);
                            lineH187a2X.setVisibility(View.GONE);
                            txtH187a2X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH187a2X = (LinearLayout) findViewById(R.id.secH187a2X);
            lineH187a2X = (View) findViewById(R.id.lineH187a2X);
            VlblH187a2X = (TextView) findViewById(R.id.VlblH187a2X);
            txtH187a2X = (EditText) findViewById(R.id.txtH187a2X);
            secH187a3 = (LinearLayout) findViewById(R.id.secH187a3);
            lineH187a3 = (View) findViewById(R.id.lineH187a3);
            VlblH187a3 = (TextView) findViewById(R.id.VlblH187a3);
            spnH187a3 = (Spinner) findViewById(R.id.spnH187a3);
            List<String> listH187a3 = new ArrayList<String>();

            listH187a3.add("");
            listH187a3.add("1-পায়েহেঁটে");
            listH187a3.add("2-বাইসাইকেল");
            listH187a3.add("3-রিক্সা/ভ্যান");
            listH187a3.add("4-গরুরগাড়ি");
            listH187a3.add("5-নৌকা");
            listH187a3.add("6-ইঞ্জিন চালিত নৌকা");
            listH187a3.add("7-মোটরসাইকেল");
            listH187a3.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH187a3.add("9-বাস");
            listH187a3.add("10-ট্রেন");
            listH187a3.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH187a3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH187a3);
            spnH187a3.setAdapter(adptrH187a3);

            spnH187a3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH187a3.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH187a3X.setVisibility(View.VISIBLE);
                            lineH187a3X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH187a3X.setVisibility(View.GONE);
                            lineH187a3X.setVisibility(View.GONE);
                            txtH187a3X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH187a3X = (LinearLayout) findViewById(R.id.secH187a3X);
            lineH187a3X = (View) findViewById(R.id.lineH187a3X);
            VlblH187a3X = (TextView) findViewById(R.id.VlblH187a3X);
            txtH187a3X = (EditText) findViewById(R.id.txtH187a3X);
            secH187a4 = (LinearLayout) findViewById(R.id.secH187a4);
            lineH187a4 = (View) findViewById(R.id.lineH187a4);
            VlblH187a4 = (TextView) findViewById(R.id.VlblH187a4);
            txtH187a4 = (EditText) findViewById(R.id.txtH187a4);
            secH188a = (LinearLayout) findViewById(R.id.secH188a);
            lineH188a = (View) findViewById(R.id.lineH188a);
            VlblH188a = (TextView) findViewById(R.id.VlblH188a);
            rdogrpH188a = (RadioGroup) findViewById(R.id.rdogrpH188a);

            rdoH188a1 = (RadioButton) findViewById(R.id.rdoH188a1);
            rdoH188a2 = (RadioButton) findViewById(R.id.rdoH188a2);
            rdogrpH188a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH188a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH188a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH188a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH188a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH188a1.setVisibility(View.GONE);
                        lineH188a1.setVisibility(View.GONE);
                        spnH188a1.setSelection(0);
                        secH188a1X.setVisibility(View.GONE);
                        lineH188a1X.setVisibility(View.GONE);
                        txtH188a1X.setText("");
                        secH188a2.setVisibility(View.GONE);
                        lineH188a2.setVisibility(View.GONE);
                        spnH188a2.setSelection(0);
                        secH188a2X.setVisibility(View.GONE);
                        lineH188a2X.setVisibility(View.GONE);
                        txtH188a2X.setText("");
                        secH188a3.setVisibility(View.GONE);
                        lineH188a3.setVisibility(View.GONE);
                        spnH188a3.setSelection(0);
                        secH1881a3X.setVisibility(View.GONE);
                        lineH1881a3X.setVisibility(View.GONE);
                        txtH1881a3X.setText("");
                        secH188a4.setVisibility(View.GONE);
                        lineH188a4.setVisibility(View.GONE);
                        txtH188a4.setText("");
                    } else {
                        secH188a1.setVisibility(View.VISIBLE);
                        lineH188a1.setVisibility(View.VISIBLE);
                     //   secH188a1X.setVisibility(View.VISIBLE);
                     //   lineH188a1X.setVisibility(View.VISIBLE);
                        secH188a2.setVisibility(View.VISIBLE);
                        lineH188a2.setVisibility(View.VISIBLE);
                     //   secH188a2X.setVisibility(View.VISIBLE);
                     //   lineH188a2X.setVisibility(View.VISIBLE);
                        secH188a3.setVisibility(View.VISIBLE);
                        lineH188a3.setVisibility(View.VISIBLE);
                     //   secH1881a3X.setVisibility(View.VISIBLE);
                    //    lineH1881a3X.setVisibility(View.VISIBLE);
                        secH188a4.setVisibility(View.VISIBLE);
                        lineH188a4.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH188a1 = (LinearLayout) findViewById(R.id.secH188a1);
            lineH188a1 = (View) findViewById(R.id.lineH188a1);
            VlblH188a1 = (TextView) findViewById(R.id.VlblH188a1);
            spnH188a1 = (Spinner) findViewById(R.id.spnH188a1);
            List<String> listH188a1 = new ArrayList<String>();

            listH188a1.add("");
            listH188a1.add("1-পায়েহেঁটে");
            listH188a1.add("2-বাইসাইকেল");
            listH188a1.add("3-রিক্সা/ভ্যান");
            listH188a1.add("4-গরুরগাড়ি");
            listH188a1.add("5-নৌকা");
            listH188a1.add("6-ইঞ্জিন চালিত নৌকা");
            listH188a1.add("7-মোটরসাইকেল");
            listH188a1.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH188a1.add("9-বাস");
            listH188a1.add("10-ট্রেন");
            listH188a1.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH188a1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH188a1);
            spnH188a1.setAdapter(adptrH188a1);

            spnH188a1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH188a1.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH188a1X.setVisibility(View.VISIBLE);
                            lineH188a1X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH188a1X.setVisibility(View.GONE);
                            lineH188a1X.setVisibility(View.GONE);
                            txtH188a1X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH188a1X = (LinearLayout) findViewById(R.id.secH188a1X);
            lineH188a1X = (View) findViewById(R.id.lineH188a1X);
            VlblH188a1X = (TextView) findViewById(R.id.VlblH188a1X);
            txtH188a1X = (EditText) findViewById(R.id.txtH188a1X);
            secH188a2 = (LinearLayout) findViewById(R.id.secH188a2);
            lineH188a2 = (View) findViewById(R.id.lineH188a2);
            VlblH188a2 = (TextView) findViewById(R.id.VlblH188a2);
            spnH188a2 = (Spinner) findViewById(R.id.spnH188a2);
            List<String> listH188a2 = new ArrayList<String>();

            listH188a2.add("");
            listH188a2.add("1-পায়েহেঁটে");
            listH188a2.add("2-বাইসাইকেল");
            listH188a2.add("3-রিক্সা/ভ্যান");
            listH188a2.add("4-গরুরগাড়ি");
            listH188a2.add("5-নৌকা");
            listH188a2.add("6-ইঞ্জিন চালিত নৌকা");
            listH188a2.add("7-মোটরসাইকেল");
            listH188a2.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH188a2.add("9-বাস");
            listH188a2.add("10-ট্রেন");
            listH188a2.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH188a2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH188a2);
            spnH188a2.setAdapter(adptrH188a2);

            spnH188a2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH188a2.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH188a2X.setVisibility(View.VISIBLE);
                            lineH188a2X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH188a2X.setVisibility(View.GONE);
                            lineH188a2X.setVisibility(View.GONE);
                            txtH188a2X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });


            secH188a2X = (LinearLayout) findViewById(R.id.secH188a2X);
            lineH188a2X = (View) findViewById(R.id.lineH188a2X);
            VlblH188a2X = (TextView) findViewById(R.id.VlblH188a2X);
            txtH188a2X = (EditText) findViewById(R.id.txtH188a2X);
            secH188a3 = (LinearLayout) findViewById(R.id.secH188a3);
            lineH188a3 = (View) findViewById(R.id.lineH188a3);
            VlblH188a3 = (TextView) findViewById(R.id.VlblH188a3);
            spnH188a3 = (Spinner) findViewById(R.id.spnH188a3);
            List<String> listH188a3 = new ArrayList<String>();

            listH188a3.add("");
            listH188a3.add("1-পায়েহেঁটে");
            listH188a3.add("2-বাইসাইকেল");
            listH188a3.add("3-রিক্সা/ভ্যান");
            listH188a3.add("4-গরুরগাড়ি");
            listH188a3.add("5-নৌকা");
            listH188a3.add("6-ইঞ্জিন চালিত নৌকা");
            listH188a3.add("7-মোটরসাইকেল");
            listH188a3.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH188a3.add("9-বাস");
            listH188a3.add("10-ট্রেন");
            listH188a3.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH188a3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH188a3);
            spnH188a3.setAdapter(adptrH188a3);

            spnH188a3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH188a3.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH1881a3X.setVisibility(View.VISIBLE);
                            lineH1881a3X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH1881a3X.setVisibility(View.GONE);
                            lineH1881a3X.setVisibility(View.GONE);
                            txtH1881a3X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });


            secH1881a3X = (LinearLayout) findViewById(R.id.secH1881a3X);
            lineH1881a3X = (View) findViewById(R.id.lineH1881a3X);
            VlblH1881a3X = (TextView) findViewById(R.id.VlblH1881a3X);
            txtH1881a3X = (EditText) findViewById(R.id.txtH1881a3X);
            secH188a4 = (LinearLayout) findViewById(R.id.secH188a4);
            lineH188a4 = (View) findViewById(R.id.lineH188a4);
            VlblH188a4 = (TextView) findViewById(R.id.VlblH188a4);
            txtH188a4 = (EditText) findViewById(R.id.txtH188a4);
            secH189a = (LinearLayout) findViewById(R.id.secH189a);
            lineH189a = (View) findViewById(R.id.lineH189a);
            VlblH189a = (TextView) findViewById(R.id.VlblH189a);
            rdogrpH189a = (RadioGroup) findViewById(R.id.rdogrpH189a);

            rdoH189a1 = (RadioButton) findViewById(R.id.rdoH189a1);
            rdoH189a2 = (RadioButton) findViewById(R.id.rdoH189a2);
            rdogrpH189a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH189a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH189a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH189a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH189a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH189a1.setVisibility(View.GONE);
                        lineH189a1.setVisibility(View.GONE);
                        spnH189a1.setSelection(0);
                        secH189a1X.setVisibility(View.GONE);
                        lineH189a1X.setVisibility(View.GONE);
                        txtH189a1X.setText("");
                        secH189a2.setVisibility(View.GONE);
                        lineH189a2.setVisibility(View.GONE);
                        spnH189a2.setSelection(0);
                        secH189a2X.setVisibility(View.GONE);
                        lineH189a2X.setVisibility(View.GONE);
                        txtH189a2X.setText("");
                        secH189a3.setVisibility(View.GONE);
                        lineH189a3.setVisibility(View.GONE);
                        spnH189a3.setSelection(0);
                        secH189a3X.setVisibility(View.GONE);
                        lineH189a3X.setVisibility(View.GONE);
                        txtH189a3X.setText("");
                        secH189a4.setVisibility(View.GONE);
                        lineH189a4.setVisibility(View.GONE);
                        txtH189a4.setText("");
                    } else {
                        secH189a1.setVisibility(View.VISIBLE);
                        lineH189a1.setVisibility(View.VISIBLE);
                     //   secH189a1X.setVisibility(View.VISIBLE);
                     //   lineH189a1X.setVisibility(View.VISIBLE);
                        secH189a2.setVisibility(View.VISIBLE);
                        lineH189a2.setVisibility(View.VISIBLE);
                     //   secH189a2X.setVisibility(View.VISIBLE);
                     //   lineH189a2X.setVisibility(View.VISIBLE);
                        secH189a3.setVisibility(View.VISIBLE);
                        lineH189a3.setVisibility(View.VISIBLE);
                     //   secH189a3X.setVisibility(View.VISIBLE);
                     //   lineH189a3X.setVisibility(View.VISIBLE);
                        secH189a4.setVisibility(View.VISIBLE);
                        lineH189a4.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH189a1 = (LinearLayout) findViewById(R.id.secH189a1);
            lineH189a1 = (View) findViewById(R.id.lineH189a1);
            VlblH189a1 = (TextView) findViewById(R.id.VlblH189a1);
            spnH189a1 = (Spinner) findViewById(R.id.spnH189a1);
            List<String> listH189a1 = new ArrayList<String>();

            listH189a1.add("");
            listH189a1.add("1-পায়েহেঁটে");
            listH189a1.add("2-বাইসাইকেল");
            listH189a1.add("3-রিক্সা/ভ্যান");
            listH189a1.add("4-গরুরগাড়ি");
            listH189a1.add("5-নৌকা");
            listH189a1.add("6-ইঞ্জিন চালিত নৌকা");
            listH189a1.add("7-মোটরসাইকেল");
            listH189a1.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH189a1.add("9-বাস");
            listH189a1.add("10-ট্রেন");
            listH189a1.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH189a1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH189a1);
            spnH189a1.setAdapter(adptrH189a1);

            spnH189a1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH188a1.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH189a1X.setVisibility(View.VISIBLE);
                            lineH189a1X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH189a1X.setVisibility(View.GONE);
                            lineH189a1X.setVisibility(View.GONE);
                            txtH189a1X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH189a1X = (LinearLayout) findViewById(R.id.secH189a1X);
            lineH189a1X = (View) findViewById(R.id.lineH189a1X);
            VlblH189a1X = (TextView) findViewById(R.id.VlblH189a1X);
            txtH189a1X = (EditText) findViewById(R.id.txtH189a1X);
            secH189a2 = (LinearLayout) findViewById(R.id.secH189a2);
            lineH189a2 = (View) findViewById(R.id.lineH189a2);
            VlblH189a2 = (TextView) findViewById(R.id.VlblH189a2);
            spnH189a2 = (Spinner) findViewById(R.id.spnH189a2);
            List<String> listH189a2 = new ArrayList<String>();

            listH189a2.add("");
            listH189a2.add("1-পায়েহেঁটে");
            listH189a2.add("2-বাইসাইকেল");
            listH189a2.add("3-রিক্সা/ভ্যান");
            listH189a2.add("4-গরুরগাড়ি");
            listH189a2.add("5-নৌকা");
            listH189a2.add("6-ইঞ্জিন চালিত নৌকা");
            listH189a2.add("7-মোটরসাইকেল");
            listH189a2.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH189a2.add("9-বাস");
            listH189a2.add("10-ট্রেন");
            listH189a2.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH189a2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH189a2);
            spnH189a2.setAdapter(adptrH189a2);

            spnH189a2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH188a2.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH189a2X.setVisibility(View.VISIBLE);
                            lineH189a2X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH189a2X.setVisibility(View.GONE);
                            lineH189a2X.setVisibility(View.GONE);
                            txtH189a2X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH189a2X = (LinearLayout) findViewById(R.id.secH189a2X);
            lineH189a2X = (View) findViewById(R.id.lineH189a2X);
            VlblH189a2X = (TextView) findViewById(R.id.VlblH189a2X);
            txtH189a2X = (EditText) findViewById(R.id.txtH189a2X);
            secH189a3 = (LinearLayout) findViewById(R.id.secH189a3);
            lineH189a3 = (View) findViewById(R.id.lineH189a3);
            VlblH189a3 = (TextView) findViewById(R.id.VlblH189a3);
            spnH189a3 = (Spinner) findViewById(R.id.spnH189a3);
            List<String> listH189a3 = new ArrayList<String>();

            listH189a3.add("");
            listH189a3.add("1-পায়েহেঁটে");
            listH189a3.add("2-বাইসাইকেল");
            listH189a3.add("3-রিক্সা/ভ্যান");
            listH189a3.add("4-গরুরগাড়ি");
            listH189a3.add("5-নৌকা");
            listH189a3.add("6-ইঞ্জিন চালিত নৌকা");
            listH189a3.add("7-মোটরসাইকেল");
            listH189a3.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH189a3.add("9-বাস");
            listH189a3.add("10-ট্রেন");
            listH189a3.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH189a3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH189a3);
            spnH189a3.setAdapter(adptrH189a3);

            spnH189a3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH188a3.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH189a3X.setVisibility(View.VISIBLE);
                            lineH189a3X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH189a3X.setVisibility(View.GONE);
                            lineH189a3X.setVisibility(View.GONE);
                            txtH189a3X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH189a3X = (LinearLayout) findViewById(R.id.secH189a3X);
            lineH189a3X = (View) findViewById(R.id.lineH189a3X);
            VlblH189a3X = (TextView) findViewById(R.id.VlblH189a3X);
            txtH189a3X = (EditText) findViewById(R.id.txtH189a3X);
            secH189a4 = (LinearLayout) findViewById(R.id.secH189a4);
            lineH189a4 = (View) findViewById(R.id.lineH189a4);
            VlblH189a4 = (TextView) findViewById(R.id.VlblH189a4);
            txtH189a4 = (EditText) findViewById(R.id.txtH189a4);
            secH1810a = (LinearLayout) findViewById(R.id.secH1810a);
            lineH1810a = (View) findViewById(R.id.lineH1810a);
            VlblH1810a = (TextView) findViewById(R.id.VlblH1810a);
            rdogrpH1810a = (RadioGroup) findViewById(R.id.rdogrpH1810a);

            rdoH1810a1 = (RadioButton) findViewById(R.id.rdoH1810a1);
            rdoH1810a2 = (RadioButton) findViewById(R.id.rdoH1810a2);
            rdogrpH1810a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH1810a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH1810a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH1810a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH1810a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH1810a1.setVisibility(View.GONE);
                        lineH1810a1.setVisibility(View.GONE);
                        spnH1810a1.setSelection(0);
                        secH1810a1X.setVisibility(View.GONE);
                        lineH1810a1X.setVisibility(View.GONE);
                        txtH1810a1X.setText("");
                        secH1810a2.setVisibility(View.GONE);
                        lineH1810a2.setVisibility(View.GONE);
                        spnH1810a2.setSelection(0);
                        secH1810a2X.setVisibility(View.GONE);
                        lineH1810a2X.setVisibility(View.GONE);
                        txtH1810a2X.setText("");
                        secH1810a3.setVisibility(View.GONE);
                        lineH1810a3.setVisibility(View.GONE);
                        spnH1810a3.setSelection(0);
                        secH1810a3X.setVisibility(View.GONE);
                        lineH1810a3X.setVisibility(View.GONE);
                        txtH1810a3X.setText("");
                        secH1810a4.setVisibility(View.GONE);
                        lineH1810a4.setVisibility(View.GONE);
                        txtH1810a4.setText("");
                    } else {
                        secH1810a1.setVisibility(View.VISIBLE);
                        lineH1810a1.setVisibility(View.VISIBLE);
                     //   secH1810a1X.setVisibility(View.VISIBLE);
                     //   lineH1810a1X.setVisibility(View.VISIBLE);
                        secH1810a2.setVisibility(View.VISIBLE);
                        lineH1810a2.setVisibility(View.VISIBLE);
                     //   secH1810a2X.setVisibility(View.VISIBLE);
                     //   lineH1810a2X.setVisibility(View.VISIBLE);
                        secH1810a3.setVisibility(View.VISIBLE);
                        lineH1810a3.setVisibility(View.VISIBLE);
                     //   secH1810a3X.setVisibility(View.VISIBLE);
                     //   lineH1810a3X.setVisibility(View.VISIBLE);
                        secH1810a4.setVisibility(View.VISIBLE);
                        lineH1810a4.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH1810a1 = (LinearLayout) findViewById(R.id.secH1810a1);
            lineH1810a1 = (View) findViewById(R.id.lineH1810a1);
            VlblH1810a1 = (TextView) findViewById(R.id.VlblH1810a1);
            spnH1810a1 = (Spinner) findViewById(R.id.spnH1810a1);
            List<String> listH1810a1 = new ArrayList<String>();

            listH1810a1.add("");
            listH1810a1.add("1-পায়েহেঁটে");
            listH1810a1.add("2-বাইসাইকেল");
            listH1810a1.add("3-রিক্সা/ভ্যান");
            listH1810a1.add("4-গরুরগাড়ি");
            listH1810a1.add("5-নৌকা");
            listH1810a1.add("6-ইঞ্জিন চালিত নৌকা");
            listH1810a1.add("7-মোটরসাইকেল");
            listH1810a1.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH1810a1.add("9-বাস");
            listH1810a1.add("10-ট্রেন");
            listH1810a1.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH1810a1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH1810a1);
            spnH1810a1.setAdapter(adptrH1810a1);

            spnH1810a1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH1810a1.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH1810a1X.setVisibility(View.VISIBLE);
                            lineH1810a1X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH1810a1X.setVisibility(View.GONE);
                            lineH1810a1X.setVisibility(View.GONE);
                            txtH1810a1X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH1810a1X = (LinearLayout) findViewById(R.id.secH1810a1X);
            lineH1810a1X = (View) findViewById(R.id.lineH1810a1X);
            VlblH1810a1X = (TextView) findViewById(R.id.VlblH1810a1X);
            txtH1810a1X = (EditText) findViewById(R.id.txtH1810a1X);
            secH1810a2 = (LinearLayout) findViewById(R.id.secH1810a2);
            lineH1810a2 = (View) findViewById(R.id.lineH1810a2);
            VlblH1810a2 = (TextView) findViewById(R.id.VlblH1810a2);
            spnH1810a2 = (Spinner) findViewById(R.id.spnH1810a2);
            List<String> listH1810a2 = new ArrayList<String>();

            listH1810a2.add("");
            listH1810a2.add("1-পায়েহেঁটে");
            listH1810a2.add("2-বাইসাইকেল");
            listH1810a2.add("3-রিক্সা/ভ্যান");
            listH1810a2.add("4-গরুরগাড়ি");
            listH1810a2.add("5-নৌকা");
            listH1810a2.add("6-ইঞ্জিন চালিত নৌকা");
            listH1810a2.add("7-মোটরসাইকেল");
            listH1810a2.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH1810a2.add("9-বাস");
            listH1810a2.add("10-ট্রেন");
            listH1810a2.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH1810a2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH1810a2);
            spnH1810a2.setAdapter(adptrH1810a2);

            spnH1810a2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH1810a2.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH1810a2X.setVisibility(View.VISIBLE);
                            lineH1810a2X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH1810a2X.setVisibility(View.GONE);
                            lineH1810a2X.setVisibility(View.GONE);
                            txtH1810a2X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH1810a2X = (LinearLayout) findViewById(R.id.secH1810a2X);
            lineH1810a2X = (View) findViewById(R.id.lineH1810a2X);
            VlblH1810a2X = (TextView) findViewById(R.id.VlblH1810a2X);
            txtH1810a2X = (EditText) findViewById(R.id.txtH1810a2X);
            secH1810a3 = (LinearLayout) findViewById(R.id.secH1810a3);
            lineH1810a3 = (View) findViewById(R.id.lineH1810a3);
            VlblH1810a3 = (TextView) findViewById(R.id.VlblH1810a3);
            spnH1810a3 = (Spinner) findViewById(R.id.spnH1810a3);
            List<String> listH1810a3 = new ArrayList<String>();

            listH1810a3.add("");
            listH1810a3.add("1-পায়েহেঁটে");
            listH1810a3.add("2-বাইসাইকেল");
            listH1810a3.add("3-রিক্সা/ভ্যান");
            listH1810a3.add("4-গরুরগাড়ি");
            listH1810a3.add("5-নৌকা");
            listH1810a3.add("6-ইঞ্জিন চালিত নৌকা");
            listH1810a3.add("7-মোটরসাইকেল");
            listH1810a3.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH1810a3.add("9-বাস");
            listH1810a3.add("10-ট্রেন");
            listH1810a3.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH1810a3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH1810a3);
            spnH1810a3.setAdapter(adptrH1810a3);

            spnH1810a3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH1810a3.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH1810a3X.setVisibility(View.VISIBLE);
                            lineH1810a3X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH1810a3X.setVisibility(View.GONE);
                            lineH1810a3X.setVisibility(View.GONE);
                            txtH1810a3X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH1810a3X = (LinearLayout) findViewById(R.id.secH1810a3X);
            lineH1810a3X = (View) findViewById(R.id.lineH1810a3X);
            VlblH1810a3X = (TextView) findViewById(R.id.VlblH1810a3X);
            txtH1810a3X = (EditText) findViewById(R.id.txtH1810a3X);
            secH1810a4 = (LinearLayout) findViewById(R.id.secH1810a4);
            lineH1810a4 = (View) findViewById(R.id.lineH1810a4);
            VlblH1810a4 = (TextView) findViewById(R.id.VlblH1810a4);
            txtH1810a4 = (EditText) findViewById(R.id.txtH1810a4);
            secH1811a = (LinearLayout) findViewById(R.id.secH1811a);
            lineH1811a = (View) findViewById(R.id.lineH1811a);
            VlblH1811a = (TextView) findViewById(R.id.VlblH1811a);
            rdogrpH1811a = (RadioGroup) findViewById(R.id.rdogrpH1811a);

            rdoH1811a1 = (RadioButton) findViewById(R.id.rdoH1811a1);
            rdoH1811a2 = (RadioButton) findViewById(R.id.rdoH1811a2);
            rdogrpH1811a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH1811a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH1811a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH1811a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH1811a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH1811a1.setVisibility(View.GONE);
                        lineH1811a1.setVisibility(View.GONE);
                        spnH1811a1.setSelection(0);
                        secH1811a1X.setVisibility(View.GONE);
                        lineH1811a1X.setVisibility(View.GONE);
                        txtH1811a1X.setText("");
                        secH1811a2.setVisibility(View.GONE);
                        lineH1811a2.setVisibility(View.GONE);
                        spnH1811a2.setSelection(0);
                        secH1811a2X.setVisibility(View.GONE);
                        lineH1811a2X.setVisibility(View.GONE);
                        txtH1811a2X.setText("");
                        secH1811a3.setVisibility(View.GONE);
                        lineH1811a3.setVisibility(View.GONE);
                        spnH1811a3.setSelection(0);
                        secH1811a3X.setVisibility(View.GONE);
                        lineH1811a3X.setVisibility(View.GONE);
                        txtH1811a3X.setText("");
                        secH1811a4.setVisibility(View.GONE);
                        lineH1811a4.setVisibility(View.GONE);
                        txtH1811a4.setText("");
                    } else {
                        secH1811a1.setVisibility(View.VISIBLE);
                        lineH1811a1.setVisibility(View.VISIBLE);
                      //  secH1811a1X.setVisibility(View.VISIBLE);
                      //  lineH1811a1X.setVisibility(View.VISIBLE);
                        secH1811a2.setVisibility(View.VISIBLE);
                        lineH1811a2.setVisibility(View.VISIBLE);
                      //  secH1811a2X.setVisibility(View.VISIBLE);
                     //   lineH1811a2X.setVisibility(View.VISIBLE);
                        secH1811a3.setVisibility(View.VISIBLE);
                        lineH1811a3.setVisibility(View.VISIBLE);
                     //   secH1811a3X.setVisibility(View.VISIBLE);
                     //   lineH1811a3X.setVisibility(View.VISIBLE);
                        secH1811a4.setVisibility(View.VISIBLE);
                        lineH1811a4.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH1811a1 = (LinearLayout) findViewById(R.id.secH1811a1);
            lineH1811a1 = (View) findViewById(R.id.lineH1811a1);
            VlblH1811a1 = (TextView) findViewById(R.id.VlblH1811a1);
            spnH1811a1 = (Spinner) findViewById(R.id.spnH1811a1);
            List<String> listH1811a1 = new ArrayList<String>();

            listH1811a1.add("");
            listH1811a1.add("1-পায়েহেঁটে");
            listH1811a1.add("2-বাইসাইকেল");
            listH1811a1.add("3-রিক্সা/ভ্যান");
            listH1811a1.add("4-গরুরগাড়ি");
            listH1811a1.add("5-নৌকা");
            listH1811a1.add("6-ইঞ্জিন চালিত নৌকা");
            listH1811a1.add("7-মোটরসাইকেল");
            listH1811a1.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH1811a1.add("9-বাস");
            listH1811a1.add("10-ট্রেন");
            listH1811a1.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH1811a1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH1811a1);
            spnH1811a1.setAdapter(adptrH1811a1);

            spnH1811a1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH1811a1.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH1811a1X.setVisibility(View.VISIBLE);
                            lineH1811a1X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH1811a1X.setVisibility(View.GONE);
                            lineH1811a1X.setVisibility(View.GONE);
                            txtH1811a1X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH1811a1X = (LinearLayout) findViewById(R.id.secH1811a1X);
            lineH1811a1X = (View) findViewById(R.id.lineH1811a1X);
            VlblH1811a1X = (TextView) findViewById(R.id.VlblH1811a1X);
            txtH1811a1X = (EditText) findViewById(R.id.txtH1811a1X);
            secH1811a2 = (LinearLayout) findViewById(R.id.secH1811a2);
            lineH1811a2 = (View) findViewById(R.id.lineH1811a2);
            VlblH1811a2 = (TextView) findViewById(R.id.VlblH1811a2);
            spnH1811a2 = (Spinner) findViewById(R.id.spnH1811a2);
            List<String> listH1811a2 = new ArrayList<String>();

            listH1811a2.add("");
            listH1811a2.add("1-পায়েহেঁটে");
            listH1811a2.add("2-বাইসাইকেল");
            listH1811a2.add("3-রিক্সা/ভ্যান");
            listH1811a2.add("4-গরুরগাড়ি");
            listH1811a2.add("5-নৌকা");
            listH1811a2.add("6-ইঞ্জিন চালিত নৌকা");
            listH1811a2.add("7-মোটরসাইকেল");
            listH1811a2.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH1811a2.add("9-বাস");
            listH1811a2.add("10-ট্রেন");
            listH1811a2.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH1811a2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH1811a2);
            spnH1811a2.setAdapter(adptrH1811a2);

            spnH1811a2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH1811a2.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH1811a2X.setVisibility(View.VISIBLE);
                            lineH1811a2X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH1811a2X.setVisibility(View.GONE);
                            lineH1811a2X.setVisibility(View.GONE);
                            txtH1811a2X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH1811a2X = (LinearLayout) findViewById(R.id.secH1811a2X);
            lineH1811a2X = (View) findViewById(R.id.lineH1811a2X);
            VlblH1811a2X = (TextView) findViewById(R.id.VlblH1811a2X);
            txtH1811a2X = (EditText) findViewById(R.id.txtH1811a2X);
            secH1811a3 = (LinearLayout) findViewById(R.id.secH1811a3);
            lineH1811a3 = (View) findViewById(R.id.lineH1811a3);
            VlblH1811a3 = (TextView) findViewById(R.id.VlblH1811a3);
            spnH1811a3 = (Spinner) findViewById(R.id.spnH1811a3);
            List<String> listH1811a3 = new ArrayList<String>();

            listH1811a3.add("");
            listH1811a3.add("1-পায়েহেঁটে");
            listH1811a3.add("2-বাইসাইকেল");
            listH1811a3.add("3-রিক্সা/ভ্যান");
            listH1811a3.add("4-গরুরগাড়ি");
            listH1811a3.add("5-নৌকা");
            listH1811a3.add("6-ইঞ্জিন চালিত নৌকা");
            listH1811a3.add("7-মোটরসাইকেল");
            listH1811a3.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH1811a3.add("9-বাস");
            listH1811a3.add("10-ট্রেন");
            listH1811a3.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH1811a3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH1811a3);
            spnH1811a3.setAdapter(adptrH1811a3);

            spnH1811a3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH1811a3.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH1811a3X.setVisibility(View.VISIBLE);
                            lineH1811a3X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH1811a3X.setVisibility(View.GONE);
                            lineH1811a3X.setVisibility(View.GONE);
                            txtH1811a3X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH1811a3X = (LinearLayout) findViewById(R.id.secH1811a3X);
            lineH1811a3X = (View) findViewById(R.id.lineH1811a3X);
            VlblH1811a3X = (TextView) findViewById(R.id.VlblH1811a3X);
            txtH1811a3X = (EditText) findViewById(R.id.txtH1811a3X);
            secH1811a4 = (LinearLayout) findViewById(R.id.secH1811a4);
            lineH1811a4 = (View) findViewById(R.id.lineH1811a4);
            VlblH1811a4 = (TextView) findViewById(R.id.VlblH1811a4);
            txtH1811a4 = (EditText) findViewById(R.id.txtH1811a4);
            secH1812a = (LinearLayout) findViewById(R.id.secH1812a);
            lineH1812a = (View) findViewById(R.id.lineH1812a);
            VlblH1812a = (TextView) findViewById(R.id.VlblH1812a);
            rdogrpH1812a = (RadioGroup) findViewById(R.id.rdogrpH1812a);

            rdoH1812a1 = (RadioButton) findViewById(R.id.rdoH1812a1);
            rdoH1812a2 = (RadioButton) findViewById(R.id.rdoH1812a2);

            rdogrpH1812a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH1812a = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH1812a.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH1812a.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH1812a[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH1812a1.setVisibility(View.GONE);
                        lineH1812a1.setVisibility(View.GONE);
                        spnH1812a1.setSelection(0);
                        secH1812a1X.setVisibility(View.GONE);
                        lineH1812a1X.setVisibility(View.GONE);
                        txtH1812a1X.setText("");
                        secH1812a2.setVisibility(View.GONE);
                        lineH1812a2.setVisibility(View.GONE);
                        spnH1812a2.setSelection(0);
                        secH1812a2X.setVisibility(View.GONE);
                        lineH1812a2X.setVisibility(View.GONE);
                        txtH1812a2X.setText("");
                        secH1812a3.setVisibility(View.GONE);
                        lineH1812a3.setVisibility(View.GONE);
                        spnH1812a3.setSelection(0);
                        secH1812a3X.setVisibility(View.GONE);
                        lineH1812a3X.setVisibility(View.GONE);
                        txtH1812a3X.setText("");
                        secH1812a4.setVisibility(View.GONE);
                        lineH1812a4.setVisibility(View.GONE);
                        txtH1812a4.setText("");
                    } else {
                        secH1812a1.setVisibility(View.VISIBLE);
                        lineH1812a1.setVisibility(View.VISIBLE);
                      //  secH1812a1X.setVisibility(View.VISIBLE);
                      //  lineH1812a1X.setVisibility(View.VISIBLE);
                        secH1812a2.setVisibility(View.VISIBLE);
                        lineH1812a2.setVisibility(View.VISIBLE);
                      //  secH1812a2X.setVisibility(View.VISIBLE);
                     //   lineH1812a2X.setVisibility(View.VISIBLE);
                        secH1812a3.setVisibility(View.VISIBLE);
                        lineH1812a3.setVisibility(View.VISIBLE);
                     //   secH1812a3X.setVisibility(View.VISIBLE);
                     //   lineH1812a3X.setVisibility(View.VISIBLE);
                        secH1812a4.setVisibility(View.VISIBLE);
                        lineH1812a4.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH1812a1 = (LinearLayout) findViewById(R.id.secH1812a1);
            lineH1812a1 = (View) findViewById(R.id.lineH1812a1);
            VlblH1812a1 = (TextView) findViewById(R.id.VlblH1812a1);
            spnH1812a1 = (Spinner) findViewById(R.id.spnH1812a1);
            List<String> listH1812a1 = new ArrayList<String>();

            listH1812a1.add("");
            listH1812a1.add("1-পায়েহেঁটে");
            listH1812a1.add("2-বাইসাইকেল");
            listH1812a1.add("3-রিক্সা/ভ্যান");
            listH1812a1.add("4-গরুরগাড়ি");
            listH1812a1.add("5-নৌকা");
            listH1812a1.add("6-ইঞ্জিন চালিত নৌকা");
            listH1812a1.add("7-মোটরসাইকেল");
            listH1812a1.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH1812a1.add("9-বাস");
            listH1812a1.add("10-ট্রেন");
            listH1812a1.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH1812a1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH1812a1);
            spnH1812a1.setAdapter(adptrH1812a1);

            spnH1812a1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH1812a1.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH1812a1X.setVisibility(View.VISIBLE);
                            lineH1812a1X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH1812a1X.setVisibility(View.GONE);
                            lineH1812a1X.setVisibility(View.GONE);
                            txtH1812a1X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });

            secH1812a1X = (LinearLayout) findViewById(R.id.secH1812a1X);
            lineH1812a1X = (View) findViewById(R.id.lineH1812a1X);
            VlblH1812a1X = (TextView) findViewById(R.id.VlblH1812a1X);
            txtH1812a1X = (EditText) findViewById(R.id.txtH1812a1X);
            secH1812a2 = (LinearLayout) findViewById(R.id.secH1812a2);
            lineH1812a2 = (View) findViewById(R.id.lineH1812a2);
            VlblH1812a2 = (TextView) findViewById(R.id.VlblH1812a2);
            spnH1812a2 = (Spinner) findViewById(R.id.spnH1812a2);
            List<String> listH1812a2 = new ArrayList<String>();

            listH1812a2.add("");
            listH1812a2.add("1-পায়েহেঁটে ");
            listH1812a2.add("2-বাইসাইকেল");
            listH1812a2.add("3-রিক্সা/ভ্যান");
            listH1812a2.add("4-গরুরগাড়ি");
            listH1812a2.add("5-নৌকা");
            listH1812a2.add("6-ইঞ্জিন চালিত নৌকা");
            listH1812a2.add("7-মোটরসাইকেল");
            listH1812a2.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH1812a2.add("9-বাস");
            listH1812a2.add("10-ট্রেন");
            listH1812a2.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH1812a2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH1812a2);
            spnH1812a2.setAdapter(adptrH1812a2);

            spnH1812a2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH1812a2.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH1812a2X.setVisibility(View.VISIBLE);
                            lineH1812a2X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH1812a2X.setVisibility(View.GONE);
                            lineH1812a2X.setVisibility(View.GONE);
                            txtH1812a2X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });


            secH1812a2X = (LinearLayout) findViewById(R.id.secH1812a2X);
            lineH1812a2X = (View) findViewById(R.id.lineH1812a2X);
            VlblH1812a2X = (TextView) findViewById(R.id.VlblH1812a2X);
            txtH1812a2X = (EditText) findViewById(R.id.txtH1812a2X);
            secH1812a3 = (LinearLayout) findViewById(R.id.secH1812a3);
            lineH1812a3 = (View) findViewById(R.id.lineH1812a3);
            VlblH1812a3 = (TextView) findViewById(R.id.VlblH1812a3);
            spnH1812a3 = (Spinner) findViewById(R.id.spnH1812a3);
            List<String> listH1812a3 = new ArrayList<String>();

            listH1812a3.add("");
            listH1812a3.add("1-পায়েহেঁটে");
            listH1812a3.add("2-বাইসাইকেল");
            listH1812a3.add("3-রিক্সা/ভ্যান");
            listH1812a3.add("4-গরুরগাড়ি");
            listH1812a3.add("5-নৌকা");
            listH1812a3.add("6-ইঞ্জিন চালিত নৌকা");
            listH1812a3.add("7-মোটরসাইকেল");
            listH1812a3.add("8-টেম্পু/বেবিটেক্সি/নসিমন");
            listH1812a3.add("9-বাস");
            listH1812a3.add("10-ট্রেন");
            listH1812a3.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH1812a3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH1812a3);
            spnH1812a3.setAdapter(adptrH1812a3);

            spnH1812a3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
                {
                    try
                    {
                        if(Connection.SelectedSpinnerValue(spnH1812a3.getSelectedItem().toString(), "-").equals("11"))
                        {
                            secH1812a3X.setVisibility(View.VISIBLE);
                            lineH1812a3X.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            secH1812a3X.setVisibility(View.GONE);
                            lineH1812a3X.setVisibility(View.GONE);
                            txtH1812a3X.setText(null);
                        }
                    }
                    catch(Exception e)
                    {

                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });


            secH1812a3X = (LinearLayout) findViewById(R.id.secH1812a3X);
            lineH1812a3X = (View) findViewById(R.id.lineH1812a3X);
            VlblH1812a3X = (TextView) findViewById(R.id.VlblH1812a3X);
            txtH1812a3X = (EditText) findViewById(R.id.txtH1812a3X);
            secH1812a4 = (LinearLayout) findViewById(R.id.secH1812a4);
            lineH1812a4 = (View) findViewById(R.id.lineH1812a4);
            VlblH1812a4 = (TextView) findViewById(R.id.VlblH1812a4);
            txtH1812a4 = (EditText) findViewById(R.id.txtH1812a4);

            txtRnd.setText(RND);
            txtSuchanaID.setText(SUCHANAID);
            txtRnd.setEnabled(false);
            txtSuchanaID.setEnabled(false);

            lblNext= (TextView) findViewById(R.id.lblNext);
            lblNext.setEnabled(false);
            cmdForward.setEnabled(false);

            DataSearch(RND,SUCHANAID);

            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(Careseek.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(Careseek.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: উপকারভোগী সদস্য আইডি সুচনা  নম্বর অনুসারে.");
                txtSuchanaID.requestFocus();
                return;
            } else if (!rdoH181a1.isChecked() & !rdoH181a2.isChecked() & secH181a.isShown()) {
                Connection.MessageBox(Careseek.this, "Select anyone options from (আপনারবাড়ির কোনো সদস্য কি সাস্থ্য কেন্দ্র/হাসপাতাল যান).");
                rdoH181a1.requestFocus();
                return;
            } else if (spnH181a1.getSelectedItemPosition() == 0 & secH181a1.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: প্রথম বাহন.");
                spnH181a1.requestFocus();
                return;
            }


            else if (txtH181a1X.getText().toString().length() == 0 & secH181a1X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH181a1X.requestFocus();
                return;
            } else if (spnH181a2.getSelectedItemPosition() == 0 & secH181a2.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: দ্বিতীয় বাহন.");
                spnH181a2.requestFocus();
                return;
            } else if (txtH181a2X.getText().toString().length() == 0 & secH181a2X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH181a2X.requestFocus();
                return;
            } else if (spnH181a3.getSelectedItemPosition() == 0 & secH181a3.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: তৃতীয় বাহন.");
                spnH181a3.requestFocus();
                return;
            } else if (txtH181a3X.getText().toString().length() == 0 & secH181a3X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH181a3X.requestFocus();
                return;
            } else if (txtH181a4.getText().toString().length() == 0 & secH181a4.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: দূরত্ব KM.");
                txtH181a4.requestFocus();
                return;
            } else if (Integer.valueOf(txtH181a4.getText().toString().length() == 0 ? "0" : txtH181a4.getText().toString()) < 0 || Integer.valueOf(txtH181a4.getText().toString().length() == 0 ? "999" : txtH181a4.getText().toString()) > 999) {
                Connection.MessageBox(Careseek.this, "Value should be between 0 and 999(দূরত্ব KM).");
                txtH181a4.requestFocus();
                return;
            } else if (!rdoH182a1.isChecked() & !rdoH182a2.isChecked() & secH182a.isShown()) {
                Connection.MessageBox(Careseek.this, "Select anyone options from (আপনারবাড়ির কোনো সদস্য কি স্থানীয় দোকান যান).");
                rdoH182a1.requestFocus();
                return;
            } else if (spnH182a1.getSelectedItemPosition() == 0 & secH182a1.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: প্রথম বাহন.");
                spnH182a1.requestFocus();
                return;
            } else if (txtH182a1X.getText().toString().length() == 0 & secH182a1X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH182a1X.requestFocus();
                return;
            } else if (spnH182a2.getSelectedItemPosition() == 0 & secH182a2.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: দ্বিতীয় বাহন.");
                spnH182a2.requestFocus();
                return;
            } else if (txtH182a2X.getText().toString().length() == 0 & secH182a2X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH182a2X.requestFocus();
                return;
            } else if (spnH182a3.getSelectedItemPosition() == 0 & secH182a3.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: তৃতীয় বাহন.");
                spnH182a3.requestFocus();
                return;
            } else if (txtH182a3X.getText().toString().length() == 0 & secH182a3X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH182a3X.requestFocus();
                return;
            } else if (txtH182a4.getText().toString().length() == 0 & secH182a4.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: দূরত্ব KM.");
                txtH182a4.requestFocus();
                return;
            } else if (Integer.valueOf(txtH182a4.getText().toString().length() == 0 ? "0" : txtH182a4.getText().toString()) < 0 || Integer.valueOf(txtH182a4.getText().toString().length() == 0 ? "999" : txtH182a4.getText().toString()) > 999) {
                Connection.MessageBox(Careseek.this, "Value should be between 0 and 999(দূরত্ব KM).");
                txtH182a4.requestFocus();
                return;
            } else if (!rdoH183a1.isChecked() & !rdoH183a2.isChecked() & secH183a.isShown()) {
                Connection.MessageBox(Careseek.this, "Select anyone options from (আপনারবাড়ির কোনো সদস্য কি সাপ্তাহিক হাট/বাজার যান).");
                rdoH183a1.requestFocus();
                return;
            } else if (spnH183a1.getSelectedItemPosition() == 0 & secH183a1.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: প্রথম বাহন.");
                spnH183a1.requestFocus();
                return;
            } else if (txtH183a1X.getText().toString().length() == 0 & secH183a1X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH183a1X.requestFocus();
                return;
            } else if (spnH183a2.getSelectedItemPosition() == 0 & secH183a2.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: দ্বিতীয় বাহন.");
                spnH183a2.requestFocus();
                return;
            } else if (txtH183a2X.getText().toString().length() == 0 & secH183a2X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH183a2X.requestFocus();
                return;
            } else if (spnH183a3.getSelectedItemPosition() == 0 & secH183a3.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: তৃতীয় বাহন.");
                spnH183a3.requestFocus();
                return;
            } else if (txtH183a3X.getText().toString().length() == 0 & secH183a3X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH183a3X.requestFocus();
                return;
            } else if (txtH183a4.getText().toString().length() == 0 & secH183a4.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: দূরত্ব KM.");
                txtH183a4.requestFocus();
                return;
            } else if (Integer.valueOf(txtH183a4.getText().toString().length() == 0 ? "0" : txtH183a4.getText().toString()) < 0 || Integer.valueOf(txtH183a4.getText().toString().length() == 0 ? "999" : txtH183a4.getText().toString()) > 999) {
                Connection.MessageBox(Careseek.this, "Value should be between 0 and 999(দূরত্ব KM).");
                txtH183a4.requestFocus();
                return;
            } else if (!rdoH184a1.isChecked() & !rdoH184a2.isChecked() & secH184a.isShown()) {
                Connection.MessageBox(Careseek.this, "Select anyone options from (আপনারবাড়ির কোনো সদস্য কি ব্যাঙ্ক যান).");
                rdoH184a1.requestFocus();
                return;
            } else if (spnH184a1.getSelectedItemPosition() == 0 & secH184a1.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: প্রথম বাহন.");
                spnH184a1.requestFocus();
                return;
            } else if (txtH184a1X.getText().toString().length() == 0 & secH184a1X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH184a1X.requestFocus();
                return;
            } else if (spnH184a2.getSelectedItemPosition() == 0 & secH184a2.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: দ্বিতীয় বাহন.");
                spnH184a2.requestFocus();
                return;
            } else if (txtH184a2X.getText().toString().length() == 0 & secH184a2X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH184a2X.requestFocus();
                return;
            } else if (spnH184a3.getSelectedItemPosition() == 0 & secH184a3.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: তৃতীয় বাহন.");
                spnH184a3.requestFocus();
                return;
            } else if (txtH184a3X.getText().toString().length() == 0 & secH184a3X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH184a3X.requestFocus();
                return;
            } else if (txtH184a4.getText().toString().length() == 0 & secH184a4.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: দূরত্ব KM.");
                txtH184a4.requestFocus();
                return;
            } else if (Integer.valueOf(txtH184a4.getText().toString().length() == 0 ? "0" : txtH184a4.getText().toString()) < 0 || Integer.valueOf(txtH184a4.getText().toString().length() == 0 ? "999" : txtH184a4.getText().toString()) > 999) {
                Connection.MessageBox(Careseek.this, "Value should be between 0 and 999(দূরত্ব KM).");
                txtH184a4.requestFocus();
                return;
            } else if (!rdoH185a1.isChecked() & !rdoH185a2.isChecked() & secH185a.isShown()) {
                Connection.MessageBox(Careseek.this, "Select anyone options from (আপনারবাড়ির কোনো সদস্য কি বাজার (খাবার/পণ্যদ্রব্যকেনারজন্যে) যান).");
                rdoH185a1.requestFocus();
                return;
            } else if (spnH185a1.getSelectedItemPosition() == 0 & secH185a1.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: প্রথম বাহন.");
                spnH185a1.requestFocus();
                return;
            } else if (txtH185a1X.getText().toString().length() == 0 & secH185a1X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH185a1X.requestFocus();
                return;
            } else if (spnH185a2.getSelectedItemPosition() == 0 & secH185a2.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: দ্বিতীয় বাহন.");
                spnH185a2.requestFocus();
                return;
            } else if (txtH185a2X.getText().toString().length() == 0 & secH185a2X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH185a2X.requestFocus();
                return;
            } else if (spnH185a3.getSelectedItemPosition() == 0 & secH185a3.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: তৃতীয় বাহন.");
                spnH185a3.requestFocus();
                return;
            } else if (txtH185a3X.getText().toString().length() == 0 & secH185a3X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH185a3X.requestFocus();
                return;
            } else if (txtH185a4.getText().toString().length() == 0 & secH185a4.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: দূরত্ব KM.");
                txtH185a4.requestFocus();
                return;
            } else if (Integer.valueOf(txtH185a4.getText().toString().length() == 0 ? "0" : txtH185a4.getText().toString()) < 0 || Integer.valueOf(txtH185a4.getText().toString().length() == 0 ? "999" : txtH185a4.getText().toString()) > 999) {
                Connection.MessageBox(Careseek.this, "Value should be between 0 and 999(দূরত্ব KM).");
                txtH185a4.requestFocus();
                return;
            } else if (!rdoH186a1.isChecked() & !rdoH186a2.isChecked() & secH186a.isShown()) {
                Connection.MessageBox(Careseek.this, "Select anyone options from (আপনারবাড়ির কোনো সদস্য কি বাজার (খাবার/পণ্যদ্রব্যবিক্রিরজন্যে)যান).");
                rdoH186a1.requestFocus();
                return;
            } else if (spnH186a1.getSelectedItemPosition() == 0 & secH186a1.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: প্রথম বাহন.");
                spnH186a1.requestFocus();
                return;
            } else if (txtH186a1X.getText().toString().length() == 0 & secH186a1X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH186a1X.requestFocus();
                return;
            } else if (spnH186a2.getSelectedItemPosition() == 0 & secH186a2.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: দ্বিতীয় বাহন.");
                spnH186a2.requestFocus();
                return;
            } else if (txtH186a2X.getText().toString().length() == 0 & secH186a2X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH186a2X.requestFocus();
                return;
            } else if (spnH186a3.getSelectedItemPosition() == 0 & secH186a3.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: তৃতীয় বাহন.");
                spnH186a3.requestFocus();
                return;
            } else if (txtH186a3X.getText().toString().length() == 0 & secH186a3X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH186a3X.requestFocus();
                return;
            } else if (txtH186a4.getText().toString().length() == 0 & secH186a4.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: দূরত্ব KM.");
                txtH186a4.requestFocus();
                return;
            } else if (Integer.valueOf(txtH186a4.getText().toString().length() == 0 ? "0" : txtH186a4.getText().toString()) < 0 || Integer.valueOf(txtH186a4.getText().toString().length() == 0 ? "999" : txtH186a4.getText().toString()) > 999) {
                Connection.MessageBox(Careseek.this, "Value should be between 0 and 999(দূরত্ব KM).");
                txtH186a4.requestFocus();
                return;
            } else if (!rdoH187a1.isChecked() & !rdoH187a2.isChecked() & secH187a.isShown()) {
                Connection.MessageBox(Careseek.this, "Select anyone options from (আপনারবাড়ির কোনো সদস্য কি সরকারী কৃষিসেবায় যান).");
                rdoH187a1.requestFocus();
                return;
            } else if (spnH187a1.getSelectedItemPosition() == 0 & secH187a1.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: প্রথম বাহন.");
                spnH187a1.requestFocus();
                return;
            } else if (txtH187a1X.getText().toString().length() == 0 & secH187a1X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH187a1X.requestFocus();
                return;
            } else if (spnH187a2.getSelectedItemPosition() == 0 & secH187a2.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: দ্বিতীয় বাহন.");
                spnH187a2.requestFocus();
                return;
            } else if (txtH187a2X.getText().toString().length() == 0 & secH187a2X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH187a2X.requestFocus();
                return;
            } else if (spnH187a3.getSelectedItemPosition() == 0 & secH187a3.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: তৃতীয় বাহন.");
                spnH187a3.requestFocus();
                return;
            } else if (txtH187a3X.getText().toString().length() == 0 & secH187a3X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH187a3X.requestFocus();
                return;
            } else if (txtH187a4.getText().toString().length() == 0 & secH187a4.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: দূরত্ব KM.");
                txtH187a4.requestFocus();
                return;
            } else if (Integer.valueOf(txtH187a4.getText().toString().length() == 0 ? "0" : txtH187a4.getText().toString()) < 0 || Integer.valueOf(txtH187a4.getText().toString().length() == 0 ? "999" : txtH187a4.getText().toString()) > 999) {
                Connection.MessageBox(Careseek.this, "Value should be between 0 and 999(দূরত্ব KM).");
                txtH187a4.requestFocus();
                return;
            } else if (!rdoH188a1.isChecked() & !rdoH188a2.isChecked() & secH188a.isShown()) {
                Connection.MessageBox(Careseek.this, "Select anyone options from (আপনার বাড়ির কোনো সদস্য কি মৎস্য বিভাগ যান).");
                rdoH188a1.requestFocus();
                return;
            } else if (spnH188a1.getSelectedItemPosition() == 0 & secH188a1.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: প্রথম বাহন.");
                spnH188a1.requestFocus();
                return;
            } else if (txtH188a1X.getText().toString().length() == 0 & secH188a1X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH188a1X.requestFocus();
                return;
            } else if (spnH188a2.getSelectedItemPosition() == 0 & secH188a2.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: দ্বিতীয় বাহন.");
                spnH188a2.requestFocus();
                return;
            } else if (txtH188a2X.getText().toString().length() == 0 & secH188a2X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH188a2X.requestFocus();
                return;
            } else if (spnH188a3.getSelectedItemPosition() == 0 & secH188a3.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: তৃতীয় বাহন.");
                spnH188a3.requestFocus();
                return;
            } else if (txtH1881a3X.getText().toString().length() == 0 & secH1881a3X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH1881a3X.requestFocus();
                return;
            } else if (txtH188a4.getText().toString().length() == 0 & secH188a4.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: দূরত্ব KM.");
                txtH188a4.requestFocus();
                return;
            } else if (Integer.valueOf(txtH188a4.getText().toString().length() == 0 ? "0" : txtH188a4.getText().toString()) < 0 || Integer.valueOf(txtH188a4.getText().toString().length() == 0 ? "999" : txtH188a4.getText().toString()) > 999) {
                Connection.MessageBox(Careseek.this, "Value should be between 0 and 999(দূরত্ব KM).");
                txtH188a4.requestFocus();
                return;
            } else if (!rdoH189a1.isChecked() & !rdoH189a2.isChecked() & secH189a.isShown()) {
                Connection.MessageBox(Careseek.this, "Select anyone options from (বেসরকারীখাত-মাছেরপোনা, চুন ও খাদ্য প্রদানকারী কেন্দ্র গুলোতে যান).");
                rdoH189a1.requestFocus();
                return;
            } else if (spnH189a1.getSelectedItemPosition() == 0 & secH189a1.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: প্রথম বাহন.");
                spnH189a1.requestFocus();
                return;
            } else if (txtH189a1X.getText().toString().length() == 0 & secH189a1X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH189a1X.requestFocus();
                return;
            } else if (spnH189a2.getSelectedItemPosition() == 0 & secH189a2.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: দ্বিতীয় বাহন.");
                spnH189a2.requestFocus();
                return;
            } else if (txtH189a2X.getText().toString().length() == 0 & secH189a2X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH189a2X.requestFocus();
                return;
            } else if (spnH189a3.getSelectedItemPosition() == 0 & secH189a3.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: তৃতীয় বাহন.");
                spnH189a3.requestFocus();
                return;
            } else if (txtH189a3X.getText().toString().length() == 0 & secH189a3X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH189a3X.requestFocus();
                return;
            } else if (txtH189a4.getText().toString().length() == 0 & secH189a4.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: দূরত্ব KM.");
                txtH189a4.requestFocus();
                return;
            } else if (Integer.valueOf(txtH189a4.getText().toString().length() == 0 ? "0" : txtH189a4.getText().toString()) < 0 || Integer.valueOf(txtH189a4.getText().toString().length() == 0 ? "999" : txtH189a4.getText().toString()) > 999) {
                Connection.MessageBox(Careseek.this, "Value should be between 0 and 999(দূরত্ব KM).");
                txtH189a4.requestFocus();
                return;
            } else if (!rdoH1810a1.isChecked() & !rdoH1810a2.isChecked() & secH1810a.isShown()) {
                Connection.MessageBox(Careseek.this, "Select anyone options from (বেসরকারীখাত- বীজও সার প্রদানকারী কেন্দ্র গুলোতে যান).");
                rdoH1810a1.requestFocus();
                return;
            } else if (spnH1810a1.getSelectedItemPosition() == 0 & secH1810a1.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: প্রথম বাহন.");
                spnH1810a1.requestFocus();
                return;
            } else if (txtH1810a1X.getText().toString().length() == 0 & secH1810a1X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH1810a1X.requestFocus();
                return;
            } else if (spnH1810a2.getSelectedItemPosition() == 0 & secH1810a2.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: দ্বিতীয় বাহন.");
                spnH1810a2.requestFocus();
                return;
            } else if (txtH1810a2X.getText().toString().length() == 0 & secH1810a2X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH1810a2X.requestFocus();
                return;
            } else if (spnH1810a3.getSelectedItemPosition() == 0 & secH1810a3.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: তৃতীয় বাহন.");
                spnH1810a3.requestFocus();
                return;
            } else if (txtH1810a3X.getText().toString().length() == 0 & secH1810a3X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH1810a3X.requestFocus();
                return;
            } else if (txtH1810a4.getText().toString().length() == 0 & secH1810a4.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: দূরত্ব KM.");
                txtH1810a4.requestFocus();
                return;
            } else if (Integer.valueOf(txtH1810a4.getText().toString().length() == 0 ? "0" : txtH1810a4.getText().toString()) < 0 || Integer.valueOf(txtH1810a4.getText().toString().length() == 0 ? "999" : txtH1810a4.getText().toString()) > 999) {
                Connection.MessageBox(Careseek.this, "Value should be between 0 and 999(দূরত্ব KM).");
                txtH1810a4.requestFocus();
                return;
            } else if (!rdoH1811a1.isChecked() & !rdoH1811a2.isChecked() & secH1811a.isShown()) {
                Connection.MessageBox(Careseek.this, "Select anyone options from (সরকারীখাত-মাছেরপোনা, চুনওখাদ্য প্রদানকারী কেন্দ্র গুলোতে যান).");
                rdoH1811a1.requestFocus();
                return;
            } else if (spnH1811a1.getSelectedItemPosition() == 0 & secH1811a1.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: প্রথম বাহন.");
                spnH1811a1.requestFocus();
                return;
            } else if (txtH1811a1X.getText().toString().length() == 0 & secH1811a1X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH1811a1X.requestFocus();
                return;
            } else if (spnH1811a2.getSelectedItemPosition() == 0 & secH1811a2.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: দ্বিতীয় বাহন.");
                spnH1811a2.requestFocus();
                return;
            } else if (txtH1811a2X.getText().toString().length() == 0 & secH1811a2X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH1811a2X.requestFocus();
                return;
            } else if (spnH1811a3.getSelectedItemPosition() == 0 & secH1811a3.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: তৃতীয় বাহন.");
                spnH1811a3.requestFocus();
                return;
            } else if (txtH1811a3X.getText().toString().length() == 0 & secH1811a3X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH1811a3X.requestFocus();
                return;
            } else if (txtH1811a4.getText().toString().length() == 0 & secH1811a4.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: দূরত্ব KM.");
                txtH1811a4.requestFocus();
                return;
            } else if (Integer.valueOf(txtH1811a4.getText().toString().length() == 0 ? "0" : txtH1811a4.getText().toString()) < 0 || Integer.valueOf(txtH1811a4.getText().toString().length() == 0 ? "999" : txtH1811a4.getText().toString()) > 999) {
                Connection.MessageBox(Careseek.this, "Value should be between 0 and 999(দূরত্ব KM).");
                txtH1811a4.requestFocus();
                return;
            } else if (!rdoH1812a1.isChecked() & !rdoH1812a2.isChecked() & secH1812a.isShown()) {
                Connection.MessageBox(Careseek.this, "Select anyone options from (সরকারীখাত- বীজওসারপ্রদানকারী কেন্দ্র গুলোতে যান).");
                rdoH1812a1.requestFocus();
                return;
            } else if (spnH1812a1.getSelectedItemPosition() == 0 & secH1812a1.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: প্রথম বাহন.");
                spnH1812a1.requestFocus();
                return;
            } else if (txtH1812a1X.getText().toString().length() == 0 & secH1812a1X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH1812a1X.requestFocus();
                return;
            } else if (spnH1812a2.getSelectedItemPosition() == 0 & secH1812a2.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: দ্বিতীয় বাহন.");
                spnH1812a2.requestFocus();
                return;
            } else if (txtH1812a2X.getText().toString().length() == 0 & secH1812a2X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH1812a2X.requestFocus();
                return;
            } else if (spnH1812a3.getSelectedItemPosition() == 0 & secH1812a3.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: তৃতীয় বাহন.");
                spnH1812a3.requestFocus();
                return;
            } else if (txtH1812a3X.getText().toString().length() == 0 & secH1812a3X.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: অন্যান্য.");
                txtH1812a3X.requestFocus();
                return;
            } else if (txtH1812a4.getText().toString().length() == 0 & secH1812a4.isShown()) {
                Connection.MessageBox(Careseek.this, "Required field: দূরত্ব KM.");
                txtH1812a4.requestFocus();
                return;
            } else if (Integer.valueOf(txtH1812a4.getText().toString().length() == 0 ? "0" : txtH1812a4.getText().toString()) < 0 || Integer.valueOf(txtH1812a4.getText().toString().length() == 0 ? "999" : txtH1812a4.getText().toString()) > 999) {
                Connection.MessageBox(Careseek.this, "Value should be between 0 and 999(দূরত্ব KM).");
                txtH1812a4.requestFocus();
                return;
            }

            if (rdoH181a1.isChecked())
            {
                if(spnH181a1.getSelectedItem().equals(spnH181a2.getSelectedItem()) || spnH181a1.getSelectedItem().equals(spnH181a3.getSelectedItem()) || spnH181a2.getSelectedItem().equals(spnH181a3.getSelectedItem()))
                {
                    Connection.MessageBox(Careseek.this, "Some data inconsistent in H181");
                    spnH181a1.requestFocus();
                    return;
                }
            }
            else  if (rdoH182a1.isChecked())
            {
                if(spnH182a1.getSelectedItem().equals(spnH182a2.getSelectedItem()) || spnH182a1.getSelectedItem().equals(spnH182a3.getSelectedItem()) || spnH182a2.getSelectedItem().equals(spnH182a3.getSelectedItem()))
                {
                    Connection.MessageBox(Careseek.this, "Some data inconsistent in H182");
                    spnH182a1.requestFocus();
                    return;
                }
            }
            else  if (rdoH183a1.isChecked())
            {
                if(spnH183a1.getSelectedItem().equals(spnH183a2.getSelectedItem()) || spnH183a1.getSelectedItem().equals(spnH183a3.getSelectedItem()) || spnH183a2.getSelectedItem().equals(spnH183a3.getSelectedItem()))
                {
                    Connection.MessageBox(Careseek.this, "Some data inconsistent in H183");
                    spnH183a1.requestFocus();
                    return;
                }
            }
            else  if (rdoH184a1.isChecked())
            {
                if(spnH184a1.getSelectedItem().equals(spnH184a2.getSelectedItem()) || spnH184a1.getSelectedItem().equals(spnH184a3.getSelectedItem()) || spnH184a2.getSelectedItem().equals(spnH184a3.getSelectedItem()))
                {
                    Connection.MessageBox(Careseek.this, "Some data inconsistent in H184");
                    spnH184a1.requestFocus();
                    return;
                }
            }
            else  if (rdoH185a1.isChecked())
            {
                if(spnH185a1.getSelectedItem().equals(spnH185a2.getSelectedItem()) || spnH185a1.getSelectedItem().equals(spnH185a3.getSelectedItem()) || spnH185a2.getSelectedItem().equals(spnH185a3.getSelectedItem()))
                {
                    Connection.MessageBox(Careseek.this, "Some data inconsistent in H185");
                    spnH185a1.requestFocus();
                    return;
                }
            }
            else  if (rdoH186a1.isChecked())
            {
                if(spnH186a1.getSelectedItem().equals(spnH186a2.getSelectedItem()) || spnH186a1.getSelectedItem().equals(spnH186a3.getSelectedItem()) || spnH186a2.getSelectedItem().equals(spnH186a3.getSelectedItem()))
                {
                    Connection.MessageBox(Careseek.this, "Some data inconsistent in H186");
                    spnH186a1.requestFocus();
                    return;
                }
            }
            else  if (rdoH187a1.isChecked())
            {
                if(spnH187a1.getSelectedItem().equals(spnH187a2.getSelectedItem()) || spnH187a1.getSelectedItem().equals(spnH187a3.getSelectedItem()) || spnH187a2.getSelectedItem().equals(spnH187a3.getSelectedItem()))
                {
                    Connection.MessageBox(Careseek.this, "Some data inconsistent in H187");
                    spnH187a1.requestFocus();
                    return;
                }
            }
            else  if (rdoH188a1.isChecked())
            {
                if(spnH188a1.getSelectedItem().equals(spnH188a2.getSelectedItem()) || spnH188a1.getSelectedItem().equals(spnH188a3.getSelectedItem()) || spnH188a2.getSelectedItem().equals(spnH188a3.getSelectedItem()))
                {
                    Connection.MessageBox(Careseek.this, "Some data inconsistent in H188");
                    spnH188a1.requestFocus();
                    return;
                }
            }
            else  if (rdoH189a1.isChecked())
            {
                if(spnH189a1.getSelectedItem().equals(spnH189a2.getSelectedItem()) || spnH189a1.getSelectedItem().equals(spnH189a3.getSelectedItem()) || spnH189a2.getSelectedItem().equals(spnH189a3.getSelectedItem()))
                {
                    Connection.MessageBox(Careseek.this, "Some data inconsistent in H189");
                    spnH189a1.requestFocus();
                    return;
                }
            }
            else  if (rdoH1810a1.isChecked())
            {
                if(spnH1810a1.getSelectedItem().equals(spnH1810a2.getSelectedItem()) || spnH1810a1.getSelectedItem().equals(spnH1810a3.getSelectedItem()) || spnH1810a2.getSelectedItem().equals(spnH1810a3.getSelectedItem()))
                {
                    Connection.MessageBox(Careseek.this, "Some data inconsistent in H1810");
                    spnH1810a1.requestFocus();
                    return;
                }
            }
            else  if (rdoH1811a1.isChecked())
            {
                if(spnH1811a1.getSelectedItem().equals(spnH1811a2.getSelectedItem()) || spnH1811a1.getSelectedItem().equals(spnH1811a3.getSelectedItem()) || spnH1811a2.getSelectedItem().equals(spnH1811a3.getSelectedItem()))
                {
                    Connection.MessageBox(Careseek.this, "Some data inconsistent in H1811");
                    spnH1811a1.requestFocus();
                    return;
                }
            }
            else  if (rdoH1812a1.isChecked())
            {
                if(spnH1812a1.getSelectedItem().equals(spnH1812a2.getSelectedItem()) || spnH1812a1.getSelectedItem().equals(spnH1812a3.getSelectedItem()) || spnH1812a2.getSelectedItem().equals(spnH1812a3.getSelectedItem()))
                {
                    Connection.MessageBox(Careseek.this, "Some data inconsistent in H1812");
                    spnH1812a1.requestFocus();
                    return;
                }
            }






            String SQL = "";
            RadioButton rb;

            Careseek_DataModel objSave = new Careseek_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            String[] d_rdogrpH181a = new String[]{"1", "0"};
            objSave.setH181a("");
            for (int i = 0; i < rdogrpH181a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH181a.getChildAt(i);
                if (rb.isChecked()) objSave.setH181a(d_rdogrpH181a[i]);
            }

            objSave.setH181a1((spnH181a1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH181a1.getSelectedItem().toString(), "-")));
            objSave.setH181a1X(txtH181a1X.getText().toString());
            objSave.setH181a2((spnH181a2.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH181a2.getSelectedItem().toString(), "-")));
            objSave.setH181a2X(txtH181a2X.getText().toString());
            objSave.setH181a3((spnH181a3.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH181a3.getSelectedItem().toString(), "-")));
            objSave.setH181a3X(txtH181a3X.getText().toString());
            objSave.setH181a4(txtH181a4.getText().toString());
            String[] d_rdogrpH182a = new String[]{"1", "0"};
            objSave.setH182a("");
            for (int i = 0; i < rdogrpH182a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH182a.getChildAt(i);
                if (rb.isChecked()) objSave.setH182a(d_rdogrpH182a[i]);
            }

            objSave.setH182a1((spnH182a1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH182a1.getSelectedItem().toString(), "-")));
            objSave.setH182a1X(txtH182a1X.getText().toString());
            objSave.setH182a2((spnH182a2.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH182a2.getSelectedItem().toString(), "-")));
            objSave.setH182a2X(txtH182a2X.getText().toString());
            objSave.setH182a3((spnH182a3.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH182a3.getSelectedItem().toString(), "-")));
            objSave.setH182a3X(txtH182a3X.getText().toString());
            objSave.setH182a4(txtH182a4.getText().toString());
            String[] d_rdogrpH183a = new String[]{"1", "0"};
            objSave.setH183a("");
            for (int i = 0; i < rdogrpH183a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH183a.getChildAt(i);
                if (rb.isChecked()) objSave.setH183a(d_rdogrpH183a[i]);
            }

            objSave.setH183a1((spnH183a1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH183a1.getSelectedItem().toString(), "-")));
            objSave.setH183a1X(txtH183a1X.getText().toString());
            objSave.setH183a2((spnH183a2.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH183a2.getSelectedItem().toString(), "-")));
            objSave.setH183a2X(txtH183a2X.getText().toString());
            objSave.setH183a3((spnH183a3.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH183a3.getSelectedItem().toString(), "-")));
            objSave.setH183a3X(txtH183a3X.getText().toString());
            objSave.setH183a4(txtH183a4.getText().toString());
            String[] d_rdogrpH184a = new String[]{"1", "0"};
            objSave.setH184a("");
            for (int i = 0; i < rdogrpH184a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH184a.getChildAt(i);
                if (rb.isChecked()) objSave.setH184a(d_rdogrpH184a[i]);
            }

            objSave.setH184a1((spnH184a1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH184a1.getSelectedItem().toString(), "-")));
            objSave.setH184a1X(txtH184a1X.getText().toString());
            objSave.setH184a2((spnH184a2.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH184a2.getSelectedItem().toString(), "-")));
            objSave.setH184a2X(txtH184a2X.getText().toString());
            objSave.setH184a3((spnH184a3.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH184a3.getSelectedItem().toString(), "-")));
            objSave.setH184a3X(txtH184a3X.getText().toString());
            objSave.setH184a4(txtH184a4.getText().toString());
            String[] d_rdogrpH185a = new String[]{"1", "0"};
            objSave.setH185a("");
            for (int i = 0; i < rdogrpH185a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH185a.getChildAt(i);
                if (rb.isChecked()) objSave.setH185a(d_rdogrpH185a[i]);
            }

            objSave.setH185a1((spnH185a1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH185a1.getSelectedItem().toString(), "-")));
            objSave.setH185a1X(txtH185a1X.getText().toString());
            objSave.setH185a2((spnH185a2.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH185a2.getSelectedItem().toString(), "-")));
            objSave.setH185a2X(txtH185a2X.getText().toString());
            objSave.setH185a3((spnH185a3.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH185a3.getSelectedItem().toString(), "-")));
            objSave.setH185a3X(txtH185a3X.getText().toString());
            objSave.setH185a4(txtH185a4.getText().toString());
            String[] d_rdogrpH186a = new String[]{"1", "0"};
            objSave.setH186a("");
            for (int i = 0; i < rdogrpH186a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH186a.getChildAt(i);
                if (rb.isChecked()) objSave.setH186a(d_rdogrpH186a[i]);
            }

            objSave.setH186a1((spnH186a1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH186a1.getSelectedItem().toString(), "-")));
            objSave.setH186a1X(txtH186a1X.getText().toString());
            objSave.setH186a2((spnH186a2.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH186a2.getSelectedItem().toString(), "-")));
            objSave.setH186a2X(txtH186a2X.getText().toString());
            objSave.setH186a3((spnH186a3.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH186a3.getSelectedItem().toString(), "-")));
            objSave.setH186a3X(txtH186a3X.getText().toString());
            objSave.setH186a4(txtH186a4.getText().toString());
            String[] d_rdogrpH187a = new String[]{"1", "0"};
            objSave.setH187a("");
            for (int i = 0; i < rdogrpH187a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH187a.getChildAt(i);
                if (rb.isChecked()) objSave.setH187a(d_rdogrpH187a[i]);
            }

            objSave.setH187a1((spnH187a1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH187a1.getSelectedItem().toString(), "-")));
            objSave.setH187a1X(txtH187a1X.getText().toString());
            objSave.setH187a2((spnH187a2.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH187a2.getSelectedItem().toString(), "-")));
            objSave.setH187a2X(txtH187a2X.getText().toString());
            objSave.setH187a3((spnH187a3.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH187a3.getSelectedItem().toString(), "-")));
            objSave.setH187a3X(txtH187a3X.getText().toString());
            objSave.setH187a4(txtH187a4.getText().toString());
            String[] d_rdogrpH188a = new String[]{"1", "0"};
            objSave.setH188a("");
            for (int i = 0; i < rdogrpH188a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH188a.getChildAt(i);
                if (rb.isChecked()) objSave.setH188a(d_rdogrpH188a[i]);
            }

            objSave.setH188a1((spnH188a1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH188a1.getSelectedItem().toString(), "-")));
            objSave.setH188a1X(txtH188a1X.getText().toString());
            objSave.setH188a2((spnH188a2.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH188a2.getSelectedItem().toString(), "-")));
            objSave.setH188a2X(txtH188a2X.getText().toString());
            objSave.setH188a3((spnH188a3.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH188a3.getSelectedItem().toString(), "-")));
            objSave.setH1881a3X(txtH1881a3X.getText().toString());
            objSave.setH188a4(txtH188a4.getText().toString());
            String[] d_rdogrpH189a = new String[]{"1", "0"};
            objSave.setH189a("");
            for (int i = 0; i < rdogrpH189a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH189a.getChildAt(i);
                if (rb.isChecked()) objSave.setH189a(d_rdogrpH189a[i]);
            }

            objSave.setH189a1((spnH189a1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH189a1.getSelectedItem().toString(), "-")));
            objSave.setH189a1X(txtH189a1X.getText().toString());
            objSave.setH189a2((spnH189a2.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH189a2.getSelectedItem().toString(), "-")));
            objSave.setH189a2X(txtH189a2X.getText().toString());
            objSave.setH189a3((spnH189a3.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH189a3.getSelectedItem().toString(), "-")));
            objSave.setH189a3X(txtH189a3X.getText().toString());
            objSave.setH189a4(txtH189a4.getText().toString());
            String[] d_rdogrpH1810a = new String[]{"1", "0"};
            objSave.setH1810a("");
            for (int i = 0; i < rdogrpH1810a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH1810a.getChildAt(i);
                if (rb.isChecked()) objSave.setH1810a(d_rdogrpH1810a[i]);
            }

            objSave.setH1810a1((spnH1810a1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH1810a1.getSelectedItem().toString(), "-")));
            objSave.setH1810a1X(txtH1810a1X.getText().toString());
            objSave.setH1810a2((spnH1810a2.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH1810a2.getSelectedItem().toString(), "-")));
            objSave.setH1810a2X(txtH1810a2X.getText().toString());
            objSave.setH1810a3((spnH1810a3.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH1810a3.getSelectedItem().toString(), "-")));
            objSave.setH1810a3X(txtH1810a3X.getText().toString());
            objSave.setH1810a4(txtH1810a4.getText().toString());
            String[] d_rdogrpH1811a = new String[]{"1", "0"};
            objSave.setH1811a("");
            for (int i = 0; i < rdogrpH1811a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH1811a.getChildAt(i);
                if (rb.isChecked()) objSave.setH1811a(d_rdogrpH1811a[i]);
            }

            objSave.setH1811a1((spnH1811a1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH1811a1.getSelectedItem().toString(), "-")));
            objSave.setH1811a1X(txtH1811a1X.getText().toString());
            objSave.setH1811a2((spnH1811a2.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH1811a2.getSelectedItem().toString(), "-")));
            objSave.setH1811a2X(txtH1811a2X.getText().toString());
            objSave.setH1811a3((spnH1811a3.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH1811a3.getSelectedItem().toString(), "-")));
            objSave.setH1811a3X(txtH1811a3X.getText().toString());
            objSave.setH1811a4(txtH1811a4.getText().toString());
            String[] d_rdogrpH1812a = new String[]{"1", "0"};
            objSave.setH1812a("");
            for (int i = 0; i < rdogrpH1812a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH1812a.getChildAt(i);
                if (rb.isChecked()) objSave.setH1812a(d_rdogrpH1812a[i]);
            }

            objSave.setH1812a1((spnH1812a1.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH1812a1.getSelectedItem().toString(), "-")));
            objSave.setH1812a1X(txtH1812a1X.getText().toString());
            objSave.setH1812a2((spnH1812a2.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH1812a2.getSelectedItem().toString(), "-")));
            objSave.setH1812a2X(txtH1812a2X.getText().toString());
            objSave.setH1812a3((spnH1812a3.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH1812a3.getSelectedItem().toString(), "-")));
            objSave.setH1812a3X(txtH1812a3X.getText().toString());
            objSave.setH1812a4(txtH1812a4.getText().toString());
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
                startActivity(new Intent(Careseek.this, IGA.class).putExtras(IDBundle));

            } else {
                Connection.MessageBox(Careseek.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(Careseek.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            Careseek_DataModel d = new Careseek_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<Careseek_DataModel> data = d.SelectAll(this, SQL);
            for (Careseek_DataModel item : data) {

                cmdForward.setEnabled(true);
                lblNext.setEnabled(true);

                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                String[] d_rdogrpH181a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH181a.length; i++) {
                    if (item.getH181a().equals(String.valueOf(d_rdogrpH181a[i]))) {
                        rb = (RadioButton) rdogrpH181a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH181a1.setSelection(Global.SpinnerItemPositionAnyLength(spnH181a1, item.getH181a1()));
                txtH181a1X.setText(item.getH181a1X());
                spnH181a2.setSelection(Global.SpinnerItemPositionAnyLength(spnH181a2, item.getH181a2()));
                txtH181a2X.setText(item.getH181a2X());
                spnH181a3.setSelection(Global.SpinnerItemPositionAnyLength(spnH181a3, item.getH181a3()));
                txtH181a3X.setText(item.getH181a3X());
                txtH181a4.setText(item.getH181a4());
                String[] d_rdogrpH182a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH182a.length; i++) {
                    if (item.getH182a().equals(String.valueOf(d_rdogrpH182a[i]))) {
                        rb = (RadioButton) rdogrpH182a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH182a1.setSelection(Global.SpinnerItemPositionAnyLength(spnH182a1, item.getH182a1()));
                txtH182a1X.setText(item.getH182a1X());
                spnH182a2.setSelection(Global.SpinnerItemPositionAnyLength(spnH182a2, item.getH182a2()));
                txtH182a2X.setText(item.getH182a2X());
                spnH182a3.setSelection(Global.SpinnerItemPositionAnyLength(spnH182a3, item.getH182a3()));
                txtH182a3X.setText(item.getH182a3X());
                txtH182a4.setText(item.getH182a4());
                String[] d_rdogrpH183a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH183a.length; i++) {
                    if (item.getH183a().equals(String.valueOf(d_rdogrpH183a[i]))) {
                        rb = (RadioButton) rdogrpH183a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH183a1.setSelection(Global.SpinnerItemPositionAnyLength(spnH183a1, item.getH183a1()));
                txtH183a1X.setText(item.getH183a1X());
                spnH183a2.setSelection(Global.SpinnerItemPositionAnyLength(spnH183a2, item.getH183a2()));
                txtH183a2X.setText(item.getH183a2X());
                spnH183a3.setSelection(Global.SpinnerItemPositionAnyLength(spnH183a3, item.getH183a3()));
                txtH183a3X.setText(item.getH183a3X());
                txtH183a4.setText(item.getH183a4());
                String[] d_rdogrpH184a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH184a.length; i++) {
                    if (item.getH184a().equals(String.valueOf(d_rdogrpH184a[i]))) {
                        rb = (RadioButton) rdogrpH184a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH184a1.setSelection(Global.SpinnerItemPositionAnyLength(spnH184a1, item.getH184a1()));
                txtH184a1X.setText(item.getH184a1X());
                spnH184a2.setSelection(Global.SpinnerItemPositionAnyLength(spnH184a2, item.getH184a2()));
                txtH184a2X.setText(item.getH184a2X());
                spnH184a3.setSelection(Global.SpinnerItemPositionAnyLength(spnH184a3, item.getH184a3()));
                txtH184a3X.setText(item.getH184a3X());
                txtH184a4.setText(item.getH184a4());
                String[] d_rdogrpH185a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH185a.length; i++) {
                    if (item.getH185a().equals(String.valueOf(d_rdogrpH185a[i]))) {
                        rb = (RadioButton) rdogrpH185a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH185a1.setSelection(Global.SpinnerItemPositionAnyLength(spnH185a1, item.getH185a1()));
                txtH185a1X.setText(item.getH185a1X());
                spnH185a2.setSelection(Global.SpinnerItemPositionAnyLength(spnH185a2, item.getH185a2()));
                txtH185a2X.setText(item.getH185a2X());
                spnH185a3.setSelection(Global.SpinnerItemPositionAnyLength(spnH185a3, item.getH185a3()));
                txtH185a3X.setText(item.getH185a3X());
                txtH185a4.setText(item.getH185a4());
                String[] d_rdogrpH186a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH186a.length; i++) {
                    if (item.getH186a().equals(String.valueOf(d_rdogrpH186a[i]))) {
                        rb = (RadioButton) rdogrpH186a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH186a1.setSelection(Global.SpinnerItemPositionAnyLength(spnH186a1, item.getH186a1()));
                txtH186a1X.setText(item.getH186a1X());
                spnH186a2.setSelection(Global.SpinnerItemPositionAnyLength(spnH186a2, item.getH186a2()));
                txtH186a2X.setText(item.getH186a2X());
                spnH186a3.setSelection(Global.SpinnerItemPositionAnyLength(spnH186a3, item.getH186a3()));
                txtH186a3X.setText(item.getH186a3X());
                txtH186a4.setText(item.getH186a4());
                String[] d_rdogrpH187a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH187a.length; i++) {
                    if (item.getH187a().equals(String.valueOf(d_rdogrpH187a[i]))) {
                        rb = (RadioButton) rdogrpH187a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH187a1.setSelection(Global.SpinnerItemPositionAnyLength(spnH187a1, item.getH187a1()));
                txtH187a1X.setText(item.getH187a1X());
                spnH187a2.setSelection(Global.SpinnerItemPositionAnyLength(spnH187a2, item.getH187a2()));
                txtH187a2X.setText(item.getH187a2X());
                spnH187a3.setSelection(Global.SpinnerItemPositionAnyLength(spnH187a3, item.getH187a3()));
                txtH187a3X.setText(item.getH187a3X());
                txtH187a4.setText(item.getH187a4());
                String[] d_rdogrpH188a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH188a.length; i++) {
                    if (item.getH188a().equals(String.valueOf(d_rdogrpH188a[i]))) {
                        rb = (RadioButton) rdogrpH188a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH188a1.setSelection(Global.SpinnerItemPositionAnyLength(spnH188a1, item.getH188a1()));
                txtH188a1X.setText(item.getH188a1X());
                spnH188a2.setSelection(Global.SpinnerItemPositionAnyLength(spnH188a2, item.getH188a2()));
                txtH188a2X.setText(item.getH188a2X());
                spnH188a3.setSelection(Global.SpinnerItemPositionAnyLength(spnH188a3, item.getH188a3()));
                txtH1881a3X.setText(item.getH1881a3X());
                txtH188a4.setText(item.getH188a4());
                String[] d_rdogrpH189a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH189a.length; i++) {
                    if (item.getH189a().equals(String.valueOf(d_rdogrpH189a[i]))) {
                        rb = (RadioButton) rdogrpH189a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH189a1.setSelection(Global.SpinnerItemPositionAnyLength(spnH189a1, item.getH189a1()));
                txtH189a1X.setText(item.getH189a1X());
                spnH189a2.setSelection(Global.SpinnerItemPositionAnyLength(spnH189a2, item.getH189a2()));
                txtH189a2X.setText(item.getH189a2X());
                spnH189a3.setSelection(Global.SpinnerItemPositionAnyLength(spnH189a3, item.getH189a3()));
                txtH189a3X.setText(item.getH189a3X());
                txtH189a4.setText(item.getH189a4());
                String[] d_rdogrpH1810a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH1810a.length; i++) {
                    if (item.getH1810a().equals(String.valueOf(d_rdogrpH1810a[i]))) {
                        rb = (RadioButton) rdogrpH1810a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH1810a1.setSelection(Global.SpinnerItemPositionAnyLength(spnH1810a1, item.getH1810a1()));
                txtH1810a1X.setText(item.getH1810a1X());
                spnH1810a2.setSelection(Global.SpinnerItemPositionAnyLength(spnH1810a2, item.getH1810a2()));
                txtH1810a2X.setText(item.getH1810a2X());
                spnH1810a3.setSelection(Global.SpinnerItemPositionAnyLength(spnH1810a3, item.getH1810a3()));
                txtH1810a3X.setText(item.getH1810a3X());
                txtH1810a4.setText(item.getH1810a4());
                String[] d_rdogrpH1811a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH1811a.length; i++) {
                    if (item.getH1811a().equals(String.valueOf(d_rdogrpH1811a[i]))) {
                        rb = (RadioButton) rdogrpH1811a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH1811a1.setSelection(Global.SpinnerItemPositionAnyLength(spnH1811a1, item.getH1811a1()));
                txtH1811a1X.setText(item.getH1811a1X());
                spnH1811a2.setSelection(Global.SpinnerItemPositionAnyLength(spnH1811a2, item.getH1811a2()));
                txtH1811a2X.setText(item.getH1811a2X());
                spnH1811a3.setSelection(Global.SpinnerItemPositionAnyLength(spnH1811a3, item.getH1811a3()));
                txtH1811a3X.setText(item.getH1811a3X());
                txtH1811a4.setText(item.getH1811a4());
                String[] d_rdogrpH1812a = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH1812a.length; i++) {
                    if (item.getH1812a().equals(String.valueOf(d_rdogrpH1812a[i]))) {
                        rb = (RadioButton) rdogrpH1812a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH1812a1.setSelection(Global.SpinnerItemPositionAnyLength(spnH1812a1, item.getH1812a1()));
                txtH1812a1X.setText(item.getH1812a1X());
                spnH1812a2.setSelection(Global.SpinnerItemPositionAnyLength(spnH1812a2, item.getH1812a2()));
                txtH1812a2X.setText(item.getH1812a2X());
                spnH1812a3.setSelection(Global.SpinnerItemPositionAnyLength(spnH1812a3, item.getH1812a3()));
                txtH1812a3X.setText(item.getH1812a3X());
                txtH1812a4.setText(item.getH1812a4());
            }
        } catch (Exception e) {
            Connection.MessageBox(Careseek.this, e.getMessage());
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