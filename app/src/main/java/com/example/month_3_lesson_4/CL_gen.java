package com.example.month_3_lesson_4;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;


public class CL_gen implements Parcelable {
    private String name;
    private ArrayList<Country> countries;

    public CL_gen(String name, ArrayList<Country> countries) {
        this.name = name;
        this.countries = countries;
    }

    protected CL_gen(Parcel in) {
        name = in.readString();
        countries = in.createTypedArrayList(Country.CREATOR);
    }

    public static final Creator<CL_gen> CREATOR = new Creator<CL_gen>() {
        @Override
        public CL_gen createFromParcel(Parcel in) {
            return new CL_gen(in);
        }

        @Override
        public CL_gen[] newArray(int size) {
            return new CL_gen[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Country> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<Country> countries) {
        this.countries = countries;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeTypedList(countries);
    }
}