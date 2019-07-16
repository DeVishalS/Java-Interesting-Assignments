class Primes
{ 
  public static void main(String args[])
   { int f;
outer: for(int i=2;i<=50;i++)
           {  f=0;
inner:     for(int j=2;j<=i;j++)
               { 
                  if(i%j==0 && i!=j)
                  { f=1;break inner;}
               }
            if(f!=1)
            System.out.print(i+" ");
           }
  }
}
            