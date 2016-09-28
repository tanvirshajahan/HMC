package com.tanvirshajahan.testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etAge = (EditText) findViewById(R.id.etAge);
        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPass1 = (EditText) findViewById(R.id.etPass1);
        final EditText etPass2 = (EditText) findViewById(R.id.etPass2);
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);


        final Button btnRegister= (Button) findViewById(R.id.btnRegister);

    }
}
