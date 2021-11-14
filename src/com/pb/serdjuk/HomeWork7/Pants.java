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
    public void dressMan(String dressman) {
        String pants = pants;
        System.out.println(int size, int price, String color, pants);
    }

    @Override
    public void dressWomen(String dresswomеn) {
        String pants = pants;
        System.out.println(int size, int price, String color, pants);
    }
}
