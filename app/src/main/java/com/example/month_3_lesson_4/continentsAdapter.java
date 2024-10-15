package com.example.month_3_lesson_4;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class continentsAdapter extends RecyclerView.Adapter<continentsViewHolder> {
    private LayoutInflater inflater;
    private ArrayList<CL_gen> continentsArr;
    private OnItemClick onClick;


    public continentsAdapter(LayoutInflater inflater, ArrayList<CL_gen> continentsArr, OnItemClick onClick) {
        this.inflater = inflater;
        this.continentsArr = continentsArr;
        this.onClick = onClick;
    }


    @NonNull
    @Override
    public continentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_macket,parent,false);
        return new continentsViewHolder(view);
    }




    @Override
    public void onBindViewHolder(@NonNull continentsViewHolder holder, @SuppressLint("RecyclerView") int position) {
        CL_gen continent  = continentsArr.get(position);
        holder.onBindContinents(continent);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClick.onClick(position);
            }
        });

    }



    @Override
    public int getItemCount() {
        return continentsArr.size();
    }
}
