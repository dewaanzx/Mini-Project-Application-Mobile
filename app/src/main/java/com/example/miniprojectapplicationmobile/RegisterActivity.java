package com.example.miniprojectapplicationmobile;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    EditText username, password;
    TextView registrasi;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = (EditText) findViewById(R.id.log_name);
        password = (EditText)  findViewById(R.id.log_password);
        submit = (Button) findViewById(R.id.log_button);
        registrasi = (TextView) findViewById(R.id.log_daftar);
        

        
    }

}