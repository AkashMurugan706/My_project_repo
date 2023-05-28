import java.io.*;
class pin
{
int i,sum=0;
int a[]=new int[5];
void get()throws IOException
{
System.out.println("Enter 5 values");
DataInputStream d= new DataInputStream(System.in);
for(i=0;i<a.length;i++)
{
a[i]=Integer.parseInt(d.readLine());
}
for(i=0;i<a.length;i++)
{
System.out.println("   ");
}
for(i=0;i<a.length;i++)
{
sum=sum+a[i];
}
}
void disp()
{
System.out.println(+sum);
}
}
class chair
{
public static void main(String args[])throws IOException
{
pin p= new pin();
p.get();
p.disp();
}
}
