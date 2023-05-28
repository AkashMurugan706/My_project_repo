import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="keyboard"width=500 height=300>
</applet>
*/
public class keyboard extends Applet implements KeyListener
{
String msg="";
int X=10,Y=10;
public void init()
{
addKeyListener(this);
requestFocus();
}
public void keyPressed(KeyEvent ke)
{
showStatus("KeyDown");
}
public void keyReleased(KeyEvent ke)
{
showStatus("KeyUp");
}
public void keyTyped(KeyEvent ke)
{
msg+=ke.getKeychar();
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg,X,Y);
}
}
