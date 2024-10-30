import java.util.Vector;

public class VectorCollection {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        System.out.println(fruits.size());
        System.out.println(fruits.capacity());
        System.out.println(fruits.firstElement());
        System.out.println(fruits.lastElement());

        fruits.remove("Banana");
        System.out.println(fruits);

        System.out.println(fruits.contains("Apple"));

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
