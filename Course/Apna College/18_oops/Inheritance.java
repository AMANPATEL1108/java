public class Inheritance {
    public static void main(String[] args) {

        // Fish shark = new Fish();
        // shark.eat();

        // Dog dobb = new Dog();
        // dobb.eat();
        // dobb.legs = 4;
        // System.out.println(dobb.legs);

    }
}

// base class
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breath() {
        System.out.println("Breathes");
    }

}

// derive class,sub class

class Fish extends Animal {

    void swim() {
        System.out.println("Swim in water");
    }
}

class Mammals extends Animal {
    // int legs;
    void walk() {
        System.out.println("Walk");
    }
}

class Dog extends Mammals {
    // String breath;
}

class Bird extends Animal {
    void fly() {
        System.out.println("Flying");
    }
}