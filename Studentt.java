import java.io.*;
class studentt
{
int rno;
float cgpa;
String name;
studentt(int r,float c,String n)
{
rno=r;
cgpa=c;
name=n;
}
studentt(studentt s)
{
rno=s.rno;
cgpa=s.cgpa;
name=s.name;
}
void disp()
{
System.out.println("Roll no="+rno);
System.out.println("CGPA="+cgpa);
System.out.println("Name="+name);
}
public static void main(String args[])throws IOException
{
studentt s1= new studentt(10,7.89F,"Akash");
s1.disp();
studentt s2= new studentt(s1);
s2.disp();
}
}








