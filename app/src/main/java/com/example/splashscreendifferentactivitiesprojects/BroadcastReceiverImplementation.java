package com.example.splashscreendifferentactivitiesprojects;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class BroadcastReceiverImplementation extends AppCompatActivity {
    private BroadcastReceiver broad=new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {


            int level=intent.getIntExtra("level",0);
            ProgressBar pb=(ProgressBar)findViewById(R.id.progressbar);
            pb.setProgress(level);
            TextView tv=(TextView)findViewById(R.id.tvnew);
            tv.setText("Battery Level"+Integer.toString(level)+"%");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_receiver_implementation);
        registerReceiver(broad, new  IntentFilter(Intent.ACTION_BATTERY_CHANGED));
    }
}
