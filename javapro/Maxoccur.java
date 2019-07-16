import java.io.*;
class Maxoccur
{
  public static void main(String args[])
 { 
Console con=System.console();
int n,max=-1,mc=1;
System.out.println("Enter the numbers: ");
     for( int i=0;i<10;i++)
     {
         n=Integer.parseInt(con.readLine());//(int)(Math.random()*1000);
      //System.out.print(" "+n+" "); 
      if(max<n)
       max=n;
     else if(max==n)
      mc++;
}
System.out.println("max: "+max+" with occurence: "+mc);
}
}
       
       
    
    
 