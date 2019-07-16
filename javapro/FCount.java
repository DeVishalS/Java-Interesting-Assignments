import java.io.*;
import java.util.*;
class FCount
{
 public static void main(String args[]) throws Exception
 {
    Console con=System.console();
    System.out.println("Enter the file with complete path");
    StreamTokenizer st=new StreamTokenizer(new FileInputStream(con.readLine()));
    HashSet set=new HashSet();
    HashMap map=new HashMap();
    while(st.nextToken()!=StreamTokenizer.TT_EOF) 
    {
       if(st.ttype==StreamTokenizer.TT_WORD)
       {  
          if(set.add(st.sval))
          {  
            map.put(st.sval,1); 
          }
          else
          {  int i=(Integer)map.get(st.sval);
              i++;
             map.put(st.sval,i); 
          }
       }
    }
  Set set1=map.keySet(); String str;
  Iterator iter=set1.iterator();
   while(iter.hasNext())
    {  str=(String)iter.next();   System.out.printf("%-25s",str);System.out.println(" "+(Integer)map.get(str));
     } 
  }
}  
     
       
