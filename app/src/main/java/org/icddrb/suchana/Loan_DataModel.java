package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class Loan_DataModel {

    String TableName = "Loan";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _MSlNo = "";
    private String _H111 = "";
    private String _H112 = "";
    private String _H113 = "";
    private String _H113X = "";
    private String _H114a = "";
    private String _H114b = "";
    private String _H114c = "";
    private String _H114X = "";
    private String _H115 = "";
    private String _H116 = "";
    private String _H117 = "";
    private String _H118 = "";
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

    public String getH111() {
        return _H111;
    }

    public void setH111(String newValue) {
        _H111 = newValue;
    }

    public String getH112() {
        return _H112;
    }

    public void setH112(String newValue) {
        _H112 = newValue;
    }

    public String getH113() {
        return _H113;
    }

    public void setH113(String newValue) {
        _H113 = newValue;
    }

    public String getH113X() {
        return _H113X;
    }

    public void setH113X(String newValue) {
        _H113X = newValue;
    }

    public String getH114a() {
        return _H114a;
    }

    public void setH114a(String newValue) {
        _H114a = newValue;
    }

    public String getH114b() {
        return _H114b;
    }

    public void setH114b(String newValue) {
        _H114b = newValue;
    }

    public String getH114c() {
        return _H114c;
    }

    public void setH114c(String newValue) {
        _H114c = newValue;
    }

    public String getH114X() {
        return _H114X;
    }

    public void setH114X(String newValue) {
        _H114X = newValue;
    }

    public String getH115() {
        return _H115;
    }

    public void setH115(String newValue) {
        _H115 = newValue;
    }

    public String getH116() {
        return _H116;
    }

    public void setH116(String newValue) {
        _H116 = newValue;
    }

    public String getH117() {
        return _H117;
    }

    public void setH117(String newValue) {
        _H117 = newValue;
    }

    public String getH118() {
        return _H118;
    }

    public void setH118(String newValue) {
        _H118 = newValue;
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
            if (C.Existence("Select * from " + TableName + "  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "' and H112='" + _H112 + "' "))
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,MSlNo,H111,H112,H113,H113X,H114a,H114b,H114c,H114X,H115,H116,H117,H118,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _MSlNo + "', '" + _H111 + "', '" + _H112 + "', '" + _H113 + "', '" + _H113X + "', '" + _H114a + "', '" + _H114b + "', '" + _H114c + "', '" + _H114X + "', '" + _H115 + "', '" + _H116 + "', '" + _H117 + "', '" + _H118 + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',MSlNo = '" + _MSlNo + "',H111 = '" + _H111 + "',H112 = '" + _H112 + "',H113 = '" + _H113 + "',H113X = '" + _H113X + "',H114a = '" + _H114a + "',H114b = '" + _H114b + "',H114c = '" + _H114c + "',H114X = '" + _H114X + "',H115 = '" + _H115 + "',H116 = '" + _H116 + "',H117 = '" + _H117 + "',H118 = '" + _H118 + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "' and H112='" + _H112 + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<Loan_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<Loan_DataModel> data = new ArrayList<Loan_DataModel>();
        Loan_DataModel d = new Loan_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new Loan_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._MSlNo = cur.getString(cur.getColumnIndex("MSlNo"));
            d._H111 = cur.getString(cur.getColumnIndex("H111"));
            d._H112 = cur.getString(cur.getColumnIndex("H112"));
            d._H113 = cur.getString(cur.getColumnIndex("H113"));
            d._H113X = cur.getString(cur.getColumnIndex("H113X"));
            d._H114a = cur.getString(cur.getColumnIndex("H114a"));
            d._H114b = cur.getString(cur.getColumnIndex("H114b"));
            d._H114c = cur.getString(cur.getColumnIndex("H114c"));
            d._H114X = cur.getString(cur.getColumnIndex("H114X"));
            d._H115 = cur.getString(cur.getColumnIndex("H115"));
            d._H116 = cur.getString(cur.getColumnIndex("H116"));
            d._H117 = cur.getString(cur.getColumnIndex("H117"));
            d._H118 = cur.getString(cur.getColumnIndex("H118"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}