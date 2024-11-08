import java.util.Scanner;
class Nestedif
{
public static void main(String args[])
 {
   Scanner s = new Scanner(System.in);
   int a=2; 
   int b=5; 
   int c=6;
   if(a>b)
   {
   if(a>c)
   {
     System.out.println("a is big");
   }
  else
   {
     System.out.println("c is big");
    }
    }
   else
    {
   if(b>c)
   {
    System.out.println("b is big");
   }
  else
   {
    System.out.println("c is big");
   }
   }
   }
   }

