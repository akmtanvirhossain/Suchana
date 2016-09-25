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

public class AssetB_list extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    static String H41A = "";
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
            setContentView(R.layout.assetb_list);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();

            TableName = "AssetB";
            lblHeading = (TextView) findViewById(R.id.lblHeading);
            lblHeading.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    final int DRAWABLE_RIGHT = 2;
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (event.getRawX() >= (lblHeading.getRight() - lblHeading.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                            AlertDialog.Builder adb = new AlertDialog.Builder(AssetB_list.this);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(AssetB_list.this);
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
                    DataSearch(RND, SUCHANAID, H41A);

                }
            });

            btnAdd = (Button) findViewById(R.id.btnAdd);
            btnAdd.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", "");
                    IDbundle.putString("SuchanaID", "");
                    IDbundle.putString("H41a", "");
                    Intent intent = new Intent(getApplicationContext(), AssetB.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtras(IDbundle);
                    getApplicationContext().startActivity(intent);

                }
            });


            DataSearch(RND, SUCHANAID, H41A);


        } catch (Exception e) {
            Connection.MessageBox(AssetB_list.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID, String H41a) {
        try {

            AssetB_DataModel d = new AssetB_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "' and H41a='" + H41a + "'";
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
            final TextView MSlNo = (TextView) convertView.findViewById(R.id.MSlNo);
            final TextView H41a = (TextView) convertView.findViewById(R.id.H41a);
            final TextView H41aX = (TextView) convertView.findViewById(R.id.H41aX);
            final TextView H41b = (TextView) convertView.findViewById(R.id.H41b);
            final TextView H41c = (TextView) convertView.findViewById(R.id.H41c);
            final TextView H41d = (TextView) convertView.findViewById(R.id.H41d);
            final TextView H41e = (TextView) convertView.findViewById(R.id.H41e);
            final TextView H41eX = (TextView) convertView.findViewById(R.id.H41eX);
            final TextView H41f = (TextView) convertView.findViewById(R.id.H41f);
            final TextView H41fX = (TextView) convertView.findViewById(R.id.H41fX);
            final TextView H41g = (TextView) convertView.findViewById(R.id.H41g);
            final TextView H41h = (TextView) convertView.findViewById(R.id.H41h);
            final TextView H41i = (TextView) convertView.findViewById(R.id.H41i);
            final TextView H41j = (TextView) convertView.findViewById(R.id.H41j);
            final TextView H41k = (TextView) convertView.findViewById(R.id.H41k);
            final TextView H41kX = (TextView) convertView.findViewById(R.id.H41kX);
            final TextView H41l = (TextView) convertView.findViewById(R.id.H41l);
            final TextView H41m = (TextView) convertView.findViewById(R.id.H41m);
            final TextView H41n = (TextView) convertView.findViewById(R.id.H41n);
            final TextView H41o1 = (TextView) convertView.findViewById(R.id.H41o1);
            final TextView H41o2 = (TextView) convertView.findViewById(R.id.H41o2);
            final TextView H41o3 = (TextView) convertView.findViewById(R.id.H41o3);
            final TextView H41o4 = (TextView) convertView.findViewById(R.id.H41o4);
            final TextView H41o4X = (TextView) convertView.findViewById(R.id.H41o4X);

            final HashMap<String, String> o = (HashMap<String, String>) dataAdap.getItem(position);
            Rnd.setText(o.get("Rnd"));
            SuchanaID.setText(o.get("SuchanaID"));
            MSlNo.setText(o.get("MSlNo"));
            H41a.setText(o.get("H41a"));
            H41aX.setText(o.get("H41aX"));
            H41b.setText(o.get("H41b"));
            H41c.setText(o.get("H41c"));
            H41d.setText(o.get("H41d"));
            H41e.setText(o.get("H41e"));
            H41eX.setText(o.get("H41eX"));
            H41f.setText(o.get("H41f"));
            H41fX.setText(o.get("H41fX"));
            H41g.setText(o.get("H41g"));
            H41h.setText(o.get("H41h"));
            H41i.setText(o.get("H41i"));
            H41j.setText(o.get("H41j"));
            H41k.setText(o.get("H41k"));
            H41kX.setText(o.get("H41kX"));
            H41l.setText(o.get("H41l"));
            H41m.setText(o.get("H41m"));
            H41n.setText(o.get("H41n"));
            H41o1.setText(o.get("H41o1"));
            H41o2.setText(o.get("H41o2"));
            H41o3.setText(o.get("H41o3"));
            H41o4.setText(o.get("H41o4"));
            H41o4X.setText(o.get("H41o4X"));

            secListRow.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    //Write your code here
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", o.get("Rnd"));
                    IDbundle.putString("SuchanaID", o.get("SuchanaID"));
                    IDbundle.putString("H41a", o.get("H41a"));
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