//import java.util.*;
//import java.io.*;
import java.awt.*;
import java.awt.event.*;
class DrawDrag  extends MouseAdapter implements MouseMotionListener
{ Frame f;int xp,yp;boolean fl;
  public DrawDrag()
{  xp=0;yp=0;fl=true;
   f=new Frame();f.setSize(300,400);f.addMouseMotionListener(this);f.addMouseListener(this);f.setVisible(true);
}
public void mouseMoved(MouseEvent e)
{}
public void mouseDragged(MouseEvent e)
{ int x=e.getX(),y=e.getY();
 if(fl)
 { xp=x;yp=y;fl=false;}
 Graphics g=f.getGraphics();
 g.drawLine(x,y,xp,yp);
 xp=x;  yp=y;
}  
public void mouseReleased(MouseEvent e)
{fl=true;}
public static void main(String args[]) 
  {DrawDrag d=new DrawDrag();}
}