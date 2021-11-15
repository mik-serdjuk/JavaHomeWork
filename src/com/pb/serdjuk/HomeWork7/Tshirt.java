package com.pb.serdjuk.HomeWork7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {
    public String tshirt;

    public Tshirt() {
        super(size, price, color);
        this.tshirt = tshirt;
    }

    public Clothes(Size size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void ManClothes.dressMan() {
      String tshirt = tshirt;
      System.out.println(Size size, int price, String color, tshirt);

    }

    public void WomenClothes.dressWomen() {
        String tshirt = tshirt;
        System.out.println(Size size, int price, String color, tshirt);
    }
}
