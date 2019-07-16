class MatrixDemo
{
   public static void main(String args[])
   { Matrix m1=new Matrix();
     System.out.print("First Matrix: ");
     m1.matrixsize();
     m1.show();

     Matrix m2=new Matrix(5,6);
     System.out.print("Second Matrix: ");
     m2.matrixsize();
m2.show();
 
     Matrix m3=new Matrix(m2);
     System.out.print("Third Matrix: ");
     m3.matrixsize();
m3.show();
}
}