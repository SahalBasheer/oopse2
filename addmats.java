import java.util.*;
class addmats
{
   public static void main (String args[])
   {
   int r,c,i,j;
 int a[][] = new int [50][50];
 int b[][] = new int [50][50];
 int x[][] = new int [50][50];
 System.out.println("enter the no. of rows and columns of both matrices");
 Scanner obj=new Scanner(System.in);
 r=obj.nextInt(); 
 c=obj.nextInt(); 
 System.out.println("enter the elements in matrix A:\n");
   for(i=0;i<r;i++)
      for(j=0;j<c;j++)
      a[i][j]=obj.nextInt();

System.out.println("enter the elements in matrix B:\n");
   for(i=0;i<r;i++)
      for(j=0;j<c;j++)
      b[i][j]=obj.nextInt();

 System.out.println("the sum of 2 matrices is:\n");
   for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
       {
       x[i][j]=a[i][j]+b[i][j];
       System.out.print(x[i][j]+"  ");
       }
      System.out.println("\n");
    }
  }
}
