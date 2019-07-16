class Check4even
{
 public static void main(String args[])
 { 
   int a,b,c,d,ne=0;
   a=(int)(Math.random()*100);
   b=(int)(Math.random()*100);
   c=(int)(Math.random()*100);
   d=(int)(Math.random()*100);
    if(a%2==0)
     ne++;
    if(b%2==0)
     ne++;
    if(c%2==0)
     ne++;
    if(d%2==0)
     ne++;
     System.out.println("a="+a+"  b="+b+" c="+c+" d="+d+"  no of even no="+ne);
  }
} 
