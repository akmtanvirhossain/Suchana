package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;
public class SES_DataModel{

    String TableName = "SES";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _H311 = "";
    private String _H312 = "";
    private String _H313 = "";
    private String _H321 = "";
    private String _H321X = "";
    private String _H322 = "";
    private String _H322X = "";
    private String _H323 = "";
    private String _H323X = "";
    private String _H324 = "";
    private String _H324X = "";
    private String _H325 = "";
    private String _H325X = "";
    private String _H331 = "";
    private String _H332A = "";
    private String _H332B = "";
    private String _H341 = "";
    private String _H342 = "";
    private String _H61 = "";
    private String _H62 = "";
    private String _H63A = "";
    private String _H63AX = "";
    private String _H63B = "";
    private String _H63BX = "";
    private String _H63C = "";
    private String _H63CX = "";
    private String _H63D = "";
    private String _H63DX = "";
    private String _H63E = "";
    private String _H63EX = "";
    private String _H63X = "";
    private String _H64 = "";
    private String _H65 = "";
    private String _H66 = "";
    private String _H67 = "";
    private String _H68 = "";
    private String _H69 = "";
    private String _H610 = "";
    private String _H610X = "";
    private String _H610D = "";
    private String _H610DX = "";
    private String _H610a = "";
    private String _H610b1 = "";
    private String _H610b2 = "";
    private String _H610b3 = "";
    private String _H610b4 = "";
    private String _H610b5 = "";
    private String _H610b5X = "";
    private String _H610b6 = "";
    private String _H610c = "";
    private String _H611R = "";
    private String _H611RX = "";
    private String _H611D = "";
    private String _H611DX = "";
    private String _H611a = "";
    private String _H611b1 = "";
    private String _H611b2 = "";
    private String _H611b3 = "";
    private String _H611b4 = "";
    private String _H611b5 = "";
    private String _H611b5X = "";
    private String _H611b6 = "";
    private String _H611c = "";
    private String _H612R = "";
    private String _H612RX = "";
    private String _H612D = "";
    private String _H612DX = "";
    private String _H612a = "";
    private String _H612b1 = "";
    private String _H612b2 = "";
    private String _H612b3 = "";
    private String _H612b4 = "";
    private String _H612b5 = "";
    private String _H612b5X = "";
    private String _H612b6 = "";
    private String _H612c = "";
    private String _H613R = "";
    private String _H613RX = "";
    private String _H613D = "";
    private String _H613DX = "";
    private String _H613a = "";
    private String _H613b1 = "";
    private String _H613b2 = "";
    private String _H613b3 = "";
    private String _H613b4 = "";
    private String _H613b5 = "";
    private String _H613b5X = "";
    private String _H613b6 = "";
    private String _H613c = "";
    private String _H614R = "";
    private String _H614RX = "";
    private String _H614D = "";
    private String _H614DX = "";
    private String _H614a = "";
    private String _H614b1 = "";
    private String _H614b2 = "";
    private String _H614b3 = "";
    private String _H614b4 = "";
    private String _H614b5 = "";
    private String _H614b5X = "";
    private String _H614b6 = "";
    private String _H614c = "";
    private String _H615a = "";
    private String _H615b = "";
    private String _H616 = "";
    private String _H617 = "";
    private String _H618 = "";
    private String _H618X = "";
    private String _H619 = "";
    private String _H620 = "";
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

    public String getH311(){
        return _H311;
    }

    public void setH311(String newValue){
        _H311 = newValue;
    }

    public String getH312(){
        return _H312;
    }

    public void setH312(String newValue){
        _H312 = newValue;
    }

    public String getH313(){
        return _H313;
    }

    public void setH313(String newValue){
        _H313 = newValue;
    }

    public String getH321(){
        return _H321;
    }

    public void setH321(String newValue){
        _H321 = newValue;
    }

    public String getH321X(){
        return _H321X;
    }

    public void setH321X(String newValue){
        _H321X = newValue;
    }

    public String getH322(){
        return _H322;
    }

    public void setH322(String newValue){
        _H322 = newValue;
    }

    public String getH322X(){
        return _H322X;
    }

    public void setH322X(String newValue){
        _H322X = newValue;
    }

    public String getH323(){
        return _H323;
    }

    public void setH323(String newValue){
        _H323 = newValue;
    }

    public String getH323X(){
        return _H323X;
    }

    public void setH323X(String newValue){
        _H323X = newValue;
    }

    public String getH324(){
        return _H324;
    }

    public void setH324(String newValue){
        _H324 = newValue;
    }

    public String getH324X(){
        return _H324X;
    }

    public void setH324X(String newValue){
        _H324X = newValue;
    }

    public String getH325(){
        return _H325;
    }

    public void setH325(String newValue){
        _H325 = newValue;
    }

    public String getH325X(){
        return _H325X;
    }

    public void setH325X(String newValue){
        _H325X = newValue;
    }

    public String getH331(){
        return _H331;
    }

    public void setH331(String newValue){
        _H331 = newValue;
    }

    public String getH332A(){
        return _H332A;
    }

    public void setH332A(String newValue){
        _H332A = newValue;
    }

    public String getH332B(){
        return _H332B;
    }

    public void setH332B(String newValue){
        _H332B = newValue;
    }

    public String getH341(){
        return _H341;
    }

    public void setH341(String newValue){
        _H341 = newValue;
    }

    public String getH342(){
        return _H342;
    }

    public void setH342(String newValue){
        _H342 = newValue;
    }

    public String getH61(){
        return _H61;
    }

    public void setH61(String newValue){
        _H61 = newValue;
    }

    public String getH62(){
        return _H62;
    }

    public void setH62(String newValue){
        _H62 = newValue;
    }

    public String getH63A(){
        return _H63A;
    }

    public void setH63A(String newValue){
        _H63A = newValue;
    }

    public String getH63AX(){
        return _H63AX;
    }

    public void setH63AX(String newValue){
        _H63AX = newValue;
    }

    public String getH63B(){
        return _H63B;
    }

    public void setH63B(String newValue){
        _H63B = newValue;
    }

    public String getH63BX(){
        return _H63BX;
    }

    public void setH63BX(String newValue){
        _H63BX = newValue;
    }

    public String getH63C(){
        return _H63C;
    }

    public void setH63C(String newValue){
        _H63C = newValue;
    }

    public String getH63CX(){
        return _H63CX;
    }

    public void setH63CX(String newValue){
        _H63CX = newValue;
    }

    public String getH63D(){
        return _H63D;
    }

    public void setH63D(String newValue){
        _H63D = newValue;
    }

    public String getH63DX(){
        return _H63DX;
    }

    public void setH63DX(String newValue){
        _H63DX = newValue;
    }

    public String getH63E(){
        return _H63E;
    }

    public void setH63E(String newValue){
        _H63E = newValue;
    }

    public String getH63EX(){
        return _H63EX;
    }

    public void setH63EX(String newValue){
        _H63EX = newValue;
    }

    public String getH63X(){
        return _H63X;
    }

    public void setH63X(String newValue){
        _H63X = newValue;
    }

    public String getH64(){
        return _H64;
    }

    public void setH64(String newValue){
        _H64 = newValue;
    }

    public String getH65(){
        return _H65;
    }

    public void setH65(String newValue){
        _H65 = newValue;
    }

    public String getH66(){
        return _H66;
    }

    public void setH66(String newValue){
        _H66 = newValue;
    }

    public String getH67(){
        return _H67;
    }

    public void setH67(String newValue){
        _H67 = newValue;
    }

    public String getH68(){
        return _H68;
    }

    public void setH68(String newValue){
        _H68 = newValue;
    }

    public String getH69(){
        return _H69;
    }

    public void setH69(String newValue){
        _H69 = newValue;
    }

    public String getH610(){
        return _H610;
    }

    public void setH610(String newValue){
        _H610 = newValue;
    }

    public String getH610X(){
        return _H610X;
    }

    public void setH610X(String newValue){
        _H610X = newValue;
    }

    public String getH610D(){
        return _H610D;
    }

    public void setH610D(String newValue){
        _H610D = newValue;
    }

    public String getH610DX(){
        return _H610DX;
    }

    public void setH610DX(String newValue){
        _H610DX = newValue;
    }

    public String getH610a(){
        return _H610a;
    }

    public void setH610a(String newValue){
        _H610a = newValue;
    }

    public String getH610b1(){
        return _H610b1;
    }

    public void setH610b1(String newValue){
        _H610b1 = newValue;
    }

    public String getH610b2(){
        return _H610b2;
    }

    public void setH610b2(String newValue){
        _H610b2 = newValue;
    }

    public String getH610b3(){
        return _H610b3;
    }

    public void setH610b3(String newValue){
        _H610b3 = newValue;
    }

    public String getH610b4(){
        return _H610b4;
    }

    public void setH610b4(String newValue){
        _H610b4 = newValue;
    }

    public String getH610b5(){
        return _H610b5;
    }

    public void setH610b5(String newValue){
        _H610b5 = newValue;
    }

    public String getH610b5X(){
        return _H610b5X;
    }

    public void setH610b5X(String newValue){
        _H610b5X = newValue;
    }

    public String getH610b6(){
        return _H610b6;
    }

    public void setH610b6(String newValue){
        _H610b6 = newValue;
    }

    public String getH610c(){
        return _H610c;
    }

    public void setH610c(String newValue){
        _H610c = newValue;
    }

    public String getH611R(){
        return _H611R;
    }

    public void setH611R(String newValue){
        _H611R = newValue;
    }

    public String getH611RX(){
        return _H611RX;
    }

    public void setH611RX(String newValue){
        _H611RX = newValue;
    }

    public String getH611D(){
        return _H611D;
    }

    public void setH611D(String newValue){
        _H611D = newValue;
    }

    public String getH611DX(){
        return _H611DX;
    }

    public void setH611DX(String newValue){
        _H611DX = newValue;
    }

    public String getH611a(){
        return _H611a;
    }

    public void setH611a(String newValue){
        _H611a = newValue;
    }

    public String getH611b1(){
        return _H611b1;
    }

    public void setH611b1(String newValue){
        _H611b1 = newValue;
    }

    public String getH611b2(){
        return _H611b2;
    }

    public void setH611b2(String newValue){
        _H611b2 = newValue;
    }

    public String getH611b3(){
        return _H611b3;
    }

    public void setH611b3(String newValue){
        _H611b3 = newValue;
    }

    public String getH611b4(){
        return _H611b4;
    }

    public void setH611b4(String newValue){
        _H611b4 = newValue;
    }

    public String getH611b5(){
        return _H611b5;
    }

    public void setH611b5(String newValue){
        _H611b5 = newValue;
    }

    public String getH611b5X(){
        return _H611b5X;
    }

    public void setH611b5X(String newValue){
        _H611b5X = newValue;
    }

    public String getH611b6(){
        return _H611b6;
    }

    public void setH611b6(String newValue){
        _H611b6 = newValue;
    }

    public String getH611c(){
        return _H611c;
    }

    public void setH611c(String newValue){
        _H611c = newValue;
    }

    public String getH612R(){
        return _H612R;
    }

    public void setH612R(String newValue){
        _H612R = newValue;
    }

    public String getH612RX(){
        return _H612RX;
    }

    public void setH612RX(String newValue){
        _H612RX = newValue;
    }

    public String getH612D(){
        return _H612D;
    }

    public void setH612D(String newValue){
        _H612D = newValue;
    }

    public String getH612DX(){
        return _H612DX;
    }

    public void setH612DX(String newValue){
        _H612DX = newValue;
    }

    public String getH612a(){
        return _H612a;
    }

    public void setH612a(String newValue){
        _H612a = newValue;
    }

    public String getH612b1(){
        return _H612b1;
    }

    public void setH612b1(String newValue){
        _H612b1 = newValue;
    }

    public String getH612b2(){
        return _H612b2;
    }

    public void setH612b2(String newValue){
        _H612b2 = newValue;
    }

    public String getH612b3(){
        return _H612b3;
    }

    public void setH612b3(String newValue){
        _H612b3 = newValue;
    }

    public String getH612b4(){
        return _H612b4;
    }

    public void setH612b4(String newValue){
        _H612b4 = newValue;
    }

    public String getH612b5(){
        return _H612b5;
    }

    public void setH612b5(String newValue){
        _H612b5 = newValue;
    }

    public String getH612b5X(){
        return _H612b5X;
    }

    public void setH612b5X(String newValue){
        _H612b5X = newValue;
    }

    public String getH612b6(){
        return _H612b6;
    }

    public void setH612b6(String newValue){
        _H612b6 = newValue;
    }

    public String getH612c(){
        return _H612c;
    }

    public void setH612c(String newValue){
        _H612c = newValue;
    }

    public String getH613R(){
        return _H613R;
    }

    public void setH613R(String newValue){
        _H613R = newValue;
    }

    public String getH613RX(){
        return _H613RX;
    }

    public void setH613RX(String newValue){
        _H613RX = newValue;
    }

    public String getH613D(){
        return _H613D;
    }

    public void setH613D(String newValue){
        _H613D = newValue;
    }

    public String getH613DX(){
        return _H613DX;
    }

    public void setH613DX(String newValue){
        _H613DX = newValue;
    }

    public String getH613a(){
        return _H613a;
    }

    public void setH613a(String newValue){
        _H613a = newValue;
    }

    public String getH613b1(){
        return _H613b1;
    }

    public void setH613b1(String newValue){
        _H613b1 = newValue;
    }

    public String getH613b2(){
        return _H613b2;
    }

    public void setH613b2(String newValue){
        _H613b2 = newValue;
    }

    public String getH613b3(){
        return _H613b3;
    }

    public void setH613b3(String newValue){
        _H613b3 = newValue;
    }

    public String getH613b4(){
        return _H613b4;
    }

    public void setH613b4(String newValue){
        _H613b4 = newValue;
    }

    public String getH613b5(){
        return _H613b5;
    }

    public void setH613b5(String newValue){
        _H613b5 = newValue;
    }

    public String getH613b5X(){
        return _H613b5X;
    }

    public void setH613b5X(String newValue){
        _H613b5X = newValue;
    }

    public String getH613b6(){
        return _H613b6;
    }

    public void setH613b6(String newValue){
        _H613b6 = newValue;
    }

    public String getH613c(){
        return _H613c;
    }

    public void setH613c(String newValue){
        _H613c = newValue;
    }

    public String getH614R(){
        return _H614R;
    }

    public void setH614R(String newValue){
        _H614R = newValue;
    }

    public String getH614RX(){
        return _H614RX;
    }

    public void setH614RX(String newValue){
        _H614RX = newValue;
    }

    public String getH614D(){
        return _H614D;
    }

    public void setH614D(String newValue){
        _H614D = newValue;
    }

    public String getH614DX(){
        return _H614DX;
    }

    public void setH614DX(String newValue){
        _H614DX = newValue;
    }

    public String getH614a(){
        return _H614a;
    }

    public void setH614a(String newValue){
        _H614a = newValue;
    }

    public String getH614b1(){
        return _H614b1;
    }

    public void setH614b1(String newValue){
        _H614b1 = newValue;
    }

    public String getH614b2(){
        return _H614b2;
    }

    public void setH614b2(String newValue){
        _H614b2 = newValue;
    }

    public String getH614b3(){
        return _H614b3;
    }

    public void setH614b3(String newValue){
        _H614b3 = newValue;
    }

    public String getH614b4(){
        return _H614b4;
    }

    public void setH614b4(String newValue){
        _H614b4 = newValue;
    }

    public String getH614b5(){
        return _H614b5;
    }

    public void setH614b5(String newValue){
        _H614b5 = newValue;
    }

    public String getH614b5X(){
        return _H614b5X;
    }

    public void setH614b5X(String newValue){
        _H614b5X = newValue;
    }

    public String getH614b6(){
        return _H614b6;
    }

    public void setH614b6(String newValue){
        _H614b6 = newValue;
    }

    public String getH614c(){
        return _H614c;
    }

    public void setH614c(String newValue){
        _H614c = newValue;
    }

    public String getH615a(){
        return _H615a;
    }

    public void setH615a(String newValue){
        _H615a = newValue;
    }

    public String getH615b(){
        return _H615b;
    }

    public void setH615b(String newValue){
        _H615b = newValue;
    }

    public String getH616(){
        return _H616;
    }

    public void setH616(String newValue){
        _H616 = newValue;
    }

    public String getH617(){
        return _H617;
    }

    public void setH617(String newValue){
        _H617 = newValue;
    }

    public String getH618(){
        return _H618;
    }

    public void setH618(String newValue){
        _H618 = newValue;
    }

    public String getH618X(){
        return _H618X;
    }

    public void setH618X(String newValue){
        _H618X = newValue;
    }

    public String getH619(){
        return _H619;
    }

    public void setH619(String newValue){
        _H619 = newValue;
    }

    public String getH620(){
        return _H620;
    }

    public void setH620(String newValue){
        _H620 = newValue;
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
            SQL = "Insert into "+ TableName +" (Rnd,SuchanaID,H311,H312,H313,H321,H321X,H322,H322X,H323,H323X,H324,H324X,H325,H325X,H331,H332A,H332B,H341,H342,H61,H62,H63A,H63AX,H63B,H34BX,H63C,H34CX,H63D,H34DX,H63E,H34EX,H63X,H64,H65,H66,H67,H68,H69,H610,H610X,H610D,H610DX,H610a,H610b1,H610b2,H610b3,H610b4,H610b5,H610b5X,H610b6,H610c,H611R,H611RX,H611D,H611DX,H611a,H611b1,H611b2,H611b3,H611b4,H611b5,H611b5X,H611b6,H611c,H612R,H612RX,H612D,H612DX,H612a,H612b1,H612b2,H612b3,H612b4,H612b5,H612b5X,H612b6,H612c,H613R,H613RX,H613D,H613DX,H613a,H613b1,H613b2,H613b3,H613b4,H613b5,H613b5X,H613b6,H613c,H614R,H614RX,H614D,H614DX,H614a,H614b1,H614b2,H614b3,H614b4,H614b5,H614b5X,H614b6,H614c,H615a,H615b,H616,H617,H618,H618X,H619,H620,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('"+ _Rnd +"', '"+ _SuchanaID +"', '"+ _H311 +"', '"+ _H312 +"', '"+ _H313 +"', '"+ _H321 +"', '"+ _H321X +"', '"+ _H322 +"', '"+ _H322X +"', '"+ _H323 +"', '"+ _H323X +"', '"+ _H324 +"', '"+ _H324X +"', '"+ _H325 +"', '"+ _H325X +"', '"+ _H331 +"', '"+ _H332A +"', '"+ _H332B +"', '"+ _H341 +"', '"+ _H342 +"', '"+ _H61 +"', '"+ _H62 +"', '"+ _H63A +"', '"+ _H63AX +"', '"+ _H63B +"', '"+ _H63BX +"', '"+ _H63C +"', '"+ _H63CX +"', '"+ _H63D +"', '"+ _H63DX +"', '"+ _H63E +"', '"+ _H63EX +"', '"+ _H63X +"', '"+ _H64 +"', '"+ _H65 +"', '"+ _H66 +"', '"+ _H67 +"', '"+ _H68 +"', '"+ _H69 +"', '"+ _H610 +"', '"+ _H610X +"', '"+ _H610D +"', '"+ _H610DX +"', '"+ _H610a +"', '"+ _H610b1 +"', '"+ _H610b2 +"', '"+ _H610b3 +"', '"+ _H610b4 +"', '"+ _H610b5 +"', '"+ _H610b5X +"', '"+ _H610b6 +"', '"+ _H610c +"', '"+ _H611R +"', '"+ _H611RX +"', '"+ _H611D +"', '"+ _H611DX +"', '"+ _H611a +"', '"+ _H611b1 +"', '"+ _H611b2 +"', '"+ _H611b3 +"', '"+ _H611b4 +"', '"+ _H611b5 +"', '"+ _H611b5X +"', '"+ _H611b6 +"', '"+ _H611c +"', '"+ _H612R +"', '"+ _H612RX +"', '"+ _H612D +"', '"+ _H612DX +"', '"+ _H612a +"', '"+ _H612b1 +"', '"+ _H612b2 +"', '"+ _H612b3 +"', '"+ _H612b4 +"', '"+ _H612b5 +"', '"+ _H612b5X +"', '"+ _H612b6 +"', '"+ _H612c +"', '"+ _H613R +"', '"+ _H613RX +"', '"+ _H613D +"', '"+ _H613DX +"', '"+ _H613a +"', '"+ _H613b1 +"', '"+ _H613b2 +"', '"+ _H613b3 +"', '"+ _H613b4 +"', '"+ _H613b5 +"', '"+ _H613b5X +"', '"+ _H613b6 +"', '"+ _H613c +"', '"+ _H614R +"', '"+ _H614RX +"', '"+ _H614D +"', '"+ _H614DX +"', '"+ _H614a +"', '"+ _H614b1 +"', '"+ _H614b2 +"', '"+ _H614b3 +"', '"+ _H614b4 +"', '"+ _H614b5 +"', '"+ _H614b5X +"', '"+ _H614b6 +"', '"+ _H614c +"', '"+ _H615a +"', '"+ _H615b +"', '"+ _H616 +"', '"+ _H617 +"', '"+ _H618 +"', '"+ _H618X +"', '"+ _H619 +"', '"+ _H620 +"', '"+ _StartTime +"', '"+ _EndTime +"', '"+ _UserId +"', '"+ _EntryUser +"', '"+ _Lat +"', '"+ _Lon +"', '"+ _EnDt +"', '"+ _Upload +"')";
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
            SQL = "Update "+ TableName +" Set Upload='2',Rnd = '"+ _Rnd +"',SuchanaID = '"+ _SuchanaID +"',H311 = '"+ _H311 +"',H312 = '"+ _H312 +"',H313 = '"+ _H313 +"',H321 = '"+ _H321 +"',H321X = '"+ _H321X +"',H322 = '"+ _H322 +"',H322X = '"+ _H322X +"',H323 = '"+ _H323 +"',H323X = '"+ _H323X +"',H324 = '"+ _H324 +"',H324X = '"+ _H324X +"',H325 = '"+ _H325 +"',H325X = '"+ _H325X +"',H331 = '"+ _H331 +"',H332A = '"+ _H332A +"',H332B = '"+ _H332B +"',H341 = '"+ _H341 +"',H342 = '"+ _H342 +"',H61 = '"+ _H61 +"',H62 = '"+ _H62 +"',H63A = '"+ _H63A +"',H63AX = '"+ _H63AX +"',H63B = '"+ _H63B +"',H63BX = '"+ _H63BX +"',H63C = '"+ _H63C +"',H63CX = '"+ _H63CX +"',H63D = '"+ _H63D +"',H63DX = '"+ _H63DX +"',H63E = '"+ _H63E +"',H63EX = '"+ _H63EX +"',H63X = '"+ _H63X +"',H64 = '"+ _H64 +"',H65 = '"+ _H65 +"',H66 = '"+ _H66 +"',H67 = '"+ _H67 +"',H68 = '"+ _H68 +"',H69 = '"+ _H69 +"',H610 = '"+ _H610 +"',H610X = '"+ _H610X +"',H610D = '"+ _H610D +"',H610DX = '"+ _H610DX +"',H610a = '"+ _H610a +"',H610b1 = '"+ _H610b1 +"',H610b2 = '"+ _H610b2 +"',H610b3 = '"+ _H610b3 +"',H610b4 = '"+ _H610b4 +"',H610b5 = '"+ _H610b5 +"',H610b5X = '"+ _H610b5X +"',H610b6 = '"+ _H610b6 +"',H610c = '"+ _H610c +"',H611R = '"+ _H611R +"',H611RX = '"+ _H611RX +"',H611D = '"+ _H611D +"',H611DX = '"+ _H611DX +"',H611a = '"+ _H611a +"',H611b1 = '"+ _H611b1 +"',H611b2 = '"+ _H611b2 +"',H611b3 = '"+ _H611b3 +"',H611b4 = '"+ _H611b4 +"',H611b5 = '"+ _H611b5 +"',H611b5X = '"+ _H611b5X +"',H611b6 = '"+ _H611b6 +"',H611c = '"+ _H611c +"',H612R = '"+ _H612R +"',H612RX = '"+ _H612RX +"',H612D = '"+ _H612D +"',H612DX = '"+ _H612DX +"',H612a = '"+ _H612a +"',H612b1 = '"+ _H612b1 +"',H612b2 = '"+ _H612b2 +"',H612b3 = '"+ _H612b3 +"',H612b4 = '"+ _H612b4 +"',H612b5 = '"+ _H612b5 +"',H612b5X = '"+ _H612b5X +"',H612b6 = '"+ _H612b6 +"',H612c = '"+ _H612c +"',H613R = '"+ _H613R +"',H613RX = '"+ _H613RX +"',H613D = '"+ _H613D +"',H613DX = '"+ _H613DX +"',H613a = '"+ _H613a +"',H613b1 = '"+ _H613b1 +"',H613b2 = '"+ _H613b2 +"',H613b3 = '"+ _H613b3 +"',H613b4 = '"+ _H613b4 +"',H613b5 = '"+ _H613b5 +"',H613b5X = '"+ _H613b5X +"',H613b6 = '"+ _H613b6 +"',H613c = '"+ _H613c +"',H614R = '"+ _H614R +"',H614RX = '"+ _H614RX +"',H614D = '"+ _H614D +"',H614DX = '"+ _H614DX +"',H614a = '"+ _H614a +"',H614b1 = '"+ _H614b1 +"',H614b2 = '"+ _H614b2 +"',H614b3 = '"+ _H614b3 +"',H614b4 = '"+ _H614b4 +"',H614b5 = '"+ _H614b5 +"',H614b5X = '"+ _H614b5X +"',H614b6 = '"+ _H614b6 +"',H614c = '"+ _H614c +"',H615a = '"+ _H615a +"',H615b = '"+ _H615b +"',H616 = '"+ _H616 +"',H617 = '"+ _H617 +"',H618 = '"+ _H618 +"',H618X = '"+ _H618X +"',H619 = '"+ _H619 +"',H620 = '"+ _H620 +"'  Where Rnd='"+ _Rnd +"' and SuchanaID='"+ _SuchanaID +"'";
            C.Save(SQL);
        }
        catch(Exception  e)
        {
            response = e.getMessage();
        }
        return response;
    }


    public List<SES_DataModel> SelectAll(Context context, String SQL)
    {
        Connection C = new Connection(context);
        List<SES_DataModel> data = new ArrayList<SES_DataModel>();
        SES_DataModel d = new SES_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while(!cur.isAfterLast())
        {
            d = new SES_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._H311 = cur.getString(cur.getColumnIndex("H311"));
            d._H312 = cur.getString(cur.getColumnIndex("H312"));
            d._H313 = cur.getString(cur.getColumnIndex("H313"));
            d._H321 = cur.getString(cur.getColumnIndex("H321"));
            d._H321X = cur.getString(cur.getColumnIndex("H321X"));
            d._H322 = cur.getString(cur.getColumnIndex("H322"));
            d._H322X = cur.getString(cur.getColumnIndex("H322X"));
            d._H323 = cur.getString(cur.getColumnIndex("H323"));
            d._H323X = cur.getString(cur.getColumnIndex("H323X"));
            d._H324 = cur.getString(cur.getColumnIndex("H324"));
            d._H324X = cur.getString(cur.getColumnIndex("H324X"));
            d._H325 = cur.getString(cur.getColumnIndex("H325"));
            d._H325X = cur.getString(cur.getColumnIndex("H325X"));
            d._H331 = cur.getString(cur.getColumnIndex("H331"));
            d._H332A = cur.getString(cur.getColumnIndex("H332A"));
            d._H332B = cur.getString(cur.getColumnIndex("H332B"));
            d._H341 = cur.getString(cur.getColumnIndex("H341"));
            d._H342 = cur.getString(cur.getColumnIndex("H342"));
            d._H61 = cur.getString(cur.getColumnIndex("H61"));
            d._H62 = cur.getString(cur.getColumnIndex("H62"));
            d._H63A = cur.getString(cur.getColumnIndex("H63A"));
            d._H63AX = cur.getString(cur.getColumnIndex("H63AX"));
            d._H63B = cur.getString(cur.getColumnIndex("H63B"));
            d._H63BX = cur.getString(cur.getColumnIndex("H63BX"));
            d._H63C = cur.getString(cur.getColumnIndex("H63C"));
            d._H63CX = cur.getString(cur.getColumnIndex("H63CX"));
            d._H63D = cur.getString(cur.getColumnIndex("H63D"));
            d._H63DX = cur.getString(cur.getColumnIndex("H63DX"));
            d._H63E = cur.getString(cur.getColumnIndex("H63E"));
            d._H63EX = cur.getString(cur.getColumnIndex("H63EX"));
            d._H63X = cur.getString(cur.getColumnIndex("H63X"));
            d._H64 = cur.getString(cur.getColumnIndex("H64"));
            d._H65 = cur.getString(cur.getColumnIndex("H65"));
            d._H66 = cur.getString(cur.getColumnIndex("H66"));
            d._H67 = cur.getString(cur.getColumnIndex("H67"));
            d._H68 = cur.getString(cur.getColumnIndex("H68"));
            d._H69 = cur.getString(cur.getColumnIndex("H69"));
            d._H610 = cur.getString(cur.getColumnIndex("H610"));
            d._H610X = cur.getString(cur.getColumnIndex("H610X"));
            d._H610D = cur.getString(cur.getColumnIndex("H610D"));
            d._H610DX = cur.getString(cur.getColumnIndex("H610DX"));
            d._H610a = cur.getString(cur.getColumnIndex("H610a"));
            d._H610b1 = cur.getString(cur.getColumnIndex("H610b1"));
            d._H610b2 = cur.getString(cur.getColumnIndex("H610b2"));
            d._H610b3 = cur.getString(cur.getColumnIndex("H610b3"));
            d._H610b4 = cur.getString(cur.getColumnIndex("H610b4"));
            d._H610b5 = cur.getString(cur.getColumnIndex("H610b5"));
            d._H610b5X = cur.getString(cur.getColumnIndex("H610b5X"));
            d._H610b6 = cur.getString(cur.getColumnIndex("H610b6"));
            d._H610c = cur.getString(cur.getColumnIndex("H610c"));
            d._H611R = cur.getString(cur.getColumnIndex("H611R"));
            d._H611RX = cur.getString(cur.getColumnIndex("H611RX"));
            d._H611D = cur.getString(cur.getColumnIndex("H611D"));
            d._H611DX = cur.getString(cur.getColumnIndex("H611DX"));
            d._H611a = cur.getString(cur.getColumnIndex("H611a"));
            d._H611b1 = cur.getString(cur.getColumnIndex("H611b1"));
            d._H611b2 = cur.getString(cur.getColumnIndex("H611b2"));
            d._H611b3 = cur.getString(cur.getColumnIndex("H611b3"));
            d._H611b4 = cur.getString(cur.getColumnIndex("H611b4"));
            d._H611b5 = cur.getString(cur.getColumnIndex("H611b5"));
            d._H611b5X = cur.getString(cur.getColumnIndex("H611b5X"));
            d._H611b6 = cur.getString(cur.getColumnIndex("H611b6"));
            d._H611c = cur.getString(cur.getColumnIndex("H611c"));
            d._H612R = cur.getString(cur.getColumnIndex("H612R"));
            d._H612RX = cur.getString(cur.getColumnIndex("H612RX"));
            d._H612D = cur.getString(cur.getColumnIndex("H612D"));
            d._H612DX = cur.getString(cur.getColumnIndex("H612DX"));
            d._H612a = cur.getString(cur.getColumnIndex("H612a"));
            d._H612b1 = cur.getString(cur.getColumnIndex("H612b1"));
            d._H612b2 = cur.getString(cur.getColumnIndex("H612b2"));
            d._H612b3 = cur.getString(cur.getColumnIndex("H612b3"));
            d._H612b4 = cur.getString(cur.getColumnIndex("H612b4"));
            d._H612b5 = cur.getString(cur.getColumnIndex("H612b5"));
            d._H612b5X = cur.getString(cur.getColumnIndex("H612b5X"));
            d._H612b6 = cur.getString(cur.getColumnIndex("H612b6"));
            d._H612c = cur.getString(cur.getColumnIndex("H612c"));
            d._H613R = cur.getString(cur.getColumnIndex("H613R"));
            d._H613RX = cur.getString(cur.getColumnIndex("H613RX"));
            d._H613D = cur.getString(cur.getColumnIndex("H613D"));
            d._H613DX = cur.getString(cur.getColumnIndex("H613DX"));
            d._H613a = cur.getString(cur.getColumnIndex("H613a"));
            d._H613b1 = cur.getString(cur.getColumnIndex("H613b1"));
            d._H613b2 = cur.getString(cur.getColumnIndex("H613b2"));
            d._H613b3 = cur.getString(cur.getColumnIndex("H613b3"));
            d._H613b4 = cur.getString(cur.getColumnIndex("H613b4"));
            d._H613b5 = cur.getString(cur.getColumnIndex("H613b5"));
            d._H613b5X = cur.getString(cur.getColumnIndex("H613b5X"));
            d._H613b6 = cur.getString(cur.getColumnIndex("H613b6"));
            d._H613c = cur.getString(cur.getColumnIndex("H613c"));
            d._H614R = cur.getString(cur.getColumnIndex("H614R"));
            d._H614RX = cur.getString(cur.getColumnIndex("H614RX"));
            d._H614D = cur.getString(cur.getColumnIndex("H614D"));
            d._H614DX = cur.getString(cur.getColumnIndex("H614DX"));
            d._H614a = cur.getString(cur.getColumnIndex("H614a"));
            d._H614b1 = cur.getString(cur.getColumnIndex("H614b1"));
            d._H614b2 = cur.getString(cur.getColumnIndex("H614b2"));
            d._H614b3 = cur.getString(cur.getColumnIndex("H614b3"));
            d._H614b4 = cur.getString(cur.getColumnIndex("H614b4"));
            d._H614b5 = cur.getString(cur.getColumnIndex("H614b5"));
            d._H614b5X = cur.getString(cur.getColumnIndex("H614b5X"));
            d._H614b6 = cur.getString(cur.getColumnIndex("H614b6"));
            d._H614c = cur.getString(cur.getColumnIndex("H614c"));
            d._H615a = cur.getString(cur.getColumnIndex("H615a"));
            d._H615b = cur.getString(cur.getColumnIndex("H615b"));
            d._H616 = cur.getString(cur.getColumnIndex("H616"));
            d._H617 = cur.getString(cur.getColumnIndex("H617"));
            d._H618 = cur.getString(cur.getColumnIndex("H618"));
            d._H618X = cur.getString(cur.getColumnIndex("H618X"));
            d._H619 = cur.getString(cur.getColumnIndex("H619"));
            d._H620 = cur.getString(cur.getColumnIndex("H620"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}