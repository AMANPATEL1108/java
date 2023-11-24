package codewithharry;

public class String_014 {
    public static void main(String[] args) {
        String b = "AMAN";
        String name = "AMANpatel";
        String a = "aamdadam ";

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(a.trim());
        System.out.println(name.substring(0, 4));
        System.out.println(name.replace('a', 'p'));
        System.out.println(name.startsWith("AM"));
        System.out.println(name.endsWith("el"));
        System.out.println(name.charAt(5));
        System.out.println(name.indexOf("pa", 3));
        System.out.println(name.lastIndexOf("AM"));
        System.out.println(b.equals("AMAN"));
    }
}
