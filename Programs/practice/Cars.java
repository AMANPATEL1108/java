package practice;

public class Cars {
    public static void main(String[] args) {
        String[] cars = { "BMW", "MER", "MUS" };
        System.out.println("cars is this :" + cars[1]);
        cars[1] = "FEr";
        System.out.println("addding 1:" + cars[1]);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);

            for (String j : cars) {
                System.out.println("cars new one:" + (j));
            }
        }
    }
}
