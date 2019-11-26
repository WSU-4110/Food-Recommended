package com.example.foodrecommended_asd;


import android.graphics.Bitmap;

public class Rest {
    private int id;
    private String restName;
    private String banner;
    private int zipcode;
    private double restRating;
    private String website;
    private double phone;
    private double restPrice;
    private int category;

    public Rest(String restName, int zipcode, String website, double phone, int category) {
        this.restName = restName;
        //this.banner = banner;
        //find out how to post images with piccaso
        this.zipcode = zipcode;
        this.website = website;
        this.phone = phone;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getRestName() {
        return restName;
    }

    public String getBanner() {
        return banner;
    }

    public int getZipcode() {
        return zipcode;
    }

    public double getRestRating() {
        return restRating;
    }

    public int getCategory() {
        return category;
    }

    public String getWebsite() {
        return website;
    }

    public double getPhone() {
        return phone;
    }

    public double getRestPrice() {
        return restPrice;
    }
}
