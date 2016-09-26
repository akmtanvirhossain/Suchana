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
            lblHeading = (TextView) findViewById(R.id.lblHeading);
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
            });

            Bundle IDbundle = new Bundle();
            IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaID");

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

            final TextView Rnd = (TextView) convertView.findViewById(R.id.Rnd);
            final TextView SuchanaID = (TextView) convertView.findViewById(R.id.SuchanaID);
            final TextView MSlNo = (TextView) convertView.findViewById(R.id.MSlNo);
            final TextView H151 = (TextView) convertView.findViewById(R.id.H151);
            final TextView Sl = (TextView) convertView.findViewById(R.id.Sl);
            final TextView H152a = (TextView) convertView.findViewById(R.id.H152a);
            final TextView H152bOth = (TextView) convertView.findViewById(R.id.H152bOth);
            final TextView H152b = (TextView) convertView.findViewById(R.id.H152b);
            final TextView H152c = (TextView) convertView.findViewById(R.id.H152c);
            final TextView H152d1 = (TextView) convertView.findViewById(R.id.H152d1);
            final TextView H152d2 = (TextView) convertView.findViewById(R.id.H152d2);
            final TextView H152e1 = (TextView) convertView.findViewById(R.id.H152e1);
            final TextView H152e2 = (TextView) convertView.findViewById(R.id.H152e2);
            final TextView H152f = (TextView) convertView.findViewById(R.id.H152f);
            final TextView H152g = (TextView) convertView.findViewById(R.id.H152g);
            final TextView H152h1 = (TextView) convertView.findViewById(R.id.H152h1);
            final TextView H152h2 = (TextView) convertView.findViewById(R.id.H152h2);
            final TextView H152i1 = (TextView) convertView.findViewById(R.id.H152i1);
            final TextView H152i2 = (TextView) convertView.findViewById(R.id.H152i2);
            final TextView H152j1 = (TextView) convertView.findViewById(R.id.H152j1);
            final TextView H152j2 = (TextView) convertView.findViewById(R.id.H152j2);
            final TextView H152k1 = (TextView) convertView.findViewById(R.id.H152k1);
            final TextView H152k2 = (TextView) convertView.findViewById(R.id.H152k2);

            final HashMap<String, String> o = (HashMap<String, String>) dataAdap.getItem(position);
            Rnd.setText(o.get("Rnd"));
            SuchanaID.setText(o.get("SuchanaID"));
            MSlNo.setText(o.get("MSlNo"));
            H151.setText(o.get("H151"));
            Sl.setText(o.get("Sl"));
            H152a.setText(o.get("H152a"));
            H152bOth.setText(o.get("H152bOth"));
            H152b.setText(o.get("H152b"));
            H152c.setText(o.get("H152c"));
            H152d1.setText(o.get("H152d1"));
            H152d2.setText(o.get("H152d2"));
            H152e1.setText(o.get("H152e1"));
            H152e2.setText(o.get("H152e2"));
            H152f.setText(o.get("H152f"));
            H152g.setText(o.get("H152g"));
            H152h1.setText(o.get("H152h1"));
            H152h2.setText(o.get("H152h2"));
            H152i1.setText(o.get("H152i1"));
            H152i2.setText(o.get("H152i2"));
            H152j1.setText(o.get("H152j1"));
            H152j2.setText(o.get("H152j2"));
            H152k1.setText(o.get("H152k1"));
            H152k2.setText(o.get("H152k2"));

            secListRow.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    //Write your code here
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