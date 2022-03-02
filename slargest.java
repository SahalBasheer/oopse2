import java.util.*;
class slargest
{
   public static void main (String args[])
   {
   int n,max=0,max2=0,i;
 int a[] = new int [100];
 System.out.println("enter the no. of elements in an array ");
 Scanner obj=new Scanner(System.in);
 n=obj.nextInt(); 
 System.out.println("enter the elements in array ");
   for(i=0;i<n;i++)
      a[i]=obj.nextInt();
  max=a[0];
 for(i=0;i<n;i++)
 if(max<a[i])
     max=a[i];
for(i=0;i<n;i++)
 if(max2<a[i] && a[i]<max)
     max2=a[i];

      System.out.println(" 2nd largest element in array is "+max2);
    }   
}
