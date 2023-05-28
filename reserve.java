import java.io.*;
class Ticket
{
int aadhar,tcktno;
String name;
void get()throws IOException
{
System.out.println("Enter aadhar,tcktno,name");
DataInputStream d= new  DataInputStream(System.in);
aadhar=Integer.parseInt(d.readLine());
tcktno=Integer.parseInt(d.readLine());
name=d.readLine();
}
void disp()
{
System.out.println("Enter aadhar="+aadhar);
System.out.println("Enter tcktno="+tcktno);
System.out.println("Enter name="+name);
}
}
class Train extends Ticket
{
int tktno,platform,amt;
String location,destination;
void get1()throws IOException
{
System.out.println("Enter tktno,platform,amt,location,destination");
DataInputStream d= new DataInputStream(System.in);
tktno=Integer.parseInt(d.readLine());
platform=Integer.parseInt(d.readLine());
amt=Integer.parseInt(d.readLine());
location=d.readLine();
destination=d.readLine();
}
void disp1()
{
System.out.println("Enter tktno="+tktno);
System.out.println("Enter platform="+platform);
System.out.println("Enter amt="+amt);
System.out.println("Enter location="+location);
System.out.println("Enter destination="+destination);
}
}
class Bus extends Ticket
{
int seatno,bookingdate,time;
String busname;
void get2()throws IOException
{
System.out.println("Enter seatno,bookingdate,time,busname");
DataInputStream d= new DataInputStream(System.in);
seatno=Integer.parseInt(d.readLine());
bookingdate=Integer.parseInt(d.readLine());
time=Integer.parseInt(d.readLine());
busname=d.readLine();
}
void disp2()
{
System.out.println("Enter seatno="+seatno);
System.out.println("Enter bookingdate="+bookingdate);
System.out.println("Enter time="+time);
System.out.println("Enter name="+busname);
}
}
class reserve
{
public static void main(String args[])throws IOException
{
Train d= new Train();
d.get();
d.disp();
d.get1();
d.disp1();
Bus d1= new Bus();
d1.get2();
d1.disp2();
}
} 