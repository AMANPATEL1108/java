/**
 * Findthenumberofbitsrequiredtofliptoconverttwogivenintegers_ex_147
 */
public class Findthenumberofbitsrequiredtofliptoconverttwogivenintegers_ex_147 {

    public static void main(String[] args) {
        System.out.println(bitSwapReqired(27, 23));
    }

    public static int bitSwapReqired(int x, int y) {

        int ctr = 0;
        for (int z = x ^ y; z != 0; z = z >>> 1) {
            ctr += z & 1;
        }
        return ctr;
    }
}