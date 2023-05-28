import java.io.*;
class swap
{
public static void main(String args[])throws IOException
{
int temp=0;
int i,j;
System.out.println("Enter i,j");
DataInputStream d= new DataInputStream(System.in);
i=Integer.parseInt(d.readLine());
j=Integer.parseInt(d.readLine());
System.out.println("Before swapping=  "+i+"  "+j);
temp=i;
i=j;
j=temp;
System.out.println("After swapping=  "+i+"  "+j);
}
}