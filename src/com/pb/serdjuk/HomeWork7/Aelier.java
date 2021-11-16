package com.pb.serdjuk.HomeWork7;

public class Aelier {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[] {
        new Tshirt(Size.S, 35, "червоний"),
        new Pants(Size.M, 99, "black"),
        new Skirt(Size.XS, 50, "green"),
        new Tie(Size.L, 35, "blue")
        };

        dressMan(clothes);

        System.out.println();

        dressWomen(clothes);

    }
    private static void dressMan (Clothes[] clothes) {
         for (Clothes clothe: clothes) {
            if (clothe instanceof ManClothes) {
                ((ManClothes) clothe).dressMan();
            }
    }
}

    private static void dressWomen (Clothes[] clothes) {
        for (Clothes clothe: clothes) {
            if (clothe instanceof WomenClothes) {
                ((WomenClothes) clothe).dressWomen();
            }
        }

    }

}
