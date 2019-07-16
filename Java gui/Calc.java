import java.awt.*;
class Calc
{
  public static void main(String args[])
  {
    Frame f=new Frame("CalC");
    f.setSize(250,250);
    
     TextField t=new TextField();
     f.add(t,"North");
     
    String arr[]={"1","2","3","+","4","5","6","-","7","8","9","*","C","0","/","="};
     Panel p=new Panel();
     p.setLayout(new GridLayout(4,4,2,2));
     for(String s:arr)
     p.add(new Button(s));
     f.add(p);
 
     f.setVisible(true);
}
}