import java.io.*;
interface Drawable
{  
void draw();  
}  
//Implementation: by second user  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
class Circle implements Drawable{  
public void draw(){System.out.println("drawing circle");}  
}  
//Using interface: by third user  
class chane{  
public static void main(String args[]){  
Drawable d;
Rectangle r=new Rectangle();;
Circle c= new Circle();
d=r;
d.draw();
d=c;
d.draw();
}}  