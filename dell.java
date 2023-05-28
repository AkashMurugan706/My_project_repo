import java.io.*;
class dell
{
public static void main(String args[]) throws IOException
{
int x;
System.out.println("Enter x");
DataInputStream d= new DataInputStream(System.in);
x=Integer.parseInt(d.readLine());
if(x%2==0)
{
System.out.println("Even number");
}
else
{
System.out.println("Odd number");
}
}
}