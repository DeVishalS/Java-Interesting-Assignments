import java.awt.*;
class Question
{
  public static void main(String args[])
  {
    Frame f=new Frame("Question");
    f.setSize(400,250);
    
   Panel p=new Panel();
   p.setLayout(new GridLayout(4,1));
   p.add(new Label("A."));
   p.add(new Label("B."));
   p.add(new Label("C."));
   p.add(new Label("D."));
   f.add(p,"West");
  
  Panel p1=new Panel();
  p1.setLayout(new GridLayout(1,4));
  p1.add(new Label());
  p1.add(new Button("Previous"));
  p1.add(new Button("Next"));
  p1.add(new Label());
  f.add(p1,"South");
  
  Panel p2=new Panel();
  p2.setLayout(new GridLayout(4,1));
  p2.add(new Checkbox("Jaipur"));
 p2.add(new Checkbox("Gandhinagar"));
 p2.add(new Checkbox("Bhopal"));
 p2.add(new Checkbox("Jodhpur"));
  f.add(p2);

f.add(new Label("Ques. 1 : What is the Capital of Rajasthan?"),"North");

 f.setVisible(true);
} 
}