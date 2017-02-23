package com.example.admin.myapplication.MODEL.DATABASE_SHOP;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static android.R.attr.version;

/**
 * Created by admin on 18/02/2017.
 */


public class DB_Helper extends SQLiteOpenHelper{

    private static final int VERSION = 2;

    private static final String DATABASE_NAME = "aplace.db";

    public DB_Helper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String SQL_CREAT = "CREATE TABLE " + DB_Contract.TABLE_NAME + " ("
                + DB_Contract.Key_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + DB_Contract.Key_Address + " TEXT,"
                + DB_Contract.Key_Type + " TEXT,"
                + DB_Contract.Key_Item + " TEXT )";

        db.execSQL(SQL_CREAT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + DB_Contract.TABLE_NAME);
        onCreate(db);
    }
}
