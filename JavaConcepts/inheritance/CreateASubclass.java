package inheritance;

// Define the Animal class
class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("An animal makes a sound");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }
}

// Create a subclass, Dog
class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // Call the superclass constructor
        this.breed = breed;
    }

    public void wagTail() {
        System.out.println("Dog is wagging its tail"); // Add an additional method specific to the dog
    }

    @Override
    public void speak() {
        System.out.println("The dog barks");
    }
}

public class CreateASubclass {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic animal", 5); // Create an animal object
        genericAnimal.speak();
        genericAnimal.eat();

        // Create a dog object
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");
        myDog.speak();
        myDog.eat();
        myDog.wagTail();
    }
}