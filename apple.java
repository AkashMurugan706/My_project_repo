import java.io.*;
class apple
{
public static void main(String args[])throws IOException
{
int s,p,b;
int []apple=new int[10];
System.out.println("Enter s,p");
DataInputStream d= new DataInputStream(System.in);
for(s=10;s>p;s--)
{
apple[s]=Integer.parseInt(d.readLine());
apple[p]=Integer.parseInt(d.readLine());
}
for(s=10;s>p;s--)
{
if(s>p)
{
b=s-p;
System.out.println(+b);
}
else
{
System.out.println("Insufficient");
}
{
System.out.println("error");
}
}
}
}