import java.awt.*;
import java.applet.*;
/*
<applet code="teddy" width=500 height=800>
</applet>
*/
public class teddy extends Applet
{
public void paint(Graphics g)
{
g.drawOval(100,100,200,200);
g.drawOval(100,300,220,220);
g.drawOval(61,305,60,60);
g.drawOval(300,305,60,60);
g.drawOval(61,457,60,60);
g.drawOval(297,457,60,60);
g.drawOval(100,72,40,60);
g.drawOval(260,72,40,60);
g.drawOval(140,155,25,25);
g.drawOval(236,155,25,25);
g.fillArc(163,185,70,75,180,180);
}
}