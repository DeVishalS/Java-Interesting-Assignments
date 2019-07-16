class Rational
{
 int nume,deno;
 public Rational()
{  nume=0;
   deno=1;
}
public Rational(int n,int d)
{
 if(d!=0)
 {  nume=n; deno=d;}
 else
 {System.out.println(" Denominator can not be zero! ! ! INVALID");}  
}
public Rational(Rational r)
{ nume=r.nume;
  deno=r.deno;
}
public Rational(int n)
{
 this(n,1);
}
 public void set(int n,int d)
 { nume=n;
   deno=d;
 }
  public void show()
 { 
   if(this!=null)
   System.out.println("No is: "+nume+"/"+deno);
 }
public Rational add(Rational r)
{  Rational temp=new Rational();
   temp.nume=nume*r.deno+deno*r.nume;
   temp.deno=deno*r.deno;
   return temp;
}
public Rational sub(Rational r)
{ Rational temp=new Rational();
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
   return temp;}
   else return null;
}
 
   
   
}
 