import java.util.ArrayList;
import java.util.Iterator; // Import the Iterator interface

public class IteratorExample { // Renamed the class
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        Iterator<String> iterator = fruits.iterator(); // Use the imported Iterator interface

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
