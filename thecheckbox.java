import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="thecheckbox"width=700 height=700>
</applet>
*/
public class thecheckbox extends Applet implements ItemListener
{
String msg=" ";
Checkbox male,female,trans;
public void init()
{
male=new Checkbox("Male");
female=new Checkbox("Female");
trans=new Checkbox("Trans");
add(male);
add(female);
add(trans);
male.addItemListener(this);
female.addItemListener(this);
trans.addItemListener(this);
}
public void itemStateChanged(ItemEvent ie)
{
repaint();
}
public void paint(Graphics g)
{
msg="Current State:";
g.drawString(msg,100,100);
msg="Male:"+male.getState();
g.drawString(msg,100,150);
msg="Female:"+female.getState();
g.drawString(msg,100,200);
msg="Trans:"+trans.getState();
g.drawString(msg,100,250);
}
}