import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="calcu"width=700 height=700> 
</applet>
*/
public class calcu extends Applet implements ActionListener
{
String msg=" ";
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,p,e,a,s,m,d,mo;
public void init()
{
setLayout(null);
b1=new Button("1");
b2=new Button("2");
b3=new Button("3");
b4=new Button("4");
b5=new Button("5");
b6=new Button("6");
b7=new Button("7");
b8=new Button("8");
b9=new Button("9");
b0=new Button("0");

p=new Button(".");
e=new Button("=");
a=new Button("+");
s=new Button("-");
m=new Button("*");
d=new Button("/");
mo=new Button("%");

b1.setBounds(100,100,70,40);
b2.setBounds(100,200,70,40);
b3.setBounds(100,300,70,40);
b4.setBounds(100,400,70,40);
b5.setBounds(200,100,70,40);
b6.setBounds(200,200,70,40);
b7.setBounds(200,300,70,40);
b8.setBounds(200,400,70,40);
b9.setBounds(300,200,70,40);
b0.setBounds(300,300,70,40);

p.setBounds(300,400,70,40);
e.setBounds(300,100,70,40);
a.setBounds(400,200,70,40);
s.setBounds(400,300,70,40);
m.setBounds(400,400,70,40);
d.setBounds(400,100,70,40);
mo.setBounds(400,200,70,40);


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
public void actionPerformed(ActionEvent ae)
{
String s=ae.getActionCommand();
if(s.equals("1"))
{
msg="You pressed 1";
}
else if(s.equals("2"))
{
msg="You pressed 2";
}
else if(s.equals("3"))
{
msg="You pressed 3";
}
else if(s.equals("4"))
{
msg="You pressed 4";
}
else if(s.equals("5"))
{
msg="You pressed 5";
}
else if(s.equals("6"))
{
msg="You pressed 6";
}
else if(s.equals("1"))
{
msg="You pressed 1";
}
else if(s.equals("7"))
{
msg="You pressed 7";
}
else if(s.equals("8"))
{
msg="You pressed 8";
}
else if(s.equals("9"))
{
msg="You pressed 9";
}
else if(s.equals("0"))
{
msg="You pressed 0";
}
else if(s.equals("."))
{
msg="You pressed"+".";
}
else if(s.equals("="))
{
msg="You pressed "+"=";
}
else if(s.equals("+"))
{
msg="You pressed"+"+";
}
else if(s.equals("-"))
{
msg="You pressed"+"-";
}
else if(s.equals("*"))
{
msg="You pressed"+"*";
}
else if(s.equals("/"))
{
msg="You pressed"+"/";
}
else if(s.equals("%"))
{
msg="You pressed"+"%";
}
else
{
msg="none";
}
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg,100,500);
}
}

