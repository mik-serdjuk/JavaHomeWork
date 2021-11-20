package com.pb.serdjuk.HomeWork7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {
    public Tshirt(Size size, int price, String color) {
        super (size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("мужчина одевает футболку " + getInfo());
    }

    @Override
    public void dressWomen()
    {
        System.out.println("женщина одевает футболку " + getInfo());
    }
}
