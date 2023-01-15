package com.example.backstack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_C extends AppCompatActivity {
    Button btnc;
    TextView tv2,tv3;
    RadioGroup radioGroup;
    RadioButton radioButton,male,female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        btnc = findViewById(R.id.btnc);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        radioGroup = findViewById(R.id.radiogroup);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);

        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String email = i.getStringExtra("email");
        tv2.setText(name);
        tv3.setText("Email :- "+email);

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             //   int selectedId = radioGroup.getCheckedRadioButtonId();
             //   radioButton = findViewById(selectedId);

                Intent intent = new Intent(Activity_C.this,Activity_D.class);
                String name = tv2.getText().toString();
                String email = tv3.getText().toString();
                String gender = " ";
                if (male.isChecked()){
                    gender = male.getText().toString();
                }
                else if(female.isChecked()){
                    gender = female.getText().toString();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Please select Your Gender", Toast.LENGTH_SHORT).show();
                }

             //   String gender = radioButton.getText().toString();
                intent.putExtra("name",name);
                intent.putExtra("email",email);
                intent.putExtra("gender",gender);
                 startActivity(intent);
                 // For Case 2
                // finish();
            }
        });
    }

}