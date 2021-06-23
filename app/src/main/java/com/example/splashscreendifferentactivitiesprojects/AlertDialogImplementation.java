package com.example.splashscreendifferentactivitiesprojects;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlertDialogImplementation extends AppCompatActivity {
    Button btnCustom,btnAlert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog_implementation);

        btnCustom=(Button)findViewById(R.id.btnCustom);
        btnAlert=(Button)findViewById(R.id.btnAlert);

        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
           //Custom Dialog
            public void onClick(View v) {
                Dialog d=new Dialog(AlertDialogImplementation.this);
                d.setCancelable(true);
                d.setContentView(R.layout.activity_alert_dialog_implementation);
                d.show();
            }
        });

        //Alert Dialog

        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(AlertDialogImplementation.this);
                builder.setMessage("Are you sure want to exit");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        AlertDialogImplementation.this.finish();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog alert=builder.create();
                alert.show();   
            }
        });

    }


}
