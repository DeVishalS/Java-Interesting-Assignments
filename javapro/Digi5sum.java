class Digi5sum
{
 public static void main(String args[])
  {
    int n,nn,sum,a;
    n=(int)(Math.random()*100000);
    nn=n;
    for(sum=0;n>0;)
    {
      a=n%10;
      sum+=a;
      n=n/10;
    }
 System.out.println("Digit: "+nn+" Sum of digits: "+sum);
}
}
     
     
