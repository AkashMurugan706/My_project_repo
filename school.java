import java.io.*;
class staff
{
int sid,age;
String name;
void get()throws IOException
{
System.out.println("Enter sid,age,name");
DataInputStream d=new DataInputStream(System.in);
sid=Integer.parseInt(d.readLine());
age=Integer.parseInt(d.readLine());
name=d.readLine();
}
void disp()
{
System.out.println("sid =" +sid);
System.out.println("age= "+age);
System.out.println("name= "+name);
}
}
class teaching extends staff
{
int exp,sal;
void get1()throws IOException
{
System.out.println("Enter exp,sal");
DataInputStream d=new DataInputStream(System.in);
exp=Integer.parseInt(d.readLine());
sal=Integer.parseInt(d.readLine());
}
void disp1()
{
System.out.println("exp= "+exp);
System.out.println("sal= "+sal);
}
}
class school
{
public static void main(String args[])throws IOException
{
teaching t=new teaching();
t.get();
t.disp();
t.get1();
t.disp1();
}
}