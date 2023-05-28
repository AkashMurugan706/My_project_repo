import java.io.*;
class demo
{
public static void main(string args[])
{
 int mark;
 system.out.println("Enter mark");
 DataInput Stream d=new DataInput Stream(system.in);
 mark=Integer.parseInt(d.readLine());
  if(mark>40)
  {
  system.out.println("pass");
  }
  else{
  system.out.println("fail");
  }
 }
}