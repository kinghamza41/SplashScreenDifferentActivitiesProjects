package com.example.splashscreendifferentactivitiesprojects;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LoopImplementation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop_implementation);

          for(int i=0;i<10;i++)
        {
            Log.d("Loop Implementation","Pakistan");
        }
        int j=0;
        while(j<10)
        {
            Log.d("While Implementation","Pakistan");
            j++;
        }


    }
}
