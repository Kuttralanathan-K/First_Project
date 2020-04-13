package com.example.juliansharon.securitysystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Main7Activity extends AppCompatActivity {
   Integer C;
    Button ok,QR;

    EditText name,reason,date,time,date1,time1,date2;
    private FirebaseFirestore MF;

    public static  String username,userreason,userdate,userdate1,userdate2,usertime,usertime1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        MF=FirebaseFirestore.getInstance();
        ok=(Button) findViewById(R.id.button5);
        QR=(Button) findViewById(R.id.GET);
        name=(EditText)findViewById(R.id.editText2);
        reason=(EditText)findViewById(R.id.editText4);
        date=(EditText)findViewById(R.id.editText7);
        time1=(EditText)findViewById(R.id.editText5);
        QR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main7Activity.this, generator.class);
                startActivity(i);
            }
        });
        Toast.makeText(Main7Activity.this,"first add your data and press OK button",Toast.LENGTH_LONG).show();


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*username = name.getText().toString();
                userreason=reason.getText().toString();
                userdate=date.getText().toString();
                userdate1=date1.getText().toString();
                 userdate2=date2.getText().toString();
                 usertime=time.getText().toString();
                 usertime1=time1.getText().toString();
                Map<String,String> map1 = new HashMap<>();
                map1.put("name",username);
                map1.put("date",userdate);
                map1.put("month",userdate1);
                map1.put("year",userdate2);
                map1.put("reason",userreason);
                map1.put("hour",usertime);
                map1.put("min",usertime1);
                MF.collection("USERS").add(map1).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Toast.makeText(Main7Activity.this,"added sucessfully now click qrcode button",Toast.LENGTH_LONG).show();
                        name.setText("");
                        reason.setText("");
                        date.setText("");
                        time.setText("");
                        date1.setText("");
                        date2.setText("");
                        time1.setText("");

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        String ERROR = e.getMessage();
                        Toast.makeText(Main7Activity.this,"Error" +ERROR,Toast.LENGTH_LONG).show();
                    }
                }); */

                Intent intent = new Intent(Main7Activity.this,Payment.class);
                startActivity(intent);



            }
        });


    }


    }


