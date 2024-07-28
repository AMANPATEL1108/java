import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code="Checkboxgroup" width=600 height=500> </applet> */

public class Checkboxgroup extends Applet implements ItemListener {
    String msg = "";
    Checkbox c1, c2, c3, c4, c5;
    CheckboxGroup cbg;

    public void init() {
        cbg = new CheckboxGroup();
        c1 = new Checkbox("CSE", cbg, true);
        c2 = new Checkbox("ECE", cbg, false);
        c3 = new Checkbox("EEE", cbg, false);
        c4 = new Checkbox("CIVIL", cbg, false);
        c5 = new Checkbox("MECH", cbg, false);

        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
        c5.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }

    public void paint(Graphics g) {
        msg = "Current selection: ";
        msg += cbg.getSelectedCheckbox().getLabel();
        g.drawString(msg, 50, 100);
    }
}
