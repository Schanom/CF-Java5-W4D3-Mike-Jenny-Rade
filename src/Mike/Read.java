package Mike;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        try {
            File file = new File("fileMike.txt"); // Create file object
            Scanner scanner = new Scanner(file); // Create new scanner object
            while (scanner.hasNext()) { // While condition
                String output = scanner.next(); // Save lines read
                System.out.println(output); // Output lines read
            }
            scanner.close(); // Close the scanner
        } catch (FileNotFoundException e) { // Catch the exception
            System.out.println("Error occurred");
            e.printStackTrace();
        }

    }
}
