package com.example.intro_splashscreen_kenko;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button, button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn2);
        button1 = findViewById(R.id.sosbtn2);
        button2 = findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(MainActivity.this, sos_page.class);
                startActivity(i2);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this, signup_activity.class);
                startActivity(i1);
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(MainActivity.this, login_activity.class);
                startActivity(i3);
            }
        });


    }

    public void btn1(View view) {
        EditText txt1 = findViewById(R.id.txtname1);
        EditText txt2 = findViewById(R.id.txtname2);
        String s1 = txt1.getText().toString();
        String s2 = txt2.getText().toString();
    }


}