import java.io.*;
interface college
{
public void departmentname(String name);
public void studentname(String name);
}
class stud implements college
{
public void studentname(String name)
{
return(name);
}
}
class dept implements college
{
public void departmentname(String name)
{
return(name);
}
}
class new
{
public static void main(String args[])
{
stud s= new stud();
dept d= new dept();
System.out.println("The name of the student is= "+s.studentname("kumar"));
System.out.println("The name of the department is= "+d.departmentname("cse"));
}
}
