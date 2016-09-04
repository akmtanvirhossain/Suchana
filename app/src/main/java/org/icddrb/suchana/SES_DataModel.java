package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class SES_DataModel {

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
    private String _H63 = "";
    private String _H64A = "";
    private String _H64B = "";
    private String _H64C = "";
    private String _H64D = "";
    private String _H64E = "";
    private String _H64X = "";
    private String _H65 = "";
    private String _H66 = "";
    private String _H67 = "";
    private String _H68 = "";
    private String _H69 = "";
    private String _H610 = "";
    private String _H611 = "";
    private String _H612R = "";
    private String _H612RX = "";
    private String _H612D = "";
    private String _H612DX = "";
    private String _H612a = "";
    private String _H612b1 = "";
    private String _H612b2 = "";
    private String _H612b3 = "";
    private String _H612b4 = "";
    private String _H612bX = "";
    private String _H612X1 = "";
    private String _H612b5 = "";
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
    private String _H613bX = "";
    private String _H613bX1 = "";
    private String _H613b5 = "";
    private String _H614R = "";
    private String _H614RX = "";
    private String _H614D = "";
    private String _H614DX = "";
    private String _H614a = "";
    private String _H614b1 = "";
    private String _H614b2 = "";
    private String _H614b3 = "";
    private String _H614b4 = "";
    private String _H614bX = "";
    private String _H614bX1 = "";
    private String _H614b5 = "";
    private String _H614c = "";
    private String _H615R = "";
    private String _H615RX = "";
    private String _H615D = "";
    private String _H615DX = "";
    private String _H615a = "";
    private String _H615b1 = "";
    private String _H615b2 = "";
    private String _H615b3 = "";
    private String _H615b4 = "";
    private String _H615bX = "";
    private String _H615X1 = "";
    private String _H615b5 = "";
    private String _H616R = "";
    private String _H616RX = "";
    private String _H616D = "";
    private String _H616DX = "";
    private String _H616a = "";
    private String _H616b1 = "";
    private String _H616b2 = "";
    private String _H616b3 = "";
    private String _H616b4 = "";
    private String _H616bX = "";
    private String _H616X1 = "";
    private String _H616b5 = "";
    private String _H616c = "";
    private String _H617 = "";
    private String _H618 = "";
    private String _H619 = "";
    private String _H620 = "";
    private String _H620X = "";
    private String _H621 = "";
    private String _H622 = "";
    private String _StartTime = "";
    private String _EndTime = "";
    private String _UserId = "";
    private String _EntryUser = "";
    private String _Lat = "";
    private String _Lon = "";
    private String _EnDt = "";
    private String _Upload = "2";

    public String getUpload() {
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

    public String getH311() {
        return _H311;
    }

    public void setH311(String newValue) {
        _H311 = newValue;
    }

    public String getH312() {
        return _H312;
    }

    public void setH312(String newValue) {
        _H312 = newValue;
    }

    public String getH313() {
        return _H313;
    }

    public void setH313(String newValue) {
        _H313 = newValue;
    }

    public String getH321() {
        return _H321;
    }

    public void setH321(String newValue) {
        _H321 = newValue;
    }

    public String getH321X() {
        return _H321X;
    }

    public void setH321X(String newValue) {
        _H321X = newValue;
    }

    public String getH322() {
        return _H322;
    }

    public void setH322(String newValue) {
        _H322 = newValue;
    }

    public String getH322X() {
        return _H322X;
    }

    public void setH322X(String newValue) {
        _H322X = newValue;
    }

    public String getH323() {
        return _H323;
    }

    public void setH323(String newValue) {
        _H323 = newValue;
    }

    public String getH323X() {
        return _H323X;
    }

    public void setH323X(String newValue) {
        _H323X = newValue;
    }

    public String getH324() {
        return _H324;
    }

    public void setH324(String newValue) {
        _H324 = newValue;
    }

    public String getH324X() {
        return _H324X;
    }

    public void setH324X(String newValue) {
        _H324X = newValue;
    }

    public String getH325() {
        return _H325;
    }

    public void setH325(String newValue) {
        _H325 = newValue;
    }

    public String getH325X() {
        return _H325X;
    }

    public void setH325X(String newValue) {
        _H325X = newValue;
    }

    public String getH331() {
        return _H331;
    }

    public void setH331(String newValue) {
        _H331 = newValue;
    }

    public String getH332A() {
        return _H332A;
    }

    public void setH332A(String newValue) {
        _H332A = newValue;
    }

    public String getH332B() {
        return _H332B;
    }

    public void setH332B(String newValue) {
        _H332B = newValue;
    }

    public String getH341() {
        return _H341;
    }

    public void setH341(String newValue) {
        _H341 = newValue;
    }

    public String getH342() {
        return _H342;
    }

    public void setH342(String newValue) {
        _H342 = newValue;
    }

    public String getH61() {
        return _H61;
    }

    public void setH61(String newValue) {
        _H61 = newValue;
    }

    public String getH62() {
        return _H62;
    }

    public void setH62(String newValue) {
        _H62 = newValue;
    }

    public String getH63() {
        return _H63;
    }

    public void setH63(String newValue) {
        _H63 = newValue;
    }

    public String getH64A() {
        return _H64A;
    }

    public void setH64A(String newValue) {
        _H64A = newValue;
    }

    public String getH64B() {
        return _H64B;
    }

    public void setH64B(String newValue) {
        _H64B = newValue;
    }

    public String getH64C() {
        return _H64C;
    }

    public void setH64C(String newValue) {
        _H64C = newValue;
    }

    public String getH64D() {
        return _H64D;
    }

    public void setH64D(String newValue) {
        _H64D = newValue;
    }

    public String getH64E() {
        return _H64E;
    }

    public void setH64E(String newValue) {
        _H64E = newValue;
    }

    public String getH64X() {
        return _H64X;
    }

    public void setH64X(String newValue) {
        _H64X = newValue;
    }

    public String getH65() {
        return _H65;
    }

    public void setH65(String newValue) {
        _H65 = newValue;
    }

    public String getH66() {
        return _H66;
    }

    public void setH66(String newValue) {
        _H66 = newValue;
    }

    public String getH67() {
        return _H67;
    }

    public void setH67(String newValue) {
        _H67 = newValue;
    }

    public String getH68() {
        return _H68;
    }

    public void setH68(String newValue) {
        _H68 = newValue;
    }

    public String getH69() {
        return _H69;
    }

    public void setH69(String newValue) {
        _H69 = newValue;
    }

    public String getH610() {
        return _H610;
    }

    public void setH610(String newValue) {
        _H610 = newValue;
    }

    public String getH611() {
        return _H611;
    }

    public void setH611(String newValue) {
        _H611 = newValue;
    }

    public String getH612R() {
        return _H612R;
    }

    public void setH612R(String newValue) {
        _H612R = newValue;
    }

    public String getH612RX() {
        return _H612RX;
    }

    public void setH612RX(String newValue) {
        _H612RX = newValue;
    }

    public String getH612D() {
        return _H612D;
    }

    public void setH612D(String newValue) {
        _H612D = newValue;
    }

    public String getH612DX() {
        return _H612DX;
    }

    public void setH612DX(String newValue) {
        _H612DX = newValue;
    }

    public String getH612a() {
        return _H612a;
    }

    public void setH612a(String newValue) {
        _H612a = newValue;
    }

    public String getH612b1() {
        return _H612b1;
    }

    public void setH612b1(String newValue) {
        _H612b1 = newValue;
    }

    public String getH612b2() {
        return _H612b2;
    }

    public void setH612b2(String newValue) {
        _H612b2 = newValue;
    }

    public String getH612b3() {
        return _H612b3;
    }

    public void setH612b3(String newValue) {
        _H612b3 = newValue;
    }

    public String getH612b4() {
        return _H612b4;
    }

    public void setH612b4(String newValue) {
        _H612b4 = newValue;
    }

    public String getH612bX() {
        return _H612bX;
    }

    public void setH612bX(String newValue) {
        _H612bX = newValue;
    }

    public String getH612X1() {
        return _H612X1;
    }

    public void setH612X1(String newValue) {
        _H612X1 = newValue;
    }

    public String getH612b5() {
        return _H612b5;
    }

    public void setH612b5(String newValue) {
        _H612b5 = newValue;
    }

    public String getH612c() {
        return _H612c;
    }

    public void setH612c(String newValue) {
        _H612c = newValue;
    }

    public String getH613R() {
        return _H613R;
    }

    public void setH613R(String newValue) {
        _H613R = newValue;
    }

    public String getH613RX() {
        return _H613RX;
    }

    public void setH613RX(String newValue) {
        _H613RX = newValue;
    }

    public String getH613D() {
        return _H613D;
    }

    public void setH613D(String newValue) {
        _H613D = newValue;
    }

    public String getH613DX() {
        return _H613DX;
    }

    public void setH613DX(String newValue) {
        _H613DX = newValue;
    }

    public String getH613a() {
        return _H613a;
    }

    public void setH613a(String newValue) {
        _H613a = newValue;
    }

    public String getH613b1() {
        return _H613b1;
    }

    public void setH613b1(String newValue) {
        _H613b1 = newValue;
    }

    public String getH613b2() {
        return _H613b2;
    }

    public void setH613b2(String newValue) {
        _H613b2 = newValue;
    }

    public String getH613b3() {
        return _H613b3;
    }

    public void setH613b3(String newValue) {
        _H613b3 = newValue;
    }

    public String getH613b4() {
        return _H613b4;
    }

    public void setH613b4(String newValue) {
        _H613b4 = newValue;
    }

    public String getH613bX() {
        return _H613bX;
    }

    public void setH613bX(String newValue) {
        _H613bX = newValue;
    }

    public String getH613bX1() {
        return _H613bX1;
    }

    public void setH613bX1(String newValue) {
        _H613bX1 = newValue;
    }

    public String getH613b5() {
        return _H613b5;
    }

    public void setH613b5(String newValue) {
        _H613b5 = newValue;
    }

    public String getH614R() {
        return _H614R;
    }

    public void setH614R(String newValue) {
        _H614R = newValue;
    }

    public String getH614RX() {
        return _H614RX;
    }

    public void setH614RX(String newValue) {
        _H614RX = newValue;
    }

    public String getH614D() {
        return _H614D;
    }

    public void setH614D(String newValue) {
        _H614D = newValue;
    }

    public String getH614DX() {
        return _H614DX;
    }

    public void setH614DX(String newValue) {
        _H614DX = newValue;
    }

    public String getH614a() {
        return _H614a;
    }

    public void setH614a(String newValue) {
        _H614a = newValue;
    }

    public String getH614b1() {
        return _H614b1;
    }

    public void setH614b1(String newValue) {
        _H614b1 = newValue;
    }

    public String getH614b2() {
        return _H614b2;
    }

    public void setH614b2(String newValue) {
        _H614b2 = newValue;
    }

    public String getH614b3() {
        return _H614b3;
    }

    public void setH614b3(String newValue) {
        _H614b3 = newValue;
    }

    public String getH614b4() {
        return _H614b4;
    }

    public void setH614b4(String newValue) {
        _H614b4 = newValue;
    }

    public String getH614bX() {
        return _H614bX;
    }

    public void setH614bX(String newValue) {
        _H614bX = newValue;
    }

    public String getH614bX1() {
        return _H614bX1;
    }

    public void setH614bX1(String newValue) {
        _H614bX1 = newValue;
    }

    public String getH614b5() {
        return _H614b5;
    }

    public void setH614b5(String newValue) {
        _H614b5 = newValue;
    }

    public String getH614c() {
        return _H614c;
    }

    public void setH614c(String newValue) {
        _H614c = newValue;
    }

    public String getH615R() {
        return _H615R;
    }

    public void setH615R(String newValue) {
        _H615R = newValue;
    }

    public String getH615RX() {
        return _H615RX;
    }

    public void setH615RX(String newValue) {
        _H615RX = newValue;
    }

    public String getH615D() {
        return _H615D;
    }

    public void setH615D(String newValue) {
        _H615D = newValue;
    }

    public String getH615DX() {
        return _H615DX;
    }

    public void setH615DX(String newValue) {
        _H615DX = newValue;
    }

    public String getH615a() {
        return _H615a;
    }

    public void setH615a(String newValue) {
        _H615a = newValue;
    }

    public String getH615b1() {
        return _H615b1;
    }

    public void setH615b1(String newValue) {
        _H615b1 = newValue;
    }

    public String getH615b2() {
        return _H615b2;
    }

    public void setH615b2(String newValue) {
        _H615b2 = newValue;
    }

    public String getH615b3() {
        return _H615b3;
    }

    public void setH615b3(String newValue) {
        _H615b3 = newValue;
    }

    public String getH615b4() {
        return _H615b4;
    }

    public void setH615b4(String newValue) {
        _H615b4 = newValue;
    }

    public String getH615bX() {
        return _H615bX;
    }

    public void setH615bX(String newValue) {
        _H615bX = newValue;
    }

    public String getH615X1() {
        return _H615X1;
    }

    public void setH615X1(String newValue) {
        _H615X1 = newValue;
    }

    public String getH615b5() {
        return _H615b5;
    }

    public void setH615b5(String newValue) {
        _H615b5 = newValue;
    }

    public String getH616R() {
        return _H616R;
    }

    public void setH616R(String newValue) {
        _H616R = newValue;
    }

    public String getH616RX() {
        return _H616RX;
    }

    public void setH616RX(String newValue) {
        _H616RX = newValue;
    }

    public String getH616D() {
        return _H616D;
    }

    public void setH616D(String newValue) {
        _H616D = newValue;
    }

    public String getH616DX() {
        return _H616DX;
    }

    public void setH616DX(String newValue) {
        _H616DX = newValue;
    }

    public String getH616a() {
        return _H616a;
    }

    public void setH616a(String newValue) {
        _H616a = newValue;
    }

    public String getH616b1() {
        return _H616b1;
    }

    public void setH616b1(String newValue) {
        _H616b1 = newValue;
    }

    public String getH616b2() {
        return _H616b2;
    }

    public void setH616b2(String newValue) {
        _H616b2 = newValue;
    }

    public String getH616b3() {
        return _H616b3;
    }

    public void setH616b3(String newValue) {
        _H616b3 = newValue;
    }

    public String getH616b4() {
        return _H616b4;
    }

    public void setH616b4(String newValue) {
        _H616b4 = newValue;
    }

    public String getH616bX() {
        return _H616bX;
    }

    public void setH616bX(String newValue) {
        _H616bX = newValue;
    }

    public String getH616X1() {
        return _H616X1;
    }

    public void setH616X1(String newValue) {
        _H616X1 = newValue;
    }

    public String getH616b5() {
        return _H616b5;
    }

    public void setH616b5(String newValue) {
        _H616b5 = newValue;
    }

    public String getH616c() {
        return _H616c;
    }

    public void setH616c(String newValue) {
        _H616c = newValue;
    }

    public String getH617() {
        return _H617;
    }

    public void setH617(String newValue) {
        _H617 = newValue;
    }

    public String getH618() {
        return _H618;
    }

    public void setH618(String newValue) {
        _H618 = newValue;
    }

    public String getH619() {
        return _H619;
    }

    public void setH619(String newValue) {
        _H619 = newValue;
    }

    public String getH620() {
        return _H620;
    }

    public void setH620(String newValue) {
        _H620 = newValue;
    }

    public String getH620X() {
        return _H620X;
    }

    public void setH620X(String newValue) {
        _H620X = newValue;
    }

    public String getH621() {
        return _H621;
    }

    public void setH621(String newValue) {
        _H621 = newValue;
    }

    public String getH622() {
        return _H622;
    }

    public void setH622(String newValue) {
        _H622 = newValue;
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
            SQL = "Insert into " + TableName + " (Rnd,SuchanaID,H311,H312,H313,H321,H321X,H322,H322X,H323,H323X,H324,H324X,H325,H325X,H331,H332A,H332B,H341,H342,H61,H62,H63,H64A,H64B,H64C,H64D,H64E,H64X,H65,H66,H67,H68,H69,H610,H611,H612R,H612RX,H612D,H612DX,H612a,H612b1,H612b2,H612b3,H612b4,H612bX,H612X1,H612b5,H612c,H613R,H613RX,H613D,H613DX,H613a,H613b1,H613b2,H613b3,H613b4,H613bX,H613bX1,H613b5,H614R,H614RX,H614D,H614DX,H614a,H614b1,H614b2,H614b3,H614b4,H614bX,H614bX1,H614b5,H614c,H615R,H615RX,H615D,H615DX,H615a,H615b1,H615b2,H615b3,H615b4,H615bX,H615X1,H615b5,H616R,H616RX,H616D,H616DX,H616a,H616b1,H616b2,H616b3,H616b4,H616bX,H616X1,H616b5,H616c,H617,H618,H619,H620,H620X,H621,H622,StartTime,EndTime,UserId,EntryUser,Lat,Lon,EnDt,Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _H311 + "', '" + _H312 + "', '" + _H313 + "', '" + _H321 + "', '" + _H321X + "', '" + _H322 + "', '" + _H322X + "', '" + _H323 + "', '" + _H323X + "', '" + _H324 + "', '" + _H324X + "', '" + _H325 + "', '" + _H325X + "', '" + _H331 + "', '" + _H332A + "', '" + _H332B + "', '" + _H341 + "', '" + _H342 + "', '" + _H61 + "', '" + _H62 + "', '" + _H63 + "', '" + _H64A + "', '" + _H64B + "', '" + _H64C + "', '" + _H64D + "', '" + _H64E + "', '" + _H64X + "', '" + _H65 + "', '" + _H66 + "', '" + _H67 + "', '" + _H68 + "', '" + _H69 + "', '" + _H610 + "', '" + _H611 + "', '" + _H612R + "', '" + _H612RX + "', '" + _H612D + "', '" + _H612DX + "', '" + _H612a + "', '" + _H612b1 + "', '" + _H612b2 + "', '" + _H612b3 + "', '" + _H612b4 + "', '" + _H612bX + "', '" + _H612X1 + "', '" + _H612b5 + "', '" + _H612c + "', '" + _H613R + "', '" + _H613RX + "', '" + _H613D + "', '" + _H613DX + "', '" + _H613a + "', '" + _H613b1 + "', '" + _H613b2 + "', '" + _H613b3 + "', '" + _H613b4 + "', '" + _H613bX + "', '" + _H613bX1 + "', '" + _H613b5 + "', '" + _H614R + "', '" + _H614RX + "', '" + _H614D + "', '" + _H614DX + "', '" + _H614a + "', '" + _H614b1 + "', '" + _H614b2 + "', '" + _H614b3 + "', '" + _H614b4 + "', '" + _H614bX + "', '" + _H614bX1 + "', '" + _H614b5 + "', '" + _H614c + "', '" + _H615R + "', '" + _H615RX + "', '" + _H615D + "', '" + _H615DX + "', '" + _H615a + "', '" + _H615b1 + "', '" + _H615b2 + "', '" + _H615b3 + "', '" + _H615b4 + "', '" + _H615bX + "', '" + _H615X1 + "', '" + _H615b5 + "', '" + _H616R + "', '" + _H616RX + "', '" + _H616D + "', '" + _H616DX + "', '" + _H616a + "', '" + _H616b1 + "', '" + _H616b2 + "', '" + _H616b3 + "', '" + _H616b4 + "', '" + _H616bX + "', '" + _H616X1 + "', '" + _H616b5 + "', '" + _H616c + "', '" + _H617 + "', '" + _H618 + "', '" + _H619 + "', '" + _H620 + "', '" + _H620X + "', '" + _H621 + "', '" + _H622 + "', '" + _StartTime + "', '" + _EndTime + "', '" + _UserId + "', '" + _EntryUser + "', '" + _Lat + "', '" + _Lon + "', '" + _EnDt + "', '" + _Upload + "')";
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
            SQL = "Update " + TableName + " Set Upload='2',Rnd = '" + _Rnd + "',SuchanaID = '" + _SuchanaID + "',H311 = '" + _H311 + "',H312 = '" + _H312 + "',H313 = '" + _H313 + "',H321 = '" + _H321 + "',H321X = '" + _H321X + "',H322 = '" + _H322 + "',H322X = '" + _H322X + "',H323 = '" + _H323 + "',H323X = '" + _H323X + "',H324 = '" + _H324 + "',H324X = '" + _H324X + "',H325 = '" + _H325 + "',H325X = '" + _H325X + "',H331 = '" + _H331 + "',H332A = '" + _H332A + "',H332B = '" + _H332B + "',H341 = '" + _H341 + "',H342 = '" + _H342 + "',H61 = '" + _H61 + "',H62 = '" + _H62 + "',H63 = '" + _H63 + "',H64A = '" + _H64A + "',H64B = '" + _H64B + "',H64C = '" + _H64C + "',H64D = '" + _H64D + "',H64E = '" + _H64E + "',H64X = '" + _H64X + "',H65 = '" + _H65 + "',H66 = '" + _H66 + "',H67 = '" + _H67 + "',H68 = '" + _H68 + "',H69 = '" + _H69 + "',H610 = '" + _H610 + "',H611 = '" + _H611 + "',H612R = '" + _H612R + "',H612RX = '" + _H612RX + "',H612D = '" + _H612D + "',H612DX = '" + _H612DX + "',H612a = '" + _H612a + "',H612b1 = '" + _H612b1 + "',H612b2 = '" + _H612b2 + "',H612b3 = '" + _H612b3 + "',H612b4 = '" + _H612b4 + "',H612bX = '" + _H612bX + "',H612X1 = '" + _H612X1 + "',H612b5 = '" + _H612b5 + "',H612c = '" + _H612c + "',H613R = '" + _H613R + "',H613RX = '" + _H613RX + "',H613D = '" + _H613D + "',H613DX = '" + _H613DX + "',H613a = '" + _H613a + "',H613b1 = '" + _H613b1 + "',H613b2 = '" + _H613b2 + "',H613b3 = '" + _H613b3 + "',H613b4 = '" + _H613b4 + "',H613bX = '" + _H613bX + "',H613bX1 = '" + _H613bX1 + "',H613b5 = '" + _H613b5 + "',H614R = '" + _H614R + "',H614RX = '" + _H614RX + "',H614D = '" + _H614D + "',H614DX = '" + _H614DX + "',H614a = '" + _H614a + "',H614b1 = '" + _H614b1 + "',H614b2 = '" + _H614b2 + "',H614b3 = '" + _H614b3 + "',H614b4 = '" + _H614b4 + "',H614bX = '" + _H614bX + "',H614bX1 = '" + _H614bX1 + "',H614b5 = '" + _H614b5 + "',H614c = '" + _H614c + "',H615R = '" + _H615R + "',H615RX = '" + _H615RX + "',H615D = '" + _H615D + "',H615DX = '" + _H615DX + "',H615a = '" + _H615a + "',H615b1 = '" + _H615b1 + "',H615b2 = '" + _H615b2 + "',H615b3 = '" + _H615b3 + "',H615b4 = '" + _H615b4 + "',H615bX = '" + _H615bX + "',H615X1 = '" + _H615X1 + "',H615b5 = '" + _H615b5 + "',H616R = '" + _H616R + "',H616RX = '" + _H616RX + "',H616D = '" + _H616D + "',H616DX = '" + _H616DX + "',H616a = '" + _H616a + "',H616b1 = '" + _H616b1 + "',H616b2 = '" + _H616b2 + "',H616b3 = '" + _H616b3 + "',H616b4 = '" + _H616b4 + "',H616bX = '" + _H616bX + "',H616X1 = '" + _H616X1 + "',H616b5 = '" + _H616b5 + "',H616c = '" + _H616c + "',H617 = '" + _H617 + "',H618 = '" + _H618 + "',H619 = '" + _H619 + "',H620 = '" + _H620 + "',H620X = '" + _H620X + "',H621 = '" + _H621 + "',H622 = '" + _H622 + "'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }


    public List<SES_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<SES_DataModel> data = new ArrayList<SES_DataModel>();
        SES_DataModel d = new SES_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
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
            d._H63 = cur.getString(cur.getColumnIndex("H63"));
            d._H64A = cur.getString(cur.getColumnIndex("H64A"));
            d._H64B = cur.getString(cur.getColumnIndex("H64B"));
            d._H64C = cur.getString(cur.getColumnIndex("H64C"));
            d._H64D = cur.getString(cur.getColumnIndex("H64D"));
            d._H64E = cur.getString(cur.getColumnIndex("H64E"));
            d._H64X = cur.getString(cur.getColumnIndex("H64X"));
            d._H65 = cur.getString(cur.getColumnIndex("H65"));
            d._H66 = cur.getString(cur.getColumnIndex("H66"));
            d._H67 = cur.getString(cur.getColumnIndex("H67"));
            d._H68 = cur.getString(cur.getColumnIndex("H68"));
            d._H69 = cur.getString(cur.getColumnIndex("H69"));
            d._H610 = cur.getString(cur.getColumnIndex("H610"));
            d._H611 = cur.getString(cur.getColumnIndex("H611"));
            d._H612R = cur.getString(cur.getColumnIndex("H612R"));
            d._H612RX = cur.getString(cur.getColumnIndex("H612RX"));
            d._H612D = cur.getString(cur.getColumnIndex("H612D"));
            d._H612DX = cur.getString(cur.getColumnIndex("H612DX"));
            d._H612a = cur.getString(cur.getColumnIndex("H612a"));
            d._H612b1 = cur.getString(cur.getColumnIndex("H612b1"));
            d._H612b2 = cur.getString(cur.getColumnIndex("H612b2"));
            d._H612b3 = cur.getString(cur.getColumnIndex("H612b3"));
            d._H612b4 = cur.getString(cur.getColumnIndex("H612b4"));
            d._H612bX = cur.getString(cur.getColumnIndex("H612bX"));
            d._H612X1 = cur.getString(cur.getColumnIndex("H612X1"));
            d._H612b5 = cur.getString(cur.getColumnIndex("H612b5"));
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
            d._H613bX = cur.getString(cur.getColumnIndex("H613bX"));
            d._H613bX1 = cur.getString(cur.getColumnIndex("H613bX1"));
            d._H613b5 = cur.getString(cur.getColumnIndex("H613b5"));
            d._H614R = cur.getString(cur.getColumnIndex("H614R"));
            d._H614RX = cur.getString(cur.getColumnIndex("H614RX"));
            d._H614D = cur.getString(cur.getColumnIndex("H614D"));
            d._H614DX = cur.getString(cur.getColumnIndex("H614DX"));
            d._H614a = cur.getString(cur.getColumnIndex("H614a"));
            d._H614b1 = cur.getString(cur.getColumnIndex("H614b1"));
            d._H614b2 = cur.getString(cur.getColumnIndex("H614b2"));
            d._H614b3 = cur.getString(cur.getColumnIndex("H614b3"));
            d._H614b4 = cur.getString(cur.getColumnIndex("H614b4"));
            d._H614bX = cur.getString(cur.getColumnIndex("H614bX"));
            d._H614bX1 = cur.getString(cur.getColumnIndex("H614bX1"));
            d._H614b5 = cur.getString(cur.getColumnIndex("H614b5"));
            d._H614c = cur.getString(cur.getColumnIndex("H614c"));
            d._H615R = cur.getString(cur.getColumnIndex("H615R"));
            d._H615RX = cur.getString(cur.getColumnIndex("H615RX"));
            d._H615D = cur.getString(cur.getColumnIndex("H615D"));
            d._H615DX = cur.getString(cur.getColumnIndex("H615DX"));
            d._H615a = cur.getString(cur.getColumnIndex("H615a"));
            d._H615b1 = cur.getString(cur.getColumnIndex("H615b1"));
            d._H615b2 = cur.getString(cur.getColumnIndex("H615b2"));
            d._H615b3 = cur.getString(cur.getColumnIndex("H615b3"));
            d._H615b4 = cur.getString(cur.getColumnIndex("H615b4"));
            d._H615bX = cur.getString(cur.getColumnIndex("H615bX"));
            d._H615X1 = cur.getString(cur.getColumnIndex("H615X1"));
            d._H615b5 = cur.getString(cur.getColumnIndex("H615b5"));
            d._H616R = cur.getString(cur.getColumnIndex("H616R"));
            d._H616RX = cur.getString(cur.getColumnIndex("H616RX"));
            d._H616D = cur.getString(cur.getColumnIndex("H616D"));
            d._H616DX = cur.getString(cur.getColumnIndex("H616DX"));
            d._H616a = cur.getString(cur.getColumnIndex("H616a"));
            d._H616b1 = cur.getString(cur.getColumnIndex("H616b1"));
            d._H616b2 = cur.getString(cur.getColumnIndex("H616b2"));
            d._H616b3 = cur.getString(cur.getColumnIndex("H616b3"));
            d._H616b4 = cur.getString(cur.getColumnIndex("H616b4"));
            d._H616bX = cur.getString(cur.getColumnIndex("H616bX"));
            d._H616X1 = cur.getString(cur.getColumnIndex("H616X1"));
            d._H616b5 = cur.getString(cur.getColumnIndex("H616b5"));
            d._H616c = cur.getString(cur.getColumnIndex("H616c"));
            d._H617 = cur.getString(cur.getColumnIndex("H617"));
            d._H618 = cur.getString(cur.getColumnIndex("H618"));
            d._H619 = cur.getString(cur.getColumnIndex("H619"));
            d._H620 = cur.getString(cur.getColumnIndex("H620"));
            d._H620X = cur.getString(cur.getColumnIndex("H620X"));
            d._H621 = cur.getString(cur.getColumnIndex("H621"));
            d._H622 = cur.getString(cur.getColumnIndex("H622"));
            d._Upload = cur.getString(cur.getColumnIndex("Upload"));

            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}