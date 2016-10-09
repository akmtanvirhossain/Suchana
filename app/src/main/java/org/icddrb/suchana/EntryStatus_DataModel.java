package org.icddrb.suchana;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Common.Connection;

public class EntryStatus_DataModel {
    Connection C;
    String _Rnd = "";
    String _SuchanaID = "";
    String _VariableName = "";
    String _T = "";
    String _T1 = "";
    String _T2 = "";

    EntryStatus_DataModel() {
    }

    EntryStatus_DataModel(String TableName, String Rnd, String SuchanaId) {
        setRnd(Rnd);
        ;
        setSuchanaID(SuchanaId);

        if (TableName.toLowerCase().equals("hhidentity"))
            setT("T1");
        else if (TableName.toLowerCase().equals("member"))
            setT("T2");
        else if (TableName.toLowerCase().equals("ses"))
            setT("T3");
        else if (TableName.toLowerCase().equals("assetb"))
            setT("T4");
        else if (TableName.toLowerCase().equals("assetnb"))
            setT("T5");
        else if (TableName.toLowerCase().equals("land"))
            setT("T6");
        else if (TableName.toLowerCase().equals("hdds"))
            setT("T7");
        else if (TableName.toLowerCase().equals("cost"))
            setT("T8");
        else if (TableName.toLowerCase().equals("savings"))
            setT("T9");
        else if (TableName.toLowerCase().equals("loan"))
            setT("T10");
        else if (TableName.toLowerCase().equals("hfias"))
            setT("T11");
        else if (TableName.toLowerCase().equals("destruction1"))
            setT("T12");
        else if (TableName.toLowerCase().equals("destruction2"))
            setT("T13");
        else if (TableName.toLowerCase().equals("agriculture"))
            setT("T14");
        else if (TableName.toLowerCase().equals("ngowork"))
            setT("T15");
        else if (TableName.toLowerCase().equals("illness1"))
            setT("T16");
        else if (TableName.toLowerCase().equals("illness2"))
            setT("T17");
        else if (TableName.toLowerCase().equals("careseek"))
            setT("T18");
        else if (TableName.toLowerCase().equals("iga"))
            setT("T19");
        else if (TableName.toLowerCase().equals("preghis"))
            setT("T20");
        else if (TableName.toLowerCase().equals("knowledge"))
            setT("T21");
        else if (TableName.toLowerCase().equals("fdhabitknow"))
            setT("T22");
        else if (TableName.toLowerCase().equals("handwash"))
            setT("T23");
        else if (TableName.toLowerCase().equals("nuthealth"))
            setT("T24");
        else if (TableName.toLowerCase().equals("womenemp"))
            setT("T25");
        else if (TableName.toLowerCase().equals("domviolance"))
            setT("T26");
        else if (TableName.toLowerCase().equals("fooddiversity"))
            setT("T27");
        else if (TableName.toLowerCase().equals("fdhabit"))
            setT("T28");
        else if (TableName.toLowerCase().equals("anthro"))
            setT("T29");
        else if (TableName.toLowerCase().equals("father"))
            setT("T30");

            //Eligible
            //------------------------------------------------------------------------------------------
        else if (TableName.toLowerCase().equals("eligible"))
            setT("T50");


    }

    private void setRnd(String newValue) {
        _Rnd = newValue;
    }

    private void setSuchanaID(String newValue) {
        _SuchanaID = newValue;
    }

    private void setT(String newValue) {
        _T = newValue;
    }

    public String SaveUpdateData(Context context) {
        String response = "";
        C = new Connection(context);
        String SQL = "";
        try {
            if (C.Existence("Select * from EntryStatus  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "' "))
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
            SQL = "Insert into EntryStatus(Rnd,SuchanaID," + _T + ",Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '1','2')";
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
            SQL = "Update EntryStatus Set " + _T + "='1',Upload='2'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }

    public String Eligible(Context context, String Status) {
        String response = "";
        C = new Connection(context);
        String SQL = "";
        try {
            SQL = "Update EntryStatus Set T50='" + Status + "',Upload='2'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
            C.Save(SQL);
        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }

    public String getT1() {
        return _T1;
    }

    public String getT2() {
        return _T2;
    }

    public List<EntryStatus_DataModel> SelectAll(Context context, String SQL) {
        Connection C = new Connection(context);
        List<EntryStatus_DataModel> data = new ArrayList<EntryStatus_DataModel>();
        EntryStatus_DataModel d = new EntryStatus_DataModel();
        Cursor cur = C.ReadData(SQL);

        cur.moveToFirst();
        while (!cur.isAfterLast()) {
            d = new EntryStatus_DataModel();
            d._T1 = cur.getString(cur.getColumnIndex("T1"));

            data.add(d);

            cur.moveToNext();
        }
        cur.close();
        return data;
    }
}