import java.awt.*;
import java.awt.event.*;
class LinesMouseR implements MouseMotionListener
{ Frame f;
   public LinesMouseR()
   {  f=new Frame();
      f.setSize(500,400);f.addMouseMotionListener(this);
    f.setVisible(true);
}
public void mouseMoved(MouseEvent e)
{  int x1,y1,x,y;
  Dimension d=f.getSize();
   x1=e.getX();y1=e.getY();  
   Graphics g=f.getGraphics();   
   g.setColor(Color.red);g.drawLine(0,0,x1,y1);
    g.setColor(Color.green);g.drawLine(d.width,0,x1,y1);
     g.setColor(Color.blue);g.drawLine(0,d.height,x1,y1);
    g.setColor(Color.yellow);g.drawLine(d.width,d.height,x1,y1);
}
public void mouseDragged(MouseEvent e1)
{}
public static void main(String args[])
{
LinesMouseR lm=new LinesMouseR();
}
}
 