import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code="Checkboxdemo" width=600 height=500> </applet> */

public class Checkboxdemo extends Applet implements ItemListener {
    String msg = "";
    Checkbox c1, c2, c3;

    public void init() {
        c1 = new Checkbox("Cricket");
        c2 = new Checkbox("Tennis");
        c3 = new Checkbox("Football");

        add(c1);
        add(c2);
        add(c3);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("CHECKBOX DEMO", 50, 50);
        msg = "Current State: ";
        g.drawString(msg, 50, 100);
        msg = "Cricket: " + c1.getState();
        g.drawString(msg, 50, 120);
        msg = "Tennis: " + c2.getState();
        g.drawString(msg, 50, 140);
        msg = "Football: " + c3.getState();
        g.drawString(msg, 50, 160);
    }
}
