import java.io.*;
class LeftShiftn
{
    public static void main(String args[])
    {
       int n,i,ns;
    Console con=System.console();
    System.out.println("Enter the no of elements of the array:");
     n=Integer.parseInt(con.readLine());
     int []a=new int[n];
System.out.println("Enter the no by which the array should be shifted:");
     ns=Integer.parseInt(con.readLine());
    
     System.out.println("Enter "+n+" Elements of the array");
      for(i=0;i<a.length;i++)
      a[i]=Integer.parseInt(con.readLine());
       for(int j=0;j<ns;j++)
       {  for(i=1;i<a.length;i++)
            { a[i-1]=a[i];}
          a[i-1]=0;}
  System.out.print("Shifted Array");
     for(int ele:a)  
    System.out.print(" "+ele); 
   }
} 
