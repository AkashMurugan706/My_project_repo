import java.io.*;
class sombu
{
public static void main(String args[])throws IOException
{
int ch,c,w,d,t,pwd;
String user;
System.out.println("Enter user,pwd,c");
DataInputStream e= new DataInputStream(System.in);
user=e.readLine();
pwd=Integer.parseInt(e.readLine());
c=Integer.parseInt(e.readLine());
if(user=="akash")
{
if(pwd==1234)
{
System.out.println("Hi! akash welcome to sombu murugesan bank of India ");
}
else
{
System.out.println("There's is mistake while logging in Please make sure your logged in details correct or try again later  .................................... ");
}
}
else
{
System.out.println("There's is mistake while logging in Please make sure your logged in details correct or try again later .................................... ");
}
System.out.println("Enter ch,withdraw amount");
ch=Integer.parseInt(e.readLine());
w=Integer.parseInt(e.readLine());
if(ch==1)
{
t=c-w;
System.out.println("withdrawed Succesfully your Total amount is  "+t);
}
else if(ch==2)
{
System.out.println("Enter Deposit amount");
d=Integer.parseInt(e.readLine());
t=c+d;
System.out.println("Deposited Succesfully your Total amount is  "+t);
}
else
{
System.out.println("There's is mistake while logging in Please make sure your logged in details correct or try again later /n .................................... ");
}
{
System.out.println("Thank you for using sombu murugesan bank of India..Have a great day!!");
}
}
}
