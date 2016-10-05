package org.icddrb.suchana;

/**
 * Created by TanvirHossain on 05/10/2016.
 */


import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class DomViolance_DataModel {

    String TableName = "DomViolance";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _M421 = "";
    private String _M422 = "";
    private String _M4231 = "";
    private String _M4232 = "";
    private String _M4233 = "";
    private String _M4234 = "";
    private String _M4235 = "";
    private String _M4236 = "";
    private String _M4237 = "";
    private String _M4238 = "";
    private String _M4239 = "";
    private String _M424a = "";
    private String _M424b = "";
    private String _M424c = "";
    private String _M424d = "";
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

    public String getM421() {
        return _M421;
    }

    public void setM421(String newValue) {
        _M421 = newValue;
    }

    public String getM422() {
        return _M422;
    }

    public void setM422(String newValue) {
        _M422 = newValue;
    }

    public String getM4231() {
        return _M4231;
    }

    public void setM4231(String newValue) {
        _M4231 = newValue;
    }

    public String getM4232() {
        return _M4232;
    }

    public void setM4232(String newValue) {
        _M4232 = newValue;
    }

    public String getM4233() {
        return _M4233;
    }

    public void setM4233(String newValue) {
        _M4233 = newValue;
    }

    public String getM4234() {
        return _M4234;
    }

    public void setM4234(String newValue) {
        _M4234 = newValue;
    }

    public String getM4235() {
        return _M4235;
    }

    public void setM4235(String newValue) {
        _M4235 = newValue;
    }

    public String getM4236() {
        return _M4236;
    }

    public void setM4236(String newValue) {
        _M4236 = newValue;
    }

    public String getM4237() {
        return _M4237;
    }

    public void setM4237(String newValue) {
        _M4237 = newValue;
    }

    public String getM4238() {
        return _M4238;
    }

    public void setM4238(String newValue) {
        _M4238 = newValue;
    }

    public String getM4239() {
        return _M4239;
    }

    public void setM4239(String newValue) {
        _M4239 = newValue;
    }

    public String getM424a() {
        return _M424a;
    }

    public void setM424a(String newValue) {
        _M424a = newValue;
    }

    public String getM424b() {
        return _M424b;
    }

    public void setM424b(String newValue) {
        _M424b = newValue;
    }

    public String getM424c() {
        return _M424c;
    }

    public void setM424c(String newValue) {
        _M424c = newValue;
    }

    public String getM424d() {
        return _M424d;
    }

    public void setM424d(String newValue) {
        _M424d = newValue;
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,M421,M422,M4231,M4232,M4233,M4234,M4235,M4236,M4237,M4238,M4239,M424a,M424b,M424c,M424d,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _M421 + "', '" + _M422 + "', '" + _M4231 + "', '" + _M4232 + "', '" + _M4233 + "', '" + _M4234 + "', '" + _M4235 + "', '" + _M4236 + "', '" + _M4237 + "', '" + _M4238 + "', '" + _M4239 + "', '" + _M424a + "', '" + _M424b + "', '" + _M424c + "', '" + _M424d + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',M421 = '" + _M421 + "',M422 = '" + _M422 + "',M4231 = '" + _M4231 + "',M4232 = '" + _M4232 + "',M4233 = '" + _M4233 + "',M4234 = '" + _M4234 + "',M4235 = '" + _M4235 + "',M4236 = '" + _M4236 + "',M4237 = '" + _M4237 + "',M4238 = '" + _M4238 + "',M4239 = '" + _M4239 + "',M424a = '" + _M424a + "',M424b = '" + _M424b + "',M424c = '" + _M424c + "',M424d = '" + _M424d + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<DomViolance_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<DomViolance_DataModel> data = new ArrayList<DomViolance_DataModel>();
        DomViolance_DataModel d = new DomViolance_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new DomViolance_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._M421 = cur.getString(cur.getColumnIndex("M421"));
            d._M422 = cur.getString(cur.getColumnIndex("M422"));
            d._M4231 = cur.getString(cur.getColumnIndex("M4231"));
            d._M4232 = cur.getString(cur.getColumnIndex("M4232"));
            d._M4233 = cur.getString(cur.getColumnIndex("M4233"));
            d._M4234 = cur.getString(cur.getColumnIndex("M4234"));
            d._M4235 = cur.getString(cur.getColumnIndex("M4235"));
            d._M4236 = cur.getString(cur.getColumnIndex("M4236"));
            d._M4237 = cur.getString(cur.getColumnIndex("M4237"));
            d._M4238 = cur.getString(cur.getColumnIndex("M4238"));
            d._M4239 = cur.getString(cur.getColumnIndex("M4239"));
            d._M424a = cur.getString(cur.getColumnIndex("M424a"));
            d._M424b = cur.getString(cur.getColumnIndex("M424b"));
            d._M424c = cur.getString(cur.getColumnIndex("M424c"));
            d._M424d = cur.getString(cur.getColumnIndex("M424d"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}