package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".HDDS_list" android:label="HDDS: List" />

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

public class HDDS_list extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    boolean netwoekAvailable = false;
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
            setContentView(R.layout.hdds_list);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();

            TableName = "HDDS";
            lblHeading = (TextView) findViewById(R.id.lblHeading);
            lblHeading.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    final int DRAWABLE_RIGHT = 2;
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (event.getRawX() >= (lblHeading.getRight() - lblHeading.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                            AlertDialog.Builder adb = new AlertDialog.Builder(HDDS_list.this);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(HDDS_list.this);
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
                    Intent intent = new Intent(getApplicationContext(), HDDS.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtras(IDbundle);
                    getApplicationContext().startActivity(intent);

                }
            });


            DataSearch(RND, SUCHANAID);


        } catch (Exception e) {
            Connection.MessageBox(HDDS_list.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            HDDS_DataModel d = new HDDS_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaID='" + SuchanaID + "'";
            List<HDDS_DataModel> data = d.SelectAll(this, SQL);
            dataList.clear();

            dataAdapter = null;

            ListView list = (ListView) findViewById(R.id.lstData);
            HashMap<String, String> map;

            for (HDDS_DataModel item : data) {
                map = new HashMap<String, String>();
                map.put("Rnd", item.getRnd());
                map.put("SuchanaID", item.getSuchanaID());
                map.put("H71a", item.getH71a());
                map.put("H71b1", item.getH71b1());
                map.put("H71b2", item.getH71b2());
                map.put("H71b3", item.getH71b3());
                map.put("H71b4", item.getH71b4());
                map.put("H71c", item.getH71c());
                map.put("H72a", item.getH72a());
                map.put("H72b1", item.getH72b1());
                map.put("H72b2", item.getH72b2());
                map.put("H72b3", item.getH72b3());
                map.put("H72b4", item.getH72b4());
                map.put("H72c", item.getH72c());
                map.put("H73a", item.getH73a());
                map.put("H73b1", item.getH73b1());
                map.put("H73b2", item.getH73b2());
                map.put("H73b3", item.getH73b3());
                map.put("H73b4", item.getH73b4());
                map.put("H73c", item.getH73c());
                map.put("H74a", item.getH74a());
                map.put("H74b1", item.getH74b1());
                map.put("H74b2", item.getH74b2());
                map.put("H74b3", item.getH74b3());
                map.put("H74b4", item.getH74b4());
                map.put("H74c", item.getH74c());
                map.put("H75a", item.getH75a());
                map.put("H75b1", item.getH75b1());
                map.put("H75b2", item.getH75b2());
                map.put("H75b3", item.getH75b3());
                map.put("H75b4", item.getH75b4());
                map.put("H75c", item.getH75c());
                map.put("H76a", item.getH76a());
                map.put("H76b1", item.getH76b1());
                map.put("H76b2", item.getH76b2());
                map.put("H76b3", item.getH76b3());
                map.put("H76b4", item.getH76b4());
                map.put("H76c", item.getH76c());
                map.put("H77a", item.getH77a());
                map.put("H77b1", item.getH77b1());
                map.put("H77b2", item.getH77b2());
                map.put("H77b3", item.getH77b3());
                map.put("H77b4", item.getH77b4());
                map.put("H77c", item.getH77c());
                map.put("H78a", item.getH78a());
                map.put("H78b1", item.getH78b1());
                map.put("H78b2", item.getH78b2());
                map.put("H78b3", item.getH78b3());
                map.put("H78b4", item.getH78b4());
                map.put("H78c", item.getH78c());
                map.put("H79a", item.getH79a());
                map.put("H79b1", item.getH79b1());
                map.put("H79b2", item.getH79b2());
                map.put("H79b3", item.getH79b3());
                map.put("H79b4", item.getH79b4());
                map.put("H79c", item.getH79c());
                map.put("H710a", item.getH710a());
                map.put("H710b1", item.getH710b1());
                map.put("H710b2", item.getH710b2());
                map.put("H710b3", item.getH710b3());
                map.put("H710b4", item.getH710b4());
                map.put("H710c", item.getH710c());
                map.put("H7111a", item.getH7111a());
                map.put("H7111b1", item.getH7111b1());
                map.put("H7111b2", item.getH7111b2());
                map.put("H7111b3", item.getH7111b3());
                map.put("H7111b4", item.getH7111b4());
                map.put("H7111c1", item.getH7111c1());
                map.put("H7112a", item.getH7112a());
                map.put("H7112b1", item.getH7112b1());
                map.put("H7112b2", item.getH7112b2());
                map.put("H7112b3", item.getH7112b3());
                map.put("H7112b4", item.getH7112b4());
                map.put("H7112c", item.getH7112c());
                map.put("H7113a", item.getH7113a());
                map.put("H7113b1", item.getH7113b1());
                map.put("H7113b2", item.getH7113b2());
                map.put("H7113b3", item.getH7113b3());
                map.put("H7113b4", item.getH7113b4());
                map.put("H7113c", item.getH7113c());
                map.put("H7114a", item.getH7114a());
                map.put("H7114b1", item.getH7114b1());
                map.put("H7114b2", item.getH7114b2());
                map.put("H7114b3", item.getH7114b3());
                map.put("H7114b4", item.getH7114b4());
                map.put("H7114c", item.getH7114c());
                map.put("H712a", item.getH712a());
                map.put("H712b1", item.getH712b1());
                map.put("H712b2", item.getH712b2());
                map.put("H712b3", item.getH712b3());
                map.put("H712b4", item.getH712b4());
                map.put("H712c", item.getH712c());
                map.put("H713a", item.getH713a());
                map.put("H713b1", item.getH713b1());
                map.put("H713b2", item.getH713b2());
                map.put("H713b3", item.getH713b3());
                map.put("H713b4", item.getH713b4());
                map.put("H713c", item.getH713c());
                map.put("H714a", item.getH714a());
                map.put("H714b1", item.getH714b1());
                map.put("H714b2", item.getH714b2());
                map.put("H714b3", item.getH714b3());
                map.put("H714b4", item.getH714b4());
                map.put("H714c", item.getH714c());
                map.put("H715a", item.getH715a());
                map.put("H715b1", item.getH715b1());
                map.put("H715b2", item.getH715b2());
                map.put("H715b3", item.getH715b3());
                map.put("H715b4", item.getH715b4());
                map.put("H715c", item.getH715c());
                map.put("H716a", item.getH716a());
                map.put("H716b1", item.getH716b1());
                map.put("H716b2", item.getH716b2());
                map.put("H716b3", item.getH716b3());
                map.put("H716b4", item.getH716b4());
                map.put("H716c", item.getH716c());
                map.put("H717a", item.getH717a());
                map.put("H717b1", item.getH717b1());
                map.put("H717b2", item.getH717b2());
                map.put("H717b3", item.getH717b3());
                map.put("H717b4", item.getH717b4());
                map.put("H717c", item.getH717c());
                dataList.add(map);
            }
            dataAdapter = new SimpleAdapter(HDDS_list.this, dataList, R.layout.hdds_list, new String[]{"rowsec"},
                    new int[]{R.id.secListRow});
            list.setAdapter(new DataListAdapter(this, dataAdapter));
        } catch (Exception e) {
            Connection.MessageBox(HDDS_list.this, e.getMessage());
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
                convertView = inflater.inflate(R.layout.hdds_row, null);
            }
            LinearLayout secListRow = (LinearLayout) convertView.findViewById(R.id.secListRow);

            final TextView Rnd = (TextView) convertView.findViewById(R.id.Rnd);
            final TextView SuchanaID = (TextView) convertView.findViewById(R.id.SuchanaID);
            final TextView H71a = (TextView) convertView.findViewById(R.id.H71a);
            final TextView H71b1 = (TextView) convertView.findViewById(R.id.H71b1);
            final TextView H71b2 = (TextView) convertView.findViewById(R.id.H71b2);
            final TextView H71b3 = (TextView) convertView.findViewById(R.id.H71b3);
            final TextView H71b4 = (TextView) convertView.findViewById(R.id.H71b4);
            final TextView H71c = (TextView) convertView.findViewById(R.id.H71c);
            final TextView H72a = (TextView) convertView.findViewById(R.id.H72a);
            final TextView H72b1 = (TextView) convertView.findViewById(R.id.H72b1);
            final TextView H72b2 = (TextView) convertView.findViewById(R.id.H72b2);
            final TextView H72b3 = (TextView) convertView.findViewById(R.id.H72b3);
            final TextView H72b4 = (TextView) convertView.findViewById(R.id.H72b4);
            final TextView H72c = (TextView) convertView.findViewById(R.id.H72c);
            final TextView H73a = (TextView) convertView.findViewById(R.id.H73a);
            final TextView H73b1 = (TextView) convertView.findViewById(R.id.H73b1);
            final TextView H73b2 = (TextView) convertView.findViewById(R.id.H73b2);
            final TextView H73b3 = (TextView) convertView.findViewById(R.id.H73b3);
            final TextView H73b4 = (TextView) convertView.findViewById(R.id.H73b4);
            final TextView H73c = (TextView) convertView.findViewById(R.id.H73c);
            final TextView H74a = (TextView) convertView.findViewById(R.id.H74a);
            final TextView H74b1 = (TextView) convertView.findViewById(R.id.H74b1);
            final TextView H74b2 = (TextView) convertView.findViewById(R.id.H74b2);
            final TextView H74b3 = (TextView) convertView.findViewById(R.id.H74b3);
            final TextView H74b4 = (TextView) convertView.findViewById(R.id.H74b4);
            final TextView H74c = (TextView) convertView.findViewById(R.id.H74c);
            final TextView H75a = (TextView) convertView.findViewById(R.id.H75a);
            final TextView H75b1 = (TextView) convertView.findViewById(R.id.H75b1);
            final TextView H75b2 = (TextView) convertView.findViewById(R.id.H75b2);
            final TextView H75b3 = (TextView) convertView.findViewById(R.id.H75b3);
            final TextView H75b4 = (TextView) convertView.findViewById(R.id.H75b4);
            final TextView H75c = (TextView) convertView.findViewById(R.id.H75c);
            final TextView H76a = (TextView) convertView.findViewById(R.id.H76a);
            final TextView H76b1 = (TextView) convertView.findViewById(R.id.H76b1);
            final TextView H76b2 = (TextView) convertView.findViewById(R.id.H76b2);
            final TextView H76b3 = (TextView) convertView.findViewById(R.id.H76b3);
            final TextView H76b4 = (TextView) convertView.findViewById(R.id.H76b4);
            final TextView H76c = (TextView) convertView.findViewById(R.id.H76c);
            final TextView H77a = (TextView) convertView.findViewById(R.id.H77a);
            final TextView H77b1 = (TextView) convertView.findViewById(R.id.H77b1);
            final TextView H77b2 = (TextView) convertView.findViewById(R.id.H77b2);
            final TextView H77b3 = (TextView) convertView.findViewById(R.id.H77b3);
            final TextView H77b4 = (TextView) convertView.findViewById(R.id.H77b4);
            final TextView H77c = (TextView) convertView.findViewById(R.id.H77c);
            final TextView H78a = (TextView) convertView.findViewById(R.id.H78a);
            final TextView H78b1 = (TextView) convertView.findViewById(R.id.H78b1);
            final TextView H78b2 = (TextView) convertView.findViewById(R.id.H78b2);
            final TextView H78b3 = (TextView) convertView.findViewById(R.id.H78b3);
            final TextView H78b4 = (TextView) convertView.findViewById(R.id.H78b4);
            final TextView H78c = (TextView) convertView.findViewById(R.id.H78c);
            final TextView H79a = (TextView) convertView.findViewById(R.id.H79a);
            final TextView H79b1 = (TextView) convertView.findViewById(R.id.H79b1);
            final TextView H79b2 = (TextView) convertView.findViewById(R.id.H79b2);
            final TextView H79b3 = (TextView) convertView.findViewById(R.id.H79b3);
            final TextView H79b4 = (TextView) convertView.findViewById(R.id.H79b4);
            final TextView H79c = (TextView) convertView.findViewById(R.id.H79c);
            final TextView H710a = (TextView) convertView.findViewById(R.id.H710a);
            final TextView H710b1 = (TextView) convertView.findViewById(R.id.H710b1);
            final TextView H710b2 = (TextView) convertView.findViewById(R.id.H710b2);
            final TextView H710b3 = (TextView) convertView.findViewById(R.id.H710b3);
            final TextView H710b4 = (TextView) convertView.findViewById(R.id.H710b4);
            final TextView H710c = (TextView) convertView.findViewById(R.id.H710c);
            final TextView H7111a = (TextView) convertView.findViewById(R.id.H7111a);
            final TextView H7111b1 = (TextView) convertView.findViewById(R.id.H7111b1);
            final TextView H7111b2 = (TextView) convertView.findViewById(R.id.H7111b2);
            final TextView H7111b3 = (TextView) convertView.findViewById(R.id.H7111b3);
            final TextView H7111b4 = (TextView) convertView.findViewById(R.id.H7111b4);
            final TextView H7111c1 = (TextView) convertView.findViewById(R.id.H7111c1);
            final TextView H7112a = (TextView) convertView.findViewById(R.id.H7112a);
            final TextView H7112b1 = (TextView) convertView.findViewById(R.id.H7112b1);
            final TextView H7112b2 = (TextView) convertView.findViewById(R.id.H7112b2);
            final TextView H7112b3 = (TextView) convertView.findViewById(R.id.H7112b3);
            final TextView H7112b4 = (TextView) convertView.findViewById(R.id.H7112b4);
            final TextView H7112c = (TextView) convertView.findViewById(R.id.H7112c);
            final TextView H7113a = (TextView) convertView.findViewById(R.id.H7113a);
            final TextView H7113b1 = (TextView) convertView.findViewById(R.id.H7113b1);
            final TextView H7113b2 = (TextView) convertView.findViewById(R.id.H7113b2);
            final TextView H7113b3 = (TextView) convertView.findViewById(R.id.H7113b3);
            final TextView H7113b4 = (TextView) convertView.findViewById(R.id.H7113b4);
            final TextView H7113c = (TextView) convertView.findViewById(R.id.H7113c);
            final TextView H7114a = (TextView) convertView.findViewById(R.id.H7114a);
            final TextView H7114b1 = (TextView) convertView.findViewById(R.id.H7114b1);
            final TextView H7114b2 = (TextView) convertView.findViewById(R.id.H7114b2);
            final TextView H7114b3 = (TextView) convertView.findViewById(R.id.H7114b3);
            final TextView H7114b4 = (TextView) convertView.findViewById(R.id.H7114b4);
            final TextView H7114c = (TextView) convertView.findViewById(R.id.H7114c);
            final TextView H712a = (TextView) convertView.findViewById(R.id.H712a);
            final TextView H712b1 = (TextView) convertView.findViewById(R.id.H712b1);
            final TextView H712b2 = (TextView) convertView.findViewById(R.id.H712b2);
            final TextView H712b3 = (TextView) convertView.findViewById(R.id.H712b3);
            final TextView H712b4 = (TextView) convertView.findViewById(R.id.H712b4);
            final TextView H712c = (TextView) convertView.findViewById(R.id.H712c);
            final TextView H713a = (TextView) convertView.findViewById(R.id.H713a);
            final TextView H713b1 = (TextView) convertView.findViewById(R.id.H713b1);
            final TextView H713b2 = (TextView) convertView.findViewById(R.id.H713b2);
            final TextView H713b3 = (TextView) convertView.findViewById(R.id.H713b3);
            final TextView H713b4 = (TextView) convertView.findViewById(R.id.H713b4);
            final TextView H713c = (TextView) convertView.findViewById(R.id.H713c);
            final TextView H714a = (TextView) convertView.findViewById(R.id.H714a);
            final TextView H714b1 = (TextView) convertView.findViewById(R.id.H714b1);
            final TextView H714b2 = (TextView) convertView.findViewById(R.id.H714b2);
            final TextView H714b3 = (TextView) convertView.findViewById(R.id.H714b3);
            final TextView H714b4 = (TextView) convertView.findViewById(R.id.H714b4);
            final TextView H714c = (TextView) convertView.findViewById(R.id.H714c);
            final TextView H715a = (TextView) convertView.findViewById(R.id.H715a);
            final TextView H715b1 = (TextView) convertView.findViewById(R.id.H715b1);
            final TextView H715b2 = (TextView) convertView.findViewById(R.id.H715b2);
            final TextView H715b3 = (TextView) convertView.findViewById(R.id.H715b3);
            final TextView H715b4 = (TextView) convertView.findViewById(R.id.H715b4);
            final TextView H715c = (TextView) convertView.findViewById(R.id.H715c);
            final TextView H716a = (TextView) convertView.findViewById(R.id.H716a);
            final TextView H716b1 = (TextView) convertView.findViewById(R.id.H716b1);
            final TextView H716b2 = (TextView) convertView.findViewById(R.id.H716b2);
            final TextView H716b3 = (TextView) convertView.findViewById(R.id.H716b3);
            final TextView H716b4 = (TextView) convertView.findViewById(R.id.H716b4);
            final TextView H716c = (TextView) convertView.findViewById(R.id.H716c);
            final TextView H717a = (TextView) convertView.findViewById(R.id.H717a);
            final TextView H717b1 = (TextView) convertView.findViewById(R.id.H717b1);
            final TextView H717b2 = (TextView) convertView.findViewById(R.id.H717b2);
            final TextView H717b3 = (TextView) convertView.findViewById(R.id.H717b3);
            final TextView H717b4 = (TextView) convertView.findViewById(R.id.H717b4);
            final TextView H717c = (TextView) convertView.findViewById(R.id.H717c);

            final HashMap<String, String> o = (HashMap<String, String>) dataAdap.getItem(position);
            Rnd.setText(o.get("Rnd"));
            SuchanaID.setText(o.get("SuchanaID"));
            H71a.setText(o.get("H71a"));
            H71b1.setText(o.get("H71b1"));
            H71b2.setText(o.get("H71b2"));
            H71b3.setText(o.get("H71b3"));
            H71b4.setText(o.get("H71b4"));
            H71c.setText(o.get("H71c"));
            H72a.setText(o.get("H72a"));
            H72b1.setText(o.get("H72b1"));
            H72b2.setText(o.get("H72b2"));
            H72b3.setText(o.get("H72b3"));
            H72b4.setText(o.get("H72b4"));
            H72c.setText(o.get("H72c"));
            H73a.setText(o.get("H73a"));
            H73b1.setText(o.get("H73b1"));
            H73b2.setText(o.get("H73b2"));
            H73b3.setText(o.get("H73b3"));
            H73b4.setText(o.get("H73b4"));
            H73c.setText(o.get("H73c"));
            H74a.setText(o.get("H74a"));
            H74b1.setText(o.get("H74b1"));
            H74b2.setText(o.get("H74b2"));
            H74b3.setText(o.get("H74b3"));
            H74b4.setText(o.get("H74b4"));
            H74c.setText(o.get("H74c"));
            H75a.setText(o.get("H75a"));
            H75b1.setText(o.get("H75b1"));
            H75b2.setText(o.get("H75b2"));
            H75b3.setText(o.get("H75b3"));
            H75b4.setText(o.get("H75b4"));
            H75c.setText(o.get("H75c"));
            H76a.setText(o.get("H76a"));
            H76b1.setText(o.get("H76b1"));
            H76b2.setText(o.get("H76b2"));
            H76b3.setText(o.get("H76b3"));
            H76b4.setText(o.get("H76b4"));
            H76c.setText(o.get("H76c"));
            H77a.setText(o.get("H77a"));
            H77b1.setText(o.get("H77b1"));
            H77b2.setText(o.get("H77b2"));
            H77b3.setText(o.get("H77b3"));
            H77b4.setText(o.get("H77b4"));
            H77c.setText(o.get("H77c"));
            H78a.setText(o.get("H78a"));
            H78b1.setText(o.get("H78b1"));
            H78b2.setText(o.get("H78b2"));
            H78b3.setText(o.get("H78b3"));
            H78b4.setText(o.get("H78b4"));
            H78c.setText(o.get("H78c"));
            H79a.setText(o.get("H79a"));
            H79b1.setText(o.get("H79b1"));
            H79b2.setText(o.get("H79b2"));
            H79b3.setText(o.get("H79b3"));
            H79b4.setText(o.get("H79b4"));
            H79c.setText(o.get("H79c"));
            H710a.setText(o.get("H710a"));
            H710b1.setText(o.get("H710b1"));
            H710b2.setText(o.get("H710b2"));
            H710b3.setText(o.get("H710b3"));
            H710b4.setText(o.get("H710b4"));
            H710c.setText(o.get("H710c"));
            H7111a.setText(o.get("H7111a"));
            H7111b1.setText(o.get("H7111b1"));
            H7111b2.setText(o.get("H7111b2"));
            H7111b3.setText(o.get("H7111b3"));
            H7111b4.setText(o.get("H7111b4"));
            H7111c1.setText(o.get("H7111c1"));
            H7112a.setText(o.get("H7112a"));
            H7112b1.setText(o.get("H7112b1"));
            H7112b2.setText(o.get("H7112b2"));
            H7112b3.setText(o.get("H7112b3"));
            H7112b4.setText(o.get("H7112b4"));
            H7112c.setText(o.get("H7112c"));
            H7113a.setText(o.get("H7113a"));
            H7113b1.setText(o.get("H7113b1"));
            H7113b2.setText(o.get("H7113b2"));
            H7113b3.setText(o.get("H7113b3"));
            H7113b4.setText(o.get("H7113b4"));
            H7113c.setText(o.get("H7113c"));
            H7114a.setText(o.get("H7114a"));
            H7114b1.setText(o.get("H7114b1"));
            H7114b2.setText(o.get("H7114b2"));
            H7114b3.setText(o.get("H7114b3"));
            H7114b4.setText(o.get("H7114b4"));
            H7114c.setText(o.get("H7114c"));
            H712a.setText(o.get("H712a"));
            H712b1.setText(o.get("H712b1"));
            H712b2.setText(o.get("H712b2"));
            H712b3.setText(o.get("H712b3"));
            H712b4.setText(o.get("H712b4"));
            H712c.setText(o.get("H712c"));
            H713a.setText(o.get("H713a"));
            H713b1.setText(o.get("H713b1"));
            H713b2.setText(o.get("H713b2"));
            H713b3.setText(o.get("H713b3"));
            H713b4.setText(o.get("H713b4"));
            H713c.setText(o.get("H713c"));
            H714a.setText(o.get("H714a"));
            H714b1.setText(o.get("H714b1"));
            H714b2.setText(o.get("H714b2"));
            H714b3.setText(o.get("H714b3"));
            H714b4.setText(o.get("H714b4"));
            H714c.setText(o.get("H714c"));
            H715a.setText(o.get("H715a"));
            H715b1.setText(o.get("H715b1"));
            H715b2.setText(o.get("H715b2"));
            H715b3.setText(o.get("H715b3"));
            H715b4.setText(o.get("H715b4"));
            H715c.setText(o.get("H715c"));
            H716a.setText(o.get("H716a"));
            H716b1.setText(o.get("H716b1"));
            H716b2.setText(o.get("H716b2"));
            H716b3.setText(o.get("H716b3"));
            H716b4.setText(o.get("H716b4"));
            H716c.setText(o.get("H716c"));
            H717a.setText(o.get("H717a"));
            H717b1.setText(o.get("H717b1"));
            H717b2.setText(o.get("H717b2"));
            H717b3.setText(o.get("H717b3"));
            H717b4.setText(o.get("H717b4"));
            H717c.setText(o.get("H717c"));

            secListRow.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    //Write your code here
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", o.get("Rnd"));
                    IDbundle.putString("SuchanaID", o.get("SuchanaID"));
                    Intent f1;
                    f1 = new Intent(getApplicationContext(), HDDS.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);
                }
            });


            return convertView;
        }
    }


}