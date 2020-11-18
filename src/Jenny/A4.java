package Jenny;

import java.io.File;
import java.io.FileNotFoundException;
public class A4 {
    public static void main(String[] args) {
        File file1 = new File("file.txt");
        if (file1.delete()){
            System.out.println("File deleted:" + file1.getName());
        } else{
            System.out.println("404 Not Found");
        }
    }
}
