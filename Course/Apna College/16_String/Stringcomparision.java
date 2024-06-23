public class Stringcomparision {
    public static void main(String[] args) {
        String s1 = "AMAN";
        String s2 = "AMAN";
        String s3 = new String("AMAN");

        // if (s1 == s2) {
        //     System.out.println("String are equal");
        // } else {
        //     System.out.println("String are not equal");
        // }
        // if (s1 == s3) {
        //     System.out.println("String are equal");
        // } else {
        //     System.out.println("String are not equal");
        // }

        if (s1.equals(s3)) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");

        }
    }
}
