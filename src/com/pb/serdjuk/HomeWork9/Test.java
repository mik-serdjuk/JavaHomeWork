package com.pb.serdjuk.HomeWork9;

import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(new File("files/numbers.txt"));
            int[] array = new int[100];
            int i = 0;
            while (scanner.hasNextInt()) {
                array[i++] = scanner.nextInt();
            }
            System.out.print(array[i]);
            /*int[] array1 = array;
            int i1;
            for (int j =1; j <=10; j++) {
                for (i1 = 0; i1 < array1.length; i1++) {
                    if (i1 % 2 == 0) {
                        array1[i1] = 0;
                        System.out.println(array1[i1]);
                    }
                    System.out.println(array1);
                }
            }*/

        } catch (Exception e) {
            System.out.println(e);
        }

        /*Path path = Paths.get("files/numbers.txt");*/

        // write to file
       /* try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write("Some test 123");
            writer.newLine();
            writer.write("Other string 456");
        } catch (Exception ex) {
            System.out.println("Error with file write: " + ex);
        }
        System.out.println("Write to file \"" + path.toAbsolutePath() + "\" done!");*/


       /* // read from file
        System.out.println("Read text from file \"" + path.toAbsolutePath() + "\":");
        try (BufferedReader reader = Files.newBufferedReader(path)) {

            System.out.println("----------------------------------");*/
            /*String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }*/

            /*char[] result = line.toCharArray();
            int i;
            for (i=0; i < result.length; i++) {
                if (i % 2 == 0) {
                    result[i] = 0;
                    System.out.println(result);
                }
            }

        } catch (Exception ex) {
            System.out.println("Error with file read: " + ex);
        }
    }*/



        /*System.out.println("----------------------------------");*/
            /*final String line1 = line;
            int[] array1 = line1 [];*/


        /*System.out.println("Read from file done!");*/
    }
}