import java.io.*;
class perfect
{
public static void main(String args[])throws IOException
{
int n, sum=0;
System.out.println("Enter a number"+" ");
DataInputStream d=new DataInputStream(System.in);
n=Integer.parseInt(d.readLine());
for(int i=1;i<n;i++)
{
if(n%i==0)
{
sum=sum+i;
}
}
if(sum==n)
{
System.out.println(" Perfect");
}
else
{
System.out.println(" Not a perfect");}
}
}
