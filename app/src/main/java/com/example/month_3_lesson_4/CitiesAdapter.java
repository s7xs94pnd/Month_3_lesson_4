package com.example.month_3_lesson_4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class CitiesAdapter extends RecyclerView.Adapter<CitiesViewHolder> {
    private LayoutInflater inflater;
    private ArrayList<String> citiesArr;

    public CitiesAdapter(LayoutInflater inflater, ArrayList<String> citiesArr) {
        this.inflater = inflater;
        this.citiesArr = citiesArr;
    }

    @NonNull
    @Override
    public CitiesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_macket,parent,false);
        return new CitiesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CitiesViewHolder holder, int position) {
    String city = citiesArr.get(position);
    holder.OnBindCity(city);
    }

    @Override
    public int getItemCount() {
        return citiesArr.size();
    }
}
