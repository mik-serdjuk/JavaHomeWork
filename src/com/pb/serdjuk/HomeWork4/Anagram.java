package com.pb.serdjuk.HomeWork4;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Long.compare;
public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1;
        String s2;

        System.out.print("Напишите предложение1:");
        s1 = scan.nextLine();
        System.out.print("Напишите предложение2:");
        s2 = scan.nextLine();
        String result1 = s1.replaceAll("[^\\p{L}\\p{N}]+", "");
        String result2 = s2.replaceAll("[^\\p{L}\\p{N}]+", "");
        /*System.out.println(s1);
        System.out.println(s2);
        System.out.println(result1);
        System.out.println(result2);*/
        String a1 = result1.toLowerCase();
        String a2 = result2.toLowerCase();

        char[] b1 = a1.toCharArray();
        char[] b2 = a2.toCharArray();
        Arrays.sort(b1);
        Arrays.sort(b2);
        String sorted1 = new String(b1);
        String sorted2 = new String(b2);
        /*System.out.println(sorted1);
        System.out.println(sorted2);*/
        char[] c1 = sorted1.toCharArray();
        char[] c2 = sorted2.toCharArray();
        if(Arrays.equals(c1, c2)) {
            System.out.println("Анаграмма");
        } else {
            System.out.println("Не анаграмма");
        }

    }
}






