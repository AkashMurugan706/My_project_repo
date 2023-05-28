import java.io.*;
class Adder{  
static int add(int a,int b)
{
return a+b;
}  
 static double add1(int a,int b)
{
return a+b;
} 
}  
class testover
{  
public static void main(String[] args)
{  
System.out.println(Adder.add(11,11));//ambiguity  
System.out.println(Adder.add1(11,11));
}
}  
