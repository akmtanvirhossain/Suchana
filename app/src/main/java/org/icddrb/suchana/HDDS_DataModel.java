package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class HDDS_DataModel {

    String TableName = "HDDS";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _H7 = "";
    private String _H7a = "";
    private String _H7b1 = "";
    private String _H7b2 = "";
    private String _H7b3 = "";
    private String _H7b4 = "";
    private String _H7c = "";
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

    public String getH7() {
        return _H7;
    }

    public void setH7(String newValue) {
        _H7 = newValue;
    }

    public String getH7a() {
        return _H7a;
    }

    public void setH7a(String newValue) {
        _H7a = newValue;
    }

    public String getH7b1() {
        return _H7b1;
    }

    public void setH7b1(String newValue) {
        _H7b1 = newValue;
    }

    public String getH7b2() {
        return _H7b2;
    }

    public void setH7b2(String newValue) {
        _H7b2 = newValue;
    }

    public String getH7b3() {
        return _H7b3;
    }

    public void setH7b3(String newValue) {
        _H7b3 = newValue;
    }

    public String getH7b4() {
        return _H7b4;
    }

    public void setH7b4(String newValue) {
        _H7b4 = newValue;
    }

    public String getH7c() {
        return _H7c;
    }

    public void setH7c(String newValue) {
        _H7c = newValue;
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
            if (C.Existence("Select * from " + TableName + "  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "' and H7='" + _H7 + "' "))
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,H7,H7a,H7b1,H7b2,H7b3,H7b4,H7c,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _H7 + "', '" + _H7a + "', '" + _H7b1 + "', '" + _H7b2 + "', '" + _H7b3 + "', '" + _H7b4 + "', '" + _H7c + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',H7 = '" + _H7 + "',H7a = '" + _H7a + "',H7b1 = '" + _H7b1 + "',H7b2 = '" + _H7b2 + "',H7b3 = '" + _H7b3 + "',H7b4 = '" + _H7b4 + "',H7c = '" + _H7c + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "' and H7='" + _H7 + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<HDDS_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<HDDS_DataModel> data = new ArrayList<HDDS_DataModel>();
        HDDS_DataModel d = new HDDS_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new HDDS_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._H7 = cur.getString(cur.getColumnIndex("H7"));
            d._H7a = cur.getString(cur.getColumnIndex("H7a"));
            d._H7b1 = cur.getString(cur.getColumnIndex("H7b1"));
            d._H7b2 = cur.getString(cur.getColumnIndex("H7b2"));
            d._H7b3 = cur.getString(cur.getColumnIndex("H7b3"));
            d._H7b4 = cur.getString(cur.getColumnIndex("H7b4"));
            d._H7c = cur.getString(cur.getColumnIndex("H7c"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }

    public List<HDDS_DataModel> SelectH7(Context context, String SQL) {
        Connection C = new Connection(context);
        List<HDDS_DataModel> data = new ArrayList<HDDS_DataModel>();
        HDDS_DataModel d = new HDDS_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new HDDS_DataModel();
            d._H7 = cur.getString(cur.getColumnIndex("H7"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}