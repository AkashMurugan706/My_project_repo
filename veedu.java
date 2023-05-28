import java.awt.*;
import java.applet.*;
/*
<applet code="veedu" width=500 height=300>
</applet>
*/
public class veedu extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.red);
g.fillRect(100,100,300,200);
g.setColor(Color.magenta);
g.drawLine(100,100,250,20);
g.drawLine(250,20,400,100);
}
}