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

public class MainMenu1 extends Activity {

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
            //getLayoutInflater().inflate(R.layout.main_menu, frameLayout);
            setContentView(R.layout.main_menu_dev);
            //  setContentView(R.layout.main_menu);

            C = new Connection(this);
            g = Global.getInstance();

            USERID = g.getUserId();


        /*    cmdMenuStart = (Button) findViewById(R.id.cmdMenuStart);
            cmdMenuStart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainMenu.this,HHIdentity_list.class));
                }
            });*/

            cmdMenuIdentity = (Button) findViewById(R.id.cmdMenuIdentity);
            cmdMenuIdentity.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent f1 = new Intent(getApplicationContext(), HHIdentity_list.class);
                    startActivity(f1);
                }
            });

            cmdMenuMember = (Button) findViewById(R.id.cmdMenuMember);
            cmdMenuMember.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent f1 = new Intent(getApplicationContext(), Member_list.class);
                    startActivity(f1);
                }
            });
            cmdMenuSES = (Button) findViewById(R.id.cmdMenuSES);
            cmdMenuSES.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent f1 = new Intent(getApplicationContext(), SES_list.class);
                    startActivity(f1);
                }
            });

            cmdMenuAssetB = (Button) findViewById(R.id.cmdMenuAssetB);
            cmdMenuAssetB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent f1 = new Intent(getApplicationContext(), AssetB_list.class);
                    startActivity(f1);
                }
            });

            cmdMenuAssetNB = (Button) findViewById(R.id.cmdMenuAssetNB);
            cmdMenuAssetNB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent f1 = new Intent(getApplicationContext(), AssetNB_list.class);
                    startActivity(f1);
                }
            });

            cmdMenuLand = (Button) findViewById(R.id.cmdMenuLand);
            cmdMenuLand.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle IDBundle = new Bundle();
                    IDBundle.putString("Rnd", "");
                    IDBundle.putString("SuchanaID", "");
                    IDBundle.putString("SlNo", "");
                    startActivity(new Intent(MainMenu1.this, Land_list.class).putExtras(IDBundle));
                }
            });

            cmdMenuHDDS = (Button) findViewById(R.id.cmdMenuHDDS);
            cmdMenuHDDS.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                       Intent f1 = new Intent(getApplicationContext(), HDDS_list.class);
                       startActivity(f1);
                }
            });
            cmdMenuCost = (Button) findViewById(R.id.cmdMenuCost);
            cmdMenuCost.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle IDbundle1 = new Bundle();
                    IDbundle1.putString("Rnd", "1");
                    IDbundle1.putString("SuchanaID", "1234");
                    Intent f1 = new Intent(getApplicationContext(), Cost1.class);
                    f1.putExtras(IDbundle1);
                    startActivity(f1);
                }
            });

            cmdMenuSavings = (Button) findViewById(R.id.cmdMenuSavings);
            cmdMenuSavings.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent f1 = new Intent(getApplicationContext(), Savings_list.class);
                    startActivity(f1);
                }
            });

            cmdMenuLoan = (Button) findViewById(R.id.cmdMenuLoan);
            cmdMenuLoan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle IDbundle1 = new Bundle();
                    IDbundle1.putString("Rnd", "1");
                    IDbundle1.putString("SuchanaID", "1234");
                    Intent f1 = new Intent(getApplicationContext(), Loan_list.class);
                    f1.putExtras(IDbundle1);
                    startActivity(f1);
                }
            });
            cmdMenuHFIAS = (Button) findViewById(R.id.cmdMenuHFIAS);
            cmdMenuHFIAS.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle IDbundle1 = new Bundle();
                    IDbundle1.putString("Rnd", "1");
                    IDbundle1.putString("SuchanaID", "1234");
                    Intent f1 = new Intent(getApplicationContext(), HFIAS.class);
                    f1.putExtras(IDbundle1);
                    startActivity(f1);
                }
            });
            cmdMenuDestruction1 = (Button) findViewById(R.id.cmdMenuDestruction1);
            cmdMenuDestruction1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent f1 = new Intent(getApplicationContext(), Destruction1_list.class);
                    startActivity(f1);
                }
            });
            cmdMenuDestruction2 = (Button) findViewById(R.id.cmdMenuDestruction2);
            cmdMenuDestruction2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent f1 = new Intent(getApplicationContext(), Destruction2_list.class);
                    startActivity(f1);
                }
            });

            cmdMenuAgriculture = (Button) findViewById(R.id.cmdMenuAgriculture);
            cmdMenuAgriculture.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle IDbundle1 = new Bundle();
                    IDbundle1.putString("Rnd", "1");
                    IDbundle1.putString("SuchanaID", "1234");
                    Intent f1 = new Intent(getApplicationContext(), Agriculture_list.class);
                    f1.putExtras(IDbundle1);
                    startActivity(f1);
                }
            });
            cmdMenuNGO = (Button) findViewById(R.id.cmdMenuNGO);
            cmdMenuNGO.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle IDbundle1 = new Bundle();
                    IDbundle1.putString("Rnd", "1");
                    IDbundle1.putString("SuchanaID", "1234");
                    Intent f1 = new Intent(getApplicationContext(), NGOWork.class);
                    f1.putExtras(IDbundle1);
                    startActivity(f1);
                }
            });
            cmdMenuIllness1 = (Button) findViewById(R.id.cmdMenuIllness1);
            cmdMenuIllness1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle IDbundle1 = new Bundle();
                    IDbundle1.putString("Rnd", "1");
                    IDbundle1.putString("SuchanaID", "1234");
                    Intent f1 = new Intent(getApplicationContext(), Illness1_list.class);
                    f1.putExtras(IDbundle1);
                    startActivity(f1);
                }
            });
            cmdMenuIllness2 = (Button) findViewById(R.id.cmdMenuIllness2);
            cmdMenuIllness2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle IDbundle1 = new Bundle();
                    IDbundle1.putString("Rnd", "1");
                    IDbundle1.putString("SuchanaID", "1234");
                    Intent f1 = new Intent(getApplicationContext(), Illness2_list.class);
                    f1.putExtras(IDbundle1);
                    startActivity(f1);
                }
            });
            cmdMenuCareseek = (Button) findViewById(R.id.cmdMenuCareseek);
            cmdMenuCareseek.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle IDbundle1 = new Bundle();
                    IDbundle1.putString("Rnd", "1");
                    IDbundle1.putString("SuchanaID", "1234");
                    Intent f1 = new Intent(getApplicationContext(), Careseek.class);
                    f1.putExtras(IDbundle1);
                    startActivity(f1);
                }
            });
            cmdMenuIGA = (Button) findViewById(R.id.cmdMenuIGA);
            cmdMenuIGA.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle IDbundle1 = new Bundle();
                    IDbundle1.putString("Rnd", "1");
                    IDbundle1.putString("SuchanaID", "1234");
                    Intent f1 = new Intent(getApplicationContext(), IGA.class);
                    f1.putExtras(IDbundle1);
                    startActivity(f1);
                }
            });



            cmdDataSync = (Button) findViewById(R.id.cmdDataSync);
            cmdDataSync.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    //Check for Internet connectivity
                    if (Connection.haveNetworkConnection(MainMenu1.this)) {
                    } else {
                        Connection.MessageBox(MainMenu1.this, "Internet connection is not available for Data Sync.");
                        return;
                    }

                    AlertDialog.Builder adb = new AlertDialog.Builder(MainMenu1.this);
                    adb.setTitle("Data Sync");
                    adb.setMessage("Do you want to Sync Data[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            C = new Connection(MainMenu1.this);
                            final ProgressDialog progDailog = ProgressDialog.show(MainMenu1.this, "", "Please Wait . . .", true);

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


                                        //Lab
                                        tableList.add("SampleAnalysis");
                                        tableList.add("LabResult");

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
                    AlertDialog.Builder adb = new AlertDialog.Builder(MainMenu1.this);
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
            Connection.MessageBox(MainMenu1.this, ex.getMessage());
        }
    }
}
