package com.example.backstack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_D extends AppCompatActivity {
    Button btnd;
    TextView tv4,tv5,tv6;
    CheckBox cricket,bedminton,volleyball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);

        btnd =  findViewById(R.id.btnd);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        cricket = findViewById(R.id.cricket);
        bedminton = findViewById(R.id.bedminton);
        volleyball = findViewById(R.id.volleyball);

        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String email = i.getStringExtra("email");
        String gender = i.getStringExtra("gender");

        tv4.setText(name);
        tv5.setText(email);
        tv6.setText("Gender :- "+gender);

        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_D.this,Activity_E.class);
                String name = tv4.getText().toString();
                String email = tv5.getText().toString();
                String gender = tv6.getText().toString();
                String hobby = " ";
                if (cricket.isChecked()){
                    hobby +=" " + cricket.getText().toString();
                }
                if (volleyball.isChecked()){
                    hobby +=" " +volleyball.getText().toString();
                }
                if (bedminton.isChecked()) {
                    hobby +=" " + bedminton.getText().toString();
                }
                intent.putExtra("name",name);
                intent.putExtra("email",email);
                intent.putExtra("gender",gender);
                intent.putExtra("hobby",hobby);

                startActivity(intent);
                // For Case 2 and 3
               // finish();
            }
        });
    }

    // For Case 2
    /** public void onBackPressed() {
        Intent intent = new Intent(Activity_D.this,Activity_C.class);
        startActivity(intent);
    }  */
}
