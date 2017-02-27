package com.example.admin.myapplication.VIEW;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.admin.myapplication.PRESENTER.Addshoppre;
import com.example.admin.myapplication.R;
import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by admin on 21/02/2017.
 */

public class AddshopView extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml_addshop);
        FlowManager.init(getApplicationContext());

        final EditText ID = (EditText) findViewById(R.id._ID);
        final EditText add_editText = (EditText) findViewById(R.id.address);
        final EditText type_editText = (EditText) findViewById(R.id.type);
        final EditText item_editText = (EditText) findViewById(R.id.item);


        Button button_add = (Button) findViewById(R.id.add_button);
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Addshoppre addshoppre = new Addshoppre(ID, add_editText, type_editText, item_editText);
                Toast toast = Toast.makeText(getApplicationContext(), "saved", Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}
