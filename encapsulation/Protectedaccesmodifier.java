package encapsulation;

public class Parent {

    protected int protectedFied;

    protected void protectedMethod() {
        System.out.println("this is protected method");
    }
}

public class Protectedaccesmodifier extends Parent {
    public void accessProtectedMembers() {
        protectedFied = 20;
        protectedMethod();
    }

}

class AnotherClass {
    public static void main(String[] args) {
        Protectedaccesmodifier child = new Protectedaccesmodifier();

        child.accessProtectedMembers();
    }
}
