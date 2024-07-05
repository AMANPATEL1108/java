public class Measurehoelongsomecodetakestoexecuteinnanosecond_ex_91 {
    public static void main(String arges[]) {
        long starttime = System.nanoTime();

        int i;

        System.out.println("The firsst 10 naturan number are:");
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        long estimatedtime = System.nanoTime() - starttime;

        System.out.println("Estimated time is =" + estimatedtime);
    }
}
