import java.awt.Frame;
import java.awt.event.*;
import java.awt.*;
public class Prompt extends WindowAdapter implements ActionListener 
{
 Dialog p;
 public Prompt(Dialog ff,String str)
 { 
	p=new Dialog(ff,str,true);p.setLocation(300,300); p.setLayout(new GridBagLayout());
	p.setSize(500,100);Label l=new Label(str);p.setResizable(false);
	Button b=new Button("Ok");
	b.addActionListener(this);GridBagConstraints gbc=new GridBagConstraints();
	l.setFont(new Font("",Font.PLAIN,25));
	p.add(l,gbc);p.add(b,gbc);p.setVisible(true);p.addWindowListener(this); 
 }
 public void actionPerformed(ActionEvent e)
 { p.dispose();p.setVisible(false);
 	}
public void windowClosing(WindowEvent e)
{
 Window w=e.getWindow();
 w.dispose();
 w.setVisible(false);
}
}
