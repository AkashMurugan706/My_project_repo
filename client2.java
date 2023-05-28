import java.lang.*;
import java.io.*;
import java.net.*;
import java.net.InetAddress;
class client2
{
public static void main(String args[])
{
Socket s=null;
System.out.println("Trying to connect");
try
{
InetAddress ip=InetAddress.getByName("localhost");
s=new Socket(ip,server.PORT);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
dout.writeUTF("Hi from client");
DataInputStream dis=new DataInputStream(s.getInputStream());
String serverMsg=new String(dis.readUTF());
System.out.println(serverMsg);
}
catch(SocketException e)
{
System.out.println("Socket Exception"+e);
}
catch(IOException e)
{
System.out.println("IOException"+e);
}
finally
{
try
{
s.close();
}
catch(IOException ie)
{
System.out.println("Error in closing"+ie);
}
}
}
}