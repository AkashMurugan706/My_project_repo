import java.io.*;
class findlargest
{
public static void main(String args[])throws IOException
{
int a[]= new int[3];
int temp=0;
System.out.println("Enter 3 values ");
DataInputStream d= new DataInputStream(System.in);
for(int i=0;i<a.length;i++)
{
a[i]=Integer.parseInt(d.readLine());
}
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]<a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.print("The Largest number is  "+a[0]+" ");
}
}
