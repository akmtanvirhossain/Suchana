package org.icddrb.suchana;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
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
    Button cmdMenuInterviewList;
    Button cmdMenuNutHealth;
    Button cmdMenuWomenEmp;
    Button cmdMenuDomViolance;
    Button cmdMenuFoodDiversity;
    Button cmdMenuAnthro;
    Button cmdMenuPreHis;
    Button cmdMenuKnowledge;
    Button cmdMenuFdhabitKnow;
    Button cmdMenuFdHabit;
    Button cmdMenuHandWash;

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

            Button cmdMenuExit = (Button) findViewById(R.id.cmdMenuExit);
            cmdMenuExit.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    AlertDialog.Builder adb = new AlertDialog.Builder(UpdateMenu.this);
                    adb.setTitle("Exit");
                    adb.setMessage("Do you want to exit from the system[Yes/No]?");
                    adb.setNegativeButton("No", null);
                    adb.setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);
                        }
                    });
                    adb.show();
                }
            });


            cmdMenuInterviewList = (Button) findViewById(R.id.cmdMenuInterviewList);
            cmdMenuInterviewList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, HHIdentity_list.class).putExtras(IDBundle));
                }
            });

            cmdMenuIdentity = (Button) findViewById(R.id.cmdMenuIdentity);
            cmdMenuIdentity.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, HHIdentity.class).putExtras(IDBundle));
                }
            });

            cmdMenuMember = (Button) findViewById(R.id.cmdMenuMember);
            cmdMenuMember.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, Member_list.class).putExtras(IDBundle));
                }
            });
            cmdMenuSES = (Button) findViewById(R.id.cmdMenuSES);
            cmdMenuSES.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, SES.class).putExtras(IDBundle));
                }
            });

            cmdMenuAssetB = (Button) findViewById(R.id.cmdMenuAssetB);
            cmdMenuAssetB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, AssetB_list.class).putExtras(IDBundle));
                }
            });

            cmdMenuAssetNB = (Button) findViewById(R.id.cmdMenuAssetNB);
            cmdMenuAssetNB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, AssetNB.class).putExtras(IDBundle));
                }
            });

            cmdMenuLand = (Button) findViewById(R.id.cmdMenuLand);
            cmdMenuLand.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, Land_list.class).putExtras(IDBundle));
                }
            });

            cmdMenuHDDS = (Button) findViewById(R.id.cmdMenuHDDS);
            cmdMenuHDDS.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, HDDS.class).putExtras(IDBundle));
                }
            });
            cmdMenuCost = (Button) findViewById(R.id.cmdMenuCost);
            cmdMenuCost.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, Cost1.class).putExtras(IDBundle));
                }
            });

            cmdMenuSavings = (Button) findViewById(R.id.cmdMenuSavings);
            cmdMenuSavings.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, Savings.class).putExtras(IDBundle));
                }
            });

            cmdMenuLoan = (Button) findViewById(R.id.cmdMenuLoan);
            cmdMenuLoan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, Loan_list.class).putExtras(IDBundle));
                }
            });
            cmdMenuHFIAS = (Button) findViewById(R.id.cmdMenuHFIAS);
            cmdMenuHFIAS.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, HFIAS.class).putExtras(IDBundle));
                }
            });
            cmdMenuDestruction1 = (Button) findViewById(R.id.cmdMenuDestruction1);
            cmdMenuDestruction1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, Destruction1.class).putExtras(IDBundle));
                }
            });
            cmdMenuDestruction2 = (Button) findViewById(R.id.cmdMenuDestruction2);
            cmdMenuDestruction2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, Destruction2.class).putExtras(IDBundle));
                }
            });

            cmdMenuAgriculture = (Button) findViewById(R.id.cmdMenuAgriculture);
            cmdMenuAgriculture.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, Agriculture_list.class).putExtras(IDBundle));
                }
            });
            cmdMenuNGO = (Button) findViewById(R.id.cmdMenuNGO);
            cmdMenuNGO.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, NGOWork.class).putExtras(IDBundle));
                }
            });
            cmdMenuIllness1 = (Button) findViewById(R.id.cmdMenuIllness1);
            cmdMenuIllness1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, Illness1_list.class).putExtras(IDBundle));
                }
            });
            cmdMenuIllness2 = (Button) findViewById(R.id.cmdMenuIllness2);
            cmdMenuIllness2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, Illness2_list.class).putExtras(IDBundle));
                }
            });
            cmdMenuCareseek = (Button) findViewById(R.id.cmdMenuCareseek);
            cmdMenuCareseek.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, Careseek.class).putExtras(IDBundle));
                }
            });
            cmdMenuIGA = (Button) findViewById(R.id.cmdMenuIGA);
            cmdMenuIGA.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, IGA.class).putExtras(IDBundle));
                }
            });


            cmdMenuPreHis = (Button) findViewById(R.id.cmdMenuPreHis);
            cmdMenuPreHis.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, PregHis.class).putExtras(IDBundle));
                }
            });

            cmdMenuKnowledge = (Button) findViewById(R.id.cmdMenuKnowledge);
            cmdMenuKnowledge.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, Knowledge.class).putExtras(IDBundle));
                }
            });

            cmdMenuFdhabitKnow = (Button) findViewById(R.id.cmdMenuFdhabitKnow);
            cmdMenuFdhabitKnow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, FdHabitKnow.class).putExtras(IDBundle));
                }
            });

            cmdMenuHandWash = (Button) findViewById(R.id.cmdMenuHandWash);
            cmdMenuHandWash.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, HandWash.class).putExtras(IDBundle));
                }
            });

            cmdMenuNutHealth = (Button) findViewById(R.id.cmdMenuNutHealth);
            cmdMenuNutHealth.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, NutHealth.class).putExtras(IDBundle));
                }
            });

            cmdMenuWomenEmp = (Button) findViewById(R.id.cmdMenuWomenEmp);
            cmdMenuWomenEmp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, WomenEmp.class).putExtras(IDBundle));
                }
            });

            cmdMenuDomViolance = (Button) findViewById(R.id.cmdMenuDomViolance);
            cmdMenuDomViolance.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, DomViolance.class).putExtras(IDBundle));
                }
            });

            cmdMenuFoodDiversity = (Button) findViewById(R.id.cmdMenuFoodDiversity);
            cmdMenuFoodDiversity.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, FoodDiversity.class).putExtras(IDBundle));
                }
            });


            cmdMenuFdHabit = (Button) findViewById(R.id.cmdMenuFdHabit);
            cmdMenuFdHabit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, FdHabit.class).putExtras(IDBundle));
                }
            });

            cmdMenuAnthro = (Button) findViewById(R.id.cmdMenuAnthro);
            cmdMenuAnthro.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    startActivity(new Intent(UpdateMenu.this, Anthro.class).putExtras(IDBundle));
                }
            });


            cmdMenuIdentity.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
            //cmdMenuIdentity.setCompoundDrawablesWithIntrinsicBounds(0 , 0, 0, 0);


            Cursor cur = C.ReadData("Select * from EntryStatus where Rnd='" + RND + "' and SuchanaId='" + SUCHANAID + "'");
            cur.moveToFirst();
            while (!cur.isAfterLast()) {
                if (cur.getString(cur.getColumnIndex("T1")).equals("1")) {
                    cmdMenuIdentity.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuIdentity.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T2")) == null ? "" : cur.getString(cur.getColumnIndex("T2"))).equals("1")) {
                    cmdMenuMember.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuMember.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T3")) == null ? "" : cur.getString(cur.getColumnIndex("T3"))).equals("1")) {
                    cmdMenuSES.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuSES.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T4")) == null ? "" : cur.getString(cur.getColumnIndex("T4"))).equals("1")) {
                    cmdMenuAssetB.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuAssetB.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T5")) == null ? "" : cur.getString(cur.getColumnIndex("T5"))).equals("1")) {
                    cmdMenuAssetNB.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuAssetNB.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T6")) == null ? "" : cur.getString(cur.getColumnIndex("T6"))).equals("1")) {
                    cmdMenuLand.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuLand.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T7")) == null ? "" : cur.getString(cur.getColumnIndex("T7"))).equals("1")) {
                    cmdMenuHDDS.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuHDDS.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T8")) == null ? "" : cur.getString(cur.getColumnIndex("T8"))).equals("1")) {
                    cmdMenuCost.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuCost.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T9")) == null ? "" : cur.getString(cur.getColumnIndex("T9"))).equals("1")) {
                    cmdMenuSavings.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuSavings.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T10")) == null ? "" : cur.getString(cur.getColumnIndex("T10"))).equals("1")) {
                    cmdMenuLoan.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuLoan.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T11")) == null ? "" : cur.getString(cur.getColumnIndex("T11"))).equals("1")) {
                    cmdMenuHFIAS.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuHFIAS.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T12")) == null ? "" : cur.getString(cur.getColumnIndex("T12"))).equals("1")) {
                    cmdMenuDestruction1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuDestruction1.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T13")) == null ? "" : cur.getString(cur.getColumnIndex("T13"))).equals("1")) {
                    cmdMenuDestruction2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuDestruction2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T14")) == null ? "" : cur.getString(cur.getColumnIndex("T14"))).equals("1")) {
                    cmdMenuAgriculture.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuAgriculture.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T15")) == null ? "" : cur.getString(cur.getColumnIndex("T15"))).equals("1")) {
                    cmdMenuNGO.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuNGO.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T16")) == null ? "" : cur.getString(cur.getColumnIndex("T16"))).equals("1")) {
                    cmdMenuIllness1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuIllness1.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T17")) == null ? "" : cur.getString(cur.getColumnIndex("T17"))).equals("1")) {
                    cmdMenuIllness2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuIllness2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T18")) == null ? "" : cur.getString(cur.getColumnIndex("T18"))).equals("1")) {
                    cmdMenuCareseek.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuCareseek.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T19")) == null ? "" : cur.getString(cur.getColumnIndex("T19"))).equals("1")) {
                    cmdMenuIGA.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuIGA.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                //Mother, Child
                if ((cur.getString(cur.getColumnIndex("T20")) == null ? "" : cur.getString(cur.getColumnIndex("T20"))).equals("1")) {
                    cmdMenuPreHis.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuPreHis.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T21")) == null ? "" : cur.getString(cur.getColumnIndex("T21"))).equals("1")) {
                    cmdMenuKnowledge.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuKnowledge.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T22")) == null ? "" : cur.getString(cur.getColumnIndex("T22"))).equals("1")) {
                    cmdMenuFdhabitKnow.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuFdhabitKnow.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T23")) == null ? "" : cur.getString(cur.getColumnIndex("T23"))).equals("1")) {
                    cmdMenuHandWash.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuHandWash.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T24")) == null ? "" : cur.getString(cur.getColumnIndex("T24"))).equals("1")) {
                    cmdMenuNutHealth.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuNutHealth.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T25")) == null ? "" : cur.getString(cur.getColumnIndex("T25"))).equals("1")) {
                    cmdMenuWomenEmp.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuWomenEmp.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T26")) == null ? "" : cur.getString(cur.getColumnIndex("T26"))).equals("1")) {
                    cmdMenuDomViolance.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuDomViolance.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T27")) == null ? "" : cur.getString(cur.getColumnIndex("T27"))).equals("1")) {
                    cmdMenuFoodDiversity.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuFoodDiversity.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T28")) == null ? "" : cur.getString(cur.getColumnIndex("T28"))).equals("1")) {
                    cmdMenuFdHabit.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuFdHabit.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

                if ((cur.getString(cur.getColumnIndex("T29")) == null ? "" : cur.getString(cur.getColumnIndex("T29"))).equals("1")) {
                    cmdMenuAnthro.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_accept, 0, 0, 0);
                } else cmdMenuAnthro.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);


                cur.moveToNext();
            }
            cur.close();

        } catch (Exception ex) {
            Connection.MessageBox(UpdateMenu.this, ex.getMessage());
        }
    }

/*    public void EntryStatusUpdate(String TableName, String Round, String SuchanaId)
    {
        Connection Con = new Connection(this);
        if(TableName.toLowerCase().equals("hhidentity"))
            C.Save("Update EntryStatus set T1='1' where Rnd='"+ Round +"' and SuchanaId='"+ SuchanaId +"'");
        else if(TableName.toLowerCase().equals("member"))
            Con.Save("Update EntryStatus set T2='1' where Rnd='"+ Round +"' and SuchanaId='"+ SuchanaId +"'");
        else if(TableName.toLowerCase().equals("ses"))
            Con.Save("Update EntryStatus set T3='1' where Rnd='"+ Round +"' and SuchanaId='"+ SuchanaId +"'");
    }*/
}
