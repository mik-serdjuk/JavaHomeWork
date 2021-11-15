package com.pb.serdjuk.HomeWork7;

public class Skirt extends Clothes implements ManClothes, WomenClothes {
    public String skirt;

    public Skirt(int size, int price, String color, String skirt) {
        super(size, price, color);
        this.skirt = skirt;
    }

    @Override
    public void dressMan() {
        String skirt = skirt;
        System.out.println(int size, int price, String color, skirt);
    }

    @Override
    public void dressWomen() {
        String skirt = skirt;
        System.out.println(int size, int price, String color, skirt);
    }
}
