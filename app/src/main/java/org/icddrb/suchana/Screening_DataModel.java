package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;
public class Screening_DataModel{

    String TableName = "Screening";
    Connection C;
    private String _Rnd = "";
    private String _Dist = "";
    private String _Upz = "";
    private String _Un = "";
    private String _Vill = "";
    private String _Ward = "";
    private String _VDate = "";
    private String _ImpOrg = "";
    private String _HHType = "";
    private String _WRUn = "";
    private String _WRVill = "";
    private String _WRNo = "";
    private String _WRHHNo = "";
    private String _HHDist = "";
    private String _HHUpz = "";
    private String _HHUn = "";
    private String _HHVill = "";
    private String _HHNo = "";
    private String _ScreeningID = "";
    private String _BenName = "";
    private String _HeadName = "";
    private String _FName = "";
    private String _HsuName = "";
    private String _MobNo = "";
    private String _ReqMobNo = "";
    private String _HHLocation = "";
    private String _ResName = "";
    private String _Relation = "";
    private String _Q1 = "";
    private String _Q2 = "";
    private String _Q3 = "";
    private String _Q4 = "";
    private String _Q5 = "";
    private String _Q6 = "";
    private String _Q7 = "";
    private String _Q8 = "";
    private String _Q8a = "";
    private String _Q9 = "";
    private String _BDate = "";
    private String _Q9a = "";
    private String _Q10 = "";
    private String _Q10a = "";
    private String _Q11 = "";
    private String _Comments = "";
    private String _StartTime = "";
    private String _EndTime = "";
    private String _UserId = "";
    private String _EntryUser = "";
    private String _Lat = "";
    private String _Lon = "";
    private String _EnDt = "";
    private String _Upload = "2";

    public String getRnd(){
        return _Rnd;
    }

    public void setRnd(String newValue){
        _Rnd = newValue;
    }

    public String getDist(){
        return _Dist;
    }

    public void setDist(String newValue){
        _Dist = newValue;
    }

    public String getUpz(){
        return _Upz;
    }

    public void setUpz(String newValue){
        _Upz = newValue;
    }

    public String getUn(){
        return _Un;
    }

    public void setUn(String newValue){
        _Un = newValue;
    }

    public String getVill(){
        return _Vill;
    }

    public void setVill(String newValue){
        _Vill = newValue;
    }

    public String getWard(){
        return _Ward;
    }

    public void setWard(String newValue){
        _Ward = newValue;
    }

    public String getVDate(){
        return _VDate;
    }

    public void setVDate(String newValue){
        _VDate = newValue;
    }

    public String getImpOrg(){
        return _ImpOrg;
    }

    public void setImpOrg(String newValue){
        _ImpOrg = newValue;
    }

    public String getHHType(){
        return _HHType;
    }

    public void setHHType(String newValue){
        _HHType = newValue;
    }

    public String getWRUn(){
        return _WRUn;
    }

    public void setWRUn(String newValue){
        _WRUn = newValue;
    }

    public String getWRVill(){
        return _WRVill;
    }

    public void setWRVill(String newValue){
        _WRVill = newValue;
    }

    public String getWRNo(){
        return _WRNo;
    }

    public void setWRNo(String newValue){
        _WRNo = newValue;
    }

    public String getWRHHNo(){
        return _WRHHNo;
    }

    public void setWRHHNo(String newValue){
        _WRHHNo = newValue;
    }

    public String getHHDist(){
        return _HHDist;
    }

    public void setHHDist(String newValue){
        _HHDist = newValue;
    }

    public String getHHUpz(){
        return _HHUpz;
    }

    public void setHHUpz(String newValue){
        _HHUpz = newValue;
    }

    public String getHHUn(){
        return _HHUn;
    }

    public void setHHUn(String newValue){
        _HHUn = newValue;
    }

    public String getHHVill(){
        return _HHVill;
    }

    public void setHHVill(String newValue){
        _HHVill = newValue;
    }

    public String getHHNo(){
        return _HHNo;
    }

    public void setHHNo(String newValue){
        _HHNo = newValue;
    }

    public String getScreeningID(){
        return _ScreeningID;
    }

    public void setScreeningID(String newValue){
        _ScreeningID = newValue;
    }

    public String getBenName(){
        return _BenName;
    }

    public void setBenName(String newValue){
        _BenName = newValue;
    }

    public String getHeadName(){
        return _HeadName;
    }

    public void setHeadName(String newValue){
        _HeadName = newValue;
    }

    public String getFName(){
        return _FName;
    }

    public void setFName(String newValue){
        _FName = newValue;
    }

    public String getHsuName(){
        return _HsuName;
    }

    public void setHsuName(String newValue){
        _HsuName = newValue;
    }

    public String getMobNo(){
        return _MobNo;
    }

    public void setMobNo(String newValue){
        _MobNo = newValue;
    }

    public String getReqMobNo(){
        return _ReqMobNo;
    }

    public void setReqMobNo(String newValue){
        _ReqMobNo = newValue;
    }

    public String getHHLocation(){
        return _HHLocation;
    }

    public void setHHLocation(String newValue){
        _HHLocation = newValue;
    }

    public String getResName(){
        return _ResName;
    }

    public void setResName(String newValue){
        _ResName = newValue;
    }

    public String getRelation(){
        return _Relation;
    }

    public void setRelation(String newValue){
        _Relation = newValue;
    }

    public String getQ1(){
        return _Q1;
    }

    public void setQ1(String newValue){
        _Q1 = newValue;
    }

    public String getQ2(){
        return _Q2;
    }

    public void setQ2(String newValue){
        _Q2 = newValue;
    }

    public String getQ3(){
        return _Q3;
    }

    public void setQ3(String newValue){
        _Q3 = newValue;
    }

    public String getQ4(){
        return _Q4;
    }

    public void setQ4(String newValue){
        _Q4 = newValue;
    }

    public String getQ5(){
        return _Q5;
    }

    public void setQ5(String newValue){
        _Q5 = newValue;
    }

    public String getQ6(){
        return _Q6;
    }

    public void setQ6(String newValue){
        _Q6 = newValue;
    }

    public String getQ7(){
        return _Q7;
    }

    public void setQ7(String newValue){
        _Q7 = newValue;
    }

    public String getQ8(){
        return _Q8;
    }

    public void setQ8(String newValue){
        _Q8 = newValue;
    }

    public String getQ8a(){
        return _Q8a;
    }

    public void setQ8a(String newValue){
        _Q8a = newValue;
    }

    public String getQ9(){
        return _Q9;
    }

    public void setQ9(String newValue){
        _Q9 = newValue;
    }

    public String getBDate(){
        return _BDate;
    }

    public void setBDate(String newValue){
        _BDate = newValue;
    }

    public String getQ9a(){
        return _Q9a;
    }

    public void setQ9a(String newValue){
        _Q9a = newValue;
    }

    public String getQ10(){
        return _Q10;
    }

    public void setQ10(String newValue){
        _Q10 = newValue;
    }

    public String getQ10a(){
        return _Q10a;
    }

    public void setQ10a(String newValue){
        _Q10a = newValue;
    }

    public String getQ11(){
        return _Q11;
    }

    public void setQ11(String newValue){
        _Q11 = newValue;
    }

    public String getComments(){
        return _Comments;
    }

    public void setComments(String newValue){
        _Comments = newValue;
    }

    public void setStartTime(String newValue){
        _StartTime = newValue;
    }

    public void setEndTime(String newValue){
        _EndTime = newValue;
    }

    public void setUserId(String newValue){
        _UserId = newValue;
    }

    public void setEntryUser(String newValue){
        _EntryUser = newValue;
    }

    public void setLat(String newValue){
        _Lat = newValue;
    }

    public void setLon(String newValue){
        _Lon = newValue;
    }

    public void setEnDt(String newValue){
        _EnDt = newValue;
    }

    public String getUpload() {
        return _Upload;
    }

    public void setUpload(String newValue) {
        _Upload = newValue;
    }

    public String SaveUpdateData(Context context)
    {
        String response = "";
        C = new Connection(context);
        String SQL = "";
        try
        {
            if(C.Existence("Select * from "+ TableName +"  Where Rnd='"+ _Rnd +"' and ScreeningID='"+ _ScreeningID +"' "))
                response = UpdateData(context);
            else
                response = SaveData(context);
        }
        catch(Exception  e)
        {
            response = e.getMessage();
        }
        return response;
    }

    private String SaveData(Context context)
    {
        String response = "";
        C = new Connection(context);
        String SQL = "";
        try
        {
            SQL = "Insert into "+ TableName +" (Rnd,Dist,Upz,Un,Vill,Ward,VDate,ImpOrg,HHType,WRUn,WRVill,WRNo,WRHHNo,HHDist,HHUpz,HHUn,HHVill,HHNo,ScreeningID,BenName,HeadName,FName,HsuName,MobNo,ReqMobNo,HHLocation,ResName,Relation,Q1,Q2,Q3,Q4,Q5,Q6,Q7,Q8,Q8a,Q9,BDate,Q9a,Q10,Q10a,Q11,Comments,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('"+ _Rnd +"', '"+ _Dist +"', '"+ _Upz +"', '"+ _Un +"', '"+ _Vill +"', '"+ _Ward +"', '"+ _VDate +"', '"+ _ImpOrg +"', '"+ _HHType +"', '"+ _WRUn +"', '"+ _WRVill +"', '"+ _WRNo +"', '"+ _WRHHNo +"', '"+ _HHDist +"', '"+ _HHUpz +"', '"+ _HHUn +"', '"+ _HHVill +"', '"+ _HHNo +"', '"+ _ScreeningID +"', '"+ _BenName +"', '"+ _HeadName +"', '"+ _FName +"', '"+ _HsuName +"', '"+ _MobNo +"', '"+ _ReqMobNo +"', '"+ _HHLocation +"', '"+ _ResName +"', '"+ _Relation +"', '"+ _Q1 +"', '"+ _Q2 +"', '"+ _Q3 +"', '"+ _Q4 +"', '"+ _Q5 +"', '"+ _Q6 +"', '"+ _Q7 +"', '"+ _Q8 +"', '"+ _Q8a +"', '"+ _Q9 +"', '"+ _BDate +"', '"+ _Q9a +"', '"+ _Q10 +"', '"+ _Q10a +"', '"+ _Q11 +"', '"+ _Comments +"', '"+ _StartTime +"', '"+ _EndTime +"', '"+ _UserId +"', '"+ _EntryUser +"', '"+ _Lat +"', '"+ _Lon +"', '"+ _EnDt +"', '"+ _Upload +"')";
            C.Save(SQL);
        }
        catch(Exception  e)
        {
            response = e.getMessage();
        }
        return response;
    }

    private String UpdateData(Context context)
    {
        String response = "";
        C = new Connection(context);
        String SQL = "";
        try
        {
            SQL = "Update "+ TableName +" Set Upload='2',Rnd = '"+ _Rnd +"',Dist = '"+ _Dist +"',Upz = '"+ _Upz +"',Un = '"+ _Un +"',Vill = '"+ _Vill +"',Ward = '"+ _Ward +"',VDate = '"+ _VDate +"',ImpOrg = '"+ _ImpOrg +"',HHType = '"+ _HHType +"',WRUn = '"+ _WRUn +"',WRVill = '"+ _WRVill +"',WRNo = '"+ _WRNo +"',WRHHNo = '"+ _WRHHNo +"',HHDist = '"+ _HHDist +"',HHUpz = '"+ _HHUpz +"',HHUn = '"+ _HHUn +"',HHVill = '"+ _HHVill +"',HHNo = '"+ _HHNo +"',ScreeningID = '"+ _ScreeningID +"',BenName = '"+ _BenName +"',HeadName = '"+ _HeadName +"',FName = '"+ _FName +"',HsuName = '"+ _HsuName +"',MobNo = '"+ _MobNo +"',ReqMobNo = '"+ _ReqMobNo +"',HHLocation = '"+ _HHLocation +"',ResName = '"+ _ResName +"',Relation = '"+ _Relation +"',Q1 = '"+ _Q1 +"',Q2 = '"+ _Q2 +"',Q3 = '"+ _Q3 +"',Q4 = '"+ _Q4 +"',Q5 = '"+ _Q5 +"',Q6 = '"+ _Q6 +"',Q7 = '"+ _Q7 +"',Q8 = '"+ _Q8 +"',Q8a = '"+ _Q8a +"',Q9 = '"+ _Q9 +"',BDate = '"+ _BDate +"',Q9a = '"+ _Q9a +"',Q10 = '"+ _Q10 +"',Q10a = '"+ _Q10a +"',Q11 = '"+ _Q11 +"',Comments = '"+ _Comments +"'  Where Rnd='"+ _Rnd +"' and ScreeningID='"+ _ScreeningID +"'";
            C.Save(SQL);
        }
        catch(Exception  e)
        {
            response = e.getMessage();
        }
        return response;
    }


    public List<Screening_DataModel> SelectAll(Context context, String SQL)
    {
        Connection C = new Connection(context);
        List<Screening_DataModel> data = new ArrayList<Screening_DataModel>();
        Screening_DataModel d = new Screening_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while(!cur.isAfterLast())
        {
            d = new Screening_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._Dist = cur.getString(cur.getColumnIndex("Dist"));
            d._Upz = cur.getString(cur.getColumnIndex("Upz"));
            d._Un = cur.getString(cur.getColumnIndex("Un"));
            d._Vill = cur.getString(cur.getColumnIndex("Vill"));
            d._Ward = cur.getString(cur.getColumnIndex("Ward"));
            d._VDate = cur.getString(cur.getColumnIndex("VDate"));
            d._ImpOrg = cur.getString(cur.getColumnIndex("ImpOrg"));
            d._HHType = cur.getString(cur.getColumnIndex("HHType"));
            d._WRUn = cur.getString(cur.getColumnIndex("WRUn"));
            d._WRVill = cur.getString(cur.getColumnIndex("WRVill"));
            d._WRNo = cur.getString(cur.getColumnIndex("WRNo"));
            d._WRHHNo = cur.getString(cur.getColumnIndex("WRHHNo"));
            d._HHDist = cur.getString(cur.getColumnIndex("HHDist"));
            d._HHUpz = cur.getString(cur.getColumnIndex("HHUpz"));
            d._HHUn = cur.getString(cur.getColumnIndex("HHUn"));
            d._HHVill = cur.getString(cur.getColumnIndex("HHVill"));

            d._HHNo = cur.getString(cur.getColumnIndex("HHNo"));

            d._ScreeningID = cur.getString(cur.getColumnIndex("ScreeningID"));
            d._BenName = cur.getString(cur.getColumnIndex("BenName"));
            d._HeadName = cur.getString(cur.getColumnIndex("HeadName"));
            d._FName = cur.getString(cur.getColumnIndex("FName"));
            d._HsuName = cur.getString(cur.getColumnIndex("HsuName"));
            d._MobNo = cur.getString(cur.getColumnIndex("MobNo"));
            d._ReqMobNo = cur.getString(cur.getColumnIndex("ReqMobNo"));
            d._HHLocation = cur.getString(cur.getColumnIndex("HHLocation"));
            d._ResName = cur.getString(cur.getColumnIndex("ResName"));
            d._Relation = cur.getString(cur.getColumnIndex("Relation"));
            d._Q1 = cur.getString(cur.getColumnIndex("Q1"));
            d._Q2 = cur.getString(cur.getColumnIndex("Q2"));
            d._Q3 = cur.getString(cur.getColumnIndex("Q3"));
            d._Q4 = cur.getString(cur.getColumnIndex("Q4"));
            d._Q5 = cur.getString(cur.getColumnIndex("Q5"));
            d._Q6 = cur.getString(cur.getColumnIndex("Q6"));
            d._Q7 = cur.getString(cur.getColumnIndex("Q7"));
            d._Q8 = cur.getString(cur.getColumnIndex("Q8"));
            d._Q8a = cur.getString(cur.getColumnIndex("Q8a"));
            d._Q9 = cur.getString(cur.getColumnIndex("Q9"));
            d._BDate = cur.getString(cur.getColumnIndex("BDate"));
            d._Q9a = cur.getString(cur.getColumnIndex("Q9a"));
            d._Q10 = cur.getString(cur.getColumnIndex("Q10"));
            d._Q10a = cur.getString(cur.getColumnIndex("Q10a"));
            d._Q11 = cur.getString(cur.getColumnIndex("Q11"));
            d._Comments = cur.getString(cur.getColumnIndex("Comments"));
            d._Upload = cur.getString(cur.getColumnIndex("Upload"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}