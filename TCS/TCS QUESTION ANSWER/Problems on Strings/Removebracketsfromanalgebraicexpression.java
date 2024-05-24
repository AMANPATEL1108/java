public class Removebracketsfromanalgebraicexpression {
    static String solve(String input) {

        StringBuilder answer = new StringBuilder("");
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '(' && input.charAt(i) != ')')
                answer.append(input.charAt(i));
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String input1 = "a+((b-c)+d)";
        String input2 = "(((a-b))+c)";

        System.out.println("Oringinal String:" + input1);
        System.out.println("After removing bracket:" + solve(input1));
        System.out.println("Oringinal String:" + input2);
        System.out.println("Afterr removing bracket:" + solve(input2));
    }
}
