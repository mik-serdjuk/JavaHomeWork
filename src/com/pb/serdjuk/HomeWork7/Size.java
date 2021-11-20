package com.pb.serdjuk.HomeWork7;

public enum Size {
    XXS("Детский размер" ,32),
    XS("Взрослый размер" ,34 ),
    S("Взрослый размер" , 36),
    M("Взрослый размер" , 38),
    L("Взрослый размер" , 40);

    private String description;
    private int euroSize;

    Size(String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    /*Size(int euroSize) {
        this.description = "Взрослый размер";
        this.euroSize = euroSize;
    }*/ /*Конструктор для удобства принимает только int euroSize у которіх description = "Взрослый размер"*/

    public String getDescription() {
        return description;
    }

    public int getEuroSize() {
        return euroSize;
    }

}
