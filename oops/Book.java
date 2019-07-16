import java.io.*;
class Book implements Item
{ Console con=System.console();
   private String title;
   private String author;
   private String publication;
   public void read()
   {
     System.out.println("Enter book title");
      title=con.readLine();
     System.out.println("Enter Author");
      author=con.readLine();
     System.out.println("Enter publication");
      publication=con.readLine();   
   }
    public void show()
   {
    System.out.println("Book: "+title+"  Author: "+author+" publication: "+publication);
   }
}  