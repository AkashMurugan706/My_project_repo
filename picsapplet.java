import java.awt.Graphics;
import java.awt.Image;
import java.applet.*;
/*
<applet code="picsapplet" width=500 height=300>
</applet>
*/
public class picsapplet extends Applet
{
Image akimg;
public void init()
{
akimg=getImage(getCodeBase(),"ak.jpg");
}
public void paint(Graphics g)
{
g.drawImage(akimg,10,10,this);
}
}