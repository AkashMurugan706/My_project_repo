import java.io.*;
class test
{
int a,b;
void change(test o)
{
o.a+=2;
o.b-=2;
}
void show()
{
System.out.println("A="+a+",B="+b);
}
}
class cbr
{
public static void main(String args[])
{
test t=new test();
test t1= new test();
t1.a=10;
t1.b=20;
System.out.println("Before call");
t1.show();
t.change(t1);
System.out.println("After call");
t1.show();}
}
