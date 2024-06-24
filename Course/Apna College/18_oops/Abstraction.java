public class Abstraction {
    public static void main(String[] args) {

        Mustang myHHorse = new Mustang();
        // Horse h = new Horse();
        // h.eat();
        // h.walk();

        // // Chicken c = new Chicken();
        // // c.eat();
        // // c.walk();
        // System.out.println(h.color);

    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal Constructor Called");
        // color = "Brown";
    }

    void eat() {
        System.out.println("animal eat");
    }

    abstract void walk();

}

class Horse extends Animal {

    Horse() {
        System.out.println("Horse Constructor called");
    }

    void ChangeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("walk on 4 lages");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustange Constructor Called");
    }
}

class Chicken extends Animal {
    void ChangeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("Walk on 2 leg");
    }
}