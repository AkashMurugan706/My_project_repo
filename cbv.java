import java.io.*;
class test
{
void change(int i)
{
i=i+1;
System.out.println("The value of i is="+i);
}
}
class cbv
{
public static void main(String args[])throws IOException
{
test te=new test();
int a=10;
System.out.println("Before call a="+a);
te.change(a);
System.out.println("After call a="+a);
}
}