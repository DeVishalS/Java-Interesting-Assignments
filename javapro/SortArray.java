
import java.io.*;
class SortArray
{
  public static void main(String args[])
  {
    int n,temp;
    Console con=System.console();
    System.out.println("Enter the no of elements of the array:");
     n=Integer.parseInt(con.readLine());
     int []a=new int[n];
     System.out.println("Enter "+n+" Elements of the array");
      for(int i=0;i<a.length;i++)
      a[i]=Integer.parseInt(con.readLine());
      for(int i=0;i<a.length;i++)
           for(int j=i+1;j<a.length;j++)
            if(a[i]>a[j])
               { temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
               }
      System.out.print(" Sorted Array:");
     for(int ele:a)  
    System.out.print(" "+ele); 
    }
}