/**
 * @(#)Notepad.java
 *
 * Notepad application
 *
 * @author Vishal Singh
 * @version 1.00 2015/3/29
 */
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Notepad extends WindowAdapter implements ActionListener,TextListener 
{
   Frame f;         MenuBar mb;       Menu m1,m2,m3;     boolean fo,fs,fn,fe,fw,sc;
   MenuItem nw,opn,sve,sves,ext,fnd,fndr;
   TextArea ta;  String file,name;
public Notepad()
{
	 f=new Frame("Flash Editor");  f.setSize(1366,768);  fo=false;fs=true;fn=false;
     mb=new MenuBar();fe=false;fw=false;sc=false;
     m1=new Menu("File");
     m2=new Menu("Edit");
     ta=new TextArea();ta.addTextListener(this);ta.setFont(new Font("",Font.PLAIN,20));
     nw=new MenuItem("New");nw.addActionListener(this);
     opn=new MenuItem("Open");opn.addActionListener(this);
     sve=new MenuItem("Save");sve.addActionListener(this);
     sves=new MenuItem("Save As");sves.addActionListener(this);
     ext=new MenuItem("Exit");ext.addActionListener(this);
     fnd=new MenuItem("Find");fnd.addActionListener(this);
     fndr=new MenuItem("Find and Replace");fndr.addActionListener(this);
     file="";name="";
     m1.add(nw);m1.add(opn);m1.add(sve);m1.add(sves);m1.addSeparator();m1.add(ext);
     m2.add(fnd);m2.add(fndr);
     mb.add(m1);mb.add(m2);
    f.setMenuBar(mb);f.add(ta); f.addWindowListener(this);
    f.setVisible(true);
}
public void textValueChanged(TextEvent e)
{ 
 fs=false; if("".equals(ta.getText()))fs=true;
 if(sc)fs=true;sc=false;
}
public void actionPerformed(ActionEvent e)
{
	
	switch(e.getActionCommand())
	{
	case "New": newf();break;
	case "Open":try{opens();}catch(Exception e1){}break;
	case "Save":try{saves();}catch(Exception e2){}break;
	case "Save As":try{saveAs();}catch(Exception e3){}break;
	case "Exit":exits();break;
	case "Find":finds();break;
	case "Find and Replace":findAndReplace();break;
	}
}
public void newf()
{  
  if(fs)
   { ta.selectAll();
     ta.replaceText("",ta.getSelectionStart(),ta.getSelectionEnd());
     	file="";name="";f.setTitle("Flash Editor");
   }else
    { fn=true;new SavePrompt(this);
    }
}
public void opens()throws IOException
{ 
  if(fs)
  {
  FileDialog fd=new FileDialog(f,"Select",FileDialog.LOAD);fd.setVisible(true);
  file=fd.getDirectory()+fd.getFile();name=fd.getFile();
  if(name==null)
  {throw new IOException();
  }
  DataInputStream dis=new DataInputStream(new FileInputStream(file));
  String s1="",s2="";
  if(name!=null)
  { 
  	f.setTitle(fd.getFile()+"- Flash Editor");
  	while((s1=dis.readLine())!=null)
   {s2+=s1;
   s2+="\n";}
   dis.close();sc=true;
   ta.setText(s2);
  }else { fs=false;}
  }
 else
 { fo=true;new SavePrompt(this);
  }
}
public void saves()throws IOException
{if(name==null||name.length()==0)
 {	FileDialog fd=new FileDialog(f,"Save File",FileDialog.SAVE);fd.setVisible(true);
	file=fd.getDirectory()+fd.getFile();
	name=fd.getFile();
	if(name==null){
		throw new IOException();
		}
	f.setTitle(name+"- Flash Editor");
 }
 else
 	 f.setTitle(name+"-Flash Editor");
 	 
	DataOutputStream dos=new DataOutputStream(new FileOutputStream(file));
	dos.writeBytes(ta.getText());
	dos.close();
 	fs=true;
}
public void saveAs() throws IOException
{
	FileDialog fd=new FileDialog(f,"Save As",FileDialog.SAVE);fd.setVisible(true);
	file=fd.getDirectory()+fd.getFile();name=fd.getFile();if(name==null)return;
	DataOutputStream dos=new DataOutputStream(new FileOutputStream(file));
	dos.writeBytes(ta.getText());
	dos.close();f.setTitle(name+"- Flash Editor");
	fs=true;
}
public void exits(){if(!fs){fe=true;new SavePrompt(this);}
	else{f.dispose();f.setVisible(false);System.exit(0);}
}
public void finds(){Finds ff=new Finds(ta,false,f);ff.disable();
}
public void findAndReplace(){new Finds(ta,true,f);
}
    
public void windowClosing(WindowEvent we)
{ if(fs)
	System.exit(0);
  else
  {fw=true;new SavePrompt(this);
  }
  if(fs)System.exit(0);
}
public static void main(String[] args) 
{
   Notepad n=new Notepad();
}
}