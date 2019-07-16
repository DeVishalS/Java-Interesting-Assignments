package a.b;
import a.b.c.Person;
public class  ContactInfo extends Person
{
  protected String phone;
  public ContactInfo()
  {
   phone="Unknown";  
  }
  public ContactInfo(String n,String s,String p)
  { 
   super(n,s);
   phone=p; 
  }
  public ContactInfo(ContactInfo c)
  {
  super(c); 
  phone=c.phone; 
  }
}