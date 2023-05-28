import java.io.*;
class Train
{
int tno;
String tname;
void get()throws IOException
{
System.out.println("Enter tno,tname");
DataInputStream d= new DataInputStream(System.in);
tno=Integer.parseInt(d.readLine());
tname=d.readLine();
}
void disp()
{
System.out.println("Train number is=  "+tno);
System.out.println("Name of the Train=  "+tname);
}
}
class Electrictrain extends Train
{
int pno;
String coach;
void get1()throws IOException
{
System.out.println("Enter pno,coach");
DataInputStream d= new DataInputStream(System.in);
pno=Integer.parseInt(d.readLine());
coach=d.readLine();
}
void disp1()
{
System.out.println("Platform number=  "+pno);
System.out.println("coach"+"Ac "+"/ "+"NonAc=  "+coach);
}
}
class Passenger extends Train
{
int ano,phno;
String pname,gender;
void get2()throws IOException
{
System.out.println("Enter ano,phno,pname,gender");
DataInputStream d= new DataInputStream(System.in);
ano=Integer.parseInt(d.readLine());
phno=Integer.parseInt(d.readLine());
pname=d.readLine();
gender=d.readLine();
}
void disp2()
{
System.out.println("Passenger aadharno=  "+ano);
System.out.println("Passenger phno=  "+phno);
System.out.println("Passenger name=  "+pname);
System.out.println("Gender=  "+gender);
}
}
class obook
{
public static void main(String args[])throws IOException
{
Passenger p= new Passenger();
p.get();
p.disp();
p.get2();
p.disp2();
Electrictrain e=new Electrictrain();
e.get1();
e.disp1();
}
}

