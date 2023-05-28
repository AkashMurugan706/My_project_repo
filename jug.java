import java.io.*;
class tommy
{
int i1,i2,i3,i4,m1,m2,m3,b1,b2,b3,total,total1,total2;
void get()throws IOException
{
DataInputStream d= new DataInputStream(System.in);
System.out.println("Enter i1,i2,i3,i4,m1,m2,m3,b1,b2,b3");
i1=Integer.parseInt(d.readLine());
i2=Integer.parseInt(d.readLine());
i3=Integer.parseInt(d.readLine());
i4=Integer.parseInt(d.readLine());
m1=Integer.parseInt(d.readLine());
m2=Integer.parseInt(d.readLine());
m3=Integer.parseInt(d.readLine());
b1=Integer.parseInt(d.readLine());
b2=Integer.parseInt(d.readLine());
b3=Integer.parseInt(d.readLine());
if(i1==100)
{
for(i1=100;i1>m2;i1++)
{
}
System.out.println("Monster2 defeated");
total=i1+b2;
System.out.println(+total);
}
if(i2==300)
{                                                                                                                                                  
for(i2=300;i2>m1;i2++)
{
}
System.out.println("Monster1 defeated");
total1=i2+b1;
System.out.println(+total1);
}
if(i3==401)
{
for(i3=401;i3>m3;i3++)
{
}
System.out.println("Monster3 defeated ");
total2=i3+b3;
System.out.println(+total2);
}
else
{
System.out.println("you get failed");
}
}
void disp()
{
System.out.println(+total);
System.out.println(+total1);
System.out.println(+total2);
}
}
class jug
{
public static void main(String args[])throws IOException
{
tommy t= new tommy();
t.get();
t.disp();
}
}
