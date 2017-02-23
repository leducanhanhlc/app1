package com.example.admin.myapplication.MODEL.DATABASE_SHOP;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by admin on 19/02/2017.
 */

public class DB_Process extends AppCompatActivity implements DB_Process_Imp {
    private DB_Helper sql_helper;

    @Override
    public int insert(DB_Contract db_contract) {
        SQLiteDatabase db = sql_helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DB_Contract.Key_ID, db_contract.Key_ID);
        contentValues.put(DB_Contract.Key_Address, db_contract.Key_Address);
        contentValues.put(DB_Contract.Key_Type, db_contract.Key_Type);
        contentValues.put(DB_Contract.Key_Item, db_contract.Key_Item);
        long newID = db.insert(DB_Contract.TABLE_NAME, null, contentValues);
        db.close();
        return (int) newID;
    }

    @Override
    public DB_Contract imfor(int ID) {
        return null;
    }
}
