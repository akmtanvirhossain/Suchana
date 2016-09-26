package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class Illness1_DataModel {

    String TableName = "Illness1";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _H171 = "";
    private String _MSlNo = "";
    private String _SlNo = "";
    private String _H171a = "";
    private String _H171aX = "";
    private String _H171b = "";
    private String _H171bX = "";
    private String _H171c = "";
    private String _H171d = "";
    private String _H171VCost = "";
    private String _H171TCost = "";
    private String _H171TrCost = "";
    private String _H171f = "";
    private String _H171g = "";
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

    public String getH171() {
        return _H171;
    }

    public void setH171(String newValue) {
        _H171 = newValue;
    }

    public String getSlNo() {
        return _SlNo;
    }

    public void setSlNo(String newValue) {
        _SlNo = newValue;
    }
    public String getMSlNo() {
        return _MSlNo;
    }

    public void setMSlNo(String newValue) {
        _MSlNo = newValue;
    }

    public String getH171a() {
        return _H171a;
    }

    public void setH171a(String newValue) {
        _H171a = newValue;
    }

    public String getH171aX() {
        return _H171aX;
    }

    public void setH171aX(String newValue) {
        _H171aX = newValue;
    }

    public String getH171b() {
        return _H171b;
    }

    public void setH171b(String newValue) {
        _H171b = newValue;
    }

    public String getH171bX() {
        return _H171bX;
    }

    public void setH171bX(String newValue) {
        _H171bX = newValue;
    }

    public String getH171c() {
        return _H171c;
    }

    public void setH171c(String newValue) {
        _H171c = newValue;
    }

    public String getH171d() {
        return _H171d;
    }

    public void setH171d(String newValue) {
        _H171d = newValue;
    }

    public String getH171VCost() {
        return _H171VCost;
    }

    public void setH171VCost(String newValue) {
        _H171VCost = newValue;
    }

    public String getH171TCost() {
        return _H171TCost;
    }

    public void setH171TCost(String newValue) {
        _H171TCost = newValue;
    }

    public String getH171TrCost() {
        return _H171TrCost;
    }

    public void setH171TrCost(String newValue) {
        _H171TrCost = newValue;
    }

    public String getH171f() {
        return _H171f;
    }

    public void setH171f(String newValue) {
        _H171f = newValue;
    }

    public String getH171g() {
        return _H171g;
    }

    public void setH171g(String newValue) {
        _H171g = newValue;
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
            if (C.Existence("Select * from " + TableName + "  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "' and SlNo='" + _SlNo + "'"))
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,H171,SlNo,MSlNo,H171a,H171aX,H171b,H171bX,H171c,H171d,H171VCost,H171TCost,H171TrCost,H171f,H171g,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _H171 + "', '" + _SlNo + "','" + _MSlNo + "','" + _H171a + "', '" + _H171aX + "', '" + _H171b + "', '" + _H171bX + "', '" + _H171c + "', '" + _H171d + "', '" + _H171VCost + "', '" + _H171TCost + "', '" + _H171TrCost + "', '" + _H171f + "', '" + _H171g + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',H171 = '" + _H171 + "',SlNo = '" + _SlNo + "',MSlNo='" + _MSlNo + "',H171a = '" + _H171a + "',H171aX = '" + _H171aX + "',H171b = '" + _H171b + "',H171bX = '" + _H171bX + "',H171c = '" + _H171c + "',H171d = '" + _H171d + "',H171VCost = '" + _H171VCost + "',H171TCost = '" + _H171TCost + "',H171TrCost = '" + _H171TrCost + "',H171f = '" + _H171f + "',H171g = '" + _H171g + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "' and SlNo='" + _SlNo + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<Illness1_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<Illness1_DataModel> data = new ArrayList<Illness1_DataModel>();
        Illness1_DataModel d = new Illness1_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new Illness1_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._H171 = cur.getString(cur.getColumnIndex("H171"));
            d._SlNo = cur.getString(cur.getColumnIndex("SlNo"));
            d._MSlNo = cur.getString(cur.getColumnIndex("MSlNo"));
            d._H171a = cur.getString(cur.getColumnIndex("H171a"));
            d._H171aX = cur.getString(cur.getColumnIndex("H171aX"));
            d._H171b = cur.getString(cur.getColumnIndex("H171b"));
            d._H171bX = cur.getString(cur.getColumnIndex("H171bX"));
            d._H171c = cur.getString(cur.getColumnIndex("H171c"));
            d._H171d = cur.getString(cur.getColumnIndex("H171d"));
            d._H171VCost = cur.getString(cur.getColumnIndex("H171VCost"));
            d._H171TCost = cur.getString(cur.getColumnIndex("H171TCost"));
            d._H171TrCost = cur.getString(cur.getColumnIndex("H171TrCost"));
            d._H171f = cur.getString(cur.getColumnIndex("H171f"));
            d._H171g = cur.getString(cur.getColumnIndex("H171g"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}