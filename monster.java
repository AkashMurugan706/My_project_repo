import java.io.*;
class comp
{
int a,i,m1,m2,m3,b1,b2,b3,total;
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
System.out.println("Enter i");
i=Integer.parseInt(d.readLine());
if(i>m3)
{
total=i+b3;
System.out.println(+total);
i=i+b3;
}
else if(i>m1)
{
total=i+b1;
System.out.println(+total);
i=i+b1;
}
else if(i>m2)
{
total=i+b2;
System.out.println(+total);
i=i+b2;
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
System.out.println(+i);
}
}
class monster
{
public static void main(String args[])throws IOException
{
comp c= new comp();
c.get();
c.disp();
}
}
