import java.io.*;
class area
{
int r;
double pi;
void change(area a)
{
a.r=r;
a.pi=pi;
}
void show()
{
System.out.println(+pi*(r*r));
}
}
class cir
{
public static void main(String args[])
{
area ar1=new area();
ar1.r=4;
ar1.pi=3.14;
System.out.println("Before Calling");
ar1.show();
ar1.change(ar1);
System.out.println("After Calling");
ar1.show();
}
}

