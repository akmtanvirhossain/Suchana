package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class Savings_DataModel {

    String TableName = "Savings";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _MSlNo = "";
    private String _H101 = "";
    private String _H102 = "";
    private String _H103 = "";
    private String _H1031 = "";
    private String _H1032 = "";
    private String _H1033 = "";
    private String _H1034 = "";
    private String _H1035 = "";
    private String _H1036 = "";
    private String _H1037a = "";
    private String _H1037b = "";
    private String _H1037c = "";
    private String _H1037d = "";
    private String _H1037X = "";
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

    public String getMSlNo() {
        return _MSlNo;
    }

    public void setMSlNo(String newValue) {
        _MSlNo = newValue;
    }

    public String getH101() {
        return _H101;
    }

    public void setH101(String newValue) {
        _H101 = newValue;
    }

    public String getH102() {
        return _H102;
    }

    public void setH102(String newValue) {
        _H102 = newValue;
    }

    public String getH103() {
        return _H103;
    }

    public void setH103(String newValue) {
        _H103 = newValue;
    }

    public String getH1031() {
        return _H1031;
    }

    public void setH1031(String newValue) {
        _H1031 = newValue;
    }

    public String getH1032() {
        return _H1032;
    }

    public void setH1032(String newValue) {
        _H1032 = newValue;
    }

    public String getH1033() {
        return _H1033;
    }

    public void setH1033(String newValue) {
        _H1033 = newValue;
    }

    public String getH1034() {
        return _H1034;
    }

    public void setH1034(String newValue) {
        _H1034 = newValue;
    }

    public String getH1035() {
        return _H1035;
    }

    public void setH1035(String newValue) {
        _H1035 = newValue;
    }

    public String getH1036() {
        return _H1036;
    }

    public void setH1036(String newValue) {
        _H1036 = newValue;
    }

    public String getH1037a() {
        return _H1037a;
    }

    public void setH1037a(String newValue) {
        _H1037a = newValue;
    }

    public String getH1037b() {
        return _H1037b;
    }

    public void setH1037b(String newValue) {
        _H1037b = newValue;
    }

    public String getH1037c() {
        return _H1037c;
    }

    public void setH1037c(String newValue) {
        _H1037c = newValue;
    }

    public String getH1037d() {
        return _H1037d;
    }

    public void setH1037d(String newValue) {
        _H1037d = newValue;
    }

    public String getH1037X() {
        return _H1037X;
    }

    public void setH1037X(String newValue) {
        _H1037X = newValue;
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,MSlNo,H101,H102,H103,H1031,H1032,H1033,H1034,H1035,H1036,H1037a,H1037b,H1037c,H1037d,H1037X,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _MSlNo + "', '" + _H101 + "', '" + _H102 + "', '" + _H103 + "', '" + _H1031 + "', '" + _H1032 + "', '" + _H1033 + "', '" + _H1034 + "', '" + _H1035 + "', '" + _H1036 + "', '" + _H1037a + "', '" + _H1037b + "', '" + _H1037c + "', '" + _H1037d + "', '" + _H1037X + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',MSlNo = '" + _MSlNo + "',H101 = '" + _H101 + "',H102 = '" + _H102 + "',H103 = '" + _H103 + "',H1031 = '" + _H1031 + "',H1032 = '" + _H1032 + "',H1033 = '" + _H1033 + "',H1034 = '" + _H1034 + "',H1035 = '" + _H1035 + "',H1036 = '" + _H1036 + "',H1037a = '" + _H1037a + "',H1037b = '" + _H1037b + "',H1037c = '" + _H1037c + "',H1037d = '" + _H1037d + "',H1037X = '" + _H1037X + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<Savings_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<Savings_DataModel> data = new ArrayList<Savings_DataModel>();
        Savings_DataModel d = new Savings_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new Savings_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._MSlNo = cur.getString(cur.getColumnIndex("MSlNo"));
            d._H101 = cur.getString(cur.getColumnIndex("H101"));
            d._H102 = cur.getString(cur.getColumnIndex("H102"));
            d._H103 = cur.getString(cur.getColumnIndex("H103"));
            d._H1031 = cur.getString(cur.getColumnIndex("H1031"));
            d._H1032 = cur.getString(cur.getColumnIndex("H1032"));
            d._H1033 = cur.getString(cur.getColumnIndex("H1033"));
            d._H1034 = cur.getString(cur.getColumnIndex("H1034"));
            d._H1035 = cur.getString(cur.getColumnIndex("H1035"));
            d._H1036 = cur.getString(cur.getColumnIndex("H1036"));
            d._H1037a = cur.getString(cur.getColumnIndex("H1037a"));
            d._H1037b = cur.getString(cur.getColumnIndex("H1037b"));
            d._H1037c = cur.getString(cur.getColumnIndex("H1037c"));
            d._H1037d = cur.getString(cur.getColumnIndex("H1037d"));
            d._H1037X = cur.getString(cur.getColumnIndex("H1037X"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}