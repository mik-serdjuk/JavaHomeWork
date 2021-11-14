package com.pb.serdjuk.HomeWork7;

public class Aelier {
    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt();
        Pants pants = new Pants();
        Skirt skirt = new Skirt();
        Tie tie = new Tie();

        Clothes[] clothes = new Clothes[] {tshirt, pants, skirt, tie};
        dressMan(clothes);
        dressWomen(clothes);

    }
    public static void dressMan (Clothes[] clothes) {
         for (Clothes clothe: clothes) {
            if (clothe instanceof ManClothes) {
                ManClothes manClothes = (ManClothes) clothe;
                ManClothes.dressMan("Одеть мужчину");
            }
    }
}



    public static void dressWomen (Clothes[] clothes) {
        for (Clothes clothe: clothes) {
            if (clothe instanceof WomenClothes) {
                WomenClothes womenClothes = (WomenClothes) clothe;
                WomenClothes.dressWomen("Одеть женщину");
            }
        }

    }

}
