package org.icddrb.suchana;
//Android Manifest Code
//<activity android:name=".QC_list" android:label="QC: List" />

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.*;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.location.Location;
import android.view.KeyEvent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageButton;

import Common.*;

public class QC_list extends Activity {
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
            setContentView(R.layout.qc_list);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();

            TableName = "QC";
            lblHeading = (TextView) findViewById(R.id.lblHeading);
            lblHeading.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    final int DRAWABLE_RIGHT = 2;
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (event.getRawX() >= (lblHeading.getRight() - lblHeading.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                            AlertDialog.Builder adb = new AlertDialog.Builder(QC_list.this);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(QC_list.this);
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
                    Intent intent = new Intent(getApplicationContext(), QC.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtras(IDbundle);
                    getApplicationContext().startActivity(intent);

                }
            });


            DataSearch(RND, SUCHANAID);


        } catch (Exception e) {
            Connection.MessageBox(QC_list.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            QC_DataModel d = new QC_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<QC_DataModel> data = d.SelectAll(this, SQL);
            dataList.clear();

            dataAdapter = null;

            ListView list = (ListView) findViewById(R.id.lstData);
            HashMap<String, String> map;

            for (QC_DataModel item : data) {
                map = new HashMap<String, String>();
                map.put("Rnd", item.getRnd());
                map.put("SuchanaID", item.getSuchanaID());
                map.put("H311", item.getH311());
                map.put("H312", item.getH312());
                map.put("H313", item.getH313());
                map.put("H61", item.getH61());
                map.put("H14c1", item.getH14c1());
                map.put("H14b1", item.getH14b1());
                map.put("H14b2", item.getH14b2());
                map.put("H14b3", item.getH14b3());
                map.put("H14b4", item.getH14b4());
                map.put("H14b5", item.getH14b5());
                map.put("H14b6", item.getH14b6());
                map.put("H14b7", item.getH14b7());
                map.put("H14b8", item.getH14b8());
                map.put("H14b9", item.getH14b9());
                map.put("H14b9X", item.getH14b9X());
                map.put("M11", item.getM11());
                map.put("M12", item.getM12());
                map.put("M13", item.getM13());
                map.put("M19", item.getM19());
                map.put("M115", item.getM115());
                map.put("M116", item.getM116());
                map.put("M120", item.getM120());
                map.put("M121", item.getM121());
                map.put("C14", item.getC14());
                map.put("C15", item.getC15().toString().length() == 0 ? "" : Global.DateConvertDMY(item.getC15()));
                map.put("C16", item.getC16());
                map.put("C110", item.getC110());
                map.put("C115", item.getC115());
                map.put("C140", item.getC140());
                map.put("C142a", item.getC142a());
                map.put("C142b", item.getC142b());
                map.put("C142c", item.getC142c());
                map.put("C142d", item.getC142d());
                map.put("C142e", item.getC142e());
                map.put("C142f", item.getC142f());
                map.put("C142g", item.getC142g());
                dataList.add(map);
            }
            dataAdapter = new SimpleAdapter(QC_list.this, dataList, R.layout.qc_list, new String[]{"rowsec"},
                    new int[]{R.id.secListRow});
            list.setAdapter(new DataListAdapter(this, dataAdapter));
        } catch (Exception e) {
            Connection.MessageBox(QC_list.this, e.getMessage());
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
                convertView = inflater.inflate(R.layout.qc_row, null);
            }
            LinearLayout secListRow = (LinearLayout) convertView.findViewById(R.id.secListRow);

            final TextView Rnd = (TextView) convertView.findViewById(R.id.Rnd);
            final TextView SuchanaID = (TextView) convertView.findViewById(R.id.SuchanaID);
            final TextView H311 = (TextView) convertView.findViewById(R.id.H311);
            final TextView H312 = (TextView) convertView.findViewById(R.id.H312);
            final TextView H313 = (TextView) convertView.findViewById(R.id.H313);
            final TextView H61 = (TextView) convertView.findViewById(R.id.H61);
            final TextView H14c1 = (TextView) convertView.findViewById(R.id.H14c1);
            final TextView H14b1 = (TextView) convertView.findViewById(R.id.H14b1);
            final TextView H14b2 = (TextView) convertView.findViewById(R.id.H14b2);
            final TextView H14b3 = (TextView) convertView.findViewById(R.id.H14b3);
            final TextView H14b4 = (TextView) convertView.findViewById(R.id.H14b4);
            final TextView H14b5 = (TextView) convertView.findViewById(R.id.H14b5);
            final TextView H14b6 = (TextView) convertView.findViewById(R.id.H14b6);
            final TextView H14b7 = (TextView) convertView.findViewById(R.id.H14b7);
            final TextView H14b8 = (TextView) convertView.findViewById(R.id.H14b8);
            final TextView H14b9 = (TextView) convertView.findViewById(R.id.H14b9);
            final TextView H14b9X = (TextView) convertView.findViewById(R.id.H14b9X);
            final TextView M11 = (TextView) convertView.findViewById(R.id.M11);
            final TextView M12 = (TextView) convertView.findViewById(R.id.M12);
            final TextView M13 = (TextView) convertView.findViewById(R.id.M13);
            final TextView M19 = (TextView) convertView.findViewById(R.id.M19);
            final TextView M115 = (TextView) convertView.findViewById(R.id.M115);
            final TextView M116 = (TextView) convertView.findViewById(R.id.M116);
            final TextView M120 = (TextView) convertView.findViewById(R.id.M120);
            final TextView M121 = (TextView) convertView.findViewById(R.id.M121);
            final TextView C14 = (TextView) convertView.findViewById(R.id.C14);
            final TextView C15 = (TextView) convertView.findViewById(R.id.C15);
            final TextView C16 = (TextView) convertView.findViewById(R.id.C16);
            final TextView C110 = (TextView) convertView.findViewById(R.id.C110);
            final TextView C115 = (TextView) convertView.findViewById(R.id.C115);
            final TextView C140 = (TextView) convertView.findViewById(R.id.C140);
            final TextView C142a = (TextView) convertView.findViewById(R.id.C142a);
            final TextView C142b = (TextView) convertView.findViewById(R.id.C142b);
            final TextView C142c = (TextView) convertView.findViewById(R.id.C142c);
            final TextView C142d = (TextView) convertView.findViewById(R.id.C142d);
            final TextView C142e = (TextView) convertView.findViewById(R.id.C142e);
            final TextView C142f = (TextView) convertView.findViewById(R.id.C142f);
            final TextView C142g = (TextView) convertView.findViewById(R.id.C142g);

            final HashMap<String, String> o = (HashMap<String, String>) dataAdap.getItem(position);
            Rnd.setText(o.get("Rnd"));
            SuchanaID.setText(o.get("SuchanaID"));
            H311.setText(o.get("H311"));
            H312.setText(o.get("H312"));
            H313.setText(o.get("H313"));
            H61.setText(o.get("H61"));
            H14c1.setText(o.get("H14c1"));
            H14b1.setText(o.get("H14b1"));
            H14b2.setText(o.get("H14b2"));
            H14b3.setText(o.get("H14b3"));
            H14b4.setText(o.get("H14b4"));
            H14b5.setText(o.get("H14b5"));
            H14b6.setText(o.get("H14b6"));
            H14b7.setText(o.get("H14b7"));
            H14b8.setText(o.get("H14b8"));
            H14b9.setText(o.get("H14b9"));
            H14b9X.setText(o.get("H14b9X"));
            M11.setText(o.get("M11"));
            M12.setText(o.get("M12"));
            M13.setText(o.get("M13"));
            M19.setText(o.get("M19"));
            M115.setText(o.get("M115"));
            M116.setText(o.get("M116"));
            M120.setText(o.get("M120"));
            M121.setText(o.get("M121"));
            C14.setText(o.get("C14"));
            C15.setText(o.get("C15"));
            C16.setText(o.get("C16"));
            C110.setText(o.get("C110"));
            C115.setText(o.get("C115"));
            C140.setText(o.get("C140"));
            C142a.setText(o.get("C142a"));
            C142b.setText(o.get("C142b"));
            C142c.setText(o.get("C142c"));
            C142d.setText(o.get("C142d"));
            C142e.setText(o.get("C142e"));
            C142f.setText(o.get("C142f"));
            C142g.setText(o.get("C142g"));

            secListRow.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    //Write your code here
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", o.get("Rnd"));
                    IDbundle.putString("SuchanaID", o.get("SuchanaID"));
                    Intent f1;
                    f1 = new Intent(getApplicationContext(), QC.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);
                }
            });


            return convertView;
        }
    }


}