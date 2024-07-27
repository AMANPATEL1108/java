package ExceptionHandling;

class Ex {

    void display() {
        try {
            // int a = 5 / 0;// Arithmetic Exception
            // int a[] = new int[5];
            // a[6] = 5;
            // String str = "hello";
            // int num = Integer.parseInt(str);
            String str = null;
            System.out.println(str.length());

            // ArithmeticException-for Arithmetic
            // ArrayIndexOutOfBoundsException-for ArrauIndexoutofBond
            // NumberFormatException- fro str convert to int then use
            // NullPointerException -for null when we are print that value
        } catch (NullPointerException e) { //when we write a Exceptio Key word then automatically raise there which type of Exception
            System.out.println(e);
        }
        System.out.println("Exception handled.........");
    }
}

public class RunTimeException {

    public static void main(String[] args) {
        Ex obj = new Ex();
        obj.display();
    }
}