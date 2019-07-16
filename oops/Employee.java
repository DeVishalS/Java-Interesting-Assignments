class Employee
{
 String name;int age;float salary;
public Employee()
{
  name="Unknown";
  age=0;
salary=0;
}
public Employee(String n,int a,float s)
{
name=n;
    age=a;
  salary=s;
}
public Employee(Employee e)
{  name=e.name;
    age=e.age;
    salary=e.salary;
}

 public void read(String n,int a,float s)
 { name=n;
    age=a;
  salary=s;
 }
 public void show()
{ System.out.print("Name: "+name+" ,Age: "+age+" years, Salary: "+salary);
}
}



 