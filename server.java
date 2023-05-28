import java.net.*;
import java.lang.*;
import java.io.*;
public class server
{
public static final int PORT=1025;
public static void main(String args[])
{
ServerSocket sersock=null;
Socket sock=null;
System.out.println("Wait !! ");
try
{
sersock=new ServerSocket(PORT);
int number;
System.out.println("Server Started :"+sersock);
sock=sersock.accept();
System.out.println("Client Connected :"+sock);
DataInputStream ins=new DataInputStream(sock.getInputStream());
String ClientMsg=new String(ins.readUTF());
System.out.println(ClientMsg);
DataOutputStream dos=new DataOutputStream(sock.getOutputStream());
dos.writeUTF("Hello from server");
dos.close();
sock.close();
}
catch(SocketException se)
{
System.out.println("Server Socket problem "+se.getMessage());
}
catch(Exception e)
{
System.out.println("Couldn't start "+e.getMessage());
}
System.out.println("Connection From : "+sock.getInetAddress());
}
}

