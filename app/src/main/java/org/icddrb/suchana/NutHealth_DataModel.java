package org.icddrb.suchana;

/**
 * Created by TanvirHossain on 05/10/2016.
 */


import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class NutHealth_DataModel {

    String TableName = "NutHealth";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _M31a = "";
    private String _M31b = "";
    private String _M31c = "";
    private String _M31d = "";
    private String _M31e = "";
    private String _M31f = "";
    private String _M31g = "";
    private String _M31h = "";
    private String _M31i = "";
    private String _M31x = "";
    private String _M31x1 = "";
    private String _M32 = "";
    private String _M33 = "";
    private String _M34 = "";
    private String _M35 = "";
    private String _M36 = "";
    private String _M37 = "";
    private String _M38 = "";
    private String _M38X1 = "";
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

    public String getM31a() {
        return _M31a;
    }

    public void setM31a(String newValue) {
        _M31a = newValue;
    }

    public String getM31b() {
        return _M31b;
    }

    public void setM31b(String newValue) {
        _M31b = newValue;
    }

    public String getM31c() {
        return _M31c;
    }

    public void setM31c(String newValue) {
        _M31c = newValue;
    }

    public String getM31d() {
        return _M31d;
    }

    public void setM31d(String newValue) {
        _M31d = newValue;
    }

    public String getM31e() {
        return _M31e;
    }

    public void setM31e(String newValue) {
        _M31e = newValue;
    }

    public String getM31f() {
        return _M31f;
    }

    public void setM31f(String newValue) {
        _M31f = newValue;
    }

    public String getM31g() {
        return _M31g;
    }

    public void setM31g(String newValue) {
        _M31g = newValue;
    }

    public String getM31h() {
        return _M31h;
    }

    public void setM31h(String newValue) {
        _M31h = newValue;
    }

    public String getM31i() {
        return _M31i;
    }

    public void setM31i(String newValue) {
        _M31i = newValue;
    }

    public String getM31x() {
        return _M31x;
    }

    public void setM31x(String newValue) {
        _M31x = newValue;
    }

    public String getM31x1() {
        return _M31x1;
    }

    public void setM31x1(String newValue) {
        _M31x1 = newValue;
    }

    public String getM32() {
        return _M32;
    }

    public void setM32(String newValue) {
        _M32 = newValue;
    }

    public String getM33() {
        return _M33;
    }

    public void setM33(String newValue) {
        _M33 = newValue;
    }

    public String getM34() {
        return _M34;
    }

    public void setM34(String newValue) {
        _M34 = newValue;
    }

    public String getM35() {
        return _M35;
    }

    public void setM35(String newValue) {
        _M35 = newValue;
    }

    public String getM36() {
        return _M36;
    }

    public void setM36(String newValue) {
        _M36 = newValue;
    }

    public String getM37() {
        return _M37;
    }

    public void setM37(String newValue) {
        _M37 = newValue;
    }

    public String getM38() {
        return _M38;
    }

    public void setM38(String newValue) {
        _M38 = newValue;
    }

    public String getM38X1() {
        return _M38X1;
    }

    public void setM38X1(String newValue) {
        _M38X1 = newValue;
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,M31a,M31b,M31c,M31d,M31e,M31f,M31g,M31h,M31i,M31x,M31x1,M32,M33,M34,M35,M36,M37,M38,M38X1,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _M31a + "', '" + _M31b + "', '" + _M31c + "', '" + _M31d + "', '" + _M31e + "', '" + _M31f + "', '" + _M31g + "', '" + _M31h + "', '" + _M31i + "', '" + _M31x + "', '" + _M31x1 + "', '" + _M32 + "', '" + _M33 + "', '" + _M34 + "', '" + _M35 + "', '" + _M36 + "', '" + _M37 + "', '" + _M38 + "', '" + _M38X1 + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',M31a = '" + _M31a + "',M31b = '" + _M31b + "',M31c = '" + _M31c + "',M31d = '" + _M31d + "',M31e = '" + _M31e + "',M31f = '" + _M31f + "',M31g = '" + _M31g + "',M31h = '" + _M31h + "',M31i = '" + _M31i + "',M31x = '" + _M31x + "',M31x1 = '" + _M31x1 + "',M32 = '" + _M32 + "',M33 = '" + _M33 + "',M34 = '" + _M34 + "',M35 = '" + _M35 + "',M36 = '" + _M36 + "',M37 = '" + _M37 + "',M38 = '" + _M38 + "',M38X1 = '" + _M38X1 + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<NutHealth_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<NutHealth_DataModel> data = new ArrayList<NutHealth_DataModel>();
        NutHealth_DataModel d = new NutHealth_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new NutHealth_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._M31a = cur.getString(cur.getColumnIndex("M31a"));
            d._M31b = cur.getString(cur.getColumnIndex("M31b"));
            d._M31c = cur.getString(cur.getColumnIndex("M31c"));
            d._M31d = cur.getString(cur.getColumnIndex("M31d"));
            d._M31e = cur.getString(cur.getColumnIndex("M31e"));
            d._M31f = cur.getString(cur.getColumnIndex("M31f"));
            d._M31g = cur.getString(cur.getColumnIndex("M31g"));
            d._M31h = cur.getString(cur.getColumnIndex("M31h"));
            d._M31i = cur.getString(cur.getColumnIndex("M31i"));
            d._M31x = cur.getString(cur.getColumnIndex("M31x"));
            d._M31x1 = cur.getString(cur.getColumnIndex("M31x1"));
            d._M32 = cur.getString(cur.getColumnIndex("M32"));
            d._M33 = cur.getString(cur.getColumnIndex("M33"));
            d._M34 = cur.getString(cur.getColumnIndex("M34"));
            d._M35 = cur.getString(cur.getColumnIndex("M35"));
            d._M36 = cur.getString(cur.getColumnIndex("M36"));
            d._M37 = cur.getString(cur.getColumnIndex("M37"));
            d._M38 = cur.getString(cur.getColumnIndex("M38"));
            d._M38X1 = cur.getString(cur.getColumnIndex("M38X1"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}