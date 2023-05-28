import java.io.*;
class ls
{
public static void main(String args[])throws IOException
{
int a[]=new int[10];
int num,i;
System.out.println("Enter 10 numbers : ");
DataInputStream d= new DataInputStream(System.in);
for(i=0;i<a.length;i++)
{
a[i]=Integer.parseInt(d.readLine());
}
System.out.println("Enter the number to find : ");
num=Integer.parseInt(d.readLine());
for(i=0;i<a.length;i++)
{
if(a[i]==num)
{
System.out.println("found");
}
else  
{
System.out.println("Not found");
}
}
}
}