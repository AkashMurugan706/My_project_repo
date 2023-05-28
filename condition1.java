import java.io.*;
class demo
{
public static void main(String args[])throws IOException
{
 int mark;
 System.out.println("Enter mark");
 DataInputStream d= new DataInputStream(System.in);
 mark=Integer.parseInt(d.readLine());
  if(mark>40)
  {
  System.out.println("pass");
  }
  else{
  System.out.println("fail");
  }
 }
}