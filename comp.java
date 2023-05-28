import java.io*;
class comp
{
int a,i,m1,m2,m3,b1,b2,b3;
void get()
{
System.out.println("Enter i");
DataInputStream d= new DataInputStream(System.in);
i=Integer.parseInt(d.readLine());
a=1;
do
{
System.out.println("Enter m1,m2,m3,b1,b2,b3")
m1=Integer.parseInt(d.readLine());
m2=Integer.parseInt(d.readLine());
m3=Integer.parseInt(d.readLine());
b1=Integer.parseInt(d.readLine());
b2=Integer.parseInt(d.readLine());
b3=Integer.parseInt(d.readLine());
if(m1<i)
{
i=i+b1;
System.out.println(+i);
}
else if(m2<i)
{
i=i+b2;
System.out.println(+i);
}
else if(m3<i)
{
i=i+b3;
System.out.println(+i);
}
}while(a<=5);
