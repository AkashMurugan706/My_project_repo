import java.awt.*;
import java.applet.*;
/*
<applet code="glayout" width=700 height=400>
</applet>
*/
public class glayout extends Applet
{
static final int n=7;
public void init()
{
setLayout(new GridLayout(4,4));
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