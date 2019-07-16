package a.b.c;
public class  Person
{
  protected String name;
protected String surname;
  public Person()
  {
     surname=name="Unknown";
  }
  public Person(String n,String s)
  {
     name=n;
     surname=s;
  }
  public Person(Person p)
  {
    name=p.name;
    surname=p.surname;
  }
}