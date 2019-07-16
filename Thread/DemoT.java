class One extends Thread
{
public void run(){
  for(int i=1;i<=10;i++)
  System.out.println("1st");
}
}
class Two extends Thread
{
 public void run(){
  for(int i=1;i<=10;i++) 
  System.out.println("2nd");
 }
}
class Three extends Thread
{ 
 public void run(){
  for(int i=1;i<=10;i++)
  System.out.println("3rd");
}
}
public class DemoT
{
  public static void main(String args[])
 {
  One o=new One();o.start();
  Two t=new Two();t.start();
  Three th=new Three();th.start();
   for(int i=1;i<=10;i++)
    System.out.println("Main");
  }
}