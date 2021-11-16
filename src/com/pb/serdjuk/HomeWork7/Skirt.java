package com.pb.serdjuk.HomeWork7;

public class Skirt extends Clothes implements WomenClothes {
    public Skirt(Size size, int price, String color) {
        super (size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("женщина одевает юбку " + getInfo());
    }
}
