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
            //SQL = "Insert into EntryStatus(Rnd,SuchanaID,"+ _VariableName +",Upload)Values('" + _Rnd + "', '" + _SuchanaID + "', '" + _T + "', '2')";
            SQL = "Insert into EntryStatus(Rnd,SuchanaID," + _T + ")Values('" + _Rnd + "', '" + _SuchanaID + "', '1')";
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
            //SQL = "Update EntryStatus Set Upload='2',"+ _VariableName +"='1'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
            SQL = "Update EntryStatus Set " + _T + "='1'  Where Rnd='" + _Rnd + "' and SuchanaID='" + _SuchanaID + "'";
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