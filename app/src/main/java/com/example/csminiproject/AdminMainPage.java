package com.example.csminiproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;

public class AdminMainPage extends AppCompatActivity {
CardView viewform ;
    CardView report ;
    ImageView loagout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_main_page);
        viewform = findViewById(R.id.card_requested);
        loagout =findViewById(R.id.logout);
        final FirebaseAuth fAuth = FirebaseAuth.getInstance();
        loagout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fAuth.signOut();
                startActivity(new Intent(AdminMainPage.this, MainActivity.class));
                finish();
            }
        });
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
                Intent i = new Intent(AdminMainPage.this,Report_generate_year.class);
                startActivity(i);
            }
        });
    }
}
