package Constructer;

public class Student {
    String name;
    int rno;

    Student() {// Default Constructor
        name = "ABC";
        rno = 123;
    }

    Student(String str, int n) {// parameterized Constructor
        name = str;
        rno = n;
    }

    public static void main(String[] args) {
        Student s1 = new Student();// Default Constructor
        Student s2 = new Student("DEF", 456);// parameterized Constructor
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s2.name);
        System.out.println(s2.rno);
    }
}
