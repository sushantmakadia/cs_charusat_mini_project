package com.example.csminiproject;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class myAdapter3 extends RecyclerView.Adapter<myAdapter3.Viewholder> {
    private static View CL = null;
    List<Form> listItems;



    private ValueEventListener context;

    public myAdapter3(ArrayList<Form> listItems, ValueEventListener context) {

        this.listItems = listItems;
        this.context =  context;
    }



    @Override
    public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item2,parent,false);

        return new Viewholder(v);
    }

    @Override
    public void onBindViewHolder(Viewholder holder, final int position) {

final Form listItem= listItems.get(position);
holder.th.setText(listItem.getStdID());
holder.t1.setText(listItem.getEventName());
holder.t2.setText(listItem.getDriveLink());
holder.t3.setText(listItem.getClgScholarship());

    }







    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        TextView th;
        TextView t1;
        TextView t2;
        TextView t3;

        ConstraintLayout cl;

        public Viewholder(final View itemView) {
            super(itemView);
            th=itemView.findViewById(R.id.txt_id1);
            t1=itemView.findViewById(R.id.txt_event_ans1);
            t2=itemView.findViewById(R.id.topic1);
            t3=itemView.findViewById(R.id.topic2);
            cl=itemView.findViewById(R.id.cl);






        }
    }
}
