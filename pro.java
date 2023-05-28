import java.io.*;
class hospital
{
int age,phno,opnum,checkup,tabamt,injamt,docfee,total,scanamt,ICUamt,ICUdays,roomstatus,roomamt,roomdays,opramt;
String name,address,reason;
void get()throws IOException
{
 DataInputStream d= new DataInputStream(System.in);
 System.out.println("Enter name,age,phno,opnum,address");
 name=d.readLine();
 age=Integer.parseInt(d.readLine());
 phno=Integer.parseInt(d.readLine()); 
 opnum=Integer.parseInt(d.readLine());
 address=d.readLine();
  if(opnum==1)
   {
    System.out.println("Enter status");
    checkup=Integer.parseInt(d.readLine());
     if(checkup==1)
      {
       System.out.println("Enter reason,tabamt,injamt,docfee");
       reason=d.readLine();
       tabamt=Integer.parseInt(d.readLine());
       injamt=Integer.parseInt(d.readLine());
       docfee=Integer.parseInt(d.readLine());
       total=tabamt+injamt+docfee;
       System.out.println(+total);
      }
      else if(checkup==2)
      {
DataInputStream d1=new DataInputStream(System.in);
    //   System.out.println("Enter status");
       System.out.println("Enter scanamt,ICUamt,ICUdays,roomstatus,opramt,injamt,tabamt");
       scanamt=Integer.parseInt(d1.readLine());
       ICUamt=Integer.parseInt(d1.readLine());
       ICUdays=Integer.parseInt(d1.readLine());
       roomstatus=Integer.parseInt(d1.readLine());
         if(roomstatus==1)
         {
          System.out.println("roomamt,roomdays");
          roomamt=Integer.parseInt(d1.readLine());
          roomdays=Integer.parseInt(d1.readLine());
          } 
          else
          {
System.out.println("enter non ac roomamt and days");
            roomamt=Integer.parseInt(d.readLine());
            roomdays=Integer.parseInt(d.readLine()); 
           }
          opramt=Integer.parseInt(d.readLine());
          injamt=Integer.parseInt(d.readLine());
          tabamt=Integer.parseInt(d.readLine());
          total=scanamt+(ICUamt*ICUdays)+(roomamt*roomdays)+opramt+injamt+tabamt;
          System.out.println(+total);
          }
          else
          {
          System.out.println("vistor");
          }
     }
         else if(opnum==0)
          {
          System.out.println("Enter status");
          checkup=Integer.parseInt(d.readLine());
       if(checkup==1)
      {
       System.out.println("Enter reason,tabamt,injamt,docfee");
       reason=d.readLine();
       tabamt=Integer.parseInt(d.readLine());
       injamt=Integer.parseInt(d.readLine());
       docfee=Integer.parseInt(d.readLine());
       total=tabamt+injamt+docfee;
       System.out.println(+total);
      }
      else if(checkup==0)
      {
System.out.println("Enter status");
       System.out.println("Enter scanamt,ICUamt,ICUdays,roomstatus,opramt,injamt,injamt");
       scanamt=Integer.parseInt(d.readLine());
       ICUamt=Integer.parseInt(d.readLine());
       ICUdays=Integer.parseInt(d.readLine());
       roomstatus=Integer.parseInt(d.readLine());
         if(roomstatus==1)
         {
          System.out.println("roomamt,roomdays");
          roomamt=Integer.parseInt(d.readLine());
          roomdays=Integer.parseInt(d.readLine());
          } 
         else
          {
           System.out.println("enter non ac roomamt and days");
            roomamt=Integer.parseInt(d.readLine());
            roomdays=Integer.parseInt(d.readLine()); 
           }
          opramt=Integer.parseInt(d.readLine());
          injamt=Integer.parseInt(d.readLine());
          tabamt=Integer.parseInt(d.readLine());
          total=scanamt+(ICUamt*ICUdays)+(roomamt*roomdays)+opramt+injamt+tabamt;
          System.out.println(+total);
        }  }
          else
          {
          System.out.println("vistor");
          }
    }    }
        class pro
        {
        public static void main(String args[])throws IOException
        {
        hospital h= new hospital();
        h.get();
        }
}  