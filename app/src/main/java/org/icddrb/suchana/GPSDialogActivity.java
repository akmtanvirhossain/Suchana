package org.icddrb.suchana;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class GPSDialogActivity extends Activity implements LocationListener {
    Location currentLocation;
    double currentLatitude, currentLongitude;

    EditText editTextID, editTextLat, editTextLong, editTextLandmarkName, editTextEstablished,
            editTextContact, editTextNote, editTextAccuracy, editTextSatCount;
    String mUserID = "", mLat = "0", mLong = "0", mLandmarkName = "", mEstablished = "", mContact = "",
            mNote = "", mAccuracy = "0", mSatCount = "0";

    RadioGroup radioGroupLocType;
    RadioButton radioButtonBari, radioButtonLandmark;
    Spinner spinnerLandmarkList;
    Button btnSave;
    LocationManager locationManager;

    Bundle IDbundle;
    static String RND = "";
    static String SUCHANAID = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        turnGPSOn();
        FindLocation();

        IDbundle = getIntent().getExtras();
        RND = IDbundle.getString("Rnd");
        SUCHANAID = IDbundle.getString("SuchanaID");



        locationManager = (LocationManager) this
                .getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            //return;
        }
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
        setContentView(R.layout.activity_gpsdialog);



        editTextLat = (EditText) findViewById(R.id.editTextLatitude);
        editTextLong = (EditText) findViewById(R.id.editTextLongitude);

        editTextAccuracy = (EditText) findViewById(R.id.editTextAccuracy);
        editTextSatCount = (EditText) findViewById(R.id.editTextSatelite);


        btnSave = (Button) findViewById(R.id.cmdSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveGPSFormData();
            }
        });

    }

    private void saveGPSFormData() {
        mLat = editTextLat.getText().toString();
        mLong = editTextLong.getText().toString();
        mAccuracy = editTextAccuracy.getText().toString();
        mSatCount = editTextSatCount.getText().toString();
    }

    //GPS Reading
    //............................................................................................
    public void FindLocation() {

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission
                (this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED)
        {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }

/*        LocationListener locationListener = new LocationListener() {
            public void onLocationChanged(Location location) {
                updateLocation(location);
            }

            public void onStatusChanged(String provider, int status,
                                        Bundle extras) {
            }

            public void onProviderEnabled(String provider) {
            }

            public void onProviderDisabled(String provider) {
            }
        };*/
      //  locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
    }

    void updateLocation(Location location) {
      //  int nsat=location.getExtras().getInt("satellites", -1);
        mSatCount = String.valueOf(location.getExtras().getInt("satellites", -1));
        currentLocation = location;
        currentLatitude = currentLocation.getLatitude();
        currentLongitude = currentLocation.getLongitude();
        mAccuracy = String.valueOf(currentLocation.getAccuracy());
        editTextLat.setText(String.valueOf(currentLatitude));
        editTextLong.setText(String.valueOf(currentLongitude));
        if(mAccuracy.equalsIgnoreCase("1"))
        {
            editTextAccuracy.setText(String.valueOf("Yes"));
        }
        else
        {
            editTextAccuracy.setText(String.valueOf("No"));
        }
        editTextSatCount.setText(String.valueOf(mSatCount));
    }

    // Method to turn on GPS
    public void turnGPSOn(){
        try
        {
            String provider = Settings.Secure.getString(getContentResolver(), Settings.Secure.LOCATION_PROVIDERS_ALLOWED);

            if(!provider.contains("gps")){ //if gps is disabled
                final Intent poke = new Intent();
                poke.setClassName("com.android.settings", "com.android.settings.widget.SettingsAppWidgetProvider");
                poke.addCategory(Intent.CATEGORY_ALTERNATIVE);
                poke.setData(Uri.parse("3"));
                sendBroadcast(poke);
            }
        }
        catch (Exception e) {

        }
    }

    // Method to turn off the GPS
    public void turnGPSOff(){
        String provider = Settings.Secure.getString(getContentResolver(), Settings.Secure.LOCATION_PROVIDERS_ALLOWED);

        if(provider.contains("gps")){ //if gps is enabled
            final Intent poke = new Intent();
            poke.setClassName("com.android.settings", "com.android.settings.widget.SettingsAppWidgetProvider");
            poke.addCategory(Intent.CATEGORY_ALTERNATIVE);
            poke.setData(Uri.parse("3"));
            sendBroadcast(poke);
        }
    }

    // turning off the GPS if its in on state. to avoid the battery drain.
    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        turnGPSOff();
    }

    @Override
    public void onLocationChanged(Location location) {
        updateLocation(location);
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}

