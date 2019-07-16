import java.awt.*;
class Scroll3
{
 public static void main(String args[])
 {
   Frame f=new Frame(" Flash Editor ");
   f.setSize(400,300);
   Panel p=new Panel();p.setBackground(Color.black);
   p.setLayout(new GridLayout(1,3,2,2));
   Scrollbar sb1=new Scrollbar();p.add(sb1);sb1.setBackground(Color.magenta);
   Scrollbar sb2=new Scrollbar();p.add(sb2);sb2.setBackground(Color.magenta);
   Scrollbar sb3=new Scrollbar();p.add(sb3);sb3.setBackground(Color.magenta);
   
f.add(p,"East");
f.setVisible(true);
}
}
