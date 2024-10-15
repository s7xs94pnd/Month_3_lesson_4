package com.example.month_3_lesson_4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CitiesFragment extends Fragment {

    private ArrayList<String> citiesArr;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cities, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments()!=null){
           citiesArr =getArguments().getStringArrayList("key");
            initRV();
        }


    }

    private void initRV() {
        RecyclerView recyclerView = requireActivity().findViewById(R.id.rv_cities);
        CitiesAdapter citiesAdapter = new CitiesAdapter(this.getLayoutInflater(),citiesArr);
        recyclerView.setAdapter(citiesAdapter);
    }
}