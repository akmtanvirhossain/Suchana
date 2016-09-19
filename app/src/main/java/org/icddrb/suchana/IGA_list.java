package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".IGA_list" android:label="IGA: List" />

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

public class IGA_list extends Activity {
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
            setContentView(R.layout.iga_list);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();

            TableName = "IGA";
            lblHeading = (TextView) findViewById(R.id.lblHeading);
            lblHeading.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    final int DRAWABLE_RIGHT = 2;
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (event.getRawX() >= (lblHeading.getRight() - lblHeading.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                            AlertDialog.Builder adb = new AlertDialog.Builder(IGA_list.this);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(IGA_list.this);
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
                    IDbundle.putString("RND", "");
                    IDbundle.putString("SuchanaID", "");
                    Intent intent = new Intent(getApplicationContext(), IGA.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtras(IDbundle);
                    getApplicationContext().startActivity(intent);

                }
            });


            DataSearch(RND, SUCHANAID);


        } catch (Exception e) {
            Connection.MessageBox(IGA_list.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String RND, String SuchanaID) {
        try {

            IGA_DataModel d = new IGA_DataModel();
            String SQL = "Select * from " + TableName + "  Where RND='" + RND + "' and SuchanaID='" + SuchanaID + "'";
            List<IGA_DataModel> data = d.SelectAll(this, SQL);
            dataList.clear();

            dataAdapter = null;

            ListView list = (ListView) findViewById(R.id.lstData);
            HashMap<String, String> map;

            for (IGA_DataModel item : data) {
                map = new HashMap<String, String>();
                map.put("RND", item.getRND());
                map.put("SuchanaID", item.getSuchanaID());
                map.put("H18b1a", item.getH18b1a());
                map.put("H18b2a1", item.getH18b2a1());
                map.put("H18b2a2", item.getH18b2a2());
                map.put("H18b2a3", item.getH18b2a3());
                map.put("H18b2a4", item.getH18b2a4());
                map.put("H18b2a5", item.getH18b2a5());
                map.put("H18b2a6", item.getH18b2a6());
                map.put("H18b2a7", item.getH18b2a7());
                map.put("H18b2a7X", item.getH18b2a7X());
                map.put("H18b1b", item.getH18b1b());
                map.put("H18b2b1", item.getH18b2b1());
                map.put("H18b2b2", item.getH18b2b2());
                map.put("H18b2b3", item.getH18b2b3());
                map.put("H18b2b4", item.getH18b2b4());
                map.put("H18b2b5", item.getH18b2b5());
                map.put("H18b2b6", item.getH18b2b6());
                map.put("H18b2b7", item.getH18b2b7());
                map.put("H18b2b7X", item.getH18b2b7X());
                map.put("H18b1c", item.getH18b1c());
                map.put("H18b2c1", item.getH18b2c1());
                map.put("H18b2c2", item.getH18b2c2());
                map.put("H18b2c3", item.getH18b2c3());
                map.put("H18b2c4", item.getH18b2c4());
                map.put("H18b2c5", item.getH18b2c5());
                map.put("H18b2c6", item.getH18b2c6());
                map.put("H18b2c7", item.getH18b2c7());
                map.put("H18b2c7X", item.getH18b2c7X());
                map.put("H18b1d", item.getH18b1d());
                map.put("H18b2d1", item.getH18b2d1());
                map.put("H18b2d2", item.getH18b2d2());
                map.put("H18b2d3", item.getH18b2d3());
                map.put("H18b2d4", item.getH18b2d4());
                map.put("H18b2d5", item.getH18b2d5());
                map.put("H18b2d6", item.getH18b2d6());
                map.put("H18b2d7", item.getH18b2d7());
                map.put("H18b2d7X", item.getH18b2d7X());
                map.put("H18b1e", item.getH18b1e());
                map.put("H18b2e1", item.getH18b2e1());
                map.put("H18b2e2", item.getH18b2e2());
                map.put("H18b2e3", item.getH18b2e3());
                map.put("H18b2e4", item.getH18b2e4());
                map.put("H18b2e5", item.getH18b2e5());
                map.put("H18b2e6", item.getH18b2e6());
                map.put("H18b2e7", item.getH18b2e7());
                map.put("H18b2e7X", item.getH18b2e7X());
                map.put("H18b1f", item.getH18b1f());
                map.put("H18b2f1", item.getH18b2f1());
                map.put("H18b2f2", item.getH18b2f2());
                map.put("H18b2f3", item.getH18b2f3());
                map.put("H18b2f4", item.getH18b2f4());
                map.put("H18b2f5", item.getH18b2f5());
                map.put("H18b2f6", item.getH18b2f6());
                map.put("H18b2f7", item.getH18b2f7());
                map.put("H18b2f7X", item.getH18b2f7X());
                map.put("H18b1g", item.getH18b1g());
                map.put("H18b2g1", item.getH18b2g1());
                map.put("H18b2g2", item.getH18b2g2());
                map.put("H18b2g3", item.getH18b2g3());
                map.put("H18b2g4", item.getH18b2g4());
                map.put("H18b2g5", item.getH18b2g5());
                map.put("H18b2g6", item.getH18b2g6());
                map.put("H18b2g7", item.getH18b2g7());
                map.put("H18b2g7X", item.getH18b2g7X());
                map.put("H18b1h", item.getH18b1h());
                map.put("H18b2h1", item.getH18b2h1());
                map.put("H18b2h2", item.getH18b2h2());
                map.put("H18b2h3", item.getH18b2h3());
                map.put("H18b2h4", item.getH18b2h4());
                map.put("H18b2h5", item.getH18b2h5());
                map.put("H18b2h6", item.getH18b2h6());
                map.put("H18b2h7", item.getH18b2h7());
                map.put("H18b2h7X", item.getH18b2h7X());
                map.put("H18b1i", item.getH18b1i());
                map.put("H18b2i1", item.getH18b2i1());
                map.put("H18b2i2", item.getH18b2i2());
                map.put("H18b2i3", item.getH18b2i3());
                map.put("H18b2i4", item.getH18b2i4());
                map.put("H18b2i5", item.getH18b2i5());
                map.put("H18b2i5X", item.getH18b2i5X());
                map.put("H18b1j", item.getH18b1j());
                map.put("H18b2j1", item.getH18b2j1());
                map.put("H18b2j2", item.getH18b2j2());
                map.put("H18b2j3", item.getH18b2j3());
                map.put("H18b2j4", item.getH18b2j4());
                map.put("H18b2j5", item.getH18b2j5());
                map.put("H18b2j5X", item.getH18b2j5X());
                map.put("H18b1k", item.getH18b1k());
                map.put("H18b2kX", item.getH18b2kX());
                dataList.add(map);
            }
            dataAdapter = new SimpleAdapter(IGA_list.this, dataList, R.layout.iga_list, new String[]{"rowsec"},
                    new int[]{R.id.secListRow});
            list.setAdapter(new DataListAdapter(this, dataAdapter));
        } catch (Exception e) {
            Connection.MessageBox(IGA_list.this, e.getMessage());
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
                convertView = inflater.inflate(R.layout.iga_row, null);
            }
            LinearLayout secListRow = (LinearLayout) convertView.findViewById(R.id.secListRow);

            final TextView RND = (TextView) convertView.findViewById(R.id.RND);
            final TextView SuchanaID = (TextView) convertView.findViewById(R.id.SuchanaID);
            final TextView H18b1a = (TextView) convertView.findViewById(R.id.H18b1a);
            final TextView H18b2a1 = (TextView) convertView.findViewById(R.id.H18b2a1);
            final TextView H18b2a2 = (TextView) convertView.findViewById(R.id.H18b2a2);
            final TextView H18b2a3 = (TextView) convertView.findViewById(R.id.H18b2a3);
            final TextView H18b2a4 = (TextView) convertView.findViewById(R.id.H18b2a4);
            final TextView H18b2a5 = (TextView) convertView.findViewById(R.id.H18b2a5);
            final TextView H18b2a6 = (TextView) convertView.findViewById(R.id.H18b2a6);
            final TextView H18b2a7 = (TextView) convertView.findViewById(R.id.H18b2a7);
            final TextView H18b2a7X = (TextView) convertView.findViewById(R.id.H18b2a7X);
            final TextView H18b1b = (TextView) convertView.findViewById(R.id.H18b1b);
            final TextView H18b2b1 = (TextView) convertView.findViewById(R.id.H18b2b1);
            final TextView H18b2b2 = (TextView) convertView.findViewById(R.id.H18b2b2);
            final TextView H18b2b3 = (TextView) convertView.findViewById(R.id.H18b2b3);
            final TextView H18b2b4 = (TextView) convertView.findViewById(R.id.H18b2b4);
            final TextView H18b2b5 = (TextView) convertView.findViewById(R.id.H18b2b5);
            final TextView H18b2b6 = (TextView) convertView.findViewById(R.id.H18b2b6);
            final TextView H18b2b7 = (TextView) convertView.findViewById(R.id.H18b2b7);
            final TextView H18b2b7X = (TextView) convertView.findViewById(R.id.H18b2b7X);
            final TextView H18b1c = (TextView) convertView.findViewById(R.id.H18b1c);
            final TextView H18b2c1 = (TextView) convertView.findViewById(R.id.H18b2c1);
            final TextView H18b2c2 = (TextView) convertView.findViewById(R.id.H18b2c2);
            final TextView H18b2c3 = (TextView) convertView.findViewById(R.id.H18b2c3);
            final TextView H18b2c4 = (TextView) convertView.findViewById(R.id.H18b2c4);
            final TextView H18b2c5 = (TextView) convertView.findViewById(R.id.H18b2c5);
            final TextView H18b2c6 = (TextView) convertView.findViewById(R.id.H18b2c6);
            final TextView H18b2c7 = (TextView) convertView.findViewById(R.id.H18b2c7);
            final TextView H18b2c7X = (TextView) convertView.findViewById(R.id.H18b2c7X);
            final TextView H18b1d = (TextView) convertView.findViewById(R.id.H18b1d);
            final TextView H18b2d1 = (TextView) convertView.findViewById(R.id.H18b2d1);
            final TextView H18b2d2 = (TextView) convertView.findViewById(R.id.H18b2d2);
            final TextView H18b2d3 = (TextView) convertView.findViewById(R.id.H18b2d3);
            final TextView H18b2d4 = (TextView) convertView.findViewById(R.id.H18b2d4);
            final TextView H18b2d5 = (TextView) convertView.findViewById(R.id.H18b2d5);
            final TextView H18b2d6 = (TextView) convertView.findViewById(R.id.H18b2d6);
            final TextView H18b2d7 = (TextView) convertView.findViewById(R.id.H18b2d7);
            final TextView H18b2d7X = (TextView) convertView.findViewById(R.id.H18b2d7X);
            final TextView H18b1e = (TextView) convertView.findViewById(R.id.H18b1e);
            final TextView H18b2e1 = (TextView) convertView.findViewById(R.id.H18b2e1);
            final TextView H18b2e2 = (TextView) convertView.findViewById(R.id.H18b2e2);
            final TextView H18b2e3 = (TextView) convertView.findViewById(R.id.H18b2e3);
            final TextView H18b2e4 = (TextView) convertView.findViewById(R.id.H18b2e4);
            final TextView H18b2e5 = (TextView) convertView.findViewById(R.id.H18b2e5);
            final TextView H18b2e6 = (TextView) convertView.findViewById(R.id.H18b2e6);
            final TextView H18b2e7 = (TextView) convertView.findViewById(R.id.H18b2e7);
            final TextView H18b2e7X = (TextView) convertView.findViewById(R.id.H18b2e7X);
            final TextView H18b1f = (TextView) convertView.findViewById(R.id.H18b1f);
            final TextView H18b2f1 = (TextView) convertView.findViewById(R.id.H18b2f1);
            final TextView H18b2f2 = (TextView) convertView.findViewById(R.id.H18b2f2);
            final TextView H18b2f3 = (TextView) convertView.findViewById(R.id.H18b2f3);
            final TextView H18b2f4 = (TextView) convertView.findViewById(R.id.H18b2f4);
            final TextView H18b2f5 = (TextView) convertView.findViewById(R.id.H18b2f5);
            final TextView H18b2f6 = (TextView) convertView.findViewById(R.id.H18b2f6);
            final TextView H18b2f7 = (TextView) convertView.findViewById(R.id.H18b2f7);
            final TextView H18b2f7X = (TextView) convertView.findViewById(R.id.H18b2f7X);
            final TextView H18b1g = (TextView) convertView.findViewById(R.id.H18b1g);
            final TextView H18b2g1 = (TextView) convertView.findViewById(R.id.H18b2g1);
            final TextView H18b2g2 = (TextView) convertView.findViewById(R.id.H18b2g2);
            final TextView H18b2g3 = (TextView) convertView.findViewById(R.id.H18b2g3);
            final TextView H18b2g4 = (TextView) convertView.findViewById(R.id.H18b2g4);
            final TextView H18b2g5 = (TextView) convertView.findViewById(R.id.H18b2g5);
            final TextView H18b2g6 = (TextView) convertView.findViewById(R.id.H18b2g6);
            final TextView H18b2g7 = (TextView) convertView.findViewById(R.id.H18b2g7);
            final TextView H18b2g7X = (TextView) convertView.findViewById(R.id.H18b2g7X);
            final TextView H18b1h = (TextView) convertView.findViewById(R.id.H18b1h);
            final TextView H18b2h1 = (TextView) convertView.findViewById(R.id.H18b2h1);
            final TextView H18b2h2 = (TextView) convertView.findViewById(R.id.H18b2h2);
            final TextView H18b2h3 = (TextView) convertView.findViewById(R.id.H18b2h3);
            final TextView H18b2h4 = (TextView) convertView.findViewById(R.id.H18b2h4);
            final TextView H18b2h5 = (TextView) convertView.findViewById(R.id.H18b2h5);
            final TextView H18b2h6 = (TextView) convertView.findViewById(R.id.H18b2h6);
            final TextView H18b2h7 = (TextView) convertView.findViewById(R.id.H18b2h7);
            final TextView H18b2h7X = (TextView) convertView.findViewById(R.id.H18b2h7X);
            final TextView H18b1i = (TextView) convertView.findViewById(R.id.H18b1i);
            final TextView H18b2i1 = (TextView) convertView.findViewById(R.id.H18b2i1);
            final TextView H18b2i2 = (TextView) convertView.findViewById(R.id.H18b2i2);
            final TextView H18b2i3 = (TextView) convertView.findViewById(R.id.H18b2i3);
            final TextView H18b2i4 = (TextView) convertView.findViewById(R.id.H18b2i4);
            final TextView H18b2i5 = (TextView) convertView.findViewById(R.id.H18b2i5);
            final TextView H18b2i5X = (TextView) convertView.findViewById(R.id.H18b2i5X);
            final TextView H18b1j = (TextView) convertView.findViewById(R.id.H18b1j);
            final TextView H18b2j1 = (TextView) convertView.findViewById(R.id.H18b2j1);
            final TextView H18b2j2 = (TextView) convertView.findViewById(R.id.H18b2j2);
            final TextView H18b2j3 = (TextView) convertView.findViewById(R.id.H18b2j3);
            final TextView H18b2j4 = (TextView) convertView.findViewById(R.id.H18b2j4);
            final TextView H18b2j5 = (TextView) convertView.findViewById(R.id.H18b2j5);
            final TextView H18b2j5X = (TextView) convertView.findViewById(R.id.H18b2j5X);
            final TextView H18b1k = (TextView) convertView.findViewById(R.id.H18b1k);
            final TextView H18b2kX = (TextView) convertView.findViewById(R.id.H18b2kX);

            final HashMap<String, String> o = (HashMap<String, String>) dataAdap.getItem(position);
            RND.setText(o.get("RND"));
            SuchanaID.setText(o.get("SuchanaID"));
            H18b1a.setText(o.get("H18b1a"));
            H18b2a1.setText(o.get("H18b2a1"));
            H18b2a2.setText(o.get("H18b2a2"));
            H18b2a3.setText(o.get("H18b2a3"));
            H18b2a4.setText(o.get("H18b2a4"));
            H18b2a5.setText(o.get("H18b2a5"));
            H18b2a6.setText(o.get("H18b2a6"));
            H18b2a7.setText(o.get("H18b2a7"));
            H18b2a7X.setText(o.get("H18b2a7X"));
            H18b1b.setText(o.get("H18b1b"));
            H18b2b1.setText(o.get("H18b2b1"));
            H18b2b2.setText(o.get("H18b2b2"));
            H18b2b3.setText(o.get("H18b2b3"));
            H18b2b4.setText(o.get("H18b2b4"));
            H18b2b5.setText(o.get("H18b2b5"));
            H18b2b6.setText(o.get("H18b2b6"));
            H18b2b7.setText(o.get("H18b2b7"));
            H18b2b7X.setText(o.get("H18b2b7X"));
            H18b1c.setText(o.get("H18b1c"));
            H18b2c1.setText(o.get("H18b2c1"));
            H18b2c2.setText(o.get("H18b2c2"));
            H18b2c3.setText(o.get("H18b2c3"));
            H18b2c4.setText(o.get("H18b2c4"));
            H18b2c5.setText(o.get("H18b2c5"));
            H18b2c6.setText(o.get("H18b2c6"));
            H18b2c7.setText(o.get("H18b2c7"));
            H18b2c7X.setText(o.get("H18b2c7X"));
            H18b1d.setText(o.get("H18b1d"));
            H18b2d1.setText(o.get("H18b2d1"));
            H18b2d2.setText(o.get("H18b2d2"));
            H18b2d3.setText(o.get("H18b2d3"));
            H18b2d4.setText(o.get("H18b2d4"));
            H18b2d5.setText(o.get("H18b2d5"));
            H18b2d6.setText(o.get("H18b2d6"));
            H18b2d7.setText(o.get("H18b2d7"));
            H18b2d7X.setText(o.get("H18b2d7X"));
            H18b1e.setText(o.get("H18b1e"));
            H18b2e1.setText(o.get("H18b2e1"));
            H18b2e2.setText(o.get("H18b2e2"));
            H18b2e3.setText(o.get("H18b2e3"));
            H18b2e4.setText(o.get("H18b2e4"));
            H18b2e5.setText(o.get("H18b2e5"));
            H18b2e6.setText(o.get("H18b2e6"));
            H18b2e7.setText(o.get("H18b2e7"));
            H18b2e7X.setText(o.get("H18b2e7X"));
            H18b1f.setText(o.get("H18b1f"));
            H18b2f1.setText(o.get("H18b2f1"));
            H18b2f2.setText(o.get("H18b2f2"));
            H18b2f3.setText(o.get("H18b2f3"));
            H18b2f4.setText(o.get("H18b2f4"));
            H18b2f5.setText(o.get("H18b2f5"));
            H18b2f6.setText(o.get("H18b2f6"));
            H18b2f7.setText(o.get("H18b2f7"));
            H18b2f7X.setText(o.get("H18b2f7X"));
            H18b1g.setText(o.get("H18b1g"));
            H18b2g1.setText(o.get("H18b2g1"));
            H18b2g2.setText(o.get("H18b2g2"));
            H18b2g3.setText(o.get("H18b2g3"));
            H18b2g4.setText(o.get("H18b2g4"));
            H18b2g5.setText(o.get("H18b2g5"));
            H18b2g6.setText(o.get("H18b2g6"));
            H18b2g7.setText(o.get("H18b2g7"));
            H18b2g7X.setText(o.get("H18b2g7X"));
            H18b1h.setText(o.get("H18b1h"));
            H18b2h1.setText(o.get("H18b2h1"));
            H18b2h2.setText(o.get("H18b2h2"));
            H18b2h3.setText(o.get("H18b2h3"));
            H18b2h4.setText(o.get("H18b2h4"));
            H18b2h5.setText(o.get("H18b2h5"));
            H18b2h6.setText(o.get("H18b2h6"));
            H18b2h7.setText(o.get("H18b2h7"));
            H18b2h7X.setText(o.get("H18b2h7X"));
            H18b1i.setText(o.get("H18b1i"));
            H18b2i1.setText(o.get("H18b2i1"));
            H18b2i2.setText(o.get("H18b2i2"));
            H18b2i3.setText(o.get("H18b2i3"));
            H18b2i4.setText(o.get("H18b2i4"));
            H18b2i5.setText(o.get("H18b2i5"));
            H18b2i5X.setText(o.get("H18b2i5X"));
            H18b1j.setText(o.get("H18b1j"));
            H18b2j1.setText(o.get("H18b2j1"));
            H18b2j2.setText(o.get("H18b2j2"));
            H18b2j3.setText(o.get("H18b2j3"));
            H18b2j4.setText(o.get("H18b2j4"));
            H18b2j5.setText(o.get("H18b2j5"));
            H18b2j5X.setText(o.get("H18b2j5X"));
            H18b1k.setText(o.get("H18b1k"));
            H18b2kX.setText(o.get("H18b2kX"));

            secListRow.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    //Write your code here
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("RND", o.get("RND"));
                    IDbundle.putString("SuchanaID", o.get("SuchanaID"));
                    Intent f1;
                    f1 = new Intent(getApplicationContext(), IGA.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);
                }
            });


            return convertView;
        }
    }


}