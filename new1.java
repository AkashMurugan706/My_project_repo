import java.io.*;
interface college
{
public String compute(String n);
}
class dept implements college
{
public String compute(String n)
{
return(n);
}
}
class stud implements college
{
public String compute(String n)
{
return(n);
}
}
class new1
{
public static void main(String args[])
{
dept d= new dept();
stud s= new stud();
System.out.println("The department name is=  "+d.compute("csc"));
System.out.println("The student name is=  "+s.compute("vaishu"));
}
}