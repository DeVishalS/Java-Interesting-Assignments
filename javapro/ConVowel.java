class ConVowel
{
 public static void main(String args[])
 {
    args[0].trim();int v=0,c=0;
    char arr[]=args[0].toCharArray();
    for(int i=0;i<arr.length;i++)
    {  int a=0;
          if((arr[i]>64 && arr[i]<91 )||(arr[i]>96 && arr[i]<123))
          {  
           if((a=arr[i]-96)<0)
           a=arr[i]-64;
           if(a==1||a==5||a==9||a==15||a==25)
           v++;
           else
           c++;
         }
    }System.out.print("  Vowel  :"+v+"   Consonant  :"+c);
  }
} 