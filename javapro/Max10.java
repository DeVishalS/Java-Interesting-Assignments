class Max10
{
  public static void main(String args[])
 { int n,max=-1,min=1000;
     for( int i=0;i<10;i++)
     {
       n=(int)(Math.random()*1000);
      System.out.print(" "+n+" "); 
      if(max<n)
       max=n;
       if(min>n)
       min=n;
     }
System.out.println("max: "+max+"   Min: "+min);
}
}
       
       
    
    
 