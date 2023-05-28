import java.io.*;
class palindrome
{
public static void main(String args[])throws IOException
{
int n=121,rem,rev=0;
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
