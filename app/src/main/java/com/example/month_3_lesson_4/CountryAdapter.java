package com.example.month_3_lesson_4;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {
    private LayoutInflater inflater;
    private ArrayList<Country> countryArr;
    private OnItemClick onClick;


    public CountryAdapter(LayoutInflater inflater, ArrayList<Country> countryArr, OnItemClick onClick) {
        this.inflater = inflater;
        this.countryArr = countryArr;
        this.onClick = onClick;
    }


    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_macket,parent,false);
        return new CountryViewHolder(view);
    }




    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Country country  = countryArr.get(position);
        holder.onBindCountry(country);
        holder.itemView.setOnClickListener(view -> onClick.onClick(position));
    }



    @Override
    public int getItemCount() {
        return countryArr.size();
    }
}
