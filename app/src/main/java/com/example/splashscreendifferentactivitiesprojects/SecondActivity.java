package com.example.splashscreendifferentactivitiesprojects;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvdata=(TextView)findViewById(R.id.tv);

        Intent in=getIntent();
        String firstname=in.getStringExtra("firstname");
        String secondname=in.getStringExtra("secondname");
        tvdata.setText("FirstName is: " +firstname+ " SecondName is: " +secondname);
    }
}
