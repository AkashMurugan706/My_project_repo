import java.io.*;
class cdm
{
public static void main(String args[])throws IOException
{
int balance=5000,p,withdraw,deposit,i,j,cardnumber,TXNnumber,pin;
String ministatement;
System.out.println("Cash deposit machine");
System.out.println("Choose the option to perform 0,1,2,3");
DataInputStream d= new DataInputStream(System.in);
p=Integer.parseInt(d.readLine());
if(p==0)
{
System.out.println("Enter amount to withdraw");
withdraw=Integer.parseInt(d.readLine());
i=balance-withdraw;
System.out.println("Available balance=  "+balance);
System.out.println("   ");
System.out.println("Now the balance=  "+i);
}
else if(p==1)
{
System.out.println("Ener amount to deposit");
deposit=Integer.parseInt(d.readLine());
j=balance+deposit;
System.out.println("Available balance=  "+balance);
System.out.println("   ");
System.out.println("Now the balance=  "+j);
}
else if(p==2)
{
System.out.println("mini statement");
System.out.println("Enter card number");
System.out.println("Enter TXN number");
cardnumber=Integer.parseInt(d.readLine());
TXNnumber=Integer.parseInt(d.readLine());
System.out.println("Available balance=  "+balance);
}
else if(p==3)
{
System.out.println("Enter pin");
pin=Integer.parseInt(d.readLine());
if(pin==1234)
{
System.out.println("Balance enquiry");
System.out.println("  ");
System.out.println("Available balance=  "+balance);
}
else
{
System.out.println("Wrong pin try again");
}
}
else
{
System.out.println("Thank you for using Maturavi Bank of India");
}
}
}
