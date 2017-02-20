package com.example.admin.myapplication.MODEL.DATABASE;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by admin on 18/02/2017.
 */


public class SQL_Helper implements SQLiteOpenHelper{
    private static final int VERSION = 1;

    private static final String DATABASE_NAME = "aplace.db";

    public SQL_Helper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String SQL_CREAT = "CREATE TABLE " + SQL_Contract.TABLE_NAME + " ("
                + SQL_Contract.Key_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + SQL_Contract.Key_Address + " TEXT,"
                + SQL_Contract.Key_Type + " TEXT,"
                + SQL_Contract.Key_Item + " TEXT )";

        db.execSQL(SQL_CREAT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + SQL_Contract.TABLE_NAME);
        onCreate(db);
    }
}
