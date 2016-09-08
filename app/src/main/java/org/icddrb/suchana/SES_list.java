package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".SES_list" android:label="SES: List" />

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

public class SES_list extends Activity {
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
            setContentView(R.layout.ses_list);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();

            TableName = "SES";
            lblHeading = (TextView) findViewById(R.id.lblHeading);
            lblHeading.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    final int DRAWABLE_RIGHT = 2;
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (event.getRawX() >= (lblHeading.getRight() - lblHeading.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                            AlertDialog.Builder adb = new AlertDialog.Builder(SES_list.this);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(SES_list.this);
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
                    Intent intent = new Intent(getApplicationContext(), SES.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtras(IDbundle);
                    getApplicationContext().startActivity(intent);

                }
            });


            DataSearch(RND, SUCHANAID);


        } catch (Exception e) {
            Connection.MessageBox(SES_list.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            SES_DataModel d = new SES_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<SES_DataModel> data = d.SelectAll(this, SQL);
            dataList.clear();

            dataAdapter = null;

            ListView list = (ListView) findViewById(R.id.lstData);
            HashMap<String, String> map;

            for (SES_DataModel item : data) {
                map = new HashMap<String, String>();
                map.put("Rnd", item.getRnd());
                map.put("SuchanaID", item.getSuchanaID());
                map.put("H311", item.getH311());
                map.put("H312", item.getH312());
                map.put("H313", item.getH313());
                map.put("H321", item.getH321());
                map.put("H321X", item.getH321X());
                map.put("H322", item.getH322());
                map.put("H322X", item.getH322X());
                map.put("H323", item.getH323());
                map.put("H323X", item.getH323X());
                map.put("H324", item.getH324());
                map.put("H324X", item.getH324X());
                map.put("H325", item.getH325());
                map.put("H325X", item.getH325X());
                map.put("H331", item.getH331());
                map.put("H332A", item.getH332A());
                map.put("H332B", item.getH332B());
                map.put("H341", item.getH341());
                map.put("H342", item.getH342());
                map.put("H61", item.getH61());
                map.put("H62", item.getH62());
                map.put("H63A", item.getH63A());
                map.put("H63B", item.getH63B());
                map.put("H63C", item.getH63C());
                map.put("H63D", item.getH63D());
                map.put("H63E", item.getH63E());
                map.put("H63X", item.getH63X());
                map.put("H64", item.getH64());
                map.put("H65", item.getH65());
                map.put("H66", item.getH66());
                map.put("H67", item.getH67());
                map.put("H68", item.getH68());
                map.put("H69", item.getH69());
                map.put("H610R", item.getH610R());
                map.put("H610RX", item.getH610RX());
                map.put("H610D", item.getH610D());
                map.put("H610DX", item.getH610DX());
                map.put("H610a", item.getH610a());
                map.put("H610b1", item.getH610b1());
                map.put("H610b2", item.getH610b2());
                map.put("H610b3", item.getH610b3());
                map.put("H610b4", item.getH610b4());
                map.put("H610b5", item.getH610b5());
                map.put("H610b5X", item.getH610b5X());
                map.put("H610b6", item.getH610b6());
                map.put("H610c", item.getH610c());
                map.put("H611R", item.getH611R());
                map.put("H611RX", item.getH611RX());
                map.put("H611D", item.getH611D());
                map.put("H611DX", item.getH611DX());
                map.put("H611a", item.getH611a());
                map.put("H611b1", item.getH611b1());
                map.put("H611b2", item.getH611b2());
                map.put("H611b3", item.getH611b3());
                map.put("H611b4", item.getH611b4());
                map.put("H611b5", item.getH611b5());
                map.put("H611b5X", item.getH611b5X());
                map.put("H611b6", item.getH611b6());
                map.put("H612R", item.getH612R());
                map.put("H612RX", item.getH612RX());
                map.put("H612D", item.getH612D());
                map.put("H612DX", item.getH612DX());
                map.put("H612a", item.getH612a());
                map.put("H612b1", item.getH612b1());
                map.put("H612b2", item.getH612b2());
                map.put("H612b3", item.getH612b3());
                map.put("H612b4", item.getH612b4());
                map.put("H612b5", item.getH612b5());
                map.put("H612b5X", item.getH612b5X());
                map.put("H612b6", item.getH612b6());
                map.put("H612c", item.getH612c());
                map.put("H613R", item.getH613R());
                map.put("H613RX", item.getH613RX());
                map.put("H613D", item.getH613D());
                map.put("H613DX", item.getH613DX());
                map.put("H613a", item.getH613a());
                map.put("H613b1", item.getH613b1());
                map.put("H613b2", item.getH613b2());
                map.put("H613b3", item.getH613b3());
                map.put("H613b4", item.getH613b4());
                map.put("H613b5", item.getH613b5());
                map.put("H613b5X", item.getH613b5X());
                map.put("H613b6", item.getH613b6());
                map.put("H613c", item.getH613c());
                map.put("H614R", item.getH614R());
                map.put("H614RX", item.getH614RX());
                map.put("H614D", item.getH614D());
                map.put("H614DX", item.getH614DX());
                map.put("H614a", item.getH614a());
                map.put("H614b1", item.getH614b1());
                map.put("H614b2", item.getH614b2());
                map.put("H614b3", item.getH614b3());
                map.put("H614b4", item.getH614b4());
                map.put("H614b5", item.getH614b5());
                map.put("H614b5X", item.getH614b5X());
                map.put("H614b6", item.getH614b6());
                map.put("H614c", item.getH614c());
                map.put("H615a", item.getH615a());
                map.put("H615b", item.getH615b());
                map.put("H616", item.getH616());
                map.put("H617", item.getH617());
                map.put("H618", item.getH618());
                map.put("H618X", item.getH618X());
                map.put("H619", item.getH619());
                map.put("H620", item.getH620());
                dataList.add(map);
            }
            dataAdapter = new SimpleAdapter(SES_list.this, dataList, R.layout.ses_list, new String[]{"rowsec"},
                    new int[]{R.id.secListRow});
            list.setAdapter(new DataListAdapter(this, dataAdapter));
        } catch (Exception e) {
            Connection.MessageBox(SES_list.this, e.getMessage());
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
                convertView = inflater.inflate(R.layout.ses_row, null);
            }
            LinearLayout secListRow = (LinearLayout) convertView.findViewById(R.id.secListRow);

            final TextView Rnd = (TextView) convertView.findViewById(R.id.Rnd);
            final TextView SuchanaID = (TextView) convertView.findViewById(R.id.SuchanaID);
            final TextView H311 = (TextView) convertView.findViewById(R.id.H311);
            final TextView H312 = (TextView) convertView.findViewById(R.id.H312);
            final TextView H313 = (TextView) convertView.findViewById(R.id.H313);
            final TextView H321 = (TextView) convertView.findViewById(R.id.H321);
            final TextView H321X = (TextView) convertView.findViewById(R.id.H321X);
            final TextView H322 = (TextView) convertView.findViewById(R.id.H322);
            final TextView H322X = (TextView) convertView.findViewById(R.id.H322X);
            final TextView H323 = (TextView) convertView.findViewById(R.id.H323);
            final TextView H323X = (TextView) convertView.findViewById(R.id.H323X);
            final TextView H324 = (TextView) convertView.findViewById(R.id.H324);
            final TextView H324X = (TextView) convertView.findViewById(R.id.H324X);
            final TextView H325 = (TextView) convertView.findViewById(R.id.H325);
            final TextView H325X = (TextView) convertView.findViewById(R.id.H325X);
            final TextView H331 = (TextView) convertView.findViewById(R.id.H331);
            final TextView H332A = (TextView) convertView.findViewById(R.id.H332A);
            final TextView H332B = (TextView) convertView.findViewById(R.id.H332B);
            final TextView H341 = (TextView) convertView.findViewById(R.id.H341);
            final TextView H342 = (TextView) convertView.findViewById(R.id.H342);
            final TextView H61 = (TextView) convertView.findViewById(R.id.H61);
            final TextView H62 = (TextView) convertView.findViewById(R.id.H62);
            final TextView H63A = (TextView) convertView.findViewById(R.id.H63A);
            final TextView H63B = (TextView) convertView.findViewById(R.id.H63B);
            final TextView H63C = (TextView) convertView.findViewById(R.id.H63C);
            final TextView H63D = (TextView) convertView.findViewById(R.id.H63D);
            final TextView H63E = (TextView) convertView.findViewById(R.id.H63E);
            final TextView H63X = (TextView) convertView.findViewById(R.id.H63X);
            final TextView H64 = (TextView) convertView.findViewById(R.id.H64);
            final TextView H65 = (TextView) convertView.findViewById(R.id.H65);
            final TextView H66 = (TextView) convertView.findViewById(R.id.H66);
            final TextView H67 = (TextView) convertView.findViewById(R.id.H67);
            final TextView H68 = (TextView) convertView.findViewById(R.id.H68);
            final TextView H69 = (TextView) convertView.findViewById(R.id.H69);
            final TextView H610R = (TextView) convertView.findViewById(R.id.H610R);
            final TextView H610RX = (TextView) convertView.findViewById(R.id.H610RX);
            final TextView H610D = (TextView) convertView.findViewById(R.id.H610D);
            final TextView H610DX = (TextView) convertView.findViewById(R.id.H610DX);
            final TextView H610a = (TextView) convertView.findViewById(R.id.H610a);
            final TextView H610b1 = (TextView) convertView.findViewById(R.id.H610b1);
            final TextView H610b2 = (TextView) convertView.findViewById(R.id.H610b2);
            final TextView H610b3 = (TextView) convertView.findViewById(R.id.H610b3);
            final TextView H610b4 = (TextView) convertView.findViewById(R.id.H610b4);
            final TextView H610b5 = (TextView) convertView.findViewById(R.id.H610b5);
            final TextView H610b5X = (TextView) convertView.findViewById(R.id.H610b5X);
            final TextView H610b6 = (TextView) convertView.findViewById(R.id.H610b6);
            final TextView H610c = (TextView) convertView.findViewById(R.id.H610c);
            final TextView H611R = (TextView) convertView.findViewById(R.id.H611R);
            final TextView H611RX = (TextView) convertView.findViewById(R.id.H611RX);
            final TextView H611D = (TextView) convertView.findViewById(R.id.H611D);
            final TextView H611DX = (TextView) convertView.findViewById(R.id.H611DX);
            final TextView H611a = (TextView) convertView.findViewById(R.id.H611a);
            final TextView H611b1 = (TextView) convertView.findViewById(R.id.H611b1);
            final TextView H611b2 = (TextView) convertView.findViewById(R.id.H611b2);
            final TextView H611b3 = (TextView) convertView.findViewById(R.id.H611b3);
            final TextView H611b4 = (TextView) convertView.findViewById(R.id.H611b4);
            final TextView H611b5 = (TextView) convertView.findViewById(R.id.H611b5);
            final TextView H611b5X = (TextView) convertView.findViewById(R.id.H611b5X);
            final TextView H611b6 = (TextView) convertView.findViewById(R.id.H611b6);
            final TextView H612R = (TextView) convertView.findViewById(R.id.H612R);
            final TextView H612RX = (TextView) convertView.findViewById(R.id.H612RX);
            final TextView H612D = (TextView) convertView.findViewById(R.id.H612D);
            final TextView H612DX = (TextView) convertView.findViewById(R.id.H612DX);
            final TextView H612a = (TextView) convertView.findViewById(R.id.H612a);
            final TextView H612b1 = (TextView) convertView.findViewById(R.id.H612b1);
            final TextView H612b2 = (TextView) convertView.findViewById(R.id.H612b2);
            final TextView H612b3 = (TextView) convertView.findViewById(R.id.H612b3);
            final TextView H612b4 = (TextView) convertView.findViewById(R.id.H612b4);
            final TextView H612b5 = (TextView) convertView.findViewById(R.id.H612b5);
            final TextView H612b5X = (TextView) convertView.findViewById(R.id.H612b5X);
            final TextView H612b6 = (TextView) convertView.findViewById(R.id.H612b6);
            final TextView H612c = (TextView) convertView.findViewById(R.id.H612c);
            final TextView H613R = (TextView) convertView.findViewById(R.id.H613R);
            final TextView H613RX = (TextView) convertView.findViewById(R.id.H613RX);
            final TextView H613D = (TextView) convertView.findViewById(R.id.H613D);
            final TextView H613DX = (TextView) convertView.findViewById(R.id.H613DX);
            final TextView H613a = (TextView) convertView.findViewById(R.id.H613a);
            final TextView H613b1 = (TextView) convertView.findViewById(R.id.H613b1);
            final TextView H613b2 = (TextView) convertView.findViewById(R.id.H613b2);
            final TextView H613b3 = (TextView) convertView.findViewById(R.id.H613b3);
            final TextView H613b4 = (TextView) convertView.findViewById(R.id.H613b4);
            final TextView H613b5 = (TextView) convertView.findViewById(R.id.H613b5);
            final TextView H613b5X = (TextView) convertView.findViewById(R.id.H613b5X);
            final TextView H613b6 = (TextView) convertView.findViewById(R.id.H613b6);
            final TextView H613c = (TextView) convertView.findViewById(R.id.H613c);
            final TextView H614R = (TextView) convertView.findViewById(R.id.H614R);
            final TextView H614RX = (TextView) convertView.findViewById(R.id.H614RX);
            final TextView H614D = (TextView) convertView.findViewById(R.id.H614D);
            final TextView H614DX = (TextView) convertView.findViewById(R.id.H614DX);
            final TextView H614a = (TextView) convertView.findViewById(R.id.H614a);
            final TextView H614b1 = (TextView) convertView.findViewById(R.id.H614b1);
            final TextView H614b2 = (TextView) convertView.findViewById(R.id.H614b2);
            final TextView H614b3 = (TextView) convertView.findViewById(R.id.H614b3);
            final TextView H614b4 = (TextView) convertView.findViewById(R.id.H614b4);
            final TextView H614b5 = (TextView) convertView.findViewById(R.id.H614b5);
            final TextView H614b5X = (TextView) convertView.findViewById(R.id.H614b5X);
            final TextView H614b6 = (TextView) convertView.findViewById(R.id.H614b6);
            final TextView H614c = (TextView) convertView.findViewById(R.id.H614c);
            final TextView H615a = (TextView) convertView.findViewById(R.id.H615a);
            final TextView H615b = (TextView) convertView.findViewById(R.id.H615b);
            final TextView H616 = (TextView) convertView.findViewById(R.id.H616);
            final TextView H617 = (TextView) convertView.findViewById(R.id.H617);
            final TextView H618 = (TextView) convertView.findViewById(R.id.H618);
            final TextView H618X = (TextView) convertView.findViewById(R.id.H618X);
            final TextView H619 = (TextView) convertView.findViewById(R.id.H619);
            final TextView H620 = (TextView) convertView.findViewById(R.id.H620);

            final HashMap<String, String> o = (HashMap<String, String>) dataAdap.getItem(position);
            Rnd.setText(o.get("Rnd"));
            SuchanaID.setText(o.get("SuchanaID"));
            H311.setText(o.get("H311"));
            H312.setText(o.get("H312"));
            H313.setText(o.get("H313"));
            H321.setText(o.get("H321"));
            H321X.setText(o.get("H321X"));
            H322.setText(o.get("H322"));
            H322X.setText(o.get("H322X"));
            H323.setText(o.get("H323"));
            H323X.setText(o.get("H323X"));
            H324.setText(o.get("H324"));
            H324X.setText(o.get("H324X"));
            H325.setText(o.get("H325"));
            H325X.setText(o.get("H325X"));
            H331.setText(o.get("H331"));
            H332A.setText(o.get("H332A"));
            H332B.setText(o.get("H332B"));
            H341.setText(o.get("H341"));
            H342.setText(o.get("H342"));
            H61.setText(o.get("H61"));
            H62.setText(o.get("H62"));
            H63A.setText(o.get("H63A"));
            H63B.setText(o.get("H63B"));
            H63C.setText(o.get("H63C"));
            H63D.setText(o.get("H63D"));
            H63E.setText(o.get("H63E"));
            H63X.setText(o.get("H63X"));
            H64.setText(o.get("H64"));
            H65.setText(o.get("H65"));
            H66.setText(o.get("H66"));
            H67.setText(o.get("H67"));
            H68.setText(o.get("H68"));
            H69.setText(o.get("H69"));
            H610R.setText(o.get("H610R"));
            H610RX.setText(o.get("H610RX"));
            H610D.setText(o.get("H610D"));
            H610DX.setText(o.get("H610DX"));
            H610a.setText(o.get("H610a"));
            H610b1.setText(o.get("H610b1"));
            H610b2.setText(o.get("H610b2"));
            H610b3.setText(o.get("H610b3"));
            H610b4.setText(o.get("H610b4"));
            H610b5.setText(o.get("H610b5"));
            H610b5X.setText(o.get("H610b5X"));
            H610b6.setText(o.get("H610b6"));
            H610c.setText(o.get("H610c"));
            H611R.setText(o.get("H611R"));
            H611RX.setText(o.get("H611RX"));
            H611D.setText(o.get("H611D"));
            H611DX.setText(o.get("H611DX"));
            H611a.setText(o.get("H611a"));
            H611b1.setText(o.get("H611b1"));
            H611b2.setText(o.get("H611b2"));
            H611b3.setText(o.get("H611b3"));
            H611b4.setText(o.get("H611b4"));
            H611b5.setText(o.get("H611b5"));
            H611b5X.setText(o.get("H611b5X"));
            H611b6.setText(o.get("H611b6"));
            H612R.setText(o.get("H612R"));
            H612RX.setText(o.get("H612RX"));
            H612D.setText(o.get("H612D"));
            H612DX.setText(o.get("H612DX"));
            H612a.setText(o.get("H612a"));
            H612b1.setText(o.get("H612b1"));
            H612b2.setText(o.get("H612b2"));
            H612b3.setText(o.get("H612b3"));
            H612b4.setText(o.get("H612b4"));
            H612b5.setText(o.get("H612b5"));
            H612b5X.setText(o.get("H612b5X"));
            H612b6.setText(o.get("H612b6"));
            H612c.setText(o.get("H612c"));
            H613R.setText(o.get("H613R"));
            H613RX.setText(o.get("H613RX"));
            H613D.setText(o.get("H613D"));
            H613DX.setText(o.get("H613DX"));
            H613a.setText(o.get("H613a"));
            H613b1.setText(o.get("H613b1"));
            H613b2.setText(o.get("H613b2"));
            H613b3.setText(o.get("H613b3"));
            H613b4.setText(o.get("H613b4"));
            H613b5.setText(o.get("H613b5"));
            H613b5X.setText(o.get("H613b5X"));
            H613b6.setText(o.get("H613b6"));
            H613c.setText(o.get("H613c"));
            H614R.setText(o.get("H614R"));
            H614RX.setText(o.get("H614RX"));
            H614D.setText(o.get("H614D"));
            H614DX.setText(o.get("H614DX"));
            H614a.setText(o.get("H614a"));
            H614b1.setText(o.get("H614b1"));
            H614b2.setText(o.get("H614b2"));
            H614b3.setText(o.get("H614b3"));
            H614b4.setText(o.get("H614b4"));
            H614b5.setText(o.get("H614b5"));
            H614b5X.setText(o.get("H614b5X"));
            H614b6.setText(o.get("H614b6"));
            H614c.setText(o.get("H614c"));
            H615a.setText(o.get("H615a"));
            H615b.setText(o.get("H615b"));
            H616.setText(o.get("H616"));
            H617.setText(o.get("H617"));
            H618.setText(o.get("H618"));
            H618X.setText(o.get("H618X"));
            H619.setText(o.get("H619"));
            H620.setText(o.get("H620"));

            secListRow.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    //Write your code here
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", o.get("Rnd"));
                    IDbundle.putString("SuchanaID", o.get("SuchanaID"));
                    Intent f1;
                    f1 = new Intent(getApplicationContext(), SES.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);
                }
            });


            return convertView;
        }
    }


}