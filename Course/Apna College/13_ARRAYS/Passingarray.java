public class Passingarray {

    public static void update(int marks[], int nonchangbal) {
        nonchangbal = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;

        }
    }

    public static void main(String[] args) {
        int marks[] = { 97, 98, 99 };
        int nonchangbal = 5;
        update(marks, nonchangbal);
        System.out.println(nonchangbal);

        // print our marks

        for (int i = 0; i <= marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
        System.out.println();
    }
}
