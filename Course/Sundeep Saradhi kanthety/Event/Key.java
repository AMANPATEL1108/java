import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code="Key" width=600 height=500> </applet> */

public class Key extends Applet implements KeyListener {
    int X = 40, Y = 40;
    String msg = "KEY EVENTS";

    public void init() {
        setBackground(Color.black);
        setForeground(Color.yellow);
        addKeyListener(this);
    }

    public void keyPressed(KeyEvent ke) {
        msg = "KEY PRESSED";
        setBackground(Color.red);
        repaint();
    }

    public void keyReleased(KeyEvent ke) {
        msg = "KEY RELEASED";
        setBackground(Color.green);
        repaint();
    }

    public void keyTyped(KeyEvent ke) {
        msg = "KEY TYPED";
        setBackground(Color.blue);
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, X, Y);
    }
}
