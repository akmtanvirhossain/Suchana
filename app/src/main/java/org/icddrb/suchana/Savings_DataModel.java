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
    private String _H101 = "";
    private String _H102 = "";
    private String _H103 = "";
    private String _H1031 = "";
    private String _H1032 = "";
    private String _H1033 = "";
    private String _H1034a = "";
    private String _H1034b = "";
    private String _H1034c = "";
    private String _H1035a = "";
    private String _H1035b = "";
    private String _H1035c = "";
    private String _H1035X = "";
    private String _H1036a = "";
    private String _H1036b = "";
    private String _H1036c = "";
    private String _H1036X = "";
    private String _StartTime = "";
    private String _EndTime = "";
    private String _UserId = "";
    private String _EntryUser = "";
    private String _Lat = "";
    private String _Lon = "";
    private String _EnDt = "";
    private String _Upload = "2";

    public String getUpload() {
        return _Upload;
    }

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

    public String getH1034a() {
        return _H1034a;
    }

    public void setH1034a(String newValue) {
        _H1034a = newValue;
    }

    public String getH1034b() {
        return _H1034b;
    }

    public void setH1034b(String newValue) {
        _H1034b = newValue;
    }

    public String getH1034c() {
        return _H1034c;
    }

    public void setH1034c(String newValue) {
        _H1034c = newValue;
    }

    public String getH1035a() {
        return _H1035a;
    }

    public void setH1035a(String newValue) {
        _H1035a = newValue;
    }

    public String getH1035b() {
        return _H1035b;
    }

    public void setH1035b(String newValue) {
        _H1035b = newValue;
    }

    public String getH1035c() {
        return _H1035c;
    }

    public void setH1035c(String newValue) {
        _H1035c = newValue;
    }

    public String getH1035X() {
        return _H1035X;
    }

    public void setH1035X(String newValue) {
        _H1035X = newValue;
    }

    public String getH1036a() {
        return _H1036a;
    }

    public void setH1036a(String newValue) {
        _H1036a = newValue;
    }

    public String getH1036b() {
        return _H1036b;
    }

    public void setH1036b(String newValue) {
        _H1036b = newValue;
    }

    public String getH1036c() {
        return _H1036c;
    }

    public void setH1036c(String newValue) {
        _H1036c = newValue;
    }

    public String getH1036X() {
        return _H1036X;
    }

    public void setH1036X(String newValue) {
        _H1036X = newValue;
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,H101,H102,H103,H1031,H1032,H1033,H1034a,H1034b,H1034c,H1035a,H1035b,H1035c,H1035X,H1036a,H1036b,H1036c,H1036X,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _H101 + "', '" + _H102 + "', '" + _H103 + "', '" + _H1031 + "', '" + _H1032 + "', '" + _H1033 + "', '" + _H1034a + "', '" + _H1034b + "', '" + _H1034c + "', '" + _H1035a + "', '" + _H1035b + "', '" + _H1035c + "', '" + _H1035X + "', '" + _H1036a + "', '" + _H1036b + "', '" + _H1036c + "', '" + _H1036X + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',H101 = '" + _H101 + "',H102 = '" + _H102 + "',H103 = '" + _H103 + "',H1031 = '" + _H1031 + "',H1032 = '" + _H1032 + "',H1033 = '" + _H1033 + "',H1034a = '" + _H1034a + "',H1034b = '" + _H1034b + "',H1034c = '" + _H1034c + "',H1035a = '" + _H1035a + "',H1035b = '" + _H1035b + "',H1035c = '" + _H1035c + "',H1035X = '" + _H1035X + "',H1036a = '" + _H1036a + "',H1036b = '" + _H1036b + "',H1036c = '" + _H1036c + "',H1036X = '" + _H1036X + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
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
            d._H101 = cur.getString(cur.getColumnIndex("H101"));
            d._H102 = cur.getString(cur.getColumnIndex("H102"));
            d._H103 = cur.getString(cur.getColumnIndex("H103"));
            d._H1031 = cur.getString(cur.getColumnIndex("H1031"));
            d._H1032 = cur.getString(cur.getColumnIndex("H1032"));
            d._H1033 = cur.getString(cur.getColumnIndex("H1033"));
            d._H1034a = cur.getString(cur.getColumnIndex("H1034a"));
            d._H1034b = cur.getString(cur.getColumnIndex("H1034b"));
            d._H1034c = cur.getString(cur.getColumnIndex("H1034c"));
            d._H1035a = cur.getString(cur.getColumnIndex("H1035a"));
            d._H1035b = cur.getString(cur.getColumnIndex("H1035b"));
            d._H1035c = cur.getString(cur.getColumnIndex("H1035c"));
            d._H1035X = cur.getString(cur.getColumnIndex("H1035X"));
            d._H1036a = cur.getString(cur.getColumnIndex("H1036a"));
            d._H1036b = cur.getString(cur.getColumnIndex("H1036b"));
            d._H1036c = cur.getString(cur.getColumnIndex("H1036c"));
            d._H1036X = cur.getString(cur.getColumnIndex("H1036X"));
            d._Upload = cur.getString(cur.getColumnIndex("Upload"));

            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}