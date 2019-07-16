import java.io.*;
class FileMerger
{ 
 public static void main(String args[]) throws IOException
 {
      Console con=System.console();
     String fl;
     System.out.print("Enter the file name to be retrived:");
      fl=con.readLine();     
      FileInputStream fis=new FileInputStream(1+""+"."+fl);
      int ch,i;
      FileOutputStream fos=new FileOutputStream("Retrivedfileof"+fl);
      File f;
     for(i=1,f=new File(i+""+"."+fl);f.exists();i++,f=new File(i+""+"."+fl))
      { fis=new FileInputStream(f);
        while((ch=fis.read())!=-1)
        fos.write(ch);
      }
fos.close();
fis.close();
}
}