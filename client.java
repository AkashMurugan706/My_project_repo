import java.lang.*;
import java.io.*;
import java,net*;
import java.net.InetAddress;
class Client
{
public static void main(String args[])
{
Socket sock=null;
DataInputStream dis=null;
DataInputStream dos=null;
System.out.println("Trying to connect");
try
{
InetAddress ip=InetAddress.getByName("localhost");
sock=neew Socket(ip,Server.PORT);
dos=new DataInputStream(sock.getOutpttream());
dos.writeUTF(" Hi from  Client");
DataInputStream is=new DataInputStream(sock.getInputStream());
String serverMsg= new String(is.readUTF());
System.out.println(serverMsg);
}
catch(SocketException e)
{
System.out.println("SocketException "+e);
}
catch
{
System.out.println("IOEException "+e);
}
finally
{
try 
{
sock.close();
}
catch(IOException ie)
{
System.out.println(("Close Error :"+ie.getMessage());
}
}
}
}