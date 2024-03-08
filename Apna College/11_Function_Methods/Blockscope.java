public class Blockscope {
    public static void main(String[] args) {
        int p = 50;
        {
            int s = 45;
            System.out.println(s);
        }
        System.out.println(p);
    }
}
