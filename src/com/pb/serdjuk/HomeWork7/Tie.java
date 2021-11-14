package com.pb.serdjuk.HomeWork7;

public class Tie extends Clothes implements ManClothes, WomenClothes {
    public String tie;

    public Tie(int size, int price, String color, String tie) {
        super(size, price, color);
        this.tie = tie;
    }

    public Tie(int size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan(String dressman) {
        String tie = tie;
        System.out.println(int size, int price, String color, tie);
    }

    @Override
    public void dressWomen(String dresswomеn) {
        String tie = tie;
        System.out.println(int size, int price, String color, tie);
    }
}
