class Apowerb
{
 public static void main(String args[])
 {
   int a,b,aa,bb;
a=(int)(Math.random()*10);
aa=a;
b=(int)(Math.random()*10);
bb=b;
if(a==0)
{  
  if(b==0)
     System.out.println("Invalid Set (0,0) MATH ERROR");
  else 
     a=0;
}
else
{
  if(b==0) 
    a=1;
  else
    {
      while(b>1)
      {
      a*=aa;
       b--;
      }
    }
}
System.out.println(aa+" power "+bb+"="+a);
}
}
