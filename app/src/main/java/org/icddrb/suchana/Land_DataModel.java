package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class Land_DataModel {

    String TableName = "Land";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _SlNo = "";
    private String _H5a = "";
    private String _H5b = "";
    private String _H5bx = "";
    private String _H5c = "";
    private String _H5d = "";
    private String _H5e = "";
    private String _H5f = "";
    private String _H5g = "";
    private String _H5h = "";
    private String _H5Year = "";
    private String _H5Month = "";
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

    public String getSlNo() {
        return _SlNo;
    }

    public void setSlNo(String newValue) {
        _SlNo = newValue;
    }

    public String getH5a() {
        return _H5a;
    }

    public void setH5a(String newValue) {
        _H5a = newValue;
    }

    public String getH5b() {
        return _H5b;
    }

    public void setH5b(String newValue) {
        _H5b = newValue;
    }

    public String getH5bx() {
        return _H5bx;
    }

    public void setH5bx(String newValue) {
        _H5bx = newValue;
    }

    public String getH5c() {
        return _H5c;
    }

    public void setH5c(String newValue) {
        _H5c = newValue;
    }

    public String getH5d() {
        return _H5d;
    }

    public void setH5d(String newValue) {
        _H5d = newValue;
    }

    public String getH5e() {
        return _H5e;
    }

    public void setH5e(String newValue) {
        _H5e = newValue;
    }

    public String getH5f() {
        return _H5f;
    }

    public void setH5f(String newValue) {
        _H5f = newValue;
    }

    public String getH5g() {
        return _H5g;
    }

    public void setH5g(String newValue) {
        _H5g = newValue;
    }

    public String getH5h() {
        return _H5h;
    }

    public void setH5h(String newValue) {
        _H5h = newValue;
    }

    public String getH5Year() {
        return _H5Year;
    }

    public void setH5Year(String newValue) {
        _H5Year = newValue;
    }

    public String getH5Month() {
        return _H5Month;
    }

    public void setH5Month(String newValue) {
        _H5Month = newValue;
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
            if (C.Existence("Select * from " + TableName + "  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "' and SlNo='" + _SlNo + "' "))
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,SlNo,H5a,H5b,H5bx,H5c,H5d,H5e,H5f,H5g,H5h,H5Year,H5Month,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _SlNo + "', '" + _H5a + "', '" + _H5b + "', '" + _H5bx + "', '" + _H5c + "', '" + _H5d + "', '" + _H5e + "', '" + _H5f + "', '" + _H5g + "', '" + _H5h + "', '" + _H5Year + "', '" + _H5Month + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',SlNo = '" + _SlNo + "',H5a = '" + _H5a + "',H5b = '" + _H5b + "',H5bx = '" + _H5bx + "',H5c = '" + _H5c + "',H5d = '" + _H5d + "',H5e = '" + _H5e + "',H5f = '" + _H5f + "',H5g = '" + _H5g + "',H5h = '" + _H5h + "',H5Year = '" + _H5Year + "',H5Month = '" + _H5Month + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "' and SlNo='" + _SlNo + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<Land_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<Land_DataModel> data = new ArrayList<Land_DataModel>();
        Land_DataModel d = new Land_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new Land_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._SlNo = cur.getString(cur.getColumnIndex("SlNo"));
            d._H5a = cur.getString(cur.getColumnIndex("H5a"));
            d._H5b = cur.getString(cur.getColumnIndex("H5b"));
            d._H5bx = cur.getString(cur.getColumnIndex("H5bx"));
            d._H5c = cur.getString(cur.getColumnIndex("H5c"));
            d._H5d = cur.getString(cur.getColumnIndex("H5d"));
            d._H5e = cur.getString(cur.getColumnIndex("H5e"));
            d._H5f = cur.getString(cur.getColumnIndex("H5f"));
            d._H5g = cur.getString(cur.getColumnIndex("H5g"));
            d._H5h = cur.getString(cur.getColumnIndex("H5h"));
            d._H5Year = cur.getString(cur.getColumnIndex("H5Year"));
            d._H5Month = cur.getString(cur.getColumnIndex("H5Month"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}