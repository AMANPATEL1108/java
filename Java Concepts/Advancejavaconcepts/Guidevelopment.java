import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Guidevelopment {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Gui Develoment example");

        // Create a JButton (button)
        JButton button1 = new JButton("Click Me!");

        // Add an ActionListener to the button
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Show a message dialog when the button is clicked
                JOptionPane.showMessageDialog(frame, "Welcome to GUI");
            }
        });

        // Add the button to the content pane of the JFrame
        frame.getContentPane().add(button1);

        // Set window properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setLocation(600, 200);
    }
}
