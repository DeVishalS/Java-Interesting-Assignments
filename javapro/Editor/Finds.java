import java.awt.*;
import java.awt.event.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Finds implements ActionListener,TextListener
{
 Dialog f1;  Button b1,b2,b3,b4;  TextField tf,tr;  TextArea ts;  boolean r,s;Frame ft;
  public Finds(TextArea t,boolean b,Frame ff)
  {  ft=ff;s=false;
  	f1=new Dialog(ff,"Find");f1.setSize(600,200);f1.setLocation(500,400);f1.setLayout(new GridBagLayout());
    GridBagConstraints gbc=new GridBagConstraints();ts=t;r=b;
    b1=new Button("Find Next"); b2=new Button("Replace"); b3=new Button("Replace All");b4=new Button("Close");tf=new TextField(20);tr=new TextField(20);
    b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);b4.addActionListener(this);tf.addTextListener(this); //tr.addTextListener(this);
    gbc.gridx=0;gbc.gridy=0;gbc.gridwidth=2;gbc.gridheight=2;f1.add(new Label("Find What"),gbc);
    gbc.gridx=2;f1.add(tf,gbc);
    gbc.gridx=0;gbc.gridy=2;f1.add(new Label("Replace With"),gbc);
    gbc.gridx=2;f1.add(tr,gbc);
    gbc.gridx=0;gbc.gridy=4;gbc.gridwidth=4;Panel p=new Panel();p.setLayout(new GridLayout(1,4)); 
    p.add(b1);
    p.add(b2);
    p.add(b3);
    p.add(b4);
    f1.add(p,gbc);disable();
    if(!r)tr.setEnabled(false);
    f1.addWindowListener(new WindowAdapter()
                         { public void windowClosing(WindowEvent e)
                              { Window w1=e.getWindow();
                                w1.setVisible(false);w1.dispose();} }
                        );
   
    f1.setVisible(true);
   }
public void textValueChanged(TextEvent te)
{ if(!r)
   if(!("".equals(tf.getText())))b1.setEnabled(true);else b1.setEnabled(false);
  else
   if(!("".equals(tf.getText()))){b1.setEnabled(true);b2.setEnabled(true);b3.setEnabled(true);}
   else disable();
}
public void disable()
{
 b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);
}
public void findsNext(TextArea t)
{  Pattern  p=Pattern.compile("\\b"+tf.getText()+"\\b"); 
   Matcher m=p.matcher(t.getText());
   try{
        m.find(t.getSelectionEnd());
        t.select(m.start(),m.end());ft.setVisible(true);s=true;
      }
   catch(Exception e)
   { s=false;
     new Prompt(f1,"No more matches after the cursor"); 
   }
}
public void replacesAll(TextArea t)
{  Pattern  p=Pattern.compile("\\b"+tf.getText()+"\\b"); 
   Matcher m=p.matcher(t.getText());
   t.setText(m.replaceAll(tr.getText()));
}
public void closes()
{ f1.dispose();
  f1.setVisible(false);
}
public void replaces(TextArea t)
{ if(!s)findsNext(t);
  else
  {ts.replaceText(tr.getText(),t.getSelectionStart(),t.getSelectionEnd());
   t.setCaretPosition(t.getSelectionEnd());s=false;
  }
} 
public void actionPerformed(ActionEvent e3)
{ switch(e3.getActionCommand())
  {   case "Find Next":findsNext(ts);break;
      case "Replace":replaces(ts);break;
      case "Replace All":replacesAll(ts);break;
      case "Close":closes();break;
  } 
}
}