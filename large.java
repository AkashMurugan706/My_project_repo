import java.io.*;
class large
{
public static void main(String args[])throws IOException
{
int i,j;
System.out.println("Enter i,j");
DataInputStream d= new DataInputStream(System.in);
i=Integer.parseInt(d.readLine());
j=Integer.parseInt(d.readLine());
if(i>=j)
{
System.out.println("largest number is  "+i);
}
else if(j>=i)
{
System.out.println("largest number is  "+j);
}
else
{
System.out.println("draw");
}
}
}

