import java.io.*;
class primeorg
{
public static void main(String args[])throws IOException
{
int n;
boolean a=true;
System.out.println("Enter n");
DataInputStream d= new DataInputStream(System.in);
n=Integer.parseInt(d.readLine());
for(int i=2;i<n;i++)
{
if(n%i==0)
{
a=false;
System.out.println("not a prime");
}
}
if(a==true)
{
System.out.println("prime number");
}
}
}