package com.example.admin.myapplication.MODEL.DATABASE;

import android.widget.EditText;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.Database;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by admin on 28/02/2017.
 */

public class DBFLOW implements DBFLOW_INT {

    @Database(name = MyDatabase.NAME, version = MyDatabase.VERSION)
    public class MyDatabase {
        public static final String NAME = "SHOP";

        public static final int VERSION = 1;
    }

    @Table(database = MyDatabase.class)
    public static class Contract extends BaseModel {

        @PrimaryKey
        String ID;

        @Column
        String ADDRESS;

        @Column
        String TYPE;

        @Column
        String ITEM;

    }

    @Override
    public void insert(EditText ID, EditText ADDRESS, EditText TYPE, EditText ITEM) {
        Contract contract = new Contract();
        contract.ID = ID.getText().toString();
        contract.ADDRESS = ADDRESS.getText().toString();
        contract.TYPE = TYPE.getText().toString();
        contract.ITEM = ITEM.getText().toString();
        contract.save();
    }



}
