import java.util.*;
class tracemat
{
   public static void main (String args[])
   {
   int r,c,i,j,x=0;
 int a[][] = new int [50][50];

 System.out.println("enter the no. of rows and columns of the matriX");
 Scanner obj=new Scanner(System.in);
 r=obj.nextInt(); 
 c=obj.nextInt(); 
 System.out.println("enter the elements in matrix A:\n");
   for(i=0;i<r;i++)
      for(j=0;j<c;j++)
      a[i][j]=obj.nextInt();

 System.out.print("the trace of the matrix A is:");
   for(i=0;i<r;i++)
      for(j=0;j<c;j++)
       if(i==j)
       x=x+a[j][i];
      
      System.out.println(x);
    
  }
}
