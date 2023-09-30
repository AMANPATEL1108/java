package encapsulation;

public class Publicaccesmodifier {

    public int publicField;

    public void publicmethod() {
        System.out.println("this is public method");
    }

}

class AnotherClass {
    public static void main(String[] args) {
        Publicaccesmodifier example = new Publicaccesmodifier();
        example.publicField = 45;
        example.publicmethod();
    }
}
