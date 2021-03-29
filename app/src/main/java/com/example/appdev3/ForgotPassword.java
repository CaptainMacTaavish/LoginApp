package com.example.appdev3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final EditText phoneNumber;
        Button confirm;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        phoneNumber = findViewById(R.id.enter_phone_number);


        confirm = findViewById(R.id.confirm_details);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ForgotPassword.this, PasswordConfirm.class);
                startActivity(intent);

            }
        });
    }
}