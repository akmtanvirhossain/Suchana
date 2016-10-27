
package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;
public class FdHabit_DataModel{

    String TableName = "FdHabit";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _C11 = "";
    private String _C12 = "";
    private String _C13 = "";
    private String _C14 = "";
    private String _C15 = "";
    private String _C16 = "";
    private String _C17 = "";
    private String _C18 = "";
    private String _C19a = "";
    private String _C19b = "";
    private String _C19c = "";
    private String _C110 = "";
    private String _C111 = "";
    private String _C112 = "";
    private String _C113 = "";
    private String _C114d = "";
    private String _C114m = "";
    private String _C115 = "";
    private String _C116 = "";
    private String _C117a = "";
    private String _C117b = "";
    private String _C117c = "";
    private String _C117d = "";
    private String _C117e = "";
    private String _C117eX = "";
    private String _C117f = "";
    private String _C118d = "";
    private String _C118m = "";
    private String _C119 = "";
    private String _C120 = "";
    private String _C121a = "";
    private String _C121b = "";
    private String _C121b1 = "";
    private String _C121c = "";
    private String _C121c1 = "";
    private String _C121d = "";
    private String _C121e = "";
    private String _C121f = "";
    private String _C121f1 = "";
    private String _C121g = "";
    private String _C121h = "";
    private String _C121i = "";
    private String _C121iX = "";
    private String _C122 = "";
    private String _C123 = "";
    private String _C124 = "";
    private String _C125 = "";
    private String _C126a = "";
    private String _C126b = "";
    private String _C126c = "";
    private String _C126d = "";
    private String _C126e = "";
    private String _C126f = "";
    private String _C126g = "";
    private String _C126h = "";
    private String _C126i = "";
    private String _C126j = "";
    private String _C126k = "";
    private String _C126l = "";
    private String _C126m = "";
    private String _C126n = "";
    private String _C126o = "";
    private String _C126q = "";
    private String _C126r = "";
    private String _C129 = "";
    private String _C130 = "";
    private String _C131 = "";
    private String _C134 = "";
    private String _C135a = "";
    private String _C135b = "";
    private String _C135c = "";
    private String _C135d = "";
    private String _C135e = "";
    private String _C135eX = "";
    private String _C136 = "";
    private String _C137a = "";
    private String _C137b = "";
    private String _C137c = "";
    private String _C137d = "";
    private String _C137e = "";
    private String _C137f = "";
    private String _C137g = "";
    private String _C137h = "";
    private String _C137i = "";
    private String _C137j = "";
    private String _C137k = "";
    private String _C137l = "";
    private String _C137m = "";
    private String _C137mX = "";
    private String _C138 = "";
    private String _C139 = "";
    private String _BCG1 = "";
    private String _BCG2 = "";
    private String _Penta1 = "";
    private String _Penta2 = "";
    private String _Penta3 = "";
    private String _OPV1 = "";
    private String _OPV2 = "";
    private String _OPV3 = "";
    private String _PCV1 = "";
    private String _PCV2 = "";
    private String _PCV3 = "";
    private String _IPV = "";
    private String _MR1 = "";
    private String _MR2 = "";
    private String _C140 = "";
    private String _C141 = "";
    private String _C141X = "";
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

    public String getC11(){
        return _C11;
    }

    public void setC11(String newValue){
        _C11 = newValue;
    }

    public String getC12(){
        return _C12;
    }

    public void setC12(String newValue){
        _C12 = newValue;
    }

    public String getC13(){
        return _C13;
    }

    public void setC13(String newValue){
        _C13 = newValue;
    }

    public String getC14(){
        return _C14;
    }

    public void setC14(String newValue){
        _C14 = newValue;
    }

    public String getC15(){
        return _C15;
    }

    public void setC15(String newValue){
        _C15 = newValue;
    }

    public String getC16(){
        return _C16;
    }

    public void setC16(String newValue){
        _C16 = newValue;
    }

    public String getC17(){
        return _C17;
    }

    public void setC17(String newValue){
        _C17 = newValue;
    }

    public String getC18(){
        return _C18;
    }

    public void setC18(String newValue){
        _C18 = newValue;
    }

    public String getC19a(){
        return _C19a;
    }

    public void setC19a(String newValue){
        _C19a = newValue;
    }

    public String getC19b(){
        return _C19b;
    }

    public void setC19b(String newValue){
        _C19b = newValue;
    }

    public String getC19c(){
        return _C19c;
    }

    public void setC19c(String newValue){
        _C19c = newValue;
    }

    public String getC110(){
        return _C110;
    }

    public void setC110(String newValue){
        _C110 = newValue;
    }

    public String getC111(){
        return _C111;
    }

    public void setC111(String newValue){
        _C111 = newValue;
    }

    public String getC112(){
        return _C112;
    }

    public void setC112(String newValue){
        _C112 = newValue;
    }

    public String getC113(){
        return _C113;
    }

    public void setC113(String newValue){
        _C113 = newValue;
    }

    public String getC114d(){
        return _C114d;
    }

    public void setC114d(String newValue){
        _C114d = newValue;
    }

    public String getC114m(){
        return _C114m;
    }

    public void setC114m(String newValue){
        _C114m = newValue;
    }

    public String getC115(){
        return _C115;
    }

    public void setC115(String newValue){
        _C115 = newValue;
    }

    public String getC116(){
        return _C116;
    }

    public void setC116(String newValue){
        _C116 = newValue;
    }

    public String getC117a(){
        return _C117a;
    }

    public void setC117a(String newValue){
        _C117a = newValue;
    }

    public String getC117b(){
        return _C117b;
    }

    public void setC117b(String newValue){
        _C117b = newValue;
    }

    public String getC117c(){
        return _C117c;
    }

    public void setC117c(String newValue){
        _C117c = newValue;
    }

    public String getC117d(){
        return _C117d;
    }

    public void setC117d(String newValue){
        _C117d = newValue;
    }

    public String getC117e(){
        return _C117e;
    }

    public void setC117e(String newValue){
        _C117e = newValue;
    }

    public String getC117eX(){
        return _C117eX;
    }

    public void setC117eX(String newValue){
        _C117eX = newValue;
    }

    public String getC117f(){
        return _C117f;
    }

    public void setC117f(String newValue){
        _C117f = newValue;
    }

    public String getC118d(){
        return _C118d;
    }

    public void setC118d(String newValue){
        _C118d = newValue;
    }

    public String getC118m(){
        return _C118m;
    }

    public void setC118m(String newValue){
        _C118m = newValue;
    }

    public String getC119(){
        return _C119;
    }

    public void setC119(String newValue){
        _C119 = newValue;
    }

    public String getC120(){
        return _C120;
    }

    public void setC120(String newValue){
        _C120 = newValue;
    }

    public String getC121a(){
        return _C121a;
    }

    public void setC121a(String newValue){
        _C121a = newValue;
    }

    public String getC121b(){
        return _C121b;
    }

    public void setC121b(String newValue){
        _C121b = newValue;
    }

    public String getC121b1(){
        return _C121b1;
    }

    public void setC121b1(String newValue){
        _C121b1 = newValue;
    }

    public String getC121c(){
        return _C121c;
    }

    public void setC121c(String newValue){
        _C121c = newValue;
    }

    public String getC121c1(){
        return _C121c1;
    }

    public void setC121c1(String newValue){
        _C121c1 = newValue;
    }

    public String getC121d(){
        return _C121d;
    }

    public void setC121d(String newValue){
        _C121d = newValue;
    }

    public String getC121e(){
        return _C121e;
    }

    public void setC121e(String newValue){
        _C121e = newValue;
    }

    public String getC121f(){
        return _C121f;
    }

    public void setC121f(String newValue){
        _C121f = newValue;
    }

    public String getC121f1(){
        return _C121f1;
    }

    public void setC121f1(String newValue){
        _C121f1 = newValue;
    }

    public String getC121g(){
        return _C121g;
    }

    public void setC121g(String newValue){
        _C121g = newValue;
    }

    public String getC121h(){
        return _C121h;
    }

    public void setC121h(String newValue){
        _C121h = newValue;
    }

    public String getC121i(){
        return _C121i;
    }

    public void setC121i(String newValue){
        _C121i = newValue;
    }

    public String getC121iX(){
        return _C121iX;
    }

    public void setC121iX(String newValue){
        _C121iX = newValue;
    }

    public String getC122(){
        return _C122;
    }

    public void setC122(String newValue){
        _C122 = newValue;
    }

    public String getC123(){
        return _C123;
    }

    public void setC123(String newValue){
        _C123 = newValue;
    }

    public String getC124(){
        return _C124;
    }

    public void setC124(String newValue){
        _C124 = newValue;
    }

    public String getC125(){
        return _C125;
    }

    public void setC125(String newValue){
        _C125 = newValue;
    }

    public String getC126a(){
        return _C126a;
    }

    public void setC126a(String newValue){
        _C126a = newValue;
    }

    public String getC126b(){
        return _C126b;
    }

    public void setC126b(String newValue){
        _C126b = newValue;
    }

    public String getC126c(){
        return _C126c;
    }

    public void setC126c(String newValue){
        _C126c = newValue;
    }

    public String getC126d(){
        return _C126d;
    }

    public void setC126d(String newValue){
        _C126d = newValue;
    }

    public String getC126e(){
        return _C126e;
    }

    public void setC126e(String newValue){
        _C126e = newValue;
    }

    public String getC126f(){
        return _C126f;
    }

    public void setC126f(String newValue){
        _C126f = newValue;
    }

    public String getC126g(){
        return _C126g;
    }

    public void setC126g(String newValue){
        _C126g = newValue;
    }

    public String getC126h(){
        return _C126h;
    }

    public void setC126h(String newValue){
        _C126h = newValue;
    }

    public String getC126i(){
        return _C126i;
    }

    public void setC126i(String newValue){
        _C126i = newValue;
    }

    public String getC126j(){
        return _C126j;
    }

    public void setC126j(String newValue){
        _C126j = newValue;
    }

    public String getC126k(){
        return _C126k;
    }

    public void setC126k(String newValue){
        _C126k = newValue;
    }

    public String getC126l(){
        return _C126l;
    }

    public void setC126l(String newValue){
        _C126l = newValue;
    }

    public String getC126m(){
        return _C126m;
    }

    public void setC126m(String newValue){
        _C126m = newValue;
    }

    public String getC126n(){
        return _C126n;
    }

    public void setC126n(String newValue){
        _C126n = newValue;
    }

    public String getC126o(){
        return _C126o;
    }

    public void setC126o(String newValue){
        _C126o = newValue;
    }

    public String getC126q(){
        return _C126q;
    }

    public void setC126q(String newValue){
        _C126q = newValue;
    }

    public String getC126r(){
        return _C126r;
    }

    public void setC126r(String newValue){
        _C126r = newValue;
    }

    public String getC129(){
        return _C129;
    }

    public void setC129(String newValue){
        _C129 = newValue;
    }

    public String getC130(){
        return _C130;
    }

    public void setC130(String newValue){
        _C130 = newValue;
    }

    public String getC131(){
        return _C131;
    }

    public void setC131(String newValue){
        _C131 = newValue;
    }

    public String getC134(){
        return _C134;
    }

    public void setC134(String newValue){
        _C134 = newValue;
    }

    public String getC135a(){
        return _C135a;
    }

    public void setC135a(String newValue){
        _C135a = newValue;
    }

    public String getC135b(){
        return _C135b;
    }

    public void setC135b(String newValue){
        _C135b = newValue;
    }

    public String getC135c(){
        return _C135c;
    }

    public void setC135c(String newValue){
        _C135c = newValue;
    }

    public String getC135d(){
        return _C135d;
    }

    public void setC135d(String newValue){
        _C135d = newValue;
    }

    public String getC135e(){
        return _C135e;
    }

    public void setC135e(String newValue){
        _C135e = newValue;
    }

    public String getC135eX(){
        return _C135eX;
    }

    public void setC135eX(String newValue){
        _C135eX = newValue;
    }

    public String getC136(){
        return _C136;
    }

    public void setC136(String newValue){
        _C136 = newValue;
    }

    public String getC137a(){
        return _C137a;
    }

    public void setC137a(String newValue){
        _C137a = newValue;
    }

    public String getC137b(){
        return _C137b;
    }

    public void setC137b(String newValue){
        _C137b = newValue;
    }

    public String getC137c(){
        return _C137c;
    }

    public void setC137c(String newValue){
        _C137c = newValue;
    }

    public String getC137d(){
        return _C137d;
    }

    public void setC137d(String newValue){
        _C137d = newValue;
    }

    public String getC137e(){
        return _C137e;
    }

    public void setC137e(String newValue){
        _C137e = newValue;
    }

    public String getC137f(){
        return _C137f;
    }

    public void setC137f(String newValue){
        _C137f = newValue;
    }

    public String getC137g(){
        return _C137g;
    }

    public void setC137g(String newValue){
        _C137g = newValue;
    }

    public String getC137h(){
        return _C137h;
    }

    public void setC137h(String newValue){
        _C137h = newValue;
    }

    public String getC137i(){
        return _C137i;
    }

    public void setC137i(String newValue){
        _C137i = newValue;
    }

    public String getC137j(){
        return _C137j;
    }

    public void setC137j(String newValue){
        _C137j = newValue;
    }

    public String getC137k(){
        return _C137k;
    }

    public void setC137k(String newValue){
        _C137k = newValue;
    }

    public String getC137l(){
        return _C137l;
    }

    public void setC137l(String newValue){
        _C137l = newValue;
    }

    public String getC137m(){
        return _C137m;
    }

    public void setC137m(String newValue){
        _C137m = newValue;
    }

    public String getC137mX(){
        return _C137mX;
    }

    public void setC137mX(String newValue){
        _C137mX = newValue;
    }

    public String getC138(){
        return _C138;
    }

    public void setC138(String newValue){
        _C138 = newValue;
    }

    public String getC139(){
        return _C139;
    }

    public void setC139(String newValue){
        _C139 = newValue;
    }

    public String getBCG1(){
        return _BCG1;
    }

    public void setBCG1(String newValue){
        _BCG1 = newValue;
    }

    public String getBCG2(){
        return _BCG2;
    }

    public void setBCG2(String newValue){
        _BCG2 = newValue;
    }

    public String getPenta1(){
        return _Penta1;
    }

    public void setPenta1(String newValue){
        _Penta1 = newValue;
    }

    public String getPenta2(){
        return _Penta2;
    }

    public void setPenta2(String newValue){
        _Penta2 = newValue;
    }

    public String getPenta3(){
        return _Penta3;
    }

    public void setPenta3(String newValue){
        _Penta3 = newValue;
    }

    public String getOPV1(){
        return _OPV1;
    }

    public void setOPV1(String newValue){
        _OPV1 = newValue;
    }

    public String getOPV2(){
        return _OPV2;
    }

    public void setOPV2(String newValue){
        _OPV2 = newValue;
    }

    public String getOPV3(){
        return _OPV3;
    }

    public void setOPV3(String newValue){
        _OPV3 = newValue;
    }

    public String getPCV1(){
        return _PCV1;
    }

    public void setPCV1(String newValue){
        _PCV1 = newValue;
    }

    public String getPCV2(){
        return _PCV2;
    }

    public void setPCV2(String newValue){
        _PCV2 = newValue;
    }

    public String getPCV3(){
        return _PCV3;
    }

    public void setPCV3(String newValue){
        _PCV3 = newValue;
    }

    public String getIPV(){
        return _IPV;
    }

    public void setIPV(String newValue){
        _IPV = newValue;
    }

    public String getMR1(){
        return _MR1;
    }

    public void setMR1(String newValue){
        _MR1 = newValue;
    }

    public String getMR2(){
        return _MR2;
    }

    public void setMR2(String newValue){
        _MR2 = newValue;
    }

    public String getC140(){
        return _C140;
    }

    public void setC140(String newValue){
        _C140 = newValue;
    }

    public String getC141(){
        return _C141;
    }

    public void setC141(String newValue){
        _C141 = newValue;
    }

    public String getC141X(){
        return _C141X;
    }

    public void setC141X(String newValue){
        _C141X = newValue;
    }

    public String getC142a(){
        return _C142a;
    }

    public void setC142a(String newValue){
        _C142a = newValue;
    }

    public String getC142b(){
        return _C142b;
    }

    public void setC142b(String newValue){
        _C142b = newValue;
    }

    public String getC142c(){
        return _C142c;
    }

    public void setC142c(String newValue){
        _C142c = newValue;
    }

    public String getC142d(){
        return _C142d;
    }

    public void setC142d(String newValue){
        _C142d = newValue;
    }

    public String getC142e(){
        return _C142e;
    }

    public void setC142e(String newValue){
        _C142e = newValue;
    }

    public String getC142f(){
        return _C142f;
    }

    public void setC142f(String newValue){
        _C142f = newValue;
    }

    public String getC142g(){
        return _C142g;
    }

    public void setC142g(String newValue){
        _C142g = newValue;
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,C11,C12,C13,C14,C15,C16,C17,C18,C19a,C19b,C19c,C110,C111,C112,C113,C114d,C114m,C115,C116,C117a,C117b,C117c,C117d,C117e,C117eX,C117f,C118d,C118m,C119,C120,C121a,C121b,C121b1,C121c,C121c1,C121d,C121e,C121f,C121f1,C121g,C121h,C121i,C121iX,C122,C123,C124,C125,C126a,C126b,C126c,C126d,C126e,C126f,C126g,C126h,C126i,C126j,C126k,C126l,C126m,C126n,C126o,C126q,C126r,C129,C130,C131,C134,C135a,C135b,C135c,C135d,C135e,C135eX,C136,C137a,C137b,C137c,C137d,C137e,C137f,C137g,C137h,C137i,C137j,C137k,C137l,C137m,C137mX,C138,C139,BCG1,BCG2,Penta1,Penta2,Penta3,OPV1,OPV2,OPV3,PCV1,PCV2,PCV3,IPV,MR1,MR2,C140,C141,C141X,C142a,C142b,C142c,C142d,C142e,C142f,C142g,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _C11 + "', '" + _C12 + "', '" + _C13 + "', '" + _C14 + "', '" + _C15 + "', '" + _C16 + "', '" + _C17 + "', '" + _C18 + "', '" + _C19a + "', '" + _C19b + "', '" + _C19c + "', '" + _C110 + "', '" + _C111 + "', '" + _C112 + "', '" + _C113 + "', '" + _C114d + "', '" + _C114m + "', '" + _C115 + "', '" + _C116 + "', '" + _C117a + "', '" + _C117b + "', '" + _C117c + "', '" + _C117d + "', '" + _C117e + "', '" + _C117eX + "', '" + _C117f + "', '" + _C118d + "', '" + _C118m + "', '" + _C119 + "', '" + _C120 + "', '" + _C121a + "', '" + _C121b + "', '" + _C121b1 + "', '" + _C121c + "', '" + _C121c1 + "', '" + _C121d + "', '" + _C121e + "', '" + _C121f + "', '" + _C121f1 + "', '" + _C121g + "', '" + _C121h + "', '" + _C121i + "', '" + _C121iX + "', '" + _C122 + "', '" + _C123 + "', '" + _C124 + "', '" + _C125 + "', '" + _C126a + "', '" + _C126b + "', '" + _C126c + "', '" + _C126d + "', '" + _C126e + "', '" + _C126f + "', '" + _C126g + "', '" + _C126h + "', '" + _C126i + "', '" + _C126j + "', '" + _C126k + "', '" + _C126l + "', '" + _C126m + "', '" + _C126n + "', '" + _C126o + "', '" + _C126q + "', '" + _C126r + "', '" + _C129 + "', '" + _C130 + "', '" + _C131 + "', '" + _C134 + "', '" + _C135a + "', '" + _C135b + "', '" + _C135c + "', '" + _C135d + "', '" + _C135e + "', '" + _C135eX + "', '" + _C136 + "', '" + _C137a + "', '" + _C137b + "', '" + _C137c + "', '" + _C137d + "', '" + _C137e + "', '" + _C137f + "', '" + _C137g + "', '" + _C137h + "', '" + _C137i + "', '" + _C137j + "', '" + _C137k + "', '" + _C137l + "', '" + _C137m + "', '" + _C137mX + "', '" + _C138 + "', '" + _C139 + "', '" + _BCG1 + "', '" + _BCG2 + "', '" + _Penta1 + "', '" + _Penta2 + "', '" + _Penta3 + "', '" + _OPV1 + "', '" + _OPV2 + "', '" + _OPV3 + "', '" + _PCV1 + "', '" + _PCV2 + "', '" + _PCV3 + "', '" + _IPV + "', '" + _MR1 + "', '" + _MR2 + "', '" + _C140 + "', '" + _C141 + "', '" + _C141X + "', '" + _C142a + "', '" + _C142b + "', '" + _C142c + "', '" + _C142d + "', '" + _C142e + "', '" + _C142f + "', '" + _C142g + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update "+ TableName +" Set Upload='2',Rnd = '"+ _Rnd +"',SuchanaID = '"+ _SuchanaID +"',C11 = '"+ _C11 +"',C12 = '"+ _C12 +"',C13 = '"+ _C13 +"',C14 = '"+ _C14 +"',C15 = '"+ _C15 +"',C16 = '"+ _C16 +"',C17 = '"+ _C17 +"',C18 = '"+ _C18 +"',C19a = '"+ _C19a +"',C19b = '"+ _C19b +"',C19c = '"+ _C19c +"',C110 = '"+ _C110 +"',C111 = '"+ _C111 +"',C112 = '"+ _C112 +"',C113 = '"+ _C113 +"',C114d = '"+ _C114d +"',C114m = '"+ _C114m +"',C115 = '"+ _C115 +"',C116 = '"+ _C116 +"',C117a = '"+ _C117a +"',C117b = '"+ _C117b +"',C117c = '"+ _C117c +"',C117d = '"+ _C117d +"',C117e = '"+ _C117e +"',C117eX = '"+ _C117eX +"',C117f = '"+ _C117f +"',C118d = '"+ _C118d +"',C118m = '"+ _C118m +"',C119 = '"+ _C119 +"',C120 = '"+ _C120 +"',C121a = '"+ _C121a +"',C121b = '"+ _C121b +"',C121b1 = '"+ _C121b1 +"',C121c = '"+ _C121c +"',C121c1 = '"+ _C121c1 +"',C121d = '"+ _C121d +"',C121e = '"+ _C121e +"',C121f = '"+ _C121f +"',C121f1 = '"+ _C121f1 +"',C121g = '"+ _C121g +"',C121h = '"+ _C121h +"',C121i = '"+ _C121i +"',C121iX = '"+ _C121iX +"',C122 = '"+ _C122 +"',C123 = '"+ _C123 +"',C124 = '"+ _C124 +"',C125 = '"+ _C125 +"',C126a = '"+ _C126a +"',C126b = '"+ _C126b +"',C126c = '"+ _C126c +"',C126d = '"+ _C126d +"',C126e = '"+ _C126e +"',C126f = '"+ _C126f +"',C126g = '"+ _C126g +"',C126h = '"+ _C126h +"',C126i = '"+ _C126i +"',C126j = '"+ _C126j +"',C126k = '"+ _C126k +"',C126l = '"+ _C126l +"',C126m = '"+ _C126m +"',C126n = '"+ _C126n +"',C126o = '"+ _C126o +"',C126q = '"+ _C126q +"',C126r = '"+ _C126r +"',C129 = '"+ _C129 +"',C130 = '"+ _C130 +"',C131 = '"+ _C131 +"',C134 = '"+ _C134 +"',C135a = '"+ _C135a +"',C135b = '"+ _C135b +"',C135c = '"+ _C135c +"',C135d = '"+ _C135d +"',C135e = '"+ _C135e +"',C135eX = '"+ _C135eX +"',C136 = '"+ _C136 +"',C137a = '"+ _C137a +"',C137b = '"+ _C137b +"',C137c = '"+ _C137c +"',C137d = '"+ _C137d +"',C137e = '"+ _C137e +"',C137f = '"+ _C137f +"',C137g = '"+ _C137g +"',C137h = '"+ _C137h +"',C137i = '"+ _C137i +"',C137j = '"+ _C137j +"',C137k = '"+ _C137k +"',C137l = '"+ _C137l +"',C137m = '"+ _C137m +"',C137mX = '"+ _C137mX +"',C138 = '"+ _C138 +"',C139 = '"+ _C139 +"',BCG1 = '"+ _BCG1 +"',BCG2 = '"+ _BCG2 +"',Penta1 = '"+ _Penta1 +"',Penta2 = '"+ _Penta2 +"',Penta3 = '"+ _Penta3 +"',OPV1 = '"+ _OPV1 +"',OPV2 = '"+ _OPV2 +"',OPV3 = '"+ _OPV3 +"',PCV1 = '"+ _PCV1 +"',PCV2 = '"+ _PCV2 +"',PCV3 = '"+ _PCV3 +"',IPV = '"+ _IPV +"',MR1 = '"+ _MR1 +"',MR2 = '"+ _MR2 +"',C140 = '"+ _C140 +"',C141 = '"+ _C141 +"',C141X = '"+ _C141X +"',C142a = '"+ _C142a +"',C142b = '"+ _C142b +"',C142c = '"+ _C142c +"',C142d = '"+ _C142d +"',C142e = '"+ _C142e +"',C142f = '"+ _C142f +"',C142g = '"+ _C142g +"'  Where Rnd='"+ _Rnd +"' and SuchanaID='"+ _SuchanaID +"'";
            C.Save(SQL);
        }
        catch(Exception  e)
        {
            response = e.getMessage();
        }
        return response;
    }


    public List<FdHabit_DataModel> SelectAll(Context context, String SQL)
    {
        Connection C = new Connection(context);
        List<FdHabit_DataModel> data = new ArrayList<FdHabit_DataModel>();
        FdHabit_DataModel d = new FdHabit_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while(!cur.isAfterLast())
        {
            d = new FdHabit_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._C11 = cur.getString(cur.getColumnIndex("C11"));
            d._C12 = cur.getString(cur.getColumnIndex("C12"));
            d._C13 = cur.getString(cur.getColumnIndex("C13"));
            d._C14 = cur.getString(cur.getColumnIndex("C14"));
            d._C15 = cur.getString(cur.getColumnIndex("C15"));
            d._C16 = cur.getString(cur.getColumnIndex("C16"));
            d._C17 = cur.getString(cur.getColumnIndex("C17"));
            d._C18 = cur.getString(cur.getColumnIndex("C18"));
            d._C19a = cur.getString(cur.getColumnIndex("C19a"));
            d._C19b = cur.getString(cur.getColumnIndex("C19b"));
            d._C19c = cur.getString(cur.getColumnIndex("C19c"));
            d._C110 = cur.getString(cur.getColumnIndex("C110"));
            d._C111 = cur.getString(cur.getColumnIndex("C111"));
            d._C112 = cur.getString(cur.getColumnIndex("C112"));
            d._C113 = cur.getString(cur.getColumnIndex("C113"));
            d._C114d = cur.getString(cur.getColumnIndex("C114d"));
            d._C114m = cur.getString(cur.getColumnIndex("C114m"));
            d._C115 = cur.getString(cur.getColumnIndex("C115"));
            d._C116 = cur.getString(cur.getColumnIndex("C116"));
            d._C117a = cur.getString(cur.getColumnIndex("C117a"));
            d._C117b = cur.getString(cur.getColumnIndex("C117b"));
            d._C117c = cur.getString(cur.getColumnIndex("C117c"));
            d._C117d = cur.getString(cur.getColumnIndex("C117d"));
            d._C117e = cur.getString(cur.getColumnIndex("C117e"));
            d._C117eX = cur.getString(cur.getColumnIndex("C117eX"));
            d._C117f = cur.getString(cur.getColumnIndex("C117f"));
            d._C118d = cur.getString(cur.getColumnIndex("C118d"));
            d._C118m = cur.getString(cur.getColumnIndex("C118m"));
            d._C119 = cur.getString(cur.getColumnIndex("C119"));
            d._C120 = cur.getString(cur.getColumnIndex("C120"));
            d._C121a = cur.getString(cur.getColumnIndex("C121a"));
            d._C121b = cur.getString(cur.getColumnIndex("C121b"));
            d._C121b1 = cur.getString(cur.getColumnIndex("C121b1"));
            d._C121c = cur.getString(cur.getColumnIndex("C121c"));
            d._C121c1 = cur.getString(cur.getColumnIndex("C121c1"));
            d._C121d = cur.getString(cur.getColumnIndex("C121d"));
            d._C121e = cur.getString(cur.getColumnIndex("C121e"));
            d._C121f = cur.getString(cur.getColumnIndex("C121f"));
            d._C121f1 = cur.getString(cur.getColumnIndex("C121f1"));
            d._C121g = cur.getString(cur.getColumnIndex("C121g"));
            d._C121h = cur.getString(cur.getColumnIndex("C121h"));
            d._C121i = cur.getString(cur.getColumnIndex("C121i"));
            d._C121iX = cur.getString(cur.getColumnIndex("C121iX"));
            d._C122 = cur.getString(cur.getColumnIndex("C122"));
            d._C123 = cur.getString(cur.getColumnIndex("C123"));
            d._C124 = cur.getString(cur.getColumnIndex("C124"));
            d._C125 = cur.getString(cur.getColumnIndex("C125"));
            d._C126a = cur.getString(cur.getColumnIndex("C126a"));
            d._C126b = cur.getString(cur.getColumnIndex("C126b"));
            d._C126c = cur.getString(cur.getColumnIndex("C126c"));
            d._C126d = cur.getString(cur.getColumnIndex("C126d"));
            d._C126e = cur.getString(cur.getColumnIndex("C126e"));
            d._C126f = cur.getString(cur.getColumnIndex("C126f"));
            d._C126g = cur.getString(cur.getColumnIndex("C126g"));
            d._C126h = cur.getString(cur.getColumnIndex("C126h"));
            d._C126i = cur.getString(cur.getColumnIndex("C126i"));
            d._C126j = cur.getString(cur.getColumnIndex("C126j"));
            d._C126k = cur.getString(cur.getColumnIndex("C126k"));
            d._C126l = cur.getString(cur.getColumnIndex("C126l"));
            d._C126m = cur.getString(cur.getColumnIndex("C126m"));
            d._C126n = cur.getString(cur.getColumnIndex("C126n"));
            d._C126o = cur.getString(cur.getColumnIndex("C126o"));
            d._C126q = cur.getString(cur.getColumnIndex("C126q"));
            d._C126r = cur.getString(cur.getColumnIndex("C126r"));
            d._C129 = cur.getString(cur.getColumnIndex("C129"));
            d._C130 = cur.getString(cur.getColumnIndex("C130"));
            d._C131 = cur.getString(cur.getColumnIndex("C131"));
            d._C134 = cur.getString(cur.getColumnIndex("C134"));
            d._C135a = cur.getString(cur.getColumnIndex("C135a"));
            d._C135b = cur.getString(cur.getColumnIndex("C135b"));
            d._C135c = cur.getString(cur.getColumnIndex("C135c"));
            d._C135d = cur.getString(cur.getColumnIndex("C135d"));
            d._C135e = cur.getString(cur.getColumnIndex("C135e"));
            d._C135eX = cur.getString(cur.getColumnIndex("C135eX"));
            d._C136 = cur.getString(cur.getColumnIndex("C136"));
            d._C137a = cur.getString(cur.getColumnIndex("C137a"));
            d._C137b = cur.getString(cur.getColumnIndex("C137b"));
            d._C137c = cur.getString(cur.getColumnIndex("C137c"));
            d._C137d = cur.getString(cur.getColumnIndex("C137d"));
            d._C137e = cur.getString(cur.getColumnIndex("C137e"));
            d._C137f = cur.getString(cur.getColumnIndex("C137f"));
            d._C137g = cur.getString(cur.getColumnIndex("C137g"));
            d._C137h = cur.getString(cur.getColumnIndex("C137h"));
            d._C137i = cur.getString(cur.getColumnIndex("C137i"));
            d._C137j = cur.getString(cur.getColumnIndex("C137j"));
            d._C137k = cur.getString(cur.getColumnIndex("C137k"));
            d._C137l = cur.getString(cur.getColumnIndex("C137l"));
            d._C137m = cur.getString(cur.getColumnIndex("C137m"));
            d._C137mX = cur.getString(cur.getColumnIndex("C137mX"));
            d._C138 = cur.getString(cur.getColumnIndex("C138"));
            d._C139 = cur.getString(cur.getColumnIndex("C139"));
            d._BCG1 = cur.getString(cur.getColumnIndex("BCG1"));
            d._BCG2 = cur.getString(cur.getColumnIndex("BCG2"));
            d._Penta1 = cur.getString(cur.getColumnIndex("Penta1"));
            d._Penta2 = cur.getString(cur.getColumnIndex("Penta2"));
            d._Penta3 = cur.getString(cur.getColumnIndex("Penta3"));
            d._OPV1 = cur.getString(cur.getColumnIndex("OPV1"));
            d._OPV2 = cur.getString(cur.getColumnIndex("OPV2"));
            d._OPV3 = cur.getString(cur.getColumnIndex("OPV3"));
            d._PCV1 = cur.getString(cur.getColumnIndex("PCV1"));
            d._PCV2 = cur.getString(cur.getColumnIndex("PCV2"));
            d._PCV3 = cur.getString(cur.getColumnIndex("PCV3"));
            d._IPV = cur.getString(cur.getColumnIndex("IPV"));
            d._MR1 = cur.getString(cur.getColumnIndex("MR1"));
            d._MR2 = cur.getString(cur.getColumnIndex("MR2"));
            d._C140 = cur.getString(cur.getColumnIndex("C140"));
            d._C141 = cur.getString(cur.getColumnIndex("C141"));
            d._C141X = cur.getString(cur.getColumnIndex("C141X"));
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