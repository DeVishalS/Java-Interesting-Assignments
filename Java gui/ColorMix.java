import java.awt.*;
import java.awt.event.*;
class ColorMix implements AdjustmentListener
{
 Frame f; Scrollbar sb1,sb2,sb3;Label lr,lg,lb;TextField tr,tg,tb;Panel p,p1,p2;
 public ColorMix()
 {
 f=new Frame(" Flash Editor ");
 f.setSize(400,300);
 p=new Panel(); 
 p.setLayout(new GridLayout(1,3,2,2));
 sb1=new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);    sb1.setBackground(Color.red);  p.add(sb1);sb1.addAdjustmentListener(this);
 sb2=new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);   sb2.setBackground(Color.green); p.add(sb2);sb2.addAdjustmentListener(this);
 sb3=new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);   sb3.setBackground(Color.blue);  p.add(sb3);sb3.addAdjustmentListener(this);
f.add(p,"East");

 
 p1=new Panel();
 p1.setLayout(new GridLayout(1,4));
lr=new Label("Red");lg=new Label("Green");lb=new Label("Blue");
tr=new TextField(0+"",5);tg=new TextField(0+"",5);tb=new TextField(0+"",5);
p1.add(lr);p1.add(tr);p1.add(lg);p1.add(tg);p1.add(lb);p1.add(tb);
f.add(p1,"South"); 

p2=new Panel();p2.setBackground(new Color(0,0,0));
f.add(p2);

f.setVisible(true);
}
public  void adjustmentValueChanged(AdjustmentEvent e)
{  int v1=sb1.getValue(),v2=sb2.getValue(),v3=sb3.getValue();p2.setBackground(new Color(v1,v2,v3));
       tr.setText(v1+"");tg.setText(v2+"");tb.setText(v3+"");  
}
public static void main(String args[])
{ColorMix cm=new ColorMix();
}
}