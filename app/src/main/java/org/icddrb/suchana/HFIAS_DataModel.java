package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class HFIAS_DataModel {

    String TableName = "HFIAS";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _H121a = "";
    private String _H121b = "";
    private String _H122a = "";
    private String _H122b = "";
    private String _H123a = "";
    private String _H123b = "";
    private String _H124a = "";
    private String _H124b = "";
    private String _H125a = "";
    private String _H125b = "";
    private String _H126a = "";
    private String _H126b = "";
    private String _H127a = "";
    private String _H127b = "";
    private String _H128a = "";
    private String _H128b = "";
    private String _H129a = "";
    private String _H129b = "";
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

    public String getH121a() {
        return _H121a;
    }

    public void setH121a(String newValue) {
        _H121a = newValue;
    }

    public String getH121b() {
        return _H121b;
    }

    public void setH121b(String newValue) {
        _H121b = newValue;
    }

    public String getH122a() {
        return _H122a;
    }

    public void setH122a(String newValue) {
        _H122a = newValue;
    }

    public String getH122b() {
        return _H122b;
    }

    public void setH122b(String newValue) {
        _H122b = newValue;
    }

    public String getH123a() {
        return _H123a;
    }

    public void setH123a(String newValue) {
        _H123a = newValue;
    }

    public String getH123b() {
        return _H123b;
    }

    public void setH123b(String newValue) {
        _H123b = newValue;
    }

    public String getH124a() {
        return _H124a;
    }

    public void setH124a(String newValue) {
        _H124a = newValue;
    }

    public String getH124b() {
        return _H124b;
    }

    public void setH124b(String newValue) {
        _H124b = newValue;
    }

    public String getH125a() {
        return _H125a;
    }

    public void setH125a(String newValue) {
        _H125a = newValue;
    }

    public String getH125b() {
        return _H125b;
    }

    public void setH125b(String newValue) {
        _H125b = newValue;
    }

    public String getH126a() {
        return _H126a;
    }

    public void setH126a(String newValue) {
        _H126a = newValue;
    }

    public String getH126b() {
        return _H126b;
    }

    public void setH126b(String newValue) {
        _H126b = newValue;
    }

    public String getH127a() {
        return _H127a;
    }

    public void setH127a(String newValue) {
        _H127a = newValue;
    }

    public String getH127b() {
        return _H127b;
    }

    public void setH127b(String newValue) {
        _H127b = newValue;
    }

    public String getH128a() {
        return _H128a;
    }

    public void setH128a(String newValue) {
        _H128a = newValue;
    }

    public String getH128b() {
        return _H128b;
    }

    public void setH128b(String newValue) {
        _H128b = newValue;
    }

    public String getH129a() {
        return _H129a;
    }

    public void setH129a(String newValue) {
        _H129a = newValue;
    }

    public String getH129b() {
        return _H129b;
    }

    public void setH129b(String newValue) {
        _H129b = newValue;
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,H121a,H121b,H122a,H122b,H123a,H123b,H124a,H124b,H125a,H125b,H126a,H126b,H127a,H127b,H128a,H128b,H129a,H129b,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _H121a + "', '" + _H121b + "', '" + _H122a + "', '" + _H122b + "', '" + _H123a + "', '" + _H123b + "', '" + _H124a + "', '" + _H124b + "', '" + _H125a + "', '" + _H125b + "', '" + _H126a + "', '" + _H126b + "', '" + _H127a + "', '" + _H127b + "', '" + _H128a + "', '" + _H128b + "', '" + _H129a + "', '" + _H129b + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',H121a = '" + _H121a + "',H121b = '" + _H121b + "',H122a = '" + _H122a + "',H122b = '" + _H122b + "',H123a = '" + _H123a + "',H123b = '" + _H123b + "',H124a = '" + _H124a + "',H124b = '" + _H124b + "',H125a = '" + _H125a + "',H125b = '" + _H125b + "',H126a = '" + _H126a + "',H126b = '" + _H126b + "',H127a = '" + _H127a + "',H127b = '" + _H127b + "',H128a = '" + _H128a + "',H128b = '" + _H128b + "',H129a = '" + _H129a + "',H129b = '" + _H129b + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<HFIAS_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<HFIAS_DataModel> data = new ArrayList<HFIAS_DataModel>();
        HFIAS_DataModel d = new HFIAS_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new HFIAS_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._H121a = cur.getString(cur.getColumnIndex("H121a"));
            d._H121b = cur.getString(cur.getColumnIndex("H121b"));
            d._H122a = cur.getString(cur.getColumnIndex("H122a"));
            d._H122b = cur.getString(cur.getColumnIndex("H122b"));
            d._H123a = cur.getString(cur.getColumnIndex("H123a"));
            d._H123b = cur.getString(cur.getColumnIndex("H123b"));
            d._H124a = cur.getString(cur.getColumnIndex("H124a"));
            d._H124b = cur.getString(cur.getColumnIndex("H124b"));
            d._H125a = cur.getString(cur.getColumnIndex("H125a"));
            d._H125b = cur.getString(cur.getColumnIndex("H125b"));
            d._H126a = cur.getString(cur.getColumnIndex("H126a"));
            d._H126b = cur.getString(cur.getColumnIndex("H126b"));
            d._H127a = cur.getString(cur.getColumnIndex("H127a"));
            d._H127b = cur.getString(cur.getColumnIndex("H127b"));
            d._H128a = cur.getString(cur.getColumnIndex("H128a"));
            d._H128b = cur.getString(cur.getColumnIndex("H128b"));
            d._H129a = cur.getString(cur.getColumnIndex("H129a"));
            d._H129b = cur.getString(cur.getColumnIndex("H129b"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}