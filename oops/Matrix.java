class Matrix
{
   int arr[][];
    public Matrix()
    { arr=new int[3][3];}
    public Matrix(int r,int c)
    { arr=new int[r][c];}
    public Matrix(Matrix m)
    { arr=new int[m.arr.length][m.arr[0].length];}
    public void matrixsize()
   { System.out.println("Size Of Matrix :"+arr.length+"x"+arr[0].length);}
     public void show()
   { for(int i=0;i<arr.length;i++)
       {for(int j=0;j<arr[i].length;j++)
         System.out.print(" "+arr[i][j]);
        System.out.println();}
    }  
 }

     
   
