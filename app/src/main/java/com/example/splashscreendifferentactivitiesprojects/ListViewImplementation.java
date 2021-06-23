package com.example.splashscreendifferentactivitiesprojects;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewImplementation extends AppCompatActivity {
    String [] cities={"Karachi","Lahore","Jhelum","Sibi","Sarai Alamgir"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_implementation);

        ListView listView=(ListView)findViewById(R.id.lv1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,cities);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int index=position;
                Toast.makeText(getApplicationContext(),"You Selected City: " +cities[index],Toast.LENGTH_SHORT).show();
            }
        });
    }
}
