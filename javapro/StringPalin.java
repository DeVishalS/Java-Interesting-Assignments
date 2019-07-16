class StringPalin
{
  public static void main(String args[])
  { 
    char sent[],ch;
    int f=1;
    if(args.length!=0)
    {
    sent=args[0].toCharArray();
   l1: for(int i=0;i<sent.length/2;i++)
    { 
      if(sent[i]!=sent[sent.length-i-1])
      { f=0;break l1;}
    }
   if(f==1)
  System.out.print("Palindrome");
   else
   System.out.print("Not Palindrome");
  }
 else
  System.out.print("Sorry ! Try again Specify some sentence");
}
}