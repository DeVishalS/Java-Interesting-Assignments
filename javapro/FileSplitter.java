import java.io.*;
class FileSplitter
{
 public static void main(String args[]) throws IOException
 {
      Console con=System.console();
      
       int s,nf;
     
      String fl;
     
      System.out.print("Enter the file name:");
      fl=con.readLine();     
      File f=new File(fl);
      if(!f.exists())
      {
       System.out.print("Source File doesnot  exists");
       System.exit(0);
      }
     
      System.out.print("Enter Destination file size:");
      s=Integer.parseInt(con.readLine());
float ff=(float)f.length()/s;
      nf=(int)Math.ceil(ff);System.out.print("Files"+nf);
      FileInputStream fis=new FileInputStream(fl);
      
      int ch;
      FileOutputStream fos=new FileOutputStream(1+""+"."+fl);;
     o:for(int i=1;i<=nf;i++)
     { 
       fos=new FileOutputStream(i+""+"."+fl);
       for(int j=1;j<=s;j++)
       {
          if((ch=fis.read())==-1)
          {break o;}
          fos.write(ch);
       }
      }
fis.close();
fos.close();
}
}