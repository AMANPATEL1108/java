import java.util.HashMap;
import java.util.Set;

public class Interation {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("us", 20);
        hm.put("indonesia", 6);
        hm.put("Nepal", 5);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {

            System.out.println("Keys=" + k + "," + "value=" + hm.get(k));
        }

    }
}
