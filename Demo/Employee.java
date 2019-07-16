package a;
import a.b.ContactInfo;
public class  Employee extends ContactInfo 
{
  private float salary;
  public Employee()
  {
   salary=0.0f;  
  }
  public Employee(String n,String su,String p,float s)
  {
  super(n,su,p); 
  salary=s;
  }
  public Employee(Employee e)
  {
    super(e);
    salary=e.salary;
  }
  public void show()
  {
   System.out.println("Name : "+name+" "+surname+"  Phone :"+phone+" Salary: "+salary);
  }
}