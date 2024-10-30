import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        ListIterator<String> listIterator = fruits.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
