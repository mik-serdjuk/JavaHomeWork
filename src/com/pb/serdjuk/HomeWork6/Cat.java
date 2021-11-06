package com.pb.serdjuk.HomeWork6;

import java.util.Objects;

public class Cat extends Animal {
    private String cat1;
    private String cat2;

    public Cat(String food, String location, String cat1, String cat2) {
        super(food, location);
        this.cat1 = cat1;
        this.cat2 = cat2;
    }

    public Cat() {

    }

    public String getCat1() {
        return cat1;
    }

    public void setCat1(String cat1) {

        this.cat1 = cat1;
    }

    public String getCat2() {
        return cat2;
    }

    public void setCat2(String cat2) {

        this.cat2 = cat2;
    }

    @Override
    public void makeNoise() {

        System.out.println(cat1 + "мяукает");
    }

    @Override
    public void eat() {

        System.out.println(cat2 + "принимает" + getFood());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(cat1, cat.cat1) && Objects.equals(cat2, cat.cat2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cat1, cat2);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "cat1='" + cat1 + '\'' +
                ", cat2='" + cat2 + '\'' +
                '}';
    }
}
