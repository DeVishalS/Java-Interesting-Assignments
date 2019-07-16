class Nooccur
{ 
 public static void main(String args[])
 {
   int a,b,aa,r,count=0;
  a=(int)(Math.random()*100000);aa=a;
  b=(int)(Math.random()*10);
  while(a>0)
  {
    r=a%10;
     if(r==b)
     count++;
     a=a/10;
   }
    if(count==0)
    System.out.println("The no: '"+b+"' not occured in no :'"+aa+"'");
    else
    System.out.println("The no: '"+b+"' occured "+count+" times in no :'"+aa+"'");
  }
}
     