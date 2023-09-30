package inheritance;

// Define superclass
class Animal {
    private String name;
    private int age;

    // Corrected the constructor declaration to "public"
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

// Define subclass (separate class)
class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // Call superclass constructor
        this.breed = breed;
    }

    // Add additional method specific to Dog
    public void wagTail() {
        System.out.println("The dog is wagging its tail");
    }

    @Override
    public void speak() {
        System.out.println("The dog barks");
    }
}

public class createasubclass {
    public static void main(String[] args) {
        // Create an Animal object
        Animal genericAnimal = new Animal("Generic Animal", 5);
        genericAnimal.speak();
        genericAnimal.eat();

        // Create a Dog object
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");
        myDog.speak();
        myDog.eat();
        myDog.wagTail();
    }
}
