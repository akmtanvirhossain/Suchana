package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class Destruction1_DataModel {

    String TableName = "Destruction1";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _H14a = "";
    private String _H14ax = "";
    private String _H14a1 = "";
    private String _H14a2 = "";
    private String _H14a3a = "";
    private String _H14a3b = "";
    private String _H14a3c = "";
    private String _H14a3d = "";
    private String _H14a3e = "";
    private String _H14a3f = "";
    private String _H14a3g = "";
    private String _H14a3h = "";
    private String _H14a3i = "";
    private String _H14a3j = "";
    private String _H14a3k = "";
    private String _H14a3l = "";
    private String _H14a3m = "";
    private String _H14a3x = "";
    private String _H14a3x1 = "";
    private String _H14a3x2 = "";
    private String _H14a3x3 = "";
    private String _H14a4a = "";
    private String _H14a4b = "";
    private String _H14a4c = "";
    private String _H14a4d = "";
    private String _H14a4e = "";
    private String _H14a4f = "";
    private String _H14a4g = "";
    private String _H14a4h = "";
    private String _H14a4i = "";
    private String _H14a4j = "";
    private String _H14a4k = "";
    private String _H14a4l = "";
    private String _H14a4m = "";
    private String _H14a14n = "";
    private String _H14a4x = "";
    private String _H14a4x1 = "";
    private String _H14a4x2 = "";
    private String _H14a4x3 = "";
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

    public String getH14a() {
        return _H14a;
    }

    public void setH14a(String newValue) {
        _H14a = newValue;
    }

    public String getH14ax() {
        return _H14ax;
    }

    public void setH14ax(String newValue) {
        _H14ax = newValue;
    }

    public String getH14a1() {
        return _H14a1;
    }

    public void setH14a1(String newValue) {
        _H14a1 = newValue;
    }

    public String getH14a2() {
        return _H14a2;
    }

    public void setH14a2(String newValue) {
        _H14a2 = newValue;
    }

    public String getH14a3a() {
        return _H14a3a;
    }

    public void setH14a3a(String newValue) {
        _H14a3a = newValue;
    }

    public String getH14a3b() {
        return _H14a3b;
    }

    public void setH14a3b(String newValue) {
        _H14a3b = newValue;
    }

    public String getH14a3c() {
        return _H14a3c;
    }

    public void setH14a3c(String newValue) {
        _H14a3c = newValue;
    }

    public String getH14a3d() {
        return _H14a3d;
    }

    public void setH14a3d(String newValue) {
        _H14a3d = newValue;
    }

    public String getH14a3e() {
        return _H14a3e;
    }

    public void setH14a3e(String newValue) {
        _H14a3e = newValue;
    }

    public String getH14a3f() {
        return _H14a3f;
    }

    public void setH14a3f(String newValue) {
        _H14a3f = newValue;
    }

    public String getH14a3g() {
        return _H14a3g;
    }

    public void setH14a3g(String newValue) {
        _H14a3g = newValue;
    }

    public String getH14a3h() {
        return _H14a3h;
    }

    public void setH14a3h(String newValue) {
        _H14a3h = newValue;
    }

    public String getH14a3i() {
        return _H14a3i;
    }

    public void setH14a3i(String newValue) {
        _H14a3i = newValue;
    }

    public String getH14a3j() {
        return _H14a3j;
    }

    public void setH14a3j(String newValue) {
        _H14a3j = newValue;
    }

    public String getH14a3k() {
        return _H14a3k;
    }

    public void setH14a3k(String newValue) {
        _H14a3k = newValue;
    }

    public String getH14a3l() {
        return _H14a3l;
    }

    public void setH14a3l(String newValue) {
        _H14a3l = newValue;
    }

    public String getH14a3m() {
        return _H14a3m;
    }

    public void setH14a3m(String newValue) {
        _H14a3m = newValue;
    }

    public String getH14a3x() {
        return _H14a3x;
    }

    public void setH14a3x(String newValue) {
        _H14a3x = newValue;
    }

    public String getH14a3x1() {
        return _H14a3x1;
    }

    public void setH14a3x1(String newValue) {
        _H14a3x1 = newValue;
    }

    public String getH14a3x2() {
        return _H14a3x2;
    }

    public void setH14a3x2(String newValue) {
        _H14a3x2 = newValue;
    }

    public String getH14a3x3() {
        return _H14a3x3;
    }

    public void setH14a3x3(String newValue) {
        _H14a3x3 = newValue;
    }

    public String getH14a4a() {
        return _H14a4a;
    }

    public void setH14a4a(String newValue) {
        _H14a4a = newValue;
    }

    public String getH14a4b() {
        return _H14a4b;
    }

    public void setH14a4b(String newValue) {
        _H14a4b = newValue;
    }

    public String getH14a4c() {
        return _H14a4c;
    }

    public void setH14a4c(String newValue) {
        _H14a4c = newValue;
    }

    public String getH14a4d() {
        return _H14a4d;
    }

    public void setH14a4d(String newValue) {
        _H14a4d = newValue;
    }

    public String getH14a4e() {
        return _H14a4e;
    }

    public void setH14a4e(String newValue) {
        _H14a4e = newValue;
    }

    public String getH14a4f() {
        return _H14a4f;
    }

    public void setH14a4f(String newValue) {
        _H14a4f = newValue;
    }

    public String getH14a4g() {
        return _H14a4g;
    }

    public void setH14a4g(String newValue) {
        _H14a4g = newValue;
    }

    public String getH14a4h() {
        return _H14a4h;
    }

    public void setH14a4h(String newValue) {
        _H14a4h = newValue;
    }

    public String getH14a4i() {
        return _H14a4i;
    }

    public void setH14a4i(String newValue) {
        _H14a4i = newValue;
    }

    public String getH14a4j() {
        return _H14a4j;
    }

    public void setH14a4j(String newValue) {
        _H14a4j = newValue;
    }

    public String getH14a4k() {
        return _H14a4k;
    }

    public void setH14a4k(String newValue) {
        _H14a4k = newValue;
    }

    public String getH14a4l() {
        return _H14a4l;
    }

    public void setH14a4l(String newValue) {
        _H14a4l = newValue;
    }

    public String getH14a4m() {
        return _H14a4m;
    }

    public void setH14a4m(String newValue) {
        _H14a4m = newValue;
    }

    public String getH14a14n() {
        return _H14a14n;
    }

    public void setH14a14n(String newValue) {
        _H14a14n = newValue;
    }

    public String getH14a4x() {
        return _H14a4x;
    }

    public void setH14a4x(String newValue) {
        _H14a4x = newValue;
    }

    public String getH14a4x1() {
        return _H14a4x1;
    }

    public void setH14a4x1(String newValue) {
        _H14a4x1 = newValue;
    }

    public String getH14a4x2() {
        return _H14a4x2;
    }

    public void setH14a4x2(String newValue) {
        _H14a4x2 = newValue;
    }

    public String getH14a4x3() {
        return _H14a4x3;
    }

    public void setH14a4x3(String newValue) {
        _H14a4x3 = newValue;
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
            if (C.Existence("Select * from " + TableName + "  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "' and H14a='" + _H14a + "' "))
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,H14a,H14ax,H14a1,H14a2,H14a3a,H14a3b,H14a3c,H14a3d,H14a3e,H14a3f,H14a3g,H14a3h,H14a3i,H14a3j,H14a3k,H14a3l,H14a3m,H14a3x,H14a3x1,H14a3x2,H14a3x3,H14a4a,H14a4b,H14a4c,H14a4d,H14a4e,H14a4f,H14a4g,H14a4h,H14a4i,H14a4j,H14a4k,H14a4l,H14a4m,H14a14n,H14a4x,H14a4x1,H14a4x2,H14a4x3,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _H14a + "', '" + _H14ax + "', '" + _H14a1 + "', '" + _H14a2 + "', '" + _H14a3a + "', '" + _H14a3b + "', '" + _H14a3c + "', '" + _H14a3d + "', '" + _H14a3e + "', '" + _H14a3f + "', '" + _H14a3g + "', '" + _H14a3h + "', '" + _H14a3i + "', '" + _H14a3j + "', '" + _H14a3k + "', '" + _H14a3l + "', '" + _H14a3m + "', '" + _H14a3x + "', '" + _H14a3x1 + "', '" + _H14a3x2 + "', '" + _H14a3x3 + "', '" + _H14a4a + "', '" + _H14a4b + "', '" + _H14a4c + "', '" + _H14a4d + "', '" + _H14a4e + "', '" + _H14a4f + "', '" + _H14a4g + "', '" + _H14a4h + "', '" + _H14a4i + "', '" + _H14a4j + "', '" + _H14a4k + "', '" + _H14a4l + "', '" + _H14a4m + "', '" + _H14a14n + "', '" + _H14a4x + "', '" + _H14a4x1 + "', '" + _H14a4x2 + "', '" + _H14a4x3 + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',H14a = '" + _H14a + "',H14ax = '" + _H14ax + "',H14a1 = '" + _H14a1 + "',H14a2 = '" + _H14a2 + "',H14a3a = '" + _H14a3a + "',H14a3b = '" + _H14a3b + "',H14a3c = '" + _H14a3c + "',H14a3d = '" + _H14a3d + "',H14a3e = '" + _H14a3e + "',H14a3f = '" + _H14a3f + "',H14a3g = '" + _H14a3g + "',H14a3h = '" + _H14a3h + "',H14a3i = '" + _H14a3i + "',H14a3j = '" + _H14a3j + "',H14a3k = '" + _H14a3k + "',H14a3l = '" + _H14a3l + "',H14a3m = '" + _H14a3m + "',H14a3x = '" + _H14a3x + "',H14a3x1 = '" + _H14a3x1 + "',H14a3x2 = '" + _H14a3x2 + "',H14a3x3 = '" + _H14a3x3 + "',H14a4a = '" + _H14a4a + "',H14a4b = '" + _H14a4b + "',H14a4c = '" + _H14a4c + "',H14a4d = '" + _H14a4d + "',H14a4e = '" + _H14a4e + "',H14a4f = '" + _H14a4f + "',H14a4g = '" + _H14a4g + "',H14a4h = '" + _H14a4h + "',H14a4i = '" + _H14a4i + "',H14a4j = '" + _H14a4j + "',H14a4k = '" + _H14a4k + "',H14a4l = '" + _H14a4l + "',H14a4m = '" + _H14a4m + "',H14a14n = '" + _H14a14n + "',H14a4x = '" + _H14a4x + "',H14a4x1 = '" + _H14a4x1 + "',H14a4x2 = '" + _H14a4x2 + "',H14a4x3 = '" + _H14a4x3 + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "' and H14a='" + _H14a + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<Destruction1_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<Destruction1_DataModel> data = new ArrayList<Destruction1_DataModel>();
        Destruction1_DataModel d = new Destruction1_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new Destruction1_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._H14a = cur.getString(cur.getColumnIndex("H14a"));
            d._H14ax = cur.getString(cur.getColumnIndex("H14ax"));
            d._H14a1 = cur.getString(cur.getColumnIndex("H14a1"));
            d._H14a2 = cur.getString(cur.getColumnIndex("H14a2"));
            d._H14a3a = cur.getString(cur.getColumnIndex("H14a3a"));
            d._H14a3b = cur.getString(cur.getColumnIndex("H14a3b"));
            d._H14a3c = cur.getString(cur.getColumnIndex("H14a3c"));
            d._H14a3d = cur.getString(cur.getColumnIndex("H14a3d"));
            d._H14a3e = cur.getString(cur.getColumnIndex("H14a3e"));
            d._H14a3f = cur.getString(cur.getColumnIndex("H14a3f"));
            d._H14a3g = cur.getString(cur.getColumnIndex("H14a3g"));
            d._H14a3h = cur.getString(cur.getColumnIndex("H14a3h"));
            d._H14a3i = cur.getString(cur.getColumnIndex("H14a3i"));
            d._H14a3j = cur.getString(cur.getColumnIndex("H14a3j"));
            d._H14a3k = cur.getString(cur.getColumnIndex("H14a3k"));
            d._H14a3l = cur.getString(cur.getColumnIndex("H14a3l"));
            d._H14a3m = cur.getString(cur.getColumnIndex("H14a3m"));
            d._H14a3x = cur.getString(cur.getColumnIndex("H14a3x"));
            d._H14a3x1 = cur.getString(cur.getColumnIndex("H14a3x1"));
            d._H14a3x2 = cur.getString(cur.getColumnIndex("H14a3x2"));
            d._H14a3x3 = cur.getString(cur.getColumnIndex("H14a3x3"));
            d._H14a4a = cur.getString(cur.getColumnIndex("H14a4a"));
            d._H14a4b = cur.getString(cur.getColumnIndex("H14a4b"));
            d._H14a4c = cur.getString(cur.getColumnIndex("H14a4c"));
            d._H14a4d = cur.getString(cur.getColumnIndex("H14a4d"));
            d._H14a4e = cur.getString(cur.getColumnIndex("H14a4e"));
            d._H14a4f = cur.getString(cur.getColumnIndex("H14a4f"));
            d._H14a4g = cur.getString(cur.getColumnIndex("H14a4g"));
            d._H14a4h = cur.getString(cur.getColumnIndex("H14a4h"));
            d._H14a4i = cur.getString(cur.getColumnIndex("H14a4i"));
            d._H14a4j = cur.getString(cur.getColumnIndex("H14a4j"));
            d._H14a4k = cur.getString(cur.getColumnIndex("H14a4k"));
            d._H14a4l = cur.getString(cur.getColumnIndex("H14a4l"));
            d._H14a4m = cur.getString(cur.getColumnIndex("H14a4m"));
            d._H14a14n = cur.getString(cur.getColumnIndex("H14a14n"));
            d._H14a4x = cur.getString(cur.getColumnIndex("H14a4x"));
            d._H14a4x1 = cur.getString(cur.getColumnIndex("H14a4x1"));
            d._H14a4x2 = cur.getString(cur.getColumnIndex("H14a4x2"));
            d._H14a4x3 = cur.getString(cur.getColumnIndex("H14a4x3"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }

    public List<Destruction1_DataModel> SelectH14a(Context context, String SQL) {
        Connection C = new Connection(context);
        List<Destruction1_DataModel> data = new ArrayList<Destruction1_DataModel>();
        Destruction1_DataModel d = new Destruction1_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new Destruction1_DataModel();
            d._H14a = cur.getString(cur.getColumnIndex("H14a"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}