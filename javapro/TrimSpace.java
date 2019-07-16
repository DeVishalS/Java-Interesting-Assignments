class TrimSpace
{
 public static void main(String args[])
 {
   args[0].trim();
   char arr[]=args[0].toCharArray();
   int n=arr.length;
   for(int i=0,c=0;i<arr.length;i++)
   { 
     if(arr[i]==' ')
     c++;
      if(c==1 && arr[i+1]!=' ')
      {c=0;continue;}
     if(c>1 && arr[i]!=' ')
     {
       n-=c-1;
       for(int j=i;j<arr.length;j++)
       arr[j-c+1]=arr[j];
       i=i-c;
       c=0;
       }
      
     }     
   String str;
   str=String.copyValueOf(arr,0,n);
   System.out.println(str);

}
}
   
   