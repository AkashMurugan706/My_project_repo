import java.io.*;
class d_to_b
{
public static void main(String args[])throws IOException
{
int num,j,i=0;
int binary[]=new int[100];
System.out.println("Enter Decimal value to covert into Binary :  ");
DataInputStream d= new DataInputStream(System.in);
num=Integer.parseInt(d.readLine());
while(num>0)
{
binary[i]=num%2;
num=num/2;
i++;
}
System.out.println("Binary value is : ");
for(j=i-1;j>=0;j--)
{
System.out.print(+binary[j]);
}
}
}
