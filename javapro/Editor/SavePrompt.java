import java.awt.*;
import java.awt.event.*;
public class SavePrompt implements ActionListener{
    Dialog d;Notepad n;
    public SavePrompt(Notepad nn) {
    	n=nn;
    	d=new Dialog(n.f,"Do you Want to Save the File?",true);
    	d.setLocation(400,400);d.setSize(400,100);
        d.setLayout(new GridBagLayout());
        GridBagConstraints gbc=new GridBagConstraints(); 
    Button b1,b2,b3;
    b1=new Button("Yes");b1.addActionListener(this);
    b2=new Button("No");b2.addActionListener(this);
    b3=new Button("Cancel");b3.addActionListener(this);
    gbc.gridx=0;gbc.gridy=0;d.add(b1,gbc);
    gbc.gridx=1;d.add(b2,gbc);
    gbc.gridx=2;d.add(b3,gbc);d.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    { String s=ae.getActionCommand();
    	if(s.equals("Cancel"))
    	{d.dispose();d.setVisible(false);n.fn=false;n.fo=false;n.fe=false;n.fw=false;
    	}
      	else
    	{if(s.equals("Yes"))
    	  { try{n.saves();}catch(Exception ee){d.setVisible(false);d.dispose(); return;}
    	   }
    	 else
    	 {n.fs=true;}
    	 if(n.fn){n.fn=false;n.newf();}
    	 if(n.fo){n.fo=false;try{ n.opens();}catch(Exception ee1){d.setVisible(false);d.dispose(); return;}}
    	 if(n.fe){n.fe=false;n.exits();}
    	 if(n.fw){}
    	 }
    	 d.setVisible(false);d.dispose();
    }
}