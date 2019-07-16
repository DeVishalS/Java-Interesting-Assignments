import java.awt.*;
import java.awt.event.*;
class CardView implements ActionListener
{
 CardLayout cl;Frame f;Panel p1,p2,p[];Button b1,b2;Label l[][];TextField t[][];
 public CardView()
{
 Frame f=new Frame("CardView");
 f.setSize(400,300);
 p1=new Panel();p1.setLayout(new GridLayout(1,4));
 b1=new Button("Back");b2=new Button("Next");b1.addActionListener(this);b2.addActionListener(this);
 p1.add(new Label());p1.add(b1);p1.add(b2);p1.add(new Label());
f.add(p1,"South");
cl=new CardLayout(); 
 p2=new Panel();p2.setLayout(cl);

 p=new Panel[4];t=new TextField[4][4];l=new Label[4][4]; GridBagLayout gbl=new GridBagLayout();GridBagConstraints gbc=new GridBagConstraints();
 String arr[][]={{"Name","Surname","Age","Qualification"},{"H.N.","Colony","City","State"},{"Phone","Mobile","Email","Fax"},{"Salary","T.A","D.A","H.R.A."}};
 int j=0;
for(int i=0;i<4;i++)
 { p[i]=new Panel();p[i].setLayout(gbl);
   for(gbc.gridy=0,j=0;j<4;j++,gbc.gridy++)
   { t[i][j]=new TextField(25);l[i][j]=new Label(arr[i][j]);
      gbc.gridx=0 ;p[i].add(l[i][j],gbc);
         gbc.gridx=1;p[i].add(t[i][j],gbc);
   }
p2.add(p[i]);
 }
f.add(p2);
f.setVisible(true);
}
public  void actionPerformed(ActionEvent e)
{  
   if(e.getSource()==b1)
   cl.previous(p2);
   else
   cl.next(p2);
}
public static void main(String args[])
{
CardView cv=new CardView();
}
}  
       
   

 


