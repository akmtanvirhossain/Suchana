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

            USERID = g.getDeviceNo();


            cmdMenuStart = (Button) findViewById(R.id.cmdMenuStart);
            cmdMenuStart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
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
                                        List<String> tableList = new ArrayList<String>();

                                        tableList.add("Screening");

                                        //Entry Status
                                        tableList.add("EntryStatus");

                                        //Household
                                        tableList.add("HHIdentity");
                                        tableList.add("Member");
                                        tableList.add("SES");
                                        tableList.add("AssetB");
                                        tableList.add("AssetNB");
                                        tableList.add("Land");
                                        tableList.add("HDDS");
                                        tableList.add("Cost");
                                        tableList.add("Savings");
                                        tableList.add("Loan");
                                        tableList.add("HFIAS");
                                        tableList.add("Destruction1");
                                        tableList.add("Destruction2");
                                        tableList.add("Agriculture");
                                        tableList.add("NGOWork");
                                        tableList.add("Illness1");
                                        tableList.add("Illness2");
                                        tableList.add("Careseek");
                                        tableList.add("IGA");

                                        //Woman, Child
                                        tableList.add("PregHis");
                                        tableList.add("Knowledge");
                                        tableList.add("FdhabitKnow");
                                        tableList.add("Handwash");
                                        tableList.add("NutHealth");
                                        tableList.add("WomenEmp");
                                        tableList.add("DomViolance");
                                        tableList.add("FoodDiversity");
                                        tableList.add("FdHabit");
                                        tableList.add("Anthro");
                                        tableList.add("Father");

                                        C.DataSync_UploadDownload(tableList, USERID);

                                        //Village List
                                        C.Sync_Download("VillageList", USERID, "");



                                        /*

                                        //Upload File from Specific Folder
                                        String[] FilePathStrings;
                                        String[] FileNameStrings;
                                        File[] listFile;

                                        File file = new File(Environment.getExternalStorageDirectory()+ File.separator + Global.DatabaseFolder);
                                        file.mkdirs();
                                        if (file.isDirectory()) {
                                            listFile = file.listFiles();
                                            FilePathStrings = new String[listFile.length];
                                            FileNameStrings = new String[listFile.length];

                                            for (int i = 0; i < listFile.length; i++) {
                                                FilePathStrings[i] = listFile[i].getAbsolutePath();
                                                FileNameStrings[i] = listFile[i].getName();

                                                //Upload file to server
                                                FileUpload myTask = new FileUpload();
                                                String[] params = new String[2];
                                                if(listFile[i].getName().equalsIgnoreCase(ProjectSetting.DatabaseName))
                                                {
                                                    params[0]=listFile[i].getName();
                                                    params[1]=listFile[i].getName();
                                                    myTask.execute(params);
                                                }
                                            }
                                        }

                                        */

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
                            finishAffinity();
                            System.exit(0);
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
