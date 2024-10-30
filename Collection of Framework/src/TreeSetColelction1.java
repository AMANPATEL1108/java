import java.util.TreeSet;

public class TreeSetColelction1 {
    public static void main(String[] args) {

        TreeSet<String> treeSetFruits = new TreeSet<>();
        treeSetFruits.add("Banana");
        treeSetFruits.add("Apple");
        treeSetFruits.add("Cherry");
        treeSetFruits.add("Date");

        System.out.println("Size: " + treeSetFruits.size());
        System.out.println("First Element: " + treeSetFruits.first());
        System.out.println("Last Element: " + treeSetFruits.last());

        treeSetFruits.remove("Cherry");
        System.out.println("After removal: " + treeSetFruits);

        for (String fruit : treeSetFruits) {
            System.out.println(fruit);
        }
    }
}
