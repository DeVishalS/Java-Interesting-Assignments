class Max4
{
 public static void main(String args[])
 {
    int a,b,c,d,min,max;
    a=(int)(Math.random()*100);
    b=(int)(Math.random()*100);
    c=(int)(Math.random()*100);
    d=(int)(Math.random()*100);
    if(a>b)
    { max=a;min=b; }
    else
   {max=b;min=a;}
      if(max<c)
      max=c;
      if(min>c)
      min=c;
      if(max<d)
      max=d;
      if(min>d)
      min=d;
   System.out.println("a="+a+" b="+b+" c="+c+" d="+d+"  maximum="+max+"minimum"+min);
   }
}     
        