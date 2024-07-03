import java.util.HashSet;

public class UnionIntersectionOfTwoArrays {
    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        // Compute the union
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        System.out.println("Union: " + set);

        // Compute the intersection
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }

        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (set1.contains(arr2[i])) {
                count++;
                set1.remove(arr2[i]); // To avoid counting duplicates
            }
        }
        System.out.println("Intersection = " + count);
    }
}
