public class Convertsecondtominiteandhour_ex_55 {
    public static void main(String[] args) {

        int second = 86399;

        int S = second % 60;
        int H = second / 60;
        int M = H % 60;
        H = H / 60;

        System.err.println(H + ":" + M + ":" + S);
    }
}
