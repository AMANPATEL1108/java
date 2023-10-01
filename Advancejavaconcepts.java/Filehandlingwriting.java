import java.io.File;

public class Filehandlingwriting {
    public static void main(String[] args) {

        File oldFile = new File("old.txt");
        File newFile = new File("new.txt");

        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed sucesfully");
        } else {
            System.out.println("file rename fail");
        }
    }
}
