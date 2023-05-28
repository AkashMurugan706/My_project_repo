import java .io.*;
class note
{
int ah,am,as,bh,bm,bs,cs,cm,ch;
void get()throws IOException
{
System.out.println("Enter ah,am,as");
DataInputStream d= new DataInputStream(System.in);
ah=Integer.parseInt(d.readLine());
am=Integer.parseInt(d.readLine());
as=Integer.parseInt(d.readLine());
if(as>60)
{
am=am+1;
System.out.println(+am);
}
else
{
as=0;
System.out.println(+as);
}
if(am>60)
{
ah=ah+1;
System.out.println(+ah);
}
else
{
am=0;
System.out.println(+am);
} 
System.out.println("Enter bh,bm,bs");
bh=Integer.parseInt(d.readLine());
bm=Integer.parseInt(d.readLine());
bs=Integer.parseInt(d.readLine());
if(bs>60)
{
bm=bm+1;
System.out.println(+bm);
}
else
{
bs=0;
System.out.println(+bs);
}
if(bm>60)
{
bh=bh+1;
System.out.println(+bh);
}
else
{
bm=0;
System.out.println(+bm);
} 
}
void disp()
{
cs=as+bs;
cm=am+bm;
ch=ah+bh;
System.out.println(+cs);
System.out.println(+cm);
System.out.println(+ch);
}
}
class time()
{
public static void main(String args[])throws IOException
note n= new note();
n.get();
n.disp();
}
}
}
