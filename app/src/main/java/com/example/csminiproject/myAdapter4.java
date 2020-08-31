package com.example.csminiproject;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import static com.example.csminiproject.Creds.sId;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class myAdapter4 extends RecyclerView.Adapter<myAdapter4.Viewholder> {
    private static View CL = null;
    ArrayList<String> listItems;



    private ValueEventListener context;

    public myAdapter4(ArrayList<String> listItems, ValueEventListener context) {
        this.listItems = listItems;
        this.context =  context;
    }




    @Override
    public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item1,parent,false);

        return new myAdapter4.Viewholder(v);
    }




    @Override
    public void onBindViewHolder(Viewholder holder, final int position) {
        final String listItem= listItems.get(position);
        holder.th.setText(listItem);

        holder.cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String path = listItem;

                Intent intent = new Intent (v.getContext(), demo2.class);
                intent.putExtra("path",path);
                v.getContext().startActivity(intent);
            }
        });




    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        TextView th;

        ConstraintLayout cl;

        public Viewholder(final View itemView) {
            super(itemView);
            th=itemView.findViewById(R.id.txt_id1);

            cl=itemView.findViewById(R.id.cl);






        }
    }
}


