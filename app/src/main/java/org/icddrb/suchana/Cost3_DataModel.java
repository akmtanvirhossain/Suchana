package org.icddrb.suchana;
import android.content.Context;
import android.database.Cursor;
import Common.Connection;
import java.util.ArrayList;
import java.util.List;
public class Cost3_DataModel{

    private String _Rnd = "";
    public String getRnd(){
        return _Rnd;
    }
    public void setRnd(String newValue){
        _Rnd = newValue;
    }
    private String _SuchanaID = "";
    public String getSuchanaID(){
        return _SuchanaID;
    }
    public void setSuchanaID(String newValue){
        _SuchanaID = newValue;
    }
    private String _MSlNo = "";
    public String getMSlNo(){
        return _MSlNo;
    }
    public void setMSlNo(String newValue){
        _MSlNo = newValue;
    }
    private String _H8111a = "";
    public String getH8111a(){
        return _H8111a;
    }
    public void setH8111a(String newValue){
        _H8111a = newValue;
    }
    private String _H8111b = "";
    public String getH8111b(){
        return _H8111b;
    }
    public void setH8111b(String newValue){
        _H8111b = newValue;
    }
    private String _H8111c = "";
    public String getH8111c(){
        return _H8111c;
    }
    public void setH8111c(String newValue){
        _H8111c = newValue;
    }
    private String _H8111d = "";
    public String getH8111d(){
        return _H8111d;
    }
    public void setH8111d(String newValue){
        _H8111d = newValue;
    }
    private String _H121a = "";
    public String getH121a(){
        return _H121a;
    }
    public void setH121a(String newValue){
        _H121a = newValue;
    }
    private String _H8121x1 = "";
    public String getH8121x1(){
        return _H8121x1;
    }
    public void setH8121x1(String newValue){
        _H8121x1 = newValue;
    }
    private String _H8121b = "";
    public String getH8121b(){
        return _H8121b;
    }
    public void setH8121b(String newValue){
        _H8121b = newValue;
    }
    private String _H8121c = "";
    public String getH8121c(){
        return _H8121c;
    }
    public void setH8121c(String newValue){
        _H8121c = newValue;
    }
    private String _H8121d = "";
    public String getH8121d(){
        return _H8121d;
    }
    public void setH8121d(String newValue){
        _H8121d = newValue;
    }
    private String _H8112a = "";
    public String getH8112a(){
        return _H8112a;
    }
    public void setH8112a(String newValue){
        _H8112a = newValue;
    }
    private String _H8112x1 = "";
    public String getH8112x1(){
        return _H8112x1;
    }
    public void setH8112x1(String newValue){
        _H8112x1 = newValue;
    }
    private String _H8112b = "";
    public String getH8112b(){
        return _H8112b;
    }
    public void setH8112b(String newValue){
        _H8112b = newValue;
    }
    private String _H8112c = "";
    public String getH8112c(){
        return _H8112c;
    }
    public void setH8112c(String newValue){
        _H8112c = newValue;
    }
    private String _H8112d = "";
    public String getH8112d(){
        return _H8112d;
    }
    public void setH8112d(String newValue){
        _H8112d = newValue;
    }
    private String _H9a1a = "";
    public String getH9a1a(){
        return _H9a1a;
    }
    public void setH9a1a(String newValue){
        _H9a1a = newValue;
    }
    private String _H9a1b = "";
    public String getH9a1b(){
        return _H9a1b;
    }
    public void setH9a1b(String newValue){
        _H9a1b = newValue;
    }
    private String _H9a1c = "";
    public String getH9a1c(){
        return _H9a1c;
    }
    public void setH9a1c(String newValue){
        _H9a1c = newValue;
    }
    private String _H9a2a = "";
    public String getH9a2a(){
        return _H9a2a;
    }
    public void setH9a2a(String newValue){
        _H9a2a = newValue;
    }
    private String _H9a2b = "";
    public String getH9a2b(){
        return _H9a2b;
    }
    public void setH9a2b(String newValue){
        _H9a2b = newValue;
    }
    private String _H9a2c = "";
    public String getH9a2c(){
        return _H9a2c;
    }
    public void setH9a2c(String newValue){
        _H9a2c = newValue;
    }
    private String _H9a3a = "";
    public String getH9a3a(){
        return _H9a3a;
    }
    public void setH9a3a(String newValue){
        _H9a3a = newValue;
    }
    private String _H9a3b = "";
    public String getH9a3b(){
        return _H9a3b;
    }
    public void setH9a3b(String newValue){
        _H9a3b = newValue;
    }
    private String _H9a3c = "";
    public String getH9a3c(){
        return _H9a3c;
    }
    public void setH9a3c(String newValue){
        _H9a3c = newValue;
    }
    private String _H9a4a = "";
    public String getH9a4a(){
        return _H9a4a;
    }
    public void setH9a4a(String newValue){
        _H9a4a = newValue;
    }
    private String _H9a4b = "";
    public String getH9a4b(){
        return _H9a4b;
    }
    public void setH9a4b(String newValue){
        _H9a4b = newValue;
    }
    private String _H9a4c = "";
    public String getH9a4c(){
        return _H9a4c;
    }
    public void setH9a4c(String newValue){
        _H9a4c = newValue;
    }
    private String _H9a5a = "";
    public String getH9a5a(){
        return _H9a5a;
    }
    public void setH9a5a(String newValue){
        _H9a5a = newValue;
    }
    private String _H9a5b = "";
    public String getH9a5b(){
        return _H9a5b;
    }
    public void setH9a5b(String newValue){
        _H9a5b = newValue;
    }
    private String _H9a5c = "";
    public String getH9a5c(){
        return _H9a5c;
    }
    public void setH9a5c(String newValue){
        _H9a5c = newValue;
    }
    private String _H9b1a = "";
    public String getH9b1a(){
        return _H9b1a;
    }
    public void setH9b1a(String newValue){
        _H9b1a = newValue;
    }
    private String _H9b1b = "";
    public String getH9b1b(){
        return _H9b1b;
    }
    public void setH9b1b(String newValue){
        _H9b1b = newValue;
    }
    private String _H9b1c = "";
    public String getH9b1c(){
        return _H9b1c;
    }
    public void setH9b1c(String newValue){
        _H9b1c = newValue;
    }
    private String _H9b2a = "";
    public String getH9b2a(){
        return _H9b2a;
    }
    public void setH9b2a(String newValue){
        _H9b2a = newValue;
    }
    private String _H9b2b = "";
    public String getH9b2b(){
        return _H9b2b;
    }
    public void setH9b2b(String newValue){
        _H9b2b = newValue;
    }
    private String _H9b2c = "";
    public String getH9b2c(){
        return _H9b2c;
    }
    public void setH9b2c(String newValue){
        _H9b2c = newValue;
    }
    private String _H9b3a = "";
    public String getH9b3a(){
        return _H9b3a;
    }
    public void setH9b3a(String newValue){
        _H9b3a = newValue;
    }
    private String _H9b3b = "";
    public String getH9b3b(){
        return _H9b3b;
    }
    public void setH9b3b(String newValue){
        _H9b3b = newValue;
    }
    private String _H9b3c = "";
    public String getH9b3c(){
        return _H9b3c;
    }
    public void setH9b3c(String newValue){
        _H9b3c = newValue;
    }
    private String _H9b4a = "";
    public String getH9b4a(){
        return _H9b4a;
    }
    public void setH9b4a(String newValue){
        _H9b4a = newValue;
    }
    private String _H9b4b = "";
    public String getH9b4b(){
        return _H9b4b;
    }
    public void setH9b4b(String newValue){
        _H9b4b = newValue;
    }
    private String _H9b4c = "";
    public String getH9b4c(){
        return _H9b4c;
    }
    public void setH9b4c(String newValue){
        _H9b4c = newValue;
    }
    private String _H9b5a = "";
    public String getH9b5a(){
        return _H9b5a;
    }
    public void setH9b5a(String newValue){
        _H9b5a = newValue;
    }
    private String _H9b5b = "";
    public String getH9b5b(){
        return _H9b5b;
    }
    public void setH9b5b(String newValue){
        _H9b5b = newValue;
    }
    private String _H9b5c = "";
    public String getH9b5c(){
        return _H9b5c;
    }
    public void setH9b5c(String newValue){
        _H9b5c = newValue;
    }
    private String _H9b6a = "";
    public String getH9b6a(){
        return _H9b6a;
    }
    public void setH9b6a(String newValue){
        _H9b6a = newValue;
    }
    private String _H9b6b = "";
    public String getH9b6b(){
        return _H9b6b;
    }
    public void setH9b6b(String newValue){
        _H9b6b = newValue;
    }
    private String _H9b6c = "";
    public String getH9b6c(){
        return _H9b6c;
    }
    public void setH9b6c(String newValue){
        _H9b6c = newValue;
    }
    private String _H9b7a = "";
    public String getH9b7a(){
        return _H9b7a;
    }
    public void setH9b7a(String newValue){
        _H9b7a = newValue;
    }
    private String _H9b7b = "";
    public String getH9b7b(){
        return _H9b7b;
    }
    public void setH9b7b(String newValue){
        _H9b7b = newValue;
    }
    private String _H9b7c = "";
    public String getH9b7c(){
        return _H9b7c;
    }
    public void setH9b7c(String newValue){
        _H9b7c = newValue;
    }
    private String _H9b8a = "";
    public String getH9b8a(){
        return _H9b8a;
    }
    public void setH9b8a(String newValue){
        _H9b8a = newValue;
    }
    private String _H9b8b = "";
    public String getH9b8b(){
        return _H9b8b;
    }
    public void setH9b8b(String newValue){
        _H9b8b = newValue;
    }
    private String _H9b8c = "";
    public String getH9b8c(){
        return _H9b8c;
    }
    public void setH9b8c(String newValue){
        _H9b8c = newValue;
    }
    private String _H9b9a = "";
    public String getH9b9a(){
        return _H9b9a;
    }
    public void setH9b9a(String newValue){
        _H9b9a = newValue;
    }
    private String _H9b9b = "";
    public String getH9b9b(){
        return _H9b9b;
    }
    public void setH9b9b(String newValue){
        _H9b9b = newValue;
    }
    private String _H9b9c = "";
    public String getH9b9c(){
        return _H9b9c;
    }
    public void setH9b9c(String newValue){
        _H9b9c = newValue;
    }
    private String _H9b10a = "";
    public String getH9b10a(){
        return _H9b10a;
    }
    public void setH9b10a(String newValue){
        _H9b10a = newValue;
    }
    private String _H9b10b = "";
    public String getH9b10b(){
        return _H9b10b;
    }
    public void setH9b10b(String newValue){
        _H9b10b = newValue;
    }
    private String _H9b10c = "";
    public String getH9b10c(){
        return _H9b10c;
    }
    public void setH9b10c(String newValue){
        _H9b10c = newValue;
    }
    private String _H9b11a = "";
    public String getH9b11a(){
        return _H9b11a;
    }
    public void setH9b11a(String newValue){
        _H9b11a = newValue;
    }
    private String _H9b11b = "";
    public String getH9b11b(){
        return _H9b11b;
    }
    public void setH9b11b(String newValue){
        _H9b11b = newValue;
    }
    private String _H9b11c = "";
    public String getH9b11c(){
        return _H9b11c;
    }
    public void setH9b11c(String newValue){
        _H9b11c = newValue;
    }
    private String _H9b12 = "";
    public String getH9b12(){
        return _H9b12;
    }
    public void setH9b12(String newValue){
        _H9b12 = newValue;
    }
    private String _H9b12a1 = "";
    public String getH9b12a1(){
        return _H9b12a1;
    }
    public void setH9b12a1(String newValue){
        _H9b12a1 = newValue;
    }
    private String _H9b12a2 = "";
    public String getH9b12a2(){
        return _H9b12a2;
    }
    public void setH9b12a2(String newValue){
        _H9b12a2 = newValue;
    }
    private String _H9b12a3 = "";
    public String getH9b12a3(){
        return _H9b12a3;
    }
    public void setH9b12a3(String newValue){
        _H9b12a3 = newValue;
    }
    private String _H9b12b1 = "";
    public String getH9b12b1(){
        return _H9b12b1;
    }
    public void setH9b12b1(String newValue){
        _H9b12b1 = newValue;
    }
    private String _H9b12b2 = "";
    public String getH9b12b2(){
        return _H9b12b2;
    }
    public void setH9b12b2(String newValue){
        _H9b12b2 = newValue;
    }
    private String _H9b12b3 = "";
    public String getH9b12b3(){
        return _H9b12b3;
    }
    public void setH9b12b3(String newValue){
        _H9b12b3 = newValue;
    }
    private String _H9b12c1 = "";
    public String getH9b12c1(){
        return _H9b12c1;
    }
    public void setH9b12c1(String newValue){
        _H9b12c1 = newValue;
    }
    private String _H9b12c2 = "";
    public String getH9b12c2(){
        return _H9b12c2;
    }
    public void setH9b12c2(String newValue){
        _H9b12c2 = newValue;
    }
    private String _H9b12c3 = "";
    public String getH9b12c3(){
        return _H9b12c3;
    }
    public void setH9b12c3(String newValue){
        _H9b12c3 = newValue;
    }
    private String _H9b12d1 = "";
    public String getH9b12d1(){
        return _H9b12d1;
    }
    public void setH9b12d1(String newValue){
        _H9b12d1 = newValue;
    }
    private String _H9b12d2 = "";
    public String getH9b12d2(){
        return _H9b12d2;
    }
    public void setH9b12d2(String newValue){
        _H9b12d2 = newValue;
    }
    private String _H9b12d3 = "";
    public String getH9b12d3(){
        return _H9b12d3;
    }
    public void setH9b12d3(String newValue){
        _H9b12d3 = newValue;
    }
    private String _H9b12e1 = "";
    public String getH9b12e1(){
        return _H9b12e1;
    }
    public void setH9b12e1(String newValue){
        _H9b12e1 = newValue;
    }
    private String _H9b12e2 = "";
    public String getH9b12e2(){
        return _H9b12e2;
    }
    public void setH9b12e2(String newValue){
        _H9b12e2 = newValue;
    }
    private String _H9b12e3 = "";
    public String getH9b12e3(){
        return _H9b12e3;
    }
    public void setH9b12e3(String newValue){
        _H9b12e3 = newValue;
    }
    private String _H9b12f1 = "";
    public String getH9b12f1(){
        return _H9b12f1;
    }
    public void setH9b12f1(String newValue){
        _H9b12f1 = newValue;
    }
    private String _H9b12f2 = "";
    public String getH9b12f2(){
        return _H9b12f2;
    }
    public void setH9b12f2(String newValue){
        _H9b12f2 = newValue;
    }
    private String _H9b12f3 = "";
    public String getH9b12f3(){
        return _H9b12f3;
    }
    public void setH9b12f3(String newValue){
        _H9b12f3 = newValue;
    }
    private String _H9b12g1 = "";
    public String getH9b12g1(){
        return _H9b12g1;
    }
    public void setH9b12g1(String newValue){
        _H9b12g1 = newValue;
    }
    private String _H9b12g2 = "";
    public String getH9b12g2(){
        return _H9b12g2;
    }
    public void setH9b12g2(String newValue){
        _H9b12g2 = newValue;
    }
    private String _H9b12g3 = "";
    public String getH9b12g3(){
        return _H9b12g3;
    }
    public void setH9b12g3(String newValue){
        _H9b12g3 = newValue;
    }
    private String _H9b12h1 = "";
    public String getH9b12h1(){
        return _H9b12h1;
    }
    public void setH9b12h1(String newValue){
        _H9b12h1 = newValue;
    }
    private String _H9b12h2 = "";
    public String getH9b12h2(){
        return _H9b12h2;
    }
    public void setH9b12h2(String newValue){
        _H9b12h2 = newValue;
    }
    private String _H9b12h3 = "";
    public String getH9b12h3(){
        return _H9b12h3;
    }
    public void setH9b12h3(String newValue){
        _H9b12h3 = newValue;
    }
    private String _H9b12i1 = "";
    public String getH9b12i1(){
        return _H9b12i1;
    }
    public void setH9b12i1(String newValue){
        _H9b12i1 = newValue;
    }
    private String _H9b12i2 = "";
    public String getH9b12i2(){
        return _H9b12i2;
    }
    public void setH9b12i2(String newValue){
        _H9b12i2 = newValue;
    }
    private String _H9b12i3 = "";
    public String getH9b12i3(){
        return _H9b12i3;
    }
    public void setH9b12i3(String newValue){
        _H9b12i3 = newValue;
    }
    private String _H9b12j1 = "";
    public String getH9b12j1(){
        return _H9b12j1;
    }
    public void setH9b12j1(String newValue){
        _H9b12j1 = newValue;
    }
    private String _H9b12j2 = "";
    public String getH9b12j2(){
        return _H9b12j2;
    }
    public void setH9b12j2(String newValue){
        _H9b12j2 = newValue;
    }
    private String _H9b12j3 = "";
    public String getH9b12j3(){
        return _H9b12j3;
    }
    public void setH9b12j3(String newValue){
        _H9b12j3 = newValue;
    }
    private String _H9b12k1 = "";
    public String getH9b12k1(){
        return _H9b12k1;
    }
    public void setH9b12k1(String newValue){
        _H9b12k1 = newValue;
    }
    private String _H9b12k2 = "";
    public String getH9b12k2(){
        return _H9b12k2;
    }
    public void setH9b12k2(String newValue){
        _H9b12k2 = newValue;
    }
    private String _H9b12k3 = "";
    public String getH9b12k3(){
        return _H9b12k3;
    }
    public void setH9b12k3(String newValue){
        _H9b12k3 = newValue;
    }
    private String _H9b12l1 = "";
    public String getH9b12l1(){
        return _H9b12l1;
    }
    public void setH9b12l1(String newValue){
        _H9b12l1 = newValue;
    }
    private String _H9b12l2 = "";
    public String getH9b12l2(){
        return _H9b12l2;
    }
    public void setH9b12l2(String newValue){
        _H9b12l2 = newValue;
    }
    private String _H9b12l3 = "";
    public String getH9b12l3(){
        return _H9b12l3;
    }
    public void setH9b12l3(String newValue){
        _H9b12l3 = newValue;
    }
    private String _H9b12m1 = "";
    public String getH9b12m1(){
        return _H9b12m1;
    }
    public void setH9b12m1(String newValue){
        _H9b12m1 = newValue;
    }
    private String _H9b12m2 = "";
    public String getH9b12m2(){
        return _H9b12m2;
    }
    public void setH9b12m2(String newValue){
        _H9b12m2 = newValue;
    }
    private String _H9b12m3 = "";
    public String getH9b12m3(){
        return _H9b12m3;
    }
    public void setH9b12m3(String newValue){
        _H9b12m3 = newValue;
    }
    private String _H9b13a = "";
    public String getH9b13a(){
        return _H9b13a;
    }
    public void setH9b13a(String newValue){
        _H9b13a = newValue;
    }
    private String _H9b13b = "";
    public String getH9b13b(){
        return _H9b13b;
    }
    public void setH9b13b(String newValue){
        _H9b13b = newValue;
    }
    private String _H9b13c = "";
    public String getH9b13c(){
        return _H9b13c;
    }
    public void setH9b13c(String newValue){
        _H9b13c = newValue;
    }
    private String _H9b14a = "";
    public String getH9b14a(){
        return _H9b14a;
    }
    public void setH9b14a(String newValue){
        _H9b14a = newValue;
    }
    private String _H9b14x1 = "";
    public String getH9b14x1(){
        return _H9b14x1;
    }
    public void setH9b14x1(String newValue){
        _H9b14x1 = newValue;
    }
    private String _H9b14b = "";
    public String getH9b14b(){
        return _H9b14b;
    }
    public void setH9b14b(String newValue){
        _H9b14b = newValue;
    }
    private String _H9b14c = "";
    public String getH9b14c(){
        return _H9b14c;
    }
    public void setH9b14c(String newValue){
        _H9b14c = newValue;
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

    String TableName = "Cost";

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
    Connection C;

    private String SaveData(Context context)
    {
        String response = "";
        C = new Connection(context);
        String SQL = "";
        try
        {
            SQL = "Insert into "+ TableName +" (Rnd,SuchanaID,MSlNo,H8111a,H8111b,H8111c,H8111d,H121a,H8121x1,H8121b,H8121c,H8121d,H8112a,H8112x1,H8112b,H8112c,H8112d,H9a1a,H9a1b,H9a1c,H9a2a,H9a2b,H9a2c,H9a3a,H9a3b,H9a3c,H9a4a,H9a4b,H9a4c,H9a5a,H9a5b,H9a5c,H9b1a,H9b1b,H9b1c,H9b2a,H9b2b,H9b2c,H9b3a,H9b3b,H9b3c,H9b4a,H9b4b,H9b4c,H9b5a,H9b5b,H9b5c,H9b6a,H9b6b,H9b6c,H9b7a,H9b7b,H9b7c,H9b8a,H9b8b,H9b8c,H9b9a,H9b9b,H9b9c,H9b10a,H9b10b,H9b10c,H9b11a,H9b11b,H9b11c,H9b12,H9b12a1,H9b12a2,H9b12a3,H9b12b1,H9b12b2,H9b12b3,H9b12c1,H9b12c2,H9b12c3,H9b12d1,H9b12d2,H9b12d3,H9b12e1,H9b12e2,H9b12e3,H9b12f1,H9b12f2,H9b12f3,H9b12g1,H9b12g2,H9b12g3,H9b12h1,H9b12h2,H9b12h3,H9b12i1,H9b12i2,H9b12i3,H9b12j1,H9b12j2,H9b12j3,H9b12k1,H9b12k2,H9b12k3,H9b12l1,H9b12l2,H9b12l3,H9b12m1,H9b12m2,H9b12m3,H9b13a,H9b13b,H9b13c,H9b14a,H9b14x1,H9b14b,H9b14c,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('"+ _Rnd +"', '"+ _SuchanaID +"', '"+ _MSlNo +"', '"+ _H8111a +"', '"+ _H8111b +"', '"+ _H8111c +"', '"+ _H8111d +"', '"+ _H121a +"', '"+ _H8121x1 +"', '"+ _H8121b +"', '"+ _H8121c +"', '"+ _H8121d +"', '"+ _H8112a +"', '"+ _H8112x1 +"', '"+ _H8112b +"', '"+ _H8112c +"', '"+ _H8112d +"', '"+ _H9a1a +"', '"+ _H9a1b +"', '"+ _H9a1c +"', '"+ _H9a2a +"', '"+ _H9a2b +"', '"+ _H9a2c +"', '"+ _H9a3a +"', '"+ _H9a3b +"', '"+ _H9a3c +"', '"+ _H9a4a +"', '"+ _H9a4b +"', '"+ _H9a4c +"', '"+ _H9a5a +"', '"+ _H9a5b +"', '"+ _H9a5c +"', '"+ _H9b1a +"', '"+ _H9b1b +"', '"+ _H9b1c +"', '"+ _H9b2a +"', '"+ _H9b2b +"', '"+ _H9b2c +"', '"+ _H9b3a +"', '"+ _H9b3b +"', '"+ _H9b3c +"', '"+ _H9b4a +"', '"+ _H9b4b +"', '"+ _H9b4c +"', '"+ _H9b5a +"', '"+ _H9b5b +"', '"+ _H9b5c +"', '"+ _H9b6a +"', '"+ _H9b6b +"', '"+ _H9b6c +"', '"+ _H9b7a +"', '"+ _H9b7b +"', '"+ _H9b7c +"', '"+ _H9b8a +"', '"+ _H9b8b +"', '"+ _H9b8c +"', '"+ _H9b9a +"', '"+ _H9b9b +"', '"+ _H9b9c +"', '"+ _H9b10a +"', '"+ _H9b10b +"', '"+ _H9b10c +"', '"+ _H9b11a +"', '"+ _H9b11b +"', '"+ _H9b11c +"', '"+ _H9b12 +"', '"+ _H9b12a1 +"', '"+ _H9b12a2 +"', '"+ _H9b12a3 +"', '"+ _H9b12b1 +"', '"+ _H9b12b2 +"', '"+ _H9b12b3 +"', '"+ _H9b12c1 +"', '"+ _H9b12c2 +"', '"+ _H9b12c3 +"', '"+ _H9b12d1 +"', '"+ _H9b12d2 +"', '"+ _H9b12d3 +"', '"+ _H9b12e1 +"', '"+ _H9b12e2 +"', '"+ _H9b12e3 +"', '"+ _H9b12f1 +"', '"+ _H9b12f2 +"', '"+ _H9b12f3 +"', '"+ _H9b12g1 +"', '"+ _H9b12g2 +"', '"+ _H9b12g3 +"', '"+ _H9b12h1 +"', '"+ _H9b12h2 +"', '"+ _H9b12h3 +"', '"+ _H9b12i1 +"', '"+ _H9b12i2 +"', '"+ _H9b12i3 +"', '"+ _H9b12j1 +"', '"+ _H9b12j2 +"', '"+ _H9b12j3 +"', '"+ _H9b12k1 +"', '"+ _H9b12k2 +"', '"+ _H9b12k3 +"', '"+ _H9b12l1 +"', '"+ _H9b12l2 +"', '"+ _H9b12l3 +"', '"+ _H9b12m1 +"', '"+ _H9b12m2 +"', '"+ _H9b12m3 +"', '"+ _H9b13a +"', '"+ _H9b13b +"', '"+ _H9b13c +"', '"+ _H9b14a +"', '"+ _H9b14x1 +"', '"+ _H9b14b +"', '"+ _H9b14c +"', '"+ _StartTime +"', '"+ _EndTime +"', '"+ _UserId +"', '"+ _EntryUser +"', '"+ _Lat +"', '"+ _Lon +"', '"+ _EnDt +"', '"+ _Upload +"')";
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
            SQL = "Update "+ TableName +" Set Upload='2',Rnd = '"+ _Rnd +"',SuchanaID = '"+ _SuchanaID +"',MSlNo = '"+ _MSlNo +"',H8111a = '"+ _H8111a +"',H8111b = '"+ _H8111b +"',H8111c = '"+ _H8111c +"',H8111d = '"+ _H8111d +"',H121a = '"+ _H121a +"',H8121x1 = '"+ _H8121x1 +"',H8121b = '"+ _H8121b +"',H8121c = '"+ _H8121c +"',H8121d = '"+ _H8121d +"',H8112a = '"+ _H8112a +"',H8112x1 = '"+ _H8112x1 +"',H8112b = '"+ _H8112b +"',H8112c = '"+ _H8112c +"',H8112d = '"+ _H8112d +"',H9a1a = '"+ _H9a1a +"',H9a1b = '"+ _H9a1b +"',H9a1c = '"+ _H9a1c +"',H9a2a = '"+ _H9a2a +"',H9a2b = '"+ _H9a2b +"',H9a2c = '"+ _H9a2c +"',H9a3a = '"+ _H9a3a +"',H9a3b = '"+ _H9a3b +"',H9a3c = '"+ _H9a3c +"',H9a4a = '"+ _H9a4a +"',H9a4b = '"+ _H9a4b +"',H9a4c = '"+ _H9a4c +"',H9a5a = '"+ _H9a5a +"',H9a5b = '"+ _H9a5b +"',H9a5c = '"+ _H9a5c +"',H9b1a = '"+ _H9b1a +"',H9b1b = '"+ _H9b1b +"',H9b1c = '"+ _H9b1c +"',H9b2a = '"+ _H9b2a +"',H9b2b = '"+ _H9b2b +"',H9b2c = '"+ _H9b2c +"',H9b3a = '"+ _H9b3a +"',H9b3b = '"+ _H9b3b +"',H9b3c = '"+ _H9b3c +"',H9b4a = '"+ _H9b4a +"',H9b4b = '"+ _H9b4b +"',H9b4c = '"+ _H9b4c +"',H9b5a = '"+ _H9b5a +"',H9b5b = '"+ _H9b5b +"',H9b5c = '"+ _H9b5c +"',H9b6a = '"+ _H9b6a +"',H9b6b = '"+ _H9b6b +"',H9b6c = '"+ _H9b6c +"',H9b7a = '"+ _H9b7a +"',H9b7b = '"+ _H9b7b +"',H9b7c = '"+ _H9b7c +"',H9b8a = '"+ _H9b8a +"',H9b8b = '"+ _H9b8b +"',H9b8c = '"+ _H9b8c +"',H9b9a = '"+ _H9b9a +"',H9b9b = '"+ _H9b9b +"',H9b9c = '"+ _H9b9c +"',H9b10a = '"+ _H9b10a +"',H9b10b = '"+ _H9b10b +"',H9b10c = '"+ _H9b10c +"',H9b11a = '"+ _H9b11a +"',H9b11b = '"+ _H9b11b +"',H9b11c = '"+ _H9b11c +"',H9b12 = '"+ _H9b12 +"',H9b12a1 = '"+ _H9b12a1 +"',H9b12a2 = '"+ _H9b12a2 +"',H9b12a3 = '"+ _H9b12a3 +"',H9b12b1 = '"+ _H9b12b1 +"',H9b12b2 = '"+ _H9b12b2 +"',H9b12b3 = '"+ _H9b12b3 +"',H9b12c1 = '"+ _H9b12c1 +"',H9b12c2 = '"+ _H9b12c2 +"',H9b12c3 = '"+ _H9b12c3 +"',H9b12d1 = '"+ _H9b12d1 +"',H9b12d2 = '"+ _H9b12d2 +"',H9b12d3 = '"+ _H9b12d3 +"',H9b12e1 = '"+ _H9b12e1 +"',H9b12e2 = '"+ _H9b12e2 +"',H9b12e3 = '"+ _H9b12e3 +"',H9b12f1 = '"+ _H9b12f1 +"',H9b12f2 = '"+ _H9b12f2 +"',H9b12f3 = '"+ _H9b12f3 +"',H9b12g1 = '"+ _H9b12g1 +"',H9b12g2 = '"+ _H9b12g2 +"',H9b12g3 = '"+ _H9b12g3 +"',H9b12h1 = '"+ _H9b12h1 +"',H9b12h2 = '"+ _H9b12h2 +"',H9b12h3 = '"+ _H9b12h3 +"',H9b12i1 = '"+ _H9b12i1 +"',H9b12i2 = '"+ _H9b12i2 +"',H9b12i3 = '"+ _H9b12i3 +"',H9b12j1 = '"+ _H9b12j1 +"',H9b12j2 = '"+ _H9b12j2 +"',H9b12j3 = '"+ _H9b12j3 +"',H9b12k1 = '"+ _H9b12k1 +"',H9b12k2 = '"+ _H9b12k2 +"',H9b12k3 = '"+ _H9b12k3 +"',H9b12l1 = '"+ _H9b12l1 +"',H9b12l2 = '"+ _H9b12l2 +"',H9b12l3 = '"+ _H9b12l3 +"',H9b12m1 = '"+ _H9b12m1 +"',H9b12m2 = '"+ _H9b12m2 +"',H9b12m3 = '"+ _H9b12m3 +"',H9b13a = '"+ _H9b13a +"',H9b13b = '"+ _H9b13b +"',H9b13c = '"+ _H9b13c +"',H9b14a = '"+ _H9b14a +"',H9b14x1 = '"+ _H9b14x1 +"',H9b14b = '"+ _H9b14b +"',H9b14c = '"+ _H9b14c +"'  Where Rnd='"+ _Rnd +"' and SuchanaID='"+ _SuchanaID +"'";
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
            d._H8111a = cur.getString(cur.getColumnIndex("H8111a"));
            d._H8111b = cur.getString(cur.getColumnIndex("H8111b"));
            d._H8111c = cur.getString(cur.getColumnIndex("H8111c"));
            d._H8111d = cur.getString(cur.getColumnIndex("H8111d"));
            d._H121a = cur.getString(cur.getColumnIndex("H121a"));
            d._H8121x1 = cur.getString(cur.getColumnIndex("H8121x1"));
            d._H8121b = cur.getString(cur.getColumnIndex("H8121b"));
            d._H8121c = cur.getString(cur.getColumnIndex("H8121c"));
            d._H8121d = cur.getString(cur.getColumnIndex("H8121d"));
            d._H8112a = cur.getString(cur.getColumnIndex("H8112a"));
            d._H8112x1 = cur.getString(cur.getColumnIndex("H8112x1"));
            d._H8112b = cur.getString(cur.getColumnIndex("H8112b"));
            d._H8112c = cur.getString(cur.getColumnIndex("H8112c"));
            d._H8112d = cur.getString(cur.getColumnIndex("H8112d"));
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