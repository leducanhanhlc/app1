package com.example.admin.myapplication.VIEW.ADDSHOP;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

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
        Addshoppre addshoppre = new Addshoppre(this);
        addshoppre.add();
    }
}
