import java.io.*;
class maa
{
public static void main(String args[])
{
int n,sum,r;
n=125;
sum=0;
do
{
r=n%10;
sum=sum+r;
n=n/10;
System.out.println(+sum);
}while(n>0);
}
}