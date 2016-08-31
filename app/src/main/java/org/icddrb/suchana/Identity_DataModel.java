package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;
import Common.Connection;
import java.util.ArrayList;
import java.util.List;
public class Identity_DataModel{

    private String _AgeGroup = "";
    public String getAgeGroup(){
        return _AgeGroup;
    }
    public void setAgeGroup(String newValue){
        _AgeGroup = newValue;
    }
    private String _Result = "";
    public String getResult(){
        return _Result;
    }
    public void setResult(String newValue){
        _Result = newValue;
    }
    private String _OthResult = "";
    public String getOthResult(){
        return _OthResult;
    }
    public void setOthResult(String newValue){
        _OthResult = newValue;
    }
    private String _H01 = "";
    public String getH01(){
        return _H01;
    }
    public void setH01(String newValue){
        _H01 = newValue;
    }
    private String _H02 = "";
    public String getH02(){
        return _H02;
    }
    public void setH02(String newValue){
        _H02 = newValue;
    }
    private String _H03 = "";
    public String getH03(){
        return _H03;
    }
    public void setH03(String newValue){
        _H03 = newValue;
    }
    private String _H04 = "";
    public String getH04(){
        return _H04;
    }
    public void setH04(String newValue){
        _H04 = newValue;
    }
    private String _H05 = "";
    public String getH05(){
        return _H05;
    }
    public void setH05(String newValue){
        _H05 = newValue;
    }
    private String _H06 = "";
    public String getH06(){
        return _H06;
    }
    public void setH06(String newValue){
        _H06 = newValue;
    }
    private String _H07 = "";
    public String getH07(){
        return _H07;
    }
    public void setH07(String newValue){
        _H07 = newValue;
    }
    private String _H07a = "";
    public String getH07a(){
        return _H07a;
    }
    public void setH07a(String newValue){
        _H07a = newValue;
    }
    private String _Dist = "";
    public String getDist(){
        return _Dist;
    }
    public void setDist(String newValue){
        _Dist = newValue;
    }
    private String _Upz = "";
    public String getUpz(){
        return _Upz;
    }
    public void setUpz(String newValue){
        _Upz = newValue;
    }
    private String _Un = "";
    public String getUn(){
        return _Un;
    }
    public void setUn(String newValue){
        _Un = newValue;
    }
    private String _Vill = "";
    public String getVill(){
        return _Vill;
    }
    public void setVill(String newValue){
        _Vill = newValue;
    }
    private String _H11 = "";
    public String getH11(){
        return _H11;
    }
    public void setH11(String newValue){
        _H11 = newValue;
    }
    private String _H12 = "";
    public String getH12(){
        return _H12;
    }
    public void setH12(String newValue){
        _H12 = newValue;
    }
    private String _H12x = "";
    public String getH12x(){
        return _H12x;
    }
    public void setH12x(String newValue){
        _H12x = newValue;
    }
    private String _ShuchonaID = "";
    public String getShuchonaID(){
        return _ShuchonaID;
    }
    public void setShuchonaID(String newValue){
        _ShuchonaID = newValue;
    }
    private String _H14 = "";
    public String getH14(){
        return _H14;
    }
    public void setH14(String newValue){
        _H14 = newValue;
    }
    private String _H15 = "";
    public String getH15(){
        return _H15;
    }
    public void setH15(String newValue){
        _H15 = newValue;
    }
    private String _H17 = "";
    public String getH17(){
        return _H17;
    }
    public void setH17(String newValue){
        _H17 = newValue;
    }
    private String _Rnd = "";
    public String getRnd(){
        return _Rnd;
    }
    public void setRnd(String newValue){
        _Rnd = newValue;
    }
    private String _StartTime = "";
    public void setStartTime(String newValue){
        _StartTime = newValue;
    }
    private String _EndTime = "";
    public void setEndTime(String newValue){
        _EndTime = newValue;
    }
    private String _UserId = "";
    public void setUserId(String newValue){
        _UserId = newValue;
    }
    private String _EntryUser = "";
    public void setEntryUser(String newValue){
        _EntryUser = newValue;
    }
    private String _Lat = "";
    public void setLat(String newValue){
        _Lat = newValue;
    }
    private String _Lon = "";
    public void setLon(String newValue){
        _Lon = newValue;
    }
    private String _EnDt = "";
    public void setEnDt(String newValue){
        _EnDt = newValue;
    }
    private String _Upload = "2";

    String TableName = "Identity";

    public String SaveUpdateData(Context context)
    {
        String response = "";
        C = new Connection(context);
        String SQL = "";
        try
        {
            if(C.Existence("Select * from "+ TableName +"  Where ShuchonaID='"+ _ShuchonaID +"' and Rnd='"+ _Rnd +"' "))
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
    Connection C;

    private String SaveData(Context context)
    {
        String response = "";
        C = new Connection(context);
        String SQL = "";
        try
        {
            SQL = "Insert into "+ TableName +" (AgeGroup,Result,OthResult,H01,H02,H03,H04,H05,H06,H07,H07a,Dist,Upz,Un,Vill,H11,H12,H12x,ShuchonaID,H14,H15,H17,Rnd,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('"+ _AgeGroup +"', '"+ _Result +"', '"+ _OthResult +"', '"+ _H01 +"', '"+ _H02 +"', '"+ _H03 +"', '"+ _H04 +"', '"+ _H05 +"', '"+ _H06 +"', '"+ _H07 +"', '"+ _H07a +"', '"+ _Dist +"', '"+ _Upz +"', '"+ _Un +"', '"+ _Vill +"', '"+ _H11 +"', '"+ _H12 +"', '"+ _H12x +"', '"+ _ShuchonaID +"', '"+ _H14 +"', '"+ _H15 +"', '"+ _H17 +"', '"+ _Rnd +"', '"+ _StartTime +"', '"+ _EndTime +"', '"+ _UserId +"', '"+ _EntryUser +"', '"+ _Lat +"', '"+ _Lon +"', '"+ _EnDt +"', '"+ _Upload +"')";
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
            SQL = "Update "+ TableName +" Set Upload='2',AgeGroup = '"+ _AgeGroup +"',Result = '"+ _Result +"',OthResult = '"+ _OthResult +"',H01 = '"+ _H01 +"',H02 = '"+ _H02 +"',H03 = '"+ _H03 +"',H04 = '"+ _H04 +"',H05 = '"+ _H05 +"',H06 = '"+ _H06 +"',H07 = '"+ _H07 +"',H07a = '"+ _H07a +"',Dist = '"+ _Dist +"',Upz = '"+ _Upz +"',Un = '"+ _Un +"',Vill = '"+ _Vill +"',H11 = '"+ _H11 +"',H12 = '"+ _H12 +"',H12x = '"+ _H12x +"',ShuchonaID = '"+ _ShuchonaID +"',H14 = '"+ _H14 +"',H15 = '"+ _H15 +"',H17 = '"+ _H17 +"',Rnd = '"+ _Rnd +"'  Where ShuchonaID='"+ _ShuchonaID +"' and Rnd='"+ _Rnd +"'";
            C.Save(SQL);
        }
        catch(Exception  e)
        {
            response = e.getMessage();
        }
        return response;
    }


    public List<Identity_DataModel> SelectAll(Context context, String SQL)
    {
        Connection C = new Connection(context);
        List<Identity_DataModel> data = new ArrayList<Identity_DataModel>();
        Identity_DataModel d = new Identity_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while(!cur.isAfterLast())
        {
            d = new Identity_DataModel();
            d._AgeGroup = cur.getString(cur.getColumnIndex("AgeGroup"));
            d._Result = cur.getString(cur.getColumnIndex("Result"));
            d._OthResult = cur.getString(cur.getColumnIndex("OthResult"));
            d._H01 = cur.getString(cur.getColumnIndex("H01"));
            d._H02 = cur.getString(cur.getColumnIndex("H02"));
            d._H03 = cur.getString(cur.getColumnIndex("H03"));
            d._H04 = cur.getString(cur.getColumnIndex("H04"));
            d._H05 = cur.getString(cur.getColumnIndex("H05"));
            d._H06 = cur.getString(cur.getColumnIndex("H06"));
            d._H07 = cur.getString(cur.getColumnIndex("H07"));
            d._H07a = cur.getString(cur.getColumnIndex("H07a"));
            d._Dist = cur.getString(cur.getColumnIndex("Dist"));
            d._Upz = cur.getString(cur.getColumnIndex("Upz"));
            d._Un = cur.getString(cur.getColumnIndex("Un"));
            d._Vill = cur.getString(cur.getColumnIndex("Vill"));
            d._H11 = cur.getString(cur.getColumnIndex("H11"));
            d._H12 = cur.getString(cur.getColumnIndex("H12"));
            d._H12x = cur.getString(cur.getColumnIndex("H12x"));
            d._ShuchonaID = cur.getString(cur.getColumnIndex("ShuchonaID"));
            d._H14 = cur.getString(cur.getColumnIndex("H14"));
            d._H15 = cur.getString(cur.getColumnIndex("H15"));
            d._H17 = cur.getString(cur.getColumnIndex("H17"));
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}