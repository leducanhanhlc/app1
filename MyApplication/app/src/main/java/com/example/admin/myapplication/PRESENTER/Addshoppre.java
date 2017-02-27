package com.example.admin.myapplication.PRESENTER;


import android.widget.EditText;

/**
 * Created by admin on 21/02/2017.
 */

public class Addshoppre extends Updatedb {
    public Addshoppre(EditText id, EditText address, EditText type, EditText item) {
        dbflow.insert(id, address, type, item);
    }
}
