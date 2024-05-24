import java.io.File;

public class Deletefilefolder {

    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }

        File myObj2 = new File("C:\\Users\\MyName\\Test");
        if (myObj.delete()) {
            System.out.println("Deleted the folder: " + myObj2.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }
    }

}