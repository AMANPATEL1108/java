import java.lang.reflect.Array;

//------------------------------------------------------------------

//Interfaces variable

interface Shape {
    double area();
}

class Circle implements Shape {
    double radius;

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class Referencedatatypes {

    public static void main(String[] args) {

        Circle myCircle = new Circle();

        myCircle.radius = 3.0;// Set the radius

        double circleArea = myCircle.area();// Calculate and print the area
        System.out.println("Area of the circle: " + circleArea);

        // ------------------------------------------------------------------

        // String variable

        String String1 = "amanstring";
        System.out.println("string1:" + String1);

        // ------------------------------------------------------------------

        // array variable

        int[] array1 = { 1, 2, 3 };
        System.out.println("array1:" + Array.getLength(array1));

        // ------------------------------------------------------------------

        // class and objext variable

        class person {
            String name;
            int age;
        }
        person person1 = new person();
        person1.name = "aman";
        person1.age = 20;

        person person2 = new person();
        person2.name = "het";
        person2.age = 19;

        System.out.println("person 1 name=" + person1.name);
        System.out.println("person 1 age=" + person1.age);

        System.out.println("person 2 name=" + person2.name);
        System.out.println("person 2 age=" + person2.age);

        // ------------------------------------------------------------------

    }

}
