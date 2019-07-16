import java.util.*;
import java.awt.*;
import java.awt.event.*;
class Calc1 extends WindowAdapter implements ActionListener 
{Frame f;      TextField t;       Panel p;       Button b[];        boolean f1,f2,f3;       String n;        Vector<Float> opnd;Vector <String>oper;
    public Calc1()
    {
    Frame f=new Frame("CalC");
    f.setSize(250,250);
    f1=false;f2=false;
     t=new TextField(20);
     f.add(t,"North");
     String arr[]={"1","2","3","+","4","5","6","-","7","8","9","*","C","0","/","="};
     b=new Button[16];
      Panel p=new Panel();
      p.setLayout(new GridLayout(4,4,2,2));
n="";oper=new Vector<String>();opnd= new Vector<Float>();f1=false;f2=false;f3=false;
for(int i=0;i<16;i++)
{ b[i]=new Button(arr[i]);b[i].addActionListener(this);p.add(b[i]);} 
  f.addWindowListener(this);
f.add(p); 
     f.setVisible(true);
}

public void actionPerformed(ActionEvent e)
{ String s=e.getActionCommand(),s1;boolean no=(s.charAt(0)>='0' && s.charAt(0)<='9');
if(!f1)
{  if(no)
    {f1=true; t.setText(s); n=n+s;}
}
else
{
    if(no)
    {    f2=false;if(f3){t.setText("");n="";opnd.clear();f3=false; }t.setText(t.getText()+s);n=n+s;}
    else if(s.charAt(0)>='*'&&s.charAt(0)<='/')
    {  if(f2){ oper.remove(oper.size()-1);s1=t.getText(); t.setText(s1.substring(0,s1.length()-1)+s);}else {opnd.add(Float.parseFloat(n));n="";t.setText(t.getText()+s); f2=true;if(f3)f3=false;}     oper.add(s);}
else if(s.charAt(0)=='=')
{  opnd.add(Float.parseFloat(n));n="";result();}
else
{  oper.clear(); opnd.clear();f1=f2=f3=false;n="";t.setText(""); }
} 
}
public void result()
{ Float result=0.0f;int i=0;String r; 
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
r=opnd.elementAt(0)+"";n=n+r;oper.clear();opnd.clear();
t.setText(r);f3=true;    
}
public void windowClosing(WindowEvent e)
{
Window w=e.getWindow();
w.setVisible(false);
w.dispose();
System.exit(1);
}
public static void main(String args[])
{  Calc1 co=new Calc1();
}
}