import java.util.LinkedList;

public class Linklist {
    public static void main(String[] args) {

        LinkedList<Integer> no = new LinkedList<>();

        no.add(1);
        no.add(2);
        no.add(3);

        int firstnum = no.get(0);

        System.out.println("first no is:" + firstnum);

        no.set(1, 10);

        int size = no.size();

        System.out.println("size is :" + size);

        for (int num : no) {
            System.out.println("number is: " + num);
        }
    }

}
