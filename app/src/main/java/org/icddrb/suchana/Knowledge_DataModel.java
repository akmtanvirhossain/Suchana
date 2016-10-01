package org.icddrb.suchana;
import android.content.Context;
import android.database.Cursor;
import Common.Connection;
import java.util.ArrayList;
import java.util.List;
public class Knowledge_DataModel{

    private String _Rnd = "";
    public String getRnd(){
        return _Rnd;
    }
    public void setRnd(String newValue){
        _Rnd = newValue;
    }
    private String _SuchanaId = "";
    public String getSuchanaId(){
        return _SuchanaId;
    }
    public void setSuchanaId(String newValue){
        _SuchanaId = newValue;
    }
    private String _MSLNumber = "";
    public String getMSLNumber(){
        return _MSLNumber;
    }
    public void setMSLNumber(String newValue){
        _MSLNumber = newValue;
    }
    private String _M212 = "";
    public String getM212(){
        return _M212;
    }
    public void setM212(String newValue){
        _M212 = newValue;
    }
    private String _M213a = "";
    public String getM213a(){
        return _M213a;
    }
    public void setM213a(String newValue){
        _M213a = newValue;
    }
    private String _M213b = "";
    public String getM213b(){
        return _M213b;
    }
    public void setM213b(String newValue){
        _M213b = newValue;
    }
    private String _M213c = "";
    public String getM213c(){
        return _M213c;
    }
    public void setM213c(String newValue){
        _M213c = newValue;
    }
    private String _M213x = "";
    public String getM213x(){
        return _M213x;
    }
    public void setM213x(String newValue){
        _M213x = newValue;
    }
    private String _M213x1 = "";
    public String getM213x1(){
        return _M213x1;
    }
    public void setM213x1(String newValue){
        _M213x1 = newValue;
    }
    private String _M214 = "";
    public String getM214(){
        return _M214;
    }
    public void setM214(String newValue){
        _M214 = newValue;
    }
    private String _M215 = "";
    public String getM215(){
        return _M215;
    }
    public void setM215(String newValue){
        _M215 = newValue;
    }
    private String _M216 = "";
    public String getM216(){
        return _M216;
    }
    public void setM216(String newValue){
        _M216 = newValue;
    }
    private String _M217a = "";
    public String getM217a(){
        return _M217a;
    }
    public void setM217a(String newValue){
        _M217a = newValue;
    }
    private String _M217b = "";
    public String getM217b(){
        return _M217b;
    }
    public void setM217b(String newValue){
        _M217b = newValue;
    }
    private String _M217c = "";
    public String getM217c(){
        return _M217c;
    }
    public void setM217c(String newValue){
        _M217c = newValue;
    }
    private String _M217d = "";
    public String getM217d(){
        return _M217d;
    }
    public void setM217d(String newValue){
        _M217d = newValue;
    }
    private String _M217x = "";
    public String getM217x(){
        return _M217x;
    }
    public void setM217x(String newValue){
        _M217x = newValue;
    }
    private String _M217x1 = "";
    public String getM217x1(){
        return _M217x1;
    }
    public void setM217x1(String newValue){
        _M217x1 = newValue;
    }
    private String _M218a = "";
    public String getM218a(){
        return _M218a;
    }
    public void setM218a(String newValue){
        _M218a = newValue;
    }
    private String _M218b = "";
    public String getM218b(){
        return _M218b;
    }
    public void setM218b(String newValue){
        _M218b = newValue;
    }
    private String _M218c = "";
    public String getM218c(){
        return _M218c;
    }
    public void setM218c(String newValue){
        _M218c = newValue;
    }
    private String _M218x = "";
    public String getM218x(){
        return _M218x;
    }
    public void setM218x(String newValue){
        _M218x = newValue;
    }
    private String _M218x1 = "";
    public String getM218x1(){
        return _M218x1;
    }
    public void setM218x1(String newValue){
        _M218x1 = newValue;
    }
    private String _M219a = "";
    public String getM219a(){
        return _M219a;
    }
    public void setM219a(String newValue){
        _M219a = newValue;
    }
    private String _M219b = "";
    public String getM219b(){
        return _M219b;
    }
    public void setM219b(String newValue){
        _M219b = newValue;
    }
    private String _M219c = "";
    public String getM219c(){
        return _M219c;
    }
    public void setM219c(String newValue){
        _M219c = newValue;
    }
    private String _M219d = "";
    public String getM219d(){
        return _M219d;
    }
    public void setM219d(String newValue){
        _M219d = newValue;
    }
    private String _M219e = "";
    public String getM219e(){
        return _M219e;
    }
    public void setM219e(String newValue){
        _M219e = newValue;
    }
    private String _M219f = "";
    public String getM219f(){
        return _M219f;
    }
    public void setM219f(String newValue){
        _M219f = newValue;
    }
    private String _M2110 = "";
    public String getM2110(){
        return _M2110;
    }
    public void setM2110(String newValue){
        _M2110 = newValue;
    }
    private String _M2111a = "";
    public String getM2111a(){
        return _M2111a;
    }
    public void setM2111a(String newValue){
        _M2111a = newValue;
    }
    private String _M2111b = "";
    public String getM2111b(){
        return _M2111b;
    }
    public void setM2111b(String newValue){
        _M2111b = newValue;
    }
    private String _M2111c = "";
    public String getM2111c(){
        return _M2111c;
    }
    public void setM2111c(String newValue){
        _M2111c = newValue;
    }
    private String _M2111d = "";
    public String getM2111d(){
        return _M2111d;
    }
    public void setM2111d(String newValue){
        _M2111d = newValue;
    }
    private String _M2111e = "";
    public String getM2111e(){
        return _M2111e;
    }
    public void setM2111e(String newValue){
        _M2111e = newValue;
    }
    private String _M2111f = "";
    public String getM2111f(){
        return _M2111f;
    }
    public void setM2111f(String newValue){
        _M2111f = newValue;
    }
    private String _M2111g = "";
    public String getM2111g(){
        return _M2111g;
    }
    public void setM2111g(String newValue){
        _M2111g = newValue;
    }
    private String _M2111x = "";
    public String getM2111x(){
        return _M2111x;
    }
    public void setM2111x(String newValue){
        _M2111x = newValue;
    }
    private String _M2111x1 = "";
    public String getM2111x1(){
        return _M2111x1;
    }
    public void setM2111x1(String newValue){
        _M2111x1 = newValue;
    }
    private String _M2112a = "";
    public String getM2112a(){
        return _M2112a;
    }
    public void setM2112a(String newValue){
        _M2112a = newValue;
    }
    private String _M2112b = "";
    public String getM2112b(){
        return _M2112b;
    }
    public void setM2112b(String newValue){
        _M2112b = newValue;
    }
    private String _M2112c = "";
    public String getM2112c(){
        return _M2112c;
    }
    public void setM2112c(String newValue){
        _M2112c = newValue;
    }
    private String _M2112d = "";
    public String getM2112d(){
        return _M2112d;
    }
    public void setM2112d(String newValue){
        _M2112d = newValue;
    }
    private String _M2112e = "";
    public String getM2112e(){
        return _M2112e;
    }
    public void setM2112e(String newValue){
        _M2112e = newValue;
    }
    private String _M2112f = "";
    public String getM2112f(){
        return _M2112f;
    }
    public void setM2112f(String newValue){
        _M2112f = newValue;
    }
    private String _M2112g = "";
    public String getM2112g(){
        return _M2112g;
    }
    public void setM2112g(String newValue){
        _M2112g = newValue;
    }
    private String _M2112x = "";
    public String getM2112x(){
        return _M2112x;
    }
    public void setM2112x(String newValue){
        _M2112x = newValue;
    }
    private String _M2112x1 = "";
    public String getM2112x1(){
        return _M2112x1;
    }
    public void setM2112x1(String newValue){
        _M2112x1 = newValue;
    }
    private String _M2113a = "";
    public String getM2113a(){
        return _M2113a;
    }
    public void setM2113a(String newValue){
        _M2113a = newValue;
    }
    private String _M2113b = "";
    public String getM2113b(){
        return _M2113b;
    }
    public void setM2113b(String newValue){
        _M2113b = newValue;
    }
    private String _M2113c = "";
    public String getM2113c(){
        return _M2113c;
    }
    public void setM2113c(String newValue){
        _M2113c = newValue;
    }
    private String _M2113d = "";
    public String getM2113d(){
        return _M2113d;
    }
    public void setM2113d(String newValue){
        _M2113d = newValue;
    }
    private String _M2113e = "";
    public String getM2113e(){
        return _M2113e;
    }
    public void setM2113e(String newValue){
        _M2113e = newValue;
    }
    private String _M2113f = "";
    public String getM2113f(){
        return _M2113f;
    }
    public void setM2113f(String newValue){
        _M2113f = newValue;
    }
    private String _M2113g = "";
    public String getM2113g(){
        return _M2113g;
    }
    public void setM2113g(String newValue){
        _M2113g = newValue;
    }
    private String _M2113h = "";
    public String getM2113h(){
        return _M2113h;
    }
    public void setM2113h(String newValue){
        _M2113h = newValue;
    }
    private String _M2113i = "";
    public String getM2113i(){
        return _M2113i;
    }
    public void setM2113i(String newValue){
        _M2113i = newValue;
    }
    private String _M2113j = "";
    public String getM2113j(){
        return _M2113j;
    }
    public void setM2113j(String newValue){
        _M2113j = newValue;
    }
    private String _M2113k = "";
    public String getM2113k(){
        return _M2113k;
    }
    public void setM2113k(String newValue){
        _M2113k = newValue;
    }
    private String _M2113l = "";
    public String getM2113l(){
        return _M2113l;
    }
    public void setM2113l(String newValue){
        _M2113l = newValue;
    }
    private String _M2113M = "";
    public String getM2113M(){
        return _M2113M;
    }
    public void setM2113M(String newValue){
        _M2113M = newValue;
    }
    private String _M2113x = "";
    public String getM2113x(){
        return _M2113x;
    }
    public void setM2113x(String newValue){
        _M2113x = newValue;
    }
    private String _M2113x1 = "";
    public String getM2113x1(){
        return _M2113x1;
    }
    public void setM2113x1(String newValue){
        _M2113x1 = newValue;
    }
    private String _M2114 = "";
    public String getM2114(){
        return _M2114;
    }
    public void setM2114(String newValue){
        _M2114 = newValue;
    }
    private String _M2115 = "";
    public String getM2115(){
        return _M2115;
    }
    public void setM2115(String newValue){
        _M2115 = newValue;
    }
    private String _M2116 = "";
    public String getM2116(){
        return _M2116;
    }
    public void setM2116(String newValue){
        _M2116 = newValue;
    }
    private String _M2117 = "";
    public String getM2117(){
        return _M2117;
    }
    public void setM2117(String newValue){
        _M2117 = newValue;
    }
    private String _M221a = "";
    public String getM221a(){
        return _M221a;
    }
    public void setM221a(String newValue){
        _M221a = newValue;
    }
    private String _M221b = "";
    public String getM221b(){
        return _M221b;
    }
    public void setM221b(String newValue){
        _M221b = newValue;
    }
    private String _M221c = "";
    public String getM221c(){
        return _M221c;
    }
    public void setM221c(String newValue){
        _M221c = newValue;
    }
    private String _M221x1 = "";
    public String getM221x1(){
        return _M221x1;
    }
    public void setM221x1(String newValue){
        _M221x1 = newValue;
    }
    private String _M222a = "";
    public String getM222a(){
        return _M222a;
    }
    public void setM222a(String newValue){
        _M222a = newValue;
    }
    private String _M222b = "";
    public String getM222b(){
        return _M222b;
    }
    public void setM222b(String newValue){
        _M222b = newValue;
    }
    private String _M222c = "";
    public String getM222c(){
        return _M222c;
    }
    public void setM222c(String newValue){
        _M222c = newValue;
    }
    private String _M222d = "";
    public String getM222d(){
        return _M222d;
    }
    public void setM222d(String newValue){
        _M222d = newValue;
    }
    private String _M222e = "";
    public String getM222e(){
        return _M222e;
    }
    public void setM222e(String newValue){
        _M222e = newValue;
    }
    private String _M222f = "";
    public String getM222f(){
        return _M222f;
    }
    public void setM222f(String newValue){
        _M222f = newValue;
    }
    private String _M222g = "";
    public String getM222g(){
        return _M222g;
    }
    public void setM222g(String newValue){
        _M222g = newValue;
    }
    private String _M222h = "";
    public String getM222h(){
        return _M222h;
    }
    public void setM222h(String newValue){
        _M222h = newValue;
    }
    private String _M222i = "";
    public String getM222i(){
        return _M222i;
    }
    public void setM222i(String newValue){
        _M222i = newValue;
    }
    private String _M222x = "";
    public String getM222x(){
        return _M222x;
    }
    public void setM222x(String newValue){
        _M222x = newValue;
    }
    private String _M222x1 = "";
    public String getM222x1(){
        return _M222x1;
    }
    public void setM222x1(String newValue){
        _M222x1 = newValue;
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

    String TableName = "Knowledge";

    public String SaveUpdateData(Context context)
    {
        String response = "";
        C = new Connection(context);
        String SQL = "";
        try
        {
            if(C.Existence("Select * from "+ TableName +"  Where Rnd='"+ _Rnd +"' and SuchanaId='"+ _SuchanaId +"' and MSlNo='"+ _MSLNumber +"' "))
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
            SQL = "Insert into "+ TableName +" (Rnd,SuchanaId,MSlNo,M212,M213a,M213b,M213c,M213x,M213x1,M214,M215,M216,M217a,M217b,M217c,M217d,M217x,M217x1,M218a,M218b,M218c,M218x,M218x1,M219a,M219b,M219c,M219d,M219e,M219f,M2110,M2111a,M2111b,M2111c,M2111d,M2111e,M2111f,M2111g,M2111x,M2111x1,M2112a,M2112b,M2112c,M2112d,M2112e,M2112f,M2112g,M2112x,M2112x1,M2113a,M2113b,M2113c,M2113d,M2113e,M2113f,M2113g,M2113h,M2113i,M2113j,M2113k,M2113l,M2113M,M2113x,M2113x1,M2114,M2115,M2116,M2117,M221a,M221b,M221c,M221x1,M222a,M222b,M222c,M222d,M222e,M222f,M222g,M222h,M222i,M222x,M222x1,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('"+ _Rnd +"', '"+ _SuchanaId +"', '"+ _MSLNumber +"', '"+ _M212 +"', '"+ _M213a +"', '"+ _M213b +"', '"+ _M213c +"', '"+ _M213x +"', '"+ _M213x1 +"', '"+ _M214 +"', '"+ _M215 +"', '"+ _M216 +"', '"+ _M217a +"', '"+ _M217b +"', '"+ _M217c +"', '"+ _M217d +"', '"+ _M217x +"', '"+ _M217x1 +"', '"+ _M218a +"', '"+ _M218b +"', '"+ _M218c +"', '"+ _M218x +"', '"+ _M218x1 +"', '"+ _M219a +"', '"+ _M219b +"', '"+ _M219c +"', '"+ _M219d +"', '"+ _M219e +"', '"+ _M219f +"', '"+ _M2110 +"', '"+ _M2111a +"', '"+ _M2111b +"', '"+ _M2111c +"', '"+ _M2111d +"', '"+ _M2111e +"', '"+ _M2111f +"', '"+ _M2111g +"', '"+ _M2111x +"', '"+ _M2111x1 +"', '"+ _M2112a +"', '"+ _M2112b +"', '"+ _M2112c +"', '"+ _M2112d +"', '"+ _M2112e +"', '"+ _M2112f +"', '"+ _M2112g +"', '"+ _M2112x +"', '"+ _M2112x1 +"', '"+ _M2113a +"', '"+ _M2113b +"', '"+ _M2113c +"', '"+ _M2113d +"', '"+ _M2113e +"', '"+ _M2113f +"', '"+ _M2113g +"', '"+ _M2113h +"', '"+ _M2113i +"', '"+ _M2113j +"', '"+ _M2113k +"', '"+ _M2113l +"', '"+ _M2113M +"', '"+ _M2113x +"', '"+ _M2113x1 +"', '"+ _M2114 +"', '"+ _M2115 +"', '"+ _M2116 +"', '"+ _M2117 +"', '"+ _M221a +"', '"+ _M221b +"', '"+ _M221c +"', '"+ _M221x1 +"', '"+ _M222a +"', '"+ _M222b +"', '"+ _M222c +"', '"+ _M222d +"', '"+ _M222e +"', '"+ _M222f +"', '"+ _M222g +"', '"+ _M222h +"', '"+ _M222i +"', '"+ _M222x +"', '"+ _M222x1 +"', '"+ _StartTime +"', '"+ _EndTime +"', '"+ _UserId +"', '"+ _EntryUser +"', '"+ _Lat +"', '"+ _Lon +"', '"+ _EnDt +"', '"+ _Upload +"')";
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
            SQL = "Update "+ TableName +" Set Upload='2',Rnd = '"+ _Rnd +"',SuchanaId = '"+ _SuchanaId +"',MSlNo = '"+ _MSLNumber +"',M212 = '"+ _M212 +"',M213a = '"+ _M213a +"',M213b = '"+ _M213b +"',M213c = '"+ _M213c +"',M213x = '"+ _M213x +"',M213x1 = '"+ _M213x1 +"',M214 = '"+ _M214 +"',M215 = '"+ _M215 +"',M216 = '"+ _M216 +"',M217a = '"+ _M217a +"',M217b = '"+ _M217b +"',M217c = '"+ _M217c +"',M217d = '"+ _M217d +"',M217x = '"+ _M217x +"',M217x1 = '"+ _M217x1 +"',M218a = '"+ _M218a +"',M218b = '"+ _M218b +"',M218c = '"+ _M218c +"',M218x = '"+ _M218x +"',M218x1 = '"+ _M218x1 +"',M219a = '"+ _M219a +"',M219b = '"+ _M219b +"',M219c = '"+ _M219c +"',M219d = '"+ _M219d +"',M219e = '"+ _M219e +"',M219f = '"+ _M219f +"',M2110 = '"+ _M2110 +"',M2111a = '"+ _M2111a +"',M2111b = '"+ _M2111b +"',M2111c = '"+ _M2111c +"',M2111d = '"+ _M2111d +"',M2111e = '"+ _M2111e +"',M2111f = '"+ _M2111f +"',M2111g = '"+ _M2111g +"',M2111x = '"+ _M2111x +"',M2111x1 = '"+ _M2111x1 +"',M2112a = '"+ _M2112a +"',M2112b = '"+ _M2112b +"',M2112c = '"+ _M2112c +"',M2112d = '"+ _M2112d +"',M2112e = '"+ _M2112e +"',M2112f = '"+ _M2112f +"',M2112g = '"+ _M2112g +"',M2112x = '"+ _M2112x +"',M2112x1 = '"+ _M2112x1 +"',M2113a = '"+ _M2113a +"',M2113b = '"+ _M2113b +"',M2113c = '"+ _M2113c +"',M2113d = '"+ _M2113d +"',M2113e = '"+ _M2113e +"',M2113f = '"+ _M2113f +"',M2113g = '"+ _M2113g +"',M2113h = '"+ _M2113h +"',M2113i = '"+ _M2113i +"',M2113j = '"+ _M2113j +"',M2113k = '"+ _M2113k +"',M2113l = '"+ _M2113l +"',M2113M = '"+ _M2113M +"',M2113x = '"+ _M2113x +"',M2113x1 = '"+ _M2113x1 +"',M2114 = '"+ _M2114 +"',M2115 = '"+ _M2115 +"',M2116 = '"+ _M2116 +"',M2117 = '"+ _M2117 +"',M221a = '"+ _M221a +"',M221b = '"+ _M221b +"',M221c = '"+ _M221c +"',M221x1 = '"+ _M221x1 +"',M222a = '"+ _M222a +"',M222b = '"+ _M222b +"',M222c = '"+ _M222c +"',M222d = '"+ _M222d +"',M222e = '"+ _M222e +"',M222f = '"+ _M222f +"',M222g = '"+ _M222g +"',M222h = '"+ _M222h +"',M222i = '"+ _M222i +"',M222x = '"+ _M222x +"',M222x1 = '"+ _M222x1 +"'  Where Rnd='"+ _Rnd +"' and SuchanaId='"+ _SuchanaId +"' and MSLNumber='"+ _MSLNumber +"'";
            C.Save(SQL);
        }
        catch(Exception  e)
        {
            response = e.getMessage();
        }
        return response;
    }


    public List<Knowledge_DataModel> SelectAll(Context context, String SQL)
    {
        Connection C = new Connection(context);
        List<Knowledge_DataModel> data = new ArrayList<Knowledge_DataModel>();
        Knowledge_DataModel d = new Knowledge_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while(!cur.isAfterLast())
        {
            d = new Knowledge_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaId = cur.getString(cur.getColumnIndex("SuchanaId"));
            d._MSLNumber = cur.getString(cur.getColumnIndex("MSlNo"));
            d._M212 = cur.getString(cur.getColumnIndex("M212"));
            d._M213a = cur.getString(cur.getColumnIndex("M213a"));
            d._M213b = cur.getString(cur.getColumnIndex("M213b"));
            d._M213c = cur.getString(cur.getColumnIndex("M213c"));
            d._M213x = cur.getString(cur.getColumnIndex("M213x"));
            d._M213x1 = cur.getString(cur.getColumnIndex("M213x1"));
            d._M214 = cur.getString(cur.getColumnIndex("M214"));
            d._M215 = cur.getString(cur.getColumnIndex("M215"));
            d._M216 = cur.getString(cur.getColumnIndex("M216"));
            d._M217a = cur.getString(cur.getColumnIndex("M217a"));
            d._M217b = cur.getString(cur.getColumnIndex("M217b"));
            d._M217c = cur.getString(cur.getColumnIndex("M217c"));
            d._M217d = cur.getString(cur.getColumnIndex("M217d"));
            d._M217x = cur.getString(cur.getColumnIndex("M217x"));
            d._M217x1 = cur.getString(cur.getColumnIndex("M217x1"));
            d._M218a = cur.getString(cur.getColumnIndex("M218a"));
            d._M218b = cur.getString(cur.getColumnIndex("M218b"));
            d._M218c = cur.getString(cur.getColumnIndex("M218c"));
            d._M218x = cur.getString(cur.getColumnIndex("M218x"));
            d._M218x1 = cur.getString(cur.getColumnIndex("M218x1"));
            d._M219a = cur.getString(cur.getColumnIndex("M219a"));
            d._M219b = cur.getString(cur.getColumnIndex("M219b"));
            d._M219c = cur.getString(cur.getColumnIndex("M219c"));
            d._M219d = cur.getString(cur.getColumnIndex("M219d"));
            d._M219e = cur.getString(cur.getColumnIndex("M219e"));
            d._M219f = cur.getString(cur.getColumnIndex("M219f"));
            d._M2110 = cur.getString(cur.getColumnIndex("M2110"));
            d._M2111a = cur.getString(cur.getColumnIndex("M2111a"));
            d._M2111b = cur.getString(cur.getColumnIndex("M2111b"));
            d._M2111c = cur.getString(cur.getColumnIndex("M2111c"));
            d._M2111d = cur.getString(cur.getColumnIndex("M2111d"));
            d._M2111e = cur.getString(cur.getColumnIndex("M2111e"));
            d._M2111f = cur.getString(cur.getColumnIndex("M2111f"));
            d._M2111g = cur.getString(cur.getColumnIndex("M2111g"));
            d._M2111x = cur.getString(cur.getColumnIndex("M2111x"));
            d._M2111x1 = cur.getString(cur.getColumnIndex("M2111x1"));
            d._M2112a = cur.getString(cur.getColumnIndex("M2112a"));
            d._M2112b = cur.getString(cur.getColumnIndex("M2112b"));
            d._M2112c = cur.getString(cur.getColumnIndex("M2112c"));
            d._M2112d = cur.getString(cur.getColumnIndex("M2112d"));
            d._M2112e = cur.getString(cur.getColumnIndex("M2112e"));
            d._M2112f = cur.getString(cur.getColumnIndex("M2112f"));
            d._M2112g = cur.getString(cur.getColumnIndex("M2112g"));
            d._M2112x = cur.getString(cur.getColumnIndex("M2112x"));
            d._M2112x1 = cur.getString(cur.getColumnIndex("M2112x1"));
            d._M2113a = cur.getString(cur.getColumnIndex("M2113a"));
            d._M2113b = cur.getString(cur.getColumnIndex("M2113b"));
            d._M2113c = cur.getString(cur.getColumnIndex("M2113c"));
            d._M2113d = cur.getString(cur.getColumnIndex("M2113d"));
            d._M2113e = cur.getString(cur.getColumnIndex("M2113e"));
            d._M2113f = cur.getString(cur.getColumnIndex("M2113f"));
            d._M2113g = cur.getString(cur.getColumnIndex("M2113g"));
            d._M2113h = cur.getString(cur.getColumnIndex("M2113h"));
            d._M2113i = cur.getString(cur.getColumnIndex("M2113i"));
            d._M2113j = cur.getString(cur.getColumnIndex("M2113j"));
            d._M2113k = cur.getString(cur.getColumnIndex("M2113k"));
            d._M2113l = cur.getString(cur.getColumnIndex("M2113l"));
            d._M2113M = cur.getString(cur.getColumnIndex("M2113M"));
            d._M2113x = cur.getString(cur.getColumnIndex("M2113x"));
            d._M2113x1 = cur.getString(cur.getColumnIndex("M2113x1"));
            d._M2114 = cur.getString(cur.getColumnIndex("M2114"));
            d._M2115 = cur.getString(cur.getColumnIndex("M2115"));
            d._M2116 = cur.getString(cur.getColumnIndex("M2116"));
            d._M2117 = cur.getString(cur.getColumnIndex("M2117"));
            d._M221a = cur.getString(cur.getColumnIndex("M221a"));
            d._M221b = cur.getString(cur.getColumnIndex("M221b"));
            d._M221c = cur.getString(cur.getColumnIndex("M221c"));
            d._M221x1 = cur.getString(cur.getColumnIndex("M221x1"));
            d._M222a = cur.getString(cur.getColumnIndex("M222a"));
            d._M222b = cur.getString(cur.getColumnIndex("M222b"));
            d._M222c = cur.getString(cur.getColumnIndex("M222c"));
            d._M222d = cur.getString(cur.getColumnIndex("M222d"));
            d._M222e = cur.getString(cur.getColumnIndex("M222e"));
            d._M222f = cur.getString(cur.getColumnIndex("M222f"));
            d._M222g = cur.getString(cur.getColumnIndex("M222g"));
            d._M222h = cur.getString(cur.getColumnIndex("M222h"));
            d._M222i = cur.getString(cur.getColumnIndex("M222i"));
            d._M222x = cur.getString(cur.getColumnIndex("M222x"));
            d._M222x1 = cur.getString(cur.getColumnIndex("M222x1"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}