import java.awt.*;
import java.applet.*;
/*
<applet code = "drums" width=500 height=200>
</applet>
*/
public class drums extends Applet
{
public void paint(Graphics g)
{
int xpoints[] = {30,200,30,200};
int ypoints[] = {30,30,200,300};
g.drawPolygon(xpoints,ypoints,5);
}
}