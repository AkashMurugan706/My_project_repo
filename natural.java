import java.io.*;
class natural
{
public static void main(String args[])throws IOException
{
int s,n,i=1;
System.out.println("Enter n");
DataInputStream d= new DataInputStream(System.in);
n=Integer.parseInt(d.readLine());
if(i<=n)
{
s=n*(n+1)/2;
System.out.println(+s);
}
}
} 