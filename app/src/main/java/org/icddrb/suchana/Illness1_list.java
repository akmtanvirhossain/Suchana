package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Illness1_list" android:label="Illness1: List" />

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

public class Illness1_list extends Activity {
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
    Button btnAdd;
    Button btnRefresh;
    String StartTime;
    Bundle IDbundle;
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
            setContentView(R.layout.illness1_list);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();

            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TextView lblSuchanaId = (TextView) findViewById(R.id.lblSuchanaIdHeader);
            lblSuchanaId.setText(SUCHANAID);

            TableName = "Illness1";
           /* lblHeading = (TextView) findViewById(R.id.lblHeading);
            lblHeading.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    final int DRAWABLE_RIGHT = 2;
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (event.getRawX() >= (lblHeading.getRight() - lblHeading.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                            AlertDialog.Builder adb = new AlertDialog.Builder(Illness1_list.this);
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

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Illness1_list.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
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
            cmdForward = (ImageButton) findViewById(R.id.cmdForward);
            cmdForward.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Illness1_list.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to start ILLNESS2 [Yes/No]?");
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
            Button cmdSave = (Button) findViewById(R.id.cmdSave);
            cmdSave.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Illness1_list.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to start ILLNESS2 [Yes/No]?");
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
                    Cursor cursor = C.GetData("Illness1", "SuchanaID", SUCHANAID);
                    if (cursor.getCount() != 0) {
                        lineNo = cursor.getCount() + 1;
                    } else {
                        lineNo = 1;
                    }

                    Bundle IDbundle1 = new Bundle();
                    IDbundle1.putString("Rnd", RND);
                    IDbundle1.putString("SuchanaID", SUCHANAID);
                    IDbundle1.putString("SlNo",String.valueOf(lineNo));
                    Intent intent = new Intent(getApplicationContext(), Illness1.class);
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
            Connection.MessageBox(Illness1_list.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            Illness1_DataModel d = new Illness1_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<Illness1_DataModel> data = d.SelectAll(this, SQL);
            dataList.clear();

            dataAdapter = null;

            ListView list = (ListView) findViewById(R.id.lstData);
            HashMap<String, String> map;

            for (Illness1_DataModel item : data) {
                cmdForward.setEnabled(true);
                lblNext.setEnabled(true);
                map = new HashMap<String, String>();
                map.put("Rnd", item.getRnd());
                map.put("SuchanaID", item.getSuchanaID());
                map.put("H171", item.getH171());
                map.put("SlNo", item.getSlNo());
                map.put("H171a", item.getH171a());
                map.put("H171aX", item.getH171aX());
                map.put("H171b", item.getH171b());
                map.put("H171bX", item.getH171bX());
                map.put("H171c", item.getH171c());
                map.put("H171d", item.getH171d());
                map.put("H171VCost", item.getH171VCost());
                map.put("H171TCost", item.getH171TCost());
                map.put("H171TrCost", item.getH171TrCost());
                map.put("H171f", item.getH171f());
                map.put("H171g", item.getH171g());
                dataList.add(map);
            }
            dataAdapter = new SimpleAdapter(Illness1_list.this, dataList, R.layout.illness1_list, new String[]{"rowsec"},
                    new int[]{R.id.secListRow});
            list.setAdapter(new DataListAdapter(this, dataAdapter));
        } catch (Exception e) {
            Connection.MessageBox(Illness1_list.this, e.getMessage());
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
                convertView = inflater.inflate(R.layout.illness1_row, null);
            }
            LinearLayout secListRow = (LinearLayout) convertView.findViewById(R.id.secListRow);

            final TextView SlNo = (TextView) convertView.findViewById(R.id.SlNo);
            final TextView H171a = (TextView) convertView.findViewById(R.id.H171a);
            final TextView H171b = (TextView) convertView.findViewById(R.id.H171b);
            final TextView H171c = (TextView) convertView.findViewById(R.id.H171c);
            final TextView H171d = (TextView) convertView.findViewById(R.id.H171d);

            final HashMap<String, String> o = (HashMap<String, String>) dataAdap.getItem(position);
            SlNo.setText(o.get("SlNo"));


            List<String> listH171a = new ArrayList<String>();

            listH171a.add("");
            listH171a.add("1-জ্বর");
            listH171a.add("2-ব্যথা ");
            listH171a.add("3-দুর্বলতা");
            listH171a.add("4-ঠান্ডা/কাশি");
            listH171a.add("5-ত্বকেগুটি");
            listH171a.add("6-পাতলা পায়খানা");
            listH171a.add("7-ঝিমুনি");
            listH171a.add("8-বমিহওয়া বমিভাব");
            listH171a.add("9-ক্ষুদামন্দা");
            listH171a.add("10-অনিদ্রা");
            listH171a.add("11-রাতকানা ছানি");
            listH171a.add("12-কর্ণশূল শুনতে অসুবিধা");
            listH171a.add("13-গর্ভাবস্থা জনিত সমস্যা");
            listH171a.add("14-প্রজননঅঙ্গ জনিত সমস্যা /লিউকোরিয়া");
            listH171a.add("15-রক্তাল্পতা");
            listH171a.add("16-ডায়বেটিস");
            listH171a.add("17-উচ্চরক্তচাপ");
            listH171a.add("18-গলগন্ড");
            listH171a.add("19-বেরিবেরি");
            listH171a.add("20-স্কার্ভি");
            listH171a.add("21-রিকেটস");
            listH171a.add("22-অন্যান্য");

            for (int i = 0; i < listH171a.size(); i++) {
                if (listH171a.get(i).contains(o.get("H171a"))) {
                    H171a.setText(listH171a.get(i));
                    break;
                }

            }


            List<String> listH171b = new ArrayList<String>();

            listH171b.add("");
            listH171b.add("1-কোনো চিকিৎসা নেয়া হয়নি");
            listH171b.add("2-বাড়তেই সাধারণ চিকিৎসা");
            listH171b.add("3-গ্রাম ডাক্তার");
            listH171b.add("4-প্যারামেডিক PC/CHCP/FWV/CHW/SS/HA/MA");
            listH171b.add("5-এলোপ্যাথিক ঔষুধ বিক্রেতা (রোগ বুঝে চিকিৎসা দেয়)");
            listH171b.add("6-যোগ্যতাসম্পন্ন সরকারী/বেসরকারী MBBS ডাক্তার");
            listH171b.add("7-প্যানেল ডাক্তার (BRAC)");
            listH171b.add("8-কবিরাজ হেকিম  বিশ্বাস বৈদ্য");
            listH171b.add("9-হোমিওপ্যাথি");
            listH171b.add("10-অন্যান্য");

            for (int i = 0; i < listH171b.size(); i++) {
                if (listH171b.get(i).contains(o.get("H171b"))) {
                    H171b.setText(listH171b.get(i));
                    break;
                }

            }

            H171c.setText(o.get("H171c"));
            H171d.setText(o.get("H171d"));

            secListRow.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    //Write your code here
                    finish();
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", o.get("Rnd"));
                    IDbundle.putString("SuchanaID", o.get("SuchanaID"));
                    IDbundle.putString("SlNo", o.get("SlNo"));
                    Intent f1;
                    f1 = new Intent(getApplicationContext(), Illness1.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);
                }
            });


            return convertView;
        }
    }


}