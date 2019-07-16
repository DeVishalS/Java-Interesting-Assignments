import java.util.*;
class MyStack
{ 
  Vector v;
  public MyStack()
  {
   v=new Vector(); v.add(null); 
  }
  public void pushs(Object o)
  {
   v.add(1,o);
  }
  public Object pops()
  {
    if(empty())
    throw new UnderFlowException("MyStack is Empty");
     else
     {
      Object oo=v.get(1);
      v.remove(1);
      return oo;
     }
  }
 public boolean empty()
  {
  return (v.size()==1)?true:false;
  }
}
 