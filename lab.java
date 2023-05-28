import java.applet.*;
import java.awt.*;
/*
<applet code= "lab" width=1000 height=700>
</applet>
*/
public class lab extends Applet
{
public void init()
{
String s="Hello Vaishu";
Label L1=new Label(s,Label.RIGHT);
add(L1);
Label L2=new Label(s,Label.LEFT);
add(L2);
Label L3=new Label(s,Label.CENTER);
add(L3);
}
}