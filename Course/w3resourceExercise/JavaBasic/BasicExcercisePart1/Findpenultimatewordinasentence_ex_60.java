public class Findpenultimatewordinasentence_ex_60 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";

        String[] words = str.split("[ ]+");

        System.out.println("penulimate word:" + words[words.length - 2]);
    }
}
