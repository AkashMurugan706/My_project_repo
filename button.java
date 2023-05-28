import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="button"width=500 height=500>
</applet>
*/
public class button extends Applet implements ActionListener
{
String msg="";
Button yes,no,maybe;
public void init()
{
yes=new Button("YES");
no=new Button("NO");
maybe=new Button("Undecided");
add(yes);
add(no);
add(maybe);
yes.addActionListener(this);
no.addActionListener(this);
maybe.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String s=ae.getActionCommand();
if(s.equals("YES"))
{
msg="You pressed yes";
}
else if(s.equals("NO"))
{
msg="You pressed no";
}
else
{
msg="You pressed undecided";
}
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg,100,100);
}
}










