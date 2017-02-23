package com.example.admin.myapplication.PRESENTER.ADDSHOP;

import android.content.ContentValues;
import android.content.Context;
import android.widget.EditText;

import com.example.admin.myapplication.MODEL.DATABASE_SHOP.DB_Contract;
import com.example.admin.myapplication.MODEL.DATABASE_SHOP.DB_Process;

/**
 * Created by admin on 21/02/2017.
 */

public class Addshoppre extends DB_Process implements Addshoppre_imp {

    @Override
    public void add(EditText add_editText, EditText type_editText, EditText item_editText) {
        DB_Process db_process = new DB_Process();
        DB_Contract db_contract = new DB_Contract();

        ContentValues contentValues = new ContentValues();

        contentValues.put(db_contract.Key_Address, add_editText.getText().toString());
        contentValues.put(db_contract.Key_Type, type_editText.getText().toString());
        contentValues.put(db_contract.Key_Item, item_editText.getText().toString());

        db_process.insert(db_contract);
    }

    ////////////////////////

}
