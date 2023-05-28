import java.io.*;
class Base  
{  
    void method(int a)  
    {  
        System.out.println("Base class method called with integer a = "+a);  
    }  
       
    void method(double d)  
    {  
        System.out.println("Base class method called with double d ="+d);  
    }  
}  
   
class Derived extends Base  
{  
    //@Override  
    void method(double d)  
    {  
        System.out.println("Derived class method called with double d ="+d);  
    }  
}  
    class overr
{      
    public static void main(String[] args)  
    {  
        Derived d= new Derived();
        d.method(10);
d.method(22.7);
    }  
}  