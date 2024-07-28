package AppletUse;

import java.applet.*;
import java.awt.*;

/* <applet code=Applet1 width=400 height=600>
 * </applet>
 */
public class Colordemo extends Applet {
    public void init() {
        setBackground(Color.BLACK);
        setForeground(Color.white);
    }

    public void paint(Graphics g) {
        Color c = new Color(255, 0, 0);
        Font f = new Font("arial", 0, 30);
        g.setColor(c);
        g.setFont(f);
        g.drawString("Welcome ro Aman", 30, 40);
    }
}
