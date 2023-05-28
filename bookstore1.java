import java.io.*;
class store
{
int price,bookno;
String author;
store(int p,int bno,String a)
{
price=p;
bookno=bno;
author=a;
}
void display()
{
System.out.println("The price of the book is="+price);
System.out.println("The number of the book is="+bookno);
System.out.println("The author of the book is="+author);
}
}
class book extends store
{
int qord,netcost;
book(int p1,int bno1,String a1,int q)
{
super(p1,bno1,a1);
qord=q;
}
void display()
{
netcost=qord*super.price;
super.display();
System.out.println("quantity ordered="+qord);
System.out.println("netcost of the book="+netcost);
}
}
class bookstore1
{
public static void main(String args[])
{
book b=new book(200,10,"kambar",60);
b.display();
}
}
