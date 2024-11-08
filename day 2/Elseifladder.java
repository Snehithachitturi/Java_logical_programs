import java.util.Scanner;
class Elseifladder
{
public static void main(String args[])
 {
   Scanner s = new Scanner(System.in);
   int a=2; 
   int b=4; 
   int c=6;
   if(a>b && a>c)
   {
     System.out.println("a is big");
   }
  else if(b>a && b>c)
   {
     System.out.println("b is big");
    }
   else
   {
    System.out.println("c is big");
   }
   }
   }