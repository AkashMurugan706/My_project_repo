import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="calc"width=700 height=700>
</applet>
*/
public class calc extends Applet implements ActionListener
{
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,p,e,a,s,m,d,mo;
public void init()
{
b1=new Button(1);
b2=new Button(2);
b3=new Button(3);
b4=new Button(4);
b5=new Button(5);
b6=new Button(6);
b7=new Button(7);
b8=new Button(8);
b9=new Button(9);
b0=new Button(0);
p=new Button(".");
e=new Button("=");
a=new Button("+");
s=new Button("-");
m=new Button("*");
d=new Button("/");
mo=new Button("%");
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(b0);
add(p);
add(e);
add(a);
add(s);
add(m);
add(d);
add(mo);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
p.addActionListener(this);
e.addActionListener(this);
a.addActionListener(this);
s.addActionListener(this);
m.addActionListener(this);
d.addActionListener(this);
mo.addActionListener(this);
}
public void paint(Graphics g)
{
g.drawint(100,100);
}
}

