import java.io.*;
class Dvd implements Item
{ Console con=System.console();
   private String title;
   private String director;
   private String  category;
   public void read()
   {
     System.out.println("Enter dvd title");
      title=con.readLine();
     System.out.println("Enter Director");
      director=con.readLine();
     System.out.println("Enter category");
      category=con.readLine();   
   }
    public void show()
   {
    System.out.println(" Dvd: "+title+"  Director: "+director+" Category: "+category);
   }
}  