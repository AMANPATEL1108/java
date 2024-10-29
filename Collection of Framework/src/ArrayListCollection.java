import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {

        ArrayList<Object> a = new ArrayList<>();

        a.add("Aman");
        a.add(1);
        a.add("Java");
        a.add(3.14);

        System.out.println("Initial ArrayList: " + a);

        a.add(1, "Hello");
        System.out.println("After Insertion at index 1: " + a);

        a.set(2, 42);
        System.out.println("After Update at index 2: " + a);

        a.remove("Java");
        System.out.println("After Removing 'Java': " + a);

        a.remove(0);
        System.out.println("After Removing element at index 0: " + a);

        System.out.println("Size of the ArrayList: " + a.size());

        boolean containsHello = a.contains("Hello");
        System.out.println("ArrayList contains 'Hello': " + containsHello);

        System.out.print("Elements in ArrayList: ");
        for (Object element : a) {
            System.out.print(element + " ");
        }
    }
}