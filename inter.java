import java.io.*;
interface Area
{
final static double pi=3.14;
double compute(double x,double y);
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
public double compute(double x,double y)
{
return (pi*x*y);
}
}
class inter
{
public static void main(String args[])
{
Rect r= new Rect();
Circle c= new Circle();
Area a;
a=r;
System.out.println("Area of the Rectangle = "+a.compute(10,20));
a=c;
System.out.println("Area of the Circle = "+a.compute(10,20));
}
}