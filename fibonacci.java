import java.io.*;
class fibonacci
{
public static void main(String args[])throws IOException
{
int n1=1,n2=2,n3,i,n=10;
System.out.print(+n1+"   ");
System.out.print(+n2+"   ");
for(i=2;i<n;i++)
{
n3=n1+n2;
System.out.print(+n3+"   ");
n1=n2;
n2=n3;
}
}
}
