package com.pb.serdjuk.HomeWork10;

public class Main {
    public static void main(String[] args) {
        NumBox<Float> floatBox = new NumBox<>(5);
        floatBox.add(1.1f);
        floatBox.add(5.0f);
        /*floatBox.add(3.1f);
        floatBox.add(7.7f);
        floatBox.add(0.2f);
        floatBox.add(2.1f);
        floatBox.add(2.2f);*/
        print(floatBox);

        NumBox<Integer> intBox = new NumBox<>(6);
        intBox.add(7);
        intBox.add(1);
        intBox.add(0);
        intBox.add(8);
        intBox.add(-2);
        intBox.add(1);
        print(intBox);
    }

    private static void print(NumBox<?> numBox) {
        int length = numBox.length();

        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.print(numBox.get(i) + " ");
        }
        System.out.println();

        System.out.println("Sum: " + numBox.sum());
        System.out.println("Avg: " + numBox.average());
        System.out.println("Max: " + numBox.max());
        System.out.println("Кол-во хранимых элементов" + " " + numBox.length());
        System.out.println("Число с индексом 0" + "=" + numBox.get(0));
    }
}
