import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        cars.add("bMW");
        cars.add("marcedies");
        cars.add("lambergini");

        String firstcar = cars.get(0);

        System.out.println("Array of cars is :" + cars);

        cars.set(1, "bugati");

        int size = cars.size();

        for (String car : cars) {
            System.out.println(car + " ");
        }
    }

}
