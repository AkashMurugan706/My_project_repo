import java.io.*;
class bank
{
int pwd;
String username;
public bank(int p,String n)
{
pwd=p;								
username=n;
}
void display()
{
System.out.println("The Password is ="+pwd);
System.out.println("The Username is ="+username);
System.out.println("Successfully logined");
System.out.println("  ");
}
}
class akash extends bank
{
int withdraw,deposit,capital;
public akash(int p1,String n1,int w,int d,int c)
{
super(p1,n1);
withdraw=w;
deposit=d;
capital=c;
}
void display()
{
System.out.println("Withdraw amount is="+withdraw);
System.out.println("Deposit amount is="+deposit);
System.out.println("    ");
withdraw=capital-withdraw;
deposit=capital+deposit;
super.display();
System.out.println("The Capital is ="+capital);
System.out.println("The  amount is Withdrawed and now the capital amount is="+withdraw);
System.out.println("The amount is Deposited and now the capital amount is="+deposit);
}
}
class bankdemo
{
public static void main(String args[])throws IOException
{
akash a=new akash(1234,"Vaishu",5000,2000,15000);
a.display();
}
}
