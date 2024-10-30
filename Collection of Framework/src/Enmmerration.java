import java.util.Enumeration;
import java.util.Vector;

public class Enmmerration {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        Enumeration<String> enumeration = fruits.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
