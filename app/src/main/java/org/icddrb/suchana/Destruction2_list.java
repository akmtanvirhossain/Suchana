package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Destruction2_list" android:label="Destruction2: List" />

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

public class Destruction2_list extends Activity {
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
            setContentView(R.layout.destruction2_list);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();

            TableName = "Destruction2";
            lblHeading = (TextView) findViewById(R.id.lblHeading);
            lblHeading.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    final int DRAWABLE_RIGHT = 2;
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (event.getRawX() >= (lblHeading.getRight() - lblHeading.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                            AlertDialog.Builder adb = new AlertDialog.Builder(Destruction2_list.this);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(Destruction2_list.this);
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
                    Intent intent = new Intent(getApplicationContext(), Destruction2.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtras(IDbundle);
                    getApplicationContext().startActivity(intent);

                }
            });


            DataSearch(RND, SUCHANAID);


        } catch (Exception e) {
            Connection.MessageBox(Destruction2_list.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            Destruction2_DataModel d = new Destruction2_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<Destruction2_DataModel> data = d.SelectAll(this, SQL);
            dataList.clear();

            dataAdapter = null;

            ListView list = (ListView) findViewById(R.id.lstData);
            HashMap<String, String> map;

            for (Destruction2_DataModel item : data) {
                map = new HashMap<String, String>();
                map.put("Rnd", item.getRnd());
                map.put("SuchanaID", item.getSuchanaID());
                map.put("H14b1", item.getH14b1());
                map.put("H14b2", item.getH14b2());
                map.put("H14b3", item.getH14b3());
                map.put("H14b4", item.getH14b4());
                map.put("H14b5", item.getH14b5());
                map.put("H14b6", item.getH14b6());
                map.put("H14b7", item.getH14b7());
                map.put("H14b8", item.getH14b8());
                map.put("H14b8X", item.getH14b8X());
                map.put("H14c1", item.getH14c1());
                map.put("H14c1a", item.getH14c1a());
                map.put("H14c1b", item.getH14c1b());
                map.put("H14c1c", item.getH14c1c());
                map.put("H14c1d", item.getH14c1d());
                map.put("H14c1e", item.getH14c1e());
                map.put("H14c1f", item.getH14c1f());
                map.put("H14c1g", item.getH14c1g());
                map.put("H14c1h", item.getH14c1h());
                map.put("H14c1i", item.getH14c1i());
                map.put("H14c1j", item.getH14c1j());
                map.put("H14c1k", item.getH14c1k());
                map.put("H14c1l", item.getH14c1l());
                map.put("H14c1m", item.getH14c1m());
                map.put("H14c1n", item.getH14c1n());
                map.put("H14c1o", item.getH14c1o());
                map.put("H14c1p", item.getH14c1p());
                map.put("H14c1q", item.getH14c1q());
                map.put("H14c1r", item.getH14c1r());
                map.put("H14c1s", item.getH14c1s());
                map.put("H14c1t", item.getH14c1t());
                map.put("H14c1x", item.getH14c1x());
                map.put("H14c1x1", item.getH14c1x1());
                dataList.add(map);
            }
            dataAdapter = new SimpleAdapter(Destruction2_list.this, dataList, R.layout.destruction2_list, new String[]{"rowsec"},
                    new int[]{R.id.secListRow});
            list.setAdapter(new DataListAdapter(this, dataAdapter));
        } catch (Exception e) {
            Connection.MessageBox(Destruction2_list.this, e.getMessage());
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
                convertView = inflater.inflate(R.layout.destruction2_row, null);
            }
            LinearLayout secListRow = (LinearLayout) convertView.findViewById(R.id.secListRow);

            final TextView Rnd = (TextView) convertView.findViewById(R.id.Rnd);
            final TextView SuchanaID = (TextView) convertView.findViewById(R.id.SuchanaID);
            final TextView H14b1 = (TextView) convertView.findViewById(R.id.H14b1);
            final TextView H14b2 = (TextView) convertView.findViewById(R.id.H14b2);
            final TextView H14b3 = (TextView) convertView.findViewById(R.id.H14b3);
            final TextView H14b4 = (TextView) convertView.findViewById(R.id.H14b4);
            final TextView H14b5 = (TextView) convertView.findViewById(R.id.H14b5);
            final TextView H14b6 = (TextView) convertView.findViewById(R.id.H14b6);
            final TextView H14b7 = (TextView) convertView.findViewById(R.id.H14b7);
            final TextView H14b8 = (TextView) convertView.findViewById(R.id.H14b8);
            final TextView H14b8X = (TextView) convertView.findViewById(R.id.H14b8X);
            final TextView H14c1 = (TextView) convertView.findViewById(R.id.H14c1);
            final TextView H14c1a = (TextView) convertView.findViewById(R.id.H14c1a);
            final TextView H14c1b = (TextView) convertView.findViewById(R.id.H14c1b);
            final TextView H14c1c = (TextView) convertView.findViewById(R.id.H14c1c);
            final TextView H14c1d = (TextView) convertView.findViewById(R.id.H14c1d);
            final TextView H14c1e = (TextView) convertView.findViewById(R.id.H14c1e);
            final TextView H14c1f = (TextView) convertView.findViewById(R.id.H14c1f);
            final TextView H14c1g = (TextView) convertView.findViewById(R.id.H14c1g);
            final TextView H14c1h = (TextView) convertView.findViewById(R.id.H14c1h);
            final TextView H14c1i = (TextView) convertView.findViewById(R.id.H14c1i);
            final TextView H14c1j = (TextView) convertView.findViewById(R.id.H14c1j);
            final TextView H14c1k = (TextView) convertView.findViewById(R.id.H14c1k);
            final TextView H14c1l = (TextView) convertView.findViewById(R.id.H14c1l);
            final TextView H14c1m = (TextView) convertView.findViewById(R.id.H14c1m);
            final TextView H14c1n = (TextView) convertView.findViewById(R.id.H14c1n);
            final TextView H14c1o = (TextView) convertView.findViewById(R.id.H14c1o);
            final TextView H14c1p = (TextView) convertView.findViewById(R.id.H14c1p);
            final TextView H14c1q = (TextView) convertView.findViewById(R.id.H14c1q);
            final TextView H14c1r = (TextView) convertView.findViewById(R.id.H14c1r);
            final TextView H14c1s = (TextView) convertView.findViewById(R.id.H14c1s);
            final TextView H14c1t = (TextView) convertView.findViewById(R.id.H14c1t);
            final TextView H14c1x = (TextView) convertView.findViewById(R.id.H14c1x);
            final TextView H14c1x1 = (TextView) convertView.findViewById(R.id.H14c1x1);

            final HashMap<String, String> o = (HashMap<String, String>) dataAdap.getItem(position);
            Rnd.setText(o.get("Rnd"));
            SuchanaID.setText(o.get("SuchanaID"));
            H14b1.setText(o.get("H14b1"));
            H14b2.setText(o.get("H14b2"));
            H14b3.setText(o.get("H14b3"));
            H14b4.setText(o.get("H14b4"));
            H14b5.setText(o.get("H14b5"));
            H14b6.setText(o.get("H14b6"));
            H14b7.setText(o.get("H14b7"));
            H14b8.setText(o.get("H14b8"));
            H14b8X.setText(o.get("H14b8X"));
            H14c1.setText(o.get("H14c1"));
            H14c1a.setText(o.get("H14c1a"));
            H14c1b.setText(o.get("H14c1b"));
            H14c1c.setText(o.get("H14c1c"));
            H14c1d.setText(o.get("H14c1d"));
            H14c1e.setText(o.get("H14c1e"));
            H14c1f.setText(o.get("H14c1f"));
            H14c1g.setText(o.get("H14c1g"));
            H14c1h.setText(o.get("H14c1h"));
            H14c1i.setText(o.get("H14c1i"));
            H14c1j.setText(o.get("H14c1j"));
            H14c1k.setText(o.get("H14c1k"));
            H14c1l.setText(o.get("H14c1l"));
            H14c1m.setText(o.get("H14c1m"));
            H14c1n.setText(o.get("H14c1n"));
            H14c1o.setText(o.get("H14c1o"));
            H14c1p.setText(o.get("H14c1p"));
            H14c1q.setText(o.get("H14c1q"));
            H14c1r.setText(o.get("H14c1r"));
            H14c1s.setText(o.get("H14c1s"));
            H14c1t.setText(o.get("H14c1t"));
            H14c1x.setText(o.get("H14c1x"));
            H14c1x1.setText(o.get("H14c1x1"));

            secListRow.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    //Write your code here
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", o.get("Rnd"));
                    IDbundle.putString("SuchanaID", o.get("SuchanaID"));
                    Intent f1;
                    f1 = new Intent(getApplicationContext(), Destruction2.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);
                }
            });


            return convertView;
        }
    }


}