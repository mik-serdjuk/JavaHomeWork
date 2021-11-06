package com.pb.serdjuk.HomeWork6;

public class Dog extends Animal {
    private String dog1;
    private String dog2;

    public Dog(String food, String location, String dog1, String dog2) {
        super(food, location);
        this.dog1 = dog1;
        this.dog2 = dog2;
    }

    public String getDog1() {
        return dog1;
    }

    public void setDog1(String dog1) {
        this.dog1 = dog1;
    }

    public String getDog2() {
        return dog2;
    }

    public void setDog2(String dog2) {
        this.dog2 = dog2;
    }

    @Override
    public void makeNoise() {

        System.out.println(dog1 + "лает");
    }

    @Override
    public void eat() {

        System.out.println(dog2 + "принимает" + getFood());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dog1='" + dog1 + '\'' +
                ", dog2='" + dog2 + '\'' +
                '}';
    }
}
