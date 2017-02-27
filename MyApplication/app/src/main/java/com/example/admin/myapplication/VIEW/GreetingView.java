package com.example.admin.myapplication.VIEW;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.admin.myapplication.PRESENTER.Review;
import com.example.admin.myapplication.R;
import com.example.admin.myapplication.PRESENTER.Updatedb;
public class GreetingView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml_a_greeting);
        getSupportActionBar().hide();
        Updatedb updatedb = new Updatedb();
        ///////////////////
        Button button = (Button) findViewById(R.id.sell);
        Button button1 = (Button) findViewById(R.id.show);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GreetingView.this, AddshopView.class);
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GreetingView.this, Review.class);
                startActivity(intent);
            }
        });
    }

}
