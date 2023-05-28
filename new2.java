import java.io.*;
interface student
{
public void getsname();
}
class Name implements student
{
public void getsname()
{
String sn;
System.out.println("Enter sn");
DataInputStream d= new DataInputStream(System.in);
sn=d.readLine();
}
}
class new2
{
public static void main(String args[])throws IOException
{
Name x= new Name();
System.out.println("The student name=  "+x);
}
}