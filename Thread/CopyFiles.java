import java.io.*;
import java.util.*;
class VHolder
{ Vector v=new Vector();boolean empty=true,done=false;
  synchronized public void putChar(Integer ch)
  { 
   v.add(ch);
   empty=false;
   notify();
  }
 synchronized public int getChar()
 {
    while(empty)
    {  try{wait();}catch(InterruptedException e){System.out.println(e.getMessage());}}
    int ch=(Integer)v.remove(0);if(v.size()==0)empty=true;
    return ch; 
 }
}
 class Reader extends Thread
{File f;VHolder vr;
 public Reader(File fn,VHolder v)
{f=fn;vr=v;
}
public void run()
{int ch;
    try{
           FileInputStream fis=new FileInputStream(f);
            while((ch=fis.read())!=-1)
            { vr.putChar(ch);
            }
              vr.putChar(ch); fis.close();
          }catch(FileNotFoundException e){System.out.print(e.getMessage());}
            catch(IOException e1){System.out.print(e1.getMessage());}
}
}
class Writer extends Thread
{File f;VHolder vw;
 public Writer(File fn,VHolder v)
{f=fn;vw=v;
}
public void run()
{
try{int cw;
           FileOutputStream fos=new FileOutputStream(f.getParent()+"/copy-"+f.getName());
           while((cw=vw.getChar())!=-1)
            fos.write(cw);
           fos.close();
          }catch(FileNotFoundException e){System.out.print(e.getMessage());}
            catch(IOException e1){System.out.print(e1.getMessage());}

} 
}
public class CopyFiles
{
public static void main(String args[])
{File ff=new File(args[0]);
  File fl[]=ff.listFiles(new FileFilter(){
				public boolean accept(File f){return (f.isFile()?true:false);}
		                            });
  System.out.println("No of files"+fl.length);
  for(int i=0;i<fl.length;i++)
  {VHolder v=new VHolder();new Reader(fl[i],v).start();new Writer(fl[i],v).start();}
}
}
