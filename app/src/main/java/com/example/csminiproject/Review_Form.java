package com.example.csminiproject;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Review_Form extends AppCompatActivity {
    TextView txt_id;

    TextView ans_id;

    TextView txt_name;
    TextView ans_name;

    TextView txt_sem;
    TextView ans_sem;

    TextView txt_activity;
    TextView ans_activity;

    TextView txt_event_name;
    TextView ans_event_name;

    TextView txt_date_from;
    TextView ans_date_from;

    TextView txt_date_to;
    TextView ans_date_to;

    TextView txt_scholarship_charusat;
    TextView ans_scholarship_charusat;

    TextView txt_scholarship_external;
    TextView ans_scholarship_external;

    TextView ans_certificate;

    TextView txt;
    EditText edt;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_form);


        txt_id = findViewById(R.id.txt_id);
        ans_id = findViewById(R.id.ans_id);

        txt_name = findViewById(R.id.txt_name);
        ans_name = findViewById(R.id.ans_name);

        txt_sem = findViewById(R.id.txt_sem);
        ans_sem = findViewById(R.id.ans_sem);

        txt_activity = findViewById(R.id.txt_activity);
        ans_activity = findViewById(R.id.ans_activity);

        txt_event_name = findViewById(R.id.txt_event_name);
        ans_event_name = findViewById(R.id.ans_event_name);

        txt_date_from = findViewById(R.id.txt_date_from);
        ans_date_from = findViewById(R.id.ans_date_from);

        txt_date_to = findViewById(R.id.txt_date_to);
        ans_date_to = findViewById(R.id.ans_date_to);

        txt_scholarship_charusat = findViewById(R.id.txt_scholarship_charusat);
        ans_scholarship_charusat = findViewById(R.id.ans_scholarship_charusat);

        txt_scholarship_external = findViewById(R.id.txt_scholarship_external);
        ans_scholarship_external = findViewById(R.id.ans_scholarship_external);

        ans_certificate = findViewById(R.id.ans_certificate);


        //Set Values from ReviewStorage Class
        ans_id.setText("" + ReviewStorage.stdId);
        ans_name.setText("" + ReviewStorage.stdName);
        ans_sem.setText("" + ReviewStorage.stdSem);
        ans_activity.setText("" + ReviewStorage.eventType);
        ans_event_name.setText("" + ReviewStorage.eventName);
        ans_date_from.setText("" + ReviewStorage.fromDate);
        ans_date_to.setText("" + ReviewStorage.toDate);
        ans_scholarship_charusat.setText("" + ReviewStorage.clgSch);
        ans_scholarship_external.setText("" + ReviewStorage.extSch);
        ans_certificate.setText("" + ReviewStorage.driveLink);


    }
}