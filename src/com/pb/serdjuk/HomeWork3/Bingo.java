package com.pb.serdjuk.HomeWork3;
import java.util.Random;
import java.util.Scanner;
public class Bingo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        System.out.println(" Игра - Угадайте число от 0 до 100. ");
        System.out.println(" Для выхода из программы введите - 101. ");

        Random random = new Random();

        int x = random.nextInt(101);
        //System.out.println("rand x: " + x);

        int counter = 0;

         do {
            counter++;
            System.out.println( " Угадайте число от 0 до 100. Введите число: " );
            operand1 = scan.nextInt();
             if (operand1 > 101) {
                 System.out.print( " Неверное число, не входит в диапазон от 0 до 100 " );

             }
             if (operand1 < 0) {
                 System.out.print( " Неверное число, не входит в диапазон от 0 до 100 " );

             }
             if (operand1 > x && operand1 != 101 && operand1 < 102 ) {
                System.out.print( " Задуманное число меньше вводимого " );

            } else if (operand1 < x && operand1 >= 0) {
                System.out.print( " Задуманное число больше вводимого " );

            }
             if (operand1 == x) {
                System.out.print( " Число отгадано, произведено " + counter + " попыток. " );
                break;
            }
             if (operand1 == 101) {
                System.out.print( " End " );
                break;
            }
         }
             while (operand1 != x);

        }
}
