package com.example.juliansharon.securitysystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText uname;
    EditText pword;
    Button login;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        uname = findViewById(R.id.editText);
        pword = findViewById(R.id.editText3);
        login = findViewById(R.id.button4);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               validate(uname.getText().toString(),pword.getText().toString());
            }
        });
    }

    private void validate(String username,String userpassword)
    {

        if((username.equals("security"))&&(userpassword.equals("1234"))){
            Intent a = new Intent(Main2Activity.this,qrcode.class);
            startActivity(a);



        }


    }
}
