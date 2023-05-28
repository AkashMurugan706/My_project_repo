import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code= "textf" width=1000 height=700>
</applet>
*/
public class textf extends Applet implements ActionListener
{
TextField name,pwd,t;
public void init()
{
Label L1=new Label("Name",Label.RIGHT);
Label L2=new Label("Password",Label.LEFT);
name=new TextField(15);
pwd=new TextField(10);
pwd.setEchoChar('*');
add(L1);
add(name);
add(L2);
add(pwd);
name.addActionListener(this);
pwd.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
repaint();
}
public void paint(Graphics g)
{
g.drawString("Name:"+name.getText(),10,50);
g.drawString("Selected Text:"+name.getSelectedText(),10,80);
g.drawString("Password:"+pwd.getText(),10,100);
}
}


