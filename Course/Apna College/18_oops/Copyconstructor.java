public class Copyconstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "AMAN";
        s1.roll = 123;
        s1.password = "abc";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 87;

        Student s2 = new Student(s1);
        s2.password = "XYZ";

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {

    String name;
    int roll;
    String password;
    int marks[];
    // sallow copy constructor
    // Student(Student s1) {
    // marks = new int[3];
    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.marks = s1.marks;
    // }

    // deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;

        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }

    }

    Student() {
        marks = new int[3];

        System.out.println("Default Constructor is Called");
    }

    Student(String name) {
        marks = new int[3];

        this.name = name;
        System.out.println("Constructor with name parameter is Called");
    }

    Student(int roll) {
        marks = new int[3];

        this.roll = roll;
        System.out.println("Constructor with roll parameter is Called");
    }

    Student(String name, int roll) {
        marks = new int[3];

        this.name = name;
        this.roll = roll;
        System.out.println("Constructor with name and roll parameters is Called");
    }
}
