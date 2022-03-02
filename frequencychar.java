import java.util.*;
class frequencychar
{
   public static void main (String args[])
   {
   int i,count=0;
   

   String str;
   System.out.println("enter the string");
   Scanner obj=new Scanner(System.in);
   str=obj.nextLine();
   int length=str.length();
   System.out.println("enter the character whose frequency to be checked");
   String x=obj.next();
   for(i=0;i<=length-1;i++)
     {
        if(x.charAt(0)==str.charAt(i))
         {
           count++;
         }
     }

   
      
 
    if(count==0)
    System.out.println("the character is not there");
    else
     System.out.println("the frequency of the character is:"+count);
   }
}
