public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("AMAN");
        Student s3 = new Student(123);
        Student s4 = new Student("aman", 567);
    }
}

class Student {
    String name;
    int roll;

    Student() {
        System.out.println("Default Constructor is Called");
    }

    Student(String name) {
        this.name = name;
        System.out.println("Constructor with name parameter is Called");
    }

    Student(int roll) {
        this.roll = roll;
        System.out.println("Constructor with roll parameter is Called");
    }

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
        System.out.println("Constructor with name and roll parameters is Called");
    }
}
