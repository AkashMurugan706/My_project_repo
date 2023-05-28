import java.io.*;
class rack
{
public static void main(String args[])throws IOException
{
int a;
System.out.println("Enter a");
DataInputStream d= new DataInputStream(System.in);
a=Integer.parseInt(d.readLine());
if(a%2==0)
{
System.out.println("The product stored in even rack  "+a);
}
else if(a%2!=0)
{
System.out.println("The product stored in odd rack  "+a);
}
else
{
System.out.println("The product stored in waste box");
}
}
}