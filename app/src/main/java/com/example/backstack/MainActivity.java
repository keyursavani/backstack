package com.example.backstack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btna;
    EditText etname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btna = findViewById(R.id.btna);
        etname = findViewById(R.id.etname);

        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity_B.class);
               String name = etname.getText().toString();
               intent.putExtra("name",name);
                startActivity(intent);
                // For Case 2
              //  finish();
            }
        });
    }
}