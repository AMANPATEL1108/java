import java.util.TreeMap;

public class Treemaphash {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new Treemaphash();
        tm.put("India", 100); // which pass first print first
        tm.put("China", 150);
        tm.put("us", 20);
        tm.put("indonesia", 6);
        tm.put("Nepal", 5);

        System.out.println(tm);
    }
}
