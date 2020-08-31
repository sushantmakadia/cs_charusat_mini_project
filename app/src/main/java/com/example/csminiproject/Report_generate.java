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

import static com.example.csminiproject.Creds.sId;
public class Report_generate extends AppCompatActivity {
    Form form;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    ArrayList<Form> list;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
String key_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        recyclerView = findViewById(R.id.rv1);

        //FirebaseDatabase database = FirebaseDatabase.getInstance();
        form = new Form();
        list = new ArrayList<>();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DatabaseReference myRef2 = database.getReference("StudentForm");

        myRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for (DataSnapshot ds: snapshot.getChildren()){
                    key_id = ds.getKey();
                    System.out.println(key_id);
                    DatabaseReference myRef3 = database.getReference("StudentForm/"+key_id);

                    myRef3.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {

                            for (DataSnapshot ds: snapshot.getChildren()){

                                form = ds.getValue(Form.class);

                                System.out.println(form.getEventName());
                                list.add(form);
                            }

                            // System.out.println(list.get(0).getStdSem());
                            adapter = new myAdapter3(list, this);
                            recyclerView.setAdapter(adapter);
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });

                }

                // System.out.println(list.get(0).getStdSem());
                adapter = new myAdapter3(list, this);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

}
