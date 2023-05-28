import java.io.*;
class bubble
{
public static void main(String args[])throws IOException
{
int a[]= new int[10];
int temp=0;
System.out.println("Enter a matrix : ");
DataInputStream d= new DataInputStream(System.in);
for(int i=0;i<a.length;i++)
{
a[i]=Integer.parseInt(d.readLine());
}
System.out.println("Before sorting :  ");
for(int i=0;i<a.length;i++)
{
System.out.print(" "+a[i]+"  ");
}
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("  ");
System.out.println("After sorting :  ");
for(int i=0;i<a.length;i++)
{
System.out.print("  "+a[i]+" ");
}
}
}
