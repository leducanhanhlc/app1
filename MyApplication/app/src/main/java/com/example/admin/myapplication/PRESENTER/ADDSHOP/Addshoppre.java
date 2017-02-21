package com.example.admin.myapplication.PRESENTER.ADDSHOP;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.widget.EditText;

import com.example.admin.myapplication.MODEL.DATABASE_SHOP.DB_Contract;
import com.example.admin.myapplication.MODEL.DATABASE_SHOP.DB_Helper;
import com.example.admin.myapplication.R;
import com.example.admin.myapplication.VIEW.ADDSHOP.AddshopView;

/**
 * Created by admin on 21/02/2017.
 */

public class Addshoppre implements Addshoppre_imp {

    Context context;
    public Addshoppre(Context context) {
        this.context = context;
    }
    ////////////////////////
    DB_Helper db_helper = new DB_Helper(this);
    SQLiteDatabase db = db_helper.getWritableDatabase();
    ////////////////////////
    @Override
    public void add() {
        DB_Contract db_contract = new DB_Contract();
        EditText add_editText = (EditText) findViewById(R.id.address);
        EditText type_editText = (EditText) findViewById(R.id.type);
        EditText item_editText = (EditText) findViewById(R.id.item);
        db_contract.Key_ID = db.insert(db_contract);
        db_contract.Key_Address = add_editText.getText().toString();
        db_contract.Key_Type = type_editText.getText().toString();
        db_contract.Key_Item = item_editText.getText().toString();
        db.insert(db_contract);
    }
}
