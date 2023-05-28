import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import java.applet.*;
/*
<applet code="letters" width=500 height=300>
</applet>
*/
public class letters extends Applet
{
public void paint(Graphics g)
{
Font fp=new Font("TimesRoman",Font.PLAIN,38);
Font fb=new Font("TimesRoman",Font.BOLD,38);
Font fi=new Font("TimesRoman",Font.ITALIC,38);
Font fbi=new Font("TimesRoman",Font.BOLD+Font.ITALIC,38);
g.setColor(Color.magenta);
g.setFont(fp);
g.drawString("Soruthaan Mukiyam",100,100);
g.setColor(Color.red);
g.setFont(fb);
g.drawString("Soruthaan Mukiyam",100,150);
g.setColor(Color.cyan);
g.setFont(fi);
g.drawString("Soruthaan Mukiyam",100,200);
g.setColor(Color.black);
g.setFont(fbi);
g.drawString("Soruthaan Mukiyam",100,250);
}
}