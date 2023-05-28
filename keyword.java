import java.io.*;
class point
{
int rollno;
String name,team;
void get(int r,String n,String t)
{
this.rollno=r;
this.name=n;
this.team=t;
}
void disp()
{
System.out.println("rollno="+rollno);
System.out.println("name="+name);
System.out.println("team="+team);
}
}
class keyword
{
public static void main(String args[])throws IOException
{
point p= new point();
p.get(10,"akash","blue");
p.disp();
}
}   