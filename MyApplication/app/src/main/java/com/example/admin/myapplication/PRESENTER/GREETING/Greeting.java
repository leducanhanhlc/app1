package com.example.admin.myapplication.PRESENTER.GREETING;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.admin.myapplication.R;

public class Greeting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

}
