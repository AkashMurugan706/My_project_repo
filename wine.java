import java.awt.*;
import java.applet.*;
/*
<applet code = "wine" width=500 height=300>
</applet>
*/
public class wine extends Applet
{
public void paint(Graphics g)
{
int xpoints[] = {30,200,30,200,30};
int ypoints[] = {30,30,200,200,30};
g.drawPolygon(xpoints,ypoints,5);
}
}
