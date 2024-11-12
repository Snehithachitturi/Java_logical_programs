import java.util.Scanner;
class CheckLeapYearOrNot
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
System.out.println("Enter year");
a=sc.nextInt();
if(a%400==0)
{
System.out.println("The given year is leap year:");
}
else
{
System.out.println("The given year is not leap year:");
}
}
}