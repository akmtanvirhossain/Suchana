package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class Destruction2_DataModel {

    String TableName = "Destruction2";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _H14b1 = "";
    private String _H14b2 = "";
    private String _H14b3 = "";
    private String _H14b4 = "";
    private String _H14b5 = "";
    private String _H14b6 = "";
    private String _H14b7 = "";
    private String _H14b8 = "";
    private String _H14b9 = "";
    private String _H14b9X = "";
    private String _H14c1 = "";
    private String _H14c1a = "";
    private String _H14c1b = "";
    private String _H14c1c = "";
    private String _H14c1d = "";
    private String _H14c1e = "";
    private String _H14c1f = "";
    private String _H14c1g = "";
    private String _H14c1h = "";
    private String _H14c1i = "";
    private String _H14c1j = "";
    private String _H14c1k = "";
    private String _H14c1l = "";
    private String _H14c1m = "";
    private String _H14c1n = "";
    private String _H14c1o = "";
    private String _H14c1p = "";
    private String _H14c1q = "";
    private String _H14c1r = "";
    private String _H14c1s = "";
    private String _H14c1t = "";
    private String _H14c1x = "";
    private String _H14c1x1 = "";
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

    public String getH14b1() {
        return _H14b1;
    }

    public void setH14b1(String newValue) {
        _H14b1 = newValue;
    }

    public String getH14b2() {
        return _H14b2;
    }

    public void setH14b2(String newValue) {
        _H14b2 = newValue;
    }

    public String getH14b3() {
        return _H14b3;
    }

    public void setH14b3(String newValue) {
        _H14b3 = newValue;
    }

    public String getH14b4() {
        return _H14b4;
    }

    public void setH14b4(String newValue) {
        _H14b4 = newValue;
    }

    public String getH14b5() {
        return _H14b5;
    }

    public void setH14b5(String newValue) {
        _H14b5 = newValue;
    }

    public String getH14b6() {
        return _H14b6;
    }

    public void setH14b6(String newValue) {
        _H14b6 = newValue;
    }

    public String getH14b7() {
        return _H14b7;
    }

    public void setH14b7(String newValue) {
        _H14b7 = newValue;
    }

    public String getH14b8() {
        return _H14b8;
    }

    public void setH14b8(String newValue) {
        _H14b8 = newValue;
    }

    public String getH14b9() {
        return _H14b9;
    }

    public void setH14b9(String newValue) {
        _H14b9 = newValue;
    }

    public String getH14b9X() {
        return _H14b9X;
    }

    public void setH14b9X(String newValue) {
        _H14b9X = newValue;
    }

    public String getH14c1() {
        return _H14c1;
    }

    public void setH14c1(String newValue) {
        _H14c1 = newValue;
    }

    public String getH14c1a() {
        return _H14c1a;
    }

    public void setH14c1a(String newValue) {
        _H14c1a = newValue;
    }

    public String getH14c1b() {
        return _H14c1b;
    }

    public void setH14c1b(String newValue) {
        _H14c1b = newValue;
    }

    public String getH14c1c() {
        return _H14c1c;
    }

    public void setH14c1c(String newValue) {
        _H14c1c = newValue;
    }

    public String getH14c1d() {
        return _H14c1d;
    }

    public void setH14c1d(String newValue) {
        _H14c1d = newValue;
    }

    public String getH14c1e() {
        return _H14c1e;
    }

    public void setH14c1e(String newValue) {
        _H14c1e = newValue;
    }

    public String getH14c1f() {
        return _H14c1f;
    }

    public void setH14c1f(String newValue) {
        _H14c1f = newValue;
    }

    public String getH14c1g() {
        return _H14c1g;
    }

    public void setH14c1g(String newValue) {
        _H14c1g = newValue;
    }

    public String getH14c1h() {
        return _H14c1h;
    }

    public void setH14c1h(String newValue) {
        _H14c1h = newValue;
    }

    public String getH14c1i() {
        return _H14c1i;
    }

    public void setH14c1i(String newValue) {
        _H14c1i = newValue;
    }

    public String getH14c1j() {
        return _H14c1j;
    }

    public void setH14c1j(String newValue) {
        _H14c1j = newValue;
    }

    public String getH14c1k() {
        return _H14c1k;
    }

    public void setH14c1k(String newValue) {
        _H14c1k = newValue;
    }

    public String getH14c1l() {
        return _H14c1l;
    }

    public void setH14c1l(String newValue) {
        _H14c1l = newValue;
    }

    public String getH14c1m() {
        return _H14c1m;
    }

    public void setH14c1m(String newValue) {
        _H14c1m = newValue;
    }

    public String getH14c1n() {
        return _H14c1n;
    }

    public void setH14c1n(String newValue) {
        _H14c1n = newValue;
    }

    public String getH14c1o() {
        return _H14c1o;
    }

    public void setH14c1o(String newValue) {
        _H14c1o = newValue;
    }

    public String getH14c1p() {
        return _H14c1p;
    }

    public void setH14c1p(String newValue) {
        _H14c1p = newValue;
    }

    public String getH14c1q() {
        return _H14c1q;
    }

    public void setH14c1q(String newValue) {
        _H14c1q = newValue;
    }

    public String getH14c1r() {
        return _H14c1r;
    }

    public void setH14c1r(String newValue) {
        _H14c1r = newValue;
    }

    public String getH14c1s() {
        return _H14c1s;
    }

    public void setH14c1s(String newValue) {
        _H14c1s = newValue;
    }

    public String getH14c1t() {
        return _H14c1t;
    }

    public void setH14c1t(String newValue) {
        _H14c1t = newValue;
    }

    public String getH14c1x() {
        return _H14c1x;
    }

    public void setH14c1x(String newValue) {
        _H14c1x = newValue;
    }

    public String getH14c1x1() {
        return _H14c1x1;
    }

    public void setH14c1x1(String newValue) {
        _H14c1x1 = newValue;
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,H14b1,H14b2,H14b3,H14b4,H14b5,H14b6,H14b7,H14b8,H14b9,H14b9X,H14c1,H14c1a,H14c1b,H14c1c,H14c1d,H14c1e,H14c1f,H14c1g,H14c1h,H14c1i,H14c1j,H14c1k,H14c1l,H14c1m,H14c1n,H14c1o,H14c1p,H14c1q,H14c1r,H14c1s,H14c1t,H14c1x,H14c1x1,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _H14b1 + "', '" + _H14b2 + "', '" + _H14b3 + "', '" + _H14b4 + "', '" + _H14b5 + "', '" + _H14b6 + "', '" + _H14b7 + "', '" + _H14b8 + "', '" + _H14b9 + "', '" + _H14b9X + "', '" + _H14c1 + "', '" + _H14c1a + "', '" + _H14c1b + "', '" + _H14c1c + "', '" + _H14c1d + "', '" + _H14c1e + "', '" + _H14c1f + "', '" + _H14c1g + "', '" + _H14c1h + "', '" + _H14c1i + "', '" + _H14c1j + "', '" + _H14c1k + "', '" + _H14c1l + "', '" + _H14c1m + "', '" + _H14c1n + "', '" + _H14c1o + "', '" + _H14c1p + "', '" + _H14c1q + "', '" + _H14c1r + "', '" + _H14c1s + "', '" + _H14c1t + "', '" + _H14c1x + "', '" + _H14c1x1 + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',H14b1 = '" + _H14b1 + "',H14b2 = '" + _H14b2 + "',H14b3 = '" + _H14b3 + "',H14b4 = '" + _H14b4 + "',H14b5 = '" + _H14b5 + "',H14b6 = '" + _H14b6 + "',H14b7 = '" + _H14b7 + "',H14b8 = '" + _H14b8 + "',H14b9 = '" + _H14b9 + "',H14b9X = '" + _H14b9X + "',H14c1 = '" + _H14c1 + "',H14c1a = '" + _H14c1a + "',H14c1b = '" + _H14c1b + "',H14c1c = '" + _H14c1c + "',H14c1d = '" + _H14c1d + "',H14c1e = '" + _H14c1e + "',H14c1f = '" + _H14c1f + "',H14c1g = '" + _H14c1g + "',H14c1h = '" + _H14c1h + "',H14c1i = '" + _H14c1i + "',H14c1j = '" + _H14c1j + "',H14c1k = '" + _H14c1k + "',H14c1l = '" + _H14c1l + "',H14c1m = '" + _H14c1m + "',H14c1n = '" + _H14c1n + "',H14c1o = '" + _H14c1o + "',H14c1p = '" + _H14c1p + "',H14c1q = '" + _H14c1q + "',H14c1r = '" + _H14c1r + "',H14c1s = '" + _H14c1s + "',H14c1t = '" + _H14c1t + "',H14c1x = '" + _H14c1x + "',H14c1x1 = '" + _H14c1x1 + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<Destruction2_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<Destruction2_DataModel> data = new ArrayList<Destruction2_DataModel>();
        Destruction2_DataModel d = new Destruction2_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new Destruction2_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._H14b1 = cur.getString(cur.getColumnIndex("H14b1"));
            d._H14b2 = cur.getString(cur.getColumnIndex("H14b2"));
            d._H14b3 = cur.getString(cur.getColumnIndex("H14b3"));
            d._H14b4 = cur.getString(cur.getColumnIndex("H14b4"));
            d._H14b5 = cur.getString(cur.getColumnIndex("H14b5"));
            d._H14b6 = cur.getString(cur.getColumnIndex("H14b6"));
            d._H14b7 = cur.getString(cur.getColumnIndex("H14b7"));
            d._H14b8 = cur.getString(cur.getColumnIndex("H14b8"));
            d._H14b9 = cur.getString(cur.getColumnIndex("H14b9"));
            d._H14b9X = cur.getString(cur.getColumnIndex("H14b9X"));
            d._H14c1 = cur.getString(cur.getColumnIndex("H14c1"));
            d._H14c1a = cur.getString(cur.getColumnIndex("H14c1a"));
            d._H14c1b = cur.getString(cur.getColumnIndex("H14c1b"));
            d._H14c1c = cur.getString(cur.getColumnIndex("H14c1c"));
            d._H14c1d = cur.getString(cur.getColumnIndex("H14c1d"));
            d._H14c1e = cur.getString(cur.getColumnIndex("H14c1e"));
            d._H14c1f = cur.getString(cur.getColumnIndex("H14c1f"));
            d._H14c1g = cur.getString(cur.getColumnIndex("H14c1g"));
            d._H14c1h = cur.getString(cur.getColumnIndex("H14c1h"));
            d._H14c1i = cur.getString(cur.getColumnIndex("H14c1i"));
            d._H14c1j = cur.getString(cur.getColumnIndex("H14c1j"));
            d._H14c1k = cur.getString(cur.getColumnIndex("H14c1k"));
            d._H14c1l = cur.getString(cur.getColumnIndex("H14c1l"));
            d._H14c1m = cur.getString(cur.getColumnIndex("H14c1m"));
            d._H14c1n = cur.getString(cur.getColumnIndex("H14c1n"));
            d._H14c1o = cur.getString(cur.getColumnIndex("H14c1o"));
            d._H14c1p = cur.getString(cur.getColumnIndex("H14c1p"));
            d._H14c1q = cur.getString(cur.getColumnIndex("H14c1q"));
            d._H14c1r = cur.getString(cur.getColumnIndex("H14c1r"));
            d._H14c1s = cur.getString(cur.getColumnIndex("H14c1s"));
            d._H14c1t = cur.getString(cur.getColumnIndex("H14c1t"));
            d._H14c1x = cur.getString(cur.getColumnIndex("H14c1x"));
            d._H14c1x1 = cur.getString(cur.getColumnIndex("H14c1x1"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}