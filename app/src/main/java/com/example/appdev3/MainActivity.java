package com.example.appdev3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView, textView_1;

    EditText user_name, pass_word;

    Button login_btn;

    String user_name_et1 = "admin";
    String pass_word_et1 = "admin";

    String user_name_et2 = "TEAC001";
    String pass_word_et2 = "0000";

    String user_name_et3 = "STU001";
    String pass_word_et3 = "0000";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user_name = findViewById(R.id.enter_username);
        pass_word = findViewById(R.id.enter_password);
        login_btn = findViewById(R.id.button_login);

        textView = findViewById(R.id.signup);
        textView_1 = findViewById(R.id.forgot_password);
        String text = "              Forgot Password";



        SpannableString ss = new SpannableString(text);


        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(MainActivity.this, ForgotPassword.class);
                startActivity(intent);
            }

            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLUE);
            }
        };
        ss.setSpan(clickableSpan1, 14, 29, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(ss);
        textView.setMovementMethod(LinkMovementMethod.getInstance());




        Intent intent = getIntent();
        String user = intent.getStringExtra("enter_username");
        user_name.setText(user);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user1 = user_name.getText().toString();
                String password = pass_word.getText().toString();

                if(user1.equals(user_name_et1) && password.equals(pass_word_et1) ||
                        user1.equals(user_name_et2) && password.equals(pass_word_et2) ||
                        user1.equals(user_name_et3) && password.equals(pass_word_et3))
                {
                    Intent intent = new Intent(MainActivity.this, Dashboard.class);
                    intent.putExtra("user", user1);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Incorrect Username or Password",
                            Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}