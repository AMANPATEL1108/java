package Event;

import java.awt.*;
import java.awt.Event;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.applet.*;

/* <applet code=Mouse width=600 height=500>
 * </applet>
 */
public class EventMethods extends Applet implements MouseListener, MouseMotionListener {
    int x = 30, y = 30;
    String msg = "Mouse Event";

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
        setBackground(Color.black);
        setForeground(Color.white);
    }

    public void MouseEntered(MouseEvent me) {
        msg = "mouse Enterd";
        setBackground(Color.green);
        showStatus("Mouse Enterd");
        repaint();
    }

    public void mouseExited(MouseEvent me) {
        msg = "mouse exited";

        setBackground(Color.red);
        showStatus("Mouse exist");
        repaint();
    }

    public void mousePressed(MouseEvent me) {
        msg = "mouse Pressed";

        setBackground(Color.yellow);
        showStatus("Mouse Pressed");
        repaint();
    }

    public void mouseReleased(MouseEvent me) {
        msg = "mouse Released";

        setBackground(Color.pink);
        showStatus("Mouse Released");
        repaint();
    }

    public void mouseMoved(MouseEvent me) {
        msg = "mouse Moved";

        x = me.getX();
        y = me.getY();
        setBackground(Color.blue);
        showStatus("Mouse Moved");
        repaint();
    }

    public void mouseDragged(MouseEvent me) {
        msg = "mouse Draged";

        setBackground(Color.CYAN);
        showStatus("Mouse Dragged" + me.getX() + " " + me.getY());
        repaint();
    }

    public void mouseClicked(MouseEvent me) {
        msg = "mouse Clicked";

        setBackground(Color.green);
        showStatus("Mouse Clicked");
        repaint();
    }

    public voidpaint(Graphics g){
     g.drawString(msg, x, y);   
    }

}
