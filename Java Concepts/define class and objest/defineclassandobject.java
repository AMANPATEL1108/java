
public class defineclassandobject {// define class

    String name;
    int age;

    public void introduce() {
        System.out.println("hi i am " + name + " i am " + age + " year old");
    }

    public static void main(String[] args) {
        defineclassandobject person1 = new defineclassandobject();// create a objct

        person1.name = "aman";
        person1.age = 20;

        person1.introduce();// call introduce method
    }
}
