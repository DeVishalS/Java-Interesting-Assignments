class Spalin
{ 
  public static void main(String args[])
  {
    int n,a,s,i;
    for(i=1;i<=150;i++)
     {  n=i;s=0;
         while(n>0)
         {
             a=n%10;
              s=s*10+a;
             n=n/10;
         }
           if(s==i)
          {  n=i*i;s=0;
             while(n>0)
             {
             a=n%10;
              s=s*10+a;
             n=n/10;
            }
             if(s==i*i)
            System.out.print(" "+i+" ");
            }
      }
 }
}


               
       
