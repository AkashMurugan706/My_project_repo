import java.awt.*;
import java.applet.*;
/*
<applet code="home" width=500 height=300>
</applet>
*/
public class home extends Applet
{
public void paint(Graphics g)
{
g.drawLine(100,100,100,500);
g.drawLine(100,100,700,100);
g.drawLine(700,100,700,500);
g.drawLine(100,500,700,500);
g.drawLine(100,100,450,10);
g.drawLine(450,10,700,100);
g.drawLine(350,500,350,350);
g.drawLine(500,500,500,350);
g.drawLine(350,350,500,350);
g.drawLine(430,500,430,350);
g.drawLine(430,430,460,430);
}
}