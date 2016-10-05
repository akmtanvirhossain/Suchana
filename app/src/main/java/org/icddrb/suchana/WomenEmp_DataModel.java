package org.icddrb.suchana;

/**
 * Created by TanvirHossain on 05/10/2016.
 */


import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class WomenEmp_DataModel {

    String TableName = "WomenEmp";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _M411a = "";
    private String _M411a1 = "";
    private String _M411a2 = "";
    private String _M411b = "";
    private String _M411b1 = "";
    private String _M411b2 = "";
    private String _M411c = "";
    private String _M411c1 = "";
    private String _M411c2 = "";
    private String _M411d = "";
    private String _M411d1 = "";
    private String _M411d2 = "";
    private String _M411e = "";
    private String _M411e1 = "";
    private String _M411e2 = "";
    private String _M411f = "";
    private String _M411f1 = "";
    private String _M411f2 = "";
    private String _M411g = "";
    private String _M411g1 = "";
    private String _M411g2 = "";
    private String _M412a = "";
    private String _M412a1 = "";
    private String _M412a2 = "";
    private String _M413a = "";
    private String _M413a1 = "";
    private String _M413a2 = "";
    private String _M414a = "";
    private String _M414a1 = "";
    private String _M414a2 = "";
    private String _M415a = "";
    private String _M415a1 = "";
    private String _M415a2 = "";
    private String _M416a = "";
    private String _M416a1 = "";
    private String _M416a2 = "";
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

    public String getM411a() {
        return _M411a;
    }

    public void setM411a(String newValue) {
        _M411a = newValue;
    }

    public String getM411a1() {
        return _M411a1;
    }

    public void setM411a1(String newValue) {
        _M411a1 = newValue;
    }

    public String getM411a2() {
        return _M411a2;
    }

    public void setM411a2(String newValue) {
        _M411a2 = newValue;
    }

    public String getM411b() {
        return _M411b;
    }

    public void setM411b(String newValue) {
        _M411b = newValue;
    }

    public String getM411b1() {
        return _M411b1;
    }

    public void setM411b1(String newValue) {
        _M411b1 = newValue;
    }

    public String getM411b2() {
        return _M411b2;
    }

    public void setM411b2(String newValue) {
        _M411b2 = newValue;
    }

    public String getM411c() {
        return _M411c;
    }

    public void setM411c(String newValue) {
        _M411c = newValue;
    }

    public String getM411c1() {
        return _M411c1;
    }

    public void setM411c1(String newValue) {
        _M411c1 = newValue;
    }

    public String getM411c2() {
        return _M411c2;
    }

    public void setM411c2(String newValue) {
        _M411c2 = newValue;
    }

    public String getM411d() {
        return _M411d;
    }

    public void setM411d(String newValue) {
        _M411d = newValue;
    }

    public String getM411d1() {
        return _M411d1;
    }

    public void setM411d1(String newValue) {
        _M411d1 = newValue;
    }

    public String getM411d2() {
        return _M411d2;
    }

    public void setM411d2(String newValue) {
        _M411d2 = newValue;
    }

    public String getM411e() {
        return _M411e;
    }

    public void setM411e(String newValue) {
        _M411e = newValue;
    }

    public String getM411e1() {
        return _M411e1;
    }

    public void setM411e1(String newValue) {
        _M411e1 = newValue;
    }

    public String getM411e2() {
        return _M411e2;
    }

    public void setM411e2(String newValue) {
        _M411e2 = newValue;
    }

    public String getM411f() {
        return _M411f;
    }

    public void setM411f(String newValue) {
        _M411f = newValue;
    }

    public String getM411f1() {
        return _M411f1;
    }

    public void setM411f1(String newValue) {
        _M411f1 = newValue;
    }

    public String getM411f2() {
        return _M411f2;
    }

    public void setM411f2(String newValue) {
        _M411f2 = newValue;
    }

    public String getM411g() {
        return _M411g;
    }

    public void setM411g(String newValue) {
        _M411g = newValue;
    }

    public String getM411g1() {
        return _M411g1;
    }

    public void setM411g1(String newValue) {
        _M411g1 = newValue;
    }

    public String getM411g2() {
        return _M411g2;
    }

    public void setM411g2(String newValue) {
        _M411g2 = newValue;
    }

    public String getM412a() {
        return _M412a;
    }

    public void setM412a(String newValue) {
        _M412a = newValue;
    }

    public String getM412a1() {
        return _M412a1;
    }

    public void setM412a1(String newValue) {
        _M412a1 = newValue;
    }

    public String getM412a2() {
        return _M412a2;
    }

    public void setM412a2(String newValue) {
        _M412a2 = newValue;
    }

    public String getM413a() {
        return _M413a;
    }

    public void setM413a(String newValue) {
        _M413a = newValue;
    }

    public String getM413a1() {
        return _M413a1;
    }

    public void setM413a1(String newValue) {
        _M413a1 = newValue;
    }

    public String getM413a2() {
        return _M413a2;
    }

    public void setM413a2(String newValue) {
        _M413a2 = newValue;
    }

    public String getM414a() {
        return _M414a;
    }

    public void setM414a(String newValue) {
        _M414a = newValue;
    }

    public String getM414a1() {
        return _M414a1;
    }

    public void setM414a1(String newValue) {
        _M414a1 = newValue;
    }

    public String getM414a2() {
        return _M414a2;
    }

    public void setM414a2(String newValue) {
        _M414a2 = newValue;
    }

    public String getM415a() {
        return _M415a;
    }

    public void setM415a(String newValue) {
        _M415a = newValue;
    }

    public String getM415a1() {
        return _M415a1;
    }

    public void setM415a1(String newValue) {
        _M415a1 = newValue;
    }

    public String getM415a2() {
        return _M415a2;
    }

    public void setM415a2(String newValue) {
        _M415a2 = newValue;
    }

    public String getM416a() {
        return _M416a;
    }

    public void setM416a(String newValue) {
        _M416a = newValue;
    }

    public String getM416a1() {
        return _M416a1;
    }

    public void setM416a1(String newValue) {
        _M416a1 = newValue;
    }

    public String getM416a2() {
        return _M416a2;
    }

    public void setM416a2(String newValue) {
        _M416a2 = newValue;
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,M411a,M411a1,M411a2,M411b,M411b1,M411b2,M411c,M411c1,M411c2,M411d,M411d1,M411d2,M411e,M411e1,M411e2,M411f,M411f1,M411f2,M411g,M411g1,M411g2,M412a,M412a1,M412a2,M413a,M413a1,M413a2,M414a,M414a1,M414a2,M415a,M415a1,M415a2,M416a,M416a1,M416a2,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _M411a + "', '" + _M411a1 + "', '" + _M411a2 + "', '" + _M411b + "', '" + _M411b1 + "', '" + _M411b2 + "', '" + _M411c + "', '" + _M411c1 + "', '" + _M411c2 + "', '" + _M411d + "', '" + _M411d1 + "', '" + _M411d2 + "', '" + _M411e + "', '" + _M411e1 + "', '" + _M411e2 + "', '" + _M411f + "', '" + _M411f1 + "', '" + _M411f2 + "', '" + _M411g + "', '" + _M411g1 + "', '" + _M411g2 + "', '" + _M412a + "', '" + _M412a1 + "', '" + _M412a2 + "', '" + _M413a + "', '" + _M413a1 + "', '" + _M413a2 + "', '" + _M414a + "', '" + _M414a1 + "', '" + _M414a2 + "', '" + _M415a + "', '" + _M415a1 + "', '" + _M415a2 + "', '" + _M416a + "', '" + _M416a1 + "', '" + _M416a2 + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',M411a = '" + _M411a + "',M411a1 = '" + _M411a1 + "',M411a2 = '" + _M411a2 + "',M411b = '" + _M411b + "',M411b1 = '" + _M411b1 + "',M411b2 = '" + _M411b2 + "',M411c = '" + _M411c + "',M411c1 = '" + _M411c1 + "',M411c2 = '" + _M411c2 + "',M411d = '" + _M411d + "',M411d1 = '" + _M411d1 + "',M411d2 = '" + _M411d2 + "',M411e = '" + _M411e + "',M411e1 = '" + _M411e1 + "',M411e2 = '" + _M411e2 + "',M411f = '" + _M411f + "',M411f1 = '" + _M411f1 + "',M411f2 = '" + _M411f2 + "',M411g = '" + _M411g + "',M411g1 = '" + _M411g1 + "',M411g2 = '" + _M411g2 + "',M412a = '" + _M412a + "',M412a1 = '" + _M412a1 + "',M412a2 = '" + _M412a2 + "',M413a = '" + _M413a + "',M413a1 = '" + _M413a1 + "',M413a2 = '" + _M413a2 + "',M414a = '" + _M414a + "',M414a1 = '" + _M414a1 + "',M414a2 = '" + _M414a2 + "',M415a = '" + _M415a + "',M415a1 = '" + _M415a1 + "',M415a2 = '" + _M415a2 + "',M416a = '" + _M416a + "',M416a1 = '" + _M416a1 + "',M416a2 = '" + _M416a2 + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<WomenEmp_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<WomenEmp_DataModel> data = new ArrayList<WomenEmp_DataModel>();
        WomenEmp_DataModel d = new WomenEmp_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new WomenEmp_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._M411a = cur.getString(cur.getColumnIndex("M411a"));
            d._M411a1 = cur.getString(cur.getColumnIndex("M411a1"));
            d._M411a2 = cur.getString(cur.getColumnIndex("M411a2"));
            d._M411b = cur.getString(cur.getColumnIndex("M411b"));
            d._M411b1 = cur.getString(cur.getColumnIndex("M411b1"));
            d._M411b2 = cur.getString(cur.getColumnIndex("M411b2"));
            d._M411c = cur.getString(cur.getColumnIndex("M411c"));
            d._M411c1 = cur.getString(cur.getColumnIndex("M411c1"));
            d._M411c2 = cur.getString(cur.getColumnIndex("M411c2"));
            d._M411d = cur.getString(cur.getColumnIndex("M411d"));
            d._M411d1 = cur.getString(cur.getColumnIndex("M411d1"));
            d._M411d2 = cur.getString(cur.getColumnIndex("M411d2"));
            d._M411e = cur.getString(cur.getColumnIndex("M411e"));
            d._M411e1 = cur.getString(cur.getColumnIndex("M411e1"));
            d._M411e2 = cur.getString(cur.getColumnIndex("M411e2"));
            d._M411f = cur.getString(cur.getColumnIndex("M411f"));
            d._M411f1 = cur.getString(cur.getColumnIndex("M411f1"));
            d._M411f2 = cur.getString(cur.getColumnIndex("M411f2"));
            d._M411g = cur.getString(cur.getColumnIndex("M411g"));
            d._M411g1 = cur.getString(cur.getColumnIndex("M411g1"));
            d._M411g2 = cur.getString(cur.getColumnIndex("M411g2"));
            d._M412a = cur.getString(cur.getColumnIndex("M412a"));
            d._M412a1 = cur.getString(cur.getColumnIndex("M412a1"));
            d._M412a2 = cur.getString(cur.getColumnIndex("M412a2"));
            d._M413a = cur.getString(cur.getColumnIndex("M413a"));
            d._M413a1 = cur.getString(cur.getColumnIndex("M413a1"));
            d._M413a2 = cur.getString(cur.getColumnIndex("M413a2"));
            d._M414a = cur.getString(cur.getColumnIndex("M414a"));
            d._M414a1 = cur.getString(cur.getColumnIndex("M414a1"));
            d._M414a2 = cur.getString(cur.getColumnIndex("M414a2"));
            d._M415a = cur.getString(cur.getColumnIndex("M415a"));
            d._M415a1 = cur.getString(cur.getColumnIndex("M415a1"));
            d._M415a2 = cur.getString(cur.getColumnIndex("M415a2"));
            d._M416a = cur.getString(cur.getColumnIndex("M416a"));
            d._M416a1 = cur.getString(cur.getColumnIndex("M416a1"));
            d._M416a2 = cur.getString(cur.getColumnIndex("M416a2"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}