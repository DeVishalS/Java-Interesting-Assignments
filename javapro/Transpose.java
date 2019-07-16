class Transpose
{  public static void main(String args[])
   {    int a[][]=new int[][]{{1,2,3,33},{4,5,6,66},{7,8,9,99},{10,11,22,40}};

       for(int i=0;i<a.length;i++)         
              {for(int j=0;j<a[i].length;j++)
               {  System.out.print(" "+a[i][j]); }   
                  System.out.println();}                             
for(int i=0;i<a.length;i++)              
for(int j=i,temp=0;j<a[i].length;j++)                                               
             {  temp=a[i][j];
                a[i][j]=a[j][i];
                  a[j][i]=temp;
            }    
       for(int i=0;i<a.length;i++)         
              {for(int j=0;j<a[i].length;j++)
               {  System.out.print(" "+a[i][j]); }   
                  System.out.println();}           } 
}

