package org.icddrb.suchana;

/**
 * Created by TanvirHossain on 05/10/2016.
 */


import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class Anthro_DataModel {

    String TableName = "Anthro";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _C2MCWeight1 = "";
    private String _C2MWeight1 = "";
    private String _C2CWeight1 = "";
    private String _C2MCWeight2 = "";
    private String _C2MWeight2 = "";
    private String _C2CWeight2 = "";
    private String _C2MCWeight3 = "";
    private String _C2MWeight3 = "";
    private String _C2CWeight3 = "";
    private String _C2CHeight1 = "";
    private String _C2CHeight2 = "";
    private String _C2CHeight3 = "";
    private String _C2MHeight1 = "";
    private String _C2MHeight2 = "";
    private String _C2MHeight3 = "";
    private String _C2CMUAC1 = "";
    private String _C2CMUAC2 = "";
    private String _C2CMUAC3 = "";
    private String _C2MMUAC1 = "";
    private String _C2MMUAC2 = "";
    private String _C2MMUAC3 = "";
    private String _C2Haemoglobin = "";
    private String _StartTime = "";
    private String _EndTime = "";
    private String _UserId = "";
    private String _EntryUser = "";
    private String _Lat = "";
    private String _Lon = "";
    private String _EnDt = "";
    private String _Upload = "2";

    public String getRnd() {
        return _Rnd;
    }

    public void setRnd(String newValue) {
        _Rnd = newValue;
    }

    public String getSuchanaID() {
        return _SuchanaID;
    }

    public void setSuchanaID(String newValue) {
        _SuchanaID = newValue;
    }

    public String getC2MCWeight1() {
        return _C2MCWeight1;
    }

    public void setC2MCWeight1(String newValue) {
        _C2MCWeight1 = newValue;
    }

    public String getC2MWeight1() {
        return _C2MWeight1;
    }

    public void setC2MWeight1(String newValue) {
        _C2MWeight1 = newValue;
    }

    public String getC2CWeight1() {
        return _C2CWeight1;
    }

    public void setC2CWeight1(String newValue) {
        _C2CWeight1 = newValue;
    }

    public String getC2MCWeight2() {
        return _C2MCWeight2;
    }

    public void setC2MCWeight2(String newValue) {
        _C2MCWeight2 = newValue;
    }

    public String getC2MWeight2() {
        return _C2MWeight2;
    }

    public void setC2MWeight2(String newValue) {
        _C2MWeight2 = newValue;
    }

    public String getC2CWeight2() {
        return _C2CWeight2;
    }

    public void setC2CWeight2(String newValue) {
        _C2CWeight2 = newValue;
    }

    public String getC2MCWeight3() {
        return _C2MCWeight3;
    }

    public void setC2MCWeight3(String newValue) {
        _C2MCWeight3 = newValue;
    }

    public String getC2MWeight3() {
        return _C2MWeight3;
    }

    public void setC2MWeight3(String newValue) {
        _C2MWeight3 = newValue;
    }

    public String getC2CWeight3() {
        return _C2CWeight3;
    }

    public void setC2CWeight3(String newValue) {
        _C2CWeight3 = newValue;
    }

    public String getC2CHeight1() {
        return _C2CHeight1;
    }

    public void setC2CHeight1(String newValue) {
        _C2CHeight1 = newValue;
    }

    public String getC2CHeight2() {
        return _C2CHeight2;
    }

    public void setC2CHeight2(String newValue) {
        _C2CHeight2 = newValue;
    }

    public String getC2CHeight3() {
        return _C2CHeight3;
    }

    public void setC2CHeight3(String newValue) {
        _C2CHeight3 = newValue;
    }

    public String getC2MHeight1() {
        return _C2MHeight1;
    }

    public void setC2MHeight1(String newValue) {
        _C2MHeight1 = newValue;
    }

    public String getC2MHeight2() {
        return _C2MHeight2;
    }

    public void setC2MHeight2(String newValue) {
        _C2MHeight2 = newValue;
    }

    public String getC2MHeight3() {
        return _C2MHeight3;
    }

    public void setC2MHeight3(String newValue) {
        _C2MHeight3 = newValue;
    }

    public String getC2CMUAC1() {
        return _C2CMUAC1;
    }

    public void setC2CMUAC1(String newValue) {
        _C2CMUAC1 = newValue;
    }

    public String getC2CMUAC2() {
        return _C2CMUAC2;
    }

    public void setC2CMUAC2(String newValue) {
        _C2CMUAC2 = newValue;
    }

    public String getC2CMUAC3() {
        return _C2CMUAC3;
    }

    public void setC2CMUAC3(String newValue) {
        _C2CMUAC3 = newValue;
    }

    public String getC2MMUAC1() {
        return _C2MMUAC1;
    }

    public void setC2MMUAC1(String newValue) {
        _C2MMUAC1 = newValue;
    }

    public String getC2MMUAC2() {
        return _C2MMUAC2;
    }

    public void setC2MMUAC2(String newValue) {
        _C2MMUAC2 = newValue;
    }

    public String getC2MMUAC3() {
        return _C2MMUAC3;
    }

    public void setC2MMUAC3(String newValue) {
        _C2MMUAC3 = newValue;
    }

    public String getC2Haemoglobin() {
        return _C2Haemoglobin;
    }

    public void setC2Haemoglobin(String newValue) {
        _C2Haemoglobin = newValue;
    }

    public void setStartTime(String newValue) {
        _StartTime = newValue;
    }

    public void setEndTime(String newValue) {
        _EndTime = newValue;
    }

    public void setUserId(String newValue) {
        _UserId = newValue;
    }

    public void setEntryUser(String newValue) {
        _EntryUser = newValue;
    }

    public void setLat(String newValue) {
        _Lat = newValue;
    }

    public void setLon(String newValue) {
        _Lon = newValue;
    }

    public void setEnDt(String newValue) {
        _EnDt = newValue;
    }

    public String SaveUpdateData(Context context) {
        String response = "";
        C = new Connection(context);
        String SQL = "";
        try {
            if (C.Existence("Select * from " + TableName + "  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "' "))
                response = UpdateData(context);
            else
                response = SaveData(context);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }

    private String SaveData(Context context) {
        String response = "";
        C = new Connection(context);
        String SQL = "";
        try {
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,C2MCWeight1,C2MWeight1,C2CWeight1,C2MCWeight2,C2MWeight2,C2CWeight2,C2MCWeight3,C2MWeight3,C2CWeight3,C2CHeight1,C2CHeight2,C2CHeight3,C2MHeight1,C2MHeight2,C2MHeight3,C2CMUAC1,C2CMUAC2,C2CMUAC3,C2MMUAC1,C2MMUAC2,C2MMUAC3,C2Haemoglobin,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _C2MCWeight1 + "', '" + _C2MWeight1 + "', '" + _C2CWeight1 + "', '" + _C2MCWeight2 + "', '" + _C2MWeight2 + "', '" + _C2CWeight2 + "', '" + _C2MCWeight3 + "', '" + _C2MWeight3 + "', '" + _C2CWeight3 + "', '" + _C2CHeight1 + "', '" + _C2CHeight2 + "', '" + _C2CHeight3 + "', '" + _C2MHeight1 + "', '" + _C2MHeight2 + "', '" + _C2MHeight3 + "', '" + _C2CMUAC1 + "', '" + _C2CMUAC2 + "', '" + _C2CMUAC3 + "', '" + _C2MMUAC1 + "', '" + _C2MMUAC2 + "', '" + _C2MMUAC3 + "', '" + _C2Haemoglobin + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }

    private String UpdateData(Context context) {
        String response = "";
        C = new Connection(context);
        String SQL = "";
        try {
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',C2MCWeight1 = '" + _C2MCWeight1 + "',C2MWeight1 = '" + _C2MWeight1 + "',C2CWeight1 = '" + _C2CWeight1 + "',C2MCWeight2 = '" + _C2MCWeight2 + "',C2MWeight2 = '" + _C2MWeight2 + "',C2CWeight2 = '" + _C2CWeight2 + "',C2MCWeight3 = '" + _C2MCWeight3 + "',C2MWeight3 = '" + _C2MWeight3 + "',C2CWeight3 = '" + _C2CWeight3 + "',C2CHeight1 = '" + _C2CHeight1 + "',C2CHeight2 = '" + _C2CHeight2 + "',C2CHeight3 = '" + _C2CHeight3 + "',C2MHeight1 = '" + _C2MHeight1 + "',C2MHeight2 = '" + _C2MHeight2 + "',C2MHeight3 = '" + _C2MHeight3 + "',C2CMUAC1 = '" + _C2CMUAC1 + "',C2CMUAC2 = '" + _C2CMUAC2 + "',C2CMUAC3 = '" + _C2CMUAC3 + "',C2MMUAC1 = '" + _C2MMUAC1 + "',C2MMUAC2 = '" + _C2MMUAC2 + "',C2MMUAC3 = '" + _C2MMUAC3 + "',C2Haemoglobin = '" + _C2Haemoglobin + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<Anthro_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<Anthro_DataModel> data = new ArrayList<Anthro_DataModel>();
        Anthro_DataModel d = new Anthro_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new Anthro_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._C2MCWeight1 = cur.getString(cur.getColumnIndex("C2MCWeight1"));
            d._C2MWeight1 = cur.getString(cur.getColumnIndex("C2MWeight1"));
            d._C2CWeight1 = cur.getString(cur.getColumnIndex("C2CWeight1"));
            d._C2MCWeight2 = cur.getString(cur.getColumnIndex("C2MCWeight2"));
            d._C2MWeight2 = cur.getString(cur.getColumnIndex("C2MWeight2"));
            d._C2CWeight2 = cur.getString(cur.getColumnIndex("C2CWeight2"));
            d._C2MCWeight3 = cur.getString(cur.getColumnIndex("C2MCWeight3"));
            d._C2MWeight3 = cur.getString(cur.getColumnIndex("C2MWeight3"));
            d._C2CWeight3 = cur.getString(cur.getColumnIndex("C2CWeight3"));
            d._C2CHeight1 = cur.getString(cur.getColumnIndex("C2CHeight1"));
            d._C2CHeight2 = cur.getString(cur.getColumnIndex("C2CHeight2"));
            d._C2CHeight3 = cur.getString(cur.getColumnIndex("C2CHeight3"));
            d._C2MHeight1 = cur.getString(cur.getColumnIndex("C2MHeight1"));
            d._C2MHeight2 = cur.getString(cur.getColumnIndex("C2MHeight2"));
            d._C2MHeight3 = cur.getString(cur.getColumnIndex("C2MHeight3"));
            d._C2CMUAC1 = cur.getString(cur.getColumnIndex("C2CMUAC1"));
            d._C2CMUAC2 = cur.getString(cur.getColumnIndex("C2CMUAC2"));
            d._C2CMUAC3 = cur.getString(cur.getColumnIndex("C2CMUAC3"));
            d._C2MMUAC1 = cur.getString(cur.getColumnIndex("C2MMUAC1"));
            d._C2MMUAC2 = cur.getString(cur.getColumnIndex("C2MMUAC2"));
            d._C2MMUAC3 = cur.getString(cur.getColumnIndex("C2MMUAC3"));
            d._C2Haemoglobin = cur.getString(cur.getColumnIndex("C2Haemoglobin"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}