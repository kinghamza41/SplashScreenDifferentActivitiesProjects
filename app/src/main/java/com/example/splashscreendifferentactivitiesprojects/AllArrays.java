package com.example.splashscreendifferentactivitiesprojects;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class AllArrays extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_arrays);
       //Simple Array

       /* String [] names={"Ali","Aslam","Aziz"};
        for(int k=0;k<3;k++)
        {
            Log.d("All Names are","  "+names[k]);
        }*/

        //Static Array

        Resources res=getResources();
        String [] option= res.getStringArray(R.array.array_shops);
        for(int k=0;k<3;k++)
        {
            Log.d("All Names are","  "+option[k]);
        }

    }
}
