import java.io.*;
class marks
{
int mark1,mark2,total;
marks(){}
marks(int m1,int m2)
{
mark1=m1;
mark2=m2;
}
marks(marks m)
{
mark1=m.mark1;
mark2=m.mark2;
}
void disp()
{
total=mark1+mark2;
System.out.println(+total);
}
}
class pet
{
public static void main(String args[])throws IOException
{
marks m1= new marks(90,80);
m1.disp();
marks m2= new marks(m1);
m2.disp();
}
}