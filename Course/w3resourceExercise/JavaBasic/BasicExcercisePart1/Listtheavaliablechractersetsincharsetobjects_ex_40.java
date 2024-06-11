import java.nio.charset.Charset;

public class Listtheavaliablechractersetsincharsetobjects_ex_40 {
    public static void main(String[] args) {
        System.out.println("List of the avaliable character sets:");
w3wwqwe,rhw
        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }
    }
}
