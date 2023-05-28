import java.io.*;
class comp
{
int a,i1,i2,i3,m1,m2,m3,b1,b2,b3,total1,total2,total3;
void get()throws IOException
{
System.out.println("Enter m1,m2,m3,b1,b2,b3");
DataInputStream d= new DataInputStream(System.in);
m1=Integer.parseInt(d.readLine());
m2=Integer.parseInt(d.readLine());
m3=Integer.parseInt(d.readLine());
b1=Integer.parseInt(d.readLine());
b2=Integer.parseInt(d.readLine());
b3=Integer.parseInt(d.readLine());
a=1;
do
{
System.out.println("Enter i1,i2,i3");
i1=Integer.parseInt(d.readLine());
i2=Integer.parseInt(d.readLine());
i3=Integer.parseInt(d.readLine());
if(i1>m1)
{
total1=i1+b1;
System.out.println(+total1);
}
if(i2>m2)
{
total2=i2+b2;
System.out.println(+total2);
}
if(i3>m3)
{
total3=i3+b3;
System.out.println(+total3);
}
else
{
System.out.println("none");
}
a++;
}while(a<=5);
}
void disp()
{
System.out.println(+total3);
}
}
class stick
{
public static void main(String args[])throws IOException
{
comp c= new comp();
c.get();
c.disp();
}
}
