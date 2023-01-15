package com.example.backstack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_B extends AppCompatActivity {
    Button btnb;
    TextView tv1;
    EditText etemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        btnb = findViewById(R.id.btnb);
        tv1 = findViewById(R.id.tv1);
        etemail = findViewById(R.id.etemail);

        Intent i = getIntent();
        String name = i.getStringExtra("name");
        tv1.setText("Name :- "+name);


        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_B.this, Activity_C.class);

                // For Explicit Intent
//                Intent i1 = new Intent(getApplicationContext(),Activity_B.class);
//                startActivity(i1);
                // For Implecit Intent
//                Intent i = new Intent(Intent.ACTION_VIEW);
//                i.setData(Uri.parse("www.google.com"));
//                startActivity(i);

                String email = etemail.getText().toString();
                String name = tv1.getText().toString();
                intent.putExtra("email",email);
                intent.putExtra("name",name);
                startActivity(intent);
                // For Case 2
                //finish();
            }
        });

    }
}


