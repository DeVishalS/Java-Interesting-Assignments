import java.util.*;
import java.awt.*;
import java.awt.event.*;
class CalcOp implements ActionListener
{Frame f;TextField t;Panel p;Button b[];    
    public CalcOp()
    {
    Frame f=new Frame("CalC");
    f.setSize(250,250);
    
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

public void actionPerformed(ActionEvent e)
{  
}
public static void main(String args[])
{  CalcOp co=new CalcOp();
}
}