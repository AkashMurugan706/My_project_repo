import java.io.*;
class empl
{
int age;
void get()throws IOException
{
System.out.println("Enter age");
DataInputStream d= new DataInputStream(System.in);
age=Integer.parseInt(d.readLine());
if(age>=25&&age<=40)
{
System.out.println("eligible");
}
else
{
System.out.println("not eligible");
}
}
void disp()
{
System.out.println(+age);
}
}
class eli extends empl
{
String name;
void get1()throws IOException
{
System.out.println("Enter name");
DataInputStream d= new DataInputStream(System.in);
name=d.readLine();
}
void disp1()
{
System.out.println(name);
}
}
class pap
{
public static void main(String args[])throws IOException
{
eli e= new eli();
e.get();
e.disp();
e.get1();
e.disp1();
}
}