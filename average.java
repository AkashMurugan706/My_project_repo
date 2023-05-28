import java.io.*;
class average
{
public static void main(String args[])throws IOException
{
int a[]= new int[2];
int average,total=0;
System.out.println("Enter 2 numbers");
DataInputStream d= new DataInputStream(System.in);
for(int i=0; i<a.length; i++)
{
a[i]=Integer.parseInt(d.readLine());
}
for(int i=0; i<a.length; i++)
{
total=total+a[i];
}
average=total/a.length;
System.out.println(+average);
}
}