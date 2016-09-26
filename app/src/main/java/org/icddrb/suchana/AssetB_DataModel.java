package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class AssetB_DataModel {

    String TableName = "AssetB";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _MSlNo = "";
    private String _H41a = "";
    private String _H41aX = "";
    private String _H41b = "";
    private String _H41c = "";
    private String _H41d = "";
    private String _H41e = "";
    private String _H41eX = "";
    private String _H41f = "";
    private String _H41fX = "";
    private String _H41g = "";
    private String _H41h = "";
    private String _H41i = "";
    private String _H41j = "";
    private String _H41k = "";
    private String _H41kX = "";
    private String _H41l = "";
    private String _H41m = "";
    private String _H41n = "";
    private String _H41o1 = "";
    private String _H41o2 = "";
    private String _H41o3 = "";
    private String _H41o4 = "";
    private String _H41o4X = "";
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

    public String getH41a() {
        return _H41a;
    }

    public void setH41a(String newValue) {
        _H41a = newValue;
    }

    public String getH41aX() {
        return _H41aX;
    }

    public void setH41aX(String newValue) {
        _H41aX = newValue;
    }

    public String getH41b() {
        return _H41b;
    }

    public void setH41b(String newValue) {
        _H41b = newValue;
    }

    public String getH41c() {
        return _H41c;
    }

    public void setH41c(String newValue) {
        _H41c = newValue;
    }

    public String getH41d() {
        return _H41d;
    }

    public void setH41d(String newValue) {
        _H41d = newValue;
    }

    public String getH41e() {
        return _H41e;
    }

    public void setH41e(String newValue) {
        _H41e = newValue;
    }

    public String getH41eX() {
        return _H41eX;
    }

    public void setH41eX(String newValue) {
        _H41eX = newValue;
    }

    public String getH41f() {
        return _H41f;
    }

    public void setH41f(String newValue) {
        _H41f = newValue;
    }

    public String getH41fX() {
        return _H41fX;
    }

    public void setH41fX(String newValue) {
        _H41fX = newValue;
    }

    public String getH41g() {
        return _H41g;
    }

    public void setH41g(String newValue) {
        _H41g = newValue;
    }

    public String getH41h() {
        return _H41h;
    }

    public void setH41h(String newValue) {
        _H41h = newValue;
    }

    public String getH41i() {
        return _H41i;
    }

    public void setH41i(String newValue) {
        _H41i = newValue;
    }

    public String getH41j() {
        return _H41j;
    }

    public void setH41j(String newValue) {
        _H41j = newValue;
    }

    public String getH41k() {
        return _H41k;
    }

    public void setH41k(String newValue) {
        _H41k = newValue;
    }

    public String getH41kX() {
        return _H41kX;
    }

    public void setH41kX(String newValue) {
        _H41kX = newValue;
    }

    public String getH41l() {
        return _H41l;
    }

    public void setH41l(String newValue) {
        _H41l = newValue;
    }

    public String getH41m() {
        return _H41m;
    }

    public void setH41m(String newValue) {
        _H41m = newValue;
    }

    public String getH41n() {
        return _H41n;
    }

    public void setH41n(String newValue) {
        _H41n = newValue;
    }

    public String getH41o1() {
        return _H41o1;
    }

    public void setH41o1(String newValue) {
        _H41o1 = newValue;
    }

    public String getH41o2() {
        return _H41o2;
    }

    public void setH41o2(String newValue) {
        _H41o2 = newValue;
    }

    public String getH41o3() {
        return _H41o3;
    }

    public void setH41o3(String newValue) {
        _H41o3 = newValue;
    }

    public String getH41o4() {
        return _H41o4;
    }

    public void setH41o4(String newValue) {
        _H41o4 = newValue;
    }

    public String getH41o4X() {
        return _H41o4X;
    }

    public void setH41o4X(String newValue) {
        _H41o4X = newValue;
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
            if (C.Existence("Select * from " + TableName + "  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "' and H41a='" + _H41a + "' "))
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,MSlNo,H41a,H41aX,H41b,H41c,H41d,H41e,H41eX,H41f,H41fX,H41g,H41h,H41i,H41j,H41k,H41kX,H41l,H41m,H41n,H41o1,H41o2,H41o3,H41o4,H41o4X,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _MSlNo + "', '" + _H41a + "', '" + _H41aX + "', '" + _H41b + "', '" + _H41c + "', '" + _H41d + "', '" + _H41e + "', '" + _H41eX + "', '" + _H41f + "', '" + _H41fX + "', '" + _H41g + "', '" + _H41h + "', '" + _H41i + "', '" + _H41j + "', '" + _H41k + "', '" + _H41kX + "', '" + _H41l + "', '" + _H41m + "', '" + _H41n + "', '" + _H41o1 + "', '" + _H41o2 + "', '" + _H41o3 + "', '" + _H41o4 + "', '" + _H41o4X + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',MSlNo = '" + _MSlNo + "',H41a = '" + _H41a + "',H41aX = '" + _H41aX + "',H41b = '" + _H41b + "',H41c = '" + _H41c + "',H41d = '" + _H41d + "',H41e = '" + _H41e + "',H41eX = '" + _H41eX + "',H41f = '" + _H41f + "',H41fX = '" + _H41fX + "',H41g = '" + _H41g + "',H41h = '" + _H41h + "',H41i = '" + _H41i + "',H41j = '" + _H41j + "',H41k = '" + _H41k + "',H41kX = '" + _H41kX + "',H41l = '" + _H41l + "',H41m = '" + _H41m + "',H41n = '" + _H41n + "',H41o1 = '" + _H41o1 + "',H41o2 = '" + _H41o2 + "',H41o3 = '" + _H41o3 + "',H41o4 = '" + _H41o4 + "',H41o4X = '" + _H41o4X + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "' and H41a='" + _H41a + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<AssetB_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<AssetB_DataModel> data = new ArrayList<AssetB_DataModel>();
        AssetB_DataModel d = new AssetB_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new AssetB_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._MSlNo = cur.getString(cur.getColumnIndex("MSlNo"));
            d._H41a = cur.getString(cur.getColumnIndex("H41a"));
            d._H41aX = cur.getString(cur.getColumnIndex("H41aX"));
            d._H41b = cur.getString(cur.getColumnIndex("H41b"));
            d._H41c = cur.getString(cur.getColumnIndex("H41c"));
            d._H41d = cur.getString(cur.getColumnIndex("H41d"));
            d._H41e = cur.getString(cur.getColumnIndex("H41e"));
            d._H41eX = cur.getString(cur.getColumnIndex("H41eX"));
            d._H41f = cur.getString(cur.getColumnIndex("H41f"));
            d._H41fX = cur.getString(cur.getColumnIndex("H41fX"));
            d._H41g = cur.getString(cur.getColumnIndex("H41g"));
            d._H41h = cur.getString(cur.getColumnIndex("H41h"));
            d._H41i = cur.getString(cur.getColumnIndex("H41i"));
            d._H41j = cur.getString(cur.getColumnIndex("H41j"));
            d._H41k = cur.getString(cur.getColumnIndex("H41k"));
            d._H41kX = cur.getString(cur.getColumnIndex("H41kX"));
            d._H41l = cur.getString(cur.getColumnIndex("H41l"));
            d._H41m = cur.getString(cur.getColumnIndex("H41m"));
            d._H41n = cur.getString(cur.getColumnIndex("H41n"));
            d._H41o1 = cur.getString(cur.getColumnIndex("H41o1"));
            d._H41o2 = cur.getString(cur.getColumnIndex("H41o2"));
            d._H41o3 = cur.getString(cur.getColumnIndex("H41o3"));
            d._H41o4 = cur.getString(cur.getColumnIndex("H41o4"));
            d._H41o4X = cur.getString(cur.getColumnIndex("H41o4X"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}