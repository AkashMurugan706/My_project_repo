import java.io.*;
class student
{
int rollno,age;
String name;
void get()throws IOException
{
System.out.println("Enter rollno,age,name");
DataInputStream d= new DataInputStream(System.in);
rollno=Integer.parseInt(d.readLine());
age=Integer.parseInt(d.readLine());
name=d.readLine();
}
void get(int r,int a,String n)
{
rollno=r;
age=a;
name=n;
}
void disp()
{
System.out.println(+rollno);
System.out.println(+age);
System.out.println(name);
}
}
class demo1
{
public static void main(String args[])throws IOException
{
student s= new student();
s.get();
s.disp();
student s1= new student();
s1.get(2,15,"ram");
s1.disp();
}
}