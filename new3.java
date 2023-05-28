import java.io.*;
interface student
{
public String compute(String name);
}
class sname implements student
{
public String compute(String name);
}
class new2
{
public static void main(String args[])
{
System.out.println("Enter student name");
DataInputStream d= new DataInputStream(System.in);
name =d.readLine();
sname n= new sname();

