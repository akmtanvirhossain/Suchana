package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class IGA_DataModel {

    String TableName = "IGA";
    Connection C;
    private String _RND = "";
    private String _SuchanaID = "";
    private String _H18b1a = "";
    private String _H18b2a = "";
    private String _H18b2a1 = "";
    private String _H18b2a2 = "";
    private String _H18b2a3 = "";
    private String _H18b2a4 = "";
    private String _H18b2a5 = "";
    private String _H18b2a6 = "";
    private String _H18b2a7 = "";
    private String _H18b2a7X = "";
    private String _H18b1b = "";
    private String _H18b2b = "";
    private String _H18b2b1 = "";
    private String _H18b2b2 = "";
    private String _H18b2b3 = "";
    private String _H18b2b4 = "";
    private String _H18b2b5 = "";
    private String _H18b2b6 = "";
    private String _H18b2b7 = "";
    private String _H18b2b7X = "";
    private String _H18b1c = "";
    private String _H18b2c = "";
    private String _H18b2c1 = "";
    private String _H18b2c2 = "";
    private String _H18b2c3 = "";
    private String _H18b2c4 = "";
    private String _H18b2c5 = "";
    private String _H18b2c6 = "";
    private String _H18b2c7 = "";
    private String _H18b2c7X = "";
    private String _H18b1d = "";
    private String _H18b2d = "";
    private String _H18b2d1 = "";
    private String _H18b2d2 = "";
    private String _H18b2d3 = "";
    private String _H18b2d4 = "";
    private String _H18b2d5 = "";
    private String _H18b2d6 = "";
    private String _H18b2d7 = "";
    private String _H18b2d7X = "";
    private String _H18b1e = "";
    private String _H18b2e = "";
    private String _H18b2e1 = "";
    private String _H18b2e2 = "";
    private String _H18b2e3 = "";
    private String _H18b2e4 = "";
    private String _H18b2e5 = "";
    private String _H18b2e6 = "";
    private String _H18b2e7 = "";
    private String _H18b2e7X = "";
    private String _H18b1f = "";
    private String _H18b2f = "";
    private String _H18b2f1 = "";
    private String _H18b2f2 = "";
    private String _H18b2f3 = "";
    private String _H18b2f4 = "";
    private String _H18b2f5 = "";
    private String _H18b2f6 = "";
    private String _H18b2f7 = "";
    private String _H18b2f7X = "";
    private String _H18b1g = "";
    private String _H18b2g = "";
    private String _H18b2g1 = "";
    private String _H18b2g2 = "";
    private String _H18b2g3 = "";
    private String _H18b2g4 = "";
    private String _H18b2g5 = "";
    private String _H18b2g6 = "";
    private String _H18b2g7 = "";
    private String _H18b2g7X = "";
    private String _H18b1h = "";
    private String _H18b2h = "";
    private String _H18b2h1 = "";
    private String _H18b2h2 = "";
    private String _H18b2h3 = "";
    private String _H18b2h4 = "";
    private String _H18b2h5 = "";
    private String _H18b2h6 = "";
    private String _H18b2h7 = "";
    private String _H18b2h7X = "";
    private String _H18b1i = "";
    private String _H18b2i = "";
    private String _H18b2i1 = "";
    private String _H18b2i2 = "";
    private String _H18b2i3 = "";
    private String _H18b2i4 = "";
    private String _H18b2i5 = "";
    private String _H18b2i5X = "";
    private String _H18b1j = "";
    private String _H18b2j = "";
    private String _H18b2j1 = "";
    private String _H18b2j2 = "";
    private String _H18b2j3 = "";
    private String _H18b2j4 = "";
    private String _H18b2j5 = "";
    private String _H18b2j5X = "";
    private String _H18b1k = "";
    private String _H18b2kX = "";
    private String _StartTime = "";
    private String _EndTime = "";
    private String _UserId = "";
    private String _EntryUser = "";
    private String _Lat = "";
    private String _Lon = "";
    private String _EnDt = "";
    private String _Upload = "2";

    public String getRND() {
        return _RND;
    }

    public void setRND(String newValue) {
        _RND = newValue;
    }

    public String getSuchanaID() {
        return _SuchanaID;
    }

    public void setSuchanaID(String newValue) {
        _SuchanaID = newValue;
    }

    public String getH18b1a() {
        return _H18b1a;
    }

    public void setH18b1a(String newValue) {
        _H18b1a = newValue;
    }
    public String getH18b2a() {
        return _H18b2a;
    }
    public void setH18b2a(String newValue) {
        _H18b2a = newValue;
    }


    public String getH18b2a1() {
        return _H18b2a1;
    }



    public void setH18b2a1(String newValue) {
        _H18b2a1 = newValue;
    }

    public String getH18b2a2() {
        return _H18b2a2;
    }

    public void setH18b2a2(String newValue) {
        _H18b2a2 = newValue;
    }

    public String getH18b2a3() {
        return _H18b2a3;
    }

    public void setH18b2a3(String newValue) {
        _H18b2a3 = newValue;
    }

    public String getH18b2a4() {
        return _H18b2a4;
    }

    public void setH18b2a4(String newValue) {
        _H18b2a4 = newValue;
    }

    public String getH18b2a5() {
        return _H18b2a5;
    }

    public void setH18b2a5(String newValue) {
        _H18b2a5 = newValue;
    }

    public String getH18b2a6() {
        return _H18b2a6;
    }

    public void setH18b2a6(String newValue) {
        _H18b2a6 = newValue;
    }

    public String getH18b2a7() {
        return _H18b2a7;
    }

    public void setH18b2a7(String newValue) {
        _H18b2a7 = newValue;
    }

    public String getH18b2a7X() {
        return _H18b2a7X;
    }

    public void setH18b2a7X(String newValue) {
        _H18b2a7X = newValue;
    }

    public String getH18b1b() {
        return _H18b1b;
    }

    public void setH18b1b(String newValue) {
        _H18b1b = newValue;
    }
    public String getH18b2b() {
        return _H18b2b;
    }
    public void setH18b2b(String newValue) {
        _H18b2b = newValue;
    }


    public String getH18b2b1() {
        return _H18b2b1;
    }

    public void setH18b2b1(String newValue) {
        _H18b2b1 = newValue;
    }

    public String getH18b2b2() {
        return _H18b2b2;
    }

    public void setH18b2b2(String newValue) {
        _H18b2b2 = newValue;
    }

    public String getH18b2b3() {
        return _H18b2b3;
    }

    public void setH18b2b3(String newValue) {
        _H18b2b3 = newValue;
    }

    public String getH18b2b4() {
        return _H18b2b4;
    }

    public void setH18b2b4(String newValue) {
        _H18b2b4 = newValue;
    }

    public String getH18b2b5() {
        return _H18b2b5;
    }

    public void setH18b2b5(String newValue) {
        _H18b2b5 = newValue;
    }

    public String getH18b2b6() {
        return _H18b2b6;
    }

    public void setH18b2b6(String newValue) {
        _H18b2b6 = newValue;
    }

    public String getH18b2b7() {
        return _H18b2b7;
    }

    public void setH18b2b7(String newValue) {
        _H18b2b7 = newValue;
    }

    public String getH18b2b7X() {
        return _H18b2b7X;
    }

    public void setH18b2b7X(String newValue) {
        _H18b2b7X = newValue;
    }

    public String getH18b1c() {
        return _H18b1c;
    }

    public void setH18b1c(String newValue) {
        _H18b1c = newValue;
    }

    public String getH18b2c() {
        return _H18b2c;
    }
    public void setH18b2c(String newValue) {
        _H18b2c = newValue;
    }


    public String getH18b2c1() {
        return _H18b2c1;
    }

    public void setH18b2c1(String newValue) {
        _H18b2c1 = newValue;
    }

    public String getH18b2c2() {
        return _H18b2c2;
    }

    public void setH18b2c2(String newValue) {
        _H18b2c2 = newValue;
    }

    public String getH18b2c3() {
        return _H18b2c3;
    }

    public void setH18b2c3(String newValue) {
        _H18b2c3 = newValue;
    }

    public String getH18b2c4() {
        return _H18b2c4;
    }

    public void setH18b2c4(String newValue) {
        _H18b2c4 = newValue;
    }

    public String getH18b2c5() {
        return _H18b2c5;
    }

    public void setH18b2c5(String newValue) {
        _H18b2c5 = newValue;
    }

    public String getH18b2c6() {
        return _H18b2c6;
    }

    public void setH18b2c6(String newValue) {
        _H18b2c6 = newValue;
    }

    public String getH18b2c7() {
        return _H18b2c7;
    }

    public void setH18b2c7(String newValue) {
        _H18b2c7 = newValue;
    }

    public String getH18b2c7X() {
        return _H18b2c7X;
    }

    public void setH18b2c7X(String newValue) {
        _H18b2c7X = newValue;
    }

    public String getH18b1d() {
        return _H18b1d;
    }

    public void setH18b1d(String newValue) {
        _H18b1d = newValue;
    }

    public String getH18b2d() {
        return _H18b2d;
    }
    public void setH18b2d(String newValue) {
        _H18b2d = newValue;
    }


    public String getH18b2d1() {
        return _H18b2d1;
    }

    public void setH18b2d1(String newValue) {
        _H18b2d1 = newValue;
    }

    public String getH18b2d2() {
        return _H18b2d2;
    }

    public void setH18b2d2(String newValue) {
        _H18b2d2 = newValue;
    }

    public String getH18b2d3() {
        return _H18b2d3;
    }

    public void setH18b2d3(String newValue) {
        _H18b2d3 = newValue;
    }

    public String getH18b2d4() {
        return _H18b2d4;
    }

    public void setH18b2d4(String newValue) {
        _H18b2d4 = newValue;
    }

    public String getH18b2d5() {
        return _H18b2d5;
    }

    public void setH18b2d5(String newValue) {
        _H18b2d5 = newValue;
    }

    public String getH18b2d6() {
        return _H18b2d6;
    }

    public void setH18b2d6(String newValue) {
        _H18b2d6 = newValue;
    }

    public String getH18b2d7() {
        return _H18b2d7;
    }

    public void setH18b2d7(String newValue) {
        _H18b2d7 = newValue;
    }

    public String getH18b2d7X() {
        return _H18b2d7X;
    }

    public void setH18b2d7X(String newValue) {
        _H18b2d7X = newValue;
    }

    public String getH18b1e() {
        return _H18b1e;
    }

    public void setH18b1e(String newValue) {
        _H18b1e = newValue;
    }

    public String getH18b2e() {
        return _H18b2e;
    }
    public void setH18b2e(String newValue) {
        _H18b2e = newValue;
    }


    public String getH18b2e1() {
        return _H18b2e1;
    }

    public void setH18b2e1(String newValue) {
        _H18b2e1 = newValue;
    }


    public String getH18b2e2() {
        return _H18b2e2;
    }

    public void setH18b2e2(String newValue) {
        _H18b2e2 = newValue;
    }

    public String getH18b2e3() {
        return _H18b2e3;
    }

    public void setH18b2e3(String newValue) {
        _H18b2e3 = newValue;
    }

    public String getH18b2e4() {
        return _H18b2e4;
    }

    public void setH18b2e4(String newValue) {
        _H18b2e4 = newValue;
    }

    public String getH18b2e5() {
        return _H18b2e5;
    }

    public void setH18b2e5(String newValue) {
        _H18b2e5 = newValue;
    }

    public String getH18b2e6() {
        return _H18b2e6;
    }

    public void setH18b2e6(String newValue) {
        _H18b2e6 = newValue;
    }

    public String getH18b2e7() {
        return _H18b2e7;
    }

    public void setH18b2e7(String newValue) {
        _H18b2e7 = newValue;
    }

    public String getH18b2e7X() {
        return _H18b2e7X;
    }

    public void setH18b2e7X(String newValue) {
        _H18b2e7X = newValue;
    }

    public String getH18b1f() {
        return _H18b1f;
    }

    public void setH18b1f(String newValue) {
        _H18b1f = newValue;
    }

    public String getH18b2f() {
        return _H18b2f;
    }
    public void setH18b2f(String newValue) {
        _H18b2f = newValue;
    }


    public String getH18b2f1() {
        return _H18b2f1;
    }

    public void setH18b2f1(String newValue) {
        _H18b2f1 = newValue;
    }

    public String getH18b2f2() {
        return _H18b2f2;
    }

    public void setH18b2f2(String newValue) {
        _H18b2f2 = newValue;
    }

    public String getH18b2f3() {
        return _H18b2f3;
    }

    public void setH18b2f3(String newValue) {
        _H18b2f3 = newValue;
    }

    public String getH18b2f4() {
        return _H18b2f4;
    }

    public void setH18b2f4(String newValue) {
        _H18b2f4 = newValue;
    }

    public String getH18b2f5() {
        return _H18b2f5;
    }

    public void setH18b2f5(String newValue) {
        _H18b2f5 = newValue;
    }

    public String getH18b2f6() {
        return _H18b2f6;
    }

    public void setH18b2f6(String newValue) {
        _H18b2f6 = newValue;
    }

    public String getH18b2f7() {
        return _H18b2f7;
    }

    public void setH18b2f7(String newValue) {
        _H18b2f7 = newValue;
    }

    public String getH18b2f7X() {
        return _H18b2f7X;
    }

    public void setH18b2f7X(String newValue) {
        _H18b2f7X = newValue;
    }

    public String getH18b1g() {
        return _H18b1g;
    }

    public void setH18b1g(String newValue) {
        _H18b1g = newValue;
    }

    public String getH18b2g() {
        return _H18b2g;
    }
    public void setH18b2g(String newValue) {
        _H18b2g = newValue;
    }


    public String getH18b2g1() {
        return _H18b2g1;
    }

    public void setH18b2g1(String newValue) {
        _H18b2g1 = newValue;
    }

    public String getH18b2g2() {
        return _H18b2g2;
    }

    public void setH18b2g2(String newValue) {
        _H18b2g2 = newValue;
    }

    public String getH18b2g3() {
        return _H18b2g3;
    }

    public void setH18b2g3(String newValue) {
        _H18b2g3 = newValue;
    }

    public String getH18b2g4() {
        return _H18b2g4;
    }

    public void setH18b2g4(String newValue) {
        _H18b2g4 = newValue;
    }

    public String getH18b2g5() {
        return _H18b2g5;
    }

    public void setH18b2g5(String newValue) {
        _H18b2g5 = newValue;
    }

    public String getH18b2g6() {
        return _H18b2g6;
    }

    public void setH18b2g6(String newValue) {
        _H18b2g6 = newValue;
    }

    public String getH18b2g7() {
        return _H18b2g7;
    }

    public void setH18b2g7(String newValue) {
        _H18b2g7 = newValue;
    }

    public String getH18b2g7X() {
        return _H18b2g7X;
    }

    public void setH18b2g7X(String newValue) {
        _H18b2g7X = newValue;
    }

    public String getH18b1h() {
        return _H18b1h;
    }

    public void setH18b1h(String newValue) {
        _H18b1h = newValue;
    }

    public String getH18b2h() {
        return _H18b2h;
    }
    public void setH18b2h(String newValue) {
        _H18b2h = newValue;
    }


    public String getH18b2h1() {
        return _H18b2h1;
    }

    public void setH18b2h1(String newValue) {
        _H18b2h1 = newValue;
    }

    public String getH18b2h2() {
        return _H18b2h2;
    }

    public void setH18b2h2(String newValue) {
        _H18b2h2 = newValue;
    }

    public String getH18b2h3() {
        return _H18b2h3;
    }

    public void setH18b2h3(String newValue) {
        _H18b2h3 = newValue;
    }

    public String getH18b2h4() {
        return _H18b2h4;
    }

    public void setH18b2h4(String newValue) {
        _H18b2h4 = newValue;
    }

    public String getH18b2h5() {
        return _H18b2h5;
    }

    public void setH18b2h5(String newValue) {
        _H18b2h5 = newValue;
    }

    public String getH18b2h6() {
        return _H18b2h6;
    }

    public void setH18b2h6(String newValue) {
        _H18b2h6 = newValue;
    }

    public String getH18b2h7() {
        return _H18b2h7;
    }

    public void setH18b2h7(String newValue) {
        _H18b2h7 = newValue;
    }

    public String getH18b2h7X() {
        return _H18b2h7X;
    }

    public void setH18b2h7X(String newValue) {
        _H18b2h7X = newValue;
    }

    public String getH18b1i() {
        return _H18b1i;
    }

    public void setH18b1i(String newValue) {
        _H18b1i = newValue;
    }

    public String getH18b2i() {
        return _H18b2i;
    }
    public void setH18b2i(String newValue) {
        _H18b2i = newValue;
    }


    public String getH18b2i1() {
        return _H18b2i1;
    }

    public void setH18b2i1(String newValue) {
        _H18b2i1 = newValue;
    }

    public String getH18b2i2() {
        return _H18b2i2;
    }

    public void setH18b2i2(String newValue) {
        _H18b2i2 = newValue;
    }

    public String getH18b2i3() {
        return _H18b2i3;
    }

    public void setH18b2i3(String newValue) {
        _H18b2i3 = newValue;
    }

    public String getH18b2i4() {
        return _H18b2i4;
    }

    public void setH18b2i4(String newValue) {
        _H18b2i4 = newValue;
    }

    public String getH18b2i5() {
        return _H18b2i5;
    }

    public void setH18b2i5(String newValue) {
        _H18b2i5 = newValue;
    }

    public String getH18b2i5X() {
        return _H18b2i5X;
    }

    public void setH18b2i5X(String newValue) {
        _H18b2i5X = newValue;
    }

    public String getH18b1j() {
        return _H18b1j;
    }

    public void setH18b1j(String newValue) {
        _H18b1j = newValue;
    }

    public String getH18b2j() {
        return _H18b2j;
    }
    public void setH18b2j(String newValue) {
        _H18b2j = newValue;
    }


    public String getH18b2j1() {
        return _H18b2j1;
    }

    public void setH18b2j1(String newValue) {
        _H18b2j1 = newValue;
    }

    public String getH18b2j2() {
        return _H18b2j2;
    }

    public void setH18b2j2(String newValue) {
        _H18b2j2 = newValue;
    }

    public String getH18b2j3() {
        return _H18b2j3;
    }

    public void setH18b2j3(String newValue) {
        _H18b2j3 = newValue;
    }

    public String getH18b2j4() {
        return _H18b2j4;
    }

    public void setH18b2j4(String newValue) {
        _H18b2j4 = newValue;
    }

    public String getH18b2j5() {
        return _H18b2j5;
    }

    public void setH18b2j5(String newValue) {
        _H18b2j5 = newValue;
    }

    public String getH18b2j5X() {
        return _H18b2j5X;
    }

    public void setH18b2j5X(String newValue) {
        _H18b2j5X = newValue;
    }

    public String getH18b1k() {
        return _H18b1k;
    }

    public void setH18b1k(String newValue) {
        _H18b1k = newValue;
    }

    public String getH18b2kX() {
        return _H18b2kX;
    }

    public void setH18b2kX(String newValue) {
        _H18b2kX = newValue;
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
            if (C.Existence("Select * from " + TableName + "  Where RND='" + _RND + "' and SuchanaID='" + _SuchanaID + "' "))
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
            SQL = "Insert into " + TableName + " (RND,SuchanaID,H18b1a,H18b2a,H18b2a1,H18b2a2,H18b2a3,H18b2a4,H18b2a5,H18b2a6,H18b2a7,H18b2a7X,H18b1b,H18b2b,H18b2b1,H18b2b2,H18b2b3,H18b2b4,H18b2b5,H18b2b6,H18b2b7,H18b2b7X,H18b1c,H18b2c,H18b2c1,H18b2c2,H18b2c3,H18b2c4,H18b2c5,H18b2c6,H18b2c7,H18b2c7X,H18b1d,H18b2d,H18b2d1,H18b2d2,H18b2d3,H18b2d4,H18b2d5,H18b2d6,H18b2d7,H18b2d7X,H18b1e,H18b2e,H18b2e1,H18b2e2,H18b2e3,H18b2e4,H18b2e5,H18b2e6,H18b2e7,H18b2e7X,H18b1f,H18b2f,H18b2f1,H18b2f2,H18b2f3,H18b2f4,H18b2f5,H18b2f6,H18b2f7,H18b2f7X,H18b1g,H18b2g,H18b2g1,H18b2g2,H18b2g3,H18b2g4,H18b2g5,H18b2g6,H18b2g7,H18b2g7X,H18b1h,H18b2h,H18b2h1,H18b2h2,H18b2h3,H18b2h4,H18b2h5,H18b2h6,H18b2h7,H18b2h7X,H18b1i,H18b2i,H18b2i1,H18b2i2,H18b2i3,H18b2i4,H18b2i5,H18b2i5X,H18b1j,H18b2j,H18b2j1,H18b2j2,H18b2j3,H18b2j4,H18b2j5,H18b2j5X,H18b1k,H18b2kX,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _RND + "', '" + _SuchanaID + "', '" + _H18b1a + "','" + _H18b2a + "', '" + _H18b2a1 + "', '" + _H18b2a2 + "', '" + _H18b2a3 + "', '" + _H18b2a4 + "', '" + _H18b2a5 + "', '" + _H18b2a6 + "', '" + _H18b2a7 + "', '" + _H18b2a7X + "', '" + _H18b1b + "','" + _H18b2b + "', '" + _H18b2b1 + "', '" + _H18b2b2 + "', '" + _H18b2b3 + "', '" + _H18b2b4 + "', '" + _H18b2b5 + "', '" + _H18b2b6 + "', '" + _H18b2b7 + "', '" + _H18b2b7X + "', '" + _H18b1c + "','" + _H18b2c + "', '" + _H18b2c1 + "', '" + _H18b2c2 + "', '" + _H18b2c3 + "', '" + _H18b2c4 + "', '" + _H18b2c5 + "', '" + _H18b2c6 + "', '" + _H18b2c7 + "', '" + _H18b2c7X + "', '" + _H18b1d + "','" + _H18b2d + "', '" + _H18b2d1 + "', '" + _H18b2d2 + "', '" + _H18b2d3 + "', '" + _H18b2d4 + "', '" + _H18b2d5 + "', '" + _H18b2d6 + "', '" + _H18b2d7 + "', '" + _H18b2d7X + "', '" + _H18b1e + "','" + _H18b2e + "', '" + _H18b2e1 + "', '" + _H18b2e2 + "', '" + _H18b2e3 + "', '" + _H18b2e4 + "', '" + _H18b2e5 + "', '" + _H18b2e6 + "', '" + _H18b2e7 + "', '" + _H18b2e7X + "', '" + _H18b1f + "','" + _H18b2f + "', '" + _H18b2f1 + "', '" + _H18b2f2 + "', '" + _H18b2f3 + "', '" + _H18b2f4 + "', '" + _H18b2f5 + "', '" + _H18b2f6 + "', '" + _H18b2f7 + "', '" + _H18b2f7X + "', '" + _H18b1g + "','" + _H18b2g + "', '" + _H18b2g1 + "', '" + _H18b2g2 + "', '" + _H18b2g3 + "', '" + _H18b2g4 + "', '" + _H18b2g5 + "', '" + _H18b2g6 + "', '" + _H18b2g7 + "', '" + _H18b2g7X + "', '" + _H18b1h + "','" + _H18b2h + "', '" + _H18b2h1 + "', '" + _H18b2h2 + "', '" + _H18b2h3 + "', '" + _H18b2h4 + "', '" + _H18b2h5 + "', '" + _H18b2h6 + "', '" + _H18b2h7 + "', '" + _H18b2h7X + "', '" + _H18b1i + "','" + _H18b2i + "', '" + _H18b2i1 + "', '" + _H18b2i2 + "', '" + _H18b2i3 + "', '" + _H18b2i4 + "', '" + _H18b2i5 + "', '" + _H18b2i5X + "', '" + _H18b1j + "','" + _H18b2j + "', '" + _H18b2j1 + "', '" + _H18b2j2 + "', '" + _H18b2j3 + "', '" + _H18b2j4 + "', '" + _H18b2j5 + "', '" + _H18b2j5X + "', '" + _H18b1k + "', '" + _H18b2kX + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',RND = '" + _RND + "',SuchanaID = '" + _SuchanaID + "',H18b1a = '" + _H18b1a + "',H18b2a = '" + _H18b2a + "',H18b2a1 = '" + _H18b2a1 + "',H18b2a2 = '" + _H18b2a2 + "',H18b2a3 = '" + _H18b2a3 + "',H18b2a4 = '" + _H18b2a4 + "',H18b2a5 = '" + _H18b2a5 + "',H18b2a6 = '" + _H18b2a6 + "',H18b2a7 = '" + _H18b2a7 + "',H18b2a7X = '" + _H18b2a7X + "',H18b1b = '" + _H18b1b + "',H18b2b = '" + _H18b2b + "',H18b2b1 = '" + _H18b2b1 + "',H18b2b2 = '" + _H18b2b2 + "',H18b2b3 = '" + _H18b2b3 + "',H18b2b4 = '" + _H18b2b4 + "',H18b2b5 = '" + _H18b2b5 + "',H18b2b6 = '" + _H18b2b6 + "',H18b2b7 = '" + _H18b2b7 + "',H18b2b7X = '" + _H18b2b7X + "',H18b1c = '" + _H18b1c + "',H18b2c = '" + _H18b2c + "',H18b2c1 = '" + _H18b2c1 + "',H18b2c2 = '" + _H18b2c2 + "',H18b2c3 = '" + _H18b2c3 + "',H18b2c4 = '" + _H18b2c4 + "',H18b2c5 = '" + _H18b2c5 + "',H18b2c6 = '" + _H18b2c6 + "',H18b2c7 = '" + _H18b2c7 + "',H18b2c7X = '" + _H18b2c7X + "',H18b1d = '" + _H18b1d + "',H18b2d = '" + _H18b2d + "',H18b2d1 = '" + _H18b2d1 + "',H18b2d2 = '" + _H18b2d2 + "',H18b2d3 = '" + _H18b2d3 + "',H18b2d4 = '" + _H18b2d4 + "',H18b2d5 = '" + _H18b2d5 + "',H18b2d6 = '" + _H18b2d6 + "',H18b2d7 = '" + _H18b2d7 + "',H18b2d7X = '" + _H18b2d7X + "',H18b1e = '" + _H18b1e + "',H18b2e = '" + _H18b2e + "',H18b2e1 = '" + _H18b2e1 + "',H18b2e2 = '" + _H18b2e2 + "',H18b2e3 = '" + _H18b2e3 + "',H18b2e4 = '" + _H18b2e4 + "',H18b2e5 = '" + _H18b2e5 + "',H18b2e6 = '" + _H18b2e6 + "',H18b2e7 = '" + _H18b2e7 + "',H18b2e7X = '" + _H18b2e7X + "',H18b1f = '" + _H18b1f + "',H18b2f = '" + _H18b2f + "',H18b2f1 = '" + _H18b2f1 + "',H18b2f2 = '" + _H18b2f2 + "',H18b2f3 = '" + _H18b2f3 + "',H18b2f4 = '" + _H18b2f4 + "',H18b2f5 = '" + _H18b2f5 + "',H18b2f6 = '" + _H18b2f6 + "',H18b2f7 = '" + _H18b2f7 + "',H18b2f7X = '" + _H18b2f7X + "',H18b1g = '" + _H18b1g + "',H18b2g = '" + _H18b2g + "',H18b2g1 = '" + _H18b2g1 + "',H18b2g2 = '" + _H18b2g2 + "',H18b2g3 = '" + _H18b2g3 + "',H18b2g4 = '" + _H18b2g4 + "',H18b2g5 = '" + _H18b2g5 + "',H18b2g6 = '" + _H18b2g6 + "',H18b2g7 = '" + _H18b2g7 + "',H18b2g7X = '" + _H18b2g7X + "',H18b1h = '" + _H18b1h + "',H18b2h = '" + _H18b2h + "',H18b2h1 = '" + _H18b2h1 + "',H18b2h2 = '" + _H18b2h2 + "',H18b2h3 = '" + _H18b2h3 + "',H18b2h4 = '" + _H18b2h4 + "',H18b2h5 = '" + _H18b2h5 + "',H18b2h6 = '" + _H18b2h6 + "',H18b2h7 = '" + _H18b2h7 + "',H18b2h7X = '" + _H18b2h7X + "',H18b1i = '" + _H18b1i + "',H18b2i = '" + _H18b2i + "',H18b2i1 = '" + _H18b2i1 + "',H18b2i2 = '" + _H18b2i2 + "',H18b2i3 = '" + _H18b2i3 + "',H18b2i4 = '" + _H18b2i4 + "',H18b2i5 = '" + _H18b2i5 + "',H18b2i5X = '" + _H18b2i5X + "',H18b1j = '" + _H18b1j + "',H18b2j = '" + _H18b2j + "',H18b2j1 = '" + _H18b2j1 + "',H18b2j2 = '" + _H18b2j2 + "',H18b2j3 = '" + _H18b2j3 + "',H18b2j4 = '" + _H18b2j4 + "',H18b2j5 = '" + _H18b2j5 + "',H18b2j5X = '" + _H18b2j5X + "',H18b1k = '" + _H18b1k + "',H18b2kX = '" + _H18b2kX + "'  Where RND='" + _RND + "' and SuchanaID='" + _SuchanaID + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<IGA_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<IGA_DataModel> data = new ArrayList<IGA_DataModel>();
        IGA_DataModel d = new IGA_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new IGA_DataModel();
            d._RND = cur.getString(cur.getColumnIndex("Rnd"));
            d._SuchanaID = cur.getString(cur.getColumnIndex("SuchanaID"));
            d._H18b1a = cur.getString(cur.getColumnIndex("H18b1a"));
            d._H18b2a = cur.getString(cur.getColumnIndex("H18b2a"));
            d._H18b2a1 = cur.getString(cur.getColumnIndex("H18b2a1"));
            d._H18b2a2 = cur.getString(cur.getColumnIndex("H18b2a2"));
            d._H18b2a3 = cur.getString(cur.getColumnIndex("H18b2a3"));
            d._H18b2a4 = cur.getString(cur.getColumnIndex("H18b2a4"));
            d._H18b2a5 = cur.getString(cur.getColumnIndex("H18b2a5"));
            d._H18b2a6 = cur.getString(cur.getColumnIndex("H18b2a6"));
            d._H18b2a7 = cur.getString(cur.getColumnIndex("H18b2a7"));
            d._H18b2a7X = cur.getString(cur.getColumnIndex("H18b2a7X"));
            d._H18b1b = cur.getString(cur.getColumnIndex("H18b1b"));
            d._H18b2b = cur.getString(cur.getColumnIndex("H18b2b"));
            d._H18b2b1 = cur.getString(cur.getColumnIndex("H18b2b1"));
            d._H18b2b2 = cur.getString(cur.getColumnIndex("H18b2b2"));
            d._H18b2b3 = cur.getString(cur.getColumnIndex("H18b2b3"));
            d._H18b2b4 = cur.getString(cur.getColumnIndex("H18b2b4"));
            d._H18b2b5 = cur.getString(cur.getColumnIndex("H18b2b5"));
            d._H18b2b6 = cur.getString(cur.getColumnIndex("H18b2b6"));
            d._H18b2b7 = cur.getString(cur.getColumnIndex("H18b2b7"));
            d._H18b2b7X = cur.getString(cur.getColumnIndex("H18b2b7X"));
            d._H18b1c = cur.getString(cur.getColumnIndex("H18b1c"));
            d._H18b2c = cur.getString(cur.getColumnIndex("H18b2c"));
            d._H18b2c1 = cur.getString(cur.getColumnIndex("H18b2c1"));
            d._H18b2c2 = cur.getString(cur.getColumnIndex("H18b2c2"));
            d._H18b2c3 = cur.getString(cur.getColumnIndex("H18b2c3"));
            d._H18b2c4 = cur.getString(cur.getColumnIndex("H18b2c4"));
            d._H18b2c5 = cur.getString(cur.getColumnIndex("H18b2c5"));
            d._H18b2c6 = cur.getString(cur.getColumnIndex("H18b2c6"));
            d._H18b2c7 = cur.getString(cur.getColumnIndex("H18b2c7"));
            d._H18b2c7X = cur.getString(cur.getColumnIndex("H18b2c7X"));
            d._H18b1d = cur.getString(cur.getColumnIndex("H18b1d"));
            d._H18b2d = cur.getString(cur.getColumnIndex("H18b2d"));
            d._H18b2d1 = cur.getString(cur.getColumnIndex("H18b2d1"));
            d._H18b2d2 = cur.getString(cur.getColumnIndex("H18b2d2"));
            d._H18b2d3 = cur.getString(cur.getColumnIndex("H18b2d3"));
            d._H18b2d4 = cur.getString(cur.getColumnIndex("H18b2d4"));
            d._H18b2d5 = cur.getString(cur.getColumnIndex("H18b2d5"));
            d._H18b2d6 = cur.getString(cur.getColumnIndex("H18b2d6"));
            d._H18b2d7 = cur.getString(cur.getColumnIndex("H18b2d7"));
            d._H18b2d7X = cur.getString(cur.getColumnIndex("H18b2d7X"));
            d._H18b1e = cur.getString(cur.getColumnIndex("H18b1e"));
            d._H18b2e = cur.getString(cur.getColumnIndex("H18b2e"));
            d._H18b2e1 = cur.getString(cur.getColumnIndex("H18b2e1"));
            d._H18b2e2 = cur.getString(cur.getColumnIndex("H18b2e2"));
            d._H18b2e3 = cur.getString(cur.getColumnIndex("H18b2e3"));
            d._H18b2e4 = cur.getString(cur.getColumnIndex("H18b2e4"));
            d._H18b2e5 = cur.getString(cur.getColumnIndex("H18b2e5"));
            d._H18b2e6 = cur.getString(cur.getColumnIndex("H18b2e6"));
            d._H18b2e7 = cur.getString(cur.getColumnIndex("H18b2e7"));
            d._H18b2e7X = cur.getString(cur.getColumnIndex("H18b2e7X"));
            d._H18b1f = cur.getString(cur.getColumnIndex("H18b1f"));
            d._H18b2f = cur.getString(cur.getColumnIndex("H18b2f"));
            d._H18b2f1 = cur.getString(cur.getColumnIndex("H18b2f1"));
            d._H18b2f2 = cur.getString(cur.getColumnIndex("H18b2f2"));
            d._H18b2f3 = cur.getString(cur.getColumnIndex("H18b2f3"));
            d._H18b2f4 = cur.getString(cur.getColumnIndex("H18b2f4"));
            d._H18b2f5 = cur.getString(cur.getColumnIndex("H18b2f5"));
            d._H18b2f6 = cur.getString(cur.getColumnIndex("H18b2f6"));
            d._H18b2f7 = cur.getString(cur.getColumnIndex("H18b2f7"));
            d._H18b2f7X = cur.getString(cur.getColumnIndex("H18b2f7X"));
            d._H18b1g = cur.getString(cur.getColumnIndex("H18b1g"));
            d._H18b2g = cur.getString(cur.getColumnIndex("H18b2g"));
            d._H18b2g1 = cur.getString(cur.getColumnIndex("H18b2g1"));
            d._H18b2g2 = cur.getString(cur.getColumnIndex("H18b2g2"));
            d._H18b2g3 = cur.getString(cur.getColumnIndex("H18b2g3"));
            d._H18b2g4 = cur.getString(cur.getColumnIndex("H18b2g4"));
            d._H18b2g5 = cur.getString(cur.getColumnIndex("H18b2g5"));
            d._H18b2g6 = cur.getString(cur.getColumnIndex("H18b2g6"));
            d._H18b2g7 = cur.getString(cur.getColumnIndex("H18b2g7"));
            d._H18b2g7X = cur.getString(cur.getColumnIndex("H18b2g7X"));
            d._H18b1h = cur.getString(cur.getColumnIndex("H18b1h"));
            d._H18b2h = cur.getString(cur.getColumnIndex("H18b2h"));
            d._H18b2h1 = cur.getString(cur.getColumnIndex("H18b2h1"));
            d._H18b2h2 = cur.getString(cur.getColumnIndex("H18b2h2"));
            d._H18b2h3 = cur.getString(cur.getColumnIndex("H18b2h3"));
            d._H18b2h4 = cur.getString(cur.getColumnIndex("H18b2h4"));
            d._H18b2h5 = cur.getString(cur.getColumnIndex("H18b2h5"));
            d._H18b2h6 = cur.getString(cur.getColumnIndex("H18b2h6"));
            d._H18b2h7 = cur.getString(cur.getColumnIndex("H18b2h7"));
            d._H18b2h7X = cur.getString(cur.getColumnIndex("H18b2h7X"));
            d._H18b1i = cur.getString(cur.getColumnIndex("H18b1i"));
            d._H18b2i = cur.getString(cur.getColumnIndex("H18b2i"));
            d._H18b2i1 = cur.getString(cur.getColumnIndex("H18b2i1"));
            d._H18b2i2 = cur.getString(cur.getColumnIndex("H18b2i2"));
            d._H18b2i3 = cur.getString(cur.getColumnIndex("H18b2i3"));
            d._H18b2i4 = cur.getString(cur.getColumnIndex("H18b2i4"));
            d._H18b2i5 = cur.getString(cur.getColumnIndex("H18b2i5"));
            d._H18b2i5X = cur.getString(cur.getColumnIndex("H18b2i5X"));
            d._H18b1j = cur.getString(cur.getColumnIndex("H18b1j"));
            d._H18b2j = cur.getString(cur.getColumnIndex("H18b2j"));
            d._H18b2j1 = cur.getString(cur.getColumnIndex("H18b2j1"));
            d._H18b2j2 = cur.getString(cur.getColumnIndex("H18b2j2"));
            d._H18b2j3 = cur.getString(cur.getColumnIndex("H18b2j3"));
            d._H18b2j4 = cur.getString(cur.getColumnIndex("H18b2j4"));
            d._H18b2j5 = cur.getString(cur.getColumnIndex("H18b2j5"));
            d._H18b2j5X = cur.getString(cur.getColumnIndex("H18b2j5X"));
            d._H18b1k = cur.getString(cur.getColumnIndex("H18b1k"));
            d._H18b2kX = cur.getString(cur.getColumnIndex("H18b2kX"));
            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}