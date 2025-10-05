//How to read data from text file using java program//


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleFileReader {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt"); // Replace with your file name
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line); // Print each line
            }

            scanner.close(); // Always close the scanner
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
