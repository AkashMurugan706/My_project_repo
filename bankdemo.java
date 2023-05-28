import java.io.*;
class bank
{
int pwd;
String username;
bank(int p,String n);
{
pwd=p;																															
username=n;
}
void display()
{
System.out.println("The Password is ="+pwd);
System.out.println("The Username is ="+username);
}
}
class akash extends bank
{
int withdraw,deposit,capital;
akash(int p1,String n1,int w,int d,int,c);
{
super(p1,n1);
withdraw=w;
deposit=d;
capital=c;
}
void display()
{
withdraw=capital-withdraw;
deposit=capital+deposit;
super.display();
System.out.println("The Capital is ="+capital);
System.out.println("The Withdraw is="+withdraw);
System.out.println("The Deposit is="+deposit);
}
}
class bankdemo
{
public static void main(String args[])throws IOException
{
akash a=new akash(1234,Vaishu,5000,2000,15000);
a.display();
}
}
