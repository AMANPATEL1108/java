import java.io.FileWriter;
import java.io.IOException;

public class webpagegenerator {
    public static void main(String[] args) {
        String pageTitle = "My Simple Web Page";
        String pageContent = "<html>\n<head>\n<title>" + pageTitle
                + "</title>\n</head>\n<body>\n<h1>Welcome to my web page</h1>\n<p>This is a simple web page generated using Java.</p>\n</body>\n</html>";

        try {
            FileWriter fileWriter = new FileWriter("my_web_page.html");
            fileWriter.write(pageContent);
            fileWriter.close();
            System.out.println("Web page generated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
