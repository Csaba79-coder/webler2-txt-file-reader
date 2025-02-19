package hu.webler.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader4 {

    private static final String FILE_PATH = "src/main/resources/books.txt";

    public static void main(String[] args) {
        readFromFile(FILE_PATH);
        System.out.println("------------");
        try {
            readLinesFromFile(FILE_PATH);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    private static void readLinesFromFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
