package com.pb.serdjuk.HomeWork9;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileNumbers {
    public static void createNumbersFiles() throws Exception {
        try {
            PrintWriter fileout = new PrintWriter(new FileWriter("files/numbers.txt"));
            int[] array = new int[99];
            for (int j =1; j <=10; j++) {
                for (int i = 1; i < array.length & i <= 10; i++) {
                    array[i] = (int) Math.round((Math.random() * 99) + 1);
                    fileout.print(array[i] + " ");
                }
                fileout.println();
            }
            fileout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void createOddNumbersFiles() throws Exception {
        try {

        Path path = Paths.get("files/numbers.txt");

        // чтение всех строк файла
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        for (String s: lines) {
            System.out.println(s);
            }
            Path testFile1 = Files.createFile(Paths.get("files/numbers1.txt"));
        }   catch (Exception e) {
            System.out.println(e);
        }
    }

}
