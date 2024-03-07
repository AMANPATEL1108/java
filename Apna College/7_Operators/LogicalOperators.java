public class LogicalOperators {
    public static void main(String[] args) {

        System.out.println("-------LOGICAL AND----------");

        System.out.println((3 > 2) && (5 > 0));
        System.out.println((3 < 2) && (5 > 0));
        System.out.println((3 > 2) && (5 < 0));
        System.out.println((3 < 2) && (5 < 0));

        System.out.println("-------LOGICAL OR----------");

        System.out.println((3 > 2) || (5 > 0));
        System.out.println((3 < 2) || (5 > 0));
        System.out.println((3 > 2) || (5 < 0));
        System.out.println((3 < 2) || (5 < 0));

        System.out.println("--------LOGICAL NOT----return Oposite answe-------");

        System.out.println(!(3 > 2));
        System.out.println(!(3 < 2));
    }
}
