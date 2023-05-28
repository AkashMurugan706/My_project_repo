import java.io.*;
class hotel
{
int hphno;
String hname;
void get()throws IOException
{
System.out.println("Enter hotel phone number , hotel name");
DataInputStream d= new DataInputStream(System.in);
hphno=Integer.parseInt(d.readLine());
hname=d.readLine();
}
void disp()
{
System.out.println("Hotel phone no= "+hphno);
System.out.println("Hotel name=  "+hname);
System.out.println("      ");
}
}
class rest extends hotel
{
int time,date;
void get1()throws IOException
{
System.out.println("Enter Time you entered in hotel for rest , date you came in to hotel");
DataInputStream d= new DataInputStream(System.in);
time=Integer.parseInt(d.readLine());
date=Integer.parseInt(d.readLine());
}
void disp1()
{
System.out.println("Time you entered=  "+time);
System.out.println("Date you came=   "+date);
System.out.println("      ");
}
}
class veg extends rest
{
int fquant,famt,total;
String fname;
void get2()throws IOException
{
System.out.println("Enter the name of the veg food , quantity of the veg food , amount of food");
DataInputStream d= new DataInputStream(System.in);
fname=d.readLine();
fquant=Integer.parseInt(d.readLine());
famt=Integer.parseInt(d.readLine());
}
void disp2()
{
System.out.println("quantity=  "+fquant);
System.out.println("food name=  "+fname);
total=fquant*famt;
System.out.println("amount for food=  "+total);
System.out.println("      ");
}
}
class nonveg extends rest
{
int fquant,famt,t;
String fname;
void get3()throws IOException
{
System.out.println("Enter the name of the nonveg food , quantity of the nonveg food , amount of food");
DataInputStream d= new DataInputStream(System.in);
fname=d.readLine();
fquant=Integer.parseInt(d.readLine());
famt=Integer.parseInt(d.readLine());
}
void disp3()
{
System.out.println("quantity=  "+fquant);
System.out.println("food name=  "+fname);
t=fquant*famt;
System.out.println("amount for food=  "+t);
System.out.println("      ");
}
}
class room extends hotel
{
int rno;
void get4()throws IOException
{
System.out.println("Enter the room No");
DataInputStream d= new DataInputStream(System.in);
rno=Integer.parseInt(d.readLine());
}
void disp4()
{
System.out.println("Room number=  "+rno);
System.out.println("      ");
}
}
class Ac extends room
{
int acroomamt,bed,f;
String type;
void get5()throws IOException
{
System.out.println("Enter Ac room amount , type of the room "+"["+"eg"+":"+"delux"+"]"+ ", how much bed you want"+"?");
DataInputStream d= new DataInputStream(System.in);
acroomamt=Integer.parseInt(d.readLine());
type=d.readLine();
bed=Integer.parseInt(d.readLine());
}
void disp5()
{
System.out.println("type of the room=  "+type);
f=acroomamt*bed;
System.out.println("Amount of ac room=  "+f);
System.out.println("      ");
}
}
class Nonac extends room
{
int nonacroomamt,bed,total1;
String type;
void get6()throws IOException
{
System.out.println("Enter Nonac room amount , type of the room "+"["+"eg"+":"+"delux"+"]"+ ", how much bed you want"+"?");
DataInputStream d= new DataInputStream(System.in);
nonacroomamt=Integer.parseInt(d.readLine());
type=d.readLine();
bed=Integer.parseInt(d.readLine());
}
void disp6()
{
System.out.println("type of the room=  "+type);
total1=nonacroomamt*bed;
System.out.println("Amount of Nonac room=  "+total1);
System.out.println("      ");
}
}
class restaurent
{
public static void main(String args[])throws IOException
{
veg v= new veg();
v.get();
v.disp();
v.get1();
v.disp1();
v.get2();
v.disp2();
nonveg nv= new nonveg();
nv.get();
nv.disp();
nv.get1();
nv.disp1();
nv.get3();
nv.disp3();
Ac a= new Ac();
a.get();
a.disp();
a.get4();
a.disp4();
a.get5();
a.disp5();
Nonac na= new Nonac();
na.get();
na.disp();
na.get4();
na.disp4();
na.get6();
na.disp6();
}
}