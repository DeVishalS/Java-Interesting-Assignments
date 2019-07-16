import java.io.*;
import java.util.*;
class FreqCount
{
  public static void main(String args[]) throws IOException
  {  Console con=System.console();
     System.out.print("Enter the file name");
     StreamTokenizer st=new StreamTokenizer(new FileInputStream(con.readLine()));
     HashMap map=new HashMap();
     Integer i1=1,i2;
     int c;
     while(st.nextToken()!=StreamTokenizer.TT_EOF)
     {    
           if(st.ttype==StreamTokenizer.TT_WORD)
          {  
             if(map.containsKey(st.sval))
               { c=(Integer)map.get(st.sval);
                 i2=++c;
                 map.put(st.sval,i2);
               }
             else
                map.put(st.sval,i1);
          }
     }
  Set set=map.keySet();String str;
  Iterator iter=set.iterator();
   while(iter.hasNext())
    {  str=(String)iter.next();   System.out.printf("%-25s",str);System.out.println(" "+(Integer)map.get(str));}
  }
}
           
         