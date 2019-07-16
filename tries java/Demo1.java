//import java.awt.*;
import javax.swing.*;
class Demo1
{
 public static void main(String args[])
 {
   JFrame f=new JFrame();
    f.setSize(400,300);
    f.setLayout(new  GraphicsConfiguration());
    JLabel l=new JLabel("name");
    f.add(l);
    JTextField t=new JTextField(20);
     f.add(t);
     JButton b1=new JButton("Submit");
     f.add(b1);
    f.setVisible(true);
   }
}