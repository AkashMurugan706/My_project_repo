import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code= "cals" height=800 width=800>
</applet>
*/
public class cals extends Applet implements ActionListener
{
String msg =" ";
Button v1,v2,v3,v4,v5,v6,v7,v8,v9,v0,a,s,m,d,mod,p,eq;
public void init()
{
setLayout(null);
v1=new Button("1");
v2=new Button("2");
v3=new Button("3");
v4=new Button("4");
v5=new Button("5");
v6=new Button("6");
v7=new Button("7");
v8=new Button("8");
v9=new Button("9");
v0=new Button("0");

a=new Button("+");
s=new Button("-");
m=new Button("*");
d=new Button("/");
mod=new Button("%");
p=new Button(".");
eq=new Button("=");
 
v1.setBounds(100,100,80,40);
v2.setBounds(200,100,80,40);
v3.setBounds(300,100,80,40);
v4.setBounds(100,200,80,40);
v5.setBounds(200,200,80,40);
v6.setBounds(300,200,80,40);
v7.setBounds(100,300,80,40);
v8.setBounds(200,300,80,40);
v9.setBounds(300,300,80,40);
v0.setBounds(200,400,80,40);

a.setBounds(100,400,80,40);
s.setBounds(200,400,80,40);
m.setBounds(300,400,80,40);
d.setBounds(400,400,80,40);
mod.setBounds(100,400,80,40);
p.setBounds(300,400,80,40);
eq.setBounds(100,500,80,40);

add(v1);
add(v2);
add(v3);
add(v4);
add(v5);
add(v6);
add(v7);
add(v8);
add(v9);
add(v0);

add(a);
add(s);
add(m);
add(d);
add(mod);
add(eq);
add(p);
  
v1.addActionListener(this);
v2.addActionListener(this);
v3.addActionListener(this);
v4.addActionListener(this);
v5.addActionListener(this);
v6.addActionListener(this);
v7.addActionListener(this);
v8.addActionListener(this);
v9.addActionListener(this);
v0.addActionListener(this);

a.addActionListener(this);
s.addActionListener(this);
m.addActionListener(this);
d.addActionListener(this);
mod.addActionListener(this);
eq.addActionListener(this);
p.addActionListener(this);
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
else if(s.equals("+"))
{
msg="You pressed ="+"+";
}
else if(s.equals("-"))
{
msg="You pressed ="+"_";
}
else if(s.equals("*"))
{
msg="You pressed = "+"*";
}
else if(s.equals("/"))
{
msg="You pressed =" +"/";
}
else if(s.equals("."))
{
msg="You pressed = "+".";
}
else if(s.equals("mod"))
{
msg="You pressed = "+"%";
}
else if(s.equals("="))
{
msg="You pressed=" +"=";
}
else
{
msg="none";
}
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg,300,700);
}
}

