import java.io.*;
class palindrome dynamic
{
public static void main(String args[])throws IOException
{
int n,rem,rev=0;
System.out.println("Enter n");
DataInputStream d= new DataInputStream(System.in);
n=Integer.parseInt(d.readLine());
int temp=n;
while(n>0)
{
rem=n%10;
rev=(rev*10)+rem;
n=n/10;
}
if(rev==temp)
{
System.out.println("Number is palindrome");
}
else
{
System.out.println("Number is not a palindrome");
}
}
}
