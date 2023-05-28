import java.io.*;
class employee
{
int empid,age;
String name;
void get()throws IOException
{
System.out.println("Enter empid,age,name");
DataInputStream d= new DataInputStream(System.in);
empid=Integer.parseInt(d.readLine());
age=Integer.parseInt(d.readLine());
name=d.readLine();
}
void get(int i,int a,String n)
{
empid=i;
age=a;
name=n;
}
employee()throws IOException
{
System.out.println("Enter empid,age,name");
DataInputStream d= new DataInputStream(System.in);
empid=Integer.parseInt(d.readLine());
age=Integer.parseInt(d.readLine());
name=d.readLine();
}
employee(int i,int a,String n)
{
empid=i;
age=a;
name=n;
}
void disp()
{
System.out.println(+empid);
System.out.println(+age);
System.out.println(name);
}
}
class demo
{public static void main(String args[])throws IOException
{
employee e= new employee();
e.get();
e.disp();
employee e1= new employee();
e1.get(13,42,"pichai");
e1.disp();
employee e2= new employee();
e2.disp();
employee e3= new employee(12,32,"ravi");
e3.disp();
}
}