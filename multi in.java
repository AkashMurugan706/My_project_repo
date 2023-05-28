import java.io.*;
interface insp
{
void child1()

}
interface insp1
{
void child2()
{
System.out,prntln("Child 1");
}
}
class demo implements  child1,child2
{
void child1()
{
System.out,prntln("Child 1");
}
void child2()
{
System.out,prntln("Child 1");
}
}
class multi in
{
public static void main(String args[])
{
demo d= new demo();
d.child1();
d.child2();
}
}