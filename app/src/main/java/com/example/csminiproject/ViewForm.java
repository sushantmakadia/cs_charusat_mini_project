package com.example.csminiproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ViewForm extends AppCompatActivity {
    String form;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_form);
        recyclerView = findViewById(R.id.rv1);

        FirebaseDatabase database = FirebaseDatabase.getInstance();

        list = new ArrayList<String>();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DatabaseReference myRef2 = database.getReference("StudentForm");
        myRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                System.out.println("-------------------------------------------------");
                for (DataSnapshot ds: snapshot.getChildren()){
                    form = ds.getKey();
                    System.out.println(ds.getKey());
                    list.add(form);
                }

                adapter = new myAdapter2(list, this);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

}
