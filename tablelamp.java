import java.awt.*;
import java.applet.*;
/*
<applet code="tablelamp"width=500 height=500>
</applet>
*/
public class tablelamp extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.gray);
g.fillRect(100,600,700,60);
g.fillRect(110,607,65,300);
g.fillRect(711,607,65,300);
g.drawRect(425,350,30,250);
g.drawArc(400,440,250,50,-65,283);
}
} 