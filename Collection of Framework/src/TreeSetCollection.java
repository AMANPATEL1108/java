import java.util.TreeSet;

class Fruit implements Comparable<Fruit> {
    private String name;
    private int quantity;

    public Fruit(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public int compareTo(Fruit other) {
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            return Integer.compare(this.quantity, other.quantity);
        }
    }

    @Override
    public String toString() {
        return name + " (" + quantity + ")";
    }
}

public class TreeSetCollection {
    public static void main(String[] args) {
        TreeSet<Fruit> fruitSet = new TreeSet<>();

        fruitSet.add(new Fruit("Banana", 12));
        fruitSet.add(new Fruit("Apple", 20));
        fruitSet.add(new Fruit("Cherry", 10));
        fruitSet.add(new Fruit("Apple", 5));
        fruitSet.add(new Fruit("Date", 8));

        System.out.println("TreeSet of Fruits: " + fruitSet);

        System.out.println("First element: " + fruitSet.first());
        System.out.println("Last element: " + fruitSet.last());

        System.out.println("Contains 'Apple (20)': " + fruitSet.contains(new Fruit("Apple", 20)));

        Fruit lowerFruit = fruitSet.lower(new Fruit("Cherry", 10));
        System.out.println("Element lower than 'Cherry (10)': " + (lowerFruit != null ? lowerFruit : "None"));

        Fruit higherFruit = fruitSet.higher(new Fruit("Apple", 20));
        System.out.println("Element higher than 'Apple (20)': " + (higherFruit != null ? higherFruit : "None"));

        System.out.println("HeadSet (up to 'Cherry'): " + fruitSet.headSet(new Fruit("Cherry", 10)));
        System.out.println("TailSet (from 'Cherry' inclusive): " + fruitSet.tailSet(new Fruit("Cherry", 10)));

        System.out.println("Poll First (remove first): " + fruitSet.pollFirst());
        System.out.println("After pollFirst: " + fruitSet);

        System.out.println("Poll Last (remove last): " + fruitSet.pollLast());
        System.out.println("After pollLast: " + fruitSet);

        fruitSet.clear();
        System.out.println("After clear, TreeSet is empty: " + fruitSet.isEmpty());
    }
}
