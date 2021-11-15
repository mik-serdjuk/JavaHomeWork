package com.pb.serdjuk.HomeWork7;

public enum Size {
    XXS,
    XS,
    S,
    M,
    L;

    private String description;
    private int euroSize;

    public String getDescription() {
        return description;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription(Size description) {
        Size description = new Size();
        if (description == XXS) {
            System.out.print("Детский размер" + description);
        } else {
            System.out.println("Взрослый размер" + description);
        }
        break;
        return description;

    }

    public int getEuroSize(Size euroSize) {
        Size euroSize = new Size();
        switch (euroSize) {
            case XXS:
                euroSize = 32;
                break;
            case XS:
                euroSize = 34;
                break;
            case S:
                euroSize = 36;
                break;
            case M:
                euroSize = 38;
                break;
            case L:
                euroSize = 40;
                break;
        }
        return euroSize;
    }

    Size(String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    @Override
    public String toString() {
        return "Size{" +
                "description='" + description + '\'' +
                ", euroSize=" + euroSize +
                '}';
    }
}
