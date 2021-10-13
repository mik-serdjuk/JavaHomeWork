package com.pb.serdjuk.HomeWork2;
import java.util.Scanner;
public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;

        System.out.print("Введите целое число1: Enter ");

        operand1 = scan.nextInt();

        if (operand1 >= 0 && operand1 <= 14) {
            System.out.print("[0 - 14]");
            } else if (operand1 >= 15 && operand1 <= 35) {
            System.out.print("[15 - 35]");
            } else if (operand1 >= 36 && operand1 <= 50) {
            System.out.print("[36 - 50]");
            } else if (operand1 >= 51 && operand1 <= 100) {
            System.out.print("[51 - 100]");
            } else {
            System.out.println("число не входит в диапазон");
            }

        }
}
