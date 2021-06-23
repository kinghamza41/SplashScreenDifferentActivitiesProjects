package com.example.splashscreendifferentactivitiesprojects;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioBtnImplementation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_btn_implementation);

        RadioGroup rdbgroup=(RadioGroup)findViewById(R.id.rdbg);
        rdbgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rdb=(RadioButton)findViewById(R.id.rdb1);
                if(rdb.isChecked())
                {
                    Toast.makeText(RadioBtnImplementation.this, "Male", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Female",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
