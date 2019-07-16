
import java.io.*;
class HorizHisto
{
   public static void main(String args[])
   {
     int n;
     Console con=System.console();
 System.out.print("Enter the no of elements in array:");   
n=Integer.parseInt(con.readLine());
int a[]=new int[n];
System.out.print("Enter"+n+" Elements");
for(int i=0;i<a.length;i++)
a[i]=Integer.parseInt(con.readLine());
for(int i=0;i<a.length;i++)
 {for(int j=0;j<a[i];j++)
   System.out.print(" * ");
  System.out.println();}
 }
}