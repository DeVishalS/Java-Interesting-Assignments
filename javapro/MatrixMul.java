
import java.io.*;
class MatrixMul
{
   public static void main(String args[])
   {
     Console con=System.console();
	int a[][]=new int[3][3];int b[][]=new int[3][3];
 	System.out.print("Enter 9 elements of array1:");   
    	for(int i=0;i<a.length;i++)
        	    for(int j=0;j<a[i].length;j++)
          	        a[i][j]=Integer.parseInt(con.readLine());
	System.out.print("Enter 9 elements of array2:");   
    	for(int i=0;i<b.length;i++)
        	      for(int j=0;j<b[i].length;j++)
          	        b[i][j]=Integer.parseInt(con.readLine());

for(int i=0;i<a.length;i++)
 {
   for(int j=0;j<b[i].length;j++)
    {  int s=0;
       for(int k=0;k<a[i].length;k++)
        { 
         s+=a[i][k]*b[k][j];
        }
     System.out.print(" "+s);
    }
       System.out.println();
  }
 }

}