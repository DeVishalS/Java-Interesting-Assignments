import java.awt.*;
import java.applet.*;
 public class A extends Applet
{
 public void init()
 {
    Label l=new Label("Name :");
    add(l);
    TextField t=new TextField();
     add(t);
     Button b=new Button("Send");
     add(b);
    
  }
}