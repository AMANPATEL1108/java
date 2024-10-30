import java.util.ArrayList;
import java.util.ListIterator; // Import the ListIterator interface

public class ListIteratorExample { // Renamed the class
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        ListIterator<String> listIterator = fruits.listIterator(); // Use the imported ListIterator interface

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
