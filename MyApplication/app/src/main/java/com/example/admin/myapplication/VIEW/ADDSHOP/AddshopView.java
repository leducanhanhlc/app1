package com.example.admin.myapplication.VIEW.ADDSHOP;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import com.example.admin.myapplication.PRESENTER.ADDSHOP.Addshoppre;
import com.example.admin.myapplication.R;
import com.example.admin.myapplication.VIEW.A_GREETING.GreetingView;

/**
 * Created by admin on 21/02/2017.
 */

public class AddshopView extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addshop);

        EditText add_editText = (EditText) findViewById(R.id.address);
        EditText type_editText = (EditText) findViewById(R.id.type);
        EditText item_editText = (EditText) findViewById(R.id.item);

        Addshoppre addshoppre = new Addshoppre();
        addshoppre.add(add_editText, type_editText, item_editText);
    }
}
