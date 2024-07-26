package String;

public class StringClassDemo {
    public static void main(String[] args) {
        String str = new String("   Hello");
        System.out.println(str);
        System.out.println(str.length());
        // str = str.concat("Welcome");
        System.out.println(str);

        System.out.println(str.indexOf("H"));
        System.out.println("character at:" + str.charAt(4));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.compareTo("hello"));
        System.out.println(str.trim());

    }

}
