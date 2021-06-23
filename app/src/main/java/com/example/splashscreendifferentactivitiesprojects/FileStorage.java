package com.example.splashscreendifferentactivitiesprojects;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStorage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final EditText edtfilename,edtcontent;
        Button btnSave;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_storage);

        edtfilename=(EditText)findViewById(R.id.edtFileName);
        edtcontent=(EditText)findViewById(R.id.edtContent);
        btnSave=(Button)findViewById(R.id.btnsave);

    btnSave.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String filename=edtfilename.getText().toString();
            String content=edtcontent.getText().toString();

            FileOutputStream fileOutputStream;

            try{

                fileOutputStream=openFileOutput(filename, Context.MODE_PRIVATE);
                fileOutputStream.write(content.getBytes());
                fileOutputStream.close();
                Toast.makeText(FileStorage.this,filename+"saved",Toast.LENGTH_LONG).show();
            }catch (FileNotFoundException e){

                e.printStackTrace();

            }
            catch(IOException ex){
                ex.printStackTrace();
            }

        }
    });
    }


}
