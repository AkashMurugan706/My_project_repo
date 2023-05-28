import java.awt.Graphics;
import java.awt.Image;
import java.applet.*;
/*
<applet code = "ums" width=500 height=300>
</applet>
*/
public class ums extends Applet
{
Image umsimg;
public void init()
{
umsimg=getImage(getDocumentBase(),"186A3047.JPG");
}
public void paint(Graphics g)
{
g.drawImage(umsimg,20,20,this);
}
}