import java.awt.*;
import java.applet.*;
/*
<applet code="round" width=500 height=100>
</applet>
*/
public class round extends Applet
{
public void paint(Graphics g)
{
g.drawOval(10,10,100,100);
g.drawOval(10,200,500,200);
}
}