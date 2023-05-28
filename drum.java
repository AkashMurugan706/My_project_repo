import java.awt.*;
import java.applet.*;
/*
<applet code = "drum" width=500 height=200>
</applet>
*/
public class drum extends Applet
{
public void paint(Graphics g)
{
int xpoints[] = {100,140,180,220,180,140,100};
int ypoints[] = {100,60,60,100,140,140,100};
g.drawPolygon(xpoints,ypoints,7);
}
}
