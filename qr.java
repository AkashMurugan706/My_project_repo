import java.io.*;
class qr
{
public static void main(String args[])throws IOException
{
int a,b,c,c1;
System.out.println("Enter a,b");
DataInputStream d= new DataInputStream(System.in);
a=Integer.parseInt(d.readLine());
b=Integer.parseInt(d.readLine());									
c=a/b;
c1=a%b;
System.out.println("Qoutient="+c);
System.out.println("reminder="+c1);
}
}
