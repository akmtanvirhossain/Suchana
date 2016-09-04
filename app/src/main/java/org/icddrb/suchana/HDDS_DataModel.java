package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class HDDS_DataModel {

    String TableName = "HDDS";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _H71a = "";
    private String _H71b1 = "";
    private String _H71b2 = "";
    private String _H71b3 = "";
    private String _H71b4 = "";
    private String _H71c = "";
    private String _H72a = "";
    private String _H72b1 = "";
    private String _H72b2 = "";
    private String _H72b3 = "";
    private String _H72b4 = "";
    private String _H72c = "";
    private String _H73a = "";
    private String _H73b1 = "";
    private String _H73b2 = "";
    private String _H73b3 = "";
    private String _H73b4 = "";
    private String _H73c = "";
    private String _H74a = "";
    private String _H74b1 = "";
    private String _H74b2 = "";
    private String _H74b3 = "";
    private String _H74b4 = "";
    private String _H74c = "";
    private String _H75a = "";
    private String _H75b1 = "";
    private String _H75b2 = "";
    private String _H75b3 = "";
    private String _H75b4 = "";
    private String _H75c = "";
    private String _H76a = "";
    private String _H76b1 = "";
    private String _H76b2 = "";
    private String _H76b3 = "";
    private String _H76b4 = "";
    private String _H76c = "";
    private String _H77a = "";
    private String _H77b1 = "";
    private String _H77b2 = "";
    private String _H77b3 = "";
    private String _H77b4 = "";
    private String _H77c = "";
    private String _H78a = "";
    private String _H78b1 = "";
    private String _H78b2 = "";
    private String _H78b3 = "";
    private String _H78b4 = "";
    private String _H78c = "";
    private String _H79a = "";
    private String _H79b1 = "";
    private String _H79b2 = "";
    private String _H79b3 = "";
    private String _H79b4 = "";
    private String _H79c = "";
    private String _H710a = "";
    private String _H710b1 = "";
    private String _H710b2 = "";
    private String _H710b3 = "";
    private String _H710b4 = "";
    private String _H710c = "";
    private String _H7111a = "";
    private String _H7111b1 = "";
    private String _H7111b2 = "";
    private String _H7111b3 = "";
    private String _H7111b4 = "";
    private String _H7111c1 = "";
    private String _H7112a = "";
    private String _H7112b1 = "";
    private String _H7112b2 = "";
    private String _H7112b3 = "";
    private String _H7112b4 = "";
    private String _H7112c = "";
    private String _H7113a = "";
    private String _H7113b1 = "";
    private String _H7113b2 = "";
    private String _H7113b3 = "";
    private String _H7113b4 = "";
    private String _H7113c = "";
    private String _H7114a = "";
    private String _H7114b1 = "";
    private String _H7114b2 = "";
    private String _H7114b3 = "";
    private String _H7114b4 = "";
    private String _H7114c = "";
    private String _H712a = "";
    private String _H712b1 = "";
    private String _H712b2 = "";
    private String _H712b3 = "";
    private String _H712b4 = "";
    private String _H712c = "";
    private String _H713a = "";
    private String _H713b1 = "";
    private String _H713b2 = "";
    private String _H713b3 = "";
    private String _H713b4 = "";
    private String _H713c = "";
    private String _H714a = "";
    private String _H714b1 = "";
    private String _H714b2 = "";
    private String _H714b3 = "";
    private String _H714b4 = "";
    private String _H714c = "";
    private String _H715a = "";
    private String _H715b1 = "";
    private String _H715b2 = "";
    private String _H715b3 = "";
    private String _H715b4 = "";
    private String _H715c = "";
    private String _H716a = "";
    private String _H716b1 = "";
    private String _H716b2 = "";
    private String _H716b3 = "";
    private String _H716b4 = "";
    private String _H716c = "";
    private String _H717a = "";
    private String _H717b1 = "";
    private String _H717b2 = "";
    private String _H717b3 = "";
    private String _H717b4 = "";
    private String _H717c = "";
    private String _StartTime = "";
    private String _EndTime = "";
    private String _UserId = "";
    private String _EntryUser = "";
    private String _Lat = "";
    private String _Lon = "";
    private String _EnDt = "";
    private String _Upload = "2";

    public String getUpload(){
        return _Upload;
    }
    public String getRnd() {
        return _Rnd;
    }

    public void setRnd(String newValue) {
        _Rnd = newValue;
    }

    public String getSuchanaID() {
        return _SuchanaID;
    }

    public void setSuchanaID(String newValue) {
        _SuchanaID = newValue;
    }

    public String getH71a() {
        return _H71a;
    }

    public void setH71a(String newValue) {
        _H71a = newValue;
    }

    public String getH71b1() {
        return _H71b1;
    }

    public void setH71b1(String newValue) {
        _H71b1 = newValue;
    }

    public String getH71b2() {
        return _H71b2;
    }

    public void setH71b2(String newValue) {
        _H71b2 = newValue;
    }

    public String getH71b3() {
        return _H71b3;
    }

    public void setH71b3(String newValue) {
        _H71b3 = newValue;
    }

    public String getH71b4() {
        return _H71b4;
    }

    public void setH71b4(String newValue) {
        _H71b4 = newValue;
    }

    public String getH71c() {
        return _H71c;
    }

    public void setH71c(String newValue) {
        _H71c = newValue;
    }

    public String getH72a() {
        return _H72a;
    }

    public void setH72a(String newValue) {
        _H72a = newValue;
    }

    public String getH72b1() {
        return _H72b1;
    }

    public void setH72b1(String newValue) {
        _H72b1 = newValue;
    }

    public String getH72b2() {
        return _H72b2;
    }

    public void setH72b2(String newValue) {
        _H72b2 = newValue;
    }

    public String getH72b3() {
        return _H72b3;
    }

    public void setH72b3(String newValue) {
        _H72b3 = newValue;
    }

    public String getH72b4() {
        return _H72b4;
    }

    public void setH72b4(String newValue) {
        _H72b4 = newValue;
    }

    public String getH72c() {
        return _H72c;
    }

    public void setH72c(String newValue) {
        _H72c = newValue;
    }

    public String getH73a() {
        return _H73a;
    }

    public void setH73a(String newValue) {
        _H73a = newValue;
    }

    public String getH73b1() {
        return _H73b1;
    }

    public void setH73b1(String newValue) {
        _H73b1 = newValue;
    }

    public String getH73b2() {
        return _H73b2;
    }

    public void setH73b2(String newValue) {
        _H73b2 = newValue;
    }

    public String getH73b3() {
        return _H73b3;
    }

    public void setH73b3(String newValue) {
        _H73b3 = newValue;
    }

    public String getH73b4() {
        return _H73b4;
    }

    public void setH73b4(String newValue) {
        _H73b4 = newValue;
    }

    public String getH73c() {
        return _H73c;
    }

    public void setH73c(String newValue) {
        _H73c = newValue;
    }

    public String getH74a() {
        return _H74a;
    }

    public void setH74a(String newValue) {
        _H74a = newValue;
    }

    public String getH74b1() {
        return _H74b1;
    }

    public void setH74b1(String newValue) {
        _H74b1 = newValue;
    }

    public String getH74b2() {
        return _H74b2;
    }

    public void setH74b2(String newValue) {
        _H74b2 = newValue;
    }

    public String getH74b3() {
        return _H74b3;
    }

    public void setH74b3(String newValue) {
        _H74b3 = newValue;
    }

    public String getH74b4() {
        return _H74b4;
    }

    public void setH74b4(String newValue) {
        _H74b4 = newValue;
    }

    public String getH74c() {
        return _H74c;
    }

    public void setH74c(String newValue) {
        _H74c = newValue;
    }

    public String getH75a() {
        return _H75a;
    }

    public void setH75a(String newValue) {
        _H75a = newValue;
    }

    public String getH75b1() {
        return _H75b1;
    }

    public void setH75b1(String newValue) {
        _H75b1 = newValue;
    }

    public String getH75b2() {
        return _H75b2;
    }

    public void setH75b2(String newValue) {
        _H75b2 = newValue;
    }

    public String getH75b3() {
        return _H75b3;
    }

    public void setH75b3(String newValue) {
        _H75b3 = newValue;
    }

    public String getH75b4() {
        return _H75b4;
    }

    public void setH75b4(String newValue) {
        _H75b4 = newValue;
    }

    public String getH75c() {
        return _H75c;
    }

    public void setH75c(String newValue) {
        _H75c = newValue;
    }

    public String getH76a() {
        return _H76a;
    }

    public void setH76a(String newValue) {
        _H76a = newValue;
    }

    public String getH76b1() {
        return _H76b1;
    }

    public void setH76b1(String newValue) {
        _H76b1 = newValue;
    }

    public String getH76b2() {
        return _H76b2;
    }

    public void setH76b2(String newValue) {
        _H76b2 = newValue;
    }

    public String getH76b3() {
        return _H76b3;
    }

    public void setH76b3(String newValue) {
        _H76b3 = newValue;
    }

    public String getH76b4() {
        return _H76b4;
    }

    public void setH76b4(String newValue) {
        _H76b4 = newValue;
    }

    public String getH76c() {
        return _H76c;
    }

    public void setH76c(String newValue) {
        _H76c = newValue;
    }

    public String getH77a() {
        return _H77a;
    }

    public void setH77a(String newValue) {
        _H77a = newValue;
    }

    public String getH77b1() {
        return _H77b1;
    }

    public void setH77b1(String newValue) {
        _H77b1 = newValue;
    }

    public String getH77b2() {
        return _H77b2;
    }

    public void setH77b2(String newValue) {
        _H77b2 = newValue;
    }

    public String getH77b3() {
        return _H77b3;
    }

    public void setH77b3(String newValue) {
        _H77b3 = newValue;
    }

    public String getH77b4() {
        return _H77b4;
    }

    public void setH77b4(String newValue) {
        _H77b4 = newValue;
    }

    public String getH77c() {
        return _H77c;
    }

    public void setH77c(String newValue) {
        _H77c = newValue;
    }

    public String getH78a() {
        return _H78a;
    }

    public void setH78a(String newValue) {
        _H78a = newValue;
    }

    public String getH78b1() {
        return _H78b1;
    }

    public void setH78b1(String newValue) {
        _H78b1 = newValue;
    }

    public String getH78b2() {
        return _H78b2;
    }

    public void setH78b2(String newValue) {
        _H78b2 = newValue;
    }

    public String getH78b3() {
        return _H78b3;
    }

    public void setH78b3(String newValue) {
        _H78b3 = newValue;
    }

    public String getH78b4() {
        return _H78b4;
    }

    public void setH78b4(String newValue) {
        _H78b4 = newValue;
    }

    public String getH78c() {
        return _H78c;
    }

    public void setH78c(String newValue) {
        _H78c = newValue;
    }

    public String getH79a() {
        return _H79a;
    }

    public void setH79a(String newValue) {
        _H79a = newValue;
    }

    public String getH79b1() {
        return _H79b1;
    }

    public void setH79b1(String newValue) {
        _H79b1 = newValue;
    }

    public String getH79b2() {
        return _H79b2;
    }

    public void setH79b2(String newValue) {
        _H79b2 = newValue;
    }

    public String getH79b3() {
        return _H79b3;
    }

    public void setH79b3(String newValue) {
        _H79b3 = newValue;
    }

    public String getH79b4() {
        return _H79b4;
    }

    public void setH79b4(String newValue) {
        _H79b4 = newValue;
    }

    public String getH79c() {
        return _H79c;
    }

    public void setH79c(String newValue) {
        _H79c = newValue;
    }

    public String getH710a() {
        return _H710a;
    }

    public void setH710a(String newValue) {
        _H710a = newValue;
    }

    public String getH710b1() {
        return _H710b1;
    }

    public void setH710b1(String newValue) {
        _H710b1 = newValue;
    }

    public String getH710b2() {
        return _H710b2;
    }

    public void setH710b2(String newValue) {
        _H710b2 = newValue;
    }

    public String getH710b3() {
        return _H710b3;
    }

    public void setH710b3(String newValue) {
        _H710b3 = newValue;
    }

    public String getH710b4() {
        return _H710b4;
    }

    public void setH710b4(String newValue) {
        _H710b4 = newValue;
    }

    public String getH710c() {
        return _H710c;
    }

    public void setH710c(String newValue) {
        _H710c = newValue;
    }

    public String getH7111a() {
        return _H7111a;
    }

    public void setH7111a(String newValue) {
        _H7111a = newValue;
    }

    public String getH7111b1() {
        return _H7111b1;
    }

    public void setH7111b1(String newValue) {
        _H7111b1 = newValue;
    }

    public String getH7111b2() {
        return _H7111b2;
    }

    public void setH7111b2(String newValue) {
        _H7111b2 = newValue;
    }

    public String getH7111b3() {
        return _H7111b3;
    }

    public void setH7111b3(String newValue) {
        _H7111b3 = newValue;
    }

    public String getH7111b4() {
        return _H7111b4;
    }

    public void setH7111b4(String newValue) {
        _H7111b4 = newValue;
    }

    public String getH7111c1() {
        return _H7111c1;
    }

    public void setH7111c1(String newValue) {
        _H7111c1 = newValue;
    }

    public String getH7112a() {
        return _H7112a;
    }

    public void setH7112a(String newValue) {
        _H7112a = newValue;
    }

    public String getH7112b1() {
        return _H7112b1;
    }

    public void setH7112b1(String newValue) {
        _H7112b1 = newValue;
    }

    public String getH7112b2() {
        return _H7112b2;
    }

    public void setH7112b2(String newValue) {
        _H7112b2 = newValue;
    }

    public String getH7112b3() {
        return _H7112b3;
    }

    public void setH7112b3(String newValue) {
        _H7112b3 = newValue;
    }

    public String getH7112b4() {
        return _H7112b4;
    }

    public void setH7112b4(String newValue) {
        _H7112b4 = newValue;
    }

    public String getH7112c() {
        return _H7112c;
    }

    public void setH7112c(String newValue) {
        _H7112c = newValue;
    }

    public String getH7113a() {
        return _H7113a;
    }

    public void setH7113a(String newValue) {
        _H7113a = newValue;
    }

    public String getH7113b1() {
        return _H7113b1;
    }

    public void setH7113b1(String newValue) {
        _H7113b1 = newValue;
    }

    public String getH7113b2() {
        return _H7113b2;
    }

    public void setH7113b2(String newValue) {
        _H7113b2 = newValue;
    }

    public String getH7113b3() {
        return _H7113b3;
    }

    public void setH7113b3(String newValue) {
        _H7113b3 = newValue;
    }

    public String getH7113b4() {
        return _H7113b4;
    }

    public void setH7113b4(String newValue) {
        _H7113b4 = newValue;
    }

    public String getH7113c() {
        return _H7113c;
    }

    public void setH7113c(String newValue) {
        _H7113c = newValue;
    }

    public String getH7114a() {
        return _H7114a;
    }

    public void setH7114a(String newValue) {
        _H7114a = newValue;
    }

    public String getH7114b1() {
        return _H7114b1;
    }

    public void setH7114b1(String newValue) {
        _H7114b1 = newValue;
    }

    public String getH7114b2() {
        return _H7114b2;
    }

    public void setH7114b2(String newValue) {
        _H7114b2 = newValue;
    }

    public String getH7114b3() {
        return _H7114b3;
    }

    public void setH7114b3(String newValue) {
        _H7114b3 = newValue;
    }

    public String getH7114b4() {
        return _H7114b4;
    }

    public void setH7114b4(String newValue) {
        _H7114b4 = newValue;
    }

    public String getH7114c() {
        return _H7114c;
    }

    public void setH7114c(String newValue) {
        _H7114c = newValue;
    }

    public String getH712a() {
        return _H712a;
    }

    public void setH712a(String newValue) {
        _H712a = newValue;
    }

    public String getH712b1() {
        return _H712b1;
    }

    public void setH712b1(String newValue) {
        _H712b1 = newValue;
    }

    public String getH712b2() {
        return _H712b2;
    }

    public void setH712b2(String newValue) {
        _H712b2 = newValue;
    }

    public String getH712b3() {
        return _H712b3;
    }

    public void setH712b3(String newValue) {
        _H712b3 = newValue;
    }

    public String getH712b4() {
        return _H712b4;
    }

    public void setH712b4(String newValue) {
        _H712b4 = newValue;
    }

    public String getH712c() {
        return _H712c;
    }

    public void setH712c(String newValue) {
        _H712c = newValue;
    }

    public String getH713a() {
        return _H713a;
    }

    public void setH713a(String newValue) {
        _H713a = newValue;
    }

    public String getH713b1() {
        return _H713b1;
    }

    public void setH713b1(String newValue) {
        _H713b1 = newValue;
    }

    public String getH713b2() {
        return _H713b2;
    }

    public void setH713b2(String newValue) {
        _H713b2 = newValue;
    }

    public String getH713b3() {
        return _H713b3;
    }

    public void setH713b3(String newValue) {
        _H713b3 = newValue;
    }

    public String getH713b4() {
        return _H713b4;
    }

    public void setH713b4(String newValue) {
        _H713b4 = newValue;
    }

    public String getH713c() {
        return _H713c;
    }

    public void setH713c(String newValue) {
        _H713c = newValue;
    }

    public String getH714a() {
        return _H714a;
    }

    public void setH714a(String newValue) {
        _H714a = newValue;
    }

    public String getH714b1() {
        return _H714b1;
    }

    public void setH714b1(String newValue) {
        _H714b1 = newValue;
    }

    public String getH714b2() {
        return _H714b2;
    }

    public void setH714b2(String newValue) {
        _H714b2 = newValue;
    }

    public String getH714b3() {
        return _H714b3;
    }

    public void setH714b3(String newValue) {
        _H714b3 = newValue;
    }

    public String getH714b4() {
        return _H714b4;
    }

    public void setH714b4(String newValue) {
        _H714b4 = newValue;
    }

    public String getH714c() {
        return _H714c;
    }

    public void setH714c(String newValue) {
        _H714c = newValue;
    }

    public String getH715a() {
        return _H715a;
    }

    public void setH715a(String newValue) {
        _H715a = newValue;
    }

    public String getH715b1() {
        return _H715b1;
    }

    public void setH715b1(String newValue) {
        _H715b1 = newValue;
    }

    public String getH715b2() {
        return _H715b2;
    }

    public void setH715b2(String newValue) {
        _H715b2 = newValue;
    }

    public String getH715b3() {
        return _H715b3;
    }

    public void setH715b3(String newValue) {
        _H715b3 = newValue;
    }

    public String getH715b4() {
        return _H715b4;
    }

    public void setH715b4(String newValue) {
        _H715b4 = newValue;
    }

    public String getH715c() {
        return _H715c;
    }

    public void setH715c(String newValue) {
        _H715c = newValue;
    }

    public String getH716a() {
        return _H716a;
    }

    public void setH716a(String newValue) {
        _H716a = newValue;
    }

    public String getH716b1() {
        return _H716b1;
    }

    public void setH716b1(String newValue) {
        _H716b1 = newValue;
    }

    public String getH716b2() {
        return _H716b2;
    }

    public void setH716b2(String newValue) {
        _H716b2 = newValue;
    }

    public String getH716b3() {
        return _H716b3;
    }

    public void setH716b3(String newValue) {
        _H716b3 = newValue;
    }

    public String getH716b4() {
        return _H716b4;
    }

    public void setH716b4(String newValue) {
        _H716b4 = newValue;
    }

    public String getH716c() {
        return _H716c;
    }

    public void setH716c(String newValue) {
        _H716c = newValue;
    }

    public String getH717a() {
        return _H717a;
    }

    public void setH717a(String newValue) {
        _H717a = newValue;
    }

    public String getH717b1() {
        return _H717b1;
    }

    public void setH717b1(String newValue) {
        _H717b1 = newValue;
    }

    public String getH717b2() {
        return _H717b2;
    }

    public void setH717b2(String newValue) {
        _H717b2 = newValue;
    }

    public String getH717b3() {
        return _H717b3;
    }

    public void setH717b3(String newValue) {
        _H717b3 = newValue;
    }

    public String getH717b4() {
        return _H717b4;
    }

    public void setH717b4(String newValue) {
        _H717b4 = newValue;
    }

    public String getH717c() {
        return _H717c;
    }

    public void setH717c(String newValue) {
        _H717c = newValue;
    }

    public void setStartTime(String newValue) {
        _StartTime = newValue;
    }

    public void setEndTime(String newValue) {
        _EndTime = newValue;
    }

    public void setUserId(String newValue) {
        _UserId = newValue;
    }

    public void setEntryUser(String newValue) {
        _EntryUser = newValue;
    }

    public void setLat(String newValue) {
        _Lat = newValue;
    }

    public void setLon(String newValue) {
        _Lon = newValue;
    }

    public void setEnDt(String newValue) {
        _EnDt = newValue;
    }

    public String SaveUpdateData(Context context) {
        String response = "";
        C = new Connection(context);
        String SQL = "";
        try {
            if (C.Existence("Select * from " + TableName + "  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "' "))
                response = UpdateData(context);
            else
                response = SaveData(context);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }

    private String SaveData(Context context) {
        String response = "";
        C = new Connection(context);
        String SQL = "";
        try {
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,H71a,H71b1,H71b2,H71b3,H71b4,H71c,H72a,H72b1,H72b2,H72b3,H72b4,H72c,H73a,H73b1,H73b2,H73b3,H73b4,H73c,H74a,H74b1,H74b2,H74b3,H74b4,H74c,H75a,H75b1,H75b2,H75b3,H75b4,H75c,H76a,H76b1,H76b2,H76b3,H76b4,H76c,H77a,H77b1,H77b2,H77b3,H77b4,H77c,H78a,H78b1,H78b2,H78b3,H78b4,H78c,H79a,H79b1,H79b2,H79b3,H79b4,H79c,H710a,H710b1,H710b2,H710b3,H710b4,H710c,H7111a,H7111b1,H7111b2,H7111b3,H7111b4,H7111c1,H7112a,H7112b1,H7112b2,H7112b3,H7112b4,H7112c,H7113a,H7113b1,H7113b2,H7113b3,H7113b4,H7113c,H7114a,H7114b1,H7114b2,H7114b3,H7114b4,H7114c,H712a,H712b1,H712b2,H712b3,H712b4,H712c,H713a,H713b1,H713b2,H713b3,H713b4,H713c,H714a,H714b1,H714b2,H714b3,H714b4,H714c,H715a,H715b1,H715b2,H715b3,H715b4,H715c,H716a,H716b1,H716b2,H716b3,H716b4,H716c,H717a,H717b1,H717b2,H717b3,H717b4,H717c,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _H71a + "', '" + _H71b1 + "', '" + _H71b2 + "', '" + _H71b3 + "', '" + _H71b4 + "', '" + _H71c + "', '" + _H72a + "', '" + _H72b1 + "', '" + _H72b2 + "', '" + _H72b3 + "', '" + _H72b4 + "', '" + _H72c + "', '" + _H73a + "', '" + _H73b1 + "', '" + _H73b2 + "', '" + _H73b3 + "', '" + _H73b4 + "', '" + _H73c + "', '" + _H74a + "', '" + _H74b1 + "', '" + _H74b2 + "', '" + _H74b3 + "', '" + _H74b4 + "', '" + _H74c + "', '" + _H75a + "', '" + _H75b1 + "', '" + _H75b2 + "', '" + _H75b3 + "', '" + _H75b4 + "', '" + _H75c + "', '" + _H76a + "', '" + _H76b1 + "', '" + _H76b2 + "', '" + _H76b3 + "', '" + _H76b4 + "', '" + _H76c + "', '" + _H77a + "', '" + _H77b1 + "', '" + _H77b2 + "', '" + _H77b3 + "', '" + _H77b4 + "', '" + _H77c + "', '" + _H78a + "', '" + _H78b1 + "', '" + _H78b2 + "', '" + _H78b3 + "', '" + _H78b4 + "', '" + _H78c + "', '" + _H79a + "', '" + _H79b1 + "', '" + _H79b2 + "', '" + _H79b3 + "', '" + _H79b4 + "', '" + _H79c + "', '" + _H710a + "', '" + _H710b1 + "', '" + _H710b2 + "', '" + _H710b3 + "', '" + _H710b4 + "', '" + _H710c + "', '" + _H7111a + "', '" + _H7111b1 + "', '" + _H7111b2 + "', '" + _H7111b3 + "', '" + _H7111b4 + "', '" + _H7111c1 + "', '" + _H7112a + "', '" + _H7112b1 + "', '" + _H7112b2 + "', '" + _H7112b3 + "', '" + _H7112b4 + "', '" + _H7112c + "', '" + _H7113a + "', '" + _H7113b1 + "', '" + _H7113b2 + "', '" + _H7113b3 + "', '" + _H7113b4 + "', '" + _H7113c + "', '" + _H7114a + "', '" + _H7114b1 + "', '" + _H7114b2 + "', '" + _H7114b3 + "', '" + _H7114b4 + "', '" + _H7114c + "', '" + _H712a + "', '" + _H712b1 + "', '" + _H712b2 + "', '" + _H712b3 + "', '" + _H712b4 + "', '" + _H712c + "', '" + _H713a + "', '" + _H713b1 + "', '" + _H713b2 + "', '" + _H713b3 + "', '" + _H713b4 + "', '" + _H713c + "', '" + _H714a + "', '" + _H714b1 + "', '" + _H714b2 + "', '" + _H714b3 + "', '" + _H714b4 + "', '" + _H714c + "', '" + _H715a + "', '" + _H715b1 + "', '" + _H715b2 + "', '" + _H715b3 + "', '" + _H715b4 + "', '" + _H715c + "', '" + _H716a + "', '" + _H716b1 + "', '" + _H716b2 + "', '" + _H716b3 + "', '" + _H716b4 + "', '" + _H716c + "', '" + _H717a + "', '" + _H717b1 + "', '" + _H717b2 + "', '" + _H717b3 + "', '" + _H717b4 + "', '" + _H717c + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }

    private String UpdateData(Context context) {
        String response = "";
        C = new Connection(context);
        String SQL = "";
        try {
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',H71a = '" + _H71a + "',H71b1 = '" + _H71b1 + "',H71b2 = '" + _H71b2 + "',H71b3 = '" + _H71b3 + "',H71b4 = '" + _H71b4 + "',H71c = '" + _H71c + "',H72a = '" + _H72a + "',H72b1 = '" + _H72b1 + "',H72b2 = '" + _H72b2 + "',H72b3 = '" + _H72b3 + "',H72b4 = '" + _H72b4 + "',H72c = '" + _H72c + "',H73a = '" + _H73a + "',H73b1 = '" + _H73b1 + "',H73b2 = '" + _H73b2 + "',H73b3 = '" + _H73b3 + "',H73b4 = '" + _H73b4 + "',H73c = '" + _H73c + "',H74a = '" + _H74a + "',H74b1 = '" + _H74b1 + "',H74b2 = '" + _H74b2 + "',H74b3 = '" + _H74b3 + "',H74b4 = '" + _H74b4 + "',H74c = '" + _H74c + "',H75a = '" + _H75a + "',H75b1 = '" + _H75b1 + "',H75b2 = '" + _H75b2 + "',H75b3 = '" + _H75b3 + "',H75b4 = '" + _H75b4 + "',H75c = '" + _H75c + "',H76a = '" + _H76a + "',H76b1 = '" + _H76b1 + "',H76b2 = '" + _H76b2 + "',H76b3 = '" + _H76b3 + "',H76b4 = '" + _H76b4 + "',H76c = '" + _H76c + "',H77a = '" + _H77a + "',H77b1 = '" + _H77b1 + "',H77b2 = '" + _H77b2 + "',H77b3 = '" + _H77b3 + "',H77b4 = '" + _H77b4 + "',H77c = '" + _H77c + "',H78a = '" + _H78a + "',H78b1 = '" + _H78b1 + "',H78b2 = '" + _H78b2 + "',H78b3 = '" + _H78b3 + "',H78b4 = '" + _H78b4 + "',H78c = '" + _H78c + "',H79a = '" + _H79a + "',H79b1 = '" + _H79b1 + "',H79b2 = '" + _H79b2 + "',H79b3 = '" + _H79b3 + "',H79b4 = '" + _H79b4 + "',H79c = '" + _H79c + "',H710a = '" + _H710a + "',H710b1 = '" + _H710b1 + "',H710b2 = '" + _H710b2 + "',H710b3 = '" + _H710b3 + "',H710b4 = '" + _H710b4 + "',H710c = '" + _H710c + "',H7111a = '" + _H7111a + "',H7111b1 = '" + _H7111b1 + "',H7111b2 = '" + _H7111b2 + "',H7111b3 = '" + _H7111b3 + "',H7111b4 = '" + _H7111b4 + "',H7111c1 = '" + _H7111c1 + "',H7112a = '" + _H7112a + "',H7112b1 = '" + _H7112b1 + "',H7112b2 = '" + _H7112b2 + "',H7112b3 = '" + _H7112b3 + "',H7112b4 = '" + _H7112b4 + "',H7112c = '" + _H7112c + "',H7113a = '" + _H7113a + "',H7113b1 = '" + _H7113b1 + "',H7113b2 = '" + _H7113b2 + "',H7113b3 = '" + _H7113b3 + "',H7113b4 = '" + _H7113b4 + "',H7113c = '" + _H7113c + "',H7114a = '" + _H7114a + "',H7114b1 = '" + _H7114b1 + "',H7114b2 = '" + _H7114b2 + "',H7114b3 = '" + _H7114b3 + "',H7114b4 = '" + _H7114b4 + "',H7114c = '" + _H7114c + "',H712a = '" + _H712a + "',H712b1 = '" + _H712b1 + "',H712b2 = '" + _H712b2 + "',H712b3 = '" + _H712b3 + "',H712b4 = '" + _H712b4 + "',H712c = '" + _H712c + "',H713a = '" + _H713a + "',H713b1 = '" + _H713b1 + "',H713b2 = '" + _H713b2 + "',H713b3 = '" + _H713b3 + "',H713b4 = '" + _H713b4 + "',H713c = '" + _H713c + "',H714a = '" + _H714a + "',H714b1 = '" + _H714b1 + "',H714b2 = '" + _H714b2 + "',H714b3 = '" + _H714b3 + "',H714b4 = '" + _H714b4 + "',H714c = '" + _H714c + "',H715a = '" + _H715a + "',H715b1 = '" + _H715b1 + "',H715b2 = '" + _H715b2 + "',H715b3 = '" + _H715b3 + "',H715b4 = '" + _H715b4 + "',H715c = '" + _H715c + "',H716a = '" + _H716a + "',H716b1 = '" + _H716b1 + "',H716b2 = '" + _H716b2 + "',H716b3 = '" + _H716b3 + "',H716b4 = '" + _H716b4 + "',H716c = '" + _H716c + "',H717a = '" + _H717a + "',H717b1 = '" + _H717b1 + "',H717b2 = '" + _H717b2 + "',H717b3 = '" + _H717b3 + "',H717b4 = '" + _H717b4 + "',H717c = '" + _H717c + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<HDDS_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<HDDS_DataModel> data = new ArrayList<HDDS_DataModel>();
        HDDS_DataModel d = new HDDS_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new HDDS_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._H71a = cur.getString(cur.getColumnIndex("H71a"));
            d._H71b1 = cur.getString(cur.getColumnIndex("H71b1"));
            d._H71b2 = cur.getString(cur.getColumnIndex("H71b2"));
            d._H71b3 = cur.getString(cur.getColumnIndex("H71b3"));
            d._H71b4 = cur.getString(cur.getColumnIndex("H71b4"));
            d._H71c = cur.getString(cur.getColumnIndex("H71c"));
            d._H72a = cur.getString(cur.getColumnIndex("H72a"));
            d._H72b1 = cur.getString(cur.getColumnIndex("H72b1"));
            d._H72b2 = cur.getString(cur.getColumnIndex("H72b2"));
            d._H72b3 = cur.getString(cur.getColumnIndex("H72b3"));
            d._H72b4 = cur.getString(cur.getColumnIndex("H72b4"));
            d._H72c = cur.getString(cur.getColumnIndex("H72c"));
            d._H73a = cur.getString(cur.getColumnIndex("H73a"));
            d._H73b1 = cur.getString(cur.getColumnIndex("H73b1"));
            d._H73b2 = cur.getString(cur.getColumnIndex("H73b2"));
            d._H73b3 = cur.getString(cur.getColumnIndex("H73b3"));
            d._H73b4 = cur.getString(cur.getColumnIndex("H73b4"));
            d._H73c = cur.getString(cur.getColumnIndex("H73c"));
            d._H74a = cur.getString(cur.getColumnIndex("H74a"));
            d._H74b1 = cur.getString(cur.getColumnIndex("H74b1"));
            d._H74b2 = cur.getString(cur.getColumnIndex("H74b2"));
            d._H74b3 = cur.getString(cur.getColumnIndex("H74b3"));
            d._H74b4 = cur.getString(cur.getColumnIndex("H74b4"));
            d._H74c = cur.getString(cur.getColumnIndex("H74c"));
            d._H75a = cur.getString(cur.getColumnIndex("H75a"));
            d._H75b1 = cur.getString(cur.getColumnIndex("H75b1"));
            d._H75b2 = cur.getString(cur.getColumnIndex("H75b2"));
            d._H75b3 = cur.getString(cur.getColumnIndex("H75b3"));
            d._H75b4 = cur.getString(cur.getColumnIndex("H75b4"));
            d._H75c = cur.getString(cur.getColumnIndex("H75c"));
            d._H76a = cur.getString(cur.getColumnIndex("H76a"));
            d._H76b1 = cur.getString(cur.getColumnIndex("H76b1"));
            d._H76b2 = cur.getString(cur.getColumnIndex("H76b2"));
            d._H76b3 = cur.getString(cur.getColumnIndex("H76b3"));
            d._H76b4 = cur.getString(cur.getColumnIndex("H76b4"));
            d._H76c = cur.getString(cur.getColumnIndex("H76c"));
            d._H77a = cur.getString(cur.getColumnIndex("H77a"));
            d._H77b1 = cur.getString(cur.getColumnIndex("H77b1"));
            d._H77b2 = cur.getString(cur.getColumnIndex("H77b2"));
            d._H77b3 = cur.getString(cur.getColumnIndex("H77b3"));
            d._H77b4 = cur.getString(cur.getColumnIndex("H77b4"));
            d._H77c = cur.getString(cur.getColumnIndex("H77c"));
            d._H78a = cur.getString(cur.getColumnIndex("H78a"));
            d._H78b1 = cur.getString(cur.getColumnIndex("H78b1"));
            d._H78b2 = cur.getString(cur.getColumnIndex("H78b2"));
            d._H78b3 = cur.getString(cur.getColumnIndex("H78b3"));
            d._H78b4 = cur.getString(cur.getColumnIndex("H78b4"));
            d._H78c = cur.getString(cur.getColumnIndex("H78c"));
            d._H79a = cur.getString(cur.getColumnIndex("H79a"));
            d._H79b1 = cur.getString(cur.getColumnIndex("H79b1"));
            d._H79b2 = cur.getString(cur.getColumnIndex("H79b2"));
            d._H79b3 = cur.getString(cur.getColumnIndex("H79b3"));
            d._H79b4 = cur.getString(cur.getColumnIndex("H79b4"));
            d._H79c = cur.getString(cur.getColumnIndex("H79c"));
            d._H710a = cur.getString(cur.getColumnIndex("H710a"));
            d._H710b1 = cur.getString(cur.getColumnIndex("H710b1"));
            d._H710b2 = cur.getString(cur.getColumnIndex("H710b2"));
            d._H710b3 = cur.getString(cur.getColumnIndex("H710b3"));
            d._H710b4 = cur.getString(cur.getColumnIndex("H710b4"));
            d._H710c = cur.getString(cur.getColumnIndex("H710c"));
            d._H7111a = cur.getString(cur.getColumnIndex("H7111a"));
            d._H7111b1 = cur.getString(cur.getColumnIndex("H7111b1"));
            d._H7111b2 = cur.getString(cur.getColumnIndex("H7111b2"));
            d._H7111b3 = cur.getString(cur.getColumnIndex("H7111b3"));
            d._H7111b4 = cur.getString(cur.getColumnIndex("H7111b4"));
            d._H7111c1 = cur.getString(cur.getColumnIndex("H7111c1"));
            d._H7112a = cur.getString(cur.getColumnIndex("H7112a"));
            d._H7112b1 = cur.getString(cur.getColumnIndex("H7112b1"));
            d._H7112b2 = cur.getString(cur.getColumnIndex("H7112b2"));
            d._H7112b3 = cur.getString(cur.getColumnIndex("H7112b3"));
            d._H7112b4 = cur.getString(cur.getColumnIndex("H7112b4"));
            d._H7112c = cur.getString(cur.getColumnIndex("H7112c"));
            d._H7113a = cur.getString(cur.getColumnIndex("H7113a"));
            d._H7113b1 = cur.getString(cur.getColumnIndex("H7113b1"));
            d._H7113b2 = cur.getString(cur.getColumnIndex("H7113b2"));
            d._H7113b3 = cur.getString(cur.getColumnIndex("H7113b3"));
            d._H7113b4 = cur.getString(cur.getColumnIndex("H7113b4"));
            d._H7113c = cur.getString(cur.getColumnIndex("H7113c"));
            d._H7114a = cur.getString(cur.getColumnIndex("H7114a"));
            d._H7114b1 = cur.getString(cur.getColumnIndex("H7114b1"));
            d._H7114b2 = cur.getString(cur.getColumnIndex("H7114b2"));
            d._H7114b3 = cur.getString(cur.getColumnIndex("H7114b3"));
            d._H7114b4 = cur.getString(cur.getColumnIndex("H7114b4"));
            d._H7114c = cur.getString(cur.getColumnIndex("H7114c"));
            d._H712a = cur.getString(cur.getColumnIndex("H712a"));
            d._H712b1 = cur.getString(cur.getColumnIndex("H712b1"));
            d._H712b2 = cur.getString(cur.getColumnIndex("H712b2"));
            d._H712b3 = cur.getString(cur.getColumnIndex("H712b3"));
            d._H712b4 = cur.getString(cur.getColumnIndex("H712b4"));
            d._H712c = cur.getString(cur.getColumnIndex("H712c"));
            d._H713a = cur.getString(cur.getColumnIndex("H713a"));
            d._H713b1 = cur.getString(cur.getColumnIndex("H713b1"));
            d._H713b2 = cur.getString(cur.getColumnIndex("H713b2"));
            d._H713b3 = cur.getString(cur.getColumnIndex("H713b3"));
            d._H713b4 = cur.getString(cur.getColumnIndex("H713b4"));
            d._H713c = cur.getString(cur.getColumnIndex("H713c"));
            d._H714a = cur.getString(cur.getColumnIndex("H714a"));
            d._H714b1 = cur.getString(cur.getColumnIndex("H714b1"));
            d._H714b2 = cur.getString(cur.getColumnIndex("H714b2"));
            d._H714b3 = cur.getString(cur.getColumnIndex("H714b3"));
            d._H714b4 = cur.getString(cur.getColumnIndex("H714b4"));
            d._H714c = cur.getString(cur.getColumnIndex("H714c"));
            d._H715a = cur.getString(cur.getColumnIndex("H715a"));
            d._H715b1 = cur.getString(cur.getColumnIndex("H715b1"));
            d._H715b2 = cur.getString(cur.getColumnIndex("H715b2"));
            d._H715b3 = cur.getString(cur.getColumnIndex("H715b3"));
            d._H715b4 = cur.getString(cur.getColumnIndex("H715b4"));
            d._H715c = cur.getString(cur.getColumnIndex("H715c"));
            d._H716a = cur.getString(cur.getColumnIndex("H716a"));
            d._H716b1 = cur.getString(cur.getColumnIndex("H716b1"));
            d._H716b2 = cur.getString(cur.getColumnIndex("H716b2"));
            d._H716b3 = cur.getString(cur.getColumnIndex("H716b3"));
            d._H716b4 = cur.getString(cur.getColumnIndex("H716b4"));
            d._H716c = cur.getString(cur.getColumnIndex("H716c"));
            d._H717a = cur.getString(cur.getColumnIndex("H717a"));
            d._H717b1 = cur.getString(cur.getColumnIndex("H717b1"));
            d._H717b2 = cur.getString(cur.getColumnIndex("H717b2"));
            d._H717b3 = cur.getString(cur.getColumnIndex("H717b3"));
            d._H717b4 = cur.getString(cur.getColumnIndex("H717b4"));
            d._H717c = cur.getString(cur.getColumnIndex("H717c"));
            d._Upload = cur.getString(cur.getColumnIndex("Upload"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}