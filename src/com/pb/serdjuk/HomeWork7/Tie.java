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



    public void dressMan() {
        String tie = tie;
        System.out.println(int size, int price, String color, tie);
    }


    public void dressWomen() {
        String tie = tie;
        System.out.println(int size, int price, String color, tie);
    }
}
