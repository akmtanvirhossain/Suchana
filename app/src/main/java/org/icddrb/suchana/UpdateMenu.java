package org.icddrb.suchana;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import Common.Connection;
import Common.Global;

public class UpdateMenu extends Activity {

    static String USERID = "";
    static String RND = "";
    static String SUCHANAID = "";
    static String H7 = "";
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
    Bundle IDBundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            //getLayoutInflater().inflate(R.layout.main_menu, frameLayout);
            setContentView(R.layout.update_menu);
            //  setContentView(R.layout.main_menu);

            C = new Connection(this);
            g = Global.getInstance();

            USERID = g.getUserId();


            IDBundle = getIntent().getExtras();
            RND = IDBundle.getString("Rnd");
            SUCHANAID = IDBundle.getString("SuchanaID");

        /*    cmdMenuStart = (Button) findViewById(R.id.cmdMenuStart);
            cmdMenuStart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainMenu.this,HHIdentity_list.class));
                }
            });*/
            ImageButton cmdBack = (ImageButton) findViewById(R.id.cmdBack);
            cmdBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(UpdateMenu.this);
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
                    AlertDialog.Builder adb = new AlertDialog.Builder(UpdateMenu.this);
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

            cmdMenuIdentity = (Button) findViewById(R.id.cmdMenuIdentity);
            cmdMenuIdentity.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(UpdateMenu.this, HHIdentity.class).putExtras(IDBundle));
                }
            });

            cmdMenuMember = (Button) findViewById(R.id.cmdMenuMember);
            cmdMenuMember.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(UpdateMenu.this, Member_list.class).putExtras(IDBundle));
                }
            });
            cmdMenuSES = (Button) findViewById(R.id.cmdMenuSES);
            cmdMenuSES.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(UpdateMenu.this, SES.class).putExtras(IDBundle));
                }
            });

            cmdMenuAssetB = (Button) findViewById(R.id.cmdMenuAssetB);
            cmdMenuAssetB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(UpdateMenu.this, AssetB.class).putExtras(IDBundle));
                }
            });

            cmdMenuAssetNB = (Button) findViewById(R.id.cmdMenuAssetNB);
            cmdMenuAssetNB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(UpdateMenu.this, AssetNB.class).putExtras(IDBundle));
                }
            });

            cmdMenuLand = (Button) findViewById(R.id.cmdMenuLand);
            cmdMenuLand.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(UpdateMenu.this, Land_list.class).putExtras(IDBundle));
                }
            });

            cmdMenuHDDS = (Button) findViewById(R.id.cmdMenuHDDS);
            cmdMenuHDDS.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(UpdateMenu.this, HDDS.class).putExtras(IDBundle));
                }
            });
            cmdMenuCost = (Button) findViewById(R.id.cmdMenuCost);
            cmdMenuCost.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(UpdateMenu.this, Cost1.class).putExtras(IDBundle));
                }
            });

            cmdMenuSavings = (Button) findViewById(R.id.cmdMenuSavings);
            cmdMenuSavings.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(UpdateMenu.this, Savings.class).putExtras(IDBundle));
                }
            });

            cmdMenuLoan = (Button) findViewById(R.id.cmdMenuLoan);
            cmdMenuLoan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(UpdateMenu.this, Loan_list.class).putExtras(IDBundle));
                }
            });
            cmdMenuHFIAS = (Button) findViewById(R.id.cmdMenuHFIAS);
            cmdMenuHFIAS.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(UpdateMenu.this, HFIAS.class).putExtras(IDBundle));
                }
            });
            cmdMenuDestruction1 = (Button) findViewById(R.id.cmdMenuDestruction1);
            cmdMenuDestruction1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(UpdateMenu.this, Destruction1.class).putExtras(IDBundle));
                }
            });
            cmdMenuDestruction2 = (Button) findViewById(R.id.cmdMenuDestruction2);
            cmdMenuDestruction2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(UpdateMenu.this, Destruction2.class).putExtras(IDBundle));
                }
            });

            cmdMenuAgriculture = (Button) findViewById(R.id.cmdMenuAgriculture);
            cmdMenuAgriculture.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(UpdateMenu.this, Agriculture_list.class).putExtras(IDBundle));
                }
            });
            cmdMenuNGO = (Button) findViewById(R.id.cmdMenuNGO);
            cmdMenuNGO.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(UpdateMenu.this, NGOWork.class).putExtras(IDBundle));
                }
            });
            cmdMenuIllness1 = (Button) findViewById(R.id.cmdMenuIllness1);
            cmdMenuIllness1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(UpdateMenu.this, Illness1_list.class).putExtras(IDBundle));
                }
            });
            cmdMenuIllness2 = (Button) findViewById(R.id.cmdMenuIllness2);
            cmdMenuIllness2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(UpdateMenu.this, Illness2_list.class).putExtras(IDBundle));
                }
            });
            cmdMenuCareseek = (Button) findViewById(R.id.cmdMenuCareseek);
            cmdMenuCareseek.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(UpdateMenu.this, Careseek.class).putExtras(IDBundle));
                }
            });
            cmdMenuIGA = (Button) findViewById(R.id.cmdMenuIGA);
            cmdMenuIGA.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(UpdateMenu.this, IGA.class).putExtras(IDBundle));
                }
            });


           /* cmdDataSync = (Button) findViewById(R.id.cmdDataSync);
            cmdDataSync.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    //Check for Internet connectivity
                    if (Connection.haveNetworkConnection(UpdateMenu.this)) {
                    } else {
                        Connection.MessageBox(UpdateMenu.this, "Internet connection is not available for Data Sync.");
                        return;
                    }

                    AlertDialog.Builder adb = new AlertDialog.Builder(UpdateMenu.this);
                    adb.setTitle("Data Sync");
                    adb.setMessage("Do you want to Sync Data[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            C = new Connection(UpdateMenu.this);
                            final ProgressDialog progDailog = ProgressDialog.show(UpdateMenu.this, "", "Please Wait . . .", true);

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
                    AlertDialog.Builder adb = new AlertDialog.Builder(UpdateMenu.this);
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
*/
        } catch (Exception ex) {
            Connection.MessageBox(UpdateMenu.this, ex.getMessage());
        }
    }
}
