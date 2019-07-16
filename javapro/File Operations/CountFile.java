import java.io.*;
class CountFile
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
     int ch,c,l=1,w=0,s=0,f=0;
while((ch=fis.read())==32);
do
{  
   if(ch!=32)
   { fos.write(ch);f=0;}
   else if(f==0)
  {fos.write(ch);f=1;}
  c=ch;
}while((ch=fis.read())!=-1);
    fis=new FileInputStream(f2);
    while((ch=fis.read())!=-1){
      if(ch==10)
      l++;
      else if(ch==32)
      w++;
    else if(ch==46)
   s++;
}
 if(c==32)
 w--;
System.out.println("Words :"+w+"    Lines :"+l+"    Sentences :"+s);         
 fis.close();
 fos.close();      
     System.out.println(f2.delete());
     //System.out.println(f2.renameTo(f1));
     }
}   
     