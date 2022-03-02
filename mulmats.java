import java.util.*;
class mulmats
{
   public static void main (String args[])
   {
   int r1,c1,c2,r2,i,j,k;
 int a[][] = new int [50][50];
 int b[][] = new int [50][50];
 int x[][] = new int [50][50];
 System.out.println("enter the no. of rows and columns of matrix A");
 Scanner obj=new Scanner(System.in);
 r1=obj.nextInt(); 
 c1=obj.nextInt(); 
 System.out.println("enter the elements in matrix A:\n");
   for(i=0;i<r1;i++)
      for(j=0;j<c1;j++)
      a[i][j]=obj.nextInt();

System.out.println("enter the no. of rows and columns of matrix B");
 r2=obj.nextInt(); 
 c2=obj.nextInt(); 

if(r1==c2 && c1==r2)
{
System.out.println("enter the elements in matrix B:\n");
   for(i=0;i<r2;i++)
      for(j=0;j<c2;j++)
      b[i][j]=obj.nextInt();


 for(i=0;i<r1;i++)
      for(j=0;j<c1;j++)
         for(k=0;k<c2;k++)
             x[i][j]=x[i][j]+(a[i][k]*b[k][j]);

 System.out.println("the multiplication of 2 matrices is:\n");
   for(i=0;i<r1;i++)
    {
      for(j=0;j<c2;j++)
       {
       System.out.print(x[i][j]+"  ");
       }
      System.out.println("\n");
    }
   }
else
System.out.println("the matrices cant be multiplied\n");

  }
}
