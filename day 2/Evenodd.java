import java.util.Scanner;
class Evenodd
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter a number:");
int number=s.nextInt();
if(number % 2==0)
{
 System.out.println("even");
}
else
{
System.out.println("odd");
}
}
}		