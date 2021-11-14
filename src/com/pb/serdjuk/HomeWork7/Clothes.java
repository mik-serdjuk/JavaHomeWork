package com.pb.serdjuk.HomeWork7;

public abstract class Clothes {
    protected int Size;
    protected int price;
    protected String color;

    public Clothes(int size, int price, String color) {
        Size = size;
        this.price = price;
        this.color = color;
    }
}
