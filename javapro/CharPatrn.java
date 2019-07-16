class CharPatrn
{ 
  public static void main(String args[])
  {  
   for(int i=0;i<args[0].length();i++,System.out.println())
      for(int j=0;j<args[0].length();j++)
      System.out.print(" "+args[0].charAt((i+j)%args[0].length()));
}
}