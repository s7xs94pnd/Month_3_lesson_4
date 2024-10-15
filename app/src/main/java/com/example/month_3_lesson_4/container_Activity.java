package com.example.month_3_lesson_4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class container_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);


        CL_gen data = getIntent().getParcelableExtra("data");

        if (data != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", data);

            CountriesFragment countriesFragment = new CountriesFragment();
            countriesFragment.setArguments(bundle);

            getSupportFragmentManager().beginTransaction().add(R.id.ct_countries, countriesFragment).commit();


            Toast.makeText(this, data.getName(), Toast.LENGTH_SHORT).show();
        }
    }
}