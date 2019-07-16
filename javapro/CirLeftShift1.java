import java.io.*;
class CirLeftShift1
{
    public static void main(String args[])
    {
       int n,i,j,temp;
    Console con=System.console();
    System.out.println("Enter the no of elements of the array:");
     n=Integer.parseInt(con.readLine());
     int []a=new int[n];
     System.out.println("Enter "+n+" Elements of the array");
      for(i=0;i<a.length;i++)
      a[i]=Integer.parseInt(con.readLine());
 temp=a[0];    
for(i=1;i<a.length;i++)
       { a[i-1]=a[i];}
          a[i-1]=temp;
  System.out.print("Shifted Array");
     for(int ele:a)  
    System.out.print(" "+ele); 
   }
} 
