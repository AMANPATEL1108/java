public class Takingfirstlastcharacterfromgivenstringeachstringlenis_ex_73 {

  public static void main(String[] args) {
    String str1 = "Python";
    String str2 = "Tutorial";

    int length2 = str2.length();

    String result = "";
    result += (str1.length() >= 1) ? str1.charAt(0) : '#';
    result += (length2 >= 1) ? str2.charAt(length2 - 1) : '#';

    System.out.println(result);
  }
}
