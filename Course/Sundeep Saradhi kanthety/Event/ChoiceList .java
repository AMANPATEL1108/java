import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code="ChoiceList" width=600 height=500> </applet> */

public class ChoiceList extends Applet implements ItemListener {
    Choice c;
    List l;
    String msg;

    public void init() {
        c = new Choice();
        l = new List();

        c.add("C Programming");
        c.add("Python Programming");
        c.add("Java Programming");

        l.add("C Programming");
        l.add("Python Programming");
        l.add("Java Programming");

        add(c);
        add(l);

        c.addItemListener(this);
        l.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }

    public void paint(Graphics g) {
        msg = "Selected choice: " + c.getSelectedItem();
        g.drawString(msg, 50, 100);
        msg = "Selected list item: " + l.getSelectedItem();
        g.drawString(msg, 50, 120);
    }
}
