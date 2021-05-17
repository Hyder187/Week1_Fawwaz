package com.utility.week1_fawwaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    TextView email;
    TextView password;
    String emailString;
    String passwordString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        //linking textviews
        email=findViewById(R.id.activity_calculator_email);
        password=findViewById(R.id.activity_calculator_password);


        //receiving data
        Intent intent = getIntent();
        emailString=intent.getStringExtra("EMAIL");
        passwordString=intent.getStringExtra("PASSWORD");

        //display on textview
        email.setText(emailString);
        password.setText(passwordString);
        
    }
}