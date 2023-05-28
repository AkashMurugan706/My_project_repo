import java.io.*;
class botu
{
public static void main(String args[])throws IOException
{
int n1=1,n2=2,n3,n;
System.out.println("Enter n");
DataInputStream d= new DataInputStream(System.in);
n=Integer.parseInt(d.readLine());
System.out.println(n1+" , ");
System.out.print(n2+" ,");
for(int i=2;i<=n;i++)
{
n3=n1+n2;
}
n1=n2;
n2=n3;
}
}

