package com.example.csminiproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AdminMainPage extends AppCompatActivity {
CardView viewform ;
    CardView report ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_main_page);
        viewform = findViewById(R.id.card_requested);
        viewform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AdminMainPage.this,ViewForm.class);
                startActivity(i);
            }
        });
        report = findViewById(R.id.card_approved);
        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AdminMainPage.this,Report_generate.class);
                startActivity(i);
            }
        });
    }
}
