package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Agriculture" android:label="Agriculture" />

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

public class Agriculture extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    static String SL = "";
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
    LinearLayout seclbH151;
    LinearLayout secH151;
    View lineH151;
    TextView VlblH151;
    RadioGroup rdogrpH151;
    RadioButton rdoH1511;
    RadioButton rdoH1512;
    LinearLayout secSl;
    View lineSl;
    TextView VlblSl;
    EditText txtSl;
    LinearLayout secH152a;
    View lineH152a;
    TextView VlblH152a;
    Spinner spnH152a;
    LinearLayout secH152bOth;
    View lineH152bOth;
    TextView VlblH152bOth;
    EditText txtH152bOth;
    LinearLayout secLb1H151b;
    LinearLayout secH152b;
    View lineH152b;
    TextView VlblH152b;
    Spinner spnH152b;
    LinearLayout seclbH152c;
    LinearLayout secH152c;
    View lineH152c;
    TextView VlblH152c;
    EditText txtH152c;
    LinearLayout seclbH152d;
    LinearLayout secH152d1;
    View lineH152d1;
    TextView VlblH152d1;
    EditText txtH152d1;
    LinearLayout secH152d2;
    View lineH152d2;
    TextView VlblH152d2;
    RadioGroup rdogrpH152d2;
    RadioButton rdoH152d21;
    RadioButton rdoH152d22;
    LinearLayout seclbH15e;
    LinearLayout secH152e1;
    View lineH152e1;
    TextView VlblH152e1;
    EditText txtH152e1;
    LinearLayout secH152e2;
    View lineH152e2;
    TextView VlblH152e2;
    RadioGroup rdogrpH152e2;
    RadioButton rdoH152e21;
    RadioButton rdoH152e22;
    LinearLayout seclbh152f;
    LinearLayout secH152f;
    View lineH152f;
    TextView VlblH152f;
    EditText txtH152f;
    LinearLayout seclbH152g;
    LinearLayout secH152g;
    View lineH152g;
    TextView VlblH152g;
    EditText txtH152g;
    LinearLayout seclbH152h;
    LinearLayout secH152h1;
    View lineH152h1;
    TextView VlblH152h1;
    EditText txtH152h1;
    LinearLayout secH152h2;
    View lineH152h2;
    TextView VlblH152h2;
    RadioGroup rdogrpH152h2;
    RadioButton rdoH152h21;
    RadioButton rdoH152h22;
    LinearLayout seclbH15i;
    LinearLayout secH152i1;
    View lineH152i1;
    TextView VlblH152i1;
    EditText txtH152i1;
    LinearLayout secH152i2;
    View lineH152i2;
    TextView VlblH152i2;
    RadioGroup rdogrpH152i2;
    RadioButton rdoH152i21;
    RadioButton rdoH152i22;
    LinearLayout seclbH152j;
    LinearLayout secH152j1;
    View lineH152j1;
    TextView VlblH152j1;
    EditText txtH152j1;
    LinearLayout secH152j2;
    View lineH152j2;
    TextView VlblH152j2;
    RadioGroup rdogrpH152j2;
    RadioButton rdoH152j21;
    RadioButton rdoH152j22;
    LinearLayout seclbH152k;
    LinearLayout secH152k1;
    View lineH152k1;
    TextView VlblH152k1;
    EditText txtH152k1;
    LinearLayout secH152k2;
    View lineH152k2;
    TextView VlblH152k2;
    RadioGroup rdogrpH152k2;
    RadioButton rdoH152k21;
    RadioButton rdoH152k22;
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
            setContentView(R.layout.agriculture);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();

            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");
            SL = IDbundle.getString("Sl");

            TableName = "Agriculture";

            //turnGPSOn();

            //GPS Location
            //FindLocation();
            // Double.toString(currentLatitude);
            // Double.toString(currentLongitude);
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Agriculture.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to return to Home [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                            Bundle IDBundle = new Bundle();
                            finish();
                            IDBundle.putString("Rnd", txtRnd.getText().toString());
                            IDBundle.putString("SuchanaID", txtSuchanaID.getText().toString());
                            Intent intent = new Intent(getApplicationContext(), Agriculture_list.class);
                            intent.putExtras(IDBundle);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            getApplicationContext().startActivity(intent);

                        }
                    });
                    adb.show();
                }
            });
           /* ImageButton cmdForward = (ImageButton) findViewById(R.id.cmdForward);
            cmdForward.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Agriculture.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to return to Home [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            Intent intent = new Intent(getApplicationContext(), MainMenu.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            getApplicationContext().startActivity(intent);
                        }
                    });
                    adb.show();
                }
            });
*/
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
            spnMSlNo.setAdapter(C.getArrayAdapter("select H21 ||'-'||H22 from member where where RND='" + RND + "' and SuchanaID='"+ SUCHANAID + "' and cast(H26Y as int)>15"));
            seclbH151 = (LinearLayout) findViewById(R.id.seclbH151);
            secH151 = (LinearLayout) findViewById(R.id.secH151);
            lineH151 = (View) findViewById(R.id.lineH151);
            VlblH151 = (TextView) findViewById(R.id.VlblH151);
            rdogrpH151 = (RadioGroup) findViewById(R.id.rdogrpH151);

            rdoH1511 = (RadioButton) findViewById(R.id.rdoH1511);
            rdoH1512 = (RadioButton) findViewById(R.id.rdoH1512);
            rdogrpH151.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH151 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH151.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH151.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH151[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secSl.setVisibility(View.GONE);
                        lineSl.setVisibility(View.GONE);
                      //  txtSl.setText("");

                        secH152a.setVisibility(View.GONE);
                        lineH152a.setVisibility(View.GONE);
                        spnH152a.setSelection(0);
                        secH152bOth.setVisibility(View.GONE);
                        lineH152bOth.setVisibility(View.GONE);
                        txtH152bOth.setText("");
                        secH152b.setVisibility(View.GONE);
                        lineH152b.setVisibility(View.GONE);
                        spnH152b.setSelection(0);
                        secH152c.setVisibility(View.GONE);
                        lineH152c.setVisibility(View.GONE);
                        txtH152c.setText("");
                        secH152d1.setVisibility(View.GONE);
                        lineH152d1.setVisibility(View.GONE);
                        txtH152d1.setText("");
                        secH152d2.setVisibility(View.GONE);
                        lineH152d2.setVisibility(View.GONE);
                        rdogrpH152d2.clearCheck();
                        secH152e1.setVisibility(View.GONE);
                        lineH152e1.setVisibility(View.GONE);
                        txtH152e1.setText("");
                        secH152e2.setVisibility(View.GONE);
                        lineH152e2.setVisibility(View.GONE);
                        rdogrpH152e2.clearCheck();
                        secH152f.setVisibility(View.GONE);
                        lineH152f.setVisibility(View.GONE);
                        txtH152f.setText("");
                        secH152g.setVisibility(View.GONE);
                        lineH152g.setVisibility(View.GONE);
                        txtH152g.setText("");
                        secH152h1.setVisibility(View.GONE);
                        lineH152h1.setVisibility(View.GONE);
                        txtH152h1.setText("");
                        secH152h2.setVisibility(View.GONE);
                        lineH152h2.setVisibility(View.GONE);
                        rdogrpH152h2.clearCheck();
                        secH152i1.setVisibility(View.GONE);
                        lineH152i1.setVisibility(View.GONE);
                        txtH152i1.setText("");
                        secH152i2.setVisibility(View.GONE);
                        lineH152i2.setVisibility(View.GONE);
                        rdogrpH152i2.clearCheck();
                        secH152j1.setVisibility(View.GONE);
                        lineH152j1.setVisibility(View.GONE);
                        txtH152j1.setText("");
                        secH152j2.setVisibility(View.GONE);
                        lineH152j2.setVisibility(View.GONE);
                        rdogrpH152j2.clearCheck();
                        secH152k1.setVisibility(View.GONE);
                        lineH152k1.setVisibility(View.GONE);
                        txtH152k1.setText("");

                        secLb1H151b.setVisibility(View.GONE);
                        seclbH152c.setVisibility(View.GONE);
                        seclbH152d.setVisibility(View.GONE);
                        seclbH15e.setVisibility(View.GONE);
                        seclbh152f.setVisibility(View.GONE);
                        seclbH152g.setVisibility(View.GONE);
                        seclbH152h.setVisibility(View.GONE);
                        seclbH15i.setVisibility(View.GONE);
                        seclbH152j.setVisibility(View.GONE);
                        seclbH152k.setVisibility(View.GONE);
                        secH152k2.setVisibility(View.GONE);
                        rdogrpH152k2.clearCheck();



                    } else {
                        secSl.setVisibility(View.VISIBLE);
                        lineSl.setVisibility(View.VISIBLE);
                        secH152a.setVisibility(View.VISIBLE);
                        lineH152a.setVisibility(View.VISIBLE);
                       // secH152bOth.setVisibility(View.VISIBLE);
                     //   lineH152bOth.setVisibility(View.VISIBLE);
                        secH152b.setVisibility(View.VISIBLE);
                        lineH152b.setVisibility(View.VISIBLE);
                        secH152c.setVisibility(View.VISIBLE);
                        lineH152c.setVisibility(View.VISIBLE);
                        secH152d1.setVisibility(View.VISIBLE);
                        lineH152d1.setVisibility(View.VISIBLE);
                        secH152d2.setVisibility(View.VISIBLE);
                        lineH152d2.setVisibility(View.VISIBLE);
                        secH152e1.setVisibility(View.VISIBLE);
                        lineH152e1.setVisibility(View.VISIBLE);
                        secH152e2.setVisibility(View.VISIBLE);
                        lineH152e2.setVisibility(View.VISIBLE);
                        secH152f.setVisibility(View.VISIBLE);
                        lineH152f.setVisibility(View.VISIBLE);
                        secH152g.setVisibility(View.VISIBLE);
                        lineH152g.setVisibility(View.VISIBLE);
                        secH152h1.setVisibility(View.VISIBLE);
                        lineH152h1.setVisibility(View.VISIBLE);
                        secH152h2.setVisibility(View.VISIBLE);
                        lineH152h2.setVisibility(View.VISIBLE);
                        secH152i1.setVisibility(View.VISIBLE);
                        lineH152i1.setVisibility(View.VISIBLE);
                        secH152i2.setVisibility(View.VISIBLE);
                        lineH152i2.setVisibility(View.VISIBLE);
                        secH152j1.setVisibility(View.VISIBLE);
                        lineH152j1.setVisibility(View.VISIBLE);
                        secH152j2.setVisibility(View.VISIBLE);
                        lineH152j2.setVisibility(View.VISIBLE);
                        secH152k1.setVisibility(View.VISIBLE);
                        lineH152k1.setVisibility(View.VISIBLE);

                        secLb1H151b.setVisibility(View.VISIBLE);
                        seclbH152c.setVisibility(View.VISIBLE);
                        seclbH152d.setVisibility(View.VISIBLE);
                        seclbH15e.setVisibility(View.VISIBLE);
                        seclbh152f.setVisibility(View.VISIBLE);
                        seclbH152g.setVisibility(View.VISIBLE);
                        seclbH152h.setVisibility(View.VISIBLE);
                        seclbH15i.setVisibility(View.VISIBLE);
                        seclbH152j.setVisibility(View.VISIBLE);
                        seclbH152k.setVisibility(View.VISIBLE);
                        secH152k2.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secSl = (LinearLayout) findViewById(R.id.secSl);
            lineSl = (View) findViewById(R.id.lineSl);
            VlblSl = (TextView) findViewById(R.id.VlblSl);
            txtSl = (EditText) findViewById(R.id.txtSl);
            secH152a = (LinearLayout) findViewById(R.id.secH152a);
            lineH152a = (View) findViewById(R.id.lineH152a);
            VlblH152a = (TextView) findViewById(R.id.VlblH152a);
            spnH152a = (Spinner) findViewById(R.id.spnH152a);
            List<String> listH152a = new ArrayList<String>();

            listH152a.add("");
            listH152a.add("101-ধান");
            listH152a.add("102-গম");
            listH152a.add("103-অন্যান্য খাদ্য শস্য  (যেমন: ভুট্টা,  বার্লি, যব, ইত্যাদি)");
            listH152a.add("201-ধনচে");
            listH152a.add("202-পাট");
            listH152a.add("203-অন্যান্য তন্তু  জাতীয় ফসল (যেমন , তুলা ইত্যাদি)");
            listH152a.add("301-ডাল");
            listH152a.add("401-সরিষা");
            listH152a.add("402-সয়াবি");
            listH152a.add("403-অন্যান্য (তিল,তিষি)");
            listH152a.add("501-মরিচ");
            listH152a.add("502-পেয়াজ");
            listH152a.add("503-রসুন");
            listH152a.add("504-অন্যান্য (আদা, ধনে, হলুদ) ");
            listH152a.add("601-কুমড়া");
            listH152a.add("602-বেগুন");
            listH152a.add("603-পটল");
            listH152a.add("604-ঢেরস");
            listH152a.add("605-ঝিঙ্গা");
            listH152a.add("606-করলা");
            listH152a.add("607-ডাটা");
            listH152a.add("608-লাউ");
            listH152a.add("609-কাঁচা পেঁপে");
            listH152a.add("610-লেবু");
            listH152a.add("611-আলু");
            listH152a.add("612-শিম");
            listH152a.add("613-গাজর");
            listH152a.add("614-টমেটো");
            listH152a.add("615-সজনে  ");
            listH152a.add("616-পাতা সবজি  ");
            listH152a.add("701-হলুদ ফল");
            listH152a.add("702-সবুজ ফল");
            listH152a.add("801-রুই");
            listH152a.add("802-কাতলা");
            listH152a.add("803-মৃগেল");
            listH152a.add("804-তেলাপিয়");
            listH152a.add("805-পাঙ্গাস");
            listH152a.add("806-শেরপুটি");
            listH152a.add("807-পুটি");
            listH152a.add("808-মলা ");
            listH152a.add("809-অনান্য মাছ");
            listH152a.add("901-শুধু হাস-মুরগি ");
            listH152a.add("902-হাস-মুরগি ও ডিম");
            ArrayAdapter<String> adptrH152a = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH152a);
            spnH152a.setAdapter(adptrH152a);

            secH152bOth = (LinearLayout) findViewById(R.id.secH152bOth);
            lineH152bOth = (View) findViewById(R.id.lineH152bOth);
            VlblH152bOth = (TextView) findViewById(R.id.VlblH152bOth);
            txtH152bOth = (EditText) findViewById(R.id.txtH152bOth);

            secH152bOth.setVisibility(View.GONE);
            lineH152bOth.setVisibility(View.GONE);

            secLb1H151b = (LinearLayout) findViewById(R.id.secLb1H151b);
            secH152b = (LinearLayout) findViewById(R.id.secH152b);
            lineH152b = (View) findViewById(R.id.lineH152b);
            VlblH152b = (TextView) findViewById(R.id.VlblH152b);
            spnH152b = (Spinner) findViewById(R.id.spnH152b);
            List<String> listH152b = new ArrayList<String>();

            listH152b.add("");
            listH152b.add("01-ভিটেমাটি");
            listH152b.add("02-চাষযোগ্য/আবাদী জমি");
            listH152b.add("03-গবাদি পশুর চারণের উপযোগী ভূমি");
            listH152b.add("04-ঝোপ/জংলা জমি");
            listH152b.add("05-চাষযোগ্য পুকুর");
            listH152b.add("06-পরিত্যক্ত পুকুর");
            listH152b.add("07-বর্জ্য/অনাবাদি জমি");
            listH152b.add("08-নদীগর্ভের/হাওরের জমি");
            listH152b.add("09-অন্যান্য আবাসিক/বাণিজ্যিক প্লট ");
            listH152b.add("10-পুকুরের পাড়");
            ArrayAdapter<String> adptrH152b = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH152b);
            spnH152b.setAdapter(adptrH152b);

            seclbH152c = (LinearLayout) findViewById(R.id.seclbH152c);
            secH152c = (LinearLayout) findViewById(R.id.secH152c);
            lineH152c = (View) findViewById(R.id.lineH152c);
            VlblH152c = (TextView) findViewById(R.id.VlblH152c);
            txtH152c = (EditText) findViewById(R.id.txtH152c);
            seclbH152d = (LinearLayout) findViewById(R.id.seclbH152d);
            secH152d1 = (LinearLayout) findViewById(R.id.secH152d1);
            lineH152d1 = (View) findViewById(R.id.lineH152d1);
            VlblH152d1 = (TextView) findViewById(R.id.VlblH152d1);
            txtH152d1 = (EditText) findViewById(R.id.txtH152d1);
            secH152d2 = (LinearLayout) findViewById(R.id.secH152d2);
            lineH152d2 = (View) findViewById(R.id.lineH152d2);
            VlblH152d2 = (TextView) findViewById(R.id.VlblH152d2);
            rdogrpH152d2 = (RadioGroup) findViewById(R.id.rdogrpH152d2);

            rdoH152d21 = (RadioButton) findViewById(R.id.rdoH152d21);
            rdoH152d22 = (RadioButton) findViewById(R.id.rdoH152d22);
            seclbH15e = (LinearLayout) findViewById(R.id.seclbH15e);
            secH152e1 = (LinearLayout) findViewById(R.id.secH152e1);
            lineH152e1 = (View) findViewById(R.id.lineH152e1);
            VlblH152e1 = (TextView) findViewById(R.id.VlblH152e1);
            txtH152e1 = (EditText) findViewById(R.id.txtH152e1);
            secH152e2 = (LinearLayout) findViewById(R.id.secH152e2);
            lineH152e2 = (View) findViewById(R.id.lineH152e2);
            VlblH152e2 = (TextView) findViewById(R.id.VlblH152e2);
            rdogrpH152e2 = (RadioGroup) findViewById(R.id.rdogrpH152e2);

            rdoH152e21 = (RadioButton) findViewById(R.id.rdoH152e21);
            rdoH152e22 = (RadioButton) findViewById(R.id.rdoH152e22);
            seclbh152f = (LinearLayout) findViewById(R.id.seclbh152f);
            secH152f = (LinearLayout) findViewById(R.id.secH152f);
            lineH152f = (View) findViewById(R.id.lineH152f);
            VlblH152f = (TextView) findViewById(R.id.VlblH152f);
            txtH152f = (EditText) findViewById(R.id.txtH152f);
            seclbH152g = (LinearLayout) findViewById(R.id.seclbH152g);
            secH152g = (LinearLayout) findViewById(R.id.secH152g);
            lineH152g = (View) findViewById(R.id.lineH152g);
            VlblH152g = (TextView) findViewById(R.id.VlblH152g);
            txtH152g = (EditText) findViewById(R.id.txtH152g);
            seclbH152h = (LinearLayout) findViewById(R.id.seclbH152h);
            secH152h1 = (LinearLayout) findViewById(R.id.secH152h1);
            lineH152h1 = (View) findViewById(R.id.lineH152h1);
            VlblH152h1 = (TextView) findViewById(R.id.VlblH152h1);
            txtH152h1 = (EditText) findViewById(R.id.txtH152h1);
            secH152h2 = (LinearLayout) findViewById(R.id.secH152h2);
            lineH152h2 = (View) findViewById(R.id.lineH152h2);
            VlblH152h2 = (TextView) findViewById(R.id.VlblH152h2);
            rdogrpH152h2 = (RadioGroup) findViewById(R.id.rdogrpH152h2);

            rdoH152h21 = (RadioButton) findViewById(R.id.rdoH152h21);
            rdoH152h22 = (RadioButton) findViewById(R.id.rdoH152h22);
            seclbH15i = (LinearLayout) findViewById(R.id.seclbH15i);
            secH152i1 = (LinearLayout) findViewById(R.id.secH152i1);
            lineH152i1 = (View) findViewById(R.id.lineH152i1);
            VlblH152i1 = (TextView) findViewById(R.id.VlblH152i1);
            txtH152i1 = (EditText) findViewById(R.id.txtH152i1);
            secH152i2 = (LinearLayout) findViewById(R.id.secH152i2);
            lineH152i2 = (View) findViewById(R.id.lineH152i2);
            VlblH152i2 = (TextView) findViewById(R.id.VlblH152i2);
            rdogrpH152i2 = (RadioGroup) findViewById(R.id.rdogrpH152i2);

            rdoH152i21 = (RadioButton) findViewById(R.id.rdoH152i21);
            rdoH152i22 = (RadioButton) findViewById(R.id.rdoH152i22);
            seclbH152j = (LinearLayout) findViewById(R.id.seclbH152j);
            secH152j1 = (LinearLayout) findViewById(R.id.secH152j1);
            lineH152j1 = (View) findViewById(R.id.lineH152j1);
            VlblH152j1 = (TextView) findViewById(R.id.VlblH152j1);
            txtH152j1 = (EditText) findViewById(R.id.txtH152j1);
            secH152j2 = (LinearLayout) findViewById(R.id.secH152j2);
            lineH152j2 = (View) findViewById(R.id.lineH152j2);
            VlblH152j2 = (TextView) findViewById(R.id.VlblH152j2);
            rdogrpH152j2 = (RadioGroup) findViewById(R.id.rdogrpH152j2);

            rdoH152j21 = (RadioButton) findViewById(R.id.rdoH152j21);
            rdoH152j22 = (RadioButton) findViewById(R.id.rdoH152j22);
            seclbH152k = (LinearLayout) findViewById(R.id.seclbH152k);
            secH152k1 = (LinearLayout) findViewById(R.id.secH152k1);
            lineH152k1 = (View) findViewById(R.id.lineH152k1);
            VlblH152k1 = (TextView) findViewById(R.id.VlblH152k1);
            txtH152k1 = (EditText) findViewById(R.id.txtH152k1);
            secH152k2 = (LinearLayout) findViewById(R.id.secH152k2);
            lineH152k2 = (View) findViewById(R.id.lineH152k2);
            VlblH152k2 = (TextView) findViewById(R.id.VlblH152k2);
            rdogrpH152k2 = (RadioGroup) findViewById(R.id.rdogrpH152k2);

            rdoH152k21 = (RadioButton) findViewById(R.id.rdoH152k21);
            rdoH152k22 = (RadioButton) findViewById(R.id.rdoH152k22);


            txtRnd.setText(RND);
            txtRnd.setEnabled(false);
            txtSuchanaID.setText(SUCHANAID);
            txtSuchanaID.setEnabled(false);
            txtSl.setText(SL);
            txtSl.setEnabled(false);

            DataSearch(RND, SUCHANAID, SL);

            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(Agriculture.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(Agriculture.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(Agriculture.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(Agriculture.this, "Required field: উপকারভোগী/সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (!rdoH1511.isChecked() & !rdoH1512.isChecked() & secH151.isShown()) {
                Connection.MessageBox(Agriculture.this, "Select anyone options from (আপনার খানা কি বিগত 1 year এ জমি/জলাশয়ে নিজ দায়িত্বে (নিজ/ভাড়া নেয়া) শস্য আবাদ/ ভিটেমাটিতে উৎপাদন /মাছ চাষে জড়িত ছিল).");
                rdoH1511.requestFocus();
                return;
            } else if (txtSl.getText().toString().length() == 0 & secSl.isShown()) {
                Connection.MessageBox(Agriculture.this, "Required field: সিরিয়াল নাম্বার.");
                txtSl.requestFocus();
                return;
            } else if (Integer.valueOf(txtSl.getText().toString().length() == 0 ? "1" : txtSl.getText().toString()) < 1 || Integer.valueOf(txtSl.getText().toString().length() == 0 ? "10" : txtSl.getText().toString()) > 10) {
                Connection.MessageBox(Agriculture.this, "Value should be between 1 and 10(সিরিয়াল নাম্বার).");
                txtSl.requestFocus();
                return;
            } else if (spnH152a.getSelectedItemPosition() == 0 & secH152a.isShown()) {
                Connection.MessageBox(Agriculture.this, "Required field: Code.");
                spnH152a.requestFocus();
                return;
            } else if (txtH152bOth.getText().toString().length() == 0 & secH152bOth.isShown()) {
                Connection.MessageBox(Agriculture.this, "Required field: অন্যান্য.");
                txtH152bOth.requestFocus();
                return;
            } else if (spnH152b.getSelectedItemPosition() == 0 & secH152b.isShown()) {
                Connection.MessageBox(Agriculture.this, "Required field: code 2.");
                spnH152b.requestFocus();
                return;
            } else if (txtH152c.getText().toString().length() == 0 & secH152c.isShown()) {
                Connection.MessageBox(Agriculture.this, "Required field: জমি/পানির মাপ (জল আয়তন).");
                txtH152c.requestFocus();
                return;
            } else if (Integer.valueOf(txtH152c.getText().toString().length() == 0 ? "1" : txtH152c.getText().toString()) < 1 || Integer.valueOf(txtH152c.getText().toString().length() == 0 ? "99999" : txtH152c.getText().toString()) > 99999) {
                Connection.MessageBox(Agriculture.this, "Value should be between 1 and 99999(জমি/পানির মাপ (জল আয়তন)).");
                txtH152c.requestFocus();
                return;
            } else if (txtH152d1.getText().toString().length() == 0 & secH152d1.isShown()) {
                Connection.MessageBox(Agriculture.this, "Required field: কিলো/সংখ্যা.");
                txtH152d1.requestFocus();
                return;
            } else if (Integer.valueOf(txtH152d1.getText().toString().length() == 0 ? "1" : txtH152d1.getText().toString()) < 1 || Integer.valueOf(txtH152d1.getText().toString().length() == 0 ? "99999" : txtH152d1.getText().toString()) > 99999) {
                Connection.MessageBox(Agriculture.this, "Value should be between 1 and 99999(কিলো/সংখ্যা).");
                txtH152d1.requestFocus();
                return;
            } else if (!rdoH152d21.isChecked() & !rdoH152d22.isChecked() & secH152d2.isShown()) {
                Connection.MessageBox(Agriculture.this, "Select anyone options from (কিলো/সংখ্যা).");
                rdoH152d21.requestFocus();
                return;
            } else if (txtH152e1.getText().toString().length() == 0 & secH152e1.isShown()) {
                Connection.MessageBox(Agriculture.this, "Required field: কিলো/সংখ্যা.");
                txtH152e1.requestFocus();
                return;
            } else if (Integer.valueOf(txtH152e1.getText().toString().length() == 0 ? "1" : txtH152e1.getText().toString()) < 1 || Integer.valueOf(txtH152e1.getText().toString().length() == 0 ? "99999" : txtH152e1.getText().toString()) > 99999) {
                Connection.MessageBox(Agriculture.this, "Value should be between 1 and 99999(কিলো/সংখ্যা).");
                txtH152e1.requestFocus();
                return;
            } else if (!rdoH152e21.isChecked() & !rdoH152e22.isChecked() & secH152e2.isShown()) {
                Connection.MessageBox(Agriculture.this, "Select anyone options from (কিলো/সংখ্যা).");
                rdoH152e21.requestFocus();
                return;
            } else if (txtH152f.getText().toString().length() == 0 & secH152f.isShown()) {
                Connection.MessageBox(Agriculture.this, "Required field: বিক্রি করে কত টাকা পেয়েছিলেন.");
                txtH152f.requestFocus();
                return;
            } else if (Integer.valueOf(txtH152f.getText().toString().length() == 0 ? "1" : txtH152f.getText().toString()) < 1 || Integer.valueOf(txtH152f.getText().toString().length() == 0 ? "9999999" : txtH152f.getText().toString()) > 9999999) {
                Connection.MessageBox(Agriculture.this, "Value should be between 1 and 9999999(বিক্রি করে কত টাকা পেয়েছিলেন).");
                txtH152f.requestFocus();
                return;
            } else if (txtH152g.getText().toString().length() == 0 & secH152g.isShown()) {
                Connection.MessageBox(Agriculture.this, "Required field: কিলো.");
                txtH152g.requestFocus();
                return;
            } else if (Integer.valueOf(txtH152g.getText().toString().length() == 0 ? "1" : txtH152g.getText().toString()) < 1 || Integer.valueOf(txtH152g.getText().toString().length() == 0 ? "99999" : txtH152g.getText().toString()) > 99999) {
                Connection.MessageBox(Agriculture.this, "Value should be between 1 and 99999(কিলো).");
                txtH152g.requestFocus();
                return;
            } else if (txtH152h1.getText().toString().length() == 0 & secH152h1.isShown()) {
                Connection.MessageBox(Agriculture.this, "Required field: কিলো/সংখ্যা.");
                txtH152h1.requestFocus();
                return;
            } else if (Integer.valueOf(txtH152h1.getText().toString().length() == 0 ? "1" : txtH152h1.getText().toString()) < 1 || Integer.valueOf(txtH152h1.getText().toString().length() == 0 ? "99999" : txtH152h1.getText().toString()) > 99999) {
                Connection.MessageBox(Agriculture.this, "Value should be between 1 and 99999(কিলো/সংখ্যা).");
                txtH152h1.requestFocus();
                return;
            } else if (!rdoH152h21.isChecked() & !rdoH152h22.isChecked() & secH152h2.isShown()) {
                Connection.MessageBox(Agriculture.this, "Select anyone options from (কিলো/সংখ্যা).");
                rdoH152h21.requestFocus();
                return;
            } else if (txtH152i1.getText().toString().length() == 0 & secH152i1.isShown()) {
                Connection.MessageBox(Agriculture.this, "Required field: কিলো/সংখ্যা.");
                txtH152i1.requestFocus();
                return;
            } else if (Integer.valueOf(txtH152i1.getText().toString().length() == 0 ? "1" : txtH152i1.getText().toString()) < 1 || Integer.valueOf(txtH152i1.getText().toString().length() == 0 ? "99999" : txtH152i1.getText().toString()) > 99999) {
                Connection.MessageBox(Agriculture.this, "Value should be between 1 and 99999(কিলো/সংখ্যা).");
                txtH152i1.requestFocus();
                return;
            } else if (!rdoH152i21.isChecked() & !rdoH152i22.isChecked() & secH152i2.isShown()) {
                Connection.MessageBox(Agriculture.this, "Select anyone options from (কিলো/সংখ্যা).");
                rdoH152i21.requestFocus();
                return;
            } else if (txtH152j1.getText().toString().length() == 0 & secH152j1.isShown()) {
                Connection.MessageBox(Agriculture.this, "Required field: কিলো/সংখ্যা.");
                txtH152j1.requestFocus();
                return;
            } else if (Integer.valueOf(txtH152j1.getText().toString().length() == 0 ? "1" : txtH152j1.getText().toString()) < 1 || Integer.valueOf(txtH152j1.getText().toString().length() == 0 ? "99999" : txtH152j1.getText().toString()) > 99999) {
                Connection.MessageBox(Agriculture.this, "Value should be between 1 and 99999(কিলো/সংখ্যা).");
                txtH152j1.requestFocus();
                return;
            } else if (!rdoH152j21.isChecked() & !rdoH152j22.isChecked() & secH152j2.isShown()) {
                Connection.MessageBox(Agriculture.this, "Select anyone options from (কিলো/সংখ্যা).");
                rdoH152j21.requestFocus();
                return;
            } else if (txtH152k1.getText().toString().length() == 0 & secH152k1.isShown()) {
                Connection.MessageBox(Agriculture.this, "Required field: কিলো/সংখ্যা.");
                txtH152k1.requestFocus();
                return;
            } else if (Integer.valueOf(txtH152k1.getText().toString().length() == 0 ? "1" : txtH152k1.getText().toString()) < 1 || Integer.valueOf(txtH152k1.getText().toString().length() == 0 ? "99999" : txtH152k1.getText().toString()) > 99999) {
                Connection.MessageBox(Agriculture.this, "Value should be between 1 and 99999(কিলো/সংখ্যা).");
                txtH152k1.requestFocus();
                return;
            } else if (!rdoH152k21.isChecked() & !rdoH152k22.isChecked() & secH152k2.isShown()) {
                Connection.MessageBox(Agriculture.this, "Select anyone options from (কিলো/সংখ্যা).");
                rdoH152k21.requestFocus();
                return;
            }

            if(Integer.valueOf(txtH152d1.getText().toString())<(Integer.valueOf(txtH152e1.getText().toString())+Integer.valueOf(txtH152g.getText().toString())+Integer.valueOf(txtH152h1.getText().toString())+Integer.valueOf(txtH152i1.getText().toString())+Integer.valueOf(txtH152j1.getText().toString())+Integer.valueOf(txtH152k1.getText().toString())))
            {
                Connection.MessageBox(Agriculture.this, "Production quantity and expenditure inconsistent .");
                return;
            }

            String SQL = "";
            RadioButton rb;

            Agriculture_DataModel objSave = new Agriculture_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setMSlNo(Connection.SelectedSpinnerValue(spnMSlNo.getSelectedItem().toString(), "-"));
            String[] d_rdogrpH151 = new String[]{"1", "0"};
            objSave.setH151("");
            for (int i = 0; i < rdogrpH151.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH151.getChildAt(i);
                if (rb.isChecked()) objSave.setH151(d_rdogrpH151[i]);
            }

            objSave.setSl(txtSl.getText().toString());
            objSave.setH152a((spnH152a.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH152a.getSelectedItem().toString(), "-")));
            objSave.setH152bOth(txtH152bOth.getText().toString());
            objSave.setH152b((spnH152b.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH152b.getSelectedItem().toString(), "-")));
            objSave.setH152c(txtH152c.getText().toString());
            objSave.setH152d1(txtH152d1.getText().toString());
            String[] d_rdogrpH152d2 = new String[]{"1", "2"};
            objSave.setH152d2("");
            for (int i = 0; i < rdogrpH152d2.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH152d2.getChildAt(i);
                if (rb.isChecked()) objSave.setH152d2(d_rdogrpH152d2[i]);
            }

            objSave.setH152e1(txtH152e1.getText().toString());
            String[] d_rdogrpH152e2 = new String[]{"1", "2"};
            objSave.setH152e2("");
            for (int i = 0; i < rdogrpH152e2.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH152e2.getChildAt(i);
                if (rb.isChecked()) objSave.setH152e2(d_rdogrpH152e2[i]);
            }

            objSave.setH152f(txtH152f.getText().toString());
            objSave.setH152g(txtH152g.getText().toString());
            objSave.setH152h1(txtH152h1.getText().toString());
            String[] d_rdogrpH152h2 = new String[]{"1", "2"};
            objSave.setH152h2("");
            for (int i = 0; i < rdogrpH152h2.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH152h2.getChildAt(i);
                if (rb.isChecked()) objSave.setH152h2(d_rdogrpH152h2[i]);
            }

            objSave.setH152i1(txtH152i1.getText().toString());
            String[] d_rdogrpH152i2 = new String[]{"1", "2"};
            objSave.setH152i2("");
            for (int i = 0; i < rdogrpH152i2.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH152i2.getChildAt(i);
                if (rb.isChecked()) objSave.setH152i2(d_rdogrpH152i2[i]);
            }

            objSave.setH152j1(txtH152j1.getText().toString());
            String[] d_rdogrpH152j2 = new String[]{"1", "2"};
            objSave.setH152j2("");
            for (int i = 0; i < rdogrpH152j2.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH152j2.getChildAt(i);
                if (rb.isChecked()) objSave.setH152j2(d_rdogrpH152j2[i]);
            }

            objSave.setH152k1(txtH152k1.getText().toString());
            String[] d_rdogrpH152k2 = new String[]{"1", "2"};
            objSave.setH152k2("");
            for (int i = 0; i < rdogrpH152k2.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH152k2.getChildAt(i);
                if (rb.isChecked()) objSave.setH152k2(d_rdogrpH152k2[i]);
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

                Bundle IDBundle = new Bundle();
                finish();
                IDBundle.putString("Rnd", txtRnd.getText().toString());
                IDBundle.putString("SuchanaID", txtSuchanaID.getText().toString());
                startActivity(new Intent(Agriculture.this, Agriculture_list.class).putExtras(IDBundle));


            } else {
                Connection.MessageBox(Agriculture.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(Agriculture.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID, String Sl) {
        try {

            RadioButton rb;
            Agriculture_DataModel d = new Agriculture_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "' and Sl='" + Sl + "'";
            List<Agriculture_DataModel> data = d.SelectAll(this, SQL);
            for (Agriculture_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                String[] d_rdogrpH151 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH151.length; i++) {
                    if (item.getH151().equals(String.valueOf(d_rdogrpH151[i]))) {
                        rb = (RadioButton) rdogrpH151.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtSl.setText(item.getSl());
                spnH152a.setSelection(Global.SpinnerItemPositionAnyLength(spnH152a, item.getH152a()));
                txtH152bOth.setText(item.getH152bOth());
                spnH152b.setSelection(Global.SpinnerItemPositionAnyLength(spnH152b, item.getH152b()));
                txtH152c.setText(item.getH152c());
                txtH152d1.setText(item.getH152d1());
                String[] d_rdogrpH152d2 = new String[]{"1", "2"};
                for (int i = 0; i < d_rdogrpH152d2.length; i++) {
                    if (item.getH152d2().equals(String.valueOf(d_rdogrpH152d2[i]))) {
                        rb = (RadioButton) rdogrpH152d2.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH152e1.setText(item.getH152e1());
                String[] d_rdogrpH152e2 = new String[]{"1", "2"};
                for (int i = 0; i < d_rdogrpH152e2.length; i++) {
                    if (item.getH152e2().equals(String.valueOf(d_rdogrpH152e2[i]))) {
                        rb = (RadioButton) rdogrpH152e2.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH152f.setText(item.getH152f());
                txtH152g.setText(item.getH152g());
                txtH152h1.setText(item.getH152h1());
                String[] d_rdogrpH152h2 = new String[]{"1", "2"};
                for (int i = 0; i < d_rdogrpH152h2.length; i++) {
                    if (item.getH152h2().equals(String.valueOf(d_rdogrpH152h2[i]))) {
                        rb = (RadioButton) rdogrpH152h2.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH152i1.setText(item.getH152i1());
                String[] d_rdogrpH152i2 = new String[]{"1", "2"};
                for (int i = 0; i < d_rdogrpH152i2.length; i++) {
                    if (item.getH152i2().equals(String.valueOf(d_rdogrpH152i2[i]))) {
                        rb = (RadioButton) rdogrpH152i2.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH152j1.setText(item.getH152j1());
                String[] d_rdogrpH152j2 = new String[]{"1", "2"};
                for (int i = 0; i < d_rdogrpH152j2.length; i++) {
                    if (item.getH152j2().equals(String.valueOf(d_rdogrpH152j2[i]))) {
                        rb = (RadioButton) rdogrpH152j2.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH152k1.setText(item.getH152k1());
                String[] d_rdogrpH152k2 = new String[]{"1", "2"};
                for (int i = 0; i < d_rdogrpH152k2.length; i++) {
                    if (item.getH152k2().equals(String.valueOf(d_rdogrpH152k2[i]))) {
                        rb = (RadioButton) rdogrpH152k2.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
            }
        } catch (Exception e) {
            Connection.MessageBox(Agriculture.this, e.getMessage());
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