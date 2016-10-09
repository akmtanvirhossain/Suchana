package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Loan_list" android:label="Loan: List" />

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

public class Loan_list extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    static String H112 = "";
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
            setContentView(R.layout.loan_list);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();

            TableName = "Loan";
            lblHeading = (TextView) findViewById(R.id.lblHeading);
            /*lblHeading.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    final int DRAWABLE_RIGHT = 2;
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (event.getRawX() >= (lblHeading.getRight() - lblHeading.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                            AlertDialog.Builder adb = new AlertDialog.Builder(Loan_list.this);
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
            });

*/
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");
          //  H112 = IDbundle.getString("H112");

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Loan_list.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), Savings.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDbundle);
                            getApplicationContext().startActivity(intent);
                            finish();
                        }
                    });
                    adb.show();
                }
            });
            cmdForward = (ImageButton) findViewById(R.id.cmdForward);
            cmdForward.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Loan_list.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to start HFIAS [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), HFIAS.class);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(Loan_list.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to start HFIAS [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), HFIAS.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDbundle);
                            getApplicationContext().startActivity(intent);

                        }
                    });
                    adb.show();
                }
            });

            TextView lblSuchanaId = (TextView) findViewById(R.id.lblSuchanaIdHeader);
            lblSuchanaId.setText(SUCHANAID);
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
                    Cursor cursor = C.GetData("Loan", "SuchanaID", SUCHANAID);
                    if (cursor.getCount() != 0) {
                        lineNo = cursor.getCount() + 1;
                    } else {
                        lineNo = 1;
                    }

                    Bundle IDbundle1 = new Bundle();
                    IDbundle1.putString("Rnd", RND);
                    IDbundle1.putString("SuchanaID", SUCHANAID);
                    IDbundle1.putString("H112",String.valueOf(lineNo));

                    Intent intent = new Intent(getApplicationContext(), Loan.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtras(IDbundle1);
                    getApplicationContext().startActivity(intent);

                }
            });
            TextView lblSucanaId = (TextView) findViewById(R.id.lblSuchanaIdHeader);
            lblSucanaId.setText(SUCHANAID);


            lblNext= (TextView) findViewById(R.id.lblNext);
            lblNext.setEnabled(false);
            cmdForward.setEnabled(false);
            DataSearch(RND, SUCHANAID);


        } catch (Exception e) {
            Connection.MessageBox(Loan_list.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            Loan_DataModel d = new Loan_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<Loan_DataModel> data = d.SelectAll(this, SQL);
            dataList.clear();

            dataAdapter = null;

            ListView list = (ListView) findViewById(R.id.lstData);
            HashMap<String, String> map;

            for (Loan_DataModel item : data) {
                map = new HashMap<String, String>();

                cmdForward.setEnabled(true);
                lblNext.setEnabled(true);

                map.put("Rnd", item.getRnd());
                map.put("SuchanaID", item.getSuchanaID());
                map.put("MSlNo", item.getMSlNo());
                map.put("H111", item.getH111());
                map.put("H112", item.getH112());
                map.put("H113", item.getH113());
                map.put("H113X", item.getH113X());
                map.put("H114a", item.getH114a());
                map.put("H114b", item.getH114b());
                map.put("H114c", item.getH114c());
                map.put("H114X", item.getH114X());
                map.put("H115", item.getH115());
                map.put("H116", item.getH116());
                map.put("H117", item.getH117());
                map.put("H118", item.getH118());
                dataList.add(map);
            }
            dataAdapter = new SimpleAdapter(Loan_list.this, dataList, R.layout.loan_list, new String[]{"rowsec"},
                    new int[]{R.id.secListRow});
            list.setAdapter(new DataListAdapter(this, dataAdapter));
        } catch (Exception e) {
            Connection.MessageBox(Loan_list.this, e.getMessage());
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
                convertView = inflater.inflate(R.layout.loan_row, null);
            }
            LinearLayout secListRow = (LinearLayout) convertView.findViewById(R.id.secListRow);

            //  final TextView Rnd = (TextView) convertView.findViewById(R.id.Rnd);
            //   final TextView SuchanaID = (TextView) convertView.findViewById(R.id.SuchanaID);
            //    final TextView MSlNo = (TextView) convertView.findViewById(R.id.MSlNo);
            // final TextView H111 = (TextView) convertView.findViewById(R.id.H111);
            final TextView H112 = (TextView) convertView.findViewById(R.id.H112);
            final TextView H113 = (TextView) convertView.findViewById(R.id.H113);
            //   final TextView H113X = (TextView) convertView.findViewById(R.id.H113X);
            final TextView H114a = (TextView) convertView.findViewById(R.id.H114a);
            final TextView H114b = (TextView) convertView.findViewById(R.id.H114b);
            final TextView H114c = (TextView) convertView.findViewById(R.id.H114c);
            // final TextView H114X = (TextView) convertView.findViewById(R.id.H114X);
            //  final TextView H115 = (TextView) convertView.findViewById(R.id.H115);
            //  final TextView H116 = (TextView) convertView.findViewById(R.id.H116);
            // final TextView H117 = (TextView) convertView.findViewById(R.id.H117);
            // final TextView H118 = (TextView) convertView.findViewById(R.id.H118);

            final HashMap<String, String> o = (HashMap<String, String>) dataAdap.getItem(position);
//            Rnd.setText(o.get("Rnd"));
            //     SuchanaID.setText(o.get("SuchanaID"));
            //     MSlNo.setText(o.get("MSlNo"));
            // H111.setText(o.get("H111"));
            H112.setText(o.get("H112"));

            List<String> listH113 = new ArrayList<String>();

            listH113.add("");
            listH113.add("01-ব্যাংক");
            listH113.add("02-মহাজন");
            listH113.add("03-দোকানদার");
            listH113.add("04-আত্মীয়");
            listH113.add("05-বন্ধু প্রতিবেশী");
            listH113.add("06-গ্রামীণ");
            listH113.add("07-আশা");
            listH113.add("08-টিএমএসএস");
            listH113.add("09-আরডিআরএস");
            listH113.add("10-প্রশিখা");
            listH113.add("11-পদক্ষেপ");
            listH113.add("12-স্বনির্ভর");
            listH113.add("13-সিএনআরএস");
            listH113.add("14-এফআইভিডিবি");
            listH113.add("15-ব্র্যাক");
            listH113.add("16-ভারড");
            listH113.add("17-আশা");
            listH113.add("18-ব্যুরো");
            listH113.add("19-হিড");
            listH113.add("20-অনান্য এন,জি,ও");

            for (int i = 0; i < listH113.size(); i++) {
                if (listH113.get(i).contains(o.get("H113"))) {
                    H113.setText(listH113.get(i));
                    break;
                }

            }
            // H113.setText(listH113.get(Integer.valueOf(o.get("H113"))));
            //  H113X.setText(o.get("H113X"));


            List<String> listH114a = new ArrayList<String>();

            listH114a.add("");
            listH114a.add("01-ব্যবসায়িক উদ্যোগ");
            listH114a.add("02-সার কিনতে");
            listH114a.add("03-বীজ কিনতে");
            listH114a.add("04-কীটনাশক কিনতে");
            listH114a.add("05-সেচ সরঞ্জাম কিনতে");
            listH114a.add("06-অন্যান্য কৃষি উপকরণ কিনতে");
            listH114a.add("07-সেচের জন্য পানি কিনতে");
            listH114a.add("08-কৃষির জন্য ডিজেল / বিদ্যুৎ খরচ");
            listH114a.add("09-কৃষি শ্রম মজুরি");
            listH114a.add("10-কৃষির জন্য ভাড়া করা মেশিন/ পশুদের খরচ");
            listH114a.add("11-কৃষি ছাড়া অন্য উদ্দেশ্যে উৎপাদনশীল সম্পদ কিনতে");
            listH114a.add("12-কৃষি জমি ইজারা জন্য (নগদ মাত্র)");
            listH114a.add("13-কৃষি ছাড়া অন্য (নগদ মাত্র উদ্দেশ্যে) জমি ইজারা জন্য");
            listH114a.add("14-জমি ক্রয়ের জন্য");
            listH114a.add("15-গরু ছাগল ক্রয়ের জন্য");
            listH114a.add("16-চিকিৎসার জন্য");
            listH114a.add("17-খানার খাবারের চাহিদা পূরণের জন্য");
            listH114a.add("18-খানা ভাড়া /ক্রয/ উন্নয়নের জন্য");
            listH114a.add("19-শিক্ষার খরচের জন্য");
            listH114a.add("20-বিয়ের জন্য ব্যয়");
            listH114a.add("21-যৌতুক");
            listH114a.add("22-জানাজা অন্ত্যেষ্টিক্রিয়া");
            listH114a.add("23-উচ্চ সুদে ধার দেয়ার জন্য");
            listH114a.add("24-বিদেশে যাওয়ার জন্য");
            listH114a.add("25-অন্য লোন শোধ করার জন্য");
            listH114a.add("26-অনান্য");


            for (int i = 0; i < listH114a.size(); i++) {
                if (listH114a.get(i).contains(o.get("H114a"))) {
                    H114a.setText(listH114a.get(i));
                    break;
                }

            }
            // H114a.setText(listH114a.get(Integer.valueOf(o.get("H114a"))));

            List<String> listH114b = new ArrayList<String>();

            listH114b.add("");
            listH114b.add("01-ব্যবসায়িক উদ্যোগ");
            listH114b.add("02-সার কিনতে");
            listH114b.add("03-বীজ কিনতে");
            listH114b.add("04-কীটনাশক কিনতে");
            listH114b.add("05-সেচ সরঞ্জাম কিনতে");
            listH114b.add("06-অন্যান্য কৃষি উপকরণ কিনতে");
            listH114b.add("07-সেচের জন্য পানি কিনতে");
            listH114b.add("08-কৃষির জন্য ডিজেল / বিদ্যুৎ খরচ");
            listH114b.add("09-কৃষি শ্রম মজুরি");
            listH114b.add("10-কৃষির জন্য ভাড়া করা মেশিন/ পশুদের খরচ");
            listH114b.add("11-কৃষি ছাড়া অন্য উদ্দেশ্যে উৎপাদনশীল সম্পদ কিনতে");
            listH114b.add("12-কৃষি জমি ইজারা জন্য (নগদ মাত্র)");
            listH114b.add("13-কৃষি ছাড়া অন্য (নগদ মাত্র উদ্দেশ্যে) জমি ইজারা জন্য");
            listH114b.add("14-জমি ক্রয়ের জন্য");
            listH114b.add("15-গরু ছাগল ক্রয়ের জন্য");
            listH114b.add("16-চিকিৎসার জন্য");
            listH114b.add("17-খানার খাবারের চাহিদা পূরণের জন্য");
            listH114b.add("18-খানা ভাড়া /ক্রয/় উন্নয়নের জন্য");
            listH114b.add("19-শিক্ষার খরচের জন্য");
            listH114b.add("20-বিয়ের জন্য ব্যয়");
            listH114b.add("21-যৌতুক");
            listH114b.add("22-জানাজা অন্ত্যেষ্টিক্রিয়া");
            listH114b.add("23-উচ্চ সুদে ধার দেয়ার জন্য");
            listH114b.add("24-বিদেশে যাওয়ার জন্য");
            listH114b.add("25-অন্য লোন শোধ করার জন্য");
            listH114b.add("26-অনান্য");

            for (int i = 0; i < listH114b.size(); i++) {
                if (listH114b.get(i).contains(o.get("H114b"))) {
                    H114b.setText(listH114b.get(i));
                    break;
                }

            }
            //H114b.setText(listH114b.get(Integer.valueOf(o.get("H114b"))));

            List<String> listH114c = new ArrayList<String>();

            listH114c.add("");
            listH114c.add("01-ব্যবসায়িক উদ্যোগ");
            listH114c.add("02-সার কিনতে");
            listH114c.add("03-বীজ কিনতে");
            listH114c.add("04-কীটনাশক কিনতে");
            listH114c.add("05-সেচ সরঞ্জাম কিনতে");
            listH114c.add("06-অন্যান্য কৃষি উপকরণ কিনতে");
            listH114c.add("07-সেচের জন্য পানি কিনতে");
            listH114c.add("08-কৃষির জন্য ডিজেল / বিদ্যুৎ খরচ");
            listH114c.add("09-কৃষি শ্রম মজুরি");
            listH114c.add("10-কৃষির জন্য ভাড়া করা মেশিন /পশুদের খরচ");
            listH114c.add("11-কৃষি ছাড়া অন্য উদ্দেশ্যে উৎপাদনশীল সম্পদ কিনতে");
            listH114c.add("12-কৃষি জমি ইজারা জন্য (নগদ মাত্র)");
            listH114c.add("13-কৃষি ছাড়া অন্য (নগদ মাত্র উদ্দেশ্যে) জমি ইজারা জন্য");
            listH114c.add("14-জমি ক্রয়ের জন্য");
            listH114c.add("15-গরু ছাগল ক্রয়ের জন্য");
            listH114c.add("16-চিকিৎসার জন্য");
            listH114c.add("17-খানার খাবারের চাহিদা পূরণের জন্য");
            listH114c.add("18-খানা ভাড়া /ক্রয/় উন্নয়নের জন্য");
            listH114c.add("19-শিক্ষার খরচের জন্য");
            listH114c.add("20-বিয়ের জন্য ব্যয়");
            listH114c.add("21-যৌতুক");
            listH114c.add("22-জানাজা অন্ত্যেষ্টিক্রিয়া");
            listH114c.add("23-উচ্চ সুদে ধার দেয়ার জন্য");
            listH114c.add("24-বিদেশে যাওয়ার জন্য");
            listH114c.add("25-অন্য লোন শোধ করার জন্য");
            listH114c.add("26-অনান্য");


            for (int i = 0; i < listH114c.size(); i++) {
                if (listH114c.get(i).contains(o.get("H114c"))) {
                    H114c.setText(listH114c.get(i));
                    break;
                }

            }
            //H114c.setText(listH114c.get(Integer.valueOf(o.get("H114c"))));
            // H114X.setText(o.get("H114X"));
            // H115.setText(o.get("H115"));
            // H116.setText(o.get("H116"));
            // H117.setText(o.get("H117"));
            // H118.setText(o.get("H118"));

            secListRow.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    //Write your code here
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", o.get("Rnd"));
                    IDbundle.putString("SuchanaID", o.get("SuchanaID"));
                    IDbundle.putString("H112", o.get("H112"));
                    Intent f1;
                    f1 = new Intent(getApplicationContext(), Loan.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);
                }
            });


            return convertView;
        }
    }


}