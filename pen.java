import java.io.*;
class tommy
{
int initial1,initial2,initial3,monster1,monster2,monster3,bonus1,bonus2,bonus3,total,total1,total2;
void get(int i1,int i2,int i3,int m1,int m2,int m3,int b1,int b2,int b3)
{
initial1=i1;
initial2=i2;
initial3=i3;
monster1=m1;                              
monster2=m2;
monster3=m3;
bonus1=b1;
bonus2=b2;
bonus3=b3;
while(i1<=100)
{
for(i1=100;i1>m2;i1++)
{
}
System.out.println("Monster2 defeated you get an bonus="+b2);
total=i1+b2;
System.out.println(+total);
}
if(i2==300)
{
for(i2=300;i2>m1;i2++)
{
}
System.out.println("Monster1 defeated you get an bonus="+b1);
total1=300+101;
System.out.println(+total1);
}
if(i3==401)
{
for(i3=401;i3>m3;i3++)
{
}
System.out.println("Monster3 defeated you get an bonus="+b3);
total2=401+500;
System.out.println(+total2);
}
else 
{
System.out.println("you get failed");
}
}
void disp()
{
System.out.println(+total);
System.out.println(+total1);
System.out.println(+total2);
}
}
class pen
{
public static void main(String args[])throws IOException
{
tommy t= new tommy();
t.get(100,300,401,200,90,300,101,200,500);
t.disp();
}
}
