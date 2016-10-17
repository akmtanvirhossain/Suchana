package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class HHIdentity_DataModel {

    String TableName = "HHIdentity";
    Connection C;
    String _distName = "";
    String _upzName = "";
    String _unName = "";
    String _villName = "";
    private String _Rnd = "";
    private String _Dist = "";
    private String _Upz = "";
    private String _Un = "";
    private String _Vill = "";
    private String _H11 = "";
    private String _WRHHNo = "";
    private String _SuchanaID = "";
    private String _ScreeningID = "";
    private String _AgeGroup = "";
    private String _H17 = "";
    private String _Result = "";
    private String _ResultX = "";
    private String _H16 = "";
    private String _H16X = "";
    private String _H13 = "";
    private String _H14 = "";
    private String _H01 = "";
    private String _H02 = "";
    private String _H03 = "";
    private String _H04 = "";
    private String _H05 = "";
    private String _H06 = "";
    private String _H07 = "";
    private String _H07a = "";
    private String _H07b = "";
    private String _H07c = "";
    private String _H07d = "";
    private String _H07e = "";
    private String _H07f = "";
    private String _H07g = "";
    private String _H07h = "";
    private String _H08 = "";
    private String _StartTime = "";
    private String _EndTime = "";
    private String _UserId = "";
    private String _EntryUser = "";
    private String _Lat = "";
    private String _Lon = "";
    private String _EnDt = "";
    private String _Upload = "2";

    private String _BenName = "";
    private String _HeadName = "";
    private String _HsuName = "";
    private String _MobNo = "";
    private String _vdate = "";



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

    public String getWRHHNo() {
        return _WRHHNo;
    }

    public void setWRHHNo(String newValue) {
        _WRHHNo = newValue;
    }

    public String getH11() {
        return _H11;
    }

    public void setH11(String newValue) {
        _H11 = newValue;
    }
    public String getScreeningID() {
        return _ScreeningID;
    }

    public void setScreeningID(String newValue) {
        _ScreeningID = newValue;
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

    public String getH17() {
        return _H17;
    }

    public void setH17(String newValue) {
        _H17 = newValue;
    }

    public String getResult() {
        return _Result;
    }

    public void setResult(String newValue) {
        _Result = newValue;
    }

    public String getResultX() {
        return _ResultX;
    }

    public void setResultX(String newValue) {
        _ResultX = newValue;
    }

    public String getH16() {
        return _H16;
    }

    public void setH16(String newValue) {
        _H16 = newValue;
    }

    public String getH16X() {
        return _H16X;
    }

    public void setH16X(String newValue) {
        _H16X = newValue;
    }

    public String getH13() {
        return _H13;
    }

    public void setH13(String newValue) {
        _H13 = newValue;
    }

    public String getH14() {
        return _H14;
    }

    public void setH14(String newValue) {
        _H14 = newValue;
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

    public String getH07b() {
        return _H07b;
    }

    public void setH07b(String newValue) {
        _H07b = newValue;
    }

    public String getH07c() {
        return _H07c;
    }

    public void setH07c(String newValue) {
        _H07c = newValue;
    }

    public String getH07d() {
        return _H07d;
    }

    public void setH07d(String newValue) {
        _H07d = newValue;
    }

    public String getH07e() {
        return _H07e;
    }

    public void setH07e(String newValue) {
        _H07e = newValue;
    }

    public String getH07f() {
        return _H07f;
    }

    public void setH07f(String newValue) {
        _H07f = newValue;
    }

    public String getH07g() {
        return _H07g;
    }

    public void setH07g(String newValue) {
        _H07g = newValue;
    }

    public String getH07h() {
        return _H07h;
    }

    public void setH07h(String newValue) {
        _H07h = newValue;
    }

    public String getH08() {
        return _H08;
    }

    public void setH08(String newValue) {
        _H08 = newValue;
    }

    public String getBenName() {
        return _BenName;
    }

    public void setBenName(String newValue) {
        _BenName = newValue;
    }

    public String getHeadName() {
        return _HeadName;
    }

    public void setHeadName(String newValue) {
        _HeadName = newValue;
    }

    public String getHsuName() {
        return _HsuName;
    }

    public void setHsuName(String newValue) {
        _HsuName = newValue;
    }

    public String getMobNo() {
        return _MobNo;
    }

    public void setMobNo(String newValue) {
        _MobNo = newValue;
    }

    public String getvdate() {
        return _vdate;
    }

    public void setvdate(String newValue) {
        _vdate = newValue;
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

    public void setUpload() {
        _Upload = "2";
    }

    public String getUpload() {
        return _Upload;
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
            SQL = "Insert into " + TableName + " (Rnd,Dist,Upz,Un,Vill,H11,ScreeningID,AgeGroup,H17,Result,ResultX,H16,H16X,H13,H14,H01,H02,H03,H04,H05,H06,H07,H07a,H07b,H07c,H07d,H07e,H07f,H07g,H07h,H08,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _Dist + "', '" + _Upz + "', '" + _Un + "', '" + _Vill + "', '" + _H11 + "', '" + _ScreeningID + "', '" + _AgeGroup + "', '" + _H17 + "', '" + _Result + "', '" + _ResultX + "', '" + _H16 + "', '" + _H16X + "', '" + _H13 + "', '" + _H14 + "', '" + _H01 + "', '" + _H02 + "', '" + _H03 + "', '" + _H04 + "', '" + _H05 + "', '" + _H06 + "', '" + _H07 + "', '" + _H07a + "', '" + _H07b + "', '" + _H07c + "', '" + _H07d + "', '" + _H07e + "', '" + _H07f + "', '" + _H07g + "', '" + _H07h + "', '" + _H08 + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',Dist = '" + _Dist + "',Upz = '" + _Upz + "',Un = '" + _Un + "',Vill = '" + _Vill + "',H11 = '" + _H11 + "',ScreeningID = '" + _ScreeningID + "',AgeGroup = '" + _AgeGroup + "',H17 = '" + _H17 + "',Result = '" + _Result + "',ResultX = '" + _ResultX + "',H16 = '" + _H16 + "',H16X = '" + _H16X + "',H13 = '" + _H13 + "',H14 = '" + _H14 + "',H01 = '" + _H01 + "',H02 = '" + _H02 + "',H03 = '" + _H03 + "',H04 = '" + _H04 + "',H05 = '" + _H05 + "',H06 = '" + _H06 + "',H07 = '" + _H07 + "',H07a = '" + _H07a + "',H07b = '" + _H07b + "',H07c = '" + _H07c + "',H07d = '" + _H07d + "',H07e = '" + _H07e + "',H07f = '" + _H07f + "',H07g = '" + _H07g + "',H07h = '" + _H07h + "',H08 = '" + _H08 + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
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
            d._WRHHNo = cur.getString(cur.getColumnIndex("WRHHNo"));
            d._ScreeningID = cur.getString(cur.getColumnIndex("ScreeningID"));
            d._AgeGroup = cur.getString(cur.getColumnIndex("AgeGroup"));
            d._H17 = cur.getString(cur.getColumnIndex("H17"));
            d._Result = cur.getString(cur.getColumnIndex("Result"));
            d._ResultX = cur.getString(cur.getColumnIndex("ResultX"));
            d._H16 = cur.getString(cur.getColumnIndex("H16"));
            d._H16X = cur.getString(cur.getColumnIndex("H16X"));
            d._H13 = cur.getString(cur.getColumnIndex("H13"));
            d._H14 = cur.getString(cur.getColumnIndex("H14"));
            d._H01 = cur.getString(cur.getColumnIndex("H01"));
            d._H02 = cur.getString(cur.getColumnIndex("H02"));
            d._H03 = cur.getString(cur.getColumnIndex("H03"));
            d._H04 = cur.getString(cur.getColumnIndex("H04"));
            d._H05 = cur.getString(cur.getColumnIndex("H05"));
            d._H06 = cur.getString(cur.getColumnIndex("H06"));
            d._H07 = cur.getString(cur.getColumnIndex("H07"));
            d._H07a = cur.getString(cur.getColumnIndex("H07a"));
            d._H07b = cur.getString(cur.getColumnIndex("H07b"));
            d._H07c = cur.getString(cur.getColumnIndex("H07c"));
            d._H07d = cur.getString(cur.getColumnIndex("H07d"));
            d._H07e = cur.getString(cur.getColumnIndex("H07e"));
            d._H07f = cur.getString(cur.getColumnIndex("H07f"));
            d._H07g = cur.getString(cur.getColumnIndex("H07g"));
            d._H07h = cur.getString(cur.getColumnIndex("H07h"));
            d._H08 = cur.getString(cur.getColumnIndex("H08"));
            d._Upload = cur.getString(cur.getColumnIndex("Upload"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }

    public String getdistName() {
        return _distName;
    }

    public String getupzName() {
        return _upzName;
    }

    public String getunName() {
        return _unName;
    }

    public String getvillName() {
        return _villName;
    }

    public List<HHIdentity_DataModel> SelectAllList(Context context, String SQL) {
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
            d._WRHHNo = cur.getString(cur.getColumnIndex("WRHHNo"));
            d._ScreeningID = cur.getString(cur.getColumnIndex("ScreeningID"));
            d._distName = cur.getString(cur.getColumnIndex("DistName"));
            d._upzName = cur.getString(cur.getColumnIndex("UPZName"));
            d._unName = cur.getString(cur.getColumnIndex("UNName"));
            d._villName = cur.getString(cur.getColumnIndex("VillName"));
            d._Upload = cur.getString(cur.getColumnIndex("Upload"));

            d._BenName = cur.getString(cur.getColumnIndex("BenName"));
            d._HeadName = cur.getString(cur.getColumnIndex("HeadName"));
            d._HsuName = cur.getString(cur.getColumnIndex("HsuName"));
            d._MobNo = cur.getString(cur.getColumnIndex("MobNo"));
            d._vdate = cur.getString(cur.getColumnIndex("VDate"));

            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}