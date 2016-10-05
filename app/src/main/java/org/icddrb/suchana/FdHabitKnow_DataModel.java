package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;
public class FdHabitKnow_DataModel{

    String TableName = "FdHabitKnow";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _M231 = "";
    private String _M231x1 = "";
    private String _M232a = "";
    private String _M232b = "";
    private String _M232c = "";
    private String _M233 = "";
    private String _M234 = "";
    private String _M235 = "";
    private String _M236a = "";
    private String _M236b = "";
    private String _M236c = "";
    private String _M236d = "";
    private String _M236e = "";
    private String _M236f = "";
    private String _M236g = "";
    private String _M236h = "";
    private String _M236i = "";
    private String _M236j = "";
    private String _M237a = "";
    private String _M237b = "";
    private String _M237c = "";
    private String _M237d = "";
    private String _M237e = "";
    private String _M237x = "";
    private String _M237x1 = "";
    private String _M238 = "";
    private String _M239a = "";
    private String _M239b = "";
    private String _M239c = "";
    private String _M239d = "";
    private String _M239e = "";
    private String _M239f = "";
    private String _M239g = "";
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

    public String getSuchanaID() {
        return _SuchanaID;
    }

    public void setSuchanaID(String newValue) {
        _SuchanaID = newValue;
    }

    public String getM231(){
        return _M231;
    }

    public void setM231(String newValue){
        _M231 = newValue;
    }

    public String getM231x1(){
        return _M231x1;
    }

    public void setM231x1(String newValue){
        _M231x1 = newValue;
    }

    public String getM232a(){
        return _M232a;
    }

    public void setM232a(String newValue){
        _M232a = newValue;
    }

    public String getM232b(){
        return _M232b;
    }

    public void setM232b(String newValue){
        _M232b = newValue;
    }

    public String getM232c(){
        return _M232c;
    }

    public void setM232c(String newValue){
        _M232c = newValue;
    }

    public String getM233(){
        return _M233;
    }

    public void setM233(String newValue){
        _M233 = newValue;
    }

    public String getM234(){
        return _M234;
    }

    public void setM234(String newValue){
        _M234 = newValue;
    }

    public String getM235(){
        return _M235;
    }

    public void setM235(String newValue){
        _M235 = newValue;
    }

    public String getM236a(){
        return _M236a;
    }

    public void setM236a(String newValue){
        _M236a = newValue;
    }

    public String getM236b(){
        return _M236b;
    }

    public void setM236b(String newValue){
        _M236b = newValue;
    }

    public String getM236c(){
        return _M236c;
    }

    public void setM236c(String newValue){
        _M236c = newValue;
    }

    public String getM236d(){
        return _M236d;
    }

    public void setM236d(String newValue){
        _M236d = newValue;
    }

    public String getM236e(){
        return _M236e;
    }

    public void setM236e(String newValue){
        _M236e = newValue;
    }

    public String getM236f(){
        return _M236f;
    }

    public void setM236f(String newValue){
        _M236f = newValue;
    }

    public String getM236g(){
        return _M236g;
    }

    public void setM236g(String newValue){
        _M236g = newValue;
    }

    public String getM236h(){
        return _M236h;
    }

    public void setM236h(String newValue){
        _M236h = newValue;
    }

    public String getM236i(){
        return _M236i;
    }

    public void setM236i(String newValue){
        _M236i = newValue;
    }

    public String getM236j(){
        return _M236j;
    }

    public void setM236j(String newValue){
        _M236j = newValue;
    }

    public String getM237a(){
        return _M237a;
    }

    public void setM237a(String newValue){
        _M237a = newValue;
    }

    public String getM237b(){
        return _M237b;
    }

    public void setM237b(String newValue){
        _M237b = newValue;
    }

    public String getM237c(){
        return _M237c;
    }

    public void setM237c(String newValue){
        _M237c = newValue;
    }

    public String getM237d(){
        return _M237d;
    }

    public void setM237d(String newValue){
        _M237d = newValue;
    }

    public String getM237e(){
        return _M237e;
    }

    public void setM237e(String newValue){
        _M237e = newValue;
    }

    public String getM237x(){
        return _M237x;
    }

    public void setM237x(String newValue){
        _M237x = newValue;
    }

    public String getM237x1(){
        return _M237x1;
    }

    public void setM237x1(String newValue){
        _M237x1 = newValue;
    }

    public String getM238(){
        return _M238;
    }

    public void setM238(String newValue){
        _M238 = newValue;
    }

    public String getM239a(){
        return _M239a;
    }

    public void setM239a(String newValue){
        _M239a = newValue;
    }

    public String getM239b(){
        return _M239b;
    }

    public void setM239b(String newValue){
        _M239b = newValue;
    }

    public String getM239c(){
        return _M239c;
    }

    public void setM239c(String newValue){
        _M239c = newValue;
    }

    public String getM239d(){
        return _M239d;
    }

    public void setM239d(String newValue){
        _M239d = newValue;
    }

    public String getM239e(){
        return _M239e;
    }

    public void setM239e(String newValue){
        _M239e = newValue;
    }

    public String getM239f(){
        return _M239f;
    }

    public void setM239f(String newValue){
        _M239f = newValue;
    }

    public String getM239g(){
        return _M239g;
    }

    public void setM239g(String newValue){
        _M239g = newValue;
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

    public String SaveUpdateData(Context context)
    {
        String response = "";
        C = new Connection(context);
        String SQL = "";
        try
        {
            if (C.Existence("Select * from " + TableName + "  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "' "))
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,M231,M231x1,M232a,M232b,M232c,M233,M234,M235,M236a,M236b,M236c,M236d,M236e,M236f,M236g,M236h,M236i,M236j,M237a,M237b,M237c,M237d,M237e,M237x,M237x1,M238,M239a,M239b,M239c,M239d,M239e,M239f,M239g,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _M231 + "', '" + _M231x1 + "', '" + _M232a + "', '" + _M232b + "', '" + _M232c + "', '" + _M233 + "', '" + _M234 + "', '" + _M235 + "', '" + _M236a + "', '" + _M236b + "', '" + _M236c + "', '" + _M236d + "', '" + _M236e + "', '" + _M236f + "', '" + _M236g + "', '" + _M236h + "', '" + _M236i + "', '" + _M236j + "', '" + _M237a + "', '" + _M237b + "', '" + _M237c + "', '" + _M237d + "', '" + _M237e + "', '" + _M237x + "', '" + _M237x1 + "', '" + _M238 + "', '" + _M239a + "', '" + _M239b + "', '" + _M239c + "', '" + _M239d + "', '" + _M239e + "', '" + _M239f + "', '" + _M239g + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',M231 = '" + _M231 + "',M231x1 = '" + _M231x1 + "',M232a = '" + _M232a + "',M232b = '" + _M232b + "',M232c = '" + _M232c + "',M233 = '" + _M233 + "',M234 = '" + _M234 + "',M235 = '" + _M235 + "',M236a = '" + _M236a + "',M236b = '" + _M236b + "',M236c = '" + _M236c + "',M236d = '" + _M236d + "',M236e = '" + _M236e + "',M236f = '" + _M236f + "',M236g = '" + _M236g + "',M236h = '" + _M236h + "',M236i = '" + _M236i + "',M236j = '" + _M236j + "',M237a = '" + _M237a + "',M237b = '" + _M237b + "',M237c = '" + _M237c + "',M237d = '" + _M237d + "',M237e = '" + _M237e + "',M237x = '" + _M237x + "',M237x1 = '" + _M237x1 + "',M238 = '" + _M238 + "',M239a = '" + _M239a + "',M239b = '" + _M239b + "',M239c = '" + _M239c + "',M239d = '" + _M239d + "',M239e = '" + _M239e + "',M239f = '" + _M239f + "',M239g = '" + _M239g + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
            C.Save(SQL);
        }
        catch(Exception  e)
        {
            response = e.getMessage();
        }
        return response;
    }


    public List<FdHabitKnow_DataModel> SelectAll(Context context, String SQL)
    {
        Connection C = new Connection(context);
        List<FdHabitKnow_DataModel> data = new ArrayList<FdHabitKnow_DataModel>();
        FdHabitKnow_DataModel d = new FdHabitKnow_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while(!cur.isAfterLast())
        {
            d = new FdHabitKnow_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._M231 = cur.getString(cur.getColumnIndex("M231"));
            d._M231x1 = cur.getString(cur.getColumnIndex("M231x1"));
            d._M232a = cur.getString(cur.getColumnIndex("M232a"));
            d._M232b = cur.getString(cur.getColumnIndex("M232b"));
            d._M232c = cur.getString(cur.getColumnIndex("M232c"));
            d._M233 = cur.getString(cur.getColumnIndex("M233"));
            d._M234 = cur.getString(cur.getColumnIndex("M234"));
            d._M235 = cur.getString(cur.getColumnIndex("M235"));
            d._M236a = cur.getString(cur.getColumnIndex("M236a"));
            d._M236b = cur.getString(cur.getColumnIndex("M236b"));
            d._M236c = cur.getString(cur.getColumnIndex("M236c"));
            d._M236d = cur.getString(cur.getColumnIndex("M236d"));
            d._M236e = cur.getString(cur.getColumnIndex("M236e"));
            d._M236f = cur.getString(cur.getColumnIndex("M236f"));
            d._M236g = cur.getString(cur.getColumnIndex("M236g"));
            d._M236h = cur.getString(cur.getColumnIndex("M236h"));
            d._M236i = cur.getString(cur.getColumnIndex("M236i"));
            d._M236j = cur.getString(cur.getColumnIndex("M236j"));
            d._M237a = cur.getString(cur.getColumnIndex("M237a"));
            d._M237b = cur.getString(cur.getColumnIndex("M237b"));
            d._M237c = cur.getString(cur.getColumnIndex("M237c"));
            d._M237d = cur.getString(cur.getColumnIndex("M237d"));
            d._M237e = cur.getString(cur.getColumnIndex("M237e"));
            d._M237x = cur.getString(cur.getColumnIndex("M237x"));
            d._M237x1 = cur.getString(cur.getColumnIndex("M237x1"));
            d._M238 = cur.getString(cur.getColumnIndex("M238"));
            d._M239a = cur.getString(cur.getColumnIndex("M239a"));
            d._M239b = cur.getString(cur.getColumnIndex("M239b"));
            d._M239c = cur.getString(cur.getColumnIndex("M239c"));
            d._M239d = cur.getString(cur.getColumnIndex("M239d"));
            d._M239e = cur.getString(cur.getColumnIndex("M239e"));
            d._M239f = cur.getString(cur.getColumnIndex("M239f"));
            d._M239g = cur.getString(cur.getColumnIndex("M239g"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}