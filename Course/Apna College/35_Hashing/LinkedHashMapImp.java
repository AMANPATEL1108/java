import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapImp {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100); // which pass first print first
        lhm.put("China", 150);
        lhm.put("us", 20);
        lhm.put("indonesia", 6);
        lhm.put("Nepal", 5);
        System.out.println(lhm);
    }
}
