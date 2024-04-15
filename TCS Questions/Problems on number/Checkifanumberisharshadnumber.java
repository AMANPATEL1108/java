public class Checkifanumberisharshadnumber {
    public static void main(String[] args) {
        int n = 378;
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (n % sum == 0) {
            System.out.println("Yes it is Harshad Number ");

        } else {
            System.out.println("No it is Not Harshad Number");
        }
    }
}
