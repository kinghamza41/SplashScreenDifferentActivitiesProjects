package com.example.splashscreendifferentactivitiesprojects;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SQLView extends AppCompatActivity {
     TextView textView;
     SQLiteDataBase db4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlview);
        textView=(TextView)findViewById(R.id.tvview);
        db4=new SQLiteDataBase(this);
        String data=db4.getData();
        textView.setText(data);

    }
}
