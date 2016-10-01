package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;
public class Cost1_DataModel{

    String TableName = "Cost1";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _MSlNo = "";
    private String _H81 = "";
    private String _H811a = "";
    private String _H811b = "";
    private String _H811c = "";
    private String _H811d = "";
    private String _H812a = "";
    private String _H812b = "";
    private String _H812c = "";
    private String _H812d = "";
    private String _H813a = "";
    private String _H813b = "";
    private String _H813c = "";
    private String _H813d = "";
    private String _H814a = "";
    private String _H814b = "";
    private String _H814c = "";
    private String _H814d = "";
    private String _H815a = "";
    private String _H815b = "";
    private String _H815c = "";
    private String _H815d = "";
    private String _H816a = "";
    private String _H816b = "";
    private String _H816c = "";
    private String _H816d = "";
    private String _H821a = "";
    private String _H821b = "";
    private String _H821c = "";
    private String _H821d = "";
    private String _H83 = "";
    private String _H831a = "";
    private String _H831b = "";
    private String _H831c = "";
    private String _H831d = "";
    private String _H832a = "";
    private String _H832b = "";
    private String _H832c = "";
    private String _H832d = "";
    private String _H84 = "";
    private String _H841a = "";
    private String _H841b = "";
    private String _H841c = "";
    private String _H841d = "";
    private String _H842a = "";
    private String _H842b = "";
    private String _H842c = "";
    private String _H842d = "";
    private String _H851a = "";
    private String _H851b = "";
    private String _H851c = "";
    private String _H851d = "";
    private String _H86 = "";
    private String _H861a = "";
    private String _H861b = "";
    private String _H861c = "";
    private String _H861d = "";
    private String _H862a = "";
    private String _H862b = "";
    private String _H862c = "";
    private String _H862d = "";
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

    public String getSuchanaID(){
        return _SuchanaID;
    }

    public void setSuchanaID(String newValue){
        _SuchanaID = newValue;
    }

    public String getMSlNo(){
        return _MSlNo;
    }

    public void setMSlNo(String newValue){
        _MSlNo = newValue;
    }

    public String getH81() {
        return _H81;
    }

    public void setH81(String newValue) {
        _H81 = newValue;
    }

    public String getH811a(){
        return _H811a;
    }

    public void setH811a(String newValue){
        _H811a = newValue;
    }

    public String getH811b(){
        return _H811b;
    }

    public void setH811b(String newValue){
        _H811b = newValue;
    }

    public String getH811c(){
        return _H811c;
    }

    public void setH811c(String newValue){
        _H811c = newValue;
    }

    public String getH811d(){
        return _H811d;
    }

    public void setH811d(String newValue){
        _H811d = newValue;
    }

    public String getH812a(){
        return _H812a;
    }

    public void setH812a(String newValue){
        _H812a = newValue;
    }

    public String getH812b(){
        return _H812b;
    }

    public void setH812b(String newValue){
        _H812b = newValue;
    }

    public String getH812c(){
        return _H812c;
    }

    public void setH812c(String newValue){
        _H812c = newValue;
    }

    public String getH812d(){
        return _H812d;
    }

    public void setH812d(String newValue){
        _H812d = newValue;
    }

    public String getH813a(){
        return _H813a;
    }

    public void setH813a(String newValue){
        _H813a = newValue;
    }

    public String getH813b(){
        return _H813b;
    }

    public void setH813b(String newValue){
        _H813b = newValue;
    }

    public String getH813c(){
        return _H813c;
    }

    public void setH813c(String newValue){
        _H813c = newValue;
    }

    public String getH813d(){
        return _H813d;
    }

    public void setH813d(String newValue){
        _H813d = newValue;
    }

    public String getH814a(){
        return _H814a;
    }

    public void setH814a(String newValue){
        _H814a = newValue;
    }

    public String getH814b(){
        return _H814b;
    }

    public void setH814b(String newValue){
        _H814b = newValue;
    }

    public String getH814c(){
        return _H814c;
    }

    public void setH814c(String newValue){
        _H814c = newValue;
    }

    public String getH814d(){
        return _H814d;
    }

    public void setH814d(String newValue){
        _H814d = newValue;
    }

    public String getH815a(){
        return _H815a;
    }

    public void setH815a(String newValue){
        _H815a = newValue;
    }

    public String getH815b(){
        return _H815b;
    }

    public void setH815b(String newValue){
        _H815b = newValue;
    }

    public String getH815c(){
        return _H815c;
    }

    public void setH815c(String newValue){
        _H815c = newValue;
    }

    public String getH815d(){
        return _H815d;
    }

    public void setH815d(String newValue){
        _H815d = newValue;
    }

    public String getH816a(){
        return _H816a;
    }

    public void setH816a(String newValue){
        _H816a = newValue;
    }

    public String getH816b(){
        return _H816b;
    }

    public void setH816b(String newValue){
        _H816b = newValue;
    }

    public String getH816c(){
        return _H816c;
    }

    public void setH816c(String newValue){
        _H816c = newValue;
    }

    public String getH816d(){
        return _H816d;
    }

    public void setH816d(String newValue){
        _H816d = newValue;
    }

    public String getH821a(){
        return _H821a;
    }

    public void setH821a(String newValue){
        _H821a = newValue;
    }

    public String getH821b(){
        return _H821b;
    }

    public void setH821b(String newValue){
        _H821b = newValue;
    }

    public String getH821c(){
        return _H821c;
    }

    public void setH821c(String newValue){
        _H821c = newValue;
    }

    public String getH821d(){
        return _H821d;
    }

    public void setH821d(String newValue){
        _H821d = newValue;
    }

    public String getH83() {
        return _H83;
    }

    public void setH83(String newValue) {
        _H83 = newValue;
    }

    public String getH831a(){
        return _H831a;
    }

    public void setH831a(String newValue){
        _H831a = newValue;
    }

    public String getH831b(){
        return _H831b;
    }

    public void setH831b(String newValue){
        _H831b = newValue;
    }

    public String getH831c(){
        return _H831c;
    }

    public void setH831c(String newValue){
        _H831c = newValue;
    }

    public String getH831d(){
        return _H831d;
    }

    public void setH831d(String newValue){
        _H831d = newValue;
    }

    public String getH832a(){
        return _H832a;
    }

    public void setH832a(String newValue){
        _H832a = newValue;
    }

    public String getH832b(){
        return _H832b;
    }

    public void setH832b(String newValue){
        _H832b = newValue;
    }

    public String getH832c(){
        return _H832c;
    }

    public void setH832c(String newValue){
        _H832c = newValue;
    }

    public String getH832d(){
        return _H832d;
    }

    public void setH832d(String newValue){
        _H832d = newValue;
    }

    public String getH84() {
        return _H84;
    }

    public void setH84(String newValue) {
        _H84 = newValue;
    }

    public String getH841a(){
        return _H841a;
    }

    public void setH841a(String newValue){
        _H841a = newValue;
    }

    public String getH841b(){
        return _H841b;
    }

    public void setH841b(String newValue){
        _H841b = newValue;
    }

    public String getH841c(){
        return _H841c;
    }

    public void setH841c(String newValue){
        _H841c = newValue;
    }

    public String getH841d(){
        return _H841d;
    }

    public void setH841d(String newValue){
        _H841d = newValue;
    }

    public String getH842a(){
        return _H842a;
    }

    public void setH842a(String newValue){
        _H842a = newValue;
    }

    public String getH842b(){
        return _H842b;
    }

    public void setH842b(String newValue){
        _H842b = newValue;
    }

    public String getH842c(){
        return _H842c;
    }

    public void setH842c(String newValue){
        _H842c = newValue;
    }

    public String getH842d(){
        return _H842d;
    }

    public void setH842d(String newValue){
        _H842d = newValue;
    }

    public String getH851a(){
        return _H851a;
    }

    public void setH851a(String newValue){
        _H851a = newValue;
    }

    public String getH851b(){
        return _H851b;
    }

    public void setH851b(String newValue){
        _H851b = newValue;
    }

    public String getH851c(){
        return _H851c;
    }

    public void setH851c(String newValue){
        _H851c = newValue;
    }

    public String getH851d(){
        return _H851d;
    }

    public void setH851d(String newValue){
        _H851d = newValue;
    }

    public String getH86() {
        return _H86;
    }

    public void setH86(String newValue) {
        _H86 = newValue;
    }

    public String getH861a(){
        return _H861a;
    }

    public void setH861a(String newValue){
        _H861a = newValue;
    }

    public String getH861b(){
        return _H861b;
    }

    public void setH861b(String newValue){
        _H861b = newValue;
    }

    public String getH861c(){
        return _H861c;
    }

    public void setH861c(String newValue){
        _H861c = newValue;
    }

    public String getH861d(){
        return _H861d;
    }

    public void setH861d(String newValue){
        _H861d = newValue;
    }

    public String getH862a(){
        return _H862a;
    }

    public void setH862a(String newValue){
        _H862a = newValue;
    }

    public String getH862b(){
        return _H862b;
    }

    public void setH862b(String newValue){
        _H862b = newValue;
    }

    public String getH862c(){
        return _H862c;
    }

    public void setH862c(String newValue){
        _H862c = newValue;
    }

    public String getH862d(){
        return _H862d;
    }

    public void setH862d(String newValue){
        _H862d = newValue;
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
            if(C.Existence("Select * from "+ TableName +"  Where Rnd='"+ _Rnd +"' and SuchanaID='"+ _SuchanaID +"' "))
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,MSlNo,H81,H811a,H811b,H811c,H811d,H812a,H812b,H812c,H812d,H813a,H813b,H813c,H813d,H814a,H814b,H814c,H814d,H815a,H815b,H815c,H815d,H816a,H816b,H816c,H816d,H821a,H821b,H821c,H821d,H83,H831a,H831b,H831c,H831d,H832a,H832b,H832c,H832d,H84,H841a,H841b,H841c,H841d,H842a,H842b,H842c,H842d,H851a,H851b,H851c,H851d,H86,H861a,H861b,H861c,H861d,H862a,H862b,H862c,H862d,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _MSlNo + "', '" + _H81 + "', '" + _H811a + "', '" + _H811b + "', '" + _H811c + "', '" + _H811d + "', '" + _H812a + "', '" + _H812b + "', '" + _H812c + "', '" + _H812d + "', '" + _H813a + "', '" + _H813b + "', '" + _H813c + "', '" + _H813d + "', '" + _H814a + "', '" + _H814b + "', '" + _H814c + "', '" + _H814d + "', '" + _H815a + "', '" + _H815b + "', '" + _H815c + "', '" + _H815d + "', '" + _H816a + "', '" + _H816b + "', '" + _H816c + "', '" + _H816d + "', '" + _H821a + "', '" + _H821b + "', '" + _H821c + "', '" + _H821d + "', '" + _H83 + "', '" + _H831a + "', '" + _H831b + "', '" + _H831c + "', '" + _H831d + "', '" + _H832a + "', '" + _H832b + "', '" + _H832c + "', '" + _H832d + "', '" + _H84 + "', '" + _H841a + "', '" + _H841b + "', '" + _H841c + "', '" + _H841d + "', '" + _H842a + "', '" + _H842b + "', '" + _H842c + "', '" + _H842d + "', '" + _H851a + "', '" + _H851b + "', '" + _H851c + "', '" + _H851d + "', '" + _H86 + "', '" + _H861a + "', '" + _H861b + "', '" + _H861c + "', '" + _H861d + "', '" + _H862a + "', '" + _H862b + "', '" + _H862c + "', '" + _H862d + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',MSlNo = '" + _MSlNo + "',H81 = '" + _H81 + "',H811a = '" + _H811a + "',H811b = '" + _H811b + "',H811c = '" + _H811c + "',H811d = '" + _H811d + "',H812a = '" + _H812a + "',H812b = '" + _H812b + "',H812c = '" + _H812c + "',H812d = '" + _H812d + "',H813a = '" + _H813a + "',H813b = '" + _H813b + "',H813c = '" + _H813c + "',H813d = '" + _H813d + "',H814a = '" + _H814a + "',H814b = '" + _H814b + "',H814c = '" + _H814c + "',H814d = '" + _H814d + "',H815a = '" + _H815a + "',H815b = '" + _H815b + "',H815c = '" + _H815c + "',H815d = '" + _H815d + "',H816a = '" + _H816a + "',H816b = '" + _H816b + "',H816c = '" + _H816c + "',H816d = '" + _H816d + "',H821a = '" + _H821a + "',H821b = '" + _H821b + "',H821c = '" + _H821c + "',H821d = '" + _H821d + "',H83 = '" + _H83 + "',H831a = '" + _H831a + "',H831b = '" + _H831b + "',H831c = '" + _H831c + "',H831d = '" + _H831d + "',H832a = '" + _H832a + "',H832b = '" + _H832b + "',H832c = '" + _H832c + "',H832d = '" + _H832d + "',H84 = '" + _H84 + "',H841a = '" + _H841a + "',H841b = '" + _H841b + "',H841c = '" + _H841c + "',H841d = '" + _H841d + "',H842a = '" + _H842a + "',H842b = '" + _H842b + "',H842c = '" + _H842c + "',H842d = '" + _H842d + "',H851a = '" + _H851a + "',H851b = '" + _H851b + "',H851c = '" + _H851c + "',H851d = '" + _H851d + "',H86 = '" + _H86 + "',H861a = '" + _H861a + "',H861b = '" + _H861b + "',H861c = '" + _H861c + "',H861d = '" + _H861d + "',H862a = '" + _H862a + "',H862b = '" + _H862b + "',H862c = '" + _H862c + "',H862d = '" + _H862d + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
            C.Save(SQL);
        }
        catch(Exception  e)
        {
            response = e.getMessage();
        }
        return response;
    }


    public List<Cost1_DataModel> SelectAll(Context context, String SQL)
    {
        Connection C = new Connection(context);
        List<Cost1_DataModel> data = new ArrayList<Cost1_DataModel>();
        Cost1_DataModel d = new Cost1_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while(!cur.isAfterLast())
        {
            d = new Cost1_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._MSlNo = cur.getString(cur.getColumnIndex("MSlNo"));
            d._H81 = cur.getString(cur.getColumnIndex("H81"));
            d._H811a = cur.getString(cur.getColumnIndex("H811a"));
            d._H811b = cur.getString(cur.getColumnIndex("H811b"));
            d._H811c = cur.getString(cur.getColumnIndex("H811c"));
            d._H811d = cur.getString(cur.getColumnIndex("H811d"));
            d._H812a = cur.getString(cur.getColumnIndex("H812a"));
            d._H812b = cur.getString(cur.getColumnIndex("H812b"));
            d._H812c = cur.getString(cur.getColumnIndex("H812c"));
            d._H812d = cur.getString(cur.getColumnIndex("H812d"));
            d._H813a = cur.getString(cur.getColumnIndex("H813a"));
            d._H813b = cur.getString(cur.getColumnIndex("H813b"));
            d._H813c = cur.getString(cur.getColumnIndex("H813c"));
            d._H813d = cur.getString(cur.getColumnIndex("H813d"));
            d._H814a = cur.getString(cur.getColumnIndex("H814a"));
            d._H814b = cur.getString(cur.getColumnIndex("H814b"));
            d._H814c = cur.getString(cur.getColumnIndex("H814c"));
            d._H814d = cur.getString(cur.getColumnIndex("H814d"));
            d._H815a = cur.getString(cur.getColumnIndex("H815a"));
            d._H815b = cur.getString(cur.getColumnIndex("H815b"));
            d._H815c = cur.getString(cur.getColumnIndex("H815c"));
            d._H815d = cur.getString(cur.getColumnIndex("H815d"));
            d._H816a = cur.getString(cur.getColumnIndex("H816a"));
            d._H816b = cur.getString(cur.getColumnIndex("H816b"));
            d._H816c = cur.getString(cur.getColumnIndex("H816c"));
            d._H816d = cur.getString(cur.getColumnIndex("H816d"));
            d._H821a = cur.getString(cur.getColumnIndex("H821a"));
            d._H821b = cur.getString(cur.getColumnIndex("H821b"));
            d._H821c = cur.getString(cur.getColumnIndex("H821c"));
            d._H821d = cur.getString(cur.getColumnIndex("H821d"));
            d._H83 = cur.getString(cur.getColumnIndex("H83"));
            d._H831a = cur.getString(cur.getColumnIndex("H831a"));
            d._H831b = cur.getString(cur.getColumnIndex("H831b"));
            d._H831c = cur.getString(cur.getColumnIndex("H831c"));
            d._H831d = cur.getString(cur.getColumnIndex("H831d"));
            d._H832a = cur.getString(cur.getColumnIndex("H832a"));
            d._H832b = cur.getString(cur.getColumnIndex("H832b"));
            d._H832c = cur.getString(cur.getColumnIndex("H832c"));
            d._H832d = cur.getString(cur.getColumnIndex("H832d"));
            d._H84 = cur.getString(cur.getColumnIndex("H84"));
            d._H841a = cur.getString(cur.getColumnIndex("H841a"));
            d._H841b = cur.getString(cur.getColumnIndex("H841b"));
            d._H841c = cur.getString(cur.getColumnIndex("H841c"));
            d._H841d = cur.getString(cur.getColumnIndex("H841d"));
            d._H842a = cur.getString(cur.getColumnIndex("H842a"));
            d._H842b = cur.getString(cur.getColumnIndex("H842b"));
            d._H842c = cur.getString(cur.getColumnIndex("H842c"));
            d._H842d = cur.getString(cur.getColumnIndex("H842d"));
            d._H851a = cur.getString(cur.getColumnIndex("H851a"));
            d._H851b = cur.getString(cur.getColumnIndex("H851b"));
            d._H851c = cur.getString(cur.getColumnIndex("H851c"));
            d._H851d = cur.getString(cur.getColumnIndex("H851d"));
            d._H86 = cur.getString(cur.getColumnIndex("H86"));
            d._H861a = cur.getString(cur.getColumnIndex("H861a"));
            d._H861b = cur.getString(cur.getColumnIndex("H861b"));
            d._H861c = cur.getString(cur.getColumnIndex("H861c"));
            d._H861d = cur.getString(cur.getColumnIndex("H861d"));
            d._H862a = cur.getString(cur.getColumnIndex("H862a"));
            d._H862b = cur.getString(cur.getColumnIndex("H862b"));
            d._H862c = cur.getString(cur.getColumnIndex("H862c"));
            d._H862d = cur.getString(cur.getColumnIndex("H862d"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}