package com.example.csminiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Report_generate_year extends AppCompatActivity {
EditText e1;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_generate_year);
        e1=findViewById(R.id.e1);
        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String year = e1.getText().toString();
                Intent i = new Intent(Report_generate_year.this,Report_generate.class);
                i.putExtra("year",year);
                startActivity(i);
            }
        });
    }
}
