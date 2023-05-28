import java.io.*;
class babu
{
public static void main(String args[])throws IOException
{
int a[]= new int[7];
int i,j,n,temp=0;
System.out.println("Enter 7 number");
DataInputStream d= new DataInputStream(System.in);
for(i=0;i<a.length;i++)
{
a[i]=Integer.parseInt(d.readLine());
}
System.out.println("after sort ");
for(i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
System.out.println(" ");
System.out.println("Enter number to find");
n=Integer.parseInt(d.readLine());
int low=0;
int high=a.length-1;
while(low<=high)
{
int midp=low+high/2;
 if(n==a[midp])
{
System.out.println("The number"+" " +n+" "+"in index of"+" = "+midp);
break;
}
else if(n<a[midp])
{
high=midp-1;
}
else
{
low=midp+1;
}
midp=low+high/2;
}
if(low>high)
{
System.out.println("not found");
}
}
}










