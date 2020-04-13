package com.example.juliansharon.securitysystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main4Activity extends AppCompatActivity {
    EditText naame;
    EditText passss;
    Button login;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        naame = findViewById(R.id.editText);
        passss = findViewById(R.id.editText3);
        login = findViewById(R.id.button4);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(naame.getText().toString(),passss.getText().toString());
            }
        });
    }

    private void validate(String username,String userpassword)
    {

        if((username.equals("aaaa"))&&(userpassword.equals("1234"))){
            Intent a = new Intent(Main4Activity.this,Main7Activity.class);
            startActivity(a);



        }


    }
}
