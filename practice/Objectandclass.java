public class Objectandclass {

    int x = 5;
    String fname = "John";
    String lname = "Doe";
    String mname = "error";
    int age = 24;

    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        Objectandclass myObj = new Objectandclass();
        System.out.println(myObj.x);
        System.out.println("Name: " + myObj.fname + " " + myObj.mname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);

        // Main method

        myStaticMethod(); // Call the static method

        Objectandclass myObjMet = new Objectandclass(); // Create an object of MyClass
        myObjMet.myPublicMethod(); // Call the public method

    }

}
