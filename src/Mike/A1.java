package Mike;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.*;

public class A1 {
    public static void countEgg(File file, String wordname){
        int count = 0;
        try (LineNumberReader r = new LineNumberReader(new FileReader(file))) {
            String line;
            while ((line = r.readLine()) != null) {
                for (String element : line.split(" ")) {
                    if (element.equalsIgnoreCase(wordname)) {
                        count++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The word " + wordname + " appears " + count + " times.");
    }



    public static void main(String[] args)throws IOException {
        try {
            File file = new File("myfileMike.txt"); // Create file
            if (file.createNewFile()) { // Use createNewFile() method
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println(file.getName() + " already exists");
            }
        } catch (Exception e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }


        try {
            FileWriter file1 = new FileWriter("fileMike.txt");
            file1.write("recipe for cooking egg:\n" +
                    "incrediens: egg\n" +
                    "put egg in boiling water\n" +
                    "cook for a few minutes\n" +
                    "take egg out\n" +
                    "done\n" +
                    "eat cooked egg\n" +
                    "you won");
            file1.close();
            System.out.println("Successfully wrote to file ");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        File file = new File("fileMike.txt");
        countEgg(file, "egg");

        DeleteFile deleteFile = new DeleteFile();
        deleteFile.deleteFile("myfileMike.txt");



    }
}
