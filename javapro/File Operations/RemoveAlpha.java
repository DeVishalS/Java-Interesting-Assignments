import java.io.*;
class RemoveAlpha
{  public static void main(String args[]) throws IOException
   {
     if(args.length!=1)
     { System.out.println(" No of Arguments must Be 1");
        System.exit(0);
      }
      File f1=new File(args[0]);
      File f2=new File(f1.getParent(),"temp.txt");
      if(!f1.exists())
      { System.out.println("file doesnot exist"); System.exit(0);}
     FileInputStream fis=new FileInputStream(args[0]);
     FileOutputStream fos=new FileOutputStream(f2);
     int ch;
     while((ch=fis.read())!=-1)
       {  if(!((ch>=97 && ch<=122) || (ch>=65 && ch<=90))) 
           fos.write(ch);
       }
 fis.close();
fos.close();      
     System.out.println(f1.delete());
     System.out.println(f2.renameTo(f1));
     }
}   
     