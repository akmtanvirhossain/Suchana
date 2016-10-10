package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".AssetB_list" android:label="AssetB: List" />

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
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

public class AssetB_list extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    static String SLNO = "";
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
    ImageButton cmdForward;
    String StartTime;
    Bundle IDbundle;
    TextView lblSuchanaIdHeader;
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
            setContentView(R.layout.assetb_list);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");
            SLNO = IDbundle.getString("SlNo");
            TableName = "AssetB";
            lblHeading = (TextView) findViewById(R.id.lblHeading);

            C.Save("Delete from AssetB where SlNo is null or SlNo=''");

            lblSuchanaIdHeader = (TextView) findViewById(R.id.lblSuchanaIdHeader);
            lblSuchanaIdHeader.setText(SUCHANAID);

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
                    AlertDialog.Builder adb = new AlertDialog.Builder(AssetB_list.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            finish();
                            Intent f1;
                            f1 = new Intent(getApplicationContext(), SES.class);
                            f1.putExtras(IDbundle);
                            startActivity(f1);
                        }
                    });
                    adb.show();
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
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", RND);
                    IDbundle.putString("SuchanaID", SUCHANAID);
                    IDbundle.putString("SlNo", "");
                    Intent intent = new Intent(getApplicationContext(), AssetB.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtras(IDbundle);
                    getApplicationContext().startActivity(intent);

                }
            });

            cmdForward = (ImageButton) findViewById(R.id.cmdForward);
            cmdForward.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(AssetB_list.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to start AssetB [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDBundle = new Bundle();
                            IDBundle.putString("Rnd", RND);
                            IDBundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), AssetNB.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDBundle);
                            getApplicationContext().startActivity(intent);
                            finish();
                        }
                    });
                    adb.show();
                }
            });
            cmdForward.setVisibility(View.INVISIBLE);


            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(AssetB_list.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to start AssetB [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            EntryStatus_DataModel e = new EntryStatus_DataModel(TableName, RND, SUCHANAID);
                            e.SaveUpdateData(AssetB_list.this);

                            Bundle IDBundle = new Bundle();
                            IDBundle.putString("Rnd", RND);
                            IDBundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), AssetNB.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDBundle);
                            getApplicationContext().startActivity(intent);
                            finish();
                        }
                    });
                    adb.show();
                }
            });
            DataSearch(RND, SUCHANAID);


        } catch (Exception e) {
            Connection.MessageBox(AssetB_list.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            AssetB_DataModel d = new AssetB_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<AssetB_DataModel> data = d.SelectAll(this, SQL);
            dataList.clear();

            dataAdapter = null;

            ListView list = (ListView) findViewById(R.id.lstData);
            HashMap<String, String> map;

            for (AssetB_DataModel item : data) {
                map = new HashMap<String, String>();
                map.put("Rnd", item.getRnd());
                map.put("SuchanaID", item.getSuchanaID());
                map.put("MSlNo", item.getMSlNo());
                map.put("SlNo", item.getSlNo());
                map.put("H41a", item.getH41a());
                map.put("H41aX", item.getH41aX());
                map.put("H41b", item.getH41b());
                map.put("H41c", item.getH41c());
                map.put("H41d", item.getH41d());
                map.put("H41e", item.getH41e());
                map.put("H41eX", item.getH41eX());
                map.put("H41f", item.getH41f());
                map.put("H41fX", item.getH41fX());
                map.put("H41g", item.getH41g());
                map.put("H41h", item.getH41h());
                map.put("H41i", item.getH41i());
                map.put("H41j", item.getH41j());
                map.put("H41k", item.getH41k());
                map.put("H41kX", item.getH41kX());
                map.put("H41l", item.getH41l());
                map.put("H41m", item.getH41m());
                map.put("H41n", item.getH41n());
                map.put("H41o1", item.getH41o1());
                map.put("H41o2", item.getH41o2());
                map.put("H41o3", item.getH41o3());
                map.put("H41o4", item.getH41o4());
                map.put("H41o4X", item.getH41o4X());
                dataList.add(map);
            }
            dataAdapter = new SimpleAdapter(AssetB_list.this, dataList, R.layout.assetb_list, new String[]{"rowsec"},
                    new int[]{R.id.secListRow});
            list.setAdapter(new DataListAdapter(this, dataAdapter));


            AssetB_DataModel dx = new AssetB_DataModel();
            String SQLx = "Select Distinct(H41a) from " + TableName + "  Where cast(H41a as int) < 21 and Rnd='" + RND + "' and SuchanaID='" + SUCHANAID + "'";
            List<AssetB_DataModel> datax = dx.SelectH41a(this, SQLx);
            if (datax.size() > 19) {
                cmdForward.setVisibility(View.VISIBLE);
            }

        } catch (Exception e) {
            Connection.MessageBox(AssetB_list.this, e.getMessage());
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
                convertView = inflater.inflate(R.layout.assetb_row, null);
            }
            LinearLayout secListRow = (LinearLayout) convertView.findViewById(R.id.secListRow);

            final TextView Rnd = (TextView) convertView.findViewById(R.id.Rnd);
            final TextView SuchanaID = (TextView) convertView.findViewById(R.id.SuchanaID);
            final TextView SlNo = (TextView) convertView.findViewById(R.id.SlNo);
            final TextView H41a = (TextView) convertView.findViewById(R.id.H41a);

            final HashMap<String, String> o = (HashMap<String, String>) dataAdap.getItem(position);
            Rnd.setText(o.get("Rnd"));
            SuchanaID.setText(o.get("SuchanaID"));
            SlNo.setText(o.get("SlNo"));
            H41a.setText(o.get("H41a"));


            switch (Integer.valueOf(o.get("H41a"))) {
                /*case 1:
                    H41a.setText("1-ভিটেমাটি");
                    break;
                case 2:
                    H41a.setText("2-চাষযোগ্য বা আবাদী জমি");
                    break;
                case 3:
                    H41a.setText("3-গবাদি পশুর চারণের উপযোগী");
                    break;
                case 4:
                    H41a.setText("4-ভূমিঝোপ/জংলা জমি");
                    break;
                case 5:
                    H41a.setText("5-চাষযোগ্য পুকুর");
                    break;
                case 6:
                    H41a.setText("6-পরিত্যক্ত পুকুর");
                    break;
                case 7:
                    H41a.setText("7-বর্জ্য বা অনাবাদি জমি");
                    break;
                case 8:
                    H41a.setText("8-নদীগর্ভের বা হাওরের জমি");
                    break;
                case 9:
                    H41a.setText("9-অন্যান্য আবাসিক বা বাণিজ্যিক প্লট");
                    break;
                case 10:
                    H41a.setText("1-ভিটেমাটি");
                    break;
                case 12:
                    H41a.setText("2-চাষযোগ্য বা আবাদী জমি");
                    break;
                case 13:
                    H41a.setText("3-গবাদি পশুর চারণের উপযোগী");
                    break;
                case 14:
                    H41a.setText("4-ভূমিঝোপ/জংলা জমি");
                    break;
                case 15:
                    H41a.setText("5-চাষযোগ্য পুকুর");
                    break;
                case 16:
                    H41a.setText("6-পরিত্যক্ত পুকুর");
                    break;
                case 17:
                    H41a.setText("7-বর্জ্য বা অনাবাদি জমি");
                    break;
                case 18:
                    H41a.setText("8-নদীগর্ভের বা হাওরের জমি");
                    break;
                case 19:
                    H41a.setText("9-অন্যান্য আবাসিক বা বাণিজ্যিক প্লট");
                    break;
                case 20:
                    H41a.setText("6-পরিত্যক্ত পুকুর");
                    break;
                case 21:
                    H41a.setText("7-বর্জ্য বা অনাবাদি জমি");
                    break;
                case 22:
                    H41a.setText("8-নদীগর্ভের বা হাওরের জমি");
                    break;

                default:
                    H41a.setText("");
                    break;
                */

                case 1:
                    H41a.setText("01-গরু");
                    break;
                case 2:
                    H41a.setText("02-হাঁস ও মুরগী");
                    break;
                case 3:
                    H41a.setText("03-পাখি  যেমন কবুতর");
                    break;
                case 4:
                    H41a.setText("04-ছাগল / ভেড়া");
                    break;
                case 5:
                    H41a.setText("05-শূকর");
                    break;
                case 6:
                    H41a.setText("06-মাছ");
                    break;
                case 7:
                    H41a.setText("07-অন্যান্য পশুপাখি (উল্লেখ করুন)");
                    break;
                case 8:
                    H41a.setText("08-লাঙ্গল");
                    break;
                case 9:
                    H41a.setText("09-মাড়াইয়ের যন্ত্র");
                    break;
                case 10:
                    H41a.setText("10-গোয়াল ঘর");
                    break;
                case 11:
                    H41a.setText("11-দোকানের জন্য প্রাঙ্গন/জমি");
                    break;
                case 12:
                    H41a.setText("12-শষ্য সংরক্ষনের চলা/গুদাম ঘর");
                    break;
                case 13:
                    H41a.setText("13-নৌকা");
                    break;
                case 14:
                    H41a.setText("14-মোটর চালিত নৌকা");
                    break;
                case 15:
                    H41a.setText("15-মাছ ধরার জাল");
                    break;
                case 16:
                    H41a.setText("16-রিক্সা/ভ্যান");
                    break;
                case 17:
                    H41a.setText("17-গাছ (১০০ টাকার অধিক)");
                    break;
                case 18:
                    H41a.setText("18-ঠেলা গাড়ী");
                    break;
                case 19:
                    H41a.setText("19-সেলাই মেশিন");
                    break;
                case 20:
                    H41a.setText("20-CNG/নসিমন");
                    break;
                case 21:
                    H41a.setText("21-অন্যান্য");
                    break;
                case 22:
                    H41a.setText("22-অন্যান্য");
                    break;
                default:
                    H41a.setText("");
                    break;
            }

            secListRow.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    //Write your code here
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", o.get("Rnd"));
                    IDbundle.putString("SuchanaID", o.get("SuchanaID"));
                    IDbundle.putString("SlNo", o.get("SlNo"));
                    Intent f1;
                    f1 = new Intent(getApplicationContext(), AssetB.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);
                }
            });


            return convertView;
        }
    }


}