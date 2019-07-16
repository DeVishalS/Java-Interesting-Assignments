class Pattern 
{
 public static void main(String args[])
 {
  int i,j,n,sv;
  n=(int)(Math.random()*10);
  for(i=1;i<=n;i++)
  {  sv=1;
    for(j=1;j<=n+i-1;j++)
    { 
      if(j>=n-i+1)
       {  if(j<n)
            {System.out.print(sv);sv++;}
          else if(j==n)
            {System.out.print(sv);} 
          else
            { sv--;System.out.print(sv);}    
        }
       else
       { System.out.print(" ");}
    }
  System.out.println();
 }
}
}
