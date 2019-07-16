import java.util.*;

class Mul
{
 public static void main(String args[])
{
 int i,j,k;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the size of square array");
 int n=sc.nextInt();
int a[][]=new int[n][n];
int b[][]=new int[n][n];
int mul[][]=new int[n][n];int add[][]=new int[n][n];int sub[][]=new int[n][n];
 System.out.print("Enter array A");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
 {a[i][j]=sc.nextInt();}
}
 System.out.print("Enter array B");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
 {b[i][j]=sc.nextInt();
}
}
for(i=0;i<n;i++)
{
 for(j=0;j<n;j++)
{ mul[i][j]=0;
 for(k=0;k<n;k++)
{
res[i][j]+=a[i][k]*b[k][j];
}
}
}
 
System.out.println("THe addition as follows::");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
 System.out.println(res[i][j]);
}
}
}
