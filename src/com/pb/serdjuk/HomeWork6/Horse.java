package com.pb.serdjuk.HomeWork6;

public class Horse extends Animal {
    private String hor1;
    private String hor2;

    public Horse(String food, String location, String hor1, String hor2) {
        super(food, location);
        this.hor1 = hor1;
        this.hor2 = hor2;
    }

    public String getHor1() {

        return hor1;
    }

    public void setHor1(String hor1) {

        this.hor1 = hor1;
    }

    public String getHor2() {

        return hor2;
    }

    public void setHor2(String hor2) {

        this.hor2 = hor2;
    }

    @Override
    public void makeNoise() {

        System.out.println(hor1 + "ржет");
    }

    @Override
    public void eat() {

        System.out.println(hor2 + "принимает" + getFood());
    }

    @Override
    public String toString() {
        return "Horse{" +
                "hor1='" + hor1 + '\'' +
                ", hor2='" + hor2 + '\'' +
                '}';
    }
}
