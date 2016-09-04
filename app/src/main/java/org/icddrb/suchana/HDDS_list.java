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
            String SQL = "Select * from " + TableName;
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
                map.put("Upload", item.getUpload());
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
                convertView = inflater.inflate(R.layout.common_row, null);
            }
            LinearLayout secListRow = (LinearLayout) convertView.findViewById(R.id.secListRow);

            final TextView Rnd = (TextView) convertView.findViewById(R.id.Rnd);
            final TextView SuchanaID = (TextView) convertView.findViewById(R.id.SuchanaID);
            final TextView Upload = (TextView) convertView.findViewById(R.id.txtUploadStatus);


            final HashMap<String, String> o = (HashMap<String, String>) dataAdap.getItem(position);
            Rnd.setText(o.get("Rnd"));
            SuchanaID.setText(o.get("SuchanaID"));
            Upload.setText(o.get("Upload"));

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