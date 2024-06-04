
import java.util.HashMap;

public class Javacollectionframework {
    public static void main(String[] args) {

        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("haa", 85);
        scores.put("xyz", 90);

        System.out.println("score for haa" + scores.get("haa:"));
    }
}
