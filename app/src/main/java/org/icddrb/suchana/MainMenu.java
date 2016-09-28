package org.icddrb.suchana;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;
import Common.Global;

public class MainMenu extends Activity {

    static String USERID = "";
    Button cmdMenuIdentity;
    Button cmdMenuMember;
    Button cmdMenuSES;
    Button cmdMenuAssetB;
    Button cmdMenuAssetNB;
    Button cmdMenuLand;
    Button cmdMenuHDDS;
    Button cmdMenuCost;
    Button cmdMenuSavings;
    Button cmdMenuLoan;
    Button cmdMenuHFIAS;
    Button cmdMenuDestruction1;
    Button cmdMenuDestruction2;
    Button cmdMenuAgriculture;
    Button cmdMenuNGO;
    Button cmdMenuIllness1;
    Button cmdMenuIllness2;
    Button cmdMenuCareseek;
    Button cmdMenuIGA;
    Button cmdMenuStart;
    Button cmdMenuUpdate;

    Button cmdDataUpload;
    Button cmdDataSync;

    Connection C;
    Global g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main_menu);

            C = new Connection(this);
            g = Global.getInstance();

            USERID = g.getUserId();


            cmdMenuStart = (Button) findViewById(R.id.cmdMenuStart);
            cmdMenuStart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainMenu.this,HHIdentity_list.class));
                }
            });

            cmdMenuUpdate = (Button) findViewById(R.id.cmdMenuUpdate);
            cmdMenuUpdate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainMenu.this, HHIdentity_list.class));
                }
            });

            cmdDataSync = (Button) findViewById(R.id.cmdDataSync);
            cmdDataSync.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    //Check for Internet connectivity
                    if (Connection.haveNetworkConnection(MainMenu.this)) {
                    } else {
                        Connection.MessageBox(MainMenu.this, "Internet connection is not available for Data Sync.");
                        return;
                    }


                    AlertDialog.Builder adb = new AlertDialog.Builder(MainMenu.this);
                    adb.setTitle("Data Sync");
                    adb.setMessage("Do you want to Sync Data[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            C = new Connection(MainMenu.this);
                            final ProgressDialog progDailog = ProgressDialog.show(MainMenu.this, "", "Please Wait . . .", true);

                            new Thread() {
                                public void run() {
                                    try {
                                        //C.DataSync_UploadDownload(USERID);

                                        List<String> tableList = new ArrayList<String>();
                                        tableList.add("Agriculture");
                                        tableList.add("AssetB");
                                        tableList.add("AssetNB");
                                        tableList.add("Careseek");
                                        tableList.add("Destruction1");
                                        tableList.add("Destruction2");
                                        tableList.add("HDDS");
                                        tableList.add("HHIdentity");
                                        tableList.add("IGA");
                                        tableList.add("Illness1");
                                        tableList.add("Illness2");
                                        tableList.add("Land");
                                        tableList.add("Loan");
                                        tableList.add("LoginUser");
                                        tableList.add("Member");
                                        tableList.add("NGOWork");
                                        tableList.add("Savings");
                                        tableList.add("SES");
                                        tableList.add("UserList");
                                        tableList.add("VillageList");

                                        C.DataSync_UploadDownload(tableList, USERID);

                                    } catch (Exception e) {

                                    }
                                    progDailog.dismiss();
                                }
                            }.start();

                        }
                    });
                    adb.show();
                }
            });

            Button cmdExit = (Button) findViewById(R.id.cmdExit);
            cmdExit.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(MainMenu.this);
                    adb.setTitle("Exit");
                    adb.setMessage("Do you want to exit from the system[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
                    adb.show();
                }
            });

        } catch (Exception ex) {
            Connection.MessageBox(MainMenu.this, ex.getMessage());
        }
    }
}
