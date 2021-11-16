package com.pb.serdjuk.HomeWork7;

public abstract class Clothes {
    protected final Size size;
    protected final int price;
    protected final String color;


    public Clothes(Size size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getInfo() {
        return "размер " + size.name() +  "  "  +  size.getEuroSize() +  "  " + size.getDescription() +
                " цвет " +  color  + " стоимость "  +  price;
    }

}
