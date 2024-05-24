package polymorphism;

/**
 * Shape
 * 
 */
interface Shape {
    double area();

    double perimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Interface {

    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        System.out.println("Crcle area:" + circle.area());
        System.out.println("circle perimeter:" + circle.perimeter());
    }

}
