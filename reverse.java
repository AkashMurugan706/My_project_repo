import java.io.*;
class reverse
{
public static void main(String args[])throws IOException
{
int a[]= new int[5];
int i;
System.out.println("Enter 5 numbers");
DataInputStream d= new DataInputStream(System.in);
System.out.println("Original form of array");
for(i=0;i<a.length;i++)
{
a[i]=Integer.parseInt(d.readLine());
}
System.out.println("Reverse for of array");
for(i=a.length-1;i>=0;i--)
{
System.out.print(+a[i]);
}
}
}