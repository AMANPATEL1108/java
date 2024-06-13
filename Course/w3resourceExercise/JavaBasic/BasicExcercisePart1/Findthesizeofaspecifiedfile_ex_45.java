import java.io.File;

/**
 * Findthesizeofaspecifiedfile_ex_45
 */
public class Findthesizeofaspecifiedfile_ex_45 {

    public static void main(String[] args) {
        System.out.println("abc.txt:" + new File("file/abc.txt").length() + "bytes");
        System.out.println("abc.txt:" + new File("file/xyz.txt").length() + "bytes");

    }
}