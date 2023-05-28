import java.io.*;
class staff
{
int id;
String name;
void get()throws IOException
{
System.out.println("Enter id,name");
DataInputStream d= new DataInputStream(System.in);
id=Integer.parseInt(d.readLine());
name=d.readLine();
}
void disp()
{
System.out.println(+id);
System.out.println(name);
}
}
class mani extends staff
{
int intime,outtime,d;
void get1()throws IOException
{
System.out.println("Enter intime,outtime");
DataInputStream d= new DataInputStream(System.in);
intime=Integer.parseInt(d.readLine());
outtime=Integer.parseInt(d.readLine());
}
void disp1()throws IOException
{
d=intime-outtime;
System.out.println(+d);
}
}
class off
{
public static void main(String args[])throws IOException
{
mani m= new mani();
m.get();
m.disp();
m.get1();
m.disp1();
}
}