package com.pb.serdjuk.HomeWork3;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        int[] array = new int[] {-10, 1, 3, 2, 5, 4, 7, 6, 9, 8};
        int sum = 0; // сумма всех элементов массива
        int pos = 0; // положительный элемент
        boolean isSorted = false; // переменная соритировки массива
        int buf; // переменная для обмена элементов массива

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма всех элементов массива = " + sum);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)   {
                pos++;
            }

        }
        System.out.println("Количество положительных элементов: " + pos);

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
