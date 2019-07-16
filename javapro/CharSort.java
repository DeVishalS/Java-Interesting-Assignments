class CharSort
{ 
  public static void main(String args[])
  {  String s;
   for(int i=0;i<args.length;i++)
      for(int j=i+1;j<args.length;j++)
      {if(args[i].compareTo(args[j])>0)
     { s=args[i];args[i]=args[j];args[j]=s;}}
 for(int i=0;i<args.length;i++)
 System.out.println(" "+args[i]);  
}
}