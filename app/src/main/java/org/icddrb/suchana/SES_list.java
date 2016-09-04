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
                map.put("H63", item.getH63());
                map.put("H64A", item.getH64A());
                map.put("H64B", item.getH64B());
                map.put("H64C", item.getH64C());
                map.put("H64D", item.getH64D());
                map.put("H64E", item.getH64E());
                map.put("H64X", item.getH64X());
                map.put("H65", item.getH65());
                map.put("H66", item.getH66());
                map.put("H67", item.getH67());
                map.put("H68", item.getH68());
                map.put("H69", item.getH69());
                map.put("H610", item.getH610());
                map.put("H611", item.getH611());
                map.put("H612R", item.getH612R());
                map.put("H612RX", item.getH612RX());
                map.put("H612D", item.getH612D());
                map.put("H612DX", item.getH612DX());
                map.put("H612a", item.getH612a());
                map.put("H612b1", item.getH612b1());
                map.put("H612b2", item.getH612b2());
                map.put("H612b3", item.getH612b3());
                map.put("H612b4", item.getH612b4());
                map.put("H612bX", item.getH612bX());
                map.put("H612X1", item.getH612X1());
                map.put("H612b5", item.getH612b5());
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
                map.put("H613bX", item.getH613bX());
                map.put("H613bX1", item.getH613bX1());
                map.put("H613b5", item.getH613b5());
                map.put("H614R", item.getH614R());
                map.put("H614RX", item.getH614RX());
                map.put("H614D", item.getH614D());
                map.put("H614DX", item.getH614DX());
                map.put("H614a", item.getH614a());
                map.put("H614b1", item.getH614b1());
                map.put("H614b2", item.getH614b2());
                map.put("H614b3", item.getH614b3());
                map.put("H614b4", item.getH614b4());
                map.put("H614bX", item.getH614bX());
                map.put("H614bX1", item.getH614bX1());
                map.put("H614b5", item.getH614b5());
                map.put("H614c", item.getH614c());
                map.put("H615R", item.getH615R());
                map.put("H615RX", item.getH615RX());
                map.put("H615D", item.getH615D());
                map.put("H615DX", item.getH615DX());
                map.put("H615a", item.getH615a());
                map.put("H615b1", item.getH615b1());
                map.put("H615b2", item.getH615b2());
                map.put("H615b3", item.getH615b3());
                map.put("H615b4", item.getH615b4());
                map.put("H615bX", item.getH615bX());
                map.put("H615X1", item.getH615X1());
                map.put("H615b5", item.getH615b5());
                map.put("H616R", item.getH616R());
                map.put("H616RX", item.getH616RX());
                map.put("H616D", item.getH616D());
                map.put("H616DX", item.getH616DX());
                map.put("H616a", item.getH616a());
                map.put("H616b1", item.getH616b1());
                map.put("H616b2", item.getH616b2());
                map.put("H616b3", item.getH616b3());
                map.put("H616b4", item.getH616b4());
                map.put("H616bX", item.getH616bX());
                map.put("H616X1", item.getH616X1());
                map.put("H616b5", item.getH616b5());
                map.put("H616c", item.getH616c());
                map.put("H617", item.getH617());
                map.put("H618", item.getH618());
                map.put("H619", item.getH619());
                map.put("H620", item.getH620());
                map.put("H620X", item.getH620X());
                map.put("H621", item.getH621());
                map.put("H622", item.getH622());
                map.put("Upload", item.getUpload());
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
                    f1 = new Intent(getApplicationContext(), SES.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);
                }
            });


            return convertView;
        }
    }


}