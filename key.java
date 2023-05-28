import java.io.*;
class key
{
public static void main(String args[])throws IOException
{
int stock,purchase,balance,i;
System.out.println("Enter stock");
DataInputStream d= new DataInputStream(System.in);
stock=Integer.parseInt(d.readLine());
i=1;
do
{
System.out.println("enter purchase"); 
purchase=Integer.parseInt(d.readLine());
if(stock>purchase)
{
balance=stock-purchase;
System.out.println("balance apple="+balance);
stock=stock-purchase;
i++;
}
else 
{
System.out.println("insufficient");
}
}
while(i<=5);
}
}