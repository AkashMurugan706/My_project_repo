import java.io.*;
class lcm
{
public static void main(String args[])throws IOException
{
int i,j;
System.out.println("Enter j");
DataInputStream d= new DataInputStream(System.in);
j=Integer.parseInt(d.readLine());
for(i=1;i<=j;i++)
{
if(j%i==0)
{
System.out.println("LCM of "+j+" "+"is= "+i);
}
}
}
}