import java.util.*;
class searchar
{
   public static void main (String args[])
   {
   int i,flag=0,pos=0;
   

   String str;
   System.out.println("enter the string");
   Scanner obj=new Scanner(System.in);
   str=obj.nextLine();
   int length=str.length();
   System.out.println("enter the character to be searched");
   String x=obj.next();
   for(i=0;i<=length-1;i++)
     {
        if(x.charAt(0)==str.charAt(i))
         {
           pos=i+1; 
           flag++;
          System.out.println("the character "+x+" is found at position "+pos);
         }
     }
   
      
 
    if(flag==0)
    System.out.println("the character is not there");
   }
}
