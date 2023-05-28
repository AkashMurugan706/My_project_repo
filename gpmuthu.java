import java.io.*;
class bs
{
public static void main(String args[])throws IOException
{
int a[]= new int[10];
int temp,mid,first,last,find;
System.out.println("Enter a matrix : ");
DataInputStream d= new DataInputStream(System.in);
for(int i=0;i<a.length;i++)
{
a[i]=Integer.parseInt(d.readLine());
first=Integer.parseInt(d.readLine());
last=Integer.parseInt(d.readLine());
find=Integer.parseInt(d.readLine());
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
mid=first+last/2;
for(int i=0;i<=10;i++)
{
if (find==mid)
{
System.out.println("Found");
}
else if (find<mid)
{
last=mid-1;
}
else if (find>mid)
{
first=mid+1;
}
else
{
System.out.println(" Not Found");
}
}
}
}