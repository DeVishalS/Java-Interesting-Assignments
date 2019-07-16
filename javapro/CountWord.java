class CountWord
{
  public static void main(String args[])
  {  int w=1;
    char sent[],ch;
    System.out.print("The no of Words in the sentence:");
    if(args.length!=0)
    {
    args[0]=args[0].trim();
    sent=args[0].toCharArray();
    for(int i=0;i<sent.length;i++)
    { 
      ch=sent[i];
      if(ch==' ')
      w++;
    }
  System.out.print("Words in :\""+args[0]+"\":"+w);
  }
 else
  System.out.print("Sorry ! Try again Specify some sentence");
}
}