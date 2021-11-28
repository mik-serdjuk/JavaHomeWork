package com.pb.serdjuk.HomeWork10;


public class NumBox <T extends Number>{
    private final T[] numbers;
    public int length;
    int size[];

    // в кострукторе принимаем размер масиива size
    public NumBox (int size) {

    //создали массив из объектов класса T
    numbers = (T[]) new Number[size];

    }
    // +получаем элемент из массива по индексу
    public T get(int index) {
        return numbers[index];
    }
    // +добавдяем элемент в массив
    public void add(int index, T number) {
        this.numbers[index] = number;
    }
    // метод возвращает текущее количество элементов
    public int length (int size) {
        int i = 0;
        for (int i : numbers) {
            if (i == size) {
                i++;
            }
        }
        System.out.println(i);
        return i;
        }
    // среднее арифмет. элементов массива
    double average (size) {
        int s;
        size.double Value();
        s= size/size.length;
    }
    // сумма всех элементов массива
    double sum(int size) {
    size.double Value();
    System.out.println(size);
    return size;
    }
    //максимальный элемент массива
    T max (int size) {
        int cmax = numbers[0];
        for (int i : numbers) {
            if (numbers[i] > cmax) {
                cmax = numbers[i];
            }
        }
        System.out.println(cmax);
        return cmax;
    }
}
