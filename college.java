import java.io.*;
class department
{
String dname;
void get()throws IOException
{
System.out.println("Enter department names");
DataInputStream d= new DataInputStream(System.in);
dname=d.readLine();
}
void disp()
{
System.out.println("Name of the department=  "+dname);
}
}
class CSE extends department
{
int year;
String sname;
void get1()throws IOException
{
System.out.println("Enter year,sname");
DataInputStream d= new DataInputStream(System.in);
year=Integer.parseInt(d.readLine());
sname=d.readLine();
}
void disp1()
{
System.out.println("Students year=  "+year);
System.out.println("Students name=  "+sname);
}
}
class CSEIstyear extends CSE
{
int srno;
String sec;
void get2()throws IOException
{
System.out.println("Enter srno,sec");
DataInputStream d= new DataInputStream(System.in);
srno=Integer.parseInt(d.readLine());
sec=d.readLine();
}
void disp2()
{
System.out.println("Students roll no=  "+srno);
System.out.println("Students section=  "+sec);
}
}
class CSEIIndyear extends CSE
{
int srno;
String sec;
void get3()throws IOException
{
System.out.println("Enter srno,sec");
DataInputStream d= new DataInputStream(System.in);
srno=Integer.parseInt(d.readLine());
sec=d.readLine();
}
void disp3()
{
System.out.println("Students roll no=  "+srno);
System.out.println("Students section=  "+sec);
}
}
class EEE extends department
{
int year;
String sname;
void get4()throws IOException
{
System.out.println("Enter year,sname");
DataInputStream d= new DataInputStream(System.in);
year=Integer.parseInt(d.readLine());
sname=d.readLine();
}
void disp4()
{
System.out.println("Students year=  "+year);
System.out.println("Students name=  "+sname);
}
}
class EEEIstyear extends EEE
{
int srno;
String sec;
void get5()throws IOException
{
System.out.println("Enter srno,sec");
DataInputStream d= new DataInputStream(System.in);
srno=Integer.parseInt(d.readLine());
sec=d.readLine();
}
void disp5()
{
System.out.println("Students roll no=  "+srno);
System.out.println("Students section=  "+sec);
}
}
class EEEIIndyear extends EEE
{
int srno;
String sec;
void get6()throws IOException
{
System.out.println("Enter srno,sec");
DataInputStream d= new DataInputStream(System.in);
srno=Integer.parseInt(d.readLine());
sec=d.readLine();
}
void disp6()
{
System.out.println("Students roll no=  "+srno);
System.out.println("Students section=  "+sec);
}
}
class ECE extends department
{
int year;
String sname;
void get7()throws IOException
{
System.out.println("Enter year,sname");
DataInputStream d= new DataInputStream(System.in);
year=Integer.parseInt(d.readLine());
sname=d.readLine();
}
void disp7()
{
System.out.println("Students year=  "+year);
System.out.println("Students name=  "+sname);
}
}
class ECEIstyear extends ECE
{
int srno;
String sec;
void get8()throws IOException
{
System.out.println("Enter srno,sec");
DataInputStream d= new DataInputStream(System.in);
srno=Integer.parseInt(d.readLine());
sec=d.readLine();
}
void disp8()
{
System.out.println("Students roll no=  "+srno);
System.out.println("Students section=  "+sec);
}
}
class ECEIIndyear extends ECE
{
int srno;
String sec;
void get9()throws IOException
{
System.out.println("Enter srno,sec");
DataInputStream d= new DataInputStream(System.in);
srno=Integer.parseInt(d.readLine());
sec=d.readLine();
}
void disp9()
{
System.out.println("Students roll no=  "+srno);
System.out.println("Students section=  "+sec);
}
}
class IT extends department
{
int year;
String sname;
void get10()throws IOException
{
System.out.println("Enter year,sname");
DataInputStream d= new DataInputStream(System.in);
year=Integer.parseInt(d.readLine());
sname=d.readLine();
}
void disp10()
{
System.out.println("Students year=  "+year);
System.out.println("Students name=  "+sname);
}
}
class ITIstyear extends IT
{
int srno;
String sec;
void get11()throws IOException
{
System.out.println("Enter srno,sec");
DataInputStream d= new DataInputStream(System.in);
srno=Integer.parseInt(d.readLine());
sec=d.readLine();
}
void disp11()
{
System.out.println("Students roll no=  "+srno);
System.out.println("Students section=  "+sec);
}
}
class ITIIndyear extends IT
{
int srno;
String sec;
void get12()throws IOException
{
System.out.println("Enter srno,sec");
DataInputStream d= new DataInputStream(System.in);
srno=Integer.parseInt(d.readLine());
sec=d.readLine();
}
void disp12()
{
System.out.println("Students roll no=  "+srno);
System.out.println("Students section=  "+sec);
}
}
class college
{
public static void main(String args[])throws IOException
{
CSE c= new CSE();
c.get();
c.disp();
c.get1();
c.disp1();
CSEIstyear i= new CSEIstyear();
i.get();
i.disp();
i.get1();
i.disp1();
i.get2();
i.disp2();
CSEIIndyear ii= new CSEIIndyear();
ii.get();
ii.disp();
ii.get1();
ii.disp1();
ii.get3();
ii.disp3();
EEE e= new EEE();
e.get();
e.disp();
e.get4();
e.disp4();
EEEIstyear iii= new EEEIstyear();
iii.get();
iii.disp();
iii.get4();
iii.disp4();
iii.get5();
iii.disp5();
EEEIIndyear iv= new EEEIIndyear();
iv.get();
iv.disp();
iv.get4();
iv.disp4();
iv.get6();
iv.disp6();
ECE ec= new ECE();
ec.get();
ec.disp();
ec.get7();
ec.disp7();
ECEIstyear v= new ECEIstyear();
v.get();
v.disp();
v.get7();
v.disp7();
v.get8();
v.disp8();
ECEIIndyear vi= new ECEIIndyear();
vi.get();
vi.disp();
vi.get7();
vi.disp7();
vi.get9();
vi.disp9();
IT t= new IT();
t.get();
t.disp();
t.get10();
t.disp10();
ITIstyear vii= new ITIstyear();
vii.get();
vii.disp();
vii.get10();
vii.disp10();
vii.get11();
vii.disp11();
ITIIndyear viii= new ITIIndyear();
viii.get();
viii.disp();
viii.get10();
viii.disp10();
viii.get12();
viii.disp12();
}
}





































