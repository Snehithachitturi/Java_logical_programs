import java.util.Scanner;
class Factorial
{
Scanner sc=new Scanner(System.in);
int i=1,n,sum=1;
void fact(){
System.out.print("Enter the value of n:");
n=sc.nextInt();
while(i<=n)
{
sum=sum*i;
i++;
System.out.println("The Factorial value is :"+sum);
}
}
}
class Factors
{
public static void main(String[]args)
{
Factorial f1=new Factorial();
f1.fact();
}
}