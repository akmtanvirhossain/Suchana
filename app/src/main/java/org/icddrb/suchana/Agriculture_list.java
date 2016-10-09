package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Agriculture_list" android:label="Agriculture: List" />

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.location.Location;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Common.Connection;
import Common.Global;

public class Agriculture_list extends Activity {
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
    Button btnAdd;
    Button btnRefresh;
    String StartTime;
    Bundle IDBundle;
    ImageButton cmdForward;
    TextView lblNext;
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
            setContentView(R.layout.agriculture_list);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();

            TableName = "Agriculture";
           /* lblHeading = (TextView) findViewById(R.id.lblHeading);
            lblHeading.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    final int DRAWABLE_RIGHT = 2;
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (event.getRawX() >= (lblHeading.getRight() - lblHeading.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                            AlertDialog.Builder adb = new AlertDialog.Builder(Agriculture_list.this);
                            adb.setTitle("Close");
                            adb.setMessage("Do you want to close this form[Yes/No]?");
                            adb.setNegativeButton("No", null);
                            adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                }
                            });
                            adb.show();
                            return true;
                        }
                    }
                    return false;
                }
            });*/


            IDBundle = getIntent().getExtras();
            RND = IDBundle.getString("Rnd");
            SUCHANAID = IDBundle.getString("SuchanaID");

            TextView lblSuchanaId = (TextView) findViewById(R.id.lblSuchanaIdHeader);
            lblSuchanaId.setText(SUCHANAID);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Agriculture_list.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Destruction2.class);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(Agriculture_list.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to start NGOWORK [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), NGOWork.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDbundle);
                            getApplicationContext().startActivity(intent);

                        }
                    });
                    adb.show();
                }
            });
            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Agriculture_list.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to start NGOWORK [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), NGOWork.class);
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
            btnRefresh = (Button) findViewById(R.id.btnRefresh);
            btnRefresh.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    //write your code here
                    DataSearch(RND, SUCHANAID);

                }
            });



            btnAdd = (Button) findViewById(R.id.btnAdd);
            btnAdd.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    int lineNo = 0;
                    Cursor cursor = C.GetData("Agriculture", "SUCHANAID",SUCHANAID);
                    if (cursor.getCount() != 0) {
                        lineNo = cursor.getCount() + 1;
                    } else {
                        lineNo = 1;
                    }
                    Bundle IDbundle1 = new Bundle();
                    IDbundle1.putString("Rnd",RND);
                    IDbundle1.putString("SuchanaID", SUCHANAID);
                    IDbundle1.putString("Sl", String.valueOf(lineNo));
                    Intent intent = new Intent(getApplicationContext(), Agriculture.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtras(IDbundle1);
                    getApplicationContext().startActivity(intent);

                }
            });
            lblNext= (TextView) findViewById(R.id.lblNext);
            lblNext.setEnabled(false);
            cmdForward.setEnabled(false);
            DataSearch(RND, SUCHANAID);


        } catch (Exception e) {
            Connection.MessageBox(Agriculture_list.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            Agriculture_DataModel d = new Agriculture_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<Agriculture_DataModel> data = d.SelectAll(this, SQL);
            dataList.clear();

            dataAdapter = null;

            ListView list = (ListView) findViewById(R.id.lstData);
            HashMap<String, String> map;

            for (Agriculture_DataModel item : data) {
                cmdForward.setEnabled(true);
                lblNext.setEnabled(true);
                map = new HashMap<String, String>();
                map.put("Rnd", item.getRnd());
                map.put("SuchanaID", item.getSuchanaID());
                map.put("MSlNo", item.getMSlNo());
                map.put("H151", item.getH151());
                map.put("Sl", item.getSl());
                map.put("H152a", item.getH152a());
                map.put("H152bOth", item.getH152bOth());
                map.put("H152b", item.getH152b());
                map.put("H152c", item.getH152c());
                map.put("H152d1", item.getH152d1());
                map.put("H152d2", item.getH152d2());
                map.put("H152e1", item.getH152e1());
                map.put("H152e2", item.getH152e2());
                map.put("H152f", item.getH152f());
                map.put("H152g", item.getH152g());
                map.put("H152h1", item.getH152h1());
                map.put("H152h2", item.getH152h2());
                map.put("H152i1", item.getH152i1());
                map.put("H152i2", item.getH152i2());
                map.put("H152j1", item.getH152j1());
                map.put("H152j2", item.getH152j2());
                map.put("H152k1", item.getH152k1());
                map.put("H152k2", item.getH152k2());
                dataList.add(map);
            }
            dataAdapter = new SimpleAdapter(Agriculture_list.this, dataList, R.layout.agriculture_list, new String[]{"rowsec"},
                    new int[]{R.id.secListRow});
            list.setAdapter(new DataListAdapter(this, dataAdapter));
        } catch (Exception e) {
            Connection.MessageBox(Agriculture_list.this, e.getMessage());
            return;
        }
    }


    public class DataListAdapter extends BaseAdapter {
        private Context context;
        private SimpleAdapter dataAdap;

        public DataListAdapter(Context c, SimpleAdapter da) {
            context = c;
            dataAdap = da;
        }

        public int getCount() {
            return dataAdap.getCount();
        }

        public Object getItem(int position) {
            return position;
        }

        public long getItemId(int position) {
            return position;
        }

        public View getView(final int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            if (convertView == null) {
                convertView = inflater.inflate(R.layout.agriculture_row, null);
            }
            LinearLayout secListRow = (LinearLayout) convertView.findViewById(R.id.secListRow);

            final TextView Sl = (TextView) convertView.findViewById(R.id.Sl);
            final TextView H152a = (TextView) convertView.findViewById(R.id.H152a);
            final TextView H152b = (TextView) convertView.findViewById(R.id.H152b);
            final TextView H152c = (TextView) convertView.findViewById(R.id.H152c);

            final HashMap<String, String> o = (HashMap<String, String>) dataAdap.getItem(position);
            Sl.setText(o.get("Sl"));

            List<String> listH152a = new ArrayList<String>();

            listH152a.add("");
            listH152a.add("101-ধান");
            listH152a.add("102-গম");
            listH152a.add("103-অন্যান্য খাদ্য শস্য  (যেমন: ভুট্টা,  বার্লি, যব ইত্যাদি)");
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
            listH152a.add("617-ফুলকপি ");
            listH152a.add("618-ওলকপি ");
            listH152a.add("619-মুলা");
            listH152a.add("620-বরবটি ");
            listH152a.add("621-কচু মুখী ");
            listH152a.add("622-কাচা কলা ");
            listH152a.add("623-পান ");
            listH152a.add("624-অন্যান্য সবজি ");
            listH152a.add("625-কলমি শাক  ");
            listH152a.add("626-কমলা রঙ্গের মিষ্টি আলু  ");
            listH152a.add("627-লতিরাজ কচু  ");
            listH152a.add("628-লাল শাক ");
            listH152a.add("701-হলুদ ফল");
            listH152a.add("702-সবুজ ফল");
            listH152a.add("801-রুই");
            listH152a.add("802-কাতলা");
            listH152a.add("803-মৃগেল");
            listH152a.add("804-তেলাপিয়");
            listH152a.add("805-পাঙ্গাস");
            listH152a.add("806-সরপুঁটি");
            listH152a.add("807-পুটি");
            listH152a.add("808-মলা ");
            listH152a.add("809-সিলভার কার্প ");
            listH152a.add("810-অনান্য ছোট মাছ ");
            listH152a.add("811-অনান্য বড় মাছ ");
            listH152a.add("901-শুধু হাস-মুরগি ");
            listH152a.add("902-হাস-মুরগি ও ডিম");

            for (int i = 0; i < listH152a.size(); i++) {
                if (listH152a.get(i).contains(o.get("H152a"))) {
                    H152a.setText(listH152a.get(i));
                    break;
                }

            }


            List<String> listH152b = new ArrayList<String>();

            listH152b.add("");
            listH152b.add("01-ভিটেমাটি");
            listH152b.add("02-চাষযোগ্য/আবাদী জমি");
            listH152b.add("03-গবাদি পশুর চারণের উপযোগী ভূমি");
            listH152b.add("04-ঝোপ/জংলা জমি");
            listH152b.add("05-চাষযোগ্য পুকুর");
            listH152b.add("06-অন্যের জমি/ পুকুর");
            listH152b.add("07-বর্জ্য/অনাবাদি জমি");
            listH152b.add("08-নদীগর্ভের/হাওরের জমি");
            listH152b.add("09-অন্যান্য আবাসিক/বাণিজ্যিক প্লট ");
            listH152b.add("10-পুকুরের পাড়");

            for (int i = 0; i < listH152b.size(); i++) {
                if (listH152b.get(i).contains(o.get("H152b"))) {
                    H152b.setText(listH152b.get(i));
                    break;
                }

            }



            H152c.setText(o.get("H152c"));


            secListRow.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    //Write your code here
                    finish();
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", o.get("Rnd"));
                    IDbundle.putString("SuchanaID", o.get("SuchanaID"));
                    IDbundle.putString("Sl", o.get("Sl"));
                    Intent f1;
                    f1 = new Intent(getApplicationContext(), Agriculture.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);
                }
            });


            return convertView;
        }
    }


}