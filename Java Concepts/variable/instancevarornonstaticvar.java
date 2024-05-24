public class instancevarornonstaticvar {

    int instanceVar;

    public static void main(String[] args) {
        instancevarornonstaticvar obj1 = new instancevarornonstaticvar();
        instancevarornonstaticvar obj2 = new instancevarornonstaticvar();

        obj1.instanceVar = 10;
        obj2.instanceVar = 20;

        System.out.println("obj1:" + obj1.instanceVar);
        System.out.println("obj2:" + obj2.instanceVar);

    }
}
