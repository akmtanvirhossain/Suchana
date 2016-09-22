package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class NGOWork_DataModel {

    String TableName = "NGOWork";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _H161 = "";
    private String _H162 = "";
    private String _H163a = "";
    private String _H163b = "";
    private String _H163c = "";
    private String _H163d = "";
    private String _H163e = "";
    private String _H163f = "";
    private String _H163g = "";
    private String _H163h = "";
    private String _H163i = "";
    private String _H163x = "";
    private String _H163oth = "";
    private String _H164 = "";
    private String _H165a = "";
    private String _H165b = "";
    private String _H165c = "";
    private String _H165d = "";
    private String _H165e = "";
    private String _H165f = "";
    private String _H165g = "";
    private String _H165h = "";
    private String _H165x = "";
    private String _H16x1 = "";
    private String _H165i = "";
    private String _H166 = "";
    private String _H167a = "";
    private String _H167b = "";
    private String _H167c = "";
    private String _H167d = "";
    private String _H167e = "";
    private String _H167f = "";
    private String _H167g = "";
    private String _H167i = "";
    private String _H167x = "";
    private String _H167x1 = "";
    private String _H168 = "";
    private String _H169 = "";
    private String _H1610 = "";
    private String _H1611 = "";
    private String _H1612a = "";
    private String _H1612b = "";
    private String _H1612c = "";
    private String _H1612d = "";
    private String _H1612e = "";
    private String _H1612f = "";
    private String _H1612g = "";
    private String _H1612h = "";
    private String _H1612i = "";
    private String _H1612j = "";
    private String _H1612x = "";
    private String _H1612x1 = "";
    private String _H1613 = "";
    private String _H1614a = "";
    private String _H1614b = "";
    private String _H1614c = "";
    private String _H1614d = "";
    private String _H1614e = "";
    private String _H1614f = "";
    private String _H1614x = "";
    private String _H1614x1 = "";
    private String _H1615 = "";
    private String _H1616a = "";
    private String _H1616b = "";
    private String _H1616c = "";
    private String _H1616d = "";
    private String _H1616e = "";
    private String _H1616f = "";
    private String _H1616g = "";
    private String _H1616h = "";
    private String _H1616i = "";
    private String _H1616x = "";
    private String _H1616x1 = "";
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

    public String getH161() {
        return _H161;
    }

    public void setH161(String newValue) {
        _H161 = newValue;
    }

    public String getH162() {
        return _H162;
    }

    public void setH162(String newValue) {
        _H162 = newValue;
    }

    public String getH163a() {
        return _H163a;
    }

    public void setH163a(String newValue) {
        _H163a = newValue;
    }

    public String getH163b() {
        return _H163b;
    }

    public void setH163b(String newValue) {
        _H163b = newValue;
    }

    public String getH163c() {
        return _H163c;
    }

    public void setH163c(String newValue) {
        _H163c = newValue;
    }

    public String getH163d() {
        return _H163d;
    }

    public void setH163d(String newValue) {
        _H163d = newValue;
    }

    public String getH163e() {
        return _H163e;
    }

    public void setH163e(String newValue) {
        _H163e = newValue;
    }

    public String getH163f() {
        return _H163f;
    }

    public void setH163f(String newValue) {
        _H163f = newValue;
    }

    public String getH163g() {
        return _H163g;
    }

    public void setH163g(String newValue) {
        _H163g = newValue;
    }

    public String getH163h() {
        return _H163h;
    }

    public void setH163h(String newValue) {
        _H163h = newValue;
    }

    public String getH163i() {
        return _H163i;
    }

    public void setH163i(String newValue) {
        _H163i = newValue;
    }

    public String getH163x() {
        return _H163x;
    }

    public void setH163x(String newValue) {
        _H163x = newValue;
    }

    public String getH163oth() {
        return _H163oth;
    }

    public void setH163oth(String newValue) {
        _H163oth = newValue;
    }

    public String getH164() {
        return _H164;
    }

    public void setH164(String newValue) {
        _H164 = newValue;
    }

    public String getH165a() {
        return _H165a;
    }

    public void setH165a(String newValue) {
        _H165a = newValue;
    }

    public String getH165b() {
        return _H165b;
    }

    public void setH165b(String newValue) {
        _H165b = newValue;
    }

    public String getH165c() {
        return _H165c;
    }

    public void setH165c(String newValue) {
        _H165c = newValue;
    }

    public String getH165d() {
        return _H165d;
    }

    public void setH165d(String newValue) {
        _H165d = newValue;
    }

    public String getH165e() {
        return _H165e;
    }

    public void setH165e(String newValue) {
        _H165e = newValue;
    }

    public String getH165f() {
        return _H165f;
    }

    public void setH165f(String newValue) {
        _H165f = newValue;
    }

    public String getH165g() {
        return _H165g;
    }

    public void setH165g(String newValue) {
        _H165g = newValue;
    }

    public String getH165h() {
        return _H165h;
    }

    public void setH165h(String newValue) {
        _H165h = newValue;
    }

    public String getH165x() {
        return _H165x;
    }

    public void setH165x(String newValue) {
        _H165x = newValue;
    }

    public String getH16x1() {
        return _H16x1;
    }

    public void setH16x1(String newValue) {
        _H16x1 = newValue;
    }

    public String getH165i() {
        return _H165i;
    }

    public void setH165i(String newValue) {
        _H165i = newValue;
    }

    public String getH166() {
        return _H166;
    }

    public void setH166(String newValue) {
        _H166 = newValue;
    }

    public String getH167a() {
        return _H167a;
    }

    public void setH167a(String newValue) {
        _H167a = newValue;
    }

    public String getH167b() {
        return _H167b;
    }

    public void setH167b(String newValue) {
        _H167b = newValue;
    }

    public String getH167c() {
        return _H167c;
    }

    public void setH167c(String newValue) {
        _H167c = newValue;
    }

    public String getH167d() {
        return _H167d;
    }

    public void setH167d(String newValue) {
        _H167d = newValue;
    }

    public String getH167e() {
        return _H167e;
    }

    public void setH167e(String newValue) {
        _H167e = newValue;
    }

    public String getH167f() {
        return _H167f;
    }

    public void setH167f(String newValue) {
        _H167f = newValue;
    }

    public String getH167g() {
        return _H167g;
    }

    public void setH167g(String newValue) {
        _H167g = newValue;
    }

    public String getH167i() {
        return _H167i;
    }

    public void setH167i(String newValue) {
        _H167i = newValue;
    }

    public String getH167x() {
        return _H167x;
    }

    public void setH167x(String newValue) {
        _H167x = newValue;
    }

    public String getH167x1() {
        return _H167x1;
    }

    public void setH167x1(String newValue) {
        _H167x1 = newValue;
    }

    public String getH168() {
        return _H168;
    }

    public void setH168(String newValue) {
        _H168 = newValue;
    }

    public String getH169() {
        return _H169;
    }

    public void setH169(String newValue) {
        _H169 = newValue;
    }

    public String getH1610() {
        return _H1610;
    }

    public void setH1610(String newValue) {
        _H1610 = newValue;
    }

    public String getH1611() {
        return _H1611;
    }

    public void setH1611(String newValue) {
        _H1611 = newValue;
    }

    public String getH1612a() {
        return _H1612a;
    }

    public void setH1612a(String newValue) {
        _H1612a = newValue;
    }

    public String getH1612b() {
        return _H1612b;
    }

    public void setH1612b(String newValue) {
        _H1612b = newValue;
    }

    public String getH1612c() {
        return _H1612c;
    }

    public void setH1612c(String newValue) {
        _H1612c = newValue;
    }

    public String getH1612d() {
        return _H1612d;
    }

    public void setH1612d(String newValue) {
        _H1612d = newValue;
    }

    public String getH1612e() {
        return _H1612e;
    }

    public void setH1612e(String newValue) {
        _H1612e = newValue;
    }

    public String getH1612f() {
        return _H1612f;
    }

    public void setH1612f(String newValue) {
        _H1612f = newValue;
    }

    public String getH1612g() {
        return _H1612g;
    }

    public void setH1612g(String newValue) {
        _H1612g = newValue;
    }

    public String getH1612h() {
        return _H1612h;
    }

    public void setH1612h(String newValue) {
        _H1612h = newValue;
    }

    public String getH1612i() {
        return _H1612i;
    }

    public void setH1612i(String newValue) {
        _H1612i = newValue;
    }

    public String getH1612j() {
        return _H1612j;
    }

    public void setH1612j(String newValue) {
        _H1612j = newValue;
    }

    public String getH1612x() {
        return _H1612x;
    }

    public void setH1612x(String newValue) {
        _H1612x = newValue;
    }

    public String getH1612x1() {
        return _H1612x1;
    }

    public void setH1612x1(String newValue) {
        _H1612x1 = newValue;
    }

    public String getH1613() {
        return _H1613;
    }

    public void setH1613(String newValue) {
        _H1613 = newValue;
    }

    public String getH1614a() {
        return _H1614a;
    }

    public void setH1614a(String newValue) {
        _H1614a = newValue;
    }

    public String getH1614b() {
        return _H1614b;
    }

    public void setH1614b(String newValue) {
        _H1614b = newValue;
    }

    public String getH1614c() {
        return _H1614c;
    }

    public void setH1614c(String newValue) {
        _H1614c = newValue;
    }

    public String getH1614d() {
        return _H1614d;
    }

    public void setH1614d(String newValue) {
        _H1614d = newValue;
    }

    public String getH1614e() {
        return _H1614e;
    }

    public void setH1614e(String newValue) {
        _H1614e = newValue;
    }

    public String getH1614f() {
        return _H1614f;
    }

    public void setH1614f(String newValue) {
        _H1614f = newValue;
    }

    public String getH1614x() {
        return _H1614x;
    }

    public void setH1614x(String newValue) {
        _H1614x = newValue;
    }

    public String getH1614x1() {
        return _H1614x1;
    }

    public void setH1614x1(String newValue) {
        _H1614x1 = newValue;
    }

    public String getH1615() {
        return _H1615;
    }

    public void setH1615(String newValue) {
        _H1615 = newValue;
    }

    public String getH1616a() {
        return _H1616a;
    }

    public void setH1616a(String newValue) {
        _H1616a = newValue;
    }

    public String getH1616b() {
        return _H1616b;
    }

    public void setH1616b(String newValue) {
        _H1616b = newValue;
    }

    public String getH1616c() {
        return _H1616c;
    }

    public void setH1616c(String newValue) {
        _H1616c = newValue;
    }

    public String getH1616d() {
        return _H1616d;
    }

    public void setH1616d(String newValue) {
        _H1616d = newValue;
    }

    public String getH1616e() {
        return _H1616e;
    }

    public void setH1616e(String newValue) {
        _H1616e = newValue;
    }

    public String getH1616f() {
        return _H1616f;
    }

    public void setH1616f(String newValue) {
        _H1616f = newValue;
    }

    public String getH1616g() {
        return _H1616g;
    }

    public void setH1616g(String newValue) {
        _H1616g = newValue;
    }

    public String getH1616h() {
        return _H1616h;
    }

    public void setH1616h(String newValue) {
        _H1616h = newValue;
    }

    public String getH1616i() {
        return _H1616i;
    }

    public void setH1616i(String newValue) {
        _H1616i = newValue;
    }

    public String getH1616x() {
        return _H1616x;
    }

    public void setH1616x(String newValue) {
        _H1616x = newValue;
    }

    public String getH1616x1() {
        return _H1616x1;
    }

    public void setH1616x1(String newValue) {
        _H1616x1 = newValue;
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,H161,H162,H163a,H163b,H163c,H163d,H163e,H163f,H163g,H163h,H163i,H163x,H163oth,H164,H165a,H165b,H165c,H165d,H165e,H165f,H165g,H165h,H165x,H16x1,H165i,H166,H167a,H167b,H167c,H167d,H167e,H167f,H167g,H167i,H167x,H167x1,H168,H169,H1610,H1611,H1612a,H1612b,H1612c,H1612d,H1612e,H1612f,H1612g,H1612h,H1612i,H1612j,H1612x,H1612x1,H1613,H1614a,H1614b,H1614c,H1614d,H1614e,H1614f,H1614x,H1614x1,H1615,H1616a,H1616b,H1616c,H1616d,H1616e,H1616f,H1616g,H1616h,H1616i,H1616x,H1616x1,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _H161 + "', '" + _H162 + "', '" + _H163a + "', '" + _H163b + "', '" + _H163c + "', '" + _H163d + "', '" + _H163e + "', '" + _H163f + "', '" + _H163g + "', '" + _H163h + "', '" + _H163i + "', '" + _H163x + "', '" + _H163oth + "', '" + _H164 + "', '" + _H165a + "', '" + _H165b + "', '" + _H165c + "', '" + _H165d + "', '" + _H165e + "', '" + _H165f + "', '" + _H165g + "', '" + _H165h + "', '" + _H165x + "', '" + _H16x1 + "', '" + _H165i + "', '" + _H166 + "', '" + _H167a + "', '" + _H167b + "', '" + _H167c + "', '" + _H167d + "', '" + _H167e + "', '" + _H167f + "', '" + _H167g + "', '" + _H167i + "', '" + _H167x + "', '" + _H167x1 + "', '" + _H168 + "', '" + _H169 + "', '" + _H1610 + "', '" + _H1611 + "', '" + _H1612a + "', '" + _H1612b + "', '" + _H1612c + "', '" + _H1612d + "', '" + _H1612e + "', '" + _H1612f + "', '" + _H1612g + "', '" + _H1612h + "', '" + _H1612i + "', '" + _H1612j + "', '" + _H1612x + "', '" + _H1612x1 + "', '" + _H1613 + "', '" + _H1614a + "', '" + _H1614b + "', '" + _H1614c + "', '" + _H1614d + "', '" + _H1614e + "', '" + _H1614f + "', '" + _H1614x + "', '" + _H1614x1 + "', '" + _H1615 + "', '" + _H1616a + "', '" + _H1616b + "', '" + _H1616c + "', '" + _H1616d + "', '" + _H1616e + "', '" + _H1616f + "', '" + _H1616g + "', '" + _H1616h + "', '" + _H1616i + "', '" + _H1616x + "', '" + _H1616x1 + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',H161 = '" + _H161 + "',H162 = '" + _H162 + "',H163a = '" + _H163a + "',H163b = '" + _H163b + "',H163c = '" + _H163c + "',H163d = '" + _H163d + "',H163e = '" + _H163e + "',H163f = '" + _H163f + "',H163g = '" + _H163g + "',H163h = '" + _H163h + "',H163i = '" + _H163i + "',H163x = '" + _H163x + "',H163oth = '" + _H163oth + "',H164 = '" + _H164 + "',H165a = '" + _H165a + "',H165b = '" + _H165b + "',H165c = '" + _H165c + "',H165d = '" + _H165d + "',H165e = '" + _H165e + "',H165f = '" + _H165f + "',H165g = '" + _H165g + "',H165h = '" + _H165h + "',H165x = '" + _H165x + "',H16x1 = '" + _H16x1 + "',H165i = '" + _H165i + "',H166 = '" + _H166 + "',H167a = '" + _H167a + "',H167b = '" + _H167b + "',H167c = '" + _H167c + "',H167d = '" + _H167d + "',H167e = '" + _H167e + "',H167f = '" + _H167f + "',H167g = '" + _H167g + "',H167i = '" + _H167i + "',H167x = '" + _H167x + "',H167x1 = '" + _H167x1 + "',H168 = '" + _H168 + "',H169 = '" + _H169 + "',H1610 = '" + _H1610 + "',H1611 = '" + _H1611 + "',H1612a = '" + _H1612a + "',H1612b = '" + _H1612b + "',H1612c = '" + _H1612c + "',H1612d = '" + _H1612d + "',H1612e = '" + _H1612e + "',H1612f = '" + _H1612f + "',H1612g = '" + _H1612g + "',H1612h = '" + _H1612h + "',H1612i = '" + _H1612i + "',H1612j = '" + _H1612j + "',H1612x = '" + _H1612x + "',H1612x1 = '" + _H1612x1 + "',H1613 = '" + _H1613 + "',H1614a = '" + _H1614a + "',H1614b = '" + _H1614b + "',H1614c = '" + _H1614c + "',H1614d = '" + _H1614d + "',H1614e = '" + _H1614e + "',H1614f = '" + _H1614f + "',H1614x = '" + _H1614x + "',H1614x1 = '" + _H1614x1 + "',H1615 = '" + _H1615 + "',H1616a = '" + _H1616a + "',H1616b = '" + _H1616b + "',H1616c = '" + _H1616c + "',H1616d = '" + _H1616d + "',H1616e = '" + _H1616e + "',H1616f = '" + _H1616f + "',H1616g = '" + _H1616g + "',H1616h = '" + _H1616h + "',H1616i = '" + _H1616i + "',H1616x = '" + _H1616x + "',H1616x1 = '" + _H1616x1 + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<NGOWork_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<NGOWork_DataModel> data = new ArrayList<NGOWork_DataModel>();
        NGOWork_DataModel d = new NGOWork_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new NGOWork_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._H161 = cur.getString(cur.getColumnIndex("H161"));
            d._H162 = cur.getString(cur.getColumnIndex("H162"));
            d._H163a = cur.getString(cur.getColumnIndex("H163a"));
            d._H163b = cur.getString(cur.getColumnIndex("H163b"));
            d._H163c = cur.getString(cur.getColumnIndex("H163c"));
            d._H163d = cur.getString(cur.getColumnIndex("H163d"));
            d._H163e = cur.getString(cur.getColumnIndex("H163e"));
            d._H163f = cur.getString(cur.getColumnIndex("H163f"));
            d._H163g = cur.getString(cur.getColumnIndex("H163g"));
            d._H163h = cur.getString(cur.getColumnIndex("H163h"));
            d._H163i = cur.getString(cur.getColumnIndex("H163i"));
            d._H163x = cur.getString(cur.getColumnIndex("H163x"));
            d._H163oth = cur.getString(cur.getColumnIndex("H163oth"));
            d._H164 = cur.getString(cur.getColumnIndex("H164"));
            d._H165a = cur.getString(cur.getColumnIndex("H165a"));
            d._H165b = cur.getString(cur.getColumnIndex("H165b"));
            d._H165c = cur.getString(cur.getColumnIndex("H165c"));
            d._H165d = cur.getString(cur.getColumnIndex("H165d"));
            d._H165e = cur.getString(cur.getColumnIndex("H165e"));
            d._H165f = cur.getString(cur.getColumnIndex("H165f"));
            d._H165g = cur.getString(cur.getColumnIndex("H165g"));
            d._H165h = cur.getString(cur.getColumnIndex("H165h"));
            d._H165x = cur.getString(cur.getColumnIndex("H165x"));
            d._H16x1 = cur.getString(cur.getColumnIndex("H16x1"));
            d._H165i = cur.getString(cur.getColumnIndex("H165i"));
            d._H166 = cur.getString(cur.getColumnIndex("H166"));
            d._H167a = cur.getString(cur.getColumnIndex("H167a"));
            d._H167b = cur.getString(cur.getColumnIndex("H167b"));
            d._H167c = cur.getString(cur.getColumnIndex("H167c"));
            d._H167d = cur.getString(cur.getColumnIndex("H167d"));
            d._H167e = cur.getString(cur.getColumnIndex("H167e"));
            d._H167f = cur.getString(cur.getColumnIndex("H167f"));
            d._H167g = cur.getString(cur.getColumnIndex("H167g"));
            d._H167i = cur.getString(cur.getColumnIndex("H167i"));
            d._H167x = cur.getString(cur.getColumnIndex("H167x"));
            d._H167x1 = cur.getString(cur.getColumnIndex("H167x1"));
            d._H168 = cur.getString(cur.getColumnIndex("H168"));
            d._H169 = cur.getString(cur.getColumnIndex("H169"));
            d._H1610 = cur.getString(cur.getColumnIndex("H1610"));
            d._H1611 = cur.getString(cur.getColumnIndex("H1611"));
            d._H1612a = cur.getString(cur.getColumnIndex("H1612a"));
            d._H1612b = cur.getString(cur.getColumnIndex("H1612b"));
            d._H1612c = cur.getString(cur.getColumnIndex("H1612c"));
            d._H1612d = cur.getString(cur.getColumnIndex("H1612d"));
            d._H1612e = cur.getString(cur.getColumnIndex("H1612e"));
            d._H1612f = cur.getString(cur.getColumnIndex("H1612f"));
            d._H1612g = cur.getString(cur.getColumnIndex("H1612g"));
            d._H1612h = cur.getString(cur.getColumnIndex("H1612h"));
            d._H1612i = cur.getString(cur.getColumnIndex("H1612i"));
            d._H1612j = cur.getString(cur.getColumnIndex("H1612j"));
            d._H1612x = cur.getString(cur.getColumnIndex("H1612x"));
            d._H1612x1 = cur.getString(cur.getColumnIndex("H1612x1"));
            d._H1613 = cur.getString(cur.getColumnIndex("H1613"));
            d._H1614a = cur.getString(cur.getColumnIndex("H1614a"));
            d._H1614b = cur.getString(cur.getColumnIndex("H1614b"));
            d._H1614c = cur.getString(cur.getColumnIndex("H1614c"));
            d._H1614d = cur.getString(cur.getColumnIndex("H1614d"));
            d._H1614e = cur.getString(cur.getColumnIndex("H1614e"));
            d._H1614f = cur.getString(cur.getColumnIndex("H1614f"));
            d._H1614x = cur.getString(cur.getColumnIndex("H1614x"));
            d._H1614x1 = cur.getString(cur.getColumnIndex("H1614x1"));
            d._H1615 = cur.getString(cur.getColumnIndex("H1615"));
            d._H1616a = cur.getString(cur.getColumnIndex("H1616a"));
            d._H1616b = cur.getString(cur.getColumnIndex("H1616b"));
            d._H1616c = cur.getString(cur.getColumnIndex("H1616c"));
            d._H1616d = cur.getString(cur.getColumnIndex("H1616d"));
            d._H1616e = cur.getString(cur.getColumnIndex("H1616e"));
            d._H1616f = cur.getString(cur.getColumnIndex("H1616f"));
            d._H1616g = cur.getString(cur.getColumnIndex("H1616g"));
            d._H1616h = cur.getString(cur.getColumnIndex("H1616h"));
            d._H1616i = cur.getString(cur.getColumnIndex("H1616i"));
            d._H1616x = cur.getString(cur.getColumnIndex("H1616x"));
            d._H1616x1 = cur.getString(cur.getColumnIndex("H1616x1"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}