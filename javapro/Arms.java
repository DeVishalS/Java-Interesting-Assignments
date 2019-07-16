class Arms
{ 
  public static void main(String args[])
  {
    int n,a,s,i;
    for(i=1;i<=371;i++)
     {  n=i;s=0;
         while(n>0)
         {
             a=n%10;
              s+=a*a*a;
             n=n/10;
         }
           if(s==i)
          System.out.print(" "+i+" ");
      }
 }
}


               
       
