package hu.webler.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader2 {

    public static void main(String[] args) {

        // String filePath = "resources/books.txt"; // ez sem volt elég! az útvonal még rövid, kellett neki a path from content root
        String filePath = "src/main/resources/books.txt";

        // try with resources
        // nem kell ide finally, mert try with resources-t használunk
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
