package com.example.splashscreendifferentactivitiesprojects;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DatabaseImplementation extends AppCompatActivity implements View.OnClickListener {
EditText edtfirstName,edtlastname,edtid;
Button btninsert,btnview,btnsearch,btnupdate,btndelete;
SQLiteDataBase db2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_implementation);

        edtfirstName=(EditText)findViewById(R.id.edtfirstname);
        edtlastname=(EditText)findViewById(R.id.edtlastname);
        edtid=(EditText)findViewById(R.id.edtid);

        btninsert=(Button)findViewById(R.id.btninsert);
        btnview=(Button)findViewById(R.id.btnview);
        btnsearch=(Button)findViewById(R.id.btnsearch);
        btnupdate=(Button)findViewById(R.id.btnupdate);
        btndelete=(Button)findViewById(R.id.btndelete);

        btninsert.setOnClickListener(this);
        btnview.setOnClickListener(this);
        btnsearch.setOnClickListener(this);
        btnupdate.setOnClickListener(this);

        db2=new SQLiteDataBase(this);

    }

    @Override
    public void onClick(View v) {
       switch(v.getId()){

           case R.id.btninsert:
               boolean ok=true;
            try {
                String firstname = edtfirstName.getText().toString();
                String lastname = edtlastname.getText().toString();
                db2.insertStudent(firstname, lastname);
            }catch(Exception e){
                ok =false;
               String errormsg=e.toString();
               Dialog dialog=new Dialog(DatabaseImplementation.this);
               dialog.setTitle("Exception Error");
               TextView textView=new TextView(this);
               textView.setText(errormsg);
               dialog.setContentView(textView);
               dialog.show();
            }finally{
                if(ok) {
                    Dialog dialog = new Dialog(this);
                    dialog.setTitle("You Insert Data Successfully");
                    TextView textView = new TextView(this);
                    textView.setText("Congrats");
                    dialog.setContentView(textView);
                    dialog.show();
                }
            }

             break;

           case R.id.btnview:
               Intent intent=new Intent(DatabaseImplementation.this,SQLView.class);
               startActivity(intent);
               break;

           case R.id.btnsearch:
               boolean ok2=true;
               try {
                  String edt=edtid.getText().toString();
                  Long l=Long.parseLong(edt);
                   String sfname=db2.searchStudentfirstname(l);
                   String lname=db2.searchStudentlastname(l);
                   edtfirstName.setText(sfname);
                   edtlastname.setText(lname);
               }catch(Exception e){
                   ok2 =false;
                   String errormsg=e.toString();
                   Dialog dialog=new Dialog(DatabaseImplementation.this);
                   dialog.setTitle("Exception Error");
                   TextView textView=new TextView(this);
                   textView.setText(errormsg);
                   dialog.setContentView(textView);
                   dialog.show();
               }finally{
                   if(ok2) {
                       Dialog dialog = new Dialog(this);
                       dialog.setTitle("You Insert Data Successfully");
                       TextView textView = new TextView(this);
                       textView.setText("Congrats");
                       dialog.setContentView(textView);
                       dialog.show();
                   }
               }
               break;

           case R.id.btnupdate:
               boolean ok3=true;
               try {
                   String firstname=edtfirstName.getText().toString();
                   String lastname=edtlastname.getText().toString();
                   String edt=edtid.getText().toString();
                   Long l=Long.parseLong(edt);
                   db2.updateStudent(l,firstname,lastname);
               }catch(Exception e){
                   ok2 =false;
                   String errormsg=e.toString();
                   Dialog dialog=new Dialog(DatabaseImplementation.this);
                   dialog.setTitle("Exception Error");
                   TextView textView=new TextView(this);
                   textView.setText(errormsg);
                   dialog.setContentView(textView);
                   dialog.show();
               }finally {
                   if (ok3) {
                       Dialog dialog = new Dialog(this);
                       dialog.setTitle("You Insert Data Successfully");
                       TextView textView = new TextView(this);
                       textView.setText("Congrats");
                       dialog.setContentView(textView);
                       dialog.show();
                   }
               }

               break;

           case R.id.btndelete:

               break;
        }

    }
}
