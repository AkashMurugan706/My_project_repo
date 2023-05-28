import java.io.*;
interface college
{
public print dname(String name);
public print sname(String name1);
}
class stud implements college
{
public print sname(String name1);
{
System.out.println("Name of student="+name1);
}
}
class dept implements college
{
public print dname(String name);
{
System.out.println("Name of deparment="+name);
}
}
class bom
{
public static void main(String args[])throws IOException
{
System.out.println("Enter  sname, dname");
DataInputStream d= new DataInputStream(System.in);
 sname=d.readLine();
dname=d.readLine();
}
}
