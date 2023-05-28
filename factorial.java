import java.io.*;
class factorial
{
public static void main(String args[])throws IOException
{
int i,j;
System.out.println("Enter j");
DataInputStream d= new DataInputStream(System.in);
j=Integer.parseInt(d.readLine());
int y=1;
for(i=1;i<=j;i++)
{
y=y*i;
}
System.out.println("Factorial of"+" " +j+" "+"is="+y);
}
}