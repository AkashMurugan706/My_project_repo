import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="handle" width=500 height=300>
</applet>
*/
public class handle extends Applet implements MouseListener,MouseMotionListener
{
String msg="";
int mouseX=0,mouseY=0;
public void init()
{
addMouseListener(this);
addMouseMotionListener(this);
}
public void mouseClicked(MouseEvent me)
{
mouseX=0;
mouseY=10;
msg="mouseClicked";
repaint();
}	
public void mouseEntered(MouseEvent me)
{
mouseX=0;
mouseY=10;
msg="mouseEntered";
repaint();
}
public void mouseExited(MouseEvent me)
{
mouseX=0;
mouseY=10;
msg="mouseExited";
repaint();
}
public void mousePressed(MouseEvent me)
{
mouseX=me.getX();
mouseY=me.getY();
msg="up";
repaint();
}
public void mouseReleased(MouseEvent me)
{
mouseX=me.getX();
mouseY=me.getY();
msg="mouseReleased";
repaint();
}
public void mouseDragged(MouseEvent me)
{
mouseX=me.getX();
mouseY=me.getY();
msg="*";
showStatus("Dragging mouse at"+mouseX+";"+mouseY);
repaint();
}
public void mouseMoved(MouseEvent me)
{
showStatus("Moving mouse at"+me.getX()+";"+me.getY());
}
public void paint(Graphics g)
{
g.drawString(msg,mouseX,mouseY);
}
} 
