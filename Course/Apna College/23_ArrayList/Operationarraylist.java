import java.util.ArrayList;

public class Operationarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // list.add(1, 9);

        // System.out.println(list);

        // // list.remove(3);

        // // list.set(2, 4);
        // System.out.println(list.contains(1));

        // int element = list.get(2);

        // System.out.println(list);
        // System.out.println(element);

        // size of al

        System.out.print(list.size());

        // printarraylist
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
