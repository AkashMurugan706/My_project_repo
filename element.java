import java.io.*;
class element
{
public static void main(String args[])throws IOException
{
int n[]= new int[5];
int i;
System.out.println("Enter 5 values");
DataInputStream d= new DataInputStream(System.in);
for(i=0;i<5;i++)
{
n[i]=Integer.parseInt(d.readLine());
}
for(i=0;i<5;i++)
{
System.out.print(+n[i]+" ");
} 
System.out.println(" ");
System.out.println(n.length);
}
}