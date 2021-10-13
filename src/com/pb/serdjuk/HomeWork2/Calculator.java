package com.pb.serdjuk.HomeWork2;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;

        System.out.print("Введите целое число1: Enter ");
        System.out.print("Введите целое число2: Enter ");
        System.out.print("Выберите действие +, -, *, / Enter");

        operand1 = scan.nextInt();
        operand2 = scan.nextInt();
        sign = scan.next();

        switch (sign) {
            case "-":
                System.out.println(operand1 - operand2);
                break;
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "*":
                System.out.println(operand1 * operand2);
                break;
            case "/":
                if (operand2 ==0) {
                    System.out.print("Ошибка");
                } else {
                    System.out.println(operand1 / operand2);;
                }

        }
    }
}




