import java.io.Console;

public class Inputanddisplaypassword_ex_42 {
    public static void main(String[] args) {

        Console cons;

        if ((cons = System.console()) != null) {
            char[] pass_ward = null;

            try {
                pass_ward = cons.readPassword("Input Password:");

                System.out.println("Your password was:" + new String(pass_ward));
            } finally {
                if (pass_ward != null) {
                    java.util.Arrays.fill(pass_ward, ' ');
                }
            }
        } else {
            throw new RuntimeException("Can't the Password ... No console");
        }
    }
}
