package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class Agriculture_DataModel {

    String TableName = "Agriculture";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _H151 = "";
    private String _Sl = "";
    private String _H152a = "";
    private String _H152bOth = "";
    private String _H152b = "";
    private String _H152c = "";
    private String _H152d1 = "";
    private String _H152d2 = "";
    private String _H152e1 = "";
    private String _H152e2 = "";
    private String _H152f = "";
    private String _H152g = "";
    private String _H152h1 = "";
    private String _H152h2 = "";
    private String _H152i1 = "";
    private String _H152i2 = "";
    private String _H152j1 = "";
    private String _H152j2 = "";
    private String _H152k1 = "";
    private String _H152k2 = "";
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

    public String getH151() {
        return _H151;
    }

    public void setH151(String newValue) {
        _H151 = newValue;
    }

    public String getSl() {
        return _Sl;
    }

    public void setSl(String newValue) {
        _Sl = newValue;
    }

    public String getH152a() {
        return _H152a;
    }

    public void setH152a(String newValue) {
        _H152a = newValue;
    }

    public String getH152bOth() {
        return _H152bOth;
    }

    public void setH152bOth(String newValue) {
        _H152bOth = newValue;
    }

    public String getH152b() {
        return _H152b;
    }

    public void setH152b(String newValue) {
        _H152b = newValue;
    }

    public String getH152c() {
        return _H152c;
    }

    public void setH152c(String newValue) {
        _H152c = newValue;
    }

    public String getH152d1() {
        return _H152d1;
    }

    public void setH152d1(String newValue) {
        _H152d1 = newValue;
    }

    public String getH152d2() {
        return _H152d2;
    }

    public void setH152d2(String newValue) {
        _H152d2 = newValue;
    }

    public String getH152e1() {
        return _H152e1;
    }

    public void setH152e1(String newValue) {
        _H152e1 = newValue;
    }

    public String getH152e2() {
        return _H152e2;
    }

    public void setH152e2(String newValue) {
        _H152e2 = newValue;
    }

    public String getH152f() {
        return _H152f;
    }

    public void setH152f(String newValue) {
        _H152f = newValue;
    }

    public String getH152g() {
        return _H152g;
    }

    public void setH152g(String newValue) {
        _H152g = newValue;
    }

    public String getH152h1() {
        return _H152h1;
    }

    public void setH152h1(String newValue) {
        _H152h1 = newValue;
    }

    public String getH152h2() {
        return _H152h2;
    }

    public void setH152h2(String newValue) {
        _H152h2 = newValue;
    }

    public String getH152i1() {
        return _H152i1;
    }

    public void setH152i1(String newValue) {
        _H152i1 = newValue;
    }

    public String getH152i2() {
        return _H152i2;
    }

    public void setH152i2(String newValue) {
        _H152i2 = newValue;
    }

    public String getH152j1() {
        return _H152j1;
    }

    public void setH152j1(String newValue) {
        _H152j1 = newValue;
    }

    public String getH152j2() {
        return _H152j2;
    }

    public void setH152j2(String newValue) {
        _H152j2 = newValue;
    }

    public String getH152k1() {
        return _H152k1;
    }

    public void setH152k1(String newValue) {
        _H152k1 = newValue;
    }

    public String getH152k2() {
        return _H152k2;
    }

    public void setH152k2(String newValue) {
        _H152k2 = newValue;
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
            if (C.Existence("Select * from " + TableName + "  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "' and Sl='" + _Sl + "' "))
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,H151,Sl,H152a,H152bOth,H152b,H152c,H152d1,H152d2,H152e1,H152e2,H152f,H152g,H152h1,H152h2,H152i1,H152i2,H152j1,H152j2,H152k1,H152k2,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _H151 + "', '" + _Sl + "', '" + _H152a + "', '" + _H152bOth + "', '" + _H152b + "', '" + _H152c + "', '" + _H152d1 + "', '" + _H152d2 + "', '" + _H152e1 + "', '" + _H152e2 + "', '" + _H152f + "', '" + _H152g + "', '" + _H152h1 + "', '" + _H152h2 + "', '" + _H152i1 + "', '" + _H152i2 + "', '" + _H152j1 + "', '" + _H152j2 + "', '" + _H152k1 + "', '" + _H152k2 + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',H151 = '" + _H151 + "',Sl = '" + _Sl + "',H152a = '" + _H152a + "',H152bOth = '" + _H152bOth + "',H152b = '" + _H152b + "',H152c = '" + _H152c + "',H152d1 = '" + _H152d1 + "',H152d2 = '" + _H152d2 + "',H152e1 = '" + _H152e1 + "',H152e2 = '" + _H152e2 + "',H152f = '" + _H152f + "',H152g = '" + _H152g + "',H152h1 = '" + _H152h1 + "',H152h2 = '" + _H152h2 + "',H152i1 = '" + _H152i1 + "',H152i2 = '" + _H152i2 + "',H152j1 = '" + _H152j1 + "',H152j2 = '" + _H152j2 + "',H152k1 = '" + _H152k1 + "',H152k2 = '" + _H152k2 + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "' and Sl='" + _Sl + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<Agriculture_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<Agriculture_DataModel> data = new ArrayList<Agriculture_DataModel>();
        Agriculture_DataModel d = new Agriculture_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new Agriculture_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._H151 = cur.getString(cur.getColumnIndex("H151"));
            d._Sl = cur.getString(cur.getColumnIndex("Sl"));
            d._H152a = cur.getString(cur.getColumnIndex("H152a"));
            d._H152bOth = cur.getString(cur.getColumnIndex("H152bOth"));
            d._H152b = cur.getString(cur.getColumnIndex("H152b"));
            d._H152c = cur.getString(cur.getColumnIndex("H152c"));
            d._H152d1 = cur.getString(cur.getColumnIndex("H152d1"));
            d._H152d2 = cur.getString(cur.getColumnIndex("H152d2"));
            d._H152e1 = cur.getString(cur.getColumnIndex("H152e1"));
            d._H152e2 = cur.getString(cur.getColumnIndex("H152e2"));
            d._H152f = cur.getString(cur.getColumnIndex("H152f"));
            d._H152g = cur.getString(cur.getColumnIndex("H152g"));
            d._H152h1 = cur.getString(cur.getColumnIndex("H152h1"));
            d._H152h2 = cur.getString(cur.getColumnIndex("H152h2"));
            d._H152i1 = cur.getString(cur.getColumnIndex("H152i1"));
            d._H152i2 = cur.getString(cur.getColumnIndex("H152i2"));
            d._H152j1 = cur.getString(cur.getColumnIndex("H152j1"));
            d._H152j2 = cur.getString(cur.getColumnIndex("H152j2"));
            d._H152k1 = cur.getString(cur.getColumnIndex("H152k1"));
            d._H152k2 = cur.getString(cur.getColumnIndex("H152k2"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}