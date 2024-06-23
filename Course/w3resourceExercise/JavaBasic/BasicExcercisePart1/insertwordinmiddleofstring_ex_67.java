/**
 * insertwordinmiddleofstring._ex_67
 */
public class insertwordinmiddleofstring_ex_67 {

    public static void main(String[] args) {
        String main = "python 3.0";
        String word = "Tutorial";

        String result = main.substring(0, 7) + word + main.substring(6);

        System.out.println(result);
    }
}