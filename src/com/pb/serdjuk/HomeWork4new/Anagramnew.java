package com.pb.serdjuk.HomeWork4new;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Long.compare;

public class Anagramnew {
    static String probel1(String s1) {
        s1 = s1.replaceAll("[^\\p{L}\\p{N}]+", "");
        return s1;
    }
    static String probel2(String s2) {
        s2 = s2.replaceAll("[^\\p{L}\\p{N}]+", "");
        return s2;
    }
    static String low1(String result1) {
        result1 = result1.toLowerCase();
        return result1;
    }
    static String low2(String result2) {
        result2 = result2.toLowerCase();
        return result2;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1;
        String s2;

        System.out.print("Напишите предложение1:");
        s1 = scan.nextLine();
        System.out.print("Напишите предложение2:");
        s2 = scan.nextLine();
        String result1 = probel1(s1);
        String result2 = probel2(s2);

        String a1 = low1(result1);
        String a2 = low2(result2);

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
