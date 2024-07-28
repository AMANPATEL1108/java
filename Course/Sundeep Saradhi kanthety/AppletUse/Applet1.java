package AppletUse;

import java.applet.*;
import java.awt.*;

/* <applet code=Applet1 width=400 height=600>
 * </applet>
 */

public class Applet1 extends Applet {
    public void init() {
        setBackground(Color.BLACK);
        setForeground(Color.yellow);
    }

    public void paint(Graphics g) {
        g.drawString("Welcome to Applet", 40, 40);
    }
}
