import java.io.*;
class area
{
int r,c;
double pi;
void change(area a)
{
a.pi=pi;
a.r=r;
}
void show()
{
System.out.println("Area of circle="+pi+" "+","+" "+r);
System.out.println("After call");
System.out.println(+pi*+r*r);
}
}
class acircle
{
public static void main(String args[])
{
area ar1=new area();
ar1.pi=3.14;
ar1.r=2;
ar1.change(ar1);
ar1.show();
}
}
