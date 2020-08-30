package com.example.csminiproject;

import android.content.Context;

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

public class myAdapter extends RecyclerView.Adapter<myAdapter.Viewholder> {
    private static View CL = null;
    List<Form> listItems;



    private ValueEventListener context;

    public myAdapter(ArrayList<Form> listItems, ValueEventListener context) {
        this.listItems = listItems;
        this.context =  context;
    }



    @Override
    public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);

        return new Viewholder(v);
    }

    @Override
    public void onBindViewHolder(Viewholder holder, final int position) {
final Form listItem= listItems.get(position);
holder.th.setText(listItem.getEventName());
holder.td.setText(listItem.getStdSem());
        holder.tq.setText(listItem.getEventType());
holder.cl.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        ReviewStorage.stdId = listItem.getStdID();
        ReviewStorage.stdName = listItem.getStdName();
        ReviewStorage.stdSem = listItem.getStdSem();
        ReviewStorage.eventType = listItem.getEventType();
        ReviewStorage.eventName = listItem.getEventName();
        ReviewStorage.fromDate = listItem.getFromDate();
        ReviewStorage.toDate = listItem.getToDate();
        ReviewStorage.clgSch = listItem.getClgScholarship();
        ReviewStorage.extSch = listItem.getExtScholarship();
        ReviewStorage.driveLink = listItem.getDriveLink();
        Intent intent = new Intent (v.getContext(), Review_Form.class);
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
        TextView td;
        TextView tq;
        ConstraintLayout cl;

        public Viewholder(final View itemView) {
            super(itemView);
            th=itemView.findViewById(R.id.txt_id1);
            td=itemView.findViewById(R.id.txt_sem_ans1);
            tq=itemView.findViewById(R.id.topic1);
            cl=itemView.findViewById(R.id.cl);






        }
    }
}
