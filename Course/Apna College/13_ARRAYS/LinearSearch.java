public class LinearSearch {

    public static int Samoshasearch(String menu[], String item) {
        for (int i = 0; i <= menu.length; i++) {
            if (menu[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public static int Lineasrch(int number[], int key) {
        for (int i = 0; i <= number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;
        String menu[] = { "dhosa", "Chole", "smosa", "dabeli" };
        String item = "smosa";

        int samo = Samoshasearch(menu, item);
        if (samo == -1) {
            System.out.println("item Not Found");
        } else {
            System.out.println("item is at Index:" + samo);

            int index = Lineasrch(number, key);
            if (index == -1) {
                System.out.println("Not Found");
            } else {
                System.out.println("Key is at Index:" + index);
            }
        }
    }
}