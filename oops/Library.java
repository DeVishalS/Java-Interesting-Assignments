import java.io.*;
class Library
{
 public static void main(String args[])
 { Console con=System.console();
   Item I[]=new Item[10];
  String s;
   for(int j=0;j<I.length;j++)
   {
     System.out.print("Book or Dvd (b/d):");
     s=con.readLine();
     if(s.equals("b"))
          I[j]=new Book();
     else
          I[j]=new Dvd();
        
        I[j].read();
       System.out.println();
   
     }
  System.out.println("List of Items:");
   for(int j=0;j<I.length;j++)
   {
     I[j].show();
    }
 }
}
        
 