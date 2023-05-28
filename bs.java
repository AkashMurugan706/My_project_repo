import java.io.*;
class bs
{
public static void main(String args[])throws IOException
{
int a[]= new int[10];
int temp=0,key,first,mid,last;
System.out.println("Enter a matrix : ");
DataInputStream d= new DataInputStream(System.in);
for(int i=0;i<a.length;i++)
{
a[i]=Integer.parseInt(d.readLine());
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
System.out.println("The values after sorting.... :  ");
for(int i=0;i<a.length;i++)
{
System.out.print("  "+a[i]+" ");
}
System.out.println("Enter key value to find index....");
key=Integer.parseInt(d.readLine());
first=0;
last=a.length-1;
mid = (first + last)/2; 
while(first<=last)
{
if(a[mid]==key)
{
System.out.println("The value found in the index of :  "+mid);
}
else if(key<a[mid])
{
last=mid-1;
}
else if(key>a[mid])
{
last=mid+1;
}
else
{
System.out.println("The value not found");
}
}
}
}