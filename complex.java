import java.io.*;
class num
{
int arp,aip,brp,bip,crp,cip;
void get()throws IOException
{
System.out.println("Enter arp,aip,brp,bip");
DataInputStream d= new DataInputStream(System.in);
arp=Integer.parseInt(d.readLine());
aip=Integer.parseInt(d.readLine());
brp=Integer.parseInt(d.readLine());
bip=Integer.parseInt(d.readLine());
}
void disp()
{
crp=arp+brp;
cip=aip+bip;
System.out.println(+crp);
System.out.println(+cip);
}
}
class complex
{
public static void main(String args[])throws IOException
{
num n= new num();
n.get();
n.disp();
}
}

