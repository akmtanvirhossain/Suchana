package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Destruction1_list" android:label="Destruction1: List" />

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

public class Destruction1_list extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    static String H14A = "";
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
            setContentView(R.layout.destruction1_list);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();

            TableName = "Destruction1";
            lblHeading = (TextView) findViewById(R.id.lblHeading);
            lblHeading.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    final int DRAWABLE_RIGHT = 2;
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (event.getRawX() >= (lblHeading.getRight() - lblHeading.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                            AlertDialog.Builder adb = new AlertDialog.Builder(Destruction1_list.this);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(Destruction1_list.this);
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
                    DataSearch(RND, SUCHANAID, H14A);

                }
            });

            btnAdd = (Button) findViewById(R.id.btnAdd);
            btnAdd.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", "");
                    IDbundle.putString("SuchanaID", "");
                    IDbundle.putString("H14a", "");
                    Intent intent = new Intent(getApplicationContext(), Destruction1.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtras(IDbundle);
                    getApplicationContext().startActivity(intent);

                }
            });


            DataSearch(RND, SUCHANAID, H14A);


        } catch (Exception e) {
            Connection.MessageBox(Destruction1_list.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID, String H14a) {
        try {

            Destruction1_DataModel d = new Destruction1_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "' and H14a='" + H14a + "'";
            List<Destruction1_DataModel> data = d.SelectAll(this, SQL);
            dataList.clear();

            dataAdapter = null;

            ListView list = (ListView) findViewById(R.id.lstData);
            HashMap<String, String> map;

            for (Destruction1_DataModel item : data) {
                map = new HashMap<String, String>();
                map.put("Rnd", item.getRnd());
                map.put("SuchanaID", item.getSuchanaID());
                map.put("H14a", item.getH14a());
                map.put("H14ax", item.getH14ax());
                map.put("H14a1", item.getH14a1());
                map.put("H14a2", item.getH14a2());
                map.put("H14a3a", item.getH14a3a());
                map.put("H14a3b", item.getH14a3b());
                map.put("H14a3c", item.getH14a3c());
                map.put("H14a3d", item.getH14a3d());
                map.put("H14a3e", item.getH14a3e());
                map.put("H14a3f", item.getH14a3f());
                map.put("H14a3g", item.getH14a3g());
                map.put("H14a3h", item.getH14a3h());
                map.put("H14a3i", item.getH14a3i());
                map.put("H14a3j", item.getH14a3j());
                map.put("H14a3k", item.getH14a3k());
                map.put("H14a3l", item.getH14a3l());
                map.put("H14a3m", item.getH14a3m());
                map.put("H14a3x", item.getH14a3x());
                map.put("H14a3x1", item.getH14a3x1());
                map.put("H14a3x2", item.getH14a3x2());
                map.put("H14a3x3", item.getH14a3x3());
                map.put("H14a4a", item.getH14a4a());
                map.put("H14a4b", item.getH14a4b());
                map.put("H14a4c", item.getH14a4c());
                map.put("H14a4d", item.getH14a4d());
                map.put("H14a4e", item.getH14a4e());
                map.put("H14a4f", item.getH14a4f());
                map.put("H14a4g", item.getH14a4g());
                map.put("H14a4h", item.getH14a4h());
                map.put("H14a4i", item.getH14a4i());
                map.put("H14a4j", item.getH14a4j());
                map.put("H14a4k", item.getH14a4k());
                map.put("H14a4l", item.getH14a4l());
                map.put("H14a4m", item.getH14a4m());
                map.put("H14a14n", item.getH14a14n());
                map.put("H14a4x", item.getH14a4x());
                map.put("H14a4x1", item.getH14a4x1());
                map.put("H14a4x2", item.getH14a4x2());
                map.put("H14a4x3", item.getH14a4x3());
                dataList.add(map);
            }
            dataAdapter = new SimpleAdapter(Destruction1_list.this, dataList, R.layout.destruction1_list, new String[]{"rowsec"},
                    new int[]{R.id.secListRow});
            list.setAdapter(new DataListAdapter(this, dataAdapter));
        } catch (Exception e) {
            Connection.MessageBox(Destruction1_list.this, e.getMessage());
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
                convertView = inflater.inflate(R.layout.destruction1_row, null);
            }
            LinearLayout secListRow = (LinearLayout) convertView.findViewById(R.id.secListRow);

            final TextView Rnd = (TextView) convertView.findViewById(R.id.Rnd);
            final TextView SuchanaID = (TextView) convertView.findViewById(R.id.SuchanaID);
            final TextView H14a = (TextView) convertView.findViewById(R.id.H14a);
            final TextView H14ax = (TextView) convertView.findViewById(R.id.H14ax);
            final TextView H14a1 = (TextView) convertView.findViewById(R.id.H14a1);
            final TextView H14a2 = (TextView) convertView.findViewById(R.id.H14a2);
            final TextView H14a3a = (TextView) convertView.findViewById(R.id.H14a3a);
            final TextView H14a3b = (TextView) convertView.findViewById(R.id.H14a3b);
            final TextView H14a3c = (TextView) convertView.findViewById(R.id.H14a3c);
            final TextView H14a3d = (TextView) convertView.findViewById(R.id.H14a3d);
            final TextView H14a3e = (TextView) convertView.findViewById(R.id.H14a3e);
            final TextView H14a3f = (TextView) convertView.findViewById(R.id.H14a3f);
            final TextView H14a3g = (TextView) convertView.findViewById(R.id.H14a3g);
            final TextView H14a3h = (TextView) convertView.findViewById(R.id.H14a3h);
            final TextView H14a3i = (TextView) convertView.findViewById(R.id.H14a3i);
            final TextView H14a3j = (TextView) convertView.findViewById(R.id.H14a3j);
            final TextView H14a3k = (TextView) convertView.findViewById(R.id.H14a3k);
            final TextView H14a3l = (TextView) convertView.findViewById(R.id.H14a3l);
            final TextView H14a3m = (TextView) convertView.findViewById(R.id.H14a3m);
            final TextView H14a3x = (TextView) convertView.findViewById(R.id.H14a3x);
            final TextView H14a3x1 = (TextView) convertView.findViewById(R.id.H14a3x1);
            final TextView H14a3x2 = (TextView) convertView.findViewById(R.id.H14a3x2);
            final TextView H14a3x3 = (TextView) convertView.findViewById(R.id.H14a3x3);
            final TextView H14a4a = (TextView) convertView.findViewById(R.id.H14a4a);
            final TextView H14a4b = (TextView) convertView.findViewById(R.id.H14a4b);
            final TextView H14a4c = (TextView) convertView.findViewById(R.id.H14a4c);
            final TextView H14a4d = (TextView) convertView.findViewById(R.id.H14a4d);
            final TextView H14a4e = (TextView) convertView.findViewById(R.id.H14a4e);
            final TextView H14a4f = (TextView) convertView.findViewById(R.id.H14a4f);
            final TextView H14a4g = (TextView) convertView.findViewById(R.id.H14a4g);
            final TextView H14a4h = (TextView) convertView.findViewById(R.id.H14a4h);
            final TextView H14a4i = (TextView) convertView.findViewById(R.id.H14a4i);
            final TextView H14a4j = (TextView) convertView.findViewById(R.id.H14a4j);
            final TextView H14a4k = (TextView) convertView.findViewById(R.id.H14a4k);
            final TextView H14a4l = (TextView) convertView.findViewById(R.id.H14a4l);
            final TextView H14a4m = (TextView) convertView.findViewById(R.id.H14a4m);
            final TextView H14a14n = (TextView) convertView.findViewById(R.id.H14a14n);
            final TextView H14a4x = (TextView) convertView.findViewById(R.id.H14a4x);
            final TextView H14a4x1 = (TextView) convertView.findViewById(R.id.H14a4x1);
            final TextView H14a4x2 = (TextView) convertView.findViewById(R.id.H14a4x2);
            final TextView H14a4x3 = (TextView) convertView.findViewById(R.id.H14a4x3);

            final HashMap<String, String> o = (HashMap<String, String>) dataAdap.getItem(position);
            Rnd.setText(o.get("Rnd"));
            SuchanaID.setText(o.get("SuchanaID"));
            H14a.setText(o.get("H14a"));
            H14ax.setText(o.get("H14ax"));
            H14a1.setText(o.get("H14a1"));
            H14a2.setText(o.get("H14a2"));
            H14a3a.setText(o.get("H14a3a"));
            H14a3b.setText(o.get("H14a3b"));
            H14a3c.setText(o.get("H14a3c"));
            H14a3d.setText(o.get("H14a3d"));
            H14a3e.setText(o.get("H14a3e"));
            H14a3f.setText(o.get("H14a3f"));
            H14a3g.setText(o.get("H14a3g"));
            H14a3h.setText(o.get("H14a3h"));
            H14a3i.setText(o.get("H14a3i"));
            H14a3j.setText(o.get("H14a3j"));
            H14a3k.setText(o.get("H14a3k"));
            H14a3l.setText(o.get("H14a3l"));
            H14a3m.setText(o.get("H14a3m"));
            H14a3x.setText(o.get("H14a3x"));
            H14a3x1.setText(o.get("H14a3x1"));
            H14a3x2.setText(o.get("H14a3x2"));
            H14a3x3.setText(o.get("H14a3x3"));
            H14a4a.setText(o.get("H14a4a"));
            H14a4b.setText(o.get("H14a4b"));
            H14a4c.setText(o.get("H14a4c"));
            H14a4d.setText(o.get("H14a4d"));
            H14a4e.setText(o.get("H14a4e"));
            H14a4f.setText(o.get("H14a4f"));
            H14a4g.setText(o.get("H14a4g"));
            H14a4h.setText(o.get("H14a4h"));
            H14a4i.setText(o.get("H14a4i"));
            H14a4j.setText(o.get("H14a4j"));
            H14a4k.setText(o.get("H14a4k"));
            H14a4l.setText(o.get("H14a4l"));
            H14a4m.setText(o.get("H14a4m"));
            H14a14n.setText(o.get("H14a14n"));
            H14a4x.setText(o.get("H14a4x"));
            H14a4x1.setText(o.get("H14a4x1"));
            H14a4x2.setText(o.get("H14a4x2"));
            H14a4x3.setText(o.get("H14a4x3"));

            secListRow.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    //Write your code here
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", o.get("Rnd"));
                    IDbundle.putString("SuchanaID", o.get("SuchanaID"));
                    IDbundle.putString("H14a", o.get("H14a"));
                    Intent f1;
                    f1 = new Intent(getApplicationContext(), Destruction1.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);
                }
            });


            return convertView;
        }
    }


}