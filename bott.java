import java.io.*;
class bott
{
public static void main(String args[])throws IOException
{
int a[]=new int [5];
int i;
System.out.println("Enter i");
DataInputStream d= new DataInputStream(System.in);
for(i=0;i<5;i++)
{
a[i]=Integer.parseInt(d.readLine());
}
for(i=0;i<a.length;i++)
{
for(int j=i+1;
System.out.println(a[i]);
}
}
}