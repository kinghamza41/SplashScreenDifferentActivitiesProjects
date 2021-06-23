package com.example.splashscreendifferentactivitiesprojects;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {
    EditText editText1,editText2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        editText1=(EditText)findViewById(R.id.edtFirst);
        editText2=(EditText)findViewById(R.id.edtSecond);
        button=(Button)findViewById(R.id.btnclick);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(FirstActivity.this,SecondActivity.class);
                String firstname=editText1.getText().toString();
                String secondname=editText2.getText().toString();
                in.putExtra("firstname",firstname);
                in.putExtra("secondname",secondname);
                startActivity(in);


            }
        });
    }

}
