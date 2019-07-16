class Length
{
 public static void main(String args[])
 {
   int i,n,ml=1,pn=0,l=0;
  for(i=0;i<10;i++)
  {
     n=(int)(Math.random()*100);                 //17 97 17 38 67 76 36 62 17 74 2
     System.out.print(n+" ");
     if(n>pn)
     l++;
     else
     l=1;
     if(l>ml)
     ml=l;
     pn=n;
  }
System.out.println("Maximaum Length of series: "+ml);
}
}
     
