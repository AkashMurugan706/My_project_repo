import java.awt.*;
import java.applet.*;
/*
<applet code = "cute" width =500 height=300>
</applet>
*/
public class cute extends Applet
{
public void paint(Graphics g)
{
g.drawOval(205,250,200,200);
g.drawOval(160,448,300,300);
g.drawOval(202,228,50,50);
g.drawOval(360,233,50,50);
g.drawOval(250,300,25,25);
g.drawOval(340,300,25,25);
g.drawArc(265,325,80,80,180,180);
g.fillArc(265,325,80,80,180,180);
g.drawOval(195,718,50,50);
g.drawOval(385,720,50,50);
g.drawOval(100,550,60,50);
g.drawOval(454,550,60,50);
}
} 