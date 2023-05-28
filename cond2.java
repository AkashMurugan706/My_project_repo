import java.io.*;
class demo{
public static void main(String args[])
{
int ch,s,a,b,c;
System.out.println("Enter ch,s,a,b,c");
DataInputStream d= new DataInputStream(System.in);
ch=Integer.parseInt(d.readLine());
s=Integer.parseInt(d.readLine());
a=Integer.parseInt(d.readLine());
b=Integer.parseInt(d.readLine());
c=Integer.parseInt(d.readLine());
if(ch==1)
{
System.out.println("s=a^2");
}
else if(ch==2)
{
System.out.println("s=b^3");
}
else if(ch==3)
{
System.out.println("s=b^2-4ac");
}
else
{
System.out.println("error");
}
}
}