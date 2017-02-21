package com.example.admin.myapplication.VIEW.A_GREETING;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.admin.myapplication.MODEL.DATABASE_SHOP.DB_Helper;
import com.example.admin.myapplication.R;
import com.example.admin.myapplication.VIEW.ADDSHOP.AddshopView;

public class GreetingView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_greeting);
        getSupportActionBar().hide();
        ///////////////////
        Button button = (Button) findViewById(R.id.sell);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GreetingView.this, AddshopView.class);
                startActivity(intent);
            }
        });
    }

}
