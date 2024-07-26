package String;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("WELCOME");
        System.out.println(str);
        str.append(" To Java");
        System.out.println(str);
        System.out.println(str.insert(4, "How"));
        System.out.println(str.delete(4, 7));
        System.out.println(str.reverse());
        System.out.println(str.length());
        System.out.println(str.reverse());
        System.out.println(str.indexOf("WELCOME"));
        System.out.println(str.charAt(3));
        System.out.println(str.substring(0, 3));
        System.out.println(str.subSequence(11, 15));
        System.out.println(str);
    }
}
