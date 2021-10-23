package com.pb.serdjuk.HomeWork4;
import java.util.Scanner;
public class CapitalLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sign;
        String s2;

        System.out.print("Напишите предложение:");
        sign = scan.nextLine();
        s2 = "";
        s2 = s2 + sign.substring(0, 1).toUpperCase(); //первый символ -заглавным
        for (int i = 1; i < sign.length(); i++) {
            // смотрим, есть слева пробел:
            if (" ".equals(sign.substring(i - 1, i)))
                s2 = s2 + sign.substring(i, i + 1).toUpperCase();
            else
                s2 = s2 + sign.substring(i, i + 1);
        }
        System.out.println(s2);

        }
}


