package Jenny;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A1 {
    public static void main(String[] args) {
        // catching the error
        try {
            File filePath = new File("file.txt");
            if (filePath.createNewFile()) {
                System.out.println("File created:" + filePath);
            } else {
                System.out.println("File already exists");
            }

            try (FileWriter file = new FileWriter(filePath)) {
                file.write("Fahrn fahrn fahrn mit der Autobahn");
                System.out.println("Successfully wrote to the file ");
            } finally {
                System.out.println("File closed");
            }

        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }
}
