package Static;

//Directly Access
// public class StaticDemo {
//     static int a = 10;

//     static void display() {
//         System.out.println("Static Method");
//     }

//     public static void main(String[] args) {
//         System.out.println(a);
//         display();
//     }
// }

//createing objrct access

class Demo {
    static int a = 10;

    static void display() {
        System.out.println("Static Method"); // statiic Method
    }

    // satic block
    static { // First Run
        System.out.println("Static   Block"); // static block directly run
    }
}

class StaticDemo {

    public static void main(String[] args) {
        System.out.println("this is main");
        System.out.println(Demo.a);
        Demo.display(); // if not use not demo class then not run that and not print a static

    }
}
