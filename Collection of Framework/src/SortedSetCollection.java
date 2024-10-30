import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetCollection {
    public static void main(String[] args) {

        SortedSet<String> sortedFruits = new TreeSet<>();
        sortedFruits.add("Banana");
        sortedFruits.add("Apple");
        sortedFruits.add("Cherry");
        sortedFruits.add("Date");

        System.out.println("Size: " + sortedFruits.size());
        System.out.println("First Element: " + sortedFruits.first());
        System.out.println("Last Element: " + sortedFruits.last());

        for (String fruit : sortedFruits) {
            System.out.println(fruit);
        }
    }
}
