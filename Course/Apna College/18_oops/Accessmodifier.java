public class Accessmodifier {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();

        myAcc.username = "AMAN";
        myAcc.setPassword("Patel");
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}
