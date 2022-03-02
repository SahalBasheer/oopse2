import java.util.*;
class strgpali
{
   public static void main (String args[])
   {
   int i;

 String str,rev="";
 System.out.println("enter the string");
 Scanner obj=new Scanner(System.in);
str=obj.nextLine();
int length=str.length();

   for(i=length-1;i>=0;i--)
      rev=rev+str.charAt(i);
if(str==rev)
 System.out.println("the string is not palindrome\n");
else
 System.out.println("the string is palindrome\n");
 
    }
}
