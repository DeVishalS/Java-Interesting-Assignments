import java.io.*;
class Copy2to1
{  public static void main(String args[]) throws IOException
   {
     if(args.length!=3)
     { System.out.println(" No of Arguments must Be 3");
        System.exit(0);
      }
      File f1=new File(args[0]);
      File f2=new File(args[1]);
      if(!f1.exists() && !f2.exists())
      { System.out.println("any of source file doesnot exist"); System.exit(0);}
     FileInputStream fis=new FileInputStream(args[0]);
     FileOutputStream fos=new FileOutputStream(args[2],true);
     int ch;
     while((ch=fis.read())!=-1)
       fos.write(ch);
      fis=new FileInputStream(args[1]);
        while((ch=fis.read())!=-1)
       fos.write(ch);
   fis.close();
   fos.close();
     }
}   
     