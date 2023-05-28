import java.io.*;
class hospital
{
int age,phno,opnum,tabamt1,injamt1,docfee,scanamt,ICUrent,roomrent,amt1,amt2,amt3,days1,days2,days3,tabamt2,injamt2,opramt1,tabamt3,injamt3,amt4,amt5,amt6,days4,days5,days6,tabamt4,injamt4,opramt2,total;
String name,reason,checkup,room;
void get()throws IOException
{
System.out.println("Enter age,phno,opnum,tabamt1,injamt1,docfee,scanamt,ICUrent,roomrent,amt1,amt2,amt3,days1,days2,days3,tabamt2,injamt2,opramt1,tabamt3,injamt3,amt4,amt5,amt6,days4,days5,days6,tabamt4,injamt4,opramt2,total, name,reason,checkup,room");
DataInputStream d= new DataInputStream(System.in);
age=Integer.parseInt(d.readLine());
phno=Integer.parseInt(d.readLine());
opnum=Integer.parseInt(d.readLine());
tabamt1=Integer.parseInt(d.readLine());
injamt1=Integer.parseInt(d.readLine());
docfee=Integer.parseInt(d.readLine());
scanamt=Integer.parseInt(d.readLine());
ICUrent=Integer.parseInt(d.readLine());
roomrent=Integer.parseInt(d.readLine());
amt1=Integer.parseInt(d.readLine());
amt2=Integer.parseInt(d.readLine());
amt3=Integer.parseInt(d.readLine());
days1=Integer.parseInt(d.readLine());
days2=Integer.parseInt(d.readLine());
days3=Integer.parseInt(d.readLine());
tabamt2=Integer.parseInt(d.readLine());
injamt2=Integer.parseInt(d.readLine());
opramt1=Integer.parseInt(d.readLine());
tabamt3=Integer.parseInt(d.readLine());
injamt3=Integer.parseInt(d.readLine());
amt4=Integer.parseInt(d.readLine());
amt5=Integer.parseInt(d.readLine());
amt6=Integer.parseInt(d.readLine());
days4=Integer.parseInt(d.readLine());
days5=Integer.parseInt(d.readLine());
days6=Integer.parseInt(d.readLine());
tabamt4=Integer.parseInt(d.readLine());
injamt4=Integer.parseInt(d.readLine());
opramt2=Integer.parseInt(d.readLine());
total=Integer.parseInt(d.readLine());
name=d.readLine();
reason=d.readLine();
checkup=d.readLine();
room=d.readLine();
}
if(opnum<700)
{
System.out.println("old");

if(checkup=="normal")
{
System.out.println(reason);
System.out.println(+tabamt1);
System.out.println(+injamt1);
System.out.println(+docfee);
total=tabamt1+injamt1+docfee;
System.out.println(+total);
}
else if(checkup=="heavy")
{
System.out.println(+scanamt);
System.out.println("ICUrent="amt1*days1);
if(room=="ac")
{
System.out.println("room rent="amt2*days2);
}
else if(room=="non")
{
System.out.println("room rent="amt3*days3);
}
System.out.println(+tabamt2);
System.out.println(+injamt2);
System.out.println(+opramt1);
total=scanamt+ICUrent+roomrent+tabamt2+injamt2+opramt1;
System.out.println(+total);
}
if(opnum>700)
{
System.out.println("new");
}
if(checkup=="normal")
{
System.out.println(reason);
System.out.println(+tabamt3);
System.out.println(+injamt3);
System.out.println(+docfee);
total=tabamt3+injamt3+docfee;
System.out.println(+total);
}
if(checkup=="heavy")
{
System.out.println(+scanamt);
System.out.println("ICUrent="amt4*days4);
if(room=="ac")
{
System.out.println("room rent="amt5*days5);
}
else if(room=="non")
{
System.out.println("room rent="amt6*days6);
}
System.out.println(+tabamt4);
System.out.println(+injamt4);
System.out.println(+opramt2);
total=scanamt+ICUrent+roomrent+tabamt4+injamt4+opramt2;
System.out.println(+total);
}
else
{
if(opnum>700)
{
System.out.println("new");
}
if(checkup=="normal")
{
System.out.println(reason);
System.out.println(+tabamt3);
System.out.println(+injamt3);
System.out.println(+docfee);
total=tabamt3+injamt3+docfee
System.out.println(+total);
}
if(checkup=="heavy")
{
System.out.println(+scanamt);
System.out.println("ICUrent="amt4*days4);
if(room=="ac")
{
System.out.println("room rent="amt5*days5);
}
else if(room=="non")
{
System.out.println("room rent="amt6*days6);
}
System.out.println(+tabamt4);
System.out.println(+injamt4);
System.out.println(+docfee);
total=tabamt4+injamt4+docfee;
System.out.println(+total);
}
else
{
System.out.println("ward");
}
else
{
System.out.println("no problem");
}
else
{
System.out.println("not a patient");
}
else
{
System.out.println("visitor");
}
else
{
System.out.println("ward");
}
else
{
System.out.println("no problem");
}
else
{
System.out.println("not a patient");
}
else
{
System.out.println("visitor");
}
}
}
}
}
}
}
}
}
}
System.out.println(+age);
System.out.println(+phno);
System.out.println(+opnum);
System.out.println(+tabamt1);
System.out.println(+injamt1);
System.out.println(+docfee);
System.out.println(+scanamt);
System.out.println(+ICUrent);
System.out.println(+roomrent);
System.out.println(+amt1);
System.out.println(+amt2);
System.out.println(+amt3);
System.out.println(+days1);
System.out.println(+days2);
System.out.println(+days3);
System.out.println(+tabamt2);
System.out.println(+injamt2);
System.out.println(+opramt1);
System.out.println(+tabamt3);
System.out.println(+injamt3);
System.out.println(+amt4);
System.out.println(+amt5);
System.out.println(+amt6);
System.out.println(+days4);
System.out.println(+days5);
System.out.println(+days6);
System.out.println(+tabamt4);
System.out.println(+injamt4);
System.out.println(+opramt2);
System.out.println(+total);
System.out.println(name);
System.out.println(reason);
System.out.println(checkup);
System.out.println(room);
}
}
class project
{
public static void main(String args[])throws IOException
{
hospital h= new hospital
h.get();
h.disp();
}
}

