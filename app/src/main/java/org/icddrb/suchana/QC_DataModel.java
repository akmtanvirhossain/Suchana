package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import Common.Connection;

import java.util.ArrayList;
import java.util.List;

public class QC_DataModel {
    String TableName = "QC";
    Connection C;

    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _H311 = "";
    private String _H312 = "";
    private String _H313 = "";
    private String _H61 = "";
    private String _H14c1 = "";
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
    private String _M11 = "";
    private String _M12 = "";
    private String _M13 = "";
    private String _M19 = "";
    private String _M115 = "";
    private String _M116 = "";
    private String _M120 = "";
    private String _M121 = "";
    private String _C14 = "";
    private String _C15 = "";
    private String _C16 = "";
    private String _C110 = "";
    private String _C115 = "";
    private String _C140 = "";
    private String _C142a = "";
    private String _C142b = "";
    private String _C142c = "";
    private String _C142d = "";
    private String _C142e = "";
    private String _C142f = "";
    private String _C142g = "";
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

    public String getH311() {
        return _H311;
    }

    public void setH311(String newValue) {
        _H311 = newValue;
    }

    public String getH312() {
        return _H312;
    }

    public void setH312(String newValue) {
        _H312 = newValue;
    }

    public String getH313() {
        return _H313;
    }

    public void setH313(String newValue) {
        _H313 = newValue;
    }

    public String getH61() {
        return _H61;
    }

    public void setH61(String newValue) {
        _H61 = newValue;
    }

    public String getH14c1() {
        return _H14c1;
    }

    public void setH14c1(String newValue) {
        _H14c1 = newValue;
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

    public String getM11() {
        return _M11;
    }

    public void setM11(String newValue) {
        _M11 = newValue;
    }

    public String getM12() {
        return _M12;
    }

    public void setM12(String newValue) {
        _M12 = newValue;
    }

    public String getM13() {
        return _M13;
    }

    public void setM13(String newValue) {
        _M13 = newValue;
    }

    public String getM19() {
        return _M19;
    }

    public void setM19(String newValue) {
        _M19 = newValue;
    }

    public String getM115() {
        return _M115;
    }

    public void setM115(String newValue) {
        _M115 = newValue;
    }

    public String getM116() {
        return _M116;
    }

    public void setM116(String newValue) {
        _M116 = newValue;
    }

    public String getM120() {
        return _M120;
    }

    public void setM120(String newValue) {
        _M120 = newValue;
    }

    public String getM121() {
        return _M121;
    }

    public void setM121(String newValue) {
        _M121 = newValue;
    }

    public String getC14() {
        return _C14;
    }

    public void setC14(String newValue) {
        _C14 = newValue;
    }

    public String getC15() {
        return _C15;
    }

    public void setC15(String newValue) {
        _C15 = newValue;
    }

    public String getC16() {
        return _C16;
    }

    public void setC16(String newValue) {
        _C16 = newValue;
    }

    public String getC110() {
        return _C110;
    }

    public void setC110(String newValue) {
        _C110 = newValue;
    }

    public String getC115() {
        return _C115;
    }

    public void setC115(String newValue) {
        _C115 = newValue;
    }

    public String getC140() {
        return _C140;
    }

    public void setC140(String newValue) {
        _C140 = newValue;
    }

    public String getC142a() {
        return _C142a;
    }

    public void setC142a(String newValue) {
        _C142a = newValue;
    }

    public String getC142b() {
        return _C142b;
    }

    public void setC142b(String newValue) {
        _C142b = newValue;
    }

    public String getC142c() {
        return _C142c;
    }

    public void setC142c(String newValue) {
        _C142c = newValue;
    }

    public String getC142d() {
        return _C142d;
    }

    public void setC142d(String newValue) {
        _C142d = newValue;
    }

    public String getC142e() {
        return _C142e;
    }

    public void setC142e(String newValue) {
        _C142e = newValue;
    }

    public String getC142f() {
        return _C142f;
    }

    public void setC142f(String newValue) {
        _C142f = newValue;
    }

    public String getC142g() {
        return _C142g;
    }

    public void setC142g(String newValue) {
        _C142g = newValue;
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,H311,H312,H313,H61,H14c1,H14b1,H14b2,H14b3,H14b4,H14b5,H14b6,H14b7,H14b8,H14b9,H14b9X,M11,M12,M13,M19,M115,M116,M120,M121,C14,C15,C16,C110,C115,C140,C142a,C142b,C142c,C142d,C142e,C142f,C142g,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _H311 + "', '" + _H312 + "', '" + _H313 + "', '" + _H61 + "', '" + _H14c1 + "', '" + _H14b1 + "', '" + _H14b2 + "', '" + _H14b3 + "', '" + _H14b4 + "', '" + _H14b5 + "', '" + _H14b6 + "', '" + _H14b7 + "', '" + _H14b8 + "', '" + _H14b9 + "', '" + _H14b9X + "', '" + _M11 + "', '" + _M12 + "', '" + _M13 + "', '" + _M19 + "', '" + _M115 + "', '" + _M116 + "', '" + _M120 + "', '" + _M121 + "', '" + _C14 + "', '" + _C15 + "', '" + _C16 + "', '" + _C110 + "', '" + _C115 + "', '" + _C140 + "', '" + _C142a + "', '" + _C142b + "', '" + _C142c + "', '" + _C142d + "', '" + _C142e + "', '" + _C142f + "', '" + _C142g + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
            C.Save(SQL);
            C.close();
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',H311 = '" + _H311 + "',H312 = '" + _H312 + "',H313 = '" + _H313 + "',H61 = '" + _H61 + "',H14c1 = '" + _H14c1 + "',H14b1 = '" + _H14b1 + "',H14b2 = '" + _H14b2 + "',H14b3 = '" + _H14b3 + "',H14b4 = '" + _H14b4 + "',H14b5 = '" + _H14b5 + "',H14b6 = '" + _H14b6 + "',H14b7 = '" + _H14b7 + "',H14b8 = '" + _H14b8 + "',H14b9 = '" + _H14b9 + "',H14b9X = '" + _H14b9X + "',M11 = '" + _M11 + "',M12 = '" + _M12 + "',M13 = '" + _M13 + "',M19 = '" + _M19 + "',M115 = '" + _M115 + "',M116 = '" + _M116 + "',M120 = '" + _M120 + "',M121 = '" + _M121 + "',C14 = '" + _C14 + "',C15 = '" + _C15 + "',C16 = '" + _C16 + "',C110 = '" + _C110 + "',C115 = '" + _C115 + "',C140 = '" + _C140 + "',C142a = '" + _C142a + "',C142b = '" + _C142b + "',C142c = '" + _C142c + "',C142d = '" + _C142d + "',C142e = '" + _C142e + "',C142f = '" + _C142f + "',C142g = '" + _C142g + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
            C.Save(SQL);
            C.close();
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<QC_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<QC_DataModel> data = new ArrayList<QC_DataModel>();
        QC_DataModel d = new QC_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new QC_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._H311 = cur.getString(cur.getColumnIndex("H311"));
            d._H312 = cur.getString(cur.getColumnIndex("H312"));
            d._H313 = cur.getString(cur.getColumnIndex("H313"));
            d._H61 = cur.getString(cur.getColumnIndex("H61"));
            d._H14c1 = cur.getString(cur.getColumnIndex("H14c1"));
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
            d._M11 = cur.getString(cur.getColumnIndex("M11"));
            d._M12 = cur.getString(cur.getColumnIndex("M12"));
            d._M13 = cur.getString(cur.getColumnIndex("M13"));
            d._M19 = cur.getString(cur.getColumnIndex("M19"));
            d._M115 = cur.getString(cur.getColumnIndex("M115"));
            d._M116 = cur.getString(cur.getColumnIndex("M116"));
            d._M120 = cur.getString(cur.getColumnIndex("M120"));
            d._M121 = cur.getString(cur.getColumnIndex("M121"));
            d._C14 = cur.getString(cur.getColumnIndex("C14"));
            d._C15 = cur.getString(cur.getColumnIndex("C15"));
            d._C16 = cur.getString(cur.getColumnIndex("C16"));
            d._C110 = cur.getString(cur.getColumnIndex("C110"));
            d._C115 = cur.getString(cur.getColumnIndex("C115"));
            d._C140 = cur.getString(cur.getColumnIndex("C140"));
            d._C142a = cur.getString(cur.getColumnIndex("C142a"));
            d._C142b = cur.getString(cur.getColumnIndex("C142b"));
            d._C142c = cur.getString(cur.getColumnIndex("C142c"));
            d._C142d = cur.getString(cur.getColumnIndex("C142d"));
            d._C142e = cur.getString(cur.getColumnIndex("C142e"));
            d._C142f = cur.getString(cur.getColumnIndex("C142f"));
            d._C142g = cur.getString(cur.getColumnIndex("C142g"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}