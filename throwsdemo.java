import java.io.*;
class flat
{
public static void main(String args[])throws IOException
{
int number;
System.out.printn("Enter number");
DataInputStream d= new DataInputStream(system.in);
number=Integer.parseInt(d.readLine());
try
{
if (number>10)
throws new Exception("Maximum limit is 10 ");
}
catch (Exception e)
{
System.out.println(+e.toString());
}
}
}