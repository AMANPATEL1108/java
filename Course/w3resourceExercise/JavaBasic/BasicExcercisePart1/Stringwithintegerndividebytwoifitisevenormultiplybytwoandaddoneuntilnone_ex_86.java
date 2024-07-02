public class Stringwithintegerndividebytwoifitisevenormultiplybytwoandaddoneuntilnone_ex_86 {
    public static void main(String[] args) {
        int n=9;

        while (n!=1) {
            if (n%2==0) {
                n=n/2;
            }else{
                n=(3*n+1)/2;
            }
        }

        System.out.println("value of n="+n);

    }
}
