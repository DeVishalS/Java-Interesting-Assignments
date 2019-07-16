import java.io.*;
class UseMyStack
{
  public static void main(String args[])
  { Console con=System.console();
    MyStack ms=new MyStack();
    System.out.println("Enter 10 Stirng values");
     for(int i=0;i<10;i++)
      {
        ms.pushs(con.readLine());
      }
    System.out.println("10 String values in reverse");
    for(int i=0;i<10;i++)
      {
        System.out.println((String)ms.pops());
      }
  }
}

   