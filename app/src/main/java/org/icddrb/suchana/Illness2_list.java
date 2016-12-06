package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Illness2_list" android:label="Illness2: List" />

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

public class Illness2_list extends Activity {
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
            setContentView(R.layout.illness2_list);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();

            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

            TableName = "Illness2";
            /*lblHeading = (TextView) findViewById(R.id.lblHeading);
            lblHeading.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    final int DRAWABLE_RIGHT = 2;
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (event.getRawX() >= (lblHeading.getRight() - lblHeading.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                            AlertDialog.Builder adb = new AlertDialog.Builder(Illness2_list.this);
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

            TextView lblSuchanaId = (TextView) findViewById(R.id.lblSuchanaIdHeader);
            lblSuchanaId.setText(SUCHANAID);

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Illness2_list.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Illness1_list.class);

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
                    AlertDialog.Builder adb = new AlertDialog.Builder(Illness2_list.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to return to Home [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Careseek.class);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(Illness2_list.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to start Careseek [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Careseek.class);
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
                    Cursor cursor = C.GetData("Illness2", "SuchanaID", SUCHANAID);
                    if (cursor.getCount() != 0) {
                        lineNo = cursor.getCount() + 1;
                    } else {
                        lineNo = 1;
                    }
                    Bundle IDbundle1 = new Bundle();
                    IDbundle1.putString("Rnd", RND);
                    IDbundle1.putString("SuchanaID", SUCHANAID);
                    IDbundle1.putString("SlNo",String.valueOf(lineNo));
                    Intent intent = new Intent(getApplicationContext(), Illness2.class);
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
            Connection.MessageBox(Illness2_list.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            Illness2_DataModel d = new Illness2_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'  order by cast(SlNo as int) asc";
            List<Illness2_DataModel> data = d.SelectAll(this, SQL);
            dataList.clear();

            dataAdapter = null;

            ListView list = (ListView) findViewById(R.id.lstData);
            HashMap<String, String> map;

            for (Illness2_DataModel item : data) {
                map = new HashMap<String, String>();

                cmdForward.setEnabled(true);
                lblNext.setEnabled(true);

                map.put("Rnd", item.getRnd());
                map.put("SuchanaID", item.getSuchanaID());
                map.put("H172", item.getH172());
                map.put("SlNo", item.getSlNo());
                map.put("H172a", item.getH172a());
                map.put("H172aX", item.getH172aX());
                map.put("H172b", item.getH172b());
                map.put("H172cX", item.getH172cX());
                map.put("H172cY", item.getH172cY());
                map.put("H172cM", item.getH172cM());
                map.put("H172d", item.getH172d());
                dataList.add(map);
            }
            dataAdapter = new SimpleAdapter(Illness2_list.this, dataList, R.layout.illness2_list, new String[]{"rowsec"},
                    new int[]{R.id.secListRow});
            list.setAdapter(new DataListAdapter(this, dataAdapter));
        } catch (Exception e) {
            Connection.MessageBox(Illness2_list.this, e.getMessage());
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
                convertView = inflater.inflate(R.layout.illness2_row, null);
            }
            LinearLayout secListRow = (LinearLayout) convertView.findViewById(R.id.secListRow);

            // final TextView Rnd = (TextView) convertView.findViewById(R.id.Rnd);
            //  final TextView SuchanaID = (TextView) convertView.findViewById(R.id.SuchanaID);
            //     final TextView H172 = (TextView) convertView.findViewById(R.id.H172);
            final TextView SlNo = (TextView) convertView.findViewById(R.id.SlNo);
            final TextView H172a = (TextView) convertView.findViewById(R.id.H172a);
            // final TextView H172aX = (TextView) convertView.findViewById(R.id.H172aX);
            final TextView H172b = (TextView) convertView.findViewById(R.id.H172b);
            // final TextView H172cX = (TextView) convertView.findViewById(R.id.H172cX);
            // final TextView H172cY = (TextView) convertView.findViewById(R.id.H172cY);
            //  final TextView H172cM = (TextView) convertView.findViewById(R.id.H172cM);
            final TextView H172d = (TextView) convertView.findViewById(R.id.H172d);

            final HashMap<String, String> o = (HashMap<String, String>) dataAdap.getItem(position);
            //   Rnd.setText(o.get("Rnd"));
            //  SuchanaID.setText(o.get("SuchanaID"));
            //   H172.setText(o.get("H172"));
            SlNo.setText(o.get("SlNo"));

            List<String> listH172a = new ArrayList<String>();

            listH172a.add("");
            listH172a.add("1-জ্বর");
            listH172a.add("2-ব্যথা");
            listH172a.add("3-দুর্বলতা");
            listH172a.add("4-ঠান্ডা/কাশি");
            listH172a.add("5-ত্বকেগুটি/চার্ম রোগ");
            listH172a.add("6-পাতলা পায়খানা");
            listH172a.add("7-ঝিমুনি");
            listH172a.add("8-বমিহওয়া বমিভাব");
            listH172a.add("9-ক্ষুধামন্দা");
            listH172a.add("10-অনিদ্রা");
            listH172a.add("11-রাতকানা ছানি");
            listH172a.add("12-কর্ণশূল শুনতে অসুবিধা");
            listH172a.add("13-গর্ভাবস্থা জনিত সমস্যা");
            listH172a.add("14-প্রজননঅঙ্গ জনিত সমস্যা");
            listH172a.add("15-রক্তাল্পতা");
            listH172a.add("16-ডায়বেটিস");
            listH172a.add("17-উচ্চরক্তচাপ");
            listH172a.add("18-গলাফোলা");
            listH172a.add("19-মানসিক সমস্যা");
            listH172a.add("20-দাতের সমস্যা");
            listH172a.add("21-শ্বাসকষষ্ট");
            listH172a.add("22-পেটে গ্যা ");
            listH172a.add("23-টিউমার");
            listH172a.add("24-অন্যান্য");

            for (int i = 0; i < listH172a.size(); i++) {
                if (listH172a.get(i).contains(o.get("H172a"))) {
                    H172a.setText(listH172a.get(i));
                    break;
                }

            }

            //   H172aX.setText(o.get("H172aX"));

            List<String> listH172b = new ArrayList<String>();

            listH172b.add("");
            listH172b.add("1-কোন চিকিৎসা নেয়া হয়নি");
            listH172b.add("2-বাড়ীতেই সাধারণ চিকিৎসা");
            listH172b.add("3-গ্রাম ডাক্তার");
            listH172b.add("4-প্যারামেডিক PC/CHCP/FWV/CHW/SS/HA/MA");
            listH172b.add("5-এলোপ্যাথিক ঔষুধ বিক্রেতা/ফার্মেসিস্ট (রোগ  বুঝে চিকিৎসা দেয়)");
            listH172b.add("6-যোগ্যতাসম্পন্ন সরকারী/বেসরকারী MBBS ডাক্তার");
            listH172b.add("7-পীর/ফকির/ওঝা");
            listH172b.add("8-কবিরাজ/হেকিম/বৈদ্য");
            listH172b.add("9-হোমিওপ্যাথি");
            listH172b.add("10-অন্যান্য (নির্দিষ্ট করুন)");
            for (int i = 0; i < listH172b.size(); i++) {
                if (listH172b.get(i).contains(o.get("H172b"))) {
                    H172b.setText(listH172b.get(i));
                    break;
                }

            }

            //    H172cX.setText(o.get("H172cX"));
            //    H172cY.setText(o.get("H172cY"));
            //  H172cM.setText(o.get("H172cM"));
            H172d.setText(o.get("H172d"));

            secListRow.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    //Write your code here
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", o.get("Rnd"));
                    IDbundle.putString("SuchanaID", o.get("SuchanaID"));
                    IDbundle.putString("SlNo", o.get("SlNo"));

                    Intent f1;
                    f1 = new Intent(getApplicationContext(), Illness2.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);
                }
            });


            return convertView;
        }
    }


}