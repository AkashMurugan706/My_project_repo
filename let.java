import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.applet.*;
/*
<applet code= "let" width=500 height=300>
</applet>
*/
public class let extends Applet
{
public void paint(Graphics g)
{
Font p=new Font("Algerian",Font.BOLD,74);
Font a=new Font("Calibri",Font.PLAIN,34);
Font m=new Font("Chiller",Font.BOLD+Font.ITALIC,74);
g.setColor(Color.green);
g.setFont(p); 
g.drawString("Vaishu Is so Cute",300,300);
g.setColor(Color.red);
g.setFont(a);
g.drawString("Akash ",500,500);
g.setColor(Color.gray);
g.setFont(m);
g.drawString("Madhu LOVES Shiva",700,700);
}
}