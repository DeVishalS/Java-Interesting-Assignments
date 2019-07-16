import java.awt.*;
import java.awt.event.*;
class DrawMotion implements MouseMotionListener
{ Frame f;Canvas c;
   public DrawMotion()
   {  f=new Frame();f.setLayout(new GridLayout());
      f.setSize(500,400);
     c=new Canvas();c.addMouseMotionListener(this);
     f.add(c);
f.setVisible(true);
}
public void mouseMoved(MouseEvent e)
{ int x1,y1;
  x1=e.getX();y1=e.getY();
  Graphics g=c.getGraphics();
   g.setColor(Color.red);g.drawLine(x1,y1,x1,y1);
}
public void mouseDragged(MouseEvent e1)
{}
public static void main(String args[])
{
DrawMotion d=new DrawMotion();
}
}
 