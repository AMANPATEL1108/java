import java.util.LinkedList;

public class LinkedListCollection {


    public static void main(String[] args) {

        LinkedList<Object> a = new LinkedList<>();

        a.add("Aman");
        a.add(1);
        a.add("Java");
        a.add(3.14);

        System.out.println("Initial LinkedList: " + a);

        a.add(1, "Hello");
        System.out.println("After Insertion at index 1: " + a);

        a.set(2, 42);
        System.out.println("After Update at index 2: " + a);

        a.remove("Java");
        System.out.println("After Removing 'Java': " + a);

        a.remove(0);
        System.out.println("After Removing element at index 0: " + a);

        System.out.println("Size of the LinkedList: " + a.size());

        boolean containsHello = a.contains("Hello");
        System.out.println("LinkedList contains 'Hello': " + containsHello);

        System.out.print("Elements in LinkedList: ");
        for (Object element : a) {
            System.out.print(element + " ");
        }
    }
}