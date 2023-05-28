import java.awt.*;
import java.applet.*;
/*
<applet code= "Lines" width=300 height=200>
<Applet>
*/
public class Line extends Applet
{
public void paint(Graphics g)
 {
g.drawLine(300,700,250,500);
g.drawLine(0,0,500,0);
g.drawLine(500,0,500,100);
g.drawLine(500,100,0,0);
}
}