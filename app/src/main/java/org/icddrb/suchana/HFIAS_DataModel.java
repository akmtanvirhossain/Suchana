package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class HFIAS_DataModel {

    String TableName = "HFIAS";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _H121 = "";
    private String _H122 = "";
    private String _H123 = "";
    private String _H124 = "";
    private String _H125 = "";
    private String _H126 = "";
    private String _H127 = "";
    private String _H128 = "";
    private String _H129 = "";
    private String _H1210 = "";
    private String _H1211 = "";
    private String _H1212 = "";
    private String _H1213 = "";
    private String _H1214 = "";
    private String _H1215 = "";
    private String _H1216 = "";
    private String _H1217 = "";
    private String _H1218 = "";
    private String _H131 = "";
    private String _H132A = "";
    private String _H132B = "";
    private String _H132C = "";
    private String _H132D = "";
    private String _H132E = "";
    private String _H132F = "";
    private String _H132G = "";
    private String _H132H = "";
    private String _H132I = "";
    private String _H132J = "";
    private String _H132K = "";
    private String _H132L = "";
    private String _StartTime = "";
    private String _EndTime = "";
    private String _UserId = "";
    private String _EntryUser = "";
    private String _Lat = "";
    private String _Lon = "";
    private String _EnDt = "";
    private String _Upload = "2";

    public String getUpload() {
        return _Upload;
    }

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

    public String getH121() {
        return _H121;
    }

    public void setH121(String newValue) {
        _H121 = newValue;
    }

    public String getH122() {
        return _H122;
    }

    public void setH122(String newValue) {
        _H122 = newValue;
    }

    public String getH123() {
        return _H123;
    }

    public void setH123(String newValue) {
        _H123 = newValue;
    }

    public String getH124() {
        return _H124;
    }

    public void setH124(String newValue) {
        _H124 = newValue;
    }

    public String getH125() {
        return _H125;
    }

    public void setH125(String newValue) {
        _H125 = newValue;
    }

    public String getH126() {
        return _H126;
    }

    public void setH126(String newValue) {
        _H126 = newValue;
    }

    public String getH127() {
        return _H127;
    }

    public void setH127(String newValue) {
        _H127 = newValue;
    }

    public String getH128() {
        return _H128;
    }

    public void setH128(String newValue) {
        _H128 = newValue;
    }

    public String getH129() {
        return _H129;
    }

    public void setH129(String newValue) {
        _H129 = newValue;
    }

    public String getH1210() {
        return _H1210;
    }

    public void setH1210(String newValue) {
        _H1210 = newValue;
    }

    public String getH1211() {
        return _H1211;
    }

    public void setH1211(String newValue) {
        _H1211 = newValue;
    }

    public String getH1212() {
        return _H1212;
    }

    public void setH1212(String newValue) {
        _H1212 = newValue;
    }

    public String getH1213() {
        return _H1213;
    }

    public void setH1213(String newValue) {
        _H1213 = newValue;
    }

    public String getH1214() {
        return _H1214;
    }

    public void setH1214(String newValue) {
        _H1214 = newValue;
    }

    public String getH1215() {
        return _H1215;
    }

    public void setH1215(String newValue) {
        _H1215 = newValue;
    }

    public String getH1216() {
        return _H1216;
    }

    public void setH1216(String newValue) {
        _H1216 = newValue;
    }

    public String getH1217() {
        return _H1217;
    }

    public void setH1217(String newValue) {
        _H1217 = newValue;
    }

    public String getH1218() {
        return _H1218;
    }

    public void setH1218(String newValue) {
        _H1218 = newValue;
    }

    public String getH131() {
        return _H131;
    }

    public void setH131(String newValue) {
        _H131 = newValue;
    }

    public String getH132A() {
        return _H132A;
    }

    public void setH132A(String newValue) {
        _H132A = newValue;
    }

    public String getH132B() {
        return _H132B;
    }

    public void setH132B(String newValue) {
        _H132B = newValue;
    }

    public String getH132C() {
        return _H132C;
    }

    public void setH132C(String newValue) {
        _H132C = newValue;
    }

    public String getH132D() {
        return _H132D;
    }

    public void setH132D(String newValue) {
        _H132D = newValue;
    }

    public String getH132E() {
        return _H132E;
    }

    public void setH132E(String newValue) {
        _H132E = newValue;
    }

    public String getH132F() {
        return _H132F;
    }

    public void setH132F(String newValue) {
        _H132F = newValue;
    }

    public String getH132G() {
        return _H132G;
    }

    public void setH132G(String newValue) {
        _H132G = newValue;
    }

    public String getH132H() {
        return _H132H;
    }

    public void setH132H(String newValue) {
        _H132H = newValue;
    }

    public String getH132I() {
        return _H132I;
    }

    public void setH132I(String newValue) {
        _H132I = newValue;
    }

    public String getH132J() {
        return _H132J;
    }

    public void setH132J(String newValue) {
        _H132J = newValue;
    }

    public String getH132K() {
        return _H132K;
    }

    public void setH132K(String newValue) {
        _H132K = newValue;
    }

    public String getH132L() {
        return _H132L;
    }

    public void setH132L(String newValue) {
        _H132L = newValue;
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,H121,H122,H123,H124,H125,H126,H127,H128,H129,H1210,H1211,H1212,H1213,H1214,H1215,H1216,H1217,H1218,H131,H132A,H132B,H132C,H132D,H132E,H132F,H132G,H132H,H132I,H132J,H132K,H132L,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _H121 + "', '" + _H122 + "', '" + _H123 + "', '" + _H124 + "', '" + _H125 + "', '" + _H126 + "', '" + _H127 + "', '" + _H128 + "', '" + _H129 + "', '" + _H1210 + "', '" + _H1211 + "', '" + _H1212 + "', '" + _H1213 + "', '" + _H1214 + "', '" + _H1215 + "', '" + _H1216 + "', '" + _H1217 + "', '" + _H1218 + "', '" + _H131 + "', '" + _H132A + "', '" + _H132B + "', '" + _H132C + "', '" + _H132D + "', '" + _H132E + "', '" + _H132F + "', '" + _H132G + "', '" + _H132H + "', '" + _H132I + "', '" + _H132J + "', '" + _H132K + "', '" + _H132L + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',H121 = '" + _H121 + "',H122 = '" + _H122 + "',H123 = '" + _H123 + "',H124 = '" + _H124 + "',H125 = '" + _H125 + "',H126 = '" + _H126 + "',H127 = '" + _H127 + "',H128 = '" + _H128 + "',H129 = '" + _H129 + "',H1210 = '" + _H1210 + "',H1211 = '" + _H1211 + "',H1212 = '" + _H1212 + "',H1213 = '" + _H1213 + "',H1214 = '" + _H1214 + "',H1215 = '" + _H1215 + "',H1216 = '" + _H1216 + "',H1217 = '" + _H1217 + "',H1218 = '" + _H1218 + "',H131 = '" + _H131 + "',H132A = '" + _H132A + "',H132B = '" + _H132B + "',H132C = '" + _H132C + "',H132D = '" + _H132D + "',H132E = '" + _H132E + "',H132F = '" + _H132F + "',H132G = '" + _H132G + "',H132H = '" + _H132H + "',H132I = '" + _H132I + "',H132J = '" + _H132J + "',H132K = '" + _H132K + "',H132L = '" + _H132L + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<HFIAS_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<HFIAS_DataModel> data = new ArrayList<HFIAS_DataModel>();
        HFIAS_DataModel d = new HFIAS_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new HFIAS_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._H121 = cur.getString(cur.getColumnIndex("H121"));
            d._H122 = cur.getString(cur.getColumnIndex("H122"));
            d._H123 = cur.getString(cur.getColumnIndex("H123"));
            d._H124 = cur.getString(cur.getColumnIndex("H124"));
            d._H125 = cur.getString(cur.getColumnIndex("H125"));
            d._H126 = cur.getString(cur.getColumnIndex("H126"));
            d._H127 = cur.getString(cur.getColumnIndex("H127"));
            d._H128 = cur.getString(cur.getColumnIndex("H128"));
            d._H129 = cur.getString(cur.getColumnIndex("H129"));
            d._H1210 = cur.getString(cur.getColumnIndex("H1210"));
            d._H1211 = cur.getString(cur.getColumnIndex("H1211"));
            d._H1212 = cur.getString(cur.getColumnIndex("H1212"));
            d._H1213 = cur.getString(cur.getColumnIndex("H1213"));
            d._H1214 = cur.getString(cur.getColumnIndex("H1214"));
            d._H1215 = cur.getString(cur.getColumnIndex("H1215"));
            d._H1216 = cur.getString(cur.getColumnIndex("H1216"));
            d._H1217 = cur.getString(cur.getColumnIndex("H1217"));
            d._H1218 = cur.getString(cur.getColumnIndex("H1218"));
            d._H131 = cur.getString(cur.getColumnIndex("H131"));
            d._H132A = cur.getString(cur.getColumnIndex("H132A"));
            d._H132B = cur.getString(cur.getColumnIndex("H132B"));
            d._H132C = cur.getString(cur.getColumnIndex("H132C"));
            d._H132D = cur.getString(cur.getColumnIndex("H132D"));
            d._H132E = cur.getString(cur.getColumnIndex("H132E"));
            d._H132F = cur.getString(cur.getColumnIndex("H132F"));
            d._H132G = cur.getString(cur.getColumnIndex("H132G"));
            d._H132H = cur.getString(cur.getColumnIndex("H132H"));
            d._H132I = cur.getString(cur.getColumnIndex("H132I"));
            d._H132J = cur.getString(cur.getColumnIndex("H132J"));
            d._H132K = cur.getString(cur.getColumnIndex("H132K"));
            d._H132L = cur.getString(cur.getColumnIndex("H132L"));
            d._Upload = cur.getString(cur.getColumnIndex("Upload"));

            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}