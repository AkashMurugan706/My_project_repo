import java.io.*;
class Area
{
final static double pi=3.14;
double compute(double x,double y);
double compute(int i);
}
class Rect implements Area
{
public double compute(double x,double y)
{
return(x*y);
}
}
class Circle implements Area
{
public double compute(int i)
{
return(pi*i*i);
}
}
class interf
{
public static void main(String args[])throws IOException
{
Rect r= new Rect();
Circle c= new Circle();
Area a;
a=r;
System.out.println("Area of the Rectangle = "+a.compute(10,20));
a=c;
System.out.println("Area of the Circle = "+a.compute(10));
}
}