package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".SES" android:label="SES" />

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
import android.widget.CheckBox;
import android.widget.CompoundButton;
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

public class SES extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    static String H21 = "";
    boolean networkAvailable = false;
    Location currentLocation;
    double currentLatitude, currentLongitude;
    String VariableID;
    Connection C;
    Global g;
    SimpleAdapter dataAdapter;
    ArrayList<HashMap<String, String>> dataList = new ArrayList<HashMap<String, String>>();

    Spinner spnMSlNo;
    TextView lblHeading;
    LinearLayout seclblH311;
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
    EditText txtMSlNo;
    LinearLayout secH311;
    View lineH311;
    TextView VlblH311;
    Spinner spnH311;
    LinearLayout secH312;
    View lineH312;
    TextView VlblH312;
    EditText txtH312;
    LinearLayout secH313;
    View lineH313;
    TextView VlblH313;
    EditText txtH313;
    LinearLayout seclblH321;
    LinearLayout secH321;
    View lineH321;
    TextView VlblH321;
    Spinner spnH321;
    LinearLayout secH321X;
    View lineH321X;
    TextView VlblH321X;
    EditText txtH321X;
    LinearLayout secH322;
    View lineH322;
    TextView VlblH322;
    Spinner spnH322;
    LinearLayout secH322X;
    View lineH322X;
    TextView VlblH322X;
    EditText txtH322X;
    LinearLayout secH323;
    View lineH323;
    TextView VlblH323;
    Spinner spnH323;
    LinearLayout secH323X;
    View lineH323X;
    TextView VlblH323X;
    EditText txtH323X;
    LinearLayout secH324;
    View lineH324;
    TextView VlblH324;
    Spinner spnH324;
    LinearLayout secH324X;
    View lineH324X;
    TextView VlblH324X;
    EditText txtH324X;
    LinearLayout secH325;
    View lineH325;
    TextView VlblH325;
    Spinner spnH325;
    LinearLayout secH325X;
    View lineH325X;
    TextView VlblH325X;
    EditText txtH325X;
    LinearLayout seclblH331;
    LinearLayout secH331;
    View lineH331;
    TextView VlblH331;
    RadioGroup rdogrpH331;
    RadioButton rdoH3311;
    RadioButton rdoH3312;
    RadioButton rdoH3313;
    LinearLayout secH332A;
    View lineH332A;
    TextView VlblH332A;
    EditText txtH332A;
    LinearLayout secH332B;
    View lineH332B;
    TextView VlblH332B;
    EditText txtH332B;
    LinearLayout seclblH341;
    LinearLayout secH341;
    View lineH341;
    TextView VlblH341;
    RadioGroup rdogrpH341;
    RadioButton rdoH3411;
    RadioButton rdoH3412;
    LinearLayout secH342;
    View lineH342;
    TextView VlblH342;
    EditText txtH342;
    LinearLayout seclbH61;
    LinearLayout secH61;
    View lineH61;
    TextView VlblH61;
    RadioGroup rdogrpH61;
    RadioButton rdoH611;
    RadioButton rdoH612;
    RadioButton rdoH613;
    LinearLayout secH62;
    View lineH62;
    TextView VlblH62;
    RadioGroup rdogrpH62;
    RadioButton rdoH621;
    RadioButton rdoH622;
    RadioButton rdoH623;
    RadioButton rdoH624;
    RadioButton rdoH625;
    RadioButton rdoH626;
    RadioButton rdoH627;
    LinearLayout seclblH63;
    LinearLayout secH63A;
    View lineH63A;
    TextView VlblH63A;
    Spinner spnH63A;
    LinearLayout secH63AX;
    View lineH63AX;
    TextView VlblH63AX;
    EditText txtH63AX;
    LinearLayout secH63B;
    View lineH63B;
    TextView VlblH63B;
    Spinner spnH63B;
    LinearLayout secH63BX;
    View lineH63BX;
    TextView VlblH63BX;
    EditText txtH63BX;
    LinearLayout secH63C;
    View lineH63C;
    TextView VlblH63C;
    Spinner spnH63C;
    LinearLayout secH63CX;
    View lineH63CX;
    TextView VlblH63CX;
    EditText txtH63CX;
    LinearLayout secH63D;
    View lineH63D;
    TextView VlblH63D;
    Spinner spnH63D;
    LinearLayout secH63DX;
    View lineH63DX;
    TextView VlblH63DX;
    EditText txtH63DX;
    LinearLayout secH63E;
    View lineH63E;
    TextView VlblH63E;
    Spinner spnH63E;
    LinearLayout secH63EX;
    View lineH63EX;
    TextView VlblH63EX;
    EditText txtH63EX;
    LinearLayout secH63X;
    View lineH63X;
    TextView VlblH63X;
    EditText txtH63X;
    LinearLayout seclblH64;
    LinearLayout secH64;
    View lineH64;
    TextView VlblH64;
    RadioGroup rdogrpH64;
    RadioButton rdoH641;
    RadioButton rdoH642;
    LinearLayout secH65;
    View lineH65;
    TextView VlblH65;
    RadioGroup rdogrpH65;
    RadioButton rdoH651;
    RadioButton rdoH652;
    LinearLayout secH66;
    View lineH66;
    TextView VlblH66;
    RadioGroup rdogrpH66;
    RadioButton rdoH661;
    RadioButton rdoH662;
    LinearLayout secH67;
    View lineH67;
    TextView VlblH67;
    RadioGroup rdogrpH67;
    RadioButton rdoH671;
    RadioButton rdoH672;
    LinearLayout secH68;
    View lineH68;
    TextView VlblH68;
    RadioGroup rdogrpH68;
    RadioButton rdoH681;
    RadioButton rdoH682;
    LinearLayout secH69;
    View lineH69;
    TextView VlblH69;
    RadioGroup rdogrpH69;
    RadioButton rdoH691;
    RadioButton rdoH692;
    LinearLayout seclblH610R;
    LinearLayout secH610R;
    View lineH610R;
    TextView VlblH610R;
    Spinner spnH610R;
    LinearLayout secH610RX;
    View lineH610RX;
    TextView VlblH610RX;
    EditText txtH610RX;
    LinearLayout secH610D;
    View lineH610D;
    TextView VlblH610D;
    Spinner spnH610D;
    LinearLayout secH610DX;
    View lineH610DX;
    TextView VlblH610DX;
    EditText txtH610DX;
    LinearLayout secH610a;
    View lineH610a;
    TextView VlblH610a;
    RadioGroup rdogrpH610a;
    RadioButton rdoH610a1;
    RadioButton rdoH610a2;
    RadioButton rdoH610a3;
    LinearLayout seclblH6101;
    LinearLayout secH610b1;
    View lineH610b1;
    TextView VlblH610b1;
    CheckBox chkH610b1;
    LinearLayout secH610b2;
    View lineH610b2;
    TextView VlblH610b2;
    CheckBox chkH610b2;
    LinearLayout secH610b3;
    View lineH610b3;
    TextView VlblH610b3;
    CheckBox chkH610b3;
    LinearLayout secH610b4;
    View lineH610b4;
    TextView VlblH610b4;
    CheckBox chkH610b4;
    LinearLayout secH610b5;
    View lineH610b5;
    TextView VlblH610b5;
    CheckBox chkH610b5;
    LinearLayout secH610b5X;
    View lineH610b5X;
    TextView VlblH610b5X;
    EditText txtH610b5X;
    LinearLayout secH610b6;
    View lineH610b6;
    TextView VlblH610b6;
    CheckBox chkH610b6;
    LinearLayout secH610c;
    View lineH610c;
    TextView VlblH610c;
    RadioGroup rdogrpH610c;
    RadioButton rdoH610c1;
    RadioButton rdoH610c2;
    LinearLayout seclblH611;
    LinearLayout secH611R;
    View lineH611R;
    TextView VlblH611R;
    Spinner spnH611R;
    LinearLayout secH611RX;
    View lineH611RX;
    TextView VlblH611RX;
    EditText txtH611RX;
    LinearLayout secH611D;
    View lineH611D;
    TextView VlblH611D;
    Spinner spnH611D;
    LinearLayout secH611DX;
    View lineH611DX;
    TextView VlblH611DX;
    EditText txtH611DX;
    LinearLayout secH611a;
    View lineH611a;
    TextView VlblH611a;
    RadioGroup rdogrpH611a;
    RadioButton rdoH611a1;
    RadioButton rdoH611a2;
    RadioButton rdoH611a3;
    LinearLayout seclblH6111;
    LinearLayout secH611b1;
    View lineH611b1;
    TextView VlblH611b1;
    CheckBox chkH611b1;
    LinearLayout secH611b2;
    View lineH611b2;
    TextView VlblH611b2;
    CheckBox chkH611b2;
    LinearLayout secH611b3;
    View lineH611b3;
    TextView VlblH611b3;
    CheckBox chkH611b3;
    LinearLayout secH611b4;
    View lineH611b4;
    TextView VlblH611b4;
    CheckBox chkH611b4;
    LinearLayout secH611b5;
    View lineH611b5;
    TextView VlblH611b5;
    CheckBox chkH611b5;
    LinearLayout secH611b5X;
    View lineH611b5X;
    TextView VlblH611b5X;
    EditText txtH611b5X;
    LinearLayout secH611b6;
    View lineH611b6;
    TextView VlblH611b6;
    CheckBox chkH611b6;
    LinearLayout secH611c;
    View lineH611c;
    TextView VlblH611c;
    RadioGroup rdogrpH611c;
    RadioButton rdoH611c1;
    RadioButton rdoH611c2;
    LinearLayout seclblH612;
    LinearLayout secH612R;
    View lineH612R;
    TextView VlblH612R;
    Spinner spnH612R;
    LinearLayout secH612RX;
    View lineH612RX;
    TextView VlblH612RX;
    EditText txtH612RX;
    LinearLayout secH612D;
    View lineH612D;
    TextView VlblH612D;
    Spinner spnH612D;
    LinearLayout secH612DX;
    View lineH612DX;
    TextView VlblH612DX;
    EditText txtH612DX;
    LinearLayout secH612a;
    View lineH612a;
    TextView VlblH612a;
    RadioGroup rdogrpH612a;
    RadioButton rdoH612a1;
    RadioButton rdoH612a2;
    RadioButton rdoH612a3;
    LinearLayout seclblH6121;
    LinearLayout secH612b1;
    View lineH612b1;
    TextView VlblH612b1;
    CheckBox chkH612b1;
    LinearLayout secH612b2;
    View lineH612b2;
    TextView VlblH612b2;
    CheckBox chkH612b2;
    LinearLayout secH612b3;
    View lineH612b3;
    TextView VlblH612b3;
    CheckBox chkH612b3;
    LinearLayout secH612b4;
    View lineH612b4;
    TextView VlblH612b4;
    CheckBox chkH612b4;
    LinearLayout secH612b5;
    View lineH612b5;
    TextView VlblH612b5;
    CheckBox chkH612b5;
    LinearLayout secH612b5X;
    View lineH612b5X;
    TextView VlblH612b5X;
    EditText txtH612b5X;
    LinearLayout secH612b6;
    View lineH612b6;
    TextView VlblH612b6;
    CheckBox chkH612b6;
    LinearLayout secH612c;
    View lineH612c;
    TextView VlblH612c;
    RadioGroup rdogrpH612c;
    RadioButton rdoH612c1;
    RadioButton rdoH612c2;
    LinearLayout seclblH613;
    LinearLayout secH613R;
    View lineH613R;
    TextView VlblH613R;
    Spinner spnH613R;
    LinearLayout secH613RX;
    View lineH613RX;
    TextView VlblH613RX;
    EditText txtH613RX;
    LinearLayout secH613D;
    View lineH613D;
    TextView VlblH613D;
    Spinner spnH613D;
    LinearLayout secH613DX;
    View lineH613DX;
    TextView VlblH613DX;
    EditText txtH613DX;
    LinearLayout secH613a;
    View lineH613a;
    TextView VlblH613a;
    RadioGroup rdogrpH613a;
    RadioButton rdoH613a1;
    RadioButton rdoH613a2;
    RadioButton rdoH613a3;
    LinearLayout seclblH6131;
    LinearLayout secH613b1;
    View lineH613b1;
    TextView VlblH613b1;
    CheckBox chkH613b1;
    LinearLayout secH613b2;
    View lineH613b2;
    TextView VlblH613b2;
    CheckBox chkH613b2;
    LinearLayout secH613b3;
    View lineH613b3;
    TextView VlblH613b3;
    CheckBox chkH613b3;
    LinearLayout secH613b4;
    View lineH613b4;
    TextView VlblH613b4;
    CheckBox chkH613b4;
    LinearLayout secH613b5;
    View lineH613b5;
    TextView VlblH613b5;
    CheckBox chkH613b5;
    LinearLayout secH613b5X;
    View lineH613b5X;
    TextView VlblH613b5X;
    EditText txtH613b5X;
    LinearLayout secH613b6;
    View lineH613b6;
    TextView VlblH613b6;
    CheckBox chkH613b6;
    LinearLayout secH613c;
    View lineH613c;
    TextView VlblH613c;
    RadioGroup rdogrpH613c;
    RadioButton rdoH613c1;
    RadioButton rdoH613c2;
    LinearLayout seclblH614;
    LinearLayout secH614R;
    View lineH614R;
    TextView VlblH614R;
    Spinner spnH614R;
    LinearLayout secH614RX;
    View lineH614RX;
    TextView VlblH614RX;
    EditText txtH614RX;
    LinearLayout secH614D;
    View lineH614D;
    TextView VlblH614D;
    Spinner spnH614D;
    LinearLayout secH614DX;
    View lineH614DX;
    TextView VlblH614DX;
    EditText txtH614DX;
    LinearLayout secH614a;
    View lineH614a;
    TextView VlblH614a;
    RadioGroup rdogrpH614a;
    RadioButton rdoH614a1;
    RadioButton rdoH614a2;
    RadioButton rdoH614a3;
    LinearLayout seclblH6141;
    LinearLayout secH614b1;
    View lineH614b1;
    TextView VlblH614b1;
    CheckBox chkH614b1;
    LinearLayout secH614b2;
    View lineH614b2;
    TextView VlblH614b2;
    CheckBox chkH614b2;
    LinearLayout secH614b3;
    View lineH614b3;
    TextView VlblH614b3;
    CheckBox chkH614b3;
    LinearLayout secH614b4;
    View lineH614b4;
    TextView VlblH614b4;
    CheckBox chkH614b4;
    LinearLayout secH614b5;
    View lineH614b5;
    TextView VlblH614b5;
    CheckBox chkH614b5;
    LinearLayout secH614b5X;
    View lineH614b5X;
    TextView VlblH614b5X;
    EditText txtH614b5X;
    LinearLayout secH614b6;
    View lineH614b6;
    TextView VlblH614b6;
    CheckBox chkH614b6;
    LinearLayout secH614c;
    View lineH614c;
    TextView VlblH614c;
    RadioGroup rdogrpH614c;
    RadioButton rdoH614c1;
    RadioButton rdoH614c2;
    LinearLayout seclblH615;
    LinearLayout secH615a;
    View lineH615a;
    TextView VlblH615a;
    EditText txtH615a;
    LinearLayout secH615b;
    View lineH615b;
    TextView VlblH615b;
    EditText txtH615b;
    LinearLayout secH616;
    View lineH616;
    TextView VlblH616;
    RadioGroup rdogrpH616;
    RadioButton rdoH6161;
    RadioButton rdoH6162;
    LinearLayout secH617;
    View lineH617;
    TextView VlblH617;
    RadioGroup rdogrpH617;
    RadioButton rdoH6171;
    RadioButton rdoH6172;
    LinearLayout secH618;
    View lineH618;
    TextView VlblH618;
    Spinner spnH618;
    LinearLayout secH618X;
    View lineH618X;
    TextView VlblH618X;
    EditText txtH618X;
    LinearLayout secH619;
    View lineH619;
    TextView VlblH619;
    RadioGroup rdogrpH619;
    RadioButton rdoH6191;
    RadioButton rdoH6192;
    LinearLayout secH620;
    View lineH620;
    TextView VlblH620;
    RadioGroup rdogrpH620;
    RadioButton rdoH6201;
    RadioButton rdoH6202;
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
            setContentView(R.layout.ses);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");
            H21 = IDbundle.getString("H21");
            TableName = "SES";

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
                    AlertDialog.Builder adb = new AlertDialog.Builder(SES.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Member_list.class);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(SES.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to return to Home [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(), AssetB.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            Bundle IDBundle = new Bundle();
                            IDBundle.putString("Rnd", RND);
                            IDBundle.putString("SuchanaID", SUCHANAID);
                            intent.putExtras(IDBundle);
                            getApplicationContext().startActivity(intent);
                            finish();
                        }
                    });
                    adb.show();
                }
            });

            spnMSlNo = (Spinner) findViewById(R.id.spnMSlNo);
            spnMSlNo.setAdapter(C.getArrayAdapter("Select '' union Select H21||'-'||H22 from Member where Rnd='" + RND + "' and SuchanaId='" + SUCHANAID + "'"));

            seclblH311 = (LinearLayout) findViewById(R.id.seclblH311);
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
            secMSlNo = (LinearLayout) findViewById(R.id.secMSlNo);
            lineMSlNo = (View) findViewById(R.id.lineMSlNo);
            VlblMSlNo = (TextView) findViewById(R.id.VlblMSlNo);
            txtMSlNo = (EditText) findViewById(R.id.txtMSlNo);

            secH311 = (LinearLayout) findViewById(R.id.secH311);
            lineH311 = (View) findViewById(R.id.lineH311);
            VlblH311 = (TextView) findViewById(R.id.VlblH311);
            spnH311 = (Spinner) findViewById(R.id.spnH311);
            List<String> listH311 = new ArrayList<String>();

            listH311.add("");
            listH311.add("1-নিজস্ব");
            listH311.add("2-ভাড়াটে");
            listH311.add("3-অন্যের অনুগ্রহে প্রাপ্ত জায়গা");
            listH311.add("4-অবৈধভাবে বাস");
            ArrayAdapter<String> adptrH311 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH311);
            spnH311.setAdapter(adptrH311);

            secH312 = (LinearLayout) findViewById(R.id.secH312);
            lineH312 = (View) findViewById(R.id.lineH312);
            VlblH312 = (TextView) findViewById(R.id.VlblH312);
            txtH312 = (EditText) findViewById(R.id.txtH312);
            secH313 = (LinearLayout) findViewById(R.id.secH313);
            lineH313 = (View) findViewById(R.id.lineH313);
            VlblH313 = (TextView) findViewById(R.id.VlblH313);
            txtH313 = (EditText) findViewById(R.id.txtH313);
            seclblH321 = (LinearLayout) findViewById(R.id.seclblH321);
            secH321 = (LinearLayout) findViewById(R.id.secH321);
            lineH321 = (View) findViewById(R.id.lineH321);
            VlblH321 = (TextView) findViewById(R.id.VlblH321);
            spnH321 = (Spinner) findViewById(R.id.spnH321);
            List<String> listH321 = new ArrayList<String>();

            listH321.add("");
            listH321.add("1-প্রাকৃতিক উপাদানের তৈরী মেঝে (কাদামাটি বালি)");
            listH321.add("2-কাচা মেঝে (কাঠের তক্তা তাল গাছ বাশ)");
            listH321.add("3-পাকা মেঝে (সিরামিক টাইলস ইট সিমেন্ট)");
            listH321.add("4-অন্যান্য");
            ArrayAdapter<String> adptrH321 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH321);
            spnH321.setAdapter(adptrH321);

            spnH321.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH321.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH321.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("1")) {
                        secH321X.setVisibility(View.GONE);
                        lineH321X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("2")) {
                        secH321X.setVisibility(View.GONE);
                        lineH321X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("3")) {
                        secH321X.setVisibility(View.GONE);
                        lineH321X.setVisibility(View.GONE);
                    } else {
                        secH321X.setVisibility(View.VISIBLE);
                        lineH321X.setVisibility(View.VISIBLE);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH321X = (LinearLayout) findViewById(R.id.secH321X);

            lineH321X = (View) findViewById(R.id.lineH321X);
            VlblH321X = (TextView) findViewById(R.id.VlblH321X);
            txtH321X = (EditText) findViewById(R.id.txtH321X);
            secH322 = (LinearLayout) findViewById(R.id.secH322);
            lineH322 = (View) findViewById(R.id.lineH322);
            VlblH322 = (TextView) findViewById(R.id.VlblH322);
            spnH322 = (Spinner) findViewById(R.id.spnH322);
            List<String> listH322 = new ArrayList<String>();

            listH322.add("");
            listH322.add("1- প্রাকৃতিক উপাদানের তৈরী ছাদ (খড় অথবা তালপাতা অথবা নারিকেল পাতা প্রভৃতি)");
            listH322.add("2-কাচা ছাদ (কাঠের তক্তা/তালগাছ/বাশ/কার্ডবোর্ড/পলিথিন/চাটাই)");
            listH322.add("3-পাকা ছাদ (টিন,কাঠ,টালি,ইট সিমেন্ট,সুরকি)");
            listH322.add("4-অন্যান্য");
            ArrayAdapter<String> adptrH322 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH322);
            spnH322.setAdapter(adptrH322);

            spnH322.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH322.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH322.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("1")) {
                        secH322X.setVisibility(View.GONE);
                        lineH322X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("2")) {
                        secH322X.setVisibility(View.GONE);
                        lineH322X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("3")) {
                        secH322X.setVisibility(View.GONE);
                        lineH322X.setVisibility(View.GONE);
                    } else {
                        secH322X.setVisibility(View.VISIBLE);
                        lineH322X.setVisibility(View.VISIBLE);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH322X = (LinearLayout) findViewById(R.id.secH322X);
            lineH322X = (View) findViewById(R.id.lineH322X);
            VlblH322X = (TextView) findViewById(R.id.VlblH322X);
            txtH322X = (EditText) findViewById(R.id.txtH322X);
            secH323 = (LinearLayout) findViewById(R.id.secH323);
            lineH323 = (View) findViewById(R.id.lineH323);
            VlblH323 = (TextView) findViewById(R.id.VlblH323);
            spnH323 = (Spinner) findViewById(R.id.spnH323);
            List<String> listH323 = new ArrayList<String>();

            listH323.add("");
            listH323.add("1-প্রাকৃতিক উপাদানের তৈরী দেয়াল (দেয়াল নেই/বেত/ইক্ষু জাতীয় পাতা/তাল পাতা/গাছের গুড়ি/কাদা মাটি)");
            listH323.add("2-কাচা দেয়াল (বাশ ও মাটি,পাথর টি,প্লাইউড,কার্ডবোর্ড/পলিথিন/চাটাই)");
            listH323.add("3-পাকা দেয়াল (টিন,সিমেন্ট,পাথর ও চুন,সিমেন্ট/ ইট,কাঠের তক্তা/ফলক");
            listH323.add("4-অন্যান্য");
            ArrayAdapter<String> adptrH323 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH323);
            spnH323.setAdapter(adptrH323);

            spnH323.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH323.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH323.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("1")) {
                        secH323X.setVisibility(View.GONE);
                        lineH323X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("2")) {
                        secH323X.setVisibility(View.GONE);
                        lineH323X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("3")) {
                        secH323X.setVisibility(View.GONE);
                        lineH323X.setVisibility(View.GONE);
                    } else {
                        secH323X.setVisibility(View.VISIBLE);
                        lineH323X.setVisibility(View.VISIBLE);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH323X = (LinearLayout) findViewById(R.id.secH323X);
            lineH323X = (View) findViewById(R.id.lineH323X);
            VlblH323X = (TextView) findViewById(R.id.VlblH323X);
            txtH323X = (EditText) findViewById(R.id.txtH323X);
            secH324 = (LinearLayout) findViewById(R.id.secH324);
            lineH324 = (View) findViewById(R.id.lineH324);
            VlblH324 = (TextView) findViewById(R.id.VlblH324);
            spnH324 = (Spinner) findViewById(R.id.spnH324);
            List<String> listH324 = new ArrayList<String>();

            listH324.add("");
            listH324.add("1-কেরোসিন ল্যাম্প/লন্ঠন");
            listH324.add("2-বিদ্যুত");
            listH324.add("3-মোমবাতি");
            listH324.add("4-গ্যাস ল্যাম্প/বায়ো গ্যাস");
            listH324.add("5-সোলার প্লেট");
            listH324.add("6-অন্যান্য");
            ArrayAdapter<String> adptrH324 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH324);
            spnH324.setAdapter(adptrH324);

            spnH324.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH324.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH324.getSelectedItem().toString(), "-");
                    if (!spnData.equalsIgnoreCase("6")) {
                        txtH324X.setText("");
                        secH324X.setVisibility(View.GONE);
                        lineH324X.setVisibility(View.GONE);
                    } else {
                        secH324X.setVisibility(View.VISIBLE);
                        lineH324X.setVisibility(View.VISIBLE);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH324X = (LinearLayout) findViewById(R.id.secH324X);
            lineH324X = (View) findViewById(R.id.lineH324X);
            VlblH324X = (TextView) findViewById(R.id.VlblH324X);
            txtH324X = (EditText) findViewById(R.id.txtH324X);
            secH325 = (LinearLayout) findViewById(R.id.secH325);
            lineH325 = (View) findViewById(R.id.lineH325);
            VlblH325 = (TextView) findViewById(R.id.VlblH325);
            spnH325 = (Spinner) findViewById(R.id.spnH325);
            List<String> listH325 = new ArrayList<String>();

            listH325.add("");
            listH325.add("1-বিদ্যুৎ");
            listH325.add("2-এল,পি,জি");
            listH325.add("3-প্রাকৃতিক গ্যাস");
            listH325.add("4-বায়োগ্যাস");
            listH325.add("5-কেরোসিন");
            listH325.add("6-কয়লা");
            listH325.add("7-কাঠ/বাশ");
            listH325.add("8-পাঠখড়ি/খড়/নাড়া/পাতা");
            listH325.add("9-কৃষি ফসলের অবশিষ্টাংশ");
            listH325.add("10-গোবর");
            listH325.add("11-অন্যান্য");
            ArrayAdapter<String> adptrH325 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH325);
            spnH325.setAdapter(adptrH325);

            spnH325.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH325.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH325.getSelectedItem().toString(), "-");
                    if (spnData.equalsIgnoreCase("1")) {
                        secH325X.setVisibility(View.GONE);
                        lineH325X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("2")) {
                        secH325X.setVisibility(View.GONE);
                        lineH325X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("3")) {
                        secH325X.setVisibility(View.GONE);
                        lineH325X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("4")) {
                        secH325X.setVisibility(View.GONE);
                        lineH325X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("5")) {
                        secH325X.setVisibility(View.GONE);
                        lineH325X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("6")) {
                        secH325X.setVisibility(View.GONE);
                        lineH325X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("7")) {
                        secH325X.setVisibility(View.GONE);
                        lineH325X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("8")) {
                        secH325X.setVisibility(View.GONE);
                        lineH325X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("9")) {
                        secH325X.setVisibility(View.GONE);
                        lineH325X.setVisibility(View.GONE);
                    } else if (spnData.equalsIgnoreCase("10")) {
                        secH325X.setVisibility(View.GONE);
                        lineH325X.setVisibility(View.GONE);
                    } else {
                        secH325X.setVisibility(View.VISIBLE);
                        lineH325X.setVisibility(View.VISIBLE);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH325X = (LinearLayout) findViewById(R.id.secH325X);
            lineH325X = (View) findViewById(R.id.lineH325X);
            VlblH325X = (TextView) findViewById(R.id.VlblH325X);
            txtH325X = (EditText) findViewById(R.id.txtH325X);
            seclblH331 = (LinearLayout) findViewById(R.id.seclblH331);
            secH331 = (LinearLayout) findViewById(R.id.secH331);
            lineH331 = (View) findViewById(R.id.lineH331);
            VlblH331 = (TextView) findViewById(R.id.VlblH331);
            rdogrpH331 = (RadioGroup) findViewById(R.id.rdogrpH331);

            rdoH3311 = (RadioButton) findViewById(R.id.rdoH3311);
            rdoH3312 = (RadioButton) findViewById(R.id.rdoH3312);
            rdoH3313 = (RadioButton) findViewById(R.id.rdoH3313);
            rdogrpH331.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH331 = new String[]{"1", "0", "8"};
                    for (int i = 0; i < rdogrpH331.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH331.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH331[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH332A.setVisibility(View.GONE);
                        lineH332A.setVisibility(View.GONE);
                        txtH332A.setText("");
                        secH332B.setVisibility(View.GONE);
                        lineH332B.setVisibility(View.GONE);
                        txtH332B.setText("");
                    } else if (rbData.equalsIgnoreCase("8")) {
                        secH332A.setVisibility(View.GONE);
                        lineH332A.setVisibility(View.GONE);
                        txtH332A.setText("");
                        secH332B.setVisibility(View.GONE);
                        lineH332B.setVisibility(View.GONE);
                        txtH332B.setText("");
                    } else {
                        secH332A.setVisibility(View.VISIBLE);
                        lineH332A.setVisibility(View.VISIBLE);
                        secH332B.setVisibility(View.VISIBLE);
                        lineH332B.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH332A = (LinearLayout) findViewById(R.id.secH332A);
            lineH332A = (View) findViewById(R.id.lineH332A);
            VlblH332A = (TextView) findViewById(R.id.VlblH332A);
            txtH332A = (EditText) findViewById(R.id.txtH332A);
            secH332B = (LinearLayout) findViewById(R.id.secH332B);
            lineH332B = (View) findViewById(R.id.lineH332B);
            VlblH332B = (TextView) findViewById(R.id.VlblH332B);
            txtH332B = (EditText) findViewById(R.id.txtH332B);
            seclblH341 = (LinearLayout) findViewById(R.id.seclblH341);
            secH341 = (LinearLayout) findViewById(R.id.secH341);
            lineH341 = (View) findViewById(R.id.lineH341);
            VlblH341 = (TextView) findViewById(R.id.VlblH341);
            rdogrpH341 = (RadioGroup) findViewById(R.id.rdogrpH341);

            rdoH3411 = (RadioButton) findViewById(R.id.rdoH3411);
            rdoH3412 = (RadioButton) findViewById(R.id.rdoH3412);
            rdogrpH341.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH341 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH341.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH341.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH341[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH342.setVisibility(View.GONE);
                        lineH342.setVisibility(View.GONE);
                        txtH342.setText("");
                    } else {
                        secH342.setVisibility(View.VISIBLE);
                        lineH342.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH342 = (LinearLayout) findViewById(R.id.secH342);
            lineH342 = (View) findViewById(R.id.lineH342);
            VlblH342 = (TextView) findViewById(R.id.VlblH342);
            txtH342 = (EditText) findViewById(R.id.txtH342);
            seclbH61 = (LinearLayout) findViewById(R.id.seclbH61);
            secH61 = (LinearLayout) findViewById(R.id.secH61);
            lineH61 = (View) findViewById(R.id.lineH61);
            VlblH61 = (TextView) findViewById(R.id.VlblH61);
            rdogrpH61 = (RadioGroup) findViewById(R.id.rdogrpH61);

            rdoH611 = (RadioButton) findViewById(R.id.rdoH611);
            rdoH612 = (RadioButton) findViewById(R.id.rdoH612);
            rdoH613 = (RadioButton) findViewById(R.id.rdoH613);
            secH62 = (LinearLayout) findViewById(R.id.secH62);
            lineH62 = (View) findViewById(R.id.lineH62);
            VlblH62 = (TextView) findViewById(R.id.VlblH62);
            rdogrpH62 = (RadioGroup) findViewById(R.id.rdogrpH62);

            rdoH621 = (RadioButton) findViewById(R.id.rdoH621);
            rdoH622 = (RadioButton) findViewById(R.id.rdoH622);
            rdoH623 = (RadioButton) findViewById(R.id.rdoH623);
            rdoH624 = (RadioButton) findViewById(R.id.rdoH624);
            rdoH625 = (RadioButton) findViewById(R.id.rdoH625);
            rdoH626 = (RadioButton) findViewById(R.id.rdoH626);
            rdoH627 = (RadioButton) findViewById(R.id.rdoH627);
            seclblH63 = (LinearLayout) findViewById(R.id.seclblH63);
            secH63A = (LinearLayout) findViewById(R.id.secH63A);
            lineH63A = (View) findViewById(R.id.lineH63A);
            VlblH63A = (TextView) findViewById(R.id.VlblH63A);
            spnH63A = (Spinner) findViewById(R.id.spnH63A);
            List<String> listH63A = new ArrayList<String>();

            listH63A.add("");
            listH63A.add("1-নির্দিষ্ট জায়গায় (বাড়ির উঠোনে অথবা বাইরে)");
            listH63A.add("2-এখানে সেখানে");
            listH63A.add("3-একটি নির্দিষ্ট ময়লা ফেলার যায়গায়");
            listH63A.add("4-শৌচাগারে");
            listH63A.add("5-অন্যান্য");
            ArrayAdapter<String> adptrH63A = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH63A);
            spnH63A.setAdapter(adptrH63A);
            spnH63A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH63A.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH63A.getSelectedItem().toString(), "-");
                    if (!spnData.equalsIgnoreCase("5")) {
                        txtH63AX.setText("");
                        secH63AX.setVisibility(View.GONE);
                        lineH63AX.setVisibility(View.GONE);
                    } else {
                        secH63AX.setVisibility(View.VISIBLE);
                        lineH63AX.setVisibility(View.VISIBLE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH63AX = (LinearLayout) findViewById(R.id.secH63AX);
            secH63AX.setVisibility(View.GONE);
            lineH63AX = (View) findViewById(R.id.lineH63AX);
            VlblH63AX = (TextView) findViewById(R.id.VlblH63AX);
            txtH63AX = (EditText) findViewById(R.id.txtH63AX);
            secH63B = (LinearLayout) findViewById(R.id.secH63B);
            lineH63B = (View) findViewById(R.id.lineH63B);
            VlblH63B = (TextView) findViewById(R.id.VlblH63B);
            spnH63B = (Spinner) findViewById(R.id.spnH63B);
            List<String> listH63B = new ArrayList<String>();

            listH63B.add("");
            listH63B.add("1-নির্দিষ্ট জায়গায় (বাড়ির উঠোনে অথবা বাইরে)");
            listH63B.add("2-এখানে সেখানে");
            listH63B.add("3-একটি নির্দিষ্ট ময়লা ফেলার যায়গায়");
            listH63B.add("4-শৌচাগারে");
            listH63B.add("5-অন্যান্য");
            ArrayAdapter<String> adptrH63B = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH63B);
            spnH63B.setAdapter(adptrH63B);
            spnH63B.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH63B.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH63B.getSelectedItem().toString(), "-");
                    if (!spnData.equalsIgnoreCase("5")) {
                        txtH63BX.setText("");
                        secH63BX.setVisibility(View.GONE);
                        lineH63BX.setVisibility(View.GONE);
                    } else {
                        lineH63BX.setVisibility(View.VISIBLE);
                        secH63BX.setVisibility(View.VISIBLE);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH63BX = (LinearLayout) findViewById(R.id.secH63BX);
            secH63BX.setVisibility(View.GONE);
            lineH63BX = (View) findViewById(R.id.lineH63BX);
            VlblH63BX = (TextView) findViewById(R.id.VlblH63BX);
            txtH63BX = (EditText) findViewById(R.id.txtH63BX);
            secH63C = (LinearLayout) findViewById(R.id.secH63C);
            lineH63C = (View) findViewById(R.id.lineH63C);
            VlblH63C = (TextView) findViewById(R.id.VlblH63C);
            spnH63C = (Spinner) findViewById(R.id.spnH63C);
            List<String> listH63C = new ArrayList<String>();

            listH63C.add("");
            listH63C.add("1-নির্দিষ্ট জায়গায় (বাড়ির উঠোনে অথবা বাইরে)");
            listH63C.add("2-এখানে সেখানে");
            listH63C.add("3-একটি নির্দিষ্ট ময়লা ফেলার যায়গায়");
            listH63C.add("4-শৌচাগারে");
            listH63C.add("5-অন্যান্য");
            ArrayAdapter<String> adptrH63C = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH63C);
            spnH63C.setAdapter(adptrH63C);
            spnH63C.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH63C.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH63C.getSelectedItem().toString(), "-");
                    if (!spnData.equalsIgnoreCase("5")) {
                        txtH63CX.setText("");
                        secH63CX.setVisibility(View.GONE);
                        lineH63CX.setVisibility(View.GONE);
                    } else {
                        secH63CX.setVisibility(View.VISIBLE);
                        lineH63CX.setVisibility(View.VISIBLE);

                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH63CX = (LinearLayout) findViewById(R.id.secH63CX);
            secH63CX.setVisibility(View.GONE);
            lineH63CX = (View) findViewById(R.id.lineH63CX);
            VlblH63CX = (TextView) findViewById(R.id.VlblH63CX);
            txtH63CX = (EditText) findViewById(R.id.txtH63CX);
            secH63D = (LinearLayout) findViewById(R.id.secH63D);
            lineH63D = (View) findViewById(R.id.lineH63D);
            VlblH63D = (TextView) findViewById(R.id.VlblH63D);
            spnH63D = (Spinner) findViewById(R.id.spnH63D);
            List<String> listH63D = new ArrayList<String>();

            listH63D.add("");
            listH63D.add("1-নির্দিষ্ট জায়গায় (বাড়ির উঠোনে অথবা বাইরে)");
            listH63D.add("2-এখানে সেখানে");
            listH63D.add("3-একটি নির্দিষ্ট ময়লা ফেলার যায়গায়");
            listH63D.add("4-শৌচাগারে");
            listH63D.add("5-অন্যান্য");
            ArrayAdapter<String> adptrH63D = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH63D);
            spnH63D.setAdapter(adptrH63D);
            spnH63D.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH63D.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH63D.getSelectedItem().toString(), "-");
                    if (!spnData.equalsIgnoreCase("5")) {
                        txtH63DX.setText("");
                        secH63DX.setVisibility(View.GONE);
                        lineH63DX.setVisibility(View.GONE);
                    } else {
                        secH63DX.setVisibility(View.VISIBLE);
                        lineH63DX.setVisibility(View.VISIBLE);

                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH63DX = (LinearLayout) findViewById(R.id.secH63DX);
            secH63DX.setVisibility(View.GONE);
            lineH63DX = (View) findViewById(R.id.lineH63DX);
            VlblH63DX = (TextView) findViewById(R.id.VlblH63DX);
            txtH63DX = (EditText) findViewById(R.id.txtH63DX);
            secH63E = (LinearLayout) findViewById(R.id.secH63E);
            lineH63E = (View) findViewById(R.id.lineH63E);
            VlblH63E = (TextView) findViewById(R.id.VlblH63E);
            spnH63E = (Spinner) findViewById(R.id.spnH63E);
            List<String> listH63E = new ArrayList<String>();

            listH63E.add("");
            listH63E.add("1-নির্দিষ্ট জায়গায় (বাড়ির উঠোনে অথবা বাইরে)");
            listH63E.add("2-এখানে সেখানে");
            listH63E.add("3-একটি নির্দিষ্ট ময়লা ফেলার যায়গায়");
            listH63E.add("4-শৌচাগারে");
            listH63E.add("5-অন্যান্য");
            ArrayAdapter<String> adptrH63E = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH63E);
            spnH63E.setAdapter(adptrH63E);
            spnH63E.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH63E.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH63E.getSelectedItem().toString(), "-");
                    if (!spnData.equalsIgnoreCase("5")) {
                        txtH63EX.setText("");
                        secH63EX.setVisibility(View.GONE);
                        lineH63EX.setVisibility(View.GONE);
                    } else {
                        secH63EX.setVisibility(View.VISIBLE);
                        lineH63EX.setVisibility(View.VISIBLE);

                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH63EX = (LinearLayout) findViewById(R.id.secH63EX);
            secH63EX.setVisibility(View.GONE);
            lineH63EX = (View) findViewById(R.id.lineH63EX);
            VlblH63EX = (TextView) findViewById(R.id.VlblH63EX);
            txtH63EX = (EditText) findViewById(R.id.txtH63EX);
            secH63X = (LinearLayout) findViewById(R.id.secH63X);
            lineH63X = (View) findViewById(R.id.lineH63X);
            VlblH63X = (TextView) findViewById(R.id.VlblH63X);
            txtH63X = (EditText) findViewById(R.id.txtH63X);
            seclblH64 = (LinearLayout) findViewById(R.id.seclblH64);
            secH64 = (LinearLayout) findViewById(R.id.secH64);
            lineH64 = (View) findViewById(R.id.lineH64);
            VlblH64 = (TextView) findViewById(R.id.VlblH64);
            rdogrpH64 = (RadioGroup) findViewById(R.id.rdogrpH64);

            rdoH641 = (RadioButton) findViewById(R.id.rdoH641);
            rdoH642 = (RadioButton) findViewById(R.id.rdoH642);
            secH65 = (LinearLayout) findViewById(R.id.secH65);
            lineH65 = (View) findViewById(R.id.lineH65);
            VlblH65 = (TextView) findViewById(R.id.VlblH65);
            rdogrpH65 = (RadioGroup) findViewById(R.id.rdogrpH65);

            rdoH651 = (RadioButton) findViewById(R.id.rdoH651);
            rdoH652 = (RadioButton) findViewById(R.id.rdoH652);
            rdogrpH65.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH65 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH65.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH65.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH65[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH66.setVisibility(View.GONE);
                        lineH66.setVisibility(View.GONE);
                        rdogrpH66.clearCheck();
                        secH67.setVisibility(View.GONE);
                        lineH67.setVisibility(View.GONE);
                        rdogrpH67.clearCheck();
                    } else {
                        secH66.setVisibility(View.VISIBLE);
                        lineH66.setVisibility(View.VISIBLE);
                        secH67.setVisibility(View.VISIBLE);
                        lineH67.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH66 = (LinearLayout) findViewById(R.id.secH66);
            lineH66 = (View) findViewById(R.id.lineH66);
            VlblH66 = (TextView) findViewById(R.id.VlblH66);
            rdogrpH66 = (RadioGroup) findViewById(R.id.rdogrpH66);

            rdoH661 = (RadioButton) findViewById(R.id.rdoH661);
            rdoH662 = (RadioButton) findViewById(R.id.rdoH662);
            rdogrpH66.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH66 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH66.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH66.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH66[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH67.setVisibility(View.GONE);
                        lineH67.setVisibility(View.GONE);
                        rdogrpH67.clearCheck();
                    } else {
                        secH67.setVisibility(View.VISIBLE);
                        lineH67.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH67 = (LinearLayout) findViewById(R.id.secH67);
            lineH67 = (View) findViewById(R.id.lineH67);
            VlblH67 = (TextView) findViewById(R.id.VlblH67);
            rdogrpH67 = (RadioGroup) findViewById(R.id.rdogrpH67);

            rdoH671 = (RadioButton) findViewById(R.id.rdoH671);
            rdoH672 = (RadioButton) findViewById(R.id.rdoH672);
            secH68 = (LinearLayout) findViewById(R.id.secH68);
            lineH68 = (View) findViewById(R.id.lineH68);
            VlblH68 = (TextView) findViewById(R.id.VlblH68);
            rdogrpH68 = (RadioGroup) findViewById(R.id.rdogrpH68);

            rdoH681 = (RadioButton) findViewById(R.id.rdoH681);
            rdoH682 = (RadioButton) findViewById(R.id.rdoH682);
            secH69 = (LinearLayout) findViewById(R.id.secH69);
            lineH69 = (View) findViewById(R.id.lineH69);
            VlblH69 = (TextView) findViewById(R.id.VlblH69);
            rdogrpH69 = (RadioGroup) findViewById(R.id.rdogrpH69);

            rdoH691 = (RadioButton) findViewById(R.id.rdoH691);
            rdoH692 = (RadioButton) findViewById(R.id.rdoH692);
            seclblH610R = (LinearLayout) findViewById(R.id.seclblH610R);
            secH610R = (LinearLayout) findViewById(R.id.secH610R);
            lineH610R = (View) findViewById(R.id.lineH610R);
            VlblH610R = (TextView) findViewById(R.id.VlblH610R);
            spnH610R = (Spinner) findViewById(R.id.spnH610R);
            List<String> listH610 = new ArrayList<String>();

            listH610.add("");
            listH610.add("0-হাত ধোয়না");
            listH610.add("1-টিউবওয়েল");
            listH610.add("2-নদী/খাল/পুকুর");
            listH610.add("3-বৃষ্টির পানি");
            listH610.add("4-অন্যান্য");
            ArrayAdapter<String> adptrH610 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH610);
            spnH610R.setAdapter(adptrH610);

            spnH610R.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH610R.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH610R.getSelectedItem().toString(), "-");
                    if (!spnData.equalsIgnoreCase("4")) {
                        txtH610RX.setText("");
                        secH610RX.setVisibility(View.GONE);
                        lineH610RX.setVisibility(View.GONE);
                    } else {
                        secH610RX.setVisibility(View.VISIBLE);
                        lineH610RX.setVisibility(View.VISIBLE);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH610RX = (LinearLayout) findViewById(R.id.secH610RX);
            lineH610RX = (View) findViewById(R.id.lineH610RX);
            VlblH610RX = (TextView) findViewById(R.id.VlblH610RX);
            txtH610RX = (EditText) findViewById(R.id.txtH610RX);
            secH610D = (LinearLayout) findViewById(R.id.secH610D);
            lineH610D = (View) findViewById(R.id.lineH610D);
            VlblH610D = (TextView) findViewById(R.id.VlblH610D);
            spnH610D = (Spinner) findViewById(R.id.spnH610D);
            List<String> listH610D = new ArrayList<String>();

            listH610D.add("");
            listH610D.add("0-হাত ধোয়না");
            listH610D.add("1-টিউবওয়েল");
            listH610D.add("2-নদী/খাল/পুকুর");
            listH610D.add("3-বৃষ্টির পানি");
            listH610D.add("4-অন্যান্য");
            ArrayAdapter<String> adptrH610D = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH610D);
            spnH610D.setAdapter(adptrH610D);

            spnH610D.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH610D.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH610D.getSelectedItem().toString(), "-");
                    if (!spnData.equalsIgnoreCase("4")) {
                        txtH610DX.setText("");
                        secH610DX.setVisibility(View.GONE);
                        lineH610DX.setVisibility(View.GONE);
                    } else {
                        secH610DX.setVisibility(View.VISIBLE);
                        lineH610DX.setVisibility(View.VISIBLE);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH610DX = (LinearLayout) findViewById(R.id.secH610DX);
            lineH610DX = (View) findViewById(R.id.lineH610DX);
            VlblH610DX = (TextView) findViewById(R.id.VlblH610DX);
            txtH610DX = (EditText) findViewById(R.id.txtH610DX);
            secH610a = (LinearLayout) findViewById(R.id.secH610a);
            lineH610a = (View) findViewById(R.id.lineH610a);
            VlblH610a = (TextView) findViewById(R.id.VlblH610a);
            rdogrpH610a = (RadioGroup) findViewById(R.id.rdogrpH610a);

            rdoH610a1 = (RadioButton) findViewById(R.id.rdoH610a1);
            rdoH610a2 = (RadioButton) findViewById(R.id.rdoH610a2);
            rdoH610a3 = (RadioButton) findViewById(R.id.rdoH610a3);
            seclblH6101 = (LinearLayout) findViewById(R.id.seclblH6101);
            secH610b1 = (LinearLayout) findViewById(R.id.secH610b1);
            lineH610b1 = (View) findViewById(R.id.lineH610b1);
            VlblH610b1 = (TextView) findViewById(R.id.VlblH610b1);
            chkH610b1 = (CheckBox) findViewById(R.id.chkH610b1);
            secH610b2 = (LinearLayout) findViewById(R.id.secH610b2);
            lineH610b2 = (View) findViewById(R.id.lineH610b2);
            VlblH610b2 = (TextView) findViewById(R.id.VlblH610b2);
            chkH610b2 = (CheckBox) findViewById(R.id.chkH610b2);
            secH610b3 = (LinearLayout) findViewById(R.id.secH610b3);
            lineH610b3 = (View) findViewById(R.id.lineH610b3);
            VlblH610b3 = (TextView) findViewById(R.id.VlblH610b3);
            chkH610b3 = (CheckBox) findViewById(R.id.chkH610b3);
            secH610b4 = (LinearLayout) findViewById(R.id.secH610b4);
            lineH610b4 = (View) findViewById(R.id.lineH610b4);
            VlblH610b4 = (TextView) findViewById(R.id.VlblH610b4);
            chkH610b4 = (CheckBox) findViewById(R.id.chkH610b4);
            secH610b5 = (LinearLayout) findViewById(R.id.secH610b5);
            lineH610b5 = (View) findViewById(R.id.lineH610b5);
            VlblH610b5 = (TextView) findViewById(R.id.VlblH610b5);
            chkH610b5 = (CheckBox) findViewById(R.id.chkH610b5);
/*            chkH610b5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (!isChecked) {
                        secH610b5X.setVisibility(View.GONE);
                        lineH610b5X.setVisibility(View.GONE);
                        txtH610b5X.setText("");

                    } else {
                        secH610b5X.setVisibility(View.VISIBLE);
                        lineH610b5X.setVisibility(View.VISIBLE);

                    }
                }
            });*/

            secH610b5X = (LinearLayout) findViewById(R.id.secH610b5X);
            lineH610b5X = (View) findViewById(R.id.lineH610b5X);
            VlblH610b5X = (TextView) findViewById(R.id.VlblH610b5X);
            txtH610b5X = (EditText) findViewById(R.id.txtH610b5X);
            secH610b6 = (LinearLayout) findViewById(R.id.secH610b6);
            lineH610b6 = (View) findViewById(R.id.lineH610b6);
            VlblH610b6 = (TextView) findViewById(R.id.VlblH610b6);
            chkH610b6 = (CheckBox) findViewById(R.id.chkH610b6);
            chkH610b6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH610b1.setChecked(false);
                        chkH610b2.setChecked(false);
                        chkH610b3.setChecked(false);
                        chkH610b4.setChecked(false);
                        chkH610b5.setChecked(false);
                        secH610c.setVisibility(View.GONE);
                        rdogrpH610c.clearCheck();
                    } else
                        secH610c.setVisibility(View.VISIBLE);

                }
            });

            chkH610b1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH610b6.setChecked(false);
                    }

                }
            });
            chkH610b2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH610b6.setChecked(false);
                    }

                }
            });
            chkH610b3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH610b6.setChecked(false);
                    }

                }
            });
            chkH610b4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH610b6.setChecked(false);
                    }

                }
            });
            chkH610b5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (!isChecked) {
                        secH610b5X.setVisibility(View.GONE);
                        lineH610b5X.setVisibility(View.GONE);
                        txtH610b5X.setText("");

                    } else {
                        chkH610b6.setChecked(false);
                        secH610b5X.setVisibility(View.VISIBLE);
                        lineH610b5X.setVisibility(View.VISIBLE);

                    }
                }
            });

            secH610c = (LinearLayout) findViewById(R.id.secH610c);
            lineH610c = (View) findViewById(R.id.lineH610c);
            VlblH610c = (TextView) findViewById(R.id.VlblH610c);
            rdogrpH610c = (RadioGroup) findViewById(R.id.rdogrpH610c);

            rdoH610c1 = (RadioButton) findViewById(R.id.rdoH610c1);
            rdoH610c2 = (RadioButton) findViewById(R.id.rdoH610c2);
            seclblH611 = (LinearLayout) findViewById(R.id.seclblH611);
            secH611R = (LinearLayout) findViewById(R.id.secH611R);
            lineH611R = (View) findViewById(R.id.lineH611R);
            VlblH611R = (TextView) findViewById(R.id.VlblH611R);
            spnH611R = (Spinner) findViewById(R.id.spnH611R);
            List<String> listH611R = new ArrayList<String>();

            listH611R.add("");
            listH611R.add("0-হাত ধোয়না");
            listH611R.add("1-টিউবওয়েল");
            listH611R.add("2-নদী/খাল/পুকুর");
            listH611R.add("3-বৃষ্টির পানি");
            listH611R.add("4-অন্যান্য");
            ArrayAdapter<String> adptrH611R = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH611R);
            spnH611R.setAdapter(adptrH611R);

            spnH611R.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH611R.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH611R.getSelectedItem().toString(), "-");
                    if (!spnData.equalsIgnoreCase("4")) {
                        txtH611RX.setText("");
                        secH611RX.setVisibility(View.GONE);
                        lineH611RX.setVisibility(View.GONE);
                    } else {
                        secH611RX.setVisibility(View.VISIBLE);
                        lineH611RX.setVisibility(View.VISIBLE);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH611RX = (LinearLayout) findViewById(R.id.secH611RX);
            lineH611RX = (View) findViewById(R.id.lineH611RX);
            VlblH611RX = (TextView) findViewById(R.id.VlblH611RX);
            txtH611RX = (EditText) findViewById(R.id.txtH611RX);
            secH611D = (LinearLayout) findViewById(R.id.secH611D);
            lineH611D = (View) findViewById(R.id.lineH611D);
            VlblH611D = (TextView) findViewById(R.id.VlblH611D);
            spnH611D = (Spinner) findViewById(R.id.spnH611D);
            List<String> listH611D = new ArrayList<String>();

            listH611D.add("");
            listH611D.add("0-হাত ধোয়না");
            listH611D.add("1-টিউবওয়েল");
            listH611D.add("2-নদী/খাল/পুকুর");
            listH611D.add("3-বৃষ্টির পানি");
            listH611D.add("4-অন্যান্য");
            ArrayAdapter<String> adptrH611D = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH611D);
            spnH611D.setAdapter(adptrH611D);

            spnH611D.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH611D.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH611D.getSelectedItem().toString(), "-");
                    if (!spnData.equalsIgnoreCase("4")) {
                        txtH611DX.setText("");
                        secH611DX.setVisibility(View.GONE);
                        lineH611DX.setVisibility(View.GONE);
                    } else {
                        secH611DX.setVisibility(View.VISIBLE);
                        lineH611DX.setVisibility(View.VISIBLE);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH611DX = (LinearLayout) findViewById(R.id.secH611DX);
            lineH611DX = (View) findViewById(R.id.lineH611DX);
            VlblH611DX = (TextView) findViewById(R.id.VlblH611DX);
            txtH611DX = (EditText) findViewById(R.id.txtH611DX);
            secH611a = (LinearLayout) findViewById(R.id.secH611a);
            lineH611a = (View) findViewById(R.id.lineH611a);
            VlblH611a = (TextView) findViewById(R.id.VlblH611a);
            rdogrpH611a = (RadioGroup) findViewById(R.id.rdogrpH611a);

            rdoH611a1 = (RadioButton) findViewById(R.id.rdoH611a1);
            rdoH611a2 = (RadioButton) findViewById(R.id.rdoH611a2);
            rdoH611a3 = (RadioButton) findViewById(R.id.rdoH611a3);
            seclblH6111 = (LinearLayout) findViewById(R.id.seclblH6111);
            secH611b1 = (LinearLayout) findViewById(R.id.secH611b1);
            lineH611b1 = (View) findViewById(R.id.lineH611b1);
            VlblH611b1 = (TextView) findViewById(R.id.VlblH611b1);
            chkH611b1 = (CheckBox) findViewById(R.id.chkH611b1);
            secH611b2 = (LinearLayout) findViewById(R.id.secH611b2);
            lineH611b2 = (View) findViewById(R.id.lineH611b2);
            VlblH611b2 = (TextView) findViewById(R.id.VlblH611b2);
            chkH611b2 = (CheckBox) findViewById(R.id.chkH611b2);
            secH611b3 = (LinearLayout) findViewById(R.id.secH611b3);
            lineH611b3 = (View) findViewById(R.id.lineH611b3);
            VlblH611b3 = (TextView) findViewById(R.id.VlblH611b3);
            chkH611b3 = (CheckBox) findViewById(R.id.chkH611b3);
            secH611b4 = (LinearLayout) findViewById(R.id.secH611b4);
            lineH611b4 = (View) findViewById(R.id.lineH611b4);
            VlblH611b4 = (TextView) findViewById(R.id.VlblH611b4);
            chkH611b4 = (CheckBox) findViewById(R.id.chkH611b4);
            secH611b5 = (LinearLayout) findViewById(R.id.secH611b5);
            lineH611b5 = (View) findViewById(R.id.lineH611b5);
            VlblH611b5 = (TextView) findViewById(R.id.VlblH611b5);
            chkH611b5 = (CheckBox) findViewById(R.id.chkH611b5);
/*            chkH611b5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (!isChecked) {
                        secH611b5X.setVisibility(View.GONE);
                        lineH611b5X.setVisibility(View.GONE);
                        txtH611b5X.setText("");
                        secH611b6.setVisibility(View.GONE);
                        lineH611b6.setVisibility(View.GONE);
                    } else {
                        secH611b5X.setVisibility(View.VISIBLE);
                        lineH611b5X.setVisibility(View.VISIBLE);
                        secH611b6.setVisibility(View.VISIBLE);
                        lineH611b6.setVisibility(View.VISIBLE);
                    }
                }
            });*/
            secH611b5X = (LinearLayout) findViewById(R.id.secH611b5X);
            lineH611b5X = (View) findViewById(R.id.lineH611b5X);
            VlblH611b5X = (TextView) findViewById(R.id.VlblH611b5X);
            txtH611b5X = (EditText) findViewById(R.id.txtH611b5X);
            secH611b6 = (LinearLayout) findViewById(R.id.secH611b6);
            lineH611b6 = (View) findViewById(R.id.lineH611b6);
            VlblH611b6 = (TextView) findViewById(R.id.VlblH611b6);
            chkH611b6 = (CheckBox) findViewById(R.id.chkH611b6);
            chkH611b6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH611b1.setChecked(false);
                        chkH611b2.setChecked(false);
                        chkH611b3.setChecked(false);
                        chkH611b4.setChecked(false);
                        chkH611b5.setChecked(false);
                        secH611c.setVisibility(View.GONE);
                        rdogrpH611c.clearCheck();
                    } else
                        secH611c.setVisibility(View.VISIBLE);

                }
            });
            chkH611b1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH611b6.setChecked(false);
                    }

                }
            });
            chkH611b2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH611b6.setChecked(false);
                    }

                }
            });
            chkH611b3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH611b6.setChecked(false);
                    }

                }
            });
            chkH611b4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH611b6.setChecked(false);
                    }

                }
            });
            chkH611b5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (!isChecked) {
                        secH611b5X.setVisibility(View.GONE);
                        lineH611b5X.setVisibility(View.GONE);
                        txtH611b5X.setText("");
                        //secH611b6.setVisibility(View.GONE);
                        //lineH611b6.setVisibility(View.GONE);
                    } else {
                        chkH611b6.setChecked(false);

                        secH611b5X.setVisibility(View.VISIBLE);
                        lineH611b5X.setVisibility(View.VISIBLE);
                        //secH611b6.setVisibility(View.VISIBLE);
                        //lineH611b6.setVisibility(View.VISIBLE);
                    }
                }
            });

            secH611c = (LinearLayout) findViewById(R.id.secH611c);
            lineH611c = (View) findViewById(R.id.lineH611c);
            VlblH611c = (TextView) findViewById(R.id.VlblH611c);
            rdogrpH611c = (RadioGroup) findViewById(R.id.rdogrpH611c);

            rdoH611c1 = (RadioButton) findViewById(R.id.rdoH611c1);
            rdoH611c2 = (RadioButton) findViewById(R.id.rdoH611c2);
            seclblH612 = (LinearLayout) findViewById(R.id.seclblH612);
            secH612R = (LinearLayout) findViewById(R.id.secH612R);
            lineH612R = (View) findViewById(R.id.lineH612R);
            VlblH612R = (TextView) findViewById(R.id.VlblH612R);
            spnH612R = (Spinner) findViewById(R.id.spnH612R);
            List<String> listH612R = new ArrayList<String>();

            listH612R.add("");
            listH612R.add("0-হাত ধোয়না");
            listH612R.add("1-টিউবওয়েল");
            listH612R.add("2-নদী বা খাল পুকুর");
            listH612R.add("3-বৃষ্টির পানি");
            listH612R.add("4-অন্যান্য");
            ArrayAdapter<String> adptrH612R = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH612R);
            spnH612R.setAdapter(adptrH612R);

            spnH612R.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH612R.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH612R.getSelectedItem().toString(), "-");
                    if (!spnData.equalsIgnoreCase("4")) {
                        txtH612RX.setText("");
                        secH612RX.setVisibility(View.GONE);
                        lineH612RX.setVisibility(View.GONE);
                    } else {
                        secH612RX.setVisibility(View.VISIBLE);
                        lineH612RX.setVisibility(View.VISIBLE);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH612RX = (LinearLayout) findViewById(R.id.secH612RX);
            lineH612RX = (View) findViewById(R.id.lineH612RX);
            VlblH612RX = (TextView) findViewById(R.id.VlblH612RX);
            txtH612RX = (EditText) findViewById(R.id.txtH612RX);
            secH612D = (LinearLayout) findViewById(R.id.secH612D);
            lineH612D = (View) findViewById(R.id.lineH612D);
            VlblH612D = (TextView) findViewById(R.id.VlblH612D);
            spnH612D = (Spinner) findViewById(R.id.spnH612D);
            List<String> listH612D = new ArrayList<String>();

            listH612D.add("");
            listH612D.add("0-হাত ধোয়না");
            listH612D.add("1-টিউবওয়েল");
            listH612D.add("2-নদী বা খাল পুকুর");
            listH612D.add("3-বৃষ্টির পানি");
            listH612D.add("4-অন্যান্য");
            ArrayAdapter<String> adptrH612D = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH612D);
            spnH612D.setAdapter(adptrH612D);

            spnH612D.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH612D.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH612D.getSelectedItem().toString(), "-");
                    if (!spnData.equalsIgnoreCase("4")) {
                        txtH612DX.setText("");
                        secH612DX.setVisibility(View.GONE);
                        lineH612DX.setVisibility(View.GONE);
                    } else {
                        secH612DX.setVisibility(View.VISIBLE);
                        lineH612DX.setVisibility(View.VISIBLE);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH612DX = (LinearLayout) findViewById(R.id.secH612DX);
            lineH612DX = (View) findViewById(R.id.lineH612DX);
            VlblH612DX = (TextView) findViewById(R.id.VlblH612DX);
            txtH612DX = (EditText) findViewById(R.id.txtH612DX);
            secH612a = (LinearLayout) findViewById(R.id.secH612a);
            lineH612a = (View) findViewById(R.id.lineH612a);
            VlblH612a = (TextView) findViewById(R.id.VlblH612a);
            rdogrpH612a = (RadioGroup) findViewById(R.id.rdogrpH612a);

            rdoH612a1 = (RadioButton) findViewById(R.id.rdoH612a1);
            rdoH612a2 = (RadioButton) findViewById(R.id.rdoH612a2);
            rdoH612a3 = (RadioButton) findViewById(R.id.rdoH612a3);
            seclblH6121 = (LinearLayout) findViewById(R.id.seclblH6121);
            secH612b1 = (LinearLayout) findViewById(R.id.secH612b1);
            lineH612b1 = (View) findViewById(R.id.lineH612b1);
            VlblH612b1 = (TextView) findViewById(R.id.VlblH612b1);
            chkH612b1 = (CheckBox) findViewById(R.id.chkH612b1);
            secH612b2 = (LinearLayout) findViewById(R.id.secH612b2);
            lineH612b2 = (View) findViewById(R.id.lineH612b2);
            VlblH612b2 = (TextView) findViewById(R.id.VlblH612b2);
            chkH612b2 = (CheckBox) findViewById(R.id.chkH612b2);
            secH612b3 = (LinearLayout) findViewById(R.id.secH612b3);
            lineH612b3 = (View) findViewById(R.id.lineH612b3);
            VlblH612b3 = (TextView) findViewById(R.id.VlblH612b3);
            chkH612b3 = (CheckBox) findViewById(R.id.chkH612b3);
            secH612b4 = (LinearLayout) findViewById(R.id.secH612b4);
            lineH612b4 = (View) findViewById(R.id.lineH612b4);
            VlblH612b4 = (TextView) findViewById(R.id.VlblH612b4);
            chkH612b4 = (CheckBox) findViewById(R.id.chkH612b4);
            secH612b5 = (LinearLayout) findViewById(R.id.secH612b5);
            lineH612b5 = (View) findViewById(R.id.lineH612b5);
            VlblH612b5 = (TextView) findViewById(R.id.VlblH612b5);
            chkH612b5 = (CheckBox) findViewById(R.id.chkH612b5);
/*            chkH612b5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (!isChecked) {
                        secH612b5X.setVisibility(View.GONE);
                        lineH612b5X.setVisibility(View.GONE);
                        txtH612b5X.setText("");
                        secH612b6.setVisibility(View.GONE);
                        lineH612b6.setVisibility(View.GONE);
                    } else {
                        secH612b5X.setVisibility(View.VISIBLE);
                        lineH612b5X.setVisibility(View.VISIBLE);
                        secH612b6.setVisibility(View.VISIBLE);
                        lineH612b6.setVisibility(View.VISIBLE);
                    }
                }
            });*/

            secH612b5X = (LinearLayout) findViewById(R.id.secH612b5X);
            lineH612b5X = (View) findViewById(R.id.lineH612b5X);
            VlblH612b5X = (TextView) findViewById(R.id.VlblH612b5X);
            txtH612b5X = (EditText) findViewById(R.id.txtH612b5X);
            secH612b6 = (LinearLayout) findViewById(R.id.secH612b6);
            lineH612b6 = (View) findViewById(R.id.lineH612b6);
            VlblH612b6 = (TextView) findViewById(R.id.VlblH612b6);
            chkH612b6 = (CheckBox) findViewById(R.id.chkH612b6);
            chkH612b6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH612b1.setChecked(false);
                        chkH612b2.setChecked(false);
                        chkH612b3.setChecked(false);
                        chkH612b4.setChecked(false);
                        chkH612b5.setChecked(false);
                        secH612c.setVisibility(View.GONE);
                        rdogrpH612c.clearCheck();
                    } else
                        secH612c.setVisibility(View.VISIBLE);

                }
            });
            chkH612b1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH612b6.setChecked(false);
                    }

                }
            });
            chkH612b2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH612b6.setChecked(false);
                    }

                }
            });
            chkH612b3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH612b6.setChecked(false);
                    }

                }
            });
            chkH612b4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH612b6.setChecked(false);
                    }

                }
            });
            chkH612b5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (!isChecked) {
                        secH612b5X.setVisibility(View.GONE);
                        lineH612b5X.setVisibility(View.GONE);
                        txtH612b5X.setText("");
                        //secH612b6.setVisibility(View.GONE);
                        //lineH612b6.setVisibility(View.GONE);
                    } else {
                        chkH612b6.setChecked(false);
                        secH612b5X.setVisibility(View.VISIBLE);
                        lineH612b5X.setVisibility(View.VISIBLE);
                        //secH612b6.setVisibility(View.VISIBLE);
                        //lineH612b6.setVisibility(View.VISIBLE);
                    }
                }
            });


            secH612c = (LinearLayout) findViewById(R.id.secH612c);
            lineH612c = (View) findViewById(R.id.lineH612c);
            VlblH612c = (TextView) findViewById(R.id.VlblH612c);
            rdogrpH612c = (RadioGroup) findViewById(R.id.rdogrpH612c);

            rdoH612c1 = (RadioButton) findViewById(R.id.rdoH612c1);
            rdoH612c2 = (RadioButton) findViewById(R.id.rdoH612c2);
            seclblH613 = (LinearLayout) findViewById(R.id.seclblH613);
            secH613R = (LinearLayout) findViewById(R.id.secH613R);
            lineH613R = (View) findViewById(R.id.lineH613R);
            VlblH613R = (TextView) findViewById(R.id.VlblH613R);
            spnH613R = (Spinner) findViewById(R.id.spnH613R);
            List<String> listH613R = new ArrayList<String>();

            listH613R.add("");
            listH613R.add("0-হাত ধোয়না");
            listH613R.add("1-টিউবওয়েল");
            listH613R.add("2-নদী বা খাল পুকুর");
            listH613R.add("3-বৃষ্টির পানি");
            listH613R.add("4-অন্যান্য");
            ArrayAdapter<String> adptrH613R = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH613R);
            spnH613R.setAdapter(adptrH613R);

            spnH613R.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH613R.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH613R.getSelectedItem().toString(), "-");
                    if (!spnData.equalsIgnoreCase("4")) {
                        txtH613RX.setText("");
                        secH613RX.setVisibility(View.GONE);
                        lineH613RX.setVisibility(View.GONE);
                    } else {
                        secH613RX.setVisibility(View.VISIBLE);
                        lineH613RX.setVisibility(View.VISIBLE);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH613RX = (LinearLayout) findViewById(R.id.secH613RX);
            lineH613RX = (View) findViewById(R.id.lineH613RX);
            VlblH613RX = (TextView) findViewById(R.id.VlblH613RX);
            txtH613RX = (EditText) findViewById(R.id.txtH613RX);
            secH613D = (LinearLayout) findViewById(R.id.secH613D);
            lineH613D = (View) findViewById(R.id.lineH613D);
            VlblH613D = (TextView) findViewById(R.id.VlblH613D);
            spnH613D = (Spinner) findViewById(R.id.spnH613D);
            List<String> listH613D = new ArrayList<String>();

            listH613D.add("");
            listH613D.add("0-হাত ধোয়না");
            listH613D.add("1-টিউবওয়েল");
            listH613D.add("2-নদী বা খাল পুকুর");
            listH613D.add("3-বৃষ্টির পানি");
            listH613D.add("4-অন্যান্য");
            ArrayAdapter<String> adptrH613D = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH613D);
            spnH613D.setAdapter(adptrH613D);

            spnH613D.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH613D.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH613D.getSelectedItem().toString(), "-");
                    if (!spnData.equalsIgnoreCase("4")) {
                        txtH613DX.setText("");
                        secH613DX.setVisibility(View.GONE);
                        lineH613DX.setVisibility(View.GONE);
                    } else {
                        secH613DX.setVisibility(View.VISIBLE);
                        lineH613DX.setVisibility(View.VISIBLE);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH613DX = (LinearLayout) findViewById(R.id.secH613DX);
            lineH613DX = (View) findViewById(R.id.lineH613DX);
            VlblH613DX = (TextView) findViewById(R.id.VlblH613DX);
            txtH613DX = (EditText) findViewById(R.id.txtH613DX);
            secH613a = (LinearLayout) findViewById(R.id.secH613a);
            lineH613a = (View) findViewById(R.id.lineH613a);
            VlblH613a = (TextView) findViewById(R.id.VlblH613a);
            rdogrpH613a = (RadioGroup) findViewById(R.id.rdogrpH613a);

            rdoH613a1 = (RadioButton) findViewById(R.id.rdoH613a1);
            rdoH613a2 = (RadioButton) findViewById(R.id.rdoH613a2);
            rdoH613a3 = (RadioButton) findViewById(R.id.rdoH613a3);
            seclblH6131 = (LinearLayout) findViewById(R.id.seclblH6131);
            secH613b1 = (LinearLayout) findViewById(R.id.secH613b1);
            lineH613b1 = (View) findViewById(R.id.lineH613b1);
            VlblH613b1 = (TextView) findViewById(R.id.VlblH613b1);
            chkH613b1 = (CheckBox) findViewById(R.id.chkH613b1);
            secH613b2 = (LinearLayout) findViewById(R.id.secH613b2);
            lineH613b2 = (View) findViewById(R.id.lineH613b2);
            VlblH613b2 = (TextView) findViewById(R.id.VlblH613b2);
            chkH613b2 = (CheckBox) findViewById(R.id.chkH613b2);
            secH613b3 = (LinearLayout) findViewById(R.id.secH613b3);
            lineH613b3 = (View) findViewById(R.id.lineH613b3);
            VlblH613b3 = (TextView) findViewById(R.id.VlblH613b3);
            chkH613b3 = (CheckBox) findViewById(R.id.chkH613b3);
            secH613b4 = (LinearLayout) findViewById(R.id.secH613b4);
            lineH613b4 = (View) findViewById(R.id.lineH613b4);
            VlblH613b4 = (TextView) findViewById(R.id.VlblH613b4);
            chkH613b4 = (CheckBox) findViewById(R.id.chkH613b4);
            secH613b5 = (LinearLayout) findViewById(R.id.secH613b5);
            lineH613b5 = (View) findViewById(R.id.lineH613b5);
            VlblH613b5 = (TextView) findViewById(R.id.VlblH613b5);
            chkH613b5 = (CheckBox) findViewById(R.id.chkH613b5);
/*            chkH613b5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (!isChecked) {
                        secH613b5X.setVisibility(View.GONE);
                        lineH613b5X.setVisibility(View.GONE);
                        txtH613b5X.setText("");
                        secH613b6.setVisibility(View.GONE);
                        lineH613b6.setVisibility(View.GONE);
                    } else {
                        secH613b5X.setVisibility(View.VISIBLE);
                        lineH613b5X.setVisibility(View.VISIBLE);
                        secH613b6.setVisibility(View.VISIBLE);
                        lineH613b6.setVisibility(View.VISIBLE);
                    }
                }
            });*/

            secH613b5X = (LinearLayout) findViewById(R.id.secH613b5X);
            lineH613b5X = (View) findViewById(R.id.lineH613b5X);
            VlblH613b5X = (TextView) findViewById(R.id.VlblH613b5X);
            txtH613b5X = (EditText) findViewById(R.id.txtH613b5X);
            secH613b6 = (LinearLayout) findViewById(R.id.secH613b6);
            lineH613b6 = (View) findViewById(R.id.lineH613b6);
            VlblH613b6 = (TextView) findViewById(R.id.VlblH613b6);
            chkH613b6 = (CheckBox) findViewById(R.id.chkH613b6);
            chkH613b6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH613b1.setChecked(false);
                        chkH613b2.setChecked(false);
                        chkH613b3.setChecked(false);
                        chkH613b4.setChecked(false);
                        chkH613b5.setChecked(false);
                        secH613c.setVisibility(View.GONE);
                        rdogrpH613c.clearCheck();
                    } else
                        secH613c.setVisibility(View.VISIBLE);

                }
            });
            chkH613b1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH613b6.setChecked(false);
                    }

                }
            });
            chkH613b2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH613b6.setChecked(false);
                    }

                }
            });
            chkH613b3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH613b6.setChecked(false);
                    }

                }
            });
            chkH613b4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH613b6.setChecked(false);
                    }

                }
            });
            chkH613b5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (!isChecked) {
                        secH613b5X.setVisibility(View.GONE);
                        lineH613b5X.setVisibility(View.GONE);
                        txtH613b5X.setText("");
                        //secH613b6.setVisibility(View.GONE);
                        //lineH613b6.setVisibility(View.GONE);
                    } else {
                        chkH613b6.setChecked(false);
                        secH613b5X.setVisibility(View.VISIBLE);
                        lineH613b5X.setVisibility(View.VISIBLE);
                        //secH613b6.setVisibility(View.VISIBLE);
                        //lineH613b6.setVisibility(View.VISIBLE);
                    }
                }
            });




            secH613c = (LinearLayout) findViewById(R.id.secH613c);
            lineH613c = (View) findViewById(R.id.lineH613c);
            VlblH613c = (TextView) findViewById(R.id.VlblH613c);
            rdogrpH613c = (RadioGroup) findViewById(R.id.rdogrpH613c);

            rdoH613c1 = (RadioButton) findViewById(R.id.rdoH613c1);
            rdoH613c2 = (RadioButton) findViewById(R.id.rdoH613c2);
            seclblH614 = (LinearLayout) findViewById(R.id.seclblH614);
            secH614R = (LinearLayout) findViewById(R.id.secH614R);
            lineH614R = (View) findViewById(R.id.lineH614R);
            VlblH614R = (TextView) findViewById(R.id.VlblH614R);
            spnH614R = (Spinner) findViewById(R.id.spnH614R);
            List<String> listH614R = new ArrayList<String>();

            listH614R.add("");
            listH614R.add("0-হাত ধোয়না");
            listH614R.add("1-টিউবওয়েল");
            listH614R.add("2-নদী বা খাল পুকুর");
            listH614R.add("3-বৃষ্টির পানি");
            listH614R.add("4-অন্যান্য");
            ArrayAdapter<String> adptrH614R = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH614R);
            spnH614R.setAdapter(adptrH614R);

            spnH614R.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH614R.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH614R.getSelectedItem().toString(), "-");
                    if (!spnData.equalsIgnoreCase("4")) {
                        txtH614RX.setText("");
                        secH614RX.setVisibility(View.GONE);
                        lineH614RX.setVisibility(View.GONE);
                    } else {
                        secH614RX.setVisibility(View.VISIBLE);
                        lineH614RX.setVisibility(View.VISIBLE);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH614RX = (LinearLayout) findViewById(R.id.secH614RX);
            lineH614RX = (View) findViewById(R.id.lineH614RX);
            VlblH614RX = (TextView) findViewById(R.id.VlblH614RX);
            txtH614RX = (EditText) findViewById(R.id.txtH614RX);
            secH614D = (LinearLayout) findViewById(R.id.secH614D);
            lineH614D = (View) findViewById(R.id.lineH614D);
            VlblH614D = (TextView) findViewById(R.id.VlblH614D);
            spnH614D = (Spinner) findViewById(R.id.spnH614D);
            List<String> listH614D = new ArrayList<String>();

            listH614D.add("");
            listH614D.add("0-হাত ধোয়না");
            listH614D.add("1-টিউবওয়েল");
            listH614D.add("2-নদী বা খাল পুকুর");
            listH614D.add("3-বৃষ্টির পানি");
            listH614D.add("4-অন্যান্য");
            ArrayAdapter<String> adptrH614D = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH614D);
            spnH614D.setAdapter(adptrH614D);

            spnH614D.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH614D.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH614D.getSelectedItem().toString(), "-");
                    if (!spnData.equalsIgnoreCase("4")) {
                        txtH614DX.setText("");
                        secH614DX.setVisibility(View.GONE);
                        lineH614DX.setVisibility(View.GONE);
                    } else {
                        secH614DX.setVisibility(View.VISIBLE);
                        lineH614DX.setVisibility(View.VISIBLE);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH614DX = (LinearLayout) findViewById(R.id.secH614DX);
            lineH614DX = (View) findViewById(R.id.lineH614DX);
            VlblH614DX = (TextView) findViewById(R.id.VlblH614DX);
            txtH614DX = (EditText) findViewById(R.id.txtH614DX);
            secH614a = (LinearLayout) findViewById(R.id.secH614a);
            lineH614a = (View) findViewById(R.id.lineH614a);
            VlblH614a = (TextView) findViewById(R.id.VlblH614a);
            rdogrpH614a = (RadioGroup) findViewById(R.id.rdogrpH614a);

            rdoH614a1 = (RadioButton) findViewById(R.id.rdoH614a1);
            rdoH614a2 = (RadioButton) findViewById(R.id.rdoH614a2);
            rdoH614a3 = (RadioButton) findViewById(R.id.rdoH614a3);
            seclblH6141 = (LinearLayout) findViewById(R.id.seclblH6141);
            secH614b1 = (LinearLayout) findViewById(R.id.secH614b1);
            lineH614b1 = (View) findViewById(R.id.lineH614b1);
            VlblH614b1 = (TextView) findViewById(R.id.VlblH614b1);
            chkH614b1 = (CheckBox) findViewById(R.id.chkH614b1);
            secH614b2 = (LinearLayout) findViewById(R.id.secH614b2);
            lineH614b2 = (View) findViewById(R.id.lineH614b2);
            VlblH614b2 = (TextView) findViewById(R.id.VlblH614b2);
            chkH614b2 = (CheckBox) findViewById(R.id.chkH614b2);
            secH614b3 = (LinearLayout) findViewById(R.id.secH614b3);
            lineH614b3 = (View) findViewById(R.id.lineH614b3);
            VlblH614b3 = (TextView) findViewById(R.id.VlblH614b3);
            chkH614b3 = (CheckBox) findViewById(R.id.chkH614b3);
            secH614b4 = (LinearLayout) findViewById(R.id.secH614b4);
            lineH614b4 = (View) findViewById(R.id.lineH614b4);
            VlblH614b4 = (TextView) findViewById(R.id.VlblH614b4);
            chkH614b4 = (CheckBox) findViewById(R.id.chkH614b4);
            secH614b5 = (LinearLayout) findViewById(R.id.secH614b5);
            lineH614b5 = (View) findViewById(R.id.lineH614b5);
            VlblH614b5 = (TextView) findViewById(R.id.VlblH614b5);
            chkH614b5 = (CheckBox) findViewById(R.id.chkH614b5);
            /*chkH614b5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (!isChecked) {
                        secH614b5X.setVisibility(View.GONE);
                        lineH614b5X.setVisibility(View.GONE);
                        txtH614b5X.setText("");
                        secH614b6.setVisibility(View.GONE);
                        lineH614b6.setVisibility(View.GONE);
                    } else {
                        secH614b5X.setVisibility(View.VISIBLE);
                        lineH614b5X.setVisibility(View.VISIBLE);
                        secH614b6.setVisibility(View.VISIBLE);
                        lineH614b6.setVisibility(View.VISIBLE);
                    }
                }
            });*/
            secH614b5X = (LinearLayout) findViewById(R.id.secH614b5X);
            lineH614b5X = (View) findViewById(R.id.lineH614b5X);
            VlblH614b5X = (TextView) findViewById(R.id.VlblH614b5X);
            txtH614b5X = (EditText) findViewById(R.id.txtH614b5X);
            secH614b6 = (LinearLayout) findViewById(R.id.secH614b6);
            lineH614b6 = (View) findViewById(R.id.lineH614b6);
            VlblH614b6 = (TextView) findViewById(R.id.VlblH614b6);
            chkH614b6 = (CheckBox) findViewById(R.id.chkH614b6);
            chkH614b6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH614b1.setChecked(false);
                        chkH614b2.setChecked(false);
                        chkH614b3.setChecked(false);
                        chkH614b4.setChecked(false);
                        chkH614b5.setChecked(false);
                        secH614c.setVisibility(View.GONE);
                        rdogrpH614c.clearCheck();
                    } else
                        secH614c.setVisibility(View.VISIBLE);

                }
            });
            chkH614b1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH614b6.setChecked(false);
                    }

                }
            });
            chkH614b2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH614b6.setChecked(false);
                    }

                }
            });
            chkH614b3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH614b6.setChecked(false);
                    }

                }
            });
            chkH614b4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        chkH614b6.setChecked(false);
                    }

                }
            });
            chkH614b5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (!isChecked) {
                        secH614b5X.setVisibility(View.GONE);
                        lineH614b5X.setVisibility(View.GONE);
                        txtH614b5X.setText("");
                        //secH614b6.setVisibility(View.GONE);
                        //lineH614b6.setVisibility(View.GONE);
                    } else {
                        chkH614b6.setChecked(false);

                        secH614b5X.setVisibility(View.VISIBLE);
                        lineH614b5X.setVisibility(View.VISIBLE);
                        //secH614b6.setVisibility(View.VISIBLE);
                        //lineH614b6.setVisibility(View.VISIBLE);
                    }
                }
            });



            secH614c = (LinearLayout) findViewById(R.id.secH614c);
            lineH614c = (View) findViewById(R.id.lineH614c);
            VlblH614c = (TextView) findViewById(R.id.VlblH614c);
            rdogrpH614c = (RadioGroup) findViewById(R.id.rdogrpH614c);

            rdoH614c1 = (RadioButton) findViewById(R.id.rdoH614c1);
            rdoH614c2 = (RadioButton) findViewById(R.id.rdoH614c2);
            seclblH615 = (LinearLayout) findViewById(R.id.seclblH615);
            secH615a = (LinearLayout) findViewById(R.id.secH615a);
            lineH615a = (View) findViewById(R.id.lineH615a);
            VlblH615a = (TextView) findViewById(R.id.VlblH615a);
            txtH615a = (EditText) findViewById(R.id.txtH615a);
            secH615b = (LinearLayout) findViewById(R.id.secH615b);
            lineH615b = (View) findViewById(R.id.lineH615b);
            VlblH615b = (TextView) findViewById(R.id.VlblH615b);
            txtH615b = (EditText) findViewById(R.id.txtH615b);
            secH616 = (LinearLayout) findViewById(R.id.secH616);
            lineH616 = (View) findViewById(R.id.lineH616);
            VlblH616 = (TextView) findViewById(R.id.VlblH616);
            rdogrpH616 = (RadioGroup) findViewById(R.id.rdogrpH616);

            rdoH6161 = (RadioButton) findViewById(R.id.rdoH6161);
            rdoH6162 = (RadioButton) findViewById(R.id.rdoH6162);
            secH617 = (LinearLayout) findViewById(R.id.secH617);
            lineH617 = (View) findViewById(R.id.lineH617);
            VlblH617 = (TextView) findViewById(R.id.VlblH617);
            rdogrpH617 = (RadioGroup) findViewById(R.id.rdogrpH617);

            rdoH6171 = (RadioButton) findViewById(R.id.rdoH6171);
            rdoH6172 = (RadioButton) findViewById(R.id.rdoH6172);
            rdogrpH617.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH617 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH617.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH617.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH617[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        secH618.setVisibility(View.GONE);
                        lineH618.setVisibility(View.GONE);
                        spnH618.setSelection(0);
                        secH618X.setVisibility(View.GONE);
                        lineH618X.setVisibility(View.GONE);
                        txtH618X.setText("");
                    } else {
                        secH618.setVisibility(View.VISIBLE);
                        lineH618.setVisibility(View.VISIBLE);
                        secH618X.setVisibility(View.VISIBLE);
                        lineH618X.setVisibility(View.VISIBLE);
                    }
                }
                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH618 = (LinearLayout) findViewById(R.id.secH618);
            lineH618 = (View) findViewById(R.id.lineH618);
            VlblH618 = (TextView) findViewById(R.id.VlblH618);
            spnH618 = (Spinner) findViewById(R.id.spnH618);
            List<String> listH618 = new ArrayList<String>();

            listH618.add("");
            listH618.add("1-পানি ফোটান");
            listH618.add("2-ব্লিচিং পাউডার বা ক্লোরিন বা বিশুদ্ধকরণ ট্যাবলেট");
            listH618.add("3-ছাকনি বা কাপড়ের ভেতর দিয়ে পানি ছাকেন");
            listH618.add("4-পানি ফিল্টার ব্যবহার করেন সিরামিক বা বালি ম্পজিটইত্যাদি");
            listH618.add("5-পানিকে পাত্রের ভেতর অনেক্ষণ রেখে স্থির হতে দেন");
            listH618.add("6-অন্যান্য উল্লেখ করুন");
            listH618.add("7-জানিনা/কিছুই করিনা");
            ArrayAdapter<String> adptrH618 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listH618);
            spnH618.setAdapter(adptrH618);

            spnH618.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (spnH618.getSelectedItem().toString().length() == 0) return;
                    String spnData = Connection.SelectedSpinnerValue(spnH618.getSelectedItem().toString(), "-");
                    if (!spnData.equalsIgnoreCase("6")) {
                        txtH618X.setText("");
                        secH618X.setVisibility(View.GONE);
                        lineH618X.setVisibility(View.GONE);
                    } else {
                        secH618X.setVisibility(View.VISIBLE);
                        lineH618X.setVisibility(View.VISIBLE);
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }
            });
            secH618X = (LinearLayout) findViewById(R.id.secH618X);
            lineH618X = (View) findViewById(R.id.lineH618X);
            VlblH618X = (TextView) findViewById(R.id.VlblH618X);
            txtH618X = (EditText) findViewById(R.id.txtH618X);
            secH619 = (LinearLayout) findViewById(R.id.secH619);
            lineH619 = (View) findViewById(R.id.lineH619);
            VlblH619 = (TextView) findViewById(R.id.VlblH619);
            rdogrpH619 = (RadioGroup) findViewById(R.id.rdogrpH619);

            rdoH6191 = (RadioButton) findViewById(R.id.rdoH6191);
            rdoH6192 = (RadioButton) findViewById(R.id.rdoH6192);
            rdogrpH619.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int radioButtonID) {
                    String rbData = "";
                    RadioButton rb;
                    String[] d_rdogrpH619 = new String[]{"1", "0"};
                    for (int i = 0; i < rdogrpH619.getChildCount(); i++) {
                        rb = (RadioButton) rdogrpH619.getChildAt(i);
                        if (rb.isChecked()) rbData = d_rdogrpH619[i];
                    }

                    if (rbData.equalsIgnoreCase("0")) {
                        rdogrpH620.clearCheck();
                        secH620.setVisibility(View.GONE);
                    } else {
                        secH620.setVisibility(View.VISIBLE);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                    return;
                }
            });
            secH620 = (LinearLayout) findViewById(R.id.secH620);
            lineH620 = (View) findViewById(R.id.lineH620);
            VlblH620 = (TextView) findViewById(R.id.VlblH620);
            rdogrpH620 = (RadioGroup) findViewById(R.id.rdogrpH620);

            rdoH6201 = (RadioButton) findViewById(R.id.rdoH6201);
            rdoH6202 = (RadioButton) findViewById(R.id.rdoH6202);


            secH321X.setVisibility(View.GONE);
            secH322X.setVisibility(View.GONE);
            secH323X.setVisibility(View.GONE);
            secH324X.setVisibility(View.GONE);
            secH325X.setVisibility(View.GONE);
            secH610RX.setVisibility(View.GONE);
            secH610DX.setVisibility(View.GONE);
            secH610b5X.setVisibility(View.GONE);
            secH611RX.setVisibility(View.GONE);
            secH611DX.setVisibility(View.GONE);
            secH611b5X.setVisibility(View.GONE);
            secH612RX.setVisibility(View.GONE);
            secH612DX.setVisibility(View.GONE);
            secH612b5X.setVisibility(View.GONE);
            secH613RX.setVisibility(View.GONE);
            secH613DX.setVisibility(View.GONE);
            secH613b5X.setVisibility(View.GONE);
            secH614RX.setVisibility(View.GONE);
            secH614DX.setVisibility(View.GONE);
            secH614b5X.setVisibility(View.GONE);

            secH618X.setVisibility(View.GONE);


            DataSearch(RND, SUCHANAID);

            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DataSave();
                }
            });
        } catch (Exception e) {
            Connection.MessageBox(SES.this, e.getMessage());
            return;
        }
    }

    private void DataSave() {
        try {

            String DV = "";

            if (txtRnd.getText().toString().length() == 0 & secRnd.isShown()) {
                Connection.MessageBox(SES.this, "Required field: রাউন্ড নাম্বার.");
                txtRnd.requestFocus();
                return;
            } else if (Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "1" : txtRnd.getText().toString()) < 1 || Integer.valueOf(txtRnd.getText().toString().length() == 0 ? "5" : txtRnd.getText().toString()) > 5) {
                Connection.MessageBox(SES.this, "Value should be between 1 and 5(রাউন্ড নাম্বার).");
                txtRnd.requestFocus();
                return;
            } else if (txtSuchanaID.getText().toString().length() == 0 & secSuchanaID.isShown()) {
                Connection.MessageBox(SES.this, "Required field: উপকারভোগী সদস্য আইডি.");
                txtSuchanaID.requestFocus();
                return;
            } else if (spnMSlNo.getSelectedItemPosition() == 0 & secMSlNo.isShown()) {
                Connection.MessageBox(SES.this, "Required field: তথ্যদানে সহায়তাকারীর লাইন নম্বর #.");
                spnMSlNo.requestFocus();
                return;
            }
            /*else if (Integer.valueOf(txtMSlNo.getText().toString().length() == 0 ? "1" : txtMSlNo.getText().toString()) < 1 || Integer.valueOf(txtMSlNo.getText().toString().length() == 0 ? "99" : txtMSlNo.getText().toString()) > 99) {
                Connection.MessageBox(SES.this, "Value should be between 1 and 99(তথ্যদানে সহায়তাকারীর লাইন নম্বর #).");
                txtMSlNo.requestFocus();
                return;
            }*/

            else if (spnH311.getSelectedItemPosition() == 0 & secH311.isShown()) {
                Connection.MessageBox(SES.this, "Required field: খানার মালিকানা.");
                spnH311.requestFocus();
                return;
            } else if (txtH312.getText().toString().length() == 0 & secH312.isShown()) {
                Connection.MessageBox(SES.this, "Required field: এই খানায়ে কয়টি কক্ষ আছে.");
                txtH312.requestFocus();
                return;
            } else if (Integer.valueOf(txtH312.getText().toString().length() == 0 ? "00" : txtH312.getText().toString()) < 00 || Integer.valueOf(txtH312.getText().toString().length() == 0 ? "20" : txtH312.getText().toString()) > 20) {
                Connection.MessageBox(SES.this, "Value should be between 00 and 20(এই খানায়ে কয়টি কক্ষ আছে).");
                txtH312.requestFocus();
                return;
            } else if (txtH313.getText().toString().length() == 0 & secH313.isShown()) {
                Connection.MessageBox(SES.this, "Required field: ঘুমের জন্য কয়টি কক্ষ ব্যবহার করা হয়.");
                txtH313.requestFocus();
                return;
            } else if (Integer.valueOf(txtH313.getText().toString().length() == 0 ? "00" : txtH313.getText().toString()) < 00 || Integer.valueOf(txtH313.getText().toString().length() == 0 ? "10" : txtH313.getText().toString()) > 10) {
                Connection.MessageBox(SES.this, "Value should be between 00 and 10(ঘুমের জন্য কয়টি কক্ষ ব্যবহার করা হয়).");
                txtH313.requestFocus();
                return;
            } else if ((Integer.parseInt(txtH313.getText().toString()) > Integer.parseInt(txtH312.getText().toString()))) {
                Connection.MessageBox(SES.this, "Error: H313 এর ইনপুট H312 এর চেয়ে বড় হবেনা");
                txtH313.requestFocus();
                return;
            } else if (spnH321.getSelectedItemPosition() == 0 & secH321.isShown()) {
                Connection.MessageBox(SES.this, "Required field: বসত ঘরের মেঝে কি দিয়ে তৈরী?.");
                spnH321.requestFocus();
                return;
            } else if (txtH321X.getText().toString().length() == 0 & secH321X.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH321X.requestFocus();
                return;
            } else if (spnH322.getSelectedItemPosition() == 0 & secH322.isShown()) {
                Connection.MessageBox(SES.this, "Required field: বসত ঘরের চাল/ছাদ কি দিয়ে তৈরী.");
                spnH322.requestFocus();
                return;
            } else if (txtH322X.getText().toString().length() == 0 & secH322X.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH322X.requestFocus();
                return;
            } else if (spnH323.getSelectedItemPosition() == 0 & secH323.isShown()) {
                Connection.MessageBox(SES.this, "Required field: বসত ঘরের দেয়াল কি দিয়ে তৈরী (বাহিরের দিকে).");
                spnH323.requestFocus();
                return;
            } else if (txtH323X.getText().toString().length() == 0 & secH323X.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH323X.requestFocus();
                return;
            } else if (spnH324.getSelectedItemPosition() == 0 & secH324.isShown()) {
                Connection.MessageBox(SES.this, "Required field: এই ঘরের আলোর বর্তমান প্রধান উৎস কী.");
                spnH324.requestFocus();
                return;
            } else if (txtH324X.getText().toString().length() == 0 & secH324X.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH324X.requestFocus();
                return;
            } else if (spnH325.getSelectedItemPosition() == 0 & secH325.isShown()) {
                Connection.MessageBox(SES.this, "Required field: আপনার খানার রান্নার কাজে প্রধানত কি জ্বালানী ব্যবহার করেন.");
                spnH325.requestFocus();
                return;
            } else if (txtH325X.getText().toString().length() == 0 & secH325X.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH325X.requestFocus();
                return;
            } else if (!rdoH3311.isChecked() & !rdoH3312.isChecked() & !rdoH3313.isChecked() & secH331.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (এই খানার সদস্য নয় এমন কারো নিকট থেকে গত ১ বছরে অর্থ পেয়েছেন কি).");
                rdoH3311.requestFocus();
                return;
            } else if (txtH332A.getText().toString().length() == 0 & secH332A.isShown()) {
                Connection.MessageBox(SES.this, "Required field: (বাংলাদেশ) যদিএই অর্থ দেশের ভেতর বা বিদেশ থেকে পেয়ে থাকেন তো গত ১ বছরে সর্বমোট কত টাকা পেয়েছেন (উত্তর জানা না থাকলে উল্লেখ কর: 888888).");
                txtH332A.requestFocus();
                return;
            } else if (Integer.valueOf(txtH332A.getText().toString().length() == 0 ? "000000" : txtH332A.getText().toString()) < 000000 || Integer.valueOf(txtH332A.getText().toString().length() == 0 ? "999999" : txtH332A.getText().toString()) > 999999) {
                Connection.MessageBox(SES.this, "Value should be between 000000 and 999999((বাংলাদেশ) যদিএই অর্থ দেশের ভেতর বা বিদেশ থেকে পেয়ে থাকেন তো গত ১ বছরে সর্বমোট কত টাকা পেয়েছেন (উত্তর জানা না থাকলে উল্লেখ কর: 888888)).");
                txtH332A.requestFocus();
                return;
            } else if (txtH332B.getText().toString().length() == 0 & secH332B.isShown()) {
                Connection.MessageBox(SES.this, "Required field: (বিদেশ) যদিএই অর্থ দেশের ভেতর বা বিদেশ থেকে পেয়ে থাকেন তো গত ১ বছরে সর্বমোট কত টাকা পেয়েছেন (উত্তর জানা না থাকলে উল্লেখ কর: 888888).");
                txtH332B.requestFocus();
                return;
            } else if (Integer.valueOf(txtH332B.getText().toString().length() == 0 ? "000000" : txtH332B.getText().toString()) < 000000 || Integer.valueOf(txtH332B.getText().toString().length() == 0 ? "999999" : txtH332B.getText().toString()) > 999999) {
                Connection.MessageBox(SES.this, "Value should be between 000000 and 999999((বিদেশ) যদিএই অর্থ দেশের ভেতর বা বিদেশ থেকে পেয়ে থাকেন তো গত ১ বছরে সর্বমোট কত টাকা পেয়েছেন (উত্তর জানা না থাকলে উল্লেখ কর: 888888)).");
                txtH332B.requestFocus();
                return;
            } else if (!rdoH3411.isChecked() & !rdoH3412.isChecked() & secH341.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (এই খানায় কি ৫-৭ বছর বয়সী কোনো শিশু আছে যে গত ১ বছরের ভেতর স্কুল বা মাদ্রাসায় ভর্তি হয়েছে).");
                rdoH3411.requestFocus();
                return;
            } else if (txtH342.getText().toString().length() == 0 & secH342.isShown()) {
                Connection.MessageBox(SES.this, "Required field: যদি হাঁ হয় তবে কত জন.");
                txtH342.requestFocus();
                return;
            } else if (Integer.valueOf(txtH342.getText().toString().length() == 0 ? "00" : txtH342.getText().toString()) < 00 || Integer.valueOf(txtH342.getText().toString().length() == 0 ? "99" : txtH342.getText().toString()) > 99) {
                Connection.MessageBox(SES.this, "Value should be between 00 and 99(যদি হাঁ হয় তবে কত জন).");
                txtH342.requestFocus();
                return;
            } else if (!rdoH611.isChecked() & !rdoH612.isChecked() & !rdoH613.isChecked() & secH61.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (আপনাদের কি কোন শৌচাগার আছে).");
                rdoH611.requestFocus();
                return;
            } else if (!rdoH621.isChecked() & !rdoH622.isChecked() & !rdoH623.isChecked() & !rdoH624.isChecked() & !rdoH625.isChecked() & !rdoH626.isChecked() & !rdoH627.isChecked() & secH62.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (কি ধরনের শৌচাগার ব্যবহার করেন).");
                rdoH621.requestFocus();
                return;
            } else if (spnH63A.getSelectedItemPosition() == 0 & secH63A.isShown()) {
                Connection.MessageBox(SES.this, "Required field: রান্নাঘরেরবর্জ্য.");
                spnH63A.requestFocus();
                return;
            } else if (txtH63AX.getText().toString().length() == 0 & secH63AX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য.");
                txtH63AX.requestFocus();
                return;
            } else if (spnH63B.getSelectedItemPosition() == 0 & secH63B.isShown()) {
                Connection.MessageBox(SES.this, "Required field: শিশুর পায়েখানা.");
                spnH63B.requestFocus();
                return;
            } else if (txtH63BX.getText().toString().length() == 0 & secH63BX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য.");
                txtH63BX.requestFocus();
                return;
            } else if (spnH63C.getSelectedItemPosition() == 0 & secH63C.isShown()) {
                Connection.MessageBox(SES.this, "Required field: হাস মুরগির বর্জ্য.");
                spnH63C.requestFocus();
                return;
            } else if (txtH63CX.getText().toString().length() == 0 & secH63CX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য.");
                txtH63CX.requestFocus();
                return;
            } else if (spnH63D.getSelectedItemPosition() == 0 & secH63D.isShown()) {
                Connection.MessageBox(SES.this, "Required field: গরু ছাগলের বর্জ্য.");
                spnH63D.requestFocus();
                return;
            } else if (txtH63DX.getText().toString().length() == 0 & secH63DX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য.");
                txtH63DX.requestFocus();
                return;
            } else if (spnH63E.getSelectedItemPosition() == 0 & secH63E.isShown()) {
                Connection.MessageBox(SES.this, "Required field: গৃহস্তলির বর্জ্য.");
                spnH63E.requestFocus();
                return;
            } else if (txtH63EX.getText().toString().length() == 0 & secH63EX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য.");
                txtH63EX.requestFocus();
                return;
            } else if (txtH63X.getText().toString().length() == 0 & secH63X.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH63X.requestFocus();
                return;
            } else if (!rdoH641.isChecked() & !rdoH642.isChecked() & secH64.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (হাত ধোয়ার জন্য নির্দিষ্ট স্থান আছে (যেখানে পানি ও সাবান  বা অন্যান্য জিনিস বা সাবানের বিকল্প আছে)).");
                rdoH641.requestFocus();
                return;
            } else if (!rdoH651.isChecked() & !rdoH652.isChecked() & secH65.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (টয়লেট থেকে ৩০ ফিট এর মধ্যে হাত ধোয়ার জায়গা আছে).");
                rdoH651.requestFocus();
                return;
            } else if (!rdoH661.isChecked() & !rdoH662.isChecked() & secH66.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (টয়লেটের জায়গা থেকে ৩০ ফিট এর মধ্যে পানি সহ হাত ধোয়ার জায়গা আছে).");
                rdoH661.requestFocus();
                return;
            } else if (!rdoH671.isChecked() & !rdoH672.isChecked() & secH67.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (টয়লেটের জায়গা থেকে ৩০ ফিট এর মধ্যে পানি ও সাবান/সাবানের বিকল্প সহ হাত ধোয়ার জায়গা আছে).");
                rdoH671.requestFocus();
                return;
            } else if (!rdoH681.isChecked() & !rdoH682.isChecked() & secH68.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (মায়ের হাত পরিষ্কার আছে?).");
                rdoH681.requestFocus();
                return;
            } else if (!rdoH691.isChecked() & !rdoH692.isChecked() & secH69.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (শিশুর হাত পরিষ্কার আছে? ).");
                rdoH691.requestFocus();
                return;
            } else if (spnH610R.getSelectedItemPosition() == 0 & secH610R.isShown()) {
                Connection.MessageBox(SES.this, "Required field: খাবার পানির উৎস (বর্ষার মৌসুমে).");
                spnH610R.requestFocus();
                return;
            } else if (txtH610RX.getText().toString().length() == 0 & secH610RX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH610RX.requestFocus();
                return;
            } else if (spnH610D.getSelectedItemPosition() == 0 & secH610D.isShown()) {
                Connection.MessageBox(SES.this, "Required field: খাবার পানি উৎস (শুকনো মৌসুমে ).");
                spnH610D.requestFocus();
                return;
            } else if (txtH610DX.getText().toString().length() == 0 & secH610DX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH610DX.requestFocus();
                return;
            } else if (!rdoH610a1.isChecked() & !rdoH610a2.isChecked() & !rdoH610a3.isChecked() & secH610a.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (এই খানার কি কোনো নিজেস্য পানির উত্স্য আছে).");
                rdoH610a1.requestFocus();
                return;
            } else if (txtH610b5X.getText().toString().length() == 0 & secH610b5X.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH610b5X.requestFocus();
                return;
            } else if (!rdoH610c1.isChecked() & !rdoH610c2.isChecked() & secH610c.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (পানির কনটেইনার কি ঢেকে রাখা ).");
                rdoH610c1.requestFocus();
                return;
            } else if (spnH611R.getSelectedItemPosition() == 0 & secH611R.isShown()) {
                Connection.MessageBox(SES.this, "Required field: রান্না করার পানি (বর্ষার মৌসুমে ).");
                spnH611R.requestFocus();
                return;
            } else if (txtH611RX.getText().toString().length() == 0 & secH611RX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH611RX.requestFocus();
                return;
            } else if (spnH611D.getSelectedItemPosition() == 0 & secH611D.isShown()) {
                Connection.MessageBox(SES.this, "Required field: রান্না করার পানি (শুকনো মৌসুমে).");
                spnH611D.requestFocus();
                return;
            } else if (txtH611DX.getText().toString().length() == 0 & secH611DX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH611DX.requestFocus();
                return;
            } else if (!rdoH611a1.isChecked() & !rdoH611a2.isChecked() & !rdoH611a3.isChecked() & secH611a.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (এই খানার কি কোনো নিজেস্য পানির উত্স্য আছে).");
                rdoH611a1.requestFocus();
                return;
            } else if (txtH611b5X.getText().toString().length() == 0 & secH611b5X.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH611b5X.requestFocus();
                return;
            } else if (!rdoH611c1.isChecked() & !rdoH611c2.isChecked() & secH611c.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (পানির কনটেইনার কি ঢেকে রাখা হয়).");
                rdoH611c1.requestFocus();
                return;
            } else if (spnH612R.getSelectedItemPosition() == 0 & secH612R.isShown()) {
                Connection.MessageBox(SES.this, "Required field: ধোয়া মোছার জন্য পানি (বর্ষার মৌসুমে).");
                spnH612R.requestFocus();
                return;
            } else if (txtH612RX.getText().toString().length() == 0 & secH612RX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH612RX.requestFocus();
                return;
            } else if (spnH612D.getSelectedItemPosition() == 0 & secH612D.isShown()) {
                Connection.MessageBox(SES.this, "Required field: ধোয়া মোছার জন্য পানি শুকনো মৌসুমে.");
                spnH612D.requestFocus();
                return;
            } else if (txtH612DX.getText().toString().length() == 0 & secH612DX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH612DX.requestFocus();
                return;
            } else if (!rdoH612a1.isChecked() & !rdoH612a2.isChecked() & !rdoH612a3.isChecked() & secH612a.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (এই খানার কি কোনো নিজেস্য পানির উত্স্য আছে).");
                rdoH612a1.requestFocus();
                return;
            } else if (txtH612b5X.getText().toString().length() == 0 & secH612b5X.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH612b5X.requestFocus();
                return;
            } else if (!rdoH612c1.isChecked() & !rdoH612c2.isChecked() & secH612c.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (পানির কনটেইনার কি ঢেকে রাখা হয়).");
                rdoH612c1.requestFocus();
                return;
            } else if (spnH613R.getSelectedItemPosition() == 0 & secH613R.isShown()) {
                Connection.MessageBox(SES.this, "Required field: খাবার দেয়ার আগে হাত ধোয়ার জন্য পানি (বর্ষার মৌসুমে).");
                spnH613R.requestFocus();
                return;
            } else if (txtH613RX.getText().toString().length() == 0 & secH613RX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH613RX.requestFocus();
                return;
            } else if (spnH613D.getSelectedItemPosition() == 0 & secH613D.isShown()) {
                Connection.MessageBox(SES.this, "Required field: খাবার দেয়ার আগে হাত ধোয়ার জন্য পানি  শুকনো মৌসুমে.");
                spnH613D.requestFocus();
                return;
            } else if (txtH613DX.getText().toString().length() == 0 & secH613DX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH613DX.requestFocus();
                return;
            } else if (!rdoH613a1.isChecked() & !rdoH613a2.isChecked() & !rdoH613a3.isChecked() & secH613a.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (এই খানার কি কোনো নিজেস্য পানির উত্স্য আছে).");
                rdoH613a1.requestFocus();
                return;
            } else if (txtH613b5X.getText().toString().length() == 0 & secH613b5X.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH613b5X.requestFocus();
                return;
            } else if (!rdoH613c1.isChecked() & !rdoH613c2.isChecked() & secH613c.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (পানির কনটেইনার কি ঢেকে রাখা হয়).");
                rdoH613c1.requestFocus();
                return;
            } else if (spnH614R.getSelectedItemPosition() == 0 & secH614R.isShown()) {
                Connection.MessageBox(SES.this, "Required field: খাবার খাওয়ার  আগে হাত ধোয়ার জন্য (বর্ষার মৌসুমে).");
                spnH614R.requestFocus();
                return;
            } else if (txtH614RX.getText().toString().length() == 0 & secH614RX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH614RX.requestFocus();
                return;
            } else if (spnH614D.getSelectedItemPosition() == 0 & secH614D.isShown()) {
                Connection.MessageBox(SES.this, "Required field: খাবার খাওয়ার  আগে হাত ধোয়ার জন্য পানি (শুকনো মৌসুমে).");
                spnH614D.requestFocus();
                return;
            } else if (txtH614DX.getText().toString().length() == 0 & secH614DX.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH614DX.requestFocus();
                return;
            } else if (!rdoH614a1.isChecked() & !rdoH614a2.isChecked() & !rdoH614a3.isChecked() & secH614a.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (এই খানার কি কোনো নিজেস্য পানির উত্স্য আছে).");
                rdoH614a1.requestFocus();
                return;
            } else if (txtH614b5X.getText().toString().length() == 0 & secH614b5X.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH614b5X.requestFocus();
                return;
            } else if (!rdoH614c1.isChecked() & !rdoH614c2.isChecked() & secH614c.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (পানির কনটেইনার কি ঢেকে রাখা ).");
                rdoH614c1.requestFocus();
                return;
            } else if (txtH615a.getText().toString().length() == 0 & secH615a.isShown()) {
                Connection.MessageBox(SES.this, "Required field: খাবার পানির উৎসের দূরত্ব.");
                txtH615a.requestFocus();
                return;
            } else if (Integer.valueOf(txtH615a.getText().toString().length() == 0 ? "000" : txtH615a.getText().toString()) < 000 || Integer.valueOf(txtH615a.getText().toString().length() == 0 ? "999" : txtH615a.getText().toString()) > 999) {
                Connection.MessageBox(SES.this, "Value should be between 000 and 999(খাবার পানির উৎসের দূরত্ব).");
                txtH615a.requestFocus();
                return;
            } else if (txtH615b.getText().toString().length() == 0 & secH615b.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য ব্যবহার্য পানির উৎসের দূরত্ব.");
                txtH615b.requestFocus();
                return;
            } else if (Integer.valueOf(txtH615b.getText().toString().length() == 0 ? "000" : txtH615b.getText().toString()) < 000 || Integer.valueOf(txtH615b.getText().toString().length() == 0 ? "999" : txtH615b.getText().toString()) > 999) {
                Connection.MessageBox(SES.this, "Value should be between 000 and 999(অন্যান্য ব্যবহার্য পানির উৎসের দূরত্ব).");
                txtH615b.requestFocus();
                return;
            } else if (!rdoH6161.isChecked() & !rdoH6162.isChecked() & secH616.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (আপনার ব্যবহৃত পানিতে গত এক বছরের মধ্যে আর্সেনিক এর জন্য টেস্ট করেছেন  (টিউবওয়েলের ক্ষেত্রে প্রযোজ্য)).");
                rdoH6161.requestFocus();
                return;
            } else if (!rdoH6171.isChecked() & !rdoH6172.isChecked() & secH617.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (পানিকে বিশুদ্ধ করার জন্য আপনি কি কিছু করেন).");
                rdoH6171.requestFocus();
                return;
            } else if (spnH618.getSelectedItemPosition() == 0 & secH618.isShown()) {
                Connection.MessageBox(SES.this, "Required field: পানিকে বিশুদ্ধ করার জন্য আপনি সাধারনত কি করেন.");
                spnH618.requestFocus();
                return;
            } else if (txtH618X.getText().toString().length() == 0 & secH618X.isShown()) {
                Connection.MessageBox(SES.this, "Required field: অন্যান্য উল্লেখ করুন.");
                txtH618X.requestFocus();
                return;
            } else if (!rdoH6191.isChecked() & !rdoH6192.isChecked() & secH619.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (খানায় তৈরী  বা রান্না করা খাবার রেখে দেয় কিছুক্ষণ পর খাবার জন্য  ).");
                rdoH6191.requestFocus();
                return;
            } else if (!rdoH6201.isChecked() & !rdoH6202.isChecked() & secH620.isShown()) {
                Connection.MessageBox(SES.this, "Select anyone options from (খানায় তৈরী/রান্না করা খাবার ঢেকে রেখে দেয় কিছুক্ষণ পর খাবার জন্য  ).");
                rdoH6201.requestFocus();
                return;
            }

            String SQL = "";
            RadioButton rb;

            SES_DataModel objSave = new SES_DataModel();
            objSave.setRnd(txtRnd.getText().toString());
            objSave.setSuchanaID(txtSuchanaID.getText().toString());
            objSave.setMSlNo((spnMSlNo.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnMSlNo.getSelectedItem().toString(), "-")));

            objSave.setH311((spnH311.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH311.getSelectedItem().toString(), "-")));
            objSave.setH312(txtH312.getText().toString());
            objSave.setH313(txtH313.getText().toString());
            objSave.setH321((spnH321.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH321.getSelectedItem().toString(), "-")));
            objSave.setH321X(txtH321X.getText().toString());
            objSave.setH322((spnH322.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH322.getSelectedItem().toString(), "-")));
            objSave.setH322X(txtH322X.getText().toString());
            objSave.setH323((spnH323.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH323.getSelectedItem().toString(), "-")));
            objSave.setH323X(txtH323X.getText().toString());
            objSave.setH324((spnH324.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH324.getSelectedItem().toString(), "-")));
            objSave.setH324X(txtH324X.getText().toString());
            objSave.setH325((spnH325.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH325.getSelectedItem().toString(), "-")));
            objSave.setH325X(txtH325X.getText().toString());
            String[] d_rdogrpH331 = new String[]{"1", "0", "8"};
            objSave.setH331("");
            for (int i = 0; i < rdogrpH331.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH331.getChildAt(i);
                if (rb.isChecked()) objSave.setH331(d_rdogrpH331[i]);
            }

            objSave.setH332A(txtH332A.getText().toString());
            objSave.setH332B(txtH332B.getText().toString());
            String[] d_rdogrpH341 = new String[]{"1", "0"};
            objSave.setH341("");
            for (int i = 0; i < rdogrpH341.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH341.getChildAt(i);
                if (rb.isChecked()) objSave.setH341(d_rdogrpH341[i]);
            }

            objSave.setH342(txtH342.getText().toString());
            String[] d_rdogrpH61 = new String[]{"1", "0", "3"};
            objSave.setH61("");
            for (int i = 0; i < rdogrpH61.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH61.getChildAt(i);
                if (rb.isChecked()) objSave.setH61(d_rdogrpH61[i]);
            }

            String[] d_rdogrpH62 = new String[]{"1", "2", "3", "4", "5", "6", "7"};
            objSave.setH62("");
            for (int i = 0; i < rdogrpH62.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH62.getChildAt(i);
                if (rb.isChecked()) objSave.setH62(d_rdogrpH62[i]);
            }

            objSave.setH63A((spnH63A.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH63A.getSelectedItem().toString(), "-")));
            objSave.setH63AX(txtH63AX.getText().toString());
            objSave.setH63B((spnH63B.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH63B.getSelectedItem().toString(), "-")));
            objSave.setH63BX(txtH63BX.getText().toString());
            objSave.setH63C((spnH63C.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH63C.getSelectedItem().toString(), "-")));
            objSave.setH63CX(txtH63CX.getText().toString());
            objSave.setH63D((spnH63D.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH63D.getSelectedItem().toString(), "-")));
            objSave.setH63DX(txtH63DX.getText().toString());
            objSave.setH63E((spnH63E.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH63E.getSelectedItem().toString(), "-")));
            objSave.setH63EX(txtH63EX.getText().toString());
            objSave.setH63X(txtH63X.getText().toString());
            String[] d_rdogrpH64 = new String[]{"1", "0"};
            objSave.setH64("");
            for (int i = 0; i < rdogrpH64.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH64.getChildAt(i);
                if (rb.isChecked()) objSave.setH64(d_rdogrpH64[i]);
            }

            String[] d_rdogrpH65 = new String[]{"1", "0"};
            objSave.setH65("");
            for (int i = 0; i < rdogrpH65.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH65.getChildAt(i);
                if (rb.isChecked()) objSave.setH65(d_rdogrpH65[i]);
            }

            String[] d_rdogrpH66 = new String[]{"1", "0"};
            objSave.setH66("");
            for (int i = 0; i < rdogrpH66.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH66.getChildAt(i);
                if (rb.isChecked()) objSave.setH66(d_rdogrpH66[i]);
            }

            String[] d_rdogrpH67 = new String[]{"1", "0"};
            objSave.setH67("");
            for (int i = 0; i < rdogrpH67.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH67.getChildAt(i);
                if (rb.isChecked()) objSave.setH67(d_rdogrpH67[i]);
            }

            String[] d_rdogrpH68 = new String[]{"1", "0"};
            objSave.setH68("");
            for (int i = 0; i < rdogrpH68.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH68.getChildAt(i);
                if (rb.isChecked()) objSave.setH68(d_rdogrpH68[i]);
            }

            String[] d_rdogrpH69 = new String[]{"1", "0"};
            objSave.setH69("");
            for (int i = 0; i < rdogrpH69.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH69.getChildAt(i);
                if (rb.isChecked()) objSave.setH69(d_rdogrpH69[i]);
            }

            objSave.setH610R((spnH610R.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH610R.getSelectedItem().toString(), "-")));
            objSave.setH610RX(txtH610RX.getText().toString());
            objSave.setH610D((spnH610D.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH610D.getSelectedItem().toString(), "-")));
            objSave.setH610DX(txtH610DX.getText().toString());
            String[] d_rdogrpH610a = new String[]{"1", "2", "3"};
            objSave.setH610a("");
            for (int i = 0; i < rdogrpH610a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH610a.getChildAt(i);
                if (rb.isChecked()) objSave.setH610a(d_rdogrpH610a[i]);
            }

            objSave.setH610b1((chkH610b1.isChecked() ? "1" : "2"));
            objSave.setH610b2((chkH610b2.isChecked() ? "1" : "2"));
            objSave.setH610b3((chkH610b3.isChecked() ? "1" : "2"));
            objSave.setH610b4((chkH610b4.isChecked() ? "1" : "2"));
            objSave.setH610b5((chkH610b5.isChecked() ? "1" : "2"));
            objSave.setH610b5X(txtH610b5X.getText().toString());
            objSave.setH610b6((chkH610b6.isChecked() ? "1" : "2"));
            String[] d_rdogrpH610c = new String[]{"1", "0"};
            objSave.setH610c("");
            for (int i = 0; i < rdogrpH610c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH610c.getChildAt(i);
                if (rb.isChecked()) objSave.setH610c(d_rdogrpH610c[i]);
            }

            objSave.setH611R((spnH611R.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH611R.getSelectedItem().toString(), "-")));
            objSave.setH611RX(txtH611RX.getText().toString());
            objSave.setH611D((spnH611D.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH611D.getSelectedItem().toString(), "-")));
            objSave.setH611DX(txtH611DX.getText().toString());
            String[] d_rdogrpH611a = new String[]{"1", "2", "3"};
            objSave.setH611a("");
            for (int i = 0; i < rdogrpH611a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH611a.getChildAt(i);
                if (rb.isChecked()) objSave.setH611a(d_rdogrpH611a[i]);
            }

            objSave.setH611b1((chkH611b1.isChecked() ? "1" : "2"));
            objSave.setH611b2((chkH611b2.isChecked() ? "1" : "2"));
            objSave.setH611b3((chkH611b3.isChecked() ? "1" : "2"));
            objSave.setH611b4((chkH611b4.isChecked() ? "1" : "2"));
            objSave.setH611b5((chkH611b5.isChecked() ? "1" : "2"));
            objSave.setH611b5X(txtH611b5X.getText().toString());
            objSave.setH611b6((chkH611b6.isChecked() ? "1" : "2"));
            String[] d_rdogrpH611c = new String[]{"1", "0"};
            objSave.setH611c("");
            for (int i = 0; i < rdogrpH611c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH611c.getChildAt(i);
                if (rb.isChecked()) objSave.setH611c(d_rdogrpH611c[i]);
            }

            objSave.setH612R((spnH612R.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH612R.getSelectedItem().toString(), "-")));
            objSave.setH612RX(txtH612RX.getText().toString());
            objSave.setH612D((spnH612D.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH612D.getSelectedItem().toString(), "-")));
            objSave.setH612DX(txtH612DX.getText().toString());
            String[] d_rdogrpH612a = new String[]{"1", "2", "3"};
            objSave.setH612a("");
            for (int i = 0; i < rdogrpH612a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH612a.getChildAt(i);
                if (rb.isChecked()) objSave.setH612a(d_rdogrpH612a[i]);
            }

            objSave.setH612b1((chkH612b1.isChecked() ? "1" : "2"));
            objSave.setH612b2((chkH612b2.isChecked() ? "1" : "2"));
            objSave.setH612b3((chkH612b3.isChecked() ? "1" : "2"));
            objSave.setH612b4((chkH612b4.isChecked() ? "1" : "2"));
            objSave.setH612b5((chkH612b5.isChecked() ? "1" : "2"));
            objSave.setH612b5X(txtH612b5X.getText().toString());
            objSave.setH612b6((chkH612b6.isChecked() ? "1" : "2"));
            String[] d_rdogrpH612c = new String[]{"1", "0"};
            objSave.setH612c("");
            for (int i = 0; i < rdogrpH612c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH612c.getChildAt(i);
                if (rb.isChecked()) objSave.setH612c(d_rdogrpH612c[i]);
            }

            objSave.setH613R((spnH613R.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH613R.getSelectedItem().toString(), "-")));
            objSave.setH613RX(txtH613RX.getText().toString());
            objSave.setH613D((spnH613D.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH613D.getSelectedItem().toString(), "-")));
            objSave.setH613DX(txtH613DX.getText().toString());
            String[] d_rdogrpH613a = new String[]{"1", "2", "3"};
            objSave.setH613a("");
            for (int i = 0; i < rdogrpH613a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH613a.getChildAt(i);
                if (rb.isChecked()) objSave.setH613a(d_rdogrpH613a[i]);
            }

            objSave.setH613b1((chkH613b1.isChecked() ? "1" : "2"));
            objSave.setH613b2((chkH613b2.isChecked() ? "1" : "2"));
            objSave.setH613b3((chkH613b3.isChecked() ? "1" : "2"));
            objSave.setH613b4((chkH613b4.isChecked() ? "1" : "2"));
            objSave.setH613b5((chkH613b5.isChecked() ? "1" : "2"));
            objSave.setH613b5X(txtH613b5X.getText().toString());
            objSave.setH613b6((chkH613b6.isChecked() ? "1" : "2"));
            String[] d_rdogrpH613c = new String[]{"1", "0"};
            objSave.setH613c("");
            for (int i = 0; i < rdogrpH613c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH613c.getChildAt(i);
                if (rb.isChecked()) objSave.setH613c(d_rdogrpH613c[i]);
            }

            objSave.setH614R((spnH614R.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH614R.getSelectedItem().toString(), "-")));
            objSave.setH614RX(txtH614RX.getText().toString());
            objSave.setH614D((spnH614D.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH614D.getSelectedItem().toString(), "-")));
            objSave.setH614DX(txtH614DX.getText().toString());
            String[] d_rdogrpH614a = new String[]{"1", "2", "3"};
            objSave.setH614a("");
            for (int i = 0; i < rdogrpH614a.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH614a.getChildAt(i);
                if (rb.isChecked()) objSave.setH614a(d_rdogrpH614a[i]);
            }

            objSave.setH614b1((chkH614b1.isChecked() ? "1" : "2"));
            objSave.setH614b2((chkH614b2.isChecked() ? "1" : "2"));
            objSave.setH614b3((chkH614b3.isChecked() ? "1" : "2"));
            objSave.setH614b4((chkH614b4.isChecked() ? "1" : "2"));
            objSave.setH614b5((chkH614b5.isChecked() ? "1" : "2"));
            objSave.setH614b5X(txtH614b5X.getText().toString());
            objSave.setH614b6((chkH614b6.isChecked() ? "1" : "2"));
            String[] d_rdogrpH614c = new String[]{"1", "0"};
            objSave.setH614c("");
            for (int i = 0; i < rdogrpH614c.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH614c.getChildAt(i);
                if (rb.isChecked()) objSave.setH614c(d_rdogrpH614c[i]);
            }

            objSave.setH615a(txtH615a.getText().toString());
            objSave.setH615b(txtH615b.getText().toString());
            String[] d_rdogrpH616 = new String[]{"1", "0"};
            objSave.setH616("");
            for (int i = 0; i < rdogrpH616.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH616.getChildAt(i);
                if (rb.isChecked()) objSave.setH616(d_rdogrpH616[i]);
            }

            String[] d_rdogrpH617 = new String[]{"1", "0"};
            objSave.setH617("");
            for (int i = 0; i < rdogrpH617.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH617.getChildAt(i);
                if (rb.isChecked()) objSave.setH617(d_rdogrpH617[i]);
            }

            objSave.setH618((spnH618.getSelectedItemPosition() == 0 ? "" : Connection.SelectedSpinnerValue(spnH618.getSelectedItem().toString(), "-")));
            objSave.setH618X(txtH618X.getText().toString());
            String[] d_rdogrpH619 = new String[]{"1", "0"};
            objSave.setH619("");
            for (int i = 0; i < rdogrpH619.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH619.getChildAt(i);
                if (rb.isChecked()) objSave.setH619(d_rdogrpH619[i]);
            }

            String[] d_rdogrpH620 = new String[]{"1", "0"};
            objSave.setH620("");
            for (int i = 0; i < rdogrpH620.getChildCount(); i++) {
                rb = (RadioButton) rdogrpH620.getChildAt(i);
                if (rb.isChecked()) objSave.setH620(d_rdogrpH620[i]);
            }
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
                IDBundle.putString("Rnd", txtRnd.getText().toString());
                IDBundle.putString("SuchanaID", txtSuchanaID.getText().toString());
                IDBundle.putString("H41a", "");
                startActivity(new Intent(SES.this, AssetB.class).putExtras(IDBundle));
                // /  Connection.MessageBox(SES.this, "Saved Successfully");
            } else {
                Connection.MessageBox(SES.this, status);
                return;
            }
        } catch (Exception e) {
            Connection.MessageBox(SES.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            RadioButton rb;
            SES_DataModel d = new SES_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<SES_DataModel> data = d.SelectAll(this, SQL);
            for (SES_DataModel item : data) {
                txtRnd.setText(item.getRnd());
                txtSuchanaID.setText(item.getSuchanaID());
                //txtMSlNo.setText(item.getMSlNo());
                spnMSlNo.setSelection(Global.SpinnerItemPositionAnyLength(spnMSlNo, item.getMSlNo()));
                spnH311.setSelection(Global.SpinnerItemPositionAnyLength(spnH311, item.getH311()));
                txtH312.setText(item.getH312());
                txtH313.setText(item.getH313());
                spnH321.setSelection(Global.SpinnerItemPositionAnyLength(spnH321, item.getH321()));
                txtH321X.setText(item.getH321X());
                spnH322.setSelection(Global.SpinnerItemPositionAnyLength(spnH322, item.getH322()));
                txtH322X.setText(item.getH322X());
                spnH323.setSelection(Global.SpinnerItemPositionAnyLength(spnH323, item.getH323()));
                txtH323X.setText(item.getH323X());
                spnH324.setSelection(Global.SpinnerItemPositionAnyLength(spnH324, item.getH324()));
                txtH324X.setText(item.getH324X());
                spnH325.setSelection(Global.SpinnerItemPositionAnyLength(spnH325, item.getH325()));
                txtH325X.setText(item.getH325X());
                String[] d_rdogrpH331 = new String[]{"1", "0", "8"};
                for (int i = 0; i < d_rdogrpH331.length; i++) {
                    if (item.getH331().equals(String.valueOf(d_rdogrpH331[i]))) {
                        rb = (RadioButton) rdogrpH331.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH332A.setText(item.getH332A());
                txtH332B.setText(item.getH332B());
                String[] d_rdogrpH341 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH341.length; i++) {
                    if (item.getH341().equals(String.valueOf(d_rdogrpH341[i]))) {
                        rb = (RadioButton) rdogrpH341.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH342.setText(item.getH342());
                String[] d_rdogrpH61 = new String[]{"1", "0", "3"};
                for (int i = 0; i < d_rdogrpH61.length; i++) {
                    if (item.getH61().equals(String.valueOf(d_rdogrpH61[i]))) {
                        rb = (RadioButton) rdogrpH61.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH62 = new String[]{"1", "2", "3", "4", "5", "6", "7"};
                for (int i = 0; i < d_rdogrpH62.length; i++) {
                    if (item.getH62().equals(String.valueOf(d_rdogrpH62[i]))) {
                        rb = (RadioButton) rdogrpH62.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH63A.setSelection(Global.SpinnerItemPositionAnyLength(spnH63A, item.getH63A()));
                txtH63AX.setText(item.getH63AX());
                spnH63B.setSelection(Global.SpinnerItemPositionAnyLength(spnH63B, item.getH63B()));
                txtH63BX.setText(item.getH63BX());
                spnH63C.setSelection(Global.SpinnerItemPositionAnyLength(spnH63C, item.getH63C()));
                txtH63CX.setText(item.getH63CX());
                spnH63D.setSelection(Global.SpinnerItemPositionAnyLength(spnH63D, item.getH63D()));
                txtH63DX.setText(item.getH63DX());
                spnH63E.setSelection(Global.SpinnerItemPositionAnyLength(spnH63E, item.getH63E()));
                txtH63EX.setText(item.getH63EX());
                txtH63X.setText(item.getH63X());
                String[] d_rdogrpH64 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH64.length; i++) {
                    if (item.getH64().equals(String.valueOf(d_rdogrpH64[i]))) {
                        rb = (RadioButton) rdogrpH64.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH65 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH65.length; i++) {
                    if (item.getH65().equals(String.valueOf(d_rdogrpH65[i]))) {
                        rb = (RadioButton) rdogrpH65.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH66 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH66.length; i++) {
                    if (item.getH66().equals(String.valueOf(d_rdogrpH66[i]))) {
                        rb = (RadioButton) rdogrpH66.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH67 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH67.length; i++) {
                    if (item.getH67().equals(String.valueOf(d_rdogrpH67[i]))) {
                        rb = (RadioButton) rdogrpH67.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH68 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH68.length; i++) {
                    if (item.getH68().equals(String.valueOf(d_rdogrpH68[i]))) {
                        rb = (RadioButton) rdogrpH68.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH69 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH69.length; i++) {
                    if (item.getH69().equals(String.valueOf(d_rdogrpH69[i]))) {
                        rb = (RadioButton) rdogrpH69.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH610R.setSelection(Global.SpinnerItemPositionAnyLength(spnH610R, item.getH610R()));
                txtH610RX.setText(item.getH610RX());
                spnH610D.setSelection(Global.SpinnerItemPositionAnyLength(spnH610D, item.getH610D()));
                txtH610DX.setText(item.getH610DX());
                String[] d_rdogrpH610a = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH610a.length; i++) {
                    if (item.getH610a().equals(String.valueOf(d_rdogrpH610a[i]))) {
                        rb = (RadioButton) rdogrpH610a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH610b1().equals("1")) {
                    chkH610b1.setChecked(true);
                } else if (item.getH610b1().equals("2")) {
                    chkH610b1.setChecked(false);
                }
                if (item.getH610b2().equals("1")) {
                    chkH610b2.setChecked(true);
                } else if (item.getH610b2().equals("2")) {
                    chkH610b2.setChecked(false);
                }
                if (item.getH610b3().equals("1")) {
                    chkH610b3.setChecked(true);
                } else if (item.getH610b3().equals("2")) {
                    chkH610b3.setChecked(false);
                }
                if (item.getH610b4().equals("1")) {
                    chkH610b4.setChecked(true);
                } else if (item.getH610b4().equals("2")) {
                    chkH610b4.setChecked(false);
                }
                if (item.getH610b5().equals("1")) {
                    chkH610b5.setChecked(true);
                } else if (item.getH610b5().equals("2")) {
                    chkH610b5.setChecked(false);
                }
                txtH610b5X.setText(item.getH610b5X());
                if (item.getH610b6().equals("1")) {
                    chkH610b6.setChecked(true);
                } else if (item.getH610b6().equals("2")) {
                    chkH610b6.setChecked(false);
                }
                String[] d_rdogrpH610c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH610c.length; i++) {
                    if (item.getH610c().equals(String.valueOf(d_rdogrpH610c[i]))) {
                        rb = (RadioButton) rdogrpH610c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH611R.setSelection(Global.SpinnerItemPositionAnyLength(spnH611R, item.getH611R()));
                txtH611RX.setText(item.getH611RX());
                spnH611D.setSelection(Global.SpinnerItemPositionAnyLength(spnH611D, item.getH611D()));
                txtH611DX.setText(item.getH611DX());
                String[] d_rdogrpH611a = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH611a.length; i++) {
                    if (item.getH611a().equals(String.valueOf(d_rdogrpH611a[i]))) {
                        rb = (RadioButton) rdogrpH611a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH611b1().equals("1")) {
                    chkH611b1.setChecked(true);
                } else if (item.getH611b1().equals("2")) {
                    chkH611b1.setChecked(false);
                }
                if (item.getH611b2().equals("1")) {
                    chkH611b2.setChecked(true);
                } else if (item.getH611b2().equals("2")) {
                    chkH611b2.setChecked(false);
                }
                if (item.getH611b3().equals("1")) {
                    chkH611b3.setChecked(true);
                } else if (item.getH611b3().equals("2")) {
                    chkH611b3.setChecked(false);
                }
                if (item.getH611b4().equals("1")) {
                    chkH611b4.setChecked(true);
                } else if (item.getH611b4().equals("2")) {
                    chkH611b4.setChecked(false);
                }
                if (item.getH611b5().equals("1")) {
                    chkH611b5.setChecked(true);
                } else if (item.getH611b5().equals("2")) {
                    chkH611b5.setChecked(false);
                }
                txtH611b5X.setText(item.getH611b5X());
                if (item.getH611b6().equals("1")) {
                    chkH611b6.setChecked(true);
                } else if (item.getH611b6().equals("2")) {
                    chkH611b6.setChecked(false);
                }
                String[] d_rdogrpH611c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH611c.length; i++) {
                    if (item.getH611c().equals(String.valueOf(d_rdogrpH611c[i]))) {
                        rb = (RadioButton) rdogrpH611c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH612R.setSelection(Global.SpinnerItemPositionAnyLength(spnH612R, item.getH612R()));
                txtH612RX.setText(item.getH612RX());
                spnH612D.setSelection(Global.SpinnerItemPositionAnyLength(spnH612D, item.getH612D()));
                txtH612DX.setText(item.getH612DX());
                String[] d_rdogrpH612a = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH612a.length; i++) {
                    if (item.getH612a().equals(String.valueOf(d_rdogrpH612a[i]))) {
                        rb = (RadioButton) rdogrpH612a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH612b1().equals("1")) {
                    chkH612b1.setChecked(true);
                } else if (item.getH612b1().equals("2")) {
                    chkH612b1.setChecked(false);
                }
                if (item.getH612b2().equals("1")) {
                    chkH612b2.setChecked(true);
                } else if (item.getH612b2().equals("2")) {
                    chkH612b2.setChecked(false);
                }
                if (item.getH612b3().equals("1")) {
                    chkH612b3.setChecked(true);
                } else if (item.getH612b3().equals("2")) {
                    chkH612b3.setChecked(false);
                }
                if (item.getH612b4().equals("1")) {
                    chkH612b4.setChecked(true);
                } else if (item.getH612b4().equals("2")) {
                    chkH612b4.setChecked(false);
                }
                if (item.getH612b5().equals("1")) {
                    chkH612b5.setChecked(true);
                } else if (item.getH612b5().equals("2")) {
                    chkH612b5.setChecked(false);
                }
                txtH612b5X.setText(item.getH612b5X());
                if (item.getH612b6().equals("1")) {
                    chkH612b6.setChecked(true);
                } else if (item.getH612b6().equals("2")) {
                    chkH612b6.setChecked(false);
                }
                String[] d_rdogrpH612c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH612c.length; i++) {
                    if (item.getH612c().equals(String.valueOf(d_rdogrpH612c[i]))) {
                        rb = (RadioButton) rdogrpH612c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH613R.setSelection(Global.SpinnerItemPositionAnyLength(spnH613R, item.getH613R()));
                txtH613RX.setText(item.getH613RX());
                spnH613D.setSelection(Global.SpinnerItemPositionAnyLength(spnH613D, item.getH613D()));
                txtH613DX.setText(item.getH613DX());
                String[] d_rdogrpH613a = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH613a.length; i++) {
                    if (item.getH613a().equals(String.valueOf(d_rdogrpH613a[i]))) {
                        rb = (RadioButton) rdogrpH613a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH613b1().equals("1")) {
                    chkH613b1.setChecked(true);
                } else if (item.getH613b1().equals("2")) {
                    chkH613b1.setChecked(false);
                }
                if (item.getH613b2().equals("1")) {
                    chkH613b2.setChecked(true);
                } else if (item.getH613b2().equals("2")) {
                    chkH613b2.setChecked(false);
                }
                if (item.getH613b3().equals("1")) {
                    chkH613b3.setChecked(true);
                } else if (item.getH613b3().equals("2")) {
                    chkH613b3.setChecked(false);
                }
                if (item.getH613b4().equals("1")) {
                    chkH613b4.setChecked(true);
                } else if (item.getH613b4().equals("2")) {
                    chkH613b4.setChecked(false);
                }
                if (item.getH613b5().equals("1")) {
                    chkH613b5.setChecked(true);
                } else if (item.getH613b5().equals("2")) {
                    chkH613b5.setChecked(false);
                }
                txtH613b5X.setText(item.getH613b5X());
                if (item.getH613b6().equals("1")) {
                    chkH613b6.setChecked(true);
                } else if (item.getH613b6().equals("2")) {
                    chkH613b6.setChecked(false);
                }
                String[] d_rdogrpH613c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH613c.length; i++) {
                    if (item.getH613c().equals(String.valueOf(d_rdogrpH613c[i]))) {
                        rb = (RadioButton) rdogrpH613c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH614R.setSelection(Global.SpinnerItemPositionAnyLength(spnH614R, item.getH614R()));
                txtH614RX.setText(item.getH614RX());
                spnH614D.setSelection(Global.SpinnerItemPositionAnyLength(spnH614D, item.getH614D()));
                txtH614DX.setText(item.getH614DX());
                String[] d_rdogrpH614a = new String[]{"1", "2", "3"};
                for (int i = 0; i < d_rdogrpH614a.length; i++) {
                    if (item.getH614a().equals(String.valueOf(d_rdogrpH614a[i]))) {
                        rb = (RadioButton) rdogrpH614a.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                if (item.getH614b1().equals("1")) {
                    chkH614b1.setChecked(true);
                } else if (item.getH614b1().equals("2")) {
                    chkH614b1.setChecked(false);
                }
                if (item.getH614b2().equals("1")) {
                    chkH614b2.setChecked(true);
                } else if (item.getH614b2().equals("2")) {
                    chkH614b2.setChecked(false);
                }
                if (item.getH614b3().equals("1")) {
                    chkH614b3.setChecked(true);
                } else if (item.getH614b3().equals("2")) {
                    chkH614b3.setChecked(false);
                }
                if (item.getH614b4().equals("1")) {
                    chkH614b4.setChecked(true);
                } else if (item.getH614b4().equals("2")) {
                    chkH614b4.setChecked(false);
                }
                if (item.getH614b5().equals("1")) {
                    chkH614b5.setChecked(true);
                } else if (item.getH614b5().equals("2")) {
                    chkH614b5.setChecked(false);
                }
                txtH614b5X.setText(item.getH614b5X());
                if (item.getH614b6().equals("1")) {
                    chkH614b6.setChecked(true);
                } else if (item.getH614b6().equals("2")) {
                    chkH614b6.setChecked(false);
                }
                String[] d_rdogrpH614c = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH614c.length; i++) {
                    if (item.getH614c().equals(String.valueOf(d_rdogrpH614c[i]))) {
                        rb = (RadioButton) rdogrpH614c.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                txtH615a.setText(item.getH615a());
                txtH615b.setText(item.getH615b());
                String[] d_rdogrpH616 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH616.length; i++) {
                    if (item.getH616().equals(String.valueOf(d_rdogrpH616[i]))) {
                        rb = (RadioButton) rdogrpH616.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH617 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH617.length; i++) {
                    if (item.getH617().equals(String.valueOf(d_rdogrpH617[i]))) {
                        rb = (RadioButton) rdogrpH617.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                spnH618.setSelection(Global.SpinnerItemPositionAnyLength(spnH618, item.getH618()));
                txtH618X.setText(item.getH618X());
                String[] d_rdogrpH619 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH619.length; i++) {
                    if (item.getH619().equals(String.valueOf(d_rdogrpH619[i]))) {
                        rb = (RadioButton) rdogrpH619.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
                String[] d_rdogrpH620 = new String[]{"1", "0"};
                for (int i = 0; i < d_rdogrpH620.length; i++) {
                    if (item.getH620().equals(String.valueOf(d_rdogrpH620[i]))) {
                        rb = (RadioButton) rdogrpH620.getChildAt(i);
                        rb.setChecked(true);
                    }
                }
            }
        } catch (Exception e) {
            Connection.MessageBox(SES.this, e.getMessage());
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