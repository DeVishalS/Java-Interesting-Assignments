import java.util.*;
import java.awt.*;
import java.awt.event.*;
class CalcOp2 implements ActionListener
{   Frame f;      int fl=0;     TextField t;         Panel p;        Button b[];     Vector<Float> opnd;Vector <String>oper;     String exp,r;
    public CalcOp2()
    {
    Frame f=new Frame("CalC"); opnd=new Vector<Float>();oper=new Vector<String>(); f.setSize(250,250);
    exp="";
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
    try{if(s.equals("C"))
    { fl=0;  t.setText("");     oper.clear();    opnd.clear();}
    else if(s.equals("="))
   {  opnd.add(Float.parseFloat(exp)); exp=""; result();} 
    else 
   {  
       if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"))
      { if(fl==1){exp=r;fl=0;}t.setText(t.getText()+s);opnd.add(Float.parseFloat(exp)); exp="";   oper.add(s); }
      else
      {  if(fl==1){exp=""+s;t.setText("");t.setText(s);fl=0;}else {exp=exp+s;t.setText(t.getText()+s);}}
    } }
    catch(NumberFormatException n)
    {}
}
public void result()
{ Float result=0.0f;int i=0; 
  while(oper.indexOf("*")!=-1)
 {  i=oper.indexOf("*");
     result=opnd.elementAt(i)*opnd.elementAt(i+1);
     oper.remove(i);opnd.set(i,result);opnd.set(i,result);opnd.remove(i+1);
 }
while(oper.indexOf("/")!=-1)
 { i=oper.indexOf("/");result=opnd.elementAt(i)/opnd.elementAt(i+1);
    oper.remove(i);opnd.set(i,result);opnd.set(i,result);opnd.remove(i+1);
}
  while(oper.indexOf("+")!=-1)
  {  i=oper.indexOf("+");result=opnd.elementAt(i)+opnd.elementAt(i+1);
    oper.remove(i);opnd.set(i,result);opnd.set(i,result);opnd.remove(i+1);
}
while(oper.indexOf("-")!=-1)
 {  i=oper.indexOf("-");result=opnd.elementAt(i)-opnd.elementAt(i+1);
     oper.remove(i);opnd.set(i,result);opnd.set(i,result);opnd.remove(i+1);
}
r=opnd.elementAt(0)+"";
t.setText(r);fl=1;
oper.clear();    opnd.clear();    
}
public static void main(String args[])
{  
CalcOp2 co=new CalcOp2();
}
}