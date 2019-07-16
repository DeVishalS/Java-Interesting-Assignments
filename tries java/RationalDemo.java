class RationalDemo
{
 public static void main(String args[])
 {   Rational r1=new Rational();
      Rational r2=new Rational(3,4);
      Rational r3=new Rational(5,6);
      Rational r4=new Rational(7,8);
Rational ra,rs,rm,rd;
ra=r2.add(r3);System.out.print("Addition : ");ra.show();
rs=r2.sub(r1);System.out.print("Subtraction : ");rs.show();
rm=r2.multiply(r1);System.out.print("Multiplication : ");rm.show();
rd=r2.divide(r1);System.out.print("Division : ");rd.show();
 }
}