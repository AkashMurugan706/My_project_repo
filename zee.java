import java.io.*;
class zee
{
public static void main(String args[])throws  IOException
{
int a[][]= new int[2][2];
int c[][]= new int[2][2];
int c1[][]= new int[2][2];
int i,j;
System.out.println("Enter matrix a");
DataInputStream d= new DataInputStream(System.in);
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
a[i][j]=Integer.parseInt(d.readLine());
}
}
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
c[i][j]=a[j][i];
}
}
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
c1[i][j]=a[j][i]*5;
}
}
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.println(+c[i][j]);
}
}
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.println(+c1[i][j]);
}
}
}
}
