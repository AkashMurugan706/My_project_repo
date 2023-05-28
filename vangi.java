import java.io.*;
class bank
{
int capital;
void get()throws IOException
{
System.out.println("Enter capital");
DataInputStream d= new DataInputStream(System.in);
capital=Integer.parseInt(d.readLine());
}
void disp()
{
System.out.println("The capital amount in your account=  "+capital);
}
}
class withdraw extends bank
{
int withdraw,t;
void get1()throws IOException
{
System.out.println("Enter withdraw");
DataInputStream d= new DataInputStream(System.in);
withdraw=Integer.parseInt(d.readLine());
}
void disp1()
{
t=capital-withdraw;
System.out.println("balance amount in your account=  "+t);
}
}
class deposit extends bank
{
int deposit,tot;
void get2()throws IOException
{
System.out.println("Enter deposit");
DataInputStream d= new DataInputStream(System.in);
deposit=Integer.parseInt(d.readLine());
}
void disp2()
{
tot=capital+deposit;
System.out.println("balance amount in your account=  "+tot);
}
}
class vangi
{
public static void main(String args[])throws IOException
{
withdraw w= new withdraw();
w.get();
w.disp();
w.get1();
w.disp1();
deposit d= new deposit();
d.get();
d.disp();
d.get2();
d.disp2();
}
}