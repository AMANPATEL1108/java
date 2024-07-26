class variable {
    int a = 10; // Instance variable
    static int c = 20;// Static Variable

    public static void main(String[] args) {

        int b = 40;// local variable
        variable v = new variable();

        System.out.println("Instance Variable:" + v.a);// statically print

        variable obj = new variable();
        System.out.println("Local Variable:" + b);// after creating object instance variable are run otherwise
                                                  // they are not
        // acecess that
        System.out.println("Static Variable:" + variable.c);// directly run a local variable
    }
}