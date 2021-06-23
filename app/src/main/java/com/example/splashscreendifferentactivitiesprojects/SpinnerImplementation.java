package com.example.splashscreendifferentactivitiesprojects;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerImplementation extends AppCompatActivity {
    Spinner spinner;
    String[] fruits={"Banana","Apple","Mango","PineApple","Orange"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_implementation);
        //Spinner Implementation through java

        spinner=(Spinner)findViewById(R.id.sp1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,fruits);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               int index=spinner.getSelectedItemPosition();
                Toast.makeText(getApplicationContext(),"Your Selection is: "+fruits[index],Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
