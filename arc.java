import java.awt.*;
import java.applet.*;
/*
<applet code="arc" width=500 height=800>
</applet>
*/
public class arc extends Applet
{
public void paint(Graphics g)
{
g.drawArc(100,100,200,200,0,100);
g.drawArc(300,300,200,200,180,180);
}
}