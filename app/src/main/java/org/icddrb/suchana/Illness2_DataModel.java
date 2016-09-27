package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class Illness2_DataModel {

    String TableName = "Illness2";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _H172 = "";
    private String _SlNo = "";
    private String _MSlNo = "";
    private String _H172a = "";
    private String _H172aX = "";
    private String _H172b = "";
    private String _H172cX = "";
    private String _H172cY = "";
    private String _H172cM = "";
    private String _H172d = "";
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

    public String getH172() {
        return _H172;
    }

    public void setH172(String newValue) {
        _H172 = newValue;
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

    public String getH172a() {
        return _H172a;
    }

    public void setH172a(String newValue) {
        _H172a = newValue;
    }

    public String getH172aX() {
        return _H172aX;
    }

    public void setH172aX(String newValue) {
        _H172aX = newValue;
    }

    public String getH172b() {
        return _H172b;
    }

    public void setH172b(String newValue) {
        _H172b = newValue;
    }

    public String getH172cX() {
        return _H172cX;
    }

    public void setH172cX(String newValue) {
        _H172cX = newValue;
    }

    public String getH172cY() {
        return _H172cY;
    }

    public void setH172cY(String newValue) {
        _H172cY = newValue;
    }

    public String getH172cM() {
        return _H172cM;
    }

    public void setH172cM(String newValue) {
        _H172cM = newValue;
    }
    public String getH172d() {
        return _H172d;
    }

    public void setH172d(String newValue) {
        _H172d = newValue;
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
            if (C.Existence("Select * from " + TableName + "  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "' and SlNo='" + _SlNo +"'"))
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,H172,SlNo,MSlNo,H172a,H172aX,H172b,H172cX,H172cY,H172cM,H172d,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _H172 + "', '" + _SlNo + "','" + _MSlNo + "', '" + _H172a + "', '" + _H172aX + "', '" + _H172b + "', '" + _H172cX + "', '" + _H172cY + "', '" + _H172cM + "','" + _H172d + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',H172 = '" + _H172 + "',SlNo = '" + _SlNo + "',MSlNo='" + _MSlNo + "',H172a = '" + _H172a + "',H172aX = '" + _H172aX + "',H172b = '" + _H172b + "',H172cX = '" + _H172cX + "',H172cY = '" + _H172cY + "',H172cM = '" + _H172cM + "',H172d = '" + _H172d + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'  and SlNo='" + _SlNo + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<Illness2_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<Illness2_DataModel> data = new ArrayList<Illness2_DataModel>();
        Illness2_DataModel d = new Illness2_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new Illness2_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._H172 = cur.getString(cur.getColumnIndex("H172"));
            d._SlNo = cur.getString(cur.getColumnIndex("SlNo"));
            d._MSlNo = cur.getString(cur.getColumnIndex("MSlNo"));
            d._H172a = cur.getString(cur.getColumnIndex("H172a"));
            d._H172aX = cur.getString(cur.getColumnIndex("H172aX"));
            d._H172b = cur.getString(cur.getColumnIndex("H172b"));
            d._H172cX = cur.getString(cur.getColumnIndex("H172cX"));
            d._H172cY = cur.getString(cur.getColumnIndex("H172cY"));
            d._H172cM = cur.getString(cur.getColumnIndex("H172cM"));
            d._H172d = cur.getString(cur.getColumnIndex("H172d"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}