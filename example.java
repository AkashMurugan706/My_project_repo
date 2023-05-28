import java.awt.*;
import java.applet.*;
/*
<applet code="example" width=500 height=300>
</applet>
*/
public class example extends Applet
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
g.drawLine(700,100,1200,100);
g.drawLine(1200,100,1200,500);
g.drawLine(100,500,1200,500);
g.drawLine(1200,100,1200,10);
g.drawLine(450,10,1200,10);
g.drawLine(900,200,1000,200);
g.drawLine(900,300,1000,300);
g.drawLine(900,200,900,300);
g.drawLine(1000,200,1000,300);
}
}