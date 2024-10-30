import java.util.HashSet;

public class HashSetCollection {
    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple"); // Duplicate, won't be added

        System.out.println(fruits.size());

        if (fruits.contains("Banana")) {
            System.out.println("Banana is in the set.");
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
