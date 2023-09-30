package inheritance;

//define subclass

class Animal {
    private String name;
    private int age;

    publlic Animal(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void speak() {
        System.out.println("an animal make sound");
    }

    public void eat() {
        System.out.println("animal is eating");
    }

    // create a subclasss

    class Dog extends Animal {
        private String breed;

    }

    public Dog(String name,int age,String breed){
        super(name,age); // call superclasss constructor
        this.breed=breed;
    }

    public void wagTail() {
        System.out.println("dog is wagging tail");// add aditional method specific dog

    }

    @Override
    public void speak() {
        System.out.println("the dog barks");
    }
}

public class createasubclass {
    public static void main(String[] args) {

        Animal genericAnimal = new Animal("Generic animal", 5);// craeate animal object
        genericAnimal.speak();
        genericAnimal.eat();

        // create a dog object

        Dog mydog = new Dog("buddy", 3, "golden retrive");
        mydog.speak();
        mydog.eat();
        mydog.wagTail();

    }
}
