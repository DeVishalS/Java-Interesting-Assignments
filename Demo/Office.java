import a.Employee;
class Office
{
 public static void main(String args[])
 {
   Employee e1=new Employee();
   System.out.println("First employee:");
   e1.show();
    Employee e2=new Employee("Vishal","Singh","9782993443",35000.00f);
   System.out.println("Second employee:");
   e2.show();
   Employee e3=new Employee(e2);
   System.out.println("Third employee:");
   e3.show();
 }
}
