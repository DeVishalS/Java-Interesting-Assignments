import java.io.*;
class Rational implements Serializable
{
  int nume,deno;
  public Rational()
  {  nume=0;
     deno=1;
  }
  public Rational(int n,int d)
  {
   if(d==0)
   { System.out.println("Denominator can't be zero,So the demominator is considered 1 for the object !!!");d=1;}
   if(deno<0)
   { d*=-1;n*=-1;}
    nume=n;
    deno=d;
  }
  public Rational(Rational r)
  {  this(r.nume,r.deno);
  }
  public void set(int n,int d)
  {  nume=n;deno=d;
     if(deno==0)
     {System.out.println("Denominator cant be zero,So the demominator is set to 1 ");deno=1;}
   }
  public void show()
  { 
   System.out.println("No is: "+nume+"/"+deno);
  }
  public Rational add(Rational r)
  {   Rational temp=new Rational();
      temp.nume=nume*r.deno+deno*r.nume;
      temp.deno=deno*r.deno;
      return temp;
  }
  public Rational sub(Rational r)
  {  Rational temp=new Rational();
     temp.nume=nume*r.deno-deno*r.nume;
     temp.deno=temp.deno=deno*r.deno;
     return temp;
  } 
  public Rational multiply(Rational r)
  {  Rational temp=new Rational();
     temp.nume=nume*r.nume;
     temp.deno=deno*r.deno;
     return temp;
  }
  public Rational divide(Rational r)
  {
      Rational temp=new Rational();
      if(r.nume!=0)
      {temp.nume=nume*r.deno;
       temp.deno=deno*r.nume;
      }
     else
      { System.out.println("Division not possible(Denominator=0),Result is set with value (0,1)");}
      return temp;
  } 
public String toString()
{
 return "The no is"+nume+"/"+deno;
}  
}
 