import java.awt.*;
class NamePwd
{
 public static void main(String args[])
 {
    Frame f=new Frame("REGISTER");
    f.setSize(400,350);
f.setLayout(new GridBagLayout());
    GridBagConstraints gbc=new GridBagConstraints();
    
gbc.gridx=0;gbc.gridy=0;
  System.out.print(gbc.weightx);
    f.add(new Label("Name:"),gbc);
    
gbc.gridx=1;
    f.add(new TextField(30),gbc);
    
gbc.gridx=0;gbc.gridy=1;
    f.add(new Label("Password:"),gbc);
    
gbc.gridx=1;
    f.add(new TextField(30),gbc);
    
gbc.gridx=0;    gbc.gridy=2;       gbc.gridwidth=2;
    f.add(new Button("OK"),gbc);
    f.setVisible(true);
    }
}


