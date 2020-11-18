package Mike;
import java.io.File;
import java.io.FileNotFoundException;

public class DeleteFile {
    public void deleteFile(String fileName){
        File file1 = new File(fileName);
        if (file1.delete()) {
            System.out.println("File deleted: " + file1.getName() + ".");
        } else {
            System.out.println("Not found.");
        }
    }
}
