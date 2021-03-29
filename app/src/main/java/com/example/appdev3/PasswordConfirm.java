package com.example.appdev3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PasswordConfirm extends AppCompatActivity {

    EditText new_password1, confirm_new_password_1;
    Button reset_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_confirm);

        new_password1 = findViewById(R.id.enter_new_password);
        confirm_new_password_1 = findViewById(R.id.confirm_new_password);

        reset_button = findViewById(R.id.reset__button_password);

        reset_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(PasswordConfirm.this, MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Password has been set successfully", Toast.LENGTH_SHORT).show();
            }
        });

    }
}