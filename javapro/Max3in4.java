class Max3in4
{
 public static void main(String args[])
 {
   int a,b,c,d,max,smax;
   a=(int)(Math.random()*100);
   b=(int)(Math.random()*100);
   c=(int)(Math.random()*100);
   d=(int)(Math.random()*100);
   if(a>b)
   {max=a;smax=b;}
   else{max=b;smax=a;}
    
   if(c>max)
   {smax=max;max=c;}
   else
   { if(smax<c) smax=c;}
   
   if(d>max)
   {smax=max;max=d;}
   else
   { if(smax<d) smax=d;}
   System.out.println("a="+a+" b="+b+" c="+c+" d="+d+"   3rd maximum="+smax);
 }
}
     

  

