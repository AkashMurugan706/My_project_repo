import java.io.*;
class odd
{
public static void main(String args[])throws IOException
{
int i;
for(i=1;i<=20;i++)
{
if(i%2==0)
System.out.println("even"+i);
}
for(i=1;i<=20;i++)
{
if(i%2!=0)
System.out.println("odd"+i);
}
}
}