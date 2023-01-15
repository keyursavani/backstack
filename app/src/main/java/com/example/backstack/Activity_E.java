package com.example.backstack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_E extends AppCompatActivity {

    TextView tv7,tv8,tv9,tv10;
    Spinner spinner;
    Button btne;
    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e);

        tv7 = findViewById(R.id.tv7);
        tv8 = findViewById(R.id.tv8);
        tv9 = findViewById(R.id.tv9);
        tv10 = findViewById(R.id.tv10);
        spinner = findViewById(R.id.spinner);
        btne = findViewById(R.id.btne);

        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String email = i.getStringExtra("email");
        String gender = i.getStringExtra("gender");
        String hobby = i.getStringExtra("hobby");

        tv7.setText(name);
        tv8.setText(email);
        tv9.setText(gender);
        tv10.setText("Hobby :- "+hobby);

        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,R.array.spinnerlist, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                data = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_E.this,Activity_F.class);

                String name = tv7.getText().toString();
                String email = tv8.getText().toString();
                String gender = tv9.getText().toString();
                String hobby = tv10.getText().toString();

                intent.putExtra("name",name);
                intent.putExtra("email",email);
                intent.putExtra("gender",gender);
                intent.putExtra("hobby",hobby);
                intent.putExtra("spinner",data);

                startActivity(intent);
            }
        });
    }

    // Case 1
 /*   @Override
    public void onBackPressed() {
        Intent intent = new Intent(Activity_E.this,MainActivity.class);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }  */

   // Case 2
  /** public void onBackPressed() {
       Intent intent = new Intent(Activity_E.this,Activity_D.class);
       startActivity(intent);
       finish();
   }  */

  // For Case 3

}