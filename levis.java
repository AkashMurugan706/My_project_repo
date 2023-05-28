import java.io.*;
class tommy
{
int i,monster1,monster2,monster3,bonus1,bonus2,bonus3;
void get()throws IOException
{
DataInputStream d= new DataInputStream(System.in);
System.out.println("Enter i,monster1,monster2,monster3,bonus1,bonus2,bonus3);
i=Integer.parseInt(d.readLine());
monster1=Integer.parseInt(d.readLine());
monster2=Integer.parseInt(d.readLine());
monster3=Integer.parseInt(d.readLine());
bonus1=Integer.parseInt(d.readLine());
bonus2=Integer.parseInt(d.readLine());
bonus3=Integer.parseInt(d.readLine());
}
void get(int i,int m1,int m2,int m3,int b1,int b2,int b3)
{
i=i;
monster1=m1;
monster2=m2;
monster3=m3;
bonus1=b1;
bonus2=b2;
bonus3=b3;
for(i=100;i>m2,i=+b2)
{
for(i=300;i>m1,i=+b1)
{
for(i=401;i>m3;i=+b3)
{
System.out.println("Monster3 defeated you get an bonus="+b3);
}
System.out.println("Monster1 defeated you get an bonus="+b1);
}
System.out.println("Monster2 defeated you get an bonus="+b);
}
void disp()
{
System.out.println(+i);
System.out.println(+monster1);
System.out.println(+monster2);
System.out.println(+monster3);
System.out.println(+bonus1);
System.out.println(+bonus2);
System.out.println(+bonus3);
}
}
class levis
{
public static void main(String args[])throws IOEXception
{
tommy t= new tommy();
t.get();
t.disp();
tommy t1= new tommy();
t.get(100,200,90,300,101,200,500);
t.disp();
}
}


