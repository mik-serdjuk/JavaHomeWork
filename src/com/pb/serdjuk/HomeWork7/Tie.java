package com.pb.serdjuk.HomeWork7;

public class Tie extends Clothes implements ManClothes {
    public Tie(Size size, int price, String color) {
        super (size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("мужчина одевает галстук " + getInfo());
    }
}
