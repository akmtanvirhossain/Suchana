package org.icddrb.suchana;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import Common.Connection;
import Common.Global;
import Common.ProjectSetting;

public class LoginActivity extends Activity {
    public static final int DIALOG_DOWNLOAD_PROGRESS = 0;
    Connection C;
    Global g;
    boolean netwoekAvailable = false;
    int count = 0;
    TextView lblStaffType;
    String SystemUpdateDT = "";
    private ProgressDialog dialog;
    private String Password = "";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            setContentView(R.layout.login_activity);
            C = new Connection(this);
            g = Global.getInstance();

            final TextView UniqueUserId = (TextView) findViewById(R.id.UniqueUserId);
            final Spinner uid = (Spinner) findViewById(R.id.userId);
            final EditText pass = (EditText) findViewById(R.id.pass);
            TextView lblSystemDate = (TextView) findViewById(R.id.lblSystemDate);

            //Need to update date every time whenever shared updated system
            //*********************************************************************
            SystemUpdateDT = "16102016";  //Format: DDMMYYYY
            lblSystemDate.setText("Version: 1.0, Built on:" + SystemUpdateDT);

            //Check for Internet connectivity
            if (Connection.haveNetworkConnection(LoginActivity.this)) {
                netwoekAvailable = true;

            } else {
                netwoekAvailable = false;
            }


            //Rebuild Database
            String TotalTab = C.ReturnSingleValue("SELECT count(*) FROM sqlite_master WHERE type = 'table' AND name != 'android_metadata' AND name != 'sqlite_sequence'");

            if (Integer.valueOf(TotalTab) == 0) {
                if (netwoekAvailable) {
                    //Call Setting Form
                    finish();
                    Intent f1 = new Intent(getApplicationContext(), SettingForm.class);
                    startActivity(f1);
                    return;
                } else {
                    Connection.MessageBox(LoginActivity.this, "Internet connection is not available for building initial database.");
                    return;
                }
            }

            //Device Unique ID
            final String UniqueID = C.ReturnSingleValue("Select UserId from UserList");
            UniqueUserId.setText("Unique ID :" + UniqueID);
            g.setDeviceNo(UniqueID);

            //**************************************************************************************
            if (netwoekAvailable) {
                //Database Structure Update
                C.Sync_DatabaseStructure(UniqueID);
                C.Sync_Download("DataCollector", UniqueID, "");

                if (!C.Existence("Select * from VillageList limit 1")) {
                    C.Sync_Download("VillageList", UniqueID, "");
                }
            }
            //**************************************************************************************

            uid.setAdapter(C.getArrayAdapter("select UserId||'-'||UserName User from DataCollector where Active='1' order by UserName"));
            String[] CL = uid.getSelectedItem().toString().split("-");
            uid.setSelection(Global.SpinnerItemPosition(uid, CL[0].length(), C.ReturnSingleValue("Select UserId from LastLogin")));

            //Only for removing the data of training: 10 Oct 2016
            if (Global.DateNowDMY().equals("10/10/2016"))
            {
                /*if(!C.Existence("Select * from ProcessTab where Userid='"+ UniqueID +"' and ProcessId='1'")) {
                    C.Save("Delete from Screening");
                    C.Save("Delete from Agriculture");
                    C.Save("Delete from Anthro");
                    C.Save("Delete from AssetB");
                    C.Save("Delete from AssetNB");
                    C.Save("Delete from Careseek");
                    C.Save("Delete from Cost");
                    C.Save("Delete from Destruction1");
                    C.Save("Delete from Destruction2");
                    C.Save("Delete from DomViolance");
                    C.Save("Delete from EntryStatus");
                    C.Save("Delete from Father");
                    C.Save("Delete from FdHabit");
                    C.Save("Delete from FdHabitKnow");
                    C.Save("Delete from FoodDiversity");
                    C.Save("Delete from HandWash");
                    C.Save("Delete from HDDS");
                    C.Save("Delete from HFIAS");
                    C.Save("Delete from HHIdentity");
                    C.Save("Delete from IGA");
                    C.Save("Delete from Illness1");
                    C.Save("Delete from Illness2");
                    C.Save("Delete from Knowledge");
                    C.Save("Delete from Land");
                    C.Save("Delete from Loan");
                    C.Save("Delete from Member");
                    C.Save("Delete from NGOWork");
                    C.Save("Delete from NutHealth");
                    C.Save("Delete from PregHis");
                    C.Save("Delete from Savings");
                    C.Save("Delete from SES");
                    C.Save("Delete from WomenEmp");
                    C.Save("Delete from Father");
                }*/
            }

            Button btnClose = (Button) findViewById(R.id.btnClose);
            btnClose.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    finishAffinity();
                    System.exit(0);
                }
            });

            //Login -----------------------------------------------------------------------
            Button loginButton = (Button) findViewById(R.id.btnLogin);
            loginButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    try {
                        String[] U = Connection.split(uid.getSelectedItem().toString(), '-');
                        g.setUserId(U[0]);

                        if (pass.getText().toString().equals("start")) {
                            C.Save("Delete from Screening");
                            C.Save("Delete from Agriculture");
                            C.Save("Delete from Anthro");
                            C.Save("Delete from AssetB");
                            C.Save("Delete from AssetNB");
                            C.Save("Delete from Careseek");
                            C.Save("Delete from Cost");
                            C.Save("Delete from Destruction1");
                            C.Save("Delete from Destruction2");
                            C.Save("Delete from DomViolance");
                            C.Save("Delete from EntryStatus");
                            C.Save("Delete from Father");
                            C.Save("Delete from FdHabit");
                            C.Save("Delete from FdHabitKnow");
                            C.Save("Delete from FoodDiversity");
                            C.Save("Delete from HandWash");
                            C.Save("Delete from HDDS");
                            C.Save("Delete from HFIAS");
                            C.Save("Delete from HHIdentity");
                            C.Save("Delete from IGA");
                            C.Save("Delete from Illness1");
                            C.Save("Delete from Illness2");
                            C.Save("Delete from Knowledge");
                            C.Save("Delete from Land");
                            C.Save("Delete from Loan");
                            C.Save("Delete from Member");
                            C.Save("Delete from NGOWork");
                            C.Save("Delete from NutHealth");
                            C.Save("Delete from PregHis");
                            C.Save("Delete from Savings");
                            C.Save("Delete from SES");
                            C.Save("Delete from WomenEmp");
                            C.Save("Delete from Father");
                        }



                        if (!C.Existence("Select * from DataCollector where UserId='" + U[0] + "' and Pass='" + pass.getText().toString() + "'")) {
                            Connection.MessageBox(LoginActivity.this, "This is not a valid user id or password");
                            return;
                        }

                        //Store Last Login information
                        C.Save("Delete from LastLogin");
                        C.Save("Insert into LastLogin(UserId)Values('" + U[0] + "')");


                        //Download Updated System
                        //...................................................................................
                        if (netwoekAvailable == true) {
                            //Retrieve data from server for checking local device
                            String[] ServerVal = Connection.split(C.ReturnResult("ReturnSingleValue", "sp_ServerCheck '" + UniqueID + "'"), ',');
                            String ServerDate = ServerVal[0].toString();
                            String UpdateDT = ServerVal[1].toString();

                            //Check for New Version
                            if (!UpdateDT.equals(SystemUpdateDT)) {
                                systemDownload d = new systemDownload();
                                d.setContext(getApplicationContext());
                                d.execute(Global.UpdatedSystem);
                            } else {
                                //check for system date
                                if (ServerDate.equals(Global.TodaysDateforCheck()) == false) {
                                    Connection.MessageBox(LoginActivity.this, "আপনার ট্যাব এর তারিখ সঠিক নয় [" + Global.DateNowDMY() + "]।");
                                    startActivity(new Intent(android.provider.Settings.ACTION_DATE_SETTINGS));
                                    return;
                                }

                                final ProgressDialog progDailog = ProgressDialog.show(LoginActivity.this, "", "Please Wait . . .", true);

                                new Thread() {
                                    public void run() {
                                        try {
                                            finish();
                                            Intent f1 = new Intent(getApplicationContext(), MainMenu.class);
                                            startActivity(f1);
                                        } catch (Exception e) {

                                        }
                                        progDailog.dismiss();
                                    }
                                }.start();
                            }
                        } else {
                            final ProgressDialog progDailog = ProgressDialog.show(LoginActivity.this, "", "Please Wait . . .", true);

                            new Thread() {
                                public void run() {
                                    try {
                                        finish();
                                        Intent f1 = new Intent(getApplicationContext(), MainMenu.class);
                                        startActivity(f1);
                                    } catch (Exception e) {

                                    }
                                    progDailog.dismiss();
                                }
                            }.start();
                        }
                    } catch (Exception ex) {
                        //Connection.MessageBox(LoginActivity.this, ex.getMessage());
                        //return;
                        final ProgressDialog progDailog = ProgressDialog.show(LoginActivity.this, "", "Please Wait . . .", true);

                        new Thread() {
                            public void run() {
                                try {
                                    finish();
                                    Intent f1 = new Intent(getApplicationContext(), MainMenu.class);
                                    startActivity(f1);
                                } catch (Exception e) {

                                }
                                progDailog.dismiss();
                            }
                        }.start();
                    }
                }
            });
        } catch (Exception ex) {
            Connection.MessageBox(LoginActivity.this, ex.getMessage());
        }
    }

    //Install application
    private void InstallApplication() {
        File apkfile = new File(Environment.getExternalStorageDirectory() + File.separator + ProjectSetting.NewVersionName + ".apk");
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // without this flag android returned a intent error!
        intent.setDataAndType(Uri.parse("file://" + apkfile.toString()), "application/vnd.android.package-archive");

        startActivity(intent);
    }

    //Downloading updated system from the central server
    class systemDownload extends AsyncTask<String, String, Void> {
        private Context context;

        public void setContext(Context contextf) {
            context = contextf;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            dialog = new ProgressDialog(LoginActivity.this);
            dialog.setMessage("Downloading Updated System...");
            dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            dialog.setCancelable(false);
            dialog.show();
        }


        protected void onProgressUpdate(String... progress) {
            dialog.setProgress(Integer.parseInt(progress[0]));
            //publishProgress(progress);

        }

        //@Override
        protected void onPostExecute(String unused) {
            dialog.dismiss();
        }


        @Override
        protected Void doInBackground(String... arg0) {
            try {
                URL url = new URL(arg0[0]);
                HttpURLConnection c = (HttpURLConnection) url.openConnection();
                c.setRequestMethod("GET");
                c.connect();
                int lenghtOfFile = c.getContentLength();

                File file = Environment.getExternalStorageDirectory();

                file.mkdirs();
                File outputFile = new File(file.getAbsolutePath() + File.separator + ProjectSetting.NewVersionName + ".apk");

                if (outputFile.exists()) {
                    outputFile.delete();
                } else {
                    outputFile.createNewFile();
                }

                FileOutputStream fos = new FileOutputStream(outputFile);

                InputStream is = c.getInputStream();


                byte[] buffer = new byte[1024];
                int len1 = 0;
                long total = 0;
                while ((len1 = is.read(buffer)) != -1) {
                    fos.write(buffer, 0, len1);
                    count++;
                }
                fos.close();
                is.close();


                InstallApplication();

                dialog.dismiss();

            } catch (IOException e) {
                //Log.e("UpdateAPP", "Update error! " + e.getMessage());
            }
            return null;
        }
    }

}

