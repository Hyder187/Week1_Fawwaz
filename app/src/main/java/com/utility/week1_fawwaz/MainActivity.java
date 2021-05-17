package com.utility.week1_fawwaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout backButton;
    Button loginButton;
    EditText emailInput;
    EditText passwordInput;
    String email;
    String password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking all the views
        backButton=findViewById(R.id.activity_main_back_button);
        loginButton=findViewById(R.id.activity_main_login_button);
        emailInput=findViewById(R.id.activity_main_email_input);
        passwordInput=findViewById(R.id.activity_main_password_input);

        //Button onClickListener()
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //here all the work is done when the login button is pressed
                email=emailInput.getText().toString();
                password=passwordInput.getText().toString();

                Intent intent=new Intent(MainActivity.this,Calculator.class);
                intent.putExtra("EMAIL",email);
                intent.putExtra("PASSWORD",password);

                startActivity(intent);

            }
        });




    }
}