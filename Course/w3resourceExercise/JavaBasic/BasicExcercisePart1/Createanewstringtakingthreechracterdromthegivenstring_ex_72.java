public class Createanewstringtakingthreechracterdromthegivenstring_ex_72 {
    public static void main(String[] args) {
        String a = " ";
        int len = a.length();
        if (len > 3) {
            System.out.println(a.substring(0, 3));
        } else if (len == 1) {
            System.out.println(a.charAt(0) + "##");
        } else {
            System.out.println("###");
        }
    }
}
