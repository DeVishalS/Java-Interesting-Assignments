import java.io.*;
class VertHisto
{
  public static void main(String args[])
  {  int a[],max=-1,i,j;
     a= new int[10];
     Console con=System.console();
     System.out.print("Enter the array elements:");
      for(i=0;i<a.length;i++)
      {a[i]=Integer.parseInt(con.readLine());
        if(max<a[i])
         max=a[i];
      }
      for(i=0;i<max;i++) 
        {  for(j=0;j<a.length;j++)
           {  if(max>a[j]+i)
             System.out.print("   ");
             else  
             System.out.print(" * ");
           }
             System.out.println();       
         }
  }
}       
     