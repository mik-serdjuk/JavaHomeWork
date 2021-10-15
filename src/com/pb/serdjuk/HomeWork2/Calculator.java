package com.pb.serdjuk.HomeWork2;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;

        System.out.print("Введите целое число1:");
        operand1 = scan.nextInt();
        System.out.print("Введите целое число2:");
        operand2 = scan.nextInt();
        System.out.print("Выберите действие +, -, *, /");
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




