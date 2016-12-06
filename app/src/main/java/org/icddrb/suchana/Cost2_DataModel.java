package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;
public class Cost2_DataModel{

    String TableName = "Cost";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _MSlNo = "";
    private String _H87 = "";
    private String _H871a = "";
    private String _H871b = "";
    private String _H871c = "";
    private String _H871d = "";
    private String _H872a = "";
    private String _H872b = "";
    private String _H872c = "";
    private String _H872d = "";
    private String _H873a = "";
    private String _H873b = "";
    private String _H873c = "";
    private String _H873d = "";
    private String _H874a = "";
    private String _H874b = "";
    private String _H874c = "";
    private String _H874d = "";
    private String _H875a = "";
    private String _H875b = "";
    private String _H875c = "";
    private String _H875d = "";
    private String _H88 = "";
    private String _H881a = "";
    private String _H881b = "";
    private String _H881c = "";
    private String _H881d = "";
    private String _H882a = "";
    private String _H882b = "";
    private String _H882c = "";
    private String _H882d = "";
    private String _H883a = "";
    private String _H883b = "";
    private String _H883c = "";
    private String _H883d = "";
    private String _H884a = "";
    private String _H884b = "";
    private String _H884c = "";
    private String _H884d = "";
    private String _H885a = "";
    private String _H885b = "";
    private String _H885c = "";
    private String _H885d = "";
    private String _H891a = "";
    private String _H891b = "";
    private String _H891c = "";
    private String _H891d = "";
    private String _H810 = "";
    private String _H8101a = "";
    private String _H8101b = "";
    private String _H8101c = "";
    private String _H8101d = "";
    private String _H8102a = "";
    private String _H8102b = "";
    private String _H8102c = "";
    private String _H8102d = "";
    private String _H8103a = "";
    private String _H8103b = "";
    private String _H8103c = "";
    private String _H8103d = "";
    private String _H8111a = "";
    private String _H8111b = "";
    private String _H8111c = "";
    private String _H8111d = "";
    private String _H8121a = "";
    private String _H8121x1 = "";
    private String _H8121b = "";
    private String _H8121c = "";
    private String _H8121d = "";
    private String _H8122a = "";
    private String _H8122x1 = "";
    private String _H8122b = "";
    private String _H8122c = "";
    private String _H8122d = "";
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

    public String getH87() {
        return _H87;
    }

    public void setH87(String newValue) {
        _H87 = newValue;
    }

    public String getH871a(){
        return _H871a;
    }

    public void setH871a(String newValue){
        _H871a = newValue;
    }

    public String getH871b(){
        return _H871b;
    }

    public void setH871b(String newValue){
        _H871b = newValue;
    }

    public String getH871c(){
        return _H871c;
    }

    public void setH871c(String newValue){
        _H871c = newValue;
    }

    public String getH871d(){
        return _H871d;
    }

    public void setH871d(String newValue){
        _H871d = newValue;
    }

    public String getH872a(){
        return _H872a;
    }

    public void setH872a(String newValue){
        _H872a = newValue;
    }

    public String getH872b(){
        return _H872b;
    }

    public void setH872b(String newValue){
        _H872b = newValue;
    }

    public String getH872c(){
        return _H872c;
    }

    public void setH872c(String newValue){
        _H872c = newValue;
    }

    public String getH872d(){
        return _H872d;
    }

    public void setH872d(String newValue){
        _H872d = newValue;
    }

    public String getH873a(){
        return _H873a;
    }

    public void setH873a(String newValue){
        _H873a = newValue;
    }

    public String getH873b(){
        return _H873b;
    }

    public void setH873b(String newValue){
        _H873b = newValue;
    }

    public String getH873c(){
        return _H873c;
    }

    public void setH873c(String newValue){
        _H873c = newValue;
    }

    public String getH873d(){
        return _H873d;
    }

    public void setH873d(String newValue){
        _H873d = newValue;
    }

    public String getH874a(){
        return _H874a;
    }

    public void setH874a(String newValue){
        _H874a = newValue;
    }

    public String getH874b(){
        return _H874b;
    }

    public void setH874b(String newValue){
        _H874b = newValue;
    }

    public String getH874c(){
        return _H874c;
    }

    public void setH874c(String newValue){
        _H874c = newValue;
    }

    public String getH874d(){
        return _H874d;
    }

    public void setH874d(String newValue){
        _H874d = newValue;
    }

    public String getH875a(){
        return _H875a;
    }

    public void setH875a(String newValue){
        _H875a = newValue;
    }

    public String getH875b(){
        return _H875b;
    }

    public void setH875b(String newValue){
        _H875b = newValue;
    }

    public String getH875c(){
        return _H875c;
    }

    public void setH875c(String newValue){
        _H875c = newValue;
    }

    public String getH875d(){
        return _H875d;
    }

    public void setH875d(String newValue){
        _H875d = newValue;
    }

    public String getH88() {
        return _H88;
    }

    public void setH88(String newValue) {
        _H88 = newValue;
    }

    public String getH881a(){
        return _H881a;
    }

    public void setH881a(String newValue){
        _H881a = newValue;
    }

    public String getH881b(){
        return _H881b;
    }

    public void setH881b(String newValue){
        _H881b = newValue;
    }

    public String getH881c(){
        return _H881c;
    }

    public void setH881c(String newValue){
        _H881c = newValue;
    }

    public String getH881d(){
        return _H881d;
    }

    public void setH881d(String newValue){
        _H881d = newValue;
    }

    public String getH882a(){
        return _H882a;
    }

    public void setH882a(String newValue){
        _H882a = newValue;
    }

    public String getH882b(){
        return _H882b;
    }

    public void setH882b(String newValue){
        _H882b = newValue;
    }

    public String getH882c(){
        return _H882c;
    }

    public void setH882c(String newValue){
        _H882c = newValue;
    }

    public String getH882d(){
        return _H882d;
    }

    public void setH882d(String newValue){
        _H882d = newValue;
    }

    public String getH883a(){
        return _H883a;
    }

    public void setH883a(String newValue){
        _H883a = newValue;
    }

    public String getH883b(){
        return _H883b;
    }

    public void setH883b(String newValue){
        _H883b = newValue;
    }

    public String getH883c(){
        return _H883c;
    }

    public void setH883c(String newValue){
        _H883c = newValue;
    }

    public String getH883d(){
        return _H883d;
    }

    public void setH883d(String newValue){
        _H883d = newValue;
    }

    public String getH884a(){
        return _H884a;
    }

    public void setH884a(String newValue){
        _H884a = newValue;
    }

    public String getH884b(){
        return _H884b;
    }

    public void setH884b(String newValue){
        _H884b = newValue;
    }

    public String getH884c(){
        return _H884c;
    }

    public void setH884c(String newValue){
        _H884c = newValue;
    }

    public String getH884d(){
        return _H884d;
    }

    public void setH884d(String newValue){
        _H884d = newValue;
    }

    public String getH885a(){
        return _H885a;
    }

    public void setH885a(String newValue){
        _H885a = newValue;
    }

    public String getH885b(){
        return _H885b;
    }

    public void setH885b(String newValue){
        _H885b = newValue;
    }

    public String getH885c(){
        return _H885c;
    }

    public void setH885c(String newValue){
        _H885c = newValue;
    }

    public String getH885d(){
        return _H885d;
    }

    public void setH885d(String newValue){
        _H885d = newValue;
    }

    public String getH891a(){
        return _H891a;
    }

    public void setH891a(String newValue){
        _H891a = newValue;
    }

    public String getH891b(){
        return _H891b;
    }

    public void setH891b(String newValue){
        _H891b = newValue;
    }

    public String getH891c(){
        return _H891c;
    }

    public void setH891c(String newValue){
        _H891c = newValue;
    }

    public String getH891d(){
        return _H891d;
    }

    public void setH891d(String newValue){
        _H891d = newValue;
    }

    public String getH810() {
        return _H810;
    }

    public void setH810(String newValue) {
        _H810 = newValue;
    }

    public String getH8101a(){
        return _H8101a;
    }

    public void setH8101a(String newValue){
        _H8101a = newValue;
    }

    public String getH8101b(){
        return _H8101b;
    }

    public void setH8101b(String newValue){
        _H8101b = newValue;
    }

    public String getH8101c(){
        return _H8101c;
    }

    public void setH8101c(String newValue){
        _H8101c = newValue;
    }

    public String getH8101d(){
        return _H8101d;
    }

    public void setH8101d(String newValue){
        _H8101d = newValue;
    }

    public String getH8102a(){
        return _H8102a;
    }

    public void setH8102a(String newValue){
        _H8102a = newValue;
    }

    public String getH8102b(){
        return _H8102b;
    }

    public void setH8102b(String newValue){
        _H8102b = newValue;
    }

    public String getH8102c(){
        return _H8102c;
    }

    public void setH8102c(String newValue){
        _H8102c = newValue;
    }

    public String getH8102d(){
        return _H8102d;
    }

    public void setH8102d(String newValue){
        _H8102d = newValue;
    }

    public String getH8103a(){
        return _H8103a;
    }

    public void setH8103a(String newValue){
        _H8103a = newValue;
    }

    public String getH8103b(){
        return _H8103b;
    }

    public void setH8103b(String newValue){
        _H8103b = newValue;
    }

    public String getH8103c(){
        return _H8103c;
    }

    public void setH8103c(String newValue){
        _H8103c = newValue;
    }

    public String getH8103d(){
        return _H8103d;
    }

    public void setH8103d(String newValue){
        _H8103d = newValue;
    }

    public String getH8111a() {
        return _H8111a;
    }

    public void setH8111a(String newValue) {
        _H8111a = newValue;
    }

    public String getH8111b() {
        return _H8111b;
    }

    public void setH8111b(String newValue) {
        _H8111b = newValue;
    }

    public String getH8111c() {
        return _H8111c;
    }

    public void setH8111c(String newValue) {
        _H8111c = newValue;
    }

    public String getH8111d() {
        return _H8111d;
    }

    public void setH8111d(String newValue) {
        _H8111d = newValue;
    }

    public String getH8121a() {
        return _H8121a;
    }

    public void setH8121a(String newValue) {
        _H8121a = newValue;
    }

    public String getH8121x1() {
        return _H8121x1;
    }

    public void setH8121x1(String newValue) {
        _H8121x1 = newValue;
    }

    public String getH8121b() {
        return _H8121b;
    }

    public void setH8121b(String newValue) {
        _H8121b = newValue;
    }

    public String getH8121c() {
        return _H8121c;
    }

    public void setH8121c(String newValue) {
        _H8121c = newValue;
    }

    public String getH8121d() {
        return _H8121d;
    }

    public void setH8121d(String newValue) {
        _H8121d = newValue;
    }

    public String getH8122a() {
        return _H8122a;
    }

    public void setH8122a(String newValue) {
        _H8122a = newValue;
    }

    public String getH8122x1() {
        return _H8122x1;
    }

    public void setH8122x1(String newValue) {
        _H8122x1 = newValue;
    }

    public String getH8122b() {
        return _H8122b;
    }

    public void setH8122b(String newValue) {
        _H8122b = newValue;
    }

    public String getH8122c() {
        return _H8122c;
    }

    public void setH8122c(String newValue) {
        _H8122c = newValue;
    }

    public String getH8122d() {
        return _H8122d;
    }

    public void setH8122d(String newValue) {
        _H8122d = newValue;
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,MSlNo,H87,H871a,H871b,H871c,H871d,H872a,H872b,H872c,H872d,H873a,H873b,H873c,H873d,H874a,H874b,H874c,H874d,H875a,H875b,H875c,H875d,H88,H881a,H881b,H881c,H881d,H882a,H882b,H882c,H882d,H883a,H883b,H883c,H883d,H884a,H884b,H884c,H884d,H885a,H885b,H885c,H885d,H891a,H891b,H891c,H891d,H810,H8101a,H8101b,H8101c,H8101d,H8102a,H8102b,H8102c,H8102d,H8103a,H8103b,H8103c,H8103d,H8111a,H8111b,H8111c,H8111d,H8121a,H8121x1,H8121b,H8121c,H8121d,H8122a,H8122x1,H8122b,H8122c,H8122d,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _MSlNo + "', '" + _H87 + "', '" + _H871a + "', '" + _H871b + "', '" + _H871c + "', '" + _H871d + "', '" + _H872a + "', '" + _H872b + "', '" + _H872c + "', '" + _H872d + "', '" + _H873a + "', '" + _H873b + "', '" + _H873c + "', '" + _H873d + "', '" + _H874a + "', '" + _H874b + "', '" + _H874c + "', '" + _H874d + "', '" + _H875a + "', '" + _H875b + "', '" + _H875c + "', '" + _H875d + "', '" + _H88 + "', '" + _H881a + "', '" + _H881b + "', '" + _H881c + "', '" + _H881d + "', '" + _H882a + "', '" + _H882b + "', '" + _H882c + "', '" + _H882d + "', '" + _H883a + "', '" + _H883b + "', '" + _H883c + "', '" + _H883d + "', '" + _H884a + "', '" + _H884b + "', '" + _H884c + "', '" + _H884d + "', '" + _H885a + "', '" + _H885b + "', '" + _H885c + "', '" + _H885d + "', '" + _H891a + "', '" + _H891b + "', '" + _H891c + "', '" + _H891d + "', '" + _H810 + "', '" + _H8101a + "', '" + _H8101b + "', '" + _H8101c + "', '" + _H8101d + "', '" + _H8102a + "', '" + _H8102b + "', '" + _H8102c + "', '" + _H8102d + "', '" + _H8103a + "', '" + _H8103b + "', '" + _H8103c + "', '" + _H8103d + "', '" + _H8111a + "', '" + _H8111b + "', '" + _H8111c + "', '" + _H8111d + "', '" + _H8121a + "', '" + _H8121x1 + "', '" + _H8121b + "', '" + _H8121c + "', '" + _H8121d + "', '" + _H8122a + "', '" + _H8122x1 + "', '" + _H8122b + "', '" + _H8122c + "', '" + _H8122d + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',H87 = '" + _H87 + "',H871a = '" + _H871a + "',H871b = '" + _H871b + "',H871c = '" + _H871c + "',H871d = '" + _H871d + "',H872a = '" + _H872a + "',H872b = '" + _H872b + "',H872c = '" + _H872c + "',H872d = '" + _H872d + "',H873a = '" + _H873a + "',H873b = '" + _H873b + "',H873c = '" + _H873c + "',H873d = '" + _H873d + "',H874a = '" + _H874a + "',H874b = '" + _H874b + "',H874c = '" + _H874c + "',H874d = '" + _H874d + "',H875a = '" + _H875a + "',H875b = '" + _H875b + "',H875c = '" + _H875c + "',H875d = '" + _H875d + "',H88 = '" + _H88 + "',H881a = '" + _H881a + "',H881b = '" + _H881b + "',H881c = '" + _H881c + "',H881d = '" + _H881d + "',H882a = '" + _H882a + "',H882b = '" + _H882b + "',H882c = '" + _H882c + "',H882d = '" + _H882d + "',H883a = '" + _H883a + "',H883b = '" + _H883b + "',H883c = '" + _H883c + "',H883d = '" + _H883d + "',H884a = '" + _H884a + "',H884b = '" + _H884b + "',H884c = '" + _H884c + "',H884d = '" + _H884d + "',H885a = '" + _H885a + "',H885b = '" + _H885b + "',H885c = '" + _H885c + "',H885d = '" + _H885d + "',H891a = '" + _H891a + "',H891b = '" + _H891b + "',H891c = '" + _H891c + "',H891d = '" + _H891d + "',H810 = '" + _H810 + "',H8101a = '" + _H8101a + "',H8101b = '" + _H8101b + "',H8101c = '" + _H8101c + "',H8101d = '" + _H8101d + "',H8102a = '" + _H8102a + "',H8102b = '" + _H8102b + "',H8102c = '" + _H8102c + "',H8102d = '" + _H8102d + "',H8103a = '" + _H8103a + "',H8103b = '" + _H8103b + "',H8103c = '" + _H8103c + "',H8103d = '" + _H8103d + "',H8111a = '" + _H8111a + "',H8111b = '" + _H8111b + "',H8111c = '" + _H8111c + "',H8111d = '" + _H8111d + "',H8121a = '" + _H8121a + "',H8121x1 = '" + _H8121x1 + "',H8121b = '" + _H8121b + "',H8121c = '" + _H8121c + "',H8121d = '" + _H8121d + "',H8122a = '" + _H8122a + "',H8122x1 = '" + _H8122x1 + "',H8122b = '" + _H8122b + "',H8122c = '" + _H8122c + "',H8122d = '" + _H8122d + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
            C.Save(SQL);
        }
        catch(Exception  e)
        {
            response = e.getMessage();
        }
        return response;
    }


    public List<Cost2_DataModel> SelectAll(Context context, String SQL)
    {
        Connection C = new Connection(context);
        List<Cost2_DataModel> data = new ArrayList<Cost2_DataModel>();
        Cost2_DataModel d = new Cost2_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while(!cur.isAfterLast())
        {
            d = new Cost2_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._MSlNo = cur.getString(cur.getColumnIndex("MSlNo"));
            d._H87 = cur.getString(cur.getColumnIndex("H87"));
            d._H871a = cur.getString(cur.getColumnIndex("H871a"));
            d._H871b = cur.getString(cur.getColumnIndex("H871b"));
            d._H871c = cur.getString(cur.getColumnIndex("H871c"));
            d._H871d = cur.getString(cur.getColumnIndex("H871d"));
            d._H872a = cur.getString(cur.getColumnIndex("H872a"));
            d._H872b = cur.getString(cur.getColumnIndex("H872b"));
            d._H872c = cur.getString(cur.getColumnIndex("H872c"));
            d._H872d = cur.getString(cur.getColumnIndex("H872d"));
            d._H873a = cur.getString(cur.getColumnIndex("H873a"));
            d._H873b = cur.getString(cur.getColumnIndex("H873b"));
            d._H873c = cur.getString(cur.getColumnIndex("H873c"));
            d._H873d = cur.getString(cur.getColumnIndex("H873d"));
            d._H874a = cur.getString(cur.getColumnIndex("H874a"));
            d._H874b = cur.getString(cur.getColumnIndex("H874b"));
            d._H874c = cur.getString(cur.getColumnIndex("H874c"));
            d._H874d = cur.getString(cur.getColumnIndex("H874d"));
            d._H875a = cur.getString(cur.getColumnIndex("H875a"));
            d._H875b = cur.getString(cur.getColumnIndex("H875b"));
            d._H875c = cur.getString(cur.getColumnIndex("H875c"));
            d._H875d = cur.getString(cur.getColumnIndex("H875d"));
            d._H88 = cur.getString(cur.getColumnIndex("H88"));
            d._H881a = cur.getString(cur.getColumnIndex("H881a"));
            d._H881b = cur.getString(cur.getColumnIndex("H881b"));
            d._H881c = cur.getString(cur.getColumnIndex("H881c"));
            d._H881d = cur.getString(cur.getColumnIndex("H881d"));
            d._H882a = cur.getString(cur.getColumnIndex("H882a"));
            d._H882b = cur.getString(cur.getColumnIndex("H882b"));
            d._H882c = cur.getString(cur.getColumnIndex("H882c"));
            d._H882d = cur.getString(cur.getColumnIndex("H882d"));
            d._H883a = cur.getString(cur.getColumnIndex("H883a"));
            d._H883b = cur.getString(cur.getColumnIndex("H883b"));
            d._H883c = cur.getString(cur.getColumnIndex("H883c"));
            d._H883d = cur.getString(cur.getColumnIndex("H883d"));
            d._H884a = cur.getString(cur.getColumnIndex("H884a"));
            d._H884b = cur.getString(cur.getColumnIndex("H884b"));
            d._H884c = cur.getString(cur.getColumnIndex("H884c"));
            d._H884d = cur.getString(cur.getColumnIndex("H884d"));
            d._H885a = cur.getString(cur.getColumnIndex("H885a"));
            d._H885b = cur.getString(cur.getColumnIndex("H885b"));
            d._H885c = cur.getString(cur.getColumnIndex("H885c"));
            d._H885d = cur.getString(cur.getColumnIndex("H885d"));
            d._H891a = cur.getString(cur.getColumnIndex("H891a"));
            d._H891b = cur.getString(cur.getColumnIndex("H891b"));
            d._H891c = cur.getString(cur.getColumnIndex("H891c"));
            d._H891d = cur.getString(cur.getColumnIndex("H891d"));
            d._H810 = cur.getString(cur.getColumnIndex("H810"));
            d._H8101a = cur.getString(cur.getColumnIndex("H8101a"));
            d._H8101b = cur.getString(cur.getColumnIndex("H8101b"));
            d._H8101c = cur.getString(cur.getColumnIndex("H8101c"));
            d._H8101d = cur.getString(cur.getColumnIndex("H8101d"));
            d._H8102a = cur.getString(cur.getColumnIndex("H8102a"));
            d._H8102b = cur.getString(cur.getColumnIndex("H8102b"));
            d._H8102c = cur.getString(cur.getColumnIndex("H8102c"));
            d._H8102d = cur.getString(cur.getColumnIndex("H8102d"));
            d._H8103a = cur.getString(cur.getColumnIndex("H8103a"));
            d._H8103b = cur.getString(cur.getColumnIndex("H8103b"));
            d._H8103c = cur.getString(cur.getColumnIndex("H8103c"));
            d._H8103d = cur.getString(cur.getColumnIndex("H8103d"));
            d._H8111a = cur.getString(cur.getColumnIndex("H8111a"));
            d._H8111b = cur.getString(cur.getColumnIndex("H8111b"));
            d._H8111c = cur.getString(cur.getColumnIndex("H8111c"));
            d._H8111d = cur.getString(cur.getColumnIndex("H8111d"));
            d._H8121a = cur.getString(cur.getColumnIndex("H8121a"));
            d._H8121x1 = cur.getString(cur.getColumnIndex("H8121x1"));
            d._H8121b = cur.getString(cur.getColumnIndex("H8121b"));
            d._H8121c = cur.getString(cur.getColumnIndex("H8121c"));
            d._H8121d = cur.getString(cur.getColumnIndex("H8121d"));
            d._H8122a = cur.getString(cur.getColumnIndex("H8122a"));
            d._H8122x1 = cur.getString(cur.getColumnIndex("H8122x1"));
            d._H8122b = cur.getString(cur.getColumnIndex("H8122b"));
            d._H8122c = cur.getString(cur.getColumnIndex("H8122c"));
            d._H8122d = cur.getString(cur.getColumnIndex("H8122d"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}