import java.awt.*;
import java.applet.*;
/*
<applet code = "relaince" width=500 height=300>
</applet>
*/
public class relaince extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.black);
g.drawRoundRect(100,100,400,200,50,50);
g.setColor(Color.green);
g.fillRoundRect(100,100,400,200,50,50);
}
}