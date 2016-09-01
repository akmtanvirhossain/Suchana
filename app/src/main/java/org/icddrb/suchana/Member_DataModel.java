package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class Member_DataModel {

    String TableName = "Member";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _H21 = "";
    private String _H22 = "";
    private String _H23 = "";
    private String _H24Y = "";
    private String _H24M = "";
    private String _H25 = "";
    private String _H26 = "";
    private String _H27 = "";
    private String _H28 = "";
    private String _H28X = "";
    private String _H29 = "";
    private String _H210 = "";
    private String _H220 = "";
    private String _H221 = "";
    private String _H211 = "";
    private String _H212 = "";
    private String _H212X = "";
    private String _H213 = "";
    private String _H214 = "";
    private String _H215 = "";
    private String _H215X = "";
    private String _H216 = "";
    private String _H216X = "";
    private String _H217 = "";
    private String _H218 = "";
    private String _H219 = "";
    private String _H222 = "";
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

    public String getH21() {
        return _H21;
    }

    public void setH21(String newValue) {
        _H21 = newValue;
    }

    public String getH22() {
        return _H22;
    }

    public void setH22(String newValue) {
        _H22 = newValue;
    }

    public String getH23() {
        return _H23;
    }

    public void setH23(String newValue) {
        _H23 = newValue;
    }

    public String getH24Y() {
        return _H24Y;
    }

    public void setH24Y(String newValue) {
        _H24Y = newValue;
    }

    public String getH24M() {
        return _H24M;
    }

    public void setH24M(String newValue) {
        _H24M = newValue;
    }

    public String getH25() {
        return _H25;
    }

    public void setH25(String newValue) {
        _H25 = newValue;
    }

    public String getH26() {
        return _H26;
    }

    public void setH26(String newValue) {
        _H26 = newValue;
    }

    public String getH27() {
        return _H27;
    }

    public void setH27(String newValue) {
        _H27 = newValue;
    }

    public String getH28() {
        return _H28;
    }

    public void setH28(String newValue) {
        _H28 = newValue;
    }

    public String getH28X() {
        return _H28X;
    }

    public void setH28X(String newValue) {
        _H28X = newValue;
    }

    public String getH29() {
        return _H29;
    }

    public void setH29(String newValue) {
        _H29 = newValue;
    }

    public String getH210() {
        return _H210;
    }

    public void setH210(String newValue) {
        _H210 = newValue;
    }

    public String getH220() {
        return _H220;
    }

    public void setH220(String newValue) {
        _H220 = newValue;
    }

    public String getH221() {
        return _H221;
    }

    public void setH221(String newValue) {
        _H221 = newValue;
    }

    public String getH211() {
        return _H211;
    }

    public void setH211(String newValue) {
        _H211 = newValue;
    }

    public String getH212() {
        return _H212;
    }

    public void setH212(String newValue) {
        _H212 = newValue;
    }

    public String getH212X() {
        return _H212X;
    }

    public void setH212X(String newValue) {
        _H212X = newValue;
    }

    public String getH213() {
        return _H213;
    }

    public void setH213(String newValue) {
        _H213 = newValue;
    }

    public String getH214() {
        return _H214;
    }

    public void setH214(String newValue) {
        _H214 = newValue;
    }

    public String getH215() {
        return _H215;
    }

    public void setH215(String newValue) {
        _H215 = newValue;
    }

    public String getH215X() {
        return _H215X;
    }

    public void setH215X(String newValue) {
        _H215X = newValue;
    }

    public String getH216() {
        return _H216;
    }

    public void setH216(String newValue) {
        _H216 = newValue;
    }

    public String getH216X() {
        return _H216X;
    }

    public void setH216X(String newValue) {
        _H216X = newValue;
    }

    public String getH217() {
        return _H217;
    }

    public void setH217(String newValue) {
        _H217 = newValue;
    }

    public String getH218() {
        return _H218;
    }

    public void setH218(String newValue) {
        _H218 = newValue;
    }

    public String getH219() {
        return _H219;
    }

    public void setH219(String newValue) {
        _H219 = newValue;
    }

    public String getH222() {
        return _H222;
    }

    public void setH222(String newValue) {
        _H222 = newValue;
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
            if (C.Existence("Select * from " + TableName + "  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "' and H21='" + _H21 + "' "))
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,H21,H22,H23,H24Y,H24M,H25,H26,H27,H28,H28X,H29,H210,H220,H221,H211,H212,H212X,H213,H214,H215,H215X,H216,H216X,H217,H218,H219,H222,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _H21 + "', '" + _H22 + "', '" + _H23 + "', '" + _H24Y + "', '" + _H24M + "', '" + _H25 + "', '" + _H26 + "', '" + _H27 + "', '" + _H28 + "', '" + _H28X + "', '" + _H29 + "', '" + _H210 + "', '" + _H220 + "', '" + _H221 + "', '" + _H211 + "', '" + _H212 + "', '" + _H212X + "', '" + _H213 + "', '" + _H214 + "', '" + _H215 + "', '" + _H215X + "', '" + _H216 + "', '" + _H216X + "', '" + _H217 + "', '" + _H218 + "', '" + _H219 + "', '" + _H222 + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',H21 = '" + _H21 + "',H22 = '" + _H22 + "',H23 = '" + _H23 + "',H24Y = '" + _H24Y + "',H24M = '" + _H24M + "',H25 = '" + _H25 + "',H26 = '" + _H26 + "',H27 = '" + _H27 + "',H28 = '" + _H28 + "',H28X = '" + _H28X + "',H29 = '" + _H29 + "',H210 = '" + _H210 + "',H220 = '" + _H220 + "',H221 = '" + _H221 + "',H211 = '" + _H211 + "',H212 = '" + _H212 + "',H212X = '" + _H212X + "',H213 = '" + _H213 + "',H214 = '" + _H214 + "',H215 = '" + _H215 + "',H215X = '" + _H215X + "',H216 = '" + _H216 + "',H216X = '" + _H216X + "',H217 = '" + _H217 + "',H218 = '" + _H218 + "',H219 = '" + _H219 + "',H222 = '" + _H222 + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "' and H21='" + _H21 + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<Member_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<Member_DataModel> data = new ArrayList<Member_DataModel>();
        Member_DataModel d = new Member_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new Member_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._H21 = cur.getString(cur.getColumnIndex("H21"));
            d._H22 = cur.getString(cur.getColumnIndex("H22"));
            d._H23 = cur.getString(cur.getColumnIndex("H23"));
            d._H24Y = cur.getString(cur.getColumnIndex("H24Y"));
            d._H24M = cur.getString(cur.getColumnIndex("H24M"));
            d._H25 = cur.getString(cur.getColumnIndex("H25"));
            d._H26 = cur.getString(cur.getColumnIndex("H26"));
            d._H27 = cur.getString(cur.getColumnIndex("H27"));
            d._H28 = cur.getString(cur.getColumnIndex("H28"));
            d._H28X = cur.getString(cur.getColumnIndex("H28X"));
            d._H29 = cur.getString(cur.getColumnIndex("H29"));
            d._H210 = cur.getString(cur.getColumnIndex("H210"));
            d._H220 = cur.getString(cur.getColumnIndex("H220"));
            d._H221 = cur.getString(cur.getColumnIndex("H221"));
            d._H211 = cur.getString(cur.getColumnIndex("H211"));
            d._H212 = cur.getString(cur.getColumnIndex("H212"));
            d._H212X = cur.getString(cur.getColumnIndex("H212X"));
            d._H213 = cur.getString(cur.getColumnIndex("H213"));
            d._H214 = cur.getString(cur.getColumnIndex("H214"));
            d._H215 = cur.getString(cur.getColumnIndex("H215"));
            d._H215X = cur.getString(cur.getColumnIndex("H215X"));
            d._H216 = cur.getString(cur.getColumnIndex("H216"));
            d._H216X = cur.getString(cur.getColumnIndex("H216X"));
            d._H217 = cur.getString(cur.getColumnIndex("H217"));
            d._H218 = cur.getString(cur.getColumnIndex("H218"));
            d._H219 = cur.getString(cur.getColumnIndex("H219"));
            d._H222 = cur.getString(cur.getColumnIndex("H222"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}