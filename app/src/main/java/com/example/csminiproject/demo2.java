package com.example.csminiproject;

import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import static com.example.csminiproject.Creds.sId;
public class demo2 extends AppCompatActivity {
    Form form;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    ArrayList<Form> list;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        recyclerView = findViewById(R.id.rv1);


        form = new Form();
        list = new ArrayList<>();
        recyclerView.setHasFixedSize(true);
        Intent intent=getIntent();
        String path = (String) intent.getExtras().get("path");
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DatabaseReference myRef2 = database.getReference("StudentForm"+"/"+path);
        myRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for (DataSnapshot ds: snapshot.getChildren()){
                    //String year = ds.getKey();
/*
                    DatabaseReference myRef3 = database.getReference("StudentForm/"+year+"/"+sId);

                    myRef3.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {

                            for (DataSnapshot ds: snapshot.getChildren()){

                                form = ds.getValue(Form.class);


                                list.add(form);
                            }

                            // System.out.println(list.get(0).getStdSem());
                            adapter = new myAdapter(list, this);
                            recyclerView.setAdapter(adapter);
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });*/
                    form = ds.getValue(Form.class);


                    list.add(form);
                }
                adapter = new myAdapter(list, this);
                recyclerView.setAdapter(adapter);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

}
