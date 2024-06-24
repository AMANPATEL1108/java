public class Super_Keyword {
    public static void main(String[] args) {

        Horse h = new Horse();
        System.out.println(h.color);

    }
}

class Animal {

    String color;

    Animal() {
        System.out.println("Animal Constructor Called");
    }
}

class Horse extends Animal {
    Horse() {
        super.color = "brown";
        // super();
        System.out.println("horse constuctor Called");
    }
}