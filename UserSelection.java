package com.example.foodrecommended_asd;

// This ia builder design pattern
public class UserSelection {
    private String foodCategory;
    private String foodPrice;
    private String restaurantName;

    public void setFoodCategory(String food){
        foodCategory = food;
    }

    public void setFoodPrice(String price){
        foodPrice = price;
    }

    public void setRestaurantName(String name){
        restaurantName = name;
    }

    private String secondFoodCategory;
    private String secondFoodPrice;
    private String secondRestaurantName;

    public void setSecondRestaurant(String rest){
        secondRestaurantName = rest;
    }


    public void setSecondPrice(String price){
        secondFoodPrice = price;
    }


    public void setSecondCategory(String cat){
        secondFoodCategory = cat;
    }
    
    public void compareFoods(){
        if (foodCategory == null || foodPrice == null || restaurantName == null){
            // There is an error. must Select foods

        }
        else{

        }

    }

    public void print(){
        System.out.println(foodCategory + " " + foodPrice + " " + restaurantName );
        System.out.println(secondFoodCategory + " " + secondFoodPrice + " " + secondRestaurantName );
    }


}
