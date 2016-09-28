package org.icddrb.suchana;

//Android Manifest Code
//<activity android:name=".Member_list" android:label="Member: List" />

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
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

public class Member_list extends Activity {
    static final int DATE_DIALOG = 1;
    static final int TIME_DIALOG = 2;
    static String TableName;
    static String RND = "";
    static String SUCHANAID = "";
    static String H21 = "";
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
            setContentView(R.layout.member_list);
            C = new Connection(this);
            g = Global.getInstance();
            StartTime = g.CurrentTime24();
            Bundle IDbundle = getIntent().getExtras();
            RND = IDbundle.getString("Rnd");
            SUCHANAID = IDbundle.getString("SuchanaId");
            TableName = "Member";
            /*lblHeading = (TextView) findViewById(R.id.lblHeading);
            lblHeading.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    final int DRAWABLE_RIGHT = 2;
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if (event.getRawX() >= (lblHeading.getRight() - lblHeading.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                            AlertDialog.Builder adb = new AlertDialog.Builder(Member_list.this);
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
            });*/

            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(getApplicationContext());
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to close this form[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle IDbundle = new Bundle();
                            IDbundle.putString("Rnd", RND);
                            IDbundle.putString("SuchanaID", SUCHANAID);
                            Intent intent = new Intent(getApplicationContext(), HHIdentity_list.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtras(IDbundle);
                            getApplicationContext().startActivity(intent);
                            finish();
                        }
                    });
                    adb.show();
                }
            });
            ImageButton cmdForward = (ImageButton) findViewById(R.id.cmdForward);
            cmdForward.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(getApplicationContext());
                    adb.setTitle("Close");
                    adb.setMessage("Do you want to return to Home [Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(), MainMenu.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            getApplicationContext().startActivity(intent);
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
                    IDbundle.putString("SuchanaID", SUCHANAID);
                    IDbundle.putString("H21", "");
                    Intent intent = new Intent(getApplicationContext(), Member.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtras(IDbundle);
                    getApplicationContext().startActivity(intent);

                }
            });


            TextView lblSucanaId = (TextView) findViewById(R.id.lblSuchanaIdHeader);
            lblSucanaId.setText(SUCHANAID);
            SUCHANAID = lblSucanaId.getText().toString();
            DataSearch(RND, SUCHANAID);


        } catch (Exception e) {
            Connection.MessageBox(Member_list.this, e.getMessage());
            return;
        }
    }

    private void DataSearch(String Rnd, String SuchanaID) {
        try {

            Member_DataModel d = new Member_DataModel();
            String SQL = "Select * from " + TableName + "  Where Rnd='" + Rnd + "' and SuchanaId='" + SuchanaID + "'";
            ;
            List<Member_DataModel> data = d.SelectAll(this, SQL);
            dataList.clear();

            dataAdapter = null;

            ListView list = (ListView) findViewById(R.id.lstData);
            HashMap<String, String> map;

            for (Member_DataModel item : data) {
                map = new HashMap<String, String>();
                map.put("Rnd", item.getRnd());
                map.put("SuchanaID", item.getSuchanaID());
                map.put("H21", item.getH21());
                map.put("H22", item.getH22());
                map.put("H23", item.getH23());
                map.put("H24", item.getH24());
                map.put("H25", item.getH25());
                map.put("H26Y", item.getH26Y());
                map.put("H26M", item.getH26M());
                map.put("H27", item.getH27());
                map.put("H28", item.getH28());
                map.put("H29", item.getH29());
                map.put("H29X", item.getH29X());
                map.put("H210", item.getH210());
                map.put("H211", item.getH211());
                map.put("H212", item.getH212());
                map.put("H212X", item.getH212X());
                map.put("H213", item.getH213());
                map.put("H214", item.getH214());
                map.put("H215", item.getH215());
                map.put("H215X", item.getH215X());
                map.put("H216", item.getH216());
                map.put("H216X", item.getH216X());
                map.put("H217", item.getH217());
                map.put("H218", item.getH218());
                map.put("H219", item.getH219());
                map.put("H220", item.getH220());
                map.put("H221", item.getH221());
                map.put("H222", item.getH222());
                dataList.add(map);
            }
            dataAdapter = new SimpleAdapter(Member_list.this, dataList, R.layout.member_list, new String[]{"rowsec"},
                    new int[]{R.id.secListRow});
            list.setAdapter(new DataListAdapter(this, dataAdapter));
        } catch (Exception e) {
            Connection.MessageBox(Member_list.this, e.getMessage());
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
                convertView = inflater.inflate(R.layout.member_row, null);
            }
            LinearLayout secListRow = (LinearLayout) convertView.findViewById(R.id.secListRow);

            final TextView Rnd = (TextView) convertView.findViewById(R.id.Rnd);
            final TextView SuchanaID = (TextView) convertView.findViewById(R.id.SuchanaID);
            final TextView H21 = (TextView) convertView.findViewById(R.id.H21);
            final TextView H22 = (TextView) convertView.findViewById(R.id.H22);
            final TextView H23 = (TextView) convertView.findViewById(R.id.H23);
            final TextView H24 = (TextView) convertView.findViewById(R.id.H24);
            final TextView H25 = (TextView) convertView.findViewById(R.id.H25);
            final TextView H26Y = (TextView) convertView.findViewById(R.id.H26Y);
            final TextView H26M = (TextView) convertView.findViewById(R.id.H26M);
            final TextView H27 = (TextView) convertView.findViewById(R.id.H27);
            final TextView H28 = (TextView) convertView.findViewById(R.id.H28);
            final TextView H29 = (TextView) convertView.findViewById(R.id.H29);
            final TextView H29X = (TextView) convertView.findViewById(R.id.H29X);
            final TextView H210 = (TextView) convertView.findViewById(R.id.H210);
            final TextView H211 = (TextView) convertView.findViewById(R.id.H211);
            final TextView H212 = (TextView) convertView.findViewById(R.id.H212);
            final TextView H212X = (TextView) convertView.findViewById(R.id.H212X);
            final TextView H213 = (TextView) convertView.findViewById(R.id.H213);
            final TextView H214 = (TextView) convertView.findViewById(R.id.H214);
            final TextView H215 = (TextView) convertView.findViewById(R.id.H215);
            final TextView H215X = (TextView) convertView.findViewById(R.id.H215X);
            final TextView H216 = (TextView) convertView.findViewById(R.id.H216);
            final TextView H216X = (TextView) convertView.findViewById(R.id.H216X);
            final TextView H217 = (TextView) convertView.findViewById(R.id.H217);
            final TextView H218 = (TextView) convertView.findViewById(R.id.H218);
            final TextView H219 = (TextView) convertView.findViewById(R.id.H219);
            final TextView H220 = (TextView) convertView.findViewById(R.id.H220);
            final TextView H221 = (TextView) convertView.findViewById(R.id.H221);
            final TextView H222 = (TextView) convertView.findViewById(R.id.H222);

            final HashMap<String, String> o = (HashMap<String, String>) dataAdap.getItem(position);
            Rnd.setText(o.get("Rnd"));
            SuchanaID.setText(o.get("SuchanaID"));
            H21.setText(o.get("H21"));
            H22.setText(o.get("H22"));
            H23.setText(o.get("H23"));
            H24.setText(o.get("H24"));
            H25.setText(o.get("H25"));
            H26Y.setText(o.get("H26Y"));
            H26M.setText(o.get("H26M"));
            H27.setText(o.get("H27"));
            H28.setText(o.get("H28"));
            H29.setText(o.get("H29"));
            H29X.setText(o.get("H29X"));
            H210.setText(o.get("H210"));
            H211.setText(o.get("H211"));
            H212.setText(o.get("H212"));
            H212X.setText(o.get("H212X"));
            H213.setText(o.get("H213"));
            H214.setText(o.get("H214"));
            H215.setText(o.get("H215"));
            H215X.setText(o.get("H215X"));
            H216.setText(o.get("H216"));
            H216X.setText(o.get("H216X"));
            H217.setText(o.get("H217"));
            H218.setText(o.get("H218"));
            H219.setText(o.get("H219"));
            H220.setText(o.get("H220"));
            H221.setText(o.get("H221"));
            H222.setText(o.get("H222"));


            secListRow.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    //Write your code here
                    Bundle IDbundle = new Bundle();
                    IDbundle.putString("Rnd", o.get("Rnd"));
                    IDbundle.putString("SuchanaID", o.get("SuchanaID"));
                    IDbundle.putString("H21", o.get("H21"));
                    Intent f1;
                    f1 = new Intent(getApplicationContext(), Member.class);
                    f1.putExtras(IDbundle);
                    startActivity(f1);
                }
            });


            return convertView;
        }
    }


}