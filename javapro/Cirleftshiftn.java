import java.io.*;
class Cirleftshiftn
{
 public static void main(String args[])
 {
    int n,t,i,j;
    int arr[]=new int[10];
     Console con=System.console();
     
     System.out.print("Enter the value of n: ");
      n=Integer.parseInt(con.readLine());
     
     System.out.println("Enter values of the array");
     for(i=0;i<arr.length;i++)
     arr[i]=Integer.parseInt(con.readLine());
      
      System.out.println("Array before shifting:");
       for(i=0;i<arr.length;i++)
       System.out.print(arr[i]+" ");   
     
     for(i=0;i<n;i++)
     {  t=arr[0];
        for(j=1;j<arr.length;j++)
        arr[j-1]=arr[j];
        arr[j-1]=t;
     }

       System.out.println("\nArray after Circular Left Shifting of elements by "+n);
       for(i=0;i<arr.length;i++)
       System.out.print(arr[i]+" ");
  }
}
      