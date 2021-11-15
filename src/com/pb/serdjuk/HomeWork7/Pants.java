package com.pb.serdjuk.HomeWork7;

public class Pants extends Clothes implements ManClothes, WomenClothes {
    public String pants;

    public Pants(int size, int price, String color, String pants) {
        super(size, price, color);
        this.pants = pants;
    }

    public Pants(int size, int price, String color) {

        super(size, price, color);
    }

    @Override
    public void dressMan() {
        String pants = pants;
        System.out.println(int Size size, int price; int String color, pants);
    }

    @Override
    public void dressWomen() {
        String pants = pants;
        System.out.println(int Size size, int price, String color, pants);
    }
}
