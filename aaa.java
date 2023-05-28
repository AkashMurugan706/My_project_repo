import java.awt.*;
import java.applet.*;
/*
<applet code="aaa" width=500 height=300>
</applet>
*/
public class aaa extends Applet
{
public void paint(Graphics g)
{
g.drawRect(100,100,500,300);
g.fillRect(100,301,500,301);
g.drawRoundRect(680,100,720,300,50,50);
g.setColor(Color.magenta);
g.fillRoundRect(680,100,720,300,50,50);
}
}