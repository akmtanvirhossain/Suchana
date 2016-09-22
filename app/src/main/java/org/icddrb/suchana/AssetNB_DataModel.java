package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class AssetNB_DataModel {

    String TableName = "AssetNB";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _H42a = "";
    private String _H42aX = "";
    private String _H42b = "";
    private String _H42c = "";
    private String _H42d1 = "";
    private String _H42d2 = "";
    private String _H42d3 = "";
    private String _H42d4 = "";
    private String _H42d4X = "";
    private String _H42d4X1 = "";
    private String _H42d4X2 = "";
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

    public String getH42a() {
        return _H42a;
    }

    public void setH42a(String newValue) {
        _H42a = newValue;
    }

    public String getH42aX() {
        return _H42aX;
    }

    public void setH42aX(String newValue) {
        _H42aX = newValue;
    }

    public String getH42b() {
        return _H42b;
    }

    public void setH42b(String newValue) {
        _H42b = newValue;
    }

    public String getH42c() {
        return _H42c;
    }

    public void setH42c(String newValue) {
        _H42c = newValue;
    }

    public String getH42d1() {
        return _H42d1;
    }

    public void setH42d1(String newValue) {
        _H42d1 = newValue;
    }

    public String getH42d2() {
        return _H42d2;
    }

    public void setH42d2(String newValue) {
        _H42d2 = newValue;
    }

    public String getH42d3() {
        return _H42d3;
    }

    public void setH42d3(String newValue) {
        _H42d3 = newValue;
    }

    public String getH42d4() {
        return _H42d4;
    }

    public void setH42d4(String newValue) {
        _H42d4 = newValue;
    }

    public String getH42d4X() {
        return _H42d4X;
    }

    public void setH42d4X(String newValue) {
        _H42d4X = newValue;
    }

    public String getH42d4X1() {
        return _H42d4X1;
    }

    public void setH42d4X1(String newValue) {
        _H42d4X1 = newValue;
    }

    public String getH42d4X2() {
        return _H42d4X2;
    }

    public void setH42d4X2(String newValue) {
        _H42d4X2 = newValue;
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
            if (C.Existence("Select * from " + TableName + "  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "' and H42a='" + _H42a + "' "))
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,H42a,H42aX,H42b,H42c,H42d1,H42d2,H42d3,H42d4,H42d4X,H42d4X1,H42d4X2,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _H42a + "', '" + _H42aX + "', '" + _H42b + "', '" + _H42c + "', '" + _H42d1 + "', '" + _H42d2 + "', '" + _H42d3 + "', '" + _H42d4 + "', '" + _H42d4X + "', '" + _H42d4X1 + "', '" + _H42d4X2 + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',H42a = '" + _H42a + "',H42aX = '" + _H42aX + "',H42b = '" + _H42b + "',H42c = '" + _H42c + "',H42d1 = '" + _H42d1 + "',H42d2 = '" + _H42d2 + "',H42d3 = '" + _H42d3 + "',H42d4 = '" + _H42d4 + "',H42d4X = '" + _H42d4X + "',H42d4X1 = '" + _H42d4X1 + "',H42d4X2 = '" + _H42d4X2 + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "' and H42a='" + _H42a + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<AssetNB_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<AssetNB_DataModel> data = new ArrayList<AssetNB_DataModel>();
        AssetNB_DataModel d = new AssetNB_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new AssetNB_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._H42a = cur.getString(cur.getColumnIndex("H42a"));
            d._H42aX = cur.getString(cur.getColumnIndex("H42aX"));
            d._H42b = cur.getString(cur.getColumnIndex("H42b"));
            d._H42c = cur.getString(cur.getColumnIndex("H42c"));
            d._H42d1 = cur.getString(cur.getColumnIndex("H42d1"));
            d._H42d2 = cur.getString(cur.getColumnIndex("H42d2"));
            d._H42d3 = cur.getString(cur.getColumnIndex("H42d3"));
            d._H42d4 = cur.getString(cur.getColumnIndex("H42d4"));
            d._H42d4X = cur.getString(cur.getColumnIndex("H42d4X"));
            d._H42d4X1 = cur.getString(cur.getColumnIndex("H42d4X1"));
            d._H42d4X2 = cur.getString(cur.getColumnIndex("H42d4X2"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}