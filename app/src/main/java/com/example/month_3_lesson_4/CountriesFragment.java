package com.example.month_3_lesson_4;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.month_3_lesson_4.databinding.FragmentCountriesBinding;

import java.util.ArrayList;

public class CountriesFragment extends Fragment  implements OnItemClick{



    private FragmentCountriesBinding binding;
    private ArrayList<Country> countriesArr;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountriesBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }




    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null) {
            CL_gen continent = getArguments().getParcelable("data");
            countriesArr = continent.getCountries();
            initRV();
        }
    }



    private void initRV() {
        RecyclerView recyclerView = requireActivity().findViewById(R.id.rv_countries);
        CountryAdapter adapter = new CountryAdapter( this.getLayoutInflater(),countriesArr,this);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public void onClick(int position) {
        Country country =countriesArr.get(position);
       ArrayList<String> Cities = country.getCities();
       Bundle bundle =  new Bundle();
       CitiesFragment citiesFragment = new CitiesFragment();
       citiesFragment.setArguments(bundle);
       bundle.putStringArrayList("key",Cities);
       requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.ct_countries, citiesFragment).addToBackStack(null).commit();    }
}