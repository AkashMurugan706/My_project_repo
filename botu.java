import java.io.*;
interface a
{
void aa();
}
interface b
{
void bb();
}
class c implements a,b
{
public void aa()
{
System.out.println("a");
}
public void bb()
{
System.out.println("b");
}
}
class botu
{
public static void main(String args[])
{
c d= new c();
d.aa();
d.bb();
}
}