class Factorial
{
 public static void main(String args[])
 {
    int f=1;int n;
    n=(int)(Math.random()*10);
    for(int i=2;i<=n;i++)
    { f*=i;}
   System.out.println("Factorial of "+n+" is "+f);
 }
}

 
 