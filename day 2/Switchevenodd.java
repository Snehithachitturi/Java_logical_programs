import java.util.Scanner;
class Switchevenodd
{
public static void main(String args[])
 {
   Scanner s = new Scanner(System.in);
   int a=0; 
   switch(a%2)
   {
case 0:
     System.out.println("even");
break;
  case 1:
     System.out.println("odd");
break;
default:
     System.out.println("invalid");
}
}
}