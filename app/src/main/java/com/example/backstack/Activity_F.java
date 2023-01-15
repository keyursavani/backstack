package com.example.backstack;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_F extends AppCompatActivity {
    TextView tv11,tv12,tv13,tv14,tv15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f);

        tv11 = findViewById(R.id.tv11);
        tv12 = findViewById(R.id.tv12);
        tv13 = findViewById(R.id.tv13);
        tv14 = findViewById(R.id.tv14);
        tv15 = findViewById(R.id.tv15);

        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String email = i.getStringExtra("email");
        String gender = i.getStringExtra("gender");
        String hobby = i.getStringExtra("hobby");
        String spinner = i.getStringExtra("spinner");

        tv11.setText(name);
        tv12.setText(email);
        tv13.setText(gender);
        tv14.setText(hobby);
        tv15.setText("Age :- "+spinner);
    }
}