package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".HFIAS_list" android:label="HFIAS: List" />

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

public class HFIAS_list extends Activity {
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
            setContentView(R.layout.hfias_list);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();

            TableName = "HFIAS";
            lblHeading = (TextView) findViewById(R.id.lblHeading);
            lblHeading.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    final int DRAWABLE_RIGHT = 2;
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (event.getRawX() >= (lblHeading.getRight() - lblHeading.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                            AlertDialog.Builder adb = new AlertDialog.Builder(HFIAS_list.this);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(HFIAS_list.this);
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
                    Intent intent = new Intent(getApplicationContext(), HFIAS.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtras(IDbundle);
                    getApplicationContext().startActivity(intent);

                }
            });


            DataSearch(RND, SUCHANAID);


        } catch (Exception e) {
            Connection.MessageBox(HFIAS_list.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            HFIAS_DataModel d = new HFIAS_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<HFIAS_DataModel> data = d.SelectAll(this, SQL);
            dataList.clear();

            dataAdapter = null;

            ListView list = (ListView) findViewById(R.id.lstData);
            HashMap<String, String> map;

            for (HFIAS_DataModel item : data) {
                map = new HashMap<String, String>();
                map.put("Rnd", item.getRnd());
                map.put("SuchanaID", item.getSuchanaID());
                map.put("H121a", item.getH121a());
                map.put("H121b", item.getH121b());
                map.put("H122a", item.getH122a());
                map.put("H122b", item.getH122b());
                map.put("H123a", item.getH123a());
                map.put("H123b", item.getH123b());
                map.put("H124a", item.getH124a());
                map.put("H124b", item.getH124b());
                map.put("H125a", item.getH125a());
                map.put("H125b", item.getH125b());
                map.put("H126a", item.getH126a());
                map.put("H126b", item.getH126b());
                map.put("H127a", item.getH127a());
                map.put("H127b", item.getH127b());
                map.put("H128a", item.getH128a());
                map.put("H128b", item.getH128b());
                map.put("H129a", item.getH129a());
                map.put("H129b", item.getH129b());
                dataList.add(map);
            }
            dataAdapter = new SimpleAdapter(HFIAS_list.this, dataList, R.layout.hfias_list, new String[]{"rowsec"},
                    new int[]{R.id.secListRow});
            list.setAdapter(new DataListAdapter(this, dataAdapter));
        } catch (Exception e) {
            Connection.MessageBox(HFIAS_list.this, e.getMessage());
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
                convertView = inflater.inflate(R.layout.hfias_row, null);
            }
            LinearLayout secListRow = (LinearLayout) convertView.findViewById(R.id.secListRow);

            final TextView Rnd = (TextView) convertView.findViewById(R.id.Rnd);
            final TextView SuchanaID = (TextView) convertView.findViewById(R.id.SuchanaID);
            final TextView H121a = (TextView) convertView.findViewById(R.id.H121a);
            final TextView H121b = (TextView) convertView.findViewById(R.id.H121b);
            final TextView H122a = (TextView) convertView.findViewById(R.id.H122a);
            final TextView H122b = (TextView) convertView.findViewById(R.id.H122b);
            final TextView H123a = (TextView) convertView.findViewById(R.id.H123a);
            final TextView H123b = (TextView) convertView.findViewById(R.id.H123b);
            final TextView H124a = (TextView) convertView.findViewById(R.id.H124a);
            final TextView H124b = (TextView) convertView.findViewById(R.id.H124b);
            final TextView H125a = (TextView) convertView.findViewById(R.id.H125a);
            final TextView H125b = (TextView) convertView.findViewById(R.id.H125b);
            final TextView H126a = (TextView) convertView.findViewById(R.id.H126a);
            final TextView H126b = (TextView) convertView.findViewById(R.id.H126b);
            final TextView H127a = (TextView) convertView.findViewById(R.id.H127a);
            final TextView H127b = (TextView) convertView.findViewById(R.id.H127b);
            final TextView H128a = (TextView) convertView.findViewById(R.id.H128a);
            final TextView H128b = (TextView) convertView.findViewById(R.id.H128b);
            final TextView H129a = (TextView) convertView.findViewById(R.id.H129a);
            final TextView H129b = (TextView) convertView.findViewById(R.id.H129b);

            final HashMap<String, String> o = (HashMap<String, String>) dataAdap.getItem(position);
            Rnd.setText(o.get("Rnd"));
            SuchanaID.setText(o.get("SuchanaID"));
            H121a.setText(o.get("H121a"));
            H121b.setText(o.get("H121b"));
            H122a.setText(o.get("H122a"));
            H122b.setText(o.get("H122b"));
            H123a.setText(o.get("H123a"));
            H123b.setText(o.get("H123b"));
            H124a.setText(o.get("H124a"));
            H124b.setText(o.get("H124b"));
            H125a.setText(o.get("H125a"));
            H125b.setText(o.get("H125b"));
            H126a.setText(o.get("H126a"));
            H126b.setText(o.get("H126b"));
            H127a.setText(o.get("H127a"));
            H127b.setText(o.get("H127b"));
            H128a.setText(o.get("H128a"));
            H128b.setText(o.get("H128b"));
            H129a.setText(o.get("H129a"));
            H129b.setText(o.get("H129b"));

            secListRow.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    //Write your code here
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", o.get("Rnd"));
                    IDbundle.putString("SuchanaID", o.get("SuchanaID"));
                    Intent f1;
                    f1 = new Intent(getApplicationContext(), HFIAS.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);
                }
            });


            return convertView;
        }
    }


}