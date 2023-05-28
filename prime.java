import java.io.*;
class prime
{
public static void main(String args[])throws IOException
{
int i,j;
System.out.println("Enter j");
DataInputStream d= new DataInputStream(System.in);
j=Integer.parseInt(d.readLine());
i=2;
if(i<=j/2)
{
if(j%i==0)
{
System.out.println("j is not a prime number");
}
else
{
System.out.println("None");
}
System.out.println("dom");
}
else
{
System.out.println("j is a prime number");
}
}
}