import java.util.HashSet;
import java.util.Iterator;

public class Iterationonhashset {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bangaluru");

        // // Get an iterator from the HashSet
        // Iterator<String> it = cities.iterator();

        // // Iterate through the HashSet
        // while (it.hasNext()) {
        // System.out.println(it.next() + " ");
        // }

        for (String city : cities) {
            System.out.println(city);
        }

    }
}
