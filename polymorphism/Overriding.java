package polymorphism;

class Animal {
    void makeSound() {
        System.out.println("Animal sound on");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("woof woof!!!");
    }
}

public class Overriding {
    public static void main(String[] args) {

        Animal genericAnimal = new Animal();
        Animal mydog = new Dog();

        genericAnimal.makeSound();// Outputs: Animal sound on

        mydog.makeSound();// Outputs: Woof! Woof!

    }
}
