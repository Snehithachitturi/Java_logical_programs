import java.util.Scanner;
class SumOfFirstandLastDigitsOfaNumber
{
public static void main(String args[])
{
int n,fd,ld,sum;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a two digit number");
n=sc.nextInt();
fd=n/10;
ld=n%10;
sum=fd+ld;
System.out.println("First digit=" + fd);
System.out.println("Last digit=" + ld);
System.out.println("Sum of first and last digit=" + sum);
}
}