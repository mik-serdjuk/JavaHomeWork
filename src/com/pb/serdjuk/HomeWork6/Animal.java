package com.pb.serdjuk.HomeWork6;

public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public Animal() {

    }

    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }
    public String getLocation() {

        return location;
    }
    public void setLocation(String location) {

        this.location = location;
    }
    public void makeNoise() {

        System.out.println("животное шумит");
    }
    public void eat() {

        System.out.println("животное ест");
    }
    public void sleep() {

        System.out.println("животное спит");
    }
    public void fd() {

        System.out.println(food);
    }
    public void ad() {

        System.out.println(location);
    }
}


