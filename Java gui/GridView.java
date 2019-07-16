import java.awt.*;
class GridView
{
 public static void main(String args[])
 {
  Frame f=new Frame("GridView");
  f.setSize(400,300);
  f.setLayout(new GridLayout(2,2));
   
  Panel p1=new Panel(); p1.setBackground(Color.red);
  p1.setLayout(new GridLayout(2,1));
  p1.add(new Label("1"));
  p1.add(new Label("2"));
  f.add(p1);
  
  Panel p2=new Panel(); p2.setBackground(Color.blue);
  p2.setLayout(new GridLayout(1,3));
  p2.add(new Label("3"));
  p2.add(new Label("4"));
  p2.add(new Label("5"));
  f.add(p2);

  Panel p3=new Panel(); 
  p3.setLayout(new GridLayout(1,2));
       Panel p4=new Panel();p4.setLayout(new GridLayout(2,1));p4.setBackground(Color.pink);
               p4.add(new Label("6"));p4.add(new Label("7"));
  p3.add(p4);
         Panel p5=new Panel();p5.setLayout(new GridLayout(3,1));p5.setBackground(Color.green);
               p5.add(new Label("8"));p5.add(new Label("9"));p5.add(new Label("10"));
 p3.add(p5); 
 f.add(p3);

Panel p6=new Panel();
p6.setLayout(new GridLayout(2,1));
     Panel p7=new Panel();p7.setLayout(new GridLayout(1,2));p7.setBackground(Color.yellow);
             p7.add(new Label("11"));p7.add(new Label("12"));
 p6.add(p7);
      Panel p8=new Panel();p8.setLayout(new GridLayout(1,3));
             p8.add(new Label("13"));p8.add(new Label("14"));p8.add(new Label("15"));p3.setBackground(Color.cyan);
  p6.add(p8);
 f.add(p6);
  f.setVisible(true);
}
}
                   