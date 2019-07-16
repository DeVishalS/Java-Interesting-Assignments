class Gcd 
{
 public static void main(String args[])
 {   
    int a,b,gcd=1,t,aa,bb;
    a=(int)(Math.random()*100);aa=a;
    b=(int)(Math.random()*100);
    bb=b;
    if(a!=0 && b!=0)
    {
      while(a%b!=0)
      {  
       t=a%b;
       a=b;
       b=t;
      }
      System.out.println("Gcd of "+aa+" & "+bb+" is "+b);
    }
   else
System.out.println("Math error 0 can't be in any gcd set");
 }
}
        
 