package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class HHIdentity_DataModel {

    String TableName = "HHIdentity";
    Connection C;
    private String _Rnd = "";
    private String _Dist = "";
    private String _Upz = "";
    private String _Un = "";
    private String _Vill = "";
    private String _H11 = "";
    private String _SuchanaID = "";
    private String _AgeGroup = "";
    private String _H14 = "";
    private String _Result = "";
    private String _OthResult = "";
    private String _H12 = "";
    private String _H01 = "";
    private String _H02 = "";
    private String _H12x = "";
    private String _H15 = "";
    private String _H03 = "";
    private String _H04 = "";
    private String _H17 = "";
    private String _H05 = "";
    private String _H06 = "";
    private String _H07 = "";
    private String _H07a = "";
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

    public String getDist() {
        return _Dist;
    }

    public void setDist(String newValue) {
        _Dist = newValue;
    }

    public String getUpz() {
        return _Upz;
    }

    public void setUpz(String newValue) {
        _Upz = newValue;
    }

    public String getUn() {
        return _Un;
    }

    public void setUn(String newValue) {
        _Un = newValue;
    }

    public String getVill() {
        return _Vill;
    }

    public void setVill(String newValue) {
        _Vill = newValue;
    }

    public String getH11() {
        return _H11;
    }

    public void setH11(String newValue) {
        _H11 = newValue;
    }

    public String getSuchanaID() {
        return _SuchanaID;
    }

    public void setSuchanaID(String newValue) {
        _SuchanaID = newValue;
    }

    public String getAgeGroup() {
        return _AgeGroup;
    }

    public void setAgeGroup(String newValue) {
        _AgeGroup = newValue;
    }

    public String getH14() {
        return _H14;
    }

    public void setH14(String newValue) {
        _H14 = newValue;
    }

    public String getResult() {
        return _Result;
    }

    public void setResult(String newValue) {
        _Result = newValue;
    }

    public String getOthResult() {
        return _OthResult;
    }

    public void setOthResult(String newValue) {
        _OthResult = newValue;
    }

    public String getH12() {
        return _H12;
    }

    public void setH12(String newValue) {
        _H12 = newValue;
    }

    public String getH01() {
        return _H01;
    }

    public void setH01(String newValue) {
        _H01 = newValue;
    }

    public String getH02() {
        return _H02;
    }

    public void setH02(String newValue) {
        _H02 = newValue;
    }

    public String getH12x() {
        return _H12x;
    }

    public void setH12x(String newValue) {
        _H12x = newValue;
    }

    public String getH15() {
        return _H15;
    }

    public void setH15(String newValue) {
        _H15 = newValue;
    }

    public String getH03() {
        return _H03;
    }

    public void setH03(String newValue) {
        _H03 = newValue;
    }

    public String getH04() {
        return _H04;
    }

    public void setH04(String newValue) {
        _H04 = newValue;
    }

    public String getH17() {
        return _H17;
    }

    public void setH17(String newValue) {
        _H17 = newValue;
    }

    public String getH05() {
        return _H05;
    }

    public void setH05(String newValue) {
        _H05 = newValue;
    }

    public String getH06() {
        return _H06;
    }

    public void setH06(String newValue) {
        _H06 = newValue;
    }

    public String getH07() {
        return _H07;
    }

    public void setH07(String newValue) {
        _H07 = newValue;
    }

    public String getH07a() {
        return _H07a;
    }

    public void setH07a(String newValue) {
        _H07a = newValue;
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
            SQL = "Insert into " + TableName + " (Rnd,Dist,Upz,Un,Vill,H11,SuchanaID,AgeGroup,H14,Result,OthResult,H12,H01,H02,H12x,H15,H03,H04,H17,H05,H06,H07,H07a,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _Dist + "', '" + _Upz + "', '" + _Un + "', '" + _Vill + "', '" + _H11 + "', '" + _SuchanaID + "', '" + _AgeGroup + "', '" + _H14 + "', '" + _Result + "', '" + _OthResult + "', '" + _H12 + "', '" + _H01 + "', '" + _H02 + "', '" + _H12x + "', '" + _H15 + "', '" + _H03 + "', '" + _H04 + "', '" + _H17 + "', '" + _H05 + "', '" + _H06 + "', '" + _H07 + "', '" + _H07a + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',Dist = '" + _Dist + "',Upz = '" + _Upz + "',Un = '" + _Un + "',Vill = '" + _Vill + "',H11 = '" + _H11 + "',SuchanaID = '" + _SuchanaID + "',AgeGroup = '" + _AgeGroup + "',H14 = '" + _H14 + "',Result = '" + _Result + "',OthResult = '" + _OthResult + "',H12 = '" + _H12 + "',H01 = '" + _H01 + "',H02 = '" + _H02 + "',H12x = '" + _H12x + "',H15 = '" + _H15 + "',H03 = '" + _H03 + "',H04 = '" + _H04 + "',H17 = '" + _H17 + "',H05 = '" + _H05 + "',H06 = '" + _H06 + "',H07 = '" + _H07 + "',H07a = '" + _H07a + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<HHIdentity_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<HHIdentity_DataModel> data = new ArrayList<HHIdentity_DataModel>();
        HHIdentity_DataModel d = new HHIdentity_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new HHIdentity_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._Dist = cur.getString(cur.getColumnIndex("Dist"));
            d._Upz = cur.getString(cur.getColumnIndex("Upz"));
            d._Un = cur.getString(cur.getColumnIndex("Un"));
            d._Vill = cur.getString(cur.getColumnIndex("Vill"));
            d._H11 = cur.getString(cur.getColumnIndex("H11"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._AgeGroup = cur.getString(cur.getColumnIndex("AgeGroup"));
            d._H14 = cur.getString(cur.getColumnIndex("H14"));
            d._Result = cur.getString(cur.getColumnIndex("Result"));
            d._OthResult = cur.getString(cur.getColumnIndex("OthResult"));
            d._H12 = cur.getString(cur.getColumnIndex("H12"));
            d._H01 = cur.getString(cur.getColumnIndex("H01"));
            d._H02 = cur.getString(cur.getColumnIndex("H02"));
            d._H12x = cur.getString(cur.getColumnIndex("H12x"));
            d._H15 = cur.getString(cur.getColumnIndex("H15"));
            d._H03 = cur.getString(cur.getColumnIndex("H03"));
            d._H04 = cur.getString(cur.getColumnIndex("H04"));
            d._H17 = cur.getString(cur.getColumnIndex("H17"));
            d._H05 = cur.getString(cur.getColumnIndex("H05"));
            d._H06 = cur.getString(cur.getColumnIndex("H06"));
            d._H07 = cur.getString(cur.getColumnIndex("H07"));
            d._H07a = cur.getString(cur.getColumnIndex("H07a"));
            d._Upload = cur.getString(cur.getColumnIndex("Upload"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}