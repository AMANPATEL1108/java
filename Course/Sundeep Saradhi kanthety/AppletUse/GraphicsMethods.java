package AppletUse;

import java.awt.*;
import java.applet.*;

/* <applet code=Applet1 width=400 height=600>
 * </applet>
 */
public class GraphicsMethods extends Applet {
    public void init() {
        setBackground(Color.black);
        setForeground(Color.white);
    }

    public void paint(Graphics g) {
        int x = { 200, 250, 280, 290, 200 };
        int y = { 100, 200, 300, 400, 500 };
        g.drawString("Welcome", 40, 50);
        g.drawRect(40, 70, 100, 40);
        g.fillRect(40, 90, 100, 40);
        g.drawOval(40, 170, 30, 60);
        g.fillOval(90, 170, 30, 60);
        g.drawLine(40, 240, 140, 240);
        g.drawArc(40, 260, 60, 100, 60, 60);
        g.drawPolygon(x, y, 5);

    }
}
