import java.awt.*;
import java.applet.*;
/*
<applet code="blayout" width=700 height=400>
</applet>
*/
public class blayout extends Applet
{
static final int n=4;
public void init()
{
setLayout(new BorderLayout());
for(int i=0;i<n;i++)
{
 for(int j=0;j<n;j++)
 {
 int k=i*n+j;
 if(k>0)
{
 add(new Button(" "+k));
 }
 }
}
}
}