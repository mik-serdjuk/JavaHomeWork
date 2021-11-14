package com.pb.serdjuk.HomeWork7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {
    public String tshirt;

    public Tshirt(int size, int price, String color, String tshirt) {
        super(size, price, color);
        this.tshirt = tshirt;
    }

    @Override
    public void dressMan(String dressman) {
      String tshirt = tshirt;
      System.out.println(int size, int price, String color, tshirt);
    }

    @Override
    public void dressWomen(String dresswomеn) {
        String tshirt = tshirt;
        System.out.println(int size, int price, String color, tshirt);
    }
}
