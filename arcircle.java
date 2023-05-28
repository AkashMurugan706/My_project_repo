import java.io.*;
class area
{
int r;
double pi;
void change(area a)
{
a.pi=pi;
a.r=r;
}
void show()
{
System.out.println(+pi*(r*r));
}
}
class arcircle
{
public static void main(String args[])
{
area ar1=new area();
ar1.pi=3.14;
ar1.r=2;
System.out.println("before call="+ar1.pi+" "+","+" "+ar1.r);
ar1.change(ar1);
System.out.println("After call");
ar1.show();
}
}
