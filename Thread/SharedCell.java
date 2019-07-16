class HoldInteger 
{
 private int sharedInt;
 private boolean empty=true;
 synchronized public void setSharedInt(int value)
 {
  while(!empty) 
  { try{wait();}catch(InterruptedException e1){System.out.println(e1.getMessage());}}
  sharedInt=value;
  empty=false;
  notify();
 }
synchronized public int getSharedInt()
{  while(empty)
   {
     try{wait();}
    catch(InterruptedException e2){System.out.println(e2.getMessage());}
   }
  empty=true;
  notify();
  return sharedInt;
  }
}
class Producer extends Thread
{
 private HoldInteger pHold;
 public Producer(HoldInteger h){pHold=h;}
 public void run()
 {
   for(int count=1;count<=10;count++)
   { 
     pHold.setSharedInt(count);
     System.out.println("Producer Assisgned -> "+count);
     try{sleep((int)(Math.random()*1000));}catch(InterruptedException e){System.out.println(e.getMessage());}
    }
 }
}
class Consumer extends Thread
{ HoldInteger cHold;
  public Consumer(HoldInteger h)
  {cHold=h;}
  public void run()
  {
    int value;
   value=cHold.getSharedInt();
   System.out.println("consumer got <-"+value);
    while(value!=10)
   {
    try{sleep((int)(Math.random()*1000));}catch(InterruptedException e){System.out.println(e.getMessage());} 
    value=cHold.getSharedInt();System.out.println("consumer got <-"+value);
   }
 }
}
public class SharedCell
{
 public static void main(String args[])
 {
 HoldInteger h=new HoldInteger();
 Producer p=new Producer(h);
 Consumer c=new Consumer(h);
 p.start();c.start();
 }
}
