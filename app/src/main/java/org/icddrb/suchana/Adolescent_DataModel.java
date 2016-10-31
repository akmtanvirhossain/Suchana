package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;
import Common.Connection;
import java.util.ArrayList;
import java.util.List;
public class Adolescent_DataModel{
    String TableName = "Adolescent";
    Connection C;
    String _distName = "";
    String _upzName = "";
    String _unName = "";
    String _villName = "";
    private String _Rnd = "";

    public String getRnd(){
        return _Rnd;
    }
    public void setRnd(String newValue){
        _Rnd = newValue;
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
    private String _HHNo = "";
    public String getHHNo(){
        return _HHNo;
    }
    public void setHHNo(String newValue){
        _HHNo = newValue;
    }
    private String _SuchanaID = "";
    public String getSuchanaID(){
        return _SuchanaID;
    }
    public void setSuchanaID(String newValue){
        _SuchanaID = newValue;
    }
    private String _MobNo = "";
    public String getMobNo(){
        return _MobNo;
    }
    public void setMobNo(String newValue){
        _MobNo = newValue;
    }
    private String _ResName = "";
    public String getResName(){
        return _ResName;
    }
    public void setResName(String newValue){
        _ResName = newValue;
    }
    private String _HedName = "";
    public String getHedName(){
        return _HedName;
    }
    public void setHedName(String newValue){
        _HedName = newValue;
    }
    private String _VDate = "";
    public String getVDate(){
        return _VDate;
    }
    public void setVDate(String newValue){
        _VDate = newValue;
    }
    private String _Result = "";
    public String getResult(){
        return _Result;
    }
    public void setResult(String newValue){
        _Result = newValue;
    }
    private String _ResultX = "";
    public String getResultX(){
        return _ResultX;
    }
    public void setResultX(String newValue){
        _ResultX = newValue;
    }
    private String _Q11 = "";
    public String getQ11(){
        return _Q11;
    }
    public void setQ11(String newValue){
        _Q11 = newValue;
    }
    private String _Q12Y = "";
    public String getQ12Y(){
        return _Q12Y;
    }
    public void setQ12Y(String newValue){
        _Q12Y = newValue;
    }
    private String _Q12M = "";
    public String getQ12M(){
        return _Q12M;
    }
    public void setQ12M(String newValue){
        _Q12M = newValue;
    }
    private String _Q13 = "";
    public String getQ13(){
        return _Q13;
    }
    public void setQ13(String newValue){
        _Q13 = newValue;
    }
    private String _Q14 = "";
    public String getQ14(){
        return _Q14;
    }
    public void setQ14(String newValue){
        _Q14 = newValue;
    }
    private String _Q14X = "";
    public String getQ14X(){
        return _Q14X;
    }
    public void setQ14X(String newValue){
        _Q14X = newValue;
    }
    private String _Q15 = "";
    public String getQ15(){
        return _Q15;
    }
    public void setQ15(String newValue){
        _Q15 = newValue;
    }
    private String _Q16 = "";
    public String getQ16(){
        return _Q16;
    }
    public void setQ16(String newValue){
        _Q16 = newValue;
    }
    private String _Q17 = "";
    public String getQ17(){
        return _Q17;
    }
    public void setQ17(String newValue){
        _Q17 = newValue;
    }
    private String _Q18 = "";
    public String getQ18(){
        return _Q18;
    }
    public void setQ18(String newValue){
        _Q18 = newValue;
    }
    private String _Q18X = "";
    public String getQ18X(){
        return _Q18X;
    }
    public void setQ18X(String newValue){
        _Q18X = newValue;
    }
    private String _Q19 = "";
    public String getQ19(){
        return _Q19;
    }
    public void setQ19(String newValue){
        _Q19 = newValue;
    }
    private String _Q19X = "";
    public String getQ19X(){
        return _Q19X;
    }
    public void setQ19X(String newValue){
        _Q19X = newValue;
    }
    private String _Q110 = "";
    public String getQ110(){
        return _Q110;
    }
    public void setQ110(String newValue){
        _Q110 = newValue;
    }
    private String _Q111 = "";
    public String getQ111(){
        return _Q111;
    }
    public void setQ111(String newValue){
        _Q111 = newValue;
    }
    private String _Q112 = "";
    public String getQ112(){
        return _Q112;
    }
    public void setQ112(String newValue){
        _Q112 = newValue;
    }
    private String _Q211a = "";
    public String getQ211a(){
        return _Q211a;
    }
    public void setQ211a(String newValue){
        _Q211a = newValue;
    }
    private String _Q211b = "";
    public String getQ211b(){
        return _Q211b;
    }
    public void setQ211b(String newValue){
        _Q211b = newValue;
    }
    private String _Q211c = "";
    public String getQ211c(){
        return _Q211c;
    }
    public void setQ211c(String newValue){
        _Q211c = newValue;
    }
    private String _Q211d = "";
    public String getQ211d(){
        return _Q211d;
    }
    public void setQ211d(String newValue){
        _Q211d = newValue;
    }
    private String _Q211e = "";
    public String getQ211e(){
        return _Q211e;
    }
    public void setQ211e(String newValue){
        _Q211e = newValue;
    }
    private String _Q211f = "";
    public String getQ211f(){
        return _Q211f;
    }
    public void setQ211f(String newValue){
        _Q211f = newValue;
    }
    private String _Q211g = "";
    public String getQ211g(){
        return _Q211g;
    }
    public void setQ211g(String newValue){
        _Q211g = newValue;
    }
    private String _Q211h = "";
    public String getQ211h(){
        return _Q211h;
    }
    public void setQ211h(String newValue){
        _Q211h = newValue;
    }
    private String _Q211i = "";
    public String getQ211i(){
        return _Q211i;
    }
    public void setQ211i(String newValue){
        _Q211i = newValue;
    }
    private String _Q211j = "";
    public String getQ211j(){
        return _Q211j;
    }
    public void setQ211j(String newValue){
        _Q211j = newValue;
    }
    private String _Q211k = "";
    public String getQ211k(){
        return _Q211k;
    }
    public void setQ211k(String newValue){
        _Q211k = newValue;
    }
    private String _Q211l = "";
    public String getQ211l(){
        return _Q211l;
    }
    public void setQ211l(String newValue){
        _Q211l = newValue;
    }
    private String _Q211m = "";
    public String getQ211m(){
        return _Q211m;
    }
    public void setQ211m(String newValue){
        _Q211m = newValue;
    }
    private String _Q211X = "";
    public String getQ211X(){
        return _Q211X;
    }
    public void setQ211X(String newValue){
        _Q211X = newValue;
    }
    private String _Q211X1 = "";
    public String getQ211X1(){
        return _Q211X1;
    }
    public void setQ211X1(String newValue){
        _Q211X1 = newValue;
    }
    private String _Q211n = "";
    public String getQ211n(){
        return _Q211n;
    }
    public void setQ211n(String newValue){
        _Q211n = newValue;
    }
    private String _Q212 = "";
    public String getQ212(){
        return _Q212;
    }
    public void setQ212(String newValue){
        _Q212 = newValue;
    }
    private String _Q213 = "";
    public String getQ213(){
        return _Q213;
    }
    public void setQ213(String newValue){
        _Q213 = newValue;
    }
    private String _Q214a = "";
    public String getQ214a(){
        return _Q214a;
    }
    public void setQ214a(String newValue){
        _Q214a = newValue;
    }
    private String _Q214b = "";
    public String getQ214b(){
        return _Q214b;
    }
    public void setQ214b(String newValue){
        _Q214b = newValue;
    }
    private String _Q214c = "";
    public String getQ214c(){
        return _Q214c;
    }
    public void setQ214c(String newValue){
        _Q214c = newValue;
    }
    private String _Q214d = "";
    public String getQ214d(){
        return _Q214d;
    }
    public void setQ214d(String newValue){
        _Q214d = newValue;
    }
    private String _Q214e = "";
    public String getQ214e(){
        return _Q214e;
    }
    public void setQ214e(String newValue){
        _Q214e = newValue;
    }
    private String _Q214f = "";
    public String getQ214f(){
        return _Q214f;
    }
    public void setQ214f(String newValue){
        _Q214f = newValue;
    }
    private String _Q214g = "";
    public String getQ214g(){
        return _Q214g;
    }
    public void setQ214g(String newValue){
        _Q214g = newValue;
    }
    private String _Q214h = "";
    public String getQ214h(){
        return _Q214h;
    }
    public void setQ214h(String newValue){
        _Q214h = newValue;
    }
    private String _Q214X = "";
    public String getQ214X(){
        return _Q214X;
    }
    public void setQ214X(String newValue){
        _Q214X = newValue;
    }
    private String _Q214X1 = "";
    public String getQ214X1(){
        return _Q214X1;
    }
    public void setQ214X1(String newValue){
        _Q214X1 = newValue;
    }
    private String _Q214i = "";
    public String getQ214i(){
        return _Q214i;
    }
    public void setQ214i(String newValue){
        _Q214i = newValue;
    }
    private String _Q215a = "";
    public String getQ215a(){
        return _Q215a;
    }
    public void setQ215a(String newValue){
        _Q215a = newValue;
    }
    private String _Q215b = "";
    public String getQ215b(){
        return _Q215b;
    }
    public void setQ215b(String newValue){
        _Q215b = newValue;
    }
    private String _Q215c = "";
    public String getQ215c(){
        return _Q215c;
    }
    public void setQ215c(String newValue){
        _Q215c = newValue;
    }
    private String _Q215d = "";
    public String getQ215d(){
        return _Q215d;
    }
    public void setQ215d(String newValue){
        _Q215d = newValue;
    }
    private String _Q215e = "";
    public String getQ215e(){
        return _Q215e;
    }
    public void setQ215e(String newValue){
        _Q215e = newValue;
    }
    private String _Q215f = "";
    public String getQ215f(){
        return _Q215f;
    }
    public void setQ215f(String newValue){
        _Q215f = newValue;
    }
    private String _Q215g = "";
    public String getQ215g(){
        return _Q215g;
    }
    public void setQ215g(String newValue){
        _Q215g = newValue;
    }
    private String _Q215X = "";
    public String getQ215X(){
        return _Q215X;
    }
    public void setQ215X(String newValue){
        _Q215X = newValue;
    }
    private String _Q215X1 = "";
    public String getQ215X1(){
        return _Q215X1;
    }
    public void setQ215X1(String newValue){
        _Q215X1 = newValue;
    }
    private String _Q215h = "";
    public String getQ215h(){
        return _Q215h;
    }
    public void setQ215h(String newValue){
        _Q215h = newValue;
    }
    private String _Q221 = "";
    public String getQ221(){
        return _Q221;
    }
    public void setQ221(String newValue){
        _Q221 = newValue;
    }
    private String _Q222 = "";
    public String getQ222(){
        return _Q222;
    }
    public void setQ222(String newValue){
        _Q222 = newValue;
    }
    private String _Q223 = "";
    public String getQ223(){
        return _Q223;
    }
    public void setQ223(String newValue){
        _Q223 = newValue;
    }
    private String _Q224 = "";
    public String getQ224(){
        return _Q224;
    }
    public void setQ224(String newValue){
        _Q224 = newValue;
    }
    private String _Q225 = "";
    public String getQ225(){
        return _Q225;
    }
    public void setQ225(String newValue){
        _Q225 = newValue;
    }
    private String _Q31 = "";
    public String getQ31(){
        return _Q31;
    }
    public void setQ31(String newValue){
        _Q31 = newValue;
    }
    private String _Q32 = "";
    public String getQ32(){
        return _Q32;
    }
    public void setQ32(String newValue){
        _Q32 = newValue;
    }
    private String _Q33 = "";
    public String getQ33(){
        return _Q33;
    }
    public void setQ33(String newValue){
        _Q33 = newValue;
    }
    private String _Q34 = "";
    public String getQ34(){
        return _Q34;
    }
    public void setQ34(String newValue){
        _Q34 = newValue;
    }
    private String _Q35 = "";
    public String getQ35(){
        return _Q35;
    }
    public void setQ35(String newValue){
        _Q35 = newValue;
    }
    private String _Q36 = "";
    public String getQ36(){
        return _Q36;
    }
    public void setQ36(String newValue){
        _Q36 = newValue;
    }
    private String _Q37 = "";
    public String getQ37(){
        return _Q37;
    }
    public void setQ37(String newValue){
        _Q37 = newValue;
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
    public String getUpload() {
        return _Upload;
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
            SQL = "Insert into "+ TableName +" (Rnd,Dist,Upz,Un,Vill,HHNo,SuchanaID,MobNo,ResName,HedName,VDate,Result,ResultX,Q11,Q12Y,Q12M,Q13,Q14,Q14X,Q15,Q16,Q17,Q18,Q18X,Q19,Q19X,Q110,Q111,Q112,Q211a,Q211b,Q211c,Q211d,Q211e,Q211f,Q211g,Q211h,Q211i,Q211j,Q211k,Q211l,Q211m,Q211X,Q211X1,Q211n,Q212,Q213,Q214a,Q214b,Q214c,Q214d,Q214e,Q214f,Q214g,Q214h,Q214X,Q214X1,Q214i,Q215a,Q215b,Q215c,Q215d,Q215e,Q215f,Q215g,Q215X,Q215X1,Q215h,Q221,Q222,Q223,Q224,Q225,Q31,Q32,Q33,Q34,Q35,Q36,Q37,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('"+ _Rnd +"', '"+ _Dist +"', '"+ _Upz +"', '"+ _Un +"', '"+ _Vill +"', '"+ _HHNo +"', '"+ _SuchanaID +"', '"+ _MobNo +"', '"+ _ResName +"', '"+ _HedName +"', '"+ _VDate +"', '"+ _Result +"', '"+ _ResultX +"', '"+ _Q11 +"', '"+ _Q12Y +"', '"+ _Q12M +"', '"+ _Q13 +"', '"+ _Q14 +"', '"+ _Q14X +"', '"+ _Q15 +"', '"+ _Q16 +"', '"+ _Q17 +"', '"+ _Q18 +"', '"+ _Q18X +"', '"+ _Q19 +"', '"+ _Q19X +"', '"+ _Q110 +"', '"+ _Q111 +"', '"+ _Q112 +"', '"+ _Q211a +"', '"+ _Q211b +"', '"+ _Q211c +"', '"+ _Q211d +"', '"+ _Q211e +"', '"+ _Q211f +"', '"+ _Q211g +"', '"+ _Q211h +"', '"+ _Q211i +"', '"+ _Q211j +"', '"+ _Q211k +"', '"+ _Q211l +"', '"+ _Q211m +"', '"+ _Q211X +"', '"+ _Q211X1 +"', '"+ _Q211n +"', '"+ _Q212 +"', '"+ _Q213 +"', '"+ _Q214a +"', '"+ _Q214b +"', '"+ _Q214c +"', '"+ _Q214d +"', '"+ _Q214e +"', '"+ _Q214f +"', '"+ _Q214g +"', '"+ _Q214h +"', '"+ _Q214X +"', '"+ _Q214X1 +"', '"+ _Q214i +"', '"+ _Q215a +"', '"+ _Q215b +"', '"+ _Q215c +"', '"+ _Q215d +"', '"+ _Q215e +"', '"+ _Q215f +"', '"+ _Q215g +"', '"+ _Q215X +"', '"+ _Q215X1 +"', '"+ _Q215h +"', '"+ _Q221 +"', '"+ _Q222 +"', '"+ _Q223 +"', '"+ _Q224 +"', '"+ _Q225 +"', '"+ _Q31 +"', '"+ _Q32 +"', '"+ _Q33 +"', '"+ _Q34 +"', '"+ _Q35 +"', '"+ _Q36 +"', '"+ _Q37 +"', '"+ _StartTime +"', '"+ _EndTime +"', '"+ _UserId +"', '"+ _EntryUser +"', '"+ _Lat +"', '"+ _Lon +"', '"+ _EnDt +"', '"+ _Upload +"')";
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
            SQL = "Update "+ TableName +" Set Upload='2',Rnd = '"+ _Rnd +"',Dist = '"+ _Dist +"',Upz = '"+ _Upz +"',Un = '"+ _Un +"',Vill = '"+ _Vill +"',HHNo = '"+ _HHNo +"',SuchanaID = '"+ _SuchanaID +"',MobNo = '"+ _MobNo +"',ResName = '"+ _ResName +"',HedName = '"+ _HedName +"',VDate = '"+ _VDate +"',Result = '"+ _Result +"',ResultX = '"+ _ResultX +"',Q11 = '"+ _Q11 +"',Q12Y = '"+ _Q12Y +"',Q12M = '"+ _Q12M +"',Q13 = '"+ _Q13 +"',Q14 = '"+ _Q14 +"',Q14X = '"+ _Q14X +"',Q15 = '"+ _Q15 +"',Q16 = '"+ _Q16 +"',Q17 = '"+ _Q17 +"',Q18 = '"+ _Q18 +"',Q18X = '"+ _Q18X +"',Q19 = '"+ _Q19 +"',Q19X = '"+ _Q19X +"',Q110 = '"+ _Q110 +"',Q111 = '"+ _Q111 +"',Q112 = '"+ _Q112 +"',Q211a = '"+ _Q211a +"',Q211b = '"+ _Q211b +"',Q211c = '"+ _Q211c +"',Q211d = '"+ _Q211d +"',Q211e = '"+ _Q211e +"',Q211f = '"+ _Q211f +"',Q211g = '"+ _Q211g +"',Q211h = '"+ _Q211h +"',Q211i = '"+ _Q211i +"',Q211j = '"+ _Q211j +"',Q211k = '"+ _Q211k +"',Q211l = '"+ _Q211l +"',Q211m = '"+ _Q211m +"',Q211X = '"+ _Q211X +"',Q211X1 = '"+ _Q211X1 +"',Q211n = '"+ _Q211n +"',Q212 = '"+ _Q212 +"',Q213 = '"+ _Q213 +"',Q214a = '"+ _Q214a +"',Q214b = '"+ _Q214b +"',Q214c = '"+ _Q214c +"',Q214d = '"+ _Q214d +"',Q214e = '"+ _Q214e +"',Q214f = '"+ _Q214f +"',Q214g = '"+ _Q214g +"',Q214h = '"+ _Q214h +"',Q214X = '"+ _Q214X +"',Q214X1 = '"+ _Q214X1 +"',Q214i = '"+ _Q214i +"',Q215a = '"+ _Q215a +"',Q215b = '"+ _Q215b +"',Q215c = '"+ _Q215c +"',Q215d = '"+ _Q215d +"',Q215e = '"+ _Q215e +"',Q215f = '"+ _Q215f +"',Q215g = '"+ _Q215g +"',Q215X = '"+ _Q215X +"',Q215X1 = '"+ _Q215X1 +"',Q215h = '"+ _Q215h +"',Q221 = '"+ _Q221 +"',Q222 = '"+ _Q222 +"',Q223 = '"+ _Q223 +"',Q224 = '"+ _Q224 +"',Q225 = '"+ _Q225 +"',Q31 = '"+ _Q31 +"',Q32 = '"+ _Q32 +"',Q33 = '"+ _Q33 +"',Q34 = '"+ _Q34 +"',Q35 = '"+ _Q35 +"',Q36 = '"+ _Q36 +"',Q37 = '"+ _Q37 +"'  Where Rnd='"+ _Rnd +"' and SuchanaID='"+ _SuchanaID +"'";
            C.Save(SQL);
        }
        catch(Exception  e)
        {
            response = e.getMessage();
        }
        return response;
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

    public List<Adolescent_DataModel> SelectAll(Context context, String SQL)
    {
        Connection C = new Connection(context);
        List<Adolescent_DataModel> data = new ArrayList<Adolescent_DataModel>();
        Adolescent_DataModel d = new Adolescent_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while(!cur.isAfterLast())
        {
            d = new Adolescent_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._Dist = cur.getString(cur.getColumnIndex("Dist"));
            d._Upz = cur.getString(cur.getColumnIndex("Upz"));
            d._Un = cur.getString(cur.getColumnIndex("Un"));
            d._Vill = cur.getString(cur.getColumnIndex("Vill"));
            d._HHNo = cur.getString(cur.getColumnIndex("HHNo"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._MobNo = cur.getString(cur.getColumnIndex("MobNo"));
            d._ResName = cur.getString(cur.getColumnIndex("ResName"));
            d._HedName = cur.getString(cur.getColumnIndex("HedName"));
            d._VDate = cur.getString(cur.getColumnIndex("VDate"));
            d._Result = cur.getString(cur.getColumnIndex("Result"));
            d._ResultX = cur.getString(cur.getColumnIndex("ResultX"));
            d._Q11 = cur.getString(cur.getColumnIndex("Q11"));
            d._Q12Y = cur.getString(cur.getColumnIndex("Q12Y"));
            d._Q12M = cur.getString(cur.getColumnIndex("Q12M"));
            d._Q13 = cur.getString(cur.getColumnIndex("Q13"));
            d._Q14 = cur.getString(cur.getColumnIndex("Q14"));
            d._Q14X = cur.getString(cur.getColumnIndex("Q14X"));
            d._Q15 = cur.getString(cur.getColumnIndex("Q15"));
            d._Q16 = cur.getString(cur.getColumnIndex("Q16"));
            d._Q17 = cur.getString(cur.getColumnIndex("Q17"));
            d._Q18 = cur.getString(cur.getColumnIndex("Q18"));
            d._Q18X = cur.getString(cur.getColumnIndex("Q18X"));
            d._Q19 = cur.getString(cur.getColumnIndex("Q19"));
            d._Q19X = cur.getString(cur.getColumnIndex("Q19X"));
            d._Q110 = cur.getString(cur.getColumnIndex("Q110"));
            d._Q111 = cur.getString(cur.getColumnIndex("Q111"));
            d._Q112 = cur.getString(cur.getColumnIndex("Q112"));
            d._Q211a = cur.getString(cur.getColumnIndex("Q211a"));
            d._Q211b = cur.getString(cur.getColumnIndex("Q211b"));
            d._Q211c = cur.getString(cur.getColumnIndex("Q211c"));
            d._Q211d = cur.getString(cur.getColumnIndex("Q211d"));
            d._Q211e = cur.getString(cur.getColumnIndex("Q211e"));
            d._Q211f = cur.getString(cur.getColumnIndex("Q211f"));
            d._Q211g = cur.getString(cur.getColumnIndex("Q211g"));
            d._Q211h = cur.getString(cur.getColumnIndex("Q211h"));
            d._Q211i = cur.getString(cur.getColumnIndex("Q211i"));
            d._Q211j = cur.getString(cur.getColumnIndex("Q211j"));
            d._Q211k = cur.getString(cur.getColumnIndex("Q211k"));
            d._Q211l = cur.getString(cur.getColumnIndex("Q211l"));
            d._Q211m = cur.getString(cur.getColumnIndex("Q211m"));
            d._Q211X = cur.getString(cur.getColumnIndex("Q211X"));
            d._Q211X1 = cur.getString(cur.getColumnIndex("Q211X1"));
            d._Q211n = cur.getString(cur.getColumnIndex("Q211n"));
            d._Q212 = cur.getString(cur.getColumnIndex("Q212"));
            d._Q213 = cur.getString(cur.getColumnIndex("Q213"));
            d._Q214a = cur.getString(cur.getColumnIndex("Q214a"));
            d._Q214b = cur.getString(cur.getColumnIndex("Q214b"));
            d._Q214c = cur.getString(cur.getColumnIndex("Q214c"));
            d._Q214d = cur.getString(cur.getColumnIndex("Q214d"));
            d._Q214e = cur.getString(cur.getColumnIndex("Q214e"));
            d._Q214f = cur.getString(cur.getColumnIndex("Q214f"));
            d._Q214g = cur.getString(cur.getColumnIndex("Q214g"));
            d._Q214h = cur.getString(cur.getColumnIndex("Q214h"));
            d._Q214X = cur.getString(cur.getColumnIndex("Q214X"));
            d._Q214X1 = cur.getString(cur.getColumnIndex("Q214X1"));
            d._Q214i = cur.getString(cur.getColumnIndex("Q214i"));
            d._Q215a = cur.getString(cur.getColumnIndex("Q215a"));
            d._Q215b = cur.getString(cur.getColumnIndex("Q215b"));
            d._Q215c = cur.getString(cur.getColumnIndex("Q215c"));
            d._Q215d = cur.getString(cur.getColumnIndex("Q215d"));
            d._Q215e = cur.getString(cur.getColumnIndex("Q215e"));
            d._Q215f = cur.getString(cur.getColumnIndex("Q215f"));
            d._Q215g = cur.getString(cur.getColumnIndex("Q215g"));
            d._Q215X = cur.getString(cur.getColumnIndex("Q215X"));
            d._Q215X1 = cur.getString(cur.getColumnIndex("Q215X1"));
            d._Q215h = cur.getString(cur.getColumnIndex("Q215h"));
            d._Q221 = cur.getString(cur.getColumnIndex("Q221"));
            d._Q222 = cur.getString(cur.getColumnIndex("Q222"));
            d._Q223 = cur.getString(cur.getColumnIndex("Q223"));
            d._Q224 = cur.getString(cur.getColumnIndex("Q224"));
            d._Q225 = cur.getString(cur.getColumnIndex("Q225"));
            d._Q31 = cur.getString(cur.getColumnIndex("Q31"));
            d._Q32 = cur.getString(cur.getColumnIndex("Q32"));
            d._Q33 = cur.getString(cur.getColumnIndex("Q33"));
            d._Q34 = cur.getString(cur.getColumnIndex("Q34"));
            d._Q35 = cur.getString(cur.getColumnIndex("Q35"));
            d._Q36 = cur.getString(cur.getColumnIndex("Q36"));
            d._Q37 = cur.getString(cur.getColumnIndex("Q37"));
            d._Upload = cur.getString(cur.getColumnIndex("Upload"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }

    public List<Adolescent_DataModel> SelectAllList(Context context, String SQL)
    {
        Connection C = new Connection(context);
        List<Adolescent_DataModel> data = new ArrayList<Adolescent_DataModel>();
        Adolescent_DataModel d = new Adolescent_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while(!cur.isAfterLast())
        {
            d = new Adolescent_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._Dist = cur.getString(cur.getColumnIndex("Dist"));
            d._Upz = cur.getString(cur.getColumnIndex("Upz"));
            d._Un = cur.getString(cur.getColumnIndex("Un"));
            d._Vill = cur.getString(cur.getColumnIndex("Vill"));
            d._HHNo = cur.getString(cur.getColumnIndex("HHNo"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._MobNo = cur.getString(cur.getColumnIndex("MobNo"));
            d._ResName = cur.getString(cur.getColumnIndex("ResName"));
            d._HedName = cur.getString(cur.getColumnIndex("HedName"));
            d._VDate = cur.getString(cur.getColumnIndex("VDate"));
            d._Result = cur.getString(cur.getColumnIndex("Result"));
            d._distName = cur.getString(cur.getColumnIndex("DistName"));
            d._upzName = cur.getString(cur.getColumnIndex("UPZName"));
            d._unName = cur.getString(cur.getColumnIndex("UNName"));
            d._villName = cur.getString(cur.getColumnIndex("VillName"));
            d._Upload = cur.getString(cur.getColumnIndex("Upload"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}