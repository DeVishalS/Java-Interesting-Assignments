import java.io.*;
class CopyAllto1
{  public static void main(String args[]) throws IOException
   {
      if(args.length<2)
      { System.out.println(" No of Arguments atleast 2");
        System.exit(0);
      }
      for(int i=0;i<(args.length-1);i++)
      {   
           File f1=new File(args[i]);
          if(!f1.exists())
          { System.out.println("any of source file doesnot exist"); System.exit(0);}
       }
   FileOutputStream fos=new FileOutputStream(args[args.length-1],true);
      for(int i=0;i<args.length-1;i++)
      {    
       FileInputStream fis=new FileInputStream(args[i]);   
       int ch;
       while((ch=fis.read())!=-1)
       fos.write(ch);
      fis.close();
       }
   fos.close();
     }}   
     