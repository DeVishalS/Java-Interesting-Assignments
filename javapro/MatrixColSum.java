
import java.io.*;
class MatrixColSum
{
   public static void main(String args[])
   {
     Console con=System.console();
	int a[][]=new int[3][3];
 	System.out.print("Enter 9 elements of array1:");   
    	for(int i=0;i<a.length;i++)
        	    for(int j=0;j<a[i].length;j++)
          	        a[i][j]=Integer.parseInt(con.readLine());
	
for(int i=0;i<a.length;i++)
 { int s=0;
   for(int j=0;j<a[i].length;j++)
    s+=a[j][i];
   System.out.print(" "+s);
}
 
    
 }

}