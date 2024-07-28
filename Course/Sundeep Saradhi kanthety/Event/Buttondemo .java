import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code="Buttondemo" width=600 height=500> </applet> */

public class Buttondemo extends Applet implements ActionListener {
    String msg = "";

    public void init() {
        Button b1 = new Button("Red");
        Button b2 = new Button("Blue");
        Button b3 = new Button("Green");

        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("Red")) {
            setBackground(Color.red);
            msg = "Red button pressed";
        } else if (str.equals("Blue")) {
            setBackground(Color.blue);
            msg = "Blue button pressed";
        } else if (str.equals("Green")) {
            setBackground(Color.green);
            msg = "Green button pressed";
        }
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 100);
    }
}
