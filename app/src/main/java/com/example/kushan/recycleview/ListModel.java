package com.example.kushan.recycleview;

/**
 * Created by kushan on 5/3/2018.
 */

public class ListModel {
    private String country;
    private String capital;

    public ListModel(String country, String capital) {
        this.country = country;
        this.capital = capital;
    }

    public String getCountry() {
        return country;
    }

    public String getCapital() {
        return capital;
    }
}
