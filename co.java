import java.awt.*;
import java.applet.*;
/*
<applet code = "co" width=500 height=200>
</applet>
*/
public class co extends Applet
{
public void paint(Graphics g)
{
int xpoints[] = {100,140,180,160,120};
int ypoints[] = {100,60,100,140,140};
g.drawPolygon(xpoints,ypoints,5);
}
}
