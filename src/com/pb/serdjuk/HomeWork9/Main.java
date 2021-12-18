package com.pb.serdjuk.HomeWork9;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.InputStream;

public class Main {
   /* public static void main(String[] args) throws Exception {
        FileNumbers.createNumbersFiles();
        FileNumbers.createOddNumbersFiles();
    }
}*/
   public static void main(String[] args) {

       try {
           LogManager logManager = LogManager.getLogManager();
           Path logConfigPath = Paths.get("src/HomeWork9/logging.properties");
           InputStream logConfigIs = Files.newInputStream(logConfigPath);
           logManager.readConfiguration(logConfigIs);
       } catch (Exception ex) {
           System.out.println("Error log configuration: " + ex);
       }

       System.out.println("Creates and process files...");
       FileNumbers.createNumbersFile();
       FileNumbers.createOddNumbersFile();
       System.out.println("Done!");
   }
}
