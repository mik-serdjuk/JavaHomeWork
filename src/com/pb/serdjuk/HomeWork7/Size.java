package com.pb.serdjuk.HomeWork7;

public enum Size {
    XXS,
    XS,
    S,
    M,
    L;

    public String getDescription(Size size) {
        Size size = new Size();
        if (size == XXS) {
            System.out.print("Детский размер");
        } else {
            System.out.println("Взрослый размер");
        }
        break;
        return size;

    }

    public int getEuroSize(Size size) {
        Size size1 = new Size();
        switch (size1) {
            case XXS:
                size1 = 32;
                break;
            case XS:
                size1 = 34;
                break;
            case S:
                size1 = 36;
                break;
            case M:
                size1 = 38;
                break;
            case L:
                size1 = 40;
                break;
        }
        return size1;
    }

    Size(String size, int size1) {
    }
}
