import java.util.Scanner;

public class Computethedistancebetweentwopointsonthesurfaceofearth_ex_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input the latitude of coordinate 1:");
        double lat1 = sc.nextDouble();
        System.out.println("input the longitude of coordinate 1:");
        double lon1 = sc.nextDouble();

        System.out.print("input the latitude of coordinate 2:");
        double lat2 = sc.nextDouble();
        System.out.println("input the longitude of coordinate 2:");
        double lon2 = sc.nextDouble();

        System.out.println("the distance between two points is:" + distance_Between_lanLong(lat1, lon1, lat2, lon2));

    }

    public static double distance_Between_lanLong(double lat1, double lon1, double lat2, double lon2) {
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        double earthRadius = 6371.01;

        return earthRadius
                * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
    }
}
