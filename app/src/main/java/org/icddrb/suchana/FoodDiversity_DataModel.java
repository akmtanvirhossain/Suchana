package org.icddrb.suchana;

/**
 * Created by TanvirHossain on 05/10/2016.
 */


import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class FoodDiversity_DataModel {

    String TableName = "FoodDiversity";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _M5a = "";
    private String _M5b = "";
    private String _M5C = "";
    private String _M5D = "";
    private String _M5E = "";
    private String _M5F = "";
    private String _M5G1 = "";
    private String _M5G2 = "";
    private String _M5G3 = "";
    private String _M5G4 = "";
    private String _M5H = "";
    private String _M5I = "";
    private String _M5J = "";
    private String _M5K = "";
    private String _M5L = "";
    private String _M5M = "";
    private String _M5N = "";
    private String _M5O = "";
    private String _M5P = "";
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

    public String getM5a() {
        return _M5a;
    }

    public void setM5a(String newValue) {
        _M5a = newValue;
    }

    public String getM5b() {
        return _M5b;
    }

    public void setM5b(String newValue) {
        _M5b = newValue;
    }

    public String getM5C() {
        return _M5C;
    }

    public void setM5C(String newValue) {
        _M5C = newValue;
    }

    public String getM5D() {
        return _M5D;
    }

    public void setM5D(String newValue) {
        _M5D = newValue;
    }

    public String getM5E() {
        return _M5E;
    }

    public void setM5E(String newValue) {
        _M5E = newValue;
    }

    public String getM5F() {
        return _M5F;
    }

    public void setM5F(String newValue) {
        _M5F = newValue;
    }

    public String getM5G1() {
        return _M5G1;
    }

    public void setM5G1(String newValue) {
        _M5G1 = newValue;
    }

    public String getM5G2() {
        return _M5G2;
    }

    public void setM5G2(String newValue) {
        _M5G2 = newValue;
    }

    public String getM5G3() {
        return _M5G3;
    }

    public void setM5G3(String newValue) {
        _M5G3 = newValue;
    }

    public String getM5G4() {
        return _M5G4;
    }

    public void setM5G4(String newValue) {
        _M5G4 = newValue;
    }

    public String getM5H() {
        return _M5H;
    }

    public void setM5H(String newValue) {
        _M5H = newValue;
    }

    public String getM5I() {
        return _M5I;
    }

    public void setM5I(String newValue) {
        _M5I = newValue;
    }

    public String getM5J() {
        return _M5J;
    }

    public void setM5J(String newValue) {
        _M5J = newValue;
    }

    public String getM5K() {
        return _M5K;
    }

    public void setM5K(String newValue) {
        _M5K = newValue;
    }

    public String getM5L() {
        return _M5L;
    }

    public void setM5L(String newValue) {
        _M5L = newValue;
    }

    public String getM5M() {
        return _M5M;
    }

    public void setM5M(String newValue) {
        _M5M = newValue;
    }

    public String getM5N() {
        return _M5N;
    }

    public void setM5N(String newValue) {
        _M5N = newValue;
    }

    public String getM5O() {
        return _M5O;
    }

    public void setM5O(String newValue) {
        _M5O = newValue;
    }

    public String getM5P() {
        return _M5P;
    }

    public void setM5P(String newValue) {
        _M5P = newValue;
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,M5a,M5b,M5C,M5D,M5E,M5F,M5G1,M5G2, M5G3,M5G4,M5H,M5I,M5J,M5K,M5L,M5M,M5N,M5O,M5P,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _M5a + "', '" + _M5b + "', '" + _M5C + "', '" + _M5D + "', '" + _M5E + "', '" + _M5F + "', '" + _M5G1 + "', '" + _M5G2 + "', '" + _M5G3 + "', '" + _M5G4 + "', '" + _M5H + "', '" + _M5I + "', '" + _M5J + "', '" + _M5K + "', '" + _M5L + "', '" + _M5M + "', '" + _M5N + "', '" + _M5O + "', '" + _M5P + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',M5a = '" + _M5a + "',M5b = '" + _M5b + "',M5C = '" + _M5C + "',M5D = '" + _M5D + "',M5E = '" + _M5E + "',M5F = '" + _M5F + "',M5G1 = '" + _M5G1 + "',M5G2 = '" + _M5G2 + "', M5G3 = '" + _M5G3 + "',M5G4 = '" + _M5G4 + "',M5H = '" + _M5H + "',M5I = '" + _M5I + "',M5J = '" + _M5J + "',M5K = '" + _M5K + "',M5L = '" + _M5L + "',M5M = '" + _M5M + "',M5N = '" + _M5N + "',M5O = '" + _M5O + "',M5P = '" + _M5P + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<FoodDiversity_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<FoodDiversity_DataModel> data = new ArrayList<FoodDiversity_DataModel>();
        FoodDiversity_DataModel d = new FoodDiversity_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new FoodDiversity_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._M5a = cur.getString(cur.getColumnIndex("M5a"));
            d._M5b = cur.getString(cur.getColumnIndex("M5b"));
            d._M5C = cur.getString(cur.getColumnIndex("M5C"));
            d._M5D = cur.getString(cur.getColumnIndex("M5D"));
            d._M5E = cur.getString(cur.getColumnIndex("M5E"));
            d._M5F = cur.getString(cur.getColumnIndex("M5F"));
            d._M5G1 = cur.getString(cur.getColumnIndex("M5G1"));
            d._M5G2 = cur.getString(cur.getColumnIndex("M5G2"));
            d._M5G3 = cur.getString(cur.getColumnIndex("M5G3"));
            d._M5G4 = cur.getString(cur.getColumnIndex("M5G4"));
            d._M5H = cur.getString(cur.getColumnIndex("M5H"));
            d._M5I = cur.getString(cur.getColumnIndex("M5I"));
            d._M5J = cur.getString(cur.getColumnIndex("M5J"));
            d._M5K = cur.getString(cur.getColumnIndex("M5K"));
            d._M5L = cur.getString(cur.getColumnIndex("M5L"));
            d._M5M = cur.getString(cur.getColumnIndex("M5M"));
            d._M5N = cur.getString(cur.getColumnIndex("M5N"));
            d._M5O = cur.getString(cur.getColumnIndex("M5O"));
            d._M5P = cur.getString(cur.getColumnIndex("M5P"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}