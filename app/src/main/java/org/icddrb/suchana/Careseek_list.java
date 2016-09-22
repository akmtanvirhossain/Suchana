package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Careseek_list" android:label="Careseek: List" />

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
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

public class Careseek_list extends Activity {
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
            setContentView(R.layout.careseek_list);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();

            TableName = "Careseek";
            lblHeading = (TextView) findViewById(R.id.lblHeading);
            lblHeading.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    final int DRAWABLE_RIGHT = 2;
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (event.getRawX() >= (lblHeading.getRight() - lblHeading.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                            AlertDialog.Builder adb = new AlertDialog.Builder(Careseek_list.this);
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

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(Careseek_list.this);
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
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
                    IDbundle.putString("Rnd", "");
                    IDbundle.putString("SuchanaID", "");
                    Intent intent = new Intent(getApplicationContext(), Careseek.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtras(IDbundle);
                    getApplicationContext().startActivity(intent);

                }
            });


            DataSearch(RND, SUCHANAID);


        } catch (Exception e) {
            Connection.MessageBox(Careseek_list.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            Careseek_DataModel d = new Careseek_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<Careseek_DataModel> data = d.SelectAll(this, SQL);
            dataList.clear();

            dataAdapter = null;

            ListView list = (ListView) findViewById(R.id.lstData);
            HashMap<String, String> map;

            for (Careseek_DataModel item : data) {
                map = new HashMap<String, String>();
                map.put("Rnd", item.getRnd());
                map.put("SuchanaID", item.getSuchanaID());
                map.put("H181a", item.getH181a());
                map.put("H181a1", item.getH181a1());
                map.put("H181a1X", item.getH181a1X());
                map.put("H181a2", item.getH181a2());
                map.put("H181a2X", item.getH181a2X());
                map.put("H181a3", item.getH181a3());
                map.put("H181a3X", item.getH181a3X());
                map.put("H181a4", item.getH181a4());
                map.put("H182a", item.getH182a());
                map.put("H182a1", item.getH182a1());
                map.put("H182a1X", item.getH182a1X());
                map.put("H182a2", item.getH182a2());
                map.put("H182a2X", item.getH182a2X());
                map.put("H182a3", item.getH182a3());
                map.put("H182a3X", item.getH182a3X());
                map.put("H182a4", item.getH182a4());
                map.put("H183a", item.getH183a());
                map.put("H183a1", item.getH183a1());
                map.put("H183a1X", item.getH183a1X());
                map.put("H183a2", item.getH183a2());
                map.put("H183a2X", item.getH183a2X());
                map.put("H183a3", item.getH183a3());
                map.put("H183a3X", item.getH183a3X());
                map.put("H183a4", item.getH183a4());
                map.put("H184a", item.getH184a());
                map.put("H184a1", item.getH184a1());
                map.put("H184a1X", item.getH184a1X());
                map.put("H184a2", item.getH184a2());
                map.put("H184a2X", item.getH184a2X());
                map.put("H184a3", item.getH184a3());
                map.put("H184a3X", item.getH184a3X());
                map.put("H184a4", item.getH184a4());
                map.put("H185a", item.getH185a());
                map.put("H185a1", item.getH185a1());
                map.put("H185a1X", item.getH185a1X());
                map.put("H185a2", item.getH185a2());
                map.put("H185a2X", item.getH185a2X());
                map.put("H185a3", item.getH185a3());
                map.put("H185a3X", item.getH185a3X());
                map.put("H185a4", item.getH185a4());
                map.put("H186a", item.getH186a());
                map.put("H186a1", item.getH186a1());
                map.put("H186a1X", item.getH186a1X());
                map.put("H186a2", item.getH186a2());
                map.put("H186a2X", item.getH186a2X());
                map.put("H186a3", item.getH186a3());
                map.put("H186a3X", item.getH186a3X());
                map.put("H186a4", item.getH186a4());
                map.put("H187a", item.getH187a());
                map.put("H187a1", item.getH187a1());
                map.put("H187a1X", item.getH187a1X());
                map.put("H187a2", item.getH187a2());
                map.put("H187a2X", item.getH187a2X());
                map.put("H187a3", item.getH187a3());
                map.put("H187a3X", item.getH187a3X());
                map.put("H187a4", item.getH187a4());
                map.put("H188a", item.getH188a());
                map.put("H188a1", item.getH188a1());
                map.put("H188a1X", item.getH188a1X());
                map.put("H188a2", item.getH188a2());
                map.put("H188a2X", item.getH188a2X());
                map.put("H188a3", item.getH188a3());
                map.put("H1881a3X", item.getH1881a3X());
                map.put("H188a4", item.getH188a4());
                map.put("H189a", item.getH189a());
                map.put("H189a1", item.getH189a1());
                map.put("H189a1X", item.getH189a1X());
                map.put("H189a2", item.getH189a2());
                map.put("H189a2X", item.getH189a2X());
                map.put("H189a3", item.getH189a3());
                map.put("H189a3X", item.getH189a3X());
                map.put("H189a4", item.getH189a4());
                map.put("H1810a", item.getH1810a());
                map.put("H1810a1", item.getH1810a1());
                map.put("H1810a1X", item.getH1810a1X());
                map.put("H1810a2", item.getH1810a2());
                map.put("H1810a2X", item.getH1810a2X());
                map.put("H1810a3", item.getH1810a3());
                map.put("H1810a3X", item.getH1810a3X());
                map.put("H1810a4", item.getH1810a4());
                map.put("H1811a", item.getH1811a());
                map.put("H1811a1", item.getH1811a1());
                map.put("H1811a1X", item.getH1811a1X());
                map.put("H1811a2", item.getH1811a2());
                map.put("H1811a2X", item.getH1811a2X());
                map.put("H1811a3", item.getH1811a3());
                map.put("H1811a3X", item.getH1811a3X());
                map.put("H1811a4", item.getH1811a4());
                map.put("H1812a", item.getH1812a());
                map.put("H1812a1", item.getH1812a1());
                map.put("H1812a1X", item.getH1812a1X());
                map.put("H1812a2", item.getH1812a2());
                map.put("H1812a2X", item.getH1812a2X());
                map.put("H1812a3", item.getH1812a3());
                map.put("H1812a3X", item.getH1812a3X());
                map.put("H1812a4", item.getH1812a4());
                dataList.add(map);
            }
            dataAdapter = new SimpleAdapter(Careseek_list.this, dataList, R.layout.careseek_list, new String[]{"rowsec"},
                    new int[]{R.id.secListRow});
            list.setAdapter(new DataListAdapter(this, dataAdapter));
        } catch (Exception e) {
            Connection.MessageBox(Careseek_list.this, e.getMessage());
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
                convertView = inflater.inflate(R.layout.careseek_row, null);
            }
            LinearLayout secListRow = (LinearLayout) convertView.findViewById(R.id.secListRow);

            final TextView Rnd = (TextView) convertView.findViewById(R.id.Rnd);
            final TextView SuchanaID = (TextView) convertView.findViewById(R.id.SuchanaID);
            final TextView H181a = (TextView) convertView.findViewById(R.id.H181a);
            final TextView H181a1 = (TextView) convertView.findViewById(R.id.H181a1);
            final TextView H181a1X = (TextView) convertView.findViewById(R.id.H181a1X);
            final TextView H181a2 = (TextView) convertView.findViewById(R.id.H181a2);
            final TextView H181a2X = (TextView) convertView.findViewById(R.id.H181a2X);
            final TextView H181a3 = (TextView) convertView.findViewById(R.id.H181a3);
            final TextView H181a3X = (TextView) convertView.findViewById(R.id.H181a3X);
            final TextView H181a4 = (TextView) convertView.findViewById(R.id.H181a4);
            final TextView H182a = (TextView) convertView.findViewById(R.id.H182a);
            final TextView H182a1 = (TextView) convertView.findViewById(R.id.H182a1);
            final TextView H182a1X = (TextView) convertView.findViewById(R.id.H182a1X);
            final TextView H182a2 = (TextView) convertView.findViewById(R.id.H182a2);
            final TextView H182a2X = (TextView) convertView.findViewById(R.id.H182a2X);
            final TextView H182a3 = (TextView) convertView.findViewById(R.id.H182a3);
            final TextView H182a3X = (TextView) convertView.findViewById(R.id.H182a3X);
            final TextView H182a4 = (TextView) convertView.findViewById(R.id.H182a4);
            final TextView H183a = (TextView) convertView.findViewById(R.id.H183a);
            final TextView H183a1 = (TextView) convertView.findViewById(R.id.H183a1);
            final TextView H183a1X = (TextView) convertView.findViewById(R.id.H183a1X);
            final TextView H183a2 = (TextView) convertView.findViewById(R.id.H183a2);
            final TextView H183a2X = (TextView) convertView.findViewById(R.id.H183a2X);
            final TextView H183a3 = (TextView) convertView.findViewById(R.id.H183a3);
            final TextView H183a3X = (TextView) convertView.findViewById(R.id.H183a3X);
            final TextView H183a4 = (TextView) convertView.findViewById(R.id.H183a4);
            final TextView H184a = (TextView) convertView.findViewById(R.id.H184a);
            final TextView H184a1 = (TextView) convertView.findViewById(R.id.H184a1);
            final TextView H184a1X = (TextView) convertView.findViewById(R.id.H184a1X);
            final TextView H184a2 = (TextView) convertView.findViewById(R.id.H184a2);
            final TextView H184a2X = (TextView) convertView.findViewById(R.id.H184a2X);
            final TextView H184a3 = (TextView) convertView.findViewById(R.id.H184a3);
            final TextView H184a3X = (TextView) convertView.findViewById(R.id.H184a3X);
            final TextView H184a4 = (TextView) convertView.findViewById(R.id.H184a4);
            final TextView H185a = (TextView) convertView.findViewById(R.id.H185a);
            final TextView H185a1 = (TextView) convertView.findViewById(R.id.H185a1);
            final TextView H185a1X = (TextView) convertView.findViewById(R.id.H185a1X);
            final TextView H185a2 = (TextView) convertView.findViewById(R.id.H185a2);
            final TextView H185a2X = (TextView) convertView.findViewById(R.id.H185a2X);
            final TextView H185a3 = (TextView) convertView.findViewById(R.id.H185a3);
            final TextView H185a3X = (TextView) convertView.findViewById(R.id.H185a3X);
            final TextView H185a4 = (TextView) convertView.findViewById(R.id.H185a4);
            final TextView H186a = (TextView) convertView.findViewById(R.id.H186a);
            final TextView H186a1 = (TextView) convertView.findViewById(R.id.H186a1);
            final TextView H186a1X = (TextView) convertView.findViewById(R.id.H186a1X);
            final TextView H186a2 = (TextView) convertView.findViewById(R.id.H186a2);
            final TextView H186a2X = (TextView) convertView.findViewById(R.id.H186a2X);
            final TextView H186a3 = (TextView) convertView.findViewById(R.id.H186a3);
            final TextView H186a3X = (TextView) convertView.findViewById(R.id.H186a3X);
            final TextView H186a4 = (TextView) convertView.findViewById(R.id.H186a4);
            final TextView H187a = (TextView) convertView.findViewById(R.id.H187a);
            final TextView H187a1 = (TextView) convertView.findViewById(R.id.H187a1);
            final TextView H187a1X = (TextView) convertView.findViewById(R.id.H187a1X);
            final TextView H187a2 = (TextView) convertView.findViewById(R.id.H187a2);
            final TextView H187a2X = (TextView) convertView.findViewById(R.id.H187a2X);
            final TextView H187a3 = (TextView) convertView.findViewById(R.id.H187a3);
            final TextView H187a3X = (TextView) convertView.findViewById(R.id.H187a3X);
            final TextView H187a4 = (TextView) convertView.findViewById(R.id.H187a4);
            final TextView H188a = (TextView) convertView.findViewById(R.id.H188a);
            final TextView H188a1 = (TextView) convertView.findViewById(R.id.H188a1);
            final TextView H188a1X = (TextView) convertView.findViewById(R.id.H188a1X);
            final TextView H188a2 = (TextView) convertView.findViewById(R.id.H188a2);
            final TextView H188a2X = (TextView) convertView.findViewById(R.id.H188a2X);
            final TextView H188a3 = (TextView) convertView.findViewById(R.id.H188a3);
            final TextView H1881a3X = (TextView) convertView.findViewById(R.id.H1881a3X);
            final TextView H188a4 = (TextView) convertView.findViewById(R.id.H188a4);
            final TextView H189a = (TextView) convertView.findViewById(R.id.H189a);
            final TextView H189a1 = (TextView) convertView.findViewById(R.id.H189a1);
            final TextView H189a1X = (TextView) convertView.findViewById(R.id.H189a1X);
            final TextView H189a2 = (TextView) convertView.findViewById(R.id.H189a2);
            final TextView H189a2X = (TextView) convertView.findViewById(R.id.H189a2X);
            final TextView H189a3 = (TextView) convertView.findViewById(R.id.H189a3);
            final TextView H189a3X = (TextView) convertView.findViewById(R.id.H189a3X);
            final TextView H189a4 = (TextView) convertView.findViewById(R.id.H189a4);
            final TextView H1810a = (TextView) convertView.findViewById(R.id.H1810a);
            final TextView H1810a1 = (TextView) convertView.findViewById(R.id.H1810a1);
            final TextView H1810a1X = (TextView) convertView.findViewById(R.id.H1810a1X);
            final TextView H1810a2 = (TextView) convertView.findViewById(R.id.H1810a2);
            final TextView H1810a2X = (TextView) convertView.findViewById(R.id.H1810a2X);
            final TextView H1810a3 = (TextView) convertView.findViewById(R.id.H1810a3);
            final TextView H1810a3X = (TextView) convertView.findViewById(R.id.H1810a3X);
            final TextView H1810a4 = (TextView) convertView.findViewById(R.id.H1810a4);
            final TextView H1811a = (TextView) convertView.findViewById(R.id.H1811a);
            final TextView H1811a1 = (TextView) convertView.findViewById(R.id.H1811a1);
            final TextView H1811a1X = (TextView) convertView.findViewById(R.id.H1811a1X);
            final TextView H1811a2 = (TextView) convertView.findViewById(R.id.H1811a2);
            final TextView H1811a2X = (TextView) convertView.findViewById(R.id.H1811a2X);
            final TextView H1811a3 = (TextView) convertView.findViewById(R.id.H1811a3);
            final TextView H1811a3X = (TextView) convertView.findViewById(R.id.H1811a3X);
            final TextView H1811a4 = (TextView) convertView.findViewById(R.id.H1811a4);
            final TextView H1812a = (TextView) convertView.findViewById(R.id.H1812a);
            final TextView H1812a1 = (TextView) convertView.findViewById(R.id.H1812a1);
            final TextView H1812a1X = (TextView) convertView.findViewById(R.id.H1812a1X);
            final TextView H1812a2 = (TextView) convertView.findViewById(R.id.H1812a2);
            final TextView H1812a2X = (TextView) convertView.findViewById(R.id.H1812a2X);
            final TextView H1812a3 = (TextView) convertView.findViewById(R.id.H1812a3);
            final TextView H1812a3X = (TextView) convertView.findViewById(R.id.H1812a3X);
            final TextView H1812a4 = (TextView) convertView.findViewById(R.id.H1812a4);

            final HashMap<String, String> o = (HashMap<String, String>) dataAdap.getItem(position);
            Rnd.setText(o.get("Rnd"));
            SuchanaID.setText(o.get("SuchanaID"));
            H181a.setText(o.get("H181a"));
            H181a1.setText(o.get("H181a1"));
            H181a1X.setText(o.get("H181a1X"));
            H181a2.setText(o.get("H181a2"));
            H181a2X.setText(o.get("H181a2X"));
            H181a3.setText(o.get("H181a3"));
            H181a3X.setText(o.get("H181a3X"));
            H181a4.setText(o.get("H181a4"));
            H182a.setText(o.get("H182a"));
            H182a1.setText(o.get("H182a1"));
            H182a1X.setText(o.get("H182a1X"));
            H182a2.setText(o.get("H182a2"));
            H182a2X.setText(o.get("H182a2X"));
            H182a3.setText(o.get("H182a3"));
            H182a3X.setText(o.get("H182a3X"));
            H182a4.setText(o.get("H182a4"));
            H183a.setText(o.get("H183a"));
            H183a1.setText(o.get("H183a1"));
            H183a1X.setText(o.get("H183a1X"));
            H183a2.setText(o.get("H183a2"));
            H183a2X.setText(o.get("H183a2X"));
            H183a3.setText(o.get("H183a3"));
            H183a3X.setText(o.get("H183a3X"));
            H183a4.setText(o.get("H183a4"));
            H184a.setText(o.get("H184a"));
            H184a1.setText(o.get("H184a1"));
            H184a1X.setText(o.get("H184a1X"));
            H184a2.setText(o.get("H184a2"));
            H184a2X.setText(o.get("H184a2X"));
            H184a3.setText(o.get("H184a3"));
            H184a3X.setText(o.get("H184a3X"));
            H184a4.setText(o.get("H184a4"));
            H185a.setText(o.get("H185a"));
            H185a1.setText(o.get("H185a1"));
            H185a1X.setText(o.get("H185a1X"));
            H185a2.setText(o.get("H185a2"));
            H185a2X.setText(o.get("H185a2X"));
            H185a3.setText(o.get("H185a3"));
            H185a3X.setText(o.get("H185a3X"));
            H185a4.setText(o.get("H185a4"));
            H186a.setText(o.get("H186a"));
            H186a1.setText(o.get("H186a1"));
            H186a1X.setText(o.get("H186a1X"));
            H186a2.setText(o.get("H186a2"));
            H186a2X.setText(o.get("H186a2X"));
            H186a3.setText(o.get("H186a3"));
            H186a3X.setText(o.get("H186a3X"));
            H186a4.setText(o.get("H186a4"));
            H187a.setText(o.get("H187a"));
            H187a1.setText(o.get("H187a1"));
            H187a1X.setText(o.get("H187a1X"));
            H187a2.setText(o.get("H187a2"));
            H187a2X.setText(o.get("H187a2X"));
            H187a3.setText(o.get("H187a3"));
            H187a3X.setText(o.get("H187a3X"));
            H187a4.setText(o.get("H187a4"));
            H188a.setText(o.get("H188a"));
            H188a1.setText(o.get("H188a1"));
            H188a1X.setText(o.get("H188a1X"));
            H188a2.setText(o.get("H188a2"));
            H188a2X.setText(o.get("H188a2X"));
            H188a3.setText(o.get("H188a3"));
            H1881a3X.setText(o.get("H1881a3X"));
            H188a4.setText(o.get("H188a4"));
            H189a.setText(o.get("H189a"));
            H189a1.setText(o.get("H189a1"));
            H189a1X.setText(o.get("H189a1X"));
            H189a2.setText(o.get("H189a2"));
            H189a2X.setText(o.get("H189a2X"));
            H189a3.setText(o.get("H189a3"));
            H189a3X.setText(o.get("H189a3X"));
            H189a4.setText(o.get("H189a4"));
            H1810a.setText(o.get("H1810a"));
            H1810a1.setText(o.get("H1810a1"));
            H1810a1X.setText(o.get("H1810a1X"));
            H1810a2.setText(o.get("H1810a2"));
            H1810a2X.setText(o.get("H1810a2X"));
            H1810a3.setText(o.get("H1810a3"));
            H1810a3X.setText(o.get("H1810a3X"));
            H1810a4.setText(o.get("H1810a4"));
            H1811a.setText(o.get("H1811a"));
            H1811a1.setText(o.get("H1811a1"));
            H1811a1X.setText(o.get("H1811a1X"));
            H1811a2.setText(o.get("H1811a2"));
            H1811a2X.setText(o.get("H1811a2X"));
            H1811a3.setText(o.get("H1811a3"));
            H1811a3X.setText(o.get("H1811a3X"));
            H1811a4.setText(o.get("H1811a4"));
            H1812a.setText(o.get("H1812a"));
            H1812a1.setText(o.get("H1812a1"));
            H1812a1X.setText(o.get("H1812a1X"));
            H1812a2.setText(o.get("H1812a2"));
            H1812a2X.setText(o.get("H1812a2X"));
            H1812a3.setText(o.get("H1812a3"));
            H1812a3X.setText(o.get("H1812a3X"));
            H1812a4.setText(o.get("H1812a4"));

            secListRow.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    //Write your code here
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", o.get("Rnd"));
                    IDbundle.putString("SuchanaID", o.get("SuchanaID"));
                    Intent f1;
                    f1 = new Intent(getApplicationContext(), Careseek.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);
                }
            });


            return convertView;
        }
    }


}