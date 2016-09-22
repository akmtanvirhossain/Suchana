package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".NGOWork_list" android:label="NGOWork: List" />

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

public class NGOWork_list extends Activity {
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
            setContentView(R.layout.ngowork_list);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();

            TableName = "NGOWork";
            lblHeading = (TextView) findViewById(R.id.lblHeading);
            lblHeading.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    final int DRAWABLE_RIGHT = 2;
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (event.getRawX() >= (lblHeading.getRight() - lblHeading.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                            AlertDialog.Builder adb = new AlertDialog.Builder(NGOWork_list.this);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(NGOWork_list.this);
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
                    Intent intent = new Intent(getApplicationContext(), NGOWork.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtras(IDbundle);
                    getApplicationContext().startActivity(intent);

                }
            });


            DataSearch(RND, SUCHANAID);


        } catch (Exception e) {
            Connection.MessageBox(NGOWork_list.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            NGOWork_DataModel d = new NGOWork_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<NGOWork_DataModel> data = d.SelectAll(this, SQL);
            dataList.clear();

            dataAdapter = null;

            ListView list = (ListView) findViewById(R.id.lstData);
            HashMap<String, String> map;

            for (NGOWork_DataModel item : data) {
                map = new HashMap<String, String>();
                map.put("Rnd", item.getRnd());
                map.put("SuchanaID", item.getSuchanaID());
                map.put("H161", item.getH161());
                map.put("H162", item.getH162());
                map.put("H163a", item.getH163a());
                map.put("H163b", item.getH163b());
                map.put("H163c", item.getH163c());
                map.put("H163d", item.getH163d());
                map.put("H163e", item.getH163e());
                map.put("H163f", item.getH163f());
                map.put("H163g", item.getH163g());
                map.put("H163h", item.getH163h());
                map.put("H163i", item.getH163i());
                map.put("H163x", item.getH163x());
                map.put("H163oth", item.getH163oth());
                map.put("H164", item.getH164());
                map.put("H165a", item.getH165a());
                map.put("H165b", item.getH165b());
                map.put("H165c", item.getH165c());
                map.put("H165d", item.getH165d());
                map.put("H165e", item.getH165e());
                map.put("H165f", item.getH165f());
                map.put("H165g", item.getH165g());
                map.put("H165h", item.getH165h());
                map.put("H165x", item.getH165x());
                map.put("H16x1", item.getH16x1());
                map.put("H165i", item.getH165i());
                map.put("H166", item.getH166());
                map.put("H167a", item.getH167a());
                map.put("H167b", item.getH167b());
                map.put("H167c", item.getH167c());
                map.put("H167d", item.getH167d());
                map.put("H167e", item.getH167e());
                map.put("H167f", item.getH167f());
                map.put("H167g", item.getH167g());
                map.put("H167i", item.getH167i());
                map.put("H167x", item.getH167x());
                map.put("H167x1", item.getH167x1());
                map.put("H168", item.getH168());
                map.put("H169", item.getH169());
                map.put("H1610", item.getH1610());
                map.put("H1611", item.getH1611());
                map.put("H1612a", item.getH1612a());
                map.put("H1612b", item.getH1612b());
                map.put("H1612c", item.getH1612c());
                map.put("H1612d", item.getH1612d());
                map.put("H1612e", item.getH1612e());
                map.put("H1612f", item.getH1612f());
                map.put("H1612g", item.getH1612g());
                map.put("H1612h", item.getH1612h());
                map.put("H1612i", item.getH1612i());
                map.put("H1612j", item.getH1612j());
                map.put("H1612x", item.getH1612x());
                map.put("H1612x1", item.getH1612x1());
                map.put("H1613", item.getH1613());
                map.put("H1614a", item.getH1614a());
                map.put("H1614b", item.getH1614b());
                map.put("H1614c", item.getH1614c());
                map.put("H1614d", item.getH1614d());
                map.put("H1614e", item.getH1614e());
                map.put("H1614f", item.getH1614f());
                map.put("H1614x", item.getH1614x());
                map.put("H1614x1", item.getH1614x1());
                map.put("H1615", item.getH1615());
                map.put("H1616a", item.getH1616a());
                map.put("H1616b", item.getH1616b());
                map.put("H1616c", item.getH1616c());
                map.put("H1616d", item.getH1616d());
                map.put("H1616e", item.getH1616e());
                map.put("H1616f", item.getH1616f());
                map.put("H1616g", item.getH1616g());
                map.put("H1616h", item.getH1616h());
                map.put("H1616i", item.getH1616i());
                map.put("H1616x", item.getH1616x());
                map.put("H1616x1", item.getH1616x1());
                dataList.add(map);
            }
            dataAdapter = new SimpleAdapter(NGOWork_list.this, dataList, R.layout.ngowork_list, new String[]{"rowsec"},
                    new int[]{R.id.secListRow});
            list.setAdapter(new DataListAdapter(this, dataAdapter));
        } catch (Exception e) {
            Connection.MessageBox(NGOWork_list.this, e.getMessage());
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
                convertView = inflater.inflate(R.layout.ngowork_row, null);
            }
            LinearLayout secListRow = (LinearLayout) convertView.findViewById(R.id.secListRow);

            final TextView Rnd = (TextView) convertView.findViewById(R.id.Rnd);
            final TextView SuchanaID = (TextView) convertView.findViewById(R.id.SuchanaID);
            final TextView H161 = (TextView) convertView.findViewById(R.id.H161);
            final TextView H162 = (TextView) convertView.findViewById(R.id.H162);
            final TextView H163a = (TextView) convertView.findViewById(R.id.H163a);
            final TextView H163b = (TextView) convertView.findViewById(R.id.H163b);
            final TextView H163c = (TextView) convertView.findViewById(R.id.H163c);
            final TextView H163d = (TextView) convertView.findViewById(R.id.H163d);
            final TextView H163e = (TextView) convertView.findViewById(R.id.H163e);
            final TextView H163f = (TextView) convertView.findViewById(R.id.H163f);
            final TextView H163g = (TextView) convertView.findViewById(R.id.H163g);
            final TextView H163h = (TextView) convertView.findViewById(R.id.H163h);
            final TextView H163i = (TextView) convertView.findViewById(R.id.H163i);
            final TextView H163x = (TextView) convertView.findViewById(R.id.H163x);
            final TextView H163oth = (TextView) convertView.findViewById(R.id.H163oth);
            final TextView H164 = (TextView) convertView.findViewById(R.id.H164);
            final TextView H165a = (TextView) convertView.findViewById(R.id.H165a);
            final TextView H165b = (TextView) convertView.findViewById(R.id.H165b);
            final TextView H165c = (TextView) convertView.findViewById(R.id.H165c);
            final TextView H165d = (TextView) convertView.findViewById(R.id.H165d);
            final TextView H165e = (TextView) convertView.findViewById(R.id.H165e);
            final TextView H165f = (TextView) convertView.findViewById(R.id.H165f);
            final TextView H165g = (TextView) convertView.findViewById(R.id.H165g);
            final TextView H165h = (TextView) convertView.findViewById(R.id.H165h);
            final TextView H165x = (TextView) convertView.findViewById(R.id.H165x);
            final TextView H16x1 = (TextView) convertView.findViewById(R.id.H16x1);
            final TextView H165i = (TextView) convertView.findViewById(R.id.H165i);
            final TextView H166 = (TextView) convertView.findViewById(R.id.H166);
            final TextView H167a = (TextView) convertView.findViewById(R.id.H167a);
            final TextView H167b = (TextView) convertView.findViewById(R.id.H167b);
            final TextView H167c = (TextView) convertView.findViewById(R.id.H167c);
            final TextView H167d = (TextView) convertView.findViewById(R.id.H167d);
            final TextView H167e = (TextView) convertView.findViewById(R.id.H167e);
            final TextView H167f = (TextView) convertView.findViewById(R.id.H167f);
            final TextView H167g = (TextView) convertView.findViewById(R.id.H167g);
            final TextView H167i = (TextView) convertView.findViewById(R.id.H167i);
            final TextView H167x = (TextView) convertView.findViewById(R.id.H167x);
            final TextView H167x1 = (TextView) convertView.findViewById(R.id.H167x1);
            final TextView H168 = (TextView) convertView.findViewById(R.id.H168);
            final TextView H169 = (TextView) convertView.findViewById(R.id.H169);
            final TextView H1610 = (TextView) convertView.findViewById(R.id.H1610);
            final TextView H1611 = (TextView) convertView.findViewById(R.id.H1611);
            final TextView H1612a = (TextView) convertView.findViewById(R.id.H1612a);
            final TextView H1612b = (TextView) convertView.findViewById(R.id.H1612b);
            final TextView H1612c = (TextView) convertView.findViewById(R.id.H1612c);
            final TextView H1612d = (TextView) convertView.findViewById(R.id.H1612d);
            final TextView H1612e = (TextView) convertView.findViewById(R.id.H1612e);
            final TextView H1612f = (TextView) convertView.findViewById(R.id.H1612f);
            final TextView H1612g = (TextView) convertView.findViewById(R.id.H1612g);
            final TextView H1612h = (TextView) convertView.findViewById(R.id.H1612h);
            final TextView H1612i = (TextView) convertView.findViewById(R.id.H1612i);
            final TextView H1612j = (TextView) convertView.findViewById(R.id.H1612j);
            final TextView H1612x = (TextView) convertView.findViewById(R.id.H1612x);
            final TextView H1612x1 = (TextView) convertView.findViewById(R.id.H1612x1);
            final TextView H1613 = (TextView) convertView.findViewById(R.id.H1613);
            final TextView H1614a = (TextView) convertView.findViewById(R.id.H1614a);
            final TextView H1614b = (TextView) convertView.findViewById(R.id.H1614b);
            final TextView H1614c = (TextView) convertView.findViewById(R.id.H1614c);
            final TextView H1614d = (TextView) convertView.findViewById(R.id.H1614d);
            final TextView H1614e = (TextView) convertView.findViewById(R.id.H1614e);
            final TextView H1614f = (TextView) convertView.findViewById(R.id.H1614f);
            final TextView H1614x = (TextView) convertView.findViewById(R.id.H1614x);
            final TextView H1614x1 = (TextView) convertView.findViewById(R.id.H1614x1);
            final TextView H1615 = (TextView) convertView.findViewById(R.id.H1615);
            final TextView H1616a = (TextView) convertView.findViewById(R.id.H1616a);
            final TextView H1616b = (TextView) convertView.findViewById(R.id.H1616b);
            final TextView H1616c = (TextView) convertView.findViewById(R.id.H1616c);
            final TextView H1616d = (TextView) convertView.findViewById(R.id.H1616d);
            final TextView H1616e = (TextView) convertView.findViewById(R.id.H1616e);
            final TextView H1616f = (TextView) convertView.findViewById(R.id.H1616f);
            final TextView H1616g = (TextView) convertView.findViewById(R.id.H1616g);
            final TextView H1616h = (TextView) convertView.findViewById(R.id.H1616h);
            final TextView H1616i = (TextView) convertView.findViewById(R.id.H1616i);
            final TextView H1616x = (TextView) convertView.findViewById(R.id.H1616x);
            final TextView H1616x1 = (TextView) convertView.findViewById(R.id.H1616x1);

            final HashMap<String, String> o = (HashMap<String, String>) dataAdap.getItem(position);
            Rnd.setText(o.get("Rnd"));
            SuchanaID.setText(o.get("SuchanaID"));
            H161.setText(o.get("H161"));
            H162.setText(o.get("H162"));
            H163a.setText(o.get("H163a"));
            H163b.setText(o.get("H163b"));
            H163c.setText(o.get("H163c"));
            H163d.setText(o.get("H163d"));
            H163e.setText(o.get("H163e"));
            H163f.setText(o.get("H163f"));
            H163g.setText(o.get("H163g"));
            H163h.setText(o.get("H163h"));
            H163i.setText(o.get("H163i"));
            H163x.setText(o.get("H163x"));
            H163oth.setText(o.get("H163oth"));
            H164.setText(o.get("H164"));
            H165a.setText(o.get("H165a"));
            H165b.setText(o.get("H165b"));
            H165c.setText(o.get("H165c"));
            H165d.setText(o.get("H165d"));
            H165e.setText(o.get("H165e"));
            H165f.setText(o.get("H165f"));
            H165g.setText(o.get("H165g"));
            H165h.setText(o.get("H165h"));
            H165x.setText(o.get("H165x"));
            H16x1.setText(o.get("H16x1"));
            H165i.setText(o.get("H165i"));
            H166.setText(o.get("H166"));
            H167a.setText(o.get("H167a"));
            H167b.setText(o.get("H167b"));
            H167c.setText(o.get("H167c"));
            H167d.setText(o.get("H167d"));
            H167e.setText(o.get("H167e"));
            H167f.setText(o.get("H167f"));
            H167g.setText(o.get("H167g"));
            H167i.setText(o.get("H167i"));
            H167x.setText(o.get("H167x"));
            H167x1.setText(o.get("H167x1"));
            H168.setText(o.get("H168"));
            H169.setText(o.get("H169"));
            H1610.setText(o.get("H1610"));
            H1611.setText(o.get("H1611"));
            H1612a.setText(o.get("H1612a"));
            H1612b.setText(o.get("H1612b"));
            H1612c.setText(o.get("H1612c"));
            H1612d.setText(o.get("H1612d"));
            H1612e.setText(o.get("H1612e"));
            H1612f.setText(o.get("H1612f"));
            H1612g.setText(o.get("H1612g"));
            H1612h.setText(o.get("H1612h"));
            H1612i.setText(o.get("H1612i"));
            H1612j.setText(o.get("H1612j"));
            H1612x.setText(o.get("H1612x"));
            H1612x1.setText(o.get("H1612x1"));
            H1613.setText(o.get("H1613"));
            H1614a.setText(o.get("H1614a"));
            H1614b.setText(o.get("H1614b"));
            H1614c.setText(o.get("H1614c"));
            H1614d.setText(o.get("H1614d"));
            H1614e.setText(o.get("H1614e"));
            H1614f.setText(o.get("H1614f"));
            H1614x.setText(o.get("H1614x"));
            H1614x1.setText(o.get("H1614x1"));
            H1615.setText(o.get("H1615"));
            H1616a.setText(o.get("H1616a"));
            H1616b.setText(o.get("H1616b"));
            H1616c.setText(o.get("H1616c"));
            H1616d.setText(o.get("H1616d"));
            H1616e.setText(o.get("H1616e"));
            H1616f.setText(o.get("H1616f"));
            H1616g.setText(o.get("H1616g"));
            H1616h.setText(o.get("H1616h"));
            H1616i.setText(o.get("H1616i"));
            H1616x.setText(o.get("H1616x"));
            H1616x1.setText(o.get("H1616x1"));

            secListRow.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    //Write your code here
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", o.get("Rnd"));
                    IDbundle.putString("SuchanaID", o.get("SuchanaID"));
                    Intent f1;
                    f1 = new Intent(getApplicationContext(), NGOWork.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);
                }
            });


            return convertView;
        }
    }


}