import java.util.Scanner;

class Vowel 
{
  public static void main(String args[])
 {
   Scanner s = new Scanner(System.in);
   System.out.print("Enter a character: ");
   char ch = s.next().charAt(0); 
   if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
   {
     System.out.println("Vowel");
   }
   else
   {
    System.out.println("Consonant");
    }
    }
    }