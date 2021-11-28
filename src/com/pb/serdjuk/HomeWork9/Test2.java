package com.pb.serdjuk.HomeWork9;
import java.io.FileReader;
import java.io.Reader;

public class Test2 {
    public static void main(String[] args) {
        // Creates an array of character
        char[] array = new char[100];

        // Creates a reader using the FileReader
        try (Reader reader = new FileReader("files/numbers.txt")) {

            // Checks if reader is ready
            System.out.println(reader.ready());

            // Reads characters
            reader.read(array);
            System.out.println("Ok:");
            System.out.println(array);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}