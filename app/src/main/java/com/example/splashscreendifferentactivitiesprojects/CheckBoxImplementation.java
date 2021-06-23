package com.example.splashscreendifferentactivitiesprojects;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxImplementation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_implementation);

        final CheckBox checkBox=(CheckBox)findViewById(R.id.checkBox1);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(checkBox.isChecked())
               {
                   Toast.makeText(getApplicationContext(),"CheckBox is Ckecked",Toast.LENGTH_LONG).show();
               }else{
                   Toast.makeText(getApplicationContext(),"CheckBox is Unchecked",Toast.LENGTH_LONG).show();
               }
            }
        });
    }
}
