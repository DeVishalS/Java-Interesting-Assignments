import java.util.*;
import java.awt.*;
import java.awt.event.*;
class CalcOp1 implements ActionListener
{Frame f;           TextField t;         Panel p;        Button b[];     Vector opnd,oper;     String n;
    public CalcOp1()
    {
    Frame f=new Frame("CalC"); opnd=new Vector();oper=new Vector(); f.setSize(250,250);
    n="";
     t=new TextField(20);
     f.add(t,"North");
     String arr[]={"1","2","3","+","4","5","6","-","7","8","9","*","C","0","/","="};
     b=new Button[16];
      Panel p=new Panel();
      p.setLayout(new GridLayout(4,4,2,2));

for(int i=0;i<16;i++)
{ b[i]=new Button(arr[i]);b[i].addActionListener(this);p.add(b[i]);}
  
f.add(p); 
     f.setVisible(true);
}

public void actionPerformed(ActionEvent e)                                                                     //12*6/3+5*7-8
{ String s=e.getActionCommand();
   if(s.equals("C"))
   {   t.setText("");     oper.clear();    opnd.clear(); }
  else if(s.equals("="))
   { opnd.add(n); n=""; result();} 
  else
   {  t.setText(t.getText()+s);
       if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"))
      { opnd.add(n);  n="";   oper.add(s); }
      else
      {  n=n+s;}
    } 
}
public void result()
{int i,result=0;int a,b; 
 while(oper.indexOf("*")!=-1)
 {  i=oper.indexOf("*");a=Integer.parseInt(opnd.elementAt(i)+"");
     b=Integer.parseInt(opnd.elementAt(i+1)+"");
    result=a*b;    oper.remove(i);opnd.set(i,result+"");opnd.set(i,result);opnd.remove(i+1);
 }
while(oper.indexOf("/")!=-1)
 { i=oper.indexOf("/");a=Integer.parseInt(opnd.elementAt(i)+"");
     b=Integer.parseInt(opnd.elementAt(i+1)+"");
    result=a/b;    oper.remove(i);opnd.set(i,result+"");opnd.set(i,result);opnd.remove(i+1);
}
  while(oper.indexOf("+")!=-1)
  {  i=oper.indexOf("+");a=Integer.parseInt(opnd.elementAt(i));
     b=Integer.parseInt(opnd.elementAt(i+1)+"");
    result=a+b;    oper.remove(i);opnd.set(i,result+"");opnd.set(i,result);opnd.remove(i+1);
}
while(oper.indexOf("-")!=-1)
 {  i=oper.indexOf("-");a=Integer.parseInt(opnd.elementAt(i)+"");
     b=Integer.parseInt(opnd.elementAt(i+1)+"");
    result=a-b;    oper.remove(i);opnd.set(i,result+"");opnd.set(i,result);opnd.remove(i+1);
}
t.setText(opnd.elementAt(0)+"");
}
public static void main(String args[])
{  CalcOp1 co=new CalcOp1();
}
}