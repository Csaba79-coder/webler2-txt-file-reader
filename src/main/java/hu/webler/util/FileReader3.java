package hu.webler.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader3 {

    private static final String FILE_PATH = "src/main/resources/books.txt";

    public static void main(String[] args) {

        readFromFile();
        System.out.println("------------");
        readFromFile(FILE_PATH);
    }

    private static void readFromFile(String filePath) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File not found " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error closing the file reader: " + e.getMessage());
                }
            }
        }
    }

    private static void readFromFile() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(FILE_PATH));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File not found " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error closing the file reader: " + e.getMessage());
                }
            }
        }
    }
}
