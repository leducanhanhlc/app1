package com.example.admin.myapplication.VIEW.ADDSHOP;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

        final EditText ID = (EditText) findViewById(R.id._ID);
        final EditText add_editText = (EditText) findViewById(R.id.address);
        final EditText type_editText = (EditText) findViewById(R.id.type);
        final EditText item_editText = (EditText) findViewById(R.id.item);

        final Addshoppre addshoppre = new Addshoppre(getApplication().getApplicationContext());
        Button button_add = (Button) findViewById(R.id.add_button);
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addshoppre.add(ID, add_editText, type_editText, item_editText);
                Toast toast = Toast.makeText(getApplicationContext(), "saved", Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}
