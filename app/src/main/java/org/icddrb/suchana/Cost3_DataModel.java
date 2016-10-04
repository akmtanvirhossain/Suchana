package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;
public class Cost3_DataModel{

    String TableName = "Cost";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _MSlNo = "";
    private String _H9a1a = "";
    private String _H9a1b = "";
    private String _H9a1c = "";
    private String _H9a2a = "";
    private String _H9a2b = "";
    private String _H9a2c = "";
    private String _H9a3a = "";
    private String _H9a3b = "";
    private String _H9a3c = "";
    private String _H9a4a = "";
    private String _H9a4b = "";
    private String _H9a4c = "";
    private String _H9a5a = "";
    private String _H9a5b = "";
    private String _H9a5c = "";
    private String _H9b1a = "";
    private String _H9b1b = "";
    private String _H9b1c = "";
    private String _H9b2a = "";
    private String _H9b2b = "";
    private String _H9b2c = "";
    private String _H9b3a = "";
    private String _H9b3b = "";
    private String _H9b3c = "";
    private String _H9b4a = "";
    private String _H9b4b = "";
    private String _H9b4c = "";
    private String _H9b5a = "";
    private String _H9b5b = "";
    private String _H9b5c = "";
    private String _H9b6a = "";
    private String _H9b6b = "";
    private String _H9b6c = "";
    private String _H9b7a = "";
    private String _H9b7b = "";
    private String _H9b7c = "";
    private String _H9b8a = "";
    private String _H9b8b = "";
    private String _H9b8c = "";
    private String _H9b9a = "";
    private String _H9b9b = "";
    private String _H9b9c = "";
    private String _H9b10a = "";
    private String _H9b10b = "";
    private String _H9b10c = "";
    private String _H9b11a = "";
    private String _H9b11b = "";
    private String _H9b11c = "";
    private String _H9b12 = "";
    private String _H9b12a1 = "";
    private String _H9b12a2 = "";
    private String _H9b12a3 = "";
    private String _H9b12b1 = "";
    private String _H9b12b2 = "";
    private String _H9b12b3 = "";
    private String _H9b12c1 = "";
    private String _H9b12c2 = "";
    private String _H9b12c3 = "";
    private String _H9b12d1 = "";
    private String _H9b12d2 = "";
    private String _H9b12d3 = "";
    private String _H9b12e1 = "";
    private String _H9b12e2 = "";
    private String _H9b12e3 = "";
    private String _H9b12f1 = "";
    private String _H9b12f2 = "";
    private String _H9b12f3 = "";
    private String _H9b12g1 = "";
    private String _H9b12g2 = "";
    private String _H9b12g3 = "";
    private String _H9b12h1 = "";
    private String _H9b12h2 = "";
    private String _H9b12h3 = "";
    private String _H9b12i1 = "";
    private String _H9b12i2 = "";
    private String _H9b12i3 = "";
    private String _H9b12j1 = "";
    private String _H9b12j2 = "";
    private String _H9b12j3 = "";
    private String _H9b12k1 = "";
    private String _H9b12k2 = "";
    private String _H9b12k3 = "";
    private String _H9b12l1 = "";
    private String _H9b12l2 = "";
    private String _H9b12l3 = "";
    private String _H9b12m1 = "";
    private String _H9b12m2 = "";
    private String _H9b12m3 = "";
    private String _H9b13a = "";
    private String _H9b13b = "";
    private String _H9b13c = "";
    private String _H9b14a = "";
    private String _H9b14x1 = "";
    private String _H9b14b = "";
    private String _H9b14c = "";
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

    public String getH9a1a(){
        return _H9a1a;
    }

    public void setH9a1a(String newValue){
        _H9a1a = newValue;
    }

    public String getH9a1b(){
        return _H9a1b;
    }

    public void setH9a1b(String newValue){
        _H9a1b = newValue;
    }

    public String getH9a1c(){
        return _H9a1c;
    }

    public void setH9a1c(String newValue){
        _H9a1c = newValue;
    }

    public String getH9a2a(){
        return _H9a2a;
    }

    public void setH9a2a(String newValue){
        _H9a2a = newValue;
    }

    public String getH9a2b(){
        return _H9a2b;
    }

    public void setH9a2b(String newValue){
        _H9a2b = newValue;
    }

    public String getH9a2c(){
        return _H9a2c;
    }

    public void setH9a2c(String newValue){
        _H9a2c = newValue;
    }

    public String getH9a3a(){
        return _H9a3a;
    }

    public void setH9a3a(String newValue){
        _H9a3a = newValue;
    }

    public String getH9a3b(){
        return _H9a3b;
    }

    public void setH9a3b(String newValue){
        _H9a3b = newValue;
    }

    public String getH9a3c(){
        return _H9a3c;
    }

    public void setH9a3c(String newValue){
        _H9a3c = newValue;
    }

    public String getH9a4a(){
        return _H9a4a;
    }

    public void setH9a4a(String newValue){
        _H9a4a = newValue;
    }

    public String getH9a4b(){
        return _H9a4b;
    }

    public void setH9a4b(String newValue){
        _H9a4b = newValue;
    }

    public String getH9a4c(){
        return _H9a4c;
    }

    public void setH9a4c(String newValue){
        _H9a4c = newValue;
    }

    public String getH9a5a(){
        return _H9a5a;
    }

    public void setH9a5a(String newValue){
        _H9a5a = newValue;
    }

    public String getH9a5b(){
        return _H9a5b;
    }

    public void setH9a5b(String newValue){
        _H9a5b = newValue;
    }

    public String getH9a5c(){
        return _H9a5c;
    }

    public void setH9a5c(String newValue){
        _H9a5c = newValue;
    }

    public String getH9b1a(){
        return _H9b1a;
    }

    public void setH9b1a(String newValue){
        _H9b1a = newValue;
    }

    public String getH9b1b(){
        return _H9b1b;
    }

    public void setH9b1b(String newValue){
        _H9b1b = newValue;
    }

    public String getH9b1c(){
        return _H9b1c;
    }

    public void setH9b1c(String newValue){
        _H9b1c = newValue;
    }

    public String getH9b2a(){
        return _H9b2a;
    }

    public void setH9b2a(String newValue){
        _H9b2a = newValue;
    }

    public String getH9b2b(){
        return _H9b2b;
    }

    public void setH9b2b(String newValue){
        _H9b2b = newValue;
    }

    public String getH9b2c(){
        return _H9b2c;
    }

    public void setH9b2c(String newValue){
        _H9b2c = newValue;
    }

    public String getH9b3a(){
        return _H9b3a;
    }

    public void setH9b3a(String newValue){
        _H9b3a = newValue;
    }

    public String getH9b3b(){
        return _H9b3b;
    }

    public void setH9b3b(String newValue){
        _H9b3b = newValue;
    }

    public String getH9b3c(){
        return _H9b3c;
    }

    public void setH9b3c(String newValue){
        _H9b3c = newValue;
    }

    public String getH9b4a(){
        return _H9b4a;
    }

    public void setH9b4a(String newValue){
        _H9b4a = newValue;
    }

    public String getH9b4b(){
        return _H9b4b;
    }

    public void setH9b4b(String newValue){
        _H9b4b = newValue;
    }

    public String getH9b4c(){
        return _H9b4c;
    }

    public void setH9b4c(String newValue){
        _H9b4c = newValue;
    }

    public String getH9b5a(){
        return _H9b5a;
    }

    public void setH9b5a(String newValue){
        _H9b5a = newValue;
    }

    public String getH9b5b(){
        return _H9b5b;
    }

    public void setH9b5b(String newValue){
        _H9b5b = newValue;
    }

    public String getH9b5c(){
        return _H9b5c;
    }

    public void setH9b5c(String newValue){
        _H9b5c = newValue;
    }

    public String getH9b6a(){
        return _H9b6a;
    }

    public void setH9b6a(String newValue){
        _H9b6a = newValue;
    }

    public String getH9b6b(){
        return _H9b6b;
    }

    public void setH9b6b(String newValue){
        _H9b6b = newValue;
    }

    public String getH9b6c(){
        return _H9b6c;
    }

    public void setH9b6c(String newValue){
        _H9b6c = newValue;
    }

    public String getH9b7a(){
        return _H9b7a;
    }

    public void setH9b7a(String newValue){
        _H9b7a = newValue;
    }

    public String getH9b7b(){
        return _H9b7b;
    }

    public void setH9b7b(String newValue){
        _H9b7b = newValue;
    }

    public String getH9b7c(){
        return _H9b7c;
    }

    public void setH9b7c(String newValue){
        _H9b7c = newValue;
    }

    public String getH9b8a(){
        return _H9b8a;
    }

    public void setH9b8a(String newValue){
        _H9b8a = newValue;
    }

    public String getH9b8b(){
        return _H9b8b;
    }

    public void setH9b8b(String newValue){
        _H9b8b = newValue;
    }

    public String getH9b8c(){
        return _H9b8c;
    }

    public void setH9b8c(String newValue){
        _H9b8c = newValue;
    }

    public String getH9b9a(){
        return _H9b9a;
    }

    public void setH9b9a(String newValue){
        _H9b9a = newValue;
    }

    public String getH9b9b(){
        return _H9b9b;
    }

    public void setH9b9b(String newValue){
        _H9b9b = newValue;
    }

    public String getH9b9c(){
        return _H9b9c;
    }

    public void setH9b9c(String newValue){
        _H9b9c = newValue;
    }

    public String getH9b10a(){
        return _H9b10a;
    }

    public void setH9b10a(String newValue){
        _H9b10a = newValue;
    }

    public String getH9b10b(){
        return _H9b10b;
    }

    public void setH9b10b(String newValue){
        _H9b10b = newValue;
    }

    public String getH9b10c(){
        return _H9b10c;
    }

    public void setH9b10c(String newValue){
        _H9b10c = newValue;
    }

    public String getH9b11a(){
        return _H9b11a;
    }

    public void setH9b11a(String newValue){
        _H9b11a = newValue;
    }

    public String getH9b11b(){
        return _H9b11b;
    }

    public void setH9b11b(String newValue){
        _H9b11b = newValue;
    }

    public String getH9b11c(){
        return _H9b11c;
    }

    public void setH9b11c(String newValue){
        _H9b11c = newValue;
    }

    public String getH9b12(){
        return _H9b12;
    }

    public void setH9b12(String newValue){
        _H9b12 = newValue;
    }

    public String getH9b12a1(){
        return _H9b12a1;
    }

    public void setH9b12a1(String newValue){
        _H9b12a1 = newValue;
    }

    public String getH9b12a2(){
        return _H9b12a2;
    }

    public void setH9b12a2(String newValue){
        _H9b12a2 = newValue;
    }

    public String getH9b12a3(){
        return _H9b12a3;
    }

    public void setH9b12a3(String newValue){
        _H9b12a3 = newValue;
    }

    public String getH9b12b1(){
        return _H9b12b1;
    }

    public void setH9b12b1(String newValue){
        _H9b12b1 = newValue;
    }

    public String getH9b12b2(){
        return _H9b12b2;
    }

    public void setH9b12b2(String newValue){
        _H9b12b2 = newValue;
    }

    public String getH9b12b3(){
        return _H9b12b3;
    }

    public void setH9b12b3(String newValue){
        _H9b12b3 = newValue;
    }

    public String getH9b12c1(){
        return _H9b12c1;
    }

    public void setH9b12c1(String newValue){
        _H9b12c1 = newValue;
    }

    public String getH9b12c2(){
        return _H9b12c2;
    }

    public void setH9b12c2(String newValue){
        _H9b12c2 = newValue;
    }

    public String getH9b12c3(){
        return _H9b12c3;
    }

    public void setH9b12c3(String newValue){
        _H9b12c3 = newValue;
    }

    public String getH9b12d1(){
        return _H9b12d1;
    }

    public void setH9b12d1(String newValue){
        _H9b12d1 = newValue;
    }

    public String getH9b12d2(){
        return _H9b12d2;
    }

    public void setH9b12d2(String newValue){
        _H9b12d2 = newValue;
    }

    public String getH9b12d3(){
        return _H9b12d3;
    }

    public void setH9b12d3(String newValue){
        _H9b12d3 = newValue;
    }

    public String getH9b12e1(){
        return _H9b12e1;
    }

    public void setH9b12e1(String newValue){
        _H9b12e1 = newValue;
    }

    public String getH9b12e2(){
        return _H9b12e2;
    }

    public void setH9b12e2(String newValue){
        _H9b12e2 = newValue;
    }

    public String getH9b12e3(){
        return _H9b12e3;
    }

    public void setH9b12e3(String newValue){
        _H9b12e3 = newValue;
    }

    public String getH9b12f1(){
        return _H9b12f1;
    }

    public void setH9b12f1(String newValue){
        _H9b12f1 = newValue;
    }

    public String getH9b12f2(){
        return _H9b12f2;
    }

    public void setH9b12f2(String newValue){
        _H9b12f2 = newValue;
    }

    public String getH9b12f3(){
        return _H9b12f3;
    }

    public void setH9b12f3(String newValue){
        _H9b12f3 = newValue;
    }

    public String getH9b12g1(){
        return _H9b12g1;
    }

    public void setH9b12g1(String newValue){
        _H9b12g1 = newValue;
    }

    public String getH9b12g2(){
        return _H9b12g2;
    }

    public void setH9b12g2(String newValue){
        _H9b12g2 = newValue;
    }

    public String getH9b12g3(){
        return _H9b12g3;
    }

    public void setH9b12g3(String newValue){
        _H9b12g3 = newValue;
    }

    public String getH9b12h1(){
        return _H9b12h1;
    }

    public void setH9b12h1(String newValue){
        _H9b12h1 = newValue;
    }

    public String getH9b12h2(){
        return _H9b12h2;
    }

    public void setH9b12h2(String newValue){
        _H9b12h2 = newValue;
    }

    public String getH9b12h3(){
        return _H9b12h3;
    }

    public void setH9b12h3(String newValue){
        _H9b12h3 = newValue;
    }

    public String getH9b12i1(){
        return _H9b12i1;
    }

    public void setH9b12i1(String newValue){
        _H9b12i1 = newValue;
    }

    public String getH9b12i2(){
        return _H9b12i2;
    }

    public void setH9b12i2(String newValue){
        _H9b12i2 = newValue;
    }

    public String getH9b12i3(){
        return _H9b12i3;
    }

    public void setH9b12i3(String newValue){
        _H9b12i3 = newValue;
    }

    public String getH9b12j1(){
        return _H9b12j1;
    }

    public void setH9b12j1(String newValue){
        _H9b12j1 = newValue;
    }

    public String getH9b12j2(){
        return _H9b12j2;
    }

    public void setH9b12j2(String newValue){
        _H9b12j2 = newValue;
    }

    public String getH9b12j3(){
        return _H9b12j3;
    }

    public void setH9b12j3(String newValue){
        _H9b12j3 = newValue;
    }

    public String getH9b12k1(){
        return _H9b12k1;
    }

    public void setH9b12k1(String newValue){
        _H9b12k1 = newValue;
    }

    public String getH9b12k2(){
        return _H9b12k2;
    }

    public void setH9b12k2(String newValue){
        _H9b12k2 = newValue;
    }

    public String getH9b12k3(){
        return _H9b12k3;
    }

    public void setH9b12k3(String newValue){
        _H9b12k3 = newValue;
    }

    public String getH9b12l1(){
        return _H9b12l1;
    }

    public void setH9b12l1(String newValue){
        _H9b12l1 = newValue;
    }

    public String getH9b12l2(){
        return _H9b12l2;
    }

    public void setH9b12l2(String newValue){
        _H9b12l2 = newValue;
    }

    public String getH9b12l3(){
        return _H9b12l3;
    }

    public void setH9b12l3(String newValue){
        _H9b12l3 = newValue;
    }

    public String getH9b12m1(){
        return _H9b12m1;
    }

    public void setH9b12m1(String newValue){
        _H9b12m1 = newValue;
    }

    public String getH9b12m2(){
        return _H9b12m2;
    }

    public void setH9b12m2(String newValue){
        _H9b12m2 = newValue;
    }

    public String getH9b12m3(){
        return _H9b12m3;
    }

    public void setH9b12m3(String newValue){
        _H9b12m3 = newValue;
    }

    public String getH9b13a(){
        return _H9b13a;
    }

    public void setH9b13a(String newValue){
        _H9b13a = newValue;
    }

    public String getH9b13b(){
        return _H9b13b;
    }

    public void setH9b13b(String newValue){
        _H9b13b = newValue;
    }

    public String getH9b13c(){
        return _H9b13c;
    }

    public void setH9b13c(String newValue){
        _H9b13c = newValue;
    }

    public String getH9b14a(){
        return _H9b14a;
    }

    public void setH9b14a(String newValue){
        _H9b14a = newValue;
    }

    public String getH9b14x1(){
        return _H9b14x1;
    }

    public void setH9b14x1(String newValue){
        _H9b14x1 = newValue;
    }

    public String getH9b14b(){
        return _H9b14b;
    }

    public void setH9b14b(String newValue){
        _H9b14b = newValue;
    }

    public String getH9b14c(){
        return _H9b14c;
    }

    public void setH9b14c(String newValue){
        _H9b14c = newValue;
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,MSlNo,H9a1a,H9a1b,H9a1c,H9a2a,H9a2b,H9a2c,H9a3a,H9a3b,H9a3c,H9a4a,H9a4b,H9a4c,H9a5a,H9a5b,H9a5c,H9b1a,H9b1b,H9b1c,H9b2a,H9b2b,H9b2c,H9b3a,H9b3b,H9b3c,H9b4a,H9b4b,H9b4c,H9b5a,H9b5b,H9b5c,H9b6a,H9b6b,H9b6c,H9b7a,H9b7b,H9b7c,H9b8a,H9b8b,H9b8c,H9b9a,H9b9b,H9b9c,H9b10a,H9b10b,H9b10c,H9b11a,H9b11b,H9b11c,H9b12,H9b12a1,H9b12a2,H9b12a3,H9b12b1,H9b12b2,H9b12b3,H9b12c1,H9b12c2,H9b12c3,H9b12d1,H9b12d2,H9b12d3,H9b12e1,H9b12e2,H9b12e3,H9b12f1,H9b12f2,H9b12f3,H9b12g1,H9b12g2,H9b12g3,H9b12h1,H9b12h2,H9b12h3,H9b12i1,H9b12i2,H9b12i3,H9b12j1,H9b12j2,H9b12j3,H9b12k1,H9b12k2,H9b12k3,H9b12l1,H9b12l2,H9b12l3,H9b12m1,H9b12m2,H9b12m3,H9b13a,H9b13b,H9b13c,H9b14a,H9b14x1,H9b14b,H9b14c,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _MSlNo + "', '" + _H9a1a + "', '" + _H9a1b + "', '" + _H9a1c + "', '" + _H9a2a + "', '" + _H9a2b + "', '" + _H9a2c + "', '" + _H9a3a + "', '" + _H9a3b + "', '" + _H9a3c + "', '" + _H9a4a + "', '" + _H9a4b + "', '" + _H9a4c + "', '" + _H9a5a + "', '" + _H9a5b + "', '" + _H9a5c + "', '" + _H9b1a + "', '" + _H9b1b + "', '" + _H9b1c + "', '" + _H9b2a + "', '" + _H9b2b + "', '" + _H9b2c + "', '" + _H9b3a + "', '" + _H9b3b + "', '" + _H9b3c + "', '" + _H9b4a + "', '" + _H9b4b + "', '" + _H9b4c + "', '" + _H9b5a + "', '" + _H9b5b + "', '" + _H9b5c + "', '" + _H9b6a + "', '" + _H9b6b + "', '" + _H9b6c + "', '" + _H9b7a + "', '" + _H9b7b + "', '" + _H9b7c + "', '" + _H9b8a + "', '" + _H9b8b + "', '" + _H9b8c + "', '" + _H9b9a + "', '" + _H9b9b + "', '" + _H9b9c + "', '" + _H9b10a + "', '" + _H9b10b + "', '" + _H9b10c + "', '" + _H9b11a + "', '" + _H9b11b + "', '" + _H9b11c + "', '" + _H9b12 + "', '" + _H9b12a1 + "', '" + _H9b12a2 + "', '" + _H9b12a3 + "', '" + _H9b12b1 + "', '" + _H9b12b2 + "', '" + _H9b12b3 + "', '" + _H9b12c1 + "', '" + _H9b12c2 + "', '" + _H9b12c3 + "', '" + _H9b12d1 + "', '" + _H9b12d2 + "', '" + _H9b12d3 + "', '" + _H9b12e1 + "', '" + _H9b12e2 + "', '" + _H9b12e3 + "', '" + _H9b12f1 + "', '" + _H9b12f2 + "', '" + _H9b12f3 + "', '" + _H9b12g1 + "', '" + _H9b12g2 + "', '" + _H9b12g3 + "', '" + _H9b12h1 + "', '" + _H9b12h2 + "', '" + _H9b12h3 + "', '" + _H9b12i1 + "', '" + _H9b12i2 + "', '" + _H9b12i3 + "', '" + _H9b12j1 + "', '" + _H9b12j2 + "', '" + _H9b12j3 + "', '" + _H9b12k1 + "', '" + _H9b12k2 + "', '" + _H9b12k3 + "', '" + _H9b12l1 + "', '" + _H9b12l2 + "', '" + _H9b12l3 + "', '" + _H9b12m1 + "', '" + _H9b12m2 + "', '" + _H9b12m3 + "', '" + _H9b13a + "', '" + _H9b13b + "', '" + _H9b13c + "', '" + _H9b14a + "', '" + _H9b14x1 + "', '" + _H9b14b + "', '" + _H9b14c + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',MSlNo = '" + _MSlNo + "',H9a1a = '" + _H9a1a + "',H9a1b = '" + _H9a1b + "',H9a1c = '" + _H9a1c + "',H9a2a = '" + _H9a2a + "',H9a2b = '" + _H9a2b + "',H9a2c = '" + _H9a2c + "',H9a3a = '" + _H9a3a + "',H9a3b = '" + _H9a3b + "',H9a3c = '" + _H9a3c + "',H9a4a = '" + _H9a4a + "',H9a4b = '" + _H9a4b + "',H9a4c = '" + _H9a4c + "',H9a5a = '" + _H9a5a + "',H9a5b = '" + _H9a5b + "',H9a5c = '" + _H9a5c + "',H9b1a = '" + _H9b1a + "',H9b1b = '" + _H9b1b + "',H9b1c = '" + _H9b1c + "',H9b2a = '" + _H9b2a + "',H9b2b = '" + _H9b2b + "',H9b2c = '" + _H9b2c + "',H9b3a = '" + _H9b3a + "',H9b3b = '" + _H9b3b + "',H9b3c = '" + _H9b3c + "',H9b4a = '" + _H9b4a + "',H9b4b = '" + _H9b4b + "',H9b4c = '" + _H9b4c + "',H9b5a = '" + _H9b5a + "',H9b5b = '" + _H9b5b + "',H9b5c = '" + _H9b5c + "',H9b6a = '" + _H9b6a + "',H9b6b = '" + _H9b6b + "',H9b6c = '" + _H9b6c + "',H9b7a = '" + _H9b7a + "',H9b7b = '" + _H9b7b + "',H9b7c = '" + _H9b7c + "',H9b8a = '" + _H9b8a + "',H9b8b = '" + _H9b8b + "',H9b8c = '" + _H9b8c + "',H9b9a = '" + _H9b9a + "',H9b9b = '" + _H9b9b + "',H9b9c = '" + _H9b9c + "',H9b10a = '" + _H9b10a + "',H9b10b = '" + _H9b10b + "',H9b10c = '" + _H9b10c + "',H9b11a = '" + _H9b11a + "',H9b11b = '" + _H9b11b + "',H9b11c = '" + _H9b11c + "',H9b12 = '" + _H9b12 + "',H9b12a1 = '" + _H9b12a1 + "',H9b12a2 = '" + _H9b12a2 + "',H9b12a3 = '" + _H9b12a3 + "',H9b12b1 = '" + _H9b12b1 + "',H9b12b2 = '" + _H9b12b2 + "',H9b12b3 = '" + _H9b12b3 + "',H9b12c1 = '" + _H9b12c1 + "',H9b12c2 = '" + _H9b12c2 + "',H9b12c3 = '" + _H9b12c3 + "',H9b12d1 = '" + _H9b12d1 + "',H9b12d2 = '" + _H9b12d2 + "',H9b12d3 = '" + _H9b12d3 + "',H9b12e1 = '" + _H9b12e1 + "',H9b12e2 = '" + _H9b12e2 + "',H9b12e3 = '" + _H9b12e3 + "',H9b12f1 = '" + _H9b12f1 + "',H9b12f2 = '" + _H9b12f2 + "',H9b12f3 = '" + _H9b12f3 + "',H9b12g1 = '" + _H9b12g1 + "',H9b12g2 = '" + _H9b12g2 + "',H9b12g3 = '" + _H9b12g3 + "',H9b12h1 = '" + _H9b12h1 + "',H9b12h2 = '" + _H9b12h2 + "',H9b12h3 = '" + _H9b12h3 + "',H9b12i1 = '" + _H9b12i1 + "',H9b12i2 = '" + _H9b12i2 + "',H9b12i3 = '" + _H9b12i3 + "',H9b12j1 = '" + _H9b12j1 + "',H9b12j2 = '" + _H9b12j2 + "',H9b12j3 = '" + _H9b12j3 + "',H9b12k1 = '" + _H9b12k1 + "',H9b12k2 = '" + _H9b12k2 + "',H9b12k3 = '" + _H9b12k3 + "',H9b12l1 = '" + _H9b12l1 + "',H9b12l2 = '" + _H9b12l2 + "',H9b12l3 = '" + _H9b12l3 + "',H9b12m1 = '" + _H9b12m1 + "',H9b12m2 = '" + _H9b12m2 + "',H9b12m3 = '" + _H9b12m3 + "',H9b13a = '" + _H9b13a + "',H9b13b = '" + _H9b13b + "',H9b13c = '" + _H9b13c + "',H9b14a = '" + _H9b14a + "',H9b14x1 = '" + _H9b14x1 + "',H9b14b = '" + _H9b14b + "',H9b14c = '" + _H9b14c + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
            C.Save(SQL);
        }
        catch(Exception  e)
        {
            response = e.getMessage();
        }
        return response;
    }


    public List<Cost3_DataModel> SelectAll(Context context, String SQL)
    {
        Connection C = new Connection(context);
        List<Cost3_DataModel> data = new ArrayList<Cost3_DataModel>();
        Cost3_DataModel d = new Cost3_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while(!cur.isAfterLast())
        {
            d = new Cost3_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._MSlNo = cur.getString(cur.getColumnIndex("MSlNo"));
            d._H9a1a = cur.getString(cur.getColumnIndex("H9a1a"));
            d._H9a1b = cur.getString(cur.getColumnIndex("H9a1b"));
            d._H9a1c = cur.getString(cur.getColumnIndex("H9a1c"));
            d._H9a2a = cur.getString(cur.getColumnIndex("H9a2a"));
            d._H9a2b = cur.getString(cur.getColumnIndex("H9a2b"));
            d._H9a2c = cur.getString(cur.getColumnIndex("H9a2c"));
            d._H9a3a = cur.getString(cur.getColumnIndex("H9a3a"));
            d._H9a3b = cur.getString(cur.getColumnIndex("H9a3b"));
            d._H9a3c = cur.getString(cur.getColumnIndex("H9a3c"));
            d._H9a4a = cur.getString(cur.getColumnIndex("H9a4a"));
            d._H9a4b = cur.getString(cur.getColumnIndex("H9a4b"));
            d._H9a4c = cur.getString(cur.getColumnIndex("H9a4c"));
            d._H9a5a = cur.getString(cur.getColumnIndex("H9a5a"));
            d._H9a5b = cur.getString(cur.getColumnIndex("H9a5b"));
            d._H9a5c = cur.getString(cur.getColumnIndex("H9a5c"));
            d._H9b1a = cur.getString(cur.getColumnIndex("H9b1a"));
            d._H9b1b = cur.getString(cur.getColumnIndex("H9b1b"));
            d._H9b1c = cur.getString(cur.getColumnIndex("H9b1c"));
            d._H9b2a = cur.getString(cur.getColumnIndex("H9b2a"));
            d._H9b2b = cur.getString(cur.getColumnIndex("H9b2b"));
            d._H9b2c = cur.getString(cur.getColumnIndex("H9b2c"));
            d._H9b3a = cur.getString(cur.getColumnIndex("H9b3a"));
            d._H9b3b = cur.getString(cur.getColumnIndex("H9b3b"));
            d._H9b3c = cur.getString(cur.getColumnIndex("H9b3c"));
            d._H9b4a = cur.getString(cur.getColumnIndex("H9b4a"));
            d._H9b4b = cur.getString(cur.getColumnIndex("H9b4b"));
            d._H9b4c = cur.getString(cur.getColumnIndex("H9b4c"));
            d._H9b5a = cur.getString(cur.getColumnIndex("H9b5a"));
            d._H9b5b = cur.getString(cur.getColumnIndex("H9b5b"));
            d._H9b5c = cur.getString(cur.getColumnIndex("H9b5c"));
            d._H9b6a = cur.getString(cur.getColumnIndex("H9b6a"));
            d._H9b6b = cur.getString(cur.getColumnIndex("H9b6b"));
            d._H9b6c = cur.getString(cur.getColumnIndex("H9b6c"));
            d._H9b7a = cur.getString(cur.getColumnIndex("H9b7a"));
            d._H9b7b = cur.getString(cur.getColumnIndex("H9b7b"));
            d._H9b7c = cur.getString(cur.getColumnIndex("H9b7c"));
            d._H9b8a = cur.getString(cur.getColumnIndex("H9b8a"));
            d._H9b8b = cur.getString(cur.getColumnIndex("H9b8b"));
            d._H9b8c = cur.getString(cur.getColumnIndex("H9b8c"));
            d._H9b9a = cur.getString(cur.getColumnIndex("H9b9a"));
            d._H9b9b = cur.getString(cur.getColumnIndex("H9b9b"));
            d._H9b9c = cur.getString(cur.getColumnIndex("H9b9c"));
            d._H9b10a = cur.getString(cur.getColumnIndex("H9b10a"));
            d._H9b10b = cur.getString(cur.getColumnIndex("H9b10b"));
            d._H9b10c = cur.getString(cur.getColumnIndex("H9b10c"));
            d._H9b11a = cur.getString(cur.getColumnIndex("H9b11a"));
            d._H9b11b = cur.getString(cur.getColumnIndex("H9b11b"));
            d._H9b11c = cur.getString(cur.getColumnIndex("H9b11c"));
            d._H9b12 = cur.getString(cur.getColumnIndex("H9b12"));
            d._H9b12a1 = cur.getString(cur.getColumnIndex("H9b12a1"));
            d._H9b12a2 = cur.getString(cur.getColumnIndex("H9b12a2"));
            d._H9b12a3 = cur.getString(cur.getColumnIndex("H9b12a3"));
            d._H9b12b1 = cur.getString(cur.getColumnIndex("H9b12b1"));
            d._H9b12b2 = cur.getString(cur.getColumnIndex("H9b12b2"));
            d._H9b12b3 = cur.getString(cur.getColumnIndex("H9b12b3"));
            d._H9b12c1 = cur.getString(cur.getColumnIndex("H9b12c1"));
            d._H9b12c2 = cur.getString(cur.getColumnIndex("H9b12c2"));
            d._H9b12c3 = cur.getString(cur.getColumnIndex("H9b12c3"));
            d._H9b12d1 = cur.getString(cur.getColumnIndex("H9b12d1"));
            d._H9b12d2 = cur.getString(cur.getColumnIndex("H9b12d2"));
            d._H9b12d3 = cur.getString(cur.getColumnIndex("H9b12d3"));
            d._H9b12e1 = cur.getString(cur.getColumnIndex("H9b12e1"));
            d._H9b12e2 = cur.getString(cur.getColumnIndex("H9b12e2"));
            d._H9b12e3 = cur.getString(cur.getColumnIndex("H9b12e3"));
            d._H9b12f1 = cur.getString(cur.getColumnIndex("H9b12f1"));
            d._H9b12f2 = cur.getString(cur.getColumnIndex("H9b12f2"));
            d._H9b12f3 = cur.getString(cur.getColumnIndex("H9b12f3"));
            d._H9b12g1 = cur.getString(cur.getColumnIndex("H9b12g1"));
            d._H9b12g2 = cur.getString(cur.getColumnIndex("H9b12g2"));
            d._H9b12g3 = cur.getString(cur.getColumnIndex("H9b12g3"));
            d._H9b12h1 = cur.getString(cur.getColumnIndex("H9b12h1"));
            d._H9b12h2 = cur.getString(cur.getColumnIndex("H9b12h2"));
            d._H9b12h3 = cur.getString(cur.getColumnIndex("H9b12h3"));
            d._H9b12i1 = cur.getString(cur.getColumnIndex("H9b12i1"));
            d._H9b12i2 = cur.getString(cur.getColumnIndex("H9b12i2"));
            d._H9b12i3 = cur.getString(cur.getColumnIndex("H9b12i3"));
            d._H9b12j1 = cur.getString(cur.getColumnIndex("H9b12j1"));
            d._H9b12j2 = cur.getString(cur.getColumnIndex("H9b12j2"));
            d._H9b12j3 = cur.getString(cur.getColumnIndex("H9b12j3"));
            d._H9b12k1 = cur.getString(cur.getColumnIndex("H9b12k1"));
            d._H9b12k2 = cur.getString(cur.getColumnIndex("H9b12k2"));
            d._H9b12k3 = cur.getString(cur.getColumnIndex("H9b12k3"));
            d._H9b12l1 = cur.getString(cur.getColumnIndex("H9b12l1"));
            d._H9b12l2 = cur.getString(cur.getColumnIndex("H9b12l2"));
            d._H9b12l3 = cur.getString(cur.getColumnIndex("H9b12l3"));
            d._H9b12m1 = cur.getString(cur.getColumnIndex("H9b12m1"));
            d._H9b12m2 = cur.getString(cur.getColumnIndex("H9b12m2"));
            d._H9b12m3 = cur.getString(cur.getColumnIndex("H9b12m3"));
            d._H9b13a = cur.getString(cur.getColumnIndex("H9b13a"));
            d._H9b13b = cur.getString(cur.getColumnIndex("H9b13b"));
            d._H9b13c = cur.getString(cur.getColumnIndex("H9b13c"));
            d._H9b14a = cur.getString(cur.getColumnIndex("H9b14a"));
            d._H9b14x1 = cur.getString(cur.getColumnIndex("H9b14x1"));
            d._H9b14b = cur.getString(cur.getColumnIndex("H9b14b"));
            d._H9b14c = cur.getString(cur.getColumnIndex("H9b14c"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}