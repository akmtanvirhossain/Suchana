package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class Careseek_DataModel {

    String TableName = "Careseek";
    Connection C;
    private String _Rnd = "";
    private String _SuchanaID = "";
    private String _H181a = "";
    private String _H181a1 = "";
    private String _H181a1X = "";
    private String _H181a2 = "";
    private String _H181a2X = "";
    private String _H181a3 = "";
    private String _H181a3X = "";
    private String _H181a4 = "";
    private String _H182a = "";
    private String _H182a1 = "";
    private String _H182a1X = "";
    private String _H182a2 = "";
    private String _H182a2X = "";
    private String _H182a3 = "";
    private String _H182a3X = "";
    private String _H182a4 = "";
    private String _H183a = "";
    private String _H183a1 = "";
    private String _H183a1X = "";
    private String _H183a2 = "";
    private String _H183a2X = "";
    private String _H183a3 = "";
    private String _H183a3X = "";
    private String _H183a4 = "";
    private String _H184a = "";
    private String _H184a1 = "";
    private String _H184a1X = "";
    private String _H184a2 = "";
    private String _H184a2X = "";
    private String _H184a3 = "";
    private String _H184a3X = "";
    private String _H184a4 = "";
    private String _H185a = "";
    private String _H185a1 = "";
    private String _H185a1X = "";
    private String _H185a2 = "";
    private String _H185a2X = "";
    private String _H185a3 = "";
    private String _H185a3X = "";
    private String _H185a4 = "";
    private String _H185a5 = "";
    private String _H186a = "";
    private String _H186a1 = "";
    private String _H186a1X = "";
    private String _H186a2 = "";
    private String _H186a2X = "";
    private String _H186a3 = "";
    private String _H186a3X = "";
    private String _H186a4 = "";
    private String _H186a5 = "";
    private String _H187a = "";
    private String _H187a1 = "";
    private String _H187a1X = "";
    private String _H187a2 = "";
    private String _H187a2X = "";
    private String _H187a3 = "";
    private String _H187a3X = "";
    private String _H187a4 = "";
    private String _H188a = "";
    private String _H188a1 = "";
    private String _H188a1X = "";
    private String _H188a2 = "";
    private String _H188a2X = "";
    private String _H188a3 = "";
    private String _H1881a3X = "";
    private String _H188a4 = "";
    private String _H189a = "";
    private String _H189a1 = "";
    private String _H189a1X = "";
    private String _H189a2 = "";
    private String _H189a2X = "";
    private String _H189a3 = "";
    private String _H189a3X = "";
    private String _H189a4 = "";
    private String _H1810a = "";
    private String _H1810a1 = "";
    private String _H1810a1X = "";
    private String _H1810a2 = "";
    private String _H1810a2X = "";
    private String _H1810a3 = "";
    private String _H1810a3X = "";
    private String _H1810a4 = "";
    private String _H1811a = "";
    private String _H1811a1 = "";
    private String _H1811a1X = "";
    private String _H1811a2 = "";
    private String _H1811a2X = "";
    private String _H1811a3 = "";
    private String _H1811a3X = "";
    private String _H1811a4 = "";
    private String _H1812a = "";
    private String _H1812a1 = "";
    private String _H1812a1X = "";
    private String _H1812a2 = "";
    private String _H1812a2X = "";
    private String _H1812a3 = "";
    private String _H1812a3X = "";
    private String _H1812a4 = "";
    private String _StartTime = "";
    private String _EndTime = "";
    private String _UserId = "";
    private String _EntryUser = "";
    private String _Lat = "";
    private String _Lon = "";
    private String _EnDt = "";
    private String _Upload = "2";

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

    public String getH181a() {
        return _H181a;
    }

    public void setH181a(String newValue) {
        _H181a = newValue;
    }

    public String getH181a1() {
        return _H181a1;
    }

    public void setH181a1(String newValue) {
        _H181a1 = newValue;
    }

    public String getH181a1X() {
        return _H181a1X;
    }

    public void setH181a1X(String newValue) {
        _H181a1X = newValue;
    }

    public String getH181a2() {
        return _H181a2;
    }

    public void setH181a2(String newValue) {
        _H181a2 = newValue;
    }

    public String getH181a2X() {
        return _H181a2X;
    }

    public void setH181a2X(String newValue) {
        _H181a2X = newValue;
    }

    public String getH181a3() {
        return _H181a3;
    }

    public void setH181a3(String newValue) {
        _H181a3 = newValue;
    }

    public String getH181a3X() {
        return _H181a3X;
    }

    public void setH181a3X(String newValue) {
        _H181a3X = newValue;
    }

    public String getH181a4() {
        return _H181a4;
    }

    public void setH181a4(String newValue) {
        _H181a4 = newValue;
    }

    public String getH182a() {
        return _H182a;
    }

    public void setH182a(String newValue) {
        _H182a = newValue;
    }

    public String getH182a1() {
        return _H182a1;
    }

    public void setH182a1(String newValue) {
        _H182a1 = newValue;
    }

    public String getH182a1X() {
        return _H182a1X;
    }

    public void setH182a1X(String newValue) {
        _H182a1X = newValue;
    }

    public String getH182a2() {
        return _H182a2;
    }

    public void setH182a2(String newValue) {
        _H182a2 = newValue;
    }

    public String getH182a2X() {
        return _H182a2X;
    }

    public void setH182a2X(String newValue) {
        _H182a2X = newValue;
    }

    public String getH182a3() {
        return _H182a3;
    }

    public void setH182a3(String newValue) {
        _H182a3 = newValue;
    }

    public String getH182a3X() {
        return _H182a3X;
    }

    public void setH182a3X(String newValue) {
        _H182a3X = newValue;
    }

    public String getH182a4() {
        return _H182a4;
    }

    public void setH182a4(String newValue) {
        _H182a4 = newValue;
    }

    public String getH183a() {
        return _H183a;
    }

    public void setH183a(String newValue) {
        _H183a = newValue;
    }

    public String getH183a1() {
        return _H183a1;
    }

    public void setH183a1(String newValue) {
        _H183a1 = newValue;
    }

    public String getH183a1X() {
        return _H183a1X;
    }

    public void setH183a1X(String newValue) {
        _H183a1X = newValue;
    }

    public String getH183a2() {
        return _H183a2;
    }

    public void setH183a2(String newValue) {
        _H183a2 = newValue;
    }

    public String getH183a2X() {
        return _H183a2X;
    }

    public void setH183a2X(String newValue) {
        _H183a2X = newValue;
    }

    public String getH183a3() {
        return _H183a3;
    }

    public void setH183a3(String newValue) {
        _H183a3 = newValue;
    }

    public String getH183a3X() {
        return _H183a3X;
    }

    public void setH183a3X(String newValue) {
        _H183a3X = newValue;
    }

    public String getH183a4() {
        return _H183a4;
    }

    public void setH183a4(String newValue) {
        _H183a4 = newValue;
    }

    public String getH184a() {
        return _H184a;
    }

    public void setH184a(String newValue) {
        _H184a = newValue;
    }

    public String getH184a1() {
        return _H184a1;
    }

    public void setH184a1(String newValue) {
        _H184a1 = newValue;
    }

    public String getH184a1X() {
        return _H184a1X;
    }

    public void setH184a1X(String newValue) {
        _H184a1X = newValue;
    }

    public String getH184a2() {
        return _H184a2;
    }

    public void setH184a2(String newValue) {
        _H184a2 = newValue;
    }

    public String getH184a2X() {
        return _H184a2X;
    }

    public void setH184a2X(String newValue) {
        _H184a2X = newValue;
    }

    public String getH184a3() {
        return _H184a3;
    }

    public void setH184a3(String newValue) {
        _H184a3 = newValue;
    }

    public String getH184a3X() {
        return _H184a3X;
    }

    public void setH184a3X(String newValue) {
        _H184a3X = newValue;
    }

    public String getH184a4() {
        return _H184a4;
    }

    public void setH184a4(String newValue) {
        _H184a4 = newValue;
    }

    public String getH185a() {
        return _H185a;
    }

    public void setH185a(String newValue) {
        _H185a = newValue;
    }

    public String getH185a1() {
        return _H185a1;
    }

    public void setH185a1(String newValue) {
        _H185a1 = newValue;
    }

    public String getH185a1X() {
        return _H185a1X;
    }

    public void setH185a1X(String newValue) {
        _H185a1X = newValue;
    }

    public String getH185a2() {
        return _H185a2;
    }

    public void setH185a2(String newValue) {
        _H185a2 = newValue;
    }

    public String getH185a2X() {
        return _H185a2X;
    }

    public void setH185a2X(String newValue) {
        _H185a2X = newValue;
    }

    public String getH185a3() {
        return _H185a3;
    }

    public void setH185a3(String newValue) {
        _H185a3 = newValue;
    }

    public String getH185a3X() {
        return _H185a3X;
    }

    public void setH185a3X(String newValue) {
        _H185a3X = newValue;
    }

    public String getH185a5() {
        return _H185a5;
    }

    public void setH185a5(String newValue) {
        _H185a5 = newValue;
    }

    public String getH185a4() {
        return _H185a4;
    }

    public void setH185a4(String newValue) {
        _H185a4 = newValue;
    }

    public String getH186a() {
        return _H186a;
    }

    public void setH186a(String newValue) {
        _H186a = newValue;
    }

    public String getH186a1() {
        return _H186a1;
    }

    public void setH186a1(String newValue) {
        _H186a1 = newValue;
    }

    public String getH186a1X() {
        return _H186a1X;
    }

    public void setH186a1X(String newValue) {
        _H186a1X = newValue;
    }

    public String getH186a2() {
        return _H186a2;
    }

    public void setH186a2(String newValue) {
        _H186a2 = newValue;
    }

    public String getH186a2X() {
        return _H186a2X;
    }

    public void setH186a2X(String newValue) {
        _H186a2X = newValue;
    }

    public String getH186a3() {
        return _H186a3;
    }

    public void setH186a3(String newValue) {
        _H186a3 = newValue;
    }

    public String getH186a3X() {
        return _H186a3X;
    }

    public void setH186a3X(String newValue) {
        _H186a3X = newValue;
    }

    public String getH186a4() {
        return _H186a4;
    }

    public void setH186a4(String newValue) {
        _H186a4 = newValue;
    }


    public String getH186a5() {
        return _H186a5;
    }

    public void setH186a5(String newValue) {
        _H186a5 = newValue;
    }

    public String getH187a() {
        return _H187a;
    }

    public void setH187a(String newValue) {
        _H187a = newValue;
    }

    public String getH187a1() {
        return _H187a1;
    }

    public void setH187a1(String newValue) {
        _H187a1 = newValue;
    }

    public String getH187a1X() {
        return _H187a1X;
    }

    public void setH187a1X(String newValue) {
        _H187a1X = newValue;
    }

    public String getH187a2() {
        return _H187a2;
    }

    public void setH187a2(String newValue) {
        _H187a2 = newValue;
    }

    public String getH187a2X() {
        return _H187a2X;
    }

    public void setH187a2X(String newValue) {
        _H187a2X = newValue;
    }

    public String getH187a3() {
        return _H187a3;
    }

    public void setH187a3(String newValue) {
        _H187a3 = newValue;
    }

    public String getH187a3X() {
        return _H187a3X;
    }

    public void setH187a3X(String newValue) {
        _H187a3X = newValue;
    }

    public String getH187a4() {
        return _H187a4;
    }

    public void setH187a4(String newValue) {
        _H187a4 = newValue;
    }

    public String getH188a() {
        return _H188a;
    }

    public void setH188a(String newValue) {
        _H188a = newValue;
    }

    public String getH188a1() {
        return _H188a1;
    }

    public void setH188a1(String newValue) {
        _H188a1 = newValue;
    }

    public String getH188a1X() {
        return _H188a1X;
    }

    public void setH188a1X(String newValue) {
        _H188a1X = newValue;
    }

    public String getH188a2() {
        return _H188a2;
    }

    public void setH188a2(String newValue) {
        _H188a2 = newValue;
    }

    public String getH188a2X() {
        return _H188a2X;
    }

    public void setH188a2X(String newValue) {
        _H188a2X = newValue;
    }

    public String getH188a3() {
        return _H188a3;
    }

    public void setH188a3(String newValue) {
        _H188a3 = newValue;
    }

    public String getH1881a3X() {
        return _H1881a3X;
    }

    public void setH1881a3X(String newValue) {
        _H1881a3X = newValue;
    }

    public String getH188a4() {
        return _H188a4;
    }

    public void setH188a4(String newValue) {
        _H188a4 = newValue;
    }

    public String getH189a() {
        return _H189a;
    }

    public void setH189a(String newValue) {
        _H189a = newValue;
    }

    public String getH189a1() {
        return _H189a1;
    }

    public void setH189a1(String newValue) {
        _H189a1 = newValue;
    }

    public String getH189a1X() {
        return _H189a1X;
    }

    public void setH189a1X(String newValue) {
        _H189a1X = newValue;
    }

    public String getH189a2() {
        return _H189a2;
    }

    public void setH189a2(String newValue) {
        _H189a2 = newValue;
    }

    public String getH189a2X() {
        return _H189a2X;
    }

    public void setH189a2X(String newValue) {
        _H189a2X = newValue;
    }

    public String getH189a3() {
        return _H189a3;
    }

    public void setH189a3(String newValue) {
        _H189a3 = newValue;
    }

    public String getH189a3X() {
        return _H189a3X;
    }

    public void setH189a3X(String newValue) {
        _H189a3X = newValue;
    }

    public String getH189a4() {
        return _H189a4;
    }

    public void setH189a4(String newValue) {
        _H189a4 = newValue;
    }

    public String getH1810a() {
        return _H1810a;
    }

    public void setH1810a(String newValue) {
        _H1810a = newValue;
    }

    public String getH1810a1() {
        return _H1810a1;
    }

    public void setH1810a1(String newValue) {
        _H1810a1 = newValue;
    }

    public String getH1810a1X() {
        return _H1810a1X;
    }

    public void setH1810a1X(String newValue) {
        _H1810a1X = newValue;
    }

    public String getH1810a2() {
        return _H1810a2;
    }

    public void setH1810a2(String newValue) {
        _H1810a2 = newValue;
    }

    public String getH1810a2X() {
        return _H1810a2X;
    }

    public void setH1810a2X(String newValue) {
        _H1810a2X = newValue;
    }

    public String getH1810a3() {
        return _H1810a3;
    }

    public void setH1810a3(String newValue) {
        _H1810a3 = newValue;
    }

    public String getH1810a3X() {
        return _H1810a3X;
    }

    public void setH1810a3X(String newValue) {
        _H1810a3X = newValue;
    }

    public String getH1810a4() {
        return _H1810a4;
    }

    public void setH1810a4(String newValue) {
        _H1810a4 = newValue;
    }

    public String getH1811a() {
        return _H1811a;
    }

    public void setH1811a(String newValue) {
        _H1811a = newValue;
    }

    public String getH1811a1() {
        return _H1811a1;
    }

    public void setH1811a1(String newValue) {
        _H1811a1 = newValue;
    }

    public String getH1811a1X() {
        return _H1811a1X;
    }

    public void setH1811a1X(String newValue) {
        _H1811a1X = newValue;
    }

    public String getH1811a2() {
        return _H1811a2;
    }

    public void setH1811a2(String newValue) {
        _H1811a2 = newValue;
    }

    public String getH1811a2X() {
        return _H1811a2X;
    }

    public void setH1811a2X(String newValue) {
        _H1811a2X = newValue;
    }

    public String getH1811a3() {
        return _H1811a3;
    }

    public void setH1811a3(String newValue) {
        _H1811a3 = newValue;
    }

    public String getH1811a3X() {
        return _H1811a3X;
    }

    public void setH1811a3X(String newValue) {
        _H1811a3X = newValue;
    }

    public String getH1811a4() {
        return _H1811a4;
    }

    public void setH1811a4(String newValue) {
        _H1811a4 = newValue;
    }

    public String getH1812a() {
        return _H1812a;
    }

    public void setH1812a(String newValue) {
        _H1812a = newValue;
    }

    public String getH1812a1() {
        return _H1812a1;
    }

    public void setH1812a1(String newValue) {
        _H1812a1 = newValue;
    }

    public String getH1812a1X() {
        return _H1812a1X;
    }

    public void setH1812a1X(String newValue) {
        _H1812a1X = newValue;
    }

    public String getH1812a2() {
        return _H1812a2;
    }

    public void setH1812a2(String newValue) {
        _H1812a2 = newValue;
    }

    public String getH1812a2X() {
        return _H1812a2X;
    }

    public void setH1812a2X(String newValue) {
        _H1812a2X = newValue;
    }

    public String getH1812a3() {
        return _H1812a3;
    }

    public void setH1812a3(String newValue) {
        _H1812a3 = newValue;
    }

    public String getH1812a3X() {
        return _H1812a3X;
    }

    public void setH1812a3X(String newValue) {
        _H1812a3X = newValue;
    }

    public String getH1812a4() {
        return _H1812a4;
    }

    public void setH1812a4(String newValue) {
        _H1812a4 = newValue;
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,H181a,H181a1,H181a1X,H181a2,H181a2X,H181a3,H181a3X,H181a4,H182a,H182a1,H182a1X,H182a2,H182a2X,H182a3,H182a3X,H182a4,H183a,H183a1,H183a1X,H183a2,H183a2X,H183a3,H183a3X,H183a4,H184a,H184a1,H184a1X,H184a2,H184a2X,H184a3,H184a3X,H184a4,H185a,H185a1,H185a1X,H185a2,H185a2X,H185a3,H185a3X,H185a4,H185a5,H186a,H186a1,H186a1X,H186a2,H186a2X,H186a3,H186a3X,H186a4,H186a5,H187a,H187a1,H187a1X,H187a2,H187a2X,H187a3,H187a3X,H187a4,H188a,H188a1,H188a1X,H188a2,H188a2X,H188a3,H1881a3X,H188a4,H189a,H189a1,H189a1X,H189a2,H189a2X,H189a3,H189a3X,H189a4,H1810a,H1810a1,H1810a1X,H1810a2,H1810a2X,H1810a3,H1810a3X,H1810a4,H1811a,H1811a1,H1811a1X,H1811a2,H1811a2X,H1811a3,H1811a3X,H1811a4,H1812a,H1812a1,H1812a1X,H1812a2,H1812a2X,H1812a3,H1812a3X,H1812a4,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _H181a + "', '" + _H181a1 + "', '" + _H181a1X + "', '" + _H181a2 + "', '" + _H181a2X + "', '" + _H181a3 + "', '" + _H181a3X + "', '" + _H181a4 + "', '" + _H182a + "', '" + _H182a1 + "', '" + _H182a1X + "', '" + _H182a2 + "', '" + _H182a2X + "', '" + _H182a3 + "', '" + _H182a3X + "', '" + _H182a4 + "', '" + _H183a + "', '" + _H183a1 + "', '" + _H183a1X + "', '" + _H183a2 + "', '" + _H183a2X + "', '" + _H183a3 + "', '" + _H183a3X + "', '" + _H183a4 + "', '" + _H184a + "', '" + _H184a1 + "', '" + _H184a1X + "', '" + _H184a2 + "', '" + _H184a2X + "', '" + _H184a3 + "', '" + _H184a3X + "', '" + _H184a4 + "', '" + _H185a + "', '" + _H185a1 + "', '" + _H185a1X + "', '" + _H185a2 + "', '" + _H185a2X + "', '" + _H185a3 + "', '" + _H185a3X + "', '" + _H185a4 + "', '" + _H185a5 + "', '" + _H186a + "', '" + _H186a1 + "', '" + _H186a1X + "', '" + _H186a2 + "', '" + _H186a2X + "', '" + _H186a3 + "', '" + _H186a3X + "', '" + _H186a4 + "', '" + _H186a5 + "', '" + _H187a + "', '" + _H187a1 + "', '" + _H187a1X + "', '" + _H187a2 + "', '" + _H187a2X + "', '" + _H187a3 + "', '" + _H187a3X + "', '" + _H187a4 + "', '" + _H188a + "', '" + _H188a1 + "', '" + _H188a1X + "', '" + _H188a2 + "', '" + _H188a2X + "', '" + _H188a3 + "', '" + _H1881a3X + "', '" + _H188a4 + "', '" + _H189a + "', '" + _H189a1 + "', '" + _H189a1X + "', '" + _H189a2 + "', '" + _H189a2X + "', '" + _H189a3 + "', '" + _H189a3X + "', '" + _H189a4 + "', '" + _H1810a + "', '" + _H1810a1 + "', '" + _H1810a1X + "', '" + _H1810a2 + "', '" + _H1810a2X + "', '" + _H1810a3 + "', '" + _H1810a3X + "', '" + _H1810a4 + "', '" + _H1811a + "', '" + _H1811a1 + "', '" + _H1811a1X + "', '" + _H1811a2 + "', '" + _H1811a2X + "', '" + _H1811a3 + "', '" + _H1811a3X + "', '" + _H1811a4 + "', '" + _H1812a + "', '" + _H1812a1 + "', '" + _H1812a1X + "', '" + _H1812a2 + "', '" + _H1812a2X + "', '" + _H1812a3 + "', '" + _H1812a3X + "', '" + _H1812a4 + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',H181a = '" + _H181a + "',H181a1 = '" + _H181a1 + "',H181a1X = '" + _H181a1X + "',H181a2 = '" + _H181a2 + "',H181a2X = '" + _H181a2X + "',H181a3 = '" + _H181a3 + "',H181a3X = '" + _H181a3X + "',H181a4 = '" + _H181a4 + "',H182a = '" + _H182a + "',H182a1 = '" + _H182a1 + "',H182a1X = '" + _H182a1X + "',H182a2 = '" + _H182a2 + "',H182a2X = '" + _H182a2X + "',H182a3 = '" + _H182a3 + "',H182a3X = '" + _H182a3X + "',H182a4 = '" + _H182a4 + "',H183a = '" + _H183a + "',H183a1 = '" + _H183a1 + "',H183a1X = '" + _H183a1X + "',H183a2 = '" + _H183a2 + "',H183a2X = '" + _H183a2X + "',H183a3 = '" + _H183a3 + "',H183a3X = '" + _H183a3X + "',H183a4 = '" + _H183a4 + "',H184a = '" + _H184a + "',H184a1 = '" + _H184a1 + "',H184a1X = '" + _H184a1X + "',H184a2 = '" + _H184a2 + "',H184a2X = '" + _H184a2X + "',H184a3 = '" + _H184a3 + "',H184a3X = '" + _H184a3X + "',H184a4 = '" + _H184a4 + "',H185a = '" + _H185a + "',H185a1 = '" + _H185a1 + "',H185a1X = '" + _H185a1X + "',H185a2 = '" + _H185a2 + "',H185a2X = '" + _H185a2X + "',H185a3 = '" + _H185a3 + "',H185a3X = '" + _H185a3X + "',H185a4 = '" + _H185a4 + "',H185a5 = '" + _H185a5 + "',H186a = '" + _H186a + "',H186a1 = '" + _H186a1 + "',H186a1X = '" + _H186a1X + "',H186a2 = '" + _H186a2 + "',H186a2X = '" + _H186a2X + "',H186a3 = '" + _H186a3 + "',H186a3X = '" + _H186a3X + "',H186a4 = '" + _H186a4 + "',H186a5 = '" + _H186a5 + "',H187a = '" + _H187a + "',H187a1 = '" + _H187a1 + "',H187a1X = '" + _H187a1X + "',H187a2 = '" + _H187a2 + "',H187a2X = '" + _H187a2X + "',H187a3 = '" + _H187a3 + "',H187a3X = '" + _H187a3X + "',H187a4 = '" + _H187a4 + "',H188a = '" + _H188a + "',H188a1 = '" + _H188a1 + "',H188a1X = '" + _H188a1X + "',H188a2 = '" + _H188a2 + "',H188a2X = '" + _H188a2X + "',H188a3 = '" + _H188a3 + "',H1881a3X = '" + _H1881a3X + "',H188a4 = '" + _H188a4 + "',H189a = '" + _H189a + "',H189a1 = '" + _H189a1 + "',H189a1X = '" + _H189a1X + "',H189a2 = '" + _H189a2 + "',H189a2X = '" + _H189a2X + "',H189a3 = '" + _H189a3 + "',H189a3X = '" + _H189a3X + "',H189a4 = '" + _H189a4 + "',H1810a = '" + _H1810a + "',H1810a1 = '" + _H1810a1 + "',H1810a1X = '" + _H1810a1X + "',H1810a2 = '" + _H1810a2 + "',H1810a2X = '" + _H1810a2X + "',H1810a3 = '" + _H1810a3 + "',H1810a3X = '" + _H1810a3X + "',H1810a4 = '" + _H1810a4 + "',H1811a = '" + _H1811a + "',H1811a1 = '" + _H1811a1 + "',H1811a1X = '" + _H1811a1X + "',H1811a2 = '" + _H1811a2 + "',H1811a2X = '" + _H1811a2X + "',H1811a3 = '" + _H1811a3 + "',H1811a3X = '" + _H1811a3X + "',H1811a4 = '" + _H1811a4 + "',H1812a = '" + _H1812a + "',H1812a1 = '" + _H1812a1 + "',H1812a1X = '" + _H1812a1X + "',H1812a2 = '" + _H1812a2 + "',H1812a2X = '" + _H1812a2X + "',H1812a3 = '" + _H1812a3 + "',H1812a3X = '" + _H1812a3X + "',H1812a4 = '" + _H1812a4 + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<Careseek_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<Careseek_DataModel> data = new ArrayList<Careseek_DataModel>();
        Careseek_DataModel d = new Careseek_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new Careseek_DataModel();
            d._Rnd = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._H181a = cur.getString(cur.getColumnIndex("H181a"));
            d._H181a1 = cur.getString(cur.getColumnIndex("H181a1"));
            d._H181a1X = cur.getString(cur.getColumnIndex("H181a1X"));
            d._H181a2 = cur.getString(cur.getColumnIndex("H181a2"));
            d._H181a2X = cur.getString(cur.getColumnIndex("H181a2X"));
            d._H181a3 = cur.getString(cur.getColumnIndex("H181a3"));
            d._H181a3X = cur.getString(cur.getColumnIndex("H181a3X"));
            d._H181a4 = cur.getString(cur.getColumnIndex("H181a4"));
            d._H182a = cur.getString(cur.getColumnIndex("H182a"));
            d._H182a1 = cur.getString(cur.getColumnIndex("H182a1"));
            d._H182a1X = cur.getString(cur.getColumnIndex("H182a1X"));
            d._H182a2 = cur.getString(cur.getColumnIndex("H182a2"));
            d._H182a2X = cur.getString(cur.getColumnIndex("H182a2X"));
            d._H182a3 = cur.getString(cur.getColumnIndex("H182a3"));
            d._H182a3X = cur.getString(cur.getColumnIndex("H182a3X"));
            d._H182a4 = cur.getString(cur.getColumnIndex("H182a4"));
            d._H183a = cur.getString(cur.getColumnIndex("H183a"));
            d._H183a1 = cur.getString(cur.getColumnIndex("H183a1"));
            d._H183a1X = cur.getString(cur.getColumnIndex("H183a1X"));
            d._H183a2 = cur.getString(cur.getColumnIndex("H183a2"));
            d._H183a2X = cur.getString(cur.getColumnIndex("H183a2X"));
            d._H183a3 = cur.getString(cur.getColumnIndex("H183a3"));
            d._H183a3X = cur.getString(cur.getColumnIndex("H183a3X"));
            d._H183a4 = cur.getString(cur.getColumnIndex("H183a4"));
            d._H184a = cur.getString(cur.getColumnIndex("H184a"));
            d._H184a1 = cur.getString(cur.getColumnIndex("H184a1"));
            d._H184a1X = cur.getString(cur.getColumnIndex("H184a1X"));
            d._H184a2 = cur.getString(cur.getColumnIndex("H184a2"));
            d._H184a2X = cur.getString(cur.getColumnIndex("H184a2X"));
            d._H184a3 = cur.getString(cur.getColumnIndex("H184a3"));
            d._H184a3X = cur.getString(cur.getColumnIndex("H184a3X"));
            d._H184a4 = cur.getString(cur.getColumnIndex("H184a4"));
            d._H185a = cur.getString(cur.getColumnIndex("H185a"));
            d._H185a1 = cur.getString(cur.getColumnIndex("H185a1"));
            d._H185a1X = cur.getString(cur.getColumnIndex("H185a1X"));
            d._H185a2 = cur.getString(cur.getColumnIndex("H185a2"));
            d._H185a2X = cur.getString(cur.getColumnIndex("H185a2X"));
            d._H185a3 = cur.getString(cur.getColumnIndex("H185a3"));
            d._H185a3X = cur.getString(cur.getColumnIndex("H185a3X"));
            d._H185a4 = cur.getString(cur.getColumnIndex("H185a4"));
            d._H185a5 = cur.getString(cur.getColumnIndex("H185a5"));
            d._H186a = cur.getString(cur.getColumnIndex("H186a"));
            d._H186a1 = cur.getString(cur.getColumnIndex("H186a1"));
            d._H186a1X = cur.getString(cur.getColumnIndex("H186a1X"));
            d._H186a2 = cur.getString(cur.getColumnIndex("H186a2"));
            d._H186a2X = cur.getString(cur.getColumnIndex("H186a2X"));
            d._H186a3 = cur.getString(cur.getColumnIndex("H186a3"));
            d._H186a3X = cur.getString(cur.getColumnIndex("H186a3X"));
            d._H186a4 = cur.getString(cur.getColumnIndex("H186a4"));
            d._H186a5 = cur.getString(cur.getColumnIndex("H186a5"));
            d._H187a = cur.getString(cur.getColumnIndex("H187a"));
            d._H187a1 = cur.getString(cur.getColumnIndex("H187a1"));
            d._H187a1X = cur.getString(cur.getColumnIndex("H187a1X"));
            d._H187a2 = cur.getString(cur.getColumnIndex("H187a2"));
            d._H187a2X = cur.getString(cur.getColumnIndex("H187a2X"));
            d._H187a3 = cur.getString(cur.getColumnIndex("H187a3"));
            d._H187a3X = cur.getString(cur.getColumnIndex("H187a3X"));
            d._H187a4 = cur.getString(cur.getColumnIndex("H187a4"));
            d._H188a = cur.getString(cur.getColumnIndex("H188a"));
            d._H188a1 = cur.getString(cur.getColumnIndex("H188a1"));
            d._H188a1X = cur.getString(cur.getColumnIndex("H188a1X"));
            d._H188a2 = cur.getString(cur.getColumnIndex("H188a2"));
            d._H188a2X = cur.getString(cur.getColumnIndex("H188a2X"));
            d._H188a3 = cur.getString(cur.getColumnIndex("H188a3"));
            d._H1881a3X = cur.getString(cur.getColumnIndex("H1881a3X"));
            d._H188a4 = cur.getString(cur.getColumnIndex("H188a4"));
            d._H189a = cur.getString(cur.getColumnIndex("H189a"));
            d._H189a1 = cur.getString(cur.getColumnIndex("H189a1"));
            d._H189a1X = cur.getString(cur.getColumnIndex("H189a1X"));
            d._H189a2 = cur.getString(cur.getColumnIndex("H189a2"));
            d._H189a2X = cur.getString(cur.getColumnIndex("H189a2X"));
            d._H189a3 = cur.getString(cur.getColumnIndex("H189a3"));
            d._H189a3X = cur.getString(cur.getColumnIndex("H189a3X"));
            d._H189a4 = cur.getString(cur.getColumnIndex("H189a4"));
            d._H1810a = cur.getString(cur.getColumnIndex("H1810a"));
            d._H1810a1 = cur.getString(cur.getColumnIndex("H1810a1"));
            d._H1810a1X = cur.getString(cur.getColumnIndex("H1810a1X"));
            d._H1810a2 = cur.getString(cur.getColumnIndex("H1810a2"));
            d._H1810a2X = cur.getString(cur.getColumnIndex("H1810a2X"));
            d._H1810a3 = cur.getString(cur.getColumnIndex("H1810a3"));
            d._H1810a3X = cur.getString(cur.getColumnIndex("H1810a3X"));
            d._H1810a4 = cur.getString(cur.getColumnIndex("H1810a4"));
            d._H1811a = cur.getString(cur.getColumnIndex("H1811a"));
            d._H1811a1 = cur.getString(cur.getColumnIndex("H1811a1"));
            d._H1811a1X = cur.getString(cur.getColumnIndex("H1811a1X"));
            d._H1811a2 = cur.getString(cur.getColumnIndex("H1811a2"));
            d._H1811a2X = cur.getString(cur.getColumnIndex("H1811a2X"));
            d._H1811a3 = cur.getString(cur.getColumnIndex("H1811a3"));
            d._H1811a3X = cur.getString(cur.getColumnIndex("H1811a3X"));
            d._H1811a4 = cur.getString(cur.getColumnIndex("H1811a4"));
            d._H1812a = cur.getString(cur.getColumnIndex("H1812a"));
            d._H1812a1 = cur.getString(cur.getColumnIndex("H1812a1"));
            d._H1812a1X = cur.getString(cur.getColumnIndex("H1812a1X"));
            d._H1812a2 = cur.getString(cur.getColumnIndex("H1812a2"));
            d._H1812a2X = cur.getString(cur.getColumnIndex("H1812a2X"));
            d._H1812a3 = cur.getString(cur.getColumnIndex("H1812a3"));
            d._H1812a3X = cur.getString(cur.getColumnIndex("H1812a3X"));
            d._H1812a4 = cur.getString(cur.getColumnIndex("H1812a4"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}