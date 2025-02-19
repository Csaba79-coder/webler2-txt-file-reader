package hu.webler.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader6 {

    public static void main(String[] args) {
        String filePath = "src/main/resources/books.txt";
        int lineCount = countLines(filePath);
        String[][] matrix = new String[lineCount][];

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int index = 0;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (line.endsWith("*")) {
                    parts[parts.length - 1] = parts[parts.length - 1] + " raktáron";
                } else {
                    parts[parts.length - 1] = parts[parts.length - 1] + " nincs raktáron";
                }
                matrix[index] = parts;
                index++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (String[] row: matrix) {
            for (String cell: row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    private static int countLines(String filePath) {
        int lineCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return lineCount;
    }
}
