package encapsulation;

public class Privateaccesmodifier {

    private int privateField;

    private void privateMethod() {
        System.out.println("this is private method");
    }

    public void accesPrivateMembers() {
        privateField = 12;
        privateMethod();
    }
}

class AnotherClass {
    public static void main(String[] args) {

        Privateaccesmodifier example = new Privateaccesmodifier();

        example.accesPrivateMembers();
    }
}