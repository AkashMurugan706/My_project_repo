import java.io.*;
interface insp
{
void child1();
}
interface insp1
{
void child2();
}
class demo implements insp,insp1
{
public void child1()
{
System.out.println("Child 1");
}
public void child2()
{
System.out.println("Child 2");
}
}
class multi_in
{
public static void main(String args[])
{
demo d= new demo();
d.child1();
d.child2();
}
}