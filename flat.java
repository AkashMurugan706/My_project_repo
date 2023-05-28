import java.io.*;
class flat
{
public static void main(String args[])throws IOException
{
int number;
System.out.println("Enter number");
DataInputStream d= new DataInputStream(System.in);
number=Integer.parseInt(d.readLine());
try
{
   if (number>10)
   throw new Exception("Maximum limit is 10");
}
catch (Exception e)
{
System.out.println("Exception has occured"+e.toString());
}
}
}