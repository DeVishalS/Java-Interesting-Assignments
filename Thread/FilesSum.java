import java.io.*;
public class FilesSum
{
 public static void main(String args[])
 {
   float total=0;
   File f=new File(args[0]);
   File fl[]=f.listFiles(new FileFilter(){
				public boolean accept(File f){return (f.isFile()?true:false);}
		                            });
   Adder a[]=new Adder[fl.length];
   for(int i=0;i<fl.length;i++)
   { 
    a[i]=new Adder(fl[i]);
    a[i].start(); 
   }
  try{
  for(Adder aa:a)
  aa.join();
  }catch(InterruptedException e){System.out.print(e.getMessage());}
  for(Adder at:a)
  total+=at.getSum();
  System.out.println("Sum of all files: "+total); 
  
try{DataOutputStream dos=new DataOutputStream(new FileOutputStream(args[0]+"/result.text"));
 dos.writeFloat(total);}catch(FileNotFoundException e){System.out.print(e.getMessage());}
        catch(IOException e1){System.out.print(e1.getMessage());} 
 }
}
 class Adder extends Thread
{float sum=0;File f;
 public Adder(File fn)
 {f=fn;}
 public void run()
{
  String s;
  try{
        DataInputStream dis=new DataInputStream(new FileInputStream(f));
        while((s=dis.readLine())!=null)
        sum+=Float.parseFloat(s);
         dis.close();
      }catch(FileNotFoundException e){System.out.print(e.getMessage());}
        catch(IOException e1){System.out.print(e1.getMessage());}
}
public float getSum(){return sum;}
}