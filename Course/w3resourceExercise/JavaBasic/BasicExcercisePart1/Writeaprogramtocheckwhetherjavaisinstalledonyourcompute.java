public class Writeaprogramtocheckwhetherjavaisinstalledonyourcompute {
    public static void main(String[] args) {
        System.out.println("Java Version:" + System.getProperty("java.version"));

        System.out.println("java Runtime Version:" + System.getProperty("java.runtime.version"));

        System.out.println("Java home:" + System.getProperty("java.home"));

        System.out.println("Java vendor:" + System.getProperty("java.vendor"));

        System.out.println("Java vendor url:" + System.getProperty("java.vendor.url"));

        System.out.println("Java class path:" + System.getProperty("java.class.path"));
    }
}
