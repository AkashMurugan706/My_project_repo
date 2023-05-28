import java.io.*;
class Address
 {  
String city,state,country;  
public Address(String city, String state, String country)
{
    this.city = city;  
    this.state = state;  
    this.country = country;  
}  
}
class add extends Address
{
  int id;  
String name;  
public add(String city, String state, String country,int id, String name) 
{  
super(city,state,country);
    this.id = id;  
    this.name = name;  
  
}  
  
void display(){  
System.out.println();  
System.out.println(id+" "+name+" "+city+" "+state+" "+country);  
}  
}
class superpgm
{
public static void main(String[] args) 
{  
add e= new add("chennai","Tamil nadu","India",22,"Akash");
 e.display();  
}  
}    